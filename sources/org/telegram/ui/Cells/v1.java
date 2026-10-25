package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.y71;
import org.telegram.ui.rb0;
public final class v1 extends org.telegram.ui.Components.s6 {
    public final int f25572s;
    public Object v;

    public v1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f25572s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f25572s) {
            case 1:
                super.invalidate();
                lh0 lh0Var = (lh0) this.v;
                nh0 nh0Var = lh0Var.d;
                if (lh0Var == nh0Var.f30973b.getPinnedHeader()) {
                    nh0Var.f30973b.invalidate();
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
        switch (this.f25572s) {
            case 0:
                super.onDraw(canvas);
                ((y1) this.v).f();
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
                ((y71) this.v).f34967b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.v;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (o12 = org.telegram.ui.ActionBar.y6.o1(0.15f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.L6, false)))) {
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
        switch (this.f25572s) {
            case 4:
                rb0 rb0Var = (rb0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - rb0Var.d.getPaint().measureText(rb0Var.d.getText().toString())) - rb0Var.f43093f.getPaint().measureText(rb0Var.f43093f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f25572s) {
            case 1:
                return nh0.p(((lh0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f25572s) {
            case 1:
                return nh0.q(((lh0) this.v).d).postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public v1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f25572s = i10;
        this.v = frameLayout;
    }

    public v1(y71 y71Var, Context context) {
        super(context, true, true, true);
        this.f25572s = 2;
        this.v = y71Var;
    }

    public v1(rb0 rb0Var, Context context) {
        super(context, false, true, true);
        this.f25572s = 4;
        this.v = rb0Var;
    }
}
