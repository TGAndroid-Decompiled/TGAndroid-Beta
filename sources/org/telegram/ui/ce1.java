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
public final class ce1 extends org.telegram.ui.Components.xu0 {
    public boolean f37185s0;
    public final Paint f37186t0;
    public final we1 f37187u0;

    public ce1(we1 we1Var, Context context) {
        super(context, null);
        this.f37187u0 = we1Var;
        setWillNotDraw(false);
        this.f37186t0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            we1 we1Var = this.f37187u0;
            if (we1Var.f43749c1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f10);
                we1Var.f43749c1.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
        int i9 = 0;
        while (true) {
            we1 we1Var = this.f37187u0;
            if (i9 < we1Var.J.getChildCount()) {
                View childAt = we1Var.J.getChildAt(i9);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + we1Var.J.getX(), childAt.getY() + we1Var.J.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.uu0)) {
                        arrayList.add((org.telegram.ui.Components.uu0) childAt);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(save);
                }
                i9++;
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
        we1 we1Var = this.f37187u0;
        ng.d dVar = we1Var.f43751d1;
        ng.d dVar2 = we1Var.f43749c1;
        ig.e eVar = we1Var.f43746b1;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            we1Var.w0();
            dy dyVar = we1Var.I0;
            if (dyVar != null) {
                measuredWidth = dyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            dy dyVar2 = we1Var.I0;
            if (dyVar2 != null) {
                measuredHeight = dyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f18606n && dVar2.e(measuredWidth, measuredHeight)) {
                eVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.b();
            }
            if (dVar != null && !dVar.f18606n && dVar.e(measuredWidth, measuredHeight)) {
                eVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.b();
            }
        }
        super.dispatchDraw(canvas);
        if (we1Var.isInPreviewMode()) {
            int themedColor = we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6);
            Paint paint = this.f37186t0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (we1Var.S * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.f6.f23121k0);
        } else {
            canvas2 = canvas;
        }
        if (we1Var.I0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6), we1Var.f43743a1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        we1 we1Var = this.f37187u0;
        kVar = ((org.telegram.ui.ActionBar.o2) we1Var).actionBar;
        if (view == kVar && !we1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) we1Var).actionBar;
            float y10 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.o2) we1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.m71 m71Var = we1Var.W0;
            if (m71Var != null && m71Var.getVisibility() != 8) {
                f10 = we1Var.W0.getMeasuredHeight();
            } else {
                f10 = 0.0f;
            }
            int i9 = (int) (y10 + ((int) ((f10 * we1Var.S) + height)));
            ((ActionBarLayout) we1Var.getParentLayout()).p(canvas, (int) ((1.0f - we1Var.S) * 255.0f), i9);
            float f11 = we1Var.S;
            if (f11 > 0.0f) {
                if (f11 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.f6.f23121k0.getAlpha();
                    org.telegram.ui.ActionBar.f6.f23121k0.setAlpha((int) (alpha * we1Var.S));
                    float f12 = i9;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.f6.f23121k0);
                    org.telegram.ui.ActionBar.f6.f23121k0.setAlpha(alpha);
                } else {
                    float f13 = i9;
                    canvas.drawLine(0.0f, f13, getMeasuredWidth(), f13, org.telegram.ui.ActionBar.f6.f23121k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ce1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        we1 we1Var = this.f37187u0;
        b81 b81Var = we1Var.f43765k0;
        if (b81Var != null) {
            this.f37185s0 = true;
            ViewGroup.LayoutParams layoutParams = b81Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i12 = we1Var.f43743a1;
            layoutParams.height = dp + i12;
            we1Var.f43765k0.setPadding(0, 0, 0, i12);
            this.f37185s0 = false;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof org.telegram.ui.ActionBar.k) {
                childAt.measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
                i13 = childAt.getMeasuredHeight();
            }
        }
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof org.telegram.ui.ActionBar.k)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i9, 0, i10, 0);
                } else {
                    i11 = i13;
                    measureChildWithMargins(childAt2, i9, 0, i10, i11);
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
        if (this.f37185s0) {
            return;
        }
        super.requestLayout();
    }
}
