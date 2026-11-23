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
public final class fm0 implements Runnable {
    public final int f35262a;
    public final Object f35263b;
    public final Object f35264c;

    public fm0(int i7, Object obj, Object obj2) {
        this.f35262a = i7;
        this.f35263b = obj;
        this.f35264c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        long j3;
        int i10;
        String str;
        int i11 = 2;
        ArrayList arrayList = null;
        switch (this.f35262a) {
            case 0:
                ((nm0) this.f35263b).S();
                lc.b0((org.telegram.ui.cx) this.f35264c).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                return;
            case 1:
                ((zm0) this.f35263b).sendAccessibilityEvent((View) this.f35264c, 4);
                return;
            case 2:
                xe xeVar = (xe) this.f35263b;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f35264c;
                if (bnVar != null) {
                    bnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    xeVar.dismiss();
                    return;
                }
                return;
            case 3:
                ((WindowManager) this.f35264c).removeView(((xe) this.f35263b).B);
                return;
            case 4:
                ap0 ap0Var = (ap0) this.f35263b;
                TLObject tLObject = (TLObject) this.f35264c;
                if (tLObject != null) {
                    ap0Var.f33567g2 = (TLRPC.TL_exportedMessageLink) tLObject;
                    ap0Var.b1();
                    if (ap0Var.f33569i2) {
                        ap0Var.N0();
                    }
                }
                ap0Var.f33568h2 = false;
                return;
            case 5:
                fi.i6 i6Var = (fi.i6) this.f35264c;
                jq0 jq0Var = ((jt0) this.f35263b).f36618c0;
                if (jq0Var != null) {
                    int i12 = i6Var.f12144a;
                    jq0Var.f50348b.e(i12, jq0Var.d.i(i12));
                    return;
                }
                return;
            case 6:
                ds0 ds0Var = (ds0) this.f35263b;
                bi.t2 t2Var = (bi.t2) this.f35264c;
                ds0Var.G = null;
                ds0Var.H = null;
                t2Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new s60(t2Var, 20)).start();
                return;
            case 7:
                di.p8 p8Var = (di.p8) this.f35263b;
                p8Var.f9546e = !p8Var.f9546e;
                ((Runnable[]) this.f35264c)[0].run();
                p8Var.k(true);
                return;
            case 8:
                lc.b0(((ur0) this.f35263b).f40569f.f36684y1).Q(2131623990, 36, org.telegram.messenger.hd.a0(null, null, 2131742570, ((TLRPC.Chat) this.f35264c).title)).k(true);
                return;
            case 9:
                gs0 gs0Var = (gs0) this.f35263b;
                String str2 = (String) this.f35264c;
                if (!gs0Var.f35665w.f36678w1[gs0Var.f35663r].f42514a.isEmpty() && ((i7 = gs0Var.f35663r) == 1 || i7 == 4)) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, gs0Var.f35665w.f36678w1[i7].f42514a);
                    int e12 = gjVar.e1();
                    long B0 = org.telegram.messenger.gj.B0(gjVar.f24213k);
                    jt0 jt0Var = gs0Var.f35665w;
                    if (jt0Var.f36648m1 == jt0Var.f36684y1.getUserConfig().e()) {
                        j3 = gjVar.P1();
                    } else {
                        j3 = 0;
                    }
                    gs0Var.F(e12, B0, j3, str2);
                } else if (gs0Var.f35663r == 3) {
                    jt0 jt0Var2 = gs0Var.f35665w;
                    gs0Var.F(0, jt0Var2.f36648m1, jt0Var2.G, str2);
                }
                int i13 = gs0Var.f35663r;
                if (i13 == 1 || i13 == 4) {
                    ArrayList arrayList2 = new ArrayList(gs0Var.f35665w.f36678w1[gs0Var.f35663r].f42514a);
                    gs0Var.f35664s++;
                    Utilities.f22812g.c(new es0((Object) gs0Var, (Object) str2, (Object) arrayList2, 0));
                    return;
                }
                return;
            case 10:
                gs0 gs0Var2 = (gs0) this.f35263b;
                ArrayList arrayList3 = (ArrayList) this.f35264c;
                jt0 jt0Var3 = gs0Var2.f35665w;
                boolean z10 = jt0Var3.Y0;
                ds0[] ds0VarArr = jt0Var3.f36651n0;
                if (z10) {
                    gs0Var2.f35664s--;
                    int b10 = gs0Var2.b();
                    gs0Var2.d = arrayList3;
                    int b11 = gs0Var2.b();
                    if (gs0Var2.f35664s == 0 || b11 != 0) {
                        jt0Var3.B1(false);
                    }
                    for (int i14 = 0; i14 < ds0VarArr.length; i14++) {
                        ds0 ds0Var2 = ds0VarArr[i14];
                        if (ds0Var2.F == gs0Var2.f35663r) {
                            if (gs0Var2.f35664s == 0 && b11 == 0) {
                                ds0Var2.f34564w.d.setText(org.telegram.messenger.hd.N0(2131747974, "NoResult"));
                                ds0VarArr[i14].f34564w.f37997f.setVisibility(8);
                                ds0VarArr[i14].f34564w.e(false, true);
                            } else if (b10 == 0) {
                                jt0Var3.D(ds0Var2.h, 0, null);
                            }
                        }
                    }
                    gs0Var2.f();
                    return;
                }
                return;
            case 11:
                org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(org.telegram.messenger.k10.f24968t0);
                Boolean bool = Boolean.FALSE;
                f10.m(217, bool, (TLObject) this.f35263b, (TLRPC.Document) this.f35264c, null, bool);
                return;
            case 12:
                org.telegram.messenger.np.u1(((ww0) this.f35263b).f41906a.f33652a).t5((TLRPC.EmojiStatus) this.f35264c, null);
                return;
            case 13:
                a21 a21Var = (a21) this.f35263b;
                org.telegram.messenger.np.u1(a21Var.f33287e).f25968t7.d((ArrayList) this.f35264c, -a21Var.f33289f);
                int i15 = a21.m0;
                return;
            case 14:
                a21 a21Var2 = (a21) this.f35263b;
                a21Var2.getClass();
                org.telegram.messenger.np.u1(a21Var2.f33287e).b3(0, ((TLRPC.Updates) this.f35264c).chats.get(0).f28434id, true);
                return;
            case 15:
                org.telegram.ui.Cells.m1 m1Var = (org.telegram.ui.Cells.m1) this.f35263b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f35264c;
                if (m1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    m1Var.h0(i11);
                    return;
                }
                return;
            case 16:
                org.telegram.messenger.ls lsVar = (org.telegram.messenger.ls) this.f35263b;
                g21 g21Var = (g21) this.f35264c;
                lsVar.n(g21Var, 142);
                lsVar.n(g21Var, 143);
                return;
            case 17:
                b31 b31Var = (b31) this.f35263b;
                TLObject tLObject2 = (TLObject) this.f35264c;
                org.telegram.messenger.vt vtVar = b31Var.f33728t1;
                b31Var.f33722m1 = null;
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
                    org.telegram.messenger.ls.e().k(295, 1, org.telegram.messenger.hd.N0(2131743701, null));
                    return;
                }
                org.telegram.messenger.f3.o(null, 2131743701, new lc((FrameLayout) b31Var.f30176b, b31Var.J0), null);
                x21 x21Var = b31Var.f33732x1.f42658e;
                String str3 = b31Var.f33731w1;
                b31Var.f33730v1 = str3;
                x21Var.setText(b31.P0(str3, null, null));
                return;
            case 18:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.f35263b;
                ((org.telegram.ui.ActionBar.g1) this.f35264c).d(true);
                s31.a(ckVar.getContext(), ckVar.d);
                return;
            case 19:
                ((org.telegram.messenger.a10) this.f35264c).J(((org.telegram.ui.ck) this.f35263b).f39471b, false, false);
                return;
            case 20:
                UndoView undoView = (UndoView) this.f35263b;
                TLObject tLObject3 = (TLObject) this.f35264c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.f33224s.presentFragment(new org.telegram.ui.ml0((TLRPC.PaymentReceipt) tLObject3));
                    return;
                }
                int i16 = UndoView.f33207j0;
                undoView.getClass();
                return;
            case 21:
                ((o41) this.f35263b).E.onClick((org.telegram.ui.Cells.r8) this.f35264c);
                return;
            case 22:
                i61 i61Var = (i61) this.f35263b;
                e2.v0 v0Var = (e2.v0) this.f35264c;
                Throwable cause = v0Var.getCause();
                if ((cause instanceof u2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.np.g1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = i61.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList4 = i61Var.O;
                    if (arrayList4 != null) {
                        int i17 = 0;
                        while (i17 < arrayList4.size()) {
                            f61 f61Var = (f61) arrayList4.get(i17);
                            int i18 = 0;
                            while (true) {
                                ArrayList arrayList5 = f61Var.d;
                                if (i18 < arrayList5.size()) {
                                    h61 h61Var = (h61) arrayList5.get(i18);
                                    if (!TextUtils.isEmpty(h61Var.f35810m) && !i61.D0(h61Var.f35810m)) {
                                        arrayList5.remove(i18);
                                        i18--;
                                    }
                                    i18++;
                                } else {
                                    if (arrayList5.isEmpty()) {
                                        arrayList4.remove(i17);
                                        i17--;
                                    }
                                    i17++;
                                }
                            }
                        }
                        arrayList = arrayList4;
                    }
                    i61Var.O = arrayList;
                    if (arrayList != null) {
                        i61Var.k0(arrayList, i61Var.P);
                        return;
                    }
                    return;
                }
                TextureView textureView = i61Var.f36170n;
                if (textureView != null && ((!i61Var.F && (cause instanceof u2.p)) || (cause instanceof d3.u))) {
                    i61Var.F = true;
                    if (i61Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(i61Var.f36170n);
                            viewGroup.removeView(i61Var.f36170n);
                            viewGroup.addView(i61Var.f36170n, indexOfChild);
                        }
                        org.telegram.messenger.r5 r5Var = i61Var.f36157b;
                        if (r5Var != null) {
                            r5Var.postRunnable(new w51(i61Var, 1));
                            return;
                        }
                        l2.f0 f0Var = i61Var.d;
                        TextureView textureView2 = i61Var.f36170n;
                        f0Var.F1();
                        if (textureView2 != null && textureView2 == f0Var.X) {
                            f0Var.F1();
                            f0Var.s1();
                            f0Var.x1(null);
                            f0Var.q1(0, 0);
                        }
                        i61Var.d.z1(i61Var.f36170n);
                        ArrayList arrayList6 = i61Var.O;
                        if (arrayList6 != null) {
                            i61Var.k0(arrayList6, i61Var.P);
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
            case 23:
                ((i61) ((oi.b6) this.f35263b).f22032f).L.x(true, (float[]) this.f35264c);
                return;
            case 24:
                o61 o61Var = (o61) this.f35263b;
                Bitmap bitmap = (Bitmap) this.f35264c;
                if (bitmap != null) {
                    if (o61Var.f38140x != null) {
                        Bitmap bitmap2 = o61Var.f38139w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        o61Var.f38139w = o61Var.f38140x;
                    }
                    o61Var.f38140x = bitmap;
                    Bitmap bitmap3 = o61Var.f38140x;
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
                o61Var.f38132f = null;
                return;
            case 25:
                final y71 y71Var = (y71) this.f35263b;
                y71Var.f42340e.f42712b.evaluateJavascript((String) this.f35264c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        y71 y71Var2 = y71.this;
                        String[] strArr = y71Var2.f42339c;
                        String str5 = strArr[0];
                        String str6 = y71Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        y71Var2.f42338b.countDown();
                    }
                });
                return;
            case 26:
                ((org.telegram.ui.Components.voip.q) this.f35263b).f41267a.setOnClickListener((View.OnClickListener) this.f35264c);
                return;
            case 27:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.f35263b;
                Bitmap bitmap4 = (Bitmap) this.f35264c;
                HashMap hashMap2 = yVar.G.h;
                org.telegram.messenger.u3 u3Var = yVar.f41493x;
                boolean z11 = u3Var.f27156b;
                TLRPC.GroupCallParticipant groupCallParticipant = u3Var.f27155a;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 28:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.f35264c;
                ((org.telegram.ui.Components.voip.k0) this.f35263b).getClass();
                yVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.w(yVar2, 4)).setDuration(150L).start();
                return;
            default:
                ek0 ek0Var = (ek0) this.f35263b;
                Object obj = this.f35264c;
                if (ek0Var != null) {
                    ek0Var.setOnItemClickListener((qj0) obj);
                    return;
                }
                return;
        }
    }

    public fm0(Object obj, Object obj2, Object obj3, int i7) {
        this.f35262a = i7;
        this.f35263b = obj;
        this.f35264c = obj2;
    }
}
