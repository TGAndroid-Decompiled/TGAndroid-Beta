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

public class lt extends EditTextBoldCursor implements org.telegram.ui.ActionBar.u4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};

    public static final int f30461b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.b2 creationLinkDialog;
    private jt delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.c6 resourcesProvider;
    private pz0 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public lt(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = c6Var;
        this.quoteColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sc, c6Var);
        addTextChangedListener(new ch.e(this, 7));
        setClipToPadding(true);
    }

    public static void i(lt ltVar) {
        ltVar.creationLinkDialog = null;
        ltVar.requestFocus();
    }

    public static void j(lt ltVar, int i10, int i11, int i12, int i13) {
        Editable text = ltVar.getText();
        xz0 xz0Var = new xz0();
        xz0Var.f34734a |= 128;
        xz0Var.f34735b = i10;
        xz0Var.f34736c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new v00(text.subSequence(i10, i11).toString(), xz0Var, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        jt jtVar = ltVar.delegate;
        if (jtVar != null) {
            jtVar.k1();
        }
    }

    public static void k(lt ltVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = ltVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof t5) && !(characterStyle instanceof gi0)) {
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
            text.setSpan(ltVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        jt jtVar = ltVar.delegate;
        if (jtVar != null) {
            jtVar.k1();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void addStyle(int i10, int i11, int i12) {
        int iMin;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (iMin = Math.min(i12, text.length()))) {
            return;
        }
        xz0 xz0Var = new xz0();
        xz0Var.f34734a = i10;
        MediaDataController.addStyleToText(new yz0(xz0Var, 0), i11, iMin, text, true);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        jt jtVar = this.delegate;
        if (jtVar != null) {
            jtVar.k1();
        }
    }

    public boolean closeCreationLinkDialog(boolean z10) {
        org.telegram.ui.ActionBar.b2 b2Var = this.creationLinkDialog;
        if (b2Var == null || !b2Var.isShowing()) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.creationLinkDialog.dismiss();
        return true;
    }

    public t41 createUrlSpan(String str) {
        return new t41(str, null);
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.allowTextEntitiesIntersection;
    }

    public String getCaption() {
        return this.caption;
    }

    @Override
    public int getCurrentStyle(int i10, int i11) {
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int iMax = Math.max(0, i10);
        int iMin = Math.min(i11, text.length());
        if (iMax < 0 || iMin < 0 || iMax >= iMin) {
            return 0;
        }
        yz0[] yz0VarArr = (yz0[]) text.getSpans(iMax, iMin, yz0.class);
        int i12 = 0;
        for (int i13 : STYLE_FLAGS) {
            int i14 = iMax;
            boolean z10 = true;
            while (z10 && i14 < iMin) {
                z10 = false;
                for (int i15 = 0; i15 < yz0VarArr.length; i15++) {
                    yz0 yz0Var = yz0VarArr[i15];
                    int i16 = yz0Var.f35101b.f34734a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(yz0Var);
                        int spanEnd = text.getSpanEnd(yz0VarArr[i15]);
                        if (spanStart <= i14 && spanEnd > i14) {
                            i14 = spanEnd;
                            z10 = true;
                        }
                    }
                }
            }
            if (i14 >= iMin) {
                i12 |= i13;
            }
        }
        return i12;
    }

    public boolean isNearRightCaption(int i10) {
        Layout layout = getLayout();
        return layout != null && layout.getLineCount() > 0 && (layout.getLineCount() > 1 || layout.getLineRight(0) + ((float) i10) >= ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())));
    }

    public final void l(yz0 yz0Var) {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart < 0 || (selectionEnd = this.selectionEnd) < 0) {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        MediaDataController.addStyleToText(yz0Var, selectionStart, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (yz0Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(selectionStart, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            hi0[] hi0VarArr = (hi0[]) text.getSpans(selectionStart, selectionEnd, hi0.class);
            for (int i10 = 0; i10 < hi0VarArr.length; i10++) {
                text.removeSpan(hi0VarArr[i10]);
                text.removeSpan(hi0VarArr[i10].f29033s);
                fa0 fa0Var = hi0VarArr[i10].v;
                if (fa0Var != null) {
                    text.removeSpan(fa0Var);
                }
            }
            if (hi0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        jt jtVar = this.delegate;
        if (jtVar != null) {
            jtVar.k1();
        }
    }

    public void makeSelectedBold() {
        xz0 xz0Var = new xz0();
        xz0Var.f34734a |= 1;
        l(new yz0(xz0Var, 0));
    }

    public void makeSelectedDate() {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart < 0 || (selectionEnd = this.selectionEnd) < 0) {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        Context context = getContext();
        hh.h0 h0Var = new hh.h0(this, selectionStart, selectionEnd);
        gc gcVar = new gc(8);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        Pattern pattern = y4.f34802a;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        int iQ0 = c6Var != null ? c6Var.q0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.g6.f23124h5;
        int iQ1 = c6Var != null ? c6Var.q0(i11) : org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.q0(i12);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.q0(i13);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.q0(i14);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.q0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.f23144i6;
        if (c6Var != null) {
            c6Var.q0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.Sh;
        if (c6Var != null) {
            c6Var.q0(i17);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.g6.Oh;
        if (c6Var != null) {
            c6Var.q0(i18);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.g6.Qh;
        if (c6Var != null) {
            c6Var.q0(i19);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i19, false);
        }
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i20 = calendar.get(1);
        fc0 fc0Var = new fc0(context, c6Var);
        fc0Var.setTextColor(iQ0);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        fc0Var.setMinValue(1);
        fc0Var.setMaxValue(31);
        fc0Var.setWrapSelectorWheel(false);
        fc0Var.setFormatter(new c2(8));
        fc0 fc0Var2 = new fc0(context, c6Var);
        fc0Var2.setTextColor(iQ0);
        fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        fc0Var2.setItemCount(5);
        fc0Var2.setMinValue(0);
        fc0Var2.setMaxValue(239);
        fc0Var2.setValue(120);
        fc0Var2.setWrapSelectorWheel(false);
        int i21 = 3;
        fc0Var2.setFormatter(new cg.p2(calendar, i20, i21));
        fc0 fc0Var3 = new fc0(context, c6Var);
        fc0Var3.setContentDescriptionCallback(new nh.c(i21));
        fc0Var3.setWrapSelectorWheel(true);
        fc0Var3.setAllItemsCount(24);
        fc0Var3.setItemCount(5);
        fc0Var3.setTextColor(iQ0);
        fc0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var3.setMinValue(0);
        fc0Var3.setMaxValue(23);
        fc0Var3.setFormatter(new c2(9));
        fc0 fc0Var4 = new fc0(context, c6Var);
        fc0Var4.setContentDescriptionCallback(new nh.c(4));
        fc0Var4.setWrapSelectorWheel(true);
        fc0Var4.setAllItemsCount(60);
        fc0Var4.setItemCount(5);
        fc0Var4.setTextColor(iQ0);
        fc0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        fc0Var4.setMinValue(0);
        fc0Var4.setMaxValue(59);
        fc0Var4.setValue(0);
        fc0Var4.setFormatter(new c2(10));
        calendar.setTimeInMillis(jCurrentTimeMillis);
        fc0Var4.setValue(calendar.get(12));
        fc0Var3.setValue(calendar.get(11));
        fc0Var.setValue(calendar.get(5));
        fc0Var2.setValue(calendar.get(2) + 120);
        pz0 pz0Var = new pz0(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        pz0Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pz0Var.a();
        pz0Var.n(1);
        pz0Var.o(iQ0);
        pz0 pz0Var2 = new pz0(":", 18.0f, null);
        pz0Var2.q(AndroidUtilities.dp(100.0f));
        pz0Var2.a();
        pz0Var2.n(1);
        pz0Var2.f31695a.setColor(iQ0);
        FrameLayout frameLayout = new FrameLayout(context);
        cg.p pVar = new cg.p(context, fc0Var2, fc0Var, fc0Var3, fc0Var4);
        pVar.setOrientation(1);
        frameLayout.addView(pVar, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        pVar.addView(frameLayout2, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(iQ0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        lh.m5 m5Var = new lh.m5(context, pz0Var2, fc0Var4, 4);
        m5Var.setOrientation(0);
        m5Var.setWeightSum(1.0f);
        pVar.addView(m5Var, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        lh.d dVar = new lh.d(context, c6Var, true);
        f1.a aVar = new f1.a(dVar, fc0Var, fc0Var2, fc0Var3, fc0Var4);
        m5Var.addView(fc0Var, h7.z5.l(0.2f, 0, 270));
        m5Var.addView(fc0Var2, h7.z5.l(0.4f, 0, 270));
        m5Var.addView(fc0Var3, h7.z5.l(0.2f, 0, 270));
        m5Var.addView(fc0Var4, h7.z5.l(0.2f, 0, 270));
        fc0Var.setOnValueChangedListener(aVar);
        fc0Var2.setOnValueChangedListener(aVar);
        fc0Var3.setOnValueChangedListener(aVar);
        fc0Var4.setOnValueChangedListener(aVar);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        pVar.addView(dVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new y1(zArr, fc0Var, fc0Var2, fc0Var3, fc0Var4, h0Var, new int[1], z2Var));
        z2Var.b(frameLayout);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
        e3Var.show();
        e3Var.setOnDismissListener(new e2(1, gcVar, zArr));
        e3Var.setBackgroundColor(iQ1);
        e3Var.fixNavigationBar(iQ1);
        y4.c(dVar, fc0Var, fc0Var2, fc0Var3, fc0Var4);
    }

    public void makeSelectedItalic() {
        xz0 xz0Var = new xz0();
        xz0Var.f34734a |= 2;
        l(new yz0(xz0Var, 0));
    }

    public void makeSelectedMono() {
        xz0 xz0Var = new xz0();
        xz0Var.f34734a |= 4;
        l(new yz0(xz0Var, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        xz0 xz0Var = new xz0();
        xz0Var.f34734a |= 256;
        l(new yz0(xz0Var, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        xz0 xz0Var = new xz0();
        xz0Var.f34734a |= 8;
        l(new yz0(xz0Var, 0));
    }

    public void makeSelectedUnderline() {
        xz0 xz0Var = new xz0();
        xz0Var.f34734a |= 16;
        l(new yz0(xz0Var, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        jt jtVar = this.delegate;
        if (jtVar != null) {
            jtVar.k1();
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (this.rightText == null || length() == 0 || (layout = getLayout()) == null || layout.getLineCount() <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.rightText.c(layout.getLineRight(0), (getHeight() / 2.0f) + AndroidUtilities.dp(1.0f), 1.0f, this.hintColor, canvas2);
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
        ArrayList arrayListD = cVar.d();
        int size = arrayListD.size();
        for (int i10 = 0; i10 < size; i10++) {
            s0.b bVar = (s0.b) arrayListD.get(i10);
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.f47653a).getId() == 268435456) {
                cVar.f47656a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.f47653a);
                break;
            }
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
        int iIndexOf;
        try {
            this.isInitLineCount = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
            super.onMeasure(i10, i11);
            if (this.isInitLineCount) {
                this.lineCount = getLineCount();
            }
            this.isInitLineCount = false;
        } catch (Exception e9) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(51.0f));
            FileLog.e(e9);
        }
        this.captionLayout = null;
        String str = this.caption;
        if (str == null || str.length() <= 0) {
            return;
        }
        Editable text = getText();
        if (text.length() <= 1 || text.charAt(0) != '@' || (iIndexOf = TextUtils.indexOf((CharSequence) text, ' ')) == -1) {
            return;
        }
        TextPaint paint = getPaint();
        int i12 = iIndexOf + 1;
        CharSequence charSequenceSubSequence = text.subSequence(0, i12);
        int iCeil = (int) Math.ceil(paint.measureText(text, 0, i12));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        this.userNameLength = charSequenceSubSequence.length();
        int i13 = measuredWidth - iCeil;
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.caption, paint, i13, TextUtils.TruncateAt.END);
        this.xOffset = iCeil;
        try {
            StaticLayout staticLayout = new StaticLayout(charSequenceEllipsize, getPaint(), i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.captionLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.xOffset = (int) (this.xOffset + (-this.captionLayout.getLineLeft(0)));
            }
            this.yOffset = ((getMeasuredHeight() - this.captionLayout.getLineBottom(0)) / 2) + AndroidUtilities.dp(0.5f);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gf.o.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class);
                    if (t5VarArr != null) {
                        for (t5 t5Var : t5VarArr) {
                            t5Var.applyFontMetrics(getPaint().getFontMetricsInt(), k5.g());
                        }
                    }
                    int iMax = Math.max(0, getSelectionStart());
                    int iMin = Math.min(getText().length(), getSelectionEnd());
                    gi0[] gi0VarArr = (gi0[]) getText().getSpans(iMax, iMin, gi0.class);
                    if (gi0VarArr == null || gi0VarArr.length <= 0) {
                        hi0.a(spannableStringBuilder);
                    } else {
                        gi0[] gi0VarArr2 = (gi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gi0.class);
                        for (int i11 = 0; i11 < gi0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(gi0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(gi0VarArr2[i11].f28717a);
                        }
                    }
                    setText(getText().replace(iMax, iMin, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + iMax, iMax + spannableStringBuilder.length());
                    return true;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        } else {
            try {
                if (i10 == 16908321) {
                    int iMax2 = Math.max(0, getSelectionStart());
                    int iMin2 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(iMax2, iMin2));
                    AndroidUtilities.findActivity(getContext()).closeContextMenu();
                    org.telegram.ui.ActionBar.g4 g4Var = this.floatingActionMode;
                    if (g4Var != null) {
                        g4Var.finish();
                    }
                    setSelection(iMax2, iMin2);
                    return true;
                }
                if (i10 == 16908320) {
                    int iMax3 = Math.max(0, getSelectionStart());
                    int iMin3 = Math.min(getText().length(), getSelectionEnd());
                    AndroidUtilities.addToClipboard(getText().subSequence(iMax3, iMin3));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (iMax3 != 0) {
                        spannableStringBuilder2.append(getText().subSequence(0, iMax3));
                    }
                    if (iMin3 != getText().length()) {
                        spannableStringBuilder2.append(getText().subSequence(iMin3, getText().length()));
                    }
                    setText(spannableStringBuilder2);
                    setSelection(iMax3, iMax3);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        if (Build.VERSION.SDK_INT >= 23 || z10 || !this.copyPasteShowed) {
            try {
                super.onWindowFocusChanged(z10);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    @Override
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return performMenuAction(i10) || super.performAccessibilityAction(i10, bundle);
    }

    public boolean performMenuAction(int i10) {
        if (i10 == R.id.menu_regular) {
            makeSelectedRegular();
            return true;
        }
        if (i10 == R.id.menu_bold) {
            makeSelectedBold();
            return true;
        }
        if (i10 == R.id.menu_italic) {
            makeSelectedItalic();
            return true;
        }
        if (i10 == R.id.menu_mono) {
            makeSelectedMono();
            return true;
        }
        if (i10 == R.id.menu_link) {
            makeSelectedUrl();
            return true;
        }
        if (i10 == R.id.menu_strike) {
            makeSelectedStrike();
            return true;
        }
        if (i10 == R.id.menu_underline) {
            makeSelectedUnderline();
            return true;
        }
        if (i10 == R.id.menu_spoiler) {
            makeSelectedSpoiler();
            return true;
        }
        if (i10 == R.id.menu_quote) {
            makeSelectedQuote();
            return true;
        }
        if (i10 == R.id.menu_date) {
            makeSelectedDate();
            return true;
        }
        if (i10 != R.id.menu_translate) {
            return false;
        }
        translateSelected();
        return true;
    }

    @Override
    public void removeStyle(int i10, int i11, int i12) {
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12) {
            return;
        }
        int iMin = Math.min(i12, text.length());
        int i13 = i10 & 256;
        if (i13 != 0) {
            i10 |= 512;
        }
        for (yz0 yz0Var : (yz0[]) text.getSpans(i11, iMin, yz0.class)) {
            xz0 xz0Var = yz0Var.f35101b;
            int i14 = xz0Var.f34734a;
            if ((i14 & i10) != 0) {
                int spanStart = text.getSpanStart(yz0Var);
                int spanEnd = text.getSpanEnd(yz0Var);
                text.removeSpan(yz0Var);
                if (spanStart < i11) {
                    text.setSpan(new yz0(new xz0(xz0Var), 0), spanStart, i11, 33);
                }
                if (spanEnd > iMin) {
                    text.setSpan(new yz0(new xz0(xz0Var), 0), iMin, spanEnd, 33);
                }
                int iMax = Math.max(spanStart, i11);
                int iMin2 = Math.min(spanEnd, iMin);
                int i15 = i14 & (~i10);
                if (i15 != 0 && iMax < iMin2) {
                    xz0 xz0Var2 = new xz0(xz0Var);
                    xz0Var2.f34734a = i15;
                    text.setSpan(new yz0(xz0Var2, 0), iMax, iMin2, 33);
                }
            }
        }
        if (i13 != 0) {
            invalidateSpoilers();
        }
        jt jtVar = this.delegate;
        if (jtVar != null) {
            jtVar.k1();
        }
    }

    public void setAllowTextEntitiesIntersection(boolean z10) {
        this.allowTextEntitiesIntersection = z10;
    }

    public void setCaption(String str) {
        String str2 = this.caption;
        if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
            return;
        }
        String str3 = this.caption;
        if (str3 == null || !str3.equals(str)) {
            this.caption = str;
            if (str != null) {
                this.caption = str.replace('\n', ' ');
            }
            requestLayout();
        }
    }

    public void setDelegate(jt jtVar) {
        this.delegate = jtVar;
    }

    @Override
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new pz0(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, kt ktVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, ktVar);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        ht htVar = new ht(this, callback);
        ActionMode.Callback h9Var = htVar;
        if (Build.VERSION.SDK_INT >= 23) {
            h9Var = new org.telegram.ui.Cells.h9(htVar, callback);
        }
        return super.startActionMode(h9Var);
    }

    public void toggleStyleForSelection(int i10) {
        if (getText() == null) {
            return;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0) {
            return;
        }
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        if (selectionStart >= selectionEnd) {
            return;
        }
        if ((getCurrentStyle(selectionStart, selectionEnd) & i10) != 0) {
            removeStyle(i10, selectionStart, selectionEnd);
            return;
        }
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
    }

    public void translateSelected() {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart < 0 || (selectionEnd = this.selectionEnd) < 0) {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        CharSequence charSequenceSubSequence = getText().subSequence(selectionStart, selectionEnd);
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        m31 m31Var = new m31(getContext(), n2VarU != null ? n2VarU.getResourceProvider() : null);
        m31Var.W = charSequenceSubSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(charSequenceSubSequence.toString(), new vu(m31Var, 25), new pc0(19));
        }
        m31Var.Z = new ft(this, selectionStart, selectionEnd);
        m31Var.show();
        setSelection(selectionStart, selectionEnd);
    }

    public void makeSelectedQuote(boolean z10) {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart < 0 || (selectionEnd = this.selectionEnd) < 0) {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        int iC = hi0.c(getText(), selectionStart, selectionEnd, z10);
        if (iC >= 0) {
            setSelection(iC);
            resetFontMetricsCache();
        }
        invalidateQuotes(true);
        invalidateSpoilers();
    }

    public void makeSelectedUrl(Runnable runnable) {
        int selectionEnd;
        int selectionStart = this.selectionStart;
        if (selectionStart < 0 || (selectionEnd = this.selectionEnd) < 0) {
            selectionStart = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        }
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new cg.o2(this, selectionStart, selectionEnd, runnable));
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, kt ktVar) {
        CharSequence charSequenceCoerceToText;
        ?? e2Var = z11 ? new org.telegram.ui.ActionBar.e2(getContext(), 0, this.resourcesProvider) : new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.f22702a;
        b2Var.N = str;
        ?? frameLayout = new FrameLayout(getContext());
        hh.o oVar = new hh.o(getContext(), 3);
        String str4 = str3 == null ? "" : str3;
        oVar.setTextSize(1, 18.0f);
        oVar.setText(str4);
        oVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, this.resourcesProvider));
        oVar.setHintText(str2);
        oVar.setHeaderHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, this.resourcesProvider));
        oVar.setSingleLine(true);
        oVar.setFocusable(true);
        oVar.setTransformHintToHeader(true);
        oVar.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23181k6, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23198l6, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, this.resourcesProvider));
        oVar.setImeOptions(6);
        oVar.setBackgroundDrawable(null);
        oVar.requestFocus();
        oVar.setPadding(0, 0, 0, 0);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23366uf, this.resourcesProvider));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23382vf, this.resourcesProvider));
        frameLayout.addView(oVar, h7.z5.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        org.telegram.ui.Cells.pa.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.pa.c(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23251o6, this.resourcesProvider);
        textView.setTextColor(iV0);
        int iDp = AndroidUtilities.dp(6.0f);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.12f, iV0);
        int iL2 = org.telegram.ui.ActionBar.g6.l1(0.15f, iV0);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iL1, iL2, iL2));
        h7.b6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, h7.z5.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        cg.j jVar = new cg.j(this, z10, oVar, str4, textView);
        textView.setOnClickListener(new gg.f(this, oVar, jVar, 25));
        oVar.addTextChangedListener(new ch.e(jVar, 8));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequenceCoerceToText = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e9) {
                FileLog.e(e9);
                charSequenceCoerceToText = null;
            }
            if (charSequenceCoerceToText != null) {
                oVar.setText(charSequenceCoerceToText);
                oVar.setSelection(0, oVar.getText().length());
            }
        }
        jVar.run();
        e2Var.n(frameLayout);
        e2Var.k(LocaleController.getString(R.string.OK), new g1(19, ktVar, oVar));
        e2Var.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = b2Var;
            b2Var.setOnDismissListener(new a1(this, 5));
            this.creationLinkDialog.setOnShowListener(new gt(0, oVar));
            this.creationLinkDialog.q(250L);
        } else {
            e2Var.o().setOnShowListener(new gt(1, oVar));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int iDp2 = AndroidUtilities.dp(24.0f);
            marginLayoutParams.leftMargin = iDp2;
            marginLayoutParams.rightMargin = iDp2;
            marginLayoutParams.height = AndroidUtilities.dp(36.0f);
            oVar.setLayoutParams(marginLayoutParams);
        }
        oVar.setSelection(0, oVar.getText().length());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        ht htVar = new ht(this, callback);
        ActionMode.Callback h9Var = htVar;
        if (Build.VERSION.SDK_INT >= 23) {
            h9Var = new org.telegram.ui.Cells.h9(htVar, callback);
        }
        return super.startActionMode(h9Var, i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
