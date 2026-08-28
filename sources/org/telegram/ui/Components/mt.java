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
public class mt extends EditTextBoldCursor implements org.telegram.ui.ActionBar.u4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final int f30918b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.c2 creationLinkDialog;
    private kt delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.b6 resourcesProvider;
    private nz0 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public mt(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = b6Var;
        this.quoteColor = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sc, b6Var);
        addTextChangedListener(new bh.f(this, 7));
        setClipToPadding(true);
    }

    public static void i(mt mtVar) {
        mtVar.creationLinkDialog = null;
        mtVar.requestFocus();
    }

    public static void j(mt mtVar, int i9, int i10, int i11, int i12) {
        Editable text = mtVar.getText();
        ?? obj = new Object();
        obj.f34062a |= 128;
        obj.f34063b = i9;
        obj.f34064c = i10;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i11;
        tL_messageEntityFormattedDate.flags = i12;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new s00(text.subSequence(i9, i10).toString(), obj, tL_messageEntityFormattedDate), i9, i10, 33);
        } catch (Exception unused) {
        }
        kt ktVar = mtVar.delegate;
        if (ktVar != null) {
            ktVar.m1();
        }
    }

    public static void k(mt mtVar, int i9, int i10, Runnable runnable, String str) {
        Editable text = mtVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i9, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof t5) && !(characterStyle instanceof ei0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i9) {
                        text.setSpan(characterStyle, spanStart, i9, 33);
                    }
                    if (spanEnd > i10) {
                        text.setSpan(characterStyle, i10, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(mtVar.createUrlSpan(str), i9, i10, 33);
        } catch (Exception unused) {
        }
        kt ktVar = mtVar.delegate;
        if (ktVar != null) {
            ktVar.m1();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void addStyle(int i9, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11 && i10 < (min = Math.min(i11, text.length()))) {
            ?? obj = new Object();
            obj.f34062a = i9;
            MediaDataController.addStyleToText(new wz0(obj, 0), i10, min, text, true);
            if ((i9 & 256) != 0) {
                invalidateSpoilers();
            }
            kt ktVar = this.delegate;
            if (ktVar != null) {
                ktVar.m1();
            }
        }
    }

    public boolean closeCreationLinkDialog(boolean z10) {
        org.telegram.ui.ActionBar.c2 c2Var = this.creationLinkDialog;
        if (c2Var != null && c2Var.isShowing()) {
            if (z10) {
                this.creationLinkDialog.dismiss();
                return true;
            }
            return true;
        }
        return false;
    }

    public r41 createUrlSpan(String str) {
        return new r41(str, null);
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.allowTextEntitiesIntersection;
    }

    public String getCaption() {
        return this.caption;
    }

    @Override
    public int getCurrentStyle(int i9, int i10) {
        int[] iArr;
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i9);
        int min = Math.min(i10, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        wz0[] wz0VarArr = (wz0[]) text.getSpans(max, min, wz0.class);
        int i11 = 0;
        for (int i12 : STYLE_FLAGS) {
            int i13 = max;
            boolean z10 = true;
            while (z10 && i13 < min) {
                z10 = false;
                for (int i14 = 0; i14 < wz0VarArr.length; i14++) {
                    wz0 wz0Var = wz0VarArr[i14];
                    int i15 = wz0Var.f34479b.f34062a;
                    if ((i15 & 512) != 0) {
                        i15 |= 256;
                    }
                    if ((i15 & i12) != 0) {
                        int spanStart = text.getSpanStart(wz0Var);
                        int spanEnd = text.getSpanEnd(wz0VarArr[i14]);
                        if (spanStart <= i13 && spanEnd > i13) {
                            i13 = spanEnd;
                            z10 = true;
                        }
                    }
                }
            }
            if (i13 >= min) {
                i11 |= i12;
            }
        }
        return i11;
    }

    public boolean isNearRightCaption(int i9) {
        Layout layout = getLayout();
        if (layout == null || layout.getLineCount() <= 0 || (layout.getLineCount() <= 1 && layout.getLineRight(0) + i9 < (getWidth() - getPaddingLeft()) - getPaddingRight())) {
            return false;
        }
        return true;
    }

    public final void l(wz0 wz0Var) {
        int selectionEnd;
        int i9 = this.selectionStart;
        if (i9 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i9 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(wz0Var, i9, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (wz0Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i9, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            fi0[] fi0VarArr = (fi0[]) text.getSpans(i9, selectionEnd, fi0.class);
            for (int i10 = 0; i10 < fi0VarArr.length; i10++) {
                text.removeSpan(fi0VarArr[i10]);
                text.removeSpan(fi0VarArr[i10].f28443s);
                ba0 ba0Var = fi0VarArr[i10].v;
                if (ba0Var != null) {
                    text.removeSpan(ba0Var);
                }
            }
            if (fi0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        kt ktVar = this.delegate;
        if (ktVar != null) {
            ktVar.m1();
        }
    }

    public void makeSelectedBold() {
        ?? obj = new Object();
        obj.f34062a |= 1;
        l(new wz0(obj, 0));
    }

    public void makeSelectedDate() {
        int selectionEnd;
        int w02;
        int w03;
        int i9 = this.selectionStart;
        if (i9 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i9 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        Context context = getContext();
        gh.h0 h0Var = new gh.h0(this, i9, selectionEnd);
        hc hcVar = new hc(9);
        org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
        Pattern pattern = y4.f34847a;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        if (b6Var != null) {
            w02 = b6Var.p0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        }
        int i11 = w02;
        int i12 = org.telegram.ui.ActionBar.f6.f23072h5;
        if (b6Var != null) {
            w03 = b6Var.p0(i12);
        } else {
            w03 = org.telegram.ui.ActionBar.f6.w0(null, i12, false);
        }
        int i13 = w03;
        int i14 = org.telegram.ui.ActionBar.f6.Ji;
        if (b6Var != null) {
            b6Var.p0(i14);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.f6.Ni;
        if (b6Var != null) {
            b6Var.p0(i15);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.f6.E8;
        if (b6Var != null) {
            b6Var.p0(i16);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.f6.G8;
        if (b6Var != null) {
            b6Var.p0(i17);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.f6.f23092i6;
        if (b6Var != null) {
            b6Var.p0(i18);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.f6.Sh;
        if (b6Var != null) {
            b6Var.p0(i19);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.f6.Oh;
        if (b6Var != null) {
            b6Var.p0(i20);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.f6.Qh;
        if (b6Var != null) {
            b6Var.p0(i21);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i21, false);
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, b6Var);
        a3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i22 = calendar.get(1);
        bc0 bc0Var = new bc0(context, b6Var);
        bc0Var.setTextColor(i11);
        bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        bc0Var.setItemCount(5);
        bc0Var.setMinValue(1);
        bc0Var.setMaxValue(31);
        bc0Var.setWrapSelectorWheel(false);
        bc0Var.setFormatter(new g2(3));
        bc0 bc0Var2 = new bc0(context, b6Var);
        bc0Var2.setTextColor(i11);
        bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        bc0Var2.setItemCount(5);
        bc0Var2.setMinValue(0);
        bc0Var2.setMaxValue(239);
        bc0Var2.setValue(120);
        bc0Var2.setWrapSelectorWheel(false);
        bc0Var2.setFormatter(new bg.x2(calendar, i22, 3));
        bc0 bc0Var3 = new bc0(context, b6Var);
        bc0Var3.setContentDescriptionCallback(new mh.c(3));
        bc0Var3.setWrapSelectorWheel(true);
        bc0Var3.setAllItemsCount(24);
        bc0Var3.setItemCount(5);
        bc0Var3.setTextColor(i11);
        bc0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        bc0Var3.setMinValue(0);
        bc0Var3.setMaxValue(23);
        bc0Var3.setFormatter(new g2(4));
        bc0 bc0Var4 = new bc0(context, b6Var);
        bc0Var4.setContentDescriptionCallback(new mh.c(4));
        bc0Var4.setWrapSelectorWheel(true);
        bc0Var4.setAllItemsCount(60);
        bc0Var4.setItemCount(5);
        bc0Var4.setTextColor(i11);
        bc0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        bc0Var4.setMinValue(0);
        bc0Var4.setMaxValue(59);
        bc0Var4.setValue(0);
        bc0Var4.setFormatter(new g2(5));
        calendar.setTimeInMillis(currentTimeMillis);
        bc0Var4.setValue(calendar.get(12));
        bc0Var3.setValue(calendar.get(11));
        bc0Var.setValue(calendar.get(5));
        bc0Var2.setValue(calendar.get(2) + 120);
        nz0 nz0Var = new nz0(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        nz0Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        nz0Var.a();
        nz0Var.n(1);
        nz0Var.o(i11);
        nz0 nz0Var2 = new nz0(":", 18.0f, null);
        nz0Var2.q(AndroidUtilities.dp(100.0f));
        nz0Var2.a();
        nz0Var2.n(1);
        nz0Var2.f31221a.setColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        bg.s sVar = new bg.s(context, bc0Var2, bc0Var, bc0Var3, bc0Var4);
        sVar.setOrientation(1);
        frameLayout.addView(sVar, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        sVar.addView(frameLayout2, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(i11);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new jh.d(10));
        kh.n5 n5Var = new kh.n5(context, nz0Var2, bc0Var4, 4);
        n5Var.setOrientation(0);
        n5Var.setWeightSum(1.0f);
        sVar.addView(n5Var, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        kh.d dVar = new kh.d(context, b6Var, true);
        f1.a aVar = new f1.a(dVar, bc0Var, bc0Var2, bc0Var3, bc0Var4);
        n5Var.addView(bc0Var, g7.e6.l(0.2f, 0, 270));
        n5Var.addView(bc0Var2, g7.e6.l(0.4f, 0, 270));
        n5Var.addView(bc0Var3, g7.e6.l(0.2f, 0, 270));
        n5Var.addView(bc0Var4, g7.e6.l(0.2f, 0, 270));
        bc0Var.setOnValueChangedListener(aVar);
        bc0Var2.setOnValueChangedListener(aVar);
        bc0Var3.setOnValueChangedListener(aVar);
        bc0Var4.setOnValueChangedListener(aVar);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        sVar.addView(dVar, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new y1(zArr, bc0Var, bc0Var2, bc0Var3, bc0Var4, h0Var, new int[1], a3Var));
        a3Var.b(frameLayout);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22713a;
        f3Var.show();
        f3Var.setOnDismissListener(new d2(1, hcVar, zArr));
        f3Var.setBackgroundColor(i13);
        f3Var.fixNavigationBar(i13);
        y4.c(dVar, bc0Var, bc0Var2, bc0Var3, bc0Var4);
    }

    public void makeSelectedItalic() {
        ?? obj = new Object();
        obj.f34062a |= 2;
        l(new wz0(obj, 0));
    }

    public void makeSelectedMono() {
        ?? obj = new Object();
        obj.f34062a |= 4;
        l(new wz0(obj, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        ?? obj = new Object();
        obj.f34062a |= 256;
        l(new wz0(obj, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        ?? obj = new Object();
        obj.f34062a |= 8;
        l(new wz0(obj, 0));
    }

    public void makeSelectedUnderline() {
        ?? obj = new Object();
        obj.f34062a |= 16;
        l(new wz0(obj, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        kt ktVar = this.delegate;
        if (ktVar != null) {
            ktVar.m1();
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
        } catch (Exception e10) {
            FileLog.e(e10);
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
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            s0.c cVar = (s0.c) d.get(i9);
            if (((AccessibilityNodeInfo.AccessibilityAction) cVar.f47289a).getId() == 268435456) {
                dVar.f47292a.removeAction((AccessibilityNodeInfo.AccessibilityAction) cVar.f47289a);
                break;
            }
            i9++;
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
    public void onMeasure(int i9, int i10) {
        int indexOf;
        boolean z10;
        try {
            if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.isInitLineCount = z10;
            super.onMeasure(i9, i10);
            if (this.isInitLineCount) {
                this.lineCount = getLineCount();
            }
            this.isInitLineCount = false;
        } catch (Exception e10) {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(51.0f));
            FileLog.e(e10);
        }
        this.captionLayout = null;
        String str = this.caption;
        if (str != null && str.length() > 0) {
            Editable text = getText();
            if (text.length() > 1 && text.charAt(0) == '@' && (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) != -1) {
                TextPaint paint = getPaint();
                int i11 = indexOf + 1;
                CharSequence subSequence = text.subSequence(0, i11);
                int ceil = (int) Math.ceil(paint.measureText(text, 0, i11));
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
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i9) {
        if (i9 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ff.o.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class);
                    if (t5VarArr != null) {
                        for (t5 t5Var : t5VarArr) {
                            t5Var.applyFontMetrics(getPaint().getFontMetricsInt(), k5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    ei0[] ei0VarArr = (ei0[]) getText().getSpans(max, min, ei0.class);
                    if (ei0VarArr != null && ei0VarArr.length > 0) {
                        ei0[] ei0VarArr2 = (ei0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ei0.class);
                        for (int i10 = 0; i10 < ei0VarArr2.length; i10++) {
                            spannableStringBuilder.removeSpan(ei0VarArr2[i10]);
                            spannableStringBuilder.removeSpan(ei0VarArr2[i10].f28034a);
                        }
                    } else {
                        fi0.a(spannableStringBuilder);
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else {
            try {
                if (i9 == 16908321) {
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
                } else if (i9 == 16908320) {
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
        return super.onTextContextMenuItem(i9);
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        if (Build.VERSION.SDK_INT < 23 && !z10 && this.copyPasteShowed) {
            return;
        }
        try {
            super.onWindowFocusChanged(z10);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (!performMenuAction(i9) && !super.performAccessibilityAction(i9, bundle)) {
            return false;
        }
        return true;
    }

    public boolean performMenuAction(int i9) {
        if (i9 == R.id.menu_regular) {
            makeSelectedRegular();
            return true;
        } else if (i9 == R.id.menu_bold) {
            makeSelectedBold();
            return true;
        } else if (i9 == R.id.menu_italic) {
            makeSelectedItalic();
            return true;
        } else if (i9 == R.id.menu_mono) {
            makeSelectedMono();
            return true;
        } else if (i9 == R.id.menu_link) {
            makeSelectedUrl();
            return true;
        } else if (i9 == R.id.menu_strike) {
            makeSelectedStrike();
            return true;
        } else if (i9 == R.id.menu_underline) {
            makeSelectedUnderline();
            return true;
        } else if (i9 == R.id.menu_spoiler) {
            makeSelectedSpoiler();
            return true;
        } else if (i9 == R.id.menu_quote) {
            makeSelectedQuote();
            return true;
        } else if (i9 == R.id.menu_date) {
            makeSelectedDate();
            return true;
        } else if (i9 == R.id.menu_translate) {
            translateSelected();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void removeStyle(int i9, int i10, int i11) {
        wz0[] wz0VarArr;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11) {
            int min = Math.min(i11, text.length());
            int i12 = i9 & 256;
            if (i12 != 0) {
                i9 |= 512;
            }
            for (wz0 wz0Var : (wz0[]) text.getSpans(i10, min, wz0.class)) {
                vz0 vz0Var = wz0Var.f34479b;
                int i13 = vz0Var.f34062a;
                if ((i13 & i9) != 0) {
                    int spanStart = text.getSpanStart(wz0Var);
                    int spanEnd = text.getSpanEnd(wz0Var);
                    text.removeSpan(wz0Var);
                    if (spanStart < i10) {
                        text.setSpan(new wz0(new vz0(vz0Var), 0), spanStart, i10, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new wz0(new vz0(vz0Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i10);
                    int min2 = Math.min(spanEnd, min);
                    int i14 = i13 & (~i9);
                    if (i14 != 0 && max < min2) {
                        vz0 vz0Var2 = new vz0(vz0Var);
                        vz0Var2.f34062a = i14;
                        text.setSpan(new wz0(vz0Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i12 != 0) {
                invalidateSpoilers();
            }
            kt ktVar = this.delegate;
            if (ktVar != null) {
                ktVar.m1();
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

    public void setDelegate(kt ktVar) {
        this.delegate = ktVar;
    }

    @Override
    public void setHintColor(int i9) {
        super.setHintColor(i9);
        this.hintColor = i9;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new nz0(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i9, int i10) {
        this.selectionStart = i9;
        this.selectionEnd = i10;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, lt ltVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, ltVar);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        jt jtVar = new jt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            jtVar = new org.telegram.ui.Cells.l9(jtVar, callback);
        }
        return super.startActionMode(jtVar);
    }

    public void toggleStyleForSelection(int i9) {
        if (getText() != null) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            if (selectionStart >= 0 && selectionEnd >= 0) {
                if (selectionStart > selectionEnd) {
                    selectionEnd = selectionStart;
                    selectionStart = selectionEnd;
                }
                if (selectionStart < selectionEnd) {
                    if ((getCurrentStyle(selectionStart, selectionEnd) & i9) == 0) {
                        int i10 = 4;
                        if (i9 == 4) {
                            i10 = 49435;
                        } else if (i9 == 16384) {
                            i10 = 32772;
                        } else if (i9 == 32768) {
                            i10 = 16388;
                        }
                        removeStyle(i10, selectionStart, selectionEnd);
                        addStyle(i9, selectionStart, selectionEnd);
                        return;
                    }
                    removeStyle(i9, selectionStart, selectionEnd);
                }
            }
        }
    }

    public void translateSelected() {
        int selectionEnd;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i9 = this.selectionStart;
        if (i9 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i9 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        CharSequence subSequence = getText().subSequence(i9, selectionEnd);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        Context context = getContext();
        if (U != null) {
            b6Var = U.getResourceProvider();
        } else {
            b6Var = null;
        }
        k31 k31Var = new k31(context, b6Var);
        k31Var.W = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new wu(k31Var, 25), new if0(14));
        }
        k31Var.Z = new gt(this, i9, selectionEnd);
        k31Var.show();
        setSelection(i9, selectionEnd);
    }

    public void makeSelectedQuote(boolean z10) {
        int selectionEnd;
        int i9 = this.selectionStart;
        if (i9 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i9 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        int c10 = fi0.c(getText(), i9, selectionEnd, z10);
        if (c10 >= 0) {
            setSelection(c10);
            resetFontMetricsCache();
        }
        invalidateQuotes(true);
        invalidateSpoilers();
    }

    public void makeSelectedUrl(Runnable runnable) {
        int selectionEnd;
        int i9 = this.selectionStart;
        if (i9 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i9 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new bg.w2(this, i9, selectionEnd, runnable));
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, lt ltVar) {
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f22702a;
        c2Var.N = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        gh.o oVar = new gh.o(getContext(), 3);
        String str4 = str3 == null ? "" : str3;
        oVar.setTextSize(1, 18.0f);
        oVar.setText(str4);
        oVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, this.resourcesProvider));
        oVar.setHintText(str2);
        oVar.setHeaderHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, this.resourcesProvider));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setTransformHintToHeader(true);
        oVar.setLineColors(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23127k6, this.resourcesProvider), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23144l6, this.resourcesProvider), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23212p7, this.resourcesProvider));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.requestFocus();
        oVar.setPadding(0, 0, 0, 0);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23312uf, this.resourcesProvider));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23325vf, this.resourcesProvider));
        frameLayout.addView(oVar, g7.e6.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        j3.r0.u(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.j2.c(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.o6, this.resourcesProvider);
        textView.setTextColor(v02);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, v02);
        int l12 = org.telegram.ui.ActionBar.f6.l1(0.15f, v02);
        textView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, l1, l12, l12));
        g7.g6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, g7.e6.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        bg.m mVar = new bg.m(this, z10, oVar, str4, textView);
        textView.setOnClickListener(new fg.f(this, oVar, mVar, 25));
        oVar.addTextChangedListener(new bh.f(mVar, 8));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e10) {
                FileLog.e(e10);
                charSequence = null;
            }
            if (charSequence != null) {
                oVar.setText(charSequence);
                oVar.setSelection(0, oVar.getText().length());
            }
        }
        mVar.run();
        alertDialog$Builder2.n(frameLayout);
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new g1(19, ltVar, oVar));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = c2Var;
            c2Var.setOnDismissListener(new a1(this, 5));
            this.creationLinkDialog.setOnShowListener(new ht(0, oVar));
            this.creationLinkDialog.q(250L);
        } else {
            alertDialog$Builder2.o().setOnShowListener(new ht(1, oVar));
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
    public ActionMode startActionMode(ActionMode.Callback callback, int i9) {
        jt jtVar = new jt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            jtVar = new org.telegram.ui.Cells.l9(jtVar, callback);
        }
        return super.startActionMode(jtVar, i9);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i9, int i10) {
    }
}
