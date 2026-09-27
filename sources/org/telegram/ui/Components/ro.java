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
    public final org.telegram.ui.ActionBar.g1 f28045a;
    public final org.telegram.ui.ActionBar.g1 f28046b;
    public final org.telegram.ui.ActionBar.g1 f28047c;
    public final org.telegram.ui.ActionBar.g1 d;
    public final org.telegram.ui.ActionBar.g1 e;
    public final po f28048f;
    public final int f28049g;
    public org.telegram.ui.ActionBar.o1 h;
    public final qo f28050i;
    public long f28051j;
    public int f28052k;
    public int f28053l;
    public final FrameLayout f28054m;
    public final TextView f28055n;
    public int f28056o;

    public ro(Context context, int i10, hh0 hh0Var, boolean z10, final qo qoVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11;
        po poVar;
        Integer num;
        this.f28049g = i10;
        this.f28050i = qoVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        po poVar2 = new po(context, i11, 0, e6Var, 0);
        poVar2.U = new Path();
        this.f28048f = poVar2;
        poVar2.setFitItems(true);
        if (hh0Var != null) {
            num = 1;
            poVar = poVar2;
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, poVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, e6Var);
            this.f28045a = c10;
            c10.setOnClickListener(new l8(hh0Var, 1));
        } else {
            poVar = poVar2;
            num = 1;
        }
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, poVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, e6Var);
        this.f28046b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final ro f26870b;

            {
                this.f26870b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26870b.a();
                        qoVar.s();
                        return;
                    case 1:
                        ro roVar = this.f26870b;
                        roVar.a();
                        qoVar.u(roVar.f28053l);
                        return;
                    case 2:
                        ro roVar2 = this.f26870b;
                        roVar2.a();
                        qoVar.u(roVar2.f28052k);
                        return;
                    case 3:
                        this.f26870b.a();
                        qoVar.p();
                        return;
                    case 4:
                        this.f26870b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26870b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, poVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, e6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final ro f26870b;

            {
                this.f26870b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26870b.a();
                        qoVar.s();
                        return;
                    case 1:
                        ro roVar = this.f26870b;
                        roVar.a();
                        qoVar.u(roVar.f28053l);
                        return;
                    case 2:
                        ro roVar2 = this.f26870b;
                        roVar2.a();
                        qoVar.u(roVar2.f28052k);
                        return;
                    case 3:
                        this.f26870b.a();
                        qoVar.p();
                        return;
                    case 4:
                        this.f26870b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26870b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, poVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, e6Var);
        this.e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final ro f26870b;

            {
                this.f26870b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26870b.a();
                        qoVar.s();
                        return;
                    case 1:
                        ro roVar = this.f26870b;
                        roVar.a();
                        qoVar.u(roVar.f28053l);
                        return;
                    case 2:
                        ro roVar2 = this.f26870b;
                        roVar2.a();
                        qoVar.u(roVar2.f28052k);
                        return;
                    case 3:
                        this.f26870b.a();
                        qoVar.p();
                        return;
                    case 4:
                        this.f26870b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26870b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.w0.c(false, false, poVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, e6Var).setOnClickListener(new oo(this, context, e6Var, i10, qoVar, 0));
        org.telegram.ui.ActionBar.w0.c(false, false, poVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, e6Var).setOnClickListener(new View.OnClickListener(this) {
            public final ro f26870b;

            {
                this.f26870b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26870b.a();
                        qoVar.s();
                        return;
                    case 1:
                        ro roVar = this.f26870b;
                        roVar.a();
                        qoVar.u(roVar.f28053l);
                        return;
                    case 2:
                        ro roVar2 = this.f26870b;
                        roVar2.a();
                        qoVar.u(roVar2.f28052k);
                        return;
                    case 3:
                        this.f26870b.a();
                        qoVar.p();
                        return;
                    case 4:
                        this.f26870b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26870b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, poVar, 0, "", false, e6Var);
        this.f28047c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final ro f26870b;

            {
                this.f26870b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26870b.a();
                        qoVar.s();
                        return;
                    case 1:
                        ro roVar = this.f26870b;
                        roVar.a();
                        qoVar.u(roVar.f28053l);
                        return;
                    case 2:
                        ro roVar2 = this.f26870b;
                        roVar2.a();
                        qoVar.u(roVar2.f28052k);
                        return;
                    case 3:
                        this.f26870b.a();
                        qoVar.p();
                        return;
                    case 4:
                        this.f26870b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26870b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28054m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H8, e6Var));
        poVar.a(frameLayout, w7.y5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f28055n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, e6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        poVar.a(textView, w7.y5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, e6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ro f26870b;

            {
                this.f26870b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26870b.a();
                        qoVar.s();
                        return;
                    case 1:
                        ro roVar = this.f26870b;
                        roVar.a();
                        qoVar.u(roVar.f28053l);
                        return;
                    case 2:
                        ro roVar2 = this.f26870b;
                        roVar2.a();
                        qoVar.u(roVar2.f28052k);
                        return;
                    case 3:
                        this.f26870b.a();
                        qoVar.p();
                        return;
                    case 4:
                        this.f26870b.a();
                        AndroidUtilities.runOnUIThread(new pg(qoVar, 27));
                        return;
                    default:
                        qoVar.m();
                        this.f26870b.a();
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
        org.telegram.ui.ActionBar.o1 o1Var = this.h;
        if (o1Var != null) {
            o1Var.d(true);
            this.h.d(true);
        }
        this.f28050i.dismiss();
        this.f28051j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.o2 o2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (o2Var.getFragmentView() != null) {
            po poVar = this.f28048f;
            org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(poVar, -2, -2);
            this.h = o1Var;
            o1Var.e = true;
            o1Var.f19685c = 220;
            o1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            poVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != o2Var.getFragmentView()) {
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
            this.h.showAtLocation(o2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j3, long j10, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f28051j < 200) {
            AndroidUtilities.runOnUIThread(new a3.g0(this, j3, j10, hashSet, 13));
            return;
        }
        int i13 = this.f28049g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j3, j10);
        org.telegram.ui.ActionBar.g1 g1Var = this.f28046b;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f28047c;
        if (isDialogMuted) {
            g1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19425x6, false);
            g1Var.setVisibility(8);
        } else {
            g1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false);
            g1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j3, j10)) {
                g1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = w02;
        }
        if (this.f28056o == 1) {
            this.f28045a.setVisibility(8);
        }
        if (!isDialogMuted && this.f28056o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.d;
        if (i12 != 0) {
            this.f28053l = i12;
            g1Var3.setVisibility(0);
            g1Var3.getImageView().setImageDrawable(k21.a(i12));
            g1Var3.setText(b(i12));
        } else {
            g1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.e;
        if (i11 != 0) {
            this.f28052k = i11;
            g1Var4.setVisibility(0);
            g1Var4.getImageView().setImageDrawable(k21.a(i11));
            g1Var4.setText(b(i11));
        } else {
            g1Var4.setVisibility(8);
        }
        g1Var2.c(i10, i10);
        g1Var2.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.1f, i10));
        FrameLayout frameLayout = this.f28054m;
        TextView textView = this.f28055n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.i6.f19242n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
