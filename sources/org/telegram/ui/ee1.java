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
public final class ee1 extends org.telegram.ui.Components.hv0 {
    public boolean f37799s0;
    public final Paint f37800t0;
    public final ze1 f37801u0;

    public ee1(ze1 ze1Var, Context context) {
        super(context, null);
        this.f37801u0 = ze1Var;
        setWillNotDraw(false);
        this.f37800t0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            ze1 ze1Var = this.f37801u0;
            if (ze1Var.f45163c1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f9);
                ze1Var.f45163c1.E0(canvas, rect.left, rect.top + f9, rect.right, rect.bottom + f9);
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
            ze1 ze1Var = this.f37801u0;
            if (i10 < ze1Var.J.getChildCount()) {
                View childAt = ze1Var.J.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + ze1Var.J.getX(), childAt.getY() + ze1Var.J.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.ev0)) {
                        arrayList.add((org.telegram.ui.Components.ev0) childAt);
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
        ze1 ze1Var = this.f37801u0;
        qg.d dVar = ze1Var.f45165d1;
        qg.d dVar2 = ze1Var.f45163c1;
        lg.e eVar = ze1Var.f45160b1;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ze1Var.x0();
            fy fyVar = ze1Var.I0;
            if (fyVar != null) {
                measuredWidth = fyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            fy fyVar2 = ze1Var.I0;
            if (fyVar2 != null) {
                measuredHeight = fyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f46673n && dVar2.e(measuredWidth, measuredHeight)) {
                eVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.b();
            }
            if (dVar != null && !dVar.f46673n && dVar.e(measuredWidth, measuredHeight)) {
                eVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.b();
            }
        }
        super.dispatchDraw(canvas);
        if (ze1Var.isInPreviewMode()) {
            int themedColor = ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6);
            Paint paint = this.f37800t0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (ze1Var.S * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.g6.f23183k0);
        } else {
            canvas2 = canvas;
        }
        if (ze1Var.I0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6), ze1Var.f45157a1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        float f9;
        ze1 ze1Var = this.f37801u0;
        lVar = ((org.telegram.ui.ActionBar.o2) ze1Var).actionBar;
        if (view == lVar && !ze1Var.isInPreviewMode()) {
            lVar2 = ((org.telegram.ui.ActionBar.o2) ze1Var).actionBar;
            float y8 = lVar2.getY();
            lVar3 = ((org.telegram.ui.ActionBar.o2) ze1Var).actionBar;
            float height = lVar3.getHeight();
            org.telegram.ui.Components.y71 y71Var = ze1Var.W0;
            if (y71Var != null && y71Var.getVisibility() != 8) {
                f9 = ze1Var.W0.getMeasuredHeight();
            } else {
                f9 = 0.0f;
            }
            int i10 = (int) (y8 + ((int) ((f9 * ze1Var.S) + height)));
            ((ActionBarLayout) ze1Var.getParentLayout()).p(canvas, (int) ((1.0f - ze1Var.S) * 255.0f), i10);
            float f10 = ze1Var.S;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.g6.f23183k0.getAlpha();
                    org.telegram.ui.ActionBar.g6.f23183k0.setAlpha((int) (alpha * ze1Var.S));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.g6.f23183k0);
                    org.telegram.ui.ActionBar.g6.f23183k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.g6.f23183k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ee1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ze1 ze1Var = this.f37801u0;
        n31 n31Var = ze1Var.f45179k0;
        if (n31Var != null) {
            this.f37799s0 = true;
            ViewGroup.LayoutParams layoutParams = n31Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = ze1Var.f45157a1;
            layoutParams.height = dp + i13;
            ze1Var.f45179k0.setPadding(0, 0, 0, i13);
            this.f37799s0 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.ActionBar.l) {
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                i14 = childAt.getMeasuredHeight();
            }
        }
        int i16 = 0;
        while (i16 < getChildCount()) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.l)) {
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
        if (this.f37799s0) {
            return;
        }
        super.requestLayout();
    }
}
