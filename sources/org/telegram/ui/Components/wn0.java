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
public final class wn0 implements zl0 {
    public final int f34504a;
    public final int f34505b;
    public final FrameLayout f34506c;

    public wn0(FrameLayout frameLayout, int i10, int i11) {
        this.f34504a = i11;
        this.f34506c = frameLayout;
        this.f34505b = i10;
    }

    @Override
    public final void c(int i10, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.pp0 pp0Var;
        org.telegram.ui.lp0 lp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        bh.x0 x0Var;
        TLRPC.Document document;
        switch (this.f34504a) {
            case 0:
                co0 co0Var = (co0) this.f34506c;
                org.telegram.ui.ActionBar.r2 r2Var = co0Var.G;
                bo0 bo0Var = co0Var.f27217c;
                MessageObject E = bo0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (co0Var.I.g()) {
                        co0Var.I.e(E, view, 0);
                        org.telegram.ui.z00 z00Var = co0Var.J;
                        int id2 = E.getId();
                        z00Var.f46145a = E.getDialogId();
                        z00Var.f46146b = id2;
                        bo0Var.m(i10);
                        if (!co0Var.I.g()) {
                            bo0Var.q(0, bo0Var.f26921c.f27220r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof yn0) {
                        org.telegram.ui.Cells.o7 o7Var = ((yn0) view).f35081a;
                        MessageObject message = o7Var.getMessage();
                        TLRPC.Document document2 = message.getDocument();
                        if (o7Var.G) {
                            if (!message.isRoundVideo() && !message.isVoice()) {
                                boolean canPreviewDocument = message.canPreviewDocument();
                                if (!canPreviewDocument) {
                                    TLRPC.Message message2 = message.messageOwner;
                                    if (message2 != null && message2.noforwards) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
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
                                        z10 = chat.noforwards;
                                    }
                                    if (canPreviewDocument || z10) {
                                        z11 = true;
                                    }
                                    canPreviewDocument = z11;
                                }
                                if (canPreviewDocument) {
                                    PhotoViewer.u1().M2(null, r2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.u1().M2(null, r2Var, null);
                                    PhotoViewer.u1().d2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, co0Var.F, r2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!o7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            o7Var.f(true);
                            DownloadController.getInstance(this.f34505b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            o7Var.f(true);
                        }
                        co0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.lp0 lp0Var2 = (org.telegram.ui.lp0) this.f34506c;
                org.telegram.ui.rp0 rp0Var = lp0Var2.f41330p0;
                ArrayList arrayList2 = lp0Var2.f41326l0;
                if (view instanceof org.telegram.ui.kp0) {
                    org.telegram.ui.kp0 kp0Var = (org.telegram.ui.kp0) view;
                    int i15 = lp0Var2.m0;
                    if (lp0Var2.f41329o0 == null) {
                        r5 r5Var = kp0Var.f40997c;
                        org.telegram.ui.t51[] t51VarArr = new org.telegram.ui.t51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (r5Var != null) {
                            r5Var.f();
                            kp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(r5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(kp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = lp0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.u6 resourceProvider = rp0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.hp0 hp0Var = new org.telegram.ui.hp0(lp0Var2, rp0Var, context, valueOf2, i13, resourceProvider, i14, kp0Var.a(), kp0Var, t51VarArr);
                        hp0Var.f38295g1 = true;
                        long j11 = lp0Var2.f41327n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        hp0Var.setSelected(valueOf);
                        hp0Var.setSaveState(3);
                        hp0Var.y(r5Var, kp0Var);
                        org.telegram.ui.ip0 ip0Var = new org.telegram.ui.ip0(lp0Var2, hp0Var);
                        lp0Var2.f41329o0 = ip0Var;
                        t51VarArr[0] = ip0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        ip0Var.showAsDropDown(kp0Var, 0, i11, i16 | 48);
                        t51VarArr[0].b();
                    }
                    return;
                }
                int i17 = lp0Var2.V;
                int i18 = this.f34505b;
                if (i10 == i17) {
                    lp0Var2.h = -1;
                    lp0Var2.f41327n = 0L;
                    lp0Var2.f41331r = null;
                    lp0Var2.f41332s = null;
                    lp0Var2.I = null;
                    lp0Var2.i();
                    if (i18 == 0) {
                        rp0Var.h.i();
                    }
                    org.telegram.ui.kp0 kp0Var2 = lp0Var2.f41335y;
                    if (kp0Var2 != null) {
                        kp0Var2.b(true);
                    }
                    lp0Var2.j(true);
                    lp0Var2.f(true);
                    org.telegram.ui.lp0 lp0Var3 = rp0Var.f43230n;
                    if (lp0Var3 != null && (pp0Var = lp0Var3.f41311a) != null && (lp0Var = rp0Var.h) != null) {
                        pp0Var.a(lp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = lp0Var2.f41314b0;
                if (i10 >= i19 && i10 < lp0Var2.f41316c0) {
                    int i20 = i10 - i19;
                    if (lp0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    lp0Var2.f41327n = 0L;
                                    lp0Var2.h = -1;
                                    lp0Var2.I = null;
                                    lp0Var2.f41331r = null;
                                    lp0Var2.f41332s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                lp0Var2.f41327n = 0L;
                                lp0Var2.h = -1;
                                lp0Var2.I = null;
                                lp0Var2.f41331r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                lp0Var2.f41332s = null;
                            }
                            lp0Var2.j(true);
                            lp0Var2.i();
                            lp0Var2.f(true);
                            org.telegram.ui.kp0 kp0Var3 = lp0Var2.f41335y;
                            if (kp0Var3 != null) {
                                kp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lp0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                lp0Var2.f41327n = 0L;
                                lp0Var2.h = -1;
                                lp0Var2.f41331r = null;
                                lp0Var2.f41332s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            lp0Var2.f41327n = 0L;
                            lp0Var2.h = -1;
                            lp0Var2.f41331r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            lp0Var2.f41332s = null;
                        }
                        lp0Var2.I = tL_starGiftUnique2;
                        lp0Var2.j(true);
                        lp0Var2.i();
                        lp0Var2.f(true);
                        org.telegram.ui.kp0 kp0Var4 = lp0Var2.f41335y;
                        if (kp0Var4 != null) {
                            kp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.c61 c61Var = (org.telegram.ui.c61) this.f34506c;
                boolean z12 = view instanceof org.telegram.ui.l51;
                int i21 = this.f34505b;
                try {
                    if (z12) {
                        org.telegram.ui.l51 l51Var = (org.telegram.ui.l51) view;
                        if (!l51Var.f41144s && (((x0Var = l51Var.f41146x) == null || !x0Var.f4205a) && i21 != 13 && i21 != 14)) {
                            if (l51Var.Q && (document = l51Var.d) != null) {
                                if (c61Var.W == 6) {
                                    c61Var.p(l51Var, Long.valueOf(document.f22033id), document, l51Var.v, null);
                                } else {
                                    c61Var.p(l51Var, null, document, l51Var.v, null);
                                }
                            } else {
                                c61Var.o(l51Var, l51Var.e);
                            }
                        } else {
                            c61Var.l();
                            c61Var.r(l51Var, l51Var.f41146x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            c61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        c61Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            c61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.g51) {
                        c61Var.i(i10, (org.telegram.ui.g51) view);
                        if (i21 != 1 && i21 != 11) {
                            c61Var.performHapticFeedback(3, 1);
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
