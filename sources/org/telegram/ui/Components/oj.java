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
public final class oj extends FrameLayout {
    public final o9 f31391a;
    public final dg.c f31392b;
    public final org.telegram.ui.ActionBar.h5 f31393c;
    public final dp d;
    public final z8 f31394e;
    public TLRPC.User f31395f;
    public int h;
    public CharSequence f31396n;
    public CharSequence f31397r;
    public TLRPC.User f31398s;
    public String v;
    public String f31399w;
    public final int f31400x;
    public boolean f31401y;

    public oj(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
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
        float f17;
        this.f31400x = UserConfig.selectedAccount;
        this.f31394e = new z8(b6Var);
        o9 o9Var = new o9(context);
        this.f31391a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        int i14 = i9 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 14.0f;
        }
        if (z10) {
            f11 = 14.0f;
        } else {
            f11 = 0.0f;
        }
        addView(o9Var, g7.e6.d(46, 46.0f, i14, f10, 9.0f, f11, 0.0f));
        dg.c cVar = new dg.c(context, 5);
        this.f31392b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        cVar.setGravity(i10 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z11) {
            f12 = 28.0f;
        } else {
            f12 = 72.0f;
        }
        if (z11) {
            f13 = 72.0f;
        } else {
            f13 = 28.0f;
        }
        addView(cVar, g7.e6.d(-1, 20.0f, i15, f12, 12.0f, f13, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f31393c = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23228q5, b6Var));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h5Var.setGravity(i12 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
        if (z12) {
            f14 = 28.0f;
        } else {
            f14 = 72.0f;
        }
        if (z12) {
            f15 = 72.0f;
        } else {
            f15 = 28.0f;
        }
        addView(h5Var, g7.e6.d(-1, 20.0f, i16, f14, 36.0f, f15, 0.0f));
        dp dpVar = new dp(context, 21, b6Var);
        this.d = dpVar;
        dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(3);
        boolean z13 = LocaleController.isRTL;
        int i17 = (z13 ? 5 : 3) | 48;
        if (z13) {
            f16 = 0.0f;
        } else {
            f16 = 44.0f;
        }
        if (z13) {
            f17 = 44.0f;
        } else {
            f17 = 0.0f;
        }
        addView(dpVar, g7.e6.d(24, 24.0f, i17, f16, 37.0f, f17, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, nj njVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f31397r = null;
            this.f31396n = null;
            this.f31392b.l("", false);
            this.f31393c.l("", false);
            this.f31391a.setImageDrawable(null);
        } else {
            this.f31397r = null;
            this.f31396n = charSequence;
            this.f31395f = user;
            this.f31401y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.wq(18, this, njVar));
    }

    public final void b() {
        TLRPC.User user = this.f31395f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        z8 z8Var = this.f31394e;
        if (user != null) {
            z8Var.m(this.f31400x, user);
            TLRPC.UserStatus userStatus = this.f31395f.status;
        } else {
            CharSequence charSequence = this.f31396n;
            if (charSequence != null) {
                z8Var.n(this.h, charSequence.toString(), null);
            } else {
                z8Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f31396n;
        dg.c cVar = this.f31392b;
        if (charSequence2 != null) {
            this.f31399w = null;
            cVar.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f31395f;
            if (user2 != null) {
                this.f31399w = UserObject.getUserName(user2);
            } else {
                this.f31399w = "";
            }
            cVar.l(this.f31399w, false);
        }
        setStatus(this.f31397r);
        TLRPC.User user3 = this.f31395f;
        o9 o9Var = this.f31391a;
        if (user3 != null) {
            o9Var.e(user3, z8Var);
        } else {
            o9Var.setImageDrawable(z8Var);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (this.f31401y) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(70.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f31401y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i9) {
        this.h = i9;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f31397r = charSequence;
        if (charSequence != null) {
            this.f31393c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f31395f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f31393c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f31398s != this.f31395f && (str = this.v) != null) {
                this.f31393c.l(str, false);
            } else {
                this.f31393c.l("", false);
                Utilities.globalQueue.postRunnable(new mj(this, 0));
            }
        }
    }
}
