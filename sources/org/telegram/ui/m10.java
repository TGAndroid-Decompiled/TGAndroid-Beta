package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m10 extends org.telegram.ui.Components.nm0 {
    public final int f41299f3;
    public final Object f41300g3;

    public m10(int i10, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.f41299f3 = i10;
        this.f41300g3 = r2Var;
    }

    @Override
    public Integer W0(int i10) {
        int i11;
        switch (this.f41299f3) {
            case 3:
                i11 = ((SessionsActivity) this.f41300g3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.u6 u6Var = this.f30988n2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p7, u6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23449i6, u6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList;
        View view;
        switch (this.f41299f3) {
            case 1:
                super.dispatchDraw(canvas);
                g60 g60Var = (g60) this.f41300g3;
                if (g60Var.f39515z0 != null && g60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = g60Var.f39515z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.r2) g60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    g60Var.f39515z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                sp0 sp0Var = (sp0) this.f41300g3;
                Paint paint = sp0Var.f43380w;
                RectF rectF = sp0Var.f43379s;
                RectF rectF2 = sp0Var.f43378r;
                RectF rectF3 = sp0Var.f43377n;
                s4.c0 c0Var = sp0Var.f43374b;
                if (!sp0Var.f43376f.isEmpty()) {
                    float d = sp0Var.e.d(sp0Var.d, false);
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
                        paint.setColor(sp0Var.f43381x);
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
        switch (this.f41299f3) {
            case 2:
                super.invalidate();
                dp0 dp0Var = ((sp0) this.f41300g3).F;
                if (dp0Var != null) {
                    dp0Var.run();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41299f3) {
            case 0:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new r00(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean x1(View view) {
        switch (this.f41299f3) {
            case 0:
                if ((view instanceof n10) && ((n10) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.x1(view);
        }
    }

    public m10(Object obj, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f41299f3 = i10;
        this.f41300g3 = obj;
    }
}
