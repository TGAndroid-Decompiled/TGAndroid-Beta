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
public final class ua0 extends xv0 {
    public AnimatorSet f31130i2;
    public final FrameLayout f31131j2;
    public final ra0 f31132k2;
    public final xa0 f31133l2;

    public ua0(xa0 xa0Var, Context context, long j10, pv0 pv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, xa0 xa0Var2, ta0 ta0Var, org.telegram.ui.ActionBar.g6 g6Var, FrameLayout frameLayout, ra0 ra0Var) {
        super(context, j10, pv0Var, 0, null, chatFull, userFull, i10, 0, xa0Var2, ta0Var, 0, g6Var, null);
        this.f31133l2 = xa0Var;
        this.f31131j2 = frameLayout;
        this.f31132k2 = ra0Var;
    }

    @Override
    public final boolean E() {
        int i10 = this.f31133l2.f32493a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void G0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        xa0 xa0Var = this.f31133l2;
        xa0Var.I = sparseArray;
        int i10 = xa0Var.f32493a;
        if (i10 == 1 || i10 == 2) {
            xa0Var.F.a();
            xa0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ei.d dVar = xa0Var.T;
            if (dVar != null) {
                if (size > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                xa0Var.T.b(size, true);
                if (xa0Var.V.getClosestTab() == 8) {
                    xa0Var.T.i(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void N0(boolean z10) {
        int i10;
        xa0 xa0Var = this.f31133l2;
        Activity parentActivity = xa0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) xa0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f31131j2, !z10, 0.95f, true);
    }

    @Override
    public final boolean O() {
        int i10 = this.f31133l2.f32493a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void O0() {
        super.O0();
        this.f31133l2.a0();
    }

    @Override
    public final void P0(float f7) {
        xa0 xa0Var = this.f31133l2;
        if (xa0Var.f32493a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        wa0 wa0Var = xa0Var.R;
        if (wa0Var != null) {
            wa0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        xa0Var.v[0].setAlpha(f11);
        xa0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        xa0Var.v[1].setAlpha(f10);
        xa0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override
    public final void Q(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.f31132k2.I(canvas, getY() + f7, rect, paint, true);
    }

    @Override
    public final void Q0(boolean z10) {
        wa0 wa0Var = this.f31133l2.R;
        if (wa0Var != null) {
            wa0Var.setScrolling(z10);
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
        xa0 xa0Var = this.f31133l2;
        if (xa0Var.f32493a == 0) {
            super.e1(z10);
        } else if (this.C1 == z10) {
        } else {
            this.C1 = z10;
            AnimatorSet animatorSet = this.f31130i2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = xa0Var.f32493a;
            if (i10 == 1 || i10 == 2) {
                if (z10) {
                    j1(null);
                }
                this.M1 = z10;
            }
            if (z10) {
                xa0Var.F.setVisibility(0);
                FrameLayout frameLayout = xa0Var.S;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                xa0Var.f32507s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.h2 h2Var = xa0Var.E;
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            h2Var.c(f7, true);
            this.f31130i2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            q6 q6Var = xa0Var.F;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(q6Var, property, fArr));
            FrameLayout frameLayout2 = xa0Var.f32507s;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f11));
            FrameLayout frameLayout3 = xa0Var.S;
            if (frameLayout3 != null) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f13));
                FrameLayout frameLayout4 = xa0Var.S;
                if (z10) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.u0 u0Var = xa0Var.H;
            if (u0Var != null) {
                u0Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var2 = xa0Var.H;
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
            org.telegram.ui.ActionBar.u0 u0Var3 = xa0Var.G;
            if (u0Var3 != null) {
                u0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var4 = xa0Var.G;
                if (!z10 && !z11) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(u0Var4, property, f14));
            }
            wa0 wa0Var = xa0Var.R;
            if (wa0Var != null) {
                if (z10) {
                    f15 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(wa0Var, property, f15));
            }
            this.f31130i2.playTogether(arrayList);
            this.f31130i2.setDuration(300L);
            this.f31130i2.setInterpolator(bs.h);
            this.f31130i2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
            this.f31130i2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f31133l2.W;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f31133l2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f31133l2.f32505n;
    }

    @Override
    public final boolean n0() {
        xa0 xa0Var = this.f31133l2;
        if (xa0Var.f32493a == 0 && xa0Var.e == xa0Var.getUserConfig().getClientUserId() && xa0Var.f32501f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean o0() {
        int i10 = this.f31133l2.f32493a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void q0() {
        this.f31132k2.L();
    }

    @Override
    public final boolean s0() {
        if (this.f31133l2.f32493a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0() {
        int i10 = this.f31133l2.f32493a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
