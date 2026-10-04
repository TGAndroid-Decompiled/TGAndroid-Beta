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
public class eu extends EditTextBoldCursor implements org.telegram.ui.ActionBar.v4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final int f26131b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.b2 creationLinkDialog;
    private cu delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.d6 resourcesProvider;
    private e11 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public eu(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = d6Var;
        this.quoteColor = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sc, d6Var);
        addTextChangedListener(new ci.i2(this, 6));
        setClipToPadding(true);
    }

    public static void i(eu euVar) {
        euVar.creationLinkDialog = null;
        euVar.requestFocus();
    }

    public static void j(eu euVar, int i10, int i11, int i12, int i13) {
        Editable text = euVar.getText();
        ?? obj = new Object();
        obj.f28497a |= 128;
        obj.f28498b = i10;
        obj.f28499c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new k10(text.subSequence(i10, i11).toString(), obj, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        cu cuVar = euVar.delegate;
        if (cuVar != null) {
            cuVar.j();
        }
    }

    public static void k(eu euVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = euVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof z5) && !(characterStyle instanceof ej0)) {
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
            text.setSpan(euVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        cu cuVar = euVar.delegate;
        if (cuVar != null) {
            cuVar.j();
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
            obj.f28497a = i10;
            MediaDataController.addStyleToText(new n11(obj, 0), i11, min, text, true);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            cu cuVar = this.delegate;
            if (cuVar != null) {
                cuVar.j();
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

    public m61 createUrlSpan(String str) {
        return new m61(str, null);
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
        n11[] n11VarArr = (n11[]) text.getSpans(max, min, n11.class);
        int i12 = 0;
        for (int i13 : STYLE_FLAGS) {
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < n11VarArr.length; i15++) {
                    n11 n11Var = n11VarArr[i15];
                    int i16 = n11Var.f28818b.f28497a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(n11Var);
                        int spanEnd = text.getSpanEnd(n11VarArr[i15]);
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

    public final void l(n11 n11Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(n11Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (n11Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i10, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            fj0[] fj0VarArr = (fj0[]) text.getSpans(i10, selectionEnd, fj0.class);
            for (int i11 = 0; i11 < fj0VarArr.length; i11++) {
                text.removeSpan(fj0VarArr[i11]);
                text.removeSpan(fj0VarArr[i11].f26472s);
                ii.b6 b6Var = fj0VarArr[i11].v;
                if (b6Var != null) {
                    text.removeSpan(b6Var);
                }
            }
            if (fj0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        cu cuVar = this.delegate;
        if (cuVar != null) {
            cuVar.j();
        }
    }

    public void makeSelectedBold() {
        ?? obj = new Object();
        obj.f28497a |= 1;
        l(new n11(obj, 0));
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
        zt ztVar = new zt(this, i10, selectionEnd);
        uh uhVar = new uh(4);
        org.telegram.ui.ActionBar.d6 d6Var = this.resourcesProvider;
        Pattern pattern = e5.f25914a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.i6.f20926j5;
        if (d6Var != null) {
            w02 = d6Var.j0(i11);
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
        }
        int i12 = w02;
        int i13 = org.telegram.ui.ActionBar.i6.f20890h5;
        if (d6Var != null) {
            w03 = d6Var.j0(i13);
        } else {
            w03 = org.telegram.ui.ActionBar.i6.w0(null, i13, false);
        }
        int i14 = w03;
        int i15 = org.telegram.ui.ActionBar.i6.Ji;
        if (d6Var != null) {
            d6Var.j0(i15);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.i6.Ni;
        if (d6Var != null) {
            d6Var.j0(i16);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.i6.E8;
        if (d6Var != null) {
            d6Var.j0(i17);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.i6.G8;
        if (d6Var != null) {
            d6Var.j0(i18);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.i6.f20909i6;
        if (d6Var != null) {
            d6Var.j0(i19);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.i6.Sh;
        if (d6Var != null) {
            d6Var.j0(i20);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.i6.Oh;
        if (d6Var != null) {
            d6Var.j0(i21);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i21, false);
        }
        int i22 = org.telegram.ui.ActionBar.i6.Qh;
        if (d6Var != null) {
            d6Var.j0(i22);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i22, false);
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, d6Var);
        a3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i23 = calendar.get(1);
        gd0 gd0Var = new gd0(context, d6Var);
        gd0Var.setTextColor(i12);
        gd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        gd0Var.setItemCount(5);
        gd0Var.setMinValue(1);
        gd0Var.setMaxValue(31);
        gd0Var.setWrapSelectorWheel(false);
        gd0Var.setFormatter(new w1(18));
        gd0 gd0Var2 = new gd0(context, d6Var);
        gd0Var2.setTextColor(i12);
        gd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        gd0Var2.setItemCount(5);
        gd0Var2.setMinValue(0);
        gd0Var2.setMaxValue(239);
        gd0Var2.setValue(120);
        gd0Var2.setWrapSelectorWheel(false);
        gd0Var2.setFormatter(new i2.s(calendar, i23, 5));
        gd0 gd0Var3 = new gd0(context, d6Var);
        gd0Var3.setContentDescriptionCallback(new ei.c(3));
        gd0Var3.setWrapSelectorWheel(true);
        gd0Var3.setAllItemsCount(24);
        gd0Var3.setItemCount(5);
        gd0Var3.setTextColor(i12);
        gd0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        gd0Var3.setMinValue(0);
        gd0Var3.setMaxValue(23);
        gd0Var3.setFormatter(new w1(19));
        gd0 gd0Var4 = new gd0(context, d6Var);
        gd0Var4.setContentDescriptionCallback(new ei.c(4));
        gd0Var4.setWrapSelectorWheel(true);
        gd0Var4.setAllItemsCount(60);
        gd0Var4.setItemCount(5);
        gd0Var4.setTextColor(i12);
        gd0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        gd0Var4.setMinValue(0);
        gd0Var4.setMaxValue(59);
        gd0Var4.setValue(0);
        gd0Var4.setFormatter(new w1(20));
        calendar.setTimeInMillis(currentTimeMillis);
        gd0Var4.setValue(calendar.get(12));
        gd0Var3.setValue(calendar.get(11));
        gd0Var.setValue(calendar.get(5));
        gd0Var2.setValue(calendar.get(2) + 120);
        e11 e11Var = new e11(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        e11Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        e11Var.a();
        e11Var.n(1);
        e11Var.o(i12);
        e11 e11Var2 = new e11(":", 18.0f, null);
        e11Var2.q(AndroidUtilities.dp(100.0f));
        e11Var2.a();
        e11Var2.n(1);
        e11Var2.f25877a.setColor(i12);
        FrameLayout frameLayout = new FrameLayout(context);
        c4 c4Var = new c4(context, gd0Var2, gd0Var, gd0Var3, gd0Var4);
        c4Var.setOrientation(1);
        frameLayout.addView(c4Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        c4Var.addView(frameLayout2, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(i12);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new bi.d(10));
        ci.w5 w5Var = new ci.w5(context, e11Var2, gd0Var4, 4);
        w5Var.setOrientation(0);
        w5Var.setWeightSum(1.0f);
        c4Var.addView(w5Var, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ci.d dVar = new ci.d(context, d6Var, true);
        ai.g6 g6Var = new ai.g6(dVar, gd0Var, gd0Var2, gd0Var3, gd0Var4);
        w5Var.addView(gd0Var, w7.z5.l(0.2f, 0, 270));
        w5Var.addView(gd0Var2, w7.z5.l(0.4f, 0, 270));
        w5Var.addView(gd0Var3, w7.z5.l(0.2f, 0, 270));
        w5Var.addView(gd0Var4, w7.z5.l(0.2f, 0, 270));
        gd0Var.setOnValueChangedListener(g6Var);
        gd0Var2.setOnValueChangedListener(g6Var);
        gd0Var3.setOnValueChangedListener(g6Var);
        gd0Var4.setOnValueChangedListener(g6Var);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        c4Var.addView(dVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new a2(zArr, gd0Var, gd0Var2, gd0Var3, gd0Var4, ztVar, new int[1], a3Var));
        a3Var.b(frameLayout);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20374a;
        f3Var.show();
        f3Var.setOnDismissListener(new g2(1, uhVar, zArr));
        f3Var.setBackgroundColor(i14);
        f3Var.fixNavigationBar(i14);
        e5.c(dVar, gd0Var, gd0Var2, gd0Var3, gd0Var4);
    }

    public void makeSelectedItalic() {
        ?? obj = new Object();
        obj.f28497a |= 2;
        l(new n11(obj, 0));
    }

    public void makeSelectedMono() {
        ?? obj = new Object();
        obj.f28497a |= 4;
        l(new n11(obj, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        ?? obj = new Object();
        obj.f28497a |= 256;
        l(new n11(obj, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        ?? obj = new Object();
        obj.f28497a |= 8;
        l(new n11(obj, 0));
    }

    public void makeSelectedUnderline() {
        ?? obj = new Object();
        obj.f28497a |= 16;
        l(new n11(obj, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        cu cuVar = this.delegate;
        if (cuVar != null) {
            cuVar.j();
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
        } catch (Exception e7) {
            FileLog.e(e7);
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
            if (((AccessibilityNodeInfo.AccessibilityAction) cVar.f46468a).getId() == 268435456) {
                dVar.f46471a.removeAction((AccessibilityNodeInfo.AccessibilityAction) cVar.f46468a);
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
        } catch (Exception e7) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(51.0f));
            FileLog.e(e7);
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yf.l.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                    if (z5VarArr != null) {
                        for (z5 z5Var : z5VarArr) {
                            z5Var.applyFontMetrics(getPaint().getFontMetricsInt(), q5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    ej0[] ej0VarArr = (ej0[]) getText().getSpans(max, min, ej0.class);
                    if (ej0VarArr != null && ej0VarArr.length > 0) {
                        ej0[] ej0VarArr2 = (ej0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ej0.class);
                        for (int i11 = 0; i11 < ej0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(ej0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(ej0VarArr2[i11].f26074a);
                        }
                    } else {
                        fj0.a(spannableStringBuilder);
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e7) {
                    FileLog.e(e7);
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
        n11[] n11VarArr;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12) {
            int min = Math.min(i12, text.length());
            int i13 = i10 & 256;
            if (i13 != 0) {
                i10 |= 512;
            }
            for (n11 n11Var : (n11[]) text.getSpans(i11, min, n11.class)) {
                m11 m11Var = n11Var.f28818b;
                int i14 = m11Var.f28497a;
                if ((i14 & i10) != 0) {
                    int spanStart = text.getSpanStart(n11Var);
                    int spanEnd = text.getSpanEnd(n11Var);
                    text.removeSpan(n11Var);
                    if (spanStart < i11) {
                        text.setSpan(new n11(new m11(m11Var), 0), spanStart, i11, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new n11(new m11(m11Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i11);
                    int min2 = Math.min(spanEnd, min);
                    int i15 = i14 & (~i10);
                    if (i15 != 0 && max < min2) {
                        m11 m11Var2 = new m11(m11Var);
                        m11Var2.f28497a = i15;
                        text.setSpan(new n11(m11Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i13 != 0) {
                invalidateSpoilers();
            }
            cu cuVar = this.delegate;
            if (cuVar != null) {
                cuVar.j();
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

    public void setDelegate(cu cuVar) {
        this.delegate = cuVar;
    }

    @Override
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new e11(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, du duVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, duVar);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        bu buVar = new bu(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            buVar = new org.telegram.ui.Cells.o9(buVar, callback);
        }
        return super.startActionMode(buVar);
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
        e51Var.f25920a0 = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new pv(e51Var, 26), new ru(29));
        }
        e51Var.f25923d0 = new xt(this, i10, selectionEnd);
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
        int c10 = fj0.c(getText(), i10, selectionEnd, z10);
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
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new yt(this, i10, selectionEnd, runnable));
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, du duVar) {
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20368a;
        b2Var.R = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        fi.o oVar = new fi.o(getContext(), 2);
        String str4 = str3 == null ? "" : str3;
        oVar.setTextSize(1, 18.0f);
        oVar.setText(str4);
        oVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20926j5, this.resourcesProvider));
        oVar.setHintText(str2);
        oVar.setHeaderHintColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, this.resourcesProvider));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setTransformHintToHeader(true);
        oVar.setLineColors(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20947k6, this.resourcesProvider), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20965l6, this.resourcesProvider), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21040p7, this.resourcesProvider));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.requestFocus();
        oVar.setPadding(0, 0, 0, 0);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21144uf, this.resourcesProvider));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21161vf, this.resourcesProvider));
        frameLayout.addView(oVar, w7.z5.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.d(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21021o6, this.resourcesProvider);
        textView.setTextColor(v02);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.12f, v02);
        int l12 = org.telegram.ui.ActionBar.i6.l1(0.15f, v02);
        textView.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.b6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, w7.z5.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        ci.u1 u1Var = new ci.u1(this, z10, oVar, str4, textView);
        textView.setOnClickListener(new ai.d0(this, oVar, u1Var, 20));
        oVar.addTextChangedListener(new ci.i2(u1Var, 7));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e7) {
                FileLog.e(e7);
                charSequence = null;
            }
            if (charSequence != null) {
                oVar.setText(charSequence);
                oVar.setSelection(0, oVar.getText().length());
            }
        }
        u1Var.run();
        alertDialog$Builder2.n(frameLayout);
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new w2(12, duVar, oVar));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = b2Var;
            b2Var.setOnDismissListener(new b1(this, 5));
            this.creationLinkDialog.setOnShowListener(new au(0, oVar));
            this.creationLinkDialog.q(250L);
        } else {
            alertDialog$Builder2.o().setOnShowListener(new au(1, oVar));
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
        bu buVar = new bu(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            buVar = new org.telegram.ui.Cells.o9(buVar, callback);
        }
        return super.startActionMode(buVar, i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
