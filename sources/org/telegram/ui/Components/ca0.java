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
public final class ca0 extends zu0 {
    public AnimatorSet f25901c2;
    public final FrameLayout f25902d2;
    public final z90 f25903e2;
    public final fa0 f25904f2;

    public ca0(fa0 fa0Var, Context context, long j10, ru0 ru0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, fa0 fa0Var2, ba0 ba0Var, org.telegram.ui.ActionBar.g6 g6Var, FrameLayout frameLayout, z90 z90Var) {
        super(context, j10, ru0Var, 0, null, chatFull, userFull, i10, 0, fa0Var2, ba0Var, 0, g6Var, null);
        this.f25904f2 = fa0Var;
        this.f25902d2 = frameLayout;
        this.f25903e2 = z90Var;
    }

    @Override
    public final boolean D() {
        int i10 = this.f25904f2.f26850a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        boolean z4;
        int size = sparseArray.size();
        fa0 fa0Var = this.f25904f2;
        fa0Var.F = sparseArray;
        int i10 = fa0Var.f26850a;
        if (i10 == 1 || i10 == 2) {
            fa0Var.C.a();
            fa0Var.C.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            qh.d dVar = fa0Var.Q;
            if (dVar != null) {
                if (size > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                dVar.setEnabled(z4);
                fa0Var.Q.c(size, true);
                if (fa0Var.S.getClosestTab() == 8) {
                    fa0Var.Q.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void K0(boolean z4) {
        int i10;
        fa0 fa0Var = this.f25904f2;
        Activity parentActivity = fa0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) fa0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f25902d2, !z4, 0.95f, true);
    }

    @Override
    public final void L0() {
        super.L0();
        this.f25904f2.a0();
    }

    @Override
    public final void M0(float f10) {
        fa0 fa0Var = this.f25904f2;
        if (fa0Var.f26850a != 1) {
            return;
        }
        float f11 = f10 - 8.0f;
        ea0 ea0Var = fa0Var.O;
        if (ea0Var != null) {
            ea0Var.setProgress(f11);
        }
        float f12 = 1.0f - f11;
        fa0Var.v[0].setAlpha(f12);
        fa0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f11);
        fa0Var.v[1].setAlpha(f11);
        fa0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f12);
    }

    @Override
    public final boolean N() {
        int i10 = this.f25904f2.f26850a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void N0(boolean z4) {
        ea0 ea0Var = this.f25904f2.O;
        if (ea0Var != null) {
            ea0Var.setScrolling(z4);
        }
    }

    @Override
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        this.f25903e2.J(canvas, getY() + f10, rect, paint, true);
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
        fa0 fa0Var = this.f25904f2;
        if (fa0Var.f26850a == 0) {
            super.b1(z4);
        } else if (this.f34021z1 == z4) {
        } else {
            this.f34021z1 = z4;
            AnimatorSet animatorSet = this.f25901c2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = fa0Var.f26850a;
            if (i10 == 1 || i10 == 2) {
                if (z4) {
                    g1(null);
                }
                this.I1 = z4;
            }
            if (z4) {
                fa0Var.C.setVisibility(0);
                FrameLayout frameLayout = fa0Var.P;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                fa0Var.f26857s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.i2 i2Var = fa0Var.B;
            float f15 = 0.0f;
            float f16 = 1.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            i2Var.c(f10, true);
            this.f25901c2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            k6 k6Var = fa0Var.C;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(k6Var, property, fArr));
            FrameLayout frameLayout2 = fa0Var.f26857s;
            if (z4) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f12));
            FrameLayout frameLayout3 = fa0Var.P;
            if (frameLayout3 != null) {
                if (z4) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f14));
                FrameLayout frameLayout4 = fa0Var.P;
                if (z4) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.w0 w0Var = fa0Var.E;
            if (w0Var != null) {
                w0Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var2 = fa0Var.E;
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
            org.telegram.ui.ActionBar.w0 w0Var3 = fa0Var.D;
            if (w0Var3 != null) {
                w0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var4 = fa0Var.D;
                if (!z4 && !z10) {
                    f15 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(w0Var4, property, f15));
            }
            ea0 ea0Var = fa0Var.O;
            if (ea0Var != null) {
                if (z4) {
                    f16 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ea0Var, property, f16));
            }
            this.f25901c2.playTogether(arrayList);
            this.f25901c2.setDuration(300L);
            this.f25901c2.setInterpolator(pr.h);
            this.f25901c2.addListener(new org.telegram.ui.ActionBar.g(this, z4, z10, 4));
            this.f25901c2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f25904f2.T;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f25904f2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f25904f2.f26855n;
    }

    @Override
    public final boolean l0() {
        fa0 fa0Var = this.f25904f2;
        if (fa0Var.f26850a == 0 && fa0Var.f26853e == fa0Var.getUserConfig().getClientUserId() && fa0Var.f26854f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean m0() {
        int i10 = this.f25904f2.f26850a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        this.f25903e2.M();
    }

    @Override
    public final boolean q0() {
        if (this.f25904f2.f26850a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        int i10 = this.f25904f2.f26850a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
