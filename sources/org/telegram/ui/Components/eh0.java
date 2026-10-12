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
    public final int f24703a;
    public final fh0 f24704b;

    public eh0(fh0 fh0Var, Context context, int i10) {
        super(context);
        this.f24703a = i10;
        this.f24704b = fh0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f24703a) {
            case 1:
                super.dispatchDraw(canvas);
                fh0 fh0Var = this.f24704b;
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
        org.telegram.ui.rt0 rt0Var;
        switch (this.f24703a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                fh0 fh0Var = this.f24704b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        fh0Var.f25045f0 = true;
                        fh0Var.f25046g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(fh0Var.f25047h0, 500L);
                    } else {
                        fh0Var.f25045f0 = false;
                        fh0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(fh0Var.f25047h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = fh0Var.V) != null && (rt0Var = photoViewer.f32212c4) != null && rt0Var.rewinding) {
                        rt0Var.setX(motionEvent.getX());
                    }
                } else {
                    fh0Var.f25045f0 = false;
                    fh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(fh0Var.f25047h0);
                }
                if (fh0Var.f25057y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(fh0Var.f25057y.getX(), fh0Var.f25057y.getY());
                    boolean dispatchTouchEvent = fh0Var.f25057y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        fh0Var.f25057y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = fh0Var.f25054s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!fh0Var.f25054s.isInProgress() && fh0Var.v.Y0(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    fh0Var.f25055w = false;
                    fh0Var.f25056x = false;
                    if (fh0Var.f25042d0) {
                        fh0Var.f25042d0 = false;
                        fh0 fh0Var2 = fh0.f25035p0;
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
                        if (!kVar.f16461f) {
                            float f10 = fh0Var.K;
                            kVar.f16459b = f10;
                            kVar.f16460c = true;
                            o1.l lVar = kVar.f16468u;
                            int i10 = fh0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f16474i = dp;
                            fh0Var.M.h();
                        }
                        o1.k kVar2 = fh0Var.N;
                        if (!kVar2.f16461f) {
                            kVar2.f16459b = fh0Var.L;
                            kVar2.f16460c = true;
                            kVar2.f16468u.f16474i = w7.s.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fh0Var.I) - AndroidUtilities.dp(16.0f));
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
        switch (this.f24703a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                fh0 fh0Var = this.f24704b;
                fh0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(fh0Var.f25038b, fh0Var.d, fh0Var.f25040c);
                if (fh0Var.H != fh0Var.t() * fh0Var.J || fh0Var.I != fh0Var.r() * fh0Var.J) {
                    WindowManager.LayoutParams layoutParams = fh0Var.f25040c;
                    int t10 = (int) (fh0Var.t() * fh0Var.J);
                    fh0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = fh0Var.f25040c;
                    int r10 = (int) (fh0Var.r() * fh0Var.J);
                    fh0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(fh0Var.f25038b, fh0Var.d, fh0Var.f25040c);
                    o1.k kVar = fh0Var.M;
                    float f10 = fh0Var.K;
                    kVar.f16459b = f10;
                    kVar.f16460c = true;
                    o1.l lVar = kVar.f16468u;
                    float B = a1.g.B(fh0Var.t(), fh0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (fh0Var.t() * fh0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f16474i = dp;
                    fh0Var.M.h();
                    o1.k kVar2 = fh0Var.N;
                    kVar2.f16459b = fh0Var.L;
                    kVar2.f16460c = true;
                    kVar2.f16468u.f16474i = w7.s.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (fh0Var.r() * fh0Var.J)) - AndroidUtilities.dp(16.0f));
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
        switch (this.f24703a) {
            case 1:
                fh0 fh0Var = this.f24704b;
                z71 z71Var = fh0Var.Q;
                if (z71Var.f31797j) {
                    z71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    fh0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null && photoViewer.f32202b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    fh0Var.V.f32202b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
