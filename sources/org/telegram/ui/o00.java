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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class o00 implements Runnable {
    public final int f38817a;
    public final Object f38818b;
    public final Object f38819c;

    public o00(int i10, Object obj, Object obj2) {
        this.f38817a = i10;
        this.f38818b = obj;
        this.f38819c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.f38817a;
        int i11 = 0;
        Object obj = this.f38819c;
        Object obj2 = this.f38818b;
        switch (i10) {
            case 0:
                l10 l10Var = (l10) obj2;
                h00 h00Var = new h00(l10Var.f37809r, ((c10) obj).f34671m);
                h00Var.f36575y = new k00(l10Var, 1);
                h00Var.f36574x = new k00(l10Var, 2);
                l10Var.presentFragment(h00Var);
                return;
            case 1:
                l10 l10Var2 = (l10) obj2;
                Runnable runnable = (Runnable) obj;
                l10Var2.h = false;
                l10Var2.f37810s = false;
                l10Var2.f37809r.flags = l10Var2.f37813y;
                l10Var2.i0(true);
                l10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                l10 l10Var3 = (l10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = l10Var3.L;
                l10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    l10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    l10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList.clear();
                    arrayList.addAll(tL_chatlists_exportedInvites.invites);
                    l10Var3.w0();
                }
                l10Var3.M = 0;
                return;
            case 3:
                l10 l10Var4 = (l10) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj;
                MessagesController.DialogFilter dialogFilter = l10Var4.f37809r;
                if (a2Var != null) {
                    try {
                        a2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                l10Var4.getMessagesController().removeFilter(dialogFilter);
                l10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                l10Var4.finishFragment();
                return;
            case 4:
                l10 l10Var5 = (l10) obj2;
                l10Var5.getClass();
                l10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f32096x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f32096x = true;
                    return;
                }
                return;
            case 6:
                FiltersSetupActivity filtersSetupActivity2 = ((i20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ((n60) obj2).Y1;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList3.get(i12)).f30504w != null) {
                        arrayList2.remove(((org.telegram.ui.Components.voip.t) arrayList3.get(i12)).f30504w);
                    }
                }
                while (i11 < arrayList2.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList2.get(i11);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i11++;
                }
                return;
            case 8:
                n60 n60Var = (n60) obj2;
                n60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                n60Var.dismiss();
                return;
            case 9:
                a6 a6Var = (a6) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.r2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new o00(10, a6Var, di.m0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                ((n60) ((a6) obj2).f34045b).U0.setNewColors((int[]) obj);
                return;
            case 11:
                y70.V((y70) obj2, (TLRPC.TL_error) obj);
                return;
            case 12:
                u70 u70Var = (u70) obj2;
                String str = (String) obj;
                v70 v70Var = u70Var.f40556a;
                v70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                v70Var.f40915c = v70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new to(24, u70Var, str), 66);
                return;
            case 13:
                TLObject tLObject2 = (TLObject) obj;
                v70 v70Var2 = ((u70) obj2).f40556a;
                if (tLObject2 != null) {
                    y70.a0(v70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    y70.a0(v70Var2.h, null);
                    return;
                }
            case 14:
                x70 x70Var = (x70) obj2;
                String str2 = (String) obj;
                x70Var.h = str2;
                y70 y70Var = x70Var.f41770r;
                if (y70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f19326q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f19328q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                x70Var.f41769n = y70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new fa(x70Var, str2, str2, 14), 66);
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j(20, (q80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 16:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f32099c.l();
                return;
            case 17:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new o00(16, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList4 = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i13 = 0; i13 < size; i13++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i13);
                    if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList4.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity2.f32100f.size();
                while (i11 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f32100f.get(i11);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList4.add(localeInfo2);
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(new o00(16, languageSelectActivity2, arrayList4));
                return;
            case 18:
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
                    fo foVar = new fo(bundle);
                    foVar.ia = resolvedbusinesschatlinks;
                    launchActivity.q0(foVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.g5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 19:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 20:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.d0.n(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.g5.t0((h) obj2, string, sb2.toString(), null);
                return;
            case 21:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.f32133q0.getFragmentStack().isEmpty()) {
                    launchActivity3.f32133q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
            case 22:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) obj2).j0((TL_account.Password) obj);
                return;
            case 23:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                Runnable runnable2 = (Runnable) obj;
                launchActivity4.f32133q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f32135r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f32135r0.getView().getVisibility() == 0) {
                        launchActivity4.f32135r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f32137s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f32137s0.getView().setVisibility(4);
                    }
                }
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) obj;
                if (!((LaunchActivity) obj2).Q && LaunchActivity.E1) {
                    scVar.j();
                    return;
                }
                return;
            case 25:
                Pattern pattern5 = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((ce1) obj);
                return;
            case 26:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                pf.c cVar = (pf.c) obj;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.V0 = null;
                launchActivity5.T0 = null;
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            case 27:
                pf.c cVar2 = (pf.c) obj2;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj;
                Pattern pattern6 = LaunchActivity.B1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    return;
                }
                return;
            case 28:
                jc0 jc0Var = (jc0) obj2;
                TLObject tLObject4 = (TLObject) obj;
                jc0Var.c();
                if (tLObject4 != null) {
                    jc0Var.f37343a.j0((TL_account.Password) tLObject4);
                    return;
                }
                return;
            default:
                ((FiltersSetupActivity) obj).X(((jc0) obj2).f37343a.O());
                return;
        }
    }
}
