package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ta extends hv0 {
    public final boolean f32914s0;
    public final boolean f32915t0;
    public final xa f32916u0;

    public ta(xa xaVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f32916u0 = xaVar;
        this.f32914s0 = z10;
        this.f32915t0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        xa xaVar = this.f32916u0;
        xaVar.H(canvas, this);
        super.dispatchDraw(canvas);
        xaVar.G(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y8 = motionEvent.getY();
            xa xaVar = this.f32916u0;
            drawable = ((org.telegram.ui.ActionBar.f3) xaVar).shadowDrawable;
            if (y8 < drawable.getBounds().top) {
                xaVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f32915t0) {
            this.f32916u0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ta.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f9;
        boolean z10;
        int i13;
        au auVar;
        int size = View.MeasureSpec.getSize(i11);
        xa xaVar = this.f32916u0;
        xaVar.h = size;
        xaVar.D(i10, i11);
        if (this.f32914s0) {
            i11 = View.MeasureSpec.makeMeasureSpec(xaVar.h, 1073741824);
        }
        if (xaVar.L != null) {
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            setMeasuredDimension(size2, size3);
            au auVar2 = xaVar.L;
            if (auVar2 != null && !auVar2.J && AndroidUtilities.dp(20.0f) >= 0) {
                au auVar3 = xaVar.L;
                if (!auVar3.f26885e && !auVar3.K) {
                    auVar3.j();
                }
            }
            int i14 = 0;
            if (AndroidUtilities.dp(20.0f) >= 0) {
                z10 = ((org.telegram.ui.ActionBar.f3) xaVar).keyboardVisible;
                if (!z10 && (auVar = xaVar.L) != null) {
                    i13 = auVar.getEmojiPadding();
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
                    au auVar4 = xaVar.L;
                    if (auVar4 != null && auVar4.l(childAt)) {
                        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                            if (AndroidUtilities.isTablet()) {
                                f9 = 200.0f;
                            } else {
                                f9 = 320.0f;
                            }
                            childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f9), getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight)), 1073741824));
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
