package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class am0 extends Dialog {
    public static final int O = 0;
    public Drawable E;
    public dh.d F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public ValueAnimator N;
    public final Context f24418a;
    public final org.telegram.ui.ActionBar.f6 f24419b;
    public Bitmap f24420c;
    public BitmapShader d;
    public Paint f24421e;
    public Matrix f24422f;
    public final gh.b h;
    public final bh.b f24423n;
    public float f24424r;
    public final ah.y f24425s;
    public final ov0 v;
    public n70 f24426w;
    public FrameLayout f24427x;
    public ViewGroup f24428y;

    public am0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f24418a = context;
        this.f24419b = f6Var;
        ah.y yVar = new ah.y(this, context, 18);
        this.f24425s = yVar;
        yVar.setOnClickListener(new x70(this, 10));
        ov0 ov0Var = new ov0(context, null);
        this.v = ov0Var;
        ov0Var.setClipToPadding(false);
        yVar.addView(ov0Var, w7.x5.e(-1, -1, 119));
        gh.b bVar = new gh.b();
        this.h = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f24423n = bVar2;
        bVar2.d = new ih.k(yVar);
        bVar2.f2653e = yVar;
        l.d dVar = new l.d(this, 15);
        WeakHashMap weakHashMap = r0.i0.f44698a;
        r0.a0.j(yVar, dVar);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new y2(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f24424r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new h70(this, 11));
        this.N.addListener(new ah.r0(this, z10, runnable, 6));
        this.N.setInterpolator(pr.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new yl0(this, 1), false);
        this.f24425s.invalidate();
    }

    public final void e(n70 n70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f24419b;
        n70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        n70Var.Q(this.f24423n, fh.b.k(f6Var), false);
        this.f24426w = n70Var;
        this.f24428y = n70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f24418a);
        this.f24427x = frameLayout;
        frameLayout.addView(this.f24428y, w7.x5.c(-2.0f, -2));
        this.v.addView(this.f24427x, w7.x5.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.t1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.am0.f(org.telegram.ui.Cells.t1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
    }

    @Override
    public final boolean isShowing() {
        return !this.M;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ah.y yVar = this.f24425s;
        setContentView(yVar, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        yVar.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(yVar, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        d(new d(this, 19));
        c(null, true);
    }
}
