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
public final class z90 extends xu0 {
    public AnimatorSet f33108f2;
    public final FrameLayout f33109g2;
    public final w90 f33110h2;
    public final ca0 f33111i2;

    public z90(ca0 ca0Var, Context context, long j3, pu0 pu0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, ca0 ca0Var2, y90 y90Var, org.telegram.ui.ActionBar.f6 f6Var, FrameLayout frameLayout, w90 w90Var) {
        super(context, j3, pu0Var, 0, null, chatFull, userFull, i10, 0, ca0Var2, y90Var, 0, f6Var, null);
        this.f33111i2 = ca0Var;
        this.f33109g2 = frameLayout;
        this.f33110h2 = w90Var;
    }

    @Override
    public final boolean D() {
        int i10 = this.f33111i2.f24945a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        ca0 ca0Var = this.f33111i2;
        ca0Var.I = sparseArray;
        int i10 = ca0Var.f24945a;
        if (i10 == 1 || i10 == 2) {
            ca0Var.F.a();
            ca0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            di.d dVar = ca0Var.T;
            if (dVar != null) {
                if (size > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                ca0Var.T.b(size, true);
                if (ca0Var.V.getClosestTab() == 8) {
                    ca0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void K0(boolean z10) {
        int i10;
        ca0 ca0Var = this.f33111i2;
        Activity parentActivity = ca0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) ca0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f33109g2, !z10, 0.95f, true);
    }

    @Override
    public final void L0() {
        super.L0();
        this.f33111i2.a0();
    }

    @Override
    public final void M0(float f7) {
        ca0 ca0Var = this.f33111i2;
        if (ca0Var.f24945a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        ba0 ba0Var = ca0Var.R;
        if (ba0Var != null) {
            ba0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        ca0Var.v[0].setAlpha(f11);
        ca0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        ca0Var.v[1].setAlpha(f10);
        ca0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override
    public final boolean N() {
        int i10 = this.f33111i2.f24945a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void N0(boolean z10) {
        ba0 ba0Var = this.f33111i2.R;
        if (ba0Var != null) {
            ba0Var.setScrolling(z10);
        }
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.f33110h2.J(canvas, getY() + f7, rect, paint, true);
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
        ca0 ca0Var = this.f33111i2;
        if (ca0Var.f24945a == 0) {
            super.b1(z10);
        } else if (this.C1 == z10) {
        } else {
            this.C1 = z10;
            AnimatorSet animatorSet = this.f33108f2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = ca0Var.f24945a;
            if (i10 == 1 || i10 == 2) {
                if (z10) {
                    g1(null);
                }
                this.L1 = z10;
            }
            if (z10) {
                ca0Var.F.setVisibility(0);
                FrameLayout frameLayout = ca0Var.S;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                ca0Var.f24954s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.g2 g2Var = ca0Var.E;
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            g2Var.c(f7, true);
            this.f33108f2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            q6 q6Var = ca0Var.F;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(q6Var, property, fArr));
            FrameLayout frameLayout2 = ca0Var.f24954s;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f11));
            FrameLayout frameLayout3 = ca0Var.S;
            if (frameLayout3 != null) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f13));
                FrameLayout frameLayout4 = ca0Var.S;
                if (z10) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.v0 v0Var = ca0Var.H;
            if (v0Var != null) {
                v0Var.setVisibility(0);
                org.telegram.ui.ActionBar.v0 v0Var2 = ca0Var.H;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(v0Var2, property, f12));
            }
            if (c0(getClosestTab()) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = ca0Var.G;
            if (v0Var3 != null) {
                v0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.v0 v0Var4 = ca0Var.G;
                if (!z10 && !z11) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(v0Var4, property, f14));
            }
            ba0 ba0Var = ca0Var.R;
            if (ba0Var != null) {
                if (z10) {
                    f15 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ba0Var, property, f15));
            }
            this.f33108f2.playTogether(arrayList);
            this.f33108f2.setDuration(300L);
            this.f33108f2.setInterpolator(pr.h);
            this.f33108f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
            this.f33108f2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f33111i2.W;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f33111i2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f33111i2.f24952n;
    }

    @Override
    public final boolean l0() {
        ca0 ca0Var = this.f33111i2;
        if (ca0Var.f24945a == 0 && ca0Var.f24950e == ca0Var.getUserConfig().getClientUserId() && ca0Var.f24951f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean m0() {
        int i10 = this.f33111i2.f24945a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        this.f33110h2.M();
    }

    @Override
    public final boolean q0() {
        if (this.f33111i2.f24945a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        int i10 = this.f33111i2.f24945a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
