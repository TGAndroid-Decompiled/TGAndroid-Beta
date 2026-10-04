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
public final class a50 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] f24458b;
    public final TextView f24459c;
    public final a90 d;
    public final org.telegram.ui.yn f24460e;
    public final nj0 f24461f;
    public final z40 h;
    public boolean f24462n;
    public final kj0 f24463r;
    public final TextView[] f24464s;
    public final String v;

    public a50(Context context, String str, org.telegram.ui.yn ynVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.f24458b = new TextView[2];
        this.f24464s = new TextView[2];
        aq aqVar = new aq(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.f24460e = ynVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.ok.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.i6.f20925j5;
        textView.setTextColor(getThemedColor(i10));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        kj0 kj0Var = new kj0(R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f24463r = kj0Var;
        kj0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f24461f = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.import_loop, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, w7.z5.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().S(178, aqVar);
        TextView textView2 = new TextView(context);
        this.f24459c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i10));
        frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        a90 a90Var = new a90(getContext());
        this.d = a90Var;
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        a90Var.setProgressColor(getThemedColor(i11));
        a90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.i6.G5));
        frameLayout.addView(a90Var, w7.z5.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f33376a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Qh, d6Var);
        view.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, v02, v03, v03));
        frameLayout2.addView(view, w7.z5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, w7.z5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f33378c = imageView2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i12 = org.telegram.ui.ActionBar.i6.Sh;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.K(dp2, org.telegram.ui.ActionBar.i6.v0(i12, d6Var)));
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.f(R.raw.import_check, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, w7.z5.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f33377b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView3);
        linearLayout.addView(textView3, w7.z5.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ImportDone));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new f0(this, 27));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, w7.z5.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.f24458b[i13] = new TextView(context);
            this.f24458b[i13].setTextSize(1, 16.0f);
            this.f24458b[i13].setTypeface(AndroidUtilities.bold());
            this.f24458b[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20925j5));
            frameLayout.addView(this.f24458b[i13], w7.z5.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f24464s[i13] = new TextView(context);
            this.f24464s[i13].setTextSize(1, 14.0f);
            this.f24464s[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21076r5));
            this.f24464s[i13].setGravity(1);
            frameLayout.addView(this.f24464s[i13], w7.z5.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.f24464s[i13].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f24464s[i13].setAlpha(0.0f);
                this.f24464s[i13].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f24458b[i13].setAlpha(0.0f);
                this.f24458b[i13].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.f24460e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.f24460e.getSendMessagesHelper().getImportingHistory(this.f24460e.a());
            this.f24459c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f24458b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f24464s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f24458b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.f24460e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f24459c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f24458b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f24464s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f24458b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        a90 a90Var = this.d;
        TextView[] textViewArr = this.f24458b;
        TextView textView = this.f24459c;
        nj0 nj0Var = this.f24461f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.yn ynVar = this.f24460e;
            SendMessagesHelper.ImportingHistory importingHistory = ynVar.getSendMessagesHelper().getImportingHistory(ynVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.f24462n && ((180 - nj0Var.getAnimatedDrawable().f28118a0) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                nj0Var.setAutoRepeat(false);
                this.f24462n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            a90Var.a(importingHistory.uploadProgress / 100.0f, true);
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
            if (!this.f24462n && ((180 - nj0Var.getAnimatedDrawable().f28118a0) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                nj0Var.setAutoRepeat(false);
                this.f24462n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            a90Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.yn ynVar = this.f24460e;
        if (ynVar != null) {
            ynVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.f24462n = true;
        this.f24461f.setAutoRepeat(false);
        z40 z40Var = this.h;
        z40Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(tr.f31141g);
        Property property = View.ALPHA;
        TextView textView = this.f24459c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f24464s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f24458b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.d, property, 0.0f), ObjectAnimator.ofFloat(z40Var.d, property2, AndroidUtilities.dp(8.0f), 0.0f));
        z40Var.f33376a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        z40Var.f33378c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        z40Var.f33378c.d();
        animatorSet.start();
    }
}
