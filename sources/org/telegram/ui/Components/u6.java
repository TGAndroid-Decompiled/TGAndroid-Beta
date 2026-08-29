package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class u6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f33145a;
    public final y80 f33146b;
    public final Runnable f33147c;

    public u6(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable, org.telegram.ui.ui uiVar) {
        super(context);
        int i11;
        this.f33145a = i10;
        this.f33147c = runnable;
        ContactsController.getInstance(i10).loadGlobalPrivacySetting();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, i7.f6.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.K7, c6Var)));
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (uiVar != null) {
            i11 = 14;
        } else {
            i11 = 0;
        }
        linearLayout.addView(imageView, i7.f6.t(80, 80, 49, 0, i11, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.ArchiveHintHeader1));
        linearLayout.addView(textView, i7.f6.t(-1, -2, 1, 32, 0, 32, 9));
        y80 y80Var = new y80(context, null);
        this.f33146b = y80Var;
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
        y80Var.setGravity(1);
        b();
        linearLayout.addView(y80Var, i7.f6.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, LocaleController.getString("ArchiveHintSection1"), LocaleController.getString("ArchiveHintSection1Info"), c6Var), i7.f6.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, LocaleController.getString("ArchiveHintSection2"), LocaleController.getString("ArchiveHintSection2Info"), c6Var), i7.f6.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, LocaleController.getString("ArchiveHintSection3"), LocaleController.getString("ArchiveHintSection3Info"), c6Var), i7.f6.t(-1, -2, 7, 32, 0, 32, 16));
        if (uiVar != null) {
            nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
            o10.g(LocaleController.getString("GotIt"), false, true);
            o10.setOnClickListener(new t6(0, uiVar));
            linearLayout.addView(o10, i7.f6.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i10, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        imageView.setImageResource(i10);
        frameLayout.addView(imageView, i7.f6.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, i7.f6.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
        textView2.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, i7.f6.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, i7.f6.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        boolean z10;
        String str;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.f33145a).getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            z10 = globalPrivacySettings.keep_archived_unmuted;
        } else {
            z10 = true;
        }
        if (z10) {
            str = "ArchiveHintSubtitle";
        } else {
            str = "ArchiveHintSubtitleUnmutedMove";
        }
        String string = LocaleController.getString(str);
        int i10 = org.telegram.ui.ActionBar.g6.gc;
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i10, 0, this.f33147c);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        iq iqVar = new iq(0, mutate);
        iqVar.setColorKey(i10);
        iqVar.setSize(AndroidUtilities.dp(18.0f));
        iqVar.setWidth(AndroidUtilities.dp(11.0f));
        iqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
        spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
        this.f33146b.setText(AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f33145a).addObserver(this, NotificationCenter.privacyRulesUpdated);
        b();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f33145a).removeObserver(this, NotificationCenter.privacyRulesUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(400.0f), View.MeasureSpec.getSize(i10)), 1073741824), i11);
    }
}
