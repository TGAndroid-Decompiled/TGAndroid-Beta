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
public final class ss implements MessagesStorage.LongCallback, gm0 {
    public final int f30930a;
    public final ws f30931b;

    public ss(ws wsVar, int i10) {
        this.f30930a = i10;
        this.f30931b = wsVar;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        ws wsVar = this.f30931b;
        q61 G = wsVar.X.G(i10 - 1);
        if (G != null) {
            vs vsVar = wsVar.f32773k0;
            vs vsVar2 = wsVar.f32772j0;
            vs vsVar3 = wsVar.f32771i0;
            vs vsVar4 = wsVar.f32774l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = wsVar.f32784w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !wsVar.f32777p0;
                wsVar.f32777p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f17211a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    vsVar3.e(i14);
                } else if (i13 == 1) {
                    vsVar2.e(i14);
                    wsVar.V();
                } else if (i11 == 3) {
                    vsVar.e(i14);
                    wsVar.V();
                } else if (i13 == 2) {
                    vsVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f30175t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wsVar.getContext());
                        alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20404a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        wsVar.W();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        wsVar.W();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        wsVar.W();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        wsVar.W();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        wsVar.W();
                    }
                    wsVar.X.N(true);
                } else if (i12 == 40) {
                    wsVar.f32786y0 = !wsVar.f32786y0;
                    wsVar.K();
                    wsVar.X.N(true);
                    wsVar.u();
                } else if (i11 == 100) {
                    wsVar.B0 = false;
                    boolean z12 = !wsVar.C0;
                    wsVar.C0 = z12;
                    wsVar.D0 = z12;
                    wsVar.K();
                    wsVar.X.N(true);
                    wsVar.u();
                    wsVar.P();
                } else if (i12 == 38) {
                    boolean z13 = wsVar.f32769g0;
                    wsVar.f32769g0 = !z13;
                    if (!z13) {
                        zArr = wsVar.f32775n0;
                    } else {
                        zArr = wsVar.m0;
                    }
                    if (vsVar4.f32537g != 0) {
                        vsVar4.f32535e = zArr;
                        vsVar4.f();
                        vsVar4.g();
                    }
                    wsVar.X.N(true);
                    wsVar.W();
                }
            } else if (i11 == 0) {
                vsVar3.d();
            } else if (i11 == 1) {
                vsVar2.d();
                wsVar.V();
            } else if (i11 == 3) {
                vsVar.d();
                wsVar.V();
            } else if (i11 == 2) {
                vsVar4.d();
            } else if (i12 == 35) {
                if (G.f30175t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wsVar.getContext());
                    alertDialog$Builder2.f20404a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f20404a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f20404a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    wsVar.W();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        wsVar.W();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        wsVar.W();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        wsVar.W();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        wsVar.W();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        wsVar.W();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        wsVar.W();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            wsVar.W();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !wsVar.f32783v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                wsVar.W();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= wsVar.X.f25652x.size()) {
                                        break;
                                    }
                                    q61 G2 = wsVar.X.G(i15);
                                    if (G2.f17211a == 39 && G2.d == 0) {
                                        s4.d1 K = wsVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f47782a;
                                            float f11 = -wsVar.F0;
                                            wsVar.F0 = f11;
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
                            wsVar.W();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                wsVar.C0 = !wsVar.C0;
                                wsVar.P();
                            } else if (i11 == 102) {
                                wsVar.D0 = !wsVar.D0;
                                wsVar.P();
                            }
                        }
                        z10 = true;
                    }
                }
                wsVar.X.N(z10);
            }
        }
    }

    @Override
    public void run(long j3) {
        switch (this.f30930a) {
            case 0:
                ws wsVar = this.f30931b;
                wsVar.getClass();
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.zn.W9(j3));
                }
                wsVar.dismiss();
                return;
            default:
                ws wsVar2 = this.f30931b;
                wsVar2.getClass();
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.zn.W9(j3));
                }
                wsVar2.dismiss();
                return;
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
