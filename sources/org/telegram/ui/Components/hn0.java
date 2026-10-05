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
public final class hn0 implements ml0 {
    public final int f27268a;
    public final int f27269b;
    public final FrameLayout f27270c;

    public hn0(FrameLayout frameLayout, int i10, int i11) {
        this.f27268a = i11;
        this.f27270c = frameLayout;
        this.f27269b = i10;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.up0 up0Var;
        org.telegram.ui.qp0 qp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        zg.m0 m0Var;
        TLRPC.Document document;
        switch (this.f27268a) {
            case 0:
                on0 on0Var = (on0) this.f27270c;
                org.telegram.ui.ActionBar.n2 n2Var = on0Var.G;
                nn0 nn0Var = on0Var.f29514c;
                MessageObject E = nn0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (on0Var.I.g()) {
                        on0Var.I.e(E, view, 0);
                        org.telegram.ui.p10 p10Var = on0Var.J;
                        int id2 = E.getId();
                        p10Var.f39326a = E.getDialogId();
                        p10Var.f39327b = id2;
                        nn0Var.m(i10);
                        if (!on0Var.I.g()) {
                            nn0Var.q(0, nn0Var.f29120c.f29518r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof kn0) {
                        org.telegram.ui.Cells.k7 k7Var = ((kn0) view).f28263a;
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
                                    PhotoViewer.t1().K2(null, n2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, n2Var, null);
                                    PhotoViewer.t1().b2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, on0Var.F, n2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!k7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            k7Var.f(true);
                            DownloadController.getInstance(this.f27269b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            k7Var.f(true);
                        }
                        on0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.qp0 qp0Var2 = (org.telegram.ui.qp0) this.f27270c;
                org.telegram.ui.wp0 wp0Var = qp0Var2.f39849p0;
                ArrayList arrayList2 = qp0Var2.f39845l0;
                if (view instanceof org.telegram.ui.pp0) {
                    org.telegram.ui.pp0 pp0Var = (org.telegram.ui.pp0) view;
                    int i15 = qp0Var2.m0;
                    if (qp0Var2.f39848o0 == null) {
                        o5 o5Var = pp0Var.f39616c;
                        org.telegram.ui.r61[] r61VarArr = new org.telegram.ui.r61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (o5Var != null) {
                            o5Var.f();
                            pp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(o5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(pp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = qp0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.d6 resourceProvider = wp0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.mp0 mp0Var = new org.telegram.ui.mp0(qp0Var2, wp0Var, context, valueOf2, i13, resourceProvider, i14, pp0Var.a(), pp0Var, r61VarArr);
                        mp0Var.f34738g1 = true;
                        long j10 = qp0Var2.f39846n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        mp0Var.setSelected(valueOf);
                        mp0Var.setSaveState(3);
                        mp0Var.y(o5Var, pp0Var);
                        org.telegram.ui.np0 np0Var = new org.telegram.ui.np0(qp0Var2, mp0Var);
                        qp0Var2.f39848o0 = np0Var;
                        r61VarArr[0] = np0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        np0Var.showAsDropDown(pp0Var, 0, i11, i16 | 48);
                        r61VarArr[0].b();
                    }
                    return;
                }
                int i17 = qp0Var2.V;
                int i18 = this.f27269b;
                if (i10 == i17) {
                    qp0Var2.h = -1;
                    qp0Var2.f39846n = 0L;
                    qp0Var2.f39850r = null;
                    qp0Var2.f39851s = null;
                    qp0Var2.I = null;
                    qp0Var2.i();
                    if (i18 == 0) {
                        wp0Var.h.i();
                    }
                    org.telegram.ui.pp0 pp0Var2 = qp0Var2.f39854y;
                    if (pp0Var2 != null) {
                        pp0Var2.b(true);
                    }
                    qp0Var2.j(true);
                    qp0Var2.f(true);
                    org.telegram.ui.qp0 qp0Var3 = wp0Var.f42655n;
                    if (qp0Var3 != null && (up0Var = qp0Var3.f39829a) != null && (qp0Var = wp0Var.h) != null) {
                        up0Var.a(qp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = qp0Var2.f39832b0;
                if (i10 >= i19 && i10 < qp0Var2.f39834c0) {
                    int i20 = i10 - i19;
                    if (qp0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    qp0Var2.f39846n = 0L;
                                    qp0Var2.h = -1;
                                    qp0Var2.I = null;
                                    qp0Var2.f39850r = null;
                                    qp0Var2.f39851s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                qp0Var2.f39846n = 0L;
                                qp0Var2.h = -1;
                                qp0Var2.I = null;
                                qp0Var2.f39850r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                qp0Var2.f39851s = null;
                            }
                            qp0Var2.j(true);
                            qp0Var2.i();
                            qp0Var2.f(true);
                            org.telegram.ui.pp0 pp0Var3 = qp0Var2.f39854y;
                            if (pp0Var3 != null) {
                                pp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (qp0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                qp0Var2.f39846n = 0L;
                                qp0Var2.h = -1;
                                qp0Var2.f39850r = null;
                                qp0Var2.f39851s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            qp0Var2.f39846n = 0L;
                            qp0Var2.h = -1;
                            qp0Var2.f39850r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            qp0Var2.f39851s = null;
                        }
                        qp0Var2.I = tL_starGiftUnique2;
                        qp0Var2.j(true);
                        qp0Var2.i();
                        qp0Var2.f(true);
                        org.telegram.ui.pp0 pp0Var4 = qp0Var2.f39854y;
                        if (pp0Var4 != null) {
                            pp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) this.f27270c;
                boolean z12 = view instanceof org.telegram.ui.j61;
                int i21 = this.f27269b;
                try {
                    if (z12) {
                        org.telegram.ui.j61 j61Var = (org.telegram.ui.j61) view;
                        if (!j61Var.f37588s && (((m0Var = j61Var.f37590x) == null || !m0Var.f53467a) && i21 != 13 && i21 != 14)) {
                            if (j61Var.Q && (document = j61Var.d) != null) {
                                if (a71Var.W == 6) {
                                    a71Var.p(j61Var, Long.valueOf(document.f20053id), document, j61Var.v, null);
                                } else {
                                    a71Var.p(j61Var, null, document, j61Var.v, null);
                                }
                            } else {
                                a71Var.o(j61Var, j61Var.f37584e);
                            }
                        } else {
                            a71Var.l();
                            a71Var.r(j61Var, j61Var.f37590x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            a71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        a71Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            a71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.e61) {
                        a71Var.i(i10, (org.telegram.ui.e61) view);
                        if (i21 != 1 && i21 != 11) {
                            a71Var.performHapticFeedback(3, 1);
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
