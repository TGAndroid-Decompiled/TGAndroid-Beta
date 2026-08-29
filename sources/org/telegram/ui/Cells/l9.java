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
public abstract class l9 extends x9 {
    public boolean A0;
    public final SparseArray f24651u0 = new SparseArray();
    public boolean f24652v0;
    public boolean f24653w0;
    public boolean f24654x0;
    public boolean f24655y0;
    public boolean f24656z0;

    @Override
    public final boolean D() {
        s9 s9Var;
        RichMessageLayout richMessageLayout;
        CharSequence s10;
        String str;
        if (this.f24656z0 && (s9Var = this.W) != null && ((s1) s9Var).getMessageObject() != null && (richMessageLayout = ((s1) this.W).getMessageObject().richLayout) != null && !richMessageLayout.textBlocks.isEmpty() && (s10 = s()) != null && s10.length() != 0) {
            try {
                str = richMessageLayout.getSelectionHtml(this.f25969u, this.v);
            } catch (Exception e10) {
                FileLog.e(e10);
                str = null;
            }
            if (str != null && str.length() != 0) {
                AndroidUtilities.addToClipboard(s10, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void F(boolean z10) {
        s9 s9Var = this.W;
        if (s9Var != null && ((s1) s9Var).g3() && !z10) {
            s1 s1Var = (s1) this.W;
            int id2 = s1Var.getMessageObject().getId();
            SparseArray sparseArray = this.f24651u0;
            Animator animator = (Animator) sparseArray.get(id2);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            s1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new gh.b(s1Var, id2, 2));
            ofFloat.addListener(new i1(1, s1Var));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(id2, ofFloat);
        }
    }

    @Override
    public final void M(s9 s9Var, s9 s9Var2) {
        boolean z10;
        s1 s1Var = (s1) s9Var;
        s1 s1Var2 = (s1) s9Var2;
        if (s1Var2 != null && (s1Var2.getMessageObject() == null || s1Var2.getMessageObject().getId() == s1Var.getMessageObject().getId())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f25970w = s1Var.getMessageObject().getId();
        try {
            int i10 = s1Var.getMessageObject().messageOwner.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f24652v0 = this.f24653w0;
        this.f24654x0 = this.f24655y0;
        this.f24656z0 = this.A0;
        int i11 = this.f25970w;
        SparseArray sparseArray = this.f24651u0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new bg.c1(5, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f25970w, ofFloat);
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
        if (this.f25970w == messageObject.getId()) {
            f(true);
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f24652v0) {
            return;
        }
        Paint paint = this.f25959p;
        Paint paint2 = this.f25957o;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.g6.Vb;
            paint2.setColor(u(i10));
            paint.setColor(u(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.g6.f23374uf;
            paint2.setColor(u(i11));
            paint.setColor(u(i11));
        }
        i(canvas, staticLayout, this.f25969u, this.v, true, true, 0.0f);
    }

    public final void Z(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        s9 s9Var;
        Canvas canvas2;
        boolean z10;
        if (this.f24656z0 && richMessageLayout != null && (s9Var = this.W) != null && ((s1) s9Var).getMessageObject() != null && ((s1) this.W).getMessageObject().getId() == messageObject.getId()) {
            boolean isOutOwner = messageObject.isOutOwner();
            Paint paint = this.f25959p;
            Paint paint2 = this.f25957o;
            if (isOutOwner) {
                int i10 = org.telegram.ui.ActionBar.g6.Vb;
                paint2.setColor(u(i10));
                paint.setColor(u(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.g6.f23374uf;
                paint2.setColor(u(i11));
                paint.setColor(u(i11));
            }
            int i12 = 0;
            while (i12 < richMessageLayout.textBlocks.size()) {
                v9 v9Var = richMessageLayout.textBlocks.get(i12);
                Layout layout = v9Var.getLayout();
                if (layout != null && layout.getText() != null) {
                    int intValue = richMessageLayout.textBlockCharOffsets.get(i12).intValue();
                    int length = layout.getText().length();
                    int clamp = Utilities.clamp(this.f25969u - intValue, length, 0);
                    int clamp2 = Utilities.clamp(this.v - intValue, length, 0);
                    if (clamp != clamp2) {
                        boolean z11 = true;
                        if (this.f25969u >= intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.v > intValue + length) {
                            z11 = false;
                        }
                        canvas.save();
                        canvas.translate(v9Var.getX(), v9Var.getY());
                        canvas2 = canvas;
                        i(canvas2, layout, clamp, clamp2, z10, z11, 0.0f);
                        canvas2.restore();
                        i12++;
                        canvas = canvas2;
                    }
                }
                canvas2 = canvas;
                i12++;
                canvas = canvas2;
            }
        }
    }

    public final void a0(s1 s1Var, int i10, int i11) {
        if (s1Var == null) {
            return;
        }
        this.W = s1Var;
        this.f25970w = s1Var.getMessageObject().getId();
        this.f25969u = i10;
        this.v = i11;
        x();
        i7.b6 b6Var = this.D;
        if (b6Var != null) {
            b6Var.a(true);
        }
        this.f25943g = 0.0f;
        this.f25941f = 0.0f;
        this.f25939e = false;
        w9 w9Var = this.C;
        if (w9Var != null) {
            w9Var.setVisibility(0);
        }
        V();
    }

    public final void b0(s1 s1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = s1Var;
        MessageObject messageObject = s1Var.getMessageObject();
        r1 r1Var = s1Var.Vc;
        boolean z10 = this.f24653w0;
        Rect rect = this.B;
        if (z10 && s1Var.getDescriptionlayout() != null) {
            int i10 = this.f25936c;
            rect.set(i10, this.d, s1Var.getDescriptionlayout().getWidth() + i10, s1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f24655y0 && s1Var.getFactCheckLayout() != null) {
            int i11 = this.f25936c;
            rect.set(i11, this.d, s1Var.getFactCheckLayout().getWidth() + i11, s1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.A0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i12 = this.f25936c;
            rect.set(i12, this.d, richMessageLayout2.getMinWidth() + i12, richMessageLayout2.getHeight() + this.d);
        } else if (s1Var.P2() && s1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) j7.l1.i(1, s1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.f25936c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(s1Var.getCaptionLayout().textLayoutBlocks, r1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.textLayoutBlocks) != null && arrayList.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) j7.l1.i(1, messageObject.textLayoutBlocks);
            int i14 = this.f25936c;
            rect.set(i14, this.d, textLayoutBlock2.textLayout.getWidth() + i14, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, r1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void c0(int i10, int i11) {
        if (this.f25932a == i10 && this.f25934b == i11) {
            return;
        }
        this.f25932a = i10;
        this.f25934b = i11;
        x();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f24652v0 = false;
        this.f24654x0 = false;
        this.f24656z0 = false;
    }

    @Override
    public final void j(int i10, n9 n9Var, boolean z10) {
        s9 s9Var;
        int i11;
        MessageObject.TextLayoutBlock textLayoutBlock;
        int i12;
        int i13;
        int i14;
        MessageObject.TextLayoutBlock textLayoutBlock2;
        int i15;
        int i16;
        RichMessageLayout richMessageLayout;
        v9 v9Var;
        if (z10) {
            s9Var = this.X;
        } else {
            s9Var = this.W;
        }
        s1 s1Var = (s1) s9Var;
        if (s1Var == null) {
            n9Var.f24754b = null;
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        int i17 = 0;
        if (this.f24652v0) {
            n9Var.f24754b = s1Var.getDescriptionlayout();
            n9Var.f24755c = 0.0f;
            n9Var.d = 0.0f;
            n9Var.f24753a = 0;
        } else if (this.f24654x0) {
            n9Var.f24754b = s1Var.getFactCheckLayout();
            n9Var.f24755c = 0.0f;
            n9Var.d = 0.0f;
            n9Var.f24753a = 0;
        } else if (this.f24656z0) {
            if (messageObject != null) {
                richMessageLayout = messageObject.richLayout;
            } else {
                richMessageLayout = null;
            }
            if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                while (true) {
                    if (i17 < richMessageLayout.textBlocks.size()) {
                        int intValue = richMessageLayout.textBlockCharOffsets.get(i17).intValue();
                        int length = richMessageLayout.textBlocks.get(i17).getLayout().getText().length();
                        if (i10 >= intValue && i10 <= intValue + length) {
                            break;
                        }
                        i17++;
                    } else {
                        i17 = -1;
                        break;
                    }
                }
                if (i17 < 0) {
                    i17 = richMessageLayout.textBlocks.size() - 1;
                }
                n9Var.f24754b = richMessageLayout.textBlocks.get(i17).getLayout();
                n9Var.f24755c = v9Var.getY();
                n9Var.d = v9Var.getX();
                n9Var.f24753a = richMessageLayout.textBlockCharOffsets.get(i17).intValue();
                return;
            }
            n9Var.f24754b = null;
        } else if (s1Var.P2()) {
            MessageObject.TextLayoutBlocks captionLayout = s1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                n9Var.f24754b = captionLayout.textLayoutBlocks.get(0).textLayout;
                n9Var.f24755c = textLayoutBlock2.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock3 = captionLayout.textLayoutBlocks.get(0);
                if (textLayoutBlock3.quote) {
                    i15 = AndroidUtilities.dp(10.0f);
                } else {
                    i15 = 0;
                }
                if (textLayoutBlock3.isRtl()) {
                    i16 = ((int) Math.ceil(captionLayout.textXOffset)) - i15;
                } else {
                    i16 = 0;
                }
                float f9 = -i16;
                n9Var.d = f9;
                if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                    n9Var.d = f9 + AndroidUtilities.dp(8.0f);
                }
                n9Var.f24753a = 0;
                return;
            }
            for (int i18 = 0; i18 < captionLayout.textLayoutBlocks.size(); i18++) {
                MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i18);
                int i19 = i10 - textLayoutBlock4.charactersOffset;
                if (i19 >= 0 && i19 <= textLayoutBlock4.textLayout.getText().length()) {
                    n9Var.f24754b = textLayoutBlock4.textLayout;
                    n9Var.f24755c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                    if (textLayoutBlock4.quote) {
                        i14 = AndroidUtilities.dp(10.0f);
                    } else {
                        i14 = 0;
                    }
                    if (textLayoutBlock4.isRtl()) {
                        i17 = ((int) Math.ceil(captionLayout.textXOffset)) - i14;
                    }
                    float f10 = -i17;
                    n9Var.d = f10;
                    if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                        n9Var.d = f10 + AndroidUtilities.dp(8.0f);
                    }
                    n9Var.f24753a = textLayoutBlock4.charactersOffset;
                    return;
                }
            }
            n9Var.f24754b = null;
        } else {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
            if (arrayList == null) {
                n9Var.f24754b = null;
            } else if (arrayList.size() == 1) {
                n9Var.f24754b = messageObject.textLayoutBlocks.get(0).textLayout;
                n9Var.f24755c = textLayoutBlock.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock5 = messageObject.textLayoutBlocks.get(0);
                if (textLayoutBlock5.quote) {
                    i12 = AndroidUtilities.dp(10.0f);
                } else {
                    i12 = 0;
                }
                if (textLayoutBlock5.isRtl()) {
                    i13 = ((int) Math.ceil(messageObject.textXOffset)) - i12;
                } else {
                    i13 = 0;
                }
                float f11 = -i13;
                n9Var.d = f11;
                if (textLayoutBlock5.code && !textLayoutBlock5.quote) {
                    n9Var.d = f11 + AndroidUtilities.dp(8.0f);
                }
                n9Var.f24753a = 0;
            } else {
                for (int i20 = 0; i20 < messageObject.textLayoutBlocks.size(); i20++) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = messageObject.textLayoutBlocks.get(i20);
                    int i21 = i10 - textLayoutBlock6.charactersOffset;
                    if (i21 >= 0 && i21 <= textLayoutBlock6.textLayout.getText().length()) {
                        n9Var.f24754b = textLayoutBlock6.textLayout;
                        n9Var.f24755c = textLayoutBlock6.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock6.padTop;
                        if (textLayoutBlock6.quote) {
                            i11 = AndroidUtilities.dp(10.0f);
                        } else {
                            i11 = 0;
                        }
                        if (textLayoutBlock6.isRtl()) {
                            i17 = ((int) Math.ceil(messageObject.textXOffset)) - i11;
                        }
                        float f12 = -i17;
                        n9Var.d = f12;
                        if (textLayoutBlock6.code && !textLayoutBlock6.quote) {
                            n9Var.d = f12 + AndroidUtilities.dp(8.0f);
                        }
                        n9Var.f24753a = textLayoutBlock6.charactersOffset;
                        return;
                    }
                }
                n9Var.f24754b = null;
            }
        }
    }

    @Override
    public final int l(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.s9 r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l9.l(int, int, int, int, org.telegram.ui.Cells.s9, boolean):int");
    }

    @Override
    public final int n() {
        Layout layout;
        RichMessageLayout richMessageLayout;
        s9 s9Var = this.W;
        if (s9Var != null && ((s1) s9Var).getMessageObject() != null) {
            MessageObject messageObject = ((s1) this.W).getMessageObject();
            if (this.f24652v0) {
                layout = ((s1) this.W).getDescriptionlayout();
            } else if (this.f24654x0) {
                layout = ((s1) this.W).getFactCheckLayout();
            } else if (this.f24656z0) {
                if (messageObject != null) {
                    richMessageLayout = messageObject.richLayout;
                } else {
                    richMessageLayout = null;
                }
                if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                    layout = richMessageLayout.textBlocks.get(0).getLayout();
                }
                layout = null;
            } else if (((s1) this.W).P2()) {
                layout = ((s1) this.W).getCaptionLayout().textLayoutBlocks.get(0).textLayout;
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
                if (arrayList != null) {
                    layout = arrayList.get(0).textLayout;
                }
                layout = null;
            }
            if (layout != null) {
                return layout.getLineBottom(0) - layout.getLineTop(0);
            }
        }
        return 0;
    }

    @Override
    public final CharSequence t(s9 s9Var, boolean z10) {
        s1 s1Var = (s1) s9Var;
        if (s1Var != null && s1Var.getMessageObject() != null) {
            if (!z10 ? this.f24652v0 : this.f24653w0) {
                return s1Var.getDescriptionlayout().getText();
            }
            if (!z10 ? this.f24654x0 : this.f24655y0) {
                return s1Var.getFactCheckLayout().getText();
            }
            if (!z10 ? this.f24656z0 : this.A0) {
                RichMessageLayout richMessageLayout = s1Var.getMessageObject().richLayout;
                if (richMessageLayout != null) {
                    return richMessageLayout.joinedText;
                }
                return "";
            } else if (s1Var.P2()) {
                return s1Var.getCaptionLayout().text;
            } else {
                return s1Var.getMessageObject().messageText;
            }
        }
        return null;
    }

    @Override
    public void x() {
        super.x();
        s9 s9Var = this.W;
        if (s9Var != null && ((s1) s9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        s9 s9Var2 = this.W;
        if (s9Var2 != null) {
            if (this.f24654x0 || this.f24655y0) {
                ((s1) s9Var2).a3();
            }
        }
    }
}
