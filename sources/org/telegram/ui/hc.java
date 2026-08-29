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
public final class hc extends org.telegram.ui.Components.il0 {
    public final vc f38847c;

    public hc(vc vcVar) {
        this.f38847c = vcVar;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f38847c.N;
    }

    @Override
    public final int j(int i10) {
        vc vcVar = this.f38847c;
        if (i10 == vcVar.O) {
            return 0;
        }
        if (i10 == vcVar.S) {
            return 2;
        }
        if (i10 == vcVar.V) {
            return 1;
        }
        if (i10 == vcVar.P) {
            return 3;
        }
        if (i10 == vcVar.X) {
            return 4;
        }
        if (i10 != vcVar.Q && i10 != vcVar.Y && i10 != vcVar.f43505b0 && i10 != vcVar.f43508d0 && i10 != vcVar.f43512f0) {
            if (i10 != vcVar.T && i10 != vcVar.f43503a0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        vc vcVar = this.f38847c;
        long j10 = vcVar.f43502a;
        int i16 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                                y8Var.setFixedSize(0);
                                if (i10 == vcVar.W) {
                                    y8Var.setFixedSize(12);
                                    y8Var.setText("");
                                    return;
                                } else if (i10 == vcVar.R) {
                                    y8Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == vcVar.U) {
                                    y8Var.setText(LocaleController.getString(vcVar.N0()));
                                    return;
                                } else if (i10 == vcVar.Z) {
                                    y8Var.setText(LocaleController.getString(vcVar.K0()));
                                    return;
                                } else if (i10 == vcVar.f43507c0) {
                                    y8Var.setText(LocaleController.getString(vcVar.E0()));
                                    return;
                                } else if (i10 == vcVar.f43510e0) {
                                    y8Var.setText(LocaleController.getString(vcVar.A0()));
                                    return;
                                } else if (i10 == vcVar.f43513g0) {
                                    y8Var.setText(LocaleController.getString(vcVar.L0()));
                                    return;
                                } else if (i10 == 0) {
                                    y8Var.setText("");
                                    y8Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        ic icVar = (ic) view;
                        icVar.f39203e = false;
                        org.telegram.ui.ActionBar.h5 h5Var = icVar.f39200a;
                        icVar.setWillNotDraw(true);
                        if (i10 == vcVar.Q) {
                            i15 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
                            icVar.a(i15, vcVar.f43511f, true);
                            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (vcVar.f43504b < vcVar.getMessagesController().channelBgIconLevelMin) {
                                icVar.e(vcVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                icVar.e(0);
                            }
                            icVar.c(vcVar.f43519n, false, false);
                            return;
                        } else if (i10 == vcVar.Y) {
                            i14 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
                            icVar.a(i14, vcVar.f43526s, false);
                            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (vcVar.f43503a0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            icVar.f39203e = z10;
                            icVar.setWillNotDraw(!z10);
                            if (vcVar.f43504b < vcVar.J0()) {
                                icVar.e(vcVar.J0());
                            } else {
                                icVar.e(0);
                            }
                            icVar.c(vcVar.f43530w, false, false);
                            return;
                        } else if (i10 == vcVar.f43505b0) {
                            i13 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
                            icVar.a(i13, vcVar.f43526s, false);
                            h5Var.l(LocaleController.getString(vcVar.G0()), false);
                            if (vcVar.f43504b < vcVar.F0()) {
                                icVar.e(vcVar.F0());
                            } else {
                                icVar.e(0);
                            }
                            icVar.c(DialogObject.getEmojiStatusDocumentId(vcVar.f43532y), DialogObject.isEmojiStatusCollectible(vcVar.f43532y), false);
                            return;
                        } else if (i10 == vcVar.f43508d0) {
                            i12 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
                            icVar.a(i12, vcVar.f43526s, false);
                            h5Var.l(LocaleController.getString(vcVar.B0()), false);
                            if (vcVar.f43504b < vcVar.H0()) {
                                icVar.e(vcVar.H0());
                            } else {
                                icVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = vcVar.getMessagesController().getChatFull(-j10);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                icVar.c(vcVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                icVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == vcVar.f43512f0) {
                            h5Var.l(LocaleController.getString(vcVar.M0()), false);
                            icVar.e(0);
                            TLRPC.ChatFull chatFull2 = vcVar.getMessagesController().getChatFull(-j10);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                icVar.d(vcVar.C0(stickerSet));
                                return;
                            } else {
                                icVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (i10 == vcVar.f43503a0) {
                        m8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    m8Var.i(LocaleController.getString(vcVar.P0()), false);
                    if (vcVar.f43504b < vcVar.z0()) {
                        m8Var.h(vcVar.z0());
                        return;
                    } else {
                        m8Var.h(0);
                        return;
                    }
                }
                ((wo0) view).a(vcVar.f43526s, false);
                return;
            }
            ((mc) view).a(vcVar.f43511f, false);
            return;
        }
        oc ocVar = (oc) view;
        ho0 ho0Var = ocVar.f41084a;
        nc ncVar = ocVar.f41085b;
        i11 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
        ho0Var.b(i11, vcVar.f43526s, false);
        ncVar.b(vcVar.f43526s, false);
        ncVar.d(vcVar.f43530w, false, false);
        ncVar.setForum(vcVar.R0());
        ncVar.e(DialogObject.getEmojiStatusDocumentId(vcVar.f43532y), false, false);
        ncVar.a(vcVar.f43511f);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var4;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var5;
        org.telegram.ui.ActionBar.c6 c6Var6;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var7;
        tc tcVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.c6 c6Var8;
        int i14;
        vc vcVar = this.f38847c;
        if (i10 == 0) {
            Activity parentActivity = vcVar.getParentActivity();
            b5Var = ((org.telegram.ui.ActionBar.o2) vcVar).parentLayout;
            int I0 = vcVar.I0();
            long j10 = vcVar.f43502a;
            c6Var8 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(parentActivity, b5Var, I0, j10, c6Var8);
            caVar.f24195x = true;
            caVar.setImportantForAccessibility(4);
            caVar.f24192r = vcVar;
            Drawable drawable = vcVar.D;
            i14 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            Drawable f9 = nh.f6.f(drawable, i14, vcVar.B, vcVar.F);
            vcVar.D = f9;
            caVar.setOverrideBackground(f9);
            tcVar = caVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = vcVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            c6Var7 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            tc tcVar2 = new tc(i13, parentActivity2, c6Var7);
            tcVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(vcVar.B);
            if (wallpaperEmoticon == null && vcVar.B == null && vcVar.C != null) {
                wallpaperEmoticon = "❌";
            }
            tcVar2.a(wallpaperEmoticon, false);
            tcVar2.setGalleryWallpaper(vcVar.C);
            tcVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final hc f38552b;

                {
                    this.f38552b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            vc vcVar2 = this.f38552b.f38847c;
                            if (str == null) {
                                vcVar2.B = vcVar2.C;
                            } else if (str.equals("❌")) {
                                vcVar2.B = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                vcVar2.B = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f22544id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                vcVar2.B.settings.emoticon = str;
                            }
                            vcVar2.X0(true);
                            vcVar2.a1(true);
                            return;
                        default:
                            vc vcVar3 = this.f38552b.f38847c;
                            vcVar3.f43526s = ((Integer) obj).intValue();
                            if (vcVar3.f43532y instanceof TLRPC.TL_emojiStatusCollectible) {
                                vcVar3.f43532y = null;
                            }
                            vcVar3.X0(true);
                            vcVar3.b1();
                            vcVar3.Z0(true);
                            return;
                    }
                }
            });
            tcVar = tcVar2;
        } else if (i10 == 5) {
            tcVar = new org.telegram.ui.Cells.m8(vcVar.getParentActivity(), vcVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = vcVar.getParentActivity();
            c6Var6 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f39203e = false;
            frameLayout.d = c6Var6;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity3);
            frameLayout.f39200a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var6));
            frameLayout.addView(h5Var, i7.f6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f39202c = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            tcVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = vcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            c6Var5 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            mc mcVar = new mc(i12, parentActivity4, c6Var5);
            mcVar.f40520b.setOnItemClickListener(new eg.w0(6, this, mcVar));
            tcVar = mcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = vcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            c6Var4 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            wo0 wo0Var = new wo0(0, i11, parentActivity5, c6Var4);
            wo0Var.setDivider(false);
            wo0Var.setOnColorClick(new Utilities.Callback(this) {
                public final hc f38552b;

                {
                    this.f38552b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            vc vcVar2 = this.f38552b.f38847c;
                            if (str == null) {
                                vcVar2.B = vcVar2.C;
                            } else if (str.equals("❌")) {
                                vcVar2.B = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                vcVar2.B = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f22544id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                vcVar2.B.settings.emoticon = str;
                            }
                            vcVar2.X0(true);
                            vcVar2.a1(true);
                            return;
                        default:
                            vc vcVar3 = this.f38552b.f38847c;
                            vcVar3.f43526s = ((Integer) obj).intValue();
                            if (vcVar3.f43532y instanceof TLRPC.TL_emojiStatusCollectible) {
                                vcVar3.f43532y = null;
                            }
                            vcVar3.X0(true);
                            vcVar3.b1();
                            vcVar3.Z0(true);
                            return;
                    }
                }
            });
            tcVar = wo0Var;
        } else if (i10 == 1) {
            FrameLayout ocVar = new oc(vcVar, vcVar.getParentActivity());
            tcVar = ocVar;
            if (vcVar.d) {
                ocVar.setTag(-33024);
                tcVar = ocVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = vcVar.getParentActivity();
            c6Var3 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            tcVar = new org.telegram.ui.Cells.k4(parentActivity6, c6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = vcVar.getParentActivity();
            c6Var2 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            tcVar = new jo0(parentActivity7, c6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = vcVar.getParentActivity();
            c6Var = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(parentActivity8, c6Var);
            p00Var.setIsSingleCell(true);
            p00Var.setViewType(35);
            tcVar = p00Var;
        } else {
            tcVar = new org.telegram.ui.Cells.y8(vcVar.getParentActivity());
        }
        return new f2.n1(tcVar);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        boolean z10 = view instanceof oc;
        vc vcVar = this.f38847c;
        if (z10) {
            nc ncVar = ((oc) view).f41085b;
            TLRPC.EmojiStatus emojiStatus = vcVar.f43532y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ncVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                ncVar.d(((TLRPC.TL_emojiStatusCollectible) vcVar.f43532y).pattern_document_id, true, false);
            } else {
                ncVar.b(vcVar.f43526s, false);
                ncVar.d(vcVar.f43530w, false, false);
            }
            ncVar.e(DialogObject.getEmojiStatusDocumentId(vcVar.f43532y), DialogObject.isEmojiStatusCollectible(vcVar.f43532y), false);
            ncVar.setForum(vcVar.R0());
            ncVar.a(vcVar.f43511f);
        } else if (view instanceof org.telegram.ui.Cells.ca) {
            ((org.telegram.ui.Cells.ca) view).setOverrideBackground(vcVar.D);
        } else {
            vc.Y0(view);
        }
    }
}
