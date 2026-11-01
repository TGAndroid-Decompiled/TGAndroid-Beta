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
public final class hi0 implements Runnable {
    public final int f26804a;
    public final Object f26805b;
    public final Object f26806c;

    public hi0(int i10, Object obj, Object obj2) {
        this.f26804a = i10;
        this.f26805b = obj;
        this.f26806c = obj2;
    }

    @Override
    public final void run() {
        long j10;
        long j11;
        int indexOf;
        int K;
        int i10;
        int i11;
        String str;
        long j12 = 0;
        int i12 = 2;
        ArrayList arrayList = null;
        switch (this.f26804a) {
            case 0:
                mi0 mi0Var = (mi0) this.f26805b;
                ArrayList arrayList2 = (ArrayList) this.f26806c;
                ArrayList arrayList3 = mi0Var.f28502r;
                mi0Var.f28501n.addAll(arrayList2);
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    li0 li0Var = (li0) obj;
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList3.size()) {
                            TLObject tLObject = ((li0) arrayList3.get(i14)).f28176a;
                            if (tLObject instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject).f19794id;
                            } else if (tLObject instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject).f19943id;
                            } else {
                                j10 = 0;
                            }
                            TLObject tLObject2 = li0Var.f28176a;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                j11 = -((TLRPC.Chat) tLObject2).f19794id;
                            } else if (tLObject2 instanceof TLRPC.User) {
                                j11 = ((TLRPC.User) tLObject2).f19943id;
                            } else {
                                j11 = 0;
                            }
                            if (j10 == j11) {
                                if (li0Var.f28178c > 0) {
                                    ((li0) arrayList3.get(i14)).f28178c = li0Var.f28178c;
                                }
                            } else {
                                i14++;
                            }
                        } else {
                            arrayList3.add(li0Var);
                        }
                    }
                }
                q0.a aVar = mi0Var.f28505x;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                mi0Var.a();
                return;
            case 1:
                an0 an0Var = (an0) this.f26805b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26806c;
                ArrayList arrayList4 = an0Var.K;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (K = an0Var.K()) < an0Var.b()) {
                    arrayList4.remove(indexOf);
                    an0Var.s(K + 1 + indexOf);
                    int size2 = an0Var.f55711j0.e.size();
                    int size3 = arrayList4.size();
                    if (an0Var.G0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        an0Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((an0) this.f26805b).S();
                cc.a0((org.telegram.ui.zx) this.f26806c).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
                return;
            case 3:
                ((mn0) this.f26805b).sendAccessibilityEvent((View) this.f26806c, 4);
                return;
            case 4:
                ie ieVar = (ie) this.f26805b;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.f26806c;
                if (unVar != null) {
                    unVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ieVar.dismiss();
                    return;
                }
                return;
            case 5:
                ((WindowManager) this.f26806c).removeView(((ie) this.f26805b).B);
                return;
            case 6:
                pp0 pp0Var = (pp0) this.f26805b;
                TLObject tLObject3 = (TLObject) this.f26806c;
                if (tLObject3 != null) {
                    pp0Var.f29469c2 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    pp0Var.a1();
                    if (pp0Var.f29471e2) {
                        pp0Var.M0();
                    }
                }
                pp0Var.f29470d2 = false;
                return;
            case 7:
                th.y4 y4Var = (th.y4) this.f26806c;
                ar0 ar0Var = ((au0) this.f26805b).f24501b0;
                if (ar0Var != null) {
                    int i15 = y4Var.f49694a;
                    ar0Var.f43748b.d(i15, ar0Var.d.i(i15));
                    return;
                }
                return;
            case 8:
                ts0 ts0Var = (ts0) this.f26805b;
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) this.f26806c;
                ts0Var.F = null;
                ts0Var.G = null;
                a5Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new t60(a5Var, 20)).start();
                return;
            case 9:
                rh.v5 v5Var = (rh.v5) this.f26805b;
                v5Var.e = !v5Var.e;
                ((Runnable[]) this.f26806c)[0].run();
                v5Var.j(true);
                return;
            case 10:
                cc.a0(((ks0) this.f26805b).f27954f.f24568x1).Q(2131623989, 36, org.telegram.messenger.dd.a0(null, null, 2131742861, ((TLRPC.Chat) this.f26806c).title)).k(true);
                return;
            case 11:
                vs0 vs0Var = (vs0) this.f26805b;
                String str2 = (String) this.f26806c;
                if (!vs0Var.f31904w.f24562v1[vs0Var.f31902r].f29532a.isEmpty() && ((i10 = vs0Var.f31902r) == 1 || i10 == 4)) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) i0.a.g(1, vs0Var.f31904w.f24562v1[i10].f29532a);
                    int f12 = kjVar.f1();
                    long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
                    au0 au0Var = vs0Var.f31904w;
                    if (au0Var.l1 == au0Var.f24568x1.getUserConfig().e()) {
                        j12 = kjVar.Q1();
                    }
                    vs0Var.F(f12, B0, j12, str2);
                } else if (vs0Var.f31902r == 3) {
                    au0 au0Var2 = vs0Var.f31904w;
                    vs0Var.F(0, au0Var2.l1, au0Var2.F, str2);
                }
                int i16 = vs0Var.f31902r;
                if (i16 == 1 || i16 == 4) {
                    ArrayList arrayList5 = new ArrayList(vs0Var.f31904w.f24562v1[vs0Var.f31902r].f29532a);
                    vs0Var.f31903s++;
                    Utilities.f14523g.c(new jg(vs0Var, str2, arrayList5, 24));
                    return;
                }
                return;
            case 12:
                vs0 vs0Var2 = (vs0) this.f26805b;
                ArrayList arrayList6 = (ArrayList) this.f26806c;
                au0 au0Var3 = vs0Var2.f31904w;
                boolean z10 = au0Var3.X0;
                ts0[] ts0VarArr = au0Var3.m0;
                if (z10) {
                    vs0Var2.f31903s--;
                    int b10 = vs0Var2.b();
                    vs0Var2.d = arrayList6;
                    int b11 = vs0Var2.b();
                    if (vs0Var2.f31903s == 0 || b11 != 0) {
                        au0Var3.x1(false);
                    }
                    for (int i17 = 0; i17 < ts0VarArr.length; i17++) {
                        ts0 ts0Var2 = ts0VarArr[i17];
                        if (ts0Var2.E == vs0Var2.f31902r) {
                            if (vs0Var2.f31903s == 0 && b11 == 0) {
                                ts0Var2.f30722w.d.setText(org.telegram.messenger.dd.L0(2131748183, "NoResult"));
                                ts0VarArr[i17].f30722w.f25949f.setVisibility(8);
                                ts0VarArr[i17].f30722w.e(false, true);
                            } else if (b10 == 0) {
                                au0Var3.C(ts0Var2.h, 0, null);
                            }
                        }
                    }
                    vs0Var2.f();
                    return;
                }
                return;
            case 13:
                org.telegram.messenger.at f7 = org.telegram.messenger.at.f(org.telegram.messenger.e20.f15506s0);
                Boolean bool = Boolean.FALSE;
                f7.m(215, bool, (TLObject) this.f26805b, (TLRPC.Document) this.f26806c, null, bool);
                return;
            case 14:
                org.telegram.messenger.wp.r1(((px0) this.f26805b).f29562a.f30728a).e5((TLRPC.EmojiStatus) this.f26806c, null);
                return;
            case 15:
                u11 u11Var = (u11) this.f26805b;
                String str3 = (String) this.f26806c;
                u11Var.O = null;
                org.telegram.messenger.y00 y00Var = org.telegram.messenger.wp.r1(u11Var.f30817a).f19234r7;
                long j13 = -u11Var.f30819b;
                vg vgVar = new vg(14, u11Var, str3);
                y00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = y00Var.getMessagesController().i1(-j13);
                tL_messages_getForumTopics.f20013q = str3;
                tL_messages_getForumTopics.limit = 50;
                u11Var.N = y00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.rj(y00Var, j13, vgVar, 10));
                return;
            case 16:
                p21 p21Var = (p21) this.f26805b;
                org.telegram.messenger.wp.r1(p21Var.e).f19234r7.d((ArrayList) this.f26806c, -p21Var.f29330f);
                int i18 = p21.f29321l0;
                return;
            case 17:
                p21 p21Var2 = (p21) this.f26805b;
                p21Var2.getClass();
                org.telegram.messenger.wp.r1(p21Var2.e).T2(0, ((TLRPC.Updates) this.f26806c).chats.get(0).f19794id, true);
                return;
            case 18:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f26805b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f26806c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.c0(i12);
                    return;
                }
                return;
            case 19:
                n31 n31Var = (n31) this.f26805b;
                TLObject tLObject4 = (TLObject) this.f26806c;
                org.telegram.messenger.mu muVar = n31Var.f28652p1;
                n31Var.f28646i1 = null;
                if (tLObject4 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject4;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        n31Var.L1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (muVar != null) {
                            muVar.set(richMessage);
                            n31Var.E1.D(muVar);
                            return;
                        }
                        return;
                    }
                }
                if (n31Var.L1) {
                    n31Var.dismiss();
                    org.telegram.messenger.at.e().k(292, 1, org.telegram.messenger.dd.L0(2131743971, null));
                    return;
                }
                org.telegram.messenger.m5.o(null, 2131743971, new cc((FrameLayout) n31Var.f21587b, n31Var.I0), null);
                j31 j31Var = n31Var.f28656t1.e;
                String str4 = n31Var.f28655s1;
                n31Var.f28654r1 = str4;
                j31Var.setText(n31.O0(str4, null, null));
                return;
            case 20:
                org.telegram.ui.xk xkVar = (org.telegram.ui.xk) this.f26805b;
                ((org.telegram.ui.ActionBar.k1) this.f26806c).d(true);
                e41.a(xkVar.getContext(), xkVar.d);
                return;
            case 21:
                ((org.telegram.messenger.u10) this.f26806c).J(((org.telegram.ui.xk) this.f26805b).f25683b, false, false);
                return;
            case 22:
                UndoView undoView = (UndoView) this.f26805b;
                TLObject tLObject5 = (TLObject) this.f26806c;
                if (tLObject5 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24253s.presentFragment(new org.telegram.ui.qm0((TLRPC.PaymentReceipt) tLObject5));
                    return;
                }
                int i19 = UndoView.f24238i0;
                undoView.getClass();
                return;
            case 23:
                ((b51) this.f26805b).D.onClick((org.telegram.ui.Cells.s8) this.f26806c);
                return;
            case 24:
                v61 v61Var = (v61) this.f26805b;
                b2.y0 y0Var = (b2.y0) this.f26806c;
                Throwable cause = y0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.f8.g(y0Var, true);
                    org.telegram.messenger.f8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.wp.d1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = v61.f31197l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = v61Var.N;
                    if (arrayList7 != null) {
                        int i20 = 0;
                        while (i20 < arrayList7.size()) {
                            s61 s61Var = (s61) arrayList7.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList8 = s61Var.d;
                                if (i21 < arrayList8.size()) {
                                    u61 u61Var = (u61) arrayList8.get(i21);
                                    if (!TextUtils.isEmpty(u61Var.f30879m) && !v61.D0(u61Var.f30879m)) {
                                        arrayList8.remove(i21);
                                        i21--;
                                    }
                                    i21++;
                                } else {
                                    if (arrayList8.isEmpty()) {
                                        arrayList7.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                }
                            }
                        }
                        arrayList = arrayList7;
                    }
                    v61Var.N = arrayList;
                    if (arrayList != null) {
                        v61Var.k0(arrayList, v61Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = v61Var.f31211n;
                if (textureView != null && ((!v61Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    v61Var.E = true;
                    if (v61Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(v61Var.f31211n);
                            viewGroup.removeView(v61Var.f31211n);
                            viewGroup.addView(v61Var.f31211n, indexOfChild);
                        }
                        org.telegram.messenger.s5 s5Var = v61Var.f31200b;
                        if (s5Var != null) {
                            s5Var.postRunnable(new k51(v61Var, 3));
                            return;
                        }
                        i2.i0 i0Var = v61Var.d;
                        TextureView textureView2 = v61Var.f31211n;
                        i0Var.F1();
                        if (textureView2 != null && textureView2 == i0Var.X) {
                            i0Var.F1();
                            i0Var.s1();
                            i0Var.x1(null);
                            i0Var.q1(0, 0);
                        }
                        v61Var.d.z1(v61Var.f31211n);
                        ArrayList arrayList9 = v61Var.N;
                        if (arrayList9 != null) {
                            v61Var.k0(arrayList9, v61Var.O);
                        } else if (v61Var.U) {
                            v61Var.l0(v61Var.Q, v61Var.S, v61Var.R, v61Var.T);
                        } else {
                            v61Var.j0(v61Var.Q, v61Var.S);
                        }
                        v61Var.h0();
                        return;
                    }
                    return;
                }
                v61Var.J.onError(v61Var, y0Var);
                return;
            case 25:
                ((v61) ((bi.r6) this.f26805b).f3333f).K.B(true, (float[]) this.f26806c);
                return;
            case 26:
                c71 c71Var = (c71) this.f26805b;
                Bitmap bitmap = (Bitmap) this.f26806c;
                if (bitmap != null) {
                    if (c71Var.f25057x != null) {
                        Bitmap bitmap2 = c71Var.f25056w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        c71Var.f25056w = c71Var.f25057x;
                    }
                    c71Var.f25057x = bitmap;
                    Bitmap bitmap3 = c71Var.f25057x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    c71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(c71Var.L);
                    c71Var.J.setShader(c71Var.G);
                    c71Var.invalidate();
                    int L = org.telegram.messenger.i0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i11 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = c71Var.getLayoutParams();
                    if (c71Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i11) {
                        layoutParams.width = L;
                        layoutParams.height = i11;
                        c71Var.setVisibility(0);
                        c71Var.requestLayout();
                    }
                }
                c71Var.f25050f = null;
                return;
            case 27:
                final m81 m81Var = (m81) this.f26805b;
                m81Var.e.f28727b.evaluateJavascript((String) this.f26806c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj2) {
                        String str5 = (String) obj2;
                        m81 m81Var2 = m81.this;
                        String[] strArr = m81Var2.f28416c;
                        String str6 = strArr[0];
                        String str7 = m81Var2.d;
                        strArr[0] = str6.replace(str7, "/signature/" + str5.substring(1, str5.length() - 1));
                        m81Var2.f28415b.countDown();
                    }
                });
                return;
            case 28:
                ((org.telegram.ui.Components.voip.j) this.f26805b).f31551a.setOnClickListener((View.OnClickListener) this.f26806c);
                return;
            default:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.f26805b;
                Bitmap bitmap4 = (Bitmap) this.f26806c;
                HashMap hashMap2 = rVar.F.h;
                org.telegram.messenger.v3 v3Var = rVar.f31693x;
                boolean z11 = v3Var.f18589b;
                TLRPC.GroupCallParticipant groupCallParticipant = v3Var.f18588a;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
        }
    }

    public hi0(Object obj, Object obj2, Object obj3, int i10) {
        this.f26804a = i10;
        this.f26805b = obj;
        this.f26806c = obj2;
    }
}
