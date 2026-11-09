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
public final class vz extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final boolean f39840a;
    public final CharSequence f39841b;
    public final uz f39842c;
    public final q5 d;
    public final q5 f39843e;
    public final wz f39844f;

    public vz(wz wzVar, Context context, boolean z9, CharSequence charSequence, ArrayList arrayList, boolean z10) {
        super(context);
        CharSequence spannableStringBuilder;
        float f10;
        int i7;
        int i10;
        this.f39844f = wzVar;
        this.f39840a = z9;
        String M0 = org.telegram.messenger.id.M0(2131750651, null);
        String M02 = org.telegram.messenger.id.M0(2131750650, null);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f38847a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.f38848b = textPaint2;
        Paint paint = new Paint(1);
        view.f38849c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.f38850e = fArr;
        Paint paint2 = new Paint(1);
        view.f38855w = paint2;
        Paint paint3 = new Paint(1);
        view.f38856x = paint3;
        view.f38857y = new Matrix();
        view.D = new Matrix();
        int i11 = org.telegram.ui.ActionBar.l6.f28154si;
        textPaint.setColor(org.telegram.ui.ActionBar.l6.r1(0.8f, org.telegram.ui.ActionBar.l6.x0(null, i11, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.l6.f28065o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Hi, false));
        i6 i6Var = new i6(false, true, true);
        view.E = i6Var;
        i6Var.n(0.3f, 250L, xq.h);
        i6Var.setCallback(view);
        i6Var.w(org.telegram.messenger.g0.L(11.66f));
        i6Var.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.f34587b = 1;
        int r12 = org.telegram.ui.ActionBar.l6.r1(0.8f, org.telegram.ui.ActionBar.l6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i12, false);
        if (M0 != null) {
            f10 = 15.33f;
            ny0 ny0Var = new ny0(uz.a(M0), 15.33f, org.telegram.messenger.g0.o());
            ny0Var.r(view);
            ny0Var.f36539a.setColor(r12);
            view.f38851f = ny0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = uz.a(spannableStringBuilder);
        ny0 ny0Var2 = new ny0(a10, f10, org.telegram.messenger.g0.o());
        ny0Var2.r(view);
        TextPaint textPaint3 = ny0Var2.f36539a;
        textPaint3.setColor(x02);
        view.h = ny0Var2;
        ny0Var2.q(org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z10) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        ny0Var2.o(i7);
        if (M02 != null) {
            ny0 ny0Var3 = new ny0(uz.a(M02), 15.33f, org.telegram.messenger.g0.o());
            ny0Var3.r(view);
            ny0Var3.f36539a.setColor(r12);
            view.f38852n = ny0Var3;
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
        view.f38853r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f38854s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f39842c = view;
        addView((View) view, c8.ha.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        q5 q5Var = new q5(context);
        this.d = q5Var;
        int i13 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(q5Var, i13, null);
        q5Var.setTextSize(1, 20.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        q5Var.setGravity(17);
        q5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.i6.n(new SpannableStringBuilder(charSequence), q5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.f39841b = n10;
        this.f39841b = org.telegram.messenger.ij.C5(n10, arrayList, q5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        q5Var.setText(wzVar.O0());
        if (z10) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        q5Var.setCacheType(i10);
        q5Var.setEmojiColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, wzVar.I0));
        addView(q5Var, c8.ha.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        q5 q5Var2 = new q5(context);
        this.f39843e = q5Var2;
        org.telegram.ui.ActionBar.s6.U(q5Var2, i13, null);
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
        wz wzVar = this.f39844f;
        ArrayList arrayList = wzVar.Y1;
        boolean z9 = wzVar.T1;
        CharSequence charSequence = this.f39841b;
        q5 q5Var = this.f39843e;
        if (z9) {
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750637, charSequence)));
        } else if (this.f39840a) {
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            uz uzVar = this.f39842c;
            i6 i6Var = uzVar.E;
            if (i7 > 0) {
                str = jg.g.j(i7, "+");
            } else {
                str = "";
            }
            i6Var.t(str, false, true);
            uzVar.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.F("FolderLinkSubtitleChats", i10, charSequence)));
                return;
            }
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750641, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750642, charSequence)));
        } else {
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750641, charSequence)));
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
                int i7 = org.telegram.ui.ActionBar.l6.Ci;
                wz wzVar = this.f39844f;
                int i10 = wz.f40239x2;
                q5Var.setEmojiColor(org.telegram.ui.ActionBar.l6.w0(i7, wzVar.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
