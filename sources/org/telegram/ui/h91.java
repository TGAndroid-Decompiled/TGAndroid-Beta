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
public final class h91 extends org.telegram.ui.Components.st0 {
    public boolean f46277f0;
    public final Paint f46278g0;
    public final z91 f46279h0;

    public h91(z91 z91Var, Context context) {
        super(context, null);
        this.f46279h0 = z91Var;
        setWillNotDraw(false);
        this.f46278g0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.iz.f()) {
            z91 z91Var = this.f46279h0;
            if (z91Var.f52363h1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                z91Var.f52363h1.e(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
            z91 z91Var = this.f46279h0;
            if (i7 < z91Var.N.getChildCount()) {
                View childAt = z91Var.N.getChildAt(i7);
                if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + z91Var.N.getX(), childAt.getY() + z91Var.N.getY() + getY());
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
        z91 z91Var = this.f46279h0;
        ri.f fVar = z91Var.f52365i1;
        ri.f fVar2 = z91Var.f52363h1;
        dh.g gVar = z91Var.f52361g1;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            z91Var.B0();
            zw zwVar = z91Var.M0;
            if (zwVar != null) {
                measuredWidth = zwVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            zw zwVar2 = z91Var.M0;
            if (zwVar2 != null) {
                measuredHeight = zwVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (fVar2 != null && !fVar2.f54586r && fVar2.k(measuredWidth, measuredHeight)) {
                gVar.b(fVar2.i(measuredWidth, measuredHeight), -3);
                fVar2.j();
            }
            if (fVar != null && !fVar.f54586r && fVar.k(measuredWidth, measuredHeight)) {
                gVar.b(fVar.i(measuredWidth, measuredHeight), -2);
                fVar.j();
            }
        }
        super.dispatchDraw(canvas);
        if (z91Var.isInPreviewMode()) {
            int themedColor = z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6);
            Paint paint = this.f46278g0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (z91Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.f22561m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.m6.f28013k0);
        } else {
            canvas2 = canvas;
        }
        if (z91Var.M0 == null) {
            org.telegram.messenger.g0.O(canvas2, this, z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6), z91Var.f52359f1, 1.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        float f10;
        z91 z91Var = this.f46279h0;
        lVar = ((org.telegram.ui.ActionBar.f2) z91Var).actionBar;
        if (view == lVar && !z91Var.isInPreviewMode()) {
            lVar2 = ((org.telegram.ui.ActionBar.f2) z91Var).actionBar;
            float y10 = lVar2.getY();
            lVar3 = ((org.telegram.ui.ActionBar.f2) z91Var).actionBar;
            float height = lVar3.getHeight();
            org.telegram.ui.Components.u61 u61Var = z91Var.f52345a1;
            if (u61Var != null && u61Var.getVisibility() != 8) {
                f10 = z91Var.f52345a1.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i7 = (int) (y10 + ((int) ((f10 * z91Var.W) + height)));
            ((ActionBarLayout) z91Var.getParentLayout()).p(canvas, (int) ((1.0f - z91Var.W) * 255.0f), i7);
            float f11 = z91Var.W;
            if (f11 > 0.0f) {
                if (f11 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.m6.f28013k0.getAlpha();
                    org.telegram.ui.ActionBar.m6.f28013k0.setAlpha((int) (alpha * z91Var.W));
                    float f12 = i7;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.m6.f28013k0);
                    org.telegram.ui.ActionBar.m6.f28013k0.setAlpha(alpha);
                } else {
                    float f13 = i7;
                    canvas.drawLine(0.0f, f13, getMeasuredWidth(), f13, org.telegram.ui.ActionBar.m6.f28013k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h91.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        z91 z91Var = this.f46279h0;
        vq0 vq0Var = z91Var.f52374o0;
        if (vq0Var != null) {
            this.f46277f0 = true;
            ViewGroup.LayoutParams layoutParams = vq0Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(51.0f);
            int i12 = z91Var.f52359f1;
            layoutParams.height = L + i12;
            z91Var.f52374o0.setPadding(0, 0, 0, i12);
            this.f46277f0 = false;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof org.telegram.ui.ActionBar.l) {
                childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                i13 = childAt.getMeasuredHeight();
            }
        }
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.l)) {
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
        if (this.f46277f0) {
            return;
        }
        super.requestLayout();
    }
}
