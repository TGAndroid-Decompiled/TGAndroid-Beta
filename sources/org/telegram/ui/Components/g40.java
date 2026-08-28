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
public final class g40 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] f28636b;
    public final TextView f28637c;
    public final v70 d;
    public final org.telegram.ui.qn f28638e;
    public final pi0 f28639f;
    public final f40 h;
    public boolean f28640n;
    public final mi0 f28641r;
    public final TextView[] f28642s;
    public final String v;

    public g40(Context context, String str, org.telegram.ui.qn qnVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        this.f28636b = new TextView[2];
        this.f28642s = new TextView[2];
        np npVar = new np(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.f28638e = qnVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.k(20.0f, 1, textView);
        int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(getThemedColor(i9));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        int i10 = R.raw.import_finish;
        mi0 mi0Var = new mi0(i10, "" + R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f28641r = mi0Var;
        mi0Var.H(true);
        ?? imageView = new ImageView(context);
        this.f28639f = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.import_loop, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, g7.e6.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().P(178, npVar);
        TextView textView2 = new TextView(context);
        this.f28637c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i9));
        frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        v70 v70Var = new v70(getContext());
        this.d = v70Var;
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        v70Var.setProgressColor(getThemedColor(i11));
        v70Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.f6.G5));
        frameLayout.addView(v70Var, g7.e6.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f28264a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Qh, b6Var);
        view.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, v03, v03));
        frameLayout2.addView(view, g7.e6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, g7.e6.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f28266c = imageView2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i12 = org.telegram.ui.ActionBar.f6.Sh;
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.K(dp2, org.telegram.ui.ActionBar.f6.v0(i12, b6Var)));
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.f(R.raw.import_check, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, g7.e6.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f28265b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        j3.r0.u(14.0f, 1, textView3);
        linearLayout.addView(textView3, g7.e6.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ImportDone));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new f0(this, 27));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, g7.e6.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.f28636b[i13] = new TextView(context);
            this.f28636b[i13].setTextSize(1, 16.0f);
            this.f28636b[i13].setTypeface(AndroidUtilities.bold());
            this.f28636b[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
            frameLayout.addView(this.f28636b[i13], g7.e6.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f28642s[i13] = new TextView(context);
            this.f28642s[i13].setTextSize(1, 14.0f);
            this.f28642s[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23247r5));
            this.f28642s[i13].setGravity(1);
            frameLayout.addView(this.f28642s[i13], g7.e6.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.f28642s[i13].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f28642s[i13].setAlpha(0.0f);
                this.f28642s[i13].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f28636b[i13].setAlpha(0.0f);
                this.f28636b[i13].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.f28638e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.f28638e.getSendMessagesHelper().getImportingHistory(this.f28638e.a());
            this.f28637c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f28636b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f28642s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f28636b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.f28638e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f28637c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f28636b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f28642s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f28636b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.historyImportProgressChanged;
        v70 v70Var = this.d;
        TextView[] textViewArr = this.f28636b;
        TextView textView = this.f28637c;
        pi0 pi0Var = this.f28639f;
        if (i9 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.qn qnVar = this.f28638e;
            SendMessagesHelper.ImportingHistory importingHistory = qnVar.getSendMessagesHelper().getImportingHistory(qnVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.f28640n && ((180 - pi0Var.getAnimatedDrawable().X) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                pi0Var.setAutoRepeat(false);
                this.f28640n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            v70Var.a(importingHistory.uploadProgress / 100.0f, true);
        } else if (i9 == NotificationCenter.stickersImportProgressChanged) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(this.v);
            if (importingStickers == null) {
                m();
                return;
            }
            if (!this.f28640n && ((180 - pi0Var.getAnimatedDrawable().X) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                pi0Var.setAutoRepeat(false);
                this.f28640n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            v70Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.qn qnVar = this.f28638e;
        if (qnVar != null) {
            qnVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.f28640n = true;
        this.f28639f.setAutoRepeat(false);
        f40 f40Var = this.h;
        f40Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(gr.f28845g);
        Property property = View.ALPHA;
        TextView textView = this.f28637c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f28642s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f28636b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.d, property, 0.0f), ObjectAnimator.ofFloat(f40Var.d, property2, AndroidUtilities.dp(8.0f), 0.0f));
        f40Var.f28264a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        f40Var.f28266c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        f40Var.f28266c.d();
        animatorSet.start();
    }
}
