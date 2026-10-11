package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ai;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.a00;
import org.telegram.ui.au;
import org.telegram.ui.b00;
import org.telegram.ui.b20;
import org.telegram.ui.dx;
import org.telegram.ui.e00;
import org.telegram.ui.e10;
import org.telegram.ui.ez;
import org.telegram.ui.g60;
import org.telegram.ui.nv;
import org.telegram.ui.rw;
import org.telegram.ui.rx;
import org.telegram.ui.ry;
import org.telegram.ui.s70;
import org.telegram.ui.sy;
import org.telegram.ui.tt;
import org.telegram.ui.v00;
import org.telegram.ui.v5;
import org.telegram.ui.wt;
import org.telegram.ui.yt;
import org.telegram.ui.zn;
import org.telegram.ui.zz;
public final class i implements Runnable {
    public final int f32085a;
    public final Object f32086b;
    public final Object f32087c;

    public i(int i10, Object obj, Object obj2) {
        this.f32085a = i10;
        this.f32086b = obj;
        this.f32087c = obj2;
    }

    @Override
    public final void run() {
        String str;
        rm0 rm0Var;
        int i10;
        int i11 = this.f32085a;
        int i12 = 0;
        Object obj = this.f32087c;
        Object obj2 = this.f32086b;
        switch (i11) {
            case 0:
                ((l) obj2).f32145a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 1:
                v vVar = (v) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap = vVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = vVar.f32403w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z10) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap.put(str, bitmap);
                return;
            case 2:
                v vVar2 = (v) obj;
                ((n0) obj2).getClass();
                vVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new a0(vVar2)).setDuration(150L).start();
                return;
            case 3:
                rm0 rm0Var2 = (rm0) obj2;
                if (rm0Var2 != null) {
                    rm0Var2.setOnItemClickListener((fm0) obj);
                    return;
                }
                return;
            case 4:
                wt wtVar = (wt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new i(5, wtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = wtVar.f43907f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    tt ttVar = (tt) obj3;
                    String str2 = ttVar.f42293a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(ttVar.f42293a).toLowerCase();
                    String str4 = ttVar.f42294b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(ttVar.f42294b).toLowerCase();
                    String str5 = ttVar.f42295c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || ai.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || ai.w(" ", translitSafe, lowerCase5) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList.add(ttVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new i(5, wtVar, arrayList));
                return;
            case 5:
                wt wtVar2 = (wt) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                yt ytVar = wtVar2.h;
                if (ytVar.f44530f) {
                    wtVar2.f43906e = arrayList3;
                    if (ytVar.f44529e && (rm0Var = ytVar.f44526a) != null) {
                        s4.i0 adapter = rm0Var.getAdapter();
                        wt wtVar3 = ytVar.d;
                        if (adapter != wtVar3) {
                            ytVar.f44526a.setAdapter(wtVar3);
                            ytVar.f44526a.setFastScrollVisible(false);
                        }
                    }
                    wtVar2.l();
                    return;
                }
                return;
            case 6:
                au.Q((au) obj2, (TLRPC.Updates) obj);
                return;
            case 7:
                sy.b0((sy) obj2, (String) obj);
                return;
            case 8:
                ei.k3.j(((sy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 9:
                sy syVar = (sy) obj2;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new nv(syVar, 25), 300L);
                return;
            case 10:
                ((ry) obj).f41564a.postOnAnimation(new nv((sy) obj2, 15));
                return;
            case 11:
                sy syVar2 = (sy) obj2;
                ArrayList<Long> arrayList4 = (ArrayList) obj;
                MessagesController messagesController = syVar2.getMessagesController();
                if (syVar2.V2 == 0 && syVar2.X2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList4, i10, -1, null, 0L);
                return;
            case 12:
                ArrayList arrayList5 = (ArrayList) obj;
                sy syVar3 = ((rw) obj2).f41554b;
                syVar3.y3 = 2;
                syVar3.x4(true, true);
                syVar3.l3();
                while (i12 < arrayList5.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList5.get(i12)).f20072id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i12);
                    if (syVar3.getMessagesController().isForum(j3) || syVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        syVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    syVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController2 = syVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 13:
                ((rw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 14:
                CharSequence charSequence = (CharSequence) obj;
                sy syVar4 = ((dx) obj2).f37170a;
                syVar4.H2 = null;
                sr0 sr0Var = syVar4.G2;
                if (sr0Var != null && sr0Var.h) {
                    sr0Var.e(charSequence, false);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.ActionBar.m2[] m2VarArr = (org.telegram.ui.ActionBar.m2[]) obj;
                ((rx) obj2).f41558b.removeSelfFromStack();
                if (m2VarArr[1] != null) {
                    m2VarArr[0].removeSelfFromStack();
                    m2VarArr[1].finishFragment();
                    return;
                }
                m2VarArr[0].finishFragment();
                return;
            case 16:
                ez ezVar = (ez) obj2;
                zn znVar = ezVar.f37514a;
                yy0 yy0Var = new yy0(znVar.getParentActivity(), ezVar.f37514a, ((MessageObject) obj).getInputStickerSet(), null, znVar.Y, znVar.getResourceProvider());
                yy0Var.setCalcMandatoryInsets(znVar.C9());
                znVar.showDialog(yy0Var);
                return;
            case 17:
                zz zzVar = (zz) obj2;
                zzVar.getClass();
                ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                a00 a00Var = zzVar.E;
                b00 b00Var = a00Var.f35861c;
                Utilities.Callback callback = b00Var.f36260x;
                if (callback != null) {
                    callback.run(b00Var.d);
                }
                a00Var.f35861c.finishFragment();
                return;
            case 18:
                e10 e10Var = (e10) obj2;
                b00 b00Var2 = new b00(e10Var.f37209r, ((v00) obj).f42855m);
                b00Var2.f36261y = new e00(e10Var, 1);
                b00Var2.f36260x = new e00(e10Var, 2);
                e10Var.presentFragment(b00Var2);
                return;
            case 19:
                e10 e10Var2 = (e10) obj2;
                Runnable runnable = (Runnable) obj;
                e10Var2.h = false;
                e10Var2.f37210s = false;
                e10Var2.f37209r.flags = e10Var2.f37213y;
                e10Var2.i0(true);
                e10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 20:
                e10 e10Var3 = (e10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = e10Var3.L;
                e10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    e10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    e10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    e10Var3.w0();
                }
                e10Var3.M = 0;
                return;
            case 21:
                e10 e10Var4 = (e10) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj;
                MessagesController.DialogFilter dialogFilter = e10Var4.f37209r;
                if (a2Var != null) {
                    try {
                        a2Var.dismiss();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                e10Var4.getMessagesController().removeFilter(dialogFilter);
                e10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                e10Var4.finishFragment();
                return;
            case 22:
                e10 e10Var5 = (e10) obj2;
                e10Var5.getClass();
                e10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 23:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f33831x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f33831x = true;
                    return;
                }
                return;
            case 24:
                FiltersSetupActivity filtersSetupActivity2 = ((b20) obj2).f36279e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 25:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((g60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((v) arrayList8.get(i14)).f32403w != null) {
                        arrayList7.remove(((v) arrayList8.get(i14)).f32403w);
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
            case 26:
                g60 g60Var = (g60) obj2;
                g60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                g60Var.dismiss();
                return;
            case 27:
                v5 v5Var = (v5) obj2;
                try {
                    Bitmap bitmap2 = ((t2) obj).f32340e.getBitmap(100, 100);
                    if (bitmap2 != null) {
                        AndroidUtilities.runOnUIThread(new i(28, v5Var, ci.m0.b(bitmap2, true)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 28:
                ((g60) ((v5) obj2).f42907b).U0.setNewColors((int[]) obj);
                return;
            default:
                s70.V((s70) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }
}
