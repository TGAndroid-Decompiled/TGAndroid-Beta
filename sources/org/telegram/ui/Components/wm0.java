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
public final class wm0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final j5 E;
    public final j5 F;
    public final j5 G;
    public final j5 H;
    public final j5 I;
    public final h6 J;
    public final h6 K;
    public final h6 L;
    public final h6 M;
    public final h6 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public org.telegram.ui.ActionBar.u6 T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public float Y;
    public long Z;
    public vm0[] f34481a0;
    public float f34483b0;
    public boolean f34485c0;
    public da0 h;
    public boolean f34488i;
    public boolean f34489j;
    public Bitmap f34490k;
    public int f34491l;
    public int f34492m;
    public int f34493n;
    public int f34494o;
    public boolean f34495p;
    public boolean f34498s;
    public r5 f34499t;
    public r5 f34500u;
    public long v;
    public long f34501w;
    public int f34502x;
    public int f34503y;
    public int f34504z;
    public final RectF f34480a = new RectF();
    public final Paint f34482b = new Paint(1);
    public final Paint f34484c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f34486f = new Path();
    public final Paint f34487g = new Paint();
    public int f34496q = 0;
    public float f34497r = 1.0f;

    public wm0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new bi.i6(this, 10));
        }
        ds dsVar = ds.h;
        this.E = new j5(view, 400L, dsVar, 0);
        this.F = new j5(view, 400L, dsVar, 0);
        this.G = new j5(view, 400L, dsVar, 0);
        this.H = new j5(view, 400L, dsVar, 0);
        this.I = new j5(view, 400L, dsVar, 0);
        this.J = new h6(view, 0L, 400L, dsVar);
        this.K = new h6(view, 0L, 400L, dsVar);
        this.L = new h6(view, 0L, 440L, dsVar);
        this.M = new h6(view, 0L, 320L, dsVar);
        this.N = new h6(view, 0L, 320L, dsVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        boolean q5;
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
        this.R = false;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        if (messageObject != null && !messageObject.isOutOwner() && i10 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return m(messageObject, tL_peerColorCollectible, u6Var);
        }
        this.V = false;
        this.v = 0L;
        this.f34501w = 0L;
        if (messageObject != null && messageObject.isSponsored()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34498s = z10;
        j5 j5Var2 = this.I;
        float f10 = 0.1f;
        if (messageObject == null) {
            this.R = true;
            this.S = i10;
            this.T = u6Var;
            this.U = org.telegram.ui.ActionBar.f7.f22628b;
            this.f34489j = false;
            this.f34488i = false;
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Uc, u6Var);
            this.B = w02;
            this.A = w02;
            this.f34504z = w02;
            if (q5) {
                f7 = 0.12f;
            } else {
                f7 = 0.1f;
            }
            this.f34502x = org.telegram.ui.ActionBar.y6.o1(f7, w02);
            this.C = i();
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wc, u6Var);
            this.f34503y = w03;
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
                    return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, u6Var);
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
            n(messageObject, i13, u6Var);
            this.f34502x = org.telegram.ui.ActionBar.y6.o1(0.1f, this.f34504z);
            this.f34503y = this.f34504z;
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
                                        return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, u6Var);
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
                                        return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, u6Var);
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
                                    return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, u6Var);
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
                                    return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, u6Var);
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
                                    return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, u6Var);
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
                n(messageObject, i14, u6Var);
                this.f34502x = org.telegram.ui.ActionBar.y6.o1(0.1f, this.f34504z);
                this.f34503y = this.f34504z;
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
                                return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, u6Var);
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
                                    return m(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, u6Var);
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
                n(messageObject.replyMessageObject, i15, u6Var);
                this.f34502x = org.telegram.ui.ActionBar.y6.o1(0.1f, this.f34504z);
                this.f34503y = this.f34504z;
            } else {
                this.f34488i = false;
                this.f34489j = false;
                int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Uc, u6Var);
                this.B = w04;
                this.A = w04;
                this.f34504z = w04;
                this.f34502x = org.telegram.ui.ActionBar.y6.o1(0.1f, w04);
                this.f34503y = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wc, u6Var);
            }
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.f34488i = false;
            this.f34489j = false;
            this.B = -1;
            this.A = -1;
            this.f34504z = -1;
            this.f34502x = 0;
            this.f34503y = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Xc, u6Var);
        } else if (messageObject.isOutOwner() || i10 == 2) {
            if (i10 == 2 && !messageObject.isOutOwner()) {
                int w05 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pk, u6Var);
                this.B = w05;
                this.A = w05;
                this.f34504z = w05;
            } else {
                if (!this.f34488i && !this.f34489j) {
                    i12 = org.telegram.ui.ActionBar.y6.f23303ab;
                } else {
                    i12 = org.telegram.ui.ActionBar.y6.f23322bb;
                }
                int w06 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
                this.B = w06;
                this.A = w06;
                this.f34504z = w06;
            }
            if (this.f34489j) {
                this.V = true;
                this.f34504z = org.telegram.ui.ActionBar.y6.o1(0.2f, this.f34504z);
                this.A = org.telegram.ui.ActionBar.y6.o1(0.5f, this.A);
            } else if (this.f34488i) {
                this.V = true;
                this.f34504z = org.telegram.ui.ActionBar.y6.o1(0.35f, this.f34504z);
            }
            int i16 = this.B;
            if (q5) {
                f10 = 0.12f;
            }
            this.f34502x = org.telegram.ui.ActionBar.y6.o1(f10, i16);
            this.f34503y = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23342cb, u6Var);
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = messageObject.overrideLinkEmoji;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.f34499t == null && (view = this.D) != null) {
            this.f34499t = new r5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).M0) {
                this.f34499t.a();
            }
        }
        r5 r5Var = this.f34499t;
        if (r5Var != null) {
            z11 = true;
            if (r5Var.j(this.v, true)) {
                this.f34485c0 = false;
            }
        } else {
            z11 = true;
        }
        r5 r5Var2 = this.f34500u;
        if (r5Var2 != null) {
            r5Var2.j(this.f34501w, z11);
        }
        this.C = i();
        return j5Var.a(this.f34503y, false);
    }

    public final void b() {
        wm0 wm0Var;
        if (this.R && this.U != org.telegram.ui.ActionBar.f7.f22628b) {
            try {
                wm0Var = this;
            } catch (Exception e) {
                e = e;
                wm0Var = this;
            }
            try {
                wm0Var.a(null, null, null, this.T, this.S);
            } catch (Exception e10) {
                e = e10;
                wm0Var.R = false;
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
        di.f3 f3Var;
        float e;
        int i10;
        r5 r5Var;
        float f10;
        b();
        if (!z11) {
            int o12 = org.telegram.ui.ActionBar.y6.o1(f7, this.E.a(this.f34502x, false));
            Paint paint = this.f34487g;
            paint.setColor(o12);
            float[] fArr = this.e;
            if (a8.w0.a(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f34486f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        r5 r5Var2 = this.f34499t;
        if (r5Var2 != null) {
            if (!this.f34485c0) {
                Drawable drawable = r5Var2.f32096f[0];
                if ((drawable instanceof t5) && (f3Var = ((t5) drawable).f32852k) != null && f3Var.hasImageLoaded()) {
                    this.f34485c0 = true;
                } else {
                    z12 = false;
                    e = this.L.e(z12);
                    if (e <= 0.0f && this.f34497r > 0.0f) {
                        if (this.f34481a0 == null) {
                            i10 = 0;
                            this.f34481a0 = new vm0[]{new vm0(4.0f, -6.33f, 1.0f, 1.0f), new vm0(30.0f, 3.0f, 0.78f, 0.9f), new vm0(46.0f, -17.0f, 0.6f, 0.6f), new vm0(69.66f, -0.666f, 0.87f, 0.7f), new vm0(98.0f, -12.6f, 1.03f, 0.3f), new vm0(51.0f, 24.0f, 1.0f, 0.5f), new vm0(6.33f, 20.0f, 0.77f, 0.7f), new vm0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new vm0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                        } else {
                            i10 = 0;
                        }
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(0.0f, this.f34483b0);
                        float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
                        if (z10) {
                            max -= AndroidUtilities.dp(12.0f);
                        }
                        float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
                        r5 r5Var3 = this.f34500u;
                        if (r5Var3 != null) {
                            r5Var3.v = (int) (f7 * 255.0f);
                        }
                        this.f34499t.k(Integer.valueOf(this.C));
                        int i11 = i10;
                        while (true) {
                            vm0[] vm0VarArr = this.f34481a0;
                            if (i11 < vm0VarArr.length) {
                                if (i11 != 0 || (r5Var = this.f34500u) == null || this.f34501w == 0) {
                                    r5Var = this.f34499t;
                                }
                                vm0 vm0Var = vm0VarArr[i11];
                                if (!vm0Var.e || z10) {
                                    if (r5Var == this.f34500u) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.3f;
                                    }
                                    r5Var.v = (int) (f10 * 255.0f * vm0Var.d * this.f34497r);
                                    float dp = max - AndroidUtilities.dp(vm0Var.f33689a);
                                    float dp2 = AndroidUtilities.dp(vm0Var.f33690b) + min;
                                    float dp3 = AndroidUtilities.dp(10.0f) * vm0Var.f33691c * e;
                                    r5Var.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                                    r5Var.draw(canvas);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wm0.f(android.graphics.Canvas, android.graphics.RectF, float):void");
    }

    public final void g(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        da0 da0Var;
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
        if (!this.W && ((da0Var = this.h) == null || !da0Var.d())) {
            da0 da0Var2 = this.h;
            if (da0Var2 != null) {
                da0Var2.f27462b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            da0 da0Var3 = new da0();
            this.h = da0Var3;
            da0Var3.D = true;
            da0Var3.f27477t = 3.5f;
            da0Var3.f27478u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.y6.o1(0.1f, this.f34504z), org.telegram.ui.ActionBar.y6.o1(0.3f, this.f34504z), org.telegram.ui.ActionBar.y6.o1(0.3f, this.f34504z), org.telegram.ui.ActionBar.y6.o1(1.25f, this.f34504z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.f27480x.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f12 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int h() {
        return this.f34502x;
    }

    public final int i() {
        if (this.V) {
            return this.A;
        }
        return this.f34504z;
    }

    public final void j() {
        long currentTimeMillis = System.currentTimeMillis();
        float e = this.M.e(this.W);
        this.X = (((float) Math.min(30L, currentTimeMillis - this.Z)) * e) + this.X;
        this.Y = (((float) Math.min(30L, currentTimeMillis - this.Z)) * e) + this.Y;
        this.Z = currentTimeMillis;
    }

    public final void k(float f7) {
        this.f34483b0 = f7;
    }

    public final void l() {
        this.F.a(this.f34504z, true);
        this.G.a(this.A, true);
        this.J.f(this.f34488i, true);
        this.I.a(this.f34503y, true);
        this.E.a(this.f34502x, true);
        r5 r5Var = this.f34499t;
        if (r5Var != null) {
            r5Var.d.d(1.0f, true);
        }
    }

    public final int m(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.u6 u6Var) {
        boolean q5;
        int i10;
        ArrayList<Integer> arrayList;
        boolean z10;
        boolean z11;
        int i11;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        if (q5 && (tL_peerColorCollectible.flags & 1) != 0) {
            i10 = tL_peerColorCollectible.dark_accent_color;
        } else {
            i10 = tL_peerColorCollectible.accent_color;
        }
        if (q5 && (tL_peerColorCollectible.flags & 2) != 0) {
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
                this.f34496q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = i11;
        }
        this.V = false;
        this.f34504z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        if (arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34488i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        if (arrayList.size() >= 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34489j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i12 = i10 | (-16777216);
        this.f34503y = i12;
        this.f34502x = org.telegram.ui.ActionBar.y6.o1(0.1f, i12);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.f34501w = tL_peerColorCollectible.gift_emoji_id;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        View view = this.D;
        if (i13 != 0 && this.f34499t == null && view != null) {
            this.f34499t = new r5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).M0) {
                this.f34499t.a();
            }
        }
        r5 r5Var = this.f34499t;
        if (r5Var != null && r5Var.j(this.v, true)) {
            this.f34485c0 = false;
        }
        this.C = this.f34503y;
        if (this.f34501w != 0 && this.f34500u == null && view != null) {
            this.f34500u = new r5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).M0) {
                this.f34500u.a();
            }
        }
        r5 r5Var2 = this.f34500u;
        if (r5Var2 != null) {
            r5Var2.j(this.f34501w, true);
        }
        return this.I.a(this.f34503y, false);
    }

    public final void n(MessageObject messageObject, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        int i11;
        MessagesController.PeerColor peerColor;
        boolean z10;
        int i12;
        int i13;
        if (u6Var != null) {
            u6Var.a();
        } else {
            org.telegram.ui.ActionBar.y6.h1();
        }
        boolean z11 = true;
        if (this.P != i10) {
            if (messageObject != null) {
                i13 = messageObject.getId();
            } else {
                i13 = 0;
            }
            if (i13 == this.O) {
                this.f34496q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = i13;
        }
        if (i10 < 7) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23616r8[i10], u6Var);
            this.B = w02;
            this.A = w02;
            this.f34504z = w02;
            this.f34489j = false;
            this.f34488i = false;
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
                i12 = org.telegram.ui.ActionBar.y6.f23303ab;
            } else {
                i12 = org.telegram.ui.ActionBar.y6.Uc;
            }
            int w03 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
            this.B = w03;
            this.A = w03;
            this.f34504z = w03;
            this.f34489j = false;
            this.f34488i = false;
            return;
        }
        this.f34504z = peerColor.getColor(0, u6Var);
        this.A = peerColor.getColor(1, u6Var);
        int color = peerColor.getColor(2, u6Var);
        this.B = color;
        int i14 = this.A;
        int i15 = this.f34504z;
        if (i14 != i15) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34488i = z10;
        if (color == i15) {
            z11 = false;
        }
        this.f34489j = z11;
        if (z11) {
            this.B = i14;
            this.A = color;
        }
    }

    public final void o(float f7) {
        this.f34497r = f7;
    }

    public final int p(org.telegram.ui.ActionBar.u6 u6Var) {
        View view;
        this.R = false;
        int i10 = org.telegram.ui.ActionBar.y6.f23598q7;
        this.f34503y = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        this.f34504z = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        this.f34488i = false;
        this.f34489j = false;
        this.f34502x = org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        if (this.v != 0 && this.f34499t == null && (view = this.D) != null) {
            this.f34499t = new r5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).M0) {
                this.f34499t.a();
            }
        }
        r5 r5Var = this.f34499t;
        if (r5Var != null && r5Var.j(this.v, true)) {
            this.f34485c0 = false;
        }
        this.C = i();
        return this.I.a(this.f34503y, false);
    }

    public final void q(boolean z10) {
        da0 da0Var;
        if (!z10 && this.W) {
            this.X = 0.0f;
            da0 da0Var2 = this.h;
            if (da0Var2 != null) {
                da0Var2.a();
            }
        } else if (z10 && !this.W && (da0Var = this.h) != null) {
            da0Var.f27463c = -1L;
            da0Var.f27462b = -1L;
        }
        this.W = z10;
    }

    public final void r(int i10, boolean z10) {
        float f7;
        this.R = false;
        this.V = false;
        this.f34489j = false;
        this.f34488i = false;
        this.B = i10;
        this.A = i10;
        this.f34504z = i10;
        if (z10) {
            f7 = 0.12f;
        } else {
            f7 = 0.1f;
        }
        this.f34502x = org.telegram.ui.ActionBar.y6.o1(f7, i10);
        this.C = i10;
    }
}
