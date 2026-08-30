package org.telegram.ui;

import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
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
public final class hp implements Runnable {
    public final int f34925a;
    public final Object f34926b;
    public final Object f34927c;

    public hp(int i10, Object obj, Object obj2) {
        this.f34925a = i10;
        this.f34926b = obj;
        this.f34927c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f34925a) {
            case 0:
                qp qpVar = (qp) this.f34926b;
                TLObject tLObject = (TLObject) this.f34927c;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    qpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    qpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                qpVar.f37810w = false;
                qpVar.f37811x = true;
                qpVar.b0();
                return;
            case 1:
                ((mp) this.f34926b).f36365x.d.M = false;
                ((org.telegram.ui.Components.k80) this.f34927c).run();
                return;
            case 2:
                ((mp) this.f34926b).f36365x.d.L = false;
                ((org.telegram.ui.Components.l80) this.f34927c).run();
                return;
            case 3:
                qp qpVar2 = ((mp) this.f34926b).f36365x.d;
                qpVar2.L = false;
                qpVar2.M = false;
                ((Runnable) this.f34927c).run();
                return;
            case 4:
                mp mpVar = (mp) this.f34926b;
                mpVar.getClass();
                ((TLRPC.Chat) this.f34927c).join_request = true;
                mpVar.h = true;
                mpVar.f26976c.setChecked(true);
                return;
            case 5:
                pr prVar = (pr) this.f34926b;
                prVar.getClass();
                prVar.getMessagesController().loadFullChat(((TLRPC.Updates) this.f34927c).chats.get(0).f19184id, 0, true);
                return;
            case 6:
                TLRPC.User user = (TLRPC.User) this.f34927c;
                pr prVar2 = ((er) this.f34926b).f34071a;
                if (org.telegram.ui.Components.qc.a(prVar2)) {
                    org.telegram.ui.Components.qc.C(prVar2, user.first_name).j();
                    return;
                }
                return;
            case 7:
                ((org.telegram.ui.Components.f0) this.f34926b).f24726r0.unsave((TL_aicompose.TL_aiComposeTone) this.f34927c);
                return;
            case 8:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.f34926b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f34927c;
                rVar.getClass();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    rVar.dismiss();
                    return;
                }
                return;
            case 9:
                vy0 vy0Var = (vy0) this.f34927c;
                if (((boolean[]) this.f34926b)[0]) {
                    vy0Var.run();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f34926b;
                TLObject tLObject2 = (TLObject) this.f34927c;
                v9Var.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    v9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) this.f34926b;
                CharSequence charSequence = (CharSequence) this.f34927c;
                icVar.f25676n = true;
                org.telegram.ui.Components.nb nbVar = icVar.e;
                if (nbVar instanceof org.telegram.ui.Components.ob) {
                    org.telegram.ui.Components.pb pbVar = (org.telegram.ui.Components.pb) ((org.telegram.ui.Components.ob) nbVar);
                    pbVar.f28100b.setText(charSequence);
                    AndroidUtilities.updateViewShow(pbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(pbVar.f28100b, true, false, true);
                }
                icVar.i(true);
                return;
            case 12:
                boolean[] zArr = (boolean[]) this.f34926b;
                Runnable runnable = (Runnable) this.f34927c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Components.bd) this.f34926b).removeView((ph.f3) this.f34927c);
                return;
            case 14:
                int i10 = ChatActivityEnterView.f22729j5;
                ((ChatActivityEnterView) this.f34926b).removeView((ph.f3) this.f34927c);
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f34926b;
                int i11 = ChatActivityEnterView.f22729j5;
                chatActivityEnterView.setFieldText((CharSequence) this.f34927c);
                chatActivityEnterView.T = null;
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f34926b;
                int i12 = ChatActivityEnterView.f22729j5;
                ((org.telegram.ui.Components.id) this.f34927c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.N, chatActivityEnterView2.M2, true);
                return;
            case 17:
                org.telegram.ui.Components.fg fgVar = (org.telegram.ui.Components.fg) this.f34927c;
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.ig) this.f34926b).S;
                chatActivityEnterView3.f22763f1 = chatActivityEnterView3.f22756e1.getAudioRightMs() - chatActivityEnterView3.f22756e1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f22756e1.getAudioLeftMs(), chatActivityEnterView3.f22756e1.getAudioRightMs(), fgVar);
                return;
            case 18:
                ((org.telegram.ui.Components.li) this.f34926b).containerView.removeView((ph.f3) this.f34927c);
                return;
            case 19:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f34927c;
                ((org.telegram.ui.Components.li) this.f34926b).dismiss(true);
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.li liVar = (org.telegram.ui.Components.li) this.f34926b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.ei) this.f34927c).f24587c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                liVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(liVar.G1).updateAttachMenuBotsInCache();
                return;
            case 21:
                org.telegram.ui.Components.li liVar2 = (org.telegram.ui.Components.li) this.f34926b;
                MediaDataController.getInstance(liVar2.G1).loadAttachMenuBots(false, true);
                if (liVar2.f26748v0 == liVar2.f26745u0.get(((TLRPC.TL_attachMenuBot) this.f34927c).bot_id)) {
                    liVar2.Q1(liVar2.f26702g0);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) this.f34926b;
                wiVar.E = false;
                wiVar.F = (ArrayList) this.f34927c;
                wiVar.P();
                return;
            case 23:
                org.telegram.ui.Components.wi wiVar2 = (org.telegram.ui.Components.wi) this.f34926b;
                ((org.telegram.ui.Components.li) this.f34927c).Z0();
                wiVar2.K();
                wiVar2.f24278b.X1(wiVar2, 0);
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new hp(25, (org.telegram.ui.Components.pj) this.f34926b, ((org.telegram.ui.Components.oj) this.f34927c).run()));
                return;
            case 25:
                ((org.telegram.ui.Components.pj) this.f34926b).setStatus((CharSequence) this.f34927c);
                return;
            case 26:
                org.telegram.ui.Components.gk gkVar = (org.telegram.ui.Components.gk) this.f34926b;
                String str = (String) this.f34927c;
                gkVar.getClass();
                ArrayList arrayList2 = new ArrayList(gkVar.U.v.f31362c);
                if (gkVar.U.v.d.isEmpty()) {
                    arrayList2.addAll(0, gkVar.U.v.e);
                }
                Utilities.searchQueue.postRunnable(new cg.u0(gkVar, str, !gkVar.O.isEmpty(), arrayList2, 13));
                return;
            case 27:
                org.telegram.ui.Components.gk gkVar2 = (org.telegram.ui.Components.gk) this.f34926b;
                ArrayList arrayList3 = (ArrayList) this.f34927c;
                org.telegram.ui.Components.hk hkVar = gkVar2.U;
                boolean z4 = hkVar.V;
                org.telegram.ui.Components.vj vjVar = hkVar.f25434r;
                if (z4) {
                    f2.o0 adapter = vjVar.getAdapter();
                    org.telegram.ui.Components.gk gkVar3 = hkVar.f25438y;
                    if (adapter != gkVar3) {
                        vjVar.setAdapter(gkVar3);
                    }
                }
                gkVar2.f25182s = arrayList3;
                gkVar2.l();
                return;
            case 28:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.f34926b;
                float[] fArr = (float[]) this.f34927c;
                alVar.getClass();
                alVar.b0(fArr[0], fArr[1]);
                return;
            default:
                org.telegram.ui.Components.di diVar = (org.telegram.ui.Components.di) this.f34927c;
                boolean z10 = ChatAttachAlertPhotoLayout.f22894n1;
                int currentItemTop = diVar.getCurrentItemTop();
                int listTopPadding = diVar.getListTopPadding();
                org.telegram.ui.Components.pl plVar = ((ChatAttachAlertPhotoLayout) this.f34926b).B;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                plVar.scrollBy(0, listTopPadding);
                return;
        }
    }
}
