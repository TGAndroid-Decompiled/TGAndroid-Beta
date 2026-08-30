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
public final class aa0 extends yu0 {
    public AnimatorSet f23333c2;
    public final FrameLayout f23334d2;
    public final x90 f23335e2;
    public final da0 f23336f2;

    public aa0(da0 da0Var, Context context, long j10, qu0 qu0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, da0 da0Var2, z90 z90Var, org.telegram.ui.ActionBar.f6 f6Var, FrameLayout frameLayout, x90 x90Var) {
        super(context, j10, qu0Var, 0, null, chatFull, userFull, i10, 0, da0Var2, z90Var, 0, f6Var, null);
        this.f23336f2 = da0Var;
        this.f23334d2 = frameLayout;
        this.f23335e2 = x90Var;
    }

    @Override
    public final boolean D() {
        int i10 = this.f23336f2.f24215a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        boolean z4;
        int size = sparseArray.size();
        da0 da0Var = this.f23336f2;
        da0Var.F = sparseArray;
        int i10 = da0Var.f24215a;
        if (i10 == 1 || i10 == 2) {
            da0Var.C.a();
            da0Var.C.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ph.d dVar = da0Var.Q;
            if (dVar != null) {
                if (size > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                dVar.setEnabled(z4);
                da0Var.Q.c(size, true);
                if (da0Var.S.getClosestTab() == 8) {
                    da0Var.Q.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void K0(boolean z4) {
        int i10;
        da0 da0Var = this.f23336f2;
        Activity parentActivity = da0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) da0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f23334d2, !z4, 0.95f, true);
    }

    @Override
    public final void L0() {
        super.L0();
        this.f23336f2.a0();
    }

    @Override
    public final void M0(float f10) {
        da0 da0Var = this.f23336f2;
        if (da0Var.f24215a != 1) {
            return;
        }
        float f11 = f10 - 8.0f;
        ca0 ca0Var = da0Var.O;
        if (ca0Var != null) {
            ca0Var.setProgress(f11);
        }
        float f12 = 1.0f - f11;
        da0Var.v[0].setAlpha(f12);
        da0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f11);
        da0Var.v[1].setAlpha(f11);
        da0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f12);
    }

    @Override
    public final boolean N() {
        int i10 = this.f23336f2.f24215a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void N0(boolean z4) {
        ca0 ca0Var = this.f23336f2.O;
        if (ca0Var != null) {
            ca0Var.setScrolling(z4);
        }
    }

    @Override
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        this.f23335e2.J(canvas, getY() + f10, rect, paint, true);
    }

    @Override
    public final void b1(boolean z4) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        float f14;
        float measuredHeight;
        da0 da0Var = this.f23336f2;
        if (da0Var.f24215a == 0) {
            super.b1(z4);
        } else if (this.f31161z1 == z4) {
        } else {
            this.f31161z1 = z4;
            AnimatorSet animatorSet = this.f23333c2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = da0Var.f24215a;
            if (i10 == 1 || i10 == 2) {
                if (z4) {
                    g1(null);
                }
                this.I1 = z4;
            }
            if (z4) {
                da0Var.C.setVisibility(0);
                FrameLayout frameLayout = da0Var.P;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                da0Var.f24221s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.i2 i2Var = da0Var.B;
            float f15 = 0.0f;
            float f16 = 1.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            i2Var.c(f10, true);
            this.f23333c2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            k6 k6Var = da0Var.C;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(k6Var, property, fArr));
            FrameLayout frameLayout2 = da0Var.f24221s;
            if (z4) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f12));
            FrameLayout frameLayout3 = da0Var.P;
            if (frameLayout3 != null) {
                if (z4) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f14));
                FrameLayout frameLayout4 = da0Var.P;
                if (z4) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.w0 w0Var = da0Var.E;
            if (w0Var != null) {
                w0Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var2 = da0Var.E;
                if (z4) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(w0Var2, property, f13));
            }
            if (c0(getClosestTab()) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = da0Var.D;
            if (w0Var3 != null) {
                w0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var4 = da0Var.D;
                if (!z4 && !z10) {
                    f15 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(w0Var4, property, f15));
            }
            ca0 ca0Var = da0Var.O;
            if (ca0Var != null) {
                if (z4) {
                    f16 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ca0Var, property, f16));
            }
            this.f23333c2.playTogether(arrayList);
            this.f23333c2.setDuration(300L);
            this.f23333c2.setInterpolator(nr.h);
            this.f23333c2.addListener(new org.telegram.ui.ActionBar.g(this, z4, z10, 4));
            this.f23333c2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f23336f2.T;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f23336f2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f23336f2.f24219n;
    }

    @Override
    public final boolean l0() {
        da0 da0Var = this.f23336f2;
        if (da0Var.f24215a == 0 && da0Var.e == da0Var.getUserConfig().getClientUserId() && da0Var.f24218f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean m0() {
        int i10 = this.f23336f2.f24215a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        this.f23335e2.M();
    }

    @Override
    public final boolean q0() {
        if (this.f23336f2.f24215a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        int i10 = this.f23336f2.f24215a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
