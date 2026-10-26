package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class he1 extends org.telegram.ui.Components.vw0 {
    public boolean f39997l0;
    public final Paint m0;
    public final af1 f39998n0;

    public he1(af1 af1Var, Context context) {
        super(context, null);
        this.f39998n0 = af1Var;
        setWillNotDraw(false);
        this.m0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            af1 af1Var = this.f39998n0;
            if (af1Var.f37753h1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                af1Var.f37753h1.w(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override
    public final void K(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            af1 af1Var = this.f39998n0;
            if (i10 < af1Var.N.getChildCount()) {
                View childAt = af1Var.N.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + af1Var.N.getX(), childAt.getY() + af1Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.sw0)) {
                        arrayList.add((org.telegram.ui.Components.sw0) childAt);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(save);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int measuredWidth;
        int measuredHeight;
        af1 af1Var = this.f39998n0;
        hh.d dVar = af1Var.f37755i1;
        hh.d dVar2 = af1Var.f37753h1;
        ch.f fVar = af1Var.f37751g1;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            af1Var.x0();
            cy cyVar = af1Var.M0;
            if (cyVar != null) {
                measuredWidth = cyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            cy cyVar2 = af1Var.M0;
            if (cyVar2 != null) {
                measuredHeight = cyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f12843r && dVar2.c(measuredWidth, measuredHeight)) {
                fVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.b();
            }
            if (dVar != null && !dVar.f12843r && dVar.c(measuredWidth, measuredHeight)) {
                fVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.b();
            }
        }
        super.dispatchDraw(canvas);
        if (af1Var.isInPreviewMode()) {
            int themedColor = af1Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6);
            Paint paint = this.m0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (af1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.y6.f23478k0);
        } else {
            canvas2 = canvas;
        }
        if (af1Var.M0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, af1Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6), af1Var.f37749f1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        af1 af1Var = this.f39998n0;
        kVar = ((org.telegram.ui.ActionBar.r2) af1Var).actionBar;
        if (view == kVar && !af1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.r2) af1Var).actionBar;
            float y3 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.r2) af1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.t91 t91Var = af1Var.f37736a1;
            if (t91Var != null && t91Var.getVisibility() != 8) {
                f7 = af1Var.f37736a1.getMeasuredHeight();
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) (y3 + ((int) ((f7 * af1Var.W) + height)));
            ((ActionBarLayout) af1Var.getParentLayout()).p(canvas, (int) ((1.0f - af1Var.W) * 255.0f), i10);
            float f10 = af1Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.y6.f23478k0.getAlpha();
                    org.telegram.ui.ActionBar.y6.f23478k0.setAlpha((int) (alpha * af1Var.W));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.y6.f23478k0);
                    org.telegram.ui.ActionBar.y6.f23478k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.y6.f23478k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.he1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        af1 af1Var = this.f39998n0;
        o41 o41Var = af1Var.f37765o0;
        if (o41Var != null) {
            this.f39997l0 = true;
            ViewGroup.LayoutParams layoutParams = o41Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = af1Var.f37749f1;
            layoutParams.height = dp + i13;
            af1Var.f37765o0.setPadding(0, 0, 0, i13);
            this.f39997l0 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                i14 = childAt.getMeasuredHeight();
            }
        }
        int i16 = 0;
        while (i16 < getChildCount()) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.k)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, 0);
                } else {
                    i12 = i14;
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                    i16++;
                    i14 = i12;
                }
            }
            i12 = i14;
            i16++;
            i14 = i12;
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void requestLayout() {
        if (this.f39997l0) {
            return;
        }
        super.requestLayout();
    }
}
