package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.r51;
import org.telegram.ui.vb0;

public final class v1 extends org.telegram.ui.Components.j6 {

    public final int f25789s;
    public Object v;

    public v1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f25789s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f25789s) {
            case 1:
                super.invalidate();
                ag0 ag0Var = (ag0) this.v;
                cg0 cg0Var = ag0Var.d;
                if (ag0Var == cg0Var.f27417b.getPinnedHeader()) {
                    cg0Var.f27417b.invalidate();
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25789s) {
            case 0:
                super.onDraw(canvas);
                ((y1) this.v).f();
                break;
            case 1:
            default:
                super.onDraw(canvas);
                break;
            case 2:
                canvas.save();
                canvas.translate(AndroidUtilities.dp(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(11.0f));
                ((r51) this.v).f32089b.draw(canvas);
                canvas.restore();
                break;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.v;
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().d() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f25789s) {
            case 4:
                vb0 vb0Var = (vb0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - vb0Var.d.getPaint().measureText(vb0Var.d.getText().toString())) - vb0Var.f43406f.getPaint().measureText(vb0Var.f43406f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f25789s) {
            case 1:
                return ((org.telegram.ui.ActionBar.e3) ((ag0) this.v).d).containerView.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f25789s) {
            case 1:
                return ((org.telegram.ui.ActionBar.e3) ((ag0) this.v).d).containerView.postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public v1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f25789s = i10;
        this.v = frameLayout;
    }

    public v1(r51 r51Var, Context context) {
        super(context, true, true, true);
        this.f25789s = 2;
        this.v = r51Var;
    }

    public v1(vb0 vb0Var, Context context) {
        super(context, false, true, true);
        this.f25789s = 4;
        this.v = vb0Var;
    }
}
