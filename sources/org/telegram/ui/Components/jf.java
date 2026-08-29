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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jf extends gg {
    public boolean f29647e;
    public float f29648f;
    public float h;
    public boolean f29649n;
    public final ChatActivityEnterView f29650r;

    public jf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(chatActivityEnterView, context, c6Var);
        this.f29650r = chatActivityEnterView;
        this.f29647e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f29650r;
        View view = chatActivityEnterView.E4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (tnVar != null && tnVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.K2.getParentLayout()).f22659b) {
            setWindowView(chatActivityEnterView.K2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.J2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.f29647e) {
            this.f29647e = false;
            this.f29650r.J(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f29650r;
        if (chatActivityEnterView.P != chatActivityEnterView.A0.getLineCount()) {
            boolean z11 = false;
            if (chatActivityEnterView.A0.getLineCount() > 2 && chatActivityEnterView.A0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.A0.getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.p1(z10);
            if (chatActivityEnterView.A0.getLineCount() > 2 && chatActivityEnterView.A0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.A0.getText().toString().trim())) {
                z11 = true;
            }
            chatActivityEnterView.v1(z11);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f29650r;
            if (chatActivityEnterView.A0 != null) {
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
                            ArrayList z10 = th.v3.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (th.u4.f(z10, hashMap)) {
                                    if (MessagesController.getInstance(chatActivityEnterView.M).richEditorAvailable()) {
                                        int max = Math.max(0, chatActivityEnterView.A0.getSelectionStart());
                                        int min = Math.min(chatActivityEnterView.A0.getText().length(), chatActivityEnterView.A0.getSelectionEnd());
                                        chatActivityEnterView.K0(chatActivityEnterView.A0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.A0.getText().subSequence(Math.max(max, min), chatActivityEnterView.A0.getText().length()));
                                        return true;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(th.u4.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                                    if (y5VarArr != null) {
                                        for (y5 y5Var : y5VarArr) {
                                            y5Var.applyFontMetrics(chatActivityEnterView.A0.getPaint().getFontMetricsInt(), p5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.A0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.A0.getText().length(), chatActivityEnterView.A0.getSelectionEnd());
                                    pi0[] pi0VarArr = (pi0[]) chatActivityEnterView.A0.getText().getSpans(max2, min2, pi0.class);
                                    if (pi0VarArr != null && pi0VarArr.length > 0) {
                                        pi0[] pi0VarArr2 = (pi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pi0.class);
                                        for (int i11 = 0; i11 < pi0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(pi0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(pi0VarArr2[i11].f31683a);
                                        }
                                    } else {
                                        qi0.a(spannableStringBuilder);
                                    }
                                    jf jfVar = chatActivityEnterView.A0;
                                    jfVar.setText(jfVar.getText().replace(max2, min2, spannableStringBuilder));
                                    chatActivityEnterView.A0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.A0.getText().length()));
                                    return true;
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f29650r;
        if (chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0) {
                this.f29648f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f29649n = true;
            } else if (this.f29649n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f29648f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f29649n = false;
                }
            } else if (this.f29649n) {
                if (chatActivityEnterView.U2 != null) {
                    int i10 = org.telegram.ui.ActionBar.g6.f23392vf;
                    int i11 = ChatActivityEnterView.f26085i5;
                    setHandlesColor(chatActivityEnterView.i0(i10));
                    chatActivityEnterView.U2.r1();
                }
                jf jfVar = chatActivityEnterView.A0;
                if (jfVar != null && !AndroidUtilities.showKeyboard(jfVar)) {
                    chatActivityEnterView.A0.clearFocus();
                    chatActivityEnterView.A0.requestFocus();
                }
            }
            return this.f29649n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.U2 != null) {
            int i12 = org.telegram.ui.ActionBar.g6.f23392vf;
            int i13 = ChatActivityEnterView.f26085i5;
            setHandlesColor(chatActivityEnterView.i0(i12));
            chatActivityEnterView.U2.r1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f9) {
        super.setOffsetY(f9);
        this.f29650r.f26194t1.invalidate();
    }
}
