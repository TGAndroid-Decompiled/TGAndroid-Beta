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
public final class pf extends ng {
    public boolean e;
    public float f31593f;
    public float h;
    public boolean f31594n;
    public final ChatActivityEnterView f31595r;

    public pf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(chatActivityEnterView, context, u6Var);
        this.f31595r = chatActivityEnterView;
        this.e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f31595r;
        View view = chatActivityEnterView.J4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (wnVar != null && wnVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).f22307b) {
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
            this.f31595r.F(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f31595r;
        if (chatActivityEnterView.T != chatActivityEnterView.E0.getLineCount()) {
            boolean z11 = false;
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.l1(z10);
            if (chatActivityEnterView.E0.getLineCount() > 2 && chatActivityEnterView.E0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.E0.getText().toString().trim())) {
                z11 = true;
            }
            chatActivityEnterView.r1(z11);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f31595r;
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
                            ArrayList z10 = li.d4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (li.c5.f(z10, hashMap)) {
                                    if (MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                                        int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                        int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                        chatActivityEnterView.H0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()));
                                        return true;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(li.c5.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    c6[] c6VarArr = (c6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c6.class);
                                    if (c6VarArr != null) {
                                        for (c6 c6Var : c6VarArr) {
                                            c6Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), t5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    sj0[] sj0VarArr = (sj0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, sj0.class);
                                    if (sj0VarArr != null && sj0VarArr.length > 0) {
                                        sj0[] sj0VarArr2 = (sj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), sj0.class);
                                        for (int i11 = 0; i11 < sj0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(sj0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(sj0VarArr2[i11].f32608a);
                                        }
                                    } else {
                                        tj0.a(spannableStringBuilder);
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
        ChatActivityEnterView chatActivityEnterView = this.f31595r;
        if (chatActivityEnterView.r()) {
            if (motionEvent.getAction() == 0) {
                this.f31593f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f31594n = true;
            } else if (this.f31594n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f31593f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f31594n = false;
                }
            } else if (this.f31594n) {
                if (chatActivityEnterView.Z2 != null) {
                    org.telegram.ui.ActionBar.f7.m(this, 36, org.telegram.ui.ActionBar.y6.f23701vf, chatActivityEnterView.W3);
                    chatActivityEnterView.Z2.b1();
                }
                pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null && !AndroidUtilities.showKeyboard(pfVar)) {
                    chatActivityEnterView.E0.clearFocus();
                    chatActivityEnterView.E0.requestFocus();
                }
            }
            return this.f31594n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
            org.telegram.ui.ActionBar.f7.m(this, 36, org.telegram.ui.ActionBar.y6.f23701vf, chatActivityEnterView.W3);
            chatActivityEnterView.Z2.b1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.f31595r.f25989y1.invalidate();
    }
}
