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
public abstract class er extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.xt0 d2;
    public static final org.telegram.ui.Components.xt0 f47370e2;
    public static final org.telegram.ui.Components.xt0 f47371f2;
    public static final org.telegram.ui.Components.xt0 f47372g2;
    public float M1;
    public float N1;
    public float O1;
    public float P1;
    public r1.g Q1;
    public r1.g R1;
    public r1.g S1;
    public r1.g T1;
    public boolean U1;
    public float V1;
    public float W1;
    public boolean X1;
    public Bitmap Y1;
    public Canvas Z1;
    public ValueAnimator f47373a2;
    public ValueAnimator f47374b2;
    public boolean f47375c2;

    static {
        org.telegram.ui.Components.xt0 xt0Var = new org.telegram.ui.Components.xt0(new cr(0), new cr(1));
        xt0Var.f42218c = 100.0f;
        d2 = xt0Var;
        org.telegram.ui.Components.xt0 xt0Var2 = new org.telegram.ui.Components.xt0(new cr(2), new cr(3));
        xt0Var2.f42218c = 100.0f;
        f47370e2 = xt0Var2;
        org.telegram.ui.Components.xt0 xt0Var3 = new org.telegram.ui.Components.xt0(new cr(4), new cr(5));
        xt0Var3.f42218c = 100.0f;
        f47371f2 = xt0Var3;
        org.telegram.ui.Components.xt0 xt0Var4 = new org.telegram.ui.Components.xt0(new cr(6), new cr(7));
        xt0Var4.f42218c = 100.0f;
        f47372g2 = xt0Var4;
    }

    public static void C(r1.g gVar, float f10) {
        r1.h hVar = gVar.f56368m;
        if (hVar != null && f10 == ((float) hVar.f56376i)) {
            return;
        }
        gVar.d();
        r1.h hVar2 = new r1.h(f10);
        hVar2.b(400.0f);
        hVar2.a(1.0f);
        hVar2.f56376i = f10;
        gVar.f56368m = hVar2;
        gVar.h();
    }

    public final void A(float f10) {
        C(this.R1, f10 * 100.0f);
    }

    public final void B(float f10) {
        C(this.Q1, f10 * 100.0f);
    }

    public final void D(float f10) {
        C(this.S1, f10 * 100.0f);
        r1.g gVar = this.T1;
        gVar.d();
        if (f10 != 0.0f) {
            r1.h p10 = org.telegram.ui.Cells.c0.p(1.0f, 500.0f, 0.75f);
            p10.f56376i = 100.0f;
            gVar.f56368m = p10;
            gVar.f56359b = 100.0f;
            gVar.f56360c = true;
            gVar.f56358a = 4000.0f;
            gVar.h();
            return;
        }
        this.P1 = 1.0f;
    }

    public final void E() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.Y1;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.Y1.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.Y1;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.Y1 = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.Z1 = new Canvas(this.Y1);
            }
            this.Y1.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.Z1.save();
            this.Z1.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.Z1);
            this.Z1.restore();
            this.W1 = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f47374b2 = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 7));
            this.f47374b2.setDuration(220L);
            this.f47374b2.start();
        }
    }

    public float getErrorProgress() {
        return this.N1;
    }

    public float getFocusedProgress() {
        return this.M1;
    }

    public float getSuccessProgress() {
        return this.O1;
    }

    public float getSuccessScaleProgress() {
        return this.P1;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q1.d();
        this.R1.d();
    }

    @Override
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        super.onFocusChanged(z10, i7, rect);
        if (!isFocused()) {
            m();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        br brVar;
        ClipDescription primaryClipDescription;
        String str;
        int i7;
        if (motionEvent.getAction() == 0) {
            this.f47375c2 = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof br) {
                brVar = (br) getParent();
            } else {
                brVar = null;
            }
            if (motionEvent.getAction() == 1 && this.f47375c2) {
                if (isFocused() && brVar != null) {
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
                        startActionMode(new dr(this));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.U1) {
                    org.telegram.messenger.g0.I3(this);
                }
            }
            this.f47375c2 = false;
        }
        return this.f47375c2;
    }

    @Override
    public final boolean requestFocus(int i7, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i7, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.U1 = z10;
        setShowSoftInputOnFocus(z10);
    }
}
