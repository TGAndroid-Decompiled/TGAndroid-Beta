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
public final class cs implements MessagesStorage.LongCallback, ll0 {
    public final int f23383a;
    public final gs f23384b;

    public cs(gs gsVar, int i10) {
        this.f23383a = i10;
        this.f23384b = gsVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        gs gsVar = this.f23384b;
        v51 G = gsVar.X.G(i10 - 1);
        if (G != null) {
            fs fsVar = gsVar.f24513k0;
            fs fsVar2 = gsVar.f24512j0;
            fs fsVar3 = gsVar.f24511i0;
            fs fsVar4 = gsVar.f24514l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = gsVar.f24524w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !gsVar.f24517p0;
                gsVar.f24517p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f15715a;
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
                    if (G.f29056t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gsVar.getContext());
                        alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f18661a.show();
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
                    gsVar.X.N(true);
                } else if (i12 == 40) {
                    gsVar.f24526y0 = !gsVar.f24526y0;
                    gsVar.J();
                    gsVar.X.N(true);
                    gsVar.s();
                } else if (i11 == 100) {
                    gsVar.B0 = false;
                    boolean z12 = !gsVar.C0;
                    gsVar.C0 = z12;
                    gsVar.D0 = z12;
                    gsVar.J();
                    gsVar.X.N(true);
                    gsVar.s();
                    gsVar.O();
                } else if (i12 == 38) {
                    boolean z13 = gsVar.f24509g0;
                    gsVar.f24509g0 = !z13;
                    if (!z13) {
                        zArr = gsVar.f24515n0;
                    } else {
                        zArr = gsVar.m0;
                    }
                    if (fsVar4.f24267g != 0) {
                        fsVar4.e = zArr;
                        fsVar4.f();
                        fsVar4.g();
                    }
                    gsVar.X.N(true);
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
                if (G.f29056t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gsVar.getContext());
                    alertDialog$Builder2.f18661a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f18661a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f18661a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    gsVar.V();
                } else {
                    z10 = true;
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
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            gsVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !gsVar.f24523v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                gsVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= gsVar.X.f25293x.size()) {
                                        break;
                                    }
                                    v51 G2 = gsVar.X.G(i15);
                                    if (G2.f15715a == 39 && G2.d == 0) {
                                        s4.c1 K = gsVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f42960a;
                                            float f11 = -gsVar.F0;
                                            gsVar.F0 = f11;
                                            AndroidUtilities.shakeViewSpring(view2, f11);
                                        }
                                    } else {
                                        i15++;
                                    }
                                }
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                return;
                            }
                        } else if (i11 == 13) {
                            z10 = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            gsVar.V();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                gsVar.C0 = !gsVar.C0;
                                gsVar.O();
                            } else if (i11 == 102) {
                                gsVar.D0 = !gsVar.D0;
                                gsVar.O();
                            }
                        }
                        z10 = true;
                    }
                }
                gsVar.X.N(z10);
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(long j3) {
        switch (this.f23383a) {
            case 0:
                gs gsVar = this.f23384b;
                gsVar.getClass();
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.wn.R9(j3));
                }
                gsVar.dismiss();
                return;
            default:
                gs gsVar2 = this.f23384b;
                gsVar2.getClass();
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.wn.R9(j3));
                }
                gsVar2.dismiss();
                return;
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
