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
public final class ff extends dg {
    public boolean f28406e;
    public float f28407f;
    public float h;
    public boolean f28408n;
    public final ChatActivityEnterView f28409r;

    public ff(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(chatActivityEnterView, context, b6Var);
        this.f28409r = chatActivityEnterView;
        this.f28406e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f28409r;
        View view = chatActivityEnterView.E4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar != null && qnVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.K2.getParentLayout()).f22647b) {
            setWindowView(chatActivityEnterView.K2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.J2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.f28406e) {
            this.f28406e = false;
            this.f28409r.J(true);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        super.onMeasure(i9, i10);
        ChatActivityEnterView chatActivityEnterView = this.f28409r;
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
    public final boolean onTextContextMenuItem(int i9) {
        ClipData primaryClip;
        if (i9 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f28409r;
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
                            ArrayList z10 = qh.u3.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (qh.t4.f(z10, hashMap)) {
                                    if (MessagesController.getInstance(chatActivityEnterView.M).richEditorAvailable()) {
                                        int max = Math.max(0, chatActivityEnterView.A0.getSelectionStart());
                                        int min = Math.min(chatActivityEnterView.A0.getText().length(), chatActivityEnterView.A0.getSelectionEnd());
                                        chatActivityEnterView.K0(chatActivityEnterView.A0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.A0.getText().subSequence(Math.max(max, min), chatActivityEnterView.A0.getText().length()));
                                        return true;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qh.t4.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class);
                                    if (t5VarArr != null) {
                                        for (t5 t5Var : t5VarArr) {
                                            t5Var.applyFontMetrics(chatActivityEnterView.A0.getPaint().getFontMetricsInt(), k5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.A0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.A0.getText().length(), chatActivityEnterView.A0.getSelectionEnd());
                                    ei0[] ei0VarArr = (ei0[]) chatActivityEnterView.A0.getText().getSpans(max2, min2, ei0.class);
                                    if (ei0VarArr != null && ei0VarArr.length > 0) {
                                        ei0[] ei0VarArr2 = (ei0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ei0.class);
                                        for (int i10 = 0; i10 < ei0VarArr2.length; i10++) {
                                            spannableStringBuilder.removeSpan(ei0VarArr2[i10]);
                                            spannableStringBuilder.removeSpan(ei0VarArr2[i10].f28034a);
                                        }
                                    } else {
                                        fi0.a(spannableStringBuilder);
                                    }
                                    ff ffVar = chatActivityEnterView.A0;
                                    ffVar.setText(ffVar.getText().replace(max2, min2, spannableStringBuilder));
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
        return super.onTextContextMenuItem(i9);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f28409r;
        if (chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0) {
                this.f28407f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f28408n = true;
            } else if (this.f28408n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f28407f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f28408n = false;
                }
            } else if (this.f28408n) {
                if (chatActivityEnterView.U2 != null) {
                    int i9 = org.telegram.ui.ActionBar.f6.f23325vf;
                    int i10 = ChatActivityEnterView.f26074i5;
                    setHandlesColor(chatActivityEnterView.h0(i9));
                    chatActivityEnterView.U2.i1();
                }
                ff ffVar = chatActivityEnterView.A0;
                if (ffVar != null && !AndroidUtilities.showKeyboard(ffVar)) {
                    chatActivityEnterView.A0.clearFocus();
                    chatActivityEnterView.A0.requestFocus();
                }
            }
            return this.f28408n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.U2 != null) {
            int i11 = org.telegram.ui.ActionBar.f6.f23325vf;
            int i12 = ChatActivityEnterView.f26074i5;
            setHandlesColor(chatActivityEnterView.h0(i11));
            chatActivityEnterView.U2.i1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f28409r.f26183t1.invalidate();
    }
}
