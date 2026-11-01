package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class mb0 extends org.telegram.ui.Components.uk0 {
    public final int f39496e3;
    public final Object f39497f3;

    public mb0(KeyEvent.Callback callback, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.f39496e3 = i10;
        this.f39497f3 = callback;
    }

    @Override
    public boolean H0(View view, float f7, float f10) {
        switch (this.f39496e3) {
            case 3:
                ((rh.t0) this.f39497f3).getClass();
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override
    public Integer V0(int i10) {
        int i11;
        switch (this.f39496e3) {
            case 2:
                i11 = ((SessionsActivity) this.f39497f3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.p6 p6Var = this.f31008n2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p7, p6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var));
            case 3:
            default:
                return super.V0(i10);
            case 4:
                return 0;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int L;
        ArrayList arrayList;
        View view;
        th.h0 h0Var;
        switch (this.f39496e3) {
            case 0:
                xb0 xb0Var = (xb0) this.f39497f3;
                RectF rectF = xb0Var.f43303b0;
                if (xb0Var.f43301a0 != null) {
                    int L2 = org.telegram.messenger.i0.L(12.0f);
                    xb0Var.f43301a0.setBounds(-L2, xb0Var.f43305c0 - L2, getWidth() + L2, getHeight() + L2);
                    xb0Var.f43301a0.draw(canvas);
                    int i10 = xb0Var.O0;
                    if (i10 == 0 || i10 == 1) {
                        int L3 = org.telegram.messenger.i0.L(36.0f);
                        rectF.set((getWidth() - L3) / 2.0f, org.telegram.messenger.i0.L(10.0f) + xb0Var.f43305c0, (getWidth() + L3) / 2.0f, org.telegram.messenger.i0.L(4.0f) + L);
                        org.telegram.ui.ActionBar.t6.f21218t0.setColor(xb0Var.getThemedColor(org.telegram.ui.ActionBar.t6.wj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21218t0);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                qn0 qn0Var = (qn0) this.f39497f3;
                Paint paint = qn0Var.f40862x;
                RectF rectF2 = qn0Var.f40860s;
                RectF rectF3 = qn0Var.f40859r;
                RectF rectF4 = qn0Var.f40858n;
                s4.a0 a0Var = qn0Var.f40855b;
                if (!qn0Var.f40857f.isEmpty()) {
                    float e = qn0Var.e.e(false, qn0Var.d);
                    double d = e;
                    int j10 = Utilities.j((int) Math.floor(d), arrayList.size() - 1, 0);
                    int j11 = Utilities.j((int) Math.ceil(d), arrayList.size() - 1, 0);
                    View m10 = a0Var.m(j10);
                    View m11 = a0Var.m(j11);
                    if (m10 != null || m11 != null) {
                        if (m10 != null) {
                            view = m10;
                        } else {
                            view = m11;
                        }
                        rectF4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF3.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        org.telegram.messenger.i0.Z1(rectF4, rectF3, e - j10, rectF2);
                        paint.setColor(qn0Var.f40863y);
                        float height = rectF2.height() / 2.0f;
                        canvas.drawRoundRect(rectF2, height, height, paint);
                        super.dispatchDraw(canvas);
                        return;
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                th.p1 p1Var = (th.p1) this.f39497f3;
                int i11 = -1;
                if (!p1Var.f49102f0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < getChildCount()) {
                            View childAt = getChildAt(i12);
                            if ((childAt instanceof th.c0) && (h0Var = ((th.c0) childAt).K) != null) {
                                i11 = h0Var.f49020a;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                if (i11 > p1Var.F) {
                    p1Var.F = i11;
                    th.a aVar = p1Var.f49368i0.G1;
                    if (aVar != null) {
                        aVar.setCount(p1Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                org.telegram.ui.Components.qe qeVar = (org.telegram.ui.Components.qe) this.f39497f3;
                mb0 mb0Var = qeVar.f54030c;
                if (mb0Var.getLayoutManager() != null && mb0Var.getAdapter() != null && mb0Var.getAdapter().b() != 0) {
                    float L4 = qeVar.h - org.telegram.messenger.i0.L(8.0f);
                    qeVar.e = L4 - org.telegram.messenger.i0.L(16.0f);
                    vg.f fVar = qeVar.f54033r;
                    if (fVar != null) {
                        fVar.draw(canvas);
                    }
                    RectF rectF5 = org.telegram.messenger.i0.P;
                    rectF5.set((getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(12.0f), L4 - org.telegram.messenger.i0.L(4.0f), (getMeasuredWidth() / 2.0f) + org.telegram.messenger.i0.L(12.0f), L4);
                    canvas.drawRoundRect(rectF5, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), qeVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f39496e3) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((xb0) this.f39497f3).f43305c0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                if (((th.p1) this.f39497f3).f49102f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (((vh.k2) this.f39497f3).K) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f39496e3) {
            case 1:
                super.invalidate();
                bn0 bn0Var = ((qn0) this.f39497f3).F;
                if (bn0Var != null) {
                    bn0Var.run();
                    return;
                }
                return;
            case 4:
                super.invalidate();
                ((th.p1) this.f39497f3).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f39496e3) {
            case 5:
                kt p5 = kt.p();
                vh.g1 g1Var = (vh.g1) this.f39497f3;
                boolean q6 = p5.q(motionEvent, g1Var.f51199b, g1Var.f51201f, this.f31008n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q6) {
                    return false;
                }
                return true;
            case 6:
                if (((vh.k2) this.f39497f3).K) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f39496e3) {
            case 3:
                ((rh.t0) this.f39497f3).I0();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39496e3) {
            case 4:
                int size = View.MeasureSpec.getSize(i10);
                View.MeasureSpec.getSize(i11);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public mb0(Object obj, Context context, int i10) {
        super(context, null);
        this.f39496e3 = i10;
        this.f39497f3 = obj;
    }
}
