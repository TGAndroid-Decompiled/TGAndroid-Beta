package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dj extends FrameLayout {
    public final g9 f25423a;
    public final og.c f25424b;
    public final org.telegram.ui.ActionBar.u5 f25425c;
    public final ep d;
    public final r8 e;
    public TLRPC.User f25426f;
    public int h;
    public CharSequence f25427n;
    public CharSequence f25428r;
    public TLRPC.User f25429s;
    public String f25430w;
    public String f25431x;
    public boolean f25432y;

    public dj(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
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
        this.e = new r8(p6Var);
        g9 g9Var = new g9(context);
        this.f25423a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        boolean z10 = org.telegram.messenger.cd.X;
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
        addView(g9Var, w7.b6.d(46, 46.0f, i15, f7, 9.0f, f10, 0.0f));
        og.c cVar = new og.c(context, 4);
        this.f25424b = cVar;
        org.telegram.messenger.zs.i(cVar);
        org.telegram.ui.ActionBar.a7.Y(cVar, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        cVar.setTypeface(org.telegram.messenger.i0.o());
        cVar.setTextSize(16);
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        cVar.setGravity(i11 | 48);
        boolean z11 = org.telegram.messenger.cd.X;
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
        addView(cVar, w7.b6.d(-1, 20.0f, i16, f11, 12.0f, f12, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f25425c = u5Var;
        u5Var.setTextSize(13);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f21169q5, p6Var);
        if (org.telegram.messenger.cd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        u5Var.setGravity(i13 | 48);
        boolean z12 = org.telegram.messenger.cd.X;
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
        addView(u5Var, w7.b6.d(-1, 20.0f, i17, f13, 36.0f, f14, 0.0f));
        ep epVar = new ep(21, context, p6Var);
        this.d = epVar;
        epVar.b(-1, org.telegram.ui.ActionBar.t6.f20929d6, org.telegram.ui.ActionBar.t6.f21059k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        boolean z13 = org.telegram.messenger.cd.X;
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
        addView(epVar, w7.b6.d(24, 24.0f, i18, f15, 37.0f, f16, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, cj cjVar, boolean z10) {
        g9 g9Var = this.f25423a;
        og.c cVar = this.f25424b;
        if (user == null && charSequence == null) {
            this.f25428r = null;
            this.f25427n = null;
            cVar.l("", false);
            this.f25425c.l("", false);
            g9Var.setImageDrawable(null);
        } else {
            this.f25428r = null;
            this.f25427n = charSequence;
            this.f25426f = user;
            this.f25432y = z10;
            setWillNotDraw(!z10);
            r8 r8Var = this.e;
            TLRPC.User user2 = this.f25426f;
            if (user2 != null) {
                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
            }
            if (user2 != null) {
                r8Var.r(user2);
                TLRPC.UserStatus userStatus = this.f25426f.status;
            } else {
                CharSequence charSequence2 = this.f25427n;
                if (charSequence2 != null) {
                    r8Var.k(this.h, charSequence2.toString(), null, null);
                } else {
                    r8Var.k(this.h, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.f25427n;
            if (charSequence3 != null) {
                this.f25431x = null;
                cVar.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f25426f;
                if (user3 != null) {
                    this.f25431x = org.telegram.messenger.h20.p(user3);
                } else {
                    this.f25431x = "";
                }
                cVar.l(this.f25431x, false);
            }
            setStatus(this.f25428r);
            TLRPC.User user4 = this.f25426f;
            if (user4 != null) {
                g9Var.e(user4, r8Var);
            } else {
                g9Var.setImageDrawable(r8Var);
            }
        }
        Utilities.e.c(new cd(11, this, cjVar));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.f25432y) {
            if (org.telegram.messenger.cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(70.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.cd.X) {
                i10 = org.telegram.messenger.i0.L(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.f25432y ? 1 : 0), 1073741824));
    }

    public void setCurrentId(int i10) {
        this.h = i10;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.f25428r = charSequence;
        if (charSequence != null) {
            this.f25425c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f25426f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.f25425c.l(org.telegram.messenger.cd.L0(2131747848, null), false);
            } else if (this.f25429s != this.f25426f && (str = this.f25430w) != null) {
                this.f25425c.l(str, false);
            } else {
                this.f25425c.l("", false);
                Utilities.e.c(new bj(this, 0));
            }
        }
    }
}
