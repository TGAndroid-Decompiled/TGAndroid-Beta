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
public final class mc extends org.telegram.ui.Components.rm0 {
    public final ad f39900c;

    public mc(ad adVar) {
        this.f39900c = adVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47752f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f39900c.R;
    }

    @Override
    public final int j(int i10) {
        ad adVar = this.f39900c;
        if (i10 == adVar.S) {
            return 0;
        }
        if (i10 == adVar.W) {
            return 2;
        }
        if (i10 == adVar.Z) {
            return 1;
        }
        if (i10 == adVar.T) {
            return 3;
        }
        if (i10 == adVar.f36007b0) {
            return 4;
        }
        if (i10 != adVar.U && i10 != adVar.f36009c0 && i10 != adVar.f36014f0 && i10 != adVar.f36016h0 && i10 != adVar.f36018j0) {
            if (i10 != adVar.X && i10 != adVar.f36012e0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        ad adVar = this.f39900c;
        long j3 = adVar.f36004a;
        int i16 = d1Var.f47752f;
        View view = d1Var.f47748a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                                e9Var.setFixedSize(0);
                                if (i10 == adVar.f36005a0) {
                                    e9Var.setFixedSize(12);
                                    e9Var.setText("");
                                    return;
                                } else if (i10 == adVar.V) {
                                    e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == adVar.Y) {
                                    e9Var.setText(LocaleController.getString(adVar.N0()));
                                    return;
                                } else if (i10 == adVar.f36010d0) {
                                    e9Var.setText(LocaleController.getString(adVar.K0()));
                                    return;
                                } else if (i10 == adVar.f36015g0) {
                                    e9Var.setText(LocaleController.getString(adVar.E0()));
                                    return;
                                } else if (i10 == adVar.f36017i0) {
                                    e9Var.setText(LocaleController.getString(adVar.A0()));
                                    return;
                                } else if (i10 == adVar.f36019k0) {
                                    e9Var.setText(LocaleController.getString(adVar.L0()));
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
                        nc ncVar = (nc) view;
                        ncVar.f40212e = false;
                        org.telegram.ui.ActionBar.h5 h5Var = ncVar.f40209a;
                        ncVar.setWillNotDraw(true);
                        if (i10 == adVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
                            ncVar.a(i15, adVar.f36013f, true);
                            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (adVar.f36006b < adVar.getMessagesController().channelBgIconLevelMin) {
                                ncVar.e(adVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                ncVar.e(0);
                            }
                            ncVar.c(adVar.f36021n, false, false);
                            return;
                        } else if (i10 == adVar.f36009c0) {
                            i14 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
                            ncVar.a(i14, adVar.f36028s, false);
                            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (adVar.f36012e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ncVar.f40212e = z10;
                            ncVar.setWillNotDraw(!z10);
                            if (adVar.f36006b < adVar.J0()) {
                                ncVar.e(adVar.J0());
                            } else {
                                ncVar.e(0);
                            }
                            ncVar.c(adVar.f36033w, false, false);
                            return;
                        } else if (i10 == adVar.f36014f0) {
                            i13 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
                            ncVar.a(i13, adVar.f36028s, false);
                            h5Var.l(LocaleController.getString(adVar.G0()), false);
                            if (adVar.f36006b < adVar.F0()) {
                                ncVar.e(adVar.F0());
                            } else {
                                ncVar.e(0);
                            }
                            ncVar.c(DialogObject.getEmojiStatusDocumentId(adVar.f36037y), DialogObject.isEmojiStatusCollectible(adVar.f36037y), false);
                            return;
                        } else if (i10 == adVar.f36016h0) {
                            i12 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
                            ncVar.a(i12, adVar.f36028s, false);
                            h5Var.l(LocaleController.getString(adVar.B0()), false);
                            if (adVar.f36006b < adVar.H0()) {
                                ncVar.e(adVar.H0());
                            } else {
                                ncVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = adVar.getMessagesController().getChatFull(-j3);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                ncVar.c(adVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                ncVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == adVar.f36018j0) {
                            h5Var.l(LocaleController.getString(adVar.M0()), false);
                            ncVar.e(0);
                            TLRPC.ChatFull chatFull2 = adVar.getMessagesController().getChatFull(-j3);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                ncVar.d(adVar.C0(stickerSet));
                                return;
                            } else {
                                ncVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == adVar.f36012e0) {
                        r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    r8Var.i(LocaleController.getString(adVar.P0()), false);
                    if (adVar.f36006b < adVar.z0()) {
                        r8Var.h(adVar.z0());
                        return;
                    } else {
                        r8Var.h(0);
                        return;
                    }
                }
                ((wp0) view).a(adVar.f36028s, false);
                return;
            }
            ((rc) view).a(adVar.f36013f, false);
            return;
        }
        tc tcVar = (tc) view;
        fp0 fp0Var = tcVar.f42151a;
        sc scVar = tcVar.f42152b;
        i11 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
        fp0Var.b(i11, adVar.f36028s, false);
        scVar.b(adVar.f36028s, false);
        scVar.d(adVar.f36033w, false, false);
        scVar.setForum(adVar.R0());
        scVar.e(DialogObject.getEmojiStatusDocumentId(adVar.f36037y), false, false);
        scVar.a(adVar.f36013f);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var4;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        org.telegram.ui.ActionBar.d6 d6Var6;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var7;
        yc ycVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.d6 d6Var8;
        int i14;
        ad adVar = this.f39900c;
        if (i10 == 0) {
            Activity parentActivity = adVar.getParentActivity();
            b5Var = ((org.telegram.ui.ActionBar.m2) adVar).parentLayout;
            int I0 = adVar.I0();
            long j3 = adVar.f36004a;
            d6Var8 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(parentActivity, b5Var, I0, j3, d6Var8);
            gaVar.f22165x = true;
            gaVar.setImportantForAccessibility(4);
            gaVar.f22162r = adVar;
            Drawable drawable = adVar.H;
            i14 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
            Drawable f7 = ci.b7.f(drawable, i14, adVar.F, adVar.J);
            adVar.H = f7;
            gaVar.setOverrideBackground(f7);
            ycVar = gaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = adVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
            d6Var7 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            yc ycVar2 = new yc(i13, parentActivity2, d6Var7);
            ycVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(adVar.F);
            if (wallpaperEmoticon == null && adVar.F == null && adVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            ycVar2.a(wallpaperEmoticon, false);
            ycVar2.setGalleryWallpaper(adVar.G);
            ycVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final mc f39581b;

                {
                    this.f39581b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            ad adVar2 = this.f39581b.f39900c;
                            if (str == null) {
                                adVar2.F = adVar2.G;
                            } else if (str.equals("❌")) {
                                adVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                adVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20184id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                adVar2.F.settings.emoticon = str;
                            }
                            adVar2.X0(true);
                            adVar2.a1(true);
                            return;
                        default:
                            ad adVar3 = this.f39581b.f39900c;
                            adVar3.f36028s = ((Integer) obj).intValue();
                            if (adVar3.f36037y instanceof TLRPC.TL_emojiStatusCollectible) {
                                adVar3.f36037y = null;
                            }
                            adVar3.X0(true);
                            adVar3.b1();
                            adVar3.Z0(true);
                            return;
                    }
                }
            });
            ycVar = ycVar2;
        } else if (i10 == 5) {
            ycVar = new org.telegram.ui.Cells.r8(adVar.getParentActivity(), adVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = adVar.getParentActivity();
            d6Var6 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f40212e = false;
            frameLayout.d = d6Var6;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity3);
            frameLayout.f40209a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var6));
            frameLayout.addView(h5Var, w7.x5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -1, 23));
            frameLayout.f40211c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            ycVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = adVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
            d6Var5 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            rc rcVar = new rc(i12, parentActivity4, d6Var5);
            rcVar.f41409b.setOnItemClickListener(new ai.o6(5, this, rcVar));
            ycVar = rcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = adVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
            d6Var4 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            wp0 wp0Var = new wp0(0, i11, parentActivity5, d6Var4);
            wp0Var.setDivider(false);
            wp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final mc f39581b;

                {
                    this.f39581b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            ad adVar2 = this.f39581b.f39900c;
                            if (str == null) {
                                adVar2.F = adVar2.G;
                            } else if (str.equals("❌")) {
                                adVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                adVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20184id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                adVar2.F.settings.emoticon = str;
                            }
                            adVar2.X0(true);
                            adVar2.a1(true);
                            return;
                        default:
                            ad adVar3 = this.f39581b.f39900c;
                            adVar3.f36028s = ((Integer) obj).intValue();
                            if (adVar3.f36037y instanceof TLRPC.TL_emojiStatusCollectible) {
                                adVar3.f36037y = null;
                            }
                            adVar3.X0(true);
                            adVar3.b1();
                            adVar3.Z0(true);
                            return;
                    }
                }
            });
            ycVar = wp0Var;
        } else if (i10 == 1) {
            FrameLayout tcVar = new tc(adVar, adVar.getParentActivity());
            ycVar = tcVar;
            if (adVar.d) {
                tcVar.setTag(-33024);
                ycVar = tcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = adVar.getParentActivity();
            d6Var3 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            ycVar = new org.telegram.ui.Cells.m4(parentActivity6, d6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = adVar.getParentActivity();
            d6Var2 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            ycVar = new hp0(parentActivity7, d6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = adVar.getParentActivity();
            d6Var = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(parentActivity8, d6Var);
            k10Var.setIsSingleCell(true);
            k10Var.setViewType(35);
            ycVar = k10Var;
        } else {
            ycVar = new org.telegram.ui.Cells.e9(adVar.getParentActivity());
        }
        return new s4.d1(ycVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47748a;
        boolean z10 = view instanceof tc;
        ad adVar = this.f39900c;
        if (z10) {
            sc scVar = ((tc) view).f42152b;
            TLRPC.EmojiStatus emojiStatus = adVar.f36037y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                scVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) adVar.f36037y).pattern_document_id, true, false);
            } else {
                scVar.b(adVar.f36028s, false);
                scVar.d(adVar.f36033w, false, false);
            }
            scVar.e(DialogObject.getEmojiStatusDocumentId(adVar.f36037y), DialogObject.isEmojiStatusCollectible(adVar.f36037y), false);
            scVar.setForum(adVar.R0());
            scVar.a(adVar.f36013f);
        } else if (view instanceof org.telegram.ui.Cells.ga) {
            ((org.telegram.ui.Cells.ga) view).setOverrideBackground(adVar.H);
        } else {
            ad.Y0(view);
        }
    }
}
