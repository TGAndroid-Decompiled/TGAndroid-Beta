package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f29702a;
    public final org.telegram.ui.Components.l9 f29703b;
    public final di.e4 f29704c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final ImageView f29705e;
    public final org.telegram.ui.Components.w8 f29706f;
    public CharSequence h;
    public int f29707n;
    public String f29708r;
    public final int f29709s;
    public int f29710w;
    public int f29711x;
    public final boolean f29712y;

    public oa(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.f29709s = p10.f24470s0;
        this.f29712y = true;
        this.f29702a = g6Var;
        this.f29710w = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
        this.f29711x = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28047n6, g6Var);
        this.f29706f = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f29703b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z9 = id.f23157a0;
        if (z9) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i14 = i7 | 48;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 11;
        }
        if (z9) {
            f11 = 11;
        } else {
            f11 = 0.0f;
        }
        addView(l9Var, c8.ha.d(48, 48.0f, i14, f10, 11.0f, f11, 0.0f));
        di.e4 e4Var = new di.e4(context, 3);
        this.f29704c = e4Var;
        qs.i(e4Var);
        org.telegram.ui.ActionBar.s6.X(e4Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        e4Var.setTextSize(17);
        if (id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e4Var.setGravity(i10 | 48);
        boolean z10 = id.f23157a0;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z10) {
            f12 = 28;
        } else {
            f12 = 72;
        }
        float f17 = f12;
        if (z10) {
            f13 = 72;
        } else {
            f13 = 28;
        }
        addView(e4Var, c8.ha.d(-1, 20.0f, i15, f17, 14.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        l5Var.setTextSize(14);
        if (id.f23157a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        l5Var.setGravity(i12 | 48);
        boolean z11 = id.f23157a0;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
        if (z11) {
            f14 = 28.0f;
        } else {
            f14 = 72;
        }
        addView(l5Var, c8.ha.d(-1, 20.0f, i16, f14, 37.5f, z11 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f29705e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.f28030m6, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z12 = id.f23157a0;
        int i17 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f15 = 0.0f;
        } else {
            f15 = 16.0f;
        }
        if (z12) {
            f16 = 16.0f;
        } else {
            f16 = 0.0f;
        }
        addView(imageView, c8.ha.d(-2, -2.0f, i17, f15, 0.0f, f16, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        float f10;
        org.telegram.ui.Components.l9 l9Var = this.f29703b;
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        di.e4 e4Var = this.f29704c;
        if (tLObject == null && str == null) {
            this.h = null;
            e4Var.k("");
            l5Var.l("", false);
            l9Var.setImageDrawable(null);
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
        org.telegram.ui.Components.w8 w8Var = this.f29706f;
        if (user != null) {
            w8Var.r(user);
        } else if (chat != null) {
            w8Var.q(chat);
        } else {
            w8Var.k(this.f29707n, "#", null, null);
        }
        if (user != null) {
            this.f29708r = t10.p(user);
        } else {
            this.f29708r = chat.title;
        }
        e4Var.k(this.f29708r);
        if (this.h != null) {
            l5Var.setTextColor(this.f29710w);
            l5Var.l(this.h, false);
            if (l9Var != null) {
                l9Var.e(user, w8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                l5Var.setTextColor(this.f29710w);
                if (user.bot_chat_history) {
                    l5Var.l(id.M0(2131752946, null), false);
                } else {
                    l5Var.l(id.M0(2131752947, null), false);
                }
            } else {
                long j3 = user.f27105id;
                int i7 = this.f29709s;
                if (j3 != p10.i(i7).e() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i7).getCurrentTime()) && !qp.s1(i7).Z.containsKey(Long.valueOf(user.f27105id)))) {
                    l5Var.setTextColor(this.f29710w);
                    l5Var.l(id.d0(i7, user, null, null), false);
                } else {
                    l5Var.setTextColor(this.f29711x);
                    l5Var.l(id.M0(2131747826, null), false);
                }
            }
            l9Var.e(user, w8Var);
        } else if (chat != null) {
            l5Var.setTextColor(this.f29710w);
            if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                int i10 = chat.participants_count;
                if (i10 != 0) {
                    l5Var.l(id.G(i10, "Subscribers", new Object[0]), false);
                } else if (!org.telegram.messenger.t3.t0(chat)) {
                    l5Var.l(id.M0(2131752329, null), false);
                } else {
                    l5Var.l(id.M0(2131752318, null), false);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    l5Var.l(id.G(i11, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    l5Var.l(id.M0(2131748642, null), false);
                } else if (!org.telegram.messenger.t3.t0(chat)) {
                    l5Var.l(id.M0(2131748641, null), false);
                } else {
                    l5Var.l(id.M0(2131748638, null), false);
                }
            }
            l9Var.e(chat, w8Var);
        } else {
            l9Var.setImageDrawable(w8Var);
        }
        if (chat != null && chat.forum) {
            f10 = 14.0f;
        } else {
            f10 = 24.0f;
        }
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        ImageView imageView = this.f29705e;
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
        this.f29707n = i7;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f29704c.setTypeface(typeface);
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10;
        try {
            int i11 = this.f29710w;
            int i12 = this.f29711x;
            org.telegram.ui.ActionBar.g6 g6Var = this.f29702a;
            if (this.f29712y) {
                this.f29710w = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
                this.f29711x = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28047n6, g6Var);
            }
            org.telegram.ui.ActionBar.l5 l5Var = this.d;
            if (l5Var != null) {
                int textColor = l5Var.getTextColor();
                if (textColor == i12 && i12 != (i10 = this.f29711x)) {
                    l5Var.setTextColor(i10);
                } else if (textColor == i11 && i11 != (i7 = this.f29710w)) {
                    l5Var.setTextColor(i7);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z9) {
    }
}
