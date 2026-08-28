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
public final class ic extends org.telegram.ui.Components.vk0 {
    public final xc f39100c;

    public ic(xc xcVar) {
        this.f39100c = xcVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 5 && i9 != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f39100c.N;
    }

    @Override
    public final int j(int i9) {
        xc xcVar = this.f39100c;
        if (i9 == xcVar.O) {
            return 0;
        }
        if (i9 == xcVar.S) {
            return 2;
        }
        if (i9 == xcVar.V) {
            return 1;
        }
        if (i9 == xcVar.P) {
            return 3;
        }
        if (i9 == xcVar.X) {
            return 4;
        }
        if (i9 != xcVar.Q && i9 != xcVar.Y && i9 != xcVar.f44463b0 && i9 != xcVar.f44466d0 && i9 != xcVar.f44470f0) {
            if (i9 != xcVar.T && i9 != xcVar.f44461a0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        TLRPC.StickerSet stickerSet;
        int i11;
        TLRPC.StickerSet stickerSet2;
        int i12;
        int i13;
        boolean z10;
        int i14;
        xc xcVar = this.f39100c;
        long j10 = xcVar.f44460a;
        int i15 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i15 != 1) {
            if (i15 != 3) {
                if (i15 != 4) {
                    if (i15 != 5) {
                        if (i15 != 6) {
                            if (i15 == 7) {
                                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                                b9Var.setFixedSize(0);
                                if (i9 == xcVar.W) {
                                    b9Var.setFixedSize(12);
                                    b9Var.setText("");
                                    return;
                                } else if (i9 == xcVar.R) {
                                    b9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                                    return;
                                } else if (i9 == xcVar.U) {
                                    b9Var.setText(LocaleController.getString(xcVar.N0()));
                                    return;
                                } else if (i9 == xcVar.Z) {
                                    b9Var.setText(LocaleController.getString(xcVar.K0()));
                                    return;
                                } else if (i9 == xcVar.f44465c0) {
                                    b9Var.setText(LocaleController.getString(xcVar.D0()));
                                    return;
                                } else if (i9 == xcVar.f44468e0) {
                                    b9Var.setText(LocaleController.getString(xcVar.z0()));
                                    return;
                                } else if (i9 == xcVar.f44471g0) {
                                    b9Var.setText(LocaleController.getString(xcVar.L0()));
                                    return;
                                } else if (i9 == 0) {
                                    b9Var.setText("");
                                    b9Var.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        jc jcVar = (jc) view;
                        jcVar.f39434e = false;
                        org.telegram.ui.ActionBar.h5 h5Var = jcVar.f39431a;
                        jcVar.setWillNotDraw(true);
                        if (i9 == xcVar.Q) {
                            i14 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
                            jcVar.a(i14, xcVar.f44469f, true);
                            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
                            if (xcVar.f44462b < xcVar.getMessagesController().channelBgIconLevelMin) {
                                jcVar.e(xcVar.getMessagesController().channelBgIconLevelMin);
                            } else {
                                jcVar.e(0);
                            }
                            jcVar.c(xcVar.f44477n, false, false);
                            return;
                        } else if (i9 == xcVar.Y) {
                            i13 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
                            jcVar.a(i13, xcVar.f44484s, false);
                            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
                            if (xcVar.f44461a0 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            jcVar.f39434e = z10;
                            jcVar.setWillNotDraw(!z10);
                            if (xcVar.f44462b < xcVar.I0()) {
                                jcVar.e(xcVar.I0());
                            } else {
                                jcVar.e(0);
                            }
                            jcVar.c(xcVar.f44488w, false, false);
                            return;
                        } else if (i9 == xcVar.f44463b0) {
                            i12 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
                            jcVar.a(i12, xcVar.f44484s, false);
                            h5Var.l(LocaleController.getString(xcVar.F0()), false);
                            if (xcVar.f44462b < xcVar.E0()) {
                                jcVar.e(xcVar.E0());
                            } else {
                                jcVar.e(0);
                            }
                            jcVar.c(DialogObject.getEmojiStatusDocumentId(xcVar.f44490y), DialogObject.isEmojiStatusCollectible(xcVar.f44490y), false);
                            return;
                        } else if (i9 == xcVar.f44466d0) {
                            i11 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
                            jcVar.a(i11, xcVar.f44484s, false);
                            h5Var.l(LocaleController.getString(xcVar.A0()), false);
                            if (xcVar.f44462b < xcVar.G0()) {
                                jcVar.e(xcVar.G0());
                            } else {
                                jcVar.e(0);
                            }
                            TLRPC.ChatFull chatFull = xcVar.getMessagesController().getChatFull(-j10);
                            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                                jcVar.c(xcVar.C0(stickerSet2), false, false);
                                return;
                            } else {
                                jcVar.c(0L, false, false);
                                return;
                            }
                        } else if (i9 == xcVar.f44470f0) {
                            h5Var.l(LocaleController.getString(xcVar.M0()), false);
                            jcVar.e(0);
                            TLRPC.ChatFull chatFull2 = xcVar.getMessagesController().getChatFull(-j10);
                            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                                jcVar.d(xcVar.B0(stickerSet));
                                return;
                            } else {
                                jcVar.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    if (i9 == xcVar.f44461a0) {
                        p8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                        return;
                    }
                    p8Var.i(LocaleController.getString(xcVar.P0()), false);
                    if (xcVar.f44462b < xcVar.y0()) {
                        p8Var.h(xcVar.y0());
                        return;
                    } else {
                        p8Var.h(0);
                        return;
                    }
                }
                ((xo0) view).a(xcVar.f44484s, false);
                return;
            }
            ((nc) view).a(xcVar.f44469f, false);
            return;
        }
        pc pcVar = (pc) view;
        io0 io0Var = pcVar.f41436a;
        oc ocVar = pcVar.f41437b;
        i10 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
        io0Var.b(i10, xcVar.f44484s, false);
        ocVar.b(xcVar.f44484s, false);
        ocVar.d(xcVar.f44488w, false, false);
        ocVar.setForum(xcVar.R0());
        ocVar.e(DialogObject.getEmojiStatusDocumentId(xcVar.f44490y), false, false);
        ocVar.a(xcVar.f44469f);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var4;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var5;
        org.telegram.ui.ActionBar.b6 b6Var6;
        int i12;
        org.telegram.ui.ActionBar.b6 b6Var7;
        vc vcVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b6 b6Var8;
        int i13;
        xc xcVar = this.f39100c;
        if (i9 == 0) {
            Activity parentActivity = xcVar.getParentActivity();
            b5Var = ((org.telegram.ui.ActionBar.o2) xcVar).parentLayout;
            int H0 = xcVar.H0();
            long j10 = xcVar.f44460a;
            b6Var8 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(parentActivity, b5Var, H0, j10, b6Var8);
            faVar.f24359x = true;
            faVar.setImportantForAccessibility(4);
            faVar.f24356r = xcVar;
            Drawable drawable = xcVar.D;
            i13 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
            Drawable f10 = kh.r6.f(drawable, i13, xcVar.B, xcVar.F);
            xcVar.D = f10;
            faVar.setOverrideBackground(f10);
            vcVar = faVar;
        } else if (i9 == 2) {
            Activity parentActivity2 = xcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
            b6Var7 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
            vc vcVar2 = new vc(i12, parentActivity2, b6Var7);
            vcVar2.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(xcVar.B);
            if (wallpaperEmoticon == null && xcVar.B == null && xcVar.C != null) {
                wallpaperEmoticon = "❌";
            }
            vcVar2.a(wallpaperEmoticon, false);
            vcVar2.setGalleryWallpaper(xcVar.C);
            vcVar2.setOnEmoticonSelected(new Utilities.Callback(this) {
                public final ic f38750b;

                {
                    this.f38750b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            xc xcVar2 = this.f38750b.f39100c;
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
                            return;
                        default:
                            xc xcVar3 = this.f38750b.f39100c;
                            xcVar3.f44484s = ((Integer) obj).intValue();
                            if (xcVar3.f44490y instanceof TLRPC.TL_emojiStatusCollectible) {
                                xcVar3.f44490y = null;
                            }
                            xcVar3.X0(true);
                            xcVar3.b1();
                            xcVar3.Z0(true);
                            return;
                    }
                }
            });
            vcVar = vcVar2;
        } else if (i9 == 5) {
            vcVar = new org.telegram.ui.Cells.p8(xcVar.getParentActivity(), xcVar.getResourceProvider());
        } else if (i9 == 6) {
            Activity parentActivity3 = xcVar.getParentActivity();
            b6Var6 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.f39434e = false;
            frameLayout.d = b6Var6;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity3);
            frameLayout.f39431a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var6));
            frameLayout.addView(h5Var, g7.e6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.f39433c = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, frameLayout, false);
            vcVar = frameLayout;
        } else if (i9 == 3) {
            Activity parentActivity4 = xcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
            b6Var5 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
            nc ncVar = new nc(i11, parentActivity4, b6Var5);
            ncVar.f40693b.setOnItemClickListener(new bg.b1(7, this, ncVar));
            vcVar = ncVar;
        } else if (i9 == 4) {
            Activity parentActivity5 = xcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
            b6Var4 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
            xo0 xo0Var = new xo0(0, i10, parentActivity5, b6Var4);
            xo0Var.setDivider(false);
            xo0Var.setOnColorClick(new Utilities.Callback(this) {
                public final ic f38750b;

                {
                    this.f38750b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r2) {
                        case 0:
                            String str = (String) obj;
                            xc xcVar2 = this.f38750b.f39100c;
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
                            return;
                        default:
                            xc xcVar3 = this.f38750b.f39100c;
                            xcVar3.f44484s = ((Integer) obj).intValue();
                            if (xcVar3.f44490y instanceof TLRPC.TL_emojiStatusCollectible) {
                                xcVar3.f44490y = null;
                            }
                            xcVar3.X0(true);
                            xcVar3.b1();
                            xcVar3.Z0(true);
                            return;
                    }
                }
            });
            vcVar = xo0Var;
        } else if (i9 == 1) {
            FrameLayout pcVar = new pc(xcVar, xcVar.getParentActivity());
            vcVar = pcVar;
            if (xcVar.d) {
                pcVar.setTag(-33024);
                vcVar = pcVar;
            }
        } else if (i9 == 8) {
            Activity parentActivity6 = xcVar.getParentActivity();
            b6Var3 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
            vcVar = new org.telegram.ui.Cells.m4(parentActivity6, b6Var3);
        } else if (i9 == 9) {
            Activity parentActivity7 = xcVar.getParentActivity();
            b6Var2 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
            vcVar = new ko0(parentActivity7, b6Var2, false);
        } else if (i9 == 10) {
            Activity parentActivity8 = xcVar.getParentActivity();
            b6Var = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
            org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(parentActivity8, b6Var);
            e00Var.setIsSingleCell(true);
            e00Var.setViewType(35);
            vcVar = e00Var;
        } else {
            vcVar = new org.telegram.ui.Cells.b9(xcVar.getParentActivity());
        }
        return new f2.q1(vcVar);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        boolean z10 = view instanceof pc;
        xc xcVar = this.f39100c;
        if (z10) {
            oc ocVar = ((pc) view).f41437b;
            TLRPC.EmojiStatus emojiStatus = xcVar.f44490y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ocVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
                ocVar.d(((TLRPC.TL_emojiStatusCollectible) xcVar.f44490y).pattern_document_id, true, false);
            } else {
                ocVar.b(xcVar.f44484s, false);
                ocVar.d(xcVar.f44488w, false, false);
            }
            ocVar.e(DialogObject.getEmojiStatusDocumentId(xcVar.f44490y), DialogObject.isEmojiStatusCollectible(xcVar.f44490y), false);
            ocVar.setForum(xcVar.R0());
            ocVar.a(xcVar.f44469f);
        } else if (view instanceof org.telegram.ui.Cells.fa) {
            ((org.telegram.ui.Cells.fa) view).setOverrideBackground(xcVar.D);
        } else {
            xc.Y0(view);
        }
    }
}
