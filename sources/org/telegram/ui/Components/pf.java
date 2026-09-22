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
public final class pf extends mg {
    public boolean e;
    public float f27341f;
    public float h;
    public boolean f27342n;
    public final ChatActivityEnterView f27343r;

    public pf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(chatActivityEnterView, context, f6Var);
        this.f27343r = chatActivityEnterView;
        this.e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f27343r;
        View view = chatActivityEnterView.J4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.zn znVar = chatActivityEnterView.P2;
        if (znVar != null && znVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).f18613b) {
            setWindowView(chatActivityEnterView.P2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.O2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.e) {
            this.e = false;
            this.f27343r.K(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f27343r;
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
            ChatActivityEnterView chatActivityEnterView = this.f27343r;
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
                                    y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                                    if (y5VarArr != null) {
                                        for (y5 y5Var : y5VarArr) {
                                            y5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), p5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    ej0[] ej0VarArr = (ej0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, ej0.class);
                                    if (ej0VarArr != null && ej0VarArr.length > 0) {
                                        ej0[] ej0VarArr2 = (ej0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ej0.class);
                                        for (int i11 = 0; i11 < ej0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(ej0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(ej0VarArr2[i11].f23958a);
                                        }
                                    } else {
                                        fj0.a(spannableStringBuilder);
                                    }
                                    pf pfVar = chatActivityEnterView.E0;
                                    pfVar.setText(pfVar.getText().replace(max2, min2, spannableStringBuilder));
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
        ChatActivityEnterView chatActivityEnterView = this.f27343r;
        if (chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0) {
                this.f27341f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f27342n = true;
            } else if (this.f27342n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f27341f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f27342n = false;
                }
            } else if (this.f27342n) {
                if (chatActivityEnterView.Z2 != null) {
                    int i10 = org.telegram.ui.ActionBar.j6.f19448vf;
                    int i11 = ChatActivityEnterView.f21967n5;
                    setHandlesColor(chatActivityEnterView.i0(i10));
                    chatActivityEnterView.Z2.s1();
                }
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null && !AndroidUtilities.showKeyboard(pfVar)) {
                    chatActivityEnterView.E0.clearFocus();
                    chatActivityEnterView.E0.requestFocus();
                }
            }
            return this.f27342n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
            int i12 = org.telegram.ui.ActionBar.j6.f19448vf;
            int i13 = ChatActivityEnterView.f21967n5;
            setHandlesColor(chatActivityEnterView.i0(i12));
            chatActivityEnterView.Z2.s1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.f27343r.f22107y1.invalidate();
    }
}
