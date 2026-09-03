package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k41 implements Runnable {
    public final int f26162a;
    public final Object f26163b;
    public final Object f26164c;

    public k41(int i10, Object obj, Object obj2) {
        this.f26162a = i10;
        this.f26163b = obj;
        this.f26164c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        rl0 rl0Var;
        int i11;
        int i12 = this.f26162a;
        ArrayList arrayList = null;
        int i13 = 0;
        Object obj = this.f26164c;
        Object obj2 = this.f26163b;
        switch (i12) {
            case 0:
                ((TranslateController) obj).setHideTranslateDialog(((org.telegram.ui.yk) obj2).f26959b, false);
                return;
            case 1:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.f23193s.presentFragment(new org.telegram.ui.lo0((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                int i14 = UndoView.f23185b0;
                undoView.getClass();
                return;
            case 2:
                ((i51) obj2).D.onClick((org.telegram.ui.Cells.q8) obj);
                return;
            case 3:
                i71 i71Var = (i71) obj2;
                j3.t1 t1Var = (j3.t1) obj;
                Throwable cause = t1Var.getCause();
                if ((cause instanceof d4.l) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(t1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = i71.f25619i0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = i71Var.K;
                    if (arrayList2 != null) {
                        int i15 = 0;
                        while (i15 < arrayList2.size()) {
                            e71 e71Var = (e71) arrayList2.get(i15);
                            int i16 = 0;
                            while (true) {
                                ArrayList arrayList3 = e71Var.d;
                                if (i16 < arrayList3.size()) {
                                    g71 g71Var = (g71) arrayList3.get(i16);
                                    if (!TextUtils.isEmpty(g71Var.f25083m) && !i71.Y(g71Var.f25083m)) {
                                        arrayList3.remove(i16);
                                        i16--;
                                    }
                                    i16++;
                                } else {
                                    if (arrayList3.isEmpty()) {
                                        arrayList2.remove(i15);
                                        i15--;
                                    }
                                    i15++;
                                }
                            }
                        }
                        arrayList = arrayList2;
                    }
                    i71Var.K = arrayList;
                    if (arrayList != null) {
                        i71Var.F(arrayList, i71Var.L);
                        return;
                    }
                    return;
                }
                TextureView textureView = i71Var.f25630n;
                if (textureView != null && ((!i71Var.B && (cause instanceof d4.p)) || (cause instanceof i5.m))) {
                    i71Var.B = true;
                    if (i71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(i71Var.f25630n);
                            viewGroup.removeView(i71Var.f25630n);
                            viewGroup.addView(i71Var.f25630n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = i71Var.f25622b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new z61(i71Var, 0));
                            return;
                        }
                        j3.f0 f0Var = i71Var.d;
                        TextureView textureView2 = i71Var.f25630n;
                        f0Var.j0();
                        if (textureView2 != null && textureView2 == f0Var.T) {
                            f0Var.j0();
                            f0Var.U();
                            f0Var.Z(null);
                            f0Var.T(0, 0);
                        }
                        i71Var.d.c0(i71Var.f25630n);
                        ArrayList arrayList4 = i71Var.K;
                        if (arrayList4 != null) {
                            i71Var.F(arrayList4, i71Var.L);
                        } else if (i71Var.R) {
                            i71Var.G(i71Var.N, i71Var.P, i71Var.O, i71Var.Q);
                        } else {
                            i71Var.D(i71Var.N, i71Var.P);
                        }
                        i71Var.C();
                        return;
                    }
                    return;
                }
                i71Var.G.onError(i71Var, t1Var);
                return;
            case 4:
                ((h71) obj2).f25332f.H.onVisualizerUpdate(true, true, (float[]) obj);
                return;
            case 5:
                p71 p71Var = (p71) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (p71Var.f27795w != null) {
                        Bitmap bitmap2 = p71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        p71Var.v = p71Var.f27795w;
                    }
                    p71Var.f27795w = bitmap;
                    Bitmap bitmap3 = p71Var.f27795w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    p71Var.D = bitmapShader;
                    bitmapShader.setLocalMatrix(p71Var.I);
                    p71Var.G.setShader(p71Var.D);
                    p71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        i10 = dp;
                        dp = (int) (dp * width);
                    }
                    ViewGroup.LayoutParams layoutParams = p71Var.getLayoutParams();
                    if (p71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        p71Var.setVisibility(0);
                        p71Var.requestLayout();
                    }
                }
                p71Var.f27791f = null;
                return;
            case 6:
                final d91 d91Var = (d91) obj2;
                d91Var.e.f24532b.evaluateJavascript((String) obj, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj3) {
                        String str2 = (String) obj3;
                        d91 d91Var2 = d91.this;
                        String[] strArr = d91Var2.f24236c;
                        String str3 = strArr[0];
                        String str4 = d91Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        d91Var2.f24235b.countDown();
                    }
                });
                return;
            case 7:
                ((org.telegram.ui.Components.voip.k) obj2).f29680a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 8:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap2 = tVar.C.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f29919w;
                boolean z4 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z4) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 9:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                ((org.telegram.ui.Components.voip.k0) obj2).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.x(tVar2)).setDuration(150L).start();
                return;
            case 10:
                rl0 rl0Var2 = (rl0) obj2;
                if (rl0Var2 != null) {
                    rl0Var2.setOnItemClickListener((hl0) obj);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.yt ytVar = (org.telegram.ui.yt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new k41(12, ytVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = ytVar.f40326f;
                int size = arrayList6.size();
                while (i13 < size) {
                    Object obj3 = arrayList6.get(i13);
                    i13++;
                    org.telegram.ui.ut utVar = (org.telegram.ui.ut) obj3;
                    String str2 = utVar.f38913a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(utVar.f38913a).toLowerCase();
                    String str4 = utVar.f38914b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(utVar.f38914b).toLowerCase();
                    String str5 = utVar.f38915c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase5) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList5.add(utVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new k41(12, ytVar, arrayList5));
                return;
            case 12:
                org.telegram.ui.yt ytVar2 = (org.telegram.ui.yt) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.au auVar = ytVar2.h;
                if (auVar.f32644f) {
                    ytVar2.e = arrayList7;
                    if (auVar.e && (rl0Var = auVar.f32641a) != null) {
                        f2.o0 adapter = rl0Var.getAdapter();
                        org.telegram.ui.yt ytVar3 = auVar.d;
                        if (adapter != ytVar3) {
                            auVar.f32641a.setAdapter(ytVar3);
                            auVar.f32641a.setFastScrollVisible(false);
                        }
                    }
                    ytVar2.l();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.cu.P((org.telegram.ui.cu) obj2, (TLRPC.Updates) obj);
                return;
            case 14:
                org.telegram.ui.qy.d0((org.telegram.ui.qy) obj2, (String) obj);
                return;
            case 15:
                rh.p2.j(((org.telegram.ui.qy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 16:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) obj2;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ov(qyVar, 24), 300L);
                return;
            case 17:
                ((org.telegram.ui.py) obj).f37246a.postOnAnimation(new org.telegram.ui.ov((org.telegram.ui.qy) obj2, 14));
                return;
            case 18:
                org.telegram.ui.qy qyVar2 = (org.telegram.ui.qy) obj2;
                ArrayList<Long> arrayList8 = (ArrayList) obj;
                MessagesController messagesController = qyVar2.getMessagesController();
                if (qyVar2.S2 == 0 && qyVar2.U2 == 0) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                messagesController.addDialogToFolder(arrayList8, i11, -1, null, 0L);
                return;
            case 19:
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.qy qyVar3 = ((org.telegram.ui.qw) obj2).f37510b;
                qyVar3.f37631v3 = 2;
                qyVar3.A4(true, true);
                qyVar3.o3();
                while (i13 < arrayList9.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList9.get(i13)).f19163id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i13);
                    if (qyVar3.getMessagesController().isForum(j10) || qyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        qyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    qyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = qyVar3.getMessagesController();
                    int i17 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i17, i17, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                return;
            case 20:
                ((org.telegram.ui.qw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 21:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.qy qyVar4 = ((org.telegram.ui.cx) obj2).f33252a;
                qyVar4.E2 = null;
                qq0 qq0Var = qyVar4.D2;
                if (qq0Var != null && qq0Var.h) {
                    qq0Var.e(charSequence, false);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) obj;
                ((org.telegram.ui.qx) obj2).f37515b.removeSelfFromStack();
                if (p2VarArr[1] != null) {
                    p2VarArr[0].removeSelfFromStack();
                    p2VarArr[1].finishFragment();
                    return;
                }
                p2VarArr[0].finishFragment();
                return;
            case 23:
                org.telegram.ui.dz dzVar = (org.telegram.ui.dz) obj2;
                org.telegram.ui.zn znVar = dzVar.f33557a;
                xx0 xx0Var = new xx0(znVar.getParentActivity(), dzVar.f33557a, ((MessageObject) obj).getInputStickerSet(), null, znVar.V, znVar.getResourceProvider());
                xx0Var.setCalcMandatoryInsets(znVar.x9());
                znVar.showDialog(xx0Var);
                return;
            case 24:
                org.telegram.ui.yz yzVar = (org.telegram.ui.yz) obj2;
                yzVar.getClass();
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                org.telegram.ui.zz zzVar = yzVar.B;
                org.telegram.ui.a00 a00Var = zzVar.f40905c;
                Utilities.Callback callback = a00Var.f32406x;
                if (callback != null) {
                    callback.run(a00Var.d);
                }
                zzVar.f40905c.finishFragment();
                return;
            case 25:
                org.telegram.ui.c10 c10Var = (org.telegram.ui.c10) obj2;
                org.telegram.ui.a00 a00Var2 = new org.telegram.ui.a00(c10Var.f32981r, ((org.telegram.ui.t00) obj).f38350m);
                a00Var2.f32407y = new org.telegram.ui.d00(c10Var, 1);
                a00Var2.f32406x = new org.telegram.ui.d00(c10Var, 2);
                c10Var.presentFragment(a00Var2);
                return;
            case 26:
                org.telegram.ui.c10 c10Var2 = (org.telegram.ui.c10) obj2;
                Runnable runnable = (Runnable) obj;
                c10Var2.h = false;
                c10Var2.f32982s = false;
                c10Var2.f32981r.flags = c10Var2.f32985y;
                c10Var2.i0(true);
                c10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.c10 c10Var3 = (org.telegram.ui.c10) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList10 = c10Var3.I;
                c10Var3.K = false;
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                    c10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    c10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList10.clear();
                    arrayList10.addAll(tL_chatlists_exportedInvites.invites);
                    c10Var3.w0();
                }
                c10Var3.J = 0;
                return;
            case 28:
                org.telegram.ui.c10 c10Var4 = (org.telegram.ui.c10) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                MessagesController.DialogFilter dialogFilter = c10Var4.f32981r;
                if (d2Var != null) {
                    try {
                        d2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                c10Var4.getMessagesController().removeFilter(dialogFilter);
                c10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                c10Var4.finishFragment();
                return;
            default:
                org.telegram.ui.c10 c10Var5 = (org.telegram.ui.c10) obj2;
                c10Var5.getClass();
                c10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
        }
    }
}
