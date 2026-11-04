package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class vc extends LinearLayout {
    public ImageView f39063a;
    public TextView f39064b;
    public Space f39065c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f39063a == null) {
            this.f39063a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f39065c == null) {
            this.f39065c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f39064b == null) {
            this.f39064b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f39063a;
    }

    public TextView getTextView() {
        return this.f39064b;
    }

    public void setEditButton(boolean z10) {
        this.d = z10;
    }

    public void setOnlyIconMode(boolean z10) {
        int i3;
        TextView textView = this.f39064b;
        int i10 = 0;
        if (textView != null) {
            if (z10) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            textView.setVisibility(i3);
        }
        Space space = this.f39065c;
        if (space != null) {
            if (z10) {
                i10 = 8;
            }
            space.setVisibility(i10);
        }
    }
}
