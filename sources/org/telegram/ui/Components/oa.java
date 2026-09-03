package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oa extends qv0 {
    public final boolean f27504t0;
    public final boolean f27505u0;
    public final sa f27506v0;

    public oa(sa saVar, Context context, boolean z4, boolean z10) {
        super(context, null);
        this.f27506v0 = saVar;
        this.f27504t0 = z4;
        this.f27505u0 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sa saVar = this.f27506v0;
        saVar.H(canvas, this);
        super.dispatchDraw(canvas);
        saVar.G(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            sa saVar = this.f27506v0;
            drawable = ((org.telegram.ui.ActionBar.g3) saVar).shadowDrawable;
            if (y10 < drawable.getBounds().top) {
                saVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f27505u0) {
            this.f27506v0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f10;
        boolean z4;
        int i13;
        cu cuVar;
        int size = View.MeasureSpec.getSize(i11);
        sa saVar = this.f27506v0;
        saVar.h = size;
        saVar.D(i10, i11);
        if (this.f27504t0) {
            i11 = View.MeasureSpec.makeMeasureSpec(saVar.h, 1073741824);
        }
        if (saVar.M != null) {
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            setMeasuredDimension(size2, size3);
            cu cuVar2 = saVar.M;
            if (cuVar2 != null && !cuVar2.K && AndroidUtilities.dp(20.0f) >= 0) {
                cu cuVar3 = saVar.M;
                if (!cuVar3.e && !cuVar3.L) {
                    cuVar3.j();
                }
            }
            int i14 = 0;
            if (AndroidUtilities.dp(20.0f) >= 0) {
                z4 = ((org.telegram.ui.ActionBar.g3) saVar).keyboardVisible;
                if (!z4 && (cuVar = saVar.M) != null) {
                    i13 = cuVar.getEmojiPadding();
                } else {
                    i13 = 0;
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    size3 -= i13;
                    i11 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                }
            }
            int i15 = i11;
            int childCount = getChildCount();
            while (i14 < childCount) {
                View childAt = getChildAt(i14);
                if (childAt != null && childAt.getVisibility() != 8) {
                    cu cuVar4 = saVar.M;
                    if (cuVar4 != null && cuVar4.l(childAt)) {
                        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                            if (AndroidUtilities.isTablet()) {
                                f10 = 200.0f;
                            } else {
                                f10 = 320.0f;
                            }
                            childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f10), getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight), 1073741824));
                        }
                    } else {
                        i12 = i10;
                        measureChildWithMargins(childAt, i12, 0, i15, 0);
                        i14++;
                        i10 = i12;
                    }
                }
                i12 = i10;
                i14++;
                i10 = i12;
            }
            return;
        }
        super.onMeasure(i10, i11);
    }
}
