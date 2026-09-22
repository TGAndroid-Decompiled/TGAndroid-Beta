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
public final class bs implements MessagesStorage.LongCallback, nl0 {
    public final int f23088a;
    public final fs f23089b;

    public bs(fs fsVar, int i10) {
        this.f23088a = i10;
        this.f23089b = fsVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        fs fsVar = this.f23089b;
        y51 G = fsVar.X.G(i10 - 1);
        if (G != null) {
            es esVar = fsVar.f24339k0;
            es esVar2 = fsVar.f24338j0;
            es esVar3 = fsVar.f24337i0;
            es esVar4 = fsVar.f24340l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = fsVar.f24350w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !fsVar.f24343p0;
                fsVar.f24343p0 = z11;
                ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                return;
            }
            int i12 = G.f15719a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    esVar3.e(i14);
                } else if (i13 == 1) {
                    esVar2.e(i14);
                    fsVar.U();
                } else if (i11 == 3) {
                    esVar.e(i14);
                    fsVar.U();
                } else if (i13 == 2) {
                    esVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f30526t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fsVar.getContext());
                        alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f18669a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        fsVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        fsVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        fsVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        fsVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        fsVar.V();
                    }
                    fsVar.X.N(true);
                } else if (i12 == 40) {
                    fsVar.f24352y0 = !fsVar.f24352y0;
                    fsVar.J();
                    fsVar.X.N(true);
                    fsVar.s();
                } else if (i11 == 100) {
                    fsVar.B0 = false;
                    boolean z12 = !fsVar.C0;
                    fsVar.C0 = z12;
                    fsVar.D0 = z12;
                    fsVar.J();
                    fsVar.X.N(true);
                    fsVar.s();
                    fsVar.O();
                } else if (i12 == 38) {
                    boolean z13 = fsVar.f24335g0;
                    fsVar.f24335g0 = !z13;
                    if (!z13) {
                        zArr = fsVar.f24341n0;
                    } else {
                        zArr = fsVar.m0;
                    }
                    if (esVar4.f24029g != 0) {
                        esVar4.e = zArr;
                        esVar4.f();
                        esVar4.g();
                    }
                    fsVar.X.N(true);
                    fsVar.V();
                }
            } else if (i11 == 0) {
                esVar3.d();
            } else if (i11 == 1) {
                esVar2.d();
                fsVar.U();
            } else if (i11 == 3) {
                esVar.d();
                fsVar.U();
            } else if (i11 == 2) {
                esVar4.d();
            } else if (i12 == 35) {
                if (G.f30526t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(fsVar.getContext());
                    alertDialog$Builder2.f18669a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f18669a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f18669a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    fsVar.V();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        fsVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        fsVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        fsVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        fsVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        fsVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        fsVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            fsVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !fsVar.f24349v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                fsVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= fsVar.X.f26345x.size()) {
                                        break;
                                    }
                                    y51 G2 = fsVar.X.G(i15);
                                    if (G2.f15719a == 39 && G2.d == 0) {
                                        s4.c1 L = fsVar.d.L(i15 + 1);
                                        if (L != null) {
                                            View view2 = L.f42995a;
                                            float f11 = -fsVar.F0;
                                            fsVar.F0 = f11;
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
                            fsVar.V();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                fsVar.C0 = !fsVar.C0;
                                fsVar.O();
                            } else if (i11 == 102) {
                                fsVar.D0 = !fsVar.D0;
                                fsVar.O();
                            }
                        }
                        z10 = true;
                    }
                }
                fsVar.X.N(z10);
            }
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void run(long j3) {
        switch (this.f23088a) {
            case 0:
                fs fsVar = this.f23089b;
                fsVar.getClass();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.zn.R9(j3));
                }
                fsVar.dismiss();
                return;
            default:
                fs fsVar2 = this.f23089b;
                fsVar2.getClass();
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.zn.R9(j3));
                }
                fsVar2.dismiss();
                return;
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
