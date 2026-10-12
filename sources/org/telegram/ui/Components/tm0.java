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
public final class tm0 {
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
    public sm0[] W;
    public float X;
    public boolean Y;
    public ha0 h;
    public boolean f29447i;
    public boolean f29448j;
    public Bitmap f29449k;
    public int f29450l;
    public int f29451m;
    public int f29452n;
    public int f29453o;
    public boolean f29454p;
    public boolean f29457s;
    public q5 f29458t;
    public q5 f29459u;
    public long v;
    public long f29460w;
    public int f29461x;
    public int f29462y;
    public int f29463z;
    public final RectF f29442a = new RectF();
    public final Paint f29443b = new Paint(1);
    public final Paint f29444c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f29445f = new Path();
    public final Paint f29446g = new Paint();
    public int f29455q = 0;
    public float f29456r = 1.0f;

    public tm0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new bi.j2(this, 8));
        }
        es esVar = es.h;
        this.E = new j5(view, 400L, esVar, 0);
        this.F = new j5(view, 400L, esVar, 0);
        this.G = new j5(view, 400L, esVar, 0);
        this.H = new j5(view, 400L, esVar, 0);
        this.I = new j5(view, 400L, esVar, 0);
        this.J = new g6(view, 0L, 400L, esVar);
        this.K = new g6(view, 0L, 400L, esVar);
        this.L = new g6(view, 0L, 440L, esVar);
        this.M = new g6(view, 0L, 320L, esVar);
        this.N = new g6(view, 0L, 320L, esVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
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
        this.f29460w = 0L;
        if (messageObject != null && messageObject.isSponsored()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29457s = z10;
        j5 j5Var2 = this.I;
        float f10 = 0.1f;
        if (messageObject == null) {
            this.f29448j = false;
            this.f29447i = false;
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Uc, c6Var);
            this.B = w02;
            this.A = w02;
            this.f29463z = w02;
            if (q6) {
                f7 = 0.12f;
            } else {
                f7 = 0.1f;
            }
            this.f29461x = org.telegram.ui.ActionBar.g6.m1(f7, w02);
            this.C = h();
            int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Wc, c6Var);
            this.f29462y = w03;
            return j5Var2.a(w03, false);
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
                j5Var = j5Var2;
                this.v = UserObject.getEmojiId(user3);
            } else {
                j5Var = j5Var2;
                i13 = 0;
            }
            m(messageObject, i13, c6Var);
            this.f29461x = org.telegram.ui.ActionBar.g6.m1(0.1f, this.f29463z);
            this.f29462y = this.f29463z;
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
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, c6Var);
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
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, c6Var);
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
                    i14 = i11;
                }
                m(messageObject, i14, c6Var);
                this.f29461x = org.telegram.ui.ActionBar.g6.m1(0.1f, this.f29463z);
                this.f29462y = this.f29463z;
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
                this.f29461x = org.telegram.ui.ActionBar.g6.m1(0.1f, this.f29463z);
                this.f29462y = this.f29463z;
            } else {
                this.f29447i = false;
                this.f29448j = false;
                int w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Uc, c6Var);
                this.B = w04;
                this.A = w04;
                this.f29463z = w04;
                this.f29461x = org.telegram.ui.ActionBar.g6.m1(0.1f, w04);
                this.f29462y = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Wc, c6Var);
            }
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.f29447i = false;
            this.f29448j = false;
            this.B = -1;
            this.A = -1;
            this.f29463z = -1;
            this.f29461x = 0;
            this.f29462y = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xc, c6Var);
        } else if (messageObject.isOutOwner() || i10 == 2) {
            if (i10 == 2 && !messageObject.isOutOwner()) {
                int w05 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.pk, c6Var);
                this.B = w05;
                this.A = w05;
                this.f29463z = w05;
            } else {
                if (!this.f29447i && !this.f29448j) {
                    i12 = org.telegram.ui.ActionBar.g6.f19847ab;
                } else {
                    i12 = org.telegram.ui.ActionBar.g6.f19867bb;
                }
                int w06 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
                this.B = w06;
                this.A = w06;
                this.f29463z = w06;
            }
            if (this.f29448j) {
                this.R = true;
                this.f29463z = org.telegram.ui.ActionBar.g6.m1(0.2f, this.f29463z);
                this.A = org.telegram.ui.ActionBar.g6.m1(0.5f, this.A);
            } else if (this.f29447i) {
                this.R = true;
                this.f29463z = org.telegram.ui.ActionBar.g6.m1(0.35f, this.f29463z);
            }
            int i16 = this.B;
            if (q6) {
                f10 = 0.12f;
            }
            this.f29461x = org.telegram.ui.ActionBar.g6.m1(f10, i16);
            this.f29462y = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19887cb, c6Var);
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = messageObject.overrideLinkEmoji;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.f29458t == null && (view = this.D) != null) {
            this.f29458t = new q5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.f29458t.a();
            }
        }
        q5 q5Var = this.f29458t;
        if (q5Var != null) {
            z11 = true;
            if (q5Var.j(this.v, true)) {
                this.Y = false;
            }
        } else {
            z11 = true;
        }
        q5 q5Var2 = this.f29459u;
        if (q5Var2 != null) {
            q5Var2.j(this.f29460w, z11);
        }
        this.C = h();
        return j5Var.a(this.f29462y, false);
    }

    public final void b(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12) {
        c(canvas, rectF, f7, f10, f11, f12, false, false);
    }

    public final void c(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12, boolean z10, boolean z11) {
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
        d(canvas, rectF, f12, z10, z11);
    }

    public final void d(Canvas canvas, RectF rectF, float f7, boolean z10, boolean z11) {
        boolean z12;
        bi.b4 b4Var;
        float e;
        int i10;
        q5 q5Var;
        float f10;
        if (!z11) {
            int m12 = org.telegram.ui.ActionBar.g6.m1(f7, this.E.a(this.f29461x, false));
            Paint paint = this.f29446g;
            paint.setColor(m12);
            float[] fArr = this.e;
            if (zf.f0.c(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f29445f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        q5 q5Var2 = this.f29458t;
        if (q5Var2 != null) {
            if (!this.Y) {
                Drawable drawable = q5Var2.f28516f[0];
                if ((drawable instanceof s5) && (b4Var = ((s5) drawable).f29031k) != null && b4Var.hasImageLoaded()) {
                    this.Y = true;
                } else {
                    z12 = false;
                    e = this.L.e(z12);
                    if (e <= 0.0f && this.f29456r > 0.0f) {
                        if (this.W == null) {
                            i10 = 0;
                            this.W = new sm0[]{new sm0(4.0f, -6.33f, 1.0f, 1.0f), new sm0(30.0f, 3.0f, 0.78f, 0.9f), new sm0(46.0f, -17.0f, 0.6f, 0.6f), new sm0(69.66f, -0.666f, 0.87f, 0.7f), new sm0(98.0f, -12.6f, 1.03f, 0.3f), new sm0(51.0f, 24.0f, 1.0f, 0.5f), new sm0(6.33f, 20.0f, 0.77f, 0.7f), new sm0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new sm0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
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
                        q5 q5Var3 = this.f29459u;
                        if (q5Var3 != null) {
                            q5Var3.v = (int) (f7 * 255.0f);
                        }
                        this.f29458t.k(Integer.valueOf(this.C));
                        int i11 = i10;
                        while (true) {
                            sm0[] sm0VarArr = this.W;
                            if (i11 < sm0VarArr.length) {
                                if (i11 != 0 || (q5Var = this.f29459u) == null || this.f29460w == 0) {
                                    q5Var = this.f29458t;
                                }
                                sm0 sm0Var = sm0VarArr[i11];
                                if (!sm0Var.e || z10) {
                                    if (q5Var == this.f29459u) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.3f;
                                    }
                                    q5Var.v = (int) (f10 * 255.0f * sm0Var.d * this.f29456r);
                                    float dp = max - AndroidUtilities.dp(sm0Var.f29161a);
                                    float dp2 = AndroidUtilities.dp(sm0Var.f29162b) + min;
                                    float dp3 = AndroidUtilities.dp(10.0f) * sm0Var.f29163c * e;
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
            e = this.L.e(z12);
            if (e <= 0.0f) {
            }
        }
    }

    public final void e(android.graphics.Canvas r27, android.graphics.RectF r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tm0.e(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void f(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12) {
        ha0 ha0Var;
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
        if (!this.S && ((ha0Var = this.h) == null || !ha0Var.d())) {
            ha0 ha0Var2 = this.h;
            if (ha0Var2 != null) {
                ha0Var2.f25606b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            ha0 ha0Var3 = new ha0();
            this.h = ha0Var3;
            ha0Var3.D = true;
            ha0Var3.f25621t = 3.5f;
            ha0Var3.f25622u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.g6.m1(0.1f, this.f29463z), org.telegram.ui.ActionBar.g6.m1(0.3f, this.f29463z), org.telegram.ui.ActionBar.g6.m1(0.3f, this.f29463z), org.telegram.ui.ActionBar.g6.m1(1.25f, this.f29463z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f25624x.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f12 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int g() {
        return this.f29461x;
    }

    public final int h() {
        if (this.R) {
            return this.A;
        }
        return this.f29463z;
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        float e = this.M.e(this.S);
        this.T = (((float) Math.min(30L, currentTimeMillis - this.V)) * e) + this.T;
        this.U = (((float) Math.min(30L, currentTimeMillis - this.V)) * e) + this.U;
        this.V = currentTimeMillis;
    }

    public final void j(float f7) {
        this.X = f7;
    }

    public final void k() {
        this.F.a(this.f29463z, true);
        this.G.a(this.A, true);
        this.J.f(this.f29447i, true);
        this.I.a(this.f29462y, true);
        this.E.a(this.f29461x, true);
        q5 q5Var = this.f29458t;
        if (q5Var != null) {
            q5Var.d.d(1.0f, true);
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
                this.f29455q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i11;
        }
        this.R = false;
        this.f29463z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29447i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29448j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i12 = i10 | (-16777216);
        this.f29462y = i12;
        this.f29461x = org.telegram.ui.ActionBar.g6.m1(0.1f, i12);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.f29460w = tL_peerColorCollectible.gift_emoji_id;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        View view = this.D;
        if (i13 != 0 && this.f29458t == null && view != null) {
            this.f29458t = new q5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.f29458t.a();
            }
        }
        q5 q5Var = this.f29458t;
        if (q5Var != null && q5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = this.f29462y;
        if (this.f29460w != 0 && this.f29459u == null && view != null) {
            this.f29459u = new q5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.f29459u.a();
            }
        }
        q5 q5Var2 = this.f29459u;
        if (q5Var2 != null) {
            q5Var2.j(this.f29460w, true);
        }
        return this.I.a(this.f29462y, false);
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
            org.telegram.ui.ActionBar.g6.f1();
        }
        boolean z11 = true;
        if (this.P != i10) {
            if (messageObject != null) {
                i13 = messageObject.getId();
            } else {
                i13 = 0;
            }
            if (i13 == this.O) {
                this.f29455q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = i13;
        }
        if (i10 < 7) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20160r8[i10], c6Var);
            this.B = w02;
            this.A = w02;
            this.f29463z = w02;
            this.f29448j = false;
            this.f29447i = false;
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
                i12 = org.telegram.ui.ActionBar.g6.f19847ab;
            } else {
                i12 = org.telegram.ui.ActionBar.g6.Uc;
            }
            int w03 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
            this.B = w03;
            this.A = w03;
            this.f29463z = w03;
            this.f29448j = false;
            this.f29447i = false;
            return;
        }
        this.f29463z = peerColor.getColor(0, c6Var);
        this.A = peerColor.getColor(1, c6Var);
        int color = peerColor.getColor(2, c6Var);
        this.B = color;
        int i14 = this.A;
        int i15 = this.f29463z;
        if (i14 != i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29447i = z10;
        if (color == i15) {
            z11 = false;
        }
        this.f29448j = z11;
        if (z11) {
            this.B = i14;
            this.A = color;
        }
    }

    public final void n(float f7) {
        this.f29456r = f7;
    }

    public final int o(org.telegram.ui.ActionBar.c6 c6Var) {
        View view;
        int i10 = org.telegram.ui.ActionBar.g6.f20139q7;
        this.f29462y = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        this.f29463z = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        this.f29447i = false;
        this.f29448j = false;
        this.f29461x = org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        if (this.v != 0 && this.f29458t == null && (view = this.D) != null) {
            this.f29458t = new q5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.f29458t.a();
            }
        }
        q5 q5Var = this.f29458t;
        if (q5Var != null && q5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = h();
        return this.I.a(this.f29462y, false);
    }

    public final void p(boolean z10) {
        ha0 ha0Var;
        if (!z10 && this.S) {
            this.T = 0.0f;
            ha0 ha0Var2 = this.h;
            if (ha0Var2 != null) {
                ha0Var2.a();
            }
        } else if (z10 && !this.S && (ha0Var = this.h) != null) {
            ha0Var.f25607c = -1L;
            ha0Var.f25606b = -1L;
        }
        this.S = z10;
    }

    public final void q(int i10, boolean z10) {
        float f7;
        this.R = false;
        this.f29448j = false;
        this.f29447i = false;
        this.B = i10;
        this.A = i10;
        this.f29463z = i10;
        if (z10) {
            f7 = 0.12f;
        } else {
            f7 = 0.1f;
        }
        this.f29461x = org.telegram.ui.ActionBar.g6.m1(f7, i10);
        this.C = i10;
    }
}
