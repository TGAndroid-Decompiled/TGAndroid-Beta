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
public final class mc extends org.telegram.ui.Components.ll0 {
    public final ad f35258c;

    public mc(ad adVar) {
        this.f35258c = adVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f35258c.R;
    }

    @Override
    public final int j(int i10) {
        ad adVar = this.f35258c;
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
        if (i10 == adVar.f31741b0) {
            return 4;
        }
        if (i10 != adVar.U && i10 != adVar.f31743c0 && i10 != adVar.f31747f0 && i10 != adVar.f31749h0 && i10 != adVar.f31751j0) {
            if (i10 != adVar.X && i10 != adVar.f31745e0) {
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
        ad adVar = this.f35258c;
        long j3 = adVar.f31738a;
        int i16 = c1Var.f42630f;
        View view = c1Var.f42627a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                                f9Var.setFixedSize(0);
                                if (i10 == adVar.f31739a0) {
                                    f9Var.setFixedSize(12);
                                    f9Var.setText("");
                                    return;
                                } else if (i10 == adVar.V) {
                                    f9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == adVar.Y) {
                                    f9Var.setText(LocaleController.getString(adVar.N0()));
                                    return;
                                } else if (i10 == adVar.f31744d0) {
                                    f9Var.setText(LocaleController.getString(adVar.K0()));
                                    return;
                                } else if (i10 == adVar.f31748g0) {
                                    f9Var.setText(LocaleController.getString(adVar.E0()));
                                    return;
                                } else if (i10 == adVar.f31750i0) {
                                    f9Var.setText(LocaleController.getString(adVar.A0()));
                                    return;
                                } else if (i10 == adVar.f31752k0) {
                                    f9Var.setText(LocaleController.getString(adVar.L0()));
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
                        nc ncVar = (nc) view;
                        ncVar.e = false;
                        org.telegram.ui.ActionBar.i5 i5Var = ncVar.f35493a;
                        ncVar.setWillNotDraw(true);
                        if (i10 == adVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
                            ncVar.a(i15, adVar.f31746f, true);
                            i5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (adVar.f31740b < adVar.getMessagesController().channelBgIconLevelMin) {
                                ncVar.e(adVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                ncVar.e(0);
                            }
                            ncVar.c(adVar.f31754n, false, false);
                            return;
                        } else if (i10 == adVar.f31743c0) {
                            i14 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
                            ncVar.a(i14, adVar.f31761s, false);
                            i5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (adVar.f31745e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ncVar.e = z10;
                            ncVar.setWillNotDraw(!z10);
                            if (adVar.f31740b < adVar.J0()) {
                                ncVar.e(adVar.J0());
                            } else {
                                ncVar.e(0);
                            }
                            ncVar.c(adVar.f31766w, false, false);
                            return;
                        } else if (i10 == adVar.f31747f0) {
                            i13 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
                            ncVar.a(i13, adVar.f31761s, false);
                            i5Var.l(LocaleController.getString(adVar.G0()), false);
                            if (adVar.f31740b < adVar.F0()) {
                                ncVar.e(adVar.F0());
                            } else {
                                ncVar.e(0);
                            }
                            ncVar.c(DialogObject.getEmojiStatusDocumentId(adVar.f31770y), DialogObject.isEmojiStatusCollectible(adVar.f31770y), false);
                            return;
                        } else if (i10 == adVar.f31749h0) {
                            i12 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
                            ncVar.a(i12, adVar.f31761s, false);
                            i5Var.l(LocaleController.getString(adVar.B0()), false);
                            if (adVar.f31740b < adVar.H0()) {
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
                        } else if (i10 == adVar.f31751j0) {
                            i5Var.l(LocaleController.getString(adVar.M0()), false);
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
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    if (i10 == adVar.f31745e0) {
                        s8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    s8Var.i(LocaleController.getString(adVar.P0()), false);
                    if (adVar.f31740b < adVar.z0()) {
                        s8Var.h(adVar.z0());
                        return;
                    } else {
                        s8Var.h(0);
                        return;
                    }
                }
                ((rp0) view).a(adVar.f31761s, false);
                return;
            }
            ((rc) view).a(adVar.f31746f, false);
            return;
        }
        tc tcVar = (tc) view;
        ap0 ap0Var = tcVar.f37601a;
        sc scVar = tcVar.f37602b;
        i11 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
        ap0Var.b(i11, adVar.f31761s, false);
        scVar.b(adVar.f31761s, false);
        scVar.d(adVar.f31766w, false, false);
        scVar.setForum(adVar.R0());
        scVar.e(DialogObject.getEmojiStatusDocumentId(adVar.f31770y), false, false);
        scVar.a(adVar.f31746f);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
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
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.d6 d6Var8;
        int i14;
        ad adVar = this.f35258c;
        if (i10 == 0) {
            Activity parentActivity = adVar.getParentActivity();
            c5Var = ((org.telegram.ui.ActionBar.n2) adVar).parentLayout;
            int I0 = adVar.I0();
            long j3 = adVar.f31738a;
            d6Var8 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(parentActivity, c5Var, I0, j3, d6Var8);
            kaVar.f20351x = true;
            kaVar.setImportantForAccessibility(4);
            kaVar.f20348r = adVar;
            Drawable drawable = adVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            Drawable f7 = ci.b7.f(drawable, i14, adVar.F, adVar.J);
            adVar.H = f7;
            kaVar.setOverrideBackground(f7);
            ycVar = kaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = adVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            d6Var7 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            yc ycVar2 = new yc(i13, parentActivity2, d6Var7);
            ycVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(adVar.F);
            if (wallpaperEmoticon == null && adVar.F == null && adVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            ycVar2.a(wallpaperEmoticon, false);
            ycVar2.setGalleryWallpaper(adVar.G);
            ycVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final mc f34912b;

                {
                    this.f34912b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            ad adVar2 = this.f34912b.f35258c;
                            if (str == null) {
                                adVar2.F = adVar2.G;
                            } else if (str.equals("❌")) {
                                adVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                adVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f18235id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                adVar2.F.settings.emoticon = str;
                            }
                            adVar2.X0(true);
                            adVar2.a1(true);
                            return;
                        default:
                            ad adVar3 = this.f34912b.f35258c;
                            adVar3.f31761s = ((Integer) obj).intValue();
                            if (adVar3.f31770y instanceof TLRPC.TL_emojiStatusCollectible) {
                                adVar3.f31770y = null;
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
            ycVar = new org.telegram.ui.Cells.s8(adVar.getParentActivity(), adVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = adVar.getParentActivity();
            d6Var6 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = d6Var6;
            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(parentActivity3);
            frameLayout.f35493a = i5Var;
            i5Var.setTextSize(16);
            i5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var6));
            frameLayout.addView(i5Var, w7.x5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f35495c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            ycVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = adVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            d6Var5 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            rc rcVar = new rc(i12, parentActivity4, d6Var5);
            rcVar.f36792b.setOnItemClickListener(new ai.n6(5, this, rcVar));
            ycVar = rcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = adVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            d6Var4 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            rp0 rp0Var = new rp0(0, i11, parentActivity5, d6Var4);
            rp0Var.setDivider(false);
            rp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final mc f34912b;

                {
                    this.f34912b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            ad adVar2 = this.f34912b.f35258c;
                            if (str == null) {
                                adVar2.F = adVar2.G;
                            } else if (str.equals("❌")) {
                                adVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                adVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f18235id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                adVar2.F.settings.emoticon = str;
                            }
                            adVar2.X0(true);
                            adVar2.a1(true);
                            return;
                        default:
                            ad adVar3 = this.f34912b.f35258c;
                            adVar3.f31761s = ((Integer) obj).intValue();
                            if (adVar3.f31770y instanceof TLRPC.TL_emojiStatusCollectible) {
                                adVar3.f31770y = null;
                            }
                            adVar3.X0(true);
                            adVar3.b1();
                            adVar3.Z0(true);
                            return;
                    }
                }
            });
            ycVar = rp0Var;
        } else if (i10 == 1) {
            FrameLayout tcVar = new tc(adVar, adVar.getParentActivity());
            ycVar = tcVar;
            if (adVar.d) {
                tcVar.setTag(-33024);
                ycVar = tcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = adVar.getParentActivity();
            d6Var3 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            ycVar = new org.telegram.ui.Cells.m4(parentActivity6, d6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = adVar.getParentActivity();
            d6Var2 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            ycVar = new cp0(parentActivity7, d6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = adVar.getParentActivity();
            d6Var = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(parentActivity8, d6Var);
            u00Var.setIsSingleCell(true);
            u00Var.setViewType(35);
            ycVar = u00Var;
        } else {
            ycVar = new org.telegram.ui.Cells.f9(adVar.getParentActivity());
        }
        return new s4.c1(ycVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42627a;
        boolean z10 = view instanceof tc;
        ad adVar = this.f35258c;
        if (z10) {
            sc scVar = ((tc) view).f37602b;
            TLRPC.EmojiStatus emojiStatus = adVar.f31770y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                scVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) adVar.f31770y).pattern_document_id, true, false);
            } else {
                scVar.b(adVar.f31761s, false);
                scVar.d(adVar.f31766w, false, false);
            }
            scVar.e(DialogObject.getEmojiStatusDocumentId(adVar.f31770y), DialogObject.isEmojiStatusCollectible(adVar.f31770y), false);
            scVar.setForum(adVar.R0());
            scVar.a(adVar.f31746f);
        } else if (view instanceof org.telegram.ui.Cells.ka) {
            ((org.telegram.ui.Cells.ka) view).setOverrideBackground(adVar.H);
        } else {
            ad.Y0(view);
        }
    }
}
