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
public final class bh0 extends FrameLayout {
    public final int f26854a;
    public final ch0 f26855b;

    public bh0(ch0 ch0Var, Context context, int i10) {
        super(context);
        this.f26854a = i10;
        this.f26855b = ch0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26854a) {
            case 1:
                super.dispatchDraw(canvas);
                ch0 ch0Var = this.f26855b;
                qp0 qp0Var = ch0Var.R;
                if (qp0Var != null && qp0Var.a()) {
                    ch0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ch0Var.R.draw(canvas);
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
        org.telegram.ui.xs0 xs0Var;
        switch (this.f26854a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ch0 ch0Var = this.f26855b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        ch0Var.f27169f0 = true;
                        ch0Var.f27170g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(ch0Var.f27171h0, 500L);
                    } else {
                        ch0Var.f27169f0 = false;
                        ch0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(ch0Var.f27171h0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = ch0Var.V) != null && (xs0Var = photoViewer.f35632c4) != null && xs0Var.rewinding) {
                        xs0Var.setX(motionEvent.getX());
                    }
                } else {
                    ch0Var.f27169f0 = false;
                    ch0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ch0Var.f27171h0);
                }
                if (ch0Var.f27181y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(ch0Var.f27181y.getX(), ch0Var.f27181y.getY());
                    boolean dispatchTouchEvent = ch0Var.f27181y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        ch0Var.f27181y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = ch0Var.f27178s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!ch0Var.f27178s.isInProgress() && ch0Var.v.g0(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ch0Var.f27179w = false;
                    ch0Var.f27180x = false;
                    if (ch0Var.f27166d0) {
                        ch0Var.f27166d0 = false;
                        ch0 ch0Var2 = ch0.f27159p0;
                        dv dvVar = ch0Var2.U;
                        if (dvVar != null) {
                            dvVar.G();
                        } else {
                            PhotoViewer photoViewer2 = ch0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.Q0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        ch0.j(false);
                    } else {
                        o1.j jVar = ch0Var.M;
                        if (!jVar.f18963f) {
                            float f10 = ch0Var.K;
                            jVar.f18961b = f10;
                            jVar.f18962c = true;
                            o1.k kVar = jVar.f18969u;
                            int i10 = ch0Var.H;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f11 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            kVar.f18975i = dp;
                            ch0Var.M.h();
                        }
                        o1.j jVar2 = ch0Var.N;
                        if (!jVar2.f18963f) {
                            jVar2.f18961b = ch0Var.L;
                            jVar2.f18962c = true;
                            jVar2.f18969u.f18975i = a8.ee.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ch0Var.I) - AndroidUtilities.dp(16.0f));
                            ch0Var.N.h();
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
        switch (this.f26854a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                ch0 ch0Var = this.f26855b;
                ch0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(ch0Var.f27162b, ch0Var.d, ch0Var.f27164c);
                if (ch0Var.H != ch0Var.t() * ch0Var.J || ch0Var.I != ch0Var.r() * ch0Var.J) {
                    WindowManager.LayoutParams layoutParams = ch0Var.f27164c;
                    int t10 = (int) (ch0Var.t() * ch0Var.J);
                    ch0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = ch0Var.f27164c;
                    int r6 = (int) (ch0Var.r() * ch0Var.J);
                    ch0Var.I = r6;
                    layoutParams2.height = r6;
                    AndroidUtilities.updateViewLayout(ch0Var.f27162b, ch0Var.d, ch0Var.f27164c);
                    o1.j jVar = ch0Var.M;
                    float f10 = ch0Var.K;
                    jVar.f18961b = f10;
                    jVar.f18962c = true;
                    o1.k kVar = jVar.f18969u;
                    float C = a1.g.C(ch0Var.t(), ch0Var.J, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (C >= f11 / 2.0f) {
                        dp = (f11 - (ch0Var.t() * ch0Var.J)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f18975i = dp;
                    ch0Var.M.h();
                    o1.j jVar2 = ch0Var.N;
                    jVar2.f18961b = ch0Var.L;
                    jVar2.f18962c = true;
                    jVar2.f18969u.f18975i = a8.ee.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (ch0Var.r() * ch0Var.J)) - AndroidUtilities.dp(16.0f));
                    ch0Var.N.h();
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
        switch (this.f26854a) {
            case 1:
                ch0 ch0Var = this.f26855b;
                j81 j81Var = ch0Var.Q;
                if (j81Var.f29522j) {
                    j81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ch0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null && photoViewer.f35622b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    ch0Var.V.f35622b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
