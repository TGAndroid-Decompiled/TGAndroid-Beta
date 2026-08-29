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
public final class nm0 implements zk0 {
    public final int f31095a;
    public final int f31096b;
    public final FrameLayout f31097c;

    public nm0(FrameLayout frameLayout, int i10, int i11) {
        this.f31095a = i11;
        this.f31097c = frameLayout;
        this.f31096b = i10;
    }

    @Override
    public final void c(int i10, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.xo0 xo0Var;
        org.telegram.ui.to0 to0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        kg.q0 q0Var;
        TLRPC.Document document;
        switch (this.f31095a) {
            case 0:
                tm0 tm0Var = (tm0) this.f31097c;
                org.telegram.ui.ActionBar.o2 o2Var = tm0Var.C;
                sm0 sm0Var = tm0Var.f32979c;
                MessageObject E = sm0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (tm0Var.E.f()) {
                        tm0Var.E.d(E, view, 0);
                        org.telegram.ui.z00 z00Var = tm0Var.F;
                        int id2 = E.getId();
                        z00Var.f45005a = E.getDialogId();
                        z00Var.f45006b = id2;
                        sm0Var.m(i10);
                        if (!tm0Var.E.f()) {
                            sm0Var.q(0, sm0Var.f32690c.f32983r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof pm0) {
                        org.telegram.ui.Cells.g7 g7Var = ((pm0) view).f31712a;
                        MessageObject message = g7Var.getMessage();
                        TLRPC.Document document2 = message.getDocument();
                        if (g7Var.C) {
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
                                AndroidUtilities.openDocument(message, tm0Var.B, o2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!g7Var.B) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            g7Var.f(true);
                            DownloadController.getInstance(this.f31096b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            g7Var.f(true);
                        }
                        tm0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.to0 to0Var2 = (org.telegram.ui.to0) this.f31097c;
                org.telegram.ui.yo0 yo0Var = to0Var2.f43077f0;
                ArrayList arrayList2 = to0Var2.f43070b0;
                if (view instanceof org.telegram.ui.so0) {
                    org.telegram.ui.so0 so0Var = (org.telegram.ui.so0) view;
                    int i15 = to0Var2.f43072c0;
                    if (to0Var2.f43075e0 == null) {
                        n5 n5Var = so0Var.f42439c;
                        org.telegram.ui.u51[] u51VarArr = new org.telegram.ui.u51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (n5Var != null) {
                            n5Var.f();
                            so0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(n5Var.getBounds());
                            if (i15 == 1) {
                                i12 = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                i12 = (-(so0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i11 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = to0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i11);
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.c6 resourceProvider = yo0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.po0 po0Var = new org.telegram.ui.po0(to0Var2, yo0Var, context, valueOf2, i13, resourceProvider, i14, so0Var.a(), so0Var, u51VarArr);
                        po0Var.f37325c1 = true;
                        long j11 = to0Var2.f43079r;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        po0Var.setSelected(valueOf);
                        int i16 = 3;
                        po0Var.setSaveState(3);
                        po0Var.y(n5Var, so0Var);
                        org.telegram.ui.qo0 qo0Var = new org.telegram.ui.qo0(to0Var2, po0Var);
                        to0Var2.f43075e0 = qo0Var;
                        u51VarArr[0] = qo0Var;
                        if (!LocaleController.isRTL) {
                            i16 = 5;
                        }
                        qo0Var.showAsDropDown(so0Var, 0, i12, i16 | 48);
                        u51VarArr[0].b();
                    }
                    return;
                }
                int i17 = to0Var2.M;
                int i18 = this.f31096b;
                if (i10 == i17) {
                    to0Var2.f43078n = -1;
                    to0Var2.f43079r = 0L;
                    to0Var2.f43080s = null;
                    to0Var2.v = null;
                    to0Var2.f43083y = null;
                    to0Var2.h();
                    if (i18 == 0) {
                        yo0Var.f44945f.h();
                    }
                    org.telegram.ui.so0 so0Var2 = to0Var2.f43082x;
                    if (so0Var2 != null) {
                        so0Var2.b(true);
                    }
                    to0Var2.i(true);
                    to0Var2.f();
                    org.telegram.ui.to0 to0Var3 = yo0Var.h;
                    if (to0Var3 != null && (xo0Var = to0Var3.f43067a) != null && (to0Var = yo0Var.f44945f) != null) {
                        xo0Var.a(to0Var.f43078n);
                        return;
                    }
                    return;
                }
                int i19 = to0Var2.P;
                if (i10 >= i19 && i10 < to0Var2.Q) {
                    int i20 = i10 - i19;
                    if (to0Var2.B == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    to0Var2.f43079r = 0L;
                                    to0Var2.f43078n = -1;
                                    to0Var2.f43083y = null;
                                    to0Var2.f43080s = null;
                                    to0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                to0Var2.f43079r = 0L;
                                to0Var2.f43078n = -1;
                                to0Var2.f43083y = null;
                                to0Var2.f43080s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                to0Var2.v = null;
                            }
                            to0Var2.i(true);
                            to0Var2.h();
                            to0Var2.f();
                            org.telegram.ui.so0 so0Var3 = to0Var2.f43082x;
                            if (so0Var3 != null) {
                                so0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (to0Var2.A != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                to0Var2.f43079r = 0L;
                                to0Var2.f43078n = -1;
                                to0Var2.f43080s = null;
                                to0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            to0Var2.f43079r = 0L;
                            to0Var2.f43078n = -1;
                            to0Var2.f43080s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            to0Var2.v = null;
                        }
                        to0Var2.f43083y = tL_starGiftUnique2;
                        to0Var2.i(true);
                        to0Var2.h();
                        to0Var2.f();
                        org.telegram.ui.so0 so0Var4 = to0Var2.f43082x;
                        if (so0Var4 != null) {
                            so0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.d61 d61Var = (org.telegram.ui.d61) this.f31097c;
                boolean z12 = view instanceof org.telegram.ui.m51;
                int i21 = this.f31096b;
                try {
                    if (z12) {
                        org.telegram.ui.m51 m51Var = (org.telegram.ui.m51) view;
                        if (!m51Var.f40433s && (((q0Var = m51Var.f40435x) == null || !q0Var.f13821a) && i21 != 13 && i21 != 14)) {
                            if (m51Var.M && (document = m51Var.d) != null) {
                                if (d61Var.S == 6) {
                                    d61Var.p(m51Var, Long.valueOf(document.f22398id), document, m51Var.v, null);
                                } else {
                                    d61Var.p(m51Var, null, document, m51Var.v, null);
                                }
                            } else {
                                d61Var.o(m51Var, m51Var.f40429e);
                            }
                        } else {
                            d61Var.l();
                            d61Var.r(m51Var, m51Var.f40435x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            d61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        d61Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            d61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.h51) {
                        d61Var.i(i10, (org.telegram.ui.h51) view);
                        if (i21 != 1 && i21 != 11) {
                            d61Var.performHapticFeedback(3, 1);
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
