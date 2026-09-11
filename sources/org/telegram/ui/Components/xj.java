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
public final class xj extends FrameLayout {
    public final x9 f32586a;
    public final bi.j5 f32587b;
    public final org.telegram.ui.ActionBar.j5 f32588c;
    public final mp d;
    public final i9 f32589e;
    public TLRPC.User f32590f;
    public int h;
    public CharSequence f32591n;
    public CharSequence f32592r;
    public TLRPC.User f32593s;
    public String v;
    public String f32594w;
    public final int f32595x;
    public boolean f32596y;

    public xj(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.f32595x = UserConfig.selectedAccount;
        this.f32589e = new i9(f6Var);
        x9 x9Var = new x9(context);
        this.f32586a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
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
        addView(x9Var, w7.x5.d(46, 46.0f, i15, f7, 9.0f, f10, 0.0f));
        bi.j5 j5Var = new bi.j5(context, 4);
        this.f32587b = j5Var;
        NotificationCenter.listenEmojiLoading(j5Var);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, f6Var));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        j5Var.setGravity(i11 | 48);
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
        addView(j5Var, w7.x5.d(-1, 20.0f, i16, f11, 12.0f, f12, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f32588c = j5Var2;
        j5Var2.setTextSize(13);
        j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20897q5, f6Var));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        j5Var2.setGravity(i13 | 48);
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
        addView(j5Var2, w7.x5.d(-1, 20.0f, i17, f13, 36.0f, f14, 0.0f));
        mp mpVar = new mp(context, 21, f6Var);
        this.d = mpVar;
        mpVar.b(-1, org.telegram.ui.ActionBar.j6.f20663d6, org.telegram.ui.ActionBar.j6.f20792k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(3);
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
        addView(mpVar, w7.x5.d(24, 24.0f, i18, f15, 37.0f, f16, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, wj wjVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f32592r = null;
            this.f32591n = null;
            this.f32587b.l("", false);
            this.f32588c.l("", false);
            this.f32586a.setImageDrawable(null);
        } else {
            this.f32592r = null;
            this.f32591n = charSequence;
            this.f32590f = user;
            this.f32596y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new uc(12, this, wjVar));
    }

    public final void b() {
        TLRPC.User user = this.f32590f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        i9 i9Var = this.f32589e;
        if (user != null) {
            i9Var.m(this.f32595x, user);
            TLRPC.UserStatus userStatus = this.f32590f.status;
        } else {
            CharSequence charSequence = this.f32591n;
            if (charSequence != null) {
                i9Var.n(this.h, charSequence.toString(), null);
            } else {
                i9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f32591n;
        bi.j5 j5Var = this.f32587b;
        if (charSequence2 != null) {
            this.f32594w = null;
            j5Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f32590f;
            if (user2 != null) {
                this.f32594w = UserObject.getUserName(user2);
            } else {
                this.f32594w = "";
            }
            j5Var.l(this.f32594w, false);
        }
        setStatus(this.f32592r);
        TLRPC.User user3 = this.f32590f;
        x9 x9Var = this.f32586a;
        if (user3 != null) {
            x9Var.e(user3, i9Var);
        } else {
            x9Var.setImageDrawable(i9Var);
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
        if (this.f32596y) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20785k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f32596y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f32592r = charSequence;
        if (charSequence != null) {
            this.f32588c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f32590f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f32588c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f32593s != this.f32590f && (str = this.v) != null) {
                this.f32588c.l(str, false);
            } else {
                this.f32588c.l("", false);
                Utilities.globalQueue.postRunnable(new vj(this, 0));
            }
        }
    }
}
