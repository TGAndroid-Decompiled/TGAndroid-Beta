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
public final class h00 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final boolean f35687a;
    public final CharSequence f35688b;
    public final g00 f35689c;
    public final x5 d;
    public final x5 f35690e;
    public final i00 f35691f;

    public h00(i00 i00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        CharSequence spannableStringBuilder;
        float f10;
        int i7;
        int i10;
        this.f35691f = i00Var;
        this.f35687a = z10;
        String N0 = org.telegram.messenger.hd.N0(2131750634, null);
        String N02 = org.telegram.messenger.hd.N0(2131750633, null);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.f35308a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.f35309b = textPaint2;
        Paint paint = new Paint(1);
        view.f35310c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.f35311e = fArr;
        Paint paint2 = new Paint(1);
        view.f35316w = paint2;
        Paint paint3 = new Paint(1);
        view.f35317x = paint3;
        view.f35318y = new Matrix();
        view.E = new Matrix();
        int i11 = org.telegram.ui.ActionBar.m6.f29693vi;
        textPaint.setColor(org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.x0(null, i11, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.m6.f29547o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ki, false));
        n6 n6Var = new n6(false, true, true);
        view.F = n6Var;
        n6Var.n(0.3f, 250L, nr.h);
        n6Var.setCallback(view);
        n6Var.w(org.telegram.messenger.g0.L(11.66f));
        n6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.f37751b = 1;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        if (N0 != null) {
            f10 = 15.33f;
            xy0 xy0Var = new xy0(g00.a(N0), 15.33f, org.telegram.messenger.g0.o());
            xy0Var.r(view);
            xy0Var.f42222a.setColor(r12);
            view.f35312f = xy0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = g00.a(spannableStringBuilder);
        xy0 xy0Var2 = new xy0(a10, f10, org.telegram.messenger.g0.o());
        xy0Var2.r(view);
        TextPaint textPaint3 = xy0Var2.f42222a;
        textPaint3.setColor(x02);
        view.h = xy0Var2;
        xy0Var2.q(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z11) {
            i7 = 26;
        } else {
            i7 = 0;
        }
        xy0Var2.o(i7);
        if (N02 != null) {
            xy0 xy0Var3 = new xy0(g00.a(N02), 15.33f, org.telegram.messenger.g0.o());
            xy0Var3.r(view);
            xy0Var3.f42222a.setColor(r12);
            view.f35313n = xy0Var3;
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
        view.f35314r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.f35315s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.f35689c = view;
        addView((View) view, c8.na.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        x5 x5Var = new x5(context);
        this.d = x5Var;
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(x5Var, i13, null);
        x5Var.setTextSize(1, 20.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        x5Var.setGravity(17);
        x5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.j6.n(new SpannableStringBuilder(charSequence), x5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.f35688b = n10;
        this.f35688b = org.telegram.messenger.gj.C5(n10, arrayList, x5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        x5Var.setText(i00Var.P0());
        if (z11) {
            i10 = 26;
        } else {
            i10 = 0;
        }
        x5Var.setCacheType(i10);
        x5Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, i00Var.J0));
        addView(x5Var, c8.na.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        x5 x5Var2 = new x5(context);
        this.f35690e = x5Var2;
        org.telegram.ui.ActionBar.t6.U(x5Var2, i13, null);
        x5Var2.setTextSize(1, 14.0f);
        x5Var2.setLines(2);
        x5Var2.setGravity(17);
        x5Var2.setLineSpacing(0.0f, 1.15f);
        addView(x5Var2, c8.na.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i7;
        String str;
        int i10;
        i00 i00Var = this.f35691f;
        ArrayList arrayList = i00Var.f36024c2;
        boolean z10 = i00Var.X1;
        CharSequence charSequence = this.f35688b;
        x5 x5Var = this.f35690e;
        if (z10) {
            x5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.hd.V(null, null, 2131750620, charSequence)));
        } else if (this.f35687a) {
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            g00 g00Var = this.f35689c;
            n6 n6Var = g00Var.F;
            if (i7 > 0) {
                str = i5.c.i(i7, "+");
            } else {
                str = "";
            }
            n6Var.t(str, false, true);
            g00Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                x5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.hd.F("FolderLinkSubtitleChats", i10, charSequence)));
                return;
            }
            x5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.hd.V(null, null, 2131750624, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            x5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.hd.V(null, null, 2131750625, charSequence)));
        } else {
            x5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.hd.V(null, null, 2131750624, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            x5 x5Var = this.d;
            if (x5Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Fi;
                i00 i00Var = this.f35691f;
                int i10 = i00.B2;
                x5Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(i7, i00Var.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
