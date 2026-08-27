package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class jc extends org.telegram.ui.Components.yk0 {

    public final xc f39333c;

    public jc(xc xcVar) {
        this.f39333c = xcVar;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 5 || i10 == 6;
    }

    @Override
    public final int h() {
        return this.f39333c.N;
    }

    @Override
    public final int j(int i10) {
        xc xcVar = this.f39333c;
        if (i10 == xcVar.O) {
            return 0;
        }
        if (i10 == xcVar.S) {
            return 2;
        }
        if (i10 == xcVar.V) {
            return 1;
        }
        if (i10 == xcVar.P) {
            return 3;
        }
        if (i10 == xcVar.X) {
            return 4;
        }
        if (i10 == xcVar.Q || i10 == xcVar.Y || i10 == xcVar.f44383b0 || i10 == xcVar.f44386d0 || i10 == xcVar.f44390f0) {
            return 6;
        }
        return (i10 == xcVar.T || i10 == xcVar.f44381a0) ? 5 : 7;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        xc xcVar = this.f39333c;
        long j10 = xcVar.f44380a;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 1) {
            qc qcVar = (qc) view;
            jo0 jo0Var = qcVar.f41628a;
            pc pcVar = qcVar.f41629b;
            jo0Var.b(((org.telegram.ui.ActionBar.n2) xcVar).currentAccount, xcVar.f44404s, false);
            pcVar.b(xcVar.f44404s, false);
            pcVar.d(xcVar.f44408w, false, false);
            pcVar.setForum(xcVar.R0());
            pcVar.e(DialogObject.getEmojiStatusDocumentId(xcVar.f44410y), false, false);
            pcVar.a(xcVar.f44389f);
            return;
        }
        if (i11 == 3) {
            ((oc) view).a(xcVar.f44389f, false);
            return;
        }
        if (i11 == 4) {
            ((yo0) view).a(xcVar.f44404s, false);
            return;
        }
        if (i11 == 5) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (i10 == xcVar.f44381a0) {
                l8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            l8Var.i(LocaleController.getString(xcVar.P0()), false);
            if (xcVar.f44382b < xcVar.z0()) {
                l8Var.h(xcVar.z0());
                return;
            } else {
                l8Var.h(0);
                return;
            }
        }
        if (i11 != 6) {
            if (i11 != 7) {
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setFixedSize(0);
            if (i10 == xcVar.W) {
                x8Var.setFixedSize(12);
                x8Var.setText("");
                return;
            }
            if (i10 == xcVar.R) {
                x8Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == xcVar.U) {
                x8Var.setText(LocaleController.getString(xcVar.N0()));
                return;
            }
            if (i10 == xcVar.Z) {
                x8Var.setText(LocaleController.getString(xcVar.K0()));
                return;
            }
            if (i10 == xcVar.f44385c0) {
                x8Var.setText(LocaleController.getString(xcVar.E0()));
                return;
            }
            if (i10 == xcVar.f44388e0) {
                x8Var.setText(LocaleController.getString(xcVar.A0()));
                return;
            }
            if (i10 == xcVar.f44391g0) {
                x8Var.setText(LocaleController.getString(xcVar.L0()));
                return;
            } else {
                if (i10 == 0) {
                    x8Var.setText("");
                    x8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        kc kcVar = (kc) view;
        kcVar.f39693e = false;
        org.telegram.ui.ActionBar.h5 h5Var = kcVar.f39690a;
        kcVar.setWillNotDraw(true);
        if (i10 == xcVar.Q) {
            kcVar.a(((org.telegram.ui.ActionBar.n2) xcVar).currentAccount, xcVar.f44389f, true);
            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (xcVar.f44382b < xcVar.getMessagesController().channelBgIconLevelMin) {
                kcVar.e(xcVar.getMessagesController().channelBgIconLevelMin);
            } else {
                kcVar.e(0);
            }
            kcVar.c(xcVar.f44397n, false, false);
            return;
        }
        if (i10 == xcVar.Y) {
            kcVar.a(((org.telegram.ui.ActionBar.n2) xcVar).currentAccount, xcVar.f44404s, false);
            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = xcVar.f44381a0 >= 0;
            kcVar.f39693e = z10;
            kcVar.setWillNotDraw(!z10);
            if (xcVar.f44382b < xcVar.J0()) {
                kcVar.e(xcVar.J0());
            } else {
                kcVar.e(0);
            }
            kcVar.c(xcVar.f44408w, false, false);
            return;
        }
        if (i10 == xcVar.f44383b0) {
            kcVar.a(((org.telegram.ui.ActionBar.n2) xcVar).currentAccount, xcVar.f44404s, false);
            h5Var.l(LocaleController.getString(xcVar.G0()), false);
            if (xcVar.f44382b < xcVar.F0()) {
                kcVar.e(xcVar.F0());
            } else {
                kcVar.e(0);
            }
            kcVar.c(DialogObject.getEmojiStatusDocumentId(xcVar.f44410y), DialogObject.isEmojiStatusCollectible(xcVar.f44410y), false);
            return;
        }
        if (i10 != xcVar.f44386d0) {
            if (i10 == xcVar.f44390f0) {
                h5Var.l(LocaleController.getString(xcVar.M0()), false);
                kcVar.e(0);
                TLRPC.ChatFull chatFull = xcVar.getMessagesController().getChatFull(-j10);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    kcVar.c(0L, false, false);
                    return;
                } else {
                    kcVar.d(xcVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        kcVar.a(((org.telegram.ui.ActionBar.n2) xcVar).currentAccount, xcVar.f44404s, false);
        h5Var.l(LocaleController.getString(xcVar.B0()), false);
        if (xcVar.f44382b < xcVar.H0()) {
            kcVar.e(xcVar.H0());
        } else {
            kcVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = xcVar.getMessagesController().getChatFull(-j10);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            kcVar.c(0L, false, false);
        } else {
            kcVar.c(xcVar.D0(stickerSet2), false, false);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        qc qcVar;
        View x8Var;
        xc xcVar = this.f39333c;
        if (i10 == 0) {
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(xcVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) xcVar).parentLayout, xcVar.I0(), xcVar.f44380a, ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider);
            baVar.f24138x = true;
            baVar.setImportantForAccessibility(4);
            baVar.f24135r = xcVar;
            Drawable drawableF = lh.q6.f(xcVar.D, ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount, xcVar.B, xcVar.F);
            xcVar.D = drawableF;
            baVar.setOverrideBackground(drawableF);
            x8Var = baVar;
        } else if (i10 == 2) {
            vc vcVar = new vc(((org.telegram.ui.ActionBar.n2) xcVar).currentAccount, xcVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider);
            vcVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(xcVar.B);
            if (wallpaperEmoticon == null && xcVar.B == null && xcVar.C != null) {
                wallpaperEmoticon = "❌";
            }
            vcVar.a(wallpaperEmoticon, false);
            vcVar.setGalleryWallpaper(xcVar.C);
            final int i11 = 0;
            vcVar.setOnEmoticonSelected(new Utilities.Callback(this) {

                public final jc f39027b;

                {
                    this.f39027b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            String str = (String) obj;
                            xc xcVar2 = this.f39027b.f39333c;
                            if (str == null) {
                                xcVar2.B = xcVar2.C;
                            } else if (str.equals("❌")) {
                                xcVar2.B = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                xcVar2.B = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f22532id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                xcVar2.B.settings.emoticon = str;
                            }
                            xcVar2.X0(true);
                            xcVar2.a1(true);
                            break;
                        default:
                            xc xcVar3 = this.f39027b.f39333c;
                            xcVar3.f44404s = ((Integer) obj).intValue();
                            if (xcVar3.f44410y instanceof TLRPC.TL_emojiStatusCollectible) {
                                xcVar3.f44410y = null;
                            }
                            xcVar3.X0(true);
                            xcVar3.b1();
                            xcVar3.Z0(true);
                            break;
                    }
                }
            });
            x8Var = vcVar;
        } else if (i10 == 5) {
            x8Var = new org.telegram.ui.Cells.l8(xcVar.getParentActivity(), xcVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity = xcVar.getParentActivity();
            org.telegram.ui.ActionBar.c6 c6Var = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
            kc kcVar = new kc(parentActivity);
            kcVar.f39693e = false;
            kcVar.d = c6Var;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity);
            kcVar.f39690a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            kcVar.addView(h5Var, h7.z5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            kcVar.f39692c = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, kcVar, false);
            x8Var = kcVar;
        } else if (i10 == 3) {
            oc ocVar = new oc(((org.telegram.ui.ActionBar.n2) xcVar).currentAccount, xcVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider);
            ocVar.f41058b.setOnItemClickListener(new cg.x0(7, this, ocVar));
            x8Var = ocVar;
        } else if (i10 == 4) {
            yo0 yo0Var = new yo0(0, ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount, xcVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider);
            yo0Var.setDivider(false);
            final int i12 = 1;
            yo0Var.setOnColorClick(new Utilities.Callback(this) {

                public final jc f39027b;

                {
                    this.f39027b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            String str = (String) obj;
                            xc xcVar2 = this.f39027b.f39333c;
                            if (str == null) {
                                xcVar2.B = xcVar2.C;
                            } else if (str.equals("❌")) {
                                xcVar2.B = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                xcVar2.B = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.f22532id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                xcVar2.B.settings.emoticon = str;
                            }
                            xcVar2.X0(true);
                            xcVar2.a1(true);
                            break;
                        default:
                            xc xcVar3 = this.f39027b.f39333c;
                            xcVar3.f44404s = ((Integer) obj).intValue();
                            if (xcVar3.f44410y instanceof TLRPC.TL_emojiStatusCollectible) {
                                xcVar3.f44410y = null;
                            }
                            xcVar3.X0(true);
                            xcVar3.b1();
                            xcVar3.Z0(true);
                            break;
                    }
                }
            });
            x8Var = yo0Var;
        } else if (i10 == 1) {
            qcVar = new qc(xcVar, xcVar.getParentActivity());
            if (xcVar.d) {
                x8Var = qcVar;
                qcVar.setTag(-33024);
                x8Var = qcVar;
            }
        } else if (i10 == 8) {
            x8Var = new org.telegram.ui.Cells.j4(xcVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider);
        } else if (i10 == 9) {
            x8Var = new lo0(xcVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider, false);
        } else if (i10 == 10) {
            org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(xcVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider);
            h00Var.setIsSingleCell(true);
            h00Var.setViewType(35);
            x8Var = h00Var;
        } else {
            x8Var = new org.telegram.ui.Cells.x8(xcVar.getParentActivity());
        }
        x8Var = qcVar;
        return new org.telegram.ui.Components.lk0(x8Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        boolean z10 = view instanceof qc;
        xc xcVar = this.f39333c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ba) {
                ((org.telegram.ui.Cells.ba) view).setOverrideBackground(xcVar.D);
                return;
            } else {
                xc.Y0(view);
                return;
            }
        }
        pc pcVar = ((qc) view).f41629b;
        TLRPC.EmojiStatus emojiStatus = xcVar.f44410y;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            pcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
            pcVar.d(((TLRPC.TL_emojiStatusCollectible) xcVar.f44410y).pattern_document_id, true, false);
        } else {
            pcVar.b(xcVar.f44404s, false);
            pcVar.d(xcVar.f44408w, false, false);
        }
        pcVar.e(DialogObject.getEmojiStatusDocumentId(xcVar.f44410y), DialogObject.isEmojiStatusCollectible(xcVar.f44410y), false);
        pcVar.setForum(xcVar.R0());
        pcVar.a(xcVar.f44389f);
    }
}
