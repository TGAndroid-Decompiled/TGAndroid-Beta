package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
public final class b8 extends org.telegram.ui.ActionBar.k {
    public final int f26757x1;
    public final Object f26758y1;

    public b8(Object obj, Context context, int i10) {
        super(context, null);
        this.f26757x1 = i10;
        this.f26758y1 = obj;
    }

    @Override
    public boolean J(View view) {
        switch (this.f26757x1) {
            case 3:
                if (!super.J(view) && view != ((org.telegram.ui.ey) this.f26758y1).m0) {
                    return false;
                }
                return true;
            default:
                return super.J(view);
        }
    }

    @Override
    public void K(View[] viewArr, boolean[] zArr) {
        switch (this.f26757x1) {
            case 3:
                super.K(viewArr, zArr);
                ((org.telegram.ui.ey) this.f26758y1).h.a(true, true);
                return;
            default:
                super.K(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f26757x1) {
            case 3:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f26758y1;
                org.telegram.ui.rx rxVar = eyVar.X;
                if (rxVar != null && rxVar.getAlpha() > 0.0f && eyVar.f38981b.f19326f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void g(boolean z10) {
        switch (this.f26757x1) {
            case 3:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f26758y1;
                eyVar.X.f30347r.getText().clear();
                if (z10 && eyVar.X.f30347r.isFocused()) {
                    AndroidUtilities.hideKeyboard(eyVar.X.f30347r);
                }
                eyVar.X.f30347r.clearFocus();
                eyVar.Y.b(false);
                return;
            default:
                super.g(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f26757x1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = ProfileActivity.R6;
                ((ProfileActivity) this.f26758y1).x5(false);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26757x1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f26758y1;
                org.telegram.ui.k0 k0Var = profileActivity.X;
                Rect rect = profileActivity.L2;
                k0Var.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void p() {
        switch (this.f26757x1) {
            case 3:
                super.p();
                ((org.telegram.ui.ey) this.f26758y1).h.a(false, true);
                return;
            default:
                super.p();
                return;
        }
    }

    @Override
    public boolean s() {
        switch (this.f26757x1) {
            case 3:
                org.telegram.ui.vw vwVar = ((org.telegram.ui.ey) this.f26758y1).G3;
                if (vwVar != null && vwVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.s();
        }
    }

    @Override
    public void setAlpha(float f7) {
        ViewGroup viewGroup;
        int i10;
        ViewGroup viewGroup2;
        switch (this.f26757x1) {
            case 0:
                super.setAlpha(f7);
                m8.f0((m8) this.f26758y1).invalidate();
                return;
            case 1:
                ti tiVar = (ti) this.f26758y1;
                th thVar = tiVar.G0;
                TextView textView = tiVar.f33010m1;
                th thVar2 = tiVar.A1;
                float alpha = getAlpha();
                super.setAlpha(f7);
                if (alpha != f7) {
                    float f10 = 0.0f;
                    if (textView != null) {
                        float f11 = 1.0f - f7;
                        textView.setAlpha(f11);
                        if (f11 > 0.0f) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        textView.setVisibility(i10);
                    }
                    ti.I(tiVar);
                    viewGroup = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
                    viewGroup.invalidate();
                    if (thVar != null && thVar2 != null) {
                        if (thVar.getTag() == null) {
                            li liVar = tiVar.B0;
                            if (liVar == null || liVar.L()) {
                                thVar2.setAlpha(1.0f - f7);
                                thVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            thVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            return;
                        } else if (tiVar.B0 == null) {
                            if (f7 == 0.0f) {
                                f10 = 1.0f;
                            }
                            if (thVar2.getAlpha() != f10) {
                                thVar2.setAlpha(f10);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                super.setAlpha(f7);
                oh0.K((oh0) this.f26758y1).invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                return;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.f26758y1).f35670e0.invalidate();
                return;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f26758y1;
                secretMediaViewer.f36212r.setAlpha(f7);
                secretMediaViewer.f36203n.setAlpha(f7);
                return;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup2 = ((org.telegram.ui.ActionBar.k3) ((tg.y0) this.f26758y1)).containerView;
                    viewGroup2.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.f26757x1) {
            case 7:
                super.setTag(obj);
                tg.y0 y0Var = (tg.y0) this.f26758y1;
                b8 b8Var = y0Var.N;
                if (b8Var != null && b8Var.getTag() != null) {
                    if (i0.a.h(y0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.setLightStatusBar(y0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.r2 r2Var = y0Var.f49162b;
                if (r2Var != null) {
                    AndroidUtilities.setLightStatusBar(y0Var, r2Var.isLightStatusBar());
                    return;
                }
                return;
            default:
                super.setTag(obj);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        View view;
        switch (this.f26757x1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.ey) this.f26758y1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f26757x1) {
            case 1:
                super.setVisibility(i10);
                ti.I((ti) this.f26758y1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public void t(boolean z10) {
        float f7;
        switch (this.f26757x1) {
            case 3:
                org.telegram.ui.vw vwVar = ((org.telegram.ui.ey) this.f26758y1).G3;
                if (vwVar != null && vwVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                }
                super.t(z10);
                return;
            default:
                super.t(z10);
                return;
        }
    }

    @Override
    public void y(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f26757x1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f26758y1;
                super.y(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.y(i10, z10);
                return;
        }
    }

    public b8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f26757x1 = i10;
        this.f26758y1 = notificationCenterDelegate;
    }
}
