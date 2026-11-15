package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class p3 extends LinearLayout {
    public final int f38181a = 1;
    public boolean f38182b;
    public final View f38183c;
    public final View d;

    public p3(Context context, m3 m3Var, o3 o3Var) {
        super(context);
        this.f38183c = m3Var;
        this.d = o3Var;
        this.f38182b = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        switch (this.f38181a) {
            case 0:
                o3 o3Var = (o3) this.d;
                m3 m3Var = (m3) this.f38183c;
                this.f38182b = true;
                Point point = org.telegram.messenger.g0.f23611q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                m3Var.setItemCount(i11);
                o3Var.setItemCount(i11);
                m3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                o3Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f38182b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                int rotation = ((WindowManager) org.telegram.messenger.t0.f26609b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.f38182b = true;
                if (org.telegram.messenger.g0.Q1()) {
                    ((TextView) this.f38183c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else if (rotation != 3 && rotation != 1) {
                    ((TextView) this.f38183c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
                } else {
                    ((TextView) this.f38183c).setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
                }
                this.f38182b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f38181a) {
            case 0:
                if (!this.f38182b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f38182b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public p3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f38183c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, c8.ja.o(-2, -2));
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(128.0f));
        addView(textView, c8.ja.t(-2, -2, 17, 0, 24, 0, 0));
    }
}
