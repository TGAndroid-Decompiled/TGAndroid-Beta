package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class y3 extends LinearLayout {
    public final int f42307a = 1;
    public boolean f42308b;
    public final View f42309c;
    public final View d;

    public y3(Context context, v3 v3Var, x3 x3Var) {
        super(context);
        this.f42309c = v3Var;
        this.d = x3Var;
        this.f42308b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        switch (this.f42307a) {
            case 0:
                x3 x3Var = (x3) this.d;
                v3 v3Var = (v3) this.f42309c;
                this.f42308b = true;
                Point point = org.telegram.messenger.g0.f24046q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                v3Var.setItemCount(i11);
                x3Var.setItemCount(i11);
                v3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                x3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f42308b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                int rotation = ((WindowManager) org.telegram.messenger.t0.f26931b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.f42308b = true;
                if (org.telegram.messenger.g0.Q1()) {
                    ((TextView) this.f42309c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else if (rotation != 3 && rotation != 1) {
                    ((TextView) this.f42309c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else {
                    ((TextView) this.f42309c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
                }
                this.f42308b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f42307a) {
            case 0:
                if (!this.f42308b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f42308b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public y3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f42309c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, c8.ma.o(-2, -2));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29792z6, h6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
        addView(textView, c8.ma.t(-2, -2, 17, 0, 24, 0, 0));
    }
}
