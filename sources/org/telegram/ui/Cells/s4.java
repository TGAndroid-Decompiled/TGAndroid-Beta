package org.telegram.ui.Cells;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class s4 extends FrameLayout {
    public TextView f30336a;

    public void setCellHeight(int i3) {
        setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(54.0f), i3));
    }

    public void setLetter(String str) {
        this.f30336a.setText(str.toUpperCase());
    }

    public void setLetterProgress(float f10) {
        TextView textView = this.f30336a;
        textView.setAlpha(f10);
        float f11 = (0.4f * f10) + 0.6f;
        textView.setScaleX(f11);
        textView.setScaleY(f11);
        textView.setTranslationX((1.0f - f10) * (-org.telegram.messenger.g0.L(10.0f)));
    }

    public void setLetterTextSize(float f10) {
        this.f30336a.setTextSize(1, f10);
    }
}
