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
public final class a50 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] f25157b;
    public final TextView f25158c;
    public final p80 d;
    public final org.telegram.ui.xn f25159e;
    public final kj0 f25160f;
    public final z40 h;
    public boolean f25161n;
    public final hj0 f25162r;
    public final TextView[] f25163s;
    public final String v;

    public a50(Context context, String str, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        this.f25157b = new TextView[2];
        this.f25163s = new TextView[2];
        xp xpVar = new xp(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.f25159e = xnVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.k6.f21768j5;
        textView.setTextColor(getThemedColor(i10));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        hj0 hj0Var = new hj0(R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f25162r = hj0Var;
        hj0Var.H(true);
        ?? imageView = new ImageView(context);
        this.f25160f = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.import_loop, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, k7.c6.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().P(178, xpVar);
        TextView textView2 = new TextView(context);
        this.f25158c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i10));
        frameLayout.addView(textView2, k7.c6.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        p80 p80Var = new p80(getContext());
        this.d = p80Var;
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        p80Var.setProgressColor(getThemedColor(i11));
        p80Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.k6.G5));
        frameLayout.addView(p80Var, k7.c6.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f33755a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Qh, g6Var);
        view.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v02, v03, v03));
        frameLayout2.addView(view, k7.c6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, k7.c6.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f33757c = imageView2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Sh;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.K(dp2, org.telegram.ui.ActionBar.k6.v0(i12, g6Var)));
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.f(R.raw.import_check, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, k7.c6.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f33756b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        org.telegram.ui.yh.p(14.0f, 1, textView3);
        linearLayout.addView(textView3, k7.c6.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ImportDone));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new g0(this, 27));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, k7.c6.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.f25157b[i13] = new TextView(context);
            this.f25157b[i13].setTextSize(1, 16.0f);
            this.f25157b[i13].setTypeface(AndroidUtilities.bold());
            this.f25157b[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21768j5));
            frameLayout.addView(this.f25157b[i13], k7.c6.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f25163s[i13] = new TextView(context);
            this.f25163s[i13].setTextSize(1, 14.0f);
            this.f25163s[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21913r5));
            this.f25163s[i13].setGravity(1);
            frameLayout.addView(this.f25163s[i13], k7.c6.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.f25163s[i13].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f25163s[i13].setAlpha(0.0f);
                this.f25163s[i13].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f25157b[i13].setAlpha(0.0f);
                this.f25157b[i13].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.f25159e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.f25159e.getSendMessagesHelper().getImportingHistory(this.f25159e.a());
            this.f25158c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f25157b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f25163s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f25157b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.f25159e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f25158c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f25157b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f25163s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f25157b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        p80 p80Var = this.d;
        TextView[] textViewArr = this.f25157b;
        TextView textView = this.f25158c;
        kj0 kj0Var = this.f25160f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.xn xnVar = this.f25159e;
            SendMessagesHelper.ImportingHistory importingHistory = xnVar.getSendMessagesHelper().getImportingHistory(xnVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.f25161n && ((180 - kj0Var.getAnimatedDrawable().Y) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                kj0Var.setAutoRepeat(false);
                this.f25161n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            p80Var.a(importingHistory.uploadProgress / 100.0f, true);
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
            if (!this.f25161n && ((180 - kj0Var.getAnimatedDrawable().Y) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                kj0Var.setAutoRepeat(false);
                this.f25161n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            p80Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.xn xnVar = this.f25159e;
        if (xnVar != null) {
            xnVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.f25161n = true;
        this.f25160f.setAutoRepeat(false);
        z40 z40Var = this.h;
        z40Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(pr.f30169g);
        Property property = View.ALPHA;
        TextView textView = this.f25158c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f25163s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f25157b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.d, property, 0.0f), ObjectAnimator.ofFloat(z40Var.d, property2, AndroidUtilities.dp(8.0f), 0.0f));
        z40Var.f33755a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        z40Var.f33757c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        z40Var.f33757c.d();
        animatorSet.start();
    }
}
