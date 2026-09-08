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
public abstract class gs extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.hv0 I;
    public static final org.telegram.ui.Components.hv0 J;
    public static final org.telegram.ui.Components.hv0 K;
    public static final org.telegram.ui.Components.hv0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float f36789b;
    public float f36790c;
    public float d;
    public float f36791e;
    public o1.k f36792f;
    public o1.k h;
    public o1.k f36793n;
    public o1.k f36794r;
    public boolean f36795s;
    public float v;
    public float f36796w;
    public boolean f36797x;
    public Bitmap f36798y;

    static {
        org.telegram.ui.Components.hv0 hv0Var = new org.telegram.ui.Components.hv0(new m4.t0(21), new m4.t0(22));
        hv0Var.f26906c = 100.0f;
        I = hv0Var;
        org.telegram.ui.Components.hv0 hv0Var2 = new org.telegram.ui.Components.hv0(new m4.t0(23), new m4.t0(24));
        hv0Var2.f26906c = 100.0f;
        J = hv0Var2;
        org.telegram.ui.Components.hv0 hv0Var3 = new org.telegram.ui.Components.hv0(new m4.t0(25), new m4.t0(26));
        hv0Var3.f26906c = 100.0f;
        K = hv0Var3;
        org.telegram.ui.Components.hv0 hv0Var4 = new org.telegram.ui.Components.hv0(new m4.t0(27), new m4.t0(28));
        hv0Var4.f26906c = 100.0f;
        L = hv0Var4;
    }

    public static void k(o1.k kVar, float f7) {
        o1.l lVar = kVar.f16852u;
        if (lVar != null && f7 == ((float) lVar.f16859i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f7);
        lVar2.b(400.0f);
        lVar2.a(1.0f);
        lVar2.f16859i = f7;
        kVar.f16852u = lVar2;
        kVar.f();
    }

    public float getErrorProgress() {
        return this.f36790c;
    }

    public float getFocusedProgress() {
        return this.f36789b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.f36791e;
    }

    public final void i(float f7) {
        k(this.h, f7 * 100.0f);
    }

    public final void j(float f7) {
        k(this.f36792f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.f36793n, f7 * 100.0f);
        o1.k kVar = this.f36794r;
        kVar.c();
        if (f7 != 0.0f) {
            o1.l l4 = org.telegram.ui.Cells.p6.l(1.0f, 500.0f, 0.75f);
            l4.f16859i = 100.0f;
            kVar.f16852u = l4;
            kVar.f16842b = 100.0f;
            kVar.f16843c = true;
            kVar.f16841a = 4000.0f;
            kVar.f();
            return;
        }
        this.f36791e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f36798y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f36798y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f36798y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f36798y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.E = new Canvas(this.f36798y);
            }
            this.f36798y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.E.save();
            this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.E);
            this.E.restore();
            this.f36796w = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 8));
            this.G.setDuration(220L);
            this.G.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36792f.c();
        this.h.c();
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!isFocused()) {
            hideActionMode();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        es esVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.H = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof es) {
                esVar = (es) getParent();
            } else {
                esVar = null;
            }
            if (motionEvent.getAction() == 1 && this.H) {
                if (isFocused() && esVar != null) {
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
                        startActionMode(new fs(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f36795s) {
                    AndroidUtilities.showKeyboard(this);
                }
            }
            this.H = false;
        }
        return this.H;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i10, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.f36795s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
