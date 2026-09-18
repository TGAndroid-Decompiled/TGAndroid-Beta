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
public final class cn0 implements kl0 {
    public final int f23297a;
    public final int f23298b;
    public final FrameLayout f23299c;

    public cn0(FrameLayout frameLayout, int i10, int i11) {
        this.f23297a = i11;
        this.f23299c = frameLayout;
        this.f23298b = i10;
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
        zg.o0 o0Var;
        TLRPC.Document document;
        switch (this.f23297a) {
            case 0:
                jn0 jn0Var = (jn0) this.f23299c;
                org.telegram.ui.ActionBar.n2 n2Var = jn0Var.G;
                in0 in0Var = jn0Var.f25381c;
                MessageObject E = in0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (jn0Var.I.g()) {
                        jn0Var.I.e(E, view, 0);
                        org.telegram.ui.p10 p10Var = jn0Var.J;
                        int id2 = E.getId();
                        p10Var.f36295a = E.getDialogId();
                        p10Var.f36296b = id2;
                        in0Var.m(i10);
                        if (!jn0Var.I.g()) {
                            in0Var.q(0, in0Var.f25020c.f25384r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof fn0) {
                        org.telegram.ui.Cells.k7 k7Var = ((fn0) view).f24191a;
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
                                    PhotoViewer.t1().J2(null, n2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().J2(null, n2Var, null);
                                    PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, jn0Var.F, n2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!k7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            k7Var.f(true);
                            DownloadController.getInstance(this.f23298b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            k7Var.f(true);
                        }
                        jn0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.wp0 wp0Var2 = (org.telegram.ui.wp0) this.f23299c;
                org.telegram.ui.cq0 cq0Var = wp0Var2.f39221p0;
                ArrayList arrayList2 = wp0Var2.f39217l0;
                if (view instanceof org.telegram.ui.vp0) {
                    org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) view;
                    int i15 = wp0Var2.m0;
                    if (wp0Var2.f39220o0 == null) {
                        o5 o5Var = vp0Var.f38607c;
                        org.telegram.ui.x61[] x61VarArr = new org.telegram.ui.x61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (o5Var != null) {
                            o5Var.f();
                            vp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(o5Var.getBounds());
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
                        org.telegram.ui.ActionBar.e6 resourceProvider = cq0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.sp0 sp0Var = new org.telegram.ui.sp0(wp0Var2, cq0Var, context, valueOf2, i13, resourceProvider, i14, vp0Var.a(), vp0Var, x61VarArr);
                        sp0Var.f33727g1 = true;
                        long j10 = wp0Var2.f39218n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        sp0Var.setSelected(valueOf);
                        sp0Var.setSaveState(3);
                        sp0Var.y(o5Var, vp0Var);
                        org.telegram.ui.tp0 tp0Var = new org.telegram.ui.tp0(wp0Var2, sp0Var);
                        wp0Var2.f39220o0 = tp0Var;
                        x61VarArr[0] = tp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        tp0Var.showAsDropDown(vp0Var, 0, i11, i16 | 48);
                        x61VarArr[0].b();
                    }
                    return;
                }
                int i17 = wp0Var2.V;
                int i18 = this.f23298b;
                if (i10 == i17) {
                    wp0Var2.h = -1;
                    wp0Var2.f39218n = 0L;
                    wp0Var2.f39222r = null;
                    wp0Var2.f39223s = null;
                    wp0Var2.I = null;
                    wp0Var2.i();
                    if (i18 == 0) {
                        cq0Var.h.i();
                    }
                    org.telegram.ui.vp0 vp0Var2 = wp0Var2.f39226y;
                    if (vp0Var2 != null) {
                        vp0Var2.b(true);
                    }
                    wp0Var2.j(true);
                    wp0Var2.f(true);
                    org.telegram.ui.wp0 wp0Var3 = cq0Var.f32751n;
                    if (wp0Var3 != null && (aq0Var = wp0Var3.f39202a) != null && (wp0Var = cq0Var.h) != null) {
                        aq0Var.a(wp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = wp0Var2.f39205b0;
                if (i10 >= i19 && i10 < wp0Var2.f39207c0) {
                    int i20 = i10 - i19;
                    if (wp0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    wp0Var2.f39218n = 0L;
                                    wp0Var2.h = -1;
                                    wp0Var2.I = null;
                                    wp0Var2.f39222r = null;
                                    wp0Var2.f39223s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                wp0Var2.f39218n = 0L;
                                wp0Var2.h = -1;
                                wp0Var2.I = null;
                                wp0Var2.f39222r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                wp0Var2.f39223s = null;
                            }
                            wp0Var2.j(true);
                            wp0Var2.i();
                            wp0Var2.f(true);
                            org.telegram.ui.vp0 vp0Var3 = wp0Var2.f39226y;
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
                                wp0Var2.f39218n = 0L;
                                wp0Var2.h = -1;
                                wp0Var2.f39222r = null;
                                wp0Var2.f39223s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            wp0Var2.f39218n = 0L;
                            wp0Var2.h = -1;
                            wp0Var2.f39222r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            wp0Var2.f39223s = null;
                        }
                        wp0Var2.I = tL_starGiftUnique2;
                        wp0Var2.j(true);
                        wp0Var2.i();
                        wp0Var2.f(true);
                        org.telegram.ui.vp0 vp0Var4 = wp0Var2.f39226y;
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
                org.telegram.ui.g71 g71Var = (org.telegram.ui.g71) this.f23299c;
                boolean z12 = view instanceof org.telegram.ui.p61;
                int i21 = this.f23298b;
                try {
                    if (z12) {
                        org.telegram.ui.p61 p61Var = (org.telegram.ui.p61) view;
                        if (!p61Var.f36357s && (((o0Var = p61Var.f36359x) == null || !o0Var.f49374a) && i21 != 13 && i21 != 14)) {
                            if (p61Var.Q && (document = p61Var.d) != null) {
                                if (g71Var.W == 6) {
                                    g71Var.p(p61Var, Long.valueOf(document.f18302id), document, p61Var.v, null);
                                } else {
                                    g71Var.p(p61Var, null, document, p61Var.v, null);
                                }
                            } else {
                                g71Var.o(p61Var, p61Var.e);
                            }
                        } else {
                            g71Var.l();
                            g71Var.r(p61Var, p61Var.f36359x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            g71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        g71Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            g71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.k61) {
                        g71Var.i(i10, (org.telegram.ui.k61) view);
                        if (i21 != 1 && i21 != 11) {
                            g71Var.performHapticFeedback(3, 1);
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
