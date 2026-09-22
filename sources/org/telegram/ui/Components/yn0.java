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
public final class yn0 implements Runnable {
    public final int f30730a;
    public final Object f30731b;
    public final Object f30732c;

    public yn0(int i10, Object obj, Object obj2) {
        this.f30730a = i10;
        this.f30731b = obj;
        this.f30732c = obj2;
    }

    @Override
    public final void run() {
        int indexOf;
        int L;
        int i10;
        long j3;
        int i11;
        String str;
        int i12 = 2;
        ArrayList arrayList = null;
        switch (this.f30730a) {
            case 0:
                go0 go0Var = (go0) this.f30731b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f30732c;
                ArrayList arrayList2 = go0Var.K;
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(tL_sponsoredPeer)) >= 0 && (L = go0Var.L()) < go0Var.h()) {
                    arrayList2.remove(indexOf);
                    go0Var.u(L + 1 + indexOf);
                    int size = go0Var.f9773j0.e.size();
                    int size2 = arrayList2.size();
                    if (go0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        go0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((go0) this.f30731b).T();
                xc.a0((org.telegram.ui.uy) this.f30732c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                ((ro0) this.f30731b).sendAccessibilityEvent((View) this.f30732c, 4);
                return;
            case 3:
                ef efVar = (ef) this.f30731b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f30732c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    return;
                }
                return;
            case 4:
                ((WindowManager) this.f30732c).removeView(((ef) this.f30731b).B);
                return;
            case 5:
                wq0 wq0Var = (wq0) this.f30731b;
                TLObject tLObject = (TLObject) this.f30732c;
                if (tLObject != null) {
                    wq0Var.f30110k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    wq0Var.Z0();
                    if (wq0Var.m0) {
                        wq0Var.M0();
                    }
                }
                wq0Var.f30111l0 = false;
                return;
            case 6:
                eu0 eu0Var = (eu0) this.f30731b;
                dr0 dr0Var = (dr0) this.f30732c;
                eu0Var.G = null;
                eu0Var.H = null;
                dr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new gd0(dr0Var, 14)).start();
                return;
            case 7:
                ai.e9 e9Var = (ai.e9) this.f30732c;
                gs0 gs0Var = ((lv0) this.f30731b).W;
                if (gs0Var != null) {
                    int i13 = e9Var.f770a;
                    gs0Var.f31984n.d(i13, gs0Var.f31986s.i(i13));
                    return;
                }
                return;
            case 8:
                xc.a0(((ut0) this.f30731b).f28899f.f26234v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f30732c).title)).k(true);
                return;
            case 9:
                hu0 hu0Var = (hu0) this.f30731b;
                String str2 = (String) this.f30732c;
                if (!hu0Var.v.f26230t1[hu0Var.f24895r].f22744a.isEmpty() && ((i10 = hu0Var.f24895r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.k0.g(1, hu0Var.v.f26230t1[i10].f22744a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    lv0 lv0Var = hu0Var.v;
                    if (lv0Var.f26209j1 == lv0Var.f26234v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    hu0Var.F(id2, str2, dialogId, j3);
                } else if (hu0Var.f24895r == 3) {
                    lv0 lv0Var2 = hu0Var.v;
                    hu0Var.F(0, str2, lv0Var2.f26209j1, lv0Var2.F);
                }
                int i14 = hu0Var.f24895r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(hu0Var.v.f26230t1[hu0Var.f24895r].f22744a);
                    hu0Var.f24896s++;
                    Utilities.searchQueue.postRunnable(new en0((Object) hu0Var, (Serializable) str2, arrayList3, 8));
                    return;
                }
                return;
            case 10:
                hu0 hu0Var2 = (hu0) this.f30731b;
                ArrayList arrayList4 = (ArrayList) this.f30732c;
                lv0 lv0Var3 = hu0Var2.v;
                boolean z10 = lv0Var3.V0;
                eu0[] eu0VarArr = lv0Var3.f26210k0;
                if (z10) {
                    hu0Var2.f24896s--;
                    int h = hu0Var2.h();
                    hu0Var2.d = arrayList4;
                    int h10 = hu0Var2.h();
                    if (hu0Var2.f24896s == 0 || h10 != 0) {
                        lv0Var3.m1(false);
                    }
                    for (int i15 = 0; i15 < eu0VarArr.length; i15++) {
                        eu0 eu0Var2 = eu0VarArr[i15];
                        if (eu0Var2.F == hu0Var2.f24895r) {
                            if (hu0Var2.f24896s == 0 && h10 == 0) {
                                eu0Var2.f24045w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                eu0VarArr[i15].f24045w.f26254f.setVisibility(8);
                                eu0VarArr[i15].f24045w.e(false, true);
                            } else if (h == 0) {
                                lv0Var3.z(eu0Var2.h, 0, null);
                            }
                        }
                    }
                    hu0Var2.l();
                    return;
                }
                return;
            case 11:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f30731b, (TLRPC.Document) this.f30732c, null, bool);
                return;
            case 12:
                MessagesController.getInstance(((vy0) this.f30731b).f29833a.f22774a).updateEmojiStatus((TLRPC.EmojiStatus) this.f30732c);
                return;
            case 13:
                n31 n31Var = (n31) this.f30731b;
                MessagesController.getInstance(n31Var.f26610b).getTopicsController().deleteTopics(-n31Var.f26612c, (ArrayList) this.f30732c);
                int i17 = n31.f26607f0;
                return;
            case 14:
                n31 n31Var2 = (n31) this.f30731b;
                n31Var2.getClass();
                MessagesController.getInstance(n31Var2.f26610b).loadFullChat(((TLRPC.Updates) this.f30732c).chats.get(0).f18343id, 0, true);
                return;
            case 15:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f30731b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f30732c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 16:
                l41.o((l41) this.f30731b, (TLObject) this.f30732c);
                return;
            case 17:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f30731b;
                String str3 = (String) this.f30732c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.f30731b;
                ((org.telegram.ui.ActionBar.n1) this.f30732c).d(true);
                c51.a(zkVar.getContext(), zkVar.d);
                return;
            case 19:
                ((TranslateController) this.f30732c).setHideTranslateDialog(((org.telegram.ui.zk) this.f30731b).f23181b, false);
                return;
            case 20:
                UndoView undoView = (UndoView) this.f30731b;
                TLObject tLObject2 = (TLObject) this.f30732c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f22476s.presentFragment(new org.telegram.ui.xo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f22465e0;
                undoView.getClass();
                return;
            case 21:
                ((y51) this.f30731b).D.onClick((org.telegram.ui.Cells.w8) this.f30732c);
                return;
            case 22:
                v71 v71Var = (v71) this.f30731b;
                b2.u0 u0Var = (b2.u0) this.f30732c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = v71.f29000l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = v71Var.N;
                    if (arrayList5 != null) {
                        int i19 = 0;
                        while (i19 < arrayList5.size()) {
                            r71 r71Var = (r71) arrayList5.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList6 = r71Var.d;
                                if (i20 < arrayList6.size()) {
                                    t71 t71Var = (t71) arrayList6.get(i20);
                                    if (!TextUtils.isEmpty(t71Var.f28418m) && !v71.Y(t71Var.f28418m)) {
                                        arrayList6.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                } else {
                                    if (arrayList6.isEmpty()) {
                                        arrayList5.remove(i19);
                                        i19--;
                                    }
                                    i19++;
                                }
                            }
                        }
                        arrayList = arrayList5;
                    }
                    v71Var.N = arrayList;
                    if (arrayList != null) {
                        v71Var.F(arrayList, v71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = v71Var.f29014n;
                if (textureView != null && ((!v71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    v71Var.E = true;
                    if (v71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(v71Var.f29014n);
                            viewGroup.removeView(v71Var.f29014n);
                            viewGroup.addView(v71Var.f29014n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = v71Var.f29003b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new j71(v71Var, 1));
                            return;
                        }
                        i2.e0 e0Var = v71Var.d;
                        TextureView textureView2 = v71Var.f29014n;
                        e0Var.B1();
                        if (textureView2 != null && textureView2 == e0Var.V) {
                            e0Var.B1();
                            e0Var.o1();
                            e0Var.t1(null);
                            e0Var.m1(0, 0);
                        }
                        v71Var.d.v1(v71Var.f29014n);
                        ArrayList arrayList7 = v71Var.N;
                        if (arrayList7 != null) {
                            v71Var.F(arrayList7, v71Var.O);
                        } else if (v71Var.U) {
                            v71Var.G(v71Var.Q, v71Var.S, v71Var.R, v71Var.T);
                        } else {
                            v71Var.D(v71Var.Q, v71Var.S);
                        }
                        v71Var.C();
                        return;
                    }
                    return;
                }
                v71Var.J.onError(v71Var, u0Var);
                return;
            case 23:
                ((u71) this.f30731b).f28692f.K.onVisualizerUpdate(true, true, (float[]) this.f30732c);
                return;
            case 24:
                d81 d81Var = (d81) this.f30731b;
                Bitmap bitmap = (Bitmap) this.f30732c;
                if (bitmap != null) {
                    if (d81Var.f23599w != null) {
                        Bitmap bitmap2 = d81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        d81Var.v = d81Var.f23599w;
                    }
                    d81Var.f23599w = bitmap;
                    Bitmap bitmap3 = d81Var.f23599w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    d81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(d81Var.L);
                    d81Var.J.setShader(d81Var.G);
                    d81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = d81Var.getLayoutParams();
                    if (d81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        d81Var.setVisibility(0);
                        d81Var.requestLayout();
                    }
                }
                d81Var.f23593f = null;
                return;
            case 25:
                final q91 q91Var = (q91) this.f30731b;
                q91Var.e.f27892b.evaluateJavascript((String) this.f30732c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        q91 q91Var2 = q91.this;
                        String[] strArr = q91Var2.f27529c;
                        String str5 = strArr[0];
                        String str6 = q91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        q91Var2.f27528b.countDown();
                    }
                });
                return;
            case 26:
                ((org.telegram.ui.Components.voip.k) this.f30731b).f29393a.setOnClickListener((View.OnClickListener) this.f30732c);
                return;
            case 27:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f30731b;
                Bitmap bitmap4 = (Bitmap) this.f30732c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29633w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 28:
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f30732c;
                ((org.telegram.ui.Components.voip.m0) this.f30731b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            default:
                yl0 yl0Var = (yl0) this.f30731b;
                Object obj = this.f30732c;
                if (yl0Var != null) {
                    yl0Var.setOnItemClickListener((ml0) obj);
                    return;
                }
                return;
        }
    }

    public yn0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30730a = i10;
        this.f30731b = obj;
        this.f30732c = obj2;
    }
}
