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
    public final int f25335a;
    public final dh0 f25336b;

    public ch0(dh0 dh0Var, Context context, int i10) {
        super(context);
        this.f25335a = i10;
        this.f25336b = dh0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f25335a) {
            case 1:
                super.dispatchDraw(canvas);
                dh0 dh0Var = this.f25336b;
                lp0 lp0Var = dh0Var.R;
                if (lp0Var != null && lp0Var.a()) {
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
        org.telegram.ui.ts0 ts0Var;
        switch (this.f25335a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                dh0 dh0Var = this.f25336b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        dh0Var.f25641f0 = true;
                        dh0Var.f25642g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(dh0Var.f25643h0, 500L);
                    } else {
                        dh0Var.f25641f0 = false;
                        dh0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(dh0Var.f25643h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = dh0Var.V) != null && (ts0Var = photoViewer.f33566c4) != null && ts0Var.rewinding) {
                        ts0Var.setX(motionEvent.getX());
                    }
                } else {
                    dh0Var.f25641f0 = false;
                    dh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(dh0Var.f25643h0);
                }
                if (dh0Var.f25653y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(dh0Var.f25653y.getX(), dh0Var.f25653y.getY());
                    boolean dispatchTouchEvent = dh0Var.f25653y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        dh0Var.f25653y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = dh0Var.f25650s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!dh0Var.f25650s.isInProgress() && dh0Var.v.k(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    dh0Var.f25651w = false;
                    dh0Var.f25652x = false;
                    if (dh0Var.f25638d0) {
                        dh0Var.f25638d0 = false;
                        dh0 dh0Var2 = dh0.f25631p0;
                        cv cvVar = dh0Var2.U;
                        if (cvVar != null) {
                            cvVar.F();
                        } else {
                            PhotoViewer photoViewer2 = dh0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.R0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        dh0.j(false);
                    } else {
                        o1.k kVar = dh0Var.M;
                        if (!kVar.f17615f) {
                            float f10 = dh0Var.K;
                            kVar.f17613b = f10;
                            kVar.f17614c = true;
                            o1.l lVar = kVar.f17622u;
                            int i10 = dh0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f17628i = dp;
                            dh0Var.M.h();
                        }
                        o1.k kVar2 = dh0Var.N;
                        if (!kVar2.f17615f) {
                            kVar2.f17613b = dh0Var.L;
                            kVar2.f17614c = true;
                            kVar2.f17622u.f17628i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - dh0Var.I) - AndroidUtilities.dp(16.0f));
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
        switch (this.f25335a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                dh0 dh0Var = this.f25336b;
                dh0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(dh0Var.f25634b, dh0Var.d, dh0Var.f25636c);
                if (dh0Var.H != dh0Var.t() * dh0Var.J || dh0Var.I != dh0Var.r() * dh0Var.J) {
                    WindowManager.LayoutParams layoutParams = dh0Var.f25636c;
                    int t10 = (int) (dh0Var.t() * dh0Var.J);
                    dh0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = dh0Var.f25636c;
                    int r10 = (int) (dh0Var.r() * dh0Var.J);
                    dh0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(dh0Var.f25634b, dh0Var.d, dh0Var.f25636c);
                    o1.k kVar = dh0Var.M;
                    float f10 = dh0Var.K;
                    kVar.f17613b = f10;
                    kVar.f17614c = true;
                    o1.l lVar = kVar.f17622u;
                    float B = a1.g.B(dh0Var.t(), dh0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (dh0Var.t() * dh0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f17628i = dp;
                    dh0Var.M.h();
                    o1.k kVar2 = dh0Var.N;
                    kVar2.f17613b = dh0Var.L;
                    kVar2.f17614c = true;
                    kVar2.f17622u.f17628i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (dh0Var.r() * dh0Var.J)) - AndroidUtilities.dp(16.0f));
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
        switch (this.f25335a) {
            case 1:
                dh0 dh0Var = this.f25336b;
                b81 b81Var = dh0Var.Q;
                if (b81Var.f24988j) {
                    b81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    dh0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null && photoViewer.f33556b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    dh0Var.V.f33556b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
