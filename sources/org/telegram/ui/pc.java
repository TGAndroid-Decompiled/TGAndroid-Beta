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
public final class pc extends org.telegram.ui.Components.hm0 {
    public final dd f40016c;

    public pc(dd ddVar) {
        this.f40016c = ddVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45913f;
        if (i10 != 5 && i10 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f40016c.R;
    }

    @Override
    public final int j(int i10) {
        dd ddVar = this.f40016c;
        if (i10 == ddVar.S) {
            return 0;
        }
        if (i10 == ddVar.W) {
            return 2;
        }
        if (i10 == ddVar.Z) {
            return 1;
        }
        if (i10 == ddVar.T) {
            return 3;
        }
        if (i10 == ddVar.f36132b0) {
            return 4;
        }
        if (i10 != ddVar.U && i10 != ddVar.f36134c0 && i10 != ddVar.f36138f0 && i10 != ddVar.f36140h0 && i10 != ddVar.f36142j0) {
            if (i10 != ddVar.X && i10 != ddVar.f36136e0) {
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
        dd ddVar = this.f40016c;
        long j10 = ddVar.f36129a;
        int i16 = b1Var.f45913f;
        View view = b1Var.f45910a;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 4) {
                    if (i16 != 5) {
                        if (i16 != 6) {
                            if (i16 == 7) {
                                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                                d9Var.setFixedSize(0);
                                if (i10 == ddVar.f36130a0) {
                                    d9Var.setFixedSize(12);
                                    d9Var.setText("");
                                    return;
                                } else if (i10 == ddVar.V) {
                                    d9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i10 == ddVar.Y) {
                                    d9Var.setText(LocaleController.getString(ddVar.N0()));
                                    return;
                                } else if (i10 == ddVar.f36135d0) {
                                    d9Var.setText(LocaleController.getString(ddVar.K0()));
                                    return;
                                } else if (i10 == ddVar.f36139g0) {
                                    d9Var.setText(LocaleController.getString(ddVar.E0()));
                                    return;
                                } else if (i10 == ddVar.f36141i0) {
                                    d9Var.setText(LocaleController.getString(ddVar.A0()));
                                    return;
                                } else if (i10 == ddVar.f36143k0) {
                                    d9Var.setText(LocaleController.getString(ddVar.L0()));
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
                        qc qcVar = (qc) view;
                        qcVar.e = false;
                        org.telegram.ui.ActionBar.j5 j5Var = qcVar.f40332a;
                        qcVar.setWillNotDraw(true);
                        if (i10 == ddVar.U) {
                            i15 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
                            qcVar.a(i15, ddVar.f36137f, true);
                            j5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (ddVar.f36131b < ddVar.getMessagesController().channelBgIconLevelMin) {
                                qcVar.e(ddVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                qcVar.e(0);
                            }
                            qcVar.c(ddVar.f36145n, false, false);
                            return;
                        } else if (i10 == ddVar.f36134c0) {
                            i14 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
                            qcVar.a(i14, ddVar.f36152s, false);
                            j5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (ddVar.f36136e0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            qcVar.e = z10;
                            qcVar.setWillNotDraw(!z10);
                            if (ddVar.f36131b < ddVar.J0()) {
                                qcVar.e(ddVar.J0());
                            } else {
                                qcVar.e(0);
                            }
                            qcVar.c(ddVar.f36157w, false, false);
                            return;
                        } else if (i10 == ddVar.f36138f0) {
                            i13 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
                            qcVar.a(i13, ddVar.f36152s, false);
                            j5Var.l(LocaleController.getString(ddVar.G0()), false);
                            if (ddVar.f36131b < ddVar.F0()) {
                                qcVar.e(ddVar.F0());
                            } else {
                                qcVar.e(0);
                            }
                            qcVar.c(DialogObject.getEmojiStatusDocumentId(ddVar.f36161y), DialogObject.isEmojiStatusCollectible(ddVar.f36161y), false);
                            return;
                        } else if (i10 == ddVar.f36140h0) {
                            i12 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
                            qcVar.a(i12, ddVar.f36152s, false);
                            j5Var.l(LocaleController.getString(ddVar.B0()), false);
                            if (ddVar.f36131b < ddVar.H0()) {
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
                        } else if (i10 == ddVar.f36142j0) {
                            j5Var.l(LocaleController.getString(ddVar.M0()), false);
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
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    if (i10 == ddVar.f36136e0) {
                        q8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    q8Var.i(LocaleController.getString(ddVar.P0()), false);
                    if (ddVar.f36131b < ddVar.z0()) {
                        q8Var.h(ddVar.z0());
                        return;
                    } else {
                        q8Var.h(0);
                        return;
                    }
                }
                ((hp0) view).a(ddVar.f36152s, false);
                return;
            }
            ((tc) view).a(ddVar.f36137f, false);
            return;
        }
        vc vcVar = (vc) view;
        qo0 qo0Var = vcVar.f42144a;
        uc ucVar = vcVar.f42145b;
        i11 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
        qo0Var.b(i11, ddVar.f36152s, false);
        ucVar.b(ddVar.f36152s, false);
        ucVar.d(ddVar.f36157w, false, false);
        ucVar.setForum(ddVar.R0());
        ucVar.e(DialogObject.getEmojiStatusDocumentId(ddVar.f36161y), false, false);
        ucVar.a(ddVar.f36137f);
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
        bd bdVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d6 d6Var8;
        int i14;
        dd ddVar = this.f40016c;
        if (i10 == 0) {
            Activity parentActivity = ddVar.getParentActivity();
            d5Var = ((org.telegram.ui.ActionBar.n2) ddVar).parentLayout;
            int I0 = ddVar.I0();
            long j10 = ddVar.f36129a;
            d6Var8 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(parentActivity, d5Var, I0, j10, d6Var8);
            faVar.f22271x = true;
            faVar.setImportantForAccessibility(4);
            faVar.f22268r = ddVar;
            Drawable drawable = ddVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            Drawable f7 = ei.r6.f(drawable, i14, ddVar.F, ddVar.J);
            ddVar.H = f7;
            faVar.setOverrideBackground(f7);
            bdVar = faVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = ddVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            d6Var7 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            bd bdVar2 = new bd(i13, parentActivity2, d6Var7);
            bdVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(ddVar.F);
            if (wallpaperEmoticon == null && ddVar.F == null && ddVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            bdVar2.a(wallpaperEmoticon, false);
            bdVar2.setGalleryWallpaper(ddVar.G);
            bdVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final pc f39719b;

                {
                    this.f39719b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            dd ddVar2 = this.f39719b.f40016c;
                            if (str == null) {
                                ddVar2.F = ddVar2.G;
                            } else if (str.equals("❌")) {
                                ddVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                ddVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20424id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                ddVar2.F.settings.emoticon = str;
                            }
                            ddVar2.X0(true);
                            ddVar2.a1(true);
                            return;
                        default:
                            dd ddVar3 = this.f39719b.f40016c;
                            ddVar3.f36152s = ((Integer) obj).intValue();
                            if (ddVar3.f36161y instanceof TLRPC.TL_emojiStatusCollectible) {
                                ddVar3.f36161y = null;
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
            bdVar = new org.telegram.ui.Cells.q8(ddVar.getParentActivity(), ddVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = ddVar.getParentActivity();
            d6Var6 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = d6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            frameLayout.f40332a = j5Var;
            j5Var.setTextSize(16);
            j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var6));
            frameLayout.addView(j5Var, w7.z5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f40334c = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            bdVar = frameLayout;
        } else if (i10 == 3) {
            Activity parentActivity4 = ddVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            d6Var5 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            tc tcVar = new tc(i12, parentActivity4, d6Var5);
            tcVar.f41641b.setOnItemClickListener(new ci.x4(5, this, tcVar));
            bdVar = tcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = ddVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            d6Var4 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            hp0 hp0Var = new hp0(0, i11, parentActivity5, d6Var4);
            hp0Var.setDivider(false);
            hp0Var.setOnColorClick(new Utilities.Callback(this) {
                public final pc f39719b;

                {
                    this.f39719b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            dd ddVar2 = this.f39719b.f40016c;
                            if (str == null) {
                                ddVar2.F = ddVar2.G;
                            } else if (str.equals("❌")) {
                                ddVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                ddVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f20424id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                ddVar2.F.settings.emoticon = str;
                            }
                            ddVar2.X0(true);
                            ddVar2.a1(true);
                            return;
                        default:
                            dd ddVar3 = this.f39719b.f40016c;
                            ddVar3.f36152s = ((Integer) obj).intValue();
                            if (ddVar3.f36161y instanceof TLRPC.TL_emojiStatusCollectible) {
                                ddVar3.f36161y = null;
                            }
                            ddVar3.X0(true);
                            ddVar3.b1();
                            ddVar3.Z0(true);
                            return;
                    }
                }
            });
            bdVar = hp0Var;
        } else if (i10 == 1) {
            FrameLayout vcVar = new vc(ddVar, ddVar.getParentActivity());
            bdVar = vcVar;
            if (ddVar.d) {
                vcVar.setTag(-33024);
                bdVar = vcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = ddVar.getParentActivity();
            d6Var3 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            bdVar = new org.telegram.ui.Cells.l4(parentActivity6, d6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = ddVar.getParentActivity();
            d6Var2 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            bdVar = new so0(parentActivity7, d6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = ddVar.getParentActivity();
            d6Var = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(parentActivity8, d6Var);
            b10Var.setIsSingleCell(true);
            b10Var.setViewType(35);
            bdVar = b10Var;
        } else {
            bdVar = new org.telegram.ui.Cells.d9(ddVar.getParentActivity());
        }
        return new s4.b1(bdVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f45910a;
        boolean z10 = view instanceof vc;
        dd ddVar = this.f40016c;
        if (z10) {
            uc ucVar = ((vc) view).f42145b;
            TLRPC.EmojiStatus emojiStatus = ddVar.f36161y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ucVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                ucVar.d(((TLRPC.TL_emojiStatusCollectible) ddVar.f36161y).pattern_document_id, true, false);
            } else {
                ucVar.b(ddVar.f36152s, false);
                ucVar.d(ddVar.f36157w, false, false);
            }
            ucVar.e(DialogObject.getEmojiStatusDocumentId(ddVar.f36161y), DialogObject.isEmojiStatusCollectible(ddVar.f36161y), false);
            ucVar.setForum(ddVar.R0());
            ucVar.a(ddVar.f36137f);
        } else if (view instanceof org.telegram.ui.Cells.fa) {
            ((org.telegram.ui.Cells.fa) view).setOverrideBackground(ddVar.H);
        } else {
            dd.Y0(view);
        }
    }
}
