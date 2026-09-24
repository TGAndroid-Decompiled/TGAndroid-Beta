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
public final class y7 extends org.telegram.ui.ActionBar.k {
    public final int f30514t1;
    public final Object f30515u1;

    public y7(Object obj, Context context, int i10) {
        super(context, null);
        this.f30514t1 = i10;
        this.f30515u1 = obj;
    }

    @Override
    public void B(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f30514t1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f30515u1;
                super.B(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.B(i10, z10);
                return;
        }
    }

    @Override
    public boolean N(View view) {
        switch (this.f30514t1) {
            case 3:
                if (!super.N(view) && view != ((org.telegram.ui.qy) this.f30515u1).m0) {
                    return false;
                }
                return true;
            default:
                return super.N(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.f30514t1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.qy) this.f30515u1).h.a(true, true);
                return;
            default:
                super.O(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f30514t1) {
            case 3:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f30515u1;
                org.telegram.ui.gy gyVar = qyVar.X;
                if (gyVar != null && gyVar.getAlpha() > 0.0f && qyVar.f37004b.f14186f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void h(boolean z10) {
        switch (this.f30514t1) {
            case 3:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f30515u1;
                qyVar.X.f23131r.getText().clear();
                if (z10 && qyVar.X.f23131r.isFocused()) {
                    AndroidUtilities.hideKeyboard(qyVar.X.f23131r);
                }
                qyVar.X.f23131r.clearFocus();
                qyVar.Y.b(false);
                return;
            default:
                super.h(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f30514t1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f30515u1).l5(false);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30514t1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f30515u1;
                org.telegram.ui.k0 k0Var = profileActivity.Y;
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
    public void r() {
        switch (this.f30514t1) {
            case 3:
                super.r();
                ((org.telegram.ui.qy) this.f30515u1).h.a(false, true);
                return;
            default:
                super.r();
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i10;
        ViewGroup viewGroup3;
        switch (this.f30514t1) {
            case 0:
                super.setAlpha(f7);
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((j8) this.f30515u1)).containerView;
                viewGroup.invalidate();
                return;
            case 1:
                wi wiVar = (wi) this.f30515u1;
                yh yhVar = wiVar.D0;
                TextView textView = wiVar.f29998j1;
                yh yhVar2 = wiVar.f30043x1;
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
                    wi.M(wiVar);
                    viewGroup2 = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                    viewGroup2.invalidate();
                    if (yhVar != null && yhVar2 != null) {
                        if (yhVar.getTag() == null) {
                            oi oiVar = wiVar.f30046y0;
                            if (oiVar == null || oiVar.J()) {
                                yhVar2.setAlpha(1.0f - f7);
                                yhVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            yhVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            return;
                        } else if (wiVar.f30046y0 == null) {
                            if (f7 == 0.0f) {
                                f10 = 1.0f;
                            }
                            if (yhVar2.getAlpha() != f10) {
                                yhVar2.setAlpha(f10);
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
                ah0.J((ah0) this.f30515u1).invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                return;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.f30515u1).f31209e0.invalidate();
                return;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f30515u1;
                secretMediaViewer.f31745r.setAlpha(f7);
                secretMediaViewer.f31736n.setAlpha(f7);
                return;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup3 = ((org.telegram.ui.ActionBar.e3) ((rg.x0) this.f30515u1)).containerView;
                    viewGroup3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.f30514t1) {
            case 7:
                super.setTag(obj);
                rg.x0 x0Var = (rg.x0) this.f30515u1;
                y7 y7Var = x0Var.N;
                if (y7Var != null && y7Var.getTag() != null) {
                    if (i0.a.f(x0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19115h5)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.setLightStatusBar(x0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var = x0Var.f42807b;
                if (m2Var != null) {
                    AndroidUtilities.setLightStatusBar(x0Var, m2Var.isLightStatusBar());
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
        switch (this.f30514t1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.qy) this.f30515u1).fragmentView) != null) {
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
        switch (this.f30514t1) {
            case 1:
                super.setVisibility(i10);
                wi.M((wi) this.f30515u1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public boolean u() {
        switch (this.f30514t1) {
            case 3:
                org.telegram.ui.kx kxVar = ((org.telegram.ui.qy) this.f30515u1).F3;
                if (kxVar != null && kxVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.u();
        }
    }

    @Override
    public void v(boolean z10) {
        float f7;
        switch (this.f30514t1) {
            case 3:
                org.telegram.ui.kx kxVar = ((org.telegram.ui.qy) this.f30515u1).F3;
                if (kxVar != null && kxVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                }
                super.v(z10);
                return;
            default:
                super.v(z10);
                return;
        }
    }

    public y7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f30514t1 = i10;
        this.f30515u1 = notificationCenterDelegate;
    }
}
