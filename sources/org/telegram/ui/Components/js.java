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
public final class js implements MessagesStorage.LongCallback, am0 {
    public final int f27793a;
    public final ns f27794b;

    public js(ns nsVar, int i10) {
        this.f27793a = i10;
        this.f27794b = nsVar;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        ns nsVar = this.f27794b;
        l61 G = nsVar.X.G(i10 - 1);
        if (G != null) {
            ms msVar = nsVar.f29014k0;
            ms msVar2 = nsVar.f29013j0;
            ms msVar3 = nsVar.f29012i0;
            ms msVar4 = nsVar.f29015l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = nsVar.f29025w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !nsVar.f29018p0;
                nsVar.f29018p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f44712a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    msVar3.e(i14);
                } else if (i13 == 1) {
                    msVar2.e(i14);
                    nsVar.U();
                } else if (i11 == 3) {
                    msVar.e(i14);
                    nsVar.U();
                } else if (i13 == 2) {
                    msVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f28235t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nsVar.getContext());
                        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20679a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        nsVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        nsVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        nsVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        nsVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        nsVar.V();
                    }
                    nsVar.X.N(true);
                } else if (i12 == 40) {
                    nsVar.f29027y0 = !nsVar.f29027y0;
                    nsVar.J();
                    nsVar.X.N(true);
                    nsVar.t();
                } else if (i11 == 100) {
                    nsVar.B0 = false;
                    boolean z12 = !nsVar.C0;
                    nsVar.C0 = z12;
                    nsVar.D0 = z12;
                    nsVar.J();
                    nsVar.X.N(true);
                    nsVar.t();
                    nsVar.O();
                } else if (i12 == 38) {
                    boolean z13 = nsVar.f29010g0;
                    nsVar.f29010g0 = !z13;
                    if (!z13) {
                        zArr = nsVar.f29016n0;
                    } else {
                        zArr = nsVar.m0;
                    }
                    if (msVar4.f28691g != 0) {
                        msVar4.e = zArr;
                        msVar4.f();
                        msVar4.g();
                    }
                    nsVar.X.N(true);
                    nsVar.V();
                }
            } else if (i11 == 0) {
                msVar3.d();
            } else if (i11 == 1) {
                msVar2.d();
                nsVar.U();
            } else if (i11 == 3) {
                msVar.d();
                nsVar.U();
            } else if (i11 == 2) {
                msVar4.d();
            } else if (i12 == 35) {
                if (G.f28235t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(nsVar.getContext());
                    alertDialog$Builder2.f20679a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f20679a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f20679a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    nsVar.V();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        nsVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        nsVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        nsVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        nsVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        nsVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        nsVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            nsVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !nsVar.f29024v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                nsVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= nsVar.X.f24650y.size()) {
                                        break;
                                    }
                                    l61 G2 = nsVar.X.G(i15);
                                    if (G2.f44712a == 39 && G2.d == 0) {
                                        s4.b1 K = nsVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f46342a;
                                            float f11 = -nsVar.F0;
                                            nsVar.F0 = f11;
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
                            nsVar.V();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                nsVar.C0 = !nsVar.C0;
                                nsVar.O();
                            } else if (i11 == 102) {
                                nsVar.D0 = !nsVar.D0;
                                nsVar.O();
                            }
                        }
                        z10 = true;
                    }
                }
                nsVar.X.N(z10);
            }
        }
    }

    @Override
    public void run(long j10) {
        switch (this.f27793a) {
            case 0:
                ns nsVar = this.f27794b;
                nsVar.getClass();
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.sn.W9(j10));
                }
                nsVar.dismiss();
                return;
            default:
                ns nsVar2 = this.f27794b;
                nsVar2.getClass();
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.sn.W9(j10));
                }
                nsVar2.dismiss();
                return;
        }
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
