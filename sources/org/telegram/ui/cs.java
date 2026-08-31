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
public abstract class cs extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.jv0 F;
    public static final org.telegram.ui.Components.jv0 G;
    public static final org.telegram.ui.Components.jv0 H;
    public static final org.telegram.ui.Components.jv0 I;
    public Canvas B;
    public ValueAnimator C;
    public ValueAnimator D;
    public boolean E;
    public float f35895b;
    public float f35896c;
    public float d;
    public float f35897e;
    public o1.j f35898f;
    public o1.j h;
    public o1.j f35899n;
    public o1.j f35900r;
    public boolean f35901s;
    public float v;
    public float f35902w;
    public boolean f35903x;
    public Bitmap f35904y;

    static {
        org.telegram.ui.Components.jv0 jv0Var = new org.telegram.ui.Components.jv0(new mh.c3(25), new mh.c3(26));
        jv0Var.f28218c = 100.0f;
        F = jv0Var;
        org.telegram.ui.Components.jv0 jv0Var2 = new org.telegram.ui.Components.jv0(new mh.c3(27), new mh.c3(28));
        jv0Var2.f28218c = 100.0f;
        G = jv0Var2;
        org.telegram.ui.Components.jv0 jv0Var3 = new org.telegram.ui.Components.jv0(new mh.c3(29), new as(0));
        jv0Var3.f28218c = 100.0f;
        H = jv0Var3;
        org.telegram.ui.Components.jv0 jv0Var4 = new org.telegram.ui.Components.jv0(new as(1), new as(2));
        jv0Var4.f28218c = 100.0f;
        I = jv0Var4;
    }

    public static void k(o1.j jVar, float f10) {
        o1.k kVar = jVar.f16336u;
        if (kVar != null && f10 == ((float) kVar.f16343i)) {
            return;
        }
        jVar.c();
        o1.k kVar2 = new o1.k(f10);
        kVar2.b(400.0f);
        kVar2.a(1.0f);
        kVar2.f16343i = f10;
        jVar.f16336u = kVar2;
        jVar.f();
    }

    public float getErrorProgress() {
        return this.f35896c;
    }

    public float getFocusedProgress() {
        return this.f35895b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.f35897e;
    }

    public final void i(float f10) {
        k(this.h, f10 * 100.0f);
    }

    public final void j(float f10) {
        k(this.f35898f, f10 * 100.0f);
    }

    public final void l(float f10) {
        k(this.f35899n, f10 * 100.0f);
        o1.j jVar = this.f35900r;
        jVar.c();
        if (f10 != 0.0f) {
            o1.k n10 = yh.n(1.0f, 500.0f, 0.75f);
            n10.f16343i = 100.0f;
            jVar.f16336u = n10;
            jVar.f16327b = 100.0f;
            jVar.f16328c = true;
            jVar.f16326a = 4000.0f;
            jVar.f();
            return;
        }
        this.f35897e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f35904y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f35904y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f35904y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f35904y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.B = new Canvas(this.f35904y);
            }
            this.f35904y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.B.save();
            this.B.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.B);
            this.B.restore();
            this.f35902w = 0.0f;
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
        this.f35898f.c();
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
        zr zrVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.E = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof zr) {
                zrVar = (zr) getParent();
            } else {
                zrVar = null;
            }
            if (motionEvent.getAction() == 1 && this.E) {
                if (isFocused() && zrVar != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) f0.e.f(getContext(), ClipboardManager.class);
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
                        startActionMode(new bs(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f35901s) {
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
        this.f35901s = z4;
        setShowSoftInputOnFocus(z4);
    }
}
