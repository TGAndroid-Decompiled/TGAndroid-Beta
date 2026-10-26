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
public final class k10 extends org.telegram.ui.Components.mm0 {
    public final int f40783f3;
    public final Object f40784g3;

    public k10(int i10, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.f40783f3 = i10;
        this.f40784g3 = r2Var;
    }

    @Override
    public Integer W0(int i10) {
        int i11;
        switch (this.f40783f3) {
            case 3:
                i11 = ((SessionsActivity) this.f40784g3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.u6 u6Var = this.f30646n2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23581p7, u6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i6, u6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList;
        View view;
        switch (this.f40783f3) {
            case 1:
                super.dispatchDraw(canvas);
                e60 e60Var = (e60) this.f40784g3;
                if (e60Var.f39008z0 != null && e60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = e60Var.f39008z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.r2) e60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    e60Var.f39008z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                qp0 qp0Var = (qp0) this.f40784g3;
                Paint paint = qp0Var.f42893w;
                RectF rectF = qp0Var.f42892s;
                RectF rectF2 = qp0Var.f42891r;
                RectF rectF3 = qp0Var.f42890n;
                s4.c0 c0Var = qp0Var.f42887b;
                if (!qp0Var.f42889f.isEmpty()) {
                    float d = qp0Var.e.d(qp0Var.d, false);
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
                        paint.setColor(qp0Var.f42894x);
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
        switch (this.f40783f3) {
            case 2:
                super.invalidate();
                bp0 bp0Var = ((qp0) this.f40784g3).F;
                if (bp0Var != null) {
                    bp0Var.run();
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
        switch (this.f40783f3) {
            case 0:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new p00(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean x1(View view) {
        switch (this.f40783f3) {
            case 0:
                if ((view instanceof l10) && ((l10) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.x1(view);
        }
    }

    public k10(Object obj, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f40783f3 = i10;
        this.f40784g3 = obj;
    }
}
