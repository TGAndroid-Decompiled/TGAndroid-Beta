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
public final class q7 extends org.telegram.ui.ActionBar.l {
    public final int F1;
    public final Object G1;

    public q7(int i7, Context context, Object obj) {
        super(context, null);
        this.F1 = i7;
        this.G1 = obj;
    }

    @Override
    public void A(boolean z9) {
        float f10;
        switch (this.F1) {
            case 3:
                org.telegram.ui.vv vvVar = ((org.telegram.ui.zw) this.G1).G3;
                if (vvVar != null && vvVar.c() && getBackButton() != null) {
                    ViewPropertyAnimator animate = getBackButton().animate();
                    if (z9) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).start();
                }
                super.A(z9);
                return;
            default:
                super.A(z9);
                return;
        }
    }

    @Override
    public void G(int i7, boolean z9) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.F1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.G1;
                super.G(i7, z9);
                if (!z9) {
                    profileActivity.E5 = i7;
                    profileActivity.D5();
                }
                if (!z9 && (imageView2 = profileActivity.X0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.f27672e) != null) {
                    imageView.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
                    return;
                }
                return;
            default:
                super.G(i7, z9);
                return;
        }
    }

    @Override
    public boolean P(View view) {
        switch (this.F1) {
            case 3:
                if (!super.P(view) && view != ((org.telegram.ui.zw) this.G1).m0) {
                    return false;
                }
                return true;
            default:
                return super.P(view);
        }
    }

    @Override
    public void Q(View[] viewArr, boolean[] zArr) {
        switch (this.F1) {
            case 3:
                super.Q(viewArr, zArr);
                ((org.telegram.ui.zw) this.G1).h.a(true, true);
                return;
            default:
                super.Q(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.F1) {
            case 3:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) this.G1;
                org.telegram.ui.ow owVar = zwVar.X;
                if (owVar != null && owVar.getAlpha() > 0.0f && zwVar.f52560b.f55499f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void n(boolean z9) {
        switch (this.F1) {
            case 3:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) this.G1;
                zwVar.X.f37446r.getText().clear();
                if (z9 && zwVar.X.f37446r.isFocused()) {
                    org.telegram.messenger.g0.v1(zwVar.X.f37446r);
                }
                zwVar.X.f37446r.clearFocus();
                zwVar.Y.b(false);
                return;
            default:
                super.n(z9);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.F1) {
            case 5:
                super.onLayout(z9, i7, i10, i11, i12);
                RectF rectF = ProfileActivity.V6;
                ((ProfileActivity) this.G1).O5(false);
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
                ((a8) this.G1).f28672b.invalidate();
                return;
            case 1:
                ci ciVar = (ci) this.G1;
                ch chVar = ciVar.A2;
                TextView textView = ciVar.f32609g3;
                ch chVar2 = ciVar.f32657u3;
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
                    ci.I0(ciVar);
                    ciVar.f28672b.invalidate();
                    if (chVar != null && chVar2 != null) {
                        if (chVar.getTag() == null) {
                            uh uhVar = ciVar.f32660v2;
                            if (uhVar == null || uhVar.M()) {
                                chVar2.setAlpha(1.0f - f10);
                                chVar2.setTranslationY(org.telegram.messenger.g0.L(44.0f) * f10);
                            }
                            chVar.setTranslationY(org.telegram.messenger.g0.L(48.0f) * f10);
                            return;
                        } else if (ciVar.f32660v2 == null) {
                            if (f10 == 0.0f) {
                                f11 = 1.0f;
                            }
                            if (chVar2.getAlpha() != f11) {
                                chVar2.setAlpha(f11);
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
                ((qe0) this.G1).f28672b.invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                return;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.G1).f41382e0.invalidate();
                return;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.G1;
                secretMediaViewer.f41932r.setAlpha(f10);
                secretMediaViewer.f41924n.setAlpha(f10);
                return;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    ((ug.w0) this.G1).f28672b.invalidate();
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
                q7 q7Var = w0Var.H1;
                if (q7Var != null && q7Var.getTag() != null) {
                    if (i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, w0Var.I0)) > 0.699999988079071d) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    org.telegram.messenger.g0.q3(w0Var, z9);
                    return;
                }
                org.telegram.ui.ActionBar.f2 f2Var = w0Var.l1;
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
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.zw) this.G1).fragmentView) != null) {
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
                ci.I0((ci) this.G1);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    @Override
    public void w() {
        switch (this.F1) {
            case 3:
                super.w();
                ((org.telegram.ui.zw) this.G1).h.a(false, true);
                return;
            default:
                super.w();
                return;
        }
    }

    @Override
    public boolean z() {
        switch (this.F1) {
            case 3:
                org.telegram.ui.vv vvVar = ((org.telegram.ui.zw) this.G1).G3;
                if (vvVar != null && vvVar.c()) {
                    return true;
                }
                return false;
            default:
                return super.z();
        }
    }

    public q7(org.telegram.messenger.ls lsVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.F1 = i7;
        this.G1 = lsVar;
    }
}
