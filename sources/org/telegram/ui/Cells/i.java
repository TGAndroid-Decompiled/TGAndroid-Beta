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
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sx0;
public abstract class i extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final int f22008c0 = org.telegram.messenger.i0.L(76.0f);
    public static final int f22009d0 = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
    public StaticLayout D;
    public final ji.a E;
    public g F;
    public t80 G;
    public final org.telegram.ui.ActionBar.k2 H;
    public final org.telegram.ui.ActionBar.p6 I;
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
    public final mg.c2 U;
    public float V;
    public ValueAnimator W;
    public StaticLayout f22010a;
    public int f22011a0;
    public String f22012b;
    public boolean f22013b0;
    public int f22014c;
    public int d;
    public SpannableStringBuilder e;
    public SpannableStringBuilder f22015f;
    public final TextView h;
    public final c f22016n;
    public final FrameLayout f22017r;
    public final FrameLayout f22018s;
    public final Drawable f22019w;
    public q80 f22020x;
    public float f22021y;

    public i(Context context, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        new Point();
        new k80(0);
        this.M = null;
        this.N = -1;
        this.P = false;
        Paint paint = new Paint();
        this.S = paint;
        this.T = org.telegram.messenger.i0.L(3.0f);
        this.U = new mg.c2(this, 16);
        this.V = 0.0f;
        this.f22011a0 = 0;
        this.f22013b0 = false;
        this.I = p6Var;
        this.H = k2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.E = new ji.a(frameLayout);
        this.K = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i6, p6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
        z20.o(textView, 1, 13.0f, 1, 1);
        textView.setSingleLine(true);
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f22018s = frameLayout2;
        Drawable f7 = i0.a.f(context, 2131231226);
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.a7.y(this, f7, i11, p6Var, PorterDuff.Mode.SRC_ATOP);
        frameLayout2.setBackground(f7);
        addView(frameLayout2, w7.b6.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, w7.b6.e(-1, -1, 55));
        ?? textView2 = new TextView(context);
        textView2.f21752a = false;
        this.f22016n = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21115n6, p6Var);
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setText(cd.L0(2131751462, null));
        textView2.setOnClickListener(new a(this, 0));
        textView2.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f22017r = frameLayout3;
        Drawable f10 = i0.a.f(context, 2131231227);
        this.f22019w = f10;
        org.telegram.ui.ActionBar.a7.y(this, f10, i11, p6Var, PorterDuff.Mode.MULTIPLY);
        frameLayout3.setBackground(f10);
        frameLayout3.setPadding(org.telegram.messenger.i0.L(4.0f) + frameLayout3.getPaddingLeft(), org.telegram.messenger.i0.L(1.0f), 0, org.telegram.messenger.i0.L(3.0f));
        frameLayout3.addView((View) textView2, w7.b6.c(-2.0f, -2));
        addView(frameLayout3, w7.b6.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / org.telegram.messenger.i0.f16025p), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / org.telegram.messenger.i0.f16025p), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i10, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.t6.P1, Math.max(1, i10)).setBreakStrategy(0).setHyphenationFrequency(0);
            if (cd.X) {
                alignment = ov0.a();
            } else {
                Layout.Alignment[] alignmentArr = ov0.f29202a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, org.telegram.ui.ActionBar.t6.P1, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    private void setHeight(int i10) {
        s4.o0 o0Var = (s4.o0) getLayoutParams();
        boolean z10 = true;
        if (o0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            o0Var = new s4.o0(-1, i10);
        } else {
            if (((ViewGroup.MarginLayoutParams) o0Var).height == i10) {
                z10 = false;
            }
            ((ViewGroup.MarginLayoutParams) o0Var).height = i10;
        }
        if (z10) {
            setLayoutParams(o0Var);
        }
    }

    private void setShowMoreMarginBottom(int i10) {
        FrameLayout frameLayout = this.f22017r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i10) {
            layoutParams.bottomMargin = i10;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        int i11;
        int height;
        boolean z12;
        float f7;
        int i12 = 0;
        if (this.Q) {
            this.f22013b0 = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.e;
        FrameLayout frameLayout = this.J;
        c cVar = this.f22016n;
        if (spannableStringBuilder != null && (i10 != this.f22011a0 || z10)) {
            StaticLayout c10 = c(i10, spannableStringBuilder);
            this.f22010a = c10;
            if (c10.getLineCount() >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f22013b0 = z11;
            int lineCount = this.f22010a.getLineCount();
            FrameLayout frameLayout2 = this.f22017r;
            if (lineCount >= 3 && this.f22013b0) {
                int max = Math.max(this.f22010a.getLineStart(2), this.f22010a.getLineEnd(2));
                if (this.e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i13 = max - 1;
                if (this.e.charAt(i13) != ' ' && this.e.charAt(i13) != '\n') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.P = z12;
                this.L = c(i10, this.e.subSequence(0, max));
                this.M = new StaticLayout[this.f22010a.getLineCount() - 3];
                this.O = new Point[this.f22010a.getLineCount() - 3];
                float lineRight = this.L.getLineRight(this.L.getLineCount() - 1);
                boolean z13 = this.P;
                float f10 = this.T;
                if (z13) {
                    f7 = f10;
                } else {
                    f7 = 0.0f;
                }
                float f11 = lineRight + f7;
                this.N = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i14 = f22009d0;
                    frameLayout2.measure(i14, i14);
                }
                for (int i15 = 3; i15 < this.f22010a.getLineCount(); i15++) {
                    int lineStart = this.f22010a.getLineStart(i15);
                    int lineEnd = this.f22010a.getLineEnd(i15);
                    StaticLayout c11 = c(i10, this.e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i16 = i15 - 3;
                    this.M[i16] = c11;
                    this.O[i16] = new Point();
                    if (this.N == -1) {
                        if (f11 > frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                            this.N = i16;
                        }
                    }
                    f11 += c11.getLineRight(0) + f10;
                }
                if (f11 < frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                    this.f22013b0 = false;
                }
            }
            if (!this.f22013b0) {
                this.L = null;
                this.M = null;
            }
            this.f22011a0 = i10;
            frameLayout.setMinimumHeight(g());
            if (this.f22013b0 && this.L != null) {
                if (this.h.getVisibility() == 0) {
                    i11 = org.telegram.messenger.i0.L(20.0f);
                } else {
                    i11 = 0;
                }
                int min = Math.min(f22008c0 + i11, g()) - org.telegram.messenger.i0.L(8.0f);
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
        if (!this.f22013b0) {
            i12 = 8;
        }
        cVar.setVisibility(i12);
        if (!this.f22013b0 && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.K);
        }
        if (this.f22013b0 && this.V < 1.0f && frameLayout.getBackground() != null) {
            frameLayout.setBackground(null);
        }
    }

    public final q80 b(StaticLayout staticLayout, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i15);
            float f7 = i14;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f7);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft <= f7 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f7 && i15 >= 0 && i15 <= staticLayout.getHeight()) {
                Spannable spannable = (Spannable) staticLayout.getText();
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0 && !org.telegram.messenger.i0.C1()) {
                    q80 q80Var = new q80(clickableSpanArr[0], this.I, i12, i13, 0);
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21336ze, this.I);
                    RectF rectF = ProfileActivity.R6;
                    q80Var.d(w02);
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    k80 b10 = q80Var.b();
                    float f10 = i11;
                    this.f22021y = f10;
                    b10.d(staticLayout, spanStart, f10);
                    staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                    return q80Var;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f7) {
        g gVar = this.F;
        g gVar2 = null;
        if (gVar != null) {
            gVar.a(false);
            this.F = null;
        }
        if (layout != null && clickableSpan != null) {
            gVar2 = new g(this, layout, clickableSpan, f7);
        }
        this.F = gVar2;
        if (clickableSpan instanceof e51) {
            String url = ((e51) clickableSpan).getURL();
            if (!url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$") && !url.startsWith("/")) {
                return;
            }
            g gVar3 = this.F;
            ProfileActivity profileActivity = ((sx0) this).f41664e0.e;
            RectF rectF = ProfileActivity.R6;
            profileActivity.O4(url, gVar3);
        } else if (clickableSpan instanceof URLSpan) {
            String url2 = ((URLSpan) clickableSpan).getURL();
            if (org.telegram.messenger.i0.I3(url2)) {
                org.telegram.ui.Components.s4.q0(this.H, url2, true, true, true, false, this.F, null, null);
                return;
            }
            gf.f.p(getContext(), Uri.parse(url2), true, true, this.F);
        } else {
            clickableSpan.onClick(this);
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.E.f(true);
        this.f22020x = null;
        org.telegram.messenger.i0.r(this.U);
        invalidate();
    }

    public final void f(String str, String str2, boolean z10) {
        String str3;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f22012b)) {
            try {
                str3 = org.telegram.messenger.i0.U.matcher(str).replaceAll("\u200c");
            } catch (Throwable unused) {
                str3 = str;
            }
            try {
                this.f22012b = str3;
            } catch (Throwable unused2) {
                this.f22012b = str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22012b);
            this.e = spannableStringBuilder;
            this.f22015f = null;
            jj.e(false, spannableStringBuilder, false, false, !z10);
            org.telegram.messenger.k6.l(this.e, org.telegram.ui.ActionBar.t6.P1.getFontMetricsInt(), false);
            if (this.f22011a0 <= 0) {
                this.f22011a0 = org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(36.0f);
            }
            a(this.f22011a0, true);
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
                a(this.f22011a0, true);
            }
            requestLayout();
        }
    }

    public final int g() {
        int L;
        StaticLayout staticLayout = this.f22010a;
        if (staticLayout != null) {
            L = staticLayout.getHeight();
        } else {
            L = org.telegram.messenger.i0.L(20.0f);
        }
        int L2 = org.telegram.messenger.i0.L(16.0f) + L;
        if (this.h.getVisibility() == 0) {
            return org.telegram.messenger.i0.L(23.0f) + L2;
        }
        return L2;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W = null;
        }
        float f7 = this.V;
        float g10 = g();
        float min = Math.min(f22008c0, g10);
        Math.abs(org.telegram.messenger.i0.T1(min, g10, 1.0f) - org.telegram.messenger.i0.T1(min, g10, f7));
        this.W = ValueAnimator.ofFloat(0.0f, 1.0f);
        ?? obj = new Object();
        obj.f13938a = 0.0f;
        obj.f13939b = 0.0f;
        this.W.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f7)), f7, 1.0f, (o1.e) obj));
        this.W.addListener(new org.telegram.ui.s9(this, 1));
        this.W.setDuration(Math.abs(f7 - 1.0f) * 1250.0f * 2.0f);
        this.W.start();
    }

    public final int i() {
        int i10;
        int g10 = g();
        if (this.h.getVisibility() == 0) {
            i10 = org.telegram.messenger.i0.L(20.0f);
        } else {
            i10 = 0;
        }
        float min = Math.min(f22008c0 + i10, g());
        if (this.f22013b0) {
            g10 = (int) org.telegram.messenger.i0.T1(min, g10, this.V);
        }
        setHeight(g10);
        return g10;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f22010a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f22015f;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new h(0, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.f22015f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder = this.e;
                        this.f22015f = spannableStringBuilder;
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
        a(View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(36.0f), false);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i(), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMoreButtonDisabled(boolean z10) {
        this.Q = z10;
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = org.telegram.ui.ActionBar.t6.P1;
        int i10 = org.telegram.ui.ActionBar.t6.Uc;
        org.telegram.ui.ActionBar.p6 p6Var = this.I;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        RectF rectF = ProfileActivity.R6;
        textPaint.linkColor = w02;
        try {
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i6, p6Var);
            y yVar = this.K;
            if (yVar != null && w03 != this.R) {
                this.R = w03;
                org.telegram.ui.ActionBar.t6.H1(yVar, w03, true);
            }
            this.S.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
