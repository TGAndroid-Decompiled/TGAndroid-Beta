package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class dd extends LinearLayout {
    public ImageView f27718a;
    public TextView f27719b;
    public Space f27720c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f27718a == null) {
            this.f27718a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f27720c == null) {
            this.f27720c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f27719b == null) {
            this.f27719b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f27718a;
    }

    public TextView getTextView() {
        return this.f27719b;
    }

    public void setEditButton(boolean z10) {
        this.d = z10;
    }

    public void setOnlyIconMode(boolean z10) {
        int i9;
        TextView textView = this.f27719b;
        int i10 = 0;
        if (textView != null) {
            if (z10) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            textView.setVisibility(i9);
        }
        Space space = this.f27720c;
        if (space != null) {
            if (z10) {
                i10 = 8;
            }
            space.setVisibility(i10);
        }
    }
}
