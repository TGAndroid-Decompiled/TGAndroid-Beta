package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
public final class i4 extends fk0 {
    public final ai.f0 f34585l1;

    public i4(Context context, int i3, ei.b bVar, ai.f0 f0Var) {
        super(1, context, bVar, true);
        int i10;
        this.f34585l1 = f0Var;
        this.f28621w0 = false;
        this.f28619v0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, b8.mf.x(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(2131624178, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, b8.mf.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, bVar);
        if (i3 == 0) {
            textView.setText(org.telegram.messenger.bd.M0(2131746201, null));
        } else if (i3 == 6) {
            textView.setText(org.telegram.messenger.bd.M0(2131746203, null));
        } else if (i3 == 1) {
            textView.setText(org.telegram.messenger.bd.M0(2131746200, null));
        } else if (i3 == 2) {
            textView.setText(org.telegram.messenger.bd.M0(2131746204, null));
        } else if (i3 == 5) {
            textView.setText(org.telegram.messenger.bd.M0(2131746202, null));
        } else if (i3 == 100) {
            textView.setText(org.telegram.messenger.bd.M0(2131746240, null));
        }
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, b8.mf.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        m10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(m10, org.telegram.ui.ActionBar.k6.r5, bVar);
        org.telegram.messenger.k5.m(m10, 1, null, 2131746227);
        frameLayout.addView(m10, b8.mf.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.k1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.H6, bVar);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i11, bVar);
        editTextBoldCursor.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, bVar);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.bd.M0(2131746228, null));
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i11, bVar);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new s0(this, 5));
        frameLayout.addView(editTextBoldCursor, b8.mf.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f33410a = view;
        view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 8.0f));
        frameLayout2.addView(view, b8.mf.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout2.f33411b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView2, b8.mf.e(-2, -2, 17));
        this.f33813j1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(org.telegram.messenger.bd.M0(2131746218, null));
        b8.pf.a(frameLayout2);
        view.setOnClickListener(new bi.q(this, i3, 16));
        frameLayout.addView((View) frameLayout2, b8.mf.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.Q0 = true;
    }
}
