package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class gl0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final b5 E;
    public final b5 F;
    public final b5 G;
    public final b5 H;
    public final b5 I;
    public final y5 J;
    public final y5 K;
    public final y5 L;
    public final y5 M;
    public final y5 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public fl0[] W;
    public float X;
    public boolean Y;
    public t80 h;

    public boolean f28749i;

    public boolean f28750j;

    public Bitmap f28751k;

    public int f28752l;

    public int f28753m;

    public int f28754n;

    public int f28755o;

    public boolean f28756p;

    public boolean f28759s;

    public i5 f28760t;

    public i5 f28761u;
    public long v;

    public long f28762w;

    public int f28763x;

    public int f28764y;

    public int f28765z;

    public final RectF f28743a = new RectF();

    public final Paint f28744b = new Paint(1);

    public final Paint f28745c = new Paint(3);
    public final Matrix d = new Matrix();

    public final float[] f28746e = new float[8];

    public final Path f28747f = new Path();

    public final Paint f28748g = new Paint();

    public int f28757q = 0;

    public float f28758r = 1.0f;

    public gl0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new bf.b(this, 12));
        }
        er erVar = er.h;
        this.E = new b5(view, 400L, erVar, 0);
        this.F = new b5(view, 400L, erVar, 0);
        this.G = new b5(view, 400L, erVar, 0);
        this.H = new b5(view, 400L, erVar, 0);
        this.I = new b5(view, 400L, erVar, 0);
        this.J = new y5(view, 0L, 400L, erVar);
        this.K = new y5(view, 0L, 400L, erVar);
        this.L = new y5(view, 0L, 440L, erVar);
        this.M = new y5(view, 0L, 320L, erVar);
        this.N = new y5(view, 0L, 320L, erVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        MessageObject messageObject2;
        TLRPC.Message message2;
        int colorId;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        TLRPC.PeerColor peerColor;
        int i11;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        boolean z10;
        View view;
        TLRPC.Message message4;
        int colorId2;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User currentUser = user;
        boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        if (messageObject != null && !messageObject.isOutOwner() && i10 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return l(messageObject, tL_peerColorCollectible, c6Var);
        }
        this.R = false;
        this.v = 0L;
        this.f28762w = 0L;
        this.f28759s = messageObject != null && messageObject.isSponsored();
        b5 b5Var = this.I;
        if (messageObject == null) {
            this.f28750j = false;
            this.f28749i = false;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Uc, c6Var);
            this.B = iV0;
            this.A = iV0;
            this.f28765z = iV0;
            this.f28763x = org.telegram.ui.ActionBar.g6.l1(zA ? 0.12f : 0.1f, iV0);
            this.C = h();
            int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wc, c6Var);
            this.f28764y = iV1;
            return b5Var.a(iV1, false);
        }
        if (i10 != 4 || (message4 = messageObject.messageOwner) == null || MessageObject.getMedia(message4) == null || !(MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaContact)) {
            b5Var = b5Var;
            if (i10 != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && currentUser != null) || ((messageObject.isFromChannel() && chat != null) || (((message3 = messageObject.messageOwner) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (messageObject.isSponsored() && (peerColor2 = messageObject.sponsoredColor) != null && peerColor2.color != -1))))))) {
                int colorId3 = messageObject.overrideLinkColor;
                if (colorId3 < 0) {
                    if (!messageObject.isSponsored() || (peerColor = messageObject.sponsoredColor) == null || (i11 = peerColor.color) == -1) {
                        TLRPC.Message message5 = messageObject.messageOwner;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            if (peerDialogId < 0) {
                                TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                                if (!messageObject.isOutOwner() && i10 != 2 && chat2 != null) {
                                    TLRPC.PeerColor peerColor3 = chat2.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, c6Var);
                                    }
                                }
                                colorId3 = chat2 != null ? ChatObject.getColorId(chat2) : 5;
                                if (i10 == 3) {
                                    this.v = ChatObject.getEmojiId(chat2);
                                }
                            } else {
                                TLRPC.User user2 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                                if (!messageObject.isOutOwner() && i10 != 2 && user2 != null) {
                                    TLRPC.PeerColor peerColor4 = user2.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, c6Var);
                                    }
                                }
                                colorId3 = user2 != null ? UserObject.getColorId(user2) : 5;
                                if (i10 == 3) {
                                    this.v = UserObject.getEmojiId(user2);
                                }
                            }
                        } else if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && currentUser != null) {
                            TLRPC.User currentUser2 = messageObject.isOutOwner() ? UserConfig.getInstance(messageObject.currentAccount).getCurrentUser() : currentUser;
                            if (currentUser2 != null) {
                                currentUser = currentUser2;
                            }
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor5 = currentUser.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, c6Var);
                                }
                            }
                            colorId3 = UserObject.getColorId(currentUser);
                            if (i10 == 3) {
                                this.v = UserObject.getEmojiId(currentUser);
                            }
                        } else if (messageObject.isFromUser() && currentUser != null) {
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor6 = currentUser.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, c6Var);
                                }
                            }
                            colorId3 = UserObject.getColorId(currentUser);
                            if (i10 == 3) {
                                this.v = UserObject.getEmojiId(currentUser);
                            }
                        } else if (!messageObject.isFromChannel() || chat == null) {
                            colorId3 = 0;
                        } else {
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, c6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long fromChatId = messageObject.getFromChatId();
                                if (fromChatId >= 0) {
                                    TLRPC.User user3 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                                    colorId = UserObject.getColorId(user3);
                                    if (i10 == 3) {
                                        this.v = UserObject.getEmojiId(user3);
                                    }
                                } else {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                                    colorId = ChatObject.getColorId(chat3);
                                    if (i10 == 3) {
                                        this.v = ChatObject.getEmojiId(chat3);
                                    }
                                }
                                colorId3 = colorId;
                            } else {
                                colorId3 = ChatObject.getColorId(chat);
                                if (i10 == 3) {
                                    this.v = ChatObject.getEmojiId(chat);
                                }
                            }
                        }
                    } else {
                        if (i10 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                        colorId3 = i11;
                    }
                }
                m(messageObject, colorId3, c6Var);
                this.f28763x = org.telegram.ui.ActionBar.g6.l1(0.1f, this.f28765z);
                this.f28764y = this.f28765z;
            } else if (i10 != 0 || (messageObject.overrideLinkColor < 0 && ((message = messageObject.messageOwner) == null || messageObject.replyMessageObject == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (messageObject2 = messageObject.replyMessageObject).messageOwner) == null || message2.from_id == null || !(messageObject2.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.replyMessageObject.isFromChannel()))))) {
                this.f28749i = false;
                this.f28750j = false;
                int iV2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Uc, c6Var);
                this.B = iV2;
                this.A = iV2;
                this.f28765z = iV2;
                this.f28763x = org.telegram.ui.ActionBar.g6.l1(0.1f, iV2);
                this.f28764y = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wc, c6Var);
            } else {
                int colorId4 = messageObject.overrideLinkColor;
                if (colorId4 < 0) {
                    if (DialogObject.isEncryptedDialog(messageObject.replyMessageObject.getDialogId())) {
                        if (messageObject.replyMessageObject.isOutOwner()) {
                            currentUser = UserConfig.getInstance(messageObject.replyMessageObject.currentAccount).getCurrentUser();
                        }
                        if (currentUser != null) {
                            colorId4 = UserObject.getColorId(currentUser);
                            this.v = UserObject.getEmojiId(currentUser);
                        } else {
                            colorId4 = 0;
                        }
                    } else if (messageObject.replyMessageObject.isFromUser()) {
                        TLRPC.User user4 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                        if (!messageObject.isOutOwner() && i10 != 2 && user4 != null) {
                            TLRPC.PeerColor peerColor8 = user4.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, c6Var);
                            }
                        }
                        if (user4 != null) {
                            colorId4 = UserObject.getColorId(user4);
                            this.v = UserObject.getEmojiId(user4);
                        } else {
                            colorId4 = 0;
                        }
                    } else if (messageObject.replyMessageObject.isFromChannel()) {
                        TLRPC.Chat chat4 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id));
                        if (!messageObject.isOutOwner() && i10 != 2 && chat4 != null) {
                            TLRPC.PeerColor peerColor9 = chat4.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, c6Var);
                            }
                        }
                        if (chat4 != null) {
                            colorId4 = ChatObject.getColorId(chat4);
                            this.v = ChatObject.getEmojiId(chat4);
                        } else {
                            colorId4 = 0;
                        }
                    } else {
                        colorId4 = 0;
                    }
                }
                m(messageObject.replyMessageObject, colorId4, c6Var);
                this.f28763x = org.telegram.ui.ActionBar.g6.l1(0.1f, this.f28765z);
                this.f28764y = this.f28765z;
            }
        } else {
            long j10 = MessageObject.getMedia(messageObject.messageOwner).user_id;
            TLRPC.User user5 = j10 != 0 ? MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(j10)) : null;
            if (!messageObject.isOutOwner() && i10 != 2 && user5 != null) {
                TLRPC.PeerColor peerColor10 = user5.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, c6Var);
                }
            }
            if (user5 != null) {
                colorId2 = UserObject.getColorId(user5);
                this.v = UserObject.getEmojiId(user5);
            } else {
                colorId2 = 0;
            }
            m(messageObject, colorId2, c6Var);
            this.f28763x = org.telegram.ui.ActionBar.g6.l1(0.1f, this.f28765z);
            this.f28764y = this.f28765z;
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.f28749i = false;
            this.f28750j = false;
            this.B = -1;
            this.A = -1;
            this.f28765z = -1;
            this.f28763x = 0;
            this.f28764y = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xc, c6Var);
        } else if (messageObject.isOutOwner() || i10 == 2) {
            if (i10 != 2 || messageObject.isOutOwner()) {
                int iV3 = org.telegram.ui.ActionBar.g6.v0((this.f28749i || this.f28750j) ? org.telegram.ui.ActionBar.g6.f23022bb : org.telegram.ui.ActionBar.g6.f23003ab, c6Var);
                this.B = iV3;
                this.A = iV3;
                this.f28765z = iV3;
            } else {
                int iV4 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.pk, c6Var);
                this.B = iV4;
                this.A = iV4;
                this.f28765z = iV4;
            }
            if (this.f28750j) {
                this.R = true;
                this.f28765z = org.telegram.ui.ActionBar.g6.l1(0.2f, this.f28765z);
                this.A = org.telegram.ui.ActionBar.g6.l1(0.5f, this.A);
            } else if (this.f28749i) {
                this.R = true;
                this.f28765z = org.telegram.ui.ActionBar.g6.l1(0.35f, this.f28765z);
            }
            this.f28763x = org.telegram.ui.ActionBar.g6.l1(zA ? 0.12f : 0.1f, this.B);
            this.f28764y = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23040cb, c6Var);
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = messageObject.overrideLinkEmoji;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.f28760t == null && (view = this.D) != null) {
            this.f28760t = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).I0) {
                this.f28760t.a();
            }
        }
        i5 i5Var = this.f28760t;
        if (i5Var != null) {
            z10 = true;
            if (i5Var.j(this.v, true)) {
                this.Y = false;
            }
        } else {
            z10 = true;
        }
        i5 i5Var2 = this.f28761u;
        if (i5Var2 != null) {
            i5Var2.j(this.f28762w, z10);
        }
        this.C = h();
        return b5Var.a(this.f28764y, false);
    }

    public final void b(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13) {
        c(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void c(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z10, boolean z11) {
        float fMax = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f10));
        float[] fArr = this.f28746e;
        fArr[1] = fMax;
        fArr[0] = fMax;
        float fDp = AndroidUtilities.dp(f11);
        fArr[3] = fDp;
        fArr[2] = fDp;
        float fDp2 = AndroidUtilities.dp(f12);
        fArr[5] = fDp2;
        fArr[4] = fDp2;
        float fMax2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f12));
        fArr[7] = fMax2;
        fArr[6] = fMax2;
        d(canvas, rectF, f13, z10, z11);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, boolean z10, boolean z11) {
        boolean z12;
        jh.y2 y2Var;
        i5 i5Var;
        if (!z11) {
            int iL1 = org.telegram.ui.ActionBar.g6.l1(f10, this.E.a(this.f28763x, false));
            Paint paint = this.f28748g;
            paint.setColor(iL1);
            float[] fArr = this.f28746e;
            if (gf.m0.c(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f28747f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        i5 i5Var2 = this.f28760t;
        if (i5Var2 == null) {
            return;
        }
        if (this.Y) {
            z12 = true;
        } else {
            Drawable drawable = i5Var2.f29229f[0];
            if ((drawable instanceof k5) && (y2Var = ((k5) drawable).f29961k) != null && y2Var.hasImageLoaded()) {
                this.Y = true;
                z12 = true;
            } else {
                z12 = false;
            }
        }
        float fE = this.L.e(z12);
        if (fE <= 0.0f || this.f28758r <= 0.0f) {
            return;
        }
        if (this.W == null) {
            this.W = new fl0[]{new fl0(4.0f, -6.33f, 1.0f, 1.0f), new fl0(30.0f, 3.0f, 0.78f, 0.9f), new fl0(46.0f, -17.0f, 0.6f, 0.6f), new fl0(69.66f, -0.666f, 0.87f, 0.7f), new fl0(98.0f, -12.6f, 1.03f, 0.3f), new fl0(51.0f, 24.0f, 1.0f, 0.5f), new fl0(6.33f, 20.0f, 0.77f, 0.7f), new fl0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new fl0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, this.X);
        float fMax = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
        if (z10) {
            fMax -= AndroidUtilities.dp(12.0f);
        }
        float fMin = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
        i5 i5Var3 = this.f28761u;
        if (i5Var3 != null) {
            i5Var3.v = (int) (f10 * 255.0f);
        }
        this.f28760t.k(Integer.valueOf(this.C));
        int i10 = 0;
        while (true) {
            fl0[] fl0VarArr = this.W;
            if (i10 >= fl0VarArr.length) {
                canvas.restore();
                return;
            }
            if (i10 != 0 || (i5Var = this.f28761u) == null || this.f28762w == 0) {
                i5Var = this.f28760t;
            }
            fl0 fl0Var = fl0VarArr[i10];
            if (!fl0Var.f28405e || z10) {
                i5Var.v = (int) ((i5Var == this.f28761u ? 1.0f : 0.3f) * 255.0f * fl0Var.d * this.f28758r);
                float fDp = fMax - AndroidUtilities.dp(fl0Var.f28402a);
                float fDp2 = AndroidUtilities.dp(fl0Var.f28403b) + fMin;
                float fDp3 = AndroidUtilities.dp(10.0f) * fl0Var.f28404c * fE;
                i5Var.setBounds((int) (fDp - fDp3), (int) (fDp2 - fDp3), (int) (fDp + fDp3), (int) (fDp2 + fDp3));
                i5Var.draw(canvas);
            }
            i10++;
        }
    }

    public final void e(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float fHeight;
        int i10;
        int i11;
        float f12;
        int iFloor = (int) Math.floor(SharedConfig.bubbleRadius / (this.f28759s ? 2.0f : 3.0f));
        float fMax = rectF.left + Math.max(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(iFloor * 2));
        int iA = this.F.a(this.f28765z, false);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(f10, iA);
        Paint paint = this.f28744b;
        paint.setColor(iL1);
        float fE = this.M.e(this.S);
        float fE2 = this.J.e(this.f28749i);
        float fE3 = this.K.e(this.f28750j);
        RectF rectF2 = this.f28743a;
        if (fE > 0.0f && !this.f28749i) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * 0.3f));
            rectF2.set(rectF.left, rectF.top, fMax, rectF.bottom);
            canvas.save();
            float f13 = rectF2.left;
            canvas.clipRect(f13, rectF2.top, AndroidUtilities.dp(3.0f) + f13, rectF2.bottom);
            float f14 = iFloor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), paint);
            paint.setAlpha(alpha);
            i();
            float fPow = ((float) Math.pow((this.T / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            rectF2.set(rectF.left, (AndroidUtilities.lerp(0.0f, 1.0f - er.f28124i.getInterpolation(h7.n.a(((Math.max(fPow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), fE) * rectF.height()) + rectF.top, rectF.left + AndroidUtilities.dp(6.0f), (AndroidUtilities.lerp(1.0f, 1.0f - er.f28123g.getInterpolation(h7.n.a((((fPow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), fE) * rectF.height()) + rectF.top);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            canvas.restore();
            View view = this.D;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (fE2 <= 0.0f) {
            rectF2.set(rectF.left, rectF.top, fMax, rectF.bottom);
            canvas.save();
            float f15 = rectF2.left;
            canvas.clipRect(f15, rectF2.top, AndroidUtilities.dp(3.0f) + f15, rectF2.bottom);
            float f16 = iFloor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), paint);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        i();
        if (this.f28750j) {
            fHeight = rectF.height();
            f11 = 12.66f;
            int iHeight = (int) rectF.height();
            int iDp = AndroidUtilities.dp(18.99f);
            i10 = iHeight % iDp;
            if (i10 == 0) {
                i11 = 0;
            } else {
                if ((((iHeight ^ iDp) >> 31) | 1) <= 0) {
                    i10 += iDp;
                }
                i11 = i10;
            }
        } else {
            f11 = 12.66f;
            fHeight = rectF.height();
            int iHeight2 = (int) rectF.height();
            int iDp2 = AndroidUtilities.dp(12.66f);
            i10 = iHeight2 % iDp2;
            if (i10 == 0) {
                i11 = 0;
            } else {
                if ((((iHeight2 ^ iDp2) >> 31) | 1) <= 0) {
                    i10 += iDp2;
                }
                i11 = i10;
            }
        }
        float fD = ((((this.N.d(this.f28757q * 425, false) + this.U) + (this.R ? 100 : 0)) / 1000.0f) * AndroidUtilities.dp(30.0f)) % (fHeight - i11);
        int iA2 = this.G.a(this.A, false);
        int iA3 = this.H.a(this.B, false);
        int iL2 = org.telegram.ui.ActionBar.g6.l1(f10, iA);
        int iH = i0.b.h(org.telegram.ui.ActionBar.g6.l1(fE2 * f10, iA2), iL2);
        int iH2 = this.f28750j ? i0.b.h(org.telegram.ui.ActionBar.g6.l1(f10 * fE3, iA3), iL2) : 0;
        int iRound = Math.round(AndroidUtilities.dpf2(6.33f));
        int iMax = Math.max(1, AndroidUtilities.dp(3.0f));
        int iDp3 = this.f28750j ? AndroidUtilities.dp(18.99f) : AndroidUtilities.dp(f11);
        Bitmap bitmap = this.f28751k;
        Paint paint2 = this.f28745c;
        if (bitmap != null && this.f28752l == iL2 && this.f28753m == iH && this.f28754n == iH2) {
            f12 = fMax;
            if (this.f28756p != this.f28750j || this.f28755o != iRound || bitmap.getWidth() != iMax || this.f28751k.getHeight() != iDp3) {
            }
            Matrix matrix = this.d;
            matrix.setTranslate(0.0f, -fD);
            paint2.getShader().setLocalMatrix(matrix);
            paint2.setAlpha(255);
            rectF2.set(0.0f, 0.0f, f12 - rectF.left, rectF.bottom - rectF.top);
            float f17 = rectF2.left;
            canvas.clipRect(f17, rectF2.top, AndroidUtilities.dp(3.0f) + f17, rectF2.bottom);
            float f18 = iFloor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
            canvas.restore();
        }
        f12 = fMax;
        this.f28752l = iL2;
        this.f28753m = iH;
        this.f28754n = iH2;
        this.f28756p = this.f28750j;
        this.f28755o = iRound;
        Bitmap bitmap2 = this.f28751k;
        if (bitmap2 == null || bitmap2.getWidth() != iMax || this.f28751k.getHeight() != iDp3) {
            Bitmap bitmap3 = this.f28751k;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.f28751k = Bitmap.createBitmap(iMax, iDp3, Bitmap.Config.ARGB_8888);
            paint2.setShader(new BitmapShader(this.f28751k, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        }
        Utilities.drawReplyLinePattern(this.f28751k, iL2, iH, iH2, iRound, this.f28750j);
        Matrix matrix2 = this.d;
        matrix2.setTranslate(0.0f, -fD);
        paint2.getShader().setLocalMatrix(matrix2);
        paint2.setAlpha(255);
        rectF2.set(0.0f, 0.0f, f12 - rectF.left, rectF.bottom - rectF.top);
        float f19 = rectF2.left;
        canvas.clipRect(f19, rectF2.top, AndroidUtilities.dp(3.0f) + f19, rectF2.bottom);
        float f110 = iFloor;
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f110), AndroidUtilities.dp(f110), paint2);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13) {
        t80 t80Var;
        float fMax = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f10));
        float[] fArr = this.f28746e;
        fArr[1] = fMax;
        fArr[0] = fMax;
        float fDp = AndroidUtilities.dp(f11);
        fArr[3] = fDp;
        fArr[2] = fDp;
        float fDp2 = AndroidUtilities.dp(f12);
        fArr[5] = fDp2;
        fArr[4] = fDp2;
        float fMax2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f12));
        fArr[7] = fMax2;
        fArr[6] = fMax2;
        if (!this.S && ((t80Var = this.h) == null || !t80Var.c())) {
            t80 t80Var2 = this.h;
            if (t80Var2 != null) {
                t80Var2.f32692b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            t80 t80Var3 = new t80();
            this.h = t80Var3;
            t80Var3.C = true;
            t80Var3.f32708t = 3.5f;
            t80Var3.f32709u = 0.5f;
        }
        this.h.f(org.telegram.ui.ActionBar.g6.l1(0.1f, this.f28765z), org.telegram.ui.ActionBar.g6.l1(0.3f, this.f28765z), org.telegram.ui.ActionBar.g6.l1(0.3f, this.f28765z), org.telegram.ui.ActionBar.g6.l1(1.25f, this.f28765z));
        this.h.d(rectF);
        this.h.i(fArr);
        this.h.f32710w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int g() {
        return this.f28763x;
    }

    public final int h() {
        return this.R ? this.A : this.f28765z;
    }

    public final void i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float fE = this.M.e(this.S);
        this.T = (Math.min(30L, jCurrentTimeMillis - this.V) * fE) + this.T;
        this.U = (Math.min(30L, jCurrentTimeMillis - this.V) * fE) + this.U;
        this.V = jCurrentTimeMillis;
    }

    public final void j(float f10) {
        this.X = f10;
    }

    public final void k() {
        this.F.a(this.f28765z, true);
        this.G.a(this.A, true);
        this.J.f(this.f28749i, true);
        this.I.a(this.f28764y, true);
        this.E.a(this.f28763x, true);
        i5 i5Var = this.f28760t;
        if (i5Var != null) {
            i5Var.d.d(1.0f, true);
        }
    }

    public final int l(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.c6 c6Var) {
        boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        int i10 = (!zA || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!zA || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            int id2 = messageObject != null ? messageObject.getId() : 0;
            if (id2 == this.O) {
                this.f28757q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = id2;
        }
        this.R = false;
        this.f28765z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        boolean z10 = arrayList.size() >= 2;
        this.f28749i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        boolean z11 = arrayList.size() >= 3;
        this.f28750j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i11 = i10 | (-16777216);
        this.f28764y = i11;
        this.f28763x = org.telegram.ui.ActionBar.g6.l1(0.1f, i11);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.f28762w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j10 != 0 && this.f28760t == null && view != null) {
            this.f28760t = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).I0) {
                this.f28760t.a();
            }
        }
        i5 i5Var = this.f28760t;
        if (i5Var != null && i5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = this.f28764y;
        if (this.f28762w != 0 && this.f28761u == null && view != null) {
            this.f28761u = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).I0) {
                this.f28761u.a();
            }
        }
        i5 i5Var2 = this.f28761u;
        if (i5Var2 != null) {
            i5Var2.j(this.f28762w, true);
        }
        return this.I.a(this.f28764y, false);
    }

    public final void m(MessageObject messageObject, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        if (c6Var != null) {
            c6Var.a();
        } else {
            org.telegram.ui.ActionBar.g6.e1();
        }
        if (this.P != i10) {
            int id2 = messageObject != null ? messageObject.getId() : 0;
            if (id2 == this.O) {
                this.f28757q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = id2;
        }
        if (i10 < 7) {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23303r8[i10], c6Var);
            this.B = iV0;
            this.A = iV0;
            this.f28765z = iV0;
            this.f28750j = false;
            this.f28749i = false;
            return;
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount).peerColors;
        MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
        if (color == null) {
            int iV1 = org.telegram.ui.ActionBar.g6.v0((messageObject == null || !messageObject.isOutOwner()) ? org.telegram.ui.ActionBar.g6.Uc : org.telegram.ui.ActionBar.g6.f23003ab, c6Var);
            this.B = iV1;
            this.A = iV1;
            this.f28765z = iV1;
            this.f28750j = false;
            this.f28749i = false;
            return;
        }
        this.f28765z = color.getColor(0, c6Var);
        this.A = color.getColor(1, c6Var);
        int color2 = color.getColor(2, c6Var);
        this.B = color2;
        int i11 = this.A;
        int i12 = this.f28765z;
        this.f28749i = i11 != i12;
        boolean z10 = color2 != i12;
        this.f28750j = z10;
        if (z10) {
            this.B = i11;
            this.A = color2;
        }
    }

    public final void n(float f10) {
        this.f28758r = f10;
    }

    public final int o(org.telegram.ui.ActionBar.c6 c6Var) {
        View view;
        int i10 = org.telegram.ui.ActionBar.g6.f23284q7;
        this.f28764y = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        this.f28765z = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        this.f28749i = false;
        this.f28750j = false;
        this.f28763x = org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        if (this.v != 0 && this.f28760t == null && (view = this.D) != null) {
            this.f28760t = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).I0) {
                this.f28760t.a();
            }
        }
        i5 i5Var = this.f28760t;
        if (i5Var != null && i5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = h();
        return this.I.a(this.f28764y, false);
    }

    public final void p(boolean z10) {
        t80 t80Var;
        if (!z10 && this.S) {
            this.T = 0.0f;
            t80 t80Var2 = this.h;
            if (t80Var2 != null) {
                t80Var2.a();
            }
        } else if (z10 && !this.S && (t80Var = this.h) != null) {
            t80Var.f32693c = -1L;
            t80Var.f32692b = -1L;
        }
        this.S = z10;
    }

    public final void q(int i10, boolean z10) {
        this.R = false;
        this.f28750j = false;
        this.f28749i = false;
        this.B = i10;
        this.A = i10;
        this.f28765z = i10;
        this.f28763x = org.telegram.ui.ActionBar.g6.l1(z10 ? 0.12f : 0.1f, i10);
        this.C = i10;
    }
}
