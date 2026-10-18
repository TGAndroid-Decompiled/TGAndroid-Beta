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
public final class nn0 implements wl0 {
    public final int f28810a;
    public final int f28811b;
    public final FrameLayout f28812c;

    public nn0(FrameLayout frameLayout, int i10, int i11) {
        this.f28810a = i11;
        this.f28812c = frameLayout;
        this.f28811b = i10;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.ip0 ip0Var;
        org.telegram.ui.ep0 ep0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        ah.i1 i1Var;
        TLRPC.Document document;
        switch (this.f28810a) {
            case 0:
                tn0 tn0Var = (tn0) this.f28812c;
                org.telegram.ui.ActionBar.n2 n2Var = tn0Var.G;
                sn0 sn0Var = tn0Var.f30677c;
                MessageObject E = sn0Var.E(i10);
                if (E != null) {
                    boolean z11 = false;
                    if (tn0Var.I.g()) {
                        tn0Var.I.d(E, view, 0);
                        org.telegram.ui.y00 y00Var = tn0Var.J;
                        int id2 = E.getId();
                        y00Var.f43325a = E.getDialogId();
                        y00Var.f43326b = id2;
                        sn0Var.m(i10);
                        if (!tn0Var.I.g()) {
                            sn0Var.q(0, sn0Var.f30306c.f30680r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof pn0) {
                        org.telegram.ui.Cells.i7 i7Var = ((pn0) view).f29393a;
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
                                    PhotoViewer.t1().K2(null, n2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, n2Var, null);
                                    PhotoViewer.t1().b2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, tn0Var.F, n2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!i7Var.F) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            i7Var.f(true);
                            DownloadController.getInstance(this.f28811b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            i7Var.f(true);
                        }
                        tn0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ep0 ep0Var2 = (org.telegram.ui.ep0) this.f28812c;
                org.telegram.ui.kp0 kp0Var = ep0Var2.f36599p0;
                ArrayList arrayList2 = ep0Var2.f36595l0;
                if (view instanceof org.telegram.ui.dp0) {
                    org.telegram.ui.dp0 dp0Var = (org.telegram.ui.dp0) view;
                    int i15 = ep0Var2.m0;
                    if (ep0Var2.f36598o0 == null) {
                        p5 p5Var = dp0Var.f36265c;
                        org.telegram.ui.q51[] q51VarArr = new org.telegram.ui.q51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (p5Var != null) {
                            p5Var.f();
                            dp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(p5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(dp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = ep0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.d6 resourceProvider = kp0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.ap0 ap0Var = new org.telegram.ui.ap0(ep0Var2, kp0Var, context, valueOf2, i13, resourceProvider, i14, dp0Var.a(), dp0Var, q51VarArr);
                        ap0Var.f43621g1 = true;
                        long j11 = ep0Var2.f36596n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        ap0Var.setSelected(valueOf);
                        ap0Var.setSaveState(3);
                        ap0Var.y(p5Var, dp0Var);
                        org.telegram.ui.bp0 bp0Var = new org.telegram.ui.bp0(ep0Var2, ap0Var);
                        ep0Var2.f36598o0 = bp0Var;
                        q51VarArr[0] = bp0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        bp0Var.showAsDropDown(dp0Var, 0, i11, i16 | 48);
                        q51VarArr[0].b();
                    }
                    return;
                }
                int i17 = ep0Var2.V;
                int i18 = this.f28811b;
                if (i10 == i17) {
                    ep0Var2.h = -1;
                    ep0Var2.f36596n = 0L;
                    ep0Var2.f36600r = null;
                    ep0Var2.f36601s = null;
                    ep0Var2.I = null;
                    ep0Var2.i();
                    if (i18 == 0) {
                        kp0Var.h.i();
                    }
                    org.telegram.ui.dp0 dp0Var2 = ep0Var2.f36604y;
                    if (dp0Var2 != null) {
                        dp0Var2.b(true);
                    }
                    ep0Var2.j(true);
                    ep0Var2.f(true);
                    org.telegram.ui.ep0 ep0Var3 = kp0Var.f38653n;
                    if (ep0Var3 != null && (ip0Var = ep0Var3.f36580a) != null && (ep0Var = kp0Var.h) != null) {
                        ip0Var.a(ep0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = ep0Var2.f36583b0;
                if (i10 >= i19 && i10 < ep0Var2.f36585c0) {
                    int i20 = i10 - i19;
                    if (ep0Var2.K == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    ep0Var2.f36596n = 0L;
                                    ep0Var2.h = -1;
                                    ep0Var2.I = null;
                                    ep0Var2.f36600r = null;
                                    ep0Var2.f36601s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                ep0Var2.f36596n = 0L;
                                ep0Var2.h = -1;
                                ep0Var2.I = null;
                                ep0Var2.f36600r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                ep0Var2.f36601s = null;
                            }
                            ep0Var2.j(true);
                            ep0Var2.i();
                            ep0Var2.f(true);
                            org.telegram.ui.dp0 dp0Var3 = ep0Var2.f36604y;
                            if (dp0Var3 != null) {
                                dp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ep0Var2.J != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                ep0Var2.f36596n = 0L;
                                ep0Var2.h = -1;
                                ep0Var2.f36600r = null;
                                ep0Var2.f36601s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            ep0Var2.f36596n = 0L;
                            ep0Var2.h = -1;
                            ep0Var2.f36600r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            ep0Var2.f36601s = null;
                        }
                        ep0Var2.I = tL_starGiftUnique2;
                        ep0Var2.j(true);
                        ep0Var2.i();
                        ep0Var2.f(true);
                        org.telegram.ui.dp0 dp0Var4 = ep0Var2.f36604y;
                        if (dp0Var4 != null) {
                            dp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.z51 z51Var = (org.telegram.ui.z51) this.f28812c;
                boolean z12 = view instanceof org.telegram.ui.i51;
                int i21 = this.f28811b;
                try {
                    if (z12) {
                        org.telegram.ui.i51 i51Var = (org.telegram.ui.i51) view;
                        if (!i51Var.f37768s && (((i1Var = i51Var.f37770x) == null || !i1Var.f782a) && i21 != 13 && i21 != 14)) {
                            if (i51Var.Q && (document = i51Var.d) != null) {
                                if (z51Var.W == 6) {
                                    z51Var.p(i51Var, Long.valueOf(document.f20285id), document, i51Var.v, null);
                                } else {
                                    z51Var.p(i51Var, null, document, i51Var.v, null);
                                }
                            } else {
                                z51Var.o(i51Var, i51Var.e);
                            }
                        } else {
                            z51Var.l();
                            z51Var.r(i51Var, i51Var.f37770x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            z51Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        z51Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            z51Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.d51) {
                        z51Var.i(i10, (org.telegram.ui.d51) view);
                        if (i21 != 1 && i21 != 11) {
                            z51Var.performHapticFeedback(3, 1);
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
