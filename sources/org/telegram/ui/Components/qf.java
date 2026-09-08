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
public final class qf extends ng {
    public boolean f29730e;
    public float f29731f;
    public float h;
    public boolean f29732n;
    public final ChatActivityEnterView f29733r;

    public qf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(chatActivityEnterView, context, f6Var);
        this.f29733r = chatActivityEnterView;
        this.f29730e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f29733r;
        View view = chatActivityEnterView.I4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        if (coVar != null && coVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.O2.getParentLayout()).f20167b) {
            setWindowView(chatActivityEnterView.O2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.N2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.f29730e) {
            this.f29730e = false;
            this.f29733r.K(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f29733r;
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z11 = false;
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.p1(z10);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z11 = true;
            }
            chatActivityEnterView.v1(z11);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f29733r;
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
                            ArrayList z10 = ji.d4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (ji.f5.f(z10, hashMap)) {
                                    if (MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                                        int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                        int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                        chatActivityEnterView.K0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()));
                                        return true;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ji.f5.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class);
                                    if (z5VarArr != null) {
                                        for (z5 z5Var : z5VarArr) {
                                            z5Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), q5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    ri0[] ri0VarArr = (ri0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, ri0.class);
                                    if (ri0VarArr != null && ri0VarArr.length > 0) {
                                        ri0[] ri0VarArr2 = (ri0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ri0.class);
                                        for (int i11 = 0; i11 < ri0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(ri0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(ri0VarArr2[i11].f30057a);
                                        }
                                    } else {
                                        si0.a(spannableStringBuilder);
                                    }
                                    qf qfVar = chatActivityEnterView.E0;
                                    qfVar.setText(qfVar.getText().replace(max2, min2, spannableStringBuilder));
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
        ChatActivityEnterView chatActivityEnterView = this.f29733r;
        if (chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0) {
                this.f29731f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f29732n = true;
            } else if (this.f29732n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f29731f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f29732n = false;
                }
            } else if (this.f29732n) {
                if (chatActivityEnterView.Y2 != null) {
                    int i10 = org.telegram.ui.ActionBar.j6.f21025vf;
                    int i11 = ChatActivityEnterView.f23688m5;
                    setHandlesColor(chatActivityEnterView.i0(i10));
                    chatActivityEnterView.Y2.l1();
                }
                qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null && !AndroidUtilities.showKeyboard(qfVar)) {
                    chatActivityEnterView.E0.clearFocus();
                    chatActivityEnterView.E0.requestFocus();
                }
            }
            return this.f29732n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.Y2 != null) {
            int i12 = org.telegram.ui.ActionBar.j6.f21025vf;
            int i13 = ChatActivityEnterView.f23688m5;
            setHandlesColor(chatActivityEnterView.i0(i12));
            chatActivityEnterView.Y2.l1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.f29733r.f23822x1.invalidate();
    }
}
