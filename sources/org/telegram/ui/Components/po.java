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
public class po extends FrameLayout implements oe.d, NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public final ImageView E;
    public final f31 F;
    public final org.telegram.ui.wn G;
    public final sx0[] H;
    public final j9 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public sx0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final oe.b f31649a;
    public int f31650a0;
    public boolean f31651b;
    public Integer f31652b0;
    public Integer f31653c;
    public final tv0 f31654c0;
    public final int d;
    public final org.telegram.ui.ActionBar.u6 f31655d0;
    public final lo e;
    public boolean f31656e0;
    public final boolean f31657f;
    public final r5 f31658f0;
    public final r5 f31659g0;
    public final org.telegram.ui.hl h;
    public final xc f31660h0;
    public final io f31661i0;
    public boolean f31662j0;
    public boolean f31663k0;
    public boolean f31664l0;
    public boolean m0;
    public final AtomicReference f31665n;
    public boolean f31666n0;
    public String f31667o0;
    public String f31668p0;
    public Drawable f31669q0;
    public final org.telegram.ui.hl f31670r;
    public Drawable f31671r0;
    public final s6 f31672s;
    public Drawable f31673s0;
    public boolean f31674t0;
    public PorterDuffColorFilter f31675u0;
    public final AtomicReference v;
    public PorterDuffColorFilter f31676v0;
    public final ImageView f31677w;
    public int f31678w0;
    public final ImageView f31679x;
    public int f31680x0;
    public final ImageView f31681y;
    public org.telegram.ui.ActionBar.k f31682y0;

    public po(android.content.Context r22, org.telegram.ui.ActionBar.r2 r23, boolean r24, org.telegram.ui.ActionBar.u6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.po.<init>(android.content.Context, org.telegram.ui.ActionBar.r2, boolean, org.telegram.ui.ActionBar.u6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.wn wnVar = this.G;
        org.telegram.ui.hl hlVar = this.f31670r;
        if (hlVar != null) {
            int i10 = 0;
            sx0[] sx0VarArr = this.H;
            if (z10) {
                try {
                    int intValue = MessagesController.getInstance(this.J).getPrintingStringType(wnVar.a(), wnVar.f45241p4).intValue();
                    sx0 sx0Var = sx0VarArr[intValue];
                    if (sx0Var != null) {
                        org.telegram.ui.ActionBar.u6 u6Var = this.f31655d0;
                        if (intValue == 5) {
                            hlVar.g(sx0Var, "**oo**");
                            sx0VarArr[intValue].b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23585pa, u6Var));
                            hlVar.setLeftDrawable((Drawable) null);
                        } else {
                            hlVar.g(null, null);
                            sx0VarArr[intValue].b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23585pa, u6Var));
                            hlVar.setLeftDrawable(sx0VarArr[intValue]);
                        }
                        this.N = sx0VarArr[intValue];
                        while (i10 < sx0VarArr.length) {
                            sx0 sx0Var2 = sx0VarArr[i10];
                            if (sx0Var2 != null) {
                                if (i10 == intValue) {
                                    sx0Var2.d();
                                } else {
                                    sx0Var2.e();
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
            hlVar.setLeftDrawable((Drawable) null);
            hlVar.g(null, null);
            while (i10 < sx0VarArr.length) {
                sx0 sx0Var3 = sx0VarArr[i10];
                if (sx0Var3 != null) {
                    sx0Var3.e();
                }
                i10++;
            }
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        ImageView imageView;
        int i11;
        if (i10 == 0 && (imageView = this.f31677w) != null) {
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
        org.telegram.ui.wn wnVar = this.G;
        if (wnVar != null) {
            TLRPC.User i11 = wnVar.i();
            TLRPC.Chat chat = wnVar.e;
            if (wnVar.f45091d4 == 3) {
                long V8 = wnVar.V8();
                if (V8 >= 0) {
                    user = wnVar.getMessagesController().getUser(Long.valueOf(V8));
                    chat = null;
                } else {
                    chat = wnVar.getMessagesController().getChat(Long.valueOf(-V8));
                    user = null;
                }
            } else {
                user = i11;
            }
            int i12 = this.J;
            j9 j9Var = this.I;
            lo loVar = this.e;
            if (user != null) {
                j9Var.m(i12, user);
                if (UserObject.isReplyUser(user)) {
                    j9Var.f29558p = 0.8f;
                    j9Var.g(12);
                    if (loVar != null) {
                        loVar.setAnimatedEmojiDrawable(null);
                        loVar.h(null, null, j9Var, user);
                    }
                } else if (UserObject.isAnonymous(user)) {
                    j9Var.f29558p = 0.8f;
                    j9Var.g(21);
                    if (loVar != null) {
                        loVar.setAnimatedEmojiDrawable(null);
                        loVar.h(null, null, j9Var, user);
                    }
                } else if (UserObject.isUserSelf(user) && wnVar.f45091d4 == 3) {
                    j9Var.f29558p = 0.8f;
                    j9Var.g(22);
                    if (loVar != null) {
                        loVar.setAnimatedEmojiDrawable(null);
                        loVar.h(null, null, j9Var, user);
                    }
                } else if (UserObject.isUserSelf(user)) {
                    j9Var.f29558p = 0.8f;
                    j9Var.g(1);
                    if (loVar != null) {
                        loVar.setAnimatedEmojiDrawable(null);
                        loVar.h(null, null, j9Var, user);
                    }
                } else {
                    j9Var.f29558p = 1.0f;
                    if (loVar != null) {
                        loVar.setAnimatedEmojiDrawable(null);
                        loVar.f35004a.setForUserOrChat(user, j9Var, null, true, 3, false);
                    }
                }
            } else if (ChatObject.isMonoForum(chat)) {
                long b10 = wnVar.b();
                if (ChatObject.canManageMonoForum(i12, chat) && b10 != 0) {
                    if (i10 > 0) {
                        TLRPC.User user2 = wnVar.getMessagesController().getUser(Long.valueOf(b10));
                        j9Var.r(user2);
                        loVar.setAnimatedEmojiDrawable(null);
                        loVar.f(user2, j9Var);
                    } else {
                        TLRPC.Chat chat2 = wnVar.getMessagesController().getChat(Long.valueOf(-b10));
                        j9Var.q(chat2);
                        loVar.setAnimatedEmojiDrawable(null);
                        loVar.f(chat2, j9Var);
                    }
                } else {
                    loVar.setAnimatedEmojiDrawable(null);
                    pg.d.o(i12, chat, j9Var, loVar);
                }
                loVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            } else if (chat != null) {
                j9Var.f29558p = 1.0f;
                j9Var.k(i12, chat);
                if (loVar != null) {
                    loVar.setAnimatedEmojiDrawable(null);
                    loVar.f(chat, j9Var);
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
                    loVar.setRoundRadius(dp);
                }
            }
        }
    }

    public final r5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        r5 r5Var = this.f31659g0;
        r5Var.j(j10, false);
        r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, this.f31655d0)));
        int dp = AndroidUtilities.dp(1.0f);
        r5Var.I = 0;
        r5Var.J = dp;
        return r5Var;
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
            org.telegram.ui.hl hlVar = this.h;
            if (hlVar != null) {
                hlVar.invalidate();
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
        float a2 = this.f31660h0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (view == this.e) {
            boolean z11 = false;
            ImageView imageView = this.f31677w;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f31679x;
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.y6.Nl);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.y6.Nl);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.po.e(boolean, boolean):void");
    }

    public final void g(int i10, boolean z10) {
        f31 f31Var = this.F;
        if (f31Var != null) {
            boolean z11 = this.f31664l0;
            if (i10 == 0 && !this.T) {
                return;
            }
            oe.b bVar = this.f31649a;
            if (!z11) {
                bVar.a(true, z10);
                f31Var.b(i10);
                return;
            }
            bVar.a(false, z10);
        }
    }

    public y9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.f31650a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public tv0 getSharedMediaPreloader() {
        return this.f31654c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.hl hlVar = this.f31670r;
        if (hlVar != null) {
            return hlVar.getTextPaint();
        }
        return this.f31672s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.hl hlVar = this.f31670r;
        if (hlVar != null) {
            return hlVar;
        }
        s6 s6Var = this.f31672s;
        if (s6Var != null) {
            return s6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f31677w;
    }

    public org.telegram.ui.ActionBar.b6 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int dp;
        float f7 = 0.0f;
        org.telegram.ui.hl hlVar = this.h;
        if (hlVar != null) {
            f7 = Math.max(0.0f, hlVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.hl hlVar2 = this.f31670r;
        if (hlVar2 != null) {
            f7 = Math.max(f7, hlVar2.getExactWidthIncludeDrawables());
        }
        lo loVar = this.e;
        if (loVar != null && loVar.getVisibility() == 0) {
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
        this.f31666n0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
                this.f31671r0 = mutate;
                int i10 = org.telegram.ui.ActionBar.y6.f23777zh;
                org.telegram.ui.ActionBar.u6 u6Var = this.f31655d0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.f7.y(this, mutate, i10, u6Var, mode);
                Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
                this.f31673s0 = mutate2;
                org.telegram.ui.ActionBar.f7.y(this, mutate2, org.telegram.ui.ActionBar.y6.Ah, this.f31655d0, mode);
                this.h.j(new ar(this.f31671r0, this.f31673s0));
                this.m0 = true;
                this.f31668p0 = LocaleController.getString(R.string.AccDescrVerified);
            } else if (this.h.getRightDrawable() instanceof fn0) {
                this.h.j(null);
                this.m0 = false;
                this.f31668p0 = null;
            }
        } else {
            this.f31666n0 = true;
            if (!(this.h.getRightDrawable() instanceof fn0)) {
                fn0 fn0Var = new fn0(!z10 ? 1 : 0);
                fn0Var.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, this.f31655d0));
                this.h.j(fn0Var);
                this.f31668p0 = LocaleController.getString(R.string.ScamMessage);
                this.m0 = true;
            }
        }
        if (!z13 && DialogObject.getEmojiStatusDocumentId(emojiStatus) == 0) {
            this.h.i(null);
            this.f31667o0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof s5) && (((s5) this.h.getRightDrawable()).f32472a instanceof t5)) {
                ((t5) ((s5) this.h.getRightDrawable()).f32472a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f31658f0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.f31669q0 = mutate3;
                org.telegram.ui.ActionBar.f7.y(this, mutate3, org.telegram.ui.ActionBar.y6.f23777zh, this.f31655d0, PorterDuff.Mode.MULTIPLY);
                this.f31658f0.g(this.f31669q0, z14);
            } else {
                this.f31658f0.g(null, z14);
            }
            this.f31658f0.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, this.f31655d0)));
            this.h.i(this.f31658f0);
            this.m0 = false;
            this.f31667o0 = LocaleController.getString(R.string.AccDescrPremium);
        }
        org.telegram.ui.ActionBar.k kVar = this.f31682y0;
        if (kVar != null) {
            kVar.d(z14);
        }
    }

    public final void i(int i10, int i11) {
        org.telegram.ui.hl hlVar = this.h;
        org.telegram.ui.ActionBar.f7.r(hlVar);
        org.telegram.ui.hl hlVar2 = this.f31670r;
        org.telegram.ui.ActionBar.f7.r(hlVar2);
        hlVar.setTextColor(i10);
        hlVar2.setTextColor(i11);
        hlVar2.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.hl hlVar = this.h;
        hlVar.setLeftDrawable(drawable);
        if (!this.m0 && !this.f31666n0) {
            if (drawable2 != null) {
                this.f31668p0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.f31668p0 = null;
            }
            hlVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.f31682y0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        j9 j9Var = this.I;
        j9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        lo loVar = this.e;
        if (isReplyUser) {
            j9Var.g(12);
            j9Var.f29558p = 0.8f;
            if (loVar != null) {
                loVar.h(null, null, j9Var, user);
            }
        } else if (UserObject.isAnonymous(user)) {
            j9Var.g(21);
            j9Var.f29558p = 0.8f;
            if (loVar != null) {
                loVar.h(null, null, j9Var, user);
            }
        } else if (UserObject.isUserSelf(user) && !z10) {
            j9Var.g(1);
            j9Var.f29558p = 0.8f;
            if (loVar != null) {
                loVar.h(null, null, j9Var, user);
            }
        } else {
            j9Var.f29558p = 1.0f;
            if (loVar != null) {
                loVar.f(user, j9Var);
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
        org.telegram.ui.ActionBar.u6 u6Var = this.f31655d0;
        s6 s6Var = this.f31672s;
        org.telegram.ui.hl hlVar = this.f31670r;
        if (str == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (hlVar != null) {
                    hlVar.k(charSequence);
                    this.W = null;
                    Integer num = this.f31652b0;
                    if (num != null) {
                        hlVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.f31650a0;
                        if (i11 >= 0) {
                            org.telegram.ui.ActionBar.f7.Y(hlVar, i11, u6Var);
                            hlVar.setTag(Integer.valueOf(this.f31650a0));
                        }
                    }
                } else if (s6Var != null) {
                    s6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.f31652b0;
                    if (num2 != null) {
                        s6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.f31650a0;
                        if (i12 >= 0) {
                            org.telegram.ui.ActionBar.f7.Z(s6Var, i12, u6Var);
                            s6Var.setTag(Integer.valueOf(this.f31650a0));
                        }
                    }
                }
            }
        } else if (hlVar != null) {
            if (this.W == null) {
                this.W = hlVar.getText();
            }
            hlVar.k(str);
            Integer num3 = this.f31652b0;
            if (num3 != null) {
                hlVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.y6.B8;
                org.telegram.ui.ActionBar.f7.Y(hlVar, i13, u6Var);
                hlVar.setTag(Integer.valueOf(i13));
            }
        } else if (s6Var != null) {
            if (this.W == null) {
                this.W = s6Var.getText();
            }
            s6Var.c(str, !LocaleController.isRTL, true);
            Integer num4 = this.f31652b0;
            if (num4 != null) {
                s6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.y6.B8;
                org.telegram.ui.ActionBar.f7.Z(s6Var, i14, u6Var);
                s6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.f31682y0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.wn wnVar = this.G;
        if (wnVar != null) {
            this.U = 0;
            TLRPC.ChatFull chatFull = wnVar.f45245p8;
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
                    if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f22177id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
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
        org.telegram.ui.ActionBar.u6 u6Var = this.f31655d0;
        boolean[] zArr2 = this.R;
        s6 s6Var = this.f31672s;
        org.telegram.ui.hl hlVar = this.f31670r;
        org.telegram.ui.hl hlVar2 = this.h;
        int i18 = this.J;
        org.telegram.ui.wn wnVar = this.G;
        if (wnVar != null) {
            if (wnVar.f45091d4 == 6) {
                String str2 = wnVar.f45062b4.link;
                jg.z[] zVarArr = jg.z.e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                setSubtitle(str2);
                return;
            }
            TLRPC.User i19 = wnVar.i();
            TLRPC.Chat chat = wnVar.e;
            if (UserObject.isUserSelf(i19) && wnVar.f45091d4 == 0 && wnVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.f31674t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((UserObject.isUserSelf(i19) && !z11) || UserObject.isReplyUser(i19) || ((i19 != null && i19.f22177id == 489000) || ((i10 = wnVar.f45091d4) != 0 && i10 != 8))) && wnVar.f45091d4 != 3) {
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
                if (!this.f31674t0) {
                    MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i17) + 1).apply();
                    this.f31674t0 = true;
                }
            }
            CharSequence printingString = MessagesController.getInstance(i18).getPrintingString(wnVar.a(), wnVar.f45241p4, false);
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
                if (wnVar.R9() && hlVar2.getTag() != null) {
                    hlVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.Q;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.Q = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(hlVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.Q.addListener(new oo(this, 1));
                        this.Q.setDuration(180L);
                        this.Q.start();
                    } else {
                        hlVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer printingStringType = MessagesController.getInstance(i18).getPrintingStringType(wnVar.a(), wnVar.f45241p4);
                if (printingStringType != null && printingStringType.intValue() == 5) {
                    charSequence = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
                } else {
                    charSequence = printingString;
                }
                setTypingAnimation(true);
                z13 = true;
                str = charSequence;
            } else if (wnVar.R9() && !wnVar.f45290t4) {
                if (hlVar2.getTag() == null) {
                    hlVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.Q;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.Q = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(hlVar2, property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.Q.addListener(new oo(this, 0));
                        this.Q.setDuration(180L);
                        this.Q.start();
                        return;
                    }
                    hlVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = wnVar.f45091d4;
                if (i20 == 8) {
                    if (wnVar.f45118f4) {
                        charSequence2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    } else if (wnVar.b() == 0) {
                        int topicsCount = wnVar.getMessagesController().getTopicsController().getTopicsCount(-wnVar.a());
                        if (topicsCount > 0) {
                            string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                        } else {
                            string = LocaleController.getString(R.string.ChatMessageSuggestions);
                        }
                        charSequence2 = string;
                    } else {
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f22028id, wnVar.b());
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
                            formatString = LocaleController.formatString(R.string.TopicProfileStatus, pg.d.i(chat, i18, false));
                        }
                        str = formatString;
                    }
                    z13 = false;
                    str = charSequence2;
                } else {
                    if (i20 == 3) {
                        charSequence2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, wnVar.getMessagesController().getSavedMessagesController().getMessagesCount(wnVar.V8())), new Object[0]);
                    } else {
                        if (wnVar.f45290t4 && chat != null) {
                            TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f22028id, wnVar.b());
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
                            TLRPC.ChatFull chatFull = wnVar.f45245p8;
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
                                TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(i19.f22177id));
                                if (user != null) {
                                    i19 = user;
                                }
                                if (!UserObject.isReplyUser(i19)) {
                                    long j10 = i19.f22177id;
                                    if (j10 != 489000) {
                                        if (j10 == UserConfig.getInstance(i18).getClientUserId()) {
                                            charSequence2 = z14 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                        } else {
                                            long j11 = i19.f22177id;
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
                                                    if (this.f31656e0) {
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
                i16 = org.telegram.ui.ActionBar.y6.f23585pa;
            } else {
                i16 = org.telegram.ui.ActionBar.y6.B8;
            }
            this.f31650a0 = i16;
            if (this.W == null) {
                if (hlVar != null) {
                    hlVar.k(str);
                    Integer num = this.f31652b0;
                    if (num == null) {
                        org.telegram.ui.ActionBar.f7.Y(hlVar, this.f31650a0, u6Var);
                        hlVar.setTag(Integer.valueOf(this.f31650a0));
                    } else {
                        hlVar.setTextColor(num.intValue());
                    }
                } else {
                    s6Var.c(str, z10, true);
                    Integer num2 = this.f31652b0;
                    if (num2 == null) {
                        org.telegram.ui.ActionBar.f7.Z(s6Var, this.f31650a0, u6Var);
                        s6Var.setTag(Integer.valueOf(this.f31650a0));
                    } else {
                        s6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.W = str;
            }
            org.telegram.ui.ActionBar.k kVar = this.f31682y0;
            if (kVar != null) {
                kVar.d(z10);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.wn wnVar = this.G;
        if (wnVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
            if (wnVar.f45091d4 == 3) {
                NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        r5 r5Var = this.f31658f0;
        if (r5Var != null) {
            r5Var.a();
        }
        r5 r5Var2 = this.f31659g0;
        if (r5Var2 != null) {
            r5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.wn wnVar = this.G;
        if (wnVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (wnVar.f45091d4 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        r5 r5Var = this.f31658f0;
        if (r5Var != null) {
            r5Var.b();
        }
        r5 r5Var2 = this.f31659g0;
        if (r5Var2 != null) {
            r5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f31667o0 != null) {
            sb2.append(", ");
            sb2.append(this.f31667o0);
        }
        if (this.f31668p0 != null) {
            sb2.append(", ");
            sb2.append(this.f31668p0);
        }
        sb2.append("\n");
        org.telegram.ui.hl hlVar = this.f31670r;
        if (hlVar != null) {
            sb2.append(hlVar.getText());
        } else {
            s6 s6Var = this.f31672s;
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
        lo loVar = this.e;
        int measuredHeight = ((currentActionBarHeight - loVar.getMeasuredHeight()) - 2) / 2;
        if (this.K) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = measuredHeight + i14;
        if (this.f31663k0) {
            f7 = 23.66f;
        } else {
            f7 = 24.0f;
        }
        int dp = AndroidUtilities.dp(f7) + i15;
        int i16 = this.L + 1;
        int i17 = i15 + 1;
        loVar.layout(i16, i17, loVar.getMeasuredWidth() + i16, loVar.getMeasuredHeight() + i17);
        int i18 = this.L;
        if (loVar.getVisibility() == 0) {
            if (this.f31663k0) {
                f10 = 49.66f;
            } else {
                f10 = 55.0f;
            }
        } else if (this.f31663k0) {
            f10 = 13.0f;
        } else {
            f10 = 1.0f;
        }
        int dp2 = i18 + AndroidUtilities.dp(f10) + this.M;
        org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f31665n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.hl hlVar = this.h;
        if (visibility != 8) {
            hlVar.layout(dp2, (AndroidUtilities.dp(1.66f) + i15) - hlVar.getPaddingTop(), hlVar.getMeasuredWidth() + dp2, hlVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (hlVar.getTextHeight() + i15)) - hlVar.getPaddingTop()));
            if (b6Var != null) {
                b6Var.layout(dp2, AndroidUtilities.dp(1.66f) + i15, b6Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + b6Var.getTextHeight() + i15);
            }
        } else {
            hlVar.layout(dp2, (AndroidUtilities.dp(11.0f) + i15) - hlVar.getPaddingTop(), hlVar.getMeasuredWidth() + dp2, hlVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (hlVar.getTextHeight() + i15)) - hlVar.getPaddingTop()));
            if (b6Var != null) {
                b6Var.layout(dp2, AndroidUtilities.dp(10.0f) + i15, b6Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + b6Var.getTextHeight() + i15);
            }
        }
        ImageView imageView = this.f31679x;
        if (imageView != null) {
            imageView.layout(AndroidUtilities.dp(29.0f) + this.L, AndroidUtilities.dp(27.33f) + i15, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.L, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + i15);
        }
        ImageView imageView2 = this.f31677w;
        if (imageView2 != null) {
            imageView2.layout(AndroidUtilities.dp(19.333f) + this.L, i15 - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.L, imageView2.getMeasuredHeight() + (i15 - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.f31681y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        org.telegram.ui.hl hlVar2 = this.f31670r;
        if (hlVar2 != null) {
            hlVar2.layout(dp2, dp, hlVar2.getMeasuredWidth() + dp2, hlVar2.getTextHeight() + dp);
        } else {
            s6 s6Var = this.f31672s;
            if (s6Var != null) {
                s6Var.layout(dp2, dp, s6Var.getMeasuredWidth() + dp2, s6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) this.v.get();
        if (b6Var2 != null) {
            b6Var2.layout(dp2, dp, b6Var2.getMeasuredWidth() + dp2, b6Var2.getTextHeight() + dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        lo loVar = this.e;
        int i13 = 0;
        if (loVar.getVisibility() == 0) {
            i12 = 54;
        } else {
            i12 = 0;
        }
        int dp = size - AndroidUtilities.dp(i12 + 16);
        float f11 = this.d;
        loVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.hl hlVar = this.h;
        hlVar.measure(makeMeasureSpec, makeMeasureSpec2);
        s6 s6Var = this.f31672s;
        org.telegram.ui.hl hlVar2 = this.f31670r;
        if (hlVar2 != null) {
            hlVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (s6Var != null) {
            s6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f31679x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f31677w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.f31681y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i14 = this.O;
        AtomicReference atomicReference = this.f31665n;
        if (i14 != -1 && i14 != size && i14 > size) {
            this.P = i14;
            View view = (org.telegram.ui.ActionBar.b6) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(getContext());
            atomicReference.set(b6Var);
            int i15 = org.telegram.ui.ActionBar.y6.A8;
            org.telegram.ui.ActionBar.u6 u6Var = this.f31655d0;
            org.telegram.ui.ActionBar.f7.Y(b6Var, i15, u6Var);
            if (this.f31663k0) {
                f7 = 17.5f;
            } else {
                f7 = 18.0f;
            }
            b6Var.setTextSizePx(AndroidUtilities.dp(f7));
            b6Var.setGravity(3);
            b6Var.setTypeface(AndroidUtilities.bold());
            b6Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            b6Var.i(hlVar.getRightDrawable());
            b6Var.j(hlVar.getRightDrawable2());
            b6Var.setRightDrawableOutside(hlVar.getRightDrawableOutside());
            b6Var.setLeftDrawable(hlVar.getLeftDrawable());
            b6Var.l(hlVar.getText(), false);
            ViewPropertyAnimator duration = b6Var.animate().alpha(0.0f).setDuration(350L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).withEndAction(new io(this, 0)).start();
            addView(b6Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.b6) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(getContext());
            atomicReference2.set(b6Var2);
            int i16 = org.telegram.ui.ActionBar.y6.B8;
            org.telegram.ui.ActionBar.f7.Y(b6Var2, i16, u6Var);
            b6Var2.setTag(Integer.valueOf(i16));
            if (this.f31663k0) {
                f10 = 13.5f;
            } else {
                f10 = 14.0f;
            }
            b6Var2.setTextSizePx(AndroidUtilities.dp(f10));
            b6Var2.setGravity(3);
            if (hlVar2 != null) {
                b6Var2.l(hlVar2.getText(), false);
            } else if (s6Var != null) {
                b6Var2.l(s6Var.getText(), false);
            }
            b6Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).withEndAction(new io(this, 1)).start();
            addView(b6Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.b6 b6Var3 = (org.telegram.ui.ActionBar.b6) atomicReference.get();
        if (b6Var3 != null) {
            int i17 = this.P;
            if (loVar.getVisibility() == 0) {
                i13 = 54;
            }
            b6Var3.measure(org.telegram.messenger.wh.x(i13 + 16, i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.O = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        xc xcVar = this.f31660h0;
        io ioVar = this.f31661i0;
        if (action == 0 && a()) {
            this.f31662j0 = true;
            xcVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(ioVar);
            AndroidUtilities.runOnUIThread(ioVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f31662j0) {
            xcVar.c(false);
            this.f31662j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(ioVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, this.f31655d0);
        if (this.f31675u0 == null || w02 != this.f31678w0) {
            this.f31678w0 = w02;
            this.f31675u0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.f31675u0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f31682y0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f7;
        int i10 = this.J;
        j9 j9Var = this.I;
        j9Var.k(i10, chat);
        lo loVar = this.e;
        if (loVar != null) {
            loVar.f(chat, j9Var);
            if (ChatObject.isForum(chat)) {
                if (ChatObject.hasStories(chat)) {
                    f7 = 11.0f;
                } else {
                    f7 = 16.0f;
                }
            } else {
                f7 = 21.0f;
            }
            loVar.setRoundRadius(AndroidUtilities.dp(f7));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f31679x;
        if (imageView != null) {
            if (z10 && !this.f31657f) {
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
        this.f31652b0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f31660h0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.M = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.f31653c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.hl hlVar = this.f31670r;
            if (hlVar != null) {
                hlVar.k(charSequence);
            } else {
                s6 s6Var = this.f31672s;
                if (s6Var != null) {
                    s6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.f31682y0;
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
        sx0 sx0Var = this.N;
        org.telegram.ui.ActionBar.u6 u6Var = this.f31655d0;
        if (sx0Var != null) {
            sx0Var.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23585pa, u6Var));
        }
        Drawable drawable = this.f31669q0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        r5 r5Var = this.f31659g0;
        if (r5Var != null) {
            r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, u6Var)));
        }
        r5 r5Var2 = this.f31658f0;
        if (r5Var2 != null) {
            r5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23777zh, u6Var)));
        }
        Drawable drawable2 = this.f31671r0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.f31673s0 != null) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ah, u6Var);
            if (this.f31676v0 == null || w02 != this.f31680x0) {
                this.f31680x0 = w02;
                this.f31676v0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.f31673s0.setColorFilter(this.f31676v0);
        }
        org.telegram.ui.hl hlVar = this.h;
        if (hlVar != null) {
            try {
                if (hlVar.getRightDrawable2() instanceof fn0) {
                    ((fn0) hlVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, u6Var));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        invalidate();
    }

    public void f() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
