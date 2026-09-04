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
public final class as implements MessagesStorage.LongCallback, al0 {
    public final int f24448a;
    public final es f24449b;

    public as(es esVar, int i10) {
        this.f24448a = i10;
        this.f24449b = esVar;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean[] zArr;
        es esVar = this.f24449b;
        h51 G = esVar.X.G(i10 - 1);
        if (G != null) {
            ds dsVar = esVar.f25768k0;
            ds dsVar2 = esVar.f25767j0;
            ds dsVar3 = esVar.f25766i0;
            ds dsVar4 = esVar.f25769l0;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = esVar.f25779w0;
            int i11 = G.d;
            if (i11 == 103) {
                boolean z11 = !esVar.f25772p0;
                esVar.f25772p0 = z11;
                ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                return;
            }
            int i12 = G.f44071a;
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
                    if (G.f26602t) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(esVar.getContext());
                        alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.f20198a.show();
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
                    esVar.X.N(true);
                } else if (i12 == 40) {
                    esVar.f25781y0 = !esVar.f25781y0;
                    esVar.J();
                    esVar.X.N(true);
                    esVar.s();
                } else if (i11 == 100) {
                    esVar.B0 = false;
                    boolean z12 = !esVar.C0;
                    esVar.C0 = z12;
                    esVar.D0 = z12;
                    esVar.J();
                    esVar.X.N(true);
                    esVar.s();
                    esVar.O();
                } else if (i12 == 38) {
                    boolean z13 = esVar.f25764g0;
                    esVar.f25764g0 = !z13;
                    if (!z13) {
                        zArr = esVar.f25770n0;
                    } else {
                        zArr = esVar.m0;
                    }
                    if (dsVar4.f25461g != 0) {
                        dsVar4.f25459e = zArr;
                        dsVar4.f();
                        dsVar4.g();
                    }
                    esVar.X.N(true);
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
                if (G.f26602t) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(esVar.getContext());
                    alertDialog$Builder2.f20198a.R = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    alertDialog$Builder2.f20198a.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder2.f20198a.show();
                    return;
                }
                if (i11 == 6) {
                    z10 = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    esVar.V();
                } else {
                    z10 = true;
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
                            boolean z14 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z14;
                            tL_chatBannedRights.send_gifs = z14;
                            tL_chatBannedRights.send_games = z14;
                            tL_chatBannedRights.send_stickers = z14;
                            esVar.V();
                        } else if (i11 == 14) {
                            if (!tL_chatBannedRights.send_plain && !esVar.f25778v0.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                esVar.V();
                            } else {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= esVar.X.f31138x.size()) {
                                        break;
                                    }
                                    h51 G2 = esVar.X.G(i15);
                                    if (G2.f44071a == 39 && G2.d == 0) {
                                        s4.c1 K = esVar.d.K(i15 + 1);
                                        if (K != null) {
                                            View view2 = K.f45738a;
                                            float f11 = -esVar.F0;
                                            esVar.F0 = f11;
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
                            esVar.V();
                        } else {
                            z10 = true;
                            if (i11 == 101) {
                                esVar.C0 = !esVar.C0;
                                esVar.O();
                            } else if (i11 == 102) {
                                esVar.D0 = !esVar.D0;
                                esVar.O();
                            }
                        }
                        z10 = true;
                    }
                }
                esVar.X.N(z10);
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(long j3) {
        switch (this.f24448a) {
            case 0:
                es esVar = this.f24449b;
                esVar.getClass();
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(org.telegram.ui.co.R9(j3));
                }
                esVar.dismiss();
                return;
            default:
                es esVar2 = this.f24449b;
                esVar2.getClass();
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.presentFragment(org.telegram.ui.co.R9(j3));
                }
                esVar2.dismiss();
                return;
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
