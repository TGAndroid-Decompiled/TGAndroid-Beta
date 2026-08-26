package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.ViewParent;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda7;

public final class QuoteHighlight extends Path {
    public final ChatMessageCell cell;
    public int cornerPathEffectSize;
    public final float currentOffsetX;
    public final float currentOffsetY;
    public final int end;
    public final int id;
    public Rect lastRect;
    public final float minX;
    public final Paint paint;
    public final CornerPath path;
    public final boolean poll;
    public final byte[] pollOptionId;
    public final ArrayList quotesToExpand;
    public final ArrayList rectangles;
    public final int start;
    public final AnimatedFloat t;
    public final boolean todo;

    public final class Rect {
        public float bottom;
        public boolean first;
        public boolean last;
        public float left;
        public float nextBottom;
        public float prevTop;
        public float right;
        public float top;
    }

    public QuoteHighlight(ChatMessageCell chatMessageCell, int i, int i2) {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.path = new CornerPath();
        this.rectangles = new ArrayList();
        this.quotesToExpand = new ArrayList();
        this.cell = chatMessageCell;
        this.t = new AnimatedFloat(0.0f, new ChatMessageCell$$ExternalSyntheticLambda7(11, chatMessageCell), 350L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
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

    @Override
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        addRect(f, f2, f3, f4);
    }

    public final void draw(Canvas canvas, float f, float f2, android.graphics.Rect rect, float f3) {
        int i = 0;
        float f4 = this.t.set(1.0f, false);
        canvas.save();
        Paint paint = this.paint;
        CornerPath cornerPath = this.path;
        boolean z = this.poll;
        ChatMessageCell chatMessageCell = this.cell;
        if (z) {
            int iLerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, f4);
            if (this.cornerPathEffectSize != iLerp) {
                this.cornerPathEffectSize = iLerp;
                paint.setPathEffect(new CornerPathEffect(iLerp));
            }
            cornerPath.rewind();
            int pollIndex = chatMessageCell.getPollIndex(this.pollOptionId);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(chatMessageCell.getBackgroundDrawableLeft(), chatMessageCell.getPollButtonTop(pollIndex), chatMessageCell.getBackgroundDrawableRight(), chatMessageCell.getPollButtonBottom(pollIndex));
            AndroidUtilities.lerp(rect, rectF, f4, rectF);
            cornerPath.addRect(rectF, Path.Direction.CW);
            cornerPath.closeRects();
        } else if (this.todo) {
            int iLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, f4);
            if (this.cornerPathEffectSize != iLerp2) {
                this.cornerPathEffectSize = iLerp2;
                paint.setPathEffect(new CornerPathEffect(iLerp2));
            }
            cornerPath.rewind();
            int todoIndex = chatMessageCell.getTodoIndex(-this.start);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(chatMessageCell.getBackgroundDrawableLeft(), chatMessageCell.getPollButtonTop(todoIndex), chatMessageCell.getBackgroundDrawableRight(), chatMessageCell.getPollButtonBottom(todoIndex));
            AndroidUtilities.lerp(rect, rectF2, f4, rectF2);
            cornerPath.addRect(rectF2, Path.Direction.CW);
            cornerPath.closeRects();
        } else {
            canvas.translate(f, f2);
            cornerPath.rewind();
            while (true) {
                ArrayList arrayList = this.rectangles;
                if (i >= arrayList.size()) {
                    break;
                }
                Rect rect2 = (Rect) arrayList.get(i);
                cornerPath.addRect(AndroidUtilities.lerp(rect.left - f, rect2.left, f4), AndroidUtilities.lerp(rect2.first ? rect.top - f2 : rect2.prevTop, rect2.top, f4), AndroidUtilities.lerp(rect.right - f, rect2.right, f4), AndroidUtilities.lerp(rect2.last ? rect.bottom - f2 : rect2.nextBottom, rect2.bottom, f4), Path.Direction.CW);
                i++;
            }
            cornerPath.closeRects();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f3));
        canvas.drawPath(cornerPath, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final void addRect(float f, float f2, float f3, float f4) {
        if (f >= f3) {
            return;
        }
        float f5 = this.minX;
        float fMax = Math.max(f5, f);
        float fMax2 = Math.max(f5, f3);
        float f6 = this.currentOffsetX;
        float f7 = fMax + f6;
        float f8 = this.currentOffsetY;
        float f9 = f2 + f8;
        float f10 = fMax2 + f6;
        Rect rect = new Rect();
        rect.left = f7 - AndroidUtilities.dp(3.0f);
        rect.right = f10 + AndroidUtilities.dp(3.0f);
        rect.top = f9;
        rect.bottom = f4 + f8;
        Rect rect2 = this.lastRect;
        if (rect2 != null) {
            float f11 = (rect2.bottom + f9) / 2.0f;
            rect2.nextBottom = f11;
            rect.prevTop = f11;
        }
        this.rectangles.add(rect);
        this.lastRect = rect;
    }

    public QuoteHighlight(ChatMessageCell chatMessageCell, int i, byte[] bArr) {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.path = new CornerPath();
        this.rectangles = new ArrayList();
        this.quotesToExpand = new ArrayList();
        this.cell = chatMessageCell;
        this.t = new AnimatedFloat(0.0f, new ChatMessageCell$$ExternalSyntheticLambda7(12, chatMessageCell), 350L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
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

    public QuoteHighlight(ChatMessageCell chatMessageCell, ViewParent viewParent, int i, ArrayList arrayList, int i2, int i3, float f) {
        int i4;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i5 = i2;
        Paint paint = new Paint(1);
        this.paint = paint;
        this.path = new CornerPath();
        this.rectangles = new ArrayList();
        this.quotesToExpand = new ArrayList();
        this.cell = null;
        this.t = new AnimatedFloat(0.0f, new ShareAlert$$ExternalSyntheticLambda29(3, chatMessageCell, viewParent), 350L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.id = i;
        this.start = i5;
        this.end = i3;
        int i6 = 0;
        this.todo = false;
        this.poll = false;
        if (arrayList2 == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(4.0f);
        this.cornerPathEffectSize = iDp;
        paint.setPathEffect(new CornerPathEffect(iDp));
        int i7 = 0;
        boolean z = false;
        while (i7 < arrayList2.size()) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList2.get(i7);
            if (textLayoutBlock != 0 && i5 <= textLayoutBlock.charactersEnd && i3 >= (i4 = textLayoutBlock.charactersOffset)) {
                int iMax = Math.max(i6, i5 - i4);
                int i8 = textLayoutBlock.charactersOffset;
                int iMin = Math.min(i3 - i8, textLayoutBlock.charactersEnd - i8);
                float f2 = -f;
                this.currentOffsetX = f2;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.currentOffsetX = f2 + AndroidUtilities.dp(10.0f);
                }
                this.currentOffsetY = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.minX = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z = z || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z) {
                    textLayoutBlock.textLayout.getSelectionPath(iMax, iMin, this);
                } else {
                    StaticLayout staticLayout = textLayoutBlock.textLayout;
                    if (iMax != iMin) {
                        if (iMin < iMax) {
                            iMin = iMax;
                            iMax = iMin;
                        }
                        int lineForOffset = staticLayout.getLineForOffset(iMax);
                        int lineForOffset2 = staticLayout.getLineForOffset(iMin);
                        for (int i9 = lineForOffset; i9 <= lineForOffset2; i9++) {
                            int lineStart = staticLayout.getLineStart(i9);
                            int lineEnd = staticLayout.getLineEnd(i9);
                            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(staticLayout.getText().charAt(lineStart)))) {
                                if (i9 == lineForOffset && iMax > lineStart) {
                                    lineLeft = staticLayout.getPrimaryHorizontal(iMax);
                                } else {
                                    lineLeft = staticLayout.getLineLeft(i9);
                                }
                                if (i9 == lineForOffset2 && iMin < lineEnd) {
                                    lineRight = staticLayout.getPrimaryHorizontal(iMin);
                                } else {
                                    lineRight = staticLayout.getLineRight(i9);
                                }
                                addRect(Math.min(lineLeft, lineRight), staticLayout.getLineTop(i9), Math.max(lineLeft, lineRight), staticLayout.getLineBottom(i9));
                            }
                        }
                    }
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.quotesToExpand.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i7++;
            arrayList2 = arrayList;
            i5 = i2;
            i6 = 0;
        }
        if (this.rectangles.size() > 0) {
            Rect rect = (Rect) this.rectangles.get(0);
            Rect rect2 = (Rect) zziq.m(1, this.rectangles);
            rect.first = true;
            rect.top -= AndroidUtilities.dp(0.66f);
            rect2.last = true;
            rect2.bottom += AndroidUtilities.dp(0.66f);
        }
    }
}
