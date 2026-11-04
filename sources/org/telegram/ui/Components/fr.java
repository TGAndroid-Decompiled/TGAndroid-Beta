package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class fr implements org.telegram.messenger.x10, gj0, org.telegram.messenger.lr {
    public final int f33854a;
    public final lr f33855b;

    public fr(lr lrVar, int i3) {
        this.f33854a = i3;
        this.f33855b = lrVar;
    }

    @Override
    public void a(int r18, org.telegram.tgnet.TLObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fr.a(int, org.telegram.tgnet.TLObject):void");
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        boolean z10;
        boolean[] zArr;
        lr lrVar = this.f33855b;
        r31 G = lrVar.Q1.G(i3 - 1);
        if (G != null) {
            kr krVar = lrVar.f35829d2;
            kr krVar2 = lrVar.c2;
            kr krVar3 = lrVar.f35828b2;
            kr krVar4 = lrVar.f35830e2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.f35841p2;
            int i10 = G.d;
            if (i10 == 103) {
                boolean z11 = !lrVar.f35834i2;
                lrVar.f35834i2 = z11;
                ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                return;
            }
            int i11 = G.f54715a;
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
                    if (G.f37635t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lrVar.getContext());
                        String M0 = org.telegram.messenger.bd.M0(2131743729, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131743728, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        s1Var.show();
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
                    lrVar.Q1.O(true);
                } else if (i11 == 40) {
                    lrVar.f35843r2 = !lrVar.f35843r2;
                    lrVar.X0();
                    lrVar.Q1.O(true);
                    lrVar.I0();
                } else if (i10 == 100) {
                    lrVar.f35846u2 = false;
                    boolean z12 = !lrVar.f35847v2;
                    lrVar.f35847v2 = z12;
                    lrVar.f35848w2 = z12;
                    lrVar.X0();
                    lrVar.Q1.O(true);
                    lrVar.I0();
                    lrVar.g1();
                } else if (i11 == 38) {
                    boolean z13 = lrVar.Z1;
                    lrVar.Z1 = !z13;
                    if (!z13) {
                        zArr = lrVar.f35832g2;
                    } else {
                        zArr = lrVar.f35831f2;
                    }
                    if (krVar4.f35467g != 0) {
                        krVar4.f35465e = zArr;
                        krVar4.h();
                        krVar4.i();
                    }
                    lrVar.Q1.O(true);
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
                if (G.f37635t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(lrVar.getContext());
                    String M02 = org.telegram.messenger.bd.M0(2131743729, null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.S = M02;
                    s1Var2.U = org.telegram.messenger.bd.M0(2131743728, null);
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                    s1Var2.show();
                    return;
                }
                if (i10 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    lrVar.h1();
                } else {
                    z10 = true;
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
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            lrVar.h1();
                        } else if (i10 == 14) {
                            if (!tL_chatBannedRights.send_plain && !lrVar.f35840o2.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                lrVar.h1();
                            } else {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= lrVar.Q1.E.size()) {
                                        break;
                                    }
                                    r31 G2 = lrVar.Q1.G(i14);
                                    if (G2.f54715a == 39 && G2.d == 0) {
                                        u4.d1 K = lrVar.f36102l1.K(i14 + 1);
                                        if (K != null) {
                                            View view2 = K.f55540a;
                                            float f12 = -lrVar.f35850y2;
                                            lrVar.f35850y2 = f12;
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
                            z10 = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            lrVar.h1();
                        } else {
                            z10 = true;
                            if (i10 == 101) {
                                lrVar.f35847v2 = !lrVar.f35847v2;
                                lrVar.g1();
                            } else if (i10 == 102) {
                                lrVar.f35848w2 = !lrVar.f35848w2;
                                lrVar.c1();
                            }
                        }
                        z10 = true;
                    }
                }
                lrVar.Q1.O(z10);
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void run(long j10) {
        switch (this.f33854a) {
            case 5:
                lr lrVar = this.f33855b;
                lrVar.getClass();
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.wm.ra(j10));
                }
                lrVar.dismiss();
                return;
            default:
                lr lrVar2 = this.f33855b;
                lrVar2.getClass();
                org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.wm.ra(j10));
                }
                lrVar2.dismiss();
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
