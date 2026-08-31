package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.dc0;
public final class w1 extends org.telegram.ui.Components.k6 {
    public final int f24344s;
    public Object v;

    public w1(Context context, boolean z4, boolean z10, boolean z11) {
        super(context, z4, z10, z11);
        this.f24344s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f24344s) {
            case 1:
                super.invalidate();
                vg0 vg0Var = (vg0) this.v;
                xg0 xg0Var = vg0Var.d;
                if (vg0Var == xg0Var.f33072b.getPinnedHeader()) {
                    xg0Var.f33072b.invalidate();
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
        switch (this.f24344s) {
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
                ((p61) this.v).f29977b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.v;
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().d() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f24344s) {
            case 4:
                dc0 dc0Var = (dc0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - dc0Var.d.getPaint().measureText(dc0Var.d.getText().toString())) - dc0Var.f36181f.getPaint().measureText(dc0Var.f36181f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f24344s) {
            case 1:
                return xg0.p(((vg0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f24344s) {
            case 1:
                return xg0.q(((vg0) this.v).d).postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public w1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f24344s = i10;
        this.v = frameLayout;
    }

    public w1(p61 p61Var, Context context) {
        super(context, true, true, true);
        this.f24344s = 2;
        this.v = p61Var;
    }

    public w1(dc0 dc0Var, Context context) {
        super(context, false, true, true);
        this.f24344s = 4;
        this.v = dc0Var;
    }
}
