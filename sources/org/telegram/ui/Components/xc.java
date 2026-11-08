package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class xc extends LinearLayout {
    public ImageView f40287a;
    public TextView f40288b;
    public Space f40289c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f40287a == null) {
            this.f40287a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f40289c == null) {
            this.f40289c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f40288b == null) {
            this.f40288b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f40287a;
    }

    public TextView getTextView() {
        return this.f40288b;
    }

    public void setEditButton(boolean z9) {
        this.d = z9;
    }

    public void setOnlyIconMode(boolean z9) {
        int i7;
        TextView textView = this.f40288b;
        int i10 = 0;
        if (textView != null) {
            if (z9) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView.setVisibility(i7);
        }
        Space space = this.f40289c;
        if (space != null) {
            if (z9) {
                i10 = 8;
            }
            space.setVisibility(i10);
        }
    }
}
