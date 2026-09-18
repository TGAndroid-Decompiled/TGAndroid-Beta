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
public final class eg0 extends FrameLayout {
    public final int f23553a;
    public final fg0 f23554b;

    public eg0(fg0 fg0Var, Context context, int i10) {
        super(context);
        this.f23553a = i10;
        this.f23554b = fg0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f23553a) {
            case 1:
                super.dispatchDraw(canvas);
                fg0 fg0Var = this.f23554b;
                lo0 lo0Var = fg0Var.R;
                if (lo0Var != null && lo0Var.a()) {
                    fg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    fg0Var.R.draw(canvas);
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
        org.telegram.ui.mt0 mt0Var;
        switch (this.f23553a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                fg0 fg0Var = this.f23554b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        fg0Var.f23924f0 = true;
                        fg0Var.f23925g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(fg0Var.f23926h0, 500L);
                    } else {
                        fg0Var.f23924f0 = false;
                        fg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(fg0Var.f23926h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = fg0Var.V) != null && (mt0Var = photoViewer.f30940c4) != null && mt0Var.rewinding) {
                        mt0Var.setX(motionEvent.getX());
                    }
                } else {
                    fg0Var.f23924f0 = false;
                    fg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(fg0Var.f23926h0);
                }
                if (fg0Var.f23936y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(fg0Var.f23936y.getX(), fg0Var.f23936y.getY());
                    boolean dispatchTouchEvent = fg0Var.f23936y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        fg0Var.f23936y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = fg0Var.f23933s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!fg0Var.f23933s.isInProgress() && fg0Var.v.y(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    fg0Var.f23934w = false;
                    fg0Var.f23935x = false;
                    if (fg0Var.f23921d0) {
                        fg0Var.f23921d0 = false;
                        fg0 fg0Var2 = fg0.f23914p0;
                        vu vuVar = fg0Var2.U;
                        if (vuVar != null) {
                            vuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = fg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        fg0.j(false);
                    } else {
                        o1.k kVar = fg0Var.M;
                        if (!kVar.f15354f) {
                            float f7 = fg0Var.K;
                            kVar.f15352b = f7;
                            kVar.f15353c = true;
                            o1.l lVar = kVar.f15361u;
                            int i10 = fg0Var.H;
                            float f10 = (i10 / 2.0f) + f7;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f10 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f15367i = dp;
                            fg0Var.M.f();
                        }
                        o1.k kVar2 = fg0Var.N;
                        if (!kVar2.f15354f) {
                            float f11 = fg0Var.L;
                            kVar2.f15352b = f11;
                            kVar2.f15353c = true;
                            kVar2.f15361u.f15367i = w7.p.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fg0Var.I) - AndroidUtilities.dp(16.0f));
                            fg0Var.N.f();
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
        switch (this.f23553a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                fg0 fg0Var = this.f23554b;
                fg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(fg0Var.f23917b, fg0Var.d, fg0Var.f23919c);
                if (fg0Var.H != fg0Var.t() * fg0Var.J || fg0Var.I != fg0Var.r() * fg0Var.J) {
                    WindowManager.LayoutParams layoutParams = fg0Var.f23919c;
                    int t10 = (int) (fg0Var.t() * fg0Var.J);
                    fg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = fg0Var.f23919c;
                    int r10 = (int) (fg0Var.r() * fg0Var.J);
                    fg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(fg0Var.f23917b, fg0Var.d, fg0Var.f23919c);
                    o1.k kVar = fg0Var.M;
                    float f10 = fg0Var.K;
                    kVar.f15352b = f10;
                    kVar.f15353c = true;
                    o1.l lVar = kVar.f15361u;
                    float A = a4.a.A(fg0Var.t(), fg0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (A >= f11 / 2.0f) {
                        dp = (f11 - (fg0Var.t() * fg0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15367i = dp;
                    fg0Var.M.f();
                    o1.k kVar2 = fg0Var.N;
                    kVar2.f15352b = fg0Var.L;
                    kVar2.f15353c = true;
                    kVar2.f15361u.f15367i = w7.p.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (fg0Var.r() * fg0Var.J)) - AndroidUtilities.dp(16.0f));
                    fg0Var.N.f();
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
        switch (this.f23553a) {
            case 1:
                fg0 fg0Var = this.f23554b;
                x61 x61Var = fg0Var.Q;
                if (x61Var.f29871j) {
                    x61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    fg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = fg0Var.V;
                if (photoViewer != null && photoViewer.f30930b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    fg0Var.V.f30930b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
