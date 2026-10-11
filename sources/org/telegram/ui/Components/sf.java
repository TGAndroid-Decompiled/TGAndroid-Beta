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
public final class sf extends pg {
    public boolean f30730e;
    public float f30731f;
    public float h;
    public boolean f30732n;
    public final ChatActivityEnterView f30733r;

    public sf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(chatActivityEnterView, context, d6Var);
        this.f30733r = chatActivityEnterView;
        this.f30730e = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.f30733r;
        View view = chatActivityEnterView.J4;
        if (view != null) {
            setWindowView(view);
            return;
        }
        org.telegram.ui.zn znVar = chatActivityEnterView.P2;
        if (znVar != null && znVar.getParentLayout() != null && ((ActionBarLayout) chatActivityEnterView.P2.getParentLayout()).f20310b) {
            setWindowView(chatActivityEnterView.P2.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.O2.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getLayout() != null && this.f30730e) {
            this.f30730e = false;
            this.f30733r.I(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        ChatActivityEnterView chatActivityEnterView = this.f30733r;
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
            ChatActivityEnterView chatActivityEnterView = this.f30733r;
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
                            ArrayList z10 = ii.f4.z(htmlText, hashMap);
                            if (!z10.isEmpty()) {
                                if (ii.e5.f(z10, hashMap)) {
                                    if (MessagesController.getInstance(chatActivityEnterView.Q).richEditorAvailable()) {
                                        int max = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                        int min = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                        chatActivityEnterView.I0(chatActivityEnterView.E0.getText().subSequence(0, Math.min(max, min)), htmlText, chatActivityEnterView.E0.getText().subSequence(Math.max(max, min), chatActivityEnterView.E0.getText().length()));
                                        return true;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.e5.j(z10, false));
                                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
                                    b6[] b6VarArr = (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class);
                                    if (b6VarArr != null) {
                                        for (b6 b6Var : b6VarArr) {
                                            b6Var.applyFontMetrics(chatActivityEnterView.E0.getPaint().getFontMetricsInt(), s5.g());
                                        }
                                    }
                                    int max2 = Math.max(0, chatActivityEnterView.E0.getSelectionStart());
                                    int min2 = Math.min(chatActivityEnterView.E0.getText().length(), chatActivityEnterView.E0.getSelectionEnd());
                                    yj0[] yj0VarArr = (yj0[]) chatActivityEnterView.E0.getText().getSpans(max2, min2, yj0.class);
                                    if (yj0VarArr != null && yj0VarArr.length > 0) {
                                        yj0[] yj0VarArr2 = (yj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), yj0.class);
                                        for (int i11 = 0; i11 < yj0VarArr2.length; i11++) {
                                            spannableStringBuilder.removeSpan(yj0VarArr2[i11]);
                                            spannableStringBuilder.removeSpan(yj0VarArr2[i11].f33287a);
                                        }
                                    } else {
                                        zj0.a(spannableStringBuilder);
                                    }
                                    sf sfVar = chatActivityEnterView.E0;
                                    sfVar.setText(sfVar.getText().replace(max2, min2, spannableStringBuilder));
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
        ChatActivityEnterView chatActivityEnterView = this.f30733r;
        if (chatActivityEnterView.u()) {
            if (motionEvent.getAction() == 0) {
                this.f30731f = motionEvent.getX();
                this.h = motionEvent.getY();
                this.f30732n = true;
            } else if (this.f30732n && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.f30731f) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.h) > AndroidUtilities.touchSlop) {
                    this.f30732n = false;
                }
            } else if (this.f30732n) {
                if (chatActivityEnterView.Z2 != null) {
                    int i10 = org.telegram.ui.ActionBar.h6.f21126vf;
                    int i11 = ChatActivityEnterView.f23842n5;
                    setHandlesColor(chatActivityEnterView.g0(i10));
                    chatActivityEnterView.Z2.x1();
                }
                sf sfVar = chatActivityEnterView.E0;
                if (sfVar != null && !AndroidUtilities.showKeyboard(sfVar)) {
                    chatActivityEnterView.E0.clearFocus();
                    chatActivityEnterView.E0.requestFocus();
                }
            }
            return this.f30732n;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.Z2 != null) {
            int i12 = org.telegram.ui.ActionBar.h6.f21126vf;
            int i13 = ChatActivityEnterView.f23842n5;
            setHandlesColor(chatActivityEnterView.g0(i12));
            chatActivityEnterView.Z2.x1();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f7) {
        super.setOffsetY(f7);
        this.f30733r.f23983y1.invalidate();
    }
}
