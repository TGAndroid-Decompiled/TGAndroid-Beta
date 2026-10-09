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
public final class o50 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] f29390b;
    public final TextView f29391c;
    public final o90 d;
    public final org.telegram.ui.zn f29392e;
    public final fk0 f29393f;
    public final n50 h;
    public boolean f29394n;
    public final ck0 f29395r;
    public final TextView[] f29396s;
    public final String v;

    public o50(Context context, String str, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.f29390b = new TextView[2];
        this.f29396s = new TextView[2];
        nq nqVar = new nq(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.f29392e = znVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.i6.f20905j5;
        textView.setTextColor(getThemedColor(i10));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 17.0f, 20.0f, 17.0f, 0.0f, -2, 51));
        ck0 ck0Var = new ck0(R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f29395r = ck0Var;
        ck0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f29393f = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.import_loop, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, w7.x5.a(160.0f, 17.0f, 79.0f, 17.0f, 0.0f, 160, 49));
        imageView.getAnimatedDrawable().S(178, nqVar);
        TextView textView2 = new TextView(context);
        this.f29391c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i10));
        frameLayout.addView(textView2, w7.x5.a(-2.0f, 17.0f, 262.0f, 17.0f, 0.0f, -2, 49));
        o90 o90Var = new o90(getContext());
        this.d = o90Var;
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        o90Var.setProgressColor(getThemedColor(i11));
        o90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.i6.G5));
        frameLayout.addView(o90Var, w7.x5.a(4.0f, 50.0f, 307.0f, 50.0f, 0.0f, -1, 51));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f29037a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Qh, e6Var);
        view.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w02, w03, w03));
        frameLayout2.addView(view, w7.x5.a(-1.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, w7.x5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f29039c = imageView2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i12 = org.telegram.ui.ActionBar.i6.Sh;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.K(dp2, org.telegram.ui.ActionBar.i6.w0(i12, e6Var)));
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.f(R.raw.import_check, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, w7.x5.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f29038b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
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
            this.f29390b[i13] = new TextView(context);
            this.f29390b[i13].setTextSize(1, 16.0f);
            this.f29390b[i13].setTypeface(AndroidUtilities.bold());
            this.f29390b[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20905j5));
            frameLayout.addView(this.f29390b[i13], w7.x5.a(-2.0f, 17.0f, 340.0f, 17.0f, 0.0f, -2, 49));
            this.f29396s[i13] = new TextView(context);
            this.f29396s[i13].setTextSize(1, 14.0f);
            this.f29396s[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21054r5));
            this.f29396s[i13].setGravity(1);
            frameLayout.addView(this.f29396s[i13], w7.x5.a(-2.0f, 30.0f, 368.0f, 30.0f, 44.0f, -2, 49));
            if (i13 == 0) {
                this.f29396s[i13].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f29396s[i13].setAlpha(0.0f);
                this.f29396s[i13].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f29390b[i13].setAlpha(0.0f);
                this.f29390b[i13].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.f29392e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.f29392e.getSendMessagesHelper().getImportingHistory(this.f29392e.a());
            this.f29391c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f29390b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f29396s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f29390b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.f29392e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f29391c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f29390b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f29396s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f29390b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        o90 o90Var = this.d;
        TextView[] textViewArr = this.f29390b;
        TextView textView = this.f29391c;
        fk0 fk0Var = this.f29393f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.zn znVar = this.f29392e;
            SendMessagesHelper.ImportingHistory importingHistory = znVar.getSendMessagesHelper().getImportingHistory(znVar.a());
            if (importingHistory == null) {
                o();
                return;
            }
            if (!this.f29394n && ((180 - fk0Var.getAnimatedDrawable().f25395a0) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                fk0Var.setAutoRepeat(false);
                this.f29394n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            o90Var.a(importingHistory.uploadProgress / 100.0f, true);
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
            if (!this.f29394n && ((180 - fk0Var.getAnimatedDrawable().f25395a0) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                fk0Var.setAutoRepeat(false);
                this.f29394n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            o90Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.zn znVar = this.f29392e;
        if (znVar != null) {
            znVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void o() {
        this.f29394n = true;
        this.f29393f.setAutoRepeat(false);
        n50 n50Var = this.h;
        n50Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(hs.f27119g);
        Property property = View.ALPHA;
        TextView textView = this.f29391c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f29396s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f29390b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.d, property, 0.0f), ObjectAnimator.ofFloat(n50Var.d, property2, AndroidUtilities.dp(8.0f), 0.0f));
        n50Var.f29037a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        n50Var.f29039c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        n50Var.f29039c.d();
        animatorSet.start();
    }
}
