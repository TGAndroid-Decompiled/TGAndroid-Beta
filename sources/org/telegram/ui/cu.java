package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class cu implements Runnable {
    public final int f32799a;
    public final Object f32800b;
    public final Object f32801c;

    public cu(int i10, Object obj, Object obj2) {
        this.f32799a = i10;
        this.f32800b = obj;
        this.f32801c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i11 = this.f32799a;
        int i12 = 0;
        Object obj = this.f32801c;
        Object obj2 = this.f32800b;
        switch (i11) {
            case 0:
                du.P((du) obj2, (TLRPC.Updates) obj);
                return;
            case 1:
                uy.e0((uy) obj2, (String) obj);
                return;
            case 2:
                ei.k3.j(((uy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 3:
                uy uyVar = (uy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new qv(uyVar, 24), 300L);
                return;
            case 4:
                ((ty) obj).f37826a.postOnAnimation(new qv((uy) obj2, 14));
                return;
            case 5:
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
            case 6:
                ArrayList arrayList2 = (ArrayList) obj;
                uy uyVar3 = ((tw) obj2).f37815b;
                uyVar3.y3 = 2;
                uyVar3.A4(true, true);
                uyVar3.o3();
                while (i12 < arrayList2.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList2.get(i12)).f18300id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (uyVar3.getMessagesController().isForum(j3) || uyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        uyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    uyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = uyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 7:
                ((tw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 8:
                CharSequence charSequence = (CharSequence) obj;
                uy uyVar4 = ((fx) obj2).f33636a;
                uyVar4.H2 = null;
                org.telegram.ui.Components.ar0 ar0Var = uyVar4.G2;
                if (ar0Var != null && ar0Var.h) {
                    ar0Var.e(charSequence, false);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((tx) obj2).f37825b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    return;
                }
                n2VarArr[0].finishFragment();
                return;
            case 10:
                gz gzVar = (gz) obj2;
                zn znVar = gzVar.f33969a;
                org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(znVar.getParentActivity(), gzVar.f33969a, ((MessageObject) obj).getInputStickerSet(), null, znVar.Y, znVar.getResourceProvider());
                hy0Var.setCalcMandatoryInsets(znVar.x9());
                znVar.showDialog(hy0Var);
                return;
            case 11:
                a00 a00Var = (a00) obj2;
                a00Var.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                b00 b00Var = a00Var.E;
                c00 c00Var = b00Var.f32209c;
                Utilities.Callback callback = c00Var.f32485x;
                if (callback != null) {
                    callback.run(c00Var.d);
                }
                b00Var.f32209c.finishFragment();
                return;
            case 12:
                f10 f10Var = (f10) obj2;
                c00 c00Var2 = new c00(f10Var.f33395r, ((w00) obj).f38657m);
                c00Var2.f32486y = new f00(f10Var, 1);
                c00Var2.f32485x = new f00(f10Var, 2);
                f10Var.presentFragment(c00Var2);
                return;
            case 13:
                f10 f10Var2 = (f10) obj2;
                Runnable runnable = (Runnable) obj;
                f10Var2.h = false;
                f10Var2.f33396s = false;
                f10Var2.f33395r.flags = f10Var2.f33399y;
                f10Var2.i0(true);
                f10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
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
            case 15:
                f10 f10Var4 = (f10) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = f10Var4.f33395r;
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
            case 16:
                f10 f10Var5 = (f10) obj2;
                f10Var5.getClass();
                f10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 17:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f31051x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f31051x = true;
                    return;
                }
                return;
            case 18:
                FiltersSetupActivity filtersSetupActivity2 = ((e20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 19:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((i60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f29564w != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.u) arrayList5.get(i14)).f29564w);
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
            case 20:
                i60 i60Var = (i60) obj2;
                i60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                i60Var.dismiss();
                return;
            case 21:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new cu(22, w5Var, ci.n0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 22:
                ((i60) ((w5) obj2).f38699b).U0.setNewColors((int[]) obj);
                return;
            case 23:
                t70.V((t70) obj2, (TLRPC.TL_error) obj);
                return;
            case 24:
                p70 p70Var = (p70) obj2;
                String str = (String) obj;
                q70 q70Var = p70Var.f36364a;
                q70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                q70Var.f36708c = q70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new oo(24, p70Var, str), 66);
                return;
            case 25:
                TLObject tLObject2 = (TLObject) obj;
                q70 q70Var2 = ((p70) obj2).f36364a;
                if (tLObject2 != null) {
                    t70.a0(q70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    t70.a0(q70Var2.h, null);
                    return;
                }
            case 26:
                s70 s70Var = (s70) obj2;
                String str2 = (String) obj;
                s70Var.h = str2;
                t70 t70Var = s70Var.f37213r;
                if (t70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f18406q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f18408q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                s70Var.f37212n = t70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ba(s70Var, str2, str2, 14), 66);
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.h6(6, (m80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 28:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f31054c.l();
                return;
            default:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new cu(28, languageSelectActivity2, new ArrayList()));
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
                int size2 = languageSelectActivity2.f31055f.size();
                while (i12 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f31055f.get(i12);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList6.add(localeInfo2);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(new cu(28, languageSelectActivity2, arrayList6));
                return;
        }
    }
}
