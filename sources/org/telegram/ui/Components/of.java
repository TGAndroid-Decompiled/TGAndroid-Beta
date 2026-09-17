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
public final class of extends lg {
    public boolean e;
    public float f26720f;
    public float h;
    public boolean f26721n;
    public final ChatActivityEnterView f26722r;

    public of(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(chatActivityEnterView, context, f6Var);
        this.f26722r = chatActivityEnterView;
        this.e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f26722r;
        View view = chatActivityEnterView.I4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.bo boVar = chatActivityEnterView.O2;
        if (boVar != null && boVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.O2.getParentLayout()).f18390b) {
            setWindowView(chatActivityEnterView.O2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.N2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.e) {
            this.e = false;
            this.f26722r.K(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f26722r;
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z11 = false;
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.o1(z10);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z11 = true;
            }
            chatActivityEnterView.u1(z11);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f26722r;
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
                            ArrayList z10 = ii.d4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (ii.c5.f(z10, hashMap)) {
                                    if (MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                                        int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                        int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                        chatActivityEnterView.K0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()));
                                        return true;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.c5.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class);
                                    if (x5VarArr != null) {
                                        for (x5 x5Var : x5VarArr) {
                                            x5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), o5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    si0[] si0VarArr = (si0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, si0.class);
                                    if (si0VarArr != null && si0VarArr.length > 0) {
                                        si0[] si0VarArr2 = (si0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), si0.class);
                                        for (int i11 = 0; i11 < si0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(si0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(si0VarArr2[i11].f27870a);
                                        }
                                    } else {
                                        ti0.a(spannableStringBuilder);
                                    }
                                    of ofVar = chatActivityEnterView.E0;
                                    ofVar.setText(ofVar.getText().replace(max2, min2, spannableStringBuilder));
                                    chatActivityEnterView.E0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.E0.getText().length()));
                                    return true;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f26722r;
        if (chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0) {
                this.f26720f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f26721n = true;
            } else if (this.f26721n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f26720f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f26721n = false;
                }
            } else if (this.f26721n) {
                if (chatActivityEnterView.Y2 != null) {
                    int i10 = org.telegram.ui.ActionBar.j6.f19200vf;
                    int i11 = ChatActivityEnterView.f21741m5;
                    setHandlesColor(chatActivityEnterView.i0(i10));
                    chatActivityEnterView.Y2.r1();
                }
                of ofVar = chatActivityEnterView.E0;
                if (ofVar != null && !AndroidUtilities.showKeyboard(ofVar)) {
                    chatActivityEnterView.E0.clearFocus();
                    chatActivityEnterView.E0.requestFocus();
                }
            }
            return this.f26721n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.Y2 != null) {
            int i12 = org.telegram.ui.ActionBar.j6.f19200vf;
            int i13 = ChatActivityEnterView.f21741m5;
            setHandlesColor(chatActivityEnterView.i0(i12));
            chatActivityEnterView.Y2.r1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.f26722r.f21874x1.invalidate();
    }
}
