package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class g80 extends LinearLayout {
    public final org.telegram.ui.Cells.k4 f28811a;
    public final org.telegram.ui.Cells.q8 f28812b;
    public final org.telegram.ui.Cells.q8 f28813c;
    public final org.telegram.ui.Cells.y8 d;
    public final org.telegram.ui.Cells.y8 f28814e;
    public boolean f28815f;
    public boolean h;
    public TLRPC.Chat f28816n;
    public ValueAnimator f28817r;
    public float f28818s;
    public final int v;

    public g80(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f28816n = chat;
        this.f28815f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z11 = true;
        setOrientation(1);
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, 20);
        this.f28811a = k4Var;
        k4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        addView(k4Var);
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context, 20);
        this.f28812b = q8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z12 = this.f28815f;
        q8Var.f(string, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        q8Var.setEnabled(z10);
        q8Var.setOnClickListener(new View.OnClickListener(this) {
            public final g80 f27704b;

            {
                this.f27704b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g80 g80Var = this.f27704b;
                        boolean z13 = g80Var.f28815f;
                        boolean z14 = !z13;
                        if (g80Var.b(z14, new f80(g80Var, g80Var.h, z13, 0))) {
                            g80Var.setJoinRequest(false);
                            g80Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        g80 g80Var2 = this.f27704b;
                        boolean z15 = g80Var2.h;
                        boolean z16 = !z15;
                        if (g80Var2.a(z16, new e80(g80Var2, z15, 0))) {
                            g80Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(q8Var);
        org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context, 20);
        this.f28813c = q8Var2;
        q8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        q8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        q8Var2.setEnabled(z11);
        q8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final g80 f27704b;

            {
                this.f27704b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g80 g80Var = this.f27704b;
                        boolean z13 = g80Var.f28815f;
                        boolean z14 = !z13;
                        if (g80Var.b(z14, new f80(g80Var, g80Var.h, z13, 0))) {
                            g80Var.setJoinRequest(false);
                            g80Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        g80 g80Var2 = this.f27704b;
                        boolean z15 = g80Var2.h;
                        boolean z16 = !z15;
                        if (g80Var2.a(z16, new e80(g80Var2, z15, 0))) {
                            g80Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(q8Var2);
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 12, null);
        this.d = y8Var;
        y8Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinToSendInfo));
        addView(y8Var);
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context, 12, null);
        this.f28814e = y8Var2;
        y8Var2.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
        addView(y8Var2);
        boolean z13 = this.f28815f;
        this.f28818s = z13 ? 1.0f : 0.0f;
        q8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f28818s);
    }

    public abstract boolean a(boolean z10, e80 e80Var);

    public boolean b(boolean z10, f80 f80Var) {
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
        this.f28811a.setVisibility(i10);
        if (z10) {
            i11 = 0;
        }
        this.f28812b.setVisibility(i11);
        if (!z10) {
            this.f28815f = true;
            this.f28813c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f9) {
        int measuredHeight;
        this.f28818s = f9;
        org.telegram.ui.Cells.q8 q8Var = this.f28813c;
        q8Var.setAlpha(f9);
        float f10 = 1.0f - f9;
        q8Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        q8Var.setScaleY(1.0f - (0.1f * f10));
        if (q8Var.getMeasuredHeight() <= 0) {
            measuredHeight = AndroidUtilities.dp(50.0f);
        } else {
            measuredHeight = q8Var.getMeasuredHeight();
        }
        org.telegram.ui.Cells.y8 y8Var = this.d;
        y8Var.setAlpha(f10);
        float f11 = (-measuredHeight) * f10;
        y8Var.setTranslationY(((-AndroidUtilities.dp(4.0f)) * f9) + f11);
        org.telegram.ui.Cells.y8 y8Var2 = this.f28814e;
        y8Var2.setAlpha(f9);
        y8Var2.setTranslationY((AndroidUtilities.dp(4.0f) * f10) + f11);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        org.telegram.ui.Cells.y8 y8Var = this.d;
        float alpha = y8Var.getAlpha() * y8Var.getHeight();
        org.telegram.ui.Cells.y8 y8Var2 = this.f28814e;
        return (y8Var2.getAlpha() * y8Var2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        org.telegram.ui.Cells.q8 q8Var = this.f28812b;
        if (q8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.k4 k4Var = this.f28811a;
            int measuredHeight = k4Var.getMeasuredHeight();
            k4Var.layout(0, 0, i15, measuredHeight);
            i14 = q8Var.getMeasuredHeight() + measuredHeight;
            q8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.q8 q8Var2 = this.f28813c;
        int measuredHeight2 = q8Var2.getMeasuredHeight() + i14;
        q8Var2.layout(0, i14, i16, measuredHeight2);
        org.telegram.ui.Cells.y8 y8Var = this.d;
        y8Var.layout(0, measuredHeight2, i16, y8Var.getMeasuredHeight() + measuredHeight2);
        org.telegram.ui.Cells.y8 y8Var2 = this.f28814e;
        y8Var2.layout(0, measuredHeight2, i16, y8Var2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Cells.y8 y8Var;
        org.telegram.ui.Cells.y8 y8Var2;
        float measuredHeight;
        org.telegram.ui.Cells.k4 k4Var = this.f28811a;
        int i12 = this.v;
        k4Var.measure(i10, i12);
        org.telegram.ui.Cells.q8 q8Var = this.f28812b;
        q8Var.measure(i10, i12);
        org.telegram.ui.Cells.q8 q8Var2 = this.f28813c;
        q8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.f28814e.measure(i10, i12);
        if (q8Var.getVisibility() == 0) {
            measuredHeight = (q8Var2.getMeasuredHeight() * this.f28818s) + q8Var.getMeasuredHeight() + k4Var.getMeasuredHeight();
        } else {
            measuredHeight = q8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(y8Var.getMeasuredHeight(), y8Var2.getMeasuredHeight(), this.f28818s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f28816n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f28812b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f28816n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f28813c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f28813c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f9;
        this.f28815f = z10;
        org.telegram.ui.Cells.q8 q8Var = this.f28812b;
        q8Var.setChecked(z10);
        q8Var.setDivider(this.f28815f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.q8 q8Var2 = this.f28813c;
        q8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f28817r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f28818s;
        if (this.f28815f) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.f28817r = ofFloat;
        ofFloat.setDuration(200L);
        this.f28817r.setInterpolator(jr.f29800f);
        this.f28817r.addUpdateListener(new d70(this, 1));
        this.f28817r.addListener(new zz(this, 4));
        q8Var2.setVisibility(0);
        this.f28817r.start();
    }
}
