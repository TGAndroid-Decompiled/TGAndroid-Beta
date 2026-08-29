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
public final class ag0 extends FrameLayout {
    public final int f26767a;
    public final bg0 f26768b;

    public ag0(bg0 bg0Var, Context context, int i10) {
        super(context);
        this.f26767a = i10;
        this.f26768b = bg0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26767a) {
            case 1:
                super.dispatchDraw(canvas);
                bg0 bg0Var = this.f26768b;
                eo0 eo0Var = bg0Var.N;
                if (eo0Var != null && eo0Var.a()) {
                    bg0Var.N.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    bg0Var.N.draw(canvas);
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
        int dp;
        PhotoViewer photoViewer;
        org.telegram.ui.gs0 gs0Var;
        switch (this.f26767a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                bg0 bg0Var = this.f26768b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        bg0Var.f27080b0 = true;
                        bg0Var.f27082c0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(bg0Var.f27083d0, 500L);
                    } else {
                        bg0Var.f27080b0 = false;
                        bg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(bg0Var.f27083d0);
                    }
                }
                if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                    if (actionMasked == 2 && (photoViewer = bg0Var.R) != null && (gs0Var = photoViewer.Y3) != null && gs0Var.rewinding) {
                        gs0Var.setX(motionEvent.getX());
                    }
                } else {
                    bg0Var.f27080b0 = false;
                    bg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(bg0Var.f27083d0);
                }
                if (bg0Var.f27096y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(bg0Var.f27096y.getX(), bg0Var.f27096y.getY());
                    boolean dispatchTouchEvent = bg0Var.f27096y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        bg0Var.f27096y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = bg0Var.f27093s.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!bg0Var.f27093s.isInProgress() && bg0Var.v.r(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    bg0Var.f27094w = false;
                    bg0Var.f27095x = false;
                    if (bg0Var.Z) {
                        bg0Var.Z = false;
                        bg0 bg0Var2 = bg0.f27076l0;
                        mu muVar = bg0Var2.Q;
                        if (muVar != null) {
                            muVar.G();
                        } else {
                            PhotoViewer photoViewer2 = bg0Var2.R;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        bg0.j(false);
                    } else {
                        o1.k kVar = bg0Var.I;
                        if (!kVar.f19039f) {
                            float f9 = bg0Var.G;
                            kVar.f19036b = f9;
                            kVar.f19037c = true;
                            o1.l lVar = kVar.f19045u;
                            int i10 = bg0Var.D;
                            float f10 = (i10 / 2.0f) + f9;
                            int i11 = AndroidUtilities.displaySize.x;
                            if (f10 >= i11 / 2.0f) {
                                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                            } else {
                                dp = AndroidUtilities.dp(16.0f);
                            }
                            lVar.f19052i = dp;
                            bg0Var.I.f();
                        }
                        o1.k kVar2 = bg0Var.J;
                        if (!kVar2.f19039f) {
                            float f11 = bg0Var.H;
                            kVar2.f19036b = f11;
                            kVar2.f19037c = true;
                            kVar2.f19045u.f19052i = i7.w.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - bg0Var.E) - AndroidUtilities.dp(16.0f));
                            bg0Var.J.f();
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
        float f9;
        switch (this.f26767a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                bg0 bg0Var = this.f26768b;
                bg0Var.C = null;
                AndroidUtilities.setPreferredMaxRefreshRate(bg0Var.f27079b, bg0Var.d, bg0Var.f27081c);
                if (bg0Var.D != bg0Var.t() * bg0Var.F || bg0Var.E != bg0Var.r() * bg0Var.F) {
                    WindowManager.LayoutParams layoutParams = bg0Var.f27081c;
                    int t10 = (int) (bg0Var.t() * bg0Var.F);
                    bg0Var.D = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = bg0Var.f27081c;
                    int r6 = (int) (bg0Var.r() * bg0Var.F);
                    bg0Var.E = r6;
                    layoutParams2.height = r6;
                    AndroidUtilities.updateViewLayout(bg0Var.f27079b, bg0Var.d, bg0Var.f27081c);
                    o1.k kVar = bg0Var.I;
                    float f10 = bg0Var.G;
                    kVar.f19036b = f10;
                    kVar.f19037c = true;
                    o1.l lVar = kVar.f19045u;
                    float d = a4.w.d(bg0Var.t(), bg0Var.F, 2.0f, f10);
                    float f11 = AndroidUtilities.displaySize.x;
                    if (d >= f11 / 2.0f) {
                        dp = (f11 - (bg0Var.t() * bg0Var.F)) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    lVar.f19052i = dp;
                    bg0Var.I.f();
                    o1.k kVar2 = bg0Var.J;
                    kVar2.f19036b = bg0Var.H;
                    kVar2.f19037c = true;
                    kVar2.f19045u.f19052i = i7.w.a(f9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (bg0Var.r() * bg0Var.F)) - AndroidUtilities.dp(16.0f));
                    bg0Var.J.f();
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
        switch (this.f26767a) {
            case 1:
                bg0 bg0Var = this.f26768b;
                n61 n61Var = bg0Var.M;
                if (n61Var.f30910j) {
                    n61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    bg0Var.M.draw(canvas);
                }
                PhotoViewer photoViewer = bg0Var.R;
                if (photoViewer != null && photoViewer.X3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    bg0Var.R.X3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
