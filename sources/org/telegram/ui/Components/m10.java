package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class m10 extends FrameLayout implements ud.b {

    public final ud.a f30517a;

    public final ud.a f30518b;

    public final ri0 f30519c;
    public final RadialProgressView d;

    public final org.telegram.ui.ActionBar.c6 f30520e;

    public ArrayList f30521f;
    public final boolean h;

    public final og.c f30522n;

    public final lg.f f30523r;

    public final lh.f f30524s;
    public float v;

    public float f30525w;

    public boolean f30526x;

    public m10(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
        view.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        view.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        view.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    private void setAdditionalTranslationY(float f10) {
        if (this.v != f10) {
            this.f30526x = true;
            super.setTranslationY(this.f30525w + f10);
            this.f30526x = false;
            this.v = f10;
        }
    }

    public final void a(View view) {
        if (this.f30521f == null) {
            this.f30521f = new ArrayList();
        }
        this.f30521f.add(view);
        d(view, 1.0f - this.f30518b.f48497e);
    }

    @Override
    public final void draw(Canvas canvas) {
        lg.f fVar = this.f30523r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f30517a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f30518b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        ri0 ri0Var = this.f30519c;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30520e;
        if (!z10) {
            int i10 = org.telegram.ui.ActionBar.g6.O9;
            ri0Var.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var)));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.f23375v8;
        ri0Var.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.f30522n.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        this.f30524s.b();
        this.f30523r.u();
        invalidate();
        int iDp = AndroidUtilities.dp(18.0f);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var);
        int iDp2 = AndroidUtilities.dp(6.0f);
        setBackground(org.telegram.ui.ActionBar.g6.W(iDp, iV0, iDp2, iDp2, iDp2, iDp2));
    }

    public boolean getButtonVisible() {
        return this.f30517a.f48498f;
    }

    public boolean getProgressVisible() {
        return this.f30518b.f48498f;
    }

    @Override
    public float getTranslationY() {
        return this.f30526x ? super.getTranslationY() : this.f30525w;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        int i11 = 0;
        if (i10 == 0) {
            d(this, f10);
            setClickable(f10 >= 0.99f);
            setAdditionalTranslationY((1.0f - f10) * AndroidUtilities.dp(this.h ? 64.0f : 40.0f));
        } else if (i10 == 1) {
            d(this.d, f10);
            float f12 = 1.0f - f10;
            d(this.f30519c, f12);
            ArrayList arrayList = this.f30521f;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    d((View) obj, f12);
                }
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        lg.f fVar = this.f30523r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f30519c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f10) {
        if (this.f30525w != f10) {
            this.f30526x = true;
            super.setTranslationY(this.v + f10);
            this.f30526x = false;
            this.f30525w = f10;
        }
    }

    public m10(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        er erVar = er.h;
        this.f30517a = new ud.a(0, this, erVar, 380L, true);
        this.f30518b = new ud.a(1, this, erVar, 380L, false);
        this.f30520e = c6Var;
        this.h = z10;
        ri0 ri0Var = new ri0(context);
        this.f30519c = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ri0Var, h7.z5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, h7.z5.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        h7.b6.a(this);
        if (!z10) {
            setOutlineProvider(gf.r0.f7054a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            lh.f fVar = new lh.f(org.telegram.ui.ActionBar.g6.f23124h5, null);
            this.f30524s = fVar;
            og.c cVar = new og.c();
            this.f30522n = cVar;
            lg.f fVar2 = new lg.f(cVar);
            this.f30523r = fVar2;
            fVar2.n(fVar);
            float fDpf2 = AndroidUtilities.dpf2(0.4f);
            float fDpf3 = AndroidUtilities.dpf2(0.4f);
            lg.c cVar2 = fVar2.h;
            cVar2.f15586i = fDpf2;
            cVar2.f15587j = fDpf3;
            fVar2.p(AndroidUtilities.dp(18.0f));
            fVar2.o(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
