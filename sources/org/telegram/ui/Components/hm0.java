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
public final class hm0 extends Dialog {
    public static final int L = 0;
    public Drawable B;
    public pg.b C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final Context f25448a;
    public final org.telegram.ui.ActionBar.f6 f25449b;
    public Bitmap f25450c;
    public BitmapShader d;
    public Paint e;
    public Matrix f25451f;
    public final sg.b h;
    public final ng.a f25452n;
    public float f25453r;
    public final dg.u2 f25454s;
    public final qv0 v;
    public p70 f25455w;
    public FrameLayout f25456x;
    public ViewGroup f25457y;

    public hm0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        this.G = 1.0f;
        this.H = 1.0f;
        this.J = false;
        this.f25448a = context;
        this.f25449b = f6Var;
        dg.u2 u2Var = new dg.u2(this, context, 23);
        this.f25454s = u2Var;
        u2Var.setOnClickListener(new a80(this, 10));
        qv0 qv0Var = new qv0(context, null);
        this.v = qv0Var;
        qv0Var.setClipToPadding(false);
        u2Var.addView(qv0Var, k7.b6.e(-1, -1, 119));
        sg.b bVar = new sg.b();
        this.h = bVar;
        ng.a aVar = new ng.a(bVar);
        this.f25452n = aVar;
        aVar.d = new ug.i(u2Var);
        aVar.e = u2Var;
        zz zzVar = new zz(this, 2);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(u2Var, zzVar);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new v2(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f25453r;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new j70(this, 11));
        this.K.addListener(new androidx.fragment.app.g(this, z4, runnable, 6));
        this.K.setInterpolator(mr.h);
        this.K.setDuration(350L);
        this.K.start();
    }

    @Override
    public final void dismiss() {
        if (this.J) {
            return;
        }
        this.J = true;
        c(new fm0(this, 1), false);
        this.f25454s.invalidate();
    }

    public final void e(p70 p70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f25449b;
        p70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        p70Var.Q(this.f25452n, rg.b.k(f6Var), false);
        this.f25455w = p70Var;
        this.f25457y = p70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f25448a);
        this.f25456x = frameLayout;
        frameLayout.addView(this.f25457y, k7.b6.c(-2.0f, -2));
        this.v.addView(this.f25456x, k7.b6.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.s1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hm0.f(org.telegram.ui.Cells.s1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
    }

    @Override
    public final boolean isShowing() {
        return !this.J;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        dg.u2 u2Var = this.f25454s;
        setContentView(u2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        u2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(u2Var, !org.telegram.ui.ActionBar.j6.I.q());
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
