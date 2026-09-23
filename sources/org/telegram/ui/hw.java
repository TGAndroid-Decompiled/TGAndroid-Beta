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
public final class hw implements Runnable {
    public final int f33936a;
    public final Object f33937b;
    public final Object f33938c;

    public hw(int i10, Object obj, Object obj2) {
        this.f33936a = i10;
        this.f33937b = obj;
        this.f33938c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f33936a;
        int i12 = 0;
        Object obj = this.f33938c;
        Object obj2 = this.f33937b;
        switch (i11) {
            case 0:
                ((qy) obj).f36629a.postOnAnimation(new mv((ry) obj2, 14));
                return;
            case 1:
                ry ryVar = (ry) obj2;
                ArrayList<Long> arrayList = (ArrayList) obj;
                MessagesController messagesController = ryVar.getMessagesController();
                if (ryVar.V2 == 0 && ryVar.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList, i10, -1, null, 0L);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                ry ryVar2 = ((qw) obj2).f36622b;
                ryVar2.y3 = 2;
                ryVar2.A4(true, true);
                ryVar2.o3();
                while (i12 < arrayList2.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList2.get(i12)).f18087id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (ryVar2.getMessagesController().isForum(j3) || ryVar2.getMessagesController().isMonoForumWithManageRights(j3)) {
                        ryVar2.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    ryVar2.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = ryVar2.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 3:
                ((qw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 4:
                CharSequence charSequence = (CharSequence) obj;
                ry ryVar3 = ((cx) obj2).f32430a;
                ryVar3.H2 = null;
                org.telegram.ui.Components.mq0 mq0Var = ryVar3.G2;
                if (mq0Var != null && mq0Var.h) {
                    mq0Var.e(charSequence, false);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((qx) obj2).f36626b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    return;
                }
                n2VarArr[0].finishFragment();
                return;
            case 6:
                dz dzVar = (dz) obj2;
                xn xnVar = dzVar.f32742a;
                org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(xnVar.getParentActivity(), dzVar.f32742a, ((MessageObject) obj).getInputStickerSet(), null, xnVar.Y, xnVar.getResourceProvider());
                ux0Var.setCalcMandatoryInsets(xnVar.x9());
                xnVar.showDialog(ux0Var);
                return;
            case 7:
                xz xzVar = (xz) obj2;
                xzVar.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                yz yzVar = xzVar.E;
                zz zzVar = yzVar.f39915c;
                Utilities.Callback callback = zzVar.f40288x;
                if (callback != null) {
                    callback.run(zzVar.d);
                }
                yzVar.f39915c.finishFragment();
                return;
            case 8:
                c10 c10Var = (c10) obj2;
                zz zzVar2 = new zz(c10Var.f32224r, ((t00) obj).f37484m);
                zzVar2.f40289y = new c00(c10Var, 1);
                zzVar2.f40288x = new c00(c10Var, 2);
                c10Var.presentFragment(zzVar2);
                return;
            case 9:
                c10 c10Var2 = (c10) obj2;
                Runnable runnable = (Runnable) obj;
                c10Var2.h = false;
                c10Var2.f32225s = false;
                c10Var2.f32224r.flags = c10Var2.f32228y;
                c10Var2.i0(true);
                c10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                c10 c10Var3 = (c10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = c10Var3.L;
                c10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    c10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    c10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList3.clear();
                    arrayList3.addAll(tL_chatlists_exportedInvites.invites);
                    c10Var3.w0();
                }
                c10Var3.M = 0;
                return;
            case 11:
                c10 c10Var4 = (c10) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = c10Var4.f32224r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                c10Var4.getMessagesController().removeFilter(dialogFilter);
                c10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                c10Var4.finishFragment();
                return;
            case 12:
                c10 c10Var5 = (c10) obj2;
                c10Var5.getClass();
                c10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 13:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f30778x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f30778x = true;
                    return;
                }
                return;
            case 14:
                FiltersSetupActivity filtersSetupActivity2 = ((b20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 15:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((f60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f29239w != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f29239w);
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
                f60 f60Var = (f60) obj2;
                f60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                f60Var.dismiss();
                return;
            case 17:
                x5 x5Var = (x5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new hw(18, x5Var, ci.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 18:
                ((f60) ((x5) obj2).f39190b).U0.setNewColors((int[]) obj);
                return;
            case 19:
                q70.V((q70) obj2, (TLRPC.TL_error) obj);
                return;
            case 20:
                m70 m70Var = (m70) obj2;
                String str = (String) obj;
                n70 n70Var = m70Var.f35166a;
                n70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                n70Var.f35446c = n70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new mo(24, m70Var, str), 66);
                return;
            case 21:
                TLObject tLObject2 = (TLObject) obj;
                n70 n70Var2 = ((m70) obj2).f35166a;
                if (tLObject2 != null) {
                    q70.a0(n70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    q70.a0(n70Var2.h, null);
                    return;
                }
            case 22:
                p70 p70Var = (p70) obj2;
                String str2 = (String) obj;
                p70Var.h = str2;
                q70 q70Var = p70Var.f36037r;
                if (q70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f18193q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f18195q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                p70Var.f36036n = q70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(p70Var, str2, str2, 14), 66);
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new m4(2, (j80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 24:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f30781c.l();
                return;
            case 25:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new hw(24, languageSelectActivity2, new ArrayList()));
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
                int size2 = languageSelectActivity2.f30782f.size();
                while (i12 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f30782f.get(i12);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList6.add(localeInfo2);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(new hw(24, languageSelectActivity2, arrayList6));
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
                    xn xnVar2 = new xn(bundle);
                    xnVar2.f39418ia = resolvedbusinesschatlinks;
                    launchActivity.q0(xnVar2, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
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
                org.telegram.messenger.ul.m(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.e5.u0((h) obj2, string, sb2.toString(), null);
                return;
            default:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.f30815q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f30815q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
        }
    }
}
