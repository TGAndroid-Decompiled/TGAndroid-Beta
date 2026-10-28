package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.zip.CRC32;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
public abstract class kb1 {
    public static final byte[] f29923a = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static RectF f29924b;

    public static RelativeLayout.LayoutParams A(int i10, int i11) {
        return z(0, i10, 0, i11, -1);
    }

    public static FrameLayout.LayoutParams B(int i10, int i11, int i12) {
        return new FrameLayout.LayoutParams(I(i10), I(i11), i12);
    }

    public static ArrayList C(org.telegram.ui.ActionBar.g7 g7Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, i10));
        }
        return arrayList;
    }

    public static int D(g41 g41Var) {
        g41Var.getClass();
        return Math.max(1, (int) Math.ceil(0.5f * AndroidUtilities.density)) + (((int) Math.ceil(1.9f * AndroidUtilities.density)) * 2);
    }

    public static int E() {
        if (LocaleController.isRTL) {
            return 5;
        }
        return 3;
    }

    public static int I(float f7) {
        if (f7 >= 0.0f) {
            f7 = AndroidUtilities.dp(f7);
        }
        return (int) f7;
    }

    public static aa0 K(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        int i11 = org.telegram.ui.ActionBar.y6.gc;
        aa0 aa0Var = new aa0(context, null);
        aa0Var.setTextSize(1, f7);
        org.telegram.ui.ActionBar.f7.V(aa0Var, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, i11, u6Var);
        if (z10) {
            aa0Var.setTypeface(AndroidUtilities.bold());
        }
        return aa0Var;
    }

    public static TextView L(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f7);
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        if (z10) {
            textView.setTypeface(AndroidUtilities.bold());
        }
        return textView;
    }

    public static void R(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 >>> 24);
        bArr[i10 + 1] = (byte) (j10 >>> 16);
        bArr[i10 + 2] = (byte) (j10 >>> 8);
        bArr[i10 + 3] = (byte) j10;
    }

    public static void T() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (u40 u40Var : u40.values()) {
            edit.remove(u40Var.f33228a);
        }
        edit.apply();
    }

    public static void U(View view, float f7, float f10, float f11, float f12) {
        view.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), AndroidUtilities.dp(f12));
    }

    public static void V(Canvas canvas, Bitmap bitmap, int i10, float f7, float f10, int i11, int i12, Paint paint) {
        int min = Math.min(i10, bitmap.getWidth());
        int i13 = (int) f7;
        int i14 = (int) f10;
        canvas.drawBitmap(bitmap, new Rect(0, i11, min, i11 + i12), new Rect(i13, i14, min + i13, i12 + i14), paint);
    }

    public static boolean W(int i10, String str, byte[] bArr) {
        for (int i11 = 0; i11 < 4; i11++) {
            if (bArr[i10 + i11] != str.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, String str, byte[] bArr, CRC32 crc32) {
        byte[] bArr2 = new byte[8];
        R(bArr2, 0, bArr.length);
        for (int i10 = 0; i10 < 4; i10++) {
            bArr2[i10 + 4] = (byte) str.charAt(i10);
        }
        byteArrayOutputStream.write(bArr2, 0, 8);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        crc32.reset();
        crc32.update(bArr2, 4, 4);
        crc32.update(bArr, 0, bArr.length);
        byte[] bArr3 = new byte[4];
        R(bArr3, 0, crc32.getValue());
        byteArrayOutputStream.write(bArr3, 0, 4);
    }

    public static void a(Path path, RectF rectF, float f7) {
        if (path == null) {
            return;
        }
        if (f29924b == null) {
            f29924b = new RectF();
        }
        float f10 = 2.0f * f7;
        path.rewind();
        f29924b.set(0.0f, -rectF.height(), f10, (-rectF.height()) + f10);
        path.arcTo(f29924b, 180.0f, 90.0f);
        f29924b.set(rectF.width() - f10, -rectF.height(), rectF.width(), (-rectF.height()) + f10);
        path.arcTo(f29924b, 270.0f, 90.0f);
        f29924b.set(rectF.width() - f10, -f10, rectF.width(), 0.0f);
        path.arcTo(f29924b, 0.0f, 90.0f);
        path.quadTo(f7, 0.0f, f7, 0.0f);
        path.cubicTo(AndroidUtilities.dp(7.62f), AndroidUtilities.dp(-0.5f), AndroidUtilities.dp(5.807f), AndroidUtilities.dp(-1.502f), AndroidUtilities.dp(6.02f), AndroidUtilities.dp(-1.386f));
        path.cubicTo(AndroidUtilities.dp(4.814f), AndroidUtilities.dp(-0.81f), AndroidUtilities.dp(2.706f), AndroidUtilities.dp(-0.133f), AndroidUtilities.dp(3.6f), AndroidUtilities.dp(-0.44f));
        path.cubicTo(AndroidUtilities.dp(1.004f), AndroidUtilities.dp(-0.206f), AndroidUtilities.dp(-0.047f), AndroidUtilities.dp(-0.32f), AndroidUtilities.dp(0.247f), AndroidUtilities.dp(-0.29f));
        path.cubicTo(AndroidUtilities.dp(-0.334f), AndroidUtilities.dp(-1.571f), 0.0f, AndroidUtilities.dp(-1.155f), AndroidUtilities.dp(-0.06f), AndroidUtilities.dp(-1.154f));
        path.cubicTo(AndroidUtilities.dp(1.083f), AndroidUtilities.dp(-2.123f), AndroidUtilities.dp(1.667f), AndroidUtilities.dp(-3.667f), AndroidUtilities.dp(1.453f), AndroidUtilities.dp(-3.12f));
        path.cubicTo(AndroidUtilities.dp(2.1f), AndroidUtilities.dp(-4.793f), AndroidUtilities.dp(1.24f), AndroidUtilities.dp(-6.267f), AndroidUtilities.dp(1.67f), AndroidUtilities.dp(-5.53f));
        float f11 = -f7;
        path.quadTo(0.0f, AndroidUtilities.dp(2.187f) + f11, 0.0f, f11);
        path.close();
        path.offset(rectF.left, rectF.bottom);
    }

    public static void b(View view) {
        c(view, 0.1f, 1.5f);
    }

    public static void c(View view, float f7, float f10) {
        if (view == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        float f11 = 1.0f - f7;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f11);
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property2, f11));
        animatorSet.setDuration(80L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, 1.0f), ObjectAnimator.ofFloat(view, property2, 1.0f));
        animatorSet2.setInterpolator(new OvershootInterpolator(f10));
        animatorSet2.setDuration(350L);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842919}, animatorSet);
        stateListAnimator.addState(new int[0], animatorSet2);
        view.setStateListAnimator(stateListAnimator);
    }

    public static long d(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static FrameLayout.LayoutParams e(float f7, float f10, int i10) {
        return new FrameLayout.LayoutParams(I(f7), I(f10), i10);
    }

    public static FrameLayout.LayoutParams f(float f7, float f10, int i10, float f11, float f12, float f13, float f14) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(I(f7), I(f10), i10);
        layoutParams.setMargins(AndroidUtilities.dp(f11), AndroidUtilities.dp(f12), AndroidUtilities.dp(f13), AndroidUtilities.dp(f14));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams g(float f7, int i10) {
        return new FrameLayout.LayoutParams(I(i10), I(f7));
    }

    public static FrameLayout.LayoutParams h(int i10, float f7, int i11, float f10, float f11, float f12, float f13) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(I(i10), I(f7), i11);
        layoutParams.setMargins(AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), AndroidUtilities.dp(f12), AndroidUtilities.dp(f13));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams i(int i10, int i11, int i12) {
        return new FrameLayout.LayoutParams(I(i10), I(i11), i12);
    }

    public static FrameLayout.LayoutParams j(float f7, int i10, int i11, int i12, int i13, int i14) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(I(-1), I(f7), i10);
        layoutParams.setMargins(i11, i12, i13, i14);
        return layoutParams;
    }

    public static FrameLayout.LayoutParams k() {
        return g(-1.0f, -1);
    }

    public static FrameLayout.LayoutParams l(float f7, float f10, int i10) {
        return new FrameLayout.LayoutParams(I(f7), I(f10), Gravity.getAbsoluteGravity(i10, LocaleController.isRTL ? 1 : 0));
    }

    public static FrameLayout.LayoutParams m(float f7, float f10, int i10, float f11, float f12, float f13, float f14) {
        float f15;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(I(f7), I(f10), Gravity.getAbsoluteGravity(i10, LocaleController.isRTL ? 1 : 0));
        if (LocaleController.isRTL) {
            f15 = f13;
        } else {
            f15 = f11;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f15);
        layoutParams.topMargin = AndroidUtilities.dp(f12);
        if (!LocaleController.isRTL) {
            f11 = f13;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f11);
        layoutParams.bottomMargin = AndroidUtilities.dp(f14);
        return layoutParams;
    }

    public static LinearLayout.LayoutParams n(float f7, float f10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(I(-2.0f), I(20.66f));
        layoutParams.setMargins(AndroidUtilities.dp(f7), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(0.0f));
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams o(float f7, float f10, float f11, float f12, int i10, int i11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(I(i10), I(i11));
        layoutParams.setMargins(AndroidUtilities.dp(f7), AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), AndroidUtilities.dp(f12));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams p(float f7, int i10, int i11) {
        return new LinearLayout.LayoutParams(I(i10), I(i11), f7);
    }

    public static LinearLayout.LayoutParams q(float f7, int i10, int i11, int i12, int i13, int i14) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(I(i10), I(i11), f7);
        layoutParams.setMargins(AndroidUtilities.dp(i12), AndroidUtilities.dp(0), AndroidUtilities.dp(i13), AndroidUtilities.dp(i14));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams r(int i10, int i11) {
        return new LinearLayout.LayoutParams(I(i10), I(i11));
    }

    public static LinearLayout.LayoutParams s(int i10, int i11, float f7, int i12) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(I(i10), I(i11), f7);
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams t(int i10, int i11, float f7, int i12, int i13, int i14, int i15, int i16) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(I(i10), I(i11), f7);
        layoutParams.setMargins(AndroidUtilities.dp(i13), AndroidUtilities.dp(i14), AndroidUtilities.dp(i15), AndroidUtilities.dp(i16));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams u(int i10, int i11, int i12) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(I(i10), I(i11));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams v(int i10, int i11, int i12, float f7, float f10, float f11, float f12) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(I(i10), I(i11));
        layoutParams.setMargins(AndroidUtilities.dp(f7), AndroidUtilities.dp(f10), AndroidUtilities.dp(f11), AndroidUtilities.dp(f12));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams w(int i10, int i11, int i12, int i13, int i14, float f7, int i15) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(I(i10), I(f7));
        layoutParams.setMargins(AndroidUtilities.dp(i12), AndroidUtilities.dp(i13), AndroidUtilities.dp(i14), AndroidUtilities.dp(i15));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams x(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(I(i10), I(i11));
        layoutParams.setMargins(AndroidUtilities.dp(i13), AndroidUtilities.dp(i14), AndroidUtilities.dp(i15), AndroidUtilities.dp(i16));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams y(float f7, float f10, int i10, float f11, float f12, float f13, float f14) {
        float f15;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(I(f7), I(f10), Gravity.getAbsoluteGravity(i10, LocaleController.isRTL ? 1 : 0));
        if (LocaleController.isRTL) {
            f15 = f13;
        } else {
            f15 = f11;
        }
        layoutParams.leftMargin = AndroidUtilities.dp(f15);
        layoutParams.topMargin = AndroidUtilities.dp(f12);
        if (!LocaleController.isRTL) {
            f11 = f13;
        }
        layoutParams.rightMargin = AndroidUtilities.dp(f11);
        layoutParams.bottomMargin = AndroidUtilities.dp(f14);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams z(int i10, float f7, int i11, float f10, int i12) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(I(f7), I(f10));
        if (i12 >= 0) {
            layoutParams.addRule(i12);
        }
        layoutParams.leftMargin = AndroidUtilities.dp(i10);
        float f11 = 0;
        layoutParams.topMargin = AndroidUtilities.dp(f11);
        layoutParams.rightMargin = AndroidUtilities.dp(i11);
        layoutParams.bottomMargin = AndroidUtilities.dp(f11);
        return layoutParams;
    }

    public abstract int F(k01 k01Var, int i10);

    public i01 G() {
        return new i01();
    }

    public abstract int H(k01 k01Var, int i10);

    public abstract void N();

    public void M() {
    }

    public void O() {
    }

    public void Q() {
    }

    public void S(View view) {
    }

    public int J(int i10, int i11) {
        return i10;
    }

    public void P(int i10, int i11) {
    }
}
