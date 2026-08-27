package org.telegram.ui.Components;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.FileLog;

public final class av extends LinkMovementMethod {

    public final int f26827a;

    @Override
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        switch (this.f26827a) {
            case 0:
                try {
                    boolean zOnTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return zOnTouchEvent;
                    }
                    Selection.removeSelection(spannable);
                    return zOnTouchEvent;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return false;
                }
            case 1:
                try {
                    return super.onTouchEvent(textView, spannable, motionEvent);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return false;
                }
            default:
                try {
                    boolean zOnTouchEvent2 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return zOnTouchEvent2;
                    }
                    Selection.removeSelection(spannable);
                    return zOnTouchEvent2;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return false;
                }
        }
    }
}
