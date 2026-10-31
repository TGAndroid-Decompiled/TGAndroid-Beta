package org.telegram.ui.Wallet;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class f6 extends FrameLayout {
    public final int f34503a;
    public Path f34504b;

    public f6(Context context, int i10) {
        super(context);
        this.f34503a = i10;
        switch (i10) {
            case 1:
                super(context);
                return;
            default:
                this.f34504b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f34503a) {
            case 0:
                int save = canvas.save();
                canvas.clipPath(this.f34504b);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f7;
        int L;
        switch (this.f34503a) {
            case 1:
                int action = motionEvent.getAction();
                th.w0 w0Var = th.w0.Z;
                if (w0Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(w0Var.G.getX(), w0Var.G.getY());
                    boolean dispatchTouchEvent = w0Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        w0Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = w0Var.f49558y.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!w0Var.f49558y.isInProgress() && ((GestureDetector) w0Var.D.f12684b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    w0Var.E = false;
                    w0Var.F = false;
                    o1.j jVar = w0Var.P;
                    if (!jVar.f13951f) {
                        float f10 = w0Var.N;
                        jVar.f13949b = f10;
                        jVar.f13950c = true;
                        o1.k kVar = jVar.f13957m;
                        int i10 = w0Var.J;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = org.telegram.messenger.i0.f16026q.x;
                        if (f11 >= i11 / 2.0f) {
                            L = (i11 - i10) - org.telegram.messenger.i0.L(16.0f);
                        } else {
                            L = org.telegram.messenger.i0.L(16.0f);
                        }
                        kVar.f13964i = L;
                        w0Var.P.h();
                    }
                    o1.j jVar2 = w0Var.Q;
                    if (!jVar2.f13951f) {
                        jVar2.f13949b = w0Var.O;
                        jVar2.f13950c = true;
                        jVar2.f13957m.f13964i = w7.u.a(f7, org.telegram.messenger.i0.L(16.0f), (org.telegram.messenger.i0.f16026q.y - w0Var.K) - org.telegram.messenger.i0.L(16.0f));
                        w0Var.Q.h();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f34503a) {
            case 1:
                org.telegram.messenger.i0.v(getContext(), configuration);
                th.w0 w0Var = th.w0.Z;
                org.telegram.messenger.i0.x3(w0Var.f49550b, w0Var.d, w0Var.f49551c);
                w0Var.a();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f34503a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = this.f34504b;
                float paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
                path.rewind();
                path.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path.offset(getPaddingLeft(), getPaddingTop());
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path2 = this.f34504b;
                path2.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, i10, i11);
                path2.addRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), Path.Direction.CW);
                return;
        }
    }
}
