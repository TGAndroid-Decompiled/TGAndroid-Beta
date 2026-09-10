package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class ia0 extends iv0 {
    public AnimatorSet f23976f2;
    public final FrameLayout f23977g2;
    public final fa0 f23978h2;
    public final la0 f23979i2;

    public ia0(la0 la0Var, Context context, long j3, av0 av0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, la0 la0Var2, ha0 ha0Var, org.telegram.ui.ActionBar.f6 f6Var, FrameLayout frameLayout, fa0 fa0Var) {
        super(context, j3, av0Var, 0, null, chatFull, userFull, i10, 0, la0Var2, ha0Var, 0, f6Var, null);
        this.f23979i2 = la0Var;
        this.f23977g2 = frameLayout;
        this.f23978h2 = fa0Var;
    }

    @Override
    public final boolean D() {
        int i10 = this.f23979i2.f24917a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        la0 la0Var = this.f23979i2;
        la0Var.I = sparseArray;
        int i10 = la0Var.f24917a;
        if (i10 == 1 || i10 == 2) {
            la0Var.F.a();
            la0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            bi.d dVar = la0Var.T;
            if (dVar != null) {
                if (size > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                la0Var.T.b(size, true);
                if (la0Var.V.getClosestTab() == 8) {
                    la0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void K0(boolean z10) {
        int i10;
        la0 la0Var = this.f23979i2;
        Activity parentActivity = la0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) la0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f23977g2, !z10, 0.95f, true);
    }

    @Override
    public final void L0() {
        super.L0();
        this.f23979i2.a0();
    }

    @Override
    public final void M0(float f7) {
        la0 la0Var = this.f23979i2;
        if (la0Var.f24917a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        ka0 ka0Var = la0Var.R;
        if (ka0Var != null) {
            ka0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        la0Var.v[0].setAlpha(f11);
        la0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        la0Var.v[1].setAlpha(f10);
        la0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override
    public final boolean N() {
        int i10 = this.f23979i2.f24917a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void N0(boolean z10) {
        ka0 ka0Var = this.f23979i2.R;
        if (ka0Var != null) {
            ka0Var.setScrolling(z10);
        }
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.f23978h2.J(canvas, getY() + f7, rect, paint, true);
    }

    @Override
    public final void b1(boolean z10) {
        float f7;
        float f10;
        float f11;
        boolean z11;
        float f12;
        float f13;
        float measuredHeight;
        la0 la0Var = this.f23979i2;
        if (la0Var.f24917a == 0) {
            super.b1(z10);
        } else if (this.C1 == z10) {
        } else {
            this.C1 = z10;
            AnimatorSet animatorSet = this.f23976f2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = la0Var.f24917a;
            if (i10 == 1 || i10 == 2) {
                if (z10) {
                    g1(null);
                }
                this.L1 = z10;
            }
            if (z10) {
                la0Var.F.setVisibility(0);
                FrameLayout frameLayout = la0Var.S;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                la0Var.f24925s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.i2 i2Var = la0Var.E;
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            i2Var.c(f7, true);
            this.f23976f2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            o6 o6Var = la0Var.F;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(o6Var, property, fArr));
            FrameLayout frameLayout2 = la0Var.f24925s;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f11));
            FrameLayout frameLayout3 = la0Var.S;
            if (frameLayout3 != null) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f13));
                FrameLayout frameLayout4 = la0Var.S;
                if (z10) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.w0 w0Var = la0Var.H;
            if (w0Var != null) {
                w0Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var2 = la0Var.H;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(w0Var2, property, f12));
            }
            if (c0(getClosestTab()) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = la0Var.G;
            if (w0Var3 != null) {
                w0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var4 = la0Var.G;
                if (!z10 && !z11) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(w0Var4, property, f14));
            }
            ka0 ka0Var = la0Var.R;
            if (ka0Var != null) {
                if (z10) {
                    f15 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ka0Var, property, f15));
            }
            this.f23976f2.playTogether(arrayList);
            this.f23976f2.setDuration(300L);
            this.f23976f2.setInterpolator(wr.h);
            this.f23976f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
            this.f23976f2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f23979i2.W;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f23979i2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f23979i2.f24923n;
    }

    @Override
    public final boolean l0() {
        la0 la0Var = this.f23979i2;
        if (la0Var.f24917a == 0 && la0Var.e == la0Var.getUserConfig().getClientUserId() && la0Var.f24922f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean m0() {
        int i10 = this.f23979i2.f24917a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        this.f23978h2.M();
    }

    @Override
    public final boolean q0() {
        if (this.f23979i2.f24917a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        int i10 = this.f23979i2.f24917a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
