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
    public final v9 f30285a;
    public final ai.a6 f30286b;
    public final org.telegram.ui.ActionBar.j5 f30287c;
    public final np d;
    public final g9 e;
    public TLRPC.User f30288f;
    public int h;
    public CharSequence f30289n;
    public CharSequence f30290r;
    public TLRPC.User f30291s;
    public String v;
    public String f30292w;
    public final int f30293x;
    public boolean f30294y;

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
        this.f30293x = UserConfig.selectedAccount;
        this.e = new g9(f6Var);
        v9 v9Var = new v9(context);
        this.f30285a = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
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
        addView(v9Var, w7.y5.d(46, 46.0f, i15, f7, 9.0f, f10, 0.0f));
        ai.a6 a6Var = new ai.a6(context, 4);
        this.f30286b = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19201j5, f6Var));
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
        addView(a6Var, w7.y5.d(-1, 20.0f, i16, f11, 12.0f, f12, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f30287c = j5Var;
        j5Var.setTextSize(13);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19332q5, f6Var));
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
        addView(j5Var, w7.y5.d(-1, 20.0f, i17, f13, 36.0f, f14, 0.0f));
        np npVar = new np(context, 21, f6Var);
        this.d = npVar;
        npVar.b(-1, org.telegram.ui.ActionBar.j6.f19094d6, org.telegram.ui.ActionBar.j6.f19223k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(3);
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
        addView(npVar, w7.y5.d(24, 24.0f, i18, f15, 37.0f, f16, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, wj wjVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f30290r = null;
            this.f30289n = null;
            this.f30286b.l("", false);
            this.f30287c.l("", false);
            this.f30285a.setImageDrawable(null);
        } else {
            this.f30290r = null;
            this.f30289n = charSequence;
            this.f30288f = user;
            this.f30294y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new tc(12, this, wjVar));
    }

    public final void b() {
        TLRPC.User user = this.f30288f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        g9 g9Var = this.e;
        if (user != null) {
            g9Var.m(this.f30293x, user);
            TLRPC.UserStatus userStatus = this.f30288f.status;
        } else {
            CharSequence charSequence = this.f30289n;
            if (charSequence != null) {
                g9Var.n(this.h, charSequence.toString(), null);
            } else {
                g9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f30289n;
        ai.a6 a6Var = this.f30286b;
        if (charSequence2 != null) {
            this.f30292w = null;
            a6Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f30288f;
            if (user2 != null) {
                this.f30292w = UserObject.getUserName(user2);
            } else {
                this.f30292w = "";
            }
            a6Var.l(this.f30292w, false);
        }
        setStatus(this.f30290r);
        TLRPC.User user3 = this.f30288f;
        v9 v9Var = this.f30285a;
        if (user3 != null) {
            v9Var.e(user3, g9Var);
        } else {
            v9Var.setImageDrawable(g9Var);
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
        if (this.f30294y) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f19216k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f30294y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f30290r = charSequence;
        if (charSequence != null) {
            this.f30287c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f30288f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f30287c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f30291s != this.f30288f && (str = this.v) != null) {
                this.f30287c.l(str, false);
            } else {
                this.f30287c.l("", false);
                Utilities.globalQueue.postRunnable(new vj(this, 0));
            }
        }
    }
}
