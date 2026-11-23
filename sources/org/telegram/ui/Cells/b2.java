package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.x90;
public final class b2 extends org.telegram.ui.Components.o6 {
    public final int f30455s;
    public Object f30456w;

    public b2(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f30455s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f30455s) {
            case 1:
                super.invalidate();
                df0 df0Var = (df0) this.f30456w;
                ff0 ff0Var = df0Var.d;
                if (df0Var == ff0Var.f35218m1.getPinnedHeader()) {
                    ff0Var.f35218m1.invalidate();
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
        switch (this.f30455s) {
            case 0:
                super.onDraw(canvas);
                ((d2) this.f30456w).f();
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
                ((o51) this.f30456w).f38111b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f30456w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.m6.r1(0.15f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.L6, false)))) {
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
        switch (this.f30455s) {
            case 4:
                x90 x90Var = (x90) this.f30456w;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - x90Var.d.getPaint().measureText(x90Var.d.getText().toString())) - x90Var.f53795f.getPaint().measureText(x90Var.f53795f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f30455s) {
            case 1:
                ff0 ff0Var = ((df0) this.f30456w).d;
                p8 p8Var = ff0.M1;
                return ff0Var.f30176b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.f30455s) {
            case 1:
                ff0 ff0Var = ((df0) this.f30456w).d;
                p8 p8Var = ff0.M1;
                return ff0Var.f30176b.postDelayed(runnable, j3);
            default:
                return super.postDelayed(runnable, j3);
        }
    }

    public b2(FrameLayout frameLayout, Context context, int i7) {
        super(context, false, false, false);
        this.f30455s = i7;
        this.f30456w = frameLayout;
    }

    public b2(o51 o51Var, Context context) {
        super(context, true, true, true);
        this.f30455s = 2;
        this.f30456w = o51Var;
    }

    public b2(x90 x90Var, Context context) {
        super(context, false, true, true);
        this.f30455s = 4;
        this.f30456w = x90Var;
    }
}
