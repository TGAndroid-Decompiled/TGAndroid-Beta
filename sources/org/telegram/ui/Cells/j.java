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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.u70;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dw0;
public abstract class j extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int f30459d0 = org.telegram.messenger.g0.L(76.0f);
    public static final int f30460e0 = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public StaticLayout E;
    public final n2.o0 F;
    public g G;
    public d80 H;
    public final org.telegram.ui.ActionBar.e2 I;
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
    public final j6.o V;
    public float W;
    public StaticLayout f30461a;
    public ValueAnimator f30462a0;
    public String f30463b;
    public int f30464b0;
    public int f30465c;
    public boolean f30466c0;
    public int d;
    public SpannableStringBuilder f30467e;
    public SpannableStringBuilder f30468f;
    public final TextView h;
    public final c f30469n;
    public final FrameLayout f30470r;
    public final FrameLayout f30471s;
    public final Drawable f30472w;
    public a80 f30473x;
    public float f30474y;

    public j(Context context, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7;
        new Point();
        new u70(0);
        this.N = null;
        this.O = -1;
        this.Q = false;
        Paint paint = new Paint();
        this.T = paint;
        this.U = org.telegram.messenger.g0.L(3.0f);
        this.V = new j6.o(this, 21);
        this.W = 0.0f;
        this.f30464b0 = 0;
        this.f30466c0 = false;
        this.J = e6Var;
        this.I = e2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.F = new n2.o0(frameLayout);
        this.L = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        i20.p(textView, 1, 13.0f, 1, 1);
        textView.setSingleLine(true);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, (hd.f24104a0 ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f30471s = frameLayout2;
        Drawable g10 = i5.c.g(context, 2131231225);
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.q6.x(this, g10, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        frameLayout2.setBackground(g10);
        addView(frameLayout2, c8.ja.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, c8.ja.e(-1, -1, 55));
        ?? textView2 = new TextView(context);
        textView2.f30061a = false;
        this.f30469n = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29031n6, e6Var);
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setText(hd.M0(2131751461, null));
        textView2.setOnClickListener(new a(this, 0));
        textView2.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30470r = frameLayout3;
        Drawable g11 = i5.c.g(context, 2131231226);
        this.f30472w = g11;
        org.telegram.ui.ActionBar.q6.x(this, g11, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        frameLayout3.setBackground(g11);
        frameLayout3.setPadding(org.telegram.messenger.g0.L(4.0f) + frameLayout3.getPaddingLeft(), org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(3.0f));
        frameLayout3.addView((View) textView2, c8.ja.c(-2.0f, -2));
        addView(frameLayout3, c8.ja.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / org.telegram.messenger.g0.f23610p), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / org.telegram.messenger.g0.f23610p), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i7, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.j6.P1, Math.max(1, i7)).setBreakStrategy(0).setHyphenationFrequency(0);
            if (hd.f24104a0) {
                alignment = ou0.a();
            } else {
                Layout.Alignment[] alignmentArr = ou0.f38086a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, org.telegram.ui.ActionBar.j6.P1, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    private void setHeight(int i7) {
        v4.p0 p0Var = (v4.p0) getLayoutParams();
        boolean z10 = true;
        if (p0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            p0Var = new v4.p0(-1, i7);
        } else {
            if (((ViewGroup.MarginLayoutParams) p0Var).height == i7) {
                z10 = false;
            }
            ((ViewGroup.MarginLayoutParams) p0Var).height = i7;
        }
        if (z10) {
            setLayoutParams(p0Var);
        }
    }

    private void setShowMoreMarginBottom(int i7) {
        FrameLayout frameLayout = this.f30470r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i7) {
            layoutParams.bottomMargin = i7;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i7, boolean z10) {
        boolean z11;
        int i10;
        int height;
        boolean z12;
        float f10;
        int i11 = 0;
        if (this.R) {
            this.f30466c0 = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.f30467e;
        FrameLayout frameLayout = this.K;
        c cVar = this.f30469n;
        if (spannableStringBuilder != null && (i7 != this.f30464b0 || z10)) {
            StaticLayout c10 = c(i7, spannableStringBuilder);
            this.f30461a = c10;
            if (c10.getLineCount() >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f30466c0 = z11;
            int lineCount = this.f30461a.getLineCount();
            FrameLayout frameLayout2 = this.f30470r;
            if (lineCount >= 3 && this.f30466c0) {
                int max = Math.max(this.f30461a.getLineStart(2), this.f30461a.getLineEnd(2));
                if (this.f30467e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i12 = max - 1;
                if (this.f30467e.charAt(i12) != ' ' && this.f30467e.charAt(i12) != '\n') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.Q = z12;
                this.M = c(i7, this.f30467e.subSequence(0, max));
                this.N = new StaticLayout[this.f30461a.getLineCount() - 3];
                this.P = new Point[this.f30461a.getLineCount() - 3];
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
                    int i13 = f30460e0;
                    frameLayout2.measure(i13, i13);
                }
                for (int i14 = 3; i14 < this.f30461a.getLineCount(); i14++) {
                    int lineStart = this.f30461a.getLineStart(i14);
                    int lineEnd = this.f30461a.getLineEnd(i14);
                    StaticLayout c11 = c(i7, this.f30467e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i15 = i14 - 3;
                    this.N[i15] = c11;
                    this.P[i15] = new Point();
                    if (this.O == -1) {
                        if (f12 > frameLayout2.getPaddingLeft() + (i7 - frameLayout2.getMeasuredWidth())) {
                            this.O = i15;
                        }
                    }
                    f12 += c11.getLineRight(0) + f11;
                }
                if (f12 < frameLayout2.getPaddingLeft() + (i7 - frameLayout2.getMeasuredWidth())) {
                    this.f30466c0 = false;
                }
            }
            if (!this.f30466c0) {
                this.M = null;
                this.N = null;
            }
            this.f30464b0 = i7;
            frameLayout.setMinimumHeight(g());
            if (this.f30466c0 && this.M != null) {
                if (this.h.getVisibility() == 0) {
                    i10 = org.telegram.messenger.g0.L(20.0f);
                } else {
                    i10 = 0;
                }
                int min = Math.min(f30459d0 + i10, g()) - org.telegram.messenger.g0.L(8.0f);
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
        if (!this.f30466c0) {
            i11 = 8;
        }
        cVar.setVisibility(i11);
        if (!this.f30466c0 && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.L);
        }
        if (this.f30466c0 && this.W < 1.0f && frameLayout.getBackground() != null) {
            frameLayout.setBackground(null);
        }
    }

    public final a80 b(StaticLayout staticLayout, int i7, int i10, int i11, int i12) {
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
                    a80 a80Var = new a80(clickableSpanArr[0], this.J, i11, i12, 0);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ce, this.J);
                    RectF rectF = ProfileActivity.X6;
                    a80Var.d(w02);
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    u70 b10 = a80Var.b();
                    float f11 = i10;
                    this.f30474y = f11;
                    b10.d(staticLayout, spanStart, f11);
                    staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                    return a80Var;
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
        if (clickableSpan instanceof f41) {
            String url = ((f41) clickableSpan).getURL();
            if (!url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$") && !url.startsWith("/")) {
                return;
            }
            g gVar3 = this.G;
            ProfileActivity profileActivity = ((dw0) this).f46486f0.f48123e;
            RectF rectF = ProfileActivity.X6;
            profileActivity.R4(url, gVar3);
        } else if (clickableSpan instanceof URLSpan) {
            String url2 = ((URLSpan) clickableSpan).getURL();
            if (org.telegram.messenger.g0.I3(url2)) {
                org.telegram.ui.Components.t4.o0(this.I, url2, true, true, true, false, this.G, null, null);
                return;
            }
            vf.c.r(getContext(), Uri.parse(url2), true, true, this.G);
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
        this.F.f(true);
        this.f30473x = null;
        org.telegram.messenger.g0.r(this.V);
        invalidate();
    }

    public final void f(String str, String str2, boolean z10) {
        String str3;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f30463b)) {
            try {
                str3 = org.telegram.messenger.g0.U.matcher(str).replaceAll("\u200c");
            } catch (Throwable unused) {
                str3 = str;
            }
            try {
                this.f30463b = str3;
            } catch (Throwable unused2) {
                this.f30463b = str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f30463b);
            this.f30467e = spannableStringBuilder;
            this.f30468f = null;
            gj.e(false, spannableStringBuilder, false, false, !z10);
            org.telegram.messenger.j6.l(this.f30467e, org.telegram.ui.ActionBar.j6.P1.getFontMetricsInt(), false);
            if (this.f30464b0 <= 0) {
                this.f30464b0 = org.telegram.messenger.g0.f23611q.x - org.telegram.messenger.g0.L(36.0f);
            }
            a(this.f30464b0, true);
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
                a(this.f30464b0, true);
            }
            requestLayout();
        }
    }

    public final int g() {
        int L;
        StaticLayout staticLayout = this.f30461a;
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
        ValueAnimator valueAnimator = this.f30462a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f30462a0 = null;
        }
        float f10 = this.W;
        float g10 = g();
        float min = Math.min(f30459d0, g10);
        Math.abs(org.telegram.messenger.g0.T1(min, g10, 1.0f) - org.telegram.messenger.g0.T1(min, g10, f10));
        this.f30462a0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ?? obj = new Object();
        obj.f30423a = 0.0f;
        obj.f30424b = 0.0f;
        this.f30462a0.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f10)), f10, 1.0f, (i) obj));
        this.f30462a0.addListener(new ki.s3(this, 21));
        this.f30462a0.setDuration(Math.abs(f10 - 1.0f) * 1250.0f * 2.0f);
        this.f30462a0.start();
    }

    public final int i() {
        int i7;
        int g10 = g();
        if (this.h.getVisibility() == 0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        float min = Math.min(f30459d0 + i7, g());
        if (this.f30466c0) {
            g10 = (int) org.telegram.messenger.g0.T1(min, g10, this.W);
        }
        setHeight(g10);
        return g10;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f30461a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f30468f;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f30467e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f30467e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new h(0, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.f30468f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder = this.f30467e;
                        this.f30468f = spannableStringBuilder;
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

    public void setMoreButtonDisabled(boolean z10) {
        this.R = z10;
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.P1;
        int i7 = org.telegram.ui.ActionBar.j6.Xc;
        org.telegram.ui.ActionBar.e6 e6Var = this.J;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        RectF rectF = ProfileActivity.X6;
        textPaint.linkColor = w02;
        try {
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var);
            y yVar = this.L;
            if (yVar != null && w03 != this.S) {
                this.S = w03;
                org.telegram.ui.ActionBar.j6.H1(yVar, w03, true);
            }
            this.T.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
