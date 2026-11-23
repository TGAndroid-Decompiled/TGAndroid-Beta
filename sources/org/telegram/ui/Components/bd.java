package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class bd extends LinearLayout {
    public ImageView f33803a;
    public TextView f33804b;
    public Space f33805c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f33803a == null) {
            this.f33803a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f33805c == null) {
            this.f33805c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f33804b == null) {
            this.f33804b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f33803a;
    }

    public TextView getTextView() {
        return this.f33804b;
    }

    public void setEditButton(boolean z10) {
        this.d = z10;
    }

    public void setOnlyIconMode(boolean z10) {
        int i7;
        TextView textView = this.f33804b;
        int i10 = 0;
        if (textView != null) {
            if (z10) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView.setVisibility(i7);
        }
        Space space = this.f33805c;
        if (space != null) {
            if (z10) {
                i10 = 8;
            }
            space.setVisibility(i10);
        }
    }
}
