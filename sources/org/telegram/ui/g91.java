package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class g91 extends org.telegram.ui.Components.du0 {
    public boolean f48013g0;
    public final Paint f48014h0;
    public final y91 f48015i0;

    public g91(y91 y91Var, Context context) {
        super(context, null);
        this.f48015i0 = y91Var;
        setWillNotDraw(false);
        this.f48014h0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.bz.f()) {
            y91 y91Var = this.f48015i0;
            if (y91Var.f54119j1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                y91Var.f54119j1.o(rect.left, rect.top + f10, rect.right, rect.bottom + f10, canvas);
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
    public final void J(Canvas canvas, ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            y91 y91Var = this.f48015i0;
            if (i7 < y91Var.O.getChildCount()) {
                View childAt = y91Var.O.getChildAt(i7);
                if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + y91Var.O.getX(), childAt.getY() + y91Var.O.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.au0)) {
                        arrayList.add((org.telegram.ui.Components.au0) childAt);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(save);
                }
                i7++;
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
        y91 y91Var = this.f48015i0;
        ui.f fVar = y91Var.f54121k1;
        ui.f fVar2 = y91Var.f54119j1;
        dh.g gVar = y91Var.f54117i1;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            y91Var.B0();
            cx cxVar = y91Var.N0;
            if (cxVar != null) {
                measuredWidth = cxVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            cx cxVar2 = y91Var.N0;
            if (cxVar2 != null) {
                measuredHeight = cxVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (fVar2 != null && !fVar2.f59048r && fVar2.j(measuredWidth, measuredHeight)) {
                gVar.b(fVar2.h(measuredWidth, measuredHeight), -3);
                fVar2.i();
            }
            if (fVar != null && !fVar.f59048r && fVar.j(measuredWidth, measuredHeight)) {
                gVar.b(fVar.h(measuredWidth, measuredHeight), -2);
                fVar.i();
            }
        }
        super.dispatchDraw(canvas);
        if (y91Var.isInPreviewMode()) {
            int themedColor = y91Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29378d6);
            Paint paint = this.f48014h0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (y91Var.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.f24140m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.m6.f29501k0);
        } else {
            canvas2 = canvas;
        }
        if (y91Var.N0 == null) {
            org.telegram.messenger.g0.O(canvas2, this, y91Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29378d6), y91Var.f54115h1, 1.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        y91 y91Var = this.f48015i0;
        kVar = ((org.telegram.ui.ActionBar.g2) y91Var).actionBar;
        if (view == kVar && !y91Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.g2) y91Var).actionBar;
            float y10 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.g2) y91Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.i71 i71Var = y91Var.f54100b1;
            if (i71Var != null && i71Var.getVisibility() != 8) {
                f10 = y91Var.f54100b1.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i7 = (int) (y10 + ((int) ((f10 * y91Var.X) + height)));
            ((ActionBarLayout) y91Var.getParentLayout()).p(canvas, (int) ((1.0f - y91Var.X) * 255.0f), i7);
            float f11 = y91Var.X;
            if (f11 > 0.0f) {
                if (f11 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.m6.f29501k0.getAlpha();
                    org.telegram.ui.ActionBar.m6.f29501k0.setAlpha((int) (alpha * y91Var.X));
                    float f12 = i7;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.m6.f29501k0);
                    org.telegram.ui.ActionBar.m6.f29501k0.setAlpha(alpha);
                } else {
                    float f13 = i7;
                    canvas.drawLine(0.0f, f13, getMeasuredWidth(), f13, org.telegram.ui.ActionBar.m6.f29501k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g91.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        y91 y91Var = this.f48015i0;
        ih0 ih0Var = y91Var.f54128p0;
        if (ih0Var != null) {
            this.f48013g0 = true;
            ViewGroup.LayoutParams layoutParams = ih0Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(51.0f);
            int i12 = y91Var.f54115h1;
            layoutParams.height = L + i12;
            y91Var.f54128p0.setPadding(0, 0, 0, i12);
            this.f48013g0 = false;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                i13 = childAt.getMeasuredHeight();
            }
        }
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.k)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i7, 0, i10, 0);
                } else {
                    i11 = i13;
                    measureChildWithMargins(childAt2, i7, 0, i10, i11);
                    i15++;
                    i13 = i11;
                }
            }
            i11 = i13;
            i15++;
            i13 = i11;
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void requestLayout() {
        if (this.f48013g0) {
            return;
        }
        super.requestLayout();
    }
}
