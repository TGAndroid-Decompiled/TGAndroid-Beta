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
public final class n51 implements Runnable {
    public final int f27282a;
    public final Object f27283b;
    public final Object f27284c;

    public n51(int i10, Object obj, Object obj2) {
        this.f27282a = i10;
        this.f27283b = obj;
        this.f27284c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        mm0 mm0Var;
        int i11;
        int i12 = this.f27282a;
        ArrayList arrayList = null;
        int i13 = 0;
        Object obj = this.f27284c;
        Object obj2 = this.f27283b;
        switch (i12) {
            case 0:
                ((TranslateController) obj).setHideTranslateDialog(((org.telegram.ui.el) obj2).f27845b, false);
                return;
            case 1:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.f23058s.presentFragment(new org.telegram.ui.ap0((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                int i14 = UndoView.f23047e0;
                undoView.getClass();
                return;
            case 2:
                ((m61) obj2).D.onClick((org.telegram.ui.Cells.v8) obj);
                return;
            case 3:
                i81 i81Var = (i81) obj2;
                b2.z0 z0Var = (b2.z0) obj;
                Throwable cause = z0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(z0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = i81.f25582l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = i81Var.N;
                    if (arrayList2 != null) {
                        int i15 = 0;
                        while (i15 < arrayList2.size()) {
                            e81 e81Var = (e81) arrayList2.get(i15);
                            int i16 = 0;
                            while (true) {
                                ArrayList arrayList3 = e81Var.d;
                                if (i16 < arrayList3.size()) {
                                    g81 g81Var = (g81) arrayList3.get(i16);
                                    if (!TextUtils.isEmpty(g81Var.f24919m) && !i81.Y(g81Var.f24919m)) {
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
                    i81Var.N = arrayList;
                    if (arrayList != null) {
                        i81Var.F(arrayList, i81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = i81Var.f25596n;
                if (textureView != null && ((!i81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    i81Var.E = true;
                    if (i81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(i81Var.f25596n);
                            viewGroup.removeView(i81Var.f25596n);
                            viewGroup.addView(i81Var.f25596n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = i81Var.f25585b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new w71(i81Var, 1));
                            return;
                        }
                        i2.h0 h0Var = i81Var.d;
                        TextureView textureView2 = i81Var.f25596n;
                        h0Var.F1();
                        if (textureView2 != null && textureView2 == h0Var.X) {
                            h0Var.F1();
                            h0Var.s1();
                            h0Var.x1(null);
                            h0Var.q1(0, 0);
                        }
                        i81Var.d.z1(i81Var.f25596n);
                        ArrayList arrayList4 = i81Var.N;
                        if (arrayList4 != null) {
                            i81Var.F(arrayList4, i81Var.O);
                        } else if (i81Var.U) {
                            i81Var.G(i81Var.Q, i81Var.S, i81Var.R, i81Var.T);
                        } else {
                            i81Var.D(i81Var.Q, i81Var.S);
                        }
                        i81Var.C();
                        return;
                    }
                    return;
                }
                i81Var.J.onError(i81Var, z0Var);
                return;
            case 4:
                ((h81) obj2).f25206f.K.onVisualizerUpdate(true, true, (float[]) obj);
                return;
            case 5:
                q81 q81Var = (q81) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (q81Var.f28239w != null) {
                        Bitmap bitmap2 = q81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        q81Var.v = q81Var.f28239w;
                    }
                    q81Var.f28239w = bitmap;
                    Bitmap bitmap3 = q81Var.f28239w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    q81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(q81Var.L);
                    q81Var.J.setShader(q81Var.G);
                    q81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        i10 = dp;
                        dp = (int) (dp * width);
                    }
                    ViewGroup.LayoutParams layoutParams = q81Var.getLayoutParams();
                    if (q81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        q81Var.setVisibility(0);
                        q81Var.requestLayout();
                    }
                }
                q81Var.f28233f = null;
                return;
            case 6:
                final ca1 ca1Var = (ca1) obj2;
                ca1Var.e.f24048b.evaluateJavascript((String) obj, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj3) {
                        String str2 = (String) obj3;
                        ca1 ca1Var2 = ca1.this;
                        String[] strArr = ca1Var2.f23664c;
                        String str3 = strArr[0];
                        String str4 = ca1Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        ca1Var2.f23663b.countDown();
                    }
                });
                return;
            case 7:
                ((org.telegram.ui.Components.voip.k) obj2).f29929a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 8:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f30173w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z10) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 9:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                ((org.telegram.ui.Components.voip.l0) obj2).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 10:
                mm0 mm0Var2 = (mm0) obj2;
                if (mm0Var2 != null) {
                    mm0Var2.setOnItemClickListener((am0) obj);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.du duVar = (org.telegram.ui.du) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new n51(12, duVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = duVar.f35139f;
                int size = arrayList6.size();
                while (i13 < size) {
                    Object obj3 = arrayList6.get(i13);
                    i13++;
                    org.telegram.ui.au auVar = (org.telegram.ui.au) obj3;
                    String str2 = auVar.f34084a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(auVar.f34084a).toLowerCase();
                    String str4 = auVar.f34085b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(auVar.f34085b).toLowerCase();
                    String str5 = auVar.f34086c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, lowerCase5) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList5.add(auVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new n51(12, duVar, arrayList5));
                return;
            case 12:
                org.telegram.ui.du duVar2 = (org.telegram.ui.du) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.fu fuVar = duVar2.h;
                if (fuVar.f35956f) {
                    duVar2.e = arrayList7;
                    if (fuVar.e && (mm0Var = fuVar.f35953a) != null) {
                        s4.g0 adapter = mm0Var.getAdapter();
                        org.telegram.ui.du duVar3 = fuVar.d;
                        if (adapter != duVar3) {
                            fuVar.f35953a.setAdapter(duVar3);
                            fuVar.f35953a.setFastScrollVisible(false);
                        }
                    }
                    duVar2.l();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.hu.Q((org.telegram.ui.hu) obj2, (TLRPC.Updates) obj);
                return;
            case 14:
                org.telegram.ui.yy.e0((org.telegram.ui.yy) obj2, (String) obj);
                return;
            case 15:
                fi.k3.j(((org.telegram.ui.yy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 16:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) obj2;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(yyVar, 25), 300L);
                return;
            case 17:
                ((org.telegram.ui.xy) obj).f41679a.postOnAnimation(new org.telegram.ui.uv((org.telegram.ui.yy) obj2, 15));
                return;
            case 18:
                org.telegram.ui.yy yyVar2 = (org.telegram.ui.yy) obj2;
                ArrayList<Long> arrayList8 = (ArrayList) obj;
                MessagesController messagesController = yyVar2.getMessagesController();
                if (yyVar2.W2 == 0 && yyVar2.Y2 == 0) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                messagesController.addDialogToFolder(arrayList8, i11, -1, null, 0L);
                return;
            case 19:
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.yy yyVar3 = ((org.telegram.ui.xw) obj2).f41671b;
                yyVar3.f42113z3 = 2;
                yyVar3.y4(true, true);
                yyVar3.m3();
                while (i13 < arrayList9.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList9.get(i13)).f18920id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i13);
                    if (yyVar3.getMessagesController().isForum(j10) || yyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        yyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    yyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = yyVar3.getMessagesController();
                    int i17 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i17, i17, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                return;
            case 20:
                ((org.telegram.ui.xw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 21:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.yy yyVar4 = ((org.telegram.ui.jx) obj2).f37166a;
                yyVar4.H2 = null;
                nr0 nr0Var = yyVar4.G2;
                if (nr0Var != null && nr0Var.h) {
                    nr0Var.e(charSequence, false);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.ActionBar.m2[] m2VarArr = (org.telegram.ui.ActionBar.m2[]) obj;
                ((org.telegram.ui.xx) obj2).f41675b.removeSelfFromStack();
                if (m2VarArr[1] != null) {
                    m2VarArr[0].removeSelfFromStack();
                    m2VarArr[1].finishFragment();
                    return;
                }
                m2VarArr[0].finishFragment();
                return;
            case 23:
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) obj2;
                org.telegram.ui.fo foVar = kzVar.f37549a;
                uy0 uy0Var = new uy0(foVar.getParentActivity(), kzVar.f37549a, ((MessageObject) obj).getInputStickerSet(), null, foVar.Y, foVar.getResourceProvider());
                uy0Var.setCalcMandatoryInsets(foVar.C9());
                foVar.showDialog(uy0Var);
                return;
            case 24:
                org.telegram.ui.f00 f00Var = (org.telegram.ui.f00) obj2;
                f00Var.getClass();
                ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                org.telegram.ui.g00 g00Var = f00Var.E;
                org.telegram.ui.h00 h00Var = g00Var.f36033c;
                Utilities.Callback callback = h00Var.f36360x;
                if (callback != null) {
                    callback.run(h00Var.d);
                }
                g00Var.f36033c.finishFragment();
                return;
            case 25:
                org.telegram.ui.k10 k10Var = (org.telegram.ui.k10) obj2;
                org.telegram.ui.h00 h00Var2 = new org.telegram.ui.h00(k10Var.f37203r, ((org.telegram.ui.b10) obj).f34147m);
                h00Var2.f36361y = new org.telegram.ui.k00(k10Var, 1);
                h00Var2.f36360x = new org.telegram.ui.k00(k10Var, 2);
                k10Var.presentFragment(h00Var2);
                return;
            case 26:
                org.telegram.ui.k10 k10Var2 = (org.telegram.ui.k10) obj2;
                Runnable runnable = (Runnable) obj;
                k10Var2.h = false;
                k10Var2.f37204s = false;
                k10Var2.f37203r.flags = k10Var2.f37207y;
                k10Var2.i0(true);
                k10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.k10 k10Var3 = (org.telegram.ui.k10) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList10 = k10Var3.L;
                k10Var3.N = false;
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                    k10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    k10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList10.clear();
                    arrayList10.addAll(tL_chatlists_exportedInvites.invites);
                    k10Var3.w0();
                }
                k10Var3.M = 0;
                return;
            case 28:
                org.telegram.ui.k10 k10Var4 = (org.telegram.ui.k10) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj;
                MessagesController.DialogFilter dialogFilter = k10Var4.f37203r;
                if (a2Var != null) {
                    try {
                        a2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                k10Var4.getMessagesController().removeFilter(dialogFilter);
                k10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                k10Var4.finishFragment();
                return;
            default:
                org.telegram.ui.k10 k10Var5 = (org.telegram.ui.k10) obj2;
                k10Var5.getClass();
                k10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
        }
    }
}
