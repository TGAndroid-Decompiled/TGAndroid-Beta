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
public final class kn extends org.telegram.ui.ActionBar.g5 {
    public float f38580r;
    public final sn f38581s;

    public kn(sn snVar) {
        this.f38581s = snVar;
    }

    @Override
    public final boolean a() {
        if (this.f38581s.f41397u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        sn snVar;
        sn snVar2 = this.f38581s;
        if (!snVar2.Ac.f17380f) {
            if (snVar2.f41397u3 != null && snVar2.f41331p1 != null) {
                View currentView = snVar2.f41342q1.getCurrentView();
                if (currentView instanceof un) {
                    snVar = ((un) currentView).f42016a;
                } else {
                    snVar = snVar2;
                }
                if (!snVar.yc.f17380f) {
                    snVar.Pb(true);
                    return false;
                }
                int currentPosition = snVar2.f41331p1.f25629a.getCurrentPosition();
                int i10 = snVar2.f41355r1;
                if (currentPosition != i10) {
                    snVar2.f41331p1.f25629a.d(i10, i10);
                    return false;
                }
            } else if (snVar2.yc.f17380f) {
                snVar2.Pb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.f38581s.f41309n3;
    }

    @Override
    public final void k() {
        int i10;
        sn snVar = this.f38581s;
        snVar.O7();
        if (snVar.f41322o3 == null && snVar.f41333p3 == null) {
            if (snVar.f41309n3) {
                snVar.I1.getAdapter().U(null, 0, null, false, true);
                snVar.f41309n3 = false;
                snVar.f41256j0.H("", true);
            }
            org.telegram.ui.ActionBar.u0 u0Var = snVar.f41256j0;
            if (snVar.J9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var.setSearchFieldHint(LocaleController.getString(i10));
            snVar.S2.setVisibility(0);
            ImageView imageView = snVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            snVar.f41322o3 = null;
            snVar.f41333p3 = null;
            return;
        }
        ImageView imageView2 = snVar.T2;
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
        sn snVar = this.f38581s;
        snVar.f41371s3 = false;
        snVar.zc();
        snVar.Mc();
        ImageView imageView = snVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = snVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (snVar.f41309n3) {
            snVar.I1.getAdapter().U(null, 0, null, false, true);
            snVar.f41309n3 = false;
        }
        snVar.I1.setReversed(false);
        snVar.I1.getAdapter().f11932k0 = false;
        snVar.p7();
        snVar.f41322o3 = null;
        snVar.f41333p3 = null;
        snVar.f41397u3 = null;
        org.telegram.ui.ActionBar.u0 u0Var = snVar.f41256j0;
        if (snVar.J9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        u0Var.setSearchFieldHint(LocaleController.getString(i10));
        snVar.f41256j0.setSearchFieldCaption(null);
        snVar.zc.a(false, true);
        snVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.x xVar = snVar.f41244i0;
        if (xVar != null && xVar.f21863o != null) {
            org.telegram.ui.ActionBar.u0 u0Var2 = snVar.f41233h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = snVar.f41244i0;
            if (xVar2 != null) {
                xVar2.f(0);
                sn.S3(snVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = snVar.f41196e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            wr wrVar = snVar.f41184d0;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = snVar.m0;
            if (u0Var3 != null && snVar.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = snVar.f41306n0;
            if (xVar4 != null && snVar.L9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = snVar.f41269k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
        } else if (snVar.Y.i0() && TextUtils.isEmpty(snVar.Y.getSlowModeTimer()) && ((chat = snVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var5 = snVar.f41233h0;
            if (u0Var5 != null) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = snVar.f41244i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = snVar.f41196e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            wr wrVar2 = snVar.f41184d0;
            if (wrVar2 != null) {
                wrVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = snVar.m0;
            if (u0Var6 != null && snVar.K9) {
                u0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = snVar.f41306n0;
            if (xVar7 != null && snVar.L9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var7 = snVar.f41269k0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var8 = snVar.f41233h0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = snVar.f41306n0;
            if (xVar8 != null && snVar.L9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = snVar.f41269k0;
            if (u0Var9 != null) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var10 = snVar.m0;
            if (u0Var10 != null && snVar.K9) {
                u0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = snVar.f41244i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = snVar.f41196e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            wr wrVar3 = snVar.f41184d0;
            if (wrVar3 != null) {
                wrVar3.b(false);
            }
        }
        if (snVar.f41342q1 != null) {
            if (snVar.f41331p1.f25629a.getCurrentPosition() != 0) {
                snVar.f41331p1.f25629a.d(0, 0);
                snVar.f41369s1 = true;
            } else {
                snVar.f41342q1.h.clear();
            }
        }
        int i13 = snVar.R3;
        if (i13 == 3 || i13 == 8 || ((snVar.f41188d4 == 0 && !UserObject.isReplyUser(snVar.f41208f)) || ((messageObject = snVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            snVar.f41256j0.setVisibility(8);
        }
        snVar.f41319o0 = false;
        snVar.getMediaDataController().clearFoundMessageObjects();
        if (snVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        hg.n1 n1Var = snVar.M3;
        if (n1Var != null) {
            n1Var.l();
        }
        snVar.Ma();
        snVar.lc(false);
        snVar.Cc(0, true);
        snVar.ad(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38580r, 0.0f);
        ofFloat.addUpdateListener(new jn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        snVar.yc.a(false, true);
        snVar.Lc();
        snVar.f41344q3 = null;
        snVar.Mc();
        snVar.zc();
        sk skVar = snVar.f41320o1;
        if (skVar != null) {
            skVar.d.M(new zq(2));
            skVar.h = 0L;
            snVar.f41320o1.g(false);
        }
        ek ekVar = snVar.f41331p1;
        if (ekVar != null) {
            ekVar.b(false);
        }
        snVar.ob(false);
    }

    @Override
    public final void n() {
        ek ekVar;
        int i10;
        sn snVar = this.f38581s;
        boolean z10 = true;
        snVar.f41371s3 = true;
        snVar.zc();
        snVar.Mc();
        if (((snVar.f41188d4 != 0 && snVar.R3 != 3) || UserObject.isReplyUser(snVar.f41208f)) && !snVar.f41195dc) {
            snVar.qa(null);
        }
        if (snVar.W4) {
            snVar.saveKeyboardPositionBeforeTransition();
            if (!snVar.Pa) {
                Activity parentActivity = snVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new vi(this, 10), 500L);
            cj cjVar = snVar.f41222g2;
            if (cjVar != null) {
                cjVar.b(true);
            }
            org.telegram.ui.Components.r40 r40Var = snVar.f41246i2;
            if (r40Var != null) {
                r40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38580r, 1.0f);
        ofFloat.addUpdateListener(new jn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        sk skVar = snVar.f41320o1;
        if (skVar != null) {
            if (snVar.Pa || !skVar.a() || snVar.f41397u3 != null) {
                z10 = false;
            }
            skVar.g(z10);
        }
        if (snVar.f41397u3 != null && (ekVar = snVar.f41331p1) != null) {
            int currentPosition = ekVar.f25629a.getCurrentPosition();
            int i11 = snVar.f41355r1;
            if (currentPosition != i11) {
                snVar.f41331p1.f25629a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(hg.o0 o0Var) {
        sn snVar = this.f38581s;
        sk skVar = snVar.f41320o1;
        if (skVar != null) {
            skVar.d.M(new zq(2));
            skVar.h = 0L;
        }
        snVar.f41344q3 = null;
        snVar.Mc();
        snVar.zc();
        snVar.ob(false);
    }

    @Override
    public final void p(ei.e2 e2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        sn snVar = this.f38581s;
        boolean z10 = false;
        snVar.Jc(0, 0, -1);
        if (e2Var != null) {
            str = e2Var.getText().toString();
        } else {
            str = snVar.f41384t3;
        }
        snVar.f41384t3 = str;
        if (!TextUtils.isEmpty(str) && (snVar.f41384t3.startsWith("$") || snVar.f41384t3.startsWith("#"))) {
            snVar.P7();
            if (snVar.f41384t3.contains("@")) {
                String str2 = snVar.f41384t3;
                d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
                snVar.presentFragment(new org.telegram.ui.Components.k40(str2, d6Var));
                return;
            }
            if (snVar.f41397u3 == null) {
                snVar.f41397u3 = snVar.f41384t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38580r, 1.0f);
                ofFloat.addUpdateListener(new jn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                sk skVar = snVar.f41320o1;
                if (skVar != null) {
                    if (!snVar.Pa && skVar.a() && snVar.f41397u3 == null) {
                        z10 = true;
                    }
                    skVar.g(z10);
                }
            }
            snVar.f41397u3 = snVar.f41384t3;
            snVar.U6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(snVar.f41397u3);
            snVar.f41382t1.f28390f.N(true);
            View currentView = snVar.f41342q1.getCurrentView();
            if (snVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof un) {
                ((un) currentView).f42016a.Nc(snVar.f41397u3);
            }
            snVar.Lc();
            snVar.f41186d2.e(true, true);
            snVar.Pb(true);
            z10 = true;
        } else {
            snVar.f41397u3 = null;
            ek ekVar = snVar.f41331p1;
            if (ekVar != null) {
                ekVar.b(false);
                snVar.Lc();
            }
            ek ekVar2 = snVar.f41331p1;
            if (ekVar2 != null && ekVar2.f25629a.getCurrentPosition() != 0) {
                snVar.f41331p1.f25629a.d(0, 0);
            }
        }
        ek ekVar3 = snVar.f41331p1;
        if (ekVar3 != null) {
            ekVar3.b(z10);
        }
        MediaDataController mediaDataController = snVar.getMediaDataController();
        String str3 = snVar.f41384t3;
        long j10 = snVar.T5;
        long j11 = snVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j10, j11, i10, 0, snVar.f41188d4, snVar.f41322o3, snVar.f41333p3, snVar.f41344q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        sn snVar = this.f38581s;
        ne.b bVar = snVar.Ac;
        if (snVar.f41397u3 == null) {
            snVar.Pb(false);
        }
        snVar.O7();
        if (snVar.f41309n3) {
            snVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, snVar.f41400u6, true, true);
        } else if (snVar.f41322o3 == null && snVar.f41333p3 == null && snVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            snVar.T2.callOnClick();
        }
        if (snVar.f41397u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != bVar.f17380f) {
                if (z10) {
                    snVar.P7();
                }
                bVar.a(z10, true);
                ei.h1 h1Var = snVar.f41342q1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    snVar.Pb(true);
                }
                snVar.lc(false);
            }
        }
    }

    @Override
    public final boolean u() {
        if (this.f38581s.f41397u3 == null) {
            return true;
        }
        return false;
    }
}
