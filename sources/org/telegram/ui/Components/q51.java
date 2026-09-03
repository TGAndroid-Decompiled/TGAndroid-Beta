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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.FiltersSetupActivity;
public final class q51 implements Runnable {
    public final int f30292a;
    public final Object f30293b;
    public final Object f30294c;

    public q51(int i10, Object obj, Object obj2) {
        this.f30292a = i10;
        this.f30293b = obj;
        this.f30294c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        sl0 sl0Var;
        int i11;
        int i12 = this.f30292a;
        ArrayList arrayList = null;
        int i13 = 0;
        Object obj = this.f30294c;
        Object obj2 = this.f30293b;
        switch (i12) {
            case 0:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.f25085s.presentFragment(new org.telegram.ui.lo0((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                int i14 = UndoView.f25076b0;
                undoView.getClass();
                return;
            case 1:
                ((h51) obj2).D.onClick((org.telegram.ui.Cells.r8) obj);
                return;
            case 2:
                j71 j71Var = (j71) obj2;
                j3.t1 t1Var = (j3.t1) obj;
                Throwable cause = t1Var.getCause();
                if ((cause instanceof d4.l) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(t1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = j71.f28042i0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = j71Var.K;
                    if (arrayList2 != null) {
                        int i15 = 0;
                        while (i15 < arrayList2.size()) {
                            f71 f71Var = (f71) arrayList2.get(i15);
                            int i16 = 0;
                            while (true) {
                                ArrayList arrayList3 = f71Var.d;
                                if (i16 < arrayList3.size()) {
                                    h71 h71Var = (h71) arrayList3.get(i16);
                                    if (!TextUtils.isEmpty(h71Var.f27406m) && !j71.Y(h71Var.f27406m)) {
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
                    j71Var.K = arrayList;
                    if (arrayList != null) {
                        j71Var.F(arrayList, j71Var.L);
                        return;
                    }
                    return;
                }
                TextureView textureView = j71Var.f28054n;
                if (textureView != null && ((!j71Var.B && (cause instanceof d4.p)) || (cause instanceof i5.m))) {
                    j71Var.B = true;
                    if (j71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(j71Var.f28054n);
                            viewGroup.removeView(j71Var.f28054n);
                            viewGroup.addView(j71Var.f28054n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = j71Var.f28045b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new a71(j71Var, 0));
                            return;
                        }
                        j3.f0 f0Var = j71Var.d;
                        TextureView textureView2 = j71Var.f28054n;
                        f0Var.j0();
                        if (textureView2 != null && textureView2 == f0Var.T) {
                            f0Var.j0();
                            f0Var.U();
                            f0Var.Z(null);
                            f0Var.T(0, 0);
                        }
                        j71Var.d.c0(j71Var.f28054n);
                        ArrayList arrayList4 = j71Var.K;
                        if (arrayList4 != null) {
                            j71Var.F(arrayList4, j71Var.L);
                        } else if (j71Var.R) {
                            j71Var.G(j71Var.N, j71Var.P, j71Var.O, j71Var.Q);
                        } else {
                            j71Var.D(j71Var.N, j71Var.P);
                        }
                        j71Var.C();
                        return;
                    }
                    return;
                }
                j71Var.G.onError(j71Var, t1Var);
                return;
            case 3:
                ((i71) obj2).f27735f.H.onVisualizerUpdate(true, true, (float[]) obj);
                return;
            case 4:
                q71 q71Var = (q71) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (q71Var.f30352w != null) {
                        Bitmap bitmap2 = q71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        q71Var.v = q71Var.f30352w;
                    }
                    q71Var.f30352w = bitmap;
                    Bitmap bitmap3 = q71Var.f30352w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    q71Var.D = bitmapShader;
                    bitmapShader.setLocalMatrix(q71Var.I);
                    q71Var.G.setShader(q71Var.D);
                    q71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        i10 = dp;
                        dp = (int) (dp * width);
                    }
                    ViewGroup.LayoutParams layoutParams = q71Var.getLayoutParams();
                    if (q71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        q71Var.setVisibility(0);
                        q71Var.requestLayout();
                    }
                }
                q71Var.f30348f = null;
                return;
            case 5:
                final d91 d91Var = (d91) obj2;
                d91Var.f26239e.f26518b.evaluateJavascript((String) obj, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj3) {
                        String str2 = (String) obj3;
                        d91 d91Var2 = d91.this;
                        String[] strArr = d91Var2.f26238c;
                        String str3 = strArr[0];
                        String str4 = d91Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        d91Var2.f26237b.countDown();
                    }
                });
                return;
            case 6:
                ((org.telegram.ui.Components.voip.k) obj2).f32121a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 7:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap2 = uVar.C.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f32394w;
                boolean z4 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z4) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 8:
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj;
                ((org.telegram.ui.Components.voip.l0) obj2).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(uVar2)).setDuration(150L).start();
                return;
            case 9:
                sl0 sl0Var2 = (sl0) obj2;
                if (sl0Var2 != null) {
                    sl0Var2.setOnItemClickListener((il0) obj);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.xt xtVar = (org.telegram.ui.xt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new q51(11, xtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = xtVar.f43448f;
                int size = arrayList6.size();
                while (i13 < size) {
                    Object obj3 = arrayList6.get(i13);
                    i13++;
                    org.telegram.ui.tt ttVar = (org.telegram.ui.tt) obj3;
                    String str2 = ttVar.f41631a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(ttVar.f41631a).toLowerCase();
                    String str4 = ttVar.f41632b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(ttVar.f41632b).toLowerCase();
                    String str5 = ttVar.f41633c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase5) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList5.add(ttVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new q51(11, xtVar, arrayList5));
                return;
            case 11:
                org.telegram.ui.xt xtVar2 = (org.telegram.ui.xt) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.zt ztVar = xtVar2.h;
                if (ztVar.f44020f) {
                    xtVar2.f43447e = arrayList7;
                    if (ztVar.f44019e && (sl0Var = ztVar.f44016a) != null) {
                        f2.p0 adapter = sl0Var.getAdapter();
                        org.telegram.ui.xt xtVar3 = ztVar.d;
                        if (adapter != xtVar3) {
                            ztVar.f44016a.setAdapter(xtVar3);
                            ztVar.f44016a.setFastScrollVisible(false);
                        }
                    }
                    xtVar2.l();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.bu.P((org.telegram.ui.bu) obj2, (TLRPC.Updates) obj);
                return;
            case 13:
                org.telegram.ui.py.d0((org.telegram.ui.py) obj2, (String) obj);
                return;
            case 14:
                sh.p2.j(((org.telegram.ui.py) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 15:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) obj2;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.nv(pyVar, 24), 300L);
                return;
            case 16:
                ((org.telegram.ui.oy) obj).f39822a.postOnAnimation(new org.telegram.ui.nv((org.telegram.ui.py) obj2, 14));
                return;
            case 17:
                org.telegram.ui.py pyVar2 = (org.telegram.ui.py) obj2;
                ArrayList<Long> arrayList8 = (ArrayList) obj;
                MessagesController messagesController = pyVar2.getMessagesController();
                if (pyVar2.S2 == 0 && pyVar2.U2 == 0) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                messagesController.addDialogToFolder(arrayList8, i11, -1, null, 0L);
                return;
            case 18:
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.py pyVar3 = ((org.telegram.ui.pw) obj2).f40138b;
                pyVar3.f40260v3 = 2;
                pyVar3.A4(true, true);
                pyVar3.o3();
                while (i13 < arrayList9.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList9.get(i13)).f20849id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i13);
                    if (pyVar3.getMessagesController().isForum(j10) || pyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        pyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    pyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = pyVar3.getMessagesController();
                    int i17 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i17, i17, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                return;
            case 19:
                ((org.telegram.ui.pw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 20:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.py pyVar4 = ((org.telegram.ui.bx) obj2).f35616a;
                pyVar4.E2 = null;
                qq0 qq0Var = pyVar4.D2;
                if (qq0Var != null && qq0Var.h) {
                    qq0Var.e(charSequence, false);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) obj;
                ((org.telegram.ui.px) obj2).f40143b.removeSelfFromStack();
                if (p2VarArr[1] != null) {
                    p2VarArr[0].removeSelfFromStack();
                    p2VarArr[1].finishFragment();
                    return;
                }
                p2VarArr[0].finishFragment();
                return;
            case 22:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) obj2;
                org.telegram.ui.xn xnVar = czVar.f35903a;
                xx0 xx0Var = new xx0(xnVar.getParentActivity(), czVar.f35903a, ((MessageObject) obj).getInputStickerSet(), null, xnVar.V, xnVar.getResourceProvider());
                xx0Var.setCalcMandatoryInsets(xnVar.x9());
                xnVar.showDialog(xx0Var);
                return;
            case 23:
                org.telegram.ui.xz xzVar = (org.telegram.ui.xz) obj2;
                xzVar.getClass();
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                org.telegram.ui.yz yzVar = xzVar.B;
                org.telegram.ui.zz zzVar = yzVar.f43740c;
                Utilities.Callback callback = zzVar.f44057x;
                if (callback != null) {
                    callback.run(zzVar.d);
                }
                yzVar.f43740c.finishFragment();
                return;
            case 24:
                org.telegram.ui.b10 b10Var = (org.telegram.ui.b10) obj2;
                org.telegram.ui.zz zzVar2 = new org.telegram.ui.zz(b10Var.f35310r, ((org.telegram.ui.s00) obj).f40980m);
                zzVar2.f44058y = new org.telegram.ui.c00(b10Var, 1);
                zzVar2.f44057x = new org.telegram.ui.c00(b10Var, 2);
                b10Var.presentFragment(zzVar2);
                return;
            case 25:
                org.telegram.ui.b10 b10Var2 = (org.telegram.ui.b10) obj2;
                Runnable runnable = (Runnable) obj;
                b10Var2.h = false;
                b10Var2.f35311s = false;
                b10Var2.f35310r.flags = b10Var2.f35314y;
                b10Var2.i0(true);
                b10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 26:
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
            case 27:
                org.telegram.ui.b10 b10Var4 = (org.telegram.ui.b10) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                MessagesController.DialogFilter dialogFilter = b10Var4.f35310r;
                if (d2Var != null) {
                    try {
                        d2Var.dismiss();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                b10Var4.getMessagesController().removeFilter(dialogFilter);
                b10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                b10Var4.finishFragment();
                return;
            case 28:
                org.telegram.ui.b10 b10Var5 = (org.telegram.ui.b10) obj2;
                b10Var5.getClass();
                b10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f34126x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f34126x = true;
                    return;
                }
                return;
        }
    }
}
