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
public final class ho0 implements Runnable {
    public final int f26953a;
    public final Object f26954b;
    public final Object f26955c;

    public ho0(int i10, Object obj, Object obj2) {
        this.f26953a = i10;
        this.f26954b = obj;
        this.f26955c = obj2;
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
        switch (this.f26953a) {
            case 0:
                po0 po0Var = (po0) this.f26954b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26955c;
                ArrayList arrayList3 = po0Var.K;
                if (!arrayList3.isEmpty() && (indexOf = arrayList3.indexOf(tL_sponsoredPeer)) >= 0 && (L = po0Var.L()) < po0Var.h()) {
                    arrayList3.remove(indexOf);
                    po0Var.u(L + 1 + indexOf);
                    int size = po0Var.f11883j0.e.size();
                    int size2 = arrayList3.size();
                    if (po0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        po0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((po0) this.f26954b).T();
                xc.a0((org.telegram.ui.cy) this.f26955c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                ((ap0) this.f26954b).sendAccessibilityEvent((View) this.f26955c, 4);
                return;
            case 3:
                ef efVar = (ef) this.f26954b;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.f26955c;
                if (qnVar != null) {
                    qnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    return;
                }
                return;
            case 4:
                ((WindowManager) this.f26955c).removeView(((ef) this.f26954b).B);
                return;
            case 5:
                fr0 fr0Var = (fr0) this.f26954b;
                TLObject tLObject = (TLObject) this.f26955c;
                if (tLObject != null) {
                    fr0Var.f26378l0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    fr0Var.b1();
                    if (fr0Var.f26380n0) {
                        fr0Var.O0();
                    }
                }
                fr0Var.m0 = false;
                return;
            case 6:
                nu0 nu0Var = (nu0) this.f26954b;
                mr0 mr0Var = (mr0) this.f26955c;
                nu0Var.G = null;
                nu0Var.H = null;
                mr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new c80(mr0Var, 19)).start();
                return;
            case 7:
                ci.b7 b7Var = (ci.b7) this.f26955c;
                ps0 ps0Var = ((uv0) this.f26954b).W;
                if (ps0Var != null) {
                    int i13 = b7Var.f5251a;
                    ps0Var.f36518n.d(i13, ps0Var.f36520s.i(i13));
                    return;
                }
                return;
            case 8:
                xc.a0(((du0) this.f26954b).f25631f.f31070v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f26955c).title)).k(true);
                return;
            case 9:
                qu0 qu0Var = (qu0) this.f26954b;
                String str2 = (String) this.f26955c;
                if (!qu0Var.v.f31066t1[qu0Var.f29722r].f27641a.isEmpty() && ((i10 = qu0Var.f29722r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.e.h(1, qu0Var.v.f31066t1[i10].f27641a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    uv0 uv0Var = qu0Var.v;
                    if (uv0Var.f31045j1 == uv0Var.f31070v1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    qu0Var.F(id2, str2, dialogId, j10);
                } else if (qu0Var.f29722r == 3) {
                    uv0 uv0Var2 = qu0Var.v;
                    qu0Var.F(0, str2, uv0Var2.f31045j1, uv0Var2.F);
                }
                int i14 = qu0Var.f29722r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList4 = new ArrayList(qu0Var.v.f31066t1[qu0Var.f29722r].f27641a);
                    qu0Var.f29723s++;
                    Utilities.searchQueue.postRunnable(new lg((Object) qu0Var, (Object) str2, arrayList4, 26));
                    return;
                }
                return;
            case 10:
                qu0 qu0Var2 = (qu0) this.f26954b;
                ArrayList arrayList5 = (ArrayList) this.f26955c;
                uv0 uv0Var3 = qu0Var2.v;
                boolean z10 = uv0Var3.V0;
                nu0[] nu0VarArr = uv0Var3.f31046k0;
                if (z10) {
                    qu0Var2.f29723s--;
                    int h = qu0Var2.h();
                    qu0Var2.d = arrayList5;
                    int h10 = qu0Var2.h();
                    if (qu0Var2.f29723s == 0 || h10 != 0) {
                        uv0Var3.o1(false);
                    }
                    for (int i15 = 0; i15 < nu0VarArr.length; i15++) {
                        nu0 nu0Var2 = nu0VarArr[i15];
                        if (nu0Var2.F == qu0Var2.f29722r) {
                            if (qu0Var2.f29723s == 0 && h10 == 0) {
                                nu0Var2.f28882w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                nu0VarArr[i15].f28882w.f30698f.setVisibility(8);
                                nu0VarArr[i15].f28882w.e(false, true);
                            } else if (h == 0) {
                                uv0Var3.z(nu0Var2.h, 0, null);
                            }
                        }
                    }
                    qu0Var2.l();
                    return;
                }
                return;
            case 11:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f26954b, (TLRPC.Document) this.f26955c, null, bool);
                return;
            case 12:
                MessagesController.getInstance(((dz0) this.f26954b).f25649a.f27353a).updateEmojiStatus((TLRPC.EmojiStatus) this.f26955c);
                return;
            case 13:
                s31 s31Var = (s31) this.f26954b;
                MessagesController.getInstance(s31Var.f30179b).getTopicsController().deleteTopics(-s31Var.f30181c, (ArrayList) this.f26955c);
                int i17 = s31.f30176f0;
                return;
            case 14:
                s31 s31Var2 = (s31) this.f26954b;
                s31Var2.getClass();
                MessagesController.getInstance(s31Var2.f30179b).loadFullChat(((TLRPC.Updates) this.f26955c).chats.get(0).f20276id, 0, true);
                return;
            case 15:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f26954b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f26955c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 16:
                t41.p((t41) this.f26954b, (TLObject) this.f26955c);
                return;
            case 17:
                org.telegram.ui.rk rkVar = (org.telegram.ui.rk) this.f26954b;
                ((org.telegram.ui.ActionBar.m1) this.f26955c).d(true);
                k51.a(rkVar.getContext(), rkVar.d);
                return;
            case 18:
                ((TranslateController) this.f26955c).setHideTranslateDialog(((org.telegram.ui.rk) this.f26954b).f27756b, false);
                return;
            case 19:
                UndoView undoView = (UndoView) this.f26954b;
                TLObject tLObject2 = (TLObject) this.f26955c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24417s.presentFragment(new org.telegram.ui.eo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f24406e0;
                undoView.getClass();
                return;
            case 20:
                ((h61) this.f26954b).D.onClick((org.telegram.ui.Cells.u8) this.f26955c);
                return;
            case 21:
                c81 c81Var = (c81) this.f26954b;
                b2.y0 y0Var = (b2.y0) this.f26955c;
                Throwable cause = y0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(y0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = c81.f25126l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = c81Var.N;
                    if (arrayList6 != null) {
                        int i19 = 0;
                        while (i19 < arrayList6.size()) {
                            y71 y71Var = (y71) arrayList6.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList7 = y71Var.d;
                                if (i20 < arrayList7.size()) {
                                    a81 a81Var = (a81) arrayList7.get(i20);
                                    if (!TextUtils.isEmpty(a81Var.f24545m) && !c81.Y(a81Var.f24545m)) {
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
                    c81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        c81Var.F(arrayList2, c81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = c81Var.f25140n;
                if (textureView != null && ((!c81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    c81Var.E = true;
                    if (c81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(c81Var.f25140n);
                            viewGroup.removeView(c81Var.f25140n);
                            viewGroup.addView(c81Var.f25140n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = c81Var.f25129b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new u71(c81Var, 0));
                            return;
                        }
                        i2.i0 i0Var = c81Var.d;
                        TextureView textureView2 = c81Var.f25140n;
                        i0Var.F1();
                        if (textureView2 != null && textureView2 == i0Var.X) {
                            i0Var.F1();
                            i0Var.s1();
                            i0Var.x1(null);
                            i0Var.q1(0, 0);
                        }
                        c81Var.d.z1(c81Var.f25140n);
                        ArrayList arrayList8 = c81Var.N;
                        if (arrayList8 != null) {
                            c81Var.F(arrayList8, c81Var.O);
                        } else if (c81Var.U) {
                            c81Var.G(c81Var.Q, c81Var.S, c81Var.R, c81Var.T);
                        } else {
                            c81Var.D(c81Var.Q, c81Var.S);
                        }
                        c81Var.C();
                        return;
                    }
                    return;
                }
                c81Var.J.onError(c81Var, y0Var);
                return;
            case 22:
                ((b81) this.f26954b).f24829f.K.onVisualizerUpdate(true, true, (float[]) this.f26955c);
                return;
            case 23:
                j81 j81Var = (j81) this.f26954b;
                Bitmap bitmap = (Bitmap) this.f26955c;
                if (bitmap != null) {
                    if (j81Var.f27445w != null) {
                        Bitmap bitmap2 = j81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        j81Var.v = j81Var.f27445w;
                    }
                    j81Var.f27445w = bitmap;
                    Bitmap bitmap3 = j81Var.f27445w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    j81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(j81Var.L);
                    j81Var.J.setShader(j81Var.G);
                    j81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = j81Var.getLayoutParams();
                    if (j81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        j81Var.setVisibility(0);
                        j81Var.requestLayout();
                    }
                }
                j81Var.f27439f = null;
                return;
            case 24:
                final v91 v91Var = (v91) this.f26954b;
                v91Var.e.f32018b.evaluateJavascript((String) this.f26955c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        v91 v91Var2 = v91.this;
                        String[] strArr = v91Var2.f31207c;
                        String str4 = strArr[0];
                        String str5 = v91Var2.d;
                        strArr[0] = str4.replace(str5, "/signature/" + str3.substring(1, str3.length() - 1));
                        v91Var2.f31206b.countDown();
                    }
                });
                return;
            case 25:
                ((org.telegram.ui.Components.voip.k) this.f26954b).f31491a.setOnClickListener((View.OnClickListener) this.f26955c);
                return;
            case 26:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f26954b;
                Bitmap bitmap4 = (Bitmap) this.f26955c;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f31735w;
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
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f26955c;
                ((org.telegram.ui.Components.voip.l0) this.f26954b).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 28:
                jm0 jm0Var = (jm0) this.f26954b;
                Object obj = this.f26955c;
                if (jm0Var != null) {
                    jm0Var.setOnItemClickListener((xl0) obj);
                    return;
                }
                return;
            default:
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) this.f26954b;
                String lowerCase = ((String) this.f26955c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.lt(0, mtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = mtVar.f39348f;
                int size3 = arrayList10.size();
                int i21 = 0;
                while (i21 < size3) {
                    Object obj2 = arrayList10.get(i21);
                    i21++;
                    org.telegram.ui.ht htVar = (org.telegram.ui.ht) obj2;
                    String str3 = htVar.f37783a;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase2 = str3.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(htVar.f37783a).toLowerCase();
                    String str5 = htVar.f37784b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String lowerCase4 = str5.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(htVar.f37784b).toLowerCase();
                    String str6 = htVar.f37785c;
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

    public ho0(Object obj, Object obj2, Object obj3, int i10) {
        this.f26953a = i10;
        this.f26954b = obj;
        this.f26955c = obj2;
    }
}
