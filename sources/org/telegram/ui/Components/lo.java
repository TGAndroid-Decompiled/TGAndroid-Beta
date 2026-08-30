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
public final class lo {
    public final org.telegram.ui.ActionBar.g1 f26820a;
    public final org.telegram.ui.ActionBar.g1 f26821b;
    public final org.telegram.ui.ActionBar.g1 f26822c;
    public final org.telegram.ui.ActionBar.g1 d;
    public final org.telegram.ui.ActionBar.g1 e;
    public final jo f26823f;
    public final int f26824g;
    public org.telegram.ui.ActionBar.p1 h;
    public final ko f26825i;
    public long f26826j;
    public int f26827k;
    public int f26828l;
    public final FrameLayout f26829m;
    public final TextView f26830n;
    public int f26831o;

    public lo(Context context, int i10, ah0 ah0Var, boolean z4, final ko koVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        jo joVar;
        Integer num;
        this.f26824g = i10;
        this.f26825i = koVar;
        if (z4) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        jo joVar2 = new jo(context, i11, 0, f6Var, 0);
        joVar2.R = new Path();
        this.f26823f = joVar2;
        joVar2.setFitItems(true);
        if (ah0Var != null) {
            num = 1;
            joVar = joVar2;
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, joVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, f6Var);
            this.f26820a = c3;
            c3.setOnClickListener(new e8(ah0Var, 1));
        } else {
            joVar = joVar2;
            num = 1;
        }
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, joVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, f6Var);
        this.f26821b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final lo f25456b;

            {
                this.f25456b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25456b.a();
                        koVar.v();
                        return;
                    case 1:
                        lo loVar = this.f25456b;
                        loVar.a();
                        koVar.x(loVar.f26828l);
                        return;
                    case 2:
                        lo loVar2 = this.f25456b;
                        loVar2.a();
                        koVar.x(loVar2.f26827k);
                        return;
                    case 3:
                        this.f25456b.a();
                        koVar.s();
                        return;
                    case 4:
                        this.f25456b.a();
                        AndroidUtilities.runOnUIThread(new fg(koVar, 27));
                        return;
                    default:
                        koVar.o();
                        this.f25456b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, joVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, f6Var);
        this.d = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final lo f25456b;

            {
                this.f25456b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25456b.a();
                        koVar.v();
                        return;
                    case 1:
                        lo loVar = this.f25456b;
                        loVar.a();
                        koVar.x(loVar.f26828l);
                        return;
                    case 2:
                        lo loVar2 = this.f25456b;
                        loVar2.a();
                        koVar.x(loVar2.f26827k);
                        return;
                    case 3:
                        this.f25456b.a();
                        koVar.s();
                        return;
                    case 4:
                        this.f25456b.a();
                        AndroidUtilities.runOnUIThread(new fg(koVar, 27));
                        return;
                    default:
                        koVar.o();
                        this.f25456b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, joVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, f6Var);
        this.e = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final lo f25456b;

            {
                this.f25456b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25456b.a();
                        koVar.v();
                        return;
                    case 1:
                        lo loVar = this.f25456b;
                        loVar.a();
                        koVar.x(loVar.f26828l);
                        return;
                    case 2:
                        lo loVar2 = this.f25456b;
                        loVar2.a();
                        koVar.x(loVar2.f26827k);
                        return;
                    case 3:
                        this.f25456b.a();
                        koVar.s();
                        return;
                    case 4:
                        this.f25456b.a();
                        AndroidUtilities.runOnUIThread(new fg(koVar, 27));
                        return;
                    default:
                        koVar.o();
                        this.f25456b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.w0.c(false, false, joVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, f6Var).setOnClickListener(new io(this, context, f6Var, i10, koVar, 0));
        org.telegram.ui.ActionBar.w0.c(false, false, joVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, f6Var).setOnClickListener(new View.OnClickListener(this) {
            public final lo f25456b;

            {
                this.f25456b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25456b.a();
                        koVar.v();
                        return;
                    case 1:
                        lo loVar = this.f25456b;
                        loVar.a();
                        koVar.x(loVar.f26828l);
                        return;
                    case 2:
                        lo loVar2 = this.f25456b;
                        loVar2.a();
                        koVar.x(loVar2.f26827k);
                        return;
                    case 3:
                        this.f25456b.a();
                        koVar.s();
                        return;
                    case 4:
                        this.f25456b.a();
                        AndroidUtilities.runOnUIThread(new fg(koVar, 27));
                        return;
                    default:
                        koVar.o();
                        this.f25456b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, joVar, 0, "", false, f6Var);
        this.f26822c = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final lo f25456b;

            {
                this.f25456b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25456b.a();
                        koVar.v();
                        return;
                    case 1:
                        lo loVar = this.f25456b;
                        loVar.a();
                        koVar.x(loVar.f26828l);
                        return;
                    case 2:
                        lo loVar2 = this.f25456b;
                        loVar2.a();
                        koVar.x(loVar2.f26827k);
                        return;
                    case 3:
                        this.f25456b.a();
                        koVar.s();
                        return;
                    case 4:
                        this.f25456b.a();
                        AndroidUtilities.runOnUIThread(new fg(koVar, 27));
                        return;
                    default:
                        koVar.o();
                        this.f25456b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26829m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H8, f6Var));
        joVar.a(frameLayout, k7.b6.n(-1, 8));
        TextView textView = new TextView(context);
        this.f26830n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        joVar.a(textView, k7.b6.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final lo f25456b;

            {
                this.f25456b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25456b.a();
                        koVar.v();
                        return;
                    case 1:
                        lo loVar = this.f25456b;
                        loVar.a();
                        koVar.x(loVar.f26828l);
                        return;
                    case 2:
                        lo loVar2 = this.f25456b;
                        loVar2.a();
                        koVar.x(loVar2.f26827k);
                        return;
                    case 3:
                        this.f25456b.a();
                        koVar.s();
                        return;
                    case 4:
                        this.f25456b.a();
                        AndroidUtilities.runOnUIThread(new fg(koVar, 27));
                        return;
                    default:
                        koVar.o();
                        this.f25456b.a();
                        return;
                }
            }
        });
    }

    public static String b(int i10) {
        StringBuilder sb = new StringBuilder();
        int i11 = i10 / 86400;
        int i12 = i10 - (86400 * i11);
        int i13 = i12 / 3600;
        int i14 = (i12 - (i13 * 3600)) / 60;
        if (i11 != 0) {
            sb.append(i11);
            sb.append(LocaleController.getString(R.string.SecretChatTimerDays));
        }
        if (i13 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i13);
            sb.append(LocaleController.getString(R.string.SecretChatTimerHours));
        }
        if (i14 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i14);
            sb.append(LocaleController.getString(R.string.SecretChatTimerMinutes));
        }
        return LocaleController.formatString("MuteForButton", R.string.MuteForButton, sb.toString());
    }

    public final void a() {
        org.telegram.ui.ActionBar.p1 p1Var = this.h;
        if (p1Var != null) {
            p1Var.d(true);
            this.h.d(true);
        }
        this.f26825i.dismiss();
        this.f26826j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.p2 p2Var, View view, float f10, float f11, boolean z4) {
        float measuredWidth;
        float measuredHeight;
        if (p2Var.getFragmentView() != null) {
            jo joVar = this.f26823f;
            org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(joVar, -2, -2);
            this.h = p1Var;
            p1Var.e = true;
            p1Var.f20517c = 220;
            p1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            joVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != p2Var.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f10 += view.getX();
                f11 += view.getY();
                view = (View) view.getParent();
            }
            if (z4) {
                measuredWidth = f10 - AndroidUtilities.dpf2(8.0f);
                measuredHeight = AndroidUtilities.dpf2(16.0f);
            } else {
                measuredWidth = f10 - (joVar.getMeasuredWidth() / 2.0f);
                measuredHeight = joVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(p2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f26826j < 200) {
            AndroidUtilities.runOnUIThread(new i5.x(this, j10, j11, hashSet, 12));
            return;
        }
        int i13 = this.f26824g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.g1 g1Var = this.f26821b;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f26822c;
        if (isDialogMuted) {
            g1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20263x6, false);
            g1Var.setVisibility(8);
        } else {
            g1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false);
            g1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j10, j11)) {
                g1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = w02;
        }
        if (this.f26831o == 1) {
            this.f26820a.setVisibility(8);
        }
        if (!isDialogMuted && this.f26831o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.d;
        if (i12 != 0) {
            this.f26828l = i12;
            g1Var3.setVisibility(0);
            g1Var3.getImageView().setImageDrawable(x11.a(i12));
            g1Var3.setText(b(i12));
        } else {
            g1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.e;
        if (i11 != 0) {
            this.f26827k = i11;
            g1Var4.setVisibility(0);
            g1Var4.getImageView().setImageDrawable(x11.a(i11));
            g1Var4.setText(b(i11));
        } else {
            g1Var4.setVisibility(8);
        }
        g1Var2.c(i10, i10);
        g1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
        FrameLayout frameLayout = this.f26829m;
        TextView textView = this.f26830n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.j6.f20085n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
