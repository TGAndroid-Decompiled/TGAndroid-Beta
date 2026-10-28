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
public final class oc extends org.telegram.ui.Components.mm0 {
    public final bd f42060c;

    public oc(bd bdVar) {
        this.f42060c = bdVar;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f42060c.R;
    }

    @Override
    public final int j(int i10) {
        bd bdVar = this.f42060c;
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
        if (i10 == bdVar.f37980b0) {
            return 4;
        }
        if (i10 != bdVar.U && i10 != bdVar.f37982c0 && i10 != bdVar.f37986f0 && i10 != bdVar.f37988h0 && i10 != bdVar.f37990j0) {
            if (i10 != bdVar.X && i10 != bdVar.f37984e0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        bd bdVar = this.f42060c;
        long j10 = bdVar.f37977a;
        int i16 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                                i9Var.setFixedSize(0);
                                if (i10 == bdVar.f37978a0) {
                                    i9Var.setFixedSize(12);
                                    i9Var.setText("");
                                    return;
                                } else if (i10 == bdVar.V) {
                                    i9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == bdVar.Y) {
                                    i9Var.setText(LocaleController.getString(bdVar.Q0()));
                                    return;
                                } else if (i10 == bdVar.f37983d0) {
                                    i9Var.setText(LocaleController.getString(bdVar.N0()));
                                    return;
                                } else if (i10 == bdVar.f37987g0) {
                                    i9Var.setText(LocaleController.getString(bdVar.H0()));
                                    return;
                                } else if (i10 == bdVar.f37989i0) {
                                    i9Var.setText(LocaleController.getString(bdVar.D0()));
                                    return;
                                } else if (i10 == bdVar.f37991k0) {
                                    i9Var.setText(LocaleController.getString(bdVar.O0()));
                                    return;
                                } else if (i10 == 0) {
                                    i9Var.setText("");
                                    i9Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        pc pcVar = (pc) view;
                        pcVar.e = false;
                        org.telegram.ui.ActionBar.b6 b6Var = pcVar.f42371a;
                        pcVar.setWillNotDraw(true);
                        if (i10 == bdVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
                            pcVar.a(i15, bdVar.f37985f, true);
                            b6Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (bdVar.f37979b < bdVar.getMessagesController().channelBgIconLevelMin) {
                                pcVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                pcVar.e(0);
                            }
                            pcVar.c(bdVar.f37993n, false, false);
                            return;
                        } else if (i10 == bdVar.f37982c0) {
                            i14 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
                            pcVar.a(i14, bdVar.f38000s, false);
                            b6Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (bdVar.f37984e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            pcVar.e = z10;
                            pcVar.setWillNotDraw(!z10);
                            if (bdVar.f37979b < bdVar.M0()) {
                                pcVar.e(bdVar.M0());
                            } else {
                                pcVar.e(0);
                            }
                            pcVar.c(bdVar.f38005w, false, false);
                            return;
                        } else if (i10 == bdVar.f37986f0) {
                            i13 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
                            pcVar.a(i13, bdVar.f38000s, false);
                            b6Var.l(LocaleController.getString(bdVar.J0()), false);
                            if (bdVar.f37979b < bdVar.I0()) {
                                pcVar.e(bdVar.I0());
                            } else {
                                pcVar.e(0);
                            }
                            pcVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.f38009y), DialogObject.isEmojiStatusCollectible(bdVar.f38009y), false);
                            return;
                        } else if (i10 == bdVar.f37988h0) {
                            i12 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
                            pcVar.a(i12, bdVar.f38000s, false);
                            b6Var.l(LocaleController.getString(bdVar.E0()), false);
                            if (bdVar.f37979b < bdVar.K0()) {
                                pcVar.e(bdVar.K0());
                            } else {
                                pcVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j10);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                pcVar.c(bdVar.G0(stickerSet2), false, false);
                                return;
                            } else {
                                pcVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == bdVar.f37990j0) {
                            b6Var.l(LocaleController.getString(bdVar.P0()), false);
                            pcVar.e(0);
                            TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j10);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                pcVar.d(bdVar.F0(stickerSet));
                                return;
                            } else {
                                pcVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    if (i10 == bdVar.f37984e0) {
                        v8Var.k(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    v8Var.k(LocaleController.getString(bdVar.S0()), false);
                    if (bdVar.f37979b < bdVar.C0()) {
                        v8Var.j(bdVar.C0());
                        return;
                    } else {
                        v8Var.j(0);
                        return;
                    }
                }
                ((qp0) view).a(bdVar.f38000s, false);
                return;
            }
            ((sc) view).a(bdVar.f37985f, false);
            return;
        }
        uc ucVar = (uc) view;
        zo0 zo0Var = ucVar.f43981a;
        tc tcVar = ucVar.f43982b;
        i11 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
        zo0Var.b(i11, bdVar.f38000s, false);
        tcVar.b(bdVar.f38000s, false);
        tcVar.d(bdVar.f38005w, false, false);
        tcVar.setForum(bdVar.U0());
        tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f38009y), false, false);
        tcVar.a(bdVar.f37985f);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var4;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var5;
        org.telegram.ui.ActionBar.u6 u6Var6;
        int i13;
        org.telegram.ui.ActionBar.u6 u6Var7;
        zc zcVar;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.u6 u6Var8;
        int i14;
        bd bdVar = this.f42060c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            j5Var = ((org.telegram.ui.ActionBar.r2) bdVar).parentLayout;
            int L0 = bdVar.L0();
            long j10 = bdVar.f37977a;
            u6Var8 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(parentActivity, j5Var, L0, j10, u6Var8);
            kaVar.f24369x = true;
            kaVar.setImportantForAccessibility(4);
            kaVar.f24366r = bdVar;
            Drawable drawable = bdVar.H;
            i14 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            Drawable f7 = fi.o6.f(drawable, i14, bdVar.F, bdVar.J);
            bdVar.H = f7;
            kaVar.setOverrideBackground(f7);
            zcVar = kaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            u6Var7 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            zc zcVar2 = new zc(i13, parentActivity2, u6Var7);
            zcVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(bdVar.F);
            if (wallpaperEmoticon == null && bdVar.F == null && bdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar2.a(wallpaperEmoticon, false);
            zcVar2.setGalleryWallpaper(bdVar.G);
            zcVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final oc f41738b;

                {
                    this.f41738b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f41738b.f42060c;
                            if (str == null) {
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f22182id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
                            }
                            bdVar2.a1(true);
                            bdVar2.d1(true);
                            return;
                        default:
                            bd bdVar3 = this.f41738b.f42060c;
                            bdVar3.f38000s = ((Integer) obj).intValue();
                            if (bdVar3.f38009y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f38009y = null;
                            }
                            bdVar3.a1(true);
                            bdVar3.e1();
                            bdVar3.c1(true);
                            return;
                    }
                }
            });
            zcVar = zcVar2;
        } else if (i10 == 5) {
            zcVar = new org.telegram.ui.Cells.v8(bdVar.getParentActivity(), bdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = bdVar.getParentActivity();
            u6Var6 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = u6Var6;
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(parentActivity3);
            frameLayout.f42371a = b6Var;
            b6Var.setTextSize(16);
            org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var6);
            frameLayout.addView(b6Var, org.telegram.ui.Components.kb1.h(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f42373c = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            zcVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            u6Var5 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            sc scVar = new sc(i12, parentActivity4, u6Var5);
            scVar.f43293b.setOnItemClickListener(new di.x4(5, this, scVar));
            zcVar = scVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            u6Var4 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            qp0 qp0Var = new qp0(0, i11, parentActivity5, u6Var4);
            qp0Var.setDivider(false);
            qp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final oc f41738b;

                {
                    this.f41738b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f41738b.f42060c;
                            if (str == null) {
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f22182id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
                            }
                            bdVar2.a1(true);
                            bdVar2.d1(true);
                            return;
                        default:
                            bd bdVar3 = this.f41738b.f42060c;
                            bdVar3.f38000s = ((Integer) obj).intValue();
                            if (bdVar3.f38009y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f38009y = null;
                            }
                            bdVar3.a1(true);
                            bdVar3.e1();
                            bdVar3.c1(true);
                            return;
                    }
                }
            });
            zcVar = qp0Var;
        } else if (i10 == 1) {
            FrameLayout ucVar = new uc(bdVar, bdVar.getParentActivity());
            zcVar = ucVar;
            if (bdVar.d) {
                ucVar.setTag(-33024);
                zcVar = ucVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            u6Var3 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            zcVar = new org.telegram.ui.Cells.q4(parentActivity6, u6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            u6Var2 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            zcVar = new bp0(parentActivity7, u6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            u6Var = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(parentActivity8, u6Var);
            c10Var.setIsSingleCell(true);
            c10Var.setViewType(35);
            zcVar = c10Var;
        } else {
            zcVar = new org.telegram.ui.Cells.i9(bdVar.getParentActivity());
        }
        return new s4.e1(zcVar);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        View view = e1Var.f47773a;
        boolean z10 = view instanceof uc;
        bd bdVar = this.f42060c;
        if (z10) {
            tc tcVar = ((uc) view).f43982b;
            TLRPC.EmojiStatus emojiStatus = bdVar.f38009y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                tcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                tcVar.d(((TLRPC.TL_emojiStatusCollectible) bdVar.f38009y).pattern_document_id, true, false);
            } else {
                tcVar.b(bdVar.f38000s, false);
                tcVar.d(bdVar.f38005w, false, false);
            }
            tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f38009y), DialogObject.isEmojiStatusCollectible(bdVar.f38009y), false);
            tcVar.setForum(bdVar.U0());
            tcVar.a(bdVar.f37985f);
        } else if (view instanceof org.telegram.ui.Cells.ka) {
            ((org.telegram.ui.Cells.ka) view).setOverrideBackground(bdVar.H);
        } else {
            bd.b1(view);
        }
    }
}
