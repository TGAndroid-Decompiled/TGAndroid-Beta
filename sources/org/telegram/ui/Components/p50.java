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
public final class p50 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] f29612b;
    public final TextView f29613c;
    public final p90 d;
    public final org.telegram.ui.zn f29614e;
    public final hk0 f29615f;
    public final o50 h;
    public boolean f29616n;
    public final ek0 f29617r;
    public final TextView[] f29618s;
    public final String v;

    public p50(Context context, String str, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.f29612b = new TextView[2];
        this.f29618s = new TextView[2];
        nq nqVar = new nq(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.f29614e = znVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.ai.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.h6.f20894j5;
        textView.setTextColor(getThemedColor(i10));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 17.0f, 20.0f, 17.0f, 0.0f, -2, 51));
        ek0 ek0Var = new ek0(R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f29617r = ek0Var;
        ek0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f29615f = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.import_loop, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, w7.x5.a(160.0f, 17.0f, 79.0f, 17.0f, 0.0f, 160, 49));
        imageView.getAnimatedDrawable().S(178, nqVar);
        TextView textView2 = new TextView(context);
        this.f29613c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i10));
        frameLayout.addView(textView2, w7.x5.a(-2.0f, 17.0f, 262.0f, 17.0f, 0.0f, -2, 49));
        p90 p90Var = new p90(getContext());
        this.d = p90Var;
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        p90Var.setProgressColor(getThemedColor(i11));
        p90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.h6.G5));
        frameLayout.addView(p90Var, w7.x5.a(4.0f, 50.0f, 307.0f, 50.0f, 0.0f, -1, 51));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f29258a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Qh, d6Var);
        view.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w02, w03, w03));
        frameLayout2.addView(view, w7.x5.a(-1.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, w7.x5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f29260c = imageView2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i12 = org.telegram.ui.ActionBar.h6.Sh;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.K(dp2, org.telegram.ui.ActionBar.h6.w0(i12, d6Var)));
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.f(R.raw.import_check, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, w7.x5.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f29259b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView3);
        linearLayout.addView(textView3, w7.x5.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ImportDone));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new f0(this, 26));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, w7.x5.a(50.0f, 34.0f, 247.0f, 34.0f, 0.0f, -1, 51));
        for (int i13 = 0; i13 < 2; i13++) {
            this.f29612b[i13] = new TextView(context);
            this.f29612b[i13].setTextSize(1, 16.0f);
            this.f29612b[i13].setTypeface(AndroidUtilities.bold());
            this.f29612b[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20894j5));
            frameLayout.addView(this.f29612b[i13], w7.x5.a(-2.0f, 17.0f, 340.0f, 17.0f, 0.0f, -2, 49));
            this.f29618s[i13] = new TextView(context);
            this.f29618s[i13].setTextSize(1, 14.0f);
            this.f29618s[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21044r5));
            this.f29618s[i13].setGravity(1);
            frameLayout.addView(this.f29618s[i13], w7.x5.a(-2.0f, 30.0f, 368.0f, 30.0f, 44.0f, -2, 49));
            if (i13 == 0) {
                this.f29618s[i13].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f29618s[i13].setAlpha(0.0f);
                this.f29618s[i13].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f29612b[i13].setAlpha(0.0f);
                this.f29612b[i13].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.f29614e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.f29614e.getSendMessagesHelper().getImportingHistory(this.f29614e.a());
            this.f29613c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f29612b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f29618s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f29612b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.f29614e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f29613c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f29612b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f29618s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f29612b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        p90 p90Var = this.d;
        TextView[] textViewArr = this.f29612b;
        TextView textView = this.f29613c;
        hk0 hk0Var = this.f29615f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.zn znVar = this.f29614e;
            SendMessagesHelper.ImportingHistory importingHistory = znVar.getSendMessagesHelper().getImportingHistory(znVar.a());
            if (importingHistory == null) {
                o();
                return;
            }
            if (!this.f29616n && ((180 - hk0Var.getAnimatedDrawable().f26037a0) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                hk0Var.setAutoRepeat(false);
                this.f29616n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            p90Var.a(importingHistory.uploadProgress / 100.0f, true);
        } else if (i10 == NotificationCenter.stickersImportProgressChanged) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(this.v);
            if (importingStickers == null) {
                o();
                return;
            }
            if (!this.f29616n && ((180 - hk0Var.getAnimatedDrawable().f26037a0) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                hk0Var.setAutoRepeat(false);
                this.f29616n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            p90Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.zn znVar = this.f29614e;
        if (znVar != null) {
            znVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void o() {
        this.f29616n = true;
        this.f29615f.setAutoRepeat(false);
        o50 o50Var = this.h;
        o50Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(is.f27452g);
        Property property = View.ALPHA;
        TextView textView = this.f29613c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f29618s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f29612b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.d, property, 0.0f), ObjectAnimator.ofFloat(o50Var.d, property2, AndroidUtilities.dp(8.0f), 0.0f));
        o50Var.f29258a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        o50Var.f29260c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        o50Var.f29260c.d();
        animatorSet.start();
    }
}
