package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class tj extends FrameLayout {
    public final p9 f40044a;
    public final fi.u3 f40045b;
    public final org.telegram.ui.ActionBar.n5 f40046c;
    public final lp d;
    public final a9 f40047e;
    public TLRPC.User f40048f;
    public int h;
    public CharSequence f40049n;
    public CharSequence f40050r;
    public TLRPC.User f40051s;
    public String f40052w;
    public String f40053x;
    public boolean f40054y;

    public tj(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
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
        this.f40047e = new a9(i6Var);
        p9 p9Var = new p9(context);
        this.f40044a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        boolean z10 = org.telegram.messenger.gd.f24314a0;
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
        addView(p9Var, c8.na.d(46, 46.0f, i14, f10, 9.0f, f11, 0.0f));
        fi.u3 u3Var = new fi.u3(context, 4);
        this.f40045b = u3Var;
        org.telegram.messenger.ks.i(u3Var);
        org.telegram.ui.ActionBar.u6.X(u3Var, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        u3Var.setTypeface(org.telegram.messenger.g0.o());
        u3Var.setTextSize(16);
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u3Var.setGravity(i10 | 48);
        boolean z11 = org.telegram.messenger.gd.f24314a0;
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
        addView(u3Var, c8.na.d(-1, 20.0f, i15, f12, 12.0f, f13, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f40046c = n5Var;
        n5Var.setTextSize(13);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29690q5, i6Var);
        if (org.telegram.messenger.gd.f24314a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        n5Var.setGravity(i12 | 48);
        boolean z12 = org.telegram.messenger.gd.f24314a0;
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
        addView(n5Var, c8.na.d(-1, 20.0f, i16, f14, 36.0f, f15, 0.0f));
        lp lpVar = new lp(21, context, i6Var);
        this.d = lpVar;
        lpVar.b(-1, org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.f29581k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(3);
        boolean z13 = org.telegram.messenger.gd.f24314a0;
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
        addView(lpVar, c8.na.d(24, 24.0f, i17, f16, 37.0f, f17, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, sj sjVar, boolean z10) {
        p9 p9Var = this.f40044a;
        fi.u3 u3Var = this.f40045b;
        if (user == null && charSequence == null) {
            this.f40050r = null;
            this.f40049n = null;
            u3Var.l("", false);
            this.f40046c.l("", false);
            p9Var.setImageDrawable(null);
        } else {
            this.f40050r = null;
            this.f40049n = charSequence;
            this.f40048f = user;
            this.f40054y = z10;
            setWillNotDraw(!z10);
            a9 a9Var = this.f40047e;
            TLRPC.User user2 = this.f40048f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                a9Var.r(user2);
                TLRPC.UserStatus userStatus = this.f40048f.status;
            } else {
                CharSequence charSequence2 = this.f40049n;
                if (charSequence2 != null) {
                    a9Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    a9Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.f40049n;
            if (charSequence3 != null) {
                this.f40053x = null;
                u3Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f40048f;
                if (user3 != null) {
                    this.f40053x = org.telegram.messenger.n10.q(user3);
                } else {
                    this.f40053x = "";
                }
                u3Var.l(this.f40053x, false);
            }
            setStatus(this.f40050r);
            TLRPC.User user4 = this.f40048f;
            if (user4 != null) {
                p9Var.f(user4, a9Var);
            } else {
                p9Var.setImageDrawable(a9Var);
            }
        }
        Utilities.f22877e.c(new xd(11, this, sjVar));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.f40054y) {
            if (org.telegram.messenger.gd.f24314a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.gd.f24314a0) {
                i7 = org.telegram.messenger.g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.f40054y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i7) {
        this.h = i7;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f40050r = charSequence;
        if (charSequence != null) {
            this.f40046c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f40048f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f40046c.l(org.telegram.messenger.gd.N0(2131747638, null), false);
            } else if (this.f40051s != this.f40048f && (str = this.f40052w) != null) {
                this.f40046c.l(str, false);
            } else {
                this.f40046c.l("", false);
                Utilities.f22877e.c(new rj(this, 0));
            }
        }
    }
}
