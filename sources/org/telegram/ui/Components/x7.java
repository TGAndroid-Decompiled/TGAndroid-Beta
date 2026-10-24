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
public final class x7 extends org.telegram.ui.ActionBar.k {
    public final int f32530v1;
    public final Object f32531w1;

    public x7(Object obj, Context context, int i10) {
        super(context, null);
        this.f32530v1 = i10;
        this.f32531w1 = obj;
    }

    @Override
    public void B(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f32530v1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f32531w1;
                super.B(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Z0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.J0 && (imageView = this.e) != null) {
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
    public boolean M(View view) {
        switch (this.f32530v1) {
            case 3:
                if (!super.M(view) && view != ((org.telegram.ui.ey) this.f32531w1).m0) {
                    return false;
                }
                return true;
            default:
                return super.M(view);
        }
    }

    @Override
    public void N(View[] viewArr, boolean[] zArr) {
        switch (this.f32530v1) {
            case 3:
                super.N(viewArr, zArr);
                ((org.telegram.ui.ey) this.f32531w1).h.a(true, true);
                return;
            default:
                super.N(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f32530v1) {
            case 3:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f32531w1;
                org.telegram.ui.tx txVar = eyVar.X;
                if (txVar != null && txVar.getAlpha() > 0.0f && eyVar.f37017b.f17447f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void g(boolean z10) {
        switch (this.f32530v1) {
            case 3:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f32531w1;
                eyVar.X.f27258r.getText().clear();
                if (z10 && eyVar.X.f27258r.isFocused()) {
                    AndroidUtilities.hideKeyboard(eyVar.X.f27258r);
                }
                eyVar.X.f27258r.clearFocus();
                eyVar.Y.b(false);
                return;
            default:
                super.g(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f32530v1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f32531w1).p5(false);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32530v1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f32531w1;
                org.telegram.ui.l0 l0Var = profileActivity.Y;
                Rect rect = profileActivity.M2;
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
    public void r() {
        switch (this.f32530v1) {
            case 3:
                super.r();
                ((org.telegram.ui.ey) this.f32531w1).h.a(false, true);
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
        switch (this.f32530v1) {
            case 0:
                super.setAlpha(f7);
                i8.f0((i8) this.f32531w1).invalidate();
                return;
            case 1:
                ri riVar = (ri) this.f32531w1;
                uh uhVar = riVar.G0;
                TextView textView = riVar.f30166m1;
                uh uhVar2 = riVar.A1;
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
                    ri.N(riVar);
                    viewGroup = ((org.telegram.ui.ActionBar.h3) riVar).containerView;
                    viewGroup.invalidate();
                    if (uhVar != null && uhVar2 != null) {
                        if (uhVar.getTag() == null) {
                            ji jiVar = riVar.B0;
                            if (jiVar == null || jiVar.L()) {
                                uhVar2.setAlpha(1.0f - f7);
                                uhVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            uhVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            return;
                        } else if (riVar.B0 == null) {
                            if (f7 == 0.0f) {
                                f10 = 1.0f;
                            }
                            if (uhVar2.getAlpha() != f10) {
                                uhVar2.setAlpha(f10);
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
                nh0.K((nh0) this.f32531w1).invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                return;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.f32531w1).f33582e0.invalidate();
                return;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f32531w1;
                secretMediaViewer.f34124r.setAlpha(f7);
                secretMediaViewer.f34115n.setAlpha(f7);
                return;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup2 = ((org.telegram.ui.ActionBar.h3) ((sg.y0) this.f32531w1)).containerView;
                    viewGroup2.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.f32530v1) {
            case 7:
                super.setTag(obj);
                sg.y0 y0Var = (sg.y0) this.f32531w1;
                x7 x7Var = y0Var.N;
                if (x7Var != null && x7Var.getTag() != null) {
                    if (i0.a.h(y0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.setLightStatusBar(y0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.o2 o2Var = y0Var.f46946b;
                if (o2Var != null) {
                    AndroidUtilities.setLightStatusBar(y0Var, o2Var.isLightStatusBar());
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
        switch (this.f32530v1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.ey) this.f32531w1).fragmentView) != null) {
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
        switch (this.f32530v1) {
            case 1:
                super.setVisibility(i10);
                ri.N((ri) this.f32531w1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public boolean u() {
        switch (this.f32530v1) {
            case 3:
                org.telegram.ui.yw ywVar = ((org.telegram.ui.ey) this.f32531w1).G3;
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
        float f7;
        switch (this.f32530v1) {
            case 3:
                org.telegram.ui.yw ywVar = ((org.telegram.ui.ey) this.f32531w1).G3;
                if (ywVar != null && ywVar.c() && getBackButton() != null) {
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

    public x7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.f32530v1 = i10;
        this.f32531w1 = notificationCenterDelegate;
    }
}
