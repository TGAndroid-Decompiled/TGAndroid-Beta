package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
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
public final class sc0 extends FrameLayout {
    public boolean E;
    public float F;
    public final int f32553a;
    public final int f32554b;
    public final org.telegram.ui.ActionBar.u6 f32555c;
    public final LinearLayout d;
    public final TextView e;
    public final TextView f32556f;
    public final TextView h;
    public final long f32557n;
    public final int f32558r;
    public final int f32559s;
    public final int v;
    public final int f32560w;
    public final Runnable f32561x;
    public final int f32562y;

    public sc0(Context context, int i10, MessageObject messageObject, Runnable runnable, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.E = false;
        this.F = -1.0f;
        this.f32554b = i10;
        int i15 = messageObject.currentAccount;
        this.f32553a = i15;
        this.f32555c = u6Var;
        this.f32561x = runnable;
        this.f32562y = ConnectionsManager.getInstance(i15).getCurrentTime() - messageObject.messageOwner.date;
        this.f32557n = messageObject.getDialogId();
        this.f32558r = messageObject.getId();
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            i11 = 0;
        } else {
            i11 = message.date;
        }
        this.f32559s = i11;
        if (message == null) {
            i12 = 0;
        } else {
            i12 = message.edit_date;
        }
        this.v = i12;
        if (message != null && (messageFwdHeader = message.fwd_from) != null) {
            i13 = messageFwdHeader.date;
        } else {
            i13 = 0;
        }
        this.f32560w = i13;
        ImageView imageView = new ImageView(context);
        addView(imageView, kb1.h(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            if (AppGlobalConfig.getInstance(i15).messagePrimaryEditedDate.get()) {
                i14 = R.drawable.outline_message_time_24;
            } else {
                i14 = R.drawable.menu_edited_stamp;
            }
        } else if (i10 == 2) {
            i14 = R.drawable.menu_forward_stamp;
        } else if (messageObject.isVoice()) {
            i14 = R.drawable.msg_played;
        } else {
            i14 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i14).mutate();
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.F8, u6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new fa0(textView, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(2.0f), u6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i16 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.W(textView, org.telegram.ui.ActionBar.f7.L(0.7f, i16), u6Var);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, kb1.h(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, kb1.h(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i16, u6Var);
        textView2.setTextSize(1, 14.0f);
        TextView e = org.telegram.messenger.wh.e(linearLayout, textView2, kb1.x(-2, -2, 19, 0, -1, 0, 0), context);
        this.f32556f = e;
        int dp = AndroidUtilities.dp(20.0f);
        int i17 = org.telegram.ui.ActionBar.y6.f23358d7;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.75f, org.telegram.ui.ActionBar.y6.w0(i17, u6Var)));
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.75f, i17);
        e.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(e, c02, L, null, u6Var);
        org.telegram.ui.ActionBar.f7.V(e, i16, u6Var);
        e.setTextSize(1, 11.0f);
        e.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.33f));
        linearLayout.addView(e, kb1.x(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(final Context context, final int i10, long j10, final boolean z10, Runnable runnable, final Runnable runnable2, final org.telegram.ui.ActionBar.u6 u6Var) {
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final org.telegram.ui.s6 s6Var = new org.telegram.ui.s6(1, context, u6Var, false);
        s6Var.fixNavigationBar(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, u6Var));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i10).premiumFeaturesBlocked();
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z10) {
            i11 = R.raw.large_lastseen;
        } else {
            i11 = R.raw.large_readtime;
        }
        imageView.f(i11, 70, 70, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(80.0f);
        int i18 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i18, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i18);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, u6Var);
        d.addView((View) imageView, kb1.x(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i19 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(textView, i19, u6Var);
        textView.setTextSize(1, 20.0f);
        if (z10) {
            i12 = R.string.PremiumLastSeenHeader1;
        } else {
            i12 = R.string.PremiumReadHeader1;
        }
        textView.setText(LocaleController.getString(i12));
        d.addView(textView, kb1.x(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView2, i19, u6Var);
        textView2.setTextSize(1, 14.0f);
        if (j10 > 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        String str2 = str;
        if (z10) {
            if (premiumFeaturesBlocked) {
                i13 = R.string.PremiumLastSeenText1Locked;
            } else {
                i13 = R.string.PremiumLastSeenText1;
            }
        } else if (premiumFeaturesBlocked) {
            i13 = R.string.PremiumReadText1Locked;
        } else {
            i13 = R.string.PremiumReadText1;
        }
        org.telegram.messenger.wh.o(i13, new Object[]{str2}, textView2);
        d.addView(textView2, kb1.x(-1, -2, 1, 32, 9, 32, 19));
        final fi.d f7 = org.telegram.messenger.wh.f(24, context, u6Var, true);
        if (z10) {
            i14 = R.string.PremiumLastSeenButton1;
        } else {
            i14 = R.string.PremiumReadButton1;
        }
        f7.i(LocaleController.getString(i14), false, true);
        d.addView(f7, kb1.u(-1, 48, 1));
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                fi.d dVar = fi.d.this;
                dVar.setLoading(true);
                boolean z11 = z10;
                int i20 = i10;
                org.telegram.ui.s6 s6Var2 = s6Var;
                Runnable runnable3 = runnable2;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i20).sendRequest(setprivacy, new bi.h2(dVar, s6Var2, runnable3, 16));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i20).getGlobalPrivacySettings();
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i20).sendRequest(setglobalprivacysettings, new bi.n9(context, u6Var, dVar, s6Var2, runnable3, 6));
            }
        });
        if (!premiumFeaturesBlocked) {
            rc0 rc0Var = new rc0(context, u6Var);
            rc0Var.setGravity(17);
            rc0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            org.telegram.ui.ActionBar.f7.Y(rc0Var, org.telegram.ui.ActionBar.y6.f23768z6, u6Var);
            rc0Var.l(" " + LocaleController.getString(R.string.PremiumOr) + " ", false);
            rc0Var.setTextSize(14);
            d.addView(rc0Var, kb1.x(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            org.telegram.ui.ActionBar.f7.V(textView3, i19, u6Var);
            textView3.setTextSize(1, 20.0f);
            if (z10) {
                i15 = R.string.PremiumLastSeenHeader2;
            } else {
                i15 = R.string.PremiumReadHeader2;
            }
            textView3.setText(LocaleController.getString(i15));
            d.addView(textView3, kb1.x(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.ui.ActionBar.f7.V(textView4, i19, u6Var);
            textView4.setTextSize(1, 14.0f);
            if (z10) {
                i16 = R.string.PremiumLastSeenText2;
            } else {
                i16 = R.string.PremiumReadText2;
            }
            org.telegram.messenger.wh.o(i16, new Object[]{str2}, textView4);
            d.addView(textView4, kb1.x(-1, -2, 1, 32, 9, 32, 19));
            tg.p0 p0Var = new tg.p0(context, u6Var, true);
            p0Var.setOnClickListener(new qc0(z10, s6Var, runnable));
            if (z10) {
                i17 = R.string.PremiumLastSeenButton2;
            } else {
                i17 = R.string.PremiumReadButton2;
            }
            p0Var.b(LocaleController.getString(i17), false, false);
            d.addView(p0Var, kb1.x(-1, 48, 1, 0, 0, 0, 4));
        }
        s6Var.setCustomView(d);
        s6Var.show();
    }

    public final void a() {
        String formatPmEditedDate;
        TextView textView = this.e;
        int i10 = this.f32553a;
        TextView textView2 = this.f32556f;
        TextView textView3 = this.h;
        LinearLayout linearLayout = this.d;
        int i11 = this.f32554b;
        if (i11 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            if (AppGlobalConfig.getInstance(i10).messagePrimaryEditedDate.get()) {
                formatPmEditedDate = LocaleController.formatPmSentDate(this.f32559s);
            } else {
                formatPmEditedDate = LocaleController.formatPmEditedDate(this.v);
            }
            textView.setText(formatPmEditedDate);
        } else if (i11 == 2) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            textView.setText(LocaleController.formatPmFwdDate(this.f32560w));
        } else {
            setOnClickListener(null);
            linearLayout.setAlpha(0.0f);
            textView3.setAlpha(1.0f);
            textView2.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = MessagesController.getInstance(i10).getInputPeer(this.f32557n);
            tL_messages_getOutboxReadDate.msg_id = this.f32558r;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getOutboxReadDate, new b2(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ub ubVar;
        super.onDetachedFromWindow();
        qc qcVar = qc.f31854x;
        if (qcVar != null && (ubVar = qcVar.e) != null && ubVar.getParent() != null && (qcVar.e.getParent().getParent() instanceof kb)) {
            qcVar.b();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (this.F < 0.0f) {
            this.F = 0.0f;
            int i12 = this.f32554b;
            TextView textView = this.e;
            if (i12 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.F, AndroidUtilities.dp(144.0f));
                this.F = max;
                float max2 = Math.max(max, textView.getPaint().measureText(LocaleController.getString(R.string.PmReadUnknown)) + AndroidUtilities.dp(48.0f));
                this.F = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(LocaleController.getString(R.string.PmRead) + this.f32556f.getPaint().measureText(LocaleController.getString(R.string.PmReadShowWhen))) + AndroidUtilities.dp(64.0f));
                this.F = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadTodayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + ((float) AndroidUtilities.dp(48.0f)));
                this.F = max4;
                int i13 = this.f32562y;
                if (i13 > 86400) {
                    f7 = 48.0f;
                    this.F = Math.max(max4, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadYesterdayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(48.0f));
                } else {
                    f7 = 48.0f;
                }
                if (i13 > 172800) {
                    float max5 = Math.max(this.F, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadDateTimeAt, LocaleController.getInstance().getFormatterDayMonth().format(new Date(currentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(f7));
                    this.F = max5;
                    this.F = Math.max(max5, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadDateTimeAt, LocaleController.getInstance().getFormatterYear().format(new Date(currentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(f7));
                }
            } else {
                this.F = textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f);
            }
        }
        int i14 = 1073741824;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f10 = this.F;
        if (size >= f10 && mode != Integer.MIN_VALUE) {
            i14 = mode;
        } else {
            size = (int) f10;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i14), i11);
    }
}
