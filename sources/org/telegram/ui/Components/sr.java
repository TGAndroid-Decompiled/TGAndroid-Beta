package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class sr implements org.telegram.messenger.z10, rj0, org.telegram.messenger.or {
    public final int f39691a;
    public final xr f39692b;

    public sr(xr xrVar, int i7) {
        this.f39691a = i7;
        this.f39692b = xrVar;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void a(int r18, org.telegram.tgnet.TLObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sr.a(int, org.telegram.tgnet.TLObject):void");
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        boolean z10;
        boolean[] zArr;
        xr xrVar = this.f39692b;
        n41 G = xrVar.T1.G(i7 - 1);
        if (G != null) {
            wr wrVar = xrVar.f42142g2;
            wr wrVar2 = xrVar.f42141f2;
            wr wrVar3 = xrVar.f42140e2;
            wr wrVar4 = xrVar.f42143h2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = xrVar.f42154s2;
            int i10 = G.d;
            if (i10 == 103) {
                boolean z11 = !xrVar.f42147l2;
                xrVar.f42147l2 = z11;
                ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                return;
            }
            int i11 = G.f56712a;
            if (i11 == 37) {
                int i12 = i10 >>> 24;
                int i13 = 16777215 & i10;
                if (i12 == 0) {
                    wrVar3.g(i13);
                } else if (i12 == 1) {
                    wrVar2.g(i13);
                    xrVar.h1();
                } else if (i10 == 3) {
                    wrVar.g(i13);
                    xrVar.h1();
                } else if (i12 == 2) {
                    wrVar4.g(i13);
                }
            } else if (i11 != 36 && i11 != 35) {
                if (i11 == 39) {
                    if (G.f37663u) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xrVar.getContext());
                        String N0 = org.telegram.messenger.gd.N0(2131743472, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.N0(2131743471, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                        t1Var.show();
                        return;
                    }
                    if (i10 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        xrVar.i1();
                    } else if (i10 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        xrVar.i1();
                    } else if (i10 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        xrVar.i1();
                    } else if (i10 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        xrVar.i1();
                    } else if (i10 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        xrVar.i1();
                    }
                    xrVar.T1.O(true);
                } else if (i11 == 40) {
                    xrVar.f42156u2 = !xrVar.f42156u2;
                    xrVar.Y0();
                    xrVar.T1.O(true);
                    xrVar.J0();
                } else if (i10 == 100) {
                    xrVar.f42159x2 = false;
                    boolean z12 = !xrVar.f42160y2;
                    xrVar.f42160y2 = z12;
                    xrVar.f42161z2 = z12;
                    xrVar.Y0();
                    xrVar.T1.O(true);
                    xrVar.J0();
                    xrVar.h1();
                } else if (i11 == 38) {
                    boolean z13 = xrVar.f42139c2;
                    xrVar.f42139c2 = !z13;
                    if (!z13) {
                        zArr = xrVar.f42145j2;
                    } else {
                        zArr = xrVar.f42144i2;
                    }
                    if (wrVar4.f41710g != 0) {
                        wrVar4.f41708e = zArr;
                        wrVar4.h();
                        wrVar4.i();
                    }
                    xrVar.T1.O(true);
                    xrVar.i1();
                }
            } else if (i10 == 0) {
                wrVar3.f();
            } else if (i10 == 1) {
                wrVar2.f();
                xrVar.h1();
            } else if (i10 == 3) {
                wrVar.f();
                xrVar.h1();
            } else if (i10 == 2) {
                wrVar4.f();
            } else if (i11 == 35) {
                if (G.f37663u) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xrVar.getContext());
                    String N02 = org.telegram.messenger.gd.N0(2131743472, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                    t1Var2.S = N02;
                    t1Var2.U = org.telegram.messenger.gd.N0(2131743471, null);
                    alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                    t1Var2.show();
                    return;
                }
                if (i10 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    xrVar.i1();
                } else {
                    z10 = true;
                    if (i10 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        xrVar.i1();
                    } else if (i10 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        xrVar.i1();
                    } else if (i10 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        xrVar.i1();
                    } else if (i10 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        xrVar.i1();
                    } else if (i10 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        xrVar.i1();
                    } else if (i10 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        xrVar.i1();
                    } else {
                        if (i10 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            xrVar.i1();
                        } else if (i10 == 14) {
                            if (!tL_chatBannedRights.send_plain && !xrVar.f42153r2.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                xrVar.i1();
                            } else {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= xrVar.T1.E.size()) {
                                        break;
                                    }
                                    n41 G2 = xrVar.T1.G(i14);
                                    if (G2.f56712a == 39 && G2.d == 0) {
                                        v4.f1 K = xrVar.f39246o1.K(i14 + 1);
                                        if (K != null) {
                                            View view2 = K.f59245a;
                                            float f12 = -xrVar.B2;
                                            xrVar.B2 = f12;
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
                            xrVar.i1();
                        } else {
                            z10 = true;
                            if (i10 == 101) {
                                xrVar.f42160y2 = !xrVar.f42160y2;
                                xrVar.h1();
                            } else if (i10 == 102) {
                                xrVar.f42161z2 = !xrVar.f42161z2;
                                xrVar.d1();
                            }
                        }
                        z10 = true;
                    }
                }
                xrVar.T1.O(z10);
            }
        }
    }

    @Override
    public void run(long j3) {
        switch (this.f39691a) {
            case 5:
                xr xrVar = this.f39692b;
                xrVar.getClass();
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                xrVar.dismiss();
                return;
            default:
                xr xrVar2 = this.f39692b;
                xrVar2.getClass();
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.bn.ua(j3));
                }
                xrVar2.dismiss();
                return;
        }
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
