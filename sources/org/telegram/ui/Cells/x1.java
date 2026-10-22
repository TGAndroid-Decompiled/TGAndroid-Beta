package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.ob0;
public final class x1 extends org.telegram.ui.Components.q6 {
    public final int f23792s;
    public Object v;

    public x1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f23792s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f23792s) {
            case 1:
                super.invalidate();
                jh0 jh0Var = (jh0) this.v;
                lh0 lh0Var = jh0Var.d;
                if (jh0Var == lh0Var.f28166b.getPinnedHeader()) {
                    lh0Var.f28166b.invalidate();
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
        switch (this.f23792s) {
            case 0:
                super.onDraw(canvas);
                ((a2) this.v).f();
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
                ((i71) this.v).f27152b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.v;
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f23792s) {
            case 4:
                ob0 ob0Var = (ob0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - ob0Var.d.getPaint().measureText(ob0Var.d.getText().toString())) - ob0Var.f39823f.getPaint().measureText(ob0Var.f39823f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f23792s) {
            case 1:
                return lh0.q(((jh0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f23792s) {
            case 1:
                return lh0.s(((jh0) this.v).d).postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public x1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f23792s = i10;
        this.v = frameLayout;
    }

    public x1(i71 i71Var, Context context) {
        super(context, true, true, true);
        this.f23792s = 2;
        this.v = i71Var;
    }

    public x1(ob0 ob0Var, Context context) {
        super(context, false, true, true);
        this.f23792s = 4;
        this.v = ob0Var;
    }
}
