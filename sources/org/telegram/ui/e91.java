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
public final class e91 extends org.telegram.ui.Components.rt0 {
    public boolean f45244f0;
    public final Paint f45245g0;
    public final v91 f45246h0;

    public e91(v91 v91Var, Context context) {
        super(context, null);
        this.f45246h0 = v91Var;
        setWillNotDraw(false);
        this.f45245g0 = new Paint();
    }

    @Override
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.iz.f()) {
            v91 v91Var = this.f45246h0;
            if (v91Var.f50648h1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                v91Var.f50648h1.e(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
            v91 v91Var = this.f45246h0;
            if (i7 < v91Var.N.getChildCount()) {
                View childAt = v91Var.N.getChildAt(i7);
                if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + v91Var.N.getX(), childAt.getY() + v91Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.ot0)) {
                        arrayList.add((org.telegram.ui.Components.ot0) childAt);
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
        v91 v91Var = this.f45246h0;
        ri.f fVar = v91Var.f50650i1;
        ri.f fVar2 = v91Var.f50648h1;
        dh.g gVar = v91Var.f50646g1;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            v91Var.B0();
            ww wwVar = v91Var.M0;
            if (wwVar != null) {
                measuredWidth = wwVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            ww wwVar2 = v91Var.M0;
            if (wwVar2 != null) {
                measuredHeight = wwVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (fVar2 != null && !fVar2.f54482r && fVar2.k(measuredWidth, measuredHeight)) {
                gVar.b(fVar2.i(measuredWidth, measuredHeight), -3);
                fVar2.j();
            }
            if (fVar != null && !fVar.f54482r && fVar.k(measuredWidth, measuredHeight)) {
                gVar.b(fVar.i(measuredWidth, measuredHeight), -2);
                fVar.j();
            }
        }
        super.dispatchDraw(canvas);
        if (v91Var.isInPreviewMode()) {
            int themedColor = v91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27849d6);
            Paint paint = this.f45245g0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (v91Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.f22538m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.k6.f27972k0);
        } else {
            canvas2 = canvas;
        }
        if (v91Var.M0 == null) {
            org.telegram.messenger.g0.O(canvas2, this, v91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27849d6), v91Var.f50644f1, 1.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        v91 v91Var = this.f45246h0;
        kVar = ((org.telegram.ui.ActionBar.f2) v91Var).actionBar;
        if (view == kVar && !v91Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.f2) v91Var).actionBar;
            float y10 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.f2) v91Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.u61 u61Var = v91Var.f50630a1;
            if (u61Var != null && u61Var.getVisibility() != 8) {
                f10 = v91Var.f50630a1.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i7 = (int) (y10 + ((int) ((f10 * v91Var.W) + height)));
            ((ActionBarLayout) v91Var.getParentLayout()).p(canvas, (int) ((1.0f - v91Var.W) * 255.0f), i7);
            float f11 = v91Var.W;
            if (f11 > 0.0f) {
                if (f11 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.k6.f27972k0.getAlpha();
                    org.telegram.ui.ActionBar.k6.f27972k0.setAlpha((int) (alpha * v91Var.W));
                    float f12 = i7;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.k6.f27972k0);
                    org.telegram.ui.ActionBar.k6.f27972k0.setAlpha(alpha);
                } else {
                    float f13 = i7;
                    canvas.drawLine(0.0f, f13, getMeasuredWidth(), f13, org.telegram.ui.ActionBar.k6.f27972k0);
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
        v91 v91Var = this.f45246h0;
        sq0 sq0Var = v91Var.f50659o0;
        if (sq0Var != null) {
            this.f45244f0 = true;
            ViewGroup.LayoutParams layoutParams = sq0Var.getLayoutParams();
            int L = org.telegram.messenger.g0.L(51.0f);
            int i12 = v91Var.f50644f1;
            layoutParams.height = L + i12;
            v91Var.f50659o0.setPadding(0, 0, 0, i12);
            this.f45244f0 = false;
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
        if (this.f45244f0) {
            return;
        }
        super.requestLayout();
    }
}
