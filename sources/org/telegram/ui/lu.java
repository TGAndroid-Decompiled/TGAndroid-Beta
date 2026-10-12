package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class lu extends org.telegram.ui.Cells.d5 {
    public final int e;
    public final org.telegram.ui.Cells.e9 f38089f;
    public final org.telegram.ui.Cells.w8[] h;
    public final AnimatorSet[] f38090n;
    public final DataAutoDownloadActivity f38091r;

    public lu(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i11;
        int i12;
        int i13;
        this.f38091r = dataAutoDownloadActivity;
        this.e = i10;
        this.f38089f = e9Var;
        this.h = w8VarArr;
        this.f38090n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.f21066a = textView;
        org.telegram.messenger.yh.t(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007j5, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView, w7.a6.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -1, i12 | 48));
        TextView textView2 = new TextView(activity);
        this.f21067b = textView2;
        org.telegram.messenger.yh.t(textView2, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20083n5, false), 1, 16.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        textView2.setGravity(i13 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, w7.a6.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
        org.telegram.ui.Cells.k0 k0Var = new org.telegram.ui.Cells.k0(activity);
        this.f21068c = k0Var;
        k0Var.setReportChanges(true);
        k0Var.setDelegate(new org.telegram.ui.Cells.c5(this));
        k0Var.setImportantForAccessibility(2);
        addView(k0Var, w7.a6.a(38.0f, 6.0f, 36.0f, 6.0f, 0.0f, -1, 51));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(k0Var.getSeekBarAccessibilityDelegate());
    }
}
