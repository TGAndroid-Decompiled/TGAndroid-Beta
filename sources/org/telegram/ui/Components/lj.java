package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class lj extends FrameLayout {
    public final i9 f36815a;
    public final fi.w3 f36816b;
    public final org.telegram.ui.ActionBar.j5 f36817c;
    public final fp d;
    public final t8 f36818e;
    public TLRPC.User f36819f;
    public int h;
    public CharSequence f36820n;
    public CharSequence f36821r;
    public TLRPC.User f36822s;
    public String f36823w;
    public String f36824x;
    public boolean f36825y;

    public lj(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.f36818e = new t8(e6Var);
        i9 i9Var = new i9(context);
        this.f36815a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z10 = org.telegram.messenger.hd.f24101a0;
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
        addView(i9Var, c8.ja.d(46, 46.0f, i14, f10, 9.0f, f11, 0.0f));
        fi.w3 w3Var = new fi.w3(context, 4);
        this.f36816b = w3Var;
        org.telegram.messenger.ns.i(w3Var);
        org.telegram.ui.ActionBar.q6.X(w3Var, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        w3Var.setTextSize(16);
        if (org.telegram.messenger.hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        w3Var.setGravity(i10 | 48);
        boolean z11 = org.telegram.messenger.hd.f24101a0;
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
        addView(w3Var, c8.ja.d(-1, 20.0f, i15, f12, 12.0f, f13, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f36817c = j5Var;
        j5Var.setTextSize(13);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.f29088q5, e6Var);
        if (org.telegram.messenger.hd.f24101a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        j5Var.setGravity(i12 | 48);
        boolean z12 = org.telegram.messenger.hd.f24101a0;
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
        addView(j5Var, c8.ja.d(-1, 20.0f, i16, f14, 36.0f, f15, 0.0f));
        fp fpVar = new fp(21, context, e6Var);
        this.d = fpVar;
        fpVar.b(-1, org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(3);
        boolean z13 = org.telegram.messenger.hd.f24101a0;
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
        addView(fpVar, c8.ja.d(24, 24.0f, i17, f16, 37.0f, f17, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, kj kjVar, boolean z10) {
        i9 i9Var = this.f36815a;
        fi.w3 w3Var = this.f36816b;
        if (user == null && charSequence == null) {
            this.f36821r = null;
            this.f36820n = null;
            w3Var.l("", false);
            this.f36817c.l("", false);
            i9Var.setImageDrawable(null);
        } else {
            this.f36821r = null;
            this.f36820n = charSequence;
            this.f36819f = user;
            this.f36825y = z10;
            setWillNotDraw(!z10);
            t8 t8Var = this.f36818e;
            TLRPC.User user2 = this.f36819f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                t8Var.r(user2);
                TLRPC.UserStatus userStatus = this.f36819f.status;
            } else {
                CharSequence charSequence2 = this.f36820n;
                if (charSequence2 != null) {
                    t8Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    t8Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.f36820n;
            if (charSequence3 != null) {
                this.f36824x = null;
                w3Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f36819f;
                if (user3 != null) {
                    this.f36824x = org.telegram.messenger.q10.p(user3);
                } else {
                    this.f36824x = "";
                }
                w3Var.l(this.f36824x, false);
            }
            setStatus(this.f36821r);
            TLRPC.User user4 = this.f36819f;
            if (user4 != null) {
                i9Var.f(user4, t8Var);
            } else {
                i9Var.setImageDrawable(t8Var);
            }
        }
        Utilities.f22416e.c(new od(11, this, kjVar));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f36825y) {
            if (org.telegram.messenger.hd.f24101a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.hd.f24101a0) {
                i7 = org.telegram.messenger.g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f36825y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i7) {
        this.h = i7;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f36821r = charSequence;
        if (charSequence != null) {
            this.f36817c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f36819f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f36817c.l(org.telegram.messenger.hd.M0(2131747832, null), false);
            } else if (this.f36822s != this.f36819f && (str = this.f36823w) != null) {
                this.f36817c.l(str, false);
            } else {
                this.f36817c.l("", false);
                Utilities.f22416e.c(new jj(this, 0));
            }
        }
    }
}
