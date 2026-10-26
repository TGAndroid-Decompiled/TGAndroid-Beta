package org.telegram.ui.Cells;

import a8.ye;
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
public abstract class t9 extends fa {
    public final SparseArray f25459p0 = new SparseArray();
    public boolean f25460q0;
    public boolean f25461r0;
    public boolean f25462s0;
    public boolean f25463t0;
    public boolean f25464u0;
    public boolean f25465v0;

    @Override
    public final boolean C() {
        aa aaVar;
        RichMessageLayout richMessageLayout;
        CharSequence r6;
        String str;
        if (this.f25464u0 && (aaVar = this.W) != null && ((s1) aaVar).getMessageObject() != null && (richMessageLayout = ((s1) this.W).getMessageObject().richLayout) != null && !richMessageLayout.textBlocks.isEmpty() && (r6 = r()) != null && r6.length() != 0) {
            try {
                str = richMessageLayout.getSelectionHtml(this.f24118u, this.v);
            } catch (Exception e) {
                FileLog.e(e);
                str = null;
            }
            if (str != null && str.length() != 0) {
                AndroidUtilities.addToClipboard(r6, str);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void E(boolean z10) {
        aa aaVar = this.W;
        if (aaVar != null && ((s1) aaVar).g3() && !z10) {
            s1 s1Var = (s1) this.W;
            int id2 = s1Var.getMessageObject().getId();
            SparseArray sparseArray = this.f25459p0;
            Animator animator = (Animator) sparseArray.get(id2);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            s1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.u2(s1Var, id2, 1));
            ofFloat.addListener(new i1(1, s1Var));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(id2, ofFloat);
        }
    }

    @Override
    public final void L(aa aaVar, aa aaVar2) {
        boolean z10;
        s1 s1Var = (s1) aaVar;
        s1 s1Var2 = (s1) aaVar2;
        if (s1Var2 != null && (s1Var2.getMessageObject() == null || s1Var2.getMessageObject().getId() == s1Var.getMessageObject().getId())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f24119w = s1Var.getMessageObject().getId();
        try {
            int i10 = s1Var.getMessageObject().messageOwner.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f25460q0 = this.f25461r0;
        this.f25462s0 = this.f25463t0;
        this.f25464u0 = this.f25465v0;
        int i11 = this.f24119w;
        SparseArray sparseArray = this.f25459p0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new bh.a0(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f24119w, ofFloat);
        if (!z10) {
            s1Var.setSelectedBackgroundProgress(0.0f);
        }
        SharedConfig.removeTextSelectionHint();
    }

    public final void W(MessageObject messageObject) {
        try {
            int i10 = messageObject.messageOwner.edit_date;
        } catch (Exception unused) {
        }
        if (this.f24119w == messageObject.getId()) {
            f(true);
        }
    }

    public final void X(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f25460q0) {
            return;
        }
        Paint paint = this.f24113p;
        Paint paint2 = this.f24111o;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.y6.Vb;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.y6.f23682uf;
            paint2.setColor(t(i11));
            paint.setColor(t(i11));
        }
        h(canvas, staticLayout, this.f24118u, this.v, true, true, 0.0f);
    }

    public final void Y(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        aa aaVar;
        da daVar;
        Canvas canvas2;
        boolean z10;
        if (this.f25464u0 && richMessageLayout != null && (aaVar = this.W) != null && ((s1) aaVar).getMessageObject() != null && ((s1) this.W).getMessageObject().getId() == messageObject.getId()) {
            boolean isOutOwner = messageObject.isOutOwner();
            Paint paint = this.f24113p;
            Paint paint2 = this.f24111o;
            if (isOutOwner) {
                int i10 = org.telegram.ui.ActionBar.y6.Vb;
                paint2.setColor(t(i10));
                paint.setColor(t(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.y6.f23682uf;
                paint2.setColor(t(i11));
                paint.setColor(t(i11));
            }
            int i12 = 0;
            while (i12 < richMessageLayout.textBlocks.size()) {
                Layout layout = richMessageLayout.textBlocks.get(i12).getLayout();
                if (layout != null && layout.getText() != null) {
                    int intValue = richMessageLayout.textBlockCharOffsets.get(i12).intValue();
                    int length = layout.getText().length();
                    int clamp = Utilities.clamp(this.f24118u - intValue, length, 0);
                    int clamp2 = Utilities.clamp(this.v - intValue, length, 0);
                    if (clamp != clamp2) {
                        boolean z11 = true;
                        if (this.f24118u >= intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.v > intValue + length) {
                            z11 = false;
                        }
                        canvas.save();
                        canvas.translate(daVar.getX(), daVar.getY());
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

    public final void Z(s1 s1Var, int i10, int i11) {
        boolean z10;
        if (s1Var == null) {
            return;
        }
        this.W = s1Var;
        this.f24119w = s1Var.getMessageObject().getId();
        if (((s1) this.W).getMessageObject().type == 36 && ((s1) this.W).getMessageObject().richLayout != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25464u0 = z10;
        if (z10) {
            this.f25460q0 = false;
            this.f25462s0 = false;
        }
        this.f24118u = i10;
        this.v = i11;
        w();
        ye yeVar = this.D;
        if (yeVar != null) {
            yeVar.a(true);
        }
        this.f24097g = 0.0f;
        this.f24095f = 0.0f;
        this.e = false;
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.setVisibility(0);
        }
        U();
    }

    public final void a0(s1 s1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = s1Var;
        MessageObject messageObject = s1Var.getMessageObject();
        r1 r1Var = s1Var.Zc;
        boolean z10 = this.f25461r0;
        Rect rect = this.B;
        if (z10 && s1Var.getDescriptionlayout() != null) {
            int i10 = this.f24091c;
            rect.set(i10, this.d, s1Var.getDescriptionlayout().getWidth() + i10, s1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f25463t0 && s1Var.getFactCheckLayout() != null) {
            int i11 = this.f24091c;
            rect.set(i11, this.d, s1Var.getFactCheckLayout().getWidth() + i11, s1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.f25465v0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i12 = this.f24091c;
            rect.set(i12, this.d, richMessageLayout2.getMinWidth() + i12, richMessageLayout2.getHeight() + this.d);
        } else if (s1Var.P2() && s1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) ic.a.g(1, s1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.f24091c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(s1Var.getCaptionLayout().textLayoutBlocks, r1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.textLayoutBlocks) != null && arrayList.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) ic.a.g(1, messageObject.textLayoutBlocks);
            int i14 = this.f24091c;
            rect.set(i14, this.d, textLayoutBlock2.textLayout.getWidth() + i14, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, r1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void b0(int i10, int i11) {
        if (this.f24087a == i10 && this.f24089b == i11) {
            return;
        }
        this.f24087a = i10;
        this.f24089b = i11;
        w();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f25460q0 = false;
        this.f25462s0 = false;
        this.f25464u0 = false;
    }

    @Override
    public final void i(int i10, v9 v9Var, boolean z10) {
        aa aaVar;
        int i11;
        MessageObject.TextLayoutBlock textLayoutBlock;
        int i12;
        int i13;
        int i14;
        MessageObject.TextLayoutBlock textLayoutBlock2;
        int i15;
        int i16;
        RichMessageLayout richMessageLayout;
        da daVar;
        if (z10) {
            aaVar = this.X;
        } else {
            aaVar = this.W;
        }
        s1 s1Var = (s1) aaVar;
        if (s1Var == null) {
            v9Var.f25604b = null;
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        int i17 = 0;
        if (this.f25460q0) {
            v9Var.f25604b = s1Var.getDescriptionlayout();
            v9Var.f25605c = 0.0f;
            v9Var.d = 0.0f;
            v9Var.f25603a = 0;
        } else if (this.f25462s0) {
            v9Var.f25604b = s1Var.getFactCheckLayout();
            v9Var.f25605c = 0.0f;
            v9Var.d = 0.0f;
            v9Var.f25603a = 0;
        } else if (this.f25464u0) {
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
                v9Var.f25604b = richMessageLayout.textBlocks.get(i17).getLayout();
                v9Var.f25605c = daVar.getY();
                v9Var.d = daVar.getX();
                v9Var.f25603a = richMessageLayout.textBlockCharOffsets.get(i17).intValue();
                return;
            }
            v9Var.f25604b = null;
        } else if (s1Var.P2()) {
            MessageObject.TextLayoutBlocks captionLayout = s1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                v9Var.f25604b = captionLayout.textLayoutBlocks.get(0).textLayout;
                v9Var.f25605c = textLayoutBlock2.padTop;
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
                v9Var.d = f7;
                if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                    v9Var.d = f7 + AndroidUtilities.dp(8.0f);
                }
                v9Var.f25603a = 0;
                return;
            }
            for (int i18 = 0; i18 < captionLayout.textLayoutBlocks.size(); i18++) {
                MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i18);
                int i19 = i10 - textLayoutBlock4.charactersOffset;
                if (i19 >= 0 && i19 <= textLayoutBlock4.textLayout.getText().length()) {
                    v9Var.f25604b = textLayoutBlock4.textLayout;
                    v9Var.f25605c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                    if (textLayoutBlock4.quote) {
                        i14 = AndroidUtilities.dp(10.0f);
                    } else {
                        i14 = 0;
                    }
                    if (textLayoutBlock4.isRtl()) {
                        i17 = ((int) Math.ceil(captionLayout.textXOffset)) - i14;
                    }
                    float f10 = -i17;
                    v9Var.d = f10;
                    if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                        v9Var.d = f10 + AndroidUtilities.dp(8.0f);
                    }
                    v9Var.f25603a = textLayoutBlock4.charactersOffset;
                    return;
                }
            }
            v9Var.f25604b = null;
        } else {
            ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
            if (arrayList == null) {
                v9Var.f25604b = null;
            } else if (arrayList.size() == 1) {
                v9Var.f25604b = messageObject.textLayoutBlocks.get(0).textLayout;
                v9Var.f25605c = textLayoutBlock.padTop;
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
                v9Var.d = f11;
                if (textLayoutBlock5.code && !textLayoutBlock5.quote) {
                    v9Var.d = f11 + AndroidUtilities.dp(8.0f);
                }
                v9Var.f25603a = 0;
            } else {
                for (int i20 = 0; i20 < messageObject.textLayoutBlocks.size(); i20++) {
                    MessageObject.TextLayoutBlock textLayoutBlock6 = messageObject.textLayoutBlocks.get(i20);
                    int i21 = i10 - textLayoutBlock6.charactersOffset;
                    if (i21 >= 0 && i21 <= textLayoutBlock6.textLayout.getText().length()) {
                        v9Var.f25604b = textLayoutBlock6.textLayout;
                        v9Var.f25605c = textLayoutBlock6.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock6.padTop;
                        if (textLayoutBlock6.quote) {
                            i11 = AndroidUtilities.dp(10.0f);
                        } else {
                            i11 = 0;
                        }
                        if (textLayoutBlock6.isRtl()) {
                            i17 = ((int) Math.ceil(messageObject.textXOffset)) - i11;
                        }
                        float f12 = -i17;
                        v9Var.d = f12;
                        if (textLayoutBlock6.code && !textLayoutBlock6.quote) {
                            v9Var.d = f12 + AndroidUtilities.dp(8.0f);
                        }
                        v9Var.f25603a = textLayoutBlock6.charactersOffset;
                        return;
                    }
                }
                v9Var.f25604b = null;
            }
        }
    }

    @Override
    public final int k(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.aa r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t9.k(int, int, int, int, org.telegram.ui.Cells.aa, boolean):int");
    }

    @Override
    public final int m() {
        Layout layout;
        RichMessageLayout richMessageLayout;
        aa aaVar = this.W;
        if (aaVar != null && ((s1) aaVar).getMessageObject() != null) {
            MessageObject messageObject = ((s1) this.W).getMessageObject();
            if (this.f25460q0) {
                layout = ((s1) this.W).getDescriptionlayout();
            } else if (this.f25462s0) {
                layout = ((s1) this.W).getFactCheckLayout();
            } else if (this.f25464u0) {
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
    public final CharSequence s(aa aaVar, boolean z10) {
        s1 s1Var = (s1) aaVar;
        if (s1Var != null && s1Var.getMessageObject() != null) {
            if (!z10 ? this.f25460q0 : this.f25461r0) {
                return s1Var.getDescriptionlayout().getText();
            }
            if (!z10 ? this.f25462s0 : this.f25463t0) {
                return s1Var.getFactCheckLayout().getText();
            }
            if (!z10 ? this.f25464u0 : this.f25465v0) {
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
    public void w() {
        super.w();
        aa aaVar = this.W;
        if (aaVar != null && ((s1) aaVar).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        aa aaVar2 = this.W;
        if (aaVar2 != null) {
            if (this.f25462s0 || this.f25463t0) {
                ((s1) aaVar2).a3();
            }
        }
    }
}
