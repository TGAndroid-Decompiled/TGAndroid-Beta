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
public final class qm0 implements al0 {
    public final int f27353a;
    public final int f27354b;
    public final FrameLayout f27355c;

    public qm0(FrameLayout frameLayout, int i10, int i11) {
        this.f27353a = i11;
        this.f27355c = frameLayout;
        this.f27354b = i10;
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
        switch (this.f27353a) {
            case 0:
                wm0 wm0Var = (wm0) this.f27355c;
                org.telegram.ui.ActionBar.o2 o2Var = wm0Var.G;
                vm0 vm0Var = wm0Var.f29696c;
                MessageObject E = vm0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (wm0Var.I.g()) {
                        wm0Var.I.e(E, view, 0);
                        org.telegram.ui.r10 r10Var = wm0Var.J;
                        int id2 = E.getId();
                        r10Var.f37062a = E.getDialogId();
                        r10Var.f37063b = id2;
                        vm0Var.m(i10);
                        if (!wm0Var.I.g()) {
                            vm0Var.q(0, vm0Var.f28828c.f29699r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof sm0) {
                        org.telegram.ui.Cells.j7 j7Var = ((sm0) view).f27887a;
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
                                    PhotoViewer.t1().K2(null, o2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, o2Var, null);
                                    PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, wm0Var.F, o2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!j7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            j7Var.f(true);
                            DownloadController.getInstance(this.f27354b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            j7Var.f(true);
                        }
                        wm0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.wp0 wp0Var2 = (org.telegram.ui.wp0) this.f27355c;
                org.telegram.ui.cq0 cq0Var = wp0Var2.f39147p0;
                ArrayList arrayList2 = wp0Var2.f39143l0;
                if (view instanceof org.telegram.ui.vp0) {
                    org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) view;
                    int i15 = wp0Var2.m0;
                    if (wp0Var2.f39146o0 == null) {
                        m5 m5Var = vp0Var.f38487c;
                        org.telegram.ui.z61[] z61VarArr = new org.telegram.ui.z61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (m5Var != null) {
                            m5Var.f();
                            vp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(m5Var.getBounds());
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
                        org.telegram.ui.sp0 sp0Var = new org.telegram.ui.sp0(wp0Var2, cq0Var, context, valueOf2, i13, resourceProvider, i14, vp0Var.a(), vp0Var, z61VarArr);
                        sp0Var.f34460g1 = true;
                        long j10 = wp0Var2.f39144n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        sp0Var.setSelected(valueOf);
                        sp0Var.setSaveState(3);
                        sp0Var.y(m5Var, vp0Var);
                        org.telegram.ui.tp0 tp0Var = new org.telegram.ui.tp0(wp0Var2, sp0Var);
                        wp0Var2.f39146o0 = tp0Var;
                        z61VarArr[0] = tp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        tp0Var.showAsDropDown(vp0Var, 0, i11, i16 | 48);
                        z61VarArr[0].b();
                    }
                    return;
                }
                int i17 = wp0Var2.V;
                int i18 = this.f27354b;
                if (i10 == i17) {
                    wp0Var2.h = -1;
                    wp0Var2.f39144n = 0L;
                    wp0Var2.f39148r = null;
                    wp0Var2.f39149s = null;
                    wp0Var2.I = null;
                    wp0Var2.i();
                    if (i18 == 0) {
                        cq0Var.h.i();
                    }
                    org.telegram.ui.vp0 vp0Var2 = wp0Var2.f39152y;
                    if (vp0Var2 != null) {
                        vp0Var2.b(true);
                    }
                    wp0Var2.j(true);
                    wp0Var2.f(true);
                    org.telegram.ui.wp0 wp0Var3 = cq0Var.f32862n;
                    if (wp0Var3 != null && (aq0Var = wp0Var3.f39128a) != null && (wp0Var = cq0Var.h) != null) {
                        aq0Var.a(wp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = wp0Var2.f39131b0;
                if (i10 >= i19 && i10 < wp0Var2.f39133c0) {
                    int i20 = i10 - i19;
                    if (wp0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    wp0Var2.f39144n = 0L;
                                    wp0Var2.h = -1;
                                    wp0Var2.I = null;
                                    wp0Var2.f39148r = null;
                                    wp0Var2.f39149s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                wp0Var2.f39144n = 0L;
                                wp0Var2.h = -1;
                                wp0Var2.I = null;
                                wp0Var2.f39148r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                wp0Var2.f39149s = null;
                            }
                            wp0Var2.j(true);
                            wp0Var2.i();
                            wp0Var2.f(true);
                            org.telegram.ui.vp0 vp0Var3 = wp0Var2.f39152y;
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
                                wp0Var2.f39144n = 0L;
                                wp0Var2.h = -1;
                                wp0Var2.f39148r = null;
                                wp0Var2.f39149s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            wp0Var2.f39144n = 0L;
                            wp0Var2.h = -1;
                            wp0Var2.f39148r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            wp0Var2.f39149s = null;
                        }
                        wp0Var2.I = tL_starGiftUnique2;
                        wp0Var2.j(true);
                        wp0Var2.i();
                        wp0Var2.f(true);
                        org.telegram.ui.vp0 vp0Var4 = wp0Var2.f39152y;
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
                org.telegram.ui.i71 i71Var = (org.telegram.ui.i71) this.f27355c;
                boolean z12 = view instanceof org.telegram.ui.r61;
                int i21 = this.f27354b;
                try {
                    if (z12) {
                        org.telegram.ui.r61 r61Var = (org.telegram.ui.r61) view;
                        if (!r61Var.f37099s && (((p0Var = r61Var.f37101x) == null || !p0Var.f49147a) && i21 != 13 && i21 != 14)) {
                            if (r61Var.Q && (document = r61Var.d) != null) {
                                if (i71Var.W == 6) {
                                    i71Var.p(r61Var, Long.valueOf(document.f18127id), document, r61Var.v, null);
                                } else {
                                    i71Var.p(r61Var, null, document, r61Var.v, null);
                                }
                            } else {
                                i71Var.o(r61Var, r61Var.e);
                            }
                        } else {
                            i71Var.l();
                            i71Var.r(r61Var, r61Var.f37101x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            i71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        i71Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            i71Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.m61) {
                        i71Var.i(i10, (org.telegram.ui.m61) view);
                        if (i21 != 1 && i21 != 11) {
                            i71Var.performHapticFeedback(3, 1);
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
