package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class et extends org.telegram.ui.Components.ek0 {
    public final int f47334f3;
    public final Object f47335g3;

    public et(int i7, Context context, Object obj) {
        super(context, null);
        this.f47334f3 = i7;
        this.f47335g3 = obj;
    }

    @Override
    public Integer V0(int i7) {
        cz czVar;
        int i10;
        switch (this.f47334f3) {
            case 0:
                int b02 = DataSettingsActivity.b0((DataSettingsActivity) this.f47335g3);
                org.telegram.ui.ActionBar.h6 h6Var = this.f34859o2;
                if (i7 == b02) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29568p7, h6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29439i6, h6Var));
            case 1:
                ArrayList arrayList = ((kz) this.f47335g3).Q;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    czVar = (cz) arrayList.get(i7);
                } else {
                    czVar = null;
                }
                org.telegram.ui.ActionBar.h6 h6Var2 = this.f34859o2;
                if (czVar != null && czVar.f46800l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29568p7, h6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29439i6, h6Var2));
            case 7:
                i10 = ((SessionsActivity) this.f47335g3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.h6 h6Var3 = this.f34859o2;
                if (i7 == i10) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29568p7, h6Var3)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29439i6, h6Var3));
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int L;
        ArrayList arrayList;
        View view;
        switch (this.f47334f3) {
            case 2:
                if (getAdapter() == ((c00) this.f47335g3).V) {
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (T(getChildAt(i7)).f59115f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i7).getX(), (getChildAt(i7).getY() - getChildAt(i7).getMeasuredHeight()) + org.telegram.messenger.g0.L(2.0f));
                            getChildAt(i7).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
            default:
                super.dispatchDraw(canvas);
                return;
            case 4:
                super.dispatchDraw(canvas);
                m40 m40Var = (m40) this.f47335g3;
                if (m40Var.A0 != null && m40Var.B0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = m40Var.A0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.g2) m40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    m40Var.A0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 5:
                qa0 qa0Var = (qa0) this.f47335g3;
                RectF rectF = qa0Var.f51088a0;
                if (qa0Var.Z != null) {
                    int L2 = org.telegram.messenger.g0.L(12.0f);
                    qa0Var.Z.setBounds(-L2, qa0Var.f51090b0 - L2, getWidth() + L2, getHeight() + L2);
                    qa0Var.Z.draw(canvas);
                    int i10 = qa0Var.N0;
                    if (i10 == 0 || i10 == 1) {
                        int L3 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L3) / 2.0f, org.telegram.messenger.g0.L(10.0f) + qa0Var.f51090b0, (getWidth() + L3) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L);
                        org.telegram.ui.ActionBar.m6.f29638t0.setColor(qa0Var.getThemedColor(org.telegram.ui.ActionBar.m6.zj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f29638t0);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                km0 km0Var = (km0) this.f47335g3;
                Paint paint = km0Var.f49315x;
                RectF rectF2 = km0Var.f49313s;
                RectF rectF3 = km0Var.f49312r;
                RectF rectF4 = km0Var.f49311n;
                v4.b0 b0Var = km0Var.f49307b;
                if (!km0Var.f49310f.isEmpty()) {
                    float e10 = km0Var.f49309e.e(false, km0Var.d);
                    double d = e10;
                    int j3 = Utilities.j((int) Math.floor(d), arrayList.size() - 1, 0);
                    int j10 = Utilities.j((int) Math.ceil(d), arrayList.size() - 1, 0);
                    View m10 = b0Var.m(j3);
                    View m11 = b0Var.m(j10);
                    if (m10 != null || m11 != null) {
                        if (m10 != null) {
                            view = m10;
                        } else {
                            view = m11;
                        }
                        rectF4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF3.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        org.telegram.messenger.g0.Z1(rectF4, rectF3, e10 - j3, rectF2);
                        paint.setColor(km0Var.f49316y);
                        float height = rectF2.height() / 2.0f;
                        canvas.drawRoundRect(rectF2, height, height, paint);
                        super.dispatchDraw(canvas);
                        return;
                    }
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f47334f3) {
            case 5:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((qa0) this.f47335g3).f51090b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f47334f3) {
            case 2:
                if (getAdapter() == ((c00) this.f47335g3).V && T(view).f59115f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f47334f3) {
            case 6:
                super.invalidate();
                vl0 vl0Var = ((km0) this.f47335g3).G;
                if (vl0Var != null) {
                    vl0Var.run();
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
        switch (this.f47334f3) {
            case 3:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.h3(new lz(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i7, Rect rect) {
        switch (this.f47334f3) {
            case 1:
                return false;
            default:
                return super.requestFocus(i7, rect);
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f47334f3) {
            case 3:
                if ((view instanceof f00) && ((f00) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public et(Object obj, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f47334f3 = i7;
        this.f47335g3 = obj;
    }
}
