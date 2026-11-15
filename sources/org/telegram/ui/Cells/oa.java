package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f30825a;
    public final org.telegram.ui.Components.i9 f30826b;
    public final fi.w3 f30827c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final ImageView f30828e;
    public final org.telegram.ui.Components.t8 f30829f;
    public CharSequence h;
    public int f30830n;
    public String f30831r;
    public final int f30832s;
    public int f30833w;
    public int f30834x;
    public final boolean f30835y;

    public oa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.f30832s = m10.f24940t0;
        this.f30835y = true;
        this.f30825a = e6Var;
        this.f30833w = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        this.f30834x = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29031n6, e6Var);
        this.f30829f = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f30826b = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = hd.f24104a0;
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
        addView(i9Var, c8.ja.d(48, 48.0f, i14, f10, 11.0f, f11, 0.0f));
        fi.w3 w3Var = new fi.w3(context, 3);
        this.f30827c = w3Var;
        ns.i(w3Var);
        org.telegram.ui.ActionBar.q6.X(w3Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        w3Var.setTextSize(17);
        if (hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        w3Var.setGravity(i10 | 48);
        boolean z11 = hd.f24104a0;
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
        addView(w3Var, c8.ja.d(-1, 20.0f, i15, f17, 14.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTextSize(14);
        if (hd.f24104a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        j5Var.setGravity(i12 | 48);
        boolean z12 = hd.f24104a0;
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
        addView(j5Var, c8.ja.d(-1, 20.0f, i16, f14, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30828e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.f29014m6, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = hd.f24104a0;
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
        addView(imageView, c8.ja.d(-2, -2.0f, i17, f15, 0.0f, f16, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        float f10;
        org.telegram.ui.Components.i9 i9Var = this.f30826b;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        fi.w3 w3Var = this.f30827c;
        if (tLObject == null && str == null) {
            this.h = null;
            w3Var.k("");
            j5Var.l("", false);
            i9Var.setImageDrawable(null);
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
        org.telegram.ui.Components.t8 t8Var = this.f30829f;
        if (user != null) {
            t8Var.r(user);
        } else if (chat != null) {
            t8Var.q(chat);
        } else {
            t8Var.k(this.f30830n, "#", null, null);
        }
        if (user != null) {
            this.f30831r = q10.p(user);
        } else {
            this.f30831r = chat.title;
        }
        w3Var.k(this.f30831r);
        if (this.h != null) {
            j5Var.setTextColor(this.f30833w);
            j5Var.l(this.h, false);
            if (i9Var != null) {
                i9Var.f(user, t8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                j5Var.setTextColor(this.f30833w);
                if (user.bot_chat_history) {
                    j5Var.l(hd.M0(2131752946, null), false);
                } else {
                    j5Var.l(hd.M0(2131752947, null), false);
                }
            } else {
                long j3 = user.f28200id;
                int i7 = this.f30832s;
                if (j3 != m10.i(i7).e() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i7).getCurrentTime()) && !np.s1(i7).f25228a0.containsKey(Long.valueOf(user.f28200id)))) {
                    j5Var.setTextColor(this.f30833w);
                    j5Var.l(hd.d0(i7, user, null, null), false);
                } else {
                    j5Var.setTextColor(this.f30834x);
                    j5Var.l(hd.M0(2131747826, null), false);
                }
            }
            i9Var.f(user, t8Var);
        } else if (chat != null) {
            j5Var.setTextColor(this.f30833w);
            if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                int i10 = chat.participants_count;
                if (i10 != 0) {
                    j5Var.l(hd.G(i10, "Subscribers", new Object[0]), false);
                } else if (!org.telegram.messenger.t3.t0(chat)) {
                    j5Var.l(hd.M0(2131752329, null), false);
                } else {
                    j5Var.l(hd.M0(2131752318, null), false);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    j5Var.l(hd.G(i11, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    j5Var.l(hd.M0(2131748642, null), false);
                } else if (!org.telegram.messenger.t3.t0(chat)) {
                    j5Var.l(hd.M0(2131748641, null), false);
                } else {
                    j5Var.l(hd.M0(2131748638, null), false);
                }
            }
            i9Var.f(chat, t8Var);
        } else {
            i9Var.setImageDrawable(t8Var);
        }
        if (chat != null && chat.forum) {
            f10 = 14.0f;
        } else {
            f10 = 24.0f;
        }
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(f10));
        ImageView imageView = this.f30828e;
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
        this.f30830n = i7;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f30827c.setTypeface(typeface);
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10;
        try {
            int i11 = this.f30833w;
            int i12 = this.f30834x;
            org.telegram.ui.ActionBar.e6 e6Var = this.f30825a;
            if (this.f30835y) {
                this.f30833w = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
                this.f30834x = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29031n6, e6Var);
            }
            org.telegram.ui.ActionBar.j5 j5Var = this.d;
            if (j5Var != null) {
                int textColor = j5Var.getTextColor();
                if (textColor == i12 && i12 != (i10 = this.f30834x)) {
                    j5Var.setTextColor(i10);
                } else if (textColor == i11 && i11 != (i7 = this.f30833w)) {
                    j5Var.setTextColor(i7);
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
