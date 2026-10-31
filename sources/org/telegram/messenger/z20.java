package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.opengl.GLUtils;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.ui.ThemeActivity;
public abstract class z20 {
    public static int A(float f7, int i10, int i11) {
        return i11 - (i0.L(f7) * i10);
    }

    public static int B(float f7, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(i0.L(f7) + i10, i11);
    }

    public static int C(float f7, int i10, int i11) {
        return Math.min(i11, i10 - i0.L(f7));
    }

    public static int D(float f7, int i10, int i11) {
        return (i10 - i0.L(f7)) + i11;
    }

    public static int a(org.telegram.ui.c3 c3Var) {
        int boundLeft = c3Var.getBoundLeft();
        int boundRight = c3Var.getBoundRight();
        if (boundLeft >= 0 && boundRight >= 0 && boundRight >= boundLeft) {
            return boundRight - boundLeft;
        }
        return -1;
    }

    public static float b(float f7, float f10, float f11, float f12) {
        return ((f7 + f10) * f11) + f12;
    }

    public static int c(float f7, int i10, int i11) {
        return View.MeasureSpec.makeMeasureSpec(i10 - i0.L(f7), i11);
    }

    public static TextPaint d(TextPaint textPaint, int i10) {
        textPaint.setTypeface(i0.o());
        return new TextPaint(i10);
    }

    public static ImageView e(Context context, int i10) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        return imageView;
    }

    public static TextView f(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static FloatBuffer g(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static org.telegram.ui.ActionBar.z2 h(Activity activity, boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(i10, activity, p6Var, z10);
        z2Var.O();
        return z2Var;
    }

    public static vh.d i(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        vh.d dVar = new vh.d(context, p6Var, z10);
        dVar.setRoundRadius(i10);
        return dVar;
    }

    public static void j(float f7, ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(new OvershootInterpolator(f7));
    }

    public static void k(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        k2Var.presentFragment(new ThemeActivity(i10));
    }

    public static void l(ViewPropertyAnimator viewPropertyAnimator, float f7, long j10) {
        viewPropertyAnimator.alpha(f7).setDuration(j10).start();
    }

    public static void m(ViewPropertyAnimator viewPropertyAnimator, org.telegram.ui.Components.gr grVar, long j10) {
        viewPropertyAnimator.setInterpolator(grVar).setDuration(j10).start();
    }

    public static void n(TextView textView, int i10, float f7) {
        textView.setTypeface(i0.o());
        textView.setTextSize(i10, f7);
    }

    public static void o(TextView textView, int i10, float f7, int i11, int i12) {
        textView.setTextSize(i10, f7);
        textView.setLines(i11);
        textView.setMaxLines(i12);
    }

    public static void p(TextView textView, int i10, org.telegram.ui.ActionBar.p6 p6Var, String str, int i11) {
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        textView.setText(cd.L0(i11, str));
    }

    public static void q(String str, int i10, StringBuilder sb2, String str2) {
        sb2.append(cd.L0(i10, str));
        sb2.append(str2);
    }

    public static void r(String str, int i10, org.telegram.ui.Components.cc ccVar) {
        ccVar.i(cd.L0(i10, str)).j();
    }

    public static void s(String str, org.telegram.ui.Components.cc ccVar, int i10, int i11) {
        ccVar.Q(i10, i11, i0.W2(str)).j();
    }

    public static void t(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        f8.d(sb2.toString());
    }

    public static void u(vg.f fVar, float f7, float f10) {
        fVar.q(f7);
        fVar.p(i0.L(f10));
    }

    public static float v(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 / f10) * f11);
    }

    public static int w(float f7, int i10, int i11) {
        return i11 - (i0.L(f7) + i10);
    }

    public static float x(float f7, float f10, float f11, float f12) {
        return (f11 - (f7 / f10)) * f12;
    }

    public static int y(float f7, int i10, int i11) {
        return (i10 - i0.L(f7)) / i11;
    }

    public static float z(float f7, float f10, float f11, float f12) {
        return Math.max(f12, Math.min(f11, f7 + f10));
    }
}
