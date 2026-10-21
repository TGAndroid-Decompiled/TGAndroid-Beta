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
public final class nc extends org.telegram.ui.Components.im0 {
    public final bd f39497c;

    public nc(bd bdVar) {
        this.f39497c = bdVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45920f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f39497c.R;
    }

    @Override
    public final int j(int i10) {
        bd bdVar = this.f39497c;
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
        if (i10 == bdVar.f35576b0) {
            return 4;
        }
        if (i10 != bdVar.U && i10 != bdVar.f35578c0 && i10 != bdVar.f35582f0 && i10 != bdVar.f35584h0 && i10 != bdVar.f35586j0) {
            if (i10 != bdVar.X && i10 != bdVar.f35580e0) {
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
        bd bdVar = this.f39497c;
        long j10 = bdVar.f35573a;
        int i16 = b1Var.f45920f;
        View view = b1Var.f45917a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                                d9Var.setFixedSize(0);
                                if (i10 == bdVar.f35574a0) {
                                    d9Var.setFixedSize(12);
                                    d9Var.setText("");
                                    return;
                                } else if (i10 == bdVar.V) {
                                    d9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == bdVar.Y) {
                                    d9Var.setText(LocaleController.getString(bdVar.N0()));
                                    return;
                                } else if (i10 == bdVar.f35579d0) {
                                    d9Var.setText(LocaleController.getString(bdVar.K0()));
                                    return;
                                } else if (i10 == bdVar.f35583g0) {
                                    d9Var.setText(LocaleController.getString(bdVar.E0()));
                                    return;
                                } else if (i10 == bdVar.f35585i0) {
                                    d9Var.setText(LocaleController.getString(bdVar.A0()));
                                    return;
                                } else if (i10 == bdVar.f35587k0) {
                                    d9Var.setText(LocaleController.getString(bdVar.L0()));
                                    return;
                                } else if (i10 == 0) {
                                    d9Var.setText("");
                                    d9Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        oc ocVar = (oc) view;
                        ocVar.e = false;
                        org.telegram.ui.ActionBar.j5 j5Var = ocVar.f39829a;
                        ocVar.setWillNotDraw(true);
                        if (i10 == bdVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            ocVar.a(i15, bdVar.f35581f, true);
                            j5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (bdVar.f35575b < bdVar.getMessagesController().channelBgIconLevelMin) {
                                ocVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(bdVar.f35589n, false, false);
                            return;
                        } else if (i10 == bdVar.f35578c0) {
                            i14 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            ocVar.a(i14, bdVar.f35596s, false);
                            j5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (bdVar.f35580e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ocVar.e = z10;
                            ocVar.setWillNotDraw(!z10);
                            if (bdVar.f35575b < bdVar.J0()) {
                                ocVar.e(bdVar.J0());
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(bdVar.f35601w, false, false);
                            return;
                        } else if (i10 == bdVar.f35582f0) {
                            i13 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            ocVar.a(i13, bdVar.f35596s, false);
                            j5Var.l(LocaleController.getString(bdVar.G0()), false);
                            if (bdVar.f35575b < bdVar.F0()) {
                                ocVar.e(bdVar.F0());
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.f35605y), DialogObject.isEmojiStatusCollectible(bdVar.f35605y), false);
                            return;
                        } else if (i10 == bdVar.f35584h0) {
                            i12 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            ocVar.a(i12, bdVar.f35596s, false);
                            j5Var.l(LocaleController.getString(bdVar.B0()), false);
                            if (bdVar.f35575b < bdVar.H0()) {
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
                        } else if (i10 == bdVar.f35586j0) {
                            j5Var.l(LocaleController.getString(bdVar.M0()), false);
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
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    if (i10 == bdVar.f35580e0) {
                        q8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    q8Var.i(LocaleController.getString(bdVar.P0()), false);
                    if (bdVar.f35575b < bdVar.z0()) {
                        q8Var.h(bdVar.z0());
                        return;
                    } else {
                        q8Var.h(0);
                        return;
                    }
                }
                ((fp0) view).a(bdVar.f35596s, false);
                return;
            }
            ((rc) view).a(bdVar.f35581f, false);
            return;
        }
        tc tcVar = (tc) view;
        oo0 oo0Var = tcVar.f41636a;
        sc scVar = tcVar.f41637b;
        i11 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
        oo0Var.b(i11, bdVar.f35596s, false);
        scVar.b(bdVar.f35596s, false);
        scVar.d(bdVar.f35601w, false, false);
        scVar.setForum(bdVar.R0());
        scVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f35605y), false, false);
        scVar.a(bdVar.f35581f);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
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
        zc zcVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d6 d6Var8;
        int i14;
        bd bdVar = this.f39497c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            d5Var = ((org.telegram.ui.ActionBar.n2) bdVar).parentLayout;
            int I0 = bdVar.I0();
            long j10 = bdVar.f35573a;
            d6Var8 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(parentActivity, d5Var, I0, j10, d6Var8);
            faVar.f22275x = true;
            faVar.setImportantForAccessibility(4);
            faVar.f22272r = bdVar;
            Drawable drawable = bdVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            Drawable f7 = ei.r6.f(drawable, i14, bdVar.F, bdVar.J);
            bdVar.H = f7;
            faVar.setOverrideBackground(f7);
            zcVar = faVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            d6Var7 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zc zcVar2 = new zc(i13, parentActivity2, d6Var7);
            zcVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(bdVar.F);
            if (wallpaperEmoticon == null && bdVar.F == null && bdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar2.a(wallpaperEmoticon, false);
            zcVar2.setGalleryWallpaper(bdVar.G);
            zcVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final nc f39174b;

                {
                    this.f39174b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f39174b.f39497c;
                            if (str == null) {
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20428id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
                            }
                            bdVar2.X0(true);
                            bdVar2.a1(true);
                            return;
                        default:
                            bd bdVar3 = this.f39174b.f39497c;
                            bdVar3.f35596s = ((Integer) obj).intValue();
                            if (bdVar3.f35605y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f35605y = null;
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
            zcVar = new org.telegram.ui.Cells.q8(bdVar.getParentActivity(), bdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = bdVar.getParentActivity();
            d6Var6 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = d6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            frameLayout.f39829a = j5Var;
            j5Var.setTextSize(16);
            j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var6));
            frameLayout.addView(j5Var, w7.z5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f39831c = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            zcVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            d6Var5 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            rc rcVar = new rc(i12, parentActivity4, d6Var5);
            rcVar.f41119b.setOnItemClickListener(new ci.y4(5, this, rcVar));
            zcVar = rcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            d6Var4 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            fp0 fp0Var = new fp0(0, i11, parentActivity5, d6Var4);
            fp0Var.setDivider(false);
            fp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final nc f39174b;

                {
                    this.f39174b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f39174b.f39497c;
                            if (str == null) {
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20428id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
                            }
                            bdVar2.X0(true);
                            bdVar2.a1(true);
                            return;
                        default:
                            bd bdVar3 = this.f39174b.f39497c;
                            bdVar3.f35596s = ((Integer) obj).intValue();
                            if (bdVar3.f35605y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f35605y = null;
                            }
                            bdVar3.X0(true);
                            bdVar3.b1();
                            bdVar3.Z0(true);
                            return;
                    }
                }
            });
            zcVar = fp0Var;
        } else if (i10 == 1) {
            FrameLayout tcVar = new tc(bdVar, bdVar.getParentActivity());
            zcVar = tcVar;
            if (bdVar.d) {
                tcVar.setTag(-33024);
                zcVar = tcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            d6Var3 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zcVar = new org.telegram.ui.Cells.l4(parentActivity6, d6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            d6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zcVar = new qo0(parentActivity7, d6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            d6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(parentActivity8, d6Var);
            b10Var.setIsSingleCell(true);
            b10Var.setViewType(35);
            zcVar = b10Var;
        } else {
            zcVar = new org.telegram.ui.Cells.d9(bdVar.getParentActivity());
        }
        return new s4.b1(zcVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f45917a;
        boolean z10 = view instanceof tc;
        bd bdVar = this.f39497c;
        if (z10) {
            sc scVar = ((tc) view).f41637b;
            TLRPC.EmojiStatus emojiStatus = bdVar.f35605y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                scVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) bdVar.f35605y).pattern_document_id, true, false);
            } else {
                scVar.b(bdVar.f35596s, false);
                scVar.d(bdVar.f35601w, false, false);
            }
            scVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f35605y), DialogObject.isEmojiStatusCollectible(bdVar.f35605y), false);
            scVar.setForum(bdVar.R0());
            scVar.a(bdVar.f35581f);
        } else if (view instanceof org.telegram.ui.Cells.fa) {
            ((org.telegram.ui.Cells.fa) view).setOverrideBackground(bdVar.H);
        } else {
            bd.Y0(view);
        }
    }
}
