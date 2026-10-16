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
public abstract class ks extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.hw0 I;
    public static final org.telegram.ui.Components.hw0 J;
    public static final org.telegram.ui.Components.hw0 K;
    public static final org.telegram.ui.Components.hw0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float f37500b;
    public float f37501c;
    public float d;
    public float e;
    public o1.k f37502f;
    public o1.k h;
    public o1.k f37503n;
    public o1.k f37504r;
    public boolean f37505s;
    public float v;
    public float f37506w;
    public boolean f37507x;
    public Bitmap f37508y;

    static {
        org.telegram.ui.Components.hw0 hw0Var = new org.telegram.ui.Components.hw0(new m4.v0(24), new m4.v0(25));
        hw0Var.f25423c = 100.0f;
        I = hw0Var;
        org.telegram.ui.Components.hw0 hw0Var2 = new org.telegram.ui.Components.hw0(new m4.v0(26), new m4.v0(27));
        hw0Var2.f25423c = 100.0f;
        J = hw0Var2;
        org.telegram.ui.Components.hw0 hw0Var3 = new org.telegram.ui.Components.hw0(new m4.v0(28), new m4.v0(29));
        hw0Var3.f25423c = 100.0f;
        K = hw0Var3;
        org.telegram.ui.Components.hw0 hw0Var4 = new org.telegram.ui.Components.hw0(new is(0), new is(1));
        hw0Var4.f25423c = 100.0f;
        L = hw0Var4;
    }

    public static void k(o1.k kVar, float f7) {
        o1.l lVar = kVar.f16161u;
        if (lVar != null && f7 == ((float) lVar.f16167i)) {
            return;
        }
        kVar.c();
        o1.l lVar2 = new o1.l(f7);
        lVar2.b(400.0f);
        lVar2.a(1.0f);
        lVar2.f16167i = f7;
        kVar.f16161u = lVar2;
        kVar.h();
    }

    public float getErrorProgress() {
        return this.f37501c;
    }

    public float getFocusedProgress() {
        return this.f37500b;
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
        k(this.f37502f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.f37503n, f7 * 100.0f);
        o1.k kVar = this.f37504r;
        kVar.c();
        if (f7 != 0.0f) {
            o1.l j10 = org.telegram.ui.Cells.c1.j(1.0f, 500.0f, 0.75f);
            j10.f16167i = 100.0f;
            kVar.f16161u = j10;
            kVar.f16152b = 100.0f;
            kVar.f16153c = true;
            kVar.f16151a = 4000.0f;
            kVar.h();
            return;
        }
        this.e = 1.0f;
    }

    public final void m() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.f37508y;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.f37508y.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.f37508y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f37508y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.E = new Canvas(this.f37508y);
            }
            this.f37508y.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.E.save();
            this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.E);
            this.E.restore();
            this.f37506w = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 8));
            this.G.setDuration(220L);
            this.G.start();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37502f.c();
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
        hs hsVar;
        ClipDescription primaryClipDescription;
        String str;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.H = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof hs) {
                hsVar = (hs) getParent();
            } else {
                hsVar = null;
            }
            if (motionEvent.getAction() == 1 && this.H) {
                if (isFocused() && hsVar != null) {
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
                        startActionMode(new js(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.f37505s) {
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
        this.f37505s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
