package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f29694a;
    public final org.telegram.ui.Components.l9 f29695b;
    public final di.d4 f29696c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final ImageView f29697e;
    public final org.telegram.ui.Components.w8 f29698f;
    public CharSequence h;
    public int f29699n;
    public String f29700r;
    public final int f29701s;
    public int f29702w;
    public int f29703x;
    public final boolean f29704y;

    public oa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.f29701s = p10.f24459s0;
        this.f29704y = true;
        this.f29694a = f6Var;
        this.f29702w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28240y6, f6Var);
        this.f29703x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28030n6, f6Var);
        this.f29698f = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f29695b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z9 = hd.f22871a0;
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
        di.d4 d4Var = new di.d4(context, 3);
        this.f29696c = d4Var;
        qs.i(d4Var);
        org.telegram.ui.ActionBar.r6.Y(d4Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        d4Var.setTextSize(17);
        if (hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        d4Var.setGravity(i10 | 48);
        boolean z10 = hd.f22871a0;
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
        addView(d4Var, c8.ha.d(-1, 20.0f, i15, f17, 14.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(14);
        if (hd.f22871a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        k5Var.setGravity(i12 | 48);
        boolean z11 = hd.f22871a0;
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
        addView(k5Var, c8.ha.d(-1, 20.0f, i16, f14, 37.5f, z11 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f29697e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28013m6, f6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z12 = hd.f22871a0;
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
        org.telegram.ui.Components.l9 l9Var = this.f29695b;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        di.d4 d4Var = this.f29696c;
        if (tLObject == null && str == null) {
            this.h = null;
            d4Var.k("");
            k5Var.l("", false);
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
        org.telegram.ui.Components.w8 w8Var = this.f29698f;
        if (user != null) {
            w8Var.r(user);
        } else if (chat != null) {
            w8Var.q(chat);
        } else {
            w8Var.k(this.f29699n, "#", null, null);
        }
        if (user != null) {
            this.f29700r = t10.p(user);
        } else {
            this.f29700r = chat.title;
        }
        d4Var.k(this.f29700r);
        if (this.h != null) {
            k5Var.setTextColor(this.f29702w);
            k5Var.l(this.h, false);
            if (l9Var != null) {
                l9Var.e(user, w8Var);
            }
        } else if (user != null) {
            if (user.bot) {
                k5Var.setTextColor(this.f29702w);
                if (user.bot_chat_history) {
                    k5Var.l(hd.M0(2131752946, null), false);
                } else {
                    k5Var.l(hd.M0(2131752947, null), false);
                }
            } else {
                long j3 = user.f27101id;
                int i7 = this.f29701s;
                if (j3 != p10.i(i7).e() && (((userStatus = user.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i7).getCurrentTime()) && !qp.s1(i7).Z.containsKey(Long.valueOf(user.f27101id)))) {
                    k5Var.setTextColor(this.f29702w);
                    k5Var.l(hd.d0(i7, user, null, null), false);
                } else {
                    k5Var.setTextColor(this.f29703x);
                    k5Var.l(hd.M0(2131747825, null), false);
                }
            }
            l9Var.e(user, w8Var);
        } else if (chat != null) {
            k5Var.setTextColor(this.f29702w);
            if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                int i10 = chat.participants_count;
                if (i10 != 0) {
                    k5Var.l(hd.G(i10, "Subscribers", new Object[0]), false);
                } else if (!org.telegram.messenger.t3.t0(chat)) {
                    k5Var.l(hd.M0(2131752329, null), false);
                } else {
                    k5Var.l(hd.M0(2131752318, null), false);
                }
            } else {
                int i11 = chat.participants_count;
                if (i11 != 0) {
                    k5Var.l(hd.G(i11, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    k5Var.l(hd.M0(2131748641, null), false);
                } else if (!org.telegram.messenger.t3.t0(chat)) {
                    k5Var.l(hd.M0(2131748640, null), false);
                } else {
                    k5Var.l(hd.M0(2131748637, null), false);
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
        ImageView imageView = this.f29697e;
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
        this.f29699n = i7;
    }

    public void setNameTypeface(Typeface typeface) {
        this.f29696c.setTypeface(typeface);
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10;
        try {
            int i11 = this.f29702w;
            int i12 = this.f29703x;
            org.telegram.ui.ActionBar.f6 f6Var = this.f29694a;
            if (this.f29704y) {
                this.f29702w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28240y6, f6Var);
                this.f29703x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28030n6, f6Var);
            }
            org.telegram.ui.ActionBar.k5 k5Var = this.d;
            if (k5Var != null) {
                int textColor = k5Var.getTextColor();
                if (textColor == i12 && i12 != (i10 = this.f29703x)) {
                    k5Var.setTextColor(i10);
                } else if (textColor == i11 && i11 != (i7 = this.f29702w)) {
                    k5Var.setTextColor(i7);
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
