package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.td0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.dy0;
import org.telegram.ui.gu0;
import org.telegram.ui.lf;
import org.telegram.ui.ti0;
import qh.c5;
import qh.d5;
import qh.o7;
import qh.q9;
import wh.g4;
import wh.i4;
public final class o implements View.OnClickListener {
    public final int f32219a;
    public final Object f32220b;

    public o(Object obj, int i10) {
        this.f32219a = i10;
        this.f32220b = obj;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i10;
        int i11;
        wh.a aVar;
        g4 g4Var;
        switch (this.f32219a) {
            case 0:
                u uVar = (u) this.f32220b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.K.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 1:
                v0 v0Var = (v0) this.f32220b;
                if (!v0Var.f32413a) {
                    if (v0Var.f32422x == 0 && v0Var.f32423y) {
                        ((Activity) v0Var.getContext()).startActivityForResult(((MediaProjectionManager) v0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        v0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 2:
                bi1 bi1Var = (bi1) this.f32220b;
                if (!bi1Var.f31970a) {
                    if (bi1Var.f31978w == 0) {
                        ((Activity) bi1Var.getContext()).startActivityForResult(((MediaProjectionManager) bi1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        bi1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 3:
                Context context = (Context) this.f32220b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    h1.j();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f32220b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                l.d.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 5:
                ((org.telegram.ui.web.s0) this.f32220b).run();
                return;
            case 6:
                qh.k kVar2 = (qh.k) this.f32220b;
                qh.f fVar = kVar2.f45574f;
                fVar.d();
                fVar.k(true);
                qh.e eVar = kVar2.W;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 7:
                ((q9) this.f32220b).B();
                return;
            case 8:
                qh.n0.a((qh.n0) this.f32220b);
                return;
            case 9:
                ((gu0) this.f32220b).run();
                return;
            case 10:
                d5 d5Var = ((c5) this.f32220b).f45179x;
                if (d5Var.f45232r && (callback = d5Var.f45230f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 11:
                o7 o7Var = (o7) ((td0) this.f32220b).h;
                if (o7Var != null) {
                    o7Var.run();
                    return;
                }
                return;
            case 12:
                ((lf) this.f32220b).run();
                return;
            case 13:
                ((lf) this.f32220b).run();
                return;
            case 14:
                ChatActivityEnterView.h(((qd) ((sh.l0) this.f32220b).d).f30388a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 15:
                ((dy0) this.f32220b).run();
                return;
            case 16:
                th.n nVar = (th.n) this.f32220b;
                TLRPC.Chat chat = nVar.E;
                if (chat != null && !chat.title.equals(((mh.m) nVar.f48193n.f45811b).getText().toString())) {
                    nVar.getMessagesController().changeChatTitle(nVar.E.f20845id, ((mh.m) nVar.f48193n.f45811b).getText().toString(), new th.i(nVar, 1));
                }
                TLRPC.Chat chat2 = nVar.E;
                if (chat2 != null && nVar.h != nVar.f48192f) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    nVar.E.default_banned_rights.manage_linked_peers = !nVar.h;
                    nVar.getMessagesController().setDefaultBannedRole(nVar.f48189b, nVar.E.default_banned_rights, false, nVar);
                }
                nVar.finishFragment();
                return;
            case 17:
                ((th.c0) this.f32220b).h.d.D(0);
                return;
            case 18:
                th.i0.x(((th.d0) this.f32220b).f48144r);
                return;
            case 19:
                uf.k kVar3 = (uf.k) this.f32220b;
                MessagesController.getInstance(kVar3.C).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                kVar3.l();
                return;
            case 20:
                ((uf.p) this.f32220b).run();
                return;
            case 21:
                ((uf.h0) this.f32220b).K();
                return;
            case 22:
                uf.m1 m1Var = (uf.m1) this.f32220b;
                LongSparseArray longSparseArray = m1Var.f48685n;
                r3 r3Var = (r3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                if (stickerSet != null && m1Var.h.indexOfKey(stickerSet.set.f20872id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f20872id) < 0) {
                    if (r3Var.f23551r) {
                        longSparseArray.put(stickerSet.set.f20872id, stickerSet);
                        m1Var.f48683e.f30644a.h(r3Var.getStickerSet());
                        return;
                    }
                    m1Var.F(stickerSet, r3Var);
                    return;
                }
                return;
            case 23:
                vf.e eVar2 = (vf.e) this.f32220b;
                k6 k6Var = eVar2.f49062f;
                int i12 = eVar2.f49058a;
                boolean z4 = eVar2.f49064r;
                eVar2.f49064r = !z4;
                dq dqVar = eVar2.h;
                if (!z4) {
                    i10 = R.string.BizBotStart;
                } else {
                    i10 = R.string.BizBotStop;
                }
                dqVar.c(LocaleController.getString(i10), true, true);
                k6Var.a();
                if (eVar2.f49064r) {
                    i11 = R.string.BizBotStatusStopped;
                } else {
                    i11 = R.string.BizBotStatusManages;
                }
                k6Var.c(LocaleController.getString(i11), true, true);
                if (eVar2.f49064r) {
                    eVar2.f49066w |= 1;
                } else {
                    eVar2.f49066w &= -2;
                }
                MessagesController.getNotificationsSettings(i12).edit().putInt("dialog_botflags" + eVar2.f49065s, eVar2.f49066w).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = MessagesController.getInstance(i12).getInputPeer(eVar2.f49065s);
                toggleconnectedbotpaused.paused = eVar2.f49064r;
                ConnectionsManager.getInstance(i12).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 24:
                TL_account.TL_businessChatLink tL_businessChatLink = ((vf.o) this.f32220b).f49192f;
                if (tL_businessChatLink != null) {
                    AndroidUtilities.addToClipboard(tL_businessChatLink.link);
                    qc.a0(LaunchActivity.R()).k(false).j();
                    return;
                }
                return;
            case 25:
                ((vh.b) this.f32220b).dismiss();
                return;
            case 26:
                wh.q qVar = (wh.q) this.f32220b;
                qVar.H(0, true, 0, false, 0L);
                ti0 ti0Var = qVar.L;
                if (ti0Var != null) {
                    ti0Var.h(true);
                    qVar.L = null;
                    return;
                }
                return;
            case 27:
                wh.r0 r0Var = (wh.r0) this.f32220b;
                wh.z2 z2Var = r0Var.h;
                if (z2Var != null && (aVar = r0Var.f50001f) != null) {
                    wh.r3 r3Var2 = z2Var.f50254a;
                    r3Var2.getClass();
                    if (wh.r3.w3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f49653b;
                        wh.d2 d2Var = r3Var2.G3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        r3Var2.V2.N(true);
                        wh.d2 d2Var2 = r3Var2.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                i4 i4Var = (i4) this.f32220b;
                wh.a aVar2 = i4Var.f50211a;
                if (aVar2 != null && (g4Var = i4Var.D) != null) {
                    ((wh.n3) g4Var).f49926a.f50016e3.n(aVar2);
                    return;
                }
                return;
        }
    }
}
