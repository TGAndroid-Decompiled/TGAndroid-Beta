package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class n80 extends LinearLayout {
    public final org.telegram.ui.Cells.m4 f29413a;
    public final org.telegram.ui.Cells.s8 f29414b;
    public final org.telegram.ui.Cells.s8 f29415c;
    public final org.telegram.ui.Cells.a9 d;
    public final org.telegram.ui.Cells.a9 f29416e;
    public boolean f29417f;
    public boolean h;
    public TLRPC.Chat f29418n;
    public ValueAnimator f29419r;
    public float f29420s;
    public final int v;

    public n80(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z4;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f29418n = chat;
        this.f29417f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z10 = true;
        setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 20);
        this.f29413a = m4Var;
        m4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        addView(m4Var);
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, 20);
        this.f29414b = s8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f29417f;
        s8Var.f(string, z11, z11);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z4 = false;
        } else {
            z4 = true;
        }
        s8Var.setEnabled(z4);
        s8Var.setOnClickListener(new View.OnClickListener(this) {
            public final n80 f28320b;

            {
                this.f28320b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n80 n80Var = this.f28320b;
                        boolean z12 = n80Var.f29417f;
                        boolean z13 = !z12;
                        if (n80Var.b(z13, new m80(n80Var, n80Var.h, z12, 0))) {
                            n80Var.setJoinRequest(false);
                            n80Var.setJoinToSend(z13);
                            return;
                        }
                        return;
                    default:
                        n80 n80Var2 = this.f28320b;
                        boolean z14 = n80Var2.h;
                        boolean z15 = !z14;
                        if (n80Var2.a(z15, new l80(n80Var2, z14, 0))) {
                            n80Var2.setJoinRequest(z15);
                            return;
                        }
                        return;
                }
            }
        });
        addView(s8Var);
        org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context, 20);
        this.f29415c = s8Var2;
        s8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        s8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        s8Var2.setEnabled(z10);
        s8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final n80 f28320b;

            {
                this.f28320b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n80 n80Var = this.f28320b;
                        boolean z12 = n80Var.f29417f;
                        boolean z13 = !z12;
                        if (n80Var.b(z13, new m80(n80Var, n80Var.h, z12, 0))) {
                            n80Var.setJoinRequest(false);
                            n80Var.setJoinToSend(z13);
                            return;
                        }
                        return;
                    default:
                        n80 n80Var2 = this.f28320b;
                        boolean z14 = n80Var2.h;
                        boolean z15 = !z14;
                        if (n80Var2.a(z15, new l80(n80Var2, z14, 0))) {
                            n80Var2.setJoinRequest(z15);
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
        this.f29416e = a9Var2;
        a9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(a9Var2);
        boolean z12 = this.f29417f;
        this.f29420s = z12 ? 1.0f : 0.0f;
        s8Var2.setVisibility(z12 ? 0 : 8);
        d(this.f29420s);
    }

    public abstract boolean a(boolean z4, l80 l80Var);

    public boolean b(boolean z4, m80 m80Var) {
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
        this.f29413a.setVisibility(i10);
        if (z4) {
            i11 = 0;
        }
        this.f29414b.setVisibility(i11);
        if (!z4) {
            this.f29417f = true;
            this.f29415c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        int measuredHeight;
        this.f29420s = f10;
        org.telegram.ui.Cells.s8 s8Var = this.f29415c;
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
        org.telegram.ui.Cells.a9 a9Var2 = this.f29416e;
        a9Var2.setAlpha(f10);
        a9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.a9 a9Var = this.d;
        float alpha = a9Var.getAlpha() * a9Var.getHeight();
        org.telegram.ui.Cells.a9 a9Var2 = this.f29416e;
        return (a9Var2.getAlpha() * a9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.s8 s8Var = this.f29414b;
        if (s8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.m4 m4Var = this.f29413a;
            int measuredHeight = m4Var.getMeasuredHeight();
            m4Var.layout(0, 0, i15, measuredHeight);
            i14 = s8Var.getMeasuredHeight() + measuredHeight;
            s8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.s8 s8Var2 = this.f29415c;
        int measuredHeight2 = s8Var2.getMeasuredHeight() + i14;
        s8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.a9 a9Var = this.d;
        a9Var.layout(0, measuredHeight2, i16, a9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.a9 a9Var2 = this.f29416e;
        a9Var2.layout(0, measuredHeight2, i16, a9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Cells.a9 a9Var;
        org.telegram.ui.Cells.a9 a9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.m4 m4Var = this.f29413a;
        int i12 = this.v;
        m4Var.measure(i10, i12);
        org.telegram.ui.Cells.s8 s8Var = this.f29414b;
        s8Var.measure(i10, i12);
        org.telegram.ui.Cells.s8 s8Var2 = this.f29415c;
        s8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.f29416e.measure(i10, i12);
        if (s8Var.getVisibility() == 0) {
            measuredHeight = (s8Var2.getMeasuredHeight() * this.f29420s) + s8Var.getMeasuredHeight() + m4Var.getMeasuredHeight();
        } else {
            measuredHeight = s8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(a9Var.getMeasuredHeight(), a9Var2.getMeasuredHeight(), this.f29420s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z4;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f29418n = chat;
        boolean z10 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f29414b.setEnabled(z4);
        TLRPC.Chat chat2 = this.f29418n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        this.f29415c.setEnabled(z10);
    }

    public void setJoinRequest(boolean z4) {
        this.h = z4;
        this.f29415c.setChecked(z4);
    }

    public void setJoinToSend(boolean z4) {
        float f10;
        this.f29417f = z4;
        org.telegram.ui.Cells.s8 s8Var = this.f29414b;
        s8Var.setChecked(z4);
        s8Var.setDivider(this.f29417f);
        boolean z10 = this.h;
        org.telegram.ui.Cells.s8 s8Var2 = this.f29415c;
        s8Var2.setChecked(z10);
        ValueAnimator valueAnimator = this.f29419r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f29420s;
        if (this.f29417f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f29419r = ofFloat;
        ofFloat.setDuration(200L);
        this.f29419r.setInterpolator(pr.f30168f);
        this.f29419r.addUpdateListener(new k70(this, 1));
        this.f29419r.addListener(new a9(this, 25));
        s8Var2.setVisibility(0);
        this.f29419r.start();
    }
}
