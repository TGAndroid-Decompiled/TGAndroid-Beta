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
public final class gi0 implements Runnable {
    public final int f26378a;
    public final Object f26379b;
    public final Object f26380c;

    public gi0(int i10, Object obj, Object obj2) {
        this.f26378a = i10;
        this.f26379b = obj;
        this.f26380c = obj2;
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
        switch (this.f26378a) {
            case 0:
                li0 li0Var = (li0) this.f26379b;
                ArrayList arrayList2 = (ArrayList) this.f26380c;
                ArrayList arrayList3 = li0Var.f28123r;
                li0Var.f28122n.addAll(arrayList2);
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    ki0 ki0Var = (ki0) obj;
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList3.size()) {
                            TLObject tLObject = ((ki0) arrayList3.get(i14)).f27768a;
                            if (tLObject instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject).f19793id;
                            } else if (tLObject instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject).f19942id;
                            } else {
                                j10 = 0;
                            }
                            TLObject tLObject2 = ki0Var.f27768a;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                j11 = -((TLRPC.Chat) tLObject2).f19793id;
                            } else if (tLObject2 instanceof TLRPC.User) {
                                j11 = ((TLRPC.User) tLObject2).f19942id;
                            } else {
                                j11 = 0;
                            }
                            if (j10 == j11) {
                                if (ki0Var.f27770c > 0) {
                                    ((ki0) arrayList3.get(i14)).f27770c = ki0Var.f27770c;
                                }
                            } else {
                                i14++;
                            }
                        } else {
                            arrayList3.add(ki0Var);
                        }
                    }
                }
                q0.a aVar = li0Var.f28126x;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                li0Var.a();
                return;
            case 1:
                zm0 zm0Var = (zm0) this.f26379b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26380c;
                ArrayList arrayList4 = zm0Var.K;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (K = zm0Var.K()) < zm0Var.b()) {
                    arrayList4.remove(indexOf);
                    zm0Var.s(K + 1 + indexOf);
                    int size2 = zm0Var.f55693j0.e.size();
                    int size3 = arrayList4.size();
                    if (zm0Var.G0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        zm0Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((zm0) this.f26379b).S();
                cc.a0((org.telegram.ui.ay) this.f26380c).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                return;
            case 3:
                ((ln0) this.f26379b).sendAccessibilityEvent((View) this.f26380c, 4);
                return;
            case 4:
                ie ieVar = (ie) this.f26379b;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.f26380c;
                if (unVar != null) {
                    unVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ieVar.dismiss();
                    return;
                }
                return;
            case 5:
                ((WindowManager) this.f26380c).removeView(((ie) this.f26379b).B);
                return;
            case 6:
                op0 op0Var = (op0) this.f26379b;
                TLObject tLObject3 = (TLObject) this.f26380c;
                if (tLObject3 != null) {
                    op0Var.f29114c2 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    op0Var.a1();
                    if (op0Var.f29116e2) {
                        op0Var.M0();
                    }
                }
                op0Var.f29115d2 = false;
                return;
            case 7:
                th.y4 y4Var = (th.y4) this.f26380c;
                zq0 zq0Var = ((zt0) this.f26379b).f33173b0;
                if (zq0Var != null) {
                    int i15 = y4Var.f49680a;
                    zq0Var.f44254b.d(i15, zq0Var.d.i(i15));
                    return;
                }
                return;
            case 8:
                ss0 ss0Var = (ss0) this.f26379b;
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) this.f26380c;
                ss0Var.F = null;
                ss0Var.G = null;
                a5Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new t60(a5Var, 20)).start();
                return;
            case 9:
                rh.v5 v5Var = (rh.v5) this.f26379b;
                v5Var.e = !v5Var.e;
                ((Runnable[]) this.f26380c)[0].run();
                v5Var.j(true);
                return;
            case 10:
                cc.a0(((js0) this.f26379b).f27485f.f33240x1).Q(2131623989, 36, org.telegram.messenger.cd.a0(null, null, 2131742861, ((TLRPC.Chat) this.f26380c).title)).k(true);
                return;
            case 11:
                us0 us0Var = (us0) this.f26379b;
                String str2 = (String) this.f26380c;
                if (!us0Var.f31036w.f33234v1[us0Var.f31034r].f29177a.isEmpty() && ((i10 = us0Var.f31034r) == 1 || i10 == 4)) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, us0Var.f31036w.f33234v1[i10].f29177a);
                    int f12 = jjVar.f1();
                    long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                    zt0 zt0Var = us0Var.f31036w;
                    if (zt0Var.l1 == zt0Var.f33240x1.getUserConfig().e()) {
                        j12 = jjVar.Q1();
                    }
                    us0Var.F(f12, B0, j12, str2);
                } else if (us0Var.f31034r == 3) {
                    zt0 zt0Var2 = us0Var.f31036w;
                    us0Var.F(0, zt0Var2.l1, zt0Var2.F, str2);
                }
                int i16 = us0Var.f31034r;
                if (i16 == 1 || i16 == 4) {
                    ArrayList arrayList5 = new ArrayList(us0Var.f31036w.f33234v1[us0Var.f31034r].f29177a);
                    us0Var.f31035s++;
                    Utilities.f14522g.c(new jg(us0Var, str2, arrayList5, 24));
                    return;
                }
                return;
            case 12:
                us0 us0Var2 = (us0) this.f26379b;
                ArrayList arrayList6 = (ArrayList) this.f26380c;
                zt0 zt0Var3 = us0Var2.f31036w;
                boolean z10 = zt0Var3.X0;
                ss0[] ss0VarArr = zt0Var3.m0;
                if (z10) {
                    us0Var2.f31035s--;
                    int b10 = us0Var2.b();
                    us0Var2.d = arrayList6;
                    int b11 = us0Var2.b();
                    if (us0Var2.f31035s == 0 || b11 != 0) {
                        zt0Var3.w1(false);
                    }
                    for (int i17 = 0; i17 < ss0VarArr.length; i17++) {
                        ss0 ss0Var2 = ss0VarArr[i17];
                        if (ss0Var2.E == us0Var2.f31034r) {
                            if (us0Var2.f31035s == 0 && b11 == 0) {
                                ss0Var2.f30355w.d.setText(org.telegram.messenger.cd.L0(2131748183, "NoResult"));
                                ss0VarArr[i17].f30355w.f25552f.setVisibility(8);
                                ss0VarArr[i17].f30355w.e(false, true);
                            } else if (b10 == 0) {
                                zt0Var3.C(ss0Var2.h, 0, null);
                            }
                        }
                    }
                    us0Var2.f();
                    return;
                }
                return;
            case 13:
                org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(org.telegram.messenger.d20.f15147s0);
                Boolean bool = Boolean.FALSE;
                f7.m(215, bool, (TLObject) this.f26379b, (TLRPC.Document) this.f26380c, null, bool);
                return;
            case 14:
                org.telegram.messenger.vp.r1(((ox0) this.f26379b).f29205a.f30368a).e5((TLRPC.EmojiStatus) this.f26380c, null);
                return;
            case 15:
                o21 o21Var = (o21) this.f26379b;
                org.telegram.messenger.vp.r1(o21Var.f28957n).f18891r7.d((ArrayList) this.f26380c, -o21Var.f28959r);
                int i18 = o21.f28940o0;
                return;
            case 16:
                o21 o21Var2 = (o21) this.f26379b;
                o21Var2.getClass();
                org.telegram.messenger.vp.r1(o21Var2.f28957n).T2(0, ((TLRPC.Updates) this.f26380c).chats.get(0).f19793id, true);
                return;
            case 17:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f26379b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f26380c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.c0(i12);
                    return;
                }
                return;
            case 18:
                m31 m31Var = (m31) this.f26379b;
                TLObject tLObject4 = (TLObject) this.f26380c;
                org.telegram.messenger.lu luVar = m31Var.f28275p1;
                m31Var.f28269i1 = null;
                if (tLObject4 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject4;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        m31Var.L1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (luVar != null) {
                            luVar.set(richMessage);
                            m31Var.E1.D(luVar);
                            return;
                        }
                        return;
                    }
                }
                if (m31Var.L1) {
                    m31Var.dismiss();
                    org.telegram.messenger.zs.e().k(292, 1, org.telegram.messenger.cd.L0(2131743971, null));
                    return;
                }
                org.telegram.messenger.m5.o(null, 2131743971, new cc((FrameLayout) m31Var.f21586b, m31Var.I0), null);
                i31 i31Var = m31Var.f28279t1.e;
                String str3 = m31Var.f28278s1;
                m31Var.f28277r1 = str3;
                i31Var.setText(m31.O0(str3, null, null));
                return;
            case 19:
                org.telegram.ui.xk xkVar = (org.telegram.ui.xk) this.f26379b;
                ((org.telegram.ui.ActionBar.k1) this.f26380c).d(true);
                d41.a(xkVar.getContext(), xkVar.d);
                return;
            case 20:
                ((org.telegram.messenger.t10) this.f26380c).J(((org.telegram.ui.xk) this.f26379b).f25289b, false, false);
                return;
            case 21:
                UndoView undoView = (UndoView) this.f26379b;
                TLObject tLObject5 = (TLObject) this.f26380c;
                if (tLObject5 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24252s.presentFragment(new org.telegram.ui.sm0((TLRPC.PaymentReceipt) tLObject5));
                    return;
                }
                int i19 = UndoView.f24237i0;
                undoView.getClass();
                return;
            case 22:
                ((a51) this.f26379b).D.onClick((org.telegram.ui.Cells.s8) this.f26380c);
                return;
            case 23:
                u61 u61Var = (u61) this.f26379b;
                b2.y0 y0Var = (b2.y0) this.f26380c;
                Throwable cause = y0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.f8.g(y0Var, true);
                    org.telegram.messenger.f8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.vp.d1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = u61.f30832l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = u61Var.N;
                    if (arrayList7 != null) {
                        int i20 = 0;
                        while (i20 < arrayList7.size()) {
                            r61 r61Var = (r61) arrayList7.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList8 = r61Var.d;
                                if (i21 < arrayList8.size()) {
                                    t61 t61Var = (t61) arrayList8.get(i21);
                                    if (!TextUtils.isEmpty(t61Var.f30465m) && !u61.D0(t61Var.f30465m)) {
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
                    u61Var.N = arrayList;
                    if (arrayList != null) {
                        u61Var.k0(arrayList, u61Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = u61Var.f30846n;
                if (textureView != null && ((!u61Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    u61Var.E = true;
                    if (u61Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(u61Var.f30846n);
                            viewGroup.removeView(u61Var.f30846n);
                            viewGroup.addView(u61Var.f30846n, indexOfChild);
                        }
                        org.telegram.messenger.s5 s5Var = u61Var.f30835b;
                        if (s5Var != null) {
                            s5Var.postRunnable(new j51(u61Var, 3));
                            return;
                        }
                        i2.i0 i0Var = u61Var.d;
                        TextureView textureView2 = u61Var.f30846n;
                        i0Var.F1();
                        if (textureView2 != null && textureView2 == i0Var.X) {
                            i0Var.F1();
                            i0Var.s1();
                            i0Var.x1(null);
                            i0Var.q1(0, 0);
                        }
                        u61Var.d.z1(u61Var.f30846n);
                        ArrayList arrayList9 = u61Var.N;
                        if (arrayList9 != null) {
                            u61Var.k0(arrayList9, u61Var.O);
                        } else if (u61Var.U) {
                            u61Var.l0(u61Var.Q, u61Var.S, u61Var.R, u61Var.T);
                        } else {
                            u61Var.j0(u61Var.Q, u61Var.S);
                        }
                        u61Var.h0();
                        return;
                    }
                    return;
                }
                u61Var.J.onError(u61Var, y0Var);
                return;
            case 24:
                ((u61) ((bi.r6) this.f26379b).f3333f).K.B(true, (float[]) this.f26380c);
                return;
            case 25:
                b71 b71Var = (b71) this.f26379b;
                Bitmap bitmap = (Bitmap) this.f26380c;
                if (bitmap != null) {
                    if (b71Var.f24578x != null) {
                        Bitmap bitmap2 = b71Var.f24577w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        b71Var.f24577w = b71Var.f24578x;
                    }
                    b71Var.f24578x = bitmap;
                    Bitmap bitmap3 = b71Var.f24578x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    b71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(b71Var.L);
                    b71Var.J.setShader(b71Var.G);
                    b71Var.invalidate();
                    int L = org.telegram.messenger.i0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i11 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = b71Var.getLayoutParams();
                    if (b71Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i11) {
                        layoutParams.width = L;
                        layoutParams.height = i11;
                        b71Var.setVisibility(0);
                        b71Var.requestLayout();
                    }
                }
                b71Var.f24571f = null;
                return;
            case 26:
                final l81 l81Var = (l81) this.f26379b;
                l81Var.e.f28361b.evaluateJavascript((String) this.f26380c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj2) {
                        String str4 = (String) obj2;
                        l81 l81Var2 = l81.this;
                        String[] strArr = l81Var2.f28037c;
                        String str5 = strArr[0];
                        String str6 = l81Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        l81Var2.f28036b.countDown();
                    }
                });
                return;
            case 27:
                ((org.telegram.ui.Components.voip.j) this.f26379b).f31480a.setOnClickListener((View.OnClickListener) this.f26380c);
                return;
            case 28:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.f26379b;
                Bitmap bitmap4 = (Bitmap) this.f26380c;
                HashMap hashMap2 = rVar.F.h;
                org.telegram.messenger.v3 v3Var = rVar.f31630x;
                boolean z11 = v3Var.f18478b;
                TLRPC.GroupCallParticipant groupCallParticipant = v3Var.f18477a;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            default:
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) this.f26380c;
                ((org.telegram.ui.Components.voip.w) this.f26379b).getClass();
                rVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.p(rVar2, 4)).setDuration(150L).start();
                return;
        }
    }

    public gi0(Object obj, Object obj2, Object obj3, int i10) {
        this.f26378a = i10;
        this.f26379b = obj;
        this.f26380c = obj2;
    }
}
