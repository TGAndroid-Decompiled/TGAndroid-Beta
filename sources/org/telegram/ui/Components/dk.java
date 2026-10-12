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
public final class dk extends FrameLayout {
    public final y9 f25378a;
    public final ai.a6 f25379b;
    public final org.telegram.ui.ActionBar.h5 f25380c;
    public final fq d;
    public final j9 f25381e;
    public TLRPC.User f25382f;
    public int h;
    public CharSequence f25383n;
    public CharSequence f25384r;
    public TLRPC.User f25385s;
    public String v;
    public String f25386w;
    public final int f25387x;
    public boolean f25388y;

    public dk(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
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
        this.f25387x = UserConfig.selectedAccount;
        this.f25381e = new j9(c6Var);
        y9 y9Var = new y9(context);
        this.f25378a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
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
        addView(y9Var, w7.w5.a(46.0f, f7, 9.0f, f10, 0.0f, 46, i15));
        ai.a6 a6Var = new ai.a6(context, 4);
        this.f25379b = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20668j5, c6Var));
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        a6Var.setGravity(i11 | 48);
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
        addView(a6Var, w7.w5.a(20.0f, f11, 12.0f, f12, 0.0f, -1, i16));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25380c = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20799q5, c6Var));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        h5Var.setGravity(i13 | 48);
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
        addView(h5Var, w7.w5.a(20.0f, f13, 36.0f, f14, 0.0f, -1, i17));
        fq fqVar = new fq(context, 21, c6Var);
        this.d = fqVar;
        fqVar.b(-1, org.telegram.ui.ActionBar.h6.f20560d6, org.telegram.ui.ActionBar.h6.f20689k7);
        fqVar.setDrawUnchecked(false);
        fqVar.setDrawBackgroundAsArc(3);
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
        addView(fqVar, w7.w5.a(24.0f, f15, 37.0f, f16, 0.0f, 24, i18));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, ck ckVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f25384r = null;
            this.f25383n = null;
            this.f25379b.l("", false);
            this.f25380c.l("", false);
            this.f25378a.setImageDrawable(null);
        } else {
            this.f25384r = null;
            this.f25383n = charSequence;
            this.f25382f = user;
            this.f25388y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new md(13, this, ckVar));
    }

    public final void b() {
        TLRPC.User user = this.f25382f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        j9 j9Var = this.f25381e;
        if (user != null) {
            j9Var.m(this.f25387x, user);
            TLRPC.UserStatus userStatus = this.f25382f.status;
        } else {
            CharSequence charSequence = this.f25383n;
            if (charSequence != null) {
                j9Var.n(this.h, charSequence.toString(), null);
            } else {
                j9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f25383n;
        ai.a6 a6Var = this.f25379b;
        if (charSequence2 != null) {
            this.f25386w = null;
            a6Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f25382f;
            if (user2 != null) {
                this.f25386w = UserObject.getUserName(user2);
            } else {
                this.f25386w = "";
            }
            a6Var.l(this.f25386w, false);
        }
        setStatus(this.f25384r);
        TLRPC.User user3 = this.f25382f;
        y9 y9Var = this.f25378a;
        if (user3 != null) {
            y9Var.e(user3, j9Var);
        } else {
            y9Var.setImageDrawable(j9Var);
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
        if (this.f25388y) {
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f20682k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f25388y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f25384r = charSequence;
        if (charSequence != null) {
            this.f25380c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f25382f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f25380c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f25385s != this.f25382f && (str = this.v) != null) {
                this.f25380c.l(str, false);
            } else {
                this.f25380c.l("", false);
                Utilities.globalQueue.postRunnable(new bk(this, 0));
            }
        }
    }
}
