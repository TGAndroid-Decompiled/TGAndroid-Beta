package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class mr implements org.telegram.messenger.c20, hj0, org.telegram.messenger.qr {
    public final int f37361a;
    public final rr f37362b;

    public mr(rr rrVar, int i7) {
        this.f37361a = i7;
        this.f37362b = rrVar;
    }

    @Override
    public void a(int r18, org.telegram.tgnet.TLObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mr.a(int, org.telegram.tgnet.TLObject):void");
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        boolean z10;
        boolean[] zArr;
        rr rrVar = this.f37362b;
        b41 G = rrVar.T1.G(i7 - 1);
        if (G != null) {
            qr qrVar = rrVar.f39025g2;
            qr qrVar2 = rrVar.f39024f2;
            qr qrVar3 = rrVar.f39023e2;
            qr qrVar4 = rrVar.f39026h2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = rrVar.f39037s2;
            int i10 = G.d;
            if (i10 == 103) {
                boolean z11 = !rrVar.f39030l2;
                rrVar.f39030l2 = z11;
                ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                return;
            }
            int i11 = G.f56015a;
            if (i11 == 37) {
                int i12 = i10 >>> 24;
                int i13 = 16777215 & i10;
                if (i12 == 0) {
                    qrVar3.g(i13);
                } else if (i12 == 1) {
                    qrVar2.g(i13);
                    rrVar.g1();
                } else if (i10 == 3) {
                    qrVar.g(i13);
                    rrVar.g1();
                } else if (i12 == 2) {
                    qrVar4.g(i13);
                }
            } else if (i11 != 36 && i11 != 35) {
                if (i11 == 39) {
                    if (G.f33192t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rrVar.getContext());
                        String M0 = org.telegram.messenger.hd.M0(2131743719, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131743718, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                        t1Var.show();
                        return;
                    }
                    if (i10 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        rrVar.h1();
                    } else if (i10 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        rrVar.h1();
                    } else if (i10 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        rrVar.h1();
                    } else if (i10 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        rrVar.h1();
                    } else if (i10 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        rrVar.h1();
                    }
                    rrVar.T1.O(true);
                } else if (i11 == 40) {
                    rrVar.f39039u2 = !rrVar.f39039u2;
                    rrVar.X0();
                    rrVar.T1.O(true);
                    rrVar.I0();
                } else if (i10 == 100) {
                    rrVar.f39042x2 = false;
                    boolean z12 = !rrVar.f39043y2;
                    rrVar.f39043y2 = z12;
                    rrVar.f39044z2 = z12;
                    rrVar.X0();
                    rrVar.T1.O(true);
                    rrVar.I0();
                    rrVar.g1();
                } else if (i11 == 38) {
                    boolean z13 = rrVar.f39022c2;
                    rrVar.f39022c2 = !z13;
                    if (!z13) {
                        zArr = rrVar.f39028j2;
                    } else {
                        zArr = rrVar.f39027i2;
                    }
                    if (qrVar4.f38748g != 0) {
                        qrVar4.f38746e = zArr;
                        qrVar4.h();
                        qrVar4.i();
                    }
                    rrVar.T1.O(true);
                    rrVar.h1();
                }
            } else if (i10 == 0) {
                qrVar3.f();
            } else if (i10 == 1) {
                qrVar2.f();
                rrVar.g1();
            } else if (i10 == 3) {
                qrVar.f();
                rrVar.g1();
            } else if (i10 == 2) {
                qrVar4.f();
            } else if (i11 == 35) {
                if (G.f33192t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rrVar.getContext());
                    String M02 = org.telegram.messenger.hd.M0(2131743719, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    t1Var2.S = M02;
                    t1Var2.U = org.telegram.messenger.hd.M0(2131743718, null);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                    t1Var2.show();
                    return;
                }
                if (i10 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    rrVar.h1();
                } else {
                    z10 = true;
                    if (i10 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        rrVar.h1();
                    } else if (i10 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        rrVar.h1();
                    } else if (i10 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        rrVar.h1();
                    } else if (i10 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        rrVar.h1();
                    } else if (i10 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        rrVar.h1();
                    } else if (i10 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        rrVar.h1();
                    } else {
                        if (i10 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            rrVar.h1();
                        } else if (i10 == 14) {
                            if (!tL_chatBannedRights.send_plain && !rrVar.f39036r2.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                rrVar.h1();
                            } else {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= rrVar.T1.E.size()) {
                                        break;
                                    }
                                    b41 G2 = rrVar.T1.G(i14);
                                    if (G2.f56015a == 39 && G2.d == 0) {
                                        v4.e1 K = rrVar.f35931o1.K(i14 + 1);
                                        if (K != null) {
                                            View view2 = K.f58535a;
                                            float f12 = -rrVar.B2;
                                            rrVar.B2 = f12;
                                            org.telegram.messenger.g0.F3(f12, view2, null);
                                        }
                                    } else {
                                        i14++;
                                    }
                                }
                                org.telegram.messenger.p2.APP_ERROR.a();
                                return;
                            }
                        } else if (i10 == 13) {
                            z10 = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            rrVar.h1();
                        } else {
                            z10 = true;
                            if (i10 == 101) {
                                rrVar.f39043y2 = !rrVar.f39043y2;
                                rrVar.g1();
                            } else if (i10 == 102) {
                                rrVar.f39044z2 = !rrVar.f39044z2;
                                rrVar.c1();
                            }
                        }
                        z10 = true;
                    }
                }
                rrVar.T1.O(z10);
            }
        }
    }

    @Override
    public void run(long j3) {
        switch (this.f37361a) {
            case 5:
                rr rrVar = this.f37362b;
                rrVar.getClass();
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.an.ua(j3));
                }
                rrVar.dismiss();
                return;
            default:
                rr rrVar2 = this.f37362b;
                rrVar2.getClass();
                org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.an.ua(j3));
                }
                rrVar2.dismiss();
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
