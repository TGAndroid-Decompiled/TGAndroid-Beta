package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class x3 extends LinearLayout {
    public final int f41810a = 1;
    public boolean f41811b;
    public final View f41812c;
    public final View d;

    public x3(Context context, u3 u3Var, w3 w3Var) {
        super(context);
        this.f41812c = u3Var;
        this.d = w3Var;
        this.f41811b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        switch (this.f41810a) {
            case 0:
                w3 w3Var = (w3) this.d;
                u3 u3Var = (u3) this.f41812c;
                this.f41811b = true;
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                u3Var.setItemCount(i11);
                w3Var.setItemCount(i11);
                u3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                w3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f41811b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                int rotation = ((WindowManager) org.telegram.messenger.t0.f27013b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.f41811b = true;
                if (org.telegram.messenger.g0.Q1()) {
                    ((TextView) this.f41812c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else if (rotation != 3 && rotation != 1) {
                    ((TextView) this.f41812c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else {
                    ((TextView) this.f41812c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
                }
                this.f41811b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f41810a) {
            case 0:
                if (!this.f41811b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f41811b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public x3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f41812c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, c8.na.o(-2, -2));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
        addView(textView, c8.na.t(-2, -2, 17, 0, 24, 0, 0));
    }
}
