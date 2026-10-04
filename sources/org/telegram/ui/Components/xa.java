package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xa extends lw0 {
    public final boolean f32756w0;
    public final boolean f32757x0;
    public final cb f32758y0;

    public xa(cb cbVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f32758y0 = cbVar;
        this.f32756w0 = z10;
        this.f32757x0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        cb cbVar = this.f32758y0;
        cbVar.G(canvas, this);
        super.dispatchDraw(canvas);
        cbVar.F(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            cb cbVar = this.f32758y0;
            drawable = ((org.telegram.ui.ActionBar.f3) cbVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                cbVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f32757x0) {
            this.f32758y0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xa.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        boolean z10;
        int i13;
        mu muVar;
        int size = View.MeasureSpec.getSize(i11);
        cb cbVar = this.f32758y0;
        cbVar.h = size;
        cbVar.C(i10, i11);
        if (this.f32756w0) {
            i11 = View.MeasureSpec.makeMeasureSpec(cbVar.h, 1073741824);
        }
        if (cbVar.Q != null) {
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            setMeasuredDimension(size2, size3);
            mu muVar2 = cbVar.Q;
            if (muVar2 != null && !muVar2.N && AndroidUtilities.dp(20.0f) >= 0) {
                mu muVar3 = cbVar.Q;
                if (!muVar3.f28713e && !muVar3.O) {
                    muVar3.j();
                }
            }
            int i14 = 0;
            if (AndroidUtilities.dp(20.0f) >= 0) {
                z10 = ((org.telegram.ui.ActionBar.f3) cbVar).keyboardVisible;
                if (!z10 && (muVar = cbVar.Q) != null) {
                    i13 = muVar.getEmojiPadding();
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
                    mu muVar4 = cbVar.Q;
                    if (muVar4 != null && muVar4.l(childAt)) {
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
