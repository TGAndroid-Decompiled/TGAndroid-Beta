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
    public boolean e;
    public float f24868f;
    public float h;
    public boolean f24869n;
    public final ChatActivityEnterView f24870r;

    public ff(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(chatActivityEnterView, context, f6Var);
        this.f24870r = chatActivityEnterView;
        this.e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f24870r;
        View view = chatActivityEnterView.F4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar != null && xnVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.L2.getParentLayout()).f19450b) {
            setWindowView(chatActivityEnterView.L2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.K2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.e) {
            this.e = false;
            this.f24870r.J(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f24870r;
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
            ChatActivityEnterView chatActivityEnterView = this.f24870r;
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
                            ArrayList z4 = vh.x3.z(htmlText, hashMap);
                            if (!z4.isEmpty()) {
                                if (vh.w4.f(z4, hashMap)) {
                                    if (MessagesController.getInstance(chatActivityEnterView.N).richEditorAvailable()) {
                                        int max = Math.max(0, chatActivityEnterView.B0.getSelectionStart());
                                        int min = Math.min(chatActivityEnterView.B0.getText().length(), chatActivityEnterView.B0.getSelectionEnd());
                                        chatActivityEnterView.K0(chatActivityEnterView.B0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.B0.getText().subSequence(Math.max(max, min), chatActivityEnterView.B0.getText().length()));
                                        return true;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vh.w4.j(z4, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    u5[] u5VarArr = (u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class);
                                    if (u5VarArr != null) {
                                        for (u5 u5Var : u5VarArr) {
                                            u5Var.applyFontMetrics(chatActivityEnterView.B0.getPaint().getFontMetricsInt(), l5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.B0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.B0.getText().length(), chatActivityEnterView.B0.getSelectionEnd());
                                    yi0[] yi0VarArr = (yi0[]) chatActivityEnterView.B0.getText().getSpans(max2, min2, yi0.class);
                                    if (yi0VarArr != null && yi0VarArr.length > 0) {
                                        yi0[] yi0VarArr2 = (yi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), yi0.class);
                                        for (int i11 = 0; i11 < yi0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(yi0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(yi0VarArr2[i11].f31025a);
                                        }
                                    } else {
                                        zi0.a(spannableStringBuilder);
                                    }
                                    ff ffVar = chatActivityEnterView.B0;
                                    ffVar.setText(ffVar.getText().replace(max2, min2, spannableStringBuilder));
                                    chatActivityEnterView.B0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.B0.getText().length()));
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
        ChatActivityEnterView chatActivityEnterView = this.f24870r;
        if (chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0) {
                this.f24868f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f24869n = true;
            } else if (this.f24869n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f24868f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f24869n = false;
                }
            } else if (this.f24869n) {
                if (chatActivityEnterView.V2 != null) {
                    int i10 = org.telegram.ui.ActionBar.j6.f20234vf;
                    int i11 = ChatActivityEnterView.f22729j5;
                    setHandlesColor(chatActivityEnterView.i0(i10));
                    chatActivityEnterView.V2.t1();
                }
                ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null && !AndroidUtilities.showKeyboard(ffVar)) {
                    chatActivityEnterView.B0.clearFocus();
                    chatActivityEnterView.B0.requestFocus();
                }
            }
            return this.f24869n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.V2 != null) {
            int i12 = org.telegram.ui.ActionBar.j6.f20234vf;
            int i13 = ChatActivityEnterView.f22729j5;
            setHandlesColor(chatActivityEnterView.i0(i12));
            chatActivityEnterView.V2.t1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f24870r.f22843u1.invalidate();
    }
}
