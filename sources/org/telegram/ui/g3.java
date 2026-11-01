package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
public final class g3 extends org.telegram.ui.Components.uk0 {
    public final int f37280e3 = 1;
    public final Object f37281f3;
    public final KeyEvent.Callback f37282g3;

    public g3(vh.t tVar, Context context) {
        super(context, null);
        this.f37282g3 = tVar;
        this.f37281f3 = new li.k(23);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.f37280e3;
        KeyEvent.Callback callback = this.f37282g3;
        Object obj = this.f37281f3;
        switch (i10) {
            case 0:
                HashSet hashSet = h4.f37647c1;
                ((h4) obj).l();
                super.dispatchDraw(canvas);
                return;
            case 1:
                Paint paint = (Paint) obj;
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) callback;
                org.telegram.ui.Components.t5 t5Var = cvVar.D1;
                if (t5Var != null && cvVar.B1 >= 0 && cvVar.C1 >= 0 && cvVar.f25247o1 != null && this.G) {
                    float e = t5Var.e(false, 0.0f);
                    if (e > 0.0f) {
                        int i11 = Integer.MAX_VALUE;
                        int i12 = Integer.MIN_VALUE;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= cvVar.B1 && R <= cvVar.C1) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.t6.r1(e, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21337ze, this.f31008n2)));
                            canvas.drawRect(0.0f, i11, getMeasuredWidth(), i12, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                vh.t tVar = (vh.t) callback;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (tVar.d * 255.0f), 31);
                canvas.save();
                float paddingLeft = getPaddingLeft();
                float width = getWidth() - getPaddingRight();
                canvas.clipRect(paddingLeft, 0.0f, width, getHeight());
                canvas.translate((1.0f - tVar.d) * width, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                canvas.save();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(paddingLeft, 0.0f, org.telegram.messenger.i0.L(12.0f) + paddingLeft, getHeight());
                li.k kVar = (li.k) obj;
                kVar.o(canvas, rectF, 0, tVar.d);
                rectF.set(width - org.telegram.messenger.i0.L(12.0f), 0.0f, width, getHeight());
                kVar.o(canvas, rectF, 2, tVar.d);
                canvas.restore();
                canvas.restore();
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f37280e3) {
            case 2:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f37280e3) {
            case 1:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void l0(int i10) {
        t3 t3Var;
        switch (this.f37280e3) {
            case 0:
                u3 u3Var = ((h4) this.f37281f3).K;
                if (u3Var != null && (t3Var = u3Var.f41775c) != null) {
                    t3Var.invalidate();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.f37282g3;
                cvVar.f25245m1.a();
                cvVar.f21587b.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f37280e3) {
            case 1:
                super.onDetachedFromWindow();
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.f37282g3;
                org.telegram.ui.Components.o5.release(cvVar.f21587b, cvVar.f25242i1);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.k1 k1Var;
        switch (this.f37280e3) {
            case 0:
                h4 h4Var = (h4) this.f37281f3;
                if (h4Var.d != null && h4Var.f39096b == null && (((k1Var = h4Var.H) == null || !k1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    h4Var.f39096b = null;
                    h4Var.d = null;
                    h4Var.f39098f = null;
                } else if (h4Var.d != null && h4Var.f39096b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof f4)) {
                    motionEvent2 = motionEvent;
                    h4.j(h4Var, (f4) getAdapter(), motionEvent2, h4Var.f39098f, h4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            case 1:
                kt p5 = kt.p();
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.f37282g3;
                boolean q6 = p5.q(motionEvent, cvVar.f25246n1, cvVar.E1, this.f31008n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q6) {
                    return false;
                }
                return true;
            default:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37280e3) {
            case 0:
                z1(z10, i10, i11, i12, i13);
                ((l3) this.f37282g3).J = -1.0f;
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ((org.telegram.ui.Components.cv) this.f37282g3).f25245m1.a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37280e3) {
            case 1:
                View.MeasureSpec.getSize(i10);
                ((org.telegram.ui.Components.cv) this.f37282g3).f25253u1.y1(40);
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        switch (this.f37280e3) {
            case 0:
                h4 h4Var = (h4) this.f37281f3;
                if (h4Var.d != null && h4Var.f39096b == null && (((k1Var = h4Var.H) == null || !k1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    h4Var.f39096b = null;
                    h4Var.d = null;
                    h4Var.f39098f = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public void z1(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 90 && childAt.getBottom() < getMeasuredHeight()) {
                int measuredHeight = getMeasuredHeight();
                childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                return;
            }
        }
    }

    public g3(org.telegram.ui.Components.cv cvVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f37282g3 = cvVar;
        this.f37281f3 = new Paint(1);
    }

    public g3(l3 l3Var, Context context) {
        super(context, null);
        this.f37282g3 = l3Var;
        this.f37281f3 = l3Var.L;
    }
}
