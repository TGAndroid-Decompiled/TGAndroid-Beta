package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class dc extends org.telegram.ui.Components.dk0 {
    public final qc f46912c;

    public dc(qc qcVar) {
        this.f46912c = qcVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59165f;
        if (i7 != 5 && i7 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f46912c.S;
    }

    @Override
    public final int d(int i7) {
        qc qcVar = this.f46912c;
        if (i7 == qcVar.T) {
            return 0;
        }
        if (i7 == qcVar.X) {
            return 2;
        }
        if (i7 == qcVar.f51206a0) {
            return 1;
        }
        if (i7 == qcVar.U) {
            return 3;
        }
        if (i7 == qcVar.f51210c0) {
            return 4;
        }
        if (i7 != qcVar.V && i7 != qcVar.f51211d0 && i7 != qcVar.f51216g0 && i7 != qcVar.f51218i0 && i7 != qcVar.f51220k0) {
            if (i7 != qcVar.Y && i7 != qcVar.f51215f0) {
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
        qc qcVar = this.f46912c;
        long j3 = qcVar.f51205a;
        int i15 = f1Var.f59165f;
        View view = f1Var.f59161a;
        if (i15 != 1) {
            if (i15 != 3) {
                if (i15 != 4) {
                    if (i15 != 5) {
                        if (i15 != 6) {
                            if (i15 == 7) {
                                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                                a9Var.setFixedSize(0);
                                if (i7 == qcVar.f51208b0) {
                                    a9Var.setFixedSize(12);
                                    a9Var.setText("");
                                    return;
                                } else if (i7 == qcVar.W) {
                                    a9Var.setText(org.telegram.messenger.gd.N0(2131752298, null));
                                    return;
                                } else if (i7 == qcVar.Z) {
                                    a9Var.setText(org.telegram.messenger.gd.N0(qcVar.U0(), null));
                                    return;
                                } else if (i7 == qcVar.f51213e0) {
                                    a9Var.setText(org.telegram.messenger.gd.N0(qcVar.R0(), null));
                                    return;
                                } else if (i7 == qcVar.f51217h0) {
                                    a9Var.setText(org.telegram.messenger.gd.N0(qcVar.L0(), null));
                                    return;
                                } else if (i7 == qcVar.f51219j0) {
                                    a9Var.setText(org.telegram.messenger.gd.N0(qcVar.H0(), null));
                                    return;
                                } else if (i7 == qcVar.f51221l0) {
                                    a9Var.setText(org.telegram.messenger.gd.N0(qcVar.S0(), null));
                                    return;
                                } else if (i7 == 0) {
                                    a9Var.setText("");
                                    a9Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        ec ecVar = (ec) view;
                        ecVar.f47226e = false;
                        org.telegram.ui.ActionBar.m5 m5Var = ecVar.f47223a;
                        ecVar.setWillNotDraw(true);
                        if (i7 == qcVar.V) {
                            i14 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
                            ecVar.a(i14, qcVar.f51214f, true);
                            m5Var.l(org.telegram.messenger.gd.N0(2131752297, null), false);
                            if (qcVar.f51207b < qcVar.getMessagesController().f25796t5) {
                                ecVar.e(qcVar.getMessagesController().f25796t5);
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(qcVar.f51222n, false, false);
                            return;
                        } else if (i7 == qcVar.f51211d0) {
                            i13 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
                            ecVar.a(i13, qcVar.f51229s, false);
                            m5Var.l(org.telegram.messenger.gd.N0(2131752307, null), false);
                            if (qcVar.f51215f0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ecVar.f47226e = z10;
                            ecVar.setWillNotDraw(!z10);
                            if (qcVar.f51207b < qcVar.Q0()) {
                                ecVar.e(qcVar.Q0());
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(qcVar.f51236x, false, false);
                            return;
                        } else if (i7 == qcVar.f51216g0) {
                            i12 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
                            ecVar.a(i12, qcVar.f51229s, false);
                            m5Var.l(org.telegram.messenger.gd.N0(qcVar.N0(), null), false);
                            if (qcVar.f51207b < qcVar.M0()) {
                                ecVar.e(qcVar.M0());
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(org.telegram.messenger.n5.f(qcVar.E), org.telegram.messenger.n5.B(qcVar.E), false);
                            return;
                        } else if (i7 == qcVar.f51218i0) {
                            i11 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
                            ecVar.a(i11, qcVar.f51229s, false);
                            m5Var.l(org.telegram.messenger.gd.N0(qcVar.I0(), null), false);
                            if (qcVar.f51207b < qcVar.O0()) {
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
                        } else if (i7 == qcVar.f51220k0) {
                            m5Var.l(org.telegram.messenger.gd.N0(qcVar.T0(), null), false);
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
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    if (i7 == qcVar.f51215f0) {
                        n8Var.k(org.telegram.messenger.gd.N0(2131752312, null), false);
                        return;
                    }
                    n8Var.k(org.telegram.messenger.gd.N0(qcVar.W0(), null), false);
                    if (qcVar.f51207b < qcVar.G0()) {
                        n8Var.j(qcVar.G0());
                        return;
                    } else {
                        n8Var.j(0);
                        return;
                    }
                }
                ((im0) view).a(qcVar.f51229s, false);
                return;
            }
            ((hc) view).a(qcVar.f51214f, false);
            return;
        }
        jc jcVar = (jc) view;
        sl0 sl0Var = jcVar.f48958a;
        ic icVar = jcVar.f48959b;
        i10 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
        sl0Var.b(i10, qcVar.f51229s, false);
        icVar.b(qcVar.f51229s, false);
        icVar.d(qcVar.f51236x, false, false);
        icVar.setForum(qcVar.Y0());
        icVar.e(org.telegram.messenger.n5.f(qcVar.E), false, false);
        icVar.a(qcVar.f51214f);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var4;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var5;
        org.telegram.ui.ActionBar.h6 h6Var6;
        int i12;
        org.telegram.ui.ActionBar.h6 h6Var7;
        oc ocVar;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.h6 h6Var8;
        int i13;
        qc qcVar = this.f46912c;
        if (i7 == 0) {
            Activity parentActivity = qcVar.getParentActivity();
            r4Var = ((org.telegram.ui.ActionBar.g2) qcVar).parentLayout;
            int P0 = qcVar.P0();
            long j3 = qcVar.f51205a;
            h6Var8 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(parentActivity, r4Var, P0, j3, h6Var8);
            baVar.G = true;
            baVar.setImportantForAccessibility(4);
            baVar.f30495x = qcVar;
            Drawable drawable = qcVar.I;
            i13 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
            Drawable f10 = hi.v5.f(drawable, i13, qcVar.G, qcVar.K);
            qcVar.I = f10;
            baVar.setOverrideBackground(f10);
            ocVar = baVar;
        } else if (i7 == 2) {
            Activity parentActivity2 = qcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
            h6Var7 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            oc ocVar2 = new oc(i12, parentActivity2, h6Var7);
            ocVar2.setWithRemovedStub(true);
            String j10 = org.telegram.messenger.f4.j(qcVar.G);
            if (j10 == null && qcVar.G == null && qcVar.H != null) {
                j10 = "❌";
            }
            ocVar2.a(j10, false);
            ocVar2.setGalleryWallpaper(qcVar.H);
            ocVar2.setOnEmoticonSelected(new org.telegram.messenger.x10(this) {
                public final dc f46507b;

                {
                    this.f46507b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            qc qcVar2 = this.f46507b.f46912c;
                            if (str == null) {
                                qcVar2.G = qcVar2.H;
                            } else if (str.equals("❌")) {
                                qcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                qcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f28585id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                qcVar2.G.settings.emoticon = str;
                            }
                            qcVar2.e1(true);
                            qcVar2.h1(true);
                            return;
                        default:
                            qc qcVar3 = this.f46507b.f46912c;
                            qcVar3.f51229s = ((Integer) obj).intValue();
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
            ocVar = new org.telegram.ui.Cells.n8(qcVar.getParentActivity(), qcVar.getResourceProvider());
        } else if (i7 == 6) {
            Activity parentActivity3 = qcVar.getParentActivity();
            h6Var6 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f47226e = false;
            frameLayout.d = h6Var6;
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(parentActivity3);
            frameLayout.f47223a = m5Var;
            m5Var.setTextSize(16);
            org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, h6Var6);
            frameLayout.addView(m5Var, c8.ma.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f47225c = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), 13, frameLayout, false);
            ocVar = frameLayout;
        } else if (i7 == 3) {
            Activity parentActivity4 = qcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
            h6Var5 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            hc hcVar = new hc(i11, parentActivity4, h6Var5);
            hcVar.f48311b.setOnItemClickListener(new fi.g4(5, this, hcVar));
            ocVar = hcVar;
        } else if (i7 == 4) {
            Activity parentActivity5 = qcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
            h6Var4 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            im0 im0Var = new im0(0, i10, parentActivity5, h6Var4);
            im0Var.setDivider(false);
            im0Var.setOnColorClick(new org.telegram.messenger.x10(this) {
                public final dc f46507b;

                {
                    this.f46507b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            qc qcVar2 = this.f46507b.f46912c;
                            if (str == null) {
                                qcVar2.G = qcVar2.H;
                            } else if (str.equals("❌")) {
                                qcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                qcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f28585id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                qcVar2.G.settings.emoticon = str;
                            }
                            qcVar2.e1(true);
                            qcVar2.h1(true);
                            return;
                        default:
                            qc qcVar3 = this.f46507b.f46912c;
                            qcVar3.f51229s = ((Integer) obj).intValue();
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
            ocVar = im0Var;
        } else if (i7 == 1) {
            FrameLayout jcVar = new jc(qcVar, qcVar.getParentActivity());
            ocVar = jcVar;
            if (qcVar.d) {
                jcVar.setTag(-33024);
                ocVar = jcVar;
            }
        } else if (i7 == 8) {
            Activity parentActivity6 = qcVar.getParentActivity();
            h6Var3 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            ocVar = new org.telegram.ui.Cells.o4(parentActivity6, h6Var3);
        } else if (i7 == 9) {
            Activity parentActivity7 = qcVar.getParentActivity();
            h6Var2 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            ocVar = new ul0(parentActivity7, h6Var2, false);
        } else if (i7 == 10) {
            Activity parentActivity8 = qcVar.getParentActivity();
            h6Var = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(parentActivity8, h6Var);
            yzVar.setIsSingleCell(true);
            yzVar.setViewType(35);
            ocVar = yzVar;
        } else {
            ocVar = new org.telegram.ui.Cells.a9(qcVar.getParentActivity());
        }
        return new v4.f1(ocVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        View view = f1Var.f59161a;
        boolean z10 = view instanceof jc;
        qc qcVar = this.f46912c;
        if (z10) {
            ic icVar = ((jc) view).f48959b;
            TLRPC.EmojiStatus emojiStatus = qcVar.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                icVar.c(org.telegram.messenger.bp.a(emojiStatus), false);
                icVar.d(((TLRPC.TL_emojiStatusCollectible) qcVar.E).pattern_document_id, true, false);
            } else {
                icVar.b(qcVar.f51229s, false);
                icVar.d(qcVar.f51236x, false, false);
            }
            icVar.e(org.telegram.messenger.n5.f(qcVar.E), org.telegram.messenger.n5.B(qcVar.E), false);
            icVar.setForum(qcVar.Y0());
            icVar.a(qcVar.f51214f);
        } else if (view instanceof org.telegram.ui.Cells.ba) {
            ((org.telegram.ui.Cells.ba) view).setOverrideBackground(qcVar.I);
        } else {
            qc.f1(view);
        }
    }
}
