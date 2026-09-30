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
public final class es implements MessagesStorage.LongCallback, ol0 {
    public final int f24039a;
    public final is f24040b;

    public es(is isVar, int i10) {
        this.f24039a = i10;
        this.f24040b = isVar;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        is isVar = this.f24040b;
        y51 G = isVar.X.G(i10 - 1);
        if (G != null) {
            hs hsVar = isVar.f25182k0;
            hs hsVar2 = isVar.f25181j0;
            hs hsVar3 = isVar.f25180i0;
            hs hsVar4 = isVar.f25183l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = isVar.f25193w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !isVar.f25186p0;
                isVar.f25186p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f15731a;
            if (i12 == 37) {
                int i13 = i11 >>> 24;
                int i14 = 16777215 & i11;
                if (i13 == 0) {
                    hsVar3.e(i14);
                } else if (i13 == 1) {
                    hsVar2.e(i14);
                    isVar.U();
                } else if (i11 == 3) {
                    hsVar.e(i14);
                    isVar.U();
                } else if (i13 == 2) {
                    hsVar4.e(i14);
                }
            } else if (i12 != 36 && i12 != 35) {
                if (i12 == 39) {
                    if (G.f30645t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(isVar.getContext());
                        alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f18678a.show();
                        return;
                    }
                    if (i11 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        isVar.V();
                    } else if (i11 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        isVar.V();
                    } else if (i11 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        isVar.V();
                    } else if (i11 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        isVar.V();
                    } else if (i11 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        isVar.V();
                    }
                    isVar.X.N(true);
                } else if (i12 == 40) {
                    isVar.f25195y0 = !isVar.f25195y0;
                    isVar.J();
                    isVar.X.N(true);
                    isVar.s();
                } else if (i11 == 100) {
                    isVar.B0 = false;
                    boolean z12 = !isVar.C0;
                    isVar.C0 = z12;
                    isVar.D0 = z12;
                    isVar.J();
                    isVar.X.N(true);
                    isVar.s();
                    isVar.O();
                } else if (i12 == 38) {
                    boolean z13 = isVar.f25178g0;
                    isVar.f25178g0 = !z13;
                    if (!z13) {
                        zArr = isVar.f25184n0;
                    } else {
                        zArr = isVar.m0;
                    }
                    if (hsVar4.f24937g != 0) {
                        hsVar4.e = zArr;
                        hsVar4.f();
                        hsVar4.g();
                    }
                    isVar.X.N(true);
                    isVar.V();
                }
            } else if (i11 == 0) {
                hsVar3.d();
            } else if (i11 == 1) {
                hsVar2.d();
                isVar.U();
            } else if (i11 == 3) {
                hsVar.d();
                isVar.U();
            } else if (i11 == 2) {
                hsVar4.d();
            } else if (i12 == 35) {
                if (G.f30645t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(isVar.getContext());
                    alertDialog$Builder2.f18678a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f18678a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f18678a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    isVar.V();
                } else {
                    z10 = true;
                    if (i11 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        isVar.V();
                    } else if (i11 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        isVar.V();
                    } else if (i11 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        isVar.V();
                    } else if (i11 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        isVar.V();
                    } else if (i11 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        isVar.V();
                    } else if (i11 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        isVar.V();
                    } else {
                        if (i11 == 12) {
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            isVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !isVar.f25192v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                isVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= isVar.X.f26226x.size()) {
                                        break;
                                    }
                                    y51 G2 = isVar.X.G(i15);
                                    if (G2.f15731a == 39 && G2.d == 0) {
                                        s4.c1 K = isVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f43068a;
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
                            isVar.V();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                isVar.C0 = !isVar.C0;
                                isVar.O();
                            } else if (i11 == 102) {
                                isVar.D0 = !isVar.D0;
                                isVar.O();
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
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(long j3) {
        switch (this.f24039a) {
            case 0:
                is isVar = this.f24040b;
                isVar.getClass();
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.wn.R9(j3));
                }
                isVar.dismiss();
                return;
            default:
                is isVar2 = this.f24040b;
                isVar2.getClass();
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.wn.R9(j3));
                }
                isVar2.dismiss();
                return;
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
