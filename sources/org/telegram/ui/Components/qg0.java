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
public final class qg0 extends FrameLayout {
    public final int f27557a;
    public final rg0 f27558b;

    public qg0(rg0 rg0Var, Context context, int i10) {
        super(context);
        this.f27557a = i10;
        this.f27558b = rg0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f27557a) {
            case 1:
                super.dispatchDraw(canvas);
                rg0 rg0Var = this.f27558b;
                zo0 zo0Var = rg0Var.R;
                if (zo0Var != null && zo0Var.a()) {
                    rg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    rg0Var.R.draw(canvas);
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
        switch (this.f27557a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                rg0 rg0Var = this.f27558b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        rg0Var.f27970f0 = true;
                        rg0Var.f27971g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(rg0Var.f27972h0, 500L);
                    } else {
                        rg0Var.f27970f0 = false;
                        rg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(rg0Var.f27972h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = rg0Var.V) != null && (kt0Var = photoViewer.f31228c4) != null && kt0Var.rewinding) {
                        kt0Var.setX(motionEvent.getX());
                    }
                } else {
                    rg0Var.f27970f0 = false;
                    rg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(rg0Var.f27972h0);
                }
                if (rg0Var.f27982y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(rg0Var.f27982y.getX(), rg0Var.f27982y.getY());
                    boolean dispatchTouchEvent = rg0Var.f27982y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        rg0Var.f27982y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = rg0Var.f27979s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!rg0Var.f27979s.isInProgress() && rg0Var.v.J(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    rg0Var.f27980w = false;
                    rg0Var.f27981x = false;
                    if (rg0Var.f27967d0) {
                        rg0Var.f27967d0 = false;
                        rg0 rg0Var2 = rg0.f27960p0;
                        vu vuVar = rg0Var2.U;
                        if (vuVar != null) {
                            vuVar.G();
                        } else {
                            PhotoViewer photoViewer2 = rg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        rg0.j(false);
                    } else {
                        o1.k kVar = rg0Var.M;
                        if (!kVar.f15530f) {
                            float f7 = rg0Var.K;
                            kVar.f15528b = f7;
                            kVar.f15529c = true;
                            o1.l lVar = kVar.f15537u;
                            int i10 = rg0Var.H;
                            float f10 = (i10 / 2.0f) + f7;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f10 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f15543i = dp;
                            rg0Var.M.f();
                        }
                        o1.k kVar2 = rg0Var.N;
                        if (!kVar2.f15530f) {
                            float f11 = rg0Var.L;
                            kVar2.f15528b = f11;
                            kVar2.f15529c = true;
                            kVar2.f15537u.f15543i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rg0Var.I) - AndroidUtilities.dp(16.0f));
                            rg0Var.N.f();
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
        switch (this.f27557a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                rg0 rg0Var = this.f27558b;
                rg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(rg0Var.f27963b, rg0Var.d, rg0Var.f27965c);
                if (rg0Var.H != rg0Var.t() * rg0Var.J || rg0Var.I != rg0Var.r() * rg0Var.J) {
                    WindowManager.LayoutParams layoutParams = rg0Var.f27965c;
                    int t10 = (int) (rg0Var.t() * rg0Var.J);
                    rg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = rg0Var.f27965c;
                    int r10 = (int) (rg0Var.r() * rg0Var.J);
                    rg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(rg0Var.f27963b, rg0Var.d, rg0Var.f27965c);
                    o1.k kVar = rg0Var.M;
                    float f10 = rg0Var.K;
                    kVar.f15528b = f10;
                    kVar.f15529c = true;
                    o1.l lVar = kVar.f15537u;
                    float A = a4.a.A(rg0Var.t(), rg0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (A >= f11 / 2.0f) {
                        dp = (f11 - (rg0Var.t() * rg0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15543i = dp;
                    rg0Var.M.f();
                    o1.k kVar2 = rg0Var.N;
                    kVar2.f15528b = rg0Var.L;
                    kVar2.f15529c = true;
                    kVar2.f15537u.f15543i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (rg0Var.r() * rg0Var.J)) - AndroidUtilities.dp(16.0f));
                    rg0Var.N.f();
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
        switch (this.f27557a) {
            case 1:
                rg0 rg0Var = this.f27558b;
                n71 n71Var = rg0Var.Q;
                if (n71Var.f26680j) {
                    n71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    rg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null && photoViewer.f31218b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    rg0Var.V.f31218b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
