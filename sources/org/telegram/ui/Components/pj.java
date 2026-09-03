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
public final class pj extends FrameLayout {
    public final p9 f27863a;
    public final ig.c f27864b;
    public final org.telegram.ui.ActionBar.k5 f27865c;
    public final kp d;
    public final z8 e;
    public TLRPC.User f27866f;
    public int h;
    public CharSequence f27867n;
    public CharSequence f27868r;
    public TLRPC.User f27869s;
    public String v;
    public String f27870w;
    public final int f27871x;
    public boolean f27872y;

    public pj(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        int i13;
        int i14;
        float f14;
        float f15;
        float f16;
        float f17;
        this.f27871x = UserConfig.selectedAccount;
        this.e = new z8(f6Var);
        p9 p9Var = new p9(context);
        this.f27863a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i15 = i10 | 48;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 14.0f;
        }
        if (z4) {
            f11 = 14.0f;
        } else {
            f11 = 0.0f;
        }
        addView(p9Var, k7.b6.d(46, 46.0f, i15, f10, 9.0f, f11, 0.0f));
        ig.c cVar = new ig.c(context, 5);
        this.f27864b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19987j5, f6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        cVar.setGravity(i11 | 48);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z10) {
            f12 = 28.0f;
        } else {
            f12 = 72.0f;
        }
        if (z10) {
            f13 = 72.0f;
        } else {
            f13 = 28.0f;
        }
        addView(cVar, k7.b6.d(-1, 20.0f, i16, f12, 12.0f, f13, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f27865c = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20114q5, f6Var));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        k5Var.setGravity(i13 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i17 = i14 | 48;
        if (z11) {
            f14 = 28.0f;
        } else {
            f14 = 72.0f;
        }
        if (z11) {
            f15 = 72.0f;
        } else {
            f15 = 28.0f;
        }
        addView(k5Var, k7.b6.d(-1, 20.0f, i17, f14, 36.0f, f15, 0.0f));
        kp kpVar = new kp(context, 21, f6Var);
        this.d = kpVar;
        kpVar.b(-1, org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.f20007k7);
        kpVar.setDrawUnchecked(false);
        kpVar.setDrawBackgroundAsArc(3);
        boolean z12 = LocaleController.isRTL;
        int i18 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f16 = 0.0f;
        } else {
            f16 = 44.0f;
        }
        if (z12) {
            f17 = 44.0f;
        } else {
            f17 = 0.0f;
        }
        addView(kpVar, k7.b6.d(24, 24.0f, i18, f16, 37.0f, f17, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, oj ojVar, boolean z4) {
        if (user == null && charSequence == null) {
            this.f27868r = null;
            this.f27867n = null;
            this.f27864b.l("", false);
            this.f27865c.l("", false);
            this.f27863a.setImageDrawable(null);
        } else {
            this.f27868r = null;
            this.f27867n = charSequence;
            this.f27866f = user;
            this.f27872y = z4;
            setWillNotDraw(!z4);
            b();
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.np(23, this, ojVar));
    }

    public final void b() {
        TLRPC.User user = this.f27866f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        z8 z8Var = this.e;
        if (user != null) {
            z8Var.m(this.f27871x, user);
            TLRPC.UserStatus userStatus = this.f27866f.status;
        } else {
            CharSequence charSequence = this.f27867n;
            if (charSequence != null) {
                z8Var.n(this.h, charSequence.toString(), null);
            } else {
                z8Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f27867n;
        ig.c cVar = this.f27864b;
        if (charSequence2 != null) {
            this.f27870w = null;
            cVar.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f27866f;
            if (user2 != null) {
                this.f27870w = UserObject.getUserName(user2);
            } else {
                this.f27870w = "";
            }
            cVar.l(this.f27870w, false);
        }
        setStatus(this.f27868r);
        TLRPC.User user3 = this.f27866f;
        p9 p9Var = this.f27863a;
        if (user3 != null) {
            p9Var.e(user3, z8Var);
        } else {
            p9Var.setImageDrawable(z8Var);
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
        if (this.f27872y) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f27872y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f27868r = charSequence;
        if (charSequence != null) {
            this.f27865c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f27866f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f27865c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f27869s != this.f27866f && (str = this.v) != null) {
                this.f27865c.l(str, false);
            } else {
                this.f27865c.l("", false);
                Utilities.globalQueue.postRunnable(new nj(this, 0));
            }
        }
    }
}
