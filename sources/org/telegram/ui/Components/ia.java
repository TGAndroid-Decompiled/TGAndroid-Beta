package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class ia extends rt0 {
    public final boolean f34609f0;
    public final boolean f34610g0;
    public final na f34611h0;

    public ia(na naVar, Context context, boolean z9, boolean z10) {
        super(context, null);
        this.f34611h0 = naVar;
        this.f34609f0 = z9;
        this.f34610g0 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        na naVar = this.f34611h0;
        naVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        naVar.V0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            na naVar = this.f34611h0;
            if (y10 < naVar.f28646r0.getBounds().top) {
                naVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f34610g0) {
            this.f34611h0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ia.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        int i12;
        lt ltVar;
        int size = View.MeasureSpec.getSize(i10);
        na naVar = this.f34611h0;
        naVar.n1 = size;
        naVar.S0(i7, i10);
        if (this.f34609f0) {
            i10 = View.MeasureSpec.makeMeasureSpec(naVar.n1, 1073741824);
        }
        if (naVar.H1 != null) {
            int size2 = View.MeasureSpec.getSize(i7);
            int size3 = View.MeasureSpec.getSize(i10);
            setMeasuredDimension(size2, size3);
            lt ltVar2 = naVar.H1;
            if (ltVar2 != null && !ltVar2.N && org.telegram.messenger.g0.L(20.0f) >= 0) {
                lt ltVar3 = naVar.H1;
                if (!ltVar3.f35780e && !ltVar3.O) {
                    ltVar3.j();
                }
            }
            int i13 = 0;
            if (org.telegram.messenger.g0.L(20.0f) >= 0) {
                if (!naVar.d && (ltVar = naVar.H1) != null) {
                    i12 = ltVar.getEmojiPadding();
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
                    lt ltVar4 = naVar.H1;
                    if (ltVar4 != null && ltVar4.l(childAt)) {
                        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (org.telegram.messenger.g0.Q1()) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                            if (org.telegram.messenger.g0.Q1()) {
                                f10 = 200.0f;
                            } else {
                                f10 = 320.0f;
                            }
                            childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size3 - org.telegram.messenger.g0.f22557m)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - org.telegram.messenger.g0.f22557m), 1073741824));
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
