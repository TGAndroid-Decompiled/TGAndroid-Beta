package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class lc extends org.telegram.ui.Components.sk0 {
    public final zc f39170c;

    public lc(zc zcVar) {
        this.f39170c = zcVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f39170c.R;
    }

    @Override
    public final int d(int i10) {
        zc zcVar = this.f39170c;
        if (i10 == zcVar.S) {
            return 0;
        }
        if (i10 == zcVar.W) {
            return 2;
        }
        if (i10 == zcVar.Z) {
            return 1;
        }
        if (i10 == zcVar.T) {
            return 3;
        }
        if (i10 == zcVar.f44089b0) {
            return 4;
        }
        if (i10 != zcVar.U && i10 != zcVar.f44091c0 && i10 != zcVar.f44095f0 && i10 != zcVar.f44097h0 && i10 != zcVar.f44099j0) {
            if (i10 != zcVar.X && i10 != zcVar.f44093e0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        zc zcVar = this.f39170c;
        long j10 = zcVar.f44086a;
        int i16 = c1Var.f47901f;
        View view = c1Var.f47898a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                                b9Var.setFixedSize(0);
                                if (i10 == zcVar.f44087a0) {
                                    b9Var.setFixedSize(12);
                                    b9Var.setText("");
                                    return;
                                } else if (i10 == zcVar.V) {
                                    b9Var.setText(org.telegram.messenger.cd.L0(2131752310, null));
                                    return;
                                } else if (i10 == zcVar.Y) {
                                    b9Var.setText(org.telegram.messenger.cd.L0(zcVar.T0(), null));
                                    return;
                                } else if (i10 == zcVar.f44092d0) {
                                    b9Var.setText(org.telegram.messenger.cd.L0(zcVar.Q0(), null));
                                    return;
                                } else if (i10 == zcVar.f44096g0) {
                                    b9Var.setText(org.telegram.messenger.cd.L0(zcVar.K0(), null));
                                    return;
                                } else if (i10 == zcVar.f44098i0) {
                                    b9Var.setText(org.telegram.messenger.cd.L0(zcVar.G0(), null));
                                    return;
                                } else if (i10 == zcVar.f44100k0) {
                                    b9Var.setText(org.telegram.messenger.cd.L0(zcVar.R0(), null));
                                    return;
                                } else if (i10 == 0) {
                                    b9Var.setText("");
                                    b9Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        mc mcVar = (mc) view;
                        mcVar.e = false;
                        org.telegram.ui.ActionBar.u5 u5Var = mcVar.f39638a;
                        mcVar.setWillNotDraw(true);
                        if (i10 == zcVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
                            mcVar.a(i15, zcVar.f44094f, true);
                            u5Var.l(org.telegram.messenger.cd.L0(2131752309, null), false);
                            if (zcVar.f44088b < zcVar.getMessagesController().f18889r5) {
                                mcVar.e(zcVar.getMessagesController().f18889r5);
                            } else {
                                mcVar.e(0);
                            }
                            mcVar.c(zcVar.f44102n, false, false);
                            return;
                        } else if (i10 == zcVar.f44091c0) {
                            i14 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
                            mcVar.a(i14, zcVar.f44109s, false);
                            u5Var.l(org.telegram.messenger.cd.L0(2131752319, null), false);
                            if (zcVar.f44093e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            mcVar.e = z10;
                            mcVar.setWillNotDraw(!z10);
                            if (zcVar.f44088b < zcVar.P0()) {
                                mcVar.e(zcVar.P0());
                            } else {
                                mcVar.e(0);
                            }
                            mcVar.c(zcVar.f44116x, false, false);
                            return;
                        } else if (i10 == zcVar.f44095f0) {
                            i13 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
                            mcVar.a(i13, zcVar.f44109s, false);
                            u5Var.l(org.telegram.messenger.cd.L0(zcVar.M0(), null), false);
                            if (zcVar.f44088b < zcVar.L0()) {
                                mcVar.e(zcVar.L0());
                            } else {
                                mcVar.e(0);
                            }
                            mcVar.c(org.telegram.messenger.o5.f(zcVar.D), org.telegram.messenger.o5.B(zcVar.D), false);
                            return;
                        } else if (i10 == zcVar.f44097h0) {
                            i12 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
                            mcVar.a(i12, zcVar.f44109s, false);
                            u5Var.l(org.telegram.messenger.cd.L0(zcVar.H0(), null), false);
                            if (zcVar.f44088b < zcVar.N0()) {
                                mcVar.e(zcVar.N0());
                            } else {
                                mcVar.e(0);
                            }
                            TLRPC.ChatFull M0 = zcVar.getMessagesController().M0(-j10);
                            if (M0 != null && (stickerSet2 = M0.emojiset) != null) {
                                mcVar.c(zcVar.J0(stickerSet2), false, false);
                                return;
                            } else {
                                mcVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == zcVar.f44099j0) {
                            u5Var.l(org.telegram.messenger.cd.L0(zcVar.S0(), null), false);
                            mcVar.e(0);
                            TLRPC.ChatFull M02 = zcVar.getMessagesController().M0(-j10);
                            if (M02 != null && (stickerSet = M02.stickerset) != null) {
                                mcVar.d(zcVar.I0(stickerSet));
                                return;
                            } else {
                                mcVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    if (i10 == zcVar.f44093e0) {
                        p8Var.k(org.telegram.messenger.cd.L0(2131752324, null), false);
                        return;
                    }
                    p8Var.k(org.telegram.messenger.cd.L0(zcVar.V0(), null), false);
                    if (zcVar.f44088b < zcVar.F0()) {
                        p8Var.j(zcVar.F0());
                        return;
                    } else {
                        p8Var.j(0);
                        return;
                    }
                }
                ((qn0) view).a(zcVar.f44109s, false);
                return;
            }
            ((qc) view).a(zcVar.f44094f, false);
            return;
        }
        sc scVar = (sc) view;
        an0 an0Var = scVar.f41466a;
        rc rcVar = scVar.f41467b;
        i11 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
        an0Var.b(i11, zcVar.f44109s, false);
        rcVar.b(zcVar.f44109s, false);
        rcVar.d(zcVar.f44116x, false, false);
        rcVar.setForum(zcVar.X0());
        rcVar.e(org.telegram.messenger.o5.f(zcVar.D), false, false);
        rcVar.a(zcVar.f44094f);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var4;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var5;
        org.telegram.ui.ActionBar.p6 p6Var6;
        int i13;
        org.telegram.ui.ActionBar.p6 p6Var7;
        xc xcVar;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.p6 p6Var8;
        int i14;
        zc zcVar = this.f39170c;
        if (i10 == 0) {
            Activity parentActivity = zcVar.getParentActivity();
            z4Var = ((org.telegram.ui.ActionBar.k2) zcVar).parentLayout;
            int O0 = zcVar.O0();
            long j10 = zcVar.f44086a;
            p6Var8 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(parentActivity, z4Var, O0, j10, p6Var8);
            z9Var.F = true;
            z9Var.setImportantForAccessibility(4);
            z9Var.f23661x = zcVar;
            Drawable drawable = zcVar.H;
            i14 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            Drawable f7 = vh.k4.f(drawable, i14, zcVar.F, zcVar.J);
            zcVar.H = f7;
            z9Var.setOverrideBackground(f7);
            xcVar = z9Var;
        } else if (i10 == 2) {
            Activity parentActivity2 = zcVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            p6Var7 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            xc xcVar2 = new xc(i13, parentActivity2, p6Var7);
            xcVar2.setWithRemovedStub(true);
            String j11 = org.telegram.messenger.g4.j(zcVar.F);
            if (j11 == null && zcVar.F == null && zcVar.G != null) {
                j11 = "❌";
            }
            xcVar2.a(j11, false);
            xcVar2.setGalleryWallpaper(zcVar.G);
            xcVar2.setOnEmoticonSelected(new org.telegram.messenger.q20(this) {
                public final lc f38738b;

                {
                    this.f38738b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            zc zcVar2 = this.f38738b.f39170c;
                            if (str == null) {
                                zcVar2.F = zcVar2.G;
                            } else if (str.equals("❌")) {
                                zcVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                zcVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f19947id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                zcVar2.F.settings.emoticon = str;
                            }
                            zcVar2.d1(true);
                            zcVar2.g1(true);
                            return;
                        default:
                            zc zcVar3 = this.f38738b.f39170c;
                            zcVar3.f44109s = ((Integer) obj).intValue();
                            if (zcVar3.D instanceof TLRPC.TL_emojiStatusCollectible) {
                                zcVar3.D = null;
                            }
                            zcVar3.d1(true);
                            zcVar3.h1();
                            zcVar3.f1(true);
                            return;
                    }
                }
            });
            xcVar = xcVar2;
        } else if (i10 == 5) {
            xcVar = new org.telegram.ui.Cells.p8(zcVar.getParentActivity(), zcVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = zcVar.getParentActivity();
            p6Var6 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = p6Var6;
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(parentActivity3);
            frameLayout.f39638a = u5Var;
            u5Var.setTextSize(16);
            org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var6);
            frameLayout.addView(u5Var, w7.b6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f39640c = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 13, frameLayout, false);
            xcVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = zcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            p6Var5 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            qc qcVar = new qc(i12, parentActivity4, p6Var5);
            qcVar.f40951b.setOnItemClickListener(new mg.q0(4, this, qcVar));
            xcVar = qcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = zcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            p6Var4 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            qn0 qn0Var = new qn0(0, i11, parentActivity5, p6Var4);
            qn0Var.setDivider(false);
            qn0Var.setOnColorClick(new org.telegram.messenger.q20(this) {
                public final lc f38738b;

                {
                    this.f38738b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            zc zcVar2 = this.f38738b.f39170c;
                            if (str == null) {
                                zcVar2.F = zcVar2.G;
                            } else if (str.equals("❌")) {
                                zcVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                zcVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f19947id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                zcVar2.F.settings.emoticon = str;
                            }
                            zcVar2.d1(true);
                            zcVar2.g1(true);
                            return;
                        default:
                            zc zcVar3 = this.f38738b.f39170c;
                            zcVar3.f44109s = ((Integer) obj).intValue();
                            if (zcVar3.D instanceof TLRPC.TL_emojiStatusCollectible) {
                                zcVar3.D = null;
                            }
                            zcVar3.d1(true);
                            zcVar3.h1();
                            zcVar3.f1(true);
                            return;
                    }
                }
            });
            xcVar = qn0Var;
        } else if (i10 == 1) {
            FrameLayout scVar = new sc(zcVar, zcVar.getParentActivity());
            xcVar = scVar;
            if (zcVar.d) {
                scVar.setTag(-33024);
                xcVar = scVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = zcVar.getParentActivity();
            p6Var3 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            xcVar = new org.telegram.ui.Cells.p4(parentActivity6, p6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = zcVar.getParentActivity();
            p6Var2 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            xcVar = new cn0(parentActivity7, p6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = zcVar.getParentActivity();
            p6Var = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(parentActivity8, p6Var);
            zzVar.setIsSingleCell(true);
            zzVar.setViewType(35);
            xcVar = zzVar;
        } else {
            xcVar = new org.telegram.ui.Cells.b9(zcVar.getParentActivity());
        }
        return new s4.c1(xcVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        boolean z10 = view instanceof sc;
        zc zcVar = this.f39170c;
        if (z10) {
            rc rcVar = ((sc) view).f41467b;
            TLRPC.EmojiStatus emojiStatus = zcVar.D;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                rcVar.c(org.telegram.messenger.kp.a(emojiStatus), false);
                rcVar.d(((TLRPC.TL_emojiStatusCollectible) zcVar.D).pattern_document_id, true, false);
            } else {
                rcVar.b(zcVar.f44109s, false);
                rcVar.d(zcVar.f44116x, false, false);
            }
            rcVar.e(org.telegram.messenger.o5.f(zcVar.D), org.telegram.messenger.o5.B(zcVar.D), false);
            rcVar.setForum(zcVar.X0());
            rcVar.a(zcVar.f44094f);
        } else if (view instanceof org.telegram.ui.Cells.z9) {
            ((org.telegram.ui.Cells.z9) view).setOverrideBackground(zcVar.H);
        } else {
            zc.e1(view);
        }
    }
}
