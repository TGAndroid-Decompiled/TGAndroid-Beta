package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public abstract class t70 extends LinearLayout {
    public final org.telegram.ui.Cells.o4 f39931a;
    public final org.telegram.ui.Cells.s8 f39932b;
    public final org.telegram.ui.Cells.s8 f39933c;
    public final org.telegram.ui.Cells.a9 d;
    public final org.telegram.ui.Cells.a9 f39934e;
    public boolean f39935f;
    public boolean h;
    public TLRPC.Chat f39936n;
    public ValueAnimator f39937r;
    public float f39938s;
    public final int f39939w;

    public t70(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f39939w = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f39936n = chat;
        this.f39935f = chat.join_to_send;
        this.h = chat.join_request;
        setOrientation(1);
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 20);
        this.f39931a = o4Var;
        o4Var.setText(org.telegram.messenger.gd.M0(2131752289, null));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, o4Var, null);
        addView(o4Var);
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, 20);
        this.f39932b = s8Var;
        String M0 = org.telegram.messenger.gd.M0(2131752288, null);
        boolean z12 = this.f39935f;
        s8Var.f(M0, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        s8Var.setEnabled(z10);
        s8Var.setOnClickListener(new View.OnClickListener(this) {
            public final t70 f38724b;

            {
                this.f38724b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t70 t70Var = this.f38724b;
                        boolean z13 = t70Var.f39935f;
                        boolean z14 = !z13;
                        if (t70Var.b(z14, new s70(t70Var, t70Var.h, z13, 0))) {
                            t70Var.setJoinRequest(false);
                            t70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        t70 t70Var2 = this.f38724b;
                        boolean z15 = t70Var2.h;
                        boolean z16 = !z15;
                        if (t70Var2.a(z16, new r70(t70Var2, z15, 0))) {
                            t70Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(s8Var);
        org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context, 20);
        this.f39933c = s8Var2;
        s8Var2.f(org.telegram.messenger.gd.M0(2131752293, null), this.h, false);
        s8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        } else {
            z11 = true;
        }
        s8Var2.setEnabled(z11);
        s8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final t70 f38724b;

            {
                this.f38724b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t70 t70Var = this.f38724b;
                        boolean z13 = t70Var.f39935f;
                        boolean z14 = !z13;
                        if (t70Var.b(z14, new s70(t70Var, t70Var.h, z13, 0))) {
                            t70Var.setJoinRequest(false);
                            t70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        t70 t70Var2 = this.f38724b;
                        boolean z15 = t70Var2.h;
                        boolean z16 = !z15;
                        if (t70Var2.a(z16, new r70(t70Var2, z15, 0))) {
                            t70Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(s8Var2);
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(12, context, null);
        this.d = a9Var;
        a9Var.setText(org.telegram.messenger.gd.M0(2131752287, null));
        addView(a9Var);
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(12, context, null);
        this.f39934e = a9Var2;
        a9Var2.setText(org.telegram.messenger.gd.M0(2131752292, null));
        addView(a9Var2);
        boolean z13 = this.f39935f;
        this.f39938s = z13 ? 1.0f : 0.0f;
        s8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f39938s);
    }

    public abstract boolean a(boolean z10, r70 r70Var);

    public boolean b(boolean z10, s70 s70Var) {
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
        this.f39931a.setVisibility(i7);
        if (z10) {
            i10 = 0;
        }
        this.f39932b.setVisibility(i10);
        if (!z10) {
            this.f39935f = true;
            this.f39933c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        int measuredHeight;
        this.f39938s = f10;
        org.telegram.ui.Cells.s8 s8Var = this.f39933c;
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
        org.telegram.ui.Cells.a9 a9Var2 = this.f39934e;
        a9Var2.setAlpha(f10);
        a9Var2.setTranslationY((org.telegram.messenger.g0.L(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.a9 a9Var = this.d;
        float alpha = a9Var.getAlpha() * a9Var.getHeight();
        org.telegram.ui.Cells.a9 a9Var2 = this.f39934e;
        return (a9Var2.getAlpha() * a9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        org.telegram.ui.Cells.s8 s8Var = this.f39932b;
        if (s8Var.getVisibility() == 0) {
            int i14 = i11 - i7;
            org.telegram.ui.Cells.o4 o4Var = this.f39931a;
            int measuredHeight = o4Var.getMeasuredHeight();
            o4Var.layout(0, 0, i14, measuredHeight);
            i13 = s8Var.getMeasuredHeight() + measuredHeight;
            s8Var.layout(0, measuredHeight, i14, i13);
        } else {
            i13 = 0;
        }
        int i15 = i11 - i7;
        org.telegram.ui.Cells.s8 s8Var2 = this.f39933c;
        int measuredHeight2 = s8Var2.getMeasuredHeight() + i13;
        s8Var2.layout(0, i13, i15, measuredHeight2);
        org.telegram.ui.Cells.a9 a9Var = this.d;
        a9Var.layout(0, measuredHeight2, i15, a9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.a9 a9Var2 = this.f39934e;
        a9Var2.layout(0, measuredHeight2, i15, a9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Cells.a9 a9Var;
        org.telegram.ui.Cells.a9 a9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.o4 o4Var = this.f39931a;
        int i11 = this.f39939w;
        o4Var.measure(i7, i11);
        org.telegram.ui.Cells.s8 s8Var = this.f39932b;
        s8Var.measure(i7, i11);
        org.telegram.ui.Cells.s8 s8Var2 = this.f39933c;
        s8Var2.measure(i7, i11);
        this.d.measure(i7, i11);
        this.f39934e.measure(i7, i11);
        if (s8Var.getVisibility() == 0) {
            measuredHeight = (s8Var2.getMeasuredHeight() * this.f39938s) + s8Var.getMeasuredHeight() + o4Var.getMeasuredHeight();
        } else {
            measuredHeight = s8Var2.getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + org.telegram.messenger.g0.W1(this.f39938s, a9Var.getMeasuredHeight(), a9Var2.getMeasuredHeight())), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f39936n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f39932b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f39936n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f39933c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f39933c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f10;
        this.f39935f = z10;
        org.telegram.ui.Cells.s8 s8Var = this.f39932b;
        s8Var.setChecked(z10);
        s8Var.setDivider(this.f39935f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.s8 s8Var2 = this.f39933c;
        s8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f39937r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f39938s;
        if (this.f39935f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f39937r = ofFloat;
        ofFloat.setDuration(200L);
        this.f39937r.setInterpolator(lr.f37208f);
        this.f39937r.addUpdateListener(new e60(this, 3));
        this.f39937r.addListener(new q60(this, 2));
        s8Var2.setVisibility(0);
        this.f39937r.start();
    }
}
