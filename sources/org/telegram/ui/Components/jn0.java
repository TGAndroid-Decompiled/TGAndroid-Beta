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
public final class jn0 implements Runnable {
    public final int f27569a;
    public final Object f27570b;
    public final Object f27571c;

    public jn0(int i10, Object obj, Object obj2) {
        this.f27569a = i10;
        this.f27570b = obj;
        this.f27571c = obj2;
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
        switch (this.f27569a) {
            case 0:
                rn0 rn0Var = (rn0) this.f27570b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f27571c;
                ArrayList arrayList2 = rn0Var.K;
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(tL_sponsoredPeer)) >= 0 && (L = rn0Var.L()) < rn0Var.h()) {
                    arrayList2.remove(indexOf);
                    rn0Var.u(L + 1 + indexOf);
                    int size = rn0Var.f11108j0.f11008e.size();
                    int size2 = arrayList2.size();
                    if (rn0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        rn0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((rn0) this.f27570b).T();
                yc.a0((org.telegram.ui.uy) this.f27571c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                ((co0) this.f27570b).sendAccessibilityEvent((View) this.f27571c, 4);
                return;
            case 3:
                ff ffVar = (ff) this.f27570b;
                org.telegram.ui.co coVar = (org.telegram.ui.co) this.f27571c;
                if (coVar != null) {
                    coVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ffVar.dismiss();
                    return;
                }
                return;
            case 4:
                ((WindowManager) this.f27571c).removeView(((ff) this.f27570b).B);
                return;
            case 5:
                hq0 hq0Var = (hq0) this.f27570b;
                TLObject tLObject = (TLObject) this.f27571c;
                if (tLObject != null) {
                    hq0Var.f26828k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    hq0Var.Z0();
                    if (hq0Var.m0) {
                        hq0Var.M0();
                    }
                }
                hq0Var.f26829l0 = false;
                return;
            case 6:
                qt0 qt0Var = (qt0) this.f27570b;
                oq0 oq0Var = (oq0) this.f27571c;
                qt0Var.G = null;
                qt0Var.H = null;
                oq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new r80(oq0Var, 16)).start();
                return;
            case 7:
                bi.m8 m8Var = (bi.m8) this.f27571c;
                sr0 sr0Var = ((xu0) this.f27570b).W;
                if (sr0Var != null) {
                    int i13 = m8Var.f3348a;
                    sr0Var.f35653n.d(i13, sr0Var.f35655s.i(i13));
                    return;
                }
                return;
            case 8:
                yc.a0(((gt0) this.f27570b).f26539f.f32753v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f27571c).title)).k(true);
                return;
            case 9:
                tt0 tt0Var = (tt0) this.f27570b;
                String str2 = (String) this.f27571c;
                if (!tt0Var.v.f32749t1[tt0Var.f30732r].f28543a.isEmpty() && ((i10 = tt0Var.f30732r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.g.h(1, tt0Var.v.f32749t1[i10].f28543a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    xu0 xu0Var = tt0Var.v;
                    if (xu0Var.f32728j1 == xu0Var.f32753v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    tt0Var.F(id2, str2, dialogId, j3);
                } else if (tt0Var.f30732r == 3) {
                    xu0 xu0Var2 = tt0Var.v;
                    tt0Var.F(0, str2, xu0Var2.f32728j1, xu0Var2.F);
                }
                int i14 = tt0Var.f30732r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(tt0Var.v.f32749t1[tt0Var.f30732r].f28543a);
                    tt0Var.f30733s++;
                    Utilities.searchQueue.postRunnable(new er0(tt0Var, str2, arrayList3, 5));
                    return;
                }
                return;
            case 10:
                tt0 tt0Var2 = (tt0) this.f27570b;
                ArrayList arrayList4 = (ArrayList) this.f27571c;
                xu0 xu0Var3 = tt0Var2.v;
                boolean z10 = xu0Var3.V0;
                qt0[] qt0VarArr = xu0Var3.f32729k0;
                if (z10) {
                    tt0Var2.f30733s--;
                    int h = tt0Var2.h();
                    tt0Var2.d = arrayList4;
                    int h10 = tt0Var2.h();
                    if (tt0Var2.f30733s == 0 || h10 != 0) {
                        xu0Var3.m1(false);
                    }
                    for (int i15 = 0; i15 < qt0VarArr.length; i15++) {
                        qt0 qt0Var2 = qt0VarArr[i15];
                        if (qt0Var2.F == tt0Var2.f30732r) {
                            if (tt0Var2.f30733s == 0 && h10 == 0) {
                                qt0Var2.f29850w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qt0VarArr[i15].f29850w.f32783f.setVisibility(8);
                                qt0VarArr[i15].f29850w.e(false, true);
                            } else if (h == 0) {
                                xu0Var3.z(qt0Var2.h, 0, null);
                            }
                        }
                    }
                    tt0Var2.l();
                    return;
                }
                return;
            case 11:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f27570b, (TLRPC.Document) this.f27571c, null, bool);
                return;
            case 12:
                MessagesController.getInstance(((hy0) this.f27570b).f26917a.f28582a).updateEmojiStatus((TLRPC.EmojiStatus) this.f27571c);
                return;
            case 13:
                w21 w21Var = (w21) this.f27570b;
                MessagesController.getInstance(w21Var.f32120b).getTopicsController().deleteTopics(-w21Var.f32122c, (ArrayList) this.f27571c);
                int i17 = w21.f32117f0;
                return;
            case 14:
                w21 w21Var2 = (w21) this.f27570b;
                w21Var2.getClass();
                MessagesController.getInstance(w21Var2.f32120b).loadFullChat(((TLRPC.Updates) this.f27571c).chats.get(0).f19896id, 0, true);
                return;
            case 15:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f27570b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f27571c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    k1Var.c0(i12);
                    return;
                }
                return;
            case 16:
                u31.o((u31) this.f27570b, (TLObject) this.f27571c);
                return;
            case 17:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f27570b;
                String str3 = (String) this.f27571c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.f27570b;
                ((org.telegram.ui.ActionBar.n1) this.f27571c).d(true);
                l41.a(zkVar.getContext(), zkVar.d);
                return;
            case 19:
                ((TranslateController) this.f27571c).setHideTranslateDialog(((org.telegram.ui.zk) this.f27570b).f28078b, false);
                return;
            case 20:
                UndoView undoView = (UndoView) this.f27570b;
                TLObject tLObject2 = (TLObject) this.f27571c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24220s.presentFragment(new org.telegram.ui.xo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f24208e0;
                undoView.getClass();
                return;
            case 21:
                ((h51) this.f27570b).D.onClick((org.telegram.ui.Cells.v8) this.f27571c);
                return;
            case 22:
                g71 g71Var = (g71) this.f27570b;
                b2.u0 u0Var = (b2.u0) this.f27571c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = g71.f26324l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = g71Var.N;
                    if (arrayList5 != null) {
                        int i19 = 0;
                        while (i19 < arrayList5.size()) {
                            c71 c71Var = (c71) arrayList5.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList6 = c71Var.d;
                                if (i20 < arrayList6.size()) {
                                    e71 e71Var = (e71) arrayList6.get(i20);
                                    if (!TextUtils.isEmpty(e71Var.f25616m) && !g71.Y(e71Var.f25616m)) {
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
                    g71Var.N = arrayList;
                    if (arrayList != null) {
                        g71Var.F(arrayList, g71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = g71Var.f26339n;
                if (textureView != null && ((!g71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    g71Var.E = true;
                    if (g71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(g71Var.f26339n);
                            viewGroup.removeView(g71Var.f26339n);
                            viewGroup.addView(g71Var.f26339n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = g71Var.f26327b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new x61(g71Var, 0));
                            return;
                        }
                        i2.f0 f0Var = g71Var.d;
                        TextureView textureView2 = g71Var.f26339n;
                        f0Var.B1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.B1();
                            f0Var.o1();
                            f0Var.t1(null);
                            f0Var.m1(0, 0);
                        }
                        g71Var.d.v1(g71Var.f26339n);
                        ArrayList arrayList7 = g71Var.N;
                        if (arrayList7 != null) {
                            g71Var.F(arrayList7, g71Var.O);
                        } else if (g71Var.U) {
                            g71Var.G(g71Var.Q, g71Var.S, g71Var.R, g71Var.T);
                        } else {
                            g71Var.D(g71Var.Q, g71Var.S);
                        }
                        g71Var.C();
                        return;
                    }
                    return;
                }
                g71Var.J.onError(g71Var, u0Var);
                return;
            case 23:
                ((f71) this.f27570b).f25978f.K.onVisualizerUpdate(true, true, (float[]) this.f27571c);
                return;
            case 24:
                n71 n71Var = (n71) this.f27570b;
                Bitmap bitmap = (Bitmap) this.f27571c;
                if (bitmap != null) {
                    if (n71Var.f28709w != null) {
                        Bitmap bitmap2 = n71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        n71Var.v = n71Var.f28709w;
                    }
                    n71Var.f28709w = bitmap;
                    Bitmap bitmap3 = n71Var.f28709w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    n71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(n71Var.L);
                    n71Var.J.setShader(n71Var.G);
                    n71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = n71Var.getLayoutParams();
                    if (n71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        n71Var.setVisibility(0);
                        n71Var.requestLayout();
                    }
                }
                n71Var.f28703f = null;
                return;
            case 25:
                final a91 a91Var = (a91) this.f27570b;
                a91Var.f24342e.f24647b.evaluateJavascript((String) this.f27571c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        a91 a91Var2 = a91.this;
                        String[] strArr = a91Var2.f24341c;
                        String str5 = strArr[0];
                        String str6 = a91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        a91Var2.f24340b.countDown();
                    }
                });
                return;
            case 26:
                ((org.telegram.ui.Components.voip.k) this.f27570b).f31599a.setOnClickListener((View.OnClickListener) this.f27571c);
                return;
            case 27:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f27570b;
                Bitmap bitmap4 = (Bitmap) this.f27571c;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f31860w;
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
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f27571c;
                ((org.telegram.ui.Components.voip.l0) this.f27570b).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            default:
                ll0 ll0Var = (ll0) this.f27570b;
                Object obj = this.f27571c;
                if (ll0Var != null) {
                    ll0Var.setOnItemClickListener((zk0) obj);
                    return;
                }
                return;
        }
    }

    public jn0(Object obj, Object obj2, Object obj3, int i10) {
        this.f27569a = i10;
        this.f27570b = obj;
        this.f27571c = obj2;
    }
}
