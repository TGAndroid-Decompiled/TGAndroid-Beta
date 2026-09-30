package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l60 extends org.telegram.ui.Components.zl0 {
    public final int f35318e3;
    public final Object f35319f3;

    public l60(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f35318e3 = i10;
        this.f35319f3 = obj;
    }

    @Override
    public boolean I0(View view, float f7, float f10) {
        switch (this.f35318e3) {
            case 3:
                ((yh.s0) this.f35319f3).getClass();
                return true;
            default:
                return super.I0(view, f7, f10);
        }
    }

    @Override
    public Integer X0(int i10) {
        int i11;
        switch (this.f35318e3) {
            case 2:
                i11 = ((SessionsActivity) this.f35319f3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.d6 d6Var = this.f31015p2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19296p7, d6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165i6, d6Var));
            default:
                return super.X0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList;
        View view;
        switch (this.f35318e3) {
            case 0:
                super.dispatchDraw(canvas);
                n60 n60Var = (n60) this.f35319f3;
                if (n60Var.f35864z0 != null && n60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = n60Var.f35864z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.m2) n60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    n60Var.f35864z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                rp0 rp0Var = (rp0) this.f35319f3;
                Paint paint = rp0Var.f37536w;
                RectF rectF = rp0Var.f37535s;
                RectF rectF2 = rp0Var.f37534r;
                RectF rectF3 = rp0Var.f37533n;
                s4.c0 c0Var = rp0Var.f37530b;
                if (!rp0Var.f37532f.isEmpty()) {
                    float d = rp0Var.e.d(rp0Var.d, false);
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
                        paint.setColor(rp0Var.f37537x);
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
        switch (this.f35318e3) {
            case 1:
                super.invalidate();
                cp0 cp0Var = ((rp0) this.f35319f3).F;
                if (cp0Var != null) {
                    cp0Var.run();
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
        switch (this.f35318e3) {
            case 3:
                yh.s0 s0Var = (yh.s0) this.f35319f3;
                s0Var.s();
                super.onLayout(z10, i10, i11, i12, i13);
                s0Var.Q(2);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    public l60(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.f35318e3 = 2;
        this.f35319f3 = sessionsActivity;
    }
}
