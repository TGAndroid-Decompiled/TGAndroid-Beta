package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class g50 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] f26541b;
    public final TextView f26542c;
    public final h90 d;
    public final org.telegram.ui.sn e;
    public final bk0 f26543f;
    public final f50 h;
    public boolean f26544n;
    public final yj0 f26545r;
    public final TextView[] f26546s;
    public final String v;

    public g50(Context context, String str, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.f26541b = new TextView[2];
        this.f26546s = new TextView[2];
        zp zpVar = new zp(this, 24);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.e = snVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.sl.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        yj0 yj0Var = new yj0(R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f26545r = yj0Var;
        yj0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f26543f = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.import_loop, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, w7.z5.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().S(178, zpVar);
        TextView textView2 = new TextView(context);
        this.f26542c = textView2;
        org.telegram.messenger.sl.k(24.0f, 1, textView2);
        org.telegram.ui.ActionBar.r6.W(textView2, i10, g6Var);
        frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        h90 h90Var = new h90(getContext());
        this.d = h90Var;
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        h90Var.setProgressColor(getThemedColor(i11));
        h90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.k6.G5));
        frameLayout.addView(h90Var, w7.z5.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f26168a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        int i12 = org.telegram.ui.ActionBar.k6.Qh;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
        view.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(view, j02, O, O2, g6Var);
        frameLayout2.addView(view, w7.z5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, w7.z5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f26170c = imageView2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Sh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp2, org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i13);
        imageView2.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(imageView2, K, O3, null, g6Var);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.f(R.raw.import_check, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, w7.z5.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f26169b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.v0.q(textView3, i13, g6Var, 1, 14.0f);
        linearLayout.addView(textView3, w7.z5.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ImportDone));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new f0(this, 26));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, w7.z5.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i14 = 0; i14 < 2; i14++) {
            this.f26541b[i14] = new TextView(context);
            this.f26541b[i14].setTextSize(1, 16.0f);
            this.f26541b[i14].setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.r6.W(this.f26541b[i14], org.telegram.ui.ActionBar.k6.f21289j5, g6Var);
            frameLayout.addView(this.f26541b[i14], w7.z5.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f26546s[i14] = new TextView(context);
            this.f26546s[i14].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.W(this.f26546s[i14], org.telegram.ui.ActionBar.k6.f21439r5, g6Var);
            this.f26546s[i14].setGravity(1);
            frameLayout.addView(this.f26546s[i14], w7.z5.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i14 == 0) {
                this.f26546s[i14].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f26546s[i14].setAlpha(0.0f);
                this.f26546s[i14].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f26541b[i14].setAlpha(0.0f);
                this.f26541b[i14].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.e.getSendMessagesHelper().getImportingHistory(this.e.a());
            this.f26542c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f26541b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f26546s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f26541b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f26542c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f26541b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f26546s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f26541b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        h90 h90Var = this.d;
        TextView[] textViewArr = this.f26541b;
        TextView textView = this.f26542c;
        bk0 bk0Var = this.f26543f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.sn snVar = this.e;
            SendMessagesHelper.ImportingHistory importingHistory = snVar.getSendMessagesHelper().getImportingHistory(snVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.f26544n && ((180 - bk0Var.getAnimatedDrawable().f32933a0) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                bk0Var.setAutoRepeat(false);
                this.f26544n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            h90Var.a(importingHistory.uploadProgress / 100.0f, true);
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
            if (!this.f26544n && ((180 - bk0Var.getAnimatedDrawable().f32933a0) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                bk0Var.setAutoRepeat(false);
                this.f26544n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            h90Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.sn snVar = this.e;
        if (snVar != null) {
            snVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.f26544n = true;
        this.f26543f.setAutoRepeat(false);
        f50 f50Var = this.h;
        f50Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(bs.f25134g);
        Property property = View.ALPHA;
        TextView textView = this.f26542c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f26546s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f26541b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.d, property, 0.0f), ObjectAnimator.ofFloat(f50Var.d, property2, AndroidUtilities.dp(8.0f), 0.0f));
        f50Var.f26168a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        f50Var.f26170c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        f50Var.f26170c.d();
        animatorSet.start();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            h90 h90Var = this.d;
            if (h90Var != null) {
                h90Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Oh));
                h90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.k6.G5));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
