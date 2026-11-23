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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PremiumPreviewFragment;
public final class sh0 implements Runnable {
    public final int f39620a;
    public final Object f39621b;
    public final Object f39622c;

    public sh0(int i7, Object obj, Object obj2) {
        this.f39620a = i7;
        this.f39621b = obj;
        this.f39622c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        int indexOf;
        int K;
        int i7;
        hi.r7 r7Var;
        android.support.v4.media.session.a0 a0Var;
        int i10;
        long j11 = 0;
        int i11 = 2;
        ArrayList arrayList = null;
        switch (this.f39620a) {
            case 0:
                wh0 wh0Var = (wh0) this.f39621b;
                ArrayList arrayList2 = (ArrayList) this.f39622c;
                ArrayList arrayList3 = wh0Var.f41662r;
                wh0Var.f41661n.addAll(arrayList2);
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    vh0 vh0Var = (vh0) obj;
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList3.size()) {
                            TLObject tLObject = ((vh0) arrayList3.get(i13)).f40703a;
                            if (tLObject instanceof TLRPC.Chat) {
                                j3 = -((TLRPC.Chat) tLObject).f28492id;
                            } else if (tLObject instanceof TLRPC.User) {
                                j3 = ((TLRPC.User) tLObject).f28641id;
                            } else {
                                j3 = 0;
                            }
                            TLObject tLObject2 = vh0Var.f40703a;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject2).f28492id;
                            } else if (tLObject2 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject2).f28641id;
                            } else {
                                j10 = 0;
                            }
                            if (j3 == j10) {
                                if (vh0Var.f40705c > 0) {
                                    ((vh0) arrayList3.get(i13)).f40705c = vh0Var.f40705c;
                                }
                            } else {
                                i13++;
                            }
                        } else {
                            arrayList3.add(vh0Var);
                        }
                    }
                }
                q0.a aVar = wh0Var.f41665x;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                wh0Var.a();
                return;
            case 1:
                mm0 mm0Var = (mm0) this.f39621b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f39622c;
                ArrayList arrayList4 = mm0Var.L;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (K = mm0Var.K()) < mm0Var.b()) {
                    arrayList4.remove(indexOf);
                    mm0Var.s(K + 1 + indexOf);
                    int size2 = mm0Var.f17575k0.f17826e.size();
                    int size3 = arrayList4.size();
                    if (mm0Var.H0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        mm0Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((mm0) this.f39621b).S();
                kc.b0((org.telegram.ui.bx) this.f39622c).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                return;
            case 3:
                ((ym0) this.f39621b).sendAccessibilityEvent((View) this.f39622c, 4);
                return;
            case 4:
                ye yeVar = (ye) this.f39621b;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f39622c;
                if (bnVar != null) {
                    bnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    yeVar.dismiss();
                    return;
                }
                return;
            case 5:
                ((WindowManager) this.f39622c).removeView(((ye) this.f39621b).B);
                return;
            case 6:
                zo0 zo0Var = (zo0) this.f39621b;
                TLObject tLObject3 = (TLObject) this.f39622c;
                if (tLObject3 != null) {
                    zo0Var.f42975g2 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    zo0Var.b1();
                    if (zo0Var.f42977i2) {
                        zo0Var.N0();
                    }
                }
                zo0Var.f42976h2 = false;
                return;
            case 7:
                fi.i6 i6Var = (fi.i6) this.f39622c;
                iq0 iq0Var = ((it0) this.f39621b).f36100c0;
                if (iq0Var != null) {
                    int i14 = i6Var.f12106a;
                    iq0Var.f49870b.e(i14, iq0Var.d.i(i14));
                    return;
                }
                return;
            case 8:
                ds0 ds0Var = (ds0) this.f39621b;
                bi.v2 v2Var = (bi.v2) this.f39622c;
                ds0Var.G = null;
                ds0Var.H = null;
                v2Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new p60(v2Var, 20)).start();
                return;
            case 9:
                di.p8 p8Var = (di.p8) this.f39621b;
                p8Var.f9507e = !p8Var.f9507e;
                ((Runnable[]) this.f39622c)[0].run();
                p8Var.k(true);
                return;
            case 10:
                kc.b0(((tr0) this.f39621b).f40139f.f36166y1).Q(2131623990, 36, org.telegram.messenger.gd.a0(null, null, 2131742565, ((TLRPC.Chat) this.f39622c).title)).k(true);
                return;
            case 11:
                fs0 fs0Var = (fs0) this.f39621b;
                String str = (String) this.f39622c;
                if (!fs0Var.f35194w.f36160w1[fs0Var.f35192r].f42165a.isEmpty() && ((i7 = fs0Var.f35192r) == 1 || i7 == 4)) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, fs0Var.f35194w.f36160w1[i7].f42165a);
                    int e12 = fjVar.e1();
                    long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                    it0 it0Var = fs0Var.f35194w;
                    if (it0Var.f36130m1 == it0Var.f36166y1.getUserConfig().e()) {
                        j11 = fjVar.P1();
                    }
                    fs0Var.F(e12, B0, j11, str);
                } else if (fs0Var.f35192r == 3) {
                    it0 it0Var2 = fs0Var.f35194w;
                    fs0Var.F(0, it0Var2.f36130m1, it0Var2.G, str);
                }
                int i15 = fs0Var.f35192r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList5 = new ArrayList(fs0Var.f35194w.f36160w1[fs0Var.f35192r].f42165a);
                    fs0Var.f35193s++;
                    Utilities.f22879g.c(new as0((Object) fs0Var, (Serializable) str, arrayList5, 1));
                    return;
                }
                return;
            case 12:
                fs0 fs0Var2 = (fs0) this.f39621b;
                ArrayList arrayList6 = (ArrayList) this.f39622c;
                it0 it0Var3 = fs0Var2.f35194w;
                boolean z10 = it0Var3.Y0;
                ds0[] ds0VarArr = it0Var3.f36133n0;
                if (z10) {
                    fs0Var2.f35193s--;
                    int b10 = fs0Var2.b();
                    fs0Var2.d = arrayList6;
                    int b11 = fs0Var2.b();
                    if (fs0Var2.f35193s == 0 || b11 != 0) {
                        it0Var3.B1(false);
                    }
                    for (int i16 = 0; i16 < ds0VarArr.length; i16++) {
                        ds0 ds0Var2 = ds0VarArr[i16];
                        if (ds0Var2.F == fs0Var2.f35192r) {
                            if (fs0Var2.f35193s == 0 && b11 == 0) {
                                ds0Var2.f34449w.d.setText(org.telegram.messenger.gd.N0(2131747974, "NoResult"));
                                ds0VarArr[i16].f34449w.f37554f.setVisibility(8);
                                ds0VarArr[i16].f34449w.e(false, true);
                            } else if (b10 == 0) {
                                it0Var3.D(ds0Var2.h, 0, null);
                            }
                        }
                    }
                    fs0Var2.f();
                    return;
                }
                return;
            case 13:
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(org.telegram.messenger.i10.f24637t0);
                Boolean bool = Boolean.FALSE;
                f10.m(217, bool, (TLObject) this.f39621b, (TLRPC.Document) this.f39622c, null, bool);
                return;
            case 14:
                org.telegram.messenger.mp.u1(((vw0) this.f39621b).f41441a.f43054a).t5((TLRPC.EmojiStatus) this.f39622c, null);
                return;
            case 15:
                z11 z11Var = (z11) this.f39621b;
                org.telegram.messenger.mp.u1(z11Var.f42630e).f25864t7.d((ArrayList) this.f39622c, -z11Var.f42632f);
                int i17 = z11.m0;
                return;
            case 16:
                z11 z11Var2 = (z11) this.f39621b;
                z11Var2.getClass();
                org.telegram.messenger.mp.u1(z11Var2.f42630e).b3(0, ((TLRPC.Updates) this.f39622c).chats.get(0).f28492id, true);
                return;
            case 17:
                org.telegram.ui.Cells.m1 m1Var = (org.telegram.ui.Cells.m1) this.f39621b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f39622c;
                if (m1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    m1Var.m0(i11);
                    return;
                }
                return;
            case 18:
                org.telegram.messenger.ks ksVar = (org.telegram.messenger.ks) this.f39621b;
                f21 f21Var = (f21) this.f39622c;
                ksVar.n(f21Var, 142);
                ksVar.n(f21Var, 143);
                return;
            case 19:
                a31 a31Var = (a31) this.f39621b;
                TLObject tLObject4 = (TLObject) this.f39622c;
                org.telegram.messenger.ut utVar = a31Var.f33355t1;
                a31Var.f33349m1 = null;
                if (tLObject4 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject4;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        a31Var.P1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (utVar != null) {
                            utVar.set(richMessage);
                            a31Var.I1.D(utVar);
                            return;
                        }
                        return;
                    }
                }
                if (a31Var.P1) {
                    a31Var.dismiss();
                    org.telegram.messenger.ks.e().k(295, 1, org.telegram.messenger.gd.N0(2131743699, null));
                    return;
                }
                org.telegram.messenger.f3.o(null, 2131743699, new kc((FrameLayout) a31Var.f30226b, a31Var.J0), null);
                w21 w21Var = a31Var.f33359x1.f42311e;
                String str2 = a31Var.f33358w1;
                a31Var.f33357v1 = str2;
                w21Var.setText(a31.P0(str2, null, null));
                return;
            case 20:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.f39621b;
                ((org.telegram.ui.ActionBar.g1) this.f39622c).d(true);
                r31.a(ckVar.getContext(), ckVar.d);
                return;
            case 21:
                ((org.telegram.messenger.y00) this.f39622c).J(((org.telegram.ui.ck) this.f39621b).f39170b, false, false);
                return;
            case 22:
                UndoView undoView = (UndoView) this.f39621b;
                TLObject tLObject5 = (TLObject) this.f39622c;
                if (tLObject5 instanceof TLRPC.PaymentReceipt) {
                    undoView.f33288s.presentFragment(new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject5));
                    return;
                }
                int i18 = UndoView.f33271j0;
                undoView.getClass();
                return;
            case 23:
                ((n41) this.f39621b).E.onClick((org.telegram.ui.Cells.q8) this.f39622c);
                return;
            case 24:
                h61 h61Var = (h61) this.f39621b;
                e2.v0 v0Var = (e2.v0) this.f39622c;
                Throwable cause = v0Var.getCause();
                if ((cause instanceof u2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.mp.g1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = h61.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = h61Var.O;
                    if (arrayList7 != null) {
                        int i19 = 0;
                        while (i19 < arrayList7.size()) {
                            e61 e61Var = (e61) arrayList7.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList8 = e61Var.d;
                                if (i20 < arrayList8.size()) {
                                    g61 g61Var = (g61) arrayList8.get(i20);
                                    if (!TextUtils.isEmpty(g61Var.f35343m) && !h61.D0(g61Var.f35343m)) {
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
                    h61Var.O = arrayList;
                    if (arrayList != null) {
                        h61Var.k0(arrayList, h61Var.P);
                        return;
                    }
                    return;
                }
                TextureView textureView = h61Var.f35666n;
                if (textureView != null && ((!h61Var.F && (cause instanceof u2.p)) || (cause instanceof d3.u))) {
                    h61Var.F = true;
                    if (h61Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(h61Var.f35666n);
                            viewGroup.removeView(h61Var.f35666n);
                            viewGroup.addView(h61Var.f35666n, indexOfChild);
                        }
                        org.telegram.messenger.r5 r5Var = h61Var.f35653b;
                        if (r5Var != null) {
                            r5Var.postRunnable(new v51(h61Var, 1));
                            return;
                        }
                        l2.g0 g0Var = h61Var.d;
                        TextureView textureView2 = h61Var.f35666n;
                        g0Var.F1();
                        if (textureView2 != null && textureView2 == g0Var.X) {
                            g0Var.F1();
                            g0Var.s1();
                            g0Var.x1(null);
                            g0Var.q1(0, 0);
                        }
                        h61Var.d.z1(h61Var.f35666n);
                        ArrayList arrayList9 = h61Var.O;
                        if (arrayList9 != null) {
                            h61Var.k0(arrayList9, h61Var.P);
                        } else if (h61Var.V) {
                            h61Var.l0(h61Var.R, h61Var.T, h61Var.S, h61Var.U);
                        } else {
                            h61Var.j0(h61Var.R, h61Var.T);
                        }
                        h61Var.h0();
                        return;
                    }
                    return;
                }
                h61Var.K.onError(h61Var, v0Var);
                return;
            case 25:
                ((h61) ((oi.b6) this.f39621b).f22098f).L.w(true, (float[]) this.f39622c);
                return;
            case 26:
                j61 j61Var = (j61) this.f39621b;
                if (j61Var.f36309b == ((hi.r7[]) this.f39622c)[0]) {
                    if (org.telegram.messenger.mp.g1().getBoolean("asr_video_captions", false) && (a0Var = (r7Var = j61Var.f36309b).f15304f) != null && (DictationAsr.C((ai.q) a0Var.f1676b) || DictationAsr.A((ai.q) r7Var.f15304f.f1676b))) {
                        j61Var.b();
                    }
                    j61Var.f36308a.i();
                    return;
                }
                return;
            case 27:
                j61 j61Var2 = (j61) this.f39621b;
                if (j61Var2.f36309b == ((hi.r7) this.f39622c) && j61Var2.d) {
                    j61Var2.d();
                    return;
                }
                return;
            case 28:
                p61 p61Var = (p61) this.f39621b;
                Bitmap bitmap = (Bitmap) this.f39622c;
                if (bitmap != null) {
                    if (p61Var.f38409x != null) {
                        Bitmap bitmap2 = p61Var.f38408w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        p61Var.f38408w = p61Var.f38409x;
                    }
                    p61Var.f38409x = bitmap;
                    Bitmap bitmap3 = p61Var.f38409x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    p61Var.H = bitmapShader;
                    bitmapShader.setLocalMatrix(p61Var.M);
                    p61Var.K.setShader(p61Var.H);
                    p61Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i10 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = p61Var.getLayoutParams();
                    if (p61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i10) {
                        layoutParams.width = L;
                        layoutParams.height = i10;
                        p61Var.setVisibility(0);
                        p61Var.requestLayout();
                    }
                }
                p61Var.f38401f = null;
                return;
            default:
                final z71 z71Var = (z71) this.f39621b;
                z71Var.f42744e.f33399b.evaluateJavascript((String) this.f39622c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj2) {
                        String str3 = (String) obj2;
                        z71 z71Var2 = z71.this;
                        String[] strArr = z71Var2.f42743c;
                        String str4 = strArr[0];
                        String str5 = z71Var2.d;
                        strArr[0] = str4.replace(str5, "/signature/" + str3.substring(1, str3.length() - 1));
                        z71Var2.f42742b.countDown();
                    }
                });
                return;
        }
    }

    public sh0(Object obj, Object obj2, Object obj3, int i7) {
        this.f39620a = i7;
        this.f39621b = obj;
        this.f39622c = obj2;
    }
}
