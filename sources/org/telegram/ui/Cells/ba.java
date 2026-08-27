package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.un;

public class ba extends LinearLayout {

    public org.telegram.ui.Components.l9 f24129a;

    public org.telegram.ui.Components.l9 f24130b;

    public Drawable f24131c;
    public Drawable d;

    public final s1[] f24132e;

    public final Drawable f24133f;
    public final org.telegram.ui.ActionBar.b5 h;

    public final int f24134n;

    public org.telegram.ui.ActionBar.n2 f24135r;

    public int f24136s;
    public final g v;

    public Drawable f24137w;

    public boolean f24138x;

    public final org.telegram.ui.Components.y5 f24139y;

    public ba(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i10) {
        this(context, b5Var, i10, 0L, null);
    }

    public final boolean a() {
        int i10 = this.f24134n;
        return i10 == 3 || i10 == 0;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f24134n == 2 || a()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public s1[] getCells() {
        return this.f24132e;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = 0;
        while (true) {
            s1[] s1VarArr = this.f24132e;
            if (i10 >= s1VarArr.length) {
                return;
            }
            s1VarArr[i10].invalidate();
            i10++;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f24137w;
        if (drawable instanceof un) {
            ((un) drawable).f(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.l9 l9Var = this.f24129a;
        if (l9Var != null) {
            l9Var.dispose();
            this.f24129a = null;
        }
        org.telegram.ui.Components.l9 l9Var2 = this.f24130b;
        if (l9Var2 != null) {
            l9Var2.dispose();
            this.f24130b = null;
        }
        Drawable drawable = this.f24137w;
        if (drawable instanceof un) {
            ((un) drawable).g(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawableS0 = this.f24137w;
        if (drawableS0 == null) {
            drawableS0 = org.telegram.ui.ActionBar.g6.s0();
        }
        if (org.telegram.ui.ActionBar.g6.d != null) {
            invalidate();
        }
        Drawable drawable = this.f24131c;
        org.telegram.ui.Components.y5 y5Var = this.f24139y;
        if (drawableS0 != drawable && drawableS0 != null) {
            if (org.telegram.ui.ActionBar.g6.sl == null && !this.f24138x) {
                org.telegram.ui.Components.l9 l9Var = this.f24129a;
                if (l9Var != null) {
                    l9Var.dispose();
                    this.f24129a = null;
                }
            } else {
                this.d = drawable;
                this.f24130b = this.f24129a;
            }
            this.f24131c = drawableS0;
            y5Var.d(0.0f, true);
        }
        boolean z10 = this.f24138x;
        org.telegram.ui.ActionBar.b5 b5Var = this.h;
        float fD = z10 ? y5Var.d(1.0f, false) : b5Var.getThemeAnimationValue();
        int i10 = 0;
        while (i10 < 2) {
            Drawable drawable2 = i10 == 0 ? this.d : this.f24131c;
            if (drawable2 != null) {
                int i11 = (i10 != 1 || this.d == null || (b5Var == null && !this.f24138x)) ? 255 : (int) (255.0f * fD);
                if (i11 > 0) {
                    drawable2.setAlpha(i11);
                    if ((drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable) || (drawable2 instanceof nb0)) {
                        drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable2 instanceof org.telegram.ui.Components.m9) {
                            this.f24129a = ((org.telegram.ui.Components.m9) drawable2).c(canvas, this);
                        } else {
                            drawable2.draw(canvas);
                        }
                    } else if (drawable2 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable2;
                        bitmapDrawable.setFilterBitmap(true);
                        if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f10 = 2.0f / AndroidUtilities.density;
                            canvas.scale(f10, f10);
                            drawable2.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float fMax = Math.max(getMeasuredWidth() / drawable2.getIntrinsicWidth(), measuredHeight / drawable2.getIntrinsicHeight());
                            int iCeil = (int) Math.ceil(drawable2.getIntrinsicWidth() * fMax);
                            int iCeil2 = (int) Math.ceil(drawable2.getIntrinsicHeight() * fMax);
                            int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                            int i12 = (measuredHeight - iCeil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, iCeil, getMeasuredHeight());
                            drawable2.setBounds(measuredWidth, i12, iCeil + measuredWidth, iCeil2 + i12);
                        }
                        drawable2.draw(canvas);
                        canvas.restore();
                    } else {
                        lh.z7.j(canvas, drawable2, getWidth(), getHeight());
                    }
                    if (i10 == 0 && this.d != null && fD >= 1.0f) {
                        org.telegram.ui.Components.l9 l9Var2 = this.f24130b;
                        if (l9Var2 != null) {
                            l9Var2.dispose();
                            this.f24130b = null;
                        }
                        this.d = null;
                        invalidate();
                    }
                }
            }
            i10++;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.f24133f;
        drawable3.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable3.draw(canvas);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f24134n == 2 || a()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f24134n == 2 || a()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setOverrideBackground(Drawable drawable) {
        this.f24137w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.f24137w instanceof un) && isAttachedToWindow()) {
            ((un) this.f24137w).f(this);
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f24137w || drawable == this.d || super.verifyDrawable(drawable);
    }

    public ba(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11;
        s1[] s1VarArr;
        int i12;
        boolean z10;
        MessageObject messageObject3;
        super(context);
        Context context2 = context;
        int i13 = i10;
        this.f24132e = new s1[2];
        this.f24136s = -1;
        this.v = new g(this, 9);
        this.f24139y = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        this.f24134n = i13;
        int i14 = UserConfig.selectedAccount;
        this.h = b5Var;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
        this.f24133f = org.telegram.ui.ActionBar.g6.U0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23018b7, c6Var2));
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i13 == 3) {
            boolean z11 = j10 < 0;
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(z11 ? R.string.ChannelColorPreview : R.string.UserColorPreview);
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 1;
            if (j10 == 0) {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerUser();
                tL_message.reply_to.reply_to_peer_id.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            } else {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerChannel();
                tL_message.reply_to.reply_to_peer_id.channel_id = -j10;
            }
            TLRPC.Message message = new TLRPC.Message();
            tL_message.replyMessage = message;
            message.media = new TLRPC.TL_messageMediaEmpty();
            if (j10 == 0) {
                tL_message.replyMessage.from_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.from_id.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message.replyMessage.peer_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.peer_id.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            } else {
                tL_message.replyMessage.from_id = new TLRPC.TL_peerChannel();
                TLRPC.Message message2 = tL_message.replyMessage;
                long j11 = -j10;
                message2.from_id.channel_id = j11;
                message2.peer_id = new TLRPC.TL_peerChannel();
                tL_message.replyMessage.peer_id.channel_id = j11;
            }
            tL_message.replyMessage.message = LocaleController.getString(z11 ? R.string.ChannelColorPreviewReply : R.string.UserColorPreviewReply);
            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
            tL_message.media = tL_messageMediaWebPage;
            tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
            TLRPC.WebPage webPage = tL_message.media.webpage;
            webPage.embed_url = "https://telegram.org/";
            webPage.flags |= 2;
            webPage.site_name = LocaleController.getString(R.string.AppName);
            TLRPC.WebPage webPage2 = tL_message.media.webpage;
            webPage2.flags |= 4;
            webPage2.title = LocaleController.getString(z11 ? R.string.ChannelColorPreviewLinkTitle : R.string.UserColorPreviewLinkTitle);
            TLRPC.WebPage webPage3 = tL_message.media.webpage;
            webPage3.flags |= 8;
            webPage3.description = LocaleController.getString(z11 ? R.string.ChannelColorPreviewLinkDescription : R.string.UserColorPreviewLinkDescription);
            tL_message.date = iCurrentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 259;
            if (j10 == 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = -j10;
            }
            tL_message.f22401id = 1;
            tL_message.out = false;
            if (j10 == 0) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = 0L;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = -j10;
            }
            MessageObject messageObject4 = new MessageObject(UserConfig.selectedAccount, tL_message, true, false);
            messageObject4.notime = true;
            messageObject4.forceAvatar = true;
            messageObject4.resetLayout();
            messageObject4.eventId = 1L;
            messageObject = messageObject4;
        } else {
            if (i13 == 2) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.message = LocaleController.getString(R.string.DoubleTapPreviewMessage);
                tL_message2.date = iCurrentTimeMillis - 3540;
                tL_message2.dialog_id = 1L;
                tL_message2.flags = 259;
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.from_id = tL_peerUser3;
                tL_peerUser3.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message2.f22401id = 1;
                tL_message2.media = new TLRPC.TL_messageMediaEmpty();
                tL_message2.out = false;
                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser4;
                tL_peerUser4.user_id = 0L;
                MessageObject messageObject5 = new MessageObject(UserConfig.selectedAccount, tL_message2, true, false);
                messageObject5.resetLayout();
                messageObject5.eventId = 1L;
                messageObject5.customName = LocaleController.getString(R.string.DoubleTapPreviewSenderName);
                messageObject5.customAvatarDrawable = context2.getDrawable(R.drawable.dino_pic);
                messageObject5.overrideLinkColor = 5;
                messageObject5.overrideLinkEmoji = 0L;
                messageObject = messageObject5;
            } else {
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                if (i13 == 0) {
                    tL_message3.message = LocaleController.getString(R.string.FontSizePreviewReply);
                } else {
                    tL_message3.message = LocaleController.getString(R.string.NewThemePreviewReply);
                }
                int iIndexOf = tL_message3.message.indexOf("👋");
                if (iIndexOf >= 0) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.offset = iIndexOf;
                    tL_messageEntityCustomEmoji.length = 2;
                    tL_messageEntityCustomEmoji.document_id = 5386654653003864312L;
                    tL_message3.entities.add(tL_messageEntityCustomEmoji);
                }
                int i15 = iCurrentTimeMillis - 3540;
                tL_message3.date = i15;
                tL_message3.dialog_id = 1L;
                tL_message3.flags = 259;
                TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
                tL_message3.from_id = tL_peerUser5;
                tL_peerUser5.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message3.f22401id = 1;
                tL_message3.media = new TLRPC.TL_messageMediaEmpty();
                tL_message3.out = true;
                TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
                tL_message3.peer_id = tL_peerUser6;
                tL_peerUser6.user_id = 0L;
                MessageObject messageObject6 = new MessageObject(UserConfig.selectedAccount, tL_message3, true, false);
                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                if (i13 == 0) {
                    tL_message4.message = LocaleController.getString(R.string.FontSizePreviewLine2);
                } else {
                    String string = LocaleController.getString(R.string.NewThemePreviewLine3);
                    StringBuilder sb2 = new StringBuilder(string);
                    int iIndexOf2 = string.indexOf(42);
                    int iLastIndexOf = string.lastIndexOf(42);
                    if (iIndexOf2 != -1 && iLastIndexOf != -1) {
                        sb2.replace(iLastIndexOf, iLastIndexOf + 1, "");
                        sb2.replace(iIndexOf2, iIndexOf2 + 1, "");
                        TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                        tL_messageEntityTextUrl.offset = iIndexOf2;
                        tL_messageEntityTextUrl.length = (iLastIndexOf - iIndexOf2) - 1;
                        tL_messageEntityTextUrl.url = "https://telegram.org";
                        tL_message4.entities.add(tL_messageEntityTextUrl);
                    }
                    tL_message4.message = sb2.toString();
                }
                int iIndexOf3 = tL_message4.message.indexOf("😎");
                if (iIndexOf3 >= 0) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji2.offset = iIndexOf3;
                    tL_messageEntityCustomEmoji2.length = 2;
                    tL_messageEntityCustomEmoji2.document_id = 5373141891321699086L;
                    tL_message4.entities.add(tL_messageEntityCustomEmoji2);
                }
                tL_message4.date = iCurrentTimeMillis - 2640;
                tL_message4.dialog_id = 1L;
                tL_message4.flags = 259;
                TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
                tL_message4.from_id = tL_peerUser7;
                tL_peerUser7.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message4.f22401id = 1;
                tL_message4.media = new TLRPC.TL_messageMediaEmpty();
                tL_message4.out = true;
                TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
                tL_message4.peer_id = tL_peerUser8;
                tL_peerUser8.user_id = 0L;
                MessageObject messageObject7 = new MessageObject(UserConfig.selectedAccount, tL_message4, true, false);
                messageObject7.resetLayout();
                messageObject7.overrideLinkColor = 5;
                messageObject7.overrideLinkEmoji = 0L;
                messageObject7.eventId = 1L;
                TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                if (i13 == 0) {
                    tL_message5.message = LocaleController.getString(R.string.FontSizePreviewLine1);
                } else {
                    tL_message5.message = LocaleController.getString(R.string.NewThemePreviewLine1);
                }
                tL_message5.date = i15;
                tL_message5.dialog_id = 1L;
                tL_message5.flags = 265;
                tL_message5.from_id = new TLRPC.TL_peerUser();
                tL_message5.f22401id = 1;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
                tL_message5.reply_to = tL_messageReplyHeader2;
                tL_messageReplyHeader2.flags |= 16;
                tL_messageReplyHeader2.reply_to_msg_id = 5;
                tL_message5.media = new TLRPC.TL_messageMediaEmpty();
                tL_message5.out = false;
                TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
                tL_message5.peer_id = tL_peerUser9;
                tL_peerUser9.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                MessageObject messageObject8 = new MessageObject(UserConfig.selectedAccount, tL_message5, true, false);
                if (i13 != 0) {
                    messageObject8.customReplyName = LocaleController.getString(R.string.NewThemePreviewName);
                }
                messageObject8.eventId = 1L;
                messageObject8.resetLayout();
                messageObject8.replyMessageObject = messageObject6;
                if (i13 == 4) {
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    String string2 = LocaleController.getString(R.string.GroupThemePreviewSenderName);
                    tL_user.first_name = string2;
                    messageObject8.customName = string2;
                    messageObject8.customAvatarDrawable = new org.telegram.ui.Components.y8(0, tL_user);
                }
                messageObject = messageObject7;
                messageObject2 = messageObject8;
            }
            i11 = 0;
            while (true) {
                s1VarArr = this.f24132e;
                if (i11 < s1VarArr.length) {
                    return;
                }
                i12 = i13;
                s1VarArr[i11] = new aa(this, context2, i14, c6Var2, context, i12);
                this.f24132e[i11].setDelegate(new n1.d(this, 8));
                s1 s1Var = this.f24132e[i11];
                if (i12 != 2 || i12 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s1Var.J7 = z10;
                s1Var.setFullyDraw(true);
                if (i11 == 0) {
                    messageObject3 = messageObject2;
                } else {
                    messageObject3 = messageObject;
                }
                if (messageObject3 == null) {
                    this.f24132e[i11].W3(messageObject3, null, false, false, false, false);
                    addView(this.f24132e[i11], h7.z5.n(-1, -2));
                }
                i11++;
                context2 = context;
                c6Var2 = c6Var;
                i13 = i12;
            }
        }
        messageObject2 = null;
        i11 = 0;
        while (true) {
            s1VarArr = this.f24132e;
            if (i11 < s1VarArr.length) {
                return;
            }
            i12 = i13;
            s1VarArr[i11] = new aa(this, context2, i14, c6Var2, context, i12);
            this.f24132e[i11].setDelegate(new n1.d(this, 8));
            s1 s1Var2 = this.f24132e[i11];
            if (i12 != 2) {
                z10 = true;
            } else {
                z10 = true;
            }
            s1Var2.J7 = z10;
            s1Var2.setFullyDraw(true);
            if (i11 == 0) {
                messageObject3 = messageObject2;
            } else {
                messageObject3 = messageObject;
            }
            if (messageObject3 == null) {
                this.f24132e[i11].W3(messageObject3, null, false, false, false, false);
                addView(this.f24132e[i11], h7.z5.n(-1, -2));
            }
            i11++;
            context2 = context;
            c6Var2 = c6Var;
            i13 = i12;
        }
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
