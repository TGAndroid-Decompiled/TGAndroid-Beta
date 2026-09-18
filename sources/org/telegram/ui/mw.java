package org.telegram.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
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
public final class mw implements Runnable {
    public final int f35902a;
    public final Object f35903b;
    public final Object f35904c;

    public mw(int i10, Object obj, Object obj2) {
        this.f35902a = i10;
        this.f35903b = obj;
        this.f35904c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f35902a;
        int i12 = 0;
        Object obj = this.f35904c;
        Object obj2 = this.f35903b;
        switch (i11) {
            case 0:
                ((vy) obj).f38527a.postOnAnimation(new rv((wy) obj2, 14));
                return;
            case 1:
                wy wyVar = (wy) obj2;
                ArrayList<Long> arrayList = (ArrayList) obj;
                MessagesController messagesController = wyVar.getMessagesController();
                if (wyVar.V2 == 0 && wyVar.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList, i10, -1, null, 0L);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                wy wyVar2 = ((vw) obj2).f38516b;
                wyVar2.y3 = 2;
                wyVar2.A4(true, true);
                wyVar2.o3();
                while (i12 < arrayList2.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList2.get(i12)).f18125id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (wyVar2.getMessagesController().isForum(j3) || wyVar2.getMessagesController().isMonoForumWithManageRights(j3)) {
                        wyVar2.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    wyVar2.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = wyVar2.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 3:
                ((vw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 4:
                CharSequence charSequence = (CharSequence) obj;
                wy wyVar3 = ((hx) obj2).f34381a;
                wyVar3.H2 = null;
                org.telegram.ui.Components.nq0 nq0Var = wyVar3.G2;
                if (nq0Var != null && nq0Var.h) {
                    nq0Var.e(charSequence, false);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj;
                ((vx) obj2).f38526b.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                    return;
                }
                o2VarArr[0].finishFragment();
                return;
            case 6:
                iz izVar = (iz) obj2;
                bo boVar = izVar.f34721a;
                org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(boVar.getParentActivity(), izVar.f34721a, ((MessageObject) obj).getInputStickerSet(), null, boVar.Y, boVar.getResourceProvider());
                wx0Var.setCalcMandatoryInsets(boVar.x9());
                boVar.showDialog(wx0Var);
                return;
            case 7:
                c00 c00Var = (c00) obj2;
                c00Var.getClass();
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                d00 d00Var = c00Var.E;
                e00 e00Var = d00Var.f32982c;
                Utilities.Callback callback = e00Var.f33257x;
                if (callback != null) {
                    callback.run(e00Var.d);
                }
                d00Var.f32982c.finishFragment();
                return;
            case 8:
                h10 h10Var = (h10) obj2;
                e00 e00Var2 = new e00(h10Var.f34096r, ((y00) obj).f39754m);
                e00Var2.f33258y = new h00(h10Var, 1);
                e00Var2.f33257x = new h00(h10Var, 2);
                h10Var.presentFragment(e00Var2);
                return;
            case 9:
                h10 h10Var2 = (h10) obj2;
                Runnable runnable = (Runnable) obj;
                h10Var2.h = false;
                h10Var2.f34097s = false;
                h10Var2.f34096r.flags = h10Var2.f34100y;
                h10Var2.i0(true);
                h10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                h10 h10Var3 = (h10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = h10Var3.L;
                h10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    h10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    h10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList3.clear();
                    arrayList3.addAll(tL_chatlists_exportedInvites.invites);
                    h10Var3.w0();
                }
                h10Var3.M = 0;
                return;
            case 11:
                h10 h10Var4 = (h10) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                MessagesController.DialogFilter dialogFilter = h10Var4.f34096r;
                if (c2Var != null) {
                    try {
                        c2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                h10Var4.getMessagesController().removeFilter(dialogFilter);
                h10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                h10Var4.finishFragment();
                return;
            case 12:
                h10 h10Var5 = (h10) obj2;
                h10Var5.getClass();
                h10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 13:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f30824x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f30824x = true;
                    return;
                }
                return;
            case 14:
                FiltersSetupActivity filtersSetupActivity2 = ((g20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 15:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((k60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f29248w != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f29248w);
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
            case 16:
                k60 k60Var = (k60) obj2;
                k60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                k60Var.dismiss();
                return;
            case 17:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new mw(18, w5Var, ci.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 18:
                ((k60) ((w5) obj2).f38575b).U0.setNewColors((int[]) obj);
                return;
            case 19:
                v70.V((v70) obj2, (TLRPC.TL_error) obj);
                return;
            case 20:
                r70 r70Var = (r70) obj2;
                String str = (String) obj;
                s70 s70Var = r70Var.f37109a;
                s70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                s70Var.f37404c = s70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new qo(24, r70Var, str), 66);
                return;
            case 21:
                TLObject tLObject2 = (TLObject) obj;
                s70 s70Var2 = ((r70) obj2).f37109a;
                if (tLObject2 != null) {
                    v70.a0(s70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    v70.a0(s70Var2.h, null);
                    return;
                }
            case 22:
                u70 u70Var = (u70) obj2;
                String str2 = (String) obj;
                u70Var.h = str2;
                v70 v70Var = u70Var.f37966r;
                if (v70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f18231q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f18233q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                u70Var.f37965n = v70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ca(u70Var, str2, str2, 14), 66);
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new l4(2, (o80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 24:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f30827c.l();
                return;
            case 25:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new mw(24, languageSelectActivity2, new ArrayList()));
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
                int size2 = languageSelectActivity2.f30828f.size();
                while (i12 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f30828f.get(i12);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList6.add(localeInfo2);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(new mw(24, languageSelectActivity2, arrayList6));
                return;
            case 26:
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
                    bo boVar2 = new bo(bundle);
                    boVar2.f32328ia = resolvedbusinesschatlinks;
                    launchActivity.q0(boVar2, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.c5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 27:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 28:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.c5.u0((h) obj2, string, sb2.toString(), null);
                return;
            default:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.f30861q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f30861q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
        }
    }
}
