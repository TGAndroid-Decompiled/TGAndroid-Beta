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
    public final int f38912a;
    public final Object f38913b;
    public final Object f38914c;

    public v80(int i7, Object obj, Object obj2) {
        this.f38912a = i7;
        this.f38913b = obj;
        this.f38914c = obj2;
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
        switch (this.f38912a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f38914c;
                ((yh.b) this.f38913b).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new at(editTextBoldCursor, 6));
                return;
            case 1:
                ob.c cVar = (ob.c) this.f38913b;
                Runnable runnable = (Runnable) this.f38914c;
                cVar.getClass();
                runnable.run();
                cVar.f20891a.remove(runnable);
                return;
            case 2:
                ze0 ze0Var = (ze0) this.f38913b;
                TLObject tLObject = (TLObject) this.f38914c;
                ze0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    ze0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        ze0Var.a(false);
                        return;
                    }
                    ze0Var.d();
                    ze0Var.f40945c.f37160f3.O(true);
                    return;
                }
                return;
            case 3:
                ef0 ef0Var = (ef0) this.f38913b;
                ArrayList arrayList = (ArrayList) this.f38914c;
                ArrayList arrayList2 = ef0Var.f33236a;
                int i11 = ef0Var.f33244s;
                int size = arrayList.size();
                ef0Var.f33244s = size;
                if (i11 != size && ef0Var.P != null) {
                    ef0Var.g();
                }
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    bf0 bf0Var = (bf0) arrayList2.get(i12);
                    if (bf0Var.f32161o && !bf0Var.f32162p) {
                        arrayList.add(bf0Var);
                    } else if (ef0.i(bf0Var.f32149a, arrayList) == null) {
                        ef0 ef0Var2 = bf0Var.f32170y;
                        float f10 = ef0Var2.K;
                        RectF rectF = bf0Var.f32151c;
                        RectF rectF2 = bf0Var.f32153f;
                        a80 a80Var = bf0Var.f32164r;
                        if (a80Var != null) {
                            a80Var.a();
                            bf0Var.f32166t = z14;
                            bf0Var.f32165s = z14;
                        }
                        bf0Var.f32161o = z15;
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
                        bf0Var.f32154g.set(rectF);
                        rectF2.set(rectF);
                        if (z9) {
                            rectF2.right = rectF2.left;
                        } else if (z10) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i13 = bf0Var.f32149a;
                            if (i13 != 3 && i13 != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                                if (ef0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    z12 = false;
                                    bf0Var.f32152e.e(z11, 0.0f);
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
                            bf0Var.f32152e.e(z11, 0.0f);
                            arrayList.add(bf0Var);
                            i12++;
                            z13 = z12;
                            z14 = false;
                            z15 = true;
                        }
                        z11 = true;
                        z12 = false;
                        bf0Var.f32152e.e(z11, 0.0f);
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
                bf0 bf0Var2 = (bf0) this.f38914c;
                df0 df0Var = ((ef0) this.f38913b).f33247y;
                int i14 = bf0Var2.f32149a;
                RectF rectF3 = bf0Var2.d;
                ProfileActivity.m0(((org.telegram.ui.tt0) df0Var).f50149b, i14, rectF3.left, rectF3.top);
                return;
            case 5:
                RLottieNative rLottieNative = (RLottieNative) this.f38913b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f38914c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 6:
                hh0 hh0Var = (hh0) this.f38913b;
                ArrayList arrayList3 = (ArrayList) this.f38914c;
                ArrayList arrayList4 = hh0Var.f34336r;
                hh0Var.f34335n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    gh0 gh0Var = (gh0) obj;
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList4.size()) {
                            TLObject tLObject2 = ((gh0) arrayList4.get(i16)).f33917a;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                j3 = -((TLRPC.Chat) tLObject2).f26953id;
                            } else if (tLObject2 instanceof TLRPC.User) {
                                j3 = ((TLRPC.User) tLObject2).f27102id;
                            } else {
                                j3 = 0;
                            }
                            TLObject tLObject3 = gh0Var.f33917a;
                            if (tLObject3 instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject3).f26953id;
                            } else if (tLObject3 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject3).f27102id;
                            } else {
                                j10 = 0;
                            }
                            if (j3 == j10) {
                                if (gh0Var.f33919c > 0) {
                                    ((gh0) arrayList4.get(i16)).f33919c = gh0Var.f33919c;
                                }
                            } else {
                                i16++;
                            }
                        } else {
                            arrayList4.add(gh0Var);
                        }
                    }
                }
                q0.a aVar = hh0Var.f34339x;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                hh0Var.a();
                return;
            case 7:
                yl0 yl0Var = (yl0) this.f38913b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f38914c;
                ArrayList arrayList5 = yl0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = yl0Var.K()) < yl0Var.b()) {
                    arrayList5.remove(indexOf);
                    yl0Var.s(K + 1 + indexOf);
                    int size4 = yl0Var.f16746j0.f16992e.size();
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
                ((yl0) this.f38913b).S();
                hc.a0((org.telegram.ui.ww) this.f38914c).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                return;
            case 9:
                ((km0) this.f38913b).sendAccessibilityEvent((View) this.f38914c, 4);
                return;
            case 10:
                ne neVar = (ne) this.f38913b;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.f38914c;
                if (anVar != null) {
                    anVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    neVar.dismiss();
                    return;
                }
                return;
            case 11:
                ((WindowManager) this.f38914c).removeView(((ne) this.f38913b).B);
                return;
            case 12:
                mo0 mo0Var = (mo0) this.f38913b;
                TLObject tLObject4 = (TLObject) this.f38914c;
                if (tLObject4 != null) {
                    mo0Var.f36010c2 = (TLRPC.TL_exportedMessageLink) tLObject4;
                    mo0Var.a1();
                    if (mo0Var.f36011e2) {
                        mo0Var.M0();
                    }
                }
                mo0Var.d2 = false;
                return;
            case 13:
                di.r6 r6Var = (di.r6) this.f38914c;
                yp0 yp0Var = ((xs0) this.f38913b).f40374b0;
                if (yp0Var != null) {
                    int i17 = r6Var.f9701a;
                    yp0Var.f47336b.d(i17, yp0Var.d.i(i17));
                    return;
                }
                return;
            case 14:
                sr0 sr0Var = (sr0) this.f38913b;
                di.a4 a4Var = (di.a4) this.f38914c;
                sr0Var.F = null;
                sr0Var.G = null;
                a4Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new e60(a4Var, 20)).start();
                return;
            case 15:
                bi.v9 v9Var = (bi.v9) this.f38913b;
                v9Var.f4909e = !v9Var.f4909e;
                ((Runnable[]) this.f38914c)[0].run();
                v9Var.j(true);
                return;
            case 16:
                hc.a0(((jr0) this.f38913b).f35049f.f40440x1).Q(2131623989, 36, org.telegram.messenger.hd.a0(null, null, 2131742837, ((TLRPC.Chat) this.f38914c).title)).k(true);
                return;
            case 17:
                ur0 ur0Var = (ur0) this.f38913b;
                String str = (String) this.f38914c;
                if (!ur0Var.f38711w.f40434v1[ur0Var.f38709r].f36063a.isEmpty() && ((i7 = ur0Var.f38709r) == 1 || i7 == 4)) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, ur0Var.f38711w.f40434v1[i7].f36063a);
                    int f12 = ijVar.f1();
                    long B0 = org.telegram.messenger.ij.B0(ijVar.f23244k);
                    xs0 xs0Var = ur0Var.f38711w;
                    if (xs0Var.l1 == xs0Var.f40440x1.getUserConfig().e()) {
                        j11 = ijVar.Q1();
                    }
                    ur0Var.F(f12, B0, j11, str);
                } else if (ur0Var.f38709r == 3) {
                    xs0 xs0Var2 = ur0Var.f38711w;
                    ur0Var.F(0, xs0Var2.l1, xs0Var2.F, str);
                }
                int i18 = ur0Var.f38709r;
                if (i18 == 1 || i18 == 4) {
                    ArrayList arrayList6 = new ArrayList(ur0Var.f38711w.f40434v1[ur0Var.f38709r].f36063a);
                    ur0Var.f38710s++;
                    Utilities.f21335g.c(new ng(ur0Var, str, arrayList6, 24));
                    return;
                }
                return;
            case 18:
                ur0 ur0Var2 = (ur0) this.f38913b;
                ArrayList arrayList7 = (ArrayList) this.f38914c;
                xs0 xs0Var3 = ur0Var2.f38711w;
                boolean z16 = xs0Var3.X0;
                sr0[] sr0VarArr = xs0Var3.m0;
                if (z16) {
                    ur0Var2.f38710s--;
                    int b10 = ur0Var2.b();
                    ur0Var2.d = arrayList7;
                    int b11 = ur0Var2.b();
                    if (ur0Var2.f38710s == 0 || b11 != 0) {
                        xs0Var3.z1(false);
                    }
                    for (int i19 = 0; i19 < sr0VarArr.length; i19++) {
                        sr0 sr0Var2 = sr0VarArr[i19];
                        if (sr0Var2.E == ur0Var2.f38709r) {
                            if (ur0Var2.f38710s == 0 && b11 == 0) {
                                sr0Var2.f38113w.d.setText(org.telegram.messenger.hd.M0(2131748166, "NoResult"));
                                sr0VarArr[i19].f38113w.f31926f.setVisibility(8);
                                sr0VarArr[i19].f38113w.e(false, true);
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
                org.telegram.messenger.qs f11 = org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24467s0);
                Boolean bool = Boolean.FALSE;
                f11.m(215, bool, (TLObject) this.f38913b, (TLRPC.Document) this.f38914c, null, bool);
                return;
            case 20:
                org.telegram.messenger.qp.s1(((kw0) this.f38913b).f35424a.f36685a).h5((TLRPC.EmojiStatus) this.f38914c, null);
                return;
            case 21:
                s01 s01Var = (s01) this.f38913b;
                String str2 = (String) this.f38914c;
                s01Var.O = null;
                org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(s01Var.f37813a).f24870q7;
                long j12 = -s01Var.f37815b;
                ex exVar = new ex(6, s01Var, str2);
                k00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = k00Var.getMessagesController().j1(-j12);
                tL_messages_getForumTopics.f27173q = str2;
                tL_messages_getForumTopics.limit = 50;
                s01Var.N = k00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.oj(k00Var, j12, exVar, 10));
                return;
            case 22:
                m11 m11Var = (m11) this.f38913b;
                org.telegram.messenger.qp.s1(m11Var.f35822e).f24870q7.d((ArrayList) this.f38914c, -m11Var.f35824f);
                int i20 = m11.f35814l0;
                return;
            case 23:
                m11 m11Var2 = (m11) this.f38913b;
                m11Var2.getClass();
                org.telegram.messenger.qp.s1(m11Var2.f35822e).V2(0, ((TLRPC.Updates) this.f38914c).chats.get(0).f26953id, true);
                return;
            case 24:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f38913b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f38914c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i10 = 1;
                    }
                    l1Var.d0(i10);
                    return;
                }
                return;
            case 25:
                k21 k21Var = (k21) this.f38913b;
                TLObject tLObject5 = (TLObject) this.f38914c;
                org.telegram.messenger.au auVar = k21Var.f35143p1;
                k21Var.f35138i1 = null;
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
                    org.telegram.messenger.qs.e().k(292, 1, org.telegram.messenger.hd.M0(2131743947, null));
                    return;
                }
                org.telegram.messenger.k5.p(null, 2131743947, new hc((FrameLayout) k21Var.f28616b, k21Var.I0), null);
                g21 g21Var = k21Var.f35147t1.f34470e;
                String str3 = k21Var.f35146s1;
                k21Var.f35145r1 = str3;
                g21Var.setText(k21.O0(str3, null, null));
                return;
            case 26:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.f38913b;
                ((org.telegram.ui.ActionBar.g1) this.f38914c).d(true);
                a31.a(bkVar.getContext(), bkVar.d);
                return;
            case 27:
                ((org.telegram.messenger.f10) this.f38914c).J(((org.telegram.ui.bk) this.f38913b).f31670b, false, false);
                return;
            case 28:
                UndoView undoView = (UndoView) this.f38913b;
                TLObject tLObject6 = (TLObject) this.f38914c;
                if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    undoView.f31608s.presentFragment(new org.telegram.ui.hl0((TLRPC.PaymentReceipt) tLObject6));
                    return;
                }
                int i21 = UndoView.f31592i0;
                undoView.getClass();
                return;
            default:
                ((x31) this.f38913b).D.onClick((org.telegram.ui.Cells.q8) this.f38914c);
                return;
        }
    }

    public v80(Object obj, Object obj2, Object obj3, int i7) {
        this.f38912a = i7;
        this.f38913b = obj;
        this.f38914c = obj2;
    }
}
