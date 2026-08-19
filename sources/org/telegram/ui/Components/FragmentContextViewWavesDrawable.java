package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class FragmentContextViewWavesDrawable {
    private float amplitude;
    private float amplitude2;
    private float animateAmplitudeDiff;
    private float animateAmplitudeDiff2;
    private float animateToAmplitude;
    WeavingState currentState;
    private long lastUpdateTime;
    WeavingState pausedState;
    WeavingState previousState;
    WeavingState[] states = new WeavingState[4];
    float progressToState = 1.0f;
    ArrayList parents = new ArrayList();
    Paint paint = new Paint(1);
    Path path = new Path();

    public FragmentContextViewWavesDrawable() {
        for (int i = 0; i < 4; i++) {
            this.states[i] = new WeavingState(i);
        }
    }

    public void draw(float f, float f2, float f3, float f4, Canvas canvas, FragmentContextView fragmentContextView, float f5) {
        long j;
        long j2;
        WeavingState weavingState;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        checkColors();
        boolean z = fragmentContextView != null && this.parents.size() > 0;
        if (f2 > f4) {
            return;
        }
        WeavingState weavingState2 = this.currentState;
        boolean z2 = (weavingState2 == null || this.previousState == null || ((weavingState2.currentState != 1 || this.previousState.currentState != 0) && (this.previousState.currentState != 1 || this.currentState.currentState != 0))) ? false : true;
        if (z) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            j = jElapsedRealtime - this.lastUpdateTime;
            this.lastUpdateTime = jElapsedRealtime;
            if (j > 20) {
                j = 17;
            }
            if (j < 3) {
                j2 = j;
                z = false;
            }
            if (z) {
                f8 = this.animateToAmplitude;
                f9 = this.amplitude;
                if (f8 != f9) {
                    f15 = this.animateAmplitudeDiff;
                    f16 = f9 + (j2 * f15);
                    this.amplitude = f16;
                    if (f15 > 0.0f) {
                        if (f16 > f8) {
                            this.amplitude = f8;
                        }
                    } else if (f16 < f8) {
                        this.amplitude = f8;
                    }
                    fragmentContextView.invalidate();
                }
                f10 = this.animateToAmplitude;
                f11 = this.amplitude2;
                if (f10 != f11) {
                    f13 = this.animateAmplitudeDiff2;
                    f14 = f11 + (j2 * f13);
                    this.amplitude2 = f14;
                    if (f13 > 0.0f) {
                        if (f14 > f10) {
                            this.amplitude2 = f10;
                        }
                    } else if (f14 < f10) {
                        this.amplitude2 = f10;
                    }
                    fragmentContextView.invalidate();
                }
                if (this.previousState != null) {
                    f12 = this.progressToState + (j2 / 250.0f);
                    this.progressToState = f12;
                    if (f12 > 1.0f) {
                        this.progressToState = 1.0f;
                        this.previousState = null;
                    }
                    fragmentContextView.invalidate();
                }
            }
            for (int i = 0; i < 2; i++) {
                if (i == 0 || this.previousState != null) {
                    if (i == 0) {
                        f7 = 1.0f - this.progressToState;
                        this.previousState.setToPaint(this.paint);
                    } else {
                        weavingState = this.currentState;
                        if (weavingState == null) {
                            return;
                        }
                        if (this.previousState != null) {
                            f6 = this.progressToState;
                        } else {
                            f6 = 1.0f;
                        }
                        if (z) {
                            weavingState.update((int) (f4 - f2), (int) (f3 - f), j2, this.amplitude);
                        }
                        this.currentState.setToPaint(this.paint);
                        f7 = f6;
                    }
                    if ((i == 1 || !z2) && i == 1) {
                        this.paint.setAlpha((int) (255.0f * f7));
                    } else {
                        this.paint.setAlpha(255);
                    }
                    if (i != 1 && z2) {
                        this.path.rewind();
                        this.path.addCircle(f3 - AndroidUtilities.dp(18.0f), f2 + ((f4 - f2) / 2.0f), (f3 - f) * 1.1f * f7, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(this.path);
                        canvas.drawRoundRect(f, f2, f3, f4, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.paint);
                        canvas.restore();
                    } else {
                        canvas.drawRoundRect(f, f2, f3, f4, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.paint);
                    }
                }
            }
        }
        j = 0;
        j2 = j;
        if (z) {
            f8 = this.animateToAmplitude;
            f9 = this.amplitude;
            if (f8 != f9) {
                f15 = this.animateAmplitudeDiff;
                f16 = f9 + (j2 * f15);
                this.amplitude = f16;
                if (f15 > 0.0f) {
                    if (f16 > f8) {
                        this.amplitude = f8;
                    }
                } else if (f16 < f8) {
                    this.amplitude = f8;
                }
                fragmentContextView.invalidate();
            }
            f10 = this.animateToAmplitude;
            f11 = this.amplitude2;
            if (f10 != f11) {
                f13 = this.animateAmplitudeDiff2;
                f14 = f11 + (j2 * f13);
                this.amplitude2 = f14;
                if (f13 > 0.0f) {
                    if (f14 > f10) {
                        this.amplitude2 = f10;
                    }
                } else if (f14 < f10) {
                    this.amplitude2 = f10;
                }
                fragmentContextView.invalidate();
            }
            if (this.previousState != null) {
                f12 = this.progressToState + (j2 / 250.0f);
                this.progressToState = f12;
                if (f12 > 1.0f) {
                    this.progressToState = 1.0f;
                    this.previousState = null;
                }
                fragmentContextView.invalidate();
            }
        }
        while (i < 2) {
            if (i == 0) {
                if (i == 0) {
                    f7 = 1.0f - this.progressToState;
                    this.previousState.setToPaint(this.paint);
                } else {
                    weavingState = this.currentState;
                    if (weavingState == null) {
                        return;
                    }
                    if (this.previousState != null) {
                        f6 = this.progressToState;
                    } else {
                        f6 = 1.0f;
                    }
                    if (z) {
                        weavingState.update((int) (f4 - f2), (int) (f3 - f), j2, this.amplitude);
                    }
                    this.currentState.setToPaint(this.paint);
                    f7 = f6;
                }
                if (i == 1) {
                    this.paint.setAlpha((int) (255.0f * f7));
                } else {
                    this.paint.setAlpha((int) (255.0f * f7));
                }
                if (i != 1) {
                    canvas.drawRoundRect(f, f2, f3, f4, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.paint);
                } else {
                    canvas.drawRoundRect(f, f2, f3, f4, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.paint);
                }
            } else {
                if (i == 0) {
                    f7 = 1.0f - this.progressToState;
                    this.previousState.setToPaint(this.paint);
                } else {
                    weavingState = this.currentState;
                    if (weavingState == null) {
                        return;
                    }
                    if (this.previousState != null) {
                        f6 = this.progressToState;
                    } else {
                        f6 = 1.0f;
                    }
                    if (z) {
                        weavingState.update((int) (f4 - f2), (int) (f3 - f), j2, this.amplitude);
                    }
                    this.currentState.setToPaint(this.paint);
                    f7 = f6;
                }
                if (i == 1) {
                    this.paint.setAlpha((int) (255.0f * f7));
                } else {
                    this.paint.setAlpha((int) (255.0f * f7));
                }
                if (i != 1) {
                    canvas.drawRoundRect(f, f2, f3, f4, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.paint);
                } else {
                    canvas.drawRoundRect(f, f2, f3, f4, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.paint);
                }
            }
        }
    }

    private void checkColors() {
        int i = 0;
        while (true) {
            WeavingState[] weavingStateArr = this.states;
            if (i >= weavingStateArr.length) {
                return;
            }
            weavingStateArr[i].checkColor();
            i++;
        }
    }

    private void setState(int i, boolean z) {
        WeavingState weavingState = this.currentState;
        if (weavingState == null || weavingState.currentState != i) {
            if (VoIPService.getSharedInstance() == null && this.currentState == null) {
                this.currentState = this.pausedState;
                return;
            }
            WeavingState weavingState2 = z ? this.currentState : null;
            this.previousState = weavingState2;
            this.currentState = this.states[i];
            if (weavingState2 != null) {
                this.progressToState = 0.0f;
            } else {
                this.progressToState = 1.0f;
            }
        }
    }

    public void setAmplitude(float f) {
        this.animateToAmplitude = f;
        float f2 = f - this.amplitude;
        this.animateAmplitudeDiff = f2 / 250.0f;
        this.animateAmplitudeDiff2 = f2 / 120.0f;
    }

    public void addParent(View view) {
        if (this.parents.contains(view)) {
            return;
        }
        this.parents.add(view);
    }

    public void removeParent(View view) {
        this.parents.remove(view);
        if (this.parents.isEmpty()) {
            this.pausedState = this.currentState;
            this.currentState = null;
            this.previousState = null;
        }
    }

    public void updateState(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                setState(2, z);
                return;
            }
            ChatObject.Call call = sharedInstance.groupCall;
            if (call != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) || sharedInstance.groupCall.call.rtmp_stream) {
                    sharedInstance.setMicMute(true, false, false);
                    setState(3, z);
                    return;
                } else {
                    setState(sharedInstance.isMicMute() ? 1 : 0, z);
                    return;
                }
            }
            setState(sharedInstance.isMicMute() ? 1 : 0, z);
        }
    }

    public static class WeavingState {
        int color1;
        int color2;
        int color3;
        private final int currentState;
        private float duration;
        public Shader shader;
        private float startX;
        private float startY;
        private float time;
        private float targetX = -1.0f;
        private float targetY = -1.0f;
        private final Matrix matrix = new Matrix();
        int greenKey1 = Theme.key_voipgroup_topPanelGreen1;
        int greenKey2 = Theme.key_voipgroup_topPanelGreen2;
        int blueKey1 = Theme.key_voipgroup_topPanelBlue1;
        int blueKey2 = Theme.key_voipgroup_topPanelBlue2;
        int mutedByAdmin = Theme.key_voipgroup_mutedByAdminGradient;
        int mutedByAdmin2 = Theme.key_voipgroup_mutedByAdminGradient2;
        int mutedByAdmin3 = Theme.key_voipgroup_mutedByAdminGradient3;

        public WeavingState(int i) {
            this.currentState = i;
            createGradients();
        }

        private void createGradients() {
            int i = this.currentState;
            if (i == 0) {
                int color = Theme.getColor(this.greenKey1);
                this.color1 = color;
                int color2 = Theme.getColor(this.greenKey2);
                this.color2 = color2;
                this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color, color2}, (float[]) null, Shader.TileMode.CLAMP);
                return;
            }
            if (i == 1) {
                int color3 = Theme.getColor(this.blueKey1);
                this.color1 = color3;
                int color4 = Theme.getColor(this.blueKey2);
                this.color2 = color4;
                this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color3, color4}, (float[]) null, Shader.TileMode.CLAMP);
                return;
            }
            if (i == 3) {
                int color5 = Theme.getColor(this.mutedByAdmin);
                this.color1 = color5;
                int color6 = Theme.getColor(this.mutedByAdmin3);
                this.color3 = color6;
                int color7 = Theme.getColor(this.mutedByAdmin2);
                this.color2 = color7;
                this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color5, color6, color7}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            }
        }

        public void update(int i, int i2, long j, float f) {
            if (this.currentState == 2) {
                return;
            }
            float f2 = this.duration;
            if (f2 == 0.0f || this.time >= f2) {
                this.duration = Utilities.random.nextInt(700) + 500;
                this.time = 0.0f;
                if (this.targetX == -1.0f) {
                    int i3 = this.currentState;
                    if (i3 == 3) {
                        this.targetX = ((Utilities.random.nextInt(100) * 0.05f) / 100.0f) - 0.3f;
                        this.targetY = ((Utilities.random.nextInt(100) * 0.05f) / 100.0f) + 0.7f;
                    } else if (i3 == 0) {
                        this.targetX = ((Utilities.random.nextInt(100) * 0.2f) / 100.0f) - 0.3f;
                        this.targetY = ((Utilities.random.nextInt(100) * 0.3f) / 100.0f) + 0.7f;
                    } else {
                        this.targetX = ((Utilities.random.nextInt(100) / 100.0f) * 0.2f) + 1.1f;
                        this.targetY = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                    }
                }
                this.startX = this.targetX;
                this.startY = this.targetY;
                int i4 = this.currentState;
                if (i4 == 3) {
                    this.targetX = ((Utilities.random.nextInt(100) * 0.05f) / 100.0f) - 0.3f;
                    this.targetY = ((Utilities.random.nextInt(100) * 0.05f) / 100.0f) + 0.7f;
                } else if (i4 == 0) {
                    this.targetX = ((Utilities.random.nextInt(100) * 0.2f) / 100.0f) - 0.3f;
                    this.targetY = ((Utilities.random.nextInt(100) * 0.3f) / 100.0f) + 0.7f;
                } else {
                    this.targetX = ((Utilities.random.nextInt(100) / 100.0f) * 0.2f) + 1.1f;
                    this.targetY = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                }
            }
            float f3 = j;
            float f4 = this.time + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f3) + (f3 * BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * f);
            this.time = f4;
            float f5 = this.duration;
            if (f4 > f5) {
                this.time = f5;
            }
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f5);
            float f6 = i2;
            float f7 = this.startX;
            float f8 = ((f7 + ((this.targetX - f7) * interpolation)) * f6) - 200.0f;
            float f9 = this.startY;
            float f10 = (i * (f9 + ((this.targetY - f9) * interpolation))) - 200.0f;
            float f11 = f6 / 400.0f;
            int i5 = this.currentState;
            float f12 = f11 * ((i5 == 0 || i5 == 3) ? 3.0f : 1.5f);
            this.matrix.reset();
            this.matrix.postTranslate(f8, f10);
            this.matrix.postScale(f12, f12, f8 + 200.0f, f10 + 200.0f);
            this.shader.setLocalMatrix(this.matrix);
        }

        public void checkColor() {
            int i = this.currentState;
            if (i == 0) {
                if (this.color1 == Theme.getColor(this.greenKey1) && this.color2 == Theme.getColor(this.greenKey2)) {
                    return;
                }
                createGradients();
                return;
            }
            if (i == 1) {
                if (this.color1 == Theme.getColor(this.blueKey1) && this.color2 == Theme.getColor(this.blueKey2)) {
                    return;
                }
                createGradients();
                return;
            }
            if (i == 3) {
                if (this.color1 == Theme.getColor(this.mutedByAdmin) && this.color2 == Theme.getColor(this.mutedByAdmin2)) {
                    return;
                }
                createGradients();
            }
        }

        public void setToPaint(Paint paint) {
            int i = this.currentState;
            if (i == 0 || i == 1 || i == 3) {
                if (!LiteMode.isEnabled(512)) {
                    paint.setShader(null);
                    if (this.currentState == 3) {
                        paint.setColor(ColorUtils.blendARGB(ColorUtils.blendARGB(this.color1, this.color2, 0.5f), this.color3, 0.5f));
                        return;
                    } else {
                        paint.setColor(ColorUtils.blendARGB(this.color1, this.color2, 0.5f));
                        return;
                    }
                }
                paint.setShader(this.shader);
                return;
            }
            paint.setShader(null);
            paint.setColor(Theme.getColor(Theme.key_voipgroup_topPanelGray));
        }
    }
}
