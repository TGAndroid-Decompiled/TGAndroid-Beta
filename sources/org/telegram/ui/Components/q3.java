package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class q3 extends LinearLayout {
    public final int f37146a = 1;
    public boolean f37147b;
    public final View f37148c;
    public final View d;

    public q3(Context context, n3 n3Var, p3 p3Var) {
        super(context);
        this.f37148c = n3Var;
        this.d = p3Var;
        this.f37147b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        switch (this.f37146a) {
            case 0:
                p3 p3Var = (p3) this.d;
                n3 n3Var = (n3) this.f37148c;
                this.f37147b = true;
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                n3Var.setItemCount(i11);
                p3Var.setItemCount(i11);
                n3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                p3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f37147b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                int rotation = ((WindowManager) org.telegram.messenger.t0.f25570b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.f37147b = true;
                if (org.telegram.messenger.g0.Q1()) {
                    ((TextView) this.f37148c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else if (rotation != 3 && rotation != 1) {
                    ((TextView) this.f37148c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else {
                    ((TextView) this.f37148c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
                }
                this.f37147b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f37146a) {
            case 0:
                if (!this.f37147b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f37147b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public q3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f37148c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, c8.ha.o(-2, -2));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28300z6, h6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
        addView(textView, c8.ha.t(-2, -2, 17, 0, 24, 0, 0));
    }
}
