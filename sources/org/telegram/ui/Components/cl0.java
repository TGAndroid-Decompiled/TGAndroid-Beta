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
public final class cl0 implements fj0 {
    public final int f32766a;
    public final int f32767b;
    public final FrameLayout f32768c;

    public cl0(FrameLayout frameLayout, int i3, int i10) {
        this.f32766a = i10;
        this.f32768c = frameLayout;
        this.f32767b = i3;
    }

    @Override
    public final void f(int i3, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.am0 am0Var;
        org.telegram.ui.wl0 wl0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Long valueOf;
        int L;
        dh.n0 n0Var;
        TLRPC.Document document;
        switch (this.f32766a) {
            case 0:
                hl0 hl0Var = (hl0) this.f32768c;
                org.telegram.ui.ActionBar.d2 d2Var = hl0Var.H;
                ci.r4 r4Var = hl0Var.f34444c;
                org.telegram.messenger.zi E = r4Var.E(i3);
                if (E != null) {
                    boolean z11 = false;
                    if (hl0Var.J.I()) {
                        hl0Var.J.w(E, view, 0);
                        org.telegram.ui.pz pzVar = hl0Var.K;
                        int f12 = E.f1();
                        pzVar.f48707a = org.telegram.messenger.zi.B0(E.f26868k);
                        pzVar.f48708b = f12;
                        r4Var.g(i3);
                        if (!hl0Var.J.I()) {
                            r4Var.k(0, ((hl0) r4Var.d).f34448r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof el0) {
                        org.telegram.ui.Cells.g7 g7Var = ((el0) view).f33416a;
                        org.telegram.messenger.zi message = g7Var.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (g7Var.H) {
                            if (!message.i4() && !org.telegram.messenger.zi.S4(message.f26868k)) {
                                boolean x10 = message.x();
                                if (!x10) {
                                    TLRPC.Message message2 = message.f26868k;
                                    if (message2 != null && message2.noforwards) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (E.f26868k.peer_id.channel_id != 0) {
                                        j10 = 0;
                                        chat = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(E.f26868k.peer_id.channel_id));
                                    } else {
                                        j10 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.f26868k.peer_id.chat_id != j10) {
                                            chat = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(E.f26868k.peer_id.chat_id));
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
                                    PhotoViewer.v1().N2(null, d2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.v1().N2(null, d2Var, null);
                                    PhotoViewer.v1().e2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                org.telegram.messenger.g0.s2(message, hl0Var.G, d2Var);
                            } else {
                                MediaController.B().S(message);
                                return;
                            }
                        } else if (!g7Var.G) {
                            E.P = true;
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.f22829t0).f21919a).X(F0, E, 0, 0);
                            g7Var.f(true);
                            org.telegram.messenger.z5.q(this.f32767b).y();
                        } else {
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.f22829t0).f21919a).f(F0);
                            g7Var.f(true);
                        }
                        hl0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.wl0 wl0Var2 = (org.telegram.ui.wl0) this.f32768c;
                org.telegram.ui.cm0 cm0Var = wl0Var2.f51221q0;
                ArrayList arrayList2 = wl0Var2.m0;
                if (view instanceof org.telegram.ui.vl0) {
                    org.telegram.ui.vl0 vl0Var = (org.telegram.ui.vl0) view;
                    int i14 = wl0Var2.f51218n0;
                    if (wl0Var2.f51220p0 == null) {
                        e5 e5Var = vl0Var.f50552c;
                        org.telegram.ui.x01[] x01VarArr = new org.telegram.ui.x01[1];
                        Point point = org.telegram.messenger.g0.f22608q;
                        int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (e5Var != null) {
                            e5Var.f();
                            vl0Var.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(e5Var.getBounds());
                            if (i14 == 1) {
                                L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                            } else {
                                L = (-(vl0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            }
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        Context context = wl0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i11);
                        int i15 = 5;
                        if (i14 == 1) {
                            i12 = 5;
                        } else {
                            i12 = 7;
                        }
                        org.telegram.ui.ActionBar.e6 resourceProvider = cm0Var.getResourceProvider();
                        if (i14 == 1) {
                            i13 = 24;
                        } else {
                            i13 = 16;
                        }
                        org.telegram.ui.sl0 sl0Var = new org.telegram.ui.sl0(wl0Var2, cm0Var, context, valueOf2, i12, resourceProvider, i13, vl0Var.a(), vl0Var, x01VarArr);
                        sl0Var.f45455h1 = true;
                        long j11 = wl0Var2.f51217n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        sl0Var.setSelected(valueOf);
                        sl0Var.setSaveState(3);
                        sl0Var.y(e5Var, vl0Var);
                        org.telegram.ui.tl0 tl0Var = new org.telegram.ui.tl0(wl0Var2, sl0Var);
                        wl0Var2.f51220p0 = tl0Var;
                        x01VarArr[0] = tl0Var;
                        if (org.telegram.messenger.bd.f21784a0) {
                            i15 = 3;
                        }
                        tl0Var.showAsDropDown(vl0Var, 0, i10, i15 | 48);
                        x01VarArr[0].b();
                    }
                    return;
                }
                int i16 = wl0Var2.W;
                int i17 = this.f32767b;
                if (i3 == i16) {
                    wl0Var2.h = -1;
                    wl0Var2.f51217n = 0L;
                    wl0Var2.f51222r = null;
                    wl0Var2.f51223s = null;
                    wl0Var2.J = null;
                    wl0Var2.i();
                    if (i17 == 0) {
                        cm0Var.h.i();
                    }
                    org.telegram.ui.vl0 vl0Var2 = wl0Var2.E;
                    if (vl0Var2 != null) {
                        vl0Var2.b(true);
                    }
                    wl0Var2.j(true);
                    wl0Var2.f(true);
                    org.telegram.ui.wl0 wl0Var3 = cm0Var.f44398n;
                    if (wl0Var3 != null && (am0Var = wl0Var3.f51200a) != null && (wl0Var = cm0Var.h) != null) {
                        am0Var.a(wl0Var.h);
                        return;
                    }
                    return;
                }
                int i18 = wl0Var2.f51205c0;
                if (i3 >= i18 && i3 < wl0Var2.f51206d0) {
                    int i19 = i3 - i18;
                    if (wl0Var2.L == null) {
                        if (i19 >= 0 && i19 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                            if (i17 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    wl0Var2.f51217n = 0L;
                                    wl0Var2.h = -1;
                                    wl0Var2.J = null;
                                    wl0Var2.f51222r = null;
                                    wl0Var2.f51223s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                wl0Var2.f51217n = 0L;
                                wl0Var2.h = -1;
                                wl0Var2.J = null;
                                wl0Var2.f51222r = org.telegram.messenger.hp.q0(tL_starGiftUnique);
                                wl0Var2.f51223s = null;
                            }
                            wl0Var2.j(true);
                            wl0Var2.i();
                            wl0Var2.f(true);
                            org.telegram.ui.vl0 vl0Var3 = wl0Var2.E;
                            if (vl0Var3 != null) {
                                vl0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (wl0Var2.K != null && i19 >= 0 && i19 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                        if (i17 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                wl0Var2.f51217n = 0L;
                                wl0Var2.h = -1;
                                wl0Var2.f51222r = null;
                                wl0Var2.f51223s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            wl0Var2.f51217n = 0L;
                            wl0Var2.h = -1;
                            wl0Var2.f51222r = org.telegram.messenger.hp.q0(tL_starGiftUnique2);
                            wl0Var2.f51223s = null;
                        }
                        wl0Var2.J = tL_starGiftUnique2;
                        wl0Var2.j(true);
                        wl0Var2.i();
                        wl0Var2.f(true);
                        org.telegram.ui.vl0 vl0Var4 = wl0Var2.E;
                        if (vl0Var4 != null) {
                            vl0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.g11 g11Var = (org.telegram.ui.g11) this.f32768c;
                boolean z12 = view instanceof org.telegram.ui.q01;
                int i20 = this.f32767b;
                try {
                    if (z12) {
                        org.telegram.ui.q01 q01Var = (org.telegram.ui.q01) view;
                        if (!q01Var.f48724s && (((n0Var = q01Var.f48727y) == null || !n0Var.f9093a) && i20 != 13 && i20 != 14)) {
                            if (q01Var.R && (document = q01Var.d) != null) {
                                if (g11Var.f45435a0 == 6) {
                                    g11Var.p(q01Var, Long.valueOf(document.f27007id), document, q01Var.f48725w, null);
                                } else {
                                    g11Var.p(q01Var, null, document, q01Var.f48725w, null);
                                }
                            } else {
                                g11Var.o(q01Var, q01Var.f48720e);
                            }
                        } else {
                            g11Var.l();
                            g11Var.r(q01Var, q01Var.f48727y);
                        }
                        if (i20 != 1 && i20 != 11) {
                            g11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        g11Var.o(view, null);
                        if (i20 != 1 && i20 != 11) {
                            g11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.l01) {
                        g11Var.i(i3, (org.telegram.ui.l01) view);
                        if (i20 != 1 && i20 != 11) {
                            g11Var.performHapticFeedback(3, 1);
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
