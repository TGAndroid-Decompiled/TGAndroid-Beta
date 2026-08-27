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

public final class bf extends zf {

    public boolean f27084e;

    public float f27085f;
    public float h;

    public boolean f27086n;

    public final ChatActivityEnterView f27087r;

    public bf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(chatActivityEnterView, context, c6Var);
        this.f27087r = chatActivityEnterView;
        this.f27084e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f27087r;
        View view = chatActivityEnterView.E4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        if (rnVar == null || rnVar.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.K2.getParentLayout()).f22647b) {
            setWindowView(chatActivityEnterView.J2.getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.K2.getParentLayout().getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() == null || !this.f27084e) {
            return;
        }
        this.f27084e = false;
        this.f27087r.K(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f27087r;
        if (chatActivityEnterView.P != chatActivityEnterView.A0.getLineCount()) {
            boolean z10 = false;
            chatActivityEnterView.o1((chatActivityEnterView.A0.getLineCount() <= 2 || chatActivityEnterView.A0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.A0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.A0.getLineCount() > 2 && chatActivityEnterView.A0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.A0.getText().toString().trim())) {
                z10 = true;
            }
            chatActivityEnterView.u1(z10);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f27087r;
            if (chatActivityEnterView.A0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap map = new HashMap();
                            ArrayList arrayListZ = rh.v3.z(htmlText, map);
                            if (!arrayListZ.isEmpty()) {
                                if (!rh.u4.f(arrayListZ, map)) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rh.u4.j(arrayListZ, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class);
                                    if (t5VarArr != null) {
                                        for (t5 t5Var : t5VarArr) {
                                            t5Var.applyFontMetrics(chatActivityEnterView.A0.getPaint().getFontMetricsInt(), k5.g());
                                        }
                                    }
                                    int iMax = Math.max(0, chatActivityEnterView.A0.getSelectionStart());
                                    int iMin = Math.min(chatActivityEnterView.A0.getText().length(), chatActivityEnterView.A0.getSelectionEnd());
                                    gi0[] gi0VarArr = (gi0[]) chatActivityEnterView.A0.getText().getSpans(iMax, iMin, gi0.class);
                                    if (gi0VarArr == null || gi0VarArr.length <= 0) {
                                        hi0.a(spannableStringBuilder);
                                    } else {
                                        gi0[] gi0VarArr2 = (gi0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gi0.class);
                                        for (int i11 = 0; i11 < gi0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(gi0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(gi0VarArr2[i11].f28717a);
                                        }
                                    }
                                    bf bfVar = chatActivityEnterView.A0;
                                    bfVar.setText(bfVar.getText().replace(iMax, iMin, spannableStringBuilder));
                                    chatActivityEnterView.A0.setSelection(Math.min(iMax + spannableStringBuilder.length(), chatActivityEnterView.A0.getText().length()));
                                    return true;
                                }
                                if (MessagesController.getInstance(chatActivityEnterView.M).richEditorAvailable()) {
                                    int iMax2 = Math.max(0, chatActivityEnterView.A0.getSelectionStart());
                                    int iMin2 = Math.min(chatActivityEnterView.A0.getText().length(), chatActivityEnterView.A0.getSelectionEnd());
                                    chatActivityEnterView.K0(chatActivityEnterView.A0.getText().subSequence(0, Math.min(iMax2, iMin2)), htmlText, chatActivityEnterView.A0.getText().subSequence(Math.max(iMax2, iMin2), chatActivityEnterView.A0.getText().length()));
                                    return true;
                                }
                            }
                        }
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f27087r;
        if (!chatActivityEnterView.w()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.U2 != null) {
                int i10 = org.telegram.ui.ActionBar.g6.f23382vf;
                int i11 = ChatActivityEnterView.f26070i5;
                setHandlesColor(chatActivityEnterView.i0(i10));
                chatActivityEnterView.U2.j1();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f27085f = motionEvent.getX();
            this.h = motionEvent.getY();
            this.f27086n = true;
        } else if (this.f27086n && motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getX() - this.f27085f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                this.f27086n = false;
            }
        } else if (this.f27086n) {
            if (chatActivityEnterView.U2 != null) {
                int i12 = org.telegram.ui.ActionBar.g6.f23382vf;
                int i13 = ChatActivityEnterView.f26070i5;
                setHandlesColor(chatActivityEnterView.i0(i12));
                chatActivityEnterView.U2.j1();
            }
            bf bfVar = chatActivityEnterView.A0;
            if (bfVar != null && !AndroidUtilities.showKeyboard(bfVar)) {
                chatActivityEnterView.A0.clearFocus();
                chatActivityEnterView.A0.requestFocus();
            }
        }
        return this.f27086n;
    }

    @Override
    public final void setOffsetY(float f10) {
        super.setOffsetY(f10);
        this.f27087r.f26179t1.invalidate();
    }
}
