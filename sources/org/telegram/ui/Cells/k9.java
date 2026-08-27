package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public abstract class k9 extends w9 {
    public boolean A0;

    public final SparseArray f24598u0 = new SparseArray();

    public boolean f24599v0;

    public boolean f24600w0;

    public boolean f24601x0;

    public boolean f24602y0;

    public boolean f24603z0;

    @Override
    public final boolean D() {
        r9 r9Var;
        RichMessageLayout richMessageLayout;
        CharSequence charSequenceS;
        String selectionHtml;
        if (!this.f24603z0 || (r9Var = this.W) == null || ((s1) r9Var).getMessageObject() == null || (richMessageLayout = ((s1) this.W).getMessageObject().richLayout) == null || richMessageLayout.textBlocks.isEmpty() || (charSequenceS = s()) == null || charSequenceS.length() == 0) {
            return false;
        }
        try {
            selectionHtml = richMessageLayout.getSelectionHtml(this.f25895u, this.v);
        } catch (Exception e9) {
            FileLog.e(e9);
            selectionHtml = null;
        }
        if (selectionHtml == null || selectionHtml.length() == 0) {
            return false;
        }
        AndroidUtilities.addToClipboard(charSequenceS, selectionHtml);
        return true;
    }

    @Override
    public final void F(boolean z10) {
        r9 r9Var = this.W;
        if (r9Var == null || !((s1) r9Var).f3() || z10) {
            return;
        }
        s1 s1Var = (s1) this.W;
        int id2 = s1Var.getMessageObject().getId();
        SparseArray sparseArray = this.f24598u0;
        Animator animator = (Animator) sparseArray.get(id2);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        s1Var.setSelectedBackgroundProgress(0.01f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new eh.b(s1Var, id2, 2));
        valueAnimatorOfFloat.addListener(new i1(1, s1Var));
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        sparseArray.put(id2, valueAnimatorOfFloat);
    }

    @Override
    public final void M(r9 r9Var, r9 r9Var2) {
        s1 s1Var = (s1) r9Var;
        s1 s1Var2 = (s1) r9Var2;
        boolean z10 = s1Var2 == null || !(s1Var2.getMessageObject() == null || s1Var2.getMessageObject().getId() == s1Var.getMessageObject().getId());
        this.f25896w = s1Var.getMessageObject().getId();
        try {
            int i10 = s1Var.getMessageObject().messageOwner.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f24599v0 = this.f24600w0;
        this.f24601x0 = this.f24602y0;
        this.f24603z0 = this.A0;
        int i11 = this.f25896w;
        SparseArray sparseArray = this.f24598u0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ig.y(4, this, z10));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.start();
        sparseArray.put(this.f25896w, valueAnimatorOfFloat);
        if (!z10) {
            s1Var.setSelectedBackgroundProgress(0.0f);
        }
        SharedConfig.removeTextSelectionHint();
    }

    public final void X(MessageObject messageObject) {
        try {
            int i10 = messageObject.messageOwner.edit_date;
        } catch (Exception unused) {
        }
        if (this.f25896w == messageObject.getId()) {
            f(true);
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (this.f24599v0) {
            Paint paint = this.f25885p;
            Paint paint2 = this.f25883o;
            if (z10) {
                int i10 = org.telegram.ui.ActionBar.g6.Vb;
                paint2.setColor(u(i10));
                paint.setColor(u(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.g6.f23366uf;
                paint2.setColor(u(i11));
                paint.setColor(u(i11));
            }
            i(canvas, staticLayout, this.f25895u, this.v, true, true, 0.0f);
        }
    }

    public final void Z(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        r9 r9Var;
        Canvas canvas2;
        if (!this.f24603z0 || richMessageLayout == null || (r9Var = this.W) == null || ((s1) r9Var).getMessageObject() == null || ((s1) this.W).getMessageObject().getId() != messageObject.getId()) {
            return;
        }
        boolean zIsOutOwner = messageObject.isOutOwner();
        Paint paint = this.f25885p;
        Paint paint2 = this.f25883o;
        if (zIsOutOwner) {
            int i10 = org.telegram.ui.ActionBar.g6.Vb;
            paint2.setColor(u(i10));
            paint.setColor(u(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.g6.f23366uf;
            paint2.setColor(u(i11));
            paint.setColor(u(i11));
        }
        int i12 = 0;
        while (i12 < richMessageLayout.textBlocks.size()) {
            u9 u9Var = richMessageLayout.textBlocks.get(i12);
            Layout layout = u9Var.getLayout();
            if (layout == null || layout.getText() == null) {
                canvas2 = canvas;
            } else {
                int iIntValue = richMessageLayout.textBlockCharOffsets.get(i12).intValue();
                int length = layout.getText().length();
                int iClamp = Utilities.clamp(this.f25895u - iIntValue, length, 0);
                int iClamp2 = Utilities.clamp(this.v - iIntValue, length, 0);
                if (iClamp == iClamp2) {
                    canvas2 = canvas;
                } else {
                    boolean z10 = this.f25895u >= iIntValue;
                    boolean z11 = this.v <= iIntValue + length;
                    canvas.save();
                    canvas.translate(u9Var.getX(), u9Var.getY());
                    canvas2 = canvas;
                    i(canvas2, layout, iClamp, iClamp2, z10, z11, 0.0f);
                    canvas2.restore();
                }
            }
            i12++;
            canvas = canvas2;
        }
    }

    public final void a0(s1 s1Var, int i10, int i11) {
        if (s1Var == null) {
            return;
        }
        this.W = s1Var;
        this.f25896w = s1Var.getMessageObject().getId();
        this.f25895u = i10;
        this.v = i11;
        x();
        h7.j0 j0Var = this.D;
        if (j0Var != null) {
            j0Var.a(true);
        }
        this.f25869g = 0.0f;
        this.f25867f = 0.0f;
        this.f25865e = false;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        V();
    }

    public final void b0(s1 s1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = s1Var;
        MessageObject messageObject = s1Var.getMessageObject();
        r1 r1Var = s1Var.Vc;
        boolean z10 = this.f24600w0;
        Rect rect = this.B;
        if (z10 && s1Var.getDescriptionlayout() != null) {
            int i10 = this.f25862c;
            rect.set(i10, this.d, s1Var.getDescriptionlayout().getWidth() + i10, s1Var.getDescriptionlayout().getHeight() + this.d);
            return;
        }
        if (this.f24602y0 && s1Var.getFactCheckLayout() != null) {
            int i11 = this.f25862c;
            rect.set(i11, this.d, s1Var.getFactCheckLayout().getWidth() + i11, s1Var.getFactCheckLayout().getHeight() + this.d);
            return;
        }
        if (this.A0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i12 = this.f25862c;
            rect.set(i12, this.d, richMessageLayout2.getMinWidth() + i12, richMessageLayout2.getHeight() + this.d);
        } else if (s1Var.O2() && s1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) i0.a.i(1, s1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.f25862c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(s1Var.getCaptionLayout().textLayoutBlocks, r1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.textLayoutBlocks) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) i0.a.i(1, messageObject.textLayoutBlocks);
            int i14 = this.f25862c;
            rect.set(i14, this.d, textLayoutBlock2.textLayout.getWidth() + i14, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, r1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        }
    }

    public final void c0(int i10, int i11) {
        if (this.f25858a == i10 && this.f25860b == i11) {
            return;
        }
        this.f25858a = i10;
        this.f25860b = i11;
        x();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f24599v0 = false;
        this.f24601x0 = false;
        this.f24603z0 = false;
    }

    @Override
    public final void j(int i10, m9 m9Var, boolean z10) {
        s1 s1Var = (s1) (z10 ? this.X : this.W);
        if (s1Var == null) {
            m9Var.f24688b = null;
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        int size = 0;
        if (this.f24599v0) {
            m9Var.f24688b = s1Var.getDescriptionlayout();
            m9Var.f24689c = 0.0f;
            m9Var.d = 0.0f;
            m9Var.f24687a = 0;
            return;
        }
        if (this.f24601x0) {
            m9Var.f24688b = s1Var.getFactCheckLayout();
            m9Var.f24689c = 0.0f;
            m9Var.d = 0.0f;
            m9Var.f24687a = 0;
            return;
        }
        if (this.f24603z0) {
            RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
            if (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) {
                m9Var.f24688b = null;
                return;
            }
            while (true) {
                if (size >= richMessageLayout.textBlocks.size()) {
                    size = -1;
                    break;
                }
                int iIntValue = richMessageLayout.textBlockCharOffsets.get(size).intValue();
                int length = richMessageLayout.textBlocks.get(size).getLayout().getText().length();
                if (i10 >= iIntValue && i10 <= iIntValue + length) {
                    break;
                } else {
                    size++;
                }
            }
            if (size < 0) {
                size = richMessageLayout.textBlocks.size() - 1;
            }
            u9 u9Var = richMessageLayout.textBlocks.get(size);
            m9Var.f24688b = u9Var.getLayout();
            m9Var.f24689c = u9Var.getY();
            m9Var.d = u9Var.getX();
            m9Var.f24687a = richMessageLayout.textBlockCharOffsets.get(size).intValue();
            return;
        }
        if (s1Var.O2()) {
            MessageObject.TextLayoutBlocks captionLayout = s1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                MessageObject.TextLayoutBlock textLayoutBlock = captionLayout.textLayoutBlocks.get(0);
                m9Var.f24688b = textLayoutBlock.textLayout;
                m9Var.f24689c = textLayoutBlock.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock2 = captionLayout.textLayoutBlocks.get(0);
                float f10 = -(textLayoutBlock2.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock2.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                m9Var.d = f10;
                if (textLayoutBlock2.code && !textLayoutBlock2.quote) {
                    m9Var.d = f10 + AndroidUtilities.dp(8.0f);
                }
                m9Var.f24687a = 0;
                return;
            }
            for (int i11 = 0; i11 < captionLayout.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock3 = captionLayout.textLayoutBlocks.get(i11);
                int i12 = i10 - textLayoutBlock3.charactersOffset;
                if (i12 >= 0 && i12 <= textLayoutBlock3.textLayout.getText().length()) {
                    m9Var.f24688b = textLayoutBlock3.textLayout;
                    m9Var.f24689c = textLayoutBlock3.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock3.padTop;
                    float f11 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                    m9Var.d = f11;
                    if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                        m9Var.d = f11 + AndroidUtilities.dp(8.0f);
                    }
                    m9Var.f24687a = textLayoutBlock3.charactersOffset;
                    return;
                }
            }
            m9Var.f24688b = null;
            return;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
        if (arrayList == null) {
            m9Var.f24688b = null;
            return;
        }
        if (arrayList.size() == 1) {
            MessageObject.TextLayoutBlock textLayoutBlock4 = messageObject.textLayoutBlocks.get(0);
            m9Var.f24688b = textLayoutBlock4.textLayout;
            m9Var.f24689c = textLayoutBlock4.padTop;
            MessageObject.TextLayoutBlock textLayoutBlock5 = messageObject.textLayoutBlocks.get(0);
            float f12 = -(textLayoutBlock5.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock5.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
            m9Var.d = f12;
            if (textLayoutBlock5.code && !textLayoutBlock5.quote) {
                m9Var.d = f12 + AndroidUtilities.dp(8.0f);
            }
            m9Var.f24687a = 0;
            return;
        }
        for (int i13 = 0; i13 < messageObject.textLayoutBlocks.size(); i13++) {
            MessageObject.TextLayoutBlock textLayoutBlock6 = messageObject.textLayoutBlocks.get(i13);
            int i14 = i10 - textLayoutBlock6.charactersOffset;
            if (i14 >= 0 && i14 <= textLayoutBlock6.textLayout.getText().length()) {
                m9Var.f24688b = textLayoutBlock6.textLayout;
                m9Var.f24689c = textLayoutBlock6.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock6.padTop;
                float f13 = -(textLayoutBlock6.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock6.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                m9Var.d = f13;
                if (textLayoutBlock6.code && !textLayoutBlock6.quote) {
                    m9Var.d = f13 + AndroidUtilities.dp(8.0f);
                }
                m9Var.f24687a = textLayoutBlock6.charactersOffset;
                return;
            }
        }
        m9Var.f24688b = null;
    }

    @Override
    public final int l(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10) {
        StaticLayout staticLayout;
        float fTextYOffset;
        int i14;
        float y10;
        float f10;
        StaticLayout factCheckLayout;
        int lineBottom;
        MessageObject messageObject;
        m9 m9Var;
        int i15;
        Layout layout;
        int i16;
        int i17;
        float f11;
        int i18;
        MessageObject.TextLayoutBlock textLayoutBlock;
        float f12;
        MessageObject.TextLayoutBlocks captionLayout;
        int i19;
        MessageObject.TextLayoutBlock textLayoutBlock2;
        float f13;
        s1 s1Var = (s1) r9Var;
        if (s1Var == null) {
            return 0;
        }
        int i20 = i10 - i12;
        int i21 = i11 - i13;
        boolean z11 = z10 ? this.f24600w0 : this.f24599v0;
        boolean z12 = z10 ? this.f24602y0 : this.f24601x0;
        boolean z13 = z10 ? this.A0 : this.f24603z0;
        if (!z11) {
            if (z12) {
                factCheckLayout = s1Var.getFactCheckLayout();
            } else {
                if (z13) {
                    RichMessageLayout richMessageLayout = s1Var.getMessageObject() != null ? s1Var.getMessageObject().richLayout : null;
                    if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                        u9 u9Var = (u9) i0.a.i(1, richMessageLayout.textBlocks);
                        Layout layout2 = u9Var.getLayout();
                        staticLayout = layout2 instanceof StaticLayout ? (StaticLayout) layout2 : null;
                        y10 = u9Var.getY();
                    }
                } else {
                    if (s1Var.O2()) {
                        MessageObject.TextLayoutBlock textLayoutBlock3 = s1Var.getCaptionLayout().textLayoutBlocks.get(s1Var.getCaptionLayout().textLayoutBlocks.size() - 1);
                        staticLayout = textLayoutBlock3.textLayout;
                        fTextYOffset = textLayoutBlock3.textYOffset(s1Var.getCaptionLayout().textLayoutBlocks);
                        i14 = textLayoutBlock3.padTop;
                    } else {
                        MessageObject.TextLayoutBlock textLayoutBlock4 = s1Var.getMessageObject().textLayoutBlocks.get(s1Var.getMessageObject().textLayoutBlocks.size() - 1);
                        staticLayout = textLayoutBlock4.textLayout;
                        fTextYOffset = textLayoutBlock4.textYOffset(s1Var.getMessageObject().textLayoutBlocks);
                        i14 = textLayoutBlock4.padTop;
                    }
                    y10 = i14 + fTextYOffset;
                }
                StaticLayout staticLayout2 = staticLayout;
                f10 = y10;
                factCheckLayout = staticLayout2;
                if (factCheckLayout != null) {
                    if (i21 < 0) {
                        i21 = 1;
                    }
                    lineBottom = (int) (f10 + factCheckLayout.getLineBottom(factCheckLayout.getLineCount() - 1));
                    if (i21 > lineBottom) {
                        i21 = lineBottom - 1;
                    }
                    r1 r1Var = s1Var.Vc;
                    messageObject = s1Var.getMessageObject();
                    m9Var = this.f25859a0;
                    if (z10 ? !this.f24599v0 : !this.f24600w0) {
                        if (z10 ? this.f24601x0 : this.f24602y0) {
                            m9Var.f24688b = s1Var.getFactCheckLayout();
                            m9Var.d = 0.0f;
                            m9Var.f24689c = 0.0f;
                            m9Var.f24687a = 0;
                        } else if (z10 ? !this.f24603z0 : !this.A0) {
                            i15 = -1;
                            if (!s1Var.O2()) {
                                for (i18 = 0; i18 < messageObject.textLayoutBlocks.size(); i18++) {
                                    textLayoutBlock = messageObject.textLayoutBlocks.get(i18);
                                    f12 = i21;
                                    if (f12 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks) && f12 <= textLayoutBlock.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock.padTop + textLayoutBlock.height(r1Var)) {
                                        m9Var.f24688b = textLayoutBlock.textLayout;
                                        m9Var.f24689c = textLayoutBlock.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock.padTop;
                                        float f14 = -(textLayoutBlock.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : textLayoutBlock.code ? AndroidUtilities.dp(0.0f) : 0) : 0);
                                        m9Var.d = f14;
                                        if (textLayoutBlock.code && !textLayoutBlock.quote) {
                                            m9Var.d = f14 + AndroidUtilities.dp(8.0f);
                                        }
                                        m9Var.f24687a = textLayoutBlock.charactersOffset;
                                        break;
                                    }
                                }
                            } else {
                                captionLayout = s1Var.getCaptionLayout();
                                for (i19 = 0; i19 < captionLayout.textLayoutBlocks.size(); i19++) {
                                    textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i19);
                                    f13 = i21;
                                    if (f13 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) && f13 <= textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock2.padTop + textLayoutBlock2.height(r1Var)) {
                                        m9Var.f24688b = textLayoutBlock2.textLayout;
                                        m9Var.f24689c = textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock2.padTop;
                                        float f15 = -(textLayoutBlock2.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock2.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                                        m9Var.d = f15;
                                        if (textLayoutBlock2.code && !textLayoutBlock2.quote) {
                                            m9Var.d = f15 + AndroidUtilities.dp(8.0f);
                                        }
                                        m9Var.f24687a = textLayoutBlock2.charactersOffset;
                                        break;
                                    }
                                }
                            }
                        } else {
                            RichMessageLayout richMessageLayout2 = messageObject != null ? messageObject.richLayout : null;
                            if (richMessageLayout2 == null || richMessageLayout2.textBlocks.isEmpty()) {
                                i15 = -1;
                                m9Var.f24688b = null;
                            } else {
                                int i22 = Integer.MIN_VALUE;
                                int i23 = -1;
                                int i24 = -1;
                                int i25 = Integer.MAX_VALUE;
                                for (int i26 = 0; i26 < richMessageLayout2.textBlocks.size(); i26++) {
                                    u9 u9Var2 = richMessageLayout2.textBlocks.get(i26);
                                    int y11 = u9Var2.getY();
                                    int height = u9Var2.getLayout().getHeight() + y11;
                                    int x8 = u9Var2.getX();
                                    int width = u9Var2.getLayout().getWidth() + x8;
                                    boolean z14 = i21 >= y11 && i21 < height;
                                    boolean z15 = i20 >= x8 && i20 < width;
                                    u9Var2.getLayout().getText();
                                    if (z14) {
                                        if (x8 <= i20 && x8 > i22) {
                                            i22 = x8;
                                            i23 = i26;
                                        }
                                        int iMin = z15 ? 0 : Math.min(Math.abs(i20 - x8), Math.abs(i20 - width));
                                        if (iMin < i25) {
                                            i25 = iMin;
                                            i24 = i26;
                                        }
                                    }
                                }
                                i15 = -1;
                                if (i23 < 0) {
                                    i23 = i24;
                                }
                                if (i23 < 0) {
                                    int i27 = Integer.MAX_VALUE;
                                    i23 = 0;
                                    for (int i28 = 0; i28 < richMessageLayout2.textBlocks.size(); i28++) {
                                        u9 u9Var3 = richMessageLayout2.textBlocks.get(i28);
                                        int y12 = u9Var3.getY();
                                        int iMin2 = Math.min(Math.abs(i21 - y12), Math.abs(i21 - (u9Var3.getLayout().getHeight() + y12)));
                                        if (iMin2 < i27) {
                                            i23 = i28;
                                            i27 = iMin2;
                                        }
                                    }
                                }
                                u9 u9Var4 = richMessageLayout2.textBlocks.get(i23);
                                m9Var.f24688b = u9Var4.getLayout();
                                m9Var.f24689c = u9Var4.getY();
                                m9Var.d = u9Var4.getX();
                                m9Var.f24687a = richMessageLayout2.textBlockCharOffsets.get(i23).intValue();
                            }
                        }
                        layout = m9Var.f24688b;
                        if (layout == null) {
                            return i15;
                        }
                        i16 = (int) (i20 - m9Var.d);
                        i17 = 0;
                        while (true) {
                            if (i17 >= layout.getLineCount()) {
                                i17 = -1;
                                break;
                            }
                            f11 = i21;
                            if (f11 <= m9Var.f24689c + layout.getLineTop(i17) && f11 < m9Var.f24689c + layout.getLineBottom(i17)) {
                                break;
                            }
                            i17++;
                        }
                        if (i17 >= 0) {
                            return layout.getOffsetForHorizontal(i17, i16) + m9Var.f24687a;
                        }
                        return i15;
                    }
                    m9Var.f24688b = s1Var.getDescriptionlayout();
                    m9Var.d = 0.0f;
                    m9Var.f24689c = 0.0f;
                    m9Var.f24687a = 0;
                    i15 = -1;
                    layout = m9Var.f24688b;
                    if (layout == null) {
                        return i15;
                    }
                    i16 = (int) (i20 - m9Var.d);
                    i17 = 0;
                    while (true) {
                        if (i17 >= layout.getLineCount()) {
                            i17 = -1;
                            break;
                        }
                        f11 = i21;
                        if (f11 <= m9Var.f24689c + layout.getLineTop(i17)) {
                        }
                        i17++;
                    }
                    if (i17 >= 0) {
                        return layout.getOffsetForHorizontal(i17, i16) + m9Var.f24687a;
                    }
                    return i15;
                }
            }
            return -1;
        }
        factCheckLayout = s1Var.getDescriptionlayout();
        f10 = 0.0f;
        if (factCheckLayout != null) {
            if (i21 < 0) {
                i21 = 1;
            }
            lineBottom = (int) (f10 + factCheckLayout.getLineBottom(factCheckLayout.getLineCount() - 1));
            if (i21 > lineBottom) {
                i21 = lineBottom - 1;
            }
            r1 r1Var2 = s1Var.Vc;
            messageObject = s1Var.getMessageObject();
            m9Var = this.f25859a0;
            if (z10) {
                if (z10) {
                    if (z10) {
                        i15 = -1;
                        if (!s1Var.O2()) {
                            captionLayout = s1Var.getCaptionLayout();
                            while (i19 < captionLayout.textLayoutBlocks.size()) {
                                textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i19);
                                f13 = i21;
                                if (f13 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                                }
                            }
                        } else {
                            while (i18 < messageObject.textLayoutBlocks.size()) {
                                textLayoutBlock = messageObject.textLayoutBlocks.get(i18);
                                f12 = i21;
                                if (f12 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                                }
                            }
                        }
                    } else {
                        i15 = -1;
                        if (!s1Var.O2()) {
                            captionLayout = s1Var.getCaptionLayout();
                            while (i19 < captionLayout.textLayoutBlocks.size()) {
                                textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i19);
                                f13 = i21;
                                if (f13 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                                }
                            }
                        } else {
                            while (i18 < messageObject.textLayoutBlocks.size()) {
                                textLayoutBlock = messageObject.textLayoutBlocks.get(i18);
                                f12 = i21;
                                if (f12 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                                }
                            }
                        }
                    }
                } else if (z10) {
                    i15 = -1;
                    if (!s1Var.O2()) {
                        captionLayout = s1Var.getCaptionLayout();
                        while (i19 < captionLayout.textLayoutBlocks.size()) {
                            textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i19);
                            f13 = i21;
                            if (f13 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                            }
                        }
                    } else {
                        while (i18 < messageObject.textLayoutBlocks.size()) {
                            textLayoutBlock = messageObject.textLayoutBlocks.get(i18);
                            f12 = i21;
                            if (f12 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                            }
                        }
                    }
                } else {
                    i15 = -1;
                    if (!s1Var.O2()) {
                        captionLayout = s1Var.getCaptionLayout();
                        while (i19 < captionLayout.textLayoutBlocks.size()) {
                            textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i19);
                            f13 = i21;
                            if (f13 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                            }
                        }
                    } else {
                        while (i18 < messageObject.textLayoutBlocks.size()) {
                            textLayoutBlock = messageObject.textLayoutBlocks.get(i18);
                            f12 = i21;
                            if (f12 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                            }
                        }
                    }
                }
            } else if (z10) {
                if (z10) {
                    i15 = -1;
                    if (!s1Var.O2()) {
                        captionLayout = s1Var.getCaptionLayout();
                        while (i19 < captionLayout.textLayoutBlocks.size()) {
                            textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i19);
                            f13 = i21;
                            if (f13 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                            }
                        }
                    } else {
                        while (i18 < messageObject.textLayoutBlocks.size()) {
                            textLayoutBlock = messageObject.textLayoutBlocks.get(i18);
                            f12 = i21;
                            if (f12 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                            }
                        }
                    }
                } else {
                    i15 = -1;
                    if (!s1Var.O2()) {
                        captionLayout = s1Var.getCaptionLayout();
                        while (i19 < captionLayout.textLayoutBlocks.size()) {
                            textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i19);
                            f13 = i21;
                            if (f13 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                            }
                        }
                    } else {
                        while (i18 < messageObject.textLayoutBlocks.size()) {
                            textLayoutBlock = messageObject.textLayoutBlocks.get(i18);
                            f12 = i21;
                            if (f12 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                            }
                        }
                    }
                }
            } else if (z10) {
                i15 = -1;
                if (!s1Var.O2()) {
                    captionLayout = s1Var.getCaptionLayout();
                    while (i19 < captionLayout.textLayoutBlocks.size()) {
                        textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i19);
                        f13 = i21;
                        if (f13 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                        }
                    }
                } else {
                    while (i18 < messageObject.textLayoutBlocks.size()) {
                        textLayoutBlock = messageObject.textLayoutBlocks.get(i18);
                        f12 = i21;
                        if (f12 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                        }
                    }
                }
            } else {
                i15 = -1;
                if (!s1Var.O2()) {
                    captionLayout = s1Var.getCaptionLayout();
                    while (i19 < captionLayout.textLayoutBlocks.size()) {
                        textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i19);
                        f13 = i21;
                        if (f13 < textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks)) {
                        }
                    }
                } else {
                    while (i18 < messageObject.textLayoutBlocks.size()) {
                        textLayoutBlock = messageObject.textLayoutBlocks.get(i18);
                        f12 = i21;
                        if (f12 < textLayoutBlock.textYOffset(messageObject.textLayoutBlocks)) {
                        }
                    }
                }
            }
            layout = m9Var.f24688b;
            if (layout == null) {
                return i15;
            }
            i16 = (int) (i20 - m9Var.d);
            i17 = 0;
            while (true) {
                if (i17 >= layout.getLineCount()) {
                    i17 = -1;
                    break;
                }
                f11 = i21;
                if (f11 <= m9Var.f24689c + layout.getLineTop(i17)) {
                }
                i17++;
            }
            if (i17 >= 0) {
                return layout.getOffsetForHorizontal(i17, i16) + m9Var.f24687a;
            }
            return i15;
        }
        return -1;
    }

    @Override
    public final int n() {
        Layout layout;
        r9 r9Var = this.W;
        if (r9Var != null && ((s1) r9Var).getMessageObject() != null) {
            MessageObject messageObject = ((s1) this.W).getMessageObject();
            if (this.f24599v0) {
                layout = ((s1) this.W).getDescriptionlayout();
            } else if (this.f24601x0) {
                layout = ((s1) this.W).getFactCheckLayout();
            } else if (this.f24603z0) {
                RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
                if (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) {
                    layout = null;
                } else {
                    layout = richMessageLayout.textBlocks.get(0).getLayout();
                }
            } else if (((s1) this.W).O2()) {
                layout = ((s1) this.W).getCaptionLayout().textLayoutBlocks.get(0).textLayout;
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
                if (arrayList != null) {
                    layout = arrayList.get(0).textLayout;
                } else {
                    layout = null;
                }
            }
            if (layout != null) {
                return layout.getLineBottom(0) - layout.getLineTop(0);
            }
        }
        return 0;
    }

    @Override
    public final CharSequence t(r9 r9Var, boolean z10) {
        s1 s1Var = (s1) r9Var;
        if (s1Var == null || s1Var.getMessageObject() == null) {
            return null;
        }
        if (!z10 ? !this.f24599v0 : !this.f24600w0) {
            return s1Var.getDescriptionlayout().getText();
        }
        if (!z10 ? !this.f24601x0 : !this.f24602y0) {
            return s1Var.getFactCheckLayout().getText();
        }
        if (!z10 ? this.f24603z0 : this.A0) {
            return s1Var.O2() ? s1Var.getCaptionLayout().text : s1Var.getMessageObject().messageText;
        }
        RichMessageLayout richMessageLayout = s1Var.getMessageObject().richLayout;
        return richMessageLayout != null ? richMessageLayout.joinedText : "";
    }

    @Override
    public void x() {
        super.x();
        r9 r9Var = this.W;
        if (r9Var != null && ((s1) r9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        r9 r9Var2 = this.W;
        if (r9Var2 != null) {
            if (this.f24601x0 || this.f24602y0) {
                ((s1) r9Var2).Z2();
            }
        }
    }
}
