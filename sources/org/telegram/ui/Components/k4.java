package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
public final class k4 extends bk0 {
    public final ai.v0 f35163k1;

    public k4(Context context, int i7, di.b bVar, ai.v0 v0Var) {
        super(1, context, bVar, true);
        int i10;
        this.f35163k1 = v0Var;
        this.f28647v0 = false;
        this.f28646u0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.N = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, c8.ha.x(-1, -2, 51));
        ?? imageView = new ImageView(context);
        imageView.f(2131624178, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, c8.ha.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, bVar);
        if (i7 == 0) {
            textView.setText(org.telegram.messenger.hd.M0(2131746192, null));
        } else if (i7 == 6) {
            textView.setText(org.telegram.messenger.hd.M0(2131746194, null));
        } else if (i7 == 1) {
            textView.setText(org.telegram.messenger.hd.M0(2131746191, null));
        } else if (i7 == 2) {
            textView.setText(org.telegram.messenger.hd.M0(2131746195, null));
        } else if (i7 == 5) {
            textView.setText(org.telegram.messenger.hd.M0(2131746193, null));
        } else if (i7 == 100) {
            textView.setText(org.telegram.messenger.hd.M0(2131746231, null));
        }
        TextView i11 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        i11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(i11, org.telegram.ui.ActionBar.k6.f28106r5, bVar);
        org.telegram.messenger.k5.m(i11, 1, null, 2131746218);
        frameLayout.addView(i11, c8.ha.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f32166j1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.H6, bVar);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, bVar);
        editTextBoldCursor.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27977k6, org.telegram.ui.ActionBar.k6.f27995l6, org.telegram.ui.ActionBar.k6.f28069p7, bVar);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (org.telegram.messenger.hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.hd.M0(2131746219, null));
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i12, bVar);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new t0(this, 5));
        frameLayout.addView(editTextBoldCursor, c8.ha.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.f31829a = view;
        view.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 8.0f));
        frameLayout2.addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout2.f31830b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView2, c8.ha.e(-2, -2, 17));
        this.f32165i1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(org.telegram.messenger.hd.M0(2131746209, null));
        c8.ka.a(frameLayout2);
        view.setOnClickListener(new ai.v(this, i7, 16));
        frameLayout.addView((View) frameLayout2, c8.ha.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.P0 = true;
    }
}
