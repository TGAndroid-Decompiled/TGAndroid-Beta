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
    private float f1059tx;
    private float f1060ty;
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
        public float f1069x;
        public float f1070y;

        private MoveTo() {
        }
    }

    public static class LineTo {
        public float f1067x;
        public float f1068y;

        private LineTo() {
        }
    }

    public static class CurveTo {
        public float f1061x;
        public float f1062x1;
        public float f1063x2;
        public float f1064y;
        public float f1065y1;
        public float f1066y2;

        private CurveTo() {
        }
    }

    public PathAnimator(float f, float f2, float f3, float f4) {
        this.scale = f;
        this.f1059tx = f2;
        this.f1060ty = f3;
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
                        curveTo.f1062x1 = (Float.parseFloat(split[i + 1]) + this.f1059tx) * this.scale;
                        curveTo.f1065y1 = (Float.parseFloat(split[i + 2]) + this.f1060ty) * this.scale;
                        curveTo.f1063x2 = (Float.parseFloat(split[i + 3]) + this.f1059tx) * this.scale;
                        curveTo.f1066y2 = (Float.parseFloat(split[i + 4]) + this.f1060ty) * this.scale;
                        curveTo.f1061x = (Float.parseFloat(split[i + 5]) + this.f1059tx) * this.scale;
                        i += 6;
                        curveTo.f1064y = (Float.parseFloat(split[i]) + this.f1060ty) * this.scale;
                        keyFrame.commands.add(curveTo);
                    } else if (charAt == 'L') {
                        LineTo lineTo = new LineTo();
                        lineTo.f1067x = (Float.parseFloat(split[i + 1]) + this.f1059tx) * this.scale;
                        i += 2;
                        lineTo.f1068y = (Float.parseFloat(split[i]) + this.f1060ty) * this.scale;
                        keyFrame.commands.add(lineTo);
                    } else if (charAt == 'M') {
                        MoveTo moveTo = new MoveTo();
                        moveTo.f1069x = (Float.parseFloat(split[i + 1]) + this.f1059tx) * this.scale;
                        i += 2;
                        moveTo.f1070y = (Float.parseFloat(split[i]) + this.f1060ty) * this.scale;
                        keyFrame.commands.add(moveTo);
                    }
                    i++;
                }
                this.keyFrames.add(keyFrame);
            } catch (Exception e) {
                FileLog.m30e(e);
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
                                float f4 = moveTo2.f1069x;
                                float dpf2 = AndroidUtilities.dpf2(f4 + ((moveTo.f1069x - f4) * f2));
                                float f5 = moveTo2.f1070y;
                                path.moveTo(dpf2, AndroidUtilities.dpf2(f5 + ((moveTo.f1070y - f5) * f2)));
                            } else {
                                this.path.moveTo(AndroidUtilities.dpf2(moveTo.f1069x), AndroidUtilities.dpf2(moveTo.f1070y));
                            }
                        } else if (obj2 instanceof LineTo) {
                            LineTo lineTo = (LineTo) obj2;
                            LineTo lineTo2 = (LineTo) obj;
                            if (lineTo2 != null) {
                                Path path2 = this.path;
                                float f6 = lineTo2.f1067x;
                                float dpf22 = AndroidUtilities.dpf2(f6 + ((lineTo.f1067x - f6) * f2));
                                float f7 = lineTo2.f1068y;
                                path2.lineTo(dpf22, AndroidUtilities.dpf2(f7 + ((lineTo.f1068y - f7) * f2)));
                            } else {
                                this.path.lineTo(AndroidUtilities.dpf2(lineTo.f1067x), AndroidUtilities.dpf2(lineTo.f1068y));
                            }
                        } else if (obj2 instanceof CurveTo) {
                            CurveTo curveTo = (CurveTo) obj2;
                            CurveTo curveTo2 = (CurveTo) obj;
                            if (curveTo2 != null) {
                                Path path3 = this.path;
                                float f8 = curveTo2.f1062x1;
                                float dpf23 = AndroidUtilities.dpf2(f8 + ((curveTo.f1062x1 - f8) * f2));
                                float f9 = curveTo2.f1065y1;
                                float dpf24 = AndroidUtilities.dpf2(f9 + ((curveTo.f1065y1 - f9) * f2));
                                float f10 = curveTo2.f1063x2;
                                float dpf25 = AndroidUtilities.dpf2(f10 + ((curveTo.f1063x2 - f10) * f2));
                                float f11 = curveTo2.f1066y2;
                                float dpf26 = AndroidUtilities.dpf2(f11 + ((curveTo.f1066y2 - f11) * f2));
                                float f12 = curveTo2.f1061x;
                                float dpf27 = AndroidUtilities.dpf2(f12 + ((curveTo.f1061x - f12) * f2));
                                float f13 = curveTo2.f1064y;
                                path3.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(f13 + ((curveTo.f1064y - f13) * f2)));
                            } else {
                                this.path.cubicTo(AndroidUtilities.dpf2(curveTo.f1062x1), AndroidUtilities.dpf2(curveTo.f1065y1), AndroidUtilities.dpf2(curveTo.f1063x2), AndroidUtilities.dpf2(curveTo.f1066y2), AndroidUtilities.dpf2(curveTo.f1061x), AndroidUtilities.dpf2(curveTo.f1064y));
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
