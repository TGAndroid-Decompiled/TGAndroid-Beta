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
public final class of1 extends org.telegram.ui.Components.yw0 {
    public boolean f40704w0;
    public final Paint f40705x0;
    public final hg1 f40706y0;

    public of1(hg1 hg1Var, Context context) {
        super(context, null);
        this.f40706y0 = hg1Var;
        setWillNotDraw(false);
        this.f40705x0 = new Paint();
    }

    @Override
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            hg1 hg1Var = this.f40706y0;
            if (hg1Var.f38394g1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f7);
                hg1Var.f38394g1.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
            hg1 hg1Var = this.f40706y0;
            if (i10 < hg1Var.N.getChildCount()) {
                View childAt = hg1Var.N.getChildAt(i10);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int save = canvas.save();
                    canvas.translate(childAt.getX() + hg1Var.N.getX(), childAt.getY() + hg1Var.N.getY() + getY());
                    if (arrayList != null && (childAt instanceof org.telegram.ui.Components.vw0)) {
                        arrayList.add((org.telegram.ui.Components.vw0) childAt);
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
        hg1 hg1Var = this.f40706y0;
        fh.d dVar = hg1Var.f38396h1;
        fh.d dVar2 = hg1Var.f38394g1;
        ah.h hVar = hg1Var.f38392f1;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            hg1Var.x0();
            vy vyVar = hg1Var.M0;
            if (vyVar != null) {
                measuredWidth = vyVar.fragmentView.getMeasuredWidth();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            vy vyVar2 = hg1Var.M0;
            if (vyVar2 != null) {
                measuredHeight = vyVar2.fragmentView.getMeasuredHeight();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (dVar2 != null && !dVar2.f9937n && dVar2.f(measuredWidth, measuredHeight)) {
                hVar.b(dVar2.a(measuredWidth, measuredHeight), -3);
                dVar2.c();
            }
            if (dVar != null && !dVar.f9937n && dVar.f(measuredWidth, measuredHeight)) {
                hVar.b(dVar.a(measuredWidth, measuredHeight), -2);
                dVar.c();
            }
        }
        super.dispatchDraw(canvas);
        if (hg1Var.isInPreviewMode()) {
            int themedColor = hg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6);
            Paint paint = this.f40705x0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (hg1Var.W * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), org.telegram.ui.ActionBar.h6.f20681k0);
        } else {
            canvas2 = canvas;
        }
        if (hg1Var.M0 == null) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, hg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6), hg1Var.f38389e1);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        hg1 hg1Var = this.f40706y0;
        kVar = ((org.telegram.ui.ActionBar.m2) hg1Var).actionBar;
        if (view == kVar && !hg1Var.isInPreviewMode()) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) hg1Var).actionBar;
            float y3 = kVar2.getY();
            kVar3 = ((org.telegram.ui.ActionBar.m2) hg1Var).actionBar;
            float height = kVar3.getHeight();
            org.telegram.ui.Components.t91 t91Var = hg1Var.f38378a1;
            if (t91Var != null && t91Var.getVisibility() != 8) {
                f7 = hg1Var.f38378a1.getMeasuredHeight();
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) (y3 + ((int) ((f7 * hg1Var.W) + height)));
            ((ActionBarLayout) hg1Var.getParentLayout()).p(canvas, (int) ((1.0f - hg1Var.W) * 255.0f), i10);
            float f10 = hg1Var.W;
            if (f10 > 0.0f) {
                if (f10 < 1.0f) {
                    int alpha = org.telegram.ui.ActionBar.h6.f20681k0.getAlpha();
                    org.telegram.ui.ActionBar.h6.f20681k0.setAlpha((int) (alpha * hg1Var.W));
                    float f11 = i10;
                    canvas.drawLine(0.0f, f11, getMeasuredWidth(), f11, org.telegram.ui.ActionBar.h6.f20681k0);
                    org.telegram.ui.ActionBar.h6.f20681k0.setAlpha(alpha);
                } else {
                    float f12 = i10;
                    canvas.drawLine(0.0f, f12, getMeasuredWidth(), f12, org.telegram.ui.ActionBar.h6.f20681k0);
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.of1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        hg1 hg1Var = this.f40706y0;
        z51 z51Var = hg1Var.f38407o0;
        if (z51Var != null) {
            this.f40704w0 = true;
            ViewGroup.LayoutParams layoutParams = z51Var.getLayoutParams();
            int dp = AndroidUtilities.dp(51.0f);
            int i13 = hg1Var.f38389e1;
            layoutParams.height = dp + i13;
            hg1Var.f38407o0.setPadding(0, 0, 0, i13);
            this.f40704w0 = false;
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
        if (this.f40704w0) {
            return;
        }
        super.requestLayout();
    }
}
