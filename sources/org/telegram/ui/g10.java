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
public final class g10 extends org.telegram.ui.Components.jm0 {
    public final int V2;
    public final Object W2;

    public g10(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.V2 = i10;
        this.W2 = n2Var;
    }

    @Override
    public Integer W0(int i10) {
        int i11;
        switch (this.V2) {
            case 3:
                i11 = ((SessionsActivity) this.W2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.d6 d6Var = this.f27579n2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21211p7, d6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21079i6, d6Var));
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
            case 1:
                super.dispatchDraw(canvas);
                z50 z50Var = (z50) this.W2;
                if (z50Var.f43643z0 != null && z50Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = z50Var.f43643z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.n2) z50Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    z50Var.f43643z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                hp0 hp0Var = (hp0) this.W2;
                Paint paint = hp0Var.f37707w;
                RectF rectF = hp0Var.f37706s;
                RectF rectF2 = hp0Var.f37705r;
                RectF rectF3 = hp0Var.f37704n;
                s4.b0 b0Var = hp0Var.f37701b;
                if (!hp0Var.f37703f.isEmpty()) {
                    float d = hp0Var.e.d(hp0Var.d, false);
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
                        paint.setColor(hp0Var.f37708x);
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
            case 2:
                super.invalidate();
                so0 so0Var = ((hp0) this.W2).F;
                if (so0Var != null) {
                    so0Var.run();
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
        switch (this.V2) {
            case 0:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new dz(this, 3), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public g10(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = obj;
    }
}
