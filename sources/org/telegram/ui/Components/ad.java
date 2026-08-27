package org.telegram.ui.Components;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

public abstract class ad extends LinearLayout {

    public ImageView f26728a;

    public TextView f26729b;

    public Space f26730c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.f26728a == null) {
            this.f26728a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.f26730c == null) {
            this.f26730c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.f26729b == null) {
            this.f26729b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.f26728a;
    }

    public TextView getTextView() {
        return this.f26729b;
    }

    public void setEditButton(boolean z10) {
        this.d = z10;
    }

    public void setOnlyIconMode(boolean z10) {
        TextView textView = this.f26729b;
        if (textView != null) {
            textView.setVisibility(z10 ? 8 : 0);
        }
        Space space = this.f26730c;
        if (space != null) {
            space.setVisibility(z10 ? 8 : 0);
        }
    }
}
