package org.telegram.ui.Components;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.widget.TextView;
public final class h41 extends LinkMovementMethod {
    public final UndoView f34204a;

    public h41(UndoView undoView) {
        this.f34204a = undoView;
    }

    @Override
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        CharacterStyle[] characterStyleArr;
        try {
            if (motionEvent.getAction() != 0 || ((characterStyleArr = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class)) != null && characterStyleArr.length != 0)) {
                if (motionEvent.getAction() == 1) {
                    CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class);
                    if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                        this.f34204a.b(characterStyleArr2[0]);
                    }
                    Selection.removeSelection(spannable);
                    return true;
                }
                return super.onTouchEvent(textView, spannable, motionEvent);
            }
            return false;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return false;
        }
    }
}
