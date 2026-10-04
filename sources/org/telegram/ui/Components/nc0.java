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
public final class nc0 extends FrameLayout {
    public boolean E;
    public float F;
    public final int f28929a;
    public final int f28930b;
    public final org.telegram.ui.ActionBar.d6 f28931c;
    public final LinearLayout d;
    public final TextView f28932e;
    public final TextView f28933f;
    public final TextView h;
    public final long f28934n;
    public final int f28935r;
    public final int f28936s;
    public final int v;
    public final int f28937w;
    public final Runnable f28938x;
    public final int f28939y;

    public nc0(Context context, int i10, MessageObject messageObject, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.E = false;
        this.F = -1.0f;
        this.f28930b = i10;
        int i15 = messageObject.currentAccount;
        this.f28929a = i15;
        this.f28931c = d6Var;
        this.f28938x = runnable;
        this.f28939y = ConnectionsManager.getInstance(i15).getCurrentTime() - messageObject.messageOwner.date;
        this.f28934n = messageObject.getDialogId();
        this.f28935r = messageObject.getId();
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            i11 = 0;
        } else {
            i11 = message.date;
        }
        this.f28936s = i11;
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
        this.f28937w = i13;
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.z5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
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
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new v90(textView, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(2.0f), d6Var), 0, spannableStringBuilder.length() - 1, 17);
        int i16 = org.telegram.ui.ActionBar.i6.f20926j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.7f, org.telegram.ui.ActionBar.i6.v0(i16, d6Var)));
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.z5.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, w7.z5.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f28932e = textView2;
        org.telegram.messenger.ok.n(i16, d6Var, textView2, 1, 14.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView2, w7.z5.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f28933f = h;
        h.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.i6.l1(0.75f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20819d7, d6Var))));
        org.telegram.messenger.ok.n(i16, d6Var, h, 1, 11.0f);
        h.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.33f));
        linearLayout.addView(h, w7.z5.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(final Context context, final int i10, long j3, final boolean z10, Runnable runnable, final Runnable runnable2, final org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20890h5, d6Var));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i10).premiumFeaturesBlocked();
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
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
        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var)));
        f7.addView((View) imageView, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i18 = org.telegram.ui.ActionBar.i6.f20926j5;
        org.telegram.messenger.ok.n(i18, d6Var, textView, 1, 20.0f);
        if (z10) {
            i12 = R.string.PremiumLastSeenHeader1;
        } else {
            i12 = R.string.PremiumReadHeader1;
        }
        textView.setText(LocaleController.getString(i12));
        f7.addView(textView, w7.z5.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        org.telegram.messenger.ok.n(i18, d6Var, textView2, 1, 14.0f);
        if (j3 > 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
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
        org.telegram.messenger.ok.q(i13, new Object[]{str2}, textView2);
        f7.addView(textView2, w7.z5.t(-1, -2, 1, 32, 9, 32, 19));
        final ci.d g10 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        if (z10) {
            i14 = R.string.PremiumLastSeenButton1;
        } else {
            i14 = R.string.PremiumReadButton1;
        }
        g10.g(LocaleController.getString(i14), false, true);
        f7.addView(g10, w7.z5.q(-1, 48, 1));
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ci.d dVar = ci.d.this;
                dVar.setLoading(true);
                boolean z11 = z10;
                int i19 = i10;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                Runnable runnable3 = runnable2;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i19).sendRequest(setprivacy, new ai.s5(dVar, f3Var2, runnable3, 11));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(i19).getGlobalPrivacySettings();
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i19).sendRequest(setglobalprivacysettings, new ci.gd(context, d6Var, dVar, f3Var2, runnable3, 5));
            }
        });
        if (!premiumFeaturesBlocked) {
            mc0 mc0Var = new mc0(context, d6Var);
            mc0Var.setGravity(17);
            mc0Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            mc0Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21224z6, d6Var));
            mc0Var.l(" " + LocaleController.getString(R.string.PremiumOr) + " ", false);
            mc0Var.setTextSize(14);
            f7.addView(mc0Var, w7.z5.t(270, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(17);
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, d6Var));
            textView3.setTextSize(1, 20.0f);
            if (z10) {
                i15 = R.string.PremiumLastSeenHeader2;
            } else {
                i15 = R.string.PremiumReadHeader2;
            }
            textView3.setText(LocaleController.getString(i15));
            f7.addView(textView3, w7.z5.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            org.telegram.messenger.ok.n(i18, d6Var, textView4, 1, 14.0f);
            if (z10) {
                i16 = R.string.PremiumLastSeenText2;
            } else {
                i16 = R.string.PremiumReadText2;
            }
            org.telegram.messenger.ok.q(i16, new Object[]{str2}, textView4);
            f7.addView(textView4, w7.z5.t(-1, -2, 1, 32, 9, 32, 19));
            rg.q0 q0Var = new rg.q0(context, d6Var, true);
            q0Var.setOnClickListener(new kc0(z10, f3Var, runnable));
            if (z10) {
                i17 = R.string.PremiumLastSeenButton2;
            } else {
                i17 = R.string.PremiumReadButton2;
            }
            q0Var.b(LocaleController.getString(i17), false, false);
            f7.addView(q0Var, w7.z5.t(-1, 48, 1, 0, 0, 0, 4));
        }
        f3Var.setCustomView(f7);
        f3Var.show();
    }

    public final void a() {
        String formatPmEditedDate;
        TextView textView = this.f28932e;
        int i10 = this.f28929a;
        TextView textView2 = this.f28933f;
        TextView textView3 = this.h;
        LinearLayout linearLayout = this.d;
        int i11 = this.f28930b;
        if (i11 == 1) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            if (AppGlobalConfig.getInstance(i10).messagePrimaryEditedDate.get()) {
                formatPmEditedDate = LocaleController.formatPmSentDate(this.f28936s);
            } else {
                formatPmEditedDate = LocaleController.formatPmEditedDate(this.v);
            }
            textView.setText(formatPmEditedDate);
        } else if (i11 == 2) {
            linearLayout.setAlpha(1.0f);
            textView3.setAlpha(0.0f);
            textView2.setVisibility(8);
            textView.setText(LocaleController.formatPmFwdDate(this.f28937w));
        } else {
            setOnClickListener(null);
            linearLayout.setAlpha(0.0f);
            textView3.setAlpha(1.0f);
            textView2.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = MessagesController.getInstance(i10).getInputPeer(this.f28934n);
            tL_messages_getOutboxReadDate.msg_id = this.f28935r;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getOutboxReadDate, new y1(this, 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        vb vbVar;
        super.onDetachedFromWindow();
        rc rcVar = rc.f30331w;
        if (rcVar != null && (vbVar = rcVar.f30335e) != null && vbVar.getParent() != null && (rcVar.f30335e.getParent().getParent() instanceof lb)) {
            rcVar.b();
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
            int i12 = this.f28930b;
            TextView textView = this.f28932e;
            if (i12 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.F, AndroidUtilities.dp(144.0f));
                this.F = max;
                float max2 = Math.max(max, textView.getPaint().measureText(LocaleController.getString(R.string.PmReadUnknown)) + AndroidUtilities.dp(48.0f));
                this.F = max2;
                TextPaint paint = textView.getPaint();
                float max3 = Math.max(max2, paint.measureText(LocaleController.getString(R.string.PmRead) + this.f28933f.getPaint().measureText(LocaleController.getString(R.string.PmReadShowWhen))) + AndroidUtilities.dp(64.0f));
                this.F = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(LocaleController.formatString(R.string.PmReadTodayAt, LocaleController.getInstance().getFormatterDay().format(new Date(currentTimeMillis)))) + ((float) AndroidUtilities.dp(48.0f)));
                this.F = max4;
                int i13 = this.f28939y;
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
