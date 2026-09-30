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
public final class zn0 implements Runnable {
    public final int f31042a;
    public final Object f31043b;
    public final Object f31044c;

    public zn0(int i10, Object obj, Object obj2) {
        this.f31042a = i10;
        this.f31043b = obj;
        this.f31044c = obj2;
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
        switch (this.f31042a) {
            case 0:
                ((ho0) this.f31043b).T();
                yc.a0((org.telegram.ui.qy) this.f31044c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 1:
                ((so0) this.f31043b).sendAccessibilityEvent((View) this.f31044c, 4);
                return;
            case 2:
                gf gfVar = (gf) this.f31043b;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.f31044c;
                if (wnVar != null) {
                    wnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    gfVar.dismiss();
                    return;
                }
                return;
            case 3:
                ((WindowManager) this.f31044c).removeView(((gf) this.f31043b).B);
                return;
            case 4:
                xq0 xq0Var = (xq0) this.f31043b;
                TLObject tLObject = (TLObject) this.f31044c;
                if (tLObject != null) {
                    xq0Var.f30467k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    xq0Var.Z0();
                    if (xq0Var.m0) {
                        xq0Var.M0();
                    }
                }
                xq0Var.f30468l0 = false;
                return;
            case 5:
                fu0 fu0Var = (fu0) this.f31043b;
                er0 er0Var = (er0) this.f31044c;
                fu0Var.G = null;
                fu0Var.H = null;
                er0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new id0(er0Var, 14)).start();
                return;
            case 6:
                ai.e9 e9Var = (ai.e9) this.f31044c;
                hs0 hs0Var = ((mv0) this.f31043b).W;
                if (hs0Var != null) {
                    int i13 = e9Var.f854a;
                    hs0Var.f37662n.d(i13, hs0Var.f37664s.i(i13));
                    return;
                }
                return;
            case 7:
                yc.a0(((vt0) this.f31043b).f29723f.f26449v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f31044c).title)).k(true);
                return;
            case 8:
                iu0 iu0Var = (iu0) this.f31043b;
                String str2 = (String) this.f31044c;
                if (!iu0Var.v.f26445t1[iu0Var.f25203r].f23015a.isEmpty() && ((i10 = iu0Var.f25203r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, iu0Var.v.f26445t1[i10].f23015a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    mv0 mv0Var = iu0Var.v;
                    if (mv0Var.f26424j1 == mv0Var.f26449v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    iu0Var.F(id2, str2, dialogId, j3);
                } else if (iu0Var.f25203r == 3) {
                    mv0 mv0Var2 = iu0Var.v;
                    iu0Var.F(0, str2, mv0Var2.f26424j1, mv0Var2.F);
                }
                int i14 = iu0Var.f25203r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(iu0Var.v.f26445t1[iu0Var.f25203r].f23015a);
                    iu0Var.f25204s++;
                    Utilities.searchQueue.postRunnable(new fn0((Object) iu0Var, (Serializable) str2, arrayList3, 8));
                    return;
                }
                return;
            case 9:
                iu0 iu0Var2 = (iu0) this.f31043b;
                ArrayList arrayList4 = (ArrayList) this.f31044c;
                mv0 mv0Var3 = iu0Var2.v;
                boolean z10 = mv0Var3.V0;
                fu0[] fu0VarArr = mv0Var3.f26425k0;
                if (z10) {
                    iu0Var2.f25204s--;
                    int h = iu0Var2.h();
                    iu0Var2.d = arrayList4;
                    int h10 = iu0Var2.h();
                    if (iu0Var2.f25204s == 0 || h10 != 0) {
                        mv0Var3.m1(false);
                    }
                    for (int i15 = 0; i15 < fu0VarArr.length; i15++) {
                        fu0 fu0Var2 = fu0VarArr[i15];
                        if (fu0Var2.F == iu0Var2.f25203r) {
                            if (iu0Var2.f25204s == 0 && h10 == 0) {
                                fu0Var2.f24358w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                fu0VarArr[i15].f24358w.f26146f.setVisibility(8);
                                fu0VarArr[i15].f24358w.e(false, true);
                            } else if (h == 0) {
                                mv0Var3.z(fu0Var2.h, 0, null);
                            }
                        }
                    }
                    iu0Var2.l();
                    return;
                }
                return;
            case 10:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, (TLObject) this.f31043b, (TLRPC.Document) this.f31044c, null, bool);
                return;
            case 11:
                MessagesController.getInstance(((vy0) this.f31043b).f29742a.f22744a).updateEmojiStatus((TLRPC.EmojiStatus) this.f31044c);
                return;
            case 12:
                n31 n31Var = (n31) this.f31043b;
                MessagesController.getInstance(n31Var.f26561b).getTopicsController().deleteTopics(-n31Var.f26563c, (ArrayList) this.f31044c);
                int i17 = n31.f26558f0;
                return;
            case 13:
                n31 n31Var2 = (n31) this.f31043b;
                n31Var2.getClass();
                MessagesController.getInstance(n31Var2.f26561b).loadFullChat(((TLRPC.Updates) this.f31044c).chats.get(0).f18352id, 0, true);
                return;
            case 14:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f31043b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f31044c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.d0(i12);
                    return;
                }
                return;
            case 15:
                l41.o((l41) this.f31043b, (TLObject) this.f31044c);
                return;
            case 16:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f31043b;
                String str3 = (String) this.f31044c;
                if (callback2 != null) {
                    callback2.run(str3, Boolean.FALSE);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f31043b;
                ((org.telegram.ui.ActionBar.m1) this.f31044c).d(true);
                c51.a(wkVar.getContext(), wkVar.d);
                return;
            case 18:
                ((TranslateController) this.f31044c).setHideTranslateDialog(((org.telegram.ui.wk) this.f31043b).f23161b, false);
                return;
            case 19:
                UndoView undoView = (UndoView) this.f31043b;
                TLObject tLObject2 = (TLObject) this.f31044c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f22483s.presentFragment(new org.telegram.ui.no0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i18 = UndoView.f22472e0;
                undoView.getClass();
                return;
            case 20:
                ((y51) this.f31043b).D.onClick((org.telegram.ui.Cells.v8) this.f31044c);
                return;
            case 21:
                v71 v71Var = (v71) this.f31043b;
                b2.u0 u0Var = (b2.u0) this.f31044c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = v71.f29059l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = v71Var.N;
                    if (arrayList5 != null) {
                        int i19 = 0;
                        while (i19 < arrayList5.size()) {
                            r71 r71Var = (r71) arrayList5.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList6 = r71Var.d;
                                if (i20 < arrayList6.size()) {
                                    t71 t71Var = (t71) arrayList6.get(i20);
                                    if (!TextUtils.isEmpty(t71Var.f28450m) && !v71.Y(t71Var.f28450m)) {
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
                    v71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        v71Var.F(arrayList2, v71Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = v71Var.f29073n;
                if (textureView != null && ((!v71Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    v71Var.E = true;
                    if (v71Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(v71Var.f29073n);
                            viewGroup.removeView(v71Var.f29073n);
                            viewGroup.addView(v71Var.f29073n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = v71Var.f29062b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new j71(v71Var, 1));
                            return;
                        }
                        i2.f0 f0Var = v71Var.d;
                        TextureView textureView2 = v71Var.f29073n;
                        f0Var.B1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.B1();
                            f0Var.o1();
                            f0Var.t1(null);
                            f0Var.m1(0, 0);
                        }
                        v71Var.d.v1(v71Var.f29073n);
                        ArrayList arrayList7 = v71Var.N;
                        if (arrayList7 != null) {
                            v71Var.F(arrayList7, v71Var.O);
                        } else if (v71Var.U) {
                            v71Var.G(v71Var.Q, v71Var.S, v71Var.R, v71Var.T);
                        } else {
                            v71Var.D(v71Var.Q, v71Var.S);
                        }
                        v71Var.C();
                        return;
                    }
                    return;
                }
                v71Var.J.onError(v71Var, u0Var);
                return;
            case 22:
                ((u71) this.f31043b).f28792f.K.onVisualizerUpdate(true, true, (float[]) this.f31044c);
                return;
            case 23:
                c81 c81Var = (c81) this.f31043b;
                Bitmap bitmap = (Bitmap) this.f31044c;
                if (bitmap != null) {
                    if (c81Var.f23206w != null) {
                        Bitmap bitmap2 = c81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        c81Var.v = c81Var.f23206w;
                    }
                    c81Var.f23206w = bitmap;
                    Bitmap bitmap3 = c81Var.f23206w;
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
                c81Var.f23200f = null;
                return;
            case 24:
                final q91 q91Var = (q91) this.f31043b;
                q91Var.e.f27907b.evaluateJavascript((String) this.f31044c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        q91 q91Var2 = q91.this;
                        String[] strArr = q91Var2.f27607c;
                        String str5 = strArr[0];
                        String str6 = q91Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        q91Var2.f27606b.countDown();
                    }
                });
                return;
            case 25:
                ((org.telegram.ui.Components.voip.k) this.f31043b).f29330a.setOnClickListener((View.OnClickListener) this.f31044c);
                return;
            case 26:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f31043b;
                Bitmap bitmap4 = (Bitmap) this.f31044c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f29588w;
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
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.f31044c;
                ((org.telegram.ui.Components.voip.m0) this.f31043b).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                return;
            case 28:
                zl0 zl0Var = (zl0) this.f31043b;
                Object obj = this.f31044c;
                if (zl0Var != null) {
                    zl0Var.setOnItemClickListener((nl0) obj);
                    return;
                }
                return;
            default:
                org.telegram.ui.ut utVar = (org.telegram.ui.ut) this.f31043b;
                String lowerCase = ((String) this.f31044c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.tt(0, utVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = utVar.f38643f;
                int size = arrayList9.size();
                int i21 = 0;
                while (i21 < size) {
                    Object obj2 = arrayList9.get(i21);
                    i21++;
                    org.telegram.ui.qt qtVar = (org.telegram.ui.qt) obj2;
                    String str4 = qtVar.f37082a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(qtVar.f37082a).toLowerCase();
                    String str6 = qtVar.f37083b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(qtVar.f37083b).toLowerCase();
                    String str7 = qtVar.f37084c;
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

    public zn0(Object obj, Object obj2, Object obj3, int i10) {
        this.f31042a = i10;
        this.f31043b = obj;
        this.f31044c = obj2;
    }
}
