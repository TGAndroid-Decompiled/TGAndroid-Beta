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
public final class uz extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final boolean f38781a;
    public final CharSequence f38782b;
    public final tz f38783c;
    public final p5 d;
    public final p5 f38784e;
    public final vz f38785f;

    public uz(vz vzVar, Context context, boolean z9, CharSequence charSequence, ArrayList arrayList, boolean z10) {
        super(context);
        CharSequence spannableStringBuilder;
        float f10;
        int i7;
        int i10;
        this.f38785f = vzVar;
        this.f38781a = z9;
        String M0 = org.telegram.messenger.id.M0(2131750651, null);
        String M02 = org.telegram.messenger.id.M0(2131750650, null);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f38441a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.f38442b = textPaint2;
        Paint paint = new Paint(1);
        view.f38443c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.f38444e = fArr;
        Paint paint2 = new Paint(1);
        view.f38449w = paint2;
        Paint paint3 = new Paint(1);
        view.f38450x = paint3;
        view.f38451y = new Matrix();
        view.D = new Matrix();
        int i11 = org.telegram.ui.ActionBar.m6.f28179si;
        textPaint.setColor(org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.x0(null, i11, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.m6.f28090o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false));
        h6 h6Var = new h6(false, true, true);
        view.E = h6Var;
        h6Var.n(0.3f, 250L, wq.h);
        h6Var.setCallback(view);
        h6Var.w(org.telegram.messenger.g0.L(11.66f));
        h6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.f34187b = 1;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        if (M0 != null) {
            f10 = 15.33f;
            my0 my0Var = new my0(tz.a(M0), 15.33f, org.telegram.messenger.g0.o());
            my0Var.r(view);
            my0Var.f36131a.setColor(r12);
            view.f38445f = my0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = tz.a(spannableStringBuilder);
        my0 my0Var2 = new my0(a10, f10, org.telegram.messenger.g0.o());
        my0Var2.r(view);
        TextPaint textPaint3 = my0Var2.f36131a;
        textPaint3.setColor(x02);
        view.h = my0Var2;
        my0Var2.q(org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z10) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        my0Var2.o(i7);
        if (M02 != null) {
            my0 my0Var3 = new my0(tz.a(M02), 15.33f, org.telegram.messenger.g0.o());
            my0Var3.r(view);
            my0Var3.f36131a.setColor(r12);
            view.f38446n = my0Var3;
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
        view.f38447r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f38448s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f38783c = view;
        addView((View) view, c8.ha.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        p5 p5Var = new p5(context);
        this.d = p5Var;
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(p5Var, i13, null);
        p5Var.setTextSize(1, 20.0f);
        p5Var.setTypeface(org.telegram.messenger.g0.o());
        p5Var.setGravity(17);
        p5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.i6.n(new SpannableStringBuilder(charSequence), p5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.f38782b = n10;
        this.f38782b = org.telegram.messenger.ij.C5(n10, arrayList, p5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        p5Var.setText(vzVar.O0());
        if (z10) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        p5Var.setCacheType(i10);
        p5Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, vzVar.I0));
        addView(p5Var, c8.ha.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        p5 p5Var2 = new p5(context);
        this.f38784e = p5Var2;
        org.telegram.ui.ActionBar.t6.U(p5Var2, i13, null);
        p5Var2.setTextSize(1, 14.0f);
        p5Var2.setLines(2);
        p5Var2.setGravity(17);
        p5Var2.setLineSpacing(0.0f, 1.15f);
        addView(p5Var2, c8.ha.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i7;
        String str;
        int i10;
        vz vzVar = this.f38785f;
        ArrayList arrayList = vzVar.f39822b2;
        boolean z9 = vzVar.W1;
        CharSequence charSequence = this.f38782b;
        p5 p5Var = this.f38784e;
        if (z9) {
            p5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750637, charSequence)));
        } else if (this.f38781a) {
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            tz tzVar = this.f38783c;
            h6 h6Var = tzVar.E;
            if (i7 > 0) {
                str = jg.g.j(i7, "+");
            } else {
                str = "";
            }
            h6Var.t(str, false, true);
            tzVar.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                p5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.F("FolderLinkSubtitleChats", i10, charSequence)));
                return;
            }
            p5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750641, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            p5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750642, charSequence)));
        } else {
            p5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750641, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            p5 p5Var = this.d;
            if (p5Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Ci;
                vz vzVar = this.f38785f;
                int i10 = vz.A2;
                p5Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(i7, vzVar.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
