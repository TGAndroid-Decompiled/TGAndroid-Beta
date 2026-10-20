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
public final class on0 implements xl0 {
    public final int f29081a;
    public final int f29082b;
    public final FrameLayout f29083c;

    public on0(FrameLayout frameLayout, int i10, int i11) {
        this.f29081a = i11;
        this.f29083c = frameLayout;
        this.f29082b = i10;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.gp0 gp0Var;
        org.telegram.ui.cp0 cp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        ah.i1 i1Var;
        TLRPC.Document document;
        switch (this.f29081a) {
            case 0:
                un0 un0Var = (un0) this.f29083c;
                org.telegram.ui.ActionBar.n2 n2Var = un0Var.G;
                tn0 tn0Var = un0Var.f30977c;
                MessageObject E = tn0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (un0Var.I.g()) {
                        un0Var.I.d(E, view, 0);
                        org.telegram.ui.w00 w00Var = un0Var.J;
                        int id2 = E.getId();
                        w00Var.f42425a = E.getDialogId();
                        w00Var.f42426b = id2;
                        tn0Var.m(i10);
                        if (!un0Var.I.g()) {
                            tn0Var.q(0, tn0Var.f30626c.f30980r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof qn0) {
                        org.telegram.ui.Cells.i7 i7Var = ((qn0) view).f29681a;
                        MessageObject message = i7Var.getMessage();
                        TLRPC.Document document2 = message.getDocument();
                        if (i7Var.G) {
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
                                    PhotoViewer.u1().M2(null, n2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.u1().M2(null, n2Var, null);
                                    PhotoViewer.u1().d2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, un0Var.F, n2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!i7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            i7Var.f(true);
                            DownloadController.getInstance(this.f29082b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            i7Var.f(true);
                        }
                        un0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.cp0 cp0Var2 = (org.telegram.ui.cp0) this.f29083c;
                org.telegram.ui.ip0 ip0Var = cp0Var2.f36037p0;
                ArrayList arrayList2 = cp0Var2.f36033l0;
                if (view instanceof org.telegram.ui.bp0) {
                    org.telegram.ui.bp0 bp0Var = (org.telegram.ui.bp0) view;
                    int i15 = cp0Var2.m0;
                    if (cp0Var2.f36036o0 == null) {
                        p5 p5Var = bp0Var.f35682c;
                        org.telegram.ui.o51[] o51VarArr = new org.telegram.ui.o51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (p5Var != null) {
                            p5Var.f();
                            bp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(p5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(bp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = cp0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.d6 resourceProvider = ip0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.yo0 yo0Var = new org.telegram.ui.yo0(cp0Var2, ip0Var, context, valueOf2, i13, resourceProvider, i14, bp0Var.a(), bp0Var, o51VarArr);
                        yo0Var.f43060g1 = true;
                        long j11 = cp0Var2.f36034n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        yo0Var.setSelected(valueOf);
                        yo0Var.setSaveState(3);
                        yo0Var.y(p5Var, bp0Var);
                        org.telegram.ui.zo0 zo0Var = new org.telegram.ui.zo0(cp0Var2, yo0Var);
                        cp0Var2.f36036o0 = zo0Var;
                        o51VarArr[0] = zo0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        zo0Var.showAsDropDown(bp0Var, 0, i11, i16 | 48);
                        o51VarArr[0].b();
                    }
                    return;
                }
                int i17 = cp0Var2.V;
                int i18 = this.f29082b;
                if (i10 == i17) {
                    cp0Var2.h = -1;
                    cp0Var2.f36034n = 0L;
                    cp0Var2.f36038r = null;
                    cp0Var2.f36039s = null;
                    cp0Var2.I = null;
                    cp0Var2.i();
                    if (i18 == 0) {
                        ip0Var.h.i();
                    }
                    org.telegram.ui.bp0 bp0Var2 = cp0Var2.f36042y;
                    if (bp0Var2 != null) {
                        bp0Var2.b(true);
                    }
                    cp0Var2.j(true);
                    cp0Var2.f(true);
                    org.telegram.ui.cp0 cp0Var3 = ip0Var.f38094n;
                    if (cp0Var3 != null && (gp0Var = cp0Var3.f36018a) != null && (cp0Var = ip0Var.h) != null) {
                        gp0Var.a(cp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = cp0Var2.f36021b0;
                if (i10 >= i19 && i10 < cp0Var2.f36023c0) {
                    int i20 = i10 - i19;
                    if (cp0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    cp0Var2.f36034n = 0L;
                                    cp0Var2.h = -1;
                                    cp0Var2.I = null;
                                    cp0Var2.f36038r = null;
                                    cp0Var2.f36039s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                cp0Var2.f36034n = 0L;
                                cp0Var2.h = -1;
                                cp0Var2.I = null;
                                cp0Var2.f36038r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                cp0Var2.f36039s = null;
                            }
                            cp0Var2.j(true);
                            cp0Var2.i();
                            cp0Var2.f(true);
                            org.telegram.ui.bp0 bp0Var3 = cp0Var2.f36042y;
                            if (bp0Var3 != null) {
                                bp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (cp0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                cp0Var2.f36034n = 0L;
                                cp0Var2.h = -1;
                                cp0Var2.f36038r = null;
                                cp0Var2.f36039s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            cp0Var2.f36034n = 0L;
                            cp0Var2.h = -1;
                            cp0Var2.f36038r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            cp0Var2.f36039s = null;
                        }
                        cp0Var2.I = tL_starGiftUnique2;
                        cp0Var2.j(true);
                        cp0Var2.i();
                        cp0Var2.f(true);
                        org.telegram.ui.bp0 bp0Var4 = cp0Var2.f36042y;
                        if (bp0Var4 != null) {
                            bp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.x51 x51Var = (org.telegram.ui.x51) this.f29083c;
                boolean z12 = view instanceof org.telegram.ui.g51;
                int i21 = this.f29082b;
                try {
                    if (z12) {
                        org.telegram.ui.g51 g51Var = (org.telegram.ui.g51) view;
                        if (!g51Var.f37194s && (((i1Var = g51Var.f37196x) == null || !i1Var.f780a) && i21 != 13 && i21 != 14)) {
                            if (g51Var.Q && (document = g51Var.d) != null) {
                                if (x51Var.W == 6) {
                                    x51Var.p(g51Var, Long.valueOf(document.f20282id), document, g51Var.v, null);
                                } else {
                                    x51Var.p(g51Var, null, document, g51Var.v, null);
                                }
                            } else {
                                x51Var.o(g51Var, g51Var.e);
                            }
                        } else {
                            x51Var.l();
                            x51Var.r(g51Var, g51Var.f37196x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            x51Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        x51Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            x51Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.b51) {
                        x51Var.i(i10, (org.telegram.ui.b51) view);
                        if (i21 != 1 && i21 != 11) {
                            x51Var.performHapticFeedback(3, 1);
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
