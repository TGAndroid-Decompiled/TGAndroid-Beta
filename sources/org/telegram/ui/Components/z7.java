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
public final class z7 extends org.telegram.ui.ActionBar.k {
    public final int f32849u1;
    public final Object f32850v1;

    public z7(Object obj, Context context, int i10) {
        super(context, null);
        this.f32849u1 = i10;
        this.f32850v1 = obj;
    }

    @Override
    public void C(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f32849u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f32850v1;
                super.C(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Z0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.J0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.C(i10, z10);
                return;
        }
    }

    @Override
    public boolean N(View view) {
        switch (this.f32849u1) {
            case 3:
                if (!super.N(view) && view != ((org.telegram.ui.ey) this.f32850v1).m0) {
                    return false;
                }
                return true;
            default:
                return super.N(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.f32849u1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.ey) this.f32850v1).h.a(true, true);
                return;
            default:
                super.O(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f32849u1) {
            case 3:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f32850v1;
                org.telegram.ui.tx txVar = eyVar.X;
                if (txVar != null && txVar.getAlpha() > 0.0f && eyVar.f36613b.f17380f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void h(boolean z10) {
        switch (this.f32849u1) {
            case 3:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f32850v1;
                eyVar.X.f27712r.getText().clear();
                if (z10 && eyVar.X.f27712r.isFocused()) {
                    AndroidUtilities.hideKeyboard(eyVar.X.f27712r);
                }
                eyVar.X.f27712r.clearFocus();
                eyVar.Y.b(false);
                return;
            default:
                super.h(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f32849u1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f32850v1).l5(false);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32849u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f32850v1;
                org.telegram.ui.m0 m0Var = profileActivity.Y;
                Rect rect = profileActivity.M2;
                m0Var.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void r() {
        switch (this.f32849u1) {
            case 3:
                super.r();
                ((org.telegram.ui.ey) this.f32850v1).h.a(false, true);
                return;
            default:
                super.r();
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        ViewGroup viewGroup;
        int i10;
        ViewGroup viewGroup2;
        switch (this.f32849u1) {
            case 0:
                super.setAlpha(f7);
                k8.g0((k8) this.f32850v1).invalidate();
                return;
            case 1:
                ti tiVar = (ti) this.f32850v1;
                wh whVar = tiVar.G0;
                TextView textView = tiVar.f30594m1;
                wh whVar2 = tiVar.A1;
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
                    ti.O(tiVar);
                    viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                    viewGroup.invalidate();
                    if (whVar != null && whVar2 != null) {
                        if (whVar.getTag() == null) {
                            li liVar = tiVar.B0;
                            if (liVar == null || liVar.L()) {
                                whVar2.setAlpha(1.0f - f7);
                                whVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            whVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            return;
                        } else if (tiVar.B0 == null) {
                            if (f7 == 0.0f) {
                                f10 = 1.0f;
                            }
                            if (whVar2.getAlpha() != f10) {
                                whVar2.setAlpha(f10);
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
                kh0.K((kh0) this.f32850v1).invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                return;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.f32850v1).f33266e0.invalidate();
                return;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32850v1;
                secretMediaViewer.f33806r.setAlpha(f7);
                secretMediaViewer.f33797n.setAlpha(f7);
                return;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((sg.x0) this.f32850v1)).containerView;
                    viewGroup2.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.f32849u1) {
            case 7:
                super.setTag(obj);
                sg.x0 x0Var = (sg.x0) this.f32850v1;
                z7 z7Var = x0Var.N;
                if (z7Var != null && z7Var.getTag() != null) {
                    if (i0.b.h(x0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.setLightStatusBar(x0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var = x0Var.f46505b;
                if (n2Var != null) {
                    AndroidUtilities.setLightStatusBar(x0Var, n2Var.isLightStatusBar());
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
        switch (this.f32849u1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.ey) this.f32850v1).fragmentView) != null) {
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
        switch (this.f32849u1) {
            case 1:
                super.setVisibility(i10);
                ti.O((ti) this.f32850v1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public boolean v() {
        switch (this.f32849u1) {
            case 3:
                org.telegram.ui.yw ywVar = ((org.telegram.ui.ey) this.f32850v1).G3;
                if (ywVar != null && ywVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.v();
        }
    }

    @Override
    public void w(boolean z10) {
        float f7;
        switch (this.f32849u1) {
            case 3:
                org.telegram.ui.yw ywVar = ((org.telegram.ui.ey) this.f32850v1).G3;
                if (ywVar != null && ywVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                }
                super.w(z10);
                return;
            default:
                super.w(z10);
                return;
        }
    }

    public z7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f32849u1 = i10;
        this.f32850v1 = notificationCenterDelegate;
    }
}
