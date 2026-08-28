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
public class tn extends FrameLayout implements td.b, NotificationCenter.NotificationCenterDelegate {
    public final ImageView A;
    public final b11 B;
    public final org.telegram.ui.qn C;
    public final tv0[] D;
    public final z8 E;
    public final int F;
    public boolean G;
    public int H;
    public int I;
    public tv0 J;
    public int K;
    public int L;
    public AnimatorSet M;
    public final boolean[] N;
    public final boolean[] O;
    public final boolean P;
    public int Q;
    public int R;
    public CharSequence S;
    public int T;
    public Integer U;
    public final wt0 V;
    public final org.telegram.ui.ActionBar.b6 W;
    public final td.a f32724a;
    public boolean f32725a0;
    public boolean f32726b;
    public final i5 f32727b0;
    public Integer f32728c;
    public final i5 f32729c0;
    public final int d;
    public final pc f32730d0;
    public final pn f32731e;
    public final mn f32732e0;
    public final boolean f32733f;
    public boolean f32734f0;
    public boolean f32735g0;
    public final org.telegram.ui.zk h;
    public boolean f32736h0;
    public boolean f32737i0;
    public boolean f32738j0;
    public String f32739k0;
    public String f32740l0;
    public Drawable m0;
    public final AtomicReference f32741n;
    public Drawable f32742n0;
    public Drawable f32743o0;
    public boolean f32744p0;
    public org.telegram.ui.ActionBar.k f32745q0;
    public final org.telegram.ui.zk f32746r;
    public final j6 f32747s;
    public final AtomicReference v;
    public final ImageView f32748w;
    public final ImageView f32749x;
    public final ImageView f32750y;

    public tn(android.content.Context r22, org.telegram.ui.ActionBar.o2 r23, boolean r24, org.telegram.ui.ActionBar.b6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tn.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, boolean, org.telegram.ui.ActionBar.b6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.qn qnVar = this.C;
        org.telegram.ui.zk zkVar = this.f32746r;
        if (zkVar != null) {
            int i9 = 0;
            tv0[] tv0VarArr = this.D;
            if (z10) {
                try {
                    int intValue = MessagesController.getInstance(this.F).getPrintingStringType(qnVar.a(), qnVar.Z3).intValue();
                    tv0 tv0Var = tv0VarArr[intValue];
                    if (tv0Var != null) {
                        org.telegram.ui.ActionBar.b6 b6Var = this.W;
                        if (intValue == 5) {
                            zkVar.g(tv0Var, "**oo**");
                            tv0VarArr[intValue].b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23214pa, b6Var));
                            zkVar.setLeftDrawable((Drawable) null);
                        } else {
                            zkVar.g(null, null);
                            tv0VarArr[intValue].b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23214pa, b6Var));
                            zkVar.setLeftDrawable(tv0VarArr[intValue]);
                        }
                        this.J = tv0VarArr[intValue];
                        while (i9 < tv0VarArr.length) {
                            tv0 tv0Var2 = tv0VarArr[i9];
                            if (tv0Var2 != null) {
                                if (i9 == intValue) {
                                    tv0Var2.d();
                                } else {
                                    tv0Var2.e();
                                }
                            }
                            i9++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            this.J = null;
            zkVar.setLeftDrawable((Drawable) null);
            zkVar.g(null, null);
            while (i9 < tv0VarArr.length) {
                tv0 tv0Var3 = tv0VarArr[i9];
                if (tv0Var3 != null) {
                    tv0Var3.e();
                }
                i9++;
            }
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        ImageView imageView;
        int i10;
        if (i9 == 0 && (imageView = this.f32748w) != null) {
            imageView.setAlpha(f10);
            float f12 = 0.85f * f10;
            imageView.setScaleX(f12);
            imageView.setScaleY(f12);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int dp;
        float f10;
        int i9;
        org.telegram.ui.qn qnVar = this.C;
        if (qnVar != null) {
            TLRPC.User i10 = qnVar.i();
            TLRPC.Chat chat = qnVar.f41890e;
            if (qnVar.N3 == 3) {
                long I8 = qnVar.I8();
                if (I8 >= 0) {
                    user = qnVar.getMessagesController().getUser(Long.valueOf(I8));
                    chat = null;
                } else {
                    chat = qnVar.getMessagesController().getChat(Long.valueOf(-I8));
                    user = null;
                }
            } else {
                user = i10;
            }
            int i11 = this.F;
            z8 z8Var = this.E;
            pn pnVar = this.f32731e;
            if (user != null) {
                z8Var.m(i11, user);
                if (UserObject.isReplyUser(user)) {
                    z8Var.f35234p = 0.8f;
                    z8Var.g(12);
                    if (pnVar != null) {
                        pnVar.setAnimatedEmojiDrawable(null);
                        pnVar.h(null, null, z8Var, user);
                    }
                } else if (UserObject.isAnonymous(user)) {
                    z8Var.f35234p = 0.8f;
                    z8Var.g(21);
                    if (pnVar != null) {
                        pnVar.setAnimatedEmojiDrawable(null);
                        pnVar.h(null, null, z8Var, user);
                    }
                } else if (UserObject.isUserSelf(user) && qnVar.N3 == 3) {
                    z8Var.f35234p = 0.8f;
                    z8Var.g(22);
                    if (pnVar != null) {
                        pnVar.setAnimatedEmojiDrawable(null);
                        pnVar.h(null, null, z8Var, user);
                    }
                } else if (UserObject.isUserSelf(user)) {
                    z8Var.f35234p = 0.8f;
                    z8Var.g(1);
                    if (pnVar != null) {
                        pnVar.setAnimatedEmojiDrawable(null);
                        pnVar.h(null, null, z8Var, user);
                    }
                } else {
                    z8Var.f35234p = 1.0f;
                    if (pnVar != null) {
                        pnVar.setAnimatedEmojiDrawable(null);
                        pnVar.f31328a.setForUserOrChat(user, z8Var, null, true, 3, false);
                    }
                }
            } else if (ChatObject.isMonoForum(chat)) {
                long b10 = qnVar.b();
                if (ChatObject.canManageMonoForum(i11, chat) && b10 != 0) {
                    if (i9 > 0) {
                        TLRPC.User user2 = qnVar.getMessagesController().getUser(Long.valueOf(b10));
                        z8Var.r(user2);
                        pnVar.setAnimatedEmojiDrawable(null);
                        pnVar.e(user2, z8Var);
                    } else {
                        TLRPC.Chat chat2 = qnVar.getMessagesController().getChat(Long.valueOf(-b10));
                        z8Var.q(chat2);
                        pnVar.setAnimatedEmojiDrawable(null);
                        pnVar.e(chat2, z8Var);
                    }
                } else {
                    pnVar.setAnimatedEmojiDrawable(null);
                    vf.c.o(i11, chat, z8Var, pnVar);
                }
                pnVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            } else if (chat != null) {
                z8Var.f35234p = 1.0f;
                z8Var.k(i11, chat);
                if (pnVar != null) {
                    pnVar.setAnimatedEmojiDrawable(null);
                    pnVar.e(chat, z8Var);
                    if (chat.forum) {
                        if (ChatObject.hasStories(chat)) {
                            f10 = 11.0f;
                        } else {
                            f10 = 16.0f;
                        }
                        dp = AndroidUtilities.dp(f10);
                    } else {
                        dp = AndroidUtilities.dp(21.0f);
                    }
                    pnVar.setRoundRadius(dp);
                }
            }
        }
    }

    public final i5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        i5 i5Var = this.f32729c0;
        i5Var.j(j10, false);
        i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.W)));
        int dp = AndroidUtilities.dp(1.0f);
        i5Var.E = 0;
        i5Var.F = dp;
        return i5Var;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(this.F).getConnectionState();
            if (this.R != connectionState) {
                this.R = connectionState;
                l();
            }
        } else if (i9 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.zk zkVar = this.h;
            if (zkVar != null) {
                zkVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i9 == NotificationCenter.savedMessagesDialogsUpdate) {
            n(true);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.f32730d0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (view == this.f32731e) {
            boolean z11 = false;
            ImageView imageView = this.f32748w;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f32749x;
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
                    float width = (imageView.getWidth() / 2.0f) + imageView.getX();
                    float height = (imageView.getHeight() / 2.0f) + imageView.getY();
                    canvas.drawCircle(width, height - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.f6.Il);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.f6.Il);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tn.e(boolean, boolean):void");
    }

    public final void g(int i9, boolean z10) {
        b11 b11Var = this.B;
        if (b11Var != null) {
            boolean z11 = this.f32736h0;
            if (i9 == 0 && !this.P) {
                return;
            }
            td.a aVar = this.f32724a;
            if (!z11) {
                aVar.a(true, z10);
                b11Var.b(i9);
                return;
            }
            aVar.a(false, z10);
        }
    }

    public o9 getAvatarImageView() {
        return this.f32731e;
    }

    public int getLastSubtitleColorKey() {
        return this.T;
    }

    public int getLeftPadding() {
        return this.H;
    }

    public wt0 getSharedMediaPreloader() {
        return this.V;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.zk zkVar = this.f32746r;
        if (zkVar != null) {
            return zkVar.getTextPaint();
        }
        return this.f32747s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.zk zkVar = this.f32746r;
        if (zkVar != null) {
            return zkVar;
        }
        j6 j6Var = this.f32747s;
        if (j6Var != null) {
            return j6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f32748w;
    }

    public org.telegram.ui.ActionBar.h5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int dp;
        float f10 = 0.0f;
        org.telegram.ui.zk zkVar = this.h;
        if (zkVar != null) {
            f10 = Math.max(0.0f, zkVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.zk zkVar2 = this.f32746r;
        if (zkVar2 != null) {
            f10 = Math.max(f10, zkVar2.getExactWidthIncludeDrawables());
        }
        pn pnVar = this.f32731e;
        if (pnVar != null && pnVar.getVisibility() == 0) {
            dp = AndroidUtilities.dp(70.0f);
        } else {
            dp = AndroidUtilities.dp(34.0f);
        }
        return (int) (f10 + dp);
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.f32738j0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
                this.f32742n0 = mutate;
                int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.W);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
                Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
                this.f32743o0 = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ah, this.W), mode));
                this.h.j(new fq(this.f32742n0, this.f32743o0));
                this.f32737i0 = true;
                this.f32740l0 = LocaleController.getString(R.string.AccDescrVerified);
            } else if (this.h.getRightDrawable() instanceof il0) {
                this.h.j(null);
                this.f32737i0 = false;
                this.f32740l0 = null;
            }
        } else {
            this.f32738j0 = true;
            if (!(this.h.getRightDrawable() instanceof il0)) {
                il0 il0Var = new il0(!z10 ? 1 : 0);
                il0Var.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B8, this.W));
                this.h.j(il0Var);
                this.f32740l0 = LocaleController.getString(R.string.ScamMessage);
                this.f32737i0 = true;
            }
        }
        if (!z13 && DialogObject.getEmojiStatusDocumentId(emojiStatus) == 0) {
            this.h.i(null);
            this.f32739k0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof j5) && (((j5) this.h.getRightDrawable()).f29635a instanceof k5)) {
                ((k5) ((j5) this.h.getRightDrawable()).f29635a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f32727b0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.m0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.W), PorterDuff.Mode.MULTIPLY));
                this.f32727b0.g(this.m0, z14);
            } else {
                this.f32727b0.g(null, z14);
            }
            this.f32727b0.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.W)));
            this.h.i(this.f32727b0);
            this.f32737i0 = false;
            this.f32739k0 = LocaleController.getString(R.string.AccDescrPremium);
        }
        org.telegram.ui.ActionBar.k kVar = this.f32745q0;
        if (kVar != null) {
            kVar.e(z14);
        }
    }

    public final void i(int i9, int i10) {
        this.h.setTextColor(i9);
        org.telegram.ui.zk zkVar = this.f32746r;
        zkVar.setTextColor(i10);
        zkVar.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.zk zkVar = this.h;
        zkVar.setLeftDrawable(drawable);
        if (!this.f32737i0 && !this.f32738j0) {
            if (drawable2 != null) {
                this.f32740l0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.f32740l0 = null;
            }
            zkVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.f32745q0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i9 = this.F;
        z8 z8Var = this.E;
        z8Var.m(i9, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        pn pnVar = this.f32731e;
        if (isReplyUser) {
            z8Var.g(12);
            z8Var.f35234p = 0.8f;
            if (pnVar != null) {
                pnVar.h(null, null, z8Var, user);
            }
        } else if (UserObject.isAnonymous(user)) {
            z8Var.g(21);
            z8Var.f35234p = 0.8f;
            if (pnVar != null) {
                pnVar.h(null, null, z8Var, user);
            }
        } else if (UserObject.isUserSelf(user) && !z10) {
            z8Var.g(1);
            z8Var.f35234p = 0.8f;
            if (pnVar != null) {
                pnVar.h(null, null, z8Var, user);
            }
        } else {
            z8Var.f35234p = 1.0f;
            if (pnVar != null) {
                pnVar.e(user, z8Var);
            }
        }
    }

    public final void l() {
        String str;
        int i9 = this.R;
        if (i9 == 2) {
            str = LocaleController.getString(R.string.WaitingForNetwork);
        } else if (i9 == 1) {
            str = LocaleController.getString(R.string.Connecting);
        } else if (i9 == 5) {
            str = LocaleController.getString(R.string.Updating);
        } else if (i9 == 4) {
            str = LocaleController.getString(R.string.ConnectingToProxy);
        } else {
            str = null;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.W;
        j6 j6Var = this.f32747s;
        org.telegram.ui.zk zkVar = this.f32746r;
        if (str == null) {
            CharSequence charSequence = this.S;
            if (charSequence != null) {
                if (zkVar != null) {
                    zkVar.k(charSequence);
                    this.S = null;
                    Integer num = this.U;
                    if (num != null) {
                        zkVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.T;
                        if (i10 >= 0) {
                            zkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                            zkVar.setTag(Integer.valueOf(this.T));
                        }
                    }
                } else if (j6Var != null) {
                    j6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.S = null;
                    Integer num2 = this.U;
                    if (num2 != null) {
                        j6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.T;
                        if (i11 >= 0) {
                            j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
                            j6Var.setTag(Integer.valueOf(this.T));
                        }
                    }
                }
            }
        } else if (zkVar != null) {
            if (this.S == null) {
                this.S = zkVar.getText();
            }
            zkVar.k(str);
            Integer num3 = this.U;
            if (num3 != null) {
                zkVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.f6.B8;
                zkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
                zkVar.setTag(Integer.valueOf(i12));
            }
        } else if (j6Var != null) {
            if (this.S == null) {
                this.S = j6Var.getText();
            }
            j6Var.c(str, !LocaleController.isRTL, true);
            Integer num4 = this.U;
            if (num4 != null) {
                j6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.f6.B8;
                j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
                j6Var.setTag(Integer.valueOf(i13));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.f32745q0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.qn qnVar = this.C;
        if (qnVar != null) {
            this.Q = 0;
            TLRPC.ChatFull chatFull = qnVar.V7;
            if (chatFull != null) {
                int i9 = this.F;
                int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (z10 && chatFull.participants_count > 200) {
                        this.Q = chatFull.online_count;
                        return;
                    }
                    return;
                }
                for (int i10 = 0; i10 < chatFull.participants.participants.size(); i10++) {
                    TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
                    if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f22527id == UserConfig.getInstance(i9).getClientUserId()) && user.status.expires > 10000)) {
                        this.Q++;
                    }
                }
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11;
        int i9;
        boolean[] zArr;
        boolean z12;
        int i10;
        String formatPluralString;
        TLRPC.ChatParticipants chatParticipants;
        int i11;
        String formatShortNumber;
        int i12;
        int i13;
        int i14;
        String formatString;
        String str;
        String string;
        int i15;
        CharSequence charSequence;
        int i16;
        org.telegram.ui.ActionBar.b6 b6Var = this.W;
        boolean[] zArr2 = this.N;
        j6 j6Var = this.f32747s;
        org.telegram.ui.zk zkVar = this.f32746r;
        org.telegram.ui.zk zkVar2 = this.h;
        int i17 = this.F;
        org.telegram.ui.qn qnVar = this.C;
        if (qnVar != null) {
            if (qnVar.N3 == 6) {
                String str2 = qnVar.L3.link;
                pf.u[] uVarArr = pf.u.f45787e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                setSubtitle(str2);
                return;
            }
            TLRPC.User i18 = qnVar.i();
            TLRPC.Chat chat = qnVar.f41890e;
            if (UserObject.isUserSelf(i18) && qnVar.N3 == 0 && qnVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.f32744p0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((UserObject.isUserSelf(i18) && !z11) || UserObject.isReplyUser(i18) || ((i18 != null && i18.f22527id == 489000) || ((i9 = qnVar.N3) != 0 && i9 != 8))) && qnVar.N3 != 3) {
                if (getSubtitleTextView().getVisibility() != 8) {
                    getSubtitleTextView().setVisibility(8);
                    return;
                }
                return;
            }
            if (z11) {
                if (getSubtitleTextView().getVisibility() != 0) {
                    i16 = 0;
                    getSubtitleTextView().setVisibility(0);
                } else {
                    i16 = 0;
                }
                if (!this.f32744p0) {
                    MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i16) + 1).apply();
                    this.f32744p0 = true;
                }
            }
            CharSequence printingString = MessagesController.getInstance(i17).getPrintingString(qnVar.a(), qnVar.Z3, false);
            if (printingString == null) {
                UserObject.isBotForum(i18);
            }
            CharSequence charSequence2 = "";
            if (printingString != null) {
                printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z13 = z11;
            if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                if (qnVar.F9() && zkVar2.getTag() != null) {
                    zkVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.M;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.M = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.M = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(zkVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.M.addListener(new sn(this, 1));
                        this.M.setDuration(180L);
                        this.M.start();
                    } else {
                        zkVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer printingStringType = MessagesController.getInstance(i17).getPrintingStringType(qnVar.a(), qnVar.Z3);
                if (printingStringType != null && printingStringType.intValue() == 5) {
                    charSequence = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
                } else {
                    charSequence = printingString;
                }
                setTypingAnimation(true);
                z12 = true;
                str = charSequence;
            } else if (qnVar.F9() && !qnVar.f41882d4) {
                if (zkVar2.getTag() == null) {
                    zkVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.M;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.M = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.M = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(zkVar2, property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.M.addListener(new sn(this, 0));
                        this.M.setDuration(180L);
                        this.M.start();
                        return;
                    }
                    zkVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i19 = qnVar.N3;
                if (i19 == 8) {
                    if (qnVar.P3) {
                        charSequence2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    } else if (qnVar.b() == 0) {
                        int topicsCount = qnVar.getMessagesController().getTopicsController().getTopicsCount(-qnVar.a());
                        if (topicsCount > 0) {
                            string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                        } else {
                            string = LocaleController.getString(R.string.ChatMessageSuggestions);
                        }
                        charSequence2 = string;
                    } else {
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i17).getTopicsController().findTopic(chat.f22380id, qnVar.b());
                        if (findTopic != null) {
                            i14 = findTopic.totalMessagesCount;
                        } else {
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            z12 = false;
                            formatString = LocaleController.formatPluralString("messages", i14, Integer.valueOf(i14));
                        } else {
                            z12 = false;
                            formatString = LocaleController.formatString(R.string.TopicProfileStatus, vf.c.i(chat, i17, false));
                        }
                        str = formatString;
                    }
                    z12 = false;
                    str = charSequence2;
                } else {
                    if (i19 == 3) {
                        charSequence2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, qnVar.getMessagesController().getSavedMessagesController().getMessagesCount(qnVar.I8())), new Object[0]);
                    } else {
                        if (qnVar.f41882d4 && chat != null) {
                            TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i17).getTopicsController().findTopic(chat.f22380id, qnVar.b());
                            if (findTopic2 != null) {
                                i12 = 1;
                                i13 = findTopic2.totalMessagesCount - 1;
                            } else {
                                i12 = 1;
                                i13 = 0;
                            }
                            if (i13 > 0) {
                                Object[] objArr = new Object[i12];
                                objArr[0] = Integer.valueOf(i13);
                                formatPluralString = LocaleController.formatPluralString("messages", i13, objArr);
                            } else {
                                int i20 = R.string.TopicProfileStatus;
                                Object[] objArr2 = new Object[i12];
                                objArr2[0] = chat.title;
                                formatPluralString = LocaleController.formatString(i20, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = qnVar.V7;
                            int i21 = this.Q;
                            if (ChatObject.isChannel(chat)) {
                                if (chatFull != null && (i11 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i21 > 1) {
                                            formatPluralString = aa.d.z(LocaleController.formatPluralString("Members", i11, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i21, chatFull.participants_count), new Object[0]));
                                        } else {
                                            formatPluralString = LocaleController.formatPluralString("Members", i11, new Object[0]);
                                        }
                                    } else {
                                        int[] iArr = new int[1];
                                        boolean isAccessibilityScreenReaderEnabled = AndroidUtilities.isAccessibilityScreenReaderEnabled();
                                        int i22 = chatFull.participants_count;
                                        if (isAccessibilityScreenReaderEnabled) {
                                            iArr[0] = i22;
                                            formatShortNumber = String.valueOf(i22);
                                        } else {
                                            formatShortNumber = LocaleController.formatShortNumber(i22, iArr);
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
                                int i23 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i23 = chatParticipants.participants.size();
                                }
                                if (i21 > 1 && i23 != 0) {
                                    formatPluralString = aa.d.z(LocaleController.formatPluralString("Members", i23, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i21, new Object[0]));
                                } else {
                                    formatPluralString = LocaleController.formatPluralString("Members", i23, new Object[0]);
                                }
                            }
                        } else if (i18 != null) {
                            TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(i18.f22527id));
                            if (user != null) {
                                i18 = user;
                            }
                            if (!UserObject.isReplyUser(i18)) {
                                long j10 = i18.f22527id;
                                if (j10 != 489000) {
                                    if (j10 == UserConfig.getInstance(i17).getClientUserId()) {
                                        charSequence2 = z13 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                    } else {
                                        long j11 = i18.f22527id;
                                        if (j11 != 333000 && j11 != 777000 && j11 != 42777) {
                                            if (MessagesController.isSupportUser(i18)) {
                                                charSequence2 = LocaleController.getString(R.string.SupportStatus);
                                            } else {
                                                boolean z14 = i18.bot;
                                                if (z14 && (i10 = i18.bot_active_users) != 0) {
                                                    charSequence2 = LocaleController.formatPluralStringComma("BotUsers", i10, ',');
                                                } else if (z14) {
                                                    charSequence2 = LocaleController.getString(R.string.Bot);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f32725a0) {
                                                        zArr = this.O;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    String formatUserStatus = LocaleController.formatUserStatus(i17, i18, zArr2, zArr);
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
                i15 = org.telegram.ui.ActionBar.f6.f23214pa;
            } else {
                i15 = org.telegram.ui.ActionBar.f6.B8;
            }
            this.T = i15;
            if (this.S == null) {
                if (zkVar != null) {
                    zkVar.k(str);
                    Integer num = this.U;
                    if (num == null) {
                        zkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(this.T, b6Var));
                        zkVar.setTag(Integer.valueOf(this.T));
                    } else {
                        zkVar.setTextColor(num.intValue());
                    }
                } else {
                    j6Var.c(str, z10, true);
                    Integer num2 = this.U;
                    if (num2 == null) {
                        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(this.T, b6Var));
                        j6Var.setTag(Integer.valueOf(this.T));
                    } else {
                        j6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.S = str;
            }
            org.telegram.ui.ActionBar.k kVar = this.f32745q0;
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
        org.telegram.ui.qn qnVar = this.C;
        if (qnVar != null) {
            int i9 = this.F;
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (qnVar.N3 == 3) {
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.R = ConnectionsManager.getInstance(i9).getConnectionState();
            l();
        }
        i5 i5Var = this.f32727b0;
        if (i5Var != null) {
            i5Var.a();
        }
        i5 i5Var2 = this.f32729c0;
        if (i5Var2 != null) {
            i5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.qn qnVar = this.C;
        if (qnVar != null) {
            int i9 = this.F;
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (qnVar.N3 == 3) {
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        i5 i5Var = this.f32727b0;
        if (i5Var != null) {
            i5Var.b();
        }
        i5 i5Var2 = this.f32729c0;
        if (i5Var2 != null) {
            i5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f32739k0 != null) {
            sb2.append(", ");
            sb2.append(this.f32739k0);
        }
        if (this.f32740l0 != null) {
            sb2.append(", ");
            sb2.append(this.f32740l0);
        }
        sb2.append("\n");
        org.telegram.ui.zk zkVar = this.f32746r;
        if (zkVar != null) {
            sb2.append(zkVar.getText());
        } else {
            j6 j6Var = this.f32747s;
            if (j6Var != null) {
                sb2.append(j6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.OpenProfile)));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        pn pnVar = this.f32731e;
        int measuredHeight = ((currentActionBarHeight - pnVar.getMeasuredHeight()) - 2) / 2;
        if (this.G) {
            i13 = AndroidUtilities.statusBarHeight;
        } else {
            i13 = 0;
        }
        int i14 = measuredHeight + i13;
        if (this.f32735g0) {
            f10 = 23.66f;
        } else {
            f10 = 24.0f;
        }
        int dp = AndroidUtilities.dp(f10) + i14;
        int i15 = this.H + 1;
        int i16 = i14 + 1;
        pnVar.layout(i15, i16, pnVar.getMeasuredWidth() + i15, pnVar.getMeasuredHeight() + i16);
        int i17 = this.H;
        if (pnVar.getVisibility() == 0) {
            if (this.f32735g0) {
                f11 = 49.66f;
            } else {
                f11 = 55.0f;
            }
        } else if (this.f32735g0) {
            f11 = 13.0f;
        } else {
            f11 = 1.0f;
        }
        int dp2 = i17 + AndroidUtilities.dp(f11) + this.I;
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.f32741n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.zk zkVar = this.h;
        if (visibility != 8) {
            zkVar.layout(dp2, (AndroidUtilities.dp(1.66f) + i14) - zkVar.getPaddingTop(), zkVar.getMeasuredWidth() + dp2, zkVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (zkVar.getTextHeight() + i14)) - zkVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(dp2, AndroidUtilities.dp(1.66f) + i14, h5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + h5Var.getTextHeight() + i14);
            }
        } else {
            zkVar.layout(dp2, (AndroidUtilities.dp(11.0f) + i14) - zkVar.getPaddingTop(), zkVar.getMeasuredWidth() + dp2, zkVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (zkVar.getTextHeight() + i14)) - zkVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(dp2, AndroidUtilities.dp(10.0f) + i14, h5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + h5Var.getTextHeight() + i14);
            }
        }
        ImageView imageView = this.f32749x;
        if (imageView != null) {
            int i18 = this.H;
            imageView.layout(AndroidUtilities.dp(29.0f) + i18, AndroidUtilities.dp(27.33f) + i14, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.H, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + i14);
        }
        ImageView imageView2 = this.f32748w;
        if (imageView2 != null) {
            int i19 = this.H;
            imageView2.layout(AndroidUtilities.dp(19.333f) + i19, i14 - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.H, imageView2.getMeasuredHeight() + (i14 - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.f32750y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.H, AndroidUtilities.dp(24.0f) + i14, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.H, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i14);
        }
        ImageView imageView4 = this.A;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.H, AndroidUtilities.dp(24.0f) + i14, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.H, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i14);
        }
        org.telegram.ui.zk zkVar2 = this.f32746r;
        if (zkVar2 != null) {
            zkVar2.layout(dp2, dp, zkVar2.getMeasuredWidth() + dp2, zkVar2.getTextHeight() + dp);
        } else {
            j6 j6Var = this.f32747s;
            if (j6Var != null) {
                j6Var.layout(dp2, dp, j6Var.getMeasuredWidth() + dp2, j6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) this.v.get();
        if (h5Var2 != null) {
            h5Var2.layout(dp2, dp, h5Var2.getMeasuredWidth() + dp2, h5Var2.getTextHeight() + dp);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i9);
        pn pnVar = this.f32731e;
        int i12 = 0;
        if (pnVar.getVisibility() == 0) {
            i11 = 54;
        } else {
            i11 = 0;
        }
        int dp = size - AndroidUtilities.dp(i11 + 16);
        float f12 = this.d;
        pnVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f12) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f12) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.zk zkVar = this.h;
        zkVar.measure(makeMeasureSpec, makeMeasureSpec2);
        j6 j6Var = this.f32747s;
        org.telegram.ui.zk zkVar2 = this.f32746r;
        if (zkVar2 != null) {
            zkVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (j6Var != null) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f32749x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f32748w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.f32750y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.A;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i10));
        int i13 = this.K;
        AtomicReference atomicReference = this.f32741n;
        if (i13 != -1 && i13 != size && i13 > size) {
            this.L = i13;
            View view = (org.telegram.ui.ActionBar.h5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference.set(h5Var);
            int i14 = org.telegram.ui.ActionBar.f6.A8;
            org.telegram.ui.ActionBar.b6 b6Var = this.W;
            h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
            if (this.f32735g0) {
                f10 = 17.5f;
            } else {
                f10 = 18.0f;
            }
            h5Var.setTextSizePx(AndroidUtilities.dp(f10));
            h5Var.setGravity(3);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            h5Var.i(zkVar.getRightDrawable());
            h5Var.j(zkVar.getRightDrawable2());
            h5Var.setRightDrawableOutside(zkVar.getRightDrawableOutside());
            h5Var.setLeftDrawable(zkVar.getLeftDrawable());
            h5Var.l(zkVar.getText(), false);
            ViewPropertyAnimator duration = h5Var.animate().alpha(0.0f).setDuration(350L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new mn(this, 0)).start();
            addView(h5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference2.set(h5Var2);
            int i15 = org.telegram.ui.ActionBar.f6.B8;
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var));
            h5Var2.setTag(Integer.valueOf(i15));
            if (this.f32735g0) {
                f11 = 13.5f;
            } else {
                f11 = 14.0f;
            }
            h5Var2.setTextSizePx(AndroidUtilities.dp(f11));
            h5Var2.setGravity(3);
            if (zkVar2 != null) {
                h5Var2.l(zkVar2.getText(), false);
            } else if (j6Var != null) {
                h5Var2.l(j6Var.getText(), false);
            }
            h5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).withEndAction(new mn(this, 1)).start();
            addView(h5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = (org.telegram.ui.ActionBar.h5) atomicReference.get();
        if (h5Var3 != null) {
            int i16 = this.L;
            if (pnVar.getVisibility() == 0) {
                i12 = 54;
            }
            h5Var3.measure(org.telegram.messenger.ll.d(i12 + 16, i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.K = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        pc pcVar = this.f32730d0;
        mn mnVar = this.f32732e0;
        if (action == 0 && a()) {
            this.f32734f0 = true;
            pcVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(mnVar);
            AndroidUtilities.runOnUIThread(mnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f32734f0) {
            pcVar.c(false);
            this.f32734f0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(mnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f32745q0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f10;
        int i9 = this.F;
        z8 z8Var = this.E;
        z8Var.k(i9, chat);
        pn pnVar = this.f32731e;
        if (pnVar != null) {
            pnVar.e(chat, z8Var);
            if (ChatObject.isForum(chat)) {
                if (ChatObject.hasStories(chat)) {
                    f10 = 11.0f;
                } else {
                    f10 = 16.0f;
                }
            } else {
                f10 = 21.0f;
            }
            pnVar.setRoundRadius(AndroidUtilities.dp(f10));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i9;
        ImageView imageView = this.f32749x;
        if (imageView != null) {
            if (z10 && !this.f32733f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            imageView.setVisibility(i9);
        }
    }

    public void setLeftPadding(int i9) {
        this.H = i9;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.G = z10;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.U = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f32730d0.c(z10);
    }

    public void setRightAvatarPadding(int i9) {
        this.I = i9;
    }

    public void setStoriesForceState(Integer num) {
        this.f32728c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.S == null) {
            org.telegram.ui.zk zkVar = this.f32746r;
            if (zkVar != null) {
                zkVar.k(charSequence);
            } else {
                j6 j6Var = this.f32747s;
                if (j6Var != null) {
                    j6Var.setText(charSequence);
                }
            }
        } else {
            this.S = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.f32745q0;
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
    public final void B(float f10, int i9) {
    }
}
