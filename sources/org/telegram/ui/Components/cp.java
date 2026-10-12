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
public final class cp {
    public final org.telegram.ui.ActionBar.e1 f24153a;
    public final org.telegram.ui.ActionBar.e1 f24154b;
    public final org.telegram.ui.ActionBar.e1 f24155c;
    public final org.telegram.ui.ActionBar.e1 d;
    public final org.telegram.ui.ActionBar.e1 e;
    public final ap f24156f;
    public final int f24157g;
    public org.telegram.ui.ActionBar.m1 h;
    public final bp f24158i;
    public long f24159j;
    public int f24160k;
    public int f24161l;
    public final FrameLayout f24162m;
    public final TextView f24163n;
    public int f24164o;

    public cp(Context context, int i10, vh0 vh0Var, boolean z10, final bp bpVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        ap apVar;
        int i12;
        Integer num;
        this.f24157g = i10;
        this.f24158i = bpVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        ap apVar2 = new ap(context, i11, 0, c6Var, 0);
        apVar2.U = new Path();
        this.f24156f = apVar2;
        apVar2.setFitItems(true);
        if (vh0Var != null) {
            i12 = 1;
            num = 1;
            apVar = apVar2;
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, apVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, c6Var);
            this.f24153a = c10;
            c10.setOnClickListener(new p8(vh0Var, 1));
        } else {
            apVar = apVar2;
            i12 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, apVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, c6Var);
        this.f24154b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final cp f31664b;

            {
                this.f31664b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31664b.a();
                        bpVar.s();
                        return;
                    case 1:
                        cp cpVar = this.f31664b;
                        cpVar.a();
                        bpVar.y(cpVar.f24161l);
                        return;
                    case 2:
                        cp cpVar2 = this.f31664b;
                        cpVar2.a();
                        bpVar.y(cpVar2.f24160k);
                        return;
                    case 3:
                        this.f31664b.a();
                        bpVar.p();
                        return;
                    case 4:
                        this.f31664b.a();
                        AndroidUtilities.runOnUIThread(new qg(bpVar, 27));
                        return;
                    default:
                        bpVar.m();
                        this.f31664b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, apVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, c6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final cp f31664b;

            {
                this.f31664b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31664b.a();
                        bpVar.s();
                        return;
                    case 1:
                        cp cpVar = this.f31664b;
                        cpVar.a();
                        bpVar.y(cpVar.f24161l);
                        return;
                    case 2:
                        cp cpVar2 = this.f31664b;
                        cpVar2.a();
                        bpVar.y(cpVar2.f24160k);
                        return;
                    case 3:
                        this.f31664b.a();
                        bpVar.p();
                        return;
                    case 4:
                        this.f31664b.a();
                        AndroidUtilities.runOnUIThread(new qg(bpVar, 27));
                        return;
                    default:
                        bpVar.m();
                        this.f31664b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, apVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, c6Var);
        this.e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final cp f31664b;

            {
                this.f31664b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31664b.a();
                        bpVar.s();
                        return;
                    case 1:
                        cp cpVar = this.f31664b;
                        cpVar.a();
                        bpVar.y(cpVar.f24161l);
                        return;
                    case 2:
                        cp cpVar2 = this.f31664b;
                        cpVar2.a();
                        bpVar.y(cpVar2.f24160k);
                        return;
                    case 3:
                        this.f31664b.a();
                        bpVar.p();
                        return;
                    case 4:
                        this.f31664b.a();
                        AndroidUtilities.runOnUIThread(new qg(bpVar, 27));
                        return;
                    default:
                        bpVar.m();
                        this.f31664b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.u0.c(false, false, apVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, c6Var).setOnClickListener(new zo(this, context, c6Var, i10, bpVar, 0));
        org.telegram.ui.ActionBar.u0.c(false, false, apVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, c6Var).setOnClickListener(new View.OnClickListener(this) {
            public final cp f31664b;

            {
                this.f31664b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31664b.a();
                        bpVar.s();
                        return;
                    case 1:
                        cp cpVar = this.f31664b;
                        cpVar.a();
                        bpVar.y(cpVar.f24161l);
                        return;
                    case 2:
                        cp cpVar2 = this.f31664b;
                        cpVar2.a();
                        bpVar.y(cpVar2.f24160k);
                        return;
                    case 3:
                        this.f31664b.a();
                        bpVar.p();
                        return;
                    case 4:
                        this.f31664b.a();
                        AndroidUtilities.runOnUIThread(new qg(bpVar, 27));
                        return;
                    default:
                        bpVar.m();
                        this.f31664b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, apVar, 0, "", false, c6Var);
        this.f24155c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final cp f31664b;

            {
                this.f31664b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31664b.a();
                        bpVar.s();
                        return;
                    case 1:
                        cp cpVar = this.f31664b;
                        cpVar.a();
                        bpVar.y(cpVar.f24161l);
                        return;
                    case 2:
                        cp cpVar2 = this.f31664b;
                        cpVar2.a();
                        bpVar.y(cpVar2.f24160k);
                        return;
                    case 3:
                        this.f31664b.a();
                        bpVar.p();
                        return;
                    case 4:
                        this.f31664b.a();
                        AndroidUtilities.runOnUIThread(new qg(bpVar, 27));
                        return;
                    default:
                        bpVar.m();
                        this.f31664b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24162m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.H8, c6Var));
        apVar.a(frameLayout, w7.a6.n(-1, 8));
        TextView textView = new TextView(context);
        this.f24163n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(i12, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        apVar.a(textView, w7.a6.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.I5, c6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final cp f31664b;

            {
                this.f31664b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f31664b.a();
                        bpVar.s();
                        return;
                    case 1:
                        cp cpVar = this.f31664b;
                        cpVar.a();
                        bpVar.y(cpVar.f24161l);
                        return;
                    case 2:
                        cp cpVar2 = this.f31664b;
                        cpVar2.a();
                        bpVar.y(cpVar2.f24160k);
                        return;
                    case 3:
                        this.f31664b.a();
                        bpVar.p();
                        return;
                    case 4:
                        this.f31664b.a();
                        AndroidUtilities.runOnUIThread(new qg(bpVar, 27));
                        return;
                    default:
                        bpVar.m();
                        this.f31664b.a();
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
        this.f24158i.dismiss();
        this.f24159j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.m2 m2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (m2Var.getFragmentView() != null) {
            ap apVar = this.f24156f;
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(apVar, -2, -2);
            this.h = m1Var;
            m1Var.e = true;
            m1Var.f20521c = 220;
            m1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            apVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f7 - (apVar.getMeasuredWidth() / 2.0f);
                measuredHeight = apVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(m2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f24159j < 200) {
            AndroidUtilities.runOnUIThread(new a3.h0(this, j10, j11, hashSet, 13));
            return;
        }
        int i13 = this.f24157g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.e1 e1Var = this.f24154b;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f24155c;
        if (isDialogMuted) {
            e1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20270x6, false);
            e1Var.setVisibility(8);
        } else {
            e1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false);
            e1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j10, j11)) {
                e1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = x02;
        }
        if (this.f24164o == 1) {
            this.f24153a.setVisibility(8);
        }
        if (!isDialogMuted && this.f24164o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.d;
        if (i12 != 0) {
            this.f24161l = i12;
            e1Var3.setVisibility(0);
            e1Var3.getImageView().setImageDrawable(w21.a(i12));
            e1Var3.setText(b(i12));
        } else {
            e1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.e1 e1Var4 = this.e;
        if (i11 != 0) {
            this.f24160k = i11;
            e1Var4.setVisibility(0);
            e1Var4.getImageView().setImageDrawable(w21.a(i11));
            e1Var4.setText(b(i11));
        } else {
            e1Var4.setVisibility(8);
        }
        e1Var2.c(i10, i10);
        e1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.1f, i10));
        FrameLayout frameLayout = this.f24162m;
        TextView textView = this.f24163n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.g6.f20084n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
