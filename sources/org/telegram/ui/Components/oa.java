package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oa extends xu0 {
    public final boolean f31339s0;
    public final boolean f31340t0;
    public final sa f31341u0;

    public oa(sa saVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f31341u0 = saVar;
        this.f31339s0 = z10;
        this.f31340t0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sa saVar = this.f31341u0;
        saVar.H(canvas, this);
        super.dispatchDraw(canvas);
        saVar.G(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            sa saVar = this.f31341u0;
            drawable = ((org.telegram.ui.ActionBar.f3) saVar).shadowDrawable;
            if (y10 < drawable.getBounds().top) {
                saVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f31340t0) {
            this.f31341u0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oa.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        float f10;
        boolean z10;
        int i12;
        ut utVar;
        int size = View.MeasureSpec.getSize(i10);
        sa saVar = this.f31341u0;
        saVar.h = size;
        saVar.D(i9, i10);
        if (this.f31339s0) {
            i10 = View.MeasureSpec.makeMeasureSpec(saVar.h, 1073741824);
        }
        if (saVar.L != null) {
            int size2 = View.MeasureSpec.getSize(i9);
            int size3 = View.MeasureSpec.getSize(i10);
            setMeasuredDimension(size2, size3);
            ut utVar2 = saVar.L;
            if (utVar2 != null && !utVar2.J && AndroidUtilities.dp(20.0f) >= 0) {
                ut utVar3 = saVar.L;
                if (!utVar3.f33124e && !utVar3.K) {
                    utVar3.j();
                }
            }
            int i13 = 0;
            if (AndroidUtilities.dp(20.0f) >= 0) {
                z10 = ((org.telegram.ui.ActionBar.f3) saVar).keyboardVisible;
                if (!z10 && (utVar = saVar.L) != null) {
                    i12 = utVar.getEmojiPadding();
                } else {
                    i12 = 0;
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    size3 -= i12;
                    i10 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                }
            }
            int i14 = i10;
            int childCount = getChildCount();
            while (i13 < childCount) {
                View childAt = getChildAt(i13);
                if (childAt != null && childAt.getVisibility() != 8) {
                    ut utVar4 = saVar.L;
                    if (utVar4 != null && utVar4.l(childAt)) {
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
                        i11 = i9;
                        measureChildWithMargins(childAt, i11, 0, i14, 0);
                        i13++;
                        i9 = i11;
                    }
                }
                i11 = i9;
                i13++;
                i9 = i11;
            }
            return;
        }
        super.onMeasure(i9, i10);
    }
}
