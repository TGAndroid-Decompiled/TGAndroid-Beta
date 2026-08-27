package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class kb0 extends FrameLayout {
    public boolean A;
    public float B;

    public final int f30052a;

    public final int f30053b;

    public final org.telegram.ui.ActionBar.c6 f30054c;
    public final LinearLayout d;

    public final TextView f30055e;

    public final TextView f30056f;
    public final TextView h;

    public final long f30057n;

    public final int f30058r;

    public final int f30059s;
    public final int v;

    public final int f30060w;

    public final Runnable f30061x;

    public final int f30062y;

    public kb0(Context context, int i10, MessageObject messageObject, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        TLRPC.MessageFwdHeader messageFwdHeader;
        super(context);
        this.A = false;
        this.B = -1.0f;
        this.f30053b = i10;
        int i11 = messageObject.currentAccount;
        this.f30052a = i11;
        this.f30054c = c6Var;
        this.f30061x = runnable;
        this.f30062y = ConnectionsManager.getInstance(i11).getCurrentTime() - messageObject.messageOwner.date;
        this.f30057n = messageObject.getDialogId();
        this.f30058r = messageObject.getId();
        TLRPC.Message message = messageObject.messageOwner;
        this.f30059s = message == null ? 0 : message.date;
        this.v = message == null ? 0 : message.edit_date;
        this.f30060w = (message == null || (messageFwdHeader = message.fwd_from) == null) ? 0 : messageFwdHeader.date;
        ImageView imageView = new ImageView(context);
        addView(imageView, h7.z5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable drawableMutate = context.getDrawable(i10 == 1 ? AppGlobalConfig.getInstance(i11).messagePrimaryEditedDate.get() ? R.drawable.outline_message_time_24 : R.drawable.menu_edited_stamp : i10 == 2 ? R.drawable.menu_forward_stamp : messageObject.isVoice() ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(drawableMutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new u80(textView, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(2.0f), c6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.7f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, h7.z5.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, h7.z5.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30055e = textView2;
        org.telegram.messenger.rl.l(i12, c6Var, textView2, 1, 14.0f);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView2, h7.z5.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f30056f = textViewI;
        textViewI.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.l1(0.75f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, c6Var))));
        org.telegram.messenger.rl.l(i12, c6Var, textViewI, 1, 11.0f);
        textViewI.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.33f));
        linearLayout.addView(textViewI, h7.z5.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(final Context context, final int i10, long j10, final boolean z10, Runnable runnable, final Runnable runnable2, final org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        final org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, c6Var, false, false);
        e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        boolean zPremiumFeaturesBlocked = MessagesController.getInstance(i10).premiumFeaturesBlocked();
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayoutG.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ri0 ri0Var = new ri0(context);
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.f(z10 ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70, null);
        ri0Var.d();
        ri0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ri0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        linearLayoutG.addView(ri0Var, h7.z5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
        org.telegram.messenger.rl.l(i12, c6Var, textView, 1, 20.0f);
        textView.setText(LocaleController.getString(z10 ? R.string.PremiumLastSeenHeader1 : R.string.PremiumReadHeader1));
        linearLayoutG.addView(textView, h7.z5.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.messenger.rl.l(i12, c6Var, textView2, 1, 14.0f);
        String firstName = j10 > 0 ? UserObject.getFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) : "";
        if (z10) {
            i11 = zPremiumFeaturesBlocked ? R.string.PremiumLastSeenText1Locked : R.string.PremiumLastSeenText1;
        } else {
            i11 = zPremiumFeaturesBlocked ? R.string.PremiumReadText1Locked : R.string.PremiumReadText1;
        }
        org.telegram.messenger.rl.n(i11, new Object[]{firstName}, textView2);
        linearLayoutG.addView(textView2, h7.z5.t(-1, -2, 1, 32, 9, 32, 19));
        final lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        dVarG.g(LocaleController.getString(z10 ? R.string.PremiumLastSeenButton1 : R.string.PremiumReadButton1), false, true);
        linearLayoutG.addView(dVarG, h7.z5.q(-1, 48, 1));
        dVarG.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                lh.d dVar = dVarG;
                dVar.setLoading(true);
                boolean z11 = z10;
                int i13 = i10;
                org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                Runnable runnable3 = runnable2;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i13).sendRequest(setprivacy, new cg.y(dVar, e3Var2, runnable3, 19));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i13).getGlobalPrivacySettings();
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i13).sendRequest(setglobalprivacysettings, new cg.e0(context, c6Var, dVar, e3Var2, runnable3, 8));
            }
        });
        if (!zPremiumFeaturesBlocked) {
            jb0 jb0Var = new jb0(context, c6Var);
            jb0Var.setGravity(17);
            jb0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            jb0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
            jb0Var.l(" " + LocaleController.getString(R.string.PremiumOr) + " ", false);
            jb0Var.setTextSize(14);
            linearLayoutG.addView(jb0Var, h7.z5.t(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
            textView3.setTextSize(1, 20.0f);
            textView3.setText(LocaleController.getString(z10 ? R.string.PremiumLastSeenHeader2 : R.string.PremiumReadHeader2));
            linearLayoutG.addView(textView3, h7.z5.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.messenger.rl.l(i12, c6Var, textView4, 1, 14.0f);
            org.telegram.messenger.rl.n(z10 ? R.string.PremiumLastSeenText2 : R.string.PremiumReadText2, new Object[]{firstName}, textView4);
            linearLayoutG.addView(textView4, h7.z5.t(-1, -2, 1, 32, 9, 32, 19));
            ag.s1 s1Var = new ag.s1(context, c6Var, true);
            s1Var.setOnClickListener(new ib0(z10, e3Var, runnable));
            s1Var.c(LocaleController.getString(z10 ? R.string.PremiumLastSeenButton2 : R.string.PremiumReadButton2), false, false);
            linearLayoutG.addView(s1Var, h7.z5.t(-1, 48, 1, 0, 0, 0, 4));
        }
        e3Var.setCustomView(linearLayoutG);
        e3Var.show();
    }

    public final void a() {
        TextView textView = this.f30055e;
        int i10 = this.f30052a;
        TextView textView2 = this.f30056f;
        TextView textView3 = this.h;
        LinearLayout linearLayout = this.d;
        int i11 = this.f30053b;
        if (i11 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            textView.setText(AppGlobalConfig.getInstance(i10).messagePrimaryEditedDate.get() ? LocaleController.formatPmSentDate(this.f30059s) : LocaleController.formatPmEditedDate(this.v));
            return;
        }
        if (i11 == 2) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            textView.setText(LocaleController.formatPmFwdDate(this.f30060w));
            return;
        }
        setOnClickListener(null);
        linearLayout.setAlpha(0.0f);
        textView3.setAlpha(1.0f);
        textView2.setVisibility(0);
        TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
        tL_messages_getOutboxReadDate.peer = MessagesController.getInstance(i10).getInputPeer(this.f30057n);
        tL_messages_getOutboxReadDate.msg_id = this.f30058r;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getOutboxReadDate, new w1(this, 8));
    }

    @Override
    public final void onDetachedFromWindow() {
        jb jbVar;
        super.onDetachedFromWindow();
        ec ecVar = ec.f28012w;
        if (ecVar == null || (jbVar = ecVar.f28016e) == null || jbVar.getParent() == null || !(ecVar.f28016e.getParent().getParent() instanceof za)) {
            return;
        }
        ecVar.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (this.B < 0.0f) {
            this.B = 0.0f;
            int i12 = this.f30053b;
            TextView textView = this.f30055e;
            if (i12 == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                float fMax = Math.max(this.B, AndroidUtilities.dp(144.0f));
                this.B = fMax;
                float fMax2 = Math.max(fMax, textView.getPaint().measureText(LocaleController.getString(R.string.PmReadUnknown)) + AndroidUtilities.dp(48.0f));
                this.B = fMax2;
                float fMax3 = Math.max(fMax2, textView.getPaint().measureText(LocaleController.getString(R.string.PmRead) + this.f30056f.getPaint().measureText(LocaleController.getString(R.string.PmReadShowWhen))) + AndroidUtilities.dp(64.0f));
                this.B = fMax3;
                float fMax4 = Math.max(fMax3, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadTodayAt, LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + ((float) AndroidUtilities.dp(48.0f)));
                this.B = fMax4;
                int i13 = this.f30062y;
                if (i13 > 86400) {
                    f10 = 48.0f;
                    this.B = Math.max(fMax4, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadYesterdayAt, LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + AndroidUtilities.dp(48.0f));
                } else {
                    f10 = 48.0f;
                }
                if (i13 > 172800) {
                    float fMax5 = Math.max(this.B, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadDateTimeAt, LocaleController.getInstance().getFormatterDayMonth().format(new Date(jCurrentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + AndroidUtilities.dp(f10));
                    this.B = fMax5;
                    this.B = Math.max(fMax5, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadDateTimeAt, LocaleController.getInstance().getFormatterYear().format(new Date(jCurrentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(jCurrentTimeMillis)))) + AndroidUtilities.dp(f10));
                }
            } else {
                this.B = textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f);
            }
        }
        int i14 = 1073741824;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f11 = size;
        float f12 = this.B;
        if (f11 < f12 || mode == Integer.MIN_VALUE) {
            size = (int) f12;
        } else {
            i14 = mode;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i14), i11);
    }
}
