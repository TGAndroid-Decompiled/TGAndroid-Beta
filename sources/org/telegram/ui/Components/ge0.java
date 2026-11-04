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
public final class ge0 extends FrameLayout {
    public final int f34072a;
    public final ie0 f34073b;

    public ge0(ie0 ie0Var, Context context, int i3) {
        super(context);
        this.f34072a = i3;
        this.f34073b = ie0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f34072a) {
            case 1:
                super.dispatchDraw(canvas);
                ie0 ie0Var = this.f34073b;
                tm0 tm0Var = ie0Var.S;
                if (tm0Var != null && tm0Var.a()) {
                    ie0Var.S.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ie0Var.S.draw(canvas);
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
        float f10;
        int L;
        PhotoViewer photoViewer;
        org.telegram.ui.yo0 yo0Var;
        switch (this.f34072a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ie0 ie0Var = this.f34073b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        ie0Var.f34695g0 = true;
                        ie0Var.f34696h0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        org.telegram.messenger.g0.i3(ie0Var.f34697i0, 500L);
                    } else {
                        ie0Var.f34695g0 = false;
                        ie0Var.a();
                        org.telegram.messenger.g0.r(ie0Var.f34697i0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = ie0Var.W) != null && (yo0Var = photoViewer.f41404d4) != null && yo0Var.rewinding) {
                        yo0Var.setX(motionEvent.getX());
                    }
                } else {
                    ie0Var.f34695g0 = false;
                    ie0Var.a();
                    org.telegram.messenger.g0.r(ie0Var.f34697i0);
                }
                if (ie0Var.E != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(ie0Var.E.getX(), ie0Var.E.getY());
                    boolean dispatchTouchEvent = ie0Var.E.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        ie0Var.E = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = ie0Var.f34704s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!ie0Var.f34704s.isInProgress() && ie0Var.f34705w.y(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ie0Var.f34706x = false;
                    ie0Var.f34707y = false;
                    if (ie0Var.f34692e0) {
                        ie0Var.f34692e0 = false;
                        ie0 ie0Var2 = ie0.f34683q0;
                        ut utVar = ie0Var2.V;
                        if (utVar != null) {
                            utVar.I0();
                        } else {
                            PhotoViewer photoViewer2 = ie0Var2.W;
                            if (photoViewer2 != null) {
                                photoViewer2.Q0();
                                MediaController.B().F0();
                            }
                        }
                        ie0.b(false);
                    } else {
                        q1.g gVar = ie0Var.N;
                        if (!gVar.f53647f) {
                            float f11 = ie0Var.L;
                            gVar.f53644b = f11;
                            gVar.f53645c = true;
                            q1.h hVar = gVar.f53653m;
                            int i3 = ie0Var.I;
                            float f12 = (i3 / 2.0f) + f11;
                            int i10 = org.telegram.messenger.g0.f22608q.x;
                            if (f12 >= i10 / 2.0f) {
                                L = (i10 - i3) - org.telegram.messenger.g0.L(16.0f);
                            } else {
                                L = org.telegram.messenger.g0.L(16.0f);
                            }
                            hVar.f53661i = L;
                            ie0Var.N.h();
                        }
                        q1.g gVar2 = ie0Var.O;
                        if (!gVar2.f53647f) {
                            gVar2.f53644b = ie0Var.M;
                            gVar2.f53645c = true;
                            gVar2.f53653m.f53661i = b8.be.a(f10, org.telegram.messenger.g0.L(16.0f), (org.telegram.messenger.g0.f22608q.y - ie0Var.J) - org.telegram.messenger.g0.L(16.0f));
                            ie0Var.O.h();
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
        float f10;
        switch (this.f34072a) {
            case 0:
                org.telegram.messenger.g0.v(getContext(), configuration);
                ie0 ie0Var = this.f34073b;
                ie0Var.H = null;
                org.telegram.messenger.g0.y3(ie0Var.f34686b, ie0Var.d, ie0Var.f34688c);
                if (ie0Var.I != ie0Var.t() * ie0Var.K || ie0Var.J != ie0Var.p() * ie0Var.K) {
                    WindowManager.LayoutParams layoutParams = ie0Var.f34688c;
                    int t10 = (int) (ie0Var.t() * ie0Var.K);
                    ie0Var.I = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = ie0Var.f34688c;
                    int p10 = (int) (ie0Var.p() * ie0Var.K);
                    ie0Var.J = p10;
                    layoutParams2.height = p10;
                    org.telegram.messenger.g0.T3(ie0Var.f34686b, ie0Var.d, ie0Var.f34688c);
                    q1.g gVar = ie0Var.N;
                    float f11 = ie0Var.L;
                    gVar.f53644b = f11;
                    gVar.f53645c = true;
                    q1.h hVar = gVar.f53653m;
                    float e10 = a1.g.e(ie0Var.t(), ie0Var.K, 2.0f, f11);
                    float f12 = org.telegram.messenger.g0.f22608q.x;
                    if (e10 >= f12 / 2.0f) {
                        L = (f12 - (ie0Var.t() * ie0Var.K)) - org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(16.0f);
                    }
                    hVar.f53661i = L;
                    ie0Var.N.h();
                    q1.g gVar2 = ie0Var.O;
                    gVar2.f53644b = ie0Var.M;
                    gVar2.f53645c = true;
                    gVar2.f53653m.f53661i = b8.be.a(f10, org.telegram.messenger.g0.L(16.0f), (point.y - (ie0Var.p() * ie0Var.K)) - org.telegram.messenger.g0.L(16.0f));
                    ie0Var.O.h();
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
        switch (this.f34072a) {
            case 1:
                ie0 ie0Var = this.f34073b;
                d51 d51Var = ie0Var.R;
                if (d51Var.f32944j) {
                    d51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ie0Var.R.draw(canvas);
                }
                PhotoViewer photoViewer = ie0Var.W;
                if (photoViewer != null && photoViewer.f41395c4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    ie0Var.W.f41395c4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
