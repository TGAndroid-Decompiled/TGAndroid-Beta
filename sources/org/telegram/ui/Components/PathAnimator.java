package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public class PathAnimator {
    private float durationScale;
    private float scale;
    private float tx;
    private float ty;
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
        public float x;
        public float y;

        private MoveTo() {
        }
    }

    public static class LineTo {
        public float x;
        public float y;

        private LineTo() {
        }
    }

    public static class CurveTo {
        public float x;
        public float x1;
        public float x2;
        public float y;
        public float y1;
        public float y2;

        private CurveTo() {
        }
    }

    public PathAnimator(float f, float f2, float f3, float f4) {
        this.scale = f;
        this.tx = f2;
        this.ty = f3;
        this.durationScale = f4;
    }

    public void addSvgKeyFrame(String str, float f) {
        if (str != null) {
            try {
                KeyFrame keyFrame = new KeyFrame();
                keyFrame.time = f * this.durationScale;
                String[] split = str.split(" ");
                int i = 0;
                while (i < split.length) {
                    char charAt = split[i].charAt(0);
                    if (charAt == 'C') {
                        CurveTo curveTo = new CurveTo();
                        curveTo.x1 = (Float.parseFloat(split[i + 1]) + this.tx) * this.scale;
                        curveTo.y1 = (Float.parseFloat(split[i + 2]) + this.ty) * this.scale;
                        curveTo.x2 = (Float.parseFloat(split[i + 3]) + this.tx) * this.scale;
                        curveTo.y2 = (Float.parseFloat(split[i + 4]) + this.ty) * this.scale;
                        curveTo.x = (Float.parseFloat(split[i + 5]) + this.tx) * this.scale;
                        i += 6;
                        curveTo.y = (Float.parseFloat(split[i]) + this.ty) * this.scale;
                        keyFrame.commands.add(curveTo);
                    } else if (charAt == 'L') {
                        LineTo lineTo = new LineTo();
                        lineTo.x = (Float.parseFloat(split[i + 1]) + this.tx) * this.scale;
                        i += 2;
                        lineTo.y = (Float.parseFloat(split[i]) + this.ty) * this.scale;
                        keyFrame.commands.add(lineTo);
                    } else if (charAt == 'M') {
                        MoveTo moveTo = new MoveTo();
                        moveTo.x = (Float.parseFloat(split[i + 1]) + this.tx) * this.scale;
                        i += 2;
                        moveTo.y = (Float.parseFloat(split[i]) + this.ty) * this.scale;
                        keyFrame.commands.add(moveTo);
                    }
                    i++;
                }
                this.keyFrames.add(keyFrame);
            } catch (Exception e) {
                FileLog.e(e);
            }
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
            if (keyFrame2 == null || keyFrame2.commands.size() == keyFrame.commands.size()) {
                this.path.reset();
                int size2 = keyFrame.commands.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj = keyFrame2 != null ? keyFrame2.commands.get(i2) : null;
                    Object obj2 = keyFrame.commands.get(i2);
                    if (obj == null || obj.getClass() == obj2.getClass()) {
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
                                float f4 = moveTo2.x;
                                float dpf2 = AndroidUtilities.dpf2(f4 + ((moveTo.x - f4) * f2));
                                float f5 = moveTo2.y;
                                path.moveTo(dpf2, AndroidUtilities.dpf2(f5 + ((moveTo.y - f5) * f2)));
                            } else {
                                this.path.moveTo(AndroidUtilities.dpf2(moveTo.x), AndroidUtilities.dpf2(moveTo.y));
                            }
                        } else if (obj2 instanceof LineTo) {
                            LineTo lineTo = (LineTo) obj2;
                            LineTo lineTo2 = (LineTo) obj;
                            if (lineTo2 != null) {
                                Path path2 = this.path;
                                float f6 = lineTo2.x;
                                float dpf22 = AndroidUtilities.dpf2(f6 + ((lineTo.x - f6) * f2));
                                float f7 = lineTo2.y;
                                path2.lineTo(dpf22, AndroidUtilities.dpf2(f7 + ((lineTo.y - f7) * f2)));
                            } else {
                                this.path.lineTo(AndroidUtilities.dpf2(lineTo.x), AndroidUtilities.dpf2(lineTo.y));
                            }
                        } else if (obj2 instanceof CurveTo) {
                            CurveTo curveTo = (CurveTo) obj2;
                            CurveTo curveTo2 = (CurveTo) obj;
                            if (curveTo2 != null) {
                                Path path3 = this.path;
                                float f8 = curveTo2.x1;
                                float dpf23 = AndroidUtilities.dpf2(f8 + ((curveTo.x1 - f8) * f2));
                                float f9 = curveTo2.y1;
                                float dpf24 = AndroidUtilities.dpf2(f9 + ((curveTo.y1 - f9) * f2));
                                float f10 = curveTo2.x2;
                                float dpf25 = AndroidUtilities.dpf2(f10 + ((curveTo.x2 - f10) * f2));
                                float f11 = curveTo2.y2;
                                float dpf26 = AndroidUtilities.dpf2(f11 + ((curveTo.y2 - f11) * f2));
                                float f12 = curveTo2.x;
                                float dpf27 = AndroidUtilities.dpf2(f12 + ((curveTo.x - f12) * f2));
                                float f13 = curveTo2.y;
                                path3.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(f13 + ((curveTo.y - f13) * f2)));
                            } else {
                                this.path.cubicTo(AndroidUtilities.dpf2(curveTo.x1), AndroidUtilities.dpf2(curveTo.y1), AndroidUtilities.dpf2(curveTo.x2), AndroidUtilities.dpf2(curveTo.y2), AndroidUtilities.dpf2(curveTo.x), AndroidUtilities.dpf2(curveTo.y));
                            }
                        }
                    } else {
                        return;
                    }
                }
                this.path.close();
            } else {
                return;
            }
        }
        canvas.drawPath(this.path, paint);
    }
}
