package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class ec extends org.telegram.ui.Components.pj0 {
    public final rc f45356c;

    public ec(rc rcVar) {
        this.f45356c = rcVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 5 && i7 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f45356c.R;
    }

    @Override
    public final int d(int i7) {
        rc rcVar = this.f45356c;
        if (i7 == rcVar.S) {
            return 0;
        }
        if (i7 == rcVar.W) {
            return 2;
        }
        if (i7 == rcVar.Z) {
            return 1;
        }
        if (i7 == rcVar.T) {
            return 3;
        }
        if (i7 == rcVar.f49409b0) {
            return 4;
        }
        if (i7 != rcVar.U && i7 != rcVar.f49411c0 && i7 != rcVar.f49416f0 && i7 != rcVar.f49418h0 && i7 != rcVar.f49420j0) {
            if (i7 != rcVar.X && i7 != rcVar.f49414e0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        TLRPC.StickerSet stickerSet;
        int i11;
        TLRPC.StickerSet stickerSet2;
        int i12;
        int i13;
        boolean z9;
        int i14;
        rc rcVar = this.f45356c;
        long j3 = rcVar.f49406a;
        int i15 = d1Var.f57060f;
        View view = d1Var.f57056a;
        if (i15 != 1) {
            if (i15 != 3) {
                if (i15 != 4) {
                    if (i15 != 5) {
                        if (i15 != 6) {
                            if (i15 == 7) {
                                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                                z8Var.setFixedSize(0);
                                if (i7 == rcVar.f49407a0) {
                                    z8Var.setFixedSize(12);
                                    z8Var.setText("");
                                    return;
                                } else if (i7 == rcVar.V) {
                                    z8Var.setText(org.telegram.messenger.id.M0(2131752310, null));
                                    return;
                                } else if (i7 == rcVar.Y) {
                                    z8Var.setText(org.telegram.messenger.id.M0(rcVar.U0(), null));
                                    return;
                                } else if (i7 == rcVar.f49412d0) {
                                    z8Var.setText(org.telegram.messenger.id.M0(rcVar.R0(), null));
                                    return;
                                } else if (i7 == rcVar.f49417g0) {
                                    z8Var.setText(org.telegram.messenger.id.M0(rcVar.L0(), null));
                                    return;
                                } else if (i7 == rcVar.f49419i0) {
                                    z8Var.setText(org.telegram.messenger.id.M0(rcVar.H0(), null));
                                    return;
                                } else if (i7 == rcVar.f49421k0) {
                                    z8Var.setText(org.telegram.messenger.id.M0(rcVar.S0(), null));
                                    return;
                                } else if (i7 == 0) {
                                    z8Var.setText("");
                                    z8Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        fc fcVar = (fc) view;
                        fcVar.f45684e = false;
                        org.telegram.ui.ActionBar.l5 l5Var = fcVar.f45681a;
                        fcVar.setWillNotDraw(true);
                        if (i7 == rcVar.U) {
                            i14 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
                            fcVar.a(i14, rcVar.f49415f, true);
                            l5Var.l(org.telegram.messenger.id.M0(2131752309, null), false);
                            if (rcVar.f49408b < rcVar.getMessagesController().f24875q5) {
                                fcVar.e(rcVar.getMessagesController().f24875q5);
                            } else {
                                fcVar.e(0);
                            }
                            fcVar.c(rcVar.f49423n, false, false);
                            return;
                        } else if (i7 == rcVar.f49411c0) {
                            i13 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
                            fcVar.a(i13, rcVar.f49430s, false);
                            l5Var.l(org.telegram.messenger.id.M0(2131752319, null), false);
                            if (rcVar.f49414e0 >= 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            fcVar.f45684e = z9;
                            fcVar.setWillNotDraw(!z9);
                            if (rcVar.f49408b < rcVar.Q0()) {
                                fcVar.e(rcVar.Q0());
                            } else {
                                fcVar.e(0);
                            }
                            fcVar.c(rcVar.f49437x, false, false);
                            return;
                        } else if (i7 == rcVar.f49416f0) {
                            i12 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
                            fcVar.a(i12, rcVar.f49430s, false);
                            l5Var.l(org.telegram.messenger.id.M0(rcVar.N0(), null), false);
                            if (rcVar.f49408b < rcVar.M0()) {
                                fcVar.e(rcVar.M0());
                            } else {
                                fcVar.e(0);
                            }
                            fcVar.c(org.telegram.messenger.m5.f(rcVar.D), org.telegram.messenger.m5.B(rcVar.D), false);
                            return;
                        } else if (i7 == rcVar.f49418h0) {
                            i11 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
                            fcVar.a(i11, rcVar.f49430s, false);
                            l5Var.l(org.telegram.messenger.id.M0(rcVar.I0(), null), false);
                            if (rcVar.f49408b < rcVar.O0()) {
                                fcVar.e(rcVar.O0());
                            } else {
                                fcVar.e(0);
                            }
                            TLRPC.ChatFull N0 = rcVar.getMessagesController().N0(-j3);
                            if (N0 != null && (stickerSet2 = N0.emojiset) != null) {
                                fcVar.c(rcVar.K0(stickerSet2), false, false);
                                return;
                            } else {
                                fcVar.c(0L, false, false);
                                return;
                            }
                        } else if (i7 == rcVar.f49420j0) {
                            l5Var.l(org.telegram.messenger.id.M0(rcVar.T0(), null), false);
                            fcVar.e(0);
                            TLRPC.ChatFull N02 = rcVar.getMessagesController().N0(-j3);
                            if (N02 != null && (stickerSet = N02.stickerset) != null) {
                                fcVar.d(rcVar.J0(stickerSet));
                                return;
                            } else {
                                fcVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (i7 == rcVar.f49414e0) {
                        m8Var.k(org.telegram.messenger.id.M0(2131752324, null), false);
                        return;
                    }
                    m8Var.k(org.telegram.messenger.id.M0(rcVar.W0(), null), false);
                    if (rcVar.f49408b < rcVar.G0()) {
                        m8Var.j(rcVar.G0());
                        return;
                    } else {
                        m8Var.j(0);
                        return;
                    }
                }
                ((gm0) view).a(rcVar.f49430s, false);
                return;
            }
            ((ic) view).a(rcVar.f49415f, false);
            return;
        }
        kc kcVar = (kc) view;
        ql0 ql0Var = kcVar.f47259a;
        jc jcVar = kcVar.f47260b;
        i10 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
        ql0Var.b(i10, rcVar.f49430s, false);
        jcVar.b(rcVar.f49430s, false);
        jcVar.d(rcVar.f49437x, false, false);
        jcVar.setForum(rcVar.Y0());
        jcVar.e(org.telegram.messenger.m5.f(rcVar.D), false, false);
        jcVar.a(rcVar.f49415f);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var4;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var5;
        org.telegram.ui.ActionBar.g6 g6Var6;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var7;
        pc pcVar;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.g6 g6Var8;
        int i13;
        rc rcVar = this.f45356c;
        if (i7 == 0) {
            Activity parentActivity = rcVar.getParentActivity();
            q4Var = ((org.telegram.ui.ActionBar.f2) rcVar).parentLayout;
            int P0 = rcVar.P0();
            long j3 = rcVar.f49406a;
            g6Var8 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(parentActivity, q4Var, P0, j3, g6Var8);
            z9Var.F = true;
            z9Var.setImportantForAccessibility(4);
            z9Var.f31006x = rcVar;
            Drawable drawable = rcVar.H;
            i13 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            Drawable f10 = fi.y5.f(drawable, i13, rcVar.F, rcVar.J);
            rcVar.H = f10;
            z9Var.setOverrideBackground(f10);
            pcVar = z9Var;
        } else if (i7 == 2) {
            Activity parentActivity2 = rcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            g6Var7 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            pc pcVar2 = new pc(i12, parentActivity2, g6Var7);
            pcVar2.setWithRemovedStub(true);
            String j10 = org.telegram.messenger.d4.j(rcVar.F);
            if (j10 == null && rcVar.F == null && rcVar.G != null) {
                j10 = "❌";
            }
            pcVar2.a(j10, false);
            pcVar2.setGalleryWallpaper(rcVar.G);
            pcVar2.setOnEmoticonSelected(new org.telegram.messenger.c20(this) {
                public final ec f44909b;

                {
                    this.f44909b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            rc rcVar2 = this.f44909b.f45356c;
                            if (str == null) {
                                rcVar2.F = rcVar2.G;
                            } else if (str.equals("❌")) {
                                rcVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                rcVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f27110id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                rcVar2.F.settings.emoticon = str;
                            }
                            rcVar2.e1(true);
                            rcVar2.h1(true);
                            return;
                        default:
                            rc rcVar3 = this.f44909b.f45356c;
                            rcVar3.f49430s = ((Integer) obj).intValue();
                            if (rcVar3.D instanceof TLRPC.TL_emojiStatusCollectible) {
                                rcVar3.D = null;
                            }
                            rcVar3.e1(true);
                            rcVar3.i1();
                            rcVar3.g1(true);
                            return;
                    }
                }
            });
            pcVar = pcVar2;
        } else if (i7 == 5) {
            pcVar = new org.telegram.ui.Cells.m8(rcVar.getParentActivity(), rcVar.getResourceProvider());
        } else if (i7 == 6) {
            Activity parentActivity3 = rcVar.getParentActivity();
            g6Var6 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f45684e = false;
            frameLayout.d = g6Var6;
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(parentActivity3);
            frameLayout.f45681a = l5Var;
            l5Var.setTextSize(16);
            org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, g6Var6);
            frameLayout.addView(l5Var, c8.ha.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f45683c = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, frameLayout, false);
            pcVar = frameLayout;
        } else if (i7 == 3) {
            Activity parentActivity4 = rcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            g6Var5 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            ic icVar = new ic(i11, parentActivity4, g6Var5);
            icVar.f46566b.setOnItemClickListener(new di.q4(5, this, icVar));
            pcVar = icVar;
        } else if (i7 == 4) {
            Activity parentActivity5 = rcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            g6Var4 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            gm0 gm0Var = new gm0(0, i10, parentActivity5, g6Var4);
            gm0Var.setDivider(false);
            gm0Var.setOnColorClick(new org.telegram.messenger.c20(this) {
                public final ec f44909b;

                {
                    this.f44909b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            rc rcVar2 = this.f44909b.f45356c;
                            if (str == null) {
                                rcVar2.F = rcVar2.G;
                            } else if (str.equals("❌")) {
                                rcVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                rcVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f27110id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                rcVar2.F.settings.emoticon = str;
                            }
                            rcVar2.e1(true);
                            rcVar2.h1(true);
                            return;
                        default:
                            rc rcVar3 = this.f44909b.f45356c;
                            rcVar3.f49430s = ((Integer) obj).intValue();
                            if (rcVar3.D instanceof TLRPC.TL_emojiStatusCollectible) {
                                rcVar3.D = null;
                            }
                            rcVar3.e1(true);
                            rcVar3.i1();
                            rcVar3.g1(true);
                            return;
                    }
                }
            });
            pcVar = gm0Var;
        } else if (i7 == 1) {
            FrameLayout kcVar = new kc(rcVar, rcVar.getParentActivity());
            pcVar = kcVar;
            if (rcVar.d) {
                kcVar.setTag(-33024);
                pcVar = kcVar;
            }
        } else if (i7 == 8) {
            Activity parentActivity6 = rcVar.getParentActivity();
            g6Var3 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            pcVar = new org.telegram.ui.Cells.n4(parentActivity6, g6Var3);
        } else if (i7 == 9) {
            Activity parentActivity7 = rcVar.getParentActivity();
            g6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            pcVar = new sl0(parentActivity7, g6Var2, false);
        } else if (i7 == 10) {
            Activity parentActivity8 = rcVar.getParentActivity();
            g6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(parentActivity8, g6Var);
            mzVar.setIsSingleCell(true);
            mzVar.setViewType(35);
            pcVar = mzVar;
        } else {
            pcVar = new org.telegram.ui.Cells.z8(rcVar.getParentActivity());
        }
        return new v4.d1(pcVar);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        boolean z9 = view instanceof kc;
        rc rcVar = this.f45356c;
        if (z9) {
            jc jcVar = ((kc) view).f47260b;
            TLRPC.EmojiStatus emojiStatus = rcVar.D;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                jcVar.c(org.telegram.messenger.fp.a(emojiStatus), false);
                jcVar.d(((TLRPC.TL_emojiStatusCollectible) rcVar.D).pattern_document_id, true, false);
            } else {
                jcVar.b(rcVar.f49430s, false);
                jcVar.d(rcVar.f49437x, false, false);
            }
            jcVar.e(org.telegram.messenger.m5.f(rcVar.D), org.telegram.messenger.m5.B(rcVar.D), false);
            jcVar.setForum(rcVar.Y0());
            jcVar.a(rcVar.f49415f);
        } else if (view instanceof org.telegram.ui.Cells.z9) {
            ((org.telegram.ui.Cells.z9) view).setOverrideBackground(rcVar.H);
        } else {
            rc.f1(view);
        }
    }
}
