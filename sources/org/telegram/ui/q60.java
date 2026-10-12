package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q60 extends org.telegram.ui.Components.wm0 {
    public final int V2;
    public final Object W2;

    public q60(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = obj;
    }

    @Override
    public boolean H0(View view, float f7, float f10) {
        switch (this.V2) {
            case 3:
                ((yh.r0) this.W2).getClass();
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override
    public Integer W0(int i10) {
        int i11;
        switch (this.V2) {
            case 2:
                i11 = ((SessionsActivity) this.W2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.c6 c6Var = this.f32467n2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20781p7, c6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, c6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList;
        View view;
        switch (this.V2) {
            case 0:
                super.dispatchDraw(canvas);
                s60 s60Var = (s60) this.W2;
                if (s60Var.f41819z0 != null && s60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = s60Var.f41819z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.m2) s60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    s60Var.f41819z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                bq0 bq0Var = (bq0) this.W2;
                Paint paint = bq0Var.f36242w;
                RectF rectF = bq0Var.f36241s;
                RectF rectF2 = bq0Var.f36240r;
                RectF rectF3 = bq0Var.f36239n;
                s4.d0 d0Var = bq0Var.f36235b;
                if (!bq0Var.f36238f.isEmpty()) {
                    float d = bq0Var.f36237e.d(bq0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), arrayList.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), arrayList.size() - 1, 0);
                    View m10 = d0Var.m(clamp);
                    View m11 = d0Var.m(clamp2);
                    if (m10 != null || m11 != null) {
                        if (m10 != null) {
                            view = m10;
                        } else {
                            view = m11;
                        }
                        rectF3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF2.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                        paint.setColor(bq0Var.f36243x);
                        float height = rectF.height() / 2.0f;
                        canvas.drawRoundRect(rectF, height, height, paint);
                        super.dispatchDraw(canvas);
                        return;
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.V2) {
            case 1:
                super.invalidate();
                mp0 mp0Var = ((bq0) this.W2).F;
                if (mp0Var != null) {
                    mp0Var.run();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.V2) {
            case 3:
                yh.r0 r0Var = (yh.r0) this.W2;
                r0Var.u();
                super.onLayout(z10, i10, i11, i12, i13);
                r0Var.R(2);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    public q60(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.V2 = 2;
        this.W2 = sessionsActivity;
    }
}
