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
public class bu extends EditTextBoldCursor implements org.telegram.ui.ActionBar.w4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final int f22871b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.b2 creationLinkDialog;
    private zt delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.e6 resourcesProvider;
    private g01 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public bu(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = e6Var;
        this.quoteColor = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sc, e6Var);
        addTextChangedListener(new ci.i2(this, 6));
        setClipToPadding(true);
    }

    public static void i(bu buVar) {
        buVar.creationLinkDialog = null;
        buVar.requestFocus();
    }

    public static void j(bu buVar, int i10, int i11, int i12, int i13) {
        Editable text = buVar.getText();
        ?? obj = new Object();
        obj.f26642a |= 128;
        obj.f26643b = i10;
        obj.f26644c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new h10(text.subSequence(i10, i11).toString(), obj, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        zt ztVar = buVar.delegate;
        if (ztVar != null) {
            ztVar.i();
        }
    }

    public static void k(bu buVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = buVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof x5) && !(characterStyle instanceof ri0)) {
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
            text.setSpan(buVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        zt ztVar = buVar.delegate;
        if (ztVar != null) {
            ztVar.i();
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
            obj.f26642a = i10;
            MediaDataController.addStyleToText(new p01(obj, 0), i11, min, text, true);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            zt ztVar = this.delegate;
            if (ztVar != null) {
                ztVar.i();
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

    public o51 createUrlSpan(String str) {
        return new o51(str, null);
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
        p01[] p01VarArr = (p01[]) text.getSpans(max, min, p01.class);
        int i12 = 0;
        for (int i13 : STYLE_FLAGS) {
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < p01VarArr.length; i15++) {
                    p01 p01Var = p01VarArr[i15];
                    int i16 = p01Var.f26920b.f26642a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(p01Var);
                        int spanEnd = text.getSpanEnd(p01VarArr[i15]);
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

    public final void l(p01 p01Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(p01Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (p01Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i10, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            si0[] si0VarArr = (si0[]) text.getSpans(i10, selectionEnd, si0.class);
            for (int i11 = 0; i11 < si0VarArr.length; i11++) {
                text.removeSpan(si0VarArr[i11]);
                text.removeSpan(si0VarArr[i11].f27872s);
                ii.z5 z5Var = si0VarArr[i11].v;
                if (z5Var != null) {
                    text.removeSpan(z5Var);
                }
            }
            if (si0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        zt ztVar = this.delegate;
        if (ztVar != null) {
            ztVar.i();
        }
    }

    public void makeSelectedBold() {
        ?? obj = new Object();
        obj.f26642a |= 1;
        l(new p01(obj, 0));
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
        wt wtVar = new wt(this, i10, selectionEnd);
        sh shVar = new sh(4);
        org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
        Pattern pattern = c5.f22944a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.i6.f18940j5;
        if (e6Var != null) {
            w02 = e6Var.g0(i11);
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
        }
        int i12 = w02;
        int i13 = org.telegram.ui.ActionBar.i6.f18904h5;
        if (e6Var != null) {
            w03 = e6Var.g0(i13);
        } else {
            w03 = org.telegram.ui.ActionBar.i6.w0(null, i13, false);
        }
        int i14 = w03;
        int i15 = org.telegram.ui.ActionBar.i6.Ji;
        if (e6Var != null) {
            e6Var.g0(i15);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.i6.Ni;
        if (e6Var != null) {
            e6Var.g0(i16);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.i6.E8;
        if (e6Var != null) {
            e6Var.g0(i17);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.i6.G8;
        if (e6Var != null) {
            e6Var.g0(i18);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.i6.f18923i6;
        if (e6Var != null) {
            e6Var.g0(i19);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.i6.Sh;
        if (e6Var != null) {
            e6Var.g0(i20);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.i6.Oh;
        if (e6Var != null) {
            e6Var.g0(i21);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i21, false);
        }
        int i22 = org.telegram.ui.ActionBar.i6.Qh;
        if (e6Var != null) {
            e6Var.g0(i22);
        } else {
            org.telegram.ui.ActionBar.i6.w0(null, i22, false);
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i23 = calendar.get(1);
        uc0 uc0Var = new uc0(context, e6Var);
        uc0Var.setTextColor(i12);
        uc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        uc0Var.setItemCount(5);
        uc0Var.setMinValue(1);
        uc0Var.setMaxValue(31);
        uc0Var.setWrapSelectorWheel(false);
        uc0Var.setFormatter(new o2(0));
        uc0 uc0Var2 = new uc0(context, e6Var);
        uc0Var2.setTextColor(i12);
        uc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        uc0Var2.setItemCount(5);
        uc0Var2.setMinValue(0);
        uc0Var2.setMaxValue(239);
        uc0Var2.setValue(120);
        uc0Var2.setWrapSelectorWheel(false);
        uc0Var2.setFormatter(new i2.s(calendar, i23, 4));
        uc0 uc0Var3 = new uc0(context, e6Var);
        uc0Var3.setContentDescriptionCallback(new ei.c(3));
        uc0Var3.setWrapSelectorWheel(true);
        uc0Var3.setAllItemsCount(24);
        uc0Var3.setItemCount(5);
        uc0Var3.setTextColor(i12);
        uc0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        uc0Var3.setMinValue(0);
        uc0Var3.setMaxValue(23);
        uc0Var3.setFormatter(new o2(1));
        uc0 uc0Var4 = new uc0(context, e6Var);
        uc0Var4.setContentDescriptionCallback(new ei.c(4));
        uc0Var4.setWrapSelectorWheel(true);
        uc0Var4.setAllItemsCount(60);
        uc0Var4.setItemCount(5);
        uc0Var4.setTextColor(i12);
        uc0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        uc0Var4.setMinValue(0);
        uc0Var4.setMaxValue(59);
        uc0Var4.setValue(0);
        uc0Var4.setFormatter(new o2(2));
        calendar.setTimeInMillis(currentTimeMillis);
        uc0Var4.setValue(calendar.get(12));
        uc0Var3.setValue(calendar.get(11));
        uc0Var.setValue(calendar.get(5));
        uc0Var2.setValue(calendar.get(2) + 120);
        g01 g01Var = new g01(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        g01Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        g01Var.a();
        g01Var.n(1);
        g01Var.o(i12);
        g01 g01Var2 = new g01(":", 18.0f, null);
        g01Var2.q(AndroidUtilities.dp(100.0f));
        g01Var2.a();
        g01Var2.n(1);
        g01Var2.f24144a.setColor(i12);
        FrameLayout frameLayout = new FrameLayout(context);
        a4 a4Var = new a4(context, uc0Var2, uc0Var, uc0Var3, uc0Var4);
        a4Var.setOrientation(1);
        frameLayout.addView(a4Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        a4Var.addView(frameLayout2, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(i12);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new bi.d(10));
        ci.x5 x5Var = new ci.x5(context, g01Var2, uc0Var4, 4);
        x5Var.setOrientation(0);
        x5Var.setWeightSum(1.0f);
        a4Var.addView(x5Var, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ci.d dVar = new ci.d(context, e6Var, true);
        ai.h6 h6Var = new ai.h6(dVar, uc0Var, uc0Var2, uc0Var3, uc0Var4);
        x5Var.addView(uc0Var, w7.x5.l(0.2f, 0, 270));
        x5Var.addView(uc0Var2, w7.x5.l(0.4f, 0, 270));
        x5Var.addView(uc0Var3, w7.x5.l(0.2f, 0, 270));
        x5Var.addView(uc0Var4, w7.x5.l(0.2f, 0, 270));
        uc0Var.setOnValueChangedListener(h6Var);
        uc0Var2.setOnValueChangedListener(h6Var);
        uc0Var3.setOnValueChangedListener(h6Var);
        uc0Var4.setOnValueChangedListener(h6Var);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        a4Var.addView(dVar, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new z1(zArr, uc0Var, uc0Var2, uc0Var3, uc0Var4, wtVar, new int[1], a3Var));
        a3Var.b(frameLayout);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18440a;
        f3Var.show();
        f3Var.setOnDismissListener(new f2(1, shVar, zArr));
        f3Var.setBackgroundColor(i14);
        f3Var.fixNavigationBar(i14);
        c5.c(dVar, uc0Var, uc0Var2, uc0Var3, uc0Var4);
    }

    public void makeSelectedItalic() {
        ?? obj = new Object();
        obj.f26642a |= 2;
        l(new p01(obj, 0));
    }

    public void makeSelectedMono() {
        ?? obj = new Object();
        obj.f26642a |= 4;
        l(new p01(obj, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        ?? obj = new Object();
        obj.f26642a |= 256;
        l(new p01(obj, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        ?? obj = new Object();
        obj.f26642a |= 8;
        l(new p01(obj, 0));
    }

    public void makeSelectedUnderline() {
        ?? obj = new Object();
        obj.f26642a |= 16;
        l(new p01(obj, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        zt ztVar = this.delegate;
        if (ztVar != null) {
            ztVar.i();
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
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.f42617a).getId() == 268435456) {
                cVar.f42620a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.f42617a);
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yf.l.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class);
                    if (x5VarArr != null) {
                        for (x5 x5Var : x5VarArr) {
                            x5Var.applyFontMetrics(getPaint().getFontMetricsInt(), o5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    ri0[] ri0VarArr = (ri0[]) getText().getSpans(max, min, ri0.class);
                    if (ri0VarArr != null && ri0VarArr.length > 0) {
                        ri0[] ri0VarArr2 = (ri0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ri0.class);
                        for (int i11 = 0; i11 < ri0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(ri0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(ri0VarArr2[i11].f27633a);
                        }
                    } else {
                        si0.a(spannableStringBuilder);
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
                    org.telegram.ui.ActionBar.i4 i4Var = this.floatingActionMode;
                    if (i4Var != null) {
                        i4Var.finish();
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
        p01[] p01VarArr;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12) {
            int min = Math.min(i12, text.length());
            int i13 = i10 & 256;
            if (i13 != 0) {
                i10 |= 512;
            }
            for (p01 p01Var : (p01[]) text.getSpans(i11, min, p01.class)) {
                o01 o01Var = p01Var.f26920b;
                int i14 = o01Var.f26642a;
                if ((i14 & i10) != 0) {
                    int spanStart = text.getSpanStart(p01Var);
                    int spanEnd = text.getSpanEnd(p01Var);
                    text.removeSpan(p01Var);
                    if (spanStart < i11) {
                        text.setSpan(new p01(new o01(o01Var), 0), spanStart, i11, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new p01(new o01(o01Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i11);
                    int min2 = Math.min(spanEnd, min);
                    int i15 = i14 & (~i10);
                    if (i15 != 0 && max < min2) {
                        o01 o01Var2 = new o01(o01Var);
                        o01Var2.f26642a = i15;
                        text.setSpan(new p01(o01Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i13 != 0) {
                invalidateSpoilers();
            }
            zt ztVar = this.delegate;
            if (ztVar != null) {
                ztVar.i();
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

    public void setDelegate(zt ztVar) {
        this.delegate = ztVar;
    }

    @Override
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new g01(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, au auVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, auVar);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        yt ytVar = new yt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            ytVar = new org.telegram.ui.Cells.o9(ytVar, callback);
        }
        return super.startActionMode(ytVar);
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
        org.telegram.ui.ActionBar.e6 e6Var;
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
            e6Var = U.getResourceProvider();
        } else {
            e6Var = null;
        }
        g41 g41Var = new g41(context, e6Var);
        g41Var.f24180a0 = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new lv(g41Var, 25), new in0(11));
        }
        g41Var.f24183d0 = new ut(this, i10, selectionEnd);
        g41Var.show();
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
        int c10 = si0.c(getText(), i10, selectionEnd, z10);
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
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new vt(this, i10, selectionEnd, runnable));
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, au auVar) {
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f18435a;
        b2Var.R = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        fi.o oVar = new fi.o(getContext(), 2);
        String str4 = str3 == null ? "" : str3;
        oVar.setTextSize(1, 18.0f);
        oVar.setText(str4);
        oVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18940j5, this.resourcesProvider));
        oVar.setHintText(str2);
        oVar.setHeaderHintColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, this.resourcesProvider));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setTransformHintToHeader(true);
        oVar.setLineColors(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18961k6, this.resourcesProvider), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18979l6, this.resourcesProvider), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19053p7, this.resourcesProvider));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.requestFocus();
        oVar.setPadding(0, 0, 0, 0);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19154uf, this.resourcesProvider));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19171vf, this.resourcesProvider));
        frameLayout.addView(oVar, w7.x5.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.q3.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19035o6, this.resourcesProvider);
        textView.setTextColor(v02);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.12f, v02);
        int l12 = org.telegram.ui.ActionBar.i6.l1(0.15f, v02);
        textView.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.z5.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, w7.x5.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        ci.u1 u1Var = new ci.u1(this, z10, oVar, str4, textView);
        textView.setOnClickListener(new ai.d0(this, oVar, u1Var, 20));
        oVar.addTextChangedListener(new ci.i2(u1Var, 7));
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
        u1Var.run();
        alertDialog$Builder2.n(frameLayout);
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new mf(9, auVar, oVar));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = b2Var;
            b2Var.setOnDismissListener(new b1(this, 5));
            this.creationLinkDialog.setOnShowListener(new xt(0, oVar));
            this.creationLinkDialog.q(250L);
        } else {
            alertDialog$Builder2.o().setOnShowListener(new xt(1, oVar));
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
        yt ytVar = new yt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            ytVar = new org.telegram.ui.Cells.o9(ytVar, callback);
        }
        return super.startActionMode(ytVar, i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
