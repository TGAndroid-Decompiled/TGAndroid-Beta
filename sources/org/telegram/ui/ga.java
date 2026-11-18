package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ga extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final EditTextBoldCursor f48007a;
    public final TextView f48008b;
    public final la f48009c;

    public ga(la laVar, Activity activity) {
        super(activity);
        int i7;
        this.f48009c = laVar;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.f48007a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.u6.D(editTextBoldCursor, org.telegram.ui.ActionBar.n6.H6, null);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i10, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (org.telegram.messenger.gd.f24216a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor.setGravity(i7 | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.gd.M0(2131743411, null));
        org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, i10, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new fa(this, 0));
        String str = laVar.f49515r;
        long j3 = laVar.f49519y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new m0(this, 1));
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.f48008b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(laVar.getMessagesController().X2 + "/");
        textView.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i10, null);
        textView.setGravity((org.telegram.messenger.gd.f24216a0 ? 5 : 3) | 48);
        textView.setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        linearLayout.addView(textView, c8.ma.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, c8.ma.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, c8.ma.e(-1, -1, 48));
        if (i11 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f48007a.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
