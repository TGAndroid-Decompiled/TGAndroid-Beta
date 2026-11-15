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
public final class o7 extends org.telegram.ui.ActionBar.k {
    public final int G1;
    public final Object H1;

    public o7(int i7, Context context, Object obj) {
        super(context, null);
        this.G1 = i7;
        this.H1 = obj;
    }

    @Override
    public void A(boolean z10) {
        float f10;
        switch (this.G1) {
            case 3:
                org.telegram.ui.uv uvVar = ((org.telegram.ui.yw) this.H1).H3;
                if (uvVar != null && uvVar.c() && getBackButton() != null) {
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
    public void H(int i7, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.G1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                super.H(i7, z10);
                if (!z10) {
                    profileActivity.G5 = i7;
                    profileActivity.D5();
                }
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.J0 && (imageView = this.f29284e) != null) {
                    imageView.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.H(i7, z10);
                return;
        }
    }

    @Override
    public boolean Q(View view) {
        switch (this.G1) {
            case 3:
                if (!super.Q(view) && view != ((org.telegram.ui.yw) this.H1).f53676n0) {
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
                ((org.telegram.ui.yw) this.H1).h.a(true, true);
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
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.H1;
                org.telegram.ui.nw nwVar = ywVar.Y;
                if (nwVar != null && nwVar.getAlpha() > 0.0f && ywVar.f53615b.f57086f) {
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
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.H1;
                ywVar.Y.f40202r.getText().clear();
                if (z10 && ywVar.Y.f40202r.isFocused()) {
                    org.telegram.messenger.g0.v1(ywVar.Y.f40202r);
                }
                ywVar.Y.f40202r.clearFocus();
                ywVar.Z.b(false);
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
                RectF rectF = ProfileActivity.X6;
                ((ProfileActivity) this.H1).O5(false);
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
                ((y7) this.H1).f29682b.invalidate();
                return;
            case 1:
                ki kiVar = (ki) this.H1;
                kh khVar = kiVar.B2;
                TextView textView = kiVar.f36445h3;
                kh khVar2 = kiVar.f36494v3;
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
                    ki.I0(kiVar);
                    kiVar.f29682b.invalidate();
                    if (khVar != null && khVar2 != null) {
                        if (khVar.getTag() == null) {
                            ci ciVar = kiVar.f36497w2;
                            if (ciVar == null || ciVar.N()) {
                                khVar2.setAlpha(1.0f - f10);
                                khVar2.setTranslationY(org.telegram.messenger.g0.L(44.0f) * f10);
                            }
                            khVar.setTranslationY(org.telegram.messenger.g0.L(48.0f) * f10);
                            return;
                        } else if (kiVar.f36497w2 == null) {
                            if (f10 == 0.0f) {
                                f11 = 1.0f;
                            }
                            if (khVar2.getAlpha() != f11) {
                                khVar2.setAlpha(f11);
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
                ((te0) this.H1).f29682b.invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                return;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.H1).f42763f0.invalidate();
                return;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.H1;
                secretMediaViewer.f43305r.setAlpha(f10);
                secretMediaViewer.f43297n.setAlpha(f10);
                return;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    ((ug.x0) this.H1).f29682b.invalidate();
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
                ug.x0 x0Var = (ug.x0) this.H1;
                o7 o7Var = x0Var.I1;
                if (o7Var != null && o7Var.getTag() != null) {
                    if (i0.a.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, x0Var.J0)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.messenger.g0.q3(x0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.e2 e2Var = x0Var.f58370m1;
                if (e2Var != null) {
                    org.telegram.messenger.g0.q3(x0Var, e2Var.isLightStatusBar());
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
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.yw) this.H1).fragmentView) != null) {
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
                ki.I0((ki) this.H1);
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
                ((org.telegram.ui.yw) this.H1).h.a(false, true);
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
                org.telegram.ui.uv uvVar = ((org.telegram.ui.yw) this.H1).H3;
                if (uvVar != null && uvVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.z();
        }
    }

    public o7(org.telegram.messenger.is isVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.G1 = i7;
        this.H1 = isVar;
    }
}
