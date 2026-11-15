package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class i2 extends View implements org.telegram.ui.ActionBar.z5 {
    public final int f47882a = 1;
    public Object f47883b;
    public Drawable f47884c;

    public i2(Context context) {
        super(context);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.f47882a) {
            case 0:
                hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hl));
                return;
            default:
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f47882a) {
            case 1:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f47883b);
                ia.f.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.f.d().e());
                float L = org.telegram.messenger.g0.L(18.0f) / 2.0f;
                Drawable drawable = this.f47884c;
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
        switch (this.f47882a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(12.0f));
                int i11 = org.telegram.ui.ActionBar.j6.Hl;
                ((g4) ((n50) this.f47883b)).getClass();
                org.telegram.ui.ActionBar.j6.B1((org.telegram.ui.Components.fq) this.f47884c, org.telegram.ui.ActionBar.j6.v0(i11), false);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void updateColors() {
        switch (this.f47882a) {
            case 0:
                try {
                    org.telegram.ui.Components.fq fqVar = (org.telegram.ui.Components.fq) this.f47884c;
                    if (fqVar != null && ((n50) this.f47883b) != null) {
                        org.telegram.ui.ActionBar.j6.B1(fqVar, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hl, false), false);
                        invalidate();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                ((Paint) this.f47883b).setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
                invalidate();
                return;
        }
    }

    public i2(Context context, n50 n50Var) {
        super(context);
        this.f47883b = n50Var;
        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hl, false)), org.telegram.ui.ActionBar.j6.X0(context, 2131231230, -16777216));
        this.f47884c = fqVar;
        fqVar.f34678x = true;
        setBackgroundDrawable(fqVar);
        setImportantForAccessibility(2);
    }

    private final void a(HashSet hashSet) {
    }
}
