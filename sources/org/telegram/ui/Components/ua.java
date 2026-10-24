package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ua extends nw0 {
    public final boolean f31076w0;
    public final boolean f31077x0;
    public final za f31078y0;

    public ua(za zaVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f31078y0 = zaVar;
        this.f31076w0 = z10;
        this.f31077x0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        za zaVar = this.f31078y0;
        zaVar.I(canvas, this);
        super.dispatchDraw(canvas);
        zaVar.G(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            za zaVar = this.f31078y0;
            drawable = ((org.telegram.ui.ActionBar.h3) zaVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                zaVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f31077x0) {
            this.f31078y0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        boolean z10;
        int i13;
        ou ouVar;
        int size = View.MeasureSpec.getSize(i11);
        za zaVar = this.f31078y0;
        zaVar.h = size;
        zaVar.D(i10, i11);
        if (this.f31076w0) {
            i11 = View.MeasureSpec.makeMeasureSpec(zaVar.h, 1073741824);
        }
        if (zaVar.Q != null) {
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            setMeasuredDimension(size2, size3);
            ou ouVar2 = zaVar.Q;
            if (ouVar2 != null && !ouVar2.N && AndroidUtilities.dp(20.0f) >= 0) {
                ou ouVar3 = zaVar.Q;
                if (!ouVar3.e && !ouVar3.O) {
                    ouVar3.j();
                }
            }
            int i14 = 0;
            if (AndroidUtilities.dp(20.0f) >= 0) {
                z10 = ((org.telegram.ui.ActionBar.h3) zaVar).keyboardVisible;
                if (!z10 && (ouVar = zaVar.Q) != null) {
                    i13 = ouVar.getEmojiPadding();
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
                    ou ouVar4 = zaVar.Q;
                    if (ouVar4 != null && ouVar4.l(childAt)) {
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
