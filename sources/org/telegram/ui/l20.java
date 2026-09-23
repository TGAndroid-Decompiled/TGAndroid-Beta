package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l20 extends LinearLayout {
    public final int f34845a = 0;
    public final Object f34846b;
    public final View f34847c;
    public final Object d;
    public final Object e;

    public l20(Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ml0 ml0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new org.telegram.ui.Components.e6(this);
        this.f34846b = d6Var;
        this.f34847c = ml0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f34845a) {
            case 1:
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, (org.telegram.ui.ActionBar.d6) this.f34846b));
                org.telegram.ui.Components.ml0 ml0Var = (org.telegram.ui.Components.ml0) this.f34847c;
                float f7 = 1.0f;
                if (ml0Var != null) {
                    if (!ml0Var.canScrollVertically(1)) {
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

    public l20(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.x5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f34846b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, null);
        this.f34847c = d90Var;
        d90Var.setTextSize(1, 14.0f);
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        d90Var.setGravity(1);
        addView(d90Var, w7.x5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, w7.x5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public l20(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        yh.y6 y6Var = new yh.y6(context, 70, 0);
        frameLayout.addView(y6Var, w7.x5.c(-1.0f, -1));
        sg.e eVar = new sg.e(context, 1, 2);
        this.f34847c = eVar;
        sg.a aVar = eVar.f42889b;
        aVar.f42877w = org.telegram.ui.ActionBar.h6.fk;
        aVar.f42878x = org.telegram.ui.ActionBar.h6.gk;
        aVar.b();
        eVar.setStarParticlesView(y6Var);
        frameLayout.addView(eVar, w7.x5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        eVar.setPaused(false);
        yh.k7 k7Var = new yh.k7(context, i10, d6Var);
        this.d = k7Var;
        w7.z5.a(k7Var);
        k7Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 27));
        frameLayout.addView(k7Var, w7.x5.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.x5.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.f34846b = textView;
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.h6.f18895j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        textView.setGravity(17);
        addView(textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        textView2.setGravity(17);
        addView(textView2, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
