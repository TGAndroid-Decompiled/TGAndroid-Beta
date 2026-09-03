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
public abstract class n9 extends z9 {
    public boolean A0;
    public final SparseArray f23235u0 = new SparseArray();
    public boolean f23236v0;
    public boolean f23237w0;
    public boolean f23238x0;
    public boolean f23239y0;
    public boolean f23240z0;

    @Override
    public final boolean D() {
        u9 u9Var;
        RichMessageLayout richMessageLayout;
        CharSequence s6;
        String str;
        if (this.f23240z0 && (u9Var = this.W) != null && ((t1) u9Var).getMessageObject() != null && (richMessageLayout = ((t1) this.W).getMessageObject().richLayout) != null && !richMessageLayout.textBlocks.isEmpty() && (s6 = s()) != null && s6.length() != 0) {
            try {
                str = richMessageLayout.getSelectionHtml(this.f24539u, this.v);
            } catch (Exception e6) {
                FileLog.e(e6);
                str = null;
            }
            if (str != null && str.length() != 0) {
                AndroidUtilities.addToClipboard(s6, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void F(boolean z4) {
        u9 u9Var = this.W;
        if (u9Var != null && ((t1) u9Var).g3() && !z4) {
            t1 t1Var = (t1) this.W;
            int id2 = t1Var.getMessageObject().getId();
            SparseArray sparseArray = this.f23235u0;
            Animator animator = (Animator) sparseArray.get(id2);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            t1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new jh.b(t1Var, id2, 2));
            ofFloat.addListener(new j1(1, t1Var));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(id2, ofFloat);
        }
    }

    @Override
    public final void M(u9 u9Var, u9 u9Var2) {
        boolean z4;
        t1 t1Var = (t1) u9Var;
        t1 t1Var2 = (t1) u9Var2;
        if (t1Var2 != null && (t1Var2.getMessageObject() == null || t1Var2.getMessageObject().getId() == t1Var.getMessageObject().getId())) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f24540w = t1Var.getMessageObject().getId();
        try {
            int i10 = t1Var.getMessageObject().messageOwner.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f23236v0 = this.f23237w0;
        this.f23238x0 = this.f23239y0;
        this.f23240z0 = this.A0;
        int i11 = this.f24540w;
        SparseArray sparseArray = this.f23235u0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new eg.z0(4, this, z4));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f24540w, ofFloat);
        if (!z4) {
            t1Var.setSelectedBackgroundProgress(0.0f);
        }
        SharedConfig.removeTextSelectionHint();
    }

    public final void X(MessageObject messageObject) {
        try {
            int i10 = messageObject.messageOwner.edit_date;
        } catch (Exception unused) {
        }
        if (this.f24540w == messageObject.getId()) {
            f(true);
        }
    }

    public final void Y(boolean z4, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f23236v0) {
            return;
        }
        Paint paint = this.f24529p;
        Paint paint2 = this.f24527o;
        if (z4) {
            int i10 = org.telegram.ui.ActionBar.k6.Vb;
            paint2.setColor(u(i10));
            paint.setColor(u(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.f21972uf;
            paint2.setColor(u(i11));
            paint.setColor(u(i11));
        }
        i(canvas, staticLayout, this.f24539u, this.v, true, true, 0.0f);
    }

    public final void Z(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        u9 u9Var;
        Canvas canvas2;
        boolean z4;
        if (this.f23240z0 && richMessageLayout != null && (u9Var = this.W) != null && ((t1) u9Var).getMessageObject() != null && ((t1) this.W).getMessageObject().getId() == messageObject.getId()) {
            boolean isOutOwner = messageObject.isOutOwner();
            Paint paint = this.f24529p;
            Paint paint2 = this.f24527o;
            if (isOutOwner) {
                int i10 = org.telegram.ui.ActionBar.k6.Vb;
                paint2.setColor(u(i10));
                paint.setColor(u(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.k6.f21972uf;
                paint2.setColor(u(i11));
                paint.setColor(u(i11));
            }
            int i12 = 0;
            while (i12 < richMessageLayout.textBlocks.size()) {
                x9 x9Var = richMessageLayout.textBlocks.get(i12);
                Layout layout = x9Var.getLayout();
                if (layout != null && layout.getText() != null) {
                    int intValue = richMessageLayout.textBlockCharOffsets.get(i12).intValue();
                    int length = layout.getText().length();
                    int clamp = Utilities.clamp(this.f24539u - intValue, length, 0);
                    int clamp2 = Utilities.clamp(this.v - intValue, length, 0);
                    if (clamp != clamp2) {
                        boolean z10 = true;
                        if (this.f24539u >= intValue) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (this.v > intValue + length) {
                            z10 = false;
                        }
                        canvas.save();
                        canvas.translate(x9Var.getX(), x9Var.getY());
                        canvas2 = canvas;
                        i(canvas2, layout, clamp, clamp2, z4, z10, 0.0f);
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
        this.f24540w = t1Var.getMessageObject().getId();
        this.f24539u = i10;
        this.v = i11;
        x();
        k7.y5 y5Var = this.D;
        if (y5Var != null) {
            y5Var.a(true);
        }
        this.f24513g = 0.0f;
        this.f24511f = 0.0f;
        this.f24509e = false;
        y9 y9Var = this.C;
        if (y9Var != null) {
            y9Var.setVisibility(0);
        }
        V();
    }

    public final void b0(t1 t1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = t1Var;
        MessageObject messageObject = t1Var.getMessageObject();
        s1 s1Var = t1Var.Wc;
        boolean z4 = this.f23237w0;
        Rect rect = this.B;
        if (z4 && t1Var.getDescriptionlayout() != null) {
            int i10 = this.f24506c;
            rect.set(i10, this.d, t1Var.getDescriptionlayout().getWidth() + i10, t1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f23239y0 && t1Var.getFactCheckLayout() != null) {
            int i11 = this.f24506c;
            rect.set(i11, this.d, t1Var.getFactCheckLayout().getWidth() + i11, t1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.A0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i12 = this.f24506c;
            rect.set(i12, this.d, richMessageLayout2.getMinWidth() + i12, richMessageLayout2.getHeight() + this.d);
        } else if (t1Var.P2() && t1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) l.d.i(1, t1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.f24506c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(t1Var.getCaptionLayout().textLayoutBlocks, s1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.textLayoutBlocks) != null && arrayList.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) l.d.i(1, messageObject.textLayoutBlocks);
            int i14 = this.f24506c;
            rect.set(i14, this.d, textLayoutBlock2.textLayout.getWidth() + i14, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, s1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void c0(int i10, int i11) {
        if (this.f24502a == i10 && this.f24504b == i11) {
            return;
        }
        this.f24502a = i10;
        this.f24504b = i11;
        x();
    }

    @Override
    public final void f(boolean z4) {
        super.f(z4);
        this.f23236v0 = false;
        this.f23238x0 = false;
        this.f23240z0 = false;
    }

    @Override
    public final void j(int i10, p9 p9Var, boolean z4) {
        u9 u9Var;
        int i11;
        MessageObject.TextLayoutBlock textLayoutBlock;
        int i12;
        int i13;
        int i14;
        MessageObject.TextLayoutBlock textLayoutBlock2;
        int i15;
        int i16;
        RichMessageLayout richMessageLayout;
        x9 x9Var;
        if (z4) {
            u9Var = this.X;
        } else {
            u9Var = this.W;
        }
        t1 t1Var = (t1) u9Var;
        if (t1Var == null) {
            p9Var.f23341b = null;
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        int i17 = 0;
        if (this.f23236v0) {
            p9Var.f23341b = t1Var.getDescriptionlayout();
            p9Var.f23342c = 0.0f;
            p9Var.d = 0.0f;
            p9Var.f23340a = 0;
        } else if (this.f23238x0) {
            p9Var.f23341b = t1Var.getFactCheckLayout();
            p9Var.f23342c = 0.0f;
            p9Var.d = 0.0f;
            p9Var.f23340a = 0;
        } else if (this.f23240z0) {
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
                p9Var.f23341b = richMessageLayout.textBlocks.get(i17).getLayout();
                p9Var.f23342c = x9Var.getY();
                p9Var.d = x9Var.getX();
                p9Var.f23340a = richMessageLayout.textBlockCharOffsets.get(i17).intValue();
                return;
            }
            p9Var.f23341b = null;
        } else if (t1Var.P2()) {
            MessageObject.TextLayoutBlocks captionLayout = t1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                p9Var.f23341b = captionLayout.textLayoutBlocks.get(0).textLayout;
                p9Var.f23342c = textLayoutBlock2.padTop;
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
                float f10 = -i16;
                p9Var.d = f10;
                if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                    p9Var.d = f10 + AndroidUtilities.dp(8.0f);
                }
                p9Var.f23340a = 0;
                return;
            }
            for (int i18 = 0; i18 < captionLayout.textLayoutBlocks.size(); i18++) {
                MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i18);
                int i19 = i10 - textLayoutBlock4.charactersOffset;
                if (i19 >= 0 && i19 <= textLayoutBlock4.textLayout.getText().length()) {
                    p9Var.f23341b = textLayoutBlock4.textLayout;
                    p9Var.f23342c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                    if (textLayoutBlock4.quote) {
                        i14 = AndroidUtilities.dp(10.0f);
                    } else {
                        i14 = 0;
                    }
                    if (textLayoutBlock4.isRtl()) {
                        i17 = ((int) Math.ceil(captionLayout.textXOffset)) - i14;
                    }
                    float f11 = -i17;
                    p9Var.d = f11;
                    if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                        p9Var.d = f11 + AndroidUtilities.dp(8.0f);
                    }
                    p9Var.f23340a = textLayoutBlock4.charactersOffset;
                    return;
                }
            }
            p9Var.f23341b = null;
        } else {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
            if (arrayList == null) {
                p9Var.f23341b = null;
            } else if (arrayList.size() == 1) {
                p9Var.f23341b = messageObject.textLayoutBlocks.get(0).textLayout;
                p9Var.f23342c = textLayoutBlock.padTop;
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
                float f12 = -i13;
                p9Var.d = f12;
                if (textLayoutBlock5.code && !textLayoutBlock5.quote) {
                    p9Var.d = f12 + AndroidUtilities.dp(8.0f);
                }
                p9Var.f23340a = 0;
            } else {
                for (int i20 = 0; i20 < messageObject.textLayoutBlocks.size(); i20++) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = messageObject.textLayoutBlocks.get(i20);
                    int i21 = i10 - textLayoutBlock6.charactersOffset;
                    if (i21 >= 0 && i21 <= textLayoutBlock6.textLayout.getText().length()) {
                        p9Var.f23341b = textLayoutBlock6.textLayout;
                        p9Var.f23342c = textLayoutBlock6.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock6.padTop;
                        if (textLayoutBlock6.quote) {
                            i11 = AndroidUtilities.dp(10.0f);
                        } else {
                            i11 = 0;
                        }
                        if (textLayoutBlock6.isRtl()) {
                            i17 = ((int) Math.ceil(messageObject.textXOffset)) - i11;
                        }
                        float f13 = -i17;
                        p9Var.d = f13;
                        if (textLayoutBlock6.code && !textLayoutBlock6.quote) {
                            p9Var.d = f13 + AndroidUtilities.dp(8.0f);
                        }
                        p9Var.f23340a = textLayoutBlock6.charactersOffset;
                        return;
                    }
                }
                p9Var.f23341b = null;
            }
        }
    }

    @Override
    public final int l(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.u9 r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n9.l(int, int, int, int, org.telegram.ui.Cells.u9, boolean):int");
    }

    @Override
    public final int n() {
        Layout layout;
        RichMessageLayout richMessageLayout;
        u9 u9Var = this.W;
        if (u9Var != null && ((t1) u9Var).getMessageObject() != null) {
            MessageObject messageObject = ((t1) this.W).getMessageObject();
            if (this.f23236v0) {
                layout = ((t1) this.W).getDescriptionlayout();
            } else if (this.f23238x0) {
                layout = ((t1) this.W).getFactCheckLayout();
            } else if (this.f23240z0) {
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
    public final CharSequence t(u9 u9Var, boolean z4) {
        t1 t1Var = (t1) u9Var;
        if (t1Var != null && t1Var.getMessageObject() != null) {
            if (!z4 ? this.f23236v0 : this.f23237w0) {
                return t1Var.getDescriptionlayout().getText();
            }
            if (!z4 ? this.f23238x0 : this.f23239y0) {
                return t1Var.getFactCheckLayout().getText();
            }
            if (!z4 ? this.f23240z0 : this.A0) {
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
        u9 u9Var = this.W;
        if (u9Var != null && ((t1) u9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        u9 u9Var2 = this.W;
        if (u9Var2 != null) {
            if (this.f23238x0 || this.f23239y0) {
                ((t1) u9Var2).a3();
            }
        }
    }
}
