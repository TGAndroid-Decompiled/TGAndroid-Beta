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
public final class fh0 extends FrameLayout {
    public final int f26368a;
    public final gh0 f26369b;

    public fh0(gh0 gh0Var, Context context, int i10) {
        super(context);
        this.f26368a = i10;
        this.f26369b = gh0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26368a) {
            case 1:
                super.dispatchDraw(canvas);
                gh0 gh0Var = this.f26369b;
                pp0 pp0Var = gh0Var.R;
                if (pp0Var != null && pp0Var.a()) {
                    gh0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    gh0Var.R.draw(canvas);
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
        org.telegram.ui.kt0 kt0Var;
        switch (this.f26368a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                gh0 gh0Var = this.f26369b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        gh0Var.f26711f0 = true;
                        gh0Var.f26712g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(gh0Var.f26713h0, 500L);
                    } else {
                        gh0Var.f26711f0 = false;
                        gh0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(gh0Var.f26713h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = gh0Var.V) != null && (kt0Var = photoViewer.f33889c4) != null && kt0Var.rewinding) {
                        kt0Var.setX(motionEvent.getX());
                    }
                } else {
                    gh0Var.f26711f0 = false;
                    gh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(gh0Var.f26713h0);
                }
                if (gh0Var.f26723y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(gh0Var.f26723y.getX(), gh0Var.f26723y.getY());
                    boolean dispatchTouchEvent = gh0Var.f26723y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        gh0Var.f26723y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = gh0Var.f26720s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!gh0Var.f26720s.isInProgress() && gh0Var.v.T0(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    gh0Var.f26721w = false;
                    gh0Var.f26722x = false;
                    if (gh0Var.f26707d0) {
                        gh0Var.f26707d0 = false;
                        gh0 gh0Var2 = gh0.f26700p0;
                        lv lvVar = gh0Var2.U;
                        if (lvVar != null) {
                            lvVar.H();
                        } else {
                            PhotoViewer photoViewer2 = gh0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        gh0.j(false);
                    } else {
                        o1.k kVar = gh0Var.M;
                        if (!kVar.f16931f) {
                            float f10 = gh0Var.K;
                            kVar.f16928b = f10;
                            kVar.f16929c = true;
                            o1.l lVar = kVar.f16938u;
                            int i10 = gh0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f16945i = dp;
                            gh0Var.M.h();
                        }
                        o1.k kVar2 = gh0Var.N;
                        if (!kVar2.f16931f) {
                            kVar2.f16928b = gh0Var.L;
                            kVar2.f16929c = true;
                            kVar2.f16938u.f16945i = w7.o.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - gh0Var.I) - AndroidUtilities.dp(16.0f));
                            gh0Var.N.h();
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
        switch (this.f26368a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                gh0 gh0Var = this.f26369b;
                gh0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(gh0Var.f26703b, gh0Var.d, gh0Var.f26705c);
                if (gh0Var.H != gh0Var.t() * gh0Var.J || gh0Var.I != gh0Var.r() * gh0Var.J) {
                    WindowManager.LayoutParams layoutParams = gh0Var.f26705c;
                    int t10 = (int) (gh0Var.t() * gh0Var.J);
                    gh0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = gh0Var.f26705c;
                    int r10 = (int) (gh0Var.r() * gh0Var.J);
                    gh0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(gh0Var.f26703b, gh0Var.d, gh0Var.f26705c);
                    o1.k kVar = gh0Var.M;
                    float f10 = gh0Var.K;
                    kVar.f16928b = f10;
                    kVar.f16929c = true;
                    o1.l lVar = kVar.f16938u;
                    float B = a1.g.B(gh0Var.t(), gh0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (gh0Var.t() * gh0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16945i = dp;
                    gh0Var.M.h();
                    o1.k kVar2 = gh0Var.N;
                    kVar2.f16928b = gh0Var.L;
                    kVar2.f16929c = true;
                    kVar2.f16938u.f16945i = w7.o.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (gh0Var.r() * gh0Var.J)) - AndroidUtilities.dp(16.0f));
                    gh0Var.N.h();
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
        switch (this.f26368a) {
            case 1:
                gh0 gh0Var = this.f26369b;
                b81 b81Var = gh0Var.Q;
                if (b81Var.f24939j) {
                    b81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    gh0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = gh0Var.V;
                if (photoViewer != null && photoViewer.f33879b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    gh0Var.V.f33879b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
