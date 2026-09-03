package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
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
public final class cc0 extends FrameLayout {
    public boolean B;
    public float C;
    public final int f25889a;
    public final int f25890b;
    public final org.telegram.ui.ActionBar.g6 f25891c;
    public final LinearLayout d;
    public final TextView f25892e;
    public final TextView f25893f;
    public final TextView h;
    public final long f25894n;
    public final int f25895r;
    public final int f25896s;
    public final int v;
    public final int f25897w;
    public final Runnable f25898x;
    public final int f25899y;

    public cc0(Context context, int i10, MessageObject messageObject, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.B = false;
        this.C = -1.0f;
        this.f25890b = i10;
        int i15 = messageObject.currentAccount;
        this.f25889a = i15;
        this.f25891c = g6Var;
        this.f25898x = runnable;
        this.f25899y = ConnectionsManager.getInstance(i15).getCurrentTime() - messageObject.messageOwner.date;
        this.f25894n = messageObject.getDialogId();
        this.f25895r = messageObject.getId();
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            i11 = 0;
        } else {
            i11 = message.date;
        }
        this.f25896s = i11;
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
        this.f25897w = i13;
        ImageView imageView = new ImageView(context);
        addView(imageView, k7.c6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
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
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, g6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new l90(textView, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(2.0f), g6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i16 = org.telegram.ui.ActionBar.k6.f21768j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.7f, org.telegram.ui.ActionBar.k6.v0(i16, g6Var)));
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, k7.c6.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, k7.c6.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f25892e = textView2;
        org.telegram.ui.b.l(i16, g6Var, textView2, 1, 14.0f);
        TextView i17 = org.telegram.ui.yh.i(linearLayout, textView2, k7.c6.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f25893f = i17;
        i17.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.k6.l1(0.75f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21662d7, g6Var))));
        org.telegram.ui.b.l(i16, g6Var, i17, 1, 11.0f);
        i17.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.33f));
        linearLayout.addView(i17, k7.c6.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(final Context context, final int i10, long j10, final boolean z4, Runnable runnable, final Runnable runnable2, final org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, g6Var, false, false);
        h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, g6Var));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i10).premiumFeaturesBlocked();
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z4) {
            i11 = R.raw.large_lastseen;
        } else {
            i11 = R.raw.large_readtime;
        }
        imageView.f(i11, 70, 70, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
        f10.addView((View) imageView, k7.c6.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i18 = org.telegram.ui.ActionBar.k6.f21768j5;
        org.telegram.ui.b.l(i18, g6Var, textView, 1, 20.0f);
        if (z4) {
            i12 = R.string.PremiumLastSeenHeader1;
        } else {
            i12 = R.string.PremiumReadHeader1;
        }
        textView.setText(LocaleController.getString(i12));
        f10.addView(textView, k7.c6.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.ui.b.l(i18, g6Var, textView2, 1, 14.0f);
        if (j10 > 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        String str2 = str;
        if (z4) {
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
        org.telegram.ui.b.o(i13, new Object[]{str2}, textView2);
        f10.addView(textView2, k7.c6.t(-1, -2, 1, 32, 9, 32, 19));
        final qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        if (z4) {
            i14 = R.string.PremiumLastSeenButton1;
        } else {
            i14 = R.string.PremiumReadButton1;
        }
        p10.g(LocaleController.getString(i14), false, true);
        f10.addView(p10, k7.c6.q(-1, 48, 1));
        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                qh.d dVar = qh.d.this;
                dVar.setLoading(true);
                boolean z10 = z4;
                int i19 = i10;
                org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                Runnable runnable3 = runnable2;
                if (z10) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i19).sendRequest(setprivacy, new hg.y(dVar, h3Var2, runnable3, 16));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i19).getGlobalPrivacySettings();
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i19).sendRequest(setglobalprivacysettings, new hg.e0(context, g6Var, dVar, h3Var2, runnable3, 7));
            }
        });
        if (!premiumFeaturesBlocked) {
            bc0 bc0Var = new bc0(context, g6Var);
            bc0Var.setGravity(17);
            bc0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            bc0Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22055z6, g6Var));
            bc0Var.l(" " + LocaleController.getString(R.string.PremiumOr) + " ", false);
            bc0Var.setTextSize(14);
            f10.addView(bc0Var, k7.c6.t(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i18, g6Var));
            textView3.setTextSize(1, 20.0f);
            if (z4) {
                i15 = R.string.PremiumLastSeenHeader2;
            } else {
                i15 = R.string.PremiumReadHeader2;
            }
            textView3.setText(LocaleController.getString(i15));
            f10.addView(textView3, k7.c6.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.ui.b.l(i18, g6Var, textView4, 1, 14.0f);
            if (z4) {
                i16 = R.string.PremiumLastSeenText2;
            } else {
                i16 = R.string.PremiumReadText2;
            }
            org.telegram.ui.b.o(i16, new Object[]{str2}, textView4);
            f10.addView(textView4, k7.c6.t(-1, -2, 1, 32, 9, 32, 19));
            fg.b1 b1Var = new fg.b1(context, g6Var, true);
            b1Var.setOnClickListener(new ac0(z4, h3Var, runnable));
            if (z4) {
                i17 = R.string.PremiumLastSeenButton2;
            } else {
                i17 = R.string.PremiumReadButton2;
            }
            b1Var.c(LocaleController.getString(i17), false, false);
            f10.addView(b1Var, k7.c6.t(-1, 48, 1, 0, 0, 0, 4));
        }
        h3Var.setCustomView(f10);
        h3Var.show();
    }

    public final void a() {
        String formatPmEditedDate;
        TextView textView = this.f25892e;
        int i10 = this.f25889a;
        TextView textView2 = this.f25893f;
        TextView textView3 = this.h;
        LinearLayout linearLayout = this.d;
        int i11 = this.f25890b;
        if (i11 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            if (AppGlobalConfig.getInstance(i10).messagePrimaryEditedDate.get()) {
                formatPmEditedDate = LocaleController.formatPmSentDate(this.f25896s);
            } else {
                formatPmEditedDate = LocaleController.formatPmEditedDate(this.v);
            }
            textView.setText(formatPmEditedDate);
        } else if (i11 == 2) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            textView.setText(LocaleController.formatPmFwdDate(this.f25897w));
        } else {
            setOnClickListener(null);
            linearLayout.setAlpha(0.0f);
            textView3.setAlpha(1.0f);
            textView2.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = MessagesController.getInstance(i10).getInputPeer(this.f25894n);
            tL_messages_getOutboxReadDate.msg_id = this.f25895r;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getOutboxReadDate, new y1(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        nb nbVar;
        super.onDetachedFromWindow();
        ic icVar = ic.f27770w;
        if (icVar != null && (nbVar = icVar.f27774e) != null && nbVar.getParent() != null && (icVar.f27774e.getParent().getParent() instanceof bb)) {
            icVar.b();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (this.C < 0.0f) {
            this.C = 0.0f;
            int i12 = this.f25890b;
            TextView textView = this.f25892e;
            if (i12 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.C, AndroidUtilities.dp(144.0f));
                this.C = max;
                float max2 = Math.max(max, textView.getPaint().measureText(LocaleController.getString(R.string.PmReadUnknown)) + AndroidUtilities.dp(48.0f));
                this.C = max2;
                TextPaint paint = textView.getPaint();
                float max3 = Math.max(max2, paint.measureText(LocaleController.getString(R.string.PmRead) + this.f25893f.getPaint().measureText(LocaleController.getString(R.string.PmReadShowWhen))) + AndroidUtilities.dp(64.0f));
                this.C = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadTodayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + ((float) AndroidUtilities.dp(48.0f)));
                this.C = max4;
                int i13 = this.f25899y;
                if (i13 > 86400) {
                    f10 = 48.0f;
                    this.C = Math.max(max4, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadYesterdayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(48.0f));
                } else {
                    f10 = 48.0f;
                }
                if (i13 > 172800) {
                    float max5 = Math.max(this.C, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadDateTimeAt, LocaleController.getInstance().getFormatterDayMonth().format(new Date(currentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(f10));
                    this.C = max5;
                    this.C = Math.max(max5, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadDateTimeAt, LocaleController.getInstance().getFormatterYear().format(new Date(currentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(f10));
                }
            } else {
                this.C = textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f);
            }
        }
        int i14 = 1073741824;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f11 = this.C;
        if (size >= f11 && mode != Integer.MIN_VALUE) {
            i14 = mode;
        } else {
            size = (int) f11;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i14), i11);
    }
}
