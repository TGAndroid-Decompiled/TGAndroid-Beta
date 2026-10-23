package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public class jp0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final RectF F;
    public final org.telegram.ui.ActionBar.g6 f38613a;
    public final int f38614b;
    public final boolean f38615c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.h9 e;
    public final el f38616f;
    public final org.telegram.ui.ActionBar.n5 h;
    public boolean f38617n;
    public final org.telegram.ui.Components.p5 f38618r;
    public final org.telegram.ui.Components.p5 f38619s;
    public final org.telegram.ui.Components.p5 v;
    public final ci.z7 f38620w;
    public final org.telegram.ui.Components.f6 f38621x;
    public MessagesController.PeerColor f38622y;

    public jp0(int i10, long j10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        boolean z10;
        CharSequence userName;
        long botVerificationIcon;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        this.e = h9Var;
        this.v = new org.telegram.ui.Components.p5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f38620w = new ci.z7(this);
        this.f38621x = new org.telegram.ui.Components.f6(this, 320L, org.telegram.ui.Components.bs.h);
        this.F = new RectF();
        this.f38614b = i10;
        this.f38613a = g6Var;
        long j11 = 0;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38615c = z10;
        el elVar = new el(this, context, 2);
        this.f38616f = elVar;
        this.f38618r = new org.telegram.ui.Components.p5(AndroidUtilities.dp(17.0f), elVar);
        this.f38619s = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), elVar);
        elVar.setLeftDrawableOutside(true);
        elVar.setRightDrawableOutside(true);
        elVar.setTextColor(-1);
        elVar.setTextSize(20);
        elVar.setTypeface(AndroidUtilities.bold());
        elVar.setWidthWrapContent(true);
        addView(elVar, w7.z5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.h = n5Var;
        n5Var.setTextSize(14);
        n5Var.setTextColor(-2130706433);
        n5Var.setGravity(1);
        addView(n5Var, w7.z5.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
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
        this.f38616f.l(userName, false);
        this.f38618r.j(botVerificationIcon, false);
        this.f38616f.setLeftDrawable(this.f38618r);
        this.f38619s.j(j11, false);
        this.f38616f.i(this.f38619s);
        if (this.f38615c) {
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
                    org.telegram.ui.ActionBar.n5 n5Var2 = this.h;
                    if (isPublic) {
                        i12 = R.string.ChannelPublic;
                    } else {
                        i12 = R.string.ChannelPrivate;
                    }
                    n5Var2.l(LocaleController.getString(i12).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.n5 n5Var3 = this.h;
                    if (isPublic) {
                        i11 = R.string.MegaPublic;
                    } else {
                        i11 = R.string.MegaPrivate;
                    }
                    n5Var3.l(LocaleController.getString(i11).toLowerCase(), false);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f38613a;
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
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21405p8[org.telegram.ui.Components.h9.f(color1)], g6Var);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21422q8[org.telegram.ui.Components.h9.f(color1)], g6Var);
            } else {
                long j10 = i10;
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21405p8[org.telegram.ui.Components.h9.e(j10)], g6Var);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21422q8[org.telegram.ui.Components.h9.e(j10)], g6Var);
            }
        } else {
            long j11 = i10;
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21405p8[org.telegram.ui.Components.h9.e(j11)], g6Var);
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21422q8[org.telegram.ui.Components.h9.e(j11)], g6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21366n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21598zh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21257h8));
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f38614b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q6;
        this.f38622y = peerColor;
        org.telegram.ui.ActionBar.g6 g6Var = this.f38613a;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        el elVar = this.f38616f;
        org.telegram.ui.Components.p5 p5Var = this.f38618r;
        org.telegram.ui.Components.p5 p5Var2 = this.f38619s;
        org.telegram.ui.ActionBar.n5 n5Var = this.h;
        org.telegram.ui.Components.p5 p5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                p5Var3.k(Integer.valueOf(i10));
            } else {
                p5Var3.k(Integer.valueOf(lp0.w0(peerColor.getBgColor1(q6))));
            }
            p5Var2.k(Integer.valueOf(i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1)));
            p5Var.k(Integer.valueOf(i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1)));
            int f7 = i0.a.f(0.5f, peerColor.getStoryColor1(q6), peerColor.getStoryColor2(q6));
            int i11 = org.telegram.ui.ActionBar.k6.f21462s8;
            if (!org.telegram.ui.ActionBar.k6.d1(org.telegram.ui.ActionBar.k6.w0(i11, g6Var))) {
                n5Var.setTextColor(f7);
            } else {
                n5Var.setTextColor(org.telegram.ui.ActionBar.k6.C(q6, org.telegram.ui.ActionBar.k6.w0(i11, g6Var), f7, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21257h8, g6Var), f7));
            }
            elVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.k6.f21462s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i12, g6Var)) > 0.8f) {
                p5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21366n6, g6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i12, g6Var)) < 0.2f) {
                p5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var))));
            } else {
                p5Var3.k(Integer.valueOf(lp0.w0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.k6.f21598zh;
            p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)));
            p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)));
            n5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
            elVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
        }
        this.E = 0;
        this.f38620w.c(peerColor, z10);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f38613a;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f38622y;
        if (peerColor2 != null) {
            int i12 = peerColor2.patternColor;
            if (i12 != 0) {
                p5Var.k(Integer.valueOf(i12));
            } else {
                p5Var.k(Integer.valueOf(lp0.w0(peerColor2.getBgColor1(q6))));
            }
        } else {
            int i13 = org.telegram.ui.ActionBar.k6.f21462s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)) > 0.8f) {
                p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21366n6, g6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)) < 0.2f) {
                p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.A8, false))));
            } else {
                p5Var.k(Integer.valueOf(lp0.w0(org.telegram.ui.ActionBar.k6.x0(null, i13, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f38622y;
        org.telegram.ui.Components.p5 p5Var2 = this.f38619s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, g6Var);
            if (this.f38622y.hasColor6(q6)) {
                peerColor = this.f38622y;
                i10 = 4;
            } else {
                peerColor = this.f38622y;
                i10 = 2;
            }
            p5Var2.k(Integer.valueOf(i0.a.f(0.5f, color, peerColor.getColor(i10, g6Var))));
        } else {
            p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, g6Var)));
        }
        this.E = 1;
        if (!z11) {
            this.f38621x.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        int width = getWidth();
        RectF rectF = this.F;
        rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + width) / 2.0f, getHeight() - AndroidUtilities.dp(82.0f));
        ai.m1.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f38617n) {
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
        if (this.f38617n) {
            f10 = 22.0f;
        } else {
            f10 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f38620w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        boolean q6;
        int color3;
        org.telegram.ui.Components.p5 p5Var = this.f38619s;
        p5Var.j(j10, z11);
        p5Var.m(z10, z11);
        org.telegram.ui.ActionBar.g6 g6Var = this.f38613a;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f38622y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q6);
            if (this.f38622y.hasColor6(q6)) {
                color3 = this.f38622y.getColor5(q6);
            } else {
                color3 = this.f38622y.getColor3(q6);
            }
            p5Var.k(Integer.valueOf(i0.a.f(0.5f, color2, color3)));
        } else {
            p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, g6Var)));
        }
        this.E = 2;
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
        if (this.f38617n != z10) {
            invalidate();
        }
        this.f38617n = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.p5 p5Var;
        org.telegram.ui.Components.p5 p5Var2;
        el elVar;
        org.telegram.ui.ActionBar.n5 n5Var;
        boolean q6;
        int color3;
        int color;
        org.telegram.ui.Components.p5 p5Var3 = this.v;
        if (p5Var3 != null && (p5Var = this.f38619s) != null && (p5Var2 = this.f38618r) != null && (elVar = this.f38616f) != null && (n5Var = this.h) != null) {
            org.telegram.ui.ActionBar.g6 g6Var = this.f38613a;
            try {
                if (g6Var != null) {
                    q6 = g6Var.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.k6.I.q();
                }
                MessagesController.PeerColor peerColor = this.f38622y;
                if (peerColor != null) {
                    int i10 = peerColor.patternColor;
                    if (i10 != 0) {
                        p5Var3.k(Integer.valueOf(i10));
                    } else {
                        p5Var3.k(Integer.valueOf(lp0.w0(peerColor.getBgColor1(q6))));
                    }
                    p5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.f38622y.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1)));
                    int i11 = this.E;
                    if (i11 == 1) {
                        int color2 = this.f38622y.getColor(1, g6Var);
                        if (this.f38622y.hasColor6(q6)) {
                            color = this.f38622y.getColor(4, g6Var);
                        } else {
                            color = this.f38622y.getColor(2, g6Var);
                        }
                        p5Var.k(Integer.valueOf(i0.a.f(0.5f, color2, color)));
                    } else if (i11 == 2) {
                        int color22 = this.f38622y.getColor2(q6);
                        if (this.f38622y.hasColor6(q6)) {
                            color3 = this.f38622y.getColor5(q6);
                        } else {
                            color3 = this.f38622y.getColor3(q6);
                        }
                        p5Var.k(Integer.valueOf(i0.a.f(0.5f, color22, color3)));
                    } else {
                        p5Var.k(Integer.valueOf(i0.a.f(0.25f, this.f38622y.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1)));
                    }
                    int f7 = i0.a.f(0.5f, this.f38622y.getStoryColor1(q6), this.f38622y.getStoryColor2(q6));
                    int i12 = org.telegram.ui.ActionBar.k6.f21462s8;
                    if (!org.telegram.ui.ActionBar.k6.d1(org.telegram.ui.ActionBar.k6.w0(i12, g6Var))) {
                        n5Var.setTextColor(f7);
                    } else {
                        n5Var.setTextColor(org.telegram.ui.ActionBar.k6.C(q6, org.telegram.ui.ActionBar.k6.w0(i12, g6Var), f7, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21257h8, g6Var), f7));
                    }
                    elVar.setTextColor(-1);
                } else {
                    int i13 = org.telegram.ui.ActionBar.k6.f21462s8;
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)) > 0.8f) {
                        p5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21366n6, g6Var)));
                    } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)) < 0.2f) {
                        p5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var))));
                    } else {
                        p5Var3.k(Integer.valueOf(lp0.w0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var))));
                    }
                    int i14 = org.telegram.ui.ActionBar.k6.f21598zh;
                    p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i14, g6Var)));
                    p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i14, g6Var)));
                    n5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
                    elVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
                }
                invalidate();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
