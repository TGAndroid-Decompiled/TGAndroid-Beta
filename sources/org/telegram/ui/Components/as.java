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
public final class as implements MessagesStorage.LongCallback, jl0 {
    public final int f23502a;
    public final es f23503b;

    public as(es esVar, int i10) {
        this.f23502a = i10;
        this.f23503b = esVar;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        boolean z4;
        boolean[] zArr;
        es esVar = this.f23503b;
        i51 G = esVar.U.G(i10 - 1);
        if (G != null) {
            ds dsVar = esVar.f24647h0;
            ds dsVar2 = esVar.f24646g0;
            ds dsVar3 = esVar.f24645f0;
            ds dsVar4 = esVar.f24648i0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = esVar.f24658t0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z10 = !esVar.m0;
                esVar.m0 = z10;
                ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                return;
            }
            int i12 = G.f1808a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    dsVar3.e(i14);
                } else if (i13 == 1) {
                    dsVar2.e(i14);
                    esVar.U();
                } else if (i11 == 3) {
                    dsVar.e(i14);
                    esVar.U();
                } else if (i13 == 2) {
                    dsVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f25573t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(esVar.getContext());
                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f19503a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        esVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        esVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        esVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        esVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        esVar.V();
                    }
                    esVar.U.N(true);
                } else if (i12 == 40) {
                    esVar.f24660v0 = !esVar.f24660v0;
                    esVar.I();
                    esVar.U.N(true);
                    esVar.s();
                } else if (i11 == 100) {
                    esVar.f24663y0 = false;
                    boolean z11 = !esVar.f24664z0;
                    esVar.f24664z0 = z11;
                    esVar.A0 = z11;
                    esVar.I();
                    esVar.U.N(true);
                    esVar.s();
                    esVar.O();
                } else if (i12 == 38) {
                    boolean z12 = esVar.f24643d0;
                    esVar.f24643d0 = !z12;
                    if (!z12) {
                        zArr = esVar.f24650k0;
                    } else {
                        zArr = esVar.f24649j0;
                    }
                    if (dsVar4.f24359g != 0) {
                        dsVar4.e = zArr;
                        dsVar4.f();
                        dsVar4.g();
                    }
                    esVar.U.N(true);
                    esVar.V();
                }
            } else if (i11 == 0) {
                dsVar3.d();
            } else if (i11 == 1) {
                dsVar2.d();
                esVar.U();
            } else if (i11 == 3) {
                dsVar.d();
                esVar.U();
            } else if (i11 == 2) {
                dsVar4.d();
            } else if (i12 == 35) {
                if (G.f25573t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(esVar.getContext());
                    alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f19503a.show();
                    return;
                }
                if (i11 == 6) {
                    z4 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    esVar.V();
                } else {
                    z4 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        esVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        esVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        esVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        esVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        esVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        esVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z13 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z13;
                            tL_chatBannedRights.send_gifs = z13;
                            tL_chatBannedRights.send_games = z13;
                            tL_chatBannedRights.send_stickers = z13;
                            esVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !esVar.f24657s0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                esVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= esVar.U.f30243x.size()) {
                                        break;
                                    }
                                    i51 G2 = esVar.U.G(i15);
                                    if (G2.f1808a == 39 && G2.d == 0) {
                                        f2.l1 K = esVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f5785a;
                                            float f12 = -esVar.C0;
                                            esVar.C0 = f12;
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
                            esVar.V();
                        } else {
                            z4 = true;
                            if (i11 == 101) {
                                esVar.f24664z0 = !esVar.f24664z0;
                                esVar.O();
                            } else if (i11 == 102) {
                                esVar.A0 = !esVar.A0;
                                esVar.O();
                            }
                        }
                        z4 = true;
                    }
                }
                esVar.U.N(z4);
            }
        }
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public void run(long j10) {
        switch (this.f23502a) {
            case 0:
                es esVar = this.f23503b;
                esVar.getClass();
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.xn.R9(j10));
                }
                esVar.dismiss();
                return;
            default:
                es esVar2 = this.f23503b;
                esVar2.getClass();
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.xn.R9(j10));
                }
                esVar2.dismiss();
                return;
        }
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
