package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class kn extends org.telegram.ui.ActionBar.k5 {
    public float f38946r;
    public final sn f38947s;

    public kn(sn snVar) {
        this.f38947s = snVar;
    }

    @Override
    public final boolean a() {
        if (this.f38947s.G3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        sn snVar;
        sn snVar2 = this.f38947s;
        if (!snVar2.Oc.f17447f) {
            if (snVar2.G3 != null && snVar2.B1 != null) {
                View currentView = snVar2.C1.getCurrentView();
                if (currentView instanceof un) {
                    snVar = ((un) currentView).f42454a;
                } else {
                    snVar = snVar2;
                }
                if (!snVar.Mc.f17447f) {
                    snVar.Rb(true);
                    return false;
                }
                int currentPosition = snVar2.B1.f25063a.getCurrentPosition();
                int i10 = snVar2.D1;
                if (currentPosition != i10) {
                    snVar2.B1.f25063a.d(i10, i10);
                    return false;
                }
            } else if (snVar2.Mc.f17447f) {
                snVar2.Rb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.f38947s.f41762z3;
    }

    @Override
    public final void k() {
        int i10;
        sn snVar = this.f38947s;
        snVar.O7();
        if (snVar.A3 == null && snVar.B3 == null) {
            if (snVar.f41762z3) {
                snVar.U1.getAdapter().U(null, 0, null, false, true);
                snVar.f41762z3 = false;
                snVar.f41557j0.H("", true);
            }
            org.telegram.ui.ActionBar.u0 u0Var = snVar.f41557j0;
            if (snVar.J9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var.setSearchFieldHint(LocaleController.getString(i10));
            snVar.f41500e3.setVisibility(0);
            ImageView imageView = snVar.f41513f3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            snVar.A3 = null;
            snVar.B3 = null;
            return;
        }
        ImageView imageView2 = snVar.f41513f3;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void m() {
        int i10;
        TLRPC.Chat chat;
        int i11;
        int i12;
        MessageObject messageObject;
        sn snVar = this.f38947s;
        snVar.E3 = false;
        snVar.Cc();
        snVar.Pc();
        ImageView imageView = snVar.f41500e3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = snVar.f41513f3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (snVar.f41762z3) {
            snVar.U1.getAdapter().U(null, 0, null, false, true);
            snVar.f41762z3 = false;
        }
        snVar.U1.setReversed(false);
        snVar.U1.getAdapter().f11959k0 = false;
        snVar.p7();
        snVar.A3 = null;
        snVar.B3 = null;
        snVar.G3 = null;
        org.telegram.ui.ActionBar.u0 u0Var = snVar.f41557j0;
        if (snVar.J9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        u0Var.setSearchFieldHint(LocaleController.getString(i10));
        snVar.f41557j0.setSearchFieldCaption(null);
        snVar.Nc.a(false, true);
        snVar.Oc.a(false, true);
        org.telegram.ui.ActionBar.x xVar = snVar.f41545i0;
        if (xVar != null && xVar.f21952o != null) {
            org.telegram.ui.ActionBar.u0 u0Var2 = snVar.f41534h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = snVar.f41545i0;
            if (xVar2 != null) {
                xVar2.f(0);
                sn.R3(snVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = snVar.f41497e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            wr wrVar = snVar.f41485d0;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = snVar.m0;
            if (u0Var3 != null && snVar.W9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = snVar.f41607n0;
            if (xVar4 != null && snVar.X9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = snVar.f41570k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
        } else if (snVar.Y.h0() && TextUtils.isEmpty(snVar.Y.getSlowModeTimer()) && ((chat = snVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var5 = snVar.f41534h0;
            if (u0Var5 != null) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = snVar.f41545i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = snVar.f41497e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            wr wrVar2 = snVar.f41485d0;
            if (wrVar2 != null) {
                wrVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = snVar.m0;
            if (u0Var6 != null && snVar.W9) {
                u0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = snVar.f41607n0;
            if (xVar7 != null && snVar.X9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var7 = snVar.f41570k0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var8 = snVar.f41534h0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = snVar.f41607n0;
            if (xVar8 != null && snVar.X9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = snVar.f41570k0;
            if (u0Var9 != null) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var10 = snVar.m0;
            if (u0Var10 != null && snVar.W9) {
                u0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = snVar.f41545i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = snVar.f41497e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            wr wrVar3 = snVar.f41485d0;
            if (wrVar3 != null) {
                wrVar3.b(false);
            }
        }
        if (snVar.C1 != null) {
            if (snVar.B1.f25063a.getCurrentPosition() != 0) {
                snVar.B1.f25063a.d(0, 0);
                snVar.E1 = true;
            } else {
                snVar.C1.h.clear();
            }
        }
        int i13 = snVar.f41489d4;
        if (i13 == 3 || i13 == 8 || ((snVar.f41635p4 == 0 && !UserObject.isReplyUser(snVar.f41509f)) || ((messageObject = snVar.f41561j4) != null && messageObject.getRepliesCount() < 10))) {
            snVar.f41557j0.setVisibility(8);
        }
        snVar.f41620o0 = false;
        snVar.getMediaDataController().clearFoundMessageObjects();
        if (snVar.f41448a4 == 3) {
            i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        hg.n1 n1Var = snVar.Y3;
        if (n1Var != null) {
            n1Var.l();
        }
        snVar.Ma();
        snVar.oc(false);
        snVar.Fc(0, true);
        snVar.dd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38946r, 0.0f);
        ofFloat.addUpdateListener(new jn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.zr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        snVar.Mc.a(false, true);
        snVar.Oc();
        snVar.C3 = null;
        snVar.Pc();
        snVar.Cc();
        rk rkVar = snVar.A1;
        if (rkVar != null) {
            rkVar.d.M(new zq(2));
            rkVar.h = 0L;
            snVar.A1.g(false);
        }
        dk dkVar = snVar.B1;
        if (dkVar != null) {
            dkVar.b(false);
        }
        snVar.qb(false);
    }

    @Override
    public final void n() {
        dk dkVar;
        int i10;
        sn snVar = this.f38947s;
        boolean z10 = true;
        snVar.E3 = true;
        snVar.Cc();
        snVar.Pc();
        if (((snVar.f41635p4 != 0 && snVar.f41489d4 != 3) || UserObject.isReplyUser(snVar.f41509f)) && !snVar.f41653qc) {
            snVar.qa(null);
        }
        if (snVar.f41550i5) {
            snVar.saveKeyboardPositionBeforeTransition();
            if (!snVar.f41469bb) {
                Activity parentActivity = snVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ti(this, 10), 500L);
            aj ajVar = snVar.f41671s2;
            if (ajVar != null) {
                ajVar.b(true);
            }
            org.telegram.ui.Components.p40 p40Var = snVar.f41697u2;
            if (p40Var != null) {
                p40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38946r, 1.0f);
        ofFloat.addUpdateListener(new jn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.zr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        rk rkVar = snVar.A1;
        if (rkVar != null) {
            if (snVar.f41469bb || !rkVar.a() || snVar.G3 != null) {
                z10 = false;
            }
            rkVar.g(z10);
        }
        if (snVar.G3 != null && (dkVar = snVar.B1) != null) {
            int currentPosition = dkVar.f25063a.getCurrentPosition();
            int i11 = snVar.D1;
            if (currentPosition != i11) {
                snVar.B1.f25063a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(hg.o0 o0Var) {
        sn snVar = this.f38947s;
        rk rkVar = snVar.A1;
        if (rkVar != null) {
            rkVar.d.M(new zq(2));
            rkVar.h = 0L;
        }
        snVar.C3 = null;
        snVar.Pc();
        snVar.Cc();
        snVar.qb(false);
    }

    @Override
    public final void p(ei.e2 e2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.g6 g6Var;
        sn snVar = this.f38947s;
        boolean z10 = false;
        snVar.Mc(0, 0, -1);
        if (e2Var != null) {
            str = e2Var.getText().toString();
        } else {
            str = snVar.F3;
        }
        snVar.F3 = str;
        if (!TextUtils.isEmpty(str) && (snVar.F3.startsWith("$") || snVar.F3.startsWith("#"))) {
            snVar.P7();
            if (snVar.F3.contains("@")) {
                String str2 = snVar.F3;
                g6Var = ((org.telegram.ui.ActionBar.o2) snVar).resourceProvider;
                snVar.presentFragment(new org.telegram.ui.Components.i40(str2, g6Var));
                return;
            }
            if (snVar.G3 == null) {
                snVar.G3 = snVar.F3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38946r, 1.0f);
                ofFloat.addUpdateListener(new jn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.zr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                rk rkVar = snVar.A1;
                if (rkVar != null) {
                    if (!snVar.f41469bb && rkVar.a() && snVar.G3 == null) {
                        z10 = true;
                    }
                    rkVar.g(z10);
                }
            }
            snVar.G3 = snVar.F3;
            snVar.U6(true);
            i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(snVar.G3);
            snVar.F1.f27857f.N(true);
            View currentView = snVar.C1.getCurrentView();
            if (snVar.f41448a4 == 3) {
                i13 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof un) {
                ((un) currentView).f42454a.Qc(snVar.G3);
            }
            snVar.Oc();
            snVar.f41633p2.e(true, true);
            snVar.Rb(true);
            z10 = true;
        } else {
            snVar.G3 = null;
            dk dkVar = snVar.B1;
            if (dkVar != null) {
                dkVar.b(false);
                snVar.Oc();
            }
            dk dkVar2 = snVar.B1;
            if (dkVar2 != null && dkVar2.f25063a.getCurrentPosition() != 0) {
                snVar.B1.f25063a.d(0, 0);
            }
        }
        dk dkVar3 = snVar.B1;
        if (dkVar3 != null) {
            dkVar3.b(z10);
        }
        MediaDataController mediaDataController = snVar.getMediaDataController();
        String str3 = snVar.F3;
        long j10 = snVar.f41516f6;
        long j11 = snVar.X6;
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j10, j11, i10, 0, snVar.f41635p4, snVar.A3, snVar.B3, snVar.C3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        sn snVar = this.f38947s;
        ne.b bVar = snVar.Oc;
        if (snVar.G3 == null) {
            snVar.Rb(false);
        }
        snVar.O7();
        if (snVar.f41762z3) {
            snVar.U1.getAdapter().U("@" + editText.getText().toString(), 0, snVar.G6, true, true);
        } else if (snVar.A3 == null && snVar.B3 == null && snVar.f41513f3 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            snVar.f41513f3.callOnClick();
        }
        if (snVar.G3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f17447f) {
                if (z10) {
                    snVar.P7();
                }
                bVar.a(z10, true);
                ei.h1 h1Var = snVar.C1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    snVar.Rb(true);
                }
                snVar.oc(false);
            }
        }
    }

    @Override
    public final boolean u() {
        if (this.f38947s.G3 == null) {
            return true;
        }
        return false;
    }
}
