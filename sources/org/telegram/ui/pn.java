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
public final class pn extends org.telegram.ui.ActionBar.h5 {
    public float f37378f;
    public final xn h;

    public pn(xn xnVar) {
        this.h = xnVar;
    }

    @Override
    public final boolean a() {
        if (this.h.f40161r3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        xn xnVar;
        xn xnVar2 = this.h;
        if (!xnVar2.f40246xc.f46893f) {
            if (xnVar2.f40161r3 != null && xnVar2.f40096m1 != null) {
                View currentView = xnVar2.f40109n1.getCurrentView();
                if (currentView instanceof zn) {
                    xnVar = ((zn) currentView).f40837a;
                } else {
                    xnVar = xnVar2;
                }
                if (!xnVar.f40218vc.f46893f) {
                    xnVar.Lb(true);
                    return false;
                }
                int currentPosition = xnVar2.f40096m1.f27959a.getCurrentPosition();
                int i10 = xnVar2.f40121o1;
                if (currentPosition != i10) {
                    xnVar2.f40096m1.f27959a.d(i10, i10);
                    return false;
                }
            } else if (xnVar2.f40218vc.f46893f) {
                xnVar2.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f() {
        return this.h.f40074k3;
    }

    @Override
    public final void k() {
        int i10;
        xn xnVar = this.h;
        xnVar.L7();
        if (xnVar.f40086l3 == null && xnVar.f40098m3 == null) {
            if (xnVar.f40074k3) {
                xnVar.F1.getAdapter().U(null, 0, null, false, true);
                xnVar.f40074k3 = false;
                xnVar.f40022g0.H("", true);
            }
            org.telegram.ui.ActionBar.w0 w0Var = xnVar.f40022g0;
            if (xnVar.E9()) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
            xnVar.P2.setVisibility(0);
            ImageView imageView = xnVar.Q2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            xnVar.f40086l3 = null;
            xnVar.f40098m3 = null;
            return;
        }
        ImageView imageView2 = xnVar.Q2;
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
        xnVar.f40135p3 = false;
        xnVar.vc();
        xnVar.Ic();
        ImageView imageView = xnVar.P2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = xnVar.Q2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (xnVar.f40074k3) {
            xnVar.F1.getAdapter().U(null, 0, null, false, true);
            xnVar.f40074k3 = false;
        }
        xnVar.F1.setReversed(false);
        xnVar.F1.getAdapter().f44846h0 = false;
        xnVar.m7();
        xnVar.f40086l3 = null;
        xnVar.f40098m3 = null;
        xnVar.f40161r3 = null;
        org.telegram.ui.ActionBar.w0 w0Var = xnVar.f40022g0;
        if (xnVar.E9()) {
            i10 = R.string.SavedTagSearchHint;
        } else {
            i10 = R.string.Search;
        }
        w0Var.setSearchFieldHint(LocaleController.getString(i10));
        xnVar.f40022g0.setSearchFieldCaption(null);
        xnVar.f40232wc.a(false, true);
        xnVar.f40246xc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = xnVar.f40010f0;
        if (yVar != null && yVar.f20744o != null) {
            org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.f39997e0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = xnVar.f40010f0;
            if (yVar2 != null) {
                yVar2.f(0);
                xn.J3(xnVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = xnVar.f39958b0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            cs csVar = xnVar.f39945a0;
            if (csVar != null) {
                csVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = xnVar.f40059j0;
            if (w0Var3 != null && xnVar.H9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = xnVar.f40071k0;
            if (yVar4 != null && xnVar.I9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = xnVar.f40035h0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
        } else if (xnVar.V.k0() && TextUtils.isEmpty(xnVar.V.getSlowModeTimer()) && ((chat = xnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var5 = xnVar.f39997e0;
            if (w0Var5 != null) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = xnVar.f40010f0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = xnVar.f39958b0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            cs csVar2 = xnVar.f39945a0;
            if (csVar2 != null) {
                csVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = xnVar.f40059j0;
            if (w0Var6 != null && xnVar.H9) {
                w0Var6.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = xnVar.f40071k0;
            if (yVar7 != null && xnVar.I9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var7 = xnVar.f40035h0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var8 = xnVar.f39997e0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = xnVar.f40071k0;
            if (yVar8 != null && xnVar.I9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = xnVar.f40035h0;
            if (w0Var9 != null) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var10 = xnVar.f40059j0;
            if (w0Var10 != null && xnVar.H9) {
                w0Var10.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = xnVar.f40010f0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = xnVar.f39958b0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            cs csVar3 = xnVar.f39945a0;
            if (csVar3 != null) {
                csVar3.b(false);
            }
        }
        if (xnVar.f40109n1 != null) {
            if (xnVar.f40096m1.f27959a.getCurrentPosition() != 0) {
                xnVar.f40096m1.f27959a.d(0, 0);
                xnVar.f40133p1 = true;
            } else {
                xnVar.f40109n1.h.clear();
            }
        }
        int i13 = xnVar.O3;
        if (i13 == 3 || i13 == 8 || ((xnVar.f39948a4 == 0 && !UserObject.isReplyUser(xnVar.f40009f)) || ((messageObject = xnVar.U3) != null && messageObject.getRepliesCount() < 10))) {
            xnVar.f40022g0.setVisibility(8);
        }
        xnVar.f40084l0 = false;
        xnVar.getMediaDataController().clearFoundMessageObjects();
        if (xnVar.L3 == 3) {
            i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i12).clearSearchResults(3);
        } else {
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults();
        }
        tf.y0 y0Var = xnVar.J3;
        if (y0Var != null) {
            y0Var.l();
        }
        xnVar.Ia();
        xnVar.hc(false);
        xnVar.yc(0, true);
        xnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37378f, 0.0f);
        ofFloat.addUpdateListener(new on(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        xnVar.f40218vc.a(false, true);
        xnVar.Hc();
        xnVar.f40111n3 = null;
        xnVar.Ic();
        xnVar.vc();
        vk vkVar = xnVar.l1;
        if (vkVar != null) {
            vkVar.d.M(new fr(2));
            vkVar.h = 0L;
            xnVar.l1.g(false);
        }
        hk hkVar = xnVar.f40096m1;
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
        boolean z4 = true;
        xnVar.f40135p3 = true;
        xnVar.vc();
        xnVar.Ic();
        if (((xnVar.f39948a4 != 0 && xnVar.O3 != 3) || UserObject.isReplyUser(xnVar.f40009f)) && !xnVar.f39956ac) {
            xnVar.la(null);
        }
        if (xnVar.T4) {
            xnVar.saveKeyboardPositionBeforeTransition();
            if (!xnVar.La) {
                Activity parentActivity = xnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new zi(this, 9), 500L);
            ej ejVar = xnVar.f39986d2;
            if (ejVar != null) {
                ejVar.b(true);
            }
            org.telegram.ui.Components.k40 k40Var = xnVar.f40012f2;
            if (k40Var != null) {
                k40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37378f, 1.0f);
        ofFloat.addUpdateListener(new on(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        vk vkVar = xnVar.l1;
        if (vkVar != null) {
            vkVar.g((!xnVar.La && vkVar.a() && xnVar.f40161r3 == null) ? false : false);
        }
        if (xnVar.f40161r3 != null && (hkVar = xnVar.f40096m1) != null) {
            int currentPosition = hkVar.f27959a.getCurrentPosition();
            int i11 = xnVar.f40121o1;
            if (currentPosition != i11) {
                xnVar.f40096m1.f27959a.d(i11, i11);
            }
        }
    }

    @Override
    public final void o(tf.e0 e0Var) {
        xn xnVar = this.h;
        vk vkVar = xnVar.l1;
        if (vkVar != null) {
            vkVar.d.M(new fr(2));
            vkVar.h = 0L;
        }
        xnVar.f40111n3 = null;
        xnVar.Ic();
        xnVar.vc();
        xnVar.kb(false);
    }

    @Override
    public final void p(kg.f fVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        xn xnVar = this.h;
        boolean z4 = false;
        xnVar.Fc(0, 0, -1);
        if (fVar != null) {
            str = fVar.getText().toString();
        } else {
            str = xnVar.f40148q3;
        }
        xnVar.f40148q3 = str;
        if (!TextUtils.isEmpty(str) && (xnVar.f40148q3.startsWith("$") || xnVar.f40148q3.startsWith("#"))) {
            xnVar.M7();
            if (xnVar.f40148q3.contains("@")) {
                String str2 = xnVar.f40148q3;
                f6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
                xnVar.presentFragment(new org.telegram.ui.Components.d40(str2, f6Var));
                return;
            }
            if (xnVar.f40161r3 == null) {
                xnVar.f40161r3 = xnVar.f40148q3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37378f, 1.0f);
                ofFloat.addUpdateListener(new on(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                vk vkVar = xnVar.l1;
                if (vkVar != null) {
                    if (!xnVar.La && vkVar.a() && xnVar.f40161r3 == null) {
                        z4 = true;
                    }
                    vkVar.g(z4);
                }
            }
            xnVar.f40161r3 = xnVar.f40148q3;
            xnVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(xnVar.f40161r3);
            xnVar.f40146q1.f24776f.N(true);
            View currentView = xnVar.f40109n1.getCurrentView();
            if (xnVar.L3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof zn) {
                ((zn) currentView).f40837a.Jc(xnVar.f40161r3);
            }
            xnVar.Hc();
            xnVar.a2.e(true, true);
            xnVar.Lb(true);
            z4 = true;
        } else {
            xnVar.f40161r3 = null;
            hk hkVar = xnVar.f40096m1;
            if (hkVar != null) {
                hkVar.b(false);
                xnVar.Hc();
            }
            hk hkVar2 = xnVar.f40096m1;
            if (hkVar2 != null && hkVar2.f27959a.getCurrentPosition() != 0) {
                xnVar.f40096m1.f27959a.d(0, 0);
            }
        }
        hk hkVar3 = xnVar.f40096m1;
        if (hkVar3 != null) {
            hkVar3.b(z4);
        }
        MediaDataController mediaDataController = xnVar.getMediaDataController();
        String str3 = xnVar.f40148q3;
        long j10 = xnVar.Q5;
        long j11 = xnVar.I6;
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        mediaDataController.searchMessagesInChat(str3, j10, j11, i10, 0, xnVar.f39948a4, xnVar.f40086l3, xnVar.f40098m3, xnVar.f40111n3);
    }

    @Override
    public final void q(EditText editText) {
        boolean z4;
        xn xnVar = this.h;
        xd.a aVar = xnVar.f40246xc;
        if (xnVar.f40161r3 == null) {
            xnVar.Lb(false);
        }
        xnVar.L7();
        if (xnVar.f40074k3) {
            tf.u0 adapter = xnVar.F1.getAdapter();
            adapter.U("@" + editText.getText().toString(), 0, xnVar.f40164r6, true, true);
        } else if (xnVar.f40086l3 == null && xnVar.f40098m3 == null && xnVar.Q2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            xnVar.Q2.callOnClick();
        }
        if (xnVar.f40161r3 != null) {
            if (editText.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 != aVar.f46893f) {
                if (z4) {
                    xnVar.M7();
                }
                aVar.a(z4, true);
                ek ekVar = xnVar.f40109n1;
                if (ekVar != null) {
                    ekVar.D(0);
                }
                if (z4) {
                    xnVar.Lb(true);
                }
                xnVar.hc(false);
            }
        }
    }

    @Override
    public final boolean r() {
        if (this.h.f40161r3 == null) {
            return true;
        }
        return false;
    }
}
