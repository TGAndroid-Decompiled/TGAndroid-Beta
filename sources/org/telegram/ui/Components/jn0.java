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
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PremiumPreviewFragment;
public final class jn0 implements Runnable {
    public final int f36523a;
    public final Object f36524b;
    public final Object f36525c;

    public jn0(int i7, Object obj, Object obj2) {
        this.f36523a = i7;
        this.f36524b = obj;
        this.f36525c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        long j3;
        int i10;
        String str;
        ArrayList arrayList;
        ek0 ek0Var;
        int i11 = 2;
        ArrayList arrayList2 = null;
        int i12 = 0;
        switch (this.f36523a) {
            case 0:
                xe xeVar = (xe) this.f36524b;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f36525c;
                if (bnVar != null) {
                    bnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    xeVar.dismiss();
                    return;
                }
                return;
            case 1:
                ((WindowManager) this.f36525c).removeView(((xe) this.f36524b).B);
                return;
            case 2:
                ap0 ap0Var = (ap0) this.f36524b;
                TLObject tLObject = (TLObject) this.f36525c;
                if (tLObject != null) {
                    ap0Var.f33551g2 = (TLRPC.TL_exportedMessageLink) tLObject;
                    ap0Var.b1();
                    if (ap0Var.f33553i2) {
                        ap0Var.N0();
                    }
                }
                ap0Var.f33552h2 = false;
                return;
            case 3:
                fi.i6 i6Var = (fi.i6) this.f36525c;
                jq0 jq0Var = ((jt0) this.f36524b).f36572c0;
                if (jq0Var != null) {
                    int i13 = i6Var.f12104a;
                    jq0Var.f50351b.e(i13, jq0Var.d.i(i13));
                    return;
                }
                return;
            case 4:
                ds0 ds0Var = (ds0) this.f36524b;
                bi.v2 v2Var = (bi.v2) this.f36525c;
                ds0Var.G = null;
                ds0Var.H = null;
                v2Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new s60(v2Var, 20)).start();
                return;
            case 5:
                di.p8 p8Var = (di.p8) this.f36524b;
                p8Var.f9509e = !p8Var.f9509e;
                ((Runnable[]) this.f36525c)[0].run();
                p8Var.k(true);
                return;
            case 6:
                lc.b0(((ur0) this.f36524b).f40526f.f36638y1).Q(2131623990, 36, org.telegram.messenger.hd.a0(null, null, 2131742572, ((TLRPC.Chat) this.f36525c).title)).k(true);
                return;
            case 7:
                gs0 gs0Var = (gs0) this.f36524b;
                String str2 = (String) this.f36525c;
                if (!gs0Var.f35625w.f36632w1[gs0Var.f35623r].f42474a.isEmpty() && ((i7 = gs0Var.f35623r) == 1 || i7 == 4)) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, gs0Var.f35625w.f36632w1[i7].f42474a);
                    int e12 = gjVar.e1();
                    long B0 = org.telegram.messenger.gj.B0(gjVar.f24177k);
                    jt0 jt0Var = gs0Var.f35625w;
                    if (jt0Var.f36602m1 == jt0Var.f36638y1.getUserConfig().e()) {
                        j3 = gjVar.P1();
                    } else {
                        j3 = 0;
                    }
                    gs0Var.F(e12, B0, j3, str2);
                } else if (gs0Var.f35623r == 3) {
                    jt0 jt0Var2 = gs0Var.f35625w;
                    gs0Var.F(0, jt0Var2.f36602m1, jt0Var2.G, str2);
                }
                int i14 = gs0Var.f35623r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(gs0Var.f35625w.f36632w1[gs0Var.f35623r].f42474a);
                    gs0Var.f35624s++;
                    Utilities.f22776g.c(new es0((Object) gs0Var, (Object) str2, (Object) arrayList3, 0));
                    return;
                }
                return;
            case 8:
                gs0 gs0Var2 = (gs0) this.f36524b;
                ArrayList arrayList4 = (ArrayList) this.f36525c;
                jt0 jt0Var3 = gs0Var2.f35625w;
                boolean z10 = jt0Var3.Y0;
                ds0[] ds0VarArr = jt0Var3.f36605n0;
                if (z10) {
                    gs0Var2.f35624s--;
                    int b10 = gs0Var2.b();
                    gs0Var2.d = arrayList4;
                    int b11 = gs0Var2.b();
                    if (gs0Var2.f35624s == 0 || b11 != 0) {
                        jt0Var3.B1(false);
                    }
                    for (int i15 = 0; i15 < ds0VarArr.length; i15++) {
                        ds0 ds0Var2 = ds0VarArr[i15];
                        if (ds0Var2.F == gs0Var2.f35623r) {
                            if (gs0Var2.f35624s == 0 && b11 == 0) {
                                ds0Var2.f34543w.d.setText(org.telegram.messenger.hd.N0(2131747974, "NoResult"));
                                ds0VarArr[i15].f34543w.f37963f.setVisibility(8);
                                ds0VarArr[i15].f34543w.e(false, true);
                            } else if (b10 == 0) {
                                jt0Var3.D(ds0Var2.h, 0, null);
                            }
                        }
                    }
                    gs0Var2.f();
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(org.telegram.messenger.k10.f24932t0);
                Boolean bool = Boolean.FALSE;
                f10.m(217, bool, (TLObject) this.f36524b, (TLRPC.Document) this.f36525c, null, bool);
                return;
            case 10:
                org.telegram.messenger.np.u1(((ww0) this.f36524b).f41862a.f33629a).t5((TLRPC.EmojiStatus) this.f36525c, null);
                return;
            case 11:
                a21 a21Var = (a21) this.f36524b;
                org.telegram.messenger.np.u1(a21Var.f33253e).f25932t7.d((ArrayList) this.f36525c, -a21Var.f33255f);
                int i16 = a21.m0;
                return;
            case 12:
                a21 a21Var2 = (a21) this.f36524b;
                a21Var2.getClass();
                org.telegram.messenger.np.u1(a21Var2.f33253e).b3(0, ((TLRPC.Updates) this.f36525c).chats.get(0).f28398id, true);
                return;
            case 13:
                org.telegram.ui.Cells.m1 m1Var = (org.telegram.ui.Cells.m1) this.f36524b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f36525c;
                if (m1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    m1Var.h0(i11);
                    return;
                }
                return;
            case 14:
                org.telegram.messenger.ls lsVar = (org.telegram.messenger.ls) this.f36524b;
                g21 g21Var = (g21) this.f36525c;
                lsVar.n(g21Var, 142);
                lsVar.n(g21Var, 143);
                return;
            case 15:
                b31 b31Var = (b31) this.f36524b;
                TLObject tLObject2 = (TLObject) this.f36525c;
                org.telegram.messenger.vt vtVar = b31Var.f33705t1;
                b31Var.f33699m1 = null;
                if (tLObject2 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject2;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        b31Var.P1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (vtVar != null) {
                            vtVar.set(richMessage);
                            b31Var.I1.D(vtVar);
                            return;
                        }
                        return;
                    }
                }
                if (b31Var.P1) {
                    b31Var.dismiss();
                    org.telegram.messenger.ls.e().k(295, 1, org.telegram.messenger.hd.N0(2131743703, null));
                    return;
                }
                org.telegram.messenger.f3.o(null, 2131743703, new lc((FrameLayout) b31Var.f30142b, b31Var.J0), null);
                x21 x21Var = b31Var.f33709x1.f42615e;
                String str3 = b31Var.f33708w1;
                b31Var.f33707v1 = str3;
                x21Var.setText(b31.P0(str3, null, null));
                return;
            case 16:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.f36524b;
                ((org.telegram.ui.ActionBar.g1) this.f36525c).d(true);
                s31.a(ckVar.getContext(), ckVar.d);
                return;
            case 17:
                ((org.telegram.messenger.a10) this.f36525c).J(((org.telegram.ui.ck) this.f36524b).f39426b, false, false);
                return;
            case 18:
                UndoView undoView = (UndoView) this.f36524b;
                TLObject tLObject3 = (TLObject) this.f36525c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.f33190s.presentFragment(new org.telegram.ui.ml0((TLRPC.PaymentReceipt) tLObject3));
                    return;
                }
                int i17 = UndoView.f33173j0;
                undoView.getClass();
                return;
            case 19:
                ((o41) this.f36524b).E.onClick((org.telegram.ui.Cells.r8) this.f36525c);
                return;
            case 20:
                i61 i61Var = (i61) this.f36524b;
                e2.v0 v0Var = (e2.v0) this.f36525c;
                Throwable cause = v0Var.getCause();
                if ((cause instanceof u2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.np.g1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = i61.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = i61Var.O;
                    if (arrayList5 != null) {
                        int i18 = 0;
                        while (i18 < arrayList5.size()) {
                            f61 f61Var = (f61) arrayList5.get(i18);
                            int i19 = 0;
                            while (true) {
                                ArrayList arrayList6 = f61Var.d;
                                if (i19 < arrayList6.size()) {
                                    h61 h61Var = (h61) arrayList6.get(i19);
                                    if (!TextUtils.isEmpty(h61Var.f35762m) && !i61.D0(h61Var.f35762m)) {
                                        arrayList6.remove(i19);
                                        i19--;
                                    }
                                    i19++;
                                } else {
                                    if (arrayList6.isEmpty()) {
                                        arrayList5.remove(i18);
                                        i18--;
                                    }
                                    i18++;
                                }
                            }
                        }
                        arrayList2 = arrayList5;
                    }
                    i61Var.O = arrayList2;
                    if (arrayList2 != null) {
                        i61Var.k0(arrayList2, i61Var.P);
                        return;
                    }
                    return;
                }
                TextureView textureView = i61Var.f36124n;
                if (textureView != null && ((!i61Var.F && (cause instanceof u2.p)) || (cause instanceof d3.u))) {
                    i61Var.F = true;
                    if (i61Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(i61Var.f36124n);
                            viewGroup.removeView(i61Var.f36124n);
                            viewGroup.addView(i61Var.f36124n, indexOfChild);
                        }
                        org.telegram.messenger.r5 r5Var = i61Var.f36111b;
                        if (r5Var != null) {
                            r5Var.postRunnable(new w51(i61Var, 1));
                            return;
                        }
                        l2.f0 f0Var = i61Var.d;
                        TextureView textureView2 = i61Var.f36124n;
                        f0Var.F1();
                        if (textureView2 != null && textureView2 == f0Var.X) {
                            f0Var.F1();
                            f0Var.s1();
                            f0Var.x1(null);
                            f0Var.q1(0, 0);
                        }
                        i61Var.d.z1(i61Var.f36124n);
                        ArrayList arrayList7 = i61Var.O;
                        if (arrayList7 != null) {
                            i61Var.k0(arrayList7, i61Var.P);
                        } else if (i61Var.V) {
                            i61Var.l0(i61Var.R, i61Var.T, i61Var.S, i61Var.U);
                        } else {
                            i61Var.j0(i61Var.R, i61Var.T);
                        }
                        i61Var.h0();
                        return;
                    }
                    return;
                }
                i61Var.K.onError(i61Var, v0Var);
                return;
            case 21:
                ((i61) ((oi.a6) this.f36524b).f21969f).L.x(true, (float[]) this.f36525c);
                return;
            case 22:
                o61 o61Var = (o61) this.f36524b;
                Bitmap bitmap = (Bitmap) this.f36525c;
                if (bitmap != null) {
                    if (o61Var.f38106x != null) {
                        Bitmap bitmap2 = o61Var.f38105w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        o61Var.f38105w = o61Var.f38106x;
                    }
                    o61Var.f38106x = bitmap;
                    Bitmap bitmap3 = o61Var.f38106x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    o61Var.H = bitmapShader;
                    bitmapShader.setLocalMatrix(o61Var.M);
                    o61Var.K.setShader(o61Var.H);
                    o61Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i10 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = o61Var.getLayoutParams();
                    if (o61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i10) {
                        layoutParams.width = L;
                        layoutParams.height = i10;
                        o61Var.setVisibility(0);
                        o61Var.requestLayout();
                    }
                }
                o61Var.f38098f = null;
                return;
            case 23:
                final y71 y71Var = (y71) this.f36524b;
                y71Var.f42317e.f42669b.evaluateJavascript((String) this.f36525c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        y71 y71Var2 = y71.this;
                        String[] strArr = y71Var2.f42316c;
                        String str5 = strArr[0];
                        String str6 = y71Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        y71Var2.f42315b.countDown();
                    }
                });
                return;
            case 24:
                ((org.telegram.ui.Components.voip.q) this.f36524b).f41228a.setOnClickListener((View.OnClickListener) this.f36525c);
                return;
            case 25:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.f36524b;
                Bitmap bitmap4 = (Bitmap) this.f36525c;
                HashMap hashMap2 = yVar.G.h;
                org.telegram.messenger.u3 u3Var = yVar.f41454x;
                boolean z11 = u3Var.f27120b;
                TLRPC.GroupCallParticipant groupCallParticipant = u3Var.f27119a;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 26:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.f36525c;
                ((org.telegram.ui.Components.voip.k0) this.f36524b).getClass();
                yVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.w(yVar2, 4)).setDuration(150L).start();
                return;
            case 27:
                ek0 ek0Var2 = (ek0) this.f36524b;
                Object obj = this.f36525c;
                if (ek0Var2 != null) {
                    ek0Var2.setOnItemClickListener((qj0) obj);
                    return;
                }
                return;
            case 28:
                ek ekVar = (ek) this.f36524b;
                String lowerCase = ((String) this.f36525c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new jn0(29, ekVar, new ArrayList()));
                    return;
                }
                String M3 = org.telegram.messenger.g0.M3(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = ekVar.f34826f;
                int size = arrayList9.size();
                while (i12 < size) {
                    Object obj2 = arrayList9.get(i12);
                    i12++;
                    org.telegram.ui.ps psVar = (org.telegram.ui.ps) obj2;
                    String str4 = psVar.f50902a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.g0.M3(psVar.f50902a).toLowerCase();
                    String str6 = psVar.f50903b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.g0.M3(psVar.f50903b).toLowerCase();
                    String str7 = psVar.f50904c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        str5 = "+".concat(str7);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList9;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(M3) && !lowerCase3.contains(" ".concat(M3)) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(M3) && !lowerCase5.contains(" ".concat(M3)) && !str7.startsWith(lowerCase) && !str5.startsWith(lowerCase)) {
                            arrayList9 = arrayList;
                        }
                    } else {
                        arrayList = arrayList9;
                    }
                    arrayList8.add(psVar);
                    arrayList9 = arrayList;
                }
                org.telegram.messenger.g0.g3(new jn0(29, ekVar, arrayList8));
                return;
            default:
                ek ekVar2 = (ek) this.f36524b;
                ArrayList arrayList10 = (ArrayList) this.f36525c;
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) ekVar2.f34827n;
                if (tsVar.f52343f) {
                    ekVar2.f34825e = arrayList10;
                    if (tsVar.f52342e && (ek0Var = tsVar.f52339a) != null) {
                        v4.h0 adapter = ek0Var.getAdapter();
                        ek ekVar3 = tsVar.d;
                        if (adapter != ekVar3) {
                            tsVar.f52339a.setAdapter(ekVar3);
                            tsVar.f52339a.setFastScrollVisible(false);
                        }
                    }
                    ekVar2.f();
                    return;
                }
                return;
        }
    }

    public jn0(Object obj, Object obj2, Object obj3, int i7) {
        this.f36523a = i7;
        this.f36524b = obj;
        this.f36525c = obj2;
    }
}
