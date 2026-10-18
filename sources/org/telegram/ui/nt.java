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
public final class nt implements Runnable {
    public final int f39557a;
    public final Object f39558b;
    public final Object f39559c;

    public nt(int i10, Object obj, Object obj2) {
        this.f39557a = i10;
        this.f39558b = obj;
        this.f39559c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.im0 im0Var;
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f39557a;
        int i12 = 0;
        Object obj = this.f39559c;
        Object obj2 = this.f39558b;
        switch (i11) {
            case 0:
                ot otVar = (ot) obj2;
                ArrayList arrayList = (ArrayList) obj;
                qt qtVar = otVar.h;
                if (qtVar.f40488f) {
                    otVar.e = arrayList;
                    if (qtVar.e && (im0Var = qtVar.f40485a) != null) {
                        s4.g0 adapter = im0Var.getAdapter();
                        ot otVar2 = qtVar.d;
                        if (adapter != otVar2) {
                            qtVar.f40485a.setAdapter(otVar2);
                            qtVar.f40485a.setFastScrollVisible(false);
                        }
                    }
                    otVar.l();
                    return;
                }
                return;
            case 1:
                st.Q((st) obj2, (TLRPC.Updates) obj);
                return;
            case 2:
                ey.e0((ey) obj2, (String) obj);
                return;
            case 3:
                gi.d3.j(((ey) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 4:
                ey eyVar = (ey) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new ev(eyVar, 25), 300L);
                return;
            case 5:
                ((dy) obj).f36300a.postOnAnimation(new ev((ey) obj2, 15));
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
                ey eyVar3 = ((dw) obj2).f36293b;
                eyVar3.f36746z3 = 2;
                eyVar3.y4(true, true);
                eyVar3.m3();
                while (i12 < arrayList3.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList3.get(i12)).f20276id;
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
                ey eyVar4 = ((pw) obj2).f40211a;
                eyVar4.H2 = null;
                org.telegram.ui.Components.ir0 ir0Var = eyVar4.G2;
                if (ir0Var != null && ir0Var.h) {
                    ir0Var.e(charSequence, false);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((dx) obj2).f36297b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    return;
                }
                n2VarArr[0].finishFragment();
                return;
            case 11:
                qy qyVar = (qy) obj2;
                sn snVar = qyVar.f40511a;
                org.telegram.ui.Components.oy0 oy0Var = new org.telegram.ui.Components.oy0(snVar.getParentActivity(), qyVar.f40511a, ((MessageObject) obj).getInputStickerSet(), null, snVar.Y, snVar.getResourceProvider());
                oy0Var.setCalcMandatoryInsets(snVar.C9());
                snVar.showDialog(oy0Var);
                return;
            case 12:
                lz lzVar = (lz) obj2;
                lzVar.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                mz mzVar = lzVar.E;
                nz nzVar = mzVar.f39263c;
                Utilities.Callback callback = nzVar.f39609x;
                if (callback != null) {
                    callback.run(nzVar.d);
                }
                mzVar.f39263c.finishFragment();
                return;
            case 13:
                p00 p00Var = (p00) obj2;
                nz nzVar2 = new nz(p00Var.f39905r, ((g00) obj).f37008m);
                nzVar2.f39610y = new qz(p00Var, 1);
                nzVar2.f39609x = new qz(p00Var, 2);
                p00Var.presentFragment(nzVar2);
                return;
            case 14:
                p00 p00Var2 = (p00) obj2;
                Runnable runnable = (Runnable) obj;
                p00Var2.h = false;
                p00Var2.f39906s = false;
                p00Var2.f39905r.flags = p00Var2.f39909y;
                p00Var2.i0(true);
                p00Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                p00 p00Var3 = (p00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = p00Var3.L;
                p00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    p00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    p00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList4.clear();
                    arrayList4.addAll(tL_chatlists_exportedInvites.invites);
                    p00Var3.w0();
                }
                p00Var3.M = 0;
                return;
            case 16:
                p00 p00Var4 = (p00) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = p00Var4.f39905r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                p00Var4.getMessagesController().removeFilter(dialogFilter);
                p00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                p00Var4.finishFragment();
                return;
            case 17:
                p00 p00Var5 = (p00) obj2;
                p00Var5.getClass();
                p00Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 18:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33136x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f33136x = true;
                    return;
                }
                return;
            case 19:
                FiltersSetupActivity filtersSetupActivity2 = ((n10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 20:
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = ((s50) obj2).Y1;
                for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList6.get(i14)).f31775w != null) {
                        arrayList5.remove(((org.telegram.ui.Components.voip.t) arrayList6.get(i14)).f31775w);
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
                s50 s50Var = (s50) obj2;
                s50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                s50Var.dismiss();
                return;
            case 22:
                a6 a6Var = (a6) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.q2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new nt(23, a6Var, ei.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ((s50) ((a6) obj2).f35273b).U0.setNewColors((int[]) obj);
                return;
            case 24:
                c70.V((c70) obj2, (TLRPC.TL_error) obj);
                return;
            case 25:
                y60 y60Var = (y60) obj2;
                String str = (String) obj;
                z60 z60Var = y60Var.f43317a;
                z60Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                z60Var.f43632c = z60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new z40(1, y60Var, str), 66);
                return;
            case 26:
                TLObject tLObject2 = (TLObject) obj;
                z60 z60Var2 = ((y60) obj2).f43317a;
                if (tLObject2 != null) {
                    c70.a0(z60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    c70.a0(z60Var2.h, null);
                    return;
                }
            case 27:
                b70 b70Var = (b70) obj2;
                String str2 = (String) obj;
                b70Var.h = str2;
                c70 c70Var = b70Var.f35566r;
                if (c70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f20382q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f20384q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                b70Var.f35565n = c70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ea(b70Var, str2, str2, 14), 66);
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new i0(4, (u70) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            default:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f33139c.l();
                return;
        }
    }
}
