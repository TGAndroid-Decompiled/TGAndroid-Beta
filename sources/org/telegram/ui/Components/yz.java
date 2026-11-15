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
public final class yz extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final boolean f42192a;
    public final CharSequence f42193b;
    public final xz f42194c;
    public final o5 d;
    public final o5 f42195e;
    public final zz f42196f;

    public yz(zz zzVar, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f10;
        int i7;
        int i10;
        this.f42196f = zzVar;
        this.f42192a = z10;
        String M0 = org.telegram.messenger.hd.M0(2131750651, null);
        String M02 = org.telegram.messenger.hd.M0(2131750650, null);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f41804a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.f41805b = textPaint2;
        Paint paint = new Paint(1);
        view.f41806c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.f41807e = fArr;
        Paint paint2 = new Paint(1);
        view.f41812w = paint2;
        Paint paint3 = new Paint(1);
        view.f41813x = paint3;
        view.f41814y = new Matrix();
        view.E = new Matrix();
        int i11 = org.telegram.ui.ActionBar.j6.f29195vi;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.r1(0.8f, org.telegram.ui.ActionBar.j6.x0(null, i11, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.j6.f29049o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ki, false));
        g6 g6Var = new g6(false, true, true);
        view.F = g6Var;
        g6Var.n(0.3f, 250L, er.h);
        g6Var.setCallback(view);
        g6Var.w(org.telegram.messenger.g0.L(11.66f));
        g6Var.u(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.f34829b = 1;
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.8f, org.telegram.ui.ActionBar.j6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i12, false);
        if (M0 != null) {
            f10 = 15.33f;
            oy0 oy0Var = new oy0(xz.a(M0), 15.33f, org.telegram.messenger.g0.o());
            oy0Var.r(view);
            oy0Var.f38103a.setColor(r12);
            view.f41808f = oy0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = xz.a(spannableStringBuilder);
        oy0 oy0Var2 = new oy0(a10, f10, org.telegram.messenger.g0.o());
        oy0Var2.r(view);
        TextPaint textPaint3 = oy0Var2.f38103a;
        textPaint3.setColor(x02);
        view.h = oy0Var2;
        oy0Var2.q(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z11) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        oy0Var2.o(i7);
        if (M02 != null) {
            oy0 oy0Var3 = new oy0(xz.a(M02), 15.33f, org.telegram.messenger.g0.o());
            oy0Var3.r(view);
            oy0Var3.f38103a.setColor(r12);
            view.f41809n = oy0Var3;
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
        view.f41810r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f41811s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f42194c = view;
        addView((View) view, c8.ja.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        o5 o5Var = new o5(context);
        this.d = o5Var;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(o5Var, i13, null);
        o5Var.setTextSize(1, 20.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setGravity(17);
        o5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.j6.n(new SpannableStringBuilder(charSequence), o5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.f42193b = n10;
        this.f42193b = org.telegram.messenger.gj.C5(n10, arrayList, o5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        o5Var.setText(zzVar.O0());
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        o5Var.setCacheType(i10);
        o5Var.setEmojiColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, zzVar.J0));
        addView(o5Var, c8.ja.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        o5 o5Var2 = new o5(context);
        this.f42195e = o5Var2;
        org.telegram.ui.ActionBar.q6.U(o5Var2, i13, null);
        o5Var2.setTextSize(1, 14.0f);
        o5Var2.setLines(2);
        o5Var2.setGravity(17);
        o5Var2.setLineSpacing(0.0f, 1.15f);
        addView(o5Var2, c8.ja.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i7;
        String str;
        int i10;
        zz zzVar = this.f42196f;
        ArrayList arrayList = zzVar.f42499c2;
        boolean z10 = zzVar.X1;
        CharSequence charSequence = this.f42193b;
        o5 o5Var = this.f42195e;
        if (z10) {
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131750637, charSequence)));
        } else if (this.f42192a) {
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            xz xzVar = this.f42194c;
            g6 g6Var = xzVar.F;
            if (i7 > 0) {
                str = i5.c.i(i7, "+");
            } else {
                str = "";
            }
            g6Var.t(str, false, true);
            xzVar.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.F("FolderLinkSubtitleChats", i10, charSequence)));
                return;
            }
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131750641, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131750642, charSequence)));
        } else {
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131750641, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            o5 o5Var = this.d;
            if (o5Var != null) {
                int i7 = org.telegram.ui.ActionBar.j6.Fi;
                zz zzVar = this.f42196f;
                int i10 = zz.B2;
                o5Var.setEmojiColor(org.telegram.ui.ActionBar.j6.w0(i7, zzVar.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
