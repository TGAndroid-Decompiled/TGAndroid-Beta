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
public final class rn0 implements am0 {
    public final int f30232a;
    public final int f30233b;
    public final FrameLayout f30234c;

    public rn0(FrameLayout frameLayout, int i10, int i11) {
        this.f30232a = i11;
        this.f30234c = frameLayout;
        this.f30233b = i10;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.jp0 jp0Var;
        org.telegram.ui.fp0 fp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        ah.i1 i1Var;
        TLRPC.Document document;
        switch (this.f30232a) {
            case 0:
                xn0 xn0Var = (xn0) this.f30234c;
                org.telegram.ui.ActionBar.o2 o2Var = xn0Var.G;
                wn0 wn0Var = xn0Var.f32608c;
                MessageObject E = wn0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (xn0Var.I.g()) {
                        xn0Var.I.d(E, view, 0);
                        org.telegram.ui.a10 a10Var = xn0Var.J;
                        int id2 = E.getId();
                        a10Var.f35546a = E.getDialogId();
                        a10Var.f35547b = id2;
                        wn0Var.m(i10);
                        if (!xn0Var.I.g()) {
                            wn0Var.q(0, wn0Var.f32277c.f32611r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof tn0) {
                        org.telegram.ui.Cells.k7 k7Var = ((tn0) view).f30872a;
                        MessageObject message = k7Var.getMessage();
                        TLRPC.Document document2 = message.getDocument();
                        if (k7Var.G) {
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
                                    PhotoViewer.u1().M2(null, o2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.u1().M2(null, o2Var, null);
                                    PhotoViewer.u1().d2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, xn0Var.F, o2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!k7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            k7Var.f(true);
                            DownloadController.getInstance(this.f30233b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            k7Var.f(true);
                        }
                        xn0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.fp0 fp0Var2 = (org.telegram.ui.fp0) this.f30234c;
                org.telegram.ui.lp0 lp0Var = fp0Var2.f37402p0;
                ArrayList arrayList2 = fp0Var2.f37398l0;
                if (view instanceof org.telegram.ui.ep0) {
                    org.telegram.ui.ep0 ep0Var = (org.telegram.ui.ep0) view;
                    int i15 = fp0Var2.m0;
                    if (fp0Var2.f37401o0 == null) {
                        p5 p5Var = ep0Var.f37009c;
                        org.telegram.ui.s51[] s51VarArr = new org.telegram.ui.s51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (p5Var != null) {
                            p5Var.f();
                            ep0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(p5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(ep0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = fp0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.g6 resourceProvider = lp0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.bp0 bp0Var = new org.telegram.ui.bp0(fp0Var2, lp0Var, context, valueOf2, i13, resourceProvider, i14, ep0Var.a(), ep0Var, s51VarArr);
                        bp0Var.f35904g1 = true;
                        long j11 = fp0Var2.f37399n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        bp0Var.setSelected(valueOf);
                        bp0Var.setSaveState(3);
                        bp0Var.y(p5Var, ep0Var);
                        org.telegram.ui.cp0 cp0Var = new org.telegram.ui.cp0(fp0Var2, bp0Var);
                        fp0Var2.f37401o0 = cp0Var;
                        s51VarArr[0] = cp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        cp0Var.showAsDropDown(ep0Var, 0, i11, i16 | 48);
                        s51VarArr[0].b();
                    }
                    return;
                }
                int i17 = fp0Var2.V;
                int i18 = this.f30233b;
                if (i10 == i17) {
                    fp0Var2.h = -1;
                    fp0Var2.f37399n = 0L;
                    fp0Var2.f37403r = null;
                    fp0Var2.f37404s = null;
                    fp0Var2.I = null;
                    fp0Var2.i();
                    if (i18 == 0) {
                        lp0Var.h.i();
                    }
                    org.telegram.ui.ep0 ep0Var2 = fp0Var2.f37407y;
                    if (ep0Var2 != null) {
                        ep0Var2.b(true);
                    }
                    fp0Var2.j(true);
                    fp0Var2.f(true);
                    org.telegram.ui.fp0 fp0Var3 = lp0Var.f39305n;
                    if (fp0Var3 != null && (jp0Var = fp0Var3.f37383a) != null && (fp0Var = lp0Var.h) != null) {
                        jp0Var.a(fp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = fp0Var2.f37386b0;
                if (i10 >= i19 && i10 < fp0Var2.f37388c0) {
                    int i20 = i10 - i19;
                    if (fp0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    fp0Var2.f37399n = 0L;
                                    fp0Var2.h = -1;
                                    fp0Var2.I = null;
                                    fp0Var2.f37403r = null;
                                    fp0Var2.f37404s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                fp0Var2.f37399n = 0L;
                                fp0Var2.h = -1;
                                fp0Var2.I = null;
                                fp0Var2.f37403r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                fp0Var2.f37404s = null;
                            }
                            fp0Var2.j(true);
                            fp0Var2.i();
                            fp0Var2.f(true);
                            org.telegram.ui.ep0 ep0Var3 = fp0Var2.f37407y;
                            if (ep0Var3 != null) {
                                ep0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (fp0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                fp0Var2.f37399n = 0L;
                                fp0Var2.h = -1;
                                fp0Var2.f37403r = null;
                                fp0Var2.f37404s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            fp0Var2.f37399n = 0L;
                            fp0Var2.h = -1;
                            fp0Var2.f37403r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            fp0Var2.f37404s = null;
                        }
                        fp0Var2.I = tL_starGiftUnique2;
                        fp0Var2.j(true);
                        fp0Var2.i();
                        fp0Var2.f(true);
                        org.telegram.ui.ep0 ep0Var4 = fp0Var2.f37407y;
                        if (ep0Var4 != null) {
                            ep0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) this.f30234c;
                boolean z12 = view instanceof org.telegram.ui.k51;
                int i21 = this.f30233b;
                try {
                    if (z12) {
                        org.telegram.ui.k51 k51Var = (org.telegram.ui.k51) view;
                        if (!k51Var.f38828s && (((i1Var = k51Var.f38830x) == null || !i1Var.f781a) && i21 != 13 && i21 != 14)) {
                            if (k51Var.Q && (document = k51Var.d) != null) {
                                if (b61Var.W == 6) {
                                    b61Var.p(k51Var, Long.valueOf(document.f20349id), document, k51Var.v, null);
                                } else {
                                    b61Var.p(k51Var, null, document, k51Var.v, null);
                                }
                            } else {
                                b61Var.o(k51Var, k51Var.e);
                            }
                        } else {
                            b61Var.l();
                            b61Var.r(k51Var, k51Var.f38830x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            b61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        b61Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            b61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.f51) {
                        b61Var.i(i10, (org.telegram.ui.f51) view);
                        if (i21 != 1 && i21 != 11) {
                            b61Var.performHapticFeedback(3, 1);
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
