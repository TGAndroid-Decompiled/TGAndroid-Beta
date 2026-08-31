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
public final class nc extends org.telegram.ui.Components.sl0 {
    public final bd f39378c;

    public nc(bd bdVar) {
        this.f39378c = bdVar;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f39378c.O;
    }

    @Override
    public final int j(int i10) {
        bd bdVar = this.f39378c;
        if (i10 == bdVar.P) {
            return 0;
        }
        if (i10 == bdVar.T) {
            return 2;
        }
        if (i10 == bdVar.W) {
            return 1;
        }
        if (i10 == bdVar.Q) {
            return 3;
        }
        if (i10 == bdVar.Y) {
            return 4;
        }
        if (i10 != bdVar.R && i10 != bdVar.Z && i10 != bdVar.f35425c0 && i10 != bdVar.f35428e0 && i10 != bdVar.f35431g0) {
            if (i10 != bdVar.U && i10 != bdVar.f35423b0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        boolean z4;
        int i15;
        bd bdVar = this.f39378c;
        long j10 = bdVar.f35420a;
        int i16 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                                a9Var.setFixedSize(0);
                                if (i10 == bdVar.X) {
                                    a9Var.setFixedSize(12);
                                    a9Var.setText("");
                                    return;
                                } else if (i10 == bdVar.S) {
                                    a9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == bdVar.V) {
                                    a9Var.setText(LocaleController.getString(bdVar.N0()));
                                    return;
                                } else if (i10 == bdVar.f35421a0) {
                                    a9Var.setText(LocaleController.getString(bdVar.K0()));
                                    return;
                                } else if (i10 == bdVar.f35426d0) {
                                    a9Var.setText(LocaleController.getString(bdVar.E0()));
                                    return;
                                } else if (i10 == bdVar.f35430f0) {
                                    a9Var.setText(LocaleController.getString(bdVar.A0()));
                                    return;
                                } else if (i10 == bdVar.f35432h0) {
                                    a9Var.setText(LocaleController.getString(bdVar.L0()));
                                    return;
                                } else if (i10 == 0) {
                                    a9Var.setText("");
                                    a9Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        oc ocVar = (oc) view;
                        ocVar.f39720e = false;
                        org.telegram.ui.ActionBar.l5 l5Var = ocVar.f39717a;
                        ocVar.setWillNotDraw(true);
                        if (i10 == bdVar.R) {
                            i15 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
                            ocVar.a(i15, bdVar.f35429f, true);
                            l5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (bdVar.f35422b < bdVar.getMessagesController().channelBgIconLevelMin) {
                                ocVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(bdVar.f35437n, false, false);
                            return;
                        } else if (i10 == bdVar.Z) {
                            i14 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
                            ocVar.a(i14, bdVar.f35444s, false);
                            l5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (bdVar.f35423b0 >= 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            ocVar.f39720e = z4;
                            ocVar.setWillNotDraw(!z4);
                            if (bdVar.f35422b < bdVar.J0()) {
                                ocVar.e(bdVar.J0());
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(bdVar.f35449w, false, false);
                            return;
                        } else if (i10 == bdVar.f35425c0) {
                            i13 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
                            ocVar.a(i13, bdVar.f35444s, false);
                            l5Var.l(LocaleController.getString(bdVar.G0()), false);
                            if (bdVar.f35422b < bdVar.F0()) {
                                ocVar.e(bdVar.F0());
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.f35451y), DialogObject.isEmojiStatusCollectible(bdVar.f35451y), false);
                            return;
                        } else if (i10 == bdVar.f35428e0) {
                            i12 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
                            ocVar.a(i12, bdVar.f35444s, false);
                            l5Var.l(LocaleController.getString(bdVar.B0()), false);
                            if (bdVar.f35422b < bdVar.H0()) {
                                ocVar.e(bdVar.H0());
                            } else {
                                ocVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j10);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                ocVar.c(bdVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                ocVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == bdVar.f35431g0) {
                            l5Var.l(LocaleController.getString(bdVar.M0()), false);
                            ocVar.e(0);
                            TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j10);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                ocVar.d(bdVar.C0(stickerSet));
                                return;
                            } else {
                                ocVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    if (i10 == bdVar.f35423b0) {
                        o8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    o8Var.i(LocaleController.getString(bdVar.P0()), false);
                    if (bdVar.f35422b < bdVar.z0()) {
                        o8Var.h(bdVar.z0());
                        return;
                    } else {
                        o8Var.h(0);
                        return;
                    }
                }
                ((gp0) view).a(bdVar.f35444s, false);
                return;
            }
            ((sc) view).a(bdVar.f35429f, false);
            return;
        }
        uc ucVar = (uc) view;
        ro0 ro0Var = ucVar.f41880a;
        tc tcVar = ucVar.f41881b;
        i11 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
        ro0Var.b(i11, bdVar.f35444s, false);
        tcVar.b(bdVar.f35444s, false);
        tcVar.d(bdVar.f35449w, false, false);
        tcVar.setForum(bdVar.R0());
        tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f35451y), false, false);
        tcVar.a(bdVar.f35429f);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
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
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.g6 g6Var8;
        int i14;
        bd bdVar = this.f39378c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            f5Var = ((org.telegram.ui.ActionBar.p2) bdVar).parentLayout;
            int I0 = bdVar.I0();
            long j10 = bdVar.f35420a;
            g6Var8 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(parentActivity, f5Var, I0, j10, g6Var8);
            eaVar.f22784x = true;
            eaVar.setImportantForAccessibility(4);
            eaVar.f22781r = bdVar;
            Drawable drawable = bdVar.E;
            i14 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            Drawable f10 = qh.j5.f(drawable, i14, bdVar.C, bdVar.G);
            bdVar.E = f10;
            eaVar.setOverrideBackground(f10);
            zcVar = eaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            g6Var7 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            zc zcVar2 = new zc(i13, parentActivity2, g6Var7);
            zcVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(bdVar.C);
            if (wallpaperEmoticon == null && bdVar.C == null && bdVar.D != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar2.a(wallpaperEmoticon, false);
            zcVar2.setGalleryWallpaper(bdVar.D);
            zcVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final nc f39075b;

                {
                    this.f39075b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f39075b.f39378c;
                            if (str == null) {
                                bdVar2.C = bdVar2.D;
                            } else if (str.equals("❌")) {
                                bdVar2.C = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.C = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20995id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.C.settings.emoticon = str;
                            }
                            bdVar2.X0(true);
                            bdVar2.a1(true);
                            return;
                        default:
                            bd bdVar3 = this.f39075b.f39378c;
                            bdVar3.f35444s = ((Integer) obj).intValue();
                            if (bdVar3.f35451y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f35451y = null;
                            }
                            bdVar3.X0(true);
                            bdVar3.b1();
                            bdVar3.Z0(true);
                            return;
                    }
                }
            });
            zcVar = zcVar2;
        } else if (i10 == 5) {
            zcVar = new org.telegram.ui.Cells.o8(bdVar.getParentActivity(), bdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = bdVar.getParentActivity();
            g6Var6 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f39720e = false;
            frameLayout.d = g6Var6;
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(parentActivity3);
            frameLayout.f39717a = l5Var;
            l5Var.setTextSize(16);
            l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var6));
            frameLayout.addView(l5Var, k7.c6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f39719c = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            zcVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            g6Var5 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            sc scVar = new sc(i12, parentActivity4, g6Var5);
            scVar.f41225b.setOnItemClickListener(new hg.v0(5, this, scVar));
            zcVar = scVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            g6Var4 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            gp0 gp0Var = new gp0(0, i11, parentActivity5, g6Var4);
            gp0Var.setDivider(false);
            gp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final nc f39075b;

                {
                    this.f39075b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f39075b.f39378c;
                            if (str == null) {
                                bdVar2.C = bdVar2.D;
                            } else if (str.equals("❌")) {
                                bdVar2.C = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.C = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20995id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.C.settings.emoticon = str;
                            }
                            bdVar2.X0(true);
                            bdVar2.a1(true);
                            return;
                        default:
                            bd bdVar3 = this.f39075b.f39378c;
                            bdVar3.f35444s = ((Integer) obj).intValue();
                            if (bdVar3.f35451y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f35451y = null;
                            }
                            bdVar3.X0(true);
                            bdVar3.b1();
                            bdVar3.Z0(true);
                            return;
                    }
                }
            });
            zcVar = gp0Var;
        } else if (i10 == 1) {
            FrameLayout ucVar = new uc(bdVar, bdVar.getParentActivity());
            zcVar = ucVar;
            if (bdVar.d) {
                ucVar.setTag(-33024);
                zcVar = ucVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            g6Var3 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            zcVar = new org.telegram.ui.Cells.m4(parentActivity6, g6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            g6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            zcVar = new to0(parentActivity7, g6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            g6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(parentActivity8, g6Var);
            u00Var.setIsSingleCell(true);
            u00Var.setViewType(35);
            zcVar = u00Var;
        } else {
            zcVar = new org.telegram.ui.Cells.a9(bdVar.getParentActivity());
        }
        return new f2.m1(zcVar);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        boolean z4 = view instanceof uc;
        bd bdVar = this.f39378c;
        if (z4) {
            tc tcVar = ((uc) view).f41881b;
            TLRPC.EmojiStatus emojiStatus = bdVar.f35451y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                tcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                tcVar.d(((TLRPC.TL_emojiStatusCollectible) bdVar.f35451y).pattern_document_id, true, false);
            } else {
                tcVar.b(bdVar.f35444s, false);
                tcVar.d(bdVar.f35449w, false, false);
            }
            tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f35451y), DialogObject.isEmojiStatusCollectible(bdVar.f35451y), false);
            tcVar.setForum(bdVar.R0());
            tcVar.a(bdVar.f35429f);
        } else if (view instanceof org.telegram.ui.Cells.ea) {
            ((org.telegram.ui.Cells.ea) view).setOverrideBackground(bdVar.E);
        } else {
            bd.Y0(view);
        }
    }
}
