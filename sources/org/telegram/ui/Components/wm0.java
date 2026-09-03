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
public final class wm0 implements hl0 {
    public final int f30317a;
    public final int f30318b;
    public final FrameLayout f30319c;

    public wm0(FrameLayout frameLayout, int i10, int i11) {
        this.f30317a = i11;
        this.f30319c = frameLayout;
        this.f30318b = i10;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z4;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.lp0 lp0Var;
        org.telegram.ui.hp0 hp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        int dp;
        mg.q0 q0Var;
        TLRPC.Document document;
        switch (this.f30317a) {
            case 0:
                cn0 cn0Var = (cn0) this.f30319c;
                org.telegram.ui.ActionBar.p2 p2Var = cn0Var.D;
                bn0 bn0Var = cn0Var.f23975c;
                MessageObject E = bn0Var.E(i10);
                if (E != null) {
                    boolean z10 = false;
                    if (cn0Var.F.f()) {
                        cn0Var.F.d(E, view, 0);
                        org.telegram.ui.m10 m10Var = cn0Var.G;
                        int id2 = E.getId();
                        m10Var.f35953a = E.getDialogId();
                        m10Var.f35954b = id2;
                        bn0Var.m(i10);
                        if (!cn0Var.F.f()) {
                            bn0Var.q(0, bn0Var.f23724c.f23978r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof ym0) {
                        org.telegram.ui.Cells.h7 h7Var = ((ym0) view).f31054a;
                        MessageObject message = h7Var.getMessage();
                        TLRPC.Document document2 = message.getDocument();
                        if (h7Var.D) {
                            if (!message.isRoundVideo() && !message.isVoice()) {
                                boolean canPreviewDocument = message.canPreviewDocument();
                                if (!canPreviewDocument) {
                                    TLRPC.Message message2 = message.messageOwner;
                                    if (message2 != null && message2.noforwards) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
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
                                        z4 = chat.noforwards;
                                    }
                                    canPreviewDocument = (canPreviewDocument || z4) ? true : true;
                                }
                                if (canPreviewDocument) {
                                    PhotoViewer.t1().K2(null, p2Var, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.t1().K2(null, p2Var, null);
                                    PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                AndroidUtilities.openDocument(message, cn0Var.C, p2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!h7Var.C) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            h7Var.f(true);
                            DownloadController.getInstance(this.f30318b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            h7Var.f(true);
                        }
                        cn0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.hp0 hp0Var2 = (org.telegram.ui.hp0) this.f30319c;
                org.telegram.ui.np0 np0Var = hp0Var2.m0;
                ArrayList arrayList2 = hp0Var2.f34730i0;
                if (view instanceof org.telegram.ui.gp0) {
                    org.telegram.ui.gp0 gp0Var = (org.telegram.ui.gp0) view;
                    int i15 = hp0Var2.f34731j0;
                    if (hp0Var2.f34733l0 == null) {
                        j5 j5Var = gp0Var.f34494c;
                        org.telegram.ui.n61[] n61VarArr = new org.telegram.ui.n61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (j5Var != null) {
                            j5Var.f();
                            gp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(j5Var.getBounds());
                            if (i15 == 1) {
                                dp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                dp = (-(gp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = hp0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i12);
                        int i16 = 5;
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.f6 resourceProvider = np0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.dp0 dp0Var = new org.telegram.ui.dp0(hp0Var2, np0Var, context, valueOf2, i13, resourceProvider, i14, gp0Var.a(), gp0Var, n61VarArr);
                        dp0Var.f39861d1 = true;
                        long j11 = hp0Var2.f34734n;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        dp0Var.setSelected(valueOf);
                        dp0Var.setSaveState(3);
                        dp0Var.y(j5Var, gp0Var);
                        org.telegram.ui.ep0 ep0Var = new org.telegram.ui.ep0(hp0Var2, dp0Var);
                        hp0Var2.f34733l0 = ep0Var;
                        n61VarArr[0] = ep0Var;
                        if (LocaleController.isRTL) {
                            i16 = 3;
                        }
                        ep0Var.showAsDropDown(gp0Var, 0, i11, i16 | 48);
                        n61VarArr[0].b();
                    }
                    return;
                }
                int i17 = hp0Var2.S;
                int i18 = this.f30318b;
                if (i10 == i17) {
                    hp0Var2.h = -1;
                    hp0Var2.f34734n = 0L;
                    hp0Var2.f34735r = null;
                    hp0Var2.f34736s = null;
                    hp0Var2.F = null;
                    hp0Var2.i();
                    if (i18 == 0) {
                        np0Var.h.i();
                    }
                    org.telegram.ui.gp0 gp0Var2 = hp0Var2.f34739y;
                    if (gp0Var2 != null) {
                        gp0Var2.b(true);
                    }
                    hp0Var2.j(true);
                    hp0Var2.f(true);
                    org.telegram.ui.hp0 hp0Var3 = np0Var.f36565n;
                    if (hp0Var3 != null && (lp0Var = hp0Var3.f34718a) != null && (hp0Var = np0Var.h) != null) {
                        lp0Var.a(hp0Var.h);
                        return;
                    }
                    return;
                }
                int i19 = hp0Var2.V;
                if (i10 >= i19 && i10 < hp0Var2.W) {
                    int i20 = i10 - i19;
                    if (hp0Var2.H == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    hp0Var2.f34734n = 0L;
                                    hp0Var2.h = -1;
                                    hp0Var2.F = null;
                                    hp0Var2.f34735r = null;
                                    hp0Var2.f34736s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                hp0Var2.f34734n = 0L;
                                hp0Var2.h = -1;
                                hp0Var2.F = null;
                                hp0Var2.f34735r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                hp0Var2.f34736s = null;
                            }
                            hp0Var2.j(true);
                            hp0Var2.i();
                            hp0Var2.f(true);
                            org.telegram.ui.gp0 gp0Var3 = hp0Var2.f34739y;
                            if (gp0Var3 != null) {
                                gp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (hp0Var2.G != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                hp0Var2.f34734n = 0L;
                                hp0Var2.h = -1;
                                hp0Var2.f34735r = null;
                                hp0Var2.f34736s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            hp0Var2.f34734n = 0L;
                            hp0Var2.h = -1;
                            hp0Var2.f34735r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            hp0Var2.f34736s = null;
                        }
                        hp0Var2.F = tL_starGiftUnique2;
                        hp0Var2.j(true);
                        hp0Var2.i();
                        hp0Var2.f(true);
                        org.telegram.ui.gp0 gp0Var4 = hp0Var2.f34739y;
                        if (gp0Var4 != null) {
                            gp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.x61 x61Var = (org.telegram.ui.x61) this.f30319c;
                boolean z11 = view instanceof org.telegram.ui.f61;
                int i21 = this.f30318b;
                try {
                    if (z11) {
                        org.telegram.ui.f61 f61Var = (org.telegram.ui.f61) view;
                        if (!f61Var.f33969s && (((q0Var = f61Var.f33971x) == null || !q0Var.f14092a) && i21 != 13 && i21 != 14)) {
                            if (f61Var.N && (document = f61Var.d) != null) {
                                if (x61Var.T == 6) {
                                    x61Var.p(f61Var, Long.valueOf(document.f19165id), document, f61Var.v, null);
                                } else {
                                    x61Var.p(f61Var, null, document, f61Var.v, null);
                                }
                            } else {
                                x61Var.o(f61Var, f61Var.e);
                            }
                        } else {
                            x61Var.l();
                            x61Var.r(f61Var, f61Var.f33971x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            x61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        x61Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            x61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.a61) {
                        x61Var.i(i10, (org.telegram.ui.a61) view);
                        if (i21 != 1 && i21 != 11) {
                            x61Var.performHapticFeedback(3, 1);
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
