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
public final class sa0 extends wv0 {
    public AnimatorSet f30473i2;
    public final FrameLayout f30474j2;
    public final pa0 f30475k2;
    public final va0 f30476l2;

    public sa0(va0 va0Var, Context context, long j10, ov0 ov0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, va0 va0Var2, ra0 ra0Var, org.telegram.ui.ActionBar.g6 g6Var, FrameLayout frameLayout, pa0 pa0Var) {
        super(context, j10, ov0Var, 0, null, chatFull, userFull, i10, 0, va0Var2, ra0Var, 0, g6Var, null);
        this.f30476l2 = va0Var;
        this.f30474j2 = frameLayout;
        this.f30475k2 = pa0Var;
    }

    @Override
    public final boolean E() {
        int i10 = this.f30476l2.f31392a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void G0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        va0 va0Var = this.f30476l2;
        va0Var.I = sparseArray;
        int i10 = va0Var.f31392a;
        if (i10 == 1 || i10 == 2) {
            va0Var.F.a();
            va0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ei.d dVar = va0Var.T;
            if (dVar != null) {
                if (size > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                va0Var.T.b(size, true);
                if (va0Var.V.getClosestTab() == 8) {
                    va0Var.T.i(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void N0(boolean z10) {
        int i10;
        va0 va0Var = this.f30476l2;
        Activity parentActivity = va0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) va0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f30474j2, !z10, 0.95f, true);
    }

    @Override
    public final boolean O() {
        int i10 = this.f30476l2.f31392a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void O0() {
        super.O0();
        this.f30476l2.a0();
    }

    @Override
    public final void P0(float f7) {
        va0 va0Var = this.f30476l2;
        if (va0Var.f31392a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        ua0 ua0Var = va0Var.R;
        if (ua0Var != null) {
            ua0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        va0Var.v[0].setAlpha(f11);
        va0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        va0Var.v[1].setAlpha(f10);
        va0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override
    public final void Q(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.f30475k2.I(canvas, getY() + f7, rect, paint, true);
    }

    @Override
    public final void Q0(boolean z10) {
        ua0 ua0Var = this.f30476l2.R;
        if (ua0Var != null) {
            ua0Var.setScrolling(z10);
        }
    }

    @Override
    public final void e1(boolean z10) {
        float f7;
        float f10;
        float f11;
        boolean z11;
        float f12;
        float f13;
        float measuredHeight;
        va0 va0Var = this.f30476l2;
        if (va0Var.f31392a == 0) {
            super.e1(z10);
        } else if (this.C1 == z10) {
        } else {
            this.C1 = z10;
            AnimatorSet animatorSet = this.f30473i2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = va0Var.f31392a;
            if (i10 == 1 || i10 == 2) {
                if (z10) {
                    j1(null);
                }
                this.M1 = z10;
            }
            if (z10) {
                va0Var.F.setVisibility(0);
                FrameLayout frameLayout = va0Var.S;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                va0Var.f31406s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.h2 h2Var = va0Var.E;
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            h2Var.c(f7, true);
            this.f30473i2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            o6 o6Var = va0Var.F;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(o6Var, property, fArr));
            FrameLayout frameLayout2 = va0Var.f31406s;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f11));
            FrameLayout frameLayout3 = va0Var.S;
            if (frameLayout3 != null) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f13));
                FrameLayout frameLayout4 = va0Var.S;
                if (z10) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.u0 u0Var = va0Var.H;
            if (u0Var != null) {
                u0Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var2 = va0Var.H;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(u0Var2, property, f12));
            }
            if (d0(getClosestTab()) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = va0Var.G;
            if (u0Var3 != null) {
                u0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var4 = va0Var.G;
                if (!z10 && !z11) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(u0Var4, property, f14));
            }
            ua0 ua0Var = va0Var.R;
            if (ua0Var != null) {
                if (z10) {
                    f15 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ua0Var, property, f15));
            }
            this.f30473i2.playTogether(arrayList);
            this.f30473i2.setDuration(300L);
            this.f30473i2.setInterpolator(zr.h);
            this.f30473i2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
            this.f30473i2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f30476l2.W;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f30476l2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f30476l2.f31404n;
    }

    @Override
    public final boolean n0() {
        va0 va0Var = this.f30476l2;
        if (va0Var.f31392a == 0 && va0Var.e == va0Var.getUserConfig().getClientUserId() && va0Var.f31400f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean o0() {
        int i10 = this.f30476l2.f31392a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void q0() {
        this.f30475k2.L();
    }

    @Override
    public final boolean s0() {
        if (this.f30476l2.f31392a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0() {
        int i10 = this.f30476l2.f31392a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
