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
public final class ct extends org.telegram.ui.Components.pj0 {
    public final int f44801e3;
    public final Object f44802f3;

    public ct(int i7, Context context, Object obj) {
        super(context, null);
        this.f44801e3 = i7;
        this.f44802f3 = obj;
    }

    @Override
    public Integer V0(int i7) {
        bz bzVar;
        int i10;
        switch (this.f44801e3) {
            case 0:
                int b02 = DataSettingsActivity.b0((DataSettingsActivity) this.f44802f3);
                org.telegram.ui.ActionBar.h6 h6Var = this.f36980n2;
                if (i7 == b02) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28111p7, h6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, h6Var));
            case 1:
                ArrayList arrayList = ((jz) this.f44802f3).P;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    bzVar = (bz) arrayList.get(i7);
                } else {
                    bzVar = null;
                }
                org.telegram.ui.ActionBar.h6 h6Var2 = this.f36980n2;
                if (bzVar != null && bzVar.f44182l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28111p7, h6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, h6Var2));
            case 7:
                i10 = ((SessionsActivity) this.f44802f3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.h6 h6Var3 = this.f36980n2;
                if (i7 == i10) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28111p7, h6Var3)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, h6Var3));
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        int L;
        ArrayList arrayList;
        View view;
        switch (this.f44801e3) {
            case 2:
                if (getAdapter() == ((b00) this.f44802f3).U) {
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (T(getChildAt(i7)).f57056f == 1) {
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
                m40 m40Var = (m40) this.f44802f3;
                if (m40Var.f47788z0 != null && m40Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = m40Var.f47788z0.getMeasuredHeight();
                    lVar = ((org.telegram.ui.ActionBar.f2) m40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - lVar.getMeasuredHeight()));
                    m40Var.f47788z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 5:
                sa0 sa0Var = (sa0) this.f44802f3;
                RectF rectF = sa0Var.Z;
                if (sa0Var.Y != null) {
                    int L2 = org.telegram.messenger.g0.L(12.0f);
                    sa0Var.Y.setBounds(-L2, sa0Var.f49768a0 - L2, getWidth() + L2, getHeight() + L2);
                    sa0Var.Y.draw(canvas);
                    int i10 = sa0Var.H0;
                    if (i10 == 0 || i10 == 1) {
                        int L3 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L3) / 2.0f, org.telegram.messenger.g0.L(10.0f) + sa0Var.f49768a0, (getWidth() + L3) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L);
                        org.telegram.ui.ActionBar.m6.f28181t0.setColor(sa0Var.getThemedColor(org.telegram.ui.ActionBar.m6.wj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f28181t0);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                jm0 jm0Var = (jm0) this.f44802f3;
                Paint paint = jm0Var.f47045x;
                RectF rectF2 = jm0Var.f47043s;
                RectF rectF3 = jm0Var.f47042r;
                RectF rectF4 = jm0Var.f47041n;
                v4.b0 b0Var = jm0Var.f47037b;
                if (!jm0Var.f47040f.isEmpty()) {
                    float e10 = jm0Var.f47039e.e(false, jm0Var.d);
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
                        paint.setColor(jm0Var.f47046y);
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
        switch (this.f44801e3) {
            case 5:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((sa0) this.f44802f3).f49768a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f44801e3) {
            case 2:
                if (getAdapter() == ((b00) this.f44802f3).U && T(view).f57056f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f44801e3) {
            case 6:
                super.invalidate();
                ul0 ul0Var = ((jm0) this.f44802f3).F;
                if (ul0Var != null) {
                    ul0Var.run();
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
        switch (this.f44801e3) {
            case 3:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.i3(new kz(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i7, Rect rect) {
        switch (this.f44801e3) {
            case 1:
                return false;
            default:
                return super.requestFocus(i7, rect);
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f44801e3) {
            case 3:
                if ((view instanceof d00) && ((d00) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public ct(Object obj, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f44801e3 = i7;
        this.f44802f3 = obj;
    }
}
