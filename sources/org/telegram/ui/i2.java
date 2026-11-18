package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class i2 extends View implements org.telegram.ui.ActionBar.c6 {
    public final int f48519a = 1;
    public Object f48520b;
    public Drawable f48521c;

    public i2(Context context) {
        super(context);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.f48519a) {
            case 0:
                hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Hl));
                return;
            default:
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f48519a) {
            case 1:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f48520b);
                ia.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.e.d().e());
                float L = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = this.f48521c;
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
        switch (this.f48519a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(12.0f));
                int i11 = org.telegram.ui.ActionBar.n6.Hl;
                ((g4) ((p50) this.f48520b)).getClass();
                org.telegram.ui.ActionBar.n6.B1((org.telegram.ui.Components.mq) this.f48521c, org.telegram.ui.ActionBar.n6.v0(i11), false);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.f48519a) {
            case 0:
                try {
                    org.telegram.ui.Components.mq mqVar = (org.telegram.ui.Components.mq) this.f48521c;
                    if (mqVar != null && ((p50) this.f48520b) != null) {
                        org.telegram.ui.ActionBar.n6.B1(mqVar, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hl, false), false);
                        invalidate();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                ((Paint) this.f48520b).setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29467h5, false));
                invalidate();
                return;
        }
    }

    public i2(Context context, p50 p50Var) {
        super(context);
        this.f48520b = p50Var;
        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hl, false)), org.telegram.ui.ActionBar.n6.X0(context, 2131231230, -16777216));
        this.f48521c = mqVar;
        mqVar.f37616x = true;
        setBackgroundDrawable(mqVar);
        setImportantForAccessibility(2);
    }

    private final void a(HashSet hashSet) {
    }
}
