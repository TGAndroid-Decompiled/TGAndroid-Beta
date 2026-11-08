package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.x70;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ew0;
public abstract class j extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final int f29331c0 = org.telegram.messenger.g0.L(76.0f);
    public static final int f29332d0 = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public StaticLayout D;
    public final n2.n0 E;
    public g F;
    public a80 G;
    public final org.telegram.ui.ActionBar.f2 H;
    public final org.telegram.ui.ActionBar.f6 I;
    public final FrameLayout J;
    public final y K;
    public StaticLayout L;
    public StaticLayout[] M;
    public int N;
    public Point[] O;
    public boolean P;
    public boolean Q;
    public int R;
    public final Paint S;
    public final float T;
    public final m.f3 U;
    public float V;
    public ValueAnimator W;
    public StaticLayout f29333a;
    public int f29334a0;
    public String f29335b;
    public boolean f29336b0;
    public int f29337c;
    public int d;
    public SpannableStringBuilder f29338e;
    public SpannableStringBuilder f29339f;
    public final TextView h;
    public final c f29340n;
    public final FrameLayout f29341r;
    public final FrameLayout f29342s;
    public final Drawable f29343w;
    public x70 f29344x;
    public float f29345y;

    public j(Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7;
        new Point();
        new r70(0);
        this.M = null;
        this.N = -1;
        this.P = false;
        Paint paint = new Paint();
        this.S = paint;
        this.T = org.telegram.messenger.g0.L(3.0f);
        this.U = new m.f3(this, 18);
        this.V = 0.0f;
        this.f29334a0 = 0;
        this.f29336b0 = false;
        this.I = f6Var;
        this.H = f2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.E = new n2.n0(frameLayout);
        this.K = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27944i6, f6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28262z6, f6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 13.0f, 1, 1);
        textView.setSingleLine(true);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, (id.f23157a0 ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f29342s = frameLayout2;
        Drawable h = jg.g.h(context, 2131231225);
        int i10 = org.telegram.ui.ActionBar.k6.f27852d6;
        org.telegram.ui.ActionBar.r6.y(this, h, i10, f6Var, PorterDuff.Mode.SRC_ATOP);
        frameLayout2.setBackground(h);
        addView(frameLayout2, c8.ha.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, c8.ha.e(-1, -1, 55));
        ?? textView2 = new TextView(context);
        textView2.f28950a = false;
        this.f29340n = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28034n6, f6Var);
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setText(id.M0(2131751462, null));
        textView2.setOnClickListener(new a(this, 0));
        textView2.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f29341r = frameLayout3;
        Drawable h7 = jg.g.h(context, 2131231226);
        this.f29343w = h7;
        org.telegram.ui.ActionBar.r6.y(this, h7, i10, f6Var, PorterDuff.Mode.MULTIPLY);
        frameLayout3.setBackground(h7);
        frameLayout3.setPadding(org.telegram.messenger.g0.L(4.0f) + frameLayout3.getPaddingLeft(), org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(3.0f));
        frameLayout3.addView((View) textView2, c8.ha.c(-2.0f, -2));
        addView(frameLayout3, c8.ha.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / org.telegram.messenger.g0.f22562p), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / org.telegram.messenger.g0.f22562p), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i7, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.k6.P1, Math.max(1, i7)).setBreakStrategy(0).setHyphenationFrequency(0);
            if (id.f23157a0) {
                alignment = mu0.a();
            } else {
                Layout.Alignment[] alignmentArr = mu0.f36118a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, org.telegram.ui.ActionBar.k6.P1, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    private void setHeight(int i7) {
        v4.o0 o0Var = (v4.o0) getLayoutParams();
        boolean z9 = true;
        if (o0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            o0Var = new v4.o0(-1, i7);
        } else {
            if (((ViewGroup.MarginLayoutParams) o0Var).height == i7) {
                z9 = false;
            }
            ((ViewGroup.MarginLayoutParams) o0Var).height = i7;
        }
        if (z9) {
            setLayoutParams(o0Var);
        }
    }

    private void setShowMoreMarginBottom(int i7) {
        FrameLayout frameLayout = this.f29341r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i7) {
            layoutParams.bottomMargin = i7;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i7, boolean z9) {
        boolean z10;
        int i10;
        int height;
        boolean z11;
        float f10;
        int i11 = 0;
        if (this.Q) {
            this.f29336b0 = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.f29338e;
        FrameLayout frameLayout = this.J;
        c cVar = this.f29340n;
        if (spannableStringBuilder != null && (i7 != this.f29334a0 || z9)) {
            StaticLayout c10 = c(i7, spannableStringBuilder);
            this.f29333a = c10;
            if (c10.getLineCount() >= 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f29336b0 = z10;
            int lineCount = this.f29333a.getLineCount();
            FrameLayout frameLayout2 = this.f29341r;
            if (lineCount >= 3 && this.f29336b0) {
                int max = Math.max(this.f29333a.getLineStart(2), this.f29333a.getLineEnd(2));
                if (this.f29338e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i12 = max - 1;
                if (this.f29338e.charAt(i12) != ' ' && this.f29338e.charAt(i12) != '\n') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.P = z11;
                this.L = c(i7, this.f29338e.subSequence(0, max));
                this.M = new StaticLayout[this.f29333a.getLineCount() - 3];
                this.O = new Point[this.f29333a.getLineCount() - 3];
                float lineRight = this.L.getLineRight(this.L.getLineCount() - 1);
                boolean z12 = this.P;
                float f11 = this.T;
                if (z12) {
                    f10 = f11;
                } else {
                    f10 = 0.0f;
                }
                float f12 = lineRight + f10;
                this.N = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i13 = f29332d0;
                    frameLayout2.measure(i13, i13);
                }
                for (int i14 = 3; i14 < this.f29333a.getLineCount(); i14++) {
                    int lineStart = this.f29333a.getLineStart(i14);
                    int lineEnd = this.f29333a.getLineEnd(i14);
                    StaticLayout c11 = c(i7, this.f29338e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i15 = i14 - 3;
                    this.M[i15] = c11;
                    this.O[i15] = new Point();
                    if (this.N == -1) {
                        if (f12 > frameLayout2.getPaddingLeft() + (i7 - frameLayout2.getMeasuredWidth())) {
                            this.N = i15;
                        }
                    }
                    f12 += c11.getLineRight(0) + f11;
                }
                if (f12 < frameLayout2.getPaddingLeft() + (i7 - frameLayout2.getMeasuredWidth())) {
                    this.f29336b0 = false;
                }
            }
            if (!this.f29336b0) {
                this.L = null;
                this.M = null;
            }
            this.f29334a0 = i7;
            frameLayout.setMinimumHeight(g());
            if (this.f29336b0 && this.L != null) {
                if (this.h.getVisibility() == 0) {
                    i10 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i10 = 0;
                }
                int min = Math.min(f29331c0 + i10, g()) - org.telegram.messenger.g0.L(8.0f);
                StaticLayout staticLayout = this.L;
                int lineBottom = ((min - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - cVar.getPaddingBottom();
                if (cVar.getLayout() == null) {
                    height = 0;
                } else {
                    height = cVar.getLayout().getHeight() - cVar.getLayout().getLineBottom(cVar.getLineCount() - 1);
                }
                setShowMoreMarginBottom(lineBottom - height);
            }
        }
        if (!this.f29336b0) {
            i11 = 8;
        }
        cVar.setVisibility(i11);
        if (!this.f29336b0 && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.K);
        }
        if (this.f29336b0 && this.V < 1.0f && frameLayout.getBackground() != null) {
            frameLayout.setBackground(null);
        }
    }

    public final x70 b(StaticLayout staticLayout, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i14);
            float f10 = i13;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f10);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft <= f10 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f10 && i14 >= 0 && i14 <= staticLayout.getHeight()) {
                Spannable spannable = (Spannable) staticLayout.getText();
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0 && !org.telegram.messenger.g0.C1()) {
                    x70 x70Var = new x70(clickableSpanArr[0], this.I, i11, i12, 0);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28269ze, this.I);
                    RectF rectF = ProfileActivity.S6;
                    x70Var.d(w02);
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    r70 b10 = x70Var.b();
                    float f11 = i10;
                    this.f29345y = f11;
                    b10.d(staticLayout, spanStart, f11);
                    staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                    return x70Var;
                }
                return null;
            }
            return null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f10) {
        g gVar = this.F;
        g gVar2 = null;
        if (gVar != null) {
            gVar.a(false);
            this.F = null;
        }
        if (layout != null && clickableSpan != null) {
            gVar2 = new g(this, layout, clickableSpan, f10);
        }
        this.F = gVar2;
        if (clickableSpan instanceof b41) {
            String url = ((b41) clickableSpan).getURL();
            if (!url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$") && !url.startsWith("/")) {
                return;
            }
            g gVar3 = this.F;
            ProfileActivity profileActivity = ((ew0) this).f45380e0.f47047e;
            RectF rectF = ProfileActivity.S6;
            profileActivity.P4(url, gVar3);
        } else if (clickableSpan instanceof URLSpan) {
            String url2 = ((URLSpan) clickableSpan).getURL();
            if (org.telegram.messenger.g0.J3(url2)) {
                org.telegram.ui.Components.v4.o0(this.H, url2, true, true, true, false, this.F, null, null);
                return;
            }
            vf.c.r(getContext(), Uri.parse(url2), true, true, this.F);
        } else {
            clickableSpan.onClick(this);
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final void e() {
        this.E.f(true);
        this.f29344x = null;
        org.telegram.messenger.g0.r(this.U);
        invalidate();
    }

    public final void f(String str, String str2, boolean z9) {
        String str3;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f29335b)) {
            try {
                str3 = org.telegram.messenger.g0.U.matcher(str).replaceAll("\u200c");
            } catch (Throwable unused) {
                str3 = str;
            }
            try {
                this.f29335b = str3;
            } catch (Throwable unused2) {
                this.f29335b = str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29335b);
            this.f29338e = spannableStringBuilder;
            this.f29339f = null;
            ij.e(false, spannableStringBuilder, false, false, !z9);
            org.telegram.messenger.i6.l(this.f29338e, org.telegram.ui.ActionBar.k6.P1.getFontMetricsInt(), false);
            if (this.f29334a0 <= 0) {
                this.f29334a0 = org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(36.0f);
            }
            a(this.f29334a0, true);
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
                a(this.f29334a0, true);
            }
            requestLayout();
        }
    }

    public final int g() {
        int L;
        StaticLayout staticLayout = this.f29333a;
        if (staticLayout != null) {
            L = staticLayout.getHeight();
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        int L2 = org.telegram.messenger.g0.L(16.0f) + L;
        if (this.h.getVisibility() == 0) {
            return org.telegram.messenger.g0.L(23.0f) + L2;
        }
        return L2;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W = null;
        }
        float f10 = this.V;
        float g10 = g();
        float min = Math.min(f29331c0, g10);
        Math.abs(org.telegram.messenger.g0.T1(min, g10, 1.0f) - org.telegram.messenger.g0.T1(min, g10, f10));
        this.W = ValueAnimator.ofFloat(0.0f, 1.0f);
        ?? obj = new Object();
        obj.f29298a = 0.0f;
        obj.f29299b = 0.0f;
        this.W.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f10)), f10, 1.0f, (i) obj));
        this.W.addListener(new m.a(this, 20));
        this.W.setDuration(Math.abs(f10 - 1.0f) * 1250.0f * 2.0f);
        this.W.start();
    }

    public final int i() {
        int i7;
        int g10 = g();
        if (this.h.getVisibility() == 0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        float min = Math.min(f29331c0 + i7, g());
        if (this.f29336b0) {
            g10 = (int) org.telegram.messenger.g0.T1(min, g10, this.V);
        }
        setHeight(g10);
        return g10;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f29333a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f29339f;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f29338e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f29338e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new h(0, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.f29339f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder = this.f29338e;
                        this.f29339f = spannableStringBuilder;
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
    public final void onMeasure(int i7, int i10) {
        a(View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f), false);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i(), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMoreButtonDisabled(boolean z9) {
        this.Q = z9;
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.P1;
        int i7 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.f6 f6Var = this.I;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        RectF rectF = ProfileActivity.S6;
        textPaint.linkColor = w02;
        try {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27944i6, f6Var);
            y yVar = this.K;
            if (yVar != null && w03 != this.R) {
                this.R = w03;
                org.telegram.ui.ActionBar.k6.H1(yVar, w03, true);
            }
            this.S.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, f6Var));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
