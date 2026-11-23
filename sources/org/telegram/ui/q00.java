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
public final class q00 extends org.telegram.ui.Components.ib0 {
    public boolean m0;
    public boolean f51202n0;
    public boolean f51203o0;
    public boolean f51204p0;
    public final Paint f51205q0;
    public Boolean f51206r0;
    public final r00 f51207s0;

    public q00(r00 r00Var, Activity activity) {
        super(activity);
        this.f51207s0 = r00Var;
        new Paint(1);
        this.f51205q0 = new Paint(1);
    }

    private void setLightStatusBar(int i7) {
        boolean z10;
        if (org.telegram.messenger.g0.B(i7) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f51206r0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.f51207s0.fragmentView;
        this.f51206r0 = Boolean.valueOf(z10);
        org.telegram.messenger.g0.q3(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int round;
        float f10;
        float f11;
        int i7;
        boolean z10;
        int i10;
        r00 r00Var = this.f51207s0;
        Paint paint = r00Var.L;
        ah.a aVar = r00Var.E;
        if (!r00Var.f51571f) {
            if (r00Var.h) {
                float f12 = r00Var.f51572n + 0.016f;
                r00Var.f51572n = f12;
                if (f12 > 3.0f) {
                    r00Var.h = false;
                }
            } else {
                float f13 = r00Var.f51572n - 0.016f;
                r00Var.f51572n = f13;
                if (f13 < 1.0f) {
                    r00Var.h = true;
                }
            }
        }
        if (r00Var.f51569c.getLayoutManager() != null) {
            view = r00Var.f51569c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(r00Var.q0() + view.getBottom());
        }
        r00Var.f51573r = round;
        FrameLayout p02 = r00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f14 = 1.0f - ((r00Var.f51573r - L) / (r00Var.K - L));
        r00Var.f51575w = f14;
        float f15 = 0.0f;
        r00Var.f51575w = Utilities.i(f14, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (r00Var.f51573r < L2) {
            r00Var.f51573r = L2;
        }
        float f16 = r00Var.f51577y;
        r00Var.f51577y = 0.0f;
        if (r00Var.f51573r < org.telegram.messenger.g0.L(30.0f) + L2) {
            r00Var.f51577y = ((org.telegram.messenger.g0.L(30.0f) + L2) - r00Var.f51573r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (r00Var.I) {
            r00Var.f51577y = 1.0f;
            r00Var.f51575w = 1.0f;
        }
        if (f16 != r00Var.f51577y) {
            r00Var.f51569c.invalidate();
        }
        r00Var.t0(r00Var.f51575w);
        int measuredHeight = p02.getMeasuredHeight();
        int i11 = r00Var.f51573r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) aVar.f1055c;
        FrameLayout frameLayout = (FrameLayout) aVar.f1056e;
        TextView textView = (TextView) aVar.f1054b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        int L3 = org.telegram.messenger.g0.L(16.0f);
        float max = Math.max((((((measuredHeight - r00Var.J) - textView.getMeasuredHeight()) / 2.0f) + r00Var.J) - aVar.getTop()) - textView.getTop(), L3 + (i11 - ((measuredHeight2 + measuredHeight) - r00Var.J)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f17 = r00Var.f51575w;
        float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f17, 0.4f, 0.6f);
        if (f17 > 0.5f) {
            f10 = (f17 - 0.5f) / 0.5f;
        } else {
            f10 = 0.0f;
        }
        float f18 = 1.0f - f10;
        frameLayout2.setScaleX(z11);
        frameLayout2.setScaleY(z11);
        frameLayout2.setAlpha(f18);
        frameLayout.setAlpha(f18);
        j80Var.setAlpha(f18);
        if (r00Var.z0()) {
            if (f18 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            j80Var.setVisibility(i10);
        }
        r00Var.f51570e.setAlpha(1.0f - r00Var.f51575w);
        r00Var.f51570e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L4 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f19 = r00Var.f51575w;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        if (!r00Var.z0()) {
            f15 = (1.0f - org.telegram.ui.Components.kr.h.getInterpolation(1.0f - f11)) * L4;
        }
        textView.setTranslationX(f15);
        if (!r00Var.f51571f) {
            invalidate();
        }
        r00Var.f51567a.d(0, (-getMeasuredWidth()) * 0.1f * r00Var.f51572n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (r00Var.N) {
            int themedColor = r00Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7);
            Paint paint2 = this.f51205q0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), r00Var.f51567a.f58727f);
        }
        int themedColor2 = r00Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29559j5);
        if (r00Var.N) {
            i7 = org.telegram.ui.ActionBar.n6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.Kk;
        }
        int f20 = i0.a.f(f18, themedColor2, r00Var.getThemedColor(i7));
        if (r00.Z(r00Var) != null) {
            r00.a0(r00Var).getBackButton().setColorFilter(f20);
        }
        textView.setTextColor(f20);
        paint.setAlpha((int) ((1.0f - f18) * 255.0f));
        if (paint.getAlpha() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        r00Var.s0(z10);
        setLightStatusBar(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Jk, r00.b0(r00Var)), paint.getColor()));
        if (!r00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f18 <= 0.01f && r00Var.n0()) {
            ((ActionBarLayout) r00.c0(r00Var)).p(canvas, 255, p02.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        float f10;
        ImageView backButton;
        r00 r00Var = this.f51207s0;
        if (r00Var.z0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (r00.f0(r00Var) != null && (backButton = r00.g0(r00Var).getBackButton()) != null && backButton.getVisibility() == 0) {
            if (motionEvent.getAction() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f51204p0 = true;
                }
            }
            if (this.f51204p0) {
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return dispatchTouchEvent;
                }
                this.f51204p0 = false;
                return dispatchTouchEvent;
            }
        }
        ah.a aVar = r00Var.E;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.f1056e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) aVar.f1055c;
        float x11 = j80Var.getX() + x10;
        float y10 = j80Var.getY() + aVar.getY();
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(x11, y10, j80Var.getMeasuredWidth() + x11, j80Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.f51202n0) || r00Var.f51569c.J1 || (layout = j80Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && r00Var.f51577y < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y10);
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.f51202n0 = false;
                        }
                    } else {
                        this.f51202n0 = true;
                    }
                    j80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) && !r00Var.f51569c.J1 && isClickable && r00Var.f51577y < f10) {
            motionEvent.offsetLocation(-x12, -y11);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.m0 = false;
                }
            } else {
                this.m0 = true;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + aVar.getX();
        float y12 = frameLayout.getY() + aVar.getY();
        rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f51203o0) && !r00Var.f51569c.J1 && r00Var.f51577y < f10) {
            motionEvent.offsetLocation(-x13, -y12);
            if (motionEvent.getAction() == 0) {
                this.f51203o0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f51203o0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.f51203o0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        r00 r00Var = this.f51207s0;
        if (view == r00Var.r0() && !r00Var.z0()) {
            canvas.save();
            canvas.clipRect(0, r00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        int i11;
        r00 r00Var = this.f51207s0;
        ah.a aVar = r00Var.E;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        r00Var.I = z10;
        if (r00.d0(r00Var) != null && ((ActionBarLayout) r00.e0(r00Var)).T0) {
            i11 = 0;
        } else {
            i11 = org.telegram.messenger.g0.f24220m;
        }
        r00Var.J = i11;
        aVar.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams = r00Var.f51570e.getLayoutParams();
        int i12 = r00Var.F;
        if (i12 <= 0) {
            i12 = aVar.getMeasuredHeight();
        }
        layoutParams.height = i12;
        v4.c0 c0Var = r00Var.G;
        if (c0Var instanceof org.telegram.ui.Components.vy) {
            org.telegram.ui.Components.vy vyVar = (org.telegram.ui.Components.vy) c0Var;
            vyVar.M = r00Var.p0().getMeasuredHeight();
            vyVar.p1();
            ((org.telegram.ui.Components.vy) r00Var.G).S = 0;
        }
        super.onMeasure(i7, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            r00Var.w0();
        }
    }
}
