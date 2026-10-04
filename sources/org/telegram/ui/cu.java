package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
public final class cu implements Runnable {
    public final int f35550a;
    public final Object f35551b;
    public final Object f35552c;

    public cu(int i10, Object obj, Object obj2) {
        this.f35550a = i10;
        this.f35551b = obj;
        this.f35552c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f35550a;
        int i12 = 0;
        Object obj = this.f35552c;
        Object obj2 = this.f35551b;
        switch (i11) {
            case 0:
                du.N((du) obj2, (TLRPC.Updates) obj);
                return;
            case 1:
                uy.d0((uy) obj2, (String) obj);
                return;
            case 2:
                ei.l3.j(((uy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 3:
                uy uyVar = (uy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new pv(uyVar, 23), 300L);
                return;
            case 4:
                uy uyVar2 = (uy) obj2;
                ArrayList<Long> arrayList = (ArrayList) obj;
                MessagesController messagesController = uyVar2.getMessagesController();
                if (uyVar2.V2 == 0 && uyVar2.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList, i10, -1, null, 0L);
                return;
            case 5:
                CharSequence charSequence = (CharSequence) obj;
                uy uyVar3 = ((dx) obj2).f35850a;
                uyVar3.H2 = null;
                org.telegram.ui.Components.er0 er0Var = uyVar3.G2;
                if (er0Var != null && er0Var.h) {
                    er0Var.e(charSequence, false);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((rx) obj2).f40298b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    return;
                }
                n2VarArr[0].finishFragment();
                return;
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                uy uyVar4 = ((ly) obj2).f38360b;
                uyVar4.y3 = 2;
                uyVar4.J4(true, true);
                uyVar4.x3();
                while (i12 < arrayList2.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList2.get(i12)).f20042id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (uyVar4.getMessagesController().isForum(j3) || uyVar4.getMessagesController().isMonoForumWithManageRights(j3)) {
                        uyVar4.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    uyVar4.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = uyVar4.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 8:
                ((ly) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 9:
                gz gzVar = (gz) obj2;
                yn ynVar = gzVar.f36777a;
                org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(ynVar.getParentActivity(), gzVar.f36777a, ((MessageObject) obj).getInputStickerSet(), null, ynVar.W, ynVar.getResourceProvider());
                qy0Var.setCalcMandatoryInsets(ynVar.w9());
                ynVar.showDialog(qy0Var);
                return;
            case 10:
                a00 a00Var = (a00) obj2;
                a00Var.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                b00 b00Var = a00Var.E;
                c00 c00Var = b00Var.f34944c;
                Utilities.Callback callback = c00Var.f35233x;
                if (callback != null) {
                    callback.run(c00Var.d);
                }
                b00Var.f34944c.finishFragment();
                return;
            case 11:
                f10 f10Var = (f10) obj2;
                c00 c00Var2 = new c00(f10Var.f36140r, ((w00) obj).f41881m);
                c00Var2.f35234y = new f00(f10Var, 1);
                c00Var2.f35233x = new f00(f10Var, 2);
                f10Var.presentFragment(c00Var2);
                return;
            case 12:
                f10 f10Var2 = (f10) obj2;
                Runnable runnable = (Runnable) obj;
                f10Var2.h = false;
                f10Var2.f36141s = false;
                f10Var2.f36140r.flags = f10Var2.f36144y;
                f10Var2.i0(true);
                f10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                f10 f10Var3 = (f10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = f10Var3.L;
                f10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    f10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    f10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList3.clear();
                    arrayList3.addAll(tL_chatlists_exportedInvites.invites);
                    f10Var3.w0();
                }
                f10Var3.M = 0;
                return;
            case 14:
                f10 f10Var4 = (f10) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = f10Var4.f36140r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                f10Var4.getMessagesController().removeFilter(dialogFilter);
                f10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                f10Var4.finishFragment();
                return;
            case 15:
                f10 f10Var5 = (f10) obj2;
                f10Var5.getClass();
                f10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 16:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33760x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f33760x = true;
                    return;
                }
                return;
            case 17:
                FiltersSetupActivity filtersSetupActivity2 = ((d20) obj2).f35622e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 18:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((h60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f32200w != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f32200w);
                    }
                }
                while (i12 < arrayList4.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList4.get(i12);
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
            case 19:
                h60 h60Var = (h60) obj2;
                h60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                h60Var.dismiss();
                return;
            case 20:
                x5 x5Var = (x5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.t2) obj).f32161e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new cu(21, x5Var, ci.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 21:
                ((h60) ((x5) obj2).f42749b).U0.setNewColors((int[]) obj);
                return;
            case 22:
                s70.T((s70) obj2, (TLRPC.TL_error) obj);
                return;
            case 23:
                o70 o70Var = (o70) obj2;
                String str = (String) obj;
                p70 p70Var = o70Var.f39116a;
                p70Var.f39359e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                p70Var.f39358c = p70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new no(24, o70Var, str), 66);
                return;
            case 24:
                TLObject tLObject2 = (TLObject) obj;
                p70 p70Var2 = ((o70) obj2).f39116a;
                if (tLObject2 != null) {
                    s70.Z(p70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    s70.Z(p70Var2.h, null);
                    return;
                }
            case 25:
                r70 r70Var = (r70) obj2;
                String str2 = (String) obj;
                r70Var.h = str2;
                s70 s70Var = r70Var.f39943r;
                if (s70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f20148q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f20150q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                r70Var.f39942n = s70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ca(r70Var, str2, str2, 14), 66);
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(6, (l80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 27:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.f33764e = (ArrayList) obj;
                languageSelectActivity.f33763c.l();
                return;
            case 28:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new cu(27, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList6 = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i15 = 0; i15 < size; i15++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i15);
                    if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList6.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity2.f33765f.size();
                while (i12 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f33765f.get(i12);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList6.add(localeInfo2);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(new cu(27, languageSelectActivity2, arrayList6));
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject3 = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject3 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject3;
                    MessagesController.getInstance(launchActivity.O).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.O).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    yn ynVar2 = new yn(bundle);
                    ynVar2.f43350ga = resolvedbusinesschatlinks;
                    launchActivity.q0(ynVar2, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
        }
    }
}
