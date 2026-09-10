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
public final class hs implements MessagesStorage.LongCallback, kl0 {
    public final int f23754a;
    public final ls f23755b;

    public hs(ls lsVar, int i10) {
        this.f23754a = i10;
        this.f23755b = lsVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        ls lsVar = this.f23755b;
        v51 G = lsVar.X.G(i10 - 1);
        if (G != null) {
            ks ksVar = lsVar.f25092k0;
            ks ksVar2 = lsVar.f25091j0;
            ks ksVar3 = lsVar.f25090i0;
            ks ksVar4 = lsVar.f25093l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = lsVar.f25103w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !lsVar.f25096p0;
                lsVar.f25096p0 = z11;
                ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                return;
            }
            int i12 = G.f14046a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    ksVar3.e(i14);
                } else if (i13 == 1) {
                    ksVar2.e(i14);
                    lsVar.U();
                } else if (i11 == 3) {
                    ksVar.e(i14);
                    lsVar.U();
                } else if (i13 == 2) {
                    ksVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f27837t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lsVar.getContext());
                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f17528a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        lsVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        lsVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        lsVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        lsVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        lsVar.V();
                    }
                    lsVar.X.N(true);
                } else if (i12 == 40) {
                    lsVar.f25105y0 = !lsVar.f25105y0;
                    lsVar.J();
                    lsVar.X.N(true);
                    lsVar.s();
                } else if (i11 == 100) {
                    lsVar.B0 = false;
                    boolean z12 = !lsVar.C0;
                    lsVar.C0 = z12;
                    lsVar.D0 = z12;
                    lsVar.J();
                    lsVar.X.N(true);
                    lsVar.s();
                    lsVar.O();
                } else if (i12 == 38) {
                    boolean z13 = lsVar.f25088g0;
                    lsVar.f25088g0 = !z13;
                    if (!z13) {
                        zArr = lsVar.f25094n0;
                    } else {
                        zArr = lsVar.m0;
                    }
                    if (ksVar4.f24806g != 0) {
                        ksVar4.e = zArr;
                        ksVar4.f();
                        ksVar4.g();
                    }
                    lsVar.X.N(true);
                    lsVar.V();
                }
            } else if (i11 == 0) {
                ksVar3.d();
            } else if (i11 == 1) {
                ksVar2.d();
                lsVar.U();
            } else if (i11 == 3) {
                ksVar.d();
                lsVar.U();
            } else if (i11 == 2) {
                ksVar4.d();
            } else if (i12 == 35) {
                if (G.f27837t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(lsVar.getContext());
                    alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f17528a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    lsVar.V();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        lsVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        lsVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        lsVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        lsVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        lsVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        lsVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            lsVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !lsVar.f25102v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                lsVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= lsVar.X.f24253x.size()) {
                                        break;
                                    }
                                    v51 G2 = lsVar.X.G(i15);
                                    if (G2.f14046a == 39 && G2.d == 0) {
                                        s4.c1 K = lsVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f41610a;
                                            float f11 = -lsVar.F0;
                                            lsVar.F0 = f11;
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
                            lsVar.V();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                lsVar.C0 = !lsVar.C0;
                                lsVar.O();
                            } else if (i11 == 102) {
                                lsVar.D0 = !lsVar.D0;
                                lsVar.O();
                            }
                        }
                        z10 = true;
                    }
                }
                lsVar.X.N(z10);
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(long j3) {
        switch (this.f23754a) {
            case 0:
                ls lsVar = this.f23755b;
                lsVar.getClass();
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.eo.R9(j3));
                }
                lsVar.dismiss();
                return;
            default:
                ls lsVar2 = this.f23755b;
                lsVar2.getClass();
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.eo.R9(j3));
                }
                lsVar2.dismiss();
                return;
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
