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
public final class a8 extends org.telegram.ui.ActionBar.k {
    public final int f24249u1;
    public final Object f24250v1;

    public a8(Object obj, Context context, int i10) {
        super(context, null);
        this.f24249u1 = i10;
        this.f24250v1 = obj;
    }

    @Override
    public void E(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f24249u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f24250v1;
                super.E(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.f21041e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.E(i10, z10);
                return;
        }
    }

    @Override
    public boolean O(View view) {
        switch (this.f24249u1) {
            case 3:
                if (!super.O(view) && view != ((org.telegram.ui.vy) this.f24250v1).m0) {
                    return false;
                }
                return true;
            default:
                return super.O(view);
        }
    }

    @Override
    public void P(View[] viewArr, boolean[] zArr) {
        switch (this.f24249u1) {
            case 3:
                super.P(viewArr, zArr);
                ((org.telegram.ui.vy) this.f24250v1).h.a(true, true);
                return;
            default:
                super.P(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f24249u1) {
            case 3:
                org.telegram.ui.vy vyVar = (org.telegram.ui.vy) this.f24250v1;
                org.telegram.ui.ly lyVar = vyVar.X;
                if (lyVar != null && lyVar.getAlpha() > 0.0f && vyVar.f42885b.f16088f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void i(boolean z10) {
        switch (this.f24249u1) {
            case 3:
                org.telegram.ui.vy vyVar = (org.telegram.ui.vy) this.f24250v1;
                vyVar.X.f31362r.getText().clear();
                if (z10 && vyVar.X.f31362r.isFocused()) {
                    AndroidUtilities.hideKeyboard(vyVar.X.f31362r);
                }
                vyVar.X.f31362r.clearFocus();
                vyVar.Y.b(false);
                return;
            default:
                super.i(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f24249u1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f24250v1).l5(false);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f24249u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f24250v1;
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
    public void setAlpha(float f7) {
        ViewGroup viewGroup;
        int i10;
        ViewGroup viewGroup2;
        switch (this.f24249u1) {
            case 0:
                super.setAlpha(f7);
                l8.g0((l8) this.f24250v1).invalidate();
                return;
            case 1:
                aj ajVar = (aj) this.f24250v1;
                ci ciVar = ajVar.G0;
                TextView textView = ajVar.f24362m1;
                ci ciVar2 = ajVar.A1;
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
                    aj.O(ajVar);
                    viewGroup = ((org.telegram.ui.ActionBar.e3) ajVar).containerView;
                    viewGroup.invalidate();
                    if (ciVar != null && ciVar2 != null) {
                        if (ciVar.getTag() == null) {
                            si siVar = ajVar.B0;
                            if (siVar == null || siVar.L()) {
                                ciVar2.setAlpha(1.0f - f7);
                                ciVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            ciVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            return;
                        } else if (ajVar.B0 == null) {
                            if (f7 == 0.0f) {
                                f10 = 1.0f;
                            }
                            if (ciVar2.getAlpha() != f10) {
                                ciVar2.setAlpha(f10);
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
                wh0.K((wh0) this.f24250v1).invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                return;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.f24250v1).f33741e0.invalidate();
                return;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f24250v1;
                secretMediaViewer.f34287r.setAlpha(f7);
                secretMediaViewer.f34278n.setAlpha(f7);
                return;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup2 = ((org.telegram.ui.ActionBar.e3) ((rg.y0) this.f24250v1)).containerView;
                    viewGroup2.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.f24249u1) {
            case 7:
                super.setTag(obj);
                rg.y0 y0Var = (rg.y0) this.f24250v1;
                a8 a8Var = y0Var.N;
                if (a8Var != null && a8Var.getTag() != null) {
                    if (i0.a.f(y0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20630h5)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.setLightStatusBar(y0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var = y0Var.f47735b;
                if (m2Var != null) {
                    AndroidUtilities.setLightStatusBar(y0Var, m2Var.isLightStatusBar());
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
        switch (this.f24249u1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.vy) this.f24250v1).fragmentView) != null) {
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
        switch (this.f24249u1) {
            case 1:
                super.setVisibility(i10);
                aj.O((aj) this.f24250v1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public void t() {
        switch (this.f24249u1) {
            case 3:
                super.t();
                ((org.telegram.ui.vy) this.f24250v1).h.a(false, true);
                return;
            default:
                super.t();
                return;
        }
    }

    @Override
    public boolean w() {
        switch (this.f24249u1) {
            case 3:
                org.telegram.ui.px pxVar = ((org.telegram.ui.vy) this.f24250v1).F3;
                if (pxVar != null && pxVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.w();
        }
    }

    @Override
    public void x(boolean z10) {
        float f7;
        switch (this.f24249u1) {
            case 3:
                org.telegram.ui.px pxVar = ((org.telegram.ui.vy) this.f24250v1).F3;
                if (pxVar != null && pxVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    animate.alpha(f7).start();
                }
                super.x(z10);
                return;
            default:
                super.x(z10);
                return;
        }
    }

    public a8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.f24249u1 = i10;
        this.f24250v1 = notificationCenterDelegate;
    }
}
