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
public final class zr implements MessagesStorage.LongCallback, il0 {
    public final int f31459a;
    public final ds f31460b;

    public zr(ds dsVar, int i10) {
        this.f31459a = i10;
        this.f31460b = dsVar;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        boolean z4;
        boolean[] zArr;
        ds dsVar = this.f31460b;
        i51 G = dsVar.U.G(i10 - 1);
        if (G != null) {
            cs csVar = dsVar.f24355h0;
            cs csVar2 = dsVar.f24354g0;
            cs csVar3 = dsVar.f24353f0;
            cs csVar4 = dsVar.f24356i0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = dsVar.f24366t0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z10 = !dsVar.m0;
                dsVar.m0 = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                return;
            }
            int i12 = G.f1830a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    csVar3.e(i14);
                } else if (i13 == 1) {
                    csVar2.e(i14);
                    dsVar.U();
                } else if (i11 == 3) {
                    csVar.e(i14);
                    dsVar.U();
                } else if (i13 == 2) {
                    csVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f25593t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dsVar.getContext());
                        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f19478a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        dsVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        dsVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        dsVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        dsVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        dsVar.V();
                    }
                    dsVar.U.N(true);
                } else if (i12 == 40) {
                    dsVar.f24368v0 = !dsVar.f24368v0;
                    dsVar.I();
                    dsVar.U.N(true);
                    dsVar.s();
                } else if (i11 == 100) {
                    dsVar.f24371y0 = false;
                    boolean z11 = !dsVar.f24372z0;
                    dsVar.f24372z0 = z11;
                    dsVar.A0 = z11;
                    dsVar.I();
                    dsVar.U.N(true);
                    dsVar.s();
                    dsVar.O();
                } else if (i12 == 38) {
                    boolean z12 = dsVar.f24351d0;
                    dsVar.f24351d0 = !z12;
                    if (!z12) {
                        zArr = dsVar.f24358k0;
                    } else {
                        zArr = dsVar.f24357j0;
                    }
                    if (csVar4.f24022g != 0) {
                        csVar4.e = zArr;
                        csVar4.f();
                        csVar4.g();
                    }
                    dsVar.U.N(true);
                    dsVar.V();
                }
            } else if (i11 == 0) {
                csVar3.d();
            } else if (i11 == 1) {
                csVar2.d();
                dsVar.U();
            } else if (i11 == 3) {
                csVar.d();
                dsVar.U();
            } else if (i11 == 2) {
                csVar4.d();
            } else if (i12 == 35) {
                if (G.f25593t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dsVar.getContext());
                    alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f19478a.show();
                    return;
                }
                if (i11 == 6) {
                    z4 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    dsVar.V();
                } else {
                    z4 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        dsVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        dsVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        dsVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        dsVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        dsVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        dsVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z13 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z13;
                            tL_chatBannedRights.send_gifs = z13;
                            tL_chatBannedRights.send_games = z13;
                            tL_chatBannedRights.send_stickers = z13;
                            dsVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !dsVar.f24365s0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                dsVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= dsVar.U.f30151x.size()) {
                                        break;
                                    }
                                    i51 G2 = dsVar.U.G(i15);
                                    if (G2.f1830a == 39 && G2.d == 0) {
                                        f2.l1 K = dsVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f5774a;
                                            float f12 = -dsVar.C0;
                                            dsVar.C0 = f12;
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
                            dsVar.V();
                        } else {
                            z4 = true;
                            if (i11 == 101) {
                                dsVar.f24372z0 = !dsVar.f24372z0;
                                dsVar.O();
                            } else if (i11 == 102) {
                                dsVar.A0 = !dsVar.A0;
                                dsVar.O();
                            }
                        }
                        z4 = true;
                    }
                }
                dsVar.U.N(z4);
            }
        }
    }

    @Override
    public void run(long j10) {
        switch (this.f31459a) {
            case 0:
                ds dsVar = this.f31460b;
                dsVar.getClass();
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.zn.R9(j10));
                }
                dsVar.dismiss();
                return;
            default:
                ds dsVar2 = this.f31460b;
                dsVar2.getClass();
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.zn.R9(j10));
                }
                dsVar2.dismiss();
                return;
        }
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
