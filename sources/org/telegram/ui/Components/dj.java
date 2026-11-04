package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dj extends FrameLayout {
    public final k9 f33110a;
    public final ei.e4 f33111b;
    public final org.telegram.ui.ActionBar.k5 f33112c;
    public final wo d;
    public final u8 f33113e;
    public TLRPC.User f33114f;
    public int h;
    public CharSequence f33115n;
    public CharSequence f33116r;
    public TLRPC.User f33117s;
    public String f33118w;
    public String f33119x;
    public boolean f33120y;

    public dj(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
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
        this.f33113e = new u8(e6Var);
        k9 k9Var = new k9(context);
        this.f33110a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        if (z10) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i14 = i3 | 48;
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
        addView(k9Var, b8.mf.d(46, 46.0f, i14, f10, 9.0f, f11, 0.0f));
        ei.e4 e4Var = new ei.e4(context, 4);
        this.f33111b = e4Var;
        org.telegram.messenger.hs.i(e4Var);
        org.telegram.ui.ActionBar.r6.Y(e4Var, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        e4Var.setTypeface(org.telegram.messenger.g0.o());
        e4Var.setTextSize(16);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e4Var.setGravity(i10 | 48);
        boolean z11 = org.telegram.messenger.bd.f21784a0;
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
        addView(e4Var, b8.mf.d(-1, 20.0f, i15, f12, 12.0f, f13, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f33112c = k5Var;
        k5Var.setTextSize(13);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f28120q5, e6Var);
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        k5Var.setGravity(i12 | 48);
        boolean z12 = org.telegram.messenger.bd.f21784a0;
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
        addView(k5Var, b8.mf.d(-1, 20.0f, i16, f14, 36.0f, f15, 0.0f));
        wo woVar = new wo(21, context, e6Var);
        this.d = woVar;
        woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        boolean z13 = org.telegram.messenger.bd.f21784a0;
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
        addView(woVar, b8.mf.d(24, 24.0f, i17, f16, 37.0f, f17, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, cj cjVar, boolean z10) {
        k9 k9Var = this.f33110a;
        ei.e4 e4Var = this.f33111b;
        if (user == null && charSequence == null) {
            this.f33116r = null;
            this.f33115n = null;
            e4Var.l("", false);
            this.f33112c.l("", false);
            k9Var.setImageDrawable(null);
        } else {
            this.f33116r = null;
            this.f33115n = charSequence;
            this.f33114f = user;
            this.f33120y = z10;
            setWillNotDraw(!z10);
            u8 u8Var = this.f33113e;
            TLRPC.User user2 = this.f33114f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                u8Var.r(user2);
                TLRPC.UserStatus userStatus = this.f33114f.status;
            } else {
                CharSequence charSequence2 = this.f33115n;
                if (charSequence2 != null) {
                    u8Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    u8Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.f33115n;
            if (charSequence3 != null) {
                this.f33119x = null;
                e4Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f33114f;
                if (user3 != null) {
                    this.f33119x = org.telegram.messenger.l10.p(user3);
                } else {
                    this.f33119x = "";
                }
                e4Var.l(this.f33119x, false);
            }
            setStatus(this.f33116r);
            TLRPC.User user4 = this.f33114f;
            if (user4 != null) {
                k9Var.e(user4, u8Var);
            } else {
                k9Var.setImageDrawable(u8Var);
            }
        }
        Utilities.f21387e.c(new org.telegram.ui.lo(22, this, cjVar));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.f33120y) {
            if (org.telegram.messenger.bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(70.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f33120y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i3) {
        this.h = i3;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f33116r = charSequence;
        if (charSequence != null) {
            this.f33112c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f33114f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f33112c.l(org.telegram.messenger.bd.M0(2131747840, null), false);
            } else if (this.f33117s != this.f33114f && (str = this.f33118w) != null) {
                this.f33112c.l(str, false);
            } else {
                this.f33112c.l("", false);
                Utilities.f21387e.c(new bj(this, 0));
            }
        }
    }
}
