package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
public final class q4 extends ok0 {
    public final bi.z f38692o1;

    public q4(Context context, int i7, fi.b bVar, bi.z zVar) {
        super(1, context, bVar, true);
        int i10;
        this.f38692o1 = zVar;
        this.f30230w0 = false;
        this.f30228v0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, c8.ma.x(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(2131624179, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, c8.ma.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.n10.p(textView, 1, 24.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, bVar);
        if (i7 == 0) {
            textView.setText(org.telegram.messenger.gd.M0(2131745996, null));
        } else if (i7 == 6) {
            textView.setText(org.telegram.messenger.gd.M0(2131745998, null));
        } else if (i7 == 1) {
            textView.setText(org.telegram.messenger.gd.M0(2131745995, null));
        } else if (i7 == 2) {
            textView.setText(org.telegram.messenger.gd.M0(2131745999, null));
        } else if (i7 == 5) {
            textView.setText(org.telegram.messenger.gd.M0(2131745997, null));
        } else if (i7 == 100) {
            textView.setText(org.telegram.messenger.gd.M0(2131746035, null));
        }
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.ma.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        m10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(m10, org.telegram.ui.ActionBar.n6.f29654r5, bVar);
        org.telegram.messenger.f3.k(m10, 1, null, 2131746022);
        frameLayout.addView(m10, c8.ma.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.H6, bVar);
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i11, bVar);
        editTextBoldCursor.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.u6.F(editTextBoldCursor, org.telegram.ui.ActionBar.n6.f29525k6, org.telegram.ui.ActionBar.n6.f29543l6, org.telegram.ui.ActionBar.n6.f29617p7, bVar);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (org.telegram.messenger.gd.f24216a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.gd.M0(2131746023, null));
        org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, i11, bVar);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new g(this, 6));
        frameLayout.addView(editTextBoldCursor, c8.ma.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f37801a = view;
        view.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 8.0f));
        frameLayout2.addView(view, c8.ma.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout2.f37802b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Ji, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView2, c8.ma.e(-2, -2, 17));
        this.f38120m1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(org.telegram.messenger.gd.M0(2131746013, null));
        c8.ra.a(frameLayout2);
        view.setOnClickListener(new ci.q(this, i7, 18));
        frameLayout.addView((View) frameLayout2, c8.ma.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.Q0 = true;
    }
}
