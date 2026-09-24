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
    public final int f30123a;
    public final Object f30124b;
    public final Object f30125c;

    public wn0(int i10, Object obj, Object obj2) {
        this.f30123a = i10;
        this.f30124b = obj;
        this.f30125c = obj2;
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
        switch (this.f30123a) {
            case 0:
                eo0 eo0Var = (eo0) this.f30124b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f30125c;
                ArrayList arrayList2 = eo0Var.K;
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(tL_sponsoredPeer)) >= 0 && (L = eo0Var.L()) < eo0Var.h()) {
                    arrayList2.remove(indexOf);
                    eo0Var.u(L + 1 + indexOf);
                    int size = eo0Var.f9754j0.e.size();
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
                ((eo0) this.f30124b).T();
                yc.a0((org.telegram.ui.qy) this.f30125c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 2:
                ((po0) this.f30124b).sendAccessibilityEvent((View) this.f30125c, 4);
                return;
            case 3:
                ff ffVar = (ff) this.f30124b;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.f30125c;
                if (wnVar != null) {
                    wnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ffVar.dismiss();
                    return;
                }
                return;
            case 4:
                ((WindowManager) this.f30125c).removeView(((ff) this.f30124b).B);
                return;
            case 5:
                uq0 uq0Var = (uq0) this.f30124b;
                TLObject tLObject = (TLObject) this.f30125c;
                if (tLObject != null) {
                    uq0Var.f28874k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    uq0Var.Z0();
                    if (uq0Var.m0) {
                        uq0Var.M0();
                    }
                }
                uq0Var.f28875l0 = false;
                return;
            case 6:
                cu0 cu0Var = (cu0) this.f30124b;
                br0 br0Var = (br0) this.f30125c;
                cu0Var.G = null;
                cu0Var.H = null;
                br0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new fd0(br0Var, 14)).start();
                return;
            case 7:
                ai.e9 e9Var = (ai.e9) this.f30125c;
                es0 es0Var = ((jv0) this.f30124b).W;
                if (es0Var != null) {
                    int i13 = e9Var.f854a;
                    es0Var.f37551n.d(i13, es0Var.f37553s.i(i13));
                    return;
                }
                return;
            case 8:
                yc.a0(((st0) this.f30124b).f28319f.f25543v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f30125c).title)).k(true);
                return;
            case 9:
                fu0 fu0Var = (fu0) this.f30124b;
                String str2 = (String) this.f30125c;
                if (!fu0Var.v.f25539t1[fu0Var.f24261r].f30682a.isEmpty() && ((i10 = fu0Var.f24261r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, fu0Var.v.f25539t1[i10].f30682a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    jv0 jv0Var = fu0Var.v;
                    if (jv0Var.f25518j1 == jv0Var.f25543v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    fu0Var.F(id2, str2, dialogId, j3);
                } else if (fu0Var.f24261r == 3) {
                    jv0 jv0Var2 = fu0Var.v;
                    fu0Var.F(0, str2, jv0Var2.f25518j1, jv0Var2.F);
                }
                int i14 = fu0Var.f24261r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(fu0Var.v.f25539t1[fu0Var.f24261r].f30682a);
                    fu0Var.f24262s++;
                    Utilities.searchQueue.postRunnable(new cn0((Object) fu0Var, (Serializable) str2, arrayList3, 8));
                    return;
                }
                return;
            case 10:
                fu0 fu0Var2 = (fu0) this.f30124b;
                ArrayList arrayList4 = (ArrayList) this.f30125c;
                jv0 jv0Var3 = fu0Var2.v;
                boolean z10 = jv0Var3.V0;
                cu0[] cu0VarArr = jv0Var3.f25519k0;
                if (z10) {
                    fu0Var2.f24262s--;
                    int h = fu0Var2.h();
                    fu0Var2.d = arrayList4;
                    int h10 = fu0Var2.h();
                    if (fu0Var2.f24262s == 0 || h10 != 0) {
                        jv0Var3.m1(false);
                    }
                    for (int i15 = 0; i15 < cu0VarArr.length; i15++) {
                        cu0 cu0Var2 = cu0VarArr[i15];
                        if (cu0Var2.F == fu0Var2.f24261r) {
                            if (fu0Var2.f24262s == 0 && h10 == 0) {
                                cu0Var2.f23391w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                cu0VarArr[i15].f23391w.f25166f.setVisibility(8);
                                cu0VarArr[i15].f23391w.e(false, true);
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
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f30124b, (TLRPC.Document) this.f30125c, null, bool);
                return;
            case 12:
                MessagesController.getInstance(((sy0) this.f30124b).f28334a.f30418a).updateEmojiStatus((TLRPC.EmojiStatus) this.f30125c);
                return;
            case 13:
                k31 k31Var = (k31) this.f30124b;
                MessagesController.getInstance(k31Var.f25616b).getTopicsController().deleteTopics(-k31Var.f25618c, (ArrayList) this.f30125c);
                int i17 = k31.f25613f0;
                return;
            case 14:
                k31 k31Var2 = (k31) this.f30124b;
                k31Var2.getClass();
                MessagesController.getInstance(k31Var2.f25616b).loadFullChat(((TLRPC.Updates) this.f30125c).chats.get(0).f18321id, 0, true);
                return;
            case 15:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f30124b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f30125c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 16:
                i41.o((i41) this.f30124b, (TLObject) this.f30125c);
                return;
            case 17:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f30124b;
                String str3 = (String) this.f30125c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f30124b;
                ((org.telegram.ui.ActionBar.m1) this.f30125c).d(true);
                z41.a(wkVar.getContext(), wkVar.d);
                return;
            case 19:
                ((TranslateController) this.f30125c).setHideTranslateDialog(((org.telegram.ui.wk) this.f30124b).f30773b, false);
                return;
            case 20:
                UndoView undoView = (UndoView) this.f30124b;
                TLObject tLObject2 = (TLObject) this.f30125c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f22447s.presentFragment(new org.telegram.ui.oo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f22436e0;
                undoView.getClass();
                return;
            case 21:
                ((v51) this.f30124b).D.onClick((org.telegram.ui.Cells.v8) this.f30125c);
                return;
            case 22:
                s71 s71Var = (s71) this.f30124b;
                b2.u0 u0Var = (b2.u0) this.f30125c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = s71.f28173l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = s71Var.N;
                    if (arrayList5 != null) {
                        int i19 = 0;
                        while (i19 < arrayList5.size()) {
                            o71 o71Var = (o71) arrayList5.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList6 = o71Var.d;
                                if (i20 < arrayList6.size()) {
                                    q71 q71Var = (q71) arrayList6.get(i20);
                                    if (!TextUtils.isEmpty(q71Var.f27531m) && !s71.Y(q71Var.f27531m)) {
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
                    s71Var.N = arrayList;
                    if (arrayList != null) {
                        s71Var.F(arrayList, s71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = s71Var.f28187n;
                if (textureView != null && ((!s71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    s71Var.E = true;
                    if (s71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(s71Var.f28187n);
                            viewGroup.removeView(s71Var.f28187n);
                            viewGroup.addView(s71Var.f28187n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = s71Var.f28176b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new g71(s71Var, 1));
                            return;
                        }
                        i2.f0 f0Var = s71Var.d;
                        TextureView textureView2 = s71Var.f28187n;
                        f0Var.B1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.B1();
                            f0Var.o1();
                            f0Var.t1(null);
                            f0Var.m1(0, 0);
                        }
                        s71Var.d.v1(s71Var.f28187n);
                        ArrayList arrayList7 = s71Var.N;
                        if (arrayList7 != null) {
                            s71Var.F(arrayList7, s71Var.O);
                        } else if (s71Var.U) {
                            s71Var.G(s71Var.Q, s71Var.S, s71Var.R, s71Var.T);
                        } else {
                            s71Var.D(s71Var.Q, s71Var.S);
                        }
                        s71Var.C();
                        return;
                    }
                    return;
                }
                s71Var.J.onError(s71Var, u0Var);
                return;
            case 23:
                ((r71) this.f30124b).f27892f.K.onVisualizerUpdate(true, true, (float[]) this.f30125c);
                return;
            case 24:
                a81 a81Var = (a81) this.f30124b;
                Bitmap bitmap = (Bitmap) this.f30125c;
                if (bitmap != null) {
                    if (a81Var.f22614w != null) {
                        Bitmap bitmap2 = a81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        a81Var.v = a81Var.f22614w;
                    }
                    a81Var.f22614w = bitmap;
                    Bitmap bitmap3 = a81Var.f22614w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    a81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(a81Var.L);
                    a81Var.J.setShader(a81Var.G);
                    a81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = a81Var.getLayoutParams();
                    if (a81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        a81Var.setVisibility(0);
                        a81Var.requestLayout();
                    }
                }
                a81Var.f22608f = null;
                return;
            case 25:
                final n91 n91Var = (n91) this.f30124b;
                n91Var.e.f26993b.evaluateJavascript((String) this.f30125c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        n91 n91Var2 = n91.this;
                        String[] strArr = n91Var2.f26679c;
                        String str5 = strArr[0];
                        String str6 = n91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        n91Var2.f26678b.countDown();
                    }
                });
                return;
            case 26:
                ((org.telegram.ui.Components.voip.k) this.f30124b).f29403a.setOnClickListener((View.OnClickListener) this.f30125c);
                return;
            case 27:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f30124b;
                Bitmap bitmap4 = (Bitmap) this.f30125c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29661w;
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
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f30125c;
                ((org.telegram.ui.Components.voip.m0) this.f30124b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            default:
                wl0 wl0Var = (wl0) this.f30124b;
                Object obj = this.f30125c;
                if (wl0Var != null) {
                    wl0Var.setOnItemClickListener((kl0) obj);
                    return;
                }
                return;
        }
    }

    public wn0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30123a = i10;
        this.f30124b = obj;
        this.f30125c = obj2;
    }
}
