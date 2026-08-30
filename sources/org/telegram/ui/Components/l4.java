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
public final class l4 extends cm0 {
    public final kh.t d;

    public l4(Context context, int i10, nh.b bVar, kh.t tVar) {
        super(context, bVar, true, false);
        int i11;
        this.d = tVar;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        setCustomView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, k7.b6.x(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.report_police, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, k7.b6.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20012j5));
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
        TextView i12 = org.telegram.ui.yh.i(frameLayout, textView, k7.b6.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        i12.setTextSize(1, 14.0f);
        i12.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20157r5));
        i12.setGravity(1);
        i12.setText(LocaleController.getString(R.string.ReportInfo));
        frameLayout.addView(i12, k7.b6.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f24024c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor.setTextColor(getThemedColor(i13));
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setLineColors(getThemedColor(org.telegram.ui.ActionBar.j6.f20031k6), getThemedColor(org.telegram.ui.ActionBar.j6.f20049l6), getThemedColor(org.telegram.ui.ActionBar.j6.f20122p7));
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
        editTextBoldCursor.setCursorColor(getThemedColor(i13));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new d1(this, 4));
        frameLayout.addView(editTextBoldCursor, k7.b6.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f23722a = view;
        view.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
        frameLayout2.addView(view, k7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout2.f23723b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setTextColor(bVar.x0(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView2, k7.b6.e(-2, -2, 17));
        this.f24023b = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ReportSend));
        k7.d6.a(frameLayout2);
        view.setOnClickListener(new lh.y0(this, i10, 9));
        frameLayout.addView((View) frameLayout2, k7.b6.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.smoothKeyboardAnimationEnabled = true;
    }
}
