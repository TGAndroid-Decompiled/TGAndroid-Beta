package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.qz0;

public abstract class j extends FrameLayout {
    public static final int T = AndroidUtilities.dp(76.0f);
    public static final int U = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public final m80 A;
    public h B;
    public t80 C;
    public final org.telegram.ui.ActionBar.n2 D;
    public final org.telegram.ui.ActionBar.c6 E;
    public final FrameLayout F;
    public final z G;
    public StaticLayout H;
    public StaticLayout[] I;
    public int J;
    public Point[] K;
    public boolean L;
    public boolean M;
    public final float N;
    public final f O;
    public float P;
    public ValueAnimator Q;
    public int R;
    public boolean S;

    public StaticLayout f24504a;

    public String f24505b;

    public int f24506c;
    public int d;

    public SpannableStringBuilder f24507e;

    public SpannableStringBuilder f24508f;
    public final TextView h;

    public final c f24509n;

    public final FrameLayout f24510r;

    public final FrameLayout f24511s;
    public final Drawable v;

    public q80 f24512w;

    public float f24513x;

    public StaticLayout f24514y;

    public j(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        new Point();
        new j80(0);
        this.I = null;
        this.J = -1;
        this.L = false;
        Paint paint = new Paint();
        this.N = AndroidUtilities.dp(3.0f);
        this.O = new f(this);
        this.P = 0.0f;
        this.R = 0;
        this.S = false;
        this.E = c6Var;
        this.D = n2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.A = new m80(frameLayout);
        this.G = org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        rl.l(org.telegram.ui.ActionBar.g6.f23441z6, c6Var, textView, 1, 13.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f24511s = frameLayout2;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.gradient_bottom).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_ATOP));
        frameLayout2.setBackground(drawableMutate);
        addView(frameLayout2, h7.z5.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, h7.z5.e(-1, -1, 55));
        c cVar = new c(context);
        cVar.f24140a = false;
        this.f24509n = cVar;
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var));
        cVar.setTextSize(1, 16.0f);
        cVar.setLines(1);
        cVar.setMaxLines(1);
        cVar.setSingleLine(true);
        cVar.setText(LocaleController.getString(R.string.DescriptionMore));
        cVar.setOnClickListener(new a(this, 0));
        cVar.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f24510r = frameLayout3;
        Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.v = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        frameLayout3.setBackground(drawableMutate2);
        frameLayout3.setPadding(AndroidUtilities.dp(4.0f) + frameLayout3.getPaddingLeft(), AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout3.addView(cVar, h7.z5.c(-2.0f, -2));
        addView(frameLayout3, h7.z5.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / AndroidUtilities.density), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / AndroidUtilities.density), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i10, CharSequence charSequence) {
        Layout.Alignment alignmentA;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, org.telegram.ui.ActionBar.g6.P1, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.g6.P1, Math.max(1, i10)).setBreakStrategy(0).setHyphenationFrequency(0);
        if (LocaleController.isRTL) {
            alignmentA = tv0.a();
        } else {
            Layout.Alignment[] alignmentArr = tv0.f32901a;
            alignmentA = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignmentA).build();
    }

    private void setHeight(int i10) {
        f2.y0 y0Var = (f2.y0) getLayoutParams();
        boolean z10 = true;
        if (y0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            y0Var = new f2.y0(-1, i10);
        } else {
            z10 = ((ViewGroup.MarginLayoutParams) y0Var).height != i10;
            ((ViewGroup.MarginLayoutParams) y0Var).height = i10;
        }
        if (z10) {
            setLayoutParams(y0Var);
        }
    }

    private void setShowMoreMarginBottom(int i10) {
        FrameLayout frameLayout = this.f24510r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i10) {
            layoutParams.bottomMargin = i10;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i10, boolean z10) {
        if (this.M) {
            this.S = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.f24507e;
        FrameLayout frameLayout = this.F;
        c cVar = this.f24509n;
        if (spannableStringBuilder != null && (i10 != this.R || z10)) {
            StaticLayout staticLayoutC = c(i10, spannableStringBuilder);
            this.f24504a = staticLayoutC;
            this.S = staticLayoutC.getLineCount() >= 4;
            int lineCount = this.f24504a.getLineCount();
            FrameLayout frameLayout2 = this.f24510r;
            if (lineCount >= 3 && this.S) {
                int iMax = Math.max(this.f24504a.getLineStart(2), this.f24504a.getLineEnd(2));
                if (this.f24507e.charAt(iMax - 1) == '\n') {
                    iMax--;
                }
                int i11 = iMax - 1;
                this.L = (this.f24507e.charAt(i11) == ' ' || this.f24507e.charAt(i11) == '\n') ? false : true;
                this.H = c(i10, this.f24507e.subSequence(0, iMax));
                this.I = new StaticLayout[this.f24504a.getLineCount() - 3];
                this.K = new Point[this.f24504a.getLineCount() - 3];
                float lineRight = this.H.getLineRight(this.H.getLineCount() - 1);
                boolean z11 = this.L;
                float f10 = this.N;
                float lineRight2 = lineRight + (z11 ? f10 : 0.0f);
                this.J = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i12 = U;
                    frameLayout2.measure(i12, i12);
                }
                for (int i13 = 3; i13 < this.f24504a.getLineCount(); i13++) {
                    int lineStart = this.f24504a.getLineStart(i13);
                    int lineEnd = this.f24504a.getLineEnd(i13);
                    StaticLayout staticLayoutC2 = c(i10, this.f24507e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i14 = i13 - 3;
                    this.I[i14] = staticLayoutC2;
                    this.K[i14] = new Point();
                    if (this.J == -1) {
                        if (lineRight2 > frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                            this.J = i14;
                        }
                    }
                    lineRight2 += staticLayoutC2.getLineRight(0) + f10;
                }
                if (lineRight2 < frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                    this.S = false;
                }
            }
            if (!this.S) {
                this.H = null;
                this.I = null;
            }
            this.R = i10;
            frameLayout.setMinimumHeight(g());
            if (this.S && this.H != null) {
                int iMin = Math.min(T + (this.h.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), g()) - AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.H;
                setShowMoreMarginBottom((((iMin - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - cVar.getPaddingBottom()) - (cVar.getLayout() == null ? 0 : cVar.getLayout().getHeight() - cVar.getLayout().getLineBottom(cVar.getLineCount() - 1)));
            }
        }
        cVar.setVisibility(this.S ? 0 : 8);
        if (!this.S && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.G);
        }
        if (!this.S || this.P >= 1.0f || frameLayout.getBackground() == null) {
            return;
        }
        frameLayout.setBackground(null);
    }

    public final q80 b(StaticLayout staticLayout, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i15);
            float f10 = i14;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f10);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft > f10 || lineLeft + staticLayout.getLineWidth(lineForVertical) < f10 || i15 < 0 || i15 > staticLayout.getHeight()) {
                return null;
            }
            Spannable spannable = (Spannable) staticLayout.getText();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 0 || AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return null;
            }
            q80 q80Var = new q80(clickableSpanArr[0], this.E, i12, i13, 0);
            q80Var.d(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, this.E));
            int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
            int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
            j80 j80VarB = q80Var.b();
            float f11 = i11;
            this.f24513x = f11;
            j80VarB.d(staticLayout, spanStart, f11);
            staticLayout.getSelectionPath(spanStart, spanEnd, j80VarB);
            return q80Var;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f10) {
        h hVar = this.B;
        h hVar2 = null;
        if (hVar != null) {
            hVar.a(false);
            this.B = null;
        }
        if (layout != null && clickableSpan != null) {
            hVar2 = new h(this, layout, clickableSpan, f10);
        }
        this.B = hVar2;
        if (clickableSpan instanceof r41) {
            String url = ((r41) clickableSpan).getURL();
            if (url.startsWith("@") || url.startsWith("#") || url.startsWith("$") || url.startsWith("/")) {
                ((qz0) this).V.f43554e.B4(url, this.B);
                return;
            }
            return;
        }
        if (!(clickableSpan instanceof URLSpan)) {
            clickableSpan.onClick(this);
            return;
        }
        String url2 = ((URLSpan) clickableSpan).getURL();
        if (!AndroidUtilities.shouldShowUrlInAlert(url2)) {
            we.e.q(getContext(), Uri.parse(url2), true, true, this.B);
        } else {
            org.telegram.ui.Components.y4.r0(this.D, url2, true, true, true, false, this.B, null, null);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float fPow;
        float f13;
        StaticLayout staticLayout;
        int i10;
        super.draw(canvas);
        View view = (View) getParent();
        float fPow2 = view == null ? 1.0f : (float) Math.pow(view.getAlpha(), 2.0d);
        canvas.save();
        canvas.clipRect(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(18.0f), getHeight());
        int iDp = AndroidUtilities.dp(18.0f);
        this.f24506c = iDp;
        float f14 = 0.0f;
        canvas.translate(iDp, 0.0f);
        m80 m80Var = this.A;
        if (m80Var != null && m80Var.f(canvas)) {
            invalidate();
        }
        int iDp2 = AndroidUtilities.dp(8.0f);
        this.d = iDp2;
        canvas.translate(0.0f, iDp2);
        try {
            org.telegram.ui.ActionBar.g6.P1.linkColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.E);
            StaticLayout staticLayout2 = this.H;
            try {
                if (staticLayout2 == null || !this.S) {
                    f10 = 0.0f;
                    f11 = 255.0f;
                    StaticLayout staticLayout3 = this.f24504a;
                    if (staticLayout3 != null) {
                        staticLayout3.draw(canvas);
                    }
                } else {
                    staticLayout2.draw(canvas);
                    int lineCount = this.H.getLineCount() - 1;
                    float lineTop = this.H.getLineTop(lineCount) + this.H.getTopPadding();
                    float lineRight = this.H.getLineRight(lineCount);
                    boolean z10 = this.L;
                    float f15 = this.N;
                    float f16 = lineRight + (z10 ? f15 : 0.0f);
                    float lineBottom = (this.H.getLineBottom(lineCount) - this.H.getLineTop(lineCount)) - this.H.getBottomPadding();
                    float fPow3 = 1.0f - ((float) Math.pow(this.P, 0.25d));
                    if (fPow3 < 0.5d) {
                        fPow = com.google.android.recaptcha.internal.a.C(fPow3, 4.0f, fPow3, fPow3);
                        f12 = 255.0f;
                    } else {
                        f12 = 255.0f;
                        fPow = 1.0f - (((float) Math.pow((fPow3 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                    }
                    float f17 = fPow;
                    if (this.I != null) {
                        float f18 = f16;
                        int i11 = 0;
                        while (true) {
                            StaticLayout[] staticLayoutArr = this.I;
                            if (i11 >= staticLayoutArr.length) {
                                break;
                            }
                            StaticLayout staticLayout4 = staticLayoutArr[i11];
                            if (staticLayout4 != null) {
                                int iSave = canvas.save();
                                Point point = this.K[i11];
                                if (point != null) {
                                    point.set((int) ((f18 * f17) + this.f24506c), (int) com.google.android.recaptcha.internal.a.z(1.0f, f17, lineBottom, this.d + lineTop));
                                }
                                int i12 = this.J;
                                if (i12 == -1 || i12 > i11) {
                                    staticLayout = staticLayout4;
                                    i10 = iSave;
                                    f13 = lineTop;
                                    canvas.translate(f18 * f17, com.google.android.recaptcha.internal.a.z(1.0f, f17, lineBottom, f13));
                                } else {
                                    canvas.translate(f14, lineTop + lineBottom);
                                    float width = staticLayout4.getWidth();
                                    float height = staticLayout4.getHeight();
                                    int i13 = (int) (this.P * f12);
                                    i10 = iSave;
                                    staticLayout = staticLayout4;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, width, height, i13, 31);
                                    f13 = lineTop;
                                }
                                staticLayout.draw(canvas);
                                canvas.restoreToCount(i10);
                                float lineRight2 = staticLayout.getLineRight(0) + f15 + f18;
                                lineBottom += (staticLayout.getLineBottom(0) + staticLayout.getTopPadding()) - 1;
                                f18 = lineRight2;
                            } else {
                                i11 = i11;
                                f13 = lineTop;
                            }
                            i11++;
                            lineTop = f13;
                            f14 = 0.0f;
                            f12 = 255.0f;
                        }
                    }
                    f10 = 0.0f;
                    f11 = 255.0f;
                }
            } catch (Exception e9) {
                e = e9;
                FileLog.e(e);
            }
        } catch (Exception e10) {
            e = e10;
            f10 = 0.0f;
            f11 = 255.0f;
        }
        canvas.restore();
        FrameLayout frameLayout = this.f24510r;
        float alpha = frameLayout.getAlpha();
        if (alpha > f10) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * f11), 31);
            this.v.setAlpha((int) (fPow2 * f11));
            canvas.translate(frameLayout.getLeft(), frameLayout.getTop());
            frameLayout.draw(canvas);
            canvas.restore();
        }
        FrameLayout frameLayout2 = this.f24511s;
        float alpha2 = frameLayout2.getAlpha();
        if (alpha2 > f10) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha2 * f11), 31);
            canvas.translate(frameLayout2.getLeft(), frameLayout2.getTop());
            frameLayout2.draw(canvas);
            canvas.restore();
        }
        this.F.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.A.d(true);
        this.f24512w = null;
        AndroidUtilities.cancelRunOnUIThread(this.O);
        invalidate();
    }

    public final void f(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.f24505b)) {
            return;
        }
        try {
            this.f24505b = AndroidUtilities.getSafeString(str);
        } catch (Throwable unused) {
            this.f24505b = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24505b);
        this.f24507e = spannableStringBuilder;
        this.f24508f = null;
        MessageObject.addLinks(false, spannableStringBuilder, false, false, !z10);
        Emoji.replaceEmoji(this.f24507e, org.telegram.ui.ActionBar.g6.P1.getFontMetricsInt(), false);
        if (this.R <= 0) {
            this.R = AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f);
        }
        a(this.R, true);
        i();
        TextView textView = this.h;
        int visibility = textView.getVisibility();
        if (TextUtils.isEmpty(str2)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str2);
            textView.setVisibility(0);
        }
        if (visibility != textView.getVisibility()) {
            a(this.R, true);
        }
        requestLayout();
    }

    public final int g() {
        StaticLayout staticLayout = this.f24504a;
        int iDp = AndroidUtilities.dp(16.0f) + (staticLayout != null ? staticLayout.getHeight() : AndroidUtilities.dp(20.0f));
        return this.h.getVisibility() == 0 ? AndroidUtilities.dp(23.0f) + iDp : iDp;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        float f10 = this.P;
        float fG = g();
        float fMin = Math.min(T, fG);
        Math.abs(AndroidUtilities.lerp(fMin, fG, 1.0f) - AndroidUtilities.lerp(fMin, fG, f10));
        this.Q = ValueAnimator.ofFloat(0.0f, 1.0f);
        float fAbs = Math.abs(f10 - 1.0f) * 1250.0f * 2.0f;
        o1.e eVar = new o1.e();
        eVar.f19127a = 0.0f;
        eVar.f19128b = 0.0f;
        this.Q.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f10)), f10, 1.0f, eVar));
        this.Q.addListener(new lh.h9(this, 12));
        this.Q.setDuration((long) fAbs);
        this.Q.start();
    }

    public final int i() {
        int iG = g();
        float fMin = Math.min(T + (this.h.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), g());
        if (this.S) {
            iG = (int) AndroidUtilities.lerp(fMin, iG, this.P);
        }
        setHeight(iG);
        return iG;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f24504a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f24508f;
            int i10 = 0;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f24507e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr == null || clickableSpanArr.length == 0) {
                        spannableStringBuilder = this.f24507e;
                        this.f24508f = spannableStringBuilder;
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f24507e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new i(i10, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.f24508f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    }
                }
            }
            CharSequence text = this.h.getText();
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(spannableStringBuilder);
            } else {
                accessibilityNodeInfo.setText(TextUtils.concat(text, ": ", spannableStringBuilder));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        a(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f), false);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i(), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q80 q80Var;
        StaticLayout staticLayout;
        j jVar;
        q80 q80VarB;
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        c cVar = this.f24509n;
        if (cVar.getVisibility() != 0) {
            if (this.f24504a == null) {
                if (motionEvent.getAction() == 0) {
                }
                if (motionEvent.getAction() == 0) {
                    e();
                    if (x8 >= cVar.getLeft()) {
                        staticLayout = this.H;
                        if (staticLayout == null) {
                            jVar = this;
                            q80VarB = jVar.b(jVar.f24504a, jVar.f24506c, jVar.d, x8, y10);
                            if (q80VarB == null) {
                                q80VarB = null;
                            }
                        } else {
                            jVar = this;
                            q80VarB = jVar.b(jVar.f24504a, jVar.f24506c, jVar.d, x8, y10);
                            if (q80VarB == null) {
                                q80VarB = null;
                            }
                        }
                    } else {
                        staticLayout = this.H;
                        if (staticLayout == null) {
                            jVar = this;
                            q80VarB = jVar.b(jVar.f24504a, jVar.f24506c, jVar.d, x8, y10);
                            if (q80VarB == null) {
                                q80VarB = null;
                            }
                        } else {
                            jVar = this;
                            q80VarB = jVar.b(jVar.f24504a, jVar.f24506c, jVar.d, x8, y10);
                            if (q80VarB == null) {
                                q80VarB = null;
                            }
                        }
                    }
                    if (q80VarB != null) {
                        jVar.f24514y = jVar.f24504a;
                        jVar.f24512w = q80VarB;
                        jVar.A.a(q80VarB, null);
                        AndroidUtilities.runOnUIThread(jVar.O, ViewConfiguration.getLongPressTimeout());
                    } else if (super.onTouchEvent(motionEvent)) {
                    }
                } else {
                    q80Var = this.f24512w;
                    if (q80Var != null) {
                        d((ClickableSpan) q80Var.f31841i, this.f24504a, this.f24513x);
                        e();
                    } else if (super.onTouchEvent(motionEvent)) {
                    }
                }
            } else {
                if (motionEvent.getAction() == 0) {
                }
                if (motionEvent.getAction() == 0) {
                    e();
                    if (x8 >= cVar.getLeft()) {
                        staticLayout = this.H;
                        if (staticLayout == null) {
                            jVar = this;
                            q80VarB = jVar.b(jVar.f24504a, jVar.f24506c, jVar.d, x8, y10);
                            if (q80VarB == null) {
                                q80VarB = null;
                            }
                        } else {
                            jVar = this;
                            q80VarB = jVar.b(jVar.f24504a, jVar.f24506c, jVar.d, x8, y10);
                            if (q80VarB == null) {
                                q80VarB = null;
                            }
                        }
                    } else {
                        staticLayout = this.H;
                        if (staticLayout == null) {
                            jVar = this;
                            q80VarB = jVar.b(jVar.f24504a, jVar.f24506c, jVar.d, x8, y10);
                            if (q80VarB == null) {
                                q80VarB = null;
                            }
                        } else {
                            jVar = this;
                            q80VarB = jVar.b(jVar.f24504a, jVar.f24506c, jVar.d, x8, y10);
                            if (q80VarB == null) {
                                q80VarB = null;
                            }
                        }
                    }
                    if (q80VarB != null) {
                        jVar.f24514y = jVar.f24504a;
                        jVar.f24512w = q80VarB;
                        jVar.A.a(q80VarB, null);
                        AndroidUtilities.runOnUIThread(jVar.O, ViewConfiguration.getLongPressTimeout());
                    } else if (super.onTouchEvent(motionEvent)) {
                    }
                } else {
                    q80Var = this.f24512w;
                    if (q80Var != null) {
                        d((ClickableSpan) q80Var.f31841i, this.f24504a, this.f24513x);
                        e();
                    } else if (super.onTouchEvent(motionEvent)) {
                    }
                }
            }
            return true;
        }
        FrameLayout frameLayout = this.f24510r;
        if (x8 < frameLayout.getLeft() || x8 > frameLayout.getRight() || y10 < frameLayout.getTop() || y10 > frameLayout.getBottom()) {
            if (this.f24504a == null || this.I != null) {
                if (motionEvent.getAction() == 0 && (this.f24512w == null || motionEvent.getAction() != 1)) {
                    if (motionEvent.getAction() == 3) {
                        e();
                    }
                    if (super.onTouchEvent(motionEvent)) {
                    }
                } else if (motionEvent.getAction() == 0) {
                    e();
                    if ((x8 >= cVar.getLeft() || x8 > cVar.getRight() || y10 < cVar.getTop() || y10 > cVar.getBottom()) && (getMeasuredWidth() <= 0 || x8 <= getMeasuredWidth() - AndroidUtilities.dp(18.0f))) {
                        staticLayout = this.H;
                        if (staticLayout == null && this.P < 1.0f && this.S) {
                            jVar = this;
                            q80VarB = jVar.b(staticLayout, this.f24506c, this.d, x8, y10);
                            if (q80VarB == null) {
                                if (jVar.I != null) {
                                    int i10 = 0;
                                    while (true) {
                                        StaticLayout[] staticLayoutArr = jVar.I;
                                        if (i10 < staticLayoutArr.length) {
                                            StaticLayout staticLayout2 = staticLayoutArr[i10];
                                            Point point = jVar.K[i10];
                                            q80 q80VarB2 = jVar.b(staticLayout2, point.x, point.y, x8, y10);
                                            if (q80VarB2 != null) {
                                                q80VarB = q80VarB2;
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                }
                            }
                            if (q80VarB != null) {
                                jVar.f24514y = jVar.f24504a;
                                jVar.f24512w = q80VarB;
                                jVar.A.a(q80VarB, null);
                                AndroidUtilities.runOnUIThread(jVar.O, ViewConfiguration.getLongPressTimeout());
                            } else if (super.onTouchEvent(motionEvent)) {
                            }
                        } else {
                            jVar = this;
                        }
                        q80VarB = jVar.b(jVar.f24504a, jVar.f24506c, jVar.d, x8, y10);
                        if (q80VarB == null) {
                        }
                        if (q80VarB != null) {
                            jVar.f24514y = jVar.f24504a;
                            jVar.f24512w = q80VarB;
                            jVar.A.a(q80VarB, null);
                            AndroidUtilities.runOnUIThread(jVar.O, ViewConfiguration.getLongPressTimeout());
                        } else if (super.onTouchEvent(motionEvent)) {
                        }
                    } else {
                        jVar = this;
                    }
                    q80VarB = null;
                    if (q80VarB != null) {
                        jVar.f24514y = jVar.f24504a;
                        jVar.f24512w = q80VarB;
                        jVar.A.a(q80VarB, null);
                        AndroidUtilities.runOnUIThread(jVar.O, ViewConfiguration.getLongPressTimeout());
                    } else if (super.onTouchEvent(motionEvent)) {
                    }
                } else {
                    q80Var = this.f24512w;
                    if (q80Var != null) {
                        try {
                            d((ClickableSpan) q80Var.f31841i, this.f24504a, this.f24513x);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        e();
                    } else if (super.onTouchEvent(motionEvent)) {
                    }
                }
            } else if (super.onTouchEvent(motionEvent)) {
            }
            return true;
        }
        return false;
    }

    public void setMoreButtonDisabled(boolean z10) {
        this.M = z10;
    }
}
