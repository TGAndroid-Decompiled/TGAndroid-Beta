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
public abstract class r9 extends da {
    public boolean A0;
    public final SparseArray f22691u0 = new SparseArray();
    public boolean f22692v0;
    public boolean f22693w0;
    public boolean f22694x0;
    public boolean f22695y0;
    public boolean f22696z0;

    @Override
    public final boolean D() {
        y9 y9Var;
        RichMessageLayout richMessageLayout;
        CharSequence s10;
        String str;
        if (this.f22696z0 && (y9Var = this.W) != null && ((t1) y9Var).getMessageObject() != null && (richMessageLayout = ((t1) this.W).getMessageObject().richLayout) != null && !richMessageLayout.textBlocks.isEmpty() && (s10 = s()) != null && s10.length() != 0) {
            try {
                str = richMessageLayout.getSelectionHtml(this.f21799u, this.v);
            } catch (Exception e7) {
                FileLog.e(e7);
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
        y9 y9Var = this.W;
        if (y9Var != null && ((t1) y9Var).g3() && !z10) {
            t1 t1Var = (t1) this.W;
            int id2 = t1Var.getMessageObject().getId();
            SparseArray sparseArray = this.f22691u0;
            Animator animator = (Animator) sparseArray.get(id2);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            t1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(t1Var, id2, 1));
            ofFloat.addListener(new j1(1, t1Var));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(id2, ofFloat);
        }
    }

    @Override
    public final void M(y9 y9Var, y9 y9Var2) {
        boolean z10;
        t1 t1Var = (t1) y9Var;
        t1 t1Var2 = (t1) y9Var2;
        if (t1Var2 != null && (t1Var2.getMessageObject() == null || t1Var2.getMessageObject().getId() == t1Var.getMessageObject().getId())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f21800w = t1Var.getMessageObject().getId();
        try {
            int i10 = t1Var.getMessageObject().messageOwner.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f22692v0 = this.f22693w0;
        this.f22694x0 = this.f22695y0;
        this.f22696z0 = this.A0;
        int i11 = this.f21800w;
        SparseArray sparseArray = this.f22691u0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ah.l0(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f21800w, ofFloat);
        if (!z10) {
            t1Var.setSelectedBackgroundProgress(0.0f);
        }
        SharedConfig.removeTextSelectionHint();
    }

    public final void X(MessageObject messageObject) {
        try {
            int i10 = messageObject.messageOwner.edit_date;
        } catch (Exception unused) {
        }
        if (this.f21800w == messageObject.getId()) {
            f(true);
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f22692v0) {
            return;
        }
        Paint paint = this.f21789p;
        Paint paint2 = this.f21787o;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.j6.Vb;
            paint2.setColor(u(i10));
            paint.setColor(u(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.f20981uf;
            paint2.setColor(u(i11));
            paint.setColor(u(i11));
        }
        i(canvas, staticLayout, this.f21799u, this.v, true, true, 0.0f);
    }

    public final void Z(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        y9 y9Var;
        Canvas canvas2;
        boolean z10;
        if (this.f22696z0 && richMessageLayout != null && (y9Var = this.W) != null && ((t1) y9Var).getMessageObject() != null && ((t1) this.W).getMessageObject().getId() == messageObject.getId()) {
            boolean isOutOwner = messageObject.isOutOwner();
            Paint paint = this.f21789p;
            Paint paint2 = this.f21787o;
            if (isOutOwner) {
                int i10 = org.telegram.ui.ActionBar.j6.Vb;
                paint2.setColor(u(i10));
                paint.setColor(u(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.j6.f20981uf;
                paint2.setColor(u(i11));
                paint.setColor(u(i11));
            }
            int i12 = 0;
            while (i12 < richMessageLayout.textBlocks.size()) {
                ba baVar = richMessageLayout.textBlocks.get(i12);
                Layout layout = baVar.getLayout();
                if (layout != null && layout.getText() != null) {
                    int intValue = richMessageLayout.textBlockCharOffsets.get(i12).intValue();
                    int length = layout.getText().length();
                    int clamp = Utilities.clamp(this.f21799u - intValue, length, 0);
                    int clamp2 = Utilities.clamp(this.v - intValue, length, 0);
                    if (clamp != clamp2) {
                        boolean z11 = true;
                        if (this.f21799u >= intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.v > intValue + length) {
                            z11 = false;
                        }
                        canvas.save();
                        canvas.translate(baVar.getX(), baVar.getY());
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

    public final void a0(t1 t1Var, int i10, int i11) {
        if (t1Var == null) {
            return;
        }
        this.W = t1Var;
        this.f21800w = t1Var.getMessageObject().getId();
        this.f21799u = i10;
        this.v = i11;
        x();
        w7.h0 h0Var = this.D;
        if (h0Var != null) {
            h0Var.a(true);
        }
        this.f21773g = 0.0f;
        this.f21771f = 0.0f;
        this.f21769e = false;
        ca caVar = this.C;
        if (caVar != null) {
            caVar.setVisibility(0);
        }
        V();
    }

    public final void b0(t1 t1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = t1Var;
        MessageObject messageObject = t1Var.getMessageObject();
        s1 s1Var = t1Var.Zc;
        boolean z10 = this.f22693w0;
        Rect rect = this.B;
        if (z10 && t1Var.getDescriptionlayout() != null) {
            int i10 = this.f21766c;
            rect.set(i10, this.d, t1Var.getDescriptionlayout().getWidth() + i10, t1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f22695y0 && t1Var.getFactCheckLayout() != null) {
            int i11 = this.f21766c;
            rect.set(i11, this.d, t1Var.getFactCheckLayout().getWidth() + i11, t1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.A0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i12 = this.f21766c;
            rect.set(i12, this.d, richMessageLayout2.getMinWidth() + i12, richMessageLayout2.getHeight() + this.d);
        } else if (t1Var.P2() && t1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) i2.g.h(1, t1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.f21766c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(t1Var.getCaptionLayout().textLayoutBlocks, s1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.textLayoutBlocks) != null && arrayList.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) i2.g.h(1, messageObject.textLayoutBlocks);
            int i14 = this.f21766c;
            rect.set(i14, this.d, textLayoutBlock2.textLayout.getWidth() + i14, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, s1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void c0(int i10, int i11) {
        if (this.f21762a == i10 && this.f21764b == i11) {
            return;
        }
        this.f21762a = i10;
        this.f21764b = i11;
        x();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f22692v0 = false;
        this.f22694x0 = false;
        this.f22696z0 = false;
    }

    @Override
    public final void j(int i10, t9 t9Var, boolean z10) {
        y9 y9Var;
        int i11;
        MessageObject.TextLayoutBlock textLayoutBlock;
        int i12;
        int i13;
        int i14;
        MessageObject.TextLayoutBlock textLayoutBlock2;
        int i15;
        int i16;
        RichMessageLayout richMessageLayout;
        ba baVar;
        if (z10) {
            y9Var = this.X;
        } else {
            y9Var = this.W;
        }
        t1 t1Var = (t1) y9Var;
        if (t1Var == null) {
            t9Var.f23296b = null;
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        int i17 = 0;
        if (this.f22692v0) {
            t9Var.f23296b = t1Var.getDescriptionlayout();
            t9Var.f23297c = 0.0f;
            t9Var.d = 0.0f;
            t9Var.f23295a = 0;
        } else if (this.f22694x0) {
            t9Var.f23296b = t1Var.getFactCheckLayout();
            t9Var.f23297c = 0.0f;
            t9Var.d = 0.0f;
            t9Var.f23295a = 0;
        } else if (this.f22696z0) {
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
                t9Var.f23296b = richMessageLayout.textBlocks.get(i17).getLayout();
                t9Var.f23297c = baVar.getY();
                t9Var.d = baVar.getX();
                t9Var.f23295a = richMessageLayout.textBlockCharOffsets.get(i17).intValue();
                return;
            }
            t9Var.f23296b = null;
        } else if (t1Var.P2()) {
            MessageObject.TextLayoutBlocks captionLayout = t1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                t9Var.f23296b = captionLayout.textLayoutBlocks.get(0).textLayout;
                t9Var.f23297c = textLayoutBlock2.padTop;
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
                float f7 = -i16;
                t9Var.d = f7;
                if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                    t9Var.d = f7 + AndroidUtilities.dp(8.0f);
                }
                t9Var.f23295a = 0;
                return;
            }
            for (int i18 = 0; i18 < captionLayout.textLayoutBlocks.size(); i18++) {
                MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i18);
                int i19 = i10 - textLayoutBlock4.charactersOffset;
                if (i19 >= 0 && i19 <= textLayoutBlock4.textLayout.getText().length()) {
                    t9Var.f23296b = textLayoutBlock4.textLayout;
                    t9Var.f23297c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                    if (textLayoutBlock4.quote) {
                        i14 = AndroidUtilities.dp(10.0f);
                    } else {
                        i14 = 0;
                    }
                    if (textLayoutBlock4.isRtl()) {
                        i17 = ((int) Math.ceil(captionLayout.textXOffset)) - i14;
                    }
                    float f10 = -i17;
                    t9Var.d = f10;
                    if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                        t9Var.d = f10 + AndroidUtilities.dp(8.0f);
                    }
                    t9Var.f23295a = textLayoutBlock4.charactersOffset;
                    return;
                }
            }
            t9Var.f23296b = null;
        } else {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
            if (arrayList == null) {
                t9Var.f23296b = null;
            } else if (arrayList.size() == 1) {
                t9Var.f23296b = messageObject.textLayoutBlocks.get(0).textLayout;
                t9Var.f23297c = textLayoutBlock.padTop;
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
                t9Var.d = f11;
                if (textLayoutBlock5.code && !textLayoutBlock5.quote) {
                    t9Var.d = f11 + AndroidUtilities.dp(8.0f);
                }
                t9Var.f23295a = 0;
            } else {
                for (int i20 = 0; i20 < messageObject.textLayoutBlocks.size(); i20++) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = messageObject.textLayoutBlocks.get(i20);
                    int i21 = i10 - textLayoutBlock6.charactersOffset;
                    if (i21 >= 0 && i21 <= textLayoutBlock6.textLayout.getText().length()) {
                        t9Var.f23296b = textLayoutBlock6.textLayout;
                        t9Var.f23297c = textLayoutBlock6.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock6.padTop;
                        if (textLayoutBlock6.quote) {
                            i11 = AndroidUtilities.dp(10.0f);
                        } else {
                            i11 = 0;
                        }
                        if (textLayoutBlock6.isRtl()) {
                            i17 = ((int) Math.ceil(messageObject.textXOffset)) - i11;
                        }
                        float f12 = -i17;
                        t9Var.d = f12;
                        if (textLayoutBlock6.code && !textLayoutBlock6.quote) {
                            t9Var.d = f12 + AndroidUtilities.dp(8.0f);
                        }
                        t9Var.f23295a = textLayoutBlock6.charactersOffset;
                        return;
                    }
                }
                t9Var.f23296b = null;
            }
        }
    }

    @Override
    public final int l(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.y9 r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r9.l(int, int, int, int, org.telegram.ui.Cells.y9, boolean):int");
    }

    @Override
    public final int n() {
        Layout layout;
        RichMessageLayout richMessageLayout;
        y9 y9Var = this.W;
        if (y9Var != null && ((t1) y9Var).getMessageObject() != null) {
            MessageObject messageObject = ((t1) this.W).getMessageObject();
            if (this.f22692v0) {
                layout = ((t1) this.W).getDescriptionlayout();
            } else if (this.f22694x0) {
                layout = ((t1) this.W).getFactCheckLayout();
            } else if (this.f22696z0) {
                if (messageObject != null) {
                    richMessageLayout = messageObject.richLayout;
                } else {
                    richMessageLayout = null;
                }
                if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                    layout = richMessageLayout.textBlocks.get(0).getLayout();
                }
                layout = null;
            } else if (((t1) this.W).P2()) {
                layout = ((t1) this.W).getCaptionLayout().textLayoutBlocks.get(0).textLayout;
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
    public final CharSequence t(y9 y9Var, boolean z10) {
        t1 t1Var = (t1) y9Var;
        if (t1Var != null && t1Var.getMessageObject() != null) {
            if (!z10 ? this.f22692v0 : this.f22693w0) {
                return t1Var.getDescriptionlayout().getText();
            }
            if (!z10 ? this.f22694x0 : this.f22695y0) {
                return t1Var.getFactCheckLayout().getText();
            }
            if (!z10 ? this.f22696z0 : this.A0) {
                RichMessageLayout richMessageLayout = t1Var.getMessageObject().richLayout;
                if (richMessageLayout != null) {
                    return richMessageLayout.joinedText;
                }
                return "";
            } else if (t1Var.P2()) {
                return t1Var.getCaptionLayout().text;
            } else {
                return t1Var.getMessageObject().messageText;
            }
        }
        return null;
    }

    @Override
    public void x() {
        super.x();
        y9 y9Var = this.W;
        if (y9Var != null && ((t1) y9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        y9 y9Var2 = this.W;
        if (y9Var2 != null) {
            if (this.f22694x0 || this.f22695y0) {
                ((t1) y9Var2).a3();
            }
        }
    }
}
