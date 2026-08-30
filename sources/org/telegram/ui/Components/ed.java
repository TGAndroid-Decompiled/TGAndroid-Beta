package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class ed extends LinearLayout {
    public ImageView f24552a;
    public TextView f24553b;
    public Space f24554c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f24552a == null) {
            this.f24552a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f24554c == null) {
            this.f24554c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f24553b == null) {
            this.f24553b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f24552a;
    }

    public TextView getTextView() {
        return this.f24553b;
    }

    public void setEditButton(boolean z4) {
        this.d = z4;
    }

    public void setOnlyIconMode(boolean z4) {
        int i10;
        TextView textView = this.f24553b;
        int i11 = 0;
        if (textView != null) {
            if (z4) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView.setVisibility(i10);
        }
        Space space = this.f24554c;
        if (space != null) {
            if (z4) {
                i11 = 8;
            }
            space.setVisibility(i11);
        }
    }
}
