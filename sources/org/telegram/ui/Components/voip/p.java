package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
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
import org.telegram.ui.r70;
import org.telegram.ui.rv;
import org.telegram.ui.s70;
import org.telegram.ui.so;
import org.telegram.ui.uw;
import org.telegram.ui.ux;
import org.telegram.ui.uy;
import org.telegram.ui.v70;
import org.telegram.ui.vy;
import org.telegram.ui.xt;
import org.telegram.ui.y00;
import org.telegram.ui.z5;
public final class p implements Runnable {
    public final int f31859a;
    public final Object f31860b;
    public final Object f31861c;

    public p(int i10, Object obj, Object obj2) {
        this.f31859a = i10;
        this.f31860b = obj;
        this.f31861c = obj2;
    }

    @Override
    public final void run() {
        String str;
        wm0 wm0Var;
        int i10;
        int i11 = this.f31859a;
        int i12 = 0;
        Object obj = this.f31861c;
        Object obj2 = this.f31860b;
        switch (i11) {
            case 0:
                v vVar = (v) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap = vVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = vVar.f32025w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z10) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap.put(str, bitmap);
                return;
            case 1:
                v vVar2 = (v) obj2;
                ((n0) obj).getClass();
                vVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new a0(vVar2)).setDuration(150L).start();
                return;
            case 2:
                wm0 wm0Var2 = (wm0) obj2;
                if (wm0Var2 != null) {
                    wm0Var2.setOnItemClickListener((km0) obj);
                    return;
                }
                return;
            case 3:
                au auVar = (au) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new p(4, auVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = auVar.f35981f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    xt xtVar = (xt) obj3;
                    String str2 = xtVar.f44161a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(xtVar.f44161a).toLowerCase();
                    String str4 = xtVar.f44162b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(xtVar.f44162b).toLowerCase();
                    String str5 = xtVar.f44163c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, lowerCase5) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList.add(xtVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new p(4, auVar, arrayList));
                return;
            case 4:
                au auVar2 = (au) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                cu cuVar = auVar2.h;
                if (cuVar.f36515f) {
                    auVar2.f35980e = arrayList3;
                    if (cuVar.f36514e && (wm0Var = cuVar.f36511a) != null) {
                        s4.i0 adapter = wm0Var.getAdapter();
                        au auVar3 = cuVar.d;
                        if (adapter != auVar3) {
                            cuVar.f36511a.setAdapter(auVar3);
                            cuVar.f36511a.setFastScrollVisible(false);
                        }
                    }
                    auVar2.l();
                    return;
                }
                return;
            case 5:
                eu.Q((eu) obj2, (TLRPC.Updates) obj);
                return;
            case 6:
                vy.b0((vy) obj2, (String) obj);
                return;
            case 7:
                ei.k3.j(((vy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 8:
                vy vyVar = (vy) obj2;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new rv(vyVar, 25), 300L);
                return;
            case 9:
                ((uy) obj).f42613a.postOnAnimation(new rv((vy) obj2, 15));
                return;
            case 10:
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
            case 11:
                ArrayList arrayList5 = (ArrayList) obj;
                vy vyVar3 = ((uw) obj2).f42603b;
                vyVar3.y3 = 2;
                vyVar3.x4(true, true);
                vyVar3.l3();
                while (i12 < arrayList5.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList5.get(i12)).f19807id;
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
            case 12:
                ((uw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 13:
                CharSequence charSequence = (CharSequence) obj;
                vy vyVar4 = ((gx) obj2).f38170a;
                vyVar4.H2 = null;
                xr0 xr0Var = vyVar4.G2;
                if (xr0Var != null && xr0Var.h) {
                    xr0Var.e(charSequence, false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ActionBar.m2[] m2VarArr = (org.telegram.ui.ActionBar.m2[]) obj;
                ((ux) obj2).f42607b.removeSelfFromStack();
                if (m2VarArr[1] != null) {
                    m2VarArr[0].removeSelfFromStack();
                    m2VarArr[1].finishFragment();
                    return;
                }
                m2VarArr[0].finishFragment();
                return;
            case 15:
                hz hzVar = (hz) obj2;
                eo eoVar = hzVar.f38564a;
                dz0 dz0Var = new dz0(eoVar.getParentActivity(), hzVar.f38564a, ((MessageObject) obj).getInputStickerSet(), null, eoVar.Y, eoVar.getResourceProvider());
                dz0Var.setCalcMandatoryInsets(eoVar.C9());
                eoVar.showDialog(dz0Var);
                return;
            case 16:
                c00 c00Var = (c00) obj2;
                c00Var.getClass();
                ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                d00 d00Var = c00Var.E;
                e00 e00Var = d00Var.f36591c;
                Utilities.Callback callback = e00Var.f36954x;
                if (callback != null) {
                    callback.run(e00Var.d);
                }
                d00Var.f36591c.finishFragment();
                return;
            case 17:
                h10 h10Var = (h10) obj2;
                e00 e00Var2 = new e00(h10Var.f38218r, ((y00) obj).f44233m);
                e00Var2.f36955y = new h00(h10Var, 1);
                e00Var2.f36954x = new h00(h10Var, 2);
                h10Var.presentFragment(e00Var2);
                return;
            case 18:
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
            case 19:
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
            case 20:
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
            case 21:
                h10 h10Var5 = (h10) obj2;
                h10Var5.getClass();
                h10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 22:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33608x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f33608x = true;
                    return;
                }
                return;
            case 23:
                FiltersSetupActivity filtersSetupActivity2 = ((e20) obj2).f36964e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 24:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((i60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((v) arrayList8.get(i14)).f32025w != null) {
                        arrayList7.remove(((v) arrayList8.get(i14)).f32025w);
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
            case 25:
                i60 i60Var = (i60) obj2;
                i60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                i60Var.dismiss();
                return;
            case 26:
                z5 z5Var = (z5) obj2;
                try {
                    Bitmap bitmap2 = ((t2) obj).f31962e.getBitmap(100, 100);
                    if (bitmap2 != null) {
                        AndroidUtilities.runOnUIThread(new p(27, z5Var, ci.m0.b(bitmap2, true)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 27:
                ((i60) ((z5) obj2).f44623b).U0.setNewColors((int[]) obj);
                return;
            case 28:
                v70.V((v70) obj2, (TLRPC.TL_error) obj);
                return;
            default:
                r70 r70Var = (r70) obj2;
                String str6 = (String) obj;
                s70 s70Var = r70Var.f41523a;
                s70Var.f41829e = str6;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str6;
                s70Var.f41828c = s70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new so(24, r70Var, str6), 66);
                return;
        }
    }

    public p(n0 n0Var, v vVar) {
        this.f31859a = 1;
        this.f31861c = n0Var;
        this.f31860b = vVar;
    }
}
