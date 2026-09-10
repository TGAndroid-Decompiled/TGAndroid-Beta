package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.lc0;
public final class w1 extends org.telegram.ui.Components.o6 {
    public final int f20649s;
    public Object v;

    public w1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f20649s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f20649s) {
            case 1:
                super.invalidate();
                xg0 xg0Var = (xg0) this.v;
                zg0 zg0Var = xg0Var.d;
                if (xg0Var == zg0Var.f29678b.getPinnedHeader()) {
                    zg0Var.f29678b.invalidate();
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
        switch (this.f20649s) {
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
                ((y61) this.v).f29258b.draw(canvas);
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
        switch (this.f20649s) {
            case 4:
                lc0 lc0Var = (lc0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - lc0Var.d.getPaint().measureText(lc0Var.d.getText().toString())) - lc0Var.f34645f.getPaint().measureText(lc0Var.f34645f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f20649s) {
            case 1:
                return zg0.p(((xg0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.f20649s) {
            case 1:
                return zg0.q(((xg0) this.v).d).postDelayed(runnable, j3);
            default:
                return super.postDelayed(runnable, j3);
        }
    }

    public w1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f20649s = i10;
        this.v = frameLayout;
    }

    public w1(y61 y61Var, Context context) {
        super(context, true, true, true);
        this.f20649s = 2;
        this.v = y61Var;
    }

    public w1(lc0 lc0Var, Context context) {
        super(context, false, true, true);
        this.f20649s = 4;
        this.v = lc0Var;
    }
}
