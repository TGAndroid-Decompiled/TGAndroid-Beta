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
public final class wr implements MessagesStorage.LongCallback, al0 {
    public final int f34484a;
    public final as f34485b;

    public wr(as asVar, int i10) {
        this.f34484a = i10;
        this.f34485b = asVar;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        as asVar = this.f34485b;
        w41 G = asVar.T.G(i10 - 1);
        if (G != null) {
            zr zrVar = asVar.f26847g0;
            zr zrVar2 = asVar.f26846f0;
            zr zrVar3 = asVar.f26845e0;
            zr zrVar4 = asVar.f26848h0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = asVar.f26858s0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !asVar.f26852l0;
                asVar.f26852l0 = z11;
                ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                return;
            }
            int i12 = G.f50845a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    zrVar3.e(i14);
                } else if (i13 == 1) {
                    zrVar2.e(i14);
                    asVar.U();
                } else if (i11 == 3) {
                    zrVar.e(i14);
                    asVar.U();
                } else if (i13 == 2) {
                    zrVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f34308t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(asVar.getContext());
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f22714a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        asVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        asVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        asVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        asVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        asVar.V();
                    }
                    asVar.T.N(true);
                } else if (i12 == 40) {
                    asVar.f26860u0 = !asVar.f26860u0;
                    asVar.I();
                    asVar.T.N(true);
                    asVar.s();
                } else if (i11 == 100) {
                    asVar.f26863x0 = false;
                    boolean z12 = !asVar.f26864y0;
                    asVar.f26864y0 = z12;
                    asVar.f26865z0 = z12;
                    asVar.I();
                    asVar.T.N(true);
                    asVar.s();
                    asVar.O();
                } else if (i12 == 38) {
                    boolean z13 = asVar.f26843c0;
                    asVar.f26843c0 = !z13;
                    if (!z13) {
                        zArr = asVar.f26850j0;
                    } else {
                        zArr = asVar.f26849i0;
                    }
                    if (zrVar4.f35406g != 0) {
                        zrVar4.f35404e = zArr;
                        zrVar4.f();
                        zrVar4.g();
                    }
                    asVar.T.N(true);
                    asVar.V();
                }
            } else if (i11 == 0) {
                zrVar3.d();
            } else if (i11 == 1) {
                zrVar2.d();
                asVar.U();
            } else if (i11 == 3) {
                zrVar.d();
                asVar.U();
            } else if (i11 == 2) {
                zrVar4.d();
            } else if (i12 == 35) {
                if (G.f34308t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(asVar.getContext());
                    alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f22714a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    asVar.V();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        asVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        asVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        asVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        asVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        asVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        asVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            asVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !asVar.f26857r0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                asVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= asVar.T.f29942x.size()) {
                                        break;
                                    }
                                    w41 G2 = asVar.T.G(i15);
                                    if (G2.f50845a == 39 && G2.d == 0) {
                                        f2.n1 K = asVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f6432a;
                                            float f11 = -asVar.B0;
                                            asVar.B0 = f11;
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
                            asVar.V();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                asVar.f26864y0 = !asVar.f26864y0;
                                asVar.O();
                            } else if (i11 == 102) {
                                asVar.f26865z0 = !asVar.f26865z0;
                                asVar.O();
                            }
                        }
                        z10 = true;
                    }
                }
                asVar.T.N(z10);
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void run(long j10) {
        switch (this.f34484a) {
            case 0:
                as asVar = this.f34485b;
                asVar.getClass();
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.tn.R9(j10));
                }
                asVar.dismiss();
                return;
            default:
                as asVar2 = this.f34485b;
                asVar2.getClass();
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.tn.R9(j10));
                }
                asVar2.dismiss();
                return;
        }
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
