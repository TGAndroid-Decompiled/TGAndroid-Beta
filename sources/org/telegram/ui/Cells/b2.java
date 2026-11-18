package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.l51;
import org.telegram.ui.x90;
public final class b2 extends org.telegram.ui.Components.n6 {
    public final int f30424s;
    public Object f30425w;

    public b2(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f30424s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f30424s) {
            case 1:
                super.invalidate();
                bf0 bf0Var = (bf0) this.f30425w;
                df0 df0Var = bf0Var.d;
                if (bf0Var == df0Var.f34420m1.getPinnedHeader()) {
                    df0Var.f34420m1.invalidate();
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
        switch (this.f30424s) {
            case 0:
                super.onDraw(canvas);
                ((d2) this.f30425w).f();
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
                ((l51) this.f30425w).f37034b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f30425w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.n6.r1(0.15f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.L6, false)))) {
                    shapeDrawable.getPaint().setColor(r12);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f30424s) {
            case 4:
                x90 x90Var = (x90) this.f30425w;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = org.telegram.messenger.g0.f24118q.x - org.telegram.messenger.g0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - x90Var.d.getPaint().measureText(x90Var.d.getText().toString())) - x90Var.f53748f.getPaint().measureText(x90Var.f53748f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f30424s) {
            case 1:
                df0 df0Var = ((bf0) this.f30425w).d;
                p8 p8Var = df0.M1;
                return df0Var.f30190b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.f30424s) {
            case 1:
                df0 df0Var = ((bf0) this.f30425w).d;
                p8 p8Var = df0.M1;
                return df0Var.f30190b.postDelayed(runnable, j3);
            default:
                return super.postDelayed(runnable, j3);
        }
    }

    public b2(FrameLayout frameLayout, Context context, int i7) {
        super(context, false, false, false);
        this.f30424s = i7;
        this.f30425w = frameLayout;
    }

    public b2(l51 l51Var, Context context) {
        super(context, true, true, true);
        this.f30424s = 2;
        this.f30425w = l51Var;
    }

    public b2(x90 x90Var, Context context) {
        super(context, false, true, true);
        this.f30424s = 4;
        this.f30425w = x90Var;
    }
}
