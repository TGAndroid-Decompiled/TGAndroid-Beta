package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class iw0 extends AnimatorListenerAdapter {
    public final int f33807a;
    public final boolean f33808b;
    public final Object f33809c;

    public iw0(int i10, Object obj, boolean z10) {
        this.f33807a = i10;
        this.f33809c = obj;
        this.f33808b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33807a) {
            case 5:
                ((k91) this.f33809c).f34301r = null;
                return;
            case 6:
            default:
                super.onAnimationCancel(animator);
                return;
            case 7:
                mh1 mh1Var = (mh1) this.f33809c;
                AnimatorSet animatorSet = mh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    mh1Var.I = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.Cells.y3 y3Var;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        zh.t0 t0Var;
        float f19;
        switch (this.f33807a) {
            case 0:
                ow0 ow0Var = (ow0) this.f33809c;
                if (this.f33808b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ow0Var.E = f7;
                return;
            case 1:
                i11 i11Var = (i11) this.f33809c;
                if (i11Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = i11Var.f33518n.U0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = i11Var.f33518n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = i11Var.f33518n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = i11Var.f33518n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    i11Var.setVisibility(8);
                }
                i11Var.f33518n.l5(false);
                return;
            case 2:
                m21 m21Var = (m21) this.f33809c;
                if (this.f33808b) {
                    m21Var.f34827c.setVisibility(8);
                    return;
                } else {
                    m21Var.f34828f.setVisibility(8);
                    return;
                }
            case 3:
                n51 n51Var = (n51) this.f33809c;
                if (this.f33808b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n51Var.v = f10;
                if (n51Var.S) {
                    n51Var.N.invalidate();
                    return;
                }
                return;
            case 4:
                h71 h71Var = (h71) this.f33809c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h71Var.v;
                if (this.f33808b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                h71Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.wr.f28820g.getInterpolation(h71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(h71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                h71Var.N = null;
                return;
            case 5:
                k91 k91Var = (k91) this.f33809c;
                if (k91Var.f34301r != null && (y3Var = k91Var.f34302s) != null) {
                    if (!this.f33808b) {
                        y3Var.setVisibility(4);
                    }
                    k91Var.f34301r = null;
                    return;
                }
                return;
            case 6:
                pe1 pe1Var = (pe1) this.f33809c;
                if (this.f33808b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                pe1Var.f35822y = f12;
                return;
            case 7:
                mh1 mh1Var = (mh1) this.f33809c;
                AnimatorSet animatorSet = mh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (this.f33808b) {
                        mh1Var.e.setVisibility(4);
                        return;
                    } else {
                        mh1Var.f34954b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 8:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.f33809c;
                ei.o oVar = v1Var.V;
                if (!v1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                if (this.f33808b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                v1Var.U = f13;
                oVar.setAlpha(f13);
                v1Var.invalidate();
                if (v1Var.T) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    return;
                }
                oVar.clearFocus();
                AndroidUtilities.hideKeyboard(oVar);
                return;
            case 9:
                l0 l0Var = (l0) this.f33809c;
                ei.o oVar2 = l0Var.f38103b0;
                if (!l0Var.W) {
                    oVar2.setVisibility(8);
                }
                if (this.f33808b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                l0Var.f38101a0 = f14;
                oVar2.setAlpha(f14);
                l0Var.j(l0Var.f38101a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f38101a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f38101a0);
                l0Var.invalidate();
                return;
            case 10:
                pg.y1 y1Var = (pg.y1) this.f33809c;
                ((og.n) y1Var).f14429y.f14320n.d();
                if (this.f33808b) {
                    y1Var.f40382w.accept(Integer.valueOf(y1Var.f40381s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                    return;
                }
                return;
            case 11:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f33809c;
                if (this.f33808b) {
                    limitPreviewView.f21199j0 = false;
                }
                Runnable runnable = limitPreviewView.f21200k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f21200k0.run();
                    return;
                }
                return;
            case 12:
                qg.s0 s0Var = (qg.s0) this.f33809c;
                if (this.f33808b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                s0Var.M = f15;
                s0Var.d.invalidate();
                qg.r0 r0Var = s0Var.e;
                if (r0Var != null) {
                    r0Var.invalidate();
                    return;
                }
                return;
            case 13:
                yg.c0 c0Var = (yg.c0) this.f33809c;
                org.telegram.ui.Components.pk0 pk0Var = c0Var.f46960n;
                c0Var.k();
                c0Var.l();
                boolean z10 = this.f33808b;
                yg.c0.a(c0Var, z10);
                c0Var.f46959m.invalidateOutline();
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                c0Var.f46956j = f16;
                boolean z11 = true;
                if (z10) {
                    c0Var.f46957k = true;
                    c0Var.f46950a.invalidate();
                }
                pk0Var.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f46956j, 1.0f, 0.0f));
                if (!z10) {
                    pk0Var.setImportantForAccessibility(0);
                    pk0Var.setSkipDraw(false);
                    c0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = c0Var.f46970y;
                    pk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                c0Var.C = false;
                return;
            case 14:
                zh.l lVar = (zh.l) this.f33809c;
                if (this.f33808b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                lVar.f48602d0 = f17;
                lVar.b();
                return;
            case 15:
                zh.o1 o1Var = (zh.o1) this.f33809c;
                zp0 zp0Var = o1Var.f48665c;
                float f20 = 0.0f;
                boolean z12 = this.f33808b;
                if (z12) {
                    f18 = 0.0f;
                } else {
                    f18 = 1.0f;
                }
                zp0Var.setAlpha(f18);
                View view = o1Var.f48661a;
                if (!z12) {
                    f20 = 0.5f;
                }
                view.setAlpha(f20);
                o1Var.invalidate();
                return;
            case 16:
                zh.x0 x0Var = (zh.x0) this.f33809c;
                x0Var.f49026b.removeViewImmediate(x0Var.d);
                x0Var.f49028f.b();
                if (this.f33808b && (t0Var = x0Var.v) != null && t0Var != zh.t0.W) {
                    t0Var.e();
                }
                x0Var.v = null;
                x0Var.f49031s = true;
                x0Var.G = null;
                x0Var.E = false;
                return;
            default:
                zh.u7 u7Var = (zh.u7) this.f33809c;
                u7Var.J0.unlock();
                if (this.f33808b) {
                    f19 = u7Var.f48967w.f48442c;
                } else {
                    f19 = 0.0f;
                }
                u7Var.f48929e0 = f19;
                zh.a3 currentPeerView = u7Var.f48947n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                u7Var.v.invalidate();
                u7Var.f48966v1 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33807a) {
            case 1:
                i11 i11Var = (i11) this.f33809c;
                org.telegram.ui.ActionBar.w0 w0Var = i11Var.f33518n.U0;
                if (w0Var != null && !this.f33808b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = i11Var.f33518n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = i11Var.f33518n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = i11Var.f33518n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                i11Var.setVisibility(0);
                i11Var.f33518n.l5(false);
                return;
            case 2:
                m21 m21Var = (m21) this.f33809c;
                if (this.f33808b) {
                    m21Var.f34828f.setAlpha(0.0f);
                    m21Var.f34828f.setVisibility(0);
                    return;
                }
                m21Var.f34827c.setAlpha(0.0f);
                m21Var.f34827c.setVisibility(0);
                return;
            case 14:
                super.onAnimationStart(animator);
                try {
                    ((zh.l) this.f33809c).performHapticFeedback(3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
