package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class n10 extends org.telegram.ui.Components.sb0 {
    public boolean f39662l0;
    public boolean m0;
    public boolean f39663n0;
    public boolean f39664o0;
    public final Paint f39665p0;
    public Boolean f39666q0;
    public final o10 f39667r0;

    public n10(o10 o10Var, Activity activity) {
        super(activity);
        this.f39667r0 = o10Var;
        new Paint(1);
        this.f39665p0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10;
        if (org.telegram.messenger.i0.B(i10) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f39666q0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.f39667r0.fragmentView;
        this.f39666q0 = Boolean.valueOf(z10);
        org.telegram.messenger.i0.q3(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int round;
        float f7;
        float f10;
        int i10;
        boolean z10;
        int i11;
        o10 o10Var = this.f39667r0;
        Paint paint = o10Var.K;
        l10 l10Var = o10Var.D;
        if (!o10Var.f40008f) {
            if (o10Var.h) {
                float f11 = o10Var.f40009n + 0.016f;
                o10Var.f40009n = f11;
                if (f11 > 3.0f) {
                    o10Var.h = false;
                }
            } else {
                float f12 = o10Var.f40009n - 0.016f;
                o10Var.f40009n = f12;
                if (f12 < 1.0f) {
                    o10Var.h = true;
                }
            }
        }
        if (o10Var.f40007c.getLayoutManager() != null) {
            view = o10Var.f40007c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(o10Var.q0() + view.getBottom());
        }
        o10Var.f40010r = round;
        FrameLayout p02 = o10Var.p0();
        int L = org.telegram.messenger.i0.L(16.0f) + p02.getBottom();
        float f13 = 1.0f - ((o10Var.f40010r - L) / (o10Var.J - L));
        o10Var.f40012w = f13;
        float f14 = 0.0f;
        o10Var.f40012w = Utilities.i(f13, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.i0.L(16.0f) + p02.getBottom();
        if (o10Var.f40010r < L2) {
            o10Var.f40010r = L2;
        }
        float f15 = o10Var.f40014y;
        o10Var.f40014y = 0.0f;
        if (o10Var.f40010r < org.telegram.messenger.i0.L(30.0f) + L2) {
            o10Var.f40014y = ((org.telegram.messenger.i0.L(30.0f) + L2) - o10Var.f40010r) / org.telegram.messenger.i0.L(30.0f);
        }
        if (o10Var.H) {
            o10Var.f40014y = 1.0f;
            o10Var.f40012w = 1.0f;
        }
        if (f15 != o10Var.f40014y) {
            o10Var.f40007c.invalidate();
        }
        o10Var.t0(o10Var.f40012w);
        int measuredHeight = p02.getMeasuredHeight();
        int i12 = o10Var.f40010r;
        int measuredHeight2 = l10Var.getMeasuredHeight();
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) l10Var.f39051c;
        FrameLayout frameLayout = (FrameLayout) l10Var.e;
        TextView textView = (TextView) l10Var.f39050b;
        FrameLayout frameLayout2 = (FrameLayout) l10Var.d;
        int L3 = org.telegram.messenger.i0.L(16.0f);
        float max = Math.max((((((measuredHeight - o10Var.I) - textView.getMeasuredHeight()) / 2.0f) + o10Var.I) - l10Var.getTop()) - textView.getTop(), L3 + (i12 - ((measuredHeight2 + measuredHeight) - o10Var.I)));
        l10Var.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.L(16.0f));
        float f16 = o10Var.f40012w;
        float z11 = c3.i0.z(1.0f, f16, 0.4f, 0.6f);
        if (f16 > 0.5f) {
            f7 = (f16 - 0.5f) / 0.5f;
        } else {
            f7 = 0.0f;
        }
        float f17 = 1.0f - f7;
        frameLayout2.setScaleX(z11);
        frameLayout2.setScaleY(z11);
        frameLayout2.setAlpha(f17);
        frameLayout.setAlpha(f17);
        p80Var.setAlpha(f17);
        if (o10Var.z0()) {
            if (f17 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            frameLayout2.setVisibility(i11);
            frameLayout.setVisibility(i11);
            p80Var.setVisibility(i11);
        }
        o10Var.e.setAlpha(1.0f - o10Var.f40012w);
        o10Var.e.setTranslationY((frameLayout2.getY() + l10Var.getY()) - org.telegram.messenger.i0.L(30.0f));
        float L4 = org.telegram.messenger.i0.L(72.0f) - textView.getLeft();
        float f18 = o10Var.f40012w;
        if (f18 > 0.3f) {
            f10 = (f18 - 0.3f) / 0.7f;
        } else {
            f10 = 0.0f;
        }
        if (!o10Var.z0()) {
            f14 = (1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - f10)) * L4;
        }
        textView.setTranslationX(f14);
        if (!o10Var.f40008f) {
            invalidate();
        }
        o10Var.f40005a.d(0, (-getMeasuredWidth()) * 0.1f * o10Var.f40009n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (o10Var.M) {
            int themedColor = o10Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7);
            Paint paint2 = this.f39665p0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), o10Var.f40005a.f11143f);
        }
        int themedColor2 = o10Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21038j5);
        if (o10Var.M) {
            i10 = org.telegram.ui.ActionBar.t6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Hk;
        }
        int f19 = i0.b.f(f17, themedColor2, o10Var.getThemedColor(i10));
        if (o10.Z(o10Var) != null) {
            o10.a0(o10Var).getBackButton().setColorFilter(f19);
        }
        textView.setTextColor(f19);
        paint.setAlpha((int) ((1.0f - f17) * 255.0f));
        if (paint.getAlpha() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o10Var.s0(z10);
        setLightStatusBar(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gk, o10.b0(o10Var)), paint.getColor()));
        if (!o10Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f17 <= 0.01f && o10Var.n0()) {
            ((ActionBarLayout) o10.c0(o10Var)).p(canvas, 255, p02.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        float f7;
        ImageView backButton;
        o10 o10Var = this.f39667r0;
        if (o10Var.z0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (o10.f0(o10Var) != null && (backButton = o10.g0(o10Var).getBackButton()) != null && backButton.getVisibility() == 0) {
            if (motionEvent.getAction() == 0) {
                RectF rectF = org.telegram.messenger.i0.P;
                if (zg.h.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f39664o0 = true;
                }
            }
            if (this.f39664o0) {
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return dispatchTouchEvent;
                }
                this.f39664o0 = false;
                return dispatchTouchEvent;
            }
        }
        l10 l10Var = o10Var.D;
        float x10 = l10Var.getX();
        FrameLayout frameLayout = (FrameLayout) l10Var.e;
        FrameLayout frameLayout2 = (FrameLayout) l10Var.d;
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) l10Var.f39051c;
        float x11 = p80Var.getX() + x10;
        float y3 = p80Var.getY() + l10Var.getY();
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(x11, y3, p80Var.getMeasuredWidth() + x11, p80Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.m0) || o10Var.f40007c.I1 || (layout = p80Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && o10Var.f40014y < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.m0 = false;
                        }
                    } else {
                        this.m0 = true;
                    }
                    p80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + l10Var.getX();
        float y10 = frameLayout2.getY() + l10Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f39662l0) && !o10Var.f40007c.I1 && isClickable && o10Var.f40014y < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f39662l0 = false;
                }
            } else {
                this.f39662l0 = true;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + l10Var.getX();
        float y11 = frameLayout.getY() + l10Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f39663n0) && !o10Var.f40007c.I1 && o10Var.f40014y < f7) {
            motionEvent.offsetLocation(-x13, -y11);
            if (motionEvent.getAction() == 0) {
                this.f39663n0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f39663n0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.f39663n0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        o10 o10Var = this.f39667r0;
        if (view == o10Var.r0() && !o10Var.z0()) {
            canvas.save();
            canvas.clipRect(0, o10Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        o10 o10Var = this.f39667r0;
        l10 l10Var = o10Var.D;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        o10Var.H = z10;
        if (o10.d0(o10Var) != null && ((ActionBarLayout) o10.e0(o10Var)).S0) {
            i12 = 0;
        } else {
            i12 = org.telegram.messenger.i0.f16166m;
        }
        o10Var.I = i12;
        l10Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams = o10Var.e.getLayoutParams();
        int i13 = o10Var.E;
        if (i13 <= 0) {
            i13 = l10Var.getMeasuredHeight();
        }
        layoutParams.height = i13;
        s4.a0 a0Var = o10Var.F;
        if (a0Var instanceof org.telegram.ui.Components.az) {
            org.telegram.ui.Components.az azVar = (org.telegram.ui.Components.az) a0Var;
            azVar.M = o10Var.p0().getMeasuredHeight();
            azVar.p1();
            ((org.telegram.ui.Components.az) o10Var.F).S = 0;
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            o10Var.w0();
        }
    }
}
