package org.telegram.ui.Components;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
public final class e61 extends LinkMovementMethod {
    public final UndoView f22603a;

    public e61(UndoView undoView) {
        this.f22603a = undoView;
    }

    @Override
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        CharacterStyle[] characterStyleArr;
        try {
            if (motionEvent.getAction() != 0 || ((characterStyleArr = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class)) != null && characterStyleArr.length != 0)) {
                if (motionEvent.getAction() == 1) {
                    CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class);
                    if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                        this.f22603a.b(characterStyleArr2[0]);
                    }
                    Selection.removeSelection(spannable);
                    return true;
                }
                return super.onTouchEvent(textView, spannable, motionEvent);
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }
}
