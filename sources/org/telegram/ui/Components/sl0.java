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
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class sl0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final h5 E;
    public final h5 F;
    public final h5 G;
    public final h5 H;
    public final h5 I;
    public final e6 J;
    public final e6 K;
    public final e6 L;
    public final e6 M;
    public final e6 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public rl0[] W;
    public float X;
    public boolean Y;
    public h90 h;
    public boolean f30357i;
    public boolean f30358j;
    public Bitmap f30359k;
    public int f30360l;
    public int f30361m;
    public int f30362n;
    public int f30363o;
    public boolean f30364p;
    public boolean f30367s;
    public o5 f30368t;
    public o5 f30369u;
    public long v;
    public long f30370w;
    public int f30371x;
    public int f30372y;
    public int f30373z;
    public final RectF f30351a = new RectF();
    public final Paint f30352b = new Paint(1);
    public final Paint f30353c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] f30354e = new float[8];
    public final Path f30355f = new Path();
    public final Paint f30356g = new Paint();
    public int f30365q = 0;
    public float f30366r = 1.0f;

    public sl0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new bi.i2(this, 7));
        }
        pr prVar = pr.h;
        this.E = new h5(view, 400L, prVar, 0);
        this.F = new h5(view, 400L, prVar, 0);
        this.G = new h5(view, 400L, prVar, 0);
        this.H = new h5(view, 400L, prVar, 0);
        this.I = new h5(view, 400L, prVar, 0);
        this.J = new e6(view, 0L, 400L, prVar);
        this.K = new e6(view, 0L, 400L, prVar);
        this.L = new e6(view, 0L, 440L, prVar);
        this.M = new e6(view, 0L, 320L, prVar);
        this.N = new e6(view, 0L, 320L, prVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        boolean q6;
        boolean z10;
        h5 h5Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        MessageObject messageObject2;
        TLRPC.Message message2;
        int colorId;
        TLRPC.User user2;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        TLRPC.PeerColor peerColor;
        int i11;
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
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        if (messageObject != null && !messageObject.isOutOwner() && i10 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return l(messageObject, tL_peerColorCollectible, f6Var);
        }
        this.R = false;
        this.v = 0L;
        this.f30370w = 0L;
        if (messageObject != null && messageObject.isSponsored()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30367s = z10;
        h5 h5Var2 = this.I;
        float f10 = 0.1f;
        if (messageObject == null) {
            this.f30358j = false;
            this.f30357i = false;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Uc, f6Var);
            this.B = v02;
            this.A = v02;
            this.f30373z = v02;
            if (q6) {
                f7 = 0.12f;
            } else {
                f7 = 0.1f;
            }
            this.f30371x = org.telegram.ui.ActionBar.j6.l1(f7, v02);
            this.C = h();
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wc, f6Var);
            this.f30372y = v03;
            return h5Var2.a(v03, false);
        }
        if (i10 == 4 && (message4 = messageObject.messageOwner) != null && MessageObject.getMedia(message4) != null && (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaContact)) {
            long j3 = MessageObject.getMedia(messageObject.messageOwner).user_id;
            if (j3 != 0) {
                user3 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(j3));
            } else {
                user3 = null;
            }
            if (!messageObject.isOutOwner() && i10 != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, f6Var);
                }
            }
            if (user3 != null) {
                i13 = UserObject.getColorId(user3);
                h5Var = h5Var2;
                this.v = UserObject.getEmojiId(user3);
            } else {
                h5Var = h5Var2;
                i13 = 0;
            }
            m(messageObject, i13, f6Var);
            this.f30371x = org.telegram.ui.ActionBar.j6.l1(0.1f, this.f30373z);
            this.f30372y = this.f30373z;
        } else {
            h5Var = h5Var2;
            if (i10 != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && user4 != null) || ((messageObject.isFromChannel() && chat != null) || (((message3 = messageObject.messageOwner) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (messageObject.isSponsored() && (peerColor2 = messageObject.sponsoredColor) != null && peerColor2.color != -1))))))) {
                int i14 = messageObject.overrideLinkColor;
                if (i14 < 0) {
                    if (messageObject.isSponsored() && (peerColor = messageObject.sponsoredColor) != null && (i11 = peerColor.color) != -1) {
                        if (i10 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                        i14 = i11;
                    } else {
                        TLRPC.Message message5 = messageObject.messageOwner;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            i14 = 5;
                            if (peerDialogId < 0) {
                                TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                                if (!messageObject.isOutOwner() && i10 != 2 && chat2 != null) {
                                    TLRPC.PeerColor peerColor4 = chat2.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, f6Var);
                                    }
                                }
                                if (chat2 != null) {
                                    i14 = ChatObject.getColorId(chat2);
                                }
                                if (i10 == 3) {
                                    this.v = ChatObject.getEmojiId(chat2);
                                }
                            } else {
                                TLRPC.User user5 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                                if (!messageObject.isOutOwner() && i10 != 2 && user5 != null) {
                                    TLRPC.PeerColor peerColor5 = user5.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, f6Var);
                                    }
                                }
                                if (user5 != null) {
                                    i14 = UserObject.getColorId(user5);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, f6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, f6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, f6Var);
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
                }
                m(messageObject, i14, f6Var);
                this.f30371x = org.telegram.ui.ActionBar.j6.l1(0.1f, this.f30373z);
                this.f30372y = this.f30373z;
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
                                return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, f6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, f6Var);
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
                m(messageObject.replyMessageObject, i15, f6Var);
                this.f30371x = org.telegram.ui.ActionBar.j6.l1(0.1f, this.f30373z);
                this.f30372y = this.f30373z;
            } else {
                this.f30357i = false;
                this.f30358j = false;
                int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Uc, f6Var);
                this.B = v04;
                this.A = v04;
                this.f30373z = v04;
                this.f30371x = org.telegram.ui.ActionBar.j6.l1(0.1f, v04);
                this.f30372y = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wc, f6Var);
            }
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.f30357i = false;
            this.f30358j = false;
            this.B = -1;
            this.A = -1;
            this.f30373z = -1;
            this.f30371x = 0;
            this.f30372y = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xc, f6Var);
        } else if (messageObject.isOutOwner() || i10 == 2) {
            if (i10 == 2 && !messageObject.isOutOwner()) {
                int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pk, f6Var);
                this.B = v05;
                this.A = v05;
                this.f30373z = v05;
            } else {
                if (!this.f30357i && !this.f30358j) {
                    i12 = org.telegram.ui.ActionBar.j6.f20611ab;
                } else {
                    i12 = org.telegram.ui.ActionBar.j6.f20631bb;
                }
                int v06 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                this.B = v06;
                this.A = v06;
                this.f30373z = v06;
            }
            if (this.f30358j) {
                this.R = true;
                this.f30373z = org.telegram.ui.ActionBar.j6.l1(0.2f, this.f30373z);
                this.A = org.telegram.ui.ActionBar.j6.l1(0.5f, this.A);
            } else if (this.f30357i) {
                this.R = true;
                this.f30373z = org.telegram.ui.ActionBar.j6.l1(0.35f, this.f30373z);
            }
            int i16 = this.B;
            if (q6) {
                f10 = 0.12f;
            }
            this.f30371x = org.telegram.ui.ActionBar.j6.l1(f10, i16);
            this.f30372y = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cb, f6Var);
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j10 = messageObject.overrideLinkEmoji;
            if (j10 != -1) {
                this.v = j10;
            }
        }
        if (this.v != 0 && this.f30368t == null && (view = this.D) != null) {
            this.f30368t = new o5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).M0) {
                this.f30368t.a();
            }
        }
        o5 o5Var = this.f30368t;
        if (o5Var != null) {
            z11 = true;
            if (o5Var.j(this.v, true)) {
                this.Y = false;
            }
        } else {
            z11 = true;
        }
        o5 o5Var2 = this.f30369u;
        if (o5Var2 != null) {
            o5Var2.j(this.f30370w, z11);
        }
        this.C = h();
        return h5Var.a(this.f30372y, false);
    }

    public final void b(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12) {
        c(canvas, rectF, f7, f10, f11, f12, false, false);
    }

    public final void c(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12, boolean z10, boolean z11) {
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f7));
        float[] fArr = this.f30354e;
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
        d(canvas, rectF, f12, z10, z11);
    }

    public final void d(Canvas canvas, RectF rectF, float f7, boolean z10, boolean z11) {
        boolean z12;
        bi.y3 y3Var;
        float e7;
        o5 o5Var;
        float f10;
        if (!z11) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(f7, this.E.a(this.f30371x, false));
            Paint paint = this.f30356g;
            paint.setColor(l1);
            float[] fArr = this.f30354e;
            if (yf.f0.c(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f30355f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        o5 o5Var2 = this.f30368t;
        if (o5Var2 != null) {
            if (!this.Y) {
                Drawable drawable = o5Var2.f28961f[0];
                if ((drawable instanceof q5) && (y3Var = ((q5) drawable).f29584k) != null && y3Var.hasImageLoaded()) {
                    this.Y = true;
                } else {
                    z12 = false;
                    e7 = this.L.e(z12);
                    if (e7 <= 0.0f && this.f30366r > 0.0f) {
                        if (this.W == null) {
                            this.W = new rl0[]{new rl0(4.0f, -6.33f, 1.0f, 1.0f), new rl0(30.0f, 3.0f, 0.78f, 0.9f), new rl0(46.0f, -17.0f, 0.6f, 0.6f), new rl0(69.66f, -0.666f, 0.87f, 0.7f), new rl0(98.0f, -12.6f, 1.03f, 0.3f), new rl0(51.0f, 24.0f, 1.0f, 0.5f), new rl0(6.33f, 20.0f, 0.77f, 0.7f), new rl0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new rl0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.X);
                        float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
                        if (z10) {
                            max -= AndroidUtilities.dp(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
                        o5 o5Var3 = this.f30369u;
                        if (o5Var3 != null) {
                            o5Var3.v = (int) (f7 * 255.0f);
                        }
                        this.f30368t.k(Integer.valueOf(this.C));
                        int i10 = 0;
                        while (true) {
                            rl0[] rl0VarArr = this.W;
                            if (i10 < rl0VarArr.length) {
                                if (i10 != 0 || (o5Var = this.f30369u) == null || this.f30370w == 0) {
                                    o5Var = this.f30368t;
                                }
                                rl0 rl0Var = rl0VarArr[i10];
                                if (!rl0Var.f30048e || z10) {
                                    if (o5Var == this.f30369u) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.3f;
                                    }
                                    o5Var.v = (int) (f10 * 255.0f * rl0Var.d * this.f30366r);
                                    float dp = max - AndroidUtilities.dp(rl0Var.f30045a);
                                    float dp2 = AndroidUtilities.dp(rl0Var.f30046b) + min;
                                    float dp3 = AndroidUtilities.dp(10.0f) * rl0Var.f30047c * e7;
                                    o5Var.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                                    o5Var.draw(canvas);
                                }
                                i10++;
                            } else {
                                canvas.restore();
                                return;
                            }
                        }
                    }
                }
            }
            z12 = true;
            e7 = this.L.e(z12);
            if (e7 <= 0.0f) {
            }
        }
    }

    public final void e(android.graphics.Canvas r27, android.graphics.RectF r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sl0.e(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void f(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12) {
        h90 h90Var;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f7));
        float[] fArr = this.f30354e;
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
        if (!this.S && ((h90Var = this.h) == null || !h90Var.c())) {
            h90 h90Var2 = this.h;
            if (h90Var2 != null) {
                h90Var2.f26672b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            h90 h90Var3 = new h90();
            this.h = h90Var3;
            h90Var3.C = true;
            h90Var3.f26688t = 3.5f;
            h90Var3.f26689u = 0.5f;
        }
        this.h.f(org.telegram.ui.ActionBar.j6.l1(0.1f, this.f30373z), org.telegram.ui.ActionBar.j6.l1(0.3f, this.f30373z), org.telegram.ui.ActionBar.j6.l1(0.3f, this.f30373z), org.telegram.ui.ActionBar.j6.l1(1.25f, this.f30373z));
        this.h.d(rectF);
        this.h.i(fArr);
        this.h.f26690w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f12 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int g() {
        return this.f30371x;
    }

    public final int h() {
        if (this.R) {
            return this.A;
        }
        return this.f30373z;
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        float e7 = this.M.e(this.S);
        this.T = (((float) Math.min(30L, currentTimeMillis - this.V)) * e7) + this.T;
        this.U = (((float) Math.min(30L, currentTimeMillis - this.V)) * e7) + this.U;
        this.V = currentTimeMillis;
    }

    public final void j(float f7) {
        this.X = f7;
    }

    public final void k() {
        this.F.a(this.f30373z, true);
        this.G.a(this.A, true);
        this.J.f(this.f30357i, true);
        this.I.a(this.f30372y, true);
        this.E.a(this.f30371x, true);
        o5 o5Var = this.f30368t;
        if (o5Var != null) {
            o5Var.d.d(1.0f, true);
        }
    }

    public final int l(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean q6;
        int i10;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i11;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
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
                this.f30365q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i11;
        }
        this.R = false;
        this.f30373z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30357i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30358j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i12 = i10 | (-16777216);
        this.f30372y = i12;
        this.f30371x = org.telegram.ui.ActionBar.j6.l1(0.1f, i12);
        long j3 = tL_peerColorCollectible.background_emoji_id;
        this.v = j3;
        this.f30370w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j3 != 0 && this.f30368t == null && view != null) {
            this.f30368t = new o5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).M0) {
                this.f30368t.a();
            }
        }
        o5 o5Var = this.f30368t;
        if (o5Var != null && o5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = this.f30372y;
        if (this.f30370w != 0 && this.f30369u == null && view != null) {
            this.f30369u = new o5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).M0) {
                this.f30369u.a();
            }
        }
        o5 o5Var2 = this.f30369u;
        if (o5Var2 != null) {
            o5Var2.j(this.f30370w, true);
        }
        return this.I.a(this.f30372y, false);
    }

    public final void m(MessageObject messageObject, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        MessagesController.PeerColor peerColor;
        boolean z10;
        int i12;
        int i13;
        if (f6Var != null) {
            f6Var.a();
        } else {
            org.telegram.ui.ActionBar.j6.e1();
        }
        boolean z11 = true;
        if (this.P != i10) {
            if (messageObject != null) {
                i13 = messageObject.getId();
            } else {
                i13 = 0;
            }
            if (i13 == this.O) {
                this.f30365q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = i13;
        }
        if (i10 < 7) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20918r8[i10], f6Var);
            this.B = v02;
            this.A = v02;
            this.f30373z = v02;
            this.f30358j = false;
            this.f30357i = false;
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
                i12 = org.telegram.ui.ActionBar.j6.f20611ab;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.Uc;
            }
            int v03 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            this.B = v03;
            this.A = v03;
            this.f30373z = v03;
            this.f30358j = false;
            this.f30357i = false;
            return;
        }
        this.f30373z = peerColor.getColor(0, f6Var);
        this.A = peerColor.getColor(1, f6Var);
        int color = peerColor.getColor(2, f6Var);
        this.B = color;
        int i14 = this.A;
        int i15 = this.f30373z;
        if (i14 != i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30357i = z10;
        if (color == i15) {
            z11 = false;
        }
        this.f30358j = z11;
        if (z11) {
            this.B = i14;
            this.A = color;
        }
    }

    public final void n(float f7) {
        this.f30366r = f7;
    }

    public final int o(org.telegram.ui.ActionBar.f6 f6Var) {
        View view;
        int i10 = org.telegram.ui.ActionBar.j6.f20898q7;
        this.f30372y = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        this.f30373z = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        this.f30357i = false;
        this.f30358j = false;
        this.f30371x = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        if (this.v != 0 && this.f30368t == null && (view = this.D) != null) {
            this.f30368t = new o5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).M0) {
                this.f30368t.a();
            }
        }
        o5 o5Var = this.f30368t;
        if (o5Var != null && o5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = h();
        return this.I.a(this.f30372y, false);
    }

    public final void p(boolean z10) {
        h90 h90Var;
        if (!z10 && this.S) {
            this.T = 0.0f;
            h90 h90Var2 = this.h;
            if (h90Var2 != null) {
                h90Var2.a();
            }
        } else if (z10 && !this.S && (h90Var = this.h) != null) {
            h90Var.f26673c = -1L;
            h90Var.f26672b = -1L;
        }
        this.S = z10;
    }

    public final void q(int i10, boolean z10) {
        float f7;
        this.R = false;
        this.f30358j = false;
        this.f30357i = false;
        this.B = i10;
        this.A = i10;
        this.f30373z = i10;
        if (z10) {
            f7 = 0.12f;
        } else {
            f7 = 0.1f;
        }
        this.f30371x = org.telegram.ui.ActionBar.j6.l1(f7, i10);
        this.C = i10;
    }
}
