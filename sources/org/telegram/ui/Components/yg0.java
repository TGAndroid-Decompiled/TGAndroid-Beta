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
public final class yg0 extends FrameLayout {
    public final int f32621a;
    public final zg0 f32622b;

    public yg0(zg0 zg0Var, Context context, int i10) {
        super(context);
        this.f32621a = i10;
        this.f32622b = zg0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32621a) {
            case 1:
                super.dispatchDraw(canvas);
                zg0 zg0Var = this.f32622b;
                gp0 gp0Var = zg0Var.R;
                if (gp0Var != null && gp0Var.a()) {
                    zg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    zg0Var.R.draw(canvas);
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
        org.telegram.ui.qs0 qs0Var;
        switch (this.f32621a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                zg0 zg0Var = this.f32622b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        zg0Var.f32939f0 = true;
                        zg0Var.f32940g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(zg0Var.f32941h0, 500L);
                    } else {
                        zg0Var.f32939f0 = false;
                        zg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(zg0Var.f32941h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = zg0Var.V) != null && (qs0Var = photoViewer.f33258c4) != null && qs0Var.rewinding) {
                        qs0Var.setX(motionEvent.getX());
                    }
                } else {
                    zg0Var.f32939f0 = false;
                    zg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(zg0Var.f32941h0);
                }
                if (zg0Var.f32951y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(zg0Var.f32951y.getX(), zg0Var.f32951y.getY());
                    boolean dispatchTouchEvent = zg0Var.f32951y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        zg0Var.f32951y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = zg0Var.f32948s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!zg0Var.f32948s.isInProgress() && zg0Var.v.k(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    zg0Var.f32949w = false;
                    zg0Var.f32950x = false;
                    if (zg0Var.f32936d0) {
                        zg0Var.f32936d0 = false;
                        zg0 zg0Var2 = zg0.f32929p0;
                        cv cvVar = zg0Var2.U;
                        if (cvVar != null) {
                            cvVar.G();
                        } else {
                            PhotoViewer photoViewer2 = zg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.Q0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        zg0.j(false);
                    } else {
                        o1.k kVar = zg0Var.M;
                        if (!kVar.f17554f) {
                            float f10 = zg0Var.K;
                            kVar.f17552b = f10;
                            kVar.f17553c = true;
                            o1.l lVar = kVar.f17561u;
                            int i10 = zg0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f17567i = dp;
                            zg0Var.M.h();
                        }
                        o1.k kVar2 = zg0Var.N;
                        if (!kVar2.f17554f) {
                            kVar2.f17552b = zg0Var.L;
                            kVar2.f17553c = true;
                            kVar2.f17561u.f17567i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - zg0Var.I) - AndroidUtilities.dp(16.0f));
                            zg0Var.N.h();
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
        switch (this.f32621a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                zg0 zg0Var = this.f32622b;
                zg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(zg0Var.f32932b, zg0Var.d, zg0Var.f32934c);
                if (zg0Var.H != zg0Var.t() * zg0Var.J || zg0Var.I != zg0Var.r() * zg0Var.J) {
                    WindowManager.LayoutParams layoutParams = zg0Var.f32934c;
                    int t10 = (int) (zg0Var.t() * zg0Var.J);
                    zg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = zg0Var.f32934c;
                    int r10 = (int) (zg0Var.r() * zg0Var.J);
                    zg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(zg0Var.f32932b, zg0Var.d, zg0Var.f32934c);
                    o1.k kVar = zg0Var.M;
                    float f10 = zg0Var.K;
                    kVar.f17552b = f10;
                    kVar.f17553c = true;
                    o1.l lVar = kVar.f17561u;
                    float B = a1.g.B(zg0Var.t(), zg0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (zg0Var.t() * zg0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f17567i = dp;
                    zg0Var.M.h();
                    o1.k kVar2 = zg0Var.N;
                    kVar2.f17552b = zg0Var.L;
                    kVar2.f17553c = true;
                    kVar2.f17561u.f17567i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (zg0Var.r() * zg0Var.J)) - AndroidUtilities.dp(16.0f));
                    zg0Var.N.h();
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
        switch (this.f32621a) {
            case 1:
                zg0 zg0Var = this.f32622b;
                s71 s71Var = zg0Var.Q;
                if (s71Var.f30202j) {
                    s71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    zg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = zg0Var.V;
                if (photoViewer != null && photoViewer.f33248b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    zg0Var.V.f33248b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
