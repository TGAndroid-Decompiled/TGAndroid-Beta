package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pa extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f31255a;
    public final org.telegram.ui.Components.q9 f31256b;
    public final fi.u3 f31257c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final ImageView f31258e;
    public final org.telegram.ui.Components.b9 f31259f;
    public CharSequence h;
    public int f31260n;
    public String f31261r;
    public final int f31262s;
    public int f31263w;
    public int f31264x;
    public final boolean f31265y;

    public pa(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
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
        this.f31262s = j10.f24773t0;
        this.f31265y = true;
        this.f31255a = i6Var;
        this.f31263w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788y6, i6Var);
        this.f31264x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29578n6, i6Var);
        this.f31259f = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f31256b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = gd.f24216a0;
        if (z10) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i14 = i7 | 48;
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
        addView(q9Var, c8.ma.d(48, 48.0f, i14, f10, 11.0f, f11, 0.0f));
        fi.u3 u3Var = new fi.u3(context, 3);
        this.f31257c = u3Var;
        ks.i(u3Var);
        org.telegram.ui.ActionBar.u6.X(u3Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        u3Var.setTextSize(17);
        if (gd.f24216a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u3Var.setGravity(i10 | 48);
        boolean z11 = gd.f24216a0;
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
        addView(u3Var, c8.ma.d(-1, 20.0f, i15, f17, 14.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(14);
        if (gd.f24216a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        n5Var.setGravity(i12 | 48);
        boolean z12 = gd.f24216a0;
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
        addView(n5Var, c8.ma.d(-1, 20.0f, i16, f14, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f31258e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29561m6, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = gd.f24216a0;
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
        addView(imageView, c8.ma.d(-2, -2.0f, i17, f15, 0.0f, f16, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        float f10;
        org.telegram.ui.Components.q9 q9Var = this.f31256b;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        fi.u3 u3Var = this.f31257c;
        if (tLObject == null && str == null) {
            this.h = null;
            u3Var.k("");
            n5Var.l("", false);
            q9Var.setImageDrawable(null);
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
        org.telegram.ui.Components.b9 b9Var = this.f31259f;
        if (user != null) {
            b9Var.r(user);
        } else if (chat != null) {
            b9Var.q(chat);
        } else {
            b9Var.k(this.f31260n, "#", null, null);
        }
        if (user != null) {
            this.f31261r = o10.q(user);
        } else {
            this.f31261r = chat.title;
        }
        u3Var.k(this.f31261r);
        if (this.h != null) {
            n5Var.setTextColor(this.f31263w);
            n5Var.l(this.h, false);
            if (q9Var != null) {
                q9Var.f(user, b9Var);
            }
        } else if (user != null) {
            if (user.bot) {
                n5Var.setTextColor(this.f31263w);
                if (user.bot_chat_history) {
                    n5Var.l(gd.M0(2131752935, null), false);
                } else {
                    n5Var.l(gd.M0(2131752936, null), false);
                }
            } else {
                long j3 = user.f28554id;
                int i7 = this.f31262s;
                if (j3 != j10.i(i7).e() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i7).getCurrentTime()) && !mp.u1(i7).f25596a0.containsKey(Long.valueOf(user.f28554id)))) {
                    n5Var.setTextColor(this.f31263w);
                    n5Var.l(gd.d0(i7, user, null, null), false);
                } else {
                    n5Var.setTextColor(this.f31264x);
                    n5Var.l(gd.M0(2131747633, null), false);
                }
            }
            q9Var.f(user, b9Var);
        } else if (chat != null) {
            n5Var.setTextColor(this.f31263w);
            if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
                int i10 = chat.participants_count;
                if (i10 != 0) {
                    n5Var.l(gd.G(i10, "Subscribers", new Object[0]), false);
                } else if (!org.telegram.messenger.v3.t0(chat)) {
                    n5Var.l(gd.M0(2131752318, null), false);
                } else {
                    n5Var.l(gd.M0(2131752307, null), false);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    n5Var.l(gd.G(i11, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    n5Var.l(gd.M0(2131748450, null), false);
                } else if (!org.telegram.messenger.v3.t0(chat)) {
                    n5Var.l(gd.M0(2131748449, null), false);
                } else {
                    n5Var.l(gd.M0(2131748446, null), false);
                }
            }
            q9Var.f(chat, b9Var);
        } else {
            q9Var.setImageDrawable(b9Var);
        }
        if (chat != null && chat.forum) {
            f10 = 14.0f;
        } else {
            f10 = 24.0f;
        }
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        ImageView imageView = this.f31258e;
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(70.0f), 1073741824));
    }

    public void setCurrentId(int i7) {
        this.f31260n = i7;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f31257c.setTypeface(typeface);
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10;
        try {
            int i11 = this.f31263w;
            int i12 = this.f31264x;
            org.telegram.ui.ActionBar.i6 i6Var = this.f31255a;
            if (this.f31265y) {
                this.f31263w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788y6, i6Var);
                this.f31264x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29578n6, i6Var);
            }
            org.telegram.ui.ActionBar.n5 n5Var = this.d;
            if (n5Var != null) {
                int textColor = n5Var.getTextColor();
                if (textColor == i12 && i12 != (i10 = this.f31264x)) {
                    n5Var.setTextColor(i10);
                } else if (textColor == i11 && i11 != (i7 = this.f31263w)) {
                    n5Var.setTextColor(i7);
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
