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
public final class kw implements Runnable {
    public final int f35278a;
    public final Object f35279b;
    public final Object f35280c;

    public kw(int i10, Object obj, Object obj2) {
        this.f35278a = i10;
        this.f35279b = obj;
        this.f35280c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f35278a;
        int i12 = 0;
        Object obj = this.f35280c;
        Object obj2 = this.f35279b;
        switch (i11) {
            case 0:
                ((ty) obj).f37803a.postOnAnimation(new pv((uy) obj2, 14));
                return;
            case 1:
                uy uyVar = (uy) obj2;
                ArrayList<Long> arrayList = (ArrayList) obj;
                MessagesController messagesController = uyVar.getMessagesController();
                if (uyVar.V2 == 0 && uyVar.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList, i10, -1, null, 0L);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                uy uyVar2 = ((tw) obj2).f37792b;
                uyVar2.y3 = 2;
                uyVar2.A4(true, true);
                uyVar2.o3();
                while (i12 < arrayList2.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList2.get(i12)).f18116id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (uyVar2.getMessagesController().isForum(j3) || uyVar2.getMessagesController().isMonoForumWithManageRights(j3)) {
                        uyVar2.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    uyVar2.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = uyVar2.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 3:
                ((tw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 4:
                CharSequence charSequence = (CharSequence) obj;
                uy uyVar3 = ((fx) obj2).f33696a;
                uyVar3.H2 = null;
                org.telegram.ui.Components.mq0 mq0Var = uyVar3.G2;
                if (mq0Var != null && mq0Var.h) {
                    mq0Var.e(charSequence, false);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((tx) obj2).f37802b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    return;
                }
                n2VarArr[0].finishFragment();
                return;
            case 6:
                gz gzVar = (gz) obj2;
                bo boVar = gzVar.f34047a;
                org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(boVar.getParentActivity(), gzVar.f34047a, ((MessageObject) obj).getInputStickerSet(), null, boVar.Y, boVar.getResourceProvider());
                vx0Var.setCalcMandatoryInsets(boVar.x9());
                boVar.showDialog(vx0Var);
                return;
            case 7:
                a00 a00Var = (a00) obj2;
                a00Var.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                b00 b00Var = a00Var.E;
                c00 c00Var = b00Var.f32015c;
                Utilities.Callback callback = c00Var.f32614x;
                if (callback != null) {
                    callback.run(c00Var.d);
                }
                b00Var.f32015c.finishFragment();
                return;
            case 8:
                f10 f10Var = (f10) obj2;
                c00 c00Var2 = new c00(f10Var.f33446r, ((w00) obj).f38733m);
                c00Var2.f32615y = new f00(f10Var, 1);
                c00Var2.f32614x = new f00(f10Var, 2);
                f10Var.presentFragment(c00Var2);
                return;
            case 9:
                f10 f10Var2 = (f10) obj2;
                Runnable runnable = (Runnable) obj;
                f10Var2.h = false;
                f10Var2.f33447s = false;
                f10Var2.f33446r.flags = f10Var2.f33450y;
                f10Var2.i0(true);
                f10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
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
            case 11:
                f10 f10Var4 = (f10) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = f10Var4.f33446r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                f10Var4.getMessagesController().removeFilter(dialogFilter);
                f10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                f10Var4.finishFragment();
                return;
            case 12:
                f10 f10Var5 = (f10) obj2;
                f10Var5.getClass();
                f10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 13:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f30807x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f30807x = true;
                    return;
                }
                return;
            case 14:
                FiltersSetupActivity filtersSetupActivity2 = ((e20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 15:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((i60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f29268w != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f29268w);
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
                i60 i60Var = (i60) obj2;
                i60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                i60Var.dismiss();
                return;
            case 17:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new kw(18, w5Var, ci.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 18:
                ((i60) ((w5) obj2).f38776b).U0.setNewColors((int[]) obj);
                return;
            case 19:
                t70.V((t70) obj2, (TLRPC.TL_error) obj);
                return;
            case 20:
                p70 p70Var = (p70) obj2;
                String str = (String) obj;
                q70 q70Var = p70Var.f36455a;
                q70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                q70Var.f36786c = q70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new qo(24, p70Var, str), 66);
                return;
            case 21:
                TLObject tLObject2 = (TLObject) obj;
                q70 q70Var2 = ((p70) obj2).f36455a;
                if (tLObject2 != null) {
                    t70.a0(q70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    t70.a0(q70Var2.h, null);
                    return;
                }
            case 22:
                s70 s70Var = (s70) obj2;
                String str2 = (String) obj;
                s70Var.h = str2;
                t70 t70Var = s70Var.f37273r;
                if (t70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f18222q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f18224q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                s70Var.f37272n = t70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(s70Var, str2, str2, 14), 66);
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new l4(2, (m80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 24:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f30810c.l();
                return;
            case 25:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new kw(24, languageSelectActivity2, new ArrayList()));
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
                int size2 = languageSelectActivity2.f30811f.size();
                while (i12 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f30811f.get(i12);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList6.add(localeInfo2);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(new kw(24, languageSelectActivity2, arrayList6));
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
                    boVar2.f32346ia = resolvedbusinesschatlinks;
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
                if (!launchActivity3.f30844q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f30844q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
        }
    }
}
