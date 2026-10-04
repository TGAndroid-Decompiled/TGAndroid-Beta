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
public final class q20 extends org.telegram.ui.Components.yc0 {
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public final Paint G0;
    public Boolean H0;
    public final r20 I0;

    public q20(r20 r20Var, Activity activity) {
        super(activity);
        this.I0 = r20Var;
        new Paint(1);
        this.G0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.H0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.I0.fragmentView;
        this.H0 = Boolean.valueOf(z10);
        AndroidUtilities.setLightStatusBar(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int round;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        float f7;
        float f10;
        int i10;
        org.telegram.ui.ActionBar.k kVar5;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        int i11;
        r20 r20Var = this.I0;
        Paint paint = r20Var.K;
        o20 o20Var = r20Var.f39892y;
        if (!r20Var.f39886f) {
            if (r20Var.h) {
                float f11 = r20Var.f39887n + 0.016f;
                r20Var.f39887n = f11;
                if (f11 > 3.0f) {
                    r20Var.h = false;
                }
            } else {
                float f12 = r20Var.f39887n - 0.016f;
                r20Var.f39887n = f12;
                if (f12 < 1.0f) {
                    r20Var.h = true;
                }
            }
        }
        if (r20Var.f39884c.getLayoutManager() != null) {
            view = r20Var.f39884c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            round = 0;
        } else {
            round = Math.round(r20Var.t0() + view.getBottom());
        }
        r20Var.f39888r = round;
        kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f13 = 1.0f - ((r20Var.f39888r - dp) / (r20Var.J - dp));
        r20Var.v = f13;
        float f14 = 0.0f;
        r20Var.v = Utilities.clamp(f13, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (r20Var.f39888r < dp2) {
            r20Var.f39888r = dp2;
        }
        float f15 = r20Var.f39891x;
        r20Var.f39891x = 0.0f;
        if (r20Var.f39888r < AndroidUtilities.dp(30.0f) + dp2) {
            r20Var.f39891x = ((AndroidUtilities.dp(30.0f) + dp2) - r20Var.f39888r) / AndroidUtilities.dp(30.0f);
        }
        if (r20Var.H) {
            r20Var.f39891x = 1.0f;
            r20Var.v = 1.0f;
        }
        if (f15 != r20Var.f39891x) {
            r20Var.f39884c.invalidate();
        }
        int i12 = r20Var.f39888r;
        kVar3 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = o20Var.getMeasuredHeight();
        org.telegram.ui.Components.q90 q90Var = (org.telegram.ui.Components.q90) o20Var.f39092c;
        FrameLayout frameLayout = (FrameLayout) o20Var.f39093e;
        TextView textView = (TextView) o20Var.f39091b;
        FrameLayout frameLayout2 = (FrameLayout) o20Var.d;
        float dp3 = AndroidUtilities.dp(16.0f) + (i12 - ((measuredHeight2 + measuredHeight) - r20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - r20Var.I) - textView.getMeasuredHeight()) / 2.0f) + r20Var.I) - o20Var.getTop()) - textView.getTop(), dp3);
        o20Var.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f16 = r20Var.v;
        float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f16, 0.4f, 0.6f);
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
        q90Var.setAlpha(f17);
        if (r20Var.B0()) {
            if (f17 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            frameLayout2.setVisibility(i11);
            frameLayout.setVisibility(i11);
            q90Var.setVisibility(i11);
        }
        r20Var.f39885e.setAlpha(1.0f - r20Var.v);
        r20Var.f39885e.setTranslationY((frameLayout2.getY() + o20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f18 = r20Var.v;
        if (f18 > 0.3f) {
            f10 = (f18 - 0.3f) / 0.7f;
        } else {
            f10 = 0.0f;
        }
        if (!r20Var.B0()) {
            f14 = (1.0f - org.telegram.ui.Components.tr.h.getInterpolation(1.0f - f10)) * dp4;
        }
        textView.setTranslationX(f14);
        if (!r20Var.f39886f) {
            invalidate();
        }
        r20Var.f39882a.d(0, (-getMeasuredWidth()) * 0.1f * r20Var.f39887n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (r20Var.M) {
            int themedColor = r20Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20762a7);
            Paint paint2 = this.G0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), r20Var.f39882a.f46038f);
        }
        int themedColor2 = r20Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20926j5);
        if (r20Var.M) {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.Tj;
        }
        int d = i0.a.d(f17, themedColor2, r20Var.getThemedColor(i10));
        kVar5 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f17) * 255.0f));
        if (paint.getAlpha() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        r20Var.v0(z10);
        int i13 = org.telegram.ui.ActionBar.i6.Sj;
        d6Var = ((org.telegram.ui.ActionBar.n2) r20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(i13, d6Var), paint.getColor()));
        if (!r20Var.B0()) {
            float measuredWidth = getMeasuredWidth();
            kVar7 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
            canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar7.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f17 <= 0.01f && r20Var.r0()) {
            c5Var = ((org.telegram.ui.ActionBar.n2) r20Var).parentLayout;
            kVar6 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
            ((ActionBarLayout) c5Var).p(canvas, 255, kVar6.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        r20 r20Var = this.I0;
        if (!r20Var.B0()) {
            kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
            if (kVar != null) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                ImageView backButton = kVar2.getBackButton();
                if (backButton != null && backButton.getVisibility() == 0) {
                    if (motionEvent.getAction() == 0) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        if (hh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.F0 = true;
                        }
                    }
                    if (this.F0) {
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return dispatchTouchEvent;
                        }
                        this.F0 = false;
                        return dispatchTouchEvent;
                    }
                }
            }
            o20 o20Var = r20Var.f39892y;
            float x10 = o20Var.getX();
            FrameLayout frameLayout = (FrameLayout) o20Var.f39093e;
            FrameLayout frameLayout2 = (FrameLayout) o20Var.d;
            org.telegram.ui.Components.q90 q90Var = (org.telegram.ui.Components.q90) o20Var.f39092c;
            float x11 = q90Var.getX() + x10;
            float y3 = q90Var.getY() + o20Var.getY();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(x11, y3, q90Var.getMeasuredWidth() + x11, q90Var.getMeasuredHeight() + y3);
            if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.D0) || r20Var.f39884c.K1 || (layout = q90Var.getLayout()) == null) {
                f7 = 1.0f;
            } else {
                CharSequence text = layout.getText();
                f7 = 1.0f;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0 && r20Var.f39891x < 1.0f) {
                        motionEvent.offsetLocation(-x11, -y3);
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                this.D0 = false;
                            }
                        } else {
                            this.D0 = true;
                        }
                        q90Var.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                }
            }
            float x12 = frameLayout2.getX() + o20Var.getX();
            float y10 = frameLayout2.getY() + o20Var.getY();
            boolean isClickable = frameLayout2.isClickable();
            rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.C0) && !r20Var.f39884c.K1 && isClickable && r20Var.f39891x < f7) {
                motionEvent.offsetLocation(-x12, -y10);
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.C0 = false;
                    }
                } else {
                    this.C0 = true;
                }
                frameLayout2.dispatchTouchEvent(motionEvent);
                return true;
            }
            float x13 = frameLayout.getX() + o20Var.getX();
            float y11 = frameLayout.getY() + o20Var.getY();
            rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
            if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.E0) && !r20Var.f39884c.K1 && r20Var.f39891x < f7) {
                motionEvent.offsetLocation(-x13, -y11);
                if (motionEvent.getAction() == 0) {
                    this.E0 = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.E0 = false;
                }
                frameLayout.dispatchTouchEvent(motionEvent);
                if (this.E0) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        r20 r20Var = this.I0;
        if (view == r20Var.u0() && !r20Var.B0()) {
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
            canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q20.onMeasure(int, int):void");
    }
}
