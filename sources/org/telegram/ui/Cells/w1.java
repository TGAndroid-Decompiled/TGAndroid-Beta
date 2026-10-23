package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.ub0;
public final class w1 extends org.telegram.ui.Components.q6 {
    public final int f23894s;
    public Object v;

    public w1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f23894s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f23894s) {
            case 1:
                super.invalidate();
                mh0 mh0Var = (mh0) this.v;
                oh0 oh0Var = mh0Var.d;
                if (mh0Var == oh0Var.f29175b.getPinnedHeader()) {
                    oh0Var.f29175b.invalidate();
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
        switch (this.f23894s) {
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
                ((p71) this.v).f29464b.draw(canvas);
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
        switch (this.f23894s) {
            case 4:
                ub0 ub0Var = (ub0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - ub0Var.d.getPaint().measureText(ub0Var.d.getText().toString())) - ub0Var.f42361f.getPaint().measureText(ub0Var.f42361f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f23894s) {
            case 1:
                return oh0.q(((mh0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f23894s) {
            case 1:
                return oh0.r(((mh0) this.v).d).postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public w1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f23894s = i10;
        this.v = frameLayout;
    }

    public w1(p71 p71Var, Context context) {
        super(context, true, true, true);
        this.f23894s = 2;
        this.v = p71Var;
    }

    public w1(ub0 ub0Var, Context context) {
        super(context, false, true, true);
        this.f23894s = 4;
        this.v = ub0Var;
    }
}
