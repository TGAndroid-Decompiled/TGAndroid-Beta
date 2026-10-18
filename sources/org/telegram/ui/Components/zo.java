package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class zo {
    public final org.telegram.ui.ActionBar.e1 f32973a;
    public final org.telegram.ui.ActionBar.e1 f32974b;
    public final org.telegram.ui.ActionBar.e1 f32975c;
    public final org.telegram.ui.ActionBar.e1 d;
    public final org.telegram.ui.ActionBar.e1 e;
    public final xo f32976f;
    public final int f32977g;
    public org.telegram.ui.ActionBar.m1 h;
    public final yo f32978i;
    public long f32979j;
    public int f32980k;
    public int f32981l;
    public final FrameLayout f32982m;
    public final TextView f32983n;
    public int f32984o;

    public zo(Context context, int i10, ph0 ph0Var, boolean z10, final yo yoVar, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        xo xoVar;
        int i12;
        Integer num;
        this.f32977g = i10;
        this.f32978i = yoVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        xo xoVar2 = new xo(context, i11, 0, d6Var, 0);
        xoVar2.U = new Path();
        this.f32976f = xoVar2;
        xoVar2.setFitItems(true);
        if (ph0Var != null) {
            i12 = 1;
            num = 1;
            xoVar = xoVar2;
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, d6Var);
            this.f32973a = c10;
            c10.setOnClickListener(new m8(ph0Var, 1));
        } else {
            xoVar = xoVar2;
            i12 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, d6Var);
        this.f32974b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final zo f31337b;

            {
                this.f31337b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31337b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31337b;
                        zoVar.a();
                        yoVar.y(zoVar.f32981l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31337b;
                        zoVar2.a();
                        yoVar.y(zoVar2.f32980k);
                        return;
                    case 3:
                        this.f31337b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31337b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 27));
                        return;
                    default:
                        yoVar.m();
                        this.f31337b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, d6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final zo f31337b;

            {
                this.f31337b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31337b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31337b;
                        zoVar.a();
                        yoVar.y(zoVar.f32981l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31337b;
                        zoVar2.a();
                        yoVar.y(zoVar2.f32980k);
                        return;
                    case 3:
                        this.f31337b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31337b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 27));
                        return;
                    default:
                        yoVar.m();
                        this.f31337b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, d6Var);
        this.e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final zo f31337b;

            {
                this.f31337b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31337b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31337b;
                        zoVar.a();
                        yoVar.y(zoVar.f32981l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31337b;
                        zoVar2.a();
                        yoVar.y(zoVar2.f32980k);
                        return;
                    case 3:
                        this.f31337b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31337b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 27));
                        return;
                    default:
                        yoVar.m();
                        this.f31337b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, d6Var).setOnClickListener(new wo(this, context, d6Var, i10, yoVar, 0));
        org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final zo f31337b;

            {
                this.f31337b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31337b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31337b;
                        zoVar.a();
                        yoVar.y(zoVar.f32981l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31337b;
                        zoVar2.a();
                        yoVar.y(zoVar2.f32980k);
                        return;
                    case 3:
                        this.f31337b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31337b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 27));
                        return;
                    default:
                        yoVar.m();
                        this.f31337b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, xoVar, 0, "", false, d6Var);
        this.f32975c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final zo f31337b;

            {
                this.f31337b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31337b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31337b;
                        zoVar.a();
                        yoVar.y(zoVar.f32981l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31337b;
                        zoVar2.a();
                        yoVar.y(zoVar2.f32980k);
                        return;
                    case 3:
                        this.f31337b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31337b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 27));
                        return;
                    default:
                        yoVar.m();
                        this.f31337b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32982m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H8, d6Var));
        xoVar.a(frameLayout, w7.z5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f32983n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(i12, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        xoVar.a(textView, w7.z5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, d6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final zo f31337b;

            {
                this.f31337b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31337b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31337b;
                        zoVar.a();
                        yoVar.y(zoVar.f32981l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31337b;
                        zoVar2.a();
                        yoVar.y(zoVar2.f32980k);
                        return;
                    case 3:
                        this.f31337b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31337b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 27));
                        return;
                    default:
                        yoVar.m();
                        this.f31337b.a();
                        return;
                }
            }
        });
    }

    public static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = i10 / 86400;
        int i12 = i10 - (86400 * i11);
        int i13 = i12 / 3600;
        int i14 = (i12 - (i13 * 3600)) / 60;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append(LocaleController.getString(R.string.SecretChatTimerDays));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(LocaleController.getString(R.string.SecretChatTimerHours));
        }
        if (i14 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i14);
            sb2.append(LocaleController.getString(R.string.SecretChatTimerMinutes));
        }
        return LocaleController.formatString("MuteForButton", R.string.MuteForButton, sb2.toString());
    }

    public final void a() {
        org.telegram.ui.ActionBar.m1 m1Var = this.h;
        if (m1Var != null) {
            m1Var.d(true);
            this.h.d(true);
        }
        this.f32978i.dismiss();
        this.f32979j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.n2 n2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (n2Var.getFragmentView() != null) {
            xo xoVar = this.f32976f;
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(xoVar, -2, -2);
            this.h = m1Var;
            m1Var.e = true;
            m1Var.f21573c = 220;
            m1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            xoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != n2Var.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f7 += view.getX();
                f10 += view.getY();
                view = (View) view.getParent();
            }
            if (z10) {
                measuredWidth = f7 - AndroidUtilities.dpf2(8.0f);
                measuredHeight = AndroidUtilities.dpf2(16.0f);
            } else {
                measuredWidth = f7 - (xoVar.getMeasuredWidth() / 2.0f);
                measuredHeight = xoVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(n2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f32979j < 200) {
            AndroidUtilities.runOnUIThread(new a3.h0(this, j10, j11, hashSet, 13));
            return;
        }
        int i13 = this.f32977g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.e1 e1Var = this.f32974b;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f32975c;
        if (isDialogMuted) {
            e1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21356x6, false);
            e1Var.setVisibility(8);
        } else {
            e1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false);
            e1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j10, j11)) {
                e1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = x02;
        }
        if (this.f32984o == 1) {
            this.f32973a.setVisibility(8);
        }
        if (!isDialogMuted && this.f32984o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.d;
        if (i12 != 0) {
            this.f32981l = i12;
            e1Var3.setVisibility(0);
            e1Var3.getImageView().setImageDrawable(q21.a(i12));
            e1Var3.setText(b(i12));
        } else {
            e1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.e1 e1Var4 = this.e;
        if (i11 != 0) {
            this.f32980k = i11;
            e1Var4.setVisibility(0);
            e1Var4.getImageView().setImageDrawable(q21.a(i11));
            e1Var4.setText(b(i11));
        } else {
            e1Var4.setVisibility(8);
        }
        e1Var2.c(i10, i10);
        e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, i10));
        FrameLayout frameLayout = this.f32982m;
        TextView textView = this.f32983n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.h6.f21169n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
