package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;
public final class xm0 implements il0 {
    public final int f30700a;
    public final int f30701b;
    public final FrameLayout f30702c;

    public xm0(FrameLayout frameLayout, int i10, int i11) {
        this.f30700a = i11;
        this.f30702c = frameLayout;
        this.f30701b = i10;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z4;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.fp0 fp0Var;
        org.telegram.ui.bp0 bp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        mg.q0 q0Var;
        TLRPC.Document document;
        switch (this.f30700a) {
            case 0:
                dn0 dn0Var = (dn0) this.f30702c;
                org.telegram.ui.ActionBar.p2 p2Var = dn0Var.D;
                cn0 cn0Var = dn0Var.f24309c;
                MessageObject E = cn0Var.E(i10);
                if (E != null) {
                    boolean z10 = false;
                    if (dn0Var.F.f()) {
                        dn0Var.F.d(E, view, 0);
                        org.telegram.ui.l10 l10Var = dn0Var.G;
                        int id2 = E.getId();
                        l10Var.f35872a = E.getDialogId();
                        l10Var.f35873b = id2;
                        cn0Var.m(i10);
                        if (!dn0Var.F.f()) {
                            cn0Var.q(0, cn0Var.f24027c.f24312r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof zm0) {
                        org.telegram.ui.Cells.i7 i7Var = ((zm0) view).f31383a;
                        MessageObject message = i7Var.getMessage();
                        TLRPC.Document document2 = message.getDocument();
                        if (i7Var.D) {
                            if (!message.isRoundVideo() && !message.isVoice()) {
                                boolean canPreviewDocument = message.canPreviewDocument();
                                if (!canPreviewDocument) {
                                    TLRPC.Message message2 = message.messageOwner;
                                    if (message2 != null && message2.noforwards) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (E.messageOwner.peer_id.channel_id != 0) {
                                        j10 = 0;
                                        chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(E.messageOwner.peer_id.channel_id));
                                    } else {
                                        j10 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.messageOwner.peer_id.chat_id != j10) {
                                            chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(E.messageOwner.peer_id.chat_id));
                                        } else {
                                            chat = null;
                                        }
                                    }
                                    if (chat != null) {
                                        z4 = chat.noforwards;
                                    }
                                    canPreviewDocument = (canPreviewDocument || z4) ? true : true;
                                }
                                if (canPreviewDocument) {
                                    PhotoViewer.t1().K2(null, p2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, p2Var, null);
                                    PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, dn0Var.C, p2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!i7Var.C) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            i7Var.f(true);
                            DownloadController.getInstance(this.f30701b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            i7Var.f(true);
                        }
                        dn0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.bp0 bp0Var2 = (org.telegram.ui.bp0) this.f30702c;
                org.telegram.ui.gp0 gp0Var = bp0Var2.f33007g0;
                ArrayList arrayList2 = bp0Var2.f33002c0;
                if (view instanceof org.telegram.ui.ap0) {
                    org.telegram.ui.ap0 ap0Var = (org.telegram.ui.ap0) view;
                    int i15 = bp0Var2.f33003d0;
                    if (bp0Var2.f33006f0 == null) {
                        j5 j5Var = ap0Var.f32687c;
                        org.telegram.ui.g61[] g61VarArr = new org.telegram.ui.g61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (j5Var != null) {
                            j5Var.f();
                            ap0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(j5Var.getBounds());
                            if (i15 == 1) {
                                i12 = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                i12 = (-(ap0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i11 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = bp0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i11);
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.f6 resourceProvider = gp0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.xo0 xo0Var = new org.telegram.ui.xo0(bp0Var2, gp0Var, context, valueOf2, i13, resourceProvider, i14, ap0Var.a(), ap0Var, g61VarArr);
                        xo0Var.f37604d1 = true;
                        long j11 = bp0Var2.f33009r;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        xo0Var.setSelected(valueOf);
                        int i16 = 3;
                        xo0Var.setSaveState(3);
                        xo0Var.y(j5Var, ap0Var);
                        org.telegram.ui.yo0 yo0Var = new org.telegram.ui.yo0(bp0Var2, xo0Var);
                        bp0Var2.f33006f0 = yo0Var;
                        g61VarArr[0] = yo0Var;
                        if (!LocaleController.isRTL) {
                            i16 = 5;
                        }
                        yo0Var.showAsDropDown(ap0Var, 0, i12, i16 | 48);
                        g61VarArr[0].b();
                    }
                    return;
                }
                int i17 = bp0Var2.N;
                int i18 = this.f30701b;
                if (i10 == i17) {
                    bp0Var2.f33008n = -1;
                    bp0Var2.f33009r = 0L;
                    bp0Var2.f33010s = null;
                    bp0Var2.v = null;
                    bp0Var2.f33013y = null;
                    bp0Var2.h();
                    if (i18 == 0) {
                        gp0Var.f34656f.h();
                    }
                    org.telegram.ui.ap0 ap0Var2 = bp0Var2.f33012x;
                    if (ap0Var2 != null) {
                        ap0Var2.b(true);
                    }
                    bp0Var2.i(true);
                    bp0Var2.f();
                    org.telegram.ui.bp0 bp0Var3 = gp0Var.h;
                    if (bp0Var3 != null && (fp0Var = bp0Var3.f32997a) != null && (bp0Var = gp0Var.f34656f) != null) {
                        fp0Var.a(bp0Var.f33008n);
                        return;
                    }
                    return;
                }
                int i19 = bp0Var2.Q;
                if (i10 >= i19 && i10 < bp0Var2.R) {
                    int i20 = i10 - i19;
                    if (bp0Var2.C == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    bp0Var2.f33009r = 0L;
                                    bp0Var2.f33008n = -1;
                                    bp0Var2.f33013y = null;
                                    bp0Var2.f33010s = null;
                                    bp0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                bp0Var2.f33009r = 0L;
                                bp0Var2.f33008n = -1;
                                bp0Var2.f33013y = null;
                                bp0Var2.f33010s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                bp0Var2.v = null;
                            }
                            bp0Var2.i(true);
                            bp0Var2.h();
                            bp0Var2.f();
                            org.telegram.ui.ap0 ap0Var3 = bp0Var2.f33012x;
                            if (ap0Var3 != null) {
                                ap0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (bp0Var2.B != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                bp0Var2.f33009r = 0L;
                                bp0Var2.f33008n = -1;
                                bp0Var2.f33010s = null;
                                bp0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            bp0Var2.f33009r = 0L;
                            bp0Var2.f33008n = -1;
                            bp0Var2.f33010s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            bp0Var2.v = null;
                        }
                        bp0Var2.f33013y = tL_starGiftUnique2;
                        bp0Var2.i(true);
                        bp0Var2.h();
                        bp0Var2.f();
                        org.telegram.ui.ap0 ap0Var4 = bp0Var2.f33012x;
                        if (ap0Var4 != null) {
                            ap0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.q61 q61Var = (org.telegram.ui.q61) this.f30702c;
                boolean z11 = view instanceof org.telegram.ui.y51;
                int i21 = this.f30701b;
                try {
                    if (z11) {
                        org.telegram.ui.y51 y51Var = (org.telegram.ui.y51) view;
                        if (!y51Var.f40405s && (((q0Var = y51Var.f40407x) == null || !q0Var.f14104a) && i21 != 13 && i21 != 14)) {
                            if (y51Var.N && (document = y51Var.d) != null) {
                                if (q61Var.T == 6) {
                                    q61Var.p(y51Var, Long.valueOf(document.f19190id), document, y51Var.v, null);
                                } else {
                                    q61Var.p(y51Var, null, document, y51Var.v, null);
                                }
                            } else {
                                q61Var.o(y51Var, y51Var.e);
                            }
                        } else {
                            q61Var.l();
                            q61Var.r(y51Var, y51Var.f40407x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            q61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        q61Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            q61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.t51) {
                        q61Var.i(i10, (org.telegram.ui.t51) view);
                        if (i21 != 1 && i21 != 11) {
                            q61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view != null) {
                        view.callOnClick();
                        return;
                    } else {
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
