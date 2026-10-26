package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c71 implements Runnable {
    public final int f27086a;
    public final Object f27087b;
    public final Object f27088c;

    public c71(int i10, Object obj, Object obj2) {
        this.f27086a = i10;
        this.f27087b = obj;
        this.f27088c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        xb1 xb1Var;
        String str2;
        String str3;
        int i11;
        mm0 mm0Var;
        int i12;
        ArrayList arrayList = null;
        String str4 = null;
        int i13 = 0;
        switch (this.f27086a) {
            case 0:
                UndoView undoView = (UndoView) this.f27087b;
                TLObject tLObject = (TLObject) this.f27088c;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.f26362s.presentFragment(new org.telegram.ui.po0((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                int i14 = UndoView.f26347i0;
                undoView.getClass();
                return;
            case 1:
                ((t61) this.f27087b).D.onClick((org.telegram.ui.Cells.z8) this.f27088c);
                return;
            case 2:
                s81 s81Var = (s81) this.f27087b;
                b2.z0 z0Var = (b2.z0) this.f27088c;
                Throwable cause = z0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(z0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = s81.f32456l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = s81Var.N;
                    if (arrayList2 != null) {
                        int i15 = 0;
                        while (i15 < arrayList2.size()) {
                            o81 o81Var = (o81) arrayList2.get(i15);
                            int i16 = 0;
                            while (true) {
                                ArrayList arrayList3 = o81Var.d;
                                if (i16 < arrayList3.size()) {
                                    q81 q81Var = (q81) arrayList3.get(i16);
                                    if (!TextUtils.isEmpty(q81Var.f31863m) && !s81.Y(q81Var.f31863m)) {
                                        arrayList3.remove(i16);
                                        i16--;
                                    }
                                    i16++;
                                } else {
                                    if (arrayList3.isEmpty()) {
                                        arrayList2.remove(i15);
                                        i15--;
                                    }
                                    i15++;
                                }
                            }
                        }
                        arrayList = arrayList2;
                    }
                    s81Var.N = arrayList;
                    if (arrayList != null) {
                        s81Var.F(arrayList, s81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = s81Var.f32470n;
                if (textureView != null && ((!s81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    s81Var.E = true;
                    if (s81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(s81Var.f32470n);
                            viewGroup.removeView(s81Var.f32470n);
                            viewGroup.addView(s81Var.f32470n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = s81Var.f32459b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new s51(s81Var, 6));
                            return;
                        }
                        i2.j0 j0Var = s81Var.d;
                        TextureView textureView2 = s81Var.f32470n;
                        j0Var.F1();
                        if (textureView2 != null && textureView2 == j0Var.X) {
                            j0Var.F1();
                            j0Var.s1();
                            j0Var.x1(null);
                            j0Var.q1(0, 0);
                        }
                        s81Var.d.z1(s81Var.f32470n);
                        ArrayList arrayList4 = s81Var.N;
                        if (arrayList4 != null) {
                            s81Var.F(arrayList4, s81Var.O);
                        } else if (s81Var.U) {
                            s81Var.G(s81Var.Q, s81Var.S, s81Var.R, s81Var.T);
                        } else {
                            s81Var.D(s81Var.Q, s81Var.S);
                        }
                        s81Var.C();
                        return;
                    }
                    return;
                }
                s81Var.J.onError(s81Var, z0Var);
                return;
            case 3:
                ((r81) this.f27087b).f32165f.K.onVisualizerUpdate(true, true, (float[]) this.f27088c);
                return;
            case 4:
                z81 z81Var = (z81) this.f27087b;
                Bitmap bitmap = (Bitmap) this.f27088c;
                if (bitmap != null) {
                    if (z81Var.f35259w != null) {
                        Bitmap bitmap2 = z81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        z81Var.v = z81Var.f35259w;
                    }
                    z81Var.f35259w = bitmap;
                    Bitmap bitmap3 = z81Var.f35259w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    z81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(z81Var.L);
                    z81Var.J.setShader(z81Var.G);
                    z81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i10 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = z81Var.getLayoutParams();
                    if (z81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        z81Var.setVisibility(0);
                        z81Var.requestLayout();
                    }
                }
                z81Var.f35253f = null;
                return;
            case 5:
                final la1 la1Var = (la1) this.f27087b;
                la1Var.e.f30490b.evaluateJavascript((String) this.f27088c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str5 = (String) obj;
                        la1 la1Var2 = la1.this;
                        String[] strArr = la1Var2.f30152c;
                        String str6 = strArr[0];
                        String str7 = la1Var2.d;
                        strArr[0] = str6.replace(str7, "/signature/" + str5.substring(1, str5.length() - 1));
                        la1Var2.f30151b.countDown();
                    }
                });
                return;
            case 6:
                yb1 yb1Var = (yb1) this.f27087b;
                pa1 pa1Var = (pa1) this.f27088c;
                yb1Var.H = pa1Var;
                yb1Var.K = pa1Var;
                yb1Var.e(true);
                return;
            case 7:
                ((qa1) this.f27087b).d.e((String) this.f27088c);
                return;
            case 8:
                ((za1) this.f27087b).f35285f.e((String) this.f27088c);
                return;
            case 9:
                yb1 yb1Var2 = (yb1) this.f27087b;
                ya1 ya1Var = (ya1) this.f27088c;
                yb1Var2.H = ya1Var;
                yb1Var2.K = ya1Var;
                yb1Var2.e(true);
                return;
            case 10:
                db1 db1Var = (db1) this.f27088c;
                Object[] widgetState = ((MessagesStorage) this.f27087b).getWidgetState(db1Var.f27489c, db1Var.d);
                ArrayList arrayList5 = (ArrayList) widgetState[1];
                if (!arrayList5.isEmpty()) {
                    String a2 = db1Var.a();
                    ConcurrentHashMap concurrentHashMap = fb1.f28146b;
                    eb1 eb1Var = (eb1) concurrentHashMap.get(a2);
                    if (eb1Var == null) {
                        eb1Var = new eb1();
                        eb1 eb1Var2 = (eb1) concurrentHashMap.putIfAbsent(a2, eb1Var);
                        if (eb1Var2 != null) {
                            eb1Var = eb1Var2;
                        }
                    }
                    synchronized (eb1Var) {
                        if (eb1Var.f27800a.isEmpty()) {
                            while (i13 < arrayList5.size() && i13 < 4) {
                                eb1Var.f27800a.add((int[]) arrayList5.get(i13));
                                i13++;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new c71(11, db1Var, widgetState));
                return;
            case 11:
                db1 db1Var2 = (db1) this.f27087b;
                String str5 = (String) ((Object[]) this.f27088c)[0];
                HashMap hashMap2 = fb1.f28147c;
                db1Var2.f27498o = true;
                String a10 = db1Var2.a();
                if (str5 != null && !hashMap2.containsKey(a10)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str5));
                        hashMap2.put(a10, jSONObject);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                jb1 jb1Var = db1Var2.f27492i;
                if (jb1Var != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap2.get(a10);
                    try {
                        str = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                    } catch (Exception unused) {
                        str = null;
                    }
                    if (jSONObject2 != null) {
                        str4 = jSONObject2.toString();
                    }
                    jb1Var.f29600t = str;
                    jb1Var.f29601u = str4;
                }
                an0 an0Var = db1Var2.f27493j;
                if (an0Var != null && (jb1Var == null || jb1Var.f29589i <= 0)) {
                    an0Var.l("cached heights read");
                }
                if (db1Var2.f27499p) {
                    db1Var2.f27499p = false;
                    if (db1Var2.f27496m > 0 && jb1Var != null) {
                        fb1.p(db1Var2);
                    }
                }
                fb1.j();
                return;
            case 12:
                yb1 yb1Var3 = (yb1) this.f27087b;
                yb1Var3.L = ((Exception) this.f27088c).toString();
                if (!yb1Var3.f35018s && (xb1Var = yb1Var3.H) != null) {
                    xb1Var.c(yb1Var3.L);
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Components.voip.k) this.f27087b).f33878a.setOnClickListener((View.OnClickListener) this.f27088c);
                return;
            case 14:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f27087b;
                Bitmap bitmap4 = (Bitmap) this.f27088c;
                HashMap<String, Bitmap> hashMap3 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.f34102w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z10) {
                    str2 = groupCallParticipant.presentationEndpoint;
                } else {
                    str2 = groupCallParticipant.videoEndpoint;
                }
                hashMap3.put(str2, bitmap4);
                return;
            case 15:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.f27088c;
                ((org.telegram.ui.Components.voip.l0) this.f27087b).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 16:
                mm0 mm0Var2 = (mm0) this.f27087b;
                Object obj = this.f27088c;
                if (mm0Var2 != null) {
                    mm0Var2.setOnItemClickListener((zl0) obj);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) this.f27087b;
                String str6 = "";
                String lowerCase = ((String) this.f27088c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new c71(18, mtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = mtVar.f41655f;
                int size = arrayList7.size();
                while (i13 < size) {
                    Object obj2 = arrayList7.get(i13);
                    int i17 = i13 + 1;
                    org.telegram.ui.jt jtVar = (org.telegram.ui.jt) obj2;
                    String str7 = jtVar.f40743a;
                    if (str7 == null) {
                        str7 = str6;
                    }
                    String lowerCase2 = str7.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(jtVar.f40743a).toLowerCase();
                    String str8 = jtVar.f40744b;
                    if (str8 == null) {
                        str8 = str6;
                    }
                    String lowerCase4 = str8.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(jtVar.f40744b).toLowerCase();
                    String str9 = jtVar.f40745c;
                    if (str9 == null) {
                        str9 = str6;
                    }
                    if (TextUtils.isEmpty(str9)) {
                        str3 = str6;
                    } else {
                        str3 = str6;
                        str6 = "+".concat(str9);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        i11 = i17;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.vh.u(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.vh.u(" ", translitSafe, lowerCase5) && !str9.startsWith(lowerCase) && !str6.startsWith(lowerCase)) {
                            str6 = str3;
                            i13 = i11;
                        }
                    } else {
                        i11 = i17;
                    }
                    arrayList6.add(jtVar);
                    str6 = str3;
                    i13 = i11;
                }
                AndroidUtilities.runOnUIThread(new c71(18, mtVar, arrayList6));
                return;
            case 18:
                org.telegram.ui.mt mtVar2 = (org.telegram.ui.mt) this.f27087b;
                ArrayList arrayList8 = (ArrayList) this.f27088c;
                org.telegram.ui.ot otVar = mtVar2.h;
                if (otVar.f42284f) {
                    mtVar2.e = arrayList8;
                    if (otVar.e && (mm0Var = otVar.f42281a) != null) {
                        s4.h0 adapter = mm0Var.getAdapter();
                        org.telegram.ui.mt mtVar3 = otVar.d;
                        if (adapter != mtVar3) {
                            otVar.f42281a.setAdapter(mtVar3);
                            otVar.f42281a.setFastScrollVisible(false);
                        }
                    }
                    mtVar2.l();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.rt.P((org.telegram.ui.rt) this.f27087b, (TLRPC.Updates) this.f27088c);
                return;
            case 20:
                org.telegram.ui.cy.d0((org.telegram.ui.cy) this.f27087b, (String) this.f27088c);
                return;
            case 21:
                hi.m3.j(((org.telegram.ui.cy) this.f27087b).currentAccount, ((TLRPC.TL_attachMenuBot) this.f27088c).bot_id, null);
                return;
            case 22:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.f27087b;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.f27088c;
                org.telegram.ui.ActionBar.k3 k3Var = k3VarArr[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                    k3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.cv(cyVar, 25), 300L);
                return;
            case 23:
                org.telegram.ui.cy cyVar2 = (org.telegram.ui.cy) this.f27087b;
                ArrayList<Long> arrayList9 = (ArrayList) this.f27088c;
                MessagesController messagesController = cyVar2.getMessagesController();
                if (cyVar2.W2 == 0 && cyVar2.Y2 == 0) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                messagesController.addDialogToFolder(arrayList9, i12, -1, null, 0L);
                return;
            case 24:
                CharSequence charSequence = (CharSequence) this.f27088c;
                org.telegram.ui.cy cyVar3 = ((org.telegram.ui.kw) this.f27087b).f41076a;
                cyVar3.H2 = null;
                qr0 qr0Var = cyVar3.G2;
                if (qr0Var != null && qr0Var.h) {
                    qr0Var.e(charSequence, false);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ActionBar.r2[] r2VarArr = (org.telegram.ui.ActionBar.r2[]) this.f27088c;
                ((org.telegram.ui.yw) this.f27087b).f46121b.removeSelfFromStack();
                if (r2VarArr[1] != null) {
                    r2VarArr[0].removeSelfFromStack();
                    r2VarArr[1].finishFragment();
                    return;
                }
                r2VarArr[0].finishFragment();
                return;
            case 26:
                ArrayList arrayList10 = (ArrayList) this.f27088c;
                org.telegram.ui.cy cyVar4 = ((org.telegram.ui.rx) this.f27087b).f43310b;
                cyVar4.f38696z3 = 2;
                cyVar4.I4(true, true);
                cyVar4.w3();
                while (i13 < arrayList10.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList10.get(i13)).f22031id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList10.get(i13);
                    if (cyVar4.getMessagesController().isForum(j10) || cyVar4.getMessagesController().isMonoForumWithManageRights(j10)) {
                        cyVar4.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    cyVar4.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController2 = cyVar4.getMessagesController();
                    int i18 = dialog.top_message;
                    messagesController2.markDialogAsRead(j10, i18, i18, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                return;
            case 27:
                ((org.telegram.ui.rx) this.f27087b).d((MessagesController.DialogFilter) this.f27088c);
                return;
            case 28:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) this.f27087b;
                org.telegram.ui.un unVar = oyVar.f42304a;
                cz0 cz0Var = new cz0(unVar.getParentActivity(), oyVar.f42304a, ((MessageObject) this.f27088c).getInputStickerSet(), null, unVar.Y, unVar.getResourceProvider());
                cz0Var.setCalcMandatoryInsets(unVar.F9());
                unVar.showDialog(cz0Var);
                return;
            default:
                org.telegram.ui.jz jzVar = (org.telegram.ui.jz) this.f27087b;
                jzVar.getClass();
                ((org.telegram.ui.ActionBar.e2) this.f27088c).dismiss();
                org.telegram.ui.kz kzVar = jzVar.E;
                org.telegram.ui.lz lzVar = kzVar.f41091c;
                Utilities.Callback callback = lzVar.f41410w;
                if (callback != null) {
                    callback.run(lzVar.d);
                }
                kzVar.f41091c.finishFragment();
                return;
        }
    }
}
