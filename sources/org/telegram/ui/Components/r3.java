package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class r3 extends LinearLayout {
    public final int f37548a = 1;
    public boolean f37549b;
    public final View f37550c;
    public final View d;

    public r3(Context context, o3 o3Var, q3 q3Var) {
        super(context);
        this.f37550c = o3Var;
        this.d = q3Var;
        this.f37549b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        switch (this.f37548a) {
            case 0:
                q3 q3Var = (q3) this.d;
                o3 o3Var = (o3) this.f37550c;
                this.f37549b = true;
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                o3Var.setItemCount(i11);
                q3Var.setItemCount(i11);
                o3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                q3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f37549b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                int rotation = ((WindowManager) org.telegram.messenger.t0.f25566b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.f37549b = true;
                if (org.telegram.messenger.g0.Q1()) {
                    ((TextView) this.f37550c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else if (rotation != 3 && rotation != 1) {
                    ((TextView) this.f37550c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else {
                    ((TextView) this.f37550c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
                }
                this.f37549b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f37548a) {
            case 0:
                if (!this.f37549b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f37549b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public r3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f37550c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, c8.ha.o(-2, -2));
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28275z6, g6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
        addView(textView, c8.ha.t(-2, -2, 17, 0, 24, 0, 0));
    }
}
