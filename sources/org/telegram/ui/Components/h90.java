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
public final class h90 extends eu0 {
    public AnimatorSet f29000b2;
    public final FrameLayout f29001c2;
    public final e90 f29002d2;
    public final k90 f29003e2;

    public h90(k90 k90Var, Context context, long j10, wt0 wt0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i9, k90 k90Var2, g90 g90Var, org.telegram.ui.ActionBar.b6 b6Var, FrameLayout frameLayout, e90 e90Var) {
        super(context, j10, wt0Var, 0, null, chatFull, userFull, i9, 0, k90Var2, g90Var, 0, b6Var, null);
        this.f29003e2 = k90Var;
        this.f29001c2 = frameLayout;
        this.f29002d2 = e90Var;
    }

    @Override
    public final boolean D() {
        int i9 = this.f29003e2.f30032a;
        if (i9 != 1 && i9 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        k90 k90Var = this.f29003e2;
        k90Var.E = sparseArray;
        int i9 = k90Var.f30032a;
        if (i9 == 1 || i9 == 2) {
            k90Var.B.a();
            k90Var.B.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            kh.d dVar = k90Var.P;
            if (dVar != null) {
                if (size > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                k90Var.P.c(size, true);
                if (k90Var.R.getClosestTab() == 8) {
                    k90Var.P.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void K0(boolean z10) {
        int i9;
        k90 k90Var = this.f29003e2;
        Activity parentActivity = k90Var.getParentActivity();
        i9 = ((org.telegram.ui.ActionBar.o2) k90Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i9);
        AndroidUtilities.updateViewVisibilityAnimated(this.f29001c2, !z10, 0.95f, true);
    }

    @Override
    public final void L0() {
        super.L0();
        this.f29003e2.Z();
    }

    @Override
    public final void M0(float f10) {
        k90 k90Var = this.f29003e2;
        if (k90Var.f30032a != 1) {
            return;
        }
        float f11 = f10 - 8.0f;
        j90 j90Var = k90Var.N;
        if (j90Var != null) {
            j90Var.setProgress(f11);
        }
        float f12 = 1.0f - f11;
        k90Var.v[0].setAlpha(f12);
        k90Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f11);
        k90Var.v[1].setAlpha(f11);
        k90Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f12);
    }

    @Override
    public final boolean N() {
        int i9 = this.f29003e2.f30032a;
        if (i9 == 1 || i9 == 2 || i9 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void N0(boolean z10) {
        j90 j90Var = this.f29003e2.N;
        if (j90Var != null) {
            j90Var.setScrolling(z10);
        }
    }

    @Override
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        this.f29002d2.J(canvas, getY() + f10, rect, paint, true);
    }

    @Override
    public final void b1(boolean z10) {
        float f10;
        float f11;
        float f12;
        boolean z11;
        float f13;
        float f14;
        float measuredHeight;
        k90 k90Var = this.f29003e2;
        if (k90Var.f30032a == 0) {
            super.b1(z10);
        } else if (this.f28178y1 == z10) {
        } else {
            this.f28178y1 = z10;
            AnimatorSet animatorSet = this.f29000b2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i9 = k90Var.f30032a;
            if (i9 == 1 || i9 == 2) {
                if (z10) {
                    g1(null);
                }
                this.H1 = z10;
            }
            if (z10) {
                k90Var.B.setVisibility(0);
                FrameLayout frameLayout = k90Var.O;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                k90Var.f30039s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.h2 h2Var = k90Var.A;
            float f15 = 0.0f;
            float f16 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            h2Var.c(f10, true);
            this.f29000b2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            j6 j6Var = k90Var.B;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(j6Var, property, fArr));
            FrameLayout frameLayout2 = k90Var.f30039s;
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f12));
            FrameLayout frameLayout3 = k90Var.O;
            if (frameLayout3 != null) {
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f14));
                FrameLayout frameLayout4 = k90Var.O;
                if (z10) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.w0 w0Var = k90Var.D;
            if (w0Var != null) {
                w0Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var2 = k90Var.D;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(w0Var2, property, f13));
            }
            if (c0(getClosestTab()) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = k90Var.C;
            if (w0Var3 != null) {
                w0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var4 = k90Var.C;
                if (!z10 && !z11) {
                    f15 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(w0Var4, property, f15));
            }
            j90 j90Var = k90Var.N;
            if (j90Var != null) {
                if (z10) {
                    f16 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(j90Var, property, f16));
            }
            this.f29000b2.playTogether(arrayList);
            this.f29000b2.setDuration(300L);
            this.f29000b2.setInterpolator(gr.h);
            this.f29000b2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
            this.f29000b2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f29003e2.S;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f29003e2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f29003e2.f30037n;
    }

    @Override
    public final boolean l0() {
        k90 k90Var = this.f29003e2;
        if (k90Var.f30032a == 0 && k90Var.f30035e == k90Var.getUserConfig().getClientUserId() && k90Var.f30036f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean m0() {
        int i9 = this.f29003e2.f30032a;
        if (i9 == 1 || i9 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        this.f29002d2.M();
    }

    @Override
    public final boolean q0() {
        if (this.f29003e2.f30032a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        int i9 = this.f29003e2.f30032a;
        if (i9 == 1 || i9 == 2) {
            return true;
        }
        return false;
    }
}
