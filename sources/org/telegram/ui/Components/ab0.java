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
public final class ab0 extends cw0 {
    public AnimatorSet f24550f2;
    public final FrameLayout f24551g2;
    public final xa0 f24552h2;
    public final db0 f24553i2;

    public ab0(db0 db0Var, Context context, long j3, uv0 uv0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, db0 db0Var2, za0 za0Var, org.telegram.ui.ActionBar.d6 d6Var, FrameLayout frameLayout, xa0 xa0Var) {
        super(context, j3, uv0Var, 0, null, chatFull, userFull, i10, 0, db0Var2, za0Var, 0, d6Var, null);
        this.f24553i2 = db0Var;
        this.f24551g2 = frameLayout;
        this.f24552h2 = xa0Var;
    }

    @Override
    public final boolean D() {
        int i10 = this.f24553i2.f25742a;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        boolean z10;
        int size = sparseArray.size();
        db0 db0Var = this.f24553i2;
        db0Var.I = sparseArray;
        int i10 = db0Var.f25742a;
        if (i10 == 1 || i10 == 2) {
            db0Var.F.a();
            db0Var.F.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            ci.d dVar = db0Var.T;
            if (dVar != null) {
                if (size > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                db0Var.T.b(size, true);
                if (db0Var.V.getClosestTab() == 8) {
                    db0Var.T.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void K0(boolean z10) {
        int i10;
        db0 db0Var = this.f24553i2;
        Activity parentActivity = db0Var.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) db0Var).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        AndroidUtilities.updateViewVisibilityAnimated(this.f24551g2, !z10, 0.95f, true);
    }

    @Override
    public final void L0() {
        super.L0();
        this.f24553i2.a0();
    }

    @Override
    public final void M0(float f7) {
        db0 db0Var = this.f24553i2;
        if (db0Var.f25742a != 1) {
            return;
        }
        float f10 = f7 - 8.0f;
        cb0 cb0Var = db0Var.R;
        if (cb0Var != null) {
            cb0Var.setProgress(f10);
        }
        float f11 = 1.0f - f10;
        db0Var.v[0].setAlpha(f11);
        db0Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f10);
        db0Var.v[1].setAlpha(f10);
        db0Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f11);
    }

    @Override
    public final boolean N() {
        int i10 = this.f24553i2.f25742a;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final void N0(boolean z10) {
        cb0 cb0Var = this.f24553i2.R;
        if (cb0Var != null) {
            cb0Var.setScrolling(z10);
        }
    }

    @Override
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        this.f24552h2.J(canvas, getY() + f7, rect, paint, true);
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
        db0 db0Var = this.f24553i2;
        if (db0Var.f25742a == 0) {
            super.b1(z10);
        } else if (this.C1 == z10) {
        } else {
            this.C1 = z10;
            AnimatorSet animatorSet = this.f24550f2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int i10 = db0Var.f25742a;
            if (i10 == 1 || i10 == 2) {
                if (z10) {
                    g1(null);
                }
                this.L1 = z10;
            }
            if (z10) {
                db0Var.F.setVisibility(0);
                FrameLayout frameLayout = db0Var.S;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                db0Var.f25751s.setVisibility(0);
            }
            org.telegram.ui.ActionBar.f2 f2Var = db0Var.E;
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            f2Var.c(f7, true);
            this.f24550f2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            r6 r6Var = db0Var.F;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(r6Var, property, fArr));
            FrameLayout frameLayout2 = db0Var.f25751s;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property, f11));
            FrameLayout frameLayout3 = db0Var.S;
            if (frameLayout3 != null) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, f13));
                FrameLayout frameLayout4 = db0Var.S;
                if (z10) {
                    measuredHeight = 0.0f;
                } else {
                    measuredHeight = frameLayout4.getMeasuredHeight();
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout4, View.TRANSLATION_Y, measuredHeight));
            }
            org.telegram.ui.ActionBar.u0 u0Var = db0Var.H;
            if (u0Var != null) {
                u0Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var2 = db0Var.H;
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
            org.telegram.ui.ActionBar.u0 u0Var3 = db0Var.G;
            if (u0Var3 != null) {
                u0Var3.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var4 = db0Var.G;
                if (!z10 && !z11) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(u0Var4, property, f14));
            }
            cb0 cb0Var = db0Var.R;
            if (cb0Var != null) {
                if (z10) {
                    f15 = 0.4f;
                }
                arrayList.add(ObjectAnimator.ofFloat(cb0Var, property, f15));
            }
            this.f24550f2.playTogether(arrayList);
            this.f24550f2.setDuration(300L);
            this.f24550f2.setInterpolator(is.h);
            this.f24550f2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
            this.f24550f2.start();
        }
    }

    @Override
    public final int getInitialTab() {
        return this.f24553i2.W;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f24553i2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f24553i2.f25749n;
    }

    @Override
    public final boolean l0() {
        db0 db0Var = this.f24553i2;
        if (db0Var.f25742a == 0 && db0Var.f25747e == db0Var.getUserConfig().getClientUserId() && db0Var.f25748f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean m0() {
        int i10 = this.f24553i2.f25742a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0() {
        this.f24552h2.M();
    }

    @Override
    public final boolean q0() {
        if (this.f24553i2.f25742a == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v0() {
        int i10 = this.f24553i2.f25742a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }
}
