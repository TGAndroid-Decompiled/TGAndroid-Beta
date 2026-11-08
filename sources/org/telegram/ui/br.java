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
public abstract class br extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.lt0 X1;
    public static final org.telegram.ui.Components.lt0 Y1;
    public static final org.telegram.ui.Components.lt0 Z1;
    public static final org.telegram.ui.Components.lt0 f44479a2;
    public float G1;
    public float H1;
    public float I1;
    public float J1;
    public r1.g K1;
    public r1.g L1;
    public r1.g M1;
    public r1.g N1;
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
        org.telegram.ui.Components.lt0 lt0Var = new org.telegram.ui.Components.lt0(new org.telegram.messenger.ch(25), new org.telegram.messenger.ch(26));
        lt0Var.f35790c = 100.0f;
        X1 = lt0Var;
        org.telegram.ui.Components.lt0 lt0Var2 = new org.telegram.ui.Components.lt0(new org.telegram.messenger.ch(27), new org.telegram.messenger.ch(28));
        lt0Var2.f35790c = 100.0f;
        Y1 = lt0Var2;
        org.telegram.ui.Components.lt0 lt0Var3 = new org.telegram.ui.Components.lt0(new org.telegram.messenger.ch(29), new zq(0));
        lt0Var3.f35790c = 100.0f;
        Z1 = lt0Var3;
        org.telegram.ui.Components.lt0 lt0Var4 = new org.telegram.ui.Components.lt0(new zq(1), new zq(2));
        lt0Var4.f35790c = 100.0f;
        f44479a2 = lt0Var4;
    }

    public static void B(r1.g gVar, float f10) {
        r1.h hVar = gVar.f54268m;
        if (hVar != null && f10 == ((float) hVar.f54276i)) {
            return;
        }
        gVar.d();
        r1.h hVar2 = new r1.h(f10);
        hVar2.b(400.0f);
        hVar2.a(1.0f);
        hVar2.f54276i = f10;
        gVar.f54268m = hVar2;
        gVar.h();
    }

    public final void A(float f10) {
        B(this.K1, f10 * 100.0f);
    }

    public final void C(float f10) {
        B(this.M1, f10 * 100.0f);
        r1.g gVar = this.N1;
        gVar.d();
        if (f10 != 0.0f) {
            r1.h o4 = org.telegram.ui.Cells.f1.o(1.0f, 500.0f, 0.75f);
            o4.f54276i = 100.0f;
            gVar.f54268m = o4;
            gVar.f54259b = 100.0f;
            gVar.f54260c = true;
            gVar.f54258a = 4000.0f;
            gVar.h();
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
    public final void onFocusChanged(boolean z9, int i7, Rect rect) {
        super.onFocusChanged(z9, i7, rect);
        if (!isFocused()) {
            m();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yq yqVar;
        ClipDescription primaryClipDescription;
        String str;
        int i7;
        if (motionEvent.getAction() == 0) {
            this.W1 = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof yq) {
                yqVar = (yq) getParent();
            } else {
                yqVar = null;
            }
            if (motionEvent.getAction() == 1 && this.W1) {
                if (isFocused() && yqVar != null) {
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
                        i7 = Integer.parseInt(str);
                    } catch (Exception unused) {
                        i7 = -1;
                    }
                    if (i7 > 0) {
                        startActionMode(new ar(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.O1) {
                    org.telegram.messenger.g0.K3(this);
                }
            }
            this.W1 = false;
        }
        return this.W1;
    }

    @Override
    public final boolean requestFocus(int i7, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i7, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z9) {
        this.O1 = z9;
        setShowSoftInputOnFocus(z9);
    }

    public final void z(float f10) {
        B(this.L1, f10 * 100.0f);
    }
}
