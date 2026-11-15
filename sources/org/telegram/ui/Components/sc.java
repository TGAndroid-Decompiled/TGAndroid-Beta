package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class sc extends LinearLayout {
    public ImageView f39268a;
    public TextView f39269b;
    public Space f39270c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f39268a == null) {
            this.f39268a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f39270c == null) {
            this.f39270c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f39269b == null) {
            this.f39269b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f39268a;
    }

    public TextView getTextView() {
        return this.f39269b;
    }

    public void setEditButton(boolean z10) {
        this.d = z10;
    }

    public void setOnlyIconMode(boolean z10) {
        int i7;
        TextView textView = this.f39269b;
        int i10 = 0;
        if (textView != null) {
            if (z10) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView.setVisibility(i7);
        }
        Space space = this.f39270c;
        if (space != null) {
            if (z10) {
                i10 = 8;
            }
            space.setVisibility(i10);
        }
    }
}
