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
public final class ll0 implements oj0 {
    public final int f37145a;
    public final int f37146b;
    public final FrameLayout f37147c;

    public ll0(FrameLayout frameLayout, int i7, int i10) {
        this.f37145a = i10;
        this.f37147c = frameLayout;
        this.f37146b = i7;
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
        switch (this.f37145a) {
            case 0:
                ql0 ql0Var = (ql0) this.f37147c;
                org.telegram.ui.ActionBar.h2 h2Var = ql0Var.H;
                di.l4 l4Var = ql0Var.f38829c;
                org.telegram.messenger.fj E = l4Var.E(i7);
                if (E != null) {
                    boolean z11 = false;
                    if (ql0Var.J.V1()) {
                        ql0Var.J.Z0(E, view, 0);
                        org.telegram.ui.vz vzVar = ql0Var.K;
                        int e12 = E.e1();
                        vzVar.f52876a = org.telegram.messenger.fj.B0(E.f23965k);
                        vzVar.f52877b = e12;
                        l4Var.g(i7);
                        if (!ql0Var.J.V1()) {
                            l4Var.k(0, ((ql0) l4Var.d).f38833r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof nl0) {
                        org.telegram.ui.Cells.i7 i7Var = ((nl0) view).f37805a;
                        org.telegram.messenger.fj message = i7Var.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (i7Var.H) {
                            if (!message.h4() && !org.telegram.messenger.fj.R4(message.f23965k)) {
                                boolean x10 = message.x();
                                if (!x10) {
                                    TLRPC.Message message2 = message.f23965k;
                                    if (message2 != null && message2.noforwards) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (E.f23965k.peer_id.channel_id != 0) {
                                        j3 = 0;
                                        chat = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).O0(Long.valueOf(E.f23965k.peer_id.channel_id));
                                    } else {
                                        j3 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.f23965k.peer_id.chat_id != j3) {
                                            chat = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).O0(Long.valueOf(E.f23965k.peer_id.chat_id));
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
                                    PhotoViewer.p1().I2(null, h2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.p1().I2(null, h2Var, null);
                                    PhotoViewer.p1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                org.telegram.messenger.g0.s2(message, ql0Var.G, h2Var);
                            } else {
                                MediaController.B().S(message);
                                return;
                            }
                        } else if (!i7Var.G) {
                            E.P = true;
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.f24770t0).f23218a).W(F0, E, 0, 0);
                            i7Var.f(true);
                            org.telegram.messenger.a6.q(this.f37146b).y();
                        } else {
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.f24770t0).f23218a).f(F0);
                            i7Var.f(true);
                        }
                        ql0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.fm0 fm0Var2 = (org.telegram.ui.fm0) this.f37147c;
                org.telegram.ui.lm0 lm0Var = fm0Var2.f47715q0;
                ArrayList arrayList2 = fm0Var2.m0;
                if (view instanceof org.telegram.ui.em0) {
                    org.telegram.ui.em0 em0Var = (org.telegram.ui.em0) view;
                    int i14 = fm0Var2.f47712n0;
                    if (fm0Var2.f47714p0 == null) {
                        m5 m5Var = em0Var.f47258c;
                        org.telegram.ui.i11[] i11VarArr = new org.telegram.ui.i11[1];
                        Point point = org.telegram.messenger.g0.f24118q;
                        int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (m5Var != null) {
                            m5Var.f();
                            em0Var.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(m5Var.getBounds());
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
                        org.telegram.ui.ActionBar.i6 resourceProvider = lm0Var.getResourceProvider();
                        if (i14 == 1) {
                            i13 = 24;
                        } else {
                            i13 = 16;
                        }
                        org.telegram.ui.bm0 bm0Var = new org.telegram.ui.bm0(fm0Var2, lm0Var, context, valueOf2, i12, resourceProvider, i13, em0Var.a(), em0Var, i11VarArr);
                        bm0Var.f51397h1 = true;
                        long j10 = fm0Var2.f47711n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        bm0Var.setSelected(valueOf);
                        bm0Var.setSaveState(3);
                        bm0Var.y(m5Var, em0Var);
                        org.telegram.ui.cm0 cm0Var = new org.telegram.ui.cm0(fm0Var2, bm0Var);
                        fm0Var2.f47714p0 = cm0Var;
                        i11VarArr[0] = cm0Var;
                        if (org.telegram.messenger.gd.f24213a0) {
                            i15 = 3;
                        }
                        cm0Var.showAsDropDown(em0Var, 0, i10, i15 | 48);
                        i11VarArr[0].b();
                    }
                    return;
                }
                int i16 = fm0Var2.W;
                int i17 = this.f37146b;
                if (i7 == i16) {
                    fm0Var2.h = -1;
                    fm0Var2.f47711n = 0L;
                    fm0Var2.f47716r = null;
                    fm0Var2.f47717s = null;
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
                    org.telegram.ui.fm0 fm0Var3 = lm0Var.f49601n;
                    if (fm0Var3 != null && (jm0Var = fm0Var3.f47694a) != null && (fm0Var = lm0Var.h) != null) {
                        jm0Var.a(fm0Var.h);
                        return;
                    }
                    return;
                }
                int i18 = fm0Var2.f47699c0;
                if (i7 >= i18 && i7 < fm0Var2.f47700d0) {
                    int i19 = i7 - i18;
                    if (fm0Var2.L == null) {
                        if (i19 >= 0 && i19 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                            if (i17 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    fm0Var2.f47711n = 0L;
                                    fm0Var2.h = -1;
                                    fm0Var2.J = null;
                                    fm0Var2.f47716r = null;
                                    fm0Var2.f47717s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                fm0Var2.f47711n = 0L;
                                fm0Var2.h = -1;
                                fm0Var2.J = null;
                                fm0Var2.f47716r = org.telegram.messenger.mp.r0(tL_starGiftUnique);
                                fm0Var2.f47717s = null;
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
                                fm0Var2.f47711n = 0L;
                                fm0Var2.h = -1;
                                fm0Var2.f47716r = null;
                                fm0Var2.f47717s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            fm0Var2.f47711n = 0L;
                            fm0Var2.h = -1;
                            fm0Var2.f47716r = org.telegram.messenger.mp.r0(tL_starGiftUnique2);
                            fm0Var2.f47717s = null;
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
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) this.f37147c;
                boolean z12 = view instanceof org.telegram.ui.b11;
                int i20 = this.f37146b;
                try {
                    if (z12) {
                        org.telegram.ui.b11 b11Var = (org.telegram.ui.b11) view;
                        if (!b11Var.f45718s && (((p0Var = b11Var.f45721y) == null || !p0Var.f5471a) && i20 != 13 && i20 != 14)) {
                            if (b11Var.R && (document = b11Var.d) != null) {
                                if (r11Var.f51377a0 == 6) {
                                    r11Var.p(b11Var, Long.valueOf(document.f28409id), document, b11Var.f45719w, null);
                                } else {
                                    r11Var.p(b11Var, null, document, b11Var.f45719w, null);
                                }
                            } else {
                                r11Var.o(b11Var, b11Var.f45714e);
                            }
                        } else {
                            r11Var.l();
                            r11Var.r(b11Var, b11Var.f45721y);
                        }
                        if (i20 != 1 && i20 != 11) {
                            r11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        r11Var.o(view, null);
                        if (i20 != 1 && i20 != 11) {
                            r11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.w01) {
                        r11Var.i(i7, (org.telegram.ui.w01) view);
                        if (i20 != 1 && i20 != 11) {
                            r11Var.performHapticFeedback(3, 1);
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
