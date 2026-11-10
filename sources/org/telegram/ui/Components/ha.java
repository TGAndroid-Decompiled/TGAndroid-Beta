package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class ha extends st0 {
    public final boolean f34253f0;
    public final boolean f34254g0;
    public final ma f34255h0;

    public ha(ma maVar, Context context, boolean z9, boolean z10) {
        super(context, null);
        this.f34255h0 = maVar;
        this.f34253f0 = z9;
        this.f34254g0 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ma maVar = this.f34255h0;
        maVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        maVar.V0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            ma maVar = this.f34255h0;
            if (y10 < maVar.f28702r0.getBounds().top) {
                maVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f34254g0) {
            this.f34255h0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        int i12;
        kt ktVar;
        int size = View.MeasureSpec.getSize(i10);
        ma maVar = this.f34255h0;
        maVar.f35904q1 = size;
        maVar.S0(i7, i10);
        if (this.f34253f0) {
            i10 = View.MeasureSpec.makeMeasureSpec(maVar.f35904q1, 1073741824);
        }
        if (maVar.K1 != null) {
            int size2 = View.MeasureSpec.getSize(i7);
            int size3 = View.MeasureSpec.getSize(i10);
            setMeasuredDimension(size2, size3);
            kt ktVar2 = maVar.K1;
            if (ktVar2 != null && !ktVar2.N && org.telegram.messenger.g0.L(20.0f) >= 0) {
                kt ktVar3 = maVar.K1;
                if (!ktVar3.f35436e && !ktVar3.O) {
                    ktVar3.j();
                }
            }
            int i13 = 0;
            if (org.telegram.messenger.g0.L(20.0f) >= 0) {
                if (!maVar.d && (ktVar = maVar.K1) != null) {
                    i12 = ktVar.getEmojiPadding();
                } else {
                    i12 = 0;
                }
                if (!org.telegram.messenger.g0.E) {
                    size3 -= i12;
                    i10 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                }
            }
            int i14 = i10;
            int childCount = getChildCount();
            while (i13 < childCount) {
                View childAt = getChildAt(i13);
                if (childAt != null && childAt.getVisibility() != 8) {
                    kt ktVar4 = maVar.K1;
                    if (ktVar4 != null && ktVar4.l(childAt)) {
                        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (org.telegram.messenger.g0.Q1()) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                            if (org.telegram.messenger.g0.Q1()) {
                                f10 = 200.0f;
                            } else {
                                f10 = 320.0f;
                            }
                            childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size3 - org.telegram.messenger.g0.f22561m)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - org.telegram.messenger.g0.f22561m), 1073741824));
                        }
                    } else {
                        i11 = i7;
                        measureChildWithMargins(childAt, i11, 0, i14, 0);
                        i13++;
                        i7 = i11;
                    }
                }
                i11 = i7;
                i13++;
                i7 = i11;
            }
            return;
        }
        super.onMeasure(i7, i10);
    }
}
