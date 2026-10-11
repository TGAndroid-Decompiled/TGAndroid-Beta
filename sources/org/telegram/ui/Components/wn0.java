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
public final class wn0 implements fm0 {
    public final int f32746a;
    public final int f32747b;
    public final FrameLayout f32748c;

    public wn0(FrameLayout frameLayout, int i10, int i11) {
        this.f32746a = i11;
        this.f32748c = frameLayout;
        this.f32747b = i10;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.xp0 xp0Var;
        org.telegram.ui.tp0 tp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        zg.n0 n0Var;
        TLRPC.Document document;
        switch (this.f32746a) {
            case 0:
                co0 co0Var = (co0) this.f32748c;
                org.telegram.ui.ActionBar.m2 m2Var = co0Var.G;
                bo0 bo0Var = co0Var.f25405c;
                MessageObject E = bo0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (co0Var.I.g()) {
                        co0Var.I.e(E, view, 0);
                        org.telegram.ui.n10 n10Var = co0Var.J;
                        int id2 = E.getId();
                        n10Var.f40144a = E.getDialogId();
                        n10Var.f40145b = id2;
                        bo0Var.m(i10);
                        if (!co0Var.I.g()) {
                            bo0Var.q(0, bo0Var.f25052c.f25409r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof yn0) {
                        org.telegram.ui.Cells.k7 k7Var = ((yn0) view).f33438a;
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
                                    PhotoViewer.t1().K2(null, m2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, m2Var, null);
                                    PhotoViewer.t1().b2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, co0Var.F, m2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!k7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            k7Var.f(true);
                            DownloadController.getInstance(this.f32747b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            k7Var.f(true);
                        }
                        co0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.tp0 tp0Var2 = (org.telegram.ui.tp0) this.f32748c;
                org.telegram.ui.zp0 zp0Var = tp0Var2.f42275p0;
                ArrayList arrayList2 = tp0Var2.f42271l0;
                if (view instanceof org.telegram.ui.sp0) {
                    org.telegram.ui.sp0 sp0Var = (org.telegram.ui.sp0) view;
                    int i15 = tp0Var2.m0;
                    if (tp0Var2.f42274o0 == null) {
                        q5 q5Var = sp0Var.f41810c;
                        org.telegram.ui.a71[] a71VarArr = new org.telegram.ui.a71[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (q5Var != null) {
                            q5Var.f();
                            sp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(q5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(sp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = tp0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.d6 resourceProvider = zp0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.pp0 pp0Var = new org.telegram.ui.pp0(tp0Var2, zp0Var, context, valueOf2, i13, resourceProvider, i14, sp0Var.a(), sp0Var, a71VarArr);
                        pp0Var.f38927g1 = true;
                        long j10 = tp0Var2.f42272n;
                        if (j10 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j10);
                        }
                        pp0Var.setSelected(valueOf);
                        pp0Var.setSaveState(3);
                        pp0Var.y(q5Var, sp0Var);
                        org.telegram.ui.qp0 qp0Var = new org.telegram.ui.qp0(tp0Var2, pp0Var);
                        tp0Var2.f42274o0 = qp0Var;
                        a71VarArr[0] = qp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        qp0Var.showAsDropDown(sp0Var, 0, i11, i16 | 48);
                        a71VarArr[0].b();
                    }
                    return;
                }
                int i17 = tp0Var2.V;
                int i18 = this.f32747b;
                if (i10 == i17) {
                    tp0Var2.h = -1;
                    tp0Var2.f42272n = 0L;
                    tp0Var2.f42276r = null;
                    tp0Var2.f42277s = null;
                    tp0Var2.I = null;
                    tp0Var2.i();
                    if (i18 == 0) {
                        zp0Var.h.i();
                    }
                    org.telegram.ui.sp0 sp0Var2 = tp0Var2.f42280y;
                    if (sp0Var2 != null) {
                        sp0Var2.b(true);
                    }
                    tp0Var2.j(true);
                    tp0Var2.f(true);
                    org.telegram.ui.tp0 tp0Var3 = zp0Var.f45086n;
                    if (tp0Var3 != null && (xp0Var = tp0Var3.f42255a) != null && (tp0Var = zp0Var.h) != null) {
                        xp0Var.a(tp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = tp0Var2.f42258b0;
                if (i10 >= i19 && i10 < tp0Var2.f42260c0) {
                    int i20 = i10 - i19;
                    if (tp0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    tp0Var2.f42272n = 0L;
                                    tp0Var2.h = -1;
                                    tp0Var2.I = null;
                                    tp0Var2.f42276r = null;
                                    tp0Var2.f42277s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                tp0Var2.f42272n = 0L;
                                tp0Var2.h = -1;
                                tp0Var2.I = null;
                                tp0Var2.f42276r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                tp0Var2.f42277s = null;
                            }
                            tp0Var2.j(true);
                            tp0Var2.i();
                            tp0Var2.f(true);
                            org.telegram.ui.sp0 sp0Var3 = tp0Var2.f42280y;
                            if (sp0Var3 != null) {
                                sp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (tp0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                tp0Var2.f42272n = 0L;
                                tp0Var2.h = -1;
                                tp0Var2.f42276r = null;
                                tp0Var2.f42277s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            tp0Var2.f42272n = 0L;
                            tp0Var2.h = -1;
                            tp0Var2.f42276r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            tp0Var2.f42277s = null;
                        }
                        tp0Var2.I = tL_starGiftUnique2;
                        tp0Var2.j(true);
                        tp0Var2.i();
                        tp0Var2.f(true);
                        org.telegram.ui.sp0 sp0Var4 = tp0Var2.f42280y;
                        if (sp0Var4 != null) {
                            sp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.f32748c;
                boolean z12 = view instanceof org.telegram.ui.s61;
                int i21 = this.f32747b;
                try {
                    if (z12) {
                        org.telegram.ui.s61 s61Var = (org.telegram.ui.s61) view;
                        if (!s61Var.f41641s && (((n0Var = s61Var.f41643x) == null || !n0Var.f54734a) && i21 != 13 && i21 != 14)) {
                            if (s61Var.Q && (document = s61Var.d) != null) {
                                if (j71Var.W == 6) {
                                    j71Var.p(s61Var, Long.valueOf(document.f20074id), document, s61Var.v, null);
                                } else {
                                    j71Var.p(s61Var, null, document, s61Var.v, null);
                                }
                            } else {
                                j71Var.o(s61Var, s61Var.f41637e);
                            }
                        } else {
                            j71Var.l();
                            j71Var.r(s61Var, s61Var.f41643x);
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
