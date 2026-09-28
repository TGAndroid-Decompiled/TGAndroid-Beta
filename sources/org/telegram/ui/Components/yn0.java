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
    public final int f30732a;
    public final Object f30733b;
    public final Object f30734c;

    public yn0(int i10, Object obj, Object obj2) {
        this.f30732a = i10;
        this.f30733b = obj;
        this.f30734c = obj2;
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
        switch (this.f30732a) {
            case 0:
                ((go0) this.f30733b).T();
                xc.a0((org.telegram.ui.qy) this.f30734c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 1:
                ((ro0) this.f30733b).sendAccessibilityEvent((View) this.f30734c, 4);
                return;
            case 2:
                ff ffVar = (ff) this.f30733b;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.f30734c;
                if (wnVar != null) {
                    wnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ffVar.dismiss();
                    return;
                }
                return;
            case 3:
                ((WindowManager) this.f30734c).removeView(((ff) this.f30733b).B);
                return;
            case 4:
                wq0 wq0Var = (wq0) this.f30733b;
                TLObject tLObject = (TLObject) this.f30734c;
                if (tLObject != null) {
                    wq0Var.f30140k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    wq0Var.Z0();
                    if (wq0Var.m0) {
                        wq0Var.M0();
                    }
                }
                wq0Var.f30141l0 = false;
                return;
            case 5:
                eu0 eu0Var = (eu0) this.f30733b;
                dr0 dr0Var = (dr0) this.f30734c;
                eu0Var.G = null;
                eu0Var.H = null;
                dr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new hd0(dr0Var, 14)).start();
                return;
            case 6:
                ai.e9 e9Var = (ai.e9) this.f30734c;
                gs0 gs0Var = ((lv0) this.f30733b).W;
                if (gs0Var != null) {
                    int i13 = e9Var.f854a;
                    gs0Var.f37567n.d(i13, gs0Var.f37569s.i(i13));
                    return;
                }
                return;
            case 7:
                xc.a0(((ut0) this.f30733b).f28887f.f26160v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f30734c).title)).k(true);
                return;
            case 8:
                hu0 hu0Var = (hu0) this.f30733b;
                String str2 = (String) this.f30734c;
                if (!hu0Var.v.f26156t1[hu0Var.f24909r].f22731a.isEmpty() && ((i10 = hu0Var.f24909r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, hu0Var.v.f26156t1[i10].f22731a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    lv0 lv0Var = hu0Var.v;
                    if (lv0Var.f26135j1 == lv0Var.f26160v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    hu0Var.F(id2, str2, dialogId, j3);
                } else if (hu0Var.f24909r == 3) {
                    lv0 lv0Var2 = hu0Var.v;
                    hu0Var.F(0, str2, lv0Var2.f26135j1, lv0Var2.F);
                }
                int i14 = hu0Var.f24909r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(hu0Var.v.f26156t1[hu0Var.f24909r].f22731a);
                    hu0Var.f24910s++;
                    Utilities.searchQueue.postRunnable(new en0((Object) hu0Var, (Serializable) str2, arrayList3, 8));
                    return;
                }
                return;
            case 9:
                hu0 hu0Var2 = (hu0) this.f30733b;
                ArrayList arrayList4 = (ArrayList) this.f30734c;
                lv0 lv0Var3 = hu0Var2.v;
                boolean z10 = lv0Var3.V0;
                eu0[] eu0VarArr = lv0Var3.f26136k0;
                if (z10) {
                    hu0Var2.f24910s--;
                    int h = hu0Var2.h();
                    hu0Var2.d = arrayList4;
                    int h10 = hu0Var2.h();
                    if (hu0Var2.f24910s == 0 || h10 != 0) {
                        lv0Var3.m1(false);
                    }
                    for (int i15 = 0; i15 < eu0VarArr.length; i15++) {
                        eu0 eu0Var2 = eu0VarArr[i15];
                        if (eu0Var2.F == hu0Var2.f24909r) {
                            if (hu0Var2.f24910s == 0 && h10 == 0) {
                                eu0Var2.f24072w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                eu0VarArr[i15].f24072w.f25858f.setVisibility(8);
                                eu0VarArr[i15].f24072w.e(false, true);
                            } else if (h == 0) {
                                lv0Var3.z(eu0Var2.h, 0, null);
                            }
                        }
                    }
                    hu0Var2.l();
                    return;
                }
                return;
            case 10:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f30733b, (TLRPC.Document) this.f30734c, null, bool);
                return;
            case 11:
                MessagesController.getInstance(((uy0) this.f30733b).f28904a.f30999a).updateEmojiStatus((TLRPC.EmojiStatus) this.f30734c);
                return;
            case 12:
                m31 m31Var = (m31) this.f30733b;
                MessagesController.getInstance(m31Var.f26272b).getTopicsController().deleteTopics(-m31Var.f26274c, (ArrayList) this.f30734c);
                int i17 = m31.f26269f0;
                return;
            case 13:
                m31 m31Var2 = (m31) this.f30733b;
                m31Var2.getClass();
                MessagesController.getInstance(m31Var2.f26272b).loadFullChat(((TLRPC.Updates) this.f30734c).chats.get(0).f18336id, 0, true);
                return;
            case 14:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f30733b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f30734c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 15:
                k41.o((k41) this.f30733b, (TLObject) this.f30734c);
                return;
            case 16:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f30733b;
                String str3 = (String) this.f30734c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f30733b;
                ((org.telegram.ui.ActionBar.m1) this.f30734c).d(true);
                b51.a(wkVar.getContext(), wkVar.d);
                return;
            case 18:
                ((TranslateController) this.f30734c).setHideTranslateDialog(((org.telegram.ui.wk) this.f30733b).f22866b, false);
                return;
            case 19:
                UndoView undoView = (UndoView) this.f30733b;
                TLObject tLObject2 = (TLObject) this.f30734c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f22462s.presentFragment(new org.telegram.ui.oo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f22451e0;
                undoView.getClass();
                return;
            case 20:
                ((x51) this.f30733b).D.onClick((org.telegram.ui.Cells.v8) this.f30734c);
                return;
            case 21:
                u71 u71Var = (u71) this.f30733b;
                b2.u0 u0Var = (b2.u0) this.f30734c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = u71.f28764l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = u71Var.N;
                    if (arrayList5 != null) {
                        int i19 = 0;
                        while (i19 < arrayList5.size()) {
                            q71 q71Var = (q71) arrayList5.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList6 = q71Var.d;
                                if (i20 < arrayList6.size()) {
                                    s71 s71Var = (s71) arrayList6.get(i20);
                                    if (!TextUtils.isEmpty(s71Var.f28161m) && !u71.Y(s71Var.f28161m)) {
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
                    u71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        u71Var.F(arrayList2, u71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = u71Var.f28778n;
                if (textureView != null && ((!u71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    u71Var.E = true;
                    if (u71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(u71Var.f28778n);
                            viewGroup.removeView(u71Var.f28778n);
                            viewGroup.addView(u71Var.f28778n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = u71Var.f28767b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new i71(u71Var, 1));
                            return;
                        }
                        i2.f0 f0Var = u71Var.d;
                        TextureView textureView2 = u71Var.f28778n;
                        f0Var.B1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.B1();
                            f0Var.o1();
                            f0Var.t1(null);
                            f0Var.m1(0, 0);
                        }
                        u71Var.d.v1(u71Var.f28778n);
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
            case 22:
                ((t71) this.f30733b).f28493f.K.onVisualizerUpdate(true, true, (float[]) this.f30734c);
                return;
            case 23:
                c81 c81Var = (c81) this.f30733b;
                Bitmap bitmap = (Bitmap) this.f30734c;
                if (bitmap != null) {
                    if (c81Var.f23244w != null) {
                        Bitmap bitmap2 = c81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        c81Var.v = c81Var.f23244w;
                    }
                    c81Var.f23244w = bitmap;
                    Bitmap bitmap3 = c81Var.f23244w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    c81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(c81Var.L);
                    c81Var.J.setShader(c81Var.G);
                    c81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = c81Var.getLayoutParams();
                    if (c81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        c81Var.setVisibility(0);
                        c81Var.requestLayout();
                    }
                }
                c81Var.f23238f = null;
                return;
            case 24:
                final p91 p91Var = (p91) this.f30733b;
                p91Var.e.f27611b.evaluateJavascript((String) this.f30734c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        p91 p91Var2 = p91.this;
                        String[] strArr = p91Var2.f27302c;
                        String str5 = strArr[0];
                        String str6 = p91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        p91Var2.f27301b.countDown();
                    }
                });
                return;
            case 25:
                ((org.telegram.ui.Components.voip.k) this.f30733b).f29334a.setOnClickListener((View.OnClickListener) this.f30734c);
                return;
            case 26:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f30733b;
                Bitmap bitmap4 = (Bitmap) this.f30734c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29592w;
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
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f30734c;
                ((org.telegram.ui.Components.voip.m0) this.f30733b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            case 28:
                yl0 yl0Var = (yl0) this.f30733b;
                Object obj = this.f30734c;
                if (yl0Var != null) {
                    yl0Var.setOnItemClickListener((ml0) obj);
                    return;
                }
                return;
            default:
                org.telegram.ui.ut utVar = (org.telegram.ui.ut) this.f30733b;
                String lowerCase = ((String) this.f30734c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.tt(0, utVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = utVar.f38555f;
                int size = arrayList9.size();
                int i21 = 0;
                while (i21 < size) {
                    Object obj2 = arrayList9.get(i21);
                    i21++;
                    org.telegram.ui.qt qtVar = (org.telegram.ui.qt) obj2;
                    String str4 = qtVar.f36982a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(qtVar.f36982a).toLowerCase();
                    String str6 = qtVar.f36983b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(qtVar.f36983b).toLowerCase();
                    String str7 = qtVar.f36984c;
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

    public yn0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30732a = i10;
        this.f30733b = obj;
        this.f30734c = obj2;
    }
}
