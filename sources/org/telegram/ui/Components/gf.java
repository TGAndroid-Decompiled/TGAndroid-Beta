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
public final class gf extends jg {
    public boolean f35483g2;
    public final Paint f35484h2;
    public LinearGradient f35485i2;
    public final Matrix f35486j2;
    public float f35487k2;
    public float f35488l2;
    public boolean f35489m2;
    public final ChatActivityEnterView f35490n2;

    public gf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(chatActivityEnterView, context, i6Var);
        this.f35490n2 = chatActivityEnterView;
        this.f35483g2 = true;
        this.f35484h2 = new Paint();
        this.f35486j2 = new Matrix();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f35490n2;
        View view = chatActivityEnterView.f32605h6;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null && bnVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.D3.getParentLayout()).f28680b) {
            setWindowView(chatActivityEnterView.D3.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.C3.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i7;
        boolean z11;
        float f10;
        float f11;
        ai.l1 l1Var;
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
        ChatActivityEnterView chatActivityEnterView2 = this.f35490n2;
        if (chatActivityEnterView2.D1 && getScrollY() > 0 && getLayout() != null) {
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
        ai.l1 l1Var2 = chatActivityEnterView2.f32640m6;
        if (l1Var2 == null || !l1Var2.d) {
            ai.n0 n0Var = chatActivityEnterView2.f32614j1;
            if (n0Var != null) {
                l1Var2 = n0Var.f1355a;
            } else {
                l1Var2 = null;
            }
        }
        if (l1Var2 != null && l1Var2.d && getLayout() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        float totalPaddingLeft = getTotalPaddingLeft();
        float offsetY = getOffsetY() + getTotalPaddingTop();
        if (z11) {
            int width = getLayout().getWidth();
            int height = getLayout().getHeight();
            l1Var2.getClass();
            f10 = 48.0f;
            f11 = 4.0f;
            f12 = offsetY;
            l1Var = l1Var2;
            canvas2 = canvas;
            i11 = canvas2.saveLayer(totalPaddingLeft - org.telegram.messenger.g0.L(8.0f), offsetY - org.telegram.messenger.g0.L(40.0f), width + totalPaddingLeft + org.telegram.messenger.g0.L(8.0f), height + offsetY + org.telegram.messenger.g0.L(40.0f), null);
            totalPaddingLeft = totalPaddingLeft;
        } else {
            f10 = 48.0f;
            f11 = 4.0f;
            l1Var = l1Var2;
            f12 = offsetY;
            canvas2 = canvas;
        }
        super.onDraw(canvas);
        if (z11) {
            int width2 = getLayout().getWidth();
            int height2 = getLayout().getHeight();
            int[] iArr = l1Var.A;
            EditText editText = l1Var.f1309b;
            LinearGradient linearGradient3 = l1Var.f1323r;
            float f19 = l1Var.B;
            LinearGradient linearGradient4 = l1Var.f1324s;
            Paint paint = l1Var.f1322q;
            LinearGradient linearGradient5 = l1Var.f1325t;
            z12 = z10;
            Paint paint2 = l1Var.f1321p;
            chatActivityEnterView = chatActivityEnterView2;
            vu0 vu0Var = l1Var.f1310c;
            if (!l1Var.I) {
                l1Var.I = true;
                i10 = i7;
                linearGradient = linearGradient3;
                if (l1Var.D) {
                    l1Var.f1311e = SystemClock.uptimeMillis();
                }
                Runnable runnable = l1Var.H;
                l1Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                i10 = i7;
                linearGradient = linearGradient3;
            }
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - l1Var.f1311e)) / 1000.0f;
            float d = l1Var.d(uptimeMillis);
            float d2 = l1Var.d(uptimeMillis - l1Var.F);
            float f20 = -org.telegram.messenger.g0.L(8.0f);
            float f21 = -org.telegram.messenger.g0.L(40.0f);
            float L = org.telegram.messenger.g0.L(8.0f) + width2;
            float L2 = org.telegram.messenger.g0.L(40.0f) + height2;
            canvas2.save();
            canvas2.translate(totalPaddingLeft, f12);
            if (l1Var.C) {
                float d10 = l1Var.d(uptimeMillis - 0.28f);
                f14 = totalPaddingLeft;
                f15 = L2;
                l1Var.e(linearGradient5, d10, Math.max(d10 + 1.0f, l1Var.d(uptimeMillis - 0.12f)));
                float f22 = uptimeMillis - (((float) l1Var.f1308a) / 1000.0f);
                if (f22 <= 0.0f) {
                    max = 255;
                } else {
                    max = (int) (Math.max(0.0f, 1.0f - (f22 / 0.18f)) * 255.0f);
                }
                paint.setAlpha(max);
            } else {
                f14 = totalPaddingLeft;
                f15 = L2;
                l1Var.e(linearGradient5, d2 - org.telegram.messenger.g0.L(f10), d2);
            }
            paint.setShader(linearGradient5);
            float f23 = f14;
            f13 = 1.0f;
            float f24 = f15;
            float f25 = f12;
            canvas.drawRect(f20, f21, L, f24, paint);
            if (l1Var.C) {
                float f26 = l1Var.E;
                l1Var.e(linearGradient4, d - f26, f26 + d);
            } else {
                l1Var.e(linearGradient4, d2 - f19, d2);
            }
            paint2.setShader(linearGradient4);
            canvas2 = canvas;
            canvas2.drawRect(f20, f21, L, f24, paint2);
            canvas2.restore();
            canvas2.restoreToCount(i11);
            editText.getLocationInWindow(iArr);
            float f27 = l1Var.f1329y;
            float totalPaddingTop = (editText.getTotalPaddingTop() + iArr[1]) - editText.getScrollY();
            if (editText instanceof pt) {
                f16 = ((pt) editText).getOffsetY();
            } else {
                f16 = 0.0f;
            }
            l1Var.f1330z = f27 - (f16 + totalPaddingTop);
            canvas2.save();
            canvas2.translate(f23, f25 + l1Var.f1330z);
            if (l1Var.h != null) {
                if (l1Var.C) {
                    f18 = l1Var.E;
                } else {
                    f18 = f19;
                }
                if (d - f18 < l1Var.f1313g) {
                    int saveLayer = canvas2.saveLayer(f20, l1Var.f1327w - org.telegram.messenger.g0.L(2.0f), Math.max(L, l1Var.h.getWidth()), org.telegram.messenger.g0.L(2.0f) + l1Var.f1327w + l1Var.f1328x, null);
                    canvas2.drawBitmap(l1Var.h, 0.0f, 0.0f, l1Var.f1320o);
                    if (l1Var.C) {
                        float f28 = l1Var.E;
                        linearGradient2 = linearGradient;
                        l1Var.e(linearGradient2, d - f28, f28 + d);
                    } else {
                        linearGradient2 = linearGradient;
                        l1Var.e(linearGradient2, d, d + f19);
                    }
                    paint2.setShader(linearGradient2);
                    canvas2.drawRect(f20, f21, Math.max(L, l1Var.h.getWidth()), Math.max(f24, org.telegram.messenger.g0.L(40.0f) + l1Var.h.getHeight()), paint2);
                    canvas2.restoreToCount(saveLayer);
                }
            }
            float f29 = org.telegram.messenger.g0.f24117p;
            float max2 = Math.max(0.05f, ((float) (l1Var.f1308a - (SystemClock.uptimeMillis() - l1Var.f1311e))) / 1000.0f);
            while (true) {
                int i12 = l1Var.f1318m;
                if (i12 >= l1Var.f1316k) {
                    break;
                }
                float[] fArr = l1Var.f1314i;
                int i13 = i12 * 3;
                if (fArr[i13 + 2] > d) {
                    break;
                }
                l1Var.f1318m = i12 + 1;
                if (l1Var.C) {
                    if (vu0Var.d() >= 0.45f) {
                        float[] fArr2 = l1Var.f1314i;
                        vu0Var.g(fArr2[i13], fArr2[i13 + 1], ((vu0Var.d() * 60.0f) + 26.0f) * f29, (-((vu0Var.d() * 44.0f) + 10.0f)) * f29, Math.min(max2, (vu0Var.d() * 0.14f) + 0.12f), 0.0f);
                    }
                } else {
                    vu0Var.g(fArr[i13], fArr[i13 + 1], ((vu0Var.d() * 34.0f) + 10.0f) * f29, (-((vu0Var.d() * 20.0f) + 6.0f)) * f29, Math.min(max2, (vu0Var.d() * 0.3f) + 0.26f), 0.0f);
                }
            }
            while (true) {
                int i14 = l1Var.f1319n;
                if (i14 >= l1Var.f1317l) {
                    break;
                }
                float[] fArr3 = l1Var.f1315j;
                int i15 = i14 * 3;
                if (fArr3[i15 + 2] > d) {
                    break;
                }
                float f30 = fArr3[i15];
                int i16 = i15 + 1;
                float f31 = fArr3[i16] - l1Var.f1330z;
                l1Var.f1319n = i14 + 1;
                float scrollY = editText.getScrollY();
                if (l1Var.f1315j[i16] >= scrollY - org.telegram.messenger.g0.L(2.0f) && l1Var.f1315j[i16] <= scrollY + l1Var.f1328x + org.telegram.messenger.g0.L(2.0f)) {
                    vu0Var.h((((vu0Var.d() * 16.0f) + 6.0f) * f29) + f30, ((vu0Var.d() - 0.5f) * 14.0f * f29) + f31, f30, f31, Math.min(max2, (vu0Var.d() * 0.08f) + l1Var.F + 0.04f));
                }
            }
            vu0Var.b(canvas2, 1.0f);
            canvas2.restore();
            float f32 = uptimeMillis * 1000.0f;
            float f33 = (float) l1Var.f1308a;
            if (l1Var.C) {
                f17 = 180.0f;
            } else {
                f17 = 0.0f;
            }
            if (f32 >= f33 + f17) {
                l1Var.c();
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
            LinearGradient linearGradient6 = this.f35485i2;
            Paint paint3 = this.f35484h2;
            if (linearGradient6 == null) {
                LinearGradient linearGradient7 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-16777216, -1291845632, 0}, new float[]{0.0f, 0.45f, 1.0f}, Shader.TileMode.CLAMP);
                this.f35485i2 = linearGradient7;
                paint3.setShader(linearGradient7);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            float extendedPaddingTop = (getExtendedPaddingTop() + getScrollY()) - org.telegram.messenger.g0.L(2.0f);
            float lineHeight = getLineHeight() * 1.05f;
            Matrix matrix = this.f35486j2;
            matrix.setScale(f13, lineHeight);
            matrix.postTranslate(0.0f, extendedPaddingTop);
            this.f35485i2.setLocalMatrix(matrix);
            canvas2.drawRect(-org.telegram.messenger.g0.L(f11), getScrollY() - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11) + getWidth(), extendedPaddingTop + lineHeight, paint3);
            canvas2.restoreToCount(i10);
        }
        if (getLayout() != null && this.f35483g2) {
            this.f35483g2 = false;
            chatActivityEnterView.P(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        super.onMeasure(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f35490n2;
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            boolean z11 = false;
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.P1(z10);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z11 = true;
            }
            chatActivityEnterView.V1(z11);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i7) {
        ClipData primaryClip;
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f35490n2;
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
                                    org.telegram.messenger.mp.u1(chatActivityEnterView.R);
                                    boolean z11 = org.telegram.messenger.s2.f26721a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.h1(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oi.z4.f(z10, false));
                                org.telegram.messenger.j6.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                                x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class);
                                if (x5VarArr != null) {
                                    for (x5 x5Var : x5VarArr) {
                                        x5Var.applyFontMetrics(chatActivityEnterView.F0.getPaint().getFontMetricsInt(), o5.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                gh0[] gh0VarArr = (gh0[]) chatActivityEnterView.F0.getText().getSpans(max2, min2, gh0.class);
                                if (gh0VarArr != null && gh0VarArr.length > 0) {
                                    gh0[] gh0VarArr2 = (gh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gh0.class);
                                    for (int i10 = 0; i10 < gh0VarArr2.length; i10++) {
                                        spannableStringBuilder.removeSpan(gh0VarArr2[i10]);
                                        spannableStringBuilder.removeSpan(gh0VarArr2[i10].f35503a);
                                    }
                                } else {
                                    hh0.a(spannableStringBuilder);
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
        ChatActivityEnterView chatActivityEnterView = this.f35490n2;
        if (chatActivityEnterView.A()) {
            if (motionEvent.getAction() == 0) {
                this.f35487k2 = motionEvent.getX();
                this.f35488l2 = motionEvent.getY();
                this.f35489m2 = true;
            } else if (this.f35489m2 && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f35487k2) > org.telegram.messenger.g0.f24097e || Math.abs(motionEvent.getY() - this.f35488l2) > org.telegram.messenger.g0.f24097e) {
                    this.f35489m2 = false;
                }
            } else if (this.f35489m2) {
                if (chatActivityEnterView.N3 != null) {
                    org.telegram.ui.ActionBar.u6.l(this, 36, org.telegram.ui.ActionBar.n6.f29567mg, chatActivityEnterView.K4);
                    chatActivityEnterView.N3.o1();
                }
                gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null && !org.telegram.messenger.g0.I3(gfVar)) {
                    chatActivityEnterView.F0.clearFocus();
                    chatActivityEnterView.F0.requestFocus();
                }
            }
            return this.f35489m2;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.N3 != null) {
            org.telegram.ui.ActionBar.u6.l(this, 36, org.telegram.ui.ActionBar.n6.f29567mg, chatActivityEnterView.K4);
            chatActivityEnterView.N3.o1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f35490n2.f32636m2.invalidate();
    }
}
