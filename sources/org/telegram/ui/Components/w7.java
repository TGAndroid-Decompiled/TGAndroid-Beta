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
public final class w7 extends org.telegram.ui.ActionBar.k {
    public final int f29572u1;
    public final Object f29573v1;

    public w7(Object obj, Context context, int i10) {
        super(context, null);
        this.f29572u1 = i10;
        this.f29573v1 = obj;
    }

    @Override
    public void B(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.f29572u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f29573v1;
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
        switch (this.f29572u1) {
            case 3:
                if (!super.N(view) && view != ((org.telegram.ui.wy) this.f29573v1).m0) {
                    return false;
                }
                return true;
            default:
                return super.N(view);
        }
    }

    @Override
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.f29572u1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.wy) this.f29573v1).h.a(true, true);
                return;
            default:
                super.O(viewArr, zArr);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f29572u1) {
            case 3:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.f29573v1;
                org.telegram.ui.my myVar = wyVar.X;
                if (myVar != null && myVar.getAlpha() > 0.0f && wyVar.f39198b.f13985f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void h(boolean z10) {
        switch (this.f29572u1) {
            case 3:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.f29573v1;
                wyVar.X.f22543r.getText().clear();
                if (z10 && wyVar.X.f22543r.isFocused()) {
                    AndroidUtilities.hideKeyboard(wyVar.X.f22543r);
                }
                wyVar.X.f22543r.clearFocus();
                wyVar.Y.b(false);
                return;
            default:
                super.h(z10);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f29572u1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f29573v1).l5(false);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29572u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f29573v1;
                org.telegram.ui.j0 j0Var = profileActivity.Y;
                Rect rect = profileActivity.L2;
                j0Var.getHitRect(rect);
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
        switch (this.f29572u1) {
            case 3:
                super.r();
                ((org.telegram.ui.wy) this.f29573v1).h.a(false, true);
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
        switch (this.f29572u1) {
            case 0:
                super.setAlpha(f7);
                viewGroup = ((org.telegram.ui.ActionBar.g3) ((h8) this.f29573v1)).containerView;
                viewGroup.invalidate();
                return;
            case 1:
                vi viVar = (vi) this.f29573v1;
                xh xhVar = viVar.D0;
                TextView textView = viVar.f28755j1;
                xh xhVar2 = viVar.f28800x1;
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
                    vi.M(viVar);
                    viewGroup2 = ((org.telegram.ui.ActionBar.g3) viVar).containerView;
                    viewGroup2.invalidate();
                    if (xhVar != null && xhVar2 != null) {
                        if (xhVar.getTag() == null) {
                            ni niVar = viVar.f28803y0;
                            if (niVar == null || niVar.J()) {
                                xhVar2.setAlpha(1.0f - f7);
                                xhVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            xhVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            return;
                        } else if (viVar.f28803y0 == null) {
                            if (f7 == 0.0f) {
                                f10 = 1.0f;
                            }
                            if (xhVar2.getAlpha() != f10) {
                                xhVar2.setAlpha(f10);
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
                qg0.J((qg0) this.f29573v1).invalidate();
                return;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                return;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.f29573v1).f30950e0.invalidate();
                return;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f29573v1;
                secretMediaViewer.f31486r.setAlpha(f7);
                secretMediaViewer.f31477n.setAlpha(f7);
                return;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup3 = ((org.telegram.ui.ActionBar.g3) ((rg.x0) this.f29573v1)).containerView;
                    viewGroup3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTag(Object obj) {
        boolean z10;
        switch (this.f29572u1) {
            case 7:
                super.setTag(obj);
                rg.x0 x0Var = (rg.x0) this.f29573v1;
                w7 w7Var = x0Var.N;
                if (w7Var != null && w7Var.getTag() != null) {
                    if (i0.a.f(x0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18933h5)) > 0.699999988079071d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AndroidUtilities.setLightStatusBar(x0Var, z10);
                    return;
                }
                org.telegram.ui.ActionBar.o2 o2Var = x0Var.f42559b;
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
    public void setTranslationY(float f7) {
        View view;
        switch (this.f29572u1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.wy) this.f29573v1).fragmentView) != null) {
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
        switch (this.f29572u1) {
            case 1:
                super.setVisibility(i10);
                vi.M((vi) this.f29573v1);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public boolean u() {
        switch (this.f29572u1) {
            case 3:
                org.telegram.ui.qx qxVar = ((org.telegram.ui.wy) this.f29573v1).F3;
                if (qxVar != null && qxVar.c()) {
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
        switch (this.f29572u1) {
            case 3:
                org.telegram.ui.qx qxVar = ((org.telegram.ui.wy) this.f29573v1).F3;
                if (qxVar != null && qxVar.c() && getBackButton() != null) {
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

    public w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.f29572u1 = i10;
        this.f29573v1 = notificationCenterDelegate;
    }
}
