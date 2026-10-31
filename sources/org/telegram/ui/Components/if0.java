package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;
public final class if0 extends FrameLayout {
    public final int f26973a;
    public final jf0 f26974b;

    public if0(jf0 jf0Var, Context context, int i10) {
        super(context);
        this.f26973a = i10;
        this.f26974b = jf0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26973a) {
            case 1:
                super.dispatchDraw(canvas);
                jf0 jf0Var = this.f26974b;
                rn0 rn0Var = jf0Var.R;
                if (rn0Var != null && rn0Var.a()) {
                    jf0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    jf0Var.R.draw(canvas);
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
        int L;
        PhotoViewer photoViewer;
        org.telegram.ui.rq0 rq0Var;
        switch (this.f26973a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                jf0 jf0Var = this.f26974b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        jf0Var.f27355f0 = true;
                        jf0Var.f27356g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        org.telegram.messenger.i0.h3(jf0Var.f27357h0, 500L);
                    } else {
                        jf0Var.f27355f0 = false;
                        jf0Var.a();
                        org.telegram.messenger.i0.r(jf0Var.f27357h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = jf0Var.V) != null && (rq0Var = photoViewer.f33456c4) != null && rq0Var.rewinding) {
                        rq0Var.setX(motionEvent.getX());
                    }
                } else {
                    jf0Var.f27355f0 = false;
                    jf0Var.a();
                    org.telegram.messenger.i0.r(jf0Var.f27357h0);
                }
                if (jf0Var.D != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(jf0Var.D.getX(), jf0Var.D.getY());
                    boolean dispatchTouchEvent = jf0Var.D.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        jf0Var.D = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = jf0Var.f27364s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!jf0Var.f27364s.isInProgress() && jf0Var.f27365w.I(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    jf0Var.f27366x = false;
                    jf0Var.f27367y = false;
                    if (jf0Var.f27352d0) {
                        jf0Var.f27352d0 = false;
                        jf0 jf0Var2 = jf0.f27345p0;
                        hu huVar = jf0Var2.U;
                        if (huVar != null) {
                            huVar.I0();
                        } else {
                            PhotoViewer photoViewer2 = jf0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.Q0();
                                MediaController.B().F0();
                            }
                        }
                        jf0.b(false);
                    } else {
                        o1.j jVar = jf0Var.M;
                        if (!jVar.f13951f) {
                            float f10 = jf0Var.K;
                            jVar.f13949b = f10;
                            jVar.f13950c = true;
                            o1.k kVar = jVar.f13957m;
                            int i10 = jf0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = org.telegram.messenger.i0.f16026q.x;
                            if (f11 >= i11 / 2.0f) {
                                L = (i11 - i10) - org.telegram.messenger.i0.L(16.0f);
                            } else {
                                L = org.telegram.messenger.i0.L(16.0f);
                            }
                            kVar.f13964i = L;
                            jf0Var.M.h();
                        }
                        o1.j jVar2 = jf0Var.N;
                        if (!jVar2.f13951f) {
                            jVar2.f13949b = jf0Var.L;
                            jVar2.f13950c = true;
                            jVar2.f13957m.f13964i = w7.u.a(f7, org.telegram.messenger.i0.L(16.0f), (org.telegram.messenger.i0.f16026q.y - jf0Var.I) - org.telegram.messenger.i0.L(16.0f));
                            jf0Var.N.h();
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
        Point point;
        float L;
        float f7;
        switch (this.f26973a) {
            case 0:
                org.telegram.messenger.i0.v(getContext(), configuration);
                jf0 jf0Var = this.f26974b;
                jf0Var.G = null;
                org.telegram.messenger.i0.x3(jf0Var.f27348b, jf0Var.d, jf0Var.f27350c);
                if (jf0Var.H != jf0Var.t() * jf0Var.J || jf0Var.I != jf0Var.p() * jf0Var.J) {
                    WindowManager.LayoutParams layoutParams = jf0Var.f27350c;
                    int t10 = (int) (jf0Var.t() * jf0Var.J);
                    jf0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = jf0Var.f27350c;
                    int p5 = (int) (jf0Var.p() * jf0Var.J);
                    jf0Var.I = p5;
                    layoutParams2.height = p5;
                    org.telegram.messenger.i0.S3(jf0Var.f27348b, jf0Var.d, jf0Var.f27350c);
                    o1.j jVar = jf0Var.M;
                    float f10 = jf0Var.K;
                    jVar.f13949b = f10;
                    jVar.f13950c = true;
                    o1.k kVar = jVar.f13957m;
                    float A = a1.g.A(jf0Var.t(), jf0Var.J, 2.0f, f10);
                    float f11 = org.telegram.messenger.i0.f16026q.x;
                    if (A >= f11 / 2.0f) {
                        L = (f11 - (jf0Var.t() * jf0Var.J)) - org.telegram.messenger.i0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(16.0f);
                    }
                    kVar.f13964i = L;
                    jf0Var.M.h();
                    o1.j jVar2 = jf0Var.N;
                    jVar2.f13949b = jf0Var.L;
                    jVar2.f13950c = true;
                    jVar2.f13957m.f13964i = w7.u.a(f7, org.telegram.messenger.i0.L(16.0f), (point.y - (jf0Var.p() * jf0Var.J)) - org.telegram.messenger.i0.L(16.0f));
                    jf0Var.N.h();
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
        switch (this.f26973a) {
            case 1:
                jf0 jf0Var = this.f26974b;
                m61 m61Var = jf0Var.Q;
                if (m61Var.f28320j) {
                    m61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    jf0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = jf0Var.V;
                if (photoViewer != null && photoViewer.f33446b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    jf0Var.V.f33446b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
