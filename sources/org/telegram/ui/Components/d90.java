package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class d90 extends LinearLayout {
    public final org.telegram.ui.Cells.l4 f25624a;
    public final org.telegram.ui.Cells.w8 f25625b;
    public final org.telegram.ui.Cells.w8 f25626c;
    public final org.telegram.ui.Cells.e9 d;
    public final org.telegram.ui.Cells.e9 e;
    public boolean f25627f;
    public boolean h;
    public TLRPC.Chat f25628n;
    public ValueAnimator f25629r;
    public float f25630s;
    public final int v;

    public d90(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f25628n = chat;
        this.f25627f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z11 = true;
        setOrientation(1);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 20);
        this.f25624a = l4Var;
        l4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, l4Var, null);
        addView(l4Var);
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, 20);
        this.f25625b = w8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z12 = this.f25627f;
        w8Var.f(string, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        w8Var.setEnabled(z10);
        w8Var.setOnClickListener(new View.OnClickListener(this) {
            public final d90 f24678b;

            {
                this.f24678b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d90 d90Var = this.f24678b;
                        boolean z13 = d90Var.f25627f;
                        boolean z14 = !z13;
                        if (d90Var.b(z14, new c90(d90Var, d90Var.h, z13, 0))) {
                            d90Var.setJoinRequest(false);
                            d90Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        d90 d90Var2 = this.f24678b;
                        boolean z15 = d90Var2.h;
                        boolean z16 = !z15;
                        if (d90Var2.a(z16, new b90(d90Var2, z15, 0))) {
                            d90Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(w8Var);
        org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context, 20);
        this.f25626c = w8Var2;
        w8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        w8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        w8Var2.setEnabled(z11);
        w8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final d90 f24678b;

            {
                this.f24678b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d90 d90Var = this.f24678b;
                        boolean z13 = d90Var.f25627f;
                        boolean z14 = !z13;
                        if (d90Var.b(z14, new c90(d90Var, d90Var.h, z13, 0))) {
                            d90Var.setJoinRequest(false);
                            d90Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        d90 d90Var2 = this.f24678b;
                        boolean z15 = d90Var2.h;
                        boolean z16 = !z15;
                        if (d90Var2.a(z16, new b90(d90Var2, z15, 0))) {
                            d90Var2.setJoinRequest(z16);
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
        this.e = e9Var2;
        e9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(e9Var2);
        boolean z13 = this.f25627f;
        this.f25630s = z13 ? 1.0f : 0.0f;
        w8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f25630s);
    }

    public abstract boolean a(boolean z10, b90 b90Var);

    public boolean b(boolean z10, c90 c90Var) {
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
        this.f25624a.setVisibility(i10);
        if (z10) {
            i11 = 0;
        }
        this.f25625b.setVisibility(i11);
        if (!z10) {
            this.f25627f = true;
            this.f25626c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f7) {
        int measuredHeight;
        this.f25630s = f7;
        org.telegram.ui.Cells.w8 w8Var = this.f25626c;
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
        org.telegram.ui.Cells.e9 e9Var2 = this.e;
        e9Var2.setAlpha(f7);
        e9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.e9 e9Var = this.d;
        float alpha = e9Var.getAlpha() * e9Var.getHeight();
        org.telegram.ui.Cells.e9 e9Var2 = this.e;
        return (e9Var2.getAlpha() * e9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.w8 w8Var = this.f25625b;
        if (w8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.l4 l4Var = this.f25624a;
            int measuredHeight = l4Var.getMeasuredHeight();
            l4Var.layout(0, 0, i15, measuredHeight);
            i14 = w8Var.getMeasuredHeight() + measuredHeight;
            w8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.w8 w8Var2 = this.f25626c;
        int measuredHeight2 = w8Var2.getMeasuredHeight() + i14;
        w8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.e9 e9Var = this.d;
        e9Var.layout(0, measuredHeight2, i16, e9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.e9 e9Var2 = this.e;
        e9Var2.layout(0, measuredHeight2, i16, e9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Cells.e9 e9Var;
        org.telegram.ui.Cells.e9 e9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.l4 l4Var = this.f25624a;
        int i12 = this.v;
        l4Var.measure(i10, i12);
        org.telegram.ui.Cells.w8 w8Var = this.f25625b;
        w8Var.measure(i10, i12);
        org.telegram.ui.Cells.w8 w8Var2 = this.f25626c;
        w8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (w8Var.getVisibility() == 0) {
            measuredHeight = (w8Var2.getMeasuredHeight() * this.f25630s) + w8Var.getMeasuredHeight() + l4Var.getMeasuredHeight();
        } else {
            measuredHeight = w8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(e9Var.getMeasuredHeight(), e9Var2.getMeasuredHeight(), this.f25630s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f25628n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f25625b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f25628n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f25626c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f25626c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f7;
        this.f25627f = z10;
        org.telegram.ui.Cells.w8 w8Var = this.f25625b;
        w8Var.setChecked(z10);
        w8Var.setDivider(this.f25627f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.w8 w8Var2 = this.f25626c;
        w8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f25629r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f25630s;
        if (this.f25627f) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f25629r = ofFloat;
        ofFloat.setDuration(200L);
        this.f25629r.setInterpolator(zr.f33337f);
        this.f25629r.addUpdateListener(new b80(this, 2));
        this.f25629r.addListener(new g60(this, 3));
        w8Var2.setVisibility(0);
        this.f25629r.start();
    }
}
