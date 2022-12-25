package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public class PathAnimator {
    private float durationScale;
    private float scale;
    private float f1090tx;
    private float f1091ty;
    private Path path = new Path();
    private float pathTime = -1.0f;
    private ArrayList<KeyFrame> keyFrames = new ArrayList<>();

    public static class KeyFrame {
        public ArrayList<Object> commands;
        public float time;

        private KeyFrame() {
            this.commands = new ArrayList<>();
        }
    }

    public static class MoveTo {
        public float f1100x;
        public float f1101y;

        private MoveTo() {
        }
    }

    public static class LineTo {
        public float f1098x;
        public float f1099y;

        private LineTo() {
        }
    }

    public static class CurveTo {
        public float f1092x;
        public float f1093x1;
        public float f1094x2;
        public float f1095y;
        public float f1096y1;
        public float f1097y2;

        private CurveTo() {
        }
    }

    public PathAnimator(float f, float f2, float f3, float f4) {
        this.scale = f;
        this.f1090tx = f2;
        this.f1091ty = f3;
        this.durationScale = f4;
    }

    public void addSvgKeyFrame(String str, float f) {
        if (str == null) {
            return;
        }
        try {
            KeyFrame keyFrame = new KeyFrame();
            keyFrame.time = f * this.durationScale;
            String[] split = str.split(" ");
            int i = 0;
            while (i < split.length) {
                char charAt = split[i].charAt(0);
                if (charAt == 'C') {
                    CurveTo curveTo = new CurveTo();
                    curveTo.f1093x1 = (Float.parseFloat(split[i + 1]) + this.f1090tx) * this.scale;
                    curveTo.f1096y1 = (Float.parseFloat(split[i + 2]) + this.f1091ty) * this.scale;
                    curveTo.f1094x2 = (Float.parseFloat(split[i + 3]) + this.f1090tx) * this.scale;
                    curveTo.f1097y2 = (Float.parseFloat(split[i + 4]) + this.f1091ty) * this.scale;
                    curveTo.f1092x = (Float.parseFloat(split[i + 5]) + this.f1090tx) * this.scale;
                    i += 6;
                    curveTo.f1095y = (Float.parseFloat(split[i]) + this.f1091ty) * this.scale;
                    keyFrame.commands.add(curveTo);
                } else if (charAt == 'L') {
                    LineTo lineTo = new LineTo();
                    lineTo.f1098x = (Float.parseFloat(split[i + 1]) + this.f1090tx) * this.scale;
                    i += 2;
                    lineTo.f1099y = (Float.parseFloat(split[i]) + this.f1091ty) * this.scale;
                    keyFrame.commands.add(lineTo);
                } else if (charAt == 'M') {
                    MoveTo moveTo = new MoveTo();
                    moveTo.f1100x = (Float.parseFloat(split[i + 1]) + this.f1090tx) * this.scale;
                    i += 2;
                    moveTo.f1101y = (Float.parseFloat(split[i]) + this.f1091ty) * this.scale;
                    keyFrame.commands.add(moveTo);
                }
                i++;
            }
            this.keyFrames.add(keyFrame);
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        float f2;
        if (this.pathTime != f) {
            this.pathTime = f;
            int size = this.keyFrames.size();
            KeyFrame keyFrame = null;
            KeyFrame keyFrame2 = null;
            for (int i = 0; i < size; i++) {
                KeyFrame keyFrame3 = this.keyFrames.get(i);
                if ((keyFrame2 == null || keyFrame2.time < keyFrame3.time) && keyFrame3.time <= f) {
                    keyFrame2 = keyFrame3;
                }
                if ((keyFrame == null || keyFrame.time > keyFrame3.time) && keyFrame3.time >= f) {
                    keyFrame = keyFrame3;
                }
            }
            if (keyFrame == keyFrame2) {
                keyFrame2 = null;
            }
            if (keyFrame2 != null && keyFrame == null) {
                keyFrame = keyFrame2;
                keyFrame2 = null;
            }
            if (keyFrame == null) {
                return;
            }
            if (keyFrame2 != null && keyFrame2.commands.size() != keyFrame.commands.size()) {
                return;
            }
            this.path.reset();
            int size2 = keyFrame.commands.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj = keyFrame2 != null ? keyFrame2.commands.get(i2) : null;
                Object obj2 = keyFrame.commands.get(i2);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (keyFrame2 != null) {
                    float f3 = keyFrame2.time;
                    f2 = (f - f3) / (keyFrame.time - f3);
                } else {
                    f2 = 1.0f;
                }
                if (obj2 instanceof MoveTo) {
                    MoveTo moveTo = (MoveTo) obj2;
                    MoveTo moveTo2 = (MoveTo) obj;
                    if (moveTo2 != null) {
                        Path path = this.path;
                        float f4 = moveTo2.f1100x;
                        float dpf2 = AndroidUtilities.dpf2(f4 + ((moveTo.f1100x - f4) * f2));
                        float f5 = moveTo2.f1101y;
                        path.moveTo(dpf2, AndroidUtilities.dpf2(f5 + ((moveTo.f1101y - f5) * f2)));
                    } else {
                        this.path.moveTo(AndroidUtilities.dpf2(moveTo.f1100x), AndroidUtilities.dpf2(moveTo.f1101y));
                    }
                } else if (obj2 instanceof LineTo) {
                    LineTo lineTo = (LineTo) obj2;
                    LineTo lineTo2 = (LineTo) obj;
                    if (lineTo2 != null) {
                        Path path2 = this.path;
                        float f6 = lineTo2.f1098x;
                        float dpf22 = AndroidUtilities.dpf2(f6 + ((lineTo.f1098x - f6) * f2));
                        float f7 = lineTo2.f1099y;
                        path2.lineTo(dpf22, AndroidUtilities.dpf2(f7 + ((lineTo.f1099y - f7) * f2)));
                    } else {
                        this.path.lineTo(AndroidUtilities.dpf2(lineTo.f1098x), AndroidUtilities.dpf2(lineTo.f1099y));
                    }
                } else if (obj2 instanceof CurveTo) {
                    CurveTo curveTo = (CurveTo) obj2;
                    CurveTo curveTo2 = (CurveTo) obj;
                    if (curveTo2 != null) {
                        Path path3 = this.path;
                        float f8 = curveTo2.f1093x1;
                        float dpf23 = AndroidUtilities.dpf2(f8 + ((curveTo.f1093x1 - f8) * f2));
                        float f9 = curveTo2.f1096y1;
                        float dpf24 = AndroidUtilities.dpf2(f9 + ((curveTo.f1096y1 - f9) * f2));
                        float f10 = curveTo2.f1094x2;
                        float dpf25 = AndroidUtilities.dpf2(f10 + ((curveTo.f1094x2 - f10) * f2));
                        float f11 = curveTo2.f1097y2;
                        float dpf26 = AndroidUtilities.dpf2(f11 + ((curveTo.f1097y2 - f11) * f2));
                        float f12 = curveTo2.f1092x;
                        float dpf27 = AndroidUtilities.dpf2(f12 + ((curveTo.f1092x - f12) * f2));
                        float f13 = curveTo2.f1095y;
                        path3.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(f13 + ((curveTo.f1095y - f13) * f2)));
                    } else {
                        this.path.cubicTo(AndroidUtilities.dpf2(curveTo.f1093x1), AndroidUtilities.dpf2(curveTo.f1096y1), AndroidUtilities.dpf2(curveTo.f1094x2), AndroidUtilities.dpf2(curveTo.f1097y2), AndroidUtilities.dpf2(curveTo.f1092x), AndroidUtilities.dpf2(curveTo.f1095y));
                    }
                }
            }
            this.path.close();
        }
        canvas.drawPath(this.path, paint);
    }
}
