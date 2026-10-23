package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public class gp0 extends FrameLayout {
    public final RectF E;
    public final org.telegram.ui.ActionBar.d6 f37385a;
    public final int f37386b;
    public final boolean f37387c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.h9 e;
    public final dl f37388f;
    public final org.telegram.ui.ActionBar.j5 h;
    public boolean f37389n;
    public final org.telegram.ui.Components.p5 f37390r;
    public final org.telegram.ui.Components.p5 f37391s;
    public final org.telegram.ui.Components.p5 v;
    public final ci.a8 f37392w;
    public final org.telegram.ui.Components.f6 f37393x;
    public MessagesController.PeerColor f37394y;

    public gp0(int i10, long j10, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        boolean z10;
        CharSequence userName;
        long botVerificationIcon;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.e = h9Var;
        this.v = new org.telegram.ui.Components.p5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f37392w = new ci.a8(this);
        this.f37393x = new org.telegram.ui.Components.f6(this, 320L, org.telegram.ui.Components.bs.h);
        this.E = new RectF();
        this.f37386b = i10;
        this.f37385a = d6Var;
        long j11 = 0;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37387c = z10;
        dl dlVar = new dl(this, context, 2);
        this.f37388f = dlVar;
        this.f37390r = new org.telegram.ui.Components.p5(AndroidUtilities.dp(17.0f), dlVar);
        this.f37391s = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), dlVar);
        dlVar.setLeftDrawableOutside(true);
        dlVar.setRightDrawableOutside(true);
        dlVar.setTextColor(-1);
        dlVar.setTextSize(20);
        dlVar.setTypeface(AndroidUtilities.bold());
        dlVar.setWidthWrapContent(true);
        addView(dlVar, w7.z5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.h = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTextColor(-2130706433);
        j5Var.setGravity(1);
        addView(j5Var, w7.z5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z10) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                userName = "";
            } else {
                userName = chat.title;
            }
            h9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, h9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            h9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, h9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f37388f.l(userName, false);
        this.f37390r.j(botVerificationIcon, false);
        this.f37388f.setLeftDrawable(this.f37390r);
        this.f37391s.j(j11, false);
        this.f37388f.i(this.f37391s);
        if (this.f37387c) {
            long j12 = -j10;
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j12));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j12);
            if (chatFull != null && chatFull.participants_count > 0) {
                if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    this.h.l(LocaleController.formatPluralStringComma("Subscribers", chatFull.participants_count), false);
                } else {
                    this.h.l(LocaleController.formatPluralStringComma("Members", chatFull.participants_count), false);
                }
            } else if (chat2 != null && chat2.participants_count > 0) {
                if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    this.h.l(LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count), false);
                } else {
                    this.h.l(LocaleController.formatPluralStringComma("Members", chat2.participants_count), false);
                }
            } else {
                boolean isPublic = ChatObject.isPublic(chat2);
                if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = this.h;
                    if (isPublic) {
                        i12 = R.string.ChannelPublic;
                    } else {
                        i12 = R.string.ChannelPrivate;
                    }
                    j5Var2.l(LocaleController.getString(i12).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.j5 j5Var3 = this.h;
                    if (isPublic) {
                        i11 = R.string.MegaPublic;
                    } else {
                        i11 = R.string.MegaPrivate;
                    }
                    j5Var3.l(LocaleController.getString(i11).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(LocaleController.getString(R.string.Online), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        int w02;
        int w03;
        MessagesController.PeerColors peerColors;
        org.telegram.ui.ActionBar.d6 d6Var = this.f37385a;
        if (i10 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            MessagesController.PeerColor peerColor = null;
            if (messagesController != null) {
                peerColors = messagesController.peerColors;
            } else {
                peerColors = null;
            }
            if (peerColors != null) {
                peerColor = peerColors.getColor(i10);
            }
            if (peerColor != null) {
                int color1 = peerColor.getColor1();
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21216p8[org.telegram.ui.Components.h9.f(color1)], d6Var);
                w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21233q8[org.telegram.ui.Components.h9.f(color1)], d6Var);
            } else {
                long j10 = i10;
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21216p8[org.telegram.ui.Components.h9.e(j10)], d6Var);
                w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21233q8[org.telegram.ui.Components.h9.e(j10)], d6Var);
            }
        } else {
            long j11 = i10;
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21216p8[org.telegram.ui.Components.h9.e(j11)], d6Var);
            w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21233q8[org.telegram.ui.Components.h9.e(j11)], d6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f37386b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q6;
        this.f37394y = peerColor;
        org.telegram.ui.ActionBar.d6 d6Var = this.f37385a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        dl dlVar = this.f37388f;
        org.telegram.ui.Components.p5 p5Var = this.f37390r;
        org.telegram.ui.Components.p5 p5Var2 = this.f37391s;
        org.telegram.ui.ActionBar.j5 j5Var = this.h;
        org.telegram.ui.Components.p5 p5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                p5Var3.k(Integer.valueOf(i10));
            } else {
                p5Var3.k(Integer.valueOf(ip0.w0(peerColor.getBgColor1(q6))));
            }
            p5Var2.k(Integer.valueOf(i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.h6.I.q()), -1)));
            p5Var.k(Integer.valueOf(i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.h6.I.q()), -1)));
            int f7 = i0.a.f(0.5f, peerColor.getStoryColor1(q6), peerColor.getStoryColor2(q6));
            int i11 = org.telegram.ui.ActionBar.h6.f21273s8;
            if (!org.telegram.ui.ActionBar.h6.c1(org.telegram.ui.ActionBar.h6.w0(i11, d6Var))) {
                j5Var.setTextColor(f7);
            } else {
                j5Var.setTextColor(org.telegram.ui.ActionBar.h6.C(q6, org.telegram.ui.ActionBar.h6.w0(i11, d6Var), f7, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21068h8, d6Var), f7));
            }
            dlVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.h6.f21273s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i12, d6Var)) > 0.8f) {
                p5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21177n6, d6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i12, d6Var)) < 0.2f) {
                p5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var))));
            } else {
                p5Var3.k(Integer.valueOf(ip0.w0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.h6.f21409zh;
            p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(i13, d6Var)));
            p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(i13, d6Var)));
            j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B8, d6Var));
            dlVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var));
        }
        this.f37392w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j10, boolean z10, boolean z11) {
        boolean q6;
        MessagesController.PeerColor peerColor;
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.p5 p5Var = this.v;
        if (i11 == 0) {
            p5Var.g(null, z11);
        } else {
            p5Var.j(j10, z11);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f37385a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f37394y;
        if (peerColor2 != null) {
            int i12 = peerColor2.patternColor;
            if (i12 != 0) {
                p5Var.k(Integer.valueOf(i12));
            } else {
                p5Var.k(Integer.valueOf(ip0.w0(peerColor2.getBgColor1(q6))));
            }
        } else {
            int i13 = org.telegram.ui.ActionBar.h6.f21273s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i13, d6Var)) > 0.8f) {
                p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21177n6, d6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i13, d6Var)) < 0.2f) {
                p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A8, false))));
            } else {
                p5Var.k(Integer.valueOf(ip0.w0(org.telegram.ui.ActionBar.h6.x0(null, i13, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f37394y;
        org.telegram.ui.Components.p5 p5Var2 = this.f37391s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, d6Var);
            if (this.f37394y.hasColor6(q6)) {
                peerColor = this.f37394y;
                i10 = 4;
            } else {
                peerColor = this.f37394y;
                i10 = 2;
            }
            p5Var2.k(Integer.valueOf(i0.a.f(0.5f, color, peerColor.getColor(i10, d6Var))));
        } else {
            p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21409zh, d6Var)));
        }
        if (!z11) {
            this.f37393x.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        int width = getWidth();
        RectF rectF = this.E;
        rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + width) / 2.0f, getHeight() - AndroidUtilities.dp(82.0f));
        ai.m1.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f37389n) {
            f7 = 18.0f;
        } else {
            f7 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setRoundRadius(dp);
        imageReceiver.setImageCoords(rectF);
        imageReceiver.draw(canvas);
        float width2 = (rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f);
        if (this.f37389n) {
            f10 = 22.0f;
        } else {
            f10 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f37392w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        boolean q6;
        int color3;
        org.telegram.ui.Components.p5 p5Var = this.f37391s;
        p5Var.j(j10, z11);
        p5Var.m(z10, z11);
        org.telegram.ui.ActionBar.d6 d6Var = this.f37385a;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f37394y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q6);
            if (this.f37394y.hasColor6(q6)) {
                color3 = this.f37394y.getColor5(q6);
            } else {
                color3 = this.f37394y.getColor3(q6);
            }
            p5Var.k(Integer.valueOf(i0.a.f(0.5f, color2, color3)));
            return;
        }
        p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21409zh, d6Var)));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.a();
        this.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.b();
        this.d.onDetachedFromWindow();
    }

    public void setForum(boolean z10) {
        if (this.f37389n != z10) {
            invalidate();
        }
        this.f37389n = z10;
    }
}
