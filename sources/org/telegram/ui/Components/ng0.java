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
    public final int f25510a;
    public final og0 f25511b;

    public ng0(og0 og0Var, Context context, int i10) {
        super(context);
        this.f25510a = i10;
        this.f25511b = og0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f25510a) {
            case 1:
                super.dispatchDraw(canvas);
                og0 og0Var = this.f25511b;
                to0 to0Var = og0Var.R;
                if (to0Var != null && to0Var.a()) {
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
        org.telegram.ui.jt0 jt0Var;
        switch (this.f25510a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                og0 og0Var = this.f25511b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        og0Var.f25791f0 = true;
                        og0Var.f25792g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(og0Var.f25793h0, 500L);
                    } else {
                        og0Var.f25791f0 = false;
                        og0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(og0Var.f25793h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = og0Var.V) != null && (jt0Var = photoViewer.f30035c4) != null && jt0Var.rewinding) {
                        jt0Var.setX(motionEvent.getX());
                    }
                } else {
                    og0Var.f25791f0 = false;
                    og0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(og0Var.f25793h0);
                }
                if (og0Var.f25803y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(og0Var.f25803y.getX(), og0Var.f25803y.getY());
                    boolean dispatchTouchEvent = og0Var.f25803y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        og0Var.f25803y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = og0Var.f25800s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!og0Var.f25800s.isInProgress() && og0Var.v.B(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    og0Var.f25801w = false;
                    og0Var.f25802x = false;
                    if (og0Var.f25788d0) {
                        og0Var.f25788d0 = false;
                        og0 og0Var2 = og0.f25781p0;
                        zu zuVar = og0Var2.U;
                        if (zuVar != null) {
                            zuVar.H();
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
                        if (!kVar.f14127f) {
                            float f7 = og0Var.K;
                            kVar.f14125b = f7;
                            kVar.f14126c = true;
                            o1.l lVar = kVar.f14134u;
                            int i10 = og0Var.H;
                            float f10 = (i10 / 2.0f) + f7;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f10 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f14140i = dp;
                            og0Var.M.f();
                        }
                        o1.k kVar2 = og0Var.N;
                        if (!kVar2.f14127f) {
                            float f11 = og0Var.L;
                            kVar2.f14125b = f11;
                            kVar2.f14126c = true;
                            kVar2.f14134u.f14140i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - og0Var.I) - AndroidUtilities.dp(16.0f));
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
        switch (this.f25510a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                og0 og0Var = this.f25511b;
                og0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(og0Var.f25784b, og0Var.d, og0Var.f25786c);
                if (og0Var.H != og0Var.t() * og0Var.J || og0Var.I != og0Var.r() * og0Var.J) {
                    WindowManager.LayoutParams layoutParams = og0Var.f25786c;
                    int t10 = (int) (og0Var.t() * og0Var.J);
                    og0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = og0Var.f25786c;
                    int r10 = (int) (og0Var.r() * og0Var.J);
                    og0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(og0Var.f25784b, og0Var.d, og0Var.f25786c);
                    o1.k kVar = og0Var.M;
                    float f10 = og0Var.K;
                    kVar.f14125b = f10;
                    kVar.f14126c = true;
                    o1.l lVar = kVar.f14134u;
                    float A = a4.a.A(og0Var.t(), og0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (A >= f11 / 2.0f) {
                        dp = (f11 - (og0Var.t() * og0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f14140i = dp;
                    og0Var.M.f();
                    o1.k kVar2 = og0Var.N;
                    kVar2.f14125b = og0Var.L;
                    kVar2.f14126c = true;
                    kVar2.f14134u.f14140i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (og0Var.r() * og0Var.J)) - AndroidUtilities.dp(16.0f));
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
        switch (this.f25510a) {
            case 1:
                og0 og0Var = this.f25511b;
                j71 j71Var = og0Var.Q;
                if (j71Var.f24268j) {
                    j71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    og0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null && photoViewer.f30025b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    og0Var.V.f30025b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
