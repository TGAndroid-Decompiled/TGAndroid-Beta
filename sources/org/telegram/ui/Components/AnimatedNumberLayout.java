package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;

public final class AnimatedNumberLayout {
    public static final ChatActivity.AnonymousClass5 PROGRESS = new ChatActivity.AnonymousClass5("progress", 6);
    public ObjectAnimator animator;
    public final ChatMessageCell parentView;
    public final TextPaint textPaint;
    public final ArrayList letters = new ArrayList();
    public final ArrayList oldLetters = new ArrayList();
    public float progress = 0.0f;
    public int currentNumber = 1;

    public AnimatedNumberLayout(ChatMessageCell chatMessageCell, TextPaint textPaint) {
        this.textPaint = textPaint;
        this.parentView = chatMessageCell;
    }

    public final int getWidth() {
        ArrayList arrayList = this.letters;
        int size = arrayList.size();
        float lineWidth = 0.0f;
        for (int i = 0; i < size; i++) {
            lineWidth += ((StaticLayout) arrayList.get(i)).getLineWidth(0);
        }
        return (int) Math.ceil(lineWidth);
    }

    public final void setNumber(int i, boolean z) {
        int i2 = this.currentNumber;
        ArrayList arrayList = this.letters;
        if (i2 != i || arrayList.isEmpty()) {
            ObjectAnimator objectAnimator = this.animator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.animator = null;
            }
            ArrayList arrayList2 = this.oldLetters;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            Locale locale = Locale.US;
            int i3 = this.currentNumber;
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            String string2 = sb2.toString();
            boolean z2 = i > this.currentNumber;
            this.currentNumber = i;
            this.progress = 0.0f;
            int i4 = 0;
            while (i4 < string2.length()) {
                int i5 = i4 + 1;
                String strSubstring = string2.substring(i4, i5);
                String strSubstring2 = (arrayList2.isEmpty() || i4 >= string.length()) ? null : string.substring(i4, i5);
                if (strSubstring2 == null || !strSubstring2.equals(strSubstring)) {
                    TextPaint textPaint = this.textPaint;
                    arrayList.add(new StaticLayout(strSubstring, textPaint, (int) Math.ceil(textPaint.measureText(strSubstring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    arrayList.add((StaticLayout) arrayList2.get(i4));
                    arrayList2.set(i4, null);
                }
                i4 = i5;
            }
            if (z && !arrayList2.isEmpty()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, PROGRESS, z2 ? -1.0f : 1.0f, 0.0f);
                this.animator = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(150L);
                this.animator.addListener(new CheckBox.AnonymousClass1(this, 5));
                this.animator.start();
            }
            this.parentView.invalidate();
        }
    }
}
