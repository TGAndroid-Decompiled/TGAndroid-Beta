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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class n00 extends org.telegram.ui.Components.za0 {
    public boolean f47927l0;
    public boolean m0;
    public boolean f47928n0;
    public boolean f47929o0;
    public final Paint f47930p0;
    public Boolean f47931q0;
    public final o00 f47932r0;

    public n00(o00 o00Var, Activity activity) {
        super(activity);
        this.f47932r0 = o00Var;
        new Paint(1);
        this.f47930p0 = new Paint(1);
    }

    private void setLightStatusBar(int i7) {
        boolean z9;
        if (org.telegram.messenger.g0.B(i7) >= 0.721f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f47931q0;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        View view = this.f47932r0.fragmentView;
        this.f47931q0 = Boolean.valueOf(z9);
        org.telegram.messenger.g0.r3(view, z9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int round;
        float f10;
        float f11;
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        boolean z9;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        o00 o00Var = this.f47932r0;
        Paint paint = o00Var.K;
        ah.a aVar = o00Var.D;
        if (!o00Var.f48196f) {
            if (o00Var.h) {
                float f12 = o00Var.f48197n + 0.016f;
                o00Var.f48197n = f12;
                if (f12 > 3.0f) {
                    o00Var.h = false;
                }
            } else {
                float f13 = o00Var.f48197n - 0.016f;
                o00Var.f48197n = f13;
                if (f13 < 1.0f) {
                    o00Var.h = true;
                }
            }
        }
        if (o00Var.f48194c.getLayoutManager() != null) {
            view = o00Var.f48194c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(o00Var.q0() + view.getBottom());
        }
        o00Var.f48198r = round;
        FrameLayout p02 = o00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f14 = 1.0f - ((o00Var.f48198r - L) / (o00Var.J - L));
        o00Var.f48200w = f14;
        float f15 = 0.0f;
        o00Var.f48200w = Utilities.i(f14, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (o00Var.f48198r < L2) {
            o00Var.f48198r = L2;
        }
        float f16 = o00Var.f48202y;
        o00Var.f48202y = 0.0f;
        if (o00Var.f48198r < org.telegram.messenger.g0.L(30.0f) + L2) {
            o00Var.f48202y = ((org.telegram.messenger.g0.L(30.0f) + L2) - o00Var.f48198r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (o00Var.H) {
            o00Var.f48202y = 1.0f;
            o00Var.f48200w = 1.0f;
        }
        if (f16 != o00Var.f48202y) {
            o00Var.f48194c.invalidate();
        }
        o00Var.t0(o00Var.f48200w);
        int measuredHeight = p02.getMeasuredHeight();
        int i11 = o00Var.f48198r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) aVar.f1058c;
        FrameLayout frameLayout = (FrameLayout) aVar.f1059e;
        TextView textView = (TextView) aVar.f1057b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        int L3 = org.telegram.messenger.g0.L(16.0f);
        float max = Math.max((((((measuredHeight - o00Var.I) - textView.getMeasuredHeight()) / 2.0f) + o00Var.I) - aVar.getTop()) - textView.getTop(), L3 + (i11 - ((measuredHeight2 + measuredHeight) - o00Var.I)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f17 = o00Var.f48200w;
        float z10 = com.google.android.recaptcha.internal.a.z(1.0f, f17, 0.4f, 0.6f);
        if (f17 > 0.5f) {
            f10 = (f17 - 0.5f) / 0.5f;
        } else {
            f10 = 0.0f;
        }
        float f18 = 1.0f - f10;
        frameLayout2.setScaleX(z10);
        frameLayout2.setScaleY(z10);
        frameLayout2.setAlpha(f18);
        frameLayout.setAlpha(f18);
        w70Var.setAlpha(f18);
        if (o00Var.z0()) {
            if (f18 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            w70Var.setVisibility(i10);
        }
        o00Var.f48195e.setAlpha(1.0f - o00Var.f48200w);
        o00Var.f48195e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L4 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f19 = o00Var.f48200w;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        if (!o00Var.z0()) {
            f15 = (1.0f - org.telegram.ui.Components.xq.h.getInterpolation(1.0f - f11)) * L4;
        }
        textView.setTranslationX(f15);
        if (!o00Var.f48196f) {
            invalidate();
        }
        o00Var.f48192a.d(0, (-getMeasuredWidth()) * 0.1f * o00Var.f48197n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (o00Var.M) {
            int themedColor = o00Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27792a7);
            Paint paint2 = this.f47930p0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), o00Var.f48192a.f56777f);
        }
        int themedColor2 = o00Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27956j5);
        if (o00Var.M) {
            i7 = org.telegram.ui.ActionBar.k6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.Hk;
        }
        int f20 = i0.a.f(f18, themedColor2, o00Var.getThemedColor(i7));
        kVar = ((org.telegram.ui.ActionBar.f2) o00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.f2) o00Var).actionBar;
            kVar2.getBackButton().setColorFilter(f20);
        }
        textView.setTextColor(f20);
        paint.setAlpha((int) ((1.0f - f18) * 255.0f));
        if (paint.getAlpha() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        o00Var.s0(z9);
        int i12 = org.telegram.ui.ActionBar.k6.Gk;
        f6Var = ((org.telegram.ui.ActionBar.f2) o00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), paint.getColor()));
        if (!o00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f18 <= 0.01f && o00Var.n0()) {
            q4Var = ((org.telegram.ui.ActionBar.f2) o00Var).parentLayout;
            ((ActionBarLayout) q4Var).p(canvas, 255, p02.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        o00 o00Var = this.f47932r0;
        if (!o00Var.z0()) {
            kVar = ((org.telegram.ui.ActionBar.f2) o00Var).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.f2) o00Var).actionBar;
                ImageView backButton = kVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.f47929o0 = true;
                        }
                    }
                    if (this.f47929o0) {
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return dispatchTouchEvent;
                        }
                        this.f47929o0 = false;
                        return dispatchTouchEvent;
                    }
                }
            }
            ah.a aVar = o00Var.D;
            float x10 = aVar.getX();
            FrameLayout frameLayout = (FrameLayout) aVar.f1059e;
            FrameLayout frameLayout2 = (FrameLayout) aVar.d;
            org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) aVar.f1058c;
            float x11 = w70Var.getX() + x10;
            float y10 = w70Var.getY() + aVar.getY();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(x11, y10, w70Var.getMeasuredWidth() + x11, w70Var.getMeasuredHeight() + y10);
            if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.m0) || o00Var.f48194c.I1 || (layout = w70Var.getLayout()) == null) {
                f10 = 1.0f;
            } else {
                CharSequence text = layout.getText();
                f10 = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && o00Var.f48202y < 1.0f) {
                        motionEvent.offsetLocation(-x11, -y10);
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                this.m0 = false;
                            }
                        } else {
                            this.m0 = true;
                        }
                        w70Var.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
            }
            float x12 = frameLayout2.getX() + aVar.getX();
            float y11 = frameLayout2.getY() + aVar.getY();
            boolean isClickable = frameLayout2.isClickable();
            rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f47927l0) && !o00Var.f48194c.I1 && isClickable && o00Var.f48202y < f10) {
                motionEvent.offsetLocation(-x12, -y11);
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.f47927l0 = false;
                    }
                } else {
                    this.f47927l0 = true;
                }
                frameLayout2.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x13 = frameLayout.getX() + aVar.getX();
            float y12 = frameLayout.getY() + aVar.getY();
            rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f47928n0) && !o00Var.f48194c.I1 && o00Var.f48202y < f10) {
                motionEvent.offsetLocation(-x13, -y12);
                if (motionEvent.getAction() == 0) {
                    this.f47928n0 = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f47928n0 = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                if (this.f47928n0) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        o00 o00Var = this.f47932r0;
        if (view == o00Var.r0() && !o00Var.z0()) {
            canvas.save();
            canvas.clipRect(0, o00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n00.onMeasure(int, int):void");
    }
}
