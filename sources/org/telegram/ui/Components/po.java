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
public final class po {
    public final org.telegram.ui.ActionBar.f1 f27099a;
    public final org.telegram.ui.ActionBar.f1 f27100b;
    public final org.telegram.ui.ActionBar.f1 f27101c;
    public final org.telegram.ui.ActionBar.f1 d;
    public final org.telegram.ui.ActionBar.f1 e;
    public final no f27102f;
    public final int f27103g;
    public org.telegram.ui.ActionBar.n1 h;
    public final oo f27104i;
    public long f27105j;
    public int f27106k;
    public int f27107l;
    public final FrameLayout f27108m;
    public final TextView f27109n;
    public int f27110o;

    public po(Context context, int i10, ug0 ug0Var, boolean z10, final oo ooVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11;
        no noVar;
        Integer num;
        this.f27103g = i10;
        this.f27104i = ooVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        no noVar2 = new no(context, i11, 0, e6Var, 0);
        noVar2.U = new Path();
        this.f27102f = noVar2;
        noVar2.setFitItems(true);
        if (ug0Var != null) {
            num = 1;
            noVar = noVar2;
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, noVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, e6Var);
            this.f27099a = c10;
            c10.setOnClickListener(new j8(ug0Var, 1));
        } else {
            noVar = noVar2;
            num = 1;
        }
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, noVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, e6Var);
        this.f27100b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final po f25992b;

            {
                this.f25992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25992b.a();
                        ooVar.r();
                        return;
                    case 1:
                        po poVar = this.f25992b;
                        poVar.a();
                        ooVar.t(poVar.f27107l);
                        return;
                    case 2:
                        po poVar2 = this.f25992b;
                        poVar2.a();
                        ooVar.t(poVar2.f27106k);
                        return;
                    case 3:
                        this.f25992b.a();
                        ooVar.o();
                        return;
                    case 4:
                        this.f25992b.a();
                        AndroidUtilities.runOnUIThread(new ng(ooVar, 27));
                        return;
                    default:
                        ooVar.l();
                        this.f25992b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, noVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, e6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final po f25992b;

            {
                this.f25992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25992b.a();
                        ooVar.r();
                        return;
                    case 1:
                        po poVar = this.f25992b;
                        poVar.a();
                        ooVar.t(poVar.f27107l);
                        return;
                    case 2:
                        po poVar2 = this.f25992b;
                        poVar2.a();
                        ooVar.t(poVar2.f27106k);
                        return;
                    case 3:
                        this.f25992b.a();
                        ooVar.o();
                        return;
                    case 4:
                        this.f25992b.a();
                        AndroidUtilities.runOnUIThread(new ng(ooVar, 27));
                        return;
                    default:
                        ooVar.l();
                        this.f25992b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, noVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, e6Var);
        this.e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final po f25992b;

            {
                this.f25992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25992b.a();
                        ooVar.r();
                        return;
                    case 1:
                        po poVar = this.f25992b;
                        poVar.a();
                        ooVar.t(poVar.f27107l);
                        return;
                    case 2:
                        po poVar2 = this.f25992b;
                        poVar2.a();
                        ooVar.t(poVar2.f27106k);
                        return;
                    case 3:
                        this.f25992b.a();
                        ooVar.o();
                        return;
                    case 4:
                        this.f25992b.a();
                        AndroidUtilities.runOnUIThread(new ng(ooVar, 27));
                        return;
                    default:
                        ooVar.l();
                        this.f25992b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.v0.c(false, false, noVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, e6Var).setOnClickListener(new mo(this, context, e6Var, i10, ooVar, 0));
        org.telegram.ui.ActionBar.v0.c(false, false, noVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, e6Var).setOnClickListener(new View.OnClickListener(this) {
            public final po f25992b;

            {
                this.f25992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25992b.a();
                        ooVar.r();
                        return;
                    case 1:
                        po poVar = this.f25992b;
                        poVar.a();
                        ooVar.t(poVar.f27107l);
                        return;
                    case 2:
                        po poVar2 = this.f25992b;
                        poVar2.a();
                        ooVar.t(poVar2.f27106k);
                        return;
                    case 3:
                        this.f25992b.a();
                        ooVar.o();
                        return;
                    case 4:
                        this.f25992b.a();
                        AndroidUtilities.runOnUIThread(new ng(ooVar, 27));
                        return;
                    default:
                        ooVar.l();
                        this.f25992b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, noVar, 0, "", false, e6Var);
        this.f27101c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final po f25992b;

            {
                this.f25992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25992b.a();
                        ooVar.r();
                        return;
                    case 1:
                        po poVar = this.f25992b;
                        poVar.a();
                        ooVar.t(poVar.f27107l);
                        return;
                    case 2:
                        po poVar2 = this.f25992b;
                        poVar2.a();
                        ooVar.t(poVar2.f27106k);
                        return;
                    case 3:
                        this.f25992b.a();
                        ooVar.o();
                        return;
                    case 4:
                        this.f25992b.a();
                        AndroidUtilities.runOnUIThread(new ng(ooVar, 27));
                        return;
                    default:
                        ooVar.l();
                        this.f25992b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27108m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H8, e6Var));
        noVar.a(frameLayout, w7.x5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f27109n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, e6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        noVar.a(textView, w7.x5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, e6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final po f25992b;

            {
                this.f25992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25992b.a();
                        ooVar.r();
                        return;
                    case 1:
                        po poVar = this.f25992b;
                        poVar.a();
                        ooVar.t(poVar.f27107l);
                        return;
                    case 2:
                        po poVar2 = this.f25992b;
                        poVar2.a();
                        ooVar.t(poVar2.f27106k);
                        return;
                    case 3:
                        this.f25992b.a();
                        ooVar.o();
                        return;
                    case 4:
                        this.f25992b.a();
                        AndroidUtilities.runOnUIThread(new ng(ooVar, 27));
                        return;
                    default:
                        ooVar.l();
                        this.f25992b.a();
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
        this.f27104i.dismiss();
        this.f27105j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.n2 n2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (n2Var.getFragmentView() != null) {
            no noVar = this.f27102f;
            org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(noVar, -2, -2);
            this.h = n1Var;
            n1Var.e = true;
            n1Var.f19421c = 220;
            n1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            noVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f7 - (noVar.getMeasuredWidth() / 2.0f);
                measuredHeight = noVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(n2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j3, long j10, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f27105j < 200) {
            AndroidUtilities.runOnUIThread(new a3.g0(this, j3, j10, hashSet, 12));
            return;
        }
        int i13 = this.f27103g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j3, j10);
        org.telegram.ui.ActionBar.f1 f1Var = this.f27100b;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.f27101c;
        if (isDialogMuted) {
            f1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19201x6, false);
            f1Var.setVisibility(8);
        } else {
            f1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false);
            f1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j3, j10)) {
                f1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                f1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = w02;
        }
        if (this.f27110o == 1) {
            this.f27099a.setVisibility(8);
        }
        if (!isDialogMuted && this.f27110o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.d;
        if (i12 != 0) {
            this.f27107l = i12;
            f1Var3.setVisibility(0);
            f1Var3.getImageView().setImageDrawable(v11.a(i12));
            f1Var3.setText(b(i12));
        } else {
            f1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.f1 f1Var4 = this.e;
        if (i11 != 0) {
            this.f27106k = i11;
            f1Var4.setVisibility(0);
            f1Var4.getImageView().setImageDrawable(v11.a(i11));
            f1Var4.setText(b(i11));
        } else {
            f1Var4.setVisibility(8);
        }
        f1Var2.c(i10, i10);
        f1Var2.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.1f, i10));
        FrameLayout frameLayout = this.f27108m;
        TextView textView = this.f27109n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.i6.f19021n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
