package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class e90 extends LinearLayout {
    public final org.telegram.ui.Cells.l4 f25893a;
    public final org.telegram.ui.Cells.v8 f25894b;
    public final org.telegram.ui.Cells.v8 f25895c;
    public final org.telegram.ui.Cells.d9 d;
    public final org.telegram.ui.Cells.d9 e;
    public boolean f25896f;
    public boolean h;
    public TLRPC.Chat f25897n;
    public ValueAnimator f25898r;
    public float f25899s;
    public final int v;

    public e90(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f25897n = chat;
        this.f25896f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z11 = true;
        setOrientation(1);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 20);
        this.f25893a = l4Var;
        l4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
        addView(l4Var);
        org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context, 20);
        this.f25894b = v8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z12 = this.f25896f;
        v8Var.f(string, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        v8Var.setEnabled(z10);
        v8Var.setOnClickListener(new View.OnClickListener(this) {
            public final e90 f24850b;

            {
                this.f24850b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e90 e90Var = this.f24850b;
                        boolean z13 = e90Var.f25896f;
                        boolean z14 = !z13;
                        if (e90Var.b(z14, new d90(e90Var, e90Var.h, z13, 0))) {
                            e90Var.setJoinRequest(false);
                            e90Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        e90 e90Var2 = this.f24850b;
                        boolean z15 = e90Var2.h;
                        boolean z16 = !z15;
                        if (e90Var2.a(z16, new c90(e90Var2, z15, 0))) {
                            e90Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(v8Var);
        org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(context, 20);
        this.f25895c = v8Var2;
        v8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        v8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        v8Var2.setEnabled(z11);
        v8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final e90 f24850b;

            {
                this.f24850b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e90 e90Var = this.f24850b;
                        boolean z13 = e90Var.f25896f;
                        boolean z14 = !z13;
                        if (e90Var.b(z14, new d90(e90Var, e90Var.h, z13, 0))) {
                            e90Var.setJoinRequest(false);
                            e90Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        e90 e90Var2 = this.f24850b;
                        boolean z15 = e90Var2.h;
                        boolean z16 = !z15;
                        if (e90Var2.a(z16, new c90(e90Var2, z15, 0))) {
                            e90Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(v8Var2);
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, 12, null);
        this.d = d9Var;
        d9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(d9Var);
        org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context, 12, null);
        this.e = d9Var2;
        d9Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(d9Var2);
        boolean z13 = this.f25896f;
        this.f25899s = z13 ? 1.0f : 0.0f;
        v8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f25899s);
    }

    public abstract boolean a(boolean z10, c90 c90Var);

    public boolean b(boolean z10, d90 d90Var) {
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
        this.f25893a.setVisibility(i10);
        if (z10) {
            i11 = 0;
        }
        this.f25894b.setVisibility(i11);
        if (!z10) {
            this.f25896f = true;
            this.f25895c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f7) {
        int measuredHeight;
        this.f25899s = f7;
        org.telegram.ui.Cells.v8 v8Var = this.f25895c;
        v8Var.setAlpha(f7);
        float f10 = 1.0f - f7;
        v8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        v8Var.setScaleY(1.0f - (0.1f * f10));
        if (v8Var.getMeasuredHeight() <= 0) {
            measuredHeight = AndroidUtilities.dp(50.0f);
        } else {
            measuredHeight = v8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.d9 d9Var = this.d;
        d9Var.setAlpha(f10);
        float f11 = (-measuredHeight) * f10;
        d9Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f7) + f11);
        org.telegram.ui.Cells.d9 d9Var2 = this.e;
        d9Var2.setAlpha(f7);
        d9Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.d9 d9Var = this.d;
        float alpha = d9Var.getAlpha() * d9Var.getHeight();
        org.telegram.ui.Cells.d9 d9Var2 = this.e;
        return (d9Var2.getAlpha() * d9Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.v8 v8Var = this.f25894b;
        if (v8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.l4 l4Var = this.f25893a;
            int measuredHeight = l4Var.getMeasuredHeight();
            l4Var.layout(0, 0, i15, measuredHeight);
            i14 = v8Var.getMeasuredHeight() + measuredHeight;
            v8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.v8 v8Var2 = this.f25895c;
        int measuredHeight2 = v8Var2.getMeasuredHeight() + i14;
        v8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.d9 d9Var = this.d;
        d9Var.layout(0, measuredHeight2, i16, d9Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.d9 d9Var2 = this.e;
        d9Var2.layout(0, measuredHeight2, i16, d9Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Cells.d9 d9Var;
        org.telegram.ui.Cells.d9 d9Var2;
        float measuredHeight;
        org.telegram.ui.Cells.l4 l4Var = this.f25893a;
        int i12 = this.v;
        l4Var.measure(i10, i12);
        org.telegram.ui.Cells.v8 v8Var = this.f25894b;
        v8Var.measure(i10, i12);
        org.telegram.ui.Cells.v8 v8Var2 = this.f25895c;
        v8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (v8Var.getVisibility() == 0) {
            measuredHeight = (v8Var2.getMeasuredHeight() * this.f25899s) + v8Var.getMeasuredHeight() + l4Var.getMeasuredHeight();
        } else {
            measuredHeight = v8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(d9Var.getMeasuredHeight(), d9Var2.getMeasuredHeight(), this.f25899s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f25897n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f25894b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f25897n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f25895c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f25895c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f7;
        this.f25896f = z10;
        org.telegram.ui.Cells.v8 v8Var = this.f25894b;
        v8Var.setChecked(z10);
        v8Var.setDivider(this.f25896f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.v8 v8Var2 = this.f25895c;
        v8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f25898r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f25899s;
        if (this.f25896f) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f25898r = ofFloat;
        ofFloat.setDuration(200L);
        this.f25898r.setInterpolator(bs.f25037f);
        this.f25898r.addUpdateListener(new b80(this, 2));
        this.f25898r.addListener(new c80(this, 2));
        v8Var2.setVisibility(0);
        this.f25898r.start();
    }
}
