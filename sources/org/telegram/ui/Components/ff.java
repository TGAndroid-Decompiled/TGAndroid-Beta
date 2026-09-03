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
    public boolean f26904e;
    public float f26905f;
    public float h;
    public boolean f26906n;
    public final ChatActivityEnterView f26907r;

    public ff(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(chatActivityEnterView, context, g6Var);
        this.f26907r = chatActivityEnterView;
        this.f26904e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f26907r;
        View view = chatActivityEnterView.F4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar != null && xnVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.L2.getParentLayout()).f21113b) {
            setWindowView(chatActivityEnterView.L2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.K2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.f26904e) {
            this.f26904e = false;
            this.f26907r.J(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f26907r;
        if (chatActivityEnterView.Q != chatActivityEnterView.B0.getLineCount()) {
            boolean z10 = false;
            if (chatActivityEnterView.B0.getLineCount() > 2 && chatActivityEnterView.B0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.B0.getText().toString().trim())) {
                z4 = true;
            } else {
                z4 = false;
            }
            chatActivityEnterView.p1(z4);
            if (chatActivityEnterView.B0.getLineCount() > 2 && chatActivityEnterView.B0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.B0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.v1(z10);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f26907r;
            if (chatActivityEnterView.B0 != null) {
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
                            ArrayList z4 = wh.x3.z(htmlText, hashMap);
                            if (!z4.isEmpty()) {
                                if (wh.w4.f(z4, hashMap)) {
                                    if (MessagesController.getInstance(chatActivityEnterView.N).richEditorAvailable()) {
                                        int max = Math.max(0, chatActivityEnterView.B0.getSelectionStart());
                                        int min = Math.min(chatActivityEnterView.B0.getText().length(), chatActivityEnterView.B0.getSelectionEnd());
                                        chatActivityEnterView.K0(chatActivityEnterView.B0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.B0.getText().subSequence(Math.max(max, min), chatActivityEnterView.B0.getText().length()));
                                        return true;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wh.w4.j(z4, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    u5[] u5VarArr = (u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class);
                                    if (u5VarArr != null) {
                                        for (u5 u5Var : u5VarArr) {
                                            u5Var.applyFontMetrics(chatActivityEnterView.B0.getPaint().getFontMetricsInt(), l5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.B0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.B0.getText().length(), chatActivityEnterView.B0.getSelectionEnd());
                                    aj0[] aj0VarArr = (aj0[]) chatActivityEnterView.B0.getText().getSpans(max2, min2, aj0.class);
                                    if (aj0VarArr != null && aj0VarArr.length > 0) {
                                        aj0[] aj0VarArr2 = (aj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), aj0.class);
                                        for (int i11 = 0; i11 < aj0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(aj0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(aj0VarArr2[i11].f25260a);
                                        }
                                    } else {
                                        bj0.a(spannableStringBuilder);
                                    }
                                    ff ffVar = chatActivityEnterView.B0;
                                    ffVar.setText(ffVar.getText().replace(max2, min2, spannableStringBuilder));
                                    chatActivityEnterView.B0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.B0.getText().length()));
                                    return true;
                                }
                            }
                        }
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f26907r;
        if (chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0) {
                this.f26905f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f26906n = true;
            } else if (this.f26906n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f26905f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f26906n = false;
                }
            } else if (this.f26906n) {
                if (chatActivityEnterView.V2 != null) {
                    int i10 = org.telegram.ui.ActionBar.k6.f21990vf;
                    int i11 = ChatActivityEnterView.f24570j5;
                    setHandlesColor(chatActivityEnterView.i0(i10));
                    chatActivityEnterView.V2.x1();
                }
                ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null && !AndroidUtilities.showKeyboard(ffVar)) {
                    chatActivityEnterView.B0.clearFocus();
                    chatActivityEnterView.B0.requestFocus();
                }
            }
            return this.f26906n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.V2 != null) {
            int i12 = org.telegram.ui.ActionBar.k6.f21990vf;
            int i13 = ChatActivityEnterView.f24570j5;
            setHandlesColor(chatActivityEnterView.i0(i12));
            chatActivityEnterView.V2.x1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f26907r.f24685u1.invalidate();
    }
}
