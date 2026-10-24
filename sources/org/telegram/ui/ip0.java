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
public class ip0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final RectF F;
    public final org.telegram.ui.ActionBar.g6 f38353a;
    public final int f38354b;
    public final boolean f38355c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.f9 e;
    public final el f38356f;
    public final org.telegram.ui.ActionBar.n5 h;
    public boolean f38357n;
    public final org.telegram.ui.Components.n5 f38358r;
    public final org.telegram.ui.Components.n5 f38359s;
    public final org.telegram.ui.Components.n5 v;
    public final ci.z7 f38360w;
    public final org.telegram.ui.Components.d6 f38361x;
    public MessagesController.PeerColor f38362y;

    public ip0(int i10, long j10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        boolean z10;
        CharSequence userName;
        long botVerificationIcon;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        this.e = f9Var;
        this.v = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f38360w = new ci.z7(this);
        this.f38361x = new org.telegram.ui.Components.d6(this, 320L, org.telegram.ui.Components.zr.h);
        this.F = new RectF();
        this.f38354b = i10;
        this.f38353a = g6Var;
        long j11 = 0;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38355c = z10;
        el elVar = new el(this, context, 2);
        this.f38356f = elVar;
        this.f38358r = new org.telegram.ui.Components.n5(AndroidUtilities.dp(17.0f), elVar);
        this.f38359s = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), elVar);
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
            f9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, f9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            f9Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, f9Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f38356f.l(userName, false);
        this.f38358r.j(botVerificationIcon, false);
        this.f38356f.setLeftDrawable(this.f38358r);
        this.f38359s.j(j11, false);
        this.f38356f.i(this.f38359s);
        if (this.f38355c) {
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f38353a;
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
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21406p8[org.telegram.ui.Components.f9.f(color1)], g6Var);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21423q8[org.telegram.ui.Components.f9.f(color1)], g6Var);
            } else {
                long j10 = i10;
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21406p8[org.telegram.ui.Components.f9.e(j10)], g6Var);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21423q8[org.telegram.ui.Components.f9.e(j10)], g6Var);
            }
        } else {
            long j11 = i10;
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21406p8[org.telegram.ui.Components.f9.e(j11)], g6Var);
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21423q8[org.telegram.ui.Components.f9.e(j11)], g6Var);
        }
        this.e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21367n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21599zh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21258h8));
    }

    public void b(int i10, boolean z10) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f38354b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        c(color, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q6;
        this.f38362y = peerColor;
        org.telegram.ui.ActionBar.g6 g6Var = this.f38353a;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        el elVar = this.f38356f;
        org.telegram.ui.Components.n5 n5Var = this.f38358r;
        org.telegram.ui.Components.n5 n5Var2 = this.f38359s;
        org.telegram.ui.ActionBar.n5 n5Var3 = this.h;
        org.telegram.ui.Components.n5 n5Var4 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                n5Var4.k(Integer.valueOf(i10));
            } else {
                n5Var4.k(Integer.valueOf(kp0.w0(peerColor.getBgColor1(q6))));
            }
            n5Var2.k(Integer.valueOf(i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1)));
            n5Var.k(Integer.valueOf(i0.a.f(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1)));
            int f7 = i0.a.f(0.5f, peerColor.getStoryColor1(q6), peerColor.getStoryColor2(q6));
            int i11 = org.telegram.ui.ActionBar.k6.f21463s8;
            if (!org.telegram.ui.ActionBar.k6.d1(org.telegram.ui.ActionBar.k6.w0(i11, g6Var))) {
                n5Var3.setTextColor(f7);
            } else {
                n5Var3.setTextColor(org.telegram.ui.ActionBar.k6.C(q6, org.telegram.ui.ActionBar.k6.w0(i11, g6Var), f7, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21258h8, g6Var), f7));
            }
            elVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.k6.f21463s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i12, g6Var)) > 0.8f) {
                n5Var4.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21367n6, g6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i12, g6Var)) < 0.2f) {
                n5Var4.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var))));
            } else {
                n5Var4.k(Integer.valueOf(kp0.w0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.k6.f21599zh;
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)));
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)));
            n5Var3.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
            elVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
        }
        this.E = 0;
        this.f38360w.c(peerColor, z10);
        invalidate();
    }

    public final void d(long j10, boolean z10, boolean z11) {
        boolean q6;
        MessagesController.PeerColor peerColor;
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.n5 n5Var = this.v;
        if (i11 == 0) {
            n5Var.g(null, z11);
        } else {
            n5Var.j(j10, z11);
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f38353a;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f38362y;
        if (peerColor2 != null) {
            int i12 = peerColor2.patternColor;
            if (i12 != 0) {
                n5Var.k(Integer.valueOf(i12));
            } else {
                n5Var.k(Integer.valueOf(kp0.w0(peerColor2.getBgColor1(q6))));
            }
        } else {
            int i13 = org.telegram.ui.ActionBar.k6.f21463s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)) > 0.8f) {
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21367n6, g6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)) < 0.2f) {
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.A8, false))));
            } else {
                n5Var.k(Integer.valueOf(kp0.w0(org.telegram.ui.ActionBar.k6.x0(null, i13, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f38362y;
        org.telegram.ui.Components.n5 n5Var2 = this.f38359s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, g6Var);
            if (this.f38362y.hasColor6(q6)) {
                peerColor = this.f38362y;
                i10 = 4;
            } else {
                peerColor = this.f38362y;
                i10 = 2;
            }
            n5Var2.k(Integer.valueOf(i0.a.f(0.5f, color, peerColor.getColor(i10, g6Var))));
        } else {
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21599zh, g6Var)));
        }
        this.E = 1;
        if (!z11) {
            this.f38361x.a(z10);
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
        if (this.f38357n) {
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
        if (this.f38357n) {
            f10 = 22.0f;
        } else {
            f10 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f10);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f38360w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        boolean q6;
        int color3;
        org.telegram.ui.Components.n5 n5Var = this.f38359s;
        n5Var.j(j10, z11);
        n5Var.m(z10, z11);
        org.telegram.ui.ActionBar.g6 g6Var = this.f38353a;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f38362y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q6);
            if (this.f38362y.hasColor6(q6)) {
                color3 = this.f38362y.getColor5(q6);
            } else {
                color3 = this.f38362y.getColor3(q6);
            }
            n5Var.k(Integer.valueOf(i0.a.f(0.5f, color2, color3)));
        } else {
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21599zh, g6Var)));
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
        if (this.f38357n != z10) {
            invalidate();
        }
        this.f38357n = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.n5 n5Var;
        org.telegram.ui.Components.n5 n5Var2;
        el elVar;
        org.telegram.ui.ActionBar.n5 n5Var3;
        boolean q6;
        int color3;
        int color;
        org.telegram.ui.Components.n5 n5Var4 = this.v;
        if (n5Var4 != null && (n5Var = this.f38359s) != null && (n5Var2 = this.f38358r) != null && (elVar = this.f38356f) != null && (n5Var3 = this.h) != null) {
            org.telegram.ui.ActionBar.g6 g6Var = this.f38353a;
            try {
                if (g6Var != null) {
                    q6 = g6Var.a();
                } else {
                    q6 = org.telegram.ui.ActionBar.k6.I.q();
                }
                MessagesController.PeerColor peerColor = this.f38362y;
                if (peerColor != null) {
                    int i10 = peerColor.patternColor;
                    if (i10 != 0) {
                        n5Var4.k(Integer.valueOf(i10));
                    } else {
                        n5Var4.k(Integer.valueOf(kp0.w0(peerColor.getBgColor1(q6))));
                    }
                    n5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.f38362y.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1)));
                    int i11 = this.E;
                    if (i11 == 1) {
                        int color2 = this.f38362y.getColor(1, g6Var);
                        if (this.f38362y.hasColor6(q6)) {
                            color = this.f38362y.getColor(4, g6Var);
                        } else {
                            color = this.f38362y.getColor(2, g6Var);
                        }
                        n5Var.k(Integer.valueOf(i0.a.f(0.5f, color2, color)));
                    } else if (i11 == 2) {
                        int color22 = this.f38362y.getColor2(q6);
                        if (this.f38362y.hasColor6(q6)) {
                            color3 = this.f38362y.getColor5(q6);
                        } else {
                            color3 = this.f38362y.getColor3(q6);
                        }
                        n5Var.k(Integer.valueOf(i0.a.f(0.5f, color22, color3)));
                    } else {
                        n5Var.k(Integer.valueOf(i0.a.f(0.25f, this.f38362y.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), -1)));
                    }
                    int f7 = i0.a.f(0.5f, this.f38362y.getStoryColor1(q6), this.f38362y.getStoryColor2(q6));
                    int i12 = org.telegram.ui.ActionBar.k6.f21463s8;
                    if (!org.telegram.ui.ActionBar.k6.d1(org.telegram.ui.ActionBar.k6.w0(i12, g6Var))) {
                        n5Var3.setTextColor(f7);
                    } else {
                        n5Var3.setTextColor(org.telegram.ui.ActionBar.k6.C(q6, org.telegram.ui.ActionBar.k6.w0(i12, g6Var), f7, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21258h8, g6Var), f7));
                    }
                    elVar.setTextColor(-1);
                } else {
                    int i13 = org.telegram.ui.ActionBar.k6.f21463s8;
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)) > 0.8f) {
                        n5Var4.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21367n6, g6Var)));
                    } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i13, g6Var)) < 0.2f) {
                        n5Var4.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var))));
                    } else {
                        n5Var4.k(Integer.valueOf(kp0.w0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var))));
                    }
                    int i14 = org.telegram.ui.ActionBar.k6.f21599zh;
                    n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i14, g6Var)));
                    n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i14, g6Var)));
                    n5Var3.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
                    elVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
                }
                invalidate();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
