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
public final class mg0 extends FrameLayout {
    public final int f29046a;
    public final ng0 f29047b;

    public mg0(ng0 ng0Var, Context context, int i10) {
        super(context);
        this.f29046a = i10;
        this.f29047b = ng0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f29046a) {
            case 1:
                super.dispatchDraw(canvas);
                ng0 ng0Var = this.f29047b;
                oo0 oo0Var = ng0Var.O;
                if (oo0Var != null && oo0Var.a()) {
                    ng0Var.O.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ng0Var.O.draw(canvas);
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
        org.telegram.ui.ws0 ws0Var;
        switch (this.f29046a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ng0 ng0Var = this.f29047b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        ng0Var.f29468c0 = true;
                        ng0Var.f29469d0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(ng0Var.f29471e0, 500L);
                    } else {
                        ng0Var.f29468c0 = false;
                        ng0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(ng0Var.f29471e0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = ng0Var.S) != null && (ws0Var = photoViewer.Z3) != null && ws0Var.rewinding) {
                        ws0Var.setX(motionEvent.getX());
                    }
                } else {
                    ng0Var.f29468c0 = false;
                    ng0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ng0Var.f29471e0);
                }
                if (ng0Var.f29483y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(ng0Var.f29483y.getX(), ng0Var.f29483y.getY());
                    boolean dispatchTouchEvent = ng0Var.f29483y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        ng0Var.f29483y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = ng0Var.f29480s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!ng0Var.f29480s.isInProgress() && ng0Var.v.J(motionEvent)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ng0Var.f29481w = false;
                    ng0Var.f29482x = false;
                    if (ng0Var.f29464a0) {
                        ng0Var.f29464a0 = false;
                        ng0 ng0Var2 = ng0.m0;
                        ru ruVar = ng0Var2.R;
                        if (ruVar != null) {
                            ruVar.G();
                        } else {
                            PhotoViewer photoViewer2 = ng0Var2.S;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        ng0.j(false);
                    } else {
                        o1.j jVar = ng0Var.J;
                        if (!jVar.f16332f) {
                            float f10 = ng0Var.H;
                            jVar.f16329b = f10;
                            jVar.f16330c = true;
                            o1.k kVar = jVar.f16338u;
                            int i10 = ng0Var.E;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            kVar.f16345i = dp;
                            ng0Var.J.f();
                        }
                        o1.j jVar2 = ng0Var.K;
                        if (!jVar2.f16332f) {
                            float f12 = ng0Var.I;
                            jVar2.f16329b = f12;
                            jVar2.f16330c = true;
                            jVar2.f16338u.f16345i = k7.o.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ng0Var.F) - AndroidUtilities.dp(16.0f));
                            ng0Var.K.f();
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
        switch (this.f29046a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                ng0 ng0Var = this.f29047b;
                ng0Var.D = null;
                AndroidUtilities.setPreferredMaxRefreshRate(ng0Var.f29465b, ng0Var.d, ng0Var.f29467c);
                if (ng0Var.E != ng0Var.t() * ng0Var.G || ng0Var.F != ng0Var.r() * ng0Var.G) {
                    WindowManager.LayoutParams layoutParams = ng0Var.f29467c;
                    int t6 = (int) (ng0Var.t() * ng0Var.G);
                    ng0Var.E = t6;
                    layoutParams.width = t6;
                    WindowManager.LayoutParams layoutParams2 = ng0Var.f29467c;
                    int r10 = (int) (ng0Var.r() * ng0Var.G);
                    ng0Var.F = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(ng0Var.f29465b, ng0Var.d, ng0Var.f29467c);
                    o1.j jVar = ng0Var.J;
                    float f11 = ng0Var.H;
                    jVar.f16329b = f11;
                    jVar.f16330c = true;
                    o1.k kVar = jVar.f16338u;
                    float d = android.support.v4.media.a.d(ng0Var.t(), ng0Var.G, 2.0f, f11);
                    float f12 = AndroidUtilities.displaySize.x;
                    if (d >= f12 / 2.0f) {
                        dp = (f12 - (ng0Var.t() * ng0Var.G)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f16345i = dp;
                    ng0Var.J.f();
                    o1.j jVar2 = ng0Var.K;
                    jVar2.f16329b = ng0Var.I;
                    jVar2.f16330c = true;
                    jVar2.f16338u.f16345i = k7.o.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (ng0Var.r() * ng0Var.G)) - AndroidUtilities.dp(16.0f));
                    ng0Var.K.f();
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
        switch (this.f29046a) {
            case 1:
                ng0 ng0Var = this.f29047b;
                z61 z61Var = ng0Var.N;
                if (z61Var.f33820j) {
                    z61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ng0Var.N.draw(canvas);
                }
                PhotoViewer photoViewer = ng0Var.S;
                if (photoViewer != null && photoViewer.Y3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    ng0Var.S.Y3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
