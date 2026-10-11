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
public final class zm0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final j5 E;
    public final j5 F;
    public final j5 G;
    public final j5 H;
    public final j5 I;
    public final g6 J;
    public final g6 K;
    public final g6 L;
    public final g6 M;
    public final g6 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public ym0[] W;
    public float X;
    public boolean Y;
    public ja0 h;
    public boolean f33600i;
    public boolean f33601j;
    public Bitmap f33602k;
    public int f33603l;
    public int f33604m;
    public int f33605n;
    public int f33606o;
    public boolean f33607p;
    public boolean f33610s;
    public q5 f33611t;
    public q5 f33612u;
    public long v;
    public long f33613w;
    public int f33614x;
    public int f33615y;
    public int f33616z;
    public final RectF f33594a = new RectF();
    public final Paint f33595b = new Paint(1);
    public final Paint f33596c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] f33597e = new float[8];
    public final Path f33598f = new Path();
    public final Paint f33599g = new Paint();
    public int f33608q = 0;
    public float f33609r = 1.0f;

    public zm0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new ai.v2(this, 8));
        }
        is isVar = is.h;
        this.E = new j5(view, 400L, isVar, 0);
        this.F = new j5(view, 400L, isVar, 0);
        this.G = new j5(view, 400L, isVar, 0);
        this.H = new j5(view, 400L, isVar, 0);
        this.I = new j5(view, 400L, isVar, 0);
        this.J = new g6(view, 0L, 400L, isVar);
        this.K = new g6(view, 0L, 400L, isVar);
        this.L = new g6(view, 0L, 440L, isVar);
        this.M = new g6(view, 0L, 320L, isVar);
        this.N = new g6(view, 0L, 320L, isVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        boolean q6;
        boolean z10;
        j5 j5Var;
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
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        if (messageObject != null && !messageObject.isOutOwner() && i10 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return l(messageObject, tL_peerColorCollectible, d6Var);
        }
        this.R = false;
        this.v = 0L;
        this.f33613w = 0L;
        if (messageObject != null && messageObject.isSponsored()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33610s = z10;
        j5 j5Var2 = this.I;
        float f10 = 0.1f;
        if (messageObject == null) {
            this.f33601j = false;
            this.f33600i = false;
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Uc, d6Var);
            this.B = w02;
            this.A = w02;
            this.f33616z = w02;
            if (q6) {
                f7 = 0.12f;
            } else {
                f7 = 0.1f;
            }
            this.f33614x = org.telegram.ui.ActionBar.h6.m1(f7, w02);
            this.C = h();
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wc, d6Var);
            this.f33615y = w03;
            return j5Var2.a(w03, false);
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
                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, d6Var);
                }
            }
            if (user3 != null) {
                i13 = UserObject.getColorId(user3);
                j5Var = j5Var2;
                this.v = UserObject.getEmojiId(user3);
            } else {
                j5Var = j5Var2;
                i13 = 0;
            }
            m(messageObject, i13, d6Var);
            this.f33614x = org.telegram.ui.ActionBar.h6.m1(0.1f, this.f33616z);
            this.f33615y = this.f33616z;
        } else {
            j5Var = j5Var2;
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
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, d6Var);
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
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, d6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, d6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, d6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, d6Var);
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
                m(messageObject, i14, d6Var);
                this.f33614x = org.telegram.ui.ActionBar.h6.m1(0.1f, this.f33616z);
                this.f33615y = this.f33616z;
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
                                return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, d6Var);
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, d6Var);
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
                m(messageObject.replyMessageObject, i15, d6Var);
                this.f33614x = org.telegram.ui.ActionBar.h6.m1(0.1f, this.f33616z);
                this.f33615y = this.f33616z;
            } else {
                this.f33600i = false;
                this.f33601j = false;
                int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Uc, d6Var);
                this.B = w04;
                this.A = w04;
                this.f33616z = w04;
                this.f33614x = org.telegram.ui.ActionBar.h6.m1(0.1f, w04);
                this.f33615y = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wc, d6Var);
            }
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.f33600i = false;
            this.f33601j = false;
            this.B = -1;
            this.A = -1;
            this.f33616z = -1;
            this.f33614x = 0;
            this.f33615y = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xc, d6Var);
        } else if (messageObject.isOutOwner() || i10 == 2) {
            if (i10 == 2 && !messageObject.isOutOwner()) {
                int w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.pk, d6Var);
                this.B = w05;
                this.A = w05;
                this.f33616z = w05;
            } else {
                if (!this.f33600i && !this.f33601j) {
                    i12 = org.telegram.ui.ActionBar.h6.f20734ab;
                } else {
                    i12 = org.telegram.ui.ActionBar.h6.f20754bb;
                }
                int w06 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
                this.B = w06;
                this.A = w06;
                this.f33616z = w06;
            }
            if (this.f33601j) {
                this.R = true;
                this.f33616z = org.telegram.ui.ActionBar.h6.m1(0.2f, this.f33616z);
                this.A = org.telegram.ui.ActionBar.h6.m1(0.5f, this.A);
            } else if (this.f33600i) {
                this.R = true;
                this.f33616z = org.telegram.ui.ActionBar.h6.m1(0.35f, this.f33616z);
            }
            int i16 = this.B;
            if (q6) {
                f10 = 0.12f;
            }
            this.f33614x = org.telegram.ui.ActionBar.h6.m1(f10, i16);
            this.f33615y = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.cb, d6Var);
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j10 = messageObject.overrideLinkEmoji;
            if (j10 != -1) {
                this.v = j10;
            }
        }
        if (this.v != 0 && this.f33611t == null && (view = this.D) != null) {
            this.f33611t = new q5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.f33611t.a();
            }
        }
        q5 q5Var = this.f33611t;
        if (q5Var != null) {
            z11 = true;
            if (q5Var.j(this.v, true)) {
                this.Y = false;
            }
        } else {
            z11 = true;
        }
        q5 q5Var2 = this.f33612u;
        if (q5Var2 != null) {
            q5Var2.j(this.f33613w, z11);
        }
        this.C = h();
        return j5Var.a(this.f33615y, false);
    }

    public final void b(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12) {
        c(canvas, rectF, f7, f10, f11, f12, false, false);
    }

    public final void c(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12, boolean z10, boolean z11) {
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f7));
        float[] fArr = this.f33597e;
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
        ai.m4 m4Var;
        float e7;
        int i10;
        q5 q5Var;
        float f10;
        if (!z11) {
            int m12 = org.telegram.ui.ActionBar.h6.m1(f7, this.E.a(this.f33614x, false));
            Paint paint = this.f33599g;
            paint.setColor(m12);
            float[] fArr = this.f33597e;
            if (yf.e0.c(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f33598f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        q5 q5Var2 = this.f33611t;
        if (q5Var2 != null) {
            if (!this.Y) {
                Drawable drawable = q5Var2.f29998f[0];
                if ((drawable instanceof s5) && (m4Var = ((s5) drawable).f30634k) != null && m4Var.hasImageLoaded()) {
                    this.Y = true;
                } else {
                    z12 = false;
                    e7 = this.L.e(z12);
                    if (e7 <= 0.0f && this.f33609r > 0.0f) {
                        if (this.W == null) {
                            i10 = 0;
                            this.W = new ym0[]{new ym0(4.0f, -6.33f, 1.0f, 1.0f), new ym0(30.0f, 3.0f, 0.78f, 0.9f), new ym0(46.0f, -17.0f, 0.6f, 0.6f), new ym0(69.66f, -0.666f, 0.87f, 0.7f), new ym0(98.0f, -12.6f, 1.03f, 0.3f), new ym0(51.0f, 24.0f, 1.0f, 0.5f), new ym0(6.33f, 20.0f, 0.77f, 0.7f), new ym0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new ym0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i10 = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.X);
                        float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
                        if (z10) {
                            max -= AndroidUtilities.dp(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
                        q5 q5Var3 = this.f33612u;
                        if (q5Var3 != null) {
                            q5Var3.v = (int) (f7 * 255.0f);
                        }
                        this.f33611t.k(Integer.valueOf(this.C));
                        int i11 = i10;
                        while (true) {
                            ym0[] ym0VarArr = this.W;
                            if (i11 < ym0VarArr.length) {
                                if (i11 != 0 || (q5Var = this.f33612u) == null || this.f33613w == 0) {
                                    q5Var = this.f33611t;
                                }
                                ym0 ym0Var = ym0VarArr[i11];
                                if (!ym0Var.f33307e || z10) {
                                    if (q5Var == this.f33612u) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.3f;
                                    }
                                    q5Var.v = (int) (f10 * 255.0f * ym0Var.d * this.f33609r);
                                    float dp = max - AndroidUtilities.dp(ym0Var.f33304a);
                                    float dp2 = AndroidUtilities.dp(ym0Var.f33305b) + min;
                                    float dp3 = AndroidUtilities.dp(10.0f) * ym0Var.f33306c * e7;
                                    q5Var.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                                    q5Var.draw(canvas);
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
            e7 = this.L.e(z12);
            if (e7 <= 0.0f) {
            }
        }
    }

    public final void e(android.graphics.Canvas r27, android.graphics.RectF r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zm0.e(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void f(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12) {
        ja0 ja0Var;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f7));
        float[] fArr = this.f33597e;
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
        if (!this.S && ((ja0Var = this.h) == null || !ja0Var.d())) {
            ja0 ja0Var2 = this.h;
            if (ja0Var2 != null) {
                ja0Var2.f27640b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            ja0 ja0Var3 = new ja0();
            this.h = ja0Var3;
            ja0Var3.D = true;
            ja0Var3.f27656t = 3.5f;
            ja0Var3.f27657u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.h6.m1(0.1f, this.f33616z), org.telegram.ui.ActionBar.h6.m1(0.3f, this.f33616z), org.telegram.ui.ActionBar.h6.m1(0.3f, this.f33616z), org.telegram.ui.ActionBar.h6.m1(1.25f, this.f33616z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f27659x.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f12 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int g() {
        return this.f33614x;
    }

    public final int h() {
        if (this.R) {
            return this.A;
        }
        return this.f33616z;
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
        this.F.a(this.f33616z, true);
        this.G.a(this.A, true);
        this.J.f(this.f33600i, true);
        this.I.a(this.f33615y, true);
        this.E.a(this.f33614x, true);
        q5 q5Var = this.f33611t;
        if (q5Var != null) {
            q5Var.d.d(1.0f, true);
        }
    }

    public final int l(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.d6 d6Var) {
        boolean q6;
        int i10;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i11;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
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
                this.f33608q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i11;
        }
        this.R = false;
        this.f33616z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33600i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33601j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i12 = i10 | (-16777216);
        this.f33615y = i12;
        this.f33614x = org.telegram.ui.ActionBar.h6.m1(0.1f, i12);
        long j3 = tL_peerColorCollectible.background_emoji_id;
        this.v = j3;
        this.f33613w = tL_peerColorCollectible.gift_emoji_id;
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        View view = this.D;
        if (i13 != 0 && this.f33611t == null && view != null) {
            this.f33611t = new q5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.f33611t.a();
            }
        }
        q5 q5Var = this.f33611t;
        if (q5Var != null && q5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = this.f33615y;
        if (this.f33613w != 0 && this.f33612u == null && view != null) {
            this.f33612u = new q5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.f33612u.a();
            }
        }
        q5 q5Var2 = this.f33612u;
        if (q5Var2 != null) {
            q5Var2.j(this.f33613w, true);
        }
        return this.I.a(this.f33615y, false);
    }

    public final void m(MessageObject messageObject, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        MessagesController.PeerColor peerColor;
        boolean z10;
        int i12;
        int i13;
        if (d6Var != null) {
            d6Var.a();
        } else {
            org.telegram.ui.ActionBar.h6.f1();
        }
        boolean z11 = true;
        if (this.P != i10) {
            if (messageObject != null) {
                i13 = messageObject.getId();
            } else {
                i13 = 0;
            }
            if (i13 == this.O) {
                this.f33608q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = i13;
        }
        if (i10 < 7) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21047r8[i10], d6Var);
            this.B = w02;
            this.A = w02;
            this.f33616z = w02;
            this.f33601j = false;
            this.f33600i = false;
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
                i12 = org.telegram.ui.ActionBar.h6.f20734ab;
            } else {
                i12 = org.telegram.ui.ActionBar.h6.Uc;
            }
            int w03 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
            this.B = w03;
            this.A = w03;
            this.f33616z = w03;
            this.f33601j = false;
            this.f33600i = false;
            return;
        }
        this.f33616z = peerColor.getColor(0, d6Var);
        this.A = peerColor.getColor(1, d6Var);
        int color = peerColor.getColor(2, d6Var);
        this.B = color;
        int i14 = this.A;
        int i15 = this.f33616z;
        if (i14 != i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33600i = z10;
        if (color == i15) {
            z11 = false;
        }
        this.f33601j = z11;
        if (z11) {
            this.B = i14;
            this.A = color;
        }
    }

    public final void n(float f7) {
        this.f33609r = f7;
    }

    public final int o(org.telegram.ui.ActionBar.d6 d6Var) {
        View view;
        int i10 = org.telegram.ui.ActionBar.h6.f21026q7;
        this.f33615y = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        this.f33616z = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        this.f33600i = false;
        this.f33601j = false;
        this.f33614x = org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        if (this.v != 0 && this.f33611t == null && (view = this.D) != null) {
            this.f33611t = new q5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.f33611t.a();
            }
        }
        q5 q5Var = this.f33611t;
        if (q5Var != null && q5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = h();
        return this.I.a(this.f33615y, false);
    }

    public final void p(boolean z10) {
        ja0 ja0Var;
        if (!z10 && this.S) {
            this.T = 0.0f;
            ja0 ja0Var2 = this.h;
            if (ja0Var2 != null) {
                ja0Var2.a();
            }
        } else if (z10 && !this.S && (ja0Var = this.h) != null) {
            ja0Var.f27641c = -1L;
            ja0Var.f27640b = -1L;
        }
        this.S = z10;
    }

    public final void q(int i10, boolean z10) {
        float f7;
        this.R = false;
        this.f33601j = false;
        this.f33600i = false;
        this.B = i10;
        this.A = i10;
        this.f33616z = i10;
        if (z10) {
            f7 = 0.12f;
        } else {
            f7 = 0.1f;
        }
        this.f33614x = org.telegram.ui.ActionBar.h6.m1(f7, i10);
        this.C = i10;
    }
}
