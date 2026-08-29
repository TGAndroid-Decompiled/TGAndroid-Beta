package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class u40 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] f33124b;
    public final TextView f33125c;
    public final i80 d;
    public final org.telegram.ui.tn f33126e;
    public final aj0 f33127f;
    public final t40 h;
    public boolean f33128n;
    public final xi0 f33129r;
    public final TextView[] f33130s;
    public final String v;

    public u40(Context context, String str, org.telegram.ui.tn tnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.f33124b = new TextView[2];
        this.f33130s = new TextView[2];
        rp rpVar = new rp(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.f33126e = tnVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        textView.setTextColor(getThemedColor(i10));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        int i11 = R.raw.import_finish;
        xi0 xi0Var = new xi0(i11, "" + R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f33129r = xi0Var;
        xi0Var.H(true);
        ?? imageView = new ImageView(context);
        this.f33127f = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.import_loop, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, i7.f6.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().P(178, rpVar);
        TextView textView2 = new TextView(context);
        this.f33125c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i10));
        frameLayout.addView(textView2, i7.f6.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        i80 i80Var = new i80(getContext());
        this.d = i80Var;
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        i80Var.setProgressColor(getThemedColor(i12));
        i80Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.g6.G5));
        frameLayout.addView(i80Var, i7.f6.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f32863a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        view.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, v03, v03));
        frameLayout2.addView(view, i7.f6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, i7.f6.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f32865c = imageView2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i13 = org.telegram.ui.ActionBar.g6.Sh;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.K(dp2, org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.f(R.raw.import_check, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, i7.f6.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f32864b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        org.telegram.ui.th.n(14.0f, 1, textView3);
        linearLayout.addView(textView3, i7.f6.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ImportDone));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new h0(this, 27));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, i7.f6.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i14 = 0; i14 < 2; i14++) {
            this.f33124b[i14] = new TextView(context);
            this.f33124b[i14].setTextSize(1, 16.0f);
            this.f33124b[i14].setTypeface(AndroidUtilities.bold());
            this.f33124b[i14].setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23169j5));
            frameLayout.addView(this.f33124b[i14], i7.f6.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f33130s[i14] = new TextView(context);
            this.f33130s[i14].setTextSize(1, 14.0f);
            this.f33130s[i14].setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23310r5));
            this.f33130s[i14].setGravity(1);
            frameLayout.addView(this.f33130s[i14], i7.f6.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i14 == 0) {
                this.f33130s[i14].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f33130s[i14].setAlpha(0.0f);
                this.f33130s[i14].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f33124b[i14].setAlpha(0.0f);
                this.f33124b[i14].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.f33126e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.f33126e.getSendMessagesHelper().getImportingHistory(this.f33126e.a());
            this.f33125c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f33124b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f33130s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f33124b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.f33126e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f33125c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f33124b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f33130s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f33124b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        i80 i80Var = this.d;
        TextView[] textViewArr = this.f33124b;
        TextView textView = this.f33125c;
        aj0 aj0Var = this.f33127f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.tn tnVar = this.f33126e;
            SendMessagesHelper.ImportingHistory importingHistory = tnVar.getSendMessagesHelper().getImportingHistory(tnVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.f33128n && ((180 - aj0Var.getAnimatedDrawable().X) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                aj0Var.setAutoRepeat(false);
                this.f33128n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            i80Var.a(importingHistory.uploadProgress / 100.0f, true);
        } else if (i10 == NotificationCenter.stickersImportProgressChanged) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(this.v);
            if (importingStickers == null) {
                m();
                return;
            }
            if (!this.f33128n && ((180 - aj0Var.getAnimatedDrawable().X) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                aj0Var.setAutoRepeat(false);
                this.f33128n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            i80Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.tn tnVar = this.f33126e;
        if (tnVar != null) {
            tnVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.f33128n = true;
        this.f33127f.setAutoRepeat(false);
        t40 t40Var = this.h;
        t40Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(jr.f29801g);
        Property property = View.ALPHA;
        TextView textView = this.f33125c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f33130s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f33124b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.d, property, 0.0f), ObjectAnimator.ofFloat(t40Var.d, property2, AndroidUtilities.dp(8.0f), 0.0f));
        t40Var.f32863a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        t40Var.f32865c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        t40Var.f32865c.d();
        animatorSet.start();
    }
}
