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
public final class jo {
    public final org.telegram.ui.ActionBar.g1 f29764a;
    public final org.telegram.ui.ActionBar.g1 f29765b;
    public final org.telegram.ui.ActionBar.g1 f29766c;
    public final org.telegram.ui.ActionBar.g1 d;
    public final org.telegram.ui.ActionBar.g1 f29767e;
    public final ho f29768f;
    public final int f29769g;
    public org.telegram.ui.ActionBar.o1 h;
    public final io f29770i;
    public long f29771j;
    public int f29772k;
    public int f29773l;
    public final FrameLayout f29774m;
    public final TextView f29775n;
    public int f29776o;

    public jo(Context context, int i10, qg0 qg0Var, boolean z10, final io ioVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        ho hoVar;
        Integer num;
        this.f29769g = i10;
        this.f29770i = ioVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ho hoVar2 = new ho(context, i11, 0, c6Var, 0);
        hoVar2.Q = new Path();
        this.f29768f = hoVar2;
        hoVar2.setFitItems(true);
        if (qg0Var != null) {
            num = 1;
            hoVar = hoVar2;
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, hoVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, c6Var);
            this.f29764a = c3;
            c3.setOnClickListener(new j8(qg0Var, 1));
        } else {
            hoVar = hoVar2;
            num = 1;
        }
        org.telegram.ui.ActionBar.g1 c6 = org.telegram.ui.ActionBar.w0.c(false, false, hoVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, c6Var);
        this.f29765b = c6;
        c6.setOnClickListener(new View.OnClickListener(this) {
            public final jo f28510b;

            {
                this.f28510b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28510b.a();
                        ioVar.u();
                        return;
                    case 1:
                        jo joVar = this.f28510b;
                        joVar.a();
                        ioVar.w(joVar.f29773l);
                        return;
                    case 2:
                        jo joVar2 = this.f28510b;
                        joVar2.a();
                        ioVar.w(joVar2.f29772k);
                        return;
                    case 3:
                        this.f28510b.a();
                        ioVar.l();
                        return;
                    case 4:
                        this.f28510b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        return;
                    default:
                        ioVar.j();
                        this.f28510b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, hoVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, c6Var);
        this.d = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final jo f28510b;

            {
                this.f28510b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28510b.a();
                        ioVar.u();
                        return;
                    case 1:
                        jo joVar = this.f28510b;
                        joVar.a();
                        ioVar.w(joVar.f29773l);
                        return;
                    case 2:
                        jo joVar2 = this.f28510b;
                        joVar2.a();
                        ioVar.w(joVar2.f29772k);
                        return;
                    case 3:
                        this.f28510b.a();
                        ioVar.l();
                        return;
                    case 4:
                        this.f28510b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        return;
                    default:
                        ioVar.j();
                        this.f28510b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, hoVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, c6Var);
        this.f29767e = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final jo f28510b;

            {
                this.f28510b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28510b.a();
                        ioVar.u();
                        return;
                    case 1:
                        jo joVar = this.f28510b;
                        joVar.a();
                        ioVar.w(joVar.f29773l);
                        return;
                    case 2:
                        jo joVar2 = this.f28510b;
                        joVar2.a();
                        ioVar.w(joVar2.f29772k);
                        return;
                    case 3:
                        this.f28510b.a();
                        ioVar.l();
                        return;
                    case 4:
                        this.f28510b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        return;
                    default:
                        ioVar.j();
                        this.f28510b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.w0.c(false, false, hoVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, c6Var).setOnClickListener(new go(this, context, c6Var, i10, ioVar, 0));
        org.telegram.ui.ActionBar.w0.c(false, false, hoVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, c6Var).setOnClickListener(new View.OnClickListener(this) {
            public final jo f28510b;

            {
                this.f28510b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28510b.a();
                        ioVar.u();
                        return;
                    case 1:
                        jo joVar = this.f28510b;
                        joVar.a();
                        ioVar.w(joVar.f29773l);
                        return;
                    case 2:
                        jo joVar2 = this.f28510b;
                        joVar2.a();
                        ioVar.w(joVar2.f29772k);
                        return;
                    case 3:
                        this.f28510b.a();
                        ioVar.l();
                        return;
                    case 4:
                        this.f28510b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        return;
                    default:
                        ioVar.j();
                        this.f28510b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, hoVar, 0, "", false, c6Var);
        this.f29766c = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final jo f28510b;

            {
                this.f28510b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28510b.a();
                        ioVar.u();
                        return;
                    case 1:
                        jo joVar = this.f28510b;
                        joVar.a();
                        ioVar.w(joVar.f29773l);
                        return;
                    case 2:
                        jo joVar2 = this.f28510b;
                        joVar2.a();
                        ioVar.w(joVar2.f29772k);
                        return;
                    case 3:
                        this.f28510b.a();
                        ioVar.l();
                        return;
                    case 4:
                        this.f28510b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        return;
                    default:
                        ioVar.j();
                        this.f28510b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29774m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H8, c6Var));
        hoVar.a(frameLayout, i7.f6.n(-1, 8));
        TextView textView = new TextView(context);
        this.f29775n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        hoVar.a(textView, i7.f6.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final jo f28510b;

            {
                this.f28510b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28510b.a();
                        ioVar.u();
                        return;
                    case 1:
                        jo joVar = this.f28510b;
                        joVar.a();
                        ioVar.w(joVar.f29773l);
                        return;
                    case 2:
                        jo joVar2 = this.f28510b;
                        joVar2.a();
                        ioVar.w(joVar2.f29772k);
                        return;
                    case 3:
                        this.f28510b.a();
                        ioVar.l();
                        return;
                    case 4:
                        this.f28510b.a();
                        AndroidUtilities.runOnUIThread(new ig(ioVar, 27));
                        return;
                    default:
                        ioVar.j();
                        this.f28510b.a();
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
        this.f29770i.dismiss();
        this.f29771j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.o2 o2Var, View view, float f9, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (o2Var.getFragmentView() != null) {
            ho hoVar = this.f29768f;
            org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(hoVar, -2, -2);
            this.h = o1Var;
            o1Var.f23712e = true;
            o1Var.f23711c = 220;
            o1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            hoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != o2Var.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f9 += view.getX();
                f10 += view.getY();
                view = (View) view.getParent();
            }
            if (z10) {
                measuredWidth = f9 - AndroidUtilities.dpf2(8.0f);
                measuredHeight = AndroidUtilities.dpf2(16.0f);
            } else {
                measuredWidth = f9 - (hoVar.getMeasuredWidth() / 2.0f);
                measuredHeight = hoVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(o2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f29771j < 200) {
            AndroidUtilities.runOnUIThread(new g5.x(this, j10, j11, hashSet, 12));
            return;
        }
        int i13 = this.f29769g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.g1 g1Var = this.f29765b;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f29766c;
        if (isDialogMuted) {
            g1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23418x6, false);
            g1Var.setVisibility(8);
        } else {
            g1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false);
            g1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j10, j11)) {
                g1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = w02;
        }
        if (this.f29776o == 1) {
            this.f29764a.setVisibility(8);
        }
        if (!isDialogMuted && this.f29776o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.d;
        if (i12 != 0) {
            this.f29773l = i12;
            g1Var3.setVisibility(0);
            g1Var3.getImageView().setImageDrawable(m11.a(i12));
            g1Var3.setText(b(i12));
        } else {
            g1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.f29767e;
        if (i11 != 0) {
            this.f29772k = i11;
            g1Var4.setVisibility(0);
            g1Var4.getImageView().setImageDrawable(m11.a(i11));
            g1Var4.setText(b(i11));
        } else {
            g1Var4.setVisibility(8);
        }
        g1Var2.c(i10, i10);
        g1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i10));
        FrameLayout frameLayout = this.f29774m;
        TextView textView = this.f29775n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.g6.f23241n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
