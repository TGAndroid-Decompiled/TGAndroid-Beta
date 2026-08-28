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
public final class am0 implements mk0 {
    public final int f26868a;
    public final int f26869b;
    public final FrameLayout f26870c;

    public am0(FrameLayout frameLayout, int i9, int i10) {
        this.f26868a = i10;
        this.f26870c = frameLayout;
        this.f26869b = i9;
    }

    @Override
    public final void a(int i9, View view) {
        boolean z10;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.yo0 yo0Var;
        org.telegram.ui.uo0 uo0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        Long valueOf;
        hg.r0 r0Var;
        TLRPC.Document document;
        switch (this.f26868a) {
            case 0:
                gm0 gm0Var = (gm0) this.f26870c;
                org.telegram.ui.ActionBar.o2 o2Var = gm0Var.C;
                fm0 fm0Var = gm0Var.f28810c;
                MessageObject E = fm0Var.E(i9);
                if (E != null) {
                    boolean z11 = false;
                    if (gm0Var.E.f()) {
                        gm0Var.E.d(E, view, 0);
                        org.telegram.ui.x00 x00Var = gm0Var.F;
                        int id2 = E.getId();
                        x00Var.f44299a = E.getDialogId();
                        x00Var.f44300b = id2;
                        fm0Var.m(i9);
                        if (!gm0Var.E.f()) {
                            fm0Var.q(0, fm0Var.f28513c.f28814r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof cm0) {
                        org.telegram.ui.Cells.i7 i7Var = ((cm0) view).f27513a;
                        MessageObject message = i7Var.getMessage();
                        TLRPC.Document document2 = message.getDocument();
                        if (i7Var.C) {
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
                                AndroidUtilities.openDocument(message, gm0Var.B, o2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!i7Var.B) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            i7Var.f(true);
                            DownloadController.getInstance(this.f26869b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            i7Var.f(true);
                        }
                        gm0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.uo0 uo0Var2 = (org.telegram.ui.uo0) this.f26870c;
                org.telegram.ui.zo0 zo0Var = uo0Var2.f43287f0;
                ArrayList arrayList2 = uo0Var2.f43280b0;
                if (view instanceof org.telegram.ui.to0) {
                    org.telegram.ui.to0 to0Var = (org.telegram.ui.to0) view;
                    int i14 = uo0Var2.f43282c0;
                    if (uo0Var2.f43285e0 == null) {
                        i5 i5Var = to0Var.f43048c;
                        org.telegram.ui.s51[] s51VarArr = new org.telegram.ui.s51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (i5Var != null) {
                            i5Var.f();
                            to0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(i5Var.getBounds());
                            if (i14 == 1) {
                                i11 = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                i11 = (-(to0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i10 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        Context context = uo0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i10);
                        if (i14 == 1) {
                            i12 = 5;
                        } else {
                            i12 = 7;
                        }
                        org.telegram.ui.ActionBar.b6 resourceProvider = zo0Var.getResourceProvider();
                        if (i14 == 1) {
                            i13 = 24;
                        } else {
                            i13 = 16;
                        }
                        org.telegram.ui.qo0 qo0Var = new org.telegram.ui.qo0(uo0Var2, zo0Var, context, valueOf2, i12, resourceProvider, i13, to0Var.a(), to0Var, s51VarArr);
                        qo0Var.f36668c1 = true;
                        long j11 = uo0Var2.f43289r;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        qo0Var.setSelected(valueOf);
                        int i15 = 3;
                        qo0Var.setSaveState(3);
                        qo0Var.y(i5Var, to0Var);
                        org.telegram.ui.ro0 ro0Var = new org.telegram.ui.ro0(uo0Var2, qo0Var);
                        uo0Var2.f43285e0 = ro0Var;
                        s51VarArr[0] = ro0Var;
                        if (!LocaleController.isRTL) {
                            i15 = 5;
                        }
                        ro0Var.showAsDropDown(to0Var, 0, i11, i15 | 48);
                        s51VarArr[0].b();
                    }
                    return;
                }
                int i16 = uo0Var2.M;
                int i17 = this.f26869b;
                if (i9 == i16) {
                    uo0Var2.f43288n = -1;
                    uo0Var2.f43289r = 0L;
                    uo0Var2.f43290s = null;
                    uo0Var2.v = null;
                    uo0Var2.f43293y = null;
                    uo0Var2.h();
                    if (i17 == 0) {
                        zo0Var.f45196f.h();
                    }
                    org.telegram.ui.to0 to0Var2 = uo0Var2.f43292x;
                    if (to0Var2 != null) {
                        to0Var2.b(true);
                    }
                    uo0Var2.i(true);
                    uo0Var2.f();
                    org.telegram.ui.uo0 uo0Var3 = zo0Var.h;
                    if (uo0Var3 != null && (yo0Var = uo0Var3.f43277a) != null && (uo0Var = zo0Var.f45196f) != null) {
                        yo0Var.a(uo0Var.f43288n);
                        return;
                    }
                    return;
                }
                int i18 = uo0Var2.P;
                if (i9 >= i18 && i9 < uo0Var2.Q) {
                    int i19 = i9 - i18;
                    if (uo0Var2.B == null) {
                        if (i19 >= 0 && i19 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                            if (i17 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    uo0Var2.f43289r = 0L;
                                    uo0Var2.f43288n = -1;
                                    uo0Var2.f43293y = null;
                                    uo0Var2.f43290s = null;
                                    uo0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                uo0Var2.f43289r = 0L;
                                uo0Var2.f43288n = -1;
                                uo0Var2.f43293y = null;
                                uo0Var2.f43290s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                uo0Var2.v = null;
                            }
                            uo0Var2.i(true);
                            uo0Var2.h();
                            uo0Var2.f();
                            org.telegram.ui.to0 to0Var3 = uo0Var2.f43292x;
                            if (to0Var3 != null) {
                                to0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (uo0Var2.A != null && i19 >= 0 && i19 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i19);
                        if (i17 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                uo0Var2.f43289r = 0L;
                                uo0Var2.f43288n = -1;
                                uo0Var2.f43290s = null;
                                uo0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            uo0Var2.f43289r = 0L;
                            uo0Var2.f43288n = -1;
                            uo0Var2.f43290s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            uo0Var2.v = null;
                        }
                        uo0Var2.f43293y = tL_starGiftUnique2;
                        uo0Var2.i(true);
                        uo0Var2.h();
                        uo0Var2.f();
                        org.telegram.ui.to0 to0Var4 = uo0Var2.f43292x;
                        if (to0Var4 != null) {
                            to0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) this.f26870c;
                boolean z12 = view instanceof org.telegram.ui.k51;
                int i20 = this.f26869b;
                try {
                    if (z12) {
                        org.telegram.ui.k51 k51Var = (org.telegram.ui.k51) view;
                        if (!k51Var.f39717s && (((r0Var = k51Var.f39719x) == null || !r0Var.f10713a) && i20 != 13 && i20 != 14)) {
                            if (k51Var.M && (document = k51Var.d) != null) {
                                if (b61Var.S == 6) {
                                    b61Var.p(k51Var, Long.valueOf(document.f22386id), document, k51Var.v, null);
                                } else {
                                    b61Var.p(k51Var, null, document, k51Var.v, null);
                                }
                            } else {
                                b61Var.o(k51Var, k51Var.f39713e);
                            }
                        } else {
                            b61Var.l();
                            b61Var.r(k51Var, k51Var.f39719x);
                        }
                        if (i20 != 1 && i20 != 11) {
                            b61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        b61Var.o(view, null);
                        if (i20 != 1 && i20 != 11) {
                            b61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.f51) {
                        b61Var.i(i9, (org.telegram.ui.f51) view);
                        if (i20 != 1 && i20 != 11) {
                            b61Var.performHapticFeedback(3, 1);
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
