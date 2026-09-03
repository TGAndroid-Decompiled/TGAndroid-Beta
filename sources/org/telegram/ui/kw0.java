package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class kw0 extends FrameLayout {
    public boolean f38436a;
    public boolean f38437b;
    public final Paint f38438c;
    public final PremiumPreviewFragment d;

    public kw0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.f38438c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int bottom;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        org.telegram.ui.ActionBar.k kVar4;
        float f11;
        fg.p2 p2Var;
        float f12;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z4 = premiumPreviewFragment.f34488e0;
        fg.p1 p1Var = premiumPreviewFragment.f34494j0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.f34503r0 != null) {
            premiumPreviewFragment.j0();
        }
        if (!premiumPreviewFragment.W) {
            if (premiumPreviewFragment.X) {
                float f13 = premiumPreviewFragment.Y + 0.016f;
                premiumPreviewFragment.Y = f13;
                if (f13 > 3.0f) {
                    premiumPreviewFragment.X = false;
                }
            } else {
                float f14 = premiumPreviewFragment.Y - 0.016f;
                premiumPreviewFragment.Y = f14;
                if (f14 < 1.0f) {
                    premiumPreviewFragment.X = true;
                }
            }
        }
        if (premiumPreviewFragment.f34480a.getLayoutManager() != null) {
            view = premiumPreviewFragment.f34480a.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            bottom = 0;
        } else {
            bottom = view.getBottom();
        }
        premiumPreviewFragment.Z = bottom;
        kVar = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
        float f15 = 16.0f;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f16 = 1.0f - ((premiumPreviewFragment.Z - dp) / (premiumPreviewFragment.V - dp));
        premiumPreviewFragment.f34485c0 = f16;
        premiumPreviewFragment.f34485c0 = Utilities.clamp(f16, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.Z < dp2) {
            premiumPreviewFragment.Z = dp2;
        }
        float f17 = premiumPreviewFragment.f34498n0;
        premiumPreviewFragment.f34498n0 = 0.0f;
        if (premiumPreviewFragment.Z < AndroidUtilities.dp(30.0f) + dp2) {
            premiumPreviewFragment.f34498n0 = ((AndroidUtilities.dp(30.0f) + dp2) - premiumPreviewFragment.Z) / AndroidUtilities.dp(30.0f);
        }
        if (premiumPreviewFragment.T) {
            premiumPreviewFragment.f34498n0 = 1.0f;
            premiumPreviewFragment.f34485c0 = 1.0f;
        }
        if (f17 != premiumPreviewFragment.f34498n0) {
            premiumPreviewFragment.f34480a.invalidate();
        }
        int i10 = premiumPreviewFragment.Z;
        kVar3 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
        int measuredHeight = i10 - ((premiumPreviewFragment.R.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.U);
        if (premiumPreviewFragment.R.f42224e.getVisibility() == 0) {
            f10 = 24.0f;
        } else {
            f10 = 16.0f;
        }
        int dp3 = AndroidUtilities.dp(f10) + measuredHeight;
        kVar4 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.U) - premiumPreviewFragment.R.f42221a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.U) - premiumPreviewFragment.R.getTop()) - premiumPreviewFragment.R.f42221a.getTop(), AndroidUtilities.dp(24.0f) + dp3);
        float dp4 = ((-max) / 4.0f) + AndroidUtilities.dp(16.0f);
        premiumPreviewFragment.R.setTranslationY(max);
        rw0 rw0Var = premiumPreviewFragment.R.d;
        if (premiumPreviewFragment.f34486d0 == 1) {
            f15 = 9.0f;
        }
        rw0Var.setTranslationY(dp4 + AndroidUtilities.dp(f15));
        float f18 = premiumPreviewFragment.f34485c0;
        float w10 = e2.c.w(1.0f, f18, 0.4f, 0.6f);
        if (f18 > 0.5f) {
            f11 = (f18 - 0.5f) / 0.5f;
        } else {
            f11 = 0.0f;
        }
        float f19 = 1.0f - f11;
        premiumPreviewFragment.R.d.setScaleX(w10);
        premiumPreviewFragment.R.d.setScaleY(w10);
        premiumPreviewFragment.R.d.setAlpha(f19);
        premiumPreviewFragment.R.f42222b.setAlpha(f19);
        premiumPreviewFragment.R.f42224e.setAlpha(f19);
        premiumPreviewFragment.S.setAlpha(1.0f - premiumPreviewFragment.f34485c0);
        premiumPreviewFragment.S.setTranslationY(premiumPreviewFragment.R.f42223c.getY() + premiumPreviewFragment.R.getY() + ((-(p2Var.getMeasuredHeight() - premiumPreviewFragment.R.d.getMeasuredWidth())) / 2.0f));
        float dp5 = AndroidUtilities.dp(72.0f) - premiumPreviewFragment.R.f42221a.getLeft();
        float f20 = premiumPreviewFragment.f34485c0;
        if (f20 > 0.3f) {
            f12 = (f20 - 0.3f) / 0.7f;
        } else {
            f12 = 0.0f;
        }
        premiumPreviewFragment.R.f42221a.setTranslationX((1.0f - org.telegram.ui.Components.pr.h.getInterpolation(1.0f - f12)) * dp5);
        vw0 vw0Var = premiumPreviewFragment.R;
        vw0Var.d.f7087b.f7059p = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.Y) + (premiumPreviewFragment.R.f42223c.getX() + vw0Var.getX())) / getMeasuredWidth();
        vw0 vw0Var2 = premiumPreviewFragment.R;
        vw0Var2.d.f7087b.f7060q = (premiumPreviewFragment.R.f42223c.getY() + vw0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.W) {
            invalidate();
            premiumPreviewFragment.H.invalidate();
            premiumPreviewFragment.G.invalidate();
        }
        p1Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.Y, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z4) {
            int i11 = org.telegram.ui.ActionBar.k6.f21607a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i11);
            Paint paint = this.f38438c;
            paint.setColor(themedColor);
            r11 = 0;
            r11 = 0;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.f34498n0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.a.d(premiumPreviewFragment.f34498n0, premiumPreviewFragment.getThemedColor(i11), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
                    float height = kVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                }
            }
            canvas2 = canvas;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), p1Var.f6490f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.G.getVisibility() != 0) {
            premiumPreviewFragment.f34501q0.b(premiumPreviewFragment.f34496l0.d, r11);
            premiumPreviewFragment.f34501q0.setBounds(r11, getHeight() - premiumPreviewFragment.f34496l0.d, getWidth(), getHeight());
            premiumPreviewFragment.f34501q0.draw(canvas2);
        }
        f5Var = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).parentLayout;
        if (f5Var != null && z4) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).parentLayout;
            int i12 = (int) (premiumPreviewFragment.f34498n0 * 255.0f);
            kVar5 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) f5Var2).p(canvas2, i12, kVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.R.f42223c.getX() + premiumPreviewFragment.R.getX();
        float y10 = premiumPreviewFragment.R.f42223c.getY() + premiumPreviewFragment.R.getY();
        RectF rectF = AndroidUtilities.rectTmp;
        rw0 rw0Var = premiumPreviewFragment.R.d;
        if (rw0Var == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = rw0Var.getMeasuredWidth();
        }
        float f10 = measuredWidth + x10;
        rw0 rw0Var2 = premiumPreviewFragment.R.d;
        if (rw0Var2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = rw0Var2.getMeasuredHeight();
        }
        rectF.set(x10, y10, f10, measuredHeight + y10);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f38436a) && !premiumPreviewFragment.f34480a.H1) {
            motionEvent.offsetLocation(-x10, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f38436a = false;
                }
            } else {
                this.f38436a = true;
            }
            premiumPreviewFragment.R.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.R.f42224e.getX() + premiumPreviewFragment.R.getX();
        float y11 = premiumPreviewFragment.R.f42224e.getY() + premiumPreviewFragment.R.getY();
        rectF.set(x11, y11, premiumPreviewFragment.R.f42224e.getWidth() + x11, premiumPreviewFragment.R.f42224e.getHeight() + y11);
        if (premiumPreviewFragment.f34498n0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f38437b) && !premiumPreviewFragment.f34480a.H1)) {
            motionEvent.offsetLocation(-x11, -y11);
            if (motionEvent.getAction() == 0) {
                this.f38437b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f38437b = false;
            }
            premiumPreviewFragment.R.f42224e.dispatchTouchEvent(motionEvent);
            if (this.f38437b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        rw0 rw0Var = premiumPreviewFragment.R.d;
        rw0Var.f7087b.f7061r = rw0Var.getMeasuredWidth() / getMeasuredWidth();
        rw0 rw0Var2 = premiumPreviewFragment.R.d;
        rw0Var2.f7087b.f7062s = rw0Var2.getMeasuredHeight() / getMeasuredHeight();
        vw0 vw0Var = premiumPreviewFragment.R;
        vw0Var.d.f7087b.f7059p = (premiumPreviewFragment.R.d.getX() + vw0Var.getX()) / getMeasuredWidth();
        vw0 vw0Var2 = premiumPreviewFragment.R;
        vw0Var2.d.f7087b.f7060q = (premiumPreviewFragment.R.d.getY() + vw0Var2.getY()) / getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int i12 = 0;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z4 = true;
        } else {
            z4 = false;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.T = z4;
        premiumPreviewFragment.U = AndroidUtilities.statusBarHeight;
        premiumPreviewFragment.R.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.S.getLayoutParams().height = premiumPreviewFragment.R.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.G;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i12 = AndroidUtilities.dp(68.0f);
        }
        org.telegram.ui.Components.rz rzVar = premiumPreviewFragment.M;
        rzVar.M = (premiumPreviewFragment.U + i12) - AndroidUtilities.dp(16.0f);
        rzVar.p1();
        premiumPreviewFragment.M.S = i12;
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.s0();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.f34484c;
        ArrayList arrayList2 = premiumPreviewFragment.f34482b;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            premiumPreviewFragment.I.a((ww0) arrayList2.get(i15), false);
            premiumPreviewFragment.I.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((ww0) arrayList2.get(i15)).f42870e = i14;
            i14 += premiumPreviewFragment.I.getMeasuredHeight();
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            premiumPreviewFragment.I.a((ww0) arrayList.get(i16), false);
            premiumPreviewFragment.I.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((ww0) arrayList.get(i16)).f42870e = i14;
            i14 += premiumPreviewFragment.I.getMeasuredHeight();
        }
        premiumPreviewFragment.K = i14;
    }
}
