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
public final class in extends org.telegram.ui.ActionBar.e5 {
    public float f39221f;
    public final qn h;

    public in(qn qnVar) {
        this.h = qnVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f42039q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        qn qnVar;
        qn qnVar2 = this.h;
        if (!qnVar2.f42125wc.f47776f) {
            if (qnVar2.f42039q3 != null && qnVar2.l1 != null) {
                View currentView = qnVar2.f41990m1.getCurrentView();
                if (currentView instanceof sn) {
                    qnVar = ((sn) currentView).f42731a;
                } else {
                    qnVar = qnVar2;
                }
                if (!qnVar.f42102uc.f47776f) {
                    qnVar.Lb(true);
                    return false;
                }
                int currentPosition = qnVar2.l1.f29804a.getCurrentPosition();
                int i9 = qnVar2.f42003n1;
                if (currentPosition != i9) {
                    qnVar2.l1.f29804a.d(i9, i9);
                    return false;
                }
            } else if (qnVar2.f42102uc.f47776f) {
                qnVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f41957j3;
    }

    @Override
    public final void k() {
        int i9;
        qn qnVar = this.h;
        qnVar.L7();
        if (qnVar.f41969k3 == null && qnVar.f41980l3 == null) {
            if (qnVar.f41957j3) {
                qnVar.E1.getAdapter().U(null, 0, null, false, true);
                qnVar.f41957j3 = false;
                qnVar.f41904f0.H("", true);
            }
            org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41904f0;
            if (qnVar.E9()) {
                i9 = R.string.SavedTagSearchHint;
            } else {
                i9 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i9));
            qnVar.O2.setVisibility(0);
            ImageView imageView = qnVar.P2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            qnVar.f41969k3 = null;
            qnVar.f41980l3 = null;
            return;
        }
        ImageView imageView2 = qnVar.P2;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void m() {
        int i9;
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        qn qnVar = this.h;
        qnVar.f42018o3 = false;
        qnVar.vc();
        qnVar.Ic();
        ImageView imageView = qnVar.O2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = qnVar.P2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (qnVar.f41957j3) {
            qnVar.E1.getAdapter().U(null, 0, null, false, true);
            qnVar.f41957j3 = false;
        }
        qnVar.E1.setReversed(false);
        qnVar.E1.getAdapter().f19329g0 = false;
        qnVar.m7();
        qnVar.f41969k3 = null;
        qnVar.f41980l3 = null;
        qnVar.f42039q3 = null;
        org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41904f0;
        if (qnVar.E9()) {
            i9 = R.string.SavedTagSearchHint;
        } else {
            i9 = R.string.Search;
        }
        w0Var.setSearchFieldHint(LocaleController.getString(i9));
        qnVar.f41904f0.setSearchFieldCaption(null);
        qnVar.f42112vc.a(false, true);
        qnVar.f42125wc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = qnVar.f41891e0;
        if (yVar != null && yVar.f23967o != null) {
            org.telegram.ui.ActionBar.w0 w0Var2 = qnVar.f41878d0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = qnVar.f41891e0;
            if (yVar2 != null) {
                yVar2.f(0);
                qn.J3(qnVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = qnVar.f41840a0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            wr wrVar = qnVar.Z;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = qnVar.f41942i0;
            if (w0Var3 != null && qnVar.G9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = qnVar.f41954j0;
            if (yVar4 != null && qnVar.H9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = qnVar.f41916g0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
        } else if (qnVar.U.j0() && TextUtils.isEmpty(qnVar.U.getSlowModeTimer()) && ((chat = qnVar.f41890e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var5 = qnVar.f41878d0;
            if (w0Var5 != null) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = qnVar.f41891e0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = qnVar.f41840a0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            wr wrVar2 = qnVar.Z;
            if (wrVar2 != null) {
                wrVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = qnVar.f41942i0;
            if (w0Var6 != null && qnVar.G9) {
                w0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = qnVar.f41954j0;
            if (yVar7 != null && qnVar.H9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var7 = qnVar.f41916g0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var8 = qnVar.f41878d0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = qnVar.f41954j0;
            if (yVar8 != null && qnVar.H9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = qnVar.f41916g0;
            if (w0Var9 != null) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var10 = qnVar.f41942i0;
            if (w0Var10 != null && qnVar.G9) {
                w0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = qnVar.f41891e0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = qnVar.f41840a0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            wr wrVar3 = qnVar.Z;
            if (wrVar3 != null) {
                wrVar3.b(false);
            }
        }
        if (qnVar.f41990m1 != null) {
            if (qnVar.l1.f29804a.getCurrentPosition() != 0) {
                qnVar.l1.f29804a.d(0, 0);
                qnVar.f42016o1 = true;
            } else {
                qnVar.f41990m1.h.clear();
            }
        }
        int i12 = qnVar.N3;
        if (i12 == 3 || i12 == 8 || ((qnVar.Z3 == 0 && !UserObject.isReplyUser(qnVar.f41903f)) || ((messageObject = qnVar.T3) != null && messageObject.getRepliesCount() < 10))) {
            qnVar.f41904f0.setVisibility(8);
        }
        qnVar.f41966k0 = false;
        qnVar.getMediaDataController().clearFoundMessageObjects();
        if (qnVar.K3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        of.j1 j1Var = qnVar.I3;
        if (j1Var != null) {
            j1Var.l();
        }
        qnVar.Ia();
        qnVar.hc(false);
        qnVar.yc(0, true);
        qnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39221f, 0.0f);
        ofFloat.addUpdateListener(new hn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        qnVar.f42102uc.a(false, true);
        qnVar.Hc();
        qnVar.f41992m3 = null;
        qnVar.Ic();
        qnVar.vc();
        mk mkVar = qnVar.f41967k1;
        if (mkVar != null) {
            mkVar.d.M(new yq(2));
            mkVar.h = 0L;
            qnVar.f41967k1.g(false);
        }
        yj yjVar = qnVar.l1;
        if (yjVar != null) {
            yjVar.b(false);
        }
        qnVar.kb(false);
    }

    @Override
    public final void n() {
        yj yjVar;
        int i9;
        qn qnVar = this.h;
        boolean z10 = true;
        qnVar.f42018o3 = true;
        qnVar.vc();
        qnVar.Ic();
        if (((qnVar.Z3 != 0 && qnVar.N3 != 3) || UserObject.isReplyUser(qnVar.f41903f)) && !qnVar.Zb) {
            qnVar.la(null);
        }
        if (qnVar.S4) {
            qnVar.saveKeyboardPositionBeforeTransition();
            if (!qnVar.Ka) {
                Activity parentActivity = qnVar.getParentActivity();
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i9);
            }
            AndroidUtilities.runOnUIThread(new ri(this, 9), 500L);
            wi wiVar = qnVar.f41867c2;
            if (wiVar != null) {
                wiVar.b(true);
            }
            org.telegram.ui.Components.s30 s30Var = qnVar.f41893e2;
            if (s30Var != null) {
                s30Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39221f, 1.0f);
        ofFloat.addUpdateListener(new hn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        mk mkVar = qnVar.f41967k1;
        if (mkVar != null) {
            mkVar.g((!qnVar.Ka && mkVar.a() && qnVar.f42039q3 == null) ? false : false);
        }
        if (qnVar.f42039q3 != null && (yjVar = qnVar.l1) != null) {
            int currentPosition = yjVar.f29804a.getCurrentPosition();
            int i10 = qnVar.f42003n1;
            if (currentPosition != i10) {
                qnVar.l1.f29804a.d(i10, i10);
            }
        }
    }

    @Override
    public final void o(of.m0 m0Var) {
        qn qnVar = this.h;
        mk mkVar = qnVar.f41967k1;
        if (mkVar != null) {
            mkVar.d.M(new yq(2));
            mkVar.h = 0L;
        }
        qnVar.f41992m3 = null;
        qnVar.Ic();
        qnVar.vc();
        qnVar.kb(false);
    }

    @Override
    public final void p(fg.g gVar) {
        String str;
        int i9;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.b6 b6Var;
        qn qnVar = this.h;
        boolean z10 = false;
        qnVar.Fc(0, 0, -1);
        if (gVar != null) {
            str = gVar.getText().toString();
        } else {
            str = qnVar.f42028p3;
        }
        qnVar.f42028p3 = str;
        if (!TextUtils.isEmpty(str) && (qnVar.f42028p3.startsWith("$") || qnVar.f42028p3.startsWith("#"))) {
            qnVar.M7();
            if (qnVar.f42028p3.contains("@")) {
                String str2 = qnVar.f42028p3;
                b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                qnVar.presentFragment(new org.telegram.ui.Components.l30(str2, b6Var));
                return;
            }
            if (qnVar.f42039q3 == null) {
                qnVar.f42039q3 = qnVar.f42028p3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39221f, 1.0f);
                ofFloat.addUpdateListener(new hn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                mk mkVar = qnVar.f41967k1;
                if (mkVar != null) {
                    if (!qnVar.Ka && mkVar.a() && qnVar.f42039q3 == null) {
                        z10 = true;
                    }
                    mkVar.g(z10);
                }
            }
            qnVar.f42039q3 = qnVar.f42028p3;
            qnVar.R6(true);
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i10).putToHistory(qnVar.f42039q3);
            qnVar.f42026p1.f31011f.N(true);
            View currentView = qnVar.f41990m1.getCurrentView();
            if (qnVar.K3 == 3) {
                i12 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults(3);
            } else {
                i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                HashtagSearchController.getInstance(i11).clearSearchResults();
            }
            if (currentView instanceof sn) {
                ((sn) currentView).f42731a.Jc(qnVar.f42039q3);
            }
            qnVar.Hc();
            qnVar.Z1.e(true, true);
            qnVar.Lb(true);
            z10 = true;
        } else {
            qnVar.f42039q3 = null;
            yj yjVar = qnVar.l1;
            if (yjVar != null) {
                yjVar.b(false);
                qnVar.Hc();
            }
            yj yjVar2 = qnVar.l1;
            if (yjVar2 != null && yjVar2.f29804a.getCurrentPosition() != 0) {
                qnVar.l1.f29804a.d(0, 0);
            }
        }
        yj yjVar3 = qnVar.l1;
        if (yjVar3 != null) {
            yjVar3.b(z10);
        }
        MediaDataController mediaDataController = qnVar.getMediaDataController();
        String str3 = qnVar.f42028p3;
        long j10 = qnVar.P5;
        long j11 = qnVar.H6;
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j10, j11, i9, 0, qnVar.Z3, qnVar.f41969k3, qnVar.f41980l3, qnVar.f41992m3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        qn qnVar = this.h;
        td.a aVar = qnVar.f42125wc;
        if (qnVar.f42039q3 == null) {
            qnVar.Lb(false);
        }
        qnVar.L7();
        if (qnVar.f41957j3) {
            of.f1 adapter = qnVar.E1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, qnVar.f42042q6, true, true);
        } else if (qnVar.f41969k3 == null && qnVar.f41980l3 == null && qnVar.P2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            qnVar.P2.callOnClick();
        }
        if (qnVar.f42039q3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != aVar.f47776f) {
                if (z10) {
                    qnVar.M7();
                }
                aVar.a(z10, true);
                kh.j1 j1Var = qnVar.f41990m1;
                if (j1Var != null) {
                    j1Var.D(0);
                }
                if (z10) {
                    qnVar.Lb(true);
                }
                qnVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f42039q3 == null) {
            return true;
        }
        return false;
    }
}
