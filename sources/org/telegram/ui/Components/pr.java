package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class pr implements org.telegram.messenger.t20, hk0, org.telegram.messenger.cs {
    public final int f29407a;
    public final vr f29408b;

    public pr(vr vrVar, int i10) {
        this.f29407a = i10;
        this.f29408b = vrVar;
    }

    @Override
    public void a(int r18, org.telegram.tgnet.TLObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pr.a(int, org.telegram.tgnet.TLObject):void");
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        vr vrVar = this.f29408b;
        a51 G = vrVar.P1.G(i10 - 1);
        if (G != null) {
            ur urVar = vrVar.f31812c2;
            ur urVar2 = vrVar.f31811b2;
            ur urVar3 = vrVar.a2;
            ur urVar4 = vrVar.f31813d2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = vrVar.f31824o2;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !vrVar.f31817h2;
                vrVar.f31817h2 = z11;
                ((org.telegram.ui.Cells.s8) view).setChecked(z11);
                return;
            }
            int i12 = G.f7680a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    urVar3.g(i14);
                } else if (i13 == 1) {
                    urVar2.g(i14);
                    vrVar.g1();
                } else if (i11 == 3) {
                    urVar.g(i14);
                    vrVar.g1();
                } else if (i13 == 2) {
                    urVar4.g(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f24300t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vrVar.getContext());
                        String L0 = org.telegram.messenger.cd.L0(2131743745, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131743744, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        x1Var.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        vrVar.h1();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        vrVar.h1();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        vrVar.h1();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        vrVar.h1();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        vrVar.h1();
                    }
                    vrVar.P1.O(true);
                } else if (i12 == 40) {
                    vrVar.f31826q2 = !vrVar.f31826q2;
                    vrVar.X0();
                    vrVar.P1.O(true);
                    vrVar.I0();
                } else if (i11 == 100) {
                    vrVar.f31829t2 = false;
                    boolean z12 = !vrVar.f31830u2;
                    vrVar.f31830u2 = z12;
                    vrVar.f31831v2 = z12;
                    vrVar.X0();
                    vrVar.P1.O(true);
                    vrVar.I0();
                    vrVar.c1();
                } else if (i12 == 38) {
                    boolean z13 = vrVar.Y1;
                    vrVar.Y1 = !z13;
                    if (!z13) {
                        zArr = vrVar.f31815f2;
                    } else {
                        zArr = vrVar.f31814e2;
                    }
                    if (urVar4.f31017g != 0) {
                        urVar4.e = zArr;
                        urVar4.h();
                        urVar4.i();
                    }
                    vrVar.P1.O(true);
                    vrVar.h1();
                }
            } else if (i11 == 0) {
                urVar3.f();
            } else if (i11 == 1) {
                urVar2.f();
                vrVar.g1();
            } else if (i11 == 3) {
                urVar.f();
                vrVar.g1();
            } else if (i11 == 2) {
                urVar4.f();
            } else if (i12 == 35) {
                if (G.f24300t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vrVar.getContext());
                    String L02 = org.telegram.messenger.cd.L0(2131743745, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                    x1Var2.R = L02;
                    x1Var2.T = org.telegram.messenger.cd.L0(2131743744, null);
                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                    x1Var2.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    vrVar.h1();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        vrVar.h1();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        vrVar.h1();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        vrVar.h1();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        vrVar.h1();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        vrVar.h1();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        vrVar.h1();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            vrVar.h1();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !vrVar.f31823n2.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                vrVar.h1();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= vrVar.P1.D.size()) {
                                        break;
                                    }
                                    a51 G2 = vrVar.P1.G(i15);
                                    if (G2.f7680a == 39 && G2.d == 0) {
                                        s4.c1 K = vrVar.f26666k1.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f47898a;
                                            float f11 = -vrVar.f31833x2;
                                            vrVar.f31833x2 = f11;
                                            org.telegram.messenger.i0.F3(f11, view2, null);
                                        }
                                    } else {
                                        i15++;
                                    }
                                }
                                org.telegram.messenger.t2.APP_ERROR.a();
                                return;
                            }
                        } else if (i11 == 13) {
                            z10 = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            vrVar.h1();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                vrVar.f31830u2 = !vrVar.f31830u2;
                                vrVar.c1();
                            } else if (i11 == 102) {
                                vrVar.f31831v2 = !vrVar.f31831v2;
                                vrVar.c1();
                            }
                        }
                        z10 = true;
                    }
                }
                vrVar.P1.O(z10);
            }
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void run(long j10) {
        switch (this.f29407a) {
            case 5:
                vr vrVar = this.f29408b;
                vrVar.getClass();
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(org.telegram.ui.un.ha(j10));
                }
                vrVar.dismiss();
                return;
            default:
                vr vrVar2 = this.f29408b;
                vrVar2.getClass();
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(org.telegram.ui.un.ha(j10));
                }
                vrVar2.dismiss();
                return;
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
