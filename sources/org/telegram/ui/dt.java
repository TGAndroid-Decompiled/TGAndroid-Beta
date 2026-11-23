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
public final class dt extends org.telegram.ui.Components.ek0 {
    public final int f47221f3;
    public final Object f47222g3;

    public dt(int i7, Context context, Object obj) {
        super(context, null);
        this.f47221f3 = i7;
        this.f47222g3 = obj;
    }

    @Override
    public Integer V0(int i7) {
        bz bzVar;
        int i10;
        switch (this.f47221f3) {
            case 0:
                int b02 = DataSettingsActivity.b0((DataSettingsActivity) this.f47222g3);
                org.telegram.ui.ActionBar.i6 i6Var = this.f34767o2;
                if (i7 == b02) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29672p7, i6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, i6Var));
            case 1:
                ArrayList arrayList = ((jz) this.f47222g3).Q;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    bzVar = (bz) arrayList.get(i7);
                } else {
                    bzVar = null;
                }
                org.telegram.ui.ActionBar.i6 i6Var2 = this.f34767o2;
                if (bzVar != null && bzVar.f46672l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29672p7, i6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, i6Var2));
            case 7:
                i10 = ((SessionsActivity) this.f47222g3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.i6 i6Var3 = this.f34767o2;
                if (i7 == i10) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29672p7, i6Var3)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, i6Var3));
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
        switch (this.f47221f3) {
            case 2:
                if (getAdapter() == ((b00) this.f47222g3).V) {
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (T(getChildAt(i7)).f59249f == 1) {
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
                l40 l40Var = (l40) this.f47222g3;
                if (l40Var.A0 != null && l40Var.B0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = l40Var.A0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.g2) l40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    l40Var.A0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 5:
                pa0 pa0Var = (pa0) this.f47222g3;
                RectF rectF = pa0Var.f50919a0;
                if (pa0Var.Z != null) {
                    int L2 = org.telegram.messenger.g0.L(12.0f);
                    pa0Var.Z.setBounds(-L2, pa0Var.f50921b0 - L2, getWidth() + L2, getHeight() + L2);
                    pa0Var.Z.draw(canvas);
                    int i10 = pa0Var.N0;
                    if (i10 == 0 || i10 == 1) {
                        int L3 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L3) / 2.0f, org.telegram.messenger.g0.L(10.0f) + pa0Var.f50921b0, (getWidth() + L3) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L);
                        org.telegram.ui.ActionBar.n6.f29742t0.setColor(pa0Var.getThemedColor(org.telegram.ui.ActionBar.n6.zj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29742t0);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                im0 im0Var = (im0) this.f47222g3;
                Paint paint = im0Var.f48854x;
                RectF rectF2 = im0Var.f48852s;
                RectF rectF3 = im0Var.f48851r;
                RectF rectF4 = im0Var.f48850n;
                v4.c0 c0Var = im0Var.f48846b;
                if (!im0Var.f48849f.isEmpty()) {
                    float e10 = im0Var.f48848e.e(false, im0Var.d);
                    double d = e10;
                    int j3 = Utilities.j((int) Math.floor(d), arrayList.size() - 1, 0);
                    int j10 = Utilities.j((int) Math.ceil(d), arrayList.size() - 1, 0);
                    View m10 = c0Var.m(j3);
                    View m11 = c0Var.m(j10);
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
                        paint.setColor(im0Var.f48855y);
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
        switch (this.f47221f3) {
            case 5:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((pa0) this.f47222g3).f50921b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f47221f3) {
            case 2:
                if (getAdapter() == ((b00) this.f47222g3).V && T(view).f59249f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f47221f3) {
            case 6:
                super.invalidate();
                tl0 tl0Var = ((im0) this.f47222g3).G;
                if (tl0Var != null) {
                    tl0Var.run();
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
        switch (this.f47221f3) {
            case 3:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.h3(new kz(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i7, Rect rect) {
        switch (this.f47221f3) {
            case 1:
                return false;
            default:
                return super.requestFocus(i7, rect);
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f47221f3) {
            case 3:
                if ((view instanceof e00) && ((e00) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public dt(Object obj, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.f47221f3 = i7;
        this.f47222g3 = obj;
    }
}
