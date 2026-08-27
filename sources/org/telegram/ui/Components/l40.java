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

public final class l40 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {

    public final TextView[] f30282b;

    public final TextView f30283c;
    public final z70 d;

    public final org.telegram.ui.rn f30284e;

    public final ri0 f30285f;
    public final k40 h;

    public boolean f30286n;

    public final oi0 f30287r;

    public final TextView[] f30288s;
    public final String v;

    public l40(Context context, String str, org.telegram.ui.rn rnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.f30282b = new TextView[2];
        this.f30288s = new TextView[2];
        lp lpVar = new lp(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.f30284e = rnVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.h(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(getThemedColor(i10));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        oi0 oi0Var = new oi0(R.raw.import_finish, "" + R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f30287r = oi0Var;
        oi0Var.H(true);
        ri0 ri0Var = new ri0(context);
        this.f30285f = ri0Var;
        ri0Var.setAutoRepeat(true);
        ri0Var.f(R.raw.import_loop, 120, 120, null);
        ri0Var.d();
        frameLayout.addView(ri0Var, h7.z5.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        ri0Var.getAnimatedDrawable().P(178, lpVar);
        TextView textView2 = new TextView(context);
        this.f30283c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i10));
        frameLayout.addView(textView2, h7.z5.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        z70 z70Var = new z70(getContext());
        this.d = z70Var;
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        z70Var.setProgressColor(getThemedColor(i11));
        z70Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.g6.G5));
        frameLayout.addView(z70Var, h7.z5.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        k40 k40Var = new k40(context);
        View view = new View(context);
        k40Var.f29941a = view;
        int iDp = AndroidUtilities.dp(4.0f);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        view.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iV0, iV1, iV1));
        k40Var.addView(view, h7.z5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        k40Var.d = linearLayout;
        linearLayout.setOrientation(0);
        k40Var.addView(linearLayout, h7.z5.e(-2, -2, 17));
        ri0 ri0Var2 = new ri0(context);
        k40Var.f29943c = ri0Var2;
        int iDp2 = AndroidUtilities.dp(20.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Sh;
        ri0Var2.setBackground(org.telegram.ui.ActionBar.g6.K(iDp2, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        ri0Var2.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        ri0Var2.f(R.raw.import_check, 26, 26, null);
        ri0Var2.setScaleX(0.8f);
        ri0Var2.setScaleY(0.8f);
        linearLayout.addView(ri0Var2, h7.z5.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        k40Var.f29942b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        org.telegram.ui.Cells.pa.m(14.0f, 1, textView3);
        linearLayout.addView(textView3, h7.z5.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = k40Var;
        k40Var.setBackground(null);
        k40Var.setText(LocaleController.getString(R.string.ImportDone));
        k40Var.setVisibility(4);
        view.setOnClickListener(new f0(this, 27));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(k40Var, h7.z5.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.f30282b[i13] = new TextView(context);
            this.f30282b[i13].setTextSize(1, 16.0f);
            this.f30282b[i13].setTypeface(AndroidUtilities.bold());
            this.f30282b[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5));
            frameLayout.addView(this.f30282b[i13], h7.z5.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f30288s[i13] = new TextView(context);
            this.f30288s[i13].setTextSize(1, 14.0f);
            this.f30288s[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23300r5));
            this.f30288s[i13].setGravity(1);
            frameLayout.addView(this.f30288s[i13], h7.z5.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.f30288s[i13].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f30288s[i13].setAlpha(0.0f);
                this.f30288s[i13].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f30282b[i13].setAlpha(0.0f);
                this.f30282b[i13].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.f30284e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.f30284e.getSendMessagesHelper().getImportingHistory(this.f30284e.a());
            this.f30283c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f30282b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f30288s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f30282b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.f30284e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f30283c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f30282b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f30288s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f30282b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        z70 z70Var = this.d;
        TextView[] textViewArr = this.f30282b;
        TextView textView = this.f30283c;
        ri0 ri0Var = this.f30285f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.rn rnVar = this.f30284e;
            SendMessagesHelper.ImportingHistory importingHistory = rnVar.getSendMessagesHelper().getImportingHistory(rnVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.f30286n && (((double) (180 - ri0Var.getAnimatedDrawable().X)) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                ri0Var.setAutoRepeat(false);
                this.f30286n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            z70Var.a(importingHistory.uploadProgress / 100.0f, true);
            return;
        }
        if (i10 == NotificationCenter.stickersImportProgressChanged) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(this.v);
            if (importingStickers == null) {
                m();
                return;
            }
            if (!this.f30286n && (((double) (180 - ri0Var.getAnimatedDrawable().X)) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                ri0Var.setAutoRepeat(false);
                this.f30286n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            z70Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.rn rnVar = this.f30284e;
        if (rnVar != null) {
            rnVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.f30286n = true;
        this.f30285f.setAutoRepeat(false);
        k40 k40Var = this.h;
        k40Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(er.f28123g);
        Property property = View.ALPHA;
        TextView textView = this.f30283c;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f30288s;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f30282b;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<z70, Float>) property, 0.0f), ObjectAnimator.ofFloat(k40Var.d, (Property<LinearLayout, Float>) property2, AndroidUtilities.dp(8.0f), 0.0f));
        k40Var.f29941a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        k40Var.f29943c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        k40Var.f29943c.d();
        animatorSet.start();
    }
}
