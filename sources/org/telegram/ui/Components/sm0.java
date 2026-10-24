package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class sm0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final g5 E;
    public final g5 F;
    public final g5 G;
    public final g5 H;
    public final g5 I;
    public final d6 J;
    public final d6 K;
    public final d6 L;
    public final d6 M;
    public final d6 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public org.telegram.ui.ActionBar.g6 T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public rm0[] f30572a0;
    public float f30574b0;
    public boolean f30576c0;
    public aa0 h;
    public boolean f30579i;
    public boolean f30580j;
    public Bitmap f30581k;
    public int f30582l;
    public int f30583m;
    public int f30584n;
    public int f30585o;
    public boolean f30586p;
    public boolean f30589s;
    public n5 f30590t;
    public n5 f30591u;
    public long v;
    public long f30592w;
    public int f30593x;
    public int f30594y;
    public int f30595z;
    public final RectF f30571a = new RectF();
    public final Paint f30573b = new Paint(1);
    public final Paint f30575c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f30577f = new Path();
    public final Paint f30578g = new Paint();
    public int f30587q = 0;
    public float f30588r = 1.0f;

    public sm0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new ai.n6(this, 9));
        }
        zr zrVar = zr.h;
        this.E = new g5(view, 400L, zrVar, 0);
        this.F = new g5(view, 400L, zrVar, 0);
        this.G = new g5(view, 400L, zrVar, 0);
        this.H = new g5(view, 400L, zrVar, 0);
        this.I = new g5(view, 400L, zrVar, 0);
        this.J = new d6(view, 0L, 400L, zrVar);
        this.K = new d6(view, 0L, 400L, zrVar);
        this.L = new d6(view, 0L, 440L, zrVar);
        this.M = new d6(view, 0L, 320L, zrVar);
        this.N = new d6(view, 0L, 320L, zrVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        boolean q6;
        boolean z10;
        g5 g5Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        MessageObject messageObject2;
        TLRPC.Message message2;
        int colorId;
        TLRPC.User user2;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        int i11;
        TLRPC.PeerColor peerColor;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int i12;
        boolean z11;
        View view;
        TLRPC.Message message4;
        TLRPC.User user3;
        int i13;
        float f7;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user4 = user;
        this.R = false;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        if (messageObject != null && !messageObject.isOutOwner() && i10 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return m(messageObject, tL_peerColorCollectible, g6Var);
        }
        this.V = false;
        this.v = 0L;
        this.f30592w = 0L;
        if (messageObject != null && messageObject.isSponsored()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30589s = z10;
        g5 g5Var2 = this.I;
        float f10 = 0.1f;
        if (messageObject == null) {
            this.R = true;
            this.S = i10;
            this.T = g6Var;
            this.U = org.telegram.ui.ActionBar.r6.f21818b;
            this.f30580j = false;
            this.f30579i = false;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, g6Var);
            this.B = w02;
            this.A = w02;
            this.f30595z = w02;
            if (q6) {
                f7 = 0.12f;
            } else {
                f7 = 0.1f;
            }
            this.f30593x = org.telegram.ui.ActionBar.k6.o1(f7, w02);
            this.C = i();
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, g6Var);
            this.f30594y = w03;
            return g5Var2.a(w03, false);
        }
        if (i10 == 4 && (message4 = messageObject.messageOwner) != null && MessageObject.getMedia(message4) != null && (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaContact)) {
            long j10 = MessageObject.getMedia(messageObject.messageOwner).user_id;
            if (j10 != 0) {
                user3 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(j10));
            } else {
                user3 = null;
            }
            if (!messageObject.isOutOwner() && i10 != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, g6Var);
                }
            }
            if (user3 != null) {
                i13 = UserObject.getColorId(user3);
                g5Var = g5Var2;
                this.v = UserObject.getEmojiId(user3);
            } else {
                g5Var = g5Var2;
                i13 = 0;
            }
            n(messageObject, i13, g6Var);
            this.f30593x = org.telegram.ui.ActionBar.k6.o1(0.1f, this.f30595z);
            this.f30594y = this.f30595z;
        } else {
            g5Var = g5Var2;
            if (i10 != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && user4 != null) || ((messageObject.isFromChannel() && chat != null) || (((message3 = messageObject.messageOwner) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (messageObject.isSponsored() && (peerColor2 = messageObject.sponsoredColor) != null && peerColor2.color != -1))))))) {
                int i14 = messageObject.overrideLinkColor;
                if (i14 < 0) {
                    if (messageObject.isSponsored() && (peerColor = messageObject.sponsoredColor) != null && (i11 = peerColor.color) != -1) {
                        if (i10 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                    } else {
                        TLRPC.Message message5 = messageObject.messageOwner;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            i11 = 5;
                            if (peerDialogId < 0) {
                                TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                                if (!messageObject.isOutOwner() && i10 != 2 && chat2 != null) {
                                    TLRPC.PeerColor peerColor4 = chat2.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, g6Var);
                                    }
                                }
                                if (chat2 != null) {
                                    i11 = ChatObject.getColorId(chat2);
                                }
                                if (i10 == 3) {
                                    this.v = ChatObject.getEmojiId(chat2);
                                }
                            } else {
                                TLRPC.User user5 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                                if (!messageObject.isOutOwner() && i10 != 2 && user5 != null) {
                                    TLRPC.PeerColor peerColor5 = user5.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, g6Var);
                                    }
                                }
                                if (user5 != null) {
                                    i11 = UserObject.getColorId(user5);
                                }
                                if (i10 == 3) {
                                    this.v = UserObject.getEmojiId(user5);
                                }
                            }
                        } else if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && user4 != null) {
                            if (messageObject.isOutOwner()) {
                                user2 = UserConfig.getInstance(messageObject.currentAccount).getCurrentUser();
                            } else {
                                user2 = user4;
                            }
                            if (user2 != null) {
                                user4 = user2;
                            }
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor6 = user4.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, g6Var);
                                }
                            }
                            i14 = UserObject.getColorId(user4);
                            if (i10 == 3) {
                                this.v = UserObject.getEmojiId(user4);
                            }
                        } else if (messageObject.isFromUser() && user4 != null) {
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor7 = user4.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, g6Var);
                                }
                            }
                            i14 = UserObject.getColorId(user4);
                            if (i10 == 3) {
                                this.v = UserObject.getEmojiId(user4);
                            }
                        } else if (messageObject.isFromChannel() && chat != null) {
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor8 = chat.color;
                                if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, g6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long fromChatId = messageObject.getFromChatId();
                                if (fromChatId >= 0) {
                                    TLRPC.User user6 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                                    colorId = UserObject.getColorId(user6);
                                    if (i10 == 3) {
                                        this.v = UserObject.getEmojiId(user6);
                                    }
                                } else {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                                    colorId = ChatObject.getColorId(chat3);
                                    if (i10 == 3) {
                                        this.v = ChatObject.getEmojiId(chat3);
                                    }
                                }
                                i14 = colorId;
                            } else {
                                i14 = ChatObject.getColorId(chat);
                                if (i10 == 3) {
                                    this.v = ChatObject.getEmojiId(chat);
                                }
                            }
                        } else {
                            i14 = 0;
                        }
                    }
                    i14 = i11;
                }
                n(messageObject, i14, g6Var);
                this.f30593x = org.telegram.ui.ActionBar.k6.o1(0.1f, this.f30595z);
                this.f30594y = this.f30595z;
            } else if (i10 == 0 && (messageObject.overrideLinkColor >= 0 || ((message = messageObject.messageOwner) != null && messageObject.replyMessageObject != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (messageObject2 = messageObject.replyMessageObject).messageOwner) != null && message2.from_id != null && (messageObject2.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.replyMessageObject.isFromChannel()))))) {
                int i15 = messageObject.overrideLinkColor;
                if (i15 < 0) {
                    if (DialogObject.isEncryptedDialog(messageObject.replyMessageObject.getDialogId())) {
                        if (messageObject.replyMessageObject.isOutOwner()) {
                            user4 = UserConfig.getInstance(messageObject.replyMessageObject.currentAccount).getCurrentUser();
                        }
                        if (user4 != null) {
                            i15 = UserObject.getColorId(user4);
                            this.v = UserObject.getEmojiId(user4);
                        }
                        i15 = 0;
                    } else if (messageObject.replyMessageObject.isFromUser()) {
                        TLRPC.User user7 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                        if (!messageObject.isOutOwner() && i10 != 2 && user7 != null) {
                            TLRPC.PeerColor peerColor9 = user7.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, g6Var);
                            }
                        }
                        if (user7 != null) {
                            i15 = UserObject.getColorId(user7);
                            this.v = UserObject.getEmojiId(user7);
                        }
                        i15 = 0;
                    } else {
                        if (messageObject.replyMessageObject.isFromChannel()) {
                            TLRPC.Chat chat4 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id));
                            if (!messageObject.isOutOwner() && i10 != 2 && chat4 != null) {
                                TLRPC.PeerColor peerColor10 = chat4.color;
                                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                    return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, g6Var);
                                }
                            }
                            if (chat4 != null) {
                                i15 = ChatObject.getColorId(chat4);
                                this.v = ChatObject.getEmojiId(chat4);
                            }
                        }
                        i15 = 0;
                    }
                }
                n(messageObject.replyMessageObject, i15, g6Var);
                this.f30593x = org.telegram.ui.ActionBar.k6.o1(0.1f, this.f30595z);
                this.f30594y = this.f30595z;
            } else {
                this.f30579i = false;
                this.f30580j = false;
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, g6Var);
                this.B = w04;
                this.A = w04;
                this.f30595z = w04;
                this.f30593x = org.telegram.ui.ActionBar.k6.o1(0.1f, w04);
                this.f30594y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, g6Var);
            }
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.f30579i = false;
            this.f30580j = false;
            this.B = -1;
            this.A = -1;
            this.f30595z = -1;
            this.f30593x = 0;
            this.f30594y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xc, g6Var);
        } else if (messageObject.isOutOwner() || i10 == 2) {
            if (i10 == 2 && !messageObject.isOutOwner()) {
                int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.pk, g6Var);
                this.B = w05;
                this.A = w05;
                this.f30595z = w05;
            } else {
                if (!this.f30579i && !this.f30580j) {
                    i12 = org.telegram.ui.ActionBar.k6.f21130ab;
                } else {
                    i12 = org.telegram.ui.ActionBar.k6.f21150bb;
                }
                int w06 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
                this.B = w06;
                this.A = w06;
                this.f30595z = w06;
            }
            if (this.f30580j) {
                this.V = true;
                this.f30595z = org.telegram.ui.ActionBar.k6.o1(0.2f, this.f30595z);
                this.A = org.telegram.ui.ActionBar.k6.o1(0.5f, this.A);
            } else if (this.f30579i) {
                this.V = true;
                this.f30595z = org.telegram.ui.ActionBar.k6.o1(0.35f, this.f30595z);
            }
            int i16 = this.B;
            if (q6) {
                f10 = 0.12f;
            }
            this.f30593x = org.telegram.ui.ActionBar.k6.o1(f10, i16);
            this.f30594y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21170cb, g6Var);
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = messageObject.overrideLinkEmoji;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.f30590t == null && (view = this.D) != null) {
            this.f30590t = new n5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).M0) {
                this.f30590t.a();
            }
        }
        n5 n5Var = this.f30590t;
        if (n5Var != null) {
            z11 = true;
            if (n5Var.j(this.v, true)) {
                this.f30576c0 = false;
            }
        } else {
            z11 = true;
        }
        n5 n5Var2 = this.f30591u;
        if (n5Var2 != null) {
            n5Var2.j(this.f30592w, z11);
        }
        this.C = i();
        return g5Var.a(this.f30594y, false);
    }

    public final void b() {
        sm0 sm0Var;
        if (this.R && this.U != org.telegram.ui.ActionBar.r6.f21818b) {
            try {
                sm0Var = this;
            } catch (Exception e) {
                e = e;
                sm0Var = this;
            }
            try {
                sm0Var.a(null, null, null, this.T, this.S);
            } catch (Exception e7) {
                e = e7;
                sm0Var.R = false;
                FileLog.e(e);
            }
        }
    }

    public final void c(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        d(canvas, rectF, f7, f10, f11, f12, false, false);
    }

    public final void d(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12, boolean z10, boolean z11) {
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f7));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float dp = AndroidUtilities.dp(f10);
        fArr[3] = dp;
        fArr[2] = dp;
        float dp2 = AndroidUtilities.dp(f11);
        fArr[5] = dp2;
        fArr[4] = dp2;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f11));
        fArr[7] = max2;
        fArr[6] = max2;
        e(canvas, rectF, f12, z10, z11);
    }

    public final void e(Canvas canvas, RectF rectF, float f7, boolean z10, boolean z11) {
        boolean z12;
        ci.f3 f3Var;
        float e;
        int i10;
        n5 n5Var;
        float f10;
        b();
        if (!z11) {
            int o12 = org.telegram.ui.ActionBar.k6.o1(f7, this.E.a(this.f30593x, false));
            Paint paint = this.f30578g;
            paint.setColor(o12);
            float[] fArr = this.e;
            if (zf.f0.c(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f30577f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        n5 n5Var2 = this.f30590t;
        if (n5Var2 != null) {
            if (!this.f30576c0) {
                Drawable drawable = n5Var2.f28782f[0];
                if ((drawable instanceof p5) && (f3Var = ((p5) drawable).f29484k) != null && f3Var.hasImageLoaded()) {
                    this.f30576c0 = true;
                } else {
                    z12 = false;
                    e = this.L.e(z12);
                    if (e <= 0.0f && this.f30588r > 0.0f) {
                        if (this.f30572a0 == null) {
                            i10 = 0;
                            this.f30572a0 = new rm0[]{new rm0(4.0f, -6.33f, 1.0f, 1.0f), new rm0(30.0f, 3.0f, 0.78f, 0.9f), new rm0(46.0f, -17.0f, 0.6f, 0.6f), new rm0(69.66f, -0.666f, 0.87f, 0.7f), new rm0(98.0f, -12.6f, 1.03f, 0.3f), new rm0(51.0f, 24.0f, 1.0f, 0.5f), new rm0(6.33f, 20.0f, 0.77f, 0.7f), new rm0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new rm0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i10 = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.f30574b0);
                        float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
                        if (z10) {
                            max -= AndroidUtilities.dp(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
                        n5 n5Var3 = this.f30591u;
                        if (n5Var3 != null) {
                            n5Var3.v = (int) (f7 * 255.0f);
                        }
                        this.f30590t.k(Integer.valueOf(this.C));
                        int i11 = i10;
                        while (true) {
                            rm0[] rm0VarArr = this.f30572a0;
                            if (i11 < rm0VarArr.length) {
                                if (i11 != 0 || (n5Var = this.f30591u) == null || this.f30592w == 0) {
                                    n5Var = this.f30590t;
                                }
                                rm0 rm0Var = rm0VarArr[i11];
                                if (!rm0Var.e || z10) {
                                    if (n5Var == this.f30591u) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.3f;
                                    }
                                    n5Var.v = (int) (f10 * 255.0f * rm0Var.d * this.f30588r);
                                    float dp = max - AndroidUtilities.dp(rm0Var.f30233a);
                                    float dp2 = AndroidUtilities.dp(rm0Var.f30234b) + min;
                                    float dp3 = AndroidUtilities.dp(10.0f) * rm0Var.f30235c * e;
                                    n5Var.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                                    n5Var.draw(canvas);
                                }
                                i11++;
                            } else {
                                canvas.restore();
                                return;
                            }
                        }
                    }
                }
            }
            z12 = true;
            e = this.L.e(z12);
            if (e <= 0.0f) {
            }
        }
    }

    public final void f(android.graphics.Canvas r27, android.graphics.RectF r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sm0.f(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void g(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        aa0 aa0Var;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f7));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float dp = AndroidUtilities.dp(f10);
        fArr[3] = dp;
        fArr[2] = dp;
        float dp2 = AndroidUtilities.dp(f11);
        fArr[5] = dp2;
        fArr[4] = dp2;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f11));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.W && ((aa0Var = this.h) == null || !aa0Var.d())) {
            aa0 aa0Var2 = this.h;
            if (aa0Var2 != null) {
                aa0Var2.f24685b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            aa0 aa0Var3 = new aa0();
            this.h = aa0Var3;
            aa0Var3.D = true;
            aa0Var3.f24700t = 3.5f;
            aa0Var3.f24701u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.k6.o1(0.1f, this.f30595z), org.telegram.ui.ActionBar.k6.o1(0.3f, this.f30595z), org.telegram.ui.ActionBar.k6.o1(0.3f, this.f30595z), org.telegram.ui.ActionBar.k6.o1(1.25f, this.f30595z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f24703x.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f12 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.f30593x;
    }

    public final int i() {
        if (this.V) {
            return this.A;
        }
        return this.f30595z;
    }

    public final void j() {
        long currentTimeMillis = System.currentTimeMillis();
        float e = this.M.e(this.W);
        this.X = (((float) Math.min(30L, currentTimeMillis - this.Z)) * e) + this.X;
        this.Y = (((float) Math.min(30L, currentTimeMillis - this.Z)) * e) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void k(float f7) {
        this.f30574b0 = f7;
    }

    public final void l() {
        this.F.a(this.f30595z, true);
        this.G.a(this.A, true);
        this.J.f(this.f30579i, true);
        this.I.a(this.f30594y, true);
        this.E.a(this.f30593x, true);
        n5 n5Var = this.f30590t;
        if (n5Var != null) {
            n5Var.d.d(1.0f, true);
        }
    }

    public final int m(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.g6 g6Var) {
        boolean q6;
        int i10;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i11;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        if (q6 && (tL_peerColorCollectible.flags & 1) != 0) {
            i10 = tL_peerColorCollectible.dark_accent_color;
        } else {
            i10 = tL_peerColorCollectible.accent_color;
        }
        if (q6 && (tL_peerColorCollectible.flags & 2) != 0) {
            arrayList = tL_peerColorCollectible.dark_colors;
        } else {
            arrayList = tL_peerColorCollectible.colors;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            if (messageObject != null) {
                i11 = messageObject.getId();
            } else {
                i11 = 0;
            }
            if (i11 == this.O) {
                this.f30587q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i11;
        }
        this.V = false;
        this.f30595z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30579i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30580j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i12 = i10 | (-16777216);
        this.f30594y = i12;
        this.f30593x = org.telegram.ui.ActionBar.k6.o1(0.1f, i12);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.f30592w = tL_peerColorCollectible.gift_emoji_id;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        View view = this.D;
        if (i13 != 0 && this.f30590t == null && view != null) {
            this.f30590t = new n5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).M0) {
                this.f30590t.a();
            }
        }
        n5 n5Var = this.f30590t;
        if (n5Var != null && n5Var.j(this.v, true)) {
            this.f30576c0 = false;
        }
        this.C = this.f30594y;
        if (this.f30592w != 0 && this.f30591u == null && view != null) {
            this.f30591u = new n5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).M0) {
                this.f30591u.a();
            }
        }
        n5 n5Var2 = this.f30591u;
        if (n5Var2 != null) {
            n5Var2.j(this.f30592w, true);
        }
        return this.I.a(this.f30594y, false);
    }

    public final void n(MessageObject messageObject, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        MessagesController.PeerColor peerColor;
        boolean z10;
        int i12;
        int i13;
        if (g6Var != null) {
            g6Var.a();
        } else {
            org.telegram.ui.ActionBar.k6.h1();
        }
        boolean z11 = true;
        if (this.P != i10) {
            if (messageObject != null) {
                i13 = messageObject.getId();
            } else {
                i13 = 0;
            }
            if (i13 == this.O) {
                this.f30587q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = i13;
        }
        if (i10 < 7) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21443r8[i10], g6Var);
            this.B = w02;
            this.A = w02;
            this.f30595z = w02;
            this.f30580j = false;
            this.f30579i = false;
            return;
        }
        if (messageObject != null) {
            i11 = messageObject.currentAccount;
        } else {
            i11 = UserConfig.selectedAccount;
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
        if (peerColors != null) {
            peerColor = peerColors.getColor(i10);
        } else {
            peerColor = null;
        }
        if (peerColor == null) {
            if (messageObject != null && messageObject.isOutOwner()) {
                i12 = org.telegram.ui.ActionBar.k6.f21130ab;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.Uc;
            }
            int w03 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
            this.B = w03;
            this.A = w03;
            this.f30595z = w03;
            this.f30580j = false;
            this.f30579i = false;
            return;
        }
        this.f30595z = peerColor.getColor(0, g6Var);
        this.A = peerColor.getColor(1, g6Var);
        int color = peerColor.getColor(2, g6Var);
        this.B = color;
        int i14 = this.A;
        int i15 = this.f30595z;
        if (i14 != i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30579i = z10;
        if (color == i15) {
            z11 = false;
        }
        this.f30580j = z11;
        if (z11) {
            this.B = i14;
            this.A = color;
        }
    }

    public final void o(float f7) {
        this.f30588r = f7;
    }

    public final int p(org.telegram.ui.ActionBar.g6 g6Var) {
        View view;
        this.R = false;
        int i10 = org.telegram.ui.ActionBar.k6.f21422q7;
        this.f30594y = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        this.f30595z = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        this.f30579i = false;
        this.f30580j = false;
        this.f30593x = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        if (this.v != 0 && this.f30590t == null && (view = this.D) != null) {
            this.f30590t = new n5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).M0) {
                this.f30590t.a();
            }
        }
        n5 n5Var = this.f30590t;
        if (n5Var != null && n5Var.j(this.v, true)) {
            this.f30576c0 = false;
        }
        this.C = i();
        return this.I.a(this.f30594y, false);
    }

    public final void q(boolean z10) {
        aa0 aa0Var;
        if (!z10 && this.W) {
            this.X = 0.0f;
            aa0 aa0Var2 = this.h;
            if (aa0Var2 != null) {
                aa0Var2.a();
            }
        } else if (z10 && !this.W && (aa0Var = this.h) != null) {
            aa0Var.f24686c = -1L;
            aa0Var.f24685b = -1L;
        }
        this.W = z10;
    }

    public final void r(int i10, boolean z10) {
        float f7;
        this.R = false;
        this.V = false;
        this.f30580j = false;
        this.f30579i = false;
        this.B = i10;
        this.A = i10;
        this.f30595z = i10;
        if (z10) {
            f7 = 0.12f;
        } else {
            f7 = 0.1f;
        }
        this.f30593x = org.telegram.ui.ActionBar.k6.o1(f7, i10);
        this.C = i10;
    }
}
