package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class za extends sw0 {
    public final boolean f33510w0;
    public final boolean f33511x0;
    public final eb f33512y0;

    public za(eb ebVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f33512y0 = ebVar;
        this.f33510w0 = z10;
        this.f33511x0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        eb ebVar = this.f33512y0;
        ebVar.J(canvas, this);
        super.dispatchDraw(canvas);
        ebVar.I(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            eb ebVar = this.f33512y0;
            drawable = ((org.telegram.ui.ActionBar.f3) ebVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                ebVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f33511x0) {
            this.f33512y0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        boolean z10;
        int i13;
        zu zuVar;
        int size = View.MeasureSpec.getSize(i11);
        eb ebVar = this.f33512y0;
        ebVar.h = size;
        ebVar.F(i10, i11);
        if (this.f33510w0) {
            i11 = View.MeasureSpec.makeMeasureSpec(ebVar.h, 1073741824);
        }
        if (ebVar.Q != null) {
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            setMeasuredDimension(size2, size3);
            zu zuVar2 = ebVar.Q;
            if (zuVar2 != null && !zuVar2.N && AndroidUtilities.dp(20.0f) >= 0) {
                zu zuVar3 = ebVar.Q;
                if (!zuVar3.f33652e && !zuVar3.O) {
                    zuVar3.j();
                }
            }
            int i14 = 0;
            if (AndroidUtilities.dp(20.0f) >= 0) {
                z10 = ((org.telegram.ui.ActionBar.f3) ebVar).keyboardVisible;
                if (!z10 && (zuVar = ebVar.Q) != null) {
                    i13 = zuVar.getEmojiPadding();
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
                    zu zuVar4 = ebVar.Q;
                    if (zuVar4 != null && zuVar4.l(childAt)) {
                        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                            if (AndroidUtilities.isTablet()) {
                                f7 = 200.0f;
                            } else {
                                f7 = 320.0f;
                            }
                            childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(f7), getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight)), 1073741824));
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
