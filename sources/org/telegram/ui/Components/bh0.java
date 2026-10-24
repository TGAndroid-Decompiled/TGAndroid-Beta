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
public final class bh0 extends FrameLayout {
    public final int f25002a;
    public final ch0 f25003b;

    public bh0(ch0 ch0Var, Context context, int i10) {
        super(context);
        this.f25002a = i10;
        this.f25003b = ch0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f25002a) {
            case 1:
                super.dispatchDraw(canvas);
                ch0 ch0Var = this.f25003b;
                kp0 kp0Var = ch0Var.R;
                if (kp0Var != null && kp0Var.a()) {
                    ch0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ch0Var.R.draw(canvas);
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
        org.telegram.ui.ss0 ss0Var;
        switch (this.f25002a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ch0 ch0Var = this.f25003b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        ch0Var.f25323f0 = true;
                        ch0Var.f25324g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(ch0Var.f25325h0, 500L);
                    } else {
                        ch0Var.f25323f0 = false;
                        ch0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(ch0Var.f25325h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = ch0Var.V) != null && (ss0Var = photoViewer.f33568c4) != null && ss0Var.rewinding) {
                        ss0Var.setX(motionEvent.getX());
                    }
                } else {
                    ch0Var.f25323f0 = false;
                    ch0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ch0Var.f25325h0);
                }
                if (ch0Var.f25335y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(ch0Var.f25335y.getX(), ch0Var.f25335y.getY());
                    boolean dispatchTouchEvent = ch0Var.f25335y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        ch0Var.f25335y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = ch0Var.f25332s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!ch0Var.f25332s.isInProgress() && ch0Var.v.k(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ch0Var.f25333w = false;
                    ch0Var.f25334x = false;
                    if (ch0Var.f25320d0) {
                        ch0Var.f25320d0 = false;
                        ch0 ch0Var2 = ch0.f25313p0;
                        av avVar = ch0Var2.U;
                        if (avVar != null) {
                            avVar.F();
                        } else {
                            PhotoViewer photoViewer2 = ch0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.R0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        ch0.j(false);
                    } else {
                        o1.k kVar = ch0Var.M;
                        if (!kVar.f17615f) {
                            float f10 = ch0Var.K;
                            kVar.f17613b = f10;
                            kVar.f17614c = true;
                            o1.l lVar = kVar.f17622u;
                            int i10 = ch0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f17628i = dp;
                            ch0Var.M.h();
                        }
                        o1.k kVar2 = ch0Var.N;
                        if (!kVar2.f17615f) {
                            kVar2.f17613b = ch0Var.L;
                            kVar2.f17614c = true;
                            kVar2.f17622u.f17628i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ch0Var.I) - AndroidUtilities.dp(16.0f));
                            ch0Var.N.h();
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
        switch (this.f25002a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                ch0 ch0Var = this.f25003b;
                ch0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(ch0Var.f25316b, ch0Var.d, ch0Var.f25318c);
                if (ch0Var.H != ch0Var.t() * ch0Var.J || ch0Var.I != ch0Var.r() * ch0Var.J) {
                    WindowManager.LayoutParams layoutParams = ch0Var.f25318c;
                    int t10 = (int) (ch0Var.t() * ch0Var.J);
                    ch0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = ch0Var.f25318c;
                    int r10 = (int) (ch0Var.r() * ch0Var.J);
                    ch0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(ch0Var.f25316b, ch0Var.d, ch0Var.f25318c);
                    o1.k kVar = ch0Var.M;
                    float f10 = ch0Var.K;
                    kVar.f17613b = f10;
                    kVar.f17614c = true;
                    o1.l lVar = kVar.f17622u;
                    float B = a1.g.B(ch0Var.t(), ch0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (ch0Var.t() * ch0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f17628i = dp;
                    ch0Var.M.h();
                    o1.k kVar2 = ch0Var.N;
                    kVar2.f17613b = ch0Var.L;
                    kVar2.f17614c = true;
                    kVar2.f17622u.f17628i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (ch0Var.r() * ch0Var.J)) - AndroidUtilities.dp(16.0f));
                    ch0Var.N.h();
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
        switch (this.f25002a) {
            case 1:
                ch0 ch0Var = this.f25003b;
                a81 a81Var = ch0Var.Q;
                if (a81Var.f24661j) {
                    a81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ch0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null && photoViewer.f33558b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    ch0Var.V.f33558b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
