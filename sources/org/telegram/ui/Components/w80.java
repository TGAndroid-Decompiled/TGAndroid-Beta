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
public final class w80 implements Runnable {
    public final int f39992a;
    public final Object f39993b;
    public final Object f39994c;

    public w80(int i7, Object obj, Object obj2) {
        this.f39992a = i7;
        this.f39993b = obj;
        this.f39994c = obj2;
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
        switch (this.f39992a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f39994c;
                ((yh.b) this.f39993b).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new bt(editTextBoldCursor, 6));
                return;
            case 1:
                ob.c cVar = (ob.c) this.f39993b;
                Runnable runnable = (Runnable) this.f39994c;
                cVar.getClass();
                runnable.run();
                cVar.f20894a.remove(runnable);
                return;
            case 2:
                af0 af0Var = (af0) this.f39993b;
                TLObject tLObject = (TLObject) this.f39994c;
                af0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    af0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        af0Var.a(false);
                        return;
                    }
                    af0Var.d();
                    af0Var.f31781c.f37556f3.O(true);
                    return;
                }
                return;
            case 3:
                ff0 ff0Var = (ff0) this.f39993b;
                ArrayList arrayList = (ArrayList) this.f39994c;
                ArrayList arrayList2 = ff0Var.f33648a;
                int i11 = ff0Var.f33656s;
                int size = arrayList.size();
                ff0Var.f33656s = size;
                if (i11 != size && ff0Var.P != null) {
                    ff0Var.g();
                }
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    cf0 cf0Var = (cf0) arrayList2.get(i12);
                    if (cf0Var.f32665o && !cf0Var.f32666p) {
                        arrayList.add(cf0Var);
                    } else if (ff0.i(cf0Var.f32653a, arrayList) == null) {
                        ff0 ff0Var2 = cf0Var.f32674y;
                        float f10 = ff0Var2.K;
                        RectF rectF = cf0Var.f32655c;
                        RectF rectF2 = cf0Var.f32657f;
                        b80 b80Var = cf0Var.f32668r;
                        if (b80Var != null) {
                            b80Var.a();
                            cf0Var.f32670t = z14;
                            cf0Var.f32669s = z14;
                        }
                        cf0Var.f32665o = z15;
                        if (rectF.left - 1.0f <= f10) {
                            z9 = z15;
                        } else {
                            z9 = z14;
                        }
                        if (rectF.right + 1.0f >= ff0Var2.getMeasuredWidth() - f10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z9 && z10) {
                            z9 = false;
                            z10 = false;
                        }
                        cf0Var.f32658g.set(rectF);
                        rectF2.set(rectF);
                        if (z9) {
                            rectF2.right = rectF2.left;
                        } else if (z10) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i13 = cf0Var.f32653a;
                            if (i13 != 3 && i13 != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                                if (ff0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    z12 = false;
                                    cf0Var.f32656e.e(z11, 0.0f);
                                    arrayList.add(cf0Var);
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
                            cf0Var.f32656e.e(z11, 0.0f);
                            arrayList.add(cf0Var);
                            i12++;
                            z13 = z12;
                            z14 = false;
                            z15 = true;
                        }
                        z11 = true;
                        z12 = false;
                        cf0Var.f32656e.e(z11, 0.0f);
                        arrayList.add(cf0Var);
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
                ff0Var.invalidate();
                return;
            case 4:
                cf0 cf0Var2 = (cf0) this.f39994c;
                ef0 ef0Var = ((ff0) this.f39993b).f33659y;
                int i14 = cf0Var2.f32653a;
                RectF rectF3 = cf0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.vt0) ef0Var).f50774b, i14, rectF3.left, rectF3.top);
                return;
            case 5:
                RLottieNative rLottieNative = (RLottieNative) this.f39993b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f39994c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 6:
                ih0 ih0Var = (ih0) this.f39993b;
                ArrayList arrayList3 = (ArrayList) this.f39994c;
                ArrayList arrayList4 = ih0Var.f34754r;
                ih0Var.f34753n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    hh0 hh0Var = (hh0) obj;
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList4.size()) {
                            TLObject tLObject2 = ((hh0) arrayList4.get(i16)).f34299a;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                j3 = -((TLRPC.Chat) tLObject2).f26956id;
                            } else if (tLObject2 instanceof TLRPC.User) {
                                j3 = ((TLRPC.User) tLObject2).f27105id;
                            } else {
                                j3 = 0;
                            }
                            TLObject tLObject3 = hh0Var.f34299a;
                            if (tLObject3 instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject3).f26956id;
                            } else if (tLObject3 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject3).f27105id;
                            } else {
                                j10 = 0;
                            }
                            if (j3 == j10) {
                                if (hh0Var.f34301c > 0) {
                                    ((hh0) arrayList4.get(i16)).f34301c = hh0Var.f34301c;
                                }
                            } else {
                                i16++;
                            }
                        } else {
                            arrayList4.add(hh0Var);
                        }
                    }
                }
                q0.a aVar = ih0Var.f34757x;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                ih0Var.a();
                return;
            case 7:
                zl0 zl0Var = (zl0) this.f39993b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f39994c;
                ArrayList arrayList5 = zl0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = zl0Var.K()) < zl0Var.b()) {
                    arrayList5.remove(indexOf);
                    zl0Var.s(K + 1 + indexOf);
                    int size4 = zl0Var.f16749j0.f16995e.size();
                    int size5 = arrayList5.size();
                    if (zl0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        zl0Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((zl0) this.f39993b).S();
                hc.a0((org.telegram.ui.yw) this.f39994c).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                return;
            case 9:
                ((lm0) this.f39993b).sendAccessibilityEvent((View) this.f39994c, 4);
                return;
            case 10:
                ne neVar = (ne) this.f39993b;
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.f39994c;
                if (cnVar != null) {
                    cnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    neVar.dismiss();
                    return;
                }
                return;
            case 11:
                ((WindowManager) this.f39994c).removeView(((ne) this.f39993b).B);
                return;
            case 12:
                no0 no0Var = (no0) this.f39993b;
                TLObject tLObject4 = (TLObject) this.f39994c;
                if (tLObject4 != null) {
                    no0Var.f36432c2 = (TLRPC.TL_exportedMessageLink) tLObject4;
                    no0Var.a1();
                    if (no0Var.f36433e2) {
                        no0Var.M0();
                    }
                }
                no0Var.d2 = false;
                return;
            case 13:
                di.s6 s6Var = (di.s6) this.f39994c;
                zp0 zp0Var = ((zs0) this.f39993b).f41061b0;
                if (zp0Var != null) {
                    int i17 = s6Var.f9732a;
                    zp0Var.f48546b.d(i17, zp0Var.d.i(i17));
                    return;
                }
                return;
            case 14:
                ur0 ur0Var = (ur0) this.f39993b;
                di.b4 b4Var = (di.b4) this.f39994c;
                ur0Var.F = null;
                ur0Var.G = null;
                b4Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new f60(b4Var, 20)).start();
                return;
            case 15:
                bi.v9 v9Var = (bi.v9) this.f39993b;
                v9Var.f4907e = !v9Var.f4907e;
                ((Runnable[]) this.f39994c)[0].run();
                v9Var.j(true);
                return;
            case 16:
                hc.a0(((lr0) this.f39993b).f35829f.f41127x1).Q(2131623989, 36, org.telegram.messenger.id.a0(null, null, 2131742836, ((TLRPC.Chat) this.f39994c).title)).k(true);
                return;
            case 17:
                wr0 wr0Var = (wr0) this.f39993b;
                String str = (String) this.f39994c;
                if (!wr0Var.f40140w.f41121v1[wr0Var.f40138r].f36778a.isEmpty() && ((i7 = wr0Var.f40138r) == 1 || i7 == 4)) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, wr0Var.f40140w.f41121v1[i7].f36778a);
                    int e12 = ijVar.e1();
                    long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
                    zs0 zs0Var = wr0Var.f40140w;
                    if (zs0Var.l1 == zs0Var.f41127x1.getUserConfig().e()) {
                        j11 = ijVar.P1();
                    }
                    wr0Var.F(e12, B0, j11, str);
                } else if (wr0Var.f40138r == 3) {
                    zs0 zs0Var2 = wr0Var.f40140w;
                    wr0Var.F(0, zs0Var2.l1, zs0Var2.F, str);
                }
                int i18 = wr0Var.f40138r;
                if (i18 == 1 || i18 == 4) {
                    ArrayList arrayList6 = new ArrayList(wr0Var.f40140w.f41121v1[wr0Var.f40138r].f36778a);
                    wr0Var.f40139s++;
                    Utilities.f21338g.c(new ng(wr0Var, str, arrayList6, 24));
                    return;
                }
                return;
            case 18:
                wr0 wr0Var2 = (wr0) this.f39993b;
                ArrayList arrayList7 = (ArrayList) this.f39994c;
                zs0 zs0Var3 = wr0Var2.f40140w;
                boolean z16 = zs0Var3.X0;
                ur0[] ur0VarArr = zs0Var3.m0;
                if (z16) {
                    wr0Var2.f40139s--;
                    int b10 = wr0Var2.b();
                    wr0Var2.d = arrayList7;
                    int b11 = wr0Var2.b();
                    if (wr0Var2.f40139s == 0 || b11 != 0) {
                        zs0Var3.B1(false);
                    }
                    for (int i19 = 0; i19 < ur0VarArr.length; i19++) {
                        ur0 ur0Var2 = ur0VarArr[i19];
                        if (ur0Var2.E == wr0Var2.f40138r) {
                            if (wr0Var2.f40139s == 0 && b11 == 0) {
                                ur0Var2.f38795w.d.setText(org.telegram.messenger.id.M0(2131748167, "NoResult"));
                                ur0VarArr[i19].f38795w.f32769f.setVisibility(8);
                                ur0VarArr[i19].f38795w.e(false, true);
                            } else if (b10 == 0) {
                                zs0Var3.D(ur0Var2.h, 0, null);
                            }
                        }
                    }
                    wr0Var2.f();
                    return;
                }
                return;
            case 19:
                org.telegram.messenger.qs f11 = org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24470s0);
                Boolean bool = Boolean.FALSE;
                f11.m(215, bool, (TLObject) this.f39993b, (TLRPC.Document) this.f39994c, null, bool);
                return;
            case 20:
                org.telegram.messenger.qp.s1(((lw0) this.f39993b).f35862a.f37102a).h5((TLRPC.EmojiStatus) this.f39994c, null);
                return;
            case 21:
                t01 t01Var = (t01) this.f39993b;
                String str2 = (String) this.f39994c;
                t01Var.O = null;
                org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(t01Var.f38207a).f24877q7;
                long j12 = -t01Var.f38209b;
                fx fxVar = new fx(6, t01Var, str2);
                k00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = k00Var.getMessagesController().j1(-j12);
                tL_messages_getForumTopics.f27176q = str2;
                tL_messages_getForumTopics.limit = 50;
                t01Var.N = k00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.oj(k00Var, j12, fxVar, 10));
                return;
            case 22:
                n11 n11Var = (n11) this.f39993b;
                org.telegram.messenger.qp.s1(n11Var.f36208e).f24877q7.d((ArrayList) this.f39994c, -n11Var.f36210f);
                int i20 = n11.f36200l0;
                return;
            case 23:
                n11 n11Var2 = (n11) this.f39993b;
                n11Var2.getClass();
                org.telegram.messenger.qp.s1(n11Var2.f36208e).V2(0, ((TLRPC.Updates) this.f39994c).chats.get(0).f26956id, true);
                return;
            case 24:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f39993b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f39994c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i10 = 1;
                    }
                    l1Var.d0(i10);
                    return;
                }
                return;
            case 25:
                l21 l21Var = (l21) this.f39993b;
                TLObject tLObject5 = (TLObject) this.f39994c;
                org.telegram.messenger.au auVar = l21Var.f35560p1;
                l21Var.f35555i1 = null;
                if (tLObject5 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject5;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        l21Var.L1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (auVar != null) {
                            auVar.set(richMessage);
                            l21Var.E1.D(auVar);
                            return;
                        }
                        return;
                    }
                }
                if (l21Var.L1) {
                    l21Var.dismiss();
                    org.telegram.messenger.qs.e().k(292, 1, org.telegram.messenger.id.M0(2131743946, null));
                    return;
                }
                org.telegram.messenger.k5.p(null, 2131743946, new hc((FrameLayout) l21Var.f28624b, l21Var.I0), null);
                h21 h21Var = l21Var.f35564t1.f34919e;
                String str3 = l21Var.f35563s1;
                l21Var.f35562r1 = str3;
                h21Var.setText(l21.O0(str3, null, null));
                return;
            case 26:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) this.f39993b;
                ((org.telegram.ui.ActionBar.g1) this.f39994c).d(true);
                b31.a(dkVar.getContext(), dkVar.d);
                return;
            case 27:
                ((org.telegram.messenger.f10) this.f39994c).J(((org.telegram.ui.dk) this.f39993b).f32077b, false, false);
                return;
            case 28:
                UndoView undoView = (UndoView) this.f39993b;
                TLObject tLObject6 = (TLObject) this.f39994c;
                if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    undoView.f31617s.presentFragment(new org.telegram.ui.jl0((TLRPC.PaymentReceipt) tLObject6));
                    return;
                }
                int i21 = UndoView.f31601i0;
                undoView.getClass();
                return;
            default:
                ((y31) this.f39993b).D.onClick((org.telegram.ui.Cells.q8) this.f39994c);
                return;
        }
    }

    public w80(Object obj, Object obj2, Object obj3, int i7) {
        this.f39992a = i7;
        this.f39993b = obj;
        this.f39994c = obj2;
    }
}
