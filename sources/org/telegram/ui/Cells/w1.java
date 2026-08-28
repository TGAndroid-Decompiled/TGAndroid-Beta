package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.qb0;
public final class w1 extends org.telegram.ui.Components.j6 {
    public final int f25886s;
    public Object v;

    public w1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f25886s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f25886s) {
            case 1:
                super.invalidate();
                yf0 yf0Var = (yf0) this.v;
                ag0 ag0Var = yf0Var.d;
                if (yf0Var == ag0Var.f26783b.getPinnedHeader()) {
                    ag0Var.f26783b.invalidate();
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
        switch (this.f25886s) {
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
                ((p51) this.v).f31550b.draw(canvas);
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
    public void onMeasure(int i9, int i10) {
        switch (this.f25886s) {
            case 4:
                qb0 qb0Var = (qb0) this.v;
                int size = View.MeasureSpec.getSize(i9);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - qb0Var.d.getPaint().measureText(qb0Var.d.getText().toString())) - qb0Var.f41746f.getPaint().measureText(qb0Var.f41746f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f25886s) {
            case 1:
                return ag0.p(((yf0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f25886s) {
            case 1:
                return ag0.q(((yf0) this.v).d).postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public w1(FrameLayout frameLayout, Context context, int i9) {
        super(context, false, false, false);
        this.f25886s = i9;
        this.v = frameLayout;
    }

    public w1(p51 p51Var, Context context) {
        super(context, true, true, true);
        this.f25886s = 2;
        this.v = p51Var;
    }

    public w1(qb0 qb0Var, Context context) {
        super(context, false, true, true);
        this.f25886s = 4;
        this.v = qb0Var;
    }
}
