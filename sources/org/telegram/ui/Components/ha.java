package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class ha extends qt0 {
    public final boolean f34355g0;
    public final boolean f34356h0;
    public final ma f34357i0;

    public ha(ma maVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f34357i0 = maVar;
        this.f34355g0 = z10;
        this.f34356h0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ma maVar = this.f34357i0;
        maVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        maVar.V0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y9 = motionEvent.getY();
            ma maVar = this.f34357i0;
            if (y9 < maVar.f28616s0.getBounds().top) {
                maVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f34356h0) {
            this.f34357i0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean r12, int r13, int r14, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        float f10;
        int i12;
        jt jtVar;
        int size = View.MeasureSpec.getSize(i10);
        ma maVar = this.f34357i0;
        maVar.f36104o1 = size;
        maVar.S0(i3, i10);
        if (this.f34355g0) {
            i10 = View.MeasureSpec.makeMeasureSpec(maVar.f36104o1, 1073741824);
        }
        if (maVar.I1 != null) {
            int size2 = View.MeasureSpec.getSize(i3);
            int size3 = View.MeasureSpec.getSize(i10);
            setMeasuredDimension(size2, size3);
            jt jtVar2 = maVar.I1;
            if (jtVar2 != null && !jtVar2.O && org.telegram.messenger.g0.L(20.0f) >= 0) {
                jt jtVar3 = maVar.I1;
                if (!jtVar3.f35191e && !jtVar3.P) {
                    jtVar3.j();
                }
            }
            int i13 = 0;
            if (org.telegram.messenger.g0.L(20.0f) >= 0) {
                if (!maVar.d && (jtVar = maVar.I1) != null) {
                    i12 = jtVar.getEmojiPadding();
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
                    jt jtVar4 = maVar.I1;
                    if (jtVar4 != null && jtVar4.l(childAt)) {
                        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (org.telegram.messenger.g0.Q1()) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                            if (org.telegram.messenger.g0.Q1()) {
                                f10 = 200.0f;
                            } else {
                                f10 = 320.0f;
                            }
                            childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(f10), getPaddingTop() + (size3 - org.telegram.messenger.g0.f22602m)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - org.telegram.messenger.g0.f22602m), 1073741824));
                        }
                    } else {
                        i11 = i3;
                        measureChildWithMargins(childAt, i11, 0, i14, 0);
                        i13++;
                        i3 = i11;
                    }
                }
                i11 = i3;
                i13++;
                i3 = i11;
            }
            return;
        }
        super.onMeasure(i3, i10);
    }
}
