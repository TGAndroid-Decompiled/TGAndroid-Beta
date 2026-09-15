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
public final class dg0 extends FrameLayout {
    public final int f23321a;
    public final eg0 f23322b;

    public dg0(eg0 eg0Var, Context context, int i10) {
        super(context);
        this.f23321a = i10;
        this.f23322b = eg0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f23321a) {
            case 1:
                super.dispatchDraw(canvas);
                eg0 eg0Var = this.f23322b;
                ko0 ko0Var = eg0Var.R;
                if (ko0Var != null && ko0Var.a()) {
                    eg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    eg0Var.R.draw(canvas);
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
        org.telegram.ui.kt0 kt0Var;
        switch (this.f23321a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                eg0 eg0Var = this.f23322b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        eg0Var.f23648f0 = true;
                        eg0Var.f23649g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(eg0Var.f23650h0, 500L);
                    } else {
                        eg0Var.f23648f0 = false;
                        eg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(eg0Var.f23650h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = eg0Var.V) != null && (kt0Var = photoViewer.f30922c4) != null && kt0Var.rewinding) {
                        kt0Var.setX(motionEvent.getX());
                    }
                } else {
                    eg0Var.f23648f0 = false;
                    eg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(eg0Var.f23650h0);
                }
                if (eg0Var.f23660y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(eg0Var.f23660y.getX(), eg0Var.f23660y.getY());
                    boolean dispatchTouchEvent = eg0Var.f23660y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        eg0Var.f23660y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = eg0Var.f23657s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!eg0Var.f23657s.isInProgress() && eg0Var.v.y(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    eg0Var.f23658w = false;
                    eg0Var.f23659x = false;
                    if (eg0Var.f23645d0) {
                        eg0Var.f23645d0 = false;
                        eg0 eg0Var2 = eg0.f23638p0;
                        vu vuVar = eg0Var2.U;
                        if (vuVar != null) {
                            vuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = eg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        eg0.j(false);
                    } else {
                        o1.k kVar = eg0Var.M;
                        if (!kVar.f15344f) {
                            float f7 = eg0Var.K;
                            kVar.f15342b = f7;
                            kVar.f15343c = true;
                            o1.l lVar = kVar.f15351u;
                            int i10 = eg0Var.H;
                            float f10 = (i10 / 2.0f) + f7;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f10 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f15357i = dp;
                            eg0Var.M.f();
                        }
                        o1.k kVar2 = eg0Var.N;
                        if (!kVar2.f15344f) {
                            float f11 = eg0Var.L;
                            kVar2.f15342b = f11;
                            kVar2.f15343c = true;
                            kVar2.f15351u.f15357i = w7.p.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - eg0Var.I) - AndroidUtilities.dp(16.0f));
                            eg0Var.N.f();
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
        switch (this.f23321a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                eg0 eg0Var = this.f23322b;
                eg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(eg0Var.f23641b, eg0Var.d, eg0Var.f23643c);
                if (eg0Var.H != eg0Var.t() * eg0Var.J || eg0Var.I != eg0Var.r() * eg0Var.J) {
                    WindowManager.LayoutParams layoutParams = eg0Var.f23643c;
                    int t10 = (int) (eg0Var.t() * eg0Var.J);
                    eg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = eg0Var.f23643c;
                    int r10 = (int) (eg0Var.r() * eg0Var.J);
                    eg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(eg0Var.f23641b, eg0Var.d, eg0Var.f23643c);
                    o1.k kVar = eg0Var.M;
                    float f10 = eg0Var.K;
                    kVar.f15342b = f10;
                    kVar.f15343c = true;
                    o1.l lVar = kVar.f15351u;
                    float A = a4.a.A(eg0Var.t(), eg0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (A >= f11 / 2.0f) {
                        dp = (f11 - (eg0Var.t() * eg0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15357i = dp;
                    eg0Var.M.f();
                    o1.k kVar2 = eg0Var.N;
                    kVar2.f15342b = eg0Var.L;
                    kVar2.f15343c = true;
                    kVar2.f15351u.f15357i = w7.p.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (eg0Var.r() * eg0Var.J)) - AndroidUtilities.dp(16.0f));
                    eg0Var.N.f();
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
        switch (this.f23321a) {
            case 1:
                eg0 eg0Var = this.f23322b;
                w61 w61Var = eg0Var.Q;
                if (w61Var.f29630j) {
                    w61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    eg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null && photoViewer.f30912b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    eg0Var.V.f30912b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
