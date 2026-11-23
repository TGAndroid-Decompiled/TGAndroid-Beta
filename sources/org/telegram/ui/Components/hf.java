package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hf extends lg {
    public boolean f35722g2;
    public final Paint f35723h2;
    public LinearGradient f35724i2;
    public final Matrix f35725j2;
    public float f35726k2;
    public float f35727l2;
    public boolean f35728m2;
    public final ChatActivityEnterView f35729n2;

    public hf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(chatActivityEnterView, context, i6Var);
        this.f35729n2 = chatActivityEnterView;
        this.f35722g2 = true;
        this.f35723h2 = new Paint();
        this.f35725j2 = new Matrix();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f35729n2;
        View view = chatActivityEnterView.f32713j6;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null && bnVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.F3.getParentLayout()).f28771b) {
            setWindowView(chatActivityEnterView.F3.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.E3.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i7;
        boolean z11;
        float f10;
        float f11;
        ai.j1 j1Var;
        float f12;
        Canvas canvas2;
        ChatActivityEnterView chatActivityEnterView;
        boolean z12;
        int i10;
        float f13;
        LinearGradient linearGradient;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        LinearGradient linearGradient2;
        int max;
        ChatActivityEnterView chatActivityEnterView2 = this.f35729n2;
        if (chatActivityEnterView2.F1 && getScrollY() > 0 && getLayout() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = -1;
        if (z10) {
            i7 = canvas.saveLayer(-org.telegram.messenger.g0.L(4.0f), getScrollY() - org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(4.0f) + getWidth(), org.telegram.messenger.g0.L(48.0f) + getHeight() + getScrollY(), null);
        } else {
            i7 = -1;
        }
        ai.j1 j1Var2 = chatActivityEnterView2.f32750o6;
        if (j1Var2 == null || !j1Var2.d) {
            ai.l0 l0Var = chatActivityEnterView2.f32709j1;
            if (l0Var != null) {
                j1Var2 = l0Var.f1328a;
            } else {
                j1Var2 = null;
            }
        }
        if (j1Var2 != null && j1Var2.d && getLayout() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        float totalPaddingLeft = getTotalPaddingLeft();
        float offsetY = getOffsetY() + getTotalPaddingTop();
        if (z11) {
            int width = getLayout().getWidth();
            int height = getLayout().getHeight();
            j1Var2.getClass();
            f10 = 48.0f;
            f11 = 4.0f;
            f12 = offsetY;
            j1Var = j1Var2;
            canvas2 = canvas;
            i11 = canvas2.saveLayer(totalPaddingLeft - org.telegram.messenger.g0.L(8.0f), offsetY - org.telegram.messenger.g0.L(40.0f), width + totalPaddingLeft + org.telegram.messenger.g0.L(8.0f), height + offsetY + org.telegram.messenger.g0.L(40.0f), null);
            totalPaddingLeft = totalPaddingLeft;
        } else {
            f10 = 48.0f;
            f11 = 4.0f;
            j1Var = j1Var2;
            f12 = offsetY;
            canvas2 = canvas;
        }
        super.onDraw(canvas);
        if (z11) {
            int width2 = getLayout().getWidth();
            int height2 = getLayout().getHeight();
            int[] iArr = j1Var.A;
            EditText editText = j1Var.f1289b;
            LinearGradient linearGradient3 = j1Var.f1303r;
            float f19 = j1Var.B;
            LinearGradient linearGradient4 = j1Var.f1304s;
            Paint paint = j1Var.f1302q;
            LinearGradient linearGradient5 = j1Var.f1305t;
            z12 = z10;
            Paint paint2 = j1Var.f1301p;
            chatActivityEnterView = chatActivityEnterView2;
            xu0 xu0Var = j1Var.f1290c;
            if (!j1Var.I) {
                j1Var.I = true;
                i10 = i7;
                linearGradient = linearGradient3;
                if (j1Var.D) {
                    j1Var.f1291e = SystemClock.uptimeMillis();
                }
                Runnable runnable = j1Var.H;
                j1Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                i10 = i7;
                linearGradient = linearGradient3;
            }
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - j1Var.f1291e)) / 1000.0f;
            float d = j1Var.d(uptimeMillis);
            float d2 = j1Var.d(uptimeMillis - j1Var.F);
            float f20 = -org.telegram.messenger.g0.L(8.0f);
            float f21 = -org.telegram.messenger.g0.L(40.0f);
            float L = org.telegram.messenger.g0.L(8.0f) + width2;
            float L2 = org.telegram.messenger.g0.L(40.0f) + height2;
            canvas2.save();
            canvas2.translate(totalPaddingLeft, f12);
            if (j1Var.C) {
                float d10 = j1Var.d(uptimeMillis - 0.28f);
                f14 = totalPaddingLeft;
                f15 = L2;
                j1Var.e(linearGradient5, d10, Math.max(d10 + 1.0f, j1Var.d(uptimeMillis - 0.12f)));
                float f22 = uptimeMillis - (((float) j1Var.f1288a) / 1000.0f);
                if (f22 <= 0.0f) {
                    max = 255;
                } else {
                    max = (int) (Math.max(0.0f, 1.0f - (f22 / 0.18f)) * 255.0f);
                }
                paint.setAlpha(max);
            } else {
                f14 = totalPaddingLeft;
                f15 = L2;
                j1Var.e(linearGradient5, d2 - org.telegram.messenger.g0.L(f10), d2);
            }
            paint.setShader(linearGradient5);
            float f23 = f14;
            f13 = 1.0f;
            float f24 = f15;
            float f25 = f12;
            canvas.drawRect(f20, f21, L, f24, paint);
            if (j1Var.C) {
                float f26 = j1Var.E;
                j1Var.e(linearGradient4, d - f26, f26 + d);
            } else {
                j1Var.e(linearGradient4, d2 - f19, d2);
            }
            paint2.setShader(linearGradient4);
            canvas2 = canvas;
            canvas2.drawRect(f20, f21, L, f24, paint2);
            canvas2.restore();
            canvas2.restoreToCount(i11);
            editText.getLocationInWindow(iArr);
            float f27 = j1Var.f1309y;
            float totalPaddingTop = (editText.getTotalPaddingTop() + iArr[1]) - editText.getScrollY();
            if (editText instanceof pt) {
                f16 = ((pt) editText).getOffsetY();
            } else {
                f16 = 0.0f;
            }
            j1Var.f1310z = f27 - (f16 + totalPaddingTop);
            canvas2.save();
            canvas2.translate(f23, f25 + j1Var.f1310z);
            if (j1Var.h != null) {
                if (j1Var.C) {
                    f18 = j1Var.E;
                } else {
                    f18 = f19;
                }
                if (d - f18 < j1Var.f1293g) {
                    int saveLayer = canvas2.saveLayer(f20, j1Var.f1307w - org.telegram.messenger.g0.L(2.0f), Math.max(L, j1Var.h.getWidth()), org.telegram.messenger.g0.L(2.0f) + j1Var.f1307w + j1Var.f1308x, null);
                    canvas2.drawBitmap(j1Var.h, 0.0f, 0.0f, j1Var.f1300o);
                    if (j1Var.C) {
                        float f28 = j1Var.E;
                        linearGradient2 = linearGradient;
                        j1Var.e(linearGradient2, d - f28, f28 + d);
                    } else {
                        linearGradient2 = linearGradient;
                        j1Var.e(linearGradient2, d, d + f19);
                    }
                    paint2.setShader(linearGradient2);
                    canvas2.drawRect(f20, f21, Math.max(L, j1Var.h.getWidth()), Math.max(f24, org.telegram.messenger.g0.L(40.0f) + j1Var.h.getHeight()), paint2);
                    canvas2.restoreToCount(saveLayer);
                }
            }
            float f29 = org.telegram.messenger.g0.f24225p;
            float max2 = Math.max(0.05f, ((float) (j1Var.f1288a - (SystemClock.uptimeMillis() - j1Var.f1291e))) / 1000.0f);
            while (true) {
                int i12 = j1Var.f1298m;
                if (i12 >= j1Var.f1296k) {
                    break;
                }
                float[] fArr = j1Var.f1294i;
                int i13 = i12 * 3;
                if (fArr[i13 + 2] > d) {
                    break;
                }
                j1Var.f1298m = i12 + 1;
                if (j1Var.C) {
                    if (xu0Var.d() >= 0.45f) {
                        float[] fArr2 = j1Var.f1294i;
                        xu0Var.g(fArr2[i13], fArr2[i13 + 1], ((xu0Var.d() * 60.0f) + 26.0f) * f29, (-((xu0Var.d() * 44.0f) + 10.0f)) * f29, Math.min(max2, (xu0Var.d() * 0.14f) + 0.12f), 0.0f);
                    }
                } else {
                    xu0Var.g(fArr[i13], fArr[i13 + 1], ((xu0Var.d() * 34.0f) + 10.0f) * f29, (-((xu0Var.d() * 20.0f) + 6.0f)) * f29, Math.min(max2, (xu0Var.d() * 0.3f) + 0.26f), 0.0f);
                }
            }
            while (true) {
                int i14 = j1Var.f1299n;
                if (i14 >= j1Var.f1297l) {
                    break;
                }
                float[] fArr3 = j1Var.f1295j;
                int i15 = i14 * 3;
                if (fArr3[i15 + 2] > d) {
                    break;
                }
                float f30 = fArr3[i15];
                int i16 = i15 + 1;
                float f31 = fArr3[i16] - j1Var.f1310z;
                j1Var.f1299n = i14 + 1;
                float scrollY = editText.getScrollY();
                if (j1Var.f1295j[i16] >= scrollY - org.telegram.messenger.g0.L(2.0f) && j1Var.f1295j[i16] <= scrollY + j1Var.f1308x + org.telegram.messenger.g0.L(2.0f)) {
                    xu0Var.h((((xu0Var.d() * 16.0f) + 6.0f) * f29) + f30, ((xu0Var.d() - 0.5f) * 14.0f * f29) + f31, f30, f31, Math.min(max2, (xu0Var.d() * 0.08f) + j1Var.F + 0.04f));
                }
            }
            xu0Var.b(canvas2, 1.0f);
            canvas2.restore();
            float f32 = uptimeMillis * 1000.0f;
            float f33 = (float) j1Var.f1288a;
            if (j1Var.C) {
                f17 = 180.0f;
            } else {
                f17 = 0.0f;
            }
            if (f32 >= f33 + f17) {
                j1Var.c();
            } else {
                editText.invalidate();
            }
        } else {
            chatActivityEnterView = chatActivityEnterView2;
            z12 = z10;
            i10 = i7;
            f13 = 1.0f;
        }
        if (z12) {
            LinearGradient linearGradient6 = this.f35724i2;
            Paint paint3 = this.f35723h2;
            if (linearGradient6 == null) {
                LinearGradient linearGradient7 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-16777216, -1291845632, 0}, new float[]{0.0f, 0.45f, 1.0f}, Shader.TileMode.CLAMP);
                this.f35724i2 = linearGradient7;
                paint3.setShader(linearGradient7);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            float extendedPaddingTop = (getExtendedPaddingTop() + getScrollY()) - org.telegram.messenger.g0.L(2.0f);
            float lineHeight = getLineHeight() * 1.05f;
            Matrix matrix = this.f35725j2;
            matrix.setScale(f13, lineHeight);
            matrix.postTranslate(0.0f, extendedPaddingTop);
            this.f35724i2.setLocalMatrix(matrix);
            canvas2.drawRect(-org.telegram.messenger.g0.L(f11), getScrollY() - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11) + getWidth(), extendedPaddingTop + lineHeight, paint3);
            canvas2.restoreToCount(i10);
        }
        if (getLayout() != null && this.f35722g2) {
            this.f35722g2 = false;
            chatActivityEnterView.P(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        super.onMeasure(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f35729n2;
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            boolean z11 = false;
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.V1(z10);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z11 = true;
            }
            chatActivityEnterView.b2(z11);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i7) {
        ClipData primaryClip;
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f35729n2;
            if (chatActivityEnterView.F0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    if (clipboardManager == null) {
                        primaryClip = null;
                    } else {
                        primaryClip = clipboardManager.getPrimaryClip();
                    }
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z10 = oi.b4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (oi.a5.d(z10, hashMap)) {
                                    org.telegram.messenger.mp.u1(chatActivityEnterView.R);
                                    boolean z11 = org.telegram.messenger.s2.f26829a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.m1(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oi.a5.f(z10, false));
                                org.telegram.messenger.j6.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                                x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class);
                                if (x5VarArr != null) {
                                    for (x5 x5Var : x5VarArr) {
                                        x5Var.applyFontMetrics(chatActivityEnterView.F0.getPaint().getFontMetricsInt(), o5.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                hh0[] hh0VarArr = (hh0[]) chatActivityEnterView.F0.getText().getSpans(max2, min2, hh0.class);
                                if (hh0VarArr != null && hh0VarArr.length > 0) {
                                    hh0[] hh0VarArr2 = (hh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hh0.class);
                                    for (int i10 = 0; i10 < hh0VarArr2.length; i10++) {
                                        spannableStringBuilder.removeSpan(hh0VarArr2[i10]);
                                        spannableStringBuilder.removeSpan(hh0VarArr2[i10].f35741a);
                                    }
                                } else {
                                    ih0.a(spannableStringBuilder);
                                }
                                hf hfVar = chatActivityEnterView.F0;
                                hfVar.setText(hfVar.getText().replace(max2, min2, spannableStringBuilder));
                                chatActivityEnterView.F0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.F0.getText().length()));
                                return true;
                            }
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f35729n2;
        if (chatActivityEnterView.A()) {
            if (motionEvent.getAction() == 0) {
                this.f35726k2 = motionEvent.getX();
                this.f35727l2 = motionEvent.getY();
                this.f35728m2 = true;
            } else if (this.f35728m2 && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f35726k2) > org.telegram.messenger.g0.f24205e || Math.abs(motionEvent.getY() - this.f35727l2) > org.telegram.messenger.g0.f24205e) {
                    this.f35728m2 = false;
                }
            } else if (this.f35728m2) {
                if (chatActivityEnterView.P3 != null) {
                    org.telegram.ui.ActionBar.u6.l(this, 36, org.telegram.ui.ActionBar.n6.f29624mg, chatActivityEnterView.M4);
                    chatActivityEnterView.P3.o1();
                }
                hf hfVar = chatActivityEnterView.F0;
                if (hfVar != null && !org.telegram.messenger.g0.I3(hfVar)) {
                    chatActivityEnterView.F0.clearFocus();
                    chatActivityEnterView.F0.requestFocus();
                }
            }
            return this.f35728m2;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.P3 != null) {
            org.telegram.ui.ActionBar.u6.l(this, 36, org.telegram.ui.ActionBar.n6.f29624mg, chatActivityEnterView.M4);
            chatActivityEnterView.P3.o1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f35729n2.f32747o2.invalidate();
    }
}
