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
public final class r7 extends org.telegram.ui.ActionBar.k {
    public final int f32101p1;
    public final Object f32102q1;

    public r7(Object obj, Context context, int i9) {
        super(context, null);
        this.f32101p1 = i9;
        this.f32102q1 = obj;
    }

    @Override
    public void C(int i9, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f32101p1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f32102q1;
                super.C(i9, z10);
                if (!z10 && (imageView2 = profileActivity.U0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.E0 && (imageView = this.f23565e) != null) {
                    imageView.setColorFilter(i9, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.C(i9, z10);
                return;
        }
    }

    @Override
    public boolean M(View view) {
        switch (this.f32101p1) {
            case 3:
                if (!super.M(view) && view != ((org.telegram.ui.dy) this.f32102q1).f37671i0) {
                    return false;
                }
                return true;
            default:
                return super.M(view);
        }
    }

    @Override
    public void N(View[] viewArr, boolean[] zArr) {
        switch (this.f32101p1) {
            case 3:
                super.N(viewArr, zArr);
                ((org.telegram.ui.dy) this.f32102q1).h.a(true, true);
                return;
            default:
                super.N(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f32101p1) {
            case 3:
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.f32102q1;
                org.telegram.ui.sx sxVar = dyVar.T;
                if (sxVar != null && sxVar.getAlpha() > 0.0f && dyVar.f37632b.f47776f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void h(boolean z10) {
        switch (this.f32101p1) {
            case 3:
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.f32102q1;
                dyVar.T.f30664r.getText().clear();
                if (z10 && dyVar.T.f30664r.isFocused()) {
                    AndroidUtilities.hideKeyboard(dyVar.T.f30664r);
                }
                dyVar.T.f30664r.clearFocus();
                dyVar.U.b(false);
                return;
            default:
                super.h(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f32101p1) {
            case 5:
                super.onLayout(z10, i9, i10, i11, i12);
                ((ProfileActivity) this.f32102q1).l5(false);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32101p1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f32102q1;
                org.telegram.ui.m0 m0Var = profileActivity.U;
                Rect rect = profileActivity.H2;
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
        switch (this.f32101p1) {
            case 3:
                super.r();
                ((org.telegram.ui.dy) this.f32102q1).h.a(false, true);
                return;
            default:
                super.r();
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i9;
        ViewGroup viewGroup3;
        switch (this.f32101p1) {
            case 0:
                super.setAlpha(f10);
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((c8) this.f32102q1)).containerView;
                viewGroup.invalidate();
                return;
            case 1:
                ki kiVar = (ki) this.f32102q1;
                mh mhVar = kiVar.f30178z0;
                TextView textView = kiVar.f30115f1;
                mh mhVar2 = kiVar.f30158t1;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    float f11 = 0.0f;
                    if (textView != null) {
                        float f12 = 1.0f - f10;
                        textView.setAlpha(f12);
                        if (f12 > 0.0f) {
                            i9 = 0;
                        } else {
                            i9 = 8;
                        }
                        textView.setVisibility(i9);
                    }
                    ki.L(kiVar);
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                    viewGroup2.invalidate();
                    if (mhVar != null && mhVar2 != null) {
                        if (mhVar.getTag() == null) {
                            ci ciVar = kiVar.f30160u0;
                            if (ciVar == null || ciVar.I()) {
                                mhVar2.setAlpha(1.0f - f10);
                                mhVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f10);
                            }
                            mhVar.setTranslationY(AndroidUtilities.dp(48.0f) * f10);
                            return;
                        } else if (kiVar.f30160u0 == null) {
                            if (f10 == 0.0f) {
                                f11 = 1.0f;
                            }
                            if (mhVar2.getAlpha() != f11) {
                                mhVar2.setAlpha(f11);
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
                super.setAlpha(f10);
                ag0.I((ag0) this.f32102q1).invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                return;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.f32102q1).f35580a0.invalidate();
                return;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32102q1;
                secretMediaViewer.f36154r.setAlpha(f10);
                secretMediaViewer.f36145n.setAlpha(f10);
                return;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((zf.x0) this.f32102q1)).containerView;
                    viewGroup3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.f32101p1) {
            case 7:
                super.setTag(obj);
                zf.x0 x0Var = (zf.x0) this.f32102q1;
                r7 r7Var = x0Var.J;
                if (r7Var != null && r7Var.getTag() != null) {
                    if (i0.a.f(x0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.setLightStatusBar(x0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.o2 o2Var = x0Var.f50772b;
                if (o2Var != null) {
                    AndroidUtilities.setLightStatusBar(x0Var, o2Var.isLightStatusBar());
                    return;
                }
                return;
            default:
                super.setTag(obj);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        View view;
        switch (this.f32101p1) {
            case 3:
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.dy) this.f32102q1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.f32101p1) {
            case 1:
                super.setVisibility(i9);
                ki.L((ki) this.f32102q1);
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }

    @Override
    public boolean u() {
        switch (this.f32101p1) {
            case 3:
                org.telegram.ui.yw ywVar = ((org.telegram.ui.dy) this.f32102q1).B3;
                if (ywVar != null && ywVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.u();
        }
    }

    @Override
    public void v(boolean z10) {
        float f10;
        switch (this.f32101p1) {
            case 3:
                org.telegram.ui.yw ywVar = ((org.telegram.ui.dy) this.f32102q1).B3;
                if (ywVar != null && ywVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                }
                super.v(z10);
                return;
            default:
                super.v(z10);
                return;
        }
    }

    public r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.f32101p1 = i9;
        this.f32102q1 = notificationCenterDelegate;
    }
}
