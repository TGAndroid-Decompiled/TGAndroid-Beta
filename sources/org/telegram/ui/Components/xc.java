package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class xc extends LinearLayout {
    public ImageView f40231a;
    public TextView f40232b;
    public Space f40233c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f40231a == null) {
            this.f40231a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f40233c == null) {
            this.f40233c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f40232b == null) {
            this.f40232b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f40231a;
    }

    public TextView getTextView() {
        return this.f40232b;
    }

    public void setEditButton(boolean z9) {
        this.d = z9;
    }

    public void setOnlyIconMode(boolean z9) {
        int i7;
        TextView textView = this.f40232b;
        int i10 = 0;
        if (textView != null) {
            if (z9) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView.setVisibility(i7);
        }
        Space space = this.f40233c;
        if (space != null) {
            if (z9) {
                i10 = 8;
            }
            space.setVisibility(i10);
        }
    }
}
