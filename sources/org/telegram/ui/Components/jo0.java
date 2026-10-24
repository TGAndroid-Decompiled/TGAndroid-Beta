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
public final class jo0 implements Runnable {
    public final int f27759a;
    public final Object f27760b;
    public final Object f27761c;

    public jo0(int i10, Object obj, Object obj2) {
        this.f27759a = i10;
        this.f27760b = obj;
        this.f27761c = obj2;
    }

    @Override
    public final void run() {
        int indexOf;
        int K;
        int i10;
        long j10;
        int i11;
        String str;
        ArrayList arrayList;
        int i12 = 2;
        ArrayList arrayList2 = null;
        switch (this.f27759a) {
            case 0:
                ro0 ro0Var = (ro0) this.f27760b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f27761c;
                ArrayList arrayList3 = ro0Var.K;
                if (!arrayList3.isEmpty() && (indexOf = arrayList3.indexOf(tL_sponsoredPeer)) >= 0 && (K = ro0Var.K()) < ro0Var.h()) {
                    arrayList3.remove(indexOf);
                    ro0Var.u(K + 1 + indexOf);
                    int size = ro0Var.f11910j0.e.size();
                    int size2 = arrayList3.size();
                    if (ro0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        ro0Var.u(K);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((ro0) this.f27760b).S();
                vc.a0((org.telegram.ui.ey) this.f27761c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                ((dp0) this.f27760b).sendAccessibilityEvent((View) this.f27761c, 4);
                return;
            case 3:
                cf cfVar = (cf) this.f27760b;
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.f27761c;
                if (snVar != null) {
                    snVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    cfVar.dismiss();
                    return;
                }
                return;
            case 4:
                ((WindowManager) this.f27761c).removeView(((cf) this.f27760b).B);
                return;
            case 5:
                hr0 hr0Var = (hr0) this.f27760b;
                TLObject tLObject = (TLObject) this.f27761c;
                if (tLObject != null) {
                    hr0Var.f27135l0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    hr0Var.f1();
                    if (hr0Var.f27137n0) {
                        hr0Var.R0();
                    }
                }
                hr0Var.m0 = false;
                return;
            case 6:
                pu0 pu0Var = (pu0) this.f27760b;
                or0 or0Var = (or0) this.f27761c;
                pu0Var.G = null;
                pu0Var.H = null;
                or0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new g60(or0Var, 20)).start();
                return;
            case 7:
                ci.a7 a7Var = (ci.a7) this.f27761c;
                rs0 rs0Var = ((wv0) this.f27760b).W;
                if (rs0Var != null) {
                    int i13 = a7Var.f5152a;
                    rs0Var.f37714n.d(i13, rs0Var.f37716s.i(i13));
                    return;
                }
                return;
            case 8:
                vc.a0(((fu0) this.f27760b).f26436f.f32410v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f27761c).title)).k(true);
                return;
            case 9:
                su0 su0Var = (su0) this.f27760b;
                String str2 = (String) this.f27761c;
                if (!su0Var.v.f32406t1[su0Var.f30630r].f28439a.isEmpty() && ((i10 = su0Var.f30630r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.o1.i(1, su0Var.v.f32406t1[i10].f28439a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    wv0 wv0Var = su0Var.v;
                    if (wv0Var.f32385j1 == wv0Var.f32410v1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    su0Var.F(id2, str2, dialogId, j10);
                } else if (su0Var.f30630r == 3) {
                    wv0 wv0Var2 = su0Var.v;
                    su0Var.F(0, str2, wv0Var2.f32385j1, wv0Var2.F);
                }
                int i14 = su0Var.f30630r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList4 = new ArrayList(su0Var.v.f32406t1[su0Var.f30630r].f28439a);
                    su0Var.f30631s++;
                    Utilities.searchQueue.postRunnable(new jg((Object) su0Var, (Object) str2, arrayList4, 26));
                    return;
                }
                return;
            case 10:
                su0 su0Var2 = (su0) this.f27760b;
                ArrayList arrayList5 = (ArrayList) this.f27761c;
                wv0 wv0Var3 = su0Var2.v;
                boolean z10 = wv0Var3.V0;
                pu0[] pu0VarArr = wv0Var3.f32386k0;
                if (z10) {
                    su0Var2.f30631s--;
                    int h = su0Var2.h();
                    su0Var2.d = arrayList5;
                    int h10 = su0Var2.h();
                    if (su0Var2.f30631s == 0 || h10 != 0) {
                        wv0Var3.p1(false);
                    }
                    for (int i15 = 0; i15 < pu0VarArr.length; i15++) {
                        pu0 pu0Var2 = pu0VarArr[i15];
                        if (pu0Var2.F == su0Var2.f30630r) {
                            if (su0Var2.f30631s == 0 && h10 == 0) {
                                pu0Var2.f29679w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                pu0VarArr[i15].f29679w.f32069f.setVisibility(8);
                                pu0VarArr[i15].f29679w.e(false, true);
                            } else if (h == 0) {
                                wv0Var3.z(pu0Var2.h, 0, null);
                            }
                        }
                    }
                    su0Var2.l();
                    return;
                }
                return;
            case 11:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f27760b, (TLRPC.Document) this.f27761c, null, bool);
                return;
            case 12:
                MessagesController.getInstance(((fz0) this.f27760b).f26446a.f28105a).updateEmojiStatus((TLRPC.EmojiStatus) this.f27761c);
                return;
            case 13:
                v31 v31Var = (v31) this.f27760b;
                MessagesController.getInstance(v31Var.f31298b).getTopicsController().deleteTopics(-v31Var.f31300c, (ArrayList) this.f27761c);
                int i17 = v31.f31295i0;
                return;
            case 14:
                v31 v31Var2 = (v31) this.f27760b;
                v31Var2.getClass();
                MessagesController.getInstance(v31Var2.f31298b).loadFullChat(((TLRPC.Updates) this.f27761c).chats.get(0).f20344id, 0, true);
                return;
            case 15:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f27760b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f27761c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    k1Var.d0(i12);
                    return;
                }
                return;
            case 16:
                x41.p((x41) this.f27760b, (TLObject) this.f27761c);
                return;
            case 17:
                org.telegram.ui.sk skVar = (org.telegram.ui.sk) this.f27760b;
                ((org.telegram.ui.ActionBar.m1) this.f27761c).d(true);
                o51.a(skVar.getContext(), skVar.d);
                return;
            case 18:
                ((TranslateController) this.f27761c).setHideTranslateDialog(((org.telegram.ui.sk) this.f27760b).f29145b, false);
                return;
            case 19:
                UndoView undoView = (UndoView) this.f27760b;
                TLObject tLObject2 = (TLObject) this.f27761c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24570s.presentFragment(new org.telegram.ui.ho0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f24555i0;
                undoView.getClass();
                return;
            case 20:
                ((l61) this.f27760b).D.onClick((org.telegram.ui.Cells.v8) this.f27761c);
                return;
            case 21:
                j81 j81Var = (j81) this.f27760b;
                b2.y0 y0Var = (b2.y0) this.f27761c;
                Throwable cause = y0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(y0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = j81.f27624l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = j81Var.N;
                    if (arrayList6 != null) {
                        int i19 = 0;
                        while (i19 < arrayList6.size()) {
                            f81 f81Var = (f81) arrayList6.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList7 = f81Var.d;
                                if (i20 < arrayList7.size()) {
                                    h81 h81Var = (h81) arrayList7.get(i20);
                                    if (!TextUtils.isEmpty(h81Var.f26945m) && !j81.Y(h81Var.f26945m)) {
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
                    j81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        j81Var.F(arrayList2, j81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = j81Var.f27638n;
                if (textureView != null && ((!j81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    j81Var.E = true;
                    if (j81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(j81Var.f27638n);
                            viewGroup.removeView(j81Var.f27638n);
                            viewGroup.addView(j81Var.f27638n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = j81Var.f27627b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new w71(j81Var, 1));
                            return;
                        }
                        i2.h0 h0Var = j81Var.d;
                        TextureView textureView2 = j81Var.f27638n;
                        h0Var.F1();
                        if (textureView2 != null && textureView2 == h0Var.X) {
                            h0Var.F1();
                            h0Var.s1();
                            h0Var.x1(null);
                            h0Var.q1(0, 0);
                        }
                        j81Var.d.z1(j81Var.f27638n);
                        ArrayList arrayList8 = j81Var.N;
                        if (arrayList8 != null) {
                            j81Var.F(arrayList8, j81Var.O);
                        } else if (j81Var.U) {
                            j81Var.G(j81Var.Q, j81Var.S, j81Var.R, j81Var.T);
                        } else {
                            j81Var.D(j81Var.Q, j81Var.S);
                        }
                        j81Var.C();
                        return;
                    }
                    return;
                }
                j81Var.J.onError(j81Var, y0Var);
                return;
            case 22:
                ((i81) this.f27760b).f27368f.K.onVisualizerUpdate(true, true, (float[]) this.f27761c);
                return;
            case 23:
                q81 q81Var = (q81) this.f27760b;
                Bitmap bitmap = (Bitmap) this.f27761c;
                if (bitmap != null) {
                    if (q81Var.f29845w != null) {
                        Bitmap bitmap2 = q81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        q81Var.v = q81Var.f29845w;
                    }
                    q81Var.f29845w = bitmap;
                    Bitmap bitmap3 = q81Var.f29845w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    q81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(q81Var.L);
                    q81Var.J.setShader(q81Var.G);
                    q81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = q81Var.getLayoutParams();
                    if (q81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        q81Var.setVisibility(0);
                        q81Var.requestLayout();
                    }
                }
                q81Var.f29839f = null;
                return;
            case 24:
                final ca1 ca1Var = (ca1) this.f27760b;
                ca1Var.e.f25671b.evaluateJavascript((String) this.f27761c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        ca1 ca1Var2 = ca1.this;
                        String[] strArr = ca1Var2.f25286c;
                        String str4 = strArr[0];
                        String str5 = ca1Var2.d;
                        strArr[0] = str4.replace(str5, "/signature/" + str3.substring(1, str3.length() - 1));
                        ca1Var2.f25285b.countDown();
                    }
                });
                return;
            case 25:
                ((org.telegram.ui.Components.voip.k) this.f27760b).f31647a.setOnClickListener((View.OnClickListener) this.f27761c);
                return;
            case 26:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f27760b;
                Bitmap bitmap4 = (Bitmap) this.f27761c;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f31891w;
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
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f27761c;
                ((org.telegram.ui.Components.voip.l0) this.f27760b).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 28:
                lm0 lm0Var = (lm0) this.f27760b;
                Object obj = this.f27761c;
                if (lm0Var != null) {
                    lm0Var.setOnItemClickListener((zl0) obj);
                    return;
                }
                return;
            default:
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) this.f27760b;
                String lowerCase = ((String) this.f27761c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ot(0, ptVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = ptVar.f40631f;
                int size3 = arrayList10.size();
                int i21 = 0;
                while (i21 < size3) {
                    Object obj2 = arrayList10.get(i21);
                    i21++;
                    org.telegram.ui.lt ltVar = (org.telegram.ui.lt) obj2;
                    String str3 = ltVar.f39375a;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase2 = str3.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(ltVar.f39375a).toLowerCase();
                    String str5 = ltVar.f39376b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String lowerCase4 = str5.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(ltVar.f39376b).toLowerCase();
                    String str6 = ltVar.f39377c;
                    if (str6 == null) {
                        str6 = "";
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        str4 = "+".concat(str6);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList10;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.v0.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.v0.w(" ", translitSafe, lowerCase5) && !str6.startsWith(lowerCase) && !str4.startsWith(lowerCase)) {
                            arrayList10 = arrayList;
                        }
                    } else {
                        arrayList = arrayList10;
                    }
                    arrayList9.add(ltVar);
                    arrayList10 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ot(0, ptVar, arrayList9));
                return;
        }
    }

    public jo0(Object obj, Object obj2, Object obj3, int i10) {
        this.f27759a = i10;
        this.f27760b = obj;
        this.f27761c = obj2;
    }
}
