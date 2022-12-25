package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import org.telegram.p009ui.ActionBar.Theme;

public class OutlineEditText extends OutlineTextContainerView {
    EditTextBoldCursor editText;

    public OutlineEditText(Context context) {
        super(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            public void onFocusChanged(boolean z, int i, Rect rect) {
                super.onFocusChanged(z, i, rect);
                OutlineEditText.this.animateSelection((z || isFocused()) ? 1.0f : 0.0f);
            }
        };
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        this.editText.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.editText.setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
        this.editText.setBackground(null);
        this.editText.setSingleLine(true);
        this.editText.setInputType(1);
        this.editText.setTypeface(Typeface.DEFAULT);
        this.editText.setCursorColor(Theme.getColor("windowBackgroundWhiteInputFieldActivated"));
        this.editText.setCursorWidth(1.5f);
        attachEditText(this.editText);
        addView(this.editText, LayoutHelper.createFrame(-1, -2, 16));
    }

    public void setHint(String str) {
        setText(str);
    }

    public EditTextBoldCursor getEditText() {
        return this.editText;
    }
}
