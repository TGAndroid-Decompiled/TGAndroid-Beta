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
public final class v6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f29054a;
    public final p90 f29055b;
    public final Runnable f29056c;

    public v6(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, org.telegram.ui.cj cjVar) {
        super(context);
        int i11;
        this.f29054a = i10;
        this.f29056c = runnable;
        ContactsController.getInstance(i10).loadGlobalPrivacySetting();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.K7, e6Var)));
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (cjVar != null) {
            i11 = 14;
        } else {
            i11 = 0;
        }
        linearLayout.addView(imageView, w7.y5.t(80, 80, 49, 0, i11, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19164j5, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.ArchiveHintHeader1));
        linearLayout.addView(textView, w7.y5.t(-1, -2, 1, 32, 0, 32, 9));
        p90 p90Var = new p90(context, null);
        this.f29055b = p90Var;
        p90Var.setTextSize(1, 14.0f);
        p90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19461z6, e6Var));
        p90Var.setGravity(1);
        b();
        linearLayout.addView(p90Var, w7.y5.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, LocaleController.getString("ArchiveHintSection1"), LocaleController.getString("ArchiveHintSection1Info"), e6Var), w7.y5.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, LocaleController.getString("ArchiveHintSection2"), LocaleController.getString("ArchiveHintSection2Info"), e6Var), w7.y5.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, LocaleController.getString("ArchiveHintSection3"), LocaleController.getString("ArchiveHintSection3Info"), e6Var), w7.y5.t(-1, -2, 7, 32, 0, 32, 16));
        if (cjVar != null) {
            ci.d g10 = org.telegram.messenger.qk.g(24, context, e6Var, true);
            g10.g(LocaleController.getString("GotIt"), false, true);
            g10.setOnClickListener(new u6(0, cjVar));
            linearLayout.addView(g10, w7.y5.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i10, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i11 = org.telegram.ui.ActionBar.i6.f19164j5;
        imageView.setColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        imageView.setImageResource(i10);
        frameLayout.addView(imageView, w7.y5.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, w7.y5.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19461z6, e6Var));
        textView2.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, w7.y5.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.y5.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        boolean z10;
        String str;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.f29054a).getGlobalPrivacySettings();
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
        int i10 = org.telegram.ui.ActionBar.i6.gc;
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i10, 0, this.f29056c);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        qq qqVar = new qq(0, mutate);
        qqVar.setColorKey(i10);
        qqVar.setSize(AndroidUtilities.dp(18.0f));
        qqVar.setWidth(AndroidUtilities.dp(11.0f));
        qqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
        spannableString.setSpan(qqVar, 0, spannableString.length(), 33);
        this.f29055b.setText(AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString));
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
        NotificationCenter.getInstance(this.f29054a).addObserver(this, NotificationCenter.privacyRulesUpdated);
        b();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f29054a).removeObserver(this, NotificationCenter.privacyRulesUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(400.0f), View.MeasureSpec.getSize(i10)), 1073741824), i11);
    }
}
