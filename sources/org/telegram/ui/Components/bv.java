package org.telegram.ui.Components;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
public final class bv extends LinkMovementMethod {
    public final int f27285a;

    @Override
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        switch (this.f27285a) {
            case 0:
                try {
                    boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return onTouchEvent;
                    }
                    Selection.removeSelection(spannable);
                    return onTouchEvent;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return false;
                }
            case 1:
                try {
                    return super.onTouchEvent(textView, spannable, motionEvent);
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return false;
                }
            default:
                try {
                    boolean onTouchEvent2 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return onTouchEvent2;
                    }
                    Selection.removeSelection(spannable);
                    return onTouchEvent2;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return false;
                }
        }
    }
}
