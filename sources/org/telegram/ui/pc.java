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
public final class pc extends org.telegram.ui.Components.ql0 {
    public final dd f37072c;

    public pc(dd ddVar) {
        this.f37072c = ddVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f37072c.O;
    }

    @Override
    public final int j(int i10) {
        dd ddVar = this.f37072c;
        if (i10 == ddVar.P) {
            return 0;
        }
        if (i10 == ddVar.T) {
            return 2;
        }
        if (i10 == ddVar.W) {
            return 1;
        }
        if (i10 == ddVar.Q) {
            return 3;
        }
        if (i10 == ddVar.Y) {
            return 4;
        }
        if (i10 != ddVar.R && i10 != ddVar.Z && i10 != ddVar.f33421c0 && i10 != ddVar.f33423e0 && i10 != ddVar.f33426g0) {
            if (i10 != ddVar.U && i10 != ddVar.f33419b0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        boolean z4;
        int i15;
        dd ddVar = this.f37072c;
        long j10 = ddVar.f33416a;
        int i16 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                                z8Var.setFixedSize(0);
                                if (i10 == ddVar.X) {
                                    z8Var.setFixedSize(12);
                                    z8Var.setText("");
                                    return;
                                } else if (i10 == ddVar.S) {
                                    z8Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == ddVar.V) {
                                    z8Var.setText(LocaleController.getString(ddVar.N0()));
                                    return;
                                } else if (i10 == ddVar.f33417a0) {
                                    z8Var.setText(LocaleController.getString(ddVar.K0()));
                                    return;
                                } else if (i10 == ddVar.f33422d0) {
                                    z8Var.setText(LocaleController.getString(ddVar.E0()));
                                    return;
                                } else if (i10 == ddVar.f33425f0) {
                                    z8Var.setText(LocaleController.getString(ddVar.A0()));
                                    return;
                                } else if (i10 == ddVar.f33427h0) {
                                    z8Var.setText(LocaleController.getString(ddVar.L0()));
                                    return;
                                } else if (i10 == 0) {
                                    z8Var.setText("");
                                    z8Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        qc qcVar = (qc) view;
                        qcVar.e = false;
                        org.telegram.ui.ActionBar.k5 k5Var = qcVar.f37379a;
                        qcVar.setWillNotDraw(true);
                        if (i10 == ddVar.R) {
                            i15 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
                            qcVar.a(i15, ddVar.f33424f, true);
                            k5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (ddVar.f33418b < ddVar.getMessagesController().channelBgIconLevelMin) {
                                qcVar.e(ddVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                qcVar.e(0);
                            }
                            qcVar.c(ddVar.f33432n, false, false);
                            return;
                        } else if (i10 == ddVar.Z) {
                            i14 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
                            qcVar.a(i14, ddVar.f33439s, false);
                            k5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (ddVar.f33419b0 >= 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            qcVar.e = z4;
                            qcVar.setWillNotDraw(!z4);
                            if (ddVar.f33418b < ddVar.J0()) {
                                qcVar.e(ddVar.J0());
                            } else {
                                qcVar.e(0);
                            }
                            qcVar.c(ddVar.f33444w, false, false);
                            return;
                        } else if (i10 == ddVar.f33421c0) {
                            i13 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
                            qcVar.a(i13, ddVar.f33439s, false);
                            k5Var.l(LocaleController.getString(ddVar.G0()), false);
                            if (ddVar.f33418b < ddVar.F0()) {
                                qcVar.e(ddVar.F0());
                            } else {
                                qcVar.e(0);
                            }
                            qcVar.c(DialogObject.getEmojiStatusDocumentId(ddVar.f33446y), DialogObject.isEmojiStatusCollectible(ddVar.f33446y), false);
                            return;
                        } else if (i10 == ddVar.f33423e0) {
                            i12 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
                            qcVar.a(i12, ddVar.f33439s, false);
                            k5Var.l(LocaleController.getString(ddVar.B0()), false);
                            if (ddVar.f33418b < ddVar.H0()) {
                                qcVar.e(ddVar.H0());
                            } else {
                                qcVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = ddVar.getMessagesController().getChatFull(-j10);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                qcVar.c(ddVar.D0(stickerSet2), false, false);
                                return;
                            } else {
                                qcVar.c(0L, false, false);
                                return;
                            }
                        } else if (i10 == ddVar.f33426g0) {
                            k5Var.l(LocaleController.getString(ddVar.M0()), false);
                            qcVar.e(0);
                            TLRPC.ChatFull chatFull2 = ddVar.getMessagesController().getChatFull(-j10);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                qcVar.d(ddVar.C0(stickerSet));
                                return;
                            } else {
                                qcVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    if (i10 == ddVar.f33419b0) {
                        n8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    n8Var.i(LocaleController.getString(ddVar.P0()), false);
                    if (ddVar.f33418b < ddVar.z0()) {
                        n8Var.h(ddVar.z0());
                        return;
                    } else {
                        n8Var.h(0);
                        return;
                    }
                }
                ((kp0) view).a(ddVar.f33439s, false);
                return;
            }
            ((uc) view).a(ddVar.f33424f, false);
            return;
        }
        wc wcVar = (wc) view;
        to0 to0Var = wcVar.f39334a;
        vc vcVar = wcVar.f39335b;
        i11 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
        to0Var.b(i11, ddVar.f33439s, false);
        vcVar.b(ddVar.f33439s, false);
        vcVar.d(ddVar.f33444w, false, false);
        vcVar.setForum(ddVar.R0());
        vcVar.e(DialogObject.getEmojiStatusDocumentId(ddVar.f33446y), false, false);
        vcVar.a(ddVar.f33424f);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
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
        bd bdVar;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.f6 f6Var8;
        int i14;
        dd ddVar = this.f37072c;
        if (i10 == 0) {
            Activity parentActivity = ddVar.getParentActivity();
            e5Var = ((org.telegram.ui.ActionBar.p2) ddVar).parentLayout;
            int I0 = ddVar.I0();
            long j10 = ddVar.f33416a;
            f6Var8 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            org.telegram.ui.Cells.da daVar = new org.telegram.ui.Cells.da(parentActivity, e5Var, I0, j10, f6Var8);
            daVar.f20958x = true;
            daVar.setImportantForAccessibility(4);
            daVar.f20955r = ddVar;
            Drawable drawable = ddVar.E;
            i14 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            Drawable f10 = ph.k5.f(drawable, i14, ddVar.C, ddVar.G);
            ddVar.E = f10;
            daVar.setOverrideBackground(f10);
            bdVar = daVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = ddVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            f6Var7 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            bd bdVar2 = new bd(i13, parentActivity2, f6Var7);
            bdVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(ddVar.C);
            if (wallpaperEmoticon == null && ddVar.C == null && ddVar.D != null) {
                wallpaperEmoticon = "❌";
            }
            bdVar2.a(wallpaperEmoticon, false);
            bdVar2.setGalleryWallpaper(ddVar.D);
            bdVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final pc f36748b;

                {
                    this.f36748b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            dd ddVar2 = this.f36748b.f37072c;
                            if (str == null) {
                                ddVar2.C = ddVar2.D;
                            } else if (str.equals("❌")) {
                                ddVar2.C = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                ddVar2.C = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f19311id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                ddVar2.C.settings.emoticon = str;
                            }
                            ddVar2.X0(true);
                            ddVar2.a1(true);
                            return;
                        default:
                            dd ddVar3 = this.f36748b.f37072c;
                            ddVar3.f33439s = ((Integer) obj).intValue();
                            if (ddVar3.f33446y instanceof TLRPC.TL_emojiStatusCollectible) {
                                ddVar3.f33446y = null;
                            }
                            ddVar3.X0(true);
                            ddVar3.b1();
                            ddVar3.Z0(true);
                            return;
                    }
                }
            });
            bdVar = bdVar2;
        } else if (i10 == 5) {
            bdVar = new org.telegram.ui.Cells.n8(ddVar.getParentActivity(), ddVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = ddVar.getParentActivity();
            f6Var6 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = f6Var6;
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(parentActivity3);
            frameLayout.f37379a = k5Var;
            k5Var.setTextSize(16);
            k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var6));
            frameLayout.addView(k5Var, k7.b6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f37381c = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            bdVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = ddVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            f6Var5 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            uc ucVar = new uc(i12, parentActivity4, f6Var5);
            ucVar.f38772b.setOnItemClickListener(new gg.v0(6, this, ucVar));
            bdVar = ucVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = ddVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            kp0 kp0Var = new kp0(0, i11, parentActivity5, f6Var4);
            kp0Var.setDivider(false);
            kp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final pc f36748b;

                {
                    this.f36748b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            dd ddVar2 = this.f36748b.f37072c;
                            if (str == null) {
                                ddVar2.C = ddVar2.D;
                            } else if (str.equals("❌")) {
                                ddVar2.C = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                ddVar2.C = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f19311id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                ddVar2.C.settings.emoticon = str;
                            }
                            ddVar2.X0(true);
                            ddVar2.a1(true);
                            return;
                        default:
                            dd ddVar3 = this.f36748b.f37072c;
                            ddVar3.f33439s = ((Integer) obj).intValue();
                            if (ddVar3.f33446y instanceof TLRPC.TL_emojiStatusCollectible) {
                                ddVar3.f33446y = null;
                            }
                            ddVar3.X0(true);
                            ddVar3.b1();
                            ddVar3.Z0(true);
                            return;
                    }
                }
            });
            bdVar = kp0Var;
        } else if (i10 == 1) {
            FrameLayout wcVar = new wc(ddVar, ddVar.getParentActivity());
            bdVar = wcVar;
            if (ddVar.d) {
                wcVar.setTag(-33024);
                bdVar = wcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = ddVar.getParentActivity();
            f6Var3 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            bdVar = new org.telegram.ui.Cells.l4(parentActivity6, f6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = ddVar.getParentActivity();
            f6Var2 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            bdVar = new vo0(parentActivity7, f6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = ddVar.getParentActivity();
            f6Var = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(parentActivity8, f6Var);
            u00Var.setIsSingleCell(true);
            u00Var.setViewType(35);
            bdVar = u00Var;
        } else {
            bdVar = new org.telegram.ui.Cells.z8(ddVar.getParentActivity());
        }
        return new f2.l1(bdVar);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        boolean z4 = view instanceof wc;
        dd ddVar = this.f37072c;
        if (z4) {
            vc vcVar = ((wc) view).f39335b;
            TLRPC.EmojiStatus emojiStatus = ddVar.f33446y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                vcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                vcVar.d(((TLRPC.TL_emojiStatusCollectible) ddVar.f33446y).pattern_document_id, true, false);
            } else {
                vcVar.b(ddVar.f33439s, false);
                vcVar.d(ddVar.f33444w, false, false);
            }
            vcVar.e(DialogObject.getEmojiStatusDocumentId(ddVar.f33446y), DialogObject.isEmojiStatusCollectible(ddVar.f33446y), false);
            vcVar.setForum(ddVar.R0());
            vcVar.a(ddVar.f33424f);
        } else if (view instanceof org.telegram.ui.Cells.da) {
            ((org.telegram.ui.Cells.da) view).setOverrideBackground(ddVar.E);
        } else {
            dd.Y0(view);
        }
    }
}
