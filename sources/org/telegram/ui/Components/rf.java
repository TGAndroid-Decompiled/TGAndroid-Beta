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
public final class rf extends og {
    public boolean f30452e;
    public float f30453f;
    public float h;
    public boolean f30454n;
    public final ChatActivityEnterView f30455r;

    public rf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(chatActivityEnterView, context, d6Var);
        this.f30455r = chatActivityEnterView;
        this.f30452e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f30455r;
        View view = chatActivityEnterView.J4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (ynVar != null && ynVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).f20319b) {
            setWindowView(chatActivityEnterView.P2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.O2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.f30452e) {
            this.f30452e = false;
            this.f30455r.I(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f30455r;
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
            ChatActivityEnterView chatActivityEnterView = this.f30455r;
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
                            ArrayList z10 = ii.e4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (ii.e5.f(z10, hashMap)) {
                                    if (MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                                        int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                        int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                        chatActivityEnterView.K0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()));
                                        return true;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.e5.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                                    if (z5VarArr != null) {
                                        for (z5 z5Var : z5VarArr) {
                                            z5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), q5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    ej0[] ej0VarArr = (ej0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, ej0.class);
                                    if (ej0VarArr != null && ej0VarArr.length > 0) {
                                        ej0[] ej0VarArr2 = (ej0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ej0.class);
                                        for (int i11 = 0; i11 < ej0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(ej0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(ej0VarArr2[i11].f26148a);
                                        }
                                    } else {
                                        fj0.a(spannableStringBuilder);
                                    }
                                    rf rfVar = chatActivityEnterView.E0;
                                    rfVar.setText(rfVar.getText().replace(max2, min2, spannableStringBuilder));
                                    chatActivityEnterView.E0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.E0.getText().length()));
                                    return true;
                                }
                            }
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f30455r;
        if (chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0) {
                this.f30453f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f30454n = true;
            } else if (this.f30454n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f30453f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f30454n = false;
                }
            } else if (this.f30454n) {
                if (chatActivityEnterView.Z2 != null) {
                    int i10 = org.telegram.ui.ActionBar.i6.f21170vf;
                    int i11 = ChatActivityEnterView.f23854n5;
                    setHandlesColor(chatActivityEnterView.i0(i10));
                    chatActivityEnterView.Z2.r1();
                }
                rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null && !AndroidUtilities.showKeyboard(rfVar)) {
                    chatActivityEnterView.E0.clearFocus();
                    chatActivityEnterView.E0.requestFocus();
                }
            }
            return this.f30454n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
            int i12 = org.telegram.ui.ActionBar.i6.f21170vf;
            int i13 = ChatActivityEnterView.f23854n5;
            setHandlesColor(chatActivityEnterView.i0(i12));
            chatActivityEnterView.Z2.r1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.f30455r.f23995y1.invalidate();
    }
}
