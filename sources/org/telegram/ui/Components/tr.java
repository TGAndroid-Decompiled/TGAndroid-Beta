package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class tr implements org.telegram.messenger.a20, pj0, org.telegram.messenger.or {
    public final int f40087a;
    public final yr f40088b;

    public tr(yr yrVar, int i7) {
        this.f40087a = i7;
        this.f40088b = yrVar;
    }

    @Override
    public void a(int r18, org.telegram.tgnet.TLObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tr.a(int, org.telegram.tgnet.TLObject):void");
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        boolean z10;
        boolean[] zArr;
        yr yrVar = this.f40088b;
        l41 G = yrVar.T1.G(i7 - 1);
        if (G != null) {
            xr xrVar = yrVar.f42601g2;
            xr xrVar2 = yrVar.f42600f2;
            xr xrVar3 = yrVar.f42599e2;
            xr xrVar4 = yrVar.f42602h2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = yrVar.f42613s2;
            int i10 = G.d;
            if (i10 == 103) {
                boolean z11 = !yrVar.f42606l2;
                yrVar.f42606l2 = z11;
                ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                return;
            }
            int i11 = G.f56589a;
            if (i11 == 37) {
                int i12 = i10 >>> 24;
                int i13 = 16777215 & i10;
                if (i12 == 0) {
                    xrVar3.g(i13);
                } else if (i12 == 1) {
                    xrVar2.g(i13);
                    yrVar.h1();
                } else if (i10 == 3) {
                    xrVar.g(i13);
                    yrVar.h1();
                } else if (i12 == 2) {
                    xrVar4.g(i13);
                }
            } else if (i11 != 36 && i11 != 35) {
                if (i11 == 39) {
                    if (G.f37026u) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yrVar.getContext());
                        String M0 = org.telegram.messenger.gd.M0(2131743482, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131743481, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                        u1Var.show();
                        return;
                    }
                    if (i10 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        yrVar.i1();
                    } else if (i10 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        yrVar.i1();
                    } else if (i10 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        yrVar.i1();
                    } else if (i10 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        yrVar.i1();
                    } else if (i10 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        yrVar.i1();
                    }
                    yrVar.T1.O(true);
                } else if (i11 == 40) {
                    yrVar.f42615u2 = !yrVar.f42615u2;
                    yrVar.Y0();
                    yrVar.T1.O(true);
                    yrVar.J0();
                } else if (i10 == 100) {
                    yrVar.f42618x2 = false;
                    boolean z12 = !yrVar.f42619y2;
                    yrVar.f42619y2 = z12;
                    yrVar.f42620z2 = z12;
                    yrVar.Y0();
                    yrVar.T1.O(true);
                    yrVar.J0();
                    yrVar.h1();
                } else if (i11 == 38) {
                    boolean z13 = yrVar.f42598c2;
                    yrVar.f42598c2 = !z13;
                    if (!z13) {
                        zArr = yrVar.f42604j2;
                    } else {
                        zArr = yrVar.f42603i2;
                    }
                    if (xrVar4.f42171g != 0) {
                        xrVar4.f42169e = zArr;
                        xrVar4.h();
                        xrVar4.i();
                    }
                    yrVar.T1.O(true);
                    yrVar.i1();
                }
            } else if (i10 == 0) {
                xrVar3.f();
            } else if (i10 == 1) {
                xrVar2.f();
                yrVar.h1();
            } else if (i10 == 3) {
                xrVar.f();
                yrVar.h1();
            } else if (i10 == 2) {
                xrVar4.f();
            } else if (i11 == 35) {
                if (G.f37026u) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yrVar.getContext());
                    String M02 = org.telegram.messenger.gd.M0(2131743482, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28746a;
                    u1Var2.S = M02;
                    u1Var2.U = org.telegram.messenger.gd.M0(2131743481, null);
                    alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                    u1Var2.show();
                    return;
                }
                if (i10 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    yrVar.i1();
                } else {
                    z10 = true;
                    if (i10 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        yrVar.i1();
                    } else if (i10 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        yrVar.i1();
                    } else if (i10 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        yrVar.i1();
                    } else if (i10 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        yrVar.i1();
                    } else if (i10 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        yrVar.i1();
                    } else if (i10 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        yrVar.i1();
                    } else {
                        if (i10 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            yrVar.i1();
                        } else if (i10 == 14) {
                            if (!tL_chatBannedRights.send_plain && !yrVar.f42612r2.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                yrVar.i1();
                            } else {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= yrVar.T1.E.size()) {
                                        break;
                                    }
                                    l41 G2 = yrVar.T1.G(i14);
                                    if (G2.f56589a == 39 && G2.d == 0) {
                                        v4.f1 K = yrVar.f39534o1.K(i14 + 1);
                                        if (K != null) {
                                            View view2 = K.f59122a;
                                            float f12 = -yrVar.B2;
                                            yrVar.B2 = f12;
                                            org.telegram.messenger.g0.E3(f12, view2, null);
                                        }
                                    } else {
                                        i14++;
                                    }
                                }
                                org.telegram.messenger.q2.APP_ERROR.a();
                                return;
                            }
                        } else if (i10 == 13) {
                            z10 = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            yrVar.i1();
                        } else {
                            z10 = true;
                            if (i10 == 101) {
                                yrVar.f42619y2 = !yrVar.f42619y2;
                                yrVar.h1();
                            } else if (i10 == 102) {
                                yrVar.f42620z2 = !yrVar.f42620z2;
                                yrVar.d1();
                            }
                        }
                        z10 = true;
                    }
                }
                yrVar.T1.O(z10);
            }
        }
    }

    @Override
    public void run(long j3) {
        switch (this.f40087a) {
            case 5:
                yr yrVar = this.f40088b;
                yrVar.getClass();
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                yrVar.dismiss();
                return;
            default:
                yr yrVar2 = this.f40088b;
                yrVar2.getClass();
                org.telegram.ui.ActionBar.h2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                yrVar2.dismiss();
                return;
        }
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
