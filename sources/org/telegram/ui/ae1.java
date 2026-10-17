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
public final class ae1 extends org.telegram.ui.Components.jw0 {
    public boolean f35415w0;
    public final Paint f35416x0;
    public final te1 f35417y0;

    public ae1(te1 te1Var, Context context) {
        super(context, null);
        this.f35417y0 = te1Var;
        setWillNotDraw(false);
        this.f35416x0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            te1 te1Var = this.f35417y0;
            if (te1Var.f41696g1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                te1Var.f41696g1.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
            te1 te1Var = this.f35417y0;
            if (i10 < te1Var.N.getChildCount()) {
                View childAt = te1Var.N.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + te1Var.N.getX(), childAt.getY() + te1Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.gw0)) {
                        arrayList.add((org.telegram.ui.Components.gw0) childAt);
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
        te1 te1Var = this.f35417y0;
        gh.d dVar = te1Var.f41698h1;
        gh.d dVar2 = te1Var.f41696g1;
        bh.f fVar = te1Var.f41694f1;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            te1Var.x0();
            ey eyVar = te1Var.M0;
            if (eyVar != null) {
                measuredWidth = eyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            ey eyVar2 = te1Var.M0;
            if (eyVar2 != null) {
                measuredHeight = eyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f11061n && dVar2.g(measuredWidth, measuredHeight)) {
                fVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.c();
            }
            if (dVar != null && !dVar.f11061n && dVar.g(measuredWidth, measuredHeight)) {
                fVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.c();
            }
        }
        super.dispatchDraw(canvas);
        if (te1Var.isInPreviewMode()) {
            int themedColor = te1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6);
            Paint paint = this.f35416x0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (te1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.h6.f21107k0);
        } else {
            canvas2 = canvas;
        }
        if (te1Var.M0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, te1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6), te1Var.f41691e1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        te1 te1Var = this.f35417y0;
        kVar = ((org.telegram.ui.ActionBar.n2) te1Var).actionBar;
        if (view == kVar && !te1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) te1Var).actionBar;
            float y3 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.n2) te1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.b91 b91Var = te1Var.f41681a1;
            if (b91Var != null && b91Var.getVisibility() != 8) {
                f7 = te1Var.f41681a1.getMeasuredHeight();
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) (y3 + ((int) ((f7 * te1Var.W) + height)));
            ((ActionBarLayout) te1Var.getParentLayout()).p(canvas, (int) ((1.0f - te1Var.W) * 255.0f), i10);
            float f10 = te1Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.h6.f21107k0.getAlpha();
                    org.telegram.ui.ActionBar.h6.f21107k0.setAlpha((int) (alpha * te1Var.W));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.h6.f21107k0);
                    org.telegram.ui.ActionBar.h6.f21107k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.h6.f21107k0);
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ae1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        te1 te1Var = this.f35417y0;
        l41 l41Var = te1Var.f41709o0;
        if (l41Var != null) {
            this.f35415w0 = true;
            ViewGroup.LayoutParams layoutParams = l41Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = te1Var.f41691e1;
            layoutParams.height = dp + i13;
            te1Var.f41709o0.setPadding(0, 0, 0, i13);
            this.f35415w0 = false;
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
        if (this.f35415w0) {
            return;
        }
        super.requestLayout();
    }
}
