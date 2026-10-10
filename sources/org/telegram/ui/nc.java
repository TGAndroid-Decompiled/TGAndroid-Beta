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
public final class nc extends org.telegram.ui.Components.qm0 {
    public final bd f40211c;

    public nc(bd bdVar) {
        this.f40211c = bdVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47706f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f40211c.R;
    }

    @Override
    public final int j(int i10) {
        bd bdVar = this.f40211c;
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
        if (i10 == bdVar.f36294b0) {
            return 4;
        }
        if (i10 != bdVar.U && i10 != bdVar.f36296c0 && i10 != bdVar.f36301f0 && i10 != bdVar.f36303h0 && i10 != bdVar.f36305j0) {
            if (i10 != bdVar.X && i10 != bdVar.f36299e0) {
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
        bd bdVar = this.f40211c;
        long j3 = bdVar.f36291a;
        int i16 = d1Var.f47706f;
        View view = d1Var.f47702a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                                e9Var.setFixedSize(0);
                                if (i10 == bdVar.f36292a0) {
                                    e9Var.setFixedSize(12);
                                    e9Var.setText("");
                                    return;
                                } else if (i10 == bdVar.V) {
                                    e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == bdVar.Y) {
                                    e9Var.setText(LocaleController.getString(bdVar.N0()));
                                    return;
                                } else if (i10 == bdVar.f36297d0) {
                                    e9Var.setText(LocaleController.getString(bdVar.K0()));
                                    return;
                                } else if (i10 == bdVar.f36302g0) {
                                    e9Var.setText(LocaleController.getString(bdVar.E0()));
                                    return;
                                } else if (i10 == bdVar.f36304i0) {
                                    e9Var.setText(LocaleController.getString(bdVar.A0()));
                                    return;
                                } else if (i10 == bdVar.f36306k0) {
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
                        oc ocVar = (oc) view;
                        ocVar.f40537e = false;
                        org.telegram.ui.ActionBar.j5 j5Var = ocVar.f40534a;
                        ocVar.setWillNotDraw(true);
                        if (i10 == bdVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            ocVar.a(i15, bdVar.f36300f, true);
                            j5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (bdVar.f36293b < bdVar.getMessagesController().channelBgIconLevelMin) {
                                ocVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(bdVar.f36308n, false, false);
                            return;
                        } else if (i10 == bdVar.f36296c0) {
                            i14 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            ocVar.a(i14, bdVar.f36315s, false);
                            j5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (bdVar.f36299e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ocVar.f40537e = z10;
                            ocVar.setWillNotDraw(!z10);
                            if (bdVar.f36293b < bdVar.J0()) {
                                ocVar.e(bdVar.J0());
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(bdVar.f36320w, false, false);
                            return;
                        } else if (i10 == bdVar.f36301f0) {
                            i13 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            ocVar.a(i13, bdVar.f36315s, false);
                            j5Var.l(LocaleController.getString(bdVar.G0()), false);
                            if (bdVar.f36293b < bdVar.F0()) {
                                ocVar.e(bdVar.F0());
                            } else {
                                ocVar.e(0);
                            }
                            ocVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.f36324y), DialogObject.isEmojiStatusCollectible(bdVar.f36324y), false);
                            return;
                        } else if (i10 == bdVar.f36303h0) {
                            i12 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
                            ocVar.a(i12, bdVar.f36315s, false);
                            j5Var.l(LocaleController.getString(bdVar.B0()), false);
                            if (bdVar.f36293b < bdVar.H0()) {
                                ocVar.e(bdVar.H0());
                            } else {
                                ocVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j3);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                ocVar.c(bdVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                ocVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == bdVar.f36305j0) {
                            j5Var.l(LocaleController.getString(bdVar.M0()), false);
                            ocVar.e(0);
                            TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j3);
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
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == bdVar.f36299e0) {
                        r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    r8Var.i(LocaleController.getString(bdVar.P0()), false);
                    if (bdVar.f36293b < bdVar.z0()) {
                        r8Var.h(bdVar.z0());
                        return;
                    } else {
                        r8Var.h(0);
                        return;
                    }
                }
                ((xp0) view).a(bdVar.f36315s, false);
                return;
            }
            ((sc) view).a(bdVar.f36300f, false);
            return;
        }
        uc ucVar = (uc) view;
        gp0 gp0Var = ucVar.f42440a;
        tc tcVar = ucVar.f42441b;
        i11 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
        gp0Var.b(i11, bdVar.f36315s, false);
        tcVar.b(bdVar.f36315s, false);
        tcVar.d(bdVar.f36320w, false, false);
        tcVar.setForum(bdVar.R0());
        tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f36324y), false, false);
        tcVar.a(bdVar.f36300f);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
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
        zc zcVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.e6 e6Var8;
        int i14;
        bd bdVar = this.f40211c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            d5Var = ((org.telegram.ui.ActionBar.n2) bdVar).parentLayout;
            int I0 = bdVar.I0();
            long j3 = bdVar.f36291a;
            e6Var8 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(parentActivity, d5Var, I0, j3, e6Var8);
            gaVar.f22177x = true;
            gaVar.setImportantForAccessibility(4);
            gaVar.f22174r = bdVar;
            Drawable drawable = bdVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            Drawable f7 = ci.b7.f(drawable, i14, bdVar.F, bdVar.J);
            bdVar.H = f7;
            gaVar.setOverrideBackground(f7);
            zcVar = gaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            e6Var7 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zc zcVar2 = new zc(i13, parentActivity2, e6Var7);
            zcVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(bdVar.F);
            if (wallpaperEmoticon == null && bdVar.F == null && bdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar2.a(wallpaperEmoticon, false);
            zcVar2.setGalleryWallpaper(bdVar.G);
            zcVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final nc f39871b;

                {
                    this.f39871b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f39871b.f40211c;
                            if (str == null) {
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20194id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
                            }
                            bdVar2.X0(true);
                            bdVar2.a1(true);
                            return;
                        default:
                            bd bdVar3 = this.f39871b.f40211c;
                            bdVar3.f36315s = ((Integer) obj).intValue();
                            if (bdVar3.f36324y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f36324y = null;
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
            e6Var6 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f40537e = false;
            frameLayout.d = e6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            frameLayout.f40534a = j5Var;
            j5Var.setTextSize(16);
            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var6));
            frameLayout.addView(j5Var, w7.x5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -1, 23));
            frameLayout.f40536c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            zcVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            e6Var5 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            sc scVar = new sc(i12, parentActivity4, e6Var5);
            scVar.f41710b.setOnItemClickListener(new ai.o6(5, this, scVar));
            zcVar = scVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            xp0 xp0Var = new xp0(0, i11, parentActivity5, e6Var4);
            xp0Var.setDivider(false);
            xp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final nc f39871b;

                {
                    this.f39871b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.f39871b.f40211c;
                            if (str == null) {
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20194id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
                            }
                            bdVar2.X0(true);
                            bdVar2.a1(true);
                            return;
                        default:
                            bd bdVar3 = this.f39871b.f40211c;
                            bdVar3.f36315s = ((Integer) obj).intValue();
                            if (bdVar3.f36324y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.f36324y = null;
                            }
                            bdVar3.X0(true);
                            bdVar3.b1();
                            bdVar3.Z0(true);
                            return;
                    }
                }
            });
            zcVar = xp0Var;
        } else if (i10 == 1) {
            FrameLayout ucVar = new uc(bdVar, bdVar.getParentActivity());
            zcVar = ucVar;
            if (bdVar.d) {
                ucVar.setTag(-33024);
                zcVar = ucVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            e6Var3 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zcVar = new org.telegram.ui.Cells.m4(parentActivity6, e6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            e6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zcVar = new ip0(parentActivity7, e6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            e6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(parentActivity8, e6Var);
            k10Var.setIsSingleCell(true);
            k10Var.setViewType(35);
            zcVar = k10Var;
        } else {
            zcVar = new org.telegram.ui.Cells.e9(bdVar.getParentActivity());
        }
        return new s4.d1(zcVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47702a;
        boolean z10 = view instanceof uc;
        bd bdVar = this.f40211c;
        if (z10) {
            tc tcVar = ((uc) view).f42441b;
            TLRPC.EmojiStatus emojiStatus = bdVar.f36324y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                tcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                tcVar.d(((TLRPC.TL_emojiStatusCollectible) bdVar.f36324y).pattern_document_id, true, false);
            } else {
                tcVar.b(bdVar.f36315s, false);
                tcVar.d(bdVar.f36320w, false, false);
            }
            tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.f36324y), DialogObject.isEmojiStatusCollectible(bdVar.f36324y), false);
            tcVar.setForum(bdVar.R0());
            tcVar.a(bdVar.f36300f);
        } else if (view instanceof org.telegram.ui.Cells.ga) {
            ((org.telegram.ui.Cells.ga) view).setOverrideBackground(bdVar.H);
        } else {
            bd.Y0(view);
        }
    }
}
