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
public final class bn0 implements kl0 {
    public final int f23028a;
    public final int f23029b;
    public final FrameLayout f23030c;

    public bn0(FrameLayout frameLayout, int i10, int i11) {
        this.f23028a = i11;
        this.f23030c = frameLayout;
        this.f23029b = i10;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.rp0 rp0Var;
        org.telegram.ui.np0 np0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        zg.o0 o0Var;
        TLRPC.Document document;
        switch (this.f23028a) {
            case 0:
                in0 in0Var = (in0) this.f23030c;
                org.telegram.ui.ActionBar.m2 m2Var = in0Var.G;
                hn0 hn0Var = in0Var.f25095c;
                MessageObject E = hn0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (in0Var.I.g()) {
                        in0Var.I.e(E, view, 0);
                        org.telegram.ui.l10 l10Var = in0Var.J;
                        int id2 = E.getId();
                        l10Var.f35173a = E.getDialogId();
                        l10Var.f35174b = id2;
                        hn0Var.m(i10);
                        if (!in0Var.I.g()) {
                            hn0Var.q(0, hn0Var.f24816c.f25098r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof en0) {
                        org.telegram.ui.Cells.k7 k7Var = ((en0) view).f23962a;
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
                                    PhotoViewer.t1().J2(null, m2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().J2(null, m2Var, null);
                                    PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, in0Var.F, m2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!k7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            k7Var.f(true);
                            DownloadController.getInstance(this.f23029b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            k7Var.f(true);
                        }
                        in0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.np0 np0Var2 = (org.telegram.ui.np0) this.f23030c;
                org.telegram.ui.tp0 tp0Var = np0Var2.f35932p0;
                ArrayList arrayList2 = np0Var2.f35928l0;
                if (view instanceof org.telegram.ui.mp0) {
                    org.telegram.ui.mp0 mp0Var = (org.telegram.ui.mp0) view;
                    int i15 = np0Var2.m0;
                    if (np0Var2.f35931o0 == null) {
                        o5 o5Var = mp0Var.f35630c;
                        org.telegram.ui.r61[] r61VarArr = new org.telegram.ui.r61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (o5Var != null) {
                            o5Var.f();
                            mp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(o5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(mp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = np0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.d6 resourceProvider = tp0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.jp0 jp0Var = new org.telegram.ui.jp0(np0Var2, tp0Var, context, valueOf2, i13, resourceProvider, i14, mp0Var.a(), mp0Var, r61VarArr);
                        jp0Var.f32012g1 = true;
                        long j10 = np0Var2.f35929n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        jp0Var.setSelected(valueOf);
                        jp0Var.setSaveState(3);
                        jp0Var.y(o5Var, mp0Var);
                        org.telegram.ui.kp0 kp0Var = new org.telegram.ui.kp0(np0Var2, jp0Var);
                        np0Var2.f35931o0 = kp0Var;
                        r61VarArr[0] = kp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        kp0Var.showAsDropDown(mp0Var, 0, i11, i16 | 48);
                        r61VarArr[0].b();
                    }
                    return;
                }
                int i17 = np0Var2.V;
                int i18 = this.f23029b;
                if (i10 == i17) {
                    np0Var2.h = -1;
                    np0Var2.f35929n = 0L;
                    np0Var2.f35933r = null;
                    np0Var2.f35934s = null;
                    np0Var2.I = null;
                    np0Var2.i();
                    if (i18 == 0) {
                        tp0Var.h.i();
                    }
                    org.telegram.ui.mp0 mp0Var2 = np0Var2.f35937y;
                    if (mp0Var2 != null) {
                        mp0Var2.b(true);
                    }
                    np0Var2.j(true);
                    np0Var2.f(true);
                    org.telegram.ui.np0 np0Var3 = tp0Var.f38162n;
                    if (np0Var3 != null && (rp0Var = np0Var3.f35913a) != null && (np0Var = tp0Var.h) != null) {
                        rp0Var.a(np0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = np0Var2.f35916b0;
                if (i10 >= i19 && i10 < np0Var2.f35918c0) {
                    int i20 = i10 - i19;
                    if (np0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    np0Var2.f35929n = 0L;
                                    np0Var2.h = -1;
                                    np0Var2.I = null;
                                    np0Var2.f35933r = null;
                                    np0Var2.f35934s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                np0Var2.f35929n = 0L;
                                np0Var2.h = -1;
                                np0Var2.I = null;
                                np0Var2.f35933r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                np0Var2.f35934s = null;
                            }
                            np0Var2.j(true);
                            np0Var2.i();
                            np0Var2.f(true);
                            org.telegram.ui.mp0 mp0Var3 = np0Var2.f35937y;
                            if (mp0Var3 != null) {
                                mp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (np0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                np0Var2.f35929n = 0L;
                                np0Var2.h = -1;
                                np0Var2.f35933r = null;
                                np0Var2.f35934s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            np0Var2.f35929n = 0L;
                            np0Var2.h = -1;
                            np0Var2.f35933r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            np0Var2.f35934s = null;
                        }
                        np0Var2.I = tL_starGiftUnique2;
                        np0Var2.j(true);
                        np0Var2.i();
                        np0Var2.f(true);
                        org.telegram.ui.mp0 mp0Var4 = np0Var2.f35937y;
                        if (mp0Var4 != null) {
                            mp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) this.f23030c;
                boolean z12 = view instanceof org.telegram.ui.j61;
                int i21 = this.f23029b;
                try {
                    if (z12) {
                        org.telegram.ui.j61 j61Var = (org.telegram.ui.j61) view;
                        if (!j61Var.f34654s && (((o0Var = j61Var.f34656x) == null || !o0Var.f49382a) && i21 != 13 && i21 != 14)) {
                            if (j61Var.Q && (document = j61Var.d) != null) {
                                if (a71Var.W == 6) {
                                    a71Var.p(j61Var, Long.valueOf(document.f18327id), document, j61Var.v, null);
                                } else {
                                    a71Var.p(j61Var, null, document, j61Var.v, null);
                                }
                            } else {
                                a71Var.o(j61Var, j61Var.e);
                            }
                        } else {
                            a71Var.l();
                            a71Var.r(j61Var, j61Var.f34656x);
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
