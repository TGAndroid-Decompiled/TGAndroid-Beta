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
public class xn extends FrameLayout implements vd.b, NotificationCenter.NotificationCenterDelegate {
    public final ImageView A;
    public final m11 B;
    public final org.telegram.ui.tn C;
    public final dw0[] D;
    public final e9 E;
    public final int F;
    public boolean G;
    public int H;
    public int I;
    public dw0 J;
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
    public final iu0 V;
    public final org.telegram.ui.ActionBar.c6 W;
    public final vd.a f34783a;
    public boolean f34784a0;
    public boolean f34785b;
    public final n5 f34786b0;
    public Integer f34787c;
    public final n5 f34788c0;
    public final int d;
    public final uc f34789d0;
    public final tn f34790e;
    public final qn f34791e0;
    public final boolean f34792f;
    public boolean f34793f0;
    public boolean f34794g0;
    public final org.telegram.ui.cl h;
    public boolean f34795h0;
    public boolean f34796i0;
    public boolean f34797j0;
    public String f34798k0;
    public String f34799l0;
    public Drawable m0;
    public final AtomicReference f34800n;
    public Drawable f34801n0;
    public Drawable f34802o0;
    public boolean f34803p0;
    public org.telegram.ui.ActionBar.l f34804q0;
    public final org.telegram.ui.cl f34805r;
    public final o6 f34806s;
    public final AtomicReference v;
    public final ImageView f34807w;
    public final ImageView f34808x;
    public final ImageView f34809y;

    public xn(android.content.Context r22, org.telegram.ui.ActionBar.o2 r23, boolean r24, org.telegram.ui.ActionBar.c6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xn.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, boolean, org.telegram.ui.ActionBar.c6):void");
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.tn tnVar = this.C;
        org.telegram.ui.cl clVar = this.f34805r;
        if (clVar != null) {
            int i10 = 0;
            dw0[] dw0VarArr = this.D;
            if (z10) {
                try {
                    int intValue = MessagesController.getInstance(this.F).getPrintingStringType(tnVar.a(), tnVar.Z3).intValue();
                    dw0 dw0Var = dw0VarArr[intValue];
                    if (dw0Var != null) {
                        org.telegram.ui.ActionBar.c6 c6Var = this.W;
                        if (intValue == 5) {
                            clVar.g(dw0Var, "**oo**");
                            dw0VarArr[intValue].b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23282pa, c6Var));
                            clVar.setLeftDrawable((Drawable) null);
                        } else {
                            clVar.g(null, null);
                            dw0VarArr[intValue].b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23282pa, c6Var));
                            clVar.setLeftDrawable(dw0VarArr[intValue]);
                        }
                        this.J = dw0VarArr[intValue];
                        while (i10 < dw0VarArr.length) {
                            dw0 dw0Var2 = dw0VarArr[i10];
                            if (dw0Var2 != null) {
                                if (i10 == intValue) {
                                    dw0Var2.d();
                                } else {
                                    dw0Var2.e();
                                }
                            }
                            i10++;
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
            clVar.setLeftDrawable((Drawable) null);
            clVar.g(null, null);
            while (i10 < dw0VarArr.length) {
                dw0 dw0Var3 = dw0VarArr[i10];
                if (dw0Var3 != null) {
                    dw0Var3.e();
                }
                i10++;
            }
        }
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        ImageView imageView;
        int i11;
        if (i10 == 0 && (imageView = this.f34807w) != null) {
            imageView.setAlpha(f9);
            float f11 = 0.85f * f9;
            imageView.setScaleX(f11);
            imageView.setScaleY(f11);
            if (f9 > 0.0f) {
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
        float f9;
        int i10;
        org.telegram.ui.tn tnVar = this.C;
        if (tnVar != null) {
            TLRPC.User i11 = tnVar.i();
            TLRPC.Chat chat = tnVar.f42787e;
            if (tnVar.N3 == 3) {
                long I8 = tnVar.I8();
                if (I8 >= 0) {
                    user = tnVar.getMessagesController().getUser(Long.valueOf(I8));
                    chat = null;
                } else {
                    chat = tnVar.getMessagesController().getChat(Long.valueOf(-I8));
                    user = null;
                }
            } else {
                user = i11;
            }
            int i12 = this.F;
            e9 e9Var = this.E;
            tn tnVar2 = this.f34790e;
            if (user != null) {
                e9Var.m(i12, user);
                if (UserObject.isReplyUser(user)) {
                    e9Var.f27964p = 0.8f;
                    e9Var.g(12);
                    if (tnVar2 != null) {
                        tnVar2.setAnimatedEmojiDrawable(null);
                        tnVar2.h(null, null, e9Var, user);
                    }
                } else if (UserObject.isAnonymous(user)) {
                    e9Var.f27964p = 0.8f;
                    e9Var.g(21);
                    if (tnVar2 != null) {
                        tnVar2.setAnimatedEmojiDrawable(null);
                        tnVar2.h(null, null, e9Var, user);
                    }
                } else if (UserObject.isUserSelf(user) && tnVar.N3 == 3) {
                    e9Var.f27964p = 0.8f;
                    e9Var.g(22);
                    if (tnVar2 != null) {
                        tnVar2.setAnimatedEmojiDrawable(null);
                        tnVar2.h(null, null, e9Var, user);
                    }
                } else if (UserObject.isUserSelf(user)) {
                    e9Var.f27964p = 0.8f;
                    e9Var.g(1);
                    if (tnVar2 != null) {
                        tnVar2.setAnimatedEmojiDrawable(null);
                        tnVar2.h(null, null, e9Var, user);
                    }
                } else {
                    e9Var.f27964p = 1.0f;
                    if (tnVar2 != null) {
                        tnVar2.setAnimatedEmojiDrawable(null);
                        tnVar2.f32903a.setForUserOrChat(user, e9Var, null, true, 3, false);
                    }
                }
            } else if (ChatObject.isMonoForum(chat)) {
                long b10 = tnVar.b();
                if (ChatObject.canManageMonoForum(i12, chat) && b10 != 0) {
                    if (i10 > 0) {
                        TLRPC.User user2 = tnVar.getMessagesController().getUser(Long.valueOf(b10));
                        e9Var.r(user2);
                        tnVar2.setAnimatedEmojiDrawable(null);
                        tnVar2.e(user2, e9Var);
                    } else {
                        TLRPC.Chat chat2 = tnVar.getMessagesController().getChat(Long.valueOf(-b10));
                        e9Var.q(chat2);
                        tnVar2.setAnimatedEmojiDrawable(null);
                        tnVar2.e(chat2, e9Var);
                    }
                } else {
                    tnVar2.setAnimatedEmojiDrawable(null);
                    yf.d.o(i12, chat, e9Var, tnVar2);
                }
                tnVar2.setRoundRadius(AndroidUtilities.dp(21.0f));
            } else if (chat != null) {
                e9Var.f27964p = 1.0f;
                e9Var.k(i12, chat);
                if (tnVar2 != null) {
                    tnVar2.setAnimatedEmojiDrawable(null);
                    tnVar2.e(chat, e9Var);
                    if (chat.forum) {
                        if (ChatObject.hasStories(chat)) {
                            f9 = 11.0f;
                        } else {
                            f9 = 16.0f;
                        }
                        dp = AndroidUtilities.dp(f9);
                    } else {
                        dp = AndroidUtilities.dp(21.0f);
                    }
                    tnVar2.setRoundRadius(dp);
                }
            }
        }
    }

    public final n5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        n5 n5Var = this.f34788c0;
        n5Var.j(j10, false);
        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W)));
        int dp = AndroidUtilities.dp(1.0f);
        n5Var.E = 0;
        n5Var.F = dp;
        return n5Var;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(this.F).getConnectionState();
            if (this.R != connectionState) {
                this.R = connectionState;
                l();
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.cl clVar = this.h;
            if (clVar != null) {
                clVar.invalidate();
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
        float a2 = this.f34789d0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (view == this.f34790e) {
            boolean z11 = false;
            ImageView imageView = this.f34807w;
            if (imageView != null && imageView.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView2 = this.f34808x;
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
                    canvas.drawCircle(width, height - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.g6.Il);
                }
                if (z11) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.g6.Il);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xn.e(boolean, boolean):void");
    }

    public final void g(int i10, boolean z10) {
        m11 m11Var = this.B;
        if (m11Var != null) {
            boolean z11 = this.f34795h0;
            if (i10 == 0 && !this.P) {
                return;
            }
            vd.a aVar = this.f34783a;
            if (!z11) {
                aVar.a(true, z10);
                m11Var.b(i10);
                return;
            }
            aVar.a(false, z10);
        }
    }

    public t9 getAvatarImageView() {
        return this.f34790e;
    }

    public int getLastSubtitleColorKey() {
        return this.T;
    }

    public int getLeftPadding() {
        return this.H;
    }

    public iu0 getSharedMediaPreloader() {
        return this.V;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.cl clVar = this.f34805r;
        if (clVar != null) {
            return clVar.getTextPaint();
        }
        return this.f34806s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.cl clVar = this.f34805r;
        if (clVar != null) {
            return clVar;
        }
        o6 o6Var = this.f34806s;
        if (o6Var != null) {
            return o6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f34807w;
    }

    public org.telegram.ui.ActionBar.h5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int dp;
        float f9 = 0.0f;
        org.telegram.ui.cl clVar = this.h;
        if (clVar != null) {
            f9 = Math.max(0.0f, clVar.getExactWidthIncludeDrawables());
        }
        org.telegram.ui.cl clVar2 = this.f34805r;
        if (clVar2 != null) {
            f9 = Math.max(f9, clVar2.getExactWidthIncludeDrawables());
        }
        tn tnVar = this.f34790e;
        if (tnVar != null && tnVar.getVisibility() == 0) {
            dp = AndroidUtilities.dp(70.0f);
        } else {
            dp = AndroidUtilities.dp(34.0f);
        }
        return (int) (f9 + dp);
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.f34797j0 = false;
        if (!z10 && !z11) {
            if (z12) {
                Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
                this.f34801n0 = mutate;
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
                Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
                this.f34802o0 = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, this.W), mode));
                this.h.j(new jq(this.f34801n0, this.f34802o0));
                this.f34796i0 = true;
                this.f34799l0 = LocaleController.getString(R.string.AccDescrVerified);
            } else if (this.h.getRightDrawable() instanceof vl0) {
                this.h.j(null);
                this.f34796i0 = false;
                this.f34799l0 = null;
            }
        } else {
            this.f34797j0 = true;
            if (!(this.h.getRightDrawable() instanceof vl0)) {
                vl0 vl0Var = new vl0(!z10 ? 1 : 0);
                vl0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B8, this.W));
                this.h.j(vl0Var);
                this.f34799l0 = LocaleController.getString(R.string.ScamMessage);
                this.f34796i0 = true;
            }
        }
        if (!z13 && DialogObject.getEmojiStatusDocumentId(emojiStatus) == 0) {
            this.h.i(null);
            this.f34798k0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof o5) && (((o5) this.h.getRightDrawable()).f31257a instanceof p5)) {
                ((p5) ((o5) this.h.getRightDrawable()).f31257a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f34786b0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.m0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W), PorterDuff.Mode.MULTIPLY));
                this.f34786b0.g(this.m0, z14);
            } else {
                this.f34786b0.g(null, z14);
            }
            this.f34786b0.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W)));
            this.h.i(this.f34786b0);
            this.f34796i0 = false;
            this.f34798k0 = LocaleController.getString(R.string.AccDescrPremium);
        }
        org.telegram.ui.ActionBar.l lVar = this.f34804q0;
        if (lVar != null) {
            lVar.d(z14);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.cl clVar = this.f34805r;
        clVar.setTextColor(i11);
        clVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.cl clVar = this.h;
        clVar.setLeftDrawable(drawable);
        if (!this.f34796i0 && !this.f34797j0) {
            if (drawable2 != null) {
                this.f34799l0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.f34799l0 = null;
            }
            clVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.l lVar = this.f34804q0;
        if (lVar != null) {
            lVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.F;
        e9 e9Var = this.E;
        e9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        tn tnVar = this.f34790e;
        if (isReplyUser) {
            e9Var.g(12);
            e9Var.f27964p = 0.8f;
            if (tnVar != null) {
                tnVar.h(null, null, e9Var, user);
            }
        } else if (UserObject.isAnonymous(user)) {
            e9Var.g(21);
            e9Var.f27964p = 0.8f;
            if (tnVar != null) {
                tnVar.h(null, null, e9Var, user);
            }
        } else if (UserObject.isUserSelf(user) && !z10) {
            e9Var.g(1);
            e9Var.f27964p = 0.8f;
            if (tnVar != null) {
                tnVar.h(null, null, e9Var, user);
            }
        } else {
            e9Var.f27964p = 1.0f;
            if (tnVar != null) {
                tnVar.e(user, e9Var);
            }
        }
    }

    public final void l() {
        String str;
        int i10 = this.R;
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
        org.telegram.ui.ActionBar.c6 c6Var = this.W;
        o6 o6Var = this.f34806s;
        org.telegram.ui.cl clVar = this.f34805r;
        if (str == null) {
            CharSequence charSequence = this.S;
            if (charSequence != null) {
                if (clVar != null) {
                    clVar.k(charSequence);
                    this.S = null;
                    Integer num = this.U;
                    if (num != null) {
                        clVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.T;
                        if (i11 >= 0) {
                            clVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
                            clVar.setTag(Integer.valueOf(this.T));
                        }
                    }
                } else if (o6Var != null) {
                    o6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.S = null;
                    Integer num2 = this.U;
                    if (num2 != null) {
                        o6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.T;
                        if (i12 >= 0) {
                            o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
                            o6Var.setTag(Integer.valueOf(this.T));
                        }
                    }
                }
            }
        } else if (clVar != null) {
            if (this.S == null) {
                this.S = clVar.getText();
            }
            clVar.k(str);
            Integer num3 = this.U;
            if (num3 != null) {
                clVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.g6.B8;
                clVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
                clVar.setTag(Integer.valueOf(i13));
            }
        } else if (o6Var != null) {
            if (this.S == null) {
                this.S = o6Var.getText();
            }
            o6Var.c(str, !LocaleController.isRTL, true);
            Integer num4 = this.U;
            if (num4 != null) {
                o6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.g6.B8;
                o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
                o6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.f34804q0;
        if (lVar != null) {
            lVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.tn tnVar = this.C;
        if (tnVar != null) {
            this.Q = 0;
            TLRPC.ChatFull chatFull = tnVar.V7;
            if (chatFull != null) {
                int i10 = this.F;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (z10 && chatFull.participants_count > 200) {
                        this.Q = chatFull.online_count;
                        return;
                    }
                    return;
                }
                for (int i11 = 0; i11 < chatFull.participants.participants.size(); i11++) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(chatFull.participants.participants.get(i11).user_id));
                    if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f22539id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
                        this.Q++;
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
        org.telegram.ui.ActionBar.c6 c6Var = this.W;
        boolean[] zArr2 = this.N;
        o6 o6Var = this.f34806s;
        org.telegram.ui.cl clVar = this.f34805r;
        org.telegram.ui.cl clVar2 = this.h;
        int i18 = this.F;
        org.telegram.ui.tn tnVar = this.C;
        if (tnVar != null) {
            if (tnVar.N3 == 6) {
                String str2 = tnVar.L3.link;
                sf.u[] uVarArr = sf.u.f47956e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                setSubtitle(str2);
                return;
            }
            TLRPC.User i19 = tnVar.i();
            TLRPC.Chat chat = tnVar.f42787e;
            if (UserObject.isUserSelf(i19) && tnVar.N3 == 0 && tnVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.f34803p0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (((UserObject.isUserSelf(i19) && !z11) || UserObject.isReplyUser(i19) || ((i19 != null && i19.f22539id == 489000) || ((i10 = tnVar.N3) != 0 && i10 != 8))) && tnVar.N3 != 3) {
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
                if (!this.f34803p0) {
                    MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i17) + 1).apply();
                    this.f34803p0 = true;
                }
            }
            CharSequence printingString = MessagesController.getInstance(i18).getPrintingString(tnVar.a(), tnVar.Z3, false);
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
                if (tnVar.F9() && clVar2.getTag() != null) {
                    clVar2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.M;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.M = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.M = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(clVar2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.M.addListener(new wn(this, 1));
                        this.M.setDuration(180L);
                        this.M.start();
                    } else {
                        clVar2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer printingStringType = MessagesController.getInstance(i18).getPrintingStringType(tnVar.a(), tnVar.Z3);
                if (printingStringType != null && printingStringType.intValue() == 5) {
                    charSequence = Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
                } else {
                    charSequence = printingString;
                }
                setTypingAnimation(true);
                z12 = true;
                str = charSequence;
            } else if (tnVar.F9() && !tnVar.f42779d4) {
                if (clVar2.getTag() == null) {
                    clVar2.setTag(1);
                    AnimatorSet animatorSet3 = this.M;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.M = null;
                    }
                    if (z10) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.M = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(clVar2, property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.M.addListener(new wn(this, 0));
                        this.M.setDuration(180L);
                        this.M.start();
                        return;
                    }
                    clVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i20 = tnVar.N3;
                if (i20 == 8) {
                    if (tnVar.P3) {
                        charSequence2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                    } else if (tnVar.b() == 0) {
                        int topicsCount = tnVar.getMessagesController().getTopicsController().getTopicsCount(-tnVar.a());
                        if (topicsCount > 0) {
                            string = LocaleController.formatPluralStringComma("Chats", topicsCount);
                        } else {
                            string = LocaleController.getString(R.string.ChatMessageSuggestions);
                        }
                        charSequence2 = string;
                    } else {
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f22392id, tnVar.b());
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
                            formatString = LocaleController.formatString(R.string.TopicProfileStatus, yf.d.i(chat, i18, false));
                        }
                        str = formatString;
                    }
                    z12 = false;
                    str = charSequence2;
                } else {
                    if (i20 == 3) {
                        charSequence2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, tnVar.getMessagesController().getSavedMessagesController().getMessagesCount(tnVar.I8())), new Object[0]);
                    } else {
                        if (tnVar.f42779d4 && chat != null) {
                            TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i18).getTopicsController().findTopic(chat.f22392id, tnVar.b());
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
                            TLRPC.ChatFull chatFull = tnVar.V7;
                            int i22 = this.Q;
                            if (ChatObject.isChannel(chat)) {
                                if (chatFull != null && (i12 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i22 > 1) {
                                            formatPluralString = a4.w.y(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i22, chatFull.participants_count), new Object[0]));
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
                                    formatPluralString = a4.w.y(LocaleController.formatPluralString("Members", i24, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i22, new Object[0]));
                                } else {
                                    formatPluralString = LocaleController.formatPluralString("Members", i24, new Object[0]);
                                }
                            }
                        } else if (i19 != null) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(i19.f22539id));
                            if (user != null) {
                                i19 = user;
                            }
                            if (!UserObject.isReplyUser(i19)) {
                                long j10 = i19.f22539id;
                                if (j10 != 489000) {
                                    if (j10 == UserConfig.getInstance(i18).getClientUserId()) {
                                        charSequence2 = z13 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                    } else {
                                        long j11 = i19.f22539id;
                                        if (j11 != 333000 && j11 != 777000 && j11 != 42777) {
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
                                                    if (this.f34784a0) {
                                                        zArr = this.O;
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
                i16 = org.telegram.ui.ActionBar.g6.f23282pa;
            } else {
                i16 = org.telegram.ui.ActionBar.g6.B8;
            }
            this.T = i16;
            if (this.S == null) {
                if (clVar != null) {
                    clVar.k(str);
                    Integer num = this.U;
                    if (num == null) {
                        clVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(this.T, c6Var));
                        clVar.setTag(Integer.valueOf(this.T));
                    } else {
                        clVar.setTextColor(num.intValue());
                    }
                } else {
                    o6Var.c(str, z10, true);
                    Integer num2 = this.U;
                    if (num2 == null) {
                        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(this.T, c6Var));
                        o6Var.setTag(Integer.valueOf(this.T));
                    } else {
                        o6Var.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.S = str;
            }
            org.telegram.ui.ActionBar.l lVar = this.f34804q0;
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
        org.telegram.ui.tn tnVar = this.C;
        if (tnVar != null) {
            int i10 = this.F;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (tnVar.N3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.R = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        n5 n5Var = this.f34786b0;
        if (n5Var != null) {
            n5Var.a();
        }
        n5 n5Var2 = this.f34788c0;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.tn tnVar = this.C;
        if (tnVar != null) {
            int i10 = this.F;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (tnVar.N3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        n5 n5Var = this.f34786b0;
        if (n5Var != null) {
            n5Var.b();
        }
        n5 n5Var2 = this.f34788c0;
        if (n5Var2 != null) {
            n5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f34798k0 != null) {
            sb2.append(", ");
            sb2.append(this.f34798k0);
        }
        if (this.f34799l0 != null) {
            sb2.append(", ");
            sb2.append(this.f34799l0);
        }
        sb2.append("\n");
        org.telegram.ui.cl clVar = this.f34805r;
        if (clVar != null) {
            sb2.append(clVar.getText());
        } else {
            o6 o6Var = this.f34806s;
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
        float f9;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        tn tnVar = this.f34790e;
        int measuredHeight = ((currentActionBarHeight - tnVar.getMeasuredHeight()) - 2) / 2;
        if (this.G) {
            i14 = AndroidUtilities.statusBarHeight;
        } else {
            i14 = 0;
        }
        int i15 = measuredHeight + i14;
        if (this.f34794g0) {
            f9 = 23.66f;
        } else {
            f9 = 24.0f;
        }
        int dp = AndroidUtilities.dp(f9) + i15;
        int i16 = this.H + 1;
        int i17 = i15 + 1;
        tnVar.layout(i16, i17, tnVar.getMeasuredWidth() + i16, tnVar.getMeasuredHeight() + i17);
        int i18 = this.H;
        if (tnVar.getVisibility() == 0) {
            if (this.f34794g0) {
                f10 = 49.66f;
            } else {
                f10 = 55.0f;
            }
        } else if (this.f34794g0) {
            f10 = 13.0f;
        } else {
            f10 = 1.0f;
        }
        int dp2 = i18 + AndroidUtilities.dp(f10) + this.I;
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.f34800n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.cl clVar = this.h;
        if (visibility != 8) {
            clVar.layout(dp2, (AndroidUtilities.dp(1.66f) + i15) - clVar.getPaddingTop(), clVar.getMeasuredWidth() + dp2, clVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (clVar.getTextHeight() + i15)) - clVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(dp2, AndroidUtilities.dp(1.66f) + i15, h5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + h5Var.getTextHeight() + i15);
            }
        } else {
            clVar.layout(dp2, (AndroidUtilities.dp(11.0f) + i15) - clVar.getPaddingTop(), clVar.getMeasuredWidth() + dp2, clVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (clVar.getTextHeight() + i15)) - clVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(dp2, AndroidUtilities.dp(10.0f) + i15, h5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + h5Var.getTextHeight() + i15);
            }
        }
        ImageView imageView = this.f34808x;
        if (imageView != null) {
            int i19 = this.H;
            imageView.layout(AndroidUtilities.dp(29.0f) + i19, AndroidUtilities.dp(27.33f) + i15, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.H, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + i15);
        }
        ImageView imageView2 = this.f34807w;
        if (imageView2 != null) {
            int i20 = this.H;
            imageView2.layout(AndroidUtilities.dp(19.333f) + i20, i15 - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.H, imageView2.getMeasuredHeight() + (i15 - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.f34809y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.H, AndroidUtilities.dp(24.0f) + i15, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.H, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        ImageView imageView4 = this.A;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.H, AndroidUtilities.dp(24.0f) + i15, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.H, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + i15);
        }
        org.telegram.ui.cl clVar2 = this.f34805r;
        if (clVar2 != null) {
            clVar2.layout(dp2, dp, clVar2.getMeasuredWidth() + dp2, clVar2.getTextHeight() + dp);
        } else {
            o6 o6Var = this.f34806s;
            if (o6Var != null) {
                o6Var.layout(dp2, dp, o6Var.getMeasuredWidth() + dp2, o6Var.getTextHeight() + dp);
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
        float f9;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        tn tnVar = this.f34790e;
        int i13 = 0;
        if (tnVar.getVisibility() == 0) {
            i12 = 54;
        } else {
            i12 = 0;
        }
        int dp = size - AndroidUtilities.dp(i12 + 16);
        float f11 = this.d;
        tnVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f11) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.cl clVar = this.h;
        clVar.measure(makeMeasureSpec, makeMeasureSpec2);
        o6 o6Var = this.f34806s;
        org.telegram.ui.cl clVar2 = this.f34805r;
        if (clVar2 != null) {
            clVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (o6Var != null) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f34808x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f34807w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.f34809y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.A;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i14 = this.K;
        AtomicReference atomicReference = this.f34800n;
        if (i14 != -1 && i14 != size && i14 > size) {
            this.L = i14;
            View view = (org.telegram.ui.ActionBar.h5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference.set(h5Var);
            int i15 = org.telegram.ui.ActionBar.g6.A8;
            org.telegram.ui.ActionBar.c6 c6Var = this.W;
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
            if (this.f34794g0) {
                f9 = 17.5f;
            } else {
                f9 = 18.0f;
            }
            h5Var.setTextSizePx(AndroidUtilities.dp(f9));
            h5Var.setGravity(3);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            h5Var.i(clVar.getRightDrawable());
            h5Var.j(clVar.getRightDrawable2());
            h5Var.setRightDrawableOutside(clVar.getRightDrawableOutside());
            h5Var.setLeftDrawable(clVar.getLeftDrawable());
            h5Var.l(clVar.getText(), false);
            ViewPropertyAnimator duration = h5Var.animate().alpha(0.0f).setDuration(350L);
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).withEndAction(new qn(this, 0)).start();
            addView(h5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference2.set(h5Var2);
            int i16 = org.telegram.ui.ActionBar.g6.B8;
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
            h5Var2.setTag(Integer.valueOf(i16));
            if (this.f34794g0) {
                f10 = 13.5f;
            } else {
                f10 = 14.0f;
            }
            h5Var2.setTextSizePx(AndroidUtilities.dp(f10));
            h5Var2.setGravity(3);
            if (clVar2 != null) {
                h5Var2.l(clVar2.getText(), false);
            } else if (o6Var != null) {
                h5Var2.l(o6Var.getText(), false);
            }
            h5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).withEndAction(new qn(this, 1)).start();
            addView(h5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = (org.telegram.ui.ActionBar.h5) atomicReference.get();
        if (h5Var3 != null) {
            int i17 = this.L;
            if (tnVar.getVisibility() == 0) {
                i13 = 54;
            }
            h5Var3.measure(org.telegram.ui.b.d(i13 + 16, i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.K = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        uc ucVar = this.f34789d0;
        qn qnVar = this.f34791e0;
        if (action == 0 && a()) {
            this.f34793f0 = true;
            ucVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(qnVar);
            AndroidUtilities.runOnUIThread(qnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f34793f0) {
            ucVar.c(false);
            this.f34793f0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(qnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.f34804q0 = lVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f9;
        int i10 = this.F;
        e9 e9Var = this.E;
        e9Var.k(i10, chat);
        tn tnVar = this.f34790e;
        if (tnVar != null) {
            tnVar.e(chat, e9Var);
            if (ChatObject.isForum(chat)) {
                if (ChatObject.hasStories(chat)) {
                    f9 = 11.0f;
                } else {
                    f9 = 16.0f;
                }
            } else {
                f9 = 21.0f;
            }
            tnVar.setRoundRadius(AndroidUtilities.dp(f9));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f34808x;
        if (imageView != null) {
            if (z10 && !this.f34792f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setLeftPadding(int i10) {
        this.H = i10;
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
        this.f34789d0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.I = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.f34787c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.S == null) {
            org.telegram.ui.cl clVar = this.f34805r;
            if (clVar != null) {
                clVar.k(charSequence);
            } else {
                o6 o6Var = this.f34806s;
                if (o6Var != null) {
                    o6Var.setText(charSequence);
                }
            }
        } else {
            this.S = charSequence;
        }
        org.telegram.ui.ActionBar.l lVar = this.f34804q0;
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
    public final void z(float f9, int i10) {
    }
}
