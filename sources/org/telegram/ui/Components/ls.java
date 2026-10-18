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
public final class ls implements MessagesStorage.LongCallback, xl0 {
    public final int f28316a;
    public final ps f28317b;

    public ls(ps psVar, int i10) {
        this.f28316a = i10;
        this.f28317b = psVar;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        ps psVar = this.f28317b;
        f61 G = psVar.X.G(i10 - 1);
        if (G != null) {
            os osVar = psVar.f29413k0;
            os osVar2 = psVar.f29412j0;
            os osVar3 = psVar.f29411i0;
            os osVar4 = psVar.f29414l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = psVar.f29424w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !psVar.f29417p0;
                psVar.f29417p0 = z11;
                ((org.telegram.ui.Cells.u8) view).setChecked(z11);
                return;
            }
            int i12 = G.f44291a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    osVar3.e(i14);
                } else if (i13 == 1) {
                    osVar2.e(i14);
                    psVar.V();
                } else if (i11 == 3) {
                    osVar.e(i14);
                    psVar.V();
                } else if (i13 == 2) {
                    osVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f26148t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(psVar.getContext());
                        alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20601a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        psVar.W();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        psVar.W();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        psVar.W();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        psVar.W();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        psVar.W();
                    }
                    psVar.X.N(true);
                } else if (i12 == 40) {
                    psVar.f29426y0 = !psVar.f29426y0;
                    psVar.K();
                    psVar.X.N(true);
                    psVar.t();
                } else if (i11 == 100) {
                    psVar.B0 = false;
                    boolean z12 = !psVar.C0;
                    psVar.C0 = z12;
                    psVar.D0 = z12;
                    psVar.K();
                    psVar.X.N(true);
                    psVar.t();
                    psVar.P();
                } else if (i12 == 38) {
                    boolean z13 = psVar.f29409g0;
                    psVar.f29409g0 = !z13;
                    if (!z13) {
                        zArr = psVar.f29415n0;
                    } else {
                        zArr = psVar.m0;
                    }
                    if (osVar4.f29060g != 0) {
                        osVar4.e = zArr;
                        osVar4.f();
                        osVar4.g();
                    }
                    psVar.X.N(true);
                    psVar.W();
                }
            } else if (i11 == 0) {
                osVar3.d();
            } else if (i11 == 1) {
                osVar2.d();
                psVar.V();
            } else if (i11 == 3) {
                osVar.d();
                psVar.V();
            } else if (i11 == 2) {
                osVar4.d();
            } else if (i12 == 35) {
                if (G.f26148t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(psVar.getContext());
                    alertDialog$Builder2.f20601a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f20601a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f20601a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    psVar.W();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        psVar.W();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        psVar.W();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        psVar.W();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        psVar.W();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        psVar.W();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        psVar.W();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            psVar.W();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !psVar.f29423v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                psVar.W();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= psVar.X.f30204x.size()) {
                                        break;
                                    }
                                    f61 G2 = psVar.X.G(i15);
                                    if (G2.f44291a == 39 && G2.d == 0) {
                                        s4.b1 K = psVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f45910a;
                                            float f11 = -psVar.F0;
                                            psVar.F0 = f11;
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
                            psVar.W();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                psVar.C0 = !psVar.C0;
                                psVar.P();
                            } else if (i11 == 102) {
                                psVar.D0 = !psVar.D0;
                                psVar.P();
                            }
                        }
                        z10 = true;
                    }
                }
                psVar.X.N(z10);
            }
        }
    }

    @Override
    public void run(long j10) {
        switch (this.f28316a) {
            case 0:
                ps psVar = this.f28317b;
                psVar.getClass();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.sn.W9(j10));
                }
                psVar.dismiss();
                return;
            default:
                ps psVar2 = this.f28317b;
                psVar2.getClass();
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.sn.W9(j10));
                }
                psVar2.dismiss();
                return;
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
