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
public final class k50 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] f26580b;
    public final TextView f26581c;
    public final n90 d;
    public final org.telegram.ui.fo e;
    public final bk0 f26582f;
    public final j50 h;
    public boolean f26583n;
    public final yj0 f26584r;
    public final TextView[] f26585s;
    public final String v;

    public k50(Context context, String str, org.telegram.ui.fo foVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        this.f26580b = new TextView[2];
        this.f26585s = new TextView[2];
        kq kqVar = new kq(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.e = foVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.yh.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.f20007j5;
        textView.setTextColor(getThemedColor(i10));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, w7.a6.a(-2.0f, 17.0f, 20.0f, 17.0f, 0.0f, -2, 51));
        yj0 yj0Var = new yj0(R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f26584r = yj0Var;
        yj0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f26582f = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.import_loop, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, w7.a6.a(160.0f, 17.0f, 79.0f, 17.0f, 0.0f, 160, 49));
        imageView.getAnimatedDrawable().S(178, kqVar);
        TextView textView2 = new TextView(context);
        this.f26581c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i10));
        frameLayout.addView(textView2, w7.a6.a(-2.0f, 17.0f, 262.0f, 17.0f, 0.0f, -2, 49));
        n90 n90Var = new n90(getContext());
        this.d = n90Var;
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        n90Var.setProgressColor(getThemedColor(i11));
        n90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.g6.G5));
        frameLayout.addView(n90Var, w7.a6.a(4.0f, 50.0f, 307.0f, 50.0f, 0.0f, -1, 51));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f26189a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        view.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, w03, w03));
        frameLayout2.addView(view, w7.a6.a(-1.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, w7.a6.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f26191c = imageView2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Sh;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.K(dp2, org.telegram.ui.ActionBar.g6.w0(i12, c6Var)));
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.f(R.raw.import_check, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, w7.a6.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f26190b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView3);
        linearLayout.addView(textView3, w7.a6.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ImportDone));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new f0(this, 26));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, w7.a6.a(50.0f, 34.0f, 247.0f, 34.0f, 0.0f, -1, 51));
        for (int i13 = 0; i13 < 2; i13++) {
            this.f26580b[i13] = new TextView(context);
            this.f26580b[i13].setTextSize(1, 16.0f);
            this.f26580b[i13].setTypeface(AndroidUtilities.bold());
            this.f26580b[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20007j5));
            frameLayout.addView(this.f26580b[i13], w7.a6.a(-2.0f, 17.0f, 340.0f, 17.0f, 0.0f, -2, 49));
            this.f26585s[i13] = new TextView(context);
            this.f26585s[i13].setTextSize(1, 14.0f);
            this.f26585s[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20157r5));
            this.f26585s[i13].setGravity(1);
            frameLayout.addView(this.f26585s[i13], w7.a6.a(-2.0f, 30.0f, 368.0f, 30.0f, 44.0f, -2, 49));
            if (i13 == 0) {
                this.f26585s[i13].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f26585s[i13].setAlpha(0.0f);
                this.f26585s[i13].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f26580b[i13].setAlpha(0.0f);
                this.f26580b[i13].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.e.getSendMessagesHelper().getImportingHistory(this.e.a());
            this.f26581c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f26580b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f26585s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f26580b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f26581c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f26580b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f26585s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f26580b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        n90 n90Var = this.d;
        TextView[] textViewArr = this.f26580b;
        TextView textView = this.f26581c;
        bk0 bk0Var = this.f26582f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.fo foVar = this.e;
            SendMessagesHelper.ImportingHistory importingHistory = foVar.getSendMessagesHelper().getImportingHistory(foVar.a());
            if (importingHistory == null) {
                n();
                return;
            }
            if (!this.f26583n && ((180 - bk0Var.getAnimatedDrawable().f31602a0) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                bk0Var.setAutoRepeat(false);
                this.f26583n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            n90Var.a(importingHistory.uploadProgress / 100.0f, true);
        } else if (i10 == NotificationCenter.stickersImportProgressChanged) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(this.v);
            if (importingStickers == null) {
                n();
                return;
            }
            if (!this.f26583n && ((180 - bk0Var.getAnimatedDrawable().f31602a0) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                bk0Var.setAutoRepeat(false);
                this.f26583n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            n90Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.fo foVar = this.e;
        if (foVar != null) {
            foVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void n() {
        this.f26583n = true;
        this.f26582f.setAutoRepeat(false);
        j50 j50Var = this.h;
        j50Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(es.f24772g);
        Property property = View.ALPHA;
        TextView textView = this.f26581c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f26585s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f26580b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.d, property, 0.0f), ObjectAnimator.ofFloat(j50Var.d, property2, AndroidUtilities.dp(8.0f), 0.0f));
        j50Var.f26189a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        j50Var.f26191c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        j50Var.f26191c.d();
        animatorSet.start();
    }
}
