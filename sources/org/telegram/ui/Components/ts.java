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
public final class ts implements MessagesStorage.LongCallback, lm0 {
    public final int f30966a;
    public final xs f30967b;

    public ts(xs xsVar, int i10) {
        this.f30966a = i10;
        this.f30967b = xsVar;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        xs xsVar = this.f30967b;
        u61 G = xsVar.X.G(i10 - 1);
        if (G != null) {
            ws wsVar = xsVar.f32845k0;
            ws wsVar2 = xsVar.f32844j0;
            ws wsVar3 = xsVar.f32843i0;
            ws wsVar4 = xsVar.f32846l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = xsVar.f32856w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !xsVar.f32849p0;
                xsVar.f32849p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f16877a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    wsVar3.e(i14);
                } else if (i13 == 1) {
                    wsVar2.e(i14);
                    xsVar.V();
                } else if (i11 == 3) {
                    wsVar.e(i14);
                    xsVar.V();
                } else if (i13 == 2) {
                    wsVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f31079t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xsVar.getContext());
                        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20142a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        xsVar.W();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        xsVar.W();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        xsVar.W();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        xsVar.W();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        xsVar.W();
                    }
                    xsVar.X.N(true);
                } else if (i12 == 40) {
                    xsVar.f32858y0 = !xsVar.f32858y0;
                    xsVar.K();
                    xsVar.X.N(true);
                    xsVar.u();
                } else if (i11 == 100) {
                    xsVar.B0 = false;
                    boolean z12 = !xsVar.C0;
                    xsVar.C0 = z12;
                    xsVar.D0 = z12;
                    xsVar.K();
                    xsVar.X.N(true);
                    xsVar.u();
                    xsVar.P();
                } else if (i12 == 38) {
                    boolean z13 = xsVar.f32841g0;
                    xsVar.f32841g0 = !z13;
                    if (!z13) {
                        zArr = xsVar.f32847n0;
                    } else {
                        zArr = xsVar.m0;
                    }
                    if (wsVar4.f32543g != 0) {
                        wsVar4.f32541e = zArr;
                        wsVar4.f();
                        wsVar4.g();
                    }
                    xsVar.X.N(true);
                    xsVar.W();
                }
            } else if (i11 == 0) {
                wsVar3.d();
            } else if (i11 == 1) {
                wsVar2.d();
                xsVar.V();
            } else if (i11 == 3) {
                wsVar.d();
                xsVar.V();
            } else if (i11 == 2) {
                wsVar4.d();
            } else if (i12 == 35) {
                if (G.f31079t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xsVar.getContext());
                    alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f20142a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f20142a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    xsVar.W();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        xsVar.W();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        xsVar.W();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        xsVar.W();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        xsVar.W();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        xsVar.W();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        xsVar.W();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            xsVar.W();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !xsVar.f32855v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                xsVar.W();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= xsVar.X.f26682x.size()) {
                                        break;
                                    }
                                    u61 G2 = xsVar.X.G(i15);
                                    if (G2.f16877a == 39 && G2.d == 0) {
                                        s4.d1 K = xsVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f47897a;
                                            float f11 = -xsVar.F0;
                                            xsVar.F0 = f11;
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
                            xsVar.W();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                xsVar.C0 = !xsVar.C0;
                                xsVar.P();
                            } else if (i11 == 102) {
                                xsVar.D0 = !xsVar.D0;
                                xsVar.P();
                            }
                        }
                        z10 = true;
                    }
                }
                xsVar.X.N(z10);
            }
        }
    }

    @Override
    public void run(long j3) {
        switch (this.f30966a) {
            case 0:
                xs xsVar = this.f30967b;
                xsVar.getClass();
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.eo.W9(j3));
                }
                xsVar.dismiss();
                return;
            default:
                xs xsVar2 = this.f30967b;
                xsVar2.getClass();
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.eo.W9(j3));
                }
                xsVar2.dismiss();
                return;
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
