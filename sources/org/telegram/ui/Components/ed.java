package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class ed extends LinearLayout {
    public ImageView f26505a;
    public TextView f26506b;
    public Space f26507c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f26505a == null) {
            this.f26505a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f26507c == null) {
            this.f26507c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f26506b == null) {
            this.f26506b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f26505a;
    }

    public TextView getTextView() {
        return this.f26506b;
    }

    public void setEditButton(boolean z4) {
        this.d = z4;
    }

    public void setOnlyIconMode(boolean z4) {
        int i10;
        TextView textView = this.f26506b;
        int i11 = 0;
        if (textView != null) {
            if (z4) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView.setVisibility(i10);
        }
        Space space = this.f26507c;
        if (space != null) {
            if (z4) {
                i11 = 8;
            }
            space.setVisibility(i11);
        }
    }
}
