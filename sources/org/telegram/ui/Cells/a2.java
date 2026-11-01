package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.ya0;
public final class a2 extends org.telegram.ui.Components.f6 {
    public final int f21664s;
    public Object f21665w;

    public a2(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.f21664s = 3;
    }

    @Override
    public void invalidate() {
        switch (this.f21664s) {
            case 1:
                super.invalidate();
                rf0 rf0Var = (rf0) this.f21665w;
                tf0 tf0Var = rf0Var.d;
                if (rf0Var == tf0Var.f30635i1.getPinnedHeader()) {
                    tf0Var.f30635i1.invalidate();
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
        switch (this.f21664s) {
            case 0:
                super.onDraw(canvas);
                ((c2) this.f21665w).f();
                return;
            case 1:
            default:
                super.onDraw(canvas);
                return;
            case 2:
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.L(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(11.0f));
                ((c61) this.f21665w).f25036b.draw(canvas);
                canvas.restore();
                return;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f21665w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.L6, false)))) {
                    shapeDrawable.getPaint().setColor(r12);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f21664s) {
            case 4:
                ya0 ya0Var = (ya0) this.f21665w;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - ya0Var.d.getPaint().measureText(ya0Var.d.getText().toString())) - ya0Var.f43618f.getPaint().measureText(ya0Var.f43618f.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean post(Runnable runnable) {
        switch (this.f21664s) {
            case 1:
                tf0 tf0Var = ((rf0) this.f21665w).d;
                mh.g gVar = tf0.I1;
                return tf0Var.f21587b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.f21664s) {
            case 1:
                tf0 tf0Var = ((rf0) this.f21665w).d;
                mh.g gVar = tf0.I1;
                return tf0Var.f21587b.postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    public a2(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.f21664s = i10;
        this.f21665w = frameLayout;
    }

    public a2(c61 c61Var, Context context) {
        super(context, true, true, true);
        this.f21664s = 2;
        this.f21665w = c61Var;
    }

    public a2(ya0 ya0Var, Context context) {
        super(context, false, true, true);
        this.f21664s = 4;
        this.f21665w = ya0Var;
    }
}
