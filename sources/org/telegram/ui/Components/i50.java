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
    public final TextView[] f29189b;
    public final TextView f29190c;
    public final i90 d;
    public final org.telegram.ui.un e;
    public final ak0 f29191f;
    public final h50 h;
    public boolean f29192n;
    public final xj0 f29193r;
    public final TextView[] f29194s;
    public final String v;

    public i50(Context context, String str, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        this.f29189b = new TextView[2];
        this.f29194s = new TextView[2];
        bq bqVar = new bq(this, 25);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.e = unVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.vh.j(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.y6.f23464j5;
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, gb1.h(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        xj0 xj0Var = new xj0(R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.f29193r = xj0Var;
        xj0Var.J(true);
        ?? imageView = new ImageView(context);
        this.f29191f = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.import_loop, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, gb1.h(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().S(178, bqVar);
        TextView textView2 = new TextView(context);
        this.f29190c = textView2;
        org.telegram.messenger.vh.j(24.0f, 1, textView2);
        org.telegram.ui.ActionBar.f7.V(textView2, i10, u6Var);
        frameLayout.addView(textView2, gb1.h(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        i90 i90Var = new i90(getContext());
        this.d = i90Var;
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        i90Var.setProgressColor(getThemedColor(i11));
        i90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.y6.G5));
        frameLayout.addView(i90Var, gb1.h(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f28804a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        int i12 = org.telegram.ui.ActionBar.y6.Qh;
        int w03 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, w03, w03);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
        view.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(view, j02, N, N2, u6Var);
        frameLayout2.addView(view, gb1.h(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, gb1.i(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.f28806c = imageView2;
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
        linearLayout.addView((View) imageView2, gb1.u(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.f28805b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.t.r(textView3, i13, u6Var, 1, 14.0f);
        linearLayout.addView(textView3, gb1.x(-2, -2, 16, 10, 0, 0, 0));
        this.h = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ImportDone));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new f0(this, 26));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, gb1.h(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i14 = 0; i14 < 2; i14++) {
            this.f29189b[i14] = new TextView(context);
            this.f29189b[i14].setTextSize(1, 16.0f);
            this.f29189b[i14].setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.V(this.f29189b[i14], org.telegram.ui.ActionBar.y6.f23464j5, u6Var);
            frameLayout.addView(this.f29189b[i14], gb1.h(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.f29194s[i14] = new TextView(context);
            this.f29194s[i14].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(this.f29194s[i14], org.telegram.ui.ActionBar.y6.f23614r5, u6Var);
            this.f29194s[i14].setGravity(1);
            frameLayout.addView(this.f29194s[i14], gb1.h(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i14 == 0) {
                this.f29194s[i14].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.f29194s[i14].setAlpha(0.0f);
                this.f29194s[i14].setTranslationY(AndroidUtilities.dp(10.0f));
                this.f29189b[i14].setAlpha(0.0f);
                this.f29189b[i14].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.e.getSendMessagesHelper().getImportingHistory(this.e.a());
            this.f29190c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.f29189b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.f29194s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.f29189b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.f29190c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.f29189b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.f29194s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.f29189b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        i90 i90Var = this.d;
        TextView[] textViewArr = this.f29189b;
        TextView textView = this.f29190c;
        ak0 ak0Var = this.f29191f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.un unVar = this.e;
            SendMessagesHelper.ImportingHistory importingHistory = unVar.getSendMessagesHelper().getImportingHistory(unVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.f29192n && ((180 - ak0Var.getAnimatedDrawable().f34736a0) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                ak0Var.setAutoRepeat(false);
                this.f29192n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            i90Var.a(importingHistory.uploadProgress / 100.0f, true);
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
            if (!this.f29192n && ((180 - ak0Var.getAnimatedDrawable().f34736a0) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                ak0Var.setAutoRepeat(false);
                this.f29192n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            i90Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.un unVar = this.e;
        if (unVar != null) {
            unVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.f29192n = true;
        this.f29191f.setAutoRepeat(false);
        h50 h50Var = this.h;
        h50Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(ds.f27587g);
        Property property = View.ALPHA;
        TextView textView = this.f29190c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.f29194s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.f29189b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.d, property, 0.0f), ObjectAnimator.ofFloat(h50Var.d, property2, AndroidUtilities.dp(8.0f), 0.0f));
        h50Var.f28804a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        h50Var.f28806c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        h50Var.f28806c.d();
        animatorSet.start();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            i90 i90Var = this.d;
            if (i90Var != null) {
                i90Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
                i90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.y6.G5));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
