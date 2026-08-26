package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class PathAnimator {
    public final Path path = new Path();
    public float pathTime = -1.0f;
    public final ArrayList keyFrames = new ArrayList();
    public final float scale = 0.293f;
    public final float tx = -26.0f;
    public final float ty = -28.0f;
    public final float durationScale = 1.0f;

    public final class CurveTo {
        public float x;
        public float x1;
        public float x2;
        public float y;
        public float y1;
        public float y2;
    }

    public final class KeyFrame {
        public final ArrayList commands = new ArrayList();
        public float time;
    }

    public final class LineTo {
        public float x;
        public float y;
    }

    public final class MoveTo {
        public float x;
        public float y;
    }

    public final void addSvgKeyFrame(String str, float f) {
        try {
            KeyFrame keyFrame = new KeyFrame();
            ArrayList arrayList = keyFrame.commands;
            keyFrame.time = f * this.durationScale;
            String[] strArrSplit = str.split(" ");
            int i = 0;
            while (i < strArrSplit.length) {
                char cCharAt = strArrSplit[i].charAt(0);
                float f2 = this.ty;
                float f3 = this.tx;
                float f4 = this.scale;
                if (cCharAt == 'C') {
                    CurveTo curveTo = new CurveTo();
                    curveTo.x1 = (Float.parseFloat(strArrSplit[i + 1]) + f3) * f4;
                    curveTo.y1 = (Float.parseFloat(strArrSplit[i + 2]) + f2) * f4;
                    curveTo.x2 = (Float.parseFloat(strArrSplit[i + 3]) + f3) * f4;
                    curveTo.y2 = (Float.parseFloat(strArrSplit[i + 4]) + f2) * f4;
                    curveTo.x = (Float.parseFloat(strArrSplit[i + 5]) + f3) * f4;
                    i += 6;
                    curveTo.y = (Float.parseFloat(strArrSplit[i]) + f2) * f4;
                    arrayList.add(curveTo);
                } else if (cCharAt == 'L') {
                    LineTo lineTo = new LineTo();
                    lineTo.x = (Float.parseFloat(strArrSplit[i + 1]) + f3) * f4;
                    i += 2;
                    lineTo.y = (Float.parseFloat(strArrSplit[i]) + f2) * f4;
                    arrayList.add(lineTo);
                } else if (cCharAt == 'M') {
                    MoveTo moveTo = new MoveTo();
                    moveTo.x = (Float.parseFloat(strArrSplit[i + 1]) + f3) * f4;
                    i += 2;
                    moveTo.y = (Float.parseFloat(strArrSplit[i]) + f2) * f4;
                    arrayList.add(moveTo);
                }
                i++;
            }
            this.keyFrames.add(keyFrame);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void draw(Canvas canvas, Paint paint, float f) {
        KeyFrame keyFrame;
        KeyFrame keyFrame2;
        float f2;
        float f3 = this.pathTime;
        Path path = this.path;
        if (f3 != f) {
            this.pathTime = f;
            ArrayList arrayList = this.keyFrames;
            int size = arrayList.size();
            KeyFrame keyFrame3 = null;
            KeyFrame keyFrame4 = null;
            for (int i = 0; i < size; i++) {
                KeyFrame keyFrame5 = (KeyFrame) arrayList.get(i);
                if ((keyFrame4 == null || keyFrame4.time < keyFrame5.time) && keyFrame5.time <= f) {
                    keyFrame4 = keyFrame5;
                }
                if ((keyFrame3 == null || keyFrame3.time > keyFrame5.time) && keyFrame5.time >= f) {
                    keyFrame3 = keyFrame5;
                }
            }
            if (keyFrame3 == keyFrame4) {
                keyFrame4 = null;
            }
            if (keyFrame4 == null || keyFrame3 != null) {
                keyFrame = keyFrame3;
                keyFrame2 = keyFrame4;
            } else {
                keyFrame = keyFrame4;
                keyFrame2 = null;
            }
            if (keyFrame == null) {
                return;
            }
            ArrayList arrayList2 = keyFrame.commands;
            if (keyFrame2 != null && keyFrame2.commands.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj = keyFrame2 != null ? keyFrame2.commands.get(i2) : null;
                Object obj2 = arrayList2.get(i2);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (keyFrame2 != null) {
                    float f4 = keyFrame2.time;
                    f2 = (f - f4) / (keyFrame.time - f4);
                } else {
                    f2 = 1.0f;
                }
                if (obj2 instanceof MoveTo) {
                    MoveTo moveTo = (MoveTo) obj2;
                    MoveTo moveTo2 = (MoveTo) obj;
                    if (moveTo2 != null) {
                        float f5 = moveTo2.x;
                        float fDpf2 = AndroidUtilities.dpf2(((moveTo.x - f5) * f2) + f5);
                        float f6 = moveTo2.y;
                        path.moveTo(fDpf2, AndroidUtilities.dpf2(((moveTo.y - f6) * f2) + f6));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(moveTo.x), AndroidUtilities.dpf2(moveTo.y));
                    }
                } else if (obj2 instanceof LineTo) {
                    LineTo lineTo = (LineTo) obj2;
                    LineTo lineTo2 = (LineTo) obj;
                    if (lineTo2 != null) {
                        float f7 = lineTo2.x;
                        float fDpf3 = AndroidUtilities.dpf2(((lineTo.x - f7) * f2) + f7);
                        float f8 = lineTo2.y;
                        path.lineTo(fDpf3, AndroidUtilities.dpf2(((lineTo.y - f8) * f2) + f8));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(lineTo.x), AndroidUtilities.dpf2(lineTo.y));
                    }
                } else if (obj2 instanceof CurveTo) {
                    CurveTo curveTo = (CurveTo) obj2;
                    CurveTo curveTo2 = (CurveTo) obj;
                    if (curveTo2 != null) {
                        float f9 = curveTo2.x1;
                        float fDpf4 = AndroidUtilities.dpf2(((curveTo.x1 - f9) * f2) + f9);
                        float f10 = curveTo2.y1;
                        float fDpf5 = AndroidUtilities.dpf2(((curveTo.y1 - f10) * f2) + f10);
                        float f11 = curveTo2.x2;
                        float fDpf6 = AndroidUtilities.dpf2(((curveTo.x2 - f11) * f2) + f11);
                        float f12 = curveTo2.y2;
                        float fDpf7 = AndroidUtilities.dpf2(((curveTo.y2 - f12) * f2) + f12);
                        float f13 = curveTo2.x;
                        float fDpf8 = AndroidUtilities.dpf2(((curveTo.x - f13) * f2) + f13);
                        float f14 = curveTo2.y;
                        path.cubicTo(fDpf4, fDpf5, fDpf6, fDpf7, fDpf8, AndroidUtilities.dpf2(((curveTo.y - f14) * f2) + f14));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(curveTo.x1), AndroidUtilities.dpf2(curveTo.y1), AndroidUtilities.dpf2(curveTo.x2), AndroidUtilities.dpf2(curveTo.y2), AndroidUtilities.dpf2(curveTo.x), AndroidUtilities.dpf2(curveTo.y));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
