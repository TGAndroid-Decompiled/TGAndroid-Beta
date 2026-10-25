package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
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
    public final int f34933a;
    public final z90 f34934b;
    public final Runnable f34935c;

    public y6(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable, org.telegram.ui.ui uiVar) {
        super(context);
        int i11;
        this.f34933a = i10;
        this.f34935c = runnable;
        ContactsController.getInstance(i10).loadGlobalPrivacySetting();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, gb1.i(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int dp = AndroidUtilities.dp(80.0f);
        int i12 = org.telegram.ui.ActionBar.y6.K7;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, u6Var);
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (uiVar != null) {
            i11 = 14;
        } else {
            i11 = 0;
        }
        linearLayout.addView(imageView, gb1.x(80, 80, 49, 0, i11, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.ArchiveHintHeader1));
        linearLayout.addView(textView, gb1.x(-1, -2, 1, 32, 0, 32, 9));
        z90 z90Var = new z90(context, null);
        this.f34934b = z90Var;
        z90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
        z90Var.setGravity(1);
        b();
        linearLayout.addView(z90Var, gb1.x(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, LocaleController.getString("ArchiveHintSection1"), LocaleController.getString("ArchiveHintSection1Info"), u6Var), gb1.x(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, LocaleController.getString("ArchiveHintSection2"), LocaleController.getString("ArchiveHintSection2Info"), u6Var), gb1.x(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, LocaleController.getString("ArchiveHintSection3"), LocaleController.getString("ArchiveHintSection3Info"), u6Var), gb1.x(-1, -2, 7, 32, 0, 32, 16));
        if (uiVar != null) {
            fi.d f7 = org.telegram.messenger.vh.f(24, context, u6Var, true);
            f7.i(LocaleController.getString("GotIt"), false, true);
            f7.setOnClickListener(new x6(0, uiVar));
            linearLayout.addView(f7, gb1.o(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i10, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i11 = org.telegram.ui.ActionBar.y6.f23462j5;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i10);
        frameLayout.addView(imageView, gb1.h(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, gb1.o(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
        textView2.setTextSize(0, AndroidUtilities.dp(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, gb1.o(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, gb1.h(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        boolean z10;
        String str;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.f34933a).getGlobalPrivacySettings();
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
        int i10 = org.telegram.ui.ActionBar.y6.gc;
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i10, 0, this.f34935c);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        zq zqVar = new zq(0, mutate);
        zqVar.setColorKey(i10);
        zqVar.setSize(AndroidUtilities.dp(18.0f));
        zqVar.setWidth(AndroidUtilities.dp(11.0f));
        zqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
        this.f34934b.setText(AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString));
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
        NotificationCenter.getInstance(this.f34933a).addObserver(this, NotificationCenter.privacyRulesUpdated);
        b();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f34933a).removeObserver(this, NotificationCenter.privacyRulesUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(400.0f), View.MeasureSpec.getSize(i10)), 1073741824), i11);
    }
}
