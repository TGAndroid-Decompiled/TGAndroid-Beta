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
public final class ds implements MessagesStorage.LongCallback, ml0 {
    public final int f23741a;
    public final hs f23742b;

    public ds(hs hsVar, int i10) {
        this.f23741a = i10;
        this.f23742b = hsVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        hs hsVar = this.f23742b;
        w51 G = hsVar.X.G(i10 - 1);
        if (G != null) {
            gs gsVar = hsVar.f24852k0;
            gs gsVar2 = hsVar.f24851j0;
            gs gsVar3 = hsVar.f24850i0;
            gs gsVar4 = hsVar.f24853l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = hsVar.f24863w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !hsVar.f24856p0;
                hsVar.f24856p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f15715a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    gsVar3.e(i14);
                } else if (i13 == 1) {
                    gsVar2.e(i14);
                    hsVar.U();
                } else if (i11 == 3) {
                    gsVar.e(i14);
                    hsVar.U();
                } else if (i13 == 2) {
                    gsVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f29903t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hsVar.getContext());
                        alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f18661a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        hsVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        hsVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        hsVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        hsVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        hsVar.V();
                    }
                    hsVar.X.N(true);
                } else if (i12 == 40) {
                    hsVar.f24865y0 = !hsVar.f24865y0;
                    hsVar.J();
                    hsVar.X.N(true);
                    hsVar.s();
                } else if (i11 == 100) {
                    hsVar.B0 = false;
                    boolean z12 = !hsVar.C0;
                    hsVar.C0 = z12;
                    hsVar.D0 = z12;
                    hsVar.J();
                    hsVar.X.N(true);
                    hsVar.s();
                    hsVar.O();
                } else if (i12 == 38) {
                    boolean z13 = hsVar.f24848g0;
                    hsVar.f24848g0 = !z13;
                    if (!z13) {
                        zArr = hsVar.f24854n0;
                    } else {
                        zArr = hsVar.m0;
                    }
                    if (gsVar4.f24580g != 0) {
                        gsVar4.e = zArr;
                        gsVar4.f();
                        gsVar4.g();
                    }
                    hsVar.X.N(true);
                    hsVar.V();
                }
            } else if (i11 == 0) {
                gsVar3.d();
            } else if (i11 == 1) {
                gsVar2.d();
                hsVar.U();
            } else if (i11 == 3) {
                gsVar.d();
                hsVar.U();
            } else if (i11 == 2) {
                gsVar4.d();
            } else if (i12 == 35) {
                if (G.f29903t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hsVar.getContext());
                    alertDialog$Builder2.f18661a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f18661a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f18661a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    hsVar.V();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        hsVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        hsVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        hsVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        hsVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        hsVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        hsVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            hsVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !hsVar.f24862v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                hsVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= hsVar.X.f25647x.size()) {
                                        break;
                                    }
                                    w51 G2 = hsVar.X.G(i15);
                                    if (G2.f15715a == 39 && G2.d == 0) {
                                        s4.c1 K = hsVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f42959a;
                                            float f11 = -hsVar.F0;
                                            hsVar.F0 = f11;
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
                            hsVar.V();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                hsVar.C0 = !hsVar.C0;
                                hsVar.O();
                            } else if (i11 == 102) {
                                hsVar.D0 = !hsVar.D0;
                                hsVar.O();
                            }
                        }
                        z10 = true;
                    }
                }
                hsVar.X.N(z10);
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(long j3) {
        switch (this.f23741a) {
            case 0:
                hs hsVar = this.f23742b;
                hsVar.getClass();
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.wn.R9(j3));
                }
                hsVar.dismiss();
                return;
            default:
                hs hsVar2 = this.f23742b;
                hsVar2.getClass();
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.wn.R9(j3));
                }
                hsVar2.dismiss();
                return;
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
