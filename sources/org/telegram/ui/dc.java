package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class dc extends org.telegram.ui.Components.bk0 {
    public final qc f46911c;

    public dc(qc qcVar) {
        this.f46911c = qcVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 5 && i7 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f46911c.S;
    }

    @Override
    public final int d(int i7) {
        qc qcVar = this.f46911c;
        if (i7 == qcVar.T) {
            return 0;
        }
        if (i7 == qcVar.X) {
            return 2;
        }
        if (i7 == qcVar.f51202a0) {
            return 1;
        }
        if (i7 == qcVar.U) {
            return 3;
        }
        if (i7 == qcVar.f51206c0) {
            return 4;
        }
        if (i7 != qcVar.V && i7 != qcVar.f51207d0 && i7 != qcVar.f51212g0 && i7 != qcVar.f51214i0 && i7 != qcVar.f51216k0) {
            if (i7 != qcVar.Y && i7 != qcVar.f51211f0) {
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
        qc qcVar = this.f46911c;
        long j3 = qcVar.f51201a;
        int i15 = f1Var.f59126f;
        View view = f1Var.f59122a;
        if (i15 != 1) {
            if (i15 != 3) {
                if (i15 != 4) {
                    if (i15 != 5) {
                        if (i15 != 6) {
                            if (i15 == 7) {
                                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                                z8Var.setFixedSize(0);
                                if (i7 == qcVar.f51204b0) {
                                    z8Var.setFixedSize(12);
                                    z8Var.setText("");
                                    return;
                                } else if (i7 == qcVar.W) {
                                    z8Var.setText(org.telegram.messenger.gd.M0(2131752299, null));
                                    return;
                                } else if (i7 == qcVar.Z) {
                                    z8Var.setText(org.telegram.messenger.gd.M0(qcVar.U0(), null));
                                    return;
                                } else if (i7 == qcVar.f51209e0) {
                                    z8Var.setText(org.telegram.messenger.gd.M0(qcVar.R0(), null));
                                    return;
                                } else if (i7 == qcVar.f51213h0) {
                                    z8Var.setText(org.telegram.messenger.gd.M0(qcVar.L0(), null));
                                    return;
                                } else if (i7 == qcVar.f51215j0) {
                                    z8Var.setText(org.telegram.messenger.gd.M0(qcVar.H0(), null));
                                    return;
                                } else if (i7 == qcVar.f51217l0) {
                                    z8Var.setText(org.telegram.messenger.gd.M0(qcVar.S0(), null));
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
                        ecVar.f47201e = false;
                        org.telegram.ui.ActionBar.n5 n5Var = ecVar.f47198a;
                        ecVar.setWillNotDraw(true);
                        if (i7 == qcVar.V) {
                            i14 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
                            ecVar.a(i14, qcVar.f51210f, true);
                            n5Var.l(org.telegram.messenger.gd.M0(2131752298, null), false);
                            if (qcVar.f51203b < qcVar.getMessagesController().f25770t5) {
                                ecVar.e(qcVar.getMessagesController().f25770t5);
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(qcVar.f51218n, false, false);
                            return;
                        } else if (i7 == qcVar.f51207d0) {
                            i13 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
                            ecVar.a(i13, qcVar.f51225s, false);
                            n5Var.l(org.telegram.messenger.gd.M0(2131752308, null), false);
                            if (qcVar.f51211f0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ecVar.f47201e = z10;
                            ecVar.setWillNotDraw(!z10);
                            if (qcVar.f51203b < qcVar.Q0()) {
                                ecVar.e(qcVar.Q0());
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(qcVar.f51232x, false, false);
                            return;
                        } else if (i7 == qcVar.f51212g0) {
                            i12 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
                            ecVar.a(i12, qcVar.f51225s, false);
                            n5Var.l(org.telegram.messenger.gd.M0(qcVar.N0(), null), false);
                            if (qcVar.f51203b < qcVar.M0()) {
                                ecVar.e(qcVar.M0());
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(org.telegram.messenger.n5.f(qcVar.E), org.telegram.messenger.n5.B(qcVar.E), false);
                            return;
                        } else if (i7 == qcVar.f51214i0) {
                            i11 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
                            ecVar.a(i11, qcVar.f51225s, false);
                            n5Var.l(org.telegram.messenger.gd.M0(qcVar.I0(), null), false);
                            if (qcVar.f51203b < qcVar.O0()) {
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
                        } else if (i7 == qcVar.f51216k0) {
                            n5Var.l(org.telegram.messenger.gd.M0(qcVar.T0(), null), false);
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
                    if (i7 == qcVar.f51211f0) {
                        m8Var.k(org.telegram.messenger.gd.M0(2131752313, null), false);
                        return;
                    }
                    m8Var.k(org.telegram.messenger.gd.M0(qcVar.W0(), null), false);
                    if (qcVar.f51203b < qcVar.G0()) {
                        m8Var.j(qcVar.G0());
                        return;
                    } else {
                        m8Var.j(0);
                        return;
                    }
                }
                ((im0) view).a(qcVar.f51225s, false);
                return;
            }
            ((hc) view).a(qcVar.f51210f, false);
            return;
        }
        jc jcVar = (jc) view;
        sl0 sl0Var = jcVar.f48943a;
        ic icVar = jcVar.f48944b;
        i10 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
        sl0Var.b(i10, qcVar.f51225s, false);
        icVar.b(qcVar.f51225s, false);
        icVar.d(qcVar.f51232x, false, false);
        icVar.setForum(qcVar.Y0());
        icVar.e(org.telegram.messenger.n5.f(qcVar.E), false, false);
        icVar.a(qcVar.f51210f);
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
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.i6 i6Var8;
        int i13;
        qc qcVar = this.f46911c;
        if (i7 == 0) {
            Activity parentActivity = qcVar.getParentActivity();
            s4Var = ((org.telegram.ui.ActionBar.h2) qcVar).parentLayout;
            int P0 = qcVar.P0();
            long j3 = qcVar.f51201a;
            i6Var8 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(parentActivity, s4Var, P0, j3, i6Var8);
            aaVar.G = true;
            aaVar.setImportantForAccessibility(4);
            aaVar.f30408x = qcVar;
            Drawable drawable = qcVar.I;
            i13 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            Drawable f10 = hi.w5.f(drawable, i13, qcVar.G, qcVar.K);
            qcVar.I = f10;
            aaVar.setOverrideBackground(f10);
            ocVar = aaVar;
        } else if (i7 == 2) {
            Activity parentActivity2 = qcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            i6Var7 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            oc ocVar2 = new oc(i12, parentActivity2, i6Var7);
            ocVar2.setWithRemovedStub(true);
            String j10 = org.telegram.messenger.f4.j(qcVar.G);
            if (j10 == null && qcVar.G == null && qcVar.H != null) {
                j10 = "❌";
            }
            ocVar2.a(j10, false);
            ocVar2.setGalleryWallpaper(qcVar.H);
            ocVar2.setOnEmoticonSelected(new org.telegram.messenger.x10(this) {
                public final dc f46480b;

                {
                    this.f46480b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            qc qcVar2 = this.f46480b.f46911c;
                            if (str == null) {
                                qcVar2.G = qcVar2.H;
                            } else if (str.equals("❌")) {
                                qcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                qcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f28559id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                qcVar2.G.settings.emoticon = str;
                            }
                            qcVar2.e1(true);
                            qcVar2.h1(true);
                            return;
                        default:
                            qc qcVar3 = this.f46480b.f46911c;
                            qcVar3.f51225s = ((Integer) obj).intValue();
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
            i6Var6 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f47201e = false;
            frameLayout.d = i6Var6;
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(parentActivity3);
            frameLayout.f47198a = n5Var;
            n5Var.setTextSize(16);
            org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var6);
            frameLayout.addView(n5Var, c8.ma.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f47200c = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 13, frameLayout, false);
            ocVar = frameLayout;
        } else if (i7 == 3) {
            Activity parentActivity4 = qcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            i6Var5 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            hc hcVar = new hc(i11, parentActivity4, i6Var5);
            hcVar.f48326b.setOnItemClickListener(new fi.g4(5, this, hcVar));
            ocVar = hcVar;
        } else if (i7 == 4) {
            Activity parentActivity5 = qcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            i6Var4 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            im0 im0Var = new im0(0, i10, parentActivity5, i6Var4);
            im0Var.setDivider(false);
            im0Var.setOnColorClick(new org.telegram.messenger.x10(this) {
                public final dc f46480b;

                {
                    this.f46480b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            qc qcVar2 = this.f46480b.f46911c;
                            if (str == null) {
                                qcVar2.G = qcVar2.H;
                            } else if (str.equals("❌")) {
                                qcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                qcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f28559id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                qcVar2.G.settings.emoticon = str;
                            }
                            qcVar2.e1(true);
                            qcVar2.h1(true);
                            return;
                        default:
                            qc qcVar3 = this.f46480b.f46911c;
                            qcVar3.f51225s = ((Integer) obj).intValue();
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
            i6Var3 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            ocVar = new org.telegram.ui.Cells.n4(parentActivity6, i6Var3);
        } else if (i7 == 9) {
            Activity parentActivity7 = qcVar.getParentActivity();
            i6Var2 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            ocVar = new ul0(parentActivity7, i6Var2, false);
        } else if (i7 == 10) {
            Activity parentActivity8 = qcVar.getParentActivity();
            i6Var = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(parentActivity8, i6Var);
            wzVar.setIsSingleCell(true);
            wzVar.setViewType(35);
            ocVar = wzVar;
        } else {
            ocVar = new org.telegram.ui.Cells.z8(qcVar.getParentActivity());
        }
        return new v4.f1(ocVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        boolean z10 = view instanceof jc;
        qc qcVar = this.f46911c;
        if (z10) {
            ic icVar = ((jc) view).f48944b;
            TLRPC.EmojiStatus emojiStatus = qcVar.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                icVar.c(org.telegram.messenger.bp.a(emojiStatus), false);
                icVar.d(((TLRPC.TL_emojiStatusCollectible) qcVar.E).pattern_document_id, true, false);
            } else {
                icVar.b(qcVar.f51225s, false);
                icVar.d(qcVar.f51232x, false, false);
            }
            icVar.e(org.telegram.messenger.n5.f(qcVar.E), org.telegram.messenger.n5.B(qcVar.E), false);
            icVar.setForum(qcVar.Y0());
            icVar.a(qcVar.f51210f);
        } else if (view instanceof org.telegram.ui.Cells.aa) {
            ((org.telegram.ui.Cells.aa) view).setOverrideBackground(qcVar.I);
        } else {
            qc.f1(view);
        }
    }
}
