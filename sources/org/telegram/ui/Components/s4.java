package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s4 extends vm0 {
    public final b3 d;

    public s4(Context context, int i10, bi.b bVar, b3 b3Var) {
        super(1, context, bVar, true);
        int i11;
        this.d = b3Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        setCustomView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, w7.a6.x(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.report_police, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, w7.a6.a(160.0f, 17.0f, 14.0f, 17.0f, 0.0f, 160, 49));
        TextView textView = new TextView(context);
        org.telegram.messenger.yh.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20007j5));
        if (i10 == 0) {
            textView.setText(LocaleController.getString(R.string.ReportTitleSpam));
        } else if (i10 == 6) {
            textView.setText(LocaleController.getString(R.string.ReportTitleFake));
        } else if (i10 == 1) {
            textView.setText(LocaleController.getString(R.string.ReportTitleViolence));
        } else if (i10 == 2) {
            textView.setText(LocaleController.getString(R.string.ReportTitleChild));
        } else if (i10 == 5) {
            textView.setText(LocaleController.getString(R.string.ReportTitlePornography));
        } else if (i10 == 100) {
            textView.setText(LocaleController.getString(R.string.ReportChat));
        }
        TextView h = org.telegram.ui.Cells.d0.h(frameLayout, textView, w7.a6.a(-2.0f, 17.0f, 197.0f, 17.0f, 0.0f, -2, 49), context);
        h.setTextSize(1, 14.0f);
        h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20157r5));
        h.setGravity(1);
        h.setText(LocaleController.getString(R.string.ReportInfo));
        frameLayout.addView(h, w7.a6.a(-2.0f, 30.0f, 235.0f, 30.0f, 44.0f, -2, 49));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f30090c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor.setTextColor(getThemedColor(i12));
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setLineColors(getThemedColor(org.telegram.ui.ActionBar.g6.f20028k6), getThemedColor(org.telegram.ui.ActionBar.g6.f20045l6), getThemedColor(org.telegram.ui.ActionBar.g6.f20122p7));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        editTextBoldCursor.setGravity(i11);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.ReportHint));
        editTextBoldCursor.setCursorColor(getThemedColor(i12));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new e1(this, 5));
        frameLayout.addView(editTextBoldCursor, w7.a6.a(36.0f, 17.0f, 305.0f, 17.0f, 0.0f, -1, 51));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f29737a = view;
        view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
        frameLayout2.addView(view, w7.a6.a(-1.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 0));
        TextView textView2 = new TextView(context);
        frameLayout2.f29738b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setTextColor(bVar.F0(org.telegram.ui.ActionBar.g6.Sh));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView2, w7.a6.e(-2, -2, 17));
        this.f30089b = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ReportSend));
        w7.c6.a(frameLayout2);
        view.setOnClickListener(new di.m4(this, i10, 12));
        frameLayout.addView((View) frameLayout2, w7.a6.a(50.0f, 0.0f, 357.0f, 0.0f, 0.0f, -1, 51));
        this.smoothKeyboardAnimationEnabled = true;
    }
}
