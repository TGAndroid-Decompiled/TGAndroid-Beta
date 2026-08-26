package org.telegram.ui.Components.blur3.source;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.ui.Components.TranslateAlert2$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode;

public final class BlurredBackgroundSourceRenderNode implements BlurredBackgroundSource {
    public final BlurredBackgroundSource fallbackSource;
    public boolean inRecording;
    public boolean noClip;
    public Runnable onDrawablesRelativePositionChangeListener;
    public RecordingCanvas recordingCanvas;
    public RenderNodeWithHash renderNodeWithHash;
    public DownscaleScrollableNoiseSuppressor scrollableNoiseSuppressor;
    public int scrollableNoiseSuppressorIndex;
    public BlurredBackgroundSource underSource;
    public final ReferenceList drawables = new ReferenceList(true);
    public final RenderNode renderNode = TranslateAlert2$$ExternalSyntheticApiModelOutline0.m$2();

    public BlurredBackgroundSourceRenderNode(BlurredBackgroundSource blurredBackgroundSource) {
        this.fallbackSource = blurredBackgroundSource;
    }

    public final RecordingCanvas beginRecording(int i, int i2) {
        if (this.inRecording) {
            throw new IllegalStateException();
        }
        this.inRecording = true;
        this.renderNode.setPosition(0, 0, i, i2);
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording(i, i2);
        this.recordingCanvas = recordingCanvasBeginRecording;
        return recordingCanvasBeginRecording;
    }

    @Override
    public final BlurredBackgroundDrawable createDrawable() {
        BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode = new BlurredBackgroundDrawableRenderNode(this);
        this.drawables.add(blurredBackgroundDrawableRenderNode);
        return blurredBackgroundDrawableRenderNode;
    }

    @Override
    public final void dispatchOnDrawablesRelativePositionChange() {
        Runnable runnable = this.onDrawablesRelativePositionChangeListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void draw(Canvas canvas, float f, float f2, float f3, float f4) {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        int i;
        DownscaleScrollableNoiseSuppressor.SourcePart sourcePart;
        Rect rect;
        if (!canvas.isHardwareAccelerated()) {
            BlurredBackgroundSource blurredBackgroundSource = this.fallbackSource;
            if (blurredBackgroundSource != null) {
                blurredBackgroundSource.draw(canvas, f, f2, f3, f4);
                return;
            }
            return;
        }
        if (this.inRecording) {
            throw new IllegalStateException();
        }
        BlurredBackgroundSource blurredBackgroundSource2 = this.underSource;
        if (blurredBackgroundSource2 != null) {
            blurredBackgroundSource2.draw(canvas, f, f2, f3, f4);
        }
        canvas.save();
        if (!this.noClip) {
            canvas.clipRect(f, f2, f3, f4);
        }
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableNoiseSuppressor) == null) {
            canvas.drawRenderNode(this.renderNode);
        } else {
            int i2 = this.scrollableNoiseSuppressorIndex;
            boolean z = downscaleScrollableNoiseSuppressor.isLiquidGlassEnabled;
            if (z || !downscaleScrollableNoiseSuppressor.simpleMode) {
                i = 1;
                if (i2 == -2) {
                    i = 1 ^ (z ? 1 : 0);
                } else if (i2 == -4) {
                    i = 0;
                } else if (i2 == -3) {
                }
                for (int i3 = 0; i3 < downscaleScrollableNoiseSuppressor.rectRenderNodesCount; i3++) {
                    sourcePart = (DownscaleScrollableNoiseSuppressor.SourcePart) downscaleScrollableNoiseSuppressor.rectRenderNodes.get(i3);
                    rect = sourcePart.position;
                    if (canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                        canvas.save();
                        Rect rect2 = sourcePart.position;
                        canvas.translate(rect2.left, rect2.top);
                        canvas.drawRenderNode(downscaleScrollableNoiseSuppressor.getRenderNode(i, i3));
                        canvas.restore();
                    }
                }
            } else {
                i = 0;
                while (i3 < downscaleScrollableNoiseSuppressor.rectRenderNodesCount) {
                    sourcePart = (DownscaleScrollableNoiseSuppressor.SourcePart) downscaleScrollableNoiseSuppressor.rectRenderNodes.get(i3);
                    rect = sourcePart.position;
                    if (canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                        canvas.save();
                        Rect rect3 = sourcePart.position;
                        canvas.translate(rect3.left, rect3.top);
                        canvas.drawRenderNode(downscaleScrollableNoiseSuppressor.getRenderNode(i, i3));
                        canvas.restore();
                    }
                }
            }
        }
        canvas.restore();
    }

    public final void endRecording() {
        if (!this.inRecording) {
            throw new IllegalStateException();
        }
        this.renderNode.endRecording();
        this.inRecording = false;
        this.recordingCanvas = null;
    }

    public final int getVisiblePositions(List list, int i, int i2) {
        RectF rectF;
        int i3 = 0;
        for (BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode : this.drawables) {
            if (blurredBackgroundDrawableRenderNode.renderNode.hasDisplayList() && blurredBackgroundDrawableRenderNode.alpha > 0) {
                BlurredBackgroundDrawable.Props props = blurredBackgroundDrawableRenderNode.boundProps;
                if (!props.boundsWithPadding.isEmpty()) {
                    if (i < list.size()) {
                        rectF = (RectF) list.get(i);
                    } else {
                        rectF = new RectF();
                        list.add(rectF);
                    }
                    rectF.set(props.boundsWithPadding);
                    rectF.offset(blurredBackgroundDrawableRenderNode.sourceOffsetX, blurredBackgroundDrawableRenderNode.sourceOffsetY);
                    float f = -i2;
                    rectF.inset(f, f);
                    i++;
                    i3++;
                }
            }
        }
        return i3;
    }

    public final void invalidateDisplayListForDrawables() {
        Iterator it = this.drawables.iterator();
        while (it.hasNext()) {
            ((BlurredBackgroundDrawableRenderNode) it.next()).renderNodeInvalidated = true;
        }
    }

    public final boolean needUpdateDisplayList(int i, int i2) {
        return (this.renderNode.hasDisplayList() && this.renderNode.getWidth() == i && this.renderNode.getHeight() == i2) ? false : true;
    }

    public final void setSize(int i, int i2) {
        this.renderNode.setPosition(0, 0, i, i2);
    }

    public final void setupRenderer(RenderNodeWithHash.Renderer renderer) {
        if (this.renderNodeWithHash == null) {
            this.renderNodeWithHash = new RenderNodeWithHash(this.renderNode, renderer);
        }
    }
}
