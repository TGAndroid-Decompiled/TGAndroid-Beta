package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class jn extends org.telegram.ui.ActionBar.e5 {

    public float f39401f;
    public final rn h;

    public jn(rn rnVar) {
        this.h = rnVar;
    }

    @Override
    public final boolean a() {
        return this.h.f42177q3 == null;
    }

    @Override
    public final boolean b() {
        rn rnVar = this.h;
        if (!rnVar.f42262wc.f48498f) {
            if (rnVar.f42177q3 != null && rnVar.l1 != null) {
                View currentView = rnVar.f42126m1.getCurrentView();
                rn rnVar2 = currentView instanceof tn ? ((tn) currentView).f42977a : rnVar;
                if (!rnVar2.f42238uc.f48498f) {
                    rnVar2.Lb(true);
                    return false;
                }
                int currentPosition = rnVar.l1.f29062a.getCurrentPosition();
                int i10 = rnVar.f42140n1;
                if (currentPosition != i10) {
                    rnVar.l1.f29062a.d(i10, i10);
                    return false;
                }
            } else if (rnVar.f42238uc.f48498f) {
                rnVar.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f42093j3;
    }

    @Override
    public final void k() {
        rn rnVar = this.h;
        rnVar.L7();
        if (rnVar.f42106k3 != null || rnVar.f42117l3 != null) {
            ImageView imageView = rnVar.P2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (rnVar.f42093j3) {
            rnVar.E1.getAdapter().U(null, 0, null, false, true);
            rnVar.f42093j3 = false;
            rnVar.f42040f0.H("", true);
        }
        rnVar.f42040f0.setSearchFieldHint(LocaleController.getString(rnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        rnVar.O2.setVisibility(0);
        ImageView imageView2 = rnVar.P2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        rnVar.f42106k3 = null;
        rnVar.f42117l3 = null;
    }

    @Override
    public final void m() {
        TLRPC.Chat chat;
        MessageObject messageObject;
        rn rnVar = this.h;
        rnVar.f42154o3 = false;
        rnVar.vc();
        rnVar.Ic();
        ImageView imageView = rnVar.O2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = rnVar.P2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (rnVar.f42093j3) {
            rnVar.E1.getAdapter().U(null, 0, null, false, true);
            rnVar.f42093j3 = false;
        }
        rnVar.E1.setReversed(false);
        rnVar.E1.getAdapter().f45930g0 = false;
        rnVar.m7();
        rnVar.f42106k3 = null;
        rnVar.f42117l3 = null;
        rnVar.f42177q3 = null;
        rnVar.f42040f0.setSearchFieldHint(LocaleController.getString(rnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        rnVar.f42040f0.setSearchFieldCaption(null);
        rnVar.f42250vc.a(false, true);
        rnVar.f42262wc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = rnVar.f42027e0;
        if (yVar != null && yVar.f23969o != null) {
            org.telegram.ui.ActionBar.v0 v0Var = rnVar.f42013d0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = rnVar.f42027e0;
            if (yVar2 != null) {
                yVar2.f(0);
                rn.J3(rnVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = rnVar.f41975a0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            xr xrVar = rnVar.Z;
            if (xrVar != null) {
                xrVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = rnVar.f42077i0;
            if (v0Var2 != null && rnVar.G9) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = rnVar.f42090j0;
            if (yVar4 != null && rnVar.H9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = rnVar.f42052g0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(8);
            }
        } else if (rnVar.U.k0() && TextUtils.isEmpty(rnVar.U.getSlowModeTimer()) && ((chat = rnVar.f42026e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var4 = rnVar.f42013d0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = rnVar.f42027e0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = rnVar.f41975a0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            xr xrVar2 = rnVar.Z;
            if (xrVar2 != null) {
                xrVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = rnVar.f42077i0;
            if (v0Var5 != null && rnVar.G9) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = rnVar.f42090j0;
            if (yVar7 != null && rnVar.H9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = rnVar.f42052g0;
            if (v0Var6 != null) {
                v0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var7 = rnVar.f42013d0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = rnVar.f42090j0;
            if (yVar8 != null && rnVar.H9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var8 = rnVar.f42052g0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = rnVar.f42077i0;
            if (v0Var9 != null && rnVar.G9) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = rnVar.f42027e0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = rnVar.f41975a0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            xr xrVar3 = rnVar.Z;
            if (xrVar3 != null) {
                xrVar3.b(false);
            }
        }
        if (rnVar.f42126m1 != null) {
            if (rnVar.l1.f29062a.getCurrentPosition() != 0) {
                rnVar.l1.f29062a.d(0, 0);
                rnVar.f42152o1 = true;
            } else {
                rnVar.f42126m1.h.clear();
            }
        }
        int i10 = rnVar.N3;
        if (i10 == 3 || i10 == 8 || ((rnVar.Z3 == 0 && !UserObject.isReplyUser(rnVar.f42039f)) || ((messageObject = rnVar.T3) != null && messageObject.getRepliesCount() < 10))) {
            rnVar.f42040f0.setVisibility(8);
        }
        rnVar.f42103k0 = false;
        rnVar.getMediaDataController().clearFoundMessageObjects();
        if (rnVar.K3 == 3) {
            HashtagSearchController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).clearSearchResults(3);
        } else {
            HashtagSearchController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).clearSearchResults();
        }
        pf.y0 y0Var = rnVar.I3;
        if (y0Var != null) {
            y0Var.l();
        }
        rnVar.Ia();
        rnVar.hc(false);
        rnVar.yc(0, true);
        rnVar.Wc(false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f39401f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new in(this, 1));
        valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.h);
        valueAnimatorOfFloat.setDuration(320L);
        valueAnimatorOfFloat.start();
        rnVar.f42238uc.a(false, true);
        rnVar.Hc();
        rnVar.f42128m3 = null;
        rnVar.Ic();
        rnVar.vc();
        ok okVar = rnVar.f42104k1;
        if (okVar != null) {
            okVar.d.M(new ar(2));
            okVar.h = 0L;
            rnVar.f42104k1.g(false);
        }
        ak akVar = rnVar.l1;
        if (akVar != null) {
            akVar.b(false);
        }
        rnVar.kb(false);
    }

    @Override
    public final void n() {
        ak akVar;
        rn rnVar = this.h;
        rnVar.f42154o3 = true;
        rnVar.vc();
        rnVar.Ic();
        if (((rnVar.Z3 != 0 && rnVar.N3 != 3) || UserObject.isReplyUser(rnVar.f42039f)) && !rnVar.Zb) {
            rnVar.la(null);
        }
        if (rnVar.S4) {
            rnVar.saveKeyboardPositionBeforeTransition();
            if (!rnVar.Ka) {
                AndroidUtilities.requestAdjustResize(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
            }
            AndroidUtilities.runOnUIThread(new ti(this, 9), 500L);
            yi yiVar = rnVar.f42003c2;
            if (yiVar != null) {
                yiVar.b(true);
            }
            org.telegram.ui.Components.x30 x30Var = rnVar.f42029e2;
            if (x30Var != null) {
                x30Var.b(true);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f39401f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new in(this, 0));
        valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.h);
        valueAnimatorOfFloat.setDuration(320L);
        valueAnimatorOfFloat.start();
        ok okVar = rnVar.f42104k1;
        if (okVar != null) {
            okVar.g(!rnVar.Ka && okVar.a() && rnVar.f42177q3 == null);
        }
        if (rnVar.f42177q3 == null || (akVar = rnVar.l1) == null) {
            return;
        }
        int currentPosition = akVar.f29062a.getCurrentPosition();
        int i10 = rnVar.f42140n1;
        if (currentPosition != i10) {
            rnVar.l1.f29062a.d(i10, i10);
        }
    }

    @Override
    public final void o(pf.e0 e0Var) {
        rn rnVar = this.h;
        ok okVar = rnVar.f42104k1;
        if (okVar != null) {
            okVar.d.M(new ar(2));
            okVar.h = 0L;
        }
        rnVar.f42128m3 = null;
        rnVar.Ic();
        rnVar.vc();
        rnVar.kb(false);
    }

    @Override
    public final void p(gg.g gVar) {
        rn rnVar = this.h;
        boolean z10 = false;
        rnVar.Fc(0, 0, -1);
        String string = gVar != null ? gVar.getText().toString() : rnVar.f42167p3;
        rnVar.f42167p3 = string;
        if (TextUtils.isEmpty(string) || !(rnVar.f42167p3.startsWith("$") || rnVar.f42167p3.startsWith("#"))) {
            rnVar.f42177q3 = null;
            ak akVar = rnVar.l1;
            if (akVar != null) {
                akVar.b(false);
                rnVar.Hc();
            }
            ak akVar2 = rnVar.l1;
            if (akVar2 != null && akVar2.f29062a.getCurrentPosition() != 0) {
                rnVar.l1.f29062a.d(0, 0);
            }
        } else {
            rnVar.M7();
            if (rnVar.f42167p3.contains("@")) {
                rnVar.presentFragment(new org.telegram.ui.Components.q30(rnVar.f42167p3, ((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider));
                return;
            }
            if (rnVar.f42177q3 == null) {
                rnVar.f42177q3 = rnVar.f42167p3;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f39401f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new in(this, 2));
                valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.h);
                valueAnimatorOfFloat.setDuration(320L);
                valueAnimatorOfFloat.start();
                ok okVar = rnVar.f42104k1;
                if (okVar != null) {
                    if (!rnVar.Ka && okVar.a() && rnVar.f42177q3 == null) {
                        z10 = true;
                    }
                    okVar.g(z10);
                }
            }
            rnVar.f42177q3 = rnVar.f42167p3;
            rnVar.R6(true);
            HashtagSearchController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).putToHistory(rnVar.f42177q3);
            rnVar.f42165p1.f32328f.N(true);
            View currentView = rnVar.f42126m1.getCurrentView();
            if (rnVar.K3 == 3) {
                HashtagSearchController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).clearSearchResults(3);
            } else {
                HashtagSearchController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).clearSearchResults();
            }
            if (currentView instanceof tn) {
                ((tn) currentView).f42977a.Jc(rnVar.f42177q3);
            }
            rnVar.Hc();
            rnVar.Z1.e(true, true);
            rnVar.Lb(true);
            z10 = true;
        }
        ak akVar3 = rnVar.l1;
        if (akVar3 != null) {
            akVar3.b(z10);
        }
        rnVar.getMediaDataController().searchMessagesInChat(rnVar.f42167p3, rnVar.P5, rnVar.H6, ((org.telegram.ui.ActionBar.n2) rnVar).classGuid, 0, rnVar.Z3, rnVar.f42106k3, rnVar.f42117l3, rnVar.f42128m3);
    }

    @Override
    public final void q(EditText editText) {
        rn rnVar = this.h;
        ud.a aVar = rnVar.f42262wc;
        if (rnVar.f42177q3 == null) {
            rnVar.Lb(false);
        }
        rnVar.L7();
        if (rnVar.f42093j3) {
            rnVar.E1.getAdapter().U("@" + editText.getText().toString(), 0, rnVar.q6, true, true);
        } else if (rnVar.f42106k3 == null && rnVar.f42117l3 == null && rnVar.P2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            rnVar.P2.callOnClick();
        }
        if (rnVar.f42177q3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != aVar.f48498f) {
                if (z10) {
                    rnVar.M7();
                }
                aVar.a(z10, true);
                lh.h1 h1Var = rnVar.f42126m1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    rnVar.Lb(true);
                }
                rnVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        return this.h.f42177q3 == null;
    }
}
