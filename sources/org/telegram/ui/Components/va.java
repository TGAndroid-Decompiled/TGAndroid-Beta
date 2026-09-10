package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class va extends aw0 {
    public final boolean f27903w0;
    public final boolean f27904x0;
    public final ab f27905y0;

    public va(ab abVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f27905y0 = abVar;
        this.f27903w0 = z10;
        this.f27904x0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ab abVar = this.f27905y0;
        abVar.I(canvas, this);
        super.dispatchDraw(canvas);
        abVar.H(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            ab abVar = this.f27905y0;
            drawable = ((org.telegram.ui.ActionBar.h3) abVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                abVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f27904x0) {
            this.f27905y0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.va.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        boolean z10;
        int i13;
        nu nuVar;
        int size = View.MeasureSpec.getSize(i11);
        ab abVar = this.f27905y0;
        abVar.h = size;
        abVar.D(i10, i11);
        if (this.f27903w0) {
            i11 = View.MeasureSpec.makeMeasureSpec(abVar.h, 1073741824);
        }
        if (abVar.Q != null) {
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            setMeasuredDimension(size2, size3);
            nu nuVar2 = abVar.Q;
            if (nuVar2 != null && !nuVar2.N && AndroidUtilities.dp(20.0f) >= 0) {
                nu nuVar3 = abVar.Q;
                if (!nuVar3.e && !nuVar3.O) {
                    nuVar3.j();
                }
            }
            int i14 = 0;
            if (AndroidUtilities.dp(20.0f) >= 0) {
                z10 = ((org.telegram.ui.ActionBar.h3) abVar).keyboardVisible;
                if (!z10 && (nuVar = abVar.Q) != null) {
                    i13 = nuVar.getEmojiPadding();
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
                    nu nuVar4 = abVar.Q;
                    if (nuVar4 != null && nuVar4.l(childAt)) {
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
