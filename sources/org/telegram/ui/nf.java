package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f39895a;
    public final un f39896b;

    public nf(un unVar, int i10) {
        this.f39895a = i10;
        this.f39896b = unVar;
    }

    @Override
    public final void run() {
        mk mkVar;
        View sendButton;
        int i10 = this.f39895a;
        un unVar = this.f39896b;
        switch (i10) {
            case 0:
                unVar.M7(true);
                return;
            case 1:
                unVar.Tc();
                return;
            case 2:
                unVar.M7(false);
                kg.i1 i1Var = new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 24, true);
                i1Var.f21609o0 = false;
                i1Var.H0 = new qe(unVar, 2);
                i1Var.show();
                return;
            case 3:
                un.x0(unVar);
                return;
            case 4:
                if (unVar.getUserConfig().q()) {
                    unVar.f42101ic = null;
                    unVar.qd(true);
                    org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
                    unVar.getMessagesController().o0(true);
                    return;
                }
                unVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 3, true));
                return;
            case 5:
                mk mkVar2 = unVar.Z;
                if (mkVar2 != null) {
                    mkVar2.m0(true);
                    return;
                }
                return;
            case 6:
                org.telegram.messenger.i0.E2(unVar.Y0);
                return;
            case 7:
                un.z0(unVar);
                return;
            case 8:
                unVar.resumeDelayedFragmentAnimation();
                ci ciVar = unVar.f42186pa;
                org.telegram.messenger.i0.r(ciVar);
                ciVar.run();
                unVar.getNotificationCenter().o();
                return;
            case 9:
                unVar.Ja = null;
                unVar.Ia = -1;
                View view = unVar.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 10:
                ArrayList arrayList = unVar.K6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = ((org.telegram.messenger.kj) arrayList.get(i11)).f16690k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                unVar.B6 = 0;
                unVar.getMessagesController().l3(unVar.f42108j6, unVar.b());
                unVar.C6 = true;
                unVar.ic(false);
                org.telegram.ui.ActionBar.k1 k1Var = unVar.f42051e9;
                if (k1Var != null) {
                    k1Var.dismiss();
                    return;
                }
                return;
            case 11:
                ArrayList arrayList2 = unVar.K6;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    ((org.telegram.messenger.kj) arrayList2.get(i12)).h5();
                }
                unVar.f42304z1 = 0;
                unVar.ad(true);
                unVar.getMessagesController().q3(unVar.f42108j6, unVar.b());
                org.telegram.ui.ActionBar.k1 k1Var2 = unVar.f42051e9;
                if (k1Var2 != null) {
                    k1Var2.dismiss();
                    return;
                }
                return;
            case 12:
                ArrayList arrayList3 = unVar.K6;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    TLRPC.Message message2 = ((org.telegram.messenger.kj) arrayList3.get(i13)).f16690k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                unVar.A1 = 0;
                unVar.Zc(true);
                unVar.getMessagesController().p3(unVar.f42108j6, unVar.b());
                org.telegram.ui.ActionBar.k1 k1Var3 = unVar.f42051e9;
                if (k1Var3 != null) {
                    k1Var3.dismiss();
                    return;
                }
                return;
            case 13:
                un.B1(unVar);
                return;
            case 14:
                unVar.Z.F0();
                return;
            case 15:
                unVar.zc(true);
                unVar.pd(true);
                org.telegram.ui.Components.cc.z(unVar, 4, 0, unVar.f42288xa).j();
                return;
            case 16:
                org.telegram.ui.Components.cc.a0(unVar).I(2131623981, org.telegram.messenger.dd.L0(2131753290, null), org.telegram.messenger.dd.L0(2131753291, null)).j();
                return;
            case 17:
                unVar.finishFragment();
                return;
            case 18:
                org.telegram.messenger.i0.E2(unVar.X0);
                return;
            case 19:
                unVar.O4 = null;
                unVar.F9();
                unVar.H9();
                return;
            case 20:
                unVar.H9 = false;
                unVar.w9(true);
                return;
            case 21:
                unVar.W5 = null;
                unVar.w8();
                return;
            case 22:
                unVar.W5 = null;
                unVar.w8();
                return;
            case 23:
                unVar.e7();
                return;
            case 24:
                unVar.G7 = null;
                org.telegram.ui.Components.j50 j50Var = unVar.f42181p3;
                if (j50Var != null) {
                    org.telegram.ui.Components.g50 cameraContainer = j50Var.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(unVar.f42181p3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(unVar.f42181p3.getPaint(), org.telegram.ui.Components.i6.f27007b, 0), ObjectAnimator.ofFloat(unVar.f42181p3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new bi(unVar, 1));
                    animatorSet.start();
                    return;
                }
                return;
            case 25:
                pk pkVar = unVar.H8;
                if (pkVar != null && pkVar.getParent() != null) {
                    unVar.f42303z0.g1();
                    unVar.J8.setDrawingReady(false);
                    unVar.H8.setTag(null);
                    unVar.l1.removeView(unVar.H8);
                    return;
                }
                return;
            case 26:
                unVar.Gc(false);
                return;
            case 27:
                unVar.s8(false, true, 0.0f);
                return;
            case 28:
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && (mkVar = unVar.Z) != null && (sendButton = mkVar.getSendButton()) != null && unVar.Z.getEditField() != null && unVar.Z.getEditField().getText().length() >= 5) {
                    int i14 = org.telegram.messenger.uz.f18500a;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    org.telegram.messenger.uz.L = System.currentTimeMillis();
                    int i15 = org.telegram.messenger.uz.K + 1;
                    org.telegram.messenger.uz.K = i15;
                    edit.putInt("scheduledOrNoSoundHintShows", i15);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.uz.L);
                    edit.apply();
                    if (unVar.f42242u2 == null) {
                        ij ijVar = new ij(4, 0, unVar.getParentActivity(), unVar.f42288xa, false);
                        unVar.f42242u2 = ijVar;
                        ijVar.a();
                        unVar.f42242u2.setAlpha(0.0f);
                        unVar.f42242u2.setVisibility(4);
                        unVar.f42242u2.setText(org.telegram.messenger.dd.L0(2131745864, null));
                        unVar.l1.addView(unVar.f42242u2, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    unVar.f42242u2.f(sendButton, true);
                    unVar.f42254v2 = true;
                    return;
                }
                return;
            default:
                mk mkVar3 = unVar.Z;
                if (mkVar3 != null && unVar.Zc != null) {
                    if (mkVar3.q0()) {
                        unVar.Z.i0(false);
                        org.telegram.messenger.i0.J3(unVar.Zc.f8524a);
                        ((fe.b) unVar.Zc.f8525b.f8522b).a(false, true);
                        return;
                    }
                    unVar.Z.T0(false, false, false);
                    unVar.Z.q1();
                    ((fe.b) unVar.Zc.f8525b.f8522b).a(true, true);
                    return;
                }
                return;
        }
    }
}
