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
public final class on extends org.telegram.ui.ActionBar.e5 {
    public float f36269f;
    public final wn h;

    public on(wn wnVar) {
        this.h = wnVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f39658u3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        wn wnVar;
        wn wnVar2 = this.h;
        if (!wnVar2.f39731zc.f14201f) {
            if (wnVar2.f39658u3 != null && wnVar2.f39592p1 != null) {
                View currentView = wnVar2.f39604q1.getCurrentView();
                if (currentView instanceof yn) {
                    wnVar = ((yn) currentView).f40192a;
                } else {
                    wnVar = wnVar2;
                }
                if (!wnVar.xc.f14201f) {
                    wnVar.Lb(true);
                    return false;
                }
                int currentPosition = wnVar2.f39592p1.f29162a.getCurrentPosition();
                int i10 = wnVar2.f39617r1;
                if (currentPosition != i10) {
                    wnVar2.f39592p1.f29162a.d(i10, i10);
                    return false;
                }
            } else if (wnVar2.xc.f14201f) {
                wnVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f39571n3;
    }

    @Override
    public final void k() {
        int i10;
        wn wnVar = this.h;
        wnVar.L7();
        if (wnVar.f39582o3 == null && wnVar.f39594p3 == null) {
            if (wnVar.f39571n3) {
                wnVar.I1.getAdapter().U(null, 0, null, false, true);
                wnVar.f39571n3 = false;
                wnVar.f39519j0.H("", true);
            }
            org.telegram.ui.ActionBar.u0 u0Var = wnVar.f39519j0;
            if (wnVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var.setSearchFieldHint(LocaleController.getString(i10));
            wnVar.S2.setVisibility(0);
            ImageView imageView = wnVar.T2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            wnVar.f39582o3 = null;
            wnVar.f39594p3 = null;
            return;
        }
        ImageView imageView2 = wnVar.T2;
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
        wn wnVar = this.h;
        wnVar.f39633s3 = false;
        wnVar.vc();
        wnVar.Ic();
        ImageView imageView = wnVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = wnVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (wnVar.f39571n3) {
            wnVar.I1.getAdapter().U(null, 0, null, false, true);
            wnVar.f39571n3 = false;
        }
        wnVar.I1.setReversed(false);
        wnVar.I1.getAdapter().f9808k0 = false;
        wnVar.m7();
        wnVar.f39582o3 = null;
        wnVar.f39594p3 = null;
        wnVar.f39658u3 = null;
        org.telegram.ui.ActionBar.u0 u0Var = wnVar.f39519j0;
        if (wnVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        u0Var.setSearchFieldHint(LocaleController.getString(i10));
        wnVar.f39519j0.setSearchFieldCaption(null);
        wnVar.f39718yc.a(false, true);
        wnVar.f39731zc.a(false, true);
        org.telegram.ui.ActionBar.x xVar = wnVar.f39506i0;
        if (xVar != null && xVar.f19914o != null) {
            org.telegram.ui.ActionBar.u0 u0Var2 = wnVar.f39494h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = wnVar.f39506i0;
            if (xVar2 != null) {
                xVar2.f(0);
                wn.J3(wnVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = wnVar.f39459e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            bs bsVar = wnVar.f39446d0;
            if (bsVar != null) {
                bsVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = wnVar.m0;
            if (u0Var3 != null && wnVar.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = wnVar.f39568n0;
            if (xVar4 != null && wnVar.L9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = wnVar.f39531k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
        } else if (wnVar.Y.k0() && TextUtils.isEmpty(wnVar.Y.getSlowModeTimer()) && ((chat = wnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var5 = wnVar.f39494h0;
            if (u0Var5 != null) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = wnVar.f39506i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = wnVar.f39459e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            bs bsVar2 = wnVar.f39446d0;
            if (bsVar2 != null) {
                bsVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = wnVar.m0;
            if (u0Var6 != null && wnVar.K9) {
                u0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = wnVar.f39568n0;
            if (xVar7 != null && wnVar.L9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var7 = wnVar.f39531k0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var8 = wnVar.f39494h0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = wnVar.f39568n0;
            if (xVar8 != null && wnVar.L9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = wnVar.f39531k0;
            if (u0Var9 != null) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var10 = wnVar.m0;
            if (u0Var10 != null && wnVar.K9) {
                u0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = wnVar.f39506i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = wnVar.f39459e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            bs bsVar3 = wnVar.f39446d0;
            if (bsVar3 != null) {
                bsVar3.b(false);
            }
        }
        if (wnVar.f39604q1 != null) {
            if (wnVar.f39592p1.f29162a.getCurrentPosition() != 0) {
                wnVar.f39592p1.f29162a.d(0, 0);
                wnVar.f39631s1 = true;
            } else {
                wnVar.f39604q1.h.clear();
            }
        }
        int i13 = wnVar.R3;
        if (i13 == 3 || i13 == 8 || ((wnVar.f39450d4 == 0 && !UserObject.isReplyUser(wnVar.f39470f)) || ((messageObject = wnVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            wnVar.f39519j0.setVisibility(8);
        }
        wnVar.f39579o0 = false;
        wnVar.getMediaDataController().clearFoundMessageObjects();
        if (wnVar.O3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        gg.o1 o1Var = wnVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        wnVar.Ia();
        wnVar.hc(false);
        wnVar.yc(0, true);
        wnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36269f, 0.0f);
        ofFloat.addUpdateListener(new nn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.sr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wnVar.xc.a(false, true);
        wnVar.Hc();
        wnVar.f39606q3 = null;
        wnVar.Ic();
        wnVar.vc();
        vk vkVar = wnVar.f39580o1;
        if (vkVar != null) {
            vkVar.d.M(new fr(2));
            vkVar.h = 0L;
            wnVar.f39580o1.g(false);
        }
        hk hkVar = wnVar.f39592p1;
        if (hkVar != null) {
            hkVar.b(false);
        }
        wnVar.kb(false);
    }

    @Override
    public final void n() {
        hk hkVar;
        int i10;
        wn wnVar = this.h;
        boolean z10 = true;
        wnVar.f39633s3 = true;
        wnVar.vc();
        wnVar.Ic();
        if (((wnVar.f39450d4 != 0 && wnVar.R3 != 3) || UserObject.isReplyUser(wnVar.f39470f)) && !wnVar.f39445cc) {
            wnVar.la(null);
        }
        if (wnVar.W4) {
            wnVar.saveKeyboardPositionBeforeTransition();
            if (!wnVar.Oa) {
                Activity parentActivity = wnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new aj(this, 9), 500L);
            fj fjVar = wnVar.f39485g2;
            if (fjVar != null) {
                fjVar.b(true);
            }
            org.telegram.ui.Components.k40 k40Var = wnVar.f39508i2;
            if (k40Var != null) {
                k40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36269f, 1.0f);
        ofFloat.addUpdateListener(new nn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.sr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        vk vkVar = wnVar.f39580o1;
        if (vkVar != null) {
            vkVar.g((!wnVar.Oa && vkVar.a() && wnVar.f39658u3 == null) ? false : false);
        }
        if (wnVar.f39658u3 != null && (hkVar = wnVar.f39592p1) != null) {
            int currentPosition = hkVar.f29162a.getCurrentPosition();
            int i11 = wnVar.f39617r1;
            if (currentPosition != i11) {
                wnVar.f39592p1.f29162a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(gg.q0 q0Var) {
        wn wnVar = this.h;
        vk vkVar = wnVar.f39580o1;
        if (vkVar != null) {
            vkVar.d.M(new fr(2));
            vkVar.h = 0L;
        }
        wnVar.f39606q3 = null;
        wnVar.Ic();
        wnVar.vc();
        wnVar.kb(false);
    }

    @Override
    public final void p(ci.h2 h2Var) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        wn wnVar = this.h;
        boolean z10 = false;
        wnVar.Fc(0, 0, -1);
        if (h2Var != null) {
            str = h2Var.getText().toString();
        } else {
            str = wnVar.f39646t3;
        }
        wnVar.f39646t3 = str;
        if (!TextUtils.isEmpty(str) && (wnVar.f39646t3.startsWith("$") || wnVar.f39646t3.startsWith("#"))) {
            wnVar.M7();
            if (wnVar.f39646t3.contains("@")) {
                String str2 = wnVar.f39646t3;
                d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                wnVar.presentFragment(new org.telegram.ui.Components.d40(str2, d6Var));
                return;
            }
            if (wnVar.f39658u3 == null) {
                wnVar.f39658u3 = wnVar.f39646t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36269f, 1.0f);
                ofFloat.addUpdateListener(new nn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.sr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                vk vkVar = wnVar.f39580o1;
                if (vkVar != null) {
                    if (!wnVar.Oa && vkVar.a() && wnVar.f39658u3 == null) {
                        z10 = true;
                    }
                    vkVar.g(z10);
                }
            }
            wnVar.f39658u3 = wnVar.f39646t3;
            wnVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(wnVar.f39658u3);
            wnVar.f39644t1.f24137f.N(true);
            View currentView = wnVar.f39604q1.getCurrentView();
            if (wnVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof yn) {
                ((yn) currentView).f40192a.Jc(wnVar.f39658u3);
            }
            wnVar.Hc();
            wnVar.f39448d2.e(true, true);
            wnVar.Lb(true);
            z10 = true;
        } else {
            wnVar.f39658u3 = null;
            hk hkVar = wnVar.f39592p1;
            if (hkVar != null) {
                hkVar.b(false);
                wnVar.Hc();
            }
            hk hkVar2 = wnVar.f39592p1;
            if (hkVar2 != null && hkVar2.f29162a.getCurrentPosition() != 0) {
                wnVar.f39592p1.f29162a.d(0, 0);
            }
        }
        hk hkVar3 = wnVar.f39592p1;
        if (hkVar3 != null) {
            hkVar3.b(z10);
        }
        MediaDataController mediaDataController = wnVar.getMediaDataController();
        String str3 = wnVar.f39646t3;
        long j3 = wnVar.T5;
        long j10 = wnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j3, j10, i10, 0, wnVar.f39450d4, wnVar.f39582o3, wnVar.f39594p3, wnVar.f39606q3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        wn wnVar = this.h;
        le.c cVar = wnVar.f39731zc;
        if (wnVar.f39658u3 == null) {
            wnVar.Lb(false);
        }
        wnVar.L7();
        if (wnVar.f39571n3) {
            gg.k1 adapter = wnVar.I1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, wnVar.f39661u6, true, true);
        } else if (wnVar.f39582o3 == null && wnVar.f39594p3 == null && wnVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            wnVar.T2.callOnClick();
        }
        if (wnVar.f39658u3 != null) {
            if (editText.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != cVar.f14201f) {
                if (z10) {
                    wnVar.M7();
                }
                cVar.a(z10, true);
                ci.i1 i1Var = wnVar.f39604q1;
                if (i1Var != null) {
                    i1Var.D(0);
                }
                if (z10) {
                    wnVar.Lb(true);
                }
                wnVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f39658u3 == null) {
            return true;
        }
        return false;
    }
}
