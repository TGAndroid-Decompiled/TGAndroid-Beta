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
public final class k00 extends org.telegram.ui.Components.ua0 {
    public boolean m0;
    public boolean f46724n0;
    public boolean f46725o0;
    public boolean f46726p0;
    public final Paint f46727q0;
    public Boolean f46728r0;
    public final l00 f46729s0;

    public k00(l00 l00Var, Activity activity) {
        super(activity);
        this.f46729s0 = l00Var;
        new Paint(1);
        this.f46727q0 = new Paint(1);
    }

    private void setLightStatusBar(int i3) {
        boolean z10;
        if (org.telegram.messenger.g0.B(i3) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f46728r0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.f46729s0.fragmentView;
        this.f46728r0 = Boolean.valueOf(z10);
        org.telegram.messenger.g0.r3(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int round;
        float f10;
        float f11;
        int i3;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        l00 l00Var = this.f46729s0;
        Paint paint = l00Var.L;
        bh.a aVar = l00Var.E;
        if (!l00Var.f47065f) {
            if (l00Var.h) {
                float f12 = l00Var.f47066n + 0.016f;
                l00Var.f47066n = f12;
                if (f12 > 3.0f) {
                    l00Var.h = false;
                }
            } else {
                float f13 = l00Var.f47066n - 0.016f;
                l00Var.f47066n = f13;
                if (f13 < 1.0f) {
                    l00Var.h = true;
                }
            }
        }
        if (l00Var.f47063c.getLayoutManager() != null) {
            view = l00Var.f47063c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(l00Var.q0() + view.getBottom());
        }
        l00Var.f47067r = round;
        FrameLayout p02 = l00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f14 = 1.0f - ((l00Var.f47067r - L) / (l00Var.K - L));
        l00Var.f47069w = f14;
        float f15 = 0.0f;
        l00Var.f47069w = Utilities.i(f14, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (l00Var.f47067r < L2) {
            l00Var.f47067r = L2;
        }
        float f16 = l00Var.f47071y;
        l00Var.f47071y = 0.0f;
        if (l00Var.f47067r < org.telegram.messenger.g0.L(30.0f) + L2) {
            l00Var.f47071y = ((org.telegram.messenger.g0.L(30.0f) + L2) - l00Var.f47067r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (l00Var.I) {
            l00Var.f47071y = 1.0f;
            l00Var.f47069w = 1.0f;
        }
        if (f16 != l00Var.f47071y) {
            l00Var.f47063c.invalidate();
        }
        l00Var.t0(l00Var.f47069w);
        int measuredHeight = p02.getMeasuredHeight();
        int i11 = l00Var.f47067r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.s70 s70Var = (org.telegram.ui.Components.s70) aVar.f3300c;
        FrameLayout frameLayout = (FrameLayout) aVar.f3301e;
        TextView textView = (TextView) aVar.f3299b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        int L3 = org.telegram.messenger.g0.L(16.0f);
        float max = Math.max((((((measuredHeight - l00Var.J) - textView.getMeasuredHeight()) / 2.0f) + l00Var.J) - aVar.getTop()) - textView.getTop(), L3 + (i11 - ((measuredHeight2 + measuredHeight) - l00Var.J)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f17 = l00Var.f47069w;
        float y9 = com.google.android.recaptcha.internal.a.y(1.0f, f17, 0.4f, 0.6f);
        if (f17 > 0.5f) {
            f10 = (f17 - 0.5f) / 0.5f;
        } else {
            f10 = 0.0f;
        }
        float f18 = 1.0f - f10;
        frameLayout2.setScaleX(y9);
        frameLayout2.setScaleY(y9);
        frameLayout2.setAlpha(f18);
        frameLayout.setAlpha(f18);
        s70Var.setAlpha(f18);
        if (l00Var.z0()) {
            if (f18 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            s70Var.setVisibility(i10);
        }
        l00Var.f47064e.setAlpha(1.0f - l00Var.f47069w);
        l00Var.f47064e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L4 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f19 = l00Var.f47069w;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        if (!l00Var.z0()) {
            f15 = (1.0f - org.telegram.ui.Components.xq.h.getInterpolation(1.0f - f11)) * L4;
        }
        textView.setTranslationX(f15);
        if (!l00Var.f47065f) {
            invalidate();
        }
        l00Var.f47061a.d(0, (-getMeasuredWidth()) * 0.1f * l00Var.f47066n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (l00Var.N) {
            int themedColor = l00Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7);
            Paint paint2 = this.f46727q0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), l00Var.f47061a.f56911f);
        }
        int themedColor2 = l00Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27988j5);
        if (l00Var.N) {
            i3 = org.telegram.ui.ActionBar.k6.G6;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.Hk;
        }
        int f20 = i0.a.f(f18, themedColor2, l00Var.getThemedColor(i3));
        kVar = ((org.telegram.ui.ActionBar.d2) l00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.d2) l00Var).actionBar;
            kVar2.getBackButton().setColorFilter(f20);
        }
        textView.setTextColor(f20);
        paint.setAlpha((int) ((1.0f - f18) * 255.0f));
        if (paint.getAlpha() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        l00Var.s0(z10);
        int i12 = org.telegram.ui.ActionBar.k6.Gk;
        e6Var = ((org.telegram.ui.ActionBar.d2) l00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), paint.getColor()));
        if (!l00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f18 <= 0.01f && l00Var.n0()) {
            q4Var = ((org.telegram.ui.ActionBar.d2) l00Var).parentLayout;
            ((ActionBarLayout) q4Var).p(canvas, 255, p02.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        l00 l00Var = this.f46729s0;
        if (!l00Var.z0()) {
            kVar = ((org.telegram.ui.ActionBar.d2) l00Var).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.d2) l00Var).actionBar;
                ImageView backButton = kVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        if (kh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.f46726p0 = true;
                        }
                    }
                    if (this.f46726p0) {
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return dispatchTouchEvent;
                        }
                        this.f46726p0 = false;
                        return dispatchTouchEvent;
                    }
                }
            }
            bh.a aVar = l00Var.E;
            float x10 = aVar.getX();
            FrameLayout frameLayout = (FrameLayout) aVar.f3301e;
            FrameLayout frameLayout2 = (FrameLayout) aVar.d;
            org.telegram.ui.Components.s70 s70Var = (org.telegram.ui.Components.s70) aVar.f3300c;
            float x11 = s70Var.getX() + x10;
            float y9 = s70Var.getY() + aVar.getY();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(x11, y9, s70Var.getMeasuredWidth() + x11, s70Var.getMeasuredHeight() + y9);
            if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.f46724n0) || l00Var.f47063c.J1 || (layout = s70Var.getLayout()) == null) {
                f10 = 1.0f;
            } else {
                CharSequence text = layout.getText();
                f10 = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && l00Var.f47071y < 1.0f) {
                        motionEvent.offsetLocation(-x11, -y9);
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                this.f46724n0 = false;
                            }
                        } else {
                            this.f46724n0 = true;
                        }
                        s70Var.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
            }
            float x12 = frameLayout2.getX() + aVar.getX();
            float y10 = frameLayout2.getY() + aVar.getY();
            boolean isClickable = frameLayout2.isClickable();
            rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) && !l00Var.f47063c.J1 && isClickable && l00Var.f47071y < f10) {
                motionEvent.offsetLocation(-x12, -y10);
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
            float y11 = frameLayout.getY() + aVar.getY();
            rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f46725o0) && !l00Var.f47063c.J1 && l00Var.f47071y < f10) {
                motionEvent.offsetLocation(-x13, -y11);
                if (motionEvent.getAction() == 0) {
                    this.f46725o0 = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f46725o0 = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                if (this.f46725o0) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        l00 l00Var = this.f46729s0;
        if (view == l00Var.r0() && !l00Var.z0()) {
            canvas.save();
            canvas.clipRect(0, l00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k00.onMeasure(int, int):void");
    }
}
