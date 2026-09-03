package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class cs implements MessagesStorage.LongCallback, jl0 {
    public final int f26033a;
    public final gs f26034b;

    public cs(gs gsVar, int i10) {
        this.f26033a = i10;
        this.f26034b = gsVar;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        boolean z4;
        boolean[] zArr;
        gs gsVar = this.f26034b;
        h51 G = gsVar.U.G(i10 - 1);
        if (G != null) {
            fs fsVar = gsVar.f27249h0;
            fs fsVar2 = gsVar.f27248g0;
            fs fsVar3 = gsVar.f27247f0;
            fs fsVar4 = gsVar.f27250i0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = gsVar.f27260t0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z10 = !gsVar.m0;
                gsVar.m0 = z10;
                ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                return;
            }
            int i12 = G.f2505a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    fsVar3.e(i14);
                } else if (i13 == 1) {
                    fsVar2.e(i14);
                    gsVar.U();
                } else if (i11 == 3) {
                    fsVar.e(i14);
                    gsVar.U();
                } else if (i13 == 2) {
                    fsVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f27383t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gsVar.getContext());
                        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f21168a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        gsVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        gsVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        gsVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        gsVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        gsVar.V();
                    }
                    gsVar.U.N(true);
                } else if (i12 == 40) {
                    gsVar.f27262v0 = !gsVar.f27262v0;
                    gsVar.I();
                    gsVar.U.N(true);
                    gsVar.s();
                } else if (i11 == 100) {
                    gsVar.f27265y0 = false;
                    boolean z11 = !gsVar.f27266z0;
                    gsVar.f27266z0 = z11;
                    gsVar.A0 = z11;
                    gsVar.I();
                    gsVar.U.N(true);
                    gsVar.s();
                    gsVar.O();
                } else if (i12 == 38) {
                    boolean z12 = gsVar.f27245d0;
                    gsVar.f27245d0 = !z12;
                    if (!z12) {
                        zArr = gsVar.f27252k0;
                    } else {
                        zArr = gsVar.f27251j0;
                    }
                    if (fsVar4.f26992g != 0) {
                        fsVar4.f26990e = zArr;
                        fsVar4.f();
                        fsVar4.g();
                    }
                    gsVar.U.N(true);
                    gsVar.V();
                }
            } else if (i11 == 0) {
                fsVar3.d();
            } else if (i11 == 1) {
                fsVar2.d();
                gsVar.U();
            } else if (i11 == 3) {
                fsVar.d();
                gsVar.U();
            } else if (i11 == 2) {
                fsVar4.d();
            } else if (i12 == 35) {
                if (G.f27383t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gsVar.getContext());
                    alertDialog$Builder2.f21168a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f21168a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f21168a.show();
                    return;
                }
                if (i11 == 6) {
                    z4 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    gsVar.V();
                } else {
                    z4 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        gsVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        gsVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        gsVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        gsVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        gsVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        gsVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z13 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z13;
                            tL_chatBannedRights.send_gifs = z13;
                            tL_chatBannedRights.send_games = z13;
                            tL_chatBannedRights.send_stickers = z13;
                            gsVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !gsVar.f27259s0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                gsVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= gsVar.U.f32654x.size()) {
                                        break;
                                    }
                                    h51 G2 = gsVar.U.G(i15);
                                    if (G2.f2505a == 39 && G2.d == 0) {
                                        f2.m1 K = gsVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f5875a;
                                            float f12 = -gsVar.C0;
                                            gsVar.C0 = f12;
                                            AndroidUtilities.shakeViewSpring(view2, f12);
                                        }
                                    } else {
                                        i15++;
                                    }
                                }
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                return;
                            }
                        } else if (i11 == 13) {
                            z4 = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            gsVar.V();
                        } else {
                            z4 = true;
                            if (i11 == 101) {
                                gsVar.f27266z0 = !gsVar.f27266z0;
                                gsVar.O();
                            } else if (i11 == 102) {
                                gsVar.A0 = !gsVar.A0;
                                gsVar.O();
                            }
                        }
                        z4 = true;
                    }
                }
                gsVar.U.N(z4);
            }
        }
    }

    @Override
    public void run(long j10) {
        switch (this.f26033a) {
            case 0:
                gs gsVar = this.f26034b;
                gsVar.getClass();
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.xn.R9(j10));
                }
                gsVar.dismiss();
                return;
            default:
                gs gsVar2 = this.f26034b;
                gsVar2.getClass();
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.xn.R9(j10));
                }
                gsVar2.dismiss();
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
