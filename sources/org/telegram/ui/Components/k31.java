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
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k31 implements Runnable {
    public final int f26573a;
    public final Object f26574b;
    public final Object f26575c;

    public k31(int i10, Object obj, Object obj2) {
        this.f26573a = i10;
        this.f26574b = obj;
        this.f26575c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        mm0 mm0Var;
        int i11;
        int i12 = this.f26573a;
        int i13 = 2;
        ArrayList arrayList = null;
        int i14 = 0;
        Object obj = this.f26575c;
        Object obj2 = this.f26574b;
        switch (i12) {
            case 0:
                y31 y31Var = (y31) obj2;
                MessagesController.getInstance(y31Var.f31472b).getTopicsController().deleteTopics(-y31Var.f31474c, (ArrayList) obj);
                int i15 = y31.f31469f0;
                return;
            case 1:
                y31 y31Var2 = (y31) obj2;
                y31Var2.getClass();
                MessagesController.getInstance(y31Var2.f31472b).loadFullChat(((TLRPC.Updates) obj).chats.get(0).f19216id, 0, true);
                return;
            case 2:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) obj2;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) obj;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i13 = 1;
                    }
                    l1Var.d0(i13);
                    return;
                }
                return;
            case 3:
                x41.q((x41) obj2, (TLObject) obj);
                return;
            case 4:
                org.telegram.ui.el elVar = (org.telegram.ui.el) obj2;
                ((org.telegram.ui.ActionBar.m1) obj).d(true);
                o51.a(elVar.getContext(), elVar.d);
                return;
            case 5:
                ((TranslateController) obj).setHideTranslateDialog(((org.telegram.ui.el) obj2).f27849b, false);
                return;
            case 6:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.f23358s.presentFragment(new org.telegram.ui.cp0((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                int i16 = UndoView.f23347e0;
                undoView.getClass();
                return;
            case 7:
                ((l61) obj2).D.onClick((org.telegram.ui.Cells.v8) obj);
                return;
            case 8:
                h81 h81Var = (h81) obj2;
                b2.z0 z0Var = (b2.z0) obj;
                Throwable cause = z0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(z0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = h81.f25542l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = h81Var.N;
                    if (arrayList2 != null) {
                        int i17 = 0;
                        while (i17 < arrayList2.size()) {
                            d81 d81Var = (d81) arrayList2.get(i17);
                            int i18 = 0;
                            while (true) {
                                ArrayList arrayList3 = d81Var.d;
                                if (i18 < arrayList3.size()) {
                                    f81 f81Var = (f81) arrayList3.get(i18);
                                    if (!TextUtils.isEmpty(f81Var.f24969m) && !h81.Y(f81Var.f24969m)) {
                                        arrayList3.remove(i18);
                                        i18--;
                                    }
                                    i18++;
                                } else {
                                    if (arrayList3.isEmpty()) {
                                        arrayList2.remove(i17);
                                        i17--;
                                    }
                                    i17++;
                                }
                            }
                        }
                        arrayList = arrayList2;
                    }
                    h81Var.N = arrayList;
                    if (arrayList != null) {
                        h81Var.F(arrayList, h81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = h81Var.f25556n;
                if (textureView != null && ((!h81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    h81Var.E = true;
                    if (h81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(h81Var.f25556n);
                            viewGroup.removeView(h81Var.f25556n);
                            viewGroup.addView(h81Var.f25556n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = h81Var.f25545b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new v71(h81Var, 1));
                            return;
                        }
                        i2.h0 h0Var = h81Var.d;
                        TextureView textureView2 = h81Var.f25556n;
                        h0Var.F1();
                        if (textureView2 != null && textureView2 == h0Var.X) {
                            h0Var.F1();
                            h0Var.s1();
                            h0Var.x1(null);
                            h0Var.q1(0, 0);
                        }
                        h81Var.d.z1(h81Var.f25556n);
                        ArrayList arrayList4 = h81Var.N;
                        if (arrayList4 != null) {
                            h81Var.F(arrayList4, h81Var.O);
                        } else if (h81Var.U) {
                            h81Var.G(h81Var.Q, h81Var.S, h81Var.R, h81Var.T);
                        } else {
                            h81Var.D(h81Var.Q, h81Var.S);
                        }
                        h81Var.C();
                        return;
                    }
                    return;
                }
                h81Var.J.onError(h81Var, z0Var);
                return;
            case 9:
                ((g81) obj2).f25222f.K.onVisualizerUpdate(true, true, (float[]) obj);
                return;
            case 10:
                p81 p81Var = (p81) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (p81Var.f28245w != null) {
                        Bitmap bitmap2 = p81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        p81Var.v = p81Var.f28245w;
                    }
                    p81Var.f28245w = bitmap;
                    Bitmap bitmap3 = p81Var.f28245w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    p81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(p81Var.L);
                    p81Var.J.setShader(p81Var.G);
                    p81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        i10 = dp;
                        dp = (int) (dp * width);
                    }
                    ViewGroup.LayoutParams layoutParams = p81Var.getLayoutParams();
                    if (p81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        p81Var.setVisibility(0);
                        p81Var.requestLayout();
                    }
                }
                p81Var.f28239f = null;
                return;
            case 11:
                final ba1 ba1Var = (ba1) obj2;
                ba1Var.e.f23992b.evaluateJavascript((String) obj, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj3) {
                        String str2 = (String) obj3;
                        ba1 ba1Var2 = ba1.this;
                        String[] strArr = ba1Var2.f23733c;
                        String str3 = strArr[0];
                        String str4 = ba1Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        ba1Var2.f23732b.countDown();
                    }
                });
                return;
            case 12:
                ((org.telegram.ui.Components.voip.k) obj2).f30260a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 13:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f30504w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z10) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 14:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                ((org.telegram.ui.Components.voip.l0) obj2).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 15:
                mm0 mm0Var2 = (mm0) obj2;
                if (mm0Var2 != null) {
                    mm0Var2.setOnItemClickListener((am0) obj);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.du duVar = (org.telegram.ui.du) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new k31(17, duVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = duVar.f35390f;
                int size = arrayList6.size();
                while (i14 < size) {
                    Object obj3 = arrayList6.get(i14);
                    i14++;
                    org.telegram.ui.au auVar = (org.telegram.ui.au) obj3;
                    String str2 = auVar.f34339a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(auVar.f34339a).toLowerCase();
                    String str4 = auVar.f34340b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(auVar.f34340b).toLowerCase();
                    String str5 = auVar.f34341c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, lowerCase5) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList5.add(auVar);
                    }
                }
                AndroidUtilities.runOnUIThread(new k31(17, duVar, arrayList5));
                return;
            case 17:
                org.telegram.ui.du duVar2 = (org.telegram.ui.du) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.fu fuVar = duVar2.h;
                if (fuVar.f36230f) {
                    duVar2.e = arrayList7;
                    if (fuVar.e && (mm0Var = fuVar.f36227a) != null) {
                        s4.g0 adapter = mm0Var.getAdapter();
                        org.telegram.ui.du duVar3 = fuVar.d;
                        if (adapter != duVar3) {
                            fuVar.f36227a.setAdapter(duVar3);
                            fuVar.f36227a.setFastScrollVisible(false);
                        }
                    }
                    duVar2.l();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.hu.Q((org.telegram.ui.hu) obj2, (TLRPC.Updates) obj);
                return;
            case 19:
                org.telegram.ui.yy.b0((org.telegram.ui.yy) obj2, (String) obj);
                return;
            case 20:
                fi.k3.j(((org.telegram.ui.yy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 21:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) obj2;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(yyVar, 25), 300L);
                return;
            case 22:
                ((org.telegram.ui.xy) obj).f41980a.postOnAnimation(new org.telegram.ui.uv((org.telegram.ui.yy) obj2, 15));
                return;
            case 23:
                org.telegram.ui.yy yyVar2 = (org.telegram.ui.yy) obj2;
                ArrayList<Long> arrayList8 = (ArrayList) obj;
                MessagesController messagesController = yyVar2.getMessagesController();
                if (yyVar2.V2 == 0 && yyVar2.X2 == 0) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                messagesController.addDialogToFolder(arrayList8, i11, -1, null, 0L);
                return;
            case 24:
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.yy yyVar3 = ((org.telegram.ui.xw) obj2).f41972b;
                yyVar3.y3 = 2;
                yyVar3.x4(true, true);
                yyVar3.l3();
                while (i14 < arrayList9.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList9.get(i14)).f19220id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i14);
                    if (yyVar3.getMessagesController().isForum(j10) || yyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        yyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    yyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = yyVar3.getMessagesController();
                    int i19 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i19, i19, dialog.last_message_date, false, 0L, 0, true, 0);
                    i14++;
                }
                return;
            case 25:
                ((org.telegram.ui.xw) obj2).d((MessagesController.DialogFilter) obj);
                return;
            case 26:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.yy yyVar4 = ((org.telegram.ui.jx) obj2).f37452a;
                yyVar4.H2 = null;
                or0 or0Var = yyVar4.G2;
                if (or0Var != null && or0Var.h) {
                    or0Var.e(charSequence, false);
                    return;
                }
                return;
            case 27:
                org.telegram.ui.ActionBar.m2[] m2VarArr = (org.telegram.ui.ActionBar.m2[]) obj;
                ((org.telegram.ui.xx) obj2).f41976b.removeSelfFromStack();
                if (m2VarArr[1] != null) {
                    m2VarArr[0].removeSelfFromStack();
                    m2VarArr[1].finishFragment();
                    return;
                }
                m2VarArr[0].finishFragment();
                return;
            case 28:
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) obj2;
                org.telegram.ui.fo foVar = kzVar.f37780a;
                ty0 ty0Var = new ty0(foVar.getParentActivity(), kzVar.f37780a, ((MessageObject) obj).getInputStickerSet(), null, foVar.Y, foVar.getResourceProvider());
                ty0Var.setCalcMandatoryInsets(foVar.C9());
                foVar.showDialog(ty0Var);
                return;
            default:
                org.telegram.ui.f00 f00Var = (org.telegram.ui.f00) obj2;
                f00Var.getClass();
                ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                org.telegram.ui.g00 g00Var = f00Var.E;
                org.telegram.ui.h00 h00Var = g00Var.f36267c;
                Utilities.Callback callback = h00Var.f36574x;
                if (callback != null) {
                    callback.run(h00Var.d);
                }
                g00Var.f36267c.finishFragment();
                return;
        }
    }

    public k31(y31 y31Var, ArrayList arrayList, ve veVar) {
        this.f26573a = 0;
        this.f26574b = y31Var;
        this.f26575c = arrayList;
    }
}
