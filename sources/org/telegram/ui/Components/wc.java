package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class wc extends LinearLayout {
    public ImageView f39942a;
    public TextView f39943b;
    public Space f39944c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f39942a == null) {
            this.f39942a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f39944c == null) {
            this.f39944c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f39943b == null) {
            this.f39943b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f39942a;
    }

    public TextView getTextView() {
        return this.f39943b;
    }

    public void setEditButton(boolean z9) {
        this.d = z9;
    }

    public void setOnlyIconMode(boolean z9) {
        int i7;
        TextView textView = this.f39943b;
        int i10 = 0;
        if (textView != null) {
            if (z9) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView.setVisibility(i7);
        }
        Space space = this.f39944c;
        if (space != null) {
            if (z9) {
                i10 = 8;
            }
            space.setVisibility(i10);
        }
    }
}
