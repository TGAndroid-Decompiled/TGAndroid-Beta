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
    public final u9 f29920a;
    public final ai.a6 f29921b;
    public final org.telegram.ui.ActionBar.k5 f29922c;
    public final np d;
    public final f9 e;
    public TLRPC.User f29923f;
    public int h;
    public CharSequence f29924n;
    public CharSequence f29925r;
    public TLRPC.User f29926s;
    public String v;
    public String f29927w;
    public final int f29928x;
    public boolean f29929y;

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
        this.f29928x = UserConfig.selectedAccount;
        this.e = new f9(f6Var);
        u9 u9Var = new u9(context);
        this.f29920a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
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
        addView(u9Var, w7.x5.d(46, 46.0f, i15, f7, 9.0f, f10, 0.0f));
        ai.a6 a6Var = new ai.a6(context, 4);
        this.f29921b = a6Var;
        NotificationCenter.listenEmojiLoading(a6Var);
        a6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18970j5, f6Var));
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
        addView(a6Var, w7.x5.d(-1, 20.0f, i16, f11, 12.0f, f12, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29922c = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19100q5, f6Var));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        k5Var.setGravity(i13 | 48);
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
        addView(k5Var, w7.x5.d(-1, 20.0f, i17, f13, 36.0f, f14, 0.0f));
        np npVar = new np(context, 21, f6Var);
        this.d = npVar;
        npVar.b(-1, org.telegram.ui.ActionBar.j6.f18863d6, org.telegram.ui.ActionBar.j6.f18992k7);
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
        addView(npVar, w7.x5.d(24, 24.0f, i18, f15, 37.0f, f16, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, wj wjVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f29925r = null;
            this.f29924n = null;
            this.f29921b.l("", false);
            this.f29922c.l("", false);
            this.f29920a.setImageDrawable(null);
        } else {
            this.f29925r = null;
            this.f29924n = charSequence;
            this.f29923f = user;
            this.f29929y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new oh(6, this, wjVar));
    }

    public final void b() {
        TLRPC.User user = this.f29923f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        f9 f9Var = this.e;
        if (user != null) {
            f9Var.m(this.f29928x, user);
            TLRPC.UserStatus userStatus = this.f29923f.status;
        } else {
            CharSequence charSequence = this.f29924n;
            if (charSequence != null) {
                f9Var.n(this.h, charSequence.toString(), null);
            } else {
                f9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f29924n;
        ai.a6 a6Var = this.f29921b;
        if (charSequence2 != null) {
            this.f29927w = null;
            a6Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f29923f;
            if (user2 != null) {
                this.f29927w = UserObject.getUserName(user2);
            } else {
                this.f29927w = "";
            }
            a6Var.l(this.f29927w, false);
        }
        setStatus(this.f29925r);
        TLRPC.User user3 = this.f29923f;
        u9 u9Var = this.f29920a;
        if (user3 != null) {
            u9Var.e(user3, f9Var);
        } else {
            u9Var.setImageDrawable(f9Var);
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
        if (this.f29929y) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18985k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f29929y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f29925r = charSequence;
        if (charSequence != null) {
            this.f29922c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f29923f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f29922c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f29926s != this.f29923f && (str = this.v) != null) {
                this.f29922c.l(str, false);
            } else {
                this.f29922c.l("", false);
                Utilities.globalQueue.postRunnable(new vj(this, 0));
            }
        }
    }
}
