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
public final class oo {
    public final org.telegram.ui.ActionBar.f1 f29136a;
    public final org.telegram.ui.ActionBar.f1 f29137b;
    public final org.telegram.ui.ActionBar.f1 f29138c;
    public final org.telegram.ui.ActionBar.f1 d;
    public final org.telegram.ui.ActionBar.f1 f29139e;
    public final mo f29140f;
    public final int f29141g;
    public org.telegram.ui.ActionBar.n1 h;
    public final no f29142i;
    public long f29143j;
    public int f29144k;
    public int f29145l;
    public final FrameLayout f29146m;
    public final TextView f29147n;
    public int f29148o;

    public oo(Context context, int i10, ug0 ug0Var, boolean z10, final no noVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        mo moVar;
        Integer num;
        this.f29141g = i10;
        this.f29142i = noVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        mo moVar2 = new mo(context, i11, 0, f6Var, 0);
        moVar2.U = new Path();
        this.f29140f = moVar2;
        moVar2.setFitItems(true);
        if (ug0Var != null) {
            num = 1;
            moVar = moVar2;
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, moVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, f6Var);
            this.f29136a = c10;
            c10.setOnClickListener(new n8(ug0Var, 1));
        } else {
            moVar = moVar2;
            num = 1;
        }
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, moVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, f6Var);
        this.f29137b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final oo f27859b;

            {
                this.f27859b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f27859b.a();
                        noVar.s();
                        return;
                    case 1:
                        oo ooVar = this.f27859b;
                        ooVar.a();
                        noVar.x(ooVar.f29145l);
                        return;
                    case 2:
                        oo ooVar2 = this.f27859b;
                        ooVar2.a();
                        noVar.x(ooVar2.f29144k);
                        return;
                    case 3:
                        this.f27859b.a();
                        noVar.p();
                        return;
                    case 4:
                        this.f27859b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        return;
                    default:
                        noVar.m();
                        this.f27859b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, moVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, f6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final oo f27859b;

            {
                this.f27859b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f27859b.a();
                        noVar.s();
                        return;
                    case 1:
                        oo ooVar = this.f27859b;
                        ooVar.a();
                        noVar.x(ooVar.f29145l);
                        return;
                    case 2:
                        oo ooVar2 = this.f27859b;
                        ooVar2.a();
                        noVar.x(ooVar2.f29144k);
                        return;
                    case 3:
                        this.f27859b.a();
                        noVar.p();
                        return;
                    case 4:
                        this.f27859b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        return;
                    default:
                        noVar.m();
                        this.f27859b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, moVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, f6Var);
        this.f29139e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final oo f27859b;

            {
                this.f27859b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f27859b.a();
                        noVar.s();
                        return;
                    case 1:
                        oo ooVar = this.f27859b;
                        ooVar.a();
                        noVar.x(ooVar.f29145l);
                        return;
                    case 2:
                        oo ooVar2 = this.f27859b;
                        ooVar2.a();
                        noVar.x(ooVar2.f29144k);
                        return;
                    case 3:
                        this.f27859b.a();
                        noVar.p();
                        return;
                    case 4:
                        this.f27859b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        return;
                    default:
                        noVar.m();
                        this.f27859b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.v0.c(false, false, moVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, f6Var).setOnClickListener(new lo(this, context, f6Var, i10, noVar, 0));
        org.telegram.ui.ActionBar.v0.c(false, false, moVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, f6Var).setOnClickListener(new View.OnClickListener(this) {
            public final oo f27859b;

            {
                this.f27859b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f27859b.a();
                        noVar.s();
                        return;
                    case 1:
                        oo ooVar = this.f27859b;
                        ooVar.a();
                        noVar.x(ooVar.f29145l);
                        return;
                    case 2:
                        oo ooVar2 = this.f27859b;
                        ooVar2.a();
                        noVar.x(ooVar2.f29144k);
                        return;
                    case 3:
                        this.f27859b.a();
                        noVar.p();
                        return;
                    case 4:
                        this.f27859b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        return;
                    default:
                        noVar.m();
                        this.f27859b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, moVar, 0, "", false, f6Var);
        this.f29138c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final oo f27859b;

            {
                this.f27859b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f27859b.a();
                        noVar.s();
                        return;
                    case 1:
                        oo ooVar = this.f27859b;
                        ooVar.a();
                        noVar.x(ooVar.f29145l);
                        return;
                    case 2:
                        oo ooVar2 = this.f27859b;
                        ooVar2.a();
                        noVar.x(ooVar2.f29144k);
                        return;
                    case 3:
                        this.f27859b.a();
                        noVar.p();
                        return;
                    case 4:
                        this.f27859b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        return;
                    default:
                        noVar.m();
                        this.f27859b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29146m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H8, f6Var));
        moVar.a(frameLayout, w7.x5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f29147n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        moVar.a(textView, w7.x5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, f6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final oo f27859b;

            {
                this.f27859b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f27859b.a();
                        noVar.s();
                        return;
                    case 1:
                        oo ooVar = this.f27859b;
                        ooVar.a();
                        noVar.x(ooVar.f29145l);
                        return;
                    case 2:
                        oo ooVar2 = this.f27859b;
                        ooVar2.a();
                        noVar.x(ooVar2.f29144k);
                        return;
                    case 3:
                        this.f27859b.a();
                        noVar.p();
                        return;
                    case 4:
                        this.f27859b.a();
                        AndroidUtilities.runOnUIThread(new pg(noVar, 27));
                        return;
                    default:
                        noVar.m();
                        this.f27859b.a();
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
        org.telegram.ui.ActionBar.n1 n1Var = this.h;
        if (n1Var != null) {
            n1Var.d(true);
            this.h.d(true);
        }
        this.f29142i.dismiss();
        this.f29143j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.n2 n2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (n2Var.getFragmentView() != null) {
            mo moVar = this.f29140f;
            org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(moVar, -2, -2);
            this.h = n1Var;
            n1Var.f21211e = true;
            n1Var.f21210c = 220;
            n1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            moVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f7 - (moVar.getMeasuredWidth() / 2.0f);
                measuredHeight = moVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(n2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j3, long j10, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f29143j < 200) {
            AndroidUtilities.runOnUIThread(new a3.f0(this, j3, j10, hashSet, 11));
            return;
        }
        int i13 = this.f29141g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j3, j10);
        org.telegram.ui.ActionBar.f1 f1Var = this.f29137b;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.f29138c;
        if (isDialogMuted) {
            f1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21025x6, false);
            f1Var.setVisibility(8);
        } else {
            f1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false);
            f1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j3, j10)) {
                f1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                f1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = w02;
        }
        if (this.f29148o == 1) {
            this.f29136a.setVisibility(8);
        }
        if (!isDialogMuted && this.f29148o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.d;
        if (i12 != 0) {
            this.f29145l = i12;
            f1Var3.setVisibility(0);
            f1Var3.getImageView().setImageDrawable(u11.a(i12));
            f1Var3.setText(b(i12));
        } else {
            f1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.f1 f1Var4 = this.f29139e;
        if (i11 != 0) {
            this.f29144k = i11;
            f1Var4.setVisibility(0);
            f1Var4.getImageView().setImageDrawable(u11.a(i11));
            f1Var4.setText(b(i11));
        } else {
            f1Var4.setVisibility(8);
        }
        f1Var2.c(i10, i10);
        f1Var2.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
        FrameLayout frameLayout = this.f29146m;
        TextView textView = this.f29147n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.j6.f20846n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
