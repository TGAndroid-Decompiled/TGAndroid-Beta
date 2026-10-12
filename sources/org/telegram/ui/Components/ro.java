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
public class ro extends FrameLayout implements ne.d, NotificationCenter.NotificationCenterDelegate {
    public final ImageView E;
    public final w21 F;
    public final org.telegram.ui.fo G;
    public final kx0[] H;
    public final k9 I;
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
    public final ne.b f28885a;
    public int f28886a0;
    public boolean f28887b;
    public Integer f28888b0;
    public Integer f28889c;
    public final pv0 f28890c0;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 f28891d0;
    public final no e;
    public boolean f28892e0;
    public final boolean f28893f;
    public final q5 f28894f0;
    public final q5 f28895g0;
    public final org.telegram.ui.ql h;
    public final ad f28896h0;
    public final ko f28897i0;
    public boolean f28898j0;
    public boolean f28899k0;
    public boolean f28900l0;
    public boolean m0;
    public final AtomicReference f28901n;
    public boolean f28902n0;
    public String f28903o0;
    public String f28904p0;
    public Drawable f28905q0;
    public final org.telegram.ui.ql f28906r;
    public Drawable f28907r0;
    public final s6 f28908s;
    public Drawable f28909s0;
    public boolean f28910t0;
    public org.telegram.ui.ActionBar.k f28911u0;
    public final AtomicReference v;
    public final ImageView f28912w;
    public final ImageView f28913x;
    public final ImageView f28914y;

    public ro(android.content.Context r22, org.telegram.ui.ActionBar.m2 r23, boolean r24, org.telegram.ui.ActionBar.c6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ro.<init>(android.content.Context, org.telegram.ui.ActionBar.m2, boolean, org.telegram.ui.ActionBar.c6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.fo foVar = this.G;
        org.telegram.ui.ql qlVar = this.f28906r;
        if (qlVar != null) {
            int i10 = 0;
            kx0[] kx0VarArr = this.H;
            if (z10) {
                try {
                    int intValue = MessagesController.getInstance(this.J).getPrintingStringType(foVar.a(), foVar.f35915d4).intValue();
                    kx0 kx0Var = kx0VarArr[intValue];
                    if (kx0Var != null) {
                        org.telegram.ui.ActionBar.c6 c6Var = this.f28891d0;
                        if (intValue == 5) {
                            qlVar.g(kx0Var, "**oo**");
                            kx0VarArr[intValue].b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20124pa, c6Var));
                            qlVar.setLeftDrawable((Drawable) null);
                        } else {
                            qlVar.g(null, null);
                            kx0VarArr[intValue].b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20124pa, c6Var));
                            qlVar.setLeftDrawable(kx0VarArr[intValue]);
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
            qlVar.setLeftDrawable((Drawable) null);
            qlVar.g(null, null);
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
        org.telegram.ui.fo foVar = this.G;
        if (foVar != null) {
            TLRPC.User i11 = foVar.i();
            TLRPC.Chat chat = foVar.e;
            if (foVar.R3 == 3) {
                long N8 = foVar.N8();
                if (N8 >= 0) {
                    user = foVar.getMessagesController().getUser(Long.valueOf(N8));
                    chat = null;
                } else {
                    chat = foVar.getMessagesController().getChat(Long.valueOf(-N8));
                    user = null;
                }
            } else {
                user = i11;
            }
            int i12 = this.J;
            k9 k9Var = this.I;
            no noVar = this.e;
            if (user != null) {
                k9Var.m(i12, user);
                if (UserObject.isReplyUser(user)) {
                    k9Var.f26627p = 0.8f;
                    k9Var.g(12);
                    if (noVar != null) {
                        noVar.setAnimatedEmojiDrawable(null);
                        noVar.h(null, null, k9Var, user);
                    }
                } else if (UserObject.isAnonymous(user)) {
                    k9Var.f26627p = 0.8f;
                    k9Var.g(21);
                    if (noVar != null) {
                        noVar.setAnimatedEmojiDrawable(null);
                        noVar.h(null, null, k9Var, user);
                    }
                } else if (UserObject.isUserSelf(user) && foVar.R3 == 3) {
                    k9Var.f26627p = 0.8f;
                    k9Var.g(22);
                    if (noVar != null) {
                        noVar.setAnimatedEmojiDrawable(null);
                        noVar.h(null, null, k9Var, user);
                    }
                } else if (UserObject.isUserSelf(user)) {
                    k9Var.f26627p = 0.8f;
                    k9Var.g(1);
                    if (noVar != null) {
                        noVar.setAnimatedEmojiDrawable(null);
                        noVar.h(null, null, k9Var, user);
                    }
                } else {
                    k9Var.f26627p = 1.0f;
                    if (noVar != null) {
                        noVar.setAnimatedEmojiDrawable(null);
                        noVar.f31813a.setForUserOrChat(user, k9Var, null, true, 3, false);
                    }
                }
            } else if (ChatObject.isMonoForum(chat)) {
                long d = foVar.d();
                if (ChatObject.canManageMonoForum(i12, chat) && d != 0) {
                    if (i10 > 0) {
                        TLRPC.User user2 = foVar.getMessagesController().getUser(Long.valueOf(d));
                        k9Var.r(user2);
                        noVar.setAnimatedEmojiDrawable(null);
                        noVar.e(user2, k9Var);
                    } else {
                        TLRPC.Chat chat2 = foVar.getMessagesController().getChat(Long.valueOf(-d));
                        k9Var.q(chat2);
                        noVar.setAnimatedEmojiDrawable(null);
                        noVar.e(chat2, k9Var);
                    }
                } else {
                    noVar.setAnimatedEmojiDrawable(null);
                    og.d.o(i12, chat, k9Var, noVar);
                }
                noVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            } else if (chat != null) {
                k9Var.f26627p = 1.0f;
                k9Var.k(i12, chat);
                if (noVar != null) {
                    noVar.setAnimatedEmojiDrawable(null);
                    noVar.e(chat, k9Var);
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
                    noVar.setRoundRadius(dp);
                }
            }
        }
    }

    public final q5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        q5 q5Var = this.f28895g0;
        q5Var.j(j10, false);
        q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, this.f28891d0)));
        int dp = AndroidUtilities.dp(1.0f);
        q5Var.I = 0;
        q5Var.J = dp;
        return q5Var;
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
            org.telegram.ui.ql qlVar = this.h;
            if (qlVar != null) {
                qlVar.invalidate();
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
        float a2 = this.f28896h0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (view == this.e) {
            boolean z11 = false;
            ImageView imageView = this.f28912w;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f28913x;
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.g6.Ll);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.g6.Ll);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ro.e(boolean, boolean):void");
    }

    public final void g(int i10, boolean z10) {
        w21 w21Var = this.F;
        if (w21Var != null) {
            boolean z11 = this.f28900l0;
            if (i10 == 0 && !this.T) {
                return;
            }
            ne.b bVar = this.f28885a;
            if (!z11) {
                bVar.a(true, z10);
                w21Var.b(i10);
                return;
            }
            bVar.a(false, z10);
        }
    }

    public z9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.f28886a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public pv0 getSharedMediaPreloader() {
        return this.f28890c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.ql qlVar = this.f28906r;
        if (qlVar != null) {
            return qlVar.getTextPaint();
        }
        return this.f28908s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.ql qlVar = this.f28906r;
        if (qlVar != null) {
            return qlVar;
        }
        s6 s6Var = this.f28908s;
        if (s6Var != null) {
            return s6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f28912w;
    }

    public org.telegram.ui.ActionBar.h5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int dp;
        float f7 = 0.0f;
        org.telegram.ui.ql qlVar = this.h;
        if (qlVar != null) {
            f7 = Math.max(0.0f, qlVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.ql qlVar2 = this.f28906r;
        if (qlVar2 != null) {
            f7 = Math.max(f7, qlVar2.getExactWidthIncludeDrawables());
        }
        no noVar = this.e;
        if (noVar != null && noVar.getVisibility() == 0) {
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
        this.f28902n0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
                this.f28907r0 = mutate;
                int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, this.f28891d0);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
                Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
                this.f28909s0 = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ah, this.f28891d0), mode));
                this.h.j(new cr(this.f28907r0, this.f28909s0));
                this.m0 = true;
                this.f28904p0 = LocaleController.getString(R.string.AccDescrVerified);
            } else if (this.h.getRightDrawable() instanceof zm0) {
                this.h.j(null);
                this.m0 = false;
                this.f28904p0 = null;
            }
        } else {
            this.f28902n0 = true;
            if (!(this.h.getRightDrawable() instanceof zm0)) {
                zm0 zm0Var = new zm0(!z10 ? 1 : 0);
                zm0Var.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B8, this.f28891d0));
                this.h.j(zm0Var);
                this.f28904p0 = LocaleController.getString(R.string.ScamMessage);
                this.m0 = true;
            }
        }
        if (!z13 && DialogObject.getEmojiStatusDocumentId(emojiStatus) == 0) {
            this.h.i(null);
            this.f28903o0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof r5) && (((r5) this.h.getRightDrawable()).f28737a instanceof s5)) {
                ((s5) ((r5) this.h.getRightDrawable()).f28737a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f28894f0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.f28905q0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, this.f28891d0), PorterDuff.Mode.MULTIPLY));
                this.f28894f0.g(this.f28905q0, z14);
            } else {
                this.f28894f0.g(null, z14);
            }
            this.f28894f0.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, this.f28891d0)));
            this.h.i(this.f28894f0);
            this.m0 = false;
            this.f28903o0 = LocaleController.getString(R.string.AccDescrPremium);
        }
        org.telegram.ui.ActionBar.k kVar = this.f28911u0;
        if (kVar != null) {
            kVar.e(z14);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.ql qlVar = this.f28906r;
        qlVar.setTextColor(i11);
        qlVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.ql qlVar = this.h;
        qlVar.setLeftDrawable(drawable);
        if (!this.m0 && !this.f28902n0) {
            if (drawable2 != null) {
                this.f28904p0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.f28904p0 = null;
            }
            qlVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.f28911u0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        k9 k9Var = this.I;
        k9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        no noVar = this.e;
        if (isReplyUser) {
            k9Var.g(12);
            k9Var.f26627p = 0.8f;
            if (noVar != null) {
                noVar.h(null, null, k9Var, user);
            }
        } else if (UserObject.isAnonymous(user)) {
            k9Var.g(21);
            k9Var.f26627p = 0.8f;
            if (noVar != null) {
                noVar.h(null, null, k9Var, user);
            }
        } else if (UserObject.isUserSelf(user) && !z10) {
            k9Var.g(1);
            k9Var.f26627p = 0.8f;
            if (noVar != null) {
                noVar.h(null, null, k9Var, user);
            }
        } else {
            k9Var.f26627p = 1.0f;
            if (noVar != null) {
                noVar.e(user, k9Var);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f28891d0;
        s6 s6Var = this.f28908s;
        org.telegram.ui.ql qlVar = this.f28906r;
        if (str == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (qlVar != null) {
                    qlVar.k(charSequence);
                    this.W = null;
                    Integer num = this.f28888b0;
                    if (num != null) {
                        qlVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.f28886a0;
                        if (i11 >= 0) {
                            qlVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
                            qlVar.setTag(Integer.valueOf(this.f28886a0));
                        }
                    }
                } else if (s6Var != null) {
                    s6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.f28888b0;
                    if (num2 != null) {
                        s6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.f28886a0;
                        if (i12 >= 0) {
                            s6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
                            s6Var.setTag(Integer.valueOf(this.f28886a0));
                        }
                    }
                }
            }
        } else if (qlVar != null) {
            if (this.W == null) {
                this.W = qlVar.getText();
            }
            qlVar.k(str);
            Integer num3 = this.f28888b0;
            if (num3 != null) {
                qlVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.g6.B8;
                qlVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
                qlVar.setTag(Integer.valueOf(i13));
            }
        } else if (s6Var != null) {
            if (this.W == null) {
                this.W = s6Var.getText();
            }
            s6Var.c(str, !LocaleController.isRTL, true);
            Integer num4 = this.f28888b0;
            if (num4 != null) {
                s6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.g6.B8;
                s6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
                s6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.f28911u0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.fo foVar = this.G;
        if (foVar != null) {
            this.U = 0;
            TLRPC.ChatFull chatFull = foVar.Z7;
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
                    if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f19363id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f28891d0;
        boolean[] zArr2 = this.R;
        s6 s6Var = this.f28908s;
        org.telegram.ui.ql qlVar = this.f28906r;
        org.telegram.ui.ql qlVar2 = this.h;
        int i18 = this.J;
        org.telegram.ui.fo foVar = this.G;
        if (foVar != null) {
            if (foVar.R3 == 6) {
                String str2 = foVar.P3.link;
                ig.y[] yVarArr = ig.y.e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                setSubtitle(str2);
                return;
            }
            TLRPC.User i19 = foVar.i();
            TLRPC.Chat chat = foVar.e;
            if (UserObject.isUserSelf(i19) && foVar.R3 == 0 && foVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.f28910t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((UserObject.isUserSelf(i19) && !z11) || UserObject.isReplyUser(i19) || ((i19 != null && i19.f19363id == 489000) || ((i10 = foVar.R3) != 0 && i10 != 8))) && foVar.R3 != 3) {
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
                if (!this.f28910t0) {
                    MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i17) + 1).apply();
                    this.f28910t0 = true;
                }
            }
            CharSequence printingString = MessagesController.getInstance(i18).getPrintingString(foVar.a(), foVar.f35915d4, false);
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
                if (foVar.K9() && qlVar2.getTag() != null) {
                    qlVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.Q;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.Q = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(qlVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.Q.addListener(new qo(this, 1));
                        this.Q.setDuration(180L);
                        this.Q.start();
                    } else {
                        qlVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer printingStringType = MessagesController.getInstance(i18).getPrintingStringType(foVar.a(), foVar.f35915d4);
                if (printingStringType != null && printingStringType.intValue() == 5) {
                    charSequence = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
                } else {
                    charSequence = printingString;
                }
                setTypingAnimation(true);
                z13 = true;
                str = charSequence;
            } else if (foVar.K9() && !foVar.f35964h4) {
                if (qlVar2.getTag() == null) {
                    qlVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.Q;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.Q = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(qlVar2, property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.Q.addListener(new qo(this, 0));
                        this.Q.setDuration(180L);
                        this.Q.start();
                        return;
                    }
                    qlVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = foVar.R3;
                if (i20 == 8) {
                    if (foVar.T3) {
                        charSequence2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    } else if (foVar.d() == 0) {
                        int topicsCount = foVar.getMessagesController().getTopicsController().getTopicsCount(-foVar.a());
                        if (topicsCount > 0) {
                            string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                        } else {
                            string = LocaleController.getString(R.string.ChatMessageSuggestions);
                        }
                        charSequence2 = string;
                    } else {
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f19216id, foVar.d());
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
                        charSequence2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, foVar.getMessagesController().getSavedMessagesController().getMessagesCount(foVar.N8())), new Object[0]);
                    } else {
                        if (foVar.f35964h4 && chat != null) {
                            TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f19216id, foVar.d());
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
                            TLRPC.ChatFull chatFull = foVar.Z7;
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
                                TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(i19.f19363id));
                                if (user != null) {
                                    i19 = user;
                                }
                                if (!UserObject.isReplyUser(i19)) {
                                    long j10 = i19.f19363id;
                                    if (j10 != 489000) {
                                        if (j10 == UserConfig.getInstance(i18).getClientUserId()) {
                                            charSequence2 = z14 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                        } else {
                                            long j11 = i19.f19363id;
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
                                                    charSequence2 = LocaleController.getString(R.string.Bot);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f28892e0) {
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
                i16 = org.telegram.ui.ActionBar.g6.f20124pa;
            } else {
                i16 = org.telegram.ui.ActionBar.g6.B8;
            }
            this.f28886a0 = i16;
            if (this.W == null) {
                if (qlVar != null) {
                    qlVar.k(str);
                    Integer num = this.f28888b0;
                    if (num == null) {
                        qlVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(this.f28886a0, c6Var));
                        qlVar.setTag(Integer.valueOf(this.f28886a0));
                    } else {
                        qlVar.setTextColor(num.intValue());
                    }
                } else {
                    s6Var.c(str, z10, true);
                    Integer num2 = this.f28888b0;
                    if (num2 == null) {
                        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(this.f28886a0, c6Var));
                        s6Var.setTag(Integer.valueOf(this.f28886a0));
                    } else {
                        s6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.W = str;
            }
            org.telegram.ui.ActionBar.k kVar = this.f28911u0;
            if (kVar != null) {
                kVar.e(z10);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.fo foVar = this.G;
        if (foVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (foVar.R3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        q5 q5Var = this.f28894f0;
        if (q5Var != null) {
            q5Var.a();
        }
        q5 q5Var2 = this.f28895g0;
        if (q5Var2 != null) {
            q5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.fo foVar = this.G;
        if (foVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (foVar.R3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        q5 q5Var = this.f28894f0;
        if (q5Var != null) {
            q5Var.b();
        }
        q5 q5Var2 = this.f28895g0;
        if (q5Var2 != null) {
            q5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f28903o0 != null) {
            sb2.append(", ");
            sb2.append(this.f28903o0);
        }
        if (this.f28904p0 != null) {
            sb2.append(", ");
            sb2.append(this.f28904p0);
        }
        sb2.append("\n");
        org.telegram.ui.ql qlVar = this.f28906r;
        if (qlVar != null) {
            sb2.append(qlVar.getText());
        } else {
            s6 s6Var = this.f28908s;
            if (s6Var != null) {
                sb2.append(s6Var.getText());
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
        no noVar = this.e;
        int measuredHeight = ((currentActionBarHeight - noVar.getMeasuredHeight()) - 2) / 2;
        if (this.K) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = measuredHeight + i14;
        if (this.f28899k0) {
            f7 = 23.66f;
        } else {
            f7 = 24.0f;
        }
        int dp = AndroidUtilities.dp(f7) + i15;
        int i16 = this.L + 1;
        int i17 = i15 + 1;
        noVar.layout(i16, i17, noVar.getMeasuredWidth() + i16, noVar.getMeasuredHeight() + i17);
        int i18 = this.L;
        if (noVar.getVisibility() == 0) {
            if (this.f28899k0) {
                f10 = 49.66f;
            } else {
                f10 = 55.0f;
            }
        } else if (this.f28899k0) {
            f10 = 13.0f;
        } else {
            f10 = 1.0f;
        }
        int dp2 = i18 + AndroidUtilities.dp(f10) + this.M;
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.f28901n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.ql qlVar = this.h;
        if (visibility != 8) {
            qlVar.layout(dp2, (AndroidUtilities.dp(1.66f) + i15) - qlVar.getPaddingTop(), qlVar.getMeasuredWidth() + dp2, qlVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (qlVar.getTextHeight() + i15)) - qlVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(dp2, AndroidUtilities.dp(1.66f) + i15, h5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + h5Var.getTextHeight() + i15);
            }
        } else {
            qlVar.layout(dp2, (AndroidUtilities.dp(11.0f) + i15) - qlVar.getPaddingTop(), qlVar.getMeasuredWidth() + dp2, qlVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (qlVar.getTextHeight() + i15)) - qlVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(dp2, AndroidUtilities.dp(10.0f) + i15, h5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + h5Var.getTextHeight() + i15);
            }
        }
        ImageView imageView = this.f28913x;
        if (imageView != null) {
            imageView.layout(AndroidUtilities.dp(29.0f) + this.L, AndroidUtilities.dp(27.33f) + i15, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.L, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + i15);
        }
        ImageView imageView2 = this.f28912w;
        if (imageView2 != null) {
            imageView2.layout(AndroidUtilities.dp(19.333f) + this.L, i15 - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.L, imageView2.getMeasuredHeight() + (i15 - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.f28914y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        org.telegram.ui.ql qlVar2 = this.f28906r;
        if (qlVar2 != null) {
            qlVar2.layout(dp2, dp, qlVar2.getMeasuredWidth() + dp2, qlVar2.getTextHeight() + dp);
        } else {
            s6 s6Var = this.f28908s;
            if (s6Var != null) {
                s6Var.layout(dp2, dp, s6Var.getMeasuredWidth() + dp2, s6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) this.v.get();
        if (h5Var2 != null) {
            h5Var2.layout(dp2, dp, h5Var2.getMeasuredWidth() + dp2, h5Var2.getTextHeight() + dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        no noVar = this.e;
        int i13 = 0;
        if (noVar.getVisibility() == 0) {
            i12 = 54;
        } else {
            i12 = 0;
        }
        int dp = size - AndroidUtilities.dp(i12 + 16);
        float f11 = this.d;
        noVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.ql qlVar = this.h;
        qlVar.measure(makeMeasureSpec, makeMeasureSpec2);
        s6 s6Var = this.f28908s;
        org.telegram.ui.ql qlVar2 = this.f28906r;
        if (qlVar2 != null) {
            qlVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (s6Var != null) {
            s6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f28913x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f28912w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.f28914y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i14 = this.O;
        AtomicReference atomicReference = this.f28901n;
        if (i14 != -1 && i14 != size && i14 > size) {
            this.P = i14;
            View view = (org.telegram.ui.ActionBar.h5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference.set(h5Var);
            int i15 = org.telegram.ui.ActionBar.g6.A8;
            org.telegram.ui.ActionBar.c6 c6Var = this.f28891d0;
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, c6Var));
            if (this.f28899k0) {
                f7 = 17.5f;
            } else {
                f7 = 18.0f;
            }
            h5Var.setTextSizePx(AndroidUtilities.dp(f7));
            h5Var.setGravity(3);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            h5Var.i(qlVar.getRightDrawable());
            h5Var.j(qlVar.getRightDrawable2());
            h5Var.setRightDrawableOutside(qlVar.getRightDrawableOutside());
            h5Var.setLeftDrawable(qlVar.getLeftDrawable());
            h5Var.l(qlVar.getText(), false);
            ViewPropertyAnimator duration = h5Var.animate().alpha(0.0f).setDuration(350L);
            es esVar = es.h;
            duration.setInterpolator(esVar).withEndAction(new ko(this, 0)).start();
            addView(h5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference2.set(h5Var2);
            int i16 = org.telegram.ui.ActionBar.g6.B8;
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, c6Var));
            h5Var2.setTag(Integer.valueOf(i16));
            if (this.f28899k0) {
                f10 = 13.5f;
            } else {
                f10 = 14.0f;
            }
            h5Var2.setTextSizePx(AndroidUtilities.dp(f10));
            h5Var2.setGravity(3);
            if (qlVar2 != null) {
                h5Var2.l(qlVar2.getText(), false);
            } else if (s6Var != null) {
                h5Var2.l(s6Var.getText(), false);
            }
            h5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).withEndAction(new ko(this, 1)).start();
            addView(h5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = (org.telegram.ui.ActionBar.h5) atomicReference.get();
        if (h5Var3 != null) {
            int i17 = this.P;
            if (noVar.getVisibility() == 0) {
                i13 = 54;
            }
            h5Var3.measure(org.telegram.messenger.yh.z(i13 + 16, i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.O = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ad adVar = this.f28896h0;
        ko koVar = this.f28897i0;
        if (action == 0 && a()) {
            this.f28898j0 = true;
            adVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(koVar);
            AndroidUtilities.runOnUIThread(koVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f28898j0) {
            adVar.c(false);
            this.f28898j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(koVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        ImageView imageView;
        int i11;
        if (i10 == 0 && (imageView = this.f28912w) != null) {
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

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f28911u0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f7;
        int i10 = this.J;
        k9 k9Var = this.I;
        k9Var.k(i10, chat);
        no noVar = this.e;
        if (noVar != null) {
            noVar.e(chat, k9Var);
            if (ChatObject.isForum(chat)) {
                if (ChatObject.hasStories(chat)) {
                    f7 = 11.0f;
                } else {
                    f7 = 16.0f;
                }
            } else {
                f7 = 21.0f;
            }
            noVar.setRoundRadius(AndroidUtilities.dp(f7));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f28913x;
        if (imageView != null) {
            if (z10 && !this.f28893f) {
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
        this.f28888b0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f28896h0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.M = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.f28889c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.ql qlVar = this.f28906r;
            if (qlVar != null) {
                qlVar.k(charSequence);
            } else {
                s6 s6Var = this.f28908s;
                if (s6Var != null) {
                    s6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.f28911u0;
        if (kVar != null) {
            kVar.e(true);
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
    public final void C(float f7, int i10) {
    }
}
