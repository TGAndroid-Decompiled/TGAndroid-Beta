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
    public final int f22462a;
    public final Object f22463b;
    public final Object f22464c;

    public ar0(int i10, Object obj, Object obj2) {
        this.f22462a = i10;
        this.f22463b = obj;
        this.f22464c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        long j3;
        int i11;
        String str;
        ArrayList arrayList;
        ll0 ll0Var;
        int i12 = 2;
        ArrayList arrayList2 = null;
        int i13 = 0;
        switch (this.f22462a) {
            case 0:
                rt0 rt0Var = (rt0) this.f22463b;
                oq0 oq0Var = (oq0) this.f22464c;
                rt0Var.G = null;
                rt0Var.H = null;
                oq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new jd0(oq0Var, 13)).start();
                return;
            case 1:
                ai.e9 e9Var = (ai.e9) this.f22464c;
                tr0 tr0Var = ((yu0) this.f22463b).W;
                if (tr0Var != null) {
                    int i14 = e9Var.f770a;
                    tr0Var.f32636n.d(i14, tr0Var.f32638s.i(i14));
                    return;
                }
                return;
            case 2:
                vc.a0(((ht0) this.f22463b).f24807f.f30389v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f22464c).title)).k(true);
                return;
            case 3:
                ut0 ut0Var = (ut0) this.f22463b;
                String str2 = (String) this.f22464c;
                if (!ut0Var.v.f30385t1[ut0Var.f28507r].f26575a.isEmpty() && ((i10 = ut0Var.f28507r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.h(1, ut0Var.v.f30385t1[i10].f26575a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    yu0 yu0Var = ut0Var.v;
                    if (yu0Var.f30364j1 == yu0Var.f30389v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    ut0Var.F(id2, str2, dialogId, j3);
                } else if (ut0Var.f28507r == 3) {
                    yu0 yu0Var2 = ut0Var.v;
                    ut0Var.F(0, str2, yu0Var2.f30364j1, yu0Var2.F);
                }
                int i15 = ut0Var.f28507r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(ut0Var.v.f30385t1[ut0Var.f28507r].f26575a);
                    ut0Var.f28508s++;
                    Utilities.searchQueue.postRunnable(new fr0(ut0Var, str2, arrayList3, 5));
                    return;
                }
                return;
            case 4:
                ut0 ut0Var2 = (ut0) this.f22463b;
                ArrayList arrayList4 = (ArrayList) this.f22464c;
                yu0 yu0Var3 = ut0Var2.v;
                boolean z10 = yu0Var3.V0;
                rt0[] rt0VarArr = yu0Var3.f30365k0;
                if (z10) {
                    ut0Var2.f28508s--;
                    int h = ut0Var2.h();
                    ut0Var2.d = arrayList4;
                    int h10 = ut0Var2.h();
                    if (ut0Var2.f28508s == 0 || h10 != 0) {
                        yu0Var3.m1(false);
                    }
                    for (int i16 = 0; i16 < rt0VarArr.length; i16++) {
                        rt0 rt0Var2 = rt0VarArr[i16];
                        if (rt0Var2.F == ut0Var2.f28507r) {
                            if (ut0Var2.f28508s == 0 && h10 == 0) {
                                rt0Var2.f27687w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                rt0VarArr[i16].f27687w.f30418f.setVisibility(8);
                                rt0VarArr[i16].f27687w.e(false, true);
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
                notificationCenter.postNotificationNameOnUIThread(i17, bool, (TLObject) this.f22463b, (TLRPC.Document) this.f22464c, null, bool);
                return;
            case 6:
                MessagesController.getInstance(((iy0) this.f22463b).f25165a.f26613a).updateEmojiStatus((TLRPC.EmojiStatus) this.f22464c);
                return;
            case 7:
                x21 x21Var = (x21) this.f22463b;
                MessagesController.getInstance(x21Var.f29868b).getTopicsController().deleteTopics(-x21Var.f29870c, (ArrayList) this.f22464c);
                int i18 = x21.f29865f0;
                return;
            case 8:
                x21 x21Var2 = (x21) this.f22463b;
                x21Var2.getClass();
                MessagesController.getInstance(x21Var2.f29868b).loadFullChat(((TLRPC.Updates) this.f22464c).chats.get(0).f18109id, 0, true);
                return;
            case 9:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f22463b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f22464c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    k1Var.d0(i12);
                    return;
                }
                return;
            case 10:
                v31.o((v31) this.f22463b, (TLObject) this.f22464c);
                return;
            case 11:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f22463b;
                String str3 = (String) this.f22464c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.f22463b;
                ((org.telegram.ui.ActionBar.n1) this.f22464c).d(true);
                m41.a(zkVar.getContext(), zkVar.d);
                return;
            case 13:
                ((TranslateController) this.f22464c).setHideTranslateDialog(((org.telegram.ui.zk) this.f22463b).f26064b, false);
                return;
            case 14:
                UndoView undoView = (UndoView) this.f22463b;
                TLObject tLObject = (TLObject) this.f22464c;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.f22236s.presentFragment(new org.telegram.ui.wo0((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                int i19 = UndoView.f22225e0;
                undoView.getClass();
                return;
            case 15:
                ((i51) this.f22463b).D.onClick((org.telegram.ui.Cells.v8) this.f22464c);
                return;
            case 16:
                g71 g71Var = (g71) this.f22463b;
                b2.u0 u0Var = (b2.u0) this.f22464c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = g71.f24223l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = g71Var.N;
                    if (arrayList5 != null) {
                        int i20 = 0;
                        while (i20 < arrayList5.size()) {
                            c71 c71Var = (c71) arrayList5.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList6 = c71Var.d;
                                if (i21 < arrayList6.size()) {
                                    e71 e71Var = (e71) arrayList6.get(i21);
                                    if (!TextUtils.isEmpty(e71Var.f23574m) && !g71.Y(e71Var.f23574m)) {
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
                    g71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        g71Var.F(arrayList2, g71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = g71Var.f24237n;
                if (textureView != null && ((!g71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    g71Var.E = true;
                    if (g71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(g71Var.f24237n);
                            viewGroup.removeView(g71Var.f24237n);
                            viewGroup.addView(g71Var.f24237n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = g71Var.f24226b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new x61(g71Var, 0));
                            return;
                        }
                        i2.e0 e0Var = g71Var.d;
                        TextureView textureView2 = g71Var.f24237n;
                        e0Var.B1();
                        if (textureView2 != null && textureView2 == e0Var.V) {
                            e0Var.B1();
                            e0Var.o1();
                            e0Var.t1(null);
                            e0Var.m1(0, 0);
                        }
                        g71Var.d.v1(g71Var.f24237n);
                        ArrayList arrayList7 = g71Var.N;
                        if (arrayList7 != null) {
                            g71Var.F(arrayList7, g71Var.O);
                        } else if (g71Var.U) {
                            g71Var.G(g71Var.Q, g71Var.S, g71Var.R, g71Var.T);
                        } else {
                            g71Var.D(g71Var.Q, g71Var.S);
                        }
                        g71Var.C();
                        return;
                    }
                    return;
                }
                g71Var.J.onError(g71Var, u0Var);
                return;
            case 17:
                ((f71) this.f22463b).f23844f.K.onVisualizerUpdate(true, true, (float[]) this.f22464c);
                return;
            case 18:
                n71 n71Var = (n71) this.f22463b;
                Bitmap bitmap = (Bitmap) this.f22464c;
                if (bitmap != null) {
                    if (n71Var.f26388w != null) {
                        Bitmap bitmap2 = n71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        n71Var.v = n71Var.f26388w;
                    }
                    n71Var.f26388w = bitmap;
                    Bitmap bitmap3 = n71Var.f26388w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    n71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(n71Var.L);
                    n71Var.J.setShader(n71Var.G);
                    n71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = n71Var.getLayoutParams();
                    if (n71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        n71Var.setVisibility(0);
                        n71Var.requestLayout();
                    }
                }
                n71Var.f26382f = null;
                return;
            case 19:
                final b91 b91Var = (b91) this.f22463b;
                b91Var.e.f23017b.evaluateJavascript((String) this.f22464c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        b91 b91Var2 = b91.this;
                        String[] strArr = b91Var2.f22719c;
                        String str5 = strArr[0];
                        String str6 = b91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        b91Var2.f22718b.countDown();
                    }
                });
                return;
            case 20:
                ((org.telegram.ui.Components.voip.k) this.f22463b).f29025a.setOnClickListener((View.OnClickListener) this.f22464c);
                return;
            case 21:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f22463b;
                Bitmap bitmap4 = (Bitmap) this.f22464c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29265w;
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
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f22464c;
                ((org.telegram.ui.Components.voip.m0) this.f22463b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            case 23:
                ll0 ll0Var2 = (ll0) this.f22463b;
                Object obj = this.f22464c;
                if (ll0Var2 != null) {
                    ll0Var2.setOnItemClickListener((zk0) obj);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.yt ytVar = (org.telegram.ui.yt) this.f22463b;
                String lowerCase = ((String) this.f22464c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ar0(25, ytVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = ytVar.f39958f;
                int size = arrayList9.size();
                while (i13 < size) {
                    Object obj2 = arrayList9.get(i13);
                    i13++;
                    org.telegram.ui.vt vtVar = (org.telegram.ui.vt) obj2;
                    String str4 = vtVar.f38616a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(vtVar.f38616a).toLowerCase();
                    String str6 = vtVar.f38617b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(vtVar.f38617b).toLowerCase();
                    String str7 = vtVar.f38618c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        str5 = "+".concat(str7);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList9;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.y0.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.y0.w(" ", translitSafe, lowerCase5) && !str7.startsWith(lowerCase) && !str5.startsWith(lowerCase)) {
                            arrayList9 = arrayList;
                        }
                    } else {
                        arrayList = arrayList9;
                    }
                    arrayList8.add(vtVar);
                    arrayList9 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new ar0(25, ytVar, arrayList8));
                return;
            case 25:
                org.telegram.ui.yt ytVar2 = (org.telegram.ui.yt) this.f22463b;
                ArrayList arrayList10 = (ArrayList) this.f22464c;
                org.telegram.ui.au auVar = ytVar2.h;
                if (auVar.f31936f) {
                    ytVar2.e = arrayList10;
                    if (auVar.e && (ll0Var = auVar.f31933a) != null) {
                        s4.h0 adapter = ll0Var.getAdapter();
                        org.telegram.ui.yt ytVar3 = auVar.d;
                        if (adapter != ytVar3) {
                            auVar.f31933a.setAdapter(ytVar3);
                            auVar.f31933a.setFastScrollVisible(false);
                        }
                    }
                    ytVar2.l();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.cu.P((org.telegram.ui.cu) this.f22463b, (TLRPC.Updates) this.f22464c);
                return;
            case 27:
                org.telegram.ui.uy.e0((org.telegram.ui.uy) this.f22463b, (String) this.f22464c);
                return;
            case 28:
                ei.k3.j(((org.telegram.ui.uy) this.f22463b).currentAccount, ((TLRPC.TL_attachMenuBot) this.f22464c).bot_id, null);
                return;
            default:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f22463b;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f22464c;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.pv(uyVar, 24), 300L);
                return;
        }
    }

    public ar0(x21 x21Var, ArrayList arrayList, sh shVar) {
        this.f22462a = 7;
        this.f22463b = x21Var;
        this.f22464c = arrayList;
    }
}
