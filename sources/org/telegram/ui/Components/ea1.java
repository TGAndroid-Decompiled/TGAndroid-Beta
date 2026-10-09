package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.FiltersSetupActivity;
public final class ea1 implements Runnable {
    public final int f26018a;
    public final Object f26019b;
    public final Object f26020c;

    public ea1(int i10, Object obj, Object obj2) {
        this.f26018a = i10;
        this.f26019b = obj;
        this.f26020c = obj2;
    }

    @Override
    public final void run() {
        String str;
        qm0 qm0Var;
        int i10;
        int i11 = this.f26018a;
        int i12 = 0;
        Object obj = this.f26020c;
        Object obj2 = this.f26019b;
        switch (i11) {
            case 0:
                final ga1 ga1Var = (ga1) obj2;
                ga1Var.f26656e.f27014b.evaluateJavascript((String) obj, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj3) {
                        String str2 = (String) obj3;
                        ga1 ga1Var2 = ga1.this;
                        String[] strArr = ga1Var2.f26655c;
                        String str3 = strArr[0];
                        String str4 = ga1Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        ga1Var2.f26654b.countDown();
                    }
                });
                return;
            case 1:
                ((org.telegram.ui.Components.voip.k) obj2).f32022a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 2:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f32280w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z10) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap.put(str, bitmap);
                return;
            case 3:
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj;
                ((org.telegram.ui.Components.voip.m0) obj2).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            case 4:
                qm0 qm0Var2 = (qm0) obj2;
                if (qm0Var2 != null) {
                    qm0Var2.setOnItemClickListener((em0) obj);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.xt xtVar = (org.telegram.ui.xt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ea1(6, xtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = xtVar.f44146f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    org.telegram.ui.ut utVar = (org.telegram.ui.ut) obj3;
                    String str2 = utVar.f42547a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(utVar.f42547a).toLowerCase();
                    String str4 = utVar.f42548b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(utVar.f42548b).toLowerCase();
                    String str5 = utVar.f42549c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, lowerCase5) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList.add(utVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new ea1(6, xtVar, arrayList));
                return;
            case 6:
                org.telegram.ui.xt xtVar2 = (org.telegram.ui.xt) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.zt ztVar = xtVar2.h;
                if (ztVar.f45063f) {
                    xtVar2.f44145e = arrayList3;
                    if (ztVar.f45062e && (qm0Var = ztVar.f45059a) != null) {
                        s4.i0 adapter = qm0Var.getAdapter();
                        org.telegram.ui.xt xtVar3 = ztVar.d;
                        if (adapter != xtVar3) {
                            ztVar.f45059a.setAdapter(xtVar3);
                            ztVar.f45059a.setFastScrollVisible(false);
                        }
                    }
                    xtVar2.l();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.bu.Q((org.telegram.ui.bu) obj2, (TLRPC.Updates) obj);
                return;
            case 8:
                org.telegram.ui.ty.b0((org.telegram.ui.ty) obj2, (String) obj);
                return;
            case 9:
                ei.k3.j(((org.telegram.ui.ty) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 10:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ov(tyVar, 25), 300L);
                return;
            case 11:
                ((org.telegram.ui.sy) obj).f41788a.postOnAnimation(new org.telegram.ui.ov((org.telegram.ui.ty) obj2, 15));
                return;
            case 12:
                org.telegram.ui.ty tyVar2 = (org.telegram.ui.ty) obj2;
                ArrayList<Long> arrayList4 = (ArrayList) obj;
                MessagesController messagesController = tyVar2.getMessagesController();
                if (tyVar2.V2 == 0 && tyVar2.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList4, i10, -1, null, 0L);
                return;
            case 13:
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.ty tyVar3 = ((org.telegram.ui.sw) obj2).f41778b;
                tyVar3.y3 = 2;
                tyVar3.x4(true, true);
                tyVar3.l3();
                while (i12 < arrayList5.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList5.get(i12)).f20042id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i12);
                    if (tyVar3.getMessagesController().isForum(j3) || tyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        tyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    tyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = tyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 14:
                ((org.telegram.ui.sw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 15:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.ty tyVar4 = ((org.telegram.ui.ex) obj2).f37377a;
                tyVar4.H2 = null;
                rr0 rr0Var = tyVar4.G2;
                if (rr0Var != null && rr0Var.h) {
                    rr0Var.e(charSequence, false);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((org.telegram.ui.sx) obj2).f41782b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    return;
                }
                n2VarArr[0].finishFragment();
                return;
            case 17:
                org.telegram.ui.fz fzVar = (org.telegram.ui.fz) obj2;
                org.telegram.ui.zn znVar = fzVar.f37717a;
                xy0 xy0Var = new xy0(znVar.getParentActivity(), fzVar.f37717a, ((MessageObject) obj).getInputStickerSet(), null, znVar.Y, znVar.getResourceProvider());
                xy0Var.setCalcMandatoryInsets(znVar.C9());
                znVar.showDialog(xy0Var);
                return;
            case 18:
                org.telegram.ui.a00 a00Var = (org.telegram.ui.a00) obj2;
                a00Var.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                org.telegram.ui.b00 b00Var = a00Var.E;
                org.telegram.ui.c00 c00Var = b00Var.f36080c;
                Utilities.Callback callback = c00Var.f36480x;
                if (callback != null) {
                    callback.run(c00Var.d);
                }
                b00Var.f36080c.finishFragment();
                return;
            case 19:
                org.telegram.ui.f10 f10Var = (org.telegram.ui.f10) obj2;
                org.telegram.ui.c00 c00Var2 = new org.telegram.ui.c00(f10Var.f37416r, ((org.telegram.ui.w00) obj).f43033m);
                c00Var2.f36481y = new org.telegram.ui.f00(f10Var, 1);
                c00Var2.f36480x = new org.telegram.ui.f00(f10Var, 2);
                f10Var.presentFragment(c00Var2);
                return;
            case 20:
                org.telegram.ui.f10 f10Var2 = (org.telegram.ui.f10) obj2;
                Runnable runnable = (Runnable) obj;
                f10Var2.h = false;
                f10Var2.f37417s = false;
                f10Var2.f37416r.flags = f10Var2.f37420y;
                f10Var2.i0(true);
                f10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 21:
                org.telegram.ui.f10 f10Var3 = (org.telegram.ui.f10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = f10Var3.L;
                f10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    f10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    f10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    f10Var3.w0();
                }
                f10Var3.M = 0;
                return;
            case 22:
                org.telegram.ui.f10 f10Var4 = (org.telegram.ui.f10) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = f10Var4.f37416r;
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
            case 23:
                org.telegram.ui.f10 f10Var5 = (org.telegram.ui.f10) obj2;
                f10Var5.getClass();
                f10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 24:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33769x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f33769x = true;
                    return;
                }
                return;
            case 25:
                FiltersSetupActivity filtersSetupActivity2 = ((org.telegram.ui.c20) obj2).f36499e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 26:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((org.telegram.ui.g60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList8.get(i14)).f32280w != null) {
                        arrayList7.remove(((org.telegram.ui.Components.voip.u) arrayList8.get(i14)).f32280w);
                    }
                }
                while (i12 < arrayList7.size()) {
                    ChatObject.VideoParticipant videoParticipant2 = (ChatObject.VideoParticipant) arrayList7.get(i12);
                    if (videoParticipant2.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant2.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant2.participant, videoParticipant2.presentation);
                    }
                    i12++;
                }
                return;
            case 27:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) obj2;
                g60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                g60Var.dismiss();
                return;
            case 28:
                org.telegram.ui.w5 w5Var = (org.telegram.ui.w5) obj2;
                try {
                    Bitmap bitmap2 = ((org.telegram.ui.Components.voip.s2) obj).f32217e.getBitmap(100, 100);
                    if (bitmap2 != null) {
                        AndroidUtilities.runOnUIThread(new ea1(29, w5Var, ci.m0.b(bitmap2, true)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                ((org.telegram.ui.g60) ((org.telegram.ui.w5) obj2).f43090b).U0.setNewColors((int[]) obj);
                return;
        }
    }
}
