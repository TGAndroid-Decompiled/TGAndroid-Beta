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
public final class gb0 extends FrameLayout {
    public boolean A;
    public float B;
    public final int f28718a;
    public final int f28719b;
    public final org.telegram.ui.ActionBar.b6 f28720c;
    public final LinearLayout d;
    public final TextView f28721e;
    public final TextView f28722f;
    public final TextView h;
    public final long f28723n;
    public final int f28724r;
    public final int f28725s;
    public final int v;
    public final int f28726w;
    public final Runnable f28727x;
    public final int f28728y;

    public gb0(Context context, int i9, MessageObject messageObject, Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.A = false;
        this.B = -1.0f;
        this.f28719b = i9;
        int i14 = messageObject.currentAccount;
        this.f28718a = i14;
        this.f28720c = b6Var;
        this.f28727x = runnable;
        this.f28728y = ConnectionsManager.getInstance(i14).getCurrentTime() - messageObject.messageOwner.date;
        this.f28723n = messageObject.getDialogId();
        this.f28724r = messageObject.getId();
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            i10 = 0;
        } else {
            i10 = message.date;
        }
        this.f28725s = i10;
        if (message == null) {
            i11 = 0;
        } else {
            i11 = message.edit_date;
        }
        this.v = i11;
        if (message != null && (messageFwdHeader = message.fwd_from) != null) {
            i12 = messageFwdHeader.date;
        } else {
            i12 = 0;
        }
        this.f28726w = i12;
        ImageView imageView = new ImageView(context);
        addView(imageView, g7.e6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (i9 == 1) {
            if (AppGlobalConfig.getInstance(i14).messagePrimaryEditedDate.get()) {
                i13 = R.drawable.outline_message_time_24;
            } else {
                i13 = R.drawable.menu_edited_stamp;
            }
        } else if (i9 == 2) {
            i13 = R.drawable.menu_forward_stamp;
        } else if (messageObject.isVoice()) {
            i13 = R.drawable.msg_played;
        } else {
            i13 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i13).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, b6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new q80(textView, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(2.0f), b6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i15 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.7f, org.telegram.ui.ActionBar.f6.v0(i15, b6Var)));
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, g7.e6.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, g7.e6.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f28721e = textView2;
        org.telegram.messenger.ll.n(i15, b6Var, textView2, 1, 14.0f);
        TextView h = j3.r0.h(linearLayout, textView2, g7.e6.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f28722f = h;
        h.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.f6.l1(0.75f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, b6Var))));
        org.telegram.messenger.ll.n(i15, b6Var, h, 1, 11.0f);
        h.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.33f));
        linearLayout.addView(h, g7.e6.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(final Context context, final int i9, long j10, final boolean z10, Runnable runnable, final Runnable runnable2, final org.telegram.ui.ActionBar.b6 b6Var) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, b6Var, false, false);
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i9).premiumFeaturesBlocked();
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z10) {
            i10 = R.raw.large_lastseen;
        } else {
            i10 = R.raw.large_readtime;
        }
        imageView.f(i10, 70, 70, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
        f10.addView((View) imageView, g7.e6.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i17 = org.telegram.ui.ActionBar.f6.f23108j5;
        org.telegram.messenger.ll.n(i17, b6Var, textView, 1, 20.0f);
        if (z10) {
            i11 = R.string.PremiumLastSeenHeader1;
        } else {
            i11 = R.string.PremiumReadHeader1;
        }
        textView.setText(LocaleController.getString(i11));
        f10.addView(textView, g7.e6.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.messenger.ll.n(i17, b6Var, textView2, 1, 14.0f);
        if (j10 > 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(i9).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        String str2 = str;
        if (z10) {
            if (premiumFeaturesBlocked) {
                i12 = R.string.PremiumLastSeenText1Locked;
            } else {
                i12 = R.string.PremiumLastSeenText1;
            }
        } else if (premiumFeaturesBlocked) {
            i12 = R.string.PremiumReadText1Locked;
        } else {
            i12 = R.string.PremiumReadText1;
        }
        org.telegram.messenger.ll.q(i12, new Object[]{str2}, textView2);
        f10.addView(textView2, g7.e6.t(-1, -2, 1, 32, 9, 32, 19));
        final kh.d i18 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        if (z10) {
            i13 = R.string.PremiumLastSeenButton1;
        } else {
            i13 = R.string.PremiumReadButton1;
        }
        i18.g(LocaleController.getString(i13), false, true);
        f10.addView(i18, g7.e6.q(-1, 48, 1));
        i18.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                kh.d dVar = kh.d.this;
                dVar.setLoading(true);
                boolean z11 = z10;
                int i19 = i9;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                Runnable runnable3 = runnable2;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i19).sendRequest(setprivacy, new bg.b0(dVar, f3Var2, runnable3, 19));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i19).getGlobalPrivacySettings();
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i19).sendRequest(setglobalprivacysettings, new bg.h0(context, b6Var, dVar, f3Var2, runnable3, 8));
            }
        });
        if (!premiumFeaturesBlocked) {
            fb0 fb0Var = new fb0(context, b6Var);
            fb0Var.setGravity(17);
            fb0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            fb0Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
            fb0Var.l(" " + LocaleController.getString(R.string.PremiumOr) + " ", false);
            fb0Var.setTextSize(14);
            f10.addView(fb0Var, g7.e6.t(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i17, b6Var));
            textView3.setTextSize(1, 20.0f);
            if (z10) {
                i14 = R.string.PremiumLastSeenHeader2;
            } else {
                i14 = R.string.PremiumReadHeader2;
            }
            textView3.setText(LocaleController.getString(i14));
            f10.addView(textView3, g7.e6.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.messenger.ll.n(i17, b6Var, textView4, 1, 14.0f);
            if (z10) {
                i15 = R.string.PremiumLastSeenText2;
            } else {
                i15 = R.string.PremiumReadText2;
            }
            org.telegram.messenger.ll.q(i15, new Object[]{str2}, textView4);
            f10.addView(textView4, g7.e6.t(-1, -2, 1, 32, 9, 32, 19));
            zf.p0 p0Var = new zf.p0(context, b6Var, true);
            p0Var.setOnClickListener(new eb0(z10, f3Var, runnable));
            if (z10) {
                i16 = R.string.PremiumLastSeenButton2;
            } else {
                i16 = R.string.PremiumReadButton2;
            }
            p0Var.c(LocaleController.getString(i16), false, false);
            f10.addView(p0Var, g7.e6.t(-1, 48, 1, 0, 0, 0, 4));
        }
        f3Var.setCustomView(f10);
        f3Var.show();
    }

    public final void a() {
        String formatPmEditedDate;
        TextView textView = this.f28721e;
        int i9 = this.f28718a;
        TextView textView2 = this.f28722f;
        TextView textView3 = this.h;
        LinearLayout linearLayout = this.d;
        int i10 = this.f28719b;
        if (i10 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            if (AppGlobalConfig.getInstance(i9).messagePrimaryEditedDate.get()) {
                formatPmEditedDate = LocaleController.formatPmSentDate(this.f28725s);
            } else {
                formatPmEditedDate = LocaleController.formatPmEditedDate(this.v);
            }
            textView.setText(formatPmEditedDate);
        } else if (i10 == 2) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            textView.setText(LocaleController.formatPmFwdDate(this.f28726w));
        } else {
            setOnClickListener(null);
            linearLayout.setAlpha(0.0f);
            textView3.setAlpha(1.0f);
            textView2.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = MessagesController.getInstance(i9).getInputPeer(this.f28723n);
            tL_messages_getOutboxReadDate.msg_id = this.f28724r;
            ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getOutboxReadDate, new w1(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        lb lbVar;
        super.onDetachedFromWindow();
        gc gcVar = gc.f28729w;
        if (gcVar != null && (lbVar = gcVar.f28733e) != null && lbVar.getParent() != null && (gcVar.f28733e.getParent().getParent() instanceof bb)) {
            gcVar.b();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        if (this.B < 0.0f) {
            this.B = 0.0f;
            int i11 = this.f28719b;
            TextView textView = this.f28721e;
            if (i11 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.B, AndroidUtilities.dp(144.0f));
                this.B = max;
                float max2 = Math.max(max, textView.getPaint().measureText(LocaleController.getString(R.string.PmReadUnknown)) + AndroidUtilities.dp(48.0f));
                this.B = max2;
                TextPaint paint = textView.getPaint();
                float max3 = Math.max(max2, paint.measureText(LocaleController.getString(R.string.PmRead) + this.f28722f.getPaint().measureText(LocaleController.getString(R.string.PmReadShowWhen))) + AndroidUtilities.dp(64.0f));
                this.B = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadTodayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + ((float) AndroidUtilities.dp(48.0f)));
                this.B = max4;
                int i12 = this.f28728y;
                if (i12 > 86400) {
                    f10 = 48.0f;
                    this.B = Math.max(max4, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadYesterdayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(48.0f));
                } else {
                    f10 = 48.0f;
                }
                if (i12 > 172800) {
                    float max5 = Math.max(this.B, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadDateTimeAt, LocaleController.getInstance().getFormatterDayMonth().format(new Date(currentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(f10));
                    this.B = max5;
                    this.B = Math.max(max5, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadDateTimeAt, LocaleController.getInstance().getFormatterYear().format(new Date(currentTimeMillis)), LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + AndroidUtilities.dp(f10));
                }
            } else {
                this.B = textView.getPaint().measureText(textView.getText().toString()) + AndroidUtilities.dp(48.0f);
            }
        }
        int i13 = 1073741824;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f11 = this.B;
        if (size >= f11 && mode != Integer.MIN_VALUE) {
            i13 = mode;
        } else {
            size = (int) f11;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i13), i10);
    }
}
