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
public final class yo0 implements Runnable {
    public final int f29463a;
    public final Object f29464b;
    public final Object f29465c;

    public yo0(int i10, Object obj, Object obj2) {
        this.f29463a = i10;
        this.f29464b = obj;
        this.f29465c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        int i11;
        String str;
        ArrayList arrayList;
        vl0 vl0Var;
        int i12 = 2;
        ArrayList arrayList2 = null;
        int i13 = 0;
        switch (this.f29463a) {
            case 0:
                ff ffVar = (ff) this.f29464b;
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.f29465c;
                if (eoVar != null) {
                    eoVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ffVar.dismiss();
                    return;
                }
                return;
            case 1:
                ((WindowManager) this.f29465c).removeView(((ff) this.f29464b).B);
                return;
            case 2:
                sq0 sq0Var = (sq0) this.f29464b;
                TLObject tLObject = (TLObject) this.f29465c;
                if (tLObject != null) {
                    sq0Var.f27179k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    sq0Var.Z0();
                    if (sq0Var.m0) {
                        sq0Var.M0();
                    }
                }
                sq0Var.f27180l0 = false;
                return;
            case 3:
                au0 au0Var = (au0) this.f29464b;
                zq0 zq0Var = (zq0) this.f29465c;
                au0Var.G = null;
                au0Var.H = null;
                zq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new zn0(zq0Var, 3)).start();
                return;
            case 4:
                zh.b5 b5Var = (zh.b5) this.f29465c;
                cs0 cs0Var = ((iv0) this.f29464b).W;
                if (cs0Var != null) {
                    int i14 = b5Var.f48308a;
                    cs0Var.f33250n.d(i14, cs0Var.f33252s.i(i14));
                    return;
                }
                return;
            case 5:
                wc.a0(((qt0) this.f29464b).f26486f.f24131v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f29465c).title)).k(true);
                return;
            case 6:
                du0 du0Var = (du0) this.f29464b;
                String str2 = (String) this.f29465c;
                if (!du0Var.v.f24127t1[du0Var.f22484r].f29156a.isEmpty() && ((i10 = du0Var.f22484r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hc.b.i(1, du0Var.v.f24127t1[i10].f29156a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    iv0 iv0Var = du0Var.v;
                    if (iv0Var.f24106j1 == iv0Var.f24131v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    du0Var.F(id2, str2, dialogId, j3);
                } else if (du0Var.f22484r == 3) {
                    iv0 iv0Var2 = du0Var.v;
                    du0Var.F(0, str2, iv0Var2.f24106j1, iv0Var2.F);
                }
                int i15 = du0Var.f22484r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(du0Var.v.f24127t1[du0Var.f22484r].f29156a);
                    du0Var.f22485s++;
                    Utilities.searchQueue.postRunnable(new gf(du0Var, str2, arrayList3, 27));
                    return;
                }
                return;
            case 7:
                du0 du0Var2 = (du0) this.f29464b;
                ArrayList arrayList4 = (ArrayList) this.f29465c;
                iv0 iv0Var3 = du0Var2.v;
                boolean z10 = iv0Var3.V0;
                au0[] au0VarArr = iv0Var3.f24107k0;
                if (z10) {
                    du0Var2.f22485s--;
                    int h = du0Var2.h();
                    du0Var2.d = arrayList4;
                    int h10 = du0Var2.h();
                    if (du0Var2.f22485s == 0 || h10 != 0) {
                        iv0Var3.m1(false);
                    }
                    for (int i16 = 0; i16 < au0VarArr.length; i16++) {
                        au0 au0Var2 = au0VarArr[i16];
                        if (au0Var2.F == du0Var2.f22484r) {
                            if (du0Var2.f22485s == 0 && h10 == 0) {
                                au0Var2.f21597w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                au0VarArr[i16].f21597w.f24512f.setVisibility(8);
                                au0VarArr[i16].f21597w.e(false, true);
                            } else if (h == 0) {
                                iv0Var3.z(au0Var2.h, 0, null);
                            }
                        }
                    }
                    du0Var2.l();
                    return;
                }
                return;
            case 8:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i17 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i17, bool, (TLObject) this.f29464b, (TLRPC.Document) this.f29465c, null, bool);
                return;
            case 9:
                MessagesController.getInstance(((uy0) this.f29464b).f27765a.f29828a).updateEmojiStatus((TLRPC.EmojiStatus) this.f29465c);
                return;
            case 10:
                k31 k31Var = (k31) this.f29464b;
                MessagesController.getInstance(k31Var.f24588b).getTopicsController().deleteTopics(-k31Var.f24590c, (ArrayList) this.f29465c);
                int i18 = k31.f24585f0;
                return;
            case 11:
                k31 k31Var2 = (k31) this.f29464b;
                k31Var2.getClass();
                MessagesController.getInstance(k31Var2.f24588b).loadFullChat(((TLRPC.Updates) this.f29465c).chats.get(0).f17195id, 0, true);
                return;
            case 12:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f29464b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f29465c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    k1Var.c0(i12);
                    return;
                }
                return;
            case 13:
                i41.o((i41) this.f29464b, (TLObject) this.f29465c);
                return;
            case 14:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f29464b;
                String str3 = (String) this.f29465c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.bl blVar = (org.telegram.ui.bl) this.f29464b;
                ((org.telegram.ui.ActionBar.p1) this.f29465c).d(true);
                z41.a(blVar.getContext(), blVar.d);
                return;
            case 16:
                ((TranslateController) this.f29465c).setHideTranslateDialog(((org.telegram.ui.bl) this.f29464b).f29586b, false);
                return;
            case 17:
                UndoView undoView = (UndoView) this.f29464b;
                TLObject tLObject2 = (TLObject) this.f29465c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f21324s.presentFragment(new org.telegram.ui.wo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i19 = UndoView.f21313e0;
                undoView.getClass();
                return;
            case 18:
                ((v51) this.f29464b).D.onClick((org.telegram.ui.Cells.w8) this.f29465c);
                return;
            case 19:
                t71 t71Var = (t71) this.f29464b;
                b2.u0 u0Var = (b2.u0) this.f29465c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = t71.f27360l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = t71Var.N;
                    if (arrayList5 != null) {
                        int i20 = 0;
                        while (i20 < arrayList5.size()) {
                            p71 p71Var = (p71) arrayList5.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList6 = p71Var.d;
                                if (i21 < arrayList6.size()) {
                                    r71 r71Var = (r71) arrayList6.get(i21);
                                    if (!TextUtils.isEmpty(r71Var.f26625m) && !t71.Y(r71Var.f26625m)) {
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
                    t71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        t71Var.F(arrayList2, t71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = t71Var.f27374n;
                if (textureView != null && ((!t71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    t71Var.E = true;
                    if (t71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(t71Var.f27374n);
                            viewGroup.removeView(t71Var.f27374n);
                            viewGroup.addView(t71Var.f27374n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = t71Var.f27363b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new k71(t71Var, 0));
                            return;
                        }
                        i2.e0 e0Var = t71Var.d;
                        TextureView textureView2 = t71Var.f27374n;
                        e0Var.B1();
                        if (textureView2 != null && textureView2 == e0Var.V) {
                            e0Var.B1();
                            e0Var.o1();
                            e0Var.t1(null);
                            e0Var.m1(0, 0);
                        }
                        t71Var.d.v1(t71Var.f27374n);
                        ArrayList arrayList7 = t71Var.N;
                        if (arrayList7 != null) {
                            t71Var.F(arrayList7, t71Var.O);
                        } else if (t71Var.U) {
                            t71Var.G(t71Var.Q, t71Var.S, t71Var.R, t71Var.T);
                        } else {
                            t71Var.D(t71Var.Q, t71Var.S);
                        }
                        t71Var.C();
                        return;
                    }
                    return;
                }
                t71Var.J.onError(t71Var, u0Var);
                return;
            case 20:
                ((s71) this.f29464b).f26971f.K.onVisualizerUpdate(true, true, (float[]) this.f29465c);
                return;
            case 21:
                a81 a81Var = (a81) this.f29464b;
                Bitmap bitmap = (Bitmap) this.f29465c;
                if (bitmap != null) {
                    if (a81Var.f21434w != null) {
                        Bitmap bitmap2 = a81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        a81Var.v = a81Var.f21434w;
                    }
                    a81Var.f21434w = bitmap;
                    Bitmap bitmap3 = a81Var.f21434w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    a81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(a81Var.L);
                    a81Var.J.setShader(a81Var.G);
                    a81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = a81Var.getLayoutParams();
                    if (a81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        a81Var.setVisibility(0);
                        a81Var.requestLayout();
                    }
                }
                a81Var.f21428f = null;
                return;
            case 22:
                final n91 n91Var = (n91) this.f29464b;
                n91Var.e.f25717b.evaluateJavascript((String) this.f29465c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        n91 n91Var2 = n91.this;
                        String[] strArr = n91Var2.f25477c;
                        String str5 = strArr[0];
                        String str6 = n91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        n91Var2.f25476b.countDown();
                    }
                });
                return;
            case 23:
                ((org.telegram.ui.Components.voip.k) this.f29464b).f28205a.setOnClickListener((View.OnClickListener) this.f29465c);
                return;
            case 24:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f29464b;
                Bitmap bitmap4 = (Bitmap) this.f29465c;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f28437w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 25:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f29465c;
                ((org.telegram.ui.Components.voip.m0) this.f29464b).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(tVar2)).setDuration(150L).start();
                return;
            case 26:
                vl0 vl0Var2 = (vl0) this.f29464b;
                Object obj = this.f29465c;
                if (vl0Var2 != null) {
                    vl0Var2.setOnItemClickListener((jl0) obj);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.zt ztVar = (org.telegram.ui.zt) this.f29464b;
                String lowerCase = ((String) this.f29465c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new yo0(28, ztVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = ztVar.f39440f;
                int size = arrayList9.size();
                while (i13 < size) {
                    Object obj2 = arrayList9.get(i13);
                    i13++;
                    org.telegram.ui.wt wtVar = (org.telegram.ui.wt) obj2;
                    String str4 = wtVar.f38386a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(wtVar.f38386a).toLowerCase();
                    String str6 = wtVar.f38387b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(wtVar.f38387b).toLowerCase();
                    String str7 = wtVar.f38388c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        str5 = "+".concat(str7);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList9;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.a2.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.a2.w(" ", translitSafe, lowerCase5) && !str7.startsWith(lowerCase) && !str5.startsWith(lowerCase)) {
                            arrayList9 = arrayList;
                        }
                    } else {
                        arrayList = arrayList9;
                    }
                    arrayList8.add(wtVar);
                    arrayList9 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new yo0(28, ztVar, arrayList8));
                return;
            case 28:
                org.telegram.ui.zt ztVar2 = (org.telegram.ui.zt) this.f29464b;
                ArrayList arrayList10 = (ArrayList) this.f29465c;
                org.telegram.ui.bu buVar = ztVar2.h;
                if (buVar.f31403f) {
                    ztVar2.e = arrayList10;
                    if (buVar.e && (vl0Var = buVar.f31400a) != null) {
                        s4.h0 adapter = vl0Var.getAdapter();
                        org.telegram.ui.zt ztVar3 = buVar.d;
                        if (adapter != ztVar3) {
                            buVar.f31400a.setAdapter(ztVar3);
                            buVar.f31400a.setFastScrollVisible(false);
                        }
                    }
                    ztVar2.l();
                    return;
                }
                return;
            default:
                org.telegram.ui.du.P((org.telegram.ui.du) this.f29464b, (TLRPC.Updates) this.f29465c);
                return;
        }
    }

    public yo0(Object obj, Object obj2, Object obj3, int i10) {
        this.f29463a = i10;
        this.f29464b = obj;
        this.f29465c = obj2;
    }
}
