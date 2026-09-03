package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class m80 extends LinearLayout {
    public final org.telegram.ui.Cells.l4 f26984a;
    public final org.telegram.ui.Cells.r8 f26985b;
    public final org.telegram.ui.Cells.r8 f26986c;
    public final org.telegram.ui.Cells.z8 d;
    public final org.telegram.ui.Cells.z8 e;
    public boolean f26987f;
    public boolean h;
    public TLRPC.Chat f26988n;
    public ValueAnimator f26989r;
    public float f26990s;
    public final int v;

    public m80(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z4;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f26988n = chat;
        this.f26987f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z10 = true;
        setOrientation(1);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 20);
        this.f26984a = l4Var;
        l4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        addView(l4Var);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, 20);
        this.f26985b = r8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f26987f;
        r8Var.f(string, z11, z11);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z4 = false;
        } else {
            z4 = true;
        }
        r8Var.setEnabled(z4);
        r8Var.setOnClickListener(new View.OnClickListener(this) {
            public final m80 f25900b;

            {
                this.f25900b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m80 m80Var = this.f25900b;
                        boolean z12 = m80Var.f26987f;
                        boolean z13 = !z12;
                        if (m80Var.b(z13, new l80(m80Var, m80Var.h, z12, 0))) {
                            m80Var.setJoinRequest(false);
                            m80Var.setJoinToSend(z13);
                            return;
                        }
                        return;
                    default:
                        m80 m80Var2 = this.f25900b;
                        boolean z14 = m80Var2.h;
                        boolean z15 = !z14;
                        if (m80Var2.a(z15, new k80(m80Var2, z14, 0))) {
                            m80Var2.setJoinRequest(z15);
                            return;
                        }
                        return;
                }
            }
        });
        addView(r8Var);
        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context, 20);
        this.f26986c = r8Var2;
        r8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        r8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        r8Var2.setEnabled(z10);
        r8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final m80 f25900b;

            {
                this.f25900b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m80 m80Var = this.f25900b;
                        boolean z12 = m80Var.f26987f;
                        boolean z13 = !z12;
                        if (m80Var.b(z13, new l80(m80Var, m80Var.h, z12, 0))) {
                            m80Var.setJoinRequest(false);
                            m80Var.setJoinToSend(z13);
                            return;
                        }
                        return;
                    default:
                        m80 m80Var2 = this.f25900b;
                        boolean z14 = m80Var2.h;
                        boolean z15 = !z14;
                        if (m80Var2.a(z15, new k80(m80Var2, z14, 0))) {
                            m80Var2.setJoinRequest(z15);
                            return;
                        }
                        return;
                }
            }
        });
        addView(r8Var2);
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, 12, null);
        this.d = z8Var;
        z8Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(z8Var);
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context, 12, null);
        this.e = z8Var2;
        z8Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(z8Var2);
        boolean z12 = this.f26987f;
        this.f26990s = z12 ? 1.0f : 0.0f;
        r8Var2.setVisibility(z12 ? 0 : 8);
        d(this.f26990s);
    }

    public abstract boolean a(boolean z4, k80 k80Var);

    public boolean b(boolean z4, l80 l80Var) {
        return true;
    }

    public final void c(boolean z4) {
        int i10;
        int i11 = 8;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f26984a.setVisibility(i10);
        if (z4) {
            i11 = 0;
        }
        this.f26985b.setVisibility(i11);
        if (!z4) {
            this.f26987f = true;
            this.f26986c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        int measuredHeight;
        this.f26990s = f10;
        org.telegram.ui.Cells.r8 r8Var = this.f26986c;
        r8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        r8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        r8Var.setScaleY(1.0f - (0.1f * f11));
        if (r8Var.getMeasuredHeight() <= 0) {
            measuredHeight = AndroidUtilities.dp(50.0f);
        } else {
            measuredHeight = r8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.z8 z8Var = this.d;
        z8Var.setAlpha(f11);
        float f12 = (-measuredHeight) * f11;
        z8Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.z8 z8Var2 = this.e;
        z8Var2.setAlpha(f10);
        z8Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.z8 z8Var = this.d;
        float alpha = z8Var.getAlpha() * z8Var.getHeight();
        org.telegram.ui.Cells.z8 z8Var2 = this.e;
        return (z8Var2.getAlpha() * z8Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.r8 r8Var = this.f26985b;
        if (r8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.l4 l4Var = this.f26984a;
            int measuredHeight = l4Var.getMeasuredHeight();
            l4Var.layout(0, 0, i15, measuredHeight);
            i14 = r8Var.getMeasuredHeight() + measuredHeight;
            r8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.r8 r8Var2 = this.f26986c;
        int measuredHeight2 = r8Var2.getMeasuredHeight() + i14;
        r8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.z8 z8Var = this.d;
        z8Var.layout(0, measuredHeight2, i16, z8Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.z8 z8Var2 = this.e;
        z8Var2.layout(0, measuredHeight2, i16, z8Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Cells.z8 z8Var;
        org.telegram.ui.Cells.z8 z8Var2;
        float measuredHeight;
        org.telegram.ui.Cells.l4 l4Var = this.f26984a;
        int i12 = this.v;
        l4Var.measure(i10, i12);
        org.telegram.ui.Cells.r8 r8Var = this.f26985b;
        r8Var.measure(i10, i12);
        org.telegram.ui.Cells.r8 r8Var2 = this.f26986c;
        r8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (r8Var.getVisibility() == 0) {
            measuredHeight = (r8Var2.getMeasuredHeight() * this.f26990s) + r8Var.getMeasuredHeight() + l4Var.getMeasuredHeight();
        } else {
            measuredHeight = r8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(z8Var.getMeasuredHeight(), z8Var2.getMeasuredHeight(), this.f26990s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z4;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f26988n = chat;
        boolean z10 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f26985b.setEnabled(z4);
        TLRPC.Chat chat2 = this.f26988n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        this.f26986c.setEnabled(z10);
    }

    public void setJoinRequest(boolean z4) {
        this.h = z4;
        this.f26986c.setChecked(z4);
    }

    public void setJoinToSend(boolean z4) {
        float f10;
        this.f26987f = z4;
        org.telegram.ui.Cells.r8 r8Var = this.f26985b;
        r8Var.setChecked(z4);
        r8Var.setDivider(this.f26987f);
        boolean z10 = this.h;
        org.telegram.ui.Cells.r8 r8Var2 = this.f26986c;
        r8Var2.setChecked(z10);
        ValueAnimator valueAnimator = this.f26989r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f26990s;
        if (this.f26987f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f26989r = ofFloat;
        ofFloat.setDuration(200L);
        this.f26989r.setInterpolator(mr.f27122f);
        this.f26989r.addUpdateListener(new j70(this, 1));
        this.f26989r.addListener(new a9(this, 25));
        r8Var2.setVisibility(0);
        this.f26989r.start();
    }
}
