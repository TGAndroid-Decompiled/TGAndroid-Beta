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
    public final int f28583a;
    public final int f28584b;
    public final FrameLayout f28585c;

    public rn0(FrameLayout frameLayout, int i10, int i11) {
        this.f28583a = i11;
        this.f28585c = frameLayout;
        this.f28584b = i10;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.cq0 cq0Var;
        org.telegram.ui.yp0 yp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        ah.i1 i1Var;
        TLRPC.Document document;
        switch (this.f28583a) {
            case 0:
                xn0 xn0Var = (xn0) this.f28585c;
                org.telegram.ui.ActionBar.m2 m2Var = xn0Var.G;
                wn0 wn0Var = xn0Var.f30967c;
                MessageObject E = wn0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (xn0Var.I.g()) {
                        xn0Var.I.d(E, view, 0);
                        org.telegram.ui.t10 t10Var = xn0Var.J;
                        int id2 = E.getId();
                        t10Var.f39980a = E.getDialogId();
                        t10Var.f39981b = id2;
                        wn0Var.m(i10);
                        if (!xn0Var.I.g()) {
                            wn0Var.q(0, wn0Var.f30606c.f30970r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof tn0) {
                        org.telegram.ui.Cells.j7 j7Var = ((tn0) view).f29172a;
                        MessageObject message = j7Var.getMessage();
                        TLRPC.Document document2 = message.getDocument();
                        if (j7Var.G) {
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
                                    PhotoViewer.t1().K2(null, m2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, m2Var, null);
                                    PhotoViewer.t1().b2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, xn0Var.F, m2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!j7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            j7Var.f(true);
                            DownloadController.getInstance(this.f28584b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            j7Var.f(true);
                        }
                        xn0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.yp0 yp0Var2 = (org.telegram.ui.yp0) this.f28585c;
                org.telegram.ui.eq0 eq0Var = yp0Var2.f41880p0;
                ArrayList arrayList2 = yp0Var2.f41876l0;
                if (view instanceof org.telegram.ui.xp0) {
                    org.telegram.ui.xp0 xp0Var = (org.telegram.ui.xp0) view;
                    int i15 = yp0Var2.m0;
                    if (yp0Var2.f41879o0 == null) {
                        q5 q5Var = xp0Var.f41609c;
                        org.telegram.ui.i71[] i71VarArr = new org.telegram.ui.i71[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (q5Var != null) {
                            q5Var.f();
                            xp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(q5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(xp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = yp0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.c6 resourceProvider = eq0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.up0 up0Var = new org.telegram.ui.up0(yp0Var2, eq0Var, context, valueOf2, i13, resourceProvider, i14, xp0Var.a(), xp0Var, i71VarArr);
                        up0Var.f39329g1 = true;
                        long j11 = yp0Var2.f41877n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        up0Var.setSelected(valueOf);
                        up0Var.setSaveState(3);
                        up0Var.y(q5Var, xp0Var);
                        org.telegram.ui.vp0 vp0Var = new org.telegram.ui.vp0(yp0Var2, up0Var);
                        yp0Var2.f41879o0 = vp0Var;
                        i71VarArr[0] = vp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        vp0Var.showAsDropDown(xp0Var, 0, i11, i16 | 48);
                        i71VarArr[0].b();
                    }
                    return;
                }
                int i17 = yp0Var2.V;
                int i18 = this.f28584b;
                if (i10 == i17) {
                    yp0Var2.h = -1;
                    yp0Var2.f41877n = 0L;
                    yp0Var2.f41881r = null;
                    yp0Var2.f41882s = null;
                    yp0Var2.I = null;
                    yp0Var2.i();
                    if (i18 == 0) {
                        eq0Var.h.i();
                    }
                    org.telegram.ui.xp0 xp0Var2 = yp0Var2.f41885y;
                    if (xp0Var2 != null) {
                        xp0Var2.b(true);
                    }
                    yp0Var2.j(true);
                    yp0Var2.f(true);
                    org.telegram.ui.yp0 yp0Var3 = eq0Var.f35362n;
                    if (yp0Var3 != null && (cq0Var = yp0Var3.f41861a) != null && (yp0Var = eq0Var.h) != null) {
                        cq0Var.a(yp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = yp0Var2.f41864b0;
                if (i10 >= i19 && i10 < yp0Var2.f41866c0) {
                    int i20 = i10 - i19;
                    if (yp0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    yp0Var2.f41877n = 0L;
                                    yp0Var2.h = -1;
                                    yp0Var2.I = null;
                                    yp0Var2.f41881r = null;
                                    yp0Var2.f41882s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                yp0Var2.f41877n = 0L;
                                yp0Var2.h = -1;
                                yp0Var2.I = null;
                                yp0Var2.f41881r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                yp0Var2.f41882s = null;
                            }
                            yp0Var2.j(true);
                            yp0Var2.i();
                            yp0Var2.f(true);
                            org.telegram.ui.xp0 xp0Var3 = yp0Var2.f41885y;
                            if (xp0Var3 != null) {
                                xp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (yp0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                yp0Var2.f41877n = 0L;
                                yp0Var2.h = -1;
                                yp0Var2.f41881r = null;
                                yp0Var2.f41882s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            yp0Var2.f41877n = 0L;
                            yp0Var2.h = -1;
                            yp0Var2.f41881r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            yp0Var2.f41882s = null;
                        }
                        yp0Var2.I = tL_starGiftUnique2;
                        yp0Var2.j(true);
                        yp0Var2.i();
                        yp0Var2.f(true);
                        org.telegram.ui.xp0 xp0Var4 = yp0Var2.f41885y;
                        if (xp0Var4 != null) {
                            xp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.r71 r71Var = (org.telegram.ui.r71) this.f28585c;
                boolean z12 = view instanceof org.telegram.ui.a71;
                int i21 = this.f28584b;
                try {
                    if (z12) {
                        org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) view;
                        if (!a71Var.f33772s && (((i1Var = a71Var.f33774x) == null || !i1Var.f780a) && i21 != 13 && i21 != 14)) {
                            if (a71Var.Q && (document = a71Var.d) != null) {
                                if (r71Var.W == 6) {
                                    r71Var.p(a71Var, Long.valueOf(document.f18922id), document, a71Var.v, null);
                                } else {
                                    r71Var.p(a71Var, null, document, a71Var.v, null);
                                }
                            } else {
                                r71Var.o(a71Var, a71Var.e);
                            }
                        } else {
                            r71Var.l();
                            r71Var.r(a71Var, a71Var.f33774x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            r71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        r71Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            r71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.v61) {
                        r71Var.i(i10, (org.telegram.ui.v61) view);
                        if (i21 != 1 && i21 != 11) {
                            r71Var.performHapticFeedback(3, 1);
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
