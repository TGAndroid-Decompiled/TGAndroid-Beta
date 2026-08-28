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
    public boolean A0;
    public final SparseArray f24841u0 = new SparseArray();
    public boolean f24842v0;
    public boolean f24843w0;
    public boolean f24844x0;
    public boolean f24845y0;
    public boolean f24846z0;

    @Override
    public final boolean D() {
        v9 v9Var;
        RichMessageLayout richMessageLayout;
        CharSequence s10;
        String str;
        if (this.f24846z0 && (v9Var = this.W) != null && ((t1) v9Var).getMessageObject() != null && (richMessageLayout = ((t1) this.W).getMessageObject().richLayout) != null && !richMessageLayout.textBlocks.isEmpty() && (s10 = s()) != null && s10.length() != 0) {
            try {
                str = richMessageLayout.getSelectionHtml(this.f24108u, this.v);
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
        v9 v9Var = this.W;
        if (v9Var != null && ((t1) v9Var).g3() && !z10) {
            t1 t1Var = (t1) this.W;
            int id2 = t1Var.getMessageObject().getId();
            SparseArray sparseArray = this.f24841u0;
            Animator animator = (Animator) sparseArray.get(id2);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            t1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new dh.b(t1Var, id2, 2));
            ofFloat.addListener(new j1(1, t1Var));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(id2, ofFloat);
        }
    }

    @Override
    public final void M(v9 v9Var, v9 v9Var2) {
        boolean z10;
        t1 t1Var = (t1) v9Var;
        t1 t1Var2 = (t1) v9Var2;
        if (t1Var2 != null && (t1Var2.getMessageObject() == null || t1Var2.getMessageObject().getId() == t1Var.getMessageObject().getId())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f24109w = t1Var.getMessageObject().getId();
        try {
            int i9 = t1Var.getMessageObject().messageOwner.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f24842v0 = this.f24843w0;
        this.f24844x0 = this.f24845y0;
        this.f24846z0 = this.A0;
        int i10 = this.f24109w;
        SparseArray sparseArray = this.f24841u0;
        Animator animator = (Animator) sparseArray.get(i10);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new hg.y(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f24109w, ofFloat);
        if (!z10) {
            t1Var.setSelectedBackgroundProgress(0.0f);
        }
        SharedConfig.removeTextSelectionHint();
    }

    public final void X(MessageObject messageObject) {
        try {
            int i9 = messageObject.messageOwner.edit_date;
        } catch (Exception unused) {
        }
        if (this.f24109w == messageObject.getId()) {
            f(true);
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f24842v0) {
            return;
        }
        Paint paint = this.f24098p;
        Paint paint2 = this.f24096o;
        if (z10) {
            int i9 = org.telegram.ui.ActionBar.f6.Vb;
            paint2.setColor(u(i9));
            paint.setColor(u(i9));
        } else {
            int i10 = org.telegram.ui.ActionBar.f6.f23312uf;
            paint2.setColor(u(i10));
            paint.setColor(u(i10));
        }
        i(canvas, staticLayout, this.f24108u, this.v, true, true, 0.0f);
    }

    public final void Z(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        v9 v9Var;
        Canvas canvas2;
        boolean z10;
        if (this.f24846z0 && richMessageLayout != null && (v9Var = this.W) != null && ((t1) v9Var).getMessageObject() != null && ((t1) this.W).getMessageObject().getId() == messageObject.getId()) {
            boolean isOutOwner = messageObject.isOutOwner();
            Paint paint = this.f24098p;
            Paint paint2 = this.f24096o;
            if (isOutOwner) {
                int i9 = org.telegram.ui.ActionBar.f6.Vb;
                paint2.setColor(u(i9));
                paint.setColor(u(i9));
            } else {
                int i10 = org.telegram.ui.ActionBar.f6.f23312uf;
                paint2.setColor(u(i10));
                paint.setColor(u(i10));
            }
            int i11 = 0;
            while (i11 < richMessageLayout.textBlocks.size()) {
                y9 y9Var = richMessageLayout.textBlocks.get(i11);
                Layout layout = y9Var.getLayout();
                if (layout != null && layout.getText() != null) {
                    int intValue = richMessageLayout.textBlockCharOffsets.get(i11).intValue();
                    int length = layout.getText().length();
                    int clamp = Utilities.clamp(this.f24108u - intValue, length, 0);
                    int clamp2 = Utilities.clamp(this.v - intValue, length, 0);
                    if (clamp != clamp2) {
                        boolean z11 = true;
                        if (this.f24108u >= intValue) {
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
                        i(canvas2, layout, clamp, clamp2, z10, z11, 0.0f);
                        canvas2.restore();
                        i11++;
                        canvas = canvas2;
                    }
                }
                canvas2 = canvas;
                i11++;
                canvas = canvas2;
            }
        }
    }

    public final void a0(t1 t1Var, int i9, int i10) {
        if (t1Var == null) {
            return;
        }
        this.W = t1Var;
        this.f24109w = t1Var.getMessageObject().getId();
        this.f24108u = i9;
        this.v = i10;
        x();
        g7.a6 a6Var = this.D;
        if (a6Var != null) {
            a6Var.a(true);
        }
        this.f24082g = 0.0f;
        this.f24080f = 0.0f;
        this.f24078e = false;
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.setVisibility(0);
        }
        V();
    }

    public final void b0(t1 t1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = t1Var;
        MessageObject messageObject = t1Var.getMessageObject();
        s1 s1Var = t1Var.Vc;
        boolean z10 = this.f24843w0;
        Rect rect = this.B;
        if (z10 && t1Var.getDescriptionlayout() != null) {
            int i9 = this.f24075c;
            rect.set(i9, this.d, t1Var.getDescriptionlayout().getWidth() + i9, t1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f24845y0 && t1Var.getFactCheckLayout() != null) {
            int i10 = this.f24075c;
            rect.set(i10, this.d, t1Var.getFactCheckLayout().getWidth() + i10, t1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.A0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i11 = this.f24075c;
            rect.set(i11, this.d, richMessageLayout2.getMinWidth() + i11, richMessageLayout2.getHeight() + this.d);
        } else if (t1Var.P2() && t1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) j3.r0.j(1, t1Var.getCaptionLayout().textLayoutBlocks);
            int i12 = this.f24075c;
            rect.set(i12, this.d, textLayoutBlock.textLayout.getWidth() + i12, (int) (textLayoutBlock.textYOffset(t1Var.getCaptionLayout().textLayoutBlocks, s1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.textLayoutBlocks) != null && arrayList.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) j3.r0.j(1, messageObject.textLayoutBlocks);
            int i13 = this.f24075c;
            rect.set(i13, this.d, textLayoutBlock2.textLayout.getWidth() + i13, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, s1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void c0(int i9, int i10) {
        if (this.f24071a == i9 && this.f24073b == i10) {
            return;
        }
        this.f24071a = i9;
        this.f24073b = i10;
        x();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f24842v0 = false;
        this.f24844x0 = false;
        this.f24846z0 = false;
    }

    @Override
    public final void j(int i9, q9 q9Var, boolean z10) {
        v9 v9Var;
        int i10;
        MessageObject.TextLayoutBlock textLayoutBlock;
        int i11;
        int i12;
        int i13;
        MessageObject.TextLayoutBlock textLayoutBlock2;
        int i14;
        int i15;
        RichMessageLayout richMessageLayout;
        y9 y9Var;
        if (z10) {
            v9Var = this.X;
        } else {
            v9Var = this.W;
        }
        t1 t1Var = (t1) v9Var;
        if (t1Var == null) {
            q9Var.f24920b = null;
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        int i16 = 0;
        if (this.f24842v0) {
            q9Var.f24920b = t1Var.getDescriptionlayout();
            q9Var.f24921c = 0.0f;
            q9Var.d = 0.0f;
            q9Var.f24919a = 0;
        } else if (this.f24844x0) {
            q9Var.f24920b = t1Var.getFactCheckLayout();
            q9Var.f24921c = 0.0f;
            q9Var.d = 0.0f;
            q9Var.f24919a = 0;
        } else if (this.f24846z0) {
            if (messageObject != null) {
                richMessageLayout = messageObject.richLayout;
            } else {
                richMessageLayout = null;
            }
            if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                while (true) {
                    if (i16 < richMessageLayout.textBlocks.size()) {
                        int intValue = richMessageLayout.textBlockCharOffsets.get(i16).intValue();
                        int length = richMessageLayout.textBlocks.get(i16).getLayout().getText().length();
                        if (i9 >= intValue && i9 <= intValue + length) {
                            break;
                        }
                        i16++;
                    } else {
                        i16 = -1;
                        break;
                    }
                }
                if (i16 < 0) {
                    i16 = richMessageLayout.textBlocks.size() - 1;
                }
                q9Var.f24920b = richMessageLayout.textBlocks.get(i16).getLayout();
                q9Var.f24921c = y9Var.getY();
                q9Var.d = y9Var.getX();
                q9Var.f24919a = richMessageLayout.textBlockCharOffsets.get(i16).intValue();
                return;
            }
            q9Var.f24920b = null;
        } else if (t1Var.P2()) {
            MessageObject.TextLayoutBlocks captionLayout = t1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                q9Var.f24920b = captionLayout.textLayoutBlocks.get(0).textLayout;
                q9Var.f24921c = textLayoutBlock2.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock3 = captionLayout.textLayoutBlocks.get(0);
                if (textLayoutBlock3.quote) {
                    i14 = AndroidUtilities.dp(10.0f);
                } else {
                    i14 = 0;
                }
                if (textLayoutBlock3.isRtl()) {
                    i15 = ((int) Math.ceil(captionLayout.textXOffset)) - i14;
                } else {
                    i15 = 0;
                }
                float f10 = -i15;
                q9Var.d = f10;
                if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                    q9Var.d = f10 + AndroidUtilities.dp(8.0f);
                }
                q9Var.f24919a = 0;
                return;
            }
            for (int i17 = 0; i17 < captionLayout.textLayoutBlocks.size(); i17++) {
                MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i17);
                int i18 = i9 - textLayoutBlock4.charactersOffset;
                if (i18 >= 0 && i18 <= textLayoutBlock4.textLayout.getText().length()) {
                    q9Var.f24920b = textLayoutBlock4.textLayout;
                    q9Var.f24921c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                    if (textLayoutBlock4.quote) {
                        i13 = AndroidUtilities.dp(10.0f);
                    } else {
                        i13 = 0;
                    }
                    if (textLayoutBlock4.isRtl()) {
                        i16 = ((int) Math.ceil(captionLayout.textXOffset)) - i13;
                    }
                    float f11 = -i16;
                    q9Var.d = f11;
                    if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                        q9Var.d = f11 + AndroidUtilities.dp(8.0f);
                    }
                    q9Var.f24919a = textLayoutBlock4.charactersOffset;
                    return;
                }
            }
            q9Var.f24920b = null;
        } else {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
            if (arrayList == null) {
                q9Var.f24920b = null;
            } else if (arrayList.size() == 1) {
                q9Var.f24920b = messageObject.textLayoutBlocks.get(0).textLayout;
                q9Var.f24921c = textLayoutBlock.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock5 = messageObject.textLayoutBlocks.get(0);
                if (textLayoutBlock5.quote) {
                    i11 = AndroidUtilities.dp(10.0f);
                } else {
                    i11 = 0;
                }
                if (textLayoutBlock5.isRtl()) {
                    i12 = ((int) Math.ceil(messageObject.textXOffset)) - i11;
                } else {
                    i12 = 0;
                }
                float f12 = -i12;
                q9Var.d = f12;
                if (textLayoutBlock5.code && !textLayoutBlock5.quote) {
                    q9Var.d = f12 + AndroidUtilities.dp(8.0f);
                }
                q9Var.f24919a = 0;
            } else {
                for (int i19 = 0; i19 < messageObject.textLayoutBlocks.size(); i19++) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = messageObject.textLayoutBlocks.get(i19);
                    int i20 = i9 - textLayoutBlock6.charactersOffset;
                    if (i20 >= 0 && i20 <= textLayoutBlock6.textLayout.getText().length()) {
                        q9Var.f24920b = textLayoutBlock6.textLayout;
                        q9Var.f24921c = textLayoutBlock6.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock6.padTop;
                        if (textLayoutBlock6.quote) {
                            i10 = AndroidUtilities.dp(10.0f);
                        } else {
                            i10 = 0;
                        }
                        if (textLayoutBlock6.isRtl()) {
                            i16 = ((int) Math.ceil(messageObject.textXOffset)) - i10;
                        }
                        float f13 = -i16;
                        q9Var.d = f13;
                        if (textLayoutBlock6.code && !textLayoutBlock6.quote) {
                            q9Var.d = f13 + AndroidUtilities.dp(8.0f);
                        }
                        q9Var.f24919a = textLayoutBlock6.charactersOffset;
                        return;
                    }
                }
                q9Var.f24920b = null;
            }
        }
    }

    @Override
    public final int l(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.v9 r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o9.l(int, int, int, int, org.telegram.ui.Cells.v9, boolean):int");
    }

    @Override
    public final int n() {
        Layout layout;
        RichMessageLayout richMessageLayout;
        v9 v9Var = this.W;
        if (v9Var != null && ((t1) v9Var).getMessageObject() != null) {
            MessageObject messageObject = ((t1) this.W).getMessageObject();
            if (this.f24842v0) {
                layout = ((t1) this.W).getDescriptionlayout();
            } else if (this.f24844x0) {
                layout = ((t1) this.W).getFactCheckLayout();
            } else if (this.f24846z0) {
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
    public final CharSequence t(v9 v9Var, boolean z10) {
        t1 t1Var = (t1) v9Var;
        if (t1Var != null && t1Var.getMessageObject() != null) {
            if (!z10 ? this.f24842v0 : this.f24843w0) {
                return t1Var.getDescriptionlayout().getText();
            }
            if (!z10 ? this.f24844x0 : this.f24845y0) {
                return t1Var.getFactCheckLayout().getText();
            }
            if (!z10 ? this.f24846z0 : this.A0) {
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
        v9 v9Var = this.W;
        if (v9Var != null && ((t1) v9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        v9 v9Var2 = this.W;
        if (v9Var2 != null) {
            if (this.f24844x0 || this.f24845y0) {
                ((t1) v9Var2).a3();
            }
        }
    }
}
