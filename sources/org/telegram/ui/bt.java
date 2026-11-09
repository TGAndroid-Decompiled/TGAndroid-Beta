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
public final class bt extends org.telegram.ui.Components.qj0 {
    public final int f44129e3;
    public final Object f44130f3;

    public bt(int i7, Context context, Object obj) {
        super(context, null);
        this.f44129e3 = i7;
        this.f44130f3 = obj;
    }

    @Override
    public Integer V0(int i7) {
        az azVar;
        int i10;
        switch (this.f44129e3) {
            case 0:
                int b02 = DataSettingsActivity.b0((DataSettingsActivity) this.f44130f3);
                org.telegram.ui.ActionBar.g6 g6Var = this.f37381n2;
                if (i7 == b02) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28086p7, g6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27957i6, g6Var));
            case 1:
                ArrayList arrayList = ((iz) this.f44130f3).P;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    azVar = (az) arrayList.get(i7);
                } else {
                    azVar = null;
                }
                org.telegram.ui.ActionBar.g6 g6Var2 = this.f37381n2;
                if (azVar != null && azVar.f43835l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.12f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28086p7, g6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27957i6, g6Var2));
            case 7:
                i10 = ((SessionsActivity) this.f44130f3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.g6 g6Var3 = this.f37381n2;
                if (i7 == i10) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28086p7, g6Var3)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27957i6, g6Var3));
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
        switch (this.f44129e3) {
            case 2:
                if (getAdapter() == ((a00) this.f44130f3).U) {
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (T(getChildAt(i7)).f57060f == 1) {
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
                l40 l40Var = (l40) this.f44130f3;
                if (l40Var.f47459z0 != null && l40Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = l40Var.f47459z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.f2) l40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    l40Var.f47459z0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 5:
                ra0 ra0Var = (ra0) this.f44130f3;
                RectF rectF = ra0Var.Z;
                if (ra0Var.Y != null) {
                    int L2 = org.telegram.messenger.g0.L(12.0f);
                    ra0Var.Y.setBounds(-L2, ra0Var.f49359a0 - L2, getWidth() + L2, getHeight() + L2);
                    ra0Var.Y.draw(canvas);
                    int i10 = ra0Var.H0;
                    if (i10 == 0 || i10 == 1) {
                        int L3 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L3) / 2.0f, org.telegram.messenger.g0.L(10.0f) + ra0Var.f49359a0, (getWidth() + L3) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L);
                        org.telegram.ui.ActionBar.l6.f28156t0.setColor(ra0Var.getThemedColor(org.telegram.ui.ActionBar.l6.wj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.f28156t0);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                im0 im0Var = (im0) this.f44130f3;
                Paint paint = im0Var.f46700x;
                RectF rectF2 = im0Var.f46698s;
                RectF rectF3 = im0Var.f46697r;
                RectF rectF4 = im0Var.f46696n;
                v4.b0 b0Var = im0Var.f46692b;
                if (!im0Var.f46695f.isEmpty()) {
                    float e10 = im0Var.f46694e.e(false, im0Var.d);
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
                        paint.setColor(im0Var.f46701y);
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
        switch (this.f44129e3) {
            case 5:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((ra0) this.f44130f3).f49359a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f44129e3) {
            case 2:
                if (getAdapter() == ((a00) this.f44130f3).U && T(view).f57060f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f44129e3) {
            case 6:
                super.invalidate();
                tl0 tl0Var = ((im0) this.f44130f3).F;
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
        switch (this.f44129e3) {
            case 3:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.i3(new jz(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i7, Rect rect) {
        switch (this.f44129e3) {
            case 1:
                return false;
            default:
                return super.requestFocus(i7, rect);
        }
    }

    @Override
    public boolean u1(View view) {
        switch (this.f44129e3) {
            case 3:
                if ((view instanceof c00) && ((c00) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public bt(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.f44129e3 = i7;
        this.f44130f3 = obj;
    }
}
