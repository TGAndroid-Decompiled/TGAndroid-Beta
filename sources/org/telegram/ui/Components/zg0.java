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
public final class zg0 extends FrameLayout {
    public final int f32900a;
    public final ah0 f32901b;

    public zg0(ah0 ah0Var, Context context, int i10) {
        super(context);
        this.f32900a = i10;
        this.f32901b = ah0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32900a) {
            case 1:
                super.dispatchDraw(canvas);
                ah0 ah0Var = this.f32901b;
                hp0 hp0Var = ah0Var.R;
                if (hp0Var != null && hp0Var.a()) {
                    ah0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ah0Var.R.draw(canvas);
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
        org.telegram.ui.qs0 qs0Var;
        switch (this.f32900a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ah0 ah0Var = this.f32901b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        ah0Var.f24611f0 = true;
                        ah0Var.f24612g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(ah0Var.f24613h0, 500L);
                    } else {
                        ah0Var.f24611f0 = false;
                        ah0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(ah0Var.f24613h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = ah0Var.V) != null && (qs0Var = photoViewer.f33268c4) != null && qs0Var.rewinding) {
                        qs0Var.setX(motionEvent.getX());
                    }
                } else {
                    ah0Var.f24611f0 = false;
                    ah0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ah0Var.f24613h0);
                }
                if (ah0Var.f24623y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(ah0Var.f24623y.getX(), ah0Var.f24623y.getY());
                    boolean dispatchTouchEvent = ah0Var.f24623y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        ah0Var.f24623y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = ah0Var.f24620s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!ah0Var.f24620s.isInProgress() && ah0Var.v.k(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ah0Var.f24621w = false;
                    ah0Var.f24622x = false;
                    if (ah0Var.f24608d0) {
                        ah0Var.f24608d0 = false;
                        ah0 ah0Var2 = ah0.f24601p0;
                        cv cvVar = ah0Var2.U;
                        if (cvVar != null) {
                            cvVar.G();
                        } else {
                            PhotoViewer photoViewer2 = ah0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.R0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        ah0.j(false);
                    } else {
                        o1.k kVar = ah0Var.M;
                        if (!kVar.f17552f) {
                            float f10 = ah0Var.K;
                            kVar.f17550b = f10;
                            kVar.f17551c = true;
                            o1.l lVar = kVar.f17559u;
                            int i10 = ah0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f17565i = dp;
                            ah0Var.M.h();
                        }
                        o1.k kVar2 = ah0Var.N;
                        if (!kVar2.f17552f) {
                            kVar2.f17550b = ah0Var.L;
                            kVar2.f17551c = true;
                            kVar2.f17559u.f17565i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ah0Var.I) - AndroidUtilities.dp(16.0f));
                            ah0Var.N.h();
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
        switch (this.f32900a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                ah0 ah0Var = this.f32901b;
                ah0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(ah0Var.f24604b, ah0Var.d, ah0Var.f24606c);
                if (ah0Var.H != ah0Var.t() * ah0Var.J || ah0Var.I != ah0Var.r() * ah0Var.J) {
                    WindowManager.LayoutParams layoutParams = ah0Var.f24606c;
                    int t10 = (int) (ah0Var.t() * ah0Var.J);
                    ah0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = ah0Var.f24606c;
                    int r10 = (int) (ah0Var.r() * ah0Var.J);
                    ah0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(ah0Var.f24604b, ah0Var.d, ah0Var.f24606c);
                    o1.k kVar = ah0Var.M;
                    float f10 = ah0Var.K;
                    kVar.f17550b = f10;
                    kVar.f17551c = true;
                    o1.l lVar = kVar.f17559u;
                    float B = a1.g.B(ah0Var.t(), ah0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (B >= f11 / 2.0f) {
                        dp = (f11 - (ah0Var.t() * ah0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f17565i = dp;
                    ah0Var.M.h();
                    o1.k kVar2 = ah0Var.N;
                    kVar2.f17550b = ah0Var.L;
                    kVar2.f17551c = true;
                    kVar2.f17559u.f17565i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (ah0Var.r() * ah0Var.J)) - AndroidUtilities.dp(16.0f));
                    ah0Var.N.h();
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
        switch (this.f32900a) {
            case 1:
                ah0 ah0Var = this.f32901b;
                t71 t71Var = ah0Var.Q;
                if (t71Var.f30469j) {
                    t71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ah0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = ah0Var.V;
                if (photoViewer != null && photoViewer.f33258b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    ah0Var.V.f33258b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
