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
public final class p7 extends org.telegram.ui.ActionBar.k {
    public final int G1;
    public final Object H1;

    public p7(int i3, Context context, Object obj) {
        super(context, null);
        this.G1 = i3;
        this.H1 = obj;
    }

    @Override
    public void D(int i3, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.G1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                super.D(i3, z10);
                if (!z10) {
                    profileActivity.D5 = i3;
                    profileActivity.A5();
                }
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.J0 && (imageView = this.f27708e) != null) {
                    imageView.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.D(i3, z10);
                return;
        }
    }

    @Override
    public boolean N(View view) {
        switch (this.G1) {
            case 3:
                if (!super.N(view) && view != ((org.telegram.ui.uw) this.H1).f50267n0) {
                    return false;
                }
                return true;
            default:
                return super.N(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.G1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.uw) this.H1).h.a(true, true);
                return;
            default:
                super.O(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.H1;
                org.telegram.ui.iw iwVar = uwVar.Y;
                if (iwVar != null && iwVar.getAlpha() > 0.0f && uwVar.f50207b.f53841f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void l(boolean z10) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.H1;
                uwVar.Y.f36302r.getText().clear();
                if (z10 && uwVar.Y.f36302r.isFocused()) {
                    org.telegram.messenger.g0.v1(uwVar.Y.f36302r);
                }
                uwVar.Y.f36302r.clearFocus();
                uwVar.Z.b(false);
                return;
            default:
                super.l(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.G1) {
            case 5:
                super.onLayout(z10, i3, i10, i11, i12);
                RectF rectF = ProfileActivity.T6;
                ((ProfileActivity) this.H1).L5(false);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                org.telegram.ui.l0 l0Var = profileActivity.Y;
                Rect rect = profileActivity.L2;
                l0Var.getHitRect(rect);
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
        int i3;
        switch (this.G1) {
            case 0:
                super.setAlpha(f10);
                ((z7) this.H1).f28586b.invalidate();
                return;
            case 1:
                bi biVar = (bi) this.H1;
                ah ahVar = biVar.f32295y2;
                TextView textView = biVar.f32224e3;
                ah ahVar2 = biVar.f32272s3;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    float f11 = 0.0f;
                    if (textView != null) {
                        float f12 = 1.0f - f10;
                        textView.setAlpha(f12);
                        if (f12 > 0.0f) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        textView.setVisibility(i3);
                    }
                    bi.I0(biVar);
                    biVar.f28586b.invalidate();
                    if (ahVar != null && ahVar2 != null) {
                        if (ahVar.getTag() == null) {
                            th thVar = biVar.f32275t2;
                            if (thVar == null || thVar.M()) {
                                ahVar2.setAlpha(1.0f - f10);
                                ahVar2.setTranslationY(org.telegram.messenger.g0.L(44.0f) * f10);
                            }
                            ahVar.setTranslationY(org.telegram.messenger.g0.L(48.0f) * f10);
                            return;
                        } else if (biVar.f32275t2 == null) {
                            if (f10 == 0.0f) {
                                f11 = 1.0f;
                            }
                            if (ahVar2.getAlpha() != f11) {
                                ahVar2.setAlpha(f11);
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
                ((se0) this.H1).f28586b.invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                return;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.H1).f41420f0.invalidate();
                return;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.H1;
                secretMediaViewer.f41962r.setAlpha(f10);
                secretMediaViewer.f41953n.setAlpha(f10);
                return;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    ((vg.v0) this.H1).f28586b.invalidate();
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
                vg.v0 v0Var = (vg.v0) this.H1;
                p7 p7Var = v0Var.F1;
                if (p7Var != null && p7Var.getTag() != null) {
                    if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, v0Var.J0)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.messenger.g0.q3(v0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.d2 d2Var = v0Var.f56874j1;
                if (d2Var != null) {
                    org.telegram.messenger.g0.q3(v0Var, d2Var.isLightStatusBar());
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
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.uw) this.H1).fragmentView) != null) {
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
    public void setVisibility(int i3) {
        switch (this.G1) {
            case 1:
                super.setVisibility(i3);
                bi.I0((bi) this.H1);
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }

    @Override
    public void u() {
        switch (this.G1) {
            case 3:
                super.u();
                ((org.telegram.ui.uw) this.H1).h.a(false, true);
                return;
            default:
                super.u();
                return;
        }
    }

    @Override
    public boolean x() {
        switch (this.G1) {
            case 3:
                org.telegram.ui.pv pvVar = ((org.telegram.ui.uw) this.H1).G3;
                if (pvVar != null && pvVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.x();
        }
    }

    @Override
    public void y(boolean z10) {
        float f10;
        switch (this.G1) {
            case 3:
                org.telegram.ui.pv pvVar = ((org.telegram.ui.uw) this.H1).G3;
                if (pvVar != null && pvVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                }
                super.y(z10);
                return;
            default:
                super.y(z10);
                return;
        }
    }

    public p7(org.telegram.messenger.cs csVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.G1 = i3;
        this.H1 = csVar;
    }
}
