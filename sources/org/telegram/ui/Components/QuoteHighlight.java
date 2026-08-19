package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.ChatMessageCell;

public class QuoteHighlight extends Path {
    public final ChatMessageCell cell;
    private int cornerPathEffectSize;
    private float currentOffsetX;
    private float currentOffsetY;
    public final int end;
    public final int id;
    private Rect lastRect;
    private float minX;
    public final Paint paint;
    private final CornerPath path;
    public final boolean poll;
    public byte[] pollOptionId;
    public final ArrayList quotesToExpand;
    private final ArrayList rectangles;
    public final int start;
    private final AnimatedFloat t;
    public final boolean todo;

    private static class Rect {
        public float bottom;
        public boolean first;
        public boolean last;
        public float left;
        public float nextBottom;
        public float prevTop;
        public float right;
        public float top;

        private Rect() {
        }
    }

    public QuoteHighlight(final ChatMessageCell chatMessageCell, int i, int i2) {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.path = new CornerPath();
        this.rectangles = new ArrayList();
        this.quotesToExpand = new ArrayList();
        this.cell = chatMessageCell;
        this.t = new AnimatedFloat(0.0f, new Runnable() {
            @Override
            public final void run() {
                QuoteHighlight.m2678$r8$lambda$4waOk2vMbE18qeSW6UP2HXYHDU(chatMessageCell);
            }
        }, 350L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.id = i;
        int i3 = -i2;
        this.start = i3;
        this.end = i3;
        this.todo = true;
        this.poll = false;
        int iDp = AndroidUtilities.dp(4.0f);
        this.cornerPathEffectSize = iDp;
        paint.setPathEffect(new CornerPathEffect(iDp));
    }

    public static void m2678$r8$lambda$4waOk2vMbE18qeSW6UP2HXYHDU(ChatMessageCell chatMessageCell) {
        if (chatMessageCell != null) {
            chatMessageCell.invalidate();
        }
        if (chatMessageCell.getParent() instanceof View) {
            ((View) chatMessageCell.getParent()).invalidate();
        }
    }

    public QuoteHighlight(final ChatMessageCell chatMessageCell, int i, byte[] bArr) {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.path = new CornerPath();
        this.rectangles = new ArrayList();
        this.quotesToExpand = new ArrayList();
        this.cell = chatMessageCell;
        this.t = new AnimatedFloat(0.0f, new Runnable() {
            @Override
            public final void run() {
                QuoteHighlight.$r8$lambda$FrmBRmhxAimyxX4zFmww8ORlVME(chatMessageCell);
            }
        }, 350L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.id = i;
        this.pollOptionId = bArr;
        this.start = 0;
        this.end = 0;
        this.todo = false;
        this.poll = true;
        int iDp = AndroidUtilities.dp(4.0f);
        this.cornerPathEffectSize = iDp;
        paint.setPathEffect(new CornerPathEffect(iDp));
    }

    public static void $r8$lambda$FrmBRmhxAimyxX4zFmww8ORlVME(ChatMessageCell chatMessageCell) {
        if (chatMessageCell != null) {
            chatMessageCell.invalidate();
        }
        if (chatMessageCell.getParent() instanceof View) {
            ((View) chatMessageCell.getParent()).invalidate();
        }
    }

    public QuoteHighlight(final View view, final ViewParent viewParent, int i, ArrayList arrayList, int i2, int i3, float f) {
        int i4;
        Paint paint = new Paint(1);
        this.paint = paint;
        this.path = new CornerPath();
        this.rectangles = new ArrayList();
        this.quotesToExpand = new ArrayList();
        this.cell = null;
        this.t = new AnimatedFloat(0.0f, new Runnable() {
            @Override
            public final void run() {
                QuoteHighlight.$r8$lambda$ndzqcitrdwbkbHWU4Usl4NiPxIo(view, viewParent);
            }
        }, 350L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.id = i;
        this.start = i2;
        this.end = i3;
        this.todo = false;
        this.poll = false;
        if (arrayList == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(4.0f);
        this.cornerPathEffectSize = iDp;
        paint.setPathEffect(new CornerPathEffect(iDp));
        boolean z = false;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList.get(i5);
            if (textLayoutBlock != null && i2 <= textLayoutBlock.charactersEnd && i3 >= (i4 = textLayoutBlock.charactersOffset)) {
                int iMax = Math.max(0, i2 - i4);
                int i6 = textLayoutBlock.charactersOffset;
                int iMin = Math.min(i3 - i6, textLayoutBlock.charactersEnd - i6);
                float f2 = -f;
                this.currentOffsetX = f2;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.currentOffsetX = f2 + AndroidUtilities.dp(10.0f);
                }
                this.currentOffsetY = textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop;
                this.minX = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z = z || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z) {
                    textLayoutBlock.textLayout.getSelectionPath(iMax, iMin, this);
                } else {
                    getSelectionPath(textLayoutBlock.textLayout, iMax, iMin);
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.quotesToExpand.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
        }
        if (this.rectangles.size() > 0) {
            Rect rect = (Rect) this.rectangles.get(0);
            ArrayList arrayList2 = this.rectangles;
            Rect rect2 = (Rect) arrayList2.get(arrayList2.size() - 1);
            rect.first = true;
            rect.top -= AndroidUtilities.dp(0.66f);
            rect2.last = true;
            rect2.bottom += AndroidUtilities.dp(0.66f);
        }
    }

    public static void $r8$lambda$ndzqcitrdwbkbHWU4Usl4NiPxIo(View view, ViewParent viewParent) {
        if (view != null) {
            view.invalidate();
        }
        if (viewParent instanceof View) {
            ((View) viewParent).invalidate();
        }
    }

    private void getSelectionPath(Layout layout, int i, int i2) {
        float lineLeft;
        float lineRight;
        if (i == i2) {
            return;
        }
        if (i2 < i) {
            i2 = i;
            i = i2;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineForOffset2 = layout.getLineForOffset(i2);
        for (int i3 = lineForOffset; i3 <= lineForOffset2; i3++) {
            int lineStart = layout.getLineStart(i3);
            int lineEnd = layout.getLineEnd(i3);
            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                if (i3 == lineForOffset && i > lineStart) {
                    lineLeft = layout.getPrimaryHorizontal(i);
                } else {
                    lineLeft = layout.getLineLeft(i3);
                }
                if (i3 == lineForOffset2 && i2 < lineEnd) {
                    lineRight = layout.getPrimaryHorizontal(i2);
                } else {
                    lineRight = layout.getLineRight(i3);
                }
                addRect(Math.min(lineLeft, lineRight), layout.getLineTop(i3), Math.max(lineLeft, lineRight), layout.getLineBottom(i3));
            }
        }
    }

    public float getT() {
        return this.t.set(1.0f);
    }

    public void draw(Canvas canvas, float f, float f2, android.graphics.Rect rect, float f3) {
        float f4 = this.t.set(1.0f);
        canvas.save();
        if (this.poll) {
            int iLerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, f4);
            if (this.cornerPathEffectSize != iLerp) {
                Paint paint = this.paint;
                this.cornerPathEffectSize = iLerp;
                paint.setPathEffect(new CornerPathEffect(iLerp));
            }
            this.path.rewind();
            int pollIndex = this.cell.getPollIndex(this.pollOptionId);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.cell.getBackgroundDrawableLeft(), this.cell.getPollButtonTop(pollIndex), this.cell.getBackgroundDrawableRight(), this.cell.getPollButtonBottom(pollIndex));
            AndroidUtilities.lerp(rect, rectF, f4, rectF);
            this.path.addRect(rectF, Path.Direction.CW);
            this.path.closeRects();
        } else if (this.todo) {
            int iLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, f4);
            if (this.cornerPathEffectSize != iLerp2) {
                Paint paint2 = this.paint;
                this.cornerPathEffectSize = iLerp2;
                paint2.setPathEffect(new CornerPathEffect(iLerp2));
            }
            this.path.rewind();
            int todoIndex = this.cell.getTodoIndex(-this.start);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.cell.getBackgroundDrawableLeft(), this.cell.getPollButtonTop(todoIndex), this.cell.getBackgroundDrawableRight(), this.cell.getPollButtonBottom(todoIndex));
            AndroidUtilities.lerp(rect, rectF2, f4, rectF2);
            this.path.addRect(rectF2, Path.Direction.CW);
            this.path.closeRects();
        } else {
            canvas.translate(f, f2);
            this.path.rewind();
            for (int i = 0; i < this.rectangles.size(); i++) {
                Rect rect2 = (Rect) this.rectangles.get(i);
                this.path.addRect(AndroidUtilities.lerp(rect.left - f, rect2.left, f4), AndroidUtilities.lerp(rect2.first ? rect.top - f2 : rect2.prevTop, rect2.top, f4), AndroidUtilities.lerp(rect.right - f, rect2.right, f4), AndroidUtilities.lerp(rect2.last ? rect.bottom - f2 : rect2.nextBottom, rect2.bottom, f4), Path.Direction.CW);
            }
            this.path.closeRects();
        }
        int alpha = this.paint.getAlpha();
        this.paint.setAlpha((int) (alpha * f3));
        canvas.drawPath(this.path, this.paint);
        this.paint.setAlpha(alpha);
        canvas.restore();
    }

    public boolean done() {
        return this.t.get() >= 1.0f;
    }

    @Override
    public void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        addRect(f, f2, f3, f4);
    }

    public void addRect(float f, float f2, float f3, float f4) {
        if (f >= f3) {
            return;
        }
        float fMax = Math.max(this.minX, f);
        float fMax2 = Math.max(this.minX, f3);
        float f5 = this.currentOffsetX;
        float f6 = fMax + f5;
        float f7 = this.currentOffsetY;
        float f8 = f2 + f7;
        float f9 = fMax2 + f5;
        Rect rect = new Rect();
        rect.left = f6 - AndroidUtilities.dp(3.0f);
        rect.right = f9 + AndroidUtilities.dp(3.0f);
        rect.top = f8;
        rect.bottom = f4 + f7;
        Rect rect2 = this.lastRect;
        if (rect2 != null) {
            float f10 = (rect2.bottom + f8) / 2.0f;
            rect2.nextBottom = f10;
            rect.prevTop = f10;
        }
        this.rectangles.add(rect);
        this.lastRect = rect;
    }
}
