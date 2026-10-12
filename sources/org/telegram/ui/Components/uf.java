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
public final class uf extends rg {
    public boolean f31148e;
    public float f31149f;
    public float h;
    public boolean f31150n;
    public final ChatActivityEnterView f31151r;

    public uf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(chatActivityEnterView, context, c6Var);
        this.f31151r = chatActivityEnterView;
        this.f31148e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f31151r;
        View view = chatActivityEnterView.f23693m5;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
        if (eoVar != null && eoVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).f20083b) {
            setWindowView(chatActivityEnterView.P2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.O2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.f31148e) {
            this.f31148e = false;
            this.f31151r.L(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f31151r;
        if (!chatActivityEnterView.f23691m3 && chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z11 = false;
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.r1(z10);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z11 = true;
            }
            chatActivityEnterView.x1(z11);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        ChatActivityEnterView chatActivityEnterView = this.f31151r;
        if (!chatActivityEnterView.f23691m3 && i10 == 16908322 && chatActivityEnterView.E0 != null) {
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
                            if (ii.d5.f(z10, hashMap)) {
                                if (MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                                    int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    chatActivityEnterView.M0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()));
                                    return true;
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.d5.j(z10, false));
                                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                b6[] b6VarArr = (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class);
                                if (b6VarArr != null) {
                                    for (b6 b6Var : b6VarArr) {
                                        b6Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), s5.g());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                zj0[] zj0VarArr = (zj0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, zj0.class);
                                if (zj0VarArr != null && zj0VarArr.length > 0) {
                                    zj0[] zj0VarArr2 = (zj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zj0.class);
                                    for (int i11 = 0; i11 < zj0VarArr2.length; i11++) {
                                        spannableStringBuilder.removeSpan(zj0VarArr2[i11]);
                                        spannableStringBuilder.removeSpan(zj0VarArr2[i11].f33392a);
                                    }
                                } else {
                                    ak0.a(spannableStringBuilder);
                                }
                                uf ufVar = chatActivityEnterView.E0;
                                ufVar.setText(ufVar.getText().replace(max2, min2, spannableStringBuilder));
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
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.f31151r;
        if (chatActivityEnterView.v()) {
            if (motionEvent.getAction() == 0) {
                this.f31149f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f31150n = true;
            } else if (this.f31150n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f31149f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f31150n = false;
                }
            } else if (this.f31150n) {
                if (chatActivityEnterView.Z2 != null) {
                    int i10 = org.telegram.ui.ActionBar.h6.f20900vf;
                    int i11 = ChatActivityEnterView.Q5;
                    setHandlesColor(chatActivityEnterView.j0(i10));
                    chatActivityEnterView.Z2.x1();
                }
                uf ufVar = chatActivityEnterView.E0;
                if (ufVar != null && !AndroidUtilities.showKeyboard(ufVar)) {
                    chatActivityEnterView.E0.clearFocus();
                    chatActivityEnterView.E0.requestFocus();
                }
            }
            return this.f31150n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
            int i12 = org.telegram.ui.ActionBar.h6.f20900vf;
            int i13 = ChatActivityEnterView.Q5;
            setHandlesColor(chatActivityEnterView.j0(i12));
            chatActivityEnterView.Z2.x1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        ChatActivityEnterView chatActivityEnterView = this.f31151r;
        if (chatActivityEnterView.f23691m3) {
            chatActivityEnterView.f23665h3.invalidate();
        } else {
            chatActivityEnterView.f23766y1.invalidate();
        }
    }
}
