package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class od extends LinearLayout {
    public ImageView f31261a;
    public TextView f31262b;
    public Space f31263c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f31261a == null) {
            this.f31261a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f31263c == null) {
            this.f31263c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f31262b == null) {
            this.f31262b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f31261a;
    }

    public TextView getTextView() {
        return this.f31262b;
    }

    public void setEditButton(boolean z10) {
        this.d = z10;
    }

    public void setOnlyIconMode(boolean z10) {
        int i10;
        TextView textView = this.f31262b;
        int i11 = 0;
        if (textView != null) {
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView.setVisibility(i10);
        }
        Space space = this.f31263c;
        if (space != null) {
            if (z10) {
                i11 = 8;
            }
            space.setVisibility(i11);
        }
    }
}
