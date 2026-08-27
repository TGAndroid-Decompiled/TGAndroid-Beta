package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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

public final class l90 extends hu0 {

    public AnimatorSet f30325b2;

    public final FrameLayout f30326c2;

    public final i90 f30327d2;

    public final o90 f30328e2;

    public l90(o90 o90Var, Context context, long j10, zt0 zt0Var, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, o90 o90Var2, k90 k90Var, org.telegram.ui.ActionBar.c6 c6Var, FrameLayout frameLayout, i90 i90Var) {
        super(context, j10, zt0Var, 0, null, chatFull, userFull, i10, 0, o90Var2, k90Var, 0, c6Var, null);
        this.f30328e2 = o90Var;
        this.f30326c2 = frameLayout;
        this.f30327d2 = i90Var;
    }

    @Override
    public final boolean D() {
        int i10 = this.f30328e2.f31236a;
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    @Override
    public final void D0(SparseArray sparseArray) {
        int size = sparseArray.size();
        o90 o90Var = this.f30328e2;
        o90Var.E = sparseArray;
        int i10 = o90Var.f31236a;
        if (i10 == 1 || i10 == 2) {
            o90Var.B.a();
            o90Var.B.c(LocaleController.formatPluralString("StoriesSelected", size, new Object[0]), !LocaleController.isRTL, true);
            lh.d dVar = o90Var.P;
            if (dVar != null) {
                dVar.setEnabled(size > 0);
                o90Var.P.c(size, true);
                if (o90Var.R.getClosestTab() == 8) {
                    o90Var.P.g(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), true, true);
                }
            }
        }
    }

    @Override
    public final void K0(boolean z10) {
        o90 o90Var = this.f30328e2;
        AndroidUtilities.removeAdjustResize(o90Var.getParentActivity(), ((org.telegram.ui.ActionBar.n2) o90Var).classGuid);
        AndroidUtilities.updateViewVisibilityAnimated(this.f30326c2, !z10, 0.95f, true);
    }

    @Override
    public final void L0() {
        super.L0();
        this.f30328e2.a0();
    }

    @Override
    public final void M0(float f10) {
        o90 o90Var = this.f30328e2;
        if (o90Var.f31236a != 1) {
            return;
        }
        float f11 = f10 - 8.0f;
        n90 n90Var = o90Var.N;
        if (n90Var != null) {
            n90Var.setProgress(f11);
        }
        float f12 = 1.0f - f11;
        o90Var.v[0].setAlpha(f12);
        o90Var.v[0].setTranslationX(AndroidUtilities.dp(-12.0f) * f11);
        o90Var.v[1].setAlpha(f11);
        o90Var.v[1].setTranslationX(AndroidUtilities.dp(12.0f) * f12);
    }

    @Override
    public final boolean N() {
        int i10 = this.f30328e2.f31236a;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override
    public final void N0(boolean z10) {
        n90 n90Var = this.f30328e2.N;
        if (n90Var != null) {
            n90Var.setScrolling(z10);
        }
    }

    @Override
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        this.f30327d2.J(canvas, getY() + f10, rect, paint, true);
    }

    @Override
    public final void b1(boolean z10) {
        o90 o90Var = this.f30328e2;
        if (o90Var.f31236a == 0) {
            super.b1(z10);
            return;
        }
        if (this.f29163y1 == z10) {
            return;
        }
        this.f29163y1 = z10;
        AnimatorSet animatorSet = this.f30325b2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = o90Var.f31236a;
        if (i10 == 1 || i10 == 2) {
            if (z10) {
                g1(null);
            }
            this.H1 = z10;
        }
        if (z10) {
            o90Var.B.setVisibility(0);
            FrameLayout frameLayout = o90Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            o90Var.f31243s.setVisibility(0);
        }
        float f10 = 0.0f;
        o90Var.A.c(z10 ? 1.0f : 0.0f, true);
        this.f30325b2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        j6 j6Var = o90Var.B;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(j6Var, (Property<j6, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(o90Var.f31243s, (Property<FrameLayout, Float>) property, z10 ? 0.0f : 1.0f));
        FrameLayout frameLayout2 = o90Var.O;
        if (frameLayout2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
            FrameLayout frameLayout3 = o90Var.O;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) View.TRANSLATION_Y, z10 ? 0.0f : frameLayout3.getMeasuredHeight()));
        }
        org.telegram.ui.ActionBar.v0 v0Var = o90Var.D;
        if (v0Var != null) {
            v0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(o90Var.D, (Property<org.telegram.ui.ActionBar.v0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        boolean z11 = c0(getClosestTab()) == 0;
        org.telegram.ui.ActionBar.v0 v0Var2 = o90Var.C;
        if (v0Var2 != null) {
            v0Var2.setVisibility(0);
            org.telegram.ui.ActionBar.v0 v0Var3 = o90Var.C;
            if (!z10 && !z11) {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(v0Var3, (Property<org.telegram.ui.ActionBar.v0, Float>) property, f10));
        }
        n90 n90Var = o90Var.N;
        if (n90Var != null) {
            arrayList.add(ObjectAnimator.ofFloat(n90Var, (Property<n90, Float>) property, z10 ? 0.4f : 1.0f));
        }
        this.f30325b2.playTogether(arrayList);
        this.f30325b2.setDuration(300L);
        this.f30325b2.setInterpolator(er.h);
        this.f30325b2.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 4));
        this.f30325b2.start();
    }

    @Override
    public final int getInitialTab() {
        return this.f30328e2.S;
    }

    @Override
    public final String getStoriesHashtag() {
        return this.f30328e2.h;
    }

    @Override
    public final String getStoriesHashtagUsername() {
        return this.f30328e2.f31241n;
    }

    @Override
    public final boolean l0() {
        o90 o90Var = this.f30328e2;
        return o90Var.f31236a == 0 && o90Var.f31239e == o90Var.getUserConfig().getClientUserId() && o90Var.f31240f == 0;
    }

    @Override
    public final boolean m0() {
        int i10 = this.f30328e2.f31236a;
        return i10 == 1 || i10 == 2;
    }

    @Override
    public final void o0() {
        this.f30327d2.M();
    }

    @Override
    public final boolean q0() {
        return this.f30328e2.f31236a == 2;
    }

    @Override
    public final boolean v0() {
        int i10 = this.f30328e2.f31236a;
        return i10 == 1 || i10 == 2;
    }
}
