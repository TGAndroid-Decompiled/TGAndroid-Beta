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
public final class pn extends org.telegram.ui.ActionBar.f5 {
    public float f36148f;
    public final xn h;

    public pn(xn xnVar) {
        this.h = xnVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f39560u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        xn xnVar;
        xn xnVar2 = this.h;
        if (!xnVar2.f39633zc.f13963f) {
            if (xnVar2.f39560u3 != null && xnVar2.f39494p1 != null) {
                View currentView = xnVar2.f39506q1.getCurrentView();
                if (currentView instanceof zn) {
                    xnVar = ((zn) currentView).f40196a;
                } else {
                    xnVar = xnVar2;
                }
                if (!xnVar.xc.f13963f) {
                    xnVar.Lb(true);
                    return false;
                }
                int currentPosition = xnVar2.f39494p1.f28524a.getCurrentPosition();
                int i10 = xnVar2.f39519r1;
                if (currentPosition != i10) {
                    xnVar2.f39494p1.f28524a.d(i10, i10);
                    return false;
                }
            } else if (xnVar2.xc.f13963f) {
                xnVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f39473n3;
    }

    @Override
    public final void k() {
        int i10;
        xn xnVar = this.h;
        xnVar.L7();
        if (xnVar.f39484o3 == null && xnVar.f39496p3 == null) {
            if (xnVar.f39473n3) {
                xnVar.I1.getAdapter().U(null, 0, null, false, true);
                xnVar.f39473n3 = false;
                xnVar.f39421j0.H("", true);
            }
            org.telegram.ui.ActionBar.v0 v0Var = xnVar.f39421j0;
            if (xnVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var.setSearchFieldHint(LocaleController.getString(i10));
            xnVar.S2.setVisibility(0);
            ImageView imageView = xnVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            xnVar.f39484o3 = null;
            xnVar.f39496p3 = null;
            return;
        }
        ImageView imageView2 = xnVar.T2;
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
        xn xnVar = this.h;
        xnVar.f39535s3 = false;
        xnVar.vc();
        xnVar.Ic();
        ImageView imageView = xnVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = xnVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (xnVar.f39473n3) {
            xnVar.I1.getAdapter().U(null, 0, null, false, true);
            xnVar.f39473n3 = false;
        }
        xnVar.I1.setReversed(false);
        xnVar.I1.getAdapter().f9809k0 = false;
        xnVar.m7();
        xnVar.f39484o3 = null;
        xnVar.f39496p3 = null;
        xnVar.f39560u3 = null;
        org.telegram.ui.ActionBar.v0 v0Var = xnVar.f39421j0;
        if (xnVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        v0Var.setSearchFieldHint(LocaleController.getString(i10));
        xnVar.f39421j0.setSearchFieldCaption(null);
        xnVar.f39620yc.a(false, true);
        xnVar.f39633zc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = xnVar.f39408i0;
        if (yVar != null && yVar.f19687o != null) {
            org.telegram.ui.ActionBar.v0 v0Var2 = xnVar.f39396h0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = xnVar.f39408i0;
            if (yVar2 != null) {
                yVar2.f(0);
                xn.J3(xnVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = xnVar.f39361e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            cs csVar = xnVar.f39348d0;
            if (csVar != null) {
                csVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = xnVar.m0;
            if (v0Var3 != null && xnVar.K9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = xnVar.f39470n0;
            if (yVar4 != null && xnVar.L9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = xnVar.f39433k0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
        } else if (xnVar.Y.l0() && TextUtils.isEmpty(xnVar.Y.getSlowModeTimer()) && ((chat = xnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var5 = xnVar.f39396h0;
            if (v0Var5 != null) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = xnVar.f39408i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = xnVar.f39361e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            cs csVar2 = xnVar.f39348d0;
            if (csVar2 != null) {
                csVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = xnVar.m0;
            if (v0Var6 != null && xnVar.K9) {
                v0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = xnVar.f39470n0;
            if (yVar7 != null && xnVar.L9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var7 = xnVar.f39433k0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var8 = xnVar.f39396h0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = xnVar.f39470n0;
            if (yVar8 != null && xnVar.L9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = xnVar.f39433k0;
            if (v0Var9 != null) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var10 = xnVar.m0;
            if (v0Var10 != null && xnVar.K9) {
                v0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = xnVar.f39408i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = xnVar.f39361e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            cs csVar3 = xnVar.f39348d0;
            if (csVar3 != null) {
                csVar3.b(false);
            }
        }
        if (xnVar.f39506q1 != null) {
            if (xnVar.f39494p1.f28524a.getCurrentPosition() != 0) {
                xnVar.f39494p1.f28524a.d(0, 0);
                xnVar.f39533s1 = true;
            } else {
                xnVar.f39506q1.h.clear();
            }
        }
        int i13 = xnVar.R3;
        if (i13 == 3 || i13 == 8 || ((xnVar.f39352d4 == 0 && !UserObject.isReplyUser(xnVar.f39372f)) || ((messageObject = xnVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            xnVar.f39421j0.setVisibility(8);
        }
        xnVar.f39481o0 = false;
        xnVar.getMediaDataController().clearFoundMessageObjects();
        if (xnVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        gg.o1 o1Var = xnVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        xnVar.Ia();
        xnVar.hc(false);
        xnVar.yc(0, true);
        xnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36148f, 0.0f);
        ofFloat.addUpdateListener(new on(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        xnVar.xc.a(false, true);
        xnVar.Hc();
        xnVar.f39508q3 = null;
        xnVar.Ic();
        xnVar.vc();
        vk vkVar = xnVar.f39482o1;
        if (vkVar != null) {
            vkVar.d.M(new gr(2));
            vkVar.h = 0L;
            xnVar.f39482o1.g(false);
        }
        hk hkVar = xnVar.f39494p1;
        if (hkVar != null) {
            hkVar.b(false);
        }
        xnVar.kb(false);
    }

    @Override
    public final void n() {
        hk hkVar;
        int i10;
        xn xnVar = this.h;
        boolean z10 = true;
        xnVar.f39535s3 = true;
        xnVar.vc();
        xnVar.Ic();
        if (((xnVar.f39352d4 != 0 && xnVar.R3 != 3) || UserObject.isReplyUser(xnVar.f39372f)) && !xnVar.f39347cc) {
            xnVar.la(null);
        }
        if (xnVar.W4) {
            xnVar.saveKeyboardPositionBeforeTransition();
            if (!xnVar.Oa) {
                Activity parentActivity = xnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new aj(this, 9), 500L);
            fj fjVar = xnVar.f39387g2;
            if (fjVar != null) {
                fjVar.b(true);
            }
            org.telegram.ui.Components.j40 j40Var = xnVar.f39410i2;
            if (j40Var != null) {
                j40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36148f, 1.0f);
        ofFloat.addUpdateListener(new on(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        vk vkVar = xnVar.f39482o1;
        if (vkVar != null) {
            vkVar.g((!xnVar.Oa && vkVar.a() && xnVar.f39560u3 == null) ? false : false);
        }
        if (xnVar.f39560u3 != null && (hkVar = xnVar.f39494p1) != null) {
            int currentPosition = hkVar.f28524a.getCurrentPosition();
            int i11 = xnVar.f39519r1;
            if (currentPosition != i11) {
                xnVar.f39494p1.f28524a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(gg.q0 q0Var) {
        xn xnVar = this.h;
        vk vkVar = xnVar.f39482o1;
        if (vkVar != null) {
            vkVar.d.M(new gr(2));
            vkVar.h = 0L;
        }
        xnVar.f39508q3 = null;
        xnVar.Ic();
        xnVar.vc();
        xnVar.kb(false);
    }

    @Override
    public final void p(ci.h2 h2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        xn xnVar = this.h;
        boolean z10 = false;
        xnVar.Fc(0, 0, -1);
        if (h2Var != null) {
            str = h2Var.getText().toString();
        } else {
            str = xnVar.f39548t3;
        }
        xnVar.f39548t3 = str;
        if (!TextUtils.isEmpty(str) && (xnVar.f39548t3.startsWith("$") || xnVar.f39548t3.startsWith("#"))) {
            xnVar.M7();
            if (xnVar.f39548t3.contains("@")) {
                String str2 = xnVar.f39548t3;
                d6Var = ((org.telegram.ui.ActionBar.n2) xnVar).resourceProvider;
                xnVar.presentFragment(new org.telegram.ui.Components.c40(str2, d6Var));
                return;
            }
            if (xnVar.f39560u3 == null) {
                xnVar.f39560u3 = xnVar.f39548t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36148f, 1.0f);
                ofFloat.addUpdateListener(new on(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                vk vkVar = xnVar.f39482o1;
                if (vkVar != null) {
                    if (!xnVar.Oa && vkVar.a() && xnVar.f39560u3 == null) {
                        z10 = true;
                    }
                    vkVar.g(z10);
                }
            }
            xnVar.f39560u3 = xnVar.f39548t3;
            xnVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(xnVar.f39560u3);
            xnVar.f39546t1.f23559f.N(true);
            View currentView = xnVar.f39506q1.getCurrentView();
            if (xnVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof zn) {
                ((zn) currentView).f40196a.Jc(xnVar.f39560u3);
            }
            xnVar.Hc();
            xnVar.f39350d2.e(true, true);
            xnVar.Lb(true);
            z10 = true;
        } else {
            xnVar.f39560u3 = null;
            hk hkVar = xnVar.f39494p1;
            if (hkVar != null) {
                hkVar.b(false);
                xnVar.Hc();
            }
            hk hkVar2 = xnVar.f39494p1;
            if (hkVar2 != null && hkVar2.f28524a.getCurrentPosition() != 0) {
                xnVar.f39494p1.f28524a.d(0, 0);
            }
        }
        hk hkVar3 = xnVar.f39494p1;
        if (hkVar3 != null) {
            hkVar3.b(z10);
        }
        MediaDataController mediaDataController = xnVar.getMediaDataController();
        String str3 = xnVar.f39548t3;
        long j3 = xnVar.T5;
        long j10 = xnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, xnVar.f39352d4, xnVar.f39484o3, xnVar.f39496p3, xnVar.f39508q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        xn xnVar = this.h;
        le.c cVar = xnVar.f39633zc;
        if (xnVar.f39560u3 == null) {
            xnVar.Lb(false);
        }
        xnVar.L7();
        if (xnVar.f39473n3) {
            gg.k1 adapter = xnVar.I1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, xnVar.f39563u6, true, true);
        } else if (xnVar.f39484o3 == null && xnVar.f39496p3 == null && xnVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            xnVar.T2.callOnClick();
        }
        if (xnVar.f39560u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != cVar.f13963f) {
                if (z10) {
                    xnVar.M7();
                }
                cVar.a(z10, true);
                ci.i1 i1Var = xnVar.f39506q1;
                if (i1Var != null) {
                    i1Var.D(0);
                }
                if (z10) {
                    xnVar.Lb(true);
                }
                xnVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f39560u3 == null) {
            return true;
        }
        return false;
    }
}
