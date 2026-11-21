package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uj extends FrameLayout {
    public final q9 f40463a;
    public final fi.u3 f40464b;
    public final org.telegram.ui.ActionBar.m5 f40465c;
    public final op d;
    public final b9 f40466e;
    public TLRPC.User f40467f;
    public int h;
    public CharSequence f40468n;
    public CharSequence f40469r;
    public TLRPC.User f40470s;
    public String f40471w;
    public String f40472x;
    public boolean f40473y;

    public uj(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
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
        this.f40466e = new b9(h6Var);
        q9 q9Var = new q9(context);
        this.f40463a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z10 = org.telegram.messenger.gd.f24241a0;
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
        this.f40464b = u3Var;
        org.telegram.messenger.ks.i(u3Var);
        org.telegram.ui.ActionBar.t6.X(u3Var, org.telegram.ui.ActionBar.m6.f29486j5, h6Var);
        u3Var.setTypeface(org.telegram.messenger.g0.o());
        u3Var.setTextSize(16);
        if (org.telegram.messenger.gd.f24241a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u3Var.setGravity(i10 | 48);
        boolean z11 = org.telegram.messenger.gd.f24241a0;
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
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f40465c = m5Var;
        m5Var.setTextSize(13);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f29617q5, h6Var);
        if (org.telegram.messenger.gd.f24241a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        m5Var.setGravity(i12 | 48);
        boolean z12 = org.telegram.messenger.gd.f24241a0;
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
        addView(m5Var, c8.ma.d(-1, 20.0f, i16, f14, 36.0f, f15, 0.0f));
        op opVar = new op(21, context, h6Var);
        this.d = opVar;
        opVar.b(-1, org.telegram.ui.ActionBar.m6.f29378d6, org.telegram.ui.ActionBar.m6.f29508k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(3);
        boolean z13 = org.telegram.messenger.gd.f24241a0;
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
        addView(opVar, c8.ma.d(24, 24.0f, i17, f16, 37.0f, f17, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, tj tjVar, boolean z10) {
        q9 q9Var = this.f40463a;
        fi.u3 u3Var = this.f40464b;
        if (user == null && charSequence == null) {
            this.f40469r = null;
            this.f40468n = null;
            u3Var.l("", false);
            this.f40465c.l("", false);
            q9Var.setImageDrawable(null);
        } else {
            this.f40469r = null;
            this.f40468n = charSequence;
            this.f40467f = user;
            this.f40473y = z10;
            setWillNotDraw(!z10);
            b9 b9Var = this.f40466e;
            TLRPC.User user2 = this.f40467f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                b9Var.r(user2);
                TLRPC.UserStatus userStatus = this.f40467f.status;
            } else {
                CharSequence charSequence2 = this.f40468n;
                if (charSequence2 != null) {
                    b9Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    b9Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.f40468n;
            if (charSequence3 != null) {
                this.f40472x = null;
                u3Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f40467f;
                if (user3 != null) {
                    this.f40472x = org.telegram.messenger.o10.q(user3);
                } else {
                    this.f40472x = "";
                }
                u3Var.l(this.f40472x, false);
            }
            setStatus(this.f40469r);
            TLRPC.User user4 = this.f40467f;
            if (user4 != null) {
                q9Var.f(user4, b9Var);
            } else {
                q9Var.setImageDrawable(b9Var);
            }
        }
        Utilities.f22807e.c(new mf(9, this, tjVar));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f40473y) {
            if (org.telegram.messenger.gd.f24241a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.gd.f24241a0) {
                i7 = org.telegram.messenger.g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29501k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f40473y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i7) {
        this.h = i7;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f40469r = charSequence;
        if (charSequence != null) {
            this.f40465c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f40467f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f40465c.l(org.telegram.messenger.gd.N0(2131747638, null), false);
            } else if (this.f40470s != this.f40467f && (str = this.f40471w) != null) {
                this.f40465c.l(str, false);
            } else {
                this.f40465c.l("", false);
                Utilities.f22807e.c(new sj(this, 0));
            }
        }
    }
}
