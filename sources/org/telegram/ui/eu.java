package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class eu extends org.telegram.ui.Cells.d5 {
    public final int e;
    public final org.telegram.ui.Cells.a9 f34085f;
    public final org.telegram.ui.Cells.s8[] h;
    public final AnimatorSet[] f34086n;
    public final DataAutoDownloadActivity f34087r;

    public eu(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.a9 a9Var, org.telegram.ui.Cells.s8[] s8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        int i11;
        int i12;
        int i13;
        this.f34087r = dataAutoDownloadActivity;
        this.e = i10;
        this.f34085f = a9Var;
        this.h = s8VarArr;
        this.f34086n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.f20939a = textView;
        b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false), 1, 16.0f, 1);
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
        addView(textView, k7.b6.d(-1, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f20940b = textView2;
        b.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20084n5, false), 1, 16.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        textView2.setGravity(i13 | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, k7.b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.j0 j0Var = new org.telegram.ui.Cells.j0(activity);
        this.f20941c = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new org.telegram.ui.Cells.c5(this));
        j0Var.setImportantForAccessibility(2);
        addView(j0Var, k7.b6.d(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(j0Var.getSeekBarAccessibilityDelegate());
    }
}
