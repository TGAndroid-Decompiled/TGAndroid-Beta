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
public final class ln extends org.telegram.ui.ActionBar.e5 {
    public float f40247f;
    public final tn h;

    public ln(tn tnVar) {
        this.h = tnVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f42940q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        tn tnVar;
        tn tnVar2 = this.h;
        if (!tnVar2.f43025wc.f49506f) {
            if (tnVar2.f42940q3 != null && tnVar2.l1 != null) {
                View currentView = tnVar2.f42887m1.getCurrentView();
                if (currentView instanceof vn) {
                    tnVar = ((vn) currentView).f43683a;
                } else {
                    tnVar = tnVar2;
                }
                if (!tnVar.f42998uc.f49506f) {
                    tnVar.Lb(true);
                    return false;
                }
                int currentPosition = tnVar2.l1.f31098a.getCurrentPosition();
                int i10 = tnVar2.f42900n1;
                if (currentPosition != i10) {
                    tnVar2.l1.f31098a.d(i10, i10);
                    return false;
                }
            } else if (tnVar2.f42998uc.f49506f) {
                tnVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f42854j3;
    }

    @Override
    public final void k() {
        int i10;
        tn tnVar = this.h;
        tnVar.L7();
        if (tnVar.f42867k3 == null && tnVar.f42878l3 == null) {
            if (tnVar.f42854j3) {
                tnVar.E1.getAdapter().U(null, 0, null, false, true);
                tnVar.f42854j3 = false;
                tnVar.f42802f0.H("", true);
            }
            org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42802f0;
            if (tnVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
            tnVar.O2.setVisibility(0);
            ImageView imageView = tnVar.P2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            tnVar.f42867k3 = null;
            tnVar.f42878l3 = null;
            return;
        }
        ImageView imageView2 = tnVar.P2;
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
        tn tnVar = this.h;
        tnVar.f42915o3 = false;
        tnVar.vc();
        tnVar.Ic();
        ImageView imageView = tnVar.O2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = tnVar.P2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (tnVar.f42854j3) {
            tnVar.E1.getAdapter().U(null, 0, null, false, true);
            tnVar.f42854j3 = false;
        }
        tnVar.E1.setReversed(false);
        tnVar.E1.getAdapter().f47371g0 = false;
        tnVar.m7();
        tnVar.f42867k3 = null;
        tnVar.f42878l3 = null;
        tnVar.f42940q3 = null;
        org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42802f0;
        if (tnVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        w0Var.setSearchFieldHint(LocaleController.getString(i10));
        tnVar.f42802f0.setSearchFieldCaption(null);
        tnVar.f43011vc.a(false, true);
        tnVar.f43025wc.a(false, true);
        org.telegram.ui.ActionBar.z zVar = tnVar.f42788e0;
        if (zVar != null && zVar.f24006o != null) {
            org.telegram.ui.ActionBar.w0 w0Var2 = tnVar.f42775d0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar2 = tnVar.f42788e0;
            if (zVar2 != null) {
                zVar2.f(0);
                tn.J3(tnVar);
            }
            org.telegram.ui.ActionBar.z zVar3 = tnVar.f42737a0;
            if (zVar3 != null) {
                zVar3.f(8);
            }
            vr vrVar = tnVar.Z;
            if (vrVar != null) {
                vrVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = tnVar.f42838i0;
            if (w0Var3 != null && tnVar.G9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar4 = tnVar.f42851j0;
            if (zVar4 != null && tnVar.H9) {
                zVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = tnVar.f42814g0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
        } else if (tnVar.U.k0() && TextUtils.isEmpty(tnVar.U.getSlowModeTimer()) && ((chat = tnVar.f42787e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var5 = tnVar.f42775d0;
            if (w0Var5 != null) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar5 = tnVar.f42788e0;
            if (zVar5 != null) {
                zVar5.f(8);
            }
            org.telegram.ui.ActionBar.z zVar6 = tnVar.f42737a0;
            if (zVar6 != null) {
                zVar6.f(0);
            }
            vr vrVar2 = tnVar.Z;
            if (vrVar2 != null) {
                vrVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = tnVar.f42838i0;
            if (w0Var6 != null && tnVar.G9) {
                w0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar7 = tnVar.f42851j0;
            if (zVar7 != null && tnVar.H9) {
                zVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var7 = tnVar.f42814g0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var8 = tnVar.f42775d0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar8 = tnVar.f42851j0;
            if (zVar8 != null && tnVar.H9) {
                zVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = tnVar.f42814g0;
            if (w0Var9 != null) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var10 = tnVar.f42838i0;
            if (w0Var10 != null && tnVar.G9) {
                w0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar9 = tnVar.f42788e0;
            if (zVar9 != null) {
                zVar9.f(8);
            }
            org.telegram.ui.ActionBar.z zVar10 = tnVar.f42737a0;
            if (zVar10 != null) {
                zVar10.f(8);
            }
            vr vrVar3 = tnVar.Z;
            if (vrVar3 != null) {
                vrVar3.b(false);
            }
        }
        if (tnVar.f42887m1 != null) {
            if (tnVar.l1.f31098a.getCurrentPosition() != 0) {
                tnVar.l1.f31098a.d(0, 0);
                tnVar.f42913o1 = true;
            } else {
                tnVar.f42887m1.h.clear();
            }
        }
        int i13 = tnVar.N3;
        if (i13 == 3 || i13 == 8 || ((tnVar.Z3 == 0 && !UserObject.isReplyUser(tnVar.f42801f)) || ((messageObject = tnVar.T3) != null && messageObject.getRepliesCount() < 10))) {
            tnVar.f42802f0.setVisibility(8);
        }
        tnVar.f42864k0 = false;
        tnVar.getMediaDataController().clearFoundMessageObjects();
        if (tnVar.K3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        rf.z0 z0Var = tnVar.I3;
        if (z0Var != null) {
            z0Var.l();
        }
        tnVar.Ia();
        tnVar.hc(false);
        tnVar.yc(0, true);
        tnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40247f, 0.0f);
        ofFloat.addUpdateListener(new kn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.jr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        tnVar.f42998uc.a(false, true);
        tnVar.Hc();
        tnVar.f42889m3 = null;
        tnVar.Ic();
        tnVar.vc();
        pk pkVar = tnVar.f42865k1;
        if (pkVar != null) {
            pkVar.d.M(new zq(2));
            pkVar.h = 0L;
            tnVar.f42865k1.g(false);
        }
        bk bkVar = tnVar.l1;
        if (bkVar != null) {
            bkVar.b(false);
        }
        tnVar.kb(false);
    }

    @Override
    public final void n() {
        bk bkVar;
        int i10;
        tn tnVar = this.h;
        boolean z10 = true;
        tnVar.f42915o3 = true;
        tnVar.vc();
        tnVar.Ic();
        if (((tnVar.Z3 != 0 && tnVar.N3 != 3) || UserObject.isReplyUser(tnVar.f42801f)) && !tnVar.Zb) {
            tnVar.la(null);
        }
        if (tnVar.S4) {
            tnVar.saveKeyboardPositionBeforeTransition();
            if (!tnVar.Ka) {
                Activity parentActivity = tnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ui(this, 9), 500L);
            zi ziVar = tnVar.f42766c2;
            if (ziVar != null) {
                ziVar.b(true);
            }
            org.telegram.ui.Components.g40 g40Var = tnVar.f42790e2;
            if (g40Var != null) {
                g40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40247f, 1.0f);
        ofFloat.addUpdateListener(new kn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.jr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        pk pkVar = tnVar.f42865k1;
        if (pkVar != null) {
            pkVar.g((!tnVar.Ka && pkVar.a() && tnVar.f42940q3 == null) ? false : false);
        }
        if (tnVar.f42940q3 != null && (bkVar = tnVar.l1) != null) {
            int currentPosition = bkVar.f31098a.getCurrentPosition();
            int i11 = tnVar.f42900n1;
            if (currentPosition != i11) {
                tnVar.l1.f31098a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(rf.f0 f0Var) {
        tn tnVar = this.h;
        pk pkVar = tnVar.f42865k1;
        if (pkVar != null) {
            pkVar.d.M(new zq(2));
            pkVar.h = 0L;
        }
        tnVar.f42889m3 = null;
        tnVar.Ic();
        tnVar.vc();
        tnVar.kb(false);
    }

    @Override
    public final void p(ig.f fVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var;
        tn tnVar = this.h;
        boolean z10 = false;
        tnVar.Fc(0, 0, -1);
        if (fVar != null) {
            str = fVar.getText().toString();
        } else {
            str = tnVar.f42927p3;
        }
        tnVar.f42927p3 = str;
        if (!TextUtils.isEmpty(str) && (tnVar.f42927p3.startsWith("$") || tnVar.f42927p3.startsWith("#"))) {
            tnVar.M7();
            if (tnVar.f42927p3.contains("@")) {
                String str2 = tnVar.f42927p3;
                c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
                tnVar.presentFragment(new org.telegram.ui.Components.z30(str2, c6Var));
                return;
            }
            if (tnVar.f42940q3 == null) {
                tnVar.f42940q3 = tnVar.f42927p3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40247f, 1.0f);
                ofFloat.addUpdateListener(new kn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.jr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                pk pkVar = tnVar.f42865k1;
                if (pkVar != null) {
                    if (!tnVar.Ka && pkVar.a() && tnVar.f42940q3 == null) {
                        z10 = true;
                    }
                    pkVar.g(z10);
                }
            }
            tnVar.f42940q3 = tnVar.f42927p3;
            tnVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(tnVar.f42940q3);
            tnVar.f42925p1.f26976f.N(true);
            View currentView = tnVar.f42887m1.getCurrentView();
            if (tnVar.K3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof vn) {
                ((vn) currentView).f43683a.Jc(tnVar.f42940q3);
            }
            tnVar.Hc();
            tnVar.Z1.e(true, true);
            tnVar.Lb(true);
            z10 = true;
        } else {
            tnVar.f42940q3 = null;
            bk bkVar = tnVar.l1;
            if (bkVar != null) {
                bkVar.b(false);
                tnVar.Hc();
            }
            bk bkVar2 = tnVar.l1;
            if (bkVar2 != null && bkVar2.f31098a.getCurrentPosition() != 0) {
                tnVar.l1.f31098a.d(0, 0);
            }
        }
        bk bkVar3 = tnVar.l1;
        if (bkVar3 != null) {
            bkVar3.b(z10);
        }
        MediaDataController mediaDataController = tnVar.getMediaDataController();
        String str3 = tnVar.f42927p3;
        long j10 = tnVar.P5;
        long j11 = tnVar.H6;
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j10, j11, i10, 0, tnVar.Z3, tnVar.f42867k3, tnVar.f42878l3, tnVar.f42889m3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        tn tnVar = this.h;
        vd.a aVar = tnVar.f43025wc;
        if (tnVar.f42940q3 == null) {
            tnVar.Lb(false);
        }
        tnVar.L7();
        if (tnVar.f42854j3) {
            rf.v0 adapter = tnVar.E1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, tnVar.q6, true, true);
        } else if (tnVar.f42867k3 == null && tnVar.f42878l3 == null && tnVar.P2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            tnVar.P2.callOnClick();
        }
        if (tnVar.f42940q3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != aVar.f49506f) {
                if (z10) {
                    tnVar.M7();
                }
                aVar.a(z10, true);
                nh.g1 g1Var = tnVar.f42887m1;
                if (g1Var != null) {
                    g1Var.D(0);
                }
                if (z10) {
                    tnVar.Lb(true);
                }
                tnVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f42940q3 == null) {
            return true;
        }
        return false;
    }
}
