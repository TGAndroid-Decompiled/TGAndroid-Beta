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
public final class dn0 implements ml0 {
    public final int f23725a;
    public final int f23726b;
    public final FrameLayout f23727c;

    public dn0(FrameLayout frameLayout, int i10, int i11) {
        this.f23725a = i11;
        this.f23727c = frameLayout;
        this.f23726b = i10;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.aq0 aq0Var;
        org.telegram.ui.wp0 wp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        zg.p0 p0Var;
        TLRPC.Document document;
        switch (this.f23725a) {
            case 0:
                kn0 kn0Var = (kn0) this.f23727c;
                org.telegram.ui.ActionBar.n2 n2Var = kn0Var.G;
                jn0 jn0Var = kn0Var.f25767c;
                MessageObject E = jn0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (kn0Var.I.g()) {
                        kn0Var.I.e(E, view, 0);
                        org.telegram.ui.p10 p10Var = kn0Var.J;
                        int id2 = E.getId();
                        p10Var.f36450a = E.getDialogId();
                        p10Var.f36451b = id2;
                        jn0Var.m(i10);
                        if (!kn0Var.I.g()) {
                            jn0Var.q(0, jn0Var.f25416c.f25770r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof gn0) {
                        org.telegram.ui.Cells.l7 l7Var = ((gn0) view).f24599a;
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
                                    PhotoViewer.t1().J2(null, n2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().J2(null, n2Var, null);
                                    PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, kn0Var.F, n2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!l7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            l7Var.f(true);
                            DownloadController.getInstance(this.f23726b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            l7Var.f(true);
                        }
                        kn0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.wp0 wp0Var2 = (org.telegram.ui.wp0) this.f23727c;
                org.telegram.ui.cq0 cq0Var = wp0Var2.f39235p0;
                ArrayList arrayList2 = wp0Var2.f39231l0;
                if (view instanceof org.telegram.ui.vp0) {
                    org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) view;
                    int i15 = wp0Var2.m0;
                    if (wp0Var2.f39234o0 == null) {
                        n5 n5Var = vp0Var.f38608c;
                        org.telegram.ui.a71[] a71VarArr = new org.telegram.ui.a71[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (n5Var != null) {
                            n5Var.f();
                            vp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(n5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(vp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = wp0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.f6 resourceProvider = cq0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.sp0 sp0Var = new org.telegram.ui.sp0(wp0Var2, cq0Var, context, valueOf2, i13, resourceProvider, i14, vp0Var.a(), vp0Var, a71VarArr);
                        sp0Var.f34816g1 = true;
                        long j10 = wp0Var2.f39232n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        sp0Var.setSelected(valueOf);
                        sp0Var.setSaveState(3);
                        sp0Var.y(n5Var, vp0Var);
                        org.telegram.ui.tp0 tp0Var = new org.telegram.ui.tp0(wp0Var2, sp0Var);
                        wp0Var2.f39234o0 = tp0Var;
                        a71VarArr[0] = tp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        tp0Var.showAsDropDown(vp0Var, 0, i11, i16 | 48);
                        a71VarArr[0].b();
                    }
                    return;
                }
                int i17 = wp0Var2.V;
                int i18 = this.f23726b;
                if (i10 == i17) {
                    wp0Var2.h = -1;
                    wp0Var2.f39232n = 0L;
                    wp0Var2.f39236r = null;
                    wp0Var2.f39237s = null;
                    wp0Var2.I = null;
                    wp0Var2.i();
                    if (i18 == 0) {
                        cq0Var.h.i();
                    }
                    org.telegram.ui.vp0 vp0Var2 = wp0Var2.f39240y;
                    if (vp0Var2 != null) {
                        vp0Var2.b(true);
                    }
                    wp0Var2.j(true);
                    wp0Var2.f(true);
                    org.telegram.ui.wp0 wp0Var3 = cq0Var.f32844n;
                    if (wp0Var3 != null && (aq0Var = wp0Var3.f39216a) != null && (wp0Var = cq0Var.h) != null) {
                        aq0Var.a(wp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = wp0Var2.f39219b0;
                if (i10 >= i19 && i10 < wp0Var2.f39221c0) {
                    int i20 = i10 - i19;
                    if (wp0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    wp0Var2.f39232n = 0L;
                                    wp0Var2.h = -1;
                                    wp0Var2.I = null;
                                    wp0Var2.f39236r = null;
                                    wp0Var2.f39237s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                wp0Var2.f39232n = 0L;
                                wp0Var2.h = -1;
                                wp0Var2.I = null;
                                wp0Var2.f39236r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                wp0Var2.f39237s = null;
                            }
                            wp0Var2.j(true);
                            wp0Var2.i();
                            wp0Var2.f(true);
                            org.telegram.ui.vp0 vp0Var3 = wp0Var2.f39240y;
                            if (vp0Var3 != null) {
                                vp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (wp0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                wp0Var2.f39232n = 0L;
                                wp0Var2.h = -1;
                                wp0Var2.f39236r = null;
                                wp0Var2.f39237s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            wp0Var2.f39232n = 0L;
                            wp0Var2.h = -1;
                            wp0Var2.f39236r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            wp0Var2.f39237s = null;
                        }
                        wp0Var2.I = tL_starGiftUnique2;
                        wp0Var2.j(true);
                        wp0Var2.i();
                        wp0Var2.f(true);
                        org.telegram.ui.vp0 vp0Var4 = wp0Var2.f39240y;
                        if (vp0Var4 != null) {
                            vp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.f23727c;
                boolean z12 = view instanceof org.telegram.ui.s61;
                int i21 = this.f23726b;
                try {
                    if (z12) {
                        org.telegram.ui.s61 s61Var = (org.telegram.ui.s61) view;
                        if (!s61Var.f37334s && (((p0Var = s61Var.f37336x) == null || !p0Var.f49444a) && i21 != 13 && i21 != 14)) {
                            if (s61Var.Q && (document = s61Var.d) != null) {
                                if (j71Var.W == 6) {
                                    j71Var.p(s61Var, Long.valueOf(document.f18349id), document, s61Var.v, null);
                                } else {
                                    j71Var.p(s61Var, null, document, s61Var.v, null);
                                }
                            } else {
                                j71Var.o(s61Var, s61Var.e);
                            }
                        } else {
                            j71Var.l();
                            j71Var.r(s61Var, s61Var.f37336x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            j71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        j71Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            j71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.n61) {
                        j71Var.i(i10, (org.telegram.ui.n61) view);
                        if (i21 != 1 && i21 != 11) {
                            j71Var.performHapticFeedback(3, 1);
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
