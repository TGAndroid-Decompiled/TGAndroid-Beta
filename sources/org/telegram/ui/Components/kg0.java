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
public final class kg0 extends FrameLayout {
    public final int f26269a;
    public final lg0 f26270b;

    public kg0(lg0 lg0Var, Context context, int i10) {
        super(context);
        this.f26269a = i10;
        this.f26270b = lg0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26269a) {
            case 1:
                super.dispatchDraw(canvas);
                lg0 lg0Var = this.f26270b;
                oo0 oo0Var = lg0Var.O;
                if (oo0Var != null && oo0Var.a()) {
                    lg0Var.O.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    lg0Var.O.draw(canvas);
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
        boolean z4;
        int dp;
        PhotoViewer photoViewer;
        org.telegram.ui.ps0 ps0Var;
        switch (this.f26269a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                lg0 lg0Var = this.f26270b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        lg0Var.f26663c0 = true;
                        lg0Var.f26664d0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(lg0Var.f26665e0, 500L);
                    } else {
                        lg0Var.f26663c0 = false;
                        lg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(lg0Var.f26665e0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = lg0Var.S) != null && (ps0Var = photoViewer.Z3) != null && ps0Var.rewinding) {
                        ps0Var.setX(motionEvent.getX());
                    }
                } else {
                    lg0Var.f26663c0 = false;
                    lg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(lg0Var.f26665e0);
                }
                if (lg0Var.f26677y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(lg0Var.f26677y.getX(), lg0Var.f26677y.getY());
                    boolean dispatchTouchEvent = lg0Var.f26677y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        lg0Var.f26677y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = lg0Var.f26674s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!lg0Var.f26674s.isInProgress() && lg0Var.v.v0(motionEvent)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    lg0Var.f26675w = false;
                    lg0Var.f26676x = false;
                    if (lg0Var.f26659a0) {
                        lg0Var.f26659a0 = false;
                        lg0 lg0Var2 = lg0.m0;
                        pu puVar = lg0Var2.R;
                        if (puVar != null) {
                            puVar.G();
                        } else {
                            PhotoViewer photoViewer2 = lg0Var2.S;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        lg0.j(false);
                    } else {
                        o1.j jVar = lg0Var.J;
                        if (!jVar.f16192f) {
                            float f10 = lg0Var.H;
                            jVar.f16190b = f10;
                            jVar.f16191c = true;
                            o1.k kVar = jVar.f16198u;
                            int i10 = lg0Var.E;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            kVar.f16204i = dp;
                            lg0Var.J.f();
                        }
                        o1.j jVar2 = lg0Var.K;
                        if (!jVar2.f16192f) {
                            float f12 = lg0Var.I;
                            jVar2.f16190b = f12;
                            jVar2.f16191c = true;
                            jVar2.f16198u.f16204i = k7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - lg0Var.F) - AndroidUtilities.dp(16.0f));
                            lg0Var.K.f();
                        }
                    }
                }
                if (onTouchEvent || z4) {
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
        float f10;
        switch (this.f26269a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                lg0 lg0Var = this.f26270b;
                lg0Var.D = null;
                AndroidUtilities.setPreferredMaxRefreshRate(lg0Var.f26660b, lg0Var.d, lg0Var.f26662c);
                if (lg0Var.E != lg0Var.t() * lg0Var.G || lg0Var.F != lg0Var.r() * lg0Var.G) {
                    WindowManager.LayoutParams layoutParams = lg0Var.f26662c;
                    int t6 = (int) (lg0Var.t() * lg0Var.G);
                    lg0Var.E = t6;
                    layoutParams.width = t6;
                    WindowManager.LayoutParams layoutParams2 = lg0Var.f26662c;
                    int r10 = (int) (lg0Var.r() * lg0Var.G);
                    lg0Var.F = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(lg0Var.f26660b, lg0Var.d, lg0Var.f26662c);
                    o1.j jVar = lg0Var.J;
                    float f11 = lg0Var.H;
                    jVar.f16190b = f11;
                    jVar.f16191c = true;
                    o1.k kVar = jVar.f16198u;
                    float d = android.support.v4.media.a.d(lg0Var.t(), lg0Var.G, 2.0f, f11);
                    float f12 = AndroidUtilities.displaySize.x;
                    if (d >= f12 / 2.0f) {
                        dp = (f12 - (lg0Var.t() * lg0Var.G)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f16204i = dp;
                    lg0Var.J.f();
                    o1.j jVar2 = lg0Var.K;
                    jVar2.f16190b = lg0Var.I;
                    jVar2.f16191c = true;
                    jVar2.f16198u.f16204i = k7.n.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (lg0Var.r() * lg0Var.G)) - AndroidUtilities.dp(16.0f));
                    lg0Var.K.f();
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
        switch (this.f26269a) {
            case 1:
                lg0 lg0Var = this.f26270b;
                y61 y61Var = lg0Var.N;
                if (y61Var.f30899j) {
                    y61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    lg0Var.N.draw(canvas);
                }
                PhotoViewer photoViewer = lg0Var.S;
                if (photoViewer != null && photoViewer.Y3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    lg0Var.S.Y3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
