package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class nu extends EditTextBoldCursor implements org.telegram.ui.ActionBar.u4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final int f27414b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.a2 creationLinkDialog;
    private lu delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.c6 resourcesProvider;
    private i11 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public nu(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = c6Var;
        this.quoteColor = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sc, c6Var);
        addTextChangedListener(new di.h2(this, 6));
        setClipToPadding(true);
    }

    public static void i(nu nuVar) {
        nuVar.creationLinkDialog = null;
        nuVar.requestFocus();
    }

    public static void j(nu nuVar, int i10, int i11, int i12, int i13) {
        Editable text = nuVar.getText();
        ?? obj = new Object();
        obj.f28163a |= 128;
        obj.f28164b = i10;
        obj.f28165c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new t10(text.subSequence(i10, i11).toString(), obj, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        lu luVar = nuVar.delegate;
        if (luVar != null) {
            luVar.p();
        }
    }

    public static void k(nu nuVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = nuVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof b6) && !(characterStyle instanceof sj0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i10) {
                        text.setSpan(characterStyle, spanStart, i10, 33);
                    }
                    if (spanEnd > i11) {
                        text.setSpan(characterStyle, i11, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(nuVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        lu luVar = nuVar.delegate;
        if (luVar != null) {
            luVar.p();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12 && i11 < (min = Math.min(i12, text.length()))) {
            ?? obj = new Object();
            obj.f28163a = i10;
            MediaDataController.addStyleToText(new r11(obj, 0), i11, min, text, true);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            lu luVar = this.delegate;
            if (luVar != null) {
                luVar.p();
            }
        }
    }

    public boolean closeCreationLinkDialog(boolean z10) {
        org.telegram.ui.ActionBar.a2 a2Var = this.creationLinkDialog;
        if (a2Var != null && a2Var.isShowing()) {
            if (z10) {
                this.creationLinkDialog.dismiss();
                return true;
            }
            return true;
        }
        return false;
    }

    public s61 createUrlSpan(String str) {
        return new s61(str, null);
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.allowTextEntitiesIntersection;
    }

    public String getCaption() {
        return this.caption;
    }

    public int getCurrentStyle(int i10, int i11) {
        Editable text = getText();
        int i12 = 0;
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i10);
        int min = Math.min(i11, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        r11[] r11VarArr = (r11[]) text.getSpans(max, min, r11.class);
        int[] iArr = STYLE_FLAGS;
        int length = iArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = iArr[i13];
            int i16 = max;
            int i17 = 1;
            while (i17 != 0 && i16 < min) {
                i17 = i12;
                int i18 = i17;
                while (i18 < r11VarArr.length) {
                    r11 r11Var = r11VarArr[i18];
                    int i19 = r11Var.f28400b.f28163a;
                    int i20 = i12;
                    if ((i19 & 512) != 0) {
                        i19 |= 256;
                    }
                    if ((i19 & i15) != 0) {
                        int spanStart = text.getSpanStart(r11Var);
                        int spanEnd = text.getSpanEnd(r11VarArr[i18]);
                        if (spanStart <= i16 && spanEnd > i16) {
                            i17 = 1;
                            i16 = spanEnd;
                        }
                    }
                    i18++;
                    i12 = i20;
                }
            }
            int i21 = i12;
            if (i16 >= min) {
                i14 |= i15;
            }
            i13++;
            i12 = i21;
        }
        return i14;
    }

    public boolean isNearRightCaption(int i10) {
        Layout layout = getLayout();
        if (layout == null || layout.getLineCount() <= 0 || (layout.getLineCount() <= 1 && layout.getLineRight(0) + i10 < (getWidth() - getPaddingLeft()) - getPaddingRight())) {
            return false;
        }
        return true;
    }

    public final void l(r11 r11Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(r11Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (r11Var == null) {
            Editable text = getText();
            for (li.h hVar : (li.h[]) text.getSpans(i10, selectionEnd, li.h.class)) {
                text.removeSpan(hVar);
            }
            tj0[] tj0VarArr = (tj0[]) text.getSpans(i10, selectionEnd, tj0.class);
            for (int i11 = 0; i11 < tj0VarArr.length; i11++) {
                text.removeSpan(tj0VarArr[i11]);
                text.removeSpan(tj0VarArr[i11].f29084s);
                ji.e6 e6Var = tj0VarArr[i11].v;
                if (e6Var != null) {
                    text.removeSpan(e6Var);
                }
            }
            if (tj0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        lu luVar = this.delegate;
        if (luVar != null) {
            luVar.p();
        }
    }

    public void makeSelectedBold() {
        ?? obj = new Object();
        obj.f28163a |= 1;
        l(new r11(obj, 0));
    }

    public void makeSelectedDate() {
        int selectionEnd;
        int x02;
        int x03;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        Context context = getContext();
        iu iuVar = new iu(this, i10, selectionEnd);
        ve veVar = new ve(5);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        Pattern pattern = g5.f24879a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.f19707j5;
        if (c6Var != null) {
            x02 = c6Var.b0(i11);
        } else {
            x02 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        }
        int i12 = x02;
        int i13 = org.telegram.ui.ActionBar.g6.f19672h5;
        if (c6Var != null) {
            x03 = c6Var.b0(i13);
        } else {
            x03 = org.telegram.ui.ActionBar.g6.x0(null, i13, false);
        }
        int i14 = x03;
        int i15 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.b0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.b0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.b0(i17);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.b0(i18);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.g6.f19690i6;
        if (c6Var != null) {
            c6Var.b0(i19);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.g6.Sh;
        if (c6Var != null) {
            c6Var.b0(i20);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.g6.Oh;
        if (c6Var != null) {
            c6Var.b0(i21);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i21, false);
        }
        int i22 = org.telegram.ui.ActionBar.g6.Qh;
        if (c6Var != null) {
            c6Var.b0(i22);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i22, false);
        }
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i23 = calendar.get(1);
        ud0 ud0Var = new ud0(context, c6Var);
        ud0Var.setTextColor(i12);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        ud0Var.setMinValue(1);
        ud0Var.setMaxValue(31);
        ud0Var.setWrapSelectorWheel(false);
        ud0Var.setFormatter(new n2(1));
        ud0 ud0Var2 = new ud0(context, c6Var);
        ud0Var2.setTextColor(i12);
        ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        ud0Var2.setItemCount(5);
        ud0Var2.setMinValue(0);
        ud0Var2.setMaxValue(239);
        ud0Var2.setValue(120);
        ud0Var2.setWrapSelectorWheel(false);
        ud0Var2.setFormatter(new i2.r(calendar, i23, 5));
        ud0 ud0Var3 = new ud0(context, c6Var);
        ud0Var3.setContentDescriptionCallback(new fi.c(3));
        ud0Var3.setWrapSelectorWheel(true);
        ud0Var3.setAllItemsCount(24);
        ud0Var3.setItemCount(5);
        ud0Var3.setTextColor(i12);
        ud0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var3.setMinValue(0);
        ud0Var3.setMaxValue(23);
        ud0Var3.setFormatter(new n2(2));
        ud0 ud0Var4 = new ud0(context, c6Var);
        ud0Var4.setContentDescriptionCallback(new fi.c(4));
        ud0Var4.setWrapSelectorWheel(true);
        ud0Var4.setAllItemsCount(60);
        ud0Var4.setItemCount(5);
        ud0Var4.setTextColor(i12);
        ud0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        ud0Var4.setMinValue(0);
        ud0Var4.setMaxValue(59);
        ud0Var4.setValue(0);
        ud0Var4.setFormatter(new n2(3));
        calendar.setTimeInMillis(currentTimeMillis);
        ud0Var4.setValue(calendar.get(12));
        ud0Var3.setValue(calendar.get(11));
        ud0Var.setValue(calendar.get(5));
        ud0Var2.setValue(calendar.get(2) + 120);
        i11 i11Var = new i11(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        i11Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        i11Var.a();
        i11Var.n(1);
        i11Var.o(i12);
        i11 i11Var2 = new i11(":", 18.0f, null);
        i11Var2.q(AndroidUtilities.dp(100.0f));
        i11Var2.a();
        i11Var2.n(1);
        i11Var2.f25453a.setColor(i12);
        FrameLayout frameLayout = new FrameLayout(context);
        e4 e4Var = new e4(context, ud0Var2, ud0Var, ud0Var3, ud0Var4);
        e4Var.setOrientation(1);
        frameLayout.addView(e4Var, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        e4Var.addView(frameLayout2, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(i12);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new ci.d(10));
        di.v5 v5Var = new di.v5(context, i11Var2, ud0Var4, 4);
        v5Var.setOrientation(0);
        v5Var.setWeightSum(1.0f);
        e4Var.addView(v5Var, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        di.d dVar = new di.d(context, c6Var, true);
        bi.s5 s5Var = new bi.s5(dVar, ud0Var, ud0Var2, ud0Var3, ud0Var4);
        v5Var.addView(ud0Var, w7.z5.l(0.2f, 0, 270));
        v5Var.addView(ud0Var2, w7.z5.l(0.4f, 0, 270));
        v5Var.addView(ud0Var3, w7.z5.l(0.2f, 0, 270));
        v5Var.addView(ud0Var4, w7.z5.l(0.2f, 0, 270));
        ud0Var.setOnValueChangedListener(s5Var);
        ud0Var2.setOnValueChangedListener(s5Var);
        ud0Var3.setOnValueChangedListener(s5Var);
        ud0Var4.setOnValueChangedListener(s5Var);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        e4Var.addView(dVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new a2(zArr, ud0Var, ud0Var2, ud0Var3, ud0Var4, iuVar, new int[1], z2Var));
        z2Var.b(frameLayout);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20538a;
        e3Var.show();
        e3Var.setOnDismissListener(new g2(1, veVar, zArr));
        e3Var.setBackgroundColor(i14);
        e3Var.fixNavigationBar(i14);
        g5.b(dVar, ud0Var, ud0Var2, ud0Var3, ud0Var4);
    }

    public void makeSelectedItalic() {
        ?? obj = new Object();
        obj.f28163a |= 2;
        l(new r11(obj, 0));
    }

    public void makeSelectedMono() {
        ?? obj = new Object();
        obj.f28163a |= 4;
        l(new r11(obj, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        ?? obj = new Object();
        obj.f28163a |= 256;
        l(new r11(obj, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        ?? obj = new Object();
        obj.f28163a |= 8;
        l(new r11(obj, 0));
    }

    public void makeSelectedUnderline() {
        ?? obj = new Object();
        obj.f28163a |= 16;
        l(new r11(obj, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        lu luVar = this.delegate;
        if (luVar != null) {
            luVar.p();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        canvas.save();
        canvas.translate(0.0f, this.offsetY);
        super.onDraw(canvas);
        try {
            if (this.captionLayout != null && this.userNameLength == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.hintColor);
                canvas.save();
                canvas.translate(this.xOffset, this.yOffset);
                this.captionLayout.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.rightText != null && length() != 0 && (layout = getLayout()) != null && layout.getLineCount() > 0) {
            canvas2 = canvas;
            this.rightText.c(layout.getLineRight(0), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, this.hintColor, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s0.c cVar = new s0.c(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.caption)) {
            cVar.l(this.caption);
        }
        ArrayList d = cVar.d();
        int size = d.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            s0.b bVar = (s0.b) d.get(i10);
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.f44792a).getId() == 268435456) {
                cVar.f44795a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.f44792a);
                break;
            }
            i10++;
        }
        if (hasSelection()) {
            cVar.b(new s0.b(null, R.id.menu_spoiler, LocaleController.getString(R.string.Spoiler), null));
            cVar.b(new s0.b(null, R.id.menu_bold, LocaleController.getString(R.string.Bold), null));
            cVar.b(new s0.b(null, R.id.menu_italic, LocaleController.getString(R.string.Italic), null));
            cVar.b(new s0.b(null, R.id.menu_mono, LocaleController.getString(R.string.Mono), null));
            cVar.b(new s0.b(null, R.id.menu_strike, LocaleController.getString(R.string.Strike), null));
            cVar.b(new s0.b(null, R.id.menu_underline, LocaleController.getString(R.string.Underline), null));
            cVar.b(new s0.b(null, R.id.menu_link, LocaleController.getString(R.string.CreateLink), null));
            cVar.b(new s0.b(null, R.id.menu_regular, LocaleController.getString(R.string.Regular), null));
            cVar.b(new s0.b(null, R.id.menu_date, LocaleController.getString(R.string.FormattedDate), null));
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int indexOf;
        int i12;
        boolean z10;
        try {
            if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.isInitLineCount = z10;
            super.onMeasure(i10, i11);
            if (this.isInitLineCount) {
                this.lineCount = getLineCount();
            }
            this.isInitLineCount = false;
        } catch (Exception e) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(51.0f));
            FileLog.e(e);
        }
        this.captionLayout = null;
        String str = this.caption;
        if (str != null && str.length() > 0) {
            Editable text = getText();
            if (text.length() > 1 && text.charAt(0) == '@' && (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) != -1) {
                TextPaint paint = getPaint();
                CharSequence subSequence = text.subSequence(0, indexOf + 1);
                int ceil = (int) Math.ceil(paint.measureText(text, 0, i12));
                this.userNameLength = subSequence.length();
                int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - ceil;
                CharSequence ellipsize = TextUtils.ellipsize(this.caption, paint, measuredWidth, TextUtils.TruncateAt.END);
                this.xOffset = ceil;
                try {
                    StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.captionLayout = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        this.xOffset = (int) (this.xOffset + (-this.captionLayout.getLineLeft(0)));
                    }
                    this.yOffset = ((getMeasuredHeight() - this.captionLayout.getLineBottom(0)) / 2) + AndroidUtilities.dp(0.5f);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zf.m.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    b6[] b6VarArr = (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class);
                    if (b6VarArr != null) {
                        for (b6 b6Var : b6VarArr) {
                            b6Var.applyFontMetrics(getPaint().getFontMetricsInt(), s5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    sj0[] sj0VarArr = (sj0[]) getText().getSpans(max, min, sj0.class);
                    if (sj0VarArr != null && sj0VarArr.length > 0) {
                        sj0[] sj0VarArr2 = (sj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), sj0.class);
                        for (int i11 = 0; i11 < sj0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(sj0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(sj0VarArr2[i11].f28848a);
                        }
                    } else {
                        tj0.a(spannableStringBuilder);
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            try {
                if (i10 == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(max2, min2));
                    AndroidUtilities.findActivity(getContext()).closeContextMenu();
                    org.telegram.ui.ActionBar.g4 g4Var = this.floatingActionMode;
                    if (g4Var != null) {
                        g4Var.finish();
                    }
                    setSelection(max2, min2);
                    return true;
                } else if (i10 == 16908320) {
                    int max3 = Math.max(0, getSelectionStart());
                    int min3 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(max3, min3));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (max3 != 0) {
                        spannableStringBuilder2.append(getText().subSequence(0, max3));
                    }
                    if (min3 != getText().length()) {
                        spannableStringBuilder2.append(getText().subSequence(min3, getText().length()));
                    }
                    setText(spannableStringBuilder2);
                    setSelection(max3, max3);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        try {
            super.onWindowFocusChanged(z10);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!performMenuAction(i10) && !super.performAccessibilityAction(i10, bundle)) {
            return false;
        }
        return true;
    }

    public boolean performMenuAction(int i10) {
        if (i10 == R.id.menu_regular) {
            makeSelectedRegular();
            return true;
        } else if (i10 == R.id.menu_bold) {
            makeSelectedBold();
            return true;
        } else if (i10 == R.id.menu_italic) {
            makeSelectedItalic();
            return true;
        } else if (i10 == R.id.menu_mono) {
            makeSelectedMono();
            return true;
        } else if (i10 == R.id.menu_link) {
            makeSelectedUrl();
            return true;
        } else if (i10 == R.id.menu_strike) {
            makeSelectedStrike();
            return true;
        } else if (i10 == R.id.menu_underline) {
            makeSelectedUnderline();
            return true;
        } else if (i10 == R.id.menu_spoiler) {
            makeSelectedSpoiler();
            return true;
        } else if (i10 == R.id.menu_quote) {
            makeSelectedQuote();
            return true;
        } else if (i10 == R.id.menu_date) {
            makeSelectedDate();
            return true;
        } else if (i10 == R.id.menu_translate) {
            translateSelected();
            return true;
        } else {
            return false;
        }
    }

    public void removeStyle(int i10, int i11, int i12) {
        r11[] r11VarArr;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12) {
            int min = Math.min(i12, text.length());
            int i13 = i10 & 256;
            if (i13 != 0) {
                i10 |= 512;
            }
            for (r11 r11Var : (r11[]) text.getSpans(i11, min, r11.class)) {
                q11 q11Var = r11Var.f28400b;
                int i14 = q11Var.f28163a;
                if ((i14 & i10) != 0) {
                    int spanStart = text.getSpanStart(r11Var);
                    int spanEnd = text.getSpanEnd(r11Var);
                    text.removeSpan(r11Var);
                    if (spanStart < i11) {
                        text.setSpan(new r11(new q11(q11Var), 0), spanStart, i11, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new r11(new q11(q11Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i11);
                    int min2 = Math.min(spanEnd, min);
                    int i15 = i14 & (~i10);
                    if (i15 != 0 && max < min2) {
                        q11 q11Var2 = new q11(q11Var);
                        q11Var2.f28163a = i15;
                        text.setSpan(new r11(q11Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i13 != 0) {
                invalidateSpoilers();
            }
            lu luVar = this.delegate;
            if (luVar != null) {
                luVar.p();
            }
        }
    }

    public void setAllowTextEntitiesIntersection(boolean z10) {
        this.allowTextEntitiesIntersection = z10;
    }

    public void setCaption(String str) {
        String str2 = this.caption;
        if ((str2 != null && str2.length() != 0) || (str != null && str.length() != 0)) {
            String str3 = this.caption;
            if (str3 == null || !str3.equals(str)) {
                this.caption = str;
                if (str != null) {
                    this.caption = str.replace('\n', ' ');
                }
                requestLayout();
            }
        }
    }

    public void setDelegate(lu luVar) {
        this.delegate = luVar;
    }

    @Override
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new i11(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, mu muVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, muVar);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.m9(new ku(this, callback), callback));
    }

    public void toggleStyleForSelection(int i10) {
        if (getText() != null) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            if (selectionStart >= 0 && selectionEnd >= 0) {
                if (selectionStart > selectionEnd) {
                    selectionEnd = selectionStart;
                    selectionStart = selectionEnd;
                }
                if (selectionStart < selectionEnd) {
                    if ((getCurrentStyle(selectionStart, selectionEnd) & i10) == 0) {
                        int i11 = 4;
                        if (i10 == 4) {
                            i11 = 49435;
                        } else if (i10 == 16384) {
                            i11 = 32772;
                        } else if (i10 == 32768) {
                            i11 = 16388;
                        }
                        removeStyle(i11, selectionStart, selectionEnd);
                        addStyle(i10, selectionStart, selectionEnd);
                        return;
                    }
                    removeStyle(i10, selectionStart, selectionEnd);
                }
            }
        }
    }

    public void translateSelected() {
        int selectionEnd;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        CharSequence subSequence = getText().subSequence(i10, selectionEnd);
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        Context context = getContext();
        if (U != null) {
            c6Var = U.getResourceProvider();
        } else {
            c6Var = null;
        }
        i51 i51Var = new i51(context, c6Var);
        i51Var.f25508a0 = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new xv(i51Var, 26), new co0(12));
        }
        i51Var.f25511d0 = new hu(this, i10, selectionEnd);
        i51Var.show();
        setSelection(i10, selectionEnd);
    }

    public void makeSelectedQuote(boolean z10) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        int c10 = tj0.c(getText(), i10, selectionEnd, z10);
        if (c10 >= 0) {
            setSelection(c10);
            resetFontMetricsCache();
        }
        invalidateQuotes(true);
        invalidateSpoilers();
    }

    public void makeSelectedUrl(Runnable runnable) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new m4.s0(this, i10, selectionEnd, runnable));
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, mu muVar) {
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f19248a;
        a2Var.R = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        final gi.o oVar = new gi.o(getContext(), 2);
        String str4 = str3 == null ? "" : str3;
        oVar.setTextSize(1, 18.0f);
        oVar.setText(str4);
        oVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, this.resourcesProvider));
        oVar.setHintText(str2);
        oVar.setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, this.resourcesProvider));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setTransformHintToHeader(true);
        oVar.setLineColors(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19728k6, this.resourcesProvider), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19745l6, this.resourcesProvider), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19822p7, this.resourcesProvider));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.requestFocus();
        oVar.setPadding(0, 0, 0, 0);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19924uf, this.resourcesProvider));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19942vf, this.resourcesProvider));
        frameLayout.addView(oVar, w7.z5.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.play_billing.k3.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19804o6, this.resourcesProvider);
        textView.setTextColor(w02);
        int dp = AndroidUtilities.dp(6.0f);
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.12f, w02);
        int m13 = org.telegram.ui.ActionBar.g6.m1(0.15f, w02);
        textView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, m12, m13, m13));
        w7.b6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, w7.z5.a(26.0f, 0.0f, 0.0f, 24.0f, 3.0f, -2, 21));
        textView.setVisibility(z10 ? 0 : 8);
        di.t1 t1Var = new di.t1(this, z10, oVar, str4, textView);
        textView.setOnClickListener(new bi.x(this, oVar, t1Var, 20));
        oVar.addTextChangedListener(new di.h2(t1Var, 7));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequence = null;
            }
            if (charSequence != null) {
                oVar.setText(charSequence);
                oVar.setSelection(0, oVar.getText().length());
            }
        }
        t1Var.run();
        alertDialog$Builder2.n(frameLayout);
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new u2(13, muVar, oVar));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = a2Var;
            a2Var.setOnDismissListener(new b1(this, 6));
            this.creationLinkDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            gi.o oVar2 = oVar;
                            oVar2.requestFocus();
                            AndroidUtilities.showKeyboard(oVar2);
                            return;
                        default:
                            gi.o oVar3 = oVar;
                            oVar3.requestFocus();
                            AndroidUtilities.showKeyboard(oVar3);
                            return;
                    }
                }
            });
            this.creationLinkDialog.q(250L);
        } else {
            alertDialog$Builder2.o().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            gi.o oVar2 = oVar;
                            oVar2.requestFocus();
                            AndroidUtilities.showKeyboard(oVar2);
                            return;
                        default:
                            gi.o oVar3 = oVar;
                            oVar3.requestFocus();
                            AndroidUtilities.showKeyboard(oVar3);
                            return;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int dp2 = AndroidUtilities.dp(24.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.height = AndroidUtilities.dp(36.0f);
            oVar.setLayoutParams(marginLayoutParams);
        }
        oVar.setSelection(0, oVar.getText().length());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        return super.startActionMode(new org.telegram.ui.Cells.m9(new ku(this, callback), callback), i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
