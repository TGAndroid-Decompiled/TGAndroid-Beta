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
    public final z9 f31591a;
    public final bi.l5 f31592b;
    public final org.telegram.ui.ActionBar.h5 f31593c;
    public final aq d;
    public final k9 e;
    public TLRPC.User f31594f;
    public int h;
    public CharSequence f31595n;
    public CharSequence f31596r;
    public TLRPC.User f31597s;
    public String v;
    public String f31598w;
    public final int f31599x;
    public boolean f31600y;

    public yj(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
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
        this.f31599x = UserConfig.selectedAccount;
        this.e = new k9(c6Var);
        z9 z9Var = new z9(context);
        this.f31591a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
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
        addView(z9Var, w7.a6.a(46.0f, f7, 9.0f, f10, 0.0f, 46, i15));
        bi.l5 l5Var = new bi.l5(context, 4);
        this.f31592b = l5Var;
        NotificationCenter.listenEmojiLoading(l5Var);
        l5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007j5, c6Var));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l5Var.setGravity(i11 | 48);
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
        addView(l5Var, w7.a6.a(20.0f, f11, 12.0f, f12, 0.0f, -1, i16));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f31593c = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20138q5, c6Var));
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
        addView(h5Var, w7.a6.a(20.0f, f13, 36.0f, f14, 0.0f, -1, i17));
        aq aqVar = new aq(context, 21, c6Var);
        this.d = aqVar;
        aqVar.b(-1, org.telegram.ui.ActionBar.g6.f19901d6, org.telegram.ui.ActionBar.g6.f20029k7);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(3);
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
        addView(aqVar, w7.a6.a(24.0f, f15, 37.0f, f16, 0.0f, 24, i18));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, xj xjVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f31596r = null;
            this.f31595n = null;
            this.f31592b.l("", false);
            this.f31593c.l("", false);
            this.f31591a.setImageDrawable(null);
        } else {
            this.f31596r = null;
            this.f31595n = charSequence;
            this.f31594f = user;
            this.f31600y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.rp(26, this, xjVar));
    }

    public final void b() {
        TLRPC.User user = this.f31594f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        k9 k9Var = this.e;
        if (user != null) {
            k9Var.m(this.f31599x, user);
            TLRPC.UserStatus userStatus = this.f31594f.status;
        } else {
            CharSequence charSequence = this.f31595n;
            if (charSequence != null) {
                k9Var.n(this.h, charSequence.toString(), null);
            } else {
                k9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f31595n;
        bi.l5 l5Var = this.f31592b;
        if (charSequence2 != null) {
            this.f31598w = null;
            l5Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f31594f;
            if (user2 != null) {
                this.f31598w = UserObject.getUserName(user2);
            } else {
                this.f31598w = "";
            }
            l5Var.l(this.f31598w, false);
        }
        setStatus(this.f31596r);
        TLRPC.User user3 = this.f31594f;
        z9 z9Var = this.f31591a;
        if (user3 != null) {
            z9Var.e(user3, k9Var);
        } else {
            z9Var.setImageDrawable(k9Var);
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
        if (this.f31600y) {
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
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f20022k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f31600y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f31596r = charSequence;
        if (charSequence != null) {
            this.f31593c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f31594f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f31593c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f31597s != this.f31594f && (str = this.v) != null) {
                this.f31593c.l(str, false);
            } else {
                this.f31593c.l("", false);
                Utilities.globalQueue.postRunnable(new wj(this, 0));
            }
        }
    }
}
