package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class xe extends bg {
    public boolean f41665g2;
    public float f41666h2;
    public float f41667i2;
    public boolean f41668j2;
    public final ChatActivityEnterView f41669k2;

    public xe(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(chatActivityEnterView, context, e6Var);
        this.f41669k2 = chatActivityEnterView;
        this.f41665g2 = true;
        new Paint();
        new Matrix();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f41669k2;
        View view = chatActivityEnterView.f32168b6;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
        if (anVar != null && anVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.f32319x3.getParentLayout()).f28328b) {
            setWindowView(chatActivityEnterView.f32319x3.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.f32311w3.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ai.k1 k1Var;
        boolean z10;
        Canvas canvas2;
        int i7;
        ChatActivityEnterView chatActivityEnterView;
        float f10;
        ChatActivityEnterView chatActivityEnterView2 = this.f41669k2;
        ai.m0 m0Var = chatActivityEnterView2.f32221j1;
        if (m0Var != null) {
            k1Var = m0Var.f1356a;
        } else {
            k1Var = null;
        }
        if (k1Var != null && k1Var.d && getLayout() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        float totalPaddingLeft = getTotalPaddingLeft();
        float offsetY = getOffsetY() + getTotalPaddingTop();
        if (z10) {
            int width = getLayout().getWidth();
            int height = getLayout().getHeight();
            k1Var.getClass();
            canvas2 = canvas;
            i7 = canvas2.saveLayer(totalPaddingLeft - org.telegram.messenger.g0.L(8.0f), offsetY - org.telegram.messenger.g0.L(40.0f), width + totalPaddingLeft + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(40.0f) + height + offsetY, null);
        } else {
            canvas2 = canvas;
            i7 = -1;
        }
        super.onDraw(canvas);
        if (z10) {
            int width2 = getLayout().getWidth();
            int height2 = getLayout().getHeight();
            LinearGradient linearGradient = k1Var.f1325r;
            EditText editText = k1Var.f1311b;
            int[] iArr = k1Var.A;
            LinearGradient linearGradient2 = k1Var.f1326s;
            Paint paint = k1Var.f1324q;
            LinearGradient linearGradient3 = k1Var.f1327t;
            float f11 = k1Var.B;
            nu0 nu0Var = k1Var.f1312c;
            Paint paint2 = k1Var.f1323p;
            int i10 = i7;
            if (!k1Var.D) {
                k1Var.D = true;
                ai.e0 e0Var = k1Var.C;
                k1Var.C = null;
                if (e0Var != null) {
                    e0Var.run();
                }
            }
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - k1Var.f1313e)) / 1000.0f;
            float b10 = k1Var.b(uptimeMillis);
            float b11 = k1Var.b(uptimeMillis - 0.06f);
            float f12 = -org.telegram.messenger.g0.L(8.0f);
            float f13 = -org.telegram.messenger.g0.L(40.0f);
            float L = org.telegram.messenger.g0.L(8.0f) + width2;
            float L2 = org.telegram.messenger.g0.L(40.0f) + height2;
            canvas2.save();
            canvas2.translate(totalPaddingLeft, offsetY);
            k1Var.c(linearGradient3, b11 - org.telegram.messenger.g0.L(48.0f), b11);
            paint.setShader(linearGradient3);
            chatActivityEnterView = chatActivityEnterView2;
            canvas.drawRect(f12, f13, L, L2, paint);
            k1Var.c(linearGradient2, b11 - f11, b11);
            paint2.setShader(linearGradient2);
            canvas.drawRect(f12, f13, L, L2, paint2);
            canvas.restore();
            canvas.restoreToCount(i10);
            editText.getLocationInWindow(iArr);
            float f14 = k1Var.f1331y;
            float totalPaddingTop = (editText.getTotalPaddingTop() + iArr[1]) - editText.getScrollY();
            if (editText instanceof kt) {
                f10 = ((kt) editText).getOffsetY();
            } else {
                f10 = 0.0f;
            }
            k1Var.f1332z = f14 - (f10 + totalPaddingTop);
            canvas.save();
            canvas.translate(totalPaddingLeft, offsetY + k1Var.f1332z);
            if (k1Var.h != null && b10 - f11 < k1Var.f1315g) {
                int saveLayer = canvas.saveLayer(f12, k1Var.f1329w - org.telegram.messenger.g0.L(2.0f), Math.max(L, k1Var.h.getWidth()), org.telegram.messenger.g0.L(2.0f) + k1Var.f1329w + k1Var.f1330x, null);
                canvas.drawBitmap(k1Var.h, 0.0f, 0.0f, k1Var.f1322o);
                k1Var.c(linearGradient, b10, b10 + f11);
                paint2.setShader(linearGradient);
                canvas.drawRect(f12, f13, Math.max(L, k1Var.h.getWidth()), Math.max(L2, org.telegram.messenger.g0.L(40.0f) + k1Var.h.getHeight()), paint2);
                canvas.restoreToCount(saveLayer);
            }
            float f15 = org.telegram.messenger.g0.f23608p;
            float max = Math.max(0.05f, ((float) (k1Var.f1310a - (SystemClock.uptimeMillis() - k1Var.f1313e))) / 1000.0f);
            while (true) {
                int i11 = k1Var.f1320m;
                if (i11 >= k1Var.f1318k) {
                    break;
                }
                float[] fArr = k1Var.f1316i;
                int i12 = i11 * 3;
                if (fArr[i12 + 2] > b10) {
                    break;
                }
                nu0Var.g(fArr[i12], fArr[i12 + 1], ((nu0Var.d() * 34.0f) + 10.0f) * f15, (-((nu0Var.d() * 20.0f) + 6.0f)) * f15, Math.min(max, (nu0Var.d() * 0.3f) + 0.26f), 0.0f);
                k1Var.f1320m++;
            }
            while (true) {
                int i13 = k1Var.f1321n;
                if (i13 >= k1Var.f1319l) {
                    break;
                }
                float[] fArr2 = k1Var.f1317j;
                int i14 = i13 * 3;
                if (fArr2[i14 + 2] > b10) {
                    break;
                }
                float f16 = fArr2[i14];
                int i15 = i14 + 1;
                float f17 = fArr2[i15] - k1Var.f1332z;
                k1Var.f1321n = i13 + 1;
                float scrollY = editText.getScrollY();
                if (k1Var.f1317j[i15] >= scrollY - org.telegram.messenger.g0.L(2.0f) && k1Var.f1317j[i15] <= scrollY + k1Var.f1330x + org.telegram.messenger.g0.L(2.0f)) {
                    nu0Var.h((((nu0Var.d() * 16.0f) + 6.0f) * f15) + f16, ((nu0Var.d() - 0.5f) * 14.0f * f15) + f17, f16, f17, Math.min(max, (nu0Var.d() * 0.08f) + 0.099999994f));
                }
            }
            nu0Var.b(canvas, 1.0f);
            canvas.restore();
            if (uptimeMillis * 1000.0f >= ((float) k1Var.f1310a)) {
                k1Var.a();
            } else {
                editText.invalidate();
            }
        } else {
            chatActivityEnterView = chatActivityEnterView2;
        }
        if (getLayout() != null && this.f41665g2) {
            this.f41665g2 = false;
            chatActivityEnterView.N(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        super.onMeasure(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f41669k2;
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            boolean z11 = false;
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.H1(z10);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z11 = true;
            }
            chatActivityEnterView.N1(z11);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i7) {
        ClipData primaryClip;
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f41669k2;
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
                            ArrayList z10 = oi.y3.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (oi.y4.d(z10, hashMap)) {
                                    org.telegram.messenger.np.s1(chatActivityEnterView.R);
                                    boolean z11 = org.telegram.messenger.r2.f26198a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.Z0(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oi.y4.f(z10, false));
                                org.telegram.messenger.j6.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                                p5[] p5VarArr = (p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p5.class);
                                if (p5VarArr != null) {
                                    for (p5 p5Var : p5VarArr) {
                                        p5Var.applyFontMetrics(chatActivityEnterView.F0.getPaint().getFontMetricsInt(), g5.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                wg0[] wg0VarArr = (wg0[]) chatActivityEnterView.F0.getText().getSpans(max2, min2, wg0.class);
                                if (wg0VarArr != null && wg0VarArr.length > 0) {
                                    wg0[] wg0VarArr2 = (wg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wg0.class);
                                    for (int i10 = 0; i10 < wg0VarArr2.length; i10++) {
                                        spannableStringBuilder.removeSpan(wg0VarArr2[i10]);
                                        spannableStringBuilder.removeSpan(wg0VarArr2[i10].f41341a);
                                    }
                                } else {
                                    xg0.a(spannableStringBuilder);
                                }
                                xe xeVar = chatActivityEnterView.F0;
                                xeVar.setText(xeVar.getText().replace(max2, min2, spannableStringBuilder));
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
        ChatActivityEnterView chatActivityEnterView = this.f41669k2;
        if (chatActivityEnterView.y()) {
            if (motionEvent.getAction() == 0) {
                this.f41666h2 = motionEvent.getX();
                this.f41667i2 = motionEvent.getY();
                this.f41668j2 = true;
            } else if (this.f41668j2 && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f41666h2) > org.telegram.messenger.g0.f23588e || Math.abs(motionEvent.getY() - this.f41667i2) > org.telegram.messenger.g0.f23588e) {
                    this.f41668j2 = false;
                }
            } else if (this.f41668j2) {
                if (chatActivityEnterView.H3 != null) {
                    org.telegram.ui.ActionBar.q6.l(this, 36, org.telegram.ui.ActionBar.j6.f29022mg, chatActivityEnterView.E4);
                    chatActivityEnterView.H3.o1();
                }
                xe xeVar = chatActivityEnterView.F0;
                if (xeVar != null && !org.telegram.messenger.g0.J3(xeVar)) {
                    chatActivityEnterView.F0.clearFocus();
                    chatActivityEnterView.F0.requestFocus();
                }
            }
            return this.f41668j2;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.H3 != null) {
            org.telegram.ui.ActionBar.q6.l(this, 36, org.telegram.ui.ActionBar.j6.f29022mg, chatActivityEnterView.E4);
            chatActivityEnterView.H3.o1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f41669k2.f32201g2.invalidate();
    }
}
