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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.c70;
import org.telegram.ui.ev;
import org.telegram.ui.ey;
import org.telegram.ui.fw;
import org.telegram.ui.fx;
import org.telegram.ui.fy;
import org.telegram.ui.g00;
import org.telegram.ui.lt;
import org.telegram.ui.lz;
import org.telegram.ui.mz;
import org.telegram.ui.n10;
import org.telegram.ui.nz;
import org.telegram.ui.p00;
import org.telegram.ui.pt;
import org.telegram.ui.qz;
import org.telegram.ui.r50;
import org.telegram.ui.rt;
import org.telegram.ui.rw;
import org.telegram.ui.ry;
import org.telegram.ui.tn;
import org.telegram.ui.tt;
import org.telegram.ui.w5;
import org.telegram.ui.y60;
import org.telegram.ui.z60;
import org.telegram.ui.zg;
public final class o implements Runnable {
    public final int f33869a;
    public final Object f33870b;
    public final Object f33871c;

    public o(int i10, Object obj, Object obj2) {
        this.f33869a = i10;
        this.f33870b = obj;
        this.f33871c = obj2;
    }

    @Override
    public final void run() {
        String str;
        jl0 jl0Var;
        int i10;
        int i11 = this.f33869a;
        int i12 = 0;
        Object obj = this.f33871c;
        Object obj2 = this.f33870b;
        switch (i11) {
            case 0:
                u uVar = (u) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap = uVar.B.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f34043w;
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
                u uVar2 = (u) obj2;
                ((l0) obj).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new y(uVar2)).setDuration(150L).start();
                return;
            case 2:
                jl0 jl0Var2 = (jl0) obj2;
                if (jl0Var2 != null) {
                    jl0Var2.setOnItemClickListener((zk0) obj);
                    return;
                }
                return;
            case 3:
                pt ptVar = (pt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new o(4, ptVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = ptVar.f41461f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    lt ltVar = (lt) obj3;
                    String str2 = ltVar.f40272a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(ltVar.f40272a).toLowerCase();
                    String str4 = ltVar.f40273b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(ltVar.f40273b).toLowerCase();
                    String str5 = ltVar.f40274c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || x3.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || x3.w(" ", translitSafe, lowerCase5) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList.add(ltVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new o(4, ptVar, arrayList));
                return;
            case 4:
                pt ptVar2 = (pt) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                rt rtVar = ptVar2.h;
                if (rtVar.f42201f) {
                    ptVar2.f41460e = arrayList3;
                    if (rtVar.f42200e && (jl0Var = rtVar.f42197a) != null) {
                        f2.p0 adapter = jl0Var.getAdapter();
                        pt ptVar3 = rtVar.d;
                        if (adapter != ptVar3) {
                            rtVar.f42197a.setAdapter(ptVar3);
                            rtVar.f42197a.setFastScrollVisible(false);
                        }
                    }
                    ptVar2.l();
                    return;
                }
                return;
            case 5:
                tt.P((tt) obj2, (TLRPC.Updates) obj);
                return;
            case 6:
                fy.d0((fy) obj2, (String) obj);
                return;
            case 7:
                ph.p2.j(((fy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 8:
                fy fyVar = (fy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new ev(fyVar, 24), 300L);
                return;
            case 9:
                ((ey) obj).f37921a.postOnAnimation(new ev((fy) obj2, 14));
                return;
            case 10:
                fy fyVar2 = (fy) obj2;
                ArrayList<Long> arrayList4 = (ArrayList) obj;
                MessagesController messagesController = fyVar2.getMessagesController();
                if (fyVar2.R2 == 0 && fyVar2.T2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList4, i10, -1, null, 0L);
                return;
            case 11:
                ArrayList arrayList5 = (ArrayList) obj;
                fy fyVar3 = ((fw) obj2).f38242b;
                fyVar3.f38361u3 = 2;
                fyVar3.A4(true, true);
                fyVar3.o3();
                while (i12 < arrayList5.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList5.get(i12)).f22396id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i12);
                    if (fyVar3.getMessagesController().isForum(j10) || fyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        fyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    fyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = fyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 12:
                ((fw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 13:
                CharSequence charSequence = (CharSequence) obj;
                fy fyVar4 = ((rw) obj2).f42213a;
                fyVar4.D2 = null;
                iq0 iq0Var = fyVar4.C2;
                if (iq0Var != null && iq0Var.h) {
                    iq0Var.e(charSequence, false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj;
                ((fx) obj2).f38248b.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                    return;
                }
                o2VarArr[0].finishFragment();
                return;
            case 15:
                ry ryVar = (ry) obj2;
                tn tnVar = ryVar.f42225a;
                nx0 nx0Var = new nx0(tnVar.getParentActivity(), ryVar.f42225a, ((MessageObject) obj).getInputStickerSet(), null, tnVar.U, tnVar.getResourceProvider());
                nx0Var.setCalcMandatoryInsets(tnVar.x9());
                tnVar.showDialog(nx0Var);
                return;
            case 16:
                lz lzVar = (lz) obj2;
                lzVar.getClass();
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                mz mzVar = lzVar.A;
                nz nzVar = mzVar.f40653c;
                Utilities.Callback callback = nzVar.f40938x;
                if (callback != null) {
                    callback.run(nzVar.d);
                }
                mzVar.f40653c.finishFragment();
                return;
            case 17:
                p00 p00Var = (p00) obj2;
                nz nzVar2 = new nz(p00Var.f41266r, ((g00) obj).f38409m);
                nzVar2.f40939y = new qz(p00Var, 1);
                nzVar2.f40938x = new qz(p00Var, 2);
                p00Var.presentFragment(nzVar2);
                return;
            case 18:
                p00 p00Var2 = (p00) obj2;
                Runnable runnable = (Runnable) obj;
                p00Var2.h = false;
                p00Var2.f41267s = false;
                p00Var2.f41266r.flags = p00Var2.f41270y;
                p00Var2.i0(true);
                p00Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 19:
                p00 p00Var3 = (p00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = p00Var3.H;
                p00Var3.J = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    p00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    p00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    p00Var3.w0();
                }
                p00Var3.I = 0;
                return;
            case 20:
                p00 p00Var4 = (p00) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                MessagesController.DialogFilter dialogFilter = p00Var4.f41266r;
                if (c2Var != null) {
                    try {
                        c2Var.dismiss();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                p00Var4.getMessagesController().removeFilter(dialogFilter);
                p00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                p00Var4.finishFragment();
                return;
            case 21:
                p00 p00Var5 = (p00) obj2;
                p00Var5.getClass();
                p00Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 22:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f35552x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f35552x = true;
                    return;
                }
                return;
            case 23:
                FiltersSetupActivity filtersSetupActivity2 = ((n10) obj2).f40685e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 24:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((r50) obj2).U1;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((u) arrayList8.get(i14)).f34043w != null) {
                        arrayList7.remove(((u) arrayList8.get(i14)).f34043w);
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
                r50 r50Var = (r50) obj2;
                r50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                r50Var.dismiss();
                return;
            case 26:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap2 = ((u2) obj).f34057e.getBitmap(100, 100);
                    if (bitmap2 != null) {
                        AndroidUtilities.runOnUIThread(new o(27, w5Var, nh.n0.b(bitmap2, true)));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 27:
                ((r50) ((w5) obj2).f43838b).Q0.setNewColors((int[]) obj);
                return;
            case 28:
                c70.V((c70) obj2, (TLRPC.TL_error) obj);
                return;
            default:
                y60 y60Var = (y60) obj2;
                String str6 = (String) obj;
                z60 z60Var = y60Var.f44755a;
                z60Var.f45091e = str6;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str6;
                z60Var.f45090c = z60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new zg(27, y60Var, str6), 66);
                return;
        }
    }

    public o(l0 l0Var, u uVar) {
        this.f33869a = 1;
        this.f33871c = l0Var;
        this.f33870b = uVar;
    }
}
