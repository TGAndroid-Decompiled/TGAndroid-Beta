package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class q90 extends LinearLayout {
    public final org.telegram.ui.Cells.m4 f29776a;
    public final org.telegram.ui.Cells.w8 f29777b;
    public final org.telegram.ui.Cells.w8 f29778c;
    public final org.telegram.ui.Cells.e9 d;
    public final org.telegram.ui.Cells.e9 f29779e;
    public boolean f29780f;
    public boolean h;
    public TLRPC.Chat f29781n;
    public ValueAnimator f29782r;
    public float f29783s;
    public final int v;

    public q90(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f29781n = chat;
        this.f29780f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z11 = true;
        setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 20);
        this.f29776a = m4Var;
        m4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
        addView(m4Var);
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, 20);
        this.f29777b = w8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z12 = this.f29780f;
        w8Var.f(string, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        w8Var.setEnabled(z10);
        w8Var.setOnClickListener(new View.OnClickListener(this) {
            public final q90 f28749b;

            {
                this.f28749b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q90 q90Var = this.f28749b;
                        boolean z13 = q90Var.f29780f;
                        boolean z14 = !z13;
                        if (q90Var.b(z14, new p90(q90Var, q90Var.h, z13, 0))) {
                            q90Var.setJoinRequest(false);
                            q90Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        q90 q90Var2 = this.f28749b;
                        boolean z15 = q90Var2.h;
                        boolean z16 = !z15;
                        if (q90Var2.a(z16, new o90(q90Var2, z15, 0))) {
                            q90Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(w8Var);
        org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context, 20);
        this.f29778c = w8Var2;
        w8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        w8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        w8Var2.setEnabled(z11);
        w8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final q90 f28749b;

            {
                this.f28749b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q90 q90Var = this.f28749b;
                        boolean z13 = q90Var.f29780f;
                        boolean z14 = !z13;
                        if (q90Var.b(z14, new p90(q90Var, q90Var.h, z13, 0))) {
                            q90Var.setJoinRequest(false);
                            q90Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        q90 q90Var2 = this.f28749b;
                        boolean z15 = q90Var2.h;
                        boolean z16 = !z15;
                        if (q90Var2.a(z16, new o90(q90Var2, z15, 0))) {
                            q90Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(w8Var2);
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, null);
        this.d = e9Var;
        e9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(e9Var);
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, null);
        this.f29779e = e9Var2;
        e9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(e9Var2);
        boolean z13 = this.f29780f;
        this.f29783s = z13 ? 1.0f : 0.0f;
        w8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f29783s);
    }

    public abstract boolean a(boolean z10, o90 o90Var);

    public boolean b(boolean z10, p90 p90Var) {
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
        this.f29776a.setVisibility(i10);
        if (z10) {
            i11 = 0;
        }
        this.f29777b.setVisibility(i11);
        if (!z10) {
            this.f29780f = true;
            this.f29778c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f7) {
        int measuredHeight;
        this.f29783s = f7;
        org.telegram.ui.Cells.w8 w8Var = this.f29778c;
        w8Var.setAlpha(f7);
        float f10 = 1.0f - f7;
        w8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        w8Var.setScaleY(1.0f - (0.1f * f10));
        if (w8Var.getMeasuredHeight() <= 0) {
            measuredHeight = AndroidUtilities.dp(50.0f);
        } else {
            measuredHeight = w8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.e9 e9Var = this.d;
        e9Var.setAlpha(f10);
        float f11 = (-measuredHeight) * f10;
        e9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f7) + f11);
        org.telegram.ui.Cells.e9 e9Var2 = this.f29779e;
        e9Var2.setAlpha(f7);
        e9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.e9 e9Var = this.d;
        float alpha = e9Var.getAlpha() * e9Var.getHeight();
        org.telegram.ui.Cells.e9 e9Var2 = this.f29779e;
        return (e9Var2.getAlpha() * e9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.w8 w8Var = this.f29777b;
        if (w8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.m4 m4Var = this.f29776a;
            int measuredHeight = m4Var.getMeasuredHeight();
            m4Var.layout(0, 0, i15, measuredHeight);
            i14 = w8Var.getMeasuredHeight() + measuredHeight;
            w8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.w8 w8Var2 = this.f29778c;
        int measuredHeight2 = w8Var2.getMeasuredHeight() + i14;
        w8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.e9 e9Var = this.d;
        e9Var.layout(0, measuredHeight2, i16, e9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.e9 e9Var2 = this.f29779e;
        e9Var2.layout(0, measuredHeight2, i16, e9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Cells.e9 e9Var;
        org.telegram.ui.Cells.e9 e9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.m4 m4Var = this.f29776a;
        int i12 = this.v;
        m4Var.measure(i10, i12);
        org.telegram.ui.Cells.w8 w8Var = this.f29777b;
        w8Var.measure(i10, i12);
        org.telegram.ui.Cells.w8 w8Var2 = this.f29778c;
        w8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.f29779e.measure(i10, i12);
        if (w8Var.getVisibility() == 0) {
            measuredHeight = (w8Var2.getMeasuredHeight() * this.f29783s) + w8Var.getMeasuredHeight() + m4Var.getMeasuredHeight();
        } else {
            measuredHeight = w8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(e9Var.getMeasuredHeight(), e9Var2.getMeasuredHeight(), this.f29783s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f29781n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f29777b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f29781n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f29778c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f29778c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f7;
        this.f29780f = z10;
        org.telegram.ui.Cells.w8 w8Var = this.f29777b;
        w8Var.setChecked(z10);
        w8Var.setDivider(this.f29780f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.w8 w8Var2 = this.f29778c;
        w8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f29782r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f29783s;
        if (this.f29780f) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f29782r = ofFloat;
        ofFloat.setDuration(200L);
        this.f29782r.setInterpolator(js.f27634f);
        this.f29782r.addUpdateListener(new m80(this, 2));
        this.f29782r.addListener(new t8(this, 27));
        w8Var2.setVisibility(0);
        this.f29782r.start();
    }
}
