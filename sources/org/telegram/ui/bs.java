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
import org.telegram.ui.Components.EditTextBoldCursor;
public abstract class bs extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.pu0 X1;
    public static final org.telegram.ui.Components.pu0 Y1;
    public static final org.telegram.ui.Components.pu0 Z1;
    public static final org.telegram.ui.Components.pu0 a2;
    public float G1;
    public float H1;
    public float I1;
    public float J1;
    public o1.j K1;
    public o1.j L1;
    public o1.j M1;
    public o1.j N1;
    public boolean O1;
    public float P1;
    public float Q1;
    public boolean R1;
    public Bitmap S1;
    public Canvas T1;
    public ValueAnimator U1;
    public ValueAnimator V1;
    public boolean W1;

    static {
        org.telegram.ui.Components.pu0 pu0Var = new org.telegram.ui.Components.pu0(new org.telegram.ui.Cells.m5(9), new org.telegram.ui.Cells.m5(10));
        pu0Var.f29554c = 100.0f;
        X1 = pu0Var;
        org.telegram.ui.Components.pu0 pu0Var2 = new org.telegram.ui.Components.pu0(new org.telegram.ui.Cells.m5(11), new org.telegram.ui.Cells.m5(12));
        pu0Var2.f29554c = 100.0f;
        Y1 = pu0Var2;
        org.telegram.ui.Components.pu0 pu0Var3 = new org.telegram.ui.Components.pu0(new org.telegram.ui.Cells.m5(13), new org.telegram.ui.Cells.m5(14));
        pu0Var3.f29554c = 100.0f;
        Z1 = pu0Var3;
        org.telegram.ui.Components.pu0 pu0Var4 = new org.telegram.ui.Components.pu0(new org.telegram.ui.Cells.m5(15), new org.telegram.ui.Cells.m5(16));
        pu0Var4.f29554c = 100.0f;
        a2 = pu0Var4;
    }

    public static void B(o1.j jVar, float f7) {
        o1.k kVar = jVar.f13958m;
        if (kVar != null && f7 == ((float) kVar.f13965i)) {
            return;
        }
        jVar.d();
        o1.k kVar2 = new o1.k(f7);
        kVar2.b(400.0f);
        kVar2.a(1.0f);
        kVar2.f13965i = f7;
        jVar.f13958m = kVar2;
        jVar.h();
    }

    public final void A(float f7) {
        B(this.K1, f7 * 100.0f);
    }

    public final void C(float f7) {
        B(this.M1, f7 * 100.0f);
        o1.j jVar = this.N1;
        jVar.d();
        if (f7 != 0.0f) {
            o1.k p5 = org.telegram.ui.Cells.f1.p(1.0f, 500.0f, 0.75f);
            p5.f13965i = 100.0f;
            jVar.f13958m = p5;
            jVar.f13950b = 100.0f;
            jVar.f13951c = true;
            jVar.f13949a = 4000.0f;
            jVar.h();
            return;
        }
        this.J1 = 1.0f;
    }

    public final void D() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.S1;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.S1.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.S1;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.S1 = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.T1 = new Canvas(this.S1);
            }
            this.S1.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.T1.save();
            this.T1.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.T1);
            this.T1.restore();
            this.Q1 = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V1 = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 7));
            this.V1.setDuration(220L);
            this.V1.start();
        }
    }

    public float getErrorProgress() {
        return this.H1;
    }

    public float getFocusedProgress() {
        return this.G1;
    }

    public float getSuccessProgress() {
        return this.I1;
    }

    public float getSuccessScaleProgress() {
        return this.J1;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K1.d();
        this.L1.d();
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!isFocused()) {
            m();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zr zrVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.W1 = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof zr) {
                zrVar = (zr) getParent();
            } else {
                zrVar = null;
            }
            if (motionEvent.getAction() == 1 && this.W1) {
                if (isFocused() && zrVar != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService(ClipboardManager.class);
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
                if (this.O1) {
                    org.telegram.messenger.i0.J3(this);
                }
            }
            this.W1 = false;
        }
        return this.W1;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i10, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.O1 = z10;
        setShowSoftInputOnFocus(z10);
    }

    public final void z(float f7) {
        B(this.L1, f7 * 100.0f);
    }
}
