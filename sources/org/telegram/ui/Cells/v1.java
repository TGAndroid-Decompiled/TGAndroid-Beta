package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.sb0;
public final class v1 extends org.telegram.ui.Components.o6 {
    public final int f25819s;
    public Object v;

    public v1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f25819s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f25819s) {
            case 1:
                super.invalidate();
                jg0 jg0Var = (jg0) this.v;
                lg0 lg0Var = jg0Var.d;
                if (jg0Var == lg0Var.f30315b.getPinnedHeader()) {
                    lg0Var.f30315b.invalidate();
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
        switch (this.f25819s) {
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
                ((c61) this.v).f27352b.draw(canvas);
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
        switch (this.f25819s) {
            case 4:
                sb0 sb0Var = (sb0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - sb0Var.d.getPaint().measureText(sb0Var.d.getText().toString())) - sb0Var.f42345f.getPaint().measureText(sb0Var.f42345f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f25819s) {
            case 1:
                return lg0.p(((jg0) this.v).d).post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f25819s) {
            case 1:
                return lg0.q(((jg0) this.v).d).postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public v1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f25819s = i10;
        this.v = frameLayout;
    }

    public v1(c61 c61Var, Context context) {
        super(context, true, true, true);
        this.f25819s = 2;
        this.v = c61Var;
    }

    public v1(sb0 sb0Var, Context context) {
        super(context, false, true, true);
        this.f25819s = 4;
        this.v = sb0Var;
    }
}
