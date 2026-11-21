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
public final class nl0 implements qj0 {
    public final int f37893a;
    public final int f37894b;
    public final FrameLayout f37895c;

    public nl0(FrameLayout frameLayout, int i7, int i10) {
        this.f37893a = i10;
        this.f37895c = frameLayout;
        this.f37894b = i7;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z10;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.jm0 jm0Var;
        org.telegram.ui.fm0 fm0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Long valueOf;
        int L;
        ch.p0 p0Var;
        TLRPC.Document document;
        switch (this.f37893a) {
            case 0:
                sl0 sl0Var = (sl0) this.f37895c;
                org.telegram.ui.ActionBar.g2 g2Var = sl0Var.H;
                di.l4 l4Var = sl0Var.f39625c;
                org.telegram.messenger.fj E = l4Var.E(i7);
                if (E != null) {
                    boolean z11 = false;
                    if (sl0Var.J.V1()) {
                        sl0Var.J.Z0(E, view, 0);
                        org.telegram.ui.vz vzVar = sl0Var.K;
                        int e12 = E.e1();
                        vzVar.f52917a = org.telegram.messenger.fj.B0(E.f23993k);
                        vzVar.f52918b = e12;
                        l4Var.g(i7);
                        if (!sl0Var.J.V1()) {
                            l4Var.k(0, ((sl0) l4Var.d).f39629r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof pl0) {
                        org.telegram.ui.Cells.i7 i7Var = ((pl0) view).f38615a;
                        org.telegram.messenger.fj message = i7Var.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (i7Var.H) {
                            if (!message.h4() && !org.telegram.messenger.fj.R4(message.f23993k)) {
                                boolean x10 = message.x();
                                if (!x10) {
                                    TLRPC.Message message2 = message.f23993k;
                                    if (message2 != null && message2.noforwards) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (E.f23993k.peer_id.channel_id != 0) {
                                        j3 = 0;
                                        chat = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).O0(Long.valueOf(E.f23993k.peer_id.channel_id));
                                    } else {
                                        j3 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.f23993k.peer_id.chat_id != j3) {
                                            chat = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).O0(Long.valueOf(E.f23993k.peer_id.chat_id));
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
                                    PhotoViewer.p1().I2(null, g2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.p1().I2(null, g2Var, null);
                                    PhotoViewer.p1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                org.telegram.messenger.g0.s2(message, sl0Var.G, g2Var);
                            } else {
                                MediaController.B().S(message);
                                return;
                            }
                        } else if (!i7Var.G) {
                            E.P = true;
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.f24798t0).f23246a).W(F0, E, 0, 0);
                            i7Var.f(true);
                            org.telegram.messenger.a6.q(this.f37894b).y();
                        } else {
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.f24798t0).f23246a).f(F0);
                            i7Var.f(true);
                        }
                        sl0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.fm0 fm0Var2 = (org.telegram.ui.fm0) this.f37895c;
                org.telegram.ui.lm0 lm0Var = fm0Var2.f47782q0;
                ArrayList arrayList2 = fm0Var2.m0;
                if (view instanceof org.telegram.ui.em0) {
                    org.telegram.ui.em0 em0Var = (org.telegram.ui.em0) view;
                    int i14 = fm0Var2.f47779n0;
                    if (fm0Var2.f47781p0 == null) {
                        n5 n5Var = em0Var.f47327c;
                        org.telegram.ui.j11[] j11VarArr = new org.telegram.ui.j11[1];
                        Point point = org.telegram.messenger.g0.f24146q;
                        int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (n5Var != null) {
                            n5Var.f();
                            em0Var.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(n5Var.getBounds());
                            if (i14 == 1) {
                                L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                            } else {
                                L = (-(em0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            }
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        Context context = fm0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i11);
                        int i15 = 5;
                        if (i14 == 1) {
                            i12 = 5;
                        } else {
                            i12 = 7;
                        }
                        org.telegram.ui.ActionBar.h6 resourceProvider = lm0Var.getResourceProvider();
                        if (i14 == 1) {
                            i13 = 24;
                        } else {
                            i13 = 16;
                        }
                        org.telegram.ui.bm0 bm0Var = new org.telegram.ui.bm0(fm0Var2, lm0Var, context, valueOf2, i12, resourceProvider, i13, em0Var.a(), em0Var, j11VarArr);
                        bm0Var.f51839h1 = true;
                        long j10 = fm0Var2.f47778n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        bm0Var.setSelected(valueOf);
                        bm0Var.setSaveState(3);
                        bm0Var.y(n5Var, em0Var);
                        org.telegram.ui.cm0 cm0Var = new org.telegram.ui.cm0(fm0Var2, bm0Var);
                        fm0Var2.f47781p0 = cm0Var;
                        j11VarArr[0] = cm0Var;
                        if (org.telegram.messenger.gd.f24241a0) {
                            i15 = 3;
                        }
                        cm0Var.showAsDropDown(em0Var, 0, i10, i15 | 48);
                        j11VarArr[0].b();
                    }
                    return;
                }
                int i16 = fm0Var2.W;
                int i17 = this.f37894b;
                if (i7 == i16) {
                    fm0Var2.h = -1;
                    fm0Var2.f47778n = 0L;
                    fm0Var2.f47783r = null;
                    fm0Var2.f47784s = null;
                    fm0Var2.J = null;
                    fm0Var2.i();
                    if (i17 == 0) {
                        lm0Var.h.i();
                    }
                    org.telegram.ui.em0 em0Var2 = fm0Var2.E;
                    if (em0Var2 != null) {
                        em0Var2.b(true);
                    }
                    fm0Var2.j(true);
                    fm0Var2.f(true);
                    org.telegram.ui.fm0 fm0Var3 = lm0Var.f49652n;
                    if (fm0Var3 != null && (jm0Var = fm0Var3.f47761a) != null && (fm0Var = lm0Var.h) != null) {
                        jm0Var.a(fm0Var.h);
                        return;
                    }
                    return;
                }
                int i18 = fm0Var2.f47766c0;
                if (i7 >= i18 && i7 < fm0Var2.f47767d0) {
                    int i19 = i7 - i18;
                    if (fm0Var2.L == null) {
                        if (i19 >= 0 && i19 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                            if (i17 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    fm0Var2.f47778n = 0L;
                                    fm0Var2.h = -1;
                                    fm0Var2.J = null;
                                    fm0Var2.f47783r = null;
                                    fm0Var2.f47784s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                fm0Var2.f47778n = 0L;
                                fm0Var2.h = -1;
                                fm0Var2.J = null;
                                fm0Var2.f47783r = org.telegram.messenger.mp.r0(tL_starGiftUnique);
                                fm0Var2.f47784s = null;
                            }
                            fm0Var2.j(true);
                            fm0Var2.i();
                            fm0Var2.f(true);
                            org.telegram.ui.em0 em0Var3 = fm0Var2.E;
                            if (em0Var3 != null) {
                                em0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (fm0Var2.K != null && i19 >= 0 && i19 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                        if (i17 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                fm0Var2.f47778n = 0L;
                                fm0Var2.h = -1;
                                fm0Var2.f47783r = null;
                                fm0Var2.f47784s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            fm0Var2.f47778n = 0L;
                            fm0Var2.h = -1;
                            fm0Var2.f47783r = org.telegram.messenger.mp.r0(tL_starGiftUnique2);
                            fm0Var2.f47784s = null;
                        }
                        fm0Var2.J = tL_starGiftUnique2;
                        fm0Var2.j(true);
                        fm0Var2.i();
                        fm0Var2.f(true);
                        org.telegram.ui.em0 em0Var4 = fm0Var2.E;
                        if (em0Var4 != null) {
                            em0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.s11 s11Var = (org.telegram.ui.s11) this.f37895c;
                boolean z12 = view instanceof org.telegram.ui.c11;
                int i20 = this.f37894b;
                try {
                    if (z12) {
                        org.telegram.ui.c11 c11Var = (org.telegram.ui.c11) view;
                        if (!c11Var.f46385s && (((p0Var = c11Var.f46388y) == null || !p0Var.f5500a) && i20 != 13 && i20 != 14)) {
                            if (c11Var.R && (document = c11Var.d) != null) {
                                if (s11Var.f51819a0 == 6) {
                                    s11Var.p(c11Var, Long.valueOf(document.f28437id), document, c11Var.f46386w, null);
                                } else {
                                    s11Var.p(c11Var, null, document, c11Var.f46386w, null);
                                }
                            } else {
                                s11Var.o(c11Var, c11Var.f46381e);
                            }
                        } else {
                            s11Var.l();
                            s11Var.r(c11Var, c11Var.f46388y);
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
