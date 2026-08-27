package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

public class NumberTextView extends View {

    public final ArrayList f26408a;

    public final ArrayList f26409b;

    public final TextPaint f26410c;
    public ObjectAnimator d;

    public float f26411e;

    public int f26412f;
    public boolean h;

    public boolean f26413n;

    public float f26414r;

    public float f26415s;

    public NumberTextView(Context context) {
        super(context);
        this.f26408a = new ArrayList();
        this.f26409b = new ArrayList();
        this.f26410c = new TextPaint(1);
        this.f26411e = 0.0f;
        this.f26412f = 1;
    }

    public final void a(int i10, boolean z10) {
        String string;
        String string2;
        boolean z11;
        int i11;
        String str;
        if (this.f26412f == i10 && z10) {
            return;
        }
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.d = null;
        }
        ArrayList arrayList = this.f26409b;
        arrayList.clear();
        ArrayList arrayList2 = this.f26408a;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.h) {
            Locale locale = Locale.US;
            string = i0.a.k(this.f26412f, "#");
            string2 = i0.a.k(i10, "#");
            if (i10 < this.f26412f) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            Locale locale2 = Locale.US;
            int i12 = this.f26412f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i10);
            string2 = sb3.toString();
            if (i10 > this.f26412f) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        TextPaint textPaint = this.f26410c;
        this.f26414r = textPaint.measureText(string2);
        float fMeasureText = textPaint.measureText(string);
        this.f26415s = fMeasureText;
        boolean z12 = this.f26413n && this.f26414r != fMeasureText;
        this.f26412f = i10;
        this.f26411e = 0.0f;
        int i13 = 0;
        while (i13 < string2.length()) {
            int i14 = i13 + 1;
            String strSubstring = string2.substring(i13, i14);
            String strSubstring2 = (arrayList.isEmpty() || i13 >= string.length()) ? null : string.substring(i13, i14);
            if (z12 || strSubstring2 == null || !strSubstring2.equals(strSubstring)) {
                if (z12 && strSubstring2 == null) {
                    i11 = i14;
                    str = strSubstring;
                    arrayList.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    i11 = i14;
                    str = strSubstring;
                }
                arrayList2.add(new StaticLayout(str, textPaint, (int) Math.ceil(textPaint.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList2.add((StaticLayout) arrayList.get(i13));
                arrayList.set(i13, null);
                i11 = i14;
            }
            i13 = i11;
        }
        if (z10 && !arrayList.isEmpty()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z11 ? -1.0f : 1.0f, 0.0f);
            this.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(this.h ? 180L : 150L);
            this.d.addListener(new sz(this, 7));
            this.d.start();
        }
        invalidate();
    }

    public float getOldTextWidth() {
        return this.f26415s;
    }

    public float getProgress() {
        return this.f26411e;
    }

    public float getTextWidth() {
        return this.f26414r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth;
        float lineWidth;
        ArrayList arrayList = this.f26408a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        float fDp = this.h ? AndroidUtilities.dp(4.0f) : height;
        if (this.f26413n) {
            measuredWidth = (getMeasuredWidth() - this.f26414r) / 2.0f;
            lineWidth = ((getMeasuredWidth() - this.f26415s) / 2.0f) - measuredWidth;
        } else {
            measuredWidth = 0.0f;
            lineWidth = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + measuredWidth, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f26409b;
        int iMax = Math.max(size, arrayList2.size());
        int i10 = 0;
        while (i10 < iMax) {
            canvas.save();
            StaticLayout staticLayout = i10 < arrayList2.size() ? (StaticLayout) arrayList2.get(i10) : null;
            StaticLayout staticLayout2 = i10 < arrayList.size() ? (StaticLayout) arrayList.get(i10) : null;
            float f10 = this.f26411e;
            TextPaint textPaint = this.f26410c;
            if (f10 > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f10 * 255.0f));
                    canvas.save();
                    canvas.translate(lineWidth, (this.f26411e - 1.0f) * fDp);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.f26411e) * 255.0f));
                        canvas.translate(0.0f, this.f26411e * fDp);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f10 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f10) * 255.0f));
                    canvas.save();
                    canvas.translate(lineWidth, (this.f26411e + 1.0f) * fDp);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i10 == iMax - 1 || staticLayout != null) {
                        textPaint.setAlpha((int) ((this.f26411e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.f26411e * fDp);
                    } else {
                        textPaint.setAlpha(255);
                    }
                }
            } else if (staticLayout2 != null) {
                textPaint.setAlpha(255);
            }
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
            canvas.translate(staticLayout2 != null ? staticLayout2.getLineWidth(0) : staticLayout.getLineWidth(0) + AndroidUtilities.dp(1.0f), 0.0f);
            if (staticLayout2 != null && staticLayout != null) {
                lineWidth = (staticLayout.getLineWidth(0) - staticLayout2.getLineWidth(0)) + lineWidth;
            }
            i10++;
        }
        canvas.restore();
    }

    public void setCenterAlign(boolean z10) {
        this.f26413n = z10;
    }

    public void setProgress(float f10) {
        if (this.f26411e == f10) {
            return;
        }
        this.f26411e = f10;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f26410c.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f26410c.setTextSize(AndroidUtilities.dp(i10));
        this.f26409b.clear();
        this.f26408a.clear();
        a(this.f26412f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f26410c.setTypeface(typeface);
        this.f26409b.clear();
        this.f26408a.clear();
        a(this.f26412f, false);
    }

    public void setOnTextWidthProgressChangedListener(gc0 gc0Var) {
    }
}
