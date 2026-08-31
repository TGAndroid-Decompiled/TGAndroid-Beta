package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
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
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class xt extends EditTextBoldCursor implements org.telegram.ui.ActionBar.y4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final int f33180b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.d2 creationLinkDialog;
    private vt delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.g6 resourcesProvider;
    private l01 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public xt(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = g6Var;
        this.quoteColor = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sc, g6Var);
        addTextChangedListener(new eh.c(this, 6));
        setClipToPadding(true);
    }

    public static void i(xt xtVar) {
        xtVar.creationLinkDialog = null;
        xtVar.requestFocus();
    }

    public static void j(xt xtVar, int i10, int i11, int i12, int i13) {
        Editable text = xtVar.getText();
        ?? obj = new Object();
        obj.f31225a |= 128;
        obj.f31226b = i10;
        obj.f31227c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new i10(text.subSequence(i10, i11).toString(), obj, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        vt vtVar = xtVar.delegate;
        if (vtVar != null) {
            vtVar.b0();
        }
    }

    public static void k(xt xtVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = xtVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof u5) && !(characterStyle instanceof aj0)) {
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
            text.setSpan(xtVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        vt vtVar = xtVar.delegate;
        if (vtVar != null) {
            vtVar.b0();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12 && i11 < (min = Math.min(i12, text.length()))) {
            ?? obj = new Object();
            obj.f31225a = i10;
            MediaDataController.addStyleToText(new u01(obj, 0), i11, min, text, true);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            vt vtVar = this.delegate;
            if (vtVar != null) {
                vtVar.b0();
            }
        }
    }

    public boolean closeCreationLinkDialog(boolean z4) {
        org.telegram.ui.ActionBar.d2 d2Var = this.creationLinkDialog;
        if (d2Var != null && d2Var.isShowing()) {
            if (z4) {
                this.creationLinkDialog.dismiss();
                return true;
            }
            return true;
        }
        return false;
    }

    public p51 createUrlSpan(String str) {
        return new p51(str, null);
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.allowTextEntitiesIntersection;
    }

    public String getCaption() {
        return this.caption;
    }

    @Override
    public int getCurrentStyle(int i10, int i11) {
        int[] iArr;
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i10);
        int min = Math.min(i11, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        u01[] u01VarArr = (u01[]) text.getSpans(max, min, u01.class);
        int i12 = 0;
        for (int i13 : STYLE_FLAGS) {
            int i14 = max;
            boolean z4 = true;
            while (z4 && i14 < min) {
                z4 = false;
                for (int i15 = 0; i15 < u01VarArr.length; i15++) {
                    u01 u01Var = u01VarArr[i15];
                    int i16 = u01Var.f31513b.f31225a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(u01Var);
                        int spanEnd = text.getSpanEnd(u01VarArr[i15]);
                        if (spanStart <= i14 && spanEnd > i14) {
                            i14 = spanEnd;
                            z4 = true;
                        }
                    }
                }
            }
            if (i14 >= min) {
                i12 |= i13;
            }
        }
        return i12;
    }

    public boolean isNearRightCaption(int i10) {
        Layout layout = getLayout();
        if (layout == null || layout.getLineCount() <= 0 || (layout.getLineCount() <= 1 && layout.getLineRight(0) + i10 < (getWidth() - getPaddingLeft()) - getPaddingRight())) {
            return false;
        }
        return true;
    }

    public final void l(u01 u01Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(u01Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (u01Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i10, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            bj0[] bj0VarArr = (bj0[]) text.getSpans(i10, selectionEnd, bj0.class);
            for (int i11 = 0; i11 < bj0VarArr.length; i11++) {
                text.removeSpan(bj0VarArr[i11]);
                text.removeSpan(bj0VarArr[i11].f25613s);
                wa0 wa0Var = bj0VarArr[i11].v;
                if (wa0Var != null) {
                    text.removeSpan(wa0Var);
                }
            }
            if (bj0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        vt vtVar = this.delegate;
        if (vtVar != null) {
            vtVar.b0();
        }
    }

    public void makeSelectedBold() {
        ?? obj = new Object();
        obj.f31225a |= 1;
        l(new u01(obj, 0));
    }

    public void makeSelectedDate() {
        int selectionEnd;
        int w02;
        int w03;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        Context context = getContext();
        mh.f0 f0Var = new mh.f0(this, i10, selectionEnd);
        jc jcVar = new jc(9);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        Pattern pattern = z4.f33718a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.f21766j5;
        if (g6Var != null) {
            w02 = g6Var.e0(i11);
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        }
        int i12 = w02;
        int i13 = org.telegram.ui.ActionBar.k6.f21731h5;
        if (g6Var != null) {
            w03 = g6Var.e0(i13);
        } else {
            w03 = org.telegram.ui.ActionBar.k6.w0(null, i13, false);
        }
        int i14 = w03;
        int i15 = org.telegram.ui.ActionBar.k6.Ji;
        if (g6Var != null) {
            g6Var.e0(i15);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.Ni;
        if (g6Var != null) {
            g6Var.e0(i16);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.E8;
        if (g6Var != null) {
            g6Var.e0(i17);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.k6.G8;
        if (g6Var != null) {
            g6Var.e0(i18);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.k6.f21750i6;
        if (g6Var != null) {
            g6Var.e0(i19);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.k6.Sh;
        if (g6Var != null) {
            g6Var.e0(i20);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.k6.Oh;
        if (g6Var != null) {
            g6Var.e0(i21);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i21, false);
        }
        int i22 = org.telegram.ui.ActionBar.k6.Qh;
        if (g6Var != null) {
            g6Var.e0(i22);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i22, false);
        }
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, g6Var);
        c3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i23 = calendar.get(1);
        yc0 yc0Var = new yc0(context, g6Var);
        yc0Var.setTextColor(i12);
        yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        yc0Var.setItemCount(5);
        yc0Var.setMinValue(1);
        yc0Var.setMaxValue(31);
        yc0Var.setWrapSelectorWheel(false);
        yc0Var.setFormatter(new k2(2));
        yc0 yc0Var2 = new yc0(context, g6Var);
        yc0Var2.setTextColor(i12);
        yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        yc0Var2.setItemCount(5);
        yc0Var2.setMinValue(0);
        yc0Var2.setMaxValue(239);
        yc0Var2.setValue(120);
        yc0Var2.setWrapSelectorWheel(false);
        yc0Var2.setFormatter(new hg.m2(calendar, i23, 4));
        yc0 yc0Var3 = new yc0(context, g6Var);
        yc0Var3.setContentDescriptionCallback(new org.telegram.ui.wh(2));
        yc0Var3.setWrapSelectorWheel(true);
        yc0Var3.setAllItemsCount(24);
        yc0Var3.setItemCount(5);
        yc0Var3.setTextColor(i12);
        yc0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        yc0Var3.setMinValue(0);
        yc0Var3.setMaxValue(23);
        yc0Var3.setFormatter(new k2(3));
        yc0 yc0Var4 = new yc0(context, g6Var);
        yc0Var4.setContentDescriptionCallback(new org.telegram.ui.wh(3));
        yc0Var4.setWrapSelectorWheel(true);
        yc0Var4.setAllItemsCount(60);
        yc0Var4.setItemCount(5);
        yc0Var4.setTextColor(i12);
        yc0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        yc0Var4.setMinValue(0);
        yc0Var4.setMaxValue(59);
        yc0Var4.setValue(0);
        yc0Var4.setFormatter(new k2(4));
        calendar.setTimeInMillis(currentTimeMillis);
        yc0Var4.setValue(calendar.get(12));
        yc0Var3.setValue(calendar.get(11));
        yc0Var.setValue(calendar.get(5));
        yc0Var2.setValue(calendar.get(2) + 120);
        l01 l01Var = new l01(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        l01Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        l01Var.a();
        l01Var.n(1);
        l01Var.o(i12);
        l01 l01Var2 = new l01(":", 18.0f, null);
        l01Var2.q(AndroidUtilities.dp(100.0f));
        l01Var2.a();
        l01Var2.n(1);
        l01Var2.f28519a.setColor(i12);
        FrameLayout frameLayout = new FrameLayout(context);
        hg.p pVar = new hg.p(context, yc0Var2, yc0Var, yc0Var3, yc0Var4);
        pVar.setOrientation(1);
        frameLayout.addView(pVar, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        pVar.addView(frameLayout2, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(i12);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
        eg.i0 i0Var = new eg.i0(context, l01Var2, yc0Var4, 4);
        i0Var.setOrientation(0);
        i0Var.setWeightSum(1.0f);
        pVar.addView(i0Var, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        qh.d dVar = new qh.d(context, g6Var, true);
        f1.a aVar = new f1.a(dVar, yc0Var, yc0Var2, yc0Var3, yc0Var4);
        i0Var.addView(yc0Var, k7.c6.l(0.2f, 0, 270));
        i0Var.addView(yc0Var2, k7.c6.l(0.4f, 0, 270));
        i0Var.addView(yc0Var3, k7.c6.l(0.2f, 0, 270));
        i0Var.addView(yc0Var4, k7.c6.l(0.2f, 0, 270));
        yc0Var.setOnValueChangedListener(aVar);
        yc0Var2.setOnValueChangedListener(aVar);
        yc0Var3.setOnValueChangedListener(aVar);
        yc0Var4.setOnValueChangedListener(aVar);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        pVar.addView(dVar, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new a2(zArr, yc0Var, yc0Var2, yc0Var3, yc0Var4, f0Var, new int[1], c3Var));
        c3Var.b(frameLayout);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21207a;
        h3Var.show();
        h3Var.setOnDismissListener(new f2(1, jcVar, zArr));
        h3Var.setBackgroundColor(i14);
        h3Var.fixNavigationBar(i14);
        z4.c(dVar, yc0Var, yc0Var2, yc0Var3, yc0Var4);
    }

    public void makeSelectedItalic() {
        ?? obj = new Object();
        obj.f31225a |= 2;
        l(new u01(obj, 0));
    }

    public void makeSelectedMono() {
        ?? obj = new Object();
        obj.f31225a |= 4;
        l(new u01(obj, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        ?? obj = new Object();
        obj.f31225a |= 256;
        l(new u01(obj, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        ?? obj = new Object();
        obj.f31225a |= 8;
        l(new u01(obj, 0));
    }

    public void makeSelectedUnderline() {
        ?? obj = new Object();
        obj.f31225a |= 16;
        l(new u01(obj, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        vt vtVar = this.delegate;
        if (vtVar != null) {
            vtVar.b0();
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
        } catch (Exception e6) {
            FileLog.e(e6);
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
            if (((AccessibilityNodeInfo.AccessibilityAction) cVar.f46847a).getId() == 268435456) {
                dVar.f46850a.removeAction((AccessibilityNodeInfo.AccessibilityAction) cVar.f46847a);
                break;
            }
            i10++;
        }
        if (hasSelection()) {
            dVar.b(new s0.c(null, R.id.menu_spoiler, LocaleController.getString(R.string.Spoiler), null));
            dVar.b(new s0.c(null, R.id.menu_bold, LocaleController.getString(R.string.Bold), null));
            dVar.b(new s0.c(null, R.id.menu_italic, LocaleController.getString(R.string.Italic), null));
            dVar.b(new s0.c(null, R.id.menu_mono, LocaleController.getString(R.string.Mono), null));
            dVar.b(new s0.c(null, R.id.menu_strike, LocaleController.getString(R.string.Strike), null));
            dVar.b(new s0.c(null, R.id.menu_underline, LocaleController.getString(R.string.Underline), null));
            dVar.b(new s0.c(null, R.id.menu_link, LocaleController.getString(R.string.CreateLink), null));
            dVar.b(new s0.c(null, R.id.menu_regular, LocaleController.getString(R.string.Regular), null));
            dVar.b(new s0.c(null, R.id.menu_date, LocaleController.getString(R.string.FormattedDate), null));
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int indexOf;
        boolean z4;
        try {
            if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.isInitLineCount = z4;
            super.onMeasure(i10, i11);
            if (this.isInitLineCount) {
                this.lineCount = getLineCount();
            }
            this.isInitLineCount = false;
        } catch (Exception e6) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(51.0f));
            FileLog.e(e6);
        }
        this.captionLayout = null;
        String str = this.caption;
        if (str != null && str.length() > 0) {
            Editable text = getText();
            if (text.length() > 1 && text.charAt(0) == '@' && (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) != -1) {
                TextPaint paint = getPaint();
                int i12 = indexOf + 1;
                CharSequence subSequence = text.subSequence(0, i12);
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lf.n.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    u5[] u5VarArr = (u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class);
                    if (u5VarArr != null) {
                        for (u5 u5Var : u5VarArr) {
                            u5Var.applyFontMetrics(getPaint().getFontMetricsInt(), l5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    aj0[] aj0VarArr = (aj0[]) getText().getSpans(max, min, aj0.class);
                    if (aj0VarArr != null && aj0VarArr.length > 0) {
                        aj0[] aj0VarArr2 = (aj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), aj0.class);
                        for (int i11 = 0; i11 < aj0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(aj0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(aj0VarArr2[i11].f25268a);
                        }
                    } else {
                        bj0.a(spannableStringBuilder);
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        } else {
            try {
                if (i10 == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(max2, min2));
                    AndroidUtilities.findActivity(getContext()).closeContextMenu();
                    org.telegram.ui.ActionBar.k4 k4Var = this.floatingActionMode;
                    if (k4Var != null) {
                        k4Var.finish();
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
    public void onWindowFocusChanged(boolean z4) {
        if (Build.VERSION.SDK_INT < 23 && !z4 && this.copyPasteShowed) {
            return;
        }
        try {
            super.onWindowFocusChanged(z4);
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

    @Override
    public void removeStyle(int i10, int i11, int i12) {
        u01[] u01VarArr;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12) {
            int min = Math.min(i12, text.length());
            int i13 = i10 & 256;
            if (i13 != 0) {
                i10 |= 512;
            }
            for (u01 u01Var : (u01[]) text.getSpans(i11, min, u01.class)) {
                t01 t01Var = u01Var.f31513b;
                int i14 = t01Var.f31225a;
                if ((i14 & i10) != 0) {
                    int spanStart = text.getSpanStart(u01Var);
                    int spanEnd = text.getSpanEnd(u01Var);
                    text.removeSpan(u01Var);
                    if (spanStart < i11) {
                        text.setSpan(new u01(new t01(t01Var), 0), spanStart, i11, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new u01(new t01(t01Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i11);
                    int min2 = Math.min(spanEnd, min);
                    int i15 = i14 & (~i10);
                    if (i15 != 0 && max < min2) {
                        t01 t01Var2 = new t01(t01Var);
                        t01Var2.f31225a = i15;
                        text.setSpan(new u01(t01Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i13 != 0) {
                invalidateSpoilers();
            }
            vt vtVar = this.delegate;
            if (vtVar != null) {
                vtVar.b0();
            }
        }
    }

    public void setAllowTextEntitiesIntersection(boolean z4) {
        this.allowTextEntitiesIntersection = z4;
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

    public void setDelegate(vt vtVar) {
        this.delegate = vtVar;
    }

    @Override
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new l01(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z4, wt wtVar) {
        showInputDialog(str, str2, str3, z4, this.adaptiveCreateLinkDialog, wtVar);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        ut utVar = new ut(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            utVar = new org.telegram.ui.Cells.k9(utVar, callback);
        }
        return super.startActionMode(utVar);
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
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        CharSequence subSequence = getText().subSequence(i10, selectionEnd);
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        Context context = getContext();
        if (U != null) {
            g6Var = U.getResourceProvider();
        } else {
            g6Var = null;
        }
        h41 h41Var = new h41(context, g6Var);
        h41Var.X = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new hv(h41Var, 25), new mh0(13));
        }
        h41Var.f27376a0 = new st(this, i10, selectionEnd);
        h41Var.show();
        setSelection(i10, selectionEnd);
    }

    public void makeSelectedQuote(boolean z4) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        int c3 = bj0.c(getText(), i10, selectionEnd, z4);
        if (c3 >= 0) {
            setSelection(c3);
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
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new hg.l2(this, i10, selectionEnd, runnable));
    }

    public void showInputDialog(String str, String str2, String str3, boolean z4, boolean z10, wt wtVar) {
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.f21166a;
        d2Var.O = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        mh.m mVar = new mh.m(getContext(), 2);
        String str4 = str3 == null ? "" : str3;
        mVar.setTextSize(1, 18.0f);
        mVar.setText(str4);
        mVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, this.resourcesProvider));
        mVar.setHintText(str2);
        mVar.setHeaderHintColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6, this.resourcesProvider));
        mVar.setSingleLine(true);
        mVar.setFocusable(true);
        mVar.setTransformHintToHeader(true);
        mVar.setLineColors(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21785k6, this.resourcesProvider), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21803l6, this.resourcesProvider), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21876p7, this.resourcesProvider));
        mVar.setImeOptions(6);
        mVar.setBackgroundDrawable(null);
        mVar.requestFocus();
        mVar.setPadding(0, 0, 0, 0);
        mVar.setHighlightColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21970uf, this.resourcesProvider));
        mVar.setHandlesColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21988vf, this.resourcesProvider));
        frameLayout.addView(mVar, k7.c6.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        org.telegram.ui.yh.p(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.b.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21857o6, this.resourcesProvider);
        textView.setTextColor(v02);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.12f, v02);
        int l12 = org.telegram.ui.ActionBar.k6.l1(0.15f, v02);
        textView.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, l1, l12, l12));
        k7.e6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, k7.c6.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z4 ? 0 : 8);
        hg.j jVar = new hg.j(this, z4, mVar, str4, textView);
        textView.setOnClickListener(new eg.o(this, mVar, jVar, 23));
        mVar.addTextChangedListener(new eh.c(jVar, 7));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z4 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e6) {
                FileLog.e(e6);
                charSequence = null;
            }
            if (charSequence != null) {
                mVar.setText(charSequence);
                mVar.setSelection(0, mVar.getText().length());
            }
        }
        jVar.run();
        alertDialog$Builder2.n(frameLayout);
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new o1(18, wtVar, mVar));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            this.creationLinkDialog = d2Var;
            d2Var.setOnDismissListener(new b1(this, 5));
            this.creationLinkDialog.setOnShowListener(new tt(0, mVar));
            this.creationLinkDialog.q(250L);
        } else {
            alertDialog$Builder2.o().setOnShowListener(new tt(1, mVar));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int dp2 = AndroidUtilities.dp(24.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.height = AndroidUtilities.dp(36.0f);
            mVar.setLayoutParams(marginLayoutParams);
        }
        mVar.setSelection(0, mVar.getText().length());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        ut utVar = new ut(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            utVar = new org.telegram.ui.Cells.k9(utVar, callback);
        }
        return super.startActionMode(utVar, i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
