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
public final class og0 extends FrameLayout {
    public final int f26931a;
    public final pg0 f26932b;

    public og0(pg0 pg0Var, Context context, int i10) {
        super(context);
        this.f26931a = i10;
        this.f26932b = pg0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26931a) {
            case 1:
                super.dispatchDraw(canvas);
                pg0 pg0Var = this.f26932b;
                yo0 yo0Var = pg0Var.R;
                if (yo0Var != null && yo0Var.a()) {
                    pg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    pg0Var.R.draw(canvas);
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
        switch (this.f26931a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                pg0 pg0Var = this.f26932b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        pg0Var.f27219f0 = true;
                        pg0Var.f27220g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(pg0Var.f27221h0, 500L);
                    } else {
                        pg0Var.f27219f0 = false;
                        pg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(pg0Var.f27221h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = pg0Var.V) != null && (kt0Var = photoViewer.f31167c4) != null && kt0Var.rewinding) {
                        kt0Var.setX(motionEvent.getX());
                    }
                } else {
                    pg0Var.f27219f0 = false;
                    pg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(pg0Var.f27221h0);
                }
                if (pg0Var.f27231y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(pg0Var.f27231y.getX(), pg0Var.f27231y.getY());
                    boolean dispatchTouchEvent = pg0Var.f27231y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        pg0Var.f27231y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = pg0Var.f27228s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!pg0Var.f27228s.isInProgress() && pg0Var.v.g0(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    pg0Var.f27229w = false;
                    pg0Var.f27230x = false;
                    if (pg0Var.f27216d0) {
                        pg0Var.f27216d0 = false;
                        pg0 pg0Var2 = pg0.f27209p0;
                        vu vuVar = pg0Var2.U;
                        if (vuVar != null) {
                            vuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = pg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        pg0.j(false);
                    } else {
                        o1.k kVar = pg0Var.M;
                        if (!kVar.f15483f) {
                            float f7 = pg0Var.K;
                            kVar.f15481b = f7;
                            kVar.f15482c = true;
                            o1.l lVar = kVar.f15490u;
                            int i10 = pg0Var.H;
                            float f10 = (i10 / 2.0f) + f7;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f10 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f15496i = dp;
                            pg0Var.M.f();
                        }
                        o1.k kVar2 = pg0Var.N;
                        if (!kVar2.f15483f) {
                            float f11 = pg0Var.L;
                            kVar2.f15481b = f11;
                            kVar2.f15482c = true;
                            kVar2.f15490u.f15496i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pg0Var.I) - AndroidUtilities.dp(16.0f));
                            pg0Var.N.f();
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
        switch (this.f26931a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                pg0 pg0Var = this.f26932b;
                pg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(pg0Var.f27212b, pg0Var.d, pg0Var.f27214c);
                if (pg0Var.H != pg0Var.t() * pg0Var.J || pg0Var.I != pg0Var.r() * pg0Var.J) {
                    WindowManager.LayoutParams layoutParams = pg0Var.f27214c;
                    int t10 = (int) (pg0Var.t() * pg0Var.J);
                    pg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = pg0Var.f27214c;
                    int r10 = (int) (pg0Var.r() * pg0Var.J);
                    pg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(pg0Var.f27212b, pg0Var.d, pg0Var.f27214c);
                    o1.k kVar = pg0Var.M;
                    float f10 = pg0Var.K;
                    kVar.f15481b = f10;
                    kVar.f15482c = true;
                    o1.l lVar = kVar.f15490u;
                    float A = a4.a.A(pg0Var.t(), pg0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (A >= f11 / 2.0f) {
                        dp = (f11 - (pg0Var.t() * pg0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15496i = dp;
                    pg0Var.M.f();
                    o1.k kVar2 = pg0Var.N;
                    kVar2.f15481b = pg0Var.L;
                    kVar2.f15482c = true;
                    kVar2.f15490u.f15496i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (pg0Var.r() * pg0Var.J)) - AndroidUtilities.dp(16.0f));
                    pg0Var.N.f();
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
        switch (this.f26931a) {
            case 1:
                pg0 pg0Var = this.f26932b;
                l71 l71Var = pg0Var.Q;
                if (l71Var.f26058j) {
                    l71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    pg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = pg0Var.V;
                if (photoViewer != null && photoViewer.f31157b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    pg0Var.V.f31157b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
