package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class vr implements org.telegram.messenger.a20, rj0, org.telegram.messenger.or {
    public final int f41541a;
    public final as f41542b;

    public vr(as asVar, int i7) {
        this.f41541a = i7;
        this.f41542b = asVar;
    }

    @Override
    public void a(int r18, org.telegram.tgnet.TLObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vr.a(int, org.telegram.tgnet.TLObject):void");
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        boolean z10;
        boolean[] zArr;
        as asVar = this.f41542b;
        o41 G = asVar.T1.G(i7 - 1);
        if (G != null) {
            zr zrVar = asVar.f33597g2;
            zr zrVar2 = asVar.f33596f2;
            zr zrVar3 = asVar.f33595e2;
            zr zrVar4 = asVar.f33598h2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = asVar.f33609s2;
            int i10 = G.d;
            if (i10 == 103) {
                boolean z11 = !asVar.f33602l2;
                asVar.f33602l2 = z11;
                ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                return;
            }
            int i11 = G.f56630a;
            if (i11 == 37) {
                int i12 = i10 >>> 24;
                int i13 = 16777215 & i10;
                if (i12 == 0) {
                    zrVar3.g(i13);
                } else if (i12 == 1) {
                    zrVar2.g(i13);
                    asVar.h1();
                } else if (i10 == 3) {
                    zrVar.g(i13);
                    asVar.h1();
                } else if (i12 == 2) {
                    zrVar4.g(i13);
                }
            } else if (i11 != 36 && i11 != 35) {
                if (i11 == 39) {
                    if (G.f38106u) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(asVar.getContext());
                        String N0 = org.telegram.messenger.gd.N0(2131743476, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.N0(2131743475, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        t1Var.show();
                        return;
                    }
                    if (i10 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        asVar.i1();
                    } else if (i10 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        asVar.i1();
                    } else if (i10 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        asVar.i1();
                    } else if (i10 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        asVar.i1();
                    } else if (i10 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        asVar.i1();
                    }
                    asVar.T1.O(true);
                } else if (i11 == 40) {
                    asVar.f33611u2 = !asVar.f33611u2;
                    asVar.Y0();
                    asVar.T1.O(true);
                    asVar.J0();
                } else if (i10 == 100) {
                    asVar.f33614x2 = false;
                    boolean z12 = !asVar.f33615y2;
                    asVar.f33615y2 = z12;
                    asVar.f33616z2 = z12;
                    asVar.Y0();
                    asVar.T1.O(true);
                    asVar.J0();
                    asVar.h1();
                } else if (i11 == 38) {
                    boolean z13 = asVar.f33594c2;
                    asVar.f33594c2 = !z13;
                    if (!z13) {
                        zArr = asVar.f33600j2;
                    } else {
                        zArr = asVar.f33599i2;
                    }
                    if (zrVar4.f42967g != 0) {
                        zrVar4.f42965e = zArr;
                        zrVar4.h();
                        zrVar4.i();
                    }
                    asVar.T1.O(true);
                    asVar.i1();
                }
            } else if (i10 == 0) {
                zrVar3.f();
            } else if (i10 == 1) {
                zrVar2.f();
                asVar.h1();
            } else if (i10 == 3) {
                zrVar.f();
                asVar.h1();
            } else if (i10 == 2) {
                zrVar4.f();
            } else if (i11 == 35) {
                if (G.f38106u) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(asVar.getContext());
                    String N02 = org.telegram.messenger.gd.N0(2131743476, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28774a;
                    t1Var2.S = N02;
                    t1Var2.U = org.telegram.messenger.gd.N0(2131743475, null);
                    alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                    t1Var2.show();
                    return;
                }
                if (i10 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    asVar.i1();
                } else {
                    z10 = true;
                    if (i10 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        asVar.i1();
                    } else if (i10 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        asVar.i1();
                    } else if (i10 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        asVar.i1();
                    } else if (i10 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        asVar.i1();
                    } else if (i10 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        asVar.i1();
                    } else if (i10 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        asVar.i1();
                    } else {
                        if (i10 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            asVar.i1();
                        } else if (i10 == 14) {
                            if (!tL_chatBannedRights.send_plain && !asVar.f33608r2.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                asVar.i1();
                            } else {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= asVar.T1.E.size()) {
                                        break;
                                    }
                                    o41 G2 = asVar.T1.G(i14);
                                    if (G2.f56630a == 39 && G2.d == 0) {
                                        v4.f1 K = asVar.f39539o1.K(i14 + 1);
                                        if (K != null) {
                                            View view2 = K.f59161a;
                                            float f12 = -asVar.B2;
                                            asVar.B2 = f12;
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
                            asVar.i1();
                        } else {
                            z10 = true;
                            if (i10 == 101) {
                                asVar.f33615y2 = !asVar.f33615y2;
                                asVar.h1();
                            } else if (i10 == 102) {
                                asVar.f33616z2 = !asVar.f33616z2;
                                asVar.d1();
                            }
                        }
                        z10 = true;
                    }
                }
                asVar.T1.O(z10);
            }
        }
    }

    @Override
    public void run(long j3) {
        switch (this.f41541a) {
            case 5:
                as asVar = this.f41542b;
                asVar.getClass();
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                asVar.dismiss();
                return;
            default:
                as asVar2 = this.f41542b;
                asVar2.getClass();
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                asVar2.dismiss();
                return;
        }
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
