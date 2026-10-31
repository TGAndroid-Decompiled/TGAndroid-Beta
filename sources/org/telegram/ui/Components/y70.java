package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public abstract class y70 extends LinearLayout {
    public final org.telegram.ui.Cells.p4 f32648a;
    public final org.telegram.ui.Cells.t8 f32649b;
    public final org.telegram.ui.Cells.t8 f32650c;
    public final org.telegram.ui.Cells.b9 d;
    public final org.telegram.ui.Cells.b9 e;
    public boolean f32651f;
    public boolean h;
    public TLRPC.Chat f32652n;
    public ValueAnimator f32653r;
    public float f32654s;
    public final int f32655w;

    public y70(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f32655w = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f32652n = chat;
        this.f32651f = chat.join_to_send;
        this.h = chat.join_request;
        setOrientation(1);
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, 20);
        this.f32648a = p4Var;
        p4Var.setText(org.telegram.messenger.cd.L0(2131752300, null));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p4Var, null);
        addView(p4Var);
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context, 20);
        this.f32649b = t8Var;
        String L0 = org.telegram.messenger.cd.L0(2131752299, null);
        boolean z12 = this.f32651f;
        t8Var.f(L0, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        t8Var.setEnabled(z10);
        t8Var.setOnClickListener(new View.OnClickListener(this) {
            public final y70 f31158b;

            {
                this.f31158b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y70 y70Var = this.f31158b;
                        boolean z13 = y70Var.f32651f;
                        boolean z14 = !z13;
                        if (y70Var.b(z14, new x70(y70Var, y70Var.h, z13, 0))) {
                            y70Var.setJoinRequest(false);
                            y70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        y70 y70Var2 = this.f31158b;
                        boolean z15 = y70Var2.h;
                        boolean z16 = !z15;
                        if (y70Var2.a(z16, new w70(y70Var2, z15, 0))) {
                            y70Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(t8Var);
        org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context, 20);
        this.f32650c = t8Var2;
        t8Var2.f(org.telegram.messenger.cd.L0(2131752304, null), this.h, false);
        t8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        } else {
            z11 = true;
        }
        t8Var2.setEnabled(z11);
        t8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final y70 f31158b;

            {
                this.f31158b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y70 y70Var = this.f31158b;
                        boolean z13 = y70Var.f32651f;
                        boolean z14 = !z13;
                        if (y70Var.b(z14, new x70(y70Var, y70Var.h, z13, 0))) {
                            y70Var.setJoinRequest(false);
                            y70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        y70 y70Var2 = this.f31158b;
                        boolean z15 = y70Var2.h;
                        boolean z16 = !z15;
                        if (y70Var2.a(z16, new w70(y70Var2, z15, 0))) {
                            y70Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(t8Var2);
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context, null);
        this.d = b9Var;
        b9Var.setText(org.telegram.messenger.cd.L0(2131752298, null));
        addView(b9Var);
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(12, context, null);
        this.e = b9Var2;
        b9Var2.setText(org.telegram.messenger.cd.L0(2131752303, null));
        addView(b9Var2);
        boolean z13 = this.f32651f;
        this.f32654s = z13 ? 1.0f : 0.0f;
        t8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f32654s);
    }

    public abstract boolean a(boolean z10, w70 w70Var);

    public boolean b(boolean z10, x70 x70Var) {
        return true;
    }

    public final void c(boolean z10) {
        int i10;
        int i11 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f32648a.setVisibility(i10);
        if (z10) {
            i11 = 0;
        }
        this.f32649b.setVisibility(i11);
        if (!z10) {
            this.f32651f = true;
            this.f32650c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f7) {
        int measuredHeight;
        this.f32654s = f7;
        org.telegram.ui.Cells.t8 t8Var = this.f32650c;
        t8Var.setAlpha(f7);
        float f10 = 1.0f - f7;
        t8Var.setTranslationY((-org.telegram.messenger.i0.L(16.0f)) * f10);
        t8Var.setScaleY(1.0f - (0.1f * f10));
        if (t8Var.getMeasuredHeight() <= 0) {
            measuredHeight = org.telegram.messenger.i0.L(50.0f);
        } else {
            measuredHeight = t8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.b9 b9Var = this.d;
        b9Var.setAlpha(f10);
        float f11 = (-measuredHeight) * f10;
        b9Var.setTranslationY(((-org.telegram.messenger.i0.L(4.0f)) * f7) + f11);
        org.telegram.ui.Cells.b9 b9Var2 = this.e;
        b9Var2.setAlpha(f7);
        b9Var2.setTranslationY((org.telegram.messenger.i0.L(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.b9 b9Var = this.d;
        float alpha = b9Var.getAlpha() * b9Var.getHeight();
        org.telegram.ui.Cells.b9 b9Var2 = this.e;
        return (b9Var2.getAlpha() * b9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.t8 t8Var = this.f32649b;
        if (t8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.p4 p4Var = this.f32648a;
            int measuredHeight = p4Var.getMeasuredHeight();
            p4Var.layout(0, 0, i15, measuredHeight);
            i14 = t8Var.getMeasuredHeight() + measuredHeight;
            t8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.t8 t8Var2 = this.f32650c;
        int measuredHeight2 = t8Var2.getMeasuredHeight() + i14;
        t8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.b9 b9Var = this.d;
        b9Var.layout(0, measuredHeight2, i16, b9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.b9 b9Var2 = this.e;
        b9Var2.layout(0, measuredHeight2, i16, b9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Cells.b9 b9Var;
        org.telegram.ui.Cells.b9 b9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.p4 p4Var = this.f32648a;
        int i12 = this.f32655w;
        p4Var.measure(i10, i12);
        org.telegram.ui.Cells.t8 t8Var = this.f32649b;
        t8Var.measure(i10, i12);
        org.telegram.ui.Cells.t8 t8Var2 = this.f32650c;
        t8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (t8Var.getVisibility() == 0) {
            measuredHeight = (t8Var2.getMeasuredHeight() * this.f32654s) + t8Var.getMeasuredHeight() + p4Var.getMeasuredHeight();
        } else {
            measuredHeight = t8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + org.telegram.messenger.i0.W1(this.f32654s, b9Var.getMeasuredHeight(), b9Var2.getMeasuredHeight())), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f32652n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f32649b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f32652n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f32650c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f32650c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f7;
        this.f32651f = z10;
        org.telegram.ui.Cells.t8 t8Var = this.f32649b;
        t8Var.setChecked(z10);
        t8Var.setDivider(this.f32651f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.t8 t8Var2 = this.f32650c;
        t8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f32653r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f32654s;
        if (this.f32651f) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f32653r = ofFloat;
        ofFloat.setDuration(200L);
        this.f32653r.setInterpolator(gr.f26495f);
        this.f32653r.addUpdateListener(new r60(this, 1));
        this.f32653r.addListener(new t60(this, 2));
        t8Var2.setVisibility(0);
        this.f32653r.start();
    }
}
