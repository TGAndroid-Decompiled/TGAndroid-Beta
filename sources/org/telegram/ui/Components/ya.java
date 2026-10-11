package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ya extends uw0 {
    public final boolean f33157w0;
    public final boolean f33158x0;
    public final db f33159y0;

    public ya(db dbVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f33159y0 = dbVar;
        this.f33157w0 = z10;
        this.f33158x0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        db dbVar = this.f33159y0;
        dbVar.J(canvas, this);
        super.dispatchDraw(canvas);
        dbVar.I(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            db dbVar = this.f33159y0;
            drawable = ((org.telegram.ui.ActionBar.e3) dbVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                dbVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f33158x0) {
            this.f33159y0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ya.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        boolean z10;
        int i13;
        av avVar;
        int size = View.MeasureSpec.getSize(i11);
        db dbVar = this.f33159y0;
        dbVar.h = size;
        dbVar.F(i10, i11);
        if (this.f33157w0) {
            i11 = View.MeasureSpec.makeMeasureSpec(dbVar.h, 1073741824);
        }
        if (dbVar.Q != null) {
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            setMeasuredDimension(size2, size3);
            av avVar2 = dbVar.Q;
            if (avVar2 != null && !avVar2.N && AndroidUtilities.dp(20.0f) >= 0) {
                av avVar3 = dbVar.Q;
                if (!avVar3.f24592e && !avVar3.O) {
                    avVar3.j();
                }
            }
            int i14 = 0;
            if (AndroidUtilities.dp(20.0f) >= 0) {
                z10 = ((org.telegram.ui.ActionBar.e3) dbVar).keyboardVisible;
                if (!z10 && (avVar = dbVar.Q) != null) {
                    i13 = avVar.getEmojiPadding();
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
                    av avVar4 = dbVar.Q;
                    if (avVar4 != null && avVar4.l(childAt)) {
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
