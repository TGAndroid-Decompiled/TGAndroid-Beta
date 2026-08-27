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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class co {

    public final org.telegram.ui.ActionBar.f1 f27510a;

    public final org.telegram.ui.ActionBar.f1 f27511b;

    public final org.telegram.ui.ActionBar.f1 f27512c;
    public final org.telegram.ui.ActionBar.f1 d;

    public final org.telegram.ui.ActionBar.f1 f27513e;

    public final ao f27514f;

    public final int f27515g;
    public org.telegram.ui.ActionBar.n1 h;

    public final bo f27516i;

    public long f27517j;

    public int f27518k;

    public int f27519l;

    public final FrameLayout f27520m;

    public final TextView f27521n;

    public int f27522o;

    public co(Context context, int i10, hg0 hg0Var, boolean z10, final bo boVar, org.telegram.ui.ActionBar.c6 c6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f27515g = i10;
        this.f27516i = boVar;
        ao aoVar = new ao(context, z10 ? R.drawable.popup_fixed_alert : 0, 0, c6Var, 0);
        aoVar.Q = new Path();
        this.f27514f = aoVar;
        aoVar.setFitItems(true);
        if (hg0Var != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout = aoVar;
            org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, c6Var);
            this.f27510a = f1VarC;
            f1VarC.setOnClickListener(new d8(hg0Var, 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = aoVar;
        }
        org.telegram.ui.ActionBar.f1 f1VarC2 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, LocaleController.getString(R.string.SoundOn), false, c6Var);
        this.f27511b = f1VarC2;
        final int i11 = 0;
        f1VarC2.setOnClickListener(new View.OnClickListener(this) {

            public final co f34924b;

            {
                this.f34924b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f34924b.a();
                        boVar.u();
                        break;
                    case 1:
                        co coVar = this.f34924b;
                        coVar.a();
                        boVar.v(coVar.f27519l);
                        break;
                    case 2:
                        co coVar2 = this.f34924b;
                        coVar2.a();
                        boVar.v(coVar2.f27518k);
                        break;
                    case 3:
                        this.f34924b.a();
                        boVar.o();
                        break;
                    case 4:
                        this.f34924b.a();
                        AndroidUtilities.runOnUIThread(new bg(boVar, 27));
                        break;
                    default:
                        boVar.k();
                        this.f34924b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 f1VarC3 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, c6Var);
        this.d = f1VarC3;
        final int i12 = 1;
        f1VarC3.setOnClickListener(new View.OnClickListener(this) {

            public final co f34924b;

            {
                this.f34924b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f34924b.a();
                        boVar.u();
                        break;
                    case 1:
                        co coVar = this.f34924b;
                        coVar.a();
                        boVar.v(coVar.f27519l);
                        break;
                    case 2:
                        co coVar2 = this.f34924b;
                        coVar2.a();
                        boVar.v(coVar2.f27518k);
                        break;
                    case 3:
                        this.f34924b.a();
                        boVar.o();
                        break;
                    case 4:
                        this.f34924b.a();
                        AndroidUtilities.runOnUIThread(new bg(boVar, 27));
                        break;
                    default:
                        boVar.k();
                        this.f34924b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 f1VarC4 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, LocaleController.getString(R.string.MuteFor1h), false, c6Var);
        this.f27513e = f1VarC4;
        final int i13 = 2;
        f1VarC4.setOnClickListener(new View.OnClickListener(this) {

            public final co f34924b;

            {
                this.f34924b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f34924b.a();
                        boVar.u();
                        break;
                    case 1:
                        co coVar = this.f34924b;
                        coVar.a();
                        boVar.v(coVar.f27519l);
                        break;
                    case 2:
                        co coVar2 = this.f34924b;
                        coVar2.a();
                        boVar.v(coVar2.f27518k);
                        break;
                    case 3:
                        this.f34924b.a();
                        boVar.o();
                        break;
                    case 4:
                        this.f34924b.a();
                        AndroidUtilities.runOnUIThread(new bg(boVar, 27));
                        break;
                    default:
                        boVar.k();
                        this.f34924b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, LocaleController.getString(R.string.MuteForPopup), false, c6Var).setOnClickListener(new zn(this, context, c6Var, i10, boVar, 0));
        final int i14 = 3;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.NotificationsCustomize), false, c6Var).setOnClickListener(new View.OnClickListener(this) {

            public final co f34924b;

            {
                this.f34924b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.f34924b.a();
                        boVar.u();
                        break;
                    case 1:
                        co coVar = this.f34924b;
                        coVar.a();
                        boVar.v(coVar.f27519l);
                        break;
                    case 2:
                        co coVar2 = this.f34924b;
                        coVar2.a();
                        boVar.v(coVar2.f27518k);
                        break;
                    case 3:
                        this.f34924b.a();
                        boVar.o();
                        break;
                    case 4:
                        this.f34924b.a();
                        AndroidUtilities.runOnUIThread(new bg(boVar, 27));
                        break;
                    default:
                        boVar.k();
                        this.f34924b.a();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 f1VarC5 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, c6Var);
        this.f27512c = f1VarC5;
        final int i15 = 4;
        f1VarC5.setOnClickListener(new View.OnClickListener(this) {

            public final co f34924b;

            {
                this.f34924b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.f34924b.a();
                        boVar.u();
                        break;
                    case 1:
                        co coVar = this.f34924b;
                        coVar.a();
                        boVar.v(coVar.f27519l);
                        break;
                    case 2:
                        co coVar2 = this.f34924b;
                        coVar2.a();
                        boVar.v(coVar2.f27518k);
                        break;
                    case 3:
                        this.f34924b.a();
                        boVar.o();
                        break;
                    case 4:
                        this.f34924b.a();
                        AndroidUtilities.runOnUIThread(new bg(boVar, 27));
                        break;
                    default:
                        boVar.k();
                        this.f34924b.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27520m = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H8, c6Var));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, h7.z5.n(-1, 8));
        TextView textView = new TextView(context);
        this.f27521n = textView;
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        textView.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, h7.z5.n(-2, -2));
        textView.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, c6Var), 0, 6));
        final int i16 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) {

            public final co f34924b;

            {
                this.f34924b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.f34924b.a();
                        boVar.u();
                        break;
                    case 1:
                        co coVar = this.f34924b;
                        coVar.a();
                        boVar.v(coVar.f27519l);
                        break;
                    case 2:
                        co coVar2 = this.f34924b;
                        coVar2.a();
                        boVar.v(coVar2.f27518k);
                        break;
                    case 3:
                        this.f34924b.a();
                        boVar.o();
                        break;
                    case 4:
                        this.f34924b.a();
                        AndroidUtilities.runOnUIThread(new bg(boVar, 27));
                        break;
                    default:
                        boVar.k();
                        this.f34924b.a();
                        break;
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
        this.f27516i.dismiss();
        this.f27517j = System.currentTimeMillis();
    }

    public final void c(org.telegram.ui.ActionBar.n2 n2Var, View view, float f10, float f11, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (n2Var.getFragmentView() == null) {
            return;
        }
        ao aoVar = this.f27514f;
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(aoVar, -2, -2);
        this.h = n1Var;
        n1Var.f23684e = true;
        n1Var.f23683c = 220;
        n1Var.setOutsideTouchable(true);
        this.h.setClippingEnabled(true);
        this.h.setAnimationStyle(R.style.PopupContextAnimation);
        this.h.setFocusable(true);
        aoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.h.setInputMethodMode(2);
        this.h.getContentView().setFocusableInTouchMode(true);
        while (view != n2Var.getFragmentView()) {
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
            measuredWidth = f10 - (aoVar.getMeasuredWidth() / 2.0f);
            measuredHeight = aoVar.getMeasuredHeight() / 2.0f;
        }
        this.h.showAtLocation(n2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
        this.h.b();
    }

    public final void d(long j10, long j11, HashSet hashSet) {
        int iW0;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.f27517j < 200) {
            AndroidUtilities.runOnUIThread(new e5.w(this, j10, j11, hashSet, 12));
            return;
        }
        int i12 = this.f27515g;
        boolean zIsDialogMuted = MessagesController.getInstance(i12).isDialogMuted(j10, j11);
        org.telegram.ui.ActionBar.f1 f1Var = this.f27511b;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.f27512c;
        if (zIsDialogMuted) {
            f1Var2.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
            iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23406x6, false);
            f1Var.setVisibility(8);
        } else {
            f1Var2.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false);
            f1Var.setVisibility(0);
            if (MessagesController.getInstance(i12).isDialogNotificationsSoundEnabled(j10, j11)) {
                f1Var.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
            } else {
                f1Var.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
            }
            iW0 = iW1;
        }
        if (this.f27522o == 1) {
            this.f27510a.setVisibility(8);
        }
        if (zIsDialogMuted || this.f27522o == 1) {
            i10 = 0;
            i11 = 0;
        } else {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i12);
            i11 = notificationsSettings.getInt("last_selected_mute_until_time", 0);
            i10 = notificationsSettings.getInt("last_selected_mute_until_time2", 0);
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.d;
        if (i11 != 0) {
            this.f27519l = i11;
            f1Var3.setVisibility(0);
            f1Var3.getImageView().setImageDrawable(c11.a(i11));
            f1Var3.setText(b(i11));
        } else {
            f1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.f1 f1Var4 = this.f27513e;
        if (i10 != 0) {
            this.f27518k = i10;
            f1Var4.setVisibility(0);
            f1Var4.getImageView().setImageDrawable(c11.a(i10));
            f1Var4.setText(b(i10));
        } else {
            f1Var4.setVisibility(8);
        }
        f1Var2.c(iW0, iW0);
        f1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, iW0));
        FrameLayout frameLayout = this.f27520m;
        TextView textView = this.f27521n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("TopicNotificationsExceptions", hashSet.size(), new Object[0]), org.telegram.ui.ActionBar.g6.f23234n6, 1, null));
        }
    }
}
