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
public final class of0 extends FrameLayout {
    public final int f31378a;
    public final pf0 f31379b;

    public of0(pf0 pf0Var, Context context, int i9) {
        super(context);
        this.f31378a = i9;
        this.f31379b = pf0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f31378a) {
            case 1:
                super.dispatchDraw(canvas);
                pf0 pf0Var = this.f31379b;
                tn0 tn0Var = pf0Var.N;
                if (tn0Var != null && tn0Var.a()) {
                    pf0Var.N.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    pf0Var.N.draw(canvas);
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
        int dp;
        PhotoViewer photoViewer;
        org.telegram.ui.hs0 hs0Var;
        switch (this.f31378a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                pf0 pf0Var = this.f31379b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        pf0Var.f31626b0 = true;
                        pf0Var.f31628c0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(pf0Var.f31629d0, 500L);
                    } else {
                        pf0Var.f31626b0 = false;
                        pf0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(pf0Var.f31629d0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = pf0Var.R) != null && (hs0Var = photoViewer.Y3) != null && hs0Var.rewinding) {
                        hs0Var.setX(motionEvent.getX());
                    }
                } else {
                    pf0Var.f31626b0 = false;
                    pf0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(pf0Var.f31629d0);
                }
                if (pf0Var.f31642y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(pf0Var.f31642y.getX(), pf0Var.f31642y.getY());
                    boolean dispatchTouchEvent = pf0Var.f31642y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        pf0Var.f31642y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = pf0Var.f31639s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!pf0Var.f31639s.isInProgress() && pf0Var.v.a1(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    pf0Var.f31640w = false;
                    pf0Var.f31641x = false;
                    if (pf0Var.Z) {
                        pf0Var.Z = false;
                        pf0 pf0Var2 = pf0.f31622l0;
                        gu guVar = pf0Var2.Q;
                        if (guVar != null) {
                            guVar.G();
                        } else {
                            PhotoViewer photoViewer2 = pf0Var2.R;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        pf0.j(false);
                    } else {
                        o1.j jVar = pf0Var.I;
                        if (!jVar.f18794f) {
                            float f10 = pf0Var.G;
                            jVar.f18791b = f10;
                            jVar.f18792c = true;
                            o1.k kVar = jVar.f18800u;
                            int i9 = pf0Var.D;
                            float f11 = (i9 / 2.0f) + f10;
                            int i10 = AndroidUtilities.displaySize.x;
                            if (f11 >= i10 / 2.0f) {
                                dp = (i10 - i9) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            kVar.f18807i = dp;
                            pf0Var.I.f();
                        }
                        o1.j jVar2 = pf0Var.J;
                        if (!jVar2.f18794f) {
                            float f12 = pf0Var.H;
                            jVar2.f18791b = f12;
                            jVar2.f18792c = true;
                            jVar2.f18800u.f18807i = g7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pf0Var.E) - AndroidUtilities.dp(16.0f));
                            pf0Var.J.f();
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
        float f10;
        switch (this.f31378a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                pf0 pf0Var = this.f31379b;
                pf0Var.C = null;
                AndroidUtilities.setPreferredMaxRefreshRate(pf0Var.f31625b, pf0Var.d, pf0Var.f31627c);
                if (pf0Var.D != pf0Var.t() * pf0Var.F || pf0Var.E != pf0Var.r() * pf0Var.F) {
                    WindowManager.LayoutParams layoutParams = pf0Var.f31627c;
                    int t10 = (int) (pf0Var.t() * pf0Var.F);
                    pf0Var.D = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = pf0Var.f31627c;
                    int r10 = (int) (pf0Var.r() * pf0Var.F);
                    pf0Var.E = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(pf0Var.f31625b, pf0Var.d, pf0Var.f31627c);
                    o1.j jVar = pf0Var.I;
                    float f11 = pf0Var.G;
                    jVar.f18791b = f11;
                    jVar.f18792c = true;
                    o1.k kVar = jVar.f18800u;
                    float d = aa.d.d(pf0Var.t(), pf0Var.F, 2.0f, f11);
                    float f12 = AndroidUtilities.displaySize.x;
                    if (d >= f12 / 2.0f) {
                        dp = (f12 - (pf0Var.t() * pf0Var.F)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f18807i = dp;
                    pf0Var.I.f();
                    o1.j jVar2 = pf0Var.J;
                    jVar2.f18791b = pf0Var.H;
                    jVar2.f18792c = true;
                    jVar2.f18800u.f18807i = g7.n.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (pf0Var.r() * pf0Var.F)) - AndroidUtilities.dp(16.0f));
                    pf0Var.J.f();
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
        switch (this.f31378a) {
            case 1:
                pf0 pf0Var = this.f31379b;
                a61 a61Var = pf0Var.M;
                if (a61Var.f26702j) {
                    a61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    pf0Var.M.draw(canvas);
                }
                PhotoViewer photoViewer = pf0Var.R;
                if (photoViewer != null && photoViewer.X3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    pf0Var.R.X3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
