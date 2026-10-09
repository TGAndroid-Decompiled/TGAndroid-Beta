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
public final class vn0 implements em0 {
    public final int f31835a;
    public final int f31836b;
    public final FrameLayout f31837c;

    public vn0(FrameLayout frameLayout, int i10, int i11) {
        this.f31835a = i11;
        this.f31837c = frameLayout;
        this.f31836b = i10;
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
        zg.n0 n0Var;
        TLRPC.Document document;
        switch (this.f31835a) {
            case 0:
                bo0 bo0Var = (bo0) this.f31837c;
                org.telegram.ui.ActionBar.n2 n2Var = bo0Var.G;
                ao0 ao0Var = bo0Var.f25068c;
                MessageObject E = ao0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (bo0Var.I.g()) {
                        bo0Var.I.e(E, view, 0);
                        org.telegram.ui.o10 o10Var = bo0Var.J;
                        int id2 = E.getId();
                        o10Var.f40399a = E.getDialogId();
                        o10Var.f40400b = id2;
                        ao0Var.m(i10);
                        if (!bo0Var.I.g()) {
                            ao0Var.q(0, ao0Var.f24724c.f25072r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof xn0) {
                        org.telegram.ui.Cells.k7 k7Var = ((xn0) view).f32983a;
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
                                    if (canPreviewDocument || z10) {
                                        z11 = true;
                                    }
                                    canPreviewDocument = z11;
                                }
                                if (canPreviewDocument) {
                                    PhotoViewer.t1().K2(null, n2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, n2Var, null);
                                    PhotoViewer.t1().b2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, bo0Var.F, n2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!k7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            k7Var.f(true);
                            DownloadController.getInstance(this.f31836b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            k7Var.f(true);
                        }
                        bo0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.up0 up0Var2 = (org.telegram.ui.up0) this.f31837c;
                org.telegram.ui.aq0 aq0Var = up0Var2.f42532p0;
                ArrayList arrayList2 = up0Var2.f42528l0;
                if (view instanceof org.telegram.ui.tp0) {
                    org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) view;
                    int i15 = up0Var2.m0;
                    if (up0Var2.f42531o0 == null) {
                        q5 q5Var = tp0Var.f42042c;
                        org.telegram.ui.b71[] b71VarArr = new org.telegram.ui.b71[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (q5Var != null) {
                            q5Var.f();
                            tp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(q5Var.getBounds());
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
                        org.telegram.ui.ActionBar.e6 resourceProvider = aq0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.qp0 qp0Var = new org.telegram.ui.qp0(up0Var2, aq0Var, context, valueOf2, i13, resourceProvider, i14, tp0Var.a(), tp0Var, b71VarArr);
                        qp0Var.f39131g1 = true;
                        long j10 = up0Var2.f42529n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        qp0Var.setSelected(valueOf);
                        qp0Var.setSaveState(3);
                        qp0Var.y(q5Var, tp0Var);
                        org.telegram.ui.rp0 rp0Var = new org.telegram.ui.rp0(up0Var2, qp0Var);
                        up0Var2.f42531o0 = rp0Var;
                        b71VarArr[0] = rp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        rp0Var.showAsDropDown(tp0Var, 0, i11, i16 | 48);
                        b71VarArr[0].b();
                    }
                    return;
                }
                int i17 = up0Var2.V;
                int i18 = this.f31836b;
                if (i10 == i17) {
                    up0Var2.h = -1;
                    up0Var2.f42529n = 0L;
                    up0Var2.f42533r = null;
                    up0Var2.f42534s = null;
                    up0Var2.I = null;
                    up0Var2.i();
                    if (i18 == 0) {
                        aq0Var.h.i();
                    }
                    org.telegram.ui.tp0 tp0Var2 = up0Var2.f42537y;
                    if (tp0Var2 != null) {
                        tp0Var2.b(true);
                    }
                    up0Var2.j(true);
                    up0Var2.f(true);
                    org.telegram.ui.up0 up0Var3 = aq0Var.f35995n;
                    if (up0Var3 != null && (yp0Var = up0Var3.f42512a) != null && (up0Var = aq0Var.h) != null) {
                        yp0Var.a(up0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = up0Var2.f42515b0;
                if (i10 >= i19 && i10 < up0Var2.f42517c0) {
                    int i20 = i10 - i19;
                    if (up0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    up0Var2.f42529n = 0L;
                                    up0Var2.h = -1;
                                    up0Var2.I = null;
                                    up0Var2.f42533r = null;
                                    up0Var2.f42534s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                up0Var2.f42529n = 0L;
                                up0Var2.h = -1;
                                up0Var2.I = null;
                                up0Var2.f42533r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                up0Var2.f42534s = null;
                            }
                            up0Var2.j(true);
                            up0Var2.i();
                            up0Var2.f(true);
                            org.telegram.ui.tp0 tp0Var3 = up0Var2.f42537y;
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
                                up0Var2.f42529n = 0L;
                                up0Var2.h = -1;
                                up0Var2.f42533r = null;
                                up0Var2.f42534s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            up0Var2.f42529n = 0L;
                            up0Var2.h = -1;
                            up0Var2.f42533r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            up0Var2.f42534s = null;
                        }
                        up0Var2.I = tL_starGiftUnique2;
                        up0Var2.j(true);
                        up0Var2.i();
                        up0Var2.f(true);
                        org.telegram.ui.tp0 tp0Var4 = up0Var2.f42537y;
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
                org.telegram.ui.k71 k71Var = (org.telegram.ui.k71) this.f31837c;
                boolean z12 = view instanceof org.telegram.ui.t61;
                int i21 = this.f31836b;
                try {
                    if (z12) {
                        org.telegram.ui.t61 t61Var = (org.telegram.ui.t61) view;
                        if (!t61Var.f41877s && (((n0Var = t61Var.f41879x) == null || !n0Var.f54613a) && i21 != 13 && i21 != 14)) {
                            if (t61Var.Q && (document = t61Var.d) != null) {
                                if (k71Var.W == 6) {
                                    k71Var.p(t61Var, Long.valueOf(document.f20044id), document, t61Var.v, null);
                                } else {
                                    k71Var.p(t61Var, null, document, t61Var.v, null);
                                }
                            } else {
                                k71Var.o(t61Var, t61Var.f41873e);
                            }
                        } else {
                            k71Var.l();
                            k71Var.r(t61Var, t61Var.f41879x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            k71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        k71Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            k71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.o61) {
                        k71Var.i(i10, (org.telegram.ui.o61) view);
                        if (i21 != 1 && i21 != 11) {
                            k71Var.performHapticFeedback(3, 1);
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
