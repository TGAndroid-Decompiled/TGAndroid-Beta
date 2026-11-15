package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public abstract class i70 extends LinearLayout {
    public final org.telegram.ui.Cells.n4 f35471a;
    public final org.telegram.ui.Cells.q8 f35472b;
    public final org.telegram.ui.Cells.q8 f35473c;
    public final org.telegram.ui.Cells.y8 d;
    public final org.telegram.ui.Cells.y8 f35474e;
    public boolean f35475f;
    public boolean h;
    public TLRPC.Chat f35476n;
    public ValueAnimator f35477r;
    public float f35478s;
    public final int f35479w;

    public i70(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f35479w = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f35476n = chat;
        this.f35475f = chat.join_to_send;
        this.h = chat.join_request;
        setOrientation(1);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 20);
        this.f35471a = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131752300, null));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, null);
        addView(n4Var);
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context, 20);
        this.f35472b = q8Var;
        String M0 = org.telegram.messenger.hd.M0(2131752299, null);
        boolean z12 = this.f35475f;
        q8Var.f(M0, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        q8Var.setEnabled(z10);
        q8Var.setOnClickListener(new View.OnClickListener(this) {
            public final i70 f34536b;

            {
                this.f34536b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i70 i70Var = this.f34536b;
                        boolean z13 = i70Var.f35475f;
                        boolean z14 = !z13;
                        if (i70Var.b(z14, new h70(i70Var, i70Var.h, z13, 0))) {
                            i70Var.setJoinRequest(false);
                            i70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        i70 i70Var2 = this.f34536b;
                        boolean z15 = i70Var2.h;
                        boolean z16 = !z15;
                        if (i70Var2.a(z16, new g70(i70Var2, z15, 0))) {
                            i70Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(q8Var);
        org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context, 20);
        this.f35473c = q8Var2;
        q8Var2.f(org.telegram.messenger.hd.M0(2131752304, null), this.h, false);
        q8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        } else {
            z11 = true;
        }
        q8Var2.setEnabled(z11);
        q8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final i70 f34536b;

            {
                this.f34536b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i70 i70Var = this.f34536b;
                        boolean z13 = i70Var.f35475f;
                        boolean z14 = !z13;
                        if (i70Var.b(z14, new h70(i70Var, i70Var.h, z13, 0))) {
                            i70Var.setJoinRequest(false);
                            i70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        i70 i70Var2 = this.f34536b;
                        boolean z15 = i70Var2.h;
                        boolean z16 = !z15;
                        if (i70Var2.a(z16, new g70(i70Var2, z15, 0))) {
                            i70Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(q8Var2);
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, null);
        this.d = y8Var;
        y8Var.setText(org.telegram.messenger.hd.M0(2131752298, null));
        addView(y8Var);
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context, null);
        this.f35474e = y8Var2;
        y8Var2.setText(org.telegram.messenger.hd.M0(2131752303, null));
        addView(y8Var2);
        boolean z13 = this.f35475f;
        this.f35478s = z13 ? 1.0f : 0.0f;
        q8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f35478s);
    }

    public abstract boolean a(boolean z10, g70 g70Var);

    public boolean b(boolean z10, h70 h70Var) {
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
        this.f35471a.setVisibility(i7);
        if (z10) {
            i10 = 0;
        }
        this.f35472b.setVisibility(i10);
        if (!z10) {
            this.f35475f = true;
            this.f35473c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        int measuredHeight;
        this.f35478s = f10;
        org.telegram.ui.Cells.q8 q8Var = this.f35473c;
        q8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        q8Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        q8Var.setScaleY(1.0f - (0.1f * f11));
        if (q8Var.getMeasuredHeight() <= 0) {
            measuredHeight = org.telegram.messenger.g0.L(50.0f);
        } else {
            measuredHeight = q8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.y8 y8Var = this.d;
        y8Var.setAlpha(f11);
        float f12 = (-measuredHeight) * f11;
        y8Var.setTranslationY(((-org.telegram.messenger.g0.L(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.y8 y8Var2 = this.f35474e;
        y8Var2.setAlpha(f10);
        y8Var2.setTranslationY((org.telegram.messenger.g0.L(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.y8 y8Var = this.d;
        float alpha = y8Var.getAlpha() * y8Var.getHeight();
        org.telegram.ui.Cells.y8 y8Var2 = this.f35474e;
        return (y8Var2.getAlpha() * y8Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        org.telegram.ui.Cells.q8 q8Var = this.f35472b;
        if (q8Var.getVisibility() == 0) {
            int i14 = i11 - i7;
            org.telegram.ui.Cells.n4 n4Var = this.f35471a;
            int measuredHeight = n4Var.getMeasuredHeight();
            n4Var.layout(0, 0, i14, measuredHeight);
            i13 = q8Var.getMeasuredHeight() + measuredHeight;
            q8Var.layout(0, measuredHeight, i14, i13);
        } else {
            i13 = 0;
        }
        int i15 = i11 - i7;
        org.telegram.ui.Cells.q8 q8Var2 = this.f35473c;
        int measuredHeight2 = q8Var2.getMeasuredHeight() + i13;
        q8Var2.layout(0, i13, i15, measuredHeight2);
        org.telegram.ui.Cells.y8 y8Var = this.d;
        y8Var.layout(0, measuredHeight2, i15, y8Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.y8 y8Var2 = this.f35474e;
        y8Var2.layout(0, measuredHeight2, i15, y8Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Cells.y8 y8Var;
        org.telegram.ui.Cells.y8 y8Var2;
        float measuredHeight;
        org.telegram.ui.Cells.n4 n4Var = this.f35471a;
        int i11 = this.f35479w;
        n4Var.measure(i7, i11);
        org.telegram.ui.Cells.q8 q8Var = this.f35472b;
        q8Var.measure(i7, i11);
        org.telegram.ui.Cells.q8 q8Var2 = this.f35473c;
        q8Var2.measure(i7, i11);
        this.d.measure(i7, i11);
        this.f35474e.measure(i7, i11);
        if (q8Var.getVisibility() == 0) {
            measuredHeight = (q8Var2.getMeasuredHeight() * this.f35478s) + q8Var.getMeasuredHeight() + n4Var.getMeasuredHeight();
        } else {
            measuredHeight = q8Var2.getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + org.telegram.messenger.g0.W1(this.f35478s, y8Var.getMeasuredHeight(), y8Var2.getMeasuredHeight())), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f35476n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f35472b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f35476n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f35473c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f35473c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f10;
        this.f35475f = z10;
        org.telegram.ui.Cells.q8 q8Var = this.f35472b;
        q8Var.setChecked(z10);
        q8Var.setDivider(this.f35475f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.q8 q8Var2 = this.f35473c;
        q8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f35477r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f35478s;
        if (this.f35475f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f35477r = ofFloat;
        ofFloat.setDuration(200L);
        this.f35477r.setInterpolator(er.f34419f);
        this.f35477r.addUpdateListener(new f60(this, 1));
        this.f35477r.addListener(new h60(this, 2));
        q8Var2.setVisibility(0);
        this.f35477r.start();
    }
}
