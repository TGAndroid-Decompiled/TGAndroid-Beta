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
    public final int f29437a;
    public final int f29438b;
    public final FrameLayout f29439c;

    public pm0(FrameLayout frameLayout, int i10, int i11) {
        this.f29437a = i11;
        this.f29439c = frameLayout;
        this.f29438b = i10;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.zp0 zp0Var;
        org.telegram.ui.vp0 vp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        ah.j1 j1Var;
        TLRPC.Document document;
        switch (this.f29437a) {
            case 0:
                vm0 vm0Var = (vm0) this.f29439c;
                org.telegram.ui.ActionBar.n2 n2Var = vm0Var.G;
                um0 um0Var = vm0Var.f31365c;
                MessageObject E = um0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (vm0Var.I.g()) {
                        vm0Var.I.d(E, view, 0);
                        org.telegram.ui.p10 p10Var = vm0Var.J;
                        int id2 = E.getId();
                        p10Var.f39381a = E.getDialogId();
                        p10Var.f39382b = id2;
                        um0Var.m(i10);
                        if (!vm0Var.I.g()) {
                            um0Var.q(0, um0Var.f30924c.f31369r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof rm0) {
                        org.telegram.ui.Cells.j7 j7Var = ((rm0) view).f30052a;
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
                                    PhotoViewer.t1().K2(null, n2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, n2Var, null);
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
                            DownloadController.getInstance(this.f29438b).updateFilesLoadingPriority();
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
                org.telegram.ui.vp0 vp0Var2 = (org.telegram.ui.vp0) this.f29439c;
                org.telegram.ui.bq0 bq0Var = vp0Var2.f41619p0;
                ArrayList arrayList2 = vp0Var2.f41615l0;
                if (view instanceof org.telegram.ui.up0) {
                    org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) view;
                    int i15 = vp0Var2.m0;
                    if (vp0Var2.f41618o0 == null) {
                        o5 o5Var = up0Var.f41198c;
                        org.telegram.ui.a71[] a71VarArr = new org.telegram.ui.a71[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (o5Var != null) {
                            o5Var.f();
                            up0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(o5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(up0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = vp0Var2.getContext();
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
                        org.telegram.ui.rp0 rp0Var = new org.telegram.ui.rp0(vp0Var2, bq0Var, context, valueOf2, i13, resourceProvider, i14, up0Var.a(), up0Var, a71VarArr);
                        rp0Var.f37645g1 = true;
                        long j10 = vp0Var2.f41616n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        rp0Var.setSelected(valueOf);
                        rp0Var.setSaveState(3);
                        rp0Var.y(o5Var, up0Var);
                        org.telegram.ui.sp0 sp0Var = new org.telegram.ui.sp0(vp0Var2, rp0Var);
                        vp0Var2.f41618o0 = sp0Var;
                        a71VarArr[0] = sp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        sp0Var.showAsDropDown(up0Var, 0, i11, i16 | 48);
                        a71VarArr[0].b();
                    }
                    return;
                }
                int i17 = vp0Var2.V;
                int i18 = this.f29438b;
                if (i10 == i17) {
                    vp0Var2.h = -1;
                    vp0Var2.f41616n = 0L;
                    vp0Var2.f41620r = null;
                    vp0Var2.f41621s = null;
                    vp0Var2.I = null;
                    vp0Var2.i();
                    if (i18 == 0) {
                        bq0Var.h.i();
                    }
                    org.telegram.ui.up0 up0Var2 = vp0Var2.f41624y;
                    if (up0Var2 != null) {
                        up0Var2.b(true);
                    }
                    vp0Var2.j(true);
                    vp0Var2.f(true);
                    org.telegram.ui.vp0 vp0Var3 = bq0Var.f34873n;
                    if (vp0Var3 != null && (zp0Var = vp0Var3.f41599a) != null && (vp0Var = bq0Var.h) != null) {
                        zp0Var.a(vp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = vp0Var2.f41602b0;
                if (i10 >= i19 && i10 < vp0Var2.f41604c0) {
                    int i20 = i10 - i19;
                    if (vp0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    vp0Var2.f41616n = 0L;
                                    vp0Var2.h = -1;
                                    vp0Var2.I = null;
                                    vp0Var2.f41620r = null;
                                    vp0Var2.f41621s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                vp0Var2.f41616n = 0L;
                                vp0Var2.h = -1;
                                vp0Var2.I = null;
                                vp0Var2.f41620r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                vp0Var2.f41621s = null;
                            }
                            vp0Var2.j(true);
                            vp0Var2.i();
                            vp0Var2.f(true);
                            org.telegram.ui.up0 up0Var3 = vp0Var2.f41624y;
                            if (up0Var3 != null) {
                                up0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (vp0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                vp0Var2.f41616n = 0L;
                                vp0Var2.h = -1;
                                vp0Var2.f41620r = null;
                                vp0Var2.f41621s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            vp0Var2.f41616n = 0L;
                            vp0Var2.h = -1;
                            vp0Var2.f41620r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            vp0Var2.f41621s = null;
                        }
                        vp0Var2.I = tL_starGiftUnique2;
                        vp0Var2.j(true);
                        vp0Var2.i();
                        vp0Var2.f(true);
                        org.telegram.ui.up0 up0Var4 = vp0Var2.f41624y;
                        if (up0Var4 != null) {
                            up0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.f29439c;
                boolean z12 = view instanceof org.telegram.ui.s61;
                int i21 = this.f29438b;
                try {
                    if (z12) {
                        org.telegram.ui.s61 s61Var = (org.telegram.ui.s61) view;
                        if (!s61Var.f40322s && (((j1Var = s61Var.f40324x) == null || !j1Var.f593a) && i21 != 13 && i21 != 14)) {
                            if (s61Var.Q && (document = s61Var.d) != null) {
                                if (j71Var.W == 6) {
                                    j71Var.p(s61Var, Long.valueOf(document.f19875id), document, s61Var.v, null);
                                } else {
                                    j71Var.p(s61Var, null, document, s61Var.v, null);
                                }
                            } else {
                                j71Var.o(s61Var, s61Var.f40318e);
                            }
                        } else {
                            j71Var.l();
                            j71Var.r(s61Var, s61Var.f40324x);
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
