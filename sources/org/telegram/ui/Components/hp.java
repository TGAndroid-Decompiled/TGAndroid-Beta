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
public final class hp {
    public final org.telegram.ui.ActionBar.e1 f26850a;
    public final org.telegram.ui.ActionBar.e1 f26851b;
    public final org.telegram.ui.ActionBar.e1 f26852c;
    public final org.telegram.ui.ActionBar.e1 d;
    public final org.telegram.ui.ActionBar.e1 f26853e;
    public final fp f26854f;
    public final int f26855g;
    public org.telegram.ui.ActionBar.m1 h;
    public final gp f26856i;
    public long f26857j;
    public int f26858k;
    public int f26859l;
    public final FrameLayout f26860m;
    public final TextView f26861n;
    public int f26862o;

    public hp(Context context, int i10, bi0 bi0Var, boolean z10, final gp gpVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        fp fpVar;
        int i12;
        Integer num;
        this.f26855g = i10;
        this.f26856i = gpVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        fp fpVar2 = new fp(context, i11, 0, c6Var, 0);
        fpVar2.U = new Path();
        this.f26854f = fpVar2;
        fpVar2.setFitItems(true);
        if (bi0Var != null) {
            i12 = 1;
            num = 1;
            fpVar = fpVar2;
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, fpVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, c6Var);
            this.f26850a = c10;
            c10.setOnClickListener(new n8(bi0Var, 1));
        } else {
            fpVar = fpVar2;
            i12 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, fpVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, c6Var);
        this.f26851b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final hp f25447b;

            {
                this.f25447b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25447b.a();
                        gpVar.q();
                        return;
                    case 1:
                        hp hpVar = this.f25447b;
                        hpVar.a();
                        gpVar.t(hpVar.f26859l);
                        return;
                    case 2:
                        hp hpVar2 = this.f25447b;
                        hpVar2.a();
                        gpVar.t(hpVar2.f26858k);
                        return;
                    case 3:
                        this.f25447b.a();
                        gpVar.l();
                        return;
                    case 4:
                        this.f25447b.a();
                        AndroidUtilities.runOnUIThread(new tg(gpVar, 27));
                        return;
                    default:
                        gpVar.j();
                        this.f25447b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, fpVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, c6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final hp f25447b;

            {
                this.f25447b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25447b.a();
                        gpVar.q();
                        return;
                    case 1:
                        hp hpVar = this.f25447b;
                        hpVar.a();
                        gpVar.t(hpVar.f26859l);
                        return;
                    case 2:
                        hp hpVar2 = this.f25447b;
                        hpVar2.a();
                        gpVar.t(hpVar2.f26858k);
                        return;
                    case 3:
                        this.f25447b.a();
                        gpVar.l();
                        return;
                    case 4:
                        this.f25447b.a();
                        AndroidUtilities.runOnUIThread(new tg(gpVar, 27));
                        return;
                    default:
                        gpVar.j();
                        this.f25447b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, fpVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, c6Var);
        this.f26853e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final hp f25447b;

            {
                this.f25447b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25447b.a();
                        gpVar.q();
                        return;
                    case 1:
                        hp hpVar = this.f25447b;
                        hpVar.a();
                        gpVar.t(hpVar.f26859l);
                        return;
                    case 2:
                        hp hpVar2 = this.f25447b;
                        hpVar2.a();
                        gpVar.t(hpVar2.f26858k);
                        return;
                    case 3:
                        this.f25447b.a();
                        gpVar.l();
                        return;
                    case 4:
                        this.f25447b.a();
                        AndroidUtilities.runOnUIThread(new tg(gpVar, 27));
                        return;
                    default:
                        gpVar.j();
                        this.f25447b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.u0.c(false, false, fpVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, c6Var).setOnClickListener(new ep(this, context, c6Var, i10, gpVar, 0));
        org.telegram.ui.ActionBar.u0.c(false, false, fpVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, c6Var).setOnClickListener(new View.OnClickListener(this) {
            public final hp f25447b;

            {
                this.f25447b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25447b.a();
                        gpVar.q();
                        return;
                    case 1:
                        hp hpVar = this.f25447b;
                        hpVar.a();
                        gpVar.t(hpVar.f26859l);
                        return;
                    case 2:
                        hp hpVar2 = this.f25447b;
                        hpVar2.a();
                        gpVar.t(hpVar2.f26858k);
                        return;
                    case 3:
                        this.f25447b.a();
                        gpVar.l();
                        return;
                    case 4:
                        this.f25447b.a();
                        AndroidUtilities.runOnUIThread(new tg(gpVar, 27));
                        return;
                    default:
                        gpVar.j();
                        this.f25447b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, fpVar, 0, "", false, c6Var);
        this.f26852c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final hp f25447b;

            {
                this.f25447b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25447b.a();
                        gpVar.q();
                        return;
                    case 1:
                        hp hpVar = this.f25447b;
                        hpVar.a();
                        gpVar.t(hpVar.f26859l);
                        return;
                    case 2:
                        hp hpVar2 = this.f25447b;
                        hpVar2.a();
                        gpVar.t(hpVar2.f26858k);
                        return;
                    case 3:
                        this.f25447b.a();
                        gpVar.l();
                        return;
                    case 4:
                        this.f25447b.a();
                        AndroidUtilities.runOnUIThread(new tg(gpVar, 27));
                        return;
                    default:
                        gpVar.j();
                        this.f25447b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26860m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H8, c6Var));
        fpVar.a(frameLayout, w7.w5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f26861n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(i12, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, c6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        fpVar.a(textView, w7.w5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, c6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final hp f25447b;

            {
                this.f25447b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f25447b.a();
                        gpVar.q();
                        return;
                    case 1:
                        hp hpVar = this.f25447b;
                        hpVar.a();
                        gpVar.t(hpVar.f26859l);
                        return;
                    case 2:
                        hp hpVar2 = this.f25447b;
                        hpVar2.a();
                        gpVar.t(hpVar2.f26858k);
                        return;
                    case 3:
                        this.f25447b.a();
                        gpVar.l();
                        return;
                    case 4:
                        this.f25447b.a();
                        AndroidUtilities.runOnUIThread(new tg(gpVar, 27));
                        return;
                    default:
                        gpVar.j();
                        this.f25447b.a();
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
        this.f26856i.dismiss();
        this.f26857j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.m2 m2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (m2Var.getFragmentView() != null) {
            fp fpVar = this.f26854f;
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(fpVar, -2, -2);
            this.h = m1Var;
            m1Var.f21147e = true;
            m1Var.f21146c = 220;
            m1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            fpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f7 - (fpVar.getMeasuredWidth() / 2.0f);
                measuredHeight = fpVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(m2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j3, long j10, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f26857j < 200) {
            AndroidUtilities.runOnUIThread(new a3.g0(this, j3, j10, hashSet, 12));
            return;
        }
        int i13 = this.f26855g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j3, j10);
        org.telegram.ui.ActionBar.e1 e1Var = this.f26851b;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f26852c;
        if (isDialogMuted) {
            e1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20930x6, false);
            e1Var.setVisibility(8);
        } else {
            e1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false);
            e1Var.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j3, j10)) {
                e1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = x02;
        }
        if (this.f26862o == 1) {
            this.f26850a.setVisibility(8);
        }
        if (!isDialogMuted && this.f26862o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.d;
        if (i12 != 0) {
            this.f26859l = i12;
            e1Var3.setVisibility(0);
            e1Var3.getImageView().setImageDrawable(g31.a(i12));
            e1Var3.setText(b(i12));
        } else {
            e1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.e1 e1Var4 = this.f26853e;
        if (i11 != 0) {
            this.f26858k = i11;
            e1Var4.setVisibility(0);
            e1Var4.getImageView().setImageDrawable(g31.a(i11));
            e1Var4.setText(b(i11));
        } else {
            e1Var4.setVisibility(8);
        }
        e1Var2.c(i10, i10);
        e1Var2.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, i10));
        FrameLayout frameLayout = this.f26860m;
        TextView textView = this.f26861n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.h6.f20745n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
