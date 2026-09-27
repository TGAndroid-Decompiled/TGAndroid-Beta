package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class od extends LinearLayout {
    public ImageView f27069a;
    public TextView f27070b;
    public Space f27071c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f27069a == null) {
            this.f27069a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f27071c == null) {
            this.f27071c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f27070b == null) {
            this.f27070b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f27069a;
    }

    public TextView getTextView() {
        return this.f27070b;
    }

    public void setEditButton(boolean z10) {
        this.d = z10;
    }

    public void setOnlyIconMode(boolean z10) {
        int i10;
        TextView textView = this.f27070b;
        int i11 = 0;
        if (textView != null) {
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView.setVisibility(i10);
        }
        Space space = this.f27071c;
        if (space != null) {
            if (z10) {
                i11 = 8;
            }
            space.setVisibility(i11);
        }
    }
}
