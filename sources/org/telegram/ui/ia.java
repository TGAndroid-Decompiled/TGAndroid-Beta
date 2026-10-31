package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ia extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final EditTextBoldCursor f38218a;
    public final TextView f38219b;
    public final oa f38220c;

    public ia(oa oaVar, Activity activity) {
        super(activity);
        int i10;
        this.f38220c = oaVar;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.f38218a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.H6, null);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i11, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10 | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.cd.L0(2131743674, null));
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i11, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new ha(this, 0));
        String str = oaVar.f40210r;
        long j10 = oaVar.f40214y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new n0(this, 1));
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.f38219b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(oaVar.getMessagesController().U2 + "/");
        textView.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i11, null);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        textView.setTranslationY(-org.telegram.messenger.i0.L(3.0f));
        linearLayout.addView(textView, w7.b6.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, w7.b6.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, w7.b6.e(-1, -1, 48));
        if (i12 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f38218a.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
