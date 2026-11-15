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
public final class ct extends org.telegram.ui.Components.uj0 {
    public final int f46240f3;
    public final Object f46241g3;

    public ct(int i7, Context context, Object obj) {
        super(context, null);
        this.f46240f3 = i7;
        this.f46241g3 = obj;
    }

    @Override
    public Integer V0(int i7) {
        zy zyVar;
        int i10;
        switch (this.f46240f3) {
            case 0:
                int b02 = DataSettingsActivity.b0((DataSettingsActivity) this.f46241g3);
                org.telegram.ui.ActionBar.e6 e6Var = this.f40069o2;
                if (i7 == b02) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29070p7, e6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var));
            case 1:
                ArrayList arrayList = ((hz) this.f46241g3).Q;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    zyVar = (zy) arrayList.get(i7);
                } else {
                    zyVar = null;
                }
                org.telegram.ui.ActionBar.e6 e6Var2 = this.f40069o2;
                if (zyVar != null && zyVar.f54067l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29070p7, e6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var2));
            case 7:
                i10 = ((SessionsActivity) this.f46241g3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.e6 e6Var3 = this.f40069o2;
                if (i7 == i10) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29070p7, e6Var3)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var3));
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
        switch (this.f46240f3) {
            case 2:
                if (getAdapter() == ((zz) this.f46241g3).V) {
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (T(getChildAt(i7)).f58539f == 1) {
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
                j40 j40Var = (j40) this.f46241g3;
                if (j40Var.A0 != null && j40Var.B0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = j40Var.A0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.e2) j40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    j40Var.A0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 5:
                pa0 pa0Var = (pa0) this.f46241g3;
                RectF rectF = pa0Var.f50193a0;
                if (pa0Var.Z != null) {
                    int L2 = org.telegram.messenger.g0.L(12.0f);
                    pa0Var.Z.setBounds(-L2, pa0Var.f50195b0 - L2, getWidth() + L2, getHeight() + L2);
                    pa0Var.Z.draw(canvas);
                    int i10 = pa0Var.I0;
                    if (i10 == 0 || i10 == 1) {
                        int L3 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L3) / 2.0f, org.telegram.messenger.g0.L(10.0f) + pa0Var.f50195b0, (getWidth() + L3) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L);
                        org.telegram.ui.ActionBar.j6.f29140t0.setColor(pa0Var.getThemedColor(org.telegram.ui.ActionBar.j6.zj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.f29140t0);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                hm0 hm0Var = (hm0) this.f46241g3;
                Paint paint = hm0Var.f47749x;
                RectF rectF2 = hm0Var.f47747s;
                RectF rectF3 = hm0Var.f47746r;
                RectF rectF4 = hm0Var.f47745n;
                v4.b0 b0Var = hm0Var.f47741b;
                if (!hm0Var.f47744f.isEmpty()) {
                    float e10 = hm0Var.f47743e.e(false, hm0Var.d);
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
                        paint.setColor(hm0Var.f47750y);
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
        switch (this.f46240f3) {
            case 5:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((pa0) this.f46241g3).f50195b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f46240f3) {
            case 2:
                if (getAdapter() == ((zz) this.f46241g3).V && T(view).f58539f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f46240f3) {
            case 6:
                super.invalidate();
                sl0 sl0Var = ((hm0) this.f46241g3).G;
                if (sl0Var != null) {
                    sl0Var.run();
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
        switch (this.f46240f3) {
            case 3:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.i3(new iz(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i7, Rect rect) {
        switch (this.f46240f3) {
            case 1:
                return false;
            default:
                return super.requestFocus(i7, rect);
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f46240f3) {
            case 3:
                if ((view instanceof c00) && ((c00) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public ct(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f46240f3 = i7;
        this.f46241g3 = obj;
    }
}
