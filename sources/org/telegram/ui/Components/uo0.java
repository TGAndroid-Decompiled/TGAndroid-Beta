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
public final class uo0 implements Runnable {
    public final int f31415a;
    public final Object f31416b;
    public final Object f31417c;

    public uo0(int i10, Object obj, Object obj2) {
        this.f31415a = i10;
        this.f31416b = obj;
        this.f31417c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        int i11;
        String str;
        ArrayList arrayList;
        zl0 zl0Var;
        int i12 = 2;
        ArrayList arrayList2 = null;
        int i13 = 0;
        switch (this.f31415a) {
            case 0:
                ((vo0) this.f31416b).sendAccessibilityEvent((View) this.f31417c, 4);
                return;
            case 1:
                gf gfVar = (gf) this.f31416b;
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) this.f31417c;
                if (ynVar != null) {
                    ynVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    gfVar.dismiss();
                    return;
                }
                return;
            case 2:
                ((WindowManager) this.f31417c).removeView(((gf) this.f31416b).B);
                return;
            case 3:
                zq0 zq0Var = (zq0) this.f31416b;
                TLObject tLObject = (TLObject) this.f31417c;
                if (tLObject != null) {
                    zq0Var.f33616k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    zq0Var.W0();
                    if (zq0Var.m0) {
                        zq0Var.J0();
                    }
                }
                zq0Var.f33617l0 = false;
                return;
            case 4:
                iu0 iu0Var = (iu0) this.f31416b;
                gr0 gr0Var = (gr0) this.f31417c;
                iu0Var.G = null;
                iu0Var.H = null;
                gr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new hd0(gr0Var, 14)).start();
                return;
            case 5:
                ai.e9 e9Var = (ai.e9) this.f31417c;
                ks0 ks0Var = ((pv0) this.f31416b).W;
                if (ks0Var != null) {
                    int i14 = e9Var.f922a;
                    ks0Var.f40674n.d(i14, ks0Var.f40676s.i(i14));
                    return;
                }
                return;
            case 6:
                yc.a0(((yt0) this.f31416b).f33257f.f29806v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f31417c).title)).k(true);
                return;
            case 7:
                lu0 lu0Var = (lu0) this.f31416b;
                String str2 = (String) this.f31417c;
                if (!lu0Var.v.f29802t1[lu0Var.f28441r].f26144a.isEmpty() && ((i10 = lu0Var.f28441r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, lu0Var.v.f29802t1[i10].f26144a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    pv0 pv0Var = lu0Var.v;
                    if (pv0Var.f29781j1 == pv0Var.f29806v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    lu0Var.F(id2, str2, dialogId, j3);
                } else if (lu0Var.f28441r == 3) {
                    pv0 pv0Var2 = lu0Var.v;
                    lu0Var.F(0, str2, pv0Var2.f29781j1, pv0Var2.F);
                }
                int i15 = lu0Var.f28441r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(lu0Var.v.f29802t1[lu0Var.f28441r].f26144a);
                    lu0Var.f28442s++;
                    Utilities.searchQueue.postRunnable(new in0((Object) lu0Var, (Serializable) str2, arrayList3, 8));
                    return;
                }
                return;
            case 8:
                lu0 lu0Var2 = (lu0) this.f31416b;
                ArrayList arrayList4 = (ArrayList) this.f31417c;
                pv0 pv0Var3 = lu0Var2.v;
                boolean z10 = pv0Var3.V0;
                iu0[] iu0VarArr = pv0Var3.f29782k0;
                if (z10) {
                    lu0Var2.f28442s--;
                    int h = lu0Var2.h();
                    lu0Var2.d = arrayList4;
                    int h10 = lu0Var2.h();
                    if (lu0Var2.f28442s == 0 || h10 != 0) {
                        pv0Var3.m1(false);
                    }
                    for (int i16 = 0; i16 < iu0VarArr.length; i16++) {
                        iu0 iu0Var2 = iu0VarArr[i16];
                        if (iu0Var2.F == lu0Var2.f28441r) {
                            if (lu0Var2.f28442s == 0 && h10 == 0) {
                                iu0Var2.f27509w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                iu0VarArr[i16].f27509w.f31202f.setVisibility(8);
                                iu0VarArr[i16].f27509w.e(false, true);
                            } else if (h == 0) {
                                pv0Var3.z(iu0Var2.h, 0, null);
                            }
                        }
                    }
                    lu0Var2.l();
                    return;
                }
                return;
            case 9:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i17 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i17, bool, (TLObject) this.f31416b, (TLRPC.Document) this.f31417c, null, bool);
                return;
            case 10:
                MessagesController.getInstance(((dz0) this.f31416b).f25846a.f27530a).updateEmojiStatus((TLRPC.EmojiStatus) this.f31417c);
                return;
            case 11:
                v31 v31Var = (v31) this.f31416b;
                MessagesController.getInstance(v31Var.f31552b).getTopicsController().deleteTopics(-v31Var.f31554c, (ArrayList) this.f31417c);
                int i18 = v31.f31549f0;
                return;
            case 12:
                v31 v31Var2 = (v31) this.f31416b;
                v31Var2.getClass();
                MessagesController.getInstance(v31Var2.f31552b).loadFullChat(((TLRPC.Updates) this.f31417c).chats.get(0).f20042id, 0, true);
                return;
            case 13:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f31416b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f31417c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.e0(i12);
                    return;
                }
                return;
            case 14:
                t41.o((t41) this.f31416b, (TLObject) this.f31417c);
                return;
            case 15:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f31416b;
                String str3 = (String) this.f31417c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f31416b;
                ((org.telegram.ui.ActionBar.n1) this.f31417c).d(true);
                k51.a(wkVar.getContext(), wkVar.d);
                return;
            case 17:
                ((TranslateController) this.f31417c).setHideTranslateDialog(((org.telegram.ui.wk) this.f31416b).f27963b, false);
                return;
            case 18:
                UndoView undoView = (UndoView) this.f31416b;
                TLObject tLObject2 = (TLObject) this.f31417c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24384s.presentFragment(new org.telegram.ui.so0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i19 = UndoView.f24372e0;
                undoView.getClass();
                return;
            case 19:
                ((g61) this.f31416b).D.onClick((org.telegram.ui.Cells.v8) this.f31417c);
                return;
            case 20:
                d81 d81Var = (d81) this.f31416b;
                b2.u0 u0Var = (b2.u0) this.f31417c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = d81.f25637l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = d81Var.N;
                    if (arrayList5 != null) {
                        int i20 = 0;
                        while (i20 < arrayList5.size()) {
                            z71 z71Var = (z71) arrayList5.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList6 = z71Var.d;
                                if (i21 < arrayList6.size()) {
                                    b81 b81Var = (b81) arrayList6.get(i21);
                                    if (!TextUtils.isEmpty(b81Var.f24866m) && !d81.Y(b81Var.f24866m)) {
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
                    d81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        d81Var.F(arrayList2, d81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = d81Var.f25652n;
                if (textureView != null && ((!d81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    d81Var.E = true;
                    if (d81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(d81Var.f25652n);
                            viewGroup.removeView(d81Var.f25652n);
                            viewGroup.addView(d81Var.f25652n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = d81Var.f25640b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new f71(d81Var, 2));
                            return;
                        }
                        i2.f0 f0Var = d81Var.d;
                        TextureView textureView2 = d81Var.f25652n;
                        f0Var.B1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.B1();
                            f0Var.o1();
                            f0Var.t1(null);
                            f0Var.m1(0, 0);
                        }
                        d81Var.d.v1(d81Var.f25652n);
                        ArrayList arrayList7 = d81Var.N;
                        if (arrayList7 != null) {
                            d81Var.F(arrayList7, d81Var.O);
                        } else if (d81Var.U) {
                            d81Var.G(d81Var.Q, d81Var.S, d81Var.R, d81Var.T);
                        } else {
                            d81Var.D(d81Var.Q, d81Var.S);
                        }
                        d81Var.C();
                        return;
                    }
                    return;
                }
                d81Var.J.onError(d81Var, u0Var);
                return;
            case 21:
                ((c81) this.f31416b).f25270f.K.onVisualizerUpdate(true, true, (float[]) this.f31417c);
                return;
            case 22:
                k81 k81Var = (k81) this.f31416b;
                Bitmap bitmap = (Bitmap) this.f31417c;
                if (bitmap != null) {
                    if (k81Var.f28028w != null) {
                        Bitmap bitmap2 = k81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        k81Var.v = k81Var.f28028w;
                    }
                    k81Var.f28028w = bitmap;
                    Bitmap bitmap3 = k81Var.f28028w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    k81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(k81Var.L);
                    k81Var.J.setShader(k81Var.G);
                    k81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = k81Var.getLayoutParams();
                    if (k81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        k81Var.setVisibility(0);
                        k81Var.requestLayout();
                    }
                }
                k81Var.f28022f = null;
                return;
            case 23:
                final y91 y91Var = (y91) this.f31416b;
                y91Var.f33131e.f33448b.evaluateJavascript((String) this.f31417c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        y91 y91Var2 = y91.this;
                        String[] strArr = y91Var2.f33130c;
                        String str5 = strArr[0];
                        String str6 = y91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        y91Var2.f33129b.countDown();
                    }
                });
                return;
            case 24:
                ((org.telegram.ui.Components.voip.k) this.f31416b).f31929a.setOnClickListener((View.OnClickListener) this.f31417c);
                return;
            case 25:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f31416b;
                Bitmap bitmap4 = (Bitmap) this.f31417c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f32206w;
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
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f31417c;
                ((org.telegram.ui.Components.voip.m0) this.f31416b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            case 27:
                zl0 zl0Var2 = (zl0) this.f31416b;
                Object obj = this.f31417c;
                if (zl0Var2 != null) {
                    zl0Var2.setOnItemClickListener((ml0) obj);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.xt xtVar = (org.telegram.ui.xt) this.f31416b;
                String lowerCase = ((String) this.f31417c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new uo0(29, xtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = xtVar.f42951f;
                int size = arrayList9.size();
                while (i13 < size) {
                    Object obj2 = arrayList9.get(i13);
                    i13++;
                    org.telegram.ui.ut utVar = (org.telegram.ui.ut) obj2;
                    String str4 = utVar.f41305a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(utVar.f41305a).toLowerCase();
                    String str6 = utVar.f41306b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(utVar.f41306b).toLowerCase();
                    String str7 = utVar.f41307c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        str5 = "+".concat(str7);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList9;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.bi.u(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.bi.u(" ", translitSafe, lowerCase5) && !str7.startsWith(lowerCase) && !str5.startsWith(lowerCase)) {
                            arrayList9 = arrayList;
                        }
                    } else {
                        arrayList = arrayList9;
                    }
                    arrayList8.add(utVar);
                    arrayList9 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new uo0(29, xtVar, arrayList8));
                return;
            default:
                org.telegram.ui.xt xtVar2 = (org.telegram.ui.xt) this.f31416b;
                ArrayList arrayList10 = (ArrayList) this.f31417c;
                org.telegram.ui.zt ztVar = xtVar2.h;
                if (ztVar.f43890f) {
                    xtVar2.f42950e = arrayList10;
                    if (ztVar.f43889e && (zl0Var = ztVar.f43886a) != null) {
                        s4.h0 adapter = zl0Var.getAdapter();
                        org.telegram.ui.xt xtVar3 = ztVar.d;
                        if (adapter != xtVar3) {
                            ztVar.f43886a.setAdapter(xtVar3);
                            ztVar.f43886a.setFastScrollVisible(false);
                        }
                    }
                    xtVar2.l();
                    return;
                }
                return;
        }
    }

    public uo0(Object obj, Object obj2, Object obj3, int i10) {
        this.f31415a = i10;
        this.f31416b = obj;
        this.f31417c = obj2;
    }
}
