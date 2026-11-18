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
public final class f00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final boolean f34858a;
    public final CharSequence f34859b;
    public final e00 f34860c;
    public final w5 d;
    public final w5 f34861e;
    public final g00 f34862f;

    public f00(g00 g00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f10;
        int i7;
        int i10;
        this.f34862f = g00Var;
        this.f34858a = z10;
        String M0 = org.telegram.messenger.gd.M0(2131750635, null);
        String M02 = org.telegram.messenger.gd.M0(2131750634, null);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f34544a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.f34545b = textPaint2;
        Paint paint = new Paint(1);
        view.f34546c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.f34547e = fArr;
        Paint paint2 = new Paint(1);
        view.f34552w = paint2;
        Paint paint3 = new Paint(1);
        view.f34553x = paint3;
        view.f34554y = new Matrix();
        view.E = new Matrix();
        int i11 = org.telegram.ui.ActionBar.n6.f29742vi;
        textPaint.setColor(org.telegram.ui.ActionBar.n6.r1(0.8f, org.telegram.ui.ActionBar.n6.x0(null, i11, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.n6.f29596o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ki, false));
        m6 m6Var = new m6(false, true, true);
        view.F = m6Var;
        m6Var.n(0.3f, 250L, lr.h);
        m6Var.setCallback(view);
        m6Var.w(org.telegram.messenger.g0.L(11.66f));
        m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.f37377b = 1;
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.8f, org.telegram.ui.ActionBar.n6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        if (M0 != null) {
            f10 = 15.33f;
            vy0 vy0Var = new vy0(e00.a(M0), 15.33f, org.telegram.messenger.g0.o());
            vy0Var.r(view);
            vy0Var.f41480a.setColor(r12);
            view.f34548f = vy0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = e00.a(spannableStringBuilder);
        vy0 vy0Var2 = new vy0(a10, f10, org.telegram.messenger.g0.o());
        vy0Var2.r(view);
        TextPaint textPaint3 = vy0Var2.f41480a;
        textPaint3.setColor(x02);
        view.h = vy0Var2;
        vy0Var2.q(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z11) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        vy0Var2.o(i7);
        if (M02 != null) {
            vy0 vy0Var3 = new vy0(e00.a(M02), 15.33f, org.telegram.messenger.g0.o());
            vy0Var3.r(view);
            vy0Var3.f41480a.setColor(r12);
            view.f34549n = vy0Var3;
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
        view.f34550r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f34551s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f34860c = view;
        addView((View) view, c8.ma.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        w5 w5Var = new w5(context);
        this.d = w5Var;
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(w5Var, i13, null);
        w5Var.setTextSize(1, 20.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        w5Var.setGravity(17);
        w5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.j6.n(new SpannableStringBuilder(charSequence), w5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.f34859b = n10;
        this.f34859b = org.telegram.messenger.fj.C5(n10, arrayList, w5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        w5Var.setText(g00Var.P0());
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        w5Var.setCacheType(i10);
        w5Var.setEmojiColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, g00Var.J0));
        addView(w5Var, c8.ma.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        w5 w5Var2 = new w5(context);
        this.f34861e = w5Var2;
        org.telegram.ui.ActionBar.u6.U(w5Var2, i13, null);
        w5Var2.setTextSize(1, 14.0f);
        w5Var2.setLines(2);
        w5Var2.setGravity(17);
        w5Var2.setLineSpacing(0.0f, 1.15f);
        addView(w5Var2, c8.ma.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i7;
        String str;
        int i10;
        g00 g00Var = this.f34862f;
        ArrayList arrayList = g00Var.f35251c2;
        boolean z10 = g00Var.X1;
        CharSequence charSequence = this.f34859b;
        w5 w5Var = this.f34861e;
        if (z10) {
            w5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750621, charSequence)));
        } else if (this.f34858a) {
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            e00 e00Var = this.f34860c;
            m6 m6Var = e00Var.F;
            if (i7 > 0) {
                str = i5.c.i(i7, "+");
            } else {
                str = "";
            }
            m6Var.t(str, false, true);
            e00Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                w5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.F("FolderLinkSubtitleChats", i10, charSequence)));
                return;
            }
            w5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750625, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            w5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750626, charSequence)));
        } else {
            w5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750625, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            w5 w5Var = this.d;
            if (w5Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Fi;
                g00 g00Var = this.f34862f;
                int i10 = g00.B2;
                w5Var.setEmojiColor(org.telegram.ui.ActionBar.n6.w0(i7, g00Var.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
