package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n60 extends org.telegram.ui.Components.ml0 {
    public final int X2;
    public final Object Y2;

    public n60(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.X2 = i10;
        this.Y2 = obj;
    }

    @Override
    public boolean H0(View view, float f7, float f10) {
        switch (this.X2) {
            case 3:
                ((yh.s0) this.Y2).getClass();
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override
    public Integer W0(int i10) {
        int i11;
        switch (this.X2) {
            case 2:
                i11 = ((SessionsActivity) this.Y2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.d6 d6Var = this.f26222p2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19008p7, d6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18878i6, d6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList;
        View view;
        switch (this.X2) {
            case 0:
                super.dispatchDraw(canvas);
                p60 p60Var = (p60) this.Y2;
                if (p60Var.f36030z0 != null && p60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = p60Var.f36030z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.n2) p60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    p60Var.f36030z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                tp0 tp0Var = (tp0) this.Y2;
                Paint paint = tp0Var.f37738w;
                RectF rectF = tp0Var.f37737s;
                RectF rectF2 = tp0Var.f37736r;
                RectF rectF3 = tp0Var.f37735n;
                s4.c0 c0Var = tp0Var.f37732b;
                if (!tp0Var.f37734f.isEmpty()) {
                    float d = tp0Var.e.d(tp0Var.d, false);
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
                        paint.setColor(tp0Var.f37739x);
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
        switch (this.X2) {
            case 1:
                super.invalidate();
                ep0 ep0Var = ((tp0) this.Y2).F;
                if (ep0Var != null) {
                    ep0Var.run();
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
        switch (this.X2) {
            case 3:
                yh.s0 s0Var = (yh.s0) this.Y2;
                s0Var.s();
                super.onLayout(z10, i10, i11, i12, i13);
                s0Var.Q(2);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    public n60(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.X2 = 2;
        this.Y2 = sessionsActivity;
    }
}
