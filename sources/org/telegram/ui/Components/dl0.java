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
public final class dl0 implements gj0 {
    public final int f34005a;
    public final int f34006b;
    public final FrameLayout f34007c;

    public dl0(FrameLayout frameLayout, int i7, int i10) {
        this.f34005a = i10;
        this.f34007c = frameLayout;
        this.f34006b = i7;
    }

    @Override
    public final void b(int i7, View view) {
        boolean z10;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.gm0 gm0Var;
        org.telegram.ui.cm0 cm0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Long valueOf;
        int L;
        ch.p0 p0Var;
        TLRPC.Document document;
        switch (this.f34005a) {
            case 0:
                il0 il0Var = (il0) this.f34007c;
                org.telegram.ui.ActionBar.e2 e2Var = il0Var.H;
                di.i4 i4Var = il0Var.f35653c;
                org.telegram.messenger.gj E = i4Var.E(i7);
                if (E != null) {
                    boolean z11 = false;
                    if (il0Var.J.g0()) {
                        il0Var.J.M(E, view, 0);
                        org.telegram.ui.sz szVar = il0Var.K;
                        int e12 = E.e1();
                        szVar.f51305a = org.telegram.messenger.gj.B0(E.f23817k);
                        szVar.f51306b = e12;
                        i4Var.g(i7);
                        if (!il0Var.J.g0()) {
                            i4Var.k(0, ((il0) i4Var.d).f35657r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof fl0) {
                        org.telegram.ui.Cells.g7 g7Var = ((fl0) view).f34623a;
                        org.telegram.messenger.gj message = g7Var.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (g7Var.H) {
                            if (!message.h4() && !org.telegram.messenger.gj.R4(message.f23817k)) {
                                boolean x10 = message.x();
                                if (!x10) {
                                    TLRPC.Message message2 = message.f23817k;
                                    if (message2 != null && message2.noforwards) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (E.f23817k.peer_id.channel_id != 0) {
                                        j3 = 0;
                                        chat = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).M0(Long.valueOf(E.f23817k.peer_id.channel_id));
                                    } else {
                                        j3 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.f23817k.peer_id.chat_id != j3) {
                                            chat = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).M0(Long.valueOf(E.f23817k.peer_id.chat_id));
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
                                    PhotoViewer.p1().I2(null, e2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.p1().I2(null, e2Var, null);
                                    PhotoViewer.p1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                org.telegram.messenger.g0.s2(message, il0Var.G, e2Var);
                            } else {
                                MediaController.B().S(message);
                                return;
                            }
                        } else if (!g7Var.G) {
                            E.P = true;
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.m10.f24934t0).f22778a).W(F0, E, 0, 0);
                            g7Var.f(true);
                            org.telegram.messenger.z5.q(this.f34006b).y();
                        } else {
                            org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.m10.f24934t0).f22778a).f(F0);
                            g7Var.f(true);
                        }
                        il0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.cm0 cm0Var2 = (org.telegram.ui.cm0) this.f34007c;
                org.telegram.ui.im0 im0Var = cm0Var2.f46210q0;
                ArrayList arrayList2 = cm0Var2.m0;
                if (view instanceof org.telegram.ui.bm0) {
                    org.telegram.ui.bm0 bm0Var = (org.telegram.ui.bm0) view;
                    int i14 = cm0Var2.f46207n0;
                    if (cm0Var2.f46209p0 == null) {
                        e5 e5Var = bm0Var.f45788c;
                        org.telegram.ui.e11[] e11VarArr = new org.telegram.ui.e11[1];
                        Point point = org.telegram.messenger.g0.f23609q;
                        int min = (int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (e5Var != null) {
                            e5Var.f();
                            bm0Var.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(e5Var.getBounds());
                            if (i14 == 1) {
                                L = (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min;
                            } else {
                                L = (-(bm0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            }
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        Context context = cm0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i11);
                        int i15 = 5;
                        if (i14 == 1) {
                            i12 = 5;
                        } else {
                            i12 = 7;
                        }
                        org.telegram.ui.ActionBar.e6 resourceProvider = im0Var.getResourceProvider();
                        if (i14 == 1) {
                            i13 = 24;
                        } else {
                            i13 = 16;
                        }
                        org.telegram.ui.yl0 yl0Var = new org.telegram.ui.yl0(cm0Var2, im0Var, context, valueOf2, i12, resourceProvider, i13, bm0Var.a(), bm0Var, e11VarArr);
                        yl0Var.f49385h1 = true;
                        long j10 = cm0Var2.f46206n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        yl0Var.setSelected(valueOf);
                        yl0Var.setSaveState(3);
                        yl0Var.y(e5Var, bm0Var);
                        org.telegram.ui.zl0 zl0Var = new org.telegram.ui.zl0(cm0Var2, yl0Var);
                        cm0Var2.f46209p0 = zl0Var;
                        e11VarArr[0] = zl0Var;
                        if (org.telegram.messenger.hd.f24101a0) {
                            i15 = 3;
                        }
                        zl0Var.showAsDropDown(bm0Var, 0, i10, i15 | 48);
                        e11VarArr[0].b();
                    }
                    return;
                }
                int i16 = cm0Var2.W;
                int i17 = this.f34006b;
                if (i7 == i16) {
                    cm0Var2.h = -1;
                    cm0Var2.f46206n = 0L;
                    cm0Var2.f46211r = null;
                    cm0Var2.f46212s = null;
                    cm0Var2.J = null;
                    cm0Var2.i();
                    if (i17 == 0) {
                        im0Var.h.i();
                    }
                    org.telegram.ui.bm0 bm0Var2 = cm0Var2.E;
                    if (bm0Var2 != null) {
                        bm0Var2.b(true);
                    }
                    cm0Var2.j(true);
                    cm0Var2.f(true);
                    org.telegram.ui.cm0 cm0Var3 = im0Var.f48094n;
                    if (cm0Var3 != null && (gm0Var = cm0Var3.f46189a) != null && (cm0Var = im0Var.h) != null) {
                        gm0Var.a(cm0Var.h);
                        return;
                    }
                    return;
                }
                int i18 = cm0Var2.f46194c0;
                if (i7 >= i18 && i7 < cm0Var2.f46195d0) {
                    int i19 = i7 - i18;
                    if (cm0Var2.L == null) {
                        if (i19 >= 0 && i19 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                            if (i17 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    cm0Var2.f46206n = 0L;
                                    cm0Var2.h = -1;
                                    cm0Var2.J = null;
                                    cm0Var2.f46211r = null;
                                    cm0Var2.f46212s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                cm0Var2.f46206n = 0L;
                                cm0Var2.h = -1;
                                cm0Var2.J = null;
                                cm0Var2.f46211r = org.telegram.messenger.np.q0(tL_starGiftUnique);
                                cm0Var2.f46212s = null;
                            }
                            cm0Var2.j(true);
                            cm0Var2.i();
                            cm0Var2.f(true);
                            org.telegram.ui.bm0 bm0Var3 = cm0Var2.E;
                            if (bm0Var3 != null) {
                                bm0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (cm0Var2.K != null && i19 >= 0 && i19 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                        if (i17 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                cm0Var2.f46206n = 0L;
                                cm0Var2.h = -1;
                                cm0Var2.f46211r = null;
                                cm0Var2.f46212s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            cm0Var2.f46206n = 0L;
                            cm0Var2.h = -1;
                            cm0Var2.f46211r = org.telegram.messenger.np.q0(tL_starGiftUnique2);
                            cm0Var2.f46212s = null;
                        }
                        cm0Var2.J = tL_starGiftUnique2;
                        cm0Var2.j(true);
                        cm0Var2.i();
                        cm0Var2.f(true);
                        org.telegram.ui.bm0 bm0Var4 = cm0Var2.E;
                        if (bm0Var4 != null) {
                            bm0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.n11 n11Var = (org.telegram.ui.n11) this.f34007c;
                boolean z12 = view instanceof org.telegram.ui.x01;
                int i20 = this.f34006b;
                try {
                    if (z12) {
                        org.telegram.ui.x01 x01Var = (org.telegram.ui.x01) view;
                        if (!x01Var.f53061s && (((p0Var = x01Var.f53064y) == null || !p0Var.f5184a) && i20 != 13 && i20 != 14)) {
                            if (x01Var.R && (document = x01Var.d) != null) {
                                if (n11Var.f49365a0 == 6) {
                                    n11Var.p(x01Var, Long.valueOf(document.f28057id), document, x01Var.f53062w, null);
                                } else {
                                    n11Var.p(x01Var, null, document, x01Var.f53062w, null);
                                }
                            } else {
                                n11Var.o(x01Var, x01Var.f53057e);
                            }
                        } else {
                            n11Var.l();
                            n11Var.r(x01Var, x01Var.f53064y);
                        }
                        if (i20 != 1 && i20 != 11) {
                            n11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        n11Var.o(view, null);
                        if (i20 != 1 && i20 != 11) {
                            n11Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.s01) {
                        n11Var.i(i7, (org.telegram.ui.s01) view);
                        if (i20 != 1 && i20 != 11) {
                            n11Var.performHapticFeedback(3, 1);
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
