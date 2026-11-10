package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dj extends FrameLayout {
    public final k9 f33001a;
    public final di.e4 f33002b;
    public final org.telegram.ui.ActionBar.m5 f33003c;
    public final wo d;
    public final v8 f33004e;
    public TLRPC.User f33005f;
    public int h;
    public CharSequence f33006n;
    public CharSequence f33007r;
    public TLRPC.User f33008s;
    public String f33009w;
    public String f33010x;
    public boolean f33011y;

    public dj(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
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
        this.f33004e = new v8(h6Var);
        k9 k9Var = new k9(context);
        this.f33001a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z9 = org.telegram.messenger.id.f23161a0;
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
        addView(k9Var, c8.ha.d(46, 46.0f, i14, f10, 9.0f, f11, 0.0f));
        di.e4 e4Var = new di.e4(context, 4);
        this.f33002b = e4Var;
        org.telegram.messenger.qs.i(e4Var);
        org.telegram.ui.ActionBar.t6.X(e4Var, org.telegram.ui.ActionBar.m6.f27998j5, h6Var);
        e4Var.setTypeface(org.telegram.messenger.g0.o());
        e4Var.setTextSize(16);
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e4Var.setGravity(i10 | 48);
        boolean z10 = org.telegram.messenger.id.f23161a0;
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
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f33003c = m5Var;
        m5Var.setTextSize(13);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f28129q5, h6Var);
        if (org.telegram.messenger.id.f23161a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        m5Var.setGravity(i12 | 48);
        boolean z11 = org.telegram.messenger.id.f23161a0;
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
        addView(m5Var, c8.ha.d(-1, 20.0f, i16, f14, 36.0f, f15, 0.0f));
        wo woVar = new wo(21, context, h6Var);
        this.d = woVar;
        woVar.b(-1, org.telegram.ui.ActionBar.m6.f27890d6, org.telegram.ui.ActionBar.m6.f28020k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        boolean z12 = org.telegram.messenger.id.f23161a0;
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

    public final void a(TLRPC.User user, CharSequence charSequence, cj cjVar, boolean z9) {
        k9 k9Var = this.f33001a;
        di.e4 e4Var = this.f33002b;
        if (user == null && charSequence == null) {
            this.f33007r = null;
            this.f33006n = null;
            e4Var.l("", false);
            this.f33003c.l("", false);
            k9Var.setImageDrawable(null);
        } else {
            this.f33007r = null;
            this.f33006n = charSequence;
            this.f33005f = user;
            this.f33011y = z9;
            setWillNotDraw(!z9);
            v8 v8Var = this.f33004e;
            TLRPC.User user2 = this.f33005f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                v8Var.r(user2);
                TLRPC.UserStatus userStatus = this.f33005f.status;
            } else {
                CharSequence charSequence2 = this.f33006n;
                if (charSequence2 != null) {
                    v8Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    v8Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.f33006n;
            if (charSequence3 != null) {
                this.f33010x = null;
                e4Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f33005f;
                if (user3 != null) {
                    this.f33010x = org.telegram.messenger.t10.p(user3);
                } else {
                    this.f33010x = "";
                }
                e4Var.l(this.f33010x, false);
            }
            setStatus(this.f33007r);
            TLRPC.User user4 = this.f33005f;
            if (user4 != null) {
                k9Var.e(user4, v8Var);
            } else {
                k9Var.setImageDrawable(v8Var);
            }
        }
        Utilities.f21341e.c(new org.telegram.ui.fq(18, this, cjVar));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f33011y) {
            if (org.telegram.messenger.id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f33011y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i7) {
        this.h = i7;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f33007r = charSequence;
        if (charSequence != null) {
            this.f33003c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f33005f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f33003c.l(org.telegram.messenger.id.M0(2131747832, null), false);
            } else if (this.f33008s != this.f33005f && (str = this.f33009w) != null) {
                this.f33003c.l(str, false);
            } else {
                this.f33003c.l("", false);
                Utilities.f21341e.c(new bj(this, 0));
            }
        }
    }
}
