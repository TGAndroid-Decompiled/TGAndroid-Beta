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
public final class k4 extends fl0 {
    public final fh.y d;

    public k4(Context context, int i9, ih.b bVar, fh.y yVar) {
        super(context, bVar, true, false);
        int i10;
        this.d = yVar;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        setCustomView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, g7.e6.x(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.report_police, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, g7.e6.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
        if (i9 == 0) {
            textView.setText(LocaleController.getString(R.string.ReportTitleSpam));
        } else if (i9 == 6) {
            textView.setText(LocaleController.getString(R.string.ReportTitleFake));
        } else if (i9 == 1) {
            textView.setText(LocaleController.getString(R.string.ReportTitleViolence));
        } else if (i9 == 2) {
            textView.setText(LocaleController.getString(R.string.ReportTitleChild));
        } else if (i9 == 5) {
            textView.setText(LocaleController.getString(R.string.ReportTitlePornography));
        } else if (i9 == 100) {
            textView.setText(LocaleController.getString(R.string.ReportChat));
        }
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, g7.e6.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        g10.setTextSize(1, 14.0f);
        g10.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23247r5));
        g10.setGravity(1);
        g10.setText(LocaleController.getString(R.string.ReportInfo));
        frameLayout.addView(g10, g7.e6.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f28489c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.H6));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        editTextBoldCursor.setTextColor(getThemedColor(i11));
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setLineColors(getThemedColor(org.telegram.ui.ActionBar.f6.f23127k6), getThemedColor(org.telegram.ui.ActionBar.f6.f23144l6), getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.ReportHint));
        editTextBoldCursor.setCursorColor(getThemedColor(i11));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new c1(this, 4));
        frameLayout.addView(editTextBoldCursor, g7.e6.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f28060a = view;
        view.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.f6.Oh));
        frameLayout2.addView(view, g7.e6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout2.f28061b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setTextColor(bVar.N0(org.telegram.ui.ActionBar.f6.Sh));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView2, g7.e6.e(-2, -2, 17));
        this.f28488b = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ReportSend));
        g7.g6.a(frameLayout2);
        view.setOnClickListener(new gh.z0(this, i9, 11));
        frameLayout.addView((View) frameLayout2, g7.e6.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.smoothKeyboardAnimationEnabled = true;
    }
}
