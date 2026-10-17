package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.qb0;
public final class x1 extends org.telegram.ui.Components.q6 {
    public final int f23787s;
    public Object v;

    public x1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f23787s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f23787s) {
            case 1:
                super.invalidate();
                ih0 ih0Var = (ih0) this.v;
                kh0 kh0Var = ih0Var.d;
                if (ih0Var == kh0Var.f27875b.getPinnedHeader()) {
                    kh0Var.f27875b.invalidate();
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
        switch (this.f23787s) {
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
                ((g71) this.v).f26494b.draw(canvas);
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
        switch (this.f23787s) {
            case 4:
                qb0 qb0Var = (qb0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - qb0Var.d.getPaint().measureText(qb0Var.d.getText().toString())) - qb0Var.f40359f.getPaint().measureText(qb0Var.f40359f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f23787s) {
            case 1:
                return kh0.q(((ih0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f23787s) {
            case 1:
                return kh0.r(((ih0) this.v).d).postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public x1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f23787s = i10;
        this.v = frameLayout;
    }

    public x1(g71 g71Var, Context context) {
        super(context, true, true, true);
        this.f23787s = 2;
        this.v = g71Var;
    }

    public x1(qb0 qb0Var, Context context) {
        super(context, false, true, true);
        this.f23787s = 4;
        this.v = qb0Var;
    }
}
