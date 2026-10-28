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
public final class ns implements MessagesStorage.LongCallback, bm0 {
    public final int f31064a;
    public final rs f31065b;

    public ns(rs rsVar, int i10) {
        this.f31064a = i10;
        this.f31065b = rsVar;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        rs rsVar = this.f31065b;
        u61 G = rsVar.X.G(i10 - 1);
        if (G != null) {
            qs qsVar = rsVar.f32346k0;
            qs qsVar2 = rsVar.f32345j0;
            qs qsVar3 = rsVar.f32344i0;
            qs qsVar4 = rsVar.f32347l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = rsVar.f32357w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !rsVar.f32350p0;
                rsVar.f32350p0 = z11;
                ((org.telegram.ui.Cells.z8) view).setChecked(z11);
                return;
            }
            int i12 = G.f47075a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    qsVar3.e(i14);
                } else if (i13 == 1) {
                    qsVar2.e(i14);
                    rsVar.U();
                } else if (i11 == 3) {
                    qsVar.e(i14);
                    rsVar.U();
                } else if (i13 == 2) {
                    qsVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f33257t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rsVar.getContext());
                        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f22369a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        rsVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        rsVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        rsVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        rsVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        rsVar.V();
                    }
                    rsVar.X.O(true);
                } else if (i12 == 40) {
                    rsVar.f32359y0 = !rsVar.f32359y0;
                    rsVar.J();
                    rsVar.X.O(true);
                    rsVar.s();
                } else if (i11 == 100) {
                    rsVar.B0 = false;
                    boolean z12 = !rsVar.C0;
                    rsVar.C0 = z12;
                    rsVar.D0 = z12;
                    rsVar.J();
                    rsVar.X.O(true);
                    rsVar.s();
                    rsVar.O();
                } else if (i12 == 38) {
                    boolean z13 = rsVar.f32342g0;
                    rsVar.f32342g0 = !z13;
                    if (!z13) {
                        zArr = rsVar.f32348n0;
                    } else {
                        zArr = rsVar.m0;
                    }
                    if (qsVar4.f32014g != 0) {
                        qsVar4.e = zArr;
                        qsVar4.f();
                        qsVar4.g();
                    }
                    rsVar.X.O(true);
                    rsVar.V();
                }
            } else if (i11 == 0) {
                qsVar3.d();
            } else if (i11 == 1) {
                qsVar2.d();
                rsVar.U();
            } else if (i11 == 3) {
                qsVar.d();
                rsVar.U();
            } else if (i11 == 2) {
                qsVar4.d();
            } else if (i12 == 35) {
                if (G.f33257t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rsVar.getContext());
                    alertDialog$Builder2.f22369a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f22369a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f22369a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    rsVar.V();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        rsVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        rsVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        rsVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        rsVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        rsVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        rsVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            rsVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !rsVar.f32356v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                rsVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= rsVar.X.f29882y.size()) {
                                        break;
                                    }
                                    u61 G2 = rsVar.X.G(i15);
                                    if (G2.f47075a == 39 && G2.d == 0) {
                                        s4.e1 K = rsVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f47773a;
                                            float f11 = -rsVar.F0;
                                            rsVar.F0 = f11;
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
                            rsVar.V();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                rsVar.C0 = !rsVar.C0;
                                rsVar.O();
                            } else if (i11 == 102) {
                                rsVar.D0 = !rsVar.D0;
                                rsVar.O();
                            }
                        }
                        z10 = true;
                    }
                }
                rsVar.X.O(z10);
            }
        }
    }

    @Override
    public void run(long j10) {
        switch (this.f31064a) {
            case 0:
                rs rsVar = this.f31065b;
                rsVar.getClass();
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.wn.ea(j10));
                }
                rsVar.dismiss();
                return;
            default:
                rs rsVar2 = this.f31065b;
                rsVar2.getClass();
                org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.wn.ea(j10));
                }
                rsVar2.dismiss();
                return;
        }
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
