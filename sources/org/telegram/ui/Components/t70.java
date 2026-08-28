package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class t70 extends LinearLayout {
    public final org.telegram.ui.Cells.m4 f32637a;
    public final org.telegram.ui.Cells.t8 f32638b;
    public final org.telegram.ui.Cells.t8 f32639c;
    public final org.telegram.ui.Cells.b9 d;
    public final org.telegram.ui.Cells.b9 f32640e;
    public boolean f32641f;
    public boolean h;
    public TLRPC.Chat f32642n;
    public ValueAnimator f32643r;
    public float f32644s;
    public final int v;

    public t70(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f32642n = chat;
        this.f32641f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z11 = true;
        setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 20);
        this.f32637a = m4Var;
        m4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        addView(m4Var);
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context, 20);
        this.f32638b = t8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z12 = this.f32641f;
        t8Var.f(string, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        t8Var.setEnabled(z10);
        t8Var.setOnClickListener(new View.OnClickListener(this) {
            public final t70 f31852b;

            {
                this.f31852b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t70 t70Var = this.f31852b;
                        boolean z13 = t70Var.f32641f;
                        boolean z14 = !z13;
                        if (t70Var.b(z14, new s70(t70Var, t70Var.h, z13, 0))) {
                            t70Var.setJoinRequest(false);
                            t70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        t70 t70Var2 = this.f31852b;
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
        addView(t8Var);
        org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context, 20);
        this.f32639c = t8Var2;
        t8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        t8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        t8Var2.setEnabled(z11);
        t8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final t70 f31852b;

            {
                this.f31852b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t70 t70Var = this.f31852b;
                        boolean z13 = t70Var.f32641f;
                        boolean z14 = !z13;
                        if (t70Var.b(z14, new s70(t70Var, t70Var.h, z13, 0))) {
                            t70Var.setJoinRequest(false);
                            t70Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        t70 t70Var2 = this.f31852b;
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
        addView(t8Var2);
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 12, null);
        this.d = b9Var;
        b9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(b9Var);
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context, 12, null);
        this.f32640e = b9Var2;
        b9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(b9Var2);
        boolean z13 = this.f32641f;
        this.f32644s = z13 ? 1.0f : 0.0f;
        t8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f32644s);
    }

    public abstract boolean a(boolean z10, r70 r70Var);

    public boolean b(boolean z10, s70 s70Var) {
        return true;
    }

    public final void c(boolean z10) {
        int i9;
        int i10 = 8;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f32637a.setVisibility(i9);
        if (z10) {
            i10 = 0;
        }
        this.f32638b.setVisibility(i10);
        if (!z10) {
            this.f32641f = true;
            this.f32639c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        int measuredHeight;
        this.f32644s = f10;
        org.telegram.ui.Cells.t8 t8Var = this.f32639c;
        t8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        t8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        t8Var.setScaleY(1.0f - (0.1f * f11));
        if (t8Var.getMeasuredHeight() <= 0) {
            measuredHeight = AndroidUtilities.dp(50.0f);
        } else {
            measuredHeight = t8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.b9 b9Var = this.d;
        b9Var.setAlpha(f11);
        float f12 = (-measuredHeight) * f11;
        b9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.b9 b9Var2 = this.f32640e;
        b9Var2.setAlpha(f10);
        b9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.b9 b9Var = this.d;
        float alpha = b9Var.getAlpha() * b9Var.getHeight();
        org.telegram.ui.Cells.b9 b9Var2 = this.f32640e;
        return (b9Var2.getAlpha() * b9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        org.telegram.ui.Cells.t8 t8Var = this.f32638b;
        if (t8Var.getVisibility() == 0) {
            int i14 = i11 - i9;
            org.telegram.ui.Cells.m4 m4Var = this.f32637a;
            int measuredHeight = m4Var.getMeasuredHeight();
            m4Var.layout(0, 0, i14, measuredHeight);
            i13 = t8Var.getMeasuredHeight() + measuredHeight;
            t8Var.layout(0, measuredHeight, i14, i13);
        } else {
            i13 = 0;
        }
        int i15 = i11 - i9;
        org.telegram.ui.Cells.t8 t8Var2 = this.f32639c;
        int measuredHeight2 = t8Var2.getMeasuredHeight() + i13;
        t8Var2.layout(0, i13, i15, measuredHeight2);
        org.telegram.ui.Cells.b9 b9Var = this.d;
        b9Var.layout(0, measuredHeight2, i15, b9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.b9 b9Var2 = this.f32640e;
        b9Var2.layout(0, measuredHeight2, i15, b9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.Cells.b9 b9Var;
        org.telegram.ui.Cells.b9 b9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.m4 m4Var = this.f32637a;
        int i11 = this.v;
        m4Var.measure(i9, i11);
        org.telegram.ui.Cells.t8 t8Var = this.f32638b;
        t8Var.measure(i9, i11);
        org.telegram.ui.Cells.t8 t8Var2 = this.f32639c;
        t8Var2.measure(i9, i11);
        this.d.measure(i9, i11);
        this.f32640e.measure(i9, i11);
        if (t8Var.getVisibility() == 0) {
            measuredHeight = (t8Var2.getMeasuredHeight() * this.f32644s) + t8Var.getMeasuredHeight() + m4Var.getMeasuredHeight();
        } else {
            measuredHeight = t8Var2.getMeasuredHeight();
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(b9Var.getMeasuredHeight(), b9Var2.getMeasuredHeight(), this.f32644s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f32642n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f32638b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f32642n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f32639c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f32639c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f10;
        this.f32641f = z10;
        org.telegram.ui.Cells.t8 t8Var = this.f32638b;
        t8Var.setChecked(z10);
        t8Var.setDivider(this.f32641f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.t8 t8Var2 = this.f32639c;
        t8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f32643r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f32644s;
        if (this.f32641f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f32643r = ofFloat;
        ofFloat.setDuration(200L);
        this.f32643r.setInterpolator(gr.f28844f);
        this.f32643r.addUpdateListener(new q60(this, 1));
        this.f32643r.addListener(new r60(this, 2));
        t8Var2.setVisibility(0);
        this.f32643r.start();
    }
}
