package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class xc extends LinearLayout {
    public ImageView f40357a;
    public TextView f40358b;
    public Space f40359c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f40357a == null) {
            this.f40357a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f40359c == null) {
            this.f40359c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f40358b == null) {
            this.f40358b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f40357a;
    }

    public TextView getTextView() {
        return this.f40358b;
    }

    public void setEditButton(boolean z9) {
        this.d = z9;
    }

    public void setOnlyIconMode(boolean z9) {
        int i7;
        TextView textView = this.f40358b;
        int i10 = 0;
        if (textView != null) {
            if (z9) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView.setVisibility(i7);
        }
        Space space = this.f40359c;
        if (space != null) {
            if (z9) {
                i10 = 8;
            }
            space.setVisibility(i10);
        }
    }
}
