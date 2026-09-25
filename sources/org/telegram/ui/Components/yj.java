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
public final class yj extends FrameLayout {
    public final w9 f30627a;
    public final ai.z5 f30628b;
    public final org.telegram.ui.ActionBar.h5 f30629c;
    public final op d;
    public final h9 e;
    public TLRPC.User f30630f;
    public int h;
    public CharSequence f30631n;
    public CharSequence f30632r;
    public TLRPC.User f30633s;
    public String v;
    public String f30634w;
    public final int f30635x;
    public boolean f30636y;

    public yj(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.f30635x = UserConfig.selectedAccount;
        this.e = new h9(d6Var);
        w9 w9Var = new w9(context);
        this.f30627a = w9Var;
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
        addView(w9Var, w7.y5.d(46, 46.0f, i15, f7, 9.0f, f10, 0.0f));
        ai.z5 z5Var = new ai.z5(context, 4);
        this.f30628b = z5Var;
        NotificationCenter.listenEmojiLoading(z5Var);
        z5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19166j5, d6Var));
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
        addView(z5Var, w7.y5.d(-1, 20.0f, i16, f11, 12.0f, f12, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f30629c = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19298q5, d6Var));
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
        addView(h5Var, w7.y5.d(-1, 20.0f, i17, f13, 36.0f, f14, 0.0f));
        op opVar = new op(context, 21, d6Var);
        this.d = opVar;
        opVar.b(-1, org.telegram.ui.ActionBar.h6.f19060d6, org.telegram.ui.ActionBar.h6.f19188k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(3);
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
        addView(opVar, w7.y5.d(24, 24.0f, i18, f15, 37.0f, f16, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, xj xjVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f30632r = null;
            this.f30631n = null;
            this.f30628b.l("", false);
            this.f30629c.l("", false);
            this.f30627a.setImageDrawable(null);
        } else {
            this.f30632r = null;
            this.f30631n = charSequence;
            this.f30630f = user;
            this.f30636y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new kd(11, this, xjVar));
    }

    public final void b() {
        TLRPC.User user = this.f30630f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        h9 h9Var = this.e;
        if (user != null) {
            h9Var.m(this.f30635x, user);
            TLRPC.UserStatus userStatus = this.f30630f.status;
        } else {
            CharSequence charSequence = this.f30631n;
            if (charSequence != null) {
                h9Var.n(this.h, charSequence.toString(), null);
            } else {
                h9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f30631n;
        ai.z5 z5Var = this.f30628b;
        if (charSequence2 != null) {
            this.f30634w = null;
            z5Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f30630f;
            if (user2 != null) {
                this.f30634w = UserObject.getUserName(user2);
            } else {
                this.f30634w = "";
            }
            z5Var.l(this.f30634w, false);
        }
        setStatus(this.f30632r);
        TLRPC.User user3 = this.f30630f;
        w9 w9Var = this.f30627a;
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
        if (this.f30636y) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f19181k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f30636y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f30632r = charSequence;
        if (charSequence != null) {
            this.f30629c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f30630f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f30629c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f30633s != this.f30630f && (str = this.v) != null) {
                this.f30629c.l(str, false);
            } else {
                this.f30629c.l("", false);
                Utilities.globalQueue.postRunnable(new wj(this, 0));
            }
        }
    }
}
