package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;
public final class cm0 implements hk0 {
    public final int f25183a;
    public final int f25184b;
    public final FrameLayout f25185c;

    public cm0(FrameLayout frameLayout, int i10, int i11) {
        this.f25183a = i11;
        this.f25185c = frameLayout;
        this.f25184b = i10;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.pn0 pn0Var;
        org.telegram.ui.ln0 ln0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int L;
        sg.o0 o0Var;
        TLRPC.Document document;
        switch (this.f25183a) {
            case 0:
                hm0 hm0Var = (hm0) this.f25185c;
                org.telegram.ui.ActionBar.k2 k2Var = hm0Var.G;
                kg.f fVar = hm0Var.f26860c;
                org.telegram.messenger.kj E = fVar.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (hm0Var.I.f()) {
                        hm0Var.I.e(E, view, 0);
                        org.telegram.ui.r00 r00Var = hm0Var.J;
                        int f12 = E.f1();
                        r00Var.f40933a = org.telegram.messenger.kj.B0(E.f16690k);
                        r00Var.f40934b = f12;
                        fVar.g(i10);
                        if (!hm0Var.I.f()) {
                            fVar.k(0, ((hm0) fVar.d).f26863r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof em0) {
                        org.telegram.ui.Cells.l7 l7Var = ((em0) view).f25884a;
                        org.telegram.messenger.kj message = l7Var.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (l7Var.G) {
                            if (!message.h4() && !org.telegram.messenger.kj.R4(message.f16690k)) {
                                boolean x10 = message.x();
                                if (!x10) {
                                    TLRPC.Message message2 = message.f16690k;
                                    if (message2 != null && message2.noforwards) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (E.f16690k.peer_id.channel_id != 0) {
                                        j10 = 0;
                                        chat = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).L0(Long.valueOf(E.f16690k.peer_id.channel_id));
                                    } else {
                                        j10 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.f16690k.peer_id.chat_id != j10) {
                                            chat = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).L0(Long.valueOf(E.f16690k.peer_id.chat_id));
                                        } else {
                                            chat = null;
                                        }
                                    }
                                    if (chat != null) {
                                        z10 = chat.noforwards;
                                    }
                                    if (x10 || z10) {
                                        z11 = true;
                                    }
                                    x10 = z11;
                                }
                                if (x10) {
                                    PhotoViewer.v1().N2(null, k2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.v1().N2(null, k2Var, null);
                                    PhotoViewer.v1().e2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                org.telegram.messenger.i0.s2(message, hm0Var.F, k2Var);
                            } else {
                                MediaController.B().S(message);
                                return;
                            }
                        } else if (!l7Var.F) {
                            E.P = true;
                            org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.e20.f15506s0).f15043a).X(F0, E, 0, 0);
                            l7Var.f(true);
                            org.telegram.messenger.b6.q(this.f25184b).y();
                        } else {
                            org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.e20.f15506s0).f15043a).f(F0);
                            l7Var.f(true);
                        }
                        hm0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ln0 ln0Var2 = (org.telegram.ui.ln0) this.f25185c;
                org.telegram.ui.rn0 rn0Var = ln0Var2.f39334p0;
                ArrayList arrayList2 = ln0Var2.f39330l0;
                if (view instanceof org.telegram.ui.kn0) {
                    org.telegram.ui.kn0 kn0Var = (org.telegram.ui.kn0) view;
                    int i15 = ln0Var2.m0;
                    if (ln0Var2.f39333o0 == null) {
                        d5 d5Var = kn0Var.f38945c;
                        org.telegram.ui.x21[] x21VarArr = new org.telegram.ui.x21[1];
                        Point point = org.telegram.messenger.i0.f16172q;
                        int min = (int) Math.min(org.telegram.messenger.i0.L(330.0f), point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.i0.L(324.0f), point.x * 0.95f);
                        if (d5Var != null) {
                            d5Var.f();
                            kn0Var.c();
                            Rect rect = org.telegram.messenger.i0.Q;
                            rect.set(d5Var.getBounds());
                            if (i15 == 1) {
                                L = (org.telegram.messenger.i0.L(12.0f) + (-rect.centerY())) - min;
                            } else {
                                L = (-(kn0Var.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                            }
                            i12 = org.telegram.messenger.i0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i11 = L;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = ln0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.p6 resourceProvider = rn0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.hn0 hn0Var = new org.telegram.ui.hn0(ln0Var2, rn0Var, context, valueOf2, i13, resourceProvider, i14, kn0Var.a(), kn0Var, x21VarArr);
                        hn0Var.f37304g1 = true;
                        long j11 = ln0Var2.f39331n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        hn0Var.setSelected(valueOf);
                        hn0Var.setSaveState(3);
                        hn0Var.y(d5Var, kn0Var);
                        org.telegram.ui.in0 in0Var = new org.telegram.ui.in0(ln0Var2, hn0Var);
                        ln0Var2.f39333o0 = in0Var;
                        x21VarArr[0] = in0Var;
                        if (org.telegram.messenger.dd.X) {
                            i16 = 3;
                        }
                        in0Var.showAsDropDown(kn0Var, 0, i11, i16 | 48);
                        x21VarArr[0].b();
                    }
                    return;
                }
                int i17 = ln0Var2.V;
                int i18 = this.f25184b;
                if (i10 == i17) {
                    ln0Var2.h = -1;
                    ln0Var2.f39331n = 0L;
                    ln0Var2.f39335r = null;
                    ln0Var2.f39336s = null;
                    ln0Var2.I = null;
                    ln0Var2.i();
                    if (i18 == 0) {
                        rn0Var.h.i();
                    }
                    org.telegram.ui.kn0 kn0Var2 = ln0Var2.D;
                    if (kn0Var2 != null) {
                        kn0Var2.b(true);
                    }
                    ln0Var2.j(true);
                    ln0Var2.f(true);
                    org.telegram.ui.ln0 ln0Var3 = rn0Var.f41118n;
                    if (ln0Var3 != null && (pn0Var = ln0Var3.f39315a) != null && (ln0Var = rn0Var.h) != null) {
                        pn0Var.a(ln0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = ln0Var2.f39318b0;
                if (i10 >= i19 && i10 < ln0Var2.f39320c0) {
                    int i20 = i10 - i19;
                    if (ln0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    ln0Var2.f39331n = 0L;
                                    ln0Var2.h = -1;
                                    ln0Var2.I = null;
                                    ln0Var2.f39335r = null;
                                    ln0Var2.f39336s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                ln0Var2.f39331n = 0L;
                                ln0Var2.h = -1;
                                ln0Var2.I = null;
                                ln0Var2.f39335r = org.telegram.messenger.wp.q0(tL_starGiftUnique);
                                ln0Var2.f39336s = null;
                            }
                            ln0Var2.j(true);
                            ln0Var2.i();
                            ln0Var2.f(true);
                            org.telegram.ui.kn0 kn0Var3 = ln0Var2.D;
                            if (kn0Var3 != null) {
                                kn0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ln0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                ln0Var2.f39331n = 0L;
                                ln0Var2.h = -1;
                                ln0Var2.f39335r = null;
                                ln0Var2.f39336s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            ln0Var2.f39331n = 0L;
                            ln0Var2.h = -1;
                            ln0Var2.f39335r = org.telegram.messenger.wp.q0(tL_starGiftUnique2);
                            ln0Var2.f39336s = null;
                        }
                        ln0Var2.I = tL_starGiftUnique2;
                        ln0Var2.j(true);
                        ln0Var2.i();
                        ln0Var2.f(true);
                        org.telegram.ui.kn0 kn0Var4 = ln0Var2.D;
                        if (kn0Var4 != null) {
                            kn0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) this.f25185c;
                boolean z12 = view instanceof org.telegram.ui.q21;
                int i21 = this.f25184b;
                try {
                    if (z12) {
                        org.telegram.ui.q21 q21Var = (org.telegram.ui.q21) view;
                        if (!q21Var.f40668s && (((o0Var = q21Var.f40671y) == null || !o0Var.f48442a) && i21 != 13 && i21 != 14)) {
                            if (q21Var.Q && (document = q21Var.d) != null) {
                                if (g31Var.W == 6) {
                                    g31Var.p(q21Var, Long.valueOf(document.f19800id), document, q21Var.f40669w, null);
                                } else {
                                    g31Var.p(q21Var, null, document, q21Var.f40669w, null);
                                }
                            } else {
                                g31Var.o(q21Var, q21Var.e);
                            }
                        } else {
                            g31Var.l();
                            g31Var.r(q21Var, q21Var.f40671y);
                        }
                        if (i21 != 1 && i21 != 11) {
                            g31Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        g31Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            g31Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.l21) {
                        g31Var.i(i10, (org.telegram.ui.l21) view);
                        if (i21 != 1 && i21 != 11) {
                            g31Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view != null) {
                        view.callOnClick();
                        return;
                    } else {
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
