package org.telegram.ui;

import android.content.Context;
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
public class n20 extends org.telegram.ui.Components.lc0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final o20 J0;

    public n20(o20 o20Var, Context context) {
        super(context);
        this.J0 = o20Var;
        new Paint(1);
        this.H0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.I0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.J0.fragmentView;
        this.I0 = Boolean.valueOf(z10);
        AndroidUtilities.setLightStatusBar(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.k kVar7;
        o20 o20Var = this.J0;
        Paint paint = o20Var.K;
        l20 l20Var = o20Var.f35667y;
        int i11 = 0;
        if (!o20Var.f35661f) {
            if (o20Var.h) {
                float f10 = o20Var.f35662n + 0.016f;
                o20Var.f35662n = f10;
                if (f10 > 3.0f) {
                    o20Var.h = false;
                }
            } else {
                float f11 = o20Var.f35662n - 0.016f;
                o20Var.f35662n = f11;
                if (f11 < 1.0f) {
                    o20Var.h = true;
                }
            }
        }
        if (o20Var.f35660c.getLayoutManager() != null) {
            view = o20Var.f35660c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view != null) {
            i11 = view.getBottom();
        }
        o20Var.f35663r = i11;
        kVar = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((o20Var.f35663r - dp) / (o20Var.J - dp));
        o20Var.v = f12;
        float f13 = 0.0f;
        o20Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (o20Var.f35663r < dp2) {
            o20Var.f35663r = dp2;
        }
        float f14 = o20Var.f35666x;
        o20Var.f35666x = 0.0f;
        if (o20Var.f35663r < AndroidUtilities.dp(30.0f) + dp2) {
            o20Var.f35666x = ((AndroidUtilities.dp(30.0f) + dp2) - o20Var.f35663r) / AndroidUtilities.dp(30.0f);
        }
        if (o20Var.H) {
            o20Var.f35666x = 1.0f;
            o20Var.v = 1.0f;
        }
        if (f14 != o20Var.f35666x) {
            o20Var.f35660c.invalidate();
        }
        int i12 = o20Var.f35663r;
        kVar3 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = l20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) l20Var.d;
        TextView textView = (TextView) l20Var.f34846b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i12 - ((measuredHeight2 + measuredHeight) - o20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - o20Var.I) - textView.getMeasuredHeight()) / 2.0f) + o20Var.I) - l20Var.getTop()) - textView.getTop(), dp3);
        l20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f15 = o20Var.v;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f15, 0.4f, 0.6f);
        if (f15 > 0.5f) {
            f7 = (f15 - 0.5f) / 0.5f;
        } else {
            f7 = 0.0f;
        }
        float f16 = 1.0f - f7;
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f16);
        ((FrameLayout) l20Var.e).setAlpha(f16);
        ((org.telegram.ui.Components.d90) l20Var.f34847c).setAlpha(f16);
        o20Var.e.setAlpha(1.0f - o20Var.v);
        o20Var.e.setTranslationY((frameLayout.getY() + l20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f17 = o20Var.v;
        if (f17 > 0.3f) {
            f13 = (f17 - 0.3f) / 0.7f;
        }
        textView.setTranslationX((1.0f - org.telegram.ui.Components.rr.h.getInterpolation(1.0f - f13)) * dp4);
        if (!o20Var.f35661f) {
            invalidate();
        }
        o20Var.f35658a.d(0, (-getMeasuredWidth()) * 0.1f * o20Var.f35662n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (o20Var.M) {
            int themedColor = o20Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), o20Var.f35658a.f42507f);
        }
        int themedColor2 = o20Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18895j5);
        if (o20Var.M) {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.Tj;
        }
        int d = i0.a.d(f16, themedColor2, o20Var.getThemedColor(i10));
        kVar5 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f16) * 255.0f));
        int i13 = org.telegram.ui.ActionBar.h6.Sj;
        d6Var = ((org.telegram.ui.ActionBar.n2) o20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(i13, d6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f16 <= 0.01f && o20Var.q0()) {
            c5Var = ((org.telegram.ui.ActionBar.n2) o20Var).parentLayout;
            kVar7 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
            ((ActionBarLayout) c5Var).p(canvas, 255, kVar7.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        o20 o20Var = this.J0;
        kVar = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (hh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.G0 = true;
                    }
                }
                if (this.G0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.G0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        l20 l20Var = o20Var.f35667y;
        float x10 = l20Var.getX();
        FrameLayout frameLayout = (FrameLayout) l20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) l20Var.d;
        org.telegram.ui.Components.d90 d90Var = (org.telegram.ui.Components.d90) l20Var.f34847c;
        float x11 = d90Var.getX() + x10;
        float y3 = d90Var.getY() + l20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, d90Var.getMeasuredWidth() + x11, d90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || o20Var.f35660c.K1 || (layout = d90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && o20Var.f35666x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.E0 = false;
                        }
                    } else {
                        this.E0 = true;
                    }
                    d90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + l20Var.getX();
        float y10 = frameLayout2.getY() + l20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !o20Var.f35660c.K1 && isClickable && o20Var.f35666x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.D0 = false;
                }
            } else {
                this.D0 = true;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + l20Var.getX();
        float y11 = frameLayout.getY() + l20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !o20Var.f35660c.K1 && o20Var.f35666x < f7) {
            motionEvent.offsetLocation(-x13, -y11);
            if (motionEvent.getAction() == 0) {
                this.F0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.F0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.F0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        o20 o20Var = this.J0;
        if (view == o20Var.f35660c) {
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n20.onMeasure(int, int):void");
    }
}
