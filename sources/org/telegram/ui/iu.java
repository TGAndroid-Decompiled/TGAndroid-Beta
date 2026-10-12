package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class iu extends org.telegram.ui.Cells.d5 {
    public final int f38998e;
    public final org.telegram.ui.Cells.e9 f38999f;
    public final org.telegram.ui.Cells.w8[] h;
    public final AnimatorSet[] f39000n;
    public final DataAutoDownloadActivity f39001r;

    public iu(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i11;
        int i12;
        int i13;
        this.f39001r = dataAutoDownloadActivity;
        this.f38998e = i10;
        this.f38999f = e9Var;
        this.h = w8VarArr;
        this.f39000n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.f21731a = textView;
        org.telegram.messenger.am.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20668j5, false), 1, 16.0f, 1);
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
        addView(textView, w7.w5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -1, i12 | 48));
        TextView textView2 = new TextView(activity);
        this.f21732b = textView2;
        org.telegram.messenger.am.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20744n5, false), 1, 16.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        textView2.setGravity(i13 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, w7.w5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
        org.telegram.ui.Cells.j0 j0Var = new org.telegram.ui.Cells.j0(activity);
        this.f21733c = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new org.telegram.ui.Cells.c5(this));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, w7.w5.a(38.0f, 6.0f, 36.0f, 6.0f, 0.0f, -1, 51));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(j0Var.getSeekBarAccessibilityDelegate());
    }
}
