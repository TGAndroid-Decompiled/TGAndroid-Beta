package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class sj extends FrameLayout {
    public final q9 f39747a;
    public final fi.u3 f39748b;
    public final org.telegram.ui.ActionBar.n5 f39749c;
    public final mp d;
    public final b9 f39750e;
    public TLRPC.User f39751f;
    public int h;
    public CharSequence f39752n;
    public CharSequence f39753r;
    public TLRPC.User f39754s;
    public String f39755w;
    public String f39756x;
    public boolean f39757y;

    public sj(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13;
        float f14;
        float f15;
        float f16;
        float f17;
        this.f39750e = new b9(i6Var);
        q9 q9Var = new q9(context);
        this.f39747a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z10 = org.telegram.messenger.gd.f24216a0;
        if (z10) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i14 = i7 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 14.0f;
        }
        if (z10) {
            f11 = 14.0f;
        } else {
            f11 = 0.0f;
        }
        addView(q9Var, c8.ma.d(46, 46.0f, i14, f10, 9.0f, f11, 0.0f));
        fi.u3 u3Var = new fi.u3(context, 4);
        this.f39748b = u3Var;
        org.telegram.messenger.ks.i(u3Var);
        org.telegram.ui.ActionBar.u6.X(u3Var, org.telegram.ui.ActionBar.n6.f29504j5, i6Var);
        u3Var.setTypeface(org.telegram.messenger.g0.o());
        u3Var.setTextSize(16);
        if (org.telegram.messenger.gd.f24216a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u3Var.setGravity(i10 | 48);
        boolean z11 = org.telegram.messenger.gd.f24216a0;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
        if (z11) {
            f12 = 28.0f;
        } else {
            f12 = 72.0f;
        }
        if (z11) {
            f13 = 72.0f;
        } else {
            f13 = 28.0f;
        }
        addView(u3Var, c8.ma.d(-1, 20.0f, i15, f12, 12.0f, f13, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f39749c = n5Var;
        n5Var.setTextSize(13);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29635q5, i6Var);
        if (org.telegram.messenger.gd.f24216a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        n5Var.setGravity(i12 | 48);
        boolean z12 = org.telegram.messenger.gd.f24216a0;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
        if (z12) {
            f14 = 28.0f;
        } else {
            f14 = 72.0f;
        }
        if (z12) {
            f15 = 72.0f;
        } else {
            f15 = 28.0f;
        }
        addView(n5Var, c8.ma.d(-1, 20.0f, i16, f14, 36.0f, f15, 0.0f));
        mp mpVar = new mp(21, context, i6Var);
        this.d = mpVar;
        mpVar.b(-1, org.telegram.ui.ActionBar.n6.f29396d6, org.telegram.ui.ActionBar.n6.f29526k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(3);
        boolean z13 = org.telegram.messenger.gd.f24216a0;
        int i17 = (z13 ? 5 : 3) | 48;
        if (z13) {
            f16 = 0.0f;
        } else {
            f16 = 44.0f;
        }
        if (z13) {
            f17 = 44.0f;
        } else {
            f17 = 0.0f;
        }
        addView(mpVar, c8.ma.d(24, 24.0f, i17, f16, 37.0f, f17, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, rj rjVar, boolean z10) {
        q9 q9Var = this.f39747a;
        fi.u3 u3Var = this.f39748b;
        if (user == null && charSequence == null) {
            this.f39753r = null;
            this.f39752n = null;
            u3Var.l("", false);
            this.f39749c.l("", false);
            q9Var.setImageDrawable(null);
        } else {
            this.f39753r = null;
            this.f39752n = charSequence;
            this.f39751f = user;
            this.f39757y = z10;
            setWillNotDraw(!z10);
            b9 b9Var = this.f39750e;
            TLRPC.User user2 = this.f39751f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                b9Var.r(user2);
                TLRPC.UserStatus userStatus = this.f39751f.status;
            } else {
                CharSequence charSequence2 = this.f39752n;
                if (charSequence2 != null) {
                    b9Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    b9Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.f39752n;
            if (charSequence3 != null) {
                this.f39756x = null;
                u3Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f39751f;
                if (user3 != null) {
                    this.f39756x = org.telegram.messenger.o10.q(user3);
                } else {
                    this.f39756x = "";
                }
                u3Var.l(this.f39756x, false);
            }
            setStatus(this.f39753r);
            TLRPC.User user4 = this.f39751f;
            if (user4 != null) {
                q9Var.f(user4, b9Var);
            } else {
                q9Var.setImageDrawable(b9Var);
            }
        }
        Utilities.f22782e.c(new mg(7, this, rjVar));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f39757y) {
            if (org.telegram.messenger.gd.f24216a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.gd.f24216a0) {
                i7 = org.telegram.messenger.g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f39757y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i7) {
        this.h = i7;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f39753r = charSequence;
        if (charSequence != null) {
            this.f39749c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f39751f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f39749c.l(org.telegram.messenger.gd.M0(2131747639, null), false);
            } else if (this.f39754s != this.f39751f && (str = this.f39755w) != null) {
                this.f39749c.l(str, false);
            } else {
                this.f39749c.l("", false);
                Utilities.f22782e.c(new qj(this, 0));
            }
        }
    }
}
