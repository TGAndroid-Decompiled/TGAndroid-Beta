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
public abstract class o9 extends aa {
    public final SparseArray f22736p0 = new SparseArray();
    public boolean f22737q0;
    public boolean f22738r0;
    public boolean f22739s0;
    public boolean f22740t0;
    public boolean f22741u0;
    public boolean f22742v0;

    @Override
    public final boolean C() {
        v9 v9Var;
        RichMessageLayout richMessageLayout;
        CharSequence r10;
        String str;
        if (this.f22741u0 && (v9Var = this.W) != null && ((u1) v9Var).getMessageObject() != null && (richMessageLayout = ((u1) this.W).getMessageObject().richLayout) != null && !richMessageLayout.textBlocks.isEmpty() && (r10 = r()) != null && r10.length() != 0) {
            try {
                str = richMessageLayout.getSelectionHtml(this.f22017u, this.v);
            } catch (Exception e) {
                FileLog.e(e);
                str = null;
            }
            if (str != null && str.length() != 0) {
                AndroidUtilities.addToClipboard(r10, str);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void E(boolean z10) {
        v9 v9Var = this.W;
        if (v9Var != null && ((u1) v9Var).g3() && !z10) {
            u1 u1Var = (u1) this.W;
            int id2 = u1Var.getMessageObject().getId();
            SparseArray sparseArray = this.f22736p0;
            Animator animator = (Animator) sparseArray.get(id2);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            u1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(u1Var, id2, 1));
            ofFloat.addListener(new k1(1, u1Var));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(id2, ofFloat);
        }
    }

    @Override
    public final void L(v9 v9Var, v9 v9Var2) {
        boolean z10;
        u1 u1Var = (u1) v9Var;
        u1 u1Var2 = (u1) v9Var2;
        if (u1Var2 != null && (u1Var2.getMessageObject() == null || u1Var2.getMessageObject().getId() == u1Var.getMessageObject().getId())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22018w = u1Var.getMessageObject().getId();
        try {
            int i10 = u1Var.getMessageObject().messageOwner.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f22737q0 = this.f22738r0;
        this.f22739s0 = this.f22740t0;
        this.f22741u0 = this.f22742v0;
        int i11 = this.f22018w;
        SparseArray sparseArray = this.f22736p0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ah.k0(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f22018w, ofFloat);
        if (!z10) {
            u1Var.setSelectedBackgroundProgress(0.0f);
        }
        SharedConfig.removeTextSelectionHint();
    }

    public final void W(MessageObject messageObject) {
        try {
            int i10 = messageObject.messageOwner.edit_date;
        } catch (Exception unused) {
        }
        if (this.f22018w == messageObject.getId()) {
            f(true);
        }
    }

    public final void X(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f22737q0) {
            return;
        }
        Paint paint = this.f22012p;
        Paint paint2 = this.f22010o;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.h6.Vb;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.h6.f21318uf;
            paint2.setColor(t(i11));
            paint.setColor(t(i11));
        }
        h(canvas, staticLayout, this.f22017u, this.v, true, true, 0.0f);
    }

    public final void Y(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        v9 v9Var;
        y9 y9Var;
        Canvas canvas2;
        boolean z10;
        if (this.f22741u0 && richMessageLayout != null && (v9Var = this.W) != null && ((u1) v9Var).getMessageObject() != null && ((u1) this.W).getMessageObject().getId() == messageObject.getId()) {
            boolean isOutOwner = messageObject.isOutOwner();
            Paint paint = this.f22012p;
            Paint paint2 = this.f22010o;
            if (isOutOwner) {
                int i10 = org.telegram.ui.ActionBar.h6.Vb;
                paint2.setColor(t(i10));
                paint.setColor(t(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.h6.f21318uf;
                paint2.setColor(t(i11));
                paint.setColor(t(i11));
            }
            int i12 = 0;
            while (i12 < richMessageLayout.textBlocks.size()) {
                Layout layout = richMessageLayout.textBlocks.get(i12).getLayout();
                if (layout != null && layout.getText() != null) {
                    int intValue = richMessageLayout.textBlockCharOffsets.get(i12).intValue();
                    int length = layout.getText().length();
                    int clamp = Utilities.clamp(this.f22017u - intValue, length, 0);
                    int clamp2 = Utilities.clamp(this.v - intValue, length, 0);
                    if (clamp != clamp2) {
                        boolean z11 = true;
                        if (this.f22017u >= intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.v > intValue + length) {
                            z11 = false;
                        }
                        canvas.save();
                        canvas.translate(y9Var.getX(), y9Var.getY());
                        canvas2 = canvas;
                        h(canvas2, layout, clamp, clamp2, z10, z11, 0.0f);
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

    public final void Z(u1 u1Var, int i10, int i11) {
        boolean z10;
        if (u1Var == null) {
            return;
        }
        this.W = u1Var;
        this.f22018w = u1Var.getMessageObject().getId();
        if (((u1) this.W).getMessageObject().type == 36 && ((u1) this.W).getMessageObject().richLayout != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22741u0 = z10;
        if (z10) {
            this.f22737q0 = false;
            this.f22739s0 = false;
        }
        this.f22017u = i10;
        this.v = i11;
        w();
        w7.j0 j0Var = this.D;
        if (j0Var != null) {
            j0Var.a(true);
        }
        this.f21996g = 0.0f;
        this.f21994f = 0.0f;
        this.e = false;
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.setVisibility(0);
        }
        U();
    }

    public final void a0(u1 u1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = u1Var;
        MessageObject messageObject = u1Var.getMessageObject();
        t1 t1Var = u1Var.Zc;
        boolean z10 = this.f22738r0;
        Rect rect = this.B;
        if (z10 && u1Var.getDescriptionlayout() != null) {
            int i10 = this.f21990c;
            rect.set(i10, this.d, u1Var.getDescriptionlayout().getWidth() + i10, u1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f22740t0 && u1Var.getFactCheckLayout() != null) {
            int i11 = this.f21990c;
            rect.set(i11, this.d, u1Var.getFactCheckLayout().getWidth() + i11, u1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.f22742v0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i12 = this.f21990c;
            rect.set(i12, this.d, richMessageLayout2.getMinWidth() + i12, richMessageLayout2.getHeight() + this.d);
        } else if (u1Var.P2() && u1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) i2.e.h(1, u1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.f21990c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(u1Var.getCaptionLayout().textLayoutBlocks, t1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.textLayoutBlocks) != null && arrayList.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) i2.e.h(1, messageObject.textLayoutBlocks);
            int i14 = this.f21990c;
            rect.set(i14, this.d, textLayoutBlock2.textLayout.getWidth() + i14, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, t1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void b0(int i10, int i11) {
        if (this.f21986a == i10 && this.f21988b == i11) {
            return;
        }
        this.f21986a = i10;
        this.f21988b = i11;
        w();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f22737q0 = false;
        this.f22739s0 = false;
        this.f22741u0 = false;
    }

    @Override
    public final void i(int i10, q9 q9Var, boolean z10) {
        v9 v9Var;
        int i11;
        MessageObject.TextLayoutBlock textLayoutBlock;
        int i12;
        int i13;
        int i14;
        MessageObject.TextLayoutBlock textLayoutBlock2;
        int i15;
        int i16;
        RichMessageLayout richMessageLayout;
        y9 y9Var;
        if (z10) {
            v9Var = this.X;
        } else {
            v9Var = this.W;
        }
        u1 u1Var = (u1) v9Var;
        if (u1Var == null) {
            q9Var.f22797b = null;
            return;
        }
        MessageObject messageObject = u1Var.getMessageObject();
        int i17 = 0;
        if (this.f22737q0) {
            q9Var.f22797b = u1Var.getDescriptionlayout();
            q9Var.f22798c = 0.0f;
            q9Var.d = 0.0f;
            q9Var.f22796a = 0;
        } else if (this.f22739s0) {
            q9Var.f22797b = u1Var.getFactCheckLayout();
            q9Var.f22798c = 0.0f;
            q9Var.d = 0.0f;
            q9Var.f22796a = 0;
        } else if (this.f22741u0) {
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
                q9Var.f22797b = richMessageLayout.textBlocks.get(i17).getLayout();
                q9Var.f22798c = y9Var.getY();
                q9Var.d = y9Var.getX();
                q9Var.f22796a = richMessageLayout.textBlockCharOffsets.get(i17).intValue();
                return;
            }
            q9Var.f22797b = null;
        } else if (u1Var.P2()) {
            MessageObject.TextLayoutBlocks captionLayout = u1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                q9Var.f22797b = captionLayout.textLayoutBlocks.get(0).textLayout;
                q9Var.f22798c = textLayoutBlock2.padTop;
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
                q9Var.d = f7;
                if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                    q9Var.d = f7 + AndroidUtilities.dp(8.0f);
                }
                q9Var.f22796a = 0;
                return;
            }
            for (int i18 = 0; i18 < captionLayout.textLayoutBlocks.size(); i18++) {
                MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i18);
                int i19 = i10 - textLayoutBlock4.charactersOffset;
                if (i19 >= 0 && i19 <= textLayoutBlock4.textLayout.getText().length()) {
                    q9Var.f22797b = textLayoutBlock4.textLayout;
                    q9Var.f22798c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                    if (textLayoutBlock4.quote) {
                        i14 = AndroidUtilities.dp(10.0f);
                    } else {
                        i14 = 0;
                    }
                    if (textLayoutBlock4.isRtl()) {
                        i17 = ((int) Math.ceil(captionLayout.textXOffset)) - i14;
                    }
                    float f10 = -i17;
                    q9Var.d = f10;
                    if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                        q9Var.d = f10 + AndroidUtilities.dp(8.0f);
                    }
                    q9Var.f22796a = textLayoutBlock4.charactersOffset;
                    return;
                }
            }
            q9Var.f22797b = null;
        } else {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
            if (arrayList == null) {
                q9Var.f22797b = null;
            } else if (arrayList.size() == 1) {
                q9Var.f22797b = messageObject.textLayoutBlocks.get(0).textLayout;
                q9Var.f22798c = textLayoutBlock.padTop;
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
                q9Var.d = f11;
                if (textLayoutBlock5.code && !textLayoutBlock5.quote) {
                    q9Var.d = f11 + AndroidUtilities.dp(8.0f);
                }
                q9Var.f22796a = 0;
            } else {
                for (int i20 = 0; i20 < messageObject.textLayoutBlocks.size(); i20++) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = messageObject.textLayoutBlocks.get(i20);
                    int i21 = i10 - textLayoutBlock6.charactersOffset;
                    if (i21 >= 0 && i21 <= textLayoutBlock6.textLayout.getText().length()) {
                        q9Var.f22797b = textLayoutBlock6.textLayout;
                        q9Var.f22798c = textLayoutBlock6.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock6.padTop;
                        if (textLayoutBlock6.quote) {
                            i11 = AndroidUtilities.dp(10.0f);
                        } else {
                            i11 = 0;
                        }
                        if (textLayoutBlock6.isRtl()) {
                            i17 = ((int) Math.ceil(messageObject.textXOffset)) - i11;
                        }
                        float f12 = -i17;
                        q9Var.d = f12;
                        if (textLayoutBlock6.code && !textLayoutBlock6.quote) {
                            q9Var.d = f12 + AndroidUtilities.dp(8.0f);
                        }
                        q9Var.f22796a = textLayoutBlock6.charactersOffset;
                        return;
                    }
                }
                q9Var.f22797b = null;
            }
        }
    }

    @Override
    public final int k(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.v9 r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o9.k(int, int, int, int, org.telegram.ui.Cells.v9, boolean):int");
    }

    @Override
    public final int m() {
        Layout layout;
        RichMessageLayout richMessageLayout;
        v9 v9Var = this.W;
        if (v9Var != null && ((u1) v9Var).getMessageObject() != null) {
            MessageObject messageObject = ((u1) this.W).getMessageObject();
            if (this.f22737q0) {
                layout = ((u1) this.W).getDescriptionlayout();
            } else if (this.f22739s0) {
                layout = ((u1) this.W).getFactCheckLayout();
            } else if (this.f22741u0) {
                if (messageObject != null) {
                    richMessageLayout = messageObject.richLayout;
                } else {
                    richMessageLayout = null;
                }
                if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                    layout = richMessageLayout.textBlocks.get(0).getLayout();
                }
                layout = null;
            } else if (((u1) this.W).P2()) {
                layout = ((u1) this.W).getCaptionLayout().textLayoutBlocks.get(0).textLayout;
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
    public final CharSequence s(v9 v9Var, boolean z10) {
        u1 u1Var = (u1) v9Var;
        if (u1Var != null && u1Var.getMessageObject() != null) {
            if (!z10 ? this.f22737q0 : this.f22738r0) {
                return u1Var.getDescriptionlayout().getText();
            }
            if (!z10 ? this.f22739s0 : this.f22740t0) {
                return u1Var.getFactCheckLayout().getText();
            }
            if (!z10 ? this.f22741u0 : this.f22742v0) {
                RichMessageLayout richMessageLayout = u1Var.getMessageObject().richLayout;
                if (richMessageLayout != null) {
                    return richMessageLayout.joinedText;
                }
                return "";
            } else if (u1Var.P2()) {
                return u1Var.getCaptionLayout().text;
            } else {
                return u1Var.getMessageObject().messageText;
            }
        }
        return null;
    }

    @Override
    public void w() {
        super.w();
        v9 v9Var = this.W;
        if (v9Var != null && ((u1) v9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        v9 v9Var2 = this.W;
        if (v9Var2 != null) {
            if (this.f22739s0 || this.f22740t0) {
                ((u1) v9Var2).a3();
            }
        }
    }
}
