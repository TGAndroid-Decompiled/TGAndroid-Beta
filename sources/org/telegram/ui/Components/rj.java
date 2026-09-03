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
public final class rj extends FrameLayout {
    public final p9 f30781a;
    public final jg.c f30782b;
    public final org.telegram.ui.ActionBar.l5 f30783c;
    public final np d;
    public final z8 f30784e;
    public TLRPC.User f30785f;
    public int h;
    public CharSequence f30786n;
    public CharSequence f30787r;
    public TLRPC.User f30788s;
    public String v;
    public String f30789w;
    public final int f30790x;
    public boolean f30791y;

    public rj(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.f30790x = UserConfig.selectedAccount;
        this.f30784e = new z8(g6Var);
        p9 p9Var = new p9(context);
        this.f30781a = p9Var;
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
        addView(p9Var, k7.c6.d(46, 46.0f, i15, f10, 9.0f, f11, 0.0f));
        jg.c cVar = new jg.c(context, 5);
        this.f30782b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21768j5, g6Var));
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
        addView(cVar, k7.c6.d(-1, 20.0f, i16, f12, 12.0f, f13, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f30783c = l5Var;
        l5Var.setTextSize(13);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21895q5, g6Var));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        l5Var.setGravity(i13 | 48);
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
        addView(l5Var, k7.c6.d(-1, 20.0f, i17, f14, 36.0f, f15, 0.0f));
        np npVar = new np(context, 21, g6Var);
        this.d = npVar;
        npVar.b(-1, org.telegram.ui.ActionBar.k6.f21661d6, org.telegram.ui.ActionBar.k6.f21788k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(3);
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
        addView(npVar, k7.c6.d(24, 24.0f, i18, f16, 37.0f, f17, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, qj qjVar, boolean z4) {
        if (user == null && charSequence == null) {
            this.f30787r = null;
            this.f30786n = null;
            this.f30782b.l("", false);
            this.f30783c.l("", false);
            this.f30781a.setImageDrawable(null);
        } else {
            this.f30787r = null;
            this.f30786n = charSequence;
            this.f30785f = user;
            this.f30791y = z4;
            setWillNotDraw(!z4);
            b();
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.mp(22, this, qjVar));
    }

    public final void b() {
        TLRPC.User user = this.f30785f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        z8 z8Var = this.f30784e;
        if (user != null) {
            z8Var.m(this.f30790x, user);
            TLRPC.UserStatus userStatus = this.f30785f.status;
        } else {
            CharSequence charSequence = this.f30786n;
            if (charSequence != null) {
                z8Var.n(this.h, charSequence.toString(), null);
            } else {
                z8Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f30786n;
        jg.c cVar = this.f30782b;
        if (charSequence2 != null) {
            this.f30789w = null;
            cVar.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f30785f;
            if (user2 != null) {
                this.f30789w = UserObject.getUserName(user2);
            } else {
                this.f30789w = "";
            }
            cVar.l(this.f30789w, false);
        }
        setStatus(this.f30787r);
        TLRPC.User user3 = this.f30785f;
        p9 p9Var = this.f30781a;
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
        if (this.f30791y) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f30791y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f30787r = charSequence;
        if (charSequence != null) {
            this.f30783c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f30785f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f30783c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f30788s != this.f30785f && (str = this.v) != null) {
                this.f30783c.l(str, false);
            } else {
                this.f30783c.l("", false);
                Utilities.globalQueue.postRunnable(new pj(this, 0));
            }
        }
    }
}
