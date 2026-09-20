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
public final class wn0 implements Runnable {
    public final int f30072a;
    public final Object f30073b;
    public final Object f30074c;

    public wn0(int i10, Object obj, Object obj2) {
        this.f30072a = i10;
        this.f30073b = obj;
        this.f30074c = obj2;
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
        switch (this.f30072a) {
            case 0:
                eo0 eo0Var = (eo0) this.f30073b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f30074c;
                ArrayList arrayList2 = eo0Var.K;
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(tL_sponsoredPeer)) >= 0 && (L = eo0Var.L()) < eo0Var.h()) {
                    arrayList2.remove(indexOf);
                    eo0Var.u(L + 1 + indexOf);
                    int size = eo0Var.f9773j0.e.size();
                    int size2 = arrayList2.size();
                    if (eo0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        eo0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((eo0) this.f30073b).T();
                xc.a0((org.telegram.ui.uy) this.f30074c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                ((po0) this.f30073b).sendAccessibilityEvent((View) this.f30074c, 4);
                return;
            case 3:
                ef efVar = (ef) this.f30073b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f30074c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    return;
                }
                return;
            case 4:
                ((WindowManager) this.f30074c).removeView(((ef) this.f30073b).B);
                return;
            case 5:
                uq0 uq0Var = (uq0) this.f30073b;
                TLObject tLObject = (TLObject) this.f30074c;
                if (tLObject != null) {
                    uq0Var.f28817k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    uq0Var.Z0();
                    if (uq0Var.m0) {
                        uq0Var.M0();
                    }
                }
                uq0Var.f28818l0 = false;
                return;
            case 6:
                cu0 cu0Var = (cu0) this.f30073b;
                br0 br0Var = (br0) this.f30074c;
                cu0Var.G = null;
                cu0Var.H = null;
                br0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new dd0(br0Var, 14)).start();
                return;
            case 7:
                ai.e9 e9Var = (ai.e9) this.f30074c;
                es0 es0Var = ((jv0) this.f30073b).W;
                if (es0Var != null) {
                    int i13 = e9Var.f773a;
                    es0Var.f31963n.d(i13, es0Var.f31965s.i(i13));
                    return;
                }
                return;
            case 8:
                xc.a0(((st0) this.f30073b).f28213f.f25528v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f30074c).title)).k(true);
                return;
            case 9:
                fu0 fu0Var = (fu0) this.f30073b;
                String str2 = (String) this.f30074c;
                if (!fu0Var.v.f25524t1[fu0Var.f24191r].f30612a.isEmpty() && ((i10 = fu0Var.f24191r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.k0.g(1, fu0Var.v.f25524t1[i10].f30612a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    jv0 jv0Var = fu0Var.v;
                    if (jv0Var.f25503j1 == jv0Var.f25528v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    fu0Var.F(id2, str2, dialogId, j3);
                } else if (fu0Var.f24191r == 3) {
                    jv0 jv0Var2 = fu0Var.v;
                    fu0Var.F(0, str2, jv0Var2.f25503j1, jv0Var2.F);
                }
                int i14 = fu0Var.f24191r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(fu0Var.v.f25524t1[fu0Var.f24191r].f30612a);
                    fu0Var.f24192s++;
                    Utilities.searchQueue.postRunnable(new cn0((Object) fu0Var, (Serializable) str2, arrayList3, 8));
                    return;
                }
                return;
            case 10:
                fu0 fu0Var2 = (fu0) this.f30073b;
                ArrayList arrayList4 = (ArrayList) this.f30074c;
                jv0 jv0Var3 = fu0Var2.v;
                boolean z10 = jv0Var3.V0;
                cu0[] cu0VarArr = jv0Var3.f25504k0;
                if (z10) {
                    fu0Var2.f24192s--;
                    int h = fu0Var2.h();
                    fu0Var2.d = arrayList4;
                    int h10 = fu0Var2.h();
                    if (fu0Var2.f24192s == 0 || h10 != 0) {
                        jv0Var3.m1(false);
                    }
                    for (int i15 = 0; i15 < cu0VarArr.length; i15++) {
                        cu0 cu0Var2 = cu0VarArr[i15];
                        if (cu0Var2.F == fu0Var2.f24191r) {
                            if (fu0Var2.f24192s == 0 && h10 == 0) {
                                cu0Var2.f23409w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                cu0VarArr[i15].f23409w.f25551f.setVisibility(8);
                                cu0VarArr[i15].f23409w.e(false, true);
                            } else if (h == 0) {
                                jv0Var3.z(cu0Var2.h, 0, null);
                            }
                        }
                    }
                    fu0Var2.l();
                    return;
                }
                return;
            case 11:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f30073b, (TLRPC.Document) this.f30074c, null, bool);
                return;
            case 12:
                MessagesController.getInstance(((ty0) this.f30073b).f28480a.f30638a).updateEmojiStatus((TLRPC.EmojiStatus) this.f30074c);
                return;
            case 13:
                l31 l31Var = (l31) this.f30073b;
                MessagesController.getInstance(l31Var.f26012b).getTopicsController().deleteTopics(-l31Var.f26014c, (ArrayList) this.f30074c);
                int i17 = l31.f26009f0;
                return;
            case 14:
                l31 l31Var2 = (l31) this.f30073b;
                l31Var2.getClass();
                MessagesController.getInstance(l31Var2.f26012b).loadFullChat(((TLRPC.Updates) this.f30074c).chats.get(0).f18328id, 0, true);
                return;
            case 15:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f30073b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f30074c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 16:
                j41.o((j41) this.f30073b, (TLObject) this.f30074c);
                return;
            case 17:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f30073b;
                String str3 = (String) this.f30074c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this.f30073b;
                ((org.telegram.ui.ActionBar.n1) this.f30074c).d(true);
                a51.a(ykVar.getContext(), ykVar.d);
                return;
            case 19:
                ((TranslateController) this.f30074c).setHideTranslateDialog(((org.telegram.ui.yk) this.f30073b).f22525b, false);
                return;
            case 20:
                UndoView undoView = (UndoView) this.f30073b;
                TLObject tLObject2 = (TLObject) this.f30074c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f22460s.presentFragment(new org.telegram.ui.xo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f22449e0;
                undoView.getClass();
                return;
            case 21:
                ((w51) this.f30073b).D.onClick((org.telegram.ui.Cells.w8) this.f30074c);
                return;
            case 22:
                t71 t71Var = (t71) this.f30073b;
                b2.u0 u0Var = (b2.u0) this.f30074c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = t71.f28317l0;
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
                                    if (!TextUtils.isEmpty(r71Var.f27802m) && !t71.Y(r71Var.f27802m)) {
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
                    t71Var.N = arrayList;
                    if (arrayList != null) {
                        t71Var.F(arrayList, t71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = t71Var.f28331n;
                if (textureView != null && ((!t71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    t71Var.E = true;
                    if (t71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(t71Var.f28331n);
                            viewGroup.removeView(t71Var.f28331n);
                            viewGroup.addView(t71Var.f28331n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = t71Var.f28320b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new l71(t71Var, 0));
                            return;
                        }
                        i2.e0 e0Var = t71Var.d;
                        TextureView textureView2 = t71Var.f28331n;
                        e0Var.B1();
                        if (textureView2 != null && textureView2 == e0Var.V) {
                            e0Var.B1();
                            e0Var.o1();
                            e0Var.t1(null);
                            e0Var.m1(0, 0);
                        }
                        t71Var.d.v1(t71Var.f28331n);
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
            case 23:
                ((s71) this.f30073b).f28073f.K.onVisualizerUpdate(true, true, (float[]) this.f30074c);
                return;
            case 24:
                b81 b81Var = (b81) this.f30073b;
                Bitmap bitmap = (Bitmap) this.f30074c;
                if (bitmap != null) {
                    if (b81Var.f22925w != null) {
                        Bitmap bitmap2 = b81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        b81Var.v = b81Var.f22925w;
                    }
                    b81Var.f22925w = bitmap;
                    Bitmap bitmap3 = b81Var.f22925w;
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
                b81Var.f22919f = null;
                return;
            case 25:
                final o91 o91Var = (o91) this.f30073b;
                o91Var.e.f27213b.evaluateJavascript((String) this.f30074c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        o91 o91Var2 = o91.this;
                        String[] strArr = o91Var2.f26866c;
                        String str5 = strArr[0];
                        String str6 = o91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        o91Var2.f26865b.countDown();
                    }
                });
                return;
            case 26:
                ((org.telegram.ui.Components.voip.k) this.f30073b).f29431a.setOnClickListener((View.OnClickListener) this.f30074c);
                return;
            case 27:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f30073b;
                Bitmap bitmap4 = (Bitmap) this.f30074c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29671w;
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
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f30074c;
                ((org.telegram.ui.Components.voip.m0) this.f30073b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            default:
                vl0 vl0Var = (vl0) this.f30073b;
                Object obj = this.f30074c;
                if (vl0Var != null) {
                    vl0Var.setOnItemClickListener((jl0) obj);
                    return;
                }
                return;
        }
    }

    public wn0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30072a = i10;
        this.f30073b = obj;
        this.f30074c = obj2;
    }
}
