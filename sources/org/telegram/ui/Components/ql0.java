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
public final class ql0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final f5 E;
    public final f5 F;
    public final f5 G;
    public final f5 H;
    public final f5 I;
    public final d6 J;
    public final d6 K;
    public final d6 L;
    public final d6 M;
    public final d6 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public pl0[] W;
    public float X;
    public boolean Y;
    public c90 h;
    public boolean f31990i;
    public boolean f31991j;
    public Bitmap f31992k;
    public int f31993l;
    public int f31994m;
    public int f31995n;
    public int f31996o;
    public boolean f31997p;
    public boolean f32000s;
    public n5 f32001t;
    public n5 f32002u;
    public long v;
    public long f32003w;
    public int f32004x;
    public int f32005y;
    public int f32006z;
    public final RectF f31984a = new RectF();
    public final Paint f31985b = new Paint(1);
    public final Paint f31986c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] f31987e = new float[8];
    public final Path f31988f = new Path();
    public final Paint f31989g = new Paint();
    public int f31998q = 0;
    public float f31999r = 1.0f;

    public ql0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new df.b(this, 12));
        }
        jr jrVar = jr.h;
        this.E = new f5(view, 400L, jrVar, 0);
        this.F = new f5(view, 400L, jrVar, 0);
        this.G = new f5(view, 400L, jrVar, 0);
        this.H = new f5(view, 400L, jrVar, 0);
        this.I = new f5(view, 400L, jrVar, 0);
        this.J = new d6(view, 0L, 400L, jrVar);
        this.K = new d6(view, 0L, 400L, jrVar);
        this.L = new d6(view, 0L, 440L, jrVar);
        this.M = new d6(view, 0L, 320L, jrVar);
        this.N = new d6(view, 0L, 320L, jrVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        boolean q6;
        boolean z10;
        f5 f5Var;
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
        float f9;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user4 = user;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        if (messageObject != null && !messageObject.isOutOwner() && i10 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return l(messageObject, tL_peerColorCollectible, c6Var);
        }
        this.R = false;
        this.v = 0L;
        this.f32003w = 0L;
        if (messageObject != null && messageObject.isSponsored()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32000s = z10;
        f5 f5Var2 = this.I;
        float f10 = 0.1f;
        if (messageObject == null) {
            this.f31991j = false;
            this.f31990i = false;
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Uc, c6Var);
            this.B = v02;
            this.A = v02;
            this.f32006z = v02;
            if (q6) {
                f9 = 0.12f;
            } else {
                f9 = 0.1f;
            }
            this.f32004x = org.telegram.ui.ActionBar.g6.l1(f9, v02);
            this.C = h();
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wc, c6Var);
            this.f32005y = v03;
            return f5Var2.a(v03, false);
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
                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, c6Var);
                }
            }
            if (user3 != null) {
                i13 = UserObject.getColorId(user3);
                f5Var = f5Var2;
                this.v = UserObject.getEmojiId(user3);
            } else {
                f5Var = f5Var2;
                i13 = 0;
            }
            m(messageObject, i13, c6Var);
            this.f32004x = org.telegram.ui.ActionBar.g6.l1(0.1f, this.f32006z);
            this.f32005y = this.f32006z;
        } else {
            f5Var = f5Var2;
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
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, c6Var);
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
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, c6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, c6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, c6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, c6Var);
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
                m(messageObject, i14, c6Var);
                this.f32004x = org.telegram.ui.ActionBar.g6.l1(0.1f, this.f32006z);
                this.f32005y = this.f32006z;
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
                                return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, c6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, c6Var);
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
                m(messageObject.replyMessageObject, i15, c6Var);
                this.f32004x = org.telegram.ui.ActionBar.g6.l1(0.1f, this.f32006z);
                this.f32005y = this.f32006z;
            } else {
                this.f31990i = false;
                this.f31991j = false;
                int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Uc, c6Var);
                this.B = v04;
                this.A = v04;
                this.f32006z = v04;
                this.f32004x = org.telegram.ui.ActionBar.g6.l1(0.1f, v04);
                this.f32005y = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wc, c6Var);
            }
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.f31990i = false;
            this.f31991j = false;
            this.B = -1;
            this.A = -1;
            this.f32006z = -1;
            this.f32004x = 0;
            this.f32005y = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xc, c6Var);
        } else if (messageObject.isOutOwner() || i10 == 2) {
            if (i10 == 2 && !messageObject.isOutOwner()) {
                int v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.pk, c6Var);
                this.B = v05;
                this.A = v05;
                this.f32006z = v05;
            } else {
                if (!this.f31990i && !this.f31991j) {
                    i12 = org.telegram.ui.ActionBar.g6.f23013ab;
                } else {
                    i12 = org.telegram.ui.ActionBar.g6.f23032bb;
                }
                int v06 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
                this.B = v06;
                this.A = v06;
                this.f32006z = v06;
            }
            if (this.f31991j) {
                this.R = true;
                this.f32006z = org.telegram.ui.ActionBar.g6.l1(0.2f, this.f32006z);
                this.A = org.telegram.ui.ActionBar.g6.l1(0.5f, this.A);
            } else if (this.f31990i) {
                this.R = true;
                this.f32006z = org.telegram.ui.ActionBar.g6.l1(0.35f, this.f32006z);
            }
            int i16 = this.B;
            if (q6) {
                f10 = 0.12f;
            }
            this.f32004x = org.telegram.ui.ActionBar.g6.l1(f10, i16);
            this.f32005y = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23049cb, c6Var);
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = messageObject.overrideLinkEmoji;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.f32001t == null && (view = this.D) != null) {
            this.f32001t = new n5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).I0) {
                this.f32001t.a();
            }
        }
        n5 n5Var = this.f32001t;
        if (n5Var != null) {
            z11 = true;
            if (n5Var.j(this.v, true)) {
                this.Y = false;
            }
        } else {
            z11 = true;
        }
        n5 n5Var2 = this.f32002u;
        if (n5Var2 != null) {
            n5Var2.j(this.f32003w, z11);
        }
        this.C = h();
        return f5Var.a(this.f32005y, false);
    }

    public final void b(Canvas canvas, RectF rectF, float f9, float f10, float f11, float f12) {
        c(canvas, rectF, f9, f10, f11, f12, false, false);
    }

    public final void c(Canvas canvas, RectF rectF, float f9, float f10, float f11, float f12, boolean z10, boolean z11) {
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f9));
        float[] fArr = this.f31987e;
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

    public final void d(Canvas canvas, RectF rectF, float f9, boolean z10, boolean z11) {
        boolean z12;
        lh.x2 x2Var;
        float e10;
        n5 n5Var;
        float f10;
        if (!z11) {
            int l1 = org.telegram.ui.ActionBar.g6.l1(f9, this.E.a(this.f32004x, false));
            Paint paint = this.f31989g;
            paint.setColor(l1);
            float[] fArr = this.f31987e;
            if (jf.l0.c(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f31988f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        n5 n5Var2 = this.f32001t;
        if (n5Var2 != null) {
            if (!this.Y) {
                Drawable drawable = n5Var2.f30849f[0];
                if ((drawable instanceof p5) && (x2Var = ((p5) drawable).f31593k) != null && x2Var.hasImageLoaded()) {
                    this.Y = true;
                } else {
                    z12 = false;
                    e10 = this.L.e(z12);
                    if (e10 <= 0.0f && this.f31999r > 0.0f) {
                        if (this.W == null) {
                            this.W = new pl0[]{new pl0(4.0f, -6.33f, 1.0f, 1.0f), new pl0(30.0f, 3.0f, 0.78f, 0.9f), new pl0(46.0f, -17.0f, 0.6f, 0.6f), new pl0(69.66f, -0.666f, 0.87f, 0.7f), new pl0(98.0f, -12.6f, 1.03f, 0.3f), new pl0(51.0f, 24.0f, 1.0f, 0.5f), new pl0(6.33f, 20.0f, 0.77f, 0.7f), new pl0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new pl0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.X);
                        float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
                        if (z10) {
                            max -= AndroidUtilities.dp(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
                        n5 n5Var3 = this.f32002u;
                        if (n5Var3 != null) {
                            n5Var3.v = (int) (f9 * 255.0f);
                        }
                        this.f32001t.k(Integer.valueOf(this.C));
                        int i10 = 0;
                        while (true) {
                            pl0[] pl0VarArr = this.W;
                            if (i10 < pl0VarArr.length) {
                                if (i10 != 0 || (n5Var = this.f32002u) == null || this.f32003w == 0) {
                                    n5Var = this.f32001t;
                                }
                                pl0 pl0Var = pl0VarArr[i10];
                                if (!pl0Var.f31709e || z10) {
                                    if (n5Var == this.f32002u) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.3f;
                                    }
                                    n5Var.v = (int) (f10 * 255.0f * pl0Var.d * this.f31999r);
                                    float dp = max - AndroidUtilities.dp(pl0Var.f31706a);
                                    float dp2 = AndroidUtilities.dp(pl0Var.f31707b) + min;
                                    float dp3 = AndroidUtilities.dp(10.0f) * pl0Var.f31708c * e10;
                                    n5Var.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                                    n5Var.draw(canvas);
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
            e10 = this.L.e(z12);
            if (e10 <= 0.0f) {
            }
        }
    }

    public final void e(android.graphics.Canvas r27, android.graphics.RectF r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ql0.e(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void f(Canvas canvas, RectF rectF, float f9, float f10, float f11, float f12) {
        c90 c90Var;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f9));
        float[] fArr = this.f31987e;
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
        if (!this.S && ((c90Var = this.h) == null || !c90Var.c())) {
            c90 c90Var2 = this.h;
            if (c90Var2 != null) {
                c90Var2.f27381b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            c90 c90Var3 = new c90();
            this.h = c90Var3;
            c90Var3.C = true;
            c90Var3.f27397t = 3.5f;
            c90Var3.f27398u = 0.5f;
        }
        this.h.f(org.telegram.ui.ActionBar.g6.l1(0.1f, this.f32006z), org.telegram.ui.ActionBar.g6.l1(0.3f, this.f32006z), org.telegram.ui.ActionBar.g6.l1(0.3f, this.f32006z), org.telegram.ui.ActionBar.g6.l1(1.25f, this.f32006z));
        this.h.d(rectF);
        this.h.i(fArr);
        this.h.f27399w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f12 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int g() {
        return this.f32004x;
    }

    public final int h() {
        if (this.R) {
            return this.A;
        }
        return this.f32006z;
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        float e10 = this.M.e(this.S);
        this.T = (((float) Math.min(30L, currentTimeMillis - this.V)) * e10) + this.T;
        this.U = (((float) Math.min(30L, currentTimeMillis - this.V)) * e10) + this.U;
        this.V = currentTimeMillis;
    }

    public final void j(float f9) {
        this.X = f9;
    }

    public final void k() {
        this.F.a(this.f32006z, true);
        this.G.a(this.A, true);
        this.J.f(this.f31990i, true);
        this.I.a(this.f32005y, true);
        this.E.a(this.f32004x, true);
        n5 n5Var = this.f32001t;
        if (n5Var != null) {
            n5Var.d.d(1.0f, true);
        }
    }

    public final int l(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.c6 c6Var) {
        boolean q6;
        int i10;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i11;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
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
                this.f31998q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i11;
        }
        this.R = false;
        this.f32006z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31990i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31991j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i12 = i10 | (-16777216);
        this.f32005y = i12;
        this.f32004x = org.telegram.ui.ActionBar.g6.l1(0.1f, i12);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.f32003w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j10 != 0 && this.f32001t == null && view != null) {
            this.f32001t = new n5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).I0) {
                this.f32001t.a();
            }
        }
        n5 n5Var = this.f32001t;
        if (n5Var != null && n5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = this.f32005y;
        if (this.f32003w != 0 && this.f32002u == null && view != null) {
            this.f32002u = new n5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).I0) {
                this.f32002u.a();
            }
        }
        n5 n5Var2 = this.f32002u;
        if (n5Var2 != null) {
            n5Var2.j(this.f32003w, true);
        }
        return this.I.a(this.f32005y, false);
    }

    public final void m(MessageObject messageObject, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        MessagesController.PeerColor peerColor;
        boolean z10;
        int i12;
        int i13;
        if (c6Var != null) {
            c6Var.a();
        } else {
            org.telegram.ui.ActionBar.g6.e1();
        }
        boolean z11 = true;
        if (this.P != i10) {
            if (messageObject != null) {
                i13 = messageObject.getId();
            } else {
                i13 = 0;
            }
            if (i13 == this.O) {
                this.f31998q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = i13;
        }
        if (i10 < 7) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23312r8[i10], c6Var);
            this.B = v02;
            this.A = v02;
            this.f32006z = v02;
            this.f31991j = false;
            this.f31990i = false;
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
                i12 = org.telegram.ui.ActionBar.g6.f23013ab;
            } else {
                i12 = org.telegram.ui.ActionBar.g6.Uc;
            }
            int v03 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
            this.B = v03;
            this.A = v03;
            this.f32006z = v03;
            this.f31991j = false;
            this.f31990i = false;
            return;
        }
        this.f32006z = peerColor.getColor(0, c6Var);
        this.A = peerColor.getColor(1, c6Var);
        int color = peerColor.getColor(2, c6Var);
        this.B = color;
        int i14 = this.A;
        int i15 = this.f32006z;
        if (i14 != i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31990i = z10;
        if (color == i15) {
            z11 = false;
        }
        this.f31991j = z11;
        if (z11) {
            this.B = i14;
            this.A = color;
        }
    }

    public final void n(float f9) {
        this.f31999r = f9;
    }

    public final int o(org.telegram.ui.ActionBar.c6 c6Var) {
        View view;
        int i10 = org.telegram.ui.ActionBar.g6.f23295q7;
        this.f32005y = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        this.f32006z = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        this.f31990i = false;
        this.f31991j = false;
        this.f32004x = org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        if (this.v != 0 && this.f32001t == null && (view = this.D) != null) {
            this.f32001t = new n5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).I0) {
                this.f32001t.a();
            }
        }
        n5 n5Var = this.f32001t;
        if (n5Var != null && n5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = h();
        return this.I.a(this.f32005y, false);
    }

    public final void p(boolean z10) {
        c90 c90Var;
        if (!z10 && this.S) {
            this.T = 0.0f;
            c90 c90Var2 = this.h;
            if (c90Var2 != null) {
                c90Var2.a();
            }
        } else if (z10 && !this.S && (c90Var = this.h) != null) {
            c90Var.f27382c = -1L;
            c90Var.f27381b = -1L;
        }
        this.S = z10;
    }

    public final void q(int i10, boolean z10) {
        float f9;
        this.R = false;
        this.f31991j = false;
        this.f31990i = false;
        this.B = i10;
        this.A = i10;
        this.f32006z = i10;
        if (z10) {
            f9 = 0.12f;
        } else {
            f9 = 0.1f;
        }
        this.f32004x = org.telegram.ui.ActionBar.g6.l1(f9, i10);
        this.C = i10;
    }
}
