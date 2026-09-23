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
    public final int f27400a;
    public final int f27401b;
    public final FrameLayout f27402c;

    public qm0(FrameLayout frameLayout, int i10, int i11) {
        this.f27400a = i11;
        this.f27402c = frameLayout;
        this.f27401b = i10;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.sp0 sp0Var;
        org.telegram.ui.op0 op0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        zg.p0 p0Var;
        TLRPC.Document document;
        switch (this.f27400a) {
            case 0:
                wm0 wm0Var = (wm0) this.f27402c;
                org.telegram.ui.ActionBar.n2 n2Var = wm0Var.G;
                vm0 vm0Var = wm0Var.f29749c;
                MessageObject E = vm0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (wm0Var.I.g()) {
                        wm0Var.I.e(E, view, 0);
                        org.telegram.ui.m10 m10Var = wm0Var.J;
                        int id2 = E.getId();
                        m10Var.f35122a = E.getDialogId();
                        m10Var.f35123b = id2;
                        vm0Var.m(i10);
                        if (!wm0Var.I.g()) {
                            vm0Var.q(0, vm0Var.f28773c.f29752r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof sm0) {
                        org.telegram.ui.Cells.j7 j7Var = ((sm0) view).f27957a;
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
                                AndroidUtilities.openDocument(message, wm0Var.F, n2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!j7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            j7Var.f(true);
                            DownloadController.getInstance(this.f27401b).updateFilesLoadingPriority();
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
                org.telegram.ui.op0 op0Var2 = (org.telegram.ui.op0) this.f27402c;
                org.telegram.ui.up0 up0Var = op0Var2.f35938p0;
                ArrayList arrayList2 = op0Var2.f35934l0;
                if (view instanceof org.telegram.ui.np0) {
                    org.telegram.ui.np0 np0Var = (org.telegram.ui.np0) view;
                    int i15 = op0Var2.m0;
                    if (op0Var2.f35937o0 == null) {
                        o5 o5Var = np0Var.f35576c;
                        org.telegram.ui.q61[] q61VarArr = new org.telegram.ui.q61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (o5Var != null) {
                            o5Var.f();
                            np0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(o5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(np0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = op0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.d6 resourceProvider = up0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.kp0 kp0Var = new org.telegram.ui.kp0(op0Var2, up0Var, context, valueOf2, i13, resourceProvider, i14, np0Var.a(), np0Var, q61VarArr);
                        kp0Var.f40020g1 = true;
                        long j10 = op0Var2.f35935n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        kp0Var.setSelected(valueOf);
                        kp0Var.setSaveState(3);
                        kp0Var.y(o5Var, np0Var);
                        org.telegram.ui.lp0 lp0Var = new org.telegram.ui.lp0(op0Var2, kp0Var);
                        op0Var2.f35937o0 = lp0Var;
                        q61VarArr[0] = lp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        lp0Var.showAsDropDown(np0Var, 0, i11, i16 | 48);
                        q61VarArr[0].b();
                    }
                    return;
                }
                int i17 = op0Var2.V;
                int i18 = this.f27401b;
                if (i10 == i17) {
                    op0Var2.h = -1;
                    op0Var2.f35935n = 0L;
                    op0Var2.f35939r = null;
                    op0Var2.f35940s = null;
                    op0Var2.I = null;
                    op0Var2.i();
                    if (i18 == 0) {
                        up0Var.h.i();
                    }
                    org.telegram.ui.np0 np0Var2 = op0Var2.f35943y;
                    if (np0Var2 != null) {
                        np0Var2.b(true);
                    }
                    op0Var2.j(true);
                    op0Var2.f(true);
                    org.telegram.ui.op0 op0Var3 = up0Var.f38158n;
                    if (op0Var3 != null && (sp0Var = op0Var3.f35919a) != null && (op0Var = up0Var.h) != null) {
                        sp0Var.a(op0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = op0Var2.f35922b0;
                if (i10 >= i19 && i10 < op0Var2.f35924c0) {
                    int i20 = i10 - i19;
                    if (op0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    op0Var2.f35935n = 0L;
                                    op0Var2.h = -1;
                                    op0Var2.I = null;
                                    op0Var2.f35939r = null;
                                    op0Var2.f35940s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                op0Var2.f35935n = 0L;
                                op0Var2.h = -1;
                                op0Var2.I = null;
                                op0Var2.f35939r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                op0Var2.f35940s = null;
                            }
                            op0Var2.j(true);
                            op0Var2.i();
                            op0Var2.f(true);
                            org.telegram.ui.np0 np0Var3 = op0Var2.f35943y;
                            if (np0Var3 != null) {
                                np0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (op0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                op0Var2.f35935n = 0L;
                                op0Var2.h = -1;
                                op0Var2.f35939r = null;
                                op0Var2.f35940s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            op0Var2.f35935n = 0L;
                            op0Var2.h = -1;
                            op0Var2.f35939r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            op0Var2.f35940s = null;
                        }
                        op0Var2.I = tL_starGiftUnique2;
                        op0Var2.j(true);
                        op0Var2.i();
                        op0Var2.f(true);
                        org.telegram.ui.np0 np0Var4 = op0Var2.f35943y;
                        if (np0Var4 != null) {
                            np0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.z61 z61Var = (org.telegram.ui.z61) this.f27402c;
                boolean z12 = view instanceof org.telegram.ui.i61;
                int i21 = this.f27401b;
                try {
                    if (z12) {
                        org.telegram.ui.i61 i61Var = (org.telegram.ui.i61) view;
                        if (!i61Var.f34039s && (((p0Var = i61Var.f34041x) == null || !p0Var.f49068a) && i21 != 13 && i21 != 14)) {
                            if (i61Var.Q && (document = i61Var.d) != null) {
                                if (z61Var.W == 6) {
                                    z61Var.p(i61Var, Long.valueOf(document.f18089id), document, i61Var.v, null);
                                } else {
                                    z61Var.p(i61Var, null, document, i61Var.v, null);
                                }
                            } else {
                                z61Var.o(i61Var, i61Var.e);
                            }
                        } else {
                            z61Var.l();
                            z61Var.r(i61Var, i61Var.f34041x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            z61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        z61Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            z61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.d61) {
                        z61Var.i(i10, (org.telegram.ui.d61) view);
                        if (i21 != 1 && i21 != 11) {
                            z61Var.performHapticFeedback(3, 1);
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
