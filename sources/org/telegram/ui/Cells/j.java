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
import b8.mf;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wv0;
public abstract class j extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int f29398d0 = org.telegram.messenger.g0.L(76.0f);
    public static final int f29399e0 = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public StaticLayout E;
    public final m2.p0 F;
    public g G;
    public w70 H;
    public final org.telegram.ui.ActionBar.d2 I;
    public final org.telegram.ui.ActionBar.e6 J;
    public final FrameLayout K;
    public final y L;
    public StaticLayout M;
    public StaticLayout[] N;
    public int O;
    public Point[] P;
    public boolean Q;
    public boolean R;
    public int S;
    public final Paint T;
    public final float U;
    public final mi.b0 V;
    public float W;
    public StaticLayout f29400a;
    public ValueAnimator f29401a0;
    public String f29402b;
    public int f29403b0;
    public int f29404c;
    public boolean f29405c0;
    public int d;
    public SpannableStringBuilder f29406e;
    public SpannableStringBuilder f29407f;
    public final TextView h;
    public final c f29408n;
    public final FrameLayout f29409r;
    public final FrameLayout f29410s;
    public final Drawable f29411w;
    public t70 f29412x;
    public float f29413y;

    public j(Context context, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        new Point();
        new n70(0);
        this.N = null;
        this.O = -1;
        this.Q = false;
        Paint paint = new Paint();
        this.T = paint;
        this.U = org.telegram.messenger.g0.L(3.0f);
        this.V = new mi.b0(this, 17);
        this.W = 0.0f;
        this.f29403b0 = 0;
        this.f29405c0 = false;
        this.J = e6Var;
        this.I = d2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.F = new m2.p0(frameLayout);
        this.L = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 13.0f, 1, 1);
        textView.setSingleLine(true);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, mf.d(-2, -2.0f, (bd.f21784a0 ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f29410s = frameLayout2;
        Drawable g7 = k2.p1.g(context, 2131231225);
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.r6.y(this, g7, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        frameLayout2.setBackground(g7);
        addView(frameLayout2, mf.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, mf.e(-1, -1, 55));
        ?? textView2 = new TextView(context);
        textView2.f29008a = false;
        this.f29408n = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28062n6, e6Var);
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setText(bd.M0(2131751462, null));
        textView2.setOnClickListener(new a(this, 0));
        textView2.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f29409r = frameLayout3;
        Drawable g10 = k2.p1.g(context, 2131231226);
        this.f29411w = g10;
        org.telegram.ui.ActionBar.r6.y(this, g10, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        frameLayout3.setBackground(g10);
        frameLayout3.setPadding(org.telegram.messenger.g0.L(4.0f) + frameLayout3.getPaddingLeft(), org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(3.0f));
        frameLayout3.addView((View) textView2, mf.c(-2.0f, -2));
        addView(frameLayout3, mf.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / org.telegram.messenger.g0.f22607p), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / org.telegram.messenger.g0.f22607p), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i3, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.k6.P1, Math.max(1, i3)).setBreakStrategy(0).setHyphenationFrequency(0);
            if (bd.f21784a0) {
                alignment = lu0.a();
            } else {
                Layout.Alignment[] alignmentArr = lu0.f35891a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, org.telegram.ui.ActionBar.k6.P1, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    private void setHeight(int i3) {
        u4.p0 p0Var = (u4.p0) getLayoutParams();
        boolean z10 = true;
        if (p0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            p0Var = new u4.p0(-1, i3);
        } else {
            if (((ViewGroup.MarginLayoutParams) p0Var).height == i3) {
                z10 = false;
            }
            ((ViewGroup.MarginLayoutParams) p0Var).height = i3;
        }
        if (z10) {
            setLayoutParams(p0Var);
        }
    }

    private void setShowMoreMarginBottom(int i3) {
        FrameLayout frameLayout = this.f29409r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i3) {
            layoutParams.bottomMargin = i3;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i3, boolean z10) {
        boolean z11;
        int i10;
        int height;
        boolean z12;
        float f10;
        int i11 = 0;
        if (this.R) {
            this.f29405c0 = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.f29406e;
        FrameLayout frameLayout = this.K;
        c cVar = this.f29408n;
        if (spannableStringBuilder != null && (i3 != this.f29403b0 || z10)) {
            StaticLayout c2 = c(i3, spannableStringBuilder);
            this.f29400a = c2;
            if (c2.getLineCount() >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f29405c0 = z11;
            int lineCount = this.f29400a.getLineCount();
            FrameLayout frameLayout2 = this.f29409r;
            if (lineCount >= 3 && this.f29405c0) {
                int max = Math.max(this.f29400a.getLineStart(2), this.f29400a.getLineEnd(2));
                if (this.f29406e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i12 = max - 1;
                if (this.f29406e.charAt(i12) != ' ' && this.f29406e.charAt(i12) != '\n') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.Q = z12;
                this.M = c(i3, this.f29406e.subSequence(0, max));
                this.N = new StaticLayout[this.f29400a.getLineCount() - 3];
                this.P = new Point[this.f29400a.getLineCount() - 3];
                float lineRight = this.M.getLineRight(this.M.getLineCount() - 1);
                boolean z13 = this.Q;
                float f11 = this.U;
                if (z13) {
                    f10 = f11;
                } else {
                    f10 = 0.0f;
                }
                float f12 = lineRight + f10;
                this.O = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i13 = f29399e0;
                    frameLayout2.measure(i13, i13);
                }
                for (int i14 = 3; i14 < this.f29400a.getLineCount(); i14++) {
                    int lineStart = this.f29400a.getLineStart(i14);
                    int lineEnd = this.f29400a.getLineEnd(i14);
                    StaticLayout c10 = c(i3, this.f29406e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i15 = i14 - 3;
                    this.N[i15] = c10;
                    this.P[i15] = new Point();
                    if (this.O == -1) {
                        if (f12 > frameLayout2.getPaddingLeft() + (i3 - frameLayout2.getMeasuredWidth())) {
                            this.O = i15;
                        }
                    }
                    f12 += c10.getLineRight(0) + f11;
                }
                if (f12 < frameLayout2.getPaddingLeft() + (i3 - frameLayout2.getMeasuredWidth())) {
                    this.f29405c0 = false;
                }
            }
            if (!this.f29405c0) {
                this.M = null;
                this.N = null;
            }
            this.f29403b0 = i3;
            frameLayout.setMinimumHeight(g());
            if (this.f29405c0 && this.M != null) {
                if (this.h.getVisibility() == 0) {
                    i10 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i10 = 0;
                }
                int min = Math.min(f29398d0 + i10, g()) - org.telegram.messenger.g0.L(8.0f);
                StaticLayout staticLayout = this.M;
                int lineBottom = ((min - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - cVar.getPaddingBottom();
                if (cVar.getLayout() == null) {
                    height = 0;
                } else {
                    height = cVar.getLayout().getHeight() - cVar.getLayout().getLineBottom(cVar.getLineCount() - 1);
                }
                setShowMoreMarginBottom(lineBottom - height);
            }
        }
        if (!this.f29405c0) {
            i11 = 8;
        }
        cVar.setVisibility(i11);
        if (!this.f29405c0 && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.L);
        }
        if (this.f29405c0 && this.W < 1.0f && frameLayout.getBackground() != null) {
            frameLayout.setBackground(null);
        }
    }

    public final t70 b(StaticLayout staticLayout, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
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
                    t70 t70Var = new t70(clickableSpanArr[0], this.J, i11, i12, 0);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28298ze, this.J);
                    RectF rectF = ProfileActivity.T6;
                    t70Var.d(w02);
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    n70 b10 = t70Var.b();
                    float f11 = i10;
                    this.f29413y = f11;
                    b10.d(staticLayout, spanStart, f11);
                    staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                    return t70Var;
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
        g gVar = this.G;
        g gVar2 = null;
        if (gVar != null) {
            gVar.a(false);
            this.G = null;
        }
        if (layout != null && clickableSpan != null) {
            gVar2 = new g(this, layout, clickableSpan, f10);
        }
        this.G = gVar2;
        if (clickableSpan instanceof v31) {
            String url = ((v31) clickableSpan).getURL();
            if (!url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$") && !url.startsWith("/")) {
                return;
            }
            g gVar3 = this.G;
            ProfileActivity profileActivity = ((wv0) this).f51611f0.f44157e;
            RectF rectF = ProfileActivity.T6;
            profileActivity.P4(url, gVar3);
        } else if (clickableSpan instanceof URLSpan) {
            String url2 = ((URLSpan) clickableSpan).getURL();
            if (org.telegram.messenger.g0.J3(url2)) {
                org.telegram.ui.Components.t4.q0(this.I, url2, true, true, true, false, this.G, null, null);
                return;
            }
            sf.c.r(getContext(), Uri.parse(url2), true, true, this.G);
        } else {
            clickableSpan.onClick(this);
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.F.f(true);
        this.f29412x = null;
        org.telegram.messenger.g0.r(this.V);
        invalidate();
    }

    public final void f(String str, String str2, boolean z10) {
        String str3;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f29402b)) {
            try {
                str3 = org.telegram.messenger.g0.U.matcher(str).replaceAll("\u200c");
            } catch (Throwable unused) {
                str3 = str;
            }
            try {
                this.f29402b = str3;
            } catch (Throwable unused2) {
                this.f29402b = str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29402b);
            this.f29406e = spannableStringBuilder;
            this.f29407f = null;
            zi.e(false, spannableStringBuilder, false, false, !z10);
            org.telegram.messenger.i6.l(this.f29406e, org.telegram.ui.ActionBar.k6.P1.getFontMetricsInt(), false);
            if (this.f29403b0 <= 0) {
                this.f29403b0 = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(36.0f);
            }
            a(this.f29403b0, true);
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
                a(this.f29403b0, true);
            }
            requestLayout();
        }
    }

    public final int g() {
        int L;
        StaticLayout staticLayout = this.f29400a;
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
        ValueAnimator valueAnimator = this.f29401a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f29401a0 = null;
        }
        float f10 = this.W;
        float g7 = g();
        float min = Math.min(f29398d0, g7);
        Math.abs(org.telegram.messenger.g0.T1(min, g7, 1.0f) - org.telegram.messenger.g0.T1(min, g7, f10));
        this.f29401a0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ?? obj = new Object();
        obj.f29364a = 0.0f;
        obj.f29365b = 0.0f;
        this.f29401a0.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f10)), f10, 1.0f, (i) obj));
        this.f29401a0.addListener(new ii.v3(this, 21));
        this.f29401a0.setDuration(Math.abs(f10 - 1.0f) * 1250.0f * 2.0f);
        this.f29401a0.start();
    }

    public final int i() {
        int i3;
        int g7 = g();
        if (this.h.getVisibility() == 0) {
            i3 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i3 = 0;
        }
        float min = Math.min(f29398d0 + i3, g());
        if (this.f29405c0) {
            g7 = (int) org.telegram.messenger.g0.T1(min, g7, this.W);
        }
        setHeight(g7);
        return g7;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f29400a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f29407f;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f29406e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f29406e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new h(0, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.f29407f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder = this.f29406e;
                        this.f29407f = spannableStringBuilder;
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
    public final void onMeasure(int i3, int i10) {
        a(View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(36.0f), false);
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(i(), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMoreButtonDisabled(boolean z10) {
        this.R = z10;
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.P1;
        int i3 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.e6 e6Var = this.J;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        RectF rectF = ProfileActivity.T6;
        textPaint.linkColor = w02;
        try {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var);
            y yVar = this.L;
            if (yVar != null && w03 != this.S) {
                this.S = w03;
                org.telegram.ui.ActionBar.k6.H1(yVar, w03, true);
            }
            this.T.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
