package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.we1;

public class rn extends FrameLayout implements ud.b, NotificationCenter.NotificationCenterDelegate {
    public final ImageView A;
    public final c11 B;
    public final org.telegram.ui.rn C;
    public final vv0[] D;
    public final y8 E;
    public final int F;
    public boolean G;
    public int H;
    public int I;
    public vv0 J;
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
    public final zt0 V;
    public final org.telegram.ui.ActionBar.c6 W;

    public final ud.a f32210a;

    public boolean f32211a0;

    public boolean f32212b;

    public final i5 f32213b0;

    public Integer f32214c;

    public final i5 f32215c0;
    public final int d;

    public final nc f32216d0;

    public final nn f32217e;

    public final kn f32218e0;

    public final boolean f32219f;

    public boolean f32220f0;

    public boolean f32221g0;
    public final org.telegram.ui.bl h;

    public boolean f32222h0;

    public boolean f32223i0;

    public boolean f32224j0;

    public String f32225k0;

    public String f32226l0;
    public Drawable m0;

    public final AtomicReference f32227n;

    public Drawable f32228n0;

    public Drawable f32229o0;

    public boolean f32230p0;

    public org.telegram.ui.ActionBar.k f32231q0;

    public final org.telegram.ui.bl f32232r;

    public final j6 f32233s;
    public final AtomicReference v;

    public final ImageView f32234w;

    public final ImageView f32235x;

    public final ImageView f32236y;

    public rn(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        super(context);
        er erVar = er.h;
        this.f32210a = new ud.a(0, this, erVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.f32227n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.v = atomicReference2;
        vv0[] vv0VarArr = new vv0[6];
        this.D = vv0VarArr;
        this.E = new y8((org.telegram.ui.ActionBar.c6) null);
        this.F = UserConfig.selectedAccount;
        this.G = true;
        this.H = AndroidUtilities.dp(8.0f);
        this.I = 0;
        this.K = -1;
        this.L = -1;
        this.N = new boolean[1];
        this.O = new boolean[1];
        this.Q = -1;
        this.T = -1;
        this.f32211a0 = false;
        this.f32216d0 = new nc(this);
        this.f32218e0 = new kn(this, 2);
        this.f32223i0 = false;
        this.f32224j0 = false;
        this.f32225k0 = null;
        this.f32226l0 = null;
        this.W = c6Var;
        boolean z12 = n2Var instanceof org.telegram.ui.rn;
        if (z12) {
            this.C = (org.telegram.ui.rn) n2Var;
        }
        org.telegram.ui.rn rnVar = this.C;
        boolean z13 = rnVar != null && ((i13 = rnVar.N3) == 0 || i13 == 8) && !UserObject.isReplyUser(rnVar.i()) && (this.C.i() == null || this.C.i().f22527id != 489000);
        nn nnVar = new nn(this, context, n2Var, z13, c6Var);
        this.f32217e = nnVar;
        if (z12 || (n2Var instanceof we1)) {
            org.telegram.ui.rn rnVar2 = this.C;
            if (rnVar2 == null || ((i11 = rnVar2.N3) != 5 && i11 != 9 && i11 != 6 && i11 != 8 && !UserObject.isBotForum(rnVar2.f42039f))) {
                this.V = new zt0(n2Var);
            }
            org.telegram.ui.rn rnVar3 = this.C;
            if (rnVar3 == null) {
                z11 = false;
            } else {
                if (rnVar3.F9()) {
                    org.telegram.ui.rn rnVar4 = this.C;
                    if (rnVar4.T3 != null && rnVar4.f42005c4) {
                        i10 = this.C.N3;
                        if (i10 == 2 && i10 != 5 && i10 != 9 && i10 != 6) {
                            z11 = false;
                        }
                    }
                } else {
                    i10 = this.C.N3;
                    if (i10 == 2) {
                    }
                }
                z11 = true;
            }
            this.f32219f = z11;
            if (z11) {
                nnVar.setVisibility(8);
            }
        }
        nnVar.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        nnVar.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(nnVar);
        if (z13) {
            org.telegram.ui.rn rnVar5 = this.C;
            TLRPC.Chat chat = rnVar5 != null ? rnVar5.f42026e : null;
            if (chat != null && chat.linked_community_id != 0) {
                h7.b6.b(nnVar, 0.05f, 1.2f);
            }
            final int i14 = 0;
            nnVar.setOnClickListener(new View.OnClickListener(this) {

                public final rn f30704b;

                {
                    this.f30704b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            rn rnVar6 = this.f30704b;
                            if (!rnVar6.d()) {
                                rnVar6.e(true, false);
                            }
                            break;
                        default:
                            this.f30704b.e(false, false);
                            break;
                    }
                }
            });
        }
        org.telegram.ui.bl blVar = new org.telegram.ui.bl(context, atomicReference);
        this.h = blVar;
        blVar.setEllipsizeByGradient(true);
        blVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var));
        blVar.setTextSize(18);
        blVar.setGravity(3);
        blVar.setTypeface(AndroidUtilities.bold());
        blVar.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        blVar.setCanHideRightDrawable(false);
        blVar.setRightDrawableOutside(true);
        blVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(blVar);
        if (p()) {
            j6 j6Var = new j6(context, true, true, true);
            this.f32233s = j6Var;
            j6Var.b(0.3f, 320L, erVar);
            j6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.g6.B8;
            j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
            j6Var.setTag(Integer.valueOf(i15));
            j6Var.setTextSize(AndroidUtilities.dp(14.0f));
            j6Var.setGravity(3);
            j6Var.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            j6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(j6Var);
        } else {
            org.telegram.ui.bl blVar2 = new org.telegram.ui.bl(context, atomicReference2);
            this.f32232r = blVar2;
            blVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.g6.B8;
            blVar2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
            blVar2.setTag(Integer.valueOf(i16));
            blVar2.setTextSize(14);
            blVar2.setGravity(3);
            blVar2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            addView(blVar2);
        }
        if (this.C != null) {
            ImageView imageView = new ImageView(context);
            this.f32235x = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new oh.a());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.f32234w = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            c11 c11Var = new c11(context, c6Var);
            this.B = c11Var;
            imageView2.setImageDrawable(c11Var);
            c11Var.f27285k = true;
            c11Var.f27278b.setColor(0);
            addView(imageView2);
            this.P = z10;
            imageView2.setOnClickListener(new q2(12, this, c6Var));
            if (z10) {
                imageView2.setContentDescription(LocaleController.getString(R.string.SetTimer));
            } else {
                imageView2.setContentDescription(LocaleController.getString(R.string.AccAutoDeleteTimer));
            }
            ImageView imageView3 = new ImageView(context);
            this.f32236y = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, c6Var), PorterDuff.Mode.SRC_IN));
            imageView3.setAlpha(0.0f);
            imageView3.setVisibility(4);
            imageView3.setScaleY(0.0f);
            imageView3.setScaleX(0.0f);
            addView(imageView3);
            ImageView imageView4 = new ImageView(context);
            this.A = imageView4;
            imageView4.setImageResource(R.drawable.star_small_inner);
            imageView4.setAlpha(0.0f);
            imageView4.setVisibility(4);
            imageView4.setScaleY(0.0f);
            imageView4.setScaleX(0.0f);
            addView(imageView4);
        }
        org.telegram.ui.rn rnVar6 = this.C;
        if (rnVar6 != null && ((i12 = rnVar6.N3) == 0 || i12 == 8 || i12 == 3)) {
            if (rnVar6.F9()) {
                org.telegram.ui.rn rnVar7 = this.C;
                if (rnVar7.f42017d4 || rnVar7.f42005c4) {
                    if (!UserObject.isReplyUser(this.C.i()) && (this.C.i() == null || this.C.i().f22527id != 489000)) {
                        final int i17 = 1;
                        setOnClickListener(new View.OnClickListener(this) {

                            public final rn f30704b;

                            {
                                this.f30704b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i17) {
                                    case 0:
                                        rn rnVar8 = this.f30704b;
                                        if (!rnVar8.d()) {
                                            rnVar8.e(true, false);
                                        }
                                        break;
                                    default:
                                        this.f30704b.e(false, false);
                                        break;
                                }
                            }
                        });
                    }
                }
            } else if (!UserObject.isReplyUser(this.C.i())) {
                final int i18 = 1;
                setOnClickListener(new View.OnClickListener(this) {

                    public final rn f30704b;

                    {
                        this.f30704b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                rn rnVar8 = this.f30704b;
                                if (!rnVar8.d()) {
                                    rnVar8.e(true, false);
                                }
                                break;
                            default:
                                this.f30704b.e(false, false);
                                break;
                        }
                    }
                });
            }
            TLRPC.Chat chat2 = this.C.f42026e;
            vv0VarArr[0] = new l41(true);
            vv0VarArr[1] = new fp(true);
            vv0VarArr[2] = new ho0(true);
            vv0VarArr[3] = new uf0(c6Var, false);
            vv0VarArr[4] = new jl0(true);
            vv0VarArr[5] = new fp();
            int i19 = 0;
            while (true) {
                vv0[] vv0VarArr2 = this.D;
                if (i19 >= vv0VarArr2.length) {
                    break;
                }
                vv0VarArr2[i19].c(chat2 != null);
                i19++;
            }
        }
        this.f32213b0 = new i5(AndroidUtilities.dp(24.0f), this.h);
        this.f32215c0 = new i5(AndroidUtilities.dp(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.rn rnVar = this.C;
        org.telegram.ui.bl blVar = this.f32232r;
        if (blVar == null) {
            return;
        }
        int i10 = 0;
        vv0[] vv0VarArr = this.D;
        if (!z10) {
            this.J = null;
            blVar.setLeftDrawable((Drawable) null);
            blVar.g(null, null);
            while (i10 < vv0VarArr.length) {
                vv0 vv0Var = vv0VarArr[i10];
                if (vv0Var != null) {
                    vv0Var.e();
                }
                i10++;
            }
            return;
        }
        try {
            int iIntValue = MessagesController.getInstance(this.F).getPrintingStringType(rnVar.a(), rnVar.Z3).intValue();
            vv0 vv0Var2 = vv0VarArr[iIntValue];
            if (vv0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.W;
            if (iIntValue == 5) {
                blVar.g(vv0Var2, "**oo**");
                vv0VarArr[iIntValue].b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23271pa, c6Var));
                blVar.setLeftDrawable((Drawable) null);
            } else {
                blVar.g(null, null);
                vv0VarArr[iIntValue].b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23271pa, c6Var));
                blVar.setLeftDrawable(vv0VarArr[iIntValue]);
            }
            this.J = vv0VarArr[iIntValue];
            while (i10 < vv0VarArr.length) {
                vv0 vv0Var3 = vv0VarArr[i10];
                if (vv0Var3 != null) {
                    if (i10 == iIntValue) {
                        vv0Var3.d();
                    } else {
                        vv0Var3.e();
                    }
                }
                i10++;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int iDp;
        org.telegram.ui.rn rnVar = this.C;
        if (rnVar == null) {
            return;
        }
        TLRPC.User userI = rnVar.i();
        TLRPC.Chat chat = rnVar.f42026e;
        if (rnVar.N3 == 3) {
            long jI8 = rnVar.I8();
            if (jI8 >= 0) {
                user = rnVar.getMessagesController().getUser(Long.valueOf(jI8));
                chat = null;
            } else {
                chat = rnVar.getMessagesController().getChat(Long.valueOf(-jI8));
                user = null;
            }
        } else {
            user = userI;
        }
        int i10 = this.F;
        y8 y8Var = this.E;
        nn nnVar = this.f32217e;
        if (user == null) {
            if (!ChatObject.isMonoForum(chat)) {
                if (chat != null) {
                    y8Var.f34858p = 1.0f;
                    y8Var.k(i10, chat);
                    if (nnVar != null) {
                        nnVar.setAnimatedEmojiDrawable(null);
                        nnVar.e(chat, y8Var);
                        if (chat.forum) {
                            iDp = AndroidUtilities.dp(ChatObject.hasStories(chat) ? 11.0f : 16.0f);
                        } else {
                            iDp = AndroidUtilities.dp(21.0f);
                        }
                        nnVar.setRoundRadius(iDp);
                        return;
                    }
                    return;
                }
                return;
            }
            long jB = rnVar.b();
            if (!ChatObject.canManageMonoForum(i10, chat) || jB == 0) {
                nnVar.setAnimatedEmojiDrawable(null);
                wf.c.o(i10, chat, y8Var, nnVar);
            } else if (jB > 0) {
                TLRPC.User user2 = rnVar.getMessagesController().getUser(Long.valueOf(jB));
                y8Var.r(user2);
                nnVar.setAnimatedEmojiDrawable(null);
                nnVar.e(user2, y8Var);
            } else {
                TLRPC.Chat chat2 = rnVar.getMessagesController().getChat(Long.valueOf(-jB));
                y8Var.q(chat2);
                nnVar.setAnimatedEmojiDrawable(null);
                nnVar.e(chat2, y8Var);
            }
            nnVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        y8Var.m(i10, user);
        if (UserObject.isReplyUser(user)) {
            y8Var.f34858p = 0.8f;
            y8Var.g(12);
            if (nnVar != null) {
                nnVar.setAnimatedEmojiDrawable(null);
                nnVar.h(null, null, y8Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            y8Var.f34858p = 0.8f;
            y8Var.g(21);
            if (nnVar != null) {
                nnVar.setAnimatedEmojiDrawable(null);
                nnVar.h(null, null, y8Var, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && rnVar.N3 == 3) {
            y8Var.f34858p = 0.8f;
            y8Var.g(22);
            if (nnVar != null) {
                nnVar.setAnimatedEmojiDrawable(null);
                nnVar.h(null, null, y8Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            y8Var.f34858p = 1.0f;
            if (nnVar != null) {
                nnVar.setAnimatedEmojiDrawable(null);
                nnVar.f30898a.setForUserOrChat(user, y8Var, null, true, 3, false);
                return;
            }
            return;
        }
        y8Var.f34858p = 0.8f;
        y8Var.g(1);
        if (nnVar != null) {
            nnVar.setAnimatedEmojiDrawable(null);
            nnVar.h(null, null, y8Var, user);
        }
    }

    public final i5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        i5 i5Var = this.f32215c0;
        i5Var.j(j10, false);
        i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W)));
        int iDp = AndroidUtilities.dp(1.0f);
        i5Var.E = 0;
        i5Var.F = iDp;
        return i5Var;
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
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.savedMessagesDialogsUpdate) {
                n(true);
            }
        } else {
            org.telegram.ui.bl blVar = this.h;
            if (blVar != null) {
                blVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float fA = this.f32216d0.a(0.02f);
        canvas.scale(fA, fA, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f32217e) {
            boolean z10 = false;
            ImageView imageView = this.f32234w;
            boolean z11 = imageView != null && imageView.getVisibility() == 0;
            ImageView imageView2 = this.f32235x;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z10 = true;
            }
            if (z11 || z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.saveLayer(rectF, null);
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                if (z11) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.g6.Il);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.g6.Il);
                }
                canvas.restore();
                return zDrawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        og ogVar;
        TLRPC.User user;
        nn nnVar = this.f32217e;
        if (z10) {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y && nnVar.getImageReceiver().hasNotThumb()) {
                    z12 = z10;
                }
            }
            z12 = false;
        } else {
            z12 = z10;
        }
        org.telegram.ui.rn rnVar = this.C;
        TLRPC.User userI = rnVar.i();
        TLRPC.Chat chat = rnVar.f42026e;
        boolean z14 = chat != null && chat.monoforum;
        if (chat != null && chat.monoforum) {
            chat = rnVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat == null) {
                return;
            }
            if (rnVar.N8() != 0 && (user = rnVar.getMessagesController().getUser(Long.valueOf(rnVar.N8()))) != null) {
                chat = null;
                userI = user;
            }
        }
        ImageReceiver imageReceiver = nnVar.getImageReceiver();
        String imageKey = imageReceiver.getImageKey();
        ImageLoader imageLoader = ImageLoader.getInstance();
        if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
            Drawable drawable = imageReceiver.getDrawable();
            if ((drawable instanceof BitmapDrawable) && !(drawable instanceof x5)) {
                imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
            }
        }
        if (rnVar.f42005c4) {
            if (chat == null) {
                return;
            }
            rnVar.presentFragment(ProfileActivity.m4(-chat.f22380id), z11);
            return;
        }
        zt0 zt0Var = this.V;
        if (userI == null) {
            boolean z15 = z12;
            if (chat != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", chat.f22380id);
                if (rnVar.N3 == 3) {
                    bundle.putLong("topic_id", rnVar.I8());
                } else if (rnVar.f42017d4) {
                    bundle.putLong("topic_id", rnVar.T3.getId());
                }
                ProfileActivity profileActivity = new ProfileActivity(bundle, zt0Var);
                if (!z14) {
                    profileActivity.K4(rnVar.V7);
                }
                profileActivity.N4(z15 ? 2 : 1);
                rnVar.presentFragment(profileActivity, z11);
                return;
            }
            return;
        }
        if (userI.f22527id == 489000) {
            return;
        }
        Bundle bundle2 = new Bundle();
        if (UserObject.isUserSelf(userI)) {
            org.telegram.ui.ActionBar.n2 n2Var = zt0Var.f35356w;
            int[] iArr = zt0Var.f35350c;
            int i10 = 0;
            while (true) {
                if (i10 >= iArr.length) {
                    if (zt0Var.f35352f || (n2Var != null && zt0Var.f35354r == n2Var.getUserConfig().getClientUserId() && zt0Var.f35355s == 0 && n2Var.getMessagesController().getSavedMessagesController().hasDialogs())) {
                        break;
                        break;
                    }
                    return;
                }
                if (iArr[i10] > 0) {
                    break;
                } else {
                    i10++;
                }
            }
            bundle2.putLong("dialog_id", rnVar.a());
            if (rnVar.N3 == 3) {
                bundle2.putLong("topic_id", rnVar.I8());
            }
            o90 o90Var = new o90(bundle2, zt0Var);
            o90Var.f31238c = rnVar.V7;
            rnVar.presentFragment(o90Var, z11);
            return;
        }
        if (rnVar.N3 == 3) {
            z13 = z12;
            long jI8 = rnVar.I8();
            bundle2.putBoolean("saved", true);
            if (jI8 >= 0) {
                bundle2.putLong("user_id", jI8);
            } else {
                bundle2.putLong("chat_id", -jI8);
            }
        } else {
            z13 = z12;
            bundle2.putLong("user_id", userI.f22527id);
            if (this.f32234w != null && !z14) {
                bundle2.putLong("dialog_id", rnVar.a());
            }
        }
        if (UserObject.isBotForum(userI)) {
            bundle2.putLong("topic_id", rnVar.b());
        }
        org.telegram.ui.ActionBar.q0 q0Var = rnVar.G1;
        bundle2.putBoolean("reportSpam", (q0Var == null || (ogVar = rnVar.I0) == null || !ogVar.d(q0Var) || rnVar.J1.getVisibility() == 8) ? false : true);
        bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, this.W));
        ProfileActivity profileActivity2 = new ProfileActivity(bundle2, zt0Var);
        if (!z14) {
            profileActivity2.O4(rnVar.W7, rnVar.X7, rnVar.Y7);
        }
        profileActivity2.N4(z13 ? 2 : 1);
        rnVar.presentFragment(profileActivity2, z11);
    }

    public final void g(int i10, boolean z10) {
        c11 c11Var = this.B;
        if (c11Var == null) {
            return;
        }
        boolean z11 = this.f32222h0;
        if (i10 != 0 || this.P) {
            ud.a aVar = this.f32210a;
            if (z11) {
                aVar.a(false, z10);
            } else {
                aVar.a(true, z10);
                c11Var.b(i10);
            }
        }
    }

    public n9 getAvatarImageView() {
        return this.f32217e;
    }

    public int getLastSubtitleColorKey() {
        return this.T;
    }

    public int getLeftPadding() {
        return this.H;
    }

    public zt0 getSharedMediaPreloader() {
        return this.V;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.bl blVar = this.f32232r;
        return blVar != null ? blVar.getTextPaint() : this.f32233s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.bl blVar = this.f32232r;
        if (blVar != null) {
            return blVar;
        }
        j6 j6Var = this.f32233s;
        if (j6Var != null) {
            return j6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.f32234w;
    }

    public org.telegram.ui.ActionBar.h5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.bl blVar = this.h;
        float fMax = blVar != null ? Math.max(0.0f, blVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.bl blVar2 = this.f32232r;
        if (blVar2 != null) {
            fMax = Math.max(fMax, blVar2.getExactWidthIncludeDrawables());
        }
        nn nnVar = this.f32217e;
        return (int) (fMax + ((nnVar == null || nnVar.getVisibility() != 0) ? AndroidUtilities.dp(34.0f) : AndroidUtilities.dp(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.f32224j0 = false;
        if (z10 || z11) {
            this.f32224j0 = true;
            if (!(this.h.getRightDrawable() instanceof ll0)) {
                ll0 ll0Var = new ll0(!z10 ? 1 : 0);
                ll0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B8, this.W));
                this.h.j(ll0Var);
                this.f32226l0 = LocaleController.getString(R.string.ScamMessage);
                this.f32223i0 = true;
            }
        } else if (z12) {
            Drawable drawableMutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.f32228n0 = drawableMutate;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(iV0, mode));
            Drawable drawableMutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.f32229o0 = drawableMutate2;
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, this.W), mode));
            this.h.j(new dq(this.f32228n0, this.f32229o0));
            this.f32223i0 = true;
            this.f32226l0 = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.h.getRightDrawable() instanceof ll0) {
            this.h.j(null);
            this.f32223i0 = false;
            this.f32226l0 = null;
        }
        if (z13 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof j5) && (((j5) this.h.getRightDrawable()).f29591a instanceof k5)) {
                ((k5) ((j5) this.h.getRightDrawable()).f29591a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f32213b0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable drawableMutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.m0 = drawableMutate3;
                drawableMutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W), PorterDuff.Mode.MULTIPLY));
                this.f32213b0.g(this.m0, z14);
            } else {
                this.f32213b0.g(null, z14);
            }
            this.f32213b0.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W)));
            this.h.i(this.f32213b0);
            this.f32223i0 = false;
            this.f32225k0 = LocaleController.getString(R.string.AccDescrPremium);
        } else {
            this.h.i(null);
            this.f32225k0 = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.f32231q0;
        if (kVar != null) {
            kVar.e(z14);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.bl blVar = this.f32232r;
        blVar.setTextColor(i11);
        blVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.bl blVar = this.h;
        blVar.setLeftDrawable(drawable);
        if (!this.f32223i0 && !this.f32224j0) {
            if (drawable2 != null) {
                this.f32226l0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.f32226l0 = null;
            }
            blVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.f32231q0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.F;
        y8 y8Var = this.E;
        y8Var.m(i10, user);
        boolean zIsReplyUser = UserObject.isReplyUser(user);
        nn nnVar = this.f32217e;
        if (zIsReplyUser) {
            y8Var.g(12);
            y8Var.f34858p = 0.8f;
            if (nnVar != null) {
                nnVar.h(null, null, y8Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            y8Var.g(21);
            y8Var.f34858p = 0.8f;
            if (nnVar != null) {
                nnVar.h(null, null, y8Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z10) {
            y8Var.f34858p = 1.0f;
            if (nnVar != null) {
                nnVar.e(user, y8Var);
                return;
            }
            return;
        }
        y8Var.g(1);
        y8Var.f34858p = 0.8f;
        if (nnVar != null) {
            nnVar.h(null, null, y8Var, user);
        }
    }

    public final void l() {
        String string;
        int i10 = this.R;
        if (i10 == 2) {
            string = LocaleController.getString(R.string.WaitingForNetwork);
        } else if (i10 == 1) {
            string = LocaleController.getString(R.string.Connecting);
        } else if (i10 == 5) {
            string = LocaleController.getString(R.string.Updating);
        } else {
            string = i10 == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.W;
        j6 j6Var = this.f32233s;
        org.telegram.ui.bl blVar = this.f32232r;
        if (string == null) {
            CharSequence charSequence = this.S;
            if (charSequence != null) {
                if (blVar != null) {
                    blVar.k(charSequence);
                    this.S = null;
                    Integer num = this.U;
                    if (num != null) {
                        blVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.T;
                        if (i11 >= 0) {
                            blVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
                            blVar.setTag(Integer.valueOf(this.T));
                        }
                    }
                } else if (j6Var != null) {
                    j6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.S = null;
                    Integer num2 = this.U;
                    if (num2 != null) {
                        j6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.T;
                        if (i12 >= 0) {
                            j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
                            j6Var.setTag(Integer.valueOf(this.T));
                        }
                    }
                }
            }
        } else if (blVar != null) {
            if (this.S == null) {
                this.S = blVar.getText();
            }
            blVar.k(string);
            Integer num3 = this.U;
            if (num3 != null) {
                blVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.g6.B8;
                blVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
                blVar.setTag(Integer.valueOf(i13));
            }
        } else if (j6Var != null) {
            if (this.S == null) {
                this.S = j6Var.getText();
            }
            j6Var.c(string, !LocaleController.isRTL, true);
            Integer num4 = this.U;
            if (num4 != null) {
                j6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.g6.B8;
                j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
                j6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.f32231q0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.rn rnVar = this.C;
        if (rnVar == null) {
            return;
        }
        this.Q = 0;
        TLRPC.ChatFull chatFull = rnVar.V7;
        if (chatFull == null) {
            return;
        }
        int i10 = this.F;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z10 || chatFull.participants_count <= 200) {
                return;
            }
            this.Q = chatFull.online_count;
            return;
        }
        for (int i11 = 0; i11 < chatFull.participants.participants.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(chatFull.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.f22527id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
                this.Q++;
            }
        }
    }

    public final void n(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        String pluralString;
        TLRPC.ChatParticipants chatParticipants;
        int i12;
        String shortNumber;
        int i13;
        int i14;
        String string;
        int i15;
        org.telegram.ui.ActionBar.c6 c6Var = this.W;
        boolean[] zArr = this.N;
        j6 j6Var = this.f32233s;
        org.telegram.ui.bl blVar = this.f32232r;
        org.telegram.ui.bl blVar2 = this.h;
        int i16 = this.F;
        org.telegram.ui.rn rnVar = this.C;
        if (rnVar == null) {
            return;
        }
        if (rnVar.N3 == 6) {
            String strSubstring = rnVar.L3.link;
            qf.v[] vVarArr = qf.v.f46463e;
            if (strSubstring.startsWith("https://")) {
                strSubstring = strSubstring.substring(8);
            }
            setSubtitle(strSubstring);
            return;
        }
        TLRPC.User userI = rnVar.i();
        TLRPC.Chat chat = rnVar.f42026e;
        boolean z12 = UserObject.isUserSelf(userI) && rnVar.N3 == 0 && rnVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.f32230p0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if (((UserObject.isUserSelf(userI) && !z12) || UserObject.isReplyUser(userI) || ((userI != null && userI.f22527id == 489000) || ((i10 = rnVar.N3) != 0 && i10 != 8))) && rnVar.N3 != 3) {
            if (getSubtitleTextView().getVisibility() != 8) {
                getSubtitleTextView().setVisibility(8);
                return;
            }
            return;
        }
        if (z12) {
            if (getSubtitleTextView().getVisibility() != 0) {
                i15 = 0;
                getSubtitleTextView().setVisibility(0);
            } else {
                i15 = 0;
            }
            if (!this.f32230p0) {
                MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i15) + 1).apply();
                this.f32230p0 = true;
            }
        }
        CharSequence printingString = MessagesController.getInstance(i16).getPrintingString(rnVar.a(), rnVar.Z3, false);
        if (printingString == null) {
            UserObject.isBotForum(userI);
        }
        CharSequence string2 = "";
        if (printingString != null) {
            printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        boolean z13 = z12;
        if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            if (rnVar.F9() && blVar2.getTag() != null) {
                blVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.M;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.M = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(blVar2, (Property<org.telegram.ui.bl, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.M.addListener(new qn(this, 1));
                    this.M.setDuration(180L);
                    this.M.start();
                } else {
                    blVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer printingStringType = MessagesController.getInstance(i16).getPrintingStringType(rnVar.a(), rnVar.Z3);
            string2 = (printingStringType == null || printingStringType.intValue() != 5) ? printingString : Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
            setTypingAnimation(true);
            z11 = true;
        } else {
            if (rnVar.F9() && !rnVar.f42017d4) {
                if (blVar2.getTag() != null) {
                    return;
                }
                blVar2.setTag(1);
                AnimatorSet animatorSet3 = this.M;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.M = null;
                }
                if (!z10) {
                    blVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.M = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(blVar2, (Property<org.telegram.ui.bl, Float>) property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.M.addListener(new qn(this, 0));
                    this.M.setDuration(180L);
                    this.M.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i17 = rnVar.N3;
            if (i17 == 8) {
                if (rnVar.P3) {
                    string2 = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (rnVar.b() == 0) {
                    int topicsCount = rnVar.getMessagesController().getTopicsController().getTopicsCount(-rnVar.a());
                    string2 = topicsCount > 0 ? LocaleController.formatPluralStringComma("Chats", topicsCount) : LocaleController.getString(R.string.ChatMessageSuggestions);
                } else {
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.f22380id, rnVar.b());
                    int i18 = tL_forumTopicFindTopic != null ? tL_forumTopicFindTopic.totalMessagesCount : 0;
                    if (i18 > 0) {
                        z11 = false;
                        string = LocaleController.formatPluralString("messages", i18, Integer.valueOf(i18));
                    } else {
                        z11 = false;
                        string = LocaleController.formatString(R.string.TopicProfileStatus, wf.c.i(chat, i16, false));
                    }
                    string2 = string;
                }
                z11 = false;
            } else {
                if (i17 == 3) {
                    string2 = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, rnVar.getMessagesController().getSavedMessagesController().getMessagesCount(rnVar.I8())), new Object[0]);
                } else {
                    if (rnVar.f42017d4 && chat != null) {
                        TLRPC.TL_forumTopic tL_forumTopicFindTopic2 = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.f22380id, rnVar.b());
                        if (tL_forumTopicFindTopic2 != null) {
                            i13 = 1;
                            i14 = tL_forumTopicFindTopic2.totalMessagesCount - 1;
                        } else {
                            i13 = 1;
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            Object[] objArr = new Object[i13];
                            objArr[0] = Integer.valueOf(i14);
                            pluralString = LocaleController.formatPluralString("messages", i14, objArr);
                        } else {
                            int i19 = R.string.TopicProfileStatus;
                            Object[] objArr2 = new Object[i13];
                            objArr2[0] = chat.title;
                            pluralString = LocaleController.formatString(i19, objArr2);
                        }
                    } else if (chat != null) {
                        TLRPC.ChatFull chatFull = rnVar.V7;
                        int i20 = this.Q;
                        if (ChatObject.isChannel(chat)) {
                            if (chatFull == null || (i12 = chatFull.participants_count) == 0) {
                                if (!chat.megagroup) {
                                    pluralString = ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                                } else if (chatFull == null) {
                                    pluralString = LocaleController.getString(R.string.Loading).toLowerCase();
                                } else if (chat.has_geo) {
                                    pluralString = LocaleController.getString(R.string.MegaLocation).toLowerCase();
                                } else {
                                    pluralString = ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                }
                            } else if (chat.megagroup) {
                                pluralString = i20 > 1 ? a9.p.w(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i20, chatFull.participants_count), new Object[0])) : LocaleController.formatPluralString("Members", i12, new Object[0]);
                            } else {
                                int[] iArr = new int[1];
                                boolean zIsAccessibilityScreenReaderEnabled = AndroidUtilities.isAccessibilityScreenReaderEnabled();
                                int i21 = chatFull.participants_count;
                                if (zIsAccessibilityScreenReaderEnabled) {
                                    iArr[0] = i21;
                                    shortNumber = String.valueOf(i21);
                                } else {
                                    shortNumber = LocaleController.formatShortNumber(i21, iArr);
                                }
                                pluralString = chat.megagroup ? LocaleController.formatPluralString("Members", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber) : LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), shortNumber);
                            }
                        } else if (ChatObject.isKickedFromChat(chat)) {
                            pluralString = LocaleController.getString(R.string.YouWereKicked);
                        } else if (ChatObject.isLeftFromChat(chat)) {
                            pluralString = LocaleController.getString(R.string.YouLeft);
                        } else {
                            int size = chat.participants_count;
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                size = chatParticipants.participants.size();
                            }
                            pluralString = (i20 <= 1 || size == 0) ? LocaleController.formatPluralString("Members", size, new Object[0]) : a9.p.w(LocaleController.formatPluralString("Members", size, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i20, new Object[0]));
                        }
                    } else if (userI != null) {
                        TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(userI.f22527id));
                        if (user != null) {
                            userI = user;
                        }
                        if (!UserObject.isReplyUser(userI)) {
                            long j10 = userI.f22527id;
                            if (j10 != 489000) {
                                if (j10 == UserConfig.getInstance(i16).getClientUserId()) {
                                    string2 = z13 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                } else {
                                    long j11 = userI.f22527id;
                                    if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                        string2 = LocaleController.getString(R.string.ServiceNotifications);
                                    } else if (MessagesController.isSupportUser(userI)) {
                                        string2 = LocaleController.getString(R.string.SupportStatus);
                                    } else {
                                        boolean z14 = userI.bot;
                                        if (z14 && (i11 = userI.bot_active_users) != 0) {
                                            string2 = LocaleController.formatPluralStringComma("BotUsers", i11, ',');
                                        } else if (z14) {
                                            string2 = LocaleController.getString(R.string.Bot);
                                        } else {
                                            zArr[0] = false;
                                            string2 = LocaleController.formatUserStatus(i16, userI, zArr, this.f32211a0 ? this.O : null);
                                            z11 = zArr[0];
                                        }
                                    }
                                }
                            }
                        }
                    }
                    string2 = pluralString;
                }
                z11 = false;
            }
        }
        this.T = z11 ? org.telegram.ui.ActionBar.g6.f23271pa : org.telegram.ui.ActionBar.g6.B8;
        if (this.S != null) {
            this.S = string2;
        } else if (blVar != null) {
            blVar.k(string2);
            Integer num = this.U;
            if (num == null) {
                blVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(this.T, c6Var));
                blVar.setTag(Integer.valueOf(this.T));
            } else {
                blVar.setTextColor(num.intValue());
            }
        } else {
            j6Var.c(string2, z10, true);
            Integer num2 = this.U;
            if (num2 == null) {
                j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(this.T, c6Var));
                j6Var.setTag(Integer.valueOf(this.T));
            } else {
                j6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.f32231q0;
        if (kVar != null) {
            kVar.e(z10);
        }
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        ImageView imageView;
        if (i10 != 0 || (imageView = this.f32234w) == null) {
            return;
        }
        imageView.setAlpha(f10);
        float f12 = 0.85f * f10;
        imageView.setScaleX(f12);
        imageView.setScaleY(f12);
        imageView.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.rn rnVar = this.C;
        if (rnVar != null) {
            int i10 = this.F;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (rnVar.N3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.R = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        i5 i5Var = this.f32213b0;
        if (i5Var != null) {
            i5Var.a();
        }
        i5 i5Var2 = this.f32215c0;
        if (i5Var2 != null) {
            i5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.rn rnVar = this.C;
        if (rnVar != null) {
            int i10 = this.F;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (rnVar.N3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        i5 i5Var = this.f32213b0;
        if (i5Var != null) {
            i5Var.b();
        }
        i5 i5Var2 = this.f32215c0;
        if (i5Var2 != null) {
            i5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.f32225k0 != null) {
            sb2.append(", ");
            sb2.append(this.f32225k0);
        }
        if (this.f32226l0 != null) {
            sb2.append(", ");
            sb2.append(this.f32226l0);
        }
        sb2.append("\n");
        org.telegram.ui.bl blVar = this.f32232r;
        if (blVar != null) {
            sb2.append(blVar.getText());
        } else {
            j6 j6Var = this.f32233s;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        nn nnVar = this.f32217e;
        int measuredHeight = (((currentActionBarHeight - nnVar.getMeasuredHeight()) - 2) / 2) + (this.G ? AndroidUtilities.statusBarHeight : 0);
        int iDp = AndroidUtilities.dp(this.f32221g0 ? 23.66f : 24.0f) + measuredHeight;
        int i14 = this.H + 1;
        int i15 = measuredHeight + 1;
        nnVar.layout(i14, i15, nnVar.getMeasuredWidth() + i14, nnVar.getMeasuredHeight() + i15);
        int i16 = this.H;
        if (nnVar.getVisibility() == 0) {
            f10 = this.f32221g0 ? 49.66f : 55.0f;
        } else {
            f10 = this.f32221g0 ? 13.0f : 1.0f;
        }
        int iDp2 = i16 + AndroidUtilities.dp(f10) + this.I;
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.f32227n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.bl blVar = this.h;
        if (visibility != 8) {
            blVar.layout(iDp2, (AndroidUtilities.dp(1.66f) + measuredHeight) - blVar.getPaddingTop(), blVar.getMeasuredWidth() + iDp2, blVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (blVar.getTextHeight() + measuredHeight)) - blVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(iDp2, AndroidUtilities.dp(1.66f) + measuredHeight, h5Var.getMeasuredWidth() + iDp2, AndroidUtilities.dp(1.66f) + h5Var.getTextHeight() + measuredHeight);
            }
        } else {
            blVar.layout(iDp2, (AndroidUtilities.dp(11.0f) + measuredHeight) - blVar.getPaddingTop(), blVar.getMeasuredWidth() + iDp2, blVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (blVar.getTextHeight() + measuredHeight)) - blVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(iDp2, AndroidUtilities.dp(10.0f) + measuredHeight, h5Var.getMeasuredWidth() + iDp2, AndroidUtilities.dp(10.0f) + h5Var.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.f32235x;
        if (imageView != null) {
            imageView.layout(AndroidUtilities.dp(29.0f) + this.H, AndroidUtilities.dp(27.33f) + measuredHeight, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.H, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.f32234w;
        if (imageView2 != null) {
            imageView2.layout(AndroidUtilities.dp(19.333f) + this.H, measuredHeight - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.H, imageView2.getMeasuredHeight() + (measuredHeight - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.f32236y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.H, AndroidUtilities.dp(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.H, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.A;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.H, AndroidUtilities.dp(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.H, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + measuredHeight);
        }
        org.telegram.ui.bl blVar2 = this.f32232r;
        if (blVar2 != null) {
            blVar2.layout(iDp2, iDp, blVar2.getMeasuredWidth() + iDp2, blVar2.getTextHeight() + iDp);
        } else {
            j6 j6Var = this.f32233s;
            if (j6Var != null) {
                j6Var.layout(iDp2, iDp, j6Var.getMeasuredWidth() + iDp2, j6Var.getTextHeight() + iDp);
            }
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) this.v.get();
        if (h5Var2 != null) {
            h5Var2.layout(iDp2, iDp, h5Var2.getMeasuredWidth() + iDp2, h5Var2.getTextHeight() + iDp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        nn nnVar = this.f32217e;
        int iDp = size - AndroidUtilities.dp((nnVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f10 = this.d;
        nnVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) - 2, 1073741824));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), Integer.MIN_VALUE);
        org.telegram.ui.bl blVar = this.h;
        blVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        j6 j6Var = this.f32233s;
        org.telegram.ui.bl blVar2 = this.f32232r;
        if (blVar2 != null) {
            blVar2.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        } else if (j6Var != null) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.f32235x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), 1073741824));
        }
        ImageView imageView2 = this.f32234w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
        }
        ImageView imageView3 = this.f32236y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ImageView imageView4 = this.A;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i12 = this.K;
        AtomicReference atomicReference = this.f32227n;
        if (i12 != -1 && i12 != size && i12 > size) {
            this.L = i12;
            View view = (org.telegram.ui.ActionBar.h5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference.set(h5Var);
            int i13 = org.telegram.ui.ActionBar.g6.A8;
            org.telegram.ui.ActionBar.c6 c6Var = this.W;
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
            h5Var.setTextSizePx(AndroidUtilities.dp(this.f32221g0 ? 17.5f : 18.0f));
            h5Var.setGravity(3);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            h5Var.i(blVar.getRightDrawable());
            h5Var.j(blVar.getRightDrawable2());
            h5Var.setRightDrawableOutside(blVar.getRightDrawableOutside());
            h5Var.setLeftDrawable(blVar.getLeftDrawable());
            h5Var.l(blVar.getText(), false);
            ViewPropertyAnimator duration = h5Var.animate().alpha(0.0f).setDuration(350L);
            er erVar = er.h;
            duration.setInterpolator(erVar).withEndAction(new kn(this, 0)).start();
            addView(h5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference2.set(h5Var2);
            int i14 = org.telegram.ui.ActionBar.g6.B8;
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
            h5Var2.setTag(Integer.valueOf(i14));
            h5Var2.setTextSizePx(AndroidUtilities.dp(this.f32221g0 ? 13.5f : 14.0f));
            h5Var2.setGravity(3);
            if (blVar2 != null) {
                h5Var2.l(blVar2.getText(), false);
            } else if (j6Var != null) {
                h5Var2.l(j6Var.getText(), false);
            }
            h5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(erVar).withEndAction(new kn(this, 1)).start();
            addView(h5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = (org.telegram.ui.ActionBar.h5) atomicReference.get();
        if (h5Var3 != null) {
            h5Var3.measure(org.telegram.messenger.rl.d((nnVar.getVisibility() == 0 ? 54 : 0) + 16, this.L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
        }
        this.K = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        nc ncVar = this.f32216d0;
        kn knVar = this.f32218e0;
        if (action == 0 && a()) {
            this.f32220f0 = true;
            ncVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(knVar);
            AndroidUtilities.runOnUIThread(knVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f32220f0) {
            ncVar.c(false);
            this.f32220f0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(knVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return false;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f32231q0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f10;
        int i10 = this.F;
        y8 y8Var = this.E;
        y8Var.k(i10, chat);
        nn nnVar = this.f32217e;
        if (nnVar != null) {
            nnVar.e(chat, y8Var);
            if (ChatObject.isForum(chat)) {
                f10 = ChatObject.hasStories(chat) ? 11.0f : 16.0f;
            } else {
                f10 = 21.0f;
            }
            nnVar.setRoundRadius(AndroidUtilities.dp(f10));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        ImageView imageView = this.f32235x;
        if (imageView != null) {
            imageView.setVisibility((!z10 || this.f32219f) ? 8 : 0);
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
        this.f32216d0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.I = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.f32214c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.S == null) {
            org.telegram.ui.bl blVar = this.f32232r;
            if (blVar != null) {
                blVar.k(charSequence);
            } else {
                j6 j6Var = this.f32233s;
                if (j6Var != null) {
                    j6Var.setText(charSequence);
                }
            }
        } else {
            this.S = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.f32231q0;
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
    public final void A(float f10, int i10) {
    }
}
