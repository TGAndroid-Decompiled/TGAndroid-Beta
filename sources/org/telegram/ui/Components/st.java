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
public class st extends EditTextBoldCursor implements org.telegram.ui.ActionBar.u4 {
    private static final int ACCESSIBILITY_ACTION_SHARE = 268435456;
    private static final int[] STYLE_FLAGS = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public static final int f32718b = 0;
    public boolean adaptiveCreateLinkDialog;
    private boolean allowTextEntitiesIntersection;
    private String caption;
    private StaticLayout captionLayout;
    private boolean copyPasteShowed;
    private org.telegram.ui.ActionBar.c2 creationLinkDialog;
    private qt delegate;
    private int hintColor;
    private boolean isInitLineCount;
    private int lineCount;
    private final org.telegram.ui.ActionBar.c6 resourcesProvider;
    private zz0 rightText;
    private int selectionEnd;
    private int selectionStart;
    private int userNameLength;
    private int xOffset;
    private int yOffset;

    public st(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.resourcesProvider = c6Var;
        this.quoteColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sc, c6Var);
        addTextChangedListener(new bh.c(this, 7));
        setClipToPadding(true);
    }

    public static void i(st stVar) {
        stVar.creationLinkDialog = null;
        stVar.requestFocus();
    }

    public static void j(st stVar, int i10, int i11, int i12, int i13) {
        Editable text = stVar.getText();
        ?? obj = new Object();
        obj.f29024a |= 128;
        obj.f29025b = i10;
        obj.f29026c = i11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.date = i12;
        tL_messageEntityFormattedDate.flags = i13;
        tL_messageEntityFormattedDate.applyFlags();
        try {
            text.setSpan(new d10(text.subSequence(i10, i11).toString(), obj, tL_messageEntityFormattedDate), i10, i11, 33);
        } catch (Exception unused) {
        }
        qt qtVar = stVar.delegate;
        if (qtVar != null) {
            qtVar.e1();
        }
    }

    public static void k(st stVar, int i10, int i11, Runnable runnable, String str) {
        Editable text = stVar.getText();
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof y5) && !(characterStyle instanceof pi0)) {
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
            text.setSpan(stVar.createUrlSpan(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        qt qtVar = stVar.delegate;
        if (qtVar != null) {
            qtVar.e1();
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
            obj.f29024a = i10;
            MediaDataController.addStyleToText(new i01(obj, 0), i11, min, text, true);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            qt qtVar = this.delegate;
            if (qtVar != null) {
                qtVar.e1();
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

    public c51 createUrlSpan(String str) {
        return new c51(str, null);
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
        i01[] i01VarArr = (i01[]) text.getSpans(max, min, i01.class);
        int i12 = 0;
        for (int i13 : STYLE_FLAGS) {
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < i01VarArr.length; i15++) {
                    i01 i01Var = i01VarArr[i15];
                    int i16 = i01Var.f29294b.f29024a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(i01Var);
                        int spanEnd = text.getSpanEnd(i01VarArr[i15]);
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

    public final void l(i01 i01Var) {
        int selectionEnd;
        int i10 = this.selectionStart;
        if (i10 >= 0 && (selectionEnd = this.selectionEnd) >= 0) {
            this.selectionEnd = -1;
            this.selectionStart = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        MediaDataController.addStyleToText(i01Var, i10, selectionEnd, getText(), this.allowTextEntitiesIntersection);
        if (i01Var == null) {
            Editable text = getText();
            for (CodeHighlighting.Span span : (CodeHighlighting.Span[]) text.getSpans(i10, selectionEnd, CodeHighlighting.Span.class)) {
                text.removeSpan(span);
            }
            qi0[] qi0VarArr = (qi0[]) text.getSpans(i10, selectionEnd, qi0.class);
            for (int i11 = 0; i11 < qi0VarArr.length; i11++) {
                text.removeSpan(qi0VarArr[i11]);
                text.removeSpan(qi0VarArr[i11].f31963s);
                pa0 pa0Var = qi0VarArr[i11].v;
                if (pa0Var != null) {
                    text.removeSpan(pa0Var);
                }
            }
            if (qi0VarArr.length > 0) {
                invalidateQuotes(true);
            }
        }
        qt qtVar = this.delegate;
        if (qtVar != null) {
            qtVar.e1();
        }
    }

    public void makeSelectedBold() {
        ?? obj = new Object();
        obj.f29024a |= 1;
        l(new i01(obj, 0));
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
        jh.g0 g0Var = new jh.g0(this, i10, selectionEnd);
        g5 g5Var = new g5(11);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        Pattern pattern = c5.f27308a;
        if (context == null) {
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        if (c6Var != null) {
            w02 = c6Var.h0(i11);
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        }
        int i12 = w02;
        int i13 = org.telegram.ui.ActionBar.g6.f23133h5;
        if (c6Var != null) {
            w03 = c6Var.h0(i13);
        } else {
            w03 = org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        }
        int i14 = w03;
        int i15 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.h0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.h0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.h0(i17);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.h0(i18);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.g6.f23152i6;
        if (c6Var != null) {
            c6Var.h0(i19);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.g6.Sh;
        if (c6Var != null) {
            c6Var.h0(i20);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.g6.Oh;
        if (c6Var != null) {
            c6Var.h0(i21);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i21, false);
        }
        int i22 = org.telegram.ui.ActionBar.g6.Qh;
        if (c6Var != null) {
            c6Var.h0(i22);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i22, false);
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, c6Var);
        a3Var.a();
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i23 = calendar.get(1);
        qc0 qc0Var = new qc0(context, c6Var);
        qc0Var.setTextColor(i12);
        qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qc0Var.setItemCount(5);
        qc0Var.setMinValue(1);
        qc0Var.setMaxValue(31);
        qc0Var.setWrapSelectorWheel(false);
        qc0Var.setFormatter(new n0(27));
        qc0 qc0Var2 = new qc0(context, c6Var);
        qc0Var2.setTextColor(i12);
        qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        qc0Var2.setItemCount(5);
        qc0Var2.setMinValue(0);
        qc0Var2.setMaxValue(239);
        qc0Var2.setValue(120);
        qc0Var2.setWrapSelectorWheel(false);
        qc0Var2.setFormatter(new eg.n2(calendar, i23, 3));
        qc0 qc0Var3 = new qc0(context, c6Var);
        qc0Var3.setContentDescriptionCallback(new org.telegram.ui.rh(2));
        qc0Var3.setWrapSelectorWheel(true);
        qc0Var3.setAllItemsCount(24);
        qc0Var3.setItemCount(5);
        qc0Var3.setTextColor(i12);
        qc0Var3.setTextOffset(AndroidUtilities.dp(10.0f));
        qc0Var3.setMinValue(0);
        qc0Var3.setMaxValue(23);
        qc0Var3.setFormatter(new n0(28));
        qc0 qc0Var4 = new qc0(context, c6Var);
        qc0Var4.setContentDescriptionCallback(new org.telegram.ui.rh(3));
        qc0Var4.setWrapSelectorWheel(true);
        qc0Var4.setAllItemsCount(60);
        qc0Var4.setItemCount(5);
        qc0Var4.setTextColor(i12);
        qc0Var4.setTextOffset(-AndroidUtilities.dp(10.0f));
        qc0Var4.setMinValue(0);
        qc0Var4.setMaxValue(59);
        qc0Var4.setValue(0);
        qc0Var4.setFormatter(new n0(29));
        calendar.setTimeInMillis(currentTimeMillis);
        qc0Var4.setValue(calendar.get(12));
        qc0Var3.setValue(calendar.get(11));
        qc0Var.setValue(calendar.get(5));
        qc0Var2.setValue(calendar.get(2) + 120);
        zz0 zz0Var = new zz0(LocaleController.formatString(R.string.formatDateAtTime, "", "").trim(), 16.0f, null);
        zz0Var.q(AndroidUtilities.dp(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        zz0Var.a();
        zz0Var.n(1);
        zz0Var.o(i12);
        zz0 zz0Var2 = new zz0(":", 18.0f, null);
        zz0Var2.q(AndroidUtilities.dp(100.0f));
        zz0Var2.a();
        zz0Var2.n(1);
        zz0Var2.f35460a.setColor(i12);
        FrameLayout frameLayout = new FrameLayout(context);
        eg.q qVar = new eg.q(context, qc0Var2, qc0Var, qc0Var3, qc0Var4);
        qVar.setOrientation(1);
        frameLayout.addView(qVar, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        qVar.addView(frameLayout2, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.RelativeDateAddDate));
        textView.setTextColor(i12);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new mh.d(10));
        bg.l0 l0Var = new bg.l0(context, zz0Var2, qc0Var4, 5);
        l0Var.setOrientation(0);
        l0Var.setWeightSum(1.0f);
        qVar.addView(l0Var, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        nh.d dVar = new nh.d(context, c6Var, true);
        f1.a aVar = new f1.a(dVar, qc0Var, qc0Var2, qc0Var3, qc0Var4);
        l0Var.addView(qc0Var, i7.f6.l(0.2f, 0, 270));
        l0Var.addView(qc0Var2, i7.f6.l(0.4f, 0, 270));
        l0Var.addView(qc0Var3, i7.f6.l(0.2f, 0, 270));
        l0Var.addView(qc0Var4, i7.f6.l(0.2f, 0, 270));
        qc0Var.setOnValueChangedListener(aVar);
        qc0Var2.setOnValueChangedListener(aVar);
        qc0Var3.setOnValueChangedListener(aVar);
        qc0Var4.setOnValueChangedListener(aVar);
        boolean[] zArr = {true};
        dVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dVar.e();
        qVar.addView(dVar, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new c2(zArr, qc0Var, qc0Var2, qc0Var3, qc0Var4, g0Var, new int[1], a3Var));
        a3Var.b(frameLayout);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
        f3Var.show();
        f3Var.setOnDismissListener(new h2(1, g5Var, zArr));
        f3Var.setBackgroundColor(i14);
        f3Var.fixNavigationBar(i14);
        c5.c(dVar, qc0Var, qc0Var2, qc0Var3, qc0Var4);
    }

    public void makeSelectedItalic() {
        ?? obj = new Object();
        obj.f29024a |= 2;
        l(new i01(obj, 0));
    }

    public void makeSelectedMono() {
        ?? obj = new Object();
        obj.f29024a |= 4;
        l(new i01(obj, 0));
    }

    public void makeSelectedQuote() {
        makeSelectedQuote(false);
    }

    public void makeSelectedRegular() {
        l(null);
    }

    public void makeSelectedSpoiler() {
        ?? obj = new Object();
        obj.f29024a |= 256;
        l(new i01(obj, 0));
        invalidateSpoilers();
    }

    public void makeSelectedStrike() {
        ?? obj = new Object();
        obj.f29024a |= 8;
        l(new i01(obj, 0));
    }

    public void makeSelectedUnderline() {
        ?? obj = new Object();
        obj.f29024a |= 16;
        l(new i01(obj, 0));
    }

    public void makeSelectedUrl() {
        makeSelectedUrl(null);
    }

    public void notifySpansChanged() {
        qt qtVar = this.delegate;
        if (qtVar != null) {
            qtVar.e1();
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
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.f47479a).getId() == 268435456) {
                cVar.f47482a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.f47479a);
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
        } catch (Exception e10) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(51.0f));
            FileLog.e(e10);
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
                } catch (Exception e11) {
                    FileLog.e(e11);
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jf.n.a(primaryClip.getItemAt(0).getHtmlText()));
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, getPaint().getFontMetricsInt(), false, (int[]) null);
                    y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                    if (y5VarArr != null) {
                        for (y5 y5Var : y5VarArr) {
                            y5Var.applyFontMetrics(getPaint().getFontMetricsInt(), p5.g());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    pi0[] pi0VarArr = (pi0[]) getText().getSpans(max, min, pi0.class);
                    if (pi0VarArr != null && pi0VarArr.length > 0) {
                        pi0[] pi0VarArr2 = (pi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pi0.class);
                        for (int i11 = 0; i11 < pi0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(pi0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(pi0VarArr2[i11].f31683a);
                        }
                    } else {
                        qi0.a(spannableStringBuilder);
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

    @Override
    public void removeStyle(int i10, int i11, int i12) {
        i01[] i01VarArr;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12) {
            int min = Math.min(i12, text.length());
            int i13 = i10 & 256;
            if (i13 != 0) {
                i10 |= 512;
            }
            for (i01 i01Var : (i01[]) text.getSpans(i11, min, i01.class)) {
                h01 h01Var = i01Var.f29294b;
                int i14 = h01Var.f29024a;
                if ((i14 & i10) != 0) {
                    int spanStart = text.getSpanStart(i01Var);
                    int spanEnd = text.getSpanEnd(i01Var);
                    text.removeSpan(i01Var);
                    if (spanStart < i11) {
                        text.setSpan(new i01(new h01(h01Var), 0), spanStart, i11, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new i01(new h01(h01Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i11);
                    int min2 = Math.min(spanEnd, min);
                    int i15 = i14 & (~i10);
                    if (i15 != 0 && max < min2) {
                        h01 h01Var2 = new h01(h01Var);
                        h01Var2.f29024a = i15;
                        text.setSpan(new i01(h01Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i13 != 0) {
                invalidateSpoilers();
            }
            qt qtVar = this.delegate;
            if (qtVar != null) {
                qtVar.e1();
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

    public void setDelegate(qt qtVar) {
        this.delegate = qtVar;
    }

    @Override
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.hintColor = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.rightText = new zz0(charSequence, 16.0f, getTypeface());
    }

    public void setSelectionOverride(int i10, int i11) {
        this.selectionStart = i10;
        this.selectionEnd = i11;
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, rt rtVar) {
        showInputDialog(str, str2, str3, z10, this.adaptiveCreateLinkDialog, rtVar);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        pt ptVar = new pt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            ptVar = new org.telegram.ui.Cells.i9(ptVar, callback);
        }
        return super.startActionMode(ptVar);
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
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        Context context = getContext();
        if (U != null) {
            c6Var = U.getResourceProvider();
        } else {
            c6Var = null;
        }
        v31 v31Var = new v31(context, c6Var);
        v31Var.W = subSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(subSequence.toString(), new cv(v31Var, 25), new xo0(8));
        }
        v31Var.Z = new nt(this, i10, selectionEnd);
        v31Var.show();
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
        int c3 = qi0.c(getText(), i10, selectionEnd, z10);
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
        showInputDialog(LocaleController.getString(R.string.CreateLink), LocaleController.getString(R.string.URL), "http://", true, new eg.m2(this, i10, selectionEnd, runnable));
    }

    public void showInputDialog(String str, String str2, String str3, boolean z10, boolean z11, rt rtVar) {
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f22714a;
        c2Var.N = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        jh.m mVar = new jh.m(getContext(), 2);
        String str4 = str3 == null ? "" : str3;
        mVar.setTextSize(1, 18.0f);
        mVar.setText(str4);
        mVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, this.resourcesProvider));
        mVar.setHintText(str2);
        mVar.setHeaderHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, this.resourcesProvider));
        mVar.setSingleLine(true);
        mVar.setFocusable(true);
        mVar.setTransformHintToHeader(true);
        mVar.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23189k6, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23206l6, this.resourcesProvider), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23279p7, this.resourcesProvider));
        mVar.setImeOptions(6);
        mVar.setBackgroundDrawable(null);
        mVar.requestFocus();
        mVar.setPadding(0, 0, 0, 0);
        mVar.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23374uf, this.resourcesProvider));
        mVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23392vf, this.resourcesProvider));
        frameLayout.addView(mVar, i7.f6.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        org.telegram.ui.th.n(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.b.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23260o6, this.resourcesProvider);
        textView.setTextColor(v02);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.12f, v02);
        int l12 = org.telegram.ui.ActionBar.g6.l1(0.15f, v02);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, l1, l12, l12));
        i7.h6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, i7.f6.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z10 ? 0 : 8);
        eg.j jVar = new eg.j(this, z10, mVar, str4, textView);
        textView.setOnClickListener(new bg.q(this, mVar, jVar, 26));
        mVar.addTextChangedListener(new bh.c(jVar, 8));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e10) {
                FileLog.e(e10);
                charSequence = null;
            }
            if (charSequence != null) {
                mVar.setText(charSequence);
                mVar.setSelection(0, mVar.getText().length());
            }
        }
        jVar.run();
        alertDialog$Builder2.n(frameLayout);
        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new j1(19, rtVar, mVar));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        if (z11) {
            this.creationLinkDialog = c2Var;
            c2Var.setOnDismissListener(new d1(this, 5));
            this.creationLinkDialog.setOnShowListener(new ot(0, mVar));
            this.creationLinkDialog.q(250L);
        } else {
            alertDialog$Builder2.o().setOnShowListener(new ot(1, mVar));
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
        pt ptVar = new pt(this, callback);
        if (Build.VERSION.SDK_INT >= 23) {
            ptVar = new org.telegram.ui.Cells.i9(ptVar, callback);
        }
        return super.startActionMode(ptVar, i10);
    }

    public void onContextMenuClose() {
    }

    public void onContextMenuOpen() {
    }

    public void onLineCountChanged(int i10, int i11) {
    }
}
