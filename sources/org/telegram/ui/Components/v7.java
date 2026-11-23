package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
public final class v7 extends org.telegram.ui.ActionBar.k {
    public final int G1;
    public final Object H1;

    public v7(int i7, Context context, Object obj) {
        super(context, null);
        this.G1 = i7;
        this.H1 = obj;
    }

    @Override
    public void A(boolean z10) {
        float f10;
        switch (this.G1) {
            case 3:
                org.telegram.ui.xv xvVar = ((org.telegram.ui.cx) this.H1).H3;
                if (xvVar != null && xvVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                }
                super.A(z10);
                return;
            default:
                super.A(z10);
                return;
        }
    }

    @Override
    public void G(int i7, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.G1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                super.G(i7, z10);
                if (!z10) {
                    profileActivity.I5 = i7;
                    profileActivity.E5();
                }
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.J0 && (imageView = this.f29130e) != null) {
                    imageView.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.G(i7, z10);
                return;
        }
    }

    @Override
    public boolean Q(View view) {
        switch (this.G1) {
            case 3:
                if (!super.Q(view) && view != ((org.telegram.ui.cx) this.H1).f46760n0) {
                    return false;
                }
                return true;
            default:
                return super.Q(view);
        }
    }

    @Override
    public void R(View[] viewArr, boolean[] zArr) {
        switch (this.G1) {
            case 3:
                super.R(viewArr, zArr);
                ((org.telegram.ui.cx) this.H1).h.a(true, true);
                return;
            default:
                super.R(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.H1;
                org.telegram.ui.qw qwVar = cxVar.Y;
                if (qwVar != null && qwVar.getAlpha() > 0.0f && cxVar.f46699b.f57701f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void n(boolean z10) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.H1;
                cxVar.Y.f34642r.getText().clear();
                if (z10 && cxVar.Y.f34642r.isFocused()) {
                    org.telegram.messenger.g0.v1(cxVar.Y.f34642r);
                }
                cxVar.Y.f34642r.clearFocus();
                cxVar.Z.b(false);
                return;
            default:
                super.n(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.G1) {
            case 5:
                super.onLayout(z10, i7, i10, i11, i12);
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) this.H1).P5(false);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                org.telegram.ui.k0 k0Var = profileActivity.Y;
                Rect rect = profileActivity.M2;
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
    public void setAlpha(float f10) {
        int i7;
        switch (this.G1) {
            case 0:
                super.setAlpha(f10);
                ((f8) this.H1).f30176b.invalidate();
                return;
            case 1:
                ui uiVar = (ui) this.H1;
                uh uhVar = uiVar.B2;
                TextView textView = uiVar.f40389h3;
                uh uhVar2 = uiVar.f40438v3;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    float f11 = 0.0f;
                    if (textView != null) {
                        float f12 = 1.0f - f10;
                        textView.setAlpha(f12);
                        if (f12 > 0.0f) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        textView.setVisibility(i7);
                    }
                    ui.J0(uiVar);
                    uiVar.f30176b.invalidate();
                    if (uhVar != null && uhVar2 != null) {
                        if (uhVar.getTag() == null) {
                            mi miVar = uiVar.f40441w2;
                            if (miVar == null || miVar.N()) {
                                uhVar2.setAlpha(1.0f - f10);
                                uhVar2.setTranslationY(org.telegram.messenger.g0.L(44.0f) * f10);
                            }
                            uhVar.setTranslationY(org.telegram.messenger.g0.L(48.0f) * f10);
                            return;
                        } else if (uiVar.f40441w2 == null) {
                            if (f10 == 0.0f) {
                                f11 = 1.0f;
                            }
                            if (uhVar2.getAlpha() != f11) {
                                uhVar2.setAlpha(f11);
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
                ((ff0) this.H1).f30176b.invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                return;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.H1).f43253f0.invalidate();
                return;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.H1;
                secretMediaViewer.f43796r.setAlpha(f10);
                secretMediaViewer.f43788n.setAlpha(f10);
                return;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    ((ug.y0) this.H1).f30176b.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.G1) {
            case 7:
                super.setTag(obj);
                ug.y0 y0Var = (ug.y0) this.H1;
                v7 v7Var = y0Var.I1;
                if (v7Var != null && v7Var.getTag() != null) {
                    if (i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, y0Var.J0)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.messenger.g0.p3(y0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.g2 g2Var = y0Var.f58996m1;
                if (g2Var != null) {
                    org.telegram.messenger.g0.p3(y0Var, g2Var.isLightStatusBar());
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
        switch (this.G1) {
            case 3:
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.cx) this.H1).fragmentView) != null) {
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
    public void setVisibility(int i7) {
        switch (this.G1) {
            case 1:
                super.setVisibility(i7);
                ui.J0((ui) this.H1);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    @Override
    public void w() {
        switch (this.G1) {
            case 3:
                super.w();
                ((org.telegram.ui.cx) this.H1).h.a(false, true);
                return;
            default:
                super.w();
                return;
        }
    }

    @Override
    public boolean z() {
        switch (this.G1) {
            case 3:
                org.telegram.ui.xv xvVar = ((org.telegram.ui.cx) this.H1).H3;
                if (xvVar != null && xvVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.z();
        }
    }

    public v7(org.telegram.messenger.gs gsVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.G1 = i7;
        this.H1 = gsVar;
    }
}
