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
public final class gf extends lg {
    public boolean f35511g2;
    public final Paint f35512h2;
    public LinearGradient f35513i2;
    public final Matrix f35514j2;
    public float f35515k2;
    public float f35516l2;
    public boolean f35517m2;
    public final ChatActivityEnterView f35518n2;

    public gf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(chatActivityEnterView, context, h6Var);
        this.f35518n2 = chatActivityEnterView;
        this.f35511g2 = true;
        this.f35512h2 = new Paint();
        this.f35514j2 = new Matrix();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f35518n2;
        View view = chatActivityEnterView.f32615j6;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null && bnVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.F3.getParentLayout()).f28679b) {
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
        ai.i1 i1Var;
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
        ChatActivityEnterView chatActivityEnterView2 = this.f35518n2;
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
        ai.i1 i1Var2 = chatActivityEnterView2.f32652o6;
        if (i1Var2 == null || !i1Var2.d) {
            ai.k0 k0Var = chatActivityEnterView2.f32611j1;
            if (k0Var != null) {
                i1Var2 = k0Var.f1313a;
            } else {
                i1Var2 = null;
            }
        }
        if (i1Var2 != null && i1Var2.d && getLayout() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        float totalPaddingLeft = getTotalPaddingLeft();
        float offsetY = getOffsetY() + getTotalPaddingTop();
        if (z11) {
            int width = getLayout().getWidth();
            int height = getLayout().getHeight();
            i1Var2.getClass();
            f10 = 48.0f;
            f11 = 4.0f;
            f12 = offsetY;
            i1Var = i1Var2;
            canvas2 = canvas;
            i11 = canvas2.saveLayer(totalPaddingLeft - org.telegram.messenger.g0.L(8.0f), offsetY - org.telegram.messenger.g0.L(40.0f), width + totalPaddingLeft + org.telegram.messenger.g0.L(8.0f), height + offsetY + org.telegram.messenger.g0.L(40.0f), null);
            totalPaddingLeft = totalPaddingLeft;
        } else {
            f10 = 48.0f;
            f11 = 4.0f;
            i1Var = i1Var2;
            f12 = offsetY;
            canvas2 = canvas;
        }
        super.onDraw(canvas);
        if (z11) {
            int width2 = getLayout().getWidth();
            int height2 = getLayout().getHeight();
            int[] iArr = i1Var.A;
            EditText editText = i1Var.f1272b;
            LinearGradient linearGradient3 = i1Var.f1286r;
            float f19 = i1Var.B;
            LinearGradient linearGradient4 = i1Var.f1287s;
            Paint paint = i1Var.f1285q;
            LinearGradient linearGradient5 = i1Var.f1288t;
            z12 = z10;
            Paint paint2 = i1Var.f1284p;
            chatActivityEnterView = chatActivityEnterView2;
            yu0 yu0Var = i1Var.f1273c;
            if (!i1Var.I) {
                i1Var.I = true;
                i10 = i7;
                linearGradient = linearGradient3;
                if (i1Var.D) {
                    i1Var.f1274e = SystemClock.uptimeMillis();
                }
                Runnable runnable = i1Var.H;
                i1Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                i10 = i7;
                linearGradient = linearGradient3;
            }
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - i1Var.f1274e)) / 1000.0f;
            float d = i1Var.d(uptimeMillis);
            float d2 = i1Var.d(uptimeMillis - i1Var.F);
            float f20 = -org.telegram.messenger.g0.L(8.0f);
            float f21 = -org.telegram.messenger.g0.L(40.0f);
            float L = org.telegram.messenger.g0.L(8.0f) + width2;
            float L2 = org.telegram.messenger.g0.L(40.0f) + height2;
            canvas2.save();
            canvas2.translate(totalPaddingLeft, f12);
            if (i1Var.C) {
                float d10 = i1Var.d(uptimeMillis - 0.28f);
                f14 = totalPaddingLeft;
                f15 = L2;
                i1Var.e(linearGradient5, d10, Math.max(d10 + 1.0f, i1Var.d(uptimeMillis - 0.12f)));
                float f22 = uptimeMillis - (((float) i1Var.f1271a) / 1000.0f);
                if (f22 <= 0.0f) {
                    max = 255;
                } else {
                    max = (int) (Math.max(0.0f, 1.0f - (f22 / 0.18f)) * 255.0f);
                }
                paint.setAlpha(max);
            } else {
                f14 = totalPaddingLeft;
                f15 = L2;
                i1Var.e(linearGradient5, d2 - org.telegram.messenger.g0.L(f10), d2);
            }
            paint.setShader(linearGradient5);
            float f23 = f14;
            f13 = 1.0f;
            float f24 = f15;
            float f25 = f12;
            canvas.drawRect(f20, f21, L, f24, paint);
            if (i1Var.C) {
                float f26 = i1Var.E;
                i1Var.e(linearGradient4, d - f26, f26 + d);
            } else {
                i1Var.e(linearGradient4, d2 - f19, d2);
            }
            paint2.setShader(linearGradient4);
            canvas2 = canvas;
            canvas2.drawRect(f20, f21, L, f24, paint2);
            canvas2.restore();
            canvas2.restoreToCount(i11);
            editText.getLocationInWindow(iArr);
            float f27 = i1Var.f1292y;
            float totalPaddingTop = (editText.getTotalPaddingTop() + iArr[1]) - editText.getScrollY();
            if (editText instanceof rt) {
                f16 = ((rt) editText).getOffsetY();
            } else {
                f16 = 0.0f;
            }
            i1Var.f1293z = f27 - (f16 + totalPaddingTop);
            canvas2.save();
            canvas2.translate(f23, f25 + i1Var.f1293z);
            if (i1Var.h != null) {
                if (i1Var.C) {
                    f18 = i1Var.E;
                } else {
                    f18 = f19;
                }
                if (d - f18 < i1Var.f1276g) {
                    int saveLayer = canvas2.saveLayer(f20, i1Var.f1290w - org.telegram.messenger.g0.L(2.0f), Math.max(L, i1Var.h.getWidth()), org.telegram.messenger.g0.L(2.0f) + i1Var.f1290w + i1Var.f1291x, null);
                    canvas2.drawBitmap(i1Var.h, 0.0f, 0.0f, i1Var.f1283o);
                    if (i1Var.C) {
                        float f28 = i1Var.E;
                        linearGradient2 = linearGradient;
                        i1Var.e(linearGradient2, d - f28, f28 + d);
                    } else {
                        linearGradient2 = linearGradient;
                        i1Var.e(linearGradient2, d, d + f19);
                    }
                    paint2.setShader(linearGradient2);
                    canvas2.drawRect(f20, f21, Math.max(L, i1Var.h.getWidth()), Math.max(f24, org.telegram.messenger.g0.L(40.0f) + i1Var.h.getHeight()), paint2);
                    canvas2.restoreToCount(saveLayer);
                }
            }
            float f29 = org.telegram.messenger.g0.f24009p;
            float max2 = Math.max(0.05f, ((float) (i1Var.f1271a - (SystemClock.uptimeMillis() - i1Var.f1274e))) / 1000.0f);
            while (true) {
                int i12 = i1Var.f1281m;
                if (i12 >= i1Var.f1279k) {
                    break;
                }
                float[] fArr = i1Var.f1277i;
                int i13 = i12 * 3;
                if (fArr[i13 + 2] > d) {
                    break;
                }
                i1Var.f1281m = i12 + 1;
                if (i1Var.C) {
                    if (yu0Var.d() >= 0.45f) {
                        float[] fArr2 = i1Var.f1277i;
                        yu0Var.g(fArr2[i13], fArr2[i13 + 1], ((yu0Var.d() * 60.0f) + 26.0f) * f29, (-((yu0Var.d() * 44.0f) + 10.0f)) * f29, Math.min(max2, (yu0Var.d() * 0.14f) + 0.12f), 0.0f);
                    }
                } else {
                    yu0Var.g(fArr[i13], fArr[i13 + 1], ((yu0Var.d() * 34.0f) + 10.0f) * f29, (-((yu0Var.d() * 20.0f) + 6.0f)) * f29, Math.min(max2, (yu0Var.d() * 0.3f) + 0.26f), 0.0f);
                }
            }
            while (true) {
                int i14 = i1Var.f1282n;
                if (i14 >= i1Var.f1280l) {
                    break;
                }
                float[] fArr3 = i1Var.f1278j;
                int i15 = i14 * 3;
                if (fArr3[i15 + 2] > d) {
                    break;
                }
                float f30 = fArr3[i15];
                int i16 = i15 + 1;
                float f31 = fArr3[i16] - i1Var.f1293z;
                i1Var.f1282n = i14 + 1;
                float scrollY = editText.getScrollY();
                if (i1Var.f1278j[i16] >= scrollY - org.telegram.messenger.g0.L(2.0f) && i1Var.f1278j[i16] <= scrollY + i1Var.f1291x + org.telegram.messenger.g0.L(2.0f)) {
                    yu0Var.h((((yu0Var.d() * 16.0f) + 6.0f) * f29) + f30, ((yu0Var.d() - 0.5f) * 14.0f * f29) + f31, f30, f31, Math.min(max2, (yu0Var.d() * 0.08f) + i1Var.F + 0.04f));
                }
            }
            yu0Var.b(canvas2, 1.0f);
            canvas2.restore();
            float f32 = uptimeMillis * 1000.0f;
            float f33 = (float) i1Var.f1271a;
            if (i1Var.C) {
                f17 = 180.0f;
            } else {
                f17 = 0.0f;
            }
            if (f32 >= f33 + f17) {
                i1Var.c();
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
            LinearGradient linearGradient6 = this.f35513i2;
            Paint paint3 = this.f35512h2;
            if (linearGradient6 == null) {
                LinearGradient linearGradient7 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-16777216, -1291845632, 0}, new float[]{0.0f, 0.45f, 1.0f}, Shader.TileMode.CLAMP);
                this.f35513i2 = linearGradient7;
                paint3.setShader(linearGradient7);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            float extendedPaddingTop = (getExtendedPaddingTop() + getScrollY()) - org.telegram.messenger.g0.L(2.0f);
            float lineHeight = getLineHeight() * 1.05f;
            Matrix matrix = this.f35514j2;
            matrix.setScale(f13, lineHeight);
            matrix.postTranslate(0.0f, extendedPaddingTop);
            this.f35513i2.setLocalMatrix(matrix);
            canvas2.drawRect(-org.telegram.messenger.g0.L(f11), getScrollY() - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11) + getWidth(), extendedPaddingTop + lineHeight, paint3);
            canvas2.restoreToCount(i10);
        }
        if (getLayout() != null && this.f35511g2) {
            this.f35511g2 = false;
            chatActivityEnterView.P(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        super.onMeasure(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f35518n2;
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
            ChatActivityEnterView chatActivityEnterView = this.f35518n2;
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
                            ArrayList z10 = oi.a4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (oi.z4.d(z10, hashMap)) {
                                    org.telegram.messenger.np.u1(chatActivityEnterView.R);
                                    boolean z11 = org.telegram.messenger.s2.f26694a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.l1(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oi.z4.f(z10, false));
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
                                        spannableStringBuilder.removeSpan(ih0VarArr2[i10].f36212a);
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
        ChatActivityEnterView chatActivityEnterView = this.f35518n2;
        if (chatActivityEnterView.A()) {
            if (motionEvent.getAction() == 0) {
                this.f35515k2 = motionEvent.getX();
                this.f35516l2 = motionEvent.getY();
                this.f35517m2 = true;
            } else if (this.f35517m2 && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f35515k2) > org.telegram.messenger.g0.f23989e || Math.abs(motionEvent.getY() - this.f35516l2) > org.telegram.messenger.g0.f23989e) {
                    this.f35517m2 = false;
                }
            } else if (this.f35517m2) {
                if (chatActivityEnterView.P3 != null) {
                    org.telegram.ui.ActionBar.t6.l(this, 36, org.telegram.ui.ActionBar.m6.f29520mg, chatActivityEnterView.M4);
                    chatActivityEnterView.P3.o1();
                }
                gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null && !org.telegram.messenger.g0.I3(gfVar)) {
                    chatActivityEnterView.F0.clearFocus();
                    chatActivityEnterView.F0.requestFocus();
                }
            }
            return this.f35517m2;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.P3 != null) {
            org.telegram.ui.ActionBar.t6.l(this, 36, org.telegram.ui.ActionBar.m6.f29520mg, chatActivityEnterView.M4);
            chatActivityEnterView.P3.o1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f35518n2.f32649o2.invalidate();
    }
}
