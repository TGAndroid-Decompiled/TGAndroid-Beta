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
    public final int f24621u1;
    public final Object f24622v1;

    public a8(Object obj, Context context, int i10) {
        super(context, null);
        this.f24621u1 = i10;
        this.f24622v1 = obj;
    }

    @Override
    public void D(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f24621u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f24622v1;
                super.D(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.f21266e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.D(i10, z10);
                return;
        }
    }

    @Override
    public boolean N(View view) {
        switch (this.f24621u1) {
            case 3:
                if (!super.N(view) && view != ((org.telegram.ui.ty) this.f24622v1).m0) {
                    return false;
                }
                return true;
            default:
                return super.N(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.f24621u1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.ty) this.f24622v1).h.a(true, true);
                return;
            default:
                super.O(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f24621u1) {
            case 3:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.f24622v1;
                org.telegram.ui.jy jyVar = tyVar.X;
                if (jyVar != null && jyVar.getAlpha() > 0.0f && tyVar.f42154b.f16338f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void h(boolean z10) {
        switch (this.f24621u1) {
            case 3:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.f24622v1;
                tyVar.X.f30614r.getText().clear();
                if (z10 && tyVar.X.f30614r.isFocused()) {
                    AndroidUtilities.hideKeyboard(tyVar.X.f30614r);
                }
                tyVar.X.f30614r.clearFocus();
                tyVar.Y.b(false);
                return;
            default:
                super.h(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f24621u1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f24622v1).l5(false);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f24621u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f24622v1;
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
    public void s() {
        switch (this.f24621u1) {
            case 3:
                super.s();
                ((org.telegram.ui.ty) this.f24622v1).h.a(false, true);
                return;
            default:
                super.s();
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        ViewGroup viewGroup;
        int i10;
        ViewGroup viewGroup2;
        switch (this.f24621u1) {
            case 0:
                super.setAlpha(f7);
                l8.g0((l8) this.f24622v1).invalidate();
                return;
            case 1:
                yi yiVar = (yi) this.f24622v1;
                ai aiVar = yiVar.G0;
                TextView textView = yiVar.f33248m1;
                ai aiVar2 = yiVar.A1;
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
                    yi.O(yiVar);
                    viewGroup = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                    viewGroup.invalidate();
                    if (aiVar != null && aiVar2 != null) {
                        if (aiVar.getTag() == null) {
                            qi qiVar = yiVar.B0;
                            if (qiVar == null || qiVar.L()) {
                                aiVar2.setAlpha(1.0f - f7);
                                aiVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            aiVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            return;
                        } else if (yiVar.B0 == null) {
                            if (f7 == 0.0f) {
                                f10 = 1.0f;
                            }
                            if (aiVar2.getAlpha() != f10) {
                                aiVar2.setAlpha(f10);
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
                sh0.K((sh0) this.f24622v1).invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                return;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.f24622v1).f33904e0.invalidate();
                return;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f24622v1;
                secretMediaViewer.f34450r.setAlpha(f7);
                secretMediaViewer.f34441n.setAlpha(f7);
                return;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((rg.y0) this.f24622v1)).containerView;
                    viewGroup2.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.f24621u1) {
            case 7:
                super.setTag(obj);
                rg.y0 y0Var = (rg.y0) this.f24622v1;
                a8 a8Var = y0Var.N;
                if (a8Var != null && a8Var.getTag() != null) {
                    if (i0.a.f(y0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.setLightStatusBar(y0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var = y0Var.f47519b;
                if (n2Var != null) {
                    AndroidUtilities.setLightStatusBar(y0Var, n2Var.isLightStatusBar());
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
        switch (this.f24621u1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.ty) this.f24622v1).fragmentView) != null) {
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
        switch (this.f24621u1) {
            case 1:
                super.setVisibility(i10);
                yi.O((yi) this.f24622v1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public boolean v() {
        switch (this.f24621u1) {
            case 3:
                org.telegram.ui.nx nxVar = ((org.telegram.ui.ty) this.f24622v1).F3;
                if (nxVar != null && nxVar.c()) {
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
        switch (this.f24621u1) {
            case 3:
                org.telegram.ui.nx nxVar = ((org.telegram.ui.ty) this.f24622v1).F3;
                if (nxVar != null && nxVar.c() && getBackButton() != null) {
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

    public a8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.f24621u1 = i10;
        this.f24622v1 = notificationCenterDelegate;
    }
}
