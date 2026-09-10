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
public final class zm0 implements jl0 {
    public final int f29728a;
    public final int f29729b;
    public final FrameLayout f29730c;

    public zm0(FrameLayout frameLayout, int i10, int i11) {
        this.f29728a = i11;
        this.f29730c = frameLayout;
        this.f29729b = i10;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.yp0 yp0Var;
        org.telegram.ui.up0 up0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        yg.p0 p0Var;
        TLRPC.Document document;
        switch (this.f29728a) {
            case 0:
                fn0 fn0Var = (fn0) this.f29730c;
                org.telegram.ui.ActionBar.p2 p2Var = fn0Var.G;
                en0 en0Var = fn0Var.f23041c;
                MessageObject E = en0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (fn0Var.I.f()) {
                        fn0Var.I.d(E, view, 0);
                        org.telegram.ui.r10 r10Var = fn0Var.J;
                        int id2 = E.getId();
                        r10Var.f36168a = E.getDialogId();
                        r10Var.f36169b = id2;
                        en0Var.m(i10);
                        if (!fn0Var.I.f()) {
                            en0Var.q(0, en0Var.f22732c.f23044r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof bn0) {
                        org.telegram.ui.Cells.l7 l7Var = ((bn0) view).f21863a;
                        MessageObject message = l7Var.getMessage();
                        TLRPC.Document document2 = message.getDocument();
                        if (l7Var.G) {
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
                                        j3 = 0;
                                        chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(E.messageOwner.peer_id.channel_id));
                                    } else {
                                        j3 = 0;
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.messageOwner.peer_id.chat_id != j3) {
                                            chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(E.messageOwner.peer_id.chat_id));
                                        } else {
                                            chat = null;
                                        }
                                    }
                                    if (chat != null) {
                                        z10 = chat.noforwards;
                                    }
                                    canPreviewDocument = (canPreviewDocument || z10) ? true : true;
                                }
                                if (canPreviewDocument) {
                                    PhotoViewer.t1().K2(null, p2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, p2Var, null);
                                    PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, fn0Var.F, p2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!l7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            l7Var.f(true);
                            DownloadController.getInstance(this.f29729b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            l7Var.f(true);
                        }
                        fn0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.up0 up0Var2 = (org.telegram.ui.up0) this.f29730c;
                org.telegram.ui.bq0 bq0Var = up0Var2.f37324p0;
                ArrayList arrayList2 = up0Var2.f37320l0;
                if (view instanceof org.telegram.ui.tp0) {
                    org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) view;
                    int i15 = up0Var2.m0;
                    if (up0Var2.f37323o0 == null) {
                        n5 n5Var = tp0Var.f36986c;
                        org.telegram.ui.c71[] c71VarArr = new org.telegram.ui.c71[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (n5Var != null) {
                            n5Var.f();
                            tp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(n5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(tp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = up0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.f6 resourceProvider = bq0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.qp0 qp0Var = new org.telegram.ui.qp0(up0Var2, bq0Var, context, valueOf2, i13, resourceProvider, i14, tp0Var.a(), tp0Var, c71VarArr);
                        qp0Var.f34569g1 = true;
                        long j10 = up0Var2.f37321n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        qp0Var.setSelected(valueOf);
                        qp0Var.setSaveState(3);
                        qp0Var.y(n5Var, tp0Var);
                        org.telegram.ui.rp0 rp0Var = new org.telegram.ui.rp0(up0Var2, qp0Var);
                        up0Var2.f37323o0 = rp0Var;
                        c71VarArr[0] = rp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        rp0Var.showAsDropDown(tp0Var, 0, i11, i16 | 48);
                        c71VarArr[0].b();
                    }
                    return;
                }
                int i17 = up0Var2.V;
                int i18 = this.f29729b;
                if (i10 == i17) {
                    up0Var2.h = -1;
                    up0Var2.f37321n = 0L;
                    up0Var2.f37325r = null;
                    up0Var2.f37326s = null;
                    up0Var2.I = null;
                    up0Var2.i();
                    if (i18 == 0) {
                        bq0Var.h.i();
                    }
                    org.telegram.ui.tp0 tp0Var2 = up0Var2.f37329y;
                    if (tp0Var2 != null) {
                        tp0Var2.b(true);
                    }
                    up0Var2.j(true);
                    up0Var2.f(true);
                    org.telegram.ui.up0 up0Var3 = bq0Var.f31352n;
                    if (up0Var3 != null && (yp0Var = up0Var3.f37305a) != null && (up0Var = bq0Var.h) != null) {
                        yp0Var.a(up0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = up0Var2.f37308b0;
                if (i10 >= i19 && i10 < up0Var2.f37310c0) {
                    int i20 = i10 - i19;
                    if (up0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    up0Var2.f37321n = 0L;
                                    up0Var2.h = -1;
                                    up0Var2.I = null;
                                    up0Var2.f37325r = null;
                                    up0Var2.f37326s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                up0Var2.f37321n = 0L;
                                up0Var2.h = -1;
                                up0Var2.I = null;
                                up0Var2.f37325r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                up0Var2.f37326s = null;
                            }
                            up0Var2.j(true);
                            up0Var2.i();
                            up0Var2.f(true);
                            org.telegram.ui.tp0 tp0Var3 = up0Var2.f37329y;
                            if (tp0Var3 != null) {
                                tp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (up0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                up0Var2.f37321n = 0L;
                                up0Var2.h = -1;
                                up0Var2.f37325r = null;
                                up0Var2.f37326s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            up0Var2.f37321n = 0L;
                            up0Var2.h = -1;
                            up0Var2.f37325r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            up0Var2.f37326s = null;
                        }
                        up0Var2.I = tL_starGiftUnique2;
                        up0Var2.j(true);
                        up0Var2.i();
                        up0Var2.f(true);
                        org.telegram.ui.tp0 tp0Var4 = up0Var2.f37329y;
                        if (tp0Var4 != null) {
                            tp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.l71 l71Var = (org.telegram.ui.l71) this.f29730c;
                boolean z12 = view instanceof org.telegram.ui.u61;
                int i21 = this.f29729b;
                try {
                    if (z12) {
                        org.telegram.ui.u61 u61Var = (org.telegram.ui.u61) view;
                        if (!u61Var.f37133s && (((p0Var = u61Var.f37135x) == null || !p0Var.f47098a) && i21 != 13 && i21 != 14)) {
                            if (u61Var.Q && (document = u61Var.d) != null) {
                                if (l71Var.W == 6) {
                                    l71Var.p(u61Var, Long.valueOf(document.f17201id), document, u61Var.v, null);
                                } else {
                                    l71Var.p(u61Var, null, document, u61Var.v, null);
                                }
                            } else {
                                l71Var.o(u61Var, u61Var.e);
                            }
                        } else {
                            l71Var.l();
                            l71Var.r(u61Var, u61Var.f37135x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            l71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        l71Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            l71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.p61) {
                        l71Var.i(i10, (org.telegram.ui.p61) view);
                        if (i21 != 1 && i21 != 11) {
                            l71Var.performHapticFeedback(3, 1);
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
