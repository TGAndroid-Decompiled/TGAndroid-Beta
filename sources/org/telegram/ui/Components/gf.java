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
public final class gf extends mg {
    public boolean f35549g2;
    public final Paint f35550h2;
    public LinearGradient f35551i2;
    public final Matrix f35552j2;
    public float f35553k2;
    public float f35554l2;
    public boolean f35555m2;
    public final ChatActivityEnterView f35556n2;

    public gf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(chatActivityEnterView, context, h6Var);
        this.f35556n2 = chatActivityEnterView;
        this.f35549g2 = true;
        this.f35550h2 = new Paint();
        this.f35552j2 = new Matrix();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f35556n2;
        View view = chatActivityEnterView.f32649j6;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null && bnVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.F3.getParentLayout()).f28713b) {
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
        ai.o1 o1Var;
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
        ChatActivityEnterView chatActivityEnterView2 = this.f35556n2;
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
        ai.o1 o1Var2 = chatActivityEnterView2.f32686o6;
        if (o1Var2 == null || !o1Var2.d) {
            ai.p0 p0Var = chatActivityEnterView2.f32645j1;
            if (p0Var != null) {
                o1Var2 = p0Var.f1383a;
            } else {
                o1Var2 = null;
            }
        }
        if (o1Var2 != null && o1Var2.d && getLayout() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        float totalPaddingLeft = getTotalPaddingLeft();
        float offsetY = getOffsetY() + getTotalPaddingTop();
        if (z11) {
            int width = getLayout().getWidth();
            int height = getLayout().getHeight();
            o1Var2.getClass();
            f10 = 48.0f;
            f11 = 4.0f;
            f12 = offsetY;
            o1Var = o1Var2;
            canvas2 = canvas;
            i11 = canvas2.saveLayer(totalPaddingLeft - org.telegram.messenger.g0.L(8.0f), offsetY - org.telegram.messenger.g0.L(40.0f), width + totalPaddingLeft + org.telegram.messenger.g0.L(8.0f), height + offsetY + org.telegram.messenger.g0.L(40.0f), null);
            totalPaddingLeft = totalPaddingLeft;
        } else {
            f10 = 48.0f;
            f11 = 4.0f;
            o1Var = o1Var2;
            f12 = offsetY;
            canvas2 = canvas;
        }
        super.onDraw(canvas);
        if (z11) {
            int width2 = getLayout().getWidth();
            int height2 = getLayout().getHeight();
            int[] iArr = o1Var.A;
            EditText editText = o1Var.f1354b;
            LinearGradient linearGradient3 = o1Var.f1368r;
            float f19 = o1Var.B;
            LinearGradient linearGradient4 = o1Var.f1369s;
            Paint paint = o1Var.f1367q;
            LinearGradient linearGradient5 = o1Var.f1370t;
            z12 = z10;
            Paint paint2 = o1Var.f1366p;
            chatActivityEnterView = chatActivityEnterView2;
            yu0 yu0Var = o1Var.f1355c;
            if (!o1Var.I) {
                o1Var.I = true;
                i10 = i7;
                linearGradient = linearGradient3;
                if (o1Var.D) {
                    o1Var.f1356e = SystemClock.uptimeMillis();
                }
                Runnable runnable = o1Var.H;
                o1Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                i10 = i7;
                linearGradient = linearGradient3;
            }
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - o1Var.f1356e)) / 1000.0f;
            float d = o1Var.d(uptimeMillis);
            float d2 = o1Var.d(uptimeMillis - o1Var.F);
            float f20 = -org.telegram.messenger.g0.L(8.0f);
            float f21 = -org.telegram.messenger.g0.L(40.0f);
            float L = org.telegram.messenger.g0.L(8.0f) + width2;
            float L2 = org.telegram.messenger.g0.L(40.0f) + height2;
            canvas2.save();
            canvas2.translate(totalPaddingLeft, f12);
            if (o1Var.C) {
                float d10 = o1Var.d(uptimeMillis - 0.28f);
                f14 = totalPaddingLeft;
                f15 = L2;
                o1Var.e(linearGradient5, d10, Math.max(d10 + 1.0f, o1Var.d(uptimeMillis - 0.12f)));
                float f22 = uptimeMillis - (((float) o1Var.f1353a) / 1000.0f);
                if (f22 <= 0.0f) {
                    max = 255;
                } else {
                    max = (int) (Math.max(0.0f, 1.0f - (f22 / 0.18f)) * 255.0f);
                }
                paint.setAlpha(max);
            } else {
                f14 = totalPaddingLeft;
                f15 = L2;
                o1Var.e(linearGradient5, d2 - org.telegram.messenger.g0.L(f10), d2);
            }
            paint.setShader(linearGradient5);
            float f23 = f14;
            f13 = 1.0f;
            float f24 = f15;
            float f25 = f12;
            canvas.drawRect(f20, f21, L, f24, paint);
            if (o1Var.C) {
                float f26 = o1Var.E;
                o1Var.e(linearGradient4, d - f26, f26 + d);
            } else {
                o1Var.e(linearGradient4, d2 - f19, d2);
            }
            paint2.setShader(linearGradient4);
            canvas2 = canvas;
            canvas2.drawRect(f20, f21, L, f24, paint2);
            canvas2.restore();
            canvas2.restoreToCount(i11);
            editText.getLocationInWindow(iArr);
            float f27 = o1Var.f1374y;
            float totalPaddingTop = (editText.getTotalPaddingTop() + iArr[1]) - editText.getScrollY();
            if (editText instanceof rt) {
                f16 = ((rt) editText).getOffsetY();
            } else {
                f16 = 0.0f;
            }
            o1Var.f1375z = f27 - (f16 + totalPaddingTop);
            canvas2.save();
            canvas2.translate(f23, f25 + o1Var.f1375z);
            if (o1Var.h != null) {
                if (o1Var.C) {
                    f18 = o1Var.E;
                } else {
                    f18 = f19;
                }
                if (d - f18 < o1Var.f1358g) {
                    int saveLayer = canvas2.saveLayer(f20, o1Var.f1372w - org.telegram.messenger.g0.L(2.0f), Math.max(L, o1Var.h.getWidth()), org.telegram.messenger.g0.L(2.0f) + o1Var.f1372w + o1Var.f1373x, null);
                    canvas2.drawBitmap(o1Var.h, 0.0f, 0.0f, o1Var.f1365o);
                    if (o1Var.C) {
                        float f28 = o1Var.E;
                        linearGradient2 = linearGradient;
                        o1Var.e(linearGradient2, d - f28, f28 + d);
                    } else {
                        linearGradient2 = linearGradient;
                        o1Var.e(linearGradient2, d, d + f19);
                    }
                    paint2.setShader(linearGradient2);
                    canvas2.drawRect(f20, f21, Math.max(L, o1Var.h.getWidth()), Math.max(f24, org.telegram.messenger.g0.L(40.0f) + o1Var.h.getHeight()), paint2);
                    canvas2.restoreToCount(saveLayer);
                }
            }
            float f29 = org.telegram.messenger.g0.f24045p;
            float max2 = Math.max(0.05f, ((float) (o1Var.f1353a - (SystemClock.uptimeMillis() - o1Var.f1356e))) / 1000.0f);
            while (true) {
                int i12 = o1Var.f1363m;
                if (i12 >= o1Var.f1361k) {
                    break;
                }
                float[] fArr = o1Var.f1359i;
                int i13 = i12 * 3;
                if (fArr[i13 + 2] > d) {
                    break;
                }
                o1Var.f1363m = i12 + 1;
                if (o1Var.C) {
                    if (yu0Var.d() >= 0.45f) {
                        float[] fArr2 = o1Var.f1359i;
                        yu0Var.g(fArr2[i13], fArr2[i13 + 1], ((yu0Var.d() * 60.0f) + 26.0f) * f29, (-((yu0Var.d() * 44.0f) + 10.0f)) * f29, Math.min(max2, (yu0Var.d() * 0.14f) + 0.12f), 0.0f);
                    }
                } else {
                    yu0Var.g(fArr[i13], fArr[i13 + 1], ((yu0Var.d() * 34.0f) + 10.0f) * f29, (-((yu0Var.d() * 20.0f) + 6.0f)) * f29, Math.min(max2, (yu0Var.d() * 0.3f) + 0.26f), 0.0f);
                }
            }
            while (true) {
                int i14 = o1Var.f1364n;
                if (i14 >= o1Var.f1362l) {
                    break;
                }
                float[] fArr3 = o1Var.f1360j;
                int i15 = i14 * 3;
                if (fArr3[i15 + 2] > d) {
                    break;
                }
                float f30 = fArr3[i15];
                int i16 = i15 + 1;
                float f31 = fArr3[i16] - o1Var.f1375z;
                o1Var.f1364n = i14 + 1;
                float scrollY = editText.getScrollY();
                if (o1Var.f1360j[i16] >= scrollY - org.telegram.messenger.g0.L(2.0f) && o1Var.f1360j[i16] <= scrollY + o1Var.f1373x + org.telegram.messenger.g0.L(2.0f)) {
                    yu0Var.h((((yu0Var.d() * 16.0f) + 6.0f) * f29) + f30, ((yu0Var.d() - 0.5f) * 14.0f * f29) + f31, f30, f31, Math.min(max2, (yu0Var.d() * 0.08f) + o1Var.F + 0.04f));
                }
            }
            yu0Var.b(canvas2, 1.0f);
            canvas2.restore();
            float f32 = uptimeMillis * 1000.0f;
            float f33 = (float) o1Var.f1353a;
            if (o1Var.C) {
                f17 = 180.0f;
            } else {
                f17 = 0.0f;
            }
            if (f32 >= f33 + f17) {
                o1Var.c();
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
            LinearGradient linearGradient6 = this.f35551i2;
            Paint paint3 = this.f35550h2;
            if (linearGradient6 == null) {
                LinearGradient linearGradient7 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-16777216, -1291845632, 0}, new float[]{0.0f, 0.45f, 1.0f}, Shader.TileMode.CLAMP);
                this.f35551i2 = linearGradient7;
                paint3.setShader(linearGradient7);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            float extendedPaddingTop = (getExtendedPaddingTop() + getScrollY()) - org.telegram.messenger.g0.L(2.0f);
            float lineHeight = getLineHeight() * 1.05f;
            Matrix matrix = this.f35552j2;
            matrix.setScale(f13, lineHeight);
            matrix.postTranslate(0.0f, extendedPaddingTop);
            this.f35551i2.setLocalMatrix(matrix);
            canvas2.drawRect(-org.telegram.messenger.g0.L(f11), getScrollY() - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11) + getWidth(), extendedPaddingTop + lineHeight, paint3);
            canvas2.restoreToCount(i10);
        }
        if (getLayout() != null && this.f35549g2) {
            this.f35549g2 = false;
            chatActivityEnterView.P(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        super.onMeasure(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f35556n2;
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            boolean z11 = false;
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.T1(z10);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z11 = true;
            }
            chatActivityEnterView.Z1(z11);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i7) {
        ClipData primaryClip;
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f35556n2;
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
                                    org.telegram.messenger.np.u1(chatActivityEnterView.R);
                                    boolean z11 = org.telegram.messenger.s2.f26730a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.l1(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oi.a5.f(z10, false));
                                org.telegram.messenger.j6.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                                y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                                if (y5VarArr != null) {
                                    for (y5 y5Var : y5VarArr) {
                                        y5Var.applyFontMetrics(chatActivityEnterView.F0.getPaint().getFontMetricsInt(), p5.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                ih0[] ih0VarArr = (ih0[]) chatActivityEnterView.F0.getText().getSpans(max2, min2, ih0.class);
                                if (ih0VarArr != null && ih0VarArr.length > 0) {
                                    ih0[] ih0VarArr2 = (ih0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ih0.class);
                                    for (int i10 = 0; i10 < ih0VarArr2.length; i10++) {
                                        spannableStringBuilder.removeSpan(ih0VarArr2[i10]);
                                        spannableStringBuilder.removeSpan(ih0VarArr2[i10].f36256a);
                                    }
                                } else {
                                    jh0.a(spannableStringBuilder);
                                }
                                gf gfVar = chatActivityEnterView.F0;
                                gfVar.setText(gfVar.getText().replace(max2, min2, spannableStringBuilder));
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
        ChatActivityEnterView chatActivityEnterView = this.f35556n2;
        if (chatActivityEnterView.A()) {
            if (motionEvent.getAction() == 0) {
                this.f35553k2 = motionEvent.getX();
                this.f35554l2 = motionEvent.getY();
                this.f35555m2 = true;
            } else if (this.f35555m2 && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f35553k2) > org.telegram.messenger.g0.f24025e || Math.abs(motionEvent.getY() - this.f35554l2) > org.telegram.messenger.g0.f24025e) {
                    this.f35555m2 = false;
                }
            } else if (this.f35555m2) {
                if (chatActivityEnterView.P3 != null) {
                    org.telegram.ui.ActionBar.t6.l(this, 36, org.telegram.ui.ActionBar.m6.f29554mg, chatActivityEnterView.M4);
                    chatActivityEnterView.P3.o1();
                }
                gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null && !org.telegram.messenger.g0.I3(gfVar)) {
                    chatActivityEnterView.F0.clearFocus();
                    chatActivityEnterView.F0.requestFocus();
                }
            }
            return this.f35555m2;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.P3 != null) {
            org.telegram.ui.ActionBar.t6.l(this, 36, org.telegram.ui.ActionBar.m6.f29554mg, chatActivityEnterView.M4);
            chatActivityEnterView.P3.o1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f35556n2.f32683o2.invalidate();
    }
}
