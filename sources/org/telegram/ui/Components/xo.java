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
public final class xo {
    public final org.telegram.ui.ActionBar.e1 f32665a;
    public final org.telegram.ui.ActionBar.e1 f32666b;
    public final org.telegram.ui.ActionBar.e1 f32667c;
    public final org.telegram.ui.ActionBar.e1 d;
    public final org.telegram.ui.ActionBar.e1 e;
    public final vo f32668f;
    public final int f32669g;
    public org.telegram.ui.ActionBar.m1 h;
    public final wo f32670i;
    public long f32671j;
    public int f32672k;
    public int f32673l;
    public final FrameLayout f32674m;
    public final TextView f32675n;
    public int f32676o;

    public xo(Context context, int i10, sh0 sh0Var, boolean z10, final wo woVar, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        vo voVar;
        int i12;
        Integer num;
        this.f32669g = i10;
        this.f32670i = woVar;
        if (z10) {
            i11 = R.drawable.popup_fixed_alert;
        } else {
            i11 = 0;
        }
        vo voVar2 = new vo(context, i11, 0, g6Var, 0);
        voVar2.U = new Path();
        this.f32668f = voVar2;
        voVar2.setFitItems(true);
        if (sh0Var != null) {
            i12 = 1;
            num = 1;
            voVar = voVar2;
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, voVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, g6Var);
            this.f32665a = c10;
            c10.setOnClickListener(new k8(sh0Var, 1));
        } else {
            voVar = voVar2;
            i12 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, voVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, g6Var);
        this.f32666b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final xo f30867b;

            {
                this.f30867b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f30867b.a();
                        woVar.t();
                        return;
                    case 1:
                        xo xoVar = this.f30867b;
                        xoVar.a();
                        woVar.v(xoVar.f32673l);
                        return;
                    case 2:
                        xo xoVar2 = this.f30867b;
                        xoVar2.a();
                        woVar.v(xoVar2.f32672k);
                        return;
                    case 3:
                        this.f30867b.a();
                        woVar.p();
                        return;
                    case 4:
                        this.f30867b.a();
                        AndroidUtilities.runOnUIThread(new ng(woVar, 28));
                        return;
                    default:
                        woVar.m();
                        this.f30867b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, voVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, g6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final xo f30867b;

            {
                this.f30867b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f30867b.a();
                        woVar.t();
                        return;
                    case 1:
                        xo xoVar = this.f30867b;
                        xoVar.a();
                        woVar.v(xoVar.f32673l);
                        return;
                    case 2:
                        xo xoVar2 = this.f30867b;
                        xoVar2.a();
                        woVar.v(xoVar2.f32672k);
                        return;
                    case 3:
                        this.f30867b.a();
                        woVar.p();
                        return;
                    case 4:
                        this.f30867b.a();
                        AndroidUtilities.runOnUIThread(new ng(woVar, 28));
                        return;
                    default:
                        woVar.m();
                        this.f30867b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, voVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, g6Var);
        this.e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final xo f30867b;

            {
                this.f30867b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f30867b.a();
                        woVar.t();
                        return;
                    case 1:
                        xo xoVar = this.f30867b;
                        xoVar.a();
                        woVar.v(xoVar.f32673l);
                        return;
                    case 2:
                        xo xoVar2 = this.f30867b;
                        xoVar2.a();
                        woVar.v(xoVar2.f32672k);
                        return;
                    case 3:
                        this.f30867b.a();
                        woVar.p();
                        return;
                    case 4:
                        this.f30867b.a();
                        AndroidUtilities.runOnUIThread(new ng(woVar, 28));
                        return;
                    default:
                        woVar.m();
                        this.f30867b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.u0.c(false, false, voVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, g6Var).setOnClickListener(new uo(this, context, g6Var, i10, woVar, 0));
        org.telegram.ui.ActionBar.u0.c(false, false, voVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, g6Var).setOnClickListener(new View.OnClickListener(this) {
            public final xo f30867b;

            {
                this.f30867b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f30867b.a();
                        woVar.t();
                        return;
                    case 1:
                        xo xoVar = this.f30867b;
                        xoVar.a();
                        woVar.v(xoVar.f32673l);
                        return;
                    case 2:
                        xo xoVar2 = this.f30867b;
                        xoVar2.a();
                        woVar.v(xoVar2.f32672k);
                        return;
                    case 3:
                        this.f30867b.a();
                        woVar.p();
                        return;
                    case 4:
                        this.f30867b.a();
                        AndroidUtilities.runOnUIThread(new ng(woVar, 28));
                        return;
                    default:
                        woVar.m();
                        this.f30867b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, voVar, 0, "", false, g6Var);
        this.f32667c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final xo f30867b;

            {
                this.f30867b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f30867b.a();
                        woVar.t();
                        return;
                    case 1:
                        xo xoVar = this.f30867b;
                        xoVar.a();
                        woVar.v(xoVar.f32673l);
                        return;
                    case 2:
                        xo xoVar2 = this.f30867b;
                        xoVar2.a();
                        woVar.v(xoVar2.f32672k);
                        return;
                    case 3:
                        this.f30867b.a();
                        woVar.p();
                        return;
                    case 4:
                        this.f30867b.a();
                        AndroidUtilities.runOnUIThread(new ng(woVar, 28));
                        return;
                    default:
                        woVar.m();
                        this.f30867b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32674m = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.H8, frameLayout, g6Var);
        voVar.a(frameLayout, w7.z5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f32675n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(i12, 13.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.E8, g6Var);
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        voVar.a(textView, w7.z5.n(-2, -2));
        int i13 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i13, g6Var), 0, 6);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        textView.setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(textView, Z, null, O, g6Var);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final xo f30867b;

            {
                this.f30867b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f30867b.a();
                        woVar.t();
                        return;
                    case 1:
                        xo xoVar = this.f30867b;
                        xoVar.a();
                        woVar.v(xoVar.f32673l);
                        return;
                    case 2:
                        xo xoVar2 = this.f30867b;
                        xoVar2.a();
                        woVar.v(xoVar2.f32672k);
                        return;
                    case 3:
                        this.f30867b.a();
                        woVar.p();
                        return;
                    case 4:
                        this.f30867b.a();
                        AndroidUtilities.runOnUIThread(new ng(woVar, 28));
                        return;
                    default:
                        woVar.m();
                        this.f30867b.a();
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
        this.f32670i.dismiss();
        this.f32671j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.o2 o2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (o2Var.getFragmentView() != null) {
            vo voVar = this.f32668f;
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(voVar, -2, -2);
            this.h = m1Var;
            m1Var.e = true;
            m1Var.f21632c = 220;
            m1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            voVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f7 - (voVar.getMeasuredWidth() / 2.0f);
                measuredHeight = voVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(o2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f32671j < 200) {
            AndroidUtilities.runOnUIThread(new a3.h0(this, j10, j11, hashSet, 13));
            return;
        }
        int i13 = this.f32669g;
        boolean isDialogMuted = MessagesController.getInstance(i13).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.e1 e1Var = this.f32667c;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f32666b;
        if (isDialogMuted) {
            e1Var.j(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i10 = org.telegram.ui.ActionBar.k6.f21554x6;
            e1Var2.setVisibility(8);
        } else {
            e1Var.j(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int i14 = org.telegram.ui.ActionBar.k6.f21422q7;
            e1Var2.setVisibility(0);
            if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j10, j11)) {
                e1Var2.j(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                e1Var2.j(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i10 = i14;
        }
        if (this.f32676o == 1) {
            this.f32665a.setVisibility(8);
        }
        if (!isDialogMuted && this.f32676o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i13);
            i12 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.e1 e1Var3 = this.d;
        if (i12 != 0) {
            this.f32673l = i12;
            e1Var3.setVisibility(0);
            e1Var3.getImageView().setImageDrawable(v21.a(i12));
            e1Var3.setText(b(i12));
        } else {
            e1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.e1 e1Var4 = this.e;
        if (i11 != 0) {
            this.f32672k = i11;
            e1Var4.setVisibility(0);
            e1Var4.getImageView().setImageDrawable(v21.a(i11));
            e1Var4.setText(b(i11));
        } else {
            e1Var4.setVisibility(8);
        }
        c(e1Var, i10);
        FrameLayout frameLayout = this.f32674m;
        TextView textView = this.f32675n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.k6.f21367n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
