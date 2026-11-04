package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fa extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final EditTextBoldCursor f45225a;
    public final TextView f45226b;
    public final ka f45227c;

    public fa(ka kaVar, Activity activity) {
        super(activity);
        int i3;
        this.f45227c = kaVar;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.f45225a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.H6, null);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i10, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        editTextBoldCursor.setGravity(i3 | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.bd.M0(2131743658, null));
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i10, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new ea(this, 0));
        String str = kaVar.f46844r;
        long j10 = kaVar.f46848y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new n0(this, 1));
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.f45226b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(kaVar.getMessagesController().V2 + "/");
        textView.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
        textView.setGravity((org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 48);
        textView.setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        linearLayout.addView(textView, b8.mf.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, b8.mf.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, b8.mf.e(-1, -1, 48));
        if (i11 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f45225a.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
