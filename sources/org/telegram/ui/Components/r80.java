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
public final class r80 implements Runnable {
    public final int f37567a;
    public final Object f37568b;
    public final Object f37569c;

    public r80(int i7, Object obj, Object obj2) {
        this.f37567a = i7;
        this.f37568b = obj;
        this.f37569c = obj2;
    }

    @Override
    public final void run() {
        bi.u7 u7Var;
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
        switch (this.f37567a) {
            case 0:
                v80 v80Var = (v80) this.f37568b;
                if (!((boolean[]) this.f37569c)[0] && (u7Var = v80Var.Q) != null) {
                    u7Var.run();
                }
                v80Var.Q = null;
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f37569c;
                ((yh.b) this.f37568b).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new at(editTextBoldCursor, 6));
                return;
            case 2:
                ob.c cVar = (ob.c) this.f37568b;
                Runnable runnable = (Runnable) this.f37569c;
                cVar.getClass();
                runnable.run();
                cVar.f20899a.remove(runnable);
                return;
            case 3:
                ze0 ze0Var = (ze0) this.f37568b;
                TLObject tLObject = (TLObject) this.f37569c;
                ze0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    ze0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        ze0Var.a(false);
                        return;
                    }
                    ze0Var.d();
                    ze0Var.f40923c.f37496f3.O(true);
                    return;
                }
                return;
            case 4:
                ef0 ef0Var = (ef0) this.f37568b;
                ArrayList arrayList = (ArrayList) this.f37569c;
                ArrayList arrayList2 = ef0Var.f33234a;
                int i11 = ef0Var.f33242s;
                int size = arrayList.size();
                ef0Var.f33242s = size;
                if (i11 != size && ef0Var.P != null) {
                    ef0Var.g();
                }
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    bf0 bf0Var = (bf0) arrayList2.get(i12);
                    if (bf0Var.f32241o && !bf0Var.f32242p) {
                        arrayList.add(bf0Var);
                    } else if (ef0.i(bf0Var.f32229a, arrayList) == null) {
                        ef0 ef0Var2 = bf0Var.f32250y;
                        float f10 = ef0Var2.K;
                        RectF rectF = bf0Var.f32231c;
                        RectF rectF2 = bf0Var.f32233f;
                        a80 a80Var = bf0Var.f32244r;
                        if (a80Var != null) {
                            a80Var.a();
                            bf0Var.f32246t = z14;
                            bf0Var.f32245s = z14;
                        }
                        bf0Var.f32241o = z15;
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
                        bf0Var.f32234g.set(rectF);
                        rectF2.set(rectF);
                        if (z9) {
                            rectF2.right = rectF2.left;
                        } else if (z10) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i13 = bf0Var.f32229a;
                            if (i13 != 3 && i13 != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                                if (ef0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    z12 = false;
                                    bf0Var.f32232e.e(z11, 0.0f);
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
                            bf0Var.f32232e.e(z11, 0.0f);
                            arrayList.add(bf0Var);
                            i12++;
                            z13 = z12;
                            z14 = false;
                            z15 = true;
                        }
                        z11 = true;
                        z12 = false;
                        bf0Var.f32232e.e(z11, 0.0f);
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
            case 5:
                bf0 bf0Var2 = (bf0) this.f37569c;
                df0 df0Var = ((ef0) this.f37568b).f33245y;
                int i14 = bf0Var2.f32229a;
                RectF rectF3 = bf0Var2.d;
                ProfileActivity.l0(((org.telegram.ui.wt0) df0Var).f51444b, i14, rectF3.left, rectF3.top);
                return;
            case 6:
                RLottieNative rLottieNative = (RLottieNative) this.f37568b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f37569c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 7:
                hh0 hh0Var = (hh0) this.f37568b;
                ArrayList arrayList3 = (ArrayList) this.f37569c;
                ArrayList arrayList4 = hh0Var.f34354r;
                hh0Var.f34353n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    gh0 gh0Var = (gh0) obj;
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList4.size()) {
                            TLObject tLObject2 = ((gh0) arrayList4.get(i16)).f33899a;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                j3 = -((TLRPC.Chat) tLObject2).f26960id;
                            } else if (tLObject2 instanceof TLRPC.User) {
                                j3 = ((TLRPC.User) tLObject2).f27109id;
                            } else {
                                j3 = 0;
                            }
                            TLObject tLObject3 = gh0Var.f33899a;
                            if (tLObject3 instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject3).f26960id;
                            } else if (tLObject3 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject3).f27109id;
                            } else {
                                j10 = 0;
                            }
                            if (j3 == j10) {
                                if (gh0Var.f33901c > 0) {
                                    ((gh0) arrayList4.get(i16)).f33901c = gh0Var.f33901c;
                                }
                            } else {
                                i16++;
                            }
                        } else {
                            arrayList4.add(gh0Var);
                        }
                    }
                }
                q0.a aVar = hh0Var.f34357x;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                hh0Var.a();
                return;
            case 8:
                yl0 yl0Var = (yl0) this.f37568b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f37569c;
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
            case 9:
                ((yl0) this.f37568b).S();
                gc.a0((org.telegram.ui.zw) this.f37569c).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                return;
            case 10:
                ((km0) this.f37568b).sendAccessibilityEvent((View) this.f37569c, 4);
                return;
            case 11:
                me meVar = (me) this.f37568b;
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.f37569c;
                if (cnVar != null) {
                    cnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    meVar.dismiss();
                    return;
                }
                return;
            case 12:
                ((WindowManager) this.f37569c).removeView(((me) this.f37568b).B);
                return;
            case 13:
                mo0 mo0Var = (mo0) this.f37568b;
                TLObject tLObject4 = (TLObject) this.f37569c;
                if (tLObject4 != null) {
                    mo0Var.f36031f2 = (TLRPC.TL_exportedMessageLink) tLObject4;
                    mo0Var.a1();
                    if (mo0Var.f36033h2) {
                        mo0Var.M0();
                    }
                }
                mo0Var.f36032g2 = false;
                return;
            case 14:
                di.s6 s6Var = (di.s6) this.f37569c;
                yp0 yp0Var = ((ys0) this.f37568b).f40653b0;
                if (yp0Var != null) {
                    int i17 = s6Var.f9737a;
                    yp0Var.f48862b.d(i17, yp0Var.d.i(i17));
                    return;
                }
                return;
            case 15:
                tr0 tr0Var = (tr0) this.f37568b;
                di.b4 b4Var = (di.b4) this.f37569c;
                tr0Var.F = null;
                tr0Var.G = null;
                b4Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new e60(b4Var, 20)).start();
                return;
            case 16:
                bi.v9 v9Var = (bi.v9) this.f37568b;
                v9Var.f4908e = !v9Var.f4908e;
                ((Runnable[]) this.f37569c)[0].run();
                v9Var.j(true);
                return;
            case 17:
                gc.a0(((kr0) this.f37568b).f35421f.f40719x1).Q(2131623989, 36, org.telegram.messenger.id.a0(null, null, 2131742836, ((TLRPC.Chat) this.f37569c).title)).k(true);
                return;
            case 18:
                vr0 vr0Var = (vr0) this.f37568b;
                String str = (String) this.f37569c;
                if (!vr0Var.f39725w.f40713v1[vr0Var.f39723r].f36369a.isEmpty() && ((i7 = vr0Var.f39723r) == 1 || i7 == 4)) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, vr0Var.f39725w.f40713v1[i7].f36369a);
                    int e12 = ijVar.e1();
                    long B0 = org.telegram.messenger.ij.B0(ijVar.f23266k);
                    ys0 ys0Var = vr0Var.f39725w;
                    if (ys0Var.l1 == ys0Var.f40719x1.getUserConfig().e()) {
                        j11 = ijVar.P1();
                    }
                    vr0Var.F(e12, B0, j11, str);
                } else if (vr0Var.f39723r == 3) {
                    ys0 ys0Var2 = vr0Var.f39725w;
                    vr0Var.F(0, ys0Var2.l1, ys0Var2.F, str);
                }
                int i18 = vr0Var.f39723r;
                if (i18 == 1 || i18 == 4) {
                    ArrayList arrayList6 = new ArrayList(vr0Var.f39725w.f40713v1[vr0Var.f39723r].f36369a);
                    vr0Var.f39724s++;
                    Utilities.f21343g.c(new mg(vr0Var, str, arrayList6, 24));
                    return;
                }
                return;
            case 19:
                vr0 vr0Var2 = (vr0) this.f37568b;
                ArrayList arrayList7 = (ArrayList) this.f37569c;
                ys0 ys0Var3 = vr0Var2.f39725w;
                boolean z16 = ys0Var3.X0;
                tr0[] tr0VarArr = ys0Var3.m0;
                if (z16) {
                    vr0Var2.f39724s--;
                    int b10 = vr0Var2.b();
                    vr0Var2.d = arrayList7;
                    int b11 = vr0Var2.b();
                    if (vr0Var2.f39724s == 0 || b11 != 0) {
                        ys0Var3.B1(false);
                    }
                    for (int i19 = 0; i19 < tr0VarArr.length; i19++) {
                        tr0 tr0Var2 = tr0VarArr[i19];
                        if (tr0Var2.E == vr0Var2.f39723r) {
                            if (vr0Var2.f39724s == 0 && b11 == 0) {
                                tr0Var2.f38389w.d.setText(org.telegram.messenger.id.M0(2131748167, "NoResult"));
                                tr0VarArr[i19].f38389w.f32369f.setVisibility(8);
                                tr0VarArr[i19].f38389w.e(false, true);
                            } else if (b10 == 0) {
                                ys0Var3.D(tr0Var2.h, 0, null);
                            }
                        }
                    }
                    vr0Var2.f();
                    return;
                }
                return;
            case 20:
                org.telegram.messenger.qs f11 = org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24474s0);
                Boolean bool = Boolean.FALSE;
                f11.m(215, bool, (TLObject) this.f37568b, (TLRPC.Document) this.f37569c, null, bool);
                return;
            case 21:
                org.telegram.messenger.qp.s1(((kw0) this.f37568b).f35454a.f36701a).h5((TLRPC.EmojiStatus) this.f37569c, null);
                return;
            case 22:
                s01 s01Var = (s01) this.f37568b;
                String str2 = (String) this.f37569c;
                s01Var.O = null;
                org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(s01Var.f37791a).f24881q7;
                long j12 = -s01Var.f37793b;
                ex exVar = new ex(6, s01Var, str2);
                k00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = k00Var.getMessagesController().j1(-j12);
                tL_messages_getForumTopics.f27180q = str2;
                tL_messages_getForumTopics.limit = 50;
                s01Var.N = k00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.oj(k00Var, j12, exVar, 10));
                return;
            case 23:
                m11 m11Var = (m11) this.f37568b;
                org.telegram.messenger.qp.s1(m11Var.f35801e).f24881q7.d((ArrayList) this.f37569c, -m11Var.f35803f);
                int i20 = m11.f35793l0;
                return;
            case 24:
                m11 m11Var2 = (m11) this.f37568b;
                m11Var2.getClass();
                org.telegram.messenger.qp.s1(m11Var2.f35801e).V2(0, ((TLRPC.Updates) this.f37569c).chats.get(0).f26960id, true);
                return;
            case 25:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f37568b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f37569c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i10 = 1;
                    }
                    l1Var.d0(i10);
                    return;
                }
                return;
            case 26:
                k21 k21Var = (k21) this.f37568b;
                TLObject tLObject5 = (TLObject) this.f37569c;
                org.telegram.messenger.au auVar = k21Var.f35151s1;
                k21Var.l1 = null;
                if (tLObject5 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject5;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        k21Var.O1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (auVar != null) {
                            auVar.set(richMessage);
                            k21Var.H1.D(auVar);
                            return;
                        }
                        return;
                    }
                }
                if (k21Var.O1) {
                    k21Var.dismiss();
                    org.telegram.messenger.qs.e().k(292, 1, org.telegram.messenger.id.M0(2131743946, null));
                    return;
                }
                org.telegram.messenger.k5.p(null, 2131743946, new gc((FrameLayout) k21Var.f28672b, k21Var.I0), null);
                g21 g21Var = k21Var.f35155w1.f34520e;
                String str3 = k21Var.f35154v1;
                k21Var.f35153u1 = str3;
                g21Var.setText(k21.O0(str3, null, null));
                return;
            case 27:
                org.telegram.ui.dk dkVar = (org.telegram.ui.dk) this.f37568b;
                ((org.telegram.ui.ActionBar.g1) this.f37569c).d(true);
                a31.a(dkVar.getContext(), dkVar.d);
                return;
            case 28:
                ((org.telegram.messenger.f10) this.f37569c).J(((org.telegram.ui.dk) this.f37568b).f31682b, false, false);
                return;
            default:
                UndoView undoView = (UndoView) this.f37568b;
                TLObject tLObject6 = (TLObject) this.f37569c;
                if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    undoView.f31625s.presentFragment(new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject6));
                    return;
                }
                int i21 = UndoView.f31609i0;
                undoView.getClass();
                return;
        }
    }

    public r80(Object obj, Object obj2, Object obj3, int i7) {
        this.f37567a = i7;
        this.f37568b = obj;
        this.f37569c = obj2;
    }
}
