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
public final class np implements Runnable {
    public final int f36550a;
    public final Object f36551b;
    public final Object f36552c;

    public np(int i10, Object obj, Object obj2) {
        this.f36550a = i10;
        this.f36551b = obj;
        this.f36552c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f36550a) {
            case 0:
                ((op) this.f36551b).f36859x.d.M = false;
                ((org.telegram.ui.Components.k80) this.f36552c).run();
                return;
            case 1:
                ((op) this.f36551b).f36859x.d.L = false;
                ((org.telegram.ui.Components.l80) this.f36552c).run();
                return;
            case 2:
                sp spVar = ((op) this.f36551b).f36859x.d;
                spVar.L = false;
                spVar.M = false;
                ((Runnable) this.f36552c).run();
                return;
            case 3:
                op opVar = (op) this.f36551b;
                opVar.getClass();
                ((TLRPC.Chat) this.f36552c).join_request = true;
                opVar.h = true;
                opVar.f26986c.setChecked(true);
                return;
            case 4:
                rr rrVar = (rr) this.f36551b;
                rrVar.getClass();
                rrVar.getMessagesController().loadFullChat(((TLRPC.Updates) this.f36552c).chats.get(0).f19159id, 0, true);
                return;
            case 5:
                TLRPC.User user = (TLRPC.User) this.f36552c;
                rr rrVar2 = ((gr) this.f36551b).f34497a;
                if (org.telegram.ui.Components.qc.a(rrVar2)) {
                    org.telegram.ui.Components.qc.C(rrVar2, user.first_name).j();
                    return;
                }
                return;
            case 6:
                ((org.telegram.ui.Components.f0) this.f36551b).f24745r0.unsave((TL_aicompose.TL_aiComposeTone) this.f36552c);
                return;
            case 7:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.f36551b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f36552c;
                rVar.getClass();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    rVar.dismiss();
                    return;
                }
                return;
            case 8:
                sz0 sz0Var = (sz0) this.f36552c;
                if (((boolean[]) this.f36551b)[0]) {
                    sz0Var.run();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f36551b;
                TLObject tLObject = (TLObject) this.f36552c;
                v9Var.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    v9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) this.f36551b;
                CharSequence charSequence = (CharSequence) this.f36552c;
                icVar.f25675n = true;
                org.telegram.ui.Components.nb nbVar = icVar.e;
                if (nbVar instanceof org.telegram.ui.Components.ob) {
                    org.telegram.ui.Components.pb pbVar = (org.telegram.ui.Components.pb) ((org.telegram.ui.Components.ob) nbVar);
                    pbVar.f28137b.setText(charSequence);
                    AndroidUtilities.updateViewShow(pbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(pbVar.f28137b, true, false, true);
                }
                icVar.i(true);
                return;
            case 11:
                boolean[] zArr = (boolean[]) this.f36551b;
                Runnable runnable = (Runnable) this.f36552c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.bd) this.f36551b).removeView((ph.f3) this.f36552c);
                return;
            case 13:
                int i10 = ChatActivityEnterView.f22702j5;
                ((ChatActivityEnterView) this.f36551b).removeView((ph.f3) this.f36552c);
                return;
            case 14:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f36551b;
                int i11 = ChatActivityEnterView.f22702j5;
                chatActivityEnterView.setFieldText((CharSequence) this.f36552c);
                chatActivityEnterView.T = null;
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f36551b;
                int i12 = ChatActivityEnterView.f22702j5;
                ((org.telegram.ui.Components.id) this.f36552c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.N, chatActivityEnterView2.M2, true);
                return;
            case 16:
                org.telegram.ui.Components.fg fgVar = (org.telegram.ui.Components.fg) this.f36552c;
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.ig) this.f36551b).S;
                chatActivityEnterView3.f22736f1 = chatActivityEnterView3.f22729e1.getAudioRightMs() - chatActivityEnterView3.f22729e1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f22729e1.getAudioLeftMs(), chatActivityEnterView3.f22729e1.getAudioRightMs(), fgVar);
                return;
            case 17:
                ((org.telegram.ui.Components.li) this.f36551b).containerView.removeView((ph.f3) this.f36552c);
                return;
            case 18:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f36552c;
                ((org.telegram.ui.Components.li) this.f36551b).dismiss(true);
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.li liVar = (org.telegram.ui.Components.li) this.f36551b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.ei) this.f36552c).f24620c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                liVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(liVar.G1).updateAttachMenuBotsInCache();
                return;
            case 20:
                org.telegram.ui.Components.li liVar2 = (org.telegram.ui.Components.li) this.f36551b;
                MediaDataController.getInstance(liVar2.G1).loadAttachMenuBots(false, true);
                if (liVar2.f26744v0 == liVar2.f26741u0.get(((TLRPC.TL_attachMenuBot) this.f36552c).bot_id)) {
                    liVar2.Q1(liVar2.f26698g0);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) this.f36551b;
                wiVar.E = false;
                wiVar.F = (ArrayList) this.f36552c;
                wiVar.P();
                return;
            case 22:
                org.telegram.ui.Components.wi wiVar2 = (org.telegram.ui.Components.wi) this.f36551b;
                ((org.telegram.ui.Components.li) this.f36552c).Z0();
                wiVar2.K();
                wiVar2.f24282b.X1(wiVar2, 0);
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new np(24, (org.telegram.ui.Components.pj) this.f36551b, ((org.telegram.ui.Components.oj) this.f36552c).run()));
                return;
            case 24:
                ((org.telegram.ui.Components.pj) this.f36551b).setStatus((CharSequence) this.f36552c);
                return;
            case 25:
                org.telegram.ui.Components.gk gkVar = (org.telegram.ui.Components.gk) this.f36551b;
                String str = (String) this.f36552c;
                gkVar.getClass();
                ArrayList arrayList = new ArrayList(gkVar.U.v.f31392c);
                if (gkVar.U.v.d.isEmpty()) {
                    arrayList.addAll(0, gkVar.U.v.e);
                }
                Utilities.searchQueue.postRunnable(new cg.u0(gkVar, str, !gkVar.O.isEmpty(), arrayList, 13));
                return;
            case 26:
                org.telegram.ui.Components.gk gkVar2 = (org.telegram.ui.Components.gk) this.f36551b;
                ArrayList arrayList2 = (ArrayList) this.f36552c;
                org.telegram.ui.Components.hk hkVar = gkVar2.U;
                boolean z4 = hkVar.V;
                org.telegram.ui.Components.vj vjVar = hkVar.f25436r;
                if (z4) {
                    f2.o0 adapter = vjVar.getAdapter();
                    org.telegram.ui.Components.gk gkVar3 = hkVar.f25440y;
                    if (adapter != gkVar3) {
                        vjVar.setAdapter(gkVar3);
                    }
                }
                gkVar2.f25188s = arrayList2;
                gkVar2.l();
                return;
            case 27:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.f36551b;
                float[] fArr = (float[]) this.f36552c;
                alVar.getClass();
                alVar.b0(fArr[0], fArr[1]);
                return;
            case 28:
                org.telegram.ui.Components.di diVar = (org.telegram.ui.Components.di) this.f36552c;
                boolean z10 = ChatAttachAlertPhotoLayout.f22867n1;
                int currentItemTop = diVar.getCurrentItemTop();
                int listTopPadding = diVar.getListTopPadding();
                org.telegram.ui.Components.ol olVar = ((ChatAttachAlertPhotoLayout) this.f36551b).B;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                olVar.scrollBy(0, listTopPadding);
                return;
            default:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36552c;
                org.telegram.ui.Components.zl zlVar = ((ChatAttachAlertPhotoLayout) this.f36551b).M;
                if (zlVar != null) {
                    zlVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
        }
    }
}
