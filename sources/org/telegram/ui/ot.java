package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class ot implements Runnable {
    public final int f40251a;
    public final Object f40252b;
    public final Object f40253c;

    public ot(int i10, Object obj, Object obj2) {
        this.f40251a = i10;
        this.f40252b = obj;
        this.f40253c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.lm0 lm0Var;
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f40251a;
        int i12 = 0;
        Object obj = this.f40253c;
        Object obj2 = this.f40252b;
        switch (i11) {
            case 0:
                pt ptVar = (pt) obj2;
                ArrayList arrayList = (ArrayList) obj;
                rt rtVar = ptVar.h;
                if (rtVar.f41226f) {
                    ptVar.e = arrayList;
                    if (rtVar.e && (lm0Var = rtVar.f41223a) != null) {
                        s4.g0 adapter = lm0Var.getAdapter();
                        pt ptVar2 = rtVar.d;
                        if (adapter != ptVar2) {
                            rtVar.f41223a.setAdapter(ptVar2);
                            rtVar.f41223a.setFastScrollVisible(false);
                        }
                    }
                    ptVar.l();
                    return;
                }
                return;
            case 1:
                tt.P((tt) obj2, (TLRPC.Updates) obj);
                return;
            case 2:
                ey.b0((ey) obj2, (String) obj);
                return;
            case 3:
                gi.d3.j(((ey) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 4:
                ey eyVar = (ey) obj2;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new ev(eyVar, 25), 300L);
                return;
            case 5:
                ((dy) obj).f36737a.postOnAnimation(new ev((ey) obj2, 15));
                return;
            case 6:
                ey eyVar2 = (ey) obj2;
                ArrayList<Long> arrayList2 = (ArrayList) obj;
                MessagesController messagesController = eyVar2.getMessagesController();
                if (eyVar2.W2 == 0 && eyVar2.Y2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList2, i10, -1, null, 0L);
                return;
            case 7:
                ArrayList arrayList3 = (ArrayList) obj;
                ey eyVar3 = ((dw) obj2).f36730b;
                eyVar3.f37145z3 = 2;
                eyVar3.y4(true, true);
                eyVar3.m3();
                while (i12 < arrayList3.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList3.get(i12)).f20348id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList3.get(i12);
                    if (eyVar3.getMessagesController().isForum(j10) || eyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        eyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    eyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = eyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 8:
                ((dw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                ey eyVar4 = ((pw) obj2).f40642a;
                eyVar4.H2 = null;
                org.telegram.ui.Components.mr0 mr0Var = eyVar4.G2;
                if (mr0Var != null && mr0Var.h) {
                    mr0Var.e(charSequence, false);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj;
                ((dx) obj2).f36734b.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                    return;
                }
                o2VarArr[0].finishFragment();
                return;
            case 11:
                qy qyVar = (qy) obj2;
                sn snVar = qyVar.f40950a;
                org.telegram.ui.Components.sy0 sy0Var = new org.telegram.ui.Components.sy0(snVar.getParentActivity(), qyVar.f40950a, ((MessageObject) obj).getInputStickerSet(), null, snVar.Y, snVar.getResourceProvider());
                sy0Var.setCalcMandatoryInsets(snVar.C9());
                snVar.showDialog(sy0Var);
                return;
            case 12:
                mz mzVar = (mz) obj2;
                mzVar.getClass();
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                nz nzVar = mzVar.E;
                oz ozVar = nzVar.f40027c;
                Utilities.Callback callback = ozVar.f40289y;
                if (callback != null) {
                    callback.run(ozVar.d);
                }
                nzVar.f40027c.finishFragment();
                return;
            case 13:
                q00 q00Var = (q00) obj2;
                oz ozVar2 = new oz(q00Var.f40676r, ((h00) obj).f37707m);
                ozVar2.E = new rz(q00Var, 1);
                ozVar2.f40289y = new rz(q00Var, 2);
                q00Var.presentFragment(ozVar2);
                return;
            case 14:
                q00 q00Var2 = (q00) obj2;
                Runnable runnable = (Runnable) obj;
                q00Var2.h = false;
                q00Var2.f40677s = false;
                q00Var2.f40676r.flags = q00Var2.f40680y;
                q00Var2.i0(true);
                q00Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                q00 q00Var3 = (q00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = q00Var3.L;
                q00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    q00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    q00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList4.clear();
                    arrayList4.addAll(tL_chatlists_exportedInvites.invites);
                    q00Var3.w0();
                }
                q00Var3.M = 0;
                return;
            case 16:
                q00 q00Var4 = (q00) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                MessagesController.DialogFilter dialogFilter = q00Var4.f40676r;
                if (c2Var != null) {
                    try {
                        c2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                q00Var4.getMessagesController().removeFilter(dialogFilter);
                q00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                q00Var4.finishFragment();
                return;
            case 17:
                q00 q00Var5 = (q00) obj2;
                q00Var5.getClass();
                q00Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 18:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33452x) {
                    filtersSetupActivity.f33452x = true;
                    filtersSetupActivity.a0(new j10(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 19:
                FiltersSetupActivity filtersSetupActivity2 = ((p10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 20:
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = ((u50) obj2).Y1;
                for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList6.get(i14)).f31891w != null) {
                        arrayList5.remove(((org.telegram.ui.Components.voip.t) arrayList6.get(i14)).f31891w);
                    }
                }
                while (i12 < arrayList5.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList5.get(i12);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i12++;
                }
                return;
            case 21:
                u50 u50Var = (u50) obj2;
                u50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                u50Var.dismiss();
                return;
            case 22:
                z5 z5Var = (z5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.q2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new ot(23, z5Var, ei.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ((u50) ((z5) obj2).f44021b).U0.setNewColors((int[]) obj);
                return;
            case 24:
                e70.V((e70) obj2, (TLRPC.TL_error) obj);
                return;
            case 25:
                a70 a70Var = (a70) obj2;
                String str = (String) obj;
                b70 b70Var = a70Var.f35664a;
                b70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                b70Var.f35942c = b70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new a50(1, a70Var, str), 66);
                return;
            case 26:
                TLObject tLObject2 = (TLObject) obj;
                b70 b70Var2 = ((a70) obj2).f35664a;
                if (tLObject2 != null) {
                    e70.a0(b70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    e70.a0(b70Var2.h, null);
                    return;
                }
            case 27:
                d70 d70Var = (d70) obj2;
                String str2 = (String) obj;
                d70Var.h = str2;
                e70 e70Var = d70Var.f36494r;
                if (e70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f20454q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f20456q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                d70Var.f36493n = e70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ca(d70Var, str2, str2, 14), 66);
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new h0(4, (y70) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            default:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f33455c.l();
                return;
        }
    }
}
