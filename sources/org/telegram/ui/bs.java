package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public abstract class bs extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.iv0 F;
    public static final org.telegram.ui.Components.iv0 G;
    public static final org.telegram.ui.Components.iv0 H;
    public static final org.telegram.ui.Components.iv0 I;
    public Canvas B;
    public ValueAnimator C;
    public ValueAnimator D;
    public boolean E;
    public float f33018b;
    public float f33019c;
    public float d;
    public float e;
    public o1.j f33020f;
    public o1.j h;
    public o1.j f33021n;
    public o1.j f33022r;
    public boolean f33023s;
    public float v;
    public float f33024w;
    public boolean f33025x;
    public Bitmap f33026y;

    static {
        org.telegram.ui.Components.iv0 iv0Var = new org.telegram.ui.Components.iv0(new m.j0(25), new m.j0(26));
        iv0Var.f25791c = 100.0f;
        F = iv0Var;
        org.telegram.ui.Components.iv0 iv0Var2 = new org.telegram.ui.Components.iv0(new m.j0(27), new m.j0(28));
        iv0Var2.f25791c = 100.0f;
        G = iv0Var2;
        org.telegram.ui.Components.iv0 iv0Var3 = new org.telegram.ui.Components.iv0(new m.j0(29), new zr(0));
        iv0Var3.f25791c = 100.0f;
        H = iv0Var3;
        org.telegram.ui.Components.iv0 iv0Var4 = new org.telegram.ui.Components.iv0(new zr(1), new zr(2));
        iv0Var4.f25791c = 100.0f;
        I = iv0Var4;
    }

    public static void k(o1.j jVar, float f10) {
        o1.k kVar = jVar.f16198u;
        if (kVar != null && f10 == ((float) kVar.f16204i)) {
            return;
        }
        jVar.c();
        o1.k kVar2 = new o1.k(f10);
        kVar2.b(400.0f);
        kVar2.a(1.0f);
        kVar2.f16204i = f10;
        jVar.f16198u = kVar2;
        jVar.f();
    }

    public float getErrorProgress() {
        return this.f33019c;
    }

    public float getFocusedProgress() {
        return this.f33018b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.e;
    }

    public final void i(float f10) {
        k(this.h, f10 * 100.0f);
    }

    public final void j(float f10) {
        k(this.f33020f, f10 * 100.0f);
    }

    public final void l(float f10) {
        k(this.f33021n, f10 * 100.0f);
        o1.j jVar = this.f33022r;
        jVar.c();
        if (f10 != 0.0f) {
            o1.k n10 = yh.n(1.0f, 500.0f, 0.75f);
            n10.f16204i = 100.0f;
            jVar.f16198u = n10;
            jVar.f16190b = 100.0f;
            jVar.f16191c = true;
            jVar.f16189a = 4000.0f;
            jVar.f();
            return;
        }
        this.e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f33026y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f33026y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f33026y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f33026y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.B = new Canvas(this.f33026y);
            }
            this.f33026y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.B.save();
            this.B.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.B);
            this.B.restore();
            this.f33024w = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 8));
            this.D.setDuration(220L);
            this.D.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33020f.c();
        this.h.c();
    }

    @Override
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        super.onFocusChanged(z4, i10, rect);
        if (!isFocused()) {
            hideActionMode();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yr yrVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.E = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof yr) {
                yrVar = (yr) getParent();
            } else {
                yrVar = null;
            }
            if (motionEvent.getAction() == 1 && this.E) {
                if (isFocused() && yrVar != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) f0.f.f(getContext(), ClipboardManager.class);
                    if (clipboardManager == null || clipboardManager.getPrimaryClipDescription() == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                        return false;
                    }
                    primaryClipDescription.hasMimeType("text/plain");
                    ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    if (itemAt != null && itemAt.getText() != null) {
                        str = itemAt.getText().toString();
                    } else {
                        str = "";
                    }
                    try {
                        i10 = Integer.parseInt(str);
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    if (i10 > 0) {
                        startActionMode(new as(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f33023s) {
                    AndroidUtilities.showKeyboard(this);
                }
            }
            this.E = false;
        }
        return this.E;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i10, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z4) {
        this.f33023s = z4;
        setShowSoftInputOnFocus(z4);
    }
}
