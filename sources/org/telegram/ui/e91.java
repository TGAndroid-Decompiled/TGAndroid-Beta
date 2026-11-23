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
public final class e91 extends org.telegram.ui.Components.cu0 {
    public boolean f47479g0;
    public final Paint f47480h0;
    public final w91 f47481i0;

    public e91(w91 w91Var, Context context) {
        super(context, null);
        this.f47481i0 = w91Var;
        setWillNotDraw(false);
        this.f47480h0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.bz.f()) {
            w91 w91Var = this.f47481i0;
            if (w91Var.f53240j1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                w91Var.f53240j1.z(rect.left, rect.top + f10, rect.right, rect.bottom + f10, canvas);
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
            w91 w91Var = this.f47481i0;
            if (i7 < w91Var.O.getChildCount()) {
                View childAt = w91Var.O.getChildAt(i7);
                if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + w91Var.O.getX(), childAt.getY() + w91Var.O.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.zt0)) {
                        arrayList.add((org.telegram.ui.Components.zt0) childAt);
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
        w91 w91Var = this.f47481i0;
        ui.f fVar = w91Var.f53242k1;
        ui.f fVar2 = w91Var.f53240j1;
        dh.g gVar = w91Var.f53238i1;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            w91Var.B0();
            bx bxVar = w91Var.N0;
            if (bxVar != null) {
                measuredWidth = bxVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            bx bxVar2 = w91Var.N0;
            if (bxVar2 != null) {
                measuredHeight = bxVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (fVar2 != null && !fVar2.f59134r && fVar2.j(measuredWidth, measuredHeight)) {
                gVar.b(fVar2.h(measuredWidth, measuredHeight), -3);
                fVar2.i();
            }
            if (fVar != null && !fVar.f59134r && fVar.j(measuredWidth, measuredHeight)) {
                gVar.b(fVar.h(measuredWidth, measuredHeight), -2);
                fVar.i();
            }
        }
        super.dispatchDraw(canvas);
        if (w91Var.isInPreviewMode()) {
            int themedColor = w91Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6);
            Paint paint = this.f47480h0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (w91Var.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.f24220m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.n6.f29574k0);
        } else {
            canvas2 = canvas;
        }
        if (w91Var.N0 == null) {
            org.telegram.messenger.g0.O(canvas2, this, w91Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6), w91Var.f53236h1, 1.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        w91 w91Var = this.f47481i0;
        kVar = ((org.telegram.ui.ActionBar.g2) w91Var).actionBar;
        if (view == kVar && !w91Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.g2) w91Var).actionBar;
            float y10 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.g2) w91Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.j71 j71Var = w91Var.f53221b1;
            if (j71Var != null && j71Var.getVisibility() != 8) {
                f10 = w91Var.f53221b1.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i7 = (int) (y10 + ((int) ((f10 * w91Var.X) + height)));
            ((ActionBarLayout) w91Var.getParentLayout()).p(canvas, (int) ((1.0f - w91Var.X) * 255.0f), i7);
            float f11 = w91Var.X;
            if (f11 > 0.0f) {
                if (f11 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.n6.f29574k0.getAlpha();
                    org.telegram.ui.ActionBar.n6.f29574k0.setAlpha((int) (alpha * w91Var.X));
                    float f12 = i7;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.n6.f29574k0);
                    org.telegram.ui.ActionBar.n6.f29574k0.setAlpha(alpha);
                } else {
                    float f13 = i7;
                    canvas.drawLine(0.0f, f13, getMeasuredWidth(), f13, org.telegram.ui.ActionBar.n6.f29574k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e91.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        w91 w91Var = this.f47481i0;
        gh0 gh0Var = w91Var.f53249p0;
        if (gh0Var != null) {
            this.f47479g0 = true;
            ViewGroup.LayoutParams layoutParams = gh0Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(51.0f);
            int i12 = w91Var.f53236h1;
            layoutParams.height = L + i12;
            w91Var.f53249p0.setPadding(0, 0, 0, i12);
            this.f47479g0 = false;
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
        if (this.f47479g0) {
            return;
        }
        super.requestLayout();
    }
}
