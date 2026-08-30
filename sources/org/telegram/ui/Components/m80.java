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
    public final org.telegram.ui.Cells.m4 f26974a;
    public final org.telegram.ui.Cells.s8 f26975b;
    public final org.telegram.ui.Cells.s8 f26976c;
    public final org.telegram.ui.Cells.a9 d;
    public final org.telegram.ui.Cells.a9 e;
    public boolean f26977f;
    public boolean h;
    public TLRPC.Chat f26978n;
    public ValueAnimator f26979r;
    public float f26980s;
    public final int v;

    public m80(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z4;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f26978n = chat;
        this.f26977f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z10 = true;
        setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 20);
        this.f26974a = m4Var;
        m4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        addView(m4Var);
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, 20);
        this.f26975b = s8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f26977f;
        s8Var.f(string, z11, z11);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z4 = false;
        } else {
            z4 = true;
        }
        s8Var.setEnabled(z4);
        s8Var.setOnClickListener(new View.OnClickListener(this) {
            public final m80 f25933b;

            {
                this.f25933b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m80 m80Var = this.f25933b;
                        boolean z12 = m80Var.f26977f;
                        boolean z13 = !z12;
                        if (m80Var.b(z13, new l80(m80Var, m80Var.h, z12, 0))) {
                            m80Var.setJoinRequest(false);
                            m80Var.setJoinToSend(z13);
                            return;
                        }
                        return;
                    default:
                        m80 m80Var2 = this.f25933b;
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
        addView(s8Var);
        org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context, 20);
        this.f26976c = s8Var2;
        s8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        s8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        s8Var2.setEnabled(z10);
        s8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final m80 f25933b;

            {
                this.f25933b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m80 m80Var = this.f25933b;
                        boolean z12 = m80Var.f26977f;
                        boolean z13 = !z12;
                        if (m80Var.b(z13, new l80(m80Var, m80Var.h, z12, 0))) {
                            m80Var.setJoinRequest(false);
                            m80Var.setJoinToSend(z13);
                            return;
                        }
                        return;
                    default:
                        m80 m80Var2 = this.f25933b;
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
        addView(s8Var2);
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 12, null);
        this.d = a9Var;
        a9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(a9Var);
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, 12, null);
        this.e = a9Var2;
        a9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(a9Var2);
        boolean z12 = this.f26977f;
        this.f26980s = z12 ? 1.0f : 0.0f;
        s8Var2.setVisibility(z12 ? 0 : 8);
        d(this.f26980s);
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
        this.f26974a.setVisibility(i10);
        if (z4) {
            i11 = 0;
        }
        this.f26975b.setVisibility(i11);
        if (!z4) {
            this.f26977f = true;
            this.f26976c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        int measuredHeight;
        this.f26980s = f10;
        org.telegram.ui.Cells.s8 s8Var = this.f26976c;
        s8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        s8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        s8Var.setScaleY(1.0f - (0.1f * f11));
        if (s8Var.getMeasuredHeight() <= 0) {
            measuredHeight = AndroidUtilities.dp(50.0f);
        } else {
            measuredHeight = s8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.a9 a9Var = this.d;
        a9Var.setAlpha(f11);
        float f12 = (-measuredHeight) * f11;
        a9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.a9 a9Var2 = this.e;
        a9Var2.setAlpha(f10);
        a9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.a9 a9Var = this.d;
        float alpha = a9Var.getAlpha() * a9Var.getHeight();
        org.telegram.ui.Cells.a9 a9Var2 = this.e;
        return (a9Var2.getAlpha() * a9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.s8 s8Var = this.f26975b;
        if (s8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.m4 m4Var = this.f26974a;
            int measuredHeight = m4Var.getMeasuredHeight();
            m4Var.layout(0, 0, i15, measuredHeight);
            i14 = s8Var.getMeasuredHeight() + measuredHeight;
            s8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.s8 s8Var2 = this.f26976c;
        int measuredHeight2 = s8Var2.getMeasuredHeight() + i14;
        s8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.a9 a9Var = this.d;
        a9Var.layout(0, measuredHeight2, i16, a9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.a9 a9Var2 = this.e;
        a9Var2.layout(0, measuredHeight2, i16, a9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Cells.a9 a9Var;
        org.telegram.ui.Cells.a9 a9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.m4 m4Var = this.f26974a;
        int i12 = this.v;
        m4Var.measure(i10, i12);
        org.telegram.ui.Cells.s8 s8Var = this.f26975b;
        s8Var.measure(i10, i12);
        org.telegram.ui.Cells.s8 s8Var2 = this.f26976c;
        s8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (s8Var.getVisibility() == 0) {
            measuredHeight = (s8Var2.getMeasuredHeight() * this.f26980s) + s8Var.getMeasuredHeight() + m4Var.getMeasuredHeight();
        } else {
            measuredHeight = s8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(a9Var.getMeasuredHeight(), a9Var2.getMeasuredHeight(), this.f26980s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z4;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f26978n = chat;
        boolean z10 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f26975b.setEnabled(z4);
        TLRPC.Chat chat2 = this.f26978n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        this.f26976c.setEnabled(z10);
    }

    public void setJoinRequest(boolean z4) {
        this.h = z4;
        this.f26976c.setChecked(z4);
    }

    public void setJoinToSend(boolean z4) {
        float f10;
        this.f26977f = z4;
        org.telegram.ui.Cells.s8 s8Var = this.f26975b;
        s8Var.setChecked(z4);
        s8Var.setDivider(this.f26977f);
        boolean z10 = this.h;
        org.telegram.ui.Cells.s8 s8Var2 = this.f26976c;
        s8Var2.setChecked(z10);
        ValueAnimator valueAnimator = this.f26979r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f26980s;
        if (this.f26977f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f26979r = ofFloat;
        ofFloat.setDuration(200L);
        this.f26979r.setInterpolator(nr.f27346f);
        this.f26979r.addUpdateListener(new i70(this, 1));
        this.f26979r.addListener(new a9(this, 25));
        s8Var2.setVisibility(0);
        this.f26979r.start();
    }
}
