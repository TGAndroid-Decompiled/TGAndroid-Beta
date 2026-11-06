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
public final class uz extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final boolean f38760a;
    public final CharSequence f38761b;
    public final tz f38762c;
    public final q5 d;
    public final q5 f38763e;
    public final vz f38764f;

    public uz(vz vzVar, Context context, boolean z9, CharSequence charSequence, ArrayList arrayList, boolean z10) {
        super(context);
        CharSequence spannableStringBuilder;
        float f10;
        int i7;
        int i10;
        this.f38764f = vzVar;
        this.f38760a = z9;
        String M0 = org.telegram.messenger.hd.M0(2131750652, null);
        String M02 = org.telegram.messenger.hd.M0(2131750651, null);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f38437a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.f38438b = textPaint2;
        Paint paint = new Paint(1);
        view.f38439c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.f38440e = fArr;
        Paint paint2 = new Paint(1);
        view.f38445w = paint2;
        Paint paint3 = new Paint(1);
        view.f38446x = paint3;
        view.f38447y = new Matrix();
        view.D = new Matrix();
        int i11 = org.telegram.ui.ActionBar.k6.f28137si;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i11, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.k6.f28048o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Hi, false));
        i6 i6Var = new i6(false, true, true);
        view.E = i6Var;
        i6Var.n(0.3f, 250L, xq.h);
        i6Var.setCallback(view);
        i6Var.w(org.telegram.messenger.g0.L(11.66f));
        i6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.f34477b = 1;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        if (M0 != null) {
            f10 = 15.33f;
            ly0 ly0Var = new ly0(tz.a(M0), 15.33f, org.telegram.messenger.g0.o());
            ly0Var.r(view);
            ly0Var.f35780a.setColor(r12);
            view.f38441f = ly0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = tz.a(spannableStringBuilder);
        ly0 ly0Var2 = new ly0(a10, f10, org.telegram.messenger.g0.o());
        ly0Var2.r(view);
        TextPaint textPaint3 = ly0Var2.f35780a;
        textPaint3.setColor(x02);
        view.h = ly0Var2;
        ly0Var2.q(org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z10) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        ly0Var2.o(i7);
        if (M02 != null) {
            ly0 ly0Var3 = new ly0(tz.a(M02), 15.33f, org.telegram.messenger.g0.o());
            ly0Var3.r(view);
            ly0Var3.f35780a.setColor(r12);
            view.f38442n = ly0Var3;
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
        view.f38443r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f38444s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f38762c = view;
        addView((View) view, c8.ha.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        q5 q5Var = new q5(context);
        this.d = q5Var;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(q5Var, i13, null);
        q5Var.setTextSize(1, 20.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        q5Var.setGravity(17);
        q5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.i6.n(new SpannableStringBuilder(charSequence), q5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.f38761b = n10;
        this.f38761b = org.telegram.messenger.ij.D5(n10, arrayList, q5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        q5Var.setText(vzVar.O0());
        if (z10) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        q5Var.setCacheType(i10);
        q5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, vzVar.I0));
        addView(q5Var, c8.ha.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        q5 q5Var2 = new q5(context);
        this.f38763e = q5Var2;
        org.telegram.ui.ActionBar.r6.V(q5Var2, i13, null);
        q5Var2.setTextSize(1, 14.0f);
        q5Var2.setLines(2);
        q5Var2.setGravity(17);
        q5Var2.setLineSpacing(0.0f, 1.15f);
        addView(q5Var2, c8.ha.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i7;
        String str;
        int i10;
        vz vzVar = this.f38764f;
        ArrayList arrayList = vzVar.Y1;
        boolean z9 = vzVar.T1;
        CharSequence charSequence = this.f38761b;
        q5 q5Var = this.f38763e;
        if (z9) {
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131750638, charSequence)));
        } else if (this.f38760a) {
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            tz tzVar = this.f38762c;
            i6 i6Var = tzVar.E;
            if (i7 > 0) {
                str = jg.g.j(i7, "+");
            } else {
                str = "";
            }
            i6Var.t(str, false, true);
            tzVar.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.F("FolderLinkSubtitleChats", i10, charSequence)));
                return;
            }
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131750642, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131750643, charSequence)));
        } else {
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.V(null, null, 2131750642, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            q5 q5Var = this.d;
            if (q5Var != null) {
                int i7 = org.telegram.ui.ActionBar.k6.Ci;
                vz vzVar = this.f38764f;
                int i10 = vz.f39764x2;
                q5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i7, vzVar.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
