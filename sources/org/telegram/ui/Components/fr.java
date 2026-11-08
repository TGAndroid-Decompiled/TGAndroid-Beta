package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class fr implements org.telegram.messenger.f20, cj0, org.telegram.messenger.tr {
    public final int f33637a;
    public final lr f33638b;

    public fr(lr lrVar, int i7) {
        this.f33637a = i7;
        this.f33638b = lrVar;
    }

    @Override
    public void a(int r18, org.telegram.tgnet.TLObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fr.a(int, org.telegram.tgnet.TLObject):void");
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        boolean z9;
        boolean[] zArr;
        lr lrVar = this.f33638b;
        x31 G = lrVar.P1.G(i7 - 1);
        if (G != null) {
            kr krVar = lrVar.f35747c2;
            kr krVar2 = lrVar.f35746b2;
            kr krVar3 = lrVar.f35745a2;
            kr krVar4 = lrVar.d2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.f35758o2;
            int i10 = G.d;
            if (i10 == 103) {
                boolean z10 = !lrVar.f35751h2;
                lrVar.f35751h2 = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                return;
            }
            int i11 = G.f54531a;
            if (i11 == 37) {
                int i12 = i10 >>> 24;
                int i13 = 16777215 & i10;
                if (i12 == 0) {
                    krVar3.g(i13);
                } else if (i12 == 1) {
                    krVar2.g(i13);
                    lrVar.g1();
                } else if (i10 == 3) {
                    krVar.g(i13);
                    lrVar.g1();
                } else if (i12 == 2) {
                    krVar4.g(i13);
                }
            } else if (i11 != 36 && i11 != 35) {
                if (i11 == 39) {
                    if (G.f40188t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lrVar.getContext());
                        String M0 = org.telegram.messenger.id.M0(2131743722, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131743721, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        u1Var.show();
                        return;
                    }
                    if (i10 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        lrVar.h1();
                    } else if (i10 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        lrVar.h1();
                    } else if (i10 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        lrVar.h1();
                    } else if (i10 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        lrVar.h1();
                    } else if (i10 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        lrVar.h1();
                    }
                    lrVar.P1.O(true);
                } else if (i11 == 40) {
                    lrVar.f35760q2 = !lrVar.f35760q2;
                    lrVar.X0();
                    lrVar.P1.O(true);
                    lrVar.I0();
                } else if (i10 == 100) {
                    lrVar.f35763t2 = false;
                    boolean z11 = !lrVar.f35764u2;
                    lrVar.f35764u2 = z11;
                    lrVar.f35765v2 = z11;
                    lrVar.X0();
                    lrVar.P1.O(true);
                    lrVar.I0();
                    lrVar.g1();
                } else if (i11 == 38) {
                    boolean z12 = lrVar.Y1;
                    lrVar.Y1 = !z12;
                    if (!z12) {
                        zArr = lrVar.f35749f2;
                    } else {
                        zArr = lrVar.f35748e2;
                    }
                    if (krVar4.f35420g != 0) {
                        krVar4.f35418e = zArr;
                        krVar4.h();
                        krVar4.i();
                    }
                    lrVar.P1.O(true);
                    lrVar.h1();
                }
            } else if (i10 == 0) {
                krVar3.f();
            } else if (i10 == 1) {
                krVar2.f();
                lrVar.g1();
            } else if (i10 == 3) {
                krVar.f();
                lrVar.g1();
            } else if (i10 == 2) {
                krVar4.f();
            } else if (i11 == 35) {
                if (G.f40188t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(lrVar.getContext());
                    String M02 = org.telegram.messenger.id.M0(2131743722, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    u1Var2.R = M02;
                    u1Var2.T = org.telegram.messenger.id.M0(2131743721, null);
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747832, null), null);
                    u1Var2.show();
                    return;
                }
                if (i10 == 6) {
                    z9 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    lrVar.h1();
                } else {
                    z9 = true;
                    if (i10 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        lrVar.h1();
                    } else if (i10 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        lrVar.h1();
                    } else if (i10 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        lrVar.h1();
                    } else if (i10 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        lrVar.h1();
                    } else if (i10 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        lrVar.h1();
                    } else if (i10 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        lrVar.h1();
                    } else {
                        if (i10 == 12) {
                            boolean z13 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z13;
                            tL_chatBannedRights.send_gifs = z13;
                            tL_chatBannedRights.send_games = z13;
                            tL_chatBannedRights.send_stickers = z13;
                            lrVar.h1();
                        } else if (i10 == 14) {
                            if (!tL_chatBannedRights.send_plain && !lrVar.f35757n2.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                lrVar.h1();
                            } else {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= lrVar.P1.D.size()) {
                                        break;
                                    }
                                    x31 G2 = lrVar.P1.G(i14);
                                    if (G2.f54531a == 39 && G2.d == 0) {
                                        v4.d1 K = lrVar.f36277k1.K(i14 + 1);
                                        if (K != null) {
                                            View view2 = K.f57043a;
                                            float f12 = -lrVar.f35767x2;
                                            lrVar.f35767x2 = f12;
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
                            lrVar.h1();
                        } else {
                            z9 = true;
                            if (i10 == 101) {
                                lrVar.f35764u2 = !lrVar.f35764u2;
                                lrVar.g1();
                            } else if (i10 == 102) {
                                lrVar.f35765v2 = !lrVar.f35765v2;
                                lrVar.c1();
                            }
                        }
                        z9 = true;
                    }
                }
                lrVar.P1.O(z9);
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void run(long j3) {
        switch (this.f33637a) {
            case 5:
                lr lrVar = this.f33638b;
                lrVar.getClass();
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.an.ra(j3));
                }
                lrVar.dismiss();
                return;
            default:
                lr lrVar2 = this.f33638b;
                lrVar2.getClass();
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.an.ra(j3));
                }
                lrVar2.dismiss();
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
