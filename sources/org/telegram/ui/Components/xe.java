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
public final class xe extends vf {
    public boolean f40276a2;
    public float f40277b2;
    public float f40278c2;
    public boolean d2;
    public final ChatActivityEnterView f40279e2;

    public xe(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(chatActivityEnterView, context, f6Var);
        this.f40279e2 = chatActivityEnterView;
        this.f40276a2 = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f40279e2;
        View view = chatActivityEnterView.J4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        if (anVar != null && anVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).f27230b) {
            setWindowView(chatActivityEnterView.P2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.O2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.f40276a2) {
            this.f40276a2 = false;
            this.f40279e2.E(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        super.onMeasure(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f40279e2;
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z10 = false;
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z9 = true;
            } else {
                z9 = false;
            }
            chatActivityEnterView.p1(z9);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.v1(z10);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i7) {
        ClipData primaryClip;
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f40279e2;
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
                            ArrayList z9 = li.b4.z(htmlText, hashMap);
                            if (!z9.isEmpty()) {
                                if (li.a5.d(z9, hashMap)) {
                                    org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
                                    boolean z10 = org.telegram.messenger.r2.f25199a;
                                    int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    chatActivityEnterView.K0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(li.a5.f(z9, false));
                                org.telegram.messenger.i6.m(spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, null, 0);
                                r5[] r5VarArr = (r5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), r5.class);
                                if (r5VarArr != null) {
                                    for (r5 r5Var : r5VarArr) {
                                        r5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), i5.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                tg0[] tg0VarArr = (tg0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, tg0.class);
                                if (tg0VarArr != null && tg0VarArr.length > 0) {
                                    tg0[] tg0VarArr2 = (tg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), tg0.class);
                                    for (int i10 = 0; i10 < tg0VarArr2.length; i10++) {
                                        spannableStringBuilder.removeSpan(tg0VarArr2[i10]);
                                        spannableStringBuilder.removeSpan(tg0VarArr2[i10].f38322a);
                                    }
                                } else {
                                    ug0.a(spannableStringBuilder);
                                }
                                xe xeVar = chatActivityEnterView.E0;
                                xeVar.setText(xeVar.getText().replace(max2, min2, spannableStringBuilder));
                                chatActivityEnterView.E0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.E0.getText().length()));
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
        ChatActivityEnterView chatActivityEnterView = this.f40279e2;
        if (chatActivityEnterView.s()) {
            if (motionEvent.getAction() == 0) {
                this.f40277b2 = motionEvent.getX();
                this.f40278c2 = motionEvent.getY();
                this.d2 = true;
            } else if (this.d2 && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f40277b2) > org.telegram.messenger.g0.f22523e || Math.abs(motionEvent.getY() - this.f40278c2) > org.telegram.messenger.g0.f22523e) {
                    this.d2 = false;
                }
            } else if (this.d2) {
                if (chatActivityEnterView.Z2 != null) {
                    org.telegram.ui.ActionBar.r6.m(this, 36, org.telegram.ui.ActionBar.k6.f27968jg, chatActivityEnterView.W3);
                    chatActivityEnterView.Z2.f1();
                }
                xe xeVar = chatActivityEnterView.E0;
                if (xeVar != null && !org.telegram.messenger.g0.K3(xeVar)) {
                    chatActivityEnterView.E0.clearFocus();
                    chatActivityEnterView.E0.requestFocus();
                }
            }
            return this.d2;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
            org.telegram.ui.ActionBar.r6.m(this, 36, org.telegram.ui.ActionBar.k6.f27968jg, chatActivityEnterView.W3);
            chatActivityEnterView.Z2.f1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f40279e2.f31153y1.invalidate();
    }
}
