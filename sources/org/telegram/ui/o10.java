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
public final class o10 extends org.telegram.ui.Components.sb0 {
    public boolean f40093l0;
    public boolean m0;
    public boolean f40094n0;
    public boolean f40095o0;
    public final Paint f40096p0;
    public Boolean f40097q0;
    public final p10 f40098r0;

    public o10(p10 p10Var, Activity activity) {
        super(activity);
        this.f40098r0 = p10Var;
        new Paint(1);
        this.f40096p0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10;
        if (org.telegram.messenger.i0.B(i10) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f40097q0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.f40098r0.fragmentView;
        this.f40097q0 = Boolean.valueOf(z10);
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
        p10 p10Var = this.f40098r0;
        Paint paint = p10Var.K;
        m10 m10Var = p10Var.D;
        if (!p10Var.f40418f) {
            if (p10Var.h) {
                float f11 = p10Var.f40419n + 0.016f;
                p10Var.f40419n = f11;
                if (f11 > 3.0f) {
                    p10Var.h = false;
                }
            } else {
                float f12 = p10Var.f40419n - 0.016f;
                p10Var.f40419n = f12;
                if (f12 < 1.0f) {
                    p10Var.h = true;
                }
            }
        }
        if (p10Var.f40417c.getLayoutManager() != null) {
            view = p10Var.f40417c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(p10Var.p0() + view.getBottom());
        }
        p10Var.f40420r = round;
        FrameLayout o02 = p10Var.o0();
        int L = org.telegram.messenger.i0.L(16.0f) + o02.getBottom();
        float f13 = 1.0f - ((p10Var.f40420r - L) / (p10Var.J - L));
        p10Var.f40422w = f13;
        float f14 = 0.0f;
        p10Var.f40422w = Utilities.i(f13, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.i0.L(16.0f) + o02.getBottom();
        if (p10Var.f40420r < L2) {
            p10Var.f40420r = L2;
        }
        float f15 = p10Var.f40424y;
        p10Var.f40424y = 0.0f;
        if (p10Var.f40420r < org.telegram.messenger.i0.L(30.0f) + L2) {
            p10Var.f40424y = ((org.telegram.messenger.i0.L(30.0f) + L2) - p10Var.f40420r) / org.telegram.messenger.i0.L(30.0f);
        }
        if (p10Var.H) {
            p10Var.f40424y = 1.0f;
            p10Var.f40422w = 1.0f;
        }
        if (f15 != p10Var.f40424y) {
            p10Var.f40417c.invalidate();
        }
        p10Var.s0(p10Var.f40422w);
        int measuredHeight = o02.getMeasuredHeight();
        int i12 = p10Var.f40420r;
        int measuredHeight2 = m10Var.getMeasuredHeight();
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) m10Var.f39452c;
        FrameLayout frameLayout = (FrameLayout) m10Var.e;
        TextView textView = (TextView) m10Var.f39451b;
        FrameLayout frameLayout2 = (FrameLayout) m10Var.d;
        int L3 = org.telegram.messenger.i0.L(16.0f);
        float max = Math.max((((((measuredHeight - p10Var.I) - textView.getMeasuredHeight()) / 2.0f) + p10Var.I) - m10Var.getTop()) - textView.getTop(), L3 + (i12 - ((measuredHeight2 + measuredHeight) - p10Var.I)));
        m10Var.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.L(16.0f));
        float f16 = p10Var.f40422w;
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
        if (p10Var.y0()) {
            if (f17 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            frameLayout2.setVisibility(i11);
            frameLayout.setVisibility(i11);
            p80Var.setVisibility(i11);
        }
        p10Var.e.setAlpha(1.0f - p10Var.f40422w);
        p10Var.e.setTranslationY((frameLayout2.getY() + m10Var.getY()) - org.telegram.messenger.i0.L(30.0f));
        float L4 = org.telegram.messenger.i0.L(72.0f) - textView.getLeft();
        float f18 = p10Var.f40422w;
        if (f18 > 0.3f) {
            f10 = (f18 - 0.3f) / 0.7f;
        } else {
            f10 = 0.0f;
        }
        if (!p10Var.y0()) {
            f14 = (1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - f10)) * L4;
        }
        textView.setTranslationX(f14);
        if (!p10Var.f40418f) {
            invalidate();
        }
        p10Var.f40415a.d(0, (-getMeasuredWidth()) * 0.1f * p10Var.f40419n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (p10Var.M) {
            int themedColor = p10Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7);
            Paint paint2 = this.f40096p0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), p10Var.f40415a.f11142f);
        }
        int themedColor2 = p10Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21037j5);
        if (p10Var.M) {
            i10 = org.telegram.ui.ActionBar.t6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Hk;
        }
        int f19 = i0.b.f(f17, themedColor2, p10Var.getThemedColor(i10));
        if (p10.Y(p10Var) != null) {
            p10.Z(p10Var).getBackButton().setColorFilter(f19);
        }
        textView.setTextColor(f19);
        paint.setAlpha((int) ((1.0f - f17) * 255.0f));
        if (paint.getAlpha() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p10Var.r0(z10);
        setLightStatusBar(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gk, p10.a0(p10Var)), paint.getColor()));
        if (!p10Var.y0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), o02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f17 <= 0.01f && p10Var.m0()) {
            ((ActionBarLayout) p10.b0(p10Var)).p(canvas, 255, o02.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        float f7;
        ImageView backButton;
        p10 p10Var = this.f40098r0;
        if (p10Var.y0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (p10.e0(p10Var) != null && (backButton = p10.f0(p10Var).getBackButton()) != null && backButton.getVisibility() == 0) {
            if (motionEvent.getAction() == 0) {
                RectF rectF = org.telegram.messenger.i0.P;
                if (zg.h.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f40095o0 = true;
                }
            }
            if (this.f40095o0) {
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return dispatchTouchEvent;
                }
                this.f40095o0 = false;
                return dispatchTouchEvent;
            }
        }
        m10 m10Var = p10Var.D;
        float x10 = m10Var.getX();
        FrameLayout frameLayout = (FrameLayout) m10Var.e;
        FrameLayout frameLayout2 = (FrameLayout) m10Var.d;
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) m10Var.f39452c;
        float x11 = p80Var.getX() + x10;
        float y3 = p80Var.getY() + m10Var.getY();
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(x11, y3, p80Var.getMeasuredWidth() + x11, p80Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.m0) || p10Var.f40417c.I1 || (layout = p80Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && p10Var.f40424y < 1.0f) {
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
        float x12 = frameLayout2.getX() + m10Var.getX();
        float y10 = frameLayout2.getY() + m10Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f40093l0) && !p10Var.f40417c.I1 && isClickable && p10Var.f40424y < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f40093l0 = false;
                }
            } else {
                this.f40093l0 = true;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + m10Var.getX();
        float y11 = frameLayout.getY() + m10Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f40094n0) && !p10Var.f40417c.I1 && p10Var.f40424y < f7) {
            motionEvent.offsetLocation(-x13, -y11);
            if (motionEvent.getAction() == 0) {
                this.f40094n0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f40094n0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.f40094n0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        p10 p10Var = this.f40098r0;
        if (view == p10Var.q0() && !p10Var.y0()) {
            canvas.save();
            canvas.clipRect(0, p10Var.o0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
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
        p10 p10Var = this.f40098r0;
        m10 m10Var = p10Var.D;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        p10Var.H = z10;
        if (p10.c0(p10Var) != null && ((ActionBarLayout) p10.d0(p10Var)).S0) {
            i12 = 0;
        } else {
            i12 = org.telegram.messenger.i0.f16020m;
        }
        p10Var.I = i12;
        m10Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams = p10Var.e.getLayoutParams();
        int i13 = p10Var.E;
        if (i13 <= 0) {
            i13 = m10Var.getMeasuredHeight();
        }
        layoutParams.height = i13;
        s4.a0 a0Var = p10Var.F;
        if (a0Var instanceof org.telegram.ui.Components.az) {
            org.telegram.ui.Components.az azVar = (org.telegram.ui.Components.az) a0Var;
            azVar.M = p10Var.o0().getMeasuredHeight();
            azVar.p1();
            ((org.telegram.ui.Components.az) p10Var.F).S = 0;
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            p10Var.v0();
        }
    }
}
