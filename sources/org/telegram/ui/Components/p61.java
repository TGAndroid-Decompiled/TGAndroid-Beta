package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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
public final class p61 implements Runnable {
    public final int f31560a;
    public final Object f31561b;
    public final Object f31562c;

    public p61(int i9, Object obj, Object obj2) {
        this.f31560a = i9;
        this.f31561b = obj;
        this.f31562c = obj2;
    }

    @Override
    public final void run() {
        int i9;
        String str;
        wk0 wk0Var;
        int i10;
        int i11 = this.f31560a;
        int i12 = 0;
        Object obj = this.f31562c;
        Object obj2 = this.f31561b;
        switch (i11) {
            case 0:
                r61 r61Var = (r61) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (r61Var.f32098w != null) {
                        Bitmap bitmap2 = r61Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        r61Var.v = r61Var.f32098w;
                    }
                    r61Var.f32098w = bitmap;
                    Bitmap bitmap3 = r61Var.f32098w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    r61Var.C = bitmapShader;
                    bitmapShader.setLocalMatrix(r61Var.H);
                    r61Var.F.setShader(r61Var.C);
                    r61Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i9 = (int) (dp / width);
                    } else {
                        i9 = dp;
                        dp = (int) (dp * width);
                    }
                    ViewGroup.LayoutParams layoutParams = r61Var.getLayoutParams();
                    if (r61Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i9) {
                        layoutParams.width = dp;
                        layoutParams.height = i9;
                        r61Var.setVisibility(0);
                        r61Var.requestLayout();
                    }
                }
                r61Var.f32094f = null;
                return;
            case 1:
                final f81 f81Var = (f81) obj2;
                f81Var.f28344e.f28694b.evaluateJavascript((String) obj, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj3) {
                        String str2 = (String) obj3;
                        f81 f81Var2 = f81.this;
                        String[] strArr = f81Var2.f28343c;
                        String str3 = strArr[0];
                        String str4 = f81Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        f81Var2.f28342b.countDown();
                    }
                });
                return;
            case 2:
                ((org.telegram.ui.Components.voip.k) obj2).f33593a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 3:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap = tVar.B.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f33850w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z10) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap.put(str, bitmap4);
                return;
            case 4:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                ((org.telegram.ui.Components.voip.k0) obj2).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.x(tVar2)).setDuration(150L).start();
                return;
            case 5:
                wk0 wk0Var2 = (wk0) obj2;
                if (wk0Var2 != null) {
                    wk0Var2.setOnItemClickListener((mk0) obj);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ot otVar = (org.telegram.ui.ot) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new p61(7, otVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = otVar.f41239f;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    org.telegram.ui.lt ltVar = (org.telegram.ui.lt) obj3;
                    String str2 = ltVar.f40225a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(ltVar.f40225a).toLowerCase();
                    String str4 = ltVar.f40226b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(ltVar.f40226b).toLowerCase();
                    String str5 = ltVar.f40227c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, lowerCase5) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList.add(ltVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new p61(7, otVar, arrayList));
                return;
            case 7:
                org.telegram.ui.ot otVar2 = (org.telegram.ui.ot) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.qt qtVar = otVar2.h;
                if (qtVar.f42191f) {
                    otVar2.f41238e = arrayList3;
                    if (qtVar.f42190e && (wk0Var = qtVar.f42187a) != null) {
                        f2.r0 adapter = wk0Var.getAdapter();
                        org.telegram.ui.ot otVar3 = qtVar.d;
                        if (adapter != otVar3) {
                            qtVar.f42187a.setAdapter(otVar3);
                            qtVar.f42187a.setFastScrollVisible(false);
                        }
                    }
                    otVar2.l();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.st.O((org.telegram.ui.st) obj2, (TLRPC.Updates) obj);
                return;
            case 9:
                org.telegram.ui.dy.c0((org.telegram.ui.dy) obj2, (String) obj);
                return;
            case 10:
                mh.c3.j(((org.telegram.ui.dy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 11:
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.dv(dyVar, 24), 300L);
                return;
            case 12:
                ((org.telegram.ui.cy) obj).f37350a.postOnAnimation(new org.telegram.ui.dv((org.telegram.ui.dy) obj2, 14));
                return;
            case 13:
                org.telegram.ui.dy dyVar2 = (org.telegram.ui.dy) obj2;
                ArrayList<Long> arrayList4 = (ArrayList) obj;
                MessagesController messagesController = dyVar2.getMessagesController();
                if (dyVar2.R2 == 0 && dyVar2.T2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.addDialogToFolder(arrayList4, i10, -1, null, 0L);
                return;
            case 14:
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.dy dyVar3 = ((org.telegram.ui.dw) obj2).f37619b;
                dyVar3.f37734u3 = 2;
                dyVar3.A4(true, true);
                dyVar3.o3();
                while (i12 < arrayList5.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList5.get(i12)).f22384id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i12);
                    if (dyVar3.getMessagesController().isForum(j10) || dyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        dyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    dyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = dyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 15:
                ((org.telegram.ui.dw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 16:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.dy dyVar4 = ((org.telegram.ui.pw) obj2).f41606a;
                dyVar4.D2 = null;
                wp0 wp0Var = dyVar4.C2;
                if (wp0Var != null && wp0Var.h) {
                    wp0Var.e(charSequence, false);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj;
                ((org.telegram.ui.dx) obj2).f37621b.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                    return;
                }
                o2VarArr[0].finishFragment();
                return;
            case 18:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) obj2;
                org.telegram.ui.qn qnVar = pyVar.f41616a;
                cx0 cx0Var = new cx0(qnVar.getParentActivity(), pyVar.f41616a, ((MessageObject) obj).getInputStickerSet(), null, qnVar.U, qnVar.getResourceProvider());
                cx0Var.setCalcMandatoryInsets(qnVar.x9());
                qnVar.showDialog(cx0Var);
                return;
            case 19:
                org.telegram.ui.jz jzVar = (org.telegram.ui.jz) obj2;
                jzVar.getClass();
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                org.telegram.ui.kz kzVar = jzVar.A;
                org.telegram.ui.lz lzVar = kzVar.f39948c;
                Utilities.Callback callback = lzVar.f40262x;
                if (callback != null) {
                    callback.run(lzVar.d);
                }
                kzVar.f39948c.finishFragment();
                return;
            case 20:
                org.telegram.ui.n00 n00Var = (org.telegram.ui.n00) obj2;
                org.telegram.ui.lz lzVar2 = new org.telegram.ui.lz(n00Var.f40570r, ((org.telegram.ui.e00) obj).f37775m);
                lzVar2.f40263y = new org.telegram.ui.oz(n00Var, 1);
                lzVar2.f40262x = new org.telegram.ui.oz(n00Var, 2);
                n00Var.presentFragment(lzVar2);
                return;
            case 21:
                org.telegram.ui.n00 n00Var2 = (org.telegram.ui.n00) obj2;
                Runnable runnable = (Runnable) obj;
                n00Var2.h = false;
                n00Var2.f40571s = false;
                n00Var2.f40570r.flags = n00Var2.f40574y;
                n00Var2.h0(true);
                n00Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.n00 n00Var3 = (org.telegram.ui.n00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList6 = n00Var3.H;
                n00Var3.J = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    n00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    n00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList6.clear();
                    arrayList6.addAll(tL_chatlists_exportedInvites.invites);
                    n00Var3.v0();
                }
                n00Var3.I = 0;
                return;
            case 23:
                org.telegram.ui.n00 n00Var4 = (org.telegram.ui.n00) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                MessagesController.DialogFilter dialogFilter = n00Var4.f40570r;
                if (c2Var != null) {
                    try {
                        c2Var.dismiss();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                n00Var4.getMessagesController().removeFilter(dialogFilter);
                n00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                n00Var4.finishFragment();
                return;
            case 24:
                org.telegram.ui.n00 n00Var5 = (org.telegram.ui.n00) obj2;
                n00Var5.getClass();
                n00Var5.l0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 25:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f35485x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f35485x = true;
                    return;
                }
                return;
            case 26:
                FiltersSetupActivity filtersSetupActivity2 = ((org.telegram.ui.l10) obj2).f39968e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 27:
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((org.telegram.ui.o50) obj2).U1;
                for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList8.get(i14)).f33850w != null) {
                        arrayList7.remove(((org.telegram.ui.Components.voip.t) arrayList8.get(i14)).f33850w);
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
            case 28:
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) obj2;
                o50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                o50Var.dismiss();
                return;
            default:
                org.telegram.ui.v5 v5Var = (org.telegram.ui.v5) obj2;
                try {
                    Bitmap bitmap5 = ((org.telegram.ui.Components.voip.r2) obj).f33777e.getBitmap(100, 100);
                    if (bitmap5 != null) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.x20(0, v5Var, kh.o0.b(bitmap5, true)));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
