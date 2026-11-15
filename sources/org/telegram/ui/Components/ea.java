package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class ea extends st0 {
    public final boolean f34251g0;
    public final boolean f34252h0;
    public final ja f34253i0;

    public ea(ja jaVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f34253i0 = jaVar;
        this.f34251g0 = z10;
        this.f34252h0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ja jaVar = this.f34253i0;
        jaVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        jaVar.V0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            ja jaVar = this.f34253i0;
            if (y10 < jaVar.f29715s0.getBounds().top) {
                jaVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f34252h0) {
            this.f34253i0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ea.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        int i12;
        rt rtVar;
        int size = View.MeasureSpec.getSize(i10);
        ja jaVar = this.f34253i0;
        jaVar.f35934r1 = size;
        jaVar.S0(i7, i10);
        if (this.f34251g0) {
            i10 = View.MeasureSpec.makeMeasureSpec(jaVar.f35934r1, 1073741824);
        }
        if (jaVar.L1 != null) {
            int size2 = View.MeasureSpec.getSize(i7);
            int size3 = View.MeasureSpec.getSize(i10);
            setMeasuredDimension(size2, size3);
            rt rtVar2 = jaVar.L1;
            if (rtVar2 != null && !rtVar2.O && org.telegram.messenger.g0.L(20.0f) >= 0) {
                rt rtVar3 = jaVar.L1;
                if (!rtVar3.f39056e && !rtVar3.P) {
                    rtVar3.j();
                }
            }
            int i13 = 0;
            if (org.telegram.messenger.g0.L(20.0f) >= 0) {
                if (!jaVar.d && (rtVar = jaVar.L1) != null) {
                    i12 = rtVar.getEmojiPadding();
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
                    rt rtVar4 = jaVar.L1;
                    if (rtVar4 != null && rtVar4.l(childAt)) {
                        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (org.telegram.messenger.g0.Q1()) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                            if (org.telegram.messenger.g0.Q1()) {
                                f10 = 200.0f;
                            } else {
                                f10 = 320.0f;
                            }
                            childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size3 - org.telegram.messenger.g0.f23605m)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - org.telegram.messenger.g0.f23605m), 1073741824));
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
