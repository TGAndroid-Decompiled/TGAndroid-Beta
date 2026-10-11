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
public final class fp {
    public final org.telegram.ui.ActionBar.e1 f26423a;
    public final org.telegram.ui.ActionBar.e1 f26424b;
    public final org.telegram.ui.ActionBar.e1 f26425c;
    public final org.telegram.ui.ActionBar.e1 d;
    public final org.telegram.ui.ActionBar.e1 f26426e;
    public final dp f26427f;
    public final int f26428g;
    public org.telegram.ui.ActionBar.m1 h;
    public final ep f26429i;
    public long f26430j;
    public int f26431k;
    public int f26432l;
    public final FrameLayout f26433m;
    public final TextView f26434n;
    public int f26435o;

    public fp(Context context, int i10, zh0 zh0Var, boolean z10, final ep epVar, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        dp dpVar;
        int i12;
        Integer num;
        this.f26428g = i10;
        this.f26429i = epVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        dp dpVar2 = new dp(context, i11, 0, d6Var, 0);
        dpVar2.U = new Path();
        this.f26427f = dpVar2;
        dpVar2.setFitItems(true);
        if (zh0Var != null) {
            i12 = 1;
            num = 1;
            dpVar = dpVar2;
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, dpVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, d6Var);
            this.f26423a = c10;
            c10.setOnClickListener(new n8(zh0Var, 1));
        } else {
            dpVar = dpVar2;
            i12 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, dpVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, d6Var);
        this.f26424b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final fp f25000b;

            {
                this.f25000b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25000b.a();
                        epVar.s();
                        return;
                    case 1:
                        fp fpVar = this.f25000b;
                        fpVar.a();
                        epVar.x(fpVar.f26432l);
                        return;
                    case 2:
                        fp fpVar2 = this.f25000b;
                        fpVar2.a();
                        epVar.x(fpVar2.f26431k);
                        return;
                    case 3:
                        this.f25000b.a();
                        epVar.p();
                        return;
                    case 4:
                        this.f25000b.a();
                        AndroidUtilities.runOnUIThread(new rg(epVar, 27));
                        return;
                    default:
                        epVar.m();
                        this.f25000b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, dpVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, d6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final fp f25000b;

            {
                this.f25000b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25000b.a();
                        epVar.s();
                        return;
                    case 1:
                        fp fpVar = this.f25000b;
                        fpVar.a();
                        epVar.x(fpVar.f26432l);
                        return;
                    case 2:
                        fp fpVar2 = this.f25000b;
                        fpVar2.a();
                        epVar.x(fpVar2.f26431k);
                        return;
                    case 3:
                        this.f25000b.a();
                        epVar.p();
                        return;
                    case 4:
                        this.f25000b.a();
                        AndroidUtilities.runOnUIThread(new rg(epVar, 27));
                        return;
                    default:
                        epVar.m();
                        this.f25000b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, dpVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, d6Var);
        this.f26426e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final fp f25000b;

            {
                this.f25000b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25000b.a();
                        epVar.s();
                        return;
                    case 1:
                        fp fpVar = this.f25000b;
                        fpVar.a();
                        epVar.x(fpVar.f26432l);
                        return;
                    case 2:
                        fp fpVar2 = this.f25000b;
                        fpVar2.a();
                        epVar.x(fpVar2.f26431k);
                        return;
                    case 3:
                        this.f25000b.a();
                        epVar.p();
                        return;
                    case 4:
                        this.f25000b.a();
                        AndroidUtilities.runOnUIThread(new rg(epVar, 27));
                        return;
                    default:
                        epVar.m();
                        this.f25000b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.u0.c(false, false, dpVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, d6Var).setOnClickListener(new cp(this, context, d6Var, i10, epVar, 0));
        org.telegram.ui.ActionBar.u0.c(false, false, dpVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final fp f25000b;

            {
                this.f25000b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25000b.a();
                        epVar.s();
                        return;
                    case 1:
                        fp fpVar = this.f25000b;
                        fpVar.a();
                        epVar.x(fpVar.f26432l);
                        return;
                    case 2:
                        fp fpVar2 = this.f25000b;
                        fpVar2.a();
                        epVar.x(fpVar2.f26431k);
                        return;
                    case 3:
                        this.f25000b.a();
                        epVar.p();
                        return;
                    case 4:
                        this.f25000b.a();
                        AndroidUtilities.runOnUIThread(new rg(epVar, 27));
                        return;
                    default:
                        epVar.m();
                        this.f25000b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, dpVar, 0, "", false, d6Var);
        this.f26425c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final fp f25000b;

            {
                this.f25000b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25000b.a();
                        epVar.s();
                        return;
                    case 1:
                        fp fpVar = this.f25000b;
                        fpVar.a();
                        epVar.x(fpVar.f26432l);
                        return;
                    case 2:
                        fp fpVar2 = this.f25000b;
                        fpVar2.a();
                        epVar.x(fpVar2.f26431k);
                        return;
                    case 3:
                        this.f25000b.a();
                        epVar.p();
                        return;
                    case 4:
                        this.f25000b.a();
                        AndroidUtilities.runOnUIThread(new rg(epVar, 27));
                        return;
                    default:
                        epVar.m();
                        this.f25000b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26433m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H8, d6Var));
        dpVar.a(frameLayout, w7.x5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f26434n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(i12, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        dpVar.a(textView, w7.x5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, d6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final fp f25000b;

            {
                this.f25000b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25000b.a();
                        epVar.s();
                        return;
                    case 1:
                        fp fpVar = this.f25000b;
                        fpVar.a();
                        epVar.x(fpVar.f26432l);
                        return;
                    case 2:
                        fp fpVar2 = this.f25000b;
                        fpVar2.a();
                        epVar.x(fpVar2.f26431k);
                        return;
                    case 3:
                        this.f25000b.a();
                        epVar.p();
                        return;
                    case 4:
                        this.f25000b.a();
                        AndroidUtilities.runOnUIThread(new rg(epVar, 27));
                        return;
                    default:
                        epVar.m();
                        this.f25000b.a();
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
        this.f26429i.dismiss();
        this.f26430j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.m2 m2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (m2Var.getFragmentView() != null) {
            dp dpVar = this.f26427f;
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(dpVar, -2, -2);
            this.h = m1Var;
            m1Var.f21372e = true;
            m1Var.f21371c = 220;
            m1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            dpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != m2Var.getFragmentView()) {
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
                measuredWidth = f7 - (dpVar.getMeasuredWidth() / 2.0f);
                measuredHeight = dpVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(m2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j3, long j10, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f26430j < 200) {
            AndroidUtilities.runOnUIThread(new a3.g0(this, j3, j10, hashSet, 13));
            return;
        }
        int i13 = this.f26428g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j3, j10);
        org.telegram.ui.ActionBar.e1 e1Var = this.f26424b;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f26425c;
        if (isDialogMuted) {
            e1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21155x6, false);
            e1Var.setVisibility(8);
        } else {
            e1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false);
            e1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j3, j10)) {
                e1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = x02;
        }
        if (this.f26435o == 1) {
            this.f26423a.setVisibility(8);
        }
        if (!isDialogMuted && this.f26435o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.d;
        if (i12 != 0) {
            this.f26432l = i12;
            e1Var3.setVisibility(0);
            e1Var3.getImageView().setImageDrawable(c31.a(i12));
            e1Var3.setText(b(i12));
        } else {
            e1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.e1 e1Var4 = this.f26426e;
        if (i11 != 0) {
            this.f26431k = i11;
            e1Var4.setVisibility(0);
            e1Var4.getImageView().setImageDrawable(c31.a(i11));
            e1Var4.setText(b(i11));
        } else {
            e1Var4.setVisibility(8);
        }
        e1Var2.c(i10, i10);
        e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, i10));
        FrameLayout frameLayout = this.f26433m;
        TextView textView = this.f26434n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.h6.f20971n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
