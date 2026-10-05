package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p60 extends org.telegram.ui.Components.zl0 {
    public final int f39364e3;
    public final Object f39365f3;

    public p60(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f39364e3 = i10;
        this.f39365f3 = obj;
    }

    @Override
    public boolean I0(View view, float f7, float f10) {
        switch (this.f39364e3) {
            case 3:
                ((yh.t0) this.f39365f3).getClass();
                return true;
            default:
                return super.I0(view, f7, f10);
        }
    }

    @Override
    public Integer W0(int i10) {
        int i11;
        switch (this.f39364e3) {
            case 2:
                i11 = ((SessionsActivity) this.f39365f3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.d6 d6Var = this.f33560p2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21049p7, d6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20918i6, d6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList;
        View view;
        switch (this.f39364e3) {
            case 0:
                super.dispatchDraw(canvas);
                r60 r60Var = (r60) this.f39365f3;
                if (r60Var.f39994z0 != null && r60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = r60Var.f39994z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.n2) r60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    r60Var.f39994z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                vp0 vp0Var = (vp0) this.f39365f3;
                Paint paint = vp0Var.f41803w;
                RectF rectF = vp0Var.f41802s;
                RectF rectF2 = vp0Var.f41801r;
                RectF rectF3 = vp0Var.f41800n;
                s4.c0 c0Var = vp0Var.f41796b;
                if (!vp0Var.f41799f.isEmpty()) {
                    float d = vp0Var.f41798e.d(vp0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), arrayList.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), arrayList.size() - 1, 0);
                    View m10 = c0Var.m(clamp);
                    View m11 = c0Var.m(clamp2);
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
                        paint.setColor(vp0Var.f41804x);
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
        switch (this.f39364e3) {
            case 1:
                super.invalidate();
                gp0 gp0Var = ((vp0) this.f39365f3).F;
                if (gp0Var != null) {
                    gp0Var.run();
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
        switch (this.f39364e3) {
            case 3:
                ((yh.t0) this.f39365f3).s();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    public p60(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.f39364e3 = 2;
        this.f39365f3 = sessionsActivity;
    }
}
