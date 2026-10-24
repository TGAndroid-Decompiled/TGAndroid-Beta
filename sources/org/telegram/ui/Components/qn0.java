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
public final class qn0 implements zl0 {
    public final int f29965a;
    public final int f29966b;
    public final FrameLayout f29967c;

    public qn0(FrameLayout frameLayout, int i10, int i11) {
        this.f29965a = i11;
        this.f29967c = frameLayout;
        this.f29966b = i10;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.ip0 ip0Var;
        org.telegram.ui.ep0 ep0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        ah.i1 i1Var;
        TLRPC.Document document;
        switch (this.f29965a) {
            case 0:
                wn0 wn0Var = (wn0) this.f29967c;
                org.telegram.ui.ActionBar.o2 o2Var = wn0Var.G;
                vn0 vn0Var = wn0Var.f32304c;
                MessageObject E = vn0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (wn0Var.I.g()) {
                        wn0Var.I.d(E, view, 0);
                        org.telegram.ui.a10 a10Var = wn0Var.J;
                        int id2 = E.getId();
                        a10Var.f35547a = E.getDialogId();
                        a10Var.f35548b = id2;
                        vn0Var.m(i10);
                        if (!wn0Var.I.g()) {
                            vn0Var.q(0, vn0Var.f31479c.f32307r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof sn0) {
                        org.telegram.ui.Cells.k7 k7Var = ((sn0) view).f30597a;
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
                                AndroidUtilities.openDocument(message, wn0Var.F, o2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!k7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            k7Var.f(true);
                            DownloadController.getInstance(this.f29966b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            k7Var.f(true);
                        }
                        wn0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ep0 ep0Var2 = (org.telegram.ui.ep0) this.f29967c;
                org.telegram.ui.kp0 kp0Var = ep0Var2.f36983p0;
                ArrayList arrayList2 = ep0Var2.f36979l0;
                if (view instanceof org.telegram.ui.dp0) {
                    org.telegram.ui.dp0 dp0Var = (org.telegram.ui.dp0) view;
                    int i15 = ep0Var2.m0;
                    if (ep0Var2.f36982o0 == null) {
                        n5 n5Var = dp0Var.f36662c;
                        org.telegram.ui.r51[] r51VarArr = new org.telegram.ui.r51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (n5Var != null) {
                            n5Var.f();
                            dp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(n5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(dp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = ep0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.g6 resourceProvider = kp0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.ap0 ap0Var = new org.telegram.ui.ap0(ep0Var2, kp0Var, context, valueOf2, i13, resourceProvider, i14, dp0Var.a(), dp0Var, r51VarArr);
                        ap0Var.f35621g1 = true;
                        long j11 = ep0Var2.f36980n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        ap0Var.setSelected(valueOf);
                        ap0Var.setSaveState(3);
                        ap0Var.y(n5Var, dp0Var);
                        org.telegram.ui.bp0 bp0Var = new org.telegram.ui.bp0(ep0Var2, ap0Var);
                        ep0Var2.f36982o0 = bp0Var;
                        r51VarArr[0] = bp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        bp0Var.showAsDropDown(dp0Var, 0, i11, i16 | 48);
                        r51VarArr[0].b();
                    }
                    return;
                }
                int i17 = ep0Var2.V;
                int i18 = this.f29966b;
                if (i10 == i17) {
                    ep0Var2.h = -1;
                    ep0Var2.f36980n = 0L;
                    ep0Var2.f36984r = null;
                    ep0Var2.f36985s = null;
                    ep0Var2.I = null;
                    ep0Var2.i();
                    if (i18 == 0) {
                        kp0Var.h.i();
                    }
                    org.telegram.ui.dp0 dp0Var2 = ep0Var2.f36988y;
                    if (dp0Var2 != null) {
                        dp0Var2.b(true);
                    }
                    ep0Var2.j(true);
                    ep0Var2.f(true);
                    org.telegram.ui.ep0 ep0Var3 = kp0Var.f39013n;
                    if (ep0Var3 != null && (ip0Var = ep0Var3.f36964a) != null && (ep0Var = kp0Var.h) != null) {
                        ip0Var.a(ep0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = ep0Var2.f36967b0;
                if (i10 >= i19 && i10 < ep0Var2.f36969c0) {
                    int i20 = i10 - i19;
                    if (ep0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    ep0Var2.f36980n = 0L;
                                    ep0Var2.h = -1;
                                    ep0Var2.I = null;
                                    ep0Var2.f36984r = null;
                                    ep0Var2.f36985s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                ep0Var2.f36980n = 0L;
                                ep0Var2.h = -1;
                                ep0Var2.I = null;
                                ep0Var2.f36984r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                ep0Var2.f36985s = null;
                            }
                            ep0Var2.j(true);
                            ep0Var2.i();
                            ep0Var2.f(true);
                            org.telegram.ui.dp0 dp0Var3 = ep0Var2.f36988y;
                            if (dp0Var3 != null) {
                                dp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ep0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                ep0Var2.f36980n = 0L;
                                ep0Var2.h = -1;
                                ep0Var2.f36984r = null;
                                ep0Var2.f36985s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            ep0Var2.f36980n = 0L;
                            ep0Var2.h = -1;
                            ep0Var2.f36984r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            ep0Var2.f36985s = null;
                        }
                        ep0Var2.I = tL_starGiftUnique2;
                        ep0Var2.j(true);
                        ep0Var2.i();
                        ep0Var2.f(true);
                        org.telegram.ui.dp0 dp0Var4 = ep0Var2.f36988y;
                        if (dp0Var4 != null) {
                            dp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) this.f29967c;
                boolean z12 = view instanceof org.telegram.ui.j51;
                int i21 = this.f29966b;
                try {
                    if (z12) {
                        org.telegram.ui.j51 j51Var = (org.telegram.ui.j51) view;
                        if (!j51Var.f38468s && (((i1Var = j51Var.f38470x) == null || !i1Var.f781a) && i21 != 13 && i21 != 14)) {
                            if (j51Var.Q && (document = j51Var.d) != null) {
                                if (a61Var.W == 6) {
                                    a61Var.p(j51Var, Long.valueOf(document.f20350id), document, j51Var.v, null);
                                } else {
                                    a61Var.p(j51Var, null, document, j51Var.v, null);
                                }
                            } else {
                                a61Var.o(j51Var, j51Var.e);
                            }
                        } else {
                            a61Var.l();
                            a61Var.r(j51Var, j51Var.f38470x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            a61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        a61Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            a61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.e51) {
                        a61Var.i(i10, (org.telegram.ui.e51) view);
                        if (i21 != 1 && i21 != 11) {
                            a61Var.performHapticFeedback(3, 1);
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
