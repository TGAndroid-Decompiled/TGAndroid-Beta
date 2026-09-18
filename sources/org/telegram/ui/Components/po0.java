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
public final class po0 implements Runnable {
    public final int f27289a;
    public final Object f27290b;
    public final Object f27291c;

    public po0(int i10, Object obj, Object obj2) {
        this.f27289a = i10;
        this.f27290b = obj;
        this.f27291c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        int i11;
        String str;
        ArrayList arrayList;
        wl0 wl0Var;
        int i12 = 2;
        ArrayList arrayList2 = null;
        int i13 = 0;
        switch (this.f27289a) {
            case 0:
                ((qo0) this.f27290b).sendAccessibilityEvent((View) this.f27291c, 4);
                return;
            case 1:
                ef efVar = (ef) this.f27290b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f27291c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    return;
                }
                return;
            case 2:
                ((WindowManager) this.f27291c).removeView(((ef) this.f27290b).B);
                return;
            case 3:
                vq0 vq0Var = (vq0) this.f27290b;
                TLObject tLObject = (TLObject) this.f27291c;
                if (tLObject != null) {
                    vq0Var.f29725k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    vq0Var.Z0();
                    if (vq0Var.m0) {
                        vq0Var.M0();
                    }
                }
                vq0Var.f29726l0 = false;
                return;
            case 4:
                du0 du0Var = (du0) this.f27290b;
                cr0 cr0Var = (cr0) this.f27291c;
                du0Var.G = null;
                du0Var.H = null;
                cr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new ed0(cr0Var, 14)).start();
                return;
            case 5:
                ai.e9 e9Var = (ai.e9) this.f27291c;
                fs0 fs0Var = ((kv0) this.f27290b).W;
                if (fs0Var != null) {
                    int i14 = e9Var.f773a;
                    fs0Var.f31923n.d(i14, fs0Var.f31925s.i(i14));
                    return;
                }
                return;
            case 6:
                xc.a0(((tt0) this.f27290b).f28483f.f25848v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f27291c).title)).k(true);
                return;
            case 7:
                gu0 gu0Var = (gu0) this.f27290b;
                String str2 = (String) this.f27291c;
                if (!gu0Var.v.f25844t1[gu0Var.f24495r].f30877a.isEmpty() && ((i10 = gu0Var.f24495r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.k0.g(1, gu0Var.v.f25844t1[i10].f30877a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    kv0 kv0Var = gu0Var.v;
                    if (kv0Var.f25823j1 == kv0Var.f25848v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    gu0Var.F(id2, str2, dialogId, j3);
                } else if (gu0Var.f24495r == 3) {
                    kv0 kv0Var2 = gu0Var.v;
                    gu0Var.F(0, str2, kv0Var2.f25823j1, kv0Var2.F);
                }
                int i15 = gu0Var.f24495r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(gu0Var.v.f25844t1[gu0Var.f24495r].f30877a);
                    gu0Var.f24496s++;
                    Utilities.searchQueue.postRunnable(new dn0((Object) gu0Var, (Serializable) str2, arrayList3, 8));
                    return;
                }
                return;
            case 8:
                gu0 gu0Var2 = (gu0) this.f27290b;
                ArrayList arrayList4 = (ArrayList) this.f27291c;
                kv0 kv0Var3 = gu0Var2.v;
                boolean z10 = kv0Var3.V0;
                du0[] du0VarArr = kv0Var3.f25824k0;
                if (z10) {
                    gu0Var2.f24496s--;
                    int h = gu0Var2.h();
                    gu0Var2.d = arrayList4;
                    int h10 = gu0Var2.h();
                    if (gu0Var2.f24496s == 0 || h10 != 0) {
                        kv0Var3.m1(false);
                    }
                    for (int i16 = 0; i16 < du0VarArr.length; i16++) {
                        du0 du0Var2 = du0VarArr[i16];
                        if (du0Var2.F == gu0Var2.f24495r) {
                            if (gu0Var2.f24496s == 0 && h10 == 0) {
                                du0Var2.f23687w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                du0VarArr[i16].f23687w.f25867f.setVisibility(8);
                                du0VarArr[i16].f23687w.e(false, true);
                            } else if (h == 0) {
                                kv0Var3.z(du0Var2.h, 0, null);
                            }
                        }
                    }
                    gu0Var2.l();
                    return;
                }
                return;
            case 9:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i17 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i17, bool, (TLObject) this.f27290b, (TLRPC.Document) this.f27291c, null, bool);
                return;
            case 10:
                MessagesController.getInstance(((uy0) this.f27290b).f28850a.f30905a).updateEmojiStatus((TLRPC.EmojiStatus) this.f27291c);
                return;
            case 11:
                m31 m31Var = (m31) this.f27290b;
                MessagesController.getInstance(m31Var.f26309b).getTopicsController().deleteTopics(-m31Var.f26311c, (ArrayList) this.f27291c);
                int i18 = m31.f26306f0;
                return;
            case 12:
                m31 m31Var2 = (m31) this.f27290b;
                m31Var2.getClass();
                MessagesController.getInstance(m31Var2.f26309b).loadFullChat(((TLRPC.Updates) this.f27291c).chats.get(0).f18296id, 0, true);
                return;
            case 13:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f27290b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f27291c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 14:
                k41.o((k41) this.f27290b, (TLObject) this.f27291c);
                return;
            case 15:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f27290b;
                String str3 = (String) this.f27291c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this.f27290b;
                ((org.telegram.ui.ActionBar.n1) this.f27291c).d(true);
                b51.a(ykVar.getContext(), ykVar.d);
                return;
            case 17:
                ((TranslateController) this.f27291c).setHideTranslateDialog(((org.telegram.ui.yk) this.f27290b).f22820b, false);
                return;
            case 18:
                UndoView undoView = (UndoView) this.f27290b;
                TLObject tLObject2 = (TLObject) this.f27291c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f22425s.presentFragment(new org.telegram.ui.xo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i19 = UndoView.f22414e0;
                undoView.getClass();
                return;
            case 19:
                ((x51) this.f27290b).D.onClick((org.telegram.ui.Cells.v8) this.f27291c);
                return;
            case 20:
                u71 u71Var = (u71) this.f27290b;
                b2.u0 u0Var = (b2.u0) this.f27291c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = u71.f28632l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = u71Var.N;
                    if (arrayList5 != null) {
                        int i20 = 0;
                        while (i20 < arrayList5.size()) {
                            q71 q71Var = (q71) arrayList5.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList6 = q71Var.d;
                                if (i21 < arrayList6.size()) {
                                    s71 s71Var = (s71) arrayList6.get(i21);
                                    if (!TextUtils.isEmpty(s71Var.f28086m) && !u71.Y(s71Var.f28086m)) {
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
                    u71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        u71Var.F(arrayList2, u71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = u71Var.f28646n;
                if (textureView != null && ((!u71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    u71Var.E = true;
                    if (u71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(u71Var.f28646n);
                            viewGroup.removeView(u71Var.f28646n);
                            viewGroup.addView(u71Var.f28646n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = u71Var.f28635b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new m71(u71Var, 0));
                            return;
                        }
                        i2.e0 e0Var = u71Var.d;
                        TextureView textureView2 = u71Var.f28646n;
                        e0Var.B1();
                        if (textureView2 != null && textureView2 == e0Var.V) {
                            e0Var.B1();
                            e0Var.o1();
                            e0Var.t1(null);
                            e0Var.m1(0, 0);
                        }
                        u71Var.d.v1(u71Var.f28646n);
                        ArrayList arrayList7 = u71Var.N;
                        if (arrayList7 != null) {
                            u71Var.F(arrayList7, u71Var.O);
                        } else if (u71Var.U) {
                            u71Var.G(u71Var.Q, u71Var.S, u71Var.R, u71Var.T);
                        } else {
                            u71Var.D(u71Var.Q, u71Var.S);
                        }
                        u71Var.C();
                        return;
                    }
                    return;
                }
                u71Var.J.onError(u71Var, u0Var);
                return;
            case 21:
                ((t71) this.f27290b).f28344f.K.onVisualizerUpdate(true, true, (float[]) this.f27291c);
                return;
            case 22:
                b81 b81Var = (b81) this.f27290b;
                Bitmap bitmap = (Bitmap) this.f27291c;
                if (bitmap != null) {
                    if (b81Var.f22892w != null) {
                        Bitmap bitmap2 = b81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        b81Var.v = b81Var.f22892w;
                    }
                    b81Var.f22892w = bitmap;
                    Bitmap bitmap3 = b81Var.f22892w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    b81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(b81Var.L);
                    b81Var.J.setShader(b81Var.G);
                    b81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = b81Var.getLayoutParams();
                    if (b81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        b81Var.setVisibility(0);
                        b81Var.requestLayout();
                    }
                }
                b81Var.f22886f = null;
                return;
            case 23:
                final p91 p91Var = (p91) this.f27290b;
                p91Var.e.f27511b.evaluateJavascript((String) this.f27291c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        p91 p91Var2 = p91.this;
                        String[] strArr = p91Var2.f27163c;
                        String str5 = strArr[0];
                        String str6 = p91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        p91Var2.f27162b.countDown();
                    }
                });
                return;
            case 24:
                ((org.telegram.ui.Components.voip.k) this.f27290b).f29324a.setOnClickListener((View.OnClickListener) this.f27291c);
                return;
            case 25:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f27290b;
                Bitmap bitmap4 = (Bitmap) this.f27291c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29564w;
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
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f27291c;
                ((org.telegram.ui.Components.voip.m0) this.f27290b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            case 27:
                wl0 wl0Var2 = (wl0) this.f27290b;
                Object obj = this.f27291c;
                if (wl0Var2 != null) {
                    wl0Var2.setOnItemClickListener((kl0) obj);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.yt ytVar = (org.telegram.ui.yt) this.f27290b;
                String lowerCase = ((String) this.f27291c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new po0(29, ytVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = ytVar.f39895f;
                int size = arrayList9.size();
                while (i13 < size) {
                    Object obj2 = arrayList9.get(i13);
                    i13++;
                    org.telegram.ui.vt vtVar = (org.telegram.ui.vt) obj2;
                    String str4 = vtVar.f38617a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(vtVar.f38617a).toLowerCase();
                    String str6 = vtVar.f38618b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(vtVar.f38618b).toLowerCase();
                    String str7 = vtVar.f38619c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        str5 = "+".concat(str7);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList9;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.wh.u(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.wh.u(" ", translitSafe, lowerCase5) && !str7.startsWith(lowerCase) && !str5.startsWith(lowerCase)) {
                            arrayList9 = arrayList;
                        }
                    } else {
                        arrayList = arrayList9;
                    }
                    arrayList8.add(vtVar);
                    arrayList9 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new po0(29, ytVar, arrayList8));
                return;
            default:
                org.telegram.ui.yt ytVar2 = (org.telegram.ui.yt) this.f27290b;
                ArrayList arrayList10 = (ArrayList) this.f27291c;
                org.telegram.ui.au auVar = ytVar2.h;
                if (auVar.f32138f) {
                    ytVar2.e = arrayList10;
                    if (auVar.e && (wl0Var = auVar.f32135a) != null) {
                        s4.h0 adapter = wl0Var.getAdapter();
                        org.telegram.ui.yt ytVar3 = auVar.d;
                        if (adapter != ytVar3) {
                            auVar.f32135a.setAdapter(ytVar3);
                            auVar.f32135a.setFastScrollVisible(false);
                        }
                    }
                    ytVar2.l();
                    return;
                }
                return;
        }
    }

    public po0(Object obj, Object obj2, Object obj3, int i10) {
        this.f27289a = i10;
        this.f27290b = obj;
        this.f27291c = obj2;
    }
}
