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
public class iu extends EditTextBoldCursor implements org.telegram.ui.ActionBar.w4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final int f27337b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.b2 creationLinkDialog;
    private gu delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.d6 resourcesProvider;
    private f11 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public iu(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = d6Var;
        this.quoteColor = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sc, d6Var);
        addTextChangedListener(new ai.u(this, 7));
        setClipToPadding(true);
    }

    public static void i(iu iuVar) {
        iuVar.creationLinkDialog = null;
        iuVar.requestFocus();
    }

    public static void j(iu iuVar, int i10, int i11, int i12, int i13) {
        Editable text = iuVar.getText();
        ?? obj = new Object();
        obj.f28650a |= 128;
        obj.f28651b = i10;
        obj.f28652c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new p10(text.subSequence(i10, i11).toString(), obj, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        gu guVar = iuVar.delegate;
        if (guVar != null) {
            guVar.E();
        }
    }

    public static void k(iu iuVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = iuVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof a6) && !(characterStyle instanceof pj0)) {
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
            text.setSpan(iuVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        gu guVar = iuVar.delegate;
        if (guVar != null) {
            guVar.E();
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
            obj.f28650a = i10;
            MediaDataController.addStyleToText(new o11(obj, 0), i11, min, text, true);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            gu guVar = this.delegate;
            if (guVar != null) {
                guVar.E();
            }
        }
    }

    public boolean closeCreationLinkDialog(boolean z10) {
        org.telegram.ui.ActionBar.b2 b2Var = this.creationLinkDialog;
        if (b2Var != null && b2Var.isShowing()) {
            if (z10) {
                this.creationLinkDialog.dismiss();
                return true;
            }
            return true;
        }
        return false;
    }

    public n61 createUrlSpan(String str) {
        return new n61(str, null);
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
        o11[] o11VarArr = (o11[]) text.getSpans(max, min, o11.class);
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
                while (i18 < o11VarArr.length) {
                    o11 o11Var = o11VarArr[i18];
                    int i19 = o11Var.f28920b.f28650a;
                    int i20 = i12;
                    if ((i19 & 512) != 0) {
                        i19 |= 256;
                    }
                    if ((i19 & i15) != 0) {
                        int spanStart = text.getSpanStart(o11Var);
                        int spanEnd = text.getSpanEnd(o11VarArr[i18]);
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

    public final void l(o11 o11Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(o11Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (o11Var == null) {
            Editable text = getText();
            for (mi.h hVar : (mi.h[]) text.getSpans(i10, selectionEnd, mi.h.class)) {
                text.removeSpan(hVar);
            }
            qj0[] qj0VarArr = (qj0[]) text.getSpans(i10, selectionEnd, qj0.class);
            for (int i11 = 0; i11 < qj0VarArr.length; i11++) {
                text.removeSpan(qj0VarArr[i11]);
                text.removeSpan(qj0VarArr[i11].f29621s);
                ki.y5 y5Var = qj0VarArr[i11].v;
                if (y5Var != null) {
                    text.removeSpan(y5Var);
                }
            }
            if (qj0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        gu guVar = this.delegate;
        if (guVar != null) {
            guVar.E();
        }
    }

    public void makeSelectedBold() {
        ?? obj = new Object();
        obj.f28650a |= 1;
        l(new o11(obj, 0));
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
        ai.p0 p0Var = new ai.p0(this, i10, selectionEnd);
        rc rcVar = new rc(9);
        org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
        Pattern pattern = f5.f26077a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.f21096j5;
        if (d6Var != null) {
            x02 = d6Var.r(i11);
        } else {
            x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        }
        int i12 = x02;
        int i13 = org.telegram.ui.ActionBar.h6.f21061h5;
        if (d6Var != null) {
            x03 = d6Var.r(i13);
        } else {
            x03 = org.telegram.ui.ActionBar.h6.x0(null, i13, false);
        }
        int i14 = x03;
        int i15 = org.telegram.ui.ActionBar.h6.Ji;
        if (d6Var != null) {
            d6Var.r(i15);
        } else {
            org.telegram.ui.ActionBar.h6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.h6.Ni;
        if (d6Var != null) {
            d6Var.r(i16);
        } else {
            org.telegram.ui.ActionBar.h6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.h6.E8;
        if (d6Var != null) {
            d6Var.r(i17);
        } else {
            org.telegram.ui.ActionBar.h6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.h6.G8;
        if (d6Var != null) {
            d6Var.r(i18);
        } else {
            org.telegram.ui.ActionBar.h6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.h6.f21079i6;
        if (d6Var != null) {
            d6Var.r(i19);
        } else {
            org.telegram.ui.ActionBar.h6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.h6.Sh;
        if (d6Var != null) {
            d6Var.r(i20);
        } else {
            org.telegram.ui.ActionBar.h6.x0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.h6.Oh;
        if (d6Var != null) {
            d6Var.r(i21);
        } else {
            org.telegram.ui.ActionBar.h6.x0(null, i21, false);
        }
        int i22 = org.telegram.ui.ActionBar.h6.Qh;
        if (d6Var != null) {
            d6Var.r(i22);
        } else {
            org.telegram.ui.ActionBar.h6.x0(null, i22, false);
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, d6Var);
        a3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i23 = calendar.get(1);
        od0 od0Var = new od0(context, d6Var);
        od0Var.setTextColor(i12);
        od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        od0Var.setItemCount(5);
        od0Var.setMinValue(1);
        od0Var.setMaxValue(31);
        od0Var.setWrapSelectorWheel(false);
        od0Var.setFormatter(new k2(3));
        od0 od0Var2 = new od0(context, d6Var);
        od0Var2.setTextColor(i12);
        od0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        od0Var2.setItemCount(5);
        od0Var2.setMinValue(0);
        od0Var2.setMaxValue(239);
        od0Var2.setValue(120);
        od0Var2.setWrapSelectorWheel(false);
        od0Var2.setFormatter(new i2.s(calendar, i23, 5));
        od0 od0Var3 = new od0(context, d6Var);
        od0Var3.setContentDescriptionCallback(new gi.c(3));
        od0Var3.setWrapSelectorWheel(true);
        od0Var3.setAllItemsCount(24);
        od0Var3.setItemCount(5);
        od0Var3.setTextColor(i12);
        od0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        od0Var3.setMinValue(0);
        od0Var3.setMaxValue(23);
        od0Var3.setFormatter(new k2(4));
        od0 od0Var4 = new od0(context, d6Var);
        od0Var4.setContentDescriptionCallback(new gi.c(4));
        od0Var4.setWrapSelectorWheel(true);
        od0Var4.setAllItemsCount(60);
        od0Var4.setItemCount(5);
        od0Var4.setTextColor(i12);
        od0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        od0Var4.setMinValue(0);
        od0Var4.setMaxValue(59);
        od0Var4.setValue(0);
        od0Var4.setFormatter(new k2(5));
        calendar.setTimeInMillis(currentTimeMillis);
        od0Var4.setValue(calendar.get(12));
        od0Var3.setValue(calendar.get(11));
        od0Var.setValue(calendar.get(5));
        od0Var2.setValue(calendar.get(2) + 120);
        f11 f11Var = new f11(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        f11Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f11Var.a();
        f11Var.n(1);
        f11Var.o(i12);
        f11 f11Var2 = new f11(":", 18.0f, null);
        f11Var2.q(AndroidUtilities.dp(100.0f));
        f11Var2.a();
        f11Var2.n(1);
        f11Var2.f26019a.setColor(i12);
        FrameLayout frameLayout = new FrameLayout(context);
        d4 d4Var = new d4(context, od0Var2, od0Var, od0Var3, od0Var4);
        d4Var.setOrientation(1);
        frameLayout.addView(d4Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        d4Var.addView(frameLayout2, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(i12);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        ei.m5 m5Var = new ei.m5(context, f11Var2, od0Var4, 4);
        m5Var.setOrientation(0);
        m5Var.setWeightSum(1.0f);
        d4Var.addView(m5Var, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ei.d dVar = new ei.d(context, d6Var, true);
        ai.t7 t7Var = new ai.t7(dVar, od0Var, od0Var2, od0Var3, od0Var4);
        m5Var.addView(od0Var, w7.z5.l(0.2f, 0, 270));
        m5Var.addView(od0Var2, w7.z5.l(0.4f, 0, 270));
        m5Var.addView(od0Var3, w7.z5.l(0.2f, 0, 270));
        m5Var.addView(od0Var4, w7.z5.l(0.2f, 0, 270));
        od0Var.setOnValueChangedListener(t7Var);
        od0Var2.setOnValueChangedListener(t7Var);
        od0Var3.setOnValueChangedListener(t7Var);
        od0Var4.setOnValueChangedListener(t7Var);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        d4Var.addView(dVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new a2(zArr, od0Var, od0Var2, od0Var3, od0Var4, p0Var, new int[1], a3Var));
        a3Var.b(frameLayout);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20613a;
        f3Var.show();
        f3Var.setOnDismissListener(new g2(1, rcVar, zArr));
        f3Var.setBackgroundColor(i14);
        f3Var.fixNavigationBar(i14);
        f5.b(dVar, od0Var, od0Var2, od0Var3, od0Var4);
    }

    public void makeSelectedItalic() {
        ?? obj = new Object();
        obj.f28650a |= 2;
        l(new o11(obj, 0));
    }

    public void makeSelectedMono() {
        ?? obj = new Object();
        obj.f28650a |= 4;
        l(new o11(obj, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        ?? obj = new Object();
        obj.f28650a |= 256;
        l(new o11(obj, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        ?? obj = new Object();
        obj.f28650a |= 8;
        l(new o11(obj, 0));
    }

    public void makeSelectedUnderline() {
        ?? obj = new Object();
        obj.f28650a |= 16;
        l(new o11(obj, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        gu guVar = this.delegate;
        if (guVar != null) {
            guVar.E();
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
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.f45871a).getId() == 268435456) {
                cVar.f45874a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.f45871a);
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zf.l.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    a6[] a6VarArr = (a6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a6.class);
                    if (a6VarArr != null) {
                        for (a6 a6Var : a6VarArr) {
                            a6Var.applyFontMetrics(getPaint().getFontMetricsInt(), r5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    pj0[] pj0VarArr = (pj0[]) getText().getSpans(max, min, pj0.class);
                    if (pj0VarArr != null && pj0VarArr.length > 0) {
                        pj0[] pj0VarArr2 = (pj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pj0.class);
                        for (int i11 = 0; i11 < pj0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(pj0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(pj0VarArr2[i11].f29323a);
                        }
                    } else {
                        qj0.a(spannableStringBuilder);
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
                    org.telegram.ui.ActionBar.h4 h4Var = this.floatingActionMode;
                    if (h4Var != null) {
                        h4Var.finish();
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
        o11[] o11VarArr;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12) {
            int min = Math.min(i12, text.length());
            int i13 = i10 & 256;
            if (i13 != 0) {
                i10 |= 512;
            }
            for (o11 o11Var : (o11[]) text.getSpans(i11, min, o11.class)) {
                n11 n11Var = o11Var.f28920b;
                int i14 = n11Var.f28650a;
                if ((i14 & i10) != 0) {
                    int spanStart = text.getSpanStart(o11Var);
                    int spanEnd = text.getSpanEnd(o11Var);
                    text.removeSpan(o11Var);
                    if (spanStart < i11) {
                        text.setSpan(new o11(new n11(n11Var), 0), spanStart, i11, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new o11(new n11(n11Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i11);
                    int min2 = Math.min(spanEnd, min);
                    int i15 = i14 & (~i10);
                    if (i15 != 0 && max < min2) {
                        n11 n11Var2 = new n11(n11Var);
                        n11Var2.f28650a = i15;
                        text.setSpan(new o11(n11Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i13 != 0) {
                invalidateSpoilers();
            }
            gu guVar = this.delegate;
            if (guVar != null) {
                guVar.E();
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

    public void setDelegate(gu guVar) {
        this.delegate = guVar;
    }

    @Override
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new f11(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, hu huVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, huVar);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.l9(new fu(this, callback), callback));
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
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        CharSequence subSequence = getText().subSequence(i10, selectionEnd);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        Context context = getContext();
        if (U != null) {
            d6Var = U.getResourceProvider();
        } else {
            d6Var = null;
        }
        e51 e51Var = new e51(context, d6Var);
        e51Var.f25730a0 = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new tv(e51Var, 26), new ug0(15));
        }
        e51Var.f25733d0 = new du(this, i10, selectionEnd);
        e51Var.show();
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
        int c10 = qj0.c(getText(), i10, selectionEnd, z10);
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

    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, hu huVar) {
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20605a;
        b2Var.R = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        final ai.t tVar = new ai.t(getContext(), 3);
        String str4 = str3 == null ? "" : str3;
        tVar.setTextSize(1, 18.0f);
        tVar.setText(str4);
        tVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21096j5, this.resourcesProvider));
        tVar.setHintText(str2);
        tVar.setHeaderHintColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, this.resourcesProvider));
        tVar.setSingleLine(true);
        tVar.setFocusable(true);
        tVar.setTransformHintToHeader(true);
        tVar.setLineColors(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21117k6, this.resourcesProvider), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21134l6, this.resourcesProvider), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21211p7, this.resourcesProvider));
        tVar.setImeOptions(6);
        tVar.setBackgroundDrawable(null);
        tVar.requestFocus();
        tVar.setPadding(0, 0, 0, 0);
        tVar.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21314uf, this.resourcesProvider));
        tVar.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21332vf, this.resourcesProvider));
        frameLayout.addView(tVar, w7.z5.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.play_billing.k3.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21193o6, this.resourcesProvider);
        textView.setTextColor(w02);
        int dp = AndroidUtilities.dp(6.0f);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, w02);
        int m13 = org.telegram.ui.ActionBar.h6.m1(0.15f, w02);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, m12, m13, m13));
        w7.b6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, w7.z5.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        ei.s1 s1Var = new ei.s1(this, z10, tVar, str4, textView);
        textView.setOnClickListener(new ai.v0(this, tVar, s1Var, 23));
        tVar.addTextChangedListener(new ai.u(s1Var, 8));
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
        s1Var.run();
        alertDialog$Builder2.n(frameLayout);
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new q2(15, huVar, tVar));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = b2Var;
            b2Var.setOnDismissListener(new b1(this, 6));
            this.creationLinkDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ai.t tVar2 = tVar;
                            tVar2.requestFocus();
                            AndroidUtilities.showKeyboard(tVar2);
                            return;
                        default:
                            ai.t tVar3 = tVar;
                            tVar3.requestFocus();
                            AndroidUtilities.showKeyboard(tVar3);
                            return;
                    }
                }
            });
            this.creationLinkDialog.r(250L);
        } else {
            alertDialog$Builder2.o().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ai.t tVar2 = tVar;
                            tVar2.requestFocus();
                            AndroidUtilities.showKeyboard(tVar2);
                            return;
                        default:
                            ai.t tVar3 = tVar;
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
        return super.startActionMode(new org.telegram.ui.Cells.l9(new fu(this, callback), callback), i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
