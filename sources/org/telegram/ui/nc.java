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
public final class nc extends org.telegram.ui.Components.kl0 {
    public final ad f35942c;

    public nc(ad adVar) {
        this.f35942c = adVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42678f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f35942c.R;
    }

    @Override
    public final int j(int i10) {
        ad adVar = this.f35942c;
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
        if (i10 == adVar.f31756b0) {
            return 4;
        }
        if (i10 != adVar.U && i10 != adVar.f31758c0 && i10 != adVar.f31762f0 && i10 != adVar.f31764h0 && i10 != adVar.f31766j0) {
            if (i10 != adVar.X && i10 != adVar.f31760e0) {
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
        ad adVar = this.f35942c;
        long j3 = adVar.f31753a;
        int i16 = c1Var.f42678f;
        View view = c1Var.f42675a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                                e9Var.setFixedSize(0);
                                if (i10 == adVar.f31754a0) {
                                    e9Var.setFixedSize(12);
                                    e9Var.setText("");
                                    return;
                                } else if (i10 == adVar.V) {
                                    e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == adVar.Y) {
                                    e9Var.setText(LocaleController.getString(adVar.N0()));
                                    return;
                                } else if (i10 == adVar.f31759d0) {
                                    e9Var.setText(LocaleController.getString(adVar.K0()));
                                    return;
                                } else if (i10 == adVar.f31763g0) {
                                    e9Var.setText(LocaleController.getString(adVar.E0()));
                                    return;
                                } else if (i10 == adVar.f31765i0) {
                                    e9Var.setText(LocaleController.getString(adVar.A0()));
                                    return;
                                } else if (i10 == adVar.f31767k0) {
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
                        oc ocVar = (oc) view;
                        ocVar.e = false;
                        org.telegram.ui.ActionBar.j5 j5Var = ocVar.f36181a;
                        ocVar.setWillNotDraw(true);
                        if (i10 == adVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
                            ocVar.a(i15, adVar.f31761f, true);
                            j5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (adVar.f31755b < adVar.getMessagesController().channelBgIconLevelMin) {
                                ocVar.e(adVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(adVar.f31769n, false, false);
                            return;
                        } else if (i10 == adVar.f31758c0) {
                            i14 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
                            ocVar.a(i14, adVar.f31776s, false);
                            j5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (adVar.f31760e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ocVar.e = z10;
                            ocVar.setWillNotDraw(!z10);
                            if (adVar.f31755b < adVar.J0()) {
                                ocVar.e(adVar.J0());
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(adVar.f31781w, false, false);
                            return;
                        } else if (i10 == adVar.f31762f0) {
                            i13 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
                            ocVar.a(i13, adVar.f31776s, false);
                            j5Var.l(LocaleController.getString(adVar.G0()), false);
                            if (adVar.f31755b < adVar.F0()) {
                                ocVar.e(adVar.F0());
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(DialogObject.getEmojiStatusDocumentId(adVar.f31785y), DialogObject.isEmojiStatusCollectible(adVar.f31785y), false);
                            return;
                        } else if (i10 == adVar.f31764h0) {
                            i12 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
                            ocVar.a(i12, adVar.f31776s, false);
                            j5Var.l(LocaleController.getString(adVar.B0()), false);
                            if (adVar.f31755b < adVar.H0()) {
                                ocVar.e(adVar.H0());
                            } else {
                                ocVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = adVar.getMessagesController().getChatFull(-j3);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                ocVar.c(adVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                ocVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == adVar.f31766j0) {
                            j5Var.l(LocaleController.getString(adVar.M0()), false);
                            ocVar.e(0);
                            TLRPC.ChatFull chatFull2 = adVar.getMessagesController().getChatFull(-j3);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                ocVar.d(adVar.C0(stickerSet));
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
                    if (i10 == adVar.f31760e0) {
                        r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    r8Var.i(LocaleController.getString(adVar.P0()), false);
                    if (adVar.f31755b < adVar.z0()) {
                        r8Var.h(adVar.z0());
                        return;
                    } else {
                        r8Var.h(0);
                        return;
                    }
                }
                ((xp0) view).a(adVar.f31776s, false);
                return;
            }
            ((rc) view).a(adVar.f31761f, false);
            return;
        }
        tc tcVar = (tc) view;
        gp0 gp0Var = tcVar.f37640a;
        sc scVar = tcVar.f37641b;
        i11 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
        gp0Var.b(i11, adVar.f31776s, false);
        scVar.b(adVar.f31776s, false);
        scVar.d(adVar.f31781w, false, false);
        scVar.setForum(adVar.R0());
        scVar.e(DialogObject.getEmojiStatusDocumentId(adVar.f31785y), false, false);
        scVar.a(adVar.f31761f);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var4;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var5;
        org.telegram.ui.ActionBar.e6 e6Var6;
        int i13;
        org.telegram.ui.ActionBar.e6 e6Var7;
        yc ycVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.e6 e6Var8;
        int i14;
        ad adVar = this.f35942c;
        if (i10 == 0) {
            Activity parentActivity = adVar.getParentActivity();
            d5Var = ((org.telegram.ui.ActionBar.n2) adVar).parentLayout;
            int I0 = adVar.I0();
            long j3 = adVar.f31753a;
            e6Var8 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(parentActivity, d5Var, I0, j3, e6Var8);
            jaVar.f20346x = true;
            jaVar.setImportantForAccessibility(4);
            jaVar.f20343r = adVar;
            Drawable drawable = adVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            Drawable f7 = ci.d7.f(drawable, i14, adVar.F, adVar.J);
            adVar.H = f7;
            jaVar.setOverrideBackground(f7);
            ycVar = jaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = adVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            e6Var7 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            yc ycVar2 = new yc(i13, parentActivity2, e6Var7);
            ycVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(adVar.F);
            if (wallpaperEmoticon == null && adVar.F == null && adVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            ycVar2.a(wallpaperEmoticon, false);
            ycVar2.setGalleryWallpaper(adVar.G);
            ycVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final nc f35697b;

                {
                    this.f35697b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            ad adVar2 = this.f35697b.f35942c;
                            if (str == null) {
                                adVar2.F = adVar2.G;
                            } else if (str.equals("❌")) {
                                adVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                adVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f18264id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                adVar2.F.settings.emoticon = str;
                            }
                            adVar2.X0(true);
                            adVar2.a1(true);
                            return;
                        default:
                            ad adVar3 = this.f35697b.f35942c;
                            adVar3.f31776s = ((Integer) obj).intValue();
                            if (adVar3.f31785y instanceof TLRPC.TL_emojiStatusCollectible) {
                                adVar3.f31785y = null;
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
            e6Var6 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = e6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            frameLayout.f36181a = j5Var;
            j5Var.setTextSize(16);
            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var6));
            frameLayout.addView(j5Var, w7.x5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f36183c = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            ycVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = adVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            e6Var5 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            rc rcVar = new rc(i12, parentActivity4, e6Var5);
            rcVar.f37073b.setOnItemClickListener(new ai.o6(5, this, rcVar));
            ycVar = rcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = adVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            xp0 xp0Var = new xp0(0, i11, parentActivity5, e6Var4);
            xp0Var.setDivider(false);
            xp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final nc f35697b;

                {
                    this.f35697b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            ad adVar2 = this.f35697b.f35942c;
                            if (str == null) {
                                adVar2.F = adVar2.G;
                            } else if (str.equals("❌")) {
                                adVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                adVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f18264id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                adVar2.F.settings.emoticon = str;
                            }
                            adVar2.X0(true);
                            adVar2.a1(true);
                            return;
                        default:
                            ad adVar3 = this.f35697b.f35942c;
                            adVar3.f31776s = ((Integer) obj).intValue();
                            if (adVar3.f31785y instanceof TLRPC.TL_emojiStatusCollectible) {
                                adVar3.f31785y = null;
                            }
                            adVar3.X0(true);
                            adVar3.b1();
                            adVar3.Z0(true);
                            return;
                    }
                }
            });
            ycVar = xp0Var;
        } else if (i10 == 1) {
            FrameLayout tcVar = new tc(adVar, adVar.getParentActivity());
            ycVar = tcVar;
            if (adVar.d) {
                tcVar.setTag(-33024);
                ycVar = tcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = adVar.getParentActivity();
            e6Var3 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            ycVar = new org.telegram.ui.Cells.l4(parentActivity6, e6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = adVar.getParentActivity();
            e6Var2 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            ycVar = new ip0(parentActivity7, e6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = adVar.getParentActivity();
            e6Var = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(parentActivity8, e6Var);
            t00Var.setIsSingleCell(true);
            t00Var.setViewType(35);
            ycVar = t00Var;
        } else {
            ycVar = new org.telegram.ui.Cells.e9(adVar.getParentActivity());
        }
        return new s4.c1(ycVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42675a;
        boolean z10 = view instanceof tc;
        ad adVar = this.f35942c;
        if (z10) {
            sc scVar = ((tc) view).f37641b;
            TLRPC.EmojiStatus emojiStatus = adVar.f31785y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                scVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) adVar.f31785y).pattern_document_id, true, false);
            } else {
                scVar.b(adVar.f31776s, false);
                scVar.d(adVar.f31781w, false, false);
            }
            scVar.e(DialogObject.getEmojiStatusDocumentId(adVar.f31785y), DialogObject.isEmojiStatusCollectible(adVar.f31785y), false);
            scVar.setForum(adVar.R0());
            scVar.a(adVar.f31761f);
        } else if (view instanceof org.telegram.ui.Cells.ja) {
            ((org.telegram.ui.Cells.ja) view).setOverrideBackground(adVar.H);
        } else {
            ad.Y0(view);
        }
    }
}
