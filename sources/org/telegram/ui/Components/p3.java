package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class p3 extends LinearLayout {
    public final int f29343a = 1;
    public boolean f29344b;
    public final View f29345c;
    public final View d;

    public p3(Context context, m3 m3Var, o3 o3Var) {
        super(context);
        this.f29345c = m3Var;
        this.d = o3Var;
        this.f29344b = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f29343a) {
            case 0:
                o3 o3Var = (o3) this.d;
                m3 m3Var = (m3) this.f29345c;
                this.f29344b = true;
                Point point = org.telegram.messenger.i0.f16172q;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                m3Var.setItemCount(i12);
                o3Var.setItemCount(i12);
                m3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                o3Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                this.f29344b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                int rotation = ((WindowManager) org.telegram.messenger.w0.f18945b.getSystemService("window")).getDefaultDisplay().getRotation();
                this.f29344b = true;
                if (org.telegram.messenger.i0.Q1()) {
                    ((TextView) this.f29345c).setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(128.0f));
                } else if (rotation != 3 && rotation != 1) {
                    ((TextView) this.f29345c).setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(128.0f));
                } else {
                    ((TextView) this.f29345c).setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), 0);
                }
                this.f29344b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f29343a) {
            case 0:
                if (!this.f29344b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f29344b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public p3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f29345c = textView;
        View imageView = new ImageView(context);
        this.d = imageView;
        setOrientation(1);
        setGravity(17);
        addView(imageView, w7.b6.o(-2, -2));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 17.0f);
        textView.setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(128.0f));
        addView(textView, w7.b6.t(-2, -2, 17, 0, 24, 0, 0));
    }
}
