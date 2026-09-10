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
    public static final org.telegram.ui.Components.sv0 I;
    public static final org.telegram.ui.Components.sv0 J;
    public static final org.telegram.ui.Components.sv0 K;
    public static final org.telegram.ui.Components.sv0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float f33445b;
    public float f33446c;
    public float d;
    public float e;
    public o1.k f33447f;
    public o1.k h;
    public o1.k f33448n;
    public o1.k f33449r;
    public boolean f33450s;
    public float v;
    public float f33451w;
    public boolean f33452x;
    public Bitmap f33453y;

    static {
        org.telegram.ui.Components.sv0 sv0Var = new org.telegram.ui.Components.sv0(new n2.l(22), new n2.l(23));
        sv0Var.f27224c = 100.0f;
        I = sv0Var;
        org.telegram.ui.Components.sv0 sv0Var2 = new org.telegram.ui.Components.sv0(new n2.l(24), new n2.l(25));
        sv0Var2.f27224c = 100.0f;
        J = sv0Var2;
        org.telegram.ui.Components.sv0 sv0Var3 = new org.telegram.ui.Components.sv0(new n2.l(26), new n2.l(27));
        sv0Var3.f27224c = 100.0f;
        K = sv0Var3;
        org.telegram.ui.Components.sv0 sv0Var4 = new org.telegram.ui.Components.sv0(new n2.l(28), new n2.l(29));
        sv0Var4.f27224c = 100.0f;
        L = sv0Var4;
    }

    public static void k(o1.k kVar, float f7) {
        o1.l lVar = kVar.f14134u;
        if (lVar != null && f7 == ((float) lVar.f14140i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f7);
        lVar2.b(400.0f);
        lVar2.a(1.0f);
        lVar2.f14140i = f7;
        kVar.f14134u = lVar2;
        kVar.f();
    }

    public float getErrorProgress() {
        return this.f33446c;
    }

    public float getFocusedProgress() {
        return this.f33445b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.e;
    }

    public final void i(float f7) {
        k(this.h, f7 * 100.0f);
    }

    public final void j(float f7) {
        k(this.f33447f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.f33448n, f7 * 100.0f);
        o1.k kVar = this.f33449r;
        kVar.c();
        if (f7 != 0.0f) {
            o1.l l4 = org.telegram.ui.Cells.r6.l(1.0f, 500.0f, 0.75f);
            l4.f14140i = 100.0f;
            kVar.f14134u = l4;
            kVar.f14125b = 100.0f;
            kVar.f14126c = true;
            kVar.f14124a = 4000.0f;
            kVar.f();
            return;
        }
        this.e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f33453y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f33453y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f33453y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f33453y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.E = new Canvas(this.f33453y);
            }
            this.f33453y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.E.save();
            this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.E);
            this.E.restore();
            this.f33451w = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 8));
            this.G.setDuration(220L);
            this.G.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33447f.c();
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
                        startActionMode(new gs(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f33450s) {
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
        this.f33450s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
