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
public final class zl0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final c5 E;
    public final c5 F;
    public final c5 G;
    public final c5 H;
    public final c5 I;
    public final z5 J;
    public final z5 K;
    public final z5 L;
    public final z5 M;
    public final z5 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public yl0[] W;
    public float X;
    public boolean Y;
    public j90 h;
    public boolean f31415i;
    public boolean f31416j;
    public Bitmap f31417k;
    public int f31418l;
    public int f31419m;
    public int f31420n;
    public int f31421o;
    public boolean f31422p;
    public boolean f31425s;
    public j5 f31426t;
    public j5 f31427u;
    public long v;
    public long f31428w;
    public int f31429x;
    public int f31430y;
    public int f31431z;
    public final RectF f31410a = new RectF();
    public final Paint f31411b = new Paint(1);
    public final Paint f31412c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f31413f = new Path();
    public final Paint f31414g = new Paint();
    public int f31423q = 0;
    public float f31424r = 1.0f;

    public zl0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new ef.b(this, 12));
        }
        mr mrVar = mr.h;
        this.E = new c5(view, 400L, mrVar, 0);
        this.F = new c5(view, 400L, mrVar, 0);
        this.G = new c5(view, 400L, mrVar, 0);
        this.H = new c5(view, 400L, mrVar, 0);
        this.I = new c5(view, 400L, mrVar, 0);
        this.J = new z5(view, 0L, 400L, mrVar);
        this.K = new z5(view, 0L, 400L, mrVar);
        this.L = new z5(view, 0L, 440L, mrVar);
        this.M = new z5(view, 0L, 320L, mrVar);
        this.N = new z5(view, 0L, 320L, mrVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        boolean q10;
        boolean z4;
        c5 c5Var;
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
        boolean z10;
        View view;
        TLRPC.Message message4;
        TLRPC.User user3;
        int i13;
        float f10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user4 = user;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        if (messageObject != null && !messageObject.isOutOwner() && i10 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return l(messageObject, tL_peerColorCollectible, f6Var);
        }
        this.R = false;
        this.v = 0L;
        this.f31428w = 0L;
        if (messageObject != null && messageObject.isSponsored()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f31425s = z4;
        c5 c5Var2 = this.I;
        float f11 = 0.1f;
        if (messageObject == null) {
            this.f31416j = false;
            this.f31415i = false;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Uc, f6Var);
            this.B = v02;
            this.A = v02;
            this.f31431z = v02;
            if (q10) {
                f10 = 0.12f;
            } else {
                f10 = 0.1f;
            }
            this.f31429x = org.telegram.ui.ActionBar.j6.l1(f10, v02);
            this.C = h();
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wc, f6Var);
            this.f31430y = v03;
            return c5Var2.a(v03, false);
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
                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, f6Var);
                }
            }
            if (user3 != null) {
                i13 = UserObject.getColorId(user3);
                c5Var = c5Var2;
                this.v = UserObject.getEmojiId(user3);
            } else {
                c5Var = c5Var2;
                i13 = 0;
            }
            m(messageObject, i13, f6Var);
            this.f31429x = org.telegram.ui.ActionBar.j6.l1(0.1f, this.f31431z);
            this.f31430y = this.f31431z;
        } else {
            c5Var = c5Var2;
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
                this.f31429x = org.telegram.ui.ActionBar.j6.l1(0.1f, this.f31431z);
                this.f31430y = this.f31431z;
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
                this.f31429x = org.telegram.ui.ActionBar.j6.l1(0.1f, this.f31431z);
                this.f31430y = this.f31431z;
            } else {
                this.f31415i = false;
                this.f31416j = false;
                int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Uc, f6Var);
                this.B = v04;
                this.A = v04;
                this.f31431z = v04;
                this.f31429x = org.telegram.ui.ActionBar.j6.l1(0.1f, v04);
                this.f31430y = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wc, f6Var);
            }
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.f31415i = false;
            this.f31416j = false;
            this.B = -1;
            this.A = -1;
            this.f31431z = -1;
            this.f31429x = 0;
            this.f31430y = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xc, f6Var);
        } else if (messageObject.isOutOwner() || i10 == 2) {
            if (i10 == 2 && !messageObject.isOutOwner()) {
                int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pk, f6Var);
                this.B = v05;
                this.A = v05;
                this.f31431z = v05;
            } else {
                if (!this.f31415i && !this.f31416j) {
                    i12 = org.telegram.ui.ActionBar.j6.f19831ab;
                } else {
                    i12 = org.telegram.ui.ActionBar.j6.f19850bb;
                }
                int v06 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                this.B = v06;
                this.A = v06;
                this.f31431z = v06;
            }
            if (this.f31416j) {
                this.R = true;
                this.f31431z = org.telegram.ui.ActionBar.j6.l1(0.2f, this.f31431z);
                this.A = org.telegram.ui.ActionBar.j6.l1(0.5f, this.A);
            } else if (this.f31415i) {
                this.R = true;
                this.f31431z = org.telegram.ui.ActionBar.j6.l1(0.35f, this.f31431z);
            }
            int i16 = this.B;
            if (q10) {
                f11 = 0.12f;
            }
            this.f31429x = org.telegram.ui.ActionBar.j6.l1(f11, i16);
            this.f31430y = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19868cb, f6Var);
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = messageObject.overrideLinkEmoji;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.f31426t == null && (view = this.D) != null) {
            this.f31426t = new j5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).J0) {
                this.f31426t.a();
            }
        }
        j5 j5Var = this.f31426t;
        if (j5Var != null) {
            z10 = true;
            if (j5Var.j(this.v, true)) {
                this.Y = false;
            }
        } else {
            z10 = true;
        }
        j5 j5Var2 = this.f31427u;
        if (j5Var2 != null) {
            j5Var2.j(this.f31428w, z10);
        }
        this.C = h();
        return c5Var.a(this.f31430y, false);
    }

    public final void b(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13) {
        c(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void c(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z4, boolean z10) {
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f10));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float dp = AndroidUtilities.dp(f11);
        fArr[3] = dp;
        fArr[2] = dp;
        float dp2 = AndroidUtilities.dp(f12);
        fArr[5] = dp2;
        fArr[4] = dp2;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        d(canvas, rectF, f13, z4, z10);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, boolean z4, boolean z10) {
        boolean z11;
        nh.y2 y2Var;
        float e;
        j5 j5Var;
        float f11;
        if (!z10) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(f10, this.E.a(this.f31429x, false));
            Paint paint = this.f31414g;
            paint.setColor(l1);
            float[] fArr = this.e;
            if (kf.m0.c(fArr)) {
                float f12 = fArr[0];
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                Path path = this.f31413f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        j5 j5Var2 = this.f31426t;
        if (j5Var2 != null) {
            if (!this.Y) {
                Drawable drawable = j5Var2.f25836f[0];
                if ((drawable instanceof l5) && (y2Var = ((l5) drawable).f26587k) != null && y2Var.hasImageLoaded()) {
                    this.Y = true;
                } else {
                    z11 = false;
                    e = this.L.e(z11);
                    if (e <= 0.0f && this.f31424r > 0.0f) {
                        if (this.W == null) {
                            this.W = new yl0[]{new yl0(4.0f, -6.33f, 1.0f, 1.0f), new yl0(30.0f, 3.0f, 0.78f, 0.9f), new yl0(46.0f, -17.0f, 0.6f, 0.6f), new yl0(69.66f, -0.666f, 0.87f, 0.7f), new yl0(98.0f, -12.6f, 1.03f, 0.3f), new yl0(51.0f, 24.0f, 1.0f, 0.5f), new yl0(6.33f, 20.0f, 0.77f, 0.7f), new yl0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new yl0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.X);
                        float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
                        if (z4) {
                            max -= AndroidUtilities.dp(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
                        j5 j5Var3 = this.f31427u;
                        if (j5Var3 != null) {
                            j5Var3.v = (int) (f10 * 255.0f);
                        }
                        this.f31426t.k(Integer.valueOf(this.C));
                        int i10 = 0;
                        while (true) {
                            yl0[] yl0VarArr = this.W;
                            if (i10 < yl0VarArr.length) {
                                if (i10 != 0 || (j5Var = this.f31427u) == null || this.f31428w == 0) {
                                    j5Var = this.f31426t;
                                }
                                yl0 yl0Var = yl0VarArr[i10];
                                if (!yl0Var.e || z4) {
                                    if (j5Var == this.f31427u) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.3f;
                                    }
                                    j5Var.v = (int) (f11 * 255.0f * yl0Var.d * this.f31424r);
                                    float dp = max - AndroidUtilities.dp(yl0Var.f31051a);
                                    float dp2 = AndroidUtilities.dp(yl0Var.f31052b) + min;
                                    float dp3 = AndroidUtilities.dp(10.0f) * yl0Var.f31053c * e;
                                    j5Var.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                                    j5Var.draw(canvas);
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
            z11 = true;
            e = this.L.e(z11);
            if (e <= 0.0f) {
            }
        }
    }

    public final void e(android.graphics.Canvas r27, android.graphics.RectF r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zl0.e(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void f(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13) {
        j90 j90Var;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f10));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float dp = AndroidUtilities.dp(f11);
        fArr[3] = dp;
        fArr[2] = dp;
        float dp2 = AndroidUtilities.dp(f12);
        fArr[5] = dp2;
        fArr[4] = dp2;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.S && ((j90Var = this.h) == null || !j90Var.c())) {
            j90 j90Var2 = this.h;
            if (j90Var2 != null) {
                j90Var2.f25905b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            j90 j90Var3 = new j90();
            this.h = j90Var3;
            j90Var3.C = true;
            j90Var3.f25920t = 3.5f;
            j90Var3.f25921u = 0.5f;
        }
        this.h.f(org.telegram.ui.ActionBar.j6.l1(0.1f, this.f31431z), org.telegram.ui.ActionBar.j6.l1(0.3f, this.f31431z), org.telegram.ui.ActionBar.j6.l1(0.3f, this.f31431z), org.telegram.ui.ActionBar.j6.l1(1.25f, this.f31431z));
        this.h.d(rectF);
        this.h.i(fArr);
        this.h.f25922w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int g() {
        return this.f31429x;
    }

    public final int h() {
        if (this.R) {
            return this.A;
        }
        return this.f31431z;
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        float e = this.M.e(this.S);
        this.T = (((float) Math.min(30L, currentTimeMillis - this.V)) * e) + this.T;
        this.U = (((float) Math.min(30L, currentTimeMillis - this.V)) * e) + this.U;
        this.V = currentTimeMillis;
    }

    public final void j(float f10) {
        this.X = f10;
    }

    public final void k() {
        this.F.a(this.f31431z, true);
        this.G.a(this.A, true);
        this.J.f(this.f31415i, true);
        this.I.a(this.f31430y, true);
        this.E.a(this.f31429x, true);
        j5 j5Var = this.f31426t;
        if (j5Var != null) {
            j5Var.d.d(1.0f, true);
        }
    }

    public final int l(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean q10;
        int i10;
        ArrayList<Integer> arrayList;
        boolean z4;
        boolean z10;
        int i11;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
            i10 = tL_peerColorCollectible.dark_accent_color;
        } else {
            i10 = tL_peerColorCollectible.accent_color;
        }
        if (q10 && (tL_peerColorCollectible.flags & 2) != 0) {
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
                this.f31423q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i11;
        }
        this.R = false;
        this.f31431z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f31415i = z4;
        if (z4) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31416j = z10;
        if (z10) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i12 = i10 | (-16777216);
        this.f31430y = i12;
        this.f31429x = org.telegram.ui.ActionBar.j6.l1(0.1f, i12);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.f31428w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j10 != 0 && this.f31426t == null && view != null) {
            this.f31426t = new j5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).J0) {
                this.f31426t.a();
            }
        }
        j5 j5Var = this.f31426t;
        if (j5Var != null && j5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = this.f31430y;
        if (this.f31428w != 0 && this.f31427u == null && view != null) {
            this.f31427u = new j5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).J0) {
                this.f31427u.a();
            }
        }
        j5 j5Var2 = this.f31427u;
        if (j5Var2 != null) {
            j5Var2.j(this.f31428w, true);
        }
        return this.I.a(this.f31430y, false);
    }

    public final void m(MessageObject messageObject, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        MessagesController.PeerColor peerColor;
        boolean z4;
        int i12;
        int i13;
        if (f6Var != null) {
            f6Var.a();
        } else {
            org.telegram.ui.ActionBar.j6.e1();
        }
        boolean z10 = true;
        if (this.P != i10) {
            if (messageObject != null) {
                i13 = messageObject.getId();
            } else {
                i13 = 0;
            }
            if (i13 == this.O) {
                this.f31423q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = i13;
        }
        if (i10 < 7) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20134r8[i10], f6Var);
            this.B = v02;
            this.A = v02;
            this.f31431z = v02;
            this.f31416j = false;
            this.f31415i = false;
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
                i12 = org.telegram.ui.ActionBar.j6.f19831ab;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.Uc;
            }
            int v03 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            this.B = v03;
            this.A = v03;
            this.f31431z = v03;
            this.f31416j = false;
            this.f31415i = false;
            return;
        }
        this.f31431z = peerColor.getColor(0, f6Var);
        this.A = peerColor.getColor(1, f6Var);
        int color = peerColor.getColor(2, f6Var);
        this.B = color;
        int i14 = this.A;
        int i15 = this.f31431z;
        if (i14 != i15) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f31415i = z4;
        if (color == i15) {
            z10 = false;
        }
        this.f31416j = z10;
        if (z10) {
            this.B = i14;
            this.A = color;
        }
    }

    public final void n(float f10) {
        this.f31424r = f10;
    }

    public final int o(org.telegram.ui.ActionBar.f6 f6Var) {
        View view;
        int i10 = org.telegram.ui.ActionBar.j6.f20116q7;
        this.f31430y = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        this.f31431z = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        this.f31415i = false;
        this.f31416j = false;
        this.f31429x = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        if (this.v != 0 && this.f31426t == null && (view = this.D) != null) {
            this.f31426t = new j5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).J0) {
                this.f31426t.a();
            }
        }
        j5 j5Var = this.f31426t;
        if (j5Var != null && j5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = h();
        return this.I.a(this.f31430y, false);
    }

    public final void p(boolean z4) {
        j90 j90Var;
        if (!z4 && this.S) {
            this.T = 0.0f;
            j90 j90Var2 = this.h;
            if (j90Var2 != null) {
                j90Var2.a();
            }
        } else if (z4 && !this.S && (j90Var = this.h) != null) {
            j90Var.f25906c = -1L;
            j90Var.f25905b = -1L;
        }
        this.S = z4;
    }

    public final void q(int i10, boolean z4) {
        float f10;
        this.R = false;
        this.f31416j = false;
        this.f31415i = false;
        this.B = i10;
        this.A = i10;
        this.f31431z = i10;
        if (z4) {
            f10 = 0.12f;
        } else {
            f10 = 0.1f;
        }
        this.f31429x = org.telegram.ui.ActionBar.j6.l1(f10, i10);
        this.C = i10;
    }
}
