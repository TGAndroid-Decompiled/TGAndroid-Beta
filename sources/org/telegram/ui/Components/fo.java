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
public final class fo {
    public final org.telegram.ui.ActionBar.g1 f28516a;
    public final org.telegram.ui.ActionBar.g1 f28517b;
    public final org.telegram.ui.ActionBar.g1 f28518c;
    public final org.telegram.ui.ActionBar.g1 d;
    public final org.telegram.ui.ActionBar.g1 f28519e;
    public final co f28520f;
    public final int f28521g;
    public org.telegram.ui.ActionBar.o1 h;
    public final eo f28522i;
    public long f28523j;
    public int f28524k;
    public int f28525l;
    public final FrameLayout f28526m;
    public final TextView f28527n;
    public int f28528o;

    public fo(Context context, int i9, fg0 fg0Var, boolean z10, final eo eoVar, org.telegram.ui.ActionBar.b6 b6Var) {
        int i10;
        co coVar;
        Integer num;
        this.f28521g = i9;
        this.f28522i = eoVar;
        if (z10) {
            i10 = R.drawable.popup_fixed_alert;
        } else {
            i10 = 0;
        }
        co coVar2 = new co(context, i10, 0, b6Var, 0);
        coVar2.Q = new Path();
        this.f28520f = coVar2;
        coVar2.setFitItems(true);
        if (fg0Var != null) {
            num = 1;
            coVar = coVar2;
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, coVar, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, b6Var);
            this.f28516a = c10;
            c10.setOnClickListener(new e8(fg0Var, 1));
        } else {
            coVar = coVar2;
            num = 1;
        }
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, coVar, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, b6Var);
        this.f28517b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final fo f26873b;

            {
                this.f26873b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26873b.a();
                        eoVar.w();
                        return;
                    case 1:
                        fo foVar = this.f26873b;
                        foVar.a();
                        eoVar.A(foVar.f28525l);
                        return;
                    case 2:
                        fo foVar2 = this.f26873b;
                        foVar2.a();
                        eoVar.A(foVar2.f28524k);
                        return;
                    case 3:
                        this.f26873b.a();
                        eoVar.s();
                        return;
                    case 4:
                        this.f26873b.a();
                        AndroidUtilities.runOnUIThread(new fg(eoVar, 27));
                        return;
                    default:
                        eoVar.o();
                        this.f26873b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, coVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, b6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final fo f26873b;

            {
                this.f26873b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26873b.a();
                        eoVar.w();
                        return;
                    case 1:
                        fo foVar = this.f26873b;
                        foVar.a();
                        eoVar.A(foVar.f28525l);
                        return;
                    case 2:
                        fo foVar2 = this.f26873b;
                        foVar2.a();
                        eoVar.A(foVar2.f28524k);
                        return;
                    case 3:
                        this.f26873b.a();
                        eoVar.s();
                        return;
                    case 4:
                        this.f26873b.a();
                        AndroidUtilities.runOnUIThread(new fg(eoVar, 27));
                        return;
                    default:
                        eoVar.o();
                        this.f26873b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, coVar, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, b6Var);
        this.f28519e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final fo f26873b;

            {
                this.f26873b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26873b.a();
                        eoVar.w();
                        return;
                    case 1:
                        fo foVar = this.f26873b;
                        foVar.a();
                        eoVar.A(foVar.f28525l);
                        return;
                    case 2:
                        fo foVar2 = this.f26873b;
                        foVar2.a();
                        eoVar.A(foVar2.f28524k);
                        return;
                    case 3:
                        this.f26873b.a();
                        eoVar.s();
                        return;
                    case 4:
                        this.f26873b.a();
                        AndroidUtilities.runOnUIThread(new fg(eoVar, 27));
                        return;
                    default:
                        eoVar.o();
                        this.f26873b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.w0.c(false, false, coVar, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, b6Var).setOnClickListener(new bo(this, context, b6Var, i9, eoVar, 0));
        org.telegram.ui.ActionBar.w0.c(false, false, coVar, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, b6Var).setOnClickListener(new View.OnClickListener(this) {
            public final fo f26873b;

            {
                this.f26873b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26873b.a();
                        eoVar.w();
                        return;
                    case 1:
                        fo foVar = this.f26873b;
                        foVar.a();
                        eoVar.A(foVar.f28525l);
                        return;
                    case 2:
                        fo foVar2 = this.f26873b;
                        foVar2.a();
                        eoVar.A(foVar2.f28524k);
                        return;
                    case 3:
                        this.f26873b.a();
                        eoVar.s();
                        return;
                    case 4:
                        this.f26873b.a();
                        AndroidUtilities.runOnUIThread(new fg(eoVar, 27));
                        return;
                    default:
                        eoVar.o();
                        this.f26873b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, coVar, 0, "", false, b6Var);
        this.f28518c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final fo f26873b;

            {
                this.f26873b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26873b.a();
                        eoVar.w();
                        return;
                    case 1:
                        fo foVar = this.f26873b;
                        foVar.a();
                        eoVar.A(foVar.f28525l);
                        return;
                    case 2:
                        fo foVar2 = this.f26873b;
                        foVar2.a();
                        eoVar.A(foVar2.f28524k);
                        return;
                    case 3:
                        this.f26873b.a();
                        eoVar.s();
                        return;
                    case 4:
                        this.f26873b.a();
                        AndroidUtilities.runOnUIThread(new fg(eoVar, 27));
                        return;
                    default:
                        eoVar.o();
                        this.f26873b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28526m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H8, b6Var));
        coVar.a(frameLayout, g7.e6.n(-1, 8));
        TextView textView = new TextView(context);
        this.f28527n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var));
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        coVar.a(textView, g7.e6.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, b6Var), 0, 6));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final fo f26873b;

            {
                this.f26873b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f26873b.a();
                        eoVar.w();
                        return;
                    case 1:
                        fo foVar = this.f26873b;
                        foVar.a();
                        eoVar.A(foVar.f28525l);
                        return;
                    case 2:
                        fo foVar2 = this.f26873b;
                        foVar2.a();
                        eoVar.A(foVar2.f28524k);
                        return;
                    case 3:
                        this.f26873b.a();
                        eoVar.s();
                        return;
                    case 4:
                        this.f26873b.a();
                        AndroidUtilities.runOnUIThread(new fg(eoVar, 27));
                        return;
                    default:
                        eoVar.o();
                        this.f26873b.a();
                        return;
                }
            }
        });
    }

    public static String b(int i9) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = i9 / 86400;
        int i11 = i9 - (86400 * i10);
        int i12 = i11 / 3600;
        int i13 = (i11 - (i12 * 3600)) / 60;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(LocaleController.getString(R.string.SecretChatTimerDays));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(LocaleController.getString(R.string.SecretChatTimerHours));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
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
        this.f28522i.dismiss();
        this.f28523j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.o2 o2Var, View view, float f10, float f11, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (o2Var.getFragmentView() != null) {
            co coVar = this.f28520f;
            org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(coVar, -2, -2);
            this.h = o1Var;
            o1Var.f23690e = true;
            o1Var.f23689c = 220;
            o1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            coVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != o2Var.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f10 += view.getX();
                f11 += view.getY();
                view = (View) view.getParent();
            }
            if (z10) {
                measuredWidth = f10 - AndroidUtilities.dpf2(8.0f);
                measuredHeight = AndroidUtilities.dpf2(16.0f);
            } else {
                measuredWidth = f10 - (coVar.getMeasuredWidth() / 2.0f);
                measuredHeight = coVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(o2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void d(long j10, long j11, HashSet hashSet) {
        int i9;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.f28523j < 200) {
            AndroidUtilities.runOnUIThread(new e5.y(this, j10, j11, hashSet, 12));
            return;
        }
        int i12 = this.f28521g;
        boolean isDialogMuted = MessagesController.getInstance(i12).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.g1 g1Var = this.f28517b;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f28518c;
        if (isDialogMuted) {
            g1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            i9 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23351x6, false);
            g1Var.setVisibility(8);
        } else {
            g1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false);
            g1Var.setVisibility(0);
            if (MessagesController.getInstance(i12).isDialogNotificationsSoundEnabled(j10, j11)) {
                g1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            i9 = w02;
        }
        if (this.f28528o == 1) {
            this.f28516a.setVisibility(8);
        }
        if (!isDialogMuted && this.f28528o != 1) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i12);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i10 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.g1 g1Var3 = this.d;
        if (i11 != 0) {
            this.f28525l = i11;
            g1Var3.setVisibility(0);
            g1Var3.getImageView().setImageDrawable(b11.a(i11));
            g1Var3.setText(b(i11));
        } else {
            g1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.g1 g1Var4 = this.f28519e;
        if (i10 != 0) {
            this.f28524k = i10;
            g1Var4.setVisibility(0);
            g1Var4.getImageView().setImageDrawable(b11.a(i10));
            g1Var4.setText(b(i10));
        } else {
            g1Var4.setVisibility(8);
        }
        g1Var2.c(i9, i9);
        g1Var2.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i9));
        FrameLayout frameLayout = this.f28526m;
        TextView textView = this.f28527n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.f6.f23179n6, 1, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
