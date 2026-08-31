package org.telegram.ui;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class mp implements Runnable {
    public final int f39189a;
    public final Object f39190b;
    public final Object f39191c;

    public mp(int i10, Object obj, Object obj2) {
        this.f39189a = i10;
        this.f39190b = obj;
        this.f39191c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f39189a) {
            case 0:
                ((np) this.f39190b).f39500x.d.M = false;
                ((org.telegram.ui.Components.l80) this.f39191c).run();
                return;
            case 1:
                ((np) this.f39190b).f39500x.d.L = false;
                ((org.telegram.ui.Components.m80) this.f39191c).run();
                return;
            case 2:
                rp rpVar = ((np) this.f39190b).f39500x.d;
                rpVar.L = false;
                rpVar.M = false;
                ((Runnable) this.f39191c).run();
                return;
            case 3:
                np npVar = (np) this.f39190b;
                npVar.getClass();
                ((TLRPC.Chat) this.f39191c).join_request = true;
                npVar.h = true;
                npVar.f29426c.setChecked(true);
                return;
            case 4:
                qr qrVar = (qr) this.f39190b;
                qrVar.getClass();
                qrVar.getMessagesController().loadFullChat(((TLRPC.Updates) this.f39191c).chats.get(0).f20843id, 0, true);
                return;
            case 5:
                TLRPC.User user = (TLRPC.User) this.f39191c;
                qr qrVar2 = ((fr) this.f39190b).f37007a;
                if (org.telegram.ui.Components.qc.a(qrVar2)) {
                    org.telegram.ui.Components.qc.C(qrVar2, user.first_name).j();
                    return;
                }
                return;
            case 6:
                ((org.telegram.ui.Components.f0) this.f39190b).f26704r0.unsave((TL_aicompose.TL_aiComposeTone) this.f39191c);
                return;
            case 7:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.f39190b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f39191c;
                rVar.getClass();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    rVar.dismiss();
                    return;
                }
                return;
            case 8:
                xy0 xy0Var = (xy0) this.f39191c;
                if (((boolean[]) this.f39190b)[0]) {
                    xy0Var.run();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f39190b;
                TLObject tLObject = (TLObject) this.f39191c;
                v9Var.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    v9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) this.f39190b;
                CharSequence charSequence = (CharSequence) this.f39191c;
                icVar.f27749n = true;
                org.telegram.ui.Components.nb nbVar = icVar.f27741e;
                if (nbVar instanceof org.telegram.ui.Components.ob) {
                    org.telegram.ui.Components.pb pbVar = (org.telegram.ui.Components.pb) ((org.telegram.ui.Components.ob) nbVar);
                    pbVar.f30359b.setText(charSequence);
                    AndroidUtilities.updateViewShow(pbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(pbVar.f30359b, true, false, true);
                }
                icVar.i(true);
                return;
            case 11:
                boolean[] zArr = (boolean[]) this.f39190b;
                Runnable runnable = (Runnable) this.f39191c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.bd) this.f39190b).removeView((qh.f3) this.f39191c);
                return;
            case 13:
                int i10 = ChatActivityEnterView.f24568j5;
                ((ChatActivityEnterView) this.f39190b).removeView((qh.f3) this.f39191c);
                return;
            case 14:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f39190b;
                int i11 = ChatActivityEnterView.f24568j5;
                chatActivityEnterView.setFieldText((CharSequence) this.f39191c);
                chatActivityEnterView.T = null;
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f39190b;
                int i12 = ChatActivityEnterView.f24568j5;
                ((org.telegram.ui.Components.id) this.f39191c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.N, chatActivityEnterView2.M2, true);
                return;
            case 16:
                org.telegram.ui.Components.fg fgVar = (org.telegram.ui.Components.fg) this.f39191c;
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.ig) this.f39190b).S;
                chatActivityEnterView3.f24603f1 = chatActivityEnterView3.f24596e1.getAudioRightMs() - chatActivityEnterView3.f24596e1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f24596e1.getAudioLeftMs(), chatActivityEnterView3.f24596e1.getAudioRightMs(), fgVar);
                return;
            case 17:
                ((org.telegram.ui.Components.mi) this.f39190b).containerView.removeView((qh.f3) this.f39191c);
                return;
            case 18:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f39191c;
                ((org.telegram.ui.Components.mi) this.f39190b).dismiss(true);
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.mi miVar = (org.telegram.ui.Components.mi) this.f39190b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.fi) this.f39191c).f26924c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                miVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(miVar.G1).updateAttachMenuBotsInCache();
                return;
            case 20:
                org.telegram.ui.Components.mi miVar2 = (org.telegram.ui.Components.mi) this.f39190b;
                MediaDataController.getInstance(miVar2.G1).loadAttachMenuBots(false, true);
                if (miVar2.f29100v0 == miVar2.f29097u0.get(((TLRPC.TL_attachMenuBot) this.f39191c).bot_id)) {
                    miVar2.Q1(miVar2.f29054g0);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.xi xiVar = (org.telegram.ui.Components.xi) this.f39190b;
                xiVar.E = false;
                xiVar.F = (ArrayList) this.f39191c;
                xiVar.P();
                return;
            case 22:
                org.telegram.ui.Components.xi xiVar2 = (org.telegram.ui.Components.xi) this.f39190b;
                ((org.telegram.ui.Components.mi) this.f39191c).Z0();
                xiVar2.K();
                xiVar2.f26546b.X1(xiVar2, 0);
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new mp(24, (org.telegram.ui.Components.rj) this.f39190b, ((org.telegram.ui.Components.qj) this.f39191c).run()));
                return;
            case 24:
                ((org.telegram.ui.Components.rj) this.f39190b).setStatus((CharSequence) this.f39191c);
                return;
            case 25:
                org.telegram.ui.Components.ik ikVar = (org.telegram.ui.Components.ik) this.f39190b;
                String str = (String) this.f39191c;
                ikVar.getClass();
                ArrayList arrayList = new ArrayList(ikVar.U.v.f25617c);
                if (ikVar.U.v.d.isEmpty()) {
                    arrayList.addAll(0, ikVar.U.v.f25618e);
                }
                Utilities.searchQueue.postRunnable(new dg.t0(ikVar, str, !ikVar.O.isEmpty(), arrayList, 13));
                return;
            case 26:
                org.telegram.ui.Components.ik ikVar2 = (org.telegram.ui.Components.ik) this.f39190b;
                ArrayList arrayList2 = (ArrayList) this.f39191c;
                org.telegram.ui.Components.jk jkVar = ikVar2.U;
                boolean z4 = jkVar.V;
                org.telegram.ui.Components.xj xjVar = jkVar.f28143r;
                if (z4) {
                    f2.p0 adapter = xjVar.getAdapter();
                    org.telegram.ui.Components.ik ikVar3 = jkVar.f28147y;
                    if (adapter != ikVar3) {
                        xjVar.setAdapter(ikVar3);
                    }
                }
                ikVar2.f27847s = arrayList2;
                ikVar2.l();
                return;
            case 27:
                org.telegram.ui.Components.cl clVar = (org.telegram.ui.Components.cl) this.f39190b;
                float[] fArr = (float[]) this.f39191c;
                clVar.getClass();
                clVar.b0(fArr[0], fArr[1]);
                return;
            case 28:
                org.telegram.ui.Components.ei eiVar = (org.telegram.ui.Components.ei) this.f39191c;
                boolean z10 = ChatAttachAlertPhotoLayout.f24736n1;
                int currentItemTop = eiVar.getCurrentItemTop();
                int listTopPadding = eiVar.getListTopPadding();
                org.telegram.ui.Components.ql qlVar = ((ChatAttachAlertPhotoLayout) this.f39190b).B;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                qlVar.scrollBy(0, listTopPadding);
                return;
            default:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39191c;
                org.telegram.ui.Components.bm bmVar = ((ChatAttachAlertPhotoLayout) this.f39190b).M;
                if (bmVar != null) {
                    bmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
        }
    }
}
