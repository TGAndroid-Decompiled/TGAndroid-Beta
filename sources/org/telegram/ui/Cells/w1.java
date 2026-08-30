package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.tg0;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.cc0;
public final class w1 extends org.telegram.ui.Components.k6 {
    public final int f22528s;
    public Object v;

    public w1(Context context, boolean z4, boolean z10, boolean z11) {
        super(context, z4, z10, z11);
        this.f22528s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f22528s) {
            case 1:
                super.invalidate();
                tg0 tg0Var = (tg0) this.v;
                vg0 vg0Var = tg0Var.d;
                if (tg0Var == vg0Var.f29461b.getPinnedHeader()) {
                    vg0Var.f29461b.invalidate();
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
        switch (this.f22528s) {
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
                ((n61) this.v).f27206b.draw(canvas);
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
        switch (this.f22528s) {
            case 4:
                cc0 cc0Var = (cc0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - cc0Var.d.getPaint().measureText(cc0Var.d.getText().toString())) - cc0Var.f33263f.getPaint().measureText(cc0Var.f33263f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f22528s) {
            case 1:
                return vg0.p(((tg0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f22528s) {
            case 1:
                return vg0.q(((tg0) this.v).d).postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public w1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f22528s = i10;
        this.v = frameLayout;
    }

    public w1(n61 n61Var, Context context) {
        super(context, true, true, true);
        this.f22528s = 2;
        this.v = n61Var;
    }

    public w1(cc0 cc0Var, Context context) {
        super(context, false, true, true);
        this.f22528s = 4;
        this.v = cc0Var;
    }
}
