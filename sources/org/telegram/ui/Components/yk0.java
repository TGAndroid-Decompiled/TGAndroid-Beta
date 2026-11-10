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
public final class yk0 implements bj0 {
    public final int f40592a;
    public final int f40593b;
    public final FrameLayout f40594c;

    public yk0(FrameLayout frameLayout, int i7, int i10) {
        this.f40592a = i10;
        this.f40594c = frameLayout;
        this.f40593b = i7;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z9;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.im0 im0Var;
        org.telegram.ui.em0 em0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Long valueOf;
        int L;
        ch.o0 o0Var;
        TLRPC.Document document;
        switch (this.f40592a) {
            case 0:
                dl0 dl0Var = (dl0) this.f40594c;
                org.telegram.ui.ActionBar.f2 f2Var = dl0Var.G;
                bi.k5 k5Var = dl0Var.f33024c;
                org.telegram.messenger.ij E = k5Var.E(i7);
                if (E != null) {
                    boolean z10 = false;
                    if (dl0Var.I.i()) {
                        dl0Var.I.h(E, view, 0);
                        org.telegram.ui.uz uzVar = dl0Var.J;
                        int e12 = E.e1();
                        uzVar.f50595a = org.telegram.messenger.ij.B0(E.f23266k);
                        uzVar.f50596b = e12;
                        k5Var.g(i7);
                        if (!dl0Var.I.i()) {
                            k5Var.k(0, ((dl0) k5Var.d).f33028r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof al0) {
                        org.telegram.ui.Cells.h7 h7Var = ((al0) view).f31878a;
                        org.telegram.messenger.ij message = h7Var.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (h7Var.G) {
                            if (!message.h4() && !org.telegram.messenger.ij.R4(message.f23266k)) {
                                boolean x10 = message.x();
                                if (!x10) {
                                    TLRPC.Message message2 = message.f23266k;
                                    if (message2 != null && message2.noforwards) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (E.f23266k.peer_id.channel_id != 0) {
                                        j3 = 0;
                                        chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).M0(Long.valueOf(E.f23266k.peer_id.channel_id));
                                    } else {
                                        j3 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.f23266k.peer_id.chat_id != j3) {
                                            chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).M0(Long.valueOf(E.f23266k.peer_id.chat_id));
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
                                org.telegram.messenger.g0.s2(message, dl0Var.F, f2Var);
                            } else {
                                MediaController.B().S(message);
                                return;
                            }
                        } else if (!h7Var.F) {
                            E.P = true;
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24474s0).f21770a).W(F0, E, 0, 0);
                            h7Var.f(true);
                            org.telegram.messenger.z5.q(this.f40593b).y();
                        } else {
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24474s0).f21770a).f(F0);
                            h7Var.f(true);
                        }
                        dl0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.em0 em0Var2 = (org.telegram.ui.em0) this.f40594c;
                org.telegram.ui.km0 km0Var = em0Var2.f45401p0;
                ArrayList arrayList2 = em0Var2.f45397l0;
                if (view instanceof org.telegram.ui.dm0) {
                    org.telegram.ui.dm0 dm0Var = (org.telegram.ui.dm0) view;
                    int i14 = em0Var2.m0;
                    if (em0Var2.f45400o0 == null) {
                        f5 f5Var = dm0Var.f45012c;
                        org.telegram.ui.k11[] k11VarArr = new org.telegram.ui.k11[1];
                        Point point = org.telegram.messenger.g0.f22567q;
                        int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (f5Var != null) {
                            f5Var.f();
                            dm0Var.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(f5Var.getBounds());
                            if (i14 == 1) {
                                L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                            } else {
                                L = (-(dm0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            }
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        Context context = em0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i11);
                        int i15 = 5;
                        if (i14 == 1) {
                            i12 = 5;
                        } else {
                            i12 = 7;
                        }
                        org.telegram.ui.ActionBar.h6 resourceProvider = km0Var.getResourceProvider();
                        if (i14 == 1) {
                            i13 = 24;
                        } else {
                            i13 = 16;
                        }
                        org.telegram.ui.am0 am0Var = new org.telegram.ui.am0(em0Var2, km0Var, context, valueOf2, i12, resourceProvider, i13, dm0Var.a(), dm0Var, k11VarArr);
                        am0Var.f50035g1 = true;
                        long j10 = em0Var2.f45398n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        am0Var.setSelected(valueOf);
                        am0Var.setSaveState(3);
                        am0Var.y(f5Var, dm0Var);
                        org.telegram.ui.bm0 bm0Var = new org.telegram.ui.bm0(em0Var2, am0Var);
                        em0Var2.f45400o0 = bm0Var;
                        k11VarArr[0] = bm0Var;
                        if (org.telegram.messenger.id.f23161a0) {
                            i15 = 3;
                        }
                        bm0Var.showAsDropDown(dm0Var, 0, i10, i15 | 48);
                        k11VarArr[0].b();
                    }
                    return;
                }
                int i16 = em0Var2.V;
                int i17 = this.f40593b;
                if (i7 == i16) {
                    em0Var2.h = -1;
                    em0Var2.f45398n = 0L;
                    em0Var2.f45402r = null;
                    em0Var2.f45403s = null;
                    em0Var2.I = null;
                    em0Var2.i();
                    if (i17 == 0) {
                        km0Var.h.i();
                    }
                    org.telegram.ui.dm0 dm0Var2 = em0Var2.D;
                    if (dm0Var2 != null) {
                        dm0Var2.b(true);
                    }
                    em0Var2.j(true);
                    em0Var2.f(true);
                    org.telegram.ui.em0 em0Var3 = km0Var.f47376n;
                    if (em0Var3 != null && (im0Var = em0Var3.f45381a) != null && (em0Var = km0Var.h) != null) {
                        im0Var.a(em0Var.h);
                        return;
                    }
                    return;
                }
                int i18 = em0Var2.f45384b0;
                if (i7 >= i18 && i7 < em0Var2.f45386c0) {
                    int i19 = i7 - i18;
                    if (em0Var2.K == null) {
                        if (i19 >= 0 && i19 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                            if (i17 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    em0Var2.f45398n = 0L;
                                    em0Var2.h = -1;
                                    em0Var2.I = null;
                                    em0Var2.f45402r = null;
                                    em0Var2.f45403s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                em0Var2.f45398n = 0L;
                                em0Var2.h = -1;
                                em0Var2.I = null;
                                em0Var2.f45402r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
                                em0Var2.f45403s = null;
                            }
                            em0Var2.j(true);
                            em0Var2.i();
                            em0Var2.f(true);
                            org.telegram.ui.dm0 dm0Var3 = em0Var2.D;
                            if (dm0Var3 != null) {
                                dm0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (em0Var2.J != null && i19 >= 0 && i19 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                        if (i17 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                em0Var2.f45398n = 0L;
                                em0Var2.h = -1;
                                em0Var2.f45402r = null;
                                em0Var2.f45403s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            em0Var2.f45398n = 0L;
                            em0Var2.h = -1;
                            em0Var2.f45402r = org.telegram.messenger.qp.q0(tL_starGiftUnique2);
                            em0Var2.f45403s = null;
                        }
                        em0Var2.I = tL_starGiftUnique2;
                        em0Var2.j(true);
                        em0Var2.i();
                        em0Var2.f(true);
                        org.telegram.ui.dm0 dm0Var4 = em0Var2.D;
                        if (dm0Var4 != null) {
                            dm0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.t11 t11Var = (org.telegram.ui.t11) this.f40594c;
                boolean z11 = view instanceof org.telegram.ui.d11;
                int i20 = this.f40593b;
                try {
                    if (z11) {
                        org.telegram.ui.d11 d11Var = (org.telegram.ui.d11) view;
                        if (!d11Var.f44878s && (((o0Var = d11Var.f44881y) == null || !o0Var.f6355a) && i20 != 13 && i20 != 14)) {
                            if (d11Var.Q && (document = d11Var.d) != null) {
                                if (t11Var.W == 6) {
                                    t11Var.p(d11Var, Long.valueOf(document.f26966id), document, d11Var.f44879w, null);
                                } else {
                                    t11Var.p(d11Var, null, document, d11Var.f44879w, null);
                                }
                            } else {
                                t11Var.o(d11Var, d11Var.f44874e);
                            }
                        } else {
                            t11Var.l();
                            t11Var.r(d11Var, d11Var.f44881y);
                        }
                        if (i20 != 1 && i20 != 11) {
                            t11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        t11Var.o(view, null);
                        if (i20 != 1 && i20 != 11) {
                            t11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.y01) {
                        t11Var.i(i7, (org.telegram.ui.y01) view);
                        if (i20 != 1 && i20 != 11) {
                            t11Var.performHapticFeedback(3, 1);
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
