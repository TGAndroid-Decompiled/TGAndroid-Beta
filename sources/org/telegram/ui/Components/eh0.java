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
public final class eh0 extends FrameLayout {
    public final int f24389a;
    public final fh0 f24390b;

    public eh0(fh0 fh0Var, Context context, int i10) {
        super(context);
        this.f24389a = i10;
        this.f24390b = fh0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f24389a) {
            case 1:
                super.dispatchDraw(canvas);
                fh0 fh0Var = this.f24390b;
                lp0 lp0Var = fh0Var.R;
                if (lp0Var != null && lp0Var.a()) {
                    fh0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    fh0Var.R.draw(canvas);
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
        org.telegram.ui.qt0 qt0Var;
        switch (this.f24389a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                fh0 fh0Var = this.f24390b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        fh0Var.f24743f0 = true;
                        fh0Var.f24744g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(fh0Var.f24745h0, 500L);
                    } else {
                        fh0Var.f24743f0 = false;
                        fh0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(fh0Var.f24745h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = fh0Var.V) != null && (qt0Var = photoViewer.f31914c4) != null && qt0Var.rewinding) {
                        qt0Var.setX(motionEvent.getX());
                    }
                } else {
                    fh0Var.f24743f0 = false;
                    fh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(fh0Var.f24745h0);
                }
                if (fh0Var.f24755y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(fh0Var.f24755y.getX(), fh0Var.f24755y.getY());
                    boolean dispatchTouchEvent = fh0Var.f24755y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        fh0Var.f24755y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = fh0Var.f24752s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!fh0Var.f24752s.isInProgress() && fh0Var.v.j1(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    fh0Var.f24753w = false;
                    fh0Var.f24754x = false;
                    if (fh0Var.f24740d0) {
                        fh0Var.f24740d0 = false;
                        fh0 fh0Var2 = fh0.f24733p0;
                        hv hvVar = fh0Var2.U;
                        if (hvVar != null) {
                            hvVar.H();
                        } else {
                            PhotoViewer photoViewer2 = fh0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        fh0.j(false);
                    } else {
                        o1.k kVar = fh0Var.M;
                        if (!kVar.f16154f) {
                            float f10 = fh0Var.K;
                            kVar.f16152b = f10;
                            kVar.f16153c = true;
                            o1.l lVar = kVar.f16161u;
                            int i10 = fh0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f16167i = dp;
                            fh0Var.M.h();
                        }
                        o1.k kVar2 = fh0Var.N;
                        if (!kVar2.f16154f) {
                            kVar2.f16152b = fh0Var.L;
                            kVar2.f16153c = true;
                            kVar2.f16161u.f16167i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fh0Var.I) - AndroidUtilities.dp(16.0f));
                            fh0Var.N.h();
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
        switch (this.f24389a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                fh0 fh0Var = this.f24390b;
                fh0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(fh0Var.f24736b, fh0Var.d, fh0Var.f24738c);
                if (fh0Var.H != fh0Var.t() * fh0Var.J || fh0Var.I != fh0Var.r() * fh0Var.J) {
                    WindowManager.LayoutParams layoutParams = fh0Var.f24738c;
                    int t10 = (int) (fh0Var.t() * fh0Var.J);
                    fh0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = fh0Var.f24738c;
                    int r10 = (int) (fh0Var.r() * fh0Var.J);
                    fh0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(fh0Var.f24736b, fh0Var.d, fh0Var.f24738c);
                    o1.k kVar = fh0Var.M;
                    float f10 = fh0Var.K;
                    kVar.f16152b = f10;
                    kVar.f16153c = true;
                    o1.l lVar = kVar.f16161u;
                    float B = a1.g.B(fh0Var.t(), fh0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (fh0Var.t() * fh0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16167i = dp;
                    fh0Var.M.h();
                    o1.k kVar2 = fh0Var.N;
                    kVar2.f16152b = fh0Var.L;
                    kVar2.f16153c = true;
                    kVar2.f16161u.f16167i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (fh0Var.r() * fh0Var.J)) - AndroidUtilities.dp(16.0f));
                    fh0Var.N.h();
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
        switch (this.f24389a) {
            case 1:
                fh0 fh0Var = this.f24390b;
                a81 a81Var = fh0Var.Q;
                if (a81Var.f23162j) {
                    a81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    fh0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null && photoViewer.f31904b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    fh0Var.V.f31904b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
