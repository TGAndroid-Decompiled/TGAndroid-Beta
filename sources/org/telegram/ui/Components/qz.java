package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class qz extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final boolean f37568a;
    public final CharSequence f37569b;
    public final pz f37570c;
    public final o5 d;
    public final o5 f37571e;
    public final rz f37572f;

    public qz(rz rzVar, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f10;
        int i3;
        int i10;
        this.f37572f = rzVar;
        this.f37568a = z10;
        String M0 = org.telegram.messenger.bd.M0(2131750652, null);
        String M02 = org.telegram.messenger.bd.M0(2131750651, null);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f37286a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.f37287b = textPaint2;
        Paint paint = new Paint(1);
        view.f37288c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.f37289e = fArr;
        Paint paint2 = new Paint(1);
        view.f37294w = paint2;
        Paint paint3 = new Paint(1);
        view.f37295x = paint3;
        view.f37296y = new Matrix();
        view.E = new Matrix();
        int i11 = org.telegram.ui.ActionBar.k6.f28169si;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i11, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.k6.f28081o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Hi, false));
        g6 g6Var = new g6(false, true, true);
        view.F = g6Var;
        g6Var.n(0.3f, 250L, xq.h);
        g6Var.setCallback(view);
        g6Var.w(org.telegram.messenger.g0.L(11.66f));
        g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.f33983b = 1;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        if (M0 != null) {
            f10 = 15.33f;
            ly0 ly0Var = new ly0(pz.a(M0), 15.33f, org.telegram.messenger.g0.o());
            ly0Var.r(view);
            ly0Var.f35916a.setColor(r12);
            view.f37290f = ly0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = pz.a(spannableStringBuilder);
        ly0 ly0Var2 = new ly0(a10, f10, org.telegram.messenger.g0.o());
        ly0Var2.r(view);
        TextPaint textPaint3 = ly0Var2.f35916a;
        textPaint3.setColor(x02);
        view.h = ly0Var2;
        ly0Var2.q(org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z11) {
            i3 = 26;
        } else {
            i3 = 0;
        }
        ly0Var2.o(i3);
        if (M02 != null) {
            ly0 ly0Var3 = new ly0(pz.a(M02), 15.33f, org.telegram.messenger.g0.o());
            ly0Var3.r(view);
            ly0Var3.f35916a.setColor(r12);
            view.f37291n = ly0Var3;
        }
        float L = org.telegram.messenger.g0.L(3.0f);
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        float L2 = org.telegram.messenger.g0.L(1.0f);
        fArr[7] = L2;
        fArr[6] = L2;
        fArr[5] = L2;
        fArr[4] = L2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        view.f37292r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f37293s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f37570c = view;
        addView((View) view, b8.mf.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        o5 o5Var = new o5(context);
        this.d = o5Var;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(o5Var, i13, null);
        o5Var.setTextSize(1, 20.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setGravity(17);
        o5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n4 = org.telegram.messenger.i6.n(new SpannableStringBuilder(charSequence), o5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.f37569b = n4;
        this.f37569b = org.telegram.messenger.zi.D5(n4, arrayList, o5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        o5Var.setText(rzVar.O0());
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        o5Var.setCacheType(i10);
        o5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, rzVar.J0));
        addView(o5Var, b8.mf.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        o5 o5Var2 = new o5(context);
        this.f37571e = o5Var2;
        org.telegram.ui.ActionBar.r6.V(o5Var2, i13, null);
        o5Var2.setTextSize(1, 14.0f);
        o5Var2.setLines(2);
        o5Var2.setGravity(17);
        o5Var2.setLineSpacing(0.0f, 1.15f);
        addView(o5Var2, b8.mf.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i3;
        String str;
        int i10;
        rz rzVar = this.f37572f;
        ArrayList arrayList = rzVar.Z1;
        boolean z10 = rzVar.U1;
        CharSequence charSequence = this.f37569b;
        o5 o5Var = this.f37571e;
        if (z10) {
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.bd.V(null, null, 2131750638, charSequence)));
        } else if (this.f37568a) {
            if (arrayList != null) {
                i3 = arrayList.size();
            } else {
                i3 = 0;
            }
            pz pzVar = this.f37570c;
            g6 g6Var = pzVar.F;
            if (i3 > 0) {
                str = k2.p1.i(i3, "+");
            } else {
                str = "";
            }
            g6Var.t(str, false, true);
            pzVar.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.bd.F("FolderLinkSubtitleChats", i10, charSequence)));
                return;
            }
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.bd.V(null, null, 2131750642, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.bd.V(null, null, 2131750643, charSequence)));
        } else {
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.bd.V(null, null, 2131750642, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            o5 o5Var = this.d;
            if (o5Var != null) {
                int i3 = org.telegram.ui.ActionBar.k6.Ci;
                rz rzVar = this.f37572f;
                int i10 = rz.f37845y2;
                o5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i3, rzVar.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
