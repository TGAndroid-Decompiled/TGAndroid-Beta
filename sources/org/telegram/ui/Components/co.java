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
public class co extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate {
    public final ImageView E;
    public final u11 F;
    public final org.telegram.ui.co G;
    public final kw0[] H;
    public final i9 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public kw0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final le.b f25038a;
    public int f25039a0;
    public boolean f25040b;
    public Integer f25041b0;
    public Integer f25042c;
    public final pu0 f25043c0;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 f25044d0;
    public final yn f25045e;
    public boolean f25046e0;
    public final boolean f25047f;
    public final o5 f25048f0;
    public final o5 f25049g0;
    public final org.telegram.ui.ll h;
    public final zc f25050h0;
    public final vn f25051i0;
    public boolean f25052j0;
    public boolean f25053k0;
    public boolean f25054l0;
    public boolean m0;
    public final AtomicReference f25055n;
    public boolean f25056n0;
    public String f25057o0;
    public String f25058p0;
    public Drawable f25059q0;
    public final org.telegram.ui.ll f25060r;
    public Drawable f25061r0;
    public final q6 f25062s;
    public Drawable f25063s0;
    public boolean f25064t0;
    public org.telegram.ui.ActionBar.k f25065u0;
    public final AtomicReference v;
    public final ImageView f25066w;
    public final ImageView f25067x;
    public final ImageView f25068y;

    public co(android.content.Context r22, org.telegram.ui.ActionBar.n2 r23, boolean r24, org.telegram.ui.ActionBar.f6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.co.<init>(android.content.Context, org.telegram.ui.ActionBar.n2, boolean, org.telegram.ui.ActionBar.f6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.co coVar = this.G;
        org.telegram.ui.ll llVar = this.f25060r;
        if (llVar != null) {
            int i10 = 0;
            kw0[] kw0VarArr = this.H;
            if (z10) {
                try {
                    int intValue = MessagesController.getInstance(this.J).getPrintingStringType(coVar.a(), coVar.f35228d4).intValue();
                    kw0 kw0Var = kw0VarArr[intValue];
                    if (kw0Var != null) {
                        org.telegram.ui.ActionBar.f6 f6Var = this.f25044d0;
                        if (intValue == 5) {
                            llVar.g(kw0Var, "**oo**");
                            kw0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20883pa, f6Var));
                            llVar.setLeftDrawable((Drawable) null);
                        } else {
                            llVar.g(null, null);
                            kw0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20883pa, f6Var));
                            llVar.setLeftDrawable(kw0VarArr[intValue]);
                        }
                        this.N = kw0VarArr[intValue];
                        while (i10 < kw0VarArr.length) {
                            kw0 kw0Var2 = kw0VarArr[i10];
                            if (kw0Var2 != null) {
                                if (i10 == intValue) {
                                    kw0Var2.d();
                                } else {
                                    kw0Var2.e();
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
            llVar.setLeftDrawable((Drawable) null);
            llVar.g(null, null);
            while (i10 < kw0VarArr.length) {
                kw0 kw0Var3 = kw0VarArr[i10];
                if (kw0Var3 != null) {
                    kw0Var3.e();
                }
                i10++;
            }
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        ImageView imageView;
        int i11;
        if (i10 == 0 && (imageView = this.f25066w) != null) {
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
        org.telegram.ui.co coVar = this.G;
        if (coVar != null) {
            TLRPC.User i11 = coVar.i();
            TLRPC.Chat chat = coVar.f35237e;
            if (coVar.R3 == 3) {
                long I8 = coVar.I8();
                if (I8 >= 0) {
                    user = coVar.getMessagesController().getUser(Long.valueOf(I8));
                    chat = null;
                } else {
                    chat = coVar.getMessagesController().getChat(Long.valueOf(-I8));
                    user = null;
                }
            } else {
                user = i11;
            }
            int i12 = this.J;
            i9 i9Var = this.I;
            yn ynVar = this.f25045e;
            if (user != null) {
                i9Var.m(i12, user);
                if (UserObject.isReplyUser(user)) {
                    i9Var.f27038p = 0.8f;
                    i9Var.g(12);
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.h(null, null, i9Var, user);
                    }
                } else if (UserObject.isAnonymous(user)) {
                    i9Var.f27038p = 0.8f;
                    i9Var.g(21);
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.h(null, null, i9Var, user);
                    }
                } else if (UserObject.isUserSelf(user) && coVar.R3 == 3) {
                    i9Var.f27038p = 0.8f;
                    i9Var.g(22);
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.h(null, null, i9Var, user);
                    }
                } else if (UserObject.isUserSelf(user)) {
                    i9Var.f27038p = 0.8f;
                    i9Var.g(1);
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.h(null, null, i9Var, user);
                    }
                } else {
                    i9Var.f27038p = 1.0f;
                    if (ynVar != null) {
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.f32476a.setForUserOrChat(user, i9Var, null, true, 3, false);
                    }
                }
            } else if (ChatObject.isMonoForum(chat)) {
                long d = coVar.d();
                if (ChatObject.canManageMonoForum(i12, chat) && d != 0) {
                    if (i10 > 0) {
                        TLRPC.User user2 = coVar.getMessagesController().getUser(Long.valueOf(d));
                        i9Var.r(user2);
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.e(user2, i9Var);
                    } else {
                        TLRPC.Chat chat2 = coVar.getMessagesController().getChat(Long.valueOf(-d));
                        i9Var.q(chat2);
                        ynVar.setAnimatedEmojiDrawable(null);
                        ynVar.e(chat2, i9Var);
                    }
                } else {
                    ynVar.setAnimatedEmojiDrawable(null);
                    og.d.o(i12, chat, i9Var, ynVar);
                }
                ynVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            } else if (chat != null) {
                i9Var.f27038p = 1.0f;
                i9Var.k(i12, chat);
                if (ynVar != null) {
                    ynVar.setAnimatedEmojiDrawable(null);
                    ynVar.e(chat, i9Var);
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
                    ynVar.setRoundRadius(dp);
                }
            }
        }
    }

    public final o5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        o5 o5Var = this.f25049g0;
        o5Var.j(j3, false);
        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21072zh, this.f25044d0)));
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
            org.telegram.ui.ll llVar = this.h;
            if (llVar != null) {
                llVar.invalidate();
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
        float a2 = this.f25050h0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        if (view == this.f25045e) {
            boolean z11 = false;
            ImageView imageView = this.f25066w;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f25067x;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.co.e(boolean, boolean):void");
    }

    public final void g(int i10, boolean z10) {
        u11 u11Var = this.F;
        if (u11Var != null) {
            boolean z11 = this.f25054l0;
            if (i10 == 0 && !this.T) {
                return;
            }
            le.b bVar = this.f25038a;
            if (!z11) {
                bVar.a(true, z10);
                u11Var.b(i10);
                return;
            }
            bVar.a(false, z10);
        }
    }

    public x9 getAvatarImageView() {
        return this.f25045e;
    }

    public int getLastSubtitleColorKey() {
        return this.f25039a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public pu0 getSharedMediaPreloader() {
        return this.f25043c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.ll llVar = this.f25060r;
        if (llVar != null) {
            return llVar.getTextPaint();
        }
        return this.f25062s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.ll llVar = this.f25060r;
        if (llVar != null) {
            return llVar;
        }
        q6 q6Var = this.f25062s;
        if (q6Var != null) {
            return q6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f25066w;
    }

    public org.telegram.ui.ActionBar.j5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int dp;
        float f7 = 0.0f;
        org.telegram.ui.ll llVar = this.h;
        if (llVar != null) {
            f7 = Math.max(0.0f, llVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.ll llVar2 = this.f25060r;
        if (llVar2 != null) {
            f7 = Math.max(f7, llVar2.getExactWidthIncludeDrawables());
        }
        yn ynVar = this.f25045e;
        if (ynVar != null && ynVar.getVisibility() == 0) {
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
        this.f25056n0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
                this.f25061r0 = mutate;
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21072zh, this.f25044d0);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
                Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
                this.f25063s0 = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, this.f25044d0), mode));
                this.h.j(new oq(this.f25061r0, this.f25063s0));
                this.m0 = true;
                this.f25058p0 = LocaleController.getString(R.string.AccDescrVerified);
            } else if (this.h.getRightDrawable() instanceof xl0) {
                this.h.j(null);
                this.m0 = false;
                this.f25058p0 = null;
            }
        } else {
            this.f25056n0 = true;
            if (!(this.h.getRightDrawable() instanceof xl0)) {
                xl0 xl0Var = new xl0(!z10 ? 1 : 0);
                xl0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.f25044d0));
                this.h.j(xl0Var);
                this.f25058p0 = LocaleController.getString(R.string.ScamMessage);
                this.m0 = true;
            }
        }
        if (!z13 && DialogObject.getEmojiStatusDocumentId(emojiStatus) == 0) {
            this.h.i(null);
            this.f25057o0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof p5) && (((p5) this.h.getRightDrawable()).f29276a instanceof q5)) {
                ((q5) ((p5) this.h.getRightDrawable()).f29276a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f25048f0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.f25059q0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21072zh, this.f25044d0), PorterDuff.Mode.MULTIPLY));
                this.f25048f0.g(this.f25059q0, z14);
            } else {
                this.f25048f0.g(null, z14);
            }
            this.f25048f0.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21072zh, this.f25044d0)));
            this.h.i(this.f25048f0);
            this.m0 = false;
            this.f25057o0 = LocaleController.getString(R.string.AccDescrPremium);
        }
        org.telegram.ui.ActionBar.k kVar = this.f25065u0;
        if (kVar != null) {
            kVar.e(z14);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.ll llVar = this.f25060r;
        llVar.setTextColor(i11);
        llVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.ll llVar = this.h;
        llVar.setLeftDrawable(drawable);
        if (!this.m0 && !this.f25056n0) {
            if (drawable2 != null) {
                this.f25058p0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.f25058p0 = null;
            }
            llVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.f25065u0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        i9 i9Var = this.I;
        i9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        yn ynVar = this.f25045e;
        if (isReplyUser) {
            i9Var.g(12);
            i9Var.f27038p = 0.8f;
            if (ynVar != null) {
                ynVar.h(null, null, i9Var, user);
            }
        } else if (UserObject.isAnonymous(user)) {
            i9Var.g(21);
            i9Var.f27038p = 0.8f;
            if (ynVar != null) {
                ynVar.h(null, null, i9Var, user);
            }
        } else if (UserObject.isUserSelf(user) && !z10) {
            i9Var.g(1);
            i9Var.f27038p = 0.8f;
            if (ynVar != null) {
                ynVar.h(null, null, i9Var, user);
            }
        } else {
            i9Var.f27038p = 1.0f;
            if (ynVar != null) {
                ynVar.e(user, i9Var);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f25044d0;
        q6 q6Var = this.f25062s;
        org.telegram.ui.ll llVar = this.f25060r;
        if (str == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (llVar != null) {
                    llVar.k(charSequence);
                    this.W = null;
                    Integer num = this.f25041b0;
                    if (num != null) {
                        llVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.f25039a0;
                        if (i11 >= 0) {
                            llVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                            llVar.setTag(Integer.valueOf(this.f25039a0));
                        }
                    }
                } else if (q6Var != null) {
                    q6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.f25041b0;
                    if (num2 != null) {
                        q6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.f25039a0;
                        if (i12 >= 0) {
                            q6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                            q6Var.setTag(Integer.valueOf(this.f25039a0));
                        }
                    }
                }
            }
        } else if (llVar != null) {
            if (this.W == null) {
                this.W = llVar.getText();
            }
            llVar.k(str);
            Integer num3 = this.f25041b0;
            if (num3 != null) {
                llVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.B8;
                llVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                llVar.setTag(Integer.valueOf(i13));
            }
        } else if (q6Var != null) {
            if (this.W == null) {
                this.W = q6Var.getText();
            }
            q6Var.c(str, !LocaleController.isRTL, true);
            Integer num4 = this.f25041b0;
            if (num4 != null) {
                q6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.B8;
                q6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
                q6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.f25065u0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.co coVar = this.G;
        if (coVar != null) {
            this.U = 0;
            TLRPC.ChatFull chatFull = coVar.Z7;
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
                    if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f20016id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f25044d0;
        boolean[] zArr2 = this.R;
        q6 q6Var = this.f25062s;
        org.telegram.ui.ll llVar = this.f25060r;
        org.telegram.ui.ll llVar2 = this.h;
        int i18 = this.J;
        org.telegram.ui.co coVar = this.G;
        if (coVar != null) {
            if (coVar.R3 == 6) {
                String str2 = coVar.P3.link;
                ig.y[] yVarArr = ig.y.f12281e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                setSubtitle(str2);
                return;
            }
            TLRPC.User i19 = coVar.i();
            TLRPC.Chat chat = coVar.f35237e;
            if (UserObject.isUserSelf(i19) && coVar.R3 == 0 && coVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.f25064t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((UserObject.isUserSelf(i19) && !z11) || UserObject.isReplyUser(i19) || ((i19 != null && i19.f20016id == 489000) || ((i10 = coVar.R3) != 0 && i10 != 8))) && coVar.R3 != 3) {
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
                if (!this.f25064t0) {
                    MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i17) + 1).apply();
                    this.f25064t0 = true;
                }
            }
            CharSequence printingString = MessagesController.getInstance(i18).getPrintingString(coVar.a(), coVar.f35228d4, false);
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
                if (coVar.F9() && llVar2.getTag() != null) {
                    llVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.Q;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.Q = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(llVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.Q.addListener(new bo(this, 1));
                        this.Q.setDuration(180L);
                        this.Q.start();
                    } else {
                        llVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer printingStringType = MessagesController.getInstance(i18).getPrintingStringType(coVar.a(), coVar.f35228d4);
                if (printingStringType != null && printingStringType.intValue() == 5) {
                    charSequence = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
                } else {
                    charSequence = printingString;
                }
                setTypingAnimation(true);
                z12 = true;
                str = charSequence;
            } else if (coVar.F9() && !coVar.f35277h4) {
                if (llVar2.getTag() == null) {
                    llVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.Q;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.Q = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.Q = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(llVar2, property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.Q.addListener(new bo(this, 0));
                        this.Q.setDuration(180L);
                        this.Q.start();
                        return;
                    }
                    llVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = coVar.R3;
                if (i20 == 8) {
                    if (coVar.T3) {
                        charSequence2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    } else if (coVar.d() == 0) {
                        int topicsCount = coVar.getMessagesController().getTopicsController().getTopicsCount(-coVar.a());
                        if (topicsCount > 0) {
                            string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                        } else {
                            string = LocaleController.getString(R.string.ChatMessageSuggestions);
                        }
                        charSequence2 = string;
                    } else {
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f19869id, coVar.d());
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
                            formatString = LocaleController.formatString(R.string.TopicProfileStatus, og.d.i(chat, i18, false));
                        }
                        str = formatString;
                    }
                    z12 = false;
                    str = charSequence2;
                } else {
                    if (i20 == 3) {
                        charSequence2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, coVar.getMessagesController().getSavedMessagesController().getMessagesCount(coVar.I8())), new Object[0]);
                    } else {
                        if (coVar.f35277h4 && chat != null) {
                            TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f19869id, coVar.d());
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
                            TLRPC.ChatFull chatFull = coVar.Z7;
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
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(i19.f20016id));
                            if (user != null) {
                                i19 = user;
                            }
                            if (!UserObject.isReplyUser(i19)) {
                                long j3 = i19.f20016id;
                                if (j3 != 489000) {
                                    if (j3 == UserConfig.getInstance(i18).getClientUserId()) {
                                        charSequence2 = z13 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                    } else {
                                        long j10 = i19.f20016id;
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
                                                    if (this.f25046e0) {
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
                i16 = org.telegram.ui.ActionBar.j6.f20883pa;
            } else {
                i16 = org.telegram.ui.ActionBar.j6.B8;
            }
            this.f25039a0 = i16;
            if (this.W == null) {
                if (llVar != null) {
                    llVar.k(str);
                    Integer num = this.f25041b0;
                    if (num == null) {
                        llVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.f25039a0, f6Var));
                        llVar.setTag(Integer.valueOf(this.f25039a0));
                    } else {
                        llVar.setTextColor(num.intValue());
                    }
                } else {
                    q6Var.c(str, z10, true);
                    Integer num2 = this.f25041b0;
                    if (num2 == null) {
                        q6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.f25039a0, f6Var));
                        q6Var.setTag(Integer.valueOf(this.f25039a0));
                    } else {
                        q6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.W = str;
            }
            org.telegram.ui.ActionBar.k kVar = this.f25065u0;
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
        org.telegram.ui.co coVar = this.G;
        if (coVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (coVar.R3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        o5 o5Var = this.f25048f0;
        if (o5Var != null) {
            o5Var.a();
        }
        o5 o5Var2 = this.f25049g0;
        if (o5Var2 != null) {
            o5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.co coVar = this.G;
        if (coVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (coVar.R3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        o5 o5Var = this.f25048f0;
        if (o5Var != null) {
            o5Var.b();
        }
        o5 o5Var2 = this.f25049g0;
        if (o5Var2 != null) {
            o5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f25057o0 != null) {
            sb2.append(", ");
            sb2.append(this.f25057o0);
        }
        if (this.f25058p0 != null) {
            sb2.append(", ");
            sb2.append(this.f25058p0);
        }
        sb2.append("\n");
        org.telegram.ui.ll llVar = this.f25060r;
        if (llVar != null) {
            sb2.append(llVar.getText());
        } else {
            q6 q6Var = this.f25062s;
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
        yn ynVar = this.f25045e;
        int measuredHeight = ((currentActionBarHeight - ynVar.getMeasuredHeight()) - 2) / 2;
        if (this.K) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = measuredHeight + i14;
        if (this.f25053k0) {
            f7 = 23.66f;
        } else {
            f7 = 24.0f;
        }
        int dp = AndroidUtilities.dp(f7) + i15;
        int i16 = this.L + 1;
        int i17 = i15 + 1;
        ynVar.layout(i16, i17, ynVar.getMeasuredWidth() + i16, ynVar.getMeasuredHeight() + i17);
        int i18 = this.L;
        if (ynVar.getVisibility() == 0) {
            if (this.f25053k0) {
                f10 = 49.66f;
            } else {
                f10 = 55.0f;
            }
        } else if (this.f25053k0) {
            f10 = 13.0f;
        } else {
            f10 = 1.0f;
        }
        int dp2 = i18 + AndroidUtilities.dp(f10) + this.M;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f25055n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.ll llVar = this.h;
        if (visibility != 8) {
            llVar.layout(dp2, (AndroidUtilities.dp(1.66f) + i15) - llVar.getPaddingTop(), llVar.getMeasuredWidth() + dp2, llVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (llVar.getTextHeight() + i15)) - llVar.getPaddingTop()));
            if (j5Var != null) {
                j5Var.layout(dp2, AndroidUtilities.dp(1.66f) + i15, j5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + j5Var.getTextHeight() + i15);
            }
        } else {
            llVar.layout(dp2, (AndroidUtilities.dp(11.0f) + i15) - llVar.getPaddingTop(), llVar.getMeasuredWidth() + dp2, llVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (llVar.getTextHeight() + i15)) - llVar.getPaddingTop()));
            if (j5Var != null) {
                j5Var.layout(dp2, AndroidUtilities.dp(10.0f) + i15, j5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + j5Var.getTextHeight() + i15);
            }
        }
        ImageView imageView = this.f25067x;
        if (imageView != null) {
            int i19 = this.L;
            imageView.layout(AndroidUtilities.dp(29.0f) + i19, AndroidUtilities.dp(27.33f) + i15, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.L, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + i15);
        }
        ImageView imageView2 = this.f25066w;
        if (imageView2 != null) {
            int i20 = this.L;
            imageView2.layout(AndroidUtilities.dp(19.333f) + i20, i15 - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.L, imageView2.getMeasuredHeight() + (i15 - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.f25068y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + i15, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        org.telegram.ui.ll llVar2 = this.f25060r;
        if (llVar2 != null) {
            llVar2.layout(dp2, dp, llVar2.getMeasuredWidth() + dp2, llVar2.getTextHeight() + dp);
        } else {
            q6 q6Var = this.f25062s;
            if (q6Var != null) {
                q6Var.layout(dp2, dp, q6Var.getMeasuredWidth() + dp2, q6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) this.v.get();
        if (j5Var2 != null) {
            j5Var2.layout(dp2, dp, j5Var2.getMeasuredWidth() + dp2, j5Var2.getTextHeight() + dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        yn ynVar = this.f25045e;
        int i13 = 0;
        if (ynVar.getVisibility() == 0) {
            i12 = 54;
        } else {
            i12 = 0;
        }
        int dp = size - AndroidUtilities.dp(i12 + 16);
        float f11 = this.d;
        ynVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.ll llVar = this.h;
        llVar.measure(makeMeasureSpec, makeMeasureSpec2);
        q6 q6Var = this.f25062s;
        org.telegram.ui.ll llVar2 = this.f25060r;
        if (llVar2 != null) {
            llVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (q6Var != null) {
            q6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f25067x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f25066w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.f25068y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i14 = this.O;
        AtomicReference atomicReference = this.f25055n;
        if (i14 != -1 && i14 != size && i14 > size) {
            this.P = i14;
            View view = (org.telegram.ui.ActionBar.j5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
            atomicReference.set(j5Var);
            int i15 = org.telegram.ui.ActionBar.j6.A8;
            org.telegram.ui.ActionBar.f6 f6Var = this.f25044d0;
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
            if (this.f25053k0) {
                f7 = 17.5f;
            } else {
                f7 = 18.0f;
            }
            j5Var.setTextSizePx(AndroidUtilities.dp(f7));
            j5Var.setGravity(3);
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            j5Var.i(llVar.getRightDrawable());
            j5Var.j(llVar.getRightDrawable2());
            j5Var.setRightDrawableOutside(llVar.getRightDrawableOutside());
            j5Var.setLeftDrawable(llVar.getLeftDrawable());
            j5Var.l(llVar.getText(), false);
            ViewPropertyAnimator duration = j5Var.animate().alpha(0.0f).setDuration(350L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).withEndAction(new vn(this, 0)).start();
            addView(j5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(getContext());
            atomicReference2.set(j5Var2);
            int i16 = org.telegram.ui.ActionBar.j6.B8;
            j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var));
            j5Var2.setTag(Integer.valueOf(i16));
            if (this.f25053k0) {
                f10 = 13.5f;
            } else {
                f10 = 14.0f;
            }
            j5Var2.setTextSizePx(AndroidUtilities.dp(f10));
            j5Var2.setGravity(3);
            if (llVar2 != null) {
                j5Var2.l(llVar2.getText(), false);
            } else if (q6Var != null) {
                j5Var2.l(q6Var.getText(), false);
            }
            j5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).withEndAction(new vn(this, 1)).start();
            addView(j5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.j5 j5Var3 = (org.telegram.ui.ActionBar.j5) atomicReference.get();
        if (j5Var3 != null) {
            int i17 = this.P;
            if (ynVar.getVisibility() == 0) {
                i13 = 54;
            }
            j5Var3.measure(org.telegram.messenger.wl.d(i13 + 16, i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.O = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        zc zcVar = this.f25050h0;
        vn vnVar = this.f25051i0;
        if (action == 0 && a()) {
            this.f25052j0 = true;
            zcVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(vnVar);
            AndroidUtilities.runOnUIThread(vnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f25052j0) {
            zcVar.c(false);
            this.f25052j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(vnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f25065u0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f7;
        int i10 = this.J;
        i9 i9Var = this.I;
        i9Var.k(i10, chat);
        yn ynVar = this.f25045e;
        if (ynVar != null) {
            ynVar.e(chat, i9Var);
            if (ChatObject.isForum(chat)) {
                if (ChatObject.hasStories(chat)) {
                    f7 = 11.0f;
                } else {
                    f7 = 16.0f;
                }
            } else {
                f7 = 21.0f;
            }
            ynVar.setRoundRadius(AndroidUtilities.dp(f7));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f25067x;
        if (imageView != null) {
            if (z10 && !this.f25047f) {
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
        this.f25041b0 = num;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f25050h0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.M = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.f25042c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.ll llVar = this.f25060r;
            if (llVar != null) {
                llVar.k(charSequence);
            } else {
                q6 q6Var = this.f25062s;
                if (q6Var != null) {
                    q6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.f25065u0;
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
    public final void z(float f7, int i10) {
    }
}
