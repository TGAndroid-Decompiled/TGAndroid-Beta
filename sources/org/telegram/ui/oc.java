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
public final class oc extends org.telegram.ui.Components.xl0 {
    public final cd f36179c;

    public oc(cd cdVar) {
        this.f36179c = cdVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43008f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f36179c.R;
    }

    @Override
    public final int j(int i10) {
        cd cdVar = this.f36179c;
        if (i10 == cdVar.S) {
            return 0;
        }
        if (i10 == cdVar.W) {
            return 2;
        }
        if (i10 == cdVar.Z) {
            return 1;
        }
        if (i10 == cdVar.T) {
            return 3;
        }
        if (i10 == cdVar.f32664b0) {
            return 4;
        }
        if (i10 != cdVar.U && i10 != cdVar.f32666c0 && i10 != cdVar.f32670f0 && i10 != cdVar.f32672h0 && i10 != cdVar.f32674j0) {
            if (i10 != cdVar.X && i10 != cdVar.f32668e0) {
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
        cd cdVar = this.f36179c;
        long j3 = cdVar.f32661a;
        int i16 = c1Var.f43008f;
        View view = c1Var.f43005a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                                e9Var.setFixedSize(0);
                                if (i10 == cdVar.f32662a0) {
                                    e9Var.setFixedSize(12);
                                    e9Var.setText("");
                                    return;
                                } else if (i10 == cdVar.V) {
                                    e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == cdVar.Y) {
                                    e9Var.setText(LocaleController.getString(cdVar.N0()));
                                    return;
                                } else if (i10 == cdVar.f32667d0) {
                                    e9Var.setText(LocaleController.getString(cdVar.K0()));
                                    return;
                                } else if (i10 == cdVar.f32671g0) {
                                    e9Var.setText(LocaleController.getString(cdVar.E0()));
                                    return;
                                } else if (i10 == cdVar.f32673i0) {
                                    e9Var.setText(LocaleController.getString(cdVar.A0()));
                                    return;
                                } else if (i10 == cdVar.f32675k0) {
                                    e9Var.setText(LocaleController.getString(cdVar.L0()));
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
                        pcVar.e = false;
                        org.telegram.ui.ActionBar.j5 j5Var = pcVar.f36371a;
                        pcVar.setWillNotDraw(true);
                        if (i10 == cdVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.o2) cdVar).currentAccount;
                            pcVar.a(i15, cdVar.f32669f, true);
                            j5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (cdVar.f32663b < cdVar.getMessagesController().channelBgIconLevelMin) {
                                pcVar.e(cdVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                pcVar.e(0);
                            }
                            pcVar.c(cdVar.f32677n, false, false);
                            return;
                        } else if (i10 == cdVar.f32666c0) {
                            i14 = ((org.telegram.ui.ActionBar.o2) cdVar).currentAccount;
                            pcVar.a(i14, cdVar.f32684s, false);
                            j5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (cdVar.f32668e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            pcVar.e = z10;
                            pcVar.setWillNotDraw(!z10);
                            if (cdVar.f32663b < cdVar.J0()) {
                                pcVar.e(cdVar.J0());
                            } else {
                                pcVar.e(0);
                            }
                            pcVar.c(cdVar.f32689w, false, false);
                            return;
                        } else if (i10 == cdVar.f32670f0) {
                            i13 = ((org.telegram.ui.ActionBar.o2) cdVar).currentAccount;
                            pcVar.a(i13, cdVar.f32684s, false);
                            j5Var.l(LocaleController.getString(cdVar.G0()), false);
                            if (cdVar.f32663b < cdVar.F0()) {
                                pcVar.e(cdVar.F0());
                            } else {
                                pcVar.e(0);
                            }
                            pcVar.c(DialogObject.getEmojiStatusDocumentId(cdVar.f32693y), DialogObject.isEmojiStatusCollectible(cdVar.f32693y), false);
                            return;
                        } else if (i10 == cdVar.f32672h0) {
                            i12 = ((org.telegram.ui.ActionBar.o2) cdVar).currentAccount;
                            pcVar.a(i12, cdVar.f32684s, false);
                            j5Var.l(LocaleController.getString(cdVar.B0()), false);
                            if (cdVar.f32663b < cdVar.H0()) {
                                pcVar.e(cdVar.H0());
                            } else {
                                pcVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = cdVar.getMessagesController().getChatFull(-j3);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                pcVar.c(cdVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                pcVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == cdVar.f32674j0) {
                            j5Var.l(LocaleController.getString(cdVar.M0()), false);
                            pcVar.e(0);
                            TLRPC.ChatFull chatFull2 = cdVar.getMessagesController().getChatFull(-j3);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                pcVar.d(cdVar.C0(stickerSet));
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
                    if (i10 == cdVar.f32668e0) {
                        r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    r8Var.i(LocaleController.getString(cdVar.P0()), false);
                    if (cdVar.f32663b < cdVar.z0()) {
                        r8Var.h(cdVar.z0());
                        return;
                    } else {
                        r8Var.h(0);
                        return;
                    }
                }
                ((tp0) view).a(cdVar.f32684s, false);
                return;
            }
            ((tc) view).a(cdVar.f32669f, false);
            return;
        }
        vc vcVar = (vc) view;
        cp0 cp0Var = vcVar.f38544a;
        uc ucVar = vcVar.f38545b;
        i11 = ((org.telegram.ui.ActionBar.o2) cdVar).currentAccount;
        cp0Var.b(i11, cdVar.f32684s, false);
        ucVar.b(cdVar.f32684s, false);
        ucVar.d(cdVar.f32689w, false, false);
        ucVar.setForum(cdVar.R0());
        ucVar.e(DialogObject.getEmojiStatusDocumentId(cdVar.f32693y), false, false);
        ucVar.a(cdVar.f32669f);
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
        ad adVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.e6 e6Var8;
        int i14;
        cd cdVar = this.f36179c;
        if (i10 == 0) {
            Activity parentActivity = cdVar.getParentActivity();
            d5Var = ((org.telegram.ui.ActionBar.o2) cdVar).parentLayout;
            int I0 = cdVar.I0();
            long j3 = cdVar.f32661a;
            e6Var8 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(parentActivity, d5Var, I0, j3, e6Var8);
            iaVar.f20475x = true;
            iaVar.setImportantForAccessibility(4);
            iaVar.f20472r = cdVar;
            Drawable drawable = cdVar.H;
            i14 = ((org.telegram.ui.ActionBar.o2) cdVar).currentAccount;
            Drawable f7 = ci.b7.f(drawable, i14, cdVar.F, cdVar.J);
            cdVar.H = f7;
            iaVar.setOverrideBackground(f7);
            adVar = iaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = cdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.o2) cdVar).currentAccount;
            e6Var7 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            ad adVar2 = new ad(i13, parentActivity2, e6Var7);
            adVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(cdVar.F);
            if (wallpaperEmoticon == null && cdVar.F == null && cdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            adVar2.a(wallpaperEmoticon, false);
            adVar2.setGalleryWallpaper(cdVar.G);
            adVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final oc f35928b;

                {
                    this.f35928b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            cd cdVar2 = this.f35928b.f36179c;
                            if (str == null) {
                                cdVar2.F = cdVar2.G;
                            } else if (str.equals("❌")) {
                                cdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                cdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f18481id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                cdVar2.F.settings.emoticon = str;
                            }
                            cdVar2.X0(true);
                            cdVar2.a1(true);
                            return;
                        default:
                            cd cdVar3 = this.f35928b.f36179c;
                            cdVar3.f32684s = ((Integer) obj).intValue();
                            if (cdVar3.f32693y instanceof TLRPC.TL_emojiStatusCollectible) {
                                cdVar3.f32693y = null;
                            }
                            cdVar3.X0(true);
                            cdVar3.b1();
                            cdVar3.Z0(true);
                            return;
                    }
                }
            });
            adVar = adVar2;
        } else if (i10 == 5) {
            adVar = new org.telegram.ui.Cells.r8(cdVar.getParentActivity(), cdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = cdVar.getParentActivity();
            e6Var6 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = e6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            frameLayout.f36371a = j5Var;
            j5Var.setTextSize(16);
            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var6));
            frameLayout.addView(j5Var, w7.y5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f36373c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            adVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = cdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.o2) cdVar).currentAccount;
            e6Var5 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            tc tcVar = new tc(i12, parentActivity4, e6Var5);
            tcVar.f37752b.setOnItemClickListener(new ai.n6(5, this, tcVar));
            adVar = tcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = cdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) cdVar).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            tp0 tp0Var = new tp0(0, i11, parentActivity5, e6Var4);
            tp0Var.setDivider(false);
            tp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final oc f35928b;

                {
                    this.f35928b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            cd cdVar2 = this.f35928b.f36179c;
                            if (str == null) {
                                cdVar2.F = cdVar2.G;
                            } else if (str.equals("❌")) {
                                cdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                cdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f18481id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                cdVar2.F.settings.emoticon = str;
                            }
                            cdVar2.X0(true);
                            cdVar2.a1(true);
                            return;
                        default:
                            cd cdVar3 = this.f35928b.f36179c;
                            cdVar3.f32684s = ((Integer) obj).intValue();
                            if (cdVar3.f32693y instanceof TLRPC.TL_emojiStatusCollectible) {
                                cdVar3.f32693y = null;
                            }
                            cdVar3.X0(true);
                            cdVar3.b1();
                            cdVar3.Z0(true);
                            return;
                    }
                }
            });
            adVar = tp0Var;
        } else if (i10 == 1) {
            FrameLayout vcVar = new vc(cdVar, cdVar.getParentActivity());
            adVar = vcVar;
            if (cdVar.d) {
                vcVar.setTag(-33024);
                adVar = vcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = cdVar.getParentActivity();
            e6Var3 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            adVar = new org.telegram.ui.Cells.m4(parentActivity6, e6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = cdVar.getParentActivity();
            e6Var2 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            adVar = new ep0(parentActivity7, e6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = cdVar.getParentActivity();
            e6Var = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(parentActivity8, e6Var);
            v00Var.setIsSingleCell(true);
            v00Var.setViewType(35);
            adVar = v00Var;
        } else {
            adVar = new org.telegram.ui.Cells.e9(cdVar.getParentActivity());
        }
        return new s4.c1(adVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f43005a;
        boolean z10 = view instanceof vc;
        cd cdVar = this.f36179c;
        if (z10) {
            uc ucVar = ((vc) view).f38545b;
            TLRPC.EmojiStatus emojiStatus = cdVar.f32693y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ucVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                ucVar.d(((TLRPC.TL_emojiStatusCollectible) cdVar.f32693y).pattern_document_id, true, false);
            } else {
                ucVar.b(cdVar.f32684s, false);
                ucVar.d(cdVar.f32689w, false, false);
            }
            ucVar.e(DialogObject.getEmojiStatusDocumentId(cdVar.f32693y), DialogObject.isEmojiStatusCollectible(cdVar.f32693y), false);
            ucVar.setForum(cdVar.R0());
            ucVar.a(cdVar.f32669f);
        } else if (view instanceof org.telegram.ui.Cells.ia) {
            ((org.telegram.ui.Cells.ia) view).setOverrideBackground(cdVar.H);
        } else {
            cd.Y0(view);
        }
    }
}
