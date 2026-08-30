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
    public final int f26155a;
    public final Object f26156b;
    public final Object f26157c;

    public k41(int i10, Object obj, Object obj2) {
        this.f26155a = i10;
        this.f26156b = obj;
        this.f26157c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        sl0 sl0Var;
        int i11;
        int i12 = this.f26155a;
        ArrayList arrayList = null;
        int i13 = 0;
        Object obj = this.f26157c;
        Object obj2 = this.f26156b;
        switch (i12) {
            case 0:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) obj2;
                ((org.telegram.ui.ActionBar.p1) obj).d(true);
                m41.a(wkVar.getContext(), wkVar.d);
                return;
            case 1:
                ((TranslateController) obj).setHideTranslateDialog(((org.telegram.ui.wk) obj2).f26936b, false);
                return;
            case 2:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.f23220s.presentFragment(new org.telegram.ui.jo0((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                int i14 = UndoView.f23212b0;
                undoView.getClass();
                return;
            case 3:
                ((i51) obj2).D.onClick((org.telegram.ui.Cells.r8) obj);
                return;
            case 4:
                i71 i71Var = (i71) obj2;
                j3.t1 t1Var = (j3.t1) obj;
                Throwable cause = t1Var.getCause();
                if ((cause instanceof d4.l) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(t1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = i71.f25600i0;
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
                                    if (!TextUtils.isEmpty(g71Var.f25080m) && !i71.Y(g71Var.f25080m)) {
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
                TextureView textureView = i71Var.f25611n;
                if (textureView != null && ((!i71Var.B && (cause instanceof d4.p)) || (cause instanceof i5.m))) {
                    i71Var.B = true;
                    if (i71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(i71Var.f25611n);
                            viewGroup.removeView(i71Var.f25611n);
                            viewGroup.addView(i71Var.f25611n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = i71Var.f25603b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new z61(i71Var, 0));
                            return;
                        }
                        j3.f0 f0Var = i71Var.d;
                        TextureView textureView2 = i71Var.f25611n;
                        f0Var.j0();
                        if (textureView2 != null && textureView2 == f0Var.T) {
                            f0Var.j0();
                            f0Var.U();
                            f0Var.Z(null);
                            f0Var.T(0, 0);
                        }
                        i71Var.d.c0(i71Var.f25611n);
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
            case 5:
                ((h71) obj2).f25345f.H.onVisualizerUpdate(true, true, (float[]) obj);
                return;
            case 6:
                p71 p71Var = (p71) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (p71Var.f27779w != null) {
                        Bitmap bitmap2 = p71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        p71Var.v = p71Var.f27779w;
                    }
                    p71Var.f27779w = bitmap;
                    Bitmap bitmap3 = p71Var.f27779w;
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
                p71Var.f27775f = null;
                return;
            case 7:
                final d91 d91Var = (d91) obj2;
                d91Var.e.f24526b.evaluateJavascript((String) obj, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj3) {
                        String str2 = (String) obj3;
                        d91 d91Var2 = d91.this;
                        String[] strArr = d91Var2.f24211c;
                        String str3 = strArr[0];
                        String str4 = d91Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        d91Var2.f24210b.countDown();
                    }
                });
                return;
            case 8:
                ((org.telegram.ui.Components.voip.k) obj2).f29708a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 9:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap2 = tVar.C.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f29947w;
                boolean z4 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z4) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 10:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                ((org.telegram.ui.Components.voip.k0) obj2).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.x(tVar2)).setDuration(150L).start();
                return;
            case 11:
                sl0 sl0Var2 = (sl0) obj2;
                if (sl0Var2 != null) {
                    sl0Var2.setOnItemClickListener((il0) obj);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.wt wtVar = (org.telegram.ui.wt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new k41(13, wtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = wtVar.f39791f;
                int size = arrayList6.size();
                while (i13 < size) {
                    Object obj3 = arrayList6.get(i13);
                    i13++;
                    org.telegram.ui.st stVar = (org.telegram.ui.st) obj3;
                    String str2 = stVar.f38435a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(stVar.f38435a).toLowerCase();
                    String str4 = stVar.f38436b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(stVar.f38436b).toLowerCase();
                    String str5 = stVar.f38437c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase5) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList5.add(stVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new k41(13, wtVar, arrayList5));
                return;
            case 13:
                org.telegram.ui.wt wtVar2 = (org.telegram.ui.wt) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.yt ytVar = wtVar2.h;
                if (ytVar.f40574f) {
                    wtVar2.e = arrayList7;
                    if (ytVar.e && (sl0Var = ytVar.f40571a) != null) {
                        f2.o0 adapter = sl0Var.getAdapter();
                        org.telegram.ui.wt wtVar3 = ytVar.d;
                        if (adapter != wtVar3) {
                            ytVar.f40571a.setAdapter(wtVar3);
                            ytVar.f40571a.setFastScrollVisible(false);
                        }
                    }
                    wtVar2.l();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.au.P((org.telegram.ui.au) obj2, (TLRPC.Updates) obj);
                return;
            case 15:
                org.telegram.ui.oy.d0((org.telegram.ui.oy) obj2, (String) obj);
                return;
            case 16:
                rh.q2.j(((org.telegram.ui.oy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 17:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) obj2;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mv(oyVar, 24), 300L);
                return;
            case 18:
                ((org.telegram.ui.ny) obj).f36741a.postOnAnimation(new org.telegram.ui.mv((org.telegram.ui.oy) obj2, 14));
                return;
            case 19:
                org.telegram.ui.oy oyVar2 = (org.telegram.ui.oy) obj2;
                ArrayList<Long> arrayList8 = (ArrayList) obj;
                MessagesController messagesController = oyVar2.getMessagesController();
                if (oyVar2.S2 == 0 && oyVar2.U2 == 0) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                messagesController.addDialogToFolder(arrayList8, i11, -1, null, 0L);
                return;
            case 20:
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.oy oyVar3 = ((org.telegram.ui.ow) obj2).f36989b;
                oyVar3.f37113v3 = 2;
                oyVar3.A4(true, true);
                oyVar3.o3();
                while (i13 < arrayList9.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList9.get(i13)).f19188id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i13);
                    if (oyVar3.getMessagesController().isForum(j10) || oyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        oyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    oyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = oyVar3.getMessagesController();
                    int i17 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i17, i17, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                return;
            case 21:
                ((org.telegram.ui.ow) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 22:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.oy oyVar4 = ((org.telegram.ui.ax) obj2).f32716a;
                oyVar4.E2 = null;
                qq0 qq0Var = oyVar4.D2;
                if (qq0Var != null && qq0Var.h) {
                    qq0Var.e(charSequence, false);
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) obj;
                ((org.telegram.ui.ox) obj2).f36996b.removeSelfFromStack();
                if (p2VarArr[1] != null) {
                    p2VarArr[0].removeSelfFromStack();
                    p2VarArr[1].finishFragment();
                    return;
                }
                p2VarArr[0].finishFragment();
                return;
            case 24:
                org.telegram.ui.bz bzVar = (org.telegram.ui.bz) obj2;
                org.telegram.ui.xn xnVar = bzVar.f33048a;
                xx0 xx0Var = new xx0(xnVar.getParentActivity(), bzVar.f33048a, ((MessageObject) obj).getInputStickerSet(), null, xnVar.V, xnVar.getResourceProvider());
                xx0Var.setCalcMandatoryInsets(xnVar.x9());
                xnVar.showDialog(xx0Var);
                return;
            case 25:
                org.telegram.ui.wz wzVar = (org.telegram.ui.wz) obj2;
                wzVar.getClass();
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                org.telegram.ui.xz xzVar = wzVar.B;
                org.telegram.ui.yz yzVar = xzVar.f40337c;
                Utilities.Callback callback = yzVar.f40611x;
                if (callback != null) {
                    callback.run(yzVar.d);
                }
                xzVar.f40337c.finishFragment();
                return;
            case 26:
                org.telegram.ui.b10 b10Var = (org.telegram.ui.b10) obj2;
                org.telegram.ui.yz yzVar2 = new org.telegram.ui.yz(b10Var.f32764r, ((org.telegram.ui.s00) obj).f38164m);
                yzVar2.f40612y = new org.telegram.ui.b00(b10Var, 1);
                yzVar2.f40611x = new org.telegram.ui.b00(b10Var, 2);
                b10Var.presentFragment(yzVar2);
                return;
            case 27:
                org.telegram.ui.b10 b10Var2 = (org.telegram.ui.b10) obj2;
                Runnable runnable = (Runnable) obj;
                b10Var2.h = false;
                b10Var2.f32765s = false;
                b10Var2.f32764r.flags = b10Var2.f32768y;
                b10Var2.i0(true);
                b10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.b10 b10Var3 = (org.telegram.ui.b10) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList10 = b10Var3.I;
                b10Var3.K = false;
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                    b10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    b10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList10.clear();
                    arrayList10.addAll(tL_chatlists_exportedInvites.invites);
                    b10Var3.w0();
                }
                b10Var3.J = 0;
                return;
            default:
                org.telegram.ui.b10 b10Var4 = (org.telegram.ui.b10) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                MessagesController.DialogFilter dialogFilter = b10Var4.f32764r;
                if (d2Var != null) {
                    try {
                        d2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                b10Var4.getMessagesController().removeFilter(dialogFilter);
                b10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                b10Var4.finishFragment();
                return;
        }
    }
}
