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
public final class q00 extends org.telegram.ui.Components.za0 {
    public boolean f48894l0;
    public boolean m0;
    public boolean f48895n0;
    public boolean f48896o0;
    public final Paint f48897p0;
    public Boolean f48898q0;
    public final r00 f48899r0;

    public q00(r00 r00Var, Activity activity) {
        super(activity);
        this.f48899r0 = r00Var;
        new Paint(1);
        this.f48897p0 = new Paint(1);
    }

    private void setLightStatusBar(int i7) {
        boolean z9;
        if (org.telegram.messenger.g0.B(i7) >= 0.721f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f48898q0;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        View view = this.f48899r0.fragmentView;
        this.f48898q0 = Boolean.valueOf(z9);
        org.telegram.messenger.g0.r3(view, z9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int round;
        float f10;
        float f11;
        int i7;
        org.telegram.ui.ActionBar.l lVar;
        boolean z9;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.l lVar2;
        int i10;
        r00 r00Var = this.f48899r0;
        Paint paint = r00Var.K;
        ah.a aVar = r00Var.D;
        if (!r00Var.f49191f) {
            if (r00Var.h) {
                float f12 = r00Var.f49192n + 0.016f;
                r00Var.f49192n = f12;
                if (f12 > 3.0f) {
                    r00Var.h = false;
                }
            } else {
                float f13 = r00Var.f49192n - 0.016f;
                r00Var.f49192n = f13;
                if (f13 < 1.0f) {
                    r00Var.h = true;
                }
            }
        }
        if (r00Var.f49189c.getLayoutManager() != null) {
            view = r00Var.f49189c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(r00Var.q0() + view.getBottom());
        }
        r00Var.f49193r = round;
        FrameLayout p02 = r00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f14 = 1.0f - ((r00Var.f49193r - L) / (r00Var.J - L));
        r00Var.f49195w = f14;
        float f15 = 0.0f;
        r00Var.f49195w = Utilities.i(f14, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (r00Var.f49193r < L2) {
            r00Var.f49193r = L2;
        }
        float f16 = r00Var.f49197y;
        r00Var.f49197y = 0.0f;
        if (r00Var.f49193r < org.telegram.messenger.g0.L(30.0f) + L2) {
            r00Var.f49197y = ((org.telegram.messenger.g0.L(30.0f) + L2) - r00Var.f49193r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (r00Var.H) {
            r00Var.f49197y = 1.0f;
            r00Var.f49195w = 1.0f;
        }
        if (f16 != r00Var.f49197y) {
            r00Var.f49189c.invalidate();
        }
        r00Var.t0(r00Var.f49195w);
        int measuredHeight = p02.getMeasuredHeight();
        int i11 = r00Var.f49193r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) aVar.f1058c;
        FrameLayout frameLayout = (FrameLayout) aVar.f1059e;
        TextView textView = (TextView) aVar.f1057b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        int L3 = org.telegram.messenger.g0.L(16.0f);
        float max = Math.max((((((measuredHeight - r00Var.I) - textView.getMeasuredHeight()) / 2.0f) + r00Var.I) - aVar.getTop()) - textView.getTop(), L3 + (i11 - ((measuredHeight2 + measuredHeight) - r00Var.I)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f17 = r00Var.f49195w;
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
        if (r00Var.z0()) {
            if (f18 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            w70Var.setVisibility(i10);
        }
        r00Var.f49190e.setAlpha(1.0f - r00Var.f49195w);
        r00Var.f49190e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L4 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f19 = r00Var.f49195w;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        if (!r00Var.z0()) {
            f15 = (1.0f - org.telegram.ui.Components.wq.h.getInterpolation(1.0f - f11)) * L4;
        }
        textView.setTranslationX(f15);
        if (!r00Var.f49191f) {
            invalidate();
        }
        r00Var.f49187a.d(0, (-getMeasuredWidth()) * 0.1f * r00Var.f49192n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (r00Var.M) {
            int themedColor = r00Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27834a7);
            Paint paint2 = this.f48897p0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), r00Var.f49187a.f56877f);
        }
        int themedColor2 = r00Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27998j5);
        if (r00Var.M) {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.Hk;
        }
        int f20 = i0.a.f(f18, themedColor2, r00Var.getThemedColor(i7));
        lVar = ((org.telegram.ui.ActionBar.f2) r00Var).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.f2) r00Var).actionBar;
            lVar2.getBackButton().setColorFilter(f20);
        }
        textView.setTextColor(f20);
        paint.setAlpha((int) ((1.0f - f18) * 255.0f));
        if (paint.getAlpha() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        r00Var.s0(z9);
        int i12 = org.telegram.ui.ActionBar.m6.Gk;
        h6Var = ((org.telegram.ui.ActionBar.f2) r00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), paint.getColor()));
        if (!r00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f18 <= 0.01f && r00Var.n0()) {
            r4Var = ((org.telegram.ui.ActionBar.f2) r00Var).parentLayout;
            ((ActionBarLayout) r4Var).p(canvas, 255, p02.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.l lVar2;
        r00 r00Var = this.f48899r0;
        if (!r00Var.z0()) {
            lVar = ((org.telegram.ui.ActionBar.f2) r00Var).actionBar;
            if (lVar != null) {
                lVar2 = ((org.telegram.ui.ActionBar.f2) r00Var).actionBar;
                ImageView backButton = lVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.f48896o0 = true;
                        }
                    }
                    if (this.f48896o0) {
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return dispatchTouchEvent;
                        }
                        this.f48896o0 = false;
                        return dispatchTouchEvent;
                    }
                }
            }
            ah.a aVar = r00Var.D;
            float x10 = aVar.getX();
            FrameLayout frameLayout = (FrameLayout) aVar.f1059e;
            FrameLayout frameLayout2 = (FrameLayout) aVar.d;
            org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) aVar.f1058c;
            float x11 = w70Var.getX() + x10;
            float y10 = w70Var.getY() + aVar.getY();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(x11, y10, w70Var.getMeasuredWidth() + x11, w70Var.getMeasuredHeight() + y10);
            if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.m0) || r00Var.f49189c.I1 || (layout = w70Var.getLayout()) == null) {
                f10 = 1.0f;
            } else {
                CharSequence text = layout.getText();
                f10 = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && r00Var.f49197y < 1.0f) {
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
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f48894l0) && !r00Var.f49189c.I1 && isClickable && r00Var.f49197y < f10) {
                motionEvent.offsetLocation(-x12, -y11);
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.f48894l0 = false;
                    }
                } else {
                    this.f48894l0 = true;
                }
                frameLayout2.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x13 = frameLayout.getX() + aVar.getX();
            float y12 = frameLayout.getY() + aVar.getY();
            rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f48895n0) && !r00Var.f49189c.I1 && r00Var.f49197y < f10) {
                motionEvent.offsetLocation(-x13, -y12);
                if (motionEvent.getAction() == 0) {
                    this.f48895n0 = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f48895n0 = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                if (this.f48895n0) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        r00 r00Var = this.f48899r0;
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
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q00.onMeasure(int, int):void");
    }
}
