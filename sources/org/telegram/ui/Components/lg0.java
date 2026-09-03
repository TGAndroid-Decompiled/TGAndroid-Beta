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
public final class lg0 extends FrameLayout {
    public final int f26673a;
    public final mg0 f26674b;

    public lg0(mg0 mg0Var, Context context, int i10) {
        super(context);
        this.f26673a = i10;
        this.f26674b = mg0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26673a) {
            case 1:
                super.dispatchDraw(canvas);
                mg0 mg0Var = this.f26674b;
                no0 no0Var = mg0Var.O;
                if (no0Var != null && no0Var.a()) {
                    mg0Var.O.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    mg0Var.O.draw(canvas);
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
        boolean z4;
        int dp;
        PhotoViewer photoViewer;
        org.telegram.ui.ws0 ws0Var;
        switch (this.f26673a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                mg0 mg0Var = this.f26674b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        mg0Var.f27042c0 = true;
                        mg0Var.f27043d0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(mg0Var.f27044e0, 500L);
                    } else {
                        mg0Var.f27042c0 = false;
                        mg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(mg0Var.f27044e0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = mg0Var.S) != null && (ws0Var = photoViewer.Z3) != null && ws0Var.rewinding) {
                        ws0Var.setX(motionEvent.getX());
                    }
                } else {
                    mg0Var.f27042c0 = false;
                    mg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(mg0Var.f27044e0);
                }
                if (mg0Var.f27056y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(mg0Var.f27056y.getX(), mg0Var.f27056y.getY());
                    boolean dispatchTouchEvent = mg0Var.f27056y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        mg0Var.f27056y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = mg0Var.f27053s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!mg0Var.f27053s.isInProgress() && mg0Var.v.w2(motionEvent)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    mg0Var.f27054w = false;
                    mg0Var.f27055x = false;
                    if (mg0Var.f27038a0) {
                        mg0Var.f27038a0 = false;
                        mg0 mg0Var2 = mg0.m0;
                        ou ouVar = mg0Var2.R;
                        if (ouVar != null) {
                            ouVar.G();
                        } else {
                            PhotoViewer photoViewer2 = mg0Var2.S;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        mg0.j(false);
                    } else {
                        o1.j jVar = mg0Var.J;
                        if (!jVar.f16172f) {
                            float f10 = mg0Var.H;
                            jVar.f16170b = f10;
                            jVar.f16171c = true;
                            o1.k kVar = jVar.f16178u;
                            int i10 = mg0Var.E;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            kVar.f16184i = dp;
                            mg0Var.J.f();
                        }
                        o1.j jVar2 = mg0Var.K;
                        if (!jVar2.f16172f) {
                            float f12 = mg0Var.I;
                            jVar2.f16170b = f12;
                            jVar2.f16171c = true;
                            jVar2.f16178u.f16184i = k7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - mg0Var.F) - AndroidUtilities.dp(16.0f));
                            mg0Var.K.f();
                        }
                    }
                }
                if (onTouchEvent || z4) {
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
        float f10;
        switch (this.f26673a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                mg0 mg0Var = this.f26674b;
                mg0Var.D = null;
                AndroidUtilities.setPreferredMaxRefreshRate(mg0Var.f27039b, mg0Var.d, mg0Var.f27041c);
                if (mg0Var.E != mg0Var.t() * mg0Var.G || mg0Var.F != mg0Var.r() * mg0Var.G) {
                    WindowManager.LayoutParams layoutParams = mg0Var.f27041c;
                    int t6 = (int) (mg0Var.t() * mg0Var.G);
                    mg0Var.E = t6;
                    layoutParams.width = t6;
                    WindowManager.LayoutParams layoutParams2 = mg0Var.f27041c;
                    int r10 = (int) (mg0Var.r() * mg0Var.G);
                    mg0Var.F = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(mg0Var.f27039b, mg0Var.d, mg0Var.f27041c);
                    o1.j jVar = mg0Var.J;
                    float f11 = mg0Var.H;
                    jVar.f16170b = f11;
                    jVar.f16171c = true;
                    o1.k kVar = jVar.f16178u;
                    float d = android.support.v4.media.a.d(mg0Var.t(), mg0Var.G, 2.0f, f11);
                    float f12 = AndroidUtilities.displaySize.x;
                    if (d >= f12 / 2.0f) {
                        dp = (f12 - (mg0Var.t() * mg0Var.G)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f16184i = dp;
                    mg0Var.J.f();
                    o1.j jVar2 = mg0Var.K;
                    jVar2.f16170b = mg0Var.I;
                    jVar2.f16171c = true;
                    jVar2.f16178u.f16184i = k7.n.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (mg0Var.r() * mg0Var.G)) - AndroidUtilities.dp(16.0f));
                    mg0Var.K.f();
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
        switch (this.f26673a) {
            case 1:
                mg0 mg0Var = this.f26674b;
                y61 y61Var = mg0Var.N;
                if (y61Var.f30921j) {
                    y61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    mg0Var.N.draw(canvas);
                }
                PhotoViewer photoViewer = mg0Var.S;
                if (photoViewer != null && photoViewer.Y3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    mg0Var.S.Y3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
