package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.ic0;
public final class x1 extends org.telegram.ui.Components.p6 {
    public final int f21841s;
    public Object v;

    public x1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f21841s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f21841s) {
            case 1:
                super.invalidate();
                ah0 ah0Var = (ah0) this.v;
                ch0 ch0Var = ah0Var.d;
                if (ah0Var == ch0Var.f23321b.getPinnedHeader()) {
                    ch0Var.f23321b.invalidate();
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
        switch (this.f21841s) {
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
                ((b71) this.v).f22921b.draw(canvas);
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
        switch (this.f21841s) {
            case 4:
                ic0 ic0Var = (ic0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - ic0Var.d.getPaint().measureText(ic0Var.d.getText().toString())) - ic0Var.f34433f.getPaint().measureText(ic0Var.f34433f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f21841s) {
            case 1:
                return ch0.p(((ah0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.f21841s) {
            case 1:
                return ch0.q(((ah0) this.v).d).postDelayed(runnable, j3);
            default:
                return super.postDelayed(runnable, j3);
        }
    }

    public x1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f21841s = i10;
        this.v = frameLayout;
    }

    public x1(b71 b71Var, Context context) {
        super(context, true, true, true);
        this.f21841s = 2;
        this.v = b71Var;
    }

    public x1(ic0 ic0Var, Context context) {
        super(context, false, true, true);
        this.f21841s = 4;
        this.v = ic0Var;
    }
}
