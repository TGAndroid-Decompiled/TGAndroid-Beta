package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.se0;
import org.telegram.ui.r90;
public final class a2 extends org.telegram.ui.Components.h6 {
    public final int f28929s;
    public Object f28930w;

    public a2(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f28929s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f28929s) {
            case 1:
                super.invalidate();
                qe0 qe0Var = (qe0) this.f28930w;
                se0 se0Var = qe0Var.d;
                if (qe0Var == se0Var.f37989j1.getPinnedHeader()) {
                    se0Var.f37989j1.invalidate();
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
        int r12;
        switch (this.f28929s) {
            case 0:
                super.onDraw(canvas);
                ((c2) this.f28930w).f();
                return;
            case 1:
            default:
                super.onDraw(canvas);
                return;
            case 2:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(11.0f));
                ((s41) this.f28930w).f37904b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f28930w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.L6, false)))) {
                    shapeDrawable.getPaint().setColor(r12);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f28929s) {
            case 4:
                r90 r90Var = (r90) this.f28930w;
                int size = View.MeasureSpec.getSize(i3);
                if (size <= 0) {
                    size = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - r90Var.d.getPaint().measureText(r90Var.d.getText().toString())) - r90Var.f49141f.getPaint().measureText(r90Var.f49141f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f28929s) {
            case 1:
                se0 se0Var = ((qe0) this.f28930w).d;
                n8 n8Var = se0.J1;
                return se0Var.f28586b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f28929s) {
            case 1:
                se0 se0Var = ((qe0) this.f28930w).d;
                n8 n8Var = se0.J1;
                return se0Var.f28586b.postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public a2(FrameLayout frameLayout, Context context, int i3) {
        super(context, false, false, false);
        this.f28929s = i3;
        this.f28930w = frameLayout;
    }

    public a2(s41 s41Var, Context context) {
        super(context, true, true, true);
        this.f28929s = 2;
        this.f28930w = s41Var;
    }

    public a2(r90 r90Var, Context context) {
        super(context, false, true, true);
        this.f28929s = 4;
        this.f28930w = r90Var;
    }
}
