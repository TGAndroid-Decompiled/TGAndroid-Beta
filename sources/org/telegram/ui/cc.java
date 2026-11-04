package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class cc extends org.telegram.ui.Components.sj0 {
    public final pc f44294c;

    public cc(pc pcVar) {
        this.f44294c = pcVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 5 && i3 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f44294c.S;
    }

    @Override
    public final int d(int i3) {
        pc pcVar = this.f44294c;
        if (i3 == pcVar.T) {
            return 0;
        }
        if (i3 == pcVar.X) {
            return 2;
        }
        if (i3 == pcVar.f48511a0) {
            return 1;
        }
        if (i3 == pcVar.U) {
            return 3;
        }
        if (i3 == pcVar.f48515c0) {
            return 4;
        }
        if (i3 != pcVar.V && i3 != pcVar.f48516d0 && i3 != pcVar.f48521g0 && i3 != pcVar.f48523i0 && i3 != pcVar.f48525k0) {
            if (i3 != pcVar.Y && i3 != pcVar.f48520f0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        TLRPC.StickerSet stickerSet;
        int i11;
        TLRPC.StickerSet stickerSet2;
        int i12;
        int i13;
        boolean z10;
        int i14;
        pc pcVar = this.f44294c;
        long j10 = pcVar.f48510a;
        int i15 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i15 != 1) {
            if (i15 != 3) {
                if (i15 != 4) {
                    if (i15 != 5) {
                        if (i15 != 6) {
                            if (i15 == 7) {
                                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                                y8Var.setFixedSize(0);
                                if (i3 == pcVar.f48513b0) {
                                    y8Var.setFixedSize(12);
                                    y8Var.setText("");
                                    return;
                                } else if (i3 == pcVar.W) {
                                    y8Var.setText(org.telegram.messenger.bd.M0(2131752310, null));
                                    return;
                                } else if (i3 == pcVar.Z) {
                                    y8Var.setText(org.telegram.messenger.bd.M0(pcVar.U0(), null));
                                    return;
                                } else if (i3 == pcVar.f48518e0) {
                                    y8Var.setText(org.telegram.messenger.bd.M0(pcVar.R0(), null));
                                    return;
                                } else if (i3 == pcVar.f48522h0) {
                                    y8Var.setText(org.telegram.messenger.bd.M0(pcVar.L0(), null));
                                    return;
                                } else if (i3 == pcVar.f48524j0) {
                                    y8Var.setText(org.telegram.messenger.bd.M0(pcVar.H0(), null));
                                    return;
                                } else if (i3 == pcVar.f48526l0) {
                                    y8Var.setText(org.telegram.messenger.bd.M0(pcVar.S0(), null));
                                    return;
                                } else if (i3 == 0) {
                                    y8Var.setText("");
                                    y8Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        dc dcVar = (dc) view;
                        dcVar.f44624e = false;
                        org.telegram.ui.ActionBar.k5 k5Var = dcVar.f44621a;
                        dcVar.setWillNotDraw(true);
                        if (i3 == pcVar.V) {
                            i14 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
                            dcVar.a(i14, pcVar.f48519f, true);
                            k5Var.l(org.telegram.messenger.bd.M0(2131752309, null), false);
                            if (pcVar.f48512b < pcVar.getMessagesController().f23100q5) {
                                dcVar.e(pcVar.getMessagesController().f23100q5);
                            } else {
                                dcVar.e(0);
                            }
                            dcVar.c(pcVar.f48527n, false, false);
                            return;
                        } else if (i3 == pcVar.f48516d0) {
                            i13 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
                            dcVar.a(i13, pcVar.f48534s, false);
                            k5Var.l(org.telegram.messenger.bd.M0(2131752319, null), false);
                            if (pcVar.f48520f0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            dcVar.f44624e = z10;
                            dcVar.setWillNotDraw(!z10);
                            if (pcVar.f48512b < pcVar.Q0()) {
                                dcVar.e(pcVar.Q0());
                            } else {
                                dcVar.e(0);
                            }
                            dcVar.c(pcVar.f48541x, false, false);
                            return;
                        } else if (i3 == pcVar.f48521g0) {
                            i12 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
                            dcVar.a(i12, pcVar.f48534s, false);
                            k5Var.l(org.telegram.messenger.bd.M0(pcVar.N0(), null), false);
                            if (pcVar.f48512b < pcVar.M0()) {
                                dcVar.e(pcVar.M0());
                            } else {
                                dcVar.e(0);
                            }
                            dcVar.c(org.telegram.messenger.m5.f(pcVar.E), org.telegram.messenger.m5.B(pcVar.E), false);
                            return;
                        } else if (i3 == pcVar.f48523i0) {
                            i11 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
                            dcVar.a(i11, pcVar.f48534s, false);
                            k5Var.l(org.telegram.messenger.bd.M0(pcVar.I0(), null), false);
                            if (pcVar.f48512b < pcVar.O0()) {
                                dcVar.e(pcVar.O0());
                            } else {
                                dcVar.e(0);
                            }
                            TLRPC.ChatFull N0 = pcVar.getMessagesController().N0(-j10);
                            if (N0 != null && (stickerSet2 = N0.emojiset) != null) {
                                dcVar.c(pcVar.K0(stickerSet2), false, false);
                                return;
                            } else {
                                dcVar.c(0L, false, false);
                                return;
                            }
                        } else if (i3 == pcVar.f48525k0) {
                            k5Var.l(org.telegram.messenger.bd.M0(pcVar.T0(), null), false);
                            dcVar.e(0);
                            TLRPC.ChatFull N02 = pcVar.getMessagesController().N0(-j10);
                            if (N02 != null && (stickerSet = N02.stickerset) != null) {
                                dcVar.d(pcVar.J0(stickerSet));
                                return;
                            } else {
                                dcVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    if (i3 == pcVar.f48520f0) {
                        l8Var.k(org.telegram.messenger.bd.M0(2131752324, null), false);
                        return;
                    }
                    l8Var.k(org.telegram.messenger.bd.M0(pcVar.W0(), null), false);
                    if (pcVar.f48512b < pcVar.G0()) {
                        l8Var.j(pcVar.G0());
                        return;
                    } else {
                        l8Var.j(0);
                        return;
                    }
                }
                ((zl0) view).a(pcVar.f48534s, false);
                return;
            }
            ((gc) view).a(pcVar.f48519f, false);
            return;
        }
        ic icVar = (ic) view;
        jl0 jl0Var = icVar.f46233a;
        hc hcVar = icVar.f46234b;
        i10 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
        jl0Var.b(i10, pcVar.f48534s, false);
        hcVar.b(pcVar.f48534s, false);
        hcVar.d(pcVar.f48541x, false, false);
        hcVar.setForum(pcVar.Y0());
        hcVar.e(org.telegram.messenger.m5.f(pcVar.E), false, false);
        hcVar.a(pcVar.f48519f);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var4;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var5;
        org.telegram.ui.ActionBar.e6 e6Var6;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var7;
        nc ncVar;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.e6 e6Var8;
        int i13;
        pc pcVar = this.f44294c;
        if (i3 == 0) {
            Activity parentActivity = pcVar.getParentActivity();
            q4Var = ((org.telegram.ui.ActionBar.d2) pcVar).parentLayout;
            int P0 = pcVar.P0();
            long j10 = pcVar.f48510a;
            e6Var8 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(parentActivity, q4Var, P0, j10, e6Var8);
            z9Var.G = true;
            z9Var.setImportantForAccessibility(4);
            z9Var.f31070x = pcVar;
            Drawable drawable = pcVar.I;
            i13 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            Drawable f10 = gi.y5.f(drawable, i13, pcVar.G, pcVar.K);
            pcVar.I = f10;
            z9Var.setOverrideBackground(f10);
            ncVar = z9Var;
        } else if (i3 == 2) {
            Activity parentActivity2 = pcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            e6Var7 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            nc ncVar2 = new nc(i12, parentActivity2, e6Var7);
            ncVar2.setWithRemovedStub(true);
            String j11 = org.telegram.messenger.d4.j(pcVar.G);
            if (j11 == null && pcVar.G == null && pcVar.H != null) {
                j11 = "❌";
            }
            ncVar2.a(j11, false);
            ncVar2.setGalleryWallpaper(pcVar.H);
            ncVar2.setOnEmoticonSelected(new org.telegram.messenger.u10(this) {
                public final cc f44018b;

                {
                    this.f44018b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            pc pcVar2 = this.f44018b.f44294c;
                            if (str == null) {
                                pcVar2.G = pcVar2.H;
                            } else if (str.equals("❌")) {
                                pcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                pcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f27155id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                pcVar2.G.settings.emoticon = str;
                            }
                            pcVar2.e1(true);
                            pcVar2.h1(true);
                            return;
                        default:
                            pc pcVar3 = this.f44018b.f44294c;
                            pcVar3.f48534s = ((Integer) obj).intValue();
                            if (pcVar3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                pcVar3.E = null;
                            }
                            pcVar3.e1(true);
                            pcVar3.i1();
                            pcVar3.g1(true);
                            return;
                    }
                }
            });
            ncVar = ncVar2;
        } else if (i3 == 5) {
            ncVar = new org.telegram.ui.Cells.l8(pcVar.getParentActivity(), pcVar.getResourceProvider());
        } else if (i3 == 6) {
            Activity parentActivity3 = pcVar.getParentActivity();
            e6Var6 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f44624e = false;
            frameLayout.d = e6Var6;
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(parentActivity3);
            frameLayout.f44621a = k5Var;
            k5Var.setTextSize(16);
            org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var6);
            frameLayout.addView(k5Var, b8.mf.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f44623c = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, frameLayout, false);
            ncVar = frameLayout;
        } else if (i3 == 3) {
            Activity parentActivity4 = pcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            e6Var5 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            gc gcVar = new gc(i11, parentActivity4, e6Var5);
            gcVar.f45629b.setOnItemClickListener(new ei.q4(5, this, gcVar));
            ncVar = gcVar;
        } else if (i3 == 4) {
            Activity parentActivity5 = pcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            zl0 zl0Var = new zl0(0, i10, parentActivity5, e6Var4);
            zl0Var.setDivider(false);
            zl0Var.setOnColorClick(new org.telegram.messenger.u10(this) {
                public final cc f44018b;

                {
                    this.f44018b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            pc pcVar2 = this.f44018b.f44294c;
                            if (str == null) {
                                pcVar2.G = pcVar2.H;
                            } else if (str.equals("❌")) {
                                pcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                pcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f27155id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                pcVar2.G.settings.emoticon = str;
                            }
                            pcVar2.e1(true);
                            pcVar2.h1(true);
                            return;
                        default:
                            pc pcVar3 = this.f44018b.f44294c;
                            pcVar3.f48534s = ((Integer) obj).intValue();
                            if (pcVar3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                pcVar3.E = null;
                            }
                            pcVar3.e1(true);
                            pcVar3.i1();
                            pcVar3.g1(true);
                            return;
                    }
                }
            });
            ncVar = zl0Var;
        } else if (i3 == 1) {
            FrameLayout icVar = new ic(pcVar, pcVar.getParentActivity());
            ncVar = icVar;
            if (pcVar.d) {
                icVar.setTag(-33024);
                ncVar = icVar;
            }
        } else if (i3 == 8) {
            Activity parentActivity6 = pcVar.getParentActivity();
            e6Var3 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            ncVar = new org.telegram.ui.Cells.n4(parentActivity6, e6Var3);
        } else if (i3 == 9) {
            Activity parentActivity7 = pcVar.getParentActivity();
            e6Var2 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            ncVar = new ll0(parentActivity7, e6Var2, false);
        } else if (i3 == 10) {
            Activity parentActivity8 = pcVar.getParentActivity();
            e6Var = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(parentActivity8, e6Var);
            izVar.setIsSingleCell(true);
            izVar.setViewType(35);
            ncVar = izVar;
        } else {
            ncVar = new org.telegram.ui.Cells.y8(pcVar.getParentActivity());
        }
        return new u4.d1(ncVar);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        boolean z10 = view instanceof ic;
        pc pcVar = this.f44294c;
        if (z10) {
            hc hcVar = ((ic) view).f46234b;
            TLRPC.EmojiStatus emojiStatus = pcVar.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                hcVar.c(org.telegram.messenger.wo.a(emojiStatus), false);
                hcVar.d(((TLRPC.TL_emojiStatusCollectible) pcVar.E).pattern_document_id, true, false);
            } else {
                hcVar.b(pcVar.f48534s, false);
                hcVar.d(pcVar.f48541x, false, false);
            }
            hcVar.e(org.telegram.messenger.m5.f(pcVar.E), org.telegram.messenger.m5.B(pcVar.E), false);
            hcVar.setForum(pcVar.Y0());
            hcVar.a(pcVar.f48519f);
        } else if (view instanceof org.telegram.ui.Cells.z9) {
            ((org.telegram.ui.Cells.z9) view).setOverrideBackground(pcVar.I);
        } else {
            pc.f1(view);
        }
    }
}
