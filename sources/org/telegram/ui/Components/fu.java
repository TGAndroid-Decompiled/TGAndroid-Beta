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
public class fu extends EditTextBoldCursor implements org.telegram.ui.ActionBar.y4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final int f23082b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.d2 creationLinkDialog;
    private du delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.f6 resourcesProvider;
    private t01 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public fu(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = f6Var;
        this.quoteColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sc, f6Var);
        addTextChangedListener(new bi.u2(this, 6));
        setClipToPadding(true);
    }

    public static void i(fu fuVar) {
        fuVar.creationLinkDialog = null;
        fuVar.requestFocus();
    }

    public static void j(fu fuVar, int i10, int i11, int i12, int i13) {
        Editable text = fuVar.getText();
        ?? obj = new Object();
        obj.f21677a |= 128;
        obj.f21678b = i10;
        obj.f21679c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new p10(text.subSequence(i10, i11).toString(), obj, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        du duVar = fuVar.delegate;
        if (duVar != null) {
            duVar.j();
        }
    }

    public static void k(fu fuVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = fuVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof y5) && !(characterStyle instanceof bj0)) {
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
            text.setSpan(fuVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        du duVar = fuVar.delegate;
        if (duVar != null) {
            duVar.j();
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
            obj.f21677a = i10;
            MediaDataController.addStyleToText(new c11(obj, 0), i11, min, text, true);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            du duVar = this.delegate;
            if (duVar != null) {
                duVar.j();
            }
        }
    }

    public boolean closeCreationLinkDialog(boolean z10) {
        org.telegram.ui.ActionBar.d2 d2Var = this.creationLinkDialog;
        if (d2Var != null && d2Var.isShowing()) {
            if (z10) {
                this.creationLinkDialog.dismiss();
                return true;
            }
            return true;
        }
        return false;
    }

    public b61 createUrlSpan(String str) {
        return new b61(str, null);
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.allowTextEntitiesIntersection;
    }

    public String getCaption() {
        return this.caption;
    }

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
        c11[] c11VarArr = (c11[]) text.getSpans(max, min, c11.class);
        int i12 = 0;
        for (int i13 : STYLE_FLAGS) {
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < c11VarArr.length; i15++) {
                    c11 c11Var = c11VarArr[i15];
                    int i16 = c11Var.f21969b.f21677a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(c11Var);
                        int spanEnd = text.getSpanEnd(c11VarArr[i15]);
                        if (spanStart <= i14 && spanEnd > i14) {
                            i14 = spanEnd;
                            z10 = true;
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

    public final void l(c11 c11Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(c11Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (c11Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i10, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            cj0[] cj0VarArr = (cj0[]) text.getSpans(i10, selectionEnd, cj0.class);
            for (int i11 = 0; i11 < cj0VarArr.length; i11++) {
                text.removeSpan(cj0VarArr[i11]);
                text.removeSpan(cj0VarArr[i11].f22145s);
                hi.c6 c6Var = cj0VarArr[i11].v;
                if (c6Var != null) {
                    text.removeSpan(c6Var);
                }
            }
            if (cj0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        du duVar = this.delegate;
        if (duVar != null) {
            duVar.j();
        }
    }

    public void makeSelectedBold() {
        ?? obj = new Object();
        obj.f21677a |= 1;
        l(new c11(obj, 0));
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
        au auVar = new au(this, i10, selectionEnd);
        bi.f0 f0Var = new bi.f0(29);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        Pattern pattern = d5.f22289a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        if (f6Var != null) {
            w02 = f6Var.e0(i11);
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        }
        int i12 = w02;
        int i13 = org.telegram.ui.ActionBar.j6.f17998h5;
        if (f6Var != null) {
            w03 = f6Var.e0(i13);
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        }
        int i14 = w03;
        int i15 = org.telegram.ui.ActionBar.j6.Ji;
        if (f6Var != null) {
            f6Var.e0(i15);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.Ni;
        if (f6Var != null) {
            f6Var.e0(i16);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.E8;
        if (f6Var != null) {
            f6Var.e0(i17);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.j6.G8;
        if (f6Var != null) {
            f6Var.e0(i18);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.j6.f18017i6;
        if (f6Var != null) {
            f6Var.e0(i19);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.j6.Sh;
        if (f6Var != null) {
            f6Var.e0(i20);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.j6.Oh;
        if (f6Var != null) {
            f6Var.e0(i21);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i21, false);
        }
        int i22 = org.telegram.ui.ActionBar.j6.Qh;
        if (f6Var != null) {
            f6Var.e0(i22);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i22, false);
        }
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i23 = calendar.get(1);
        dd0 dd0Var = new dd0(context, f6Var);
        dd0Var.setTextColor(i12);
        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var.setItemCount(5);
        dd0Var.setMinValue(1);
        dd0Var.setMaxValue(31);
        dd0Var.setWrapSelectorWheel(false);
        dd0Var.setFormatter(new b(29));
        dd0 dd0Var2 = new dd0(context, f6Var);
        dd0Var2.setTextColor(i12);
        dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        dd0Var2.setItemCount(5);
        dd0Var2.setMinValue(0);
        dd0Var2.setMaxValue(239);
        dd0Var2.setValue(120);
        dd0Var2.setWrapSelectorWheel(false);
        dd0Var2.setFormatter(new i2.s(calendar, i23, 4));
        dd0 dd0Var3 = new dd0(context, f6Var);
        dd0Var3.setContentDescriptionCallback(new di.c(3));
        dd0Var3.setWrapSelectorWheel(true);
        dd0Var3.setAllItemsCount(24);
        dd0Var3.setItemCount(5);
        dd0Var3.setTextColor(i12);
        dd0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var3.setMinValue(0);
        dd0Var3.setMaxValue(23);
        dd0Var3.setFormatter(new q2(0));
        dd0 dd0Var4 = new dd0(context, f6Var);
        dd0Var4.setContentDescriptionCallback(new di.c(4));
        dd0Var4.setWrapSelectorWheel(true);
        dd0Var4.setAllItemsCount(60);
        dd0Var4.setItemCount(5);
        dd0Var4.setTextColor(i12);
        dd0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        dd0Var4.setMinValue(0);
        dd0Var4.setMaxValue(59);
        dd0Var4.setValue(0);
        dd0Var4.setFormatter(new q2(1));
        calendar.setTimeInMillis(currentTimeMillis);
        dd0Var4.setValue(calendar.get(12));
        dd0Var3.setValue(calendar.get(11));
        dd0Var.setValue(calendar.get(5));
        dd0Var2.setValue(calendar.get(2) + 120);
        t01 t01Var = new t01(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        t01Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        t01Var.a();
        t01Var.n(1);
        t01Var.o(i12);
        t01 t01Var2 = new t01(":", 18.0f, null);
        t01Var2.q(AndroidUtilities.dp(100.0f));
        t01Var2.a();
        t01Var2.n(1);
        t01Var2.f27245a.setColor(i12);
        FrameLayout frameLayout = new FrameLayout(context);
        b4 b4Var = new b4(context, dd0Var2, dd0Var, dd0Var3, dd0Var4);
        b4Var.setOrientation(1);
        frameLayout.addView(b4Var, w7.a6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        b4Var.addView(frameLayout2, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(i12);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        bi.w6 w6Var = new bi.w6(context, t01Var2, dd0Var4, 4);
        w6Var.setOrientation(0);
        w6Var.setWeightSum(1.0f);
        b4Var.addView(w6Var, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        bi.d dVar = new bi.d(context, f6Var, true);
        f1.a aVar = new f1.a(dVar, dd0Var, dd0Var2, dd0Var3, dd0Var4);
        w6Var.addView(dd0Var, w7.a6.l(0.2f, 0, 270));
        w6Var.addView(dd0Var2, w7.a6.l(0.4f, 0, 270));
        w6Var.addView(dd0Var3, w7.a6.l(0.2f, 0, 270));
        w6Var.addView(dd0Var4, w7.a6.l(0.2f, 0, 270));
        dd0Var.setOnValueChangedListener(aVar);
        dd0Var2.setOnValueChangedListener(aVar);
        dd0Var3.setOnValueChangedListener(aVar);
        dd0Var4.setOnValueChangedListener(aVar);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        b4Var.addView(dVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new b2(zArr, dd0Var, dd0Var2, dd0Var3, dd0Var4, auVar, new int[1], c3Var));
        c3Var.b(frameLayout);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f17571a;
        h3Var.show();
        h3Var.setOnDismissListener(new h2(1, f0Var, zArr));
        h3Var.setBackgroundColor(i14);
        h3Var.fixNavigationBar(i14);
        d5.c(dVar, dd0Var, dd0Var2, dd0Var3, dd0Var4);
    }

    public void makeSelectedItalic() {
        ?? obj = new Object();
        obj.f21677a |= 2;
        l(new c11(obj, 0));
    }

    public void makeSelectedMono() {
        ?? obj = new Object();
        obj.f21677a |= 4;
        l(new c11(obj, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        ?? obj = new Object();
        obj.f21677a |= 256;
        l(new c11(obj, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        ?? obj = new Object();
        obj.f21677a |= 8;
        l(new c11(obj, 0));
    }

    public void makeSelectedUnderline() {
        ?? obj = new Object();
        obj.f21677a |= 16;
        l(new c11(obj, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        du duVar = this.delegate;
        if (duVar != null) {
            duVar.j();
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
            if (((AccessibilityNodeInfo.AccessibilityAction) cVar.f41556a).getId() == 268435456) {
                dVar.f41559a.removeAction((AccessibilityNodeInfo.AccessibilityAction) cVar.f41556a);
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xf.l.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                    if (y5VarArr != null) {
                        for (y5 y5Var : y5VarArr) {
                            y5Var.applyFontMetrics(getPaint().getFontMetricsInt(), p5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    bj0[] bj0VarArr = (bj0[]) getText().getSpans(max, min, bj0.class);
                    if (bj0VarArr != null && bj0VarArr.length > 0) {
                        bj0[] bj0VarArr2 = (bj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), bj0.class);
                        for (int i11 = 0; i11 < bj0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(bj0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(bj0VarArr2[i11].f21842a);
                        }
                    } else {
                        cj0.a(spannableStringBuilder);
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
    public void onWindowFocusChanged(boolean z10) {
        if (Build.VERSION.SDK_INT < 23 && !z10 && this.copyPasteShowed) {
            return;
        }
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
        c11[] c11VarArr;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12) {
            int min = Math.min(i12, text.length());
            int i13 = i10 & 256;
            if (i13 != 0) {
                i10 |= 512;
            }
            for (c11 c11Var : (c11[]) text.getSpans(i11, min, c11.class)) {
                b11 b11Var = c11Var.f21969b;
                int i14 = b11Var.f21677a;
                if ((i14 & i10) != 0) {
                    int spanStart = text.getSpanStart(c11Var);
                    int spanEnd = text.getSpanEnd(c11Var);
                    text.removeSpan(c11Var);
                    if (spanStart < i11) {
                        text.setSpan(new c11(new b11(b11Var), 0), spanStart, i11, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new c11(new b11(b11Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i11);
                    int min2 = Math.min(spanEnd, min);
                    int i15 = i14 & (~i10);
                    if (i15 != 0 && max < min2) {
                        b11 b11Var2 = new b11(b11Var);
                        b11Var2.f21677a = i15;
                        text.setSpan(new c11(b11Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i13 != 0) {
                invalidateSpoilers();
            }
            du duVar = this.delegate;
            if (duVar != null) {
                duVar.j();
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

    public void setDelegate(du duVar) {
        this.delegate = duVar;
    }

    @Override
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new t01(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, eu euVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, euVar);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        cu cuVar = new cu(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            cuVar = new org.telegram.ui.Cells.q9(cuVar, callback);
        }
        return super.startActionMode(cuVar);
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
        org.telegram.ui.ActionBar.f6 f6Var;
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
            f6Var = U.getResourceProvider();
        } else {
            f6Var = null;
        }
        t41 t41Var = new t41(context, f6Var);
        t41Var.f27315a0 = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new pv(t41Var, 25), new gp0(10));
        }
        t41Var.f27318d0 = new yt(this, i10, selectionEnd);
        t41Var.show();
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
        int c10 = cj0.c(getText(), i10, selectionEnd, z10);
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
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new zt(this, i10, selectionEnd, runnable));
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, eu euVar) {
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.f17528a;
        d2Var.R = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        ei.o oVar = new ei.o(getContext(), 2);
        String str4 = str3 == null ? "" : str3;
        oVar.setTextSize(1, 18.0f);
        oVar.setText(str4);
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, this.resourcesProvider));
        oVar.setHintText(str2);
        oVar.setHeaderHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, this.resourcesProvider));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setTransformHintToHeader(true);
        oVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18055k6, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18073l6, this.resourcesProvider), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18144p7, this.resourcesProvider));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.requestFocus();
        oVar.setPadding(0, 0, 0, 0);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18245uf, this.resourcesProvider));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, this.resourcesProvider));
        frameLayout.addView(oVar, w7.a6.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.k(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.r6.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18126o6, this.resourcesProvider);
        textView.setTextColor(v02);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, v02);
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, v02);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.c6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, w7.a6.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        bi.e2 e2Var = new bi.e2(this, z10, oVar, str4, textView);
        textView.setOnClickListener(new bi.q(this, oVar, e2Var, 16));
        oVar.addTextChangedListener(new bi.u2(e2Var, 7));
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
        e2Var.run();
        alertDialog$Builder2.n(frameLayout);
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new km(5, euVar, oVar));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = d2Var;
            d2Var.setOnDismissListener(new d1(this, 5));
            this.creationLinkDialog.setOnShowListener(new bu(0, oVar));
            this.creationLinkDialog.q(250L);
        } else {
            alertDialog$Builder2.o().setOnShowListener(new bu(1, oVar));
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
        cu cuVar = new cu(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            cuVar = new org.telegram.ui.Cells.q9(cuVar, callback);
        }
        return super.startActionMode(cuVar, i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
