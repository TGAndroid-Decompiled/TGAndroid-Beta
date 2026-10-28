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
public final class i50 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] f29215b;
    public final TextView f29216c;
    public final j90 d;
    public final org.telegram.ui.wn e;
    public final bk0 f29217f;
    public final h50 h;
    public boolean f29218n;
    public final yj0 f29219r;
    public final TextView[] f29220s;
    public final String v;

    public i50(Context context, String str, org.telegram.ui.wn wnVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        this.f29215b = new TextView[2];
        this.f29220s = new TextView[2];
        cp cpVar = new cp(this, 26);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.e = wnVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.wh.j(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, kb1.h(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        yj0 yj0Var = new yj0(R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f29219r = yj0Var;
        yj0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f29217f = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.import_loop, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, kb1.h(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().S(178, cpVar);
        TextView textView2 = new TextView(context);
        this.f29216c = textView2;
        org.telegram.messenger.wh.j(24.0f, 1, textView2);
        org.telegram.ui.ActionBar.f7.V(textView2, i10, u6Var);
        frameLayout.addView(textView2, kb1.h(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        j90 j90Var = new j90(getContext());
        this.d = j90Var;
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        j90Var.setProgressColor(getThemedColor(i11));
        j90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.y6.G5));
        frameLayout.addView(j90Var, kb1.h(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f28856a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        int i12 = org.telegram.ui.ActionBar.y6.Qh;
        int w03 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, w03, w03);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
        view.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(view, j02, N, N2, u6Var);
        frameLayout2.addView(view, kb1.h(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, kb1.i(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f28858c = imageView2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i13 = org.telegram.ui.ActionBar.y6.Sh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp2, org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i13);
        imageView2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(imageView2, K, N3, null, u6Var);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView2, i11, u6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.f(R.raw.import_check, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, kb1.u(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f28857b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.t.r(textView3, i13, u6Var, 1, 14.0f);
        linearLayout.addView(textView3, kb1.x(-2, -2, 16, 10, 0, 0, 0));
        this.h = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ImportDone));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new f0(this, 26));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, kb1.h(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i14 = 0; i14 < 2; i14++) {
            this.f29215b[i14] = new TextView(context);
            this.f29215b[i14].setTextSize(1, 16.0f);
            this.f29215b[i14].setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.V(this.f29215b[i14], org.telegram.ui.ActionBar.y6.f23465j5, u6Var);
            frameLayout.addView(this.f29215b[i14], kb1.h(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f29220s[i14] = new TextView(context);
            this.f29220s[i14].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(this.f29220s[i14], org.telegram.ui.ActionBar.y6.f23615r5, u6Var);
            this.f29220s[i14].setGravity(1);
            frameLayout.addView(this.f29220s[i14], kb1.h(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i14 == 0) {
                this.f29220s[i14].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f29220s[i14].setAlpha(0.0f);
                this.f29220s[i14].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f29215b[i14].setAlpha(0.0f);
                this.f29215b[i14].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.e.getSendMessagesHelper().getImportingHistory(this.e.a());
            this.f29216c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f29215b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f29220s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f29215b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.e.getNotificationCenter().addWeakObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f29216c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f29215b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f29220s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f29215b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        j90 j90Var = this.d;
        TextView[] textViewArr = this.f29215b;
        TextView textView = this.f29216c;
        bk0 bk0Var = this.f29217f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.wn wnVar = this.e;
            SendMessagesHelper.ImportingHistory importingHistory = wnVar.getSendMessagesHelper().getImportingHistory(wnVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.f29218n && ((180 - bk0Var.getAnimatedDrawable().f35067a0) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                bk0Var.setAutoRepeat(false);
                this.f29218n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            j90Var.a(importingHistory.uploadProgress / 100.0f, true);
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
            if (!this.f29218n && ((180 - bk0Var.getAnimatedDrawable().f35067a0) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                bk0Var.setAutoRepeat(false);
                this.f29218n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            j90Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.wn wnVar = this.e;
        if (wnVar != null) {
            wnVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.f29218n = true;
        this.f29217f.setAutoRepeat(false);
        h50 h50Var = this.h;
        h50Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(ds.f27531g);
        Property property = View.ALPHA;
        TextView textView = this.f29216c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f29220s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f29215b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.d, property, 0.0f), ObjectAnimator.ofFloat(h50Var.d, property2, AndroidUtilities.dp(8.0f), 0.0f));
        h50Var.f28856a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        h50Var.f28858c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        h50Var.f28858c.d();
        animatorSet.start();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j90 j90Var = this.d;
            if (j90Var != null) {
                j90Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
                j90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.y6.G5));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
