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
public final class ls implements MessagesStorage.LongCallback, bm0 {
    public final int f28419a;
    public final ps f28420b;

    public ls(ps psVar, int i10) {
        this.f28419a = i10;
        this.f28420b = psVar;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        ps psVar = this.f28420b;
        m61 G = psVar.X.G(i10 - 1);
        if (G != null) {
            os osVar = psVar.f29651k0;
            os osVar2 = psVar.f29650j0;
            os osVar3 = psVar.f29649i0;
            os osVar4 = psVar.f29652l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = psVar.f29662w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !psVar.f29655p0;
                psVar.f29655p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f44713a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    osVar3.e(i14);
                } else if (i13 == 1) {
                    osVar2.e(i14);
                    psVar.U();
                } else if (i11 == 3) {
                    osVar.e(i14);
                    psVar.U();
                } else if (i13 == 2) {
                    osVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f28567t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(psVar.getContext());
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20678a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        psVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        psVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        psVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        psVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        psVar.V();
                    }
                    psVar.X.N(true);
                } else if (i12 == 40) {
                    psVar.f29664y0 = !psVar.f29664y0;
                    psVar.J();
                    psVar.X.N(true);
                    psVar.t();
                } else if (i11 == 100) {
                    psVar.B0 = false;
                    boolean z12 = !psVar.C0;
                    psVar.C0 = z12;
                    psVar.D0 = z12;
                    psVar.J();
                    psVar.X.N(true);
                    psVar.t();
                    psVar.O();
                } else if (i12 == 38) {
                    boolean z13 = psVar.f29647g0;
                    psVar.f29647g0 = !z13;
                    if (!z13) {
                        zArr = psVar.f29653n0;
                    } else {
                        zArr = psVar.m0;
                    }
                    if (osVar4.f29305g != 0) {
                        osVar4.e = zArr;
                        osVar4.f();
                        osVar4.g();
                    }
                    psVar.X.N(true);
                    psVar.V();
                }
            } else if (i11 == 0) {
                osVar3.d();
            } else if (i11 == 1) {
                osVar2.d();
                psVar.U();
            } else if (i11 == 3) {
                osVar.d();
                psVar.U();
            } else if (i11 == 2) {
                osVar4.d();
            } else if (i12 == 35) {
                if (G.f28567t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(psVar.getContext());
                    alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f20678a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    psVar.V();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        psVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        psVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        psVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        psVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        psVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        psVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            psVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !psVar.f29661v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                psVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= psVar.X.f24976y.size()) {
                                        break;
                                    }
                                    m61 G2 = psVar.X.G(i15);
                                    if (G2.f44713a == 39 && G2.d == 0) {
                                        s4.b1 K = psVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f46343a;
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
                            psVar.V();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                psVar.C0 = !psVar.C0;
                                psVar.O();
                            } else if (i11 == 102) {
                                psVar.D0 = !psVar.D0;
                                psVar.O();
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
        switch (this.f28419a) {
            case 0:
                ps psVar = this.f28420b;
                psVar.getClass();
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.sn.W9(j10));
                }
                psVar.dismiss();
                return;
            default:
                ps psVar2 = this.f28420b;
                psVar2.getClass();
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
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
