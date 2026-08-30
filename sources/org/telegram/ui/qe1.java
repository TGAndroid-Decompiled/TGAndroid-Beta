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
public final class qe1 extends org.telegram.ui.Components.qv0 {
    public boolean f37735t0;
    public final Paint f37736u0;
    public final kf1 f37737v0;

    public qe1(kf1 kf1Var, Context context) {
        super(context, null);
        this.f37737v0 = kf1Var;
        setWillNotDraw(false);
        this.f37736u0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            kf1 kf1Var = this.f37737v0;
            if (kf1Var.f35678d1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                kf1Var.f35678d1.X(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
    public final void L(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            kf1 kf1Var = this.f37737v0;
            if (i10 < kf1Var.K.getChildCount()) {
                View childAt = kf1Var.K.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + kf1Var.K.getX(), childAt.getY() + kf1Var.K.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.nv0)) {
                        arrayList.add((org.telegram.ui.Components.nv0) childAt);
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
        kf1 kf1Var = this.f37737v0;
        sg.d dVar = kf1Var.f35680e1;
        sg.d dVar2 = kf1Var.f35678d1;
        ng.e eVar = kf1Var.f35676c1;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            kf1Var.x0();
            oy oyVar = kf1Var.J0;
            if (oyVar != null) {
                measuredWidth = oyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            oy oyVar2 = kf1Var.J0;
            if (oyVar2 != null) {
                measuredHeight = oyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f44314n && dVar2.e(measuredWidth, measuredHeight)) {
                eVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.b();
            }
            if (dVar != null && !dVar.f44314n && dVar.e(measuredWidth, measuredHeight)) {
                eVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.b();
            }
        }
        super.dispatchDraw(canvas);
        if (kf1Var.isInPreviewMode()) {
            int themedColor = kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6);
            Paint paint = this.f37736u0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (kf1Var.T * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.j6.f20025k0);
        } else {
            canvas2 = canvas;
        }
        if (kf1Var.J0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, kf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6), kf1Var.f35673b1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        kf1 kf1Var = this.f37737v0;
        kVar = ((org.telegram.ui.ActionBar.p2) kf1Var).actionBar;
        if (view == kVar && !kf1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) kf1Var).actionBar;
            float y10 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.p2) kf1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.k81 k81Var = kf1Var.X0;
            if (k81Var != null && k81Var.getVisibility() != 8) {
                f10 = kf1Var.X0.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i10 = (int) (y10 + ((int) ((f10 * kf1Var.T) + height)));
            ((ActionBarLayout) kf1Var.getParentLayout()).p(canvas, (int) ((1.0f - kf1Var.T) * 255.0f), i10);
            float f11 = kf1Var.T;
            if (f11 > 0.0f) {
                if (f11 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.j6.f20025k0.getAlpha();
                    org.telegram.ui.ActionBar.j6.f20025k0.setAlpha((int) (alpha * kf1Var.T));
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.j6.f20025k0);
                    org.telegram.ui.ActionBar.j6.f20025k0.setAlpha(alpha);
                } else {
                    float f13 = i10;
                    canvas.drawLine(0.0f, f13, getMeasuredWidth(), f13, org.telegram.ui.ActionBar.j6.f20025k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qe1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        kf1 kf1Var = this.f37737v0;
        a51 a51Var = kf1Var.f35693l0;
        if (a51Var != null) {
            this.f37735t0 = true;
            ViewGroup.LayoutParams layoutParams = a51Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = kf1Var.f35673b1;
            layoutParams.height = dp + i13;
            kf1Var.f35693l0.setPadding(0, 0, 0, i13);
            this.f37735t0 = false;
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
        if (this.f37735t0) {
            return;
        }
        super.requestLayout();
    }
}
