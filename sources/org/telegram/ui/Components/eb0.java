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
public final class eb0 extends hw0 {
    public AnimatorSet f25653f2;
    public final FrameLayout f25654g2;
    public final bb0 f25655h2;
    public final hb0 f25656i2;

    public eb0(hb0 hb0Var, Context context, long j3, zv0 zv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, hb0 hb0Var2, db0 db0Var, org.telegram.ui.ActionBar.c6 c6Var, FrameLayout frameLayout, bb0 bb0Var) {
        super(context, j3, zv0Var, 0, null, chatFull, userFull, i10, 0, hb0Var2, db0Var, 0, c6Var, null);
        this.f25656i2 = hb0Var;
        this.f25654g2 = frameLayout;
        this.f25655h2 = bb0Var;
    }

    @Override
    public final boolean D() {
        int i10 = this.f25656i2.f26732a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        hb0 hb0Var = this.f25656i2;
        hb0Var.I = sparseArray;
        int i10 = hb0Var.f26732a;
        if (i10 == 1 || i10 == 2) {
            hb0Var.F.a();
            hb0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ci.d dVar = hb0Var.T;
            if (dVar != null) {
                if (size > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                hb0Var.T.b(size, true);
                if (hb0Var.V.getClosestTab() == 8) {
                    hb0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void K0(boolean z10) {
        int i10;
        hb0 hb0Var = this.f25656i2;
        Activity parentActivity = hb0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) hb0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f25654g2, !z10, 0.95f, true);
    }

    @Override
    public final void L0() {
        super.L0();
        this.f25656i2.a0();
    }

    @Override
    public final void M0(float f7) {
        hb0 hb0Var = this.f25656i2;
        if (hb0Var.f26732a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        gb0 gb0Var = hb0Var.R;
        if (gb0Var != null) {
            gb0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        hb0Var.v[0].setAlpha(f11);
        hb0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        hb0Var.v[1].setAlpha(f10);
        hb0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override
    public final boolean N() {
        int i10 = this.f25656i2.f26732a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void N0(boolean z10) {
        gb0 gb0Var = this.f25656i2.R;
        if (gb0Var != null) {
            gb0Var.setScrolling(z10);
        }
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.f25655h2.J(canvas, getY() + f7, rect, paint, true);
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
        hb0 hb0Var = this.f25656i2;
        if (hb0Var.f26732a == 0) {
            super.b1(z10);
        } else if (this.C1 == z10) {
        } else {
            this.C1 = z10;
            AnimatorSet animatorSet = this.f25653f2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = hb0Var.f26732a;
            if (i10 == 1 || i10 == 2) {
                if (z10) {
                    g1(null);
                }
                this.L1 = z10;
            }
            if (z10) {
                hb0Var.F.setVisibility(0);
                FrameLayout frameLayout = hb0Var.S;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                hb0Var.f26741s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.f2 f2Var = hb0Var.E;
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f2Var.c(f7, true);
            this.f25653f2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            r6 r6Var = hb0Var.F;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(r6Var, property, fArr));
            FrameLayout frameLayout2 = hb0Var.f26741s;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f11));
            FrameLayout frameLayout3 = hb0Var.S;
            if (frameLayout3 != null) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f13));
                FrameLayout frameLayout4 = hb0Var.S;
                if (z10) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.u0 u0Var = hb0Var.H;
            if (u0Var != null) {
                u0Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var2 = hb0Var.H;
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
            org.telegram.ui.ActionBar.u0 u0Var3 = hb0Var.G;
            if (u0Var3 != null) {
                u0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var4 = hb0Var.G;
                if (!z10 && !z11) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(u0Var4, property, f14));
            }
            gb0 gb0Var = hb0Var.R;
            if (gb0Var != null) {
                if (z10) {
                    f15 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(gb0Var, property, f15));
            }
            this.f25653f2.playTogether(arrayList);
            this.f25653f2.setDuration(300L);
            this.f25653f2.setInterpolator(js.h);
            this.f25653f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
            this.f25653f2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f25656i2.W;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f25656i2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f25656i2.f26739n;
    }

    @Override
    public final boolean l0() {
        hb0 hb0Var = this.f25656i2;
        if (hb0Var.f26732a == 0 && hb0Var.f26737e == hb0Var.getUserConfig().getClientUserId() && hb0Var.f26738f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean m0() {
        int i10 = this.f25656i2.f26732a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        this.f25655h2.M();
    }

    @Override
    public final boolean q0() {
        if (this.f25656i2.f26732a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        int i10 = this.f25656i2.f26732a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
