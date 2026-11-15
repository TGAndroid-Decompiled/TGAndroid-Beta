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
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PremiumPreviewFragment;
public final class hh0 implements Runnable {
    public final int f35246a;
    public final Object f35247b;
    public final Object f35248c;

    public hh0(int i7, Object obj, Object obj2) {
        this.f35246a = i7;
        this.f35247b = obj;
        this.f35248c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        int indexOf;
        int K;
        int i7;
        int i10;
        long j11 = 0;
        int i11 = 2;
        ArrayList arrayList = null;
        switch (this.f35246a) {
            case 0:
                lh0 lh0Var = (lh0) this.f35247b;
                ArrayList arrayList2 = (ArrayList) this.f35248c;
                ArrayList arrayList3 = lh0Var.f36809r;
                lh0Var.f36808n.addAll(arrayList2);
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    kh0 kh0Var = (kh0) obj;
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList3.size()) {
                            TLObject tLObject = ((kh0) arrayList3.get(i13)).f36421a;
                            if (tLObject instanceof TLRPC.Chat) {
                                j3 = -((TLRPC.Chat) tLObject).f28051id;
                            } else if (tLObject instanceof TLRPC.User) {
                                j3 = ((TLRPC.User) tLObject).f28200id;
                            } else {
                                j3 = 0;
                            }
                            TLObject tLObject2 = kh0Var.f36421a;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject2).f28051id;
                            } else if (tLObject2 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject2).f28200id;
                            } else {
                                j10 = 0;
                            }
                            if (j3 == j10) {
                                if (kh0Var.f36423c > 0) {
                                    ((kh0) arrayList3.get(i13)).f36423c = kh0Var.f36423c;
                                }
                            } else {
                                i13++;
                            }
                        } else {
                            arrayList3.add(kh0Var);
                        }
                    }
                }
                q0.a aVar = lh0Var.f36812x;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                lh0Var.a();
                return;
            case 1:
                cm0 cm0Var = (cm0) this.f35247b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f35248c;
                ArrayList arrayList4 = cm0Var.L;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (K = cm0Var.K()) < cm0Var.b()) {
                    arrayList4.remove(indexOf);
                    cm0Var.s(K + 1 + indexOf);
                    int size2 = cm0Var.f17096k0.f17347e.size();
                    int size3 = arrayList4.size();
                    if (cm0Var.H0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        cm0Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((cm0) this.f35247b).S();
                cc.a0((org.telegram.ui.yw) this.f35248c).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                return;
            case 3:
                ((om0) this.f35247b).sendAccessibilityEvent((View) this.f35248c, 4);
                return;
            case 4:
                oe oeVar = (oe) this.f35247b;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.f35248c;
                if (anVar != null) {
                    anVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    oeVar.dismiss();
                    return;
                }
                return;
            case 5:
                ((WindowManager) this.f35248c).removeView(((oe) this.f35247b).B);
                return;
            case 6:
                po0 po0Var = (po0) this.f35247b;
                TLObject tLObject3 = (TLObject) this.f35248c;
                if (tLObject3 != null) {
                    po0Var.f38345g2 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    po0Var.a1();
                    if (po0Var.f38347i2) {
                        po0Var.M0();
                    }
                }
                po0Var.f38346h2 = false;
                return;
            case 7:
                fi.l6 l6Var = (fi.l6) this.f35248c;
                zp0 zp0Var = ((ys0) this.f35247b).f42086c0;
                if (zp0Var != null) {
                    int i14 = l6Var.f11998a;
                    zp0Var.f48446b.d(i14, zp0Var.d.i(i14));
                    return;
                }
                return;
            case 8:
                tr0 tr0Var = (tr0) this.f35247b;
                bi.v1 v1Var = (bi.v1) this.f35248c;
                tr0Var.G = null;
                tr0Var.H = null;
                v1Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new h60(v1Var, 20)).start();
                return;
            case 9:
                di.l8 l8Var = (di.l8) this.f35247b;
                l8Var.f8995e = !l8Var.f8995e;
                ((Runnable[]) this.f35248c)[0].run();
                l8Var.j(true);
                return;
            case 10:
                cc.a0(((kr0) this.f35247b).f36582f.f42152y1).Q(2131623990, 36, org.telegram.messenger.hd.a0(null, null, 2131742836, ((TLRPC.Chat) this.f35248c).title)).k(true);
                return;
            case 11:
                vr0 vr0Var = (vr0) this.f35247b;
                String str = (String) this.f35248c;
                if (!vr0Var.f41143w.f42146w1[vr0Var.f41141r].f37681a.isEmpty() && ((i7 = vr0Var.f41141r) == 1 || i7 == 4)) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, vr0Var.f41143w.f42146w1[i7].f37681a);
                    int e12 = gjVar.e1();
                    long B0 = org.telegram.messenger.gj.B0(gjVar.f23819k);
                    ys0 ys0Var = vr0Var.f41143w;
                    if (ys0Var.f42116m1 == ys0Var.f42152y1.getUserConfig().e()) {
                        j11 = gjVar.P1();
                    }
                    vr0Var.F(e12, B0, j11, str);
                } else if (vr0Var.f41141r == 3) {
                    ys0 ys0Var2 = vr0Var.f41143w;
                    vr0Var.F(0, ys0Var2.f42116m1, ys0Var2.G, str);
                }
                int i15 = vr0Var.f41141r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList5 = new ArrayList(vr0Var.f41143w.f42146w1[vr0Var.f41141r].f37681a);
                    vr0Var.f41142s++;
                    Utilities.f22418g.c(new yf(vr0Var, str, arrayList5, 26));
                    return;
                }
                return;
            case 12:
                vr0 vr0Var2 = (vr0) this.f35247b;
                ArrayList arrayList6 = (ArrayList) this.f35248c;
                ys0 ys0Var3 = vr0Var2.f41143w;
                boolean z10 = ys0Var3.Y0;
                tr0[] tr0VarArr = ys0Var3.f42119n0;
                if (z10) {
                    vr0Var2.f41142s--;
                    int b10 = vr0Var2.b();
                    vr0Var2.d = arrayList6;
                    int b11 = vr0Var2.b();
                    if (vr0Var2.f41142s == 0 || b11 != 0) {
                        ys0Var3.B1(false);
                    }
                    for (int i16 = 0; i16 < tr0VarArr.length; i16++) {
                        tr0 tr0Var2 = tr0VarArr[i16];
                        if (tr0Var2.F == vr0Var2.f41141r) {
                            if (vr0Var2.f41142s == 0 && b11 == 0) {
                                tr0Var2.f39795w.d.setText(org.telegram.messenger.hd.M0(2131748167, "NoResult"));
                                tr0VarArr[i16].f39795w.f33710f.setVisibility(8);
                                tr0VarArr[i16].f39795w.e(false, true);
                            } else if (b10 == 0) {
                                ys0Var3.D(tr0Var2.h, 0, null);
                            }
                        }
                    }
                    vr0Var2.f();
                    return;
                }
                return;
            case 13:
                org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(org.telegram.messenger.m10.f24940t0);
                Boolean bool = Boolean.FALSE;
                f10.m(215, bool, (TLObject) this.f35247b, (TLRPC.Document) this.f35248c, null, bool);
                return;
            case 14:
                org.telegram.messenger.np.s1(((nw0) this.f35247b).f37733a.f39069a).i5((TLRPC.EmojiStatus) this.f35248c, null);
                return;
            case 15:
                v01 v01Var = (v01) this.f35247b;
                String str2 = (String) this.f35248c;
                v01Var.P = null;
                org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(v01Var.f40208a).f25386r7;
                long j12 = -v01Var.f40210b;
                gh ghVar = new gh(11, v01Var, str2);
                h00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = h00Var.getMessagesController().j1(-j12);
                tL_messages_getForumTopics.f28271q = str2;
                tL_messages_getForumTopics.limit = 50;
                v01Var.O = h00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.mj(h00Var, j12, ghVar, 10));
                return;
            case 16:
                p11 p11Var = (p11) this.f35247b;
                org.telegram.messenger.np.s1(p11Var.f38150e).f25386r7.d((ArrayList) this.f35248c, -p11Var.f38152f);
                int i17 = p11.m0;
                return;
            case 17:
                p11 p11Var2 = (p11) this.f35247b;
                p11Var2.getClass();
                org.telegram.messenger.np.s1(p11Var2.f38150e).V2(0, ((TLRPC.Updates) this.f35248c).chats.get(0).f28051id, true);
                return;
            case 18:
                org.telegram.messenger.ns nsVar = (org.telegram.messenger.ns) this.f35247b;
                v11 v11Var = (v11) this.f35248c;
                nsVar.n(v11Var, 142);
                nsVar.n(v11Var, 143);
                return;
            case 19:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f35247b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f35248c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    l1Var.e0(i11);
                    return;
                }
                return;
            case 20:
                p21 p21Var = (p21) this.f35247b;
                TLObject tLObject4 = (TLObject) this.f35248c;
                org.telegram.messenger.xt xtVar = p21Var.f38174t1;
                p21Var.f38168m1 = null;
                if (tLObject4 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject4;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        p21Var.P1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (xtVar != null) {
                            xtVar.set(richMessage);
                            p21Var.I1.D(xtVar);
                            return;
                        }
                        return;
                    }
                }
                if (p21Var.P1) {
                    p21Var.dismiss();
                    org.telegram.messenger.ns.e().k(292, 1, org.telegram.messenger.hd.M0(2131743946, null));
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743946, new cc((FrameLayout) p21Var.f29682b, p21Var.J0), null);
                l21 l21Var = p21Var.f38178x1.f37437e;
                String str3 = p21Var.f38177w1;
                p21Var.f38176v1 = str3;
                l21Var.setText(p21.O0(str3, null, null));
                return;
            case 21:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.f35247b;
                ((org.telegram.ui.ActionBar.g1) this.f35248c).d(true);
                f31.a(bkVar.getContext(), bkVar.d);
                return;
            case 22:
                ((org.telegram.messenger.c10) this.f35248c).J(((org.telegram.ui.bk) this.f35247b).f34503b, false, false);
                return;
            case 23:
                UndoView undoView = (UndoView) this.f35247b;
                TLObject tLObject5 = (TLObject) this.f35248c;
                if (tLObject5 instanceof TLRPC.PaymentReceipt) {
                    undoView.f32791s.presentFragment(new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject5));
                    return;
                }
                int i18 = UndoView.f32774j0;
                undoView.getClass();
                return;
            case 24:
                ((b41) this.f35247b).D.onClick((org.telegram.ui.Cells.p8) this.f35248c);
                return;
            case 25:
                u51 u51Var = (u51) this.f35247b;
                e2.v0 v0Var = (e2.v0) this.f35248c;
                Throwable cause = v0Var.getCause();
                if ((cause instanceof u2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.np.e1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = u51.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = u51Var.O;
                    if (arrayList7 != null) {
                        int i19 = 0;
                        while (i19 < arrayList7.size()) {
                            r51 r51Var = (r51) arrayList7.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList8 = r51Var.d;
                                if (i20 < arrayList8.size()) {
                                    t51 t51Var = (t51) arrayList8.get(i20);
                                    if (!TextUtils.isEmpty(t51Var.f39553m) && !u51.D0(t51Var.f39553m)) {
                                        arrayList8.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                } else {
                                    if (arrayList8.isEmpty()) {
                                        arrayList7.remove(i19);
                                        i19--;
                                    }
                                    i19++;
                                }
                            }
                        }
                        arrayList = arrayList7;
                    }
                    u51Var.O = arrayList;
                    if (arrayList != null) {
                        u51Var.k0(arrayList, u51Var.P);
                        return;
                    }
                    return;
                }
                TextureView textureView = u51Var.f39927n;
                if (textureView != null && ((!u51Var.F && (cause instanceof u2.p)) || (cause instanceof d3.u))) {
                    u51Var.F = true;
                    if (u51Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(u51Var.f39927n);
                            viewGroup.removeView(u51Var.f39927n);
                            viewGroup.addView(u51Var.f39927n, indexOfChild);
                        }
                        org.telegram.messenger.q5 q5Var = u51Var.f39914b;
                        if (q5Var != null) {
                            q5Var.postRunnable(new w41(u51Var, 2));
                            return;
                        }
                        l2.f0 f0Var = u51Var.d;
                        TextureView textureView2 = u51Var.f39927n;
                        f0Var.F1();
                        if (textureView2 != null && textureView2 == f0Var.X) {
                            f0Var.F1();
                            f0Var.s1();
                            f0Var.x1(null);
                            f0Var.q1(0, 0);
                        }
                        u51Var.d.z1(u51Var.f39927n);
                        ArrayList arrayList9 = u51Var.O;
                        if (arrayList9 != null) {
                            u51Var.k0(arrayList9, u51Var.P);
                        } else if (u51Var.V) {
                            u51Var.l0(u51Var.R, u51Var.T, u51Var.S, u51Var.U);
                        } else {
                            u51Var.j0(u51Var.R, u51Var.T);
                        }
                        u51Var.h0();
                        return;
                    }
                    return;
                }
                u51Var.K.onError(u51Var, v0Var);
                return;
            case 26:
                ((u51) ((oi.z5) this.f35247b).f22202f).L.A(true, (float[]) this.f35248c);
                return;
            case 27:
                a61 a61Var = (a61) this.f35247b;
                Bitmap bitmap = (Bitmap) this.f35248c;
                if (bitmap != null) {
                    if (a61Var.f32904x != null) {
                        Bitmap bitmap2 = a61Var.f32903w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        a61Var.f32903w = a61Var.f32904x;
                    }
                    a61Var.f32904x = bitmap;
                    Bitmap bitmap3 = a61Var.f32904x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    a61Var.H = bitmapShader;
                    bitmapShader.setLocalMatrix(a61Var.M);
                    a61Var.K.setShader(a61Var.H);
                    a61Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i10 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = a61Var.getLayoutParams();
                    if (a61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i10) {
                        layoutParams.width = L;
                        layoutParams.height = i10;
                        a61Var.setVisibility(0);
                        a61Var.requestLayout();
                    }
                }
                a61Var.f32896f = null;
                return;
            case 28:
                final l71 l71Var = (l71) this.f35247b;
                l71Var.f36724e.f37140b.evaluateJavascript((String) this.f35248c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj2) {
                        String str4 = (String) obj2;
                        l71 l71Var2 = l71.this;
                        String[] strArr = l71Var2.f36723c;
                        String str5 = strArr[0];
                        String str6 = l71Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        l71Var2.f36722b.countDown();
                    }
                });
                return;
            default:
                ((org.telegram.ui.Components.voip.q) this.f35247b).f40876a.setOnClickListener((View.OnClickListener) this.f35248c);
                return;
        }
    }

    public hh0(Object obj, Object obj2, Object obj3, int i7) {
        this.f35246a = i7;
        this.f35247b = obj;
        this.f35248c = obj2;
    }
}
