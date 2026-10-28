package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;
public final class ch0 extends FrameLayout {
    public final int f27162a;
    public final dh0 f27163b;

    public ch0(dh0 dh0Var, Context context, int i10) {
        super(context);
        this.f27162a = i10;
        this.f27163b = dh0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f27162a) {
            case 1:
                super.dispatchDraw(canvas);
                dh0 dh0Var = this.f27163b;
                rp0 rp0Var = dh0Var.R;
                if (rp0Var != null && rp0Var.a()) {
                    dh0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    dh0Var.R.draw(canvas);
                    return;
                }
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
        int dp;
        PhotoViewer photoViewer;
        org.telegram.ui.zs0 zs0Var;
        switch (this.f27162a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                dh0 dh0Var = this.f27163b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        dh0Var.f27454f0 = true;
                        dh0Var.f27455g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(dh0Var.f27456h0, 500L);
                    } else {
                        dh0Var.f27454f0 = false;
                        dh0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(dh0Var.f27456h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = dh0Var.V) != null && (zs0Var = photoViewer.f35656c4) != null && zs0Var.rewinding) {
                        zs0Var.setX(motionEvent.getX());
                    }
                } else {
                    dh0Var.f27454f0 = false;
                    dh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(dh0Var.f27456h0);
                }
                if (dh0Var.f27466y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(dh0Var.f27466y.getX(), dh0Var.f27466y.getY());
                    boolean dispatchTouchEvent = dh0Var.f27466y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        dh0Var.f27466y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = dh0Var.f27463s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!dh0Var.f27463s.isInProgress() && dh0Var.v.g0(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    dh0Var.f27464w = false;
                    dh0Var.f27465x = false;
                    if (dh0Var.f27451d0) {
                        dh0Var.f27451d0 = false;
                        dh0 dh0Var2 = dh0.f27444p0;
                        dv dvVar = dh0Var2.U;
                        if (dvVar != null) {
                            dvVar.G();
                        } else {
                            PhotoViewer photoViewer2 = dh0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.Q0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        dh0.j(false);
                    } else {
                        o1.j jVar = dh0Var.M;
                        if (!jVar.f18962f) {
                            float f10 = dh0Var.K;
                            jVar.f18960b = f10;
                            jVar.f18961c = true;
                            o1.k kVar = jVar.f18968u;
                            int i10 = dh0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            kVar.f18974i = dp;
                            dh0Var.M.h();
                        }
                        o1.j jVar2 = dh0Var.N;
                        if (!jVar2.f18962f) {
                            jVar2.f18960b = dh0Var.L;
                            jVar2.f18961c = true;
                            jVar2.f18968u.f18974i = a8.ee.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - dh0Var.I) - AndroidUtilities.dp(16.0f));
                            dh0Var.N.h();
                        }
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
        float dp;
        float f7;
        switch (this.f27162a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                dh0 dh0Var = this.f27163b;
                dh0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(dh0Var.f27447b, dh0Var.d, dh0Var.f27449c);
                if (dh0Var.H != dh0Var.t() * dh0Var.J || dh0Var.I != dh0Var.r() * dh0Var.J) {
                    WindowManager.LayoutParams layoutParams = dh0Var.f27449c;
                    int t10 = (int) (dh0Var.t() * dh0Var.J);
                    dh0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = dh0Var.f27449c;
                    int r6 = (int) (dh0Var.r() * dh0Var.J);
                    dh0Var.I = r6;
                    layoutParams2.height = r6;
                    AndroidUtilities.updateViewLayout(dh0Var.f27447b, dh0Var.d, dh0Var.f27449c);
                    o1.j jVar = dh0Var.M;
                    float f10 = dh0Var.K;
                    jVar.f18960b = f10;
                    jVar.f18961c = true;
                    o1.k kVar = jVar.f18968u;
                    float C = a1.g.C(dh0Var.t(), dh0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (C >= f11 / 2.0f) {
                        dp = (f11 - (dh0Var.t() * dh0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f18974i = dp;
                    dh0Var.M.h();
                    o1.j jVar2 = dh0Var.N;
                    jVar2.f18960b = dh0Var.L;
                    jVar2.f18961c = true;
                    jVar2.f18968u.f18974i = a8.ee.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (dh0Var.r() * dh0Var.J)) - AndroidUtilities.dp(16.0f));
                    dh0Var.N.h();
                    return;
                }
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f27162a) {
            case 1:
                dh0 dh0Var = this.f27163b;
                k81 k81Var = dh0Var.Q;
                if (k81Var.f29893j) {
                    k81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    dh0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null && photoViewer.f35646b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    dh0Var.V.f35646b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
