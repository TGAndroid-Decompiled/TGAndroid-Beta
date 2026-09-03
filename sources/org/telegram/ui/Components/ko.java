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
public final class ko {
    public final org.telegram.ui.ActionBar.g1 f26360a;
    public final org.telegram.ui.ActionBar.g1 f26361b;
    public final org.telegram.ui.ActionBar.g1 f26362c;
    public final org.telegram.ui.ActionBar.g1 d;
    public final org.telegram.ui.ActionBar.g1 e;
    public final io f26363f;
    public final int f26364g;
    public org.telegram.ui.ActionBar.p1 h;
    public final jo f26365i;
    public long f26366j;
    public int f26367k;
    public int f26368l;
    public final FrameLayout f26369m;
    public final TextView f26370n;
    public int f26371o;

    public ko(Context context, int i10, bh0 bh0Var, boolean z4, final jo joVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        io ioVar;
        Integer num;
        this.f26364g = i10;
        this.f26365i = joVar;
        if (z4) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        io ioVar2 = new io(context, i11, 0, f6Var, 0);
        ioVar2.R = new Path();
        this.f26363f = ioVar2;
        ioVar2.setFitItems(true);
        if (bh0Var != null) {
            num = 1;
            ioVar = ioVar2;
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, ioVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, f6Var);
            this.f26360a = c3;
            c3.setOnClickListener(new e8(bh0Var, 1));
        } else {
            ioVar = ioVar2;
            num = 1;
        }
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, ioVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, f6Var);
        this.f26361b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final ko f25210b;

            {
                this.f25210b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25210b.a();
                        joVar.o();
                        return;
                    case 1:
                        ko koVar = this.f25210b;
                        koVar.a();
                        joVar.s(koVar.f26368l);
                        return;
                    case 2:
                        ko koVar2 = this.f25210b;
                        koVar2.a();
                        joVar.s(koVar2.f26367k);
                        return;
                    case 3:
                        this.f25210b.a();
                        joVar.l();
                        return;
                    case 4:
                        this.f25210b.a();
                        AndroidUtilities.runOnUIThread(new fg(joVar, 27));
                        return;
                    default:
                        joVar.j();
                        this.f25210b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, ioVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, f6Var);
        this.d = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final ko f25210b;

            {
                this.f25210b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25210b.a();
                        joVar.o();
                        return;
                    case 1:
                        ko koVar = this.f25210b;
                        koVar.a();
                        joVar.s(koVar.f26368l);
                        return;
                    case 2:
                        ko koVar2 = this.f25210b;
                        koVar2.a();
                        joVar.s(koVar2.f26367k);
                        return;
                    case 3:
                        this.f25210b.a();
                        joVar.l();
                        return;
                    case 4:
                        this.f25210b.a();
                        AndroidUtilities.runOnUIThread(new fg(joVar, 27));
                        return;
                    default:
                        joVar.j();
                        this.f25210b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, ioVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, f6Var);
        this.e = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final ko f25210b;

            {
                this.f25210b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25210b.a();
                        joVar.o();
                        return;
                    case 1:
                        ko koVar = this.f25210b;
                        koVar.a();
                        joVar.s(koVar.f26368l);
                        return;
                    case 2:
                        ko koVar2 = this.f25210b;
                        koVar2.a();
                        joVar.s(koVar2.f26367k);
                        return;
                    case 3:
                        this.f25210b.a();
                        joVar.l();
                        return;
                    case 4:
                        this.f25210b.a();
                        AndroidUtilities.runOnUIThread(new fg(joVar, 27));
                        return;
                    default:
                        joVar.j();
                        this.f25210b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.w0.c(false, false, ioVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, f6Var).setOnClickListener(new ho(this, context, f6Var, i10, joVar, 0));
        org.telegram.ui.ActionBar.w0.c(false, false, ioVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, f6Var).setOnClickListener(new View.OnClickListener(this) {
            public final ko f25210b;

            {
                this.f25210b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25210b.a();
                        joVar.o();
                        return;
                    case 1:
                        ko koVar = this.f25210b;
                        koVar.a();
                        joVar.s(koVar.f26368l);
                        return;
                    case 2:
                        ko koVar2 = this.f25210b;
                        koVar2.a();
                        joVar.s(koVar2.f26367k);
                        return;
                    case 3:
                        this.f25210b.a();
                        joVar.l();
                        return;
                    case 4:
                        this.f25210b.a();
                        AndroidUtilities.runOnUIThread(new fg(joVar, 27));
                        return;
                    default:
                        joVar.j();
                        this.f25210b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, ioVar, 0, "", false, f6Var);
        this.f26362c = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final ko f25210b;

            {
                this.f25210b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25210b.a();
                        joVar.o();
                        return;
                    case 1:
                        ko koVar = this.f25210b;
                        koVar.a();
                        joVar.s(koVar.f26368l);
                        return;
                    case 2:
                        ko koVar2 = this.f25210b;
                        koVar2.a();
                        joVar.s(koVar2.f26367k);
                        return;
                    case 3:
                        this.f25210b.a();
                        joVar.l();
                        return;
                    case 4:
                        this.f25210b.a();
                        AndroidUtilities.runOnUIThread(new fg(joVar, 27));
                        return;
                    default:
                        joVar.j();
                        this.f25210b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26369m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H8, f6Var));
        ioVar.a(frameLayout, k7.b6.n(-1, 8));
        TextView textView = new TextView(context);
        this.f26370n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        ioVar.a(textView, k7.b6.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ko f25210b;

            {
                this.f25210b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25210b.a();
                        joVar.o();
                        return;
                    case 1:
                        ko koVar = this.f25210b;
                        koVar.a();
                        joVar.s(koVar.f26368l);
                        return;
                    case 2:
                        ko koVar2 = this.f25210b;
                        koVar2.a();
                        joVar.s(koVar2.f26367k);
                        return;
                    case 3:
                        this.f25210b.a();
                        joVar.l();
                        return;
                    case 4:
                        this.f25210b.a();
                        AndroidUtilities.runOnUIThread(new fg(joVar, 27));
                        return;
                    default:
                        joVar.j();
                        this.f25210b.a();
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
        this.f26365i.dismiss();
        this.f26366j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.p2 p2Var, View view, float f10, float f11, boolean z4) {
        float measuredWidth;
        float measuredHeight;
        if (p2Var.getFragmentView() != null) {
            io ioVar = this.f26363f;
            org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(ioVar, -2, -2);
            this.h = p1Var;
            p1Var.e = true;
            p1Var.f20492c = 220;
            p1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            ioVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f10 - (ioVar.getMeasuredWidth() / 2.0f);
                measuredHeight = ioVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(p2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f26366j < 200) {
            AndroidUtilities.runOnUIThread(new i5.x(this, j10, j11, hashSet, 12));
            return;
        }
        int i13 = this.f26364g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.g1 g1Var = this.f26361b;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f26362c;
        if (isDialogMuted) {
            g1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20238x6, false);
            g1Var.setVisibility(8);
        } else {
            g1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false);
            g1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j10, j11)) {
                g1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = w02;
        }
        if (this.f26371o == 1) {
            this.f26360a.setVisibility(8);
        }
        if (!isDialogMuted && this.f26371o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.d;
        if (i12 != 0) {
            this.f26368l = i12;
            g1Var3.setVisibility(0);
            g1Var3.getImageView().setImageDrawable(x11.a(i12));
            g1Var3.setText(b(i12));
        } else {
            g1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.e;
        if (i11 != 0) {
            this.f26367k = i11;
            g1Var4.setVisibility(0);
            g1Var4.getImageView().setImageDrawable(x11.a(i11));
            g1Var4.setText(b(i11));
        } else {
            g1Var4.setVisibility(8);
        }
        g1Var2.c(i10, i10);
        g1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
        FrameLayout frameLayout = this.f26369m;
        TextView textView = this.f26370n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.j6.f20060n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
