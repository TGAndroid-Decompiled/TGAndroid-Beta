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
public final class go0 implements Runnable {
    public final int f26656a;
    public final Object f26657b;
    public final Object f26658c;

    public go0(int i10, Object obj, Object obj2) {
        this.f26656a = i10;
        this.f26657b = obj;
        this.f26658c = obj2;
    }

    @Override
    public final void run() {
        int indexOf;
        int L;
        int i10;
        long j10;
        int i11;
        String str;
        ArrayList arrayList;
        int i12 = 2;
        ArrayList arrayList2 = null;
        switch (this.f26656a) {
            case 0:
                oo0 oo0Var = (oo0) this.f26657b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26658c;
                ArrayList arrayList3 = oo0Var.K;
                if (!arrayList3.isEmpty() && (indexOf = arrayList3.indexOf(tL_sponsoredPeer)) >= 0 && (L = oo0Var.L()) < oo0Var.h()) {
                    arrayList3.remove(indexOf);
                    oo0Var.u(L + 1 + indexOf);
                    int size = oo0Var.f11885j0.e.size();
                    int size2 = arrayList3.size();
                    if (oo0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        oo0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((oo0) this.f26657b).T();
                xc.a0((org.telegram.ui.cy) this.f26658c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                ((zo0) this.f26657b).sendAccessibilityEvent((View) this.f26658c, 4);
                return;
            case 3:
                ef efVar = (ef) this.f26657b;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.f26658c;
                if (qnVar != null) {
                    qnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    return;
                }
                return;
            case 4:
                ((WindowManager) this.f26658c).removeView(((ef) this.f26657b).B);
                return;
            case 5:
                er0 er0Var = (er0) this.f26657b;
                TLObject tLObject = (TLObject) this.f26658c;
                if (tLObject != null) {
                    er0Var.f25992l0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    er0Var.b1();
                    if (er0Var.f25994n0) {
                        er0Var.O0();
                    }
                }
                er0Var.m0 = false;
                return;
            case 6:
                mu0 mu0Var = (mu0) this.f26657b;
                lr0 lr0Var = (lr0) this.f26658c;
                mu0Var.G = null;
                mu0Var.H = null;
                lr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new c80(lr0Var, 19)).start();
                return;
            case 7:
                ci.b7 b7Var = (ci.b7) this.f26658c;
                os0 os0Var = ((tv0) this.f26657b).W;
                if (os0Var != null) {
                    int i13 = b7Var.f5253a;
                    os0Var.f36521n.d(i13, os0Var.f36523s.i(i13));
                    return;
                }
                return;
            case 8:
                xc.a0(((cu0) this.f26657b).f25346f.f30734v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f26658c).title)).k(true);
                return;
            case 9:
                pu0 pu0Var = (pu0) this.f26657b;
                String str2 = (String) this.f26658c;
                if (!pu0Var.v.f30730t1[pu0Var.f29409r].f27363a.isEmpty() && ((i10 = pu0Var.f29409r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.e.h(1, pu0Var.v.f30730t1[i10].f27363a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    tv0 tv0Var = pu0Var.v;
                    if (tv0Var.f30709j1 == tv0Var.f30734v1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    pu0Var.F(id2, str2, dialogId, j10);
                } else if (pu0Var.f29409r == 3) {
                    tv0 tv0Var2 = pu0Var.v;
                    pu0Var.F(0, str2, tv0Var2.f30709j1, tv0Var2.F);
                }
                int i14 = pu0Var.f29409r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList4 = new ArrayList(pu0Var.v.f30730t1[pu0Var.f29409r].f27363a);
                    pu0Var.f29410s++;
                    Utilities.searchQueue.postRunnable(new lg((Object) pu0Var, (Object) str2, arrayList4, 26));
                    return;
                }
                return;
            case 10:
                pu0 pu0Var2 = (pu0) this.f26657b;
                ArrayList arrayList5 = (ArrayList) this.f26658c;
                tv0 tv0Var3 = pu0Var2.v;
                boolean z10 = tv0Var3.V0;
                mu0[] mu0VarArr = tv0Var3.f30710k0;
                if (z10) {
                    pu0Var2.f29410s--;
                    int h = pu0Var2.h();
                    pu0Var2.d = arrayList5;
                    int h10 = pu0Var2.h();
                    if (pu0Var2.f29410s == 0 || h10 != 0) {
                        tv0Var3.o1(false);
                    }
                    for (int i15 = 0; i15 < mu0VarArr.length; i15++) {
                        mu0 mu0Var2 = mu0VarArr[i15];
                        if (mu0Var2.F == pu0Var2.f29409r) {
                            if (pu0Var2.f29410s == 0 && h10 == 0) {
                                mu0Var2.f28613w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                mu0VarArr[i15].f28613w.f30355f.setVisibility(8);
                                mu0VarArr[i15].f28613w.e(false, true);
                            } else if (h == 0) {
                                tv0Var3.z(mu0Var2.h, 0, null);
                            }
                        }
                    }
                    pu0Var2.l();
                    return;
                }
                return;
            case 11:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f26657b, (TLRPC.Document) this.f26658c, null, bool);
                return;
            case 12:
                MessagesController.getInstance(((cz0) this.f26657b).f25370a.f26950a).updateEmojiStatus((TLRPC.EmojiStatus) this.f26658c);
                return;
            case 13:
                r31 r31Var = (r31) this.f26657b;
                MessagesController.getInstance(r31Var.f29816b).getTopicsController().deleteTopics(-r31Var.f29818c, (ArrayList) this.f26658c);
                int i17 = r31.f29813f0;
                return;
            case 14:
                r31 r31Var2 = (r31) this.f26657b;
                r31Var2.getClass();
                MessagesController.getInstance(r31Var2.f29816b).loadFullChat(((TLRPC.Updates) this.f26658c).chats.get(0).f20275id, 0, true);
                return;
            case 15:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f26657b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f26658c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 16:
                s41.p((s41) this.f26657b, (TLObject) this.f26658c);
                return;
            case 17:
                org.telegram.ui.rk rkVar = (org.telegram.ui.rk) this.f26657b;
                ((org.telegram.ui.ActionBar.m1) this.f26658c).d(true);
                j51.a(rkVar.getContext(), rkVar.d);
                return;
            case 18:
                ((TranslateController) this.f26658c).setHideTranslateDialog(((org.telegram.ui.rk) this.f26657b).f27425b, false);
                return;
            case 19:
                UndoView undoView = (UndoView) this.f26657b;
                TLObject tLObject2 = (TLObject) this.f26658c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24416s.presentFragment(new org.telegram.ui.eo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f24405e0;
                undoView.getClass();
                return;
            case 20:
                ((g61) this.f26657b).D.onClick((org.telegram.ui.Cells.u8) this.f26658c);
                return;
            case 21:
                b81 b81Var = (b81) this.f26657b;
                b2.y0 y0Var = (b2.y0) this.f26658c;
                Throwable cause = y0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(y0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = b81.f24833l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = b81Var.N;
                    if (arrayList6 != null) {
                        int i19 = 0;
                        while (i19 < arrayList6.size()) {
                            x71 x71Var = (x71) arrayList6.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList7 = x71Var.d;
                                if (i20 < arrayList7.size()) {
                                    z71 z71Var = (z71) arrayList7.get(i20);
                                    if (!TextUtils.isEmpty(z71Var.f32884m) && !b81.Y(z71Var.f32884m)) {
                                        arrayList7.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                } else {
                                    if (arrayList7.isEmpty()) {
                                        arrayList6.remove(i19);
                                        i19--;
                                    }
                                    i19++;
                                }
                            }
                        }
                        arrayList2 = arrayList6;
                    }
                    b81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        b81Var.F(arrayList2, b81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = b81Var.f24847n;
                if (textureView != null && ((!b81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    b81Var.E = true;
                    if (b81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(b81Var.f24847n);
                            viewGroup.removeView(b81Var.f24847n);
                            viewGroup.addView(b81Var.f24847n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = b81Var.f24836b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new t71(b81Var, 0));
                            return;
                        }
                        i2.i0 i0Var = b81Var.d;
                        TextureView textureView2 = b81Var.f24847n;
                        i0Var.F1();
                        if (textureView2 != null && textureView2 == i0Var.X) {
                            i0Var.F1();
                            i0Var.s1();
                            i0Var.x1(null);
                            i0Var.q1(0, 0);
                        }
                        b81Var.d.z1(b81Var.f24847n);
                        ArrayList arrayList8 = b81Var.N;
                        if (arrayList8 != null) {
                            b81Var.F(arrayList8, b81Var.O);
                        } else if (b81Var.U) {
                            b81Var.G(b81Var.Q, b81Var.S, b81Var.R, b81Var.T);
                        } else {
                            b81Var.D(b81Var.Q, b81Var.S);
                        }
                        b81Var.C();
                        return;
                    }
                    return;
                }
                b81Var.J.onError(b81Var, y0Var);
                return;
            case 22:
                ((a81) this.f26657b).f24516f.K.onVisualizerUpdate(true, true, (float[]) this.f26658c);
                return;
            case 23:
                i81 i81Var = (i81) this.f26657b;
                Bitmap bitmap = (Bitmap) this.f26658c;
                if (bitmap != null) {
                    if (i81Var.f27157w != null) {
                        Bitmap bitmap2 = i81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        i81Var.v = i81Var.f27157w;
                    }
                    i81Var.f27157w = bitmap;
                    Bitmap bitmap3 = i81Var.f27157w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    i81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(i81Var.L);
                    i81Var.J.setShader(i81Var.G);
                    i81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = i81Var.getLayoutParams();
                    if (i81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        i81Var.setVisibility(0);
                        i81Var.requestLayout();
                    }
                }
                i81Var.f27151f = null;
                return;
            case 24:
                final u91 u91Var = (u91) this.f26657b;
                u91Var.e.f31223b.evaluateJavascript((String) this.f26658c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        u91 u91Var2 = u91.this;
                        String[] strArr = u91Var2.f30921c;
                        String str4 = strArr[0];
                        String str5 = u91Var2.d;
                        strArr[0] = str4.replace(str5, "/signature/" + str3.substring(1, str3.length() - 1));
                        u91Var2.f30920b.countDown();
                    }
                });
                return;
            case 25:
                ((org.telegram.ui.Components.voip.k) this.f26657b).f31542a.setOnClickListener((View.OnClickListener) this.f26658c);
                return;
            case 26:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f26657b;
                Bitmap bitmap4 = (Bitmap) this.f26658c;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f31786w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 27:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f26658c;
                ((org.telegram.ui.Components.voip.l0) this.f26657b).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 28:
                im0 im0Var = (im0) this.f26657b;
                Object obj = this.f26658c;
                if (im0Var != null) {
                    im0Var.setOnItemClickListener((wl0) obj);
                    return;
                }
                return;
            default:
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) this.f26657b;
                String lowerCase = ((String) this.f26658c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.lt(0, mtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = mtVar.f39346f;
                int size3 = arrayList10.size();
                int i21 = 0;
                while (i21 < size3) {
                    Object obj2 = arrayList10.get(i21);
                    i21++;
                    org.telegram.ui.ht htVar = (org.telegram.ui.ht) obj2;
                    String str3 = htVar.f37806a;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase2 = str3.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(htVar.f37806a).toLowerCase();
                    String str5 = htVar.f37807b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String lowerCase4 = str5.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(htVar.f37807b).toLowerCase();
                    String str6 = htVar.f37808c;
                    if (str6 == null) {
                        str6 = "";
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        str4 = "+".concat(str6);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList10;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.g0.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.g0.w(" ", translitSafe, lowerCase5) && !str6.startsWith(lowerCase) && !str4.startsWith(lowerCase)) {
                            arrayList10 = arrayList;
                        }
                    } else {
                        arrayList = arrayList10;
                    }
                    arrayList9.add(htVar);
                    arrayList10 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.lt(0, mtVar, arrayList9));
                return;
        }
    }

    public go0(Object obj, Object obj2, Object obj3, int i10) {
        this.f26656a = i10;
        this.f26657b = obj;
        this.f26658c = obj2;
    }
}
