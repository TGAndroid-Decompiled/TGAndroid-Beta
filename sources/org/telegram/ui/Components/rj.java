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
    public final t9 f32317a;
    public final gg.c f32318b;
    public final org.telegram.ui.ActionBar.h5 f32319c;
    public final hp d;
    public final e9 f32320e;
    public TLRPC.User f32321f;
    public int h;
    public CharSequence f32322n;
    public CharSequence f32323r;
    public TLRPC.User f32324s;
    public String v;
    public String f32325w;
    public final int f32326x;
    public boolean f32327y;

    public rj(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        float f9;
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
        this.f32326x = UserConfig.selectedAccount;
        this.f32320e = new e9(c6Var);
        t9 t9Var = new t9(context);
        this.f32317a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i15 = i10 | 48;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 14.0f;
        }
        if (z10) {
            f10 = 14.0f;
        } else {
            f10 = 0.0f;
        }
        addView(t9Var, i7.f6.d(46, 46.0f, i15, f9, 9.0f, f10, 0.0f));
        gg.c cVar = new gg.c(context, 5);
        this.f32318b = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setTextSize(16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        cVar.setGravity(i11 | 48);
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
        addView(cVar, i7.f6.d(-1, 20.0f, i16, f11, 12.0f, f12, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f32319c = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23294q5, c6Var));
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
        addView(h5Var, i7.f6.d(-1, 20.0f, i17, f13, 36.0f, f14, 0.0f));
        hp hpVar = new hp(context, 21, c6Var);
        this.d = hpVar;
        hpVar.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(3);
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
        addView(hpVar, i7.f6.d(24, 24.0f, i18, f15, 37.0f, f16, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, qj qjVar, boolean z10) {
        if (user == null && charSequence == null) {
            this.f32323r = null;
            this.f32322n = null;
            this.f32318b.l("", false);
            this.f32319c.l("", false);
            this.f32317a.setImageDrawable(null);
        } else {
            this.f32323r = null;
            this.f32322n = charSequence;
            this.f32321f = user;
            this.f32327y = z10;
            setWillNotDraw(!z10);
            b();
        }
        Utilities.globalQueue.postRunnable(new z2(15, this, qjVar));
    }

    public final void b() {
        TLRPC.User user = this.f32321f;
        if (user != null) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        }
        e9 e9Var = this.f32320e;
        if (user != null) {
            e9Var.m(this.f32326x, user);
            TLRPC.UserStatus userStatus = this.f32321f.status;
        } else {
            CharSequence charSequence = this.f32322n;
            if (charSequence != null) {
                e9Var.n(this.h, charSequence.toString(), null);
            } else {
                e9Var.n(this.h, "#", null);
            }
        }
        CharSequence charSequence2 = this.f32322n;
        gg.c cVar = this.f32318b;
        if (charSequence2 != null) {
            this.f32325w = null;
            cVar.l(charSequence2, false);
        } else {
            TLRPC.User user2 = this.f32321f;
            if (user2 != null) {
                this.f32325w = UserObject.getUserName(user2);
            } else {
                this.f32325w = "";
            }
            cVar.l(this.f32325w, false);
        }
        setStatus(this.f32323r);
        TLRPC.User user3 = this.f32321f;
        t9 t9Var = this.f32317a;
        if (user3 != null) {
            t9Var.e(user3, e9Var);
        } else {
            t9Var.setImageDrawable(e9Var);
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
        if (this.f32327y) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f32327y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f32323r = charSequence;
        if (charSequence != null) {
            this.f32319c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f32321f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f32319c.l(LocaleController.getString(R.string.NumberUnknown), false);
            } else if (this.f32324s != this.f32321f && (str = this.v) != null) {
                this.f32319c.l(str, false);
            } else {
                this.f32319c.l("", false);
                Utilities.globalQueue.postRunnable(new pj(this, 0));
            }
        }
    }
}
