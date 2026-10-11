package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.th0;
import org.telegram.ui.jc0;
public final class x1 extends org.telegram.ui.Components.r6 {
    public final int f23745s;
    public Object v;

    public x1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f23745s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f23745s) {
            case 1:
                super.invalidate();
                rh0 rh0Var = (rh0) this.v;
                th0 th0Var = rh0Var.d;
                if (rh0Var == th0Var.f31255b.getPinnedHeader()) {
                    th0Var.f31255b.invalidate();
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
        switch (this.f23745s) {
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
                ((r71) this.v).f30446b.draw(canvas);
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
        switch (this.f23745s) {
            case 4:
                jc0 jc0Var = (jc0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - jc0Var.d.getPaint().measureText(jc0Var.d.getText().toString())) - jc0Var.f39011f.getPaint().measureText(jc0Var.f39011f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f23745s) {
            case 1:
                return th0.r(((rh0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.f23745s) {
            case 1:
                return th0.s(((rh0) this.v).d).postDelayed(runnable, j3);
            default:
                return super.postDelayed(runnable, j3);
        }
    }

    public x1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f23745s = i10;
        this.v = frameLayout;
    }

    public x1(r71 r71Var, Context context) {
        super(context, true, true, true);
        this.f23745s = 2;
        this.v = r71Var;
    }

    public x1(jc0 jc0Var, Context context) {
        super(context, false, true, true);
        this.f23745s = 4;
        this.v = jc0Var;
    }
}
