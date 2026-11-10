package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public abstract class f70 extends LinearLayout {
    public final org.telegram.ui.Cells.n4 f33485a;
    public final org.telegram.ui.Cells.r8 f33486b;
    public final org.telegram.ui.Cells.r8 f33487c;
    public final org.telegram.ui.Cells.z8 d;
    public final org.telegram.ui.Cells.z8 f33488e;
    public boolean f33489f;
    public boolean h;
    public TLRPC.Chat f33490n;
    public ValueAnimator f33491r;
    public float f33492s;
    public final int f33493w;

    public f70(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z9;
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f33493w = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f33490n = chat;
        this.f33489f = chat.join_to_send;
        this.h = chat.join_request;
        setOrientation(1);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 20);
        this.f33485a = n4Var;
        n4Var.setText(org.telegram.messenger.id.M0(2131752300, null));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, n4Var, null);
        addView(n4Var);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, 20);
        this.f33486b = r8Var;
        String M0 = org.telegram.messenger.id.M0(2131752299, null);
        boolean z11 = this.f33489f;
        r8Var.f(M0, z11, z11);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z9 = false;
        } else {
            z9 = true;
        }
        r8Var.setEnabled(z9);
        r8Var.setOnClickListener(new View.OnClickListener(this) {
            public final f70 f32486b;

            {
                this.f32486b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f70 f70Var = this.f32486b;
                        boolean z12 = f70Var.f33489f;
                        boolean z13 = !z12;
                        if (f70Var.b(z13, new e70(f70Var, f70Var.h, z12, 0))) {
                            f70Var.setJoinRequest(false);
                            f70Var.setJoinToSend(z13);
                            return;
                        }
                        return;
                    default:
                        f70 f70Var2 = this.f32486b;
                        boolean z14 = f70Var2.h;
                        boolean z15 = !z14;
                        if (f70Var2.a(z15, new d70(f70Var2, z14, 0))) {
                            f70Var2.setJoinRequest(z15);
                            return;
                        }
                        return;
                }
            }
        });
        addView(r8Var);
        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context, 20);
        this.f33487c = r8Var2;
        r8Var2.f(org.telegram.messenger.id.M0(2131752304, null), this.h, false);
        r8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        r8Var2.setEnabled(z10);
        r8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final f70 f32486b;

            {
                this.f32486b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        f70 f70Var = this.f32486b;
                        boolean z12 = f70Var.f33489f;
                        boolean z13 = !z12;
                        if (f70Var.b(z13, new e70(f70Var, f70Var.h, z12, 0))) {
                            f70Var.setJoinRequest(false);
                            f70Var.setJoinToSend(z13);
                            return;
                        }
                        return;
                    default:
                        f70 f70Var2 = this.f32486b;
                        boolean z14 = f70Var2.h;
                        boolean z15 = !z14;
                        if (f70Var2.a(z15, new d70(f70Var2, z14, 0))) {
                            f70Var2.setJoinRequest(z15);
                            return;
                        }
                        return;
                }
            }
        });
        addView(r8Var2);
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, null);
        this.d = z8Var;
        z8Var.setText(org.telegram.messenger.id.M0(2131752298, null));
        addView(z8Var);
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, null);
        this.f33488e = z8Var2;
        z8Var2.setText(org.telegram.messenger.id.M0(2131752303, null));
        addView(z8Var2);
        boolean z12 = this.f33489f;
        this.f33492s = z12 ? 1.0f : 0.0f;
        r8Var2.setVisibility(z12 ? 0 : 8);
        d(this.f33492s);
    }

    public abstract boolean a(boolean z9, d70 d70Var);

    public boolean b(boolean z9, e70 e70Var) {
        return true;
    }

    public final void c(boolean z9) {
        int i7;
        int i10 = 8;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f33485a.setVisibility(i7);
        if (z9) {
            i10 = 0;
        }
        this.f33486b.setVisibility(i10);
        if (!z9) {
            this.f33489f = true;
            this.f33487c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        int measuredHeight;
        this.f33492s = f10;
        org.telegram.ui.Cells.r8 r8Var = this.f33487c;
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
        org.telegram.ui.Cells.z8 z8Var2 = this.f33488e;
        z8Var2.setAlpha(f10);
        z8Var2.setTranslationY((org.telegram.messenger.g0.L(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.z8 z8Var = this.d;
        float alpha = z8Var.getAlpha() * z8Var.getHeight();
        org.telegram.ui.Cells.z8 z8Var2 = this.f33488e;
        return (z8Var2.getAlpha() * z8Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        org.telegram.ui.Cells.r8 r8Var = this.f33486b;
        if (r8Var.getVisibility() == 0) {
            int i14 = i11 - i7;
            org.telegram.ui.Cells.n4 n4Var = this.f33485a;
            int measuredHeight = n4Var.getMeasuredHeight();
            n4Var.layout(0, 0, i14, measuredHeight);
            i13 = r8Var.getMeasuredHeight() + measuredHeight;
            r8Var.layout(0, measuredHeight, i14, i13);
        } else {
            i13 = 0;
        }
        int i15 = i11 - i7;
        org.telegram.ui.Cells.r8 r8Var2 = this.f33487c;
        int measuredHeight2 = r8Var2.getMeasuredHeight() + i13;
        r8Var2.layout(0, i13, i15, measuredHeight2);
        org.telegram.ui.Cells.z8 z8Var = this.d;
        z8Var.layout(0, measuredHeight2, i15, z8Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.z8 z8Var2 = this.f33488e;
        z8Var2.layout(0, measuredHeight2, i15, z8Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Cells.z8 z8Var;
        org.telegram.ui.Cells.z8 z8Var2;
        float measuredHeight;
        org.telegram.ui.Cells.n4 n4Var = this.f33485a;
        int i11 = this.f33493w;
        n4Var.measure(i7, i11);
        org.telegram.ui.Cells.r8 r8Var = this.f33486b;
        r8Var.measure(i7, i11);
        org.telegram.ui.Cells.r8 r8Var2 = this.f33487c;
        r8Var2.measure(i7, i11);
        this.d.measure(i7, i11);
        this.f33488e.measure(i7, i11);
        if (r8Var.getVisibility() == 0) {
            measuredHeight = (r8Var2.getMeasuredHeight() * this.f33492s) + r8Var.getMeasuredHeight() + n4Var.getMeasuredHeight();
        } else {
            measuredHeight = r8Var2.getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + org.telegram.messenger.g0.W1(this.f33492s, z8Var.getMeasuredHeight(), z8Var2.getMeasuredHeight())), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z9;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f33490n = chat;
        boolean z10 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f33486b.setEnabled(z9);
        TLRPC.Chat chat2 = this.f33490n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        this.f33487c.setEnabled(z10);
    }

    public void setJoinRequest(boolean z9) {
        this.h = z9;
        this.f33487c.setChecked(z9);
    }

    public void setJoinToSend(boolean z9) {
        float f10;
        this.f33489f = z9;
        org.telegram.ui.Cells.r8 r8Var = this.f33486b;
        r8Var.setChecked(z9);
        r8Var.setDivider(this.f33489f);
        boolean z10 = this.h;
        org.telegram.ui.Cells.r8 r8Var2 = this.f33487c;
        r8Var2.setChecked(z10);
        ValueAnimator valueAnimator = this.f33491r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f33492s;
        if (this.f33489f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f33491r = ofFloat;
        ofFloat.setDuration(200L);
        this.f33491r.setInterpolator(wq.f40046f);
        this.f33491r.addUpdateListener(new c60(this, 1));
        this.f33491r.addListener(new e60(this, 2));
        r8Var2.setVisibility(0);
        this.f33491r.start();
    }
}
