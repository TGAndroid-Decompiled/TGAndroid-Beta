package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
public abstract class pd extends LinearLayout {
    public ImageView f27975a;
    public TextView f27976b;
    public Space f27977c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f27975a == null) {
            this.f27975a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f27977c == null) {
            this.f27977c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f27976b == null) {
            this.f27976b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f27975a;
    }

    public TextView getTextView() {
        return this.f27976b;
    }

    public void setEditButton(boolean z10) {
        this.d = z10;
    }

    public void setOnlyIconMode(boolean z10) {
        int i10;
        TextView textView = this.f27976b;
        int i11 = 0;
        if (textView != null) {
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView.setVisibility(i10);
        }
        Space space = this.f27977c;
        if (space != null) {
            if (z10) {
                i11 = 8;
            }
            space.setVisibility(i11);
        }
    }
}
