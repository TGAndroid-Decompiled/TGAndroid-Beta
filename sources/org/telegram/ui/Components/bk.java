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
public final class bk extends FrameLayout {
    public final y9 f25026a;
    public final ai.a6 f25027b;
    public final org.telegram.ui.ActionBar.h5 f25028c;
    public final dq d;
    public final j9 f25029e;
    public TLRPC.User f25030f;
    public int h;
    public CharSequence f25031n;
    public CharSequence f25032r;
    public TLRPC.User f25033s;
    public String v;
    public String f25034w;
    public final int f25035x;
    public boolean f25036y;

    public bk(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.f25035x = UserConfig.selectedAccount;
        this.f25029e = new j9(d6Var);
        y9 y9Var = new y9(context);
        this.f25026a = y9Var;
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
        addView(y9Var, w7.x5.a(46.0f, f7, 9.0f, f10, 0.0f, 46, i15));
        ai.a6 a6Var = new ai.a6(context, 4);
        this.f25027b = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20930j5, d6Var));
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
        addView(a6Var, w7.x5.a(20.0f, f11, 12.0f, f12, 0.0f, -1, i16));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25028c = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21061q5, d6Var));
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
        addView(h5Var, w7.x5.a(20.0f, f13, 36.0f, f14, 0.0f, -1, i17));
        dq dqVar = new dq(context, 21, d6Var);
        this.d = dqVar;
        dqVar.b(-1, org.telegram.ui.ActionBar.h6.f20822d6, org.telegram.ui.ActionBar.h6.f20951k7);
        dqVar.setDrawUnchecked(false);
        dqVar.setDrawBackgroundAsArc(3);
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
        addView(dqVar, w7.x5.a(24.0f, f15, 37.0f, f16, 0.0f, 24, i18));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, ak akVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f25032r = null;
            this.f25031n = null;
            this.f25027b.l("", false);
            this.f25028c.l("", false);
            this.f25026a.setImageDrawable(null);
        } else {
            this.f25032r = null;
            this.f25031n = charSequence;
            this.f25030f = user;
            this.f25036y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new wc(14, this, akVar));
    }

    public final void b() {
        TLRPC.User user = this.f25030f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        j9 j9Var = this.f25029e;
        if (user != null) {
            j9Var.m(this.f25035x, user);
            TLRPC.UserStatus userStatus = this.f25030f.status;
        } else {
            CharSequence charSequence = this.f25031n;
            if (charSequence != null) {
                j9Var.n(this.h, charSequence.toString(), null);
            } else {
                j9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f25031n;
        ai.a6 a6Var = this.f25027b;
        if (charSequence2 != null) {
            this.f25034w = null;
            a6Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f25030f;
            if (user2 != null) {
                this.f25034w = UserObject.getUserName(user2);
            } else {
                this.f25034w = "";
            }
            a6Var.l(this.f25034w, false);
        }
        setStatus(this.f25032r);
        TLRPC.User user3 = this.f25030f;
        y9 y9Var = this.f25026a;
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
        if (this.f25036y) {
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f20944k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f25036y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f25032r = charSequence;
        if (charSequence != null) {
            this.f25028c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f25030f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f25028c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f25033s != this.f25030f && (str = this.v) != null) {
                this.f25028c.l(str, false);
            } else {
                this.f25028c.l("", false);
                Utilities.globalQueue.postRunnable(new zj(this, 0));
            }
        }
    }
}
