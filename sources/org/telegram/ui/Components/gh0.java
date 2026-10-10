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
public final class gh0 extends FrameLayout {
    public final int f26719a;
    public final hh0 f26720b;

    public gh0(hh0 hh0Var, Context context, int i10) {
        super(context);
        this.f26719a = i10;
        this.f26720b = hh0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26719a) {
            case 1:
                super.dispatchDraw(canvas);
                hh0 hh0Var = this.f26720b;
                qp0 qp0Var = hh0Var.R;
                if (qp0Var != null && qp0Var.a()) {
                    hh0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    hh0Var.R.draw(canvas);
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
        switch (this.f26719a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                hh0 hh0Var = this.f26720b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        hh0Var.f27022f0 = true;
                        hh0Var.f27023g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(hh0Var.f27024h0, 500L);
                    } else {
                        hh0Var.f27022f0 = false;
                        hh0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(hh0Var.f27024h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = hh0Var.V) != null && (kt0Var = photoViewer.f33927c4) != null && kt0Var.rewinding) {
                        kt0Var.setX(motionEvent.getX());
                    }
                } else {
                    hh0Var.f27022f0 = false;
                    hh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(hh0Var.f27024h0);
                }
                if (hh0Var.f27034y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(hh0Var.f27034y.getX(), hh0Var.f27034y.getY());
                    boolean dispatchTouchEvent = hh0Var.f27034y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        hh0Var.f27034y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = hh0Var.f27031s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!hh0Var.f27031s.isInProgress() && hh0Var.v.T0(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    hh0Var.f27032w = false;
                    hh0Var.f27033x = false;
                    if (hh0Var.f27018d0) {
                        hh0Var.f27018d0 = false;
                        hh0 hh0Var2 = hh0.f27011p0;
                        mv mvVar = hh0Var2.U;
                        if (mvVar != null) {
                            mvVar.H();
                        } else {
                            PhotoViewer photoViewer2 = hh0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        hh0.j(false);
                    } else {
                        o1.k kVar = hh0Var.M;
                        if (!kVar.f16935f) {
                            float f10 = hh0Var.K;
                            kVar.f16932b = f10;
                            kVar.f16933c = true;
                            o1.l lVar = kVar.f16942u;
                            int i10 = hh0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f16949i = dp;
                            hh0Var.M.h();
                        }
                        o1.k kVar2 = hh0Var.N;
                        if (!kVar2.f16935f) {
                            kVar2.f16932b = hh0Var.L;
                            kVar2.f16933c = true;
                            kVar2.f16942u.f16949i = w7.o.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - hh0Var.I) - AndroidUtilities.dp(16.0f));
                            hh0Var.N.h();
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
        switch (this.f26719a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                hh0 hh0Var = this.f26720b;
                hh0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(hh0Var.f27014b, hh0Var.d, hh0Var.f27016c);
                if (hh0Var.H != hh0Var.t() * hh0Var.J || hh0Var.I != hh0Var.r() * hh0Var.J) {
                    WindowManager.LayoutParams layoutParams = hh0Var.f27016c;
                    int t10 = (int) (hh0Var.t() * hh0Var.J);
                    hh0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = hh0Var.f27016c;
                    int r10 = (int) (hh0Var.r() * hh0Var.J);
                    hh0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(hh0Var.f27014b, hh0Var.d, hh0Var.f27016c);
                    o1.k kVar = hh0Var.M;
                    float f10 = hh0Var.K;
                    kVar.f16932b = f10;
                    kVar.f16933c = true;
                    o1.l lVar = kVar.f16942u;
                    float B = a1.g.B(hh0Var.t(), hh0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (hh0Var.t() * hh0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16949i = dp;
                    hh0Var.M.h();
                    o1.k kVar2 = hh0Var.N;
                    kVar2.f16932b = hh0Var.L;
                    kVar2.f16933c = true;
                    kVar2.f16942u.f16949i = w7.o.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (hh0Var.r() * hh0Var.J)) - AndroidUtilities.dp(16.0f));
                    hh0Var.N.h();
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
        switch (this.f26719a) {
            case 1:
                hh0 hh0Var = this.f26720b;
                c81 c81Var = hh0Var.Q;
                if (c81Var.f25231j) {
                    c81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    hh0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = hh0Var.V;
                if (photoViewer != null && photoViewer.f33917b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    hh0Var.V.f33917b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
