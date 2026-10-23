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
    public final org.telegram.ui.ActionBar.e1 f33301a;
    public final org.telegram.ui.ActionBar.e1 f33302b;
    public final org.telegram.ui.ActionBar.e1 f33303c;
    public final org.telegram.ui.ActionBar.e1 d;
    public final org.telegram.ui.ActionBar.e1 e;
    public final xo f33304f;
    public final int f33305g;
    public org.telegram.ui.ActionBar.m1 h;
    public final yo f33306i;
    public long f33307j;
    public int f33308k;
    public int f33309l;
    public final FrameLayout f33310m;
    public final TextView f33311n;
    public int f33312o;

    public zo(Context context, int i10, th0 th0Var, boolean z10, final yo yoVar, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        xo xoVar;
        int i12;
        Integer num;
        this.f33305g = i10;
        this.f33306i = yoVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        xo xoVar2 = new xo(context, i11, 0, g6Var, 0);
        xoVar2.U = new Path();
        this.f33304f = xoVar2;
        xoVar2.setFitItems(true);
        if (th0Var != null) {
            i12 = 1;
            num = 1;
            xoVar = xoVar2;
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, g6Var);
            this.f33301a = c10;
            c10.setOnClickListener(new m8(th0Var, 1));
        } else {
            xoVar = xoVar2;
            i12 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, g6Var);
        this.f33302b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final zo f31508b;

            {
                this.f31508b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31508b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31508b;
                        zoVar.a();
                        yoVar.v(zoVar.f33309l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31508b;
                        zoVar2.a();
                        yoVar.v(zoVar2.f33308k);
                        return;
                    case 3:
                        this.f31508b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31508b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 28));
                        return;
                    default:
                        yoVar.m();
                        this.f31508b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, g6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final zo f31508b;

            {
                this.f31508b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31508b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31508b;
                        zoVar.a();
                        yoVar.v(zoVar.f33309l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31508b;
                        zoVar2.a();
                        yoVar.v(zoVar2.f33308k);
                        return;
                    case 3:
                        this.f31508b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31508b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 28));
                        return;
                    default:
                        yoVar.m();
                        this.f31508b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, g6Var);
        this.e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final zo f31508b;

            {
                this.f31508b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31508b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31508b;
                        zoVar.a();
                        yoVar.v(zoVar.f33309l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31508b;
                        zoVar2.a();
                        yoVar.v(zoVar2.f33308k);
                        return;
                    case 3:
                        this.f31508b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31508b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 28));
                        return;
                    default:
                        yoVar.m();
                        this.f31508b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, g6Var).setOnClickListener(new wo(this, context, g6Var, i10, yoVar, 0));
        org.telegram.ui.ActionBar.u0.c(false, false, xoVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, g6Var).setOnClickListener(new View.OnClickListener(this) {
            public final zo f31508b;

            {
                this.f31508b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31508b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31508b;
                        zoVar.a();
                        yoVar.v(zoVar.f33309l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31508b;
                        zoVar2.a();
                        yoVar.v(zoVar2.f33308k);
                        return;
                    case 3:
                        this.f31508b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31508b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 28));
                        return;
                    default:
                        yoVar.m();
                        this.f31508b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, xoVar, 0, "", false, g6Var);
        this.f33303c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final zo f31508b;

            {
                this.f31508b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31508b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31508b;
                        zoVar.a();
                        yoVar.v(zoVar.f33309l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31508b;
                        zoVar2.a();
                        yoVar.v(zoVar2.f33308k);
                        return;
                    case 3:
                        this.f31508b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31508b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 28));
                        return;
                    default:
                        yoVar.m();
                        this.f31508b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33310m = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.H8, frameLayout, g6Var);
        xoVar.a(frameLayout, w7.z5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f33311n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(i12, 13.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.E8, g6Var);
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        xoVar.a(textView, w7.z5.n(-2, -2));
        int i13 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i13, g6Var), 0, 6);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        textView.setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(textView, Z, null, O, g6Var);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final zo f31508b;

            {
                this.f31508b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31508b.a();
                        yoVar.t();
                        return;
                    case 1:
                        zo zoVar = this.f31508b;
                        zoVar.a();
                        yoVar.v(zoVar.f33309l);
                        return;
                    case 2:
                        zo zoVar2 = this.f31508b;
                        zoVar2.a();
                        yoVar.v(zoVar2.f33308k);
                        return;
                    case 3:
                        this.f31508b.a();
                        yoVar.p();
                        return;
                    case 4:
                        this.f31508b.a();
                        AndroidUtilities.runOnUIThread(new pg(yoVar, 28));
                        return;
                    default:
                        yoVar.m();
                        this.f31508b.a();
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

    public static void c(org.telegram.ui.ActionBar.e1 e1Var, int i10) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        e1Var.c(i10, i10);
        e1Var.h(0.1f, i10);
        if (e1Var.getTextView() != null && e1Var.getTextView().getCurrentTextColor() == x02) {
            return;
        }
        e1Var.d(x02, x02);
        e1Var.setSelectorColor(org.telegram.ui.ActionBar.k6.o1(0.1f, x02));
    }

    public final void a() {
        org.telegram.ui.ActionBar.m1 m1Var = this.h;
        if (m1Var != null) {
            m1Var.d(true);
            this.h.d(true);
        }
        this.f33306i.dismiss();
        this.f33307j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.o2 o2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (o2Var.getFragmentView() != null) {
            xo xoVar = this.f33304f;
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(xoVar, -2, -2);
            this.h = m1Var;
            m1Var.e = true;
            m1Var.f21631c = 220;
            m1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            xoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f7 - (xoVar.getMeasuredWidth() / 2.0f);
                measuredHeight = xoVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(o2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f33307j < 200) {
            AndroidUtilities.runOnUIThread(new a3.h0(this, j10, j11, hashSet, 13));
            return;
        }
        int i13 = this.f33305g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.e1 e1Var = this.f33303c;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f33302b;
        if (isDialogMuted) {
            e1Var.j(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.k6.f21553x6;
            e1Var2.setVisibility(8);
        } else {
            e1Var.j(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int i14 = org.telegram.ui.ActionBar.k6.f21421q7;
            e1Var2.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j10, j11)) {
                e1Var2.j(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                e1Var2.j(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = i14;
        }
        if (this.f33312o == 1) {
            this.f33301a.setVisibility(8);
        }
        if (!isDialogMuted && this.f33312o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.d;
        if (i12 != 0) {
            this.f33309l = i12;
            e1Var3.setVisibility(0);
            e1Var3.getImageView().setImageDrawable(w21.a(i12));
            e1Var3.setText(b(i12));
        } else {
            e1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.e1 e1Var4 = this.e;
        if (i11 != 0) {
            this.f33308k = i11;
            e1Var4.setVisibility(0);
            e1Var4.getImageView().setImageDrawable(w21.a(i11));
            e1Var4.setText(b(i11));
        } else {
            e1Var4.setVisibility(8);
        }
        c(e1Var, i10);
        FrameLayout frameLayout = this.f33310m;
        TextView textView = this.f33311n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.k6.f21366n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
