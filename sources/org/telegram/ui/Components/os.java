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
public final class os implements MessagesStorage.LongCallback, bm0 {
    public final int f28040a;
    public final ss f28041b;

    public os(ss ssVar, int i10) {
        this.f28040a = i10;
        this.f28041b = ssVar;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        ss ssVar = this.f28041b;
        l61 G = ssVar.X.G(i10 - 1);
        if (G != null) {
            rs rsVar = ssVar.f29195k0;
            rs rsVar2 = ssVar.f29194j0;
            rs rsVar3 = ssVar.f29193i0;
            rs rsVar4 = ssVar.f29196l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = ssVar.f29206w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !ssVar.f29199p0;
                ssVar.f29199p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f43203a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    rsVar3.e(i14);
                } else if (i13 == 1) {
                    rsVar2.e(i14);
                    ssVar.V();
                } else if (i11 == 3) {
                    rsVar.e(i14);
                    ssVar.V();
                } else if (i13 == 2) {
                    rsVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f26962t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ssVar.getContext());
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f19548a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        ssVar.W();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        ssVar.W();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        ssVar.W();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        ssVar.W();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        ssVar.W();
                    }
                    ssVar.X.N(true);
                } else if (i12 == 40) {
                    ssVar.f29208y0 = !ssVar.f29208y0;
                    ssVar.K();
                    ssVar.X.N(true);
                    ssVar.u();
                } else if (i11 == 100) {
                    ssVar.B0 = false;
                    boolean z12 = !ssVar.C0;
                    ssVar.C0 = z12;
                    ssVar.D0 = z12;
                    ssVar.K();
                    ssVar.X.N(true);
                    ssVar.u();
                    ssVar.P();
                } else if (i12 == 38) {
                    boolean z13 = ssVar.f29191g0;
                    ssVar.f29191g0 = !z13;
                    if (!z13) {
                        zArr = ssVar.f29197n0;
                    } else {
                        zArr = ssVar.m0;
                    }
                    if (rsVar4.f28936g != 0) {
                        rsVar4.e = zArr;
                        rsVar4.f();
                        rsVar4.g();
                    }
                    ssVar.X.N(true);
                    ssVar.W();
                }
            } else if (i11 == 0) {
                rsVar3.d();
            } else if (i11 == 1) {
                rsVar2.d();
                ssVar.V();
            } else if (i11 == 3) {
                rsVar.d();
                ssVar.V();
            } else if (i11 == 2) {
                rsVar4.d();
            } else if (i12 == 35) {
                if (G.f26962t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ssVar.getContext());
                    alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f19548a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    ssVar.W();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        ssVar.W();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        ssVar.W();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        ssVar.W();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        ssVar.W();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        ssVar.W();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        ssVar.W();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            ssVar.W();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !ssVar.f29205v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                ssVar.W();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= ssVar.X.f31783x.size()) {
                                        break;
                                    }
                                    l61 G2 = ssVar.X.G(i15);
                                    if (G2.f43203a == 39 && G2.d == 0) {
                                        s4.b1 K = ssVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f44838a;
                                            float f11 = -ssVar.F0;
                                            ssVar.F0 = f11;
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
                            ssVar.W();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                ssVar.C0 = !ssVar.C0;
                                ssVar.P();
                            } else if (i11 == 102) {
                                ssVar.D0 = !ssVar.D0;
                                ssVar.P();
                            }
                        }
                        z10 = true;
                    }
                }
                ssVar.X.N(z10);
            }
        }
    }

    @Override
    public void run(long j10) {
        switch (this.f28040a) {
            case 0:
                ss ssVar = this.f28041b;
                ssVar.getClass();
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.fo.W9(j10));
                }
                ssVar.dismiss();
                return;
            default:
                ss ssVar2 = this.f28041b;
                ssVar2.getClass();
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.fo.W9(j10));
                }
                ssVar2.dismiss();
                return;
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
