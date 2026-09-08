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
public final class lf1 extends org.telegram.ui.Components.ov0 {
    public boolean f38371w0;
    public final Paint f38372x0;
    public final eg1 f38373y0;

    public lf1(eg1 eg1Var, Context context) {
        super(context, null);
        this.f38373y0 = eg1Var;
        setWillNotDraw(false);
        this.f38372x0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            eg1 eg1Var = this.f38373y0;
            if (eg1Var.f36070g1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                eg1Var.f36070g1.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
            eg1 eg1Var = this.f38373y0;
            if (i10 < eg1Var.N.getChildCount()) {
                View childAt = eg1Var.N.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + eg1Var.N.getX(), childAt.getY() + eg1Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.lv0)) {
                        arrayList.add((org.telegram.ui.Components.lv0) childAt);
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
        eg1 eg1Var = this.f38373y0;
        gh.d dVar = eg1Var.f36072h1;
        gh.d dVar2 = eg1Var.f36070g1;
        bh.f fVar = eg1Var.f36068f1;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            eg1Var.x0();
            uy uyVar = eg1Var.M0;
            if (uyVar != null) {
                measuredWidth = uyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            uy uyVar2 = eg1Var.M0;
            if (uyVar2 != null) {
                measuredHeight = uyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f10686n && dVar2.f(measuredWidth, measuredHeight)) {
                fVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.b();
            }
            if (dVar != null && !dVar.f10686n && dVar.f(measuredWidth, measuredHeight)) {
                fVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.b();
            }
        }
        super.dispatchDraw(canvas);
        if (eg1Var.isInPreviewMode()) {
            int themedColor = eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6);
            Paint paint = this.f38372x0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (eg1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.j6.f20812k0);
        } else {
            canvas2 = canvas;
        }
        if (eg1Var.M0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6), eg1Var.f36065e1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        eg1 eg1Var = this.f38373y0;
        kVar = ((org.telegram.ui.ActionBar.n2) eg1Var).actionBar;
        if (view == kVar && !eg1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) eg1Var).actionBar;
            float y3 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.n2) eg1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.h81 h81Var = eg1Var.f36054a1;
            if (h81Var != null && h81Var.getVisibility() != 8) {
                f7 = eg1Var.f36054a1.getMeasuredHeight();
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) (y3 + ((int) ((f7 * eg1Var.W) + height)));
            ((ActionBarLayout) eg1Var.getParentLayout()).p(canvas, (int) ((1.0f - eg1Var.W) * 255.0f), i10);
            float f10 = eg1Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.j6.f20812k0.getAlpha();
                    org.telegram.ui.ActionBar.j6.f20812k0.setAlpha((int) (alpha * eg1Var.W));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.j6.f20812k0);
                    org.telegram.ui.ActionBar.j6.f20812k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.j6.f20812k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lf1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        eg1 eg1Var = this.f38373y0;
        v51 v51Var = eg1Var.f36083o0;
        if (v51Var != null) {
            this.f38371w0 = true;
            ViewGroup.LayoutParams layoutParams = v51Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = eg1Var.f36065e1;
            layoutParams.height = dp + i13;
            eg1Var.f36083o0.setPadding(0, 0, 0, i13);
            this.f38371w0 = false;
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
        if (this.f38371w0) {
            return;
        }
        super.requestLayout();
    }
}
