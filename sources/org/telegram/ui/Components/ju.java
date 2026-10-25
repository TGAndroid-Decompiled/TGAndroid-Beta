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
public class ju extends EditTextBoldCursor implements org.telegram.ui.ActionBar.b5 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final int f29721b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.e2 creationLinkDialog;
    private hu delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.u6 resourcesProvider;
    private q11 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int themedQuoteColor;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public ju(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = u6Var;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sc, u6Var);
        this.themedQuoteColor = w02;
        this.quoteColor = w02;
        addTextChangedListener(new bi.u(this, 7));
        setClipToPadding(true);
    }

    public static void i(ju juVar) {
        juVar.creationLinkDialog = null;
        juVar.requestFocus();
    }

    public static void j(ju juVar, int i10, int i11, int i12, int i13) {
        Editable text = juVar.getText();
        ?? obj = new Object();
        obj.f34904a |= 128;
        obj.f34905b = i10;
        obj.f34906c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new s10(text.subSequence(i10, i11).toString(), obj, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        hu huVar = juVar.delegate;
        if (huVar != null) {
            huVar.g();
        }
    }

    public static void k(ju juVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = juVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof c6) && !(characterStyle instanceof rj0)) {
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
            text.setSpan(juVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        hu huVar = juVar.delegate;
        if (huVar != null) {
            huVar.g();
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
            obj.f34904a = i10;
            MediaDataController.addStyleToText(new z11(obj, 0), i11, min, text, true);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            hu huVar = this.delegate;
            if (huVar != null) {
                huVar.g();
            }
        }
    }

    public boolean closeCreationLinkDialog(boolean z10) {
        org.telegram.ui.ActionBar.e2 e2Var = this.creationLinkDialog;
        if (e2Var != null && e2Var.isShowing()) {
            if (z10) {
                this.creationLinkDialog.dismiss();
                return true;
            }
            return true;
        }
        return false;
    }

    public z61 createUrlSpan(String str) {
        return new z61(str, null);
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
        z11[] z11VarArr = (z11[]) text.getSpans(max, min, z11.class);
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
                while (i18 < z11VarArr.length) {
                    z11 z11Var = z11VarArr[i18];
                    int i19 = z11Var.f35178b.f34904a;
                    int i20 = i12;
                    if ((i19 & 512) != 0) {
                        i19 |= 256;
                    }
                    if ((i19 & i15) != 0) {
                        int spanStart = text.getSpanStart(z11Var);
                        int spanEnd = text.getSpanEnd(z11VarArr[i18]);
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

    public final void l(z11 z11Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(z11Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (z11Var == null) {
            Editable text = getText();
            for (ni.h hVar : (ni.h[]) text.getSpans(i10, selectionEnd, ni.h.class)) {
                text.removeSpan(hVar);
            }
            sj0[] sj0VarArr = (sj0[]) text.getSpans(i10, selectionEnd, sj0.class);
            for (int i11 = 0; i11 < sj0VarArr.length; i11++) {
                text.removeSpan(sj0VarArr[i11]);
                text.removeSpan(sj0VarArr[i11].f32582s);
                li.z5 z5Var = sj0VarArr[i11].v;
                if (z5Var != null) {
                    text.removeSpan(z5Var);
                }
            }
            if (sj0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        hu huVar = this.delegate;
        if (huVar != null) {
            huVar.g();
        }
    }

    public void makeSelectedBold() {
        ?? obj = new Object();
        obj.f34904a |= 1;
        l(new z11(obj, 0));
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
        bi.r0 r0Var = new bi.r0(this, i10, selectionEnd);
        k5 k5Var = new k5(11);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        Pattern pattern = g5.f28418a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.y6.f23462j5;
        if (u6Var != null) {
            x02 = u6Var.e(i11);
        } else {
            x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        }
        int i12 = x02;
        int i13 = org.telegram.ui.ActionBar.y6.f23425h5;
        if (u6Var != null) {
            x03 = u6Var.e(i13);
        } else {
            x03 = org.telegram.ui.ActionBar.y6.x0(null, i13, false);
        }
        int i14 = x03;
        int i15 = org.telegram.ui.ActionBar.y6.Ji;
        if (u6Var != null) {
            u6Var.e(i15);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.y6.Ni;
        if (u6Var != null) {
            u6Var.e(i16);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.y6.E8;
        if (u6Var != null) {
            u6Var.e(i17);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.y6.G8;
        if (u6Var != null) {
            u6Var.e(i18);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.y6.f23446i6;
        if (u6Var != null) {
            u6Var.e(i19);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.y6.Sh;
        if (u6Var != null) {
            u6Var.e(i20);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.y6.Oh;
        if (u6Var != null) {
            u6Var.e(i21);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i21, false);
        }
        int i22 = org.telegram.ui.ActionBar.y6.Qh;
        if (u6Var != null) {
            u6Var.e(i22);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i22, false);
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, u6Var);
        e3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i23 = calendar.get(1);
        md0 md0Var = new md0(context, u6Var);
        md0Var.setTextColor(i12);
        md0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        md0Var.setItemCount(5);
        md0Var.setMinValue(1);
        md0Var.setMaxValue(31);
        md0Var.setWrapSelectorWheel(false);
        md0Var.setFormatter(new f2(11));
        md0 md0Var2 = new md0(context, u6Var);
        md0Var2.setTextColor(i12);
        md0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        md0Var2.setItemCount(5);
        md0Var2.setMinValue(0);
        md0Var2.setMaxValue(239);
        md0Var2.setValue(120);
        md0Var2.setWrapSelectorWheel(false);
        md0Var2.setFormatter(new i2.r(calendar, i23, 5));
        md0 md0Var3 = new md0(context, u6Var);
        md0Var3.setContentDescriptionCallback(new ai.d0(5));
        md0Var3.setWrapSelectorWheel(true);
        md0Var3.setAllItemsCount(24);
        md0Var3.setItemCount(5);
        md0Var3.setTextColor(i12);
        md0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        md0Var3.setMinValue(0);
        md0Var3.setMaxValue(23);
        md0Var3.setFormatter(new f2(12));
        md0 md0Var4 = new md0(context, u6Var);
        md0Var4.setContentDescriptionCallback(new ai.d0(6));
        md0Var4.setWrapSelectorWheel(true);
        md0Var4.setAllItemsCount(60);
        md0Var4.setItemCount(5);
        md0Var4.setTextColor(i12);
        md0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        md0Var4.setMinValue(0);
        md0Var4.setMaxValue(59);
        md0Var4.setValue(0);
        md0Var4.setFormatter(new f2(13));
        calendar.setTimeInMillis(currentTimeMillis);
        md0Var4.setValue(calendar.get(12));
        md0Var3.setValue(calendar.get(11));
        md0Var.setValue(calendar.get(5));
        md0Var2.setValue(calendar.get(2) + 120);
        q11 q11Var = new q11(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        q11Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        q11Var.a();
        q11Var.n(1);
        q11Var.o(i12);
        q11 q11Var2 = new q11(":", 18.0f, null);
        q11Var2.q(AndroidUtilities.dp(100.0f));
        q11Var2.a();
        q11Var2.n(1);
        q11Var2.f31786a.setColor(i12);
        FrameLayout frameLayout = new FrameLayout(context);
        e4 e4Var = new e4(context, md0Var2, md0Var, md0Var3, md0Var4);
        e4Var.setOrientation(1);
        frameLayout.addView(e4Var, gb1.g(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        e4Var.addView(frameLayout2, gb1.x(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(i12);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, gb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.d(10));
        fi.l5 l5Var = new fi.l5(context, q11Var2, md0Var4, 4);
        l5Var.setOrientation(0);
        l5Var.setWeightSum(1.0f);
        e4Var.addView(l5Var, gb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        fi.d dVar = new fi.d(context, u6Var, true);
        bi.p7 p7Var = new bi.p7(dVar, md0Var, md0Var2, md0Var3, md0Var4);
        l5Var.addView(md0Var, gb1.p(0.2f, 0, 270));
        l5Var.addView(md0Var2, gb1.p(0.4f, 0, 270));
        l5Var.addView(md0Var3, gb1.p(0.2f, 0, 270));
        l5Var.addView(md0Var4, gb1.p(0.2f, 0, 270));
        md0Var.setOnValueChangedListener(p7Var);
        md0Var2.setOnValueChangedListener(p7Var);
        md0Var3.setOnValueChangedListener(p7Var);
        md0Var4.setOnValueChangedListener(p7Var);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.f();
        e4Var.addView(dVar, gb1.x(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new d2(zArr, md0Var, md0Var2, md0Var3, md0Var4, r0Var, new int[1], e3Var));
        e3Var.b(frameLayout);
        org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22599a;
        k3Var.show();
        k3Var.setOnDismissListener(new j2(1, k5Var, zArr));
        k3Var.setBackgroundColor(i14);
        k3Var.fixNavigationBar(i14);
        g5.c(dVar, md0Var, md0Var2, md0Var3, md0Var4);
    }

    public void makeSelectedItalic() {
        ?? obj = new Object();
        obj.f34904a |= 2;
        l(new z11(obj, 0));
    }

    public void makeSelectedMono() {
        ?? obj = new Object();
        obj.f34904a |= 4;
        l(new z11(obj, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        ?? obj = new Object();
        obj.f34904a |= 256;
        l(new z11(obj, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        ?? obj = new Object();
        obj.f34904a |= 8;
        l(new z11(obj, 0));
    }

    public void makeSelectedUnderline() {
        ?? obj = new Object();
        obj.f34904a |= 16;
        l(new z11(obj, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        hu huVar = this.delegate;
        if (huVar != null) {
            huVar.g();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.quoteColor == this.themedQuoteColor) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sc, this.resourcesProvider);
            this.themedQuoteColor = w02;
            this.quoteColor = w02;
        }
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
        s0.d dVar = new s0.d(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.caption)) {
            dVar.l(this.caption);
        }
        ArrayList d = dVar.d();
        int size = d.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            s0.c cVar = (s0.c) d.get(i10);
            if (cVar.a() == 268435456) {
                dVar.f47650a.removeAction((AccessibilityNodeInfo.AccessibilityAction) cVar.f47646a);
                break;
            }
            i10++;
        }
        if (hasSelection()) {
            dVar.b(new s0.c(R.id.menu_spoiler, LocaleController.getString(R.string.Spoiler)));
            dVar.b(new s0.c(R.id.menu_bold, LocaleController.getString(R.string.Bold)));
            dVar.b(new s0.c(R.id.menu_italic, LocaleController.getString(R.string.Italic)));
            dVar.b(new s0.c(R.id.menu_mono, LocaleController.getString(R.string.Mono)));
            dVar.b(new s0.c(R.id.menu_strike, LocaleController.getString(R.string.Strike)));
            dVar.b(new s0.c(R.id.menu_underline, LocaleController.getString(R.string.Underline)));
            dVar.b(new s0.c(R.id.menu_link, LocaleController.getString(R.string.CreateLink)));
            dVar.b(new s0.c(R.id.menu_regular, LocaleController.getString(R.string.Regular)));
            dVar.b(new s0.c(R.id.menu_date, LocaleController.getString(R.string.FormattedDate)));
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
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ag.r.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    c6[] c6VarArr = (c6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c6.class);
                    if (c6VarArr != null) {
                        for (c6 c6Var : c6VarArr) {
                            c6Var.applyFontMetrics(getPaint().getFontMetricsInt(), t5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    rj0[] rj0VarArr = (rj0[]) getText().getSpans(max, min, rj0.class);
                    if (rj0VarArr != null && rj0VarArr.length > 0) {
                        rj0[] rj0VarArr2 = (rj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), rj0.class);
                        for (int i11 = 0; i11 < rj0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(rj0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(rj0VarArr2[i11].f32257a);
                        }
                    } else {
                        sj0.a(spannableStringBuilder);
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
                    org.telegram.ui.ActionBar.m4 m4Var = this.floatingActionMode;
                    if (m4Var != null) {
                        m4Var.finish();
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
        z11[] z11VarArr;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12) {
            int min = Math.min(i12, text.length());
            int i13 = i10 & 256;
            if (i13 != 0) {
                i10 |= 512;
            }
            for (z11 z11Var : (z11[]) text.getSpans(i11, min, z11.class)) {
                y11 y11Var = z11Var.f35178b;
                int i14 = y11Var.f34904a;
                if ((i14 & i10) != 0) {
                    int spanStart = text.getSpanStart(z11Var);
                    int spanEnd = text.getSpanEnd(z11Var);
                    text.removeSpan(z11Var);
                    if (spanStart < i11) {
                        text.setSpan(new z11(new y11(y11Var), 0), spanStart, i11, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new z11(new y11(y11Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i11);
                    int min2 = Math.min(spanEnd, min);
                    int i15 = i14 & (~i10);
                    if (i15 != 0 && max < min2) {
                        y11 y11Var2 = new y11(y11Var);
                        y11Var2.f34904a = i15;
                        text.setSpan(new z11(y11Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i13 != 0) {
                invalidateSpoilers();
            }
            hu huVar = this.delegate;
            if (huVar != null) {
                huVar.g();
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

    public void setDelegate(hu huVar) {
        this.delegate = huVar;
    }

    @Override
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new q11(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, iu iuVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, iuVar);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.q9(new gu(this, callback), callback));
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
        org.telegram.ui.ActionBar.u6 u6Var;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        CharSequence subSequence = getText().subSequence(i10, selectionEnd);
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        Context context = getContext();
        if (U != null) {
            u6Var = U.getResourceProvider();
        } else {
            u6Var = null;
        }
        r51 r51Var = new r51(context, u6Var);
        r51Var.f32103a0 = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new tv(r51Var, 27), new qd0(26));
        }
        r51Var.f32106d0 = new eu(this, i10, selectionEnd);
        r51Var.show();
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
        int c10 = sj0.c(getText(), i10, selectionEnd, z10);
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
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new m4.t0(this, i10, selectionEnd, runnable));
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, iu iuVar) {
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder2.f22366a;
        e2Var.R = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        final bi.t tVar = new bi.t(getContext(), 3);
        String str4 = str3 == null ? "" : str3;
        tVar.setTextSize(1, 18.0f);
        tVar.setText(str4);
        org.telegram.ui.ActionBar.f7.V(tVar, org.telegram.ui.ActionBar.y6.f23462j5, this.resourcesProvider);
        tVar.setHintText(str2);
        org.telegram.ui.ActionBar.f7.m(tVar, 35, org.telegram.ui.ActionBar.y6.L6, this.resourcesProvider);
        tVar.setSingleLine(true);
        tVar.setFocusable(true);
        tVar.setTransformHintToHeader(true);
        org.telegram.ui.ActionBar.f7.G(tVar, org.telegram.ui.ActionBar.y6.f23482k6, org.telegram.ui.ActionBar.y6.f23500l6, org.telegram.ui.ActionBar.y6.f23579p7, this.resourcesProvider);
        tVar.setImeOptions(6);
        tVar.setBackgroundDrawable(null);
        tVar.requestFocus();
        tVar.setPadding(0, 0, 0, 0);
        org.telegram.ui.ActionBar.f7.D(tVar, org.telegram.ui.ActionBar.y6.f23680uf, this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.m(tVar, 36, org.telegram.ui.ActionBar.y6.f23698vf, this.resourcesProvider);
        frameLayout.addView(tVar, gb1.i(-1, -1, 119));
        TextView textView = new TextView(getContext());
        ic.a.o(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.d3.h(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.y6.f23558o6;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.V(textView, i10, this.resourcesProvider);
        int dp = AndroidUtilities.dp(6.0f);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.12f, w02);
        int o13 = org.telegram.ui.ActionBar.y6.o1(0.15f, w02);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, o12, o13, o13);
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.12f, i10);
        org.telegram.ui.ActionBar.b7 L2 = org.telegram.ui.ActionBar.f7.L(0.15f, i10);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        textView.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView, j02, L, L2, u6Var);
        gb1.c(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, gb1.h(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        fi.r1 r1Var = new fi.r1(this, z10, tVar, str4, textView);
        textView.setOnClickListener(new bi.w0(this, tVar, r1Var, 23));
        tVar.addTextChangedListener(new bi.u(r1Var, 8));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequence = null;
            }
            if (charSequence != null) {
                tVar.setText(charSequence);
                tVar.setSelection(0, tVar.getText().length());
            }
        }
        r1Var.run();
        alertDialog$Builder2.o(frameLayout);
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new p1(19, iuVar, tVar));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = e2Var;
            e2Var.setOnDismissListener(new z0(this, 6));
            this.creationLinkDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            bi.t tVar2 = tVar;
                            tVar2.requestFocus();
                            AndroidUtilities.showKeyboard(tVar2);
                            return;
                        default:
                            bi.t tVar3 = tVar;
                            tVar3.requestFocus();
                            AndroidUtilities.showKeyboard(tVar3);
                            return;
                    }
                }
            });
            this.creationLinkDialog.r(250L);
        } else {
            alertDialog$Builder2.p().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            bi.t tVar2 = tVar;
                            tVar2.requestFocus();
                            AndroidUtilities.showKeyboard(tVar2);
                            return;
                        default:
                            bi.t tVar3 = tVar;
                            tVar3.requestFocus();
                            AndroidUtilities.showKeyboard(tVar3);
                            return;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int dp2 = AndroidUtilities.dp(24.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.height = AndroidUtilities.dp(36.0f);
            tVar.setLayoutParams(marginLayoutParams);
        }
        tVar.setSelection(0, tVar.getText().length());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        return super.startActionMode(new org.telegram.ui.Cells.q9(new gu(this, callback), callback), i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
