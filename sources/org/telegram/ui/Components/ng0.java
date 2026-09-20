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
public final class ng0 extends FrameLayout {
    public final int f26635a;
    public final og0 f26636b;

    public ng0(og0 og0Var, Context context, int i10) {
        super(context);
        this.f26635a = i10;
        this.f26636b = og0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26635a) {
            case 1:
                super.dispatchDraw(canvas);
                og0 og0Var = this.f26636b;
                xo0 xo0Var = og0Var.R;
                if (xo0Var != null && xo0Var.a()) {
                    og0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    og0Var.R.draw(canvas);
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
        switch (this.f26635a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                og0 og0Var = this.f26636b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        og0Var.f26922f0 = true;
                        og0Var.f26923g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(og0Var.f26924h0, 500L);
                    } else {
                        og0Var.f26922f0 = false;
                        og0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(og0Var.f26924h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = og0Var.V) != null && (kt0Var = photoViewer.f31207c4) != null && kt0Var.rewinding) {
                        kt0Var.setX(motionEvent.getX());
                    }
                } else {
                    og0Var.f26922f0 = false;
                    og0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(og0Var.f26924h0);
                }
                if (og0Var.f26934y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(og0Var.f26934y.getX(), og0Var.f26934y.getY());
                    boolean dispatchTouchEvent = og0Var.f26934y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        og0Var.f26934y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = og0Var.f26931s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!og0Var.f26931s.isInProgress() && og0Var.v.f0(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    og0Var.f26932w = false;
                    og0Var.f26933x = false;
                    if (og0Var.f26919d0) {
                        og0Var.f26919d0 = false;
                        og0 og0Var2 = og0.f26912p0;
                        vu vuVar = og0Var2.U;
                        if (vuVar != null) {
                            vuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = og0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        og0.j(false);
                    } else {
                        o1.k kVar = og0Var.M;
                        if (!kVar.f15515f) {
                            float f7 = og0Var.K;
                            kVar.f15513b = f7;
                            kVar.f15514c = true;
                            o1.l lVar = kVar.f15522u;
                            int i10 = og0Var.H;
                            float f10 = (i10 / 2.0f) + f7;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f10 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f15528i = dp;
                            og0Var.M.f();
                        }
                        o1.k kVar2 = og0Var.N;
                        if (!kVar2.f15515f) {
                            float f11 = og0Var.L;
                            kVar2.f15513b = f11;
                            kVar2.f15514c = true;
                            kVar2.f15522u.f15528i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - og0Var.I) - AndroidUtilities.dp(16.0f));
                            og0Var.N.f();
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
        switch (this.f26635a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                og0 og0Var = this.f26636b;
                og0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(og0Var.f26915b, og0Var.d, og0Var.f26917c);
                if (og0Var.H != og0Var.t() * og0Var.J || og0Var.I != og0Var.r() * og0Var.J) {
                    WindowManager.LayoutParams layoutParams = og0Var.f26917c;
                    int t10 = (int) (og0Var.t() * og0Var.J);
                    og0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = og0Var.f26917c;
                    int r10 = (int) (og0Var.r() * og0Var.J);
                    og0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(og0Var.f26915b, og0Var.d, og0Var.f26917c);
                    o1.k kVar = og0Var.M;
                    float f10 = og0Var.K;
                    kVar.f15513b = f10;
                    kVar.f15514c = true;
                    o1.l lVar = kVar.f15522u;
                    float A = a4.a.A(og0Var.t(), og0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (A >= f11 / 2.0f) {
                        dp = (f11 - (og0Var.t() * og0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15528i = dp;
                    og0Var.M.f();
                    o1.k kVar2 = og0Var.N;
                    kVar2.f15513b = og0Var.L;
                    kVar2.f15514c = true;
                    kVar2.f15522u.f15528i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (og0Var.r() * og0Var.J)) - AndroidUtilities.dp(16.0f));
                    og0Var.N.f();
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
        switch (this.f26635a) {
            case 1:
                og0 og0Var = this.f26636b;
                k71 k71Var = og0Var.Q;
                if (k71Var.f25694j) {
                    k71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    og0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null && photoViewer.f31197b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    og0Var.V.f31197b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
