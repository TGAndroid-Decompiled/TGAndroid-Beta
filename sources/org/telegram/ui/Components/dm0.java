package org.telegram.ui.Components;

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

public final class dm0 implements pk0 {

    public final int f27809a;

    public final int f27810b;

    public final FrameLayout f27811c;

    public dm0(FrameLayout frameLayout, int i10, int i11) {
        this.f27809a = i11;
        this.f27811c = frameLayout;
        this.f27810b = i10;
    }

    @Override
    public final void a(int i10, View view) {
        org.telegram.ui.zo0 zo0Var;
        org.telegram.ui.vo0 vo0Var;
        int iCenterX;
        int iDp;
        ig.q0 q0Var;
        TLRPC.Document document;
        switch (this.f27809a) {
            case 0:
                jm0 jm0Var = (jm0) this.f27811c;
                org.telegram.ui.ActionBar.n2 n2Var = jm0Var.C;
                im0 im0Var = jm0Var.f29729c;
                MessageObject messageObjectE = im0Var.E(i10);
                if (messageObjectE != null) {
                    if (!jm0Var.E.f()) {
                        if (view instanceof fm0) {
                            org.telegram.ui.Cells.f7 f7Var = ((fm0) view).f28409a;
                            MessageObject message = f7Var.getMessage();
                            TLRPC.Document document2 = message.getDocument();
                            if (f7Var.C) {
                                if (message.isRoundVideo() || message.isVoice()) {
                                    MediaController.getInstance().playMessage(message);
                                } else {
                                    boolean zCanPreviewDocument = message.canPreviewDocument();
                                    if (!zCanPreviewDocument) {
                                        TLRPC.Message message2 = message.messageOwner;
                                        boolean z10 = message2 != null && message2.noforwards;
                                        TLRPC.Chat chat = messageObjectE.messageOwner.peer_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObjectE.messageOwner.peer_id.channel_id)) : null;
                                        if (chat == null) {
                                            chat = messageObjectE.messageOwner.peer_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObjectE.messageOwner.peer_id.chat_id)) : null;
                                        }
                                        if (chat != null) {
                                            z10 = chat.noforwards;
                                        }
                                        zCanPreviewDocument = zCanPreviewDocument || z10;
                                    }
                                    if (zCanPreviewDocument) {
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.st0());
                                    } else {
                                        AndroidUtilities.openDocument(message, jm0Var.B, n2Var);
                                    }
                                }
                                break;
                            } else if (f7Var.B) {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                                f7Var.f(true);
                            } else {
                                messageObjectE.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, messageObjectE, 0, 0);
                                f7Var.f(true);
                                DownloadController.getInstance(this.f27810b).updateFilesLoadingPriority();
                            }
                            jm0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.e7) {
                            ((org.telegram.ui.Cells.e7) view).a();
                        }
                    } else {
                        jm0Var.E.d(messageObjectE, view, 0);
                        org.telegram.ui.a10 a10Var = jm0Var.F;
                        int id2 = messageObjectE.getId();
                        a10Var.f36332a = messageObjectE.getDialogId();
                        a10Var.f36333b = id2;
                        im0Var.m(i10);
                        if (!jm0Var.E.f()) {
                            im0Var.q(0, im0Var.f29408c.f29733r);
                        }
                    }
                    break;
                }
                break;
            case 1:
                org.telegram.ui.vo0 vo0Var2 = (org.telegram.ui.vo0) this.f27811c;
                org.telegram.ui.ap0 ap0Var = vo0Var2.f43505f0;
                ArrayList arrayList2 = vo0Var2.f43498b0;
                if (view instanceof org.telegram.ui.uo0) {
                    org.telegram.ui.uo0 uo0Var = (org.telegram.ui.uo0) view;
                    int i11 = vo0Var2.f43500c0;
                    if (vo0Var2.f43503e0 == null) {
                        i5 i5Var = uo0Var.f43268c;
                        org.telegram.ui.r51[] r51VarArr = new org.telegram.ui.r51[1];
                        int iMin = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int iMin2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (i5Var != null) {
                            i5Var.f();
                            uo0Var.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(i5Var.getBounds());
                            iDp = i11 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - iMin : (-(uo0Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            iCenterX = rect.centerX() - (AndroidUtilities.displaySize.x - iMin2);
                        } else {
                            iCenterX = 0;
                            iDp = 0;
                        }
                        org.telegram.ui.ro0 ro0Var = new org.telegram.ui.ro0(vo0Var2, ap0Var, vo0Var2.getContext(), Integer.valueOf(iCenterX), i11 == 1 ? 5 : 7, ap0Var.getResourceProvider(), i11 == 1 ? 24 : 16, uo0Var.a(), uo0Var, r51VarArr);
                        ro0Var.f36391c1 = true;
                        long j10 = vo0Var2.f43507r;
                        ro0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        ro0Var.setSaveState(3);
                        ro0Var.y(i5Var, uo0Var);
                        org.telegram.ui.so0 so0Var = new org.telegram.ui.so0(vo0Var2, ro0Var);
                        vo0Var2.f43503e0 = so0Var;
                        r51VarArr[0] = so0Var;
                        so0Var.showAsDropDown(uo0Var, 0, iDp, (LocaleController.isRTL ? 3 : 5) | 48);
                        r51VarArr[0].b();
                    }
                    break;
                } else {
                    int i12 = vo0Var2.M;
                    int i13 = this.f27810b;
                    if (i10 != i12) {
                        int i14 = vo0Var2.P;
                        if (i10 >= i14 && i10 < vo0Var2.Q) {
                            int i15 = i10 - i14;
                            if (vo0Var2.B != null) {
                                if (vo0Var2.A != null && i15 >= 0 && i15 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                    if (i13 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            vo0Var2.f43507r = 0L;
                                            vo0Var2.f43506n = -1;
                                            vo0Var2.f43508s = null;
                                            vo0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        vo0Var2.f43507r = 0L;
                                        vo0Var2.f43506n = -1;
                                        vo0Var2.f43508s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        vo0Var2.v = null;
                                    }
                                    vo0Var2.f43511y = tL_starGiftUnique;
                                    vo0Var2.i(true);
                                    vo0Var2.h();
                                    vo0Var2.f();
                                    org.telegram.ui.uo0 uo0Var2 = vo0Var2.f43510x;
                                    if (uo0Var2 != null) {
                                        uo0Var2.b(true);
                                    }
                                    break;
                                }
                            } else if (i15 >= 0 && i15 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                if (i13 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        vo0Var2.f43507r = 0L;
                                        vo0Var2.f43506n = -1;
                                        vo0Var2.f43511y = null;
                                        vo0Var2.f43508s = null;
                                        vo0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    vo0Var2.f43507r = 0L;
                                    vo0Var2.f43506n = -1;
                                    vo0Var2.f43511y = null;
                                    vo0Var2.f43508s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    vo0Var2.v = null;
                                }
                                vo0Var2.i(true);
                                vo0Var2.h();
                                vo0Var2.f();
                                org.telegram.ui.uo0 uo0Var3 = vo0Var2.f43510x;
                                if (uo0Var3 != null) {
                                    uo0Var3.b(true);
                                }
                                break;
                            }
                        }
                    } else {
                        vo0Var2.f43506n = -1;
                        vo0Var2.f43507r = 0L;
                        vo0Var2.f43508s = null;
                        vo0Var2.v = null;
                        vo0Var2.f43511y = null;
                        vo0Var2.h();
                        if (i13 == 0) {
                            ap0Var.f36589f.h();
                        }
                        org.telegram.ui.uo0 uo0Var4 = vo0Var2.f43510x;
                        if (uo0Var4 != null) {
                            uo0Var4.b(true);
                        }
                        vo0Var2.i(true);
                        vo0Var2.f();
                        org.telegram.ui.vo0 vo0Var3 = ap0Var.h;
                        if (vo0Var3 != null && (zo0Var = vo0Var3.f43495a) != null && (vo0Var = ap0Var.f36589f) != null) {
                            zo0Var.a(vo0Var.f43506n);
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) this.f27811c;
                boolean z11 = view instanceof org.telegram.ui.j51;
                int i16 = this.f27810b;
                try {
                    if (z11) {
                        org.telegram.ui.j51 j51Var = (org.telegram.ui.j51) view;
                        if (j51Var.f39263s || (((q0Var = j51Var.f39265x) != null && q0Var.f11408a) || i16 == 13 || i16 == 14)) {
                            a61Var.l();
                            a61Var.r(j51Var, j51Var.f39265x);
                        } else if (!j51Var.M || (document = j51Var.d) == null) {
                            a61Var.o(j51Var, j51Var.f39259e);
                        } else if (a61Var.S == 6) {
                            a61Var.p(j51Var, Long.valueOf(document.f22386id), document, j51Var.v, null);
                        } else {
                            a61Var.p(j51Var, null, document, j51Var.v, null);
                        }
                        if (i16 != 1 && i16 != 11) {
                            a61Var.performHapticFeedback(3, 1);
                        }
                    } else if (view instanceof ImageView) {
                        a61Var.o(view, null);
                        if (i16 != 1 && i16 != 11) {
                            a61Var.performHapticFeedback(3, 1);
                        }
                    } else if (!(view instanceof org.telegram.ui.e51)) {
                        if (view != null) {
                            view.callOnClick();
                        }
                        break;
                    } else {
                        a61Var.i(i10, (org.telegram.ui.e51) view);
                        if (i16 != 1 && i16 != 11) {
                            a61Var.performHapticFeedback(3, 1);
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
