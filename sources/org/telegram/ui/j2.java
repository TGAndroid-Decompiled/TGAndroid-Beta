package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class j2 extends View implements org.telegram.ui.ActionBar.z5 {
    public final int f46484a = 1;
    public Object f46485b;
    public Drawable f46486c;

    public j2(Context context) {
        super(context);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.f46484a) {
            case 0:
                hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.El));
                return;
            default:
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f46484a) {
            case 1:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f46485b);
                ha.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ha.e.d().e());
                float L = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = this.f46486c;
                drawable.setBounds((int) (measuredWidth - L), (int) (measuredHeight - L), (int) (measuredWidth + L), (int) (measuredHeight + L));
                drawable.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f46484a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(12.0f));
                int i11 = org.telegram.ui.ActionBar.k6.El;
                ((i4) ((i50) this.f46485b)).getClass();
                org.telegram.ui.ActionBar.k6.B1((org.telegram.ui.Components.xp) this.f46486c, org.telegram.ui.ActionBar.k6.v0(i11), false);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.f46484a) {
            case 0:
                try {
                    org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) this.f46486c;
                    if (xpVar != null && ((i50) this.f46485b) != null) {
                        org.telegram.ui.ActionBar.k6.B1(xpVar, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.El, false), false);
                        invalidate();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                ((Paint) this.f46485b).setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
                invalidate();
                return;
        }
    }

    public j2(Context context, i50 i50Var) {
        super(context);
        this.f46485b = i50Var;
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.El, false)), org.telegram.ui.ActionBar.k6.X0(context, 2131231230, -16777216));
        this.f46486c = xpVar;
        xpVar.f40447x = true;
        setBackgroundDrawable(xpVar);
        setImportantForAccessibility(2);
    }

    private final void a(HashSet hashSet) {
    }
}
