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
public final class bm0 implements gk0 {
    public final int f24838a;
    public final int f24839b;
    public final FrameLayout f24840c;

    public bm0(FrameLayout frameLayout, int i10, int i11) {
        this.f24838a = i11;
        this.f24840c = frameLayout;
        this.f24839b = i10;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.rn0 rn0Var;
        org.telegram.ui.nn0 nn0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int L;
        sg.o0 o0Var;
        TLRPC.Document document;
        switch (this.f24838a) {
            case 0:
                gm0 gm0Var = (gm0) this.f24840c;
                org.telegram.ui.ActionBar.k2 k2Var = gm0Var.G;
                kg.f fVar = gm0Var.f26439c;
                org.telegram.messenger.jj E = fVar.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (gm0Var.I.f()) {
                        gm0Var.I.e(E, view, 0);
                        org.telegram.ui.s00 s00Var = gm0Var.J;
                        int f12 = E.f1();
                        s00Var.f41322a = org.telegram.messenger.jj.B0(E.f16337k);
                        s00Var.f41323b = f12;
                        fVar.g(i10);
                        if (!gm0Var.I.f()) {
                            fVar.k(0, ((gm0) fVar.d).f26442r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof dm0) {
                        org.telegram.ui.Cells.l7 l7Var = ((dm0) view).f25468a;
                        org.telegram.messenger.jj message = l7Var.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (l7Var.G) {
                            if (!message.h4() && !org.telegram.messenger.jj.R4(message.f16337k)) {
                                boolean x10 = message.x();
                                if (!x10) {
                                    TLRPC.Message message2 = message.f16337k;
                                    if (message2 != null && message2.noforwards) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (E.f16337k.peer_id.channel_id != 0) {
                                        j10 = 0;
                                        chat = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).L0(Long.valueOf(E.f16337k.peer_id.channel_id));
                                    } else {
                                        j10 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.f16337k.peer_id.chat_id != j10) {
                                            chat = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).L0(Long.valueOf(E.f16337k.peer_id.chat_id));
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
                                org.telegram.messenger.i0.s2(message, gm0Var.F, k2Var);
                            } else {
                                MediaController.B().S(message);
                                return;
                            }
                        } else if (!l7Var.F) {
                            E.P = true;
                            org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.d20.f15147s0).f14863a).X(F0, E, 0, 0);
                            l7Var.f(true);
                            org.telegram.messenger.b6.q(this.f24839b).y();
                        } else {
                            org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.d20.f15147s0).f14863a).f(F0);
                            l7Var.f(true);
                        }
                        gm0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.nn0 nn0Var2 = (org.telegram.ui.nn0) this.f24840c;
                org.telegram.ui.tn0 tn0Var = nn0Var2.f40001p0;
                ArrayList arrayList2 = nn0Var2.f39997l0;
                if (view instanceof org.telegram.ui.mn0) {
                    org.telegram.ui.mn0 mn0Var = (org.telegram.ui.mn0) view;
                    int i15 = nn0Var2.m0;
                    if (nn0Var2.f40000o0 == null) {
                        d5 d5Var = mn0Var.f39740c;
                        org.telegram.ui.z21[] z21VarArr = new org.telegram.ui.z21[1];
                        Point point = org.telegram.messenger.i0.f16026q;
                        int min = (int) Math.min(org.telegram.messenger.i0.L(330.0f), point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.i0.L(324.0f), point.x * 0.95f);
                        if (d5Var != null) {
                            d5Var.f();
                            mn0Var.c();
                            Rect rect = org.telegram.messenger.i0.Q;
                            rect.set(d5Var.getBounds());
                            if (i15 == 1) {
                                L = (org.telegram.messenger.i0.L(12.0f) + (-rect.centerY())) - min;
                            } else {
                                L = (-(mn0Var.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                            }
                            i12 = org.telegram.messenger.i0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i11 = L;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = nn0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.p6 resourceProvider = tn0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.jn0 jn0Var = new org.telegram.ui.jn0(nn0Var2, tn0Var, context, valueOf2, i13, resourceProvider, i14, mn0Var.a(), mn0Var, z21VarArr);
                        jn0Var.f38128g1 = true;
                        long j11 = nn0Var2.f39998n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        jn0Var.setSelected(valueOf);
                        jn0Var.setSaveState(3);
                        jn0Var.y(d5Var, mn0Var);
                        org.telegram.ui.kn0 kn0Var = new org.telegram.ui.kn0(nn0Var2, jn0Var);
                        nn0Var2.f40000o0 = kn0Var;
                        z21VarArr[0] = kn0Var;
                        if (org.telegram.messenger.cd.X) {
                            i16 = 3;
                        }
                        kn0Var.showAsDropDown(mn0Var, 0, i11, i16 | 48);
                        z21VarArr[0].b();
                    }
                    return;
                }
                int i17 = nn0Var2.V;
                int i18 = this.f24839b;
                if (i10 == i17) {
                    nn0Var2.h = -1;
                    nn0Var2.f39998n = 0L;
                    nn0Var2.f40002r = null;
                    nn0Var2.f40003s = null;
                    nn0Var2.I = null;
                    nn0Var2.i();
                    if (i18 == 0) {
                        tn0Var.h.i();
                    }
                    org.telegram.ui.mn0 mn0Var2 = nn0Var2.D;
                    if (mn0Var2 != null) {
                        mn0Var2.b(true);
                    }
                    nn0Var2.j(true);
                    nn0Var2.f(true);
                    org.telegram.ui.nn0 nn0Var3 = tn0Var.f41876n;
                    if (nn0Var3 != null && (rn0Var = nn0Var3.f39982a) != null && (nn0Var = tn0Var.h) != null) {
                        rn0Var.a(nn0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = nn0Var2.f39985b0;
                if (i10 >= i19 && i10 < nn0Var2.f39987c0) {
                    int i20 = i10 - i19;
                    if (nn0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    nn0Var2.f39998n = 0L;
                                    nn0Var2.h = -1;
                                    nn0Var2.I = null;
                                    nn0Var2.f40002r = null;
                                    nn0Var2.f40003s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                nn0Var2.f39998n = 0L;
                                nn0Var2.h = -1;
                                nn0Var2.I = null;
                                nn0Var2.f40002r = org.telegram.messenger.vp.q0(tL_starGiftUnique);
                                nn0Var2.f40003s = null;
                            }
                            nn0Var2.j(true);
                            nn0Var2.i();
                            nn0Var2.f(true);
                            org.telegram.ui.mn0 mn0Var3 = nn0Var2.D;
                            if (mn0Var3 != null) {
                                mn0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (nn0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                nn0Var2.f39998n = 0L;
                                nn0Var2.h = -1;
                                nn0Var2.f40002r = null;
                                nn0Var2.f40003s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            nn0Var2.f39998n = 0L;
                            nn0Var2.h = -1;
                            nn0Var2.f40002r = org.telegram.messenger.vp.q0(tL_starGiftUnique2);
                            nn0Var2.f40003s = null;
                        }
                        nn0Var2.I = tL_starGiftUnique2;
                        nn0Var2.j(true);
                        nn0Var2.i();
                        nn0Var2.f(true);
                        org.telegram.ui.mn0 mn0Var4 = nn0Var2.D;
                        if (mn0Var4 != null) {
                            mn0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.i31 i31Var = (org.telegram.ui.i31) this.f24840c;
                boolean z12 = view instanceof org.telegram.ui.s21;
                int i21 = this.f24839b;
                try {
                    if (z12) {
                        org.telegram.ui.s21 s21Var = (org.telegram.ui.s21) view;
                        if (!s21Var.f41362s && (((o0Var = s21Var.f41365y) == null || !o0Var.f48431a) && i21 != 13 && i21 != 14)) {
                            if (s21Var.Q && (document = s21Var.d) != null) {
                                if (i31Var.W == 6) {
                                    i31Var.p(s21Var, Long.valueOf(document.f19799id), document, s21Var.f41363w, null);
                                } else {
                                    i31Var.p(s21Var, null, document, s21Var.f41363w, null);
                                }
                            } else {
                                i31Var.o(s21Var, s21Var.e);
                            }
                        } else {
                            i31Var.l();
                            i31Var.r(s21Var, s21Var.f41365y);
                        }
                        if (i21 != 1 && i21 != 11) {
                            i31Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        i31Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            i31Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.n21) {
                        i31Var.i(i10, (org.telegram.ui.n21) view);
                        if (i21 != 1 && i21 != 11) {
                            i31Var.performHapticFeedback(3, 1);
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
