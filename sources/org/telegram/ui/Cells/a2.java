package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.v90;
public final class a2 extends org.telegram.ui.Components.h6 {
    public final int f29988s;
    public Object f29989w;

    public a2(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f29988s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f29988s) {
            case 1:
                super.invalidate();
                re0 re0Var = (re0) this.f29989w;
                te0 te0Var = re0Var.d;
                if (re0Var == te0Var.f39677m1.getPinnedHeader()) {
                    te0Var.f39677m1.invalidate();
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
        switch (this.f29988s) {
            case 0:
                super.onDraw(canvas);
                ((c2) this.f29989w).f();
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
                ((b51) this.f29989w).f33205b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f29989w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.j6.r1(0.15f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.L6, false)))) {
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
        switch (this.f29988s) {
            case 4:
                v90 v90Var = (v90) this.f29989w;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = org.telegram.messenger.g0.f23611q.x - org.telegram.messenger.g0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - v90Var.d.getPaint().measureText(v90Var.d.getText().toString())) - v90Var.f52168f.getPaint().measureText(v90Var.f52168f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f29988s) {
            case 1:
                te0 te0Var = ((re0) this.f29989w).d;
                n8 n8Var = te0.M1;
                return te0Var.f29682b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.f29988s) {
            case 1:
                te0 te0Var = ((re0) this.f29989w).d;
                n8 n8Var = te0.M1;
                return te0Var.f29682b.postDelayed(runnable, j3);
            default:
                return super.postDelayed(runnable, j3);
        }
    }

    public a2(FrameLayout frameLayout, Context context, int i7) {
        super(context, false, false, false);
        this.f29988s = i7;
        this.f29989w = frameLayout;
    }

    public a2(b51 b51Var, Context context) {
        super(context, true, true, true);
        this.f29988s = 2;
        this.f29989w = b51Var;
    }

    public a2(v90 v90Var, Context context) {
        super(context, false, true, true);
        this.f29988s = 4;
        this.f29989w = v90Var;
    }
}
