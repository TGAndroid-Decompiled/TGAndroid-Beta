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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class c20 extends org.telegram.ui.Components.ed0 {
    public boolean f38224r0;
    public boolean f38225s0;
    public boolean f38226t0;
    public boolean f38227u0;
    public final Paint f38228v0;
    public Boolean f38229w0;
    public final d20 f38230x0;

    public c20(d20 d20Var, Activity activity) {
        super(activity);
        this.f38230x0 = d20Var;
        new Paint(1);
        this.f38228v0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f38229w0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.f38230x0.fragmentView;
        this.f38229w0 = Boolean.valueOf(z10);
        AndroidUtilities.setLightStatusBar(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int round;
        float f7;
        float f10;
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        d20 d20Var = this.f38230x0;
        Paint paint = d20Var.K;
        bi.sc scVar = d20Var.f38720y;
        if (!d20Var.f38714f) {
            if (d20Var.h) {
                float f11 = d20Var.f38715n + 0.016f;
                d20Var.f38715n = f11;
                if (f11 > 3.0f) {
                    d20Var.h = false;
                }
            } else {
                float f12 = d20Var.f38715n - 0.016f;
                d20Var.f38715n = f12;
                if (f12 < 1.0f) {
                    d20Var.h = true;
                }
            }
        }
        if (d20Var.f38713c.getLayoutManager() != null) {
            view = d20Var.f38713c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(d20Var.m0() + view.getBottom());
        }
        d20Var.f38716r = round;
        FrameLayout l02 = d20Var.l0();
        int dp = AndroidUtilities.dp(16.0f) + l02.getBottom();
        float f13 = 1.0f - ((d20Var.f38716r - dp) / (d20Var.J - dp));
        d20Var.v = f13;
        float f14 = 0.0f;
        d20Var.v = Utilities.clamp(f13, 1.0f, 0.0f);
        int dp2 = AndroidUtilities.dp(16.0f) + l02.getBottom();
        if (d20Var.f38716r < dp2) {
            d20Var.f38716r = dp2;
        }
        float f15 = d20Var.f38719x;
        d20Var.f38719x = 0.0f;
        if (d20Var.f38716r < AndroidUtilities.dp(30.0f) + dp2) {
            d20Var.f38719x = ((AndroidUtilities.dp(30.0f) + dp2) - d20Var.f38716r) / AndroidUtilities.dp(30.0f);
        }
        if (d20Var.H) {
            d20Var.f38719x = 1.0f;
            d20Var.v = 1.0f;
        }
        if (f15 != d20Var.f38719x) {
            d20Var.f38713c.invalidate();
        }
        d20Var.p0(d20Var.v);
        int measuredHeight = l02.getMeasuredHeight();
        int i12 = d20Var.f38716r;
        int measuredHeight2 = scVar.getMeasuredHeight();
        org.telegram.ui.Components.z90 z90Var = (org.telegram.ui.Components.z90) scVar.f5424c;
        FrameLayout frameLayout = (FrameLayout) scVar.e;
        TextView textView = (TextView) scVar.f5423b;
        FrameLayout frameLayout2 = (FrameLayout) scVar.d;
        int dp3 = AndroidUtilities.dp(16.0f);
        float max = Math.max((((((measuredHeight - d20Var.I) - textView.getMeasuredHeight()) / 2.0f) + d20Var.I) - scVar.getTop()) - textView.getTop(), dp3 + (i12 - ((measuredHeight2 + measuredHeight) - d20Var.I)));
        scVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f16 = d20Var.v;
        float z11 = c3.h0.z(1.0f, f16, 0.4f, 0.6f);
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
        z90Var.setAlpha(f17);
        if (d20Var.v0()) {
            if (f17 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            frameLayout2.setVisibility(i11);
            frameLayout.setVisibility(i11);
            z90Var.setVisibility(i11);
        }
        d20Var.e.setAlpha(1.0f - d20Var.v);
        d20Var.e.setTranslationY((frameLayout2.getY() + scVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f18 = d20Var.v;
        if (f18 > 0.3f) {
            f10 = (f18 - 0.3f) / 0.7f;
        } else {
            f10 = 0.0f;
        }
        if (!d20Var.v0()) {
            f14 = (1.0f - org.telegram.ui.Components.ds.h.getInterpolation(1.0f - f10)) * dp4;
        }
        textView.setTranslationX(f14);
        if (!d20Var.f38714f) {
            invalidate();
        }
        d20Var.f38711a.d(0, (-getMeasuredWidth()) * 0.1f * d20Var.f38715n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (d20Var.M) {
            int themedColor = d20Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7);
            Paint paint2 = this.f38228v0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), d20Var.f38711a.f48794f);
        }
        int themedColor2 = d20Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23462j5);
        if (d20Var.M) {
            i10 = org.telegram.ui.ActionBar.y6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.Tj;
        }
        int f19 = i0.a.f(f17, themedColor2, d20Var.getThemedColor(i10));
        kVar = ((org.telegram.ui.ActionBar.r2) d20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.r2) d20Var).actionBar;
            kVar2.getBackButton().setColorFilter(f19);
        }
        textView.setTextColor(f19);
        paint.setAlpha((int) ((1.0f - f17) * 255.0f));
        if (paint.getAlpha() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d20Var.o0(z10);
        int i13 = org.telegram.ui.ActionBar.y6.Sj;
        u6Var = ((org.telegram.ui.ActionBar.r2) d20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), paint.getColor()));
        if (!d20Var.v0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), l02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f17 <= 0.01f && d20Var.j0()) {
            j5Var = ((org.telegram.ui.ActionBar.r2) d20Var).parentLayout;
            ((ActionBarLayout) j5Var).p(canvas, 255, l02.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        d20 d20Var = this.f38230x0;
        if (!d20Var.v0()) {
            kVar = ((org.telegram.ui.ActionBar.r2) d20Var).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.r2) d20Var).actionBar;
                ImageView backButton = kVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.f38227u0 = true;
                        }
                    }
                    if (this.f38227u0) {
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return dispatchTouchEvent;
                        }
                        this.f38227u0 = false;
                        return dispatchTouchEvent;
                    }
                }
            }
            bi.sc scVar = d20Var.f38720y;
            float x9 = scVar.getX();
            FrameLayout frameLayout = (FrameLayout) scVar.e;
            FrameLayout frameLayout2 = (FrameLayout) scVar.d;
            org.telegram.ui.Components.z90 z90Var = (org.telegram.ui.Components.z90) scVar.f5424c;
            float x10 = z90Var.getX() + x9;
            float y3 = z90Var.getY() + scVar.getY();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(x10, y3, z90Var.getMeasuredWidth() + x10, z90Var.getMeasuredHeight() + y3);
            if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.f38225s0) || d20Var.f38713c.I1 || (layout = z90Var.getLayout()) == null) {
                f7 = 1.0f;
            } else {
                CharSequence text = layout.getText();
                f7 = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && d20Var.f38719x < 1.0f) {
                        motionEvent.offsetLocation(-x10, -y3);
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                this.f38225s0 = false;
                            }
                        } else {
                            this.f38225s0 = true;
                        }
                        z90Var.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
            }
            float x11 = frameLayout2.getX() + scVar.getX();
            float y10 = frameLayout2.getY() + scVar.getY();
            boolean isClickable = frameLayout2.isClickable();
            rectF2.set(x11, y10, frameLayout2.getMeasuredWidth() + x11, frameLayout2.getMeasuredHeight() + y10);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f38224r0) && !d20Var.f38713c.I1 && isClickable && d20Var.f38719x < f7) {
                motionEvent.offsetLocation(-x11, -y10);
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.f38224r0 = false;
                    }
                } else {
                    this.f38224r0 = true;
                }
                frameLayout2.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x12 = frameLayout.getX() + scVar.getX();
            float y11 = frameLayout.getY() + scVar.getY();
            rectF2.set(x12, y11, frameLayout.getMeasuredWidth() + x12, frameLayout.getMeasuredHeight() + y11);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f38226t0) && !d20Var.f38713c.I1 && d20Var.f38719x < f7) {
                motionEvent.offsetLocation(-x12, -y11);
                if (motionEvent.getAction() == 0) {
                    this.f38226t0 = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f38226t0 = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                if (this.f38226t0) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        d20 d20Var = this.f38230x0;
        if (view == d20Var.n0() && !d20Var.v0()) {
            canvas.save();
            canvas.clipRect(0, d20Var.l0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c20.onMeasure(int, int):void");
    }
}
