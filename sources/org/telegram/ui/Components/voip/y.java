package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
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
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.xr0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.au;
import org.telegram.ui.c00;
import org.telegram.ui.cu;
import org.telegram.ui.d00;
import org.telegram.ui.e00;
import org.telegram.ui.e20;
import org.telegram.ui.eo;
import org.telegram.ui.eu;
import org.telegram.ui.gx;
import org.telegram.ui.h00;
import org.telegram.ui.h10;
import org.telegram.ui.hz;
import org.telegram.ui.i60;
import org.telegram.ui.q70;
import org.telegram.ui.r70;
import org.telegram.ui.rv;
import org.telegram.ui.so;
import org.telegram.ui.uw;
import org.telegram.ui.ux;
import org.telegram.ui.uy;
import org.telegram.ui.v70;
import org.telegram.ui.vy;
import org.telegram.ui.xt;
import org.telegram.ui.y00;
import org.telegram.ui.z5;
public final class y implements Runnable {
    public final int f32115a;
    public final Object f32116b;
    public final Object f32117c;

    public y(int i10, Object obj, Object obj2) {
        this.f32115a = i10;
        this.f32116b = obj;
        this.f32117c = obj2;
    }

    @Override
    public final void run() {
        wm0 wm0Var;
        int i10;
        int i11 = this.f32115a;
        int i12 = 0;
        Object obj = this.f32117c;
        Object obj2 = this.f32116b;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                ((n0) obj2).getClass();
                uVar.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new a0(uVar)).setDuration(150L).start();
                return;
            case 1:
                wm0 wm0Var2 = (wm0) obj2;
                if (wm0Var2 != null) {
                    wm0Var2.setOnItemClickListener((km0) obj);
                    return;
                }
                return;
            case 2:
                au auVar = (au) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new y(3, auVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = auVar.f35979f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    xt xtVar = (xt) obj3;
                    String str = xtVar.f44156a;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String lowerCase2 = str.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(xtVar.f44156a).toLowerCase();
                    String str3 = xtVar.f44157b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase4 = str3.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(xtVar.f44157b).toLowerCase();
                    String str4 = xtVar.f44158c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = "+".concat(str4);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, lowerCase5) || str4.startsWith(lowerCase) || str2.startsWith(lowerCase)) {
                        arrayList.add(xtVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new y(3, auVar, arrayList));
                return;
            case 3:
                au auVar2 = (au) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                cu cuVar = auVar2.h;
                if (cuVar.f36513f) {
                    auVar2.f35978e = arrayList3;
                    if (cuVar.f36512e && (wm0Var = cuVar.f36509a) != null) {
                        s4.i0 adapter = wm0Var.getAdapter();
                        au auVar3 = cuVar.d;
                        if (adapter != auVar3) {
                            cuVar.f36509a.setAdapter(auVar3);
                            cuVar.f36509a.setFastScrollVisible(false);
                        }
                    }
                    auVar2.l();
                    return;
                }
                return;
            case 4:
                eu.Q((eu) obj2, (TLRPC.Updates) obj);
                return;
            case 5:
                vy.b0((vy) obj2, (String) obj);
                return;
            case 6:
                ei.k3.j(((vy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 7:
                vy vyVar = (vy) obj2;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new rv(vyVar, 25), 300L);
                return;
            case 8:
                ((uy) obj).f42611a.postOnAnimation(new rv((vy) obj2, 15));
                return;
            case 9:
                vy vyVar2 = (vy) obj2;
                ArrayList<Long> arrayList4 = (ArrayList) obj;
                MessagesController messagesController = vyVar2.getMessagesController();
                if (vyVar2.V2 == 0 && vyVar2.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList4, i10, -1, null, 0L);
                return;
            case 10:
                ArrayList arrayList5 = (ArrayList) obj;
                vy vyVar3 = ((uw) obj2).f42601b;
                vyVar3.y3 = 2;
                vyVar3.x4(true, true);
                vyVar3.l3();
                while (i12 < arrayList5.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList5.get(i12)).f19806id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i12);
                    if (vyVar3.getMessagesController().isForum(j3) || vyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        vyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    vyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = vyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 11:
                ((uw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                vy vyVar4 = ((gx) obj2).f38170a;
                vyVar4.H2 = null;
                xr0 xr0Var = vyVar4.G2;
                if (xr0Var != null && xr0Var.h) {
                    xr0Var.e(charSequence, false);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.m2[] m2VarArr = (org.telegram.ui.ActionBar.m2[]) obj;
                ((ux) obj2).f42605b.removeSelfFromStack();
                if (m2VarArr[1] != null) {
                    m2VarArr[0].removeSelfFromStack();
                    m2VarArr[1].finishFragment();
                    return;
                }
                m2VarArr[0].finishFragment();
                return;
            case 14:
                hz hzVar = (hz) obj2;
                eo eoVar = hzVar.f38561a;
                dz0 dz0Var = new dz0(eoVar.getParentActivity(), hzVar.f38561a, ((MessageObject) obj).getInputStickerSet(), null, eoVar.Y, eoVar.getResourceProvider());
                dz0Var.setCalcMandatoryInsets(eoVar.C9());
                eoVar.showDialog(dz0Var);
                return;
            case 15:
                c00 c00Var = (c00) obj2;
                c00Var.getClass();
                ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                d00 d00Var = c00Var.E;
                e00 e00Var = d00Var.f36589c;
                Utilities.Callback callback = e00Var.f36950x;
                if (callback != null) {
                    callback.run(e00Var.d);
                }
                d00Var.f36589c.finishFragment();
                return;
            case 16:
                h10 h10Var = (h10) obj2;
                e00 e00Var2 = new e00(h10Var.f38218r, ((y00) obj).f44228m);
                e00Var2.f36951y = new h00(h10Var, 1);
                e00Var2.f36950x = new h00(h10Var, 2);
                h10Var.presentFragment(e00Var2);
                return;
            case 17:
                h10 h10Var2 = (h10) obj2;
                Runnable runnable = (Runnable) obj;
                h10Var2.h = false;
                h10Var2.f38219s = false;
                h10Var2.f38218r.flags = h10Var2.f38222y;
                h10Var2.i0(true);
                h10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 18:
                h10 h10Var3 = (h10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = h10Var3.L;
                h10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    h10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    h10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    h10Var3.w0();
                }
                h10Var3.M = 0;
                return;
            case 19:
                h10 h10Var4 = (h10) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj;
                MessagesController.DialogFilter dialogFilter = h10Var4.f38218r;
                if (a2Var != null) {
                    try {
                        a2Var.dismiss();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                h10Var4.getMessagesController().removeFilter(dialogFilter);
                h10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                h10Var4.finishFragment();
                return;
            case 20:
                h10 h10Var5 = (h10) obj2;
                h10Var5.getClass();
                h10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 21:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33606x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f33606x = true;
                    return;
                }
                return;
            case 22:
                FiltersSetupActivity filtersSetupActivity2 = ((e20) obj2).f36960e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 23:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((i60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((u) arrayList8.get(i14)).f32024w != null) {
                        arrayList7.remove(((u) arrayList8.get(i14)).f32024w);
                    }
                }
                while (i12 < arrayList7.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList7.get(i12);
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
            case 24:
                i60 i60Var = (i60) obj2;
                i60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                i60Var.dismiss();
                return;
            case 25:
                z5 z5Var = (z5) obj2;
                try {
                    Bitmap bitmap = ((t2) obj).f31985e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new y(26, z5Var, ci.m0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 26:
                ((i60) ((z5) obj2).f44618b).U0.setNewColors((int[]) obj);
                return;
            case 27:
                v70.V((v70) obj2, (TLRPC.TL_error) obj);
                return;
            case 28:
                q70 q70Var = (q70) obj2;
                String str5 = (String) obj;
                r70 r70Var = q70Var.f41203a;
                r70Var.f41522e = str5;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str5;
                r70Var.f41521c = r70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new so(24, q70Var, str5), 66);
                return;
            default:
                TLObject tLObject2 = (TLObject) obj;
                r70 r70Var2 = ((q70) obj2).f41203a;
                if (tLObject2 != null) {
                    v70.a0(r70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    v70.a0(r70Var2.h, null);
                    return;
                }
        }
    }
}
