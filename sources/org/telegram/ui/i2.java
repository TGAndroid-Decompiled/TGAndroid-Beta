package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class i2 extends View implements org.telegram.ui.ActionBar.c6 {
    public final int f46468a = 1;
    public Object f46469b;
    public Drawable f46470c;

    public i2(Context context) {
        super(context);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.f46468a) {
            case 0:
                hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.El));
                return;
            default:
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f46468a) {
            case 1:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f46469b);
                ia.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.e.d().e());
                float L = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = this.f46470c;
                drawable.setBounds((int) (measuredWidth - L), (int) (measuredHeight - L), (int) (measuredWidth + L), (int) (measuredHeight + L));
                drawable.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f46468a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(12.0f));
                int i11 = org.telegram.ui.ActionBar.m6.El;
                ((g4) ((r50) this.f46469b)).getClass();
                org.telegram.ui.ActionBar.m6.B1((org.telegram.ui.Components.xp) this.f46470c, org.telegram.ui.ActionBar.m6.v0(i11), false);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.f46468a) {
            case 0:
                try {
                    org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) this.f46470c;
                    if (xpVar != null && ((r50) this.f46469b) != null) {
                        org.telegram.ui.ActionBar.m6.B1(xpVar, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.El, false), false);
                        invalidate();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                ((Paint) this.f46469b).setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false));
                invalidate();
                return;
        }
    }

    public i2(Context context, r50 r50Var) {
        super(context);
        this.f46469b = r50Var;
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.El, false)), org.telegram.ui.ActionBar.m6.X0(context, 2131231230, -16777216));
        this.f46470c = xpVar;
        xpVar.f40383x = true;
        setBackgroundDrawable(xpVar);
        setImportantForAccessibility(2);
    }

    private final void a(HashSet hashSet) {
    }
}
