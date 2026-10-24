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
public final class k10 extends org.telegram.ui.Components.lm0 {
    public final int Y2;
    public final Object Z2;

    public k10(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.Y2 = i10;
        this.Z2 = o2Var;
    }

    @Override
    public Integer X0(int i10) {
        int i11;
        switch (this.Y2) {
            case 3:
                i11 = ((SessionsActivity) this.Z2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.g6 g6Var = this.f28396n2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21405p7, g6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, g6Var));
            default:
                return super.X0(i10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList;
        View view;
        switch (this.Y2) {
            case 1:
                super.dispatchDraw(canvas);
                d60 d60Var = (d60) this.Z2;
                if (d60Var.f36486z0 != null && d60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = d60Var.f36486z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.o2) d60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    d60Var.f36486z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                jp0 jp0Var = (jp0) this.Z2;
                Paint paint = jp0Var.f38608w;
                RectF rectF = jp0Var.f38607s;
                RectF rectF2 = jp0Var.f38606r;
                RectF rectF3 = jp0Var.f38605n;
                s4.b0 b0Var = jp0Var.f38602b;
                if (!jp0Var.f38604f.isEmpty()) {
                    float d = jp0Var.e.d(jp0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), arrayList.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), arrayList.size() - 1, 0);
                    View m10 = b0Var.m(clamp);
                    View m11 = b0Var.m(clamp2);
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
                        paint.setColor(jp0Var.f38609x);
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
        switch (this.Y2) {
            case 2:
                super.invalidate();
                uo0 uo0Var = ((jp0) this.Z2).F;
                if (uo0Var != null) {
                    uo0Var.run();
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
        switch (this.Y2) {
            case 0:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new fz(this, 3), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean x1(View view) {
        switch (this.Y2) {
            case 0:
                if ((view instanceof l10) && ((l10) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.x1(view);
        }
    }

    public k10(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Y2 = i10;
        this.Z2 = obj;
    }
}
