package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public class jo extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate {
    public final ImageView E;
    public final j21 F;
    public final org.telegram.ui.eo G;
    public final ww0[] H;
    public final g9 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public ww0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final le.b f24453a;
    public int f24454a0;
    public boolean f24455b;
    public Integer f24456b0;
    public Integer f24457c;
    public final av0 f24458c0;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 f24459d0;
    public final fo e;
    public boolean f24460e0;
    public final boolean f24461f;
    public final n5 f24462f0;
    public final n5 f24463g0;
    public final org.telegram.ui.nl h;
    public final xc f24464h0;
    public final bo f24465i0;
    public boolean f24466j0;
    public boolean f24467k0;
    public boolean f24468l0;
    public boolean m0;
    public final AtomicReference f24469n;
    public boolean f24470n0;
    public String f24471o0;
    public String f24472p0;
    public Drawable f24473q0;
    public final org.telegram.ui.nl f24474r;
    public Drawable f24475r0;
    public final o6 f24476s;
    public Drawable f24477s0;
    public boolean f24478t0;
    public org.telegram.ui.ActionBar.l f24479u0;
    public final AtomicReference v;
    public final ImageView f24480w;
    public final ImageView f24481x;
    public final ImageView f24482y;

    public jo(android.content.Context r22, org.telegram.ui.ActionBar.p2 r23, boolean r24, org.telegram.ui.ActionBar.f6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jo.<init>(android.content.Context, org.telegram.ui.ActionBar.p2, boolean, org.telegram.ui.ActionBar.f6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.eo eoVar = this.G;
        org.telegram.ui.nl nlVar = this.f24474r;
        if (nlVar != null) {
            int i10 = 0;
            ww0[] ww0VarArr = this.H;
            if (z10) {
                try {
                    int intValue = MessagesController.getInstance(this.J).getPrintingStringType(eoVar.a(), eoVar.f32298d4).intValue();
                    ww0 ww0Var = ww0VarArr[intValue];
                    if (ww0Var != null) {
                        org.telegram.ui.ActionBar.f6 f6Var = this.f24459d0;
                        if (intValue == 5) {
                            nlVar.g(ww0Var, "**oo**");
                            ww0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18147pa, f6Var));
                            nlVar.setLeftDrawable((Drawable) null);
                        } else {
                            nlVar.g(null, null);
                            ww0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18147pa, f6Var));
                            nlVar.setLeftDrawable(ww0VarArr[intValue]);
                        }
                        this.N = ww0VarArr[intValue];
                        while (i10 < ww0VarArr.length) {
                            ww0 ww0Var2 = ww0VarArr[i10];
                            if (ww0Var2 != null) {
                                if (i10 == intValue) {
                                    ww0Var2.d();
                                } else {
                                    ww0Var2.e();
                                }
                            }
                            i10++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            this.N = null;
            nlVar.setLeftDrawable((Drawable) null);
            nlVar.g(null, null);
            while (i10 < ww0VarArr.length) {
                ww0 ww0Var3 = ww0VarArr[i10];
                if (ww0Var3 != null) {
                    ww0Var3.e();
                }
                i10++;
            }
        }
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        ImageView imageView;
        int i11;
        if (i10 == 0 && (imageView = this.f24480w) != null) {
            imageView.setAlpha(f7);
            float f11 = 0.85f * f7;
            imageView.setScaleX(f11);
            imageView.setScaleY(f11);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int dp;
        float f7;
        int i10;
        org.telegram.ui.eo eoVar = this.G;
        if (eoVar != null) {
            TLRPC.User i11 = eoVar.i();
            TLRPC.Chat chat = eoVar.e;
            if (eoVar.R3 == 3) {
                long I8 = eoVar.I8();
                if (I8 >= 0) {
                    user = eoVar.getMessagesController().getUser(Long.valueOf(I8));
                    chat = null;
                } else {
                    chat = eoVar.getMessagesController().getChat(Long.valueOf(-I8));
                    user = null;
                }
            } else {
                user = i11;
            }
            int i12 = this.J;
            g9 g9Var = this.I;
            fo foVar = this.e;
            if (user != null) {
                g9Var.m(i12, user);
                if (UserObject.isReplyUser(user)) {
                    g9Var.f23286p = 0.8f;
                    g9Var.g(12);
                    if (foVar != null) {
                        foVar.setAnimatedEmojiDrawable(null);
                        foVar.h(null, null, g9Var, user);
                    }
                } else if (UserObject.isAnonymous(user)) {
                    g9Var.f23286p = 0.8f;
                    g9Var.g(21);
                    if (foVar != null) {
                        foVar.setAnimatedEmojiDrawable(null);
                        foVar.h(null, null, g9Var, user);
                    }
                } else if (UserObject.isUserSelf(user) && eoVar.R3 == 3) {
                    g9Var.f23286p = 0.8f;
                    g9Var.g(22);
                    if (foVar != null) {
                        foVar.setAnimatedEmojiDrawable(null);
                        foVar.h(null, null, g9Var, user);
                    }
                } else if (UserObject.isUserSelf(user)) {
                    g9Var.f23286p = 0.8f;
                    g9Var.g(1);
                    if (foVar != null) {
                        foVar.setAnimatedEmojiDrawable(null);
                        foVar.h(null, null, g9Var, user);
                    }
                } else {
                    g9Var.f23286p = 1.0f;
                    if (foVar != null) {
                        foVar.setAnimatedEmojiDrawable(null);
                        foVar.f28728a.setForUserOrChat(user, g9Var, null, true, 3, false);
                    }
                }
            } else if (ChatObject.isMonoForum(chat)) {
                long d = eoVar.d();
                if (ChatObject.canManageMonoForum(i12, chat) && d != 0) {
                    if (i10 > 0) {
                        TLRPC.User user2 = eoVar.getMessagesController().getUser(Long.valueOf(d));
                        g9Var.r(user2);
                        foVar.setAnimatedEmojiDrawable(null);
                        foVar.e(user2, g9Var);
                    } else {
                        TLRPC.Chat chat2 = eoVar.getMessagesController().getChat(Long.valueOf(-d));
                        g9Var.q(chat2);
                        foVar.setAnimatedEmojiDrawable(null);
                        foVar.e(chat2, g9Var);
                    }
                } else {
                    foVar.setAnimatedEmojiDrawable(null);
                    mg.d.o(i12, chat, g9Var, foVar);
                }
                foVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            } else if (chat != null) {
                g9Var.f23286p = 1.0f;
                g9Var.k(i12, chat);
                if (foVar != null) {
                    foVar.setAnimatedEmojiDrawable(null);
                    foVar.e(chat, g9Var);
                    if (chat.forum) {
                        if (ChatObject.hasStories(chat)) {
                            f7 = 11.0f;
                        } else {
                            f7 = 16.0f;
                        }
                        dp = AndroidUtilities.dp(f7);
                    } else {
                        dp = AndroidUtilities.dp(21.0f);
                    }
                    foVar.setRoundRadius(dp);
                }
            }
        }
    }

    public final n5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        n5 n5Var = this.f24463g0;
        n5Var.j(j3, false);
        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18336zh, this.f24459d0)));
        int dp = AndroidUtilities.dp(1.0f);
        n5Var.I = 0;
        n5Var.J = dp;
        return n5Var;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(this.J).getConnectionState();
            if (this.V != connectionState) {
                this.V = connectionState;
                l();
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.nl nlVar = this.h;
            if (nlVar != null) {
                nlVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i10 == NotificationCenter.savedMessagesDialogsUpdate) {
            n(true);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f24464h0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        if (view == this.e) {
            boolean z11 = false;
            ImageView imageView = this.f24480w;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f24481x;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z11 = true;
            }
            if (z10 || z11) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (z10) {
                    float width = (imageView.getWidth() / 2.0f) + imageView.getX();
                    float height = (imageView.getHeight() / 2.0f) + imageView.getY();
                    canvas.drawCircle(width, height - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.j6.Il);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.j6.Il);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jo.e(boolean, boolean):void");
    }

    public final void g(int i10, boolean z10) {
        j21 j21Var = this.F;
        if (j21Var != null) {
            boolean z11 = this.f24468l0;
            if (i10 == 0 && !this.T) {
                return;
            }
            le.b bVar = this.f24453a;
            if (!z11) {
                bVar.a(true, z10);
                j21Var.b(i10);
                return;
            }
            bVar.a(false, z10);
        }
    }

    public w9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.f24454a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public av0 getSharedMediaPreloader() {
        return this.f24458c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.nl nlVar = this.f24474r;
        if (nlVar != null) {
            return nlVar.getTextPaint();
        }
        return this.f24476s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.nl nlVar = this.f24474r;
        if (nlVar != null) {
            return nlVar;
        }
        o6 o6Var = this.f24476s;
        if (o6Var != null) {
            return o6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f24480w;
    }

    public org.telegram.ui.ActionBar.l5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int dp;
        float f7 = 0.0f;
        org.telegram.ui.nl nlVar = this.h;
        if (nlVar != null) {
            f7 = Math.max(0.0f, nlVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.nl nlVar2 = this.f24474r;
        if (nlVar2 != null) {
            f7 = Math.max(f7, nlVar2.getExactWidthIncludeDrawables());
        }
        fo foVar = this.e;
        if (foVar != null && foVar.getVisibility() == 0) {
            dp = AndroidUtilities.dp(70.0f);
        } else {
            dp = AndroidUtilities.dp(34.0f);
        }
        return (int) (f7 + dp);
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.f24470n0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
                this.f24475r0 = mutate;
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18336zh, this.f24459d0);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
                Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
                this.f24477s0 = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, this.f24459d0), mode));
                this.h.j(new vq(this.f24475r0, this.f24477s0));
                this.m0 = true;
                this.f24472p0 = LocaleController.getString(R.string.AccDescrVerified);
            } else if (this.h.getRightDrawable() instanceof hm0) {
                this.h.j(null);
                this.m0 = false;
                this.f24472p0 = null;
            }
        } else {
            this.f24470n0 = true;
            if (!(this.h.getRightDrawable() instanceof hm0)) {
                hm0 hm0Var = new hm0(!z10 ? 1 : 0);
                hm0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.f24459d0));
                this.h.j(hm0Var);
                this.f24472p0 = LocaleController.getString(R.string.ScamMessage);
                this.m0 = true;
            }
        }
        if (!z13 && DialogObject.getEmojiStatusDocumentId(emojiStatus) == 0) {
            this.h.i(null);
            this.f24471o0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof o5) && (((o5) this.h.getRightDrawable()).f25672a instanceof p5)) {
                ((p5) ((o5) this.h.getRightDrawable()).f25672a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f24462f0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.f24473q0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18336zh, this.f24459d0), PorterDuff.Mode.MULTIPLY));
                this.f24462f0.g(this.f24473q0, z14);
            } else {
                this.f24462f0.g(null, z14);
            }
            this.f24462f0.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18336zh, this.f24459d0)));
            this.h.i(this.f24462f0);
            this.m0 = false;
            this.f24471o0 = LocaleController.getString(R.string.AccDescrPremium);
        }
        org.telegram.ui.ActionBar.l lVar = this.f24479u0;
        if (lVar != null) {
            lVar.d(z14);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.nl nlVar = this.f24474r;
        nlVar.setTextColor(i11);
        nlVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.nl nlVar = this.h;
        nlVar.setLeftDrawable(drawable);
        if (!this.m0 && !this.f24470n0) {
            if (drawable2 != null) {
                this.f24472p0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.f24472p0 = null;
            }
            nlVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.l lVar = this.f24479u0;
        if (lVar != null) {
            lVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        g9 g9Var = this.I;
        g9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        fo foVar = this.e;
        if (isReplyUser) {
            g9Var.g(12);
            g9Var.f23286p = 0.8f;
            if (foVar != null) {
                foVar.h(null, null, g9Var, user);
            }
        } else if (UserObject.isAnonymous(user)) {
            g9Var.g(21);
            g9Var.f23286p = 0.8f;
            if (foVar != null) {
                foVar.h(null, null, g9Var, user);
            }
        } else if (UserObject.isUserSelf(user) && !z10) {
            g9Var.g(1);
            g9Var.f23286p = 0.8f;
            if (foVar != null) {
                foVar.h(null, null, g9Var, user);
            }
        } else {
            g9Var.f23286p = 1.0f;
            if (foVar != null) {
                foVar.e(user, g9Var);
            }
        }
    }

    public final void l() {
        String str;
        int i10 = this.V;
        if (i10 == 2) {
            str = LocaleController.getString(R.string.WaitingForNetwork);
        } else if (i10 == 1) {
            str = LocaleController.getString(R.string.Connecting);
        } else if (i10 == 5) {
            str = LocaleController.getString(R.string.Updating);
        } else if (i10 == 4) {
            str = LocaleController.getString(R.string.ConnectingToProxy);
        } else {
            str = null;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f24459d0;
        o6 o6Var = this.f24476s;
        org.telegram.ui.nl nlVar = this.f24474r;
        if (str == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (nlVar != null) {
                    nlVar.k(charSequence);
                    this.W = null;
                    Integer num = this.f24456b0;
                    if (num != null) {
                        nlVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.f24454a0;
                        if (i11 >= 0) {
                            nlVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                            nlVar.setTag(Integer.valueOf(this.f24454a0));
                        }
                    }
                } else if (o6Var != null) {
                    o6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.f24456b0;
                    if (num2 != null) {
                        o6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.f24454a0;
                        if (i12 >= 0) {
                            o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                            o6Var.setTag(Integer.valueOf(this.f24454a0));
                        }
                    }
                }
            }
        } else if (nlVar != null) {
            if (this.W == null) {
                this.W = nlVar.getText();
            }
            nlVar.k(str);
            Integer num3 = this.f24456b0;
            if (num3 != null) {
                nlVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.B8;
                nlVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                nlVar.setTag(Integer.valueOf(i13));
            }
        } else if (o6Var != null) {
            if (this.W == null) {
                this.W = o6Var.getText();
            }
            o6Var.c(str, !LocaleController.isRTL, true);
            Integer num4 = this.f24456b0;
            if (num4 != null) {
                o6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.B8;
                o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
                o6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.f24479u0;
        if (lVar != null) {
            lVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.eo eoVar = this.G;
        if (eoVar != null) {
            this.U = 0;
            TLRPC.ChatFull chatFull = eoVar.Z7;
            if (chatFull != null) {
                int i10 = this.J;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (z10 && chatFull.participants_count > 200) {
                        this.U = chatFull.online_count;
                        return;
                    }
                    return;
                }
                for (int i11 = 0; i11 < chatFull.participants.participants.size(); i11++) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(chatFull.participants.participants.get(i11).user_id));
                    if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f17342id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
                        this.U++;
                    }
                }
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11;
        int i10;
        boolean[] zArr;
        boolean z12;
        int i11;
        String formatPluralString;
        TLRPC.ChatParticipants chatParticipants;
        int i12;
        String formatShortNumber;
        int i13;
        int i14;
        int i15;
        String formatString;
        String str;
        String string;
        int i16;
        CharSequence charSequence;
        int i17;
        org.telegram.ui.ActionBar.f6 f6Var = this.f24459d0;
        boolean[] zArr2 = this.R;
        o6 o6Var = this.f24476s;
        org.telegram.ui.nl nlVar = this.f24474r;
        org.telegram.ui.nl nlVar2 = this.h;
        int i18 = this.J;
        org.telegram.ui.eo eoVar = this.G;
        if (eoVar != null) {
            if (eoVar.R3 == 6) {
                String str2 = eoVar.P3.link;
                gg.b0[] b0VarArr = gg.b0.e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                setSubtitle(str2);
                return;
            }
            TLRPC.User i19 = eoVar.i();
            TLRPC.Chat chat = eoVar.e;
            if (UserObject.isUserSelf(i19) && eoVar.R3 == 0 && eoVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.f24478t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((UserObject.isUserSelf(i19) && !z11) || UserObject.isReplyUser(i19) || ((i19 != null && i19.f17342id == 489000) || ((i10 = eoVar.R3) != 0 && i10 != 8))) && eoVar.R3 != 3) {
                if (getSubtitleTextView().getVisibility() != 8) {
                    getSubtitleTextView().setVisibility(8);
                    return;
                }
                return;
            }
            if (z11) {
                if (getSubtitleTextView().getVisibility() != 0) {
                    i17 = 0;
                    getSubtitleTextView().setVisibility(0);
                } else {
                    i17 = 0;
                }
                if (!this.f24478t0) {
                    MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i17) + 1).apply();
                    this.f24478t0 = true;
                }
            }
            CharSequence printingString = MessagesController.getInstance(i18).getPrintingString(eoVar.a(), eoVar.f32298d4, false);
            if (printingString == null) {
                UserObject.isBotForum(i19);
            }
            CharSequence charSequence2 = "";
            if (printingString != null) {
                printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z13 = z11;
            if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                if (eoVar.F9() && nlVar2.getTag() != null) {
                    nlVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.Q;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.Q = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(nlVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.Q.addListener(new io(this, 1));
                        this.Q.setDuration(180L);
                        this.Q.start();
                    } else {
                        nlVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer printingStringType = MessagesController.getInstance(i18).getPrintingStringType(eoVar.a(), eoVar.f32298d4);
                if (printingStringType != null && printingStringType.intValue() == 5) {
                    charSequence = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
                } else {
                    charSequence = printingString;
                }
                setTypingAnimation(true);
                z12 = true;
                str = charSequence;
            } else if (eoVar.F9() && !eoVar.f32346h4) {
                if (nlVar2.getTag() == null) {
                    nlVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.Q;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.Q = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(nlVar2, property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.Q.addListener(new io(this, 0));
                        this.Q.setDuration(180L);
                        this.Q.start();
                        return;
                    }
                    nlVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = eoVar.R3;
                if (i20 == 8) {
                    if (eoVar.T3) {
                        charSequence2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    } else if (eoVar.d() == 0) {
                        int topicsCount = eoVar.getMessagesController().getTopicsController().getTopicsCount(-eoVar.a());
                        if (topicsCount > 0) {
                            string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                        } else {
                            string = LocaleController.getString(R.string.ChatMessageSuggestions);
                        }
                        charSequence2 = string;
                    } else {
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f17195id, eoVar.d());
                        if (findTopic != null) {
                            i15 = findTopic.totalMessagesCount;
                        } else {
                            i15 = 0;
                        }
                        if (i15 > 0) {
                            z12 = false;
                            formatString = LocaleController.formatPluralString("messages", i15, Integer.valueOf(i15));
                        } else {
                            z12 = false;
                            formatString = LocaleController.formatString(R.string.TopicProfileStatus, mg.d.i(chat, i18, false));
                        }
                        str = formatString;
                    }
                    z12 = false;
                    str = charSequence2;
                } else {
                    if (i20 == 3) {
                        charSequence2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, eoVar.getMessagesController().getSavedMessagesController().getMessagesCount(eoVar.I8())), new Object[0]);
                    } else {
                        if (eoVar.f32346h4 && chat != null) {
                            TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f17195id, eoVar.d());
                            if (findTopic2 != null) {
                                i13 = 1;
                                i14 = findTopic2.totalMessagesCount - 1;
                            } else {
                                i13 = 1;
                                i14 = 0;
                            }
                            if (i14 > 0) {
                                Object[] objArr = new Object[i13];
                                objArr[0] = Integer.valueOf(i14);
                                formatPluralString = LocaleController.formatPluralString("messages", i14, objArr);
                            } else {
                                int i21 = R.string.TopicProfileStatus;
                                Object[] objArr2 = new Object[i13];
                                objArr2[0] = chat.title;
                                formatPluralString = LocaleController.formatString(i21, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = eoVar.Z7;
                            int i22 = this.U;
                            if (ChatObject.isChannel(chat)) {
                                if (chatFull != null && (i12 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i22 > 1) {
                                            formatPluralString = a4.a.C(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i22, chatFull.participants_count), new Object[0]));
                                        } else {
                                            formatPluralString = LocaleController.formatPluralString("Members", i12, new Object[0]);
                                        }
                                    } else {
                                        int[] iArr = new int[1];
                                        boolean isAccessibilityScreenReaderEnabled = AndroidUtilities.isAccessibilityScreenReaderEnabled();
                                        int i23 = chatFull.participants_count;
                                        if (isAccessibilityScreenReaderEnabled) {
                                            iArr[0] = i23;
                                            formatShortNumber = String.valueOf(i23);
                                        } else {
                                            formatShortNumber = LocaleController.formatShortNumber(i23, iArr);
                                        }
                                        if (chat.megagroup) {
                                            formatPluralString = LocaleController.formatPluralString("Members", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                                        } else {
                                            formatPluralString = LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                                        }
                                    }
                                } else if (chat.megagroup) {
                                    if (chatFull == null) {
                                        formatPluralString = LocaleController.getString(R.string.Loading).toLowerCase();
                                    } else if (chat.has_geo) {
                                        formatPluralString = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                                    } else if (ChatObject.isPublic(chat)) {
                                        formatPluralString = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                    } else {
                                        formatPluralString = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                    }
                                } else if (ChatObject.isPublic(chat)) {
                                    formatPluralString = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                } else {
                                    formatPluralString = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                                }
                            } else if (ChatObject.isKickedFromChat(chat)) {
                                formatPluralString = LocaleController.getString(R.string.YouWereKicked);
                            } else if (ChatObject.isLeftFromChat(chat)) {
                                formatPluralString = LocaleController.getString(R.string.YouLeft);
                            } else {
                                int i24 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i24 = chatParticipants.participants.size();
                                }
                                if (i22 > 1 && i24 != 0) {
                                    formatPluralString = a4.a.C(LocaleController.formatPluralString("Members", i24, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i22, new Object[0]));
                                } else {
                                    formatPluralString = LocaleController.formatPluralString("Members", i24, new Object[0]);
                                }
                            }
                        } else if (i19 != null) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(i19.f17342id));
                            if (user != null) {
                                i19 = user;
                            }
                            if (!UserObject.isReplyUser(i19)) {
                                long j3 = i19.f17342id;
                                if (j3 != 489000) {
                                    if (j3 == UserConfig.getInstance(i18).getClientUserId()) {
                                        charSequence2 = z13 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                    } else {
                                        long j10 = i19.f17342id;
                                        if (j10 != 333000 && j10 != 777000 && j10 != 42777) {
                                            if (MessagesController.isSupportUser(i19)) {
                                                charSequence2 = LocaleController.getString(R.string.SupportStatus);
                                            } else {
                                                boolean z14 = i19.bot;
                                                if (z14 && (i11 = i19.bot_active_users) != 0) {
                                                    charSequence2 = LocaleController.formatPluralStringComma("BotUsers", i11, ',');
                                                } else if (z14) {
                                                    charSequence2 = LocaleController.getString(R.string.Bot);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f24460e0) {
                                                        zArr = this.S;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    String formatUserStatus = LocaleController.formatUserStatus(i18, i19, zArr2, zArr);
                                                    z12 = zArr2[0];
                                                    str = formatUserStatus;
                                                }
                                            }
                                        } else {
                                            charSequence2 = LocaleController.getString(R.string.ServiceNotifications);
                                        }
                                    }
                                }
                            }
                        }
                        charSequence2 = formatPluralString;
                    }
                    z12 = false;
                    str = charSequence2;
                }
            }
            if (z12) {
                i16 = org.telegram.ui.ActionBar.j6.f18147pa;
            } else {
                i16 = org.telegram.ui.ActionBar.j6.B8;
            }
            this.f24454a0 = i16;
            if (this.W == null) {
                if (nlVar != null) {
                    nlVar.k(str);
                    Integer num = this.f24456b0;
                    if (num == null) {
                        nlVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.f24454a0, f6Var));
                        nlVar.setTag(Integer.valueOf(this.f24454a0));
                    } else {
                        nlVar.setTextColor(num.intValue());
                    }
                } else {
                    o6Var.c(str, z10, true);
                    Integer num2 = this.f24456b0;
                    if (num2 == null) {
                        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.f24454a0, f6Var));
                        o6Var.setTag(Integer.valueOf(this.f24454a0));
                    } else {
                        o6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.W = str;
            }
            org.telegram.ui.ActionBar.l lVar = this.f24479u0;
            if (lVar != null) {
                lVar.d(z10);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.eo eoVar = this.G;
        if (eoVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (eoVar.R3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        n5 n5Var = this.f24462f0;
        if (n5Var != null) {
            n5Var.a();
        }
        n5 n5Var2 = this.f24463g0;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.eo eoVar = this.G;
        if (eoVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (eoVar.R3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        n5 n5Var = this.f24462f0;
        if (n5Var != null) {
            n5Var.b();
        }
        n5 n5Var2 = this.f24463g0;
        if (n5Var2 != null) {
            n5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f24471o0 != null) {
            sb2.append(", ");
            sb2.append(this.f24471o0);
        }
        if (this.f24472p0 != null) {
            sb2.append(", ");
            sb2.append(this.f24472p0);
        }
        sb2.append("\n");
        org.telegram.ui.nl nlVar = this.f24474r;
        if (nlVar != null) {
            sb2.append(nlVar.getText());
        } else {
            o6 o6Var = this.f24476s;
            if (o6Var != null) {
                sb2.append(o6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.OpenProfile)));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        fo foVar = this.e;
        int measuredHeight = ((currentActionBarHeight - foVar.getMeasuredHeight()) - 2) / 2;
        if (this.K) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = measuredHeight + i14;
        if (this.f24467k0) {
            f7 = 23.66f;
        } else {
            f7 = 24.0f;
        }
        int dp = AndroidUtilities.dp(f7) + i15;
        int i16 = this.L + 1;
        int i17 = i15 + 1;
        foVar.layout(i16, i17, foVar.getMeasuredWidth() + i16, foVar.getMeasuredHeight() + i17);
        int i18 = this.L;
        if (foVar.getVisibility() == 0) {
            if (this.f24467k0) {
                f10 = 49.66f;
            } else {
                f10 = 55.0f;
            }
        } else if (this.f24467k0) {
            f10 = 13.0f;
        } else {
            f10 = 1.0f;
        }
        int dp2 = i18 + AndroidUtilities.dp(f10) + this.M;
        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.f24469n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.nl nlVar = this.h;
        if (visibility != 8) {
            nlVar.layout(dp2, (AndroidUtilities.dp(1.66f) + i15) - nlVar.getPaddingTop(), nlVar.getMeasuredWidth() + dp2, nlVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (nlVar.getTextHeight() + i15)) - nlVar.getPaddingTop()));
            if (l5Var != null) {
                l5Var.layout(dp2, AndroidUtilities.dp(1.66f) + i15, l5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + l5Var.getTextHeight() + i15);
            }
        } else {
            nlVar.layout(dp2, (AndroidUtilities.dp(11.0f) + i15) - nlVar.getPaddingTop(), nlVar.getMeasuredWidth() + dp2, nlVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (nlVar.getTextHeight() + i15)) - nlVar.getPaddingTop()));
            if (l5Var != null) {
                l5Var.layout(dp2, AndroidUtilities.dp(10.0f) + i15, l5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + l5Var.getTextHeight() + i15);
            }
        }
        ImageView imageView = this.f24481x;
        if (imageView != null) {
            int i19 = this.L;
            imageView.layout(AndroidUtilities.dp(29.0f) + i19, AndroidUtilities.dp(27.33f) + i15, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.L, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + i15);
        }
        ImageView imageView2 = this.f24480w;
        if (imageView2 != null) {
            int i20 = this.L;
            imageView2.layout(AndroidUtilities.dp(19.333f) + i20, i15 - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.L, imageView2.getMeasuredHeight() + (i15 - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.f24482y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        org.telegram.ui.nl nlVar2 = this.f24474r;
        if (nlVar2 != null) {
            nlVar2.layout(dp2, dp, nlVar2.getMeasuredWidth() + dp2, nlVar2.getTextHeight() + dp);
        } else {
            o6 o6Var = this.f24476s;
            if (o6Var != null) {
                o6Var.layout(dp2, dp, o6Var.getMeasuredWidth() + dp2, o6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) this.v.get();
        if (l5Var2 != null) {
            l5Var2.layout(dp2, dp, l5Var2.getMeasuredWidth() + dp2, l5Var2.getTextHeight() + dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        fo foVar = this.e;
        int i13 = 0;
        if (foVar.getVisibility() == 0) {
            i12 = 54;
        } else {
            i12 = 0;
        }
        int dp = size - AndroidUtilities.dp(i12 + 16);
        float f11 = this.d;
        foVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.nl nlVar = this.h;
        nlVar.measure(makeMeasureSpec, makeMeasureSpec2);
        o6 o6Var = this.f24476s;
        org.telegram.ui.nl nlVar2 = this.f24474r;
        if (nlVar2 != null) {
            nlVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (o6Var != null) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f24481x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f24480w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.f24482y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i14 = this.O;
        AtomicReference atomicReference = this.f24469n;
        if (i14 != -1 && i14 != size && i14 > size) {
            this.P = i14;
            View view = (org.telegram.ui.ActionBar.l5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
            atomicReference.set(l5Var);
            int i15 = org.telegram.ui.ActionBar.j6.A8;
            org.telegram.ui.ActionBar.f6 f6Var = this.f24459d0;
            l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
            if (this.f24467k0) {
                f7 = 17.5f;
            } else {
                f7 = 18.0f;
            }
            l5Var.setTextSizePx(AndroidUtilities.dp(f7));
            l5Var.setGravity(3);
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            l5Var.i(nlVar.getRightDrawable());
            l5Var.j(nlVar.getRightDrawable2());
            l5Var.setRightDrawableOutside(nlVar.getRightDrawableOutside());
            l5Var.setLeftDrawable(nlVar.getLeftDrawable());
            l5Var.l(nlVar.getText(), false);
            ViewPropertyAnimator duration = l5Var.animate().alpha(0.0f).setDuration(350L);
            wr wrVar = wr.h;
            duration.setInterpolator(wrVar).withEndAction(new bo(this, 0)).start();
            addView(l5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(getContext());
            atomicReference2.set(l5Var2);
            int i16 = org.telegram.ui.ActionBar.j6.B8;
            l5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var));
            l5Var2.setTag(Integer.valueOf(i16));
            if (this.f24467k0) {
                f10 = 13.5f;
            } else {
                f10 = 14.0f;
            }
            l5Var2.setTextSizePx(AndroidUtilities.dp(f10));
            l5Var2.setGravity(3);
            if (nlVar2 != null) {
                l5Var2.l(nlVar2.getText(), false);
            } else if (o6Var != null) {
                l5Var2.l(o6Var.getText(), false);
            }
            l5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).withEndAction(new bo(this, 1)).start();
            addView(l5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.l5 l5Var3 = (org.telegram.ui.ActionBar.l5) atomicReference.get();
        if (l5Var3 != null) {
            int i17 = this.P;
            if (foVar.getVisibility() == 0) {
                i13 = 54;
            }
            l5Var3.measure(org.telegram.messenger.em.d(i13 + 16, i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.O = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        xc xcVar = this.f24464h0;
        bo boVar = this.f24465i0;
        if (action == 0 && a()) {
            this.f24466j0 = true;
            xcVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(boVar);
            AndroidUtilities.runOnUIThread(boVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f24466j0) {
            xcVar.c(false);
            this.f24466j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(boVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.f24479u0 = lVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f7;
        int i10 = this.J;
        g9 g9Var = this.I;
        g9Var.k(i10, chat);
        fo foVar = this.e;
        if (foVar != null) {
            foVar.e(chat, g9Var);
            if (ChatObject.isForum(chat)) {
                if (ChatObject.hasStories(chat)) {
                    f7 = 11.0f;
                } else {
                    f7 = 16.0f;
                }
            } else {
                f7 = 21.0f;
            }
            foVar.setRoundRadius(AndroidUtilities.dp(f7));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f24481x;
        if (imageView != null) {
            if (z10 && !this.f24461f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setLeftPadding(int i10) {
        this.L = i10;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.K = z10;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.f24456b0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f24464h0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.M = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.f24457c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.nl nlVar = this.f24474r;
            if (nlVar != null) {
                nlVar.k(charSequence);
            } else {
                o6 o6Var = this.f24476s;
                if (o6Var != null) {
                    o6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.l lVar = this.f24479u0;
        if (lVar != null) {
            lVar.d(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    public void f() {
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
