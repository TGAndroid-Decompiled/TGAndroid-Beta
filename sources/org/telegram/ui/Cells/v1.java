package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.ec0;
public final class v1 extends org.telegram.ui.Components.k6 {
    public final int f22456s;
    public Object v;

    public v1(Context context, boolean z4, boolean z10, boolean z11) {
        super(context, z4, z10, z11);
        this.f22456s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f22456s) {
            case 1:
                super.invalidate();
                ug0 ug0Var = (ug0) this.v;
                wg0 wg0Var = ug0Var.d;
                if (ug0Var == wg0Var.f30249b.getPinnedHeader()) {
                    wg0Var.f30249b.invalidate();
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
        switch (this.f22456s) {
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
                ((n61) this.v).f27202b.draw(canvas);
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
        switch (this.f22456s) {
            case 4:
                ec0 ec0Var = (ec0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - ec0Var.d.getPaint().measureText(ec0Var.d.getText().toString())) - ec0Var.f33775f.getPaint().measureText(ec0Var.f33775f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f22456s) {
            case 1:
                return wg0.p(((ug0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f22456s) {
            case 1:
                return wg0.q(((ug0) this.v).d).postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public v1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f22456s = i10;
        this.v = frameLayout;
    }

    public v1(n61 n61Var, Context context) {
        super(context, true, true, true);
        this.f22456s = 2;
        this.v = n61Var;
    }

    public v1(ec0 ec0Var, Context context) {
        super(context, false, true, true);
        this.f22456s = 4;
        this.v = ec0Var;
    }
}
