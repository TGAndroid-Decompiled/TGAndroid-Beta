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
public final class rs implements MessagesStorage.LongCallback, fm0 {
    public final int f30498a;
    public final vs f30499b;

    public rs(vs vsVar, int i10) {
        this.f30498a = i10;
        this.f30499b = vsVar;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        vs vsVar = this.f30499b;
        p61 G = vsVar.X.G(i10 - 1);
        if (G != null) {
            us usVar = vsVar.f32439k0;
            us usVar2 = vsVar.f32438j0;
            us usVar3 = vsVar.f32437i0;
            us usVar4 = vsVar.f32440l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = vsVar.f32450w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !vsVar.f32443p0;
                vsVar.f32443p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f17125a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    usVar3.e(i14);
                } else if (i13 == 1) {
                    usVar2.e(i14);
                    vsVar.V();
                } else if (i11 == 3) {
                    usVar.e(i14);
                    vsVar.V();
                } else if (i13 == 2) {
                    usVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f29742t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vsVar.getContext());
                        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20374a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        vsVar.W();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        vsVar.W();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        vsVar.W();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        vsVar.W();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        vsVar.W();
                    }
                    vsVar.X.N(true);
                } else if (i12 == 40) {
                    vsVar.f32452y0 = !vsVar.f32452y0;
                    vsVar.K();
                    vsVar.X.N(true);
                    vsVar.u();
                } else if (i11 == 100) {
                    vsVar.B0 = false;
                    boolean z12 = !vsVar.C0;
                    vsVar.C0 = z12;
                    vsVar.D0 = z12;
                    vsVar.K();
                    vsVar.X.N(true);
                    vsVar.u();
                    vsVar.P();
                } else if (i12 == 38) {
                    boolean z13 = vsVar.f32435g0;
                    vsVar.f32435g0 = !z13;
                    if (!z13) {
                        zArr = vsVar.f32441n0;
                    } else {
                        zArr = vsVar.m0;
                    }
                    if (usVar4.f31606g != 0) {
                        usVar4.f31604e = zArr;
                        usVar4.f();
                        usVar4.g();
                    }
                    vsVar.X.N(true);
                    vsVar.W();
                }
            } else if (i11 == 0) {
                usVar3.d();
            } else if (i11 == 1) {
                usVar2.d();
                vsVar.V();
            } else if (i11 == 3) {
                usVar.d();
                vsVar.V();
            } else if (i11 == 2) {
                usVar4.d();
            } else if (i12 == 35) {
                if (G.f29742t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vsVar.getContext());
                    alertDialog$Builder2.f20374a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f20374a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f20374a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    vsVar.W();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        vsVar.W();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        vsVar.W();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        vsVar.W();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        vsVar.W();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        vsVar.W();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        vsVar.W();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            vsVar.W();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !vsVar.f32449v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                vsVar.W();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= vsVar.X.f25283x.size()) {
                                        break;
                                    }
                                    p61 G2 = vsVar.X.G(i15);
                                    if (G2.f17125a == 39 && G2.d == 0) {
                                        s4.d1 K = vsVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f47658a;
                                            float f11 = -vsVar.F0;
                                            vsVar.F0 = f11;
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
                            vsVar.W();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                vsVar.C0 = !vsVar.C0;
                                vsVar.P();
                            } else if (i11 == 102) {
                                vsVar.D0 = !vsVar.D0;
                                vsVar.P();
                            }
                        }
                        z10 = true;
                    }
                }
                vsVar.X.N(z10);
            }
        }
    }

    @Override
    public void run(long j3) {
        switch (this.f30498a) {
            case 0:
                vs vsVar = this.f30499b;
                vsVar.getClass();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.zn.W9(j3));
                }
                vsVar.dismiss();
                return;
            default:
                vs vsVar2 = this.f30499b;
                vsVar2.getClass();
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.zn.W9(j3));
                }
                vsVar2.dismiss();
                return;
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
