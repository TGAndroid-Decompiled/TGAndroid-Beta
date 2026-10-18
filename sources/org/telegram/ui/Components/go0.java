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
    public final int f26627a;
    public final Object f26628b;
    public final Object f26629c;

    public go0(int i10, Object obj, Object obj2) {
        this.f26627a = i10;
        this.f26628b = obj;
        this.f26629c = obj2;
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
        switch (this.f26627a) {
            case 0:
                oo0 oo0Var = (oo0) this.f26628b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26629c;
                ArrayList arrayList3 = oo0Var.K;
                if (!arrayList3.isEmpty() && (indexOf = arrayList3.indexOf(tL_sponsoredPeer)) >= 0 && (L = oo0Var.L()) < oo0Var.h()) {
                    arrayList3.remove(indexOf);
                    oo0Var.u(L + 1 + indexOf);
                    int size = oo0Var.f11884j0.e.size();
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
                ((oo0) this.f26628b).T();
                xc.a0((org.telegram.ui.ey) this.f26629c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                ((zo0) this.f26628b).sendAccessibilityEvent((View) this.f26629c, 4);
                return;
            case 3:
                ef efVar = (ef) this.f26628b;
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.f26629c;
                if (snVar != null) {
                    snVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    return;
                }
                return;
            case 4:
                ((WindowManager) this.f26629c).removeView(((ef) this.f26628b).B);
                return;
            case 5:
                dr0 dr0Var = (dr0) this.f26628b;
                TLObject tLObject = (TLObject) this.f26629c;
                if (tLObject != null) {
                    dr0Var.f25665k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    dr0Var.a1();
                    if (dr0Var.m0) {
                        dr0Var.N0();
                    }
                }
                dr0Var.f25666l0 = false;
                return;
            case 6:
                lu0 lu0Var = (lu0) this.f26628b;
                kr0 kr0Var = (kr0) this.f26629c;
                lu0Var.G = null;
                lu0Var.H = null;
                kr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new c80(kr0Var, 19)).start();
                return;
            case 7:
                ci.a7 a7Var = (ci.a7) this.f26629c;
                ns0 ns0Var = ((sv0) this.f26628b).W;
                if (ns0Var != null) {
                    int i13 = a7Var.f5150a;
                    ns0Var.f37043n.d(i13, ns0Var.f37045s.i(i13));
                    return;
                }
                return;
            case 8:
                xc.a0(((bu0) this.f26628b).f25047f.f30388v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f26629c).title)).k(true);
                return;
            case 9:
                ou0 ou0Var = (ou0) this.f26628b;
                String str2 = (String) this.f26629c;
                if (!ou0Var.v.f30384t1[ou0Var.f29072r].f26942a.isEmpty() && ((i10 = ou0Var.f29072r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.d.h(1, ou0Var.v.f30384t1[i10].f26942a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    sv0 sv0Var = ou0Var.v;
                    if (sv0Var.f30363j1 == sv0Var.f30388v1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    ou0Var.F(id2, str2, dialogId, j10);
                } else if (ou0Var.f29072r == 3) {
                    sv0 sv0Var2 = ou0Var.v;
                    ou0Var.F(0, str2, sv0Var2.f30363j1, sv0Var2.F);
                }
                int i14 = ou0Var.f29072r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList4 = new ArrayList(ou0Var.v.f30384t1[ou0Var.f29072r].f26942a);
                    ou0Var.f29073s++;
                    Utilities.searchQueue.postRunnable(new lg((Object) ou0Var, (Object) str2, arrayList4, 26));
                    return;
                }
                return;
            case 10:
                ou0 ou0Var2 = (ou0) this.f26628b;
                ArrayList arrayList5 = (ArrayList) this.f26629c;
                sv0 sv0Var3 = ou0Var2.v;
                boolean z10 = sv0Var3.V0;
                lu0[] lu0VarArr = sv0Var3.f30364k0;
                if (z10) {
                    ou0Var2.f29073s--;
                    int h = ou0Var2.h();
                    ou0Var2.d = arrayList5;
                    int h10 = ou0Var2.h();
                    if (ou0Var2.f29073s == 0 || h10 != 0) {
                        sv0Var3.o1(false);
                    }
                    for (int i15 = 0; i15 < lu0VarArr.length; i15++) {
                        lu0 lu0Var2 = lu0VarArr[i15];
                        if (lu0Var2.F == ou0Var2.f29072r) {
                            if (ou0Var2.f29073s == 0 && h10 == 0) {
                                lu0Var2.f28334w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                lu0VarArr[i15].f28334w.f30075f.setVisibility(8);
                                lu0VarArr[i15].f28334w.e(false, true);
                            } else if (h == 0) {
                                sv0Var3.z(lu0Var2.h, 0, null);
                            }
                        }
                    }
                    ou0Var2.l();
                    return;
                }
                return;
            case 11:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f26628b, (TLRPC.Document) this.f26629c, null, bool);
                return;
            case 12:
                MessagesController.getInstance(((bz0) this.f26628b).f25056a.f26703a).updateEmojiStatus((TLRPC.EmojiStatus) this.f26629c);
                return;
            case 13:
                q31 q31Var = (q31) this.f26628b;
                MessagesController.getInstance(q31Var.f29558b).getTopicsController().deleteTopics(-q31Var.f29560c, (ArrayList) this.f26629c);
                int i17 = q31.f29555f0;
                return;
            case 14:
                q31 q31Var2 = (q31) this.f26628b;
                q31Var2.getClass();
                MessagesController.getInstance(q31Var2.f29558b).loadFullChat(((TLRPC.Updates) this.f26629c).chats.get(0).f20272id, 0, true);
                return;
            case 15:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f26628b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f26629c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 16:
                r41.p((r41) this.f26628b, (TLObject) this.f26629c);
                return;
            case 17:
                org.telegram.ui.tk tkVar = (org.telegram.ui.tk) this.f26628b;
                ((org.telegram.ui.ActionBar.m1) this.f26629c).d(true);
                i51.a(tkVar.getContext(), tkVar.d);
                return;
            case 18:
                ((TranslateController) this.f26629c).setHideTranslateDialog(((org.telegram.ui.tk) this.f26628b).f27077b, false);
                return;
            case 19:
                UndoView undoView = (UndoView) this.f26628b;
                TLObject tLObject2 = (TLObject) this.f26629c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24413s.presentFragment(new org.telegram.ui.go0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f24402e0;
                undoView.getClass();
                return;
            case 20:
                ((f61) this.f26628b).D.onClick((org.telegram.ui.Cells.u8) this.f26629c);
                return;
            case 21:
                a81 a81Var = (a81) this.f26628b;
                b2.y0 y0Var = (b2.y0) this.f26629c;
                Throwable cause = y0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(y0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = a81.f24521l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = a81Var.N;
                    if (arrayList6 != null) {
                        int i19 = 0;
                        while (i19 < arrayList6.size()) {
                            w71 w71Var = (w71) arrayList6.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList7 = w71Var.d;
                                if (i20 < arrayList7.size()) {
                                    y71 y71Var = (y71) arrayList7.get(i20);
                                    if (!TextUtils.isEmpty(y71Var.f32566m) && !a81.Y(y71Var.f32566m)) {
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
                    a81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        a81Var.F(arrayList2, a81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = a81Var.f24535n;
                if (textureView != null && ((!a81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    a81Var.E = true;
                    if (a81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(a81Var.f24535n);
                            viewGroup.removeView(a81Var.f24535n);
                            viewGroup.addView(a81Var.f24535n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = a81Var.f24524b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new s71(a81Var, 0));
                            return;
                        }
                        i2.h0 h0Var = a81Var.d;
                        TextureView textureView2 = a81Var.f24535n;
                        h0Var.F1();
                        if (textureView2 != null && textureView2 == h0Var.X) {
                            h0Var.F1();
                            h0Var.s1();
                            h0Var.x1(null);
                            h0Var.q1(0, 0);
                        }
                        a81Var.d.z1(a81Var.f24535n);
                        ArrayList arrayList8 = a81Var.N;
                        if (arrayList8 != null) {
                            a81Var.F(arrayList8, a81Var.O);
                        } else if (a81Var.U) {
                            a81Var.G(a81Var.Q, a81Var.S, a81Var.R, a81Var.T);
                        } else {
                            a81Var.D(a81Var.Q, a81Var.S);
                        }
                        a81Var.C();
                        return;
                    }
                    return;
                }
                a81Var.J.onError(a81Var, y0Var);
                return;
            case 22:
                ((z71) this.f26628b).f32857f.K.onVisualizerUpdate(true, true, (float[]) this.f26629c);
                return;
            case 23:
                h81 h81Var = (h81) this.f26628b;
                Bitmap bitmap = (Bitmap) this.f26629c;
                if (bitmap != null) {
                    if (h81Var.f26807w != null) {
                        Bitmap bitmap2 = h81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        h81Var.v = h81Var.f26807w;
                    }
                    h81Var.f26807w = bitmap;
                    Bitmap bitmap3 = h81Var.f26807w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    h81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(h81Var.L);
                    h81Var.J.setShader(h81Var.G);
                    h81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = h81Var.getLayoutParams();
                    if (h81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        h81Var.setVisibility(0);
                        h81Var.requestLayout();
                    }
                }
                h81Var.f26801f = null;
                return;
            case 24:
                final t91 t91Var = (t91) this.f26628b;
                t91Var.e.f30928b.evaluateJavascript((String) this.f26629c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        t91 t91Var2 = t91.this;
                        String[] strArr = t91Var2.f30498c;
                        String str4 = strArr[0];
                        String str5 = t91Var2.d;
                        strArr[0] = str4.replace(str5, "/signature/" + str3.substring(1, str3.length() - 1));
                        t91Var2.f30497b.countDown();
                    }
                });
                return;
            case 25:
                ((org.telegram.ui.Components.voip.k) this.f26628b).f31531a.setOnClickListener((View.OnClickListener) this.f26629c);
                return;
            case 26:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f26628b;
                Bitmap bitmap4 = (Bitmap) this.f26629c;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f31775w;
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
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f26629c;
                ((org.telegram.ui.Components.voip.l0) this.f26628b).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 28:
                im0 im0Var = (im0) this.f26628b;
                Object obj = this.f26629c;
                if (im0Var != null) {
                    im0Var.setOnItemClickListener((wl0) obj);
                    return;
                }
                return;
            default:
                org.telegram.ui.ot otVar = (org.telegram.ui.ot) this.f26628b;
                String lowerCase = ((String) this.f26629c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.nt(0, otVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = otVar.f39863f;
                int size3 = arrayList10.size();
                int i21 = 0;
                while (i21 < size3) {
                    Object obj2 = arrayList10.get(i21);
                    i21++;
                    org.telegram.ui.kt ktVar = (org.telegram.ui.kt) obj2;
                    String str3 = ktVar.f38624a;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase2 = str3.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(ktVar.f38624a).toLowerCase();
                    String str5 = ktVar.f38625b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String lowerCase4 = str5.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(ktVar.f38625b).toLowerCase();
                    String str6 = ktVar.f38626c;
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
                    arrayList9.add(ktVar);
                    arrayList10 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.nt(0, otVar, arrayList9));
                return;
        }
    }

    public go0(Object obj, Object obj2, Object obj3, int i10) {
        this.f26627a = i10;
        this.f26628b = obj;
        this.f26629c = obj2;
    }
}
