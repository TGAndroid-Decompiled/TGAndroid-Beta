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
    public boolean e;
    public float f28825f;
    public float h;
    public boolean f28826n;
    public final ChatActivityEnterView f28827r;

    public rf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(chatActivityEnterView, context, c6Var);
        this.f28827r = chatActivityEnterView;
        this.e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f28827r;
        View view = chatActivityEnterView.J4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.fo foVar = chatActivityEnterView.P2;
        if (foVar != null && foVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).f19492b) {
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
            this.f28827r.I(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f28827r;
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
            ChatActivityEnterView chatActivityEnterView = this.f28827r;
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
                            ArrayList z10 = ji.f4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (ji.g5.f(z10, hashMap)) {
                                    if (MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                                        int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                        int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                        chatActivityEnterView.I0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()));
                                        return true;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ji.g5.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    b6[] b6VarArr = (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class);
                                    if (b6VarArr != null) {
                                        for (b6 b6Var : b6VarArr) {
                                            b6Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), s5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    sj0[] sj0VarArr = (sj0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, sj0.class);
                                    if (sj0VarArr != null && sj0VarArr.length > 0) {
                                        sj0[] sj0VarArr2 = (sj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), sj0.class);
                                        for (int i11 = 0; i11 < sj0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(sj0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(sj0VarArr2[i11].f29146a);
                                        }
                                    } else {
                                        tj0.a(spannableStringBuilder);
                                    }
                                    rf rfVar = chatActivityEnterView.E0;
                                    rfVar.setText(rfVar.getText().replace(max2, min2, spannableStringBuilder));
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
        ChatActivityEnterView chatActivityEnterView = this.f28827r;
        if (chatActivityEnterView.u()) {
            if (motionEvent.getAction() == 0) {
                this.f28825f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f28826n = true;
            } else if (this.f28826n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f28825f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f28826n = false;
                }
            } else if (this.f28826n) {
                if (chatActivityEnterView.Z2 != null) {
                    int i10 = org.telegram.ui.ActionBar.g6.f20242vf;
                    int i11 = ChatActivityEnterView.f22849n5;
                    setHandlesColor(chatActivityEnterView.g0(i10));
                    chatActivityEnterView.Z2.m1();
                }
                rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null && !AndroidUtilities.showKeyboard(rfVar)) {
                    chatActivityEnterView.E0.clearFocus();
                    chatActivityEnterView.E0.requestFocus();
                }
            }
            return this.f28826n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
            int i12 = org.telegram.ui.ActionBar.g6.f20242vf;
            int i13 = ChatActivityEnterView.f22849n5;
            setHandlesColor(chatActivityEnterView.g0(i12));
            chatActivityEnterView.Z2.m1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.f28827r.f22990y1.invalidate();
    }
}
