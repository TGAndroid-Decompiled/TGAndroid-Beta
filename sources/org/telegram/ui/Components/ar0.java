package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
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
public final class ar0 implements Runnable {
    public final int f22493a;
    public final Object f22494b;
    public final Object f22495c;

    public ar0(int i10, Object obj, Object obj2) {
        this.f22493a = i10;
        this.f22494b = obj;
        this.f22495c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        int i11;
        String str;
        ArrayList arrayList;
        ml0 ml0Var;
        int i12 = 2;
        ArrayList arrayList2 = null;
        int i13 = 0;
        switch (this.f22493a) {
            case 0:
                rt0 rt0Var = (rt0) this.f22494b;
                oq0 oq0Var = (oq0) this.f22495c;
                rt0Var.G = null;
                rt0Var.H = null;
                oq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new jd0(oq0Var, 13)).start();
                return;
            case 1:
                ai.e9 e9Var = (ai.e9) this.f22495c;
                tr0 tr0Var = ((yu0) this.f22494b).W;
                if (tr0Var != null) {
                    int i14 = e9Var.f854a;
                    tr0Var.f37871n.d(i14, tr0Var.f37873s.i(i14));
                    return;
                }
                return;
            case 2:
                xc.a0(((ht0) this.f22494b).f24822f.f30450v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f22495c).title)).k(true);
                return;
            case 3:
                ut0 ut0Var = (ut0) this.f22494b;
                String str2 = (String) this.f22495c;
                if (!ut0Var.v.f30446t1[ut0Var.f28559r].f26512a.isEmpty() && ((i10 = ut0Var.f28559r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.h(1, ut0Var.v.f30446t1[i10].f26512a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    yu0 yu0Var = ut0Var.v;
                    if (yu0Var.f30425j1 == yu0Var.f30450v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    ut0Var.F(id2, str2, dialogId, j3);
                } else if (ut0Var.f28559r == 3) {
                    yu0 yu0Var2 = ut0Var.v;
                    ut0Var.F(0, str2, yu0Var2.f30425j1, yu0Var2.F);
                }
                int i15 = ut0Var.f28559r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(ut0Var.v.f30446t1[ut0Var.f28559r].f26512a);
                    ut0Var.f28560s++;
                    Utilities.searchQueue.postRunnable(new fr0(ut0Var, str2, arrayList3, 5));
                    return;
                }
                return;
            case 4:
                ut0 ut0Var2 = (ut0) this.f22494b;
                ArrayList arrayList4 = (ArrayList) this.f22495c;
                yu0 yu0Var3 = ut0Var2.v;
                boolean z10 = yu0Var3.V0;
                rt0[] rt0VarArr = yu0Var3.f30426k0;
                if (z10) {
                    ut0Var2.f28560s--;
                    int h = ut0Var2.h();
                    ut0Var2.d = arrayList4;
                    int h10 = ut0Var2.h();
                    if (ut0Var2.f28560s == 0 || h10 != 0) {
                        yu0Var3.m1(false);
                    }
                    for (int i16 = 0; i16 < rt0VarArr.length; i16++) {
                        rt0 rt0Var2 = rt0VarArr[i16];
                        if (rt0Var2.F == ut0Var2.f28559r) {
                            if (ut0Var2.f28560s == 0 && h10 == 0) {
                                rt0Var2.f27730w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                rt0VarArr[i16].f27730w.f30080f.setVisibility(8);
                                rt0VarArr[i16].f27730w.e(false, true);
                            } else if (h == 0) {
                                yu0Var3.z(rt0Var2.h, 0, null);
                            }
                        }
                    }
                    ut0Var2.l();
                    return;
                }
                return;
            case 5:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i17 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i17, bool, (TLObject) this.f22494b, (TLRPC.Document) this.f22495c, null, bool);
                return;
            case 6:
                MessagesController.getInstance(((hy0) this.f22494b).f24830a.f26288a).updateEmojiStatus((TLRPC.EmojiStatus) this.f22495c);
                return;
            case 7:
                w21 w21Var = (w21) this.f22494b;
                MessagesController.getInstance(w21Var.f29479b).getTopicsController().deleteTopics(-w21Var.f29481c, (ArrayList) this.f22495c);
                int i18 = w21.f29476f0;
                return;
            case 8:
                w21 w21Var2 = (w21) this.f22494b;
                w21Var2.getClass();
                MessagesController.getInstance(w21Var2.f29479b).loadFullChat(((TLRPC.Updates) this.f22495c).chats.get(0).f18083id, 0, true);
                return;
            case 9:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f22494b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f22495c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    k1Var.d0(i12);
                    return;
                }
                return;
            case 10:
                u31.o((u31) this.f22494b, (TLObject) this.f22495c);
                return;
            case 11:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f22494b;
                String str3 = (String) this.f22495c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f22494b;
                ((org.telegram.ui.ActionBar.n1) this.f22495c).d(true);
                l41.a(wkVar.getContext(), wkVar.d);
                return;
            case 13:
                ((TranslateController) this.f22495c).setHideTranslateDialog(((org.telegram.ui.wk) this.f22494b).f25807b, false);
                return;
            case 14:
                UndoView undoView = (UndoView) this.f22494b;
                TLObject tLObject = (TLObject) this.f22495c;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.f22210s.presentFragment(new org.telegram.ui.qo0((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                int i19 = UndoView.f22199e0;
                undoView.getClass();
                return;
            case 15:
                ((h51) this.f22494b).D.onClick((org.telegram.ui.Cells.w8) this.f22495c);
                return;
            case 16:
                f71 f71Var = (f71) this.f22494b;
                b2.u0 u0Var = (b2.u0) this.f22495c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = f71.f23880l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = f71Var.N;
                    if (arrayList5 != null) {
                        int i20 = 0;
                        while (i20 < arrayList5.size()) {
                            b71 b71Var = (b71) arrayList5.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList6 = b71Var.d;
                                if (i21 < arrayList6.size()) {
                                    d71 d71Var = (d71) arrayList6.get(i21);
                                    if (!TextUtils.isEmpty(d71Var.f23309m) && !f71.Y(d71Var.f23309m)) {
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
                    f71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        f71Var.F(arrayList2, f71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = f71Var.f23894n;
                if (textureView != null && ((!f71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    f71Var.E = true;
                    if (f71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(f71Var.f23894n);
                            viewGroup.removeView(f71Var.f23894n);
                            viewGroup.addView(f71Var.f23894n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = f71Var.f23883b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new w61(f71Var, 0));
                            return;
                        }
                        i2.f0 f0Var = f71Var.d;
                        TextureView textureView2 = f71Var.f23894n;
                        f0Var.B1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.B1();
                            f0Var.o1();
                            f0Var.t1(null);
                            f0Var.m1(0, 0);
                        }
                        f71Var.d.v1(f71Var.f23894n);
                        ArrayList arrayList7 = f71Var.N;
                        if (arrayList7 != null) {
                            f71Var.F(arrayList7, f71Var.O);
                        } else if (f71Var.U) {
                            f71Var.G(f71Var.Q, f71Var.S, f71Var.R, f71Var.T);
                        } else {
                            f71Var.D(f71Var.Q, f71Var.S);
                        }
                        f71Var.C();
                        return;
                    }
                    return;
                }
                f71Var.J.onError(f71Var, u0Var);
                return;
            case 17:
                ((e71) this.f22494b).f23592f.K.onVisualizerUpdate(true, true, (float[]) this.f22495c);
                return;
            case 18:
                m71 m71Var = (m71) this.f22494b;
                Bitmap bitmap = (Bitmap) this.f22495c;
                if (bitmap != null) {
                    if (m71Var.f26125w != null) {
                        Bitmap bitmap2 = m71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        m71Var.v = m71Var.f26125w;
                    }
                    m71Var.f26125w = bitmap;
                    Bitmap bitmap3 = m71Var.f26125w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    m71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(m71Var.L);
                    m71Var.J.setShader(m71Var.G);
                    m71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = m71Var.getLayoutParams();
                    if (m71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        m71Var.setVisibility(0);
                        m71Var.requestLayout();
                    }
                }
                m71Var.f26119f = null;
                return;
            case 19:
                final a91 a91Var = (a91) this.f22494b;
                a91Var.e.f22621b.evaluateJavascript((String) this.f22495c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        a91 a91Var2 = a91.this;
                        String[] strArr = a91Var2.f22395c;
                        String str5 = strArr[0];
                        String str6 = a91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        a91Var2.f22394b.countDown();
                    }
                });
                return;
            case 20:
                ((org.telegram.ui.Components.voip.k) this.f22494b).f28999a.setOnClickListener((View.OnClickListener) this.f22495c);
                return;
            case 21:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f22494b;
                Bitmap bitmap4 = (Bitmap) this.f22495c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29239w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 22:
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f22495c;
                ((org.telegram.ui.Components.voip.m0) this.f22494b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            case 23:
                ml0 ml0Var2 = (ml0) this.f22494b;
                Object obj = this.f22495c;
                if (ml0Var2 != null) {
                    ml0Var2.setOnItemClickListener((al0) obj);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.vt vtVar = (org.telegram.ui.vt) this.f22494b;
                String lowerCase = ((String) this.f22495c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ar0(25, vtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = vtVar.f38476f;
                int size = arrayList9.size();
                while (i13 < size) {
                    Object obj2 = arrayList9.get(i13);
                    i13++;
                    org.telegram.ui.st stVar = (org.telegram.ui.st) obj2;
                    String str4 = stVar.f37415a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(stVar.f37415a).toLowerCase();
                    String str6 = stVar.f37416b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(stVar.f37416b).toLowerCase();
                    String str7 = stVar.f37417c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        str5 = "+".concat(str7);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList9;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.z0.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.z0.w(" ", translitSafe, lowerCase5) && !str7.startsWith(lowerCase) && !str5.startsWith(lowerCase)) {
                            arrayList9 = arrayList;
                        }
                    } else {
                        arrayList = arrayList9;
                    }
                    arrayList8.add(stVar);
                    arrayList9 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new ar0(25, vtVar, arrayList8));
                return;
            case 25:
                org.telegram.ui.vt vtVar2 = (org.telegram.ui.vt) this.f22494b;
                ArrayList arrayList10 = (ArrayList) this.f22495c;
                org.telegram.ui.xt xtVar = vtVar2.h;
                if (xtVar.f39658f) {
                    vtVar2.e = arrayList10;
                    if (xtVar.e && (ml0Var = xtVar.f39655a) != null) {
                        s4.h0 adapter = ml0Var.getAdapter();
                        org.telegram.ui.vt vtVar3 = xtVar.d;
                        if (adapter != vtVar3) {
                            xtVar.f39655a.setAdapter(vtVar3);
                            xtVar.f39655a.setFastScrollVisible(false);
                        }
                    }
                    vtVar2.l();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.zt.P((org.telegram.ui.zt) this.f22494b, (TLRPC.Updates) this.f22495c);
                return;
            case 27:
                org.telegram.ui.ry.d0((org.telegram.ui.ry) this.f22494b, (String) this.f22495c);
                return;
            case 28:
                ei.k3.j(((org.telegram.ui.ry) this.f22494b).currentAccount, ((TLRPC.TL_attachMenuBot) this.f22495c).bot_id, null);
                return;
            default:
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.f22494b;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f22495c;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mv(ryVar, 24), 300L);
                return;
        }
    }

    public ar0(w21 w21Var, ArrayList arrayList, th thVar) {
        this.f22493a = 7;
        this.f22494b = w21Var;
        this.f22495c = arrayList;
    }
}
