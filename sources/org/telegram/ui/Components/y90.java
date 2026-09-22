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
public final class y90 extends yu0 {
    public AnimatorSet f30191f2;
    public final FrameLayout f30192g2;
    public final v90 f30193h2;
    public final ba0 f30194i2;

    public y90(ba0 ba0Var, Context context, long j3, qu0 qu0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, ba0 ba0Var2, x90 x90Var, org.telegram.ui.ActionBar.e6 e6Var, FrameLayout frameLayout, v90 v90Var) {
        super(context, j3, qu0Var, 0, null, chatFull, userFull, i10, 0, ba0Var2, x90Var, 0, e6Var, null);
        this.f30194i2 = ba0Var;
        this.f30192g2 = frameLayout;
        this.f30193h2 = v90Var;
    }

    @Override
    public final boolean D() {
        int i10 = this.f30194i2.f22729a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        ba0 ba0Var = this.f30194i2;
        ba0Var.I = sparseArray;
        int i10 = ba0Var.f22729a;
        if (i10 == 1 || i10 == 2) {
            ba0Var.F.a();
            ba0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ci.d dVar = ba0Var.T;
            if (dVar != null) {
                if (size > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                ba0Var.T.b(size, true);
                if (ba0Var.V.getClosestTab() == 8) {
                    ba0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void K0(boolean z10) {
        int i10;
        ba0 ba0Var = this.f30194i2;
        Activity parentActivity = ba0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) ba0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f30192g2, !z10, 0.95f, true);
    }

    @Override
    public final void L0() {
        super.L0();
        this.f30194i2.a0();
    }

    @Override
    public final void M0(float f7) {
        ba0 ba0Var = this.f30194i2;
        if (ba0Var.f22729a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        aa0 aa0Var = ba0Var.R;
        if (aa0Var != null) {
            aa0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        ba0Var.v[0].setAlpha(f11);
        ba0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        ba0Var.v[1].setAlpha(f10);
        ba0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override
    public final boolean N() {
        int i10 = this.f30194i2.f22729a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void N0(boolean z10) {
        aa0 aa0Var = this.f30194i2.R;
        if (aa0Var != null) {
            aa0Var.setScrolling(z10);
        }
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.f30193h2.J(canvas, getY() + f7, rect, paint, true);
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
        ba0 ba0Var = this.f30194i2;
        if (ba0Var.f22729a == 0) {
            super.b1(z10);
        } else if (this.C1 == z10) {
        } else {
            this.C1 = z10;
            AnimatorSet animatorSet = this.f30191f2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = ba0Var.f22729a;
            if (i10 == 1 || i10 == 2) {
                if (z10) {
                    g1(null);
                }
                this.L1 = z10;
            }
            if (z10) {
                ba0Var.F.setVisibility(0);
                FrameLayout frameLayout = ba0Var.S;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                ba0Var.f22737s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.g2 g2Var = ba0Var.E;
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            g2Var.c(f7, true);
            this.f30191f2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            n6 n6Var = ba0Var.F;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(n6Var, property, fArr));
            FrameLayout frameLayout2 = ba0Var.f22737s;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f11));
            FrameLayout frameLayout3 = ba0Var.S;
            if (frameLayout3 != null) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f13));
                FrameLayout frameLayout4 = ba0Var.S;
                if (z10) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.v0 v0Var = ba0Var.H;
            if (v0Var != null) {
                v0Var.setVisibility(0);
                org.telegram.ui.ActionBar.v0 v0Var2 = ba0Var.H;
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
            org.telegram.ui.ActionBar.v0 v0Var3 = ba0Var.G;
            if (v0Var3 != null) {
                v0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.v0 v0Var4 = ba0Var.G;
                if (!z10 && !z11) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(v0Var4, property, f14));
            }
            aa0 aa0Var = ba0Var.R;
            if (aa0Var != null) {
                if (z10) {
                    f15 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(aa0Var, property, f15));
            }
            this.f30191f2.playTogether(arrayList);
            this.f30191f2.setDuration(300L);
            this.f30191f2.setInterpolator(qr.h);
            this.f30191f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
            this.f30191f2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f30194i2.W;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f30194i2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f30194i2.f22735n;
    }

    @Override
    public final boolean l0() {
        ba0 ba0Var = this.f30194i2;
        if (ba0Var.f22729a == 0 && ba0Var.e == ba0Var.getUserConfig().getClientUserId() && ba0Var.f22734f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean m0() {
        int i10 = this.f30194i2.f22729a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        this.f30193h2.M();
    }

    @Override
    public final boolean q0() {
        if (this.f30194i2.f22729a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        int i10 = this.f30194i2.f22729a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
