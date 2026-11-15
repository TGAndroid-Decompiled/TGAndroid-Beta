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
public final class o00 extends org.telegram.ui.Components.ab0 {
    public boolean m0;
    public boolean f49737n0;
    public boolean f49738o0;
    public boolean f49739p0;
    public final Paint f49740q0;
    public Boolean f49741r0;
    public final p00 f49742s0;

    public o00(p00 p00Var, Activity activity) {
        super(activity);
        this.f49742s0 = p00Var;
        new Paint(1);
        this.f49740q0 = new Paint(1);
    }

    private void setLightStatusBar(int i7) {
        boolean z10;
        if (org.telegram.messenger.g0.B(i7) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f49741r0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.f49742s0.fragmentView;
        this.f49741r0 = Boolean.valueOf(z10);
        org.telegram.messenger.g0.r3(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int round;
        float f10;
        float f11;
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        p00 p00Var = this.f49742s0;
        Paint paint = p00Var.L;
        ah.a aVar = p00Var.E;
        if (!p00Var.f50077f) {
            if (p00Var.h) {
                float f12 = p00Var.f50078n + 0.016f;
                p00Var.f50078n = f12;
                if (f12 > 3.0f) {
                    p00Var.h = false;
                }
            } else {
                float f13 = p00Var.f50078n - 0.016f;
                p00Var.f50078n = f13;
                if (f13 < 1.0f) {
                    p00Var.h = true;
                }
            }
        }
        if (p00Var.f50075c.getLayoutManager() != null) {
            view = p00Var.f50075c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(p00Var.q0() + view.getBottom());
        }
        p00Var.f50079r = round;
        FrameLayout p02 = p00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f14 = 1.0f - ((p00Var.f50079r - L) / (p00Var.K - L));
        p00Var.f50081w = f14;
        float f15 = 0.0f;
        p00Var.f50081w = Utilities.i(f14, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (p00Var.f50079r < L2) {
            p00Var.f50079r = L2;
        }
        float f16 = p00Var.f50083y;
        p00Var.f50083y = 0.0f;
        if (p00Var.f50079r < org.telegram.messenger.g0.L(30.0f) + L2) {
            p00Var.f50083y = ((org.telegram.messenger.g0.L(30.0f) + L2) - p00Var.f50079r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (p00Var.I) {
            p00Var.f50083y = 1.0f;
            p00Var.f50081w = 1.0f;
        }
        if (f16 != p00Var.f50083y) {
            p00Var.f50075c.invalidate();
        }
        p00Var.t0(p00Var.f50081w);
        int measuredHeight = p02.getMeasuredHeight();
        int i11 = p00Var.f50079r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) aVar.f1056c;
        FrameLayout frameLayout = (FrameLayout) aVar.f1057e;
        TextView textView = (TextView) aVar.f1055b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        int L3 = org.telegram.messenger.g0.L(16.0f);
        float max = Math.max((((((measuredHeight - p00Var.J) - textView.getMeasuredHeight()) / 2.0f) + p00Var.J) - aVar.getTop()) - textView.getTop(), L3 + (i11 - ((measuredHeight2 + measuredHeight) - p00Var.J)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f17 = p00Var.f50081w;
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
        z70Var.setAlpha(f18);
        if (p00Var.z0()) {
            if (f18 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            z70Var.setVisibility(i10);
        }
        p00Var.f50076e.setAlpha(1.0f - p00Var.f50081w);
        p00Var.f50076e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L4 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f19 = p00Var.f50081w;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        if (!p00Var.z0()) {
            f15 = (1.0f - org.telegram.ui.Components.er.h.getInterpolation(1.0f - f11)) * L4;
        }
        textView.setTranslationX(f15);
        if (!p00Var.f50077f) {
            invalidate();
        }
        p00Var.f50073a.d(0, (-getMeasuredWidth()) * 0.1f * p00Var.f50078n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (p00Var.N) {
            int themedColor = p00Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7);
            Paint paint2 = this.f49740q0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), p00Var.f50073a.f58392f);
        }
        int themedColor2 = p00Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28957j5);
        if (p00Var.N) {
            i7 = org.telegram.ui.ActionBar.j6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.Kk;
        }
        int f20 = i0.a.f(f18, themedColor2, p00Var.getThemedColor(i7));
        kVar = ((org.telegram.ui.ActionBar.e2) p00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.e2) p00Var).actionBar;
            kVar2.getBackButton().setColorFilter(f20);
        }
        textView.setTextColor(f20);
        paint.setAlpha((int) ((1.0f - f18) * 255.0f));
        if (paint.getAlpha() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p00Var.s0(z10);
        int i12 = org.telegram.ui.ActionBar.j6.Jk;
        e6Var = ((org.telegram.ui.ActionBar.e2) p00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(i12, e6Var), paint.getColor()));
        if (!p00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f18 <= 0.01f && p00Var.n0()) {
            o4Var = ((org.telegram.ui.ActionBar.e2) p00Var).parentLayout;
            ((ActionBarLayout) o4Var).p(canvas, 255, p02.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        p00 p00Var = this.f49742s0;
        if (!p00Var.z0()) {
            kVar = ((org.telegram.ui.ActionBar.e2) p00Var).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.e2) p00Var).actionBar;
                ImageView backButton = kVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.f49739p0 = true;
                        }
                    }
                    if (this.f49739p0) {
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return dispatchTouchEvent;
                        }
                        this.f49739p0 = false;
                        return dispatchTouchEvent;
                    }
                }
            }
            ah.a aVar = p00Var.E;
            float x10 = aVar.getX();
            FrameLayout frameLayout = (FrameLayout) aVar.f1057e;
            FrameLayout frameLayout2 = (FrameLayout) aVar.d;
            org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) aVar.f1056c;
            float x11 = z70Var.getX() + x10;
            float y10 = z70Var.getY() + aVar.getY();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(x11, y10, z70Var.getMeasuredWidth() + x11, z70Var.getMeasuredHeight() + y10);
            if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.f49737n0) || p00Var.f50075c.J1 || (layout = z70Var.getLayout()) == null) {
                f10 = 1.0f;
            } else {
                CharSequence text = layout.getText();
                f10 = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && p00Var.f50083y < 1.0f) {
                        motionEvent.offsetLocation(-x11, -y10);
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                this.f49737n0 = false;
                            }
                        } else {
                            this.f49737n0 = true;
                        }
                        z70Var.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
            }
            float x12 = frameLayout2.getX() + aVar.getX();
            float y11 = frameLayout2.getY() + aVar.getY();
            boolean isClickable = frameLayout2.isClickable();
            rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) && !p00Var.f50075c.J1 && isClickable && p00Var.f50083y < f10) {
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
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f49738o0) && !p00Var.f50075c.J1 && p00Var.f50083y < f10) {
                motionEvent.offsetLocation(-x13, -y12);
                if (motionEvent.getAction() == 0) {
                    this.f49738o0 = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f49738o0 = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                if (this.f49738o0) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        p00 p00Var = this.f49742s0;
        if (view == p00Var.r0() && !p00Var.z0()) {
            canvas.save();
            canvas.clipRect(0, p00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o00.onMeasure(int, int):void");
    }
}
