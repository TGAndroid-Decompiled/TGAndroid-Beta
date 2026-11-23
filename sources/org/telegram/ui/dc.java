package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class dc extends org.telegram.ui.Components.dk0 {
    public final qc f47027c;

    public dc(qc qcVar) {
        this.f47027c = qcVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 5 && i7 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f47027c.S;
    }

    @Override
    public final int d(int i7) {
        qc qcVar = this.f47027c;
        if (i7 == qcVar.T) {
            return 0;
        }
        if (i7 == qcVar.X) {
            return 2;
        }
        if (i7 == qcVar.f51402a0) {
            return 1;
        }
        if (i7 == qcVar.U) {
            return 3;
        }
        if (i7 == qcVar.f51406c0) {
            return 4;
        }
        if (i7 != qcVar.V && i7 != qcVar.f51407d0 && i7 != qcVar.f51412g0 && i7 != qcVar.f51414i0 && i7 != qcVar.f51416k0) {
            if (i7 != qcVar.Y && i7 != qcVar.f51411f0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        TLRPC.StickerSet stickerSet;
        int i11;
        TLRPC.StickerSet stickerSet2;
        int i12;
        int i13;
        boolean z10;
        int i14;
        qc qcVar = this.f47027c;
        long j3 = qcVar.f51401a;
        int i15 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i15 != 1) {
            if (i15 != 3) {
                if (i15 != 4) {
                    if (i15 != 5) {
                        if (i15 != 6) {
                            if (i15 == 7) {
                                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                                z8Var.setFixedSize(0);
                                if (i7 == qcVar.f51404b0) {
                                    z8Var.setFixedSize(12);
                                    z8Var.setText("");
                                    return;
                                } else if (i7 == qcVar.W) {
                                    z8Var.setText(org.telegram.messenger.gd.N0(2131752298, null));
                                    return;
                                } else if (i7 == qcVar.Z) {
                                    z8Var.setText(org.telegram.messenger.gd.N0(qcVar.U0(), null));
                                    return;
                                } else if (i7 == qcVar.f51409e0) {
                                    z8Var.setText(org.telegram.messenger.gd.N0(qcVar.R0(), null));
                                    return;
                                } else if (i7 == qcVar.f51413h0) {
                                    z8Var.setText(org.telegram.messenger.gd.N0(qcVar.L0(), null));
                                    return;
                                } else if (i7 == qcVar.f51415j0) {
                                    z8Var.setText(org.telegram.messenger.gd.N0(qcVar.H0(), null));
                                    return;
                                } else if (i7 == qcVar.f51417l0) {
                                    z8Var.setText(org.telegram.messenger.gd.N0(qcVar.S0(), null));
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
                        ec ecVar = (ec) view;
                        ecVar.f47499e = false;
                        org.telegram.ui.ActionBar.n5 n5Var = ecVar.f47496a;
                        ecVar.setWillNotDraw(true);
                        if (i7 == qcVar.V) {
                            i14 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
                            ecVar.a(i14, qcVar.f51410f, true);
                            n5Var.l(org.telegram.messenger.gd.N0(2131752297, null), false);
                            if (qcVar.f51403b < qcVar.getMessagesController().f25863t5) {
                                ecVar.e(qcVar.getMessagesController().f25863t5);
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(qcVar.f51418n, false, false);
                            return;
                        } else if (i7 == qcVar.f51407d0) {
                            i13 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
                            ecVar.a(i13, qcVar.f51425s, false);
                            n5Var.l(org.telegram.messenger.gd.N0(2131752307, null), false);
                            if (qcVar.f51411f0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ecVar.f47499e = z10;
                            ecVar.setWillNotDraw(!z10);
                            if (qcVar.f51403b < qcVar.Q0()) {
                                ecVar.e(qcVar.Q0());
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(qcVar.f51432x, false, false);
                            return;
                        } else if (i7 == qcVar.f51412g0) {
                            i12 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
                            ecVar.a(i12, qcVar.f51425s, false);
                            n5Var.l(org.telegram.messenger.gd.N0(qcVar.N0(), null), false);
                            if (qcVar.f51403b < qcVar.M0()) {
                                ecVar.e(qcVar.M0());
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(org.telegram.messenger.n5.f(qcVar.E), org.telegram.messenger.n5.B(qcVar.E), false);
                            return;
                        } else if (i7 == qcVar.f51414i0) {
                            i11 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
                            ecVar.a(i11, qcVar.f51425s, false);
                            n5Var.l(org.telegram.messenger.gd.N0(qcVar.I0(), null), false);
                            if (qcVar.f51403b < qcVar.O0()) {
                                ecVar.e(qcVar.O0());
                            } else {
                                ecVar.e(0);
                            }
                            TLRPC.ChatFull P0 = qcVar.getMessagesController().P0(-j3);
                            if (P0 != null && (stickerSet2 = P0.emojiset) != null) {
                                ecVar.c(qcVar.K0(stickerSet2), false, false);
                                return;
                            } else {
                                ecVar.c(0L, false, false);
                                return;
                            }
                        } else if (i7 == qcVar.f51416k0) {
                            n5Var.l(org.telegram.messenger.gd.N0(qcVar.T0(), null), false);
                            ecVar.e(0);
                            TLRPC.ChatFull P02 = qcVar.getMessagesController().P0(-j3);
                            if (P02 != null && (stickerSet = P02.stickerset) != null) {
                                ecVar.d(qcVar.J0(stickerSet));
                                return;
                            } else {
                                ecVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (i7 == qcVar.f51411f0) {
                        m8Var.k(org.telegram.messenger.gd.N0(2131752312, null), false);
                        return;
                    }
                    m8Var.k(org.telegram.messenger.gd.N0(qcVar.W0(), null), false);
                    if (qcVar.f51403b < qcVar.G0()) {
                        m8Var.j(qcVar.G0());
                        return;
                    } else {
                        m8Var.j(0);
                        return;
                    }
                }
                ((gm0) view).a(qcVar.f51425s, false);
                return;
            }
            ((hc) view).a(qcVar.f51410f, false);
            return;
        }
        jc jcVar = (jc) view;
        ql0 ql0Var = jcVar.f49085a;
        ic icVar = jcVar.f49086b;
        i10 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
        ql0Var.b(i10, qcVar.f51425s, false);
        icVar.b(qcVar.f51425s, false);
        icVar.d(qcVar.f51432x, false, false);
        icVar.setForum(qcVar.Y0());
        icVar.e(org.telegram.messenger.n5.f(qcVar.E), false, false);
        icVar.a(qcVar.f51410f);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var4;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var5;
        org.telegram.ui.ActionBar.i6 i6Var6;
        int i12;
        org.telegram.ui.ActionBar.i6 i6Var7;
        oc ocVar;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.i6 i6Var8;
        int i13;
        qc qcVar = this.f47027c;
        if (i7 == 0) {
            Activity parentActivity = qcVar.getParentActivity();
            r4Var = ((org.telegram.ui.ActionBar.g2) qcVar).parentLayout;
            int P0 = qcVar.P0();
            long j3 = qcVar.f51401a;
            i6Var8 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(parentActivity, r4Var, P0, j3, i6Var8);
            baVar.G = true;
            baVar.setImportantForAccessibility(4);
            baVar.f30549x = qcVar;
            Drawable drawable = qcVar.I;
            i13 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
            Drawable f10 = hi.f6.f(drawable, i13, qcVar.G, qcVar.K);
            qcVar.I = f10;
            baVar.setOverrideBackground(f10);
            ocVar = baVar;
        } else if (i7 == 2) {
            Activity parentActivity2 = qcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
            i6Var7 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            oc ocVar2 = new oc(i12, parentActivity2, i6Var7);
            ocVar2.setWithRemovedStub(true);
            String j10 = org.telegram.messenger.f4.j(qcVar.G);
            if (j10 == null && qcVar.G == null && qcVar.H != null) {
                j10 = "❌";
            }
            ocVar2.a(j10, false);
            ocVar2.setGalleryWallpaper(qcVar.H);
            ocVar2.setOnEmoticonSelected(new org.telegram.messenger.w10(this) {
                public final dc f46761b;

                {
                    this.f46761b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            qc qcVar2 = this.f46761b.f47027c;
                            if (str == null) {
                                qcVar2.G = qcVar2.H;
                            } else if (str.equals("❌")) {
                                qcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                qcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f28646id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                qcVar2.G.settings.emoticon = str;
                            }
                            qcVar2.e1(true);
                            qcVar2.h1(true);
                            return;
                        default:
                            qc qcVar3 = this.f46761b.f47027c;
                            qcVar3.f51425s = ((Integer) obj).intValue();
                            if (qcVar3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                qcVar3.E = null;
                            }
                            qcVar3.e1(true);
                            qcVar3.i1();
                            qcVar3.g1(true);
                            return;
                    }
                }
            });
            ocVar = ocVar2;
        } else if (i7 == 5) {
            ocVar = new org.telegram.ui.Cells.m8(qcVar.getParentActivity(), qcVar.getResourceProvider());
        } else if (i7 == 6) {
            Activity parentActivity3 = qcVar.getParentActivity();
            i6Var6 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f47499e = false;
            frameLayout.d = i6Var6;
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(parentActivity3);
            frameLayout.f47496a = n5Var;
            n5Var.setTextSize(16);
            org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var6);
            frameLayout.addView(n5Var, c8.na.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f47498c = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 13, frameLayout, false);
            ocVar = frameLayout;
        } else if (i7 == 3) {
            Activity parentActivity4 = qcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
            i6Var5 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            hc hcVar = new hc(i11, parentActivity4, i6Var5);
            hcVar.f48529b.setOnItemClickListener(new fi.g4(5, this, hcVar));
            ocVar = hcVar;
        } else if (i7 == 4) {
            Activity parentActivity5 = qcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
            i6Var4 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            gm0 gm0Var = new gm0(0, i10, parentActivity5, i6Var4);
            gm0Var.setDivider(false);
            gm0Var.setOnColorClick(new org.telegram.messenger.w10(this) {
                public final dc f46761b;

                {
                    this.f46761b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            qc qcVar2 = this.f46761b.f47027c;
                            if (str == null) {
                                qcVar2.G = qcVar2.H;
                            } else if (str.equals("❌")) {
                                qcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                qcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f28646id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                qcVar2.G.settings.emoticon = str;
                            }
                            qcVar2.e1(true);
                            qcVar2.h1(true);
                            return;
                        default:
                            qc qcVar3 = this.f46761b.f47027c;
                            qcVar3.f51425s = ((Integer) obj).intValue();
                            if (qcVar3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                qcVar3.E = null;
                            }
                            qcVar3.e1(true);
                            qcVar3.i1();
                            qcVar3.g1(true);
                            return;
                    }
                }
            });
            ocVar = gm0Var;
        } else if (i7 == 1) {
            FrameLayout jcVar = new jc(qcVar, qcVar.getParentActivity());
            ocVar = jcVar;
            if (qcVar.d) {
                jcVar.setTag(-33024);
                ocVar = jcVar;
            }
        } else if (i7 == 8) {
            Activity parentActivity6 = qcVar.getParentActivity();
            i6Var3 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            ocVar = new org.telegram.ui.Cells.o4(parentActivity6, i6Var3);
        } else if (i7 == 9) {
            Activity parentActivity7 = qcVar.getParentActivity();
            i6Var2 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            ocVar = new sl0(parentActivity7, i6Var2, false);
        } else if (i7 == 10) {
            Activity parentActivity8 = qcVar.getParentActivity();
            i6Var = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(parentActivity8, i6Var);
            vzVar.setIsSingleCell(true);
            vzVar.setViewType(35);
            ocVar = vzVar;
        } else {
            ocVar = new org.telegram.ui.Cells.z8(qcVar.getParentActivity());
        }
        return new v4.f1(ocVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        boolean z10 = view instanceof jc;
        qc qcVar = this.f47027c;
        if (z10) {
            ic icVar = ((jc) view).f49086b;
            TLRPC.EmojiStatus emojiStatus = qcVar.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                icVar.c(org.telegram.messenger.bp.a(emojiStatus), false);
                icVar.d(((TLRPC.TL_emojiStatusCollectible) qcVar.E).pattern_document_id, true, false);
            } else {
                icVar.b(qcVar.f51425s, false);
                icVar.d(qcVar.f51432x, false, false);
            }
            icVar.e(org.telegram.messenger.n5.f(qcVar.E), org.telegram.messenger.n5.B(qcVar.E), false);
            icVar.setForum(qcVar.Y0());
            icVar.a(qcVar.f51410f);
        } else if (view instanceof org.telegram.ui.Cells.ba) {
            ((org.telegram.ui.Cells.ba) view).setOverrideBackground(qcVar.I);
        } else {
            qc.f1(view);
        }
    }
}
