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
public final class zk0 implements cj0 {
    public final int f40996a;
    public final int f40997b;
    public final FrameLayout f40998c;

    public zk0(FrameLayout frameLayout, int i7, int i10) {
        this.f40996a = i10;
        this.f40998c = frameLayout;
        this.f40997b = i7;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z9;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.hm0 hm0Var;
        org.telegram.ui.dm0 dm0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Long valueOf;
        int L;
        ch.o0 o0Var;
        TLRPC.Document document;
        switch (this.f40996a) {
            case 0:
                el0 el0Var = (el0) this.f40998c;
                org.telegram.ui.ActionBar.f2 f2Var = el0Var.G;
                bi.k5 k5Var = el0Var.f33439c;
                org.telegram.messenger.ij E = k5Var.E(i7);
                if (E != null) {
                    boolean z10 = false;
                    if (el0Var.I.i()) {
                        el0Var.I.h(E, view, 0);
                        org.telegram.ui.tz tzVar = el0Var.J;
                        int e12 = E.e1();
                        tzVar.f50267a = org.telegram.messenger.ij.B0(E.f23262k);
                        tzVar.f50268b = e12;
                        k5Var.g(i7);
                        if (!el0Var.I.i()) {
                            k5Var.k(0, ((el0) k5Var.d).f33443r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof bl0) {
                        org.telegram.ui.Cells.h7 h7Var = ((bl0) view).f32275a;
                        org.telegram.messenger.ij message = h7Var.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (h7Var.G) {
                            if (!message.h4() && !org.telegram.messenger.ij.R4(message.f23262k)) {
                                boolean x10 = message.x();
                                if (!x10) {
                                    TLRPC.Message message2 = message.f23262k;
                                    if (message2 != null && message2.noforwards) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (E.f23262k.peer_id.channel_id != 0) {
                                        j3 = 0;
                                        chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).M0(Long.valueOf(E.f23262k.peer_id.channel_id));
                                    } else {
                                        j3 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.f23262k.peer_id.chat_id != j3) {
                                            chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).M0(Long.valueOf(E.f23262k.peer_id.chat_id));
                                        } else {
                                            chat = null;
                                        }
                                    }
                                    if (chat != null) {
                                        z9 = chat.noforwards;
                                    }
                                    if (x10 || z9) {
                                        z10 = true;
                                    }
                                    x10 = z10;
                                }
                                if (x10) {
                                    PhotoViewer.p1().H2(null, f2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.p1().H2(null, f2Var, null);
                                    PhotoViewer.p1().Z1(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                org.telegram.messenger.g0.s2(message, el0Var.F, f2Var);
                            } else {
                                MediaController.B().S(message);
                                return;
                            }
                        } else if (!h7Var.F) {
                            E.P = true;
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24470s0).f21765a).W(F0, E, 0, 0);
                            h7Var.f(true);
                            org.telegram.messenger.z5.q(this.f40997b).y();
                        } else {
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24470s0).f21765a).f(F0);
                            h7Var.f(true);
                        }
                        el0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.dm0 dm0Var2 = (org.telegram.ui.dm0) this.f40998c;
                org.telegram.ui.jm0 jm0Var = dm0Var2.f45078p0;
                ArrayList arrayList2 = dm0Var2.f45074l0;
                if (view instanceof org.telegram.ui.cm0) {
                    org.telegram.ui.cm0 cm0Var = (org.telegram.ui.cm0) view;
                    int i14 = dm0Var2.m0;
                    if (dm0Var2.f45077o0 == null) {
                        g5 g5Var = cm0Var.f44366c;
                        org.telegram.ui.j11[] j11VarArr = new org.telegram.ui.j11[1];
                        Point point = org.telegram.messenger.g0.f22563q;
                        int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (g5Var != null) {
                            g5Var.f();
                            cm0Var.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(g5Var.getBounds());
                            if (i14 == 1) {
                                L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                            } else {
                                L = (-(cm0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            }
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        Context context = dm0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i11);
                        int i15 = 5;
                        if (i14 == 1) {
                            i12 = 5;
                        } else {
                            i12 = 7;
                        }
                        org.telegram.ui.ActionBar.g6 resourceProvider = jm0Var.getResourceProvider();
                        if (i14 == 1) {
                            i13 = 24;
                        } else {
                            i13 = 16;
                        }
                        org.telegram.ui.zl0 zl0Var = new org.telegram.ui.zl0(dm0Var2, jm0Var, context, valueOf2, i12, resourceProvider, i13, cm0Var.a(), cm0Var, j11VarArr);
                        zl0Var.f49679g1 = true;
                        long j10 = dm0Var2.f45075n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        zl0Var.setSelected(valueOf);
                        zl0Var.setSaveState(3);
                        zl0Var.y(g5Var, cm0Var);
                        org.telegram.ui.am0 am0Var = new org.telegram.ui.am0(dm0Var2, zl0Var);
                        dm0Var2.f45077o0 = am0Var;
                        j11VarArr[0] = am0Var;
                        if (org.telegram.messenger.id.f23157a0) {
                            i15 = 3;
                        }
                        am0Var.showAsDropDown(cm0Var, 0, i10, i15 | 48);
                        j11VarArr[0].b();
                    }
                    return;
                }
                int i16 = dm0Var2.V;
                int i17 = this.f40997b;
                if (i7 == i16) {
                    dm0Var2.h = -1;
                    dm0Var2.f45075n = 0L;
                    dm0Var2.f45079r = null;
                    dm0Var2.f45080s = null;
                    dm0Var2.I = null;
                    dm0Var2.i();
                    if (i17 == 0) {
                        jm0Var.h.i();
                    }
                    org.telegram.ui.cm0 cm0Var2 = dm0Var2.D;
                    if (cm0Var2 != null) {
                        cm0Var2.b(true);
                    }
                    dm0Var2.j(true);
                    dm0Var2.f(true);
                    org.telegram.ui.dm0 dm0Var3 = jm0Var.f47045n;
                    if (dm0Var3 != null && (hm0Var = dm0Var3.f45058a) != null && (dm0Var = jm0Var.h) != null) {
                        hm0Var.a(dm0Var.h);
                        return;
                    }
                    return;
                }
                int i18 = dm0Var2.f45061b0;
                if (i7 >= i18 && i7 < dm0Var2.f45063c0) {
                    int i19 = i7 - i18;
                    if (dm0Var2.K == null) {
                        if (i19 >= 0 && i19 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                            if (i17 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    dm0Var2.f45075n = 0L;
                                    dm0Var2.h = -1;
                                    dm0Var2.I = null;
                                    dm0Var2.f45079r = null;
                                    dm0Var2.f45080s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                dm0Var2.f45075n = 0L;
                                dm0Var2.h = -1;
                                dm0Var2.I = null;
                                dm0Var2.f45079r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
                                dm0Var2.f45080s = null;
                            }
                            dm0Var2.j(true);
                            dm0Var2.i();
                            dm0Var2.f(true);
                            org.telegram.ui.cm0 cm0Var3 = dm0Var2.D;
                            if (cm0Var3 != null) {
                                cm0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (dm0Var2.J != null && i19 >= 0 && i19 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                        if (i17 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                dm0Var2.f45075n = 0L;
                                dm0Var2.h = -1;
                                dm0Var2.f45079r = null;
                                dm0Var2.f45080s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            dm0Var2.f45075n = 0L;
                            dm0Var2.h = -1;
                            dm0Var2.f45079r = org.telegram.messenger.qp.q0(tL_starGiftUnique2);
                            dm0Var2.f45080s = null;
                        }
                        dm0Var2.I = tL_starGiftUnique2;
                        dm0Var2.j(true);
                        dm0Var2.i();
                        dm0Var2.f(true);
                        org.telegram.ui.cm0 cm0Var4 = dm0Var2.D;
                        if (cm0Var4 != null) {
                            cm0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.s11 s11Var = (org.telegram.ui.s11) this.f40998c;
                boolean z11 = view instanceof org.telegram.ui.c11;
                int i20 = this.f40997b;
                try {
                    if (z11) {
                        org.telegram.ui.c11 c11Var = (org.telegram.ui.c11) view;
                        if (!c11Var.f44195s && (((o0Var = c11Var.f44198y) == null || !o0Var.f6350a) && i20 != 13 && i20 != 14)) {
                            if (c11Var.Q && (document = c11Var.d) != null) {
                                if (s11Var.W == 6) {
                                    s11Var.p(c11Var, Long.valueOf(document.f26962id), document, c11Var.f44196w, null);
                                } else {
                                    s11Var.p(c11Var, null, document, c11Var.f44196w, null);
                                }
                            } else {
                                s11Var.o(c11Var, c11Var.f44191e);
                            }
                        } else {
                            s11Var.l();
                            s11Var.r(c11Var, c11Var.f44198y);
                        }
                        if (i20 != 1 && i20 != 11) {
                            s11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        s11Var.o(view, null);
                        if (i20 != 1 && i20 != 11) {
                            s11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.x01) {
                        s11Var.i(i7, (org.telegram.ui.x01) view);
                        if (i20 != 1 && i20 != 11) {
                            s11Var.performHapticFeedback(3, 1);
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
