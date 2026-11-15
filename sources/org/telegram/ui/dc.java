package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class dc extends org.telegram.ui.Components.tj0 {
    public final qc f46353c;

    public dc(qc qcVar) {
        this.f46353c = qcVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 5 && i7 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f46353c.S;
    }

    @Override
    public final int d(int i7) {
        qc qcVar = this.f46353c;
        if (i7 == qcVar.T) {
            return 0;
        }
        if (i7 == qcVar.X) {
            return 2;
        }
        if (i7 == qcVar.f50553a0) {
            return 1;
        }
        if (i7 == qcVar.U) {
            return 3;
        }
        if (i7 == qcVar.f50557c0) {
            return 4;
        }
        if (i7 != qcVar.V && i7 != qcVar.f50558d0 && i7 != qcVar.f50563g0 && i7 != qcVar.f50565i0 && i7 != qcVar.f50567k0) {
            if (i7 != qcVar.Y && i7 != qcVar.f50562f0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        TLRPC.StickerSet stickerSet;
        int i11;
        TLRPC.StickerSet stickerSet2;
        int i12;
        int i13;
        boolean z10;
        int i14;
        qc qcVar = this.f46353c;
        long j3 = qcVar.f50552a;
        int i15 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i15 != 1) {
            if (i15 != 3) {
                if (i15 != 4) {
                    if (i15 != 5) {
                        if (i15 != 6) {
                            if (i15 == 7) {
                                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                                y8Var.setFixedSize(0);
                                if (i7 == qcVar.f50555b0) {
                                    y8Var.setFixedSize(12);
                                    y8Var.setText("");
                                    return;
                                } else if (i7 == qcVar.W) {
                                    y8Var.setText(org.telegram.messenger.hd.M0(2131752310, null));
                                    return;
                                } else if (i7 == qcVar.Z) {
                                    y8Var.setText(org.telegram.messenger.hd.M0(qcVar.U0(), null));
                                    return;
                                } else if (i7 == qcVar.f50560e0) {
                                    y8Var.setText(org.telegram.messenger.hd.M0(qcVar.R0(), null));
                                    return;
                                } else if (i7 == qcVar.f50564h0) {
                                    y8Var.setText(org.telegram.messenger.hd.M0(qcVar.L0(), null));
                                    return;
                                } else if (i7 == qcVar.f50566j0) {
                                    y8Var.setText(org.telegram.messenger.hd.M0(qcVar.H0(), null));
                                    return;
                                } else if (i7 == qcVar.f50568l0) {
                                    y8Var.setText(org.telegram.messenger.hd.M0(qcVar.S0(), null));
                                    return;
                                } else if (i7 == 0) {
                                    y8Var.setText("");
                                    y8Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        ec ecVar = (ec) view;
                        ecVar.f46676e = false;
                        org.telegram.ui.ActionBar.j5 j5Var = ecVar.f46673a;
                        ecVar.setWillNotDraw(true);
                        if (i7 == qcVar.V) {
                            i14 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
                            ecVar.a(i14, qcVar.f50561f, true);
                            j5Var.l(org.telegram.messenger.hd.M0(2131752309, null), false);
                            if (qcVar.f50554b < qcVar.getMessagesController().f25381r5) {
                                ecVar.e(qcVar.getMessagesController().f25381r5);
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(qcVar.f50569n, false, false);
                            return;
                        } else if (i7 == qcVar.f50558d0) {
                            i13 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
                            ecVar.a(i13, qcVar.f50576s, false);
                            j5Var.l(org.telegram.messenger.hd.M0(2131752319, null), false);
                            if (qcVar.f50562f0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ecVar.f46676e = z10;
                            ecVar.setWillNotDraw(!z10);
                            if (qcVar.f50554b < qcVar.Q0()) {
                                ecVar.e(qcVar.Q0());
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(qcVar.f50583x, false, false);
                            return;
                        } else if (i7 == qcVar.f50563g0) {
                            i12 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
                            ecVar.a(i12, qcVar.f50576s, false);
                            j5Var.l(org.telegram.messenger.hd.M0(qcVar.N0(), null), false);
                            if (qcVar.f50554b < qcVar.M0()) {
                                ecVar.e(qcVar.M0());
                            } else {
                                ecVar.e(0);
                            }
                            ecVar.c(org.telegram.messenger.m5.f(qcVar.E), org.telegram.messenger.m5.B(qcVar.E), false);
                            return;
                        } else if (i7 == qcVar.f50565i0) {
                            i11 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
                            ecVar.a(i11, qcVar.f50576s, false);
                            j5Var.l(org.telegram.messenger.hd.M0(qcVar.I0(), null), false);
                            if (qcVar.f50554b < qcVar.O0()) {
                                ecVar.e(qcVar.O0());
                            } else {
                                ecVar.e(0);
                            }
                            TLRPC.ChatFull N0 = qcVar.getMessagesController().N0(-j3);
                            if (N0 != null && (stickerSet2 = N0.emojiset) != null) {
                                ecVar.c(qcVar.K0(stickerSet2), false, false);
                                return;
                            } else {
                                ecVar.c(0L, false, false);
                                return;
                            }
                        } else if (i7 == qcVar.f50567k0) {
                            j5Var.l(org.telegram.messenger.hd.M0(qcVar.T0(), null), false);
                            ecVar.e(0);
                            TLRPC.ChatFull N02 = qcVar.getMessagesController().N0(-j3);
                            if (N02 != null && (stickerSet = N02.stickerset) != null) {
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
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    if (i7 == qcVar.f50562f0) {
                        l8Var.k(org.telegram.messenger.hd.M0(2131752324, null), false);
                        return;
                    }
                    l8Var.k(org.telegram.messenger.hd.M0(qcVar.W0(), null), false);
                    if (qcVar.f50554b < qcVar.G0()) {
                        l8Var.j(qcVar.G0());
                        return;
                    } else {
                        l8Var.j(0);
                        return;
                    }
                }
                ((fm0) view).a(qcVar.f50576s, false);
                return;
            }
            ((hc) view).a(qcVar.f50561f, false);
            return;
        }
        jc jcVar = (jc) view;
        pl0 pl0Var = jcVar.f48299a;
        ic icVar = jcVar.f48300b;
        i10 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
        pl0Var.b(i10, qcVar.f50576s, false);
        icVar.b(qcVar.f50576s, false);
        icVar.d(qcVar.f50583x, false, false);
        icVar.setForum(qcVar.Y0());
        icVar.e(org.telegram.messenger.m5.f(qcVar.E), false, false);
        icVar.a(qcVar.f50561f);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
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
        oc ocVar;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.e6 e6Var8;
        int i13;
        qc qcVar = this.f46353c;
        if (i7 == 0) {
            Activity parentActivity = qcVar.getParentActivity();
            o4Var = ((org.telegram.ui.ActionBar.e2) qcVar).parentLayout;
            int P0 = qcVar.P0();
            long j3 = qcVar.f50552a;
            e6Var8 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(parentActivity, o4Var, P0, j3, e6Var8);
            z9Var.G = true;
            z9Var.setImportantForAccessibility(4);
            z9Var.f32140x = qcVar;
            Drawable drawable = qcVar.I;
            i13 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            Drawable f10 = hi.x5.f(drawable, i13, qcVar.G, qcVar.K);
            qcVar.I = f10;
            z9Var.setOverrideBackground(f10);
            ocVar = z9Var;
        } else if (i7 == 2) {
            Activity parentActivity2 = qcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            e6Var7 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            oc ocVar2 = new oc(i12, parentActivity2, e6Var7);
            ocVar2.setWithRemovedStub(true);
            String j10 = org.telegram.messenger.d4.j(qcVar.G);
            if (j10 == null && qcVar.G == null && qcVar.H != null) {
                j10 = "❌";
            }
            ocVar2.a(j10, false);
            ocVar2.setGalleryWallpaper(qcVar.H);
            ocVar2.setOnEmoticonSelected(new org.telegram.messenger.z10(this) {
                public final dc f46075b;

                {
                    this.f46075b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            qc qcVar2 = this.f46075b.f46353c;
                            if (str == null) {
                                qcVar2.G = qcVar2.H;
                            } else if (str.equals("❌")) {
                                qcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                qcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f28205id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                qcVar2.G.settings.emoticon = str;
                            }
                            qcVar2.e1(true);
                            qcVar2.h1(true);
                            return;
                        default:
                            qc qcVar3 = this.f46075b.f46353c;
                            qcVar3.f50576s = ((Integer) obj).intValue();
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
            ocVar = new org.telegram.ui.Cells.l8(qcVar.getParentActivity(), qcVar.getResourceProvider());
        } else if (i7 == 6) {
            Activity parentActivity3 = qcVar.getParentActivity();
            e6Var6 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f46676e = false;
            frameLayout.d = e6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            frameLayout.f46673a = j5Var;
            j5Var.setTextSize(16);
            org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, e6Var6);
            frameLayout.addView(j5Var, c8.ja.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f46675c = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, frameLayout, false);
            ocVar = frameLayout;
        } else if (i7 == 3) {
            Activity parentActivity4 = qcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            e6Var5 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            hc hcVar = new hc(i11, parentActivity4, e6Var5);
            hcVar.f47667b.setOnItemClickListener(new fi.i4(5, this, hcVar));
            ocVar = hcVar;
        } else if (i7 == 4) {
            Activity parentActivity5 = qcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            fm0 fm0Var = new fm0(0, i10, parentActivity5, e6Var4);
            fm0Var.setDivider(false);
            fm0Var.setOnColorClick(new org.telegram.messenger.z10(this) {
                public final dc f46075b;

                {
                    this.f46075b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            qc qcVar2 = this.f46075b.f46353c;
                            if (str == null) {
                                qcVar2.G = qcVar2.H;
                            } else if (str.equals("❌")) {
                                qcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                qcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f28205id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                qcVar2.G.settings.emoticon = str;
                            }
                            qcVar2.e1(true);
                            qcVar2.h1(true);
                            return;
                        default:
                            qc qcVar3 = this.f46075b.f46353c;
                            qcVar3.f50576s = ((Integer) obj).intValue();
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
            ocVar = fm0Var;
        } else if (i7 == 1) {
            FrameLayout jcVar = new jc(qcVar, qcVar.getParentActivity());
            ocVar = jcVar;
            if (qcVar.d) {
                jcVar.setTag(-33024);
                ocVar = jcVar;
            }
        } else if (i7 == 8) {
            Activity parentActivity6 = qcVar.getParentActivity();
            e6Var3 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            ocVar = new org.telegram.ui.Cells.n4(parentActivity6, e6Var3);
        } else if (i7 == 9) {
            Activity parentActivity7 = qcVar.getParentActivity();
            e6Var2 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            ocVar = new rl0(parentActivity7, e6Var2, false);
        } else if (i7 == 10) {
            Activity parentActivity8 = qcVar.getParentActivity();
            e6Var = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(parentActivity8, e6Var);
            pzVar.setIsSingleCell(true);
            pzVar.setViewType(35);
            ocVar = pzVar;
        } else {
            ocVar = new org.telegram.ui.Cells.y8(qcVar.getParentActivity());
        }
        return new v4.e1(ocVar);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        boolean z10 = view instanceof jc;
        qc qcVar = this.f46353c;
        if (z10) {
            ic icVar = ((jc) view).f48300b;
            TLRPC.EmojiStatus emojiStatus = qcVar.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                icVar.c(org.telegram.messenger.cp.a(emojiStatus), false);
                icVar.d(((TLRPC.TL_emojiStatusCollectible) qcVar.E).pattern_document_id, true, false);
            } else {
                icVar.b(qcVar.f50576s, false);
                icVar.d(qcVar.f50583x, false, false);
            }
            icVar.e(org.telegram.messenger.m5.f(qcVar.E), org.telegram.messenger.m5.B(qcVar.E), false);
            icVar.setForum(qcVar.Y0());
            icVar.a(qcVar.f50561f);
        } else if (view instanceof org.telegram.ui.Cells.z9) {
            ((org.telegram.ui.Cells.z9) view).setOverrideBackground(qcVar.I);
        } else {
            qc.f1(view);
        }
    }
}
