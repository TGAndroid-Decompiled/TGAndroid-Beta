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
public abstract class es extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.lw0 I;
    public static final org.telegram.ui.Components.lw0 J;
    public static final org.telegram.ui.Components.lw0 K;
    public static final org.telegram.ui.Components.lw0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float f37317b;
    public float f37318c;
    public float d;
    public float f37319e;
    public o1.k f37320f;
    public o1.k h;
    public o1.k f37321n;
    public o1.k f37322r;
    public boolean f37323s;
    public float v;
    public float f37324w;
    public boolean f37325x;
    public Bitmap f37326y;

    static {
        org.telegram.ui.Components.lw0 lw0Var = new org.telegram.ui.Components.lw0(new nr(1), new nr(2));
        lw0Var.f28618c = 100.0f;
        I = lw0Var;
        org.telegram.ui.Components.lw0 lw0Var2 = new org.telegram.ui.Components.lw0(new nr(3), new nr(4));
        lw0Var2.f28618c = 100.0f;
        J = lw0Var2;
        org.telegram.ui.Components.lw0 lw0Var3 = new org.telegram.ui.Components.lw0(new nr(5), new nr(6));
        lw0Var3.f28618c = 100.0f;
        K = lw0Var3;
        org.telegram.ui.Components.lw0 lw0Var4 = new org.telegram.ui.Components.lw0(new nr(7), new nr(8));
        lw0Var4.f28618c = 100.0f;
        L = lw0Var4;
    }

    public static void k(o1.k kVar, float f7) {
        o1.l lVar = kVar.f16938u;
        if (lVar != null && f7 == ((float) lVar.f16945i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f7);
        lVar2.b(400.0f);
        lVar2.a(1.0f);
        lVar2.f16945i = f7;
        kVar.f16938u = lVar2;
        kVar.h();
    }

    public float getErrorProgress() {
        return this.f37318c;
    }

    public float getFocusedProgress() {
        return this.f37317b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.f37319e;
    }

    public final void i(float f7) {
        k(this.h, f7 * 100.0f);
    }

    public final void j(float f7) {
        k(this.f37320f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.f37321n, f7 * 100.0f);
        o1.k kVar = this.f37322r;
        kVar.c();
        if (f7 != 0.0f) {
            o1.l j3 = org.telegram.ui.Cells.c1.j(1.0f, 500.0f, 0.75f);
            j3.f16945i = 100.0f;
            kVar.f16938u = j3;
            kVar.f16928b = 100.0f;
            kVar.f16929c = true;
            kVar.f16927a = 4000.0f;
            kVar.h();
            return;
        }
        this.f37319e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f37326y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f37326y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f37326y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f37326y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.E = new Canvas(this.f37326y);
            }
            this.f37326y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.E.save();
            this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.E);
            this.E.restore();
            this.f37324w = 0.0f;
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
        this.f37320f.c();
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
        cs csVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.H = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof cs) {
                csVar = (cs) getParent();
            } else {
                csVar = null;
            }
            if (motionEvent.getAction() == 1 && this.H) {
                if (isFocused() && csVar != null) {
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
                        startActionMode(new ds(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f37323s) {
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
        this.f37323s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
