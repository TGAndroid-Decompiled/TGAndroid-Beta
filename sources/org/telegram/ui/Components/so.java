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
public final class so {
    public final org.telegram.ui.ActionBar.f1 f30893a;
    public final org.telegram.ui.ActionBar.f1 f30894b;
    public final org.telegram.ui.ActionBar.f1 f30895c;
    public final org.telegram.ui.ActionBar.f1 d;
    public final org.telegram.ui.ActionBar.f1 f30896e;
    public final qo f30897f;
    public final int f30898g;
    public org.telegram.ui.ActionBar.n1 h;
    public final ro f30899i;
    public long f30900j;
    public int f30901k;
    public int f30902l;
    public final FrameLayout f30903m;
    public final TextView f30904n;
    public int f30905o;

    public so(Context context, int i10, hh0 hh0Var, boolean z10, final ro roVar, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        qo qoVar;
        Integer num;
        this.f30898g = i10;
        this.f30899i = roVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        qo qoVar2 = new qo(context, i11, 0, d6Var, 0);
        qoVar2.U = new Path();
        this.f30897f = qoVar2;
        qoVar2.setFitItems(true);
        if (hh0Var != null) {
            num = 1;
            qoVar = qoVar2;
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, qoVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, d6Var);
            this.f30893a = c10;
            c10.setOnClickListener(new l8(hh0Var, 1));
        } else {
            qoVar = qoVar2;
            num = 1;
        }
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, qoVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, d6Var);
        this.f30894b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final so f29524b;

            {
                this.f29524b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f29524b.a();
                        roVar.r();
                        return;
                    case 1:
                        so soVar = this.f29524b;
                        soVar.a();
                        roVar.t(soVar.f30902l);
                        return;
                    case 2:
                        so soVar2 = this.f29524b;
                        soVar2.a();
                        roVar.t(soVar2.f30901k);
                        return;
                    case 3:
                        this.f29524b.a();
                        roVar.l();
                        return;
                    case 4:
                        this.f29524b.a();
                        AndroidUtilities.runOnUIThread(new qg(roVar, 27));
                        return;
                    default:
                        roVar.j();
                        this.f29524b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, qoVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, d6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final so f29524b;

            {
                this.f29524b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f29524b.a();
                        roVar.r();
                        return;
                    case 1:
                        so soVar = this.f29524b;
                        soVar.a();
                        roVar.t(soVar.f30902l);
                        return;
                    case 2:
                        so soVar2 = this.f29524b;
                        soVar2.a();
                        roVar.t(soVar2.f30901k);
                        return;
                    case 3:
                        this.f29524b.a();
                        roVar.l();
                        return;
                    case 4:
                        this.f29524b.a();
                        AndroidUtilities.runOnUIThread(new qg(roVar, 27));
                        return;
                    default:
                        roVar.j();
                        this.f29524b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, qoVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, d6Var);
        this.f30896e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final so f29524b;

            {
                this.f29524b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f29524b.a();
                        roVar.r();
                        return;
                    case 1:
                        so soVar = this.f29524b;
                        soVar.a();
                        roVar.t(soVar.f30902l);
                        return;
                    case 2:
                        so soVar2 = this.f29524b;
                        soVar2.a();
                        roVar.t(soVar2.f30901k);
                        return;
                    case 3:
                        this.f29524b.a();
                        roVar.l();
                        return;
                    case 4:
                        this.f29524b.a();
                        AndroidUtilities.runOnUIThread(new qg(roVar, 27));
                        return;
                    default:
                        roVar.j();
                        this.f29524b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.v0.c(false, false, qoVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, d6Var).setOnClickListener(new po(this, context, d6Var, i10, roVar, 0));
        org.telegram.ui.ActionBar.v0.c(false, false, qoVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, d6Var).setOnClickListener(new View.OnClickListener(this) {
            public final so f29524b;

            {
                this.f29524b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f29524b.a();
                        roVar.r();
                        return;
                    case 1:
                        so soVar = this.f29524b;
                        soVar.a();
                        roVar.t(soVar.f30902l);
                        return;
                    case 2:
                        so soVar2 = this.f29524b;
                        soVar2.a();
                        roVar.t(soVar2.f30901k);
                        return;
                    case 3:
                        this.f29524b.a();
                        roVar.l();
                        return;
                    case 4:
                        this.f29524b.a();
                        AndroidUtilities.runOnUIThread(new qg(roVar, 27));
                        return;
                    default:
                        roVar.j();
                        this.f29524b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, qoVar, 0, "", false, d6Var);
        this.f30895c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final so f29524b;

            {
                this.f29524b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f29524b.a();
                        roVar.r();
                        return;
                    case 1:
                        so soVar = this.f29524b;
                        soVar.a();
                        roVar.t(soVar.f30902l);
                        return;
                    case 2:
                        so soVar2 = this.f29524b;
                        soVar2.a();
                        roVar.t(soVar2.f30901k);
                        return;
                    case 3:
                        this.f29524b.a();
                        roVar.l();
                        return;
                    case 4:
                        this.f29524b.a();
                        AndroidUtilities.runOnUIThread(new qg(roVar, 27));
                        return;
                    default:
                        roVar.j();
                        this.f29524b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30903m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H8, d6Var));
        qoVar.a(frameLayout, w7.z5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f30904n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        qoVar.a(textView, w7.z5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, d6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final so f29524b;

            {
                this.f29524b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f29524b.a();
                        roVar.r();
                        return;
                    case 1:
                        so soVar = this.f29524b;
                        soVar.a();
                        roVar.t(soVar.f30902l);
                        return;
                    case 2:
                        so soVar2 = this.f29524b;
                        soVar2.a();
                        roVar.t(soVar2.f30901k);
                        return;
                    case 3:
                        this.f29524b.a();
                        roVar.l();
                        return;
                    case 4:
                        this.f29524b.a();
                        AndroidUtilities.runOnUIThread(new qg(roVar, 27));
                        return;
                    default:
                        roVar.j();
                        this.f29524b.a();
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
        this.f30899i.dismiss();
        this.f30900j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.n2 n2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (n2Var.getFragmentView() != null) {
            qo qoVar = this.f30897f;
            org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(qoVar, -2, -2);
            this.h = n1Var;
            n1Var.f21417e = true;
            n1Var.f21416c = 220;
            n1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            qoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f7 - (qoVar.getMeasuredWidth() / 2.0f);
                measuredHeight = qoVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(n2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j3, long j10, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f30900j < 200) {
            AndroidUtilities.runOnUIThread(new a3.g0(this, j3, j10, hashSet, 13));
            return;
        }
        int i13 = this.f30898g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j3, j10);
        org.telegram.ui.ActionBar.f1 f1Var = this.f30894b;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.f30895c;
        if (isDialogMuted) {
            f1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21197x6, false);
            f1Var.setVisibility(8);
        } else {
            f1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false);
            f1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j3, j10)) {
                f1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                f1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = w02;
        }
        if (this.f30905o == 1) {
            this.f30893a.setVisibility(8);
        }
        if (!isDialogMuted && this.f30905o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.d;
        if (i12 != 0) {
            this.f30902l = i12;
            f1Var3.setVisibility(0);
            f1Var3.getImageView().setImageDrawable(u21.a(i12));
            f1Var3.setText(b(i12));
        } else {
            f1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.f1 f1Var4 = this.f30896e;
        if (i11 != 0) {
            this.f30901k = i11;
            f1Var4.setVisibility(0);
            f1Var4.getImageView().setImageDrawable(u21.a(i11));
            f1Var4.setText(b(i11));
        } else {
            f1Var4.setVisibility(8);
        }
        f1Var2.c(i10, i10);
        f1Var2.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.1f, i10));
        FrameLayout frameLayout = this.f30903m;
        TextView textView = this.f30904n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.i6.f21013n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
