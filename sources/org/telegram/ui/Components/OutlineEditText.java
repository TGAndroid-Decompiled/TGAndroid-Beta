package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.UsersSelectActivity;

public final class OutlineEditText extends OutlineTextContainerView {
    public final UsersSelectActivity.AnonymousClass4 editText;

    public OutlineEditText(Context context) {
        super(context, null);
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, context, 4);
        this.editText = anonymousClass4;
        anonymousClass4.setTextSize(1, 18.0f);
        anonymousClass4.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        anonymousClass4.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
        anonymousClass4.setBackground(null);
        anonymousClass4.setSingleLine(true);
        anonymousClass4.setInputType(1);
        anonymousClass4.setTypeface(Typeface.DEFAULT);
        anonymousClass4.setCursorColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false));
        anonymousClass4.setCursorWidth(1.5f);
        anonymousClass4.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        this.attachedEditText = anonymousClass4;
        invalidate();
        addView(anonymousClass4, LayoutHelper.createFrame(-1, -2, 16));
    }

    public EditTextBoldCursor getEditText() {
        return this.editText;
    }

    public void setHint(String str) {
        setText(str);
    }
}
