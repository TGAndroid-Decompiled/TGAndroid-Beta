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
public final class dl0 {
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
    public cl0[] W;
    public float X;
    public boolean Y;
    public p80 h;
    public boolean f27760i;
    public boolean f27761j;
    public Bitmap f27762k;
    public int f27763l;
    public int f27764m;
    public int f27765n;
    public int f27766o;
    public boolean f27767p;
    public boolean f27770s;
    public i5 f27771t;
    public i5 f27772u;
    public long v;
    public long f27773w;
    public int f27774x;
    public int f27775y;
    public int f27776z;
    public final RectF f27754a = new RectF();
    public final Paint f27755b = new Paint(1);
    public final Paint f27756c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] f27757e = new float[8];
    public final Path f27758f = new Path();
    public final Paint f27759g = new Paint();
    public int f27768q = 0;
    public float f27769r = 1.0f;

    public dl0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new af.b(this, 12));
        }
        gr grVar = gr.h;
        this.E = new b5(view, 400L, grVar, 0);
        this.F = new b5(view, 400L, grVar, 0);
        this.G = new b5(view, 400L, grVar, 0);
        this.H = new b5(view, 400L, grVar, 0);
        this.I = new b5(view, 400L, grVar, 0);
        this.J = new y5(view, 0L, 400L, grVar);
        this.K = new y5(view, 0L, 400L, grVar);
        this.L = new y5(view, 0L, 440L, grVar);
        this.M = new y5(view, 0L, 320L, grVar);
        this.N = new y5(view, 0L, 320L, grVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        boolean q10;
        boolean z10;
        b5 b5Var;
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
        int i10;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        int i11;
        boolean z11;
        View view;
        TLRPC.Message message4;
        TLRPC.User user3;
        int i12;
        float f10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user4 = user;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        if (messageObject != null && !messageObject.isOutOwner() && i9 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return l(messageObject, tL_peerColorCollectible, b6Var);
        }
        this.R = false;
        this.v = 0L;
        this.f27773w = 0L;
        if (messageObject != null && messageObject.isSponsored()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27770s = z10;
        b5 b5Var2 = this.I;
        float f11 = 0.1f;
        if (messageObject == null) {
            this.f27761j = false;
            this.f27760i = false;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Uc, b6Var);
            this.B = v02;
            this.A = v02;
            this.f27776z = v02;
            if (q10) {
                f10 = 0.12f;
            } else {
                f10 = 0.1f;
            }
            this.f27774x = org.telegram.ui.ActionBar.f6.l1(f10, v02);
            this.C = h();
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wc, b6Var);
            this.f27775y = v03;
            return b5Var2.a(v03, false);
        }
        if (i9 == 4 && (message4 = messageObject.messageOwner) != null && MessageObject.getMedia(message4) != null && (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaContact)) {
            long j10 = MessageObject.getMedia(messageObject.messageOwner).user_id;
            if (j10 != 0) {
                user3 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(j10));
            } else {
                user3 = null;
            }
            if (!messageObject.isOutOwner() && i9 != 2 && user3 != null) {
                TLRPC.PeerColor peerColor3 = user3.color;
                if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, b6Var);
                }
            }
            if (user3 != null) {
                i12 = UserObject.getColorId(user3);
                b5Var = b5Var2;
                this.v = UserObject.getEmojiId(user3);
            } else {
                b5Var = b5Var2;
                i12 = 0;
            }
            m(messageObject, i12, b6Var);
            this.f27774x = org.telegram.ui.ActionBar.f6.l1(0.1f, this.f27776z);
            this.f27775y = this.f27776z;
        } else {
            b5Var = b5Var2;
            if (i9 != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && user4 != null) || ((messageObject.isFromChannel() && chat != null) || (((message3 = messageObject.messageOwner) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (messageObject.isSponsored() && (peerColor2 = messageObject.sponsoredColor) != null && peerColor2.color != -1))))))) {
                int i13 = messageObject.overrideLinkColor;
                if (i13 < 0) {
                    if (messageObject.isSponsored() && (peerColor = messageObject.sponsoredColor) != null && (i10 = peerColor.color) != -1) {
                        if (i9 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                        i13 = i10;
                    } else {
                        TLRPC.Message message5 = messageObject.messageOwner;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            i13 = 5;
                            if (peerDialogId < 0) {
                                TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                                if (!messageObject.isOutOwner() && i9 != 2 && chat2 != null) {
                                    TLRPC.PeerColor peerColor4 = chat2.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, b6Var);
                                    }
                                }
                                if (chat2 != null) {
                                    i13 = ChatObject.getColorId(chat2);
                                }
                                if (i9 == 3) {
                                    this.v = ChatObject.getEmojiId(chat2);
                                }
                            } else {
                                TLRPC.User user5 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                                if (!messageObject.isOutOwner() && i9 != 2 && user5 != null) {
                                    TLRPC.PeerColor peerColor5 = user5.color;
                                    if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, b6Var);
                                    }
                                }
                                if (user5 != null) {
                                    i13 = UserObject.getColorId(user5);
                                }
                                if (i9 == 3) {
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
                            if (!messageObject.isOutOwner() && i9 != 2) {
                                TLRPC.PeerColor peerColor6 = user4.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, b6Var);
                                }
                            }
                            i13 = UserObject.getColorId(user4);
                            if (i9 == 3) {
                                this.v = UserObject.getEmojiId(user4);
                            }
                        } else if (messageObject.isFromUser() && user4 != null) {
                            if (!messageObject.isOutOwner() && i9 != 2) {
                                TLRPC.PeerColor peerColor7 = user4.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, b6Var);
                                }
                            }
                            i13 = UserObject.getColorId(user4);
                            if (i9 == 3) {
                                this.v = UserObject.getEmojiId(user4);
                            }
                        } else if (messageObject.isFromChannel() && chat != null) {
                            if (!messageObject.isOutOwner() && i9 != 2) {
                                TLRPC.PeerColor peerColor8 = chat.color;
                                if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, b6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long fromChatId = messageObject.getFromChatId();
                                if (fromChatId >= 0) {
                                    TLRPC.User user6 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                                    colorId = UserObject.getColorId(user6);
                                    if (i9 == 3) {
                                        this.v = UserObject.getEmojiId(user6);
                                    }
                                } else {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                                    colorId = ChatObject.getColorId(chat3);
                                    if (i9 == 3) {
                                        this.v = ChatObject.getEmojiId(chat3);
                                    }
                                }
                                i13 = colorId;
                            } else {
                                i13 = ChatObject.getColorId(chat);
                                if (i9 == 3) {
                                    this.v = ChatObject.getEmojiId(chat);
                                }
                            }
                        } else {
                            i13 = 0;
                        }
                    }
                }
                m(messageObject, i13, b6Var);
                this.f27774x = org.telegram.ui.ActionBar.f6.l1(0.1f, this.f27776z);
                this.f27775y = this.f27776z;
            } else if (i9 == 0 && (messageObject.overrideLinkColor >= 0 || ((message = messageObject.messageOwner) != null && messageObject.replyMessageObject != null && (messageReplyHeader = message.reply_to) != null && (((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) && (message2 = (messageObject2 = messageObject.replyMessageObject).messageOwner) != null && message2.from_id != null && (messageObject2.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.replyMessageObject.isFromChannel()))))) {
                int i14 = messageObject.overrideLinkColor;
                if (i14 < 0) {
                    if (DialogObject.isEncryptedDialog(messageObject.replyMessageObject.getDialogId())) {
                        if (messageObject.replyMessageObject.isOutOwner()) {
                            user4 = UserConfig.getInstance(messageObject.replyMessageObject.currentAccount).getCurrentUser();
                        }
                        if (user4 != null) {
                            i14 = UserObject.getColorId(user4);
                            this.v = UserObject.getEmojiId(user4);
                        }
                        i14 = 0;
                    } else if (messageObject.replyMessageObject.isFromUser()) {
                        TLRPC.User user7 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                        if (!messageObject.isOutOwner() && i9 != 2 && user7 != null) {
                            TLRPC.PeerColor peerColor9 = user7.color;
                            if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, b6Var);
                            }
                        }
                        if (user7 != null) {
                            i14 = UserObject.getColorId(user7);
                            this.v = UserObject.getEmojiId(user7);
                        }
                        i14 = 0;
                    } else {
                        if (messageObject.replyMessageObject.isFromChannel()) {
                            TLRPC.Chat chat4 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id));
                            if (!messageObject.isOutOwner() && i9 != 2 && chat4 != null) {
                                TLRPC.PeerColor peerColor10 = chat4.color;
                                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, b6Var);
                                }
                            }
                            if (chat4 != null) {
                                i14 = ChatObject.getColorId(chat4);
                                this.v = ChatObject.getEmojiId(chat4);
                            }
                        }
                        i14 = 0;
                    }
                }
                m(messageObject.replyMessageObject, i14, b6Var);
                this.f27774x = org.telegram.ui.ActionBar.f6.l1(0.1f, this.f27776z);
                this.f27775y = this.f27776z;
            } else {
                this.f27760i = false;
                this.f27761j = false;
                int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Uc, b6Var);
                this.B = v04;
                this.A = v04;
                this.f27776z = v04;
                this.f27774x = org.telegram.ui.ActionBar.f6.l1(0.1f, v04);
                this.f27775y = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wc, b6Var);
            }
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.f27760i = false;
            this.f27761j = false;
            this.B = -1;
            this.A = -1;
            this.f27776z = -1;
            this.f27774x = 0;
            this.f27775y = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xc, b6Var);
        } else if (messageObject.isOutOwner() || i9 == 2) {
            if (i9 == 2 && !messageObject.isOutOwner()) {
                int v05 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.pk, b6Var);
                this.B = v05;
                this.A = v05;
                this.f27776z = v05;
            } else {
                if (!this.f27760i && !this.f27761j) {
                    i11 = org.telegram.ui.ActionBar.f6.f22951ab;
                } else {
                    i11 = org.telegram.ui.ActionBar.f6.f22969bb;
                }
                int v06 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
                this.B = v06;
                this.A = v06;
                this.f27776z = v06;
            }
            if (this.f27761j) {
                this.R = true;
                this.f27776z = org.telegram.ui.ActionBar.f6.l1(0.2f, this.f27776z);
                this.A = org.telegram.ui.ActionBar.f6.l1(0.5f, this.A);
            } else if (this.f27760i) {
                this.R = true;
                this.f27776z = org.telegram.ui.ActionBar.f6.l1(0.35f, this.f27776z);
            }
            int i15 = this.B;
            if (q10) {
                f11 = 0.12f;
            }
            this.f27774x = org.telegram.ui.ActionBar.f6.l1(f11, i15);
            this.f27775y = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22988cb, b6Var);
        }
        if (i9 == 0 || i9 == 3 || i9 == 4) {
            long j11 = messageObject.overrideLinkEmoji;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.f27771t == null && (view = this.D) != null) {
            this.f27771t = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).I0) {
                this.f27771t.a();
            }
        }
        i5 i5Var = this.f27771t;
        if (i5Var != null) {
            z11 = true;
            if (i5Var.j(this.v, true)) {
                this.Y = false;
            }
        } else {
            z11 = true;
        }
        i5 i5Var2 = this.f27772u;
        if (i5Var2 != null) {
            i5Var2.j(this.f27773w, z11);
        }
        this.C = h();
        return b5Var.a(this.f27775y, false);
    }

    public final void b(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13) {
        c(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void c(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z10, boolean z11) {
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f10));
        float[] fArr = this.f27757e;
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
        d(canvas, rectF, f13, z10, z11);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, boolean z10, boolean z11) {
        boolean z12;
        ih.z2 z2Var;
        float e10;
        i5 i5Var;
        float f11;
        if (!z11) {
            int l1 = org.telegram.ui.ActionBar.f6.l1(f10, this.E.a(this.f27774x, false));
            Paint paint = this.f27759g;
            paint.setColor(l1);
            float[] fArr = this.f27757e;
            if (ff.m0.c(fArr)) {
                float f12 = fArr[0];
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                Path path = this.f27758f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        i5 i5Var2 = this.f27771t;
        if (i5Var2 != null) {
            if (!this.Y) {
                Drawable drawable = i5Var2.f29319f[0];
                if ((drawable instanceof k5) && (z2Var = ((k5) drawable).f29951k) != null && z2Var.hasImageLoaded()) {
                    this.Y = true;
                } else {
                    z12 = false;
                    e10 = this.L.e(z12);
                    if (e10 <= 0.0f && this.f27769r > 0.0f) {
                        if (this.W == null) {
                            this.W = new cl0[]{new cl0(4.0f, -6.33f, 1.0f, 1.0f), new cl0(30.0f, 3.0f, 0.78f, 0.9f), new cl0(46.0f, -17.0f, 0.6f, 0.6f), new cl0(69.66f, -0.666f, 0.87f, 0.7f), new cl0(98.0f, -12.6f, 1.03f, 0.3f), new cl0(51.0f, 24.0f, 1.0f, 0.5f), new cl0(6.33f, 20.0f, 0.77f, 0.7f), new cl0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new cl0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.X);
                        float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
                        if (z10) {
                            max -= AndroidUtilities.dp(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
                        i5 i5Var3 = this.f27772u;
                        if (i5Var3 != null) {
                            i5Var3.v = (int) (f10 * 255.0f);
                        }
                        this.f27771t.k(Integer.valueOf(this.C));
                        int i9 = 0;
                        while (true) {
                            cl0[] cl0VarArr = this.W;
                            if (i9 < cl0VarArr.length) {
                                if (i9 != 0 || (i5Var = this.f27772u) == null || this.f27773w == 0) {
                                    i5Var = this.f27771t;
                                }
                                cl0 cl0Var = cl0VarArr[i9];
                                if (!cl0Var.f27510e || z10) {
                                    if (i5Var == this.f27772u) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.3f;
                                    }
                                    i5Var.v = (int) (f11 * 255.0f * cl0Var.d * this.f27769r);
                                    float dp = max - AndroidUtilities.dp(cl0Var.f27507a);
                                    float dp2 = AndroidUtilities.dp(cl0Var.f27508b) + min;
                                    float dp3 = AndroidUtilities.dp(10.0f) * cl0Var.f27509c * e10;
                                    i5Var.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                                    i5Var.draw(canvas);
                                }
                                i9++;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dl0.e(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void f(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13) {
        p80 p80Var;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f10));
        float[] fArr = this.f27757e;
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
        if (!this.S && ((p80Var = this.h) == null || !p80Var.c())) {
            p80 p80Var2 = this.h;
            if (p80Var2 != null) {
                p80Var2.f31572b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            p80 p80Var3 = new p80();
            this.h = p80Var3;
            p80Var3.C = true;
            p80Var3.f31588t = 3.5f;
            p80Var3.f31589u = 0.5f;
        }
        this.h.f(org.telegram.ui.ActionBar.f6.l1(0.1f, this.f27776z), org.telegram.ui.ActionBar.f6.l1(0.3f, this.f27776z), org.telegram.ui.ActionBar.f6.l1(0.3f, this.f27776z), org.telegram.ui.ActionBar.f6.l1(1.25f, this.f27776z));
        this.h.d(rectF);
        this.h.i(fArr);
        this.h.f31590w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int g() {
        return this.f27774x;
    }

    public final int h() {
        if (this.R) {
            return this.A;
        }
        return this.f27776z;
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        float e10 = this.M.e(this.S);
        this.T = (((float) Math.min(30L, currentTimeMillis - this.V)) * e10) + this.T;
        this.U = (((float) Math.min(30L, currentTimeMillis - this.V)) * e10) + this.U;
        this.V = currentTimeMillis;
    }

    public final void j(float f10) {
        this.X = f10;
    }

    public final void k() {
        this.F.a(this.f27776z, true);
        this.G.a(this.A, true);
        this.J.f(this.f27760i, true);
        this.I.a(this.f27775y, true);
        this.E.a(this.f27774x, true);
        i5 i5Var = this.f27771t;
        if (i5Var != null) {
            i5Var.d.d(1.0f, true);
        }
    }

    public final int l(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.b6 b6Var) {
        boolean q10;
        int i9;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i10;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
            i9 = tL_peerColorCollectible.dark_accent_color;
        } else {
            i9 = tL_peerColorCollectible.accent_color;
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
                i10 = messageObject.getId();
            } else {
                i10 = 0;
            }
            if (i10 == this.O) {
                this.f27768q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i10;
        }
        this.R = false;
        this.f27776z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27760i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27761j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i11 = i9 | (-16777216);
        this.f27775y = i11;
        this.f27774x = org.telegram.ui.ActionBar.f6.l1(0.1f, i11);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.f27773w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j10 != 0 && this.f27771t == null && view != null) {
            this.f27771t = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).I0) {
                this.f27771t.a();
            }
        }
        i5 i5Var = this.f27771t;
        if (i5Var != null && i5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = this.f27775y;
        if (this.f27773w != 0 && this.f27772u == null && view != null) {
            this.f27772u = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).I0) {
                this.f27772u.a();
            }
        }
        i5 i5Var2 = this.f27772u;
        if (i5Var2 != null) {
            i5Var2.j(this.f27773w, true);
        }
        return this.I.a(this.f27775y, false);
    }

    public final void m(MessageObject messageObject, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        int i10;
        MessagesController.PeerColor peerColor;
        boolean z10;
        int i11;
        int i12;
        if (b6Var != null) {
            b6Var.a();
        } else {
            org.telegram.ui.ActionBar.f6.e1();
        }
        boolean z11 = true;
        if (this.P != i9) {
            if (messageObject != null) {
                i12 = messageObject.getId();
            } else {
                i12 = 0;
            }
            if (i12 == this.O) {
                this.f27768q++;
            }
            this.Q = 0L;
            this.P = i9;
            this.O = i12;
        }
        if (i9 < 7) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23250r8[i9], b6Var);
            this.B = v02;
            this.A = v02;
            this.f27776z = v02;
            this.f27761j = false;
            this.f27760i = false;
            return;
        }
        if (messageObject != null) {
            i10 = messageObject.currentAccount;
        } else {
            i10 = UserConfig.selectedAccount;
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).peerColors;
        if (peerColors != null) {
            peerColor = peerColors.getColor(i9);
        } else {
            peerColor = null;
        }
        if (peerColor == null) {
            if (messageObject != null && messageObject.isOutOwner()) {
                i11 = org.telegram.ui.ActionBar.f6.f22951ab;
            } else {
                i11 = org.telegram.ui.ActionBar.f6.Uc;
            }
            int v03 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
            this.B = v03;
            this.A = v03;
            this.f27776z = v03;
            this.f27761j = false;
            this.f27760i = false;
            return;
        }
        this.f27776z = peerColor.getColor(0, b6Var);
        this.A = peerColor.getColor(1, b6Var);
        int color = peerColor.getColor(2, b6Var);
        this.B = color;
        int i13 = this.A;
        int i14 = this.f27776z;
        if (i13 != i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27760i = z10;
        if (color == i14) {
            z11 = false;
        }
        this.f27761j = z11;
        if (z11) {
            this.B = i13;
            this.A = color;
        }
    }

    public final void n(float f10) {
        this.f27769r = f10;
    }

    public final int o(org.telegram.ui.ActionBar.b6 b6Var) {
        View view;
        int i9 = org.telegram.ui.ActionBar.f6.f23230q7;
        this.f27775y = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        this.f27776z = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        this.f27760i = false;
        this.f27761j = false;
        this.f27774x = org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        if (this.v != 0 && this.f27771t == null && (view = this.D) != null) {
            this.f27771t = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).I0) {
                this.f27771t.a();
            }
        }
        i5 i5Var = this.f27771t;
        if (i5Var != null && i5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = h();
        return this.I.a(this.f27775y, false);
    }

    public final void p(boolean z10) {
        p80 p80Var;
        if (!z10 && this.S) {
            this.T = 0.0f;
            p80 p80Var2 = this.h;
            if (p80Var2 != null) {
                p80Var2.a();
            }
        } else if (z10 && !this.S && (p80Var = this.h) != null) {
            p80Var.f31573c = -1L;
            p80Var.f31572b = -1L;
        }
        this.S = z10;
    }

    public final void q(int i9, boolean z10) {
        float f10;
        this.R = false;
        this.f27761j = false;
        this.f27760i = false;
        this.B = i9;
        this.A = i9;
        this.f27776z = i9;
        if (z10) {
            f10 = 0.12f;
        } else {
            f10 = 0.1f;
        }
        this.f27774x = org.telegram.ui.ActionBar.f6.l1(f10, i9);
        this.C = i9;
    }
}
