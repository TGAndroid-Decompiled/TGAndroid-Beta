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
    public final w9 f21513a;
    public final org.telegram.ui.Cells.f4 f21514b;
    public final org.telegram.ui.ActionBar.l5 f21515c;
    public final tp d;
    public final g9 e;
    public TLRPC.User f21516f;
    public int h;
    public CharSequence f21517n;
    public CharSequence f21518r;
    public TLRPC.User f21519s;
    public String v;
    public String f21520w;
    public final int f21521x;
    public boolean f21522y;

    public ak(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.f21521x = UserConfig.selectedAccount;
        this.e = new g9(f6Var);
        w9 w9Var = new w9(context);
        this.f21513a = w9Var;
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
        addView(w9Var, w7.a6.d(46, 46.0f, i15, f7, 9.0f, f10, 0.0f));
        org.telegram.ui.Cells.f4 f4Var = new org.telegram.ui.Cells.f4(context, 3);
        this.f21514b = f4Var;
        NotificationCenter.listenEmojiLoading(f4Var);
        f4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
        f4Var.setTypeface(AndroidUtilities.bold());
        f4Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        f4Var.setGravity(i11 | 48);
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
        addView(f4Var, w7.a6.d(-1, 20.0f, i16, f11, 12.0f, f12, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f21515c = l5Var;
        l5Var.setTextSize(13);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18161q5, f6Var));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        l5Var.setGravity(i13 | 48);
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
        addView(l5Var, w7.a6.d(-1, 20.0f, i17, f13, 36.0f, f14, 0.0f));
        tp tpVar = new tp(context, 21, f6Var);
        this.d = tpVar;
        tpVar.b(-1, org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.f18056k7);
        tpVar.setDrawUnchecked(false);
        tpVar.setDrawBackgroundAsArc(3);
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
        addView(tpVar, w7.a6.d(24, 24.0f, i18, f15, 37.0f, f16, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, zj zjVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f21518r = null;
            this.f21517n = null;
            this.f21514b.l("", false);
            this.f21515c.l("", false);
            this.f21513a.setImageDrawable(null);
        } else {
            this.f21518r = null;
            this.f21517n = charSequence;
            this.f21516f = user;
            this.f21522y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new ee(9, this, zjVar));
    }

    public final void b() {
        TLRPC.User user = this.f21516f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        g9 g9Var = this.e;
        if (user != null) {
            g9Var.m(this.f21521x, user);
            TLRPC.UserStatus userStatus = this.f21516f.status;
        } else {
            CharSequence charSequence = this.f21517n;
            if (charSequence != null) {
                g9Var.n(this.h, charSequence.toString(), null);
            } else {
                g9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f21517n;
        org.telegram.ui.Cells.f4 f4Var = this.f21514b;
        if (charSequence2 != null) {
            this.f21520w = null;
            f4Var.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f21516f;
            if (user2 != null) {
                this.f21520w = UserObject.getUserName(user2);
            } else {
                this.f21520w = "";
            }
            f4Var.l(this.f21520w, false);
        }
        setStatus(this.f21518r);
        TLRPC.User user3 = this.f21516f;
        w9 w9Var = this.f21513a;
        if (user3 != null) {
            w9Var.e(user3, g9Var);
        } else {
            w9Var.setImageDrawable(g9Var);
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
        if (this.f21522y) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f21522y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f21518r = charSequence;
        if (charSequence != null) {
            this.f21515c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f21516f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f21515c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f21519s != this.f21516f && (str = this.v) != null) {
                this.f21515c.l(str, false);
            } else {
                this.f21515c.l("", false);
                Utilities.globalQueue.postRunnable(new yj(this, 0));
            }
        }
    }
}
