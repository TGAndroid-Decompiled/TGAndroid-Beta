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
public final class i00 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final boolean f26971a;
    public final CharSequence f26972b;
    public final h00 f26973c;
    public final n5 d;
    public final n5 e;
    public final j00 f26974f;

    public i00(j00 j00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f7;
        int i10;
        int i11;
        this.f26974f = j00Var;
        this.f26971a = z10;
        String L0 = org.telegram.messenger.dd.L0(2131750652, null);
        String L02 = org.telegram.messenger.dd.L0(2131750651, null);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f26609a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.f26610b = textPaint2;
        Paint paint = new Paint(1);
        view.f26611c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.e = fArr;
        Paint paint2 = new Paint(1);
        view.f26616w = paint2;
        Paint paint3 = new Paint(1);
        view.f26617x = paint3;
        view.f26618y = new Matrix();
        view.D = new Matrix();
        int i12 = org.telegram.ui.ActionBar.t6.si;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.x0(null, i12, false)));
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        int i13 = org.telegram.ui.ActionBar.t6.f21135o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Hi, false));
        e6 e6Var = new e6(false, true, true);
        view.E = e6Var;
        e6Var.n(0.3f, 250L, gr.h);
        e6Var.setCallback(view);
        e6Var.w(org.telegram.messenger.i0.L(11.66f));
        e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.f25744b = 1;
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        if (L0 != null) {
            f7 = 15.33f;
            rz0 rz0Var = new rz0(h00.a(L0), 15.33f, org.telegram.messenger.i0.o());
            rz0Var.r(view);
            rz0Var.f30124a.setColor(r12);
            view.f26612f = rz0Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = h00.a(spannableStringBuilder);
        rz0 rz0Var2 = new rz0(a2, f7, org.telegram.messenger.i0.o());
        rz0Var2.r(view);
        TextPaint textPaint3 = rz0Var2.f30124a;
        textPaint3.setColor(x02);
        view.h = rz0Var2;
        rz0Var2.q(org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(a2, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        rz0Var2.o(i10);
        if (L02 != null) {
            rz0 rz0Var3 = new rz0(h00.a(L02), 15.33f, org.telegram.messenger.i0.o());
            rz0Var3.r(view);
            rz0Var3.f30124a.setColor(r12);
            view.f26613n = rz0Var3;
        }
        float L = org.telegram.messenger.i0.L(3.0f);
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        float L2 = org.telegram.messenger.i0.L(1.0f);
        fArr[7] = L2;
        fArr[6] = L2;
        fArr[5] = L2;
        fArr[4] = L2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        view.f26614r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f26615s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f26973c = view;
        addView((View) view, w7.b6.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        n5 n5Var = new n5(context);
        this.d = n5Var;
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(n5Var, i14, null);
        n5Var.setTextSize(1, 20.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        n5Var.setGravity(17);
        n5Var.setLineSpacing(org.telegram.messenger.i0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.k6.n(new SpannableStringBuilder(charSequence), n5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.f26972b = n10;
        this.f26972b = org.telegram.messenger.kj.B5(n10, arrayList, n5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        n5Var.setText(j00Var.O0());
        if (z11) {
            i11 = 26;
        } else {
            i11 = 0;
        }
        n5Var.setCacheType(i11);
        n5Var.setEmojiColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, j00Var.I0));
        addView(n5Var, w7.b6.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        n5 n5Var2 = new n5(context);
        this.e = n5Var2;
        org.telegram.ui.ActionBar.a7.V(n5Var2, i14, null);
        n5Var2.setTextSize(1, 14.0f);
        n5Var2.setLines(2);
        n5Var2.setGravity(17);
        n5Var2.setLineSpacing(0.0f, 1.15f);
        addView(n5Var2, w7.b6.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i10;
        String str;
        int i11;
        j00 j00Var = this.f26974f;
        ArrayList arrayList = j00Var.Y1;
        boolean z10 = j00Var.T1;
        CharSequence charSequence = this.f26972b;
        n5 n5Var = this.e;
        if (z10) {
            n5Var.setText(org.telegram.messenger.i0.V2(org.telegram.messenger.dd.V(null, null, 2131750638, charSequence)));
        } else if (this.f26971a) {
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            h00 h00Var = this.f26973c;
            e6 e6Var = h00Var.E;
            if (i10 > 0) {
                str = i0.a.i(i10, "+");
            } else {
                str = "";
            }
            e6Var.t(str, false, true);
            h00Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                n5Var.setText(org.telegram.messenger.i0.V2(org.telegram.messenger.dd.F("FolderLinkSubtitleChats", i11, charSequence)));
                return;
            }
            n5Var.setText(org.telegram.messenger.i0.V2(org.telegram.messenger.dd.V(null, null, 2131750642, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            n5Var.setText(org.telegram.messenger.i0.V2(org.telegram.messenger.dd.V(null, null, 2131750643, charSequence)));
        } else {
            n5Var.setText(org.telegram.messenger.i0.V2(org.telegram.messenger.dd.V(null, null, 2131750642, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            n5 n5Var = this.d;
            if (n5Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.Ci;
                j00 j00Var = this.f26974f;
                int i11 = j00.f27217x2;
                n5Var.setEmojiColor(org.telegram.ui.ActionBar.t6.w0(i10, j00Var.I0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
