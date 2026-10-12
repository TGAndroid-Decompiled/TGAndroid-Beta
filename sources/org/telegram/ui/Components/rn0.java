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
    public final int f28882a;
    public final int f28883b;
    public final FrameLayout f28884c;

    public rn0(FrameLayout frameLayout, int i10, int i11) {
        this.f28882a = i11;
        this.f28884c = frameLayout;
        this.f28883b = i10;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.eq0 eq0Var;
        org.telegram.ui.aq0 aq0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        ah.i1 i1Var;
        TLRPC.Document document;
        switch (this.f28882a) {
            case 0:
                yn0 yn0Var = (yn0) this.f28884c;
                org.telegram.ui.ActionBar.m2 m2Var = yn0Var.G;
                xn0 xn0Var = yn0Var.f31655c;
                MessageObject E = xn0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (yn0Var.I.g()) {
                        yn0Var.I.d(E, view, 0);
                        org.telegram.ui.u10 u10Var = yn0Var.J;
                        int id2 = E.getId();
                        u10Var.f40516a = E.getDialogId();
                        u10Var.f40517b = id2;
                        xn0Var.m(i10);
                        if (!yn0Var.I.g()) {
                            xn0Var.q(0, xn0Var.f31288c.f31658r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof un0) {
                        org.telegram.ui.Cells.k7 k7Var = ((un0) view).f29739a;
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
                                    PhotoViewer.t1().K2(null, m2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, m2Var, null);
                                    PhotoViewer.t1().b2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, yn0Var.F, m2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!k7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            k7Var.f(true);
                            DownloadController.getInstance(this.f28883b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            k7Var.f(true);
                        }
                        yn0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.aq0 aq0Var2 = (org.telegram.ui.aq0) this.f28884c;
                org.telegram.ui.gq0 gq0Var = aq0Var2.f34322p0;
                ArrayList arrayList2 = aq0Var2.f34318l0;
                if (view instanceof org.telegram.ui.zp0) {
                    org.telegram.ui.zp0 zp0Var = (org.telegram.ui.zp0) view;
                    int i15 = aq0Var2.m0;
                    if (aq0Var2.f34321o0 == null) {
                        q5 q5Var = zp0Var.f42694c;
                        org.telegram.ui.i71[] i71VarArr = new org.telegram.ui.i71[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (q5Var != null) {
                            q5Var.f();
                            zp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(q5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(zp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = aq0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.c6 resourceProvider = gq0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.wp0 wp0Var = new org.telegram.ui.wp0(aq0Var2, gq0Var, context, valueOf2, i13, resourceProvider, i14, zp0Var.a(), zp0Var, i71VarArr);
                        wp0Var.f39636g1 = true;
                        long j11 = aq0Var2.f34319n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        wp0Var.setSelected(valueOf);
                        wp0Var.setSaveState(3);
                        wp0Var.y(q5Var, zp0Var);
                        org.telegram.ui.xp0 xp0Var = new org.telegram.ui.xp0(aq0Var2, wp0Var);
                        aq0Var2.f34321o0 = xp0Var;
                        i71VarArr[0] = xp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        xp0Var.showAsDropDown(zp0Var, 0, i11, i16 | 48);
                        i71VarArr[0].b();
                    }
                    return;
                }
                int i17 = aq0Var2.V;
                int i18 = this.f28883b;
                if (i10 == i17) {
                    aq0Var2.h = -1;
                    aq0Var2.f34319n = 0L;
                    aq0Var2.f34323r = null;
                    aq0Var2.f34324s = null;
                    aq0Var2.I = null;
                    aq0Var2.i();
                    if (i18 == 0) {
                        gq0Var.h.i();
                    }
                    org.telegram.ui.zp0 zp0Var2 = aq0Var2.f34327y;
                    if (zp0Var2 != null) {
                        zp0Var2.b(true);
                    }
                    aq0Var2.j(true);
                    aq0Var2.f(true);
                    org.telegram.ui.aq0 aq0Var3 = gq0Var.f36463n;
                    if (aq0Var3 != null && (eq0Var = aq0Var3.f34303a) != null && (aq0Var = gq0Var.h) != null) {
                        eq0Var.a(aq0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = aq0Var2.f34306b0;
                if (i10 >= i19 && i10 < aq0Var2.f34308c0) {
                    int i20 = i10 - i19;
                    if (aq0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    aq0Var2.f34319n = 0L;
                                    aq0Var2.h = -1;
                                    aq0Var2.I = null;
                                    aq0Var2.f34323r = null;
                                    aq0Var2.f34324s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                aq0Var2.f34319n = 0L;
                                aq0Var2.h = -1;
                                aq0Var2.I = null;
                                aq0Var2.f34323r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                aq0Var2.f34324s = null;
                            }
                            aq0Var2.j(true);
                            aq0Var2.i();
                            aq0Var2.f(true);
                            org.telegram.ui.zp0 zp0Var3 = aq0Var2.f34327y;
                            if (zp0Var3 != null) {
                                zp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (aq0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                aq0Var2.f34319n = 0L;
                                aq0Var2.h = -1;
                                aq0Var2.f34323r = null;
                                aq0Var2.f34324s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            aq0Var2.f34319n = 0L;
                            aq0Var2.h = -1;
                            aq0Var2.f34323r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            aq0Var2.f34324s = null;
                        }
                        aq0Var2.I = tL_starGiftUnique2;
                        aq0Var2.j(true);
                        aq0Var2.i();
                        aq0Var2.f(true);
                        org.telegram.ui.zp0 zp0Var4 = aq0Var2.f34327y;
                        if (zp0Var4 != null) {
                            zp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.r71 r71Var = (org.telegram.ui.r71) this.f28884c;
                boolean z12 = view instanceof org.telegram.ui.a71;
                int i21 = this.f28883b;
                try {
                    if (z12) {
                        org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) view;
                        if (!a71Var.f34069s && (((i1Var = a71Var.f34071x) == null || !i1Var.f776a) && i21 != 13 && i21 != 14)) {
                            if (a71Var.Q && (document = a71Var.d) != null) {
                                if (r71Var.W == 6) {
                                    r71Var.p(a71Var, Long.valueOf(document.f19222id), document, a71Var.v, null);
                                } else {
                                    r71Var.p(a71Var, null, document, a71Var.v, null);
                                }
                            } else {
                                r71Var.o(a71Var, a71Var.e);
                            }
                        } else {
                            r71Var.l();
                            r71Var.r(a71Var, a71Var.f34071x);
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
