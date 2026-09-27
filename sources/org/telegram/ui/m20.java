package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m20 extends LinearLayout {
    public final int f35493a = 0;
    public final Object f35494b;
    public final View f35495c;
    public final Object d;
    public final Object e;

    public m20(Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.yl0 yl0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new org.telegram.ui.Components.e6(this);
        this.f35494b = e6Var;
        this.f35495c = yl0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f35493a) {
            case 1:
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19001a7, (org.telegram.ui.ActionBar.e6) this.f35494b));
                org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) this.f35495c;
                float f7 = 1.0f;
                if (yl0Var != null) {
                    if (!yl0Var.canScrollVertically(1)) {
                        f7 = 0.0f;
                    }
                    paint.setAlpha((int) (e6Var.d(f7, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (e6Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public m20(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.y5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f35494b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.y5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(context, null);
        this.f35495c = p90Var;
        p90Var.setTextSize(1, 14.0f);
        p90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        p90Var.setGravity(1);
        addView(p90Var, w7.y5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, w7.y5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public m20(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        yh.x6 x6Var = new yh.x6(context, 70, 0);
        frameLayout.addView(x6Var, w7.y5.c(-1.0f, -1));
        sg.e eVar = new sg.e(context, 1, 2);
        this.f35495c = eVar;
        sg.a aVar = eVar.f43270b;
        aVar.f43258w = org.telegram.ui.ActionBar.i6.fk;
        aVar.f43259x = org.telegram.ui.ActionBar.i6.gk;
        aVar.b();
        eVar.setStarParticlesView(x6Var);
        frameLayout.addView(eVar, w7.y5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        eVar.setPaused(false);
        yh.j7 j7Var = new yh.j7(context, i10, e6Var);
        this.d = j7Var;
        w7.a6.a(j7Var);
        j7Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 27));
        frameLayout.addView(j7Var, w7.y5.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.y5.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.f35494b = textView;
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.i6.f19164j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        textView.setGravity(17);
        addView(textView, w7.y5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        textView2.setGravity(17);
        addView(textView2, w7.y5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
