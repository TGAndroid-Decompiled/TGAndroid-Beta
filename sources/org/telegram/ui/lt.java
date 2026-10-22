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
public final class lt implements Runnable {
    public final int f39014a;
    public final Object f39015b;
    public final Object f39016c;

    public lt(int i10, Object obj, Object obj2) {
        this.f39014a = i10;
        this.f39015b = obj;
        this.f39016c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.jm0 jm0Var;
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f39014a;
        int i12 = 0;
        Object obj = this.f39016c;
        Object obj2 = this.f39015b;
        switch (i11) {
            case 0:
                mt mtVar = (mt) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ot otVar = mtVar.h;
                if (otVar.f39980f) {
                    mtVar.e = arrayList;
                    if (otVar.e && (jm0Var = otVar.f39977a) != null) {
                        s4.g0 adapter = jm0Var.getAdapter();
                        mt mtVar2 = otVar.d;
                        if (adapter != mtVar2) {
                            otVar.f39977a.setAdapter(mtVar2);
                            otVar.f39977a.setFastScrollVisible(false);
                        }
                    }
                    mtVar.l();
                    return;
                }
                return;
            case 1:
                qt.Q((qt) obj2, (TLRPC.Updates) obj);
                return;
            case 2:
                cy.e0((cy) obj2, (String) obj);
                return;
            case 3:
                gi.d3.j(((cy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 4:
                cy cyVar = (cy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new cv(cyVar, 25), 300L);
                return;
            case 5:
                ((ay) obj).f35446a.postOnAnimation(new cv((cy) obj2, 15));
                return;
            case 6:
                cy cyVar2 = (cy) obj2;
                ArrayList<Long> arrayList2 = (ArrayList) obj;
                MessagesController messagesController = cyVar2.getMessagesController();
                if (cyVar2.W2 == 0 && cyVar2.Y2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList2, i10, -1, null, 0L);
                return;
            case 7:
                ArrayList arrayList3 = (ArrayList) obj;
                cy cyVar3 = ((bw) obj2).f35751b;
                cyVar3.f36204z3 = 2;
                cyVar3.y4(true, true);
                cyVar3.m3();
                while (i12 < arrayList3.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList3.get(i12)).f20283id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList3.get(i12);
                    if (cyVar3.getMessagesController().isForum(j10) || cyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        cyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    cyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = cyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 8:
                ((bw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                cy cyVar4 = ((nw) obj2).f39698a;
                cyVar4.H2 = null;
                org.telegram.ui.Components.kr0 kr0Var = cyVar4.G2;
                if (kr0Var != null && kr0Var.h) {
                    kr0Var.e(charSequence, false);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((bx) obj2).f35755b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    return;
                }
                n2VarArr[0].finishFragment();
                return;
            case 11:
                oy oyVar = (oy) obj2;
                qn qnVar = oyVar.f40003a;
                org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(qnVar.getParentActivity(), oyVar.f40003a, ((MessageObject) obj).getInputStickerSet(), null, qnVar.Y, qnVar.getResourceProvider());
                qy0Var.setCalcMandatoryInsets(qnVar.C9());
                qnVar.showDialog(qy0Var);
                return;
            case 12:
                jz jzVar = (jz) obj2;
                jzVar.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                kz kzVar = jzVar.E;
                lz lzVar = kzVar.f38702c;
                Utilities.Callback callback = lzVar.f39066x;
                if (callback != null) {
                    callback.run(lzVar.d);
                }
                kzVar.f38702c.finishFragment();
                return;
            case 13:
                n00 n00Var = (n00) obj2;
                lz lzVar2 = new lz(n00Var.f39383r, ((e00) obj).f36483m);
                lzVar2.f39067y = new oz(n00Var, 1);
                lzVar2.f39066x = new oz(n00Var, 2);
                n00Var.presentFragment(lzVar2);
                return;
            case 14:
                n00 n00Var2 = (n00) obj2;
                Runnable runnable = (Runnable) obj;
                n00Var2.h = false;
                n00Var2.f39384s = false;
                n00Var2.f39383r.flags = n00Var2.f39387y;
                n00Var2.i0(true);
                n00Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                n00 n00Var3 = (n00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = n00Var3.L;
                n00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    n00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    n00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList4.clear();
                    arrayList4.addAll(tL_chatlists_exportedInvites.invites);
                    n00Var3.w0();
                }
                n00Var3.M = 0;
                return;
            case 16:
                n00 n00Var4 = (n00) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = n00Var4.f39383r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                n00Var4.getMessagesController().removeFilter(dialogFilter);
                n00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                n00Var4.finishFragment();
                return;
            case 17:
                n00 n00Var5 = (n00) obj2;
                n00Var5.getClass();
                n00Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 18:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33152x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f33152x = true;
                    return;
                }
                return;
            case 19:
                FiltersSetupActivity filtersSetupActivity2 = ((l10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 20:
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = ((q50) obj2).Y1;
                for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList6.get(i14)).f31739w != null) {
                        arrayList5.remove(((org.telegram.ui.Components.voip.t) arrayList6.get(i14)).f31739w);
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
                q50 q50Var = (q50) obj2;
                q50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                q50Var.dismiss();
                return;
            case 22:
                a6 a6Var = (a6) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.q2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new lt(23, a6Var, ei.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ((q50) ((a6) obj2).f35289b).U0.setNewColors((int[]) obj);
                return;
            case 24:
                a70.V((a70) obj2, (TLRPC.TL_error) obj);
                return;
            case 25:
                w60 w60Var = (w60) obj2;
                String str = (String) obj;
                x60 x60Var = w60Var.f42482a;
                x60Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                x60Var.f43113c = x60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new x40(1, w60Var, str), 66);
                return;
            case 26:
                TLObject tLObject2 = (TLObject) obj;
                x60 x60Var2 = ((w60) obj2).f42482a;
                if (tLObject2 != null) {
                    a70.a0(x60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    a70.a0(x60Var2.h, null);
                    return;
                }
            case 27:
                z60 z60Var = (z60) obj2;
                String str2 = (String) obj;
                z60Var.h = str2;
                a70 a70Var = z60Var.f43652r;
                if (a70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f20389q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f20391q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                z60Var.f43651n = a70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ca(z60Var, str2, str2, 14), 66);
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new i0(4, (s70) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            default:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f33155c.l();
                return;
        }
    }
}
