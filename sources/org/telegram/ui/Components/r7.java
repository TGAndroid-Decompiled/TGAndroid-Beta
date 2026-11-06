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
public final class r7 extends org.telegram.ui.ActionBar.k {
    public final int F1;
    public final Object G1;

    public r7(int i7, Context context, Object obj) {
        super(context, null);
        this.F1 = i7;
        this.G1 = obj;
    }

    @Override
    public void D(int i7, boolean z9) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.F1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.G1;
                super.D(i7, z9);
                if (!z9) {
                    profileActivity.C5 = i7;
                    profileActivity.A5();
                }
                if (!z9 && (imageView2 = profileActivity.X0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.f27658e) != null) {
                    imageView.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.D(i7, z9);
                return;
        }
    }

    @Override
    public boolean N(View view) {
        switch (this.F1) {
            case 3:
                if (!super.N(view) && view != ((org.telegram.ui.ww) this.G1).m0) {
                    return false;
                }
                return true;
            default:
                return super.N(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.F1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.ww) this.G1).h.a(true, true);
                return;
            default:
                super.O(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.F1) {
            case 3:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) this.G1;
                org.telegram.ui.lw lwVar = wwVar.X;
                if (lwVar != null && lwVar.getAlpha() > 0.0f && wwVar.f51532b.f55395f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void l(boolean z9) {
        switch (this.F1) {
            case 3:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) this.G1;
                wwVar.X.f37441r.getText().clear();
                if (z9 && wwVar.X.f37441r.isFocused()) {
                    org.telegram.messenger.g0.v1(wwVar.X.f37441r);
                }
                wwVar.X.f37441r.clearFocus();
                wwVar.Y.b(false);
                return;
            default:
                super.l(z9);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.F1) {
            case 5:
                super.onLayout(z9, i7, i10, i11, i12);
                RectF rectF = ProfileActivity.S6;
                ((ProfileActivity) this.G1).L5(false);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.F1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.G1;
                org.telegram.ui.k0 k0Var = profileActivity.X;
                Rect rect = profileActivity.K2;
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
        switch (this.F1) {
            case 0:
                super.setAlpha(f10);
                ((b8) this.G1).f28616b.invalidate();
                return;
            case 1:
                di diVar = (di) this.G1;
                dh dhVar = diVar.f33004x2;
                TextView textView = diVar.f32933d3;
                dh dhVar2 = diVar.f32981r3;
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
                    di.I0(diVar);
                    diVar.f28616b.invalidate();
                    if (dhVar != null && dhVar2 != null) {
                        if (dhVar.getTag() == null) {
                            vh vhVar = diVar.f32984s2;
                            if (vhVar == null || vhVar.M()) {
                                dhVar2.setAlpha(1.0f - f10);
                                dhVar2.setTranslationY(org.telegram.messenger.g0.L(44.0f) * f10);
                            }
                            dhVar.setTranslationY(org.telegram.messenger.g0.L(48.0f) * f10);
                            return;
                        } else if (diVar.f32984s2 == null) {
                            if (f10 == 0.0f) {
                                f11 = 1.0f;
                            }
                            if (dhVar2.getAlpha() != f11) {
                                dhVar2.setAlpha(f11);
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
                ((qe0) this.G1).f28616b.invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                return;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.G1).f41380e0.invalidate();
                return;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.G1;
                secretMediaViewer.f41930r.setAlpha(f10);
                secretMediaViewer.f41922n.setAlpha(f10);
                return;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    ((ug.w0) this.G1).f28616b.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z9;
        switch (this.F1) {
            case 7:
                super.setTag(obj);
                ug.w0 w0Var = (ug.w0) this.G1;
                r7 r7Var = w0Var.E1;
                if (r7Var != null && r7Var.getTag() != null) {
                    if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, w0Var.I0)) > 0.699999988079071d) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    org.telegram.messenger.g0.q3(w0Var, z9);
                    return;
                }
                org.telegram.ui.ActionBar.f2 f2Var = w0Var.f56751i1;
                if (f2Var != null) {
                    org.telegram.messenger.g0.q3(w0Var, f2Var.isLightStatusBar());
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
        switch (this.F1) {
            case 3:
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.ww) this.G1).fragmentView) != null) {
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
        switch (this.F1) {
            case 1:
                super.setVisibility(i7);
                di.I0((di) this.G1);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    @Override
    public void u() {
        switch (this.F1) {
            case 3:
                super.u();
                ((org.telegram.ui.ww) this.G1).h.a(false, true);
                return;
            default:
                super.u();
                return;
        }
    }

    @Override
    public boolean x() {
        switch (this.F1) {
            case 3:
                org.telegram.ui.sv svVar = ((org.telegram.ui.ww) this.G1).F3;
                if (svVar != null && svVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.x();
        }
    }

    @Override
    public void y(boolean z9) {
        float f10;
        switch (this.F1) {
            case 3:
                org.telegram.ui.sv svVar = ((org.telegram.ui.ww) this.G1).F3;
                if (svVar != null && svVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z9) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                }
                super.y(z9);
                return;
            default:
                super.y(z9);
                return;
        }
    }

    public r7(org.telegram.messenger.ls lsVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.F1 = i7;
        this.G1 = lsVar;
    }
}
