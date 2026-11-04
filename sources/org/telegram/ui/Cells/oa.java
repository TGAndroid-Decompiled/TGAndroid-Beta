package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f29764a;
    public final org.telegram.ui.Components.k9 f29765b;
    public final ei.e4 f29766c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final ImageView f29767e;
    public final org.telegram.ui.Components.u8 f29768f;
    public CharSequence h;
    public int f29769n;
    public String f29770r;
    public final int f29771s;
    public int f29772w;
    public int f29773x;
    public final boolean f29774y;

    public oa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13;
        float f14;
        float f15;
        float f16;
        this.f29771s = h10.f22829t0;
        this.f29774y = true;
        this.f29764a = e6Var;
        this.f29772w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        this.f29773x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var);
        this.f29768f = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29765b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = bd.f21784a0;
        if (z10) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i14 = i3 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 11;
        }
        if (z10) {
            f11 = 11;
        } else {
            f11 = 0.0f;
        }
        addView(k9Var, mf.d(48, 48.0f, i14, f10, 11.0f, f11, 0.0f));
        ei.e4 e4Var = new ei.e4(context, 3);
        this.f29766c = e4Var;
        hs.i(e4Var);
        org.telegram.ui.ActionBar.r6.Y(e4Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        e4Var.setTextSize(17);
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e4Var.setGravity(i10 | 48);
        boolean z11 = bd.f21784a0;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z11) {
            f12 = 28;
        } else {
            f12 = 72;
        }
        float f17 = f12;
        if (z11) {
            f13 = 72;
        } else {
            f13 = 28;
        }
        addView(e4Var, mf.d(-1, 20.0f, i15, f17, 14.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(14);
        if (bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        k5Var.setGravity(i12 | 48);
        boolean z12 = bd.f21784a0;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
        if (z12) {
            f14 = 28.0f;
        } else {
            f14 = 72;
        }
        addView(k5Var, mf.d(-1, 20.0f, i16, f14, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f29767e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28043m6, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = bd.f21784a0;
        int i17 = (z13 ? 5 : 3) | 16;
        if (z13) {
            f15 = 0.0f;
        } else {
            f15 = 16.0f;
        }
        if (z13) {
            f16 = 16.0f;
        } else {
            f16 = 0.0f;
        }
        addView(imageView, mf.d(-2, -2.0f, i17, f15, 0.0f, f16, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        float f10;
        org.telegram.ui.Components.k9 k9Var = this.f29765b;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        ei.e4 e4Var = this.f29766c;
        if (tLObject == null && str == null) {
            this.h = null;
            e4Var.k("");
            k5Var.l("", false);
            k9Var.setImageDrawable(null);
            return;
        }
        this.h = str;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            user = null;
        } else {
            chat = null;
            user = null;
        }
        org.telegram.ui.Components.u8 u8Var = this.f29768f;
        if (user != null) {
            u8Var.r(user);
        } else if (chat != null) {
            u8Var.q(chat);
        } else {
            u8Var.k(this.f29769n, "#", null, null);
        }
        if (user != null) {
            this.f29770r = l10.p(user);
        } else {
            this.f29770r = chat.title;
        }
        e4Var.k(this.f29770r);
        if (this.h != null) {
            k5Var.setTextColor(this.f29772w);
            k5Var.l(this.h, false);
            if (k9Var != null) {
                k9Var.e(user, u8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                k5Var.setTextColor(this.f29772w);
                if (user.bot_chat_history) {
                    k5Var.l(bd.M0(2131752946, null), false);
                } else {
                    k5Var.l(bd.M0(2131752947, null), false);
                }
            } else {
                long j10 = user.f27150id;
                int i3 = this.f29771s;
                if (j10 != h10.i(i3).e() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i3).getCurrentTime()) && !hp.s1(i3).f22954a0.containsKey(Long.valueOf(user.f27150id)))) {
                    k5Var.setTextColor(this.f29772w);
                    k5Var.l(bd.d0(i3, user, null, null), false);
                } else {
                    k5Var.setTextColor(this.f29773x);
                    k5Var.l(bd.M0(2131747834, null), false);
                }
            }
            k9Var.e(user, u8Var);
        } else if (chat != null) {
            k5Var.setTextColor(this.f29772w);
            if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                int i10 = chat.participants_count;
                if (i10 != 0) {
                    k5Var.l(bd.G(i10, "Subscribers", new Object[0]), false);
                } else if (!org.telegram.messenger.t3.t0(chat)) {
                    k5Var.l(bd.M0(2131752329, null), false);
                } else {
                    k5Var.l(bd.M0(2131752318, null), false);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    k5Var.l(bd.G(i11, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    k5Var.l(bd.M0(2131748650, null), false);
                } else if (!org.telegram.messenger.t3.t0(chat)) {
                    k5Var.l(bd.M0(2131748649, null), false);
                } else {
                    k5Var.l(bd.M0(2131748646, null), false);
                }
            }
            k9Var.e(chat, u8Var);
        } else {
            k9Var.setImageDrawable(u8Var);
        }
        if (chat != null && chat.forum) {
            f10 = 14.0f;
        } else {
            f10 = 24.0f;
        }
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        ImageView imageView = this.f29767e;
        if (imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            imageView.setImageResource(0);
            return;
        }
        imageView.getVisibility();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(70.0f), 1073741824));
    }

    public void setCurrentId(int i3) {
        this.f29769n = i3;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f29766c.setTypeface(typeface);
    }

    @Override
    public final void updateColors() {
        int i3;
        int i10;
        try {
            int i11 = this.f29772w;
            int i12 = this.f29773x;
            org.telegram.ui.ActionBar.e6 e6Var = this.f29764a;
            if (this.f29774y) {
                this.f29772w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
                this.f29773x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var);
            }
            org.telegram.ui.ActionBar.k5 k5Var = this.d;
            if (k5Var != null) {
                int textColor = k5Var.getTextColor();
                if (textColor == i12 && i12 != (i10 = this.f29773x)) {
                    k5Var.setTextColor(i10);
                } else if (textColor == i11 && i11 != (i3 = this.f29772w)) {
                    k5Var.setTextColor(i3);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z10) {
    }
}
