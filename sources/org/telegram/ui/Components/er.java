package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class er implements org.telegram.messenger.f20, cj0, org.telegram.messenger.tr {
    public final int f33326a;
    public final kr f33327b;

    public er(kr krVar, int i7) {
        this.f33326a = i7;
        this.f33327b = krVar;
    }

    @Override
    public void a(int r18, org.telegram.tgnet.TLObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.er.a(int, org.telegram.tgnet.TLObject):void");
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        boolean z9;
        boolean[] zArr;
        kr krVar = this.f33327b;
        x31 G = krVar.S1.G(i7 - 1);
        if (G != null) {
            jr jrVar = krVar.f35398f2;
            jr jrVar2 = krVar.f35397e2;
            jr jrVar3 = krVar.d2;
            jr jrVar4 = krVar.f35399g2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = krVar.f35410r2;
            int i10 = G.d;
            if (i10 == 103) {
                boolean z10 = !krVar.f35403k2;
                krVar.f35403k2 = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                return;
            }
            int i11 = G.f54543a;
            if (i11 == 37) {
                int i12 = i10 >>> 24;
                int i13 = 16777215 & i10;
                if (i12 == 0) {
                    jrVar3.g(i13);
                } else if (i12 == 1) {
                    jrVar2.g(i13);
                    krVar.g1();
                } else if (i10 == 3) {
                    jrVar.g(i13);
                    krVar.g1();
                } else if (i12 == 2) {
                    jrVar4.g(i13);
                }
            } else if (i11 != 36 && i11 != 35) {
                if (i11 == 39) {
                    if (G.f40164t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(krVar.getContext());
                        String M0 = org.telegram.messenger.id.M0(2131743719, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131743718, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                        u1Var.show();
                        return;
                    }
                    if (i10 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        krVar.h1();
                    } else if (i10 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        krVar.h1();
                    } else if (i10 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        krVar.h1();
                    } else if (i10 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        krVar.h1();
                    } else if (i10 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        krVar.h1();
                    }
                    krVar.S1.O(true);
                } else if (i11 == 40) {
                    krVar.f35412t2 = !krVar.f35412t2;
                    krVar.X0();
                    krVar.S1.O(true);
                    krVar.I0();
                } else if (i10 == 100) {
                    krVar.f35415w2 = false;
                    boolean z11 = !krVar.f35416x2;
                    krVar.f35416x2 = z11;
                    krVar.f35417y2 = z11;
                    krVar.X0();
                    krVar.S1.O(true);
                    krVar.I0();
                    krVar.g1();
                } else if (i11 == 38) {
                    boolean z12 = krVar.f35395b2;
                    krVar.f35395b2 = !z12;
                    if (!z12) {
                        zArr = krVar.f35401i2;
                    } else {
                        zArr = krVar.f35400h2;
                    }
                    if (jrVar4.f35052g != 0) {
                        jrVar4.f35050e = zArr;
                        jrVar4.h();
                        jrVar4.i();
                    }
                    krVar.S1.O(true);
                    krVar.h1();
                }
            } else if (i10 == 0) {
                jrVar3.f();
            } else if (i10 == 1) {
                jrVar2.f();
                krVar.g1();
            } else if (i10 == 3) {
                jrVar.f();
                krVar.g1();
            } else if (i10 == 2) {
                jrVar4.f();
            } else if (i11 == 35) {
                if (G.f40164t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(krVar.getContext());
                    String M02 = org.telegram.messenger.id.M0(2131743719, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                    u1Var2.R = M02;
                    u1Var2.T = org.telegram.messenger.id.M0(2131743718, null);
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), null);
                    u1Var2.show();
                    return;
                }
                if (i10 == 6) {
                    z9 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    krVar.h1();
                } else {
                    z9 = true;
                    if (i10 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        krVar.h1();
                    } else if (i10 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        krVar.h1();
                    } else if (i10 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        krVar.h1();
                    } else if (i10 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        krVar.h1();
                    } else if (i10 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        krVar.h1();
                    } else if (i10 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        krVar.h1();
                    } else {
                        if (i10 == 12) {
                            boolean z13 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z13;
                            tL_chatBannedRights.send_gifs = z13;
                            tL_chatBannedRights.send_games = z13;
                            tL_chatBannedRights.send_stickers = z13;
                            krVar.h1();
                        } else if (i10 == 14) {
                            if (!tL_chatBannedRights.send_plain && !krVar.f35409q2.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                krVar.h1();
                            } else {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= krVar.S1.D.size()) {
                                        break;
                                    }
                                    x31 G2 = krVar.S1.G(i14);
                                    if (G2.f54543a == 39 && G2.d == 0) {
                                        v4.d1 K = krVar.n1.K(i14 + 1);
                                        if (K != null) {
                                            View view2 = K.f57052a;
                                            float f12 = -krVar.A2;
                                            krVar.A2 = f12;
                                            org.telegram.messenger.g0.G3(f12, view2, null);
                                        }
                                    } else {
                                        i14++;
                                    }
                                }
                                org.telegram.messenger.p2.APP_ERROR.a();
                                return;
                            }
                        } else if (i10 == 13) {
                            z9 = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            krVar.h1();
                        } else {
                            z9 = true;
                            if (i10 == 101) {
                                krVar.f35416x2 = !krVar.f35416x2;
                                krVar.g1();
                            } else if (i10 == 102) {
                                krVar.f35417y2 = !krVar.f35417y2;
                                krVar.c1();
                            }
                        }
                        z9 = true;
                    }
                }
                krVar.S1.O(z9);
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void run(long j3) {
        switch (this.f33326a) {
            case 5:
                kr krVar = this.f33327b;
                krVar.getClass();
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.cn.ta(j3));
                }
                krVar.dismiss();
                return;
            default:
                kr krVar2 = this.f33327b;
                krVar2.getClass();
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.cn.ta(j3));
                }
                krVar2.dismiss();
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
