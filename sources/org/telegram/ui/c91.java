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
public final class c91 extends org.telegram.ui.Components.st0 {
    public boolean f46058g0;
    public final Paint f46059h0;
    public final u91 f46060i0;

    public c91(u91 u91Var, Context context) {
        super(context, null);
        this.f46060i0 = u91Var;
        setWillNotDraw(false);
        this.f46059h0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.gz.f()) {
            u91 u91Var = this.f46060i0;
            if (u91Var.f51856i1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                u91Var.f51856i1.b0(rect.left, rect.top + f10, rect.right, rect.bottom + f10, canvas);
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
            u91 u91Var = this.f46060i0;
            if (i7 < u91Var.O.getChildCount()) {
                View childAt = u91Var.O.getChildAt(i7);
                if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + u91Var.O.getX(), childAt.getY() + u91Var.O.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.pt0)) {
                        arrayList.add((org.telegram.ui.Components.pt0) childAt);
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
        u91 u91Var = this.f46060i0;
        ui.f fVar = u91Var.f51858j1;
        ui.f fVar2 = u91Var.f51856i1;
        dh.g gVar = u91Var.f51854h1;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            u91Var.B0();
            yw ywVar = u91Var.N0;
            if (ywVar != null) {
                measuredWidth = ywVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            yw ywVar2 = u91Var.N0;
            if (ywVar2 != null) {
                measuredHeight = ywVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (fVar2 != null && !fVar2.f58442r && fVar2.j(measuredWidth, measuredHeight)) {
                gVar.b(fVar2.h(measuredWidth, measuredHeight), -3);
                fVar2.i();
            }
            if (fVar != null && !fVar.f58442r && fVar.j(measuredWidth, measuredHeight)) {
                gVar.b(fVar.h(measuredWidth, measuredHeight), -2);
                fVar.i();
            }
        }
        super.dispatchDraw(canvas);
        if (u91Var.isInPreviewMode()) {
            int themedColor = u91Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6);
            Paint paint = this.f46059h0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (u91Var.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.f23603m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.j6.f28972k0);
        } else {
            canvas2 = canvas;
        }
        if (u91Var.N0 == null) {
            org.telegram.messenger.g0.O(canvas2, this, u91Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6), u91Var.f51852g1, 1.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        u91 u91Var = this.f46060i0;
        kVar = ((org.telegram.ui.ActionBar.e2) u91Var).actionBar;
        if (view == kVar && !u91Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.e2) u91Var).actionBar;
            float y10 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.e2) u91Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.v61 v61Var = u91Var.f51839b1;
            if (v61Var != null && v61Var.getVisibility() != 8) {
                f10 = u91Var.f51839b1.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i7 = (int) (y10 + ((int) ((f10 * u91Var.X) + height)));
            ((ActionBarLayout) u91Var.getParentLayout()).p(canvas, (int) ((1.0f - u91Var.X) * 255.0f), i7);
            float f11 = u91Var.X;
            if (f11 > 0.0f) {
                if (f11 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.j6.f28972k0.getAlpha();
                    org.telegram.ui.ActionBar.j6.f28972k0.setAlpha((int) (alpha * u91Var.X));
                    float f12 = i7;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.j6.f28972k0);
                    org.telegram.ui.ActionBar.j6.f28972k0.setAlpha(alpha);
                } else {
                    float f13 = i7;
                    canvas.drawLine(0.0f, f13, getMeasuredWidth(), f13, org.telegram.ui.ActionBar.j6.f28972k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c91.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        u91 u91Var = this.f46060i0;
        eh0 eh0Var = u91Var.f51867p0;
        if (eh0Var != null) {
            this.f46058g0 = true;
            ViewGroup.LayoutParams layoutParams = eh0Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(51.0f);
            int i12 = u91Var.f51852g1;
            layoutParams.height = L + i12;
            u91Var.f51867p0.setPadding(0, 0, 0, i12);
            this.f46058g0 = false;
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
        if (this.f46058g0) {
            return;
        }
        super.requestLayout();
    }
}
