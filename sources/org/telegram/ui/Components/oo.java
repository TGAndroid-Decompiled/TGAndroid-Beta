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
import java.util.HashSet;
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
public class oo extends FrameLayout implements ne.d, NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public final ImageView E;
    public final w21 F;
    public final org.telegram.ui.sn G;
    public final kx0[] H;
    public final h9 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public kx0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final ne.b f29248a;
    public int f29249a0;
    public boolean f29250b;
    public Integer f29251b0;
    public Integer f29252c;
    public final pv0 f29253c0;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 f29254d0;
    public final ko e;
    public boolean f29255e0;
    public final boolean f29256f;
    public final p5 f29257f0;
    public final p5 f29258g0;
    public final org.telegram.ui.el h;
    public final yc f29259h0;
    public final ho f29260i0;
    public boolean f29261j0;
    public boolean f29262k0;
    public boolean f29263l0;
    public boolean m0;
    public final AtomicReference f29264n;
    public boolean f29265n0;
    public String f29266o0;
    public String f29267p0;
    public Drawable f29268q0;
    public final org.telegram.ui.el f29269r;
    public Drawable f29270r0;
    public final q6 f29271s;
    public Drawable f29272s0;
    public boolean f29273t0;
    public PorterDuffColorFilter f29274u0;
    public final AtomicReference v;
    public PorterDuffColorFilter f29275v0;
    public final ImageView f29276w;
    public int f29277w0;
    public final ImageView f29278x;
    public int f29279x0;
    public final ImageView f29280y;
    public org.telegram.ui.ActionBar.k f29281y0;

    public oo(android.content.Context r22, org.telegram.ui.ActionBar.o2 r23, boolean r24, org.telegram.ui.ActionBar.g6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oo.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, boolean, org.telegram.ui.ActionBar.g6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.sn snVar = this.G;
        org.telegram.ui.el elVar = this.f29269r;
        if (elVar != null) {
            int i10 = 0;
            kx0[] kx0VarArr = this.H;
            if (z10) {
                try {
                    int intValue = MessagesController.getInstance(this.J).getPrintingStringType(snVar.a(), snVar.f41638p4).intValue();
                    kx0 kx0Var = kx0VarArr[intValue];
                    if (kx0Var != null) {
                        org.telegram.ui.ActionBar.g6 g6Var = this.f29254d0;
                        if (intValue == 5) {
                            elVar.g(kx0Var, "**oo**");
                            kx0VarArr[intValue].b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21406pa, g6Var));
                            elVar.setLeftDrawable((Drawable) null);
                        } else {
                            elVar.g(null, null);
                            kx0VarArr[intValue].b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21406pa, g6Var));
                            elVar.setLeftDrawable(kx0VarArr[intValue]);
                        }
                        this.N = kx0VarArr[intValue];
                        while (i10 < kx0VarArr.length) {
                            kx0 kx0Var2 = kx0VarArr[i10];
                            if (kx0Var2 != null) {
                                if (i10 == intValue) {
                                    kx0Var2.d();
                                } else {
                                    kx0Var2.e();
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
            elVar.setLeftDrawable((Drawable) null);
            elVar.g(null, null);
            while (i10 < kx0VarArr.length) {
                kx0 kx0Var3 = kx0VarArr[i10];
                if (kx0Var3 != null) {
                    kx0Var3.e();
                }
                i10++;
            }
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
        org.telegram.ui.sn snVar = this.G;
        if (snVar != null) {
            TLRPC.User i11 = snVar.i();
            TLRPC.Chat chat = snVar.e;
            if (snVar.f41492d4 == 3) {
                long N8 = snVar.N8();
                if (N8 >= 0) {
                    user = snVar.getMessagesController().getUser(Long.valueOf(N8));
                    chat = null;
                } else {
                    chat = snVar.getMessagesController().getChat(Long.valueOf(-N8));
                    user = null;
                }
            } else {
                user = i11;
            }
            int i12 = this.J;
            h9 h9Var = this.I;
            ko koVar = this.e;
            if (user != null) {
                h9Var.m(i12, user);
                if (UserObject.isReplyUser(user)) {
                    h9Var.f26849p = 0.8f;
                    h9Var.g(12);
                    if (koVar != null) {
                        koVar.setAnimatedEmojiDrawable(null);
                        koVar.h(null, null, h9Var, user);
                    }
                } else if (UserObject.isAnonymous(user)) {
                    h9Var.f26849p = 0.8f;
                    h9Var.g(21);
                    if (koVar != null) {
                        koVar.setAnimatedEmojiDrawable(null);
                        koVar.h(null, null, h9Var, user);
                    }
                } else if (UserObject.isUserSelf(user) && snVar.f41492d4 == 3) {
                    h9Var.f26849p = 0.8f;
                    h9Var.g(22);
                    if (koVar != null) {
                        koVar.setAnimatedEmojiDrawable(null);
                        koVar.h(null, null, h9Var, user);
                    }
                } else if (UserObject.isUserSelf(user)) {
                    h9Var.f26849p = 0.8f;
                    h9Var.g(1);
                    if (koVar != null) {
                        koVar.setAnimatedEmojiDrawable(null);
                        koVar.h(null, null, h9Var, user);
                    }
                } else {
                    h9Var.f26849p = 1.0f;
                    if (koVar != null) {
                        koVar.setAnimatedEmojiDrawable(null);
                        koVar.f32195a.setForUserOrChat(user, h9Var, null, true, 3, false);
                    }
                }
            } else if (ChatObject.isMonoForum(chat)) {
                long d = snVar.d();
                if (ChatObject.canManageMonoForum(i12, chat) && d != 0) {
                    if (i10 > 0) {
                        TLRPC.User user2 = snVar.getMessagesController().getUser(Long.valueOf(d));
                        h9Var.r(user2);
                        koVar.setAnimatedEmojiDrawable(null);
                        koVar.e(user2, h9Var);
                    } else {
                        TLRPC.Chat chat2 = snVar.getMessagesController().getChat(Long.valueOf(-d));
                        h9Var.q(chat2);
                        koVar.setAnimatedEmojiDrawable(null);
                        koVar.e(chat2, h9Var);
                    }
                } else {
                    koVar.setAnimatedEmojiDrawable(null);
                    og.d.o(i12, chat, h9Var, koVar);
                }
                koVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            } else if (chat != null) {
                h9Var.f26849p = 1.0f;
                h9Var.k(i12, chat);
                if (koVar != null) {
                    koVar.setAnimatedEmojiDrawable(null);
                    koVar.e(chat, h9Var);
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
                    koVar.setRoundRadius(dp);
                }
            }
        }
    }

    public final p5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        p5 p5Var = this.f29258g0;
        p5Var.j(j10, false);
        p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, this.f29254d0)));
        int dp = AndroidUtilities.dp(1.0f);
        p5Var.I = 0;
        p5Var.J = dp;
        return p5Var;
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
            org.telegram.ui.el elVar = this.h;
            if (elVar != null) {
                elVar.invalidate();
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
        float a2 = this.f29259h0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (view == this.e) {
            boolean z11 = false;
            ImageView imageView = this.f29276w;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f29278x;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z11 = true;
            }
            if (z10 || z11) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (z10) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.k6.Ml);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.k6.Ml);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oo.e(boolean, boolean):void");
    }

    public final void g(int i10, boolean z10) {
        w21 w21Var = this.F;
        if (w21Var != null) {
            boolean z11 = this.f29263l0;
            if (i10 == 0 && !this.T) {
                return;
            }
            ne.b bVar = this.f29248a;
            if (!z11) {
                bVar.a(true, z10);
                w21Var.b(i10);
                return;
            }
            bVar.a(false, z10);
        }
    }

    public w9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.f29249a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public pv0 getSharedMediaPreloader() {
        return this.f29253c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.el elVar = this.f29269r;
        if (elVar != null) {
            return elVar.getTextPaint();
        }
        return this.f29271s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.el elVar = this.f29269r;
        if (elVar != null) {
            return elVar;
        }
        q6 q6Var = this.f29271s;
        if (q6Var != null) {
            return q6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f29276w;
    }

    public org.telegram.ui.ActionBar.n5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int dp;
        float f7 = 0.0f;
        org.telegram.ui.el elVar = this.h;
        if (elVar != null) {
            f7 = Math.max(0.0f, elVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.el elVar2 = this.f29269r;
        if (elVar2 != null) {
            f7 = Math.max(f7, elVar2.getExactWidthIncludeDrawables());
        }
        ko koVar = this.e;
        if (koVar != null && koVar.getVisibility() == 0) {
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
        this.f29265n0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
                this.f29270r0 = mutate;
                int i10 = org.telegram.ui.ActionBar.k6.f21598zh;
                org.telegram.ui.ActionBar.g6 g6Var = this.f29254d0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.r6.z(this, mutate, i10, g6Var, mode);
                Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
                this.f29272s0 = mutate2;
                org.telegram.ui.ActionBar.r6.z(this, mutate2, org.telegram.ui.ActionBar.k6.Ah, this.f29254d0, mode);
                this.h.j(new yq(this.f29270r0, this.f29272s0));
                this.m0 = true;
                this.f29267p0 = LocaleController.getString(R.string.AccDescrVerified);
            } else if (this.h.getRightDrawable() instanceof zm0) {
                this.h.j(null);
                this.m0 = false;
                this.f29267p0 = null;
            }
        } else {
            this.f29265n0 = true;
            if (!(this.h.getRightDrawable() instanceof zm0)) {
                zm0 zm0Var = new zm0(!z10 ? 1 : 0);
                zm0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, this.f29254d0));
                this.h.j(zm0Var);
                this.f29267p0 = LocaleController.getString(R.string.ScamMessage);
                this.m0 = true;
            }
        }
        if (!z13 && DialogObject.getEmojiStatusDocumentId(emojiStatus) == 0) {
            this.h.i(null);
            this.f29266o0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof q5) && (((q5) this.h.getRightDrawable()).f29766a instanceof r5)) {
                ((r5) ((q5) this.h.getRightDrawable()).f29766a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f29257f0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.f29268q0 = mutate3;
                org.telegram.ui.ActionBar.r6.z(this, mutate3, org.telegram.ui.ActionBar.k6.f21598zh, this.f29254d0, PorterDuff.Mode.MULTIPLY);
                this.f29257f0.g(this.f29268q0, z14);
            } else {
                this.f29257f0.g(null, z14);
            }
            this.f29257f0.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, this.f29254d0)));
            this.h.i(this.f29257f0);
            this.m0 = false;
            this.f29266o0 = LocaleController.getString(R.string.AccDescrPremium);
        }
        org.telegram.ui.ActionBar.k kVar = this.f29281y0;
        if (kVar != null) {
            kVar.d(z14);
        }
    }

    public final void i(int i10, int i11) {
        org.telegram.ui.el elVar = this.h;
        org.telegram.ui.ActionBar.r6.r(elVar);
        org.telegram.ui.el elVar2 = this.f29269r;
        org.telegram.ui.ActionBar.r6.r(elVar2);
        elVar.setTextColor(i10);
        elVar2.setTextColor(i11);
        elVar2.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.el elVar = this.h;
        elVar.setLeftDrawable(drawable);
        if (!this.m0 && !this.f29265n0) {
            if (drawable2 != null) {
                this.f29267p0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.f29267p0 = null;
            }
            elVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.f29281y0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        h9 h9Var = this.I;
        h9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        ko koVar = this.e;
        if (isReplyUser) {
            h9Var.g(12);
            h9Var.f26849p = 0.8f;
            if (koVar != null) {
                koVar.h(null, null, h9Var, user);
            }
        } else if (UserObject.isAnonymous(user)) {
            h9Var.g(21);
            h9Var.f26849p = 0.8f;
            if (koVar != null) {
                koVar.h(null, null, h9Var, user);
            }
        } else if (UserObject.isUserSelf(user) && !z10) {
            h9Var.g(1);
            h9Var.f26849p = 0.8f;
            if (koVar != null) {
                koVar.h(null, null, h9Var, user);
            }
        } else {
            h9Var.f26849p = 1.0f;
            if (koVar != null) {
                koVar.e(user, h9Var);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f29254d0;
        q6 q6Var = this.f29271s;
        org.telegram.ui.el elVar = this.f29269r;
        if (str == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (elVar != null) {
                    elVar.k(charSequence);
                    this.W = null;
                    Integer num = this.f29251b0;
                    if (num != null) {
                        elVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.f29249a0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.r6.Z(elVar, i11, g6Var);
                            elVar.setTag(Integer.valueOf(this.f29249a0));
                        }
                    }
                } else if (q6Var != null) {
                    q6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.f29251b0;
                    if (num2 != null) {
                        q6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.f29249a0;
                        if (i12 >= 0) {
                            org.telegram.ui.ActionBar.r6.a0(q6Var, i12, g6Var);
                            q6Var.setTag(Integer.valueOf(this.f29249a0));
                        }
                    }
                }
            }
        } else if (elVar != null) {
            if (this.W == null) {
                this.W = elVar.getText();
            }
            elVar.k(str);
            Integer num3 = this.f29251b0;
            if (num3 != null) {
                elVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.k6.B8;
                org.telegram.ui.ActionBar.r6.Z(elVar, i13, g6Var);
                elVar.setTag(Integer.valueOf(i13));
            }
        } else if (q6Var != null) {
            if (this.W == null) {
                this.W = q6Var.getText();
            }
            q6Var.c(str, !LocaleController.isRTL, true);
            Integer num4 = this.f29251b0;
            if (num4 != null) {
                q6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.k6.B8;
                org.telegram.ui.ActionBar.r6.a0(q6Var, i14, g6Var);
                q6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.f29281y0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.sn snVar = this.G;
        if (snVar != null) {
            this.U = 0;
            TLRPC.ChatFull chatFull = snVar.f41592l8;
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
                    if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f20490id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
                        this.U++;
                    }
                }
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean[] zArr;
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f29254d0;
        boolean[] zArr2 = this.R;
        q6 q6Var = this.f29271s;
        org.telegram.ui.el elVar = this.f29269r;
        org.telegram.ui.el elVar2 = this.h;
        int i18 = this.J;
        org.telegram.ui.sn snVar = this.G;
        if (snVar != null) {
            if (snVar.f41492d4 == 6) {
                String str2 = snVar.f41465b4.link;
                ig.y[] yVarArr = ig.y.e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                setSubtitle(str2);
                return;
            }
            TLRPC.User i19 = snVar.i();
            TLRPC.Chat chat = snVar.e;
            if (UserObject.isUserSelf(i19) && snVar.f41492d4 == 0 && snVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.f29273t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((UserObject.isUserSelf(i19) && !z11) || UserObject.isReplyUser(i19) || ((i19 != null && i19.f20490id == 489000) || ((i10 = snVar.f41492d4) != 0 && i10 != 8))) && snVar.f41492d4 != 3) {
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
                if (!this.f29273t0) {
                    MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i17) + 1).apply();
                    this.f29273t0 = true;
                }
            }
            CharSequence printingString = MessagesController.getInstance(i18).getPrintingString(snVar.a(), snVar.f41638p4, false);
            if (printingString == null) {
                UserObject.isBotForum(i19);
            }
            CharSequence charSequence2 = "";
            if (printingString != null) {
                printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z14 = z11;
            if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                if (snVar.K9() && elVar2.getTag() != null) {
                    elVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.Q;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.Q = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(elVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.Q.addListener(new no(this, 1));
                        this.Q.setDuration(180L);
                        this.Q.start();
                    } else {
                        elVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer printingStringType = MessagesController.getInstance(i18).getPrintingStringType(snVar.a(), snVar.f41638p4);
                if (printingStringType != null && printingStringType.intValue() == 5) {
                    charSequence = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
                } else {
                    charSequence = printingString;
                }
                setTypingAnimation(true);
                z13 = true;
                str = charSequence;
            } else if (snVar.K9() && !snVar.f41689t4) {
                if (elVar2.getTag() == null) {
                    elVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.Q;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.Q = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(elVar2, property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.Q.addListener(new no(this, 0));
                        this.Q.setDuration(180L);
                        this.Q.start();
                        return;
                    }
                    elVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = snVar.f41492d4;
                if (i20 == 8) {
                    if (snVar.f41517f4) {
                        charSequence2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    } else if (snVar.d() == 0) {
                        int topicsCount = snVar.getMessagesController().getTopicsController().getTopicsCount(-snVar.a());
                        if (topicsCount > 0) {
                            string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                        } else {
                            string = LocaleController.getString(R.string.ChatMessageSuggestions);
                        }
                        charSequence2 = string;
                    } else {
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f20343id, snVar.d());
                        if (findTopic != null) {
                            i15 = findTopic.totalMessagesCount;
                        } else {
                            i15 = 0;
                        }
                        if (i15 > 0) {
                            z13 = false;
                            formatString = LocaleController.formatPluralString("messages", i15, Integer.valueOf(i15));
                        } else {
                            z13 = false;
                            formatString = LocaleController.formatString(R.string.TopicProfileStatus, og.d.i(chat, i18, false));
                        }
                        str = formatString;
                    }
                    z13 = false;
                    str = charSequence2;
                } else {
                    if (i20 == 3) {
                        charSequence2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, snVar.getMessagesController().getSavedMessagesController().getMessagesCount(snVar.N8())), new Object[0]);
                    } else {
                        if (snVar.f41689t4 && chat != null) {
                            TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f20343id, snVar.d());
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
                            TLRPC.ChatFull chatFull = snVar.f41592l8;
                            int i22 = this.U;
                            if (ChatObject.isChannel(chat)) {
                                if (chatFull != null && (i12 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i22 > 1) {
                                            formatPluralString = a1.g.D(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i22, chatFull.participants_count), new Object[0]));
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
                                    formatPluralString = a1.g.D(LocaleController.formatPluralString("Members", i24, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i22, new Object[0]));
                                } else {
                                    formatPluralString = LocaleController.formatPluralString("Members", i24, new Object[0]);
                                }
                            }
                        } else {
                            if (i19 != null) {
                                TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(i19.f20490id));
                                if (user != null) {
                                    i19 = user;
                                }
                                if (!UserObject.isReplyUser(i19)) {
                                    long j10 = i19.f20490id;
                                    if (j10 != 489000) {
                                        if (j10 == UserConfig.getInstance(i18).getClientUserId()) {
                                            charSequence2 = z14 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                        } else {
                                            long j11 = i19.f20490id;
                                            if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                                z12 = false;
                                                charSequence2 = LocaleController.getString(R.string.ServiceNotifications);
                                            } else if (MessagesController.isSupportUser(i19)) {
                                                charSequence2 = LocaleController.getString(R.string.SupportStatus);
                                            } else {
                                                boolean z15 = i19.bot;
                                                if (z15 && (i11 = i19.bot_active_users) != 0) {
                                                    charSequence2 = LocaleController.formatPluralStringComma("BotUsers", i11, ',');
                                                } else if (z15) {
                                                    charSequence2 = UserObject.getBotStatus(i19);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f29255e0) {
                                                        zArr = this.S;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    String formatUserStatus = LocaleController.formatUserStatus(i18, i19, zArr2, zArr);
                                                    z13 = zArr2[0];
                                                    str = formatUserStatus;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                z12 = false;
                            }
                            z13 = z12;
                            str = charSequence2;
                        }
                        charSequence2 = formatPluralString;
                    }
                    z13 = false;
                    str = charSequence2;
                }
            }
            if (z13) {
                i16 = org.telegram.ui.ActionBar.k6.f21406pa;
            } else {
                i16 = org.telegram.ui.ActionBar.k6.B8;
            }
            this.f29249a0 = i16;
            if (this.W == null) {
                if (elVar != null) {
                    elVar.k(str);
                    Integer num = this.f29251b0;
                    if (num == null) {
                        org.telegram.ui.ActionBar.r6.Z(elVar, this.f29249a0, g6Var);
                        elVar.setTag(Integer.valueOf(this.f29249a0));
                    } else {
                        elVar.setTextColor(num.intValue());
                    }
                } else {
                    q6Var.c(str, z10, true);
                    Integer num2 = this.f29251b0;
                    if (num2 == null) {
                        org.telegram.ui.ActionBar.r6.a0(q6Var, this.f29249a0, g6Var);
                        q6Var.setTag(Integer.valueOf(this.f29249a0));
                    } else {
                        q6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.W = str;
            }
            org.telegram.ui.ActionBar.k kVar = this.f29281y0;
            if (kVar != null) {
                kVar.d(z10);
            }
        }
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        ImageView imageView;
        int i11;
        if (i10 == 0 && (imageView = this.f29276w) != null) {
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

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.sn snVar = this.G;
        if (snVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (snVar.f41492d4 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        p5 p5Var = this.f29257f0;
        if (p5Var != null) {
            p5Var.a();
        }
        p5 p5Var2 = this.f29258g0;
        if (p5Var2 != null) {
            p5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.sn snVar = this.G;
        if (snVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (snVar.f41492d4 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        p5 p5Var = this.f29257f0;
        if (p5Var != null) {
            p5Var.b();
        }
        p5 p5Var2 = this.f29258g0;
        if (p5Var2 != null) {
            p5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f29266o0 != null) {
            sb2.append(", ");
            sb2.append(this.f29266o0);
        }
        if (this.f29267p0 != null) {
            sb2.append(", ");
            sb2.append(this.f29267p0);
        }
        sb2.append("\n");
        org.telegram.ui.el elVar = this.f29269r;
        if (elVar != null) {
            sb2.append(elVar.getText());
        } else {
            q6 q6Var = this.f29271s;
            if (q6Var != null) {
                sb2.append(q6Var.getText());
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
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ko koVar = this.e;
        int measuredHeight = ((currentActionBarHeight - koVar.getMeasuredHeight()) - 2) / 2;
        if (this.K) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = measuredHeight + i14;
        if (this.f29262k0) {
            f7 = 23.66f;
        } else {
            f7 = 24.0f;
        }
        int dp = AndroidUtilities.dp(f7) + i15;
        int i16 = this.L + 1;
        int i17 = i15 + 1;
        koVar.layout(i16, i17, koVar.getMeasuredWidth() + i16, koVar.getMeasuredHeight() + i17);
        int i18 = this.L;
        if (koVar.getVisibility() == 0) {
            if (this.f29262k0) {
                f10 = 49.66f;
            } else {
                f10 = 55.0f;
            }
        } else if (this.f29262k0) {
            f10 = 13.0f;
        } else {
            f10 = 1.0f;
        }
        int dp2 = i18 + AndroidUtilities.dp(f10) + this.M;
        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) this.f29264n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.el elVar = this.h;
        if (visibility != 8) {
            elVar.layout(dp2, (AndroidUtilities.dp(1.66f) + i15) - elVar.getPaddingTop(), elVar.getMeasuredWidth() + dp2, elVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (elVar.getTextHeight() + i15)) - elVar.getPaddingTop()));
            if (n5Var != null) {
                n5Var.layout(dp2, AndroidUtilities.dp(1.66f) + i15, n5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + n5Var.getTextHeight() + i15);
            }
        } else {
            elVar.layout(dp2, (AndroidUtilities.dp(11.0f) + i15) - elVar.getPaddingTop(), elVar.getMeasuredWidth() + dp2, elVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (elVar.getTextHeight() + i15)) - elVar.getPaddingTop()));
            if (n5Var != null) {
                n5Var.layout(dp2, AndroidUtilities.dp(10.0f) + i15, n5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + n5Var.getTextHeight() + i15);
            }
        }
        ImageView imageView = this.f29278x;
        if (imageView != null) {
            imageView.layout(AndroidUtilities.dp(29.0f) + this.L, AndroidUtilities.dp(27.33f) + i15, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.L, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + i15);
        }
        ImageView imageView2 = this.f29276w;
        if (imageView2 != null) {
            imageView2.layout(AndroidUtilities.dp(19.333f) + this.L, i15 - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.L, imageView2.getMeasuredHeight() + (i15 - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.f29280y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        org.telegram.ui.el elVar2 = this.f29269r;
        if (elVar2 != null) {
            elVar2.layout(dp2, dp, elVar2.getMeasuredWidth() + dp2, elVar2.getTextHeight() + dp);
        } else {
            q6 q6Var = this.f29271s;
            if (q6Var != null) {
                q6Var.layout(dp2, dp, q6Var.getMeasuredWidth() + dp2, q6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) this.v.get();
        if (n5Var2 != null) {
            n5Var2.layout(dp2, dp, n5Var2.getMeasuredWidth() + dp2, n5Var2.getTextHeight() + dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        ko koVar = this.e;
        int i13 = 0;
        if (koVar.getVisibility() == 0) {
            i12 = 54;
        } else {
            i12 = 0;
        }
        int dp = size - AndroidUtilities.dp(i12 + 16);
        float f11 = this.d;
        koVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.el elVar = this.h;
        elVar.measure(makeMeasureSpec, makeMeasureSpec2);
        q6 q6Var = this.f29271s;
        org.telegram.ui.el elVar2 = this.f29269r;
        if (elVar2 != null) {
            elVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (q6Var != null) {
            q6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f29278x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f29276w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.f29280y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i14 = this.O;
        AtomicReference atomicReference = this.f29264n;
        if (i14 != -1 && i14 != size && i14 > size) {
            this.P = i14;
            View view = (org.telegram.ui.ActionBar.n5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
            atomicReference.set(n5Var);
            int i15 = org.telegram.ui.ActionBar.k6.A8;
            org.telegram.ui.ActionBar.g6 g6Var = this.f29254d0;
            org.telegram.ui.ActionBar.r6.Z(n5Var, i15, g6Var);
            if (this.f29262k0) {
                f7 = 17.5f;
            } else {
                f7 = 18.0f;
            }
            n5Var.setTextSizePx(AndroidUtilities.dp(f7));
            n5Var.setGravity(3);
            n5Var.setTypeface(AndroidUtilities.bold());
            n5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            n5Var.i(elVar.getRightDrawable());
            n5Var.j(elVar.getRightDrawable2());
            n5Var.setRightDrawableOutside(elVar.getRightDrawableOutside());
            n5Var.setLeftDrawable(elVar.getLeftDrawable());
            n5Var.l(elVar.getText(), false);
            ViewPropertyAnimator duration = n5Var.animate().alpha(0.0f).setDuration(350L);
            bs bsVar = bs.h;
            duration.setInterpolator(bsVar).withEndAction(new ho(this, 0)).start();
            addView(n5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.n5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(getContext());
            atomicReference2.set(n5Var2);
            int i16 = org.telegram.ui.ActionBar.k6.B8;
            org.telegram.ui.ActionBar.r6.Z(n5Var2, i16, g6Var);
            n5Var2.setTag(Integer.valueOf(i16));
            if (this.f29262k0) {
                f10 = 13.5f;
            } else {
                f10 = 14.0f;
            }
            n5Var2.setTextSizePx(AndroidUtilities.dp(f10));
            n5Var2.setGravity(3);
            if (elVar2 != null) {
                n5Var2.l(elVar2.getText(), false);
            } else if (q6Var != null) {
                n5Var2.l(q6Var.getText(), false);
            }
            n5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(bsVar).withEndAction(new ho(this, 1)).start();
            addView(n5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.n5 n5Var3 = (org.telegram.ui.ActionBar.n5) atomicReference.get();
        if (n5Var3 != null) {
            int i17 = this.P;
            if (koVar.getVisibility() == 0) {
                i13 = 54;
            }
            n5Var3.measure(org.telegram.messenger.sl.c(i13 + 16, i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.O = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        yc ycVar = this.f29259h0;
        ho hoVar = this.f29260i0;
        if (action == 0 && a()) {
            this.f29261j0 = true;
            ycVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(hoVar);
            AndroidUtilities.runOnUIThread(hoVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f29261j0) {
            ycVar.c(false);
            this.f29261j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(hoVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return false;
    }

    public final PorterDuffColorFilter q() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, this.f29254d0);
        if (this.f29274u0 == null || w02 != this.f29277w0) {
            this.f29277w0 = w02;
            this.f29274u0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.f29274u0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f29281y0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f7;
        int i10 = this.J;
        h9 h9Var = this.I;
        h9Var.k(i10, chat);
        ko koVar = this.e;
        if (koVar != null) {
            koVar.e(chat, h9Var);
            if (ChatObject.isForum(chat)) {
                if (ChatObject.hasStories(chat)) {
                    f7 = 11.0f;
                } else {
                    f7 = 16.0f;
                }
            } else {
                f7 = 21.0f;
            }
            koVar.setRoundRadius(AndroidUtilities.dp(f7));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f29278x;
        if (imageView != null) {
            if (z10 && !this.f29256f) {
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
        this.f29251b0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f29259h0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.M = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.f29252c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.el elVar = this.f29269r;
            if (elVar != null) {
                elVar.k(charSequence);
            } else {
                q6 q6Var = this.f29271s;
                if (q6Var != null) {
                    q6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.f29281y0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override
    public final void updateColors() {
        kx0 kx0Var = this.N;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29254d0;
        if (kx0Var != null) {
            kx0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21406pa, g6Var));
        }
        Drawable drawable = this.f29268q0;
        if (drawable != null) {
            drawable.setColorFilter(q());
        }
        p5 p5Var = this.f29258g0;
        if (p5Var != null) {
            p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, g6Var)));
        }
        p5 p5Var2 = this.f29257f0;
        if (p5Var2 != null) {
            p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21598zh, g6Var)));
        }
        Drawable drawable2 = this.f29270r0;
        if (drawable2 != null) {
            drawable2.setColorFilter(q());
        }
        if (this.f29272s0 != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ah, g6Var);
            if (this.f29275v0 == null || w02 != this.f29279x0) {
                this.f29279x0 = w02;
                this.f29275v0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.f29272s0.setColorFilter(this.f29275v0);
        }
        org.telegram.ui.el elVar = this.h;
        if (elVar != null) {
            try {
                if (elVar.getRightDrawable2() instanceof zm0) {
                    ((zm0) elVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, g6Var));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void f() {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
