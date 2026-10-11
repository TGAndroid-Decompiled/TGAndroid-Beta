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
public final class hh0 extends FrameLayout {
    public final int f26992a;
    public final ih0 f26993b;

    public hh0(ih0 ih0Var, Context context, int i10) {
        super(context);
        this.f26992a = i10;
        this.f26993b = ih0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26992a) {
            case 1:
                super.dispatchDraw(canvas);
                ih0 ih0Var = this.f26993b;
                rp0 rp0Var = ih0Var.R;
                if (rp0Var != null && rp0Var.a()) {
                    ih0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ih0Var.R.draw(canvas);
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
        org.telegram.ui.jt0 jt0Var;
        switch (this.f26992a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ih0 ih0Var = this.f26993b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        ih0Var.f27336f0 = true;
                        ih0Var.f27337g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(ih0Var.f27338h0, 500L);
                    } else {
                        ih0Var.f27336f0 = false;
                        ih0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(ih0Var.f27338h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = ih0Var.V) != null && (jt0Var = photoViewer.f33917c4) != null && jt0Var.rewinding) {
                        jt0Var.setX(motionEvent.getX());
                    }
                } else {
                    ih0Var.f27336f0 = false;
                    ih0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ih0Var.f27338h0);
                }
                if (ih0Var.f27348y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(ih0Var.f27348y.getX(), ih0Var.f27348y.getY());
                    boolean dispatchTouchEvent = ih0Var.f27348y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        ih0Var.f27348y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = ih0Var.f27345s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!ih0Var.f27345s.isInProgress() && ih0Var.v.T0(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ih0Var.f27346w = false;
                    ih0Var.f27347x = false;
                    if (ih0Var.f27332d0) {
                        ih0Var.f27332d0 = false;
                        ih0 ih0Var2 = ih0.f27325p0;
                        mv mvVar = ih0Var2.U;
                        if (mvVar != null) {
                            mvVar.H();
                        } else {
                            PhotoViewer photoViewer2 = ih0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        ih0.j(false);
                    } else {
                        o1.k kVar = ih0Var.M;
                        if (!kVar.f16981f) {
                            float f10 = ih0Var.K;
                            kVar.f16978b = f10;
                            kVar.f16979c = true;
                            o1.l lVar = kVar.f16988u;
                            int i10 = ih0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f16995i = dp;
                            ih0Var.M.h();
                        }
                        o1.k kVar2 = ih0Var.N;
                        if (!kVar2.f16981f) {
                            kVar2.f16978b = ih0Var.L;
                            kVar2.f16979c = true;
                            kVar2.f16988u.f16995i = w7.o.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ih0Var.I) - AndroidUtilities.dp(16.0f));
                            ih0Var.N.h();
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
        switch (this.f26992a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                ih0 ih0Var = this.f26993b;
                ih0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(ih0Var.f27328b, ih0Var.d, ih0Var.f27330c);
                if (ih0Var.H != ih0Var.t() * ih0Var.J || ih0Var.I != ih0Var.r() * ih0Var.J) {
                    WindowManager.LayoutParams layoutParams = ih0Var.f27330c;
                    int t10 = (int) (ih0Var.t() * ih0Var.J);
                    ih0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = ih0Var.f27330c;
                    int r10 = (int) (ih0Var.r() * ih0Var.J);
                    ih0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(ih0Var.f27328b, ih0Var.d, ih0Var.f27330c);
                    o1.k kVar = ih0Var.M;
                    float f10 = ih0Var.K;
                    kVar.f16978b = f10;
                    kVar.f16979c = true;
                    o1.l lVar = kVar.f16988u;
                    float B = a1.g.B(ih0Var.t(), ih0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (ih0Var.t() * ih0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16995i = dp;
                    ih0Var.M.h();
                    o1.k kVar2 = ih0Var.N;
                    kVar2.f16978b = ih0Var.L;
                    kVar2.f16979c = true;
                    kVar2.f16988u.f16995i = w7.o.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (ih0Var.r() * ih0Var.J)) - AndroidUtilities.dp(16.0f));
                    ih0Var.N.h();
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
        switch (this.f26992a) {
            case 1:
                ih0 ih0Var = this.f26993b;
                d81 d81Var = ih0Var.Q;
                if (d81Var.f25484j) {
                    d81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ih0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = ih0Var.V;
                if (photoViewer != null && photoViewer.f33907b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    ih0Var.V.f33907b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
