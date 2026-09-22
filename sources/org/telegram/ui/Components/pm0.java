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
public final class pm0 implements zk0 {
    public final int f27092a;
    public final int f27093b;
    public final FrameLayout f27094c;

    public pm0(FrameLayout frameLayout, int i10, int i11) {
        this.f27092a = i11;
        this.f27094c = frameLayout;
        this.f27093b = i10;
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
        zg.p0 p0Var;
        TLRPC.Document document;
        switch (this.f27092a) {
            case 0:
                vm0 vm0Var = (vm0) this.f27094c;
                org.telegram.ui.ActionBar.n2 n2Var = vm0Var.G;
                um0 um0Var = vm0Var.f28831c;
                MessageObject E = um0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (vm0Var.I.g()) {
                        vm0Var.I.e(E, view, 0);
                        org.telegram.ui.p10 p10Var = vm0Var.J;
                        int id2 = E.getId();
                        p10Var.f36392a = E.getDialogId();
                        p10Var.f36393b = id2;
                        um0Var.m(i10);
                        if (!vm0Var.I.g()) {
                            um0Var.q(0, um0Var.f28428c.f28834r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof rm0) {
                        org.telegram.ui.Cells.j7 j7Var = ((rm0) view).f27652a;
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
                                    PhotoViewer.t1().J2(null, n2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().J2(null, n2Var, null);
                                    PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, vm0Var.F, n2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!j7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            j7Var.f(true);
                            DownloadController.getInstance(this.f27093b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            j7Var.f(true);
                        }
                        vm0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.up0 up0Var2 = (org.telegram.ui.up0) this.f27094c;
                org.telegram.ui.aq0 aq0Var = up0Var2.f38097p0;
                ArrayList arrayList2 = up0Var2.f38093l0;
                if (view instanceof org.telegram.ui.tp0) {
                    org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) view;
                    int i15 = up0Var2.m0;
                    if (up0Var2.f38096o0 == null) {
                        m5 m5Var = tp0Var.f37712c;
                        org.telegram.ui.y61[] y61VarArr = new org.telegram.ui.y61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (m5Var != null) {
                            m5Var.f();
                            tp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(m5Var.getBounds());
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
                        org.telegram.ui.qp0 qp0Var = new org.telegram.ui.qp0(up0Var2, aq0Var, context, valueOf2, i13, resourceProvider, i14, tp0Var.a(), tp0Var, y61VarArr);
                        qp0Var.f34131g1 = true;
                        long j10 = up0Var2.f38094n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        qp0Var.setSelected(valueOf);
                        qp0Var.setSaveState(3);
                        qp0Var.y(m5Var, tp0Var);
                        org.telegram.ui.rp0 rp0Var = new org.telegram.ui.rp0(up0Var2, qp0Var);
                        up0Var2.f38096o0 = rp0Var;
                        y61VarArr[0] = rp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        rp0Var.showAsDropDown(tp0Var, 0, i11, i16 | 48);
                        y61VarArr[0].b();
                    }
                    return;
                }
                int i17 = up0Var2.V;
                int i18 = this.f27093b;
                if (i10 == i17) {
                    up0Var2.h = -1;
                    up0Var2.f38094n = 0L;
                    up0Var2.f38098r = null;
                    up0Var2.f38099s = null;
                    up0Var2.I = null;
                    up0Var2.i();
                    if (i18 == 0) {
                        aq0Var.h.i();
                    }
                    org.telegram.ui.tp0 tp0Var2 = up0Var2.f38102y;
                    if (tp0Var2 != null) {
                        tp0Var2.b(true);
                    }
                    up0Var2.j(true);
                    up0Var2.f(true);
                    org.telegram.ui.up0 up0Var3 = aq0Var.f31885n;
                    if (up0Var3 != null && (yp0Var = up0Var3.f38078a) != null && (up0Var = aq0Var.h) != null) {
                        yp0Var.a(up0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = up0Var2.f38081b0;
                if (i10 >= i19 && i10 < up0Var2.f38083c0) {
                    int i20 = i10 - i19;
                    if (up0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    up0Var2.f38094n = 0L;
                                    up0Var2.h = -1;
                                    up0Var2.I = null;
                                    up0Var2.f38098r = null;
                                    up0Var2.f38099s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                up0Var2.f38094n = 0L;
                                up0Var2.h = -1;
                                up0Var2.I = null;
                                up0Var2.f38098r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                up0Var2.f38099s = null;
                            }
                            up0Var2.j(true);
                            up0Var2.i();
                            up0Var2.f(true);
                            org.telegram.ui.tp0 tp0Var3 = up0Var2.f38102y;
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
                                up0Var2.f38094n = 0L;
                                up0Var2.h = -1;
                                up0Var2.f38098r = null;
                                up0Var2.f38099s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            up0Var2.f38094n = 0L;
                            up0Var2.h = -1;
                            up0Var2.f38098r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            up0Var2.f38099s = null;
                        }
                        up0Var2.I = tL_starGiftUnique2;
                        up0Var2.j(true);
                        up0Var2.i();
                        up0Var2.f(true);
                        org.telegram.ui.tp0 tp0Var4 = up0Var2.f38102y;
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
                org.telegram.ui.h71 h71Var = (org.telegram.ui.h71) this.f27094c;
                boolean z12 = view instanceof org.telegram.ui.q61;
                int i21 = this.f27093b;
                try {
                    if (z12) {
                        org.telegram.ui.q61 q61Var = (org.telegram.ui.q61) view;
                        if (!q61Var.f36774s && (((p0Var = q61Var.f36776x) == null || !p0Var.f49117a) && i21 != 13 && i21 != 14)) {
                            if (q61Var.Q && (document = q61Var.d) != null) {
                                if (h71Var.W == 6) {
                                    h71Var.p(q61Var, Long.valueOf(document.f18115id), document, q61Var.v, null);
                                } else {
                                    h71Var.p(q61Var, null, document, q61Var.v, null);
                                }
                            } else {
                                h71Var.o(q61Var, q61Var.e);
                            }
                        } else {
                            h71Var.l();
                            h71Var.r(q61Var, q61Var.f36776x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            h71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        h71Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            h71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.l61) {
                        h71Var.i(i10, (org.telegram.ui.l61) view);
                        if (i21 != 1 && i21 != 11) {
                            h71Var.performHapticFeedback(3, 1);
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
