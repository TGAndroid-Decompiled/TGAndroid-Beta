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
public final class pg0 extends FrameLayout {
    public final int f27347a;
    public final qg0 f27348b;

    public pg0(qg0 qg0Var, Context context, int i10) {
        super(context);
        this.f27347a = i10;
        this.f27348b = qg0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f27347a) {
            case 1:
                super.dispatchDraw(canvas);
                qg0 qg0Var = this.f27348b;
                zo0 zo0Var = qg0Var.R;
                if (zo0Var != null && zo0Var.a()) {
                    qg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    qg0Var.R.draw(canvas);
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
        org.telegram.ui.ct0 ct0Var;
        switch (this.f27347a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                qg0 qg0Var = this.f27348b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        qg0Var.f27700f0 = true;
                        qg0Var.f27701g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(qg0Var.f27702h0, 500L);
                    } else {
                        qg0Var.f27700f0 = false;
                        qg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(qg0Var.f27702h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = qg0Var.V) != null && (ct0Var = photoViewer.f31209c4) != null && ct0Var.rewinding) {
                        ct0Var.setX(motionEvent.getX());
                    }
                } else {
                    qg0Var.f27700f0 = false;
                    qg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(qg0Var.f27702h0);
                }
                if (qg0Var.f27712y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(qg0Var.f27712y.getX(), qg0Var.f27712y.getY());
                    boolean dispatchTouchEvent = qg0Var.f27712y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        qg0Var.f27712y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = qg0Var.f27709s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!qg0Var.f27709s.isInProgress() && qg0Var.v.g0(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    qg0Var.f27710w = false;
                    qg0Var.f27711x = false;
                    if (qg0Var.f27697d0) {
                        qg0Var.f27697d0 = false;
                        qg0 qg0Var2 = qg0.f27690p0;
                        xu xuVar = qg0Var2.U;
                        if (xuVar != null) {
                            xuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = qg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        qg0.j(false);
                    } else {
                        o1.k kVar = qg0Var.M;
                        if (!kVar.f15526f) {
                            float f7 = qg0Var.K;
                            kVar.f15524b = f7;
                            kVar.f15525c = true;
                            o1.l lVar = kVar.f15533u;
                            int i10 = qg0Var.H;
                            float f10 = (i10 / 2.0f) + f7;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f10 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f15539i = dp;
                            qg0Var.M.f();
                        }
                        o1.k kVar2 = qg0Var.N;
                        if (!kVar2.f15526f) {
                            float f11 = qg0Var.L;
                            kVar2.f15524b = f11;
                            kVar2.f15525c = true;
                            kVar2.f15533u.f15539i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - qg0Var.I) - AndroidUtilities.dp(16.0f));
                            qg0Var.N.f();
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
        switch (this.f27347a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                qg0 qg0Var = this.f27348b;
                qg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(qg0Var.f27693b, qg0Var.d, qg0Var.f27695c);
                if (qg0Var.H != qg0Var.t() * qg0Var.J || qg0Var.I != qg0Var.r() * qg0Var.J) {
                    WindowManager.LayoutParams layoutParams = qg0Var.f27695c;
                    int t10 = (int) (qg0Var.t() * qg0Var.J);
                    qg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = qg0Var.f27695c;
                    int r10 = (int) (qg0Var.r() * qg0Var.J);
                    qg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(qg0Var.f27693b, qg0Var.d, qg0Var.f27695c);
                    o1.k kVar = qg0Var.M;
                    float f10 = qg0Var.K;
                    kVar.f15524b = f10;
                    kVar.f15525c = true;
                    o1.l lVar = kVar.f15533u;
                    float B = a4.a.B(qg0Var.t(), qg0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (qg0Var.t() * qg0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f15539i = dp;
                    qg0Var.M.f();
                    o1.k kVar2 = qg0Var.N;
                    kVar2.f15524b = qg0Var.L;
                    kVar2.f15525c = true;
                    kVar2.f15533u.f15539i = w7.q.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (qg0Var.r() * qg0Var.J)) - AndroidUtilities.dp(16.0f));
                    qg0Var.N.f();
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
        switch (this.f27347a) {
            case 1:
                qg0 qg0Var = this.f27348b;
                m71 m71Var = qg0Var.Q;
                if (m71Var.f26320j) {
                    m71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    qg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = qg0Var.V;
                if (photoViewer != null && photoViewer.f31199b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    qg0Var.V.f31199b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
