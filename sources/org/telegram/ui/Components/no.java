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
public final class no {
    public final org.telegram.ui.ActionBar.g1 f29547a;
    public final org.telegram.ui.ActionBar.g1 f29548b;
    public final org.telegram.ui.ActionBar.g1 f29549c;
    public final org.telegram.ui.ActionBar.g1 d;
    public final org.telegram.ui.ActionBar.g1 f29550e;
    public final lo f29551f;
    public final int f29552g;
    public org.telegram.ui.ActionBar.p1 h;
    public final mo f29553i;
    public long f29554j;
    public int f29555k;
    public int f29556l;
    public final FrameLayout f29557m;
    public final TextView f29558n;
    public int f29559o;

    public no(Context context, int i10, ch0 ch0Var, boolean z4, final mo moVar, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        lo loVar;
        Integer num;
        this.f29552g = i10;
        this.f29553i = moVar;
        if (z4) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        lo loVar2 = new lo(context, i11, 0, g6Var, 0);
        loVar2.R = new Path();
        this.f29551f = loVar2;
        loVar2.setFitItems(true);
        if (ch0Var != null) {
            num = 1;
            loVar = loVar2;
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, loVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, g6Var);
            this.f29547a = c3;
            c3.setOnClickListener(new e8(ch0Var, 1));
        } else {
            loVar = loVar2;
            num = 1;
        }
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, loVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, g6Var);
        this.f29548b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final no f28153b;

            {
                this.f28153b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28153b.a();
                        moVar.u();
                        return;
                    case 1:
                        no noVar = this.f28153b;
                        noVar.a();
                        moVar.v(noVar.f29556l);
                        return;
                    case 2:
                        no noVar2 = this.f28153b;
                        noVar2.a();
                        moVar.v(noVar2.f29555k);
                        return;
                    case 3:
                        this.f28153b.a();
                        moVar.o();
                        return;
                    case 4:
                        this.f28153b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        return;
                    default:
                        moVar.j();
                        this.f28153b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, loVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, g6Var);
        this.d = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final no f28153b;

            {
                this.f28153b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28153b.a();
                        moVar.u();
                        return;
                    case 1:
                        no noVar = this.f28153b;
                        noVar.a();
                        moVar.v(noVar.f29556l);
                        return;
                    case 2:
                        no noVar2 = this.f28153b;
                        noVar2.a();
                        moVar.v(noVar2.f29555k);
                        return;
                    case 3:
                        this.f28153b.a();
                        moVar.o();
                        return;
                    case 4:
                        this.f28153b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        return;
                    default:
                        moVar.j();
                        this.f28153b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, loVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, g6Var);
        this.f29550e = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final no f28153b;

            {
                this.f28153b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28153b.a();
                        moVar.u();
                        return;
                    case 1:
                        no noVar = this.f28153b;
                        noVar.a();
                        moVar.v(noVar.f29556l);
                        return;
                    case 2:
                        no noVar2 = this.f28153b;
                        noVar2.a();
                        moVar.v(noVar2.f29555k);
                        return;
                    case 3:
                        this.f28153b.a();
                        moVar.o();
                        return;
                    case 4:
                        this.f28153b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        return;
                    default:
                        moVar.j();
                        this.f28153b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.w0.c(false, false, loVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, g6Var).setOnClickListener(new ko(this, context, g6Var, i10, moVar, 0));
        org.telegram.ui.ActionBar.w0.c(false, false, loVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, g6Var).setOnClickListener(new View.OnClickListener(this) {
            public final no f28153b;

            {
                this.f28153b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28153b.a();
                        moVar.u();
                        return;
                    case 1:
                        no noVar = this.f28153b;
                        noVar.a();
                        moVar.v(noVar.f29556l);
                        return;
                    case 2:
                        no noVar2 = this.f28153b;
                        noVar2.a();
                        moVar.v(noVar2.f29555k);
                        return;
                    case 3:
                        this.f28153b.a();
                        moVar.o();
                        return;
                    case 4:
                        this.f28153b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        return;
                    default:
                        moVar.j();
                        this.f28153b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, loVar, 0, "", false, g6Var);
        this.f29549c = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final no f28153b;

            {
                this.f28153b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28153b.a();
                        moVar.u();
                        return;
                    case 1:
                        no noVar = this.f28153b;
                        noVar.a();
                        moVar.v(noVar.f29556l);
                        return;
                    case 2:
                        no noVar2 = this.f28153b;
                        noVar2.a();
                        moVar.v(noVar2.f29555k);
                        return;
                    case 3:
                        this.f28153b.a();
                        moVar.o();
                        return;
                    case 4:
                        this.f28153b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        return;
                    default:
                        moVar.j();
                        this.f28153b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29557m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H8, g6Var));
        loVar.a(frameLayout, k7.c6.n(-1, 8));
        TextView textView = new TextView(context);
        this.f29558n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        loVar.a(textView, k7.c6.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.I5, g6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final no f28153b;

            {
                this.f28153b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f28153b.a();
                        moVar.u();
                        return;
                    case 1:
                        no noVar = this.f28153b;
                        noVar.a();
                        moVar.v(noVar.f29556l);
                        return;
                    case 2:
                        no noVar2 = this.f28153b;
                        noVar2.a();
                        moVar.v(noVar2.f29555k);
                        return;
                    case 3:
                        this.f28153b.a();
                        moVar.o();
                        return;
                    case 4:
                        this.f28153b.a();
                        AndroidUtilities.runOnUIThread(new fg(moVar, 27));
                        return;
                    default:
                        moVar.j();
                        this.f28153b.a();
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
        this.f29553i.dismiss();
        this.f29554j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.p2 p2Var, View view, float f10, float f11, boolean z4) {
        float measuredWidth;
        float measuredHeight;
        if (p2Var.getFragmentView() != null) {
            lo loVar = this.f29551f;
            org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(loVar, -2, -2);
            this.h = p1Var;
            p1Var.f22220e = true;
            p1Var.f22219c = 220;
            p1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            loVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f10 - (loVar.getMeasuredWidth() / 2.0f);
                measuredHeight = loVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(p2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f29554j < 200) {
            AndroidUtilities.runOnUIThread(new i5.x(this, j10, j11, hashSet, 12));
            return;
        }
        int i13 = this.f29552g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.g1 g1Var = this.f29548b;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f29549c;
        if (isDialogMuted) {
            g1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22019x6, false);
            g1Var.setVisibility(8);
        } else {
            g1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false);
            g1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j10, j11)) {
                g1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = w02;
        }
        if (this.f29559o == 1) {
            this.f29547a.setVisibility(8);
        }
        if (!isDialogMuted && this.f29559o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.d;
        if (i12 != 0) {
            this.f29556l = i12;
            g1Var3.setVisibility(0);
            g1Var3.getImageView().setImageDrawable(x11.a(i12));
            g1Var3.setText(b(i12));
        } else {
            g1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.f29550e;
        if (i11 != 0) {
            this.f29555k = i11;
            g1Var4.setVisibility(0);
            g1Var4.getImageView().setImageDrawable(x11.a(i11));
            g1Var4.setText(b(i11));
        } else {
            g1Var4.setVisibility(8);
        }
        g1Var2.c(i10, i10);
        g1Var2.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, i10));
        FrameLayout frameLayout = this.f29557m;
        TextView textView = this.f29558n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.k6.f21841n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
