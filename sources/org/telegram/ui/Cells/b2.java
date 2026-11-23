package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.w90;
public final class b2 extends org.telegram.ui.Components.n6 {
    public final int f30509s;
    public Object f30510w;

    public b2(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f30509s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f30509s) {
            case 1:
                super.invalidate();
                cf0 cf0Var = (cf0) this.f30510w;
                ef0 ef0Var = cf0Var.d;
                if (cf0Var == ef0Var.f34702m1.getPinnedHeader()) {
                    ef0Var.f34702m1.invalidate();
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
        switch (this.f30509s) {
            case 0:
                super.onDraw(canvas);
                ((d2) this.f30510w).f();
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
                ((n51) this.f30510w).f37677b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f30510w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.n6.r1(0.15f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.L6, false)))) {
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
        switch (this.f30509s) {
            case 4:
                w90 w90Var = (w90) this.f30510w;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - w90Var.d.getPaint().measureText(w90Var.d.getText().toString())) - w90Var.f53208f.getPaint().measureText(w90Var.f53208f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f30509s) {
            case 1:
                ef0 ef0Var = ((cf0) this.f30510w).d;
                o8 o8Var = ef0.M1;
                return ef0Var.f30226b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.f30509s) {
            case 1:
                ef0 ef0Var = ((cf0) this.f30510w).d;
                o8 o8Var = ef0.M1;
                return ef0Var.f30226b.postDelayed(runnable, j3);
            default:
                return super.postDelayed(runnable, j3);
        }
    }

    public b2(FrameLayout frameLayout, Context context, int i7) {
        super(context, false, false, false);
        this.f30509s = i7;
        this.f30510w = frameLayout;
    }

    public b2(n51 n51Var, Context context) {
        super(context, true, true, true);
        this.f30509s = 2;
        this.f30510w = n51Var;
    }

    public b2(w90 w90Var, Context context) {
        super(context, false, true, true);
        this.f30509s = 4;
        this.f30510w = w90Var;
    }
}
