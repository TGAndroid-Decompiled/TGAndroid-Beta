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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br0 implements Runnable {
    public final int f22794a;
    public final Object f22795b;
    public final Object f22796c;

    public br0(int i10, Object obj, Object obj2) {
        this.f22794a = i10;
        this.f22795b = obj;
        this.f22796c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        int i11;
        String str;
        ArrayList arrayList;
        ml0 ml0Var;
        int i12 = 2;
        ArrayList arrayList2 = null;
        int i13 = 0;
        switch (this.f22794a) {
            case 0:
                st0 st0Var = (st0) this.f22795b;
                pq0 pq0Var = (pq0) this.f22796c;
                st0Var.G = null;
                st0Var.H = null;
                pq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new jd0(pq0Var, 13)).start();
                return;
            case 1:
                ai.e9 e9Var = (ai.e9) this.f22796c;
                ur0 ur0Var = ((zu0) this.f22795b).W;
                if (ur0Var != null) {
                    int i14 = e9Var.f773a;
                    ur0Var.f32649n.d(i14, ur0Var.f32651s.i(i14));
                    return;
                }
                return;
            case 2:
                vc.a0(((it0) this.f22795b).f25031f.f30659v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f22796c).title)).k(true);
                return;
            case 3:
                vt0 vt0Var = (vt0) this.f22795b;
                String str2 = (String) this.f22796c;
                if (!vt0Var.v.f30655t1[vt0Var.f29410r].f26852a.isEmpty() && ((i10 = vt0Var.f29410r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.k0.h(1, vt0Var.v.f30655t1[i10].f26852a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    zu0 zu0Var = vt0Var.v;
                    if (zu0Var.f30634j1 == zu0Var.f30659v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    vt0Var.F(id2, str2, dialogId, j3);
                } else if (vt0Var.f29410r == 3) {
                    zu0 zu0Var2 = vt0Var.v;
                    vt0Var.F(0, str2, zu0Var2.f30634j1, zu0Var2.F);
                }
                int i15 = vt0Var.f29410r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(vt0Var.v.f30655t1[vt0Var.f29410r].f26852a);
                    vt0Var.f29411s++;
                    Utilities.searchQueue.postRunnable(new gr0(vt0Var, str2, arrayList3, 5));
                    return;
                }
                return;
            case 4:
                vt0 vt0Var2 = (vt0) this.f22795b;
                ArrayList arrayList4 = (ArrayList) this.f22796c;
                zu0 zu0Var3 = vt0Var2.v;
                boolean z10 = zu0Var3.V0;
                st0[] st0VarArr = zu0Var3.f30635k0;
                if (z10) {
                    vt0Var2.f29411s--;
                    int h = vt0Var2.h();
                    vt0Var2.d = arrayList4;
                    int h10 = vt0Var2.h();
                    if (vt0Var2.f29411s == 0 || h10 != 0) {
                        zu0Var3.m1(false);
                    }
                    for (int i16 = 0; i16 < st0VarArr.length; i16++) {
                        st0 st0Var2 = st0VarArr[i16];
                        if (st0Var2.F == vt0Var2.f29410r) {
                            if (vt0Var2.f29411s == 0 && h10 == 0) {
                                st0Var2.f27927w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                st0VarArr[i16].f27927w.f30678f.setVisibility(8);
                                st0VarArr[i16].f27927w.e(false, true);
                            } else if (h == 0) {
                                zu0Var3.z(st0Var2.h, 0, null);
                            }
                        }
                    }
                    vt0Var2.l();
                    return;
                }
                return;
            case 5:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i17 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i17, bool, (TLObject) this.f22795b, (TLRPC.Document) this.f22796c, null, bool);
                return;
            case 6:
                MessagesController.getInstance(((jy0) this.f22795b).f25469a.f26885a).updateEmojiStatus((TLRPC.EmojiStatus) this.f22796c);
                return;
            case 7:
                y21 y21Var = (y21) this.f22795b;
                MessagesController.getInstance(y21Var.f30101b).getTopicsController().deleteTopics(-y21Var.f30103c, (ArrayList) this.f22796c);
                int i18 = y21.f30098f0;
                return;
            case 8:
                y21 y21Var2 = (y21) this.f22795b;
                y21Var2.getClass();
                MessagesController.getInstance(y21Var2.f30101b).loadFullChat(((TLRPC.Updates) this.f22796c).chats.get(0).f18121id, 0, true);
                return;
            case 9:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f22795b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f22796c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    k1Var.d0(i12);
                    return;
                }
                return;
            case 10:
                w31.o((w31) this.f22795b, (TLObject) this.f22796c);
                return;
            case 11:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f22795b;
                String str3 = (String) this.f22796c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.al alVar = (org.telegram.ui.al) this.f22795b;
                ((org.telegram.ui.ActionBar.o1) this.f22796c).d(true);
                n41.a(alVar.getContext(), alVar.d);
                return;
            case 13:
                ((TranslateController) this.f22796c).setHideTranslateDialog(((org.telegram.ui.al) this.f22795b).f26323b, false);
                return;
            case 14:
                UndoView undoView = (UndoView) this.f22795b;
                TLObject tLObject = (TLObject) this.f22796c;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.f22252s.presentFragment(new org.telegram.ui.yo0((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                int i19 = UndoView.f22241e0;
                undoView.getClass();
                return;
            case 15:
                ((j51) this.f22795b).D.onClick((org.telegram.ui.Cells.v8) this.f22796c);
                return;
            case 16:
                h71 h71Var = (h71) this.f22795b;
                b2.u0 u0Var = (b2.u0) this.f22796c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = h71.f24526l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = h71Var.N;
                    if (arrayList5 != null) {
                        int i20 = 0;
                        while (i20 < arrayList5.size()) {
                            d71 d71Var = (d71) arrayList5.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList6 = d71Var.d;
                                if (i21 < arrayList6.size()) {
                                    f71 f71Var = (f71) arrayList6.get(i21);
                                    if (!TextUtils.isEmpty(f71Var.f23820m) && !h71.Y(f71Var.f23820m)) {
                                        arrayList6.remove(i21);
                                        i21--;
                                    }
                                    i21++;
                                } else {
                                    if (arrayList6.isEmpty()) {
                                        arrayList5.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                }
                            }
                        }
                        arrayList2 = arrayList5;
                    }
                    h71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        h71Var.F(arrayList2, h71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = h71Var.f24540n;
                if (textureView != null && ((!h71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    h71Var.E = true;
                    if (h71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(h71Var.f24540n);
                            viewGroup.removeView(h71Var.f24540n);
                            viewGroup.addView(h71Var.f24540n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = h71Var.f24529b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new y61(h71Var, 0));
                            return;
                        }
                        i2.e0 e0Var = h71Var.d;
                        TextureView textureView2 = h71Var.f24540n;
                        e0Var.B1();
                        if (textureView2 != null && textureView2 == e0Var.V) {
                            e0Var.B1();
                            e0Var.o1();
                            e0Var.t1(null);
                            e0Var.m1(0, 0);
                        }
                        h71Var.d.v1(h71Var.f24540n);
                        ArrayList arrayList7 = h71Var.N;
                        if (arrayList7 != null) {
                            h71Var.F(arrayList7, h71Var.O);
                        } else if (h71Var.U) {
                            h71Var.G(h71Var.Q, h71Var.S, h71Var.R, h71Var.T);
                        } else {
                            h71Var.D(h71Var.Q, h71Var.S);
                        }
                        h71Var.C();
                        return;
                    }
                    return;
                }
                h71Var.J.onError(h71Var, u0Var);
                return;
            case 17:
                ((g71) this.f22795b).f24111f.K.onVisualizerUpdate(true, true, (float[]) this.f22796c);
                return;
            case 18:
                o71 o71Var = (o71) this.f22795b;
                Bitmap bitmap = (Bitmap) this.f22796c;
                if (bitmap != null) {
                    if (o71Var.f26671w != null) {
                        Bitmap bitmap2 = o71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        o71Var.v = o71Var.f26671w;
                    }
                    o71Var.f26671w = bitmap;
                    Bitmap bitmap3 = o71Var.f26671w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    o71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(o71Var.L);
                    o71Var.J.setShader(o71Var.G);
                    o71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = o71Var.getLayoutParams();
                    if (o71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        o71Var.setVisibility(0);
                        o71Var.requestLayout();
                    }
                }
                o71Var.f26665f = null;
                return;
            case 19:
                final c91 c91Var = (c91) this.f22795b;
                c91Var.e.f23269b.evaluateJavascript((String) this.f22796c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        c91 c91Var2 = c91.this;
                        String[] strArr = c91Var2.f22990c;
                        String str5 = strArr[0];
                        String str6 = c91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        c91Var2.f22989b.countDown();
                    }
                });
                return;
            case 20:
                ((org.telegram.ui.Components.voip.k) this.f22795b).f29008a.setOnClickListener((View.OnClickListener) this.f22796c);
                return;
            case 21:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f22795b;
                Bitmap bitmap4 = (Bitmap) this.f22796c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29248w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 22:
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f22796c;
                ((org.telegram.ui.Components.voip.m0) this.f22795b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            case 23:
                ml0 ml0Var2 = (ml0) this.f22795b;
                Object obj = this.f22796c;
                if (ml0Var2 != null) {
                    ml0Var2.setOnItemClickListener((al0) obj);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.au auVar = (org.telegram.ui.au) this.f22795b;
                String lowerCase = ((String) this.f22796c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new br0(25, auVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = auVar.f31984f;
                int size = arrayList9.size();
                while (i13 < size) {
                    Object obj2 = arrayList9.get(i13);
                    i13++;
                    org.telegram.ui.xt xtVar = (org.telegram.ui.xt) obj2;
                    String str4 = xtVar.f39700a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(xtVar.f39700a).toLowerCase();
                    String str6 = xtVar.f39701b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(xtVar.f39701b).toLowerCase();
                    String str7 = xtVar.f39702c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        str5 = "+".concat(str7);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList9;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.w1.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.w1.w(" ", translitSafe, lowerCase5) && !str7.startsWith(lowerCase) && !str5.startsWith(lowerCase)) {
                            arrayList9 = arrayList;
                        }
                    } else {
                        arrayList = arrayList9;
                    }
                    arrayList8.add(xtVar);
                    arrayList9 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new br0(25, auVar, arrayList8));
                return;
            case 25:
                org.telegram.ui.au auVar2 = (org.telegram.ui.au) this.f22795b;
                ArrayList arrayList10 = (ArrayList) this.f22796c;
                org.telegram.ui.cu cuVar = auVar2.h;
                if (cuVar.f32920f) {
                    auVar2.e = arrayList10;
                    if (cuVar.e && (ml0Var = cuVar.f32917a) != null) {
                        s4.h0 adapter = ml0Var.getAdapter();
                        org.telegram.ui.au auVar3 = cuVar.d;
                        if (adapter != auVar3) {
                            cuVar.f32917a.setAdapter(auVar3);
                            cuVar.f32917a.setFastScrollVisible(false);
                        }
                    }
                    auVar2.l();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.eu.P((org.telegram.ui.eu) this.f22795b, (TLRPC.Updates) this.f22796c);
                return;
            case 27:
                org.telegram.ui.wy.e0((org.telegram.ui.wy) this.f22795b, (String) this.f22796c);
                return;
            case 28:
                ei.k3.j(((org.telegram.ui.wy) this.f22795b).currentAccount, ((TLRPC.TL_attachMenuBot) this.f22796c).bot_id, null);
                return;
            default:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.f22795b;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.f22796c;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.rv(wyVar, 24), 300L);
                return;
        }
    }

    public br0(y21 y21Var, ArrayList arrayList, sh shVar) {
        this.f22794a = 7;
        this.f22795b = y21Var;
        this.f22796c = arrayList;
    }
}
