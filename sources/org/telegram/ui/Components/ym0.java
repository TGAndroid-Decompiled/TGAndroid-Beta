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
public final class ym0 implements jl0 {
    public final int f33547a;
    public final int f33548b;
    public final FrameLayout f33549c;

    public ym0(FrameLayout frameLayout, int i10, int i11) {
        this.f33547a = i11;
        this.f33549c = frameLayout;
        this.f33548b = i10;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z4;
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.hp0 hp0Var;
        org.telegram.ui.dp0 dp0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Long valueOf;
        ng.q0 q0Var;
        TLRPC.Document document;
        switch (this.f33547a) {
            case 0:
                en0 en0Var = (en0) this.f33549c;
                org.telegram.ui.ActionBar.p2 p2Var = en0Var.D;
                dn0 dn0Var = en0Var.f26585c;
                MessageObject E = dn0Var.E(i10);
                if (E != null) {
                    boolean z10 = false;
                    if (en0Var.F.f()) {
                        en0Var.F.d(E, view, 0);
                        org.telegram.ui.l10 l10Var = en0Var.G;
                        int id2 = E.getId();
                        l10Var.f38557a = E.getDialogId();
                        l10Var.f38558b = id2;
                        dn0Var.m(i10);
                        if (!en0Var.F.f()) {
                            dn0Var.q(0, dn0Var.f26301c.f26589r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof an0) {
                        org.telegram.ui.Cells.i7 i7Var = ((an0) view).f25298a;
                        MessageObject message = i7Var.getMessage();
                        TLRPC.Document document2 = message.getDocument();
                        if (i7Var.D) {
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
                                AndroidUtilities.openDocument(message, en0Var.C, p2Var);
                            } else {
                                MediaController.getInstance().playMessage(message);
                                return;
                            }
                        } else if (!i7Var.C) {
                            E.putInDownloadsStore = true;
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                            i7Var.f(true);
                            DownloadController.getInstance(this.f33548b).updateFilesLoadingPriority();
                        } else {
                            AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                            i7Var.f(true);
                        }
                        en0Var.d(true);
                    }
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                org.telegram.ui.dp0 dp0Var2 = (org.telegram.ui.dp0) this.f33549c;
                org.telegram.ui.ip0 ip0Var = dp0Var2.f36282g0;
                ArrayList arrayList2 = dp0Var2.f36276c0;
                if (view instanceof org.telegram.ui.cp0) {
                    org.telegram.ui.cp0 cp0Var = (org.telegram.ui.cp0) view;
                    int i15 = dp0Var2.f36277d0;
                    if (dp0Var2.f36281f0 == null) {
                        j5 j5Var = cp0Var.f35889c;
                        org.telegram.ui.i61[] i61VarArr = new org.telegram.ui.i61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (j5Var != null) {
                            j5Var.f();
                            cp0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(j5Var.getBounds());
                            if (i15 == 1) {
                                i12 = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min;
                            } else {
                                i12 = (-(cp0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            }
                            i11 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        Context context = dp0Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i11);
                        if (i15 == 1) {
                            i13 = 5;
                        } else {
                            i13 = 7;
                        }
                        org.telegram.ui.ActionBar.g6 resourceProvider = ip0Var.getResourceProvider();
                        if (i15 == 1) {
                            i14 = 24;
                        } else {
                            i14 = 16;
                        }
                        org.telegram.ui.zo0 zo0Var = new org.telegram.ui.zo0(dp0Var2, ip0Var, context, valueOf2, i13, resourceProvider, i14, cp0Var.a(), cp0Var, i61VarArr);
                        zo0Var.f40789d1 = true;
                        long j11 = dp0Var2.f36284r;
                        if (j11 == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j11);
                        }
                        zo0Var.setSelected(valueOf);
                        int i16 = 3;
                        zo0Var.setSaveState(3);
                        zo0Var.y(j5Var, cp0Var);
                        org.telegram.ui.ap0 ap0Var = new org.telegram.ui.ap0(dp0Var2, zo0Var);
                        dp0Var2.f36281f0 = ap0Var;
                        i61VarArr[0] = ap0Var;
                        if (!LocaleController.isRTL) {
                            i16 = 5;
                        }
                        ap0Var.showAsDropDown(cp0Var, 0, i12, i16 | 48);
                        i61VarArr[0].b();
                    }
                    return;
                }
                int i17 = dp0Var2.N;
                int i18 = this.f33548b;
                if (i10 == i17) {
                    dp0Var2.f36283n = -1;
                    dp0Var2.f36284r = 0L;
                    dp0Var2.f36285s = null;
                    dp0Var2.v = null;
                    dp0Var2.f36288y = null;
                    dp0Var2.h();
                    if (i18 == 0) {
                        ip0Var.f37908f.h();
                    }
                    org.telegram.ui.cp0 cp0Var2 = dp0Var2.f36287x;
                    if (cp0Var2 != null) {
                        cp0Var2.b(true);
                    }
                    dp0Var2.i(true);
                    dp0Var2.f();
                    org.telegram.ui.dp0 dp0Var3 = ip0Var.h;
                    if (dp0Var3 != null && (hp0Var = dp0Var3.f36271a) != null && (dp0Var = ip0Var.f37908f) != null) {
                        hp0Var.a(dp0Var.f36283n);
                        return;
                    }
                    return;
                }
                int i19 = dp0Var2.Q;
                if (i10 >= i19 && i10 < dp0Var2.R) {
                    int i20 = i10 - i19;
                    if (dp0Var2.C == null) {
                        if (i20 >= 0 && i20 < arrayList2.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                            if (i18 == 1) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    dp0Var2.f36284r = 0L;
                                    dp0Var2.f36283n = -1;
                                    dp0Var2.f36288y = null;
                                    dp0Var2.f36285s = null;
                                    dp0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                dp0Var2.f36284r = 0L;
                                dp0Var2.f36283n = -1;
                                dp0Var2.f36288y = null;
                                dp0Var2.f36285s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                dp0Var2.v = null;
                            }
                            dp0Var2.i(true);
                            dp0Var2.h();
                            dp0Var2.f();
                            org.telegram.ui.cp0 cp0Var3 = dp0Var2.f36287x;
                            if (cp0Var3 != null) {
                                cp0Var3.b(true);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (dp0Var2.B != null && i20 >= 0 && i20 < arrayList2.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i20);
                        if (i18 == 1) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                dp0Var2.f36284r = 0L;
                                dp0Var2.f36283n = -1;
                                dp0Var2.f36285s = null;
                                dp0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            dp0Var2.f36284r = 0L;
                            dp0Var2.f36283n = -1;
                            dp0Var2.f36285s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                            dp0Var2.v = null;
                        }
                        dp0Var2.f36288y = tL_starGiftUnique2;
                        dp0Var2.i(true);
                        dp0Var2.h();
                        dp0Var2.f();
                        org.telegram.ui.cp0 cp0Var4 = dp0Var2.f36287x;
                        if (cp0Var4 != null) {
                            cp0Var4.b(true);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.r61 r61Var = (org.telegram.ui.r61) this.f33549c;
                boolean z11 = view instanceof org.telegram.ui.a61;
                int i21 = this.f33548b;
                try {
                    if (z11) {
                        org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) view;
                        if (!a61Var.f35044s && (((q0Var = a61Var.f35046x) == null || !q0Var.f16174a) && i21 != 13 && i21 != 14)) {
                            if (a61Var.N && (document = a61Var.d) != null) {
                                if (r61Var.T == 6) {
                                    r61Var.p(a61Var, Long.valueOf(document.f20849id), document, a61Var.v, null);
                                } else {
                                    r61Var.p(a61Var, null, document, a61Var.v, null);
                                }
                            } else {
                                r61Var.o(a61Var, a61Var.f35040e);
                            }
                        } else {
                            r61Var.l();
                            r61Var.r(a61Var, a61Var.f35046x);
                        }
                        if (i21 != 1 && i21 != 11) {
                            r61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        r61Var.o(view, null);
                        if (i21 != 1 && i21 != 11) {
                            r61Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof org.telegram.ui.v51) {
                        r61Var.i(i10, (org.telegram.ui.v51) view);
                        if (i21 != 1 && i21 != 11) {
                            r61Var.performHapticFeedback(3, 1);
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
