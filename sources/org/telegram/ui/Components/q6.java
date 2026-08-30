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
public final class q6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f28063a;
    public final e90 f28064b;
    public final Runnable f28065c;

    public q6(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable, org.telegram.ui.zi ziVar) {
        super(context);
        int i11;
        this.f28063a = i10;
        this.f28065c = runnable;
        ContactsController.getInstance(i10).loadGlobalPrivacySetting();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.b6.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.K7, f6Var)));
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (ziVar != null) {
            i11 = 14;
        } else {
            i11 = 0;
        }
        linearLayout.addView(imageView, k7.b6.t(80, 80, 49, 0, i11, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20012j5, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.ArchiveHintHeader1));
        linearLayout.addView(textView, k7.b6.t(-1, -2, 1, 32, 0, 32, 9));
        e90 e90Var = new e90(context, null);
        this.f28064b = e90Var;
        e90Var.setTextSize(1, 14.0f);
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20298z6, f6Var));
        e90Var.setGravity(1);
        b();
        linearLayout.addView(e90Var, k7.b6.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, LocaleController.getString("ArchiveHintSection1"), LocaleController.getString("ArchiveHintSection1Info"), f6Var), k7.b6.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, LocaleController.getString("ArchiveHintSection2"), LocaleController.getString("ArchiveHintSection2Info"), f6Var), k7.b6.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, LocaleController.getString("ArchiveHintSection3"), LocaleController.getString("ArchiveHintSection3Info"), f6Var), k7.b6.t(-1, -2, 7, 32, 0, 32, 16));
        if (ziVar != null) {
            ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
            p10.g(LocaleController.getString("GotIt"), false, true);
            p10.setOnClickListener(new p6(0, ziVar));
            linearLayout.addView(p10, k7.b6.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i10, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i11 = org.telegram.ui.ActionBar.j6.f20012j5;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        imageView.setImageResource(i10);
        frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, k7.b6.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20298z6, f6Var));
        textView2.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, k7.b6.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, k7.b6.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        boolean z4;
        String str;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.f28063a).getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            z4 = globalPrivacySettings.keep_archived_unmuted;
        } else {
            z4 = true;
        }
        if (z4) {
            str = "ArchiveHintSubtitle";
        } else {
            str = "ArchiveHintSubtitleUnmutedMove";
        }
        String string = LocaleController.getString(str);
        int i10 = org.telegram.ui.ActionBar.j6.f19966gc;
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i10, 0, this.f28065c);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        mq mqVar = new mq(0, mutate);
        mqVar.setColorKey(i10);
        mqVar.setSize(AndroidUtilities.dp(18.0f));
        mqVar.setWidth(AndroidUtilities.dp(11.0f));
        mqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
        spannableString.setSpan(mqVar, 0, spannableString.length(), 33);
        this.f28064b.setText(AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString));
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
        NotificationCenter.getInstance(this.f28063a).addObserver(this, NotificationCenter.privacyRulesUpdated);
        b();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f28063a).removeObserver(this, NotificationCenter.privacyRulesUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(400.0f), View.MeasureSpec.getSize(i10)), 1073741824), i11);
    }
}
