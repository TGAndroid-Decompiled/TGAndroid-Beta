package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class pc extends org.telegram.ui.Components.ul0 {
    public final cd f35786c;

    public pc(cd cdVar) {
        this.f35786c = cdVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f35786c.R;
    }

    @Override
    public final int j(int i10) {
        cd cdVar = this.f35786c;
        if (i10 == cdVar.S) {
            return 0;
        }
        if (i10 == cdVar.W) {
            return 2;
        }
        if (i10 == cdVar.Z) {
            return 1;
        }
        if (i10 == cdVar.T) {
            return 3;
        }
        if (i10 == cdVar.f31611b0) {
            return 4;
        }
        if (i10 != cdVar.U && i10 != cdVar.f31613c0 && i10 != cdVar.f31617f0 && i10 != cdVar.f31619h0 && i10 != cdVar.f31621j0) {
            if (i10 != cdVar.X && i10 != cdVar.f31615e0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        cd cdVar = this.f35786c;
        long j3 = cdVar.f31608a;
        int i16 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                                f9Var.setFixedSize(0);
                                if (i10 == cdVar.f31609a0) {
                                    f9Var.setFixedSize(12);
                                    f9Var.setText("");
                                    return;
                                } else if (i10 == cdVar.V) {
                                    f9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == cdVar.Y) {
                                    f9Var.setText(LocaleController.getString(cdVar.N0()));
                                    return;
                                } else if (i10 == cdVar.f31614d0) {
                                    f9Var.setText(LocaleController.getString(cdVar.K0()));
                                    return;
                                } else if (i10 == cdVar.f31618g0) {
                                    f9Var.setText(LocaleController.getString(cdVar.E0()));
                                    return;
                                } else if (i10 == cdVar.f31620i0) {
                                    f9Var.setText(LocaleController.getString(cdVar.A0()));
                                    return;
                                } else if (i10 == cdVar.f31622k0) {
                                    f9Var.setText(LocaleController.getString(cdVar.L0()));
                                    return;
                                } else if (i10 == 0) {
                                    f9Var.setText("");
                                    f9Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        qc qcVar = (qc) view;
                        qcVar.e = false;
                        org.telegram.ui.ActionBar.l5 l5Var = qcVar.f36014a;
                        qcVar.setWillNotDraw(true);
                        if (i10 == cdVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
                            qcVar.a(i15, cdVar.f31616f, true);
                            l5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (cdVar.f31610b < cdVar.getMessagesController().channelBgIconLevelMin) {
                                qcVar.e(cdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                qcVar.e(0);
                            }
                            qcVar.c(cdVar.f31624n, false, false);
                            return;
                        } else if (i10 == cdVar.f31613c0) {
                            i14 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
                            qcVar.a(i14, cdVar.f31631s, false);
                            l5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (cdVar.f31615e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            qcVar.e = z10;
                            qcVar.setWillNotDraw(!z10);
                            if (cdVar.f31610b < cdVar.J0()) {
                                qcVar.e(cdVar.J0());
                            } else {
                                qcVar.e(0);
                            }
                            qcVar.c(cdVar.f31636w, false, false);
                            return;
                        } else if (i10 == cdVar.f31617f0) {
                            i13 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
                            qcVar.a(i13, cdVar.f31631s, false);
                            l5Var.l(LocaleController.getString(cdVar.G0()), false);
                            if (cdVar.f31610b < cdVar.F0()) {
                                qcVar.e(cdVar.F0());
                            } else {
                                qcVar.e(0);
                            }
                            qcVar.c(DialogObject.getEmojiStatusDocumentId(cdVar.f31640y), DialogObject.isEmojiStatusCollectible(cdVar.f31640y), false);
                            return;
                        } else if (i10 == cdVar.f31619h0) {
                            i12 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
                            qcVar.a(i12, cdVar.f31631s, false);
                            l5Var.l(LocaleController.getString(cdVar.B0()), false);
                            if (cdVar.f31610b < cdVar.H0()) {
                                qcVar.e(cdVar.H0());
                            } else {
                                qcVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = cdVar.getMessagesController().getChatFull(-j3);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                qcVar.c(cdVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                qcVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == cdVar.f31621j0) {
                            l5Var.l(LocaleController.getString(cdVar.M0()), false);
                            qcVar.e(0);
                            TLRPC.ChatFull chatFull2 = cdVar.getMessagesController().getChatFull(-j3);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                qcVar.d(cdVar.C0(stickerSet));
                                return;
                            } else {
                                qcVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    if (i10 == cdVar.f31615e0) {
                        s8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    s8Var.i(LocaleController.getString(cdVar.P0()), false);
                    if (cdVar.f31610b < cdVar.z0()) {
                        s8Var.h(cdVar.z0());
                        return;
                    } else {
                        s8Var.h(0);
                        return;
                    }
                }
                ((xp0) view).a(cdVar.f31631s, false);
                return;
            }
            ((tc) view).a(cdVar.f31616f, false);
            return;
        }
        vc vcVar = (vc) view;
        gp0 gp0Var = vcVar.f37531a;
        uc ucVar = vcVar.f37532b;
        i11 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
        gp0Var.b(i11, cdVar.f31631s, false);
        ucVar.b(cdVar.f31631s, false);
        ucVar.d(cdVar.f31636w, false, false);
        ucVar.setForum(cdVar.R0());
        ucVar.e(DialogObject.getEmojiStatusDocumentId(cdVar.f31640y), false, false);
        ucVar.a(cdVar.f31616f);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var4;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var5;
        org.telegram.ui.ActionBar.f6 f6Var6;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var7;
        ad adVar;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f6 f6Var8;
        int i14;
        cd cdVar = this.f35786c;
        if (i10 == 0) {
            Activity parentActivity = cdVar.getParentActivity();
            f5Var = ((org.telegram.ui.ActionBar.p2) cdVar).parentLayout;
            int I0 = cdVar.I0();
            long j3 = cdVar.f31608a;
            f6Var8 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(parentActivity, f5Var, I0, j3, f6Var8);
            kaVar.f19461x = true;
            kaVar.setImportantForAccessibility(4);
            kaVar.f19458r = cdVar;
            Drawable drawable = cdVar.H;
            i14 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            Drawable f7 = bi.e8.f(drawable, i14, cdVar.F, cdVar.J);
            cdVar.H = f7;
            kaVar.setOverrideBackground(f7);
            adVar = kaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = cdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            f6Var7 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            ad adVar2 = new ad(i13, parentActivity2, f6Var7);
            adVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(cdVar.F);
            if (wallpaperEmoticon == null && cdVar.F == null && cdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            adVar2.a(wallpaperEmoticon, false);
            adVar2.setGalleryWallpaper(cdVar.G);
            adVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final pc f35458b;

                {
                    this.f35458b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            cd cdVar2 = this.f35458b.f35786c;
                            if (str == null) {
                                cdVar2.F = cdVar2.G;
                            } else if (str.equals("❌")) {
                                cdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                cdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f17347id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                cdVar2.F.settings.emoticon = str;
                            }
                            cdVar2.X0(true);
                            cdVar2.a1(true);
                            return;
                        default:
                            cd cdVar3 = this.f35458b.f35786c;
                            cdVar3.f31631s = ((Integer) obj).intValue();
                            if (cdVar3.f31640y instanceof TLRPC.TL_emojiStatusCollectible) {
                                cdVar3.f31640y = null;
                            }
                            cdVar3.X0(true);
                            cdVar3.b1();
                            cdVar3.Z0(true);
                            return;
                    }
                }
            });
            adVar = adVar2;
        } else if (i10 == 5) {
            adVar = new org.telegram.ui.Cells.s8(cdVar.getParentActivity(), cdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = cdVar.getParentActivity();
            f6Var6 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = f6Var6;
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(parentActivity3);
            frameLayout.f36014a = l5Var;
            l5Var.setTextSize(16);
            l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var6));
            frameLayout.addView(l5Var, w7.a6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f36016c = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            adVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = cdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            f6Var5 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            tc tcVar = new tc(i12, parentActivity4, f6Var5);
            tcVar.f36900b.setOnItemClickListener(new ai.b0(4, this, tcVar));
            adVar = tcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = cdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            xp0 xp0Var = new xp0(0, i11, parentActivity5, f6Var4);
            xp0Var.setDivider(false);
            xp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final pc f35458b;

                {
                    this.f35458b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            cd cdVar2 = this.f35458b.f35786c;
                            if (str == null) {
                                cdVar2.F = cdVar2.G;
                            } else if (str.equals("❌")) {
                                cdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                cdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f17347id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                cdVar2.F.settings.emoticon = str;
                            }
                            cdVar2.X0(true);
                            cdVar2.a1(true);
                            return;
                        default:
                            cd cdVar3 = this.f35458b.f35786c;
                            cdVar3.f31631s = ((Integer) obj).intValue();
                            if (cdVar3.f31640y instanceof TLRPC.TL_emojiStatusCollectible) {
                                cdVar3.f31640y = null;
                            }
                            cdVar3.X0(true);
                            cdVar3.b1();
                            cdVar3.Z0(true);
                            return;
                    }
                }
            });
            adVar = xp0Var;
        } else if (i10 == 1) {
            FrameLayout vcVar = new vc(cdVar, cdVar.getParentActivity());
            adVar = vcVar;
            if (cdVar.d) {
                vcVar.setTag(-33024);
                adVar = vcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = cdVar.getParentActivity();
            f6Var3 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            adVar = new org.telegram.ui.Cells.m4(parentActivity6, f6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = cdVar.getParentActivity();
            f6Var2 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            adVar = new ip0(parentActivity7, f6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = cdVar.getParentActivity();
            f6Var = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(parentActivity8, f6Var);
            a10Var.setIsSingleCell(true);
            a10Var.setViewType(35);
            adVar = a10Var;
        } else {
            adVar = new org.telegram.ui.Cells.f9(cdVar.getParentActivity());
        }
        return new s4.c1(adVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        boolean z10 = view instanceof vc;
        cd cdVar = this.f35786c;
        if (z10) {
            uc ucVar = ((vc) view).f37532b;
            TLRPC.EmojiStatus emojiStatus = cdVar.f31640y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ucVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                ucVar.d(((TLRPC.TL_emojiStatusCollectible) cdVar.f31640y).pattern_document_id, true, false);
            } else {
                ucVar.b(cdVar.f31631s, false);
                ucVar.d(cdVar.f31636w, false, false);
            }
            ucVar.e(DialogObject.getEmojiStatusDocumentId(cdVar.f31640y), DialogObject.isEmojiStatusCollectible(cdVar.f31640y), false);
            ucVar.setForum(cdVar.R0());
            ucVar.a(cdVar.f31616f);
        } else if (view instanceof org.telegram.ui.Cells.ka) {
            ((org.telegram.ui.Cells.ka) view).setOverrideBackground(cdVar.H);
        } else {
            cd.Y0(view);
        }
    }
}
