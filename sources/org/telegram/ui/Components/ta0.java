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
public final class ta0 extends tv0 {
    public AnimatorSet f30460f2;
    public final FrameLayout f30461g2;
    public final qa0 f30462h2;
    public final wa0 f30463i2;

    public ta0(wa0 wa0Var, Context context, long j10, lv0 lv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, wa0 wa0Var2, sa0 sa0Var, org.telegram.ui.ActionBar.d6 d6Var, FrameLayout frameLayout, qa0 qa0Var) {
        super(context, j10, lv0Var, 0, null, chatFull, userFull, i10, 0, wa0Var2, sa0Var, 0, d6Var, null);
        this.f30463i2 = wa0Var;
        this.f30461g2 = frameLayout;
        this.f30462h2 = qa0Var;
    }

    @Override
    public final boolean D() {
        int i10 = this.f30463i2.f32053a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void F0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        wa0 wa0Var = this.f30463i2;
        wa0Var.I = sparseArray;
        int i10 = wa0Var.f32053a;
        if (i10 == 1 || i10 == 2) {
            wa0Var.F.a();
            wa0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ei.d dVar = wa0Var.T;
            if (dVar != null) {
                if (size > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                wa0Var.T.b(size, true);
                if (wa0Var.V.getClosestTab() == 8) {
                    wa0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void M0(boolean z10) {
        int i10;
        wa0 wa0Var = this.f30463i2;
        Activity parentActivity = wa0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) wa0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f30461g2, !z10, 0.95f, true);
    }

    @Override
    public final boolean N() {
        int i10 = this.f30463i2.f32053a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void N0() {
        super.N0();
        this.f30463i2.a0();
    }

    @Override
    public final void O0(float f7) {
        wa0 wa0Var = this.f30463i2;
        if (wa0Var.f32053a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        va0 va0Var = wa0Var.R;
        if (va0Var != null) {
            va0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        wa0Var.v[0].setAlpha(f11);
        wa0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        wa0Var.v[1].setAlpha(f10);
        wa0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.f30462h2.J(canvas, getY() + f7, rect, paint, true);
    }

    @Override
    public final void P0(boolean z10) {
        va0 va0Var = this.f30463i2.R;
        if (va0Var != null) {
            va0Var.setScrolling(z10);
        }
    }

    @Override
    public final void d1(boolean z10) {
        float f7;
        float f10;
        float f11;
        boolean z11;
        float f12;
        float f13;
        float measuredHeight;
        wa0 wa0Var = this.f30463i2;
        if (wa0Var.f32053a == 0) {
            super.d1(z10);
        } else if (this.C1 == z10) {
        } else {
            this.C1 = z10;
            AnimatorSet animatorSet = this.f30460f2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = wa0Var.f32053a;
            if (i10 == 1 || i10 == 2) {
                if (z10) {
                    i1(null);
                }
                this.L1 = z10;
            }
            if (z10) {
                wa0Var.F.setVisibility(0);
                FrameLayout frameLayout = wa0Var.S;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                wa0Var.f32061s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.g2 g2Var = wa0Var.E;
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            g2Var.c(f7, true);
            this.f30460f2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            q6 q6Var = wa0Var.F;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(q6Var, property, fArr));
            FrameLayout frameLayout2 = wa0Var.f32061s;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f11));
            FrameLayout frameLayout3 = wa0Var.S;
            if (frameLayout3 != null) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f13));
                FrameLayout frameLayout4 = wa0Var.S;
                if (z10) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.u0 u0Var = wa0Var.H;
            if (u0Var != null) {
                u0Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var2 = wa0Var.H;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(u0Var2, property, f12));
            }
            if (c0(getClosestTab()) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = wa0Var.G;
            if (u0Var3 != null) {
                u0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var4 = wa0Var.G;
                if (!z10 && !z11) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(u0Var4, property, f14));
            }
            va0 va0Var = wa0Var.R;
            if (va0Var != null) {
                if (z10) {
                    f15 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(va0Var, property, f15));
            }
            this.f30460f2.playTogether(arrayList);
            this.f30460f2.setDuration(300L);
            this.f30460f2.setInterpolator(bs.h);
            this.f30460f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
            this.f30460f2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f30463i2.W;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f30463i2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f30463i2.f32059n;
    }

    @Override
    public final boolean m0() {
        wa0 wa0Var = this.f30463i2;
        if (wa0Var.f32053a == 0 && wa0Var.e == wa0Var.getUserConfig().getClientUserId() && wa0Var.f32058f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean n0() {
        int i10 = this.f30463i2.f32053a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void p0() {
        this.f30462h2.M();
    }

    @Override
    public final boolean r0() {
        if (this.f30463i2.f32053a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean x0() {
        int i10 = this.f30463i2.f32053a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
