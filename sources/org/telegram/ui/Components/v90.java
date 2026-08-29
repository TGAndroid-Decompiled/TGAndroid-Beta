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
public final class v90 extends qu0 {
    public AnimatorSet f33503b2;
    public final FrameLayout f33504c2;
    public final s90 f33505d2;
    public final y90 f33506e2;

    public v90(y90 y90Var, Context context, long j10, iu0 iu0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, y90 y90Var2, u90 u90Var, org.telegram.ui.ActionBar.c6 c6Var, FrameLayout frameLayout, s90 s90Var) {
        super(context, j10, iu0Var, 0, null, chatFull, userFull, i10, 0, y90Var2, u90Var, 0, c6Var, null);
        this.f33506e2 = y90Var;
        this.f33504c2 = frameLayout;
        this.f33505d2 = s90Var;
    }

    @Override
    public final boolean D() {
        int i10 = this.f33506e2.f34994a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        y90 y90Var = this.f33506e2;
        y90Var.E = sparseArray;
        int i10 = y90Var.f34994a;
        if (i10 == 1 || i10 == 2) {
            y90Var.B.a();
            y90Var.B.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            nh.d dVar = y90Var.P;
            if (dVar != null) {
                if (size > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                y90Var.P.c(size, true);
                if (y90Var.R.getClosestTab() == 8) {
                    y90Var.P.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void K0(boolean z10) {
        int i10;
        y90 y90Var = this.f33506e2;
        Activity parentActivity = y90Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) y90Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f33504c2, !z10, 0.95f, true);
    }

    @Override
    public final void L0() {
        super.L0();
        this.f33506e2.a0();
    }

    @Override
    public final void M0(float f9) {
        y90 y90Var = this.f33506e2;
        if (y90Var.f34994a != 1) {
            return;
        }
        float f10 = f9 - 8.0f;
        x90 x90Var = y90Var.N;
        if (x90Var != null) {
            x90Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        y90Var.v[0].setAlpha(f11);
        y90Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        y90Var.v[1].setAlpha(f10);
        y90Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override
    public final boolean N() {
        int i10 = this.f33506e2.f34994a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void N0(boolean z10) {
        x90 x90Var = this.f33506e2.N;
        if (x90Var != null) {
            x90Var.setScrolling(z10);
        }
    }

    @Override
    public final void P(Canvas canvas, float f9, Rect rect, Paint paint) {
        this.f33505d2.J(canvas, getY() + f9, rect, paint, true);
    }

    @Override
    public final void b1(boolean z10) {
        float f9;
        float f10;
        float f11;
        boolean z11;
        float f12;
        float f13;
        float measuredHeight;
        y90 y90Var = this.f33506e2;
        if (y90Var.f34994a == 0) {
            super.b1(z10);
        } else if (this.f32111y1 == z10) {
        } else {
            this.f32111y1 = z10;
            AnimatorSet animatorSet = this.f33503b2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = y90Var.f34994a;
            if (i10 == 1 || i10 == 2) {
                if (z10) {
                    g1(null);
                }
                this.H1 = z10;
            }
            if (z10) {
                y90Var.B.setVisibility(0);
                FrameLayout frameLayout = y90Var.O;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                y90Var.f35001s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.h2 h2Var = y90Var.A;
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            h2Var.c(f9, true);
            this.f33503b2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            o6 o6Var = y90Var.B;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(o6Var, property, fArr));
            FrameLayout frameLayout2 = y90Var.f35001s;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f11));
            FrameLayout frameLayout3 = y90Var.O;
            if (frameLayout3 != null) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f13));
                FrameLayout frameLayout4 = y90Var.O;
                if (z10) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.w0 w0Var = y90Var.D;
            if (w0Var != null) {
                w0Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var2 = y90Var.D;
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
            org.telegram.ui.ActionBar.w0 w0Var3 = y90Var.C;
            if (w0Var3 != null) {
                w0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var4 = y90Var.C;
                if (!z10 && !z11) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(w0Var4, property, f14));
            }
            x90 x90Var = y90Var.N;
            if (x90Var != null) {
                if (z10) {
                    f15 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(x90Var, property, f15));
            }
            this.f33503b2.playTogether(arrayList);
            this.f33503b2.setDuration(300L);
            this.f33503b2.setInterpolator(jr.h);
            this.f33503b2.addListener(new org.telegram.ui.ActionBar.h(this, z10, z11, 4));
            this.f33503b2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f33506e2.S;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f33506e2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f33506e2.f34999n;
    }

    @Override
    public final boolean l0() {
        y90 y90Var = this.f33506e2;
        if (y90Var.f34994a == 0 && y90Var.f34997e == y90Var.getUserConfig().getClientUserId() && y90Var.f34998f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean m0() {
        int i10 = this.f33506e2.f34994a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        this.f33505d2.M();
    }

    @Override
    public final boolean q0() {
        if (this.f33506e2.f34994a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        int i10 = this.f33506e2.f34994a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
