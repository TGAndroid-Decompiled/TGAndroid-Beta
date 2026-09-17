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
    public final x9 f32587a;
    public final bi.j5 f32588b;
    public final org.telegram.ui.ActionBar.j5 f32589c;
    public final mp d;
    public final i9 f32590e;
    public TLRPC.User f32591f;
    public int h;
    public CharSequence f32592n;
    public CharSequence f32593r;
    public TLRPC.User f32594s;
    public String v;
    public String f32595w;
    public final int f32596x;
    public boolean f32597y;

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
        this.f32596x = UserConfig.selectedAccount;
        this.f32590e = new i9(f6Var);
        x9 x9Var = new x9(context);
        this.f32587a = x9Var;
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
        this.f32588b = j5Var;
        NotificationCenter.listenEmojiLoading(j5Var);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20771j5, f6Var));
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
        this.f32589c = j5Var2;
        j5Var2.setTextSize(13);
        j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20898q5, f6Var));
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
        mpVar.b(-1, org.telegram.ui.ActionBar.j6.f20664d6, org.telegram.ui.ActionBar.j6.f20793k7);
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
            this.f32593r = null;
            this.f32592n = null;
            this.f32588b.l("", false);
            this.f32589c.l("", false);
            this.f32587a.setImageDrawable(null);
        } else {
            this.f32593r = null;
            this.f32592n = charSequence;
            this.f32591f = user;
            this.f32597y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new uc(12, this, wjVar));
    }

    public final void b() {
        TLRPC.User user = this.f32591f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        i9 i9Var = this.f32590e;
        if (user != null) {
            i9Var.m(this.f32596x, user);
            TLRPC.UserStatus userStatus = this.f32591f.status;
        } else {
            CharSequence charSequence = this.f32592n;
            if (charSequence != null) {
                i9Var.n(this.h, charSequence.toString(), null);
            } else {
                i9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f32592n;
        bi.j5 j5Var = this.f32588b;
        if (charSequence2 != null) {
            this.f32595w = null;
            j5Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f32591f;
            if (user2 != null) {
                this.f32595w = UserObject.getUserName(user2);
            } else {
                this.f32595w = "";
            }
            j5Var.l(this.f32595w, false);
        }
        setStatus(this.f32593r);
        TLRPC.User user3 = this.f32591f;
        x9 x9Var = this.f32587a;
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
        if (this.f32597y) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20786k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f32597y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f32593r = charSequence;
        if (charSequence != null) {
            this.f32589c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f32591f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f32589c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f32594s != this.f32591f && (str = this.v) != null) {
                this.f32589c.l(str, false);
            } else {
                this.f32589c.l("", false);
                Utilities.globalQueue.postRunnable(new vj(this, 0));
            }
        }
    }
}
