package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class v80 implements Runnable {
    public final int f38947a;
    public final Object f38948b;
    public final Object f38949c;

    public v80(int i7, Object obj, Object obj2) {
        this.f38947a = i7;
        this.f38948b = obj;
        this.f38949c = obj2;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        long j3;
        long j10;
        int indexOf;
        int K;
        int i7;
        boolean z13 = false;
        long j11 = 0;
        int i10 = 2;
        boolean z14 = false;
        boolean z15 = true;
        switch (this.f38947a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f38949c;
                ((yh.b) this.f38948b).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new bt(editTextBoldCursor, 6));
                return;
            case 1:
                ob.c cVar = (ob.c) this.f38948b;
                Runnable runnable = (Runnable) this.f38949c;
                cVar.getClass();
                runnable.run();
                cVar.f20894a.remove(runnable);
                return;
            case 2:
                ze0 ze0Var = (ze0) this.f38948b;
                TLObject tLObject = (TLObject) this.f38949c;
                ze0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    ze0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        ze0Var.a(false);
                        return;
                    }
                    ze0Var.d();
                    ze0Var.f40964c.f37190f3.O(true);
                    return;
                }
                return;
            case 3:
                ef0 ef0Var = (ef0) this.f38948b;
                ArrayList arrayList = (ArrayList) this.f38949c;
                ArrayList arrayList2 = ef0Var.f33267a;
                int i11 = ef0Var.f33275s;
                int size = arrayList.size();
                ef0Var.f33275s = size;
                if (i11 != size && ef0Var.P != null) {
                    ef0Var.g();
                }
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    bf0 bf0Var = (bf0) arrayList2.get(i12);
                    if (bf0Var.f32182o && !bf0Var.f32183p) {
                        arrayList.add(bf0Var);
                    } else if (ef0.i(bf0Var.f32170a, arrayList) == null) {
                        ef0 ef0Var2 = bf0Var.f32191y;
                        float f10 = ef0Var2.K;
                        RectF rectF = bf0Var.f32172c;
                        RectF rectF2 = bf0Var.f32174f;
                        a80 a80Var = bf0Var.f32185r;
                        if (a80Var != null) {
                            a80Var.a();
                            bf0Var.f32187t = z14;
                            bf0Var.f32186s = z14;
                        }
                        bf0Var.f32182o = z15;
                        if (rectF.left - 1.0f <= f10) {
                            z9 = z15;
                        } else {
                            z9 = z14;
                        }
                        if (rectF.right + 1.0f >= ef0Var2.getMeasuredWidth() - f10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z9 && z10) {
                            z9 = false;
                            z10 = false;
                        }
                        bf0Var.f32175g.set(rectF);
                        rectF2.set(rectF);
                        if (z9) {
                            rectF2.right = rectF2.left;
                        } else if (z10) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i13 = bf0Var.f32170a;
                            if (i13 != 3 && i13 != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                                if (ef0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    z12 = false;
                                    bf0Var.f32173e.e(z11, 0.0f);
                                    arrayList.add(bf0Var);
                                    i12++;
                                    z13 = z12;
                                    z14 = false;
                                    z15 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            z12 = false;
                            bf0Var.f32173e.e(z11, 0.0f);
                            arrayList.add(bf0Var);
                            i12++;
                            z13 = z12;
                            z14 = false;
                            z15 = true;
                        }
                        z11 = true;
                        z12 = false;
                        bf0Var.f32173e.e(z11, 0.0f);
                        arrayList.add(bf0Var);
                        i12++;
                        z13 = z12;
                        z14 = false;
                        z15 = true;
                    }
                    z12 = z13;
                    i12++;
                    z13 = z12;
                    z14 = false;
                    z15 = true;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ef0Var.invalidate();
                return;
            case 4:
                bf0 bf0Var2 = (bf0) this.f38949c;
                df0 df0Var = ((ef0) this.f38948b).f33278y;
                int i14 = bf0Var2.f32170a;
                RectF rectF3 = bf0Var2.d;
                ProfileActivity.m0(((org.telegram.ui.tt0) df0Var).f50141b, i14, rectF3.left, rectF3.top);
                return;
            case 5:
                RLottieNative rLottieNative = (RLottieNative) this.f38948b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f38949c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 6:
                hh0 hh0Var = (hh0) this.f38948b;
                ArrayList arrayList3 = (ArrayList) this.f38949c;
                ArrayList arrayList4 = hh0Var.f34273r;
                hh0Var.f34272n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    gh0 gh0Var = (gh0) obj;
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList4.size()) {
                            TLObject tLObject2 = ((gh0) arrayList4.get(i16)).f33943a;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                j3 = -((TLRPC.Chat) tLObject2).f26956id;
                            } else if (tLObject2 instanceof TLRPC.User) {
                                j3 = ((TLRPC.User) tLObject2).f27105id;
                            } else {
                                j3 = 0;
                            }
                            TLObject tLObject3 = gh0Var.f33943a;
                            if (tLObject3 instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject3).f26956id;
                            } else if (tLObject3 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject3).f27105id;
                            } else {
                                j10 = 0;
                            }
                            if (j3 == j10) {
                                if (gh0Var.f33945c > 0) {
                                    ((gh0) arrayList4.get(i16)).f33945c = gh0Var.f33945c;
                                }
                            } else {
                                i16++;
                            }
                        } else {
                            arrayList4.add(gh0Var);
                        }
                    }
                }
                q0.a aVar = hh0Var.f34276x;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                hh0Var.a();
                return;
            case 7:
                yl0 yl0Var = (yl0) this.f38948b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f38949c;
                ArrayList arrayList5 = yl0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = yl0Var.K()) < yl0Var.b()) {
                    arrayList5.remove(indexOf);
                    yl0Var.s(K + 1 + indexOf);
                    int size4 = yl0Var.f16749j0.f16995e.size();
                    int size5 = arrayList5.size();
                    if (yl0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        yl0Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((yl0) this.f38948b).S();
                hc.a0((org.telegram.ui.ww) this.f38949c).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                return;
            case 9:
                ((km0) this.f38948b).sendAccessibilityEvent((View) this.f38949c, 4);
                return;
            case 10:
                ne neVar = (ne) this.f38948b;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.f38949c;
                if (anVar != null) {
                    anVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    neVar.dismiss();
                    return;
                }
                return;
            case 11:
                ((WindowManager) this.f38949c).removeView(((ne) this.f38948b).B);
                return;
            case 12:
                mo0 mo0Var = (mo0) this.f38948b;
                TLObject tLObject4 = (TLObject) this.f38949c;
                if (tLObject4 != null) {
                    mo0Var.f36038c2 = (TLRPC.TL_exportedMessageLink) tLObject4;
                    mo0Var.a1();
                    if (mo0Var.f36039e2) {
                        mo0Var.M0();
                    }
                }
                mo0Var.d2 = false;
                return;
            case 13:
                di.r6 r6Var = (di.r6) this.f38949c;
                yp0 yp0Var = ((xs0) this.f38948b).f40395b0;
                if (yp0Var != null) {
                    int i17 = r6Var.f9701a;
                    yp0Var.f47341b.d(i17, yp0Var.d.i(i17));
                    return;
                }
                return;
            case 14:
                sr0 sr0Var = (sr0) this.f38948b;
                di.a4 a4Var = (di.a4) this.f38949c;
                sr0Var.F = null;
                sr0Var.G = null;
                a4Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new e60(a4Var, 20)).start();
                return;
            case 15:
                bi.v9 v9Var = (bi.v9) this.f38948b;
                v9Var.f4909e = !v9Var.f4909e;
                ((Runnable[]) this.f38949c)[0].run();
                v9Var.j(true);
                return;
            case 16:
                hc.a0(((jr0) this.f38948b).f35070f.f40461x1).Q(2131623989, 36, org.telegram.messenger.id.a0(null, null, 2131742839, ((TLRPC.Chat) this.f38949c).title)).k(true);
                return;
            case 17:
                ur0 ur0Var = (ur0) this.f38948b;
                String str = (String) this.f38949c;
                if (!ur0Var.f38726w.f40455v1[ur0Var.f38724r].f36091a.isEmpty() && ((i7 = ur0Var.f38724r) == 1 || i7 == 4)) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, ur0Var.f38726w.f40455v1[i7].f36091a);
                    int f12 = ijVar.f1();
                    long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
                    xs0 xs0Var = ur0Var.f38726w;
                    if (xs0Var.l1 == xs0Var.f40461x1.getUserConfig().e()) {
                        j11 = ijVar.Q1();
                    }
                    ur0Var.F(f12, B0, j11, str);
                } else if (ur0Var.f38724r == 3) {
                    xs0 xs0Var2 = ur0Var.f38726w;
                    ur0Var.F(0, xs0Var2.l1, xs0Var2.F, str);
                }
                int i18 = ur0Var.f38724r;
                if (i18 == 1 || i18 == 4) {
                    ArrayList arrayList6 = new ArrayList(ur0Var.f38726w.f40455v1[ur0Var.f38724r].f36091a);
                    ur0Var.f38725s++;
                    Utilities.f21338g.c(new ng(ur0Var, str, arrayList6, 24));
                    return;
                }
                return;
            case 18:
                ur0 ur0Var2 = (ur0) this.f38948b;
                ArrayList arrayList7 = (ArrayList) this.f38949c;
                xs0 xs0Var3 = ur0Var2.f38726w;
                boolean z16 = xs0Var3.X0;
                sr0[] sr0VarArr = xs0Var3.m0;
                if (z16) {
                    ur0Var2.f38725s--;
                    int b10 = ur0Var2.b();
                    ur0Var2.d = arrayList7;
                    int b11 = ur0Var2.b();
                    if (ur0Var2.f38725s == 0 || b11 != 0) {
                        xs0Var3.z1(false);
                    }
                    for (int i19 = 0; i19 < sr0VarArr.length; i19++) {
                        sr0 sr0Var2 = sr0VarArr[i19];
                        if (sr0Var2.E == ur0Var2.f38724r) {
                            if (ur0Var2.f38725s == 0 && b11 == 0) {
                                sr0Var2.f38129w.d.setText(org.telegram.messenger.id.M0(2131748168, "NoResult"));
                                sr0VarArr[i19].f38129w.f31928f.setVisibility(8);
                                sr0VarArr[i19].f38129w.e(false, true);
                            } else if (b10 == 0) {
                                xs0Var3.D(sr0Var2.h, 0, null);
                            }
                        }
                    }
                    ur0Var2.f();
                    return;
                }
                return;
            case 19:
                org.telegram.messenger.qs f11 = org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24470s0);
                Boolean bool = Boolean.FALSE;
                f11.m(215, bool, (TLObject) this.f38948b, (TLRPC.Document) this.f38949c, null, bool);
                return;
            case 20:
                org.telegram.messenger.qp.s1(((kw0) this.f38948b).f35438a.f36705a).h5((TLRPC.EmojiStatus) this.f38949c, null);
                return;
            case 21:
                s01 s01Var = (s01) this.f38948b;
                String str2 = (String) this.f38949c;
                s01Var.O = null;
                org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(s01Var.f37829a).f24877q7;
                long j12 = -s01Var.f37831b;
                fx fxVar = new fx(6, s01Var, str2);
                k00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = k00Var.getMessagesController().j1(-j12);
                tL_messages_getForumTopics.f27176q = str2;
                tL_messages_getForumTopics.limit = 50;
                s01Var.N = k00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.oj(k00Var, j12, fxVar, 10));
                return;
            case 22:
                m11 m11Var = (m11) this.f38948b;
                org.telegram.messenger.qp.s1(m11Var.f35850e).f24877q7.d((ArrayList) this.f38949c, -m11Var.f35852f);
                int i20 = m11.f35842l0;
                return;
            case 23:
                m11 m11Var2 = (m11) this.f38948b;
                m11Var2.getClass();
                org.telegram.messenger.qp.s1(m11Var2.f35850e).V2(0, ((TLRPC.Updates) this.f38949c).chats.get(0).f26956id, true);
                return;
            case 24:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f38948b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f38949c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i10 = 1;
                    }
                    l1Var.d0(i10);
                    return;
                }
                return;
            case 25:
                k21 k21Var = (k21) this.f38948b;
                TLObject tLObject5 = (TLObject) this.f38949c;
                org.telegram.messenger.au auVar = k21Var.f35169p1;
                k21Var.f35164i1 = null;
                if (tLObject5 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject5;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        k21Var.L1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (auVar != null) {
                            auVar.set(richMessage);
                            k21Var.E1.D(auVar);
                            return;
                        }
                        return;
                    }
                }
                if (k21Var.L1) {
                    k21Var.dismiss();
                    org.telegram.messenger.qs.e().k(292, 1, org.telegram.messenger.id.M0(2131743949, null));
                    return;
                }
                org.telegram.messenger.k5.p(null, 2131743949, new hc((FrameLayout) k21Var.f28619b, k21Var.I0), null);
                g21 g21Var = k21Var.f35173t1.f34514e;
                String str3 = k21Var.f35172s1;
                k21Var.f35171r1 = str3;
                g21Var.setText(k21.O0(str3, null, null));
                return;
            case 26:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.f38948b;
                ((org.telegram.ui.ActionBar.g1) this.f38949c).d(true);
                a31.a(bkVar.getContext(), bkVar.d);
                return;
            case 27:
                ((org.telegram.messenger.f10) this.f38949c).J(((org.telegram.ui.bk) this.f38948b).f31679b, false, false);
                return;
            case 28:
                UndoView undoView = (UndoView) this.f38948b;
                TLObject tLObject6 = (TLObject) this.f38949c;
                if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    undoView.f31612s.presentFragment(new org.telegram.ui.hl0((TLRPC.PaymentReceipt) tLObject6));
                    return;
                }
                int i21 = UndoView.f31596i0;
                undoView.getClass();
                return;
            default:
                ((x31) this.f38948b).D.onClick((org.telegram.ui.Cells.q8) this.f38949c);
                return;
        }
    }

    public v80(Object obj, Object obj2, Object obj3, int i7) {
        this.f38947a = i7;
        this.f38948b = obj;
        this.f38949c = obj2;
    }
}
