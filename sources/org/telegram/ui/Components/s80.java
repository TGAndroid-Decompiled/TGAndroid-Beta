package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class s80 extends LinearLayout {
    public final org.telegram.ui.Cells.n4 f28076a;
    public final org.telegram.ui.Cells.x8 f28077b;
    public final org.telegram.ui.Cells.x8 f28078c;
    public final org.telegram.ui.Cells.f9 d;
    public final org.telegram.ui.Cells.f9 e;
    public boolean f28079f;
    public boolean h;
    public TLRPC.Chat f28080n;
    public ValueAnimator f28081r;
    public float f28082s;
    public final int v;

    public s80(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.v = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        this.f28080n = chat;
        this.f28079f = chat.join_to_send;
        this.h = chat.join_request;
        boolean z11 = true;
        setOrientation(1);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 20);
        this.f28076a = n4Var;
        n4Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinTitle));
        n4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
        addView(n4Var);
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 20);
        this.f28077b = x8Var;
        String string = LocaleController.getString(R.string.ChannelSettingsJoinToSend);
        boolean z12 = this.f28079f;
        x8Var.f(string, z12, z12);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        x8Var.setEnabled(z10);
        x8Var.setOnClickListener(new View.OnClickListener(this) {
            public final s80 f27187b;

            {
                this.f27187b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s80 s80Var = this.f27187b;
                        boolean z13 = s80Var.f28079f;
                        boolean z14 = !z13;
                        if (s80Var.b(z14, new r80(s80Var, s80Var.h, z13, 0))) {
                            s80Var.setJoinRequest(false);
                            s80Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        s80 s80Var2 = this.f27187b;
                        boolean z15 = s80Var2.h;
                        boolean z16 = !z15;
                        if (s80Var2.a(z16, new q80(s80Var2, z15, 0))) {
                            s80Var2.setJoinRequest(z16);
                            return;
                        }
                        return;
                }
            }
        });
        addView(x8Var);
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, 20);
        this.f28078c = x8Var2;
        x8Var2.f(LocaleController.getString(R.string.ChannelSettingsJoinRequest), this.h, false);
        x8Var2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        x8Var2.setEnabled(z11);
        x8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final s80 f27187b;

            {
                this.f27187b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s80 s80Var = this.f27187b;
                        boolean z13 = s80Var.f28079f;
                        boolean z14 = !z13;
                        if (s80Var.b(z14, new r80(s80Var, s80Var.h, z13, 0))) {
                            s80Var.setJoinRequest(false);
                            s80Var.setJoinToSend(z14);
                            return;
                        }
                        return;
                    default:
                        s80 s80Var2 = this.f27187b;
                        boolean z15 = s80Var2.h;
                        boolean z16 = !z15;
                        if (s80Var2.a(z16, new q80(s80Var2, z15, 0))) {
                            s80Var2.setJoinRequest(z16);
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
        boolean z13 = this.f28079f;
        this.f28082s = z13 ? 1.0f : 0.0f;
        x8Var2.setVisibility(z13 ? 0 : 8);
        d(this.f28082s);
    }

    public abstract boolean a(boolean z10, q80 q80Var);

    public boolean b(boolean z10, r80 r80Var) {
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
        this.f28076a.setVisibility(i10);
        if (z10) {
            i11 = 0;
        }
        this.f28077b.setVisibility(i11);
        if (!z10) {
            this.f28079f = true;
            this.f28078c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f7) {
        int measuredHeight;
        this.f28082s = f7;
        org.telegram.ui.Cells.x8 x8Var = this.f28078c;
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
        org.telegram.ui.Cells.x8 x8Var = this.f28077b;
        if (x8Var.getVisibility() == 0) {
            int i15 = i12 - i10;
            org.telegram.ui.Cells.n4 n4Var = this.f28076a;
            int measuredHeight = n4Var.getMeasuredHeight();
            n4Var.layout(0, 0, i15, measuredHeight);
            i14 = x8Var.getMeasuredHeight() + measuredHeight;
            x8Var.layout(0, measuredHeight, i15, i14);
        } else {
            i14 = 0;
        }
        int i16 = i12 - i10;
        org.telegram.ui.Cells.x8 x8Var2 = this.f28078c;
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
        org.telegram.ui.Cells.n4 n4Var = this.f28076a;
        int i12 = this.v;
        n4Var.measure(i10, i12);
        org.telegram.ui.Cells.x8 x8Var = this.f28077b;
        x8Var.measure(i10, i12);
        org.telegram.ui.Cells.x8 x8Var2 = this.f28078c;
        x8Var2.measure(i10, i12);
        this.d.measure(i10, i12);
        this.e.measure(i10, i12);
        if (x8Var.getVisibility() == 0) {
            measuredHeight = (x8Var2.getMeasuredHeight() * this.f28082s) + x8Var.getMeasuredHeight() + n4Var.getMeasuredHeight();
        } else {
            measuredHeight = x8Var2.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + AndroidUtilities.lerp(f9Var.getMeasuredHeight(), f9Var2.getMeasuredHeight(), this.f28082s)), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.f28080n = chat;
        boolean z11 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f28077b.setEnabled(z10);
        TLRPC.Chat chat2 = this.f28080n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z11 = false;
        }
        this.f28078c.setEnabled(z11);
    }

    public void setJoinRequest(boolean z10) {
        this.h = z10;
        this.f28078c.setChecked(z10);
    }

    public void setJoinToSend(boolean z10) {
        float f7;
        this.f28079f = z10;
        org.telegram.ui.Cells.x8 x8Var = this.f28077b;
        x8Var.setChecked(z10);
        x8Var.setDivider(this.f28079f);
        boolean z11 = this.h;
        org.telegram.ui.Cells.x8 x8Var2 = this.f28078c;
        x8Var2.setChecked(z11);
        ValueAnimator valueAnimator = this.f28081r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f28082s;
        if (this.f28079f) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f28081r = ofFloat;
        ofFloat.setDuration(200L);
        this.f28081r.setInterpolator(qr.f27642f);
        this.f28081r.addUpdateListener(new p70(this, 1));
        this.f28081r.addListener(new q8(this, 27));
        x8Var2.setVisibility(0);
        this.f28081r.start();
    }
}
