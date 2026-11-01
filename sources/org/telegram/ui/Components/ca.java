package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class ca extends vu0 {
    public final boolean f25069f0;
    public final boolean f25070g0;
    public final ha f25071h0;

    public ca(ha haVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f25071h0 = haVar;
        this.f25069f0 = z10;
        this.f25070g0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ha haVar = this.f25071h0;
        haVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        haVar.V0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            ha haVar = this.f25071h0;
            if (y3 < haVar.f21613r0.getBounds().top) {
                haVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f25070g0) {
            this.f25071h0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        int i13;
        wt wtVar;
        int size = View.MeasureSpec.getSize(i11);
        ha haVar = this.f25071h0;
        haVar.f26726n1 = size;
        haVar.S0(i10, i11);
        if (this.f25069f0) {
            i11 = View.MeasureSpec.makeMeasureSpec(haVar.f26726n1, 1073741824);
        }
        if (haVar.H1 != null) {
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            setMeasuredDimension(size2, size3);
            wt wtVar2 = haVar.H1;
            if (wtVar2 != null && !wtVar2.N && org.telegram.messenger.i0.L(20.0f) >= 0) {
                wt wtVar3 = haVar.H1;
                if (!wtVar3.e && !wtVar3.O) {
                    wtVar3.j();
                }
            }
            int i14 = 0;
            if (org.telegram.messenger.i0.L(20.0f) >= 0) {
                if (!haVar.d && (wtVar = haVar.H1) != null) {
                    i13 = wtVar.getEmojiPadding();
                } else {
                    i13 = 0;
                }
                if (!org.telegram.messenger.i0.E) {
                    size3 -= i13;
                    i11 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                }
            }
            int i15 = i11;
            int childCount = getChildCount();
            while (i14 < childCount) {
                View childAt = getChildAt(i14);
                if (childAt != null && childAt.getVisibility() != 8) {
                    wt wtVar4 = haVar.H1;
                    if (wtVar4 != null && wtVar4.l(childAt)) {
                        if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (org.telegram.messenger.i0.Q1()) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                            if (org.telegram.messenger.i0.Q1()) {
                                f7 = 200.0f;
                            } else {
                                f7 = 320.0f;
                            }
                            childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(f7), getPaddingTop() + (size3 - org.telegram.messenger.i0.f16166m)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - org.telegram.messenger.i0.f16166m), 1073741824));
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
