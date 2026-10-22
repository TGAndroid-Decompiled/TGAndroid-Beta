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
public final class in extends org.telegram.ui.ActionBar.g5 {
    public float f38034r;
    public final qn f38035s;

    public in(qn qnVar) {
        this.f38035s = qnVar;
    }

    @Override
    public final boolean a() {
        if (this.f38035s.f40868u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        qn qnVar;
        qn qnVar2 = this.f38035s;
        if (!qnVar2.Bc.f17384f) {
            if (qnVar2.f40868u3 != null && qnVar2.f40802p1 != null) {
                View currentView = qnVar2.f40813q1.getCurrentView();
                if (currentView instanceof sn) {
                    qnVar = ((sn) currentView).f41499a;
                } else {
                    qnVar = qnVar2;
                }
                if (!qnVar.zc.f17384f) {
                    qnVar.Qb(true);
                    return false;
                }
                int currentPosition = qnVar2.f40802p1.f25581a.getCurrentPosition();
                int i10 = qnVar2.f40826r1;
                if (currentPosition != i10) {
                    qnVar2.f40802p1.f25581a.d(i10, i10);
                    return false;
                }
            } else if (qnVar2.zc.f17384f) {
                qnVar2.Qb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.f38035s.f40780n3;
    }

    @Override
    public final void k() {
        int i10;
        qn qnVar = this.f38035s;
        qnVar.O7();
        if (qnVar.f40793o3 == null && qnVar.f40804p3 == null) {
            if (qnVar.f40780n3) {
                qnVar.I1.getAdapter().U(null, 0, null, false, true);
                qnVar.f40780n3 = false;
                qnVar.f40727j0.H("", true);
            }
            org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40727j0;
            if (qnVar.J9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var.setSearchFieldHint(LocaleController.getString(i10));
            qnVar.S2.setVisibility(0);
            ImageView imageView = qnVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            qnVar.f40793o3 = null;
            qnVar.f40804p3 = null;
            return;
        }
        ImageView imageView2 = qnVar.T2;
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
        qn qnVar = this.f38035s;
        qnVar.f40842s3 = false;
        qnVar.Ac();
        qnVar.Nc();
        ImageView imageView = qnVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = qnVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (qnVar.f40780n3) {
            qnVar.I1.getAdapter().U(null, 0, null, false, true);
            qnVar.f40780n3 = false;
        }
        qnVar.I1.setReversed(false);
        qnVar.I1.getAdapter().f11931k0 = false;
        qnVar.p7();
        qnVar.f40793o3 = null;
        qnVar.f40804p3 = null;
        qnVar.f40868u3 = null;
        org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40727j0;
        if (qnVar.J9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        u0Var.setSearchFieldHint(LocaleController.getString(i10));
        qnVar.f40727j0.setSearchFieldCaption(null);
        qnVar.Ac.a(false, true);
        qnVar.Bc.a(false, true);
        org.telegram.ui.ActionBar.x xVar = qnVar.f40715i0;
        if (xVar != null && xVar.f21870o != null) {
            org.telegram.ui.ActionBar.u0 u0Var2 = qnVar.f40704h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = qnVar.f40715i0;
            if (xVar2 != null) {
                xVar2.f(0);
                qn.S3(qnVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = qnVar.f40667e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            ur urVar = qnVar.f40655d0;
            if (urVar != null) {
                urVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = qnVar.m0;
            if (u0Var3 != null && qnVar.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = qnVar.f40777n0;
            if (xVar4 != null && qnVar.L9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = qnVar.f40740k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
        } else if (qnVar.Y.i0() && TextUtils.isEmpty(qnVar.Y.getSlowModeTimer()) && ((chat = qnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var5 = qnVar.f40704h0;
            if (u0Var5 != null) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = qnVar.f40715i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = qnVar.f40667e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            ur urVar2 = qnVar.f40655d0;
            if (urVar2 != null) {
                urVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = qnVar.m0;
            if (u0Var6 != null && qnVar.K9) {
                u0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = qnVar.f40777n0;
            if (xVar7 != null && qnVar.L9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var7 = qnVar.f40740k0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var8 = qnVar.f40704h0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = qnVar.f40777n0;
            if (xVar8 != null && qnVar.L9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = qnVar.f40740k0;
            if (u0Var9 != null) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var10 = qnVar.m0;
            if (u0Var10 != null && qnVar.K9) {
                u0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = qnVar.f40715i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = qnVar.f40667e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            ur urVar3 = qnVar.f40655d0;
            if (urVar3 != null) {
                urVar3.b(false);
            }
        }
        if (qnVar.f40813q1 != null) {
            if (qnVar.f40802p1.f25581a.getCurrentPosition() != 0) {
                qnVar.f40802p1.f25581a.d(0, 0);
                qnVar.f40840s1 = true;
            } else {
                qnVar.f40813q1.h.clear();
            }
        }
        int i13 = qnVar.R3;
        if (i13 == 3 || i13 == 8 || ((qnVar.f40659d4 == 0 && !UserObject.isReplyUser(qnVar.f40679f)) || ((messageObject = qnVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            qnVar.f40727j0.setVisibility(8);
        }
        qnVar.f40790o0 = false;
        qnVar.getMediaDataController().clearFoundMessageObjects();
        if (qnVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        hg.n1 n1Var = qnVar.M3;
        if (n1Var != null) {
            n1Var.l();
        }
        qnVar.Ma();
        qnVar.mc(false);
        qnVar.Dc(0, true);
        qnVar.bd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38034r, 0.0f);
        ofFloat.addUpdateListener(new hn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        qnVar.zc.a(false, true);
        qnVar.Mc();
        qnVar.f40815q3 = null;
        qnVar.Nc();
        qnVar.Ac();
        qk qkVar = qnVar.f40791o1;
        if (qkVar != null) {
            qkVar.d.M(new xq(2));
            qkVar.h = 0L;
            qnVar.f40791o1.g(false);
        }
        ck ckVar = qnVar.f40802p1;
        if (ckVar != null) {
            ckVar.b(false);
        }
        qnVar.pb(false);
    }

    @Override
    public final void n() {
        ck ckVar;
        int i10;
        qn qnVar = this.f38035s;
        boolean z10 = true;
        qnVar.f40842s3 = true;
        qnVar.Ac();
        qnVar.Nc();
        if (((qnVar.f40659d4 != 0 && qnVar.R3 != 3) || UserObject.isReplyUser(qnVar.f40679f)) && !qnVar.f40666dc) {
            qnVar.qa(null);
        }
        if (qnVar.W4) {
            qnVar.saveKeyboardPositionBeforeTransition();
            if (!qnVar.Pa) {
                Activity parentActivity = qnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ti(this, 10), 500L);
            aj ajVar = qnVar.f40693g2;
            if (ajVar != null) {
                ajVar.b(true);
            }
            org.telegram.ui.Components.r40 r40Var = qnVar.f40717i2;
            if (r40Var != null) {
                r40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38034r, 1.0f);
        ofFloat.addUpdateListener(new hn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        qk qkVar = qnVar.f40791o1;
        if (qkVar != null) {
            if (qnVar.Pa || !qkVar.a() || qnVar.f40868u3 != null) {
                z10 = false;
            }
            qkVar.g(z10);
        }
        if (qnVar.f40868u3 != null && (ckVar = qnVar.f40802p1) != null) {
            int currentPosition = ckVar.f25581a.getCurrentPosition();
            int i11 = qnVar.f40826r1;
            if (currentPosition != i11) {
                qnVar.f40802p1.f25581a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(hg.o0 o0Var) {
        qn qnVar = this.f38035s;
        qk qkVar = qnVar.f40791o1;
        if (qkVar != null) {
            qkVar.d.M(new xq(2));
            qkVar.h = 0L;
        }
        qnVar.f40815q3 = null;
        qnVar.Nc();
        qnVar.Ac();
        qnVar.pb(false);
    }

    @Override
    public final void p(ei.e2 e2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        qn qnVar = this.f38035s;
        boolean z10 = false;
        qnVar.Kc(0, 0, -1);
        if (e2Var != null) {
            str = e2Var.getText().toString();
        } else {
            str = qnVar.f40855t3;
        }
        qnVar.f40855t3 = str;
        if (!TextUtils.isEmpty(str) && (qnVar.f40855t3.startsWith("$") || qnVar.f40855t3.startsWith("#"))) {
            qnVar.P7();
            if (qnVar.f40855t3.contains("@")) {
                String str2 = qnVar.f40855t3;
                d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                qnVar.presentFragment(new org.telegram.ui.Components.k40(str2, d6Var));
                return;
            }
            if (qnVar.f40868u3 == null) {
                qnVar.f40868u3 = qnVar.f40855t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38034r, 1.0f);
                ofFloat.addUpdateListener(new hn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                qk qkVar = qnVar.f40791o1;
                if (qkVar != null) {
                    if (!qnVar.Pa && qkVar.a() && qnVar.f40868u3 == null) {
                        z10 = true;
                    }
                    qkVar.g(z10);
                }
            }
            qnVar.f40868u3 = qnVar.f40855t3;
            qnVar.U6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(qnVar.f40868u3);
            qnVar.f40853t1.f28385f.N(true);
            View currentView = qnVar.f40813q1.getCurrentView();
            if (qnVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof sn) {
                ((sn) currentView).f41499a.Oc(qnVar.f40868u3);
            }
            qnVar.Mc();
            qnVar.f40657d2.e(true, true);
            qnVar.Qb(true);
            z10 = true;
        } else {
            qnVar.f40868u3 = null;
            ck ckVar = qnVar.f40802p1;
            if (ckVar != null) {
                ckVar.b(false);
                qnVar.Mc();
            }
            ck ckVar2 = qnVar.f40802p1;
            if (ckVar2 != null && ckVar2.f25581a.getCurrentPosition() != 0) {
                qnVar.f40802p1.f25581a.d(0, 0);
            }
        }
        ck ckVar3 = qnVar.f40802p1;
        if (ckVar3 != null) {
            ckVar3.b(z10);
        }
        MediaDataController mediaDataController = qnVar.getMediaDataController();
        String str3 = qnVar.f40855t3;
        long j10 = qnVar.T5;
        long j11 = qnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j10, j11, i10, 0, qnVar.f40659d4, qnVar.f40793o3, qnVar.f40804p3, qnVar.f40815q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        qn qnVar = this.f38035s;
        ne.b bVar = qnVar.Bc;
        if (qnVar.f40868u3 == null) {
            qnVar.Qb(false);
        }
        qnVar.O7();
        if (qnVar.f40780n3) {
            qnVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, qnVar.f40871u6, true, true);
        } else if (qnVar.f40793o3 == null && qnVar.f40804p3 == null && qnVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            qnVar.T2.callOnClick();
        }
        if (qnVar.f40868u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f17384f) {
                if (z10) {
                    qnVar.P7();
                }
                bVar.a(z10, true);
                ei.h1 h1Var = qnVar.f40813q1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    qnVar.Qb(true);
                }
                qnVar.mc(false);
            }
        }
    }

    @Override
    public final boolean u() {
        if (this.f38035s.f40868u3 == null) {
            return true;
        }
        return false;
    }
}
