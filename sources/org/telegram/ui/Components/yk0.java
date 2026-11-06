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
    public final int f40646a;
    public final int f40647b;
    public final FrameLayout f40648c;

    public yk0(FrameLayout frameLayout, int i7, int i10) {
        this.f40646a = i10;
        this.f40648c = frameLayout;
        this.f40647b = i7;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z9;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.fm0 fm0Var;
        org.telegram.ui.bm0 bm0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Long valueOf;
        int L;
        ch.o0 o0Var;
        TLRPC.Document document;
        switch (this.f40646a) {
            case 0:
                dl0 dl0Var = (dl0) this.f40648c;
                org.telegram.ui.ActionBar.f2 f2Var = dl0Var.G;
                bi.k5 k5Var = dl0Var.f33000c;
                org.telegram.messenger.ij E = k5Var.E(i7);
                if (E != null) {
                    boolean z10 = false;
                    if (dl0Var.I.i()) {
                        dl0Var.I.h(E, view, 0);
                        org.telegram.ui.rz rzVar = dl0Var.J;
                        int f12 = E.f1();
                        rzVar.f49590a = org.telegram.messenger.ij.B0(E.f23237k);
                        rzVar.f49591b = f12;
                        k5Var.g(i7);
                        if (!dl0Var.I.i()) {
                            k5Var.k(0, ((dl0) k5Var.d).f33004r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof al0) {
                        org.telegram.ui.Cells.h7 h7Var = ((al0) view).f31846a;
                        org.telegram.messenger.ij message = h7Var.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (h7Var.G) {
                            if (!message.i4() && !org.telegram.messenger.ij.S4(message.f23237k)) {
                                boolean x10 = message.x();
                                if (!x10) {
                                    TLRPC.Message message2 = message.f23237k;
                                    if (message2 != null && message2.noforwards) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (E.f23237k.peer_id.channel_id != 0) {
                                        j3 = 0;
                                        chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).M0(Long.valueOf(E.f23237k.peer_id.channel_id));
                                    } else {
                                        j3 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.f23237k.peer_id.chat_id != j3) {
                                            chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).M0(Long.valueOf(E.f23237k.peer_id.chat_id));
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
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24459s0).f21723a).X(F0, E, 0, 0);
                            h7Var.f(true);
                            org.telegram.messenger.z5.q(this.f40647b).y();
                        } else {
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24459s0).f21723a).f(F0);
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
                org.telegram.ui.bm0 bm0Var2 = (org.telegram.ui.bm0) this.f40648c;
                org.telegram.ui.hm0 hm0Var = bm0Var2.f44447p0;
                ArrayList arrayList2 = bm0Var2.f44443l0;
                if (view instanceof org.telegram.ui.am0) {
                    org.telegram.ui.am0 am0Var = (org.telegram.ui.am0) view;
                    int i14 = bm0Var2.m0;
                    if (bm0Var2.f44446o0 == null) {
                        g5 g5Var = am0Var.f43706c;
                        org.telegram.ui.h11[] h11VarArr = new org.telegram.ui.h11[1];
                        Point point = org.telegram.messenger.g0.f22537q;
                        int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (g5Var != null) {
                            g5Var.f();
                            am0Var.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(g5Var.getBounds());
                            if (i14 == 1) {
                                L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                            } else {
                                L = (-(am0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            }
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        Context context = bm0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i11);
                        int i15 = 5;
                        if (i14 == 1) {
                            i12 = 5;
                        } else {
                            i12 = 7;
                        }
                        org.telegram.ui.ActionBar.f6 resourceProvider = hm0Var.getResourceProvider();
                        if (i14 == 1) {
                            i13 = 24;
                        } else {
                            i13 = 16;
                        }
                        org.telegram.ui.xl0 xl0Var = new org.telegram.ui.xl0(bm0Var2, hm0Var, context, valueOf2, i12, resourceProvider, i13, am0Var.a(), am0Var, h11VarArr);
                        xl0Var.f49034g1 = true;
                        long j10 = bm0Var2.f44444n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        xl0Var.setSelected(valueOf);
                        xl0Var.setSaveState(3);
                        xl0Var.y(g5Var, am0Var);
                        org.telegram.ui.yl0 yl0Var = new org.telegram.ui.yl0(bm0Var2, xl0Var);
                        bm0Var2.f44446o0 = yl0Var;
                        h11VarArr[0] = yl0Var;
                        if (org.telegram.messenger.hd.f22871a0) {
                            i15 = 3;
                        }
                        yl0Var.showAsDropDown(am0Var, 0, i10, i15 | 48);
                        h11VarArr[0].b();
                    }
                    return;
                }
                int i16 = bm0Var2.V;
                int i17 = this.f40647b;
                if (i7 == i16) {
                    bm0Var2.h = -1;
                    bm0Var2.f44444n = 0L;
                    bm0Var2.f44448r = null;
                    bm0Var2.f44449s = null;
                    bm0Var2.I = null;
                    bm0Var2.i();
                    if (i17 == 0) {
                        hm0Var.h.i();
                    }
                    org.telegram.ui.am0 am0Var2 = bm0Var2.D;
                    if (am0Var2 != null) {
                        am0Var2.b(true);
                    }
                    bm0Var2.j(true);
                    bm0Var2.f(true);
                    org.telegram.ui.bm0 bm0Var3 = hm0Var.f46459n;
                    if (bm0Var3 != null && (fm0Var = bm0Var3.f44427a) != null && (bm0Var = hm0Var.h) != null) {
                        fm0Var.a(bm0Var.h);
                        return;
                    }
                    return;
                }
                int i18 = bm0Var2.f44430b0;
                if (i7 >= i18 && i7 < bm0Var2.f44432c0) {
                    int i19 = i7 - i18;
                    if (bm0Var2.K == null) {
                        if (i19 >= 0 && i19 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                            if (i17 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    bm0Var2.f44444n = 0L;
                                    bm0Var2.h = -1;
                                    bm0Var2.I = null;
                                    bm0Var2.f44448r = null;
                                    bm0Var2.f44449s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                bm0Var2.f44444n = 0L;
                                bm0Var2.h = -1;
                                bm0Var2.I = null;
                                bm0Var2.f44448r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
                                bm0Var2.f44449s = null;
                            }
                            bm0Var2.j(true);
                            bm0Var2.i();
                            bm0Var2.f(true);
                            org.telegram.ui.am0 am0Var3 = bm0Var2.D;
                            if (am0Var3 != null) {
                                am0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (bm0Var2.J != null && i19 >= 0 && i19 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                        if (i17 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                bm0Var2.f44444n = 0L;
                                bm0Var2.h = -1;
                                bm0Var2.f44448r = null;
                                bm0Var2.f44449s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            bm0Var2.f44444n = 0L;
                            bm0Var2.h = -1;
                            bm0Var2.f44448r = org.telegram.messenger.qp.q0(tL_starGiftUnique2);
                            bm0Var2.f44449s = null;
                        }
                        bm0Var2.I = tL_starGiftUnique2;
                        bm0Var2.j(true);
                        bm0Var2.i();
                        bm0Var2.f(true);
                        org.telegram.ui.am0 am0Var4 = bm0Var2.D;
                        if (am0Var4 != null) {
                            am0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.q11 q11Var = (org.telegram.ui.q11) this.f40648c;
                boolean z11 = view instanceof org.telegram.ui.a11;
                int i20 = this.f40647b;
                try {
                    if (z11) {
                        org.telegram.ui.a11 a11Var = (org.telegram.ui.a11) view;
                        if (!a11Var.f43537s && (((o0Var = a11Var.f43540y) == null || !o0Var.f6352a) && i20 != 13 && i20 != 14)) {
                            if (a11Var.Q && (document = a11Var.d) != null) {
                                if (q11Var.W == 6) {
                                    q11Var.p(a11Var, Long.valueOf(document.f26958id), document, a11Var.f43538w, null);
                                } else {
                                    q11Var.p(a11Var, null, document, a11Var.f43538w, null);
                                }
                            } else {
                                q11Var.o(a11Var, a11Var.f43533e);
                            }
                        } else {
                            q11Var.l();
                            q11Var.r(a11Var, a11Var.f43540y);
                        }
                        if (i20 != 1 && i20 != 11) {
                            q11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        q11Var.o(view, null);
                        if (i20 != 1 && i20 != 11) {
                            q11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.v01) {
                        q11Var.i(i7, (org.telegram.ui.v01) view);
                        if (i20 != 1 && i20 != 11) {
                            q11Var.performHapticFeedback(3, 1);
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
