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
public final class ko0 implements Runnable {
    public final int f28096a;
    public final Object f28097b;
    public final Object f28098c;

    public ko0(int i10, Object obj, Object obj2) {
        this.f28096a = i10;
        this.f28097b = obj;
        this.f28098c = obj2;
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
        switch (this.f28096a) {
            case 0:
                so0 so0Var = (so0) this.f28097b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f28098c;
                ArrayList arrayList3 = so0Var.K;
                if (!arrayList3.isEmpty() && (indexOf = arrayList3.indexOf(tL_sponsoredPeer)) >= 0 && (K = so0Var.K()) < so0Var.h()) {
                    arrayList3.remove(indexOf);
                    so0Var.u(K + 1 + indexOf);
                    int size = so0Var.f11910j0.e.size();
                    int size2 = arrayList3.size();
                    if (so0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        so0Var.u(K);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((so0) this.f28097b).S();
                xc.a0((org.telegram.ui.ey) this.f28098c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                ((ep0) this.f28097b).sendAccessibilityEvent((View) this.f28098c, 4);
                return;
            case 3:
                ef efVar = (ef) this.f28097b;
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.f28098c;
                if (snVar != null) {
                    snVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    return;
                }
                return;
            case 4:
                ((WindowManager) this.f28098c).removeView(((ef) this.f28097b).B);
                return;
            case 5:
                ir0 ir0Var = (ir0) this.f28097b;
                TLObject tLObject = (TLObject) this.f28098c;
                if (tLObject != null) {
                    ir0Var.f27423l0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    ir0Var.f1();
                    if (ir0Var.f27425n0) {
                        ir0Var.R0();
                    }
                }
                ir0Var.m0 = false;
                return;
            case 6:
                qu0 qu0Var = (qu0) this.f28097b;
                pr0 pr0Var = (pr0) this.f28098c;
                qu0Var.G = null;
                qu0Var.H = null;
                pr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new i60(pr0Var, 20)).start();
                return;
            case 7:
                ci.a7 a7Var = (ci.a7) this.f28098c;
                ss0 ss0Var = ((xv0) this.f28097b).W;
                if (ss0Var != null) {
                    int i13 = a7Var.f5152a;
                    ss0Var.f38037n.d(i13, ss0Var.f38039s.i(i13));
                    return;
                }
                return;
            case 8:
                xc.a0(((gu0) this.f28097b).f26716f.f32711v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f28098c).title)).k(true);
                return;
            case 9:
                tu0 tu0Var = (tu0) this.f28097b;
                String str2 = (String) this.f28098c;
                if (!tu0Var.v.f32707t1[tu0Var.f30912r].f28757a.isEmpty() && ((i10 = tu0Var.f30912r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.o1.i(1, tu0Var.v.f32707t1[i10].f28757a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    xv0 xv0Var = tu0Var.v;
                    if (xv0Var.f32686j1 == xv0Var.f32711v1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    tu0Var.F(id2, str2, dialogId, j10);
                } else if (tu0Var.f30912r == 3) {
                    xv0 xv0Var2 = tu0Var.v;
                    tu0Var.F(0, str2, xv0Var2.f32686j1, xv0Var2.F);
                }
                int i14 = tu0Var.f30912r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList4 = new ArrayList(tu0Var.v.f32707t1[tu0Var.f30912r].f28757a);
                    tu0Var.f30913s++;
                    Utilities.searchQueue.postRunnable(new lg((Object) tu0Var, (Object) str2, arrayList4, 26));
                    return;
                }
                return;
            case 10:
                tu0 tu0Var2 = (tu0) this.f28097b;
                ArrayList arrayList5 = (ArrayList) this.f28098c;
                xv0 xv0Var3 = tu0Var2.v;
                boolean z10 = xv0Var3.V0;
                qu0[] qu0VarArr = xv0Var3.f32687k0;
                if (z10) {
                    tu0Var2.f30913s--;
                    int h = tu0Var2.h();
                    tu0Var2.d = arrayList5;
                    int h10 = tu0Var2.h();
                    if (tu0Var2.f30913s == 0 || h10 != 0) {
                        xv0Var3.p1(false);
                    }
                    for (int i15 = 0; i15 < qu0VarArr.length; i15++) {
                        qu0 qu0Var2 = qu0VarArr[i15];
                        if (qu0Var2.F == tu0Var2.f30912r) {
                            if (tu0Var2.f30913s == 0 && h10 == 0) {
                                qu0Var2.f30006w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qu0VarArr[i15].f30006w.f32373f.setVisibility(8);
                                qu0VarArr[i15].f30006w.e(false, true);
                            } else if (h == 0) {
                                xv0Var3.z(qu0Var2.h, 0, null);
                            }
                        }
                    }
                    tu0Var2.l();
                    return;
                }
                return;
            case 11:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f28097b, (TLRPC.Document) this.f28098c, null, bool);
                return;
            case 12:
                MessagesController.getInstance(((gz0) this.f28097b).f26750a.f28439a).updateEmojiStatus((TLRPC.EmojiStatus) this.f28098c);
                return;
            case 13:
                w31 w31Var = (w31) this.f28097b;
                MessagesController.getInstance(w31Var.f32132b).getTopicsController().deleteTopics(-w31Var.f32134c, (ArrayList) this.f28098c);
                int i17 = w31.f32129i0;
                return;
            case 14:
                w31 w31Var2 = (w31) this.f28097b;
                w31Var2.getClass();
                MessagesController.getInstance(w31Var2.f32132b).loadFullChat(((TLRPC.Updates) this.f28098c).chats.get(0).f20343id, 0, true);
                return;
            case 15:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f28097b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f28098c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    k1Var.d0(i12);
                    return;
                }
                return;
            case 16:
                y41.p((y41) this.f28097b, (TLObject) this.f28098c);
                return;
            case 17:
                org.telegram.ui.sk skVar = (org.telegram.ui.sk) this.f28097b;
                ((org.telegram.ui.ActionBar.m1) this.f28098c).d(true);
                p51.a(skVar.getContext(), skVar.d);
                return;
            case 18:
                ((TranslateController) this.f28098c).setHideTranslateDialog(((org.telegram.ui.sk) this.f28097b).f29426b, false);
                return;
            case 19:
                UndoView undoView = (UndoView) this.f28097b;
                TLObject tLObject2 = (TLObject) this.f28098c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24569s.presentFragment(new org.telegram.ui.io0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f24554i0;
                undoView.getClass();
                return;
            case 20:
                ((m61) this.f28097b).D.onClick((org.telegram.ui.Cells.v8) this.f28098c);
                return;
            case 21:
                j81 j81Var = (j81) this.f28097b;
                b2.y0 y0Var = (b2.y0) this.f28098c;
                Throwable cause = y0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(y0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = j81.f27589l0;
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
                                    if (!TextUtils.isEmpty(h81Var.f26836m) && !j81.Y(h81Var.f26836m)) {
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
                TextureView textureView = j81Var.f27603n;
                if (textureView != null && ((!j81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    j81Var.E = true;
                    if (j81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(j81Var.f27603n);
                            viewGroup.removeView(j81Var.f27603n);
                            viewGroup.addView(j81Var.f27603n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = j81Var.f27592b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new x71(j81Var, 1));
                            return;
                        }
                        i2.h0 h0Var = j81Var.d;
                        TextureView textureView2 = j81Var.f27603n;
                        h0Var.F1();
                        if (textureView2 != null && textureView2 == h0Var.X) {
                            h0Var.F1();
                            h0Var.s1();
                            h0Var.x1(null);
                            h0Var.q1(0, 0);
                        }
                        j81Var.d.z1(j81Var.f27603n);
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
                ((i81) this.f28097b).f27241f.K.onVisualizerUpdate(true, true, (float[]) this.f28098c);
                return;
            case 23:
                q81 q81Var = (q81) this.f28097b;
                Bitmap bitmap = (Bitmap) this.f28098c;
                if (bitmap != null) {
                    if (q81Var.f29802w != null) {
                        Bitmap bitmap2 = q81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        q81Var.v = q81Var.f29802w;
                    }
                    q81Var.f29802w = bitmap;
                    Bitmap bitmap3 = q81Var.f29802w;
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
                q81Var.f29796f = null;
                return;
            case 24:
                final ca1 ca1Var = (ca1) this.f28097b;
                ca1Var.e.f25566b.evaluateJavascript((String) this.f28098c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        ca1 ca1Var2 = ca1.this;
                        String[] strArr = ca1Var2.f25302c;
                        String str4 = strArr[0];
                        String str5 = ca1Var2.d;
                        strArr[0] = str4.replace(str5, "/signature/" + str3.substring(1, str3.length() - 1));
                        ca1Var2.f25301b.countDown();
                    }
                });
                return;
            case 25:
                ((org.telegram.ui.Components.voip.k) this.f28097b).f31677a.setOnClickListener((View.OnClickListener) this.f28098c);
                return;
            case 26:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f28097b;
                Bitmap bitmap4 = (Bitmap) this.f28098c;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f31921w;
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
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f28098c;
                ((org.telegram.ui.Components.voip.l0) this.f28097b).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 28:
                mm0 mm0Var = (mm0) this.f28097b;
                Object obj = this.f28098c;
                if (mm0Var != null) {
                    mm0Var.setOnItemClickListener((am0) obj);
                    return;
                }
                return;
            default:
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) this.f28097b;
                String lowerCase = ((String) this.f28098c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ot(0, ptVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = ptVar.f40541f;
                int size3 = arrayList10.size();
                int i21 = 0;
                while (i21 < size3) {
                    Object obj2 = arrayList10.get(i21);
                    i21++;
                    org.telegram.ui.lt ltVar = (org.telegram.ui.lt) obj2;
                    String str3 = ltVar.f39322a;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase2 = str3.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(ltVar.f39322a).toLowerCase();
                    String str5 = ltVar.f39323b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String lowerCase4 = str5.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(ltVar.f39323b).toLowerCase();
                    String str6 = ltVar.f39324c;
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

    public ko0(Object obj, Object obj2, Object obj3, int i10) {
        this.f28096a = i10;
        this.f28097b = obj;
        this.f28098c = obj2;
    }
}
