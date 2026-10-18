package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wj extends FrameLayout {
    public final w9 f32138a;
    public final ci.l4 f32139b;
    public final org.telegram.ui.ActionBar.j5 f32140c;
    public final xp d;
    public final h9 e;
    public TLRPC.User f32141f;
    public int h;
    public CharSequence f32142n;
    public CharSequence f32143r;
    public TLRPC.User f32144s;
    public String v;
    public String f32145w;
    public final int f32146x;
    public boolean f32147y;

    public wj(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
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
        float f16;
        this.f32146x = UserConfig.selectedAccount;
        this.e = new h9(d6Var);
        w9 w9Var = new w9(context);
        this.f32138a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i15 = i10 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 14.0f;
        }
        if (z10) {
            f10 = 14.0f;
        } else {
            f10 = 0.0f;
        }
        addView(w9Var, w7.z5.a(46.0f, f7, 9.0f, f10, 0.0f, 46, i15));
        ci.l4 l4Var = new ci.l4(context, 4);
        this.f32139b = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        l4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21099j5, d6Var));
        l4Var.setTypeface(AndroidUtilities.bold());
        l4Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l4Var.setGravity(i11 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z11) {
            f11 = 28.0f;
        } else {
            f11 = 72.0f;
        }
        if (z11) {
            f12 = 72.0f;
        } else {
            f12 = 28.0f;
        }
        addView(l4Var, w7.z5.a(20.0f, f11, 12.0f, f12, 0.0f, -1, i16));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f32140c = j5Var;
        j5Var.setTextSize(13);
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21230q5, d6Var));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        j5Var.setGravity(i13 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i17 = i14 | 48;
        if (z12) {
            f13 = 28.0f;
        } else {
            f13 = 72.0f;
        }
        if (z12) {
            f14 = 72.0f;
        } else {
            f14 = 28.0f;
        }
        addView(j5Var, w7.z5.a(20.0f, f13, 36.0f, f14, 0.0f, -1, i17));
        xp xpVar = new xp(context, 21, d6Var);
        this.d = xpVar;
        xpVar.b(-1, org.telegram.ui.ActionBar.h6.f20993d6, org.telegram.ui.ActionBar.h6.f21121k7);
        xpVar.setDrawUnchecked(false);
        xpVar.setDrawBackgroundAsArc(3);
        boolean z13 = LocaleController.isRTL;
        int i18 = (z13 ? 5 : 3) | 48;
        if (z13) {
            f15 = 0.0f;
        } else {
            f15 = 44.0f;
        }
        if (z13) {
            f16 = 44.0f;
        } else {
            f16 = 0.0f;
        }
        addView(xpVar, w7.z5.a(24.0f, f15, 37.0f, f16, 0.0f, 24, i18));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, vj vjVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f32143r = null;
            this.f32142n = null;
            this.f32139b.l("", false);
            this.f32140c.l("", false);
            this.f32138a.setImageDrawable(null);
        } else {
            this.f32143r = null;
            this.f32142n = charSequence;
            this.f32141f = user;
            this.f32147y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new ee(10, this, vjVar));
    }

    public final void b() {
        TLRPC.User user = this.f32141f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        h9 h9Var = this.e;
        if (user != null) {
            h9Var.m(this.f32146x, user);
            TLRPC.UserStatus userStatus = this.f32141f.status;
        } else {
            CharSequence charSequence = this.f32142n;
            if (charSequence != null) {
                h9Var.n(this.h, charSequence.toString(), null);
            } else {
                h9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f32142n;
        ci.l4 l4Var = this.f32139b;
        if (charSequence2 != null) {
            this.f32145w = null;
            l4Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f32141f;
            if (user2 != null) {
                this.f32145w = UserObject.getUserName(user2);
            } else {
                this.f32145w = "";
            }
            l4Var.l(this.f32145w, false);
        }
        setStatus(this.f32143r);
        TLRPC.User user3 = this.f32141f;
        w9 w9Var = this.f32138a;
        if (user3 != null) {
            w9Var.e(user3, h9Var);
        } else {
            w9Var.setImageDrawable(h9Var);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f32147y) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21114k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f32147y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f32143r = charSequence;
        if (charSequence != null) {
            this.f32140c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f32141f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f32140c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f32144s != this.f32141f && (str = this.v) != null) {
                this.f32140c.l(str, false);
            } else {
                this.f32140c.l("", false);
                Utilities.globalQueue.postRunnable(new uj(this, 0));
            }
        }
    }
}
