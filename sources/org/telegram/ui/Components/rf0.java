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

public final class rf0 extends FrameLayout {

    public final int f32152a;

    public final sf0 f32153b;

    public rf0(sf0 sf0Var, Context context, int i10) {
        super(context);
        this.f32152a = i10;
        this.f32153b = sf0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32152a) {
            case 1:
                super.dispatchDraw(canvas);
                sf0 sf0Var = this.f32153b;
                un0 un0Var = sf0Var.N;
                if (un0Var != null && un0Var.a()) {
                    sf0Var.N.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    sf0Var.N.draw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer;
        org.telegram.ui.is0 is0Var;
        switch (this.f32152a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                sf0 sf0Var = this.f32153b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        sf0Var.f32419b0 = true;
                        sf0Var.f32421c0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(sf0Var.f32422d0, 500L);
                    } else {
                        sf0Var.f32419b0 = false;
                        sf0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(sf0Var.f32422d0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    sf0Var.f32419b0 = false;
                    sf0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(sf0Var.f32422d0);
                } else if (actionMasked == 2 && (photoViewer = sf0Var.R) != null && (is0Var = photoViewer.Y3) != null && is0Var.rewinding) {
                    is0Var.setX(motionEvent.getX());
                }
                if (sf0Var.f32435y != null) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(sf0Var.f32435y.getX(), sf0Var.f32435y.getY());
                    boolean zDispatchTouchEvent = sf0Var.f32435y.dispatchTouchEvent(motionEvent);
                    motionEventObtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        sf0Var.f32435y = null;
                    }
                    if (zDispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                motionEventObtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean zOnTouchEvent = sf0Var.f32432s.onTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
                boolean z10 = !sf0Var.f32432s.isInProgress() && sf0Var.v.P(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    sf0Var.f32433w = false;
                    sf0Var.f32434x = false;
                    if (sf0Var.Z) {
                        sf0Var.Z = false;
                        sf0 sf0Var2 = sf0.f32415l0;
                        fu fuVar = sf0Var2.Q;
                        if (fuVar != null) {
                            fuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = sf0Var2.R;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        sf0.j(false);
                    } else {
                        o1.j jVar = sf0Var.I;
                        if (!jVar.f19141f) {
                            float f10 = sf0Var.G;
                            jVar.f19138b = f10;
                            jVar.f19139c = true;
                            o1.k kVar = jVar.f19147u;
                            int i10 = sf0Var.D;
                            float f11 = (i10 / 2.0f) + f10;
                            int i11 = AndroidUtilities.displaySize.x;
                            kVar.f19154i = f11 >= ((float) i11) / 2.0f ? (i11 - i10) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            sf0Var.I.f();
                        }
                        o1.j jVar2 = sf0Var.J;
                        if (!jVar2.f19141f) {
                            float f12 = sf0Var.H;
                            jVar2.f19138b = f12;
                            jVar2.f19139c = true;
                            jVar2.f19147u.f19154i = h7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - sf0Var.E) - AndroidUtilities.dp(16.0f));
                            sf0Var.J.f();
                        }
                    }
                }
                return zOnTouchEvent || z10;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f32152a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                sf0 sf0Var = this.f32153b;
                sf0Var.C = null;
                AndroidUtilities.setPreferredMaxRefreshRate(sf0Var.f32418b, sf0Var.d, sf0Var.f32420c);
                if (sf0Var.D != sf0Var.t() * sf0Var.F || sf0Var.E != sf0Var.r() * sf0Var.F) {
                    WindowManager.LayoutParams layoutParams = sf0Var.f32420c;
                    int iT = (int) (sf0Var.t() * sf0Var.F);
                    sf0Var.D = iT;
                    layoutParams.width = iT;
                    WindowManager.LayoutParams layoutParams2 = sf0Var.f32420c;
                    int iR = (int) (sf0Var.r() * sf0Var.F);
                    sf0Var.E = iR;
                    layoutParams2.height = iR;
                    AndroidUtilities.updateViewLayout(sf0Var.f32418b, sf0Var.d, sf0Var.f32420c);
                    o1.j jVar = sf0Var.I;
                    float f10 = sf0Var.G;
                    jVar.f19138b = f10;
                    jVar.f19139c = true;
                    o1.k kVar = jVar.f19147u;
                    float fD = a9.p.d(sf0Var.t(), sf0Var.F, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    kVar.f19154i = fD >= f11 / 2.0f ? (f11 - (sf0Var.t() * sf0Var.F)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    sf0Var.I.f();
                    o1.j jVar2 = sf0Var.J;
                    float f12 = sf0Var.H;
                    jVar2.f19138b = f12;
                    jVar2.f19139c = true;
                    jVar2.f19147u.f19154i = h7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (sf0Var.r() * sf0Var.F)) - AndroidUtilities.dp(16.0f));
                    sf0Var.J.f();
                }
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f32152a) {
            case 1:
                sf0 sf0Var = this.f32153b;
                c61 c61Var = sf0Var.M;
                if (c61Var.f27337j) {
                    c61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    sf0Var.M.draw(canvas);
                }
                PhotoViewer photoViewer = sf0Var.R;
                if (photoViewer != null && photoViewer.X3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    sf0Var.R.X3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }
}
