package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.w90;
public final class a2 extends org.telegram.ui.Components.j6 {
    public final int f28874s;
    public Object f28875w;

    public a2(Context context, boolean z9, boolean z10, boolean z11) {
        super(context, z9, z10, z11);
        this.f28874s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f28874s) {
            case 1:
                super.invalidate();
                pe0 pe0Var = (pe0) this.f28875w;
                re0 re0Var = pe0Var.d;
                if (pe0Var == re0Var.f37685i1.getPinnedHeader()) {
                    re0Var.f37685i1.invalidate();
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
        switch (this.f28874s) {
            case 0:
                super.onDraw(canvas);
                ((c2) this.f28875w).f();
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
                ((z41) this.f28875w).f40905b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f28875w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.l6.r1(0.15f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.L6, false)))) {
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
        switch (this.f28874s) {
            case 4:
                w90 w90Var = (w90) this.f28875w;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - w90Var.d.getPaint().measureText(w90Var.d.getText().toString())) - w90Var.f50992f.getPaint().measureText(w90Var.f50992f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f28874s) {
            case 1:
                re0 re0Var = ((pe0) this.f28875w).d;
                o8 o8Var = re0.I1;
                return re0Var.f28624b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.f28874s) {
            case 1:
                re0 re0Var = ((pe0) this.f28875w).d;
                o8 o8Var = re0.I1;
                return re0Var.f28624b.postDelayed(runnable, j3);
            default:
                return super.postDelayed(runnable, j3);
        }
    }

    public a2(FrameLayout frameLayout, Context context, int i7) {
        super(context, false, false, false);
        this.f28874s = i7;
        this.f28875w = frameLayout;
    }

    public a2(z41 z41Var, Context context) {
        super(context, true, true, true);
        this.f28874s = 2;
        this.f28875w = z41Var;
    }

    public a2(w90 w90Var, Context context) {
        super(context, false, true, true);
        this.f28874s = 4;
        this.f28875w = w90Var;
    }
}
