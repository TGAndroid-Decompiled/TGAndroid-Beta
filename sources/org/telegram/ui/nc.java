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
public final class nc extends org.telegram.ui.Components.lm0 {
    public final bd f39845c;

    public nc(bd bdVar) {
        this.f39845c = bdVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f39845c.R;
    }

    @Override
    public final int j(int i10) {
        bd bdVar = this.f39845c;
        if (i10 == bdVar.S) {
            return 0;
        }
        if (i10 == bdVar.W) {
            return 2;
        }
        if (i10 == bdVar.Z) {
            return 1;
        }
        if (i10 == bdVar.T) {
            return 3;
        }
        if (i10 == bdVar.f36020b0) {
            return 4;
        }
        if (i10 != bdVar.U && i10 != bdVar.f36022c0 && i10 != bdVar.f36026f0 && i10 != bdVar.f36028h0 && i10 != bdVar.f36030j0) {
            if (i10 != bdVar.X && i10 != bdVar.f36024e0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        bd bdVar = this.f39845c;
        long j10 = bdVar.f36017a;
        int i16 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                                e9Var.setFixedSize(0);
                                if (i10 == bdVar.f36018a0) {
                                    e9Var.setFixedSize(12);
                                    e9Var.setText("");
                                    return;
                                } else if (i10 == bdVar.V) {
                                    e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == bdVar.Y) {
                                    e9Var.setText(LocaleController.getString(bdVar.P0()));
                                    return;
                                } else if (i10 == bdVar.f36023d0) {
                                    e9Var.setText(LocaleController.getString(bdVar.M0()));
                                    return;
                                } else if (i10 == bdVar.f36027g0) {
                                    e9Var.setText(LocaleController.getString(bdVar.G0()));
                                    return;
                                } else if (i10 == bdVar.f36029i0) {
                                    e9Var.setText(LocaleController.getString(bdVar.C0()));
                                    return;
                                } else if (i10 == bdVar.f36031k0) {
                                    e9Var.setText(LocaleController.getString(bdVar.N0()));
                                    return;
                                } else if (i10 == 0) {
                                    e9Var.setText("");
                                    e9Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        oc ocVar = (oc) view;
                        ocVar.e = false;
                        org.telegram.ui.ActionBar.n5 n5Var = ocVar.f40129a;
                        ocVar.setWillNotDraw(true);
                        if (i10 == bdVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
                            ocVar.a(i15, bdVar.f36025f, true);
                            n5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (bdVar.f36019b < bdVar.getMessagesController().channelBgIconLevelMin) {
                                ocVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(bdVar.f36033n, false, false);
                            return;
                        } else if (i10 == bdVar.f36022c0) {
                            i14 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
                            ocVar.a(i14, bdVar.f36040s, false);
                            n5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (bdVar.f36024e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ocVar.e = z10;
                            ocVar.setWillNotDraw(!z10);
                            if (bdVar.f36019b < bdVar.L0()) {
                                ocVar.e(bdVar.L0());
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(bdVar.f36045w, false, false);
                            return;
                        } else if (i10 == bdVar.f36026f0) {
                            i13 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
                            ocVar.a(i13, bdVar.f36040s, false);
                            n5Var.l(LocaleController.getString(bdVar.I0()), false);
                            if (bdVar.f36019b < bdVar.H0()) {
                                ocVar.e(bdVar.H0());
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.f36049y), DialogObject.isEmojiStatusCollectible(bdVar.f36049y), false);
                            return;
                        } else if (i10 == bdVar.f36028h0) {
                            i12 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
                            ocVar.a(i12, bdVar.f36040s, false);
                            n5Var.l(LocaleController.getString(bdVar.D0()), false);
                            if (bdVar.f36019b < bdVar.J0()) {
                                ocVar.e(bdVar.J0());
                            } else {
                                ocVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j10);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                ocVar.c(bdVar.F0(stickerSet2), false, false);
                                return;
                            } else {
                                ocVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == bdVar.f36030j0) {
                            n5Var.l(LocaleController.getString(bdVar.O0()), false);
                            ocVar.e(0);
                            TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j10);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                ocVar.d(bdVar.E0(stickerSet));
                                return;
                            } else {
                                ocVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == bdVar.f36024e0) {
                        r8Var.k(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    r8Var.k(LocaleController.getString(bdVar.R0()), false);
                    if (bdVar.f36019b < bdVar.B0()) {
                        r8Var.j(bdVar.B0());
                        return;
                    } else {
                        r8Var.j(0);
                        return;
                    }
                }
                ((ip0) view).a(bdVar.f36040s, false);
                return;
            }
            ((rc) view).a(bdVar.f36025f, false);
            return;
        }
        tc tcVar = (tc) view;
        ro0 ro0Var = tcVar.f41946a;
        sc scVar = tcVar.f41947b;
        i11 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
        ro0Var.b(i11, bdVar.f36040s, false);
        scVar.b(bdVar.f36040s, false);
        scVar.d(bdVar.f36045w, false, false);
        scVar.setForum(bdVar.T0());
        scVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f36049y), false, false);
        scVar.a(bdVar.f36025f);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var4;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var5;
        org.telegram.ui.ActionBar.g6 g6Var6;
        int i13;
        org.telegram.ui.ActionBar.g6 g6Var7;
        zc zcVar;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.g6 g6Var8;
        int i14;
        bd bdVar = this.f39845c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            h5Var = ((org.telegram.ui.ActionBar.o2) bdVar).parentLayout;
            int K0 = bdVar.K0();
            long j10 = bdVar.f36017a;
            g6Var8 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(parentActivity, h5Var, K0, j10, g6Var8);
            gaVar.f22442x = true;
            gaVar.setImportantForAccessibility(4);
            gaVar.f22439r = bdVar;
            Drawable drawable = bdVar.H;
            i14 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            Drawable f7 = ei.r6.f(drawable, i14, bdVar.F, bdVar.J);
            bdVar.H = f7;
            gaVar.setOverrideBackground(f7);
            zcVar = gaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            g6Var7 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            zc zcVar2 = new zc(i13, parentActivity2, g6Var7);
            zcVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(bdVar.F);
            if (wallpaperEmoticon == null && bdVar.F == null && bdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar2.a(wallpaperEmoticon, false);
            zcVar2.setGalleryWallpaper(bdVar.G);
            zcVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final nc f39466b;

                {
                    this.f39466b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f39466b.f39845c;
                            if (str == null) {
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20495id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
                            }
                            bdVar2.Z0(true);
                            bdVar2.c1(true);
                            return;
                        default:
                            bd bdVar3 = this.f39466b.f39845c;
                            bdVar3.f36040s = ((Integer) obj).intValue();
                            if (bdVar3.f36049y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f36049y = null;
                            }
                            bdVar3.Z0(true);
                            bdVar3.d1();
                            bdVar3.b1(true);
                            return;
                    }
                }
            });
            zcVar = zcVar2;
        } else if (i10 == 5) {
            zcVar = new org.telegram.ui.Cells.r8(bdVar.getParentActivity(), bdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = bdVar.getParentActivity();
            g6Var6 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = g6Var6;
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(parentActivity3);
            frameLayout.f40129a = n5Var;
            n5Var.setTextSize(16);
            org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, g6Var6);
            frameLayout.addView(n5Var, w7.z5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f40131c = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            zcVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            g6Var5 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            rc rcVar = new rc(i12, parentActivity4, g6Var5);
            rcVar.f41085b.setOnItemClickListener(new ci.x4(5, this, rcVar));
            zcVar = rcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            g6Var4 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            ip0 ip0Var = new ip0(0, i11, parentActivity5, g6Var4);
            ip0Var.setDivider(false);
            ip0Var.setOnColorClick(new Utilities.Callback(this) {
                public final nc f39466b;

                {
                    this.f39466b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f39466b.f39845c;
                            if (str == null) {
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20495id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
                            }
                            bdVar2.Z0(true);
                            bdVar2.c1(true);
                            return;
                        default:
                            bd bdVar3 = this.f39466b.f39845c;
                            bdVar3.f36040s = ((Integer) obj).intValue();
                            if (bdVar3.f36049y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f36049y = null;
                            }
                            bdVar3.Z0(true);
                            bdVar3.d1();
                            bdVar3.b1(true);
                            return;
                    }
                }
            });
            zcVar = ip0Var;
        } else if (i10 == 1) {
            FrameLayout tcVar = new tc(bdVar, bdVar.getParentActivity());
            zcVar = tcVar;
            if (bdVar.d) {
                tcVar.setTag(-33024);
                zcVar = tcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            g6Var3 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            zcVar = new org.telegram.ui.Cells.l4(parentActivity6, g6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            g6Var2 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            zcVar = new to0(parentActivity7, g6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            g6Var = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(parentActivity8, g6Var);
            b10Var.setIsSingleCell(true);
            b10Var.setViewType(35);
            zcVar = b10Var;
        } else {
            zcVar = new org.telegram.ui.Cells.e9(bdVar.getParentActivity());
        }
        return new s4.b1(zcVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f46343a;
        boolean z10 = view instanceof tc;
        bd bdVar = this.f39845c;
        if (z10) {
            sc scVar = ((tc) view).f41947b;
            TLRPC.EmojiStatus emojiStatus = bdVar.f36049y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                scVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) bdVar.f36049y).pattern_document_id, true, false);
            } else {
                scVar.b(bdVar.f36040s, false);
                scVar.d(bdVar.f36045w, false, false);
            }
            scVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f36049y), DialogObject.isEmojiStatusCollectible(bdVar.f36049y), false);
            scVar.setForum(bdVar.T0());
            scVar.a(bdVar.f36025f);
        } else if (view instanceof org.telegram.ui.Cells.ga) {
            ((org.telegram.ui.Cells.ga) view).setOverrideBackground(bdVar.H);
        } else {
            bd.a1(view);
        }
    }
}
