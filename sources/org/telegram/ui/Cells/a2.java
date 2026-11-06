package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.u90;
public final class a2 extends org.telegram.ui.Components.j6 {
    public final int f28866s;
    public Object f28867w;

    public a2(Context context, boolean z9, boolean z10, boolean z11) {
        super(context, z9, z10, z11);
        this.f28866s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f28866s) {
            case 1:
                super.invalidate();
                oe0 oe0Var = (oe0) this.f28867w;
                qe0 qe0Var = oe0Var.d;
                if (oe0Var == qe0Var.f37274i1.getPinnedHeader()) {
                    qe0Var.f37274i1.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int r12;
        switch (this.f28866s) {
            case 0:
                super.onDraw(canvas);
                ((c2) this.f28867w).f();
                return;
            case 1:
            default:
                super.onDraw(canvas);
                return;
            case 2:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(11.0f));
                ((x41) this.f28867w).f40162b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f28867w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.L6, false)))) {
                    shapeDrawable.getPaint().setColor(r12);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f28866s) {
            case 4:
                u90 u90Var = (u90) this.f28867w;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = org.telegram.messenger.g0.f22537q.x - org.telegram.messenger.g0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - u90Var.d.getPaint().measureText(u90Var.d.getText().toString())) - u90Var.f50353f.getPaint().measureText(u90Var.f50353f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f28866s) {
            case 1:
                qe0 qe0Var = ((oe0) this.f28867w).d;
                o8 o8Var = qe0.I1;
                return qe0Var.f28615b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.f28866s) {
            case 1:
                qe0 qe0Var = ((oe0) this.f28867w).d;
                o8 o8Var = qe0.I1;
                return qe0Var.f28615b.postDelayed(runnable, j3);
            default:
                return super.postDelayed(runnable, j3);
        }
    }

    public a2(FrameLayout frameLayout, Context context, int i7) {
        super(context, false, false, false);
        this.f28866s = i7;
        this.f28867w = frameLayout;
    }

    public a2(x41 x41Var, Context context) {
        super(context, true, true, true);
        this.f28866s = 2;
        this.f28867w = x41Var;
    }

    public a2(u90 u90Var, Context context) {
        super(context, false, true, true);
        this.f28866s = 4;
        this.f28867w = u90Var;
    }
}
