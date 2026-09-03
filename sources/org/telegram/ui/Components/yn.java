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
public class yn extends FrameLayout implements xd.b, NotificationCenter.NotificationCenterDelegate {
    public final ImageView B;
    public final x11 C;
    public final org.telegram.ui.zn D;
    public final mw0[] E;
    public final z8 F;
    public final int G;
    public boolean H;
    public int I;
    public int J;
    public mw0 K;
    public int L;
    public int M;
    public AnimatorSet N;
    public final boolean[] O;
    public final boolean[] P;
    public final boolean Q;
    public int R;
    public int S;
    public CharSequence T;
    public int U;
    public Integer V;
    public final qu0 W;
    public final xd.a f31055a;
    public final org.telegram.ui.ActionBar.f6 f31056a0;
    public boolean f31057b;
    public boolean f31058b0;
    public Integer f31059c;
    public final j5 f31060c0;
    public final int d;
    public final j5 f31061d0;
    public final un e;
    public final rc f31062e0;
    public final boolean f31063f;
    public final rn f31064f0;
    public boolean f31065g0;
    public final org.telegram.ui.kl h;
    public boolean f31066h0;
    public boolean f31067i0;
    public boolean f31068j0;
    public boolean f31069k0;
    public String f31070l0;
    public String m0;
    public final AtomicReference f31071n;
    public Drawable f31072n0;
    public Drawable f31073o0;
    public Drawable f31074p0;
    public boolean f31075q0;
    public final org.telegram.ui.kl f31076r;
    public org.telegram.ui.ActionBar.k f31077r0;
    public final k6 f31078s;
    public final AtomicReference v;
    public final ImageView f31079w;
    public final ImageView f31080x;
    public final ImageView f31081y;

    public yn(android.content.Context r22, org.telegram.ui.ActionBar.p2 r23, boolean r24, org.telegram.ui.ActionBar.f6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yn.<init>(android.content.Context, org.telegram.ui.ActionBar.p2, boolean, org.telegram.ui.ActionBar.f6):void");
    }

    private void setTypingAnimation(boolean z4) {
        org.telegram.ui.zn znVar = this.D;
        org.telegram.ui.kl klVar = this.f31076r;
        if (klVar != null) {
            int i10 = 0;
            mw0[] mw0VarArr = this.E;
            if (z4) {
                try {
                    int intValue = MessagesController.getInstance(this.G).getPrintingStringType(znVar.a(), znVar.f40514a4).intValue();
                    mw0 mw0Var = mw0VarArr[intValue];
                    if (mw0Var != null) {
                        org.telegram.ui.ActionBar.f6 f6Var = this.f31056a0;
                        if (intValue == 5) {
                            klVar.g(mw0Var, "**oo**");
                            mw0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20100pa, f6Var));
                            klVar.setLeftDrawable((Drawable) null);
                        } else {
                            klVar.g(null, null);
                            mw0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20100pa, f6Var));
                            klVar.setLeftDrawable(mw0VarArr[intValue]);
                        }
                        this.K = mw0VarArr[intValue];
                        while (i10 < mw0VarArr.length) {
                            mw0 mw0Var2 = mw0VarArr[i10];
                            if (mw0Var2 != null) {
                                if (i10 == intValue) {
                                    mw0Var2.d();
                                } else {
                                    mw0Var2.e();
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
            this.K = null;
            klVar.setLeftDrawable((Drawable) null);
            klVar.g(null, null);
            while (i10 < mw0VarArr.length) {
                mw0 mw0Var3 = mw0VarArr[i10];
                if (mw0Var3 != null) {
                    mw0Var3.e();
                }
                i10++;
            }
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        ImageView imageView;
        int i11;
        if (i10 == 0 && (imageView = this.f31079w) != null) {
            imageView.setAlpha(f10);
            float f12 = 0.85f * f10;
            imageView.setScaleX(f12);
            imageView.setScaleY(f12);
            if (f10 > 0.0f) {
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
        float f10;
        int i10;
        org.telegram.ui.zn znVar = this.D;
        if (znVar != null) {
            TLRPC.User i11 = znVar.i();
            TLRPC.Chat chat = znVar.e;
            if (znVar.O3 == 3) {
                long I8 = znVar.I8();
                if (I8 >= 0) {
                    user = znVar.getMessagesController().getUser(Long.valueOf(I8));
                    chat = null;
                } else {
                    chat = znVar.getMessagesController().getChat(Long.valueOf(-I8));
                    user = null;
                }
            } else {
                user = i11;
            }
            int i12 = this.G;
            z8 z8Var = this.F;
            un unVar = this.e;
            if (user != null) {
                z8Var.m(i12, user);
                if (UserObject.isReplyUser(user)) {
                    z8Var.f31293p = 0.8f;
                    z8Var.g(12);
                    if (unVar != null) {
                        unVar.setAnimatedEmojiDrawable(null);
                        unVar.h(null, null, z8Var, user);
                    }
                } else if (UserObject.isAnonymous(user)) {
                    z8Var.f31293p = 0.8f;
                    z8Var.g(21);
                    if (unVar != null) {
                        unVar.setAnimatedEmojiDrawable(null);
                        unVar.h(null, null, z8Var, user);
                    }
                } else if (UserObject.isUserSelf(user) && znVar.O3 == 3) {
                    z8Var.f31293p = 0.8f;
                    z8Var.g(22);
                    if (unVar != null) {
                        unVar.setAnimatedEmojiDrawable(null);
                        unVar.h(null, null, z8Var, user);
                    }
                } else if (UserObject.isUserSelf(user)) {
                    z8Var.f31293p = 0.8f;
                    z8Var.g(1);
                    if (unVar != null) {
                        unVar.setAnimatedEmojiDrawable(null);
                        unVar.h(null, null, z8Var, user);
                    }
                } else {
                    z8Var.f31293p = 1.0f;
                    if (unVar != null) {
                        unVar.setAnimatedEmojiDrawable(null);
                        unVar.f27801a.setForUserOrChat(user, z8Var, null, true, 3, false);
                    }
                }
            } else if (ChatObject.isMonoForum(chat)) {
                long d = znVar.d();
                if (ChatObject.canManageMonoForum(i12, chat) && d != 0) {
                    if (i10 > 0) {
                        TLRPC.User user2 = znVar.getMessagesController().getUser(Long.valueOf(d));
                        z8Var.r(user2);
                        unVar.setAnimatedEmojiDrawable(null);
                        unVar.e(user2, z8Var);
                    } else {
                        TLRPC.Chat chat2 = znVar.getMessagesController().getChat(Long.valueOf(-d));
                        z8Var.q(chat2);
                        unVar.setAnimatedEmojiDrawable(null);
                        unVar.e(chat2, z8Var);
                    }
                } else {
                    unVar.setAnimatedEmojiDrawable(null);
                    ag.f.o(i12, chat, z8Var, unVar);
                }
                unVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            } else if (chat != null) {
                z8Var.f31293p = 1.0f;
                z8Var.k(i12, chat);
                if (unVar != null) {
                    unVar.setAnimatedEmojiDrawable(null);
                    unVar.e(chat, z8Var);
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
                    unVar.setRoundRadius(dp);
                }
            }
        }
    }

    public final j5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        j5 j5Var = this.f31061d0;
        j5Var.j(j10, false);
        j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.f31056a0)));
        int dp = AndroidUtilities.dp(1.0f);
        j5Var.F = 0;
        j5Var.G = dp;
        return j5Var;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(this.G).getConnectionState();
            if (this.S != connectionState) {
                this.S = connectionState;
                l();
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.kl klVar = this.h;
            if (klVar != null) {
                klVar.invalidate();
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
        float a2 = this.f31062e0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        if (view == this.e) {
            boolean z10 = false;
            ImageView imageView = this.f31079w;
            if (imageView != null && imageView.getVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ImageView imageView2 = this.f31080x;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z10 = true;
            }
            if (z4 || z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (z4) {
                    float width = (imageView.getWidth() / 2.0f) + imageView.getX();
                    float height = (imageView.getHeight() / 2.0f) + imageView.getY();
                    canvas.drawCircle(width, height - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.j6.Il);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.j6.Il);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yn.e(boolean, boolean):void");
    }

    public final void g(int i10, boolean z4) {
        x11 x11Var = this.C;
        if (x11Var != null) {
            boolean z10 = this.f31067i0;
            if (i10 == 0 && !this.Q) {
                return;
            }
            xd.a aVar = this.f31055a;
            if (!z10) {
                aVar.a(true, z4);
                x11Var.b(i10);
                return;
            }
            aVar.a(false, z4);
        }
    }

    public p9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.U;
    }

    public int getLeftPadding() {
        return this.I;
    }

    public qu0 getSharedMediaPreloader() {
        return this.W;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.kl klVar = this.f31076r;
        if (klVar != null) {
            return klVar.getTextPaint();
        }
        return this.f31078s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.kl klVar = this.f31076r;
        if (klVar != null) {
            return klVar;
        }
        k6 k6Var = this.f31078s;
        if (k6Var != null) {
            return k6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f31079w;
    }

    public org.telegram.ui.ActionBar.k5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int dp;
        float f10 = 0.0f;
        org.telegram.ui.kl klVar = this.h;
        if (klVar != null) {
            f10 = Math.max(0.0f, klVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.kl klVar2 = this.f31076r;
        if (klVar2 != null) {
            f10 = Math.max(f10, klVar2.getExactWidthIncludeDrawables());
        }
        un unVar = this.e;
        if (unVar != null && unVar.getVisibility() == 0) {
            dp = AndroidUtilities.dp(70.0f);
        } else {
            dp = AndroidUtilities.dp(34.0f);
        }
        return (int) (f10 + dp);
    }

    public final void h(CharSequence charSequence, boolean z4, boolean z10, boolean z11, boolean z12, TLRPC.EmojiStatus emojiStatus, boolean z13) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.f31069k0 = false;
        if (!z4 && !z10) {
            if (z11) {
                Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
                this.f31073o0 = mutate;
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.f31056a0);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
                Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
                this.f31074p0 = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, this.f31056a0), mode));
                this.h.j(new mq(this.f31073o0, this.f31074p0));
                this.f31068j0 = true;
                this.m0 = LocaleController.getString(R.string.AccDescrVerified);
            } else if (this.h.getRightDrawable() instanceof em0) {
                this.h.j(null);
                this.f31068j0 = false;
                this.m0 = null;
            }
        } else {
            this.f31069k0 = true;
            if (!(this.h.getRightDrawable() instanceof em0)) {
                em0 em0Var = new em0(!z4 ? 1 : 0);
                em0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.f31056a0));
                this.h.j(em0Var);
                this.m0 = LocaleController.getString(R.string.ScamMessage);
                this.f31068j0 = true;
            }
        }
        if (!z12 && DialogObject.getEmojiStatusDocumentId(emojiStatus) == 0) {
            this.h.i(null);
            this.f31070l0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof k5) && (((k5) this.h.getRightDrawable()).f26165a instanceof l5)) {
                ((l5) ((k5) this.h.getRightDrawable()).f26165a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f31060c0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z13);
            } else if (z12) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.f31072n0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.f31056a0), PorterDuff.Mode.MULTIPLY));
                this.f31060c0.g(this.f31072n0, z13);
            } else {
                this.f31060c0.g(null, z13);
            }
            this.f31060c0.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.f31056a0)));
            this.h.i(this.f31060c0);
            this.f31068j0 = false;
            this.f31070l0 = LocaleController.getString(R.string.AccDescrPremium);
        }
        org.telegram.ui.ActionBar.k kVar = this.f31077r0;
        if (kVar != null) {
            kVar.d(z13);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.kl klVar = this.f31076r;
        klVar.setTextColor(i11);
        klVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.kl klVar = this.h;
        klVar.setLeftDrawable(drawable);
        if (!this.f31068j0 && !this.f31069k0) {
            if (drawable2 != null) {
                this.m0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.m0 = null;
            }
            klVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.f31077r0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z4) {
        int i10 = this.G;
        z8 z8Var = this.F;
        z8Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        un unVar = this.e;
        if (isReplyUser) {
            z8Var.g(12);
            z8Var.f31293p = 0.8f;
            if (unVar != null) {
                unVar.h(null, null, z8Var, user);
            }
        } else if (UserObject.isAnonymous(user)) {
            z8Var.g(21);
            z8Var.f31293p = 0.8f;
            if (unVar != null) {
                unVar.h(null, null, z8Var, user);
            }
        } else if (UserObject.isUserSelf(user) && !z4) {
            z8Var.g(1);
            z8Var.f31293p = 0.8f;
            if (unVar != null) {
                unVar.h(null, null, z8Var, user);
            }
        } else {
            z8Var.f31293p = 1.0f;
            if (unVar != null) {
                unVar.e(user, z8Var);
            }
        }
    }

    public final void l() {
        String str;
        int i10 = this.S;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f31056a0;
        k6 k6Var = this.f31078s;
        org.telegram.ui.kl klVar = this.f31076r;
        if (str == null) {
            CharSequence charSequence = this.T;
            if (charSequence != null) {
                if (klVar != null) {
                    klVar.k(charSequence);
                    this.T = null;
                    Integer num = this.V;
                    if (num != null) {
                        klVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.U;
                        if (i11 >= 0) {
                            klVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                            klVar.setTag(Integer.valueOf(this.U));
                        }
                    }
                } else if (k6Var != null) {
                    k6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.T = null;
                    Integer num2 = this.V;
                    if (num2 != null) {
                        k6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.U;
                        if (i12 >= 0) {
                            k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                            k6Var.setTag(Integer.valueOf(this.U));
                        }
                    }
                }
            }
        } else if (klVar != null) {
            if (this.T == null) {
                this.T = klVar.getText();
            }
            klVar.k(str);
            Integer num3 = this.V;
            if (num3 != null) {
                klVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.B8;
                klVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                klVar.setTag(Integer.valueOf(i13));
            }
        } else if (k6Var != null) {
            if (this.T == null) {
                this.T = k6Var.getText();
            }
            k6Var.c(str, !LocaleController.isRTL, true);
            Integer num4 = this.V;
            if (num4 != null) {
                k6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.B8;
                k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
                k6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.f31077r0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z4;
        org.telegram.ui.zn znVar = this.D;
        if (znVar != null) {
            this.R = 0;
            TLRPC.ChatFull chatFull = znVar.W7;
            if (chatFull != null) {
                int i10 = this.G;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z4 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (z4 && chatFull.participants_count > 200) {
                        this.R = chatFull.online_count;
                        return;
                    }
                    return;
                }
                for (int i11 = 0; i11 < chatFull.participants.participants.size(); i11++) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(chatFull.participants.participants.get(i11).user_id));
                    if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f19306id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
                        this.R++;
                    }
                }
            }
        }
    }

    public final void n(boolean z4) {
        boolean z10;
        int i10;
        boolean[] zArr;
        boolean z11;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f31056a0;
        boolean[] zArr2 = this.O;
        k6 k6Var = this.f31078s;
        org.telegram.ui.kl klVar = this.f31076r;
        org.telegram.ui.kl klVar2 = this.h;
        int i18 = this.G;
        org.telegram.ui.zn znVar = this.D;
        if (znVar != null) {
            if (znVar.O3 == 6) {
                String str2 = znVar.M3.link;
                uf.t[] tVarArr = uf.t.e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                setSubtitle(str2);
                return;
            }
            TLRPC.User i19 = znVar.i();
            TLRPC.Chat chat = znVar.e;
            if (UserObject.isUserSelf(i19) && znVar.O3 == 0 && znVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.f31075q0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((UserObject.isUserSelf(i19) && !z10) || UserObject.isReplyUser(i19) || ((i19 != null && i19.f19306id == 489000) || ((i10 = znVar.O3) != 0 && i10 != 8))) && znVar.O3 != 3) {
                if (getSubtitleTextView().getVisibility() != 8) {
                    getSubtitleTextView().setVisibility(8);
                    return;
                }
                return;
            }
            if (z10) {
                if (getSubtitleTextView().getVisibility() != 0) {
                    i17 = 0;
                    getSubtitleTextView().setVisibility(0);
                } else {
                    i17 = 0;
                }
                if (!this.f31075q0) {
                    MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i17) + 1).apply();
                    this.f31075q0 = true;
                }
            }
            CharSequence printingString = MessagesController.getInstance(i18).getPrintingString(znVar.a(), znVar.f40514a4, false);
            if (printingString == null) {
                UserObject.isBotForum(i19);
            }
            CharSequence charSequence2 = "";
            if (printingString != null) {
                printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z12 = z10;
            if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                if (znVar.F9() && klVar2.getTag() != null) {
                    klVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.N;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.N = null;
                    }
                    if (z4) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.N = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(klVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.N.addListener(new xn(this, 1));
                        this.N.setDuration(180L);
                        this.N.start();
                    } else {
                        klVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer printingStringType = MessagesController.getInstance(i18).getPrintingStringType(znVar.a(), znVar.f40514a4);
                if (printingStringType != null && printingStringType.intValue() == 5) {
                    charSequence = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
                } else {
                    charSequence = printingString;
                }
                setTypingAnimation(true);
                z11 = true;
                str = charSequence;
            } else if (znVar.F9() && !znVar.f40567e4) {
                if (klVar2.getTag() == null) {
                    klVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.N;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.N = null;
                    }
                    if (z4) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.N = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(klVar2, property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.N.addListener(new xn(this, 0));
                        this.N.setDuration(180L);
                        this.N.start();
                        return;
                    }
                    klVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = znVar.O3;
                if (i20 == 8) {
                    if (znVar.Q3) {
                        charSequence2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    } else if (znVar.d() == 0) {
                        int topicsCount = znVar.getMessagesController().getTopicsController().getTopicsCount(-znVar.a());
                        if (topicsCount > 0) {
                            string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                        } else {
                            string = LocaleController.getString(R.string.ChatMessageSuggestions);
                        }
                        charSequence2 = string;
                    } else {
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f19159id, znVar.d());
                        if (findTopic != null) {
                            i15 = findTopic.totalMessagesCount;
                        } else {
                            i15 = 0;
                        }
                        if (i15 > 0) {
                            z11 = false;
                            formatString = LocaleController.formatPluralString("messages", i15, Integer.valueOf(i15));
                        } else {
                            z11 = false;
                            formatString = LocaleController.formatString(R.string.TopicProfileStatus, ag.f.i(chat, i18, false));
                        }
                        str = formatString;
                    }
                    z11 = false;
                    str = charSequence2;
                } else {
                    if (i20 == 3) {
                        charSequence2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, znVar.getMessagesController().getSavedMessagesController().getMessagesCount(znVar.I8())), new Object[0]);
                    } else {
                        if (znVar.f40567e4 && chat != null) {
                            TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f19159id, znVar.d());
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
                            TLRPC.ChatFull chatFull = znVar.W7;
                            int i22 = this.R;
                            if (ChatObject.isChannel(chat)) {
                                if (chatFull != null && (i12 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i22 > 1) {
                                            formatPluralString = android.support.v4.media.a.z(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i22, chatFull.participants_count), new Object[0]));
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
                                    formatPluralString = android.support.v4.media.a.z(LocaleController.formatPluralString("Members", i24, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i22, new Object[0]));
                                } else {
                                    formatPluralString = LocaleController.formatPluralString("Members", i24, new Object[0]);
                                }
                            }
                        } else if (i19 != null) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(i19.f19306id));
                            if (user != null) {
                                i19 = user;
                            }
                            if (!UserObject.isReplyUser(i19)) {
                                long j10 = i19.f19306id;
                                if (j10 != 489000) {
                                    if (j10 == UserConfig.getInstance(i18).getClientUserId()) {
                                        charSequence2 = z12 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                    } else {
                                        long j11 = i19.f19306id;
                                        if (j11 != 333000 && j11 != 777000 && j11 != 42777) {
                                            if (MessagesController.isSupportUser(i19)) {
                                                charSequence2 = LocaleController.getString(R.string.SupportStatus);
                                            } else {
                                                boolean z13 = i19.bot;
                                                if (z13 && (i11 = i19.bot_active_users) != 0) {
                                                    charSequence2 = LocaleController.formatPluralStringComma("BotUsers", i11, ',');
                                                } else if (z13) {
                                                    charSequence2 = LocaleController.getString(R.string.Bot);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f31058b0) {
                                                        zArr = this.P;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    String formatUserStatus = LocaleController.formatUserStatus(i18, i19, zArr2, zArr);
                                                    z11 = zArr2[0];
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
                    z11 = false;
                    str = charSequence2;
                }
            }
            if (z11) {
                i16 = org.telegram.ui.ActionBar.j6.f20100pa;
            } else {
                i16 = org.telegram.ui.ActionBar.j6.B8;
            }
            this.U = i16;
            if (this.T == null) {
                if (klVar != null) {
                    klVar.k(str);
                    Integer num = this.V;
                    if (num == null) {
                        klVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.U, f6Var));
                        klVar.setTag(Integer.valueOf(this.U));
                    } else {
                        klVar.setTextColor(num.intValue());
                    }
                } else {
                    k6Var.c(str, z4, true);
                    Integer num2 = this.V;
                    if (num2 == null) {
                        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.U, f6Var));
                        k6Var.setTag(Integer.valueOf(this.U));
                    } else {
                        k6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.T = str;
            }
            org.telegram.ui.ActionBar.k kVar = this.f31077r0;
            if (kVar != null) {
                kVar.d(z4);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.zn znVar = this.D;
        if (znVar != null) {
            int i10 = this.G;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (znVar.O3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.S = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        j5 j5Var = this.f31060c0;
        if (j5Var != null) {
            j5Var.a();
        }
        j5 j5Var2 = this.f31061d0;
        if (j5Var2 != null) {
            j5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.zn znVar = this.D;
        if (znVar != null) {
            int i10 = this.G;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (znVar.O3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        j5 j5Var = this.f31060c0;
        if (j5Var != null) {
            j5Var.b();
        }
        j5 j5Var2 = this.f31061d0;
        if (j5Var2 != null) {
            j5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.getText());
        if (this.f31070l0 != null) {
            sb.append(", ");
            sb.append(this.f31070l0);
        }
        if (this.m0 != null) {
            sb.append(", ");
            sb.append(this.m0);
        }
        sb.append("\n");
        org.telegram.ui.kl klVar = this.f31076r;
        if (klVar != null) {
            sb.append(klVar.getText());
        } else {
            k6 k6Var = this.f31078s;
            if (k6Var != null) {
                sb.append(k6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.OpenProfile)));
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        un unVar = this.e;
        int measuredHeight = ((currentActionBarHeight - unVar.getMeasuredHeight()) - 2) / 2;
        if (this.H) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = measuredHeight + i14;
        if (this.f31066h0) {
            f10 = 23.66f;
        } else {
            f10 = 24.0f;
        }
        int dp = AndroidUtilities.dp(f10) + i15;
        int i16 = this.I + 1;
        int i17 = i15 + 1;
        unVar.layout(i16, i17, unVar.getMeasuredWidth() + i16, unVar.getMeasuredHeight() + i17);
        int i18 = this.I;
        if (unVar.getVisibility() == 0) {
            if (this.f31066h0) {
                f11 = 49.66f;
            } else {
                f11 = 55.0f;
            }
        } else if (this.f31066h0) {
            f11 = 13.0f;
        } else {
            f11 = 1.0f;
        }
        int dp2 = i18 + AndroidUtilities.dp(f11) + this.J;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.f31071n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.kl klVar = this.h;
        if (visibility != 8) {
            klVar.layout(dp2, (AndroidUtilities.dp(1.66f) + i15) - klVar.getPaddingTop(), klVar.getMeasuredWidth() + dp2, klVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (klVar.getTextHeight() + i15)) - klVar.getPaddingTop()));
            if (k5Var != null) {
                k5Var.layout(dp2, AndroidUtilities.dp(1.66f) + i15, k5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + k5Var.getTextHeight() + i15);
            }
        } else {
            klVar.layout(dp2, (AndroidUtilities.dp(11.0f) + i15) - klVar.getPaddingTop(), klVar.getMeasuredWidth() + dp2, klVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (klVar.getTextHeight() + i15)) - klVar.getPaddingTop()));
            if (k5Var != null) {
                k5Var.layout(dp2, AndroidUtilities.dp(10.0f) + i15, k5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + k5Var.getTextHeight() + i15);
            }
        }
        ImageView imageView = this.f31080x;
        if (imageView != null) {
            int i19 = this.I;
            imageView.layout(AndroidUtilities.dp(29.0f) + i19, AndroidUtilities.dp(27.33f) + i15, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.I, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + i15);
        }
        ImageView imageView2 = this.f31079w;
        if (imageView2 != null) {
            int i20 = this.I;
            imageView2.layout(AndroidUtilities.dp(19.333f) + i20, i15 - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.I, imageView2.getMeasuredHeight() + (i15 - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.f31081y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.I, AndroidUtilities.dp(24.0f) + i15, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.I, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        ImageView imageView4 = this.B;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.I, AndroidUtilities.dp(24.0f) + i15, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.I, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        org.telegram.ui.kl klVar2 = this.f31076r;
        if (klVar2 != null) {
            klVar2.layout(dp2, dp, klVar2.getMeasuredWidth() + dp2, klVar2.getTextHeight() + dp);
        } else {
            k6 k6Var = this.f31078s;
            if (k6Var != null) {
                k6Var.layout(dp2, dp, k6Var.getMeasuredWidth() + dp2, k6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) this.v.get();
        if (k5Var2 != null) {
            k5Var2.layout(dp2, dp, k5Var2.getMeasuredWidth() + dp2, k5Var2.getTextHeight() + dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i10);
        un unVar = this.e;
        int i13 = 0;
        if (unVar.getVisibility() == 0) {
            i12 = 54;
        } else {
            i12 = 0;
        }
        int dp = size - AndroidUtilities.dp(i12 + 16);
        float f12 = this.d;
        unVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f12) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f12) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.kl klVar = this.h;
        klVar.measure(makeMeasureSpec, makeMeasureSpec2);
        k6 k6Var = this.f31078s;
        org.telegram.ui.kl klVar2 = this.f31076r;
        if (klVar2 != null) {
            klVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (k6Var != null) {
            k6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f31080x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f31079w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.f31081y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.B;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i14 = this.L;
        AtomicReference atomicReference = this.f31071n;
        if (i14 != -1 && i14 != size && i14 > size) {
            this.M = i14;
            View view = (org.telegram.ui.ActionBar.k5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
            atomicReference.set(k5Var);
            int i15 = org.telegram.ui.ActionBar.j6.A8;
            org.telegram.ui.ActionBar.f6 f6Var = this.f31056a0;
            k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
            if (this.f31066h0) {
                f10 = 17.5f;
            } else {
                f10 = 18.0f;
            }
            k5Var.setTextSizePx(AndroidUtilities.dp(f10));
            k5Var.setGravity(3);
            k5Var.setTypeface(AndroidUtilities.bold());
            k5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            k5Var.i(klVar.getRightDrawable());
            k5Var.j(klVar.getRightDrawable2());
            k5Var.setRightDrawableOutside(klVar.getRightDrawableOutside());
            k5Var.setLeftDrawable(klVar.getLeftDrawable());
            k5Var.l(klVar.getText(), false);
            ViewPropertyAnimator duration = k5Var.animate().alpha(0.0f).setDuration(350L);
            mr mrVar = mr.h;
            duration.setInterpolator(mrVar).withEndAction(new rn(this, 0)).start();
            addView(k5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(getContext());
            atomicReference2.set(k5Var2);
            int i16 = org.telegram.ui.ActionBar.j6.B8;
            k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var));
            k5Var2.setTag(Integer.valueOf(i16));
            if (this.f31066h0) {
                f11 = 13.5f;
            } else {
                f11 = 14.0f;
            }
            k5Var2.setTextSizePx(AndroidUtilities.dp(f11));
            k5Var2.setGravity(3);
            if (klVar2 != null) {
                k5Var2.l(klVar2.getText(), false);
            } else if (k6Var != null) {
                k5Var2.l(k6Var.getText(), false);
            }
            k5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(mrVar).withEndAction(new rn(this, 1)).start();
            addView(k5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.k5 k5Var3 = (org.telegram.ui.ActionBar.k5) atomicReference.get();
        if (k5Var3 != null) {
            int i17 = this.M;
            if (unVar.getVisibility() == 0) {
                i13 = 54;
            }
            k5Var3.measure(org.telegram.ui.b.d(i13 + 16, i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.L = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        rc rcVar = this.f31062e0;
        rn rnVar = this.f31064f0;
        if (action == 0 && a()) {
            this.f31065g0 = true;
            rcVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(rnVar);
            AndroidUtilities.runOnUIThread(rnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f31065g0) {
            rcVar.c(false);
            this.f31065g0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(rnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f31077r0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f10;
        int i10 = this.G;
        z8 z8Var = this.F;
        z8Var.k(i10, chat);
        un unVar = this.e;
        if (unVar != null) {
            unVar.e(chat, z8Var);
            if (ChatObject.isForum(chat)) {
                if (ChatObject.hasStories(chat)) {
                    f10 = 11.0f;
                } else {
                    f10 = 16.0f;
                }
            } else {
                f10 = 21.0f;
            }
            unVar.setRoundRadius(AndroidUtilities.dp(f10));
        }
    }

    public void setCommunityItemVisible(boolean z4) {
        int i10;
        ImageView imageView = this.f31080x;
        if (imageView != null) {
            if (z4 && !this.f31063f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setLeftPadding(int i10) {
        this.I = i10;
    }

    public void setOccupyStatusBar(boolean z4) {
        this.H = z4;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.V = num;
    }

    @Override
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        this.f31062e0.c(z4);
    }

    public void setRightAvatarPadding(int i10) {
        this.J = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.f31059c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.T == null) {
            org.telegram.ui.kl klVar = this.f31076r;
            if (klVar != null) {
                klVar.k(charSequence);
            } else {
                k6 k6Var = this.f31078s;
                if (k6Var != null) {
                    k6Var.setText(charSequence);
                }
            }
        } else {
            this.T = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.f31077r0;
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
    public final void z(float f10, int i10) {
    }
}
