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
public final class y6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f31163a;
    public final da0 f31164b;
    public final Runnable f31165c;

    public y6(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable, org.telegram.ui.gj gjVar) {
        super(context);
        int i11;
        this.f31163a = i10;
        this.f31165c = runnable;
        ContactsController.getInstance(i10).loadGlobalPrivacySetting();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.K7, c6Var)));
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (gjVar != null) {
            i11 = 14;
        } else {
            i11 = 0;
        }
        linearLayout.addView(imageView, w7.z5.t(80, 80, 49, 0, i11, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.ArchiveHintHeader1));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 9));
        da0 da0Var = new da0(context, null);
        this.f31164b = da0Var;
        da0Var.setTextSize(1, 14.0f);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
        da0Var.setGravity(1);
        b();
        linearLayout.addView(da0Var, w7.z5.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, LocaleController.getString("ArchiveHintSection1"), LocaleController.getString("ArchiveHintSection1Info"), c6Var), w7.z5.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, LocaleController.getString("ArchiveHintSection2"), LocaleController.getString("ArchiveHintSection2Info"), c6Var), w7.z5.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, LocaleController.getString("ArchiveHintSection3"), LocaleController.getString("ArchiveHintSection3Info"), c6Var), w7.z5.t(-1, -2, 7, 32, 0, 32, 16));
        if (gjVar != null) {
            di.d f7 = org.telegram.messenger.sk.f(24, context, c6Var, true);
            f7.g(LocaleController.getString("GotIt"), false, true);
            f7.setOnClickListener(new x6(0, gjVar));
            linearLayout.addView(f7, w7.z5.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i10, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i11 = org.telegram.ui.ActionBar.g6.f19707j5;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        imageView.setImageResource(i10);
        frameLayout.addView(imageView, w7.z5.a(24.0f, 0.0f, 8.0f, 0.0f, 0.0f, 24, 51));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, w7.z5.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
        textView2.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, w7.z5.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.z5.a(-2.0f, 41.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        return frameLayout;
    }

    public final void b() {
        boolean z10;
        String str;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.f31163a).getGlobalPrivacySettings();
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
        int i10 = org.telegram.ui.ActionBar.g6.f19660gc;
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i10, 0, this.f31165c);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        br brVar = new br(0, mutate);
        brVar.setColorKey(i10);
        brVar.setSize(AndroidUtilities.dp(18.0f));
        brVar.setWidth(AndroidUtilities.dp(11.0f));
        brVar.setTranslateX(-AndroidUtilities.dp(5.0f));
        spannableString.setSpan(brVar, 0, spannableString.length(), 33);
        this.f31164b.setText(AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString));
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
        NotificationCenter.getInstance(this.f31163a).addObserver(this, NotificationCenter.privacyRulesUpdated);
        b();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f31163a).removeObserver(this, NotificationCenter.privacyRulesUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(400.0f), View.MeasureSpec.getSize(i10)), 1073741824), i11);
    }
}
