package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ej extends FrameLayout {
    public final l9 f33416a;
    public final di.e4 f33417b;
    public final org.telegram.ui.ActionBar.l5 f33418c;
    public final wo d;
    public final w8 f33419e;
    public TLRPC.User f33420f;
    public int h;
    public CharSequence f33421n;
    public CharSequence f33422r;
    public TLRPC.User f33423s;
    public String f33424w;
    public String f33425x;
    public boolean f33426y;

    public ej(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.f33419e = new w8(g6Var);
        l9 l9Var = new l9(context);
        this.f33416a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z9 = org.telegram.messenger.id.f23157a0;
        if (z9) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i14 = i7 | 48;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 14.0f;
        }
        if (z9) {
            f11 = 14.0f;
        } else {
            f11 = 0.0f;
        }
        addView(l9Var, c8.ha.d(46, 46.0f, i14, f10, 9.0f, f11, 0.0f));
        di.e4 e4Var = new di.e4(context, 4);
        this.f33417b = e4Var;
        org.telegram.messenger.qs.i(e4Var);
        org.telegram.ui.ActionBar.s6.X(e4Var, org.telegram.ui.ActionBar.l6.f27973j5, g6Var);
        e4Var.setTypeface(org.telegram.messenger.g0.o());
        e4Var.setTextSize(16);
        if (org.telegram.messenger.id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e4Var.setGravity(i10 | 48);
        boolean z10 = org.telegram.messenger.id.f23157a0;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i15 = i11 | 48;
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
        addView(e4Var, c8.ha.d(-1, 20.0f, i15, f12, 12.0f, f13, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f33418c = l5Var;
        l5Var.setTextSize(13);
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.f28104q5, g6Var);
        if (org.telegram.messenger.id.f23157a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        l5Var.setGravity(i12 | 48);
        boolean z11 = org.telegram.messenger.id.f23157a0;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
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
        addView(l5Var, c8.ha.d(-1, 20.0f, i16, f14, 36.0f, f15, 0.0f));
        wo woVar = new wo(21, context, g6Var);
        this.d = woVar;
        woVar.b(-1, org.telegram.ui.ActionBar.l6.f27865d6, org.telegram.ui.ActionBar.l6.f27995k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        boolean z12 = org.telegram.messenger.id.f23157a0;
        int i17 = (z12 ? 5 : 3) | 48;
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
        addView(woVar, c8.ha.d(24, 24.0f, i17, f16, 37.0f, f17, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, dj djVar, boolean z9) {
        l9 l9Var = this.f33416a;
        di.e4 e4Var = this.f33417b;
        if (user == null && charSequence == null) {
            this.f33422r = null;
            this.f33421n = null;
            e4Var.l("", false);
            this.f33418c.l("", false);
            l9Var.setImageDrawable(null);
        } else {
            this.f33422r = null;
            this.f33421n = charSequence;
            this.f33420f = user;
            this.f33426y = z9;
            setWillNotDraw(!z9);
            w8 w8Var = this.f33419e;
            TLRPC.User user2 = this.f33420f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                w8Var.r(user2);
                TLRPC.UserStatus userStatus = this.f33420f.status;
            } else {
                CharSequence charSequence2 = this.f33421n;
                if (charSequence2 != null) {
                    w8Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    w8Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.f33421n;
            if (charSequence3 != null) {
                this.f33425x = null;
                e4Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f33420f;
                if (user3 != null) {
                    this.f33425x = org.telegram.messenger.t10.p(user3);
                } else {
                    this.f33425x = "";
                }
                e4Var.l(this.f33425x, false);
            }
            setStatus(this.f33422r);
            TLRPC.User user4 = this.f33420f;
            if (user4 != null) {
                l9Var.e(user4, w8Var);
            } else {
                l9Var.setImageDrawable(w8Var);
            }
        }
        Utilities.f21336e.c(new f(17, this, djVar));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f33426y) {
            if (org.telegram.messenger.id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f33426y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i7) {
        this.h = i7;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f33422r = charSequence;
        if (charSequence != null) {
            this.f33418c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f33420f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f33418c.l(org.telegram.messenger.id.M0(2131747832, null), false);
            } else if (this.f33423s != this.f33420f && (str = this.f33424w) != null) {
                this.f33418c.l(str, false);
            } else {
                this.f33418c.l("", false);
                Utilities.f21336e.c(new cj(this, 0));
            }
        }
    }
}
