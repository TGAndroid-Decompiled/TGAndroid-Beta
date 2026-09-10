package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class u80 extends LinearLayout {
    public final org.telegram.ui.Cells.m4 f27606a;
    public final org.telegram.ui.Cells.x8 f27607b;
    public final org.telegram.ui.Cells.x8 f27608c;
    public final org.telegram.ui.Cells.f9 d;
    public final org.telegram.ui.Cells.f9 e;
    public boolean f27609f;
    public boolean h;
    public TLRPC.Chat f27610n;
    public ValueAnimator f27611r;
    public float f27612s;
    public final int v;

    public u80(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f27610n = chat;
        this.f27609f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z11 = true;
        setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 20);
        this.f27606a = m4Var;
        m4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        addView(m4Var);
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 20);
        this.f27607b = x8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z12 = this.f27609f;
        x8Var.f(string, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        x8Var.setEnabled(z10);
        x8Var.setOnClickListener(new View.OnClickListener(this) {
            public final u80 f26628b;

            {
                this.f26628b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u80 u80Var = this.f26628b;
                        boolean z13 = u80Var.f27609f;
                        boolean z14 = !z13;
                        if (u80Var.b(z14, new t80(u80Var, u80Var.h, z13, 0))) {
                            u80Var.setJoinRequest(false);
                            u80Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        u80 u80Var2 = this.f26628b;
                        boolean z15 = u80Var2.h;
                        boolean z16 = !z15;
                        if (u80Var2.a(z16, new s80(u80Var2, z15, 0))) {
                            u80Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(x8Var);
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, 20);
        this.f27608c = x8Var2;
        x8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        x8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        x8Var2.setEnabled(z11);
        x8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final u80 f26628b;

            {
                this.f26628b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u80 u80Var = this.f26628b;
                        boolean z13 = u80Var.f27609f;
                        boolean z14 = !z13;
                        if (u80Var.b(z14, new t80(u80Var, u80Var.h, z13, 0))) {
                            u80Var.setJoinRequest(false);
                            u80Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        u80 u80Var2 = this.f26628b;
                        boolean z15 = u80Var2.h;
                        boolean z16 = !z15;
                        if (u80Var2.a(z16, new s80(u80Var2, z15, 0))) {
                            u80Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(x8Var2);
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 12, null);
        this.d = f9Var;
        f9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(f9Var);
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context, 12, null);
        this.e = f9Var2;
        f9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(f9Var2);
        boolean z13 = this.f27609f;
        this.f27612s = z13 ? 1.0f : 0.0f;
        x8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f27612s);
    }

    public abstract boolean a(boolean z10, s80 s80Var);

    public boolean b(boolean z10, t80 t80Var) {
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
        this.f27606a.setVisibility(i10);
        if (z10) {
            i11 = 0;
        }
        this.f27607b.setVisibility(i11);
        if (!z10) {
            this.f27609f = true;
            this.f27608c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f7) {
        int measuredHeight;
        this.f27612s = f7;
        org.telegram.ui.Cells.x8 x8Var = this.f27608c;
        x8Var.setAlpha(f7);
        float f10 = 1.0f - f7;
        x8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        x8Var.setScaleY(1.0f - (0.1f * f10));
        if (x8Var.getMeasuredHeight() <= 0) {
            measuredHeight = AndroidUtilities.dp(50.0f);
        } else {
            measuredHeight = x8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.f9 f9Var = this.d;
        f9Var.setAlpha(f10);
        float f11 = (-measuredHeight) * f10;
        f9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f7) + f11);
        org.telegram.ui.Cells.f9 f9Var2 = this.e;
        f9Var2.setAlpha(f7);
        f9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.f9 f9Var = this.d;
        float alpha = f9Var.getAlpha() * f9Var.getHeight();
        org.telegram.ui.Cells.f9 f9Var2 = this.e;
        return (f9Var2.getAlpha() * f9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.x8 x8Var = this.f27607b;
        if (x8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.m4 m4Var = this.f27606a;
            int measuredHeight = m4Var.getMeasuredHeight();
            m4Var.layout(0, 0, i15, measuredHeight);
            i14 = x8Var.getMeasuredHeight() + measuredHeight;
            x8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.x8 x8Var2 = this.f27608c;
        int measuredHeight2 = x8Var2.getMeasuredHeight() + i14;
        x8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.f9 f9Var = this.d;
        f9Var.layout(0, measuredHeight2, i16, f9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.f9 f9Var2 = this.e;
        f9Var2.layout(0, measuredHeight2, i16, f9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Cells.f9 f9Var;
        org.telegram.ui.Cells.f9 f9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.m4 m4Var = this.f27606a;
        int i12 = this.v;
        m4Var.measure(i10, i12);
        org.telegram.ui.Cells.x8 x8Var = this.f27607b;
        x8Var.measure(i10, i12);
        org.telegram.ui.Cells.x8 x8Var2 = this.f27608c;
        x8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (x8Var.getVisibility() == 0) {
            measuredHeight = (x8Var2.getMeasuredHeight() * this.f27612s) + x8Var.getMeasuredHeight() + m4Var.getMeasuredHeight();
        } else {
            measuredHeight = x8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(f9Var.getMeasuredHeight(), f9Var2.getMeasuredHeight(), this.f27612s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f27610n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f27607b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f27610n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f27608c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f27608c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f7;
        this.f27609f = z10;
        org.telegram.ui.Cells.x8 x8Var = this.f27607b;
        x8Var.setChecked(z10);
        x8Var.setDivider(this.f27609f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.x8 x8Var2 = this.f27608c;
        x8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f27611r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f27612s;
        if (this.f27609f) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f27611r = ofFloat;
        ofFloat.setDuration(200L);
        this.f27611r.setInterpolator(wr.f28819f);
        this.f27611r.addUpdateListener(new q70(this, 1));
        this.f27611r.addListener(new rm(this, 16));
        x8Var2.setVisibility(0);
        this.f27611r.start();
    }
}
