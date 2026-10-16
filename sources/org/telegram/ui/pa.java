package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pa extends FrameLayout {
    public final EditTextBoldCursor f38860a;
    public final TextView f38861b;
    public final va f38862c;

    public pa(va vaVar, Activity activity) {
        super(activity);
        int i10;
        this.f38862c = vaVar;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.f38860a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.H6, false));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10 | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.UsernameLinkPlaceholder));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new na(this, 0));
        String str = vaVar.f40627r;
        long j10 = vaVar.f40630x;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new oa(this));
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.f38861b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(vaVar.getMessagesController().linkPrefix + "/");
        textView.setTextSize(1, 17.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setTranslationY(-AndroidUtilities.dp(3.0f));
        linearLayout.addView(textView, w7.z5.p(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, w7.z5.p(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, w7.z5.e(-1, -1, 48));
        if (i12 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
