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
    public final int f30727a;
    public final Object f30728b;
    public final Object f30729c;

    public yn0(int i10, Object obj, Object obj2) {
        this.f30727a = i10;
        this.f30728b = obj;
        this.f30729c = obj2;
    }

    @Override
    public final void run() {
        int indexOf;
        int L;
        int i10;
        long j3;
        int i11;
        String str;
        int i12 = 2;
        ArrayList arrayList = null;
        switch (this.f30727a) {
            case 0:
                go0 go0Var = (go0) this.f30728b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f30729c;
                ArrayList arrayList2 = go0Var.K;
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(tL_sponsoredPeer)) >= 0 && (L = go0Var.L()) < go0Var.h()) {
                    arrayList2.remove(indexOf);
                    go0Var.u(L + 1 + indexOf);
                    int size = go0Var.f9754j0.e.size();
                    int size2 = arrayList2.size();
                    if (go0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        go0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((go0) this.f30728b).T();
                yc.a0((org.telegram.ui.qy) this.f30729c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                ((ro0) this.f30728b).sendAccessibilityEvent((View) this.f30729c, 4);
                return;
            case 3:
                ff ffVar = (ff) this.f30728b;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.f30729c;
                if (wnVar != null) {
                    wnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ffVar.dismiss();
                    return;
                }
                return;
            case 4:
                ((WindowManager) this.f30729c).removeView(((ff) this.f30728b).B);
                return;
            case 5:
                wq0 wq0Var = (wq0) this.f30728b;
                TLObject tLObject = (TLObject) this.f30729c;
                if (tLObject != null) {
                    wq0Var.f30131k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    wq0Var.Z0();
                    if (wq0Var.m0) {
                        wq0Var.M0();
                    }
                }
                wq0Var.f30132l0 = false;
                return;
            case 6:
                eu0 eu0Var = (eu0) this.f30728b;
                dr0 dr0Var = (dr0) this.f30729c;
                eu0Var.G = null;
                eu0Var.H = null;
                dr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new hd0(dr0Var, 14)).start();
                return;
            case 7:
                ai.e9 e9Var = (ai.e9) this.f30729c;
                gs0 gs0Var = ((lv0) this.f30728b).W;
                if (gs0Var != null) {
                    int i13 = e9Var.f854a;
                    gs0Var.f37566n.d(i13, gs0Var.f37568s.i(i13));
                    return;
                }
                return;
            case 8:
                yc.a0(((ut0) this.f30728b).f28887f.f26154v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f30729c).title)).k(true);
                return;
            case 9:
                hu0 hu0Var = (hu0) this.f30728b;
                String str2 = (String) this.f30729c;
                if (!hu0Var.v.f26150t1[hu0Var.f24889r].f22728a.isEmpty() && ((i10 = hu0Var.f24889r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, hu0Var.v.f26150t1[i10].f22728a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    lv0 lv0Var = hu0Var.v;
                    if (lv0Var.f26129j1 == lv0Var.f26154v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    hu0Var.F(id2, str2, dialogId, j3);
                } else if (hu0Var.f24889r == 3) {
                    lv0 lv0Var2 = hu0Var.v;
                    hu0Var.F(0, str2, lv0Var2.f26129j1, lv0Var2.F);
                }
                int i14 = hu0Var.f24889r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(hu0Var.v.f26150t1[hu0Var.f24889r].f22728a);
                    hu0Var.f24890s++;
                    Utilities.searchQueue.postRunnable(new en0((Object) hu0Var, (Serializable) str2, arrayList3, 8));
                    return;
                }
                return;
            case 10:
                hu0 hu0Var2 = (hu0) this.f30728b;
                ArrayList arrayList4 = (ArrayList) this.f30729c;
                lv0 lv0Var3 = hu0Var2.v;
                boolean z10 = lv0Var3.V0;
                eu0[] eu0VarArr = lv0Var3.f26130k0;
                if (z10) {
                    hu0Var2.f24890s--;
                    int h = hu0Var2.h();
                    hu0Var2.d = arrayList4;
                    int h10 = hu0Var2.h();
                    if (hu0Var2.f24890s == 0 || h10 != 0) {
                        lv0Var3.m1(false);
                    }
                    for (int i15 = 0; i15 < eu0VarArr.length; i15++) {
                        eu0 eu0Var2 = eu0VarArr[i15];
                        if (eu0Var2.F == hu0Var2.f24889r) {
                            if (hu0Var2.f24890s == 0 && h10 == 0) {
                                eu0Var2.f24069w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                eu0VarArr[i15].f24069w.f25845f.setVisibility(8);
                                eu0VarArr[i15].f24069w.e(false, true);
                            } else if (h == 0) {
                                lv0Var3.z(eu0Var2.h, 0, null);
                            }
                        }
                    }
                    hu0Var2.l();
                    return;
                }
                return;
            case 11:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f30728b, (TLRPC.Document) this.f30729c, null, bool);
                return;
            case 12:
                MessagesController.getInstance(((uy0) this.f30728b).f28897a.f31000a).updateEmojiStatus((TLRPC.EmojiStatus) this.f30729c);
                return;
            case 13:
                m31 m31Var = (m31) this.f30728b;
                MessagesController.getInstance(m31Var.f26270b).getTopicsController().deleteTopics(-m31Var.f26272c, (ArrayList) this.f30729c);
                int i17 = m31.f26267f0;
                return;
            case 14:
                m31 m31Var2 = (m31) this.f30728b;
                m31Var2.getClass();
                MessagesController.getInstance(m31Var2.f26270b).loadFullChat(((TLRPC.Updates) this.f30729c).chats.get(0).f18337id, 0, true);
                return;
            case 15:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f30728b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f30729c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 16:
                k41.o((k41) this.f30728b, (TLObject) this.f30729c);
                return;
            case 17:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f30728b;
                String str3 = (String) this.f30729c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f30728b;
                ((org.telegram.ui.ActionBar.m1) this.f30729c).d(true);
                b51.a(wkVar.getContext(), wkVar.d);
                return;
            case 19:
                ((TranslateController) this.f30729c).setHideTranslateDialog(((org.telegram.ui.wk) this.f30728b).f22853b, false);
                return;
            case 20:
                UndoView undoView = (UndoView) this.f30728b;
                TLObject tLObject2 = (TLObject) this.f30729c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f22463s.presentFragment(new org.telegram.ui.oo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f22452e0;
                undoView.getClass();
                return;
            case 21:
                ((x51) this.f30728b).D.onClick((org.telegram.ui.Cells.v8) this.f30729c);
                return;
            case 22:
                u71 u71Var = (u71) this.f30728b;
                b2.u0 u0Var = (b2.u0) this.f30729c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = u71.f28763l0;
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
                                    if (!TextUtils.isEmpty(s71Var.f28158m) && !u71.Y(s71Var.f28158m)) {
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
                        arrayList = arrayList5;
                    }
                    u71Var.N = arrayList;
                    if (arrayList != null) {
                        u71Var.F(arrayList, u71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = u71Var.f28777n;
                if (textureView != null && ((!u71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    u71Var.E = true;
                    if (u71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(u71Var.f28777n);
                            viewGroup.removeView(u71Var.f28777n);
                            viewGroup.addView(u71Var.f28777n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = u71Var.f28766b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new i71(u71Var, 1));
                            return;
                        }
                        i2.f0 f0Var = u71Var.d;
                        TextureView textureView2 = u71Var.f28777n;
                        f0Var.B1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.B1();
                            f0Var.o1();
                            f0Var.t1(null);
                            f0Var.m1(0, 0);
                        }
                        u71Var.d.v1(u71Var.f28777n);
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
            case 23:
                ((t71) this.f30728b).f28491f.K.onVisualizerUpdate(true, true, (float[]) this.f30729c);
                return;
            case 24:
                c81 c81Var = (c81) this.f30728b;
                Bitmap bitmap = (Bitmap) this.f30729c;
                if (bitmap != null) {
                    if (c81Var.f23223w != null) {
                        Bitmap bitmap2 = c81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        c81Var.v = c81Var.f23223w;
                    }
                    c81Var.f23223w = bitmap;
                    Bitmap bitmap3 = c81Var.f23223w;
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
                c81Var.f23217f = null;
                return;
            case 25:
                final p91 p91Var = (p91) this.f30728b;
                p91Var.e.f27602b.evaluateJavascript((String) this.f30729c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        p91 p91Var2 = p91.this;
                        String[] strArr = p91Var2.f27303c;
                        String str5 = strArr[0];
                        String str6 = p91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        p91Var2.f27302b.countDown();
                    }
                });
                return;
            case 26:
                ((org.telegram.ui.Components.voip.k) this.f30728b).f29324a.setOnClickListener((View.OnClickListener) this.f30729c);
                return;
            case 27:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f30728b;
                Bitmap bitmap4 = (Bitmap) this.f30729c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29582w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 28:
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f30729c;
                ((org.telegram.ui.Components.voip.m0) this.f30728b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            default:
                yl0 yl0Var = (yl0) this.f30728b;
                Object obj = this.f30729c;
                if (yl0Var != null) {
                    yl0Var.setOnItemClickListener((ml0) obj);
                    return;
                }
                return;
        }
    }

    public yn0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30727a = i10;
        this.f30728b = obj;
        this.f30729c = obj2;
    }
}
