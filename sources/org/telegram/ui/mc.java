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
public final class mc extends org.telegram.ui.Components.yl0 {
    public final ad f35617c;

    public mc(ad adVar) {
        this.f35617c = adVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43071f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f35617c.R;
    }

    @Override
    public final int j(int i10) {
        ad adVar = this.f35617c;
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
        if (i10 == adVar.f32176b0) {
            return 4;
        }
        if (i10 != adVar.U && i10 != adVar.f32178c0 && i10 != adVar.f32182f0 && i10 != adVar.f32184h0 && i10 != adVar.f32186j0) {
            if (i10 != adVar.X && i10 != adVar.f32180e0) {
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
        ad adVar = this.f35617c;
        long j3 = adVar.f32173a;
        int i16 = c1Var.f43071f;
        View view = c1Var.f43068a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                                e9Var.setFixedSize(0);
                                if (i10 == adVar.f32174a0) {
                                    e9Var.setFixedSize(12);
                                    e9Var.setText("");
                                    return;
                                } else if (i10 == adVar.V) {
                                    e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == adVar.Y) {
                                    e9Var.setText(LocaleController.getString(adVar.N0()));
                                    return;
                                } else if (i10 == adVar.f32179d0) {
                                    e9Var.setText(LocaleController.getString(adVar.K0()));
                                    return;
                                } else if (i10 == adVar.f32183g0) {
                                    e9Var.setText(LocaleController.getString(adVar.E0()));
                                    return;
                                } else if (i10 == adVar.f32185i0) {
                                    e9Var.setText(LocaleController.getString(adVar.A0()));
                                    return;
                                } else if (i10 == adVar.f32187k0) {
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
                        ncVar.e = false;
                        org.telegram.ui.ActionBar.h5 h5Var = ncVar.f35956a;
                        ncVar.setWillNotDraw(true);
                        if (i10 == adVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
                            ncVar.a(i15, adVar.f32181f, true);
                            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (adVar.f32175b < adVar.getMessagesController().channelBgIconLevelMin) {
                                ncVar.e(adVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                ncVar.e(0);
                            }
                            ncVar.c(adVar.f32189n, false, false);
                            return;
                        } else if (i10 == adVar.f32178c0) {
                            i14 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
                            ncVar.a(i14, adVar.f32196s, false);
                            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (adVar.f32180e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ncVar.e = z10;
                            ncVar.setWillNotDraw(!z10);
                            if (adVar.f32175b < adVar.J0()) {
                                ncVar.e(adVar.J0());
                            } else {
                                ncVar.e(0);
                            }
                            ncVar.c(adVar.f32201w, false, false);
                            return;
                        } else if (i10 == adVar.f32182f0) {
                            i13 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
                            ncVar.a(i13, adVar.f32196s, false);
                            h5Var.l(LocaleController.getString(adVar.G0()), false);
                            if (adVar.f32175b < adVar.F0()) {
                                ncVar.e(adVar.F0());
                            } else {
                                ncVar.e(0);
                            }
                            ncVar.c(DialogObject.getEmojiStatusDocumentId(adVar.f32205y), DialogObject.isEmojiStatusCollectible(adVar.f32205y), false);
                            return;
                        } else if (i10 == adVar.f32184h0) {
                            i12 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
                            ncVar.a(i12, adVar.f32196s, false);
                            h5Var.l(LocaleController.getString(adVar.B0()), false);
                            if (adVar.f32175b < adVar.H0()) {
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
                        } else if (i10 == adVar.f32186j0) {
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
                    if (i10 == adVar.f32180e0) {
                        r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    r8Var.i(LocaleController.getString(adVar.P0()), false);
                    if (adVar.f32175b < adVar.z0()) {
                        r8Var.h(adVar.z0());
                        return;
                    } else {
                        r8Var.h(0);
                        return;
                    }
                }
                ((pp0) view).a(adVar.f32196s, false);
                return;
            }
            ((rc) view).a(adVar.f32181f, false);
            return;
        }
        tc tcVar = (tc) view;
        yo0 yo0Var = tcVar.f38153a;
        sc scVar = tcVar.f38154b;
        i11 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
        yo0Var.b(i11, adVar.f32196s, false);
        scVar.b(adVar.f32196s, false);
        scVar.d(adVar.f32201w, false, false);
        scVar.setForum(adVar.R0());
        scVar.e(DialogObject.getEmojiStatusDocumentId(adVar.f32205y), false, false);
        scVar.a(adVar.f32181f);
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
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.d6 d6Var8;
        int i14;
        ad adVar = this.f35617c;
        if (i10 == 0) {
            Activity parentActivity = adVar.getParentActivity();
            b5Var = ((org.telegram.ui.ActionBar.m2) adVar).parentLayout;
            int I0 = adVar.I0();
            long j3 = adVar.f32173a;
            d6Var8 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(parentActivity, b5Var, I0, j3, d6Var8);
            iaVar.f20490x = true;
            iaVar.setImportantForAccessibility(4);
            iaVar.f20487r = adVar;
            Drawable drawable = adVar.H;
            i14 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
            Drawable f7 = ci.b7.f(drawable, i14, adVar.F, adVar.J);
            adVar.H = f7;
            iaVar.setOverrideBackground(f7);
            ycVar = iaVar;
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
                public final mc f35386b;

                {
                    this.f35386b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            ad adVar2 = this.f35386b.f35617c;
                            if (str == null) {
                                adVar2.F = adVar2.G;
                            } else if (str.equals("❌")) {
                                adVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                adVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f18504id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                adVar2.F.settings.emoticon = str;
                            }
                            adVar2.X0(true);
                            adVar2.a1(true);
                            return;
                        default:
                            ad adVar3 = this.f35386b.f35617c;
                            adVar3.f32196s = ((Integer) obj).intValue();
                            if (adVar3.f32205y instanceof TLRPC.TL_emojiStatusCollectible) {
                                adVar3.f32205y = null;
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
            frameLayout.e = false;
            frameLayout.d = d6Var6;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity3);
            frameLayout.f35956a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var6));
            frameLayout.addView(h5Var, w7.y5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f35958c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            ycVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = adVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
            d6Var5 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            rc rcVar = new rc(i12, parentActivity4, d6Var5);
            rcVar.f37397b.setOnItemClickListener(new ai.n6(5, this, rcVar));
            ycVar = rcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = adVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) adVar).currentAccount;
            d6Var4 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            pp0 pp0Var = new pp0(0, i11, parentActivity5, d6Var4);
            pp0Var.setDivider(false);
            pp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final mc f35386b;

                {
                    this.f35386b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            ad adVar2 = this.f35386b.f35617c;
                            if (str == null) {
                                adVar2.F = adVar2.G;
                            } else if (str.equals("❌")) {
                                adVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                adVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f18504id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                adVar2.F.settings.emoticon = str;
                            }
                            adVar2.X0(true);
                            adVar2.a1(true);
                            return;
                        default:
                            ad adVar3 = this.f35386b.f35617c;
                            adVar3.f32196s = ((Integer) obj).intValue();
                            if (adVar3.f32205y instanceof TLRPC.TL_emojiStatusCollectible) {
                                adVar3.f32205y = null;
                            }
                            adVar3.X0(true);
                            adVar3.b1();
                            adVar3.Z0(true);
                            return;
                    }
                }
            });
            ycVar = pp0Var;
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
            ycVar = new ap0(parentActivity7, d6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = adVar.getParentActivity();
            d6Var = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(parentActivity8, d6Var);
            w00Var.setIsSingleCell(true);
            w00Var.setViewType(35);
            ycVar = w00Var;
        } else {
            ycVar = new org.telegram.ui.Cells.e9(adVar.getParentActivity());
        }
        return new s4.c1(ycVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f43068a;
        boolean z10 = view instanceof tc;
        ad adVar = this.f35617c;
        if (z10) {
            sc scVar = ((tc) view).f38154b;
            TLRPC.EmojiStatus emojiStatus = adVar.f32205y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                scVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) adVar.f32205y).pattern_document_id, true, false);
            } else {
                scVar.b(adVar.f32196s, false);
                scVar.d(adVar.f32201w, false, false);
            }
            scVar.e(DialogObject.getEmojiStatusDocumentId(adVar.f32205y), DialogObject.isEmojiStatusCollectible(adVar.f32205y), false);
            scVar.setForum(adVar.R0());
            scVar.a(adVar.f32181f);
        } else if (view instanceof org.telegram.ui.Cells.ia) {
            ((org.telegram.ui.Cells.ia) view).setOverrideBackground(adVar.H);
        } else {
            ad.Y0(view);
        }
    }
}
