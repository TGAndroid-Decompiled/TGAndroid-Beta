package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class g90 extends LinearLayout {
    public final org.telegram.ui.Cells.q4 f28499a;
    public final org.telegram.ui.Cells.a9 f28500b;
    public final org.telegram.ui.Cells.a9 f28501c;
    public final org.telegram.ui.Cells.i9 d;
    public final org.telegram.ui.Cells.i9 e;
    public boolean f28502f;
    public boolean h;
    public TLRPC.Chat f28503n;
    public ValueAnimator f28504r;
    public float f28505s;
    public final int v;

    public g90(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f28503n = chat;
        this.f28502f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z11 = true;
        setOrientation(1);
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, 20);
        this.f28499a = q4Var;
        q4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, q4Var, null);
        addView(q4Var);
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 20);
        this.f28500b = a9Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z12 = this.f28502f;
        a9Var.f(string, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        a9Var.setEnabled(z10);
        a9Var.setOnClickListener(new View.OnClickListener(this) {
            public final g90 f27438b;

            {
                this.f27438b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g90 g90Var = this.f27438b;
                        boolean z13 = g90Var.f28502f;
                        boolean z14 = !z13;
                        if (g90Var.b(z14, new f90(g90Var, g90Var.h, z13, 0))) {
                            g90Var.setJoinRequest(false);
                            g90Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        g90 g90Var2 = this.f27438b;
                        boolean z15 = g90Var2.h;
                        boolean z16 = !z15;
                        if (g90Var2.a(z16, new e90(g90Var2, z15, 0))) {
                            g90Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(a9Var);
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, 20);
        this.f28501c = a9Var2;
        a9Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        a9Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        a9Var2.setEnabled(z11);
        a9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g90 f27438b;

            {
                this.f27438b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g90 g90Var = this.f27438b;
                        boolean z13 = g90Var.f28502f;
                        boolean z14 = !z13;
                        if (g90Var.b(z14, new f90(g90Var, g90Var.h, z13, 0))) {
                            g90Var.setJoinRequest(false);
                            g90Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        g90 g90Var2 = this.f27438b;
                        boolean z15 = g90Var2.h;
                        boolean z16 = !z15;
                        if (g90Var2.a(z16, new e90(g90Var2, z15, 0))) {
                            g90Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(a9Var2);
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 12, null);
        this.d = i9Var;
        i9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(i9Var);
        org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context, 12, null);
        this.e = i9Var2;
        i9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(i9Var2);
        boolean z13 = this.f28502f;
        this.f28505s = z13 ? 1.0f : 0.0f;
        a9Var2.setVisibility(z13 ? 0 : 8);
        d(this.f28505s);
    }

    public abstract boolean a(boolean z10, e90 e90Var);

    public boolean b(boolean z10, f90 f90Var) {
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
        this.f28499a.setVisibility(i10);
        if (z10) {
            i11 = 0;
        }
        this.f28500b.setVisibility(i11);
        if (!z10) {
            this.f28502f = true;
            this.f28501c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f7) {
        int measuredHeight;
        this.f28505s = f7;
        org.telegram.ui.Cells.a9 a9Var = this.f28501c;
        a9Var.setAlpha(f7);
        float f10 = 1.0f - f7;
        a9Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        a9Var.setScaleY(1.0f - (0.1f * f10));
        if (a9Var.getMeasuredHeight() <= 0) {
            measuredHeight = AndroidUtilities.dp(50.0f);
        } else {
            measuredHeight = a9Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.i9 i9Var = this.d;
        i9Var.setAlpha(f10);
        float f11 = (-measuredHeight) * f10;
        i9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f7) + f11);
        org.telegram.ui.Cells.i9 i9Var2 = this.e;
        i9Var2.setAlpha(f7);
        i9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.i9 i9Var = this.d;
        float alpha = i9Var.getAlpha() * i9Var.getHeight();
        org.telegram.ui.Cells.i9 i9Var2 = this.e;
        return (i9Var2.getAlpha() * i9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.a9 a9Var = this.f28500b;
        if (a9Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.q4 q4Var = this.f28499a;
            int measuredHeight = q4Var.getMeasuredHeight();
            q4Var.layout(0, 0, i15, measuredHeight);
            i14 = a9Var.getMeasuredHeight() + measuredHeight;
            a9Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.a9 a9Var2 = this.f28501c;
        int measuredHeight2 = a9Var2.getMeasuredHeight() + i14;
        a9Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.i9 i9Var = this.d;
        i9Var.layout(0, measuredHeight2, i16, i9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.i9 i9Var2 = this.e;
        i9Var2.layout(0, measuredHeight2, i16, i9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Cells.i9 i9Var;
        org.telegram.ui.Cells.i9 i9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.q4 q4Var = this.f28499a;
        int i12 = this.v;
        q4Var.measure(i10, i12);
        org.telegram.ui.Cells.a9 a9Var = this.f28500b;
        a9Var.measure(i10, i12);
        org.telegram.ui.Cells.a9 a9Var2 = this.f28501c;
        a9Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (a9Var.getVisibility() == 0) {
            measuredHeight = (a9Var2.getMeasuredHeight() * this.f28505s) + a9Var.getMeasuredHeight() + q4Var.getMeasuredHeight();
        } else {
            measuredHeight = a9Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(i9Var.getMeasuredHeight(), i9Var2.getMeasuredHeight(), this.f28505s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f28503n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f28500b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f28503n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f28501c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f28501c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f7;
        this.f28502f = z10;
        org.telegram.ui.Cells.a9 a9Var = this.f28500b;
        a9Var.setChecked(z10);
        a9Var.setDivider(this.f28502f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.a9 a9Var2 = this.f28501c;
        a9Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f28504r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f28505s;
        if (this.f28502f) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f28504r = ofFloat;
        ofFloat.setDuration(200L);
        this.f28504r.setInterpolator(ds.f27584f);
        this.f28504r.addUpdateListener(new e80(this, 2));
        this.f28504r.addListener(new i10(this, 4));
        a9Var2.setVisibility(0);
        this.f28504r.start();
    }
}
