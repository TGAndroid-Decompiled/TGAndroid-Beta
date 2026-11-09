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
public final class p00 extends org.telegram.ui.Components.ab0 {
    public boolean f48578l0;
    public boolean m0;
    public boolean f48579n0;
    public boolean f48580o0;
    public final Paint f48581p0;
    public Boolean f48582q0;
    public final q00 f48583r0;

    public p00(q00 q00Var, Activity activity) {
        super(activity);
        this.f48583r0 = q00Var;
        new Paint(1);
        this.f48581p0 = new Paint(1);
    }

    private void setLightStatusBar(int i7) {
        boolean z9;
        if (org.telegram.messenger.g0.B(i7) >= 0.721f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f48582q0;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        View view = this.f48583r0.fragmentView;
        this.f48582q0 = Boolean.valueOf(z9);
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
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        q00 q00Var = this.f48583r0;
        Paint paint = q00Var.K;
        ah.a aVar = q00Var.D;
        if (!q00Var.f48844f) {
            if (q00Var.h) {
                float f12 = q00Var.f48845n + 0.016f;
                q00Var.f48845n = f12;
                if (f12 > 3.0f) {
                    q00Var.h = false;
                }
            } else {
                float f13 = q00Var.f48845n - 0.016f;
                q00Var.f48845n = f13;
                if (f13 < 1.0f) {
                    q00Var.h = true;
                }
            }
        }
        if (q00Var.f48842c.getLayoutManager() != null) {
            view = q00Var.f48842c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(q00Var.q0() + view.getBottom());
        }
        q00Var.f48846r = round;
        FrameLayout p02 = q00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f14 = 1.0f - ((q00Var.f48846r - L) / (q00Var.J - L));
        q00Var.f48848w = f14;
        float f15 = 0.0f;
        q00Var.f48848w = Utilities.i(f14, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (q00Var.f48846r < L2) {
            q00Var.f48846r = L2;
        }
        float f16 = q00Var.f48850y;
        q00Var.f48850y = 0.0f;
        if (q00Var.f48846r < org.telegram.messenger.g0.L(30.0f) + L2) {
            q00Var.f48850y = ((org.telegram.messenger.g0.L(30.0f) + L2) - q00Var.f48846r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (q00Var.H) {
            q00Var.f48850y = 1.0f;
            q00Var.f48848w = 1.0f;
        }
        if (f16 != q00Var.f48850y) {
            q00Var.f48842c.invalidate();
        }
        q00Var.t0(q00Var.f48848w);
        int measuredHeight = p02.getMeasuredHeight();
        int i11 = q00Var.f48846r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.x70 x70Var = (org.telegram.ui.Components.x70) aVar.f1058c;
        FrameLayout frameLayout = (FrameLayout) aVar.f1059e;
        TextView textView = (TextView) aVar.f1057b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        int L3 = org.telegram.messenger.g0.L(16.0f);
        float max = Math.max((((((measuredHeight - q00Var.I) - textView.getMeasuredHeight()) / 2.0f) + q00Var.I) - aVar.getTop()) - textView.getTop(), L3 + (i11 - ((measuredHeight2 + measuredHeight) - q00Var.I)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f17 = q00Var.f48848w;
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
        x70Var.setAlpha(f18);
        if (q00Var.z0()) {
            if (f18 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            x70Var.setVisibility(i10);
        }
        q00Var.f48843e.setAlpha(1.0f - q00Var.f48848w);
        q00Var.f48843e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L4 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f19 = q00Var.f48848w;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        if (!q00Var.z0()) {
            f15 = (1.0f - org.telegram.ui.Components.xq.h.getInterpolation(1.0f - f11)) * L4;
        }
        textView.setTranslationX(f15);
        if (!q00Var.f48844f) {
            invalidate();
        }
        q00Var.f48840a.d(0, (-getMeasuredWidth()) * 0.1f * q00Var.f48845n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (q00Var.M) {
            int themedColor = q00Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27809a7);
            Paint paint2 = this.f48581p0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), q00Var.f48840a.f56881f);
        }
        int themedColor2 = q00Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27973j5);
        if (q00Var.M) {
            i7 = org.telegram.ui.ActionBar.l6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.Hk;
        }
        int f20 = i0.a.f(f18, themedColor2, q00Var.getThemedColor(i7));
        kVar = ((org.telegram.ui.ActionBar.f2) q00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.f2) q00Var).actionBar;
            kVar2.getBackButton().setColorFilter(f20);
        }
        textView.setTextColor(f20);
        paint.setAlpha((int) ((1.0f - f18) * 255.0f));
        if (paint.getAlpha() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        q00Var.s0(z9);
        int i12 = org.telegram.ui.ActionBar.l6.Gk;
        g6Var = ((org.telegram.ui.ActionBar.f2) q00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(i12, g6Var), paint.getColor()));
        if (!q00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f18 <= 0.01f && q00Var.n0()) {
            q4Var = ((org.telegram.ui.ActionBar.f2) q00Var).parentLayout;
            ((ActionBarLayout) q4Var).p(canvas, 255, p02.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        q00 q00Var = this.f48583r0;
        if (!q00Var.z0()) {
            kVar = ((org.telegram.ui.ActionBar.f2) q00Var).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.f2) q00Var).actionBar;
                ImageView backButton = kVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.f48580o0 = true;
                        }
                    }
                    if (this.f48580o0) {
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return dispatchTouchEvent;
                        }
                        this.f48580o0 = false;
                        return dispatchTouchEvent;
                    }
                }
            }
            ah.a aVar = q00Var.D;
            float x10 = aVar.getX();
            FrameLayout frameLayout = (FrameLayout) aVar.f1059e;
            FrameLayout frameLayout2 = (FrameLayout) aVar.d;
            org.telegram.ui.Components.x70 x70Var = (org.telegram.ui.Components.x70) aVar.f1058c;
            float x11 = x70Var.getX() + x10;
            float y10 = x70Var.getY() + aVar.getY();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(x11, y10, x70Var.getMeasuredWidth() + x11, x70Var.getMeasuredHeight() + y10);
            if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.m0) || q00Var.f48842c.I1 || (layout = x70Var.getLayout()) == null) {
                f10 = 1.0f;
            } else {
                CharSequence text = layout.getText();
                f10 = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && q00Var.f48850y < 1.0f) {
                        motionEvent.offsetLocation(-x11, -y10);
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                this.m0 = false;
                            }
                        } else {
                            this.m0 = true;
                        }
                        x70Var.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
            }
            float x12 = frameLayout2.getX() + aVar.getX();
            float y11 = frameLayout2.getY() + aVar.getY();
            boolean isClickable = frameLayout2.isClickable();
            rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f48578l0) && !q00Var.f48842c.I1 && isClickable && q00Var.f48850y < f10) {
                motionEvent.offsetLocation(-x12, -y11);
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.f48578l0 = false;
                    }
                } else {
                    this.f48578l0 = true;
                }
                frameLayout2.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x13 = frameLayout.getX() + aVar.getX();
            float y12 = frameLayout.getY() + aVar.getY();
            rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f48579n0) && !q00Var.f48842c.I1 && q00Var.f48850y < f10) {
                motionEvent.offsetLocation(-x13, -y12);
                if (motionEvent.getAction() == 0) {
                    this.f48579n0 = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f48579n0 = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                if (this.f48579n0) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        q00 q00Var = this.f48583r0;
        if (view == q00Var.r0() && !q00Var.z0()) {
            canvas.save();
            canvas.clipRect(0, q00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p00.onMeasure(int, int):void");
    }
}
