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
public final class s4 extends ym0 {
    public final ai.c1 d;

    public s4(Context context, int i10, di.b bVar, ai.c1 c1Var) {
        super(1, context, bVar, true);
        int i11;
        this.d = c1Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        setCustomView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, gb1.B(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.report_police, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, gb1.h(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.vh.j(24.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, bVar);
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
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView, gb1.h(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        k10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(k10, org.telegram.ui.ActionBar.y6.f23612r5, bVar);
        k10.setGravity(1);
        k10.setText(LocaleController.getString(R.string.ReportInfo));
        frameLayout.addView(k10, gb1.h(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f35080c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.H6, bVar);
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i12, bVar);
        editTextBoldCursor.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.f7.G(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23482k6, org.telegram.ui.ActionBar.y6.f23500l6, org.telegram.ui.ActionBar.y6.f23579p7, bVar);
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
        org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, i12, bVar);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new d1(this, 5));
        frameLayout.addView(editTextBoldCursor, gb1.h(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f34776a = view;
        view.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.Oh));
        frameLayout2.addView(view, gb1.h(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout2.f34777b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.Sh, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView2, gb1.i(-2, -2, 17));
        this.f35079b = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(LocaleController.getString(R.string.ReportSend));
        gb1.b(frameLayout2);
        view.setOnClickListener(new ai.w(this, i10, 17));
        frameLayout.addView((View) frameLayout2, gb1.h(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.smoothKeyboardAnimationEnabled = true;
    }
}
