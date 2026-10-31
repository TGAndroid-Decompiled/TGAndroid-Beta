package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class se extends rf {
    public boolean a2;
    public float f30227b2;
    public float f30228c2;
    public boolean f30229d2;
    public final ChatActivityEnterView f30230e2;

    public se(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(chatActivityEnterView, context, p6Var);
        this.f30230e2 = chatActivityEnterView;
        this.a2 = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f30230e2;
        View view = chatActivityEnterView.J4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null && unVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).f20072b) {
            setWindowView(chatActivityEnterView.P2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.O2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.a2) {
            this.a2 = false;
            this.f30230e2.F(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f30230e2;
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z11 = false;
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.n1(z10);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z11 = true;
            }
            chatActivityEnterView.t1(z11);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f30230e2;
            if (chatActivityEnterView.E0 != null) {
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
                            ArrayList z10 = bi.l4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (bi.n5.d(z10, hashMap)) {
                                    org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
                                    boolean z11 = org.telegram.messenger.v2.f18448a;
                                    int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    chatActivityEnterView.I0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bi.n5.f(z10, false));
                                org.telegram.messenger.k6.m(spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, null, 0);
                                o5[] o5VarArr = (o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o5.class);
                                if (o5VarArr != null) {
                                    for (o5 o5Var : o5VarArr) {
                                        o5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), f5.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                vh0[] vh0VarArr = (vh0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, vh0.class);
                                if (vh0VarArr != null && vh0VarArr.length > 0) {
                                    vh0[] vh0VarArr2 = (vh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vh0.class);
                                    for (int i11 = 0; i11 < vh0VarArr2.length; i11++) {
                                        spannableStringBuilder.removeSpan(vh0VarArr2[i11]);
                                        spannableStringBuilder.removeSpan(vh0VarArr2[i11].f31258a);
                                    }
                                } else {
                                    wh0.a(spannableStringBuilder);
                                }
                                se seVar = chatActivityEnterView.E0;
                                seVar.setText(seVar.getText().replace(max2, min2, spannableStringBuilder));
                                chatActivityEnterView.E0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.E0.getText().length()));
                                return true;
                            }
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f30230e2;
        if (chatActivityEnterView.r()) {
            if (motionEvent.getAction() == 0) {
                this.f30227b2 = motionEvent.getX();
                this.f30228c2 = motionEvent.getY();
                this.f30229d2 = true;
            } else if (this.f30229d2 && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f30227b2) > org.telegram.messenger.i0.e || Math.abs(motionEvent.getY() - this.f30228c2) > org.telegram.messenger.i0.e) {
                    this.f30229d2 = false;
                }
            } else if (this.f30229d2) {
                if (chatActivityEnterView.Z2 != null) {
                    org.telegram.ui.ActionBar.a7.m(this, 36, org.telegram.ui.ActionBar.t6.f21048jg, chatActivityEnterView.W3);
                    chatActivityEnterView.Z2.b1();
                }
                se seVar = chatActivityEnterView.E0;
                if (seVar != null && !org.telegram.messenger.i0.J3(seVar)) {
                    chatActivityEnterView.E0.clearFocus();
                    chatActivityEnterView.E0.requestFocus();
                }
            }
            return this.f30229d2;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
            org.telegram.ui.ActionBar.a7.m(this, 36, org.telegram.ui.ActionBar.t6.f21048jg, chatActivityEnterView.W3);
            chatActivityEnterView.Z2.b1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.f30230e2.f23817y1.invalidate();
    }
}
