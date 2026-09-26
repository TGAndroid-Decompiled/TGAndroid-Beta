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
public final class xn0 implements Runnable {
    public final int f30428a;
    public final Object f30429b;
    public final Object f30430c;

    public xn0(int i10, Object obj, Object obj2) {
        this.f30428a = i10;
        this.f30429b = obj;
        this.f30430c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        int i11;
        String str;
        ArrayList arrayList;
        int i12 = 2;
        ArrayList arrayList2 = null;
        switch (this.f30428a) {
            case 0:
                ((fo0) this.f30429b).T();
                xc.a0((org.telegram.ui.qy) this.f30430c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 1:
                ((qo0) this.f30429b).sendAccessibilityEvent((View) this.f30430c, 4);
                return;
            case 2:
                ff ffVar = (ff) this.f30429b;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.f30430c;
                if (wnVar != null) {
                    wnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ffVar.dismiss();
                    return;
                }
                return;
            case 3:
                ((WindowManager) this.f30430c).removeView(((ff) this.f30429b).B);
                return;
            case 4:
                vq0 vq0Var = (vq0) this.f30429b;
                TLObject tLObject = (TLObject) this.f30430c;
                if (tLObject != null) {
                    vq0Var.f29728k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    vq0Var.Z0();
                    if (vq0Var.m0) {
                        vq0Var.M0();
                    }
                }
                vq0Var.f29729l0 = false;
                return;
            case 5:
                du0 du0Var = (du0) this.f30429b;
                cr0 cr0Var = (cr0) this.f30430c;
                du0Var.G = null;
                du0Var.H = null;
                cr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new gd0(cr0Var, 14)).start();
                return;
            case 6:
                ai.e9 e9Var = (ai.e9) this.f30430c;
                fs0 fs0Var = ((kv0) this.f30429b).W;
                if (fs0Var != null) {
                    int i13 = e9Var.f854a;
                    fs0Var.f37565n.d(i13, fs0Var.f37567s.i(i13));
                    return;
                }
                return;
            case 7:
                xc.a0(((tt0) this.f30429b).f28612f.f25866v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f30430c).title)).k(true);
                return;
            case 8:
                gu0 gu0Var = (gu0) this.f30429b;
                String str2 = (String) this.f30430c;
                if (!gu0Var.v.f25862t1[gu0Var.f24590r].f30969a.isEmpty() && ((i10 = gu0Var.f24590r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, gu0Var.v.f25862t1[i10].f30969a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    kv0 kv0Var = gu0Var.v;
                    if (kv0Var.f25841j1 == kv0Var.f25866v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    gu0Var.F(id2, str2, dialogId, j3);
                } else if (gu0Var.f24590r == 3) {
                    kv0 kv0Var2 = gu0Var.v;
                    gu0Var.F(0, str2, kv0Var2.f25841j1, kv0Var2.F);
                }
                int i14 = gu0Var.f24590r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(gu0Var.v.f25862t1[gu0Var.f24590r].f30969a);
                    gu0Var.f24591s++;
                    Utilities.searchQueue.postRunnable(new dn0((Object) gu0Var, (Serializable) str2, arrayList3, 8));
                    return;
                }
                return;
            case 9:
                gu0 gu0Var2 = (gu0) this.f30429b;
                ArrayList arrayList4 = (ArrayList) this.f30430c;
                kv0 kv0Var3 = gu0Var2.v;
                boolean z10 = kv0Var3.V0;
                du0[] du0VarArr = kv0Var3.f25842k0;
                if (z10) {
                    gu0Var2.f24591s--;
                    int h = gu0Var2.h();
                    gu0Var2.d = arrayList4;
                    int h10 = gu0Var2.h();
                    if (gu0Var2.f24591s == 0 || h10 != 0) {
                        kv0Var3.m1(false);
                    }
                    for (int i15 = 0; i15 < du0VarArr.length; i15++) {
                        du0 du0Var2 = du0VarArr[i15];
                        if (du0Var2.F == gu0Var2.f24590r) {
                            if (gu0Var2.f24591s == 0 && h10 == 0) {
                                du0Var2.f23759w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                du0VarArr[i15].f23759w.f25547f.setVisibility(8);
                                du0VarArr[i15].f23759w.e(false, true);
                            } else if (h == 0) {
                                kv0Var3.z(du0Var2.h, 0, null);
                            }
                        }
                    }
                    gu0Var2.l();
                    return;
                }
                return;
            case 10:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f30429b, (TLRPC.Document) this.f30430c, null, bool);
                return;
            case 11:
                MessagesController.getInstance(((ty0) this.f30429b).f28626a.f30727a).updateEmojiStatus((TLRPC.EmojiStatus) this.f30430c);
                return;
            case 12:
                l31 l31Var = (l31) this.f30429b;
                MessagesController.getInstance(l31Var.f25943b).getTopicsController().deleteTopics(-l31Var.f25945c, (ArrayList) this.f30430c);
                int i17 = l31.f25940f0;
                return;
            case 13:
                l31 l31Var2 = (l31) this.f30429b;
                l31Var2.getClass();
                MessagesController.getInstance(l31Var2.f25943b).loadFullChat(((TLRPC.Updates) this.f30430c).chats.get(0).f18335id, 0, true);
                return;
            case 14:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f30429b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f30430c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 15:
                j41.o((j41) this.f30429b, (TLObject) this.f30430c);
                return;
            case 16:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f30429b;
                String str3 = (String) this.f30430c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f30429b;
                ((org.telegram.ui.ActionBar.m1) this.f30430c).d(true);
                a51.a(wkVar.getContext(), wkVar.d);
                return;
            case 18:
                ((TranslateController) this.f30430c).setHideTranslateDialog(((org.telegram.ui.wk) this.f30429b).f22537b, false);
                return;
            case 19:
                UndoView undoView = (UndoView) this.f30429b;
                TLObject tLObject2 = (TLObject) this.f30430c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f22461s.presentFragment(new org.telegram.ui.oo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f22450e0;
                undoView.getClass();
                return;
            case 20:
                ((w51) this.f30429b).D.onClick((org.telegram.ui.Cells.v8) this.f30430c);
                return;
            case 21:
                t71 t71Var = (t71) this.f30429b;
                b2.u0 u0Var = (b2.u0) this.f30430c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = t71.f28483l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = t71Var.N;
                    if (arrayList5 != null) {
                        int i19 = 0;
                        while (i19 < arrayList5.size()) {
                            p71 p71Var = (p71) arrayList5.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList6 = p71Var.d;
                                if (i20 < arrayList6.size()) {
                                    r71 r71Var = (r71) arrayList6.get(i20);
                                    if (!TextUtils.isEmpty(r71Var.f27860m) && !t71.Y(r71Var.f27860m)) {
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
                        arrayList2 = arrayList5;
                    }
                    t71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        t71Var.F(arrayList2, t71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = t71Var.f28497n;
                if (textureView != null && ((!t71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    t71Var.E = true;
                    if (t71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(t71Var.f28497n);
                            viewGroup.removeView(t71Var.f28497n);
                            viewGroup.addView(t71Var.f28497n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = t71Var.f28486b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new h71(t71Var, 1));
                            return;
                        }
                        i2.f0 f0Var = t71Var.d;
                        TextureView textureView2 = t71Var.f28497n;
                        f0Var.B1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.B1();
                            f0Var.o1();
                            f0Var.t1(null);
                            f0Var.m1(0, 0);
                        }
                        t71Var.d.v1(t71Var.f28497n);
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
            case 22:
                ((s71) this.f30429b).f28193f.K.onVisualizerUpdate(true, true, (float[]) this.f30430c);
                return;
            case 23:
                b81 b81Var = (b81) this.f30429b;
                Bitmap bitmap = (Bitmap) this.f30430c;
                if (bitmap != null) {
                    if (b81Var.f22926w != null) {
                        Bitmap bitmap2 = b81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        b81Var.v = b81Var.f22926w;
                    }
                    b81Var.f22926w = bitmap;
                    Bitmap bitmap3 = b81Var.f22926w;
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
                b81Var.f22920f = null;
                return;
            case 24:
                final o91 o91Var = (o91) this.f30429b;
                o91Var.e.f27284b.evaluateJavascript((String) this.f30430c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        o91 o91Var2 = o91.this;
                        String[] strArr = o91Var2.f27011c;
                        String str5 = strArr[0];
                        String str6 = o91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        o91Var2.f27010b.countDown();
                    }
                });
                return;
            case 25:
                ((org.telegram.ui.Components.voip.k) this.f30429b).f29329a.setOnClickListener((View.OnClickListener) this.f30430c);
                return;
            case 26:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f30429b;
                Bitmap bitmap4 = (Bitmap) this.f30430c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29587w;
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
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f30430c;
                ((org.telegram.ui.Components.voip.m0) this.f30429b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            case 28:
                xl0 xl0Var = (xl0) this.f30429b;
                Object obj = this.f30430c;
                if (xl0Var != null) {
                    xl0Var.setOnItemClickListener((ll0) obj);
                    return;
                }
                return;
            default:
                org.telegram.ui.ut utVar = (org.telegram.ui.ut) this.f30429b;
                String lowerCase = ((String) this.f30430c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.tt(0, utVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = utVar.f38553f;
                int size = arrayList9.size();
                int i21 = 0;
                while (i21 < size) {
                    Object obj2 = arrayList9.get(i21);
                    i21++;
                    org.telegram.ui.qt qtVar = (org.telegram.ui.qt) obj2;
                    String str4 = qtVar.f36980a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(qtVar.f36980a).toLowerCase();
                    String str6 = qtVar.f36981b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(qtVar.f36981b).toLowerCase();
                    String str7 = qtVar.f36982c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        str5 = "+".concat(str7);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList9;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.f0.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.f0.w(" ", translitSafe, lowerCase5) && !str7.startsWith(lowerCase) && !str5.startsWith(lowerCase)) {
                            arrayList9 = arrayList;
                        }
                    } else {
                        arrayList = arrayList9;
                    }
                    arrayList8.add(qtVar);
                    arrayList9 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.tt(0, utVar, arrayList8));
                return;
        }
    }

    public xn0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30428a = i10;
        this.f30429b = obj;
        this.f30430c = obj2;
    }
}
