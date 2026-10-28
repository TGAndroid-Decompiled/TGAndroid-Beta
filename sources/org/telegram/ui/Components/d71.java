package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d71 implements Runnable {
    public final int f27360a;
    public final Object f27361b;
    public final Object f27362c;

    public d71(int i10, Object obj, Object obj2) {
        this.f27360a = i10;
        this.f27361b = obj;
        this.f27362c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        cc1 cc1Var;
        String str2;
        String str3;
        int i11;
        nm0 nm0Var;
        int i12;
        ArrayList arrayList = null;
        String str4 = null;
        int i13 = 0;
        switch (this.f27360a) {
            case 0:
                UndoView undoView = (UndoView) this.f27361b;
                TLObject tLObject = (TLObject) this.f27362c;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.f26364s.presentFragment(new org.telegram.ui.ro0((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                int i14 = UndoView.f26349i0;
                undoView.getClass();
                return;
            case 1:
                ((u61) this.f27361b).D.onClick((org.telegram.ui.Cells.z8) this.f27362c);
                return;
            case 2:
                t81 t81Var = (t81) this.f27361b;
                b2.z0 z0Var = (b2.z0) this.f27362c;
                Throwable cause = z0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(z0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = t81.f32883l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = t81Var.N;
                    if (arrayList2 != null) {
                        int i15 = 0;
                        while (i15 < arrayList2.size()) {
                            p81 p81Var = (p81) arrayList2.get(i15);
                            int i16 = 0;
                            while (true) {
                                ArrayList arrayList3 = p81Var.d;
                                if (i16 < arrayList3.size()) {
                                    r81 r81Var = (r81) arrayList3.get(i16);
                                    if (!TextUtils.isEmpty(r81Var.f32181m) && !t81.Y(r81Var.f32181m)) {
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
                    t81Var.N = arrayList;
                    if (arrayList != null) {
                        t81Var.F(arrayList, t81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = t81Var.f32897n;
                if (textureView != null && ((!t81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    t81Var.E = true;
                    if (t81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(t81Var.f32897n);
                            viewGroup.removeView(t81Var.f32897n);
                            viewGroup.addView(t81Var.f32897n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = t81Var.f32886b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new t51(t81Var, 6));
                            return;
                        }
                        i2.j0 j0Var = t81Var.d;
                        TextureView textureView2 = t81Var.f32897n;
                        j0Var.F1();
                        if (textureView2 != null && textureView2 == j0Var.X) {
                            j0Var.F1();
                            j0Var.s1();
                            j0Var.x1(null);
                            j0Var.q1(0, 0);
                        }
                        t81Var.d.z1(t81Var.f32897n);
                        ArrayList arrayList4 = t81Var.N;
                        if (arrayList4 != null) {
                            t81Var.F(arrayList4, t81Var.O);
                        } else if (t81Var.U) {
                            t81Var.G(t81Var.Q, t81Var.S, t81Var.R, t81Var.T);
                        } else {
                            t81Var.D(t81Var.Q, t81Var.S);
                        }
                        t81Var.C();
                        return;
                    }
                    return;
                }
                t81Var.J.onError(t81Var, z0Var);
                return;
            case 3:
                ((s81) this.f27361b).f32516f.K.onVisualizerUpdate(true, true, (float[]) this.f27362c);
                return;
            case 4:
                a91 a91Var = (a91) this.f27361b;
                Bitmap bitmap = (Bitmap) this.f27362c;
                if (bitmap != null) {
                    if (a91Var.f26479w != null) {
                        Bitmap bitmap2 = a91Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        a91Var.v = a91Var.f26479w;
                    }
                    a91Var.f26479w = bitmap;
                    Bitmap bitmap3 = a91Var.f26479w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    a91Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(a91Var.L);
                    a91Var.J.setShader(a91Var.G);
                    a91Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i10 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = a91Var.getLayoutParams();
                    if (a91Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        a91Var.setVisibility(0);
                        a91Var.requestLayout();
                    }
                }
                a91Var.f26473f = null;
                return;
            case 5:
                final ma1 ma1Var = (ma1) this.f27361b;
                ma1Var.e.f30809b.evaluateJavascript((String) this.f27362c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str5 = (String) obj;
                        ma1 ma1Var2 = ma1.this;
                        String[] strArr = ma1Var2.f30490c;
                        String str6 = strArr[0];
                        String str7 = ma1Var2.d;
                        strArr[0] = str6.replace(str7, "/signature/" + str5.substring(1, str5.length() - 1));
                        ma1Var2.f30489b.countDown();
                    }
                });
                return;
            case 6:
                dc1 dc1Var = (dc1) this.f27361b;
                qa1 qa1Var = (qa1) this.f27362c;
                dc1Var.I = qa1Var;
                dc1Var.L = qa1Var;
                dc1Var.f(true);
                return;
            case 7:
                ((ra1) this.f27361b).d.e((String) this.f27362c);
                return;
            case 8:
                ((ab1) this.f27361b).f26501f.e((String) this.f27362c);
                return;
            case 9:
                dc1 dc1Var2 = (dc1) this.f27361b;
                za1 za1Var = (za1) this.f27362c;
                dc1Var2.I = za1Var;
                dc1Var2.L = za1Var;
                dc1Var2.f(true);
                return;
            case 10:
                gb1 gb1Var = (gb1) this.f27361b;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) this.f27362c;
                gb1Var.f28524q = tL_messageMediaWidget;
                gb1Var.f28523p = tL_messageMediaWidget.public_data_hash;
                jb1.c(gb1Var, jb1.w(tL_messageMediaWidget.chat_data), jb1.w(tL_messageMediaWidget.public_data));
                return;
            case 11:
                gb1 gb1Var2 = (gb1) this.f27362c;
                Object[] widgetState = ((MessagesStorage) this.f27361b).getWidgetState(gb1Var2.f28513c, gb1Var2.d);
                ArrayList arrayList5 = (ArrayList) widgetState[1];
                if (!arrayList5.isEmpty()) {
                    String a2 = gb1Var2.a();
                    ConcurrentHashMap concurrentHashMap = jb1.f29625b;
                    hb1 hb1Var = (hb1) concurrentHashMap.get(a2);
                    if (hb1Var == null) {
                        hb1Var = new hb1();
                        hb1 hb1Var2 = (hb1) concurrentHashMap.putIfAbsent(a2, hb1Var);
                        if (hb1Var2 != null) {
                            hb1Var = hb1Var2;
                        }
                    }
                    synchronized (hb1Var) {
                        if (hb1Var.f28950a.isEmpty()) {
                            while (i13 < arrayList5.size() && i13 < 4) {
                                hb1Var.f28950a.add((int[]) arrayList5.get(i13));
                                i13++;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new d71(12, gb1Var2, widgetState));
                return;
            case 12:
                gb1 gb1Var3 = (gb1) this.f27361b;
                String str5 = (String) ((Object[]) this.f27362c)[0];
                HashMap hashMap2 = jb1.f29626c;
                gb1Var3.f28531y = true;
                String a10 = gb1Var3.a();
                if (str5 != null && !hashMap2.containsKey(a10)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str5));
                        hashMap2.put(a10, jSONObject);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                nb1 nb1Var = gb1Var3.f28526s;
                if (nb1Var != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap2.get(a10);
                    try {
                        str = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                    } catch (Exception unused) {
                        str = null;
                    }
                    if (jSONObject2 != null) {
                        str4 = jSONObject2.toString();
                    }
                    nb1Var.f30854t = str;
                    nb1Var.f30855u = str4;
                }
                bn0 bn0Var = gb1Var3.f28527t;
                if (bn0Var != null && (nb1Var == null || nb1Var.f30843i <= 0)) {
                    bn0Var.q("cached heights read");
                }
                if (gb1Var3.f28532z) {
                    gb1Var3.f28532z = false;
                    if (gb1Var3.f28529w > 0 && nb1Var != null) {
                        jb1.v(gb1Var3);
                    }
                }
                jb1.n();
                return;
            case 13:
                dc1 dc1Var3 = (dc1) this.f27361b;
                dc1Var3.M = ((Exception) this.f27362c).toString();
                if (!dc1Var3.f27412t && (cc1Var = dc1Var3.I) != null) {
                    cc1Var.e(dc1Var3.M);
                    return;
                }
                return;
            case 14:
                ((org.telegram.ui.Components.voip.k) this.f27361b).f33983a.setOnClickListener((View.OnClickListener) this.f27362c);
                return;
            case 15:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f27361b;
                Bitmap bitmap4 = (Bitmap) this.f27362c;
                HashMap<String, Bitmap> hashMap3 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f34207w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z10) {
                    str2 = groupCallParticipant.presentationEndpoint;
                } else {
                    str2 = groupCallParticipant.videoEndpoint;
                }
                hashMap3.put(str2, bitmap4);
                return;
            case 16:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f27362c;
                ((org.telegram.ui.Components.voip.l0) this.f27361b).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 17:
                nm0 nm0Var2 = (nm0) this.f27361b;
                Object obj = this.f27362c;
                if (nm0Var2 != null) {
                    nm0Var2.setOnItemClickListener((am0) obj);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ot otVar = (org.telegram.ui.ot) this.f27361b;
                String str6 = "";
                String lowerCase = ((String) this.f27362c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new d71(19, otVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = otVar.f42187f;
                int size = arrayList7.size();
                while (i13 < size) {
                    Object obj2 = arrayList7.get(i13);
                    int i17 = i13 + 1;
                    org.telegram.ui.lt ltVar = (org.telegram.ui.lt) obj2;
                    String str7 = ltVar.f41258a;
                    if (str7 == null) {
                        str7 = str6;
                    }
                    String lowerCase2 = str7.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(ltVar.f41258a).toLowerCase();
                    String str8 = ltVar.f41259b;
                    if (str8 == null) {
                        str8 = str6;
                    }
                    String lowerCase4 = str8.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(ltVar.f41259b).toLowerCase();
                    String str9 = ltVar.f41260c;
                    if (str9 == null) {
                        str9 = str6;
                    }
                    if (TextUtils.isEmpty(str9)) {
                        str3 = str6;
                    } else {
                        str3 = str6;
                        str6 = "+".concat(str9);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        i11 = i17;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.wh.u(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.wh.u(" ", translitSafe, lowerCase5) && !str9.startsWith(lowerCase) && !str6.startsWith(lowerCase)) {
                            str6 = str3;
                            i13 = i11;
                        }
                    } else {
                        i11 = i17;
                    }
                    arrayList6.add(ltVar);
                    str6 = str3;
                    i13 = i11;
                }
                AndroidUtilities.runOnUIThread(new d71(19, otVar, arrayList6));
                return;
            case 19:
                org.telegram.ui.ot otVar2 = (org.telegram.ui.ot) this.f27361b;
                ArrayList arrayList8 = (ArrayList) this.f27362c;
                org.telegram.ui.qt qtVar = otVar2.h;
                if (qtVar.f42785f) {
                    otVar2.e = arrayList8;
                    if (qtVar.e && (nm0Var = qtVar.f42782a) != null) {
                        s4.h0 adapter = nm0Var.getAdapter();
                        org.telegram.ui.ot otVar3 = qtVar.d;
                        if (adapter != otVar3) {
                            qtVar.f42782a.setAdapter(otVar3);
                            qtVar.f42782a.setFastScrollVisible(false);
                        }
                    }
                    otVar2.l();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.tt.P((org.telegram.ui.tt) this.f27361b, (TLRPC.Updates) this.f27362c);
                return;
            case 21:
                org.telegram.ui.ey.d0((org.telegram.ui.ey) this.f27361b, (String) this.f27362c);
                return;
            case 22:
                hi.m3.j(((org.telegram.ui.ey) this.f27361b).currentAccount, ((TLRPC.TL_attachMenuBot) this.f27362c).bot_id, null);
                return;
            case 23:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f27361b;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.f27362c;
                org.telegram.ui.ActionBar.k3 k3Var = k3VarArr[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                    k3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ev(eyVar, 25), 300L);
                return;
            case 24:
                org.telegram.ui.ey eyVar2 = (org.telegram.ui.ey) this.f27361b;
                ArrayList<Long> arrayList9 = (ArrayList) this.f27362c;
                MessagesController messagesController = eyVar2.getMessagesController();
                if (eyVar2.W2 == 0 && eyVar2.Y2 == 0) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                messagesController.addDialogToFolder(arrayList9, i12, -1, null, 0L);
                return;
            case 25:
                CharSequence charSequence = (CharSequence) this.f27362c;
                org.telegram.ui.ey eyVar3 = ((org.telegram.ui.mw) this.f27361b).f41574a;
                eyVar3.H2 = null;
                rr0 rr0Var = eyVar3.G2;
                if (rr0Var != null && rr0Var.h) {
                    rr0Var.e(charSequence, false);
                    return;
                }
                return;
            case 26:
                org.telegram.ui.ActionBar.r2[] r2VarArr = (org.telegram.ui.ActionBar.r2[]) this.f27362c;
                ((org.telegram.ui.ax) this.f27361b).f37838b.removeSelfFromStack();
                if (r2VarArr[1] != null) {
                    r2VarArr[0].removeSelfFromStack();
                    r2VarArr[1].finishFragment();
                    return;
                }
                r2VarArr[0].finishFragment();
                return;
            case 27:
                ArrayList arrayList10 = (ArrayList) this.f27362c;
                org.telegram.ui.ey eyVar4 = ((org.telegram.ui.ux) this.f27361b).f44129b;
                eyVar4.f39108z3 = 2;
                eyVar4.I4(true, true);
                eyVar4.w3();
                while (i13 < arrayList10.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList10.get(i13)).f22032id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList10.get(i13);
                    if (eyVar4.getMessagesController().isForum(j10) || eyVar4.getMessagesController().isMonoForumWithManageRights(j10)) {
                        eyVar4.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    eyVar4.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = eyVar4.getMessagesController();
                    int i18 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i18, i18, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                return;
            case 28:
                ((org.telegram.ui.ux) this.f27361b).d((MessagesController.DialogFilter) this.f27362c);
                return;
            default:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f27361b;
                org.telegram.ui.wn wnVar = qyVar.f42806a;
                dz0 dz0Var = new dz0(wnVar.getParentActivity(), qyVar.f42806a, ((MessageObject) this.f27362c).getInputStickerSet(), null, wnVar.Y, wnVar.getResourceProvider());
                dz0Var.setCalcMandatoryInsets(wnVar.I9());
                wnVar.showDialog(dz0Var);
                return;
        }
    }
}
