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
public abstract class hs extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.rw0 I;
    public static final org.telegram.ui.Components.rw0 J;
    public static final org.telegram.ui.Components.rw0 K;
    public static final org.telegram.ui.Components.rw0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float f38502b;
    public float f38503c;
    public float d;
    public float f38504e;
    public o1.k f38505f;
    public o1.k h;
    public o1.k f38506n;
    public o1.k f38507r;
    public boolean f38508s;
    public float v;
    public float f38509w;
    public boolean f38510x;
    public Bitmap f38511y;

    static {
        org.telegram.ui.Components.rw0 rw0Var = new org.telegram.ui.Components.rw0(new qr(1), new qr(2));
        rw0Var.f30268c = 100.0f;
        I = rw0Var;
        org.telegram.ui.Components.rw0 rw0Var2 = new org.telegram.ui.Components.rw0(new qr(3), new qr(4));
        rw0Var2.f30268c = 100.0f;
        J = rw0Var2;
        org.telegram.ui.Components.rw0 rw0Var3 = new org.telegram.ui.Components.rw0(new qr(5), new qr(6));
        rw0Var3.f30268c = 100.0f;
        K = rw0Var3;
        org.telegram.ui.Components.rw0 rw0Var4 = new org.telegram.ui.Components.rw0(new qr(7), new qr(8));
        rw0Var4.f30268c = 100.0f;
        L = rw0Var4;
    }

    public static void k(o1.k kVar, float f7) {
        o1.l lVar = kVar.f16691u;
        if (lVar != null && f7 == ((float) lVar.f16698i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f7);
        lVar2.b(400.0f);
        lVar2.a(1.0f);
        lVar2.f16698i = f7;
        kVar.f16691u = lVar2;
        kVar.h();
    }

    public float getErrorProgress() {
        return this.f38503c;
    }

    public float getFocusedProgress() {
        return this.f38502b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.f38504e;
    }

    public final void i(float f7) {
        k(this.h, f7 * 100.0f);
    }

    public final void j(float f7) {
        k(this.f38505f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.f38506n, f7 * 100.0f);
        o1.k kVar = this.f38507r;
        kVar.c();
        if (f7 != 0.0f) {
            o1.l j3 = org.telegram.ui.Cells.c1.j(1.0f, 500.0f, 0.75f);
            j3.f16698i = 100.0f;
            kVar.f16691u = j3;
            kVar.f16681b = 100.0f;
            kVar.f16682c = true;
            kVar.f16680a = 4000.0f;
            kVar.h();
            return;
        }
        this.f38504e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f38511y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f38511y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f38511y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f38511y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.E = new Canvas(this.f38511y);
            }
            this.f38511y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.E.save();
            this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.E);
            this.E.restore();
            this.f38509w = 0.0f;
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
        this.f38505f.c();
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
        fs fsVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.H = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof fs) {
                fsVar = (fs) getParent();
            } else {
                fsVar = null;
            }
            if (motionEvent.getAction() == 1 && this.H) {
                if (isFocused() && fsVar != null) {
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
                        startActionMode(new gs(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f38508s) {
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
        this.f38508s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
