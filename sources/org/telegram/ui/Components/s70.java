package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public abstract class s70 extends LinearLayout {
    public final org.telegram.ui.Cells.o4 f39518a;
    public final org.telegram.ui.Cells.r8 f39519b;
    public final org.telegram.ui.Cells.r8 f39520c;
    public final org.telegram.ui.Cells.z8 d;
    public final org.telegram.ui.Cells.z8 f39521e;
    public boolean f39522f;
    public boolean h;
    public TLRPC.Chat f39523n;
    public ValueAnimator f39524r;
    public float f39525s;
    public final int f39526w;

    public s70(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f39526w = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f39523n = chat;
        this.f39522f = chat.join_to_send;
        this.h = chat.join_request;
        setOrientation(1);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 20);
        this.f39518a = o4Var;
        o4Var.setText(org.telegram.messenger.gd.N0(2131752288, null));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, o4Var, null);
        addView(o4Var);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, 20);
        this.f39519b = r8Var;
        String N0 = org.telegram.messenger.gd.N0(2131752287, null);
        boolean z12 = this.f39522f;
        r8Var.f(N0, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        r8Var.setEnabled(z10);
        r8Var.setOnClickListener(new View.OnClickListener(this) {
            public final s70 f38414b;

            {
                this.f38414b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s70 s70Var = this.f38414b;
                        boolean z13 = s70Var.f39522f;
                        boolean z14 = !z13;
                        if (s70Var.b(z14, new r70(s70Var, s70Var.h, z13, 0))) {
                            s70Var.setJoinRequest(false);
                            s70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        s70 s70Var2 = this.f38414b;
                        boolean z15 = s70Var2.h;
                        boolean z16 = !z15;
                        if (s70Var2.a(z16, new q70(s70Var2, z15, 0))) {
                            s70Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(r8Var);
        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context, 20);
        this.f39520c = r8Var2;
        r8Var2.f(org.telegram.messenger.gd.N0(2131752292, null), this.h, false);
        r8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        } else {
            z11 = true;
        }
        r8Var2.setEnabled(z11);
        r8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final s70 f38414b;

            {
                this.f38414b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s70 s70Var = this.f38414b;
                        boolean z13 = s70Var.f39522f;
                        boolean z14 = !z13;
                        if (s70Var.b(z14, new r70(s70Var, s70Var.h, z13, 0))) {
                            s70Var.setJoinRequest(false);
                            s70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        s70 s70Var2 = this.f38414b;
                        boolean z15 = s70Var2.h;
                        boolean z16 = !z15;
                        if (s70Var2.a(z16, new q70(s70Var2, z15, 0))) {
                            s70Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(r8Var2);
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, null);
        this.d = z8Var;
        z8Var.setText(org.telegram.messenger.gd.N0(2131752286, null));
        addView(z8Var);
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, null);
        this.f39521e = z8Var2;
        z8Var2.setText(org.telegram.messenger.gd.N0(2131752291, null));
        addView(z8Var2);
        boolean z13 = this.f39522f;
        this.f39525s = z13 ? 1.0f : 0.0f;
        r8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f39525s);
    }

    public abstract boolean a(boolean z10, q70 q70Var);

    public boolean b(boolean z10, r70 r70Var) {
        return true;
    }

    public final void c(boolean z10) {
        int i7;
        int i10 = 8;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f39518a.setVisibility(i7);
        if (z10) {
            i10 = 0;
        }
        this.f39519b.setVisibility(i10);
        if (!z10) {
            this.f39522f = true;
            this.f39520c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        int measuredHeight;
        this.f39525s = f10;
        org.telegram.ui.Cells.r8 r8Var = this.f39520c;
        r8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        r8Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        r8Var.setScaleY(1.0f - (0.1f * f11));
        if (r8Var.getMeasuredHeight() <= 0) {
            measuredHeight = org.telegram.messenger.g0.L(50.0f);
        } else {
            measuredHeight = r8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.z8 z8Var = this.d;
        z8Var.setAlpha(f11);
        float f12 = (-measuredHeight) * f11;
        z8Var.setTranslationY(((-org.telegram.messenger.g0.L(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.z8 z8Var2 = this.f39521e;
        z8Var2.setAlpha(f10);
        z8Var2.setTranslationY((org.telegram.messenger.g0.L(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.z8 z8Var = this.d;
        float alpha = z8Var.getAlpha() * z8Var.getHeight();
        org.telegram.ui.Cells.z8 z8Var2 = this.f39521e;
        return (z8Var2.getAlpha() * z8Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        org.telegram.ui.Cells.r8 r8Var = this.f39519b;
        if (r8Var.getVisibility() == 0) {
            int i14 = i11 - i7;
            org.telegram.ui.Cells.o4 o4Var = this.f39518a;
            int measuredHeight = o4Var.getMeasuredHeight();
            o4Var.layout(0, 0, i14, measuredHeight);
            i13 = r8Var.getMeasuredHeight() + measuredHeight;
            r8Var.layout(0, measuredHeight, i14, i13);
        } else {
            i13 = 0;
        }
        int i15 = i11 - i7;
        org.telegram.ui.Cells.r8 r8Var2 = this.f39520c;
        int measuredHeight2 = r8Var2.getMeasuredHeight() + i13;
        r8Var2.layout(0, i13, i15, measuredHeight2);
        org.telegram.ui.Cells.z8 z8Var = this.d;
        z8Var.layout(0, measuredHeight2, i15, z8Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.z8 z8Var2 = this.f39521e;
        z8Var2.layout(0, measuredHeight2, i15, z8Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Cells.z8 z8Var;
        org.telegram.ui.Cells.z8 z8Var2;
        float measuredHeight;
        org.telegram.ui.Cells.o4 o4Var = this.f39518a;
        int i11 = this.f39526w;
        o4Var.measure(i7, i11);
        org.telegram.ui.Cells.r8 r8Var = this.f39519b;
        r8Var.measure(i7, i11);
        org.telegram.ui.Cells.r8 r8Var2 = this.f39520c;
        r8Var2.measure(i7, i11);
        this.d.measure(i7, i11);
        this.f39521e.measure(i7, i11);
        if (r8Var.getVisibility() == 0) {
            measuredHeight = (r8Var2.getMeasuredHeight() * this.f39525s) + r8Var.getMeasuredHeight() + o4Var.getMeasuredHeight();
        } else {
            measuredHeight = r8Var2.getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + org.telegram.messenger.g0.W1(this.f39525s, z8Var.getMeasuredHeight(), z8Var2.getMeasuredHeight())), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f39523n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f39519b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f39523n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f39520c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f39520c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f10;
        this.f39522f = z10;
        org.telegram.ui.Cells.r8 r8Var = this.f39519b;
        r8Var.setChecked(z10);
        r8Var.setDivider(this.f39522f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.r8 r8Var2 = this.f39520c;
        r8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f39524r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f39525s;
        if (this.f39522f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f39524r = ofFloat;
        ofFloat.setDuration(200L);
        this.f39524r.setInterpolator(kr.f36858f);
        this.f39524r.addUpdateListener(new e60(this, 3));
        this.f39524r.addListener(new p60(this, 2));
        r8Var2.setVisibility(0);
        this.f39524r.start();
    }
}
