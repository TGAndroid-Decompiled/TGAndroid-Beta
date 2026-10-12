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
public final class ih0 extends FrameLayout {
    public final int f27163a;
    public final jh0 f27164b;

    public ih0(jh0 jh0Var, Context context, int i10) {
        super(context);
        this.f27163a = i10;
        this.f27164b = jh0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f27163a) {
            case 1:
                super.dispatchDraw(canvas);
                jh0 jh0Var = this.f27164b;
                vp0 vp0Var = jh0Var.R;
                if (vp0Var != null && vp0Var.a()) {
                    jh0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    jh0Var.R.draw(canvas);
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
        org.telegram.ui.mt0 mt0Var;
        switch (this.f27163a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                jh0 jh0Var = this.f27164b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        jh0Var.f27514f0 = true;
                        jh0Var.f27515g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(jh0Var.f27516h0, 500L);
                    } else {
                        jh0Var.f27514f0 = false;
                        jh0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(jh0Var.f27516h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = jh0Var.V) != null && (mt0Var = photoViewer.f33726c4) != null && mt0Var.rewinding) {
                        mt0Var.setX(motionEvent.getX());
                    }
                } else {
                    jh0Var.f27514f0 = false;
                    jh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(jh0Var.f27516h0);
                }
                if (jh0Var.f27526y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(jh0Var.f27526y.getX(), jh0Var.f27526y.getY());
                    boolean dispatchTouchEvent = jh0Var.f27526y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        jh0Var.f27526y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = jh0Var.f27523s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!jh0Var.f27523s.isInProgress() && jh0Var.v.y0(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    jh0Var.f27524w = false;
                    jh0Var.f27525x = false;
                    if (jh0Var.f27510d0) {
                        jh0Var.f27510d0 = false;
                        jh0 jh0Var2 = jh0.f27503p0;
                        ov ovVar = jh0Var2.U;
                        if (ovVar != null) {
                            ovVar.H();
                        } else {
                            PhotoViewer photoViewer2 = jh0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        jh0.j(false);
                    } else {
                        o1.k kVar = jh0Var.M;
                        if (!kVar.f16683f) {
                            float f10 = jh0Var.K;
                            kVar.f16680b = f10;
                            kVar.f16681c = true;
                            o1.l lVar = kVar.f16690u;
                            int i10 = jh0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f16697i = dp;
                            jh0Var.M.h();
                        }
                        o1.k kVar2 = jh0Var.N;
                        if (!kVar2.f16683f) {
                            kVar2.f16680b = jh0Var.L;
                            kVar2.f16681c = true;
                            kVar2.f16690u.f16697i = w7.n.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - jh0Var.I) - AndroidUtilities.dp(16.0f));
                            jh0Var.N.h();
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
        switch (this.f27163a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                jh0 jh0Var = this.f27164b;
                jh0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(jh0Var.f27506b, jh0Var.d, jh0Var.f27508c);
                if (jh0Var.H != jh0Var.t() * jh0Var.J || jh0Var.I != jh0Var.r() * jh0Var.J) {
                    WindowManager.LayoutParams layoutParams = jh0Var.f27508c;
                    int t10 = (int) (jh0Var.t() * jh0Var.J);
                    jh0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = jh0Var.f27508c;
                    int r10 = (int) (jh0Var.r() * jh0Var.J);
                    jh0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(jh0Var.f27506b, jh0Var.d, jh0Var.f27508c);
                    o1.k kVar = jh0Var.M;
                    float f10 = jh0Var.K;
                    kVar.f16680b = f10;
                    kVar.f16681c = true;
                    o1.l lVar = kVar.f16690u;
                    float B = a1.g.B(jh0Var.t(), jh0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (jh0Var.t() * jh0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16697i = dp;
                    jh0Var.M.h();
                    o1.k kVar2 = jh0Var.N;
                    kVar2.f16680b = jh0Var.L;
                    kVar2.f16681c = true;
                    kVar2.f16690u.f16697i = w7.n.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (jh0Var.r() * jh0Var.J)) - AndroidUtilities.dp(16.0f));
                    jh0Var.N.h();
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
        switch (this.f27163a) {
            case 1:
                jh0 jh0Var = this.f27164b;
                h81 h81Var = jh0Var.Q;
                if (h81Var.f26692j) {
                    h81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    jh0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = jh0Var.V;
                if (photoViewer != null && photoViewer.f33716b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    jh0Var.V.f33716b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
