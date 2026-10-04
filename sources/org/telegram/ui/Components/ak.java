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
public final class ak extends FrameLayout {
    public final w9 f24558a;
    public final ai.z5 f24559b;
    public final org.telegram.ui.ActionBar.i5 f24560c;
    public final qp d;
    public final h9 f24561e;
    public TLRPC.User f24562f;
    public int h;
    public CharSequence f24563n;
    public CharSequence f24564r;
    public TLRPC.User f24565s;
    public String v;
    public String f24566w;
    public final int f24567x;
    public boolean f24568y;

    public ak(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.f24567x = UserConfig.selectedAccount;
        this.f24561e = new h9(d6Var);
        w9 w9Var = new w9(context);
        this.f24558a = w9Var;
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
        addView(w9Var, w7.z5.d(46, 46.0f, i15, f7, 9.0f, f10, 0.0f));
        ai.z5 z5Var = new ai.z5(context, 4);
        this.f24559b = z5Var;
        NotificationCenter.listenEmojiLoading(z5Var);
        z5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20926j5, d6Var));
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        z5Var.setGravity(i11 | 48);
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
        addView(z5Var, w7.z5.d(-1, 20.0f, i16, f11, 12.0f, f12, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f24560c = i5Var;
        i5Var.setTextSize(13);
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21058q5, d6Var));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        i5Var.setGravity(i13 | 48);
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
        addView(i5Var, w7.z5.d(-1, 20.0f, i17, f13, 36.0f, f14, 0.0f));
        qp qpVar = new qp(context, 21, d6Var);
        this.d = qpVar;
        qpVar.b(-1, org.telegram.ui.ActionBar.i6.f20818d6, org.telegram.ui.ActionBar.i6.f20948k7);
        qpVar.setDrawUnchecked(false);
        qpVar.setDrawBackgroundAsArc(3);
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
        addView(qpVar, w7.z5.d(24, 24.0f, i18, f15, 37.0f, f16, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, zj zjVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f24564r = null;
            this.f24563n = null;
            this.f24559b.l("", false);
            this.f24560c.l("", false);
            this.f24558a.setImageDrawable(null);
        } else {
            this.f24564r = null;
            this.f24563n = charSequence;
            this.f24562f = user;
            this.f24568y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new be(9, this, zjVar));
    }

    public final void b() {
        TLRPC.User user = this.f24562f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        h9 h9Var = this.f24561e;
        if (user != null) {
            h9Var.m(this.f24567x, user);
            TLRPC.UserStatus userStatus = this.f24562f.status;
        } else {
            CharSequence charSequence = this.f24563n;
            if (charSequence != null) {
                h9Var.n(this.h, charSequence.toString(), null);
            } else {
                h9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f24563n;
        ai.z5 z5Var = this.f24559b;
        if (charSequence2 != null) {
            this.f24566w = null;
            z5Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f24562f;
            if (user2 != null) {
                this.f24566w = UserObject.getUserName(user2);
            } else {
                this.f24566w = "";
            }
            z5Var.l(this.f24566w, false);
        }
        setStatus(this.f24564r);
        TLRPC.User user3 = this.f24562f;
        w9 w9Var = this.f24558a;
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
        if (this.f24568y) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20941k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f24568y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f24564r = charSequence;
        if (charSequence != null) {
            this.f24560c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f24562f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f24560c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f24565s != this.f24562f && (str = this.v) != null) {
                this.f24560c.l(str, false);
            } else {
                this.f24560c.l("", false);
                Utilities.globalQueue.postRunnable(new yj(this, 0));
            }
        }
    }
}
