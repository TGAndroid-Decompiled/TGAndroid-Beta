package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class ed extends LinearLayout {
    public ImageView f24595a;
    public TextView f24596b;
    public Space f24597c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f24595a == null) {
            this.f24595a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f24597c == null) {
            this.f24597c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f24596b == null) {
            this.f24596b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f24595a;
    }

    public TextView getTextView() {
        return this.f24596b;
    }

    public void setEditButton(boolean z4) {
        this.d = z4;
    }

    public void setOnlyIconMode(boolean z4) {
        int i10;
        TextView textView = this.f24596b;
        int i11 = 0;
        if (textView != null) {
            if (z4) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView.setVisibility(i10);
        }
        Space space = this.f24597c;
        if (space != null) {
            if (z4) {
                i11 = 8;
            }
            space.setVisibility(i11);
        }
    }
}
