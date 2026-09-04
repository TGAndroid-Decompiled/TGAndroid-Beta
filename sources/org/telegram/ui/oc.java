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
public final class oc extends org.telegram.ui.Components.kl0 {
    public final bd f39212c;

    public oc(bd bdVar) {
        this.f39212c = bdVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f39212c.R;
    }

    @Override
    public final int j(int i10) {
        bd bdVar = this.f39212c;
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
        if (i10 == bdVar.f34737b0) {
            return 4;
        }
        if (i10 != bdVar.U && i10 != bdVar.f34739c0 && i10 != bdVar.f34744f0 && i10 != bdVar.f34746h0 && i10 != bdVar.f34748j0) {
            if (i10 != bdVar.X && i10 != bdVar.f34742e0) {
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
        bd bdVar = this.f39212c;
        long j3 = bdVar.f34734a;
        int i16 = c1Var.f45742f;
        View view = c1Var.f45738a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                                e9Var.setFixedSize(0);
                                if (i10 == bdVar.f34735a0) {
                                    e9Var.setFixedSize(12);
                                    e9Var.setText("");
                                    return;
                                } else if (i10 == bdVar.V) {
                                    e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == bdVar.Y) {
                                    e9Var.setText(LocaleController.getString(bdVar.N0()));
                                    return;
                                } else if (i10 == bdVar.f34740d0) {
                                    e9Var.setText(LocaleController.getString(bdVar.K0()));
                                    return;
                                } else if (i10 == bdVar.f34745g0) {
                                    e9Var.setText(LocaleController.getString(bdVar.E0()));
                                    return;
                                } else if (i10 == bdVar.f34747i0) {
                                    e9Var.setText(LocaleController.getString(bdVar.A0()));
                                    return;
                                } else if (i10 == bdVar.f34749k0) {
                                    e9Var.setText(LocaleController.getString(bdVar.L0()));
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
                        pc pcVar = (pc) view;
                        pcVar.f39471e = false;
                        org.telegram.ui.ActionBar.j5 j5Var = pcVar.f39468a;
                        pcVar.setWillNotDraw(true);
                        if (i10 == bdVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            pcVar.a(i15, bdVar.f34743f, true);
                            j5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (bdVar.f34736b < bdVar.getMessagesController().channelBgIconLevelMin) {
                                pcVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                pcVar.e(0);
                            }
                            pcVar.c(bdVar.f34751n, false, false);
                            return;
                        } else if (i10 == bdVar.f34739c0) {
                            i14 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            pcVar.a(i14, bdVar.f34758s, false);
                            j5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (bdVar.f34742e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            pcVar.f39471e = z10;
                            pcVar.setWillNotDraw(!z10);
                            if (bdVar.f34736b < bdVar.J0()) {
                                pcVar.e(bdVar.J0());
                            } else {
                                pcVar.e(0);
                            }
                            pcVar.c(bdVar.f34763w, false, false);
                            return;
                        } else if (i10 == bdVar.f34744f0) {
                            i13 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            pcVar.a(i13, bdVar.f34758s, false);
                            j5Var.l(LocaleController.getString(bdVar.G0()), false);
                            if (bdVar.f34736b < bdVar.F0()) {
                                pcVar.e(bdVar.F0());
                            } else {
                                pcVar.e(0);
                            }
                            pcVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.f34767y), DialogObject.isEmojiStatusCollectible(bdVar.f34767y), false);
                            return;
                        } else if (i10 == bdVar.f34746h0) {
                            i12 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            pcVar.a(i12, bdVar.f34758s, false);
                            j5Var.l(LocaleController.getString(bdVar.B0()), false);
                            if (bdVar.f34736b < bdVar.H0()) {
                                pcVar.e(bdVar.H0());
                            } else {
                                pcVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j3);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                pcVar.c(bdVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                pcVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == bdVar.f34748j0) {
                            j5Var.l(LocaleController.getString(bdVar.M0()), false);
                            pcVar.e(0);
                            TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j3);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                pcVar.d(bdVar.C0(stickerSet));
                                return;
                            } else {
                                pcVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == bdVar.f34742e0) {
                        r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    r8Var.i(LocaleController.getString(bdVar.P0()), false);
                    if (bdVar.f34736b < bdVar.z0()) {
                        r8Var.h(bdVar.z0());
                        return;
                    } else {
                        r8Var.h(0);
                        return;
                    }
                }
                ((yp0) view).a(bdVar.f34758s, false);
                return;
            }
            ((sc) view).a(bdVar.f34743f, false);
            return;
        }
        uc ucVar = (uc) view;
        hp0 hp0Var = ucVar.f41058a;
        tc tcVar = ucVar.f41059b;
        i11 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
        hp0Var.b(i11, bdVar.f34758s, false);
        tcVar.b(bdVar.f34758s, false);
        tcVar.d(bdVar.f34763w, false, false);
        tcVar.setForum(bdVar.R0());
        tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f34767y), false, false);
        tcVar.a(bdVar.f34743f);
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
        zc zcVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.f6 f6Var8;
        int i14;
        bd bdVar = this.f39212c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            d5Var = ((org.telegram.ui.ActionBar.n2) bdVar).parentLayout;
            int I0 = bdVar.I0();
            long j3 = bdVar.f34734a;
            f6Var8 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(parentActivity, d5Var, I0, j3, f6Var8);
            iaVar.f22137x = true;
            iaVar.setImportantForAccessibility(4);
            iaVar.f22134r = bdVar;
            Drawable drawable = bdVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            Drawable f7 = di.d7.f(drawable, i14, bdVar.F, bdVar.J);
            bdVar.H = f7;
            iaVar.setOverrideBackground(f7);
            zcVar = iaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            f6Var7 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zc zcVar2 = new zc(i13, parentActivity2, f6Var7);
            zcVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(bdVar.F);
            if (wallpaperEmoticon == null && bdVar.F == null && bdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar2.a(wallpaperEmoticon, false);
            zcVar2.setGalleryWallpaper(bdVar.G);
            zcVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final oc f38915b;

                {
                    this.f38915b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f38915b.f39212c;
                            if (str == null) {
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20021id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
                            }
                            bdVar2.X0(true);
                            bdVar2.a1(true);
                            return;
                        default:
                            bd bdVar3 = this.f38915b.f39212c;
                            bdVar3.f34758s = ((Integer) obj).intValue();
                            if (bdVar3.f34767y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f34767y = null;
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
            zcVar = new org.telegram.ui.Cells.r8(bdVar.getParentActivity(), bdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = bdVar.getParentActivity();
            f6Var6 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f39471e = false;
            frameLayout.d = f6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            frameLayout.f39468a = j5Var;
            j5Var.setTextSize(16);
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var6));
            frameLayout.addView(j5Var, w7.x5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f39470c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            zcVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            f6Var5 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            sc scVar = new sc(i12, parentActivity4, f6Var5);
            scVar.f40408b.setOnItemClickListener(new bi.x5(5, this, scVar));
            zcVar = scVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            yp0 yp0Var = new yp0(0, i11, parentActivity5, f6Var4);
            yp0Var.setDivider(false);
            yp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final oc f38915b;

                {
                    this.f38915b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f38915b.f39212c;
                            if (str == null) {
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20021id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
                            }
                            bdVar2.X0(true);
                            bdVar2.a1(true);
                            return;
                        default:
                            bd bdVar3 = this.f38915b.f39212c;
                            bdVar3.f34758s = ((Integer) obj).intValue();
                            if (bdVar3.f34767y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f34767y = null;
                            }
                            bdVar3.X0(true);
                            bdVar3.b1();
                            bdVar3.Z0(true);
                            return;
                    }
                }
            });
            zcVar = yp0Var;
        } else if (i10 == 1) {
            FrameLayout ucVar = new uc(bdVar, bdVar.getParentActivity());
            zcVar = ucVar;
            if (bdVar.d) {
                ucVar.setTag(-33024);
                zcVar = ucVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            f6Var3 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zcVar = new org.telegram.ui.Cells.l4(parentActivity6, f6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            f6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zcVar = new jp0(parentActivity7, f6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            f6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(parentActivity8, f6Var);
            t00Var.setIsSingleCell(true);
            t00Var.setViewType(35);
            zcVar = t00Var;
        } else {
            zcVar = new org.telegram.ui.Cells.e9(bdVar.getParentActivity());
        }
        return new s4.c1(zcVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f45738a;
        boolean z10 = view instanceof uc;
        bd bdVar = this.f39212c;
        if (z10) {
            tc tcVar = ((uc) view).f41059b;
            TLRPC.EmojiStatus emojiStatus = bdVar.f34767y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                tcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                tcVar.d(((TLRPC.TL_emojiStatusCollectible) bdVar.f34767y).pattern_document_id, true, false);
            } else {
                tcVar.b(bdVar.f34758s, false);
                tcVar.d(bdVar.f34763w, false, false);
            }
            tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f34767y), DialogObject.isEmojiStatusCollectible(bdVar.f34767y), false);
            tcVar.setForum(bdVar.R0());
            tcVar.a(bdVar.f34743f);
        } else if (view instanceof org.telegram.ui.Cells.ia) {
            ((org.telegram.ui.Cells.ia) view).setOverrideBackground(bdVar.H);
        } else {
            bd.Y0(view);
        }
    }
}
