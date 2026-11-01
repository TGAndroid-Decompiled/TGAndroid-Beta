package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
public final class h4 extends gl0 {
    public final s2 f26661k1;

    public h4(Context context, int i10, th.b bVar, s2 s2Var) {
        super(1, context, bVar, true);
        int i11;
        this.f26661k1 = s2Var;
        this.f21618v0 = false;
        this.f21617u0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.N = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, w7.b6.x(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(2131624176, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, w7.b6.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.a30.n(textView, 1, 24.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, bVar);
        if (i10 == 0) {
            textView.setText(org.telegram.messenger.dd.L0(2131746208, null));
        } else if (i10 == 6) {
            textView.setText(org.telegram.messenger.dd.L0(2131746210, null));
        } else if (i10 == 1) {
            textView.setText(org.telegram.messenger.dd.L0(2131746207, null));
        } else if (i10 == 2) {
            textView.setText(org.telegram.messenger.dd.L0(2131746211, null));
        } else if (i10 == 5) {
            textView.setText(org.telegram.messenger.dd.L0(2131746209, null));
        } else if (i10 == 100) {
            textView.setText(org.telegram.messenger.dd.L0(2131746247, null));
        }
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, w7.b6.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        l4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(l4, org.telegram.ui.ActionBar.t6.f21186r5, bVar);
        org.telegram.messenger.m5.l(l4, 1, null, 2131746234);
        frameLayout.addView(l4, w7.b6.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f26475j1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.H6, bVar);
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i12, bVar);
        editTextBoldCursor.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, bVar);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        editTextBoldCursor.setGravity(i11);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.dd.L0(2131746235, null));
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i12, bVar);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new t0(this, 5));
        frameLayout.addView(editTextBoldCursor, w7.b6.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f26188a = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 8.0f));
        frameLayout2.addView(view, w7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout2.f26189b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Gi, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        frameLayout2.addView(textView2, w7.b6.e(-2, -2, 17));
        this.f26474i1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(org.telegram.messenger.dd.L0(2131746225, null));
        w7.e6.a(frameLayout2);
        view.setOnClickListener(new bh.f(this, i10, 11));
        frameLayout.addView((View) frameLayout2, w7.b6.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.P0 = true;
    }
}
