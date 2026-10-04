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
public final class es implements MessagesStorage.LongCallback, nl0 {
    public final int f26119a;
    public final is f26120b;

    public es(is isVar, int i10) {
        this.f26119a = i10;
        this.f26120b = isVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        is isVar = this.f26120b;
        g61 G = isVar.X.G(i10 - 1);
        if (G != null) {
            hs hsVar = isVar.f27475k0;
            hs hsVar2 = isVar.f27474j0;
            hs hsVar3 = isVar.f27473i0;
            hs hsVar4 = isVar.f27476l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = isVar.f27486w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !isVar.f27479p0;
                isVar.f27479p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f17182a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    hsVar3.e(i14);
                } else if (i13 == 1) {
                    hsVar2.e(i14);
                    isVar.S();
                } else if (i11 == 3) {
                    hsVar.e(i14);
                    isVar.S();
                } else if (i13 == 2) {
                    hsVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f26676t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(isVar.getContext());
                        alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20367a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        isVar.T();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        isVar.T();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        isVar.T();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        isVar.T();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        isVar.T();
                    }
                    isVar.X.N(true);
                } else if (i12 == 40) {
                    isVar.f27488y0 = !isVar.f27488y0;
                    isVar.H();
                    isVar.X.N(true);
                    isVar.s();
                } else if (i11 == 100) {
                    isVar.B0 = false;
                    boolean z12 = !isVar.C0;
                    isVar.C0 = z12;
                    isVar.D0 = z12;
                    isVar.H();
                    isVar.X.N(true);
                    isVar.s();
                    isVar.M();
                } else if (i12 == 38) {
                    boolean z13 = isVar.f27471g0;
                    isVar.f27471g0 = !z13;
                    if (!z13) {
                        zArr = isVar.f27477n0;
                    } else {
                        zArr = isVar.m0;
                    }
                    if (hsVar4.f27228g != 0) {
                        hsVar4.f27226e = zArr;
                        hsVar4.f();
                        hsVar4.g();
                    }
                    isVar.X.N(true);
                    isVar.T();
                }
            } else if (i11 == 0) {
                hsVar3.d();
            } else if (i11 == 1) {
                hsVar2.d();
                isVar.S();
            } else if (i11 == 3) {
                hsVar.d();
                isVar.S();
            } else if (i11 == 2) {
                hsVar4.d();
            } else if (i12 == 35) {
                if (G.f26676t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(isVar.getContext());
                    alertDialog$Builder2.f20367a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f20367a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f20367a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    isVar.T();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        isVar.T();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        isVar.T();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        isVar.T();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        isVar.T();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        isVar.T();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        isVar.T();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            isVar.T();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !isVar.f27485v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                isVar.T();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= isVar.X.f31309x.size()) {
                                        break;
                                    }
                                    g61 G2 = isVar.X.G(i15);
                                    if (G2.f17182a == 39 && G2.d == 0) {
                                        s4.c1 K = isVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f46523a;
                                            float f11 = -isVar.F0;
                                            isVar.F0 = f11;
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
                            isVar.T();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                isVar.C0 = !isVar.C0;
                                isVar.M();
                            } else if (i11 == 102) {
                                isVar.D0 = !isVar.D0;
                                isVar.M();
                            }
                        }
                        z10 = true;
                    }
                }
                isVar.X.N(z10);
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void run(long j3) {
        switch (this.f26119a) {
            case 0:
                is isVar = this.f26120b;
                isVar.getClass();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.yn.Q9(j3));
                }
                isVar.dismiss();
                return;
            default:
                is isVar2 = this.f26120b;
                isVar2.getClass();
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.yn.Q9(j3));
                }
                isVar2.dismiss();
                return;
        }
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
