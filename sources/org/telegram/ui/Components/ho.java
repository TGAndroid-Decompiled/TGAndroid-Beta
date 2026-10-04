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
public class ho extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate {
    public final ImageView E;
    public final t21 F;
    public final org.telegram.ui.yn G;
    public final hx0[] H;
    public final h9 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public hx0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final le.b f27179a;
    public int f27180a0;
    public boolean f27181b;
    public Integer f27182b0;
    public Integer f27183c;
    public final hv0 f27184c0;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 f27185d0;
    public final co f27186e;
    public boolean f27187e0;
    public final boolean f27188f;
    public final o5 f27189f0;
    public final o5 f27190g0;
    public final org.telegram.ui.hl h;
    public final zc f27191h0;
    public final zn f27192i0;
    public boolean f27193j0;
    public boolean f27194k0;
    public boolean f27195l0;
    public boolean m0;
    public final AtomicReference f27196n;
    public boolean f27197n0;
    public String f27198o0;
    public String f27199p0;
    public Drawable f27200q0;
    public final org.telegram.ui.hl f27201r;
    public Drawable f27202r0;
    public final p6 f27203s;
    public Drawable f27204s0;
    public boolean f27205t0;
    public org.telegram.ui.ActionBar.k f27206u0;
    public final AtomicReference v;
    public final ImageView f27207w;
    public final ImageView f27208x;
    public final ImageView f27209y;

    public ho(android.content.Context r22, org.telegram.ui.ActionBar.n2 r23, boolean r24, org.telegram.ui.ActionBar.d6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ho.<init>(android.content.Context, org.telegram.ui.ActionBar.n2, boolean, org.telegram.ui.ActionBar.d6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.yn ynVar = this.G;
        org.telegram.ui.hl hlVar = this.f27201r;
        if (hlVar != null) {
            int i10 = 0;
            hx0[] hx0VarArr = this.H;
            if (z10) {
                try {
                    int intValue = MessagesController.getInstance(this.J).getPrintingStringType(ynVar.a(), ynVar.f43287b4).intValue();
                    hx0 hx0Var = hx0VarArr[intValue];
                    if (hx0Var != null) {
                        org.telegram.ui.ActionBar.d6 d6Var = this.f27185d0;
                        if (intValue == 5) {
                            hlVar.g(hx0Var, "**oo**");
                            hx0VarArr[intValue].b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21047pa, d6Var));
                            hlVar.setLeftDrawable((Drawable) null);
                        } else {
                            hlVar.g(null, null);
                            hx0VarArr[intValue].b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21047pa, d6Var));
                            hlVar.setLeftDrawable(hx0VarArr[intValue]);
                        }
                        this.N = hx0VarArr[intValue];
                        while (i10 < hx0VarArr.length) {
                            hx0 hx0Var2 = hx0VarArr[i10];
                            if (hx0Var2 != null) {
                                if (i10 == intValue) {
                                    hx0Var2.d();
                                } else {
                                    hx0Var2.e();
                                }
                            }
                            i10++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            }
            this.N = null;
            hlVar.setLeftDrawable((Drawable) null);
            hlVar.g(null, null);
            while (i10 < hx0VarArr.length) {
                hx0 hx0Var3 = hx0VarArr[i10];
                if (hx0Var3 != null) {
                    hx0Var3.e();
                }
                i10++;
            }
        }
    }

    public boolean a() {
        return false;
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        ImageView imageView;
        int i11;
        if (i10 == 0 && (imageView = this.f27207w) != null) {
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

    public final void b() {
        TLRPC.User user;
        int dp;
        float f7;
        int i10;
        org.telegram.ui.yn ynVar = this.G;
        if (ynVar != null) {
            TLRPC.User i11 = ynVar.i();
            TLRPC.Chat chat = ynVar.f43322e;
            if (ynVar.P3 == 3) {
                long J8 = ynVar.J8();
                if (J8 >= 0) {
                    user = ynVar.getMessagesController().getUser(Long.valueOf(J8));
                    chat = null;
                } else {
                    chat = ynVar.getMessagesController().getChat(Long.valueOf(-J8));
                    user = null;
                }
            } else {
                user = i11;
            }
            int i12 = this.J;
            h9 h9Var = this.I;
            co coVar = this.f27186e;
            if (user != null) {
                h9Var.m(i12, user);
                if (UserObject.isReplyUser(user)) {
                    h9Var.f27062p = 0.8f;
                    h9Var.g(12);
                    if (coVar != null) {
                        coVar.setAnimatedEmojiDrawable(null);
                        coVar.h(null, null, h9Var, user);
                    }
                } else if (UserObject.isAnonymous(user)) {
                    h9Var.f27062p = 0.8f;
                    h9Var.g(21);
                    if (coVar != null) {
                        coVar.setAnimatedEmojiDrawable(null);
                        coVar.h(null, null, h9Var, user);
                    }
                } else if (UserObject.isUserSelf(user) && ynVar.P3 == 3) {
                    h9Var.f27062p = 0.8f;
                    h9Var.g(22);
                    if (coVar != null) {
                        coVar.setAnimatedEmojiDrawable(null);
                        coVar.h(null, null, h9Var, user);
                    }
                } else if (UserObject.isUserSelf(user)) {
                    h9Var.f27062p = 0.8f;
                    h9Var.g(1);
                    if (coVar != null) {
                        coVar.setAnimatedEmojiDrawable(null);
                        coVar.h(null, null, h9Var, user);
                    }
                } else {
                    h9Var.f27062p = 1.0f;
                    if (coVar != null) {
                        coVar.setAnimatedEmojiDrawable(null);
                        coVar.f32493a.setForUserOrChat(user, h9Var, null, true, 3, false);
                    }
                }
            } else if (ChatObject.isMonoForum(chat)) {
                long d = ynVar.d();
                if (ChatObject.canManageMonoForum(i12, chat) && d != 0) {
                    if (i10 > 0) {
                        TLRPC.User user2 = ynVar.getMessagesController().getUser(Long.valueOf(d));
                        h9Var.r(user2);
                        coVar.setAnimatedEmojiDrawable(null);
                        coVar.e(user2, h9Var);
                    } else {
                        TLRPC.Chat chat2 = ynVar.getMessagesController().getChat(Long.valueOf(-d));
                        h9Var.q(chat2);
                        coVar.setAnimatedEmojiDrawable(null);
                        coVar.e(chat2, h9Var);
                    }
                } else {
                    coVar.setAnimatedEmojiDrawable(null);
                    ng.d.o(i12, chat, h9Var, coVar);
                }
                coVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            } else if (chat != null) {
                h9Var.f27062p = 1.0f;
                h9Var.k(i12, chat);
                if (coVar != null) {
                    coVar.setAnimatedEmojiDrawable(null);
                    coVar.e(chat, h9Var);
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
                    coVar.setRoundRadius(dp);
                }
            }
        }
    }

    public final o5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        o5 o5Var = this.f27190g0;
        o5Var.j(j3, false);
        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21239zh, this.f27185d0)));
        int dp = AndroidUtilities.dp(1.0f);
        o5Var.I = 0;
        o5Var.J = dp;
        return o5Var;
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
        float a2 = this.f27191h0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        if (view == this.f27186e) {
            boolean z11 = false;
            ImageView imageView = this.f27207w;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f27208x;
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
                    canvas.drawCircle(width, height - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.i6.Jl);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.i6.Jl);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ho.e(boolean, boolean):void");
    }

    public final void g(int i10, boolean z10) {
        t21 t21Var = this.F;
        if (t21Var != null) {
            boolean z11 = this.f27195l0;
            if (i10 == 0 && !this.T) {
                return;
            }
            le.b bVar = this.f27179a;
            if (!z11) {
                bVar.a(true, z10);
                t21Var.b(i10);
                return;
            }
            bVar.a(false, z10);
        }
    }

    public w9 getAvatarImageView() {
        return this.f27186e;
    }

    public int getLastSubtitleColorKey() {
        return this.f27180a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public hv0 getSharedMediaPreloader() {
        return this.f27184c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.hl hlVar = this.f27201r;
        if (hlVar != null) {
            return hlVar.getTextPaint();
        }
        return this.f27203s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.hl hlVar = this.f27201r;
        if (hlVar != null) {
            return hlVar;
        }
        p6 p6Var = this.f27203s;
        if (p6Var != null) {
            return p6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f27207w;
    }

    public org.telegram.ui.ActionBar.i5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int dp;
        float f7 = 0.0f;
        org.telegram.ui.hl hlVar = this.h;
        if (hlVar != null) {
            f7 = Math.max(0.0f, hlVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.hl hlVar2 = this.f27201r;
        if (hlVar2 != null) {
            f7 = Math.max(f7, hlVar2.getExactWidthIncludeDrawables());
        }
        co coVar = this.f27186e;
        if (coVar != null && coVar.getVisibility() == 0) {
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
        this.f27197n0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
                this.f27202r0 = mutate;
                int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21239zh, this.f27185d0);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
                Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
                this.f27204s0 = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ah, this.f27185d0), mode));
                this.h.j(new sq(this.f27202r0, this.f27204s0));
                this.m0 = true;
                this.f27199p0 = LocaleController.getString(R.string.AccDescrVerified);
            } else if (this.h.getRightDrawable() instanceof pm0) {
                this.h.j(null);
                this.m0 = false;
                this.f27199p0 = null;
            }
        } else {
            this.f27197n0 = true;
            if (!(this.h.getRightDrawable() instanceof pm0)) {
                pm0 pm0Var = new pm0(!z10 ? 1 : 0);
                pm0Var.b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B8, this.f27185d0));
                this.h.j(pm0Var);
                this.f27199p0 = LocaleController.getString(R.string.ScamMessage);
                this.m0 = true;
            }
        }
        if (!z13 && DialogObject.getEmojiStatusDocumentId(emojiStatus) == 0) {
            this.h.i(null);
            this.f27198o0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof p5) && (((p5) this.h.getRightDrawable()).f29512a instanceof q5)) {
                ((q5) ((p5) this.h.getRightDrawable()).f29512a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f27189f0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.f27200q0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21239zh, this.f27185d0), PorterDuff.Mode.MULTIPLY));
                this.f27189f0.g(this.f27200q0, z14);
            } else {
                this.f27189f0.g(null, z14);
            }
            this.f27189f0.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21239zh, this.f27185d0)));
            this.h.i(this.f27189f0);
            this.m0 = false;
            this.f27198o0 = LocaleController.getString(R.string.AccDescrPremium);
        }
        org.telegram.ui.ActionBar.k kVar = this.f27206u0;
        if (kVar != null) {
            kVar.d(z14);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.hl hlVar = this.f27201r;
        hlVar.setTextColor(i11);
        hlVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.hl hlVar = this.h;
        hlVar.setLeftDrawable(drawable);
        if (!this.m0 && !this.f27197n0) {
            if (drawable2 != null) {
                this.f27199p0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.f27199p0 = null;
            }
            hlVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.f27206u0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        h9 h9Var = this.I;
        h9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        co coVar = this.f27186e;
        if (isReplyUser) {
            h9Var.g(12);
            h9Var.f27062p = 0.8f;
            if (coVar != null) {
                coVar.h(null, null, h9Var, user);
            }
        } else if (UserObject.isAnonymous(user)) {
            h9Var.g(21);
            h9Var.f27062p = 0.8f;
            if (coVar != null) {
                coVar.h(null, null, h9Var, user);
            }
        } else if (UserObject.isUserSelf(user) && !z10) {
            h9Var.g(1);
            h9Var.f27062p = 0.8f;
            if (coVar != null) {
                coVar.h(null, null, h9Var, user);
            }
        } else {
            h9Var.f27062p = 1.0f;
            if (coVar != null) {
                coVar.e(user, h9Var);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f27185d0;
        p6 p6Var = this.f27203s;
        org.telegram.ui.hl hlVar = this.f27201r;
        if (str == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (hlVar != null) {
                    hlVar.k(charSequence);
                    this.W = null;
                    Integer num = this.f27182b0;
                    if (num != null) {
                        hlVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.f27180a0;
                        if (i11 >= 0) {
                            hlVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
                            hlVar.setTag(Integer.valueOf(this.f27180a0));
                        }
                    }
                } else if (p6Var != null) {
                    p6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.f27182b0;
                    if (num2 != null) {
                        p6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.f27180a0;
                        if (i12 >= 0) {
                            p6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
                            p6Var.setTag(Integer.valueOf(this.f27180a0));
                        }
                    }
                }
            }
        } else if (hlVar != null) {
            if (this.W == null) {
                this.W = hlVar.getText();
            }
            hlVar.k(str);
            Integer num3 = this.f27182b0;
            if (num3 != null) {
                hlVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.i6.B8;
                hlVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
                hlVar.setTag(Integer.valueOf(i13));
            }
        } else if (p6Var != null) {
            if (this.W == null) {
                this.W = p6Var.getText();
            }
            p6Var.c(str, !LocaleController.isRTL, true);
            Integer num4 = this.f27182b0;
            if (num4 != null) {
                p6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.i6.B8;
                p6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, d6Var));
                p6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.f27206u0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.yn ynVar = this.G;
        if (ynVar != null) {
            this.U = 0;
            TLRPC.ChatFull chatFull = ynVar.X7;
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
                    if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f20189id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f27185d0;
        boolean[] zArr2 = this.R;
        p6 p6Var = this.f27203s;
        org.telegram.ui.hl hlVar = this.f27201r;
        org.telegram.ui.hl hlVar2 = this.h;
        int i18 = this.J;
        org.telegram.ui.yn ynVar = this.G;
        if (ynVar != null) {
            if (ynVar.P3 == 6) {
                String str2 = ynVar.N3.link;
                hg.z[] zVarArr = hg.z.f11412e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                setSubtitle(str2);
                return;
            }
            TLRPC.User i19 = ynVar.i();
            TLRPC.Chat chat = ynVar.f43322e;
            if (UserObject.isUserSelf(i19) && ynVar.P3 == 0 && ynVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.f27205t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((UserObject.isUserSelf(i19) && !z11) || UserObject.isReplyUser(i19) || ((i19 != null && i19.f20189id == 489000) || ((i10 = ynVar.P3) != 0 && i10 != 8))) && ynVar.P3 != 3) {
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
                if (!this.f27205t0) {
                    MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i17) + 1).apply();
                    this.f27205t0 = true;
                }
            }
            CharSequence printingString = MessagesController.getInstance(i18).getPrintingString(ynVar.a(), ynVar.f43287b4, false);
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
                if (ynVar.E9() && hlVar2.getTag() != null) {
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
                        this.Q.addListener(new go(this, 1));
                        this.Q.setDuration(180L);
                        this.Q.start();
                    } else {
                        hlVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer printingStringType = MessagesController.getInstance(i18).getPrintingStringType(ynVar.a(), ynVar.f43287b4);
                if (printingStringType != null && printingStringType.intValue() == 5) {
                    charSequence = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
                } else {
                    charSequence = printingString;
                }
                setTypingAnimation(true);
                z12 = true;
                str = charSequence;
            } else if (ynVar.E9() && !ynVar.f43339f4) {
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
                        this.Q.addListener(new go(this, 0));
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
                int i20 = ynVar.P3;
                if (i20 == 8) {
                    if (ynVar.R3) {
                        charSequence2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    } else if (ynVar.d() == 0) {
                        int topicsCount = ynVar.getMessagesController().getTopicsController().getTopicsCount(-ynVar.a());
                        if (topicsCount > 0) {
                            string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                        } else {
                            string = LocaleController.getString(R.string.ChatMessageSuggestions);
                        }
                        charSequence2 = string;
                    } else {
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f20042id, ynVar.d());
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
                            formatString = LocaleController.formatString(R.string.TopicProfileStatus, ng.d.i(chat, i18, false));
                        }
                        str = formatString;
                    }
                    z12 = false;
                    str = charSequence2;
                } else {
                    if (i20 == 3) {
                        charSequence2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, ynVar.getMessagesController().getSavedMessagesController().getMessagesCount(ynVar.J8())), new Object[0]);
                    } else {
                        if (ynVar.f43339f4 && chat != null) {
                            TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f20042id, ynVar.d());
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
                            TLRPC.ChatFull chatFull = ynVar.X7;
                            int i22 = this.U;
                            if (ChatObject.isChannel(chat)) {
                                if (chatFull != null && (i12 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i22 > 1) {
                                            formatPluralString = a4.a.D(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i22, chatFull.participants_count), new Object[0]));
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
                                    formatPluralString = a4.a.D(LocaleController.formatPluralString("Members", i24, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i22, new Object[0]));
                                } else {
                                    formatPluralString = LocaleController.formatPluralString("Members", i24, new Object[0]);
                                }
                            }
                        } else if (i19 != null) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(i19.f20189id));
                            if (user != null) {
                                i19 = user;
                            }
                            if (!UserObject.isReplyUser(i19)) {
                                long j3 = i19.f20189id;
                                if (j3 != 489000) {
                                    if (j3 == UserConfig.getInstance(i18).getClientUserId()) {
                                        charSequence2 = z13 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                    } else {
                                        long j10 = i19.f20189id;
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
                                                    if (this.f27187e0) {
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
                i16 = org.telegram.ui.ActionBar.i6.f21047pa;
            } else {
                i16 = org.telegram.ui.ActionBar.i6.B8;
            }
            this.f27180a0 = i16;
            if (this.W == null) {
                if (hlVar != null) {
                    hlVar.k(str);
                    Integer num = this.f27182b0;
                    if (num == null) {
                        hlVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(this.f27180a0, d6Var));
                        hlVar.setTag(Integer.valueOf(this.f27180a0));
                    } else {
                        hlVar.setTextColor(num.intValue());
                    }
                } else {
                    p6Var.c(str, z10, true);
                    Integer num2 = this.f27182b0;
                    if (num2 == null) {
                        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(this.f27180a0, d6Var));
                        p6Var.setTag(Integer.valueOf(this.f27180a0));
                    } else {
                        p6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.W = str;
            }
            org.telegram.ui.ActionBar.k kVar = this.f27206u0;
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
        org.telegram.ui.yn ynVar = this.G;
        if (ynVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (ynVar.P3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        o5 o5Var = this.f27189f0;
        if (o5Var != null) {
            o5Var.a();
        }
        o5 o5Var2 = this.f27190g0;
        if (o5Var2 != null) {
            o5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.yn ynVar = this.G;
        if (ynVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (ynVar.P3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        o5 o5Var = this.f27189f0;
        if (o5Var != null) {
            o5Var.b();
        }
        o5 o5Var2 = this.f27190g0;
        if (o5Var2 != null) {
            o5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f27198o0 != null) {
            sb2.append(", ");
            sb2.append(this.f27198o0);
        }
        if (this.f27199p0 != null) {
            sb2.append(", ");
            sb2.append(this.f27199p0);
        }
        sb2.append("\n");
        org.telegram.ui.hl hlVar = this.f27201r;
        if (hlVar != null) {
            sb2.append(hlVar.getText());
        } else {
            p6 p6Var = this.f27203s;
            if (p6Var != null) {
                sb2.append(p6Var.getText());
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
        co coVar = this.f27186e;
        int measuredHeight = ((currentActionBarHeight - coVar.getMeasuredHeight()) - 2) / 2;
        if (this.K) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = measuredHeight + i14;
        if (this.f27194k0) {
            f7 = 23.66f;
        } else {
            f7 = 24.0f;
        }
        int dp = AndroidUtilities.dp(f7) + i15;
        int i16 = this.L + 1;
        int i17 = i15 + 1;
        coVar.layout(i16, i17, coVar.getMeasuredWidth() + i16, coVar.getMeasuredHeight() + i17);
        int i18 = this.L;
        if (coVar.getVisibility() == 0) {
            if (this.f27194k0) {
                f10 = 49.66f;
            } else {
                f10 = 55.0f;
            }
        } else if (this.f27194k0) {
            f10 = 13.0f;
        } else {
            f10 = 1.0f;
        }
        int dp2 = i18 + AndroidUtilities.dp(f10) + this.M;
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.f27196n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.hl hlVar = this.h;
        if (visibility != 8) {
            hlVar.layout(dp2, (AndroidUtilities.dp(1.66f) + i15) - hlVar.getPaddingTop(), hlVar.getMeasuredWidth() + dp2, hlVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (hlVar.getTextHeight() + i15)) - hlVar.getPaddingTop()));
            if (i5Var != null) {
                i5Var.layout(dp2, AndroidUtilities.dp(1.66f) + i15, i5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + i5Var.getTextHeight() + i15);
            }
        } else {
            hlVar.layout(dp2, (AndroidUtilities.dp(11.0f) + i15) - hlVar.getPaddingTop(), hlVar.getMeasuredWidth() + dp2, hlVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (hlVar.getTextHeight() + i15)) - hlVar.getPaddingTop()));
            if (i5Var != null) {
                i5Var.layout(dp2, AndroidUtilities.dp(10.0f) + i15, i5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + i5Var.getTextHeight() + i15);
            }
        }
        ImageView imageView = this.f27208x;
        if (imageView != null) {
            int i19 = this.L;
            imageView.layout(AndroidUtilities.dp(29.0f) + i19, AndroidUtilities.dp(27.33f) + i15, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.L, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + i15);
        }
        ImageView imageView2 = this.f27207w;
        if (imageView2 != null) {
            int i20 = this.L;
            imageView2.layout(AndroidUtilities.dp(19.333f) + i20, i15 - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.L, imageView2.getMeasuredHeight() + (i15 - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.f27209y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        org.telegram.ui.hl hlVar2 = this.f27201r;
        if (hlVar2 != null) {
            hlVar2.layout(dp2, dp, hlVar2.getMeasuredWidth() + dp2, hlVar2.getTextHeight() + dp);
        } else {
            p6 p6Var = this.f27203s;
            if (p6Var != null) {
                p6Var.layout(dp2, dp, p6Var.getMeasuredWidth() + dp2, p6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.i5 i5Var2 = (org.telegram.ui.ActionBar.i5) this.v.get();
        if (i5Var2 != null) {
            i5Var2.layout(dp2, dp, i5Var2.getMeasuredWidth() + dp2, i5Var2.getTextHeight() + dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        co coVar = this.f27186e;
        int i13 = 0;
        if (coVar.getVisibility() == 0) {
            i12 = 54;
        } else {
            i12 = 0;
        }
        int dp = size - AndroidUtilities.dp(i12 + 16);
        float f11 = this.d;
        coVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.hl hlVar = this.h;
        hlVar.measure(makeMeasureSpec, makeMeasureSpec2);
        p6 p6Var = this.f27203s;
        org.telegram.ui.hl hlVar2 = this.f27201r;
        if (hlVar2 != null) {
            hlVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (p6Var != null) {
            p6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f27208x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f27207w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.f27209y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i14 = this.O;
        AtomicReference atomicReference = this.f27196n;
        if (i14 != -1 && i14 != size && i14 > size) {
            this.P = i14;
            View view = (org.telegram.ui.ActionBar.i5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(getContext());
            atomicReference.set(i5Var);
            int i15 = org.telegram.ui.ActionBar.i6.A8;
            org.telegram.ui.ActionBar.d6 d6Var = this.f27185d0;
            i5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, d6Var));
            if (this.f27194k0) {
                f7 = 17.5f;
            } else {
                f7 = 18.0f;
            }
            i5Var.setTextSizePx(AndroidUtilities.dp(f7));
            i5Var.setGravity(3);
            i5Var.setTypeface(AndroidUtilities.bold());
            i5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            i5Var.i(hlVar.getRightDrawable());
            i5Var.j(hlVar.getRightDrawable2());
            i5Var.setRightDrawableOutside(hlVar.getRightDrawableOutside());
            i5Var.setLeftDrawable(hlVar.getLeftDrawable());
            i5Var.l(hlVar.getText(), false);
            ViewPropertyAnimator duration = i5Var.animate().alpha(0.0f).setDuration(350L);
            tr trVar = tr.h;
            duration.setInterpolator(trVar).withEndAction(new zn(this, 0)).start();
            addView(i5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.i5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(getContext());
            atomicReference2.set(i5Var2);
            int i16 = org.telegram.ui.ActionBar.i6.B8;
            i5Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i16, d6Var));
            i5Var2.setTag(Integer.valueOf(i16));
            if (this.f27194k0) {
                f10 = 13.5f;
            } else {
                f10 = 14.0f;
            }
            i5Var2.setTextSizePx(AndroidUtilities.dp(f10));
            i5Var2.setGravity(3);
            if (hlVar2 != null) {
                i5Var2.l(hlVar2.getText(), false);
            } else if (p6Var != null) {
                i5Var2.l(p6Var.getText(), false);
            }
            i5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(trVar).withEndAction(new zn(this, 1)).start();
            addView(i5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.i5 i5Var3 = (org.telegram.ui.ActionBar.i5) atomicReference.get();
        if (i5Var3 != null) {
            int i17 = this.P;
            if (coVar.getVisibility() == 0) {
                i13 = 54;
            }
            i5Var3.measure(org.telegram.messenger.bi.c(i13 + 16, i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.O = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        zc zcVar = this.f27191h0;
        zn znVar = this.f27192i0;
        if (action == 0 && a()) {
            this.f27193j0 = true;
            zcVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(znVar);
            AndroidUtilities.runOnUIThread(znVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f27193j0) {
            zcVar.c(false);
            this.f27193j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(znVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f27206u0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f7;
        int i10 = this.J;
        h9 h9Var = this.I;
        h9Var.k(i10, chat);
        co coVar = this.f27186e;
        if (coVar != null) {
            coVar.e(chat, h9Var);
            if (ChatObject.isForum(chat)) {
                if (ChatObject.hasStories(chat)) {
                    f7 = 11.0f;
                } else {
                    f7 = 16.0f;
                }
            } else {
                f7 = 21.0f;
            }
            coVar.setRoundRadius(AndroidUtilities.dp(f7));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f27208x;
        if (imageView != null) {
            if (z10 && !this.f27188f) {
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
        this.f27182b0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f27191h0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.M = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.f27183c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.hl hlVar = this.f27201r;
            if (hlVar != null) {
                hlVar.k(charSequence);
            } else {
                p6 p6Var = this.f27203s;
                if (p6Var != null) {
                    p6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.f27206u0;
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

    public void f() {
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
