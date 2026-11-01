package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f22410a;
    public final org.telegram.ui.Components.g9 f22411b;
    public final og.c f22412c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final ImageView e;
    public final org.telegram.ui.Components.r8 f22413f;
    public CharSequence h;
    public int f22414n;
    public String f22415r;
    public final int f22416s;
    public int f22417w;
    public int f22418x;
    public final boolean f22419y;

    public oa(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        int i13;
        int i14;
        float f13;
        float f14;
        float f15;
        this.f22416s = e20.f15506s0;
        this.f22419y = true;
        this.f22410a = p6Var;
        this.f22417w = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
        this.f22418x = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n6, p6Var);
        this.f22413f = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f22411b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
        boolean z10 = dd.X;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i15 = i10 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 11;
        }
        if (z10) {
            f10 = 11;
        } else {
            f10 = 0.0f;
        }
        addView(g9Var, w7.b6.d(48, 48.0f, i15, f7, 11.0f, f10, 0.0f));
        og.c cVar = new og.c(context, 3);
        this.f22412c = cVar;
        at.i(cVar);
        org.telegram.ui.ActionBar.a7.Y(cVar, org.telegram.ui.ActionBar.t6.G6, p6Var);
        cVar.setTextSize(17);
        if (dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        cVar.setGravity(i11 | 48);
        boolean z11 = dd.X;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z11) {
            f11 = 28;
        } else {
            f11 = 72;
        }
        float f16 = f11;
        if (z11) {
            f12 = 72;
        } else {
            f12 = 28;
        }
        addView(cVar, w7.b6.d(-1, 20.0f, i16, f16, 14.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        u5Var.setTextSize(14);
        if (dd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        u5Var.setGravity(i13 | 48);
        boolean z12 = dd.X;
        if (z12) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i17 = i14 | 48;
        if (z12) {
            f13 = 28.0f;
        } else {
            f13 = 72;
        }
        addView(u5Var, w7.b6.d(-1, 20.0f, i17, f13, 37.5f, z12 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21096m6, p6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z13 = dd.X;
        int i18 = (z13 ? 5 : 3) | 16;
        if (z13) {
            f14 = 0.0f;
        } else {
            f14 = 16.0f;
        }
        if (z13) {
            f15 = 16.0f;
        } else {
            f15 = 0.0f;
        }
        addView(imageView, w7.b6.d(-2, -2.0f, i18, f14, 0.0f, f15, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        float f7;
        org.telegram.ui.Components.g9 g9Var = this.f22411b;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        og.c cVar = this.f22412c;
        if (tLObject == null && str == null) {
            this.h = null;
            cVar.k("");
            u5Var.l("", false);
            g9Var.setImageDrawable(null);
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
        org.telegram.ui.Components.r8 r8Var = this.f22413f;
        if (user != null) {
            r8Var.r(user);
        } else if (chat != null) {
            r8Var.q(chat);
        } else {
            r8Var.k(this.f22414n, "#", null, null);
        }
        if (user != null) {
            this.f22415r = i20.p(user);
        } else {
            this.f22415r = chat.title;
        }
        cVar.k(this.f22415r);
        if (this.h != null) {
            u5Var.setTextColor(this.f22417w);
            u5Var.l(this.h, false);
            if (g9Var != null) {
                g9Var.e(user, r8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                u5Var.setTextColor(this.f22417w);
                if (user.bot_chat_history) {
                    u5Var.l(dd.L0(2131752946, null), false);
                } else {
                    u5Var.l(dd.L0(2131752947, null), false);
                }
            } else {
                long j10 = user.f19943id;
                int i10 = this.f22416s;
                if (j10 != e20.i(i10).e() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !wp.r1(i10).Z.containsKey(Long.valueOf(user.f19943id)))) {
                    u5Var.setTextColor(this.f22417w);
                    u5Var.l(dd.d0(i10, user, null, null), false);
                } else {
                    u5Var.setTextColor(this.f22418x);
                    u5Var.l(dd.L0(2131747842, null), false);
                }
            }
            g9Var.e(user, r8Var);
        } else if (chat != null) {
            u5Var.setTextColor(this.f22417w);
            if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    u5Var.l(dd.G(i11, "Subscribers", new Object[0]), false);
                } else if (!org.telegram.messenger.w3.t0(chat)) {
                    u5Var.l(dd.L0(2131752329, null), false);
                } else {
                    u5Var.l(dd.L0(2131752318, null), false);
                }
            } else {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    u5Var.l(dd.G(i12, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    u5Var.l(dd.L0(2131748657, null), false);
                } else if (!org.telegram.messenger.w3.t0(chat)) {
                    u5Var.l(dd.L0(2131748656, null), false);
                } else {
                    u5Var.l(dd.L0(2131748653, null), false);
                }
            }
            g9Var.e(chat, r8Var);
        } else {
            g9Var.setImageDrawable(r8Var);
        }
        if (chat != null && chat.forum) {
            f7 = 14.0f;
        } else {
            f7 = 24.0f;
        }
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(f7));
        ImageView imageView = this.e;
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(70.0f), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.f22414n = i10;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f22412c.setTypeface(typeface);
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11;
        try {
            int i12 = this.f22417w;
            int i13 = this.f22418x;
            org.telegram.ui.ActionBar.p6 p6Var = this.f22410a;
            if (this.f22419y) {
                this.f22417w = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
                this.f22418x = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n6, p6Var);
            }
            org.telegram.ui.ActionBar.u5 u5Var = this.d;
            if (u5Var != null) {
                int textColor = u5Var.getTextColor();
                if (textColor == i13 && i13 != (i11 = this.f22418x)) {
                    u5Var.setTextColor(i11);
                } else if (textColor == i12 && i12 != (i10 = this.f22417w)) {
                    u5Var.setTextColor(i10);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z10) {
    }
}
