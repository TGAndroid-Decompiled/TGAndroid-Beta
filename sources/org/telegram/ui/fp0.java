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
public class fp0 extends FrameLayout {
    public final RectF B;
    public final org.telegram.ui.ActionBar.f6 f34301a;
    public final int f34302b;
    public final boolean f34303c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.z8 e;
    public final il f34304f;
    public final org.telegram.ui.ActionBar.k5 h;
    public boolean f34305n;
    public final org.telegram.ui.Components.j5 f34306r;
    public final org.telegram.ui.Components.j5 f34307s;
    public final org.telegram.ui.Components.j5 v;
    public final nh.k7 f34308w;
    public final org.telegram.ui.Components.z5 f34309x;
    public MessagesController.PeerColor f34310y;

    public fp0(int i10, long j10, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z4;
        CharSequence userName;
        long botVerificationIcon;
        int i11;
        int i12;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.e = z8Var;
        this.v = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.f34308w = new nh.k7(this);
        this.f34309x = new org.telegram.ui.Components.z5(this, 320L, org.telegram.ui.Components.nr.h);
        this.B = new RectF();
        this.f34302b = i10;
        this.f34301a = f6Var;
        long j11 = 0;
        if (j10 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f34303c = z4;
        il ilVar = new il(this, context, 2);
        this.f34304f = ilVar;
        this.f34306r = new org.telegram.ui.Components.j5(AndroidUtilities.dp(17.0f), ilVar);
        this.f34307s = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), ilVar);
        ilVar.setLeftDrawableOutside(true);
        ilVar.setRightDrawableOutside(true);
        ilVar.setTextColor(-1);
        ilVar.setTextSize(20);
        ilVar.setTypeface(AndroidUtilities.bold());
        ilVar.setWidthWrapContent(true);
        addView(ilVar, k7.b6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.h = k5Var;
        k5Var.setTextSize(14);
        k5Var.setTextColor(-2130706433);
        k5Var.setGravity(1);
        addView(k5Var, k7.b6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
        if (z4) {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                userName = "";
            } else {
                userName = chat.title;
            }
            z8Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, z8Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
            if (chat != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
            }
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            userName = UserObject.getUserName(currentUser);
            z8Var.m(i10, currentUser);
            imageReceiver.setForUserOrChat(currentUser, z8Var);
            botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
            if (currentUser != null) {
                j11 = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
            }
        }
        try {
            userName = Emoji.replaceEmoji(userName, null, false);
        } catch (Exception unused) {
        }
        this.f34304f.l(userName, false);
        this.f34306r.j(botVerificationIcon, false);
        this.f34304f.setLeftDrawable(this.f34306r);
        this.f34307s.j(j11, false);
        this.f34304f.i(this.f34307s);
        if (this.f34303c) {
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
                    org.telegram.ui.ActionBar.k5 k5Var2 = this.h;
                    if (isPublic) {
                        i12 = R.string.ChannelPublic;
                    } else {
                        i12 = R.string.ChannelPrivate;
                    }
                    k5Var2.l(LocaleController.getString(i12).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.k5 k5Var3 = this.h;
                    if (isPublic) {
                        i11 = R.string.MegaPublic;
                    } else {
                        i11 = R.string.MegaPrivate;
                    }
                    k5Var3.l(LocaleController.getString(i11).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(LocaleController.getString(R.string.Online), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        int v02;
        int v03;
        MessagesController.PeerColors peerColors;
        org.telegram.ui.ActionBar.f6 f6Var = this.f34301a;
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
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20123p8[org.telegram.ui.Components.z8.f(color1)], f6Var);
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20142q8[org.telegram.ui.Components.z8.f(color1)], f6Var);
            } else {
                long j10 = i10;
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20123p8[org.telegram.ui.Components.z8.e(j10)], f6Var);
                v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20142q8[org.telegram.ui.Components.z8.e(j10)], f6Var);
            }
        } else {
            long j11 = i10;
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20123p8[org.telegram.ui.Components.z8.e(j11)], f6Var);
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20142q8[org.telegram.ui.Components.z8.e(j11)], f6Var);
        }
        this.e.i(v02, v03);
        invalidate();
    }

    public void b(int i10, boolean z4) {
        MessagesController.PeerColor color;
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f34302b).profilePeerColors;
        if (peerColors == null) {
            color = null;
        } else {
            color = peerColors.getColor(i10);
        }
        c(color, z4);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z4) {
        boolean q10;
        this.f34310y = peerColor;
        org.telegram.ui.ActionBar.f6 f6Var = this.f34301a;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        il ilVar = this.f34304f;
        org.telegram.ui.Components.j5 j5Var = this.f34306r;
        org.telegram.ui.Components.j5 j5Var2 = this.f34307s;
        org.telegram.ui.ActionBar.k5 k5Var = this.h;
        org.telegram.ui.Components.j5 j5Var3 = this.v;
        if (peerColor != null) {
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                j5Var3.k(Integer.valueOf(i10));
            } else {
                j5Var3.k(Integer.valueOf(gp0.u0(peerColor.getBgColor1(q10))));
            }
            j5Var2.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), -1)));
            j5Var.k(Integer.valueOf(i0.a.d(0.25f, peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), -1)));
            int d = i0.a.d(0.5f, peerColor.getStoryColor1(q10), peerColor.getStoryColor2(q10));
            int i11 = org.telegram.ui.ActionBar.j6.f20176s8;
            if (!org.telegram.ui.ActionBar.j6.b1(org.telegram.ui.ActionBar.j6.v0(i11, f6Var))) {
                k5Var.setTextColor(d);
            } else {
                k5Var.setTextColor(org.telegram.ui.ActionBar.j6.C(q10, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), d, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19980h8, f6Var), d));
            }
            ilVar.setTextColor(-1);
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.f20176s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) > 0.8f) {
                j5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20085n6, f6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) < 0.2f) {
                j5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var))));
            } else {
                j5Var3.k(Integer.valueOf(gp0.u0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var))));
            }
            int i13 = org.telegram.ui.ActionBar.j6.zh;
            j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, f6Var));
            ilVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
        }
        this.f34308w.c(peerColor, z4);
        invalidate();
    }

    public final void d(long j10, boolean z4, boolean z10) {
        boolean q10;
        MessagesController.PeerColor peerColor;
        int i10;
        org.telegram.ui.Components.j5 j5Var = this.v;
        if (j10 == 0) {
            j5Var.g(null, z10);
        } else {
            j5Var.j(j10, z10);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f34301a;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        MessagesController.PeerColor peerColor2 = this.f34310y;
        if (peerColor2 != null) {
            int i11 = peerColor2.patternColor;
            if (i11 != 0) {
                j5Var.k(Integer.valueOf(i11));
            } else {
                j5Var.k(Integer.valueOf(gp0.u0(peerColor2.getBgColor1(q10))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.f20176s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) > 0.8f) {
                j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20085n6, f6Var)));
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i12, f6Var)) < 0.2f) {
                j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A8, false))));
            } else {
                j5Var.k(Integer.valueOf(gp0.u0(org.telegram.ui.ActionBar.j6.w0(null, i12, false))));
            }
        }
        MessagesController.PeerColor peerColor3 = this.f34310y;
        org.telegram.ui.Components.j5 j5Var2 = this.f34307s;
        if (peerColor3 != null) {
            int color = peerColor3.getColor(1, f6Var);
            if (this.f34310y.hasColor6(q10)) {
                peerColor = this.f34310y;
                i10 = 4;
            } else {
                peerColor = this.f34310y;
                i10 = 2;
            }
            j5Var2.k(Integer.valueOf(i0.a.d(0.5f, color, peerColor.getColor(i10, f6Var))));
        } else {
            j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
        }
        if (!z10) {
            this.f34309x.a(z4);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int width = getWidth();
        RectF rectF = this.B;
        rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + width) / 2.0f, getHeight() - AndroidUtilities.dp(82.0f));
        lh.x0.c(canvas, this.v, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f34305n) {
            f10 = 18.0f;
        } else {
            f10 = 54.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setRoundRadius(dp);
        imageReceiver.setImageCoords(rectF);
        imageReceiver.draw(canvas);
        float width2 = (rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f);
        if (this.f34305n) {
            f11 = 22.0f;
        } else {
            f11 = 58.0f;
        }
        float dp2 = AndroidUtilities.dp(f11);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, dp2, dp2, this.f34308w.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z4, boolean z10) {
        boolean q10;
        int color3;
        org.telegram.ui.Components.j5 j5Var = this.f34307s;
        j5Var.j(j10, z10);
        j5Var.m(z4, z10);
        org.telegram.ui.ActionBar.f6 f6Var = this.f34301a;
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        MessagesController.PeerColor peerColor = this.f34310y;
        if (peerColor != null) {
            int color2 = peerColor.getColor2(q10);
            if (this.f34310y.hasColor6(q10)) {
                color3 = this.f34310y.getColor5(q10);
            } else {
                color3 = this.f34310y.getColor3(q10);
            }
            j5Var.k(Integer.valueOf(i0.a.d(0.5f, color2, color3)));
            return;
        }
        j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
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

    public void setForum(boolean z4) {
        if (this.f34305n != z4) {
            invalidate();
        }
        this.f34305n = z4;
    }
}
