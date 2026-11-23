package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public abstract class v70 extends LinearLayout {
    public final org.telegram.ui.Cells.o4 f40699a;
    public final org.telegram.ui.Cells.s8 f40700b;
    public final org.telegram.ui.Cells.s8 f40701c;
    public final org.telegram.ui.Cells.a9 d;
    public final org.telegram.ui.Cells.a9 f40702e;
    public boolean f40703f;
    public boolean h;
    public TLRPC.Chat f40704n;
    public ValueAnimator f40705r;
    public float f40706s;
    public final int f40707w;

    public v70(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f40707w = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f40704n = chat;
        this.f40703f = chat.join_to_send;
        this.h = chat.join_request;
        setOrientation(1);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 20);
        this.f40699a = o4Var;
        o4Var.setText(org.telegram.messenger.hd.N0(2131752288, null));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, o4Var, null);
        addView(o4Var);
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, 20);
        this.f40700b = s8Var;
        String N0 = org.telegram.messenger.hd.N0(2131752287, null);
        boolean z12 = this.f40703f;
        s8Var.f(N0, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        s8Var.setEnabled(z10);
        s8Var.setOnClickListener(new View.OnClickListener(this) {
            public final v70 f39511b;

            {
                this.f39511b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v70 v70Var = this.f39511b;
                        boolean z13 = v70Var.f40703f;
                        boolean z14 = !z13;
                        if (v70Var.b(z14, new u70(v70Var, v70Var.h, z13, 0))) {
                            v70Var.setJoinRequest(false);
                            v70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        v70 v70Var2 = this.f39511b;
                        boolean z15 = v70Var2.h;
                        boolean z16 = !z15;
                        if (v70Var2.a(z16, new t70(v70Var2, z15, 0))) {
                            v70Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(s8Var);
        org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context, 20);
        this.f40701c = s8Var2;
        s8Var2.f(org.telegram.messenger.hd.N0(2131752292, null), this.h, false);
        s8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        } else {
            z11 = true;
        }
        s8Var2.setEnabled(z11);
        s8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final v70 f39511b;

            {
                this.f39511b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v70 v70Var = this.f39511b;
                        boolean z13 = v70Var.f40703f;
                        boolean z14 = !z13;
                        if (v70Var.b(z14, new u70(v70Var, v70Var.h, z13, 0))) {
                            v70Var.setJoinRequest(false);
                            v70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        v70 v70Var2 = this.f39511b;
                        boolean z15 = v70Var2.h;
                        boolean z16 = !z15;
                        if (v70Var2.a(z16, new t70(v70Var2, z15, 0))) {
                            v70Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(s8Var2);
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(12, context, null);
        this.d = a9Var;
        a9Var.setText(org.telegram.messenger.hd.N0(2131752286, null));
        addView(a9Var);
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(12, context, null);
        this.f40702e = a9Var2;
        a9Var2.setText(org.telegram.messenger.hd.N0(2131752291, null));
        addView(a9Var2);
        boolean z13 = this.f40703f;
        this.f40706s = z13 ? 1.0f : 0.0f;
        s8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f40706s);
    }

    public abstract boolean a(boolean z10, t70 t70Var);

    public boolean b(boolean z10, u70 u70Var) {
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
        this.f40699a.setVisibility(i7);
        if (z10) {
            i10 = 0;
        }
        this.f40700b.setVisibility(i10);
        if (!z10) {
            this.f40703f = true;
            this.f40701c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        int measuredHeight;
        this.f40706s = f10;
        org.telegram.ui.Cells.s8 s8Var = this.f40701c;
        s8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        s8Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        s8Var.setScaleY(1.0f - (0.1f * f11));
        if (s8Var.getMeasuredHeight() <= 0) {
            measuredHeight = org.telegram.messenger.g0.L(50.0f);
        } else {
            measuredHeight = s8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.a9 a9Var = this.d;
        a9Var.setAlpha(f11);
        float f12 = (-measuredHeight) * f11;
        a9Var.setTranslationY(((-org.telegram.messenger.g0.L(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.a9 a9Var2 = this.f40702e;
        a9Var2.setAlpha(f10);
        a9Var2.setTranslationY((org.telegram.messenger.g0.L(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.a9 a9Var = this.d;
        float alpha = a9Var.getAlpha() * a9Var.getHeight();
        org.telegram.ui.Cells.a9 a9Var2 = this.f40702e;
        return (a9Var2.getAlpha() * a9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        org.telegram.ui.Cells.s8 s8Var = this.f40700b;
        if (s8Var.getVisibility() == 0) {
            int i14 = i11 - i7;
            org.telegram.ui.Cells.o4 o4Var = this.f40699a;
            int measuredHeight = o4Var.getMeasuredHeight();
            o4Var.layout(0, 0, i14, measuredHeight);
            i13 = s8Var.getMeasuredHeight() + measuredHeight;
            s8Var.layout(0, measuredHeight, i14, i13);
        } else {
            i13 = 0;
        }
        int i15 = i11 - i7;
        org.telegram.ui.Cells.s8 s8Var2 = this.f40701c;
        int measuredHeight2 = s8Var2.getMeasuredHeight() + i13;
        s8Var2.layout(0, i13, i15, measuredHeight2);
        org.telegram.ui.Cells.a9 a9Var = this.d;
        a9Var.layout(0, measuredHeight2, i15, a9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.a9 a9Var2 = this.f40702e;
        a9Var2.layout(0, measuredHeight2, i15, a9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Cells.a9 a9Var;
        org.telegram.ui.Cells.a9 a9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.o4 o4Var = this.f40699a;
        int i11 = this.f40707w;
        o4Var.measure(i7, i11);
        org.telegram.ui.Cells.s8 s8Var = this.f40700b;
        s8Var.measure(i7, i11);
        org.telegram.ui.Cells.s8 s8Var2 = this.f40701c;
        s8Var2.measure(i7, i11);
        this.d.measure(i7, i11);
        this.f40702e.measure(i7, i11);
        if (s8Var.getVisibility() == 0) {
            measuredHeight = (s8Var2.getMeasuredHeight() * this.f40706s) + s8Var.getMeasuredHeight() + o4Var.getMeasuredHeight();
        } else {
            measuredHeight = s8Var2.getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + org.telegram.messenger.g0.W1(this.f40706s, a9Var.getMeasuredHeight(), a9Var2.getMeasuredHeight())), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f40704n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f40700b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f40704n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f40701c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f40701c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f10;
        this.f40703f = z10;
        org.telegram.ui.Cells.s8 s8Var = this.f40700b;
        s8Var.setChecked(z10);
        s8Var.setDivider(this.f40703f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.s8 s8Var2 = this.f40701c;
        s8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f40705r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f40706s;
        if (this.f40703f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f40705r = ofFloat;
        ofFloat.setDuration(200L);
        this.f40705r.setInterpolator(nr.f37961f);
        this.f40705r.addUpdateListener(new h60(this, 3));
        this.f40705r.addListener(new s60(this, 2));
        s8Var2.setVisibility(0);
        this.f40705r.start();
    }
}
