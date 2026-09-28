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
public final class ro {
    public final org.telegram.ui.ActionBar.e1 f28008a;
    public final org.telegram.ui.ActionBar.e1 f28009b;
    public final org.telegram.ui.ActionBar.e1 f28010c;
    public final org.telegram.ui.ActionBar.e1 d;
    public final org.telegram.ui.ActionBar.e1 e;
    public final po f28011f;
    public final int f28012g;
    public org.telegram.ui.ActionBar.m1 h;
    public final qo f28013i;
    public long f28014j;
    public int f28015k;
    public int f28016l;
    public final FrameLayout f28017m;
    public final TextView f28018n;
    public int f28019o;

    public ro(Context context, int i10, hh0 hh0Var, boolean z10, final qo qoVar, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        po poVar;
        Integer num;
        this.f28012g = i10;
        this.f28013i = qoVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        po poVar2 = new po(context, i11, 0, d6Var, 0);
        poVar2.U = new Path();
        this.f28011f = poVar2;
        poVar2.setFitItems(true);
        if (hh0Var != null) {
            num = 1;
            poVar = poVar2;
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, poVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, d6Var);
            this.f28008a = c10;
            c10.setOnClickListener(new l8(hh0Var, 1));
        } else {
            poVar = poVar2;
            num = 1;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, poVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, d6Var);
        this.f28009b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final ro f26817b;

            {
                this.f26817b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26817b.a();
                        qoVar.r();
                        return;
                    case 1:
                        ro roVar = this.f26817b;
                        roVar.a();
                        qoVar.u(roVar.f28016l);
                        return;
                    case 2:
                        ro roVar2 = this.f26817b;
                        roVar2.a();
                        qoVar.u(roVar2.f28015k);
                        return;
                    case 3:
                        this.f26817b.a();
                        qoVar.o();
                        return;
                    case 4:
                        this.f26817b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26817b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, poVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, d6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final ro f26817b;

            {
                this.f26817b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26817b.a();
                        qoVar.r();
                        return;
                    case 1:
                        ro roVar = this.f26817b;
                        roVar.a();
                        qoVar.u(roVar.f28016l);
                        return;
                    case 2:
                        ro roVar2 = this.f26817b;
                        roVar2.a();
                        qoVar.u(roVar2.f28015k);
                        return;
                    case 3:
                        this.f26817b.a();
                        qoVar.o();
                        return;
                    case 4:
                        this.f26817b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26817b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, poVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, d6Var);
        this.e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final ro f26817b;

            {
                this.f26817b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26817b.a();
                        qoVar.r();
                        return;
                    case 1:
                        ro roVar = this.f26817b;
                        roVar.a();
                        qoVar.u(roVar.f28016l);
                        return;
                    case 2:
                        ro roVar2 = this.f26817b;
                        roVar2.a();
                        qoVar.u(roVar2.f28015k);
                        return;
                    case 3:
                        this.f26817b.a();
                        qoVar.o();
                        return;
                    case 4:
                        this.f26817b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26817b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.u0.c(false, false, poVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, d6Var).setOnClickListener(new oo(this, context, d6Var, i10, qoVar, 0));
        org.telegram.ui.ActionBar.u0.c(false, false, poVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final ro f26817b;

            {
                this.f26817b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26817b.a();
                        qoVar.r();
                        return;
                    case 1:
                        ro roVar = this.f26817b;
                        roVar.a();
                        qoVar.u(roVar.f28016l);
                        return;
                    case 2:
                        ro roVar2 = this.f26817b;
                        roVar2.a();
                        qoVar.u(roVar2.f28015k);
                        return;
                    case 3:
                        this.f26817b.a();
                        qoVar.o();
                        return;
                    case 4:
                        this.f26817b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26817b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, poVar, 0, "", false, d6Var);
        this.f28010c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final ro f26817b;

            {
                this.f26817b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26817b.a();
                        qoVar.r();
                        return;
                    case 1:
                        ro roVar = this.f26817b;
                        roVar.a();
                        qoVar.u(roVar.f28016l);
                        return;
                    case 2:
                        ro roVar2 = this.f26817b;
                        roVar2.a();
                        qoVar.u(roVar2.f28015k);
                        return;
                    case 3:
                        this.f26817b.a();
                        qoVar.o();
                        return;
                    case 4:
                        this.f26817b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26817b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28017m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H8, d6Var));
        poVar.a(frameLayout, w7.y5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f28018n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        poVar.a(textView, w7.y5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, d6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ro f26817b;

            {
                this.f26817b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26817b.a();
                        qoVar.r();
                        return;
                    case 1:
                        ro roVar = this.f26817b;
                        roVar.a();
                        qoVar.u(roVar.f28016l);
                        return;
                    case 2:
                        ro roVar2 = this.f26817b;
                        roVar2.a();
                        qoVar.u(roVar2.f28015k);
                        return;
                    case 3:
                        this.f26817b.a();
                        qoVar.o();
                        return;
                    case 4:
                        this.f26817b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26817b.a();
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
        this.f28013i.dismiss();
        this.f28014j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.m2 m2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (m2Var.getFragmentView() != null) {
            po poVar = this.f28011f;
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(poVar, -2, -2);
            this.h = m1Var;
            m1Var.e = true;
            m1Var.f19636c = 220;
            m1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            poVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f7 - (poVar.getMeasuredWidth() / 2.0f);
                measuredHeight = poVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(m2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j3, long j10, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f28014j < 200) {
            AndroidUtilities.runOnUIThread(new a3.g0(this, j3, j10, hashSet, 13));
            return;
        }
        int i13 = this.f28012g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j3, j10);
        org.telegram.ui.ActionBar.e1 e1Var = this.f28009b;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f28010c;
        if (isDialogMuted) {
            e1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19426x6, false);
            e1Var.setVisibility(8);
        } else {
            e1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19299q7, false);
            e1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j3, j10)) {
                e1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = w02;
        }
        if (this.f28019o == 1) {
            this.f28008a.setVisibility(8);
        }
        if (!isDialogMuted && this.f28019o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.d;
        if (i12 != 0) {
            this.f28016l = i12;
            e1Var3.setVisibility(0);
            e1Var3.getImageView().setImageDrawable(k21.a(i12));
            e1Var3.setText(b(i12));
        } else {
            e1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.e1 e1Var4 = this.e;
        if (i11 != 0) {
            this.f28015k = i11;
            e1Var4.setVisibility(0);
            e1Var4.getImageView().setImageDrawable(k21.a(i11));
            e1Var4.setText(b(i11));
        } else {
            e1Var4.setVisibility(8);
        }
        e1Var2.c(i10, i10);
        e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.1f, i10));
        FrameLayout frameLayout = this.f28017m;
        TextView textView = this.f28018n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.h6.f19244n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
