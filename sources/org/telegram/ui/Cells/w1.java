package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.o71;
import org.telegram.ui.ub0;
public final class w1 extends org.telegram.ui.Components.o6 {
    public final int f23895s;
    public Object v;

    public w1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f23895s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f23895s) {
            case 1:
                super.invalidate();
                lh0 lh0Var = (lh0) this.v;
                nh0 nh0Var = lh0Var.d;
                if (lh0Var == nh0Var.f28910b.getPinnedHeader()) {
                    nh0Var.f28910b.invalidate();
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
        int o12;
        switch (this.f23895s) {
            case 0:
                super.onDraw(canvas);
                ((z1) this.v).f();
                return;
            case 1:
            default:
                super.onDraw(canvas);
                return;
            case 2:
                canvas.save();
                canvas.translate(AndroidUtilities.dp(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(11.0f));
                ((o71) this.v).f29165b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.v;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (o12 = org.telegram.ui.ActionBar.k6.o1(0.15f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.L6, false)))) {
                    shapeDrawable.getPaint().setColor(o12);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f23895s) {
            case 4:
                ub0 ub0Var = (ub0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - ub0Var.d.getPaint().measureText(ub0Var.d.getText().toString())) - ub0Var.f42373f.getPaint().measureText(ub0Var.f42373f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f23895s) {
            case 1:
                return nh0.q(((lh0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f23895s) {
            case 1:
                return nh0.r(((lh0) this.v).d).postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public w1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f23895s = i10;
        this.v = frameLayout;
    }

    public w1(o71 o71Var, Context context) {
        super(context, true, true, true);
        this.f23895s = 2;
        this.v = o71Var;
    }

    public w1(ub0 ub0Var, Context context) {
        super(context, false, true, true);
        this.f23895s = 4;
        this.v = ub0Var;
    }
}
