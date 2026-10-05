package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import java.io.Serializable;
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
import org.telegram.ui.PremiumPreviewFragment;
public final class vo0 implements Runnable {
    public final int f31822a;
    public final Object f31823b;
    public final Object f31824c;

    public vo0(int i10, Object obj, Object obj2) {
        this.f31822a = i10;
        this.f31823b = obj;
        this.f31824c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        int i11;
        String str;
        ArrayList arrayList;
        zl0 zl0Var;
        int i12 = 2;
        ArrayList arrayList2 = null;
        int i13 = 0;
        switch (this.f31822a) {
            case 0:
                ((wo0) this.f31823b).sendAccessibilityEvent((View) this.f31824c, 4);
                return;
            case 1:
                gf gfVar = (gf) this.f31823b;
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) this.f31824c;
                if (ynVar != null) {
                    ynVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    gfVar.dismiss();
                    return;
                }
                return;
            case 2:
                ((WindowManager) this.f31824c).removeView(((gf) this.f31823b).B);
                return;
            case 3:
                br0 br0Var = (br0) this.f31823b;
                TLObject tLObject = (TLObject) this.f31824c;
                if (tLObject != null) {
                    br0Var.f25065k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    br0Var.W0();
                    if (br0Var.m0) {
                        br0Var.J0();
                    }
                }
                br0Var.f25066l0 = false;
                return;
            case 4:
                ju0 ju0Var = (ju0) this.f31823b;
                hr0 hr0Var = (hr0) this.f31824c;
                ju0Var.G = null;
                ju0Var.H = null;
                hr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new hd0(hr0Var, 14)).start();
                return;
            case 5:
                ai.e9 e9Var = (ai.e9) this.f31824c;
                ls0 ls0Var = ((qv0) this.f31823b).W;
                if (ls0Var != null) {
                    int i14 = e9Var.f922a;
                    ls0Var.f40686n.d(i14, ls0Var.f40688s.i(i14));
                    return;
                }
                return;
            case 6:
                yc.a0(((zt0) this.f31823b).f33641f.f30263v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f31824c).title)).k(true);
                return;
            case 7:
                mu0 mu0Var = (mu0) this.f31823b;
                String str2 = (String) this.f31824c;
                if (!mu0Var.v.f30259t1[mu0Var.f28808r].f26591a.isEmpty() && ((i10 = mu0Var.f28808r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, mu0Var.v.f30259t1[i10].f26591a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    qv0 qv0Var = mu0Var.v;
                    if (qv0Var.f30238j1 == qv0Var.f30263v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    mu0Var.F(id2, str2, dialogId, j3);
                } else if (mu0Var.f28808r == 3) {
                    qv0 qv0Var2 = mu0Var.v;
                    mu0Var.F(0, str2, qv0Var2.f30238j1, qv0Var2.F);
                }
                int i15 = mu0Var.f28808r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(mu0Var.v.f30259t1[mu0Var.f28808r].f26591a);
                    mu0Var.f28809s++;
                    Utilities.searchQueue.postRunnable(new in0((Object) mu0Var, (Serializable) str2, arrayList3, 8));
                    return;
                }
                return;
            case 8:
                mu0 mu0Var2 = (mu0) this.f31823b;
                ArrayList arrayList4 = (ArrayList) this.f31824c;
                qv0 qv0Var3 = mu0Var2.v;
                boolean z10 = qv0Var3.V0;
                ju0[] ju0VarArr = qv0Var3.f30239k0;
                if (z10) {
                    mu0Var2.f28809s--;
                    int h = mu0Var2.h();
                    mu0Var2.d = arrayList4;
                    int h10 = mu0Var2.h();
                    if (mu0Var2.f28809s == 0 || h10 != 0) {
                        qv0Var3.m1(false);
                    }
                    for (int i16 = 0; i16 < ju0VarArr.length; i16++) {
                        ju0 ju0Var2 = ju0VarArr[i16];
                        if (ju0Var2.F == mu0Var2.f28808r) {
                            if (mu0Var2.f28809s == 0 && h10 == 0) {
                                ju0Var2.f27979w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                ju0VarArr[i16].f27979w.f31552f.setVisibility(8);
                                ju0VarArr[i16].f27979w.e(false, true);
                            } else if (h == 0) {
                                qv0Var3.z(ju0Var2.h, 0, null);
                            }
                        }
                    }
                    mu0Var2.l();
                    return;
                }
                return;
            case 9:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i17 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i17, bool, (TLObject) this.f31823b, (TLRPC.Document) this.f31824c, null, bool);
                return;
            case 10:
                MessagesController.getInstance(((ez0) this.f31823b).f26231a.f27998a).updateEmojiStatus((TLRPC.EmojiStatus) this.f31824c);
                return;
            case 11:
                w31 w31Var = (w31) this.f31823b;
                MessagesController.getInstance(w31Var.f32500b).getTopicsController().deleteTopics(-w31Var.f32502c, (ArrayList) this.f31824c);
                int i18 = w31.f32497f0;
                return;
            case 12:
                w31 w31Var2 = (w31) this.f31823b;
                w31Var2.getClass();
                MessagesController.getInstance(w31Var2.f32500b).loadFullChat(((TLRPC.Updates) this.f31824c).chats.get(0).f20047id, 0, true);
                return;
            case 13:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f31823b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f31824c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.e0(i12);
                    return;
                }
                return;
            case 14:
                u41.o((u41) this.f31823b, (TLObject) this.f31824c);
                return;
            case 15:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f31823b;
                String str3 = (String) this.f31824c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f31823b;
                ((org.telegram.ui.ActionBar.n1) this.f31824c).d(true);
                l51.a(wkVar.getContext(), wkVar.d);
                return;
            case 17:
                ((TranslateController) this.f31824c).setHideTranslateDialog(((org.telegram.ui.wk) this.f31823b).f28370b, false);
                return;
            case 18:
                UndoView undoView = (UndoView) this.f31823b;
                TLObject tLObject2 = (TLObject) this.f31824c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24387s.presentFragment(new org.telegram.ui.so0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i19 = UndoView.f24375e0;
                undoView.getClass();
                return;
            case 19:
                ((h61) this.f31823b).D.onClick((org.telegram.ui.Cells.v8) this.f31824c);
                return;
            case 20:
                e81 e81Var = (e81) this.f31823b;
                b2.u0 u0Var = (b2.u0) this.f31824c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = e81.f26047l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = e81Var.N;
                    if (arrayList5 != null) {
                        int i20 = 0;
                        while (i20 < arrayList5.size()) {
                            a81 a81Var = (a81) arrayList5.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList6 = a81Var.d;
                                if (i21 < arrayList6.size()) {
                                    c81 c81Var = (c81) arrayList6.get(i21);
                                    if (!TextUtils.isEmpty(c81Var.f25310m) && !e81.Y(c81Var.f25310m)) {
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
                    e81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        e81Var.F(arrayList2, e81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = e81Var.f26062n;
                if (textureView != null && ((!e81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    e81Var.E = true;
                    if (e81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(e81Var.f26062n);
                            viewGroup.removeView(e81Var.f26062n);
                            viewGroup.addView(e81Var.f26062n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = e81Var.f26050b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new q61(e81Var, 3));
                            return;
                        }
                        i2.f0 f0Var = e81Var.d;
                        TextureView textureView2 = e81Var.f26062n;
                        f0Var.B1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.B1();
                            f0Var.o1();
                            f0Var.t1(null);
                            f0Var.m1(0, 0);
                        }
                        e81Var.d.v1(e81Var.f26062n);
                        ArrayList arrayList7 = e81Var.N;
                        if (arrayList7 != null) {
                            e81Var.F(arrayList7, e81Var.O);
                        } else if (e81Var.U) {
                            e81Var.G(e81Var.Q, e81Var.S, e81Var.R, e81Var.T);
                        } else {
                            e81Var.D(e81Var.Q, e81Var.S);
                        }
                        e81Var.C();
                        return;
                    }
                    return;
                }
                e81Var.J.onError(e81Var, u0Var);
                return;
            case 21:
                ((d81) this.f31823b).f25716f.K.onVisualizerUpdate(true, true, (float[]) this.f31824c);
                return;
            case 22:
                l81 l81Var = (l81) this.f31823b;
                Bitmap bitmap = (Bitmap) this.f31824c;
                if (bitmap != null) {
                    if (l81Var.f28414w != null) {
                        Bitmap bitmap2 = l81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        l81Var.v = l81Var.f28414w;
                    }
                    l81Var.f28414w = bitmap;
                    Bitmap bitmap3 = l81Var.f28414w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    l81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(l81Var.L);
                    l81Var.J.setShader(l81Var.G);
                    l81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = l81Var.getLayoutParams();
                    if (l81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        l81Var.setVisibility(0);
                        l81Var.requestLayout();
                    }
                }
                l81Var.f28408f = null;
                return;
            case 23:
                final z91 z91Var = (z91) this.f31823b;
                z91Var.f33475e.f24556b.evaluateJavascript((String) this.f31824c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        z91 z91Var2 = z91.this;
                        String[] strArr = z91Var2.f33474c;
                        String str5 = strArr[0];
                        String str6 = z91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        z91Var2.f33473b.countDown();
                    }
                });
                return;
            case 24:
                ((org.telegram.ui.Components.voip.k) this.f31823b).f31996a.setOnClickListener((View.OnClickListener) this.f31824c);
                return;
            case 25:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f31823b;
                Bitmap bitmap4 = (Bitmap) this.f31824c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f32273w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 26:
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f31824c;
                ((org.telegram.ui.Components.voip.m0) this.f31823b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            case 27:
                zl0 zl0Var2 = (zl0) this.f31823b;
                Object obj = this.f31824c;
                if (zl0Var2 != null) {
                    zl0Var2.setOnItemClickListener((ml0) obj);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.xt xtVar = (org.telegram.ui.xt) this.f31823b;
                String lowerCase = ((String) this.f31824c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new vo0(29, xtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = xtVar.f43013f;
                int size = arrayList9.size();
                while (i13 < size) {
                    Object obj2 = arrayList9.get(i13);
                    i13++;
                    org.telegram.ui.ut utVar = (org.telegram.ui.ut) obj2;
                    String str4 = utVar.f41340a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(utVar.f41340a).toLowerCase();
                    String str6 = utVar.f41341b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(utVar.f41341b).toLowerCase();
                    String str7 = utVar.f41342c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        str5 = "+".concat(str7);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList9;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.bi.u(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.bi.u(" ", translitSafe, lowerCase5) && !str7.startsWith(lowerCase) && !str5.startsWith(lowerCase)) {
                            arrayList9 = arrayList;
                        }
                    } else {
                        arrayList = arrayList9;
                    }
                    arrayList8.add(utVar);
                    arrayList9 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new vo0(29, xtVar, arrayList8));
                return;
            default:
                org.telegram.ui.xt xtVar2 = (org.telegram.ui.xt) this.f31823b;
                ArrayList arrayList10 = (ArrayList) this.f31824c;
                org.telegram.ui.zt ztVar = xtVar2.h;
                if (ztVar.f43897f) {
                    xtVar2.f43012e = arrayList10;
                    if (ztVar.f43896e && (zl0Var = ztVar.f43893a) != null) {
                        s4.h0 adapter = zl0Var.getAdapter();
                        org.telegram.ui.xt xtVar3 = ztVar.d;
                        if (adapter != xtVar3) {
                            ztVar.f43893a.setAdapter(xtVar3);
                            ztVar.f43893a.setFastScrollVisible(false);
                        }
                    }
                    xtVar2.l();
                    return;
                }
                return;
        }
    }

    public vo0(Object obj, Object obj2, Object obj3, int i10) {
        this.f31822a = i10;
        this.f31823b = obj;
        this.f31824c = obj2;
    }
}
