package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public abstract class x70 extends LinearLayout {

    public final org.telegram.ui.Cells.j4 f34528a;

    public final org.telegram.ui.Cells.p8 f34529b;

    public final org.telegram.ui.Cells.p8 f34530c;
    public final org.telegram.ui.Cells.x8 d;

    public final org.telegram.ui.Cells.x8 f34531e;

    public boolean f34532f;
    public boolean h;

    public TLRPC.Chat f34533n;

    public ValueAnimator f34534r;

    public float f34535s;
    public final int v;

    public x70(Context context, TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        super(context);
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f34533n = chat;
        this.f34532f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z10 = true;
        setOrientation(1);
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, 20);
        this.f34528a = j4Var;
        j4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        addView(j4Var);
        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, 20);
        this.f34529b = p8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z11 = this.f34532f;
        p8Var.f(string, z11, z11);
        p8Var.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        final int i10 = 0;
        p8Var.setOnClickListener(new View.OnClickListener(this) {

            public final x70 f33000b;

            {
                this.f33000b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        x70 x70Var = this.f33000b;
                        boolean z12 = x70Var.f34532f;
                        boolean z13 = !z12;
                        if (x70Var.b(z13, new w70(x70Var, x70Var.h, z12, 0))) {
                            x70Var.setJoinRequest(false);
                            x70Var.setJoinToSend(z13);
                        }
                        break;
                    default:
                        x70 x70Var2 = this.f33000b;
                        boolean z14 = x70Var2.h;
                        boolean z15 = !z14;
                        if (x70Var2.a(z15, new v70(x70Var2, z14, 0))) {
                            x70Var2.setJoinRequest(z15);
                        }
                        break;
                }
            }
        });
        addView(p8Var);
        org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context, 20);
        this.f34530c = p8Var2;
        p8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        p8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        p8Var2.setEnabled(z10);
        final int i11 = 1;
        p8Var2.setOnClickListener(new View.OnClickListener(this) {

            public final x70 f33000b;

            {
                this.f33000b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        x70 x70Var = this.f33000b;
                        boolean z12 = x70Var.f34532f;
                        boolean z13 = !z12;
                        if (x70Var.b(z13, new w70(x70Var, x70Var.h, z12, 0))) {
                            x70Var.setJoinRequest(false);
                            x70Var.setJoinToSend(z13);
                        }
                        break;
                    default:
                        x70 x70Var2 = this.f33000b;
                        boolean z14 = x70Var2.h;
                        boolean z15 = !z14;
                        if (x70Var2.a(z15, new v70(x70Var2, z14, 0))) {
                            x70Var2.setJoinRequest(z15);
                        }
                        break;
                }
            }
        });
        addView(p8Var2);
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 12, null);
        this.d = x8Var;
        x8Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(x8Var);
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, 12, null);
        this.f34531e = x8Var2;
        x8Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(x8Var2);
        boolean z12 = this.f34532f;
        this.f34535s = z12 ? 1.0f : 0.0f;
        p8Var2.setVisibility(z12 ? 0 : 8);
        d(this.f34535s);
    }

    public abstract boolean a(boolean z10, v70 v70Var);

    public boolean b(boolean z10, w70 w70Var) {
        return true;
    }

    public final void c(boolean z10) {
        this.f34528a.setVisibility(z10 ? 0 : 8);
        this.f34529b.setVisibility(z10 ? 0 : 8);
        if (!z10) {
            this.f34532f = true;
            this.f34530c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f10) {
        this.f34535s = f10;
        org.telegram.ui.Cells.p8 p8Var = this.f34530c;
        p8Var.setAlpha(f10);
        float f11 = 1.0f - f10;
        p8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        p8Var.setScaleY(1.0f - (0.1f * f11));
        int iDp = p8Var.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(50.0f) : p8Var.getMeasuredHeight();
        org.telegram.ui.Cells.x8 x8Var = this.d;
        x8Var.setAlpha(f11);
        float f12 = (-iDp) * f11;
        x8Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f10) + f12);
        org.telegram.ui.Cells.x8 x8Var2 = this.f34531e;
        x8Var2.setAlpha(f10);
        x8Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f11) + f12);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.x8 x8Var = this.d;
        float alpha = x8Var.getAlpha() * x8Var.getHeight();
        org.telegram.ui.Cells.x8 x8Var2 = this.f34531e;
        return (x8Var2.getAlpha() * x8Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        org.telegram.ui.Cells.p8 p8Var = this.f34529b;
        if (p8Var.getVisibility() == 0) {
            int i14 = i12 - i10;
            org.telegram.ui.Cells.j4 j4Var = this.f34528a;
            int measuredHeight2 = j4Var.getMeasuredHeight();
            j4Var.layout(0, 0, i14, measuredHeight2);
            measuredHeight = p8Var.getMeasuredHeight() + measuredHeight2;
            p8Var.layout(0, measuredHeight2, i14, measuredHeight);
        } else {
            measuredHeight = 0;
        }
        int i15 = i12 - i10;
        org.telegram.ui.Cells.p8 p8Var2 = this.f34530c;
        int measuredHeight3 = p8Var2.getMeasuredHeight() + measuredHeight;
        p8Var2.layout(0, measuredHeight, i15, measuredHeight3);
        org.telegram.ui.Cells.x8 x8Var = this.d;
        x8Var.layout(0, measuredHeight3, i15, x8Var.getMeasuredHeight() + measuredHeight3);
        org.telegram.ui.Cells.x8 x8Var2 = this.f34531e;
        x8Var2.layout(0, measuredHeight3, i15, x8Var2.getMeasuredHeight() + measuredHeight3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float measuredHeight;
        org.telegram.ui.Cells.j4 j4Var = this.f34528a;
        int i12 = this.v;
        j4Var.measure(i10, i12);
        org.telegram.ui.Cells.p8 p8Var = this.f34529b;
        p8Var.measure(i10, i12);
        org.telegram.ui.Cells.p8 p8Var2 = this.f34530c;
        p8Var2.measure(i10, i12);
        org.telegram.ui.Cells.x8 x8Var = this.d;
        x8Var.measure(i10, i12);
        org.telegram.ui.Cells.x8 x8Var2 = this.f34531e;
        x8Var2.measure(i10, i12);
        if (p8Var.getVisibility() == 0) {
            measuredHeight = (p8Var2.getMeasuredHeight() * this.f34535s) + p8Var.getMeasuredHeight() + j4Var.getMeasuredHeight();
        } else {
            measuredHeight = p8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(x8Var.getMeasuredHeight(), x8Var2.getMeasuredHeight(), this.f34535s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f34533n = chat;
        boolean z10 = true;
        this.f34529b.setEnabled(chat.creator || ((tL_chatAdminRights2 = chat.admin_rights) != null && tL_chatAdminRights2.ban_users));
        TLRPC.Chat chat2 = this.f34533n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z10 = false;
        }
        this.f34530c.setEnabled(z10);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f34530c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        this.f34532f = z10;
        org.telegram.ui.Cells.p8 p8Var = this.f34529b;
        p8Var.setChecked(z10);
        p8Var.setDivider(this.f34532f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.p8 p8Var2 = this.f34530c;
        p8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f34534r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f34535s, this.f34532f ? 1.0f : 0.0f);
        this.f34534r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f34534r.setInterpolator(er.f28122f);
        this.f34534r.addUpdateListener(new v60(this, 1));
        this.f34534r.addListener(new sz(this, 4));
        p8Var2.setVisibility(0);
        this.f34534r.start();
    }
}
